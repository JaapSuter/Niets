// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-50.cod
// Module version  : 2.8.1914
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


public class SyncManager$SyncFailureException extends Exception

{

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.SyncManager$SyncFailureException, module:WhatsApp-49.class#13, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Exception.<init> // pc=1
	aload_0 
	aload_1 
	putfield com.whatsapp.client.SyncManager$SyncFailureException.field_53958   // get_name_1:  com.whatsapp.client.SyncManager$SyncFailureException.field_53958   // get_name_2:  com.whatsapp.client.SyncManager$SyncFailureException.field_53958   // get_Name:    com.whatsapp.client.SyncManager$SyncFailureException.field_53958   // getName->1:     // getName->2:     // getName->N:     // ofs = 53958 ord = 1 addr = 0
	aload_0 
	iload_2 
	putfield responseCode   // get_name_1:  responseCode   // get_name_2:  responseCode   // get_Name:    responseCode   // getName->1:  responseCode   // getName->2:  responseCode   // getName->N:  responseCode   // ofs = 53954 ord = 0 addr = 0
	return 
	}

}
