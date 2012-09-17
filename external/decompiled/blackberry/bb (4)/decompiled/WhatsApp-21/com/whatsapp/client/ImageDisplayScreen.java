// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-20.cod
// Module version  : 2.7.3204
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


abstract public final class ImageDisplayScreen extends net.rim.device.api.ui.container.MainScreen

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_52930 ; // ofs = 52930 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_52934 ; // ofs = 52934 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_52938 ; // ofs = 52938 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_52942 ; // ofs = 52942 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_52946 ; // ofs = 52946 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_52950 ; // ofs = 52950 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_52954 ; // ofs = 52954 addr = 0)
	private net.rim.device.api.system.EncodedImage /*net.rim.device.api.system.EncodedImage*/  _eImageOriginal ; // ofs = 52958 addr = 0)
	private net.rim.device.api.system.Bitmap /*net.rim.device.api.system.Bitmap*/  field_52962 ; // ofs = 52962 addr = 0)
	private net.rim.device.api.system.Bitmap /*net.rim.device.api.system.Bitmap*/  _bitmapFull ; // ofs = 52966 addr = 0)
	private boolean /*boolean*/  _needsRotate ; // ofs = 52970 addr = 0)
	private int /*int*/  field_52974 ; // ofs = 52974 addr = 0)
	private int /*int*/  field_52978 ; // ofs = 52978 addr = 0)
	private int /*int*/  field_52982 ; // ofs = 52982 addr = 0)
	private int /*int*/  field_52986 ; // ofs = 52986 addr = 0)
	private int /*int*/  field_52990 ; // ofs = 52990 addr = 0)
	private int /*int*/  field_52994 ; // ofs = 52994 addr = 0)
	private int /*int*/  field_52998 ; // ofs = 52998 addr = 0)
	private int /*int*/  field_53002 ; // ofs = 53002 addr = 0)
	private boolean /*boolean*/  _fitMode ; // ofs = 53006 addr = 0)
	private boolean /*boolean*/  _assignRectMode ; // ofs = 53010 addr = 0)
	private int /*int*/  _assignRectX ; // ofs = 53014 addr = 0)
	private int /*int*/  _assignRectY ; // ofs = 53018 addr = 0)
	private int /*int*/  field_53022 ; // ofs = 53022 addr = 0)
	private int /*int*/  field_53026 ; // ofs = 53026 addr = 0)
	private String /*java.lang.String*/  _base64AssignPic ; // ofs = 53030 addr = 0)
	private com.whatsapp.client.ContactInfoDetails /*module:WhatsApp.class#12*/  _targetCID ; // ofs = 53034 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.ImageDisplayScreen, net.rim.device.api.system.EncodedImage, module:WhatsApp.class#12 ); // address: 0
	{
	enter 
	aload_0 
	lipush 299067163017216
	invokespecial_lib net.rim.device.api.ui.container.MainScreen.<init> // pc=3
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.ImageDisplayScreen.field_52974   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52974   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52974   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52974   // getName->1:     // getName->2:     // getName->N:     // ofs = 52974 ord = 11 addr = 0
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.ImageDisplayScreen.field_52978   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52978   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52978   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52978   // getName->1:     // getName->2:     // getName->N:     // ofs = 52978 ord = 12 addr = 0
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.ImageDisplayScreen.field_52982   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52982   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52982   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52982   // getName->1:     // getName->2:     // getName->N:     // ofs = 52982 ord = 13 addr = 0
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.ImageDisplayScreen.field_52986   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52986   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52986   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52986   // getName->1:     // getName->2:     // getName->N:     // ofs = 52986 ord = 14 addr = 0
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.ImageDisplayScreen.field_52998   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52998   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52998   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52998   // getName->1:     // getName->2:     // getName->N:     // ofs = 52998 ord = 17 addr = 0
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.ImageDisplayScreen.field_53002   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_53002   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_53002   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_53002   // getName->1:     // getName->2:     // getName->N:     // ofs = 53002 ord = 18 addr = 0
	aload_0 
	iconst_1 
	putfield _fitMode   // get_name_1:  _fitMode   // get_name_2:  _fitMode   // get_Name:    _fitMode   // getName->1:  _fitMode   // getName->2:  _fitMode   // getName->N:  _fitMode   // ofs = 53006 ord = 19 addr = 0
	aload_0 
	iconst_0 
	putfield _assignRectMode   // get_name_1:  _assignRectMode   // get_name_2:  _assignRectMode   // get_Name:    _assignRectMode   // getName->1:  _assignRectMode   // getName->2:  _assignRectMode   // getName->N:  _assignRectMode   // ofs = 53010 ord = 20 addr = 0
	aload_0 
	aload_1 
	putfield _eImageOriginal   // get_name_1:  _eImageOriginal   // get_name_2:  _eImageOriginal   // get_Name:    _eImageOriginal   // getName->1:  _eImageOriginal   // getName->2:  _eImageOriginal   // getName->N:  _eImageOriginal   // ofs = 52958 ord = 7 addr = 0
	aload_0 
	aload_0_getfield _eImageOriginal   // get_name_1:  _eImageOriginal   // get_name_2:  _eImageOriginal   // get_Name:    _eImageOriginal   // getName->1:  _eImageOriginal   // getName->2:  _eImageOriginal   // getName->N:  _eImageOriginal   // ofs = 52958 ord = 7 addr = 0
	invokestatic_lib module:WhatsApp-23.class#8.routine_4189(  ) // class#8
	putfield _needsRotate   // get_name_1:  _needsRotate   // get_name_2:  _needsRotate   // get_Name:    _needsRotate   // getName->1:  _needsRotate   // getName->2:  _needsRotate   // getName->N:  _needsRotate   // ofs = 52970 ord = 10 addr = 0
	aload_0 
	aload_2 
	putfield _targetCID   // get_name_1:  _targetCID   // get_name_2:  _targetCID   // get_Name:    _targetCID   // getName->1:  _targetCID   // getName->2:  _targetCID   // getName->N:  _targetCID   // ofs = 53034 ord = 26 addr = 0
	aload_0_getfield _targetCID   // get_name_1:  _targetCID   // get_name_2:  _targetCID   // get_Name:    _targetCID   // getName->1:  _targetCID   // getName->2:  _targetCID   // getName->N:  _targetCID   // ofs = 53034 ord = 26 addr = 0
	ifnull Label43
	aload_0 
	iconst_1 
	putfield _assignRectMode   // get_name_1:  _assignRectMode   // get_name_2:  _assignRectMode   // get_Name:    _assignRectMode   // getName->1:  _assignRectMode   // getName->2:  _assignRectMode   // getName->N:  _assignRectMode   // ofs = 53010 ord = 20 addr = 0
Label43:
	iipush 310000
	istore_3 
	sipush 1200
	istore_4 
	aload_0 
	new_lib com.whatsapp.client.//module:WhatsApp-19.class#16 module:WhatsApp-19.class#16 module:WhatsApp-19.class#16
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4672(  ) // class#18
	sipush 700
	iinc 3 10
	iload_3 
	iinc 4 10
	iload_4 
	invokespecial_lib .routine_8082 // pc=6
	putfield com.whatsapp.client.ImageDisplayScreen.field_52934   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52934   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52934   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52934   // getName->1:     // getName->2:     // getName->N:     // ofs = 52934 ord = 1 addr = 0
	aload_0 
	new_lib com.whatsapp.client.ImageDisplayScreen$2//module:WhatsApp-19.class#17 module:WhatsApp-19.class#17 module:WhatsApp-19.class#17
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4672(  ) // class#18
	sipush 701
	iinc 3 10
	iload_3 
	iinc 4 10
	iload_4 
	invokespecial_lib .routine_8134 // pc=6
	putfield com.whatsapp.client.ImageDisplayScreen.field_52938   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52938   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52938   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52938   // getName->1:     // getName->2:     // getName->N:     // ofs = 52938 ord = 2 addr = 0
	aload_0 
	new_lib com.whatsapp.client.ImageDisplayScreen$3//module:WhatsApp-19.class#18 module:WhatsApp-19.class#18 module:WhatsApp-19.class#18
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4672(  ) // class#18
	sipush 830
	iinc 3 10
	iload_3 
	iinc 4 10
	iload_4 
	invokespecial_lib .routine_8221 // pc=6
	putfield com.whatsapp.client.ImageDisplayScreen.field_52942   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52942   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52942   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52942   // getName->1:     // getName->2:     // getName->N:     // ofs = 52942 ord = 3 addr = 0
	aload_0 
	new_lib com.whatsapp.client.ImageDisplayScreen$4//module:WhatsApp-19.class#19 module:WhatsApp-19.class#19 module:WhatsApp-19.class#19
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4672(  ) // class#18
	sipush 832
	iinc 3 10
	iload_3 
	iinc 4 10
	iload_4 
	invokespecial_lib .routine_8269 // pc=6
	putfield com.whatsapp.client.ImageDisplayScreen.field_52946   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52946   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52946   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52946   // getName->1:     // getName->2:     // getName->N:     // ofs = 52946 ord = 4 addr = 0
	aload_0 
	new_lib com.whatsapp.client.ImageDisplayScreen$5//module:WhatsApp-19.class#20 module:WhatsApp-19.class#20 module:WhatsApp-19.class#20
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4672(  ) // class#18
	sipush 831
	iinc 3 10
	iload_3 
	iinc 4 10
	iload_4 
	invokespecial_lib .routine_8477 // pc=6
	putfield com.whatsapp.client.ImageDisplayScreen.field_52954   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52954   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52954   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52954   // getName->1:     // getName->2:     // getName->N:     // ofs = 52954 ord = 6 addr = 0
	aload_0 
	new_lib com.whatsapp.client.ImageDisplayScreen$6//module:WhatsApp-19.class#21 module:WhatsApp-19.class#21 module:WhatsApp-19.class#21
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4672(  ) // class#18
	sipush 833
	iinc 3 10
	iload_3 
	iinc 4 10
	iload_4 
	invokespecial_lib .routine_8543 // pc=6
	putfield com.whatsapp.client.ImageDisplayScreen.field_52950   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52950   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52950   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52950   // getName->1:     // getName->2:     // getName->N:     // ofs = 52950 ord = 5 addr = 0
	aload_0 
	new_lib com.whatsapp.client.ImageDisplayScreen$7//module:WhatsApp-19.class#22 module:WhatsApp-19.class#22 module:WhatsApp-19.class#22
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4672(  ) // class#18
	bipush 2
	iinc 3 10
	iload_3 
	iinc 4 10
	iload_4 
	invokespecial_lib .routine_8591 // pc=6
	putfield com.whatsapp.client.ImageDisplayScreen.field_52930   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52930   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52930   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52930   // getName->1:     // getName->2:     // getName->N:     // ofs = 52930 ord = 0 addr = 0
	return 
	}


