// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-9.cod
// Module version  : 2.7.3204
// Class ID        : 17
// ########################################################


package com.whatsapp.client;


abstract public final class ChatHistory extends Object

{

	// @@@@@@@@@@@@@ Fields 
	public String /*java.lang.String*/  _jid ; // ofs = 54522 addr = 0)
	public boolean /*boolean*/  _dirty ; // ofs = 54526 addr = 0)
	public java.util.Vector /*java.util.Vector*/  _messagesV ; // ofs = 54530 addr = 0)
	public java.util.Hashtable /*java.util.Hashtable*/  _messagesHT ; // ofs = 54534 addr = 0)
	public String /*java.lang.String*/  _unsentLine ; // ofs = 54538 addr = 0)
	public int /*int*/  _chatState ; // ofs = 54542 addr = 0)
	public com.whatsapp.client.ChatMessageStore /*module:WhatsApp-10.class#0*/  _groupChat ; // ofs = 54546 addr = 0)
	public boolean /*boolean*/  _storagePreviousMessageEnabled ; // ofs = 54550 addr = 0)
	public boolean /*boolean*/  _storagePreviousMessageConfigured ; // ofs = 54554 addr = 0)
	private com.whatsapp.client.ChatHistory$ApplicationMessageAdapter /*com.whatsapp.client.ChatHistory$ApplicationMessageAdapter*/  field_54558 ; // ofs = 54558 addr = 0)

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
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	new_lib net.rim.device.api.ui.FieldChangeListener//net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aload_0 
	invokespecial com.whatsapp.client.ChatHistory.routine_7345 // pc=1
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_0 
	aload_0 
	invokespecial com.whatsapp.client.ChatHistory.routine_7345 // pc=1
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_0 
	bipush 2
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	return 
	}


static public final java.lang.String getDisplayableNameFromJid( java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	ifnonnull Label5
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	areturn 
Label5:
	invokestatic_lib module:WhatsApp-13.class#5.routine_9622(  ) // class#5
	astore_1 
	aload_0 
	aload_1 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label15
	sipush 808
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	areturn 
Label15:
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib //module:WhatsApp-13.class#4 module:WhatsApp-13.class#4 module:WhatsApp-13.class#4
	astore_2 
	aload_2 
	ifnull Label51
	invokestatic_lib net.rim.device.api.system.RuntimeStore getRuntimeStore(  ) // RuntimeStore
	lipush 8535665252065932813
	invokevirtual java.lang.Object get( net.rim.device.api.system.RuntimeStore, long ) // pc=3
	checkcast_lib //module:WhatsApp-13.class#1 module:WhatsApp-13.class#1 module:WhatsApp-13.class#1
	astore_3 
	aload_3 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_2 
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.ContactInfoDetails//module:WhatsApp.class#11 module:WhatsApp.class#11 module:WhatsApp.class#11
	astore_4 
	aload_4 
	ifnull Label48
	aload_4 
	iconst_0 
	invokenonvirtual_lib .routine_5897 // pc=2
	astore_5 
	aload_5 
	ifnull Label48
	aload_5 
	stringlength 
	ifle Label48
	aload_5 
	areturn 
Label48:
	aload_2 
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	areturn 
Label51:
	aload_0 
	invokestatic java.lang.String getDisplayablePlainJid( java.lang.String ) // ChatHistory
	areturn 
	}


static public final java.lang.String getShortNameFromJid( java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	ifnonnull Label5
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	areturn 
Label5:
	invokestatic_lib module:WhatsApp-13.class#5.routine_9622(  ) // class#5
	astore_1 
	aload_0 
	aload_1 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label15
	sipush 808
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	areturn 
Label15:
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib //module:WhatsApp-13.class#4 module:WhatsApp-13.class#4 module:WhatsApp-13.class#4
	astore_2 
	aload_2 
	ifnull Label50
	invokestatic_lib net.rim.device.api.system.RuntimeStore getRuntimeStore(  ) // RuntimeStore
	lipush 8535665252065932813
	invokevirtual java.lang.Object get( net.rim.device.api.system.RuntimeStore, long ) // pc=3
	checkcast_lib //module:WhatsApp-13.class#1 module:WhatsApp-13.class#1 module:WhatsApp-13.class#1
	astore_3 
	aload_3 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_2 
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.ContactInfoDetails//module:WhatsApp.class#11 module:WhatsApp.class#11 module:WhatsApp.class#11
	astore_4 
	aload_4 
	ifnull Label47
	aload_4 
	invokenonvirtual_lib .routine_5797 // pc=1
	astore_5 
	aload_5 
	ifnull Label47
	aload_5 
	stringlength 
	ifle Label47
	aload_5 
	areturn 
Label47:
	aload_2 
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	areturn 
Label50:
	aload_0 
	invokestatic java.lang.String getDisplayablePlainJid( java.lang.String ) // ChatHistory
	areturn 
	}


