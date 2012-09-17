// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-35.cod
// Module version  : 2.7.3204
// Class ID        : 15
// ########################################################


package com.whatsapp.client.org.bouncycastle.util.encoders;


abstract public final class UrlBase64Encoder extends com.whatsapp.client.org.bouncycastle.util.encoders.Base64Encoder

{


	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.org.bouncycastle.util.encoders.UrlBase64Encoder ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial com.whatsapp.client.org.bouncycastle.util.encoders.Base64Encoder.<init> // pc=1
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	arraylength 
	bipush 2
	isub 
	bipush 45
	bastore 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	arraylength 
	iconst_1 
	isub 
	bipush 95
	bastore 
	aload_0 
	bipush 46
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	invokenonvirtual com.whatsapp.client.org.bouncycastle.util.encoders.Base64Encoder.initialiseDecodingTable // pc=1
	return 
	}

}