static public final assignPicToContact( java.lang.String, module:WhatsApp.class#12 ); // address: 0
	{
	enter 
	invokestatic_lib javax.microedition.pim.PIM getInstance(  ) // BlackBerryPIM
	checkcast_lib net.rim.blackberry.api.pdap.BlackBerryPIM//net.rim.blackberry.api.pdap.BlackBerryPIM net.rim.blackberry.api.pdap.BlackBerryPIM net.rim.blackberry.api.pdap.BlackBerryPIM
	astore_2 
	aconst_null 
	astore_3 
	aload_2 
	iconst_1 
	bipush 3
	invokevirtual net.rim.blackberry.api.pdap.BlackBerryPIMList openUnifiedPIMList( net.rim.blackberry.api.pdap.BlackBerryPIM, int, int ) // pc=3
	checkcast_lib net.rim.blackberry.api.pdap.BlackBerryContactList//net.rim.blackberry.api.pdap.BlackBerryContactList net.rim.blackberry.api.pdap.BlackBerryContactList net.rim.blackberry.api.pdap.BlackBerryContactList
	astore_3 
	aload_3 
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_4 // pc=2 guess=0
	astore_4 
	aload_0 
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	astore_5 
	aload_4 
	bipush 110
	invokeinterface interfacemethodref_5 // pc=2 guess=1
	ifle Label34
	aload_4 
	bipush 110
	iconst_0 
	iconst_0 
	aload_5 
	iconst_0 
	aload_5 
	arraylength 
	invokeinterface interfacemethodref_6 // pc=7 guess=2
	goto Label42
Label34:
	aload_4 
	bipush 110
	iconst_0 
	aload_5 
	iconst_0 
	aload_5 
	arraylength 
	invokeinterface interfacemethodref_7 // pc=6 guess=3
Label42:
	aload_4 
	invokeinterface interfacemethodref_8 // pc=1 guess=4
	aload_3 
	ifnull Label77
	aload_3 
	invokeinterface interfacemethodref_9 // pc=1 guess=5
	return 
	astore_4 
	return 
	astore_4 
	new_lib net.rim.device.api.ui.TouchEvent//net.rim.device.api.ui.TouchEvent net.rim.device.api.ui.TouchEvent net.rim.device.api.ui.TouchEvent
	dup 
	ldc literal_179:"Couldn't save picture to contact, got error: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_4 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib alert( java.lang.String ) // Dialog
	aload_3 
	ifnull Label77
	aload_3 
	invokeinterface interfacemethodref_9 // pc=1 guess=5
	return 
	astore_4 
	return 
	astore_6 
	aload_3 
	ifnull Label75
	aload_3 
	invokeinterface interfacemethodref_9 // pc=1 guess=5
	goto Label75
	astore_7 
Label75:
	aload_6 
	athrow 
Label77:
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.ImageDisplayScreen.routine_1323( com.whatsapp.client.ImageDisplayScreen ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _assignRectMode   // get_name_1:  _assignRectMode   // get_name_2:  _assignRectMode   // get_Name:    _assignRectMode   // getName->1:  _assignRectMode   // getName->2:  _assignRectMode   // getName->N:  _assignRectMode   // ofs = 53010 ord = 20 addr = 0
	ifeq Label28
	aload_0_getfield _assignRectX   // get_name_1:  _assignRectX   // get_name_2:  _assignRectX   // get_Name:    _assignRectX   // getName->1:  _assignRectX   // getName->2:  _assignRectX   // getName->N:  _assignRectX   // ofs = 53014 ord = 21 addr = 0
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen.field_52994   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52994   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52994   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52994   // getName->1:     // getName->2:     // getName->N:     // ofs = 52994 ord = 16 addr = 0
	if_icmpge Label9
	aload_0 
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen.field_52994   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52994   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52994   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52994   // getName->1:     // getName->2:     // getName->N:     // ofs = 52994 ord = 16 addr = 0
	putfield _assignRectX   // get_name_1:  _assignRectX   // get_name_2:  _assignRectX   // get_Name:    _assignRectX   // getName->1:  _assignRectX   // getName->2:  _assignRectX   // getName->N:  _assignRectX   // ofs = 53014 ord = 21 addr = 0
Label9:
	aload_0_getfield _assignRectY   // get_name_1:  _assignRectY   // get_name_2:  _assignRectY   // get_Name:    _assignRectY   // getName->1:  _assignRectY   // getName->2:  _assignRectY   // getName->N:  _assignRectY   // ofs = 53018 ord = 22 addr = 0
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen.field_52990   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52990   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52990   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52990   // getName->1:     // getName->2:     // getName->N:     // ofs = 52990 ord = 15 addr = 0
	if_icmpge Label15
	aload_0 
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen.field_52990   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52990   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52990   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52990   // getName->1:     // getName->2:     // getName->N:     // ofs = 52990 ord = 15 addr = 0
	putfield _assignRectY   // get_name_1:  _assignRectY   // get_name_2:  _assignRectY   // get_Name:    _assignRectY   // getName->1:  _assignRectY   // getName->2:  _assignRectY   // getName->N:  _assignRectY   // ofs = 53018 ord = 22 addr = 0
Label15:
	aload_0_getfield _assignRectX   // get_name_1:  _assignRectX   // get_name_2:  _assignRectX   // get_Name:    _assignRectX   // getName->1:  _assignRectX   // getName->2:  _assignRectX   // getName->N:  _assignRectX   // ofs = 53014 ord = 21 addr = 0
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen.field_53022   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_53022   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_53022   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_53022   // getName->1:     // getName->2:     // getName->N:     // ofs = 53022 ord = 23 addr = 0
	if_icmple Label21
	aload_0 
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen.field_53022   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_53022   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_53022   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_53022   // getName->1:     // getName->2:     // getName->N:     // ofs = 53022 ord = 23 addr = 0
	putfield _assignRectX   // get_name_1:  _assignRectX   // get_name_2:  _assignRectX   // get_Name:    _assignRectX   // getName->1:  _assignRectX   // getName->2:  _assignRectX   // getName->N:  _assignRectX   // ofs = 53014 ord = 21 addr = 0
Label21:
	aload_0_getfield _assignRectY   // get_name_1:  _assignRectY   // get_name_2:  _assignRectY   // get_Name:    _assignRectY   // getName->1:  _assignRectY   // getName->2:  _assignRectY   // getName->N:  _assignRectY   // ofs = 53018 ord = 22 addr = 0
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen.field_53026   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_53026   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_53026   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_53026   // getName->1:     // getName->2:     // getName->N:     // ofs = 53026 ord = 24 addr = 0
	if_icmple Label50
	aload_0 
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen.field_53026   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_53026   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_53026   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_53026   // getName->1:     // getName->2:     // getName->N:     // ofs = 53026 ord = 24 addr = 0
	putfield _assignRectY   // get_name_1:  _assignRectY   // get_name_2:  _assignRectY   // get_Name:    _assignRectY   // getName->1:  _assignRectY   // getName->2:  _assignRectY   // getName->N:  _assignRectY   // ofs = 53018 ord = 22 addr = 0
	return 
Label28:
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen.field_52974   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52974   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52974   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52974   // getName->1:     // getName->2:     // getName->N:     // ofs = 52974 ord = 11 addr = 0
	ifge Label33
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.ImageDisplayScreen.field_52974   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52974   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52974   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52974   // getName->1:     // getName->2:     // getName->N:     // ofs = 52974 ord = 11 addr = 0
Label33:
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen.field_52978   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52978   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52978   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52978   // getName->1:     // getName->2:     // getName->N:     // ofs = 52978 ord = 12 addr = 0
	ifge Label38
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.ImageDisplayScreen.field_52978   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52978   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52978   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52978   // getName->1:     // getName->2:     // getName->N:     // ofs = 52978 ord = 12 addr = 0
Label38:
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen.field_52974   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52974   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52974   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52974   // getName->1:     // getName->2:     // getName->N:     // ofs = 52974 ord = 11 addr = 0
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen.field_52982   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52982   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52982   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52982   // getName->1:     // getName->2:     // getName->N:     // ofs = 52982 ord = 13 addr = 0
	if_icmple Label44
	aload_0 
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen.field_52982   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52982   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52982   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52982   // getName->1:     // getName->2:     // getName->N:     // ofs = 52982 ord = 13 addr = 0
	putfield com.whatsapp.client.ImageDisplayScreen.field_52974   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52974   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52974   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52974   // getName->1:     // getName->2:     // getName->N:     // ofs = 52974 ord = 11 addr = 0
Label44:
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen.field_52978   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52978   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52978   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52978   // getName->1:     // getName->2:     // getName->N:     // ofs = 52978 ord = 12 addr = 0
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen.field_52986   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52986   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52986   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52986   // getName->1:     // getName->2:     // getName->N:     // ofs = 52986 ord = 14 addr = 0
	if_icmple Label50
	aload_0 
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen.field_52986   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52986   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52986   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52986   // getName->1:     // getName->2:     // getName->N:     // ofs = 52986 ord = 14 addr = 0
	putfield com.whatsapp.client.ImageDisplayScreen.field_52978   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52978   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52978   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52978   // getName->1:     // getName->2:     // getName->N:     // ofs = 52978 ord = 12 addr = 0
Label50:
	return 
	}


private final selectAssignRect( com.whatsapp.client.ImageDisplayScreen ); // address: 0
	{
	enter 
	new_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	dup 
	sipush 140
	sipush 180
	invokespecial_lib net.rim.device.api.system.Bitmap.<init> // pc=3
	astore_1 
	aload_1 
	invokestatic_lib module:WhatsApp-35.class#0.routine_4406(  ) // class#0
	astore_2 
	aload_2 
	iconst_0 
	iconst_0 
	sipush 140
	sipush 180
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen.field_52962   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52962   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52962   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52962   // getName->1:     // getName->2:     // getName->N:     // ofs = 52962 ord = 8 addr = 0
	aload_0_getfield _assignRectX   // get_name_1:  _assignRectX   // get_name_2:  _assignRectX   // get_Name:    _assignRectX   // getName->1:  _assignRectX   // getName->2:  _assignRectX   // getName->N:  _assignRectX   // ofs = 53014 ord = 21 addr = 0
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen.field_52994   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52994   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52994   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52994   // getName->1:     // getName->2:     // getName->N:     // ofs = 52994 ord = 16 addr = 0
	isub 
	aload_0_getfield _assignRectY   // get_name_1:  _assignRectY   // get_name_2:  _assignRectY   // get_Name:    _assignRectY   // getName->1:  _assignRectY   // getName->2:  _assignRectY   // getName->N:  _assignRectY   // ofs = 53018 ord = 22 addr = 0
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen.field_52990   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52990   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52990   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52990   // getName->1:     // getName->2:     // getName->N:     // ofs = 52990 ord = 15 addr = 0
	isub 
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=8
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.ImageDisplayScreen.launchPicker // pc=2
	return 
	}


private final launchPicker( com.whatsapp.client.ImageDisplayScreen, net.rim.device.api.system.Bitmap ); // address: 0
	{
	enter 
	aload_0_getfield _targetCID   // get_name_1:  _targetCID   // get_name_2:  _targetCID   // get_Name:    _targetCID   // getName->1:  _targetCID   // getName->2:  _targetCID   // getName->N:  _targetCID   // ofs = 53034 ord = 26 addr = 0
	ifnull Label9
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	new ImageDisplayScreen$9
	dup 
	aload_0 
	invokespecial com.whatsapp.client.ImageDisplayScreen$9.<init> // pc=2
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
Label9:
	aload_1 
	bipush 100
	invokestatic_lib net.rim.device.api.system.JPEGEncodedImage encode( net.rim.device.api.system.Bitmap, int ) // JPEGEncodedImage
	astore_2 
	aload_0 
	aload_2 
	invokevirtual byte[] getData( net.rim.device.api.system.EncodedImage ) // pc=1
	aload_2 
	invokevirtual int getOffset( net.rim.device.api.system.EncodedImage ) // pc=1
	aload_2 
	invokevirtual int getLength( net.rim.device.api.system.EncodedImage ) // pc=1
	iconst_0 
	iconst_0 
	invokestatic_lib java.lang.String encodeAsString( byte[], int, int, boolean, boolean ) // Base64OutputStream
	putfield _base64AssignPic   // get_name_1:  _base64AssignPic   // get_name_2:  _base64AssignPic   // get_Name:    _base64AssignPic   // getName->1:  _base64AssignPic   // getName->2:  _base64AssignPic   // getName->N:  _base64AssignPic   // ofs = 53030 ord = 25 addr = 0
	goto Label29
	astore_3 
	ldc literal_178:"Couldn't create contact picture from image"
	invokestatic_lib alert( java.lang.String ) // Dialog
	return 
Label29:
	aload_0_getfield _targetCID   // get_name_1:  _targetCID   // get_name_2:  _targetCID   // get_Name:    _targetCID   // getName->1:  _targetCID   // getName->2:  _targetCID   // getName->N:  _targetCID   // ofs = 53034 ord = 26 addr = 0
	ifnonnull Label40
	new ImageDisplayScreen$AssignImageContactPickerScreen
	dup 
	aload_0 
	invokespecial com.whatsapp.client.ImageDisplayScreen$AssignImageContactPickerScreen.<init> // pc=2
	astore_3 
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	aload_3 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
Label40:
	aload_0_getfield _base64AssignPic   // get_name_1:  _base64AssignPic   // get_name_2:  _base64AssignPic   // get_Name:    _base64AssignPic   // getName->1:  _base64AssignPic   // getName->2:  _base64AssignPic   // getName->N:  _base64AssignPic   // ofs = 53030 ord = 25 addr = 0
	aload_0_getfield _targetCID   // get_name_1:  _targetCID   // get_name_2:  _targetCID   // get_Name:    _targetCID   // getName->1:  _targetCID   // getName->2:  _targetCID   // getName->N:  _targetCID   // ofs = 53034 ord = 26 addr = 0
	invokestatic assignPicToContact( java.lang.String, module:WhatsApp.class#12 ) // ImageDisplayScreen
	aload_0 
	invokenonvirtual com.whatsapp.client.ImageDisplayScreen.closeScreen // pc=1
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	invokevirtual net.rim.device.api.ui.Screen getActiveScreen( net.rim.device.api.ui.UiApplication ) // pc=1
	instanceof_lib com.whatsapp.client.ContactDetailScreen//module:WhatsApp-13.class#0 module:WhatsApp-13.class#0 module:WhatsApp-13.class#0
	ifeq Label53
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	invokevirtual net.rim.device.api.ui.Screen getActiveScreen( net.rim.device.api.ui.UiApplication ) // pc=1
	checkcast_lib com.whatsapp.client.ContactDetailScreen//module:WhatsApp-13.class#0 module:WhatsApp-13.class#0 module:WhatsApp-13.class#0
	invokenonvirtual_lib .routine_88 // pc=1
Label53:
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final makeScaledBitmap( com.whatsapp.client.ImageDisplayScreen, int, int ); // address: 0
	{
	enter 
	aload_0_getfield _eImageOriginal   // get_name_1:  _eImageOriginal   // get_name_2:  _eImageOriginal   // get_Name:    _eImageOriginal   // getName->1:  _eImageOriginal   // getName->2:  _eImageOriginal   // getName->N:  _eImageOriginal   // ofs = 52958 ord = 7 addr = 0
	invokevirtual int getWidth( net.rim.device.api.system.EncodedImage ) // pc=1
	invokestatic_lib int toFP( int ) // Fixed32
	istore_4 
	aload_0_getfield _eImageOriginal   // get_name_1:  _eImageOriginal   // get_name_2:  _eImageOriginal   // get_Name:    _eImageOriginal   // getName->1:  _eImageOriginal   // getName->2:  _eImageOriginal   // getName->N:  _eImageOriginal   // ofs = 52958 ord = 7 addr = 0
	invokevirtual int getHeight( net.rim.device.api.system.EncodedImage ) // pc=1
	invokestatic_lib int toFP( int ) // Fixed32
	istore_5 
	iload_1 
	invokestatic_lib int toFP( int ) // Fixed32
	istore_6 
	iload_2 
	invokestatic_lib int toFP( int ) // Fixed32
	istore_7 
	aload_0_getfield _needsRotate   // get_name_1:  _needsRotate   // get_name_2:  _needsRotate   // get_Name:    _needsRotate   // getName->1:  _needsRotate   // getName->2:  _needsRotate   // getName->N:  _needsRotate   // ofs = 52970 ord = 10 addr = 0
	ifeq Label26
	iload_5 
	iload_6 
	invokestatic_lib int div( int, int ) // Fixed32
	istore 8
	iload_4 
	iload_7 
	invokestatic_lib int div( int, int ) // Fixed32
	istore 9
	goto Label34
Label26:
	iload_5 
	iload_7 
	invokestatic_lib int div( int, int ) // Fixed32
	istore 8
	iload_4 
	iload_6 
	invokestatic_lib int div( int, int ) // Fixed32
	istore 9
Label34:
	iload 8
	iload 9
	if_icmple Label43
	aload_0_getfield _eImageOriginal   // get_name_1:  _eImageOriginal   // get_name_2:  _eImageOriginal   // get_Name:    _eImageOriginal   // getName->1:  _eImageOriginal   // getName->2:  _eImageOriginal   // getName->N:  _eImageOriginal   // ofs = 52958 ord = 7 addr = 0
	iload 8
	iload 8
	invokevirtual net.rim.device.api.system.EncodedImage scaleImage32( net.rim.device.api.system.EncodedImage, int, int ) // pc=3
	astore_3 
	goto Label48
Label43:
	aload_0_getfield _eImageOriginal   // get_name_1:  _eImageOriginal   // get_name_2:  _eImageOriginal   // get_Name:    _eImageOriginal   // getName->1:  _eImageOriginal   // getName->2:  _eImageOriginal   // getName->N:  _eImageOriginal   // ofs = 52958 ord = 7 addr = 0
	iload 9
	iload 9
	invokevirtual net.rim.device.api.system.EncodedImage scaleImage32( net.rim.device.api.system.EncodedImage, int, int ) // pc=3
	astore_3 
Label48:
	aload_0 
	aload_3 
	invokevirtual net.rim.device.api.system.Bitmap getBitmap( net.rim.device.api.system.EncodedImage ) // pc=1
	putfield com.whatsapp.client.ImageDisplayScreen.field_52962   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52962   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52962   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52962   // getName->1:     // getName->2:     // getName->N:     // ofs = 52962 ord = 8 addr = 0
	aload_0_getfield _needsRotate   // get_name_1:  _needsRotate   // get_name_2:  _needsRotate   // get_Name:    _needsRotate   // getName->1:  _needsRotate   // getName->2:  _needsRotate   // getName->N:  _needsRotate   // ofs = 52970 ord = 10 addr = 0
	ifeq Label58
	aload_0 
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen.field_52962   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52962   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52962   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52962   // getName->1:     // getName->2:     // getName->N:     // ofs = 52962 ord = 8 addr = 0
	invokestatic_lib module:WhatsApp-23.class#8.routine_4254(  ) // class#8
	putfield com.whatsapp.client.ImageDisplayScreen.field_52962   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52962   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52962   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52962   // getName->1:     // getName->2:     // getName->N:     // ofs = 52962 ord = 8 addr = 0
Label58:
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen.field_52962   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52962   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52962   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52962   // getName->1:     // getName->2:     // getName->N:     // ofs = 52962 ord = 8 addr = 0
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	istore 10
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen.field_52962   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52962   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52962   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52962   // getName->1:     // getName->2:     // getName->N:     // ofs = 52962 ord = 8 addr = 0
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	istore 11
	aload_0 
	iload_2 
	iload 11
	isub 
	bipush 2
	idiv 
	putfield com.whatsapp.client.ImageDisplayScreen.field_52990   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52990   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52990   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52990   // getName->1:     // getName->2:     // getName->N:     // ofs = 52990 ord = 15 addr = 0
	aload_0 
	iload_1 
	iload 10
	isub 
	bipush 2
	idiv 
	putfield com.whatsapp.client.ImageDisplayScreen.field_52994   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52994   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52994   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52994   // getName->1:     // getName->2:     // getName->N:     // ofs = 52994 ord = 16 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen.field_52994   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52994   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52994   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52994   // getName->1:     // getName->2:     // getName->N:     // ofs = 52994 ord = 16 addr = 0
	iload 10
	sipush 140
	isub 
	iadd 
	putfield com.whatsapp.client.ImageDisplayScreen.field_53022   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_53022   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_53022   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_53022   // getName->1:     // getName->2:     // getName->N:     // ofs = 53022 ord = 23 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen.field_52990   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52990   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52990   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52990   // getName->1:     // getName->2:     // getName->N:     // ofs = 52990 ord = 15 addr = 0
	iload 11
	sipush 180
	isub 
	iadd 
	putfield com.whatsapp.client.ImageDisplayScreen.field_53026   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_53026   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_53026   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_53026   // getName->1:     // getName->2:     // getName->N:     // ofs = 53026 ord = 24 addr = 0
	return 
	}


protected final sublayout( com.whatsapp.client.ImageDisplayScreen, int, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.container.FullScreen.sublayout // pc=3
	aload_0_getfield _eImageOriginal   // get_name_1:  _eImageOriginal   // get_name_2:  _eImageOriginal   // get_Name:    _eImageOriginal   // getName->1:  _eImageOriginal   // getName->2:  _eImageOriginal   // getName->N:  _eImageOriginal   // ofs = 52958 ord = 7 addr = 0
	invokevirtual int getWidth( net.rim.device.api.system.EncodedImage ) // pc=1
	iload_1 
	if_icmple Label16
	aload_0 
	aload_0_getfield _eImageOriginal   // get_name_1:  _eImageOriginal   // get_name_2:  _eImageOriginal   // get_Name:    _eImageOriginal   // getName->1:  _eImageOriginal   // getName->2:  _eImageOriginal   // getName->N:  _eImageOriginal   // ofs = 52958 ord = 7 addr = 0
	invokevirtual int getWidth( net.rim.device.api.system.EncodedImage ) // pc=1
	iload_1 
	isub 
	putfield com.whatsapp.client.ImageDisplayScreen.field_52982   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52982   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52982   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52982   // getName->1:     // getName->2:     // getName->N:     // ofs = 52982 ord = 13 addr = 0
	goto Label24
Label16:
	aload_0 
	iload_1 
	aload_0_getfield _eImageOriginal   // get_name_1:  _eImageOriginal   // get_name_2:  _eImageOriginal   // get_Name:    _eImageOriginal   // getName->1:  _eImageOriginal   // getName->2:  _eImageOriginal   // getName->N:  _eImageOriginal   // ofs = 52958 ord = 7 addr = 0
	invokevirtual int getWidth( net.rim.device.api.system.EncodedImage ) // pc=1
	isub 
	bipush 2
	idiv 
	putfield com.whatsapp.client.ImageDisplayScreen.field_52998   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52998   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52998   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52998   // getName->1:     // getName->2:     // getName->N:     // ofs = 52998 ord = 17 addr = 0
Label24:
	aload_0_getfield _eImageOriginal   // get_name_1:  _eImageOriginal   // get_name_2:  _eImageOriginal   // get_Name:    _eImageOriginal   // getName->1:  _eImageOriginal   // getName->2:  _eImageOriginal   // getName->N:  _eImageOriginal   // ofs = 52958 ord = 7 addr = 0
	invokevirtual int getHeight( net.rim.device.api.system.EncodedImage ) // pc=1
	iload_2 
	if_icmple Label35
	aload_0 
	aload_0_getfield _eImageOriginal   // get_name_1:  _eImageOriginal   // get_name_2:  _eImageOriginal   // get_Name:    _eImageOriginal   // getName->1:  _eImageOriginal   // getName->2:  _eImageOriginal   // getName->N:  _eImageOriginal   // ofs = 52958 ord = 7 addr = 0
	invokevirtual int getHeight( net.rim.device.api.system.EncodedImage ) // pc=1
	iload_2 
	isub 
	putfield com.whatsapp.client.ImageDisplayScreen.field_52986   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52986   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52986   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52986   // getName->1:     // getName->2:     // getName->N:     // ofs = 52986 ord = 14 addr = 0
	goto Label43
Label35:
	aload_0 
	iload_2 
	aload_0_getfield _eImageOriginal   // get_name_1:  _eImageOriginal   // get_name_2:  _eImageOriginal   // get_Name:    _eImageOriginal   // getName->1:  _eImageOriginal   // getName->2:  _eImageOriginal   // getName->N:  _eImageOriginal   // ofs = 52958 ord = 7 addr = 0
	invokevirtual int getHeight( net.rim.device.api.system.EncodedImage ) // pc=1
	isub 
	bipush 2
	idiv 
	putfield com.whatsapp.client.ImageDisplayScreen.field_53002   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_53002   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_53002   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_53002   // getName->1:     // getName->2:     // getName->N:     // ofs = 53002 ord = 18 addr = 0
Label43:
	aload_0 
	iload_1 
	iload_2 
	invokenonvirtual com.whatsapp.client.ImageDisplayScreen.makeScaledBitmap // pc=3
	return 
	}


protected final paint( com.whatsapp.client.ImageDisplayScreen, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter 
	aload_0_getfield _fitMode   // get_name_1:  _fitMode   // get_name_2:  _fitMode   // get_Name:    _fitMode   // getName->1:  _fitMode   // getName->2:  _fitMode   // getName->N:  _fitMode   // ofs = 53006 ord = 19 addr = 0
	ifeq Label18
	aload_1 
	iconst_0 
	invokevirtual setBackgroundColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	invokevirtual clear( net.rim.device.api.ui.Graphics ) // pc=1
	aload_1 
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen.field_52994   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52994   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52994   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52994   // getName->1:     // getName->2:     // getName->N:     // ofs = 52994 ord = 16 addr = 0
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen.field_52990   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52990   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52990   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52990   // getName->1:     // getName->2:     // getName->N:     // ofs = 52990 ord = 15 addr = 0
	invokestatic_lib int getWidth(  ) // Display
	invokestatic_lib int getHeight(  ) // Display
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen.field_52962   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52962   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52962   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52962   // getName->1:     // getName->2:     // getName->N:     // ofs = 52962 ord = 8 addr = 0
	iconst_0 
	iconst_0 
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=8
	goto Label65
Label18:
	aload_0_getfield _bitmapFull   // get_name_1:  _bitmapFull   // get_name_2:  _bitmapFull   // get_Name:    _bitmapFull   // getName->1:  _bitmapFull   // getName->2:  _bitmapFull   // getName->N:  _bitmapFull   // ofs = 52966 ord = 9 addr = 0
	ifnonnull Label56
	aload_0_getfield _needsRotate   // get_name_1:  _needsRotate   // get_name_2:  _needsRotate   // get_Name:    _needsRotate   // getName->1:  _needsRotate   // getName->2:  _needsRotate   // getName->N:  _needsRotate   // ofs = 52970 ord = 10 addr = 0
	ifeq Label25
	aload_0_getfield _eImageOriginal   // get_name_1:  _eImageOriginal   // get_name_2:  _eImageOriginal   // get_Name:    _eImageOriginal   // getName->1:  _eImageOriginal   // getName->2:  _eImageOriginal   // getName->N:  _eImageOriginal   // ofs = 52958 ord = 7 addr = 0
	invokevirtual int getHeight( net.rim.device.api.system.EncodedImage ) // pc=1
	goto Label27
Label25:
	aload_0_getfield _eImageOriginal   // get_name_1:  _eImageOriginal   // get_name_2:  _eImageOriginal   // get_Name:    _eImageOriginal   // getName->1:  _eImageOriginal   // getName->2:  _eImageOriginal   // getName->N:  _eImageOriginal   // ofs = 52958 ord = 7 addr = 0
	invokevirtual int getWidth( net.rim.device.api.system.EncodedImage ) // pc=1
Label27:
	istore_2 
	aload_0_getfield _needsRotate   // get_name_1:  _needsRotate   // get_name_2:  _needsRotate   // get_Name:    _needsRotate   // getName->1:  _needsRotate   // getName->2:  _needsRotate   // getName->N:  _needsRotate   // ofs = 52970 ord = 10 addr = 0
	ifeq Label33
	aload_0_getfield _eImageOriginal   // get_name_1:  _eImageOriginal   // get_name_2:  _eImageOriginal   // get_Name:    _eImageOriginal   // getName->1:  _eImageOriginal   // getName->2:  _eImageOriginal   // getName->N:  _eImageOriginal   // ofs = 52958 ord = 7 addr = 0
	invokevirtual int getWidth( net.rim.device.api.system.EncodedImage ) // pc=1
	goto Label35
Label33:
	aload_0_getfield _eImageOriginal   // get_name_1:  _eImageOriginal   // get_name_2:  _eImageOriginal   // get_Name:    _eImageOriginal   // getName->1:  _eImageOriginal   // getName->2:  _eImageOriginal   // getName->N:  _eImageOriginal   // ofs = 52958 ord = 7 addr = 0
	invokevirtual int getHeight( net.rim.device.api.system.EncodedImage ) // pc=1
Label35:
	istore_3 
	aload_0 
	new_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	dup 
	iload_2 
	iload_3 
	invokespecial_lib net.rim.device.api.system.Bitmap.<init> // pc=3
	putfield _bitmapFull   // get_name_1:  _bitmapFull   // get_name_2:  _bitmapFull   // get_Name:    _bitmapFull   // getName->1:  _bitmapFull   // getName->2:  _bitmapFull   // getName->N:  _bitmapFull   // ofs = 52966 ord = 9 addr = 0
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen.field_52962   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52962   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52962   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52962   // getName->1:     // getName->2:     // getName->N:     // ofs = 52962 ord = 8 addr = 0
	aload_0_getfield _bitmapFull   // get_name_1:  _bitmapFull   // get_name_2:  _bitmapFull   // get_Name:    _bitmapFull   // getName->1:  _bitmapFull   // getName->2:  _bitmapFull   // getName->N:  _bitmapFull   // ofs = 52966 ord = 9 addr = 0
	invokestatic_lib module:WhatsApp-35.class#0.routine_5536(  ) // class#0
	new ImageDisplayScreen$8
	dup 
	aload_0 
	invokespecial com.whatsapp.client.ImageDisplayScreen$8.<init> // pc=2
	astore_4 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	aload_4 
	invokespecial_lib java.lang.Thread.<init> // pc=2
	invokevirtual start( java.lang.Thread ) // pc=1
Label56:
	aload_1 
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen.field_52998   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52998   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52998   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52998   // getName->1:     // getName->2:     // getName->N:     // ofs = 52998 ord = 17 addr = 0
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen.field_53002   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_53002   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_53002   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_53002   // getName->1:     // getName->2:     // getName->N:     // ofs = 53002 ord = 18 addr = 0
	invokestatic_lib int getWidth(  ) // Display
	invokestatic_lib int getHeight(  ) // Display
	aload_0_getfield _bitmapFull   // get_name_1:  _bitmapFull   // get_name_2:  _bitmapFull   // get_Name:    _bitmapFull   // getName->1:  _bitmapFull   // getName->2:  _bitmapFull   // getName->N:  _bitmapFull   // ofs = 52966 ord = 9 addr = 0
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen.field_52974   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52974   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52974   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52974   // getName->1:     // getName->2:     // getName->N:     // ofs = 52974 ord = 11 addr = 0
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen.field_52978   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52978   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52978   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52978   // getName->1:     // getName->2:     // getName->N:     // ofs = 52978 ord = 12 addr = 0
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=8
Label65:
	aload_0_getfield _assignRectMode   // get_name_1:  _assignRectMode   // get_name_2:  _assignRectMode   // get_Name:    _assignRectMode   // getName->1:  _assignRectMode   // getName->2:  _assignRectMode   // getName->N:  _assignRectMode   // ofs = 53010 ord = 20 addr = 0
	ifeq Label109
	aload_1 
	iconst_0 
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	aload_0_getfield _assignRectX   // get_name_1:  _assignRectX   // get_name_2:  _assignRectX   // get_Name:    _assignRectX   // getName->1:  _assignRectX   // getName->2:  _assignRectX   // getName->N:  _assignRectX   // ofs = 53014 ord = 21 addr = 0
	aload_0_getfield _assignRectY   // get_name_1:  _assignRectY   // get_name_2:  _assignRectY   // get_Name:    _assignRectY   // getName->1:  _assignRectY   // getName->2:  _assignRectY   // getName->N:  _assignRectY   // ofs = 53018 ord = 22 addr = 0
	sipush 140
	sipush 180
	invokevirtual drawRect( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	aload_1 
	aload_0_getfield _assignRectX   // get_name_1:  _assignRectX   // get_name_2:  _assignRectX   // get_Name:    _assignRectX   // getName->1:  _assignRectX   // getName->2:  _assignRectX   // getName->N:  _assignRectX   // ofs = 53014 ord = 21 addr = 0
	iconst_1 
	iadd 
	aload_0_getfield _assignRectY   // get_name_1:  _assignRectY   // get_name_2:  _assignRectY   // get_Name:    _assignRectY   // getName->1:  _assignRectY   // getName->2:  _assignRectY   // getName->N:  _assignRectY   // ofs = 53018 ord = 22 addr = 0
	iconst_1 
	iadd 
	sipush 138
	sipush 178
	invokevirtual drawRect( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	aload_1 
	iipush 16777215
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	aload_0_getfield _assignRectX   // get_name_1:  _assignRectX   // get_name_2:  _assignRectX   // get_Name:    _assignRectX   // getName->1:  _assignRectX   // getName->2:  _assignRectX   // getName->N:  _assignRectX   // ofs = 53014 ord = 21 addr = 0
	bipush 2
	iadd 
	aload_0_getfield _assignRectY   // get_name_1:  _assignRectY   // get_name_2:  _assignRectY   // get_Name:    _assignRectY   // getName->1:  _assignRectY   // getName->2:  _assignRectY   // getName->N:  _assignRectY   // ofs = 53018 ord = 22 addr = 0
	bipush 2
	iadd 
	sipush 136
	sipush 176
	invokevirtual drawRect( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	aload_1 
	aload_0_getfield _assignRectX   // get_name_1:  _assignRectX   // get_name_2:  _assignRectX   // get_Name:    _assignRectX   // getName->1:  _assignRectX   // getName->2:  _assignRectX   // getName->N:  _assignRectX   // ofs = 53014 ord = 21 addr = 0
	bipush 3
	iadd 
	aload_0_getfield _assignRectY   // get_name_1:  _assignRectY   // get_name_2:  _assignRectY   // get_Name:    _assignRectY   // getName->1:  _assignRectY   // getName->2:  _assignRectY   // getName->N:  _assignRectY   // ofs = 53018 ord = 22 addr = 0
	bipush 3
	iadd 
	sipush 134
	sipush 174
	invokevirtual drawRect( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
Label109:
	return 
	}


protected final boolean navigationClick( com.whatsapp.client.ImageDisplayScreen, int, int ); // address: 0
	{
	enter_narrow 
	invokestatic_lib boolean isSupported(  ) // Trackball
	ifne Label5
	invokestatic_lib boolean isSupported(  ) // Touchscreen
	ifeq Label22
Label5:
	aload_0_getfield _assignRectMode   // get_name_1:  _assignRectMode   // get_name_2:  _assignRectMode   // get_Name:    _assignRectMode   // getName->1:  _assignRectMode   // getName->2:  _assignRectMode   // getName->N:  _assignRectMode   // ofs = 53010 ord = 20 addr = 0
	ifeq Label11
	aload_0 
	invokespecial com.whatsapp.client.ImageDisplayScreen.selectAssignRect // pc=1
	iconst_1 
	ireturn 
Label11:
	aload_0 
	aload_0_getfield _fitMode   // get_name_1:  _fitMode   // get_name_2:  _fitMode   // get_Name:    _fitMode   // getName->1:  _fitMode   // getName->2:  _fitMode   // getName->N:  _fitMode   // ofs = 53006 ord = 19 addr = 0
	ifne Label16
	iconst_1 
	goto Label17
Label16:
	iconst_0 
Label17:
	putfield _fitMode   // get_name_1:  _fitMode   // get_name_2:  _fitMode   // get_Name:    _fitMode   // getName->1:  _fitMode   // getName->2:  _fitMode   // getName->N:  _fitMode   // ofs = 53006 ord = 19 addr = 0
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Screen ) // pc=1
	iconst_1 
	ireturn 
Label22:
	aload_0 
	iload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.Screen.navigationClick // pc=3
	ireturn 
	}


protected final boolean navigationMovement( com.whatsapp.client.ImageDisplayScreen, int, int, int, int ); // address: 0
	{
	enter 
	aload_0_getfield _assignRectMode   // get_name_1:  _assignRectMode   // get_name_2:  _assignRectMode   // get_Name:    _assignRectMode   // getName->1:  _assignRectMode   // getName->2:  _assignRectMode   // getName->N:  _assignRectMode   // ofs = 53010 ord = 20 addr = 0
	ifeq Label16
	aload_0 
	aload_0_getfield _assignRectX   // get_name_1:  _assignRectX   // get_name_2:  _assignRectX   // get_Name:    _assignRectX   // getName->1:  _assignRectX   // getName->2:  _assignRectX   // getName->N:  _assignRectX   // ofs = 53014 ord = 21 addr = 0
	iload_1 
	iadd 
	putfield _assignRectX   // get_name_1:  _assignRectX   // get_name_2:  _assignRectX   // get_Name:    _assignRectX   // getName->1:  _assignRectX   // getName->2:  _assignRectX   // getName->N:  _assignRectX   // ofs = 53014 ord = 21 addr = 0
	aload_0 
	aload_0_getfield _assignRectY   // get_name_1:  _assignRectY   // get_name_2:  _assignRectY   // get_Name:    _assignRectY   // getName->1:  _assignRectY   // getName->2:  _assignRectY   // getName->N:  _assignRectY   // ofs = 53018 ord = 22 addr = 0
	iload_2 
	iadd 
	putfield _assignRectY   // get_name_1:  _assignRectY   // get_name_2:  _assignRectY   // get_Name:    _assignRectY   // getName->1:  _assignRectY   // getName->2:  _assignRectY   // getName->N:  _assignRectY   // ofs = 53018 ord = 22 addr = 0
	aload_0 
	invokespecial com.whatsapp.client.ImageDisplayScreen.routine_1323 // pc=1
	goto Label36
Label16:
	aload_0_getfield _fitMode   // get_name_1:  _fitMode   // get_name_2:  _fitMode   // get_Name:    _fitMode   // getName->1:  _fitMode   // getName->2:  _fitMode   // getName->N:  _fitMode   // ofs = 53006 ord = 19 addr = 0
	ifeq Label20
	iconst_1 
	ireturn 
Label20:
	aload_0 
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen.field_52974   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52974   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52974   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52974   // getName->1:     // getName->2:     // getName->N:     // ofs = 52974 ord = 11 addr = 0
	iload_1 
	bipush 10
	imul 
	iadd 
	putfield com.whatsapp.client.ImageDisplayScreen.field_52974   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52974   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52974   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52974   // getName->1:     // getName->2:     // getName->N:     // ofs = 52974 ord = 11 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen.field_52978   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52978   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52978   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52978   // getName->1:     // getName->2:     // getName->N:     // ofs = 52978 ord = 12 addr = 0
	iload_2 
	bipush 10
	imul 
	iadd 
	putfield com.whatsapp.client.ImageDisplayScreen.field_52978   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52978   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52978   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52978   // getName->1:     // getName->2:     // getName->N:     // ofs = 52978 ord = 12 addr = 0
	aload_0 
	invokespecial com.whatsapp.client.ImageDisplayScreen.routine_1323 // pc=1
Label36:
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Screen ) // pc=1
	iconst_1 
	ireturn 
	}


protected final boolean touchEvent( com.whatsapp.client.ImageDisplayScreen, net.rim.device.api.ui.TouchEvent ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual int getEvent( net.rim.device.api.ui.TouchEvent ) // pc=1
	iconst_1 
	if_icmpne Label65
	aload_0_getfield _assignRectMode   // get_name_1:  _assignRectMode   // get_name_2:  _assignRectMode   // get_Name:    _assignRectMode   // getName->1:  _assignRectMode   // getName->2:  _assignRectMode   // getName->N:  _assignRectMode   // ofs = 53010 ord = 20 addr = 0
	ifne Label65
	aload_1 
	invokevirtual net.rim.device.api.ui.TouchGesture getGesture( net.rim.device.api.ui.TouchEvent ) // pc=1
	astore_2 
	aload_2 
	invokevirtual int getEvent( net.rim.device.api.ui.TouchGesture ) // pc=1
	istore_3 
	iload_3 
	sipush 13572
	if_icmpeq Label17
	goto_w Label233
Label17:
	aload_2 
	invokevirtual int getSwipeMagnitude( net.rim.device.api.ui.TouchGesture ) // pc=1
	istore_4 
	aload_2 
	invokevirtual int getSwipeDirection( net.rim.device.api.ui.TouchGesture ) // pc=1
	istore_5 
	iload_5 
	bipush 4
	iand 
	ifle Label32
	aload_0 
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen.field_52974   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52974   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52974   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52974   // getName->1:     // getName->2:     // getName->N:     // ofs = 52974 ord = 11 addr = 0
	iload_4 
	isub 
	putfield com.whatsapp.client.ImageDisplayScreen.field_52974   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52974   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52974   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52974   // getName->1:     // getName->2:     // getName->N:     // ofs = 52974 ord = 11 addr = 0
Label32:
	iload_5 
	iconst_1 
	iand 
	ifle Label41
	aload_0 
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen.field_52978   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52978   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52978   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52978   // getName->1:     // getName->2:     // getName->N:     // ofs = 52978 ord = 12 addr = 0
	iload_4 
	iadd 
	putfield com.whatsapp.client.ImageDisplayScreen.field_52978   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52978   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52978   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52978   // getName->1:     // getName->2:     // getName->N:     // ofs = 52978 ord = 12 addr = 0
Label41:
	iload_5 
	bipush 2
	iand 
	ifle Label50
	aload_0 
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen.field_52978   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52978   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52978   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52978   // getName->1:     // getName->2:     // getName->N:     // ofs = 52978 ord = 12 addr = 0
	iload_4 
	isub 
	putfield com.whatsapp.client.ImageDisplayScreen.field_52978   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52978   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52978   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52978   // getName->1:     // getName->2:     // getName->N:     // ofs = 52978 ord = 12 addr = 0
Label50:
	iload_5 
	bipush 8
	iand 
	ifle Label59
	aload_0 
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen.field_52974   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52974   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52974   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52974   // getName->1:     // getName->2:     // getName->N:     // ofs = 52974 ord = 11 addr = 0
	iload_4 
	iadd 
	putfield com.whatsapp.client.ImageDisplayScreen.field_52974   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52974   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52974   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52974   // getName->1:     // getName->2:     // getName->N:     // ofs = 52974 ord = 11 addr = 0
Label59:
	aload_0 
	invokespecial com.whatsapp.client.ImageDisplayScreen.routine_1323 // pc=1
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Screen ) // pc=1
	iconst_1 
	ireturn 
Label65:
	aload_1 
	invokevirtual int getEvent( net.rim.device.api.ui.TouchEvent ) // pc=1
	sipush 13569
	if_icmpne Label95
	aload_0_getfield _assignRectMode   // get_name_1:  _assignRectMode   // get_name_2:  _assignRectMode   // get_Name:    _assignRectMode   // getName->1:  _assignRectMode   // getName->2:  _assignRectMode   // getName->N:  _assignRectMode   // ofs = 53010 ord = 20 addr = 0
	ifeq Label95
	aload_1 
	iconst_1 
	invokevirtual int getX( net.rim.device.api.ui.TouchEvent, int ) // pc=2
	istore_2 
	aload_1 
	iconst_1 
	invokevirtual int getY( net.rim.device.api.ui.TouchEvent, int ) // pc=2
	istore_3 
	aload_0 
	iload_2 
	bipush 70
	isub 
	putfield _assignRectX   // get_name_1:  _assignRectX   // get_name_2:  _assignRectX   // get_Name:    _assignRectX   // getName->1:  _assignRectX   // getName->2:  _assignRectX   // getName->N:  _assignRectX   // ofs = 53014 ord = 21 addr = 0
	aload_0 
	iload_3 
	bipush 90
	isub 
	putfield _assignRectY   // get_name_1:  _assignRectY   // get_name_2:  _assignRectY   // get_Name:    _assignRectY   // getName->1:  _assignRectY   // getName->2:  _assignRectY   // getName->N:  _assignRectY   // ofs = 53018 ord = 22 addr = 0
	aload_0 
	invokespecial com.whatsapp.client.ImageDisplayScreen.routine_1323 // pc=1
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Screen ) // pc=1
	iconst_1 
	ireturn 
Label95:
	aload_1 
	invokevirtual int getEvent( net.rim.device.api.ui.TouchEvent ) // pc=1
	sipush 13573
	if_icmpeq Label100
	goto_w Label197
Label100:
	aload_0_getfield _assignRectMode   // get_name_1:  _assignRectMode   // get_name_2:  _assignRectMode   // get_Name:    _assignRectMode   // getName->1:  _assignRectMode   // getName->2:  _assignRectMode   // getName->N:  _assignRectMode   // ofs = 53010 ord = 20 addr = 0
	ifeq Label105
	aload_0 
	invokespecial com.whatsapp.client.ImageDisplayScreen.selectAssignRect // pc=1
	goto_w Label193
Label105:
	aload_0_getfield _fitMode   // get_name_1:  _fitMode   // get_name_2:  _fitMode   // get_Name:    _fitMode   // getName->1:  _fitMode   // getName->2:  _fitMode   // getName->N:  _fitMode   // ofs = 53006 ord = 19 addr = 0
	ifne Label108
	goto_w Label186
Label108:
	aload_1 
	iconst_1 
	invokevirtual int getX( net.rim.device.api.ui.TouchEvent, int ) // pc=2
	istore_2 
	aload_1 
	iconst_1 
	invokevirtual int getY( net.rim.device.api.ui.TouchEvent, int ) // pc=2
	istore_3 
	iload_2 
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen.field_52994   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52994   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52994   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52994   // getName->1:     // getName->2:     // getName->N:     // ofs = 52994 ord = 16 addr = 0
	if_icmplt Label134
	iload_2 
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen.field_52994   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52994   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52994   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52994   // getName->1:     // getName->2:     // getName->N:     // ofs = 52994 ord = 16 addr = 0
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen.field_52962   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52962   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52962   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52962   // getName->1:     // getName->2:     // getName->N:     // ofs = 52962 ord = 8 addr = 0
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	iadd 
	if_icmpgt Label134
	iload_3 
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen.field_52990   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52990   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52990   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52990   // getName->1:     // getName->2:     // getName->N:     // ofs = 52990 ord = 15 addr = 0
	if_icmplt Label134
	iload_3 
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen.field_52990   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52990   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52990   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52990   // getName->1:     // getName->2:     // getName->N:     // ofs = 52990 ord = 15 addr = 0
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen.field_52962   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52962   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52962   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52962   // getName->1:     // getName->2:     // getName->N:     // ofs = 52962 ord = 8 addr = 0
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	iadd 
	if_icmple Label136
Label134:
	iconst_1 
	ireturn 
Label136:
	aload_0_getfield _needsRotate   // get_name_1:  _needsRotate   // get_name_2:  _needsRotate   // get_Name:    _needsRotate   // getName->1:  _needsRotate   // getName->2:  _needsRotate   // getName->N:  _needsRotate   // ofs = 52970 ord = 10 addr = 0
	ifeq Label141
	aload_0_getfield _eImageOriginal   // get_name_1:  _eImageOriginal   // get_name_2:  _eImageOriginal   // get_Name:    _eImageOriginal   // getName->1:  _eImageOriginal   // getName->2:  _eImageOriginal   // getName->N:  _eImageOriginal   // ofs = 52958 ord = 7 addr = 0
	invokevirtual int getHeight( net.rim.device.api.system.EncodedImage ) // pc=1
	goto Label143
Label141:
	aload_0_getfield _eImageOriginal   // get_name_1:  _eImageOriginal   // get_name_2:  _eImageOriginal   // get_Name:    _eImageOriginal   // getName->1:  _eImageOriginal   // getName->2:  _eImageOriginal   // getName->N:  _eImageOriginal   // ofs = 52958 ord = 7 addr = 0
	invokevirtual int getWidth( net.rim.device.api.system.EncodedImage ) // pc=1
Label143:
	istore_4 
	aload_0_getfield _needsRotate   // get_name_1:  _needsRotate   // get_name_2:  _needsRotate   // get_Name:    _needsRotate   // getName->1:  _needsRotate   // getName->2:  _needsRotate   // getName->N:  _needsRotate   // ofs = 52970 ord = 10 addr = 0
	ifeq Label149
	aload_0_getfield _eImageOriginal   // get_name_1:  _eImageOriginal   // get_name_2:  _eImageOriginal   // get_Name:    _eImageOriginal   // getName->1:  _eImageOriginal   // getName->2:  _eImageOriginal   // getName->N:  _eImageOriginal   // ofs = 52958 ord = 7 addr = 0
	invokevirtual int getWidth( net.rim.device.api.system.EncodedImage ) // pc=1
	goto Label151
Label149:
	aload_0_getfield _eImageOriginal   // get_name_1:  _eImageOriginal   // get_name_2:  _eImageOriginal   // get_Name:    _eImageOriginal   // getName->1:  _eImageOriginal   // getName->2:  _eImageOriginal   // getName->N:  _eImageOriginal   // ofs = 52958 ord = 7 addr = 0
	invokevirtual int getHeight( net.rim.device.api.system.EncodedImage ) // pc=1
Label151:
	istore_5 
	iload_2 
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen.field_52994   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52994   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52994   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52994   // getName->1:     // getName->2:     // getName->N:     // ofs = 52994 ord = 16 addr = 0
	isub 
	iload_4 
	imul 
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen.field_52962   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52962   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52962   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52962   // getName->1:     // getName->2:     // getName->N:     // ofs = 52962 ord = 8 addr = 0
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	idiv 
	istore_6 
	iload_3 
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen.field_52990   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52990   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52990   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52990   // getName->1:     // getName->2:     // getName->N:     // ofs = 52990 ord = 15 addr = 0
	isub 
	iload_5 
	imul 
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen.field_52962   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52962   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52962   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52962   // getName->1:     // getName->2:     // getName->N:     // ofs = 52962 ord = 8 addr = 0
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	idiv 
	istore_7 
	aload_0 
	iload_6 
	invokestatic_lib int getWidth(  ) // Display
	bipush 2
	idiv 
	isub 
	putfield com.whatsapp.client.ImageDisplayScreen.field_52974   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52974   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52974   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52974   // getName->1:     // getName->2:     // getName->N:     // ofs = 52974 ord = 11 addr = 0
	aload_0 
	iload_7 
	invokestatic_lib int getHeight(  ) // Display
	bipush 2
	idiv 
	isub 
	putfield com.whatsapp.client.ImageDisplayScreen.field_52978   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52978   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52978   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52978   // getName->1:     // getName->2:     // getName->N:     // ofs = 52978 ord = 12 addr = 0
	aload_0 
	invokespecial com.whatsapp.client.ImageDisplayScreen.routine_1323 // pc=1
Label186:
	aload_0 
	aload_0_getfield _fitMode   // get_name_1:  _fitMode   // get_name_2:  _fitMode   // get_Name:    _fitMode   // getName->1:  _fitMode   // getName->2:  _fitMode   // getName->N:  _fitMode   // ofs = 53006 ord = 19 addr = 0
	ifne Label191
	iconst_1 
	goto Label192
Label191:
	iconst_0 
Label192:
	putfield _fitMode   // get_name_1:  _fitMode   // get_name_2:  _fitMode   // get_Name:    _fitMode   // getName->1:  _fitMode   // getName->2:  _fitMode   // getName->N:  _fitMode   // ofs = 53006 ord = 19 addr = 0
Label193:
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Screen ) // pc=1
	iconst_1 
	ireturn 
Label197:
	aload_1 
	invokevirtual int getEvent( net.rim.device.api.ui.TouchEvent ) // pc=1
	sipush 13574
	if_icmpne Label203
	iconst_1 
	ireturn 
Label203:
	aload_1 
	invokevirtual int getEvent( net.rim.device.api.ui.TouchEvent ) // pc=1
	sipush 13571
	if_icmpne Label233
	aload_0_getfield _assignRectMode   // get_name_1:  _assignRectMode   // get_name_2:  _assignRectMode   // get_Name:    _assignRectMode   // getName->1:  _assignRectMode   // getName->2:  _assignRectMode   // getName->N:  _assignRectMode   // ofs = 53010 ord = 20 addr = 0
	ifeq Label233
	aload_1 
	iconst_1 
	invokevirtual int getX( net.rim.device.api.ui.TouchEvent, int ) // pc=2
	istore_2 
	aload_1 
	iconst_1 
	invokevirtual int getY( net.rim.device.api.ui.TouchEvent, int ) // pc=2
	istore_3 
	aload_0 
	iload_2 
	bipush 70
	isub 
	putfield _assignRectX   // get_name_1:  _assignRectX   // get_name_2:  _assignRectX   // get_Name:    _assignRectX   // getName->1:  _assignRectX   // getName->2:  _assignRectX   // getName->N:  _assignRectX   // ofs = 53014 ord = 21 addr = 0
	aload_0 
	iload_3 
	bipush 90
	isub 
	putfield _assignRectY   // get_name_1:  _assignRectY   // get_name_2:  _assignRectY   // get_Name:    _assignRectY   // getName->1:  _assignRectY   // getName->2:  _assignRectY   // getName->N:  _assignRectY   // ofs = 53018 ord = 22 addr = 0
	aload_0 
	invokespecial com.whatsapp.client.ImageDisplayScreen.routine_1323 // pc=1
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Screen ) // pc=1
	iconst_1 
	ireturn 
Label233:
	aload_0 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.Screen.touchEvent // pc=2
	ireturn 
	}


protected final boolean keyChar( com.whatsapp.client.ImageDisplayScreen, char, int, int ); // address: 0
	{
	enter 
	iload_1 
	bipush 27
	if_icmpne Label19
	aload_0_getfield _assignRectMode   // get_name_1:  _assignRectMode   // get_name_2:  _assignRectMode   // get_Name:    _assignRectMode   // getName->1:  _assignRectMode   // getName->2:  _assignRectMode   // getName->N:  _assignRectMode   // ofs = 53010 ord = 20 addr = 0
	ifeq Label15
	aload_0_getfield _targetCID   // get_name_1:  _targetCID   // get_name_2:  _targetCID   // get_Name:    _targetCID   // getName->1:  _targetCID   // getName->2:  _targetCID   // getName->N:  _targetCID   // ofs = 53034 ord = 26 addr = 0
	ifnonnull Label15
	aload_0 
	iconst_0 
	putfield _assignRectMode   // get_name_1:  _assignRectMode   // get_name_2:  _assignRectMode   // get_Name:    _assignRectMode   // getName->1:  _assignRectMode   // getName->2:  _assignRectMode   // getName->N:  _assignRectMode   // ofs = 53010 ord = 20 addr = 0
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Screen ) // pc=1
	iconst_1 
	ireturn 
Label15:
	aload_0 
	invokenonvirtual com.whatsapp.client.ImageDisplayScreen.closeScreen // pc=1
	iconst_1 
	ireturn 
Label19:
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	invokespecial_lib net.rim.device.api.ui.Screen.keyChar // pc=4
	ireturn 
	}


public final closeScreen( com.whatsapp.client.ImageDisplayScreen ); // address: 0
	{
	enter_narrow 
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	astore_1 
	aload_1 
	aload_0 
	invokevirtual popScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}


protected final makeMenu( com.whatsapp.client.ImageDisplayScreen, net.rim.device.api.ui.component.Menu, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _assignRectMode   // get_name_1:  _assignRectMode   // get_name_2:  _assignRectMode   // get_Name:    _assignRectMode   // getName->1:  _assignRectMode   // getName->2:  _assignRectMode   // getName->N:  _assignRectMode   // ofs = 53010 ord = 20 addr = 0
	ifne Label16
	aload_0_getfield _fitMode   // get_name_1:  _fitMode   // get_name_2:  _fitMode   // get_Name:    _fitMode   // getName->1:  _fitMode   // getName->2:  _fitMode   // getName->N:  _fitMode   // ofs = 53006 ord = 19 addr = 0
	ifeq Label9
	aload_1 
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen.field_52938   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52938   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52938   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52938   // getName->1:     // getName->2:     // getName->N:     // ofs = 52938 ord = 2 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	goto Label12
Label9:
	aload_1 
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen.field_52934   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52934   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52934   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52934   // getName->1:     // getName->2:     // getName->N:     // ofs = 52934 ord = 1 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label12:
	aload_1 
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen.field_52942   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52942   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52942   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52942   // getName->1:     // getName->2:     // getName->N:     // ofs = 52942 ord = 3 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	goto Label25
Label16:
	aload_1 
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen.field_52946   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52946   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52946   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52946   // getName->1:     // getName->2:     // getName->N:     // ofs = 52946 ord = 4 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen.field_52954   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52954   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52954   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52954   // getName->1:     // getName->2:     // getName->N:     // ofs = 52954 ord = 6 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen.field_52950   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52950   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52950   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52950   // getName->1:     // getName->2:     // getName->N:     // ofs = 52950 ord = 5 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label25:
	aload_1 
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen.field_52930   // get_name_1:  com.whatsapp.client.ImageDisplayScreen.field_52930   // get_name_2:  com.whatsapp.client.ImageDisplayScreen.field_52930   // get_Name:    com.whatsapp.client.ImageDisplayScreen.field_52930   // getName->1:     // getName->2:     // getName->N:     // ofs = 52930 ord = 0 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	return 
	}

}
