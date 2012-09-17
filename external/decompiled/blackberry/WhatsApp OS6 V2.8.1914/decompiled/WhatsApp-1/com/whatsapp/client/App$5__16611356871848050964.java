// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-1.cod
// Module version  : 2.8.1914
// Class ID        : 31
// ########################################################


package com.whatsapp.client;


abstract final class App$5 extends Thread

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.App /*com.whatsapp.client.App*/  field_56036 ; // ofs = 56036 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.App$5, com.whatsapp.client.App ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Thread.<init> // pc=1
	aload_0 
	aload_1 
	putfield com.whatsapp.client.App$5.field_56036   // get_name_1:  com.whatsapp.client.App$5.field_56036   // get_name_2:  com.whatsapp.client.App$5.field_56036   // get_Name:    com.whatsapp.client.App$5.field_56036   // getName->1:     // getName->2:     // getName->N:     // ofs = 56036 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.App$5 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.App$5.field_56036   // get_name_1:  com.whatsapp.client.App$5.field_56036   // get_name_2:  com.whatsapp.client.App$5.field_56036   // get_Name:    com.whatsapp.client.App$5.field_56036   // getName->1:     // getName->2:     // getName->N:     // ofs = 56036 ord = 0 addr = 0
	invokenonvirtual_lib .routine_983 // pc=1
	aload_0_getfield com.whatsapp.client.App$5.field_56036   // get_name_1:  com.whatsapp.client.App$5.field_56036   // get_name_2:  com.whatsapp.client.App$5.field_56036   // get_Name:    com.whatsapp.client.App$5.field_56036   // getName->1:     // getName->2:     // getName->N:     // ofs = 56036 ord = 0 addr = 0
	getfield _xmppRunner   // get_name_1:  _xmppRunner   // get_name_2:  _xmppRunner   // get_Name:    _xmppRunner   // getName->1:  _xmppRunner   // getName->2:  _xmppRunner   // getName->N:  _xmppRunner   // ofs = -1 ord = 0 addr = -1
	getfield _connection   // get_name_1:  _connection   // get_name_2:  _connection   // get_Name:    _connection   // getName->1:  _connection   // getName->2:  _connection   // getName->N:  _connection   // ofs = -1 ord = 0 addr = -1
	astore_2 
	aload_2 
	ifnull Label14
	aload_2 
	invokenonvirtual_lib .routine_2679 // pc=1
	iconst_0 
	istore_1 
	goto Label33
Label14:
	ldc literal_107:"no active connection in FunRunner, not sending remove account"
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	iconst_1 
	istore_1 
	goto Label33
	astore_2 
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	ldc literal_105:"error in xmpp send thread ["
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_2 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_108:"] couldn't send remove account"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	iconst_1 
	istore_1 
Label33:
	iload_1 
	ifeq Label47
	aload_0_getfield com.whatsapp.client.App$5.field_56036   // get_name_1:  com.whatsapp.client.App$5.field_56036   // get_name_2:  com.whatsapp.client.App$5.field_56036   // get_Name:    com.whatsapp.client.App$5.field_56036   // getName->1:     // getName->2:     // getName->N:     // ofs = 56036 ord = 0 addr = 0
	getfield _sendRemoveAccountTimer   // get_name_1:  _sendRemoveAccountTimer   // get_name_2:  _sendRemoveAccountTimer   // get_Name:    _sendRemoveAccountTimer   // getName->1:  _sendRemoveAccountTimer   // getName->2:  _sendRemoveAccountTimer   // getName->N:  _sendRemoveAccountTimer   // ofs = -1 ord = 3 addr = -1
	ifnull Label44
	aload_0_getfield com.whatsapp.client.App$5.field_56036   // get_name_1:  com.whatsapp.client.App$5.field_56036   // get_name_2:  com.whatsapp.client.App$5.field_56036   // get_Name:    com.whatsapp.client.App$5.field_56036   // getName->1:     // getName->2:     // getName->N:     // ofs = 56036 ord = 0 addr = 0
	getfield _sendRemoveAccountTimer   // get_name_1:  _sendRemoveAccountTimer   // get_name_2:  _sendRemoveAccountTimer   // get_Name:    _sendRemoveAccountTimer   // getName->1:  _sendRemoveAccountTimer   // getName->2:  _sendRemoveAccountTimer   // getName->N:  _sendRemoveAccountTimer   // ofs = -1 ord = 3 addr = -1
	invokevirtual cancel( java.util.Timer ) // pc=1
	aload_0_getfield com.whatsapp.client.App$5.field_56036   // get_name_1:  com.whatsapp.client.App$5.field_56036   // get_name_2:  com.whatsapp.client.App$5.field_56036   // get_Name:    com.whatsapp.client.App$5.field_56036   // getName->1:     // getName->2:     // getName->N:     // ofs = 56036 ord = 0 addr = 0
	aconst_null 
	putfield _sendRemoveAccountTimer   // get_name_1:  _sendRemoveAccountTimer   // get_name_2:  _sendRemoveAccountTimer   // get_Name:    _sendRemoveAccountTimer   // getName->1:  _sendRemoveAccountTimer   // getName->2:  _sendRemoveAccountTimer   // getName->N:  _sendRemoveAccountTimer   // ofs = -1 ord = 3 addr = -1
Label44:
	lipush -4295465089631537627
	invokestatic_lib module:WhatsApp-79.class#39.routine_26940(  ) // class#39
	pop 
Label47:
	return 
	}

}
