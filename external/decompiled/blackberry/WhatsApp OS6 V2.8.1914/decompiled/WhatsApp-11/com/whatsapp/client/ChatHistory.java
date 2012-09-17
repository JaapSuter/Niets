// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-11.cod
// Module version  : 2.8.1914
// Class ID        : 1
// ########################################################


package com.whatsapp.client;


abstract public final class ChatHistory extends Object

{
	// @@@@@@@@@@@@@ Static fields 
	private final static java.util.Hashtable /*java.util.Hashtable*/  field_59372 ; // ofs = 59372 addr = 5)

	// @@@@@@@@@@@@@ Fields 
	public String /*java.lang.String*/  _jid ; // ofs = 59324 addr = 0)
	public boolean /*boolean*/  _dirty ; // ofs = 59328 addr = 0)
	public int /*int*/  _unreadCount ; // ofs = 59332 addr = 0)
	public com.whatsapp.client. /*module:WhatsApp-26.class#24*/  _lastSeenMessageKey ; // ofs = 59336 addr = 0)
	public java.util.Vector /*java.util.Vector*/  _messagesV ; // ofs = 59340 addr = 0)
	public java.util.Hashtable /*java.util.Hashtable*/  _messagesHT ; // ofs = 59344 addr = 0)
	public String /*java.lang.String*/  _unsentLine ; // ofs = 59348 addr = 0)
	public int /*int*/  _chatState ; // ofs = 59352 addr = 0)
	public com.whatsapp.client. /*module:WhatsApp-12.class#0*/  _groupChat ; // ofs = 59356 addr = 0)
	public boolean /*boolean*/  _storagePreviousMessageEnabled ; // ofs = 59360 addr = 0)
	public boolean /*boolean*/  _storagePreviousMessageConfigured ; // ofs = 59364 addr = 0)
	private com.whatsapp.client. /*module:WhatsApp-10.class#8*/  field_59368 ; // ofs = 59368 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.ChatHistory, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	iconst_0 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	iconst_0 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0 
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	invokestatic_lib module:WhatsApp-12.class#2.routine_2259(  ) // class#2
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_0 
	invokestatic_lib module:WhatsApp-12.class#2.routine_2259(  ) // class#2
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_0 
	bipush 2
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	return 
	}


static public final boolean hasDisplayableNameFromJid( java.lang.String ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-21.class#0.routine_1491(  ) // class#0
	astore_1 
	aload_0 
	ifnull Label7
	aload_1 
	ifnonnull Label9
Label7:
	iconst_0 
	ireturn 
Label9:
	aload_0 
	aload_1 
	invokenonvirtual_lib .routine_330 // pc=1
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label16
	iconst_1 
	ireturn 
Label16:
	aload_1 
	aload_0 
	invokenonvirtual_lib .routine_411 // pc=2
	astore_2 
	aload_2 
	ifnull Label49
	aload_2 
	invokenonvirtual_lib .routine_12384 // pc=1
	arraylength 
	ifle Label49
	aload_2 
	invokenonvirtual_lib .routine_12384 // pc=1
	astore_3 
	invokestatic_lib module:WhatsApp-18.class#0.routine_2419(  ) // class#0
	astore_4 
	aload_4 
	aload_3 
	invokenonvirtual_lib .routine_1078 // pc=2
	astore_5 
	aload_5 
	ifnull Label47
	aload_5 
	invokenonvirtual_lib .routine_8739 // pc=1
	astore_6 
	aload_6 
	ifnull Label47
	aload_6 
	stringlength 
	ifle Label47
	iconst_1 
	ireturn 
Label47:
	iconst_0 
	ireturn 
Label49:
	iconst_0 
	ireturn 
	}