static public final java.lang.String getDisplayablePlainJid( java.lang.String ); // address: 0
	{
	enter_narrow 
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
	ifeq Label28
	new_lib net.rim.device.api.ui.Graphics//net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	bipush 43
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_2 
Label28:
	aload_2 
	areturn 
	}


static public final net.rim.device.api.system.Bitmap getPhoto( module:WhatsApp-13.class#4, int ); // address: 0
	{
	enter 
	aconst_null 
	astore_2 
	aload_0 
	ifnull Label29
	invokestatic_lib net.rim.device.api.system.RuntimeStore getRuntimeStore(  ) // RuntimeStore
	lipush 8535665252065932813
	invokevirtual java.lang.Object get( net.rim.device.api.system.RuntimeStore, long ) // pc=3
	checkcast_lib //module:WhatsApp-13.class#1 module:WhatsApp-13.class#1 module:WhatsApp-13.class#1
	astore_3 
	aload_3 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.ContactInfoDetails//module:WhatsApp.class#11 module:WhatsApp.class#11 module:WhatsApp.class#11
	astore_4 
	aload_4 
	ifnull Label29
	aload_3 
	aload_4 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_1 
	iload_1 
	invokenonvirtual_lib .routine_3756 // pc=4
	astore_5 
	aload_5 
	ifnull Label29
	aload_5 
	astore_2 
Label29:
	aload_2 
	ifnull Label33
	aload_2 
	areturn 
Label33:
	getstatic_lib module:WhatsApp-13.class#3.static_15 // class#3
	iload_1 
	iload_1 
	getstatic_lib module:WhatsApp-13.class#3.static_17 // class#3
	invokestatic_lib module:WhatsApp-13.class#3.routine_8877(  ) // class#3
	areturn 
	}


static public final net.rim.device.api.system.Bitmap getGroupPhoto( module:WhatsApp-10.class#0, int ); // address: 0
	{
	enter 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	ifnonnull Label9
	getstatic_lib module:WhatsApp-13.class#3.static_16 // class#3
	iload_1 
	iload_1 
	getstatic_lib module:WhatsApp-13.class#3.static_18 // class#3
	invokestatic_lib module:WhatsApp-13.class#3.routine_8877(  ) // class#3
	areturn 
Label9:
	iload_1 
	istore_2 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	iload_2 
	invokevirtual java.lang.Object get( net.rim.device.api.util.IntHashtable, int ) // pc=2
	checkcast_lib Integer//java.lang.Integer java.lang.Integer java.lang.Integer
	astore_3 
	aload_3 
	ifnonnull Label20
	aconst_null 
	goto Label23
Label20:
	aload_3 
	invokevirtual java.lang.Object get( java.lang.ref.Reference ) // pc=1
	checkcast_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
Label23:
	astore_4 
	aload_4 
	ifnonnull Label50
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	astore_5 
	aload_5 
	ifnonnull Label33
	aconst_null 
	astore_4 
	goto Label50
Label33:
	aload_5 
	iload_1 
	iload_1 
	invokestatic_lib module:WhatsApp-13.class#3.routine_8834(  ) // class#3
	astore_4 
	aload_4 
	invokestatic_lib module:WhatsApp-32.class#2.routine_6847(  ) // class#2
	new_lib Integer//java.lang.Integer java.lang.Integer java.lang.Integer
	dup 
	aload_4 
	invokespecial_lib java.lang.ref.WeakReference.<init> // pc=2
	astore_3 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	iload_2 
	aload_3 
	invokevirtual java.lang.Object put( net.rim.device.api.util.IntHashtable, int, java.lang.Object ) // pc=3
	pop 
Label50:
	aload_4 
	areturn 
	}


static public final boolean isMuted( java.lang.String ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-26.class#11.routine_3571(  ) // class#11
	astore_1 
	aload_1 
	invokenonvirtual_lib .routine_2951 // pc=1
	astore_2 
	aload_2 
	aload_0 
	invokenonvirtual_lib .routine_2721 // pc=2
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
	invokenonvirtual_lib .routine_2951 // pc=1
	invokestatic_lib java.lang.Object expandGroup( java.lang.Object ) // ObjectGroup
	checkcast_lib com.whatsapp.client.ApplicationHashData//module:WhatsApp.class#9 module:WhatsApp.class#9 module:WhatsApp.class#9
	astore_2 
	aload_2 
	aload_0 
	iconst_0 
	i2l 
	invokenonvirtual_lib .routine_2763 // pc=4
	aload_1 
	aload_2 
	invokestatic_lib module:WhatsApp.class#9.routine_3363(  ) // class#9
Label38:
	iload_5 
	ireturn 
	}


static public final setMuted( java.lang.String, int ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-26.class#11.routine_3571(  ) // class#11
	astore_2 
	aload_2 
	invokenonvirtual_lib .routine_2951 // pc=1
	invokestatic_lib java.lang.Object expandGroup( java.lang.Object ) // ObjectGroup
	checkcast_lib com.whatsapp.client.ApplicationHashData//module:WhatsApp.class#9 module:WhatsApp.class#9 module:WhatsApp.class#9
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
	invokenonvirtual_lib .routine_2763 // pc=4
	aload_2 
	aload_3 
	invokestatic_lib module:WhatsApp.class#9.routine_3363(  ) // class#9
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

public final addMessage( com.whatsapp.client.ChatHistory, module:WhatsApp-17.class#15 ); // address: 0
	{
	enter 
	synch 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual boolean containsKey( java.util.Hashtable, java.lang.Object ) // pc=2
	ifeq Label8
	return 
Label8:
	aload_0 
	invokespecial com.whatsapp.client.ChatHistory.routine_7311 // pc=1
	istore_2 
	aload_0 
	invokespecial com.whatsapp.client.ChatHistory.routine_7345 // pc=1
	istore_3 
	bipush -1
	istore_4 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_3 
	if_icmpeq Label24
	iload_3 
	ifne Label24
	sipush 350
	istore_4 
	goto Label33
Label24:
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	iload_2 
	if_icmpeq Label33
	iload_2 
	ifeq Label31
	sipush 345
	goto Label32
Label31:
	sipush 346
Label32:
	istore_4 
Label33:
	iload_4 
	bipush -1
	if_icmpeq Label45
	ldc literal_346:"system"
	ldc_nullstr 
	ldc literal_347:"store"
	iload_4 
	invokestatic_lib module:WhatsApp-6.class#0.routine_9590(  ) // class#0
	astore_5 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_5 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label45:
	aload_0 
	iload_3 
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_0 
	iload_2 
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_1 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_1 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual int size( java.util.Vector ) // pc=1
	bipush 100
	if_icmple Label77
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iconst_0 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-17.class#15 module:WhatsApp-17.class#15 module:WhatsApp-17.class#15
	astore_5 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iconst_0 
	invokevirtual removeElementAt( java.util.Vector, int ) // pc=2
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_5 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	pop 
Label77:
	return 
	}


public final deleteMessage( com.whatsapp.client.ChatHistory, module:WhatsApp-17.class#15 ); // address: 0
	{
	enter_narrow 
	synch 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual boolean containsKey( java.util.Hashtable, java.lang.Object ) // pc=2
	ifne Label8
	return 
Label8:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_1 
	invokevirtual boolean removeElement( java.util.Vector, java.lang.Object ) // pc=2
	pop 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	pop 
	return 
	}


private final boolean com.whatsapp.client.ChatHistory.routine_7311( com.whatsapp.client.ChatHistory ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial com.whatsapp.client.ChatHistory.routine_7345 // pc=1
	ifeq Label9
	invokestatic_lib module:WhatsApp-24.class#2.routine_4009(  ) // class#2
	invokeinterface interfacemethodref_88 // pc=1 guess=11
	ifeq Label9
	iconst_1 
	ireturn 
Label9:
	iconst_0 
	ireturn 
	}


private final boolean com.whatsapp.client.ChatHistory.routine_7345( com.whatsapp.client.ChatHistory ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-24.class#2.routine_4009(  ) // class#2
	invokeinterface interfacemethodref_89 // pc=1 guess=12
	ifeq Label11
	invokestatic_lib module:WhatsApp-26.class#11.routine_3571(  ) // class#11
	invokenonvirtual_lib .routine_2951 // pc=1
	invokenonvirtual_lib .routine_2593 // pc=1
	stringlength 
	ifeq Label11
	iconst_1 
	ireturn 
Label11:
	iconst_0 
	ireturn 
	}


public final net.rim.device.api.system.Bitmap getPhoto( com.whatsapp.client.ChatHistory, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnull Label7
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iload_1 
	invokestatic net.rim.device.api.system.Bitmap getGroupPhoto( module:WhatsApp-10.class#0, int ) // ChatHistory
	areturn 
Label7:
	invokestatic_lib module:WhatsApp-13.class#5.routine_9622(  ) // class#5
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib //module:WhatsApp-13.class#4 module:WhatsApp-13.class#4 module:WhatsApp-13.class#4
	astore_2 
	aload_2 
	iload_1 
	invokestatic net.rim.device.api.system.Bitmap getPhoto( module:WhatsApp-13.class#4, int ) // ChatHistory
	areturn 
	}


public final module:WhatsApp-17.class#15 getLastMessage( com.whatsapp.client.ChatHistory ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual boolean isEmpty( java.util.Vector ) // pc=1
	ifeq Label6
	aconst_null 
	areturn 
Label6:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual java.lang.Object lastElement( java.util.Vector ) // pc=1
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-17.class#15 module:WhatsApp-17.class#15 module:WhatsApp-17.class#15
	areturn 
	}


public final module:WhatsApp-17.class#15 getLastNonSystemMessage( com.whatsapp.client.ChatHistory ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual int size( java.util.Vector ) // pc=1
	iconst_1 
	isub 
	istore_1 
Label6:
	iload_1 
	iflt Label22
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload_1 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-17.class#15 module:WhatsApp-17.class#15 module:WhatsApp-17.class#15
	astore_2 
	aload_2 
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	bipush 7
	if_icmpne Label18
	goto Label20
Label18:
	aload_2 
	areturn 
Label20:
	iinc 1 -1
	goto Label6
Label22:
	aconst_null 
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
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnonnull Label10
	invokestatic_lib long currentTimeMillis(  ) // System
	lreturn 
Label10:
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	i2l 
	sipush 1000
	i2l 
	lmul 
	lreturn 
Label17:
	aload_1 
	lgetfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	lreturn 
	}


public final long getSortingTimestamp( com.whatsapp.client.ChatHistory ); // address: 0
	{
	enter 
	aload_0 
	invokenonvirtual com.whatsapp.client.ChatHistory.getLastNonSystemMessage // pc=1
	astore_1 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnonnull Label13
	aload_1 
	ifnull Label11
	aload_1 
	lgetfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	lreturn 
Label11:
	invokestatic_lib long currentTimeMillis(  ) // System
	lreturn 
Label13:
	sipush 1000
	i2l 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokestatic_lib int max( int, int ) // Math
	i2l 
	lmul 
	lstore 2
	aload_1 
	ifnonnull Label28
	iconst_0 
	i2l 
	goto Label30
Label28:
	aload_1 
	lgetfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
Label30:
	lload 2
	invokestatic_lib long max( long, long ) // Math
	lreturn 
	}


public final java.lang.String getName( com.whatsapp.client.ChatHistory ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnull Label6
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
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
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	ifnonnull Label9
	aload_0 
	new ChatHistory$ApplicationMessageAdapter
	dup 
	aload_0 
	invokespecial com.whatsapp.client.ChatHistory$ApplicationMessageAdapter.<init> // pc=2
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
Label9:
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	areturn 
	}

}
