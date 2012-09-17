// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp.cod
// Module version  : 2.8.1914
// Class ID        : 22
// ########################################################


package com.whatsapp.client;


abstract final class ContactStatuses$Persisted extends Object
implements net.rim.device.api.util.Persistable

{

	// @@@@@@@@@@@@@ Fields 
	private java.util.Hashtable /*java.util.Hashtable*/  _phoneToJid ; // ofs = 50994 addr = 0)
	private java.util.Hashtable /*java.util.Hashtable*/  _contactStatusByJid ; // ofs = 50998 addr = 0)
	private java.util.Hashtable /*java.util.Hashtable*/  _holdoutPhones ; // ofs = 51002 addr = 0)
	private String /*java.lang.String*/  _myStatus ; // ofs = 51006 addr = 0)
	private long /*long*/  _lastColdSync ; // ofs = 51010 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

private <init>( com.whatsapp.client.ContactStatuses$Persisted ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	new_lib java.util.TimerTask//java.util.TimerTask java.util.TimerTask java.util.TimerTask
	dup 
	bipush 25
	invokespecial_lib java.util.Hashtable.<init> // pc=2
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	new_lib java.util.TimerTask//java.util.TimerTask java.util.TimerTask java.util.TimerTask
	dup 
	bipush 25
	invokespecial_lib java.util.Hashtable.<init> // pc=2
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	new_lib java.util.TimerTask//java.util.TimerTask java.util.TimerTask java.util.TimerTask
	dup 
	bipush 100
	invokespecial_lib java.util.Hashtable.<init> // pc=2
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	return 
	}


<init>( com.whatsapp.client.ContactStatuses$Persisted, module:WhatsApp-78.class#18 ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial com.whatsapp.client.ContactStatuses$Persisted.<init> // pc=1
	return 
	}

}