static public final java.lang.String getDisplayableNameFromJid( java.lang.String ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-21.class#0.routine_1491(  ) // class#0
	astore_1 
	aload_0 
	ifnull Label7
	aload_1 
	ifnonnull Label9
Label7:
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	areturn 
Label9:
	aload_0 
	aload_1 
	invokenonvirtual_lib .routine_330 // pc=1
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label17
	sipush 808
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	areturn 
Label17:
	aload_1 
	aload_0 
	invokenonvirtual_lib .routine_411 // pc=2
	astore_2 
	aload_2 
	ifnull Label49
	aload_2 
	invokenonvirtual_lib .routine_12384 // pc=1
	arraylength 
	ifle Label49
	aload_2 
	invokenonvirtual_lib .routine_12384 // pc=1
	astore_3 
	invokestatic_lib module:WhatsApp-18.class#0.routine_2419(  ) // class#0
	astore_4 
	aload_4 
	aload_3 
	invokenonvirtual_lib .routine_1078 // pc=2
	astore_5 
	aload_5 
	ifnull Label49
	aload_5 
	iconst_0 
	invokenonvirtual_lib .routine_8839 // pc=2
	astore_6 
	aload_6 
	ifnull Label49
	aload_6 
	stringlength 
	ifle Label49
	aload_6 
	areturn 
Label49:
	aload_0 
	invokestatic java.lang.String getDisplayablePlainJid( java.lang.String ) // ChatHistory
	areturn 
	}


static public final java.lang.String getShortNameFromJid( java.lang.String ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-21.class#0.routine_1491(  ) // class#0
	astore_1 
	aload_0 
	ifnull Label7
	aload_1 
	ifnonnull Label9
Label7:
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	areturn 
Label9:
	aload_0 
	aload_1 
	invokenonvirtual_lib .routine_330 // pc=1
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label17
	sipush 808
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	areturn 
Label17:
	aload_1 
	aload_0 
	invokenonvirtual_lib .routine_411 // pc=2
	astore_2 
	aload_2 
	ifnull Label52
	aload_2 
	invokenonvirtual_lib .routine_12384 // pc=1
	arraylength 
	ifle Label52
	aload_2 
	invokenonvirtual_lib .routine_12384 // pc=1
	astore_3 
	invokestatic_lib module:WhatsApp-18.class#0.routine_2419(  ) // class#0
	astore_4 
	aload_4 
	aload_3 
	invokenonvirtual_lib .routine_1078 // pc=2
	astore_5 
	aload_5 
	ifnull Label48
	aload_5 
	invokenonvirtual_lib .routine_8739 // pc=1
	astore_6 
	aload_6 
	ifnull Label48
	aload_6 
	stringlength 
	ifle Label48
	aload_6 
	areturn 
Label48:
	aload_3 
	iconst_0 
	aaload 
	areturn 
Label52:
	aload_0 
	invokestatic java.lang.String getDisplayablePlainJid( java.lang.String ) // ChatHistory
	areturn 
	}


static public final java.lang.String getDisplayablePlainJid( java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	bipush 64
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	istore_1 
	iload_1 
	ifge Label9
	aload_0 
	areturn 
Label9:
	aload_0 
	iconst_0 
	iload_1 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	astore_2 
	aload_0 
	iconst_0 
	stringaload 
	invokestatic_lib boolean isDigit( char ) // Character
	ifeq Label43
	getstatic com.whatsapp.client.ChatHistory.field_59372 // ChatHistory
	aload_2 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	astore_3 
	aload_3 
	ifnonnull Label41
	new_lib net.rim.device.api.ui.Manager//net.rim.device.api.ui.Manager net.rim.device.api.ui.Manager net.rim.device.api.ui.Manager
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	bipush 43
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-45.class#7.routine_5144(  ) // class#7
	astore_3 
	getstatic com.whatsapp.client.ChatHistory.field_59372 // ChatHistory
	aload_2 
	aload_3 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
Label41:
	aload_3 
	astore_2 
Label43:
	aload_2 
	areturn 
	}


