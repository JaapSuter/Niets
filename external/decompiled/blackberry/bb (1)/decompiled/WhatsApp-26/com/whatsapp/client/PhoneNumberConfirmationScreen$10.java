// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-26.cod
// Module version  : 2.7.3204
// Class ID        : 14
// ########################################################


package com.whatsapp.client;


abstract final class PhoneNumberConfirmationScreen$10 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final String /*java.lang.String*/  field_56124 ; // ofs = 56124 addr = 0)
	private final String /*java.lang.String*/  field_56128 ; // ofs = 56128 addr = 0)
	private final Runnable /*java.lang.Runnable*/  field_56132 ; // ofs = 56132 addr = 0)
	private final com.whatsapp.client.PersistentDataStore /*com.whatsapp.client.PersistentDataStore*/  field_56136 ; // ofs = 56136 addr = 0)
	private final Runnable /*java.lang.Runnable*/  field_56140 ; // ofs = 56140 addr = 0)
	private final com.whatsapp.client.PhoneNumberConfirmationScreen /*com.whatsapp.client.PhoneNumberConfirmationScreen*/  field_56144 ; // ofs = 56144 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.PhoneNumberConfirmationScreen$10, com.whatsapp.client.PhoneNumberConfirmationScreen, java.lang.String, java.lang.String, java.lang.Runnable, com.whatsapp.client.PersistentDataStore, java.lang.Runnable ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0 
	aload_2 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	aload_3 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	aload_4 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aload_5 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	aload_6 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.PhoneNumberConfirmationScreen$10 ); // address: 0
	{
	enter 
	new_lib net.rim.blackberry.api.browser.URLEncodedPostData//net.rim.blackberry.api.browser.URLEncodedPostData net.rim.blackberry.api.browser.URLEncodedPostData net.rim.blackberry.api.browser.URLEncodedPostData
	dup 
	getstatic_lib module:WhatsApp-12.class#0.static_2 // class#0
	iconst_0 
	invokespecial_lib net.rim.blackberry.api.browser.URLEncodedPostData.<init> // pc=3
	astore_1 
	aload_1 
	ldc literal_80:"udid"
	invokestatic_lib module:WhatsApp-32.class#2.routine_2188(  ) // class#2
	invokevirtual append( net.rim.blackberry.api.browser.URLEncodedPostData, java.lang.String, java.lang.String ) // pc=3
	aload_1 
	ldc literal_67:"in"
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual append( net.rim.blackberry.api.browser.URLEncodedPostData, java.lang.String, java.lang.String ) // pc=3
	aload_1 
	ldc literal_69:"cc"
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual append( net.rim.blackberry.api.browser.URLEncodedPostData, java.lang.String, java.lang.String ) // pc=3
	new_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	dup 
	ldc literal_87:"https://r.whatsapp.net/v1/exist.php?"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_2 
	aconst_null 
	astore_3 
	iconst_1 
	sipush 30000
	i2l 
	invokestatic_lib module:WhatsApp-32.class#2.routine_2443(  ) // class#2
	astore_4 
	aload_4 
	ifnonnull Label50
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	new PhoneNumberConfirmationScreen$10$1
	dup 
	aload_0 
	invokespecial com.whatsapp.client.PhoneNumberConfirmationScreen$10$1.<init> // pc=2
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	aload_3 
	ifnull Label49
	aload_3 
	invokeinterface interfacemethodref_7 // pc=1 guess=21
	return 
	astore 11
Label49:
	return 
Label50:
	new_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_4 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	bipush 3
	iconst_1 
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String, int, boolean ) // Connector
	checkcast_lib net.rim.device.api.ui.component.NullField//net.rim.device.api.ui.component.NullField net.rim.device.api.ui.component.NullField net.rim.device.api.ui.component.NullField
	astore_3 
	aload_3 
	getstatic_lib module:WhatsApp-12.class#0.static_55 // class#0
	invokestatic_lib module:WhatsApp-32.class#2.routine_3892(  ) // class#2
	invokeinterface interfacemethodref_8 // pc=3 guess=22
	aload_3 
	invokeinterface interfacemethodref_9 // pc=1 guess=23
	istore_5 
	iload_5 
	sipush 200
	if_icmpeq Label74
	goto Label103
Label74:
	aload_3 
	invokeinterface interfacemethodref_10 // pc=1 guess=24
	astore_6 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_6 
	invokespecial com.whatsapp.client.PhoneNumberConfirmationScreen.parseSameDeviceData // pc=2
	astore_7 
	aload_7 
	ifnonnull Label87
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	goto Label103
Label87:
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokenonvirtual com.whatsapp.client.PersistentDataStore.getApplicationHashData // pc=1
	invokestatic_lib java.lang.Object expandGroup( java.lang.Object ) // ObjectGroup
	checkcast_lib com.whatsapp.client.ApplicationHashData//module:WhatsApp.class#9 module:WhatsApp.class#9 module:WhatsApp.class#9
	astore 8
	aload 8
	aload_7 
	invokenonvirtual_lib .routine_1920 // pc=2
	aload 8
	invokestatic_lib createGroup( java.lang.Object ) // ObjectGroup
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload 8
	invokenonvirtual com.whatsapp.client.PersistentDataStore.saveApplicationData // pc=2
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
Label103:
	aload_3 
	ifnull Label134
	aload_3 
	invokeinterface interfacemethodref_7 // pc=1 guess=21
	return 
	astore 11
	return 
	astore_4 
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	new_lib com.whatsapp.client.PhoneNumberConfirmationScreen$10$2//module:WhatsApp-27.class#0 module:WhatsApp-27.class#0 module:WhatsApp-27.class#0
	dup 
	aload_0 
	aload_4 
	invokespecial_lib .routine_36 // pc=3
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	aload_3 
	ifnull Label134
	aload_3 
	invokeinterface interfacemethodref_7 // pc=1 guess=21
	return 
	astore 11
	return 
	astore 9
	aload_3 
	ifnull Label132
	aload_3 
	invokeinterface interfacemethodref_7 // pc=1 guess=21
	goto Label132
	astore 11
Label132:
	aload 9
	athrow 
Label134:
	return 
	}

}
