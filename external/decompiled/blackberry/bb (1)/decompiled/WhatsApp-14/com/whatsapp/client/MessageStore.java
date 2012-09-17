// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-23.cod
// Module version  : 2.7.3204
// Class ID        : 10
// ########################################################


package com.whatsapp.client;


interface public class MessageStore extends Object

{


	// @@@@@@@@@@@@@ Virtual routines 

abstract public boolean isPersistable( com.whatsapp.client.MessageStore ); // address: 0
	{
	halt 
	}


abstract public boolean isPersistenceEnabled( com.whatsapp.client.MessageStore ); // address: 0
	{
	halt 
	}


abstract public setPersistentFilesystem( com.whatsapp.client.MessageStore, java.lang.String ); // address: 0
	{
	halt 
	}


abstract public deleteEntireStorage( com.whatsapp.client.MessageStore ); // address: 0
	{
	halt 
	}


abstract public java.lang.String getDefaultRoot( com.whatsapp.client.MessageStore ); // address: 0
	{
	halt 
	}


abstract public java.lang.String getSetupError( com.whatsapp.client.MessageStore ); // address: 0
	{
	halt 
	}


abstract public java.util.Hashtable getChats( com.whatsapp.client.MessageStore ); // address: 0
	{
	halt 
	}


abstract public setSystemFolder( com.whatsapp.client.MessageStore, net.rim.blackberry.api.messagelist.ApplicationMessageFolder ); // address: 0
	{
	halt 
	}


abstract public removeFromSystemFolder( com.whatsapp.client.MessageStore, net.rim.blackberry.api.messagelist.ApplicationMessage ); // address: 0
	{
	halt 
	}


abstract public net.rim.device.api.collection.ReadableList getApplicationMessageList( com.whatsapp.client.MessageStore ); // address: 0
	{
	halt 
	}


abstract public setDirty( com.whatsapp.client.MessageStore, java.lang.String, boolean ); // address: 0
	{
	halt 
	}


abstract public tickle( com.whatsapp.client.MessageStore, java.lang.String ); // address: 0
	{
	halt 
	}


abstract public int countDirty( com.whatsapp.client.MessageStore ); // address: 0
	{
	halt 
	}


abstract public java.util.Vector getMessages( com.whatsapp.client.MessageStore, java.lang.String, java.lang.String ); // address: 0
	{
	halt 
	}


abstract public java.util.Vector getMessagesBefore( com.whatsapp.client.MessageStore, java.lang.String, module:WhatsApp-17.class#15, int ); // address: 0
	{
	halt 
	}


abstract public int getMMSMessagesCount( com.whatsapp.client.MessageStore, java.lang.String ); // address: 0
	{
	halt 
	}


abstract public java.util.Vector getMMSMessagesBefore( com.whatsapp.client.MessageStore, java.lang.String, module:WhatsApp-17.class#15, int ); // address: 0
	{
	halt 
	}


abstract public java.lang.String getAndClearUnsentLine( com.whatsapp.client.MessageStore, java.lang.String ); // address: 0
	{
	halt 
	}


abstract public setUnsentLine( com.whatsapp.client.MessageStore, java.lang.String, java.lang.String ); // address: 0
	{
	halt 
	}


abstract public boolean putMessage( com.whatsapp.client.MessageStore, module:WhatsApp-17.class#15 ); // address: 0
	{
	halt 
	}


abstract public deleteMessage( com.whatsapp.client.MessageStore, module:WhatsApp-17.class#15 ); // address: 0
	{
	halt 
	}


abstract public java.util.Hashtable getJidsPendingUpdate( com.whatsapp.client.MessageStore ); // address: 0
	{
	halt 
	}


abstract public deleteChatHistory( com.whatsapp.client.MessageStore, java.lang.String, boolean ); // address: 0
	{
	halt 
	}


abstract public java.util.Enumeration getOfflineMessages( com.whatsapp.client.MessageStore ); // address: 0
	{
	halt 
	}


abstract public messageReceived( com.whatsapp.client.MessageStore, module:WhatsApp-17.class#15 ); // address: 0
	{
	halt 
	}


abstract public messageSaved( com.whatsapp.client.MessageStore, module:WhatsApp-17.class#15 ); // address: 0
	{
	halt 
	}


abstract public messageMediaDurationUpdated( com.whatsapp.client.MessageStore, module:WhatsApp-17.class#15 ); // address: 0
	{
	halt 
	}


abstract public module:WhatsApp-10.class#0 addGroupChat( com.whatsapp.client.MessageStore, java.lang.String, java.lang.String, int, java.lang.String, int ); // address: 0
	{
	halt 
	}


abstract public module:WhatsApp-9.class#17 addTempGroupChat( com.whatsapp.client.MessageStore, java.lang.String ); // address: 0
	{
	halt 
	}


abstract public module:WhatsApp-10.class#0 getGroupChat( com.whatsapp.client.MessageStore, java.lang.String ); // address: 0
	{
	halt 
	}


abstract public setChatState( com.whatsapp.client.MessageStore, java.lang.String, int ); // address: 0
	{
	halt 
	}


abstract public long getLastGroupsUpdate( com.whatsapp.client.MessageStore ); // address: 0
	{
	halt 
	}


abstract public setLastGroupsUpdate( com.whatsapp.client.MessageStore, long ); // address: 0
	{
	halt 
	}

}