static public final java.lang.String getSystemMessageText( module:WhatsApp-26.class#23 ); // address: 0
	{
	enter 
	aload_0 
	invokenonvirtual_lib .routine_5941 // pc=1
	astore_1 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	astore_2 
	invokestatic_lib module:WhatsApp-21.class#0.routine_1491(  ) // class#0
	astore_3 
	iconst_0 
	istore_4 
	aconst_null 
	astore_5 
	aload_2 
	ifnull Label29
	aload_2 
	bipush 64
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	iflt Label29
	aload_2 
	aload_3 
	invokenonvirtual_lib .routine_330 // pc=1
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label27
	aload_2 
	invokestatic java.lang.String getDisplayableNameFromJid( java.lang.String ) // ChatHistory
	astore_5 
	goto Label29
Label27:
	iconst_1 
	istore_4 
Label29:
	aload_5 
	ifnonnull Label33
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	astore_5 
Label33:
	aload_0 
	lgetfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	sipush 772
	i2l 
	lcmp 
	ifne Label46
	iload_4 
	ifeq Label43
	sipush 1089
	goto Label44
Label43:
	sipush 772
Label44:
	istore_6 
	goto Label87
Label46:
	aload_0 
	lgetfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	sipush 773
	i2l 
	lcmp 
	ifne Label59
	iload_4 
	ifeq Label56
	sipush 1090
	goto Label57
Label56:
	sipush 773
Label57:
	istore_6 
	goto Label87
Label59:
	aload_0 
	lgetfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	sipush 941
	i2l 
	lcmp 
	ifne Label72
	iload_4 
	ifeq Label69
	sipush 1091
	goto Label70
Label69:
	sipush 941
Label70:
	istore_6 
	goto Label87
Label72:
	aload_0 
	lgetfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	sipush 787
	i2l 
	lcmp 
	ifne Label85
	iload_4 
	ifeq Label82
	sipush 1092
	goto Label83
Label82:
	sipush 787
Label83:
	istore_6 
	goto Label87
Label85:
	bipush -1
	istore_6 
Label87:
	iload_6 
	bipush -1
	if_icmpeq Label95
	iload_6 
	aload_5 
	aload_1 
	invokestatic_lib module:WhatsApp-47.class#11.routine_4492(  ) // class#11
	areturn 
Label95:
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	areturn 
	}


static public final net.rim.device.api.system.Bitmap getPhoto( java.lang.String, int, boolean ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-21.class#0.routine_1491(  ) // class#0
	aload_0 
	invokenonvirtual_lib .routine_411 // pc=2
	astore_3 
	aconst_null 
	astore_4 
	aload_3 
	ifnull Label39
	invokestatic_lib module:WhatsApp-21.class#0.routine_1491(  ) // class#0
	aload_3 
	invokenonvirtual_lib .routine_1151 // pc=2
	astore_5 
	aload_5 
	iload_1 
	invokestatic_lib module:WhatsApp-47.class#16.routine_8247(  ) // class#16
	astore_4 
	aload_4 
	ifnonnull Label39
	invokestatic_lib module:WhatsApp-18.class#0.routine_2419(  ) // class#0
	astore_6 
	aload_6 
	aload_3 
	invokenonvirtual_lib .routine_12384 // pc=1
	invokenonvirtual_lib .routine_1078 // pc=2
	astore_7 
	aload_7 
	ifnull Label39
	aload_6 
	aload_7 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_1 
	iload_1 
	invokenonvirtual_lib .routine_282 // pc=4
	astore 8
	aload 8
	ifnull Label39
	aload 8
	astore_4 
Label39:
	aload_4 
	ifnull Label43
	aload_4 
	areturn 
Label43:
	iload_2 
	ifeq Label51
	getstatic_lib module:WhatsApp-20.class#0.static_4 // class#0
	iload_1 
	iload_1 
	getstatic_lib module:WhatsApp-20.class#0.static_6 // class#0
	invokestatic_lib module:WhatsApp-20.class#0.routine_158(  ) // class#0
	areturn 
Label51:
	aconst_null 
	areturn 
	}


static public final net.rim.device.api.system.Bitmap getGroupPhoto( module:WhatsApp-12.class#0, int, boolean ); // address: 0
	{
	enter 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnonnull Label13
	iload_2 
	ifeq Label11
	getstatic_lib module:WhatsApp-20.class#0.static_5 // class#0
	iload_1 
	iload_1 
	getstatic_lib module:WhatsApp-20.class#0.static_7 // class#0
	invokestatic_lib module:WhatsApp-20.class#0.routine_158(  ) // class#0
	areturn 
Label11:
	aconst_null 
	areturn 
Label13:
	iload_1 
	istore_3 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	iload_3 
	invokevirtual java.lang.Object get( net.rim.device.api.util.IntHashtable, int ) // pc=2
	checkcast_lib net.rim.device.api.util.IntHashtable//net.rim.device.api.util.IntHashtable net.rim.device.api.util.IntHashtable net.rim.device.api.util.IntHashtable
	astore_4 
	aload_4 
	ifnonnull Label24
	aconst_null 
	goto Label27
Label24:
	aload_4 
	invokevirtual java.lang.Object get( java.lang.ref.Reference ) // pc=1
	checkcast_lib Object//java.lang.Object java.lang.Object java.lang.Object
Label27:
	astore_5 
	aload_5 
	ifnonnull Label60
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	astore_6 
	aload_6 
	ifnonnull Label37
	aconst_null 
	astore_5 
	goto Label60
Label37:
	aload_6 
	invokevirtual net.rim.device.api.system.Bitmap getBitmap( net.rim.device.api.system.EncodedImage ) // pc=1
	iload_1 
	iload_1 
	iload_2 
	ifeq Label45
	getstatic_lib module:WhatsApp-20.class#0.static_6 // class#0
	goto Label46
Label45:
	aconst_null 
Label46:
	invokestatic_lib module:WhatsApp-20.class#0.routine_158(  ) // class#0
	astore_5 
	aload_5 
	invokestatic_lib module:WhatsApp-60.class#2.routine_1414(  ) // class#2
	new_lib net.rim.device.api.util.IntHashtable//net.rim.device.api.util.IntHashtable net.rim.device.api.util.IntHashtable net.rim.device.api.util.IntHashtable
	dup 
	aload_5 
	invokespecial_lib java.lang.ref.WeakReference.<init> // pc=2
	astore_4 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	iload_3 
	aload_4 
	invokevirtual java.lang.Object put( net.rim.device.api.util.IntHashtable, int, java.lang.Object ) // pc=3
	pop 
Label60:
	aload_5 
	areturn 
	}


static public final boolean isMuted( java.lang.String ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-44.class#7.routine_3329(  ) // class#7
	astore_1 
	aload_1 
	invokenonvirtual_lib .routine_2043 // pc=1
	astore_2 
	aload_2 
	aload_0 
	invokenonvirtual_lib .routine_5184 // pc=2
	lstore 3
	lload 3
	invokestatic_lib long currentTimeMillis(  ) // System
	lcmp 
	ifle Label16
	iconst_1 
	goto Label17
Label16:
	iconst_0 
Label17:
	istore_5 
	iload_5 
	ifne Label38
	lload 3
	iconst_0 
	i2l 
	lcmp 
	ifeq Label38
	aload_1 
	invokenonvirtual_lib .routine_2043 // pc=1
	invokestatic_lib java.lang.Object expandGroup( java.lang.Object ) // ObjectGroup
	checkcast_lib com.whatsapp.client.//module:WhatsApp.class#18 module:WhatsApp.class#18 module:WhatsApp.class#18
	astore_2 
	aload_2 
	aload_0 
	iconst_0 
	i2l 
	invokenonvirtual_lib .routine_5226 // pc=4
	aload_1 
	aload_2 
	invokestatic_lib module:WhatsApp.class#18.routine_6122(  ) // class#18
Label38:
	iload_5 
	ireturn 
	}


static public final setMuted( java.lang.String, int ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-44.class#7.routine_3329(  ) // class#7
	astore_2 
	aload_2 
	invokenonvirtual_lib .routine_2043 // pc=1
	invokestatic_lib java.lang.Object expandGroup( java.lang.Object ) // ObjectGroup
	checkcast_lib com.whatsapp.client.ApplicationHashData//module:WhatsApp.class#18 module:WhatsApp.class#18 module:WhatsApp.class#18
	astore_3 
	iload_1 
	ifle Label15
	invokestatic_lib long currentTimeMillis(  ) // System
	iload_1 
	i2l 
	ladd 
	goto Label17
Label15:
	iconst_0 
	i2l 
Label17:
	lstore 4
	aload_3 
	aload_0 
	lload 4
	invokenonvirtual_lib .routine_5226 // pc=4
	aload_2 
	aload_3 
	invokestatic_lib module:WhatsApp.class#18.routine_6122(  ) // class#18
	return 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	synch_static ChatHistory
	clinit_wait 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putstatic com.whatsapp.client.ChatHistory.field_59372 // ChatHistory
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

public final module:WhatsApp-26.class#23 getMessage( com.whatsapp.client.ChatHistory, module:WhatsApp-26.class#24 ); // address: 0
	{
	enter_narrow 
	synch 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_1 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-26.class#23 module:WhatsApp-26.class#23 module:WhatsApp-26.class#23
	areturn 
	}


public final addMessage( com.whatsapp.client.ChatHistory, module:WhatsApp-26.class#23 ); // address: 0
	{
	enter 
	synch 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual boolean containsKey( java.util.Hashtable, java.lang.Object ) // pc=2
	ifeq Label8
	return 
Label8:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_1 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_1 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	iconst_0 
	istore_2 
Label19:
	iload_2 
	bipush 2
	if_icmpge Label49
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual int size( java.util.Vector ) // pc=1
	bipush 100
	if_icmple Label49
	aload_0 
	invokenonvirtual com.whatsapp.client.ChatHistory.getLastSeenMessage // pc=1
	astore_3 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iconst_0 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-26.class#23 module:WhatsApp-26.class#23 module:WhatsApp-26.class#23
	astore_4 
	aload_4 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_3 
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label47
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iconst_0 
	invokevirtual removeElementAt( java.util.Vector, int ) // pc=2
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_4 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	pop 
Label47:
	iinc 2 1
	goto Label19
Label49:
	return 
	}


public final updateAndNotifyPersistenceChanges( com.whatsapp.client.ChatHistory, boolean, boolean ); // address: 0
	{
	enter 
	bipush -1
	istore_3 
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	iload_2 
	if_icmpeq Label11
	iload_2 
	ifne Label11
	sipush 350
	istore_3 
	goto Label20
Label11:
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	iload_1 
	if_icmpeq Label20
	iload_1 
	ifeq Label18
	sipush 345
	goto Label19
Label18:
	sipush 346
Label19:
	istore_3 
Label20:
	iload_3 
	bipush -1
	if_icmpeq Label32
	ldc literal_86:"system"
	ldc_nullstr 
	ldc literal_87:"store"
	iload_3 
	invokestatic_lib module:WhatsApp-23.class#0.routine_16948(  ) // class#0
	astore_4 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_4 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label32:
	aload_0 
	iload_2 
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_0 
	iload_1 
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	return 
	}


public final module:WhatsApp-26.class#23 lastMessage( com.whatsapp.client.ChatHistory ); // address: 0
	{
	enter_narrow 
	synch 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual boolean isEmpty( java.util.Vector ) // pc=1
	ifeq Label7
	aconst_null 
	areturn 
Label7:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual int size( java.util.Vector ) // pc=1
	iconst_1 
	isub 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-26.class#23 module:WhatsApp-26.class#23 module:WhatsApp-26.class#23
	areturn 
	}


public final deleteMessage( com.whatsapp.client.ChatHistory, module:WhatsApp-26.class#23 ); // address: 0
	{
	enter_narrow 
	synch 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual boolean containsKey( java.util.Hashtable, java.lang.Object ) // pc=2
	ifne Label8
	return 
Label8:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_1 
	invokevirtual boolean removeElement( java.util.Vector, java.lang.Object ) // pc=2
	pop 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	pop 
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label30
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual boolean isEmpty( java.util.Vector ) // pc=1
	ifne Label30
	aload_0 
	aload_0 
	invokenonvirtual com.whatsapp.client.ChatHistory.lastMessage // pc=1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
Label30:
	return 
	}


public final net.rim.device.api.system.Bitmap getPhoto( com.whatsapp.client.ChatHistory, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	iconst_1 
	invokenonvirtual com.whatsapp.client.ChatHistory.getPhoto // pc=3
	areturn 
	}


public final net.rim.device.api.system.Bitmap getPhoto( com.whatsapp.client.ChatHistory, int, boolean ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifnull Label8
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_1 
	iload_2 
	invokestatic net.rim.device.api.system.Bitmap getGroupPhoto( module:WhatsApp-12.class#0, int, boolean ) // ChatHistory
	areturn 
Label8:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_1 
	iload_2 
	invokestatic net.rim.device.api.system.Bitmap getPhoto( java.lang.String, int, boolean ) // ChatHistory
	areturn 
	}


public final module:WhatsApp-26.class#24 getLastSeenMessage( com.whatsapp.client.ChatHistory ); // address: 0
	{
	areturn_field .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	}


public final resetLastSeenMessage( com.whatsapp.client.ChatHistory ); // address: 0
	{
	enter_narrow 
	synch 
	aload_0 
	iconst_0 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	iconst_0 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	invokenonvirtual com.whatsapp.client.ChatHistory.getLastMessage // pc=1
	astore_1 
	aload_0 
	aload_1 
	ifnonnull Label16
	aconst_null 
	goto Label18
Label16:
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
Label18:
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	return 
	}


public final module:WhatsApp-26.class#23 getLastMessage( com.whatsapp.client.ChatHistory ); // address: 0
	{
	enter_narrow 
	synch 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual boolean isEmpty( java.util.Vector ) // pc=1
	ifeq Label7
	aconst_null 
	areturn 
Label7:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual java.lang.Object lastElement( java.util.Vector ) // pc=1
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-26.class#23 module:WhatsApp-26.class#23 module:WhatsApp-26.class#23
	areturn 
	}


public final long getLatestTimestamp( com.whatsapp.client.ChatHistory ); // address: 0
	{
	enter 
	aload_0 
	invokenonvirtual com.whatsapp.client.ChatHistory.getLastMessage // pc=1
	astore_1 
	aload_1 
	ifnonnull Label17
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifnonnull Label10
	invokestatic_lib long currentTimeMillis(  ) // System
	lreturn 
Label10:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	i2l 
	sipush 1000
	i2l 
	lmul 
	lreturn 
Label17:
	aload_1 
	lgetfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	lreturn 
	}


public final long getSortingTimestamp( com.whatsapp.client.ChatHistory ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokenonvirtual com.whatsapp.client.ChatHistory.getLastMessage // pc=1
	astore_1 
	aload_1 
	ifnull Label9
	aload_1 
	lgetfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	lreturn 
Label9:
	invokestatic_lib long currentTimeMillis(  ) // System
	lreturn 
	}


public final java.lang.String getName( com.whatsapp.client.ChatHistory ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifnull Label6
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	areturn 
Label6:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokestatic java.lang.String getDisplayableNameFromJid( java.lang.String ) // ChatHistory
	areturn 
	}


public final net.rim.blackberry.api.messagelist.ApplicationMessage getApplicationMessage( com.whatsapp.client.ChatHistory ); // address: 0
	{
	enter 
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	ifnonnull Label9
	aload_0 
	new_lib com.whatsapp.client.ChatHistory$ApplicationMessageAdapter//module:WhatsApp-10.class#8 module:WhatsApp-10.class#8 module:WhatsApp-10.class#8
	dup 
	aload_0 
	invokespecial_lib .routine_2149 // pc=2
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
Label9:
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	areturn 
	}

}
