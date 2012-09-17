// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-47.cod
// Module version  : 2.8.1914
// Class ID        : 13
// ########################################################


package com.whatsapp.client;


abstract public final class RuntimeMessageStore extends Object
implements com.whatsapp.client.

{

	// @@@@@@@@@@@@@ Fields 
	private java.util.Hashtable /*java.util.Hashtable*/  field_55358 ; // ofs = 55358 addr = 0)
	private java.util.Hashtable /*java.util.Hashtable*/  field_55362 ; // ofs = 55362 addr = 0)
	private java.util.Vector /*java.util.Vector*/  _chatsV ; // ofs = 55366 addr = 0)
	private java.util.Hashtable /*java.util.Hashtable*/  field_55370 ; // ofs = 55370 addr = 0)
	private long /*long*/  field_55374 ; // ofs = 55374 addr = 0)
	private com.whatsapp.client. /*module:WhatsApp-48.class#0*/  field_55378 ; // ofs = 55378 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.RuntimeMessageStore ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	iconst_0 
	i2l 
	lputfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	aconst_null 
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	bipush 10
	invokespecial_lib java.util.Hashtable.<init> // pc=2
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	new_lib net.rim.device.api.ui.component.BasicEditField//net.rim.device.api.ui.component.BasicEditField net.rim.device.api.ui.component.BasicEditField net.rim.device.api.ui.component.BasicEditField
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	bipush 10
	invokespecial_lib java.util.Hashtable.<init> // pc=2
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final int com.whatsapp.client.RuntimeMessageStore.routine_7240( com.whatsapp.client.RuntimeMessageStore, java.util.Vector, module:WhatsApp-26.class#24 ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_3 
	iload_3 
	iconst_1 
	isub 
	istore_4 
Label8:
	iload_4 
	iflt Label24
	aload_1 
	iload_4 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.//module:WhatsApp-26.class#23 module:WhatsApp-26.class#23 module:WhatsApp-26.class#23
	astore_5 
	aload_5 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_2 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label22
	iload_4 
	ireturn 
Label22:
	iinc 4 -1
	goto Label8
Label24:
	bipush -1
	ireturn 
	}


public final boolean putMessage( com.whatsapp.client.RuntimeMessageStore, module:WhatsApp-26.class#23, boolean ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokenonvirtual com.whatsapp.client.RuntimeMessageStore.getOrAddHistoryForPut // pc=2
	astore_3 
	invokestatic_lib module:WhatsApp-12.class#2.routine_2304(  ) // class#2
	istore_4 
	invokestatic_lib module:WhatsApp-12.class#2.routine_2259(  ) // class#2
	istore_5 
	aload_3 
	dup 
	astore_6 
	monitorenter 
	aload_3 
	iload_4 
	iload_5 
	invokenonvirtual_lib .routine_1274 // pc=3
	aload_3 
	aload_1 
	invokenonvirtual_lib .routine_1163 // pc=2
	iload_2 
	ifne Label52
	aload_3 
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifeq Label33
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	bipush 6
	if_icmpne Label35
Label33:
	iconst_1 
	goto Label36
Label35:
	iconst_0 
Label36:
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_3 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifne Label43
	aload_3 
	invokenonvirtual_lib .routine_1526 // pc=1
	goto Label52
Label43:
	aload_1 
	invokestatic_lib module:WhatsApp-12.class#2.routine_2349(  ) // class#2
	ifeq Label52
	aload_3 
	dup 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iconst_1 
	iadd 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
Label52:
	aload_6 
	monitorexit 
	goto Label60
	astore_7 
	aload_6 
	monitorexit 
	aload_7 
	athrow 
Label60:
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	bipush 4
	if_icmpeq Label86
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	bipush 5
	if_icmpeq Label86
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	bipush 6
	if_icmpeq Label86
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	bipush 7
	if_icmpeq Label86
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifeq Label86
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_1 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
Label86:
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnull Label94
	aload_3 
	invokenonvirtual_lib .routine_1704 // pc=1
	astore_6 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_6 
	invokenonvirtual_lib .routine_72 // pc=2
Label94:
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	dup 
	astore_7 
	monitorenter 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokevirtual boolean isEmpty( java.util.Hashtable ) // pc=1
	istore_6 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib net.rim.device.api.i18n.ResourceBundleFamily//net.rim.device.api.i18n.ResourceBundleFamily net.rim.device.api.i18n.ResourceBundleFamily net.rim.device.api.i18n.ResourceBundleFamily
	astore 8
	aload 8
	ifnonnull Label118
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifeq Label116
	getstatic_lib TRUE // Boolean
	goto Label117
Label116:
	getstatic_lib FALSE // Boolean
Label117:
	astore 8
Label118:
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	aload 8
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokespecial com.whatsapp.client.RuntimeMessageStore.routine_7607 // pc=3
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload_7 
	monitorexit 
	goto Label138
	astore 9
	aload_7 
	monitorexit 
	aload 9
	athrow 
Label138:
	iload_6 
	ireturn 
	}


private final java.lang.Boolean com.whatsapp.client.RuntimeMessageStore.routine_7607( com.whatsapp.client.RuntimeMessageStore, java.lang.Boolean, boolean ); // address: 0
	{
	enter_narrow 
	aload_1 
	invokevirtual boolean booleanValue( java.lang.Boolean ) // pc=1
	ifeq Label8
	iload_2 
	ifeq Label8
	getstatic_lib TRUE // Boolean
	areturn 
Label8:
	getstatic_lib FALSE // Boolean
	areturn 
	}


public final module:WhatsApp-11.class#1 getOrAddHistoryForPut( com.whatsapp.client.RuntimeMessageStore, java.lang.String ); // address: 0
	{
	enter_narrow 
	synch 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.//module:WhatsApp-11.class#1 module:WhatsApp-11.class#1 module:WhatsApp-11.class#1
	astore_2 
	aload_2 
	ifnonnull Label22
	new_lib com.whatsapp.client.ChatHistory//module:WhatsApp-11.class#1 module:WhatsApp-11.class#1 module:WhatsApp-11.class#1
	dup 
	aload_1 
	invokespecial_lib .routine_1734 // pc=2
	astore_2 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	aload_2 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_2 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label22:
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnull Label28
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_2 
	invokenonvirtual_lib .routine_1704 // pc=1
	invokenonvirtual_lib .routine_130 // pc=2
Label28:
	aload_2 
	areturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final java.lang.String toString( com.whatsapp.client.RuntimeMessageStore ); // address: 0
	{
	enter_narrow 
	sipush 336
	invokestatic java.lang.String getString( int ) // Resources
	areturn 
	}


public final int countDirty( com.whatsapp.client.RuntimeMessageStore ); // address: 0
	{
	enter 
	iconst_0 
	istore_1 
	aload_0 
	invokevirtual_short .virtual_6 // idx=6 pc=1
	astore_3 
	aload_3 
	ifnull Label23
	aload_3 
	invokevirtual java.util.Enumeration elements( java.util.Hashtable ) // pc=1
	astore_4 
Label11:
	aload_4 
	invokeinterface interfacemethodref_6 // pc=1 guess=5
	ifeq Label23
	aload_4 
	invokeinterface interfacemethodref_7 // pc=1 guess=6
	checkcast_lib com.whatsapp.client.ChatHistory//module:WhatsApp-11.class#1 module:WhatsApp-11.class#1 module:WhatsApp-11.class#1
	astore_2 
	aload_2 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifeq Label11
	iinc 1 1
	goto Label11
Label23:
	iload_1 
	ireturn 
	}


public final deleteChatHistory( com.whatsapp.client.RuntimeMessageStore, java.lang.String, boolean ); // address: 0
	{
	enter 
	aload_0 
	astore_3 
	aload_3 
	ifnull Label54
	aload_3 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.ChatHistory//module:WhatsApp-11.class#1 module:WhatsApp-11.class#1 module:WhatsApp-11.class#1
	astore_4 
	aload_3 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_4 
	invokevirtual boolean removeElement( java.util.Vector, java.lang.Object ) // pc=2
	pop 
	aload_3 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	pop 
	iload_2 
	ifeq Label31
	aload_3 
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnull Label31
	aload_3 
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_4 
	invokenonvirtual_lib .routine_1704 // pc=1
	invokenonvirtual_lib .routine_14 // pc=2
Label31:
	aload_4 
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifnull Label54
	invokestatic_lib module:WhatsApp-13.class#0.routine_833(  ) // class#0
	astore_5 
	aload_5 
	getfield .field_43_43   // get_name_1:  .field_43_43   // get_name_2:  .field_43_43   // get_Name:    .field_43_43   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 43
	ifnull Label43
	aload_5 
	getfield .field_43_43   // get_name_1:  .field_43_43   // get_name_2:  .field_43_43   // get_Name:    .field_43_43   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 43
	aload_1 
	invokenonvirtual_lib .routine_1593 // pc=2
Label43:
	new_lib com.whatsapp.client.ContactStatusDetails//module:WhatsApp.class#21 module:WhatsApp.class#21 module:WhatsApp.class#21
	dup 
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	iconst_0 
	i2l 
	aload_4 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokespecial_lib .routine_12926 // pc=5
	astore_6 
	aload_6 
	invokestatic_lib module:WhatsApp-20.class#0.routine_853(  ) // class#0
Label54:
	return 
	}


public final java.lang.String getAndClearUnsentLine( com.whatsapp.client.RuntimeMessageStore, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual_short .virtual_6 // idx=6 pc=1
	astore_2 
	aload_2 
	ifnull Label21
	aload_2 
	aload_1 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.ChatHistory//module:WhatsApp-11.class#1 module:WhatsApp-11.class#1 module:WhatsApp-11.class#1
	astore_3 
	aload_3 
	ifnull Label21
	aload_3 
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	astore_4 
	aload_3 
	aconst_null 
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_4 
	areturn 
Label21:
	aconst_null 
	areturn 
	}


public final java.util.Hashtable getChats( com.whatsapp.client.RuntimeMessageStore ); // address: 0
	{
	areturn_field .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	}


public final module:WhatsApp-26.class#23 getMessage( com.whatsapp.client.RuntimeMessageStore, module:WhatsApp-26.class#24 ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual_short .virtual_6 // idx=6 pc=1
	astore_2 
	aload_2 
	ifnull Label18
	aload_2 
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.ChatHistory//module:WhatsApp-11.class#1 module:WhatsApp-11.class#1 module:WhatsApp-11.class#1
	astore_3 
	aload_3 
	ifnull Label18
	aload_3 
	aload_1 
	invokenonvirtual_lib .routine_1132 // pc=2
	areturn 
Label18:
	aconst_null 
	areturn 
	}


public final boolean getMessages( com.whatsapp.client.RuntimeMessageStore, java.lang.String, module:WhatsApp-26.class#24, boolean, java.util.Vector ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual_short .virtual_6 // idx=6 pc=1
	astore_5 
	aload_5 
	ifnull Label63
	aload_5 
	aload_1 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.ChatHistory//module:WhatsApp-11.class#1 module:WhatsApp-11.class#1 module:WhatsApp-11.class#1
	astore_6 
	aload_6 
	ifnull Label63
	aload_6 
	dup 
	astore_7 
	monitorenter 
	aload_0 
	aload_6 
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_2 
	invokespecial com.whatsapp.client.RuntimeMessageStore.routine_7240 // pc=3
	istore 8
	aload_6 
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual int size( java.util.Vector ) // pc=1
	istore 9
	iload 8
	iconst_1 
	iadd 
	istore 10
Label31:
	iload 10
	iload 9
	if_icmpge Label42
	aload_4 
	aload_6 
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload 10
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	iinc 10 1
	goto Label31
Label42:
	iload_3 
	ifeq Label54
	aload_6 
	invokenonvirtual_lib .routine_1526 // pc=1
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnull Label54
	aload_6 
	invokenonvirtual_lib .routine_1704 // pc=1
	astore 10
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload 10
	invokenonvirtual_lib .routine_72 // pc=2
Label54:
	aload_7 
	monitorexit 
	iconst_1 
	ireturn 
	astore 11
	aload_7 
	monitorexit 
	aload 11
	athrow 
Label63:
	iconst_0 
	ireturn 
	}


public final java.util.Vector getMessagesBefore( com.whatsapp.client.RuntimeMessageStore, java.lang.String, module:WhatsApp-26.class#23, int ); // address: 0
	{
	enter 
	new_lib net.rim.device.api.ui.component.BasicEditField//net.rim.device.api.ui.component.BasicEditField net.rim.device.api.ui.component.BasicEditField net.rim.device.api.ui.component.BasicEditField
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_4 
	aload_0 
	invokevirtual_short .virtual_6 // idx=6 pc=1
	astore_5 
	aload_5 
	ifnonnull Label11
	goto_w Label80
Label11:
	aload_5 
	aload_1 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.ChatHistory//module:WhatsApp-11.class#1 module:WhatsApp-11.class#1 module:WhatsApp-11.class#1
	astore_6 
	aload_6 
	ifnull Label80
	aload_6 
	dup 
	astore_7 
	monitorenter 
	aload_2 
	ifnonnull Label39
	aload_6 
	invokenonvirtual_lib .routine_1526 // pc=1
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnull Label34
	aload_6 
	invokenonvirtual_lib .routine_1704 // pc=1
	astore 9
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload 9
	invokenonvirtual_lib .routine_72 // pc=2
Label34:
	aload_6 
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual int size( java.util.Vector ) // pc=1
	istore 8
	goto Label46
Label39:
	aload_0 
	aload_6 
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_2 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokespecial com.whatsapp.client.RuntimeMessageStore.routine_7240 // pc=3
	istore 8
Label46:
	iinc 8 -1
	iload 8
	iload_3 
	isub 
	iconst_1 
	iadd 
	istore 9
	iload 9
	ifge Label57
	iconst_0 
	goto Label58
Label57:
	iload 9
Label58:
	istore 9
	iload 8
	istore 10
Label61:
	iload 10
	iload 9
	if_icmplt Label72
	aload_4 
	aload_6 
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload 10
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	iinc 10 -1
	goto Label61
Label72:
	aload_7 
	monitorexit 
	goto Label80
	astore 11
	aload_7 
	monitorexit 
	aload 11
	athrow 
Label80:
	aload_4 
	areturn 
	}


public final java.util.Vector getMMSMessagesBefore( com.whatsapp.client.RuntimeMessageStore, java.lang.String, module:WhatsApp-26.class#23, int ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.ChatHistory//module:WhatsApp-11.class#1 module:WhatsApp-11.class#1 module:WhatsApp-11.class#1
	astore_4 
	new_lib net.rim.device.api.ui.component.BasicEditField//net.rim.device.api.ui.component.BasicEditField net.rim.device.api.ui.component.BasicEditField net.rim.device.api.ui.component.BasicEditField
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_5 
	aload_4 
	ifnonnull Label13
	goto_w Label90
Label13:
	aload_4 
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	astore_6 
	bipush -1
	istore_7 
	aload_6 
	invokevirtual int size( java.util.Vector ) // pc=1
	iconst_1 
	isub 
	istore 8
Label23:
	iload 8
	iflt Label43
	aload_6 
	iload 8
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-26.class#23 module:WhatsApp-26.class#23 module:WhatsApp-26.class#23
	astore 9
	aload_2 
	ifnull Label38
	aload 9
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_2 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label41
Label38:
	iload 8
	istore_7 
	goto Label43
Label41:
	iinc 8 -1
	goto Label23
Label43:
	iload_7 
	bipush -1
	if_icmpeq Label90
	iload_7 
	iconst_1 
	isub 
	istore 8
Label50:
	iload 8
	iflt Label90
	aload_5 
	invokevirtual int size( java.util.Vector ) // pc=1
	iload_3 
	if_icmpge Label90
	aload_6 
	iload 8
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-26.class#23 module:WhatsApp-26.class#23 module:WhatsApp-26.class#23
	astore 9
	aload 9
	getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	bipush 2
	if_icmpeq Label73
	aload 9
	getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	bipush 3
	if_icmpeq Label73
	aload 9
	getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	iconst_1 
	if_icmpne Label75
Label73:
	iconst_1 
	goto Label76
Label75:
	iconst_0 
Label76:
	istore 10
	iload 10
	ifeq Label88
	aload 9
	getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	checkcast_lib com.whatsapp.client.//module:WhatsApp-38.class#0 module:WhatsApp-38.class#0 module:WhatsApp-38.class#0
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifnonnull Label85
	goto Label88
Label85:
	aload_5 
	aload 9
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label88:
	iinc 8 -1
	goto Label50
Label90:
	aload_5 
	areturn 
	}


public final int getMMSMessagesCount( com.whatsapp.client.RuntimeMessageStore, java.lang.String ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.ChatHistory//module:WhatsApp-11.class#1 module:WhatsApp-11.class#1 module:WhatsApp-11.class#1
	astore_2 
	iconst_0 
	istore_3 
	aload_2 
	ifnull Label52
	aload_2 
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	astore_4 
	aload_4 
	invokevirtual int size( java.util.Vector ) // pc=1
	iconst_1 
	isub 
	istore_5 
Label18:
	iload_5 
	iflt Label52
	aload_4 
	iload_5 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-26.class#23 module:WhatsApp-26.class#23 module:WhatsApp-26.class#23
	astore_6 
	aload_6 
	getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	bipush 2
	if_icmpeq Label37
	aload_6 
	getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	bipush 3
	if_icmpeq Label37
	aload_6 
	getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	iconst_1 
	if_icmpne Label39
Label37:
	iconst_1 
	goto Label40
Label39:
	iconst_0 
Label40:
	istore_7 
	iload_7 
	ifeq Label50
	aload_6 
	getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	checkcast_lib com.whatsapp.client.MediaData//module:WhatsApp-38.class#0 module:WhatsApp-38.class#0 module:WhatsApp-38.class#0
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifnonnull Label49
	goto Label50
Label49:
	iinc 3 1
Label50:
	iinc 5 -1
	goto Label18
Label52:
	iload_3 
	ireturn 
	}


public final boolean putMessage( com.whatsapp.client.RuntimeMessageStore, module:WhatsApp-26.class#23 ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	iconst_0 
	invokenonvirtual com.whatsapp.client.RuntimeMessageStore.putMessage // pc=3
	ireturn 
	}


public final deleteMessage( com.whatsapp.client.RuntimeMessageStore, module:WhatsApp-26.class#23 ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokenonvirtual com.whatsapp.client.RuntimeMessageStore.getOrAddHistoryForPut // pc=2
	astore_2 
	aload_2 
	aload_1 
	invokenonvirtual_lib .routine_1392 // pc=2
	aload_2 
	invokenonvirtual_lib .routine_1526 // pc=1
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	pop 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnull Label25
	aload_2 
	invokenonvirtual_lib .routine_1704 // pc=1
	astore_3 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_3 
	invokenonvirtual_lib .routine_72 // pc=2
Label25:
	return 
	}


public final java.util.Hashtable getJidsPendingUpdate( com.whatsapp.client.RuntimeMessageStore ); // address: 0
	{
	enter 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	dup 
	astore_2 
	monitorenter 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	astore_1 
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_2 
	monitorexit 
	aload_1 
	areturn 
	astore_3 
	aload_2 
	monitorexit 
	aload_3 
	athrow 
	}


public final module:WhatsApp-26.class#24 getLastSeenMessage( com.whatsapp.client.RuntimeMessageStore, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.ChatHistory//module:WhatsApp-11.class#1 module:WhatsApp-11.class#1 module:WhatsApp-11.class#1
	astore_2 
	aload_2 
	ifnonnull Label10
	aconst_null 
	areturn 
Label10:
	aload_2 
	invokenonvirtual_lib .routine_1511 // pc=1
	areturn 
	}


public final setSystemFolder( com.whatsapp.client.RuntimeMessageStore, net.rim.blackberry.api.messagelist.ApplicationMessageFolder ); // address: 0
	{
	enter 
	aload_0 
	new_lib com.whatsapp.client.SafeApplicationMessageFolder//module:WhatsApp-48.class#0 module:WhatsApp-48.class#0 module:WhatsApp-48.class#0
	dup 
	aload_1 
	invokespecial_lib .routine_702 // pc=2
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	return 
	}


public final removeFromSystemFolder( com.whatsapp.client.RuntimeMessageStore, net.rim.blackberry.api.messagelist.ApplicationMessage ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_1 
	invokenonvirtual_lib .routine_14 // pc=2
	return 
	}


public final setUnsentLine( com.whatsapp.client.RuntimeMessageStore, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual_short .virtual_6 // idx=6 pc=1
	astore_3 
	aload_3 
	ifnull Label16
	aload_3 
	aload_1 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.ChatHistory//module:WhatsApp-11.class#1 module:WhatsApp-11.class#1 module:WhatsApp-11.class#1
	astore_4 
	aload_4 
	ifnull Label16
	aload_4 
	aload_2 
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
Label16:
	return 
	}


public final tickle( com.whatsapp.client.RuntimeMessageStore, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	astore_2 
	aload_2 
	ifnull Label23
	aload_2 
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnull Label23
	aload_2 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.ChatHistory//module:WhatsApp-11.class#1 module:WhatsApp-11.class#1 module:WhatsApp-11.class#1
	astore_3 
	aload_3 
	ifnull Label23
	aload_3 
	invokenonvirtual_lib .routine_1704 // pc=1
	astore_4 
	aload_2 
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_4 
	invokenonvirtual_lib .routine_72 // pc=2
Label23:
	return 
	}


public final net.rim.device.api.collection.ReadableList getApplicationMessageList( com.whatsapp.client.RuntimeMessageStore ); // address: 0
	{
	enter_narrow 
	new RuntimeMessageStore$ApplicationMessageReadableListAdapter
	dup 
	aload_0 
	invokespecial com.whatsapp.client.RuntimeMessageStore$ApplicationMessageReadableListAdapter.<init> // pc=2
	areturn 
	}


public final java.util.Enumeration getOfflineMessages( com.whatsapp.client.RuntimeMessageStore ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual java.util.Enumeration elements( java.util.Hashtable ) // pc=1
	areturn 
	}


public final messageStatusUpdate( com.whatsapp.client.RuntimeMessageStore, module:WhatsApp-26.class#24, int ); // address: 0
	{
	enter 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_1 
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	astore_3 
	aload_0 
	aload_1 
	invokevirtual_short .virtual_7 // idx=7 pc=2
	astore_4 
	aload_4 
	ifnull Label35
	aload_4 
	iload_2 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_4 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	bipush 4
	if_icmpeq Label19
	goto_w Label66
Label19:
	aload_3 
	ifnull Label22
	goto_w Label66
Label22:
	new_lib java.io.IOException//java.io.IOException java.io.IOException java.io.IOException
	dup 
	ldc literal_133:"server-acked FMessage key "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_4 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_134:" not found in offline messages!"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	return 
Label35:
	iload_2 
	tableswitch  :
		
		
		

Label37:
	ldc literal_135:"server"
	astore_5 
	goto Label52
Label40:
	ldc literal_136:"client"
	astore_5 
	goto Label52
Label43:
	new_lib java.io.IOException//java.io.IOException java.io.IOException java.io.IOException
	dup 
	ldc literal_137:"0x"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload_2 
	invokestatic_lib java.lang.String toHexString( int ) // Integer
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_5 
Label52:
	new_lib java.io.IOException//java.io.IOException java.io.IOException java.io.IOException
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_5 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_138:"-ack for FMessage key "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_1 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_139:" but key not found in message store"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
Label66:
	return 
	}


public final messageSaved( com.whatsapp.client.RuntimeMessageStore, module:WhatsApp-26.class#23 ); // address: 0
	{
	noenter_return 
	}


public final messageMediaDurationUpdated( com.whatsapp.client.RuntimeMessageStore, module:WhatsApp-26.class#23 ); // address: 0
	{
	noenter_return 
	}


public final boolean isPersistable( com.whatsapp.client.RuntimeMessageStore ); // address: 0
	{
	ireturn_bipush 0
	}


public final boolean isPersistenceEnabled( com.whatsapp.client.RuntimeMessageStore ); // address: 0
	{
	ireturn_bipush 0
	}


public final setPersistentFilesystem( com.whatsapp.client.RuntimeMessageStore, java.lang.String ); // address: 0
	{
	noenter_return 
	}


public final deleteEntireStorage( com.whatsapp.client.RuntimeMessageStore ); // address: 0
	{
	enter 
	new_lib net.rim.device.api.ui.component.Dialog//net.rim.device.api.ui.component.Dialog net.rim.device.api.ui.component.Dialog net.rim.device.api.ui.component.Dialog
	dup 
	sipush 632
	ldc literal_140:"RuntimeMessageStore"
	invokestatic java.lang.String getString( int, java.lang.String ) // Resources
	invokespecial_lib java.lang.RuntimeException.<init> // pc=2
	athrow 
	}


public final java.lang.String getSetupError( com.whatsapp.client.RuntimeMessageStore ); // address: 0
	{
	enter_narrow 
	aconst_null 
	areturn 
	}


public final java.lang.String getLogState( com.whatsapp.client.RuntimeMessageStore ); // address: 0
	{
	enter_narrow 
	ldc literal_140:"RuntimeMessageStore"
	areturn 
	}


public final java.lang.String getDefaultRoot( com.whatsapp.client.RuntimeMessageStore ); // address: 0
	{
	enter_narrow 
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	areturn 
	}


public final module:WhatsApp-12.class#0 addGroupChat( com.whatsapp.client.RuntimeMessageStore, java.lang.String, java.lang.String, int, java.lang.String, int ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	invokenonvirtual com.whatsapp.client.RuntimeMessageStore.getOrAddHistoryForPut // pc=2
	astore_6 
	iconst_0 
	istore_7 
	aload_6 
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifnonnull Label17
	aload_6 
	new_lib com.whatsapp.client.//module:WhatsApp-12.class#0 module:WhatsApp-12.class#0 module:WhatsApp-12.class#0
	dup 
	invokespecial_lib .routine_848 // pc=1
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iconst_1 
	istore_7 
Label17:
	aload_4 
	ifnull Label40
	iload_5 
	aload_6 
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	if_icmplt Label40
	aload_4 
	aload_6 
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokestatic_lib boolean strEqual( java.lang.String, java.lang.String ) // StringUtilities
	ifne Label32
	iconst_1 
	istore_7 
Label32:
	aload_6 
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_4 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_6 
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_5 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
Label40:
	iload_7 
	ifeq Label60
	invokestatic_lib module:WhatsApp-13.class#0.routine_833(  ) // class#0
	astore 8
	aload 8
	getfield .field_43_43   // get_name_1:  .field_43_43   // get_name_2:  .field_43_43   // get_Name:    .field_43_43   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 43
	ifnull Label51
	aload 8
	getfield .field_43_43   // get_name_1:  .field_43_43   // get_name_2:  .field_43_43   // get_Name:    .field_43_43   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 43
	aload_6 
	invokenonvirtual_lib .routine_1741 // pc=2
Label51:
	aload_6 
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_6 
	getstatic_lib module:WhatsApp-20.class#0.static_3 // class#0
	invokenonvirtual_lib .routine_1461 // pc=2
	aload_6 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokestatic_lib module:WhatsApp-20.class#0.routine_747(  ) // class#0
Label60:
	aload_2 
	ifnull Label66
	aload_6 
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_2 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
Label66:
	iload_3 
	ifle Label79
	aload_6 
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	new_lib Integer//java.lang.Integer java.lang.Integer java.lang.Integer
	dup 
	iload_3 
	i2l 
	sipush 1000
	i2l 
	lmul 
	invokespecial_lib java.lang.Long.<init> // pc=3
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
Label79:
	aload_6 
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	areturn 
	}


public final module:WhatsApp-11.class#1 addTempGroupChat( com.whatsapp.client.RuntimeMessageStore, java.lang.String ); // address: 0
	{
	enter 
	invokestatic_lib long currentTimeMillis(  ) // System
	lstore 2
	new_lib java.io.IOException//java.io.IOException java.io.IOException java.io.IOException
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	lload 2
	invokestatic_lib java.lang.String toString( long ) // Long
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	getstatic_lib module:WhatsApp-19.class#0.static_63 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_4 
	aload_0 
	aload_4 
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	iconst_0 
	aload_1 
	lload 2
	sipush 1000
	i2l 
	ldiv 
	l2i 
	invokenonvirtual com.whatsapp.client.RuntimeMessageStore.addGroupChat // pc=6
	astore_5 
	aload_5 
	iconst_1 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	aload_4 
	invokenonvirtual com.whatsapp.client.RuntimeMessageStore.getOrAddHistoryForPut // pc=2
	areturn 
	}


public final module:WhatsApp-12.class#0 getGroupChat( com.whatsapp.client.RuntimeMessageStore, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.ChatHistory//module:WhatsApp-11.class#1 module:WhatsApp-11.class#1 module:WhatsApp-11.class#1
	astore_2 
	aload_2 
	ifnonnull Label10
	aconst_null 
	areturn 
Label10:
	aload_2 
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	areturn 
	}


public final setChatState( com.whatsapp.client.RuntimeMessageStore, java.lang.String, int ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual_short .virtual_6 // idx=6 pc=1
	astore_3 
	aload_3 
	ifnull Label16
	aload_3 
	aload_1 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.ChatHistory//module:WhatsApp-11.class#1 module:WhatsApp-11.class#1 module:WhatsApp-11.class#1
	astore_4 
	aload_4 
	ifnull Label16
	aload_4 
	iload_2 
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
Label16:
	return 
	}


public final long getLastGroupsUpdate( com.whatsapp.client.RuntimeMessageStore ); // address: 0
	{
	enter_narrow 
	aload_0 
	lgetfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	lreturn 
	}


public final setLastGroupsUpdate( com.whatsapp.client.RuntimeMessageStore, long ); // address: 0
	{
	enter_narrow 
	aload_0 
	lload 1
	lputfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	return 
	}

}
