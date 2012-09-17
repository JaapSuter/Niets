// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-44.cod
// Module version  : 2.8.1914
// Class ID        : 17
// ########################################################


package com.whatsapp.client;


abstract final class PhoneNumberConfirmationScreen$11 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final String /*java.lang.String*/  field_54844 ; // ofs = 54844 addr = 0)
	private final String /*java.lang.String*/  field_54848 ; // ofs = 54848 addr = 0)
	private final Runnable /*java.lang.Runnable*/  field_54852 ; // ofs = 54852 addr = 0)
	private final Runnable /*java.lang.Runnable*/  field_54856 ; // ofs = 54856 addr = 0)
	private final com.whatsapp.client.PhoneNumberConfirmationScreen /*com.whatsapp.client.PhoneNumberConfirmationScreen*/  this$0 ; // ofs = 54860 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.PhoneNumberConfirmationScreen$11, com.whatsapp.client.PhoneNumberConfirmationScreen, java.lang.String, java.lang.String, java.lang.Runnable, java.lang.Runnable ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
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
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.PhoneNumberConfirmationScreen$11 ); // address: 0
	{
	enter 
	new_lib net.rim.blackberry.api.browser.URLEncodedPostData//net.rim.blackberry.api.browser.URLEncodedPostData net.rim.blackberry.api.browser.URLEncodedPostData net.rim.blackberry.api.browser.URLEncodedPostData
	dup 
	getstatic_lib module:WhatsApp-19.class#0.static_2 // class#0
	iconst_0 
	invokespecial_lib net.rim.blackberry.api.browser.URLEncodedPostData.<init> // pc=3
	astore_1 
	aload_1 
	ldc literal_93:"udid"
	invokestatic_lib module:WhatsApp-79.class#39.routine_21818(  ) // class#39
	invokevirtual append( net.rim.blackberry.api.browser.URLEncodedPostData, java.lang.String, java.lang.String ) // pc=3
	aload_1 
	ldc literal_94:"in"
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual append( net.rim.blackberry.api.browser.URLEncodedPostData, java.lang.String, java.lang.String ) // pc=3
	aload_1 
	ldc literal_95:"cc"
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual append( net.rim.blackberry.api.browser.URLEncodedPostData, java.lang.String, java.lang.String ) // pc=3
	new_lib net.rim.device.api.ui.FieldChangeListener//net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener
	dup 
	ldc literal_96:"https://r.whatsapp.net/v1/exist.php?"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_2 
	aconst_null 
	astore_3 
	invokestatic_lib module:WhatsApp-58.class#3.routine_7164(  ) // class#3
	ifne Label47
	ldc literal_97:"Not enough network coverage to do same-device check"
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	new PhoneNumberConfirmationScreen$11$1
	dup 
	aload_0 
	invokespecial com.whatsapp.client.PhoneNumberConfirmationScreen$11$1.<init> // pc=2
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	aload_3 
	ifnull Label46
	aload_3 
	invokeinterface interfacemethodref_2 // pc=1 guess=0
	return 
	astore 10
Label46:
	return 
Label47:
	new_lib com.whatsapp.util.//module:WhatsApp-58.class#3 module:WhatsApp-58.class#3 module:WhatsApp-58.class#3
	dup 
	bipush 2
	invokespecial_lib .routine_6877 // pc=2
	astore_4 
	aload_4 
	sipush 30000
	i2l 
	invokenonvirtual_lib .routine_5667 // pc=3
	aload_4 
	aload_2 
	invokenonvirtual_lib .routine_5712 // pc=2
	checkcast_lib net.rim.device.api.ui.component.Dialog//net.rim.device.api.ui.component.Dialog net.rim.device.api.ui.component.Dialog net.rim.device.api.ui.component.Dialog
	astore_3 
	aload_3 
	getstatic_lib module:WhatsApp-19.class#0.static_57 // class#0
	invokestatic_lib module:WhatsApp-79.class#39.routine_23847(  ) // class#39
	invokeinterface interfacemethodref_3 // pc=3 guess=1
	aload_3 
	invokeinterface interfacemethodref_4 // pc=1 guess=2
	istore_5 
	iload_5 
	sipush 200
	if_icmpeq Label87
	new_lib net.rim.device.api.ui.FieldChangeListener//net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener
	dup 
	ldc literal_98:"same-device check URL got response code "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload_5 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	new PhoneNumberConfirmationScreen$11$2
	dup 
	aload_0 
	iload_5 
	invokespecial com.whatsapp.client.PhoneNumberConfirmationScreen$11$2.<init> // pc=3
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	goto Label107
Label87:
	ldc literal_99:"same-device check URL got success code"
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_3 
	invokeinterface interfacemethodref_5 // pc=1 guess=3
	astore_6 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_6 
	invokespecial_lib .routine_923 // pc=2
	astore_7 
	aload_7 
	ifnonnull Label102
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	goto Label107
Label102:
	aload_7 
	invokestatic_lib module:WhatsApp-79.class#39.routine_21751(  ) // class#39
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
Label107:
	aload_3 
	ifnull Label147
	aload_3 
	invokeinterface interfacemethodref_2 // pc=1 guess=0
	return 
	astore 10
	return 
	astore_4 
	new_lib net.rim.device.api.ui.FieldChangeListener//net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener
	dup 
	ldc literal_100:"trouble with same device check: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_4 
	invokestatic_lib module:WhatsApp-79.class#39.routine_30761(  ) // class#39
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	new PhoneNumberConfirmationScreen$11$3
	dup 
	aload_0 
	aload_4 
	invokespecial com.whatsapp.client.PhoneNumberConfirmationScreen$11$3.<init> // pc=3
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	aload_3 
	ifnull Label147
	aload_3 
	invokeinterface interfacemethodref_2 // pc=1 guess=0
	return 
	astore 10
	return 
	astore 8
	aload_3 
	ifnull Label145
	aload_3 
	invokeinterface interfacemethodref_2 // pc=1 guess=0
	goto Label145
	astore 10
Label145:
	aload 8
	athrow 
Label147:
	return 
	}

}
