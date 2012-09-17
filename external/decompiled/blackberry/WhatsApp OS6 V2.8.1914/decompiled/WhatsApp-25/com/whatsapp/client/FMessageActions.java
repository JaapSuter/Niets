// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-25.cod
// Module version  : 2.8.1914
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


abstract public final class FMessageActions extends Object

{
	// @@@@@@@@@@@@@ Static fields 
	private static com.whatsapp.client.FMessageActions /*com.whatsapp.client.FMessageActions*/  field_53786 ; // ofs = 53786 addr = 2)

	// @@@@@@@@@@@@@ Fields 
	private final net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_53754 ; // ofs = 53754 addr = 0)
	private final net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_53758 ; // ofs = 53758 addr = 0)
	private final net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_53762 ; // ofs = 53762 addr = 0)
	private final net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_53766 ; // ofs = 53766 addr = 0)
	private final net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_53770 ; // ofs = 53770 addr = 0)
	private final net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_53774 ; // ofs = 53774 addr = 0)
	private final java.util.Hashtable /*java.util.Hashtable*/  field_53778 ; // ofs = 53778 addr = 0)
	private com.whatsapp.client. /*module:WhatsApp-26.class#23*/  _activeFMsg ; // ofs = 53782 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

private <init>( com.whatsapp.client.FMessageActions ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	invokestatic_lib module:WhatsApp-47.class#11.routine_4359(  ) // class#11
	astore_1 
	iipush 310000
	istore_2 
	sipush 1200
	istore_3 
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0 
	new_lib com.whatsapp.client.//module:WhatsApp-24.class#18 module:WhatsApp-24.class#18 module:WhatsApp-24.class#18
	dup 
	aload_0 
	aload_1 
	sipush 976
	iinc 2 10
	iload_2 
	iinc 3 10
	iload_3 
	invokespecial_lib .routine_25930 // pc=6
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getstatic_lib module:WhatsApp-31.class#0.static_122 // class#0
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload_0 
	new_lib com.whatsapp.client.FMessageActions$2//module:WhatsApp-24.class#22 module:WhatsApp-24.class#22 module:WhatsApp-24.class#22
	dup 
	aload_0 
	aload_1 
	sipush 977
	iinc 2 10
	iload_2 
	iinc 3 10
	iload_3 
	invokespecial_lib .routine_26332 // pc=6
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getstatic_lib module:WhatsApp-31.class#0.static_129 // class#0
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload_0 
	new_lib com.whatsapp.client.FMessageActions$3//module:WhatsApp-24.class#23 module:WhatsApp-24.class#23 module:WhatsApp-24.class#23
	dup 
	aload_0 
	aload_1 
	sipush 830
	iinc 2 10
	iload_2 
	iinc 3 10
	iload_3 
	invokespecial_lib .routine_26382 // pc=6
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getstatic_lib module:WhatsApp-31.class#0.static_126 // class#0
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload_0 
	new_lib com.whatsapp.client.FMessageActions$4//module:WhatsApp-24.class#24 module:WhatsApp-24.class#24 module:WhatsApp-24.class#24
	dup 
	aload_0 
	aload_1 
	sipush 978
	iinc 2 10
	iload_2 
	iinc 3 10
	iload_3 
	invokespecial_lib .routine_26432 // pc=6
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	getstatic_lib module:WhatsApp-31.class#0.static_127 // class#0
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload_0 
	new FMessageActions$5
	dup 
	aload_0 
	aload_1 
	sipush 1082
	iinc 2 10
	iload_2 
	iinc 3 10
	iload_3 
	invokespecial com.whatsapp.client.FMessageActions$5.<init> // pc=6
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	getstatic_lib module:WhatsApp-31.class#0.static_128 // class#0
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload_0 
	new FMessageActions$6
	dup 
	aload_0 
	aload_1 
	bipush 51
	iinc 2 10
	iload_2 
	iinc 3 10
	iload_3 
	invokespecial com.whatsapp.client.FMessageActions$6.<init> // pc=6
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	getstatic_lib module:WhatsApp-31.class#0.static_130 // class#0
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	return 
	}


static public final makeMenu( net.rim.device.api.ui.component.Menu, int, module:WhatsApp-26.class#23, int, int ); // address: 0
	{
	enter 
	getstatic com.whatsapp.client.FMessageActions.field_53786 // FMessageActions
	ifnonnull Label7
	new FMessageActions
	dup 
	invokespecial com.whatsapp.client.FMessageActions.<init> // pc=1
	putstatic com.whatsapp.client.FMessageActions.field_53786 // FMessageActions
Label7:
	getstatic com.whatsapp.client.FMessageActions.field_53786 // FMessageActions
	aload_2 
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	getstatic com.whatsapp.client.FMessageActions.field_53786 // FMessageActions
	invokespecial com.whatsapp.client.FMessageActions.routine_9 // pc=1
	astore_5 
	iload_3 
	istore_6 
	iload_4 
	istore_7 
	iconst_0 
	istore 8
Label19:
	iload 8
	aload_5 
	arraylength 
	if_icmpge Label61
	aload_5 
	iload 8
	aaload 
	astore 9
	aload 9
	iinc 6 10
	iload_6 
	invokevirtual setOrdinal( net.rim.device.api.ui.MenuItem, int ) // pc=2
	aload 9
	iinc 7 10
	iload_7 
	invokevirtual setPriority( net.rim.device.api.ui.MenuItem, int ) // pc=2
	iload_1 
	ifne Label41
	aload 9
	aconst_null 
	invokevirtual setIcon( net.rim.device.api.ui.MenuItem, net.rim.device.api.ui.image.Image ) // pc=2
	goto Label54
Label41:
	getstatic com.whatsapp.client.FMessageActions.field_53786 // FMessageActions
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload 9
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore 10
	aload 10
	ifnull Label54
	aload 9
	aload 10
	getstatic_lib module:WhatsApp-58.class#1.static_11 // class#1
	invokestatic_lib module:WhatsApp-58.class#1.routine_1534(  ) // class#1
	invokevirtual setIcon( net.rim.device.api.ui.MenuItem, net.rim.device.api.ui.image.Image ) // pc=2
Label54:
	aload_0 
	aload_5 
	iload 8
	aaload 
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	iinc 8 1
	goto Label19
Label61:
	return 
	}


static public final net.rim.device.api.ui.MenuItem[] getMenuItems( module:WhatsApp-26.class#23 ); // address: 0
	{
	enter_narrow 
	new FMessageActions
	dup 
	invokespecial com.whatsapp.client.FMessageActions.<init> // pc=1
	astore_1 
	aload_1 
	aload_0 
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_1 
	invokespecial com.whatsapp.client.FMessageActions.routine_9 // pc=1
	areturn 
	}


static public final forwardViaEmail( module:WhatsApp-26.class#23 ); // address: 0
	{
	enter 
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	instanceof_lib com.whatsapp.client.//module:WhatsApp-38.class#0 module:WhatsApp-38.class#0 module:WhatsApp-38.class#0
	ifne Label5
	return 
Label5:
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	checkcast_lib com.whatsapp.client.MediaData//module:WhatsApp-38.class#0 module:WhatsApp-38.class#0 module:WhatsApp-38.class#0
	astore_1 
	aload_1 
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokestatic_lib module:WhatsApp-79.class#39.routine_29013(  ) // class#39
	ifne Label13
	return 
Label13:
	new_lib net.rim.blackberry.api.mail.Multipart//net.rim.blackberry.api.mail.Multipart net.rim.blackberry.api.mail.Multipart net.rim.blackberry.api.mail.Multipart
	dup 
	invokespecial_lib net.rim.blackberry.api.mail.Multipart.<init> // pc=1
	astore_2 
	aload_2 
	new_lib net.rim.blackberry.api.mail.TextBodyPart//net.rim.blackberry.api.mail.TextBodyPart net.rim.blackberry.api.mail.TextBodyPart net.rim.blackberry.api.mail.TextBodyPart
	dup 
	aload_2 
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	invokespecial_lib net.rim.blackberry.api.mail.TextBodyPart.<init> // pc=3
	invokevirtual addBodyPart( net.rim.blackberry.api.mail.Multipart, net.rim.blackberry.api.mail.BodyPart ) // pc=2
	new_lib net.rim.blackberry.api.mail.FileSupportedAttachmentPart//net.rim.blackberry.api.mail.FileSupportedAttachmentPart net.rim.blackberry.api.mail.FileSupportedAttachmentPart net.rim.blackberry.api.mail.FileSupportedAttachmentPart
	dup 
	aload_2 
	aload_1 
	getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_1 
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokespecial_lib net.rim.blackberry.api.mail.FileSupportedAttachmentPart.<init> // pc=4
	astore_3 
	aload_2 
	aload_3 
	invokevirtual addBodyPart( net.rim.blackberry.api.mail.Multipart, net.rim.blackberry.api.mail.BodyPart ) // pc=2
	new_lib net.rim.blackberry.api.mail.Message//net.rim.blackberry.api.mail.Message net.rim.blackberry.api.mail.Message net.rim.blackberry.api.mail.Message
	dup 
	invokespecial_lib net.rim.blackberry.api.mail.Message.<init> // pc=1
	astore_4 
	aload_4 
	iconst_0 
	iconst_1 
	newarray_object_lib net.rim.blackberry.api.mail.Address//net.rim.blackberry.api.mail.Address net.rim.blackberry.api.mail.Address net.rim.blackberry.api.mail.Address
	dup 
	iconst_0 
	new_lib net.rim.blackberry.api.mail.Address//net.rim.blackberry.api.mail.Address net.rim.blackberry.api.mail.Address net.rim.blackberry.api.mail.Address
	dup 
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	invokespecial_lib net.rim.blackberry.api.mail.Address.<init> // pc=3
	aastore 
	invokevirtual addRecipients( net.rim.blackberry.api.mail.Message, int, net.rim.blackberry.api.mail.Address[] ) // pc=3
	aload_4 
	aload_2 
	invokevirtual setContent( net.rim.blackberry.api.mail.Message, java.lang.Object ) // pc=2
	aload_4 
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	invokevirtual setSubject( net.rim.blackberry.api.mail.Message, java.lang.String ) // pc=2
	new_lib net.rim.blackberry.api.invoke.MessageArguments//net.rim.blackberry.api.invoke.MessageArguments net.rim.blackberry.api.invoke.MessageArguments net.rim.blackberry.api.invoke.MessageArguments
	dup 
	aload_4 
	invokespecial_lib net.rim.blackberry.api.invoke.MessageArguments.<init> // pc=2
	astore_5 
	bipush 2
	aload_5 
	invokestatic_lib invokeApplication( int, net.rim.blackberry.api.invoke.ApplicationArguments ) // Invoke
	return 
	astore_2 
	aload_2 
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib inform( java.lang.String ) // Dialog
	return 
	}


static public final forwardViaWhatsApp( module:WhatsApp-26.class#23 ); // address: 0
	{
	enter 
	invokestatic module:WhatsApp-42.class#0 com.whatsapp.client.FMessageActions.routine_1085(  ) // FMessageActions
	astore_1 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifeq Label14
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	ifeq Label14
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	ifnonnull Label14
	sipush 747
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokestatic_lib alert( java.lang.String ) // Dialog
	return 
Label14:
	new_lib com.whatsapp.client.//module:WhatsApp-14.class#0 module:WhatsApp-14.class#0 module:WhatsApp-14.class#0
	dup 
	invokespecial_lib .routine_1777 // pc=1
	astore_2 
	aload_2 
	new FMessageActions$7
	dup 
	aload_0 
	invokespecial com.whatsapp.client.FMessageActions$7.<init> // pc=2
	invokenonvirtual_lib .routine_158 // pc=2
	aload_2 
	new FMessageActions$8
	dup 
	aload_0 
	aload_1 
	aload_2 
	invokespecial com.whatsapp.client.FMessageActions$8.<init> // pc=4
	invokenonvirtual_lib .routine_147 // pc=2
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	aload_2 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}


static private final module:WhatsApp-42.class#0 com.whatsapp.client.FMessageActions.routine_1085(  ); // address: 0
	{
	enter_narrow 
	aconst_null 
	astore_0 
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	invokevirtual net.rim.device.api.ui.Screen getActiveScreen( net.rim.device.api.ui.UiApplication ) // pc=1
	astore_1 
Label6:
	aload_1 
	ifnull Label17
	aload_1 
	checkcastbranch_lib 
	astore_0 
	aload_0 
	areturn 
Label13:
	aload_1 
	invokevirtual net.rim.device.api.ui.Screen getScreenBelow( net.rim.device.api.ui.Screen ) // pc=1
	astore_1 
	goto Label6
Label17:
	aload_0 
	areturn 
	}


static private final module:WhatsApp-26.class#23 copyMessage( java.lang.String, module:WhatsApp-26.class#23 ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-26.class#23 module:WhatsApp-26.class#23 module:WhatsApp-26.class#23
	dup 
	aload_0 
	aload_1 
	invokenonvirtual_lib .routine_6010 // pc=1
	aload_1 
	getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	invokespecial_lib .routine_6302 // pc=4
	astore_2 
	aload_2 
	aload_1 
	getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_2 
	aload_1 
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_2 
	aload_1 
	getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_2 
	aload_1 
	getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	putfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	aload_2 
	aload_1 
	lgetfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	lputfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload_2 
	aload_1 
	getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	putfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_2 
	aload_1 
	getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	putfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	aload_2 
	aload_1 
	lgetfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	lputfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	aload_2 
	aload_1 
	lgetfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	lputfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	aload_2 
	areturn 
	}


static private final boolean showForwardPrompt( java.lang.String ); // address: 0
	{
	enter 
	bipush 3
	sipush 922
	aload_0 
	invokestatic_lib module:WhatsApp-47.class#11.routine_4463(  ) // class#11
	bipush 4
	invokestatic_lib int ask( int, java.lang.String, int ) // Dialog
	istore_1 
	iload_1 
	bipush 4
	if_icmpne Label13
	iconst_1 
	ireturn 
Label13:
	iconst_0 
	ireturn 
	}


static private final closeScreensUnder( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Screen ); // address: 0
	{
	enter 
	aload_0 
	ifnull Label28
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	astore_2 
	aload_1 
	invokevirtual net.rim.device.api.ui.Screen getScreenBelow( net.rim.device.api.ui.Screen ) // pc=1
	astore_3 
Label8:
	aload_3 
	ifnull Label28
	aload_3 
	aload_0 
	if_acmpne Label19
	aload_0 
	instanceof_lib com.whatsapp.client.//module:WhatsApp-42.class#0 module:WhatsApp-42.class#0 module:WhatsApp-42.class#0
	ifne Label28
	aload_0 
	invokevirtual close( net.rim.device.api.ui.Screen ) // pc=1
	return 
Label19:
	aload_3 
	astore_4 
	aload_4 
	invokevirtual net.rim.device.api.ui.Screen getScreenBelow( net.rim.device.api.ui.Screen ) // pc=1
	astore_3 
	aload_2 
	aload_4 
	invokevirtual popScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	goto Label8
Label28:
	return 
	}


static private final net.rim.device.api.system.EncodedImage com.whatsapp.client.FMessageActions.routine_1333( module:WhatsApp-26.class#23 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	iconst_1 
	if_icmpeq Label6
	aconst_null 
	areturn 
Label6:
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	instanceof_lib com.whatsapp.client.MediaData//module:WhatsApp-38.class#0 module:WhatsApp-38.class#0 module:WhatsApp-38.class#0
	ifne Label11
	aconst_null 
	areturn 
Label11:
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	checkcast_lib com.whatsapp.client.MediaData//module:WhatsApp-38.class#0 module:WhatsApp-38.class#0 module:WhatsApp-38.class#0
	astore_1 
	aload_1 
	invokestatic_lib module:WhatsApp-58.class#2.routine_5270(  ) // class#2
	astore_2 
	aload_2 
	areturn 
	}


static public final assignImageToContact( module:WhatsApp-26.class#23 ); // address: 0
	{
	enter 
	aload_0 
	invokestatic net.rim.device.api.system.EncodedImage com.whatsapp.client.FMessageActions.routine_1333( module:WhatsApp-26.class#23 ) // FMessageActions
	astore_1 
	aload_1 
	ifnonnull Label7
	return 
Label7:
	new_lib com.whatsapp.client.//module:WhatsApp-31.class#1 module:WhatsApp-31.class#1 module:WhatsApp-31.class#1
	dup 
	aload_1 
	aconst_null 
	iconst_1 
	invokespecial_lib .routine_2930 // pc=4
	astore_2 
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	aload_2 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}


static public final assignImageToGroup( module:WhatsApp-26.class#23 ); // address: 0
	{
	enter 
	aload_0 
	invokestatic net.rim.device.api.system.EncodedImage com.whatsapp.client.FMessageActions.routine_1333( module:WhatsApp-26.class#23 ) // FMessageActions
	astore_1 
	aload_1 
	ifnonnull Label7
	return 
Label7:
	invokestatic_lib module:WhatsApp-12.class#2.routine_2158(  ) // class#2
	astore_2 
	aload_2 
	invokevirtual int size( java.util.Vector ) // pc=1
	ifne Label13
	return 
Label13:
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	astore_3 
	new_lib com.whatsapp.client.//module:WhatsApp-30.class#19 module:WhatsApp-30.class#19 module:WhatsApp-30.class#19
	dup 
	aload_1 
	invokespecial_lib .routine_7633 // pc=2
	astore_4 
	aload_4 
	new FMessageActions$9
	dup 
	aload_4 
	aload_3 
	invokespecial com.whatsapp.client.FMessageActions$9.<init> // pc=3
	invokenonvirtual_lib .routine_6335 // pc=2
	aload_3 
	aload_4 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}


static private final setImageAsProfilePhoto( module:WhatsApp-26.class#23 ); // address: 0
	{
	enter 
	aload_0 
	invokestatic net.rim.device.api.system.EncodedImage com.whatsapp.client.FMessageActions.routine_1333( module:WhatsApp-26.class#23 ) // FMessageActions
	astore_1 
	aload_1 
	ifnonnull Label7
	return 
Label7:
	invokestatic_lib module:WhatsApp-21.class#0.routine_1491(  ) // class#0
	invokenonvirtual_lib .routine_330 // pc=1
	astore_2 
	aload_2 
	ifnull Label15
	aload_2 
	stringlength 
	ifne Label16
Label15:
	return 
Label16:
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	astore_3 
	new_lib com.whatsapp.client.ImageCropScreen//module:WhatsApp-30.class#19 module:WhatsApp-30.class#19 module:WhatsApp-30.class#19
	dup 
	aload_1 
	invokespecial_lib .routine_7633 // pc=2
	astore_4 
	aload_4 
	new_lib com.whatsapp.client.FMessageActions$10//module:WhatsApp-24.class#19 module:WhatsApp-24.class#19 module:WhatsApp-24.class#19
	dup 
	aload_4 
	aload_2 
	invokespecial_lib .routine_26061 // pc=3
	invokenonvirtual_lib .routine_6335 // pc=2
	aload_3 
	aload_4 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}


static public final saveMedia( module:WhatsApp-26.class#23 ); // address: 0
	{
	enter 
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	instanceof_lib com.whatsapp.client.MediaData//module:WhatsApp-38.class#0 module:WhatsApp-38.class#0 module:WhatsApp-38.class#0
	ifne Label5
	return 
Label5:
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	checkcast_lib com.whatsapp.client.MediaData//module:WhatsApp-38.class#0 module:WhatsApp-38.class#0 module:WhatsApp-38.class#0
	astore_1 
	invokestatic_lib module:WhatsApp-44.class#7.routine_3329(  ) // class#7
	astore_2 
	aload_2 
	invokenonvirtual_lib .routine_2043 // pc=1
	astore_3 
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	invokevirtual net.rim.device.api.ui.Screen getActiveScreen( net.rim.device.api.ui.UiApplication ) // pc=1
	astore_4 
	new_lib com.whatsapp.client.FMessageActions$11//com.whatsapp.client.FMessageActions$11 com.whatsapp.client.FMessageActions$11 com.whatsapp.client.FMessageActions$11
	dup 
	aload_1 
	aload_3 
	aload_0 
	aload_4 
	invokespecial_lib .routine_26161 // pc=5
	invokevirtual start( java.lang.Thread ) // pc=1
	return 
	}


static private final java.lang.String getSaveSubdir( module:WhatsApp-26.class#23 ); // address: 0
	{
	enter 
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	tableswitch  :
		
		
		
		

Label3:
	getstatic_lib module:WhatsApp-19.class#0.static_49 // class#0
	areturn 
Label5:
	getstatic_lib module:WhatsApp-19.class#0.static_50 // class#0
	areturn 
Label7:
	getstatic_lib module:WhatsApp-19.class#0.static_51 // class#0
	areturn 
Label9:
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	areturn 
	}


static private final boolean useAppSpecificSubdir( module:WhatsApp-26.class#23 ); // address: 0
	{
	enter 
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
Label3:
	iconst_1 
	ireturn 
Label5:
	iconst_0 
	ireturn 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final net.rim.device.api.ui.MenuItem[] com.whatsapp.client.FMessageActions.routine_9( com.whatsapp.client.FMessageActions ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	tableswitch  :
		
		
		
		

Label4:
	aload_0 
	invokespecial com.whatsapp.client.FMessageActions.routine_60 // pc=1
	areturn 
Label7:
	aload_0 
	invokespecial com.whatsapp.client.FMessageActions.routine_210 // pc=1
	areturn 
Label10:
	iconst_0 
	newarray_object_lib net.rim.device.api.ui.MenuItem//net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem
	areturn 
	}


private final net.rim.device.api.ui.MenuItem[] com.whatsapp.client.FMessageActions.routine_60( com.whatsapp.client.FMessageActions ); // address: 0
	{
	enter 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	instanceof_lib com.whatsapp.client.MediaData//module:WhatsApp-38.class#0 module:WhatsApp-38.class#0 module:WhatsApp-38.class#0
	ifne Label8
	iconst_0 
	newarray_object_lib net.rim.device.api.ui.MenuItem//net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem
	areturn 
Label8:
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	checkcast_lib com.whatsapp.client.MediaData//module:WhatsApp-38.class#0 module:WhatsApp-38.class#0 module:WhatsApp-38.class#0
	astore_1 
	new_lib Object//java.lang.Object java.lang.Object java.lang.Object
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_2 
	aload_1 
	invokenonvirtual_lib .routine_113 // pc=1
	ifeq Label22
	aload_2 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label22:
	aload_2 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_2 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	invokestatic_lib module:WhatsApp-12.class#2.routine_2158(  ) // class#2
	invokevirtual int size( java.util.Vector ) // pc=1
	ifle Label34
	aload_2 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label34:
	aload_2 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_1 
	invokenonvirtual_lib .routine_113 // pc=1
	ifne Label47
	invokestatic_lib module:WhatsApp-44.class#7.routine_3329(  ) // class#7
	invokenonvirtual_lib .routine_2043 // pc=1
	invokenonvirtual_lib .routine_4210 // pc=1
	ifne Label47
	aload_2 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label47:
	aload_2 
	invokevirtual int size( java.util.Vector ) // pc=1
	newarray_object_lib net.rim.device.api.ui.MenuItem//net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem
	astore_3 
	aload_2 
	aload_3 
	invokevirtual copyInto( java.util.Vector, java.lang.Object[] ) // pc=2
	aload_3 
	areturn 
	}


private final net.rim.device.api.ui.MenuItem[] com.whatsapp.client.FMessageActions.routine_210( com.whatsapp.client.FMessageActions ); // address: 0
	{
	enter 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	instanceof_lib com.whatsapp.client.MediaData//module:WhatsApp-38.class#0 module:WhatsApp-38.class#0 module:WhatsApp-38.class#0
	ifne Label8
	iconst_0 
	newarray_object_lib net.rim.device.api.ui.MenuItem//net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem
	areturn 
Label8:
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	checkcast_lib com.whatsapp.client.MediaData//module:WhatsApp-38.class#0 module:WhatsApp-38.class#0 module:WhatsApp-38.class#0
	astore_1 
	new_lib Object//java.lang.Object java.lang.Object java.lang.Object
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_2 
	aload_1 
	invokenonvirtual_lib .routine_113 // pc=1
	ifeq Label22
	aload_2 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label22:
	aload_2 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_1 
	invokenonvirtual_lib .routine_113 // pc=1
	ifne Label35
	invokestatic_lib module:WhatsApp-44.class#7.routine_3329(  ) // class#7
	invokenonvirtual_lib .routine_2043 // pc=1
	invokenonvirtual_lib .routine_4210 // pc=1
	ifne Label35
	aload_2 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label35:
	aload_2 
	invokevirtual int size( java.util.Vector ) // pc=1
	newarray_object_lib net.rim.device.api.ui.MenuItem//net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem
	astore_3 
	aload_2 
	aload_3 
	invokevirtual copyInto( java.util.Vector, java.lang.Object[] ) // pc=2
	aload_3 
	areturn 
	}

}
