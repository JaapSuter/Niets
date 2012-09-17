// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-28.cod
// Module version  : 2.7.3204
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


abstract public final class RuntimeMessageStore extends Object
implements com.whatsapp.client.

{

	// @@@@@@@@@@@@@ Fields 
	private java.util.Hashtable /*java.util.Hashtable*/  field_53578 ; // ofs = 53578 addr = 0)
	private java.util.Hashtable /*java.util.Hashtable*/  field_53582 ; // ofs = 53582 addr = 0)
	private java.util.Vector /*java.util.Vector*/  _chatsV ; // ofs = 53586 addr = 0)
	private java.util.Hashtable /*java.util.Hashtable*/  field_53590 ; // ofs = 53590 addr = 0)
	private long /*long*/  field_53594 ; // ofs = 53594 addr = 0)
	private com.whatsapp.client.SafeApplicationMessageFolder /*com.whatsapp.client.SafeApplicationMessageFolder*/  field_53598 ; // ofs = 53598 addr = 0)

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
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
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

private final int com.whatsapp.client.RuntimeMessageStore.routine_1794( com.whatsapp.client.RuntimeMessageStore, java.util.Vector, java.lang.String ); // address: 0
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
	iflt Label25
	aload_1 
	iload_4 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-17.class#15 module:WhatsApp-17.class#15 module:WhatsApp-17.class#15
	astore_5 
	aload_5 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_2 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label23
	iload_4 
	ireturn 
Label23:
	iinc 4 -1
	goto Label8
Label25:
	bipush -1
	ireturn 
	}


private final java.lang.Boolean com.whatsapp.client.RuntimeMessageStore.routine_1847( com.whatsapp.client.RuntimeMessageStore, java.lang.Boolean, boolean ); // address: 0
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


public final module:WhatsApp-9.class#17 getOrAddHistoryForPut( com.whatsapp.client.RuntimeMessageStore, java.lang.String ); // address: 0
	{
	enter_narrow 
	synch 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.//module:WhatsApp-9.class#17 module:WhatsApp-9.class#17 module:WhatsApp-9.class#17
	astore_2 
	aload_2 
	ifnonnull Label22
	new_lib com.whatsapp.client.ChatHistory//module:WhatsApp-9.class#17 module:WhatsApp-9.class#17 module:WhatsApp-9.class#17
	dup 
	aload_1 
	invokespecial_lib .routine_7706 // pc=2
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
	invokenonvirtual_lib .routine_7678 // pc=1
	invokenonvirtual com.whatsapp.client.SafeApplicationMessageFolder.fireElementAdded // pc=2
Label28:
	aload_2 
	areturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final java.lang.String toString( com.whatsapp.client.RuntimeMessageStore ); // address: 0
	{
	enter_narrow 
	sipush 336
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
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
	invokeinterface interfacemethodref_15 // pc=1 guess=0
	ifeq Label23
	aload_4 
	invokeinterface interfacemethodref_16 // pc=1 guess=1
	checkcast_lib com.whatsapp.client.ChatHistory//module:WhatsApp-9.class#17 module:WhatsApp-9.class#17 module:WhatsApp-9.class#17
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
	ifnull Label31
	aload_3 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.ChatHistory//module:WhatsApp-9.class#17 module:WhatsApp-9.class#17 module:WhatsApp-9.class#17
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
	invokenonvirtual_lib .routine_7678 // pc=1
	invokenonvirtual com.whatsapp.client.SafeApplicationMessageFolder.fireElementRemoved // pc=2
Label31:
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
	checkcast_lib com.whatsapp.client.ChatHistory//module:WhatsApp-9.class#17 module:WhatsApp-9.class#17 module:WhatsApp-9.class#17
	astore_3 
	aload_3 
	ifnull Label21
	aload_3 
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	astore_4 
	aload_3 
	aconst_null 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
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


public final java.util.Vector getMessages( com.whatsapp.client.RuntimeMessageStore, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_3 
	aload_0 
	invokevirtual_short .virtual_6 // idx=6 pc=1
	astore_4 
	aload_4 
	ifnull Label42
	aload_4 
	aload_1 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.ChatHistory//module:WhatsApp-9.class#17 module:WhatsApp-9.class#17 module:WhatsApp-9.class#17
	astore_5 
	aload_5 
	ifnull Label42
	iconst_1 
	aload_0 
	aload_5 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_2 
	invokespecial com.whatsapp.client.RuntimeMessageStore.routine_1794 // pc=3
	iadd 
	istore_6 
	aload_5 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_7 
	iload_6 
	istore 8
Label31:
	iload 8
	iload_7 
	if_icmpge Label42
	aload_3 
	aload_5 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload 8
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	iinc 8 1
	goto Label31
Label42:
	aload_3 
	areturn 
	}


public final java.util.Vector getMessagesBefore( com.whatsapp.client.RuntimeMessageStore, java.lang.String, module:WhatsApp-17.class#15, int ); // address: 0
	{
	enter 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_4 
	aload_0 
	invokevirtual_short .virtual_6 // idx=6 pc=1
	astore_5 
	aload_5 
	ifnull Label58
	aload_5 
	aload_1 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.ChatHistory//module:WhatsApp-9.class#17 module:WhatsApp-9.class#17 module:WhatsApp-9.class#17
	astore_6 
	aload_6 
	ifnull Label58
	aload_2 
	ifnonnull Label24
	aload_6 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_7 
	goto Label32
Label24:
	aload_0 
	aload_6 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_2 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokespecial com.whatsapp.client.RuntimeMessageStore.routine_1794 // pc=3
	istore_7 
Label32:
	iinc 7 -1
	iload_7 
	iload_3 
	isub 
	iconst_1 
	iadd 
	istore 8
	iload 8
	ifge Label43
	iconst_0 
	goto Label44
Label43:
	iload 8
Label44:
	istore 8
	iload_7 
	istore 9
Label47:
	iload 9
	iload 8
	if_icmplt Label58
	aload_4 
	aload_6 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload 9
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	iinc 9 -1
	goto Label47
Label58:
	aload_4 
	areturn 
	}


public final java.util.Vector getMMSMessagesBefore( com.whatsapp.client.RuntimeMessageStore, java.lang.String, module:WhatsApp-17.class#15, int ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.ChatHistory//module:WhatsApp-9.class#17 module:WhatsApp-9.class#17 module:WhatsApp-9.class#17
	astore_4 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_5 
	aload_4 
	ifnonnull Label13
	goto_w Label88
Label13:
	aload_4 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
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
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-17.class#15 module:WhatsApp-17.class#15 module:WhatsApp-17.class#15
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
	if_icmpeq Label88
	iload_7 
	istore 8
Label48:
	iload 8
	iflt Label88
	aload_5 
	invokevirtual int size( java.util.Vector ) // pc=1
	iload_3 
	if_icmpge Label88
	aload_6 
	iload 8
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-17.class#15 module:WhatsApp-17.class#15 module:WhatsApp-17.class#15
	astore 9
	aload 9
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	bipush 2
	if_icmpeq Label71
	aload 9
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	bipush 3
	if_icmpeq Label71
	aload 9
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	iconst_1 
	if_icmpne Label73
Label71:
	iconst_1 
	goto Label74
Label73:
	iconst_0 
Label74:
	istore 10
	iload 10
	ifeq Label86
	aload 9
	getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	checkcast_lib com.whatsapp.client.MediaData//module:WhatsApp-23.class#0 module:WhatsApp-23.class#0 module:WhatsApp-23.class#0
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifnonnull Label83
	goto Label86
Label83:
	aload_5 
	aload 9
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label86:
	iinc 8 -1
	goto Label48
Label88:
	aload_5 
	areturn 
	}


public final int getMMSMessagesCount( com.whatsapp.client.RuntimeMessageStore, java.lang.String ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.ChatHistory//module:WhatsApp-9.class#17 module:WhatsApp-9.class#17 module:WhatsApp-9.class#17
	astore_2 
	iconst_0 
	istore_3 
	aload_2 
	ifnull Label52
	aload_2 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
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
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-17.class#15 module:WhatsApp-17.class#15 module:WhatsApp-17.class#15
	astore_6 
	aload_6 
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	bipush 2
	if_icmpeq Label37
	aload_6 
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	bipush 3
	if_icmpeq Label37
	aload_6 
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
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
	getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	checkcast_lib com.whatsapp.client.MediaData//module:WhatsApp-23.class#0 module:WhatsApp-23.class#0 module:WhatsApp-23.class#0
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


public final boolean putMessage( com.whatsapp.client.RuntimeMessageStore, module:WhatsApp-17.class#15 ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokenonvirtual com.whatsapp.client.RuntimeMessageStore.getOrAddHistoryForPut // pc=2
	astore_2 
	aload_2 
	dup 
	astore_3 
	monitorenter 
	aload_2 
	aload_1 
	invokenonvirtual_lib .routine_7109 // pc=2
	aload_3 
	monitorexit 
	goto Label22
	astore_4 
	aload_3 
	monitorexit 
	aload_4 
	athrow 
Label22:
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	bipush 4
	if_icmpeq Label48
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	bipush 5
	if_icmpeq Label48
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	bipush 6
	if_icmpeq Label48
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	bipush 7
	if_icmpeq Label48
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifeq Label48
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_1 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
Label48:
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnull Label56
	aload_2 
	invokenonvirtual_lib .routine_7678 // pc=1
	astore_3 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_3 
	invokenonvirtual com.whatsapp.client.SafeApplicationMessageFolder.fireElementUpdated // pc=2
Label56:
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	dup 
	astore_4 
	monitorenter 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokevirtual boolean isEmpty( java.util.Hashtable ) // pc=1
	istore_3 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	astore_5 
	aload_5 
	ifnonnull Label80
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifeq Label78
	getstatic_lib TRUE // Boolean
	goto Label79
Label78:
	getstatic_lib FALSE // Boolean
Label79:
	astore_5 
Label80:
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	aload_5 
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokespecial com.whatsapp.client.RuntimeMessageStore.routine_1847 // pc=3
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload_4 
	monitorexit 
	iload_3 
	ireturn 
	astore_6 
	aload_4 
	monitorexit 
	aload_6 
	athrow 
	}


public final deleteMessage( com.whatsapp.client.RuntimeMessageStore, module:WhatsApp-17.class#15 ); // address: 0
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
	invokenonvirtual_lib .routine_7269 // pc=2
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	pop 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnull Label23
	aload_2 
	invokenonvirtual_lib .routine_7678 // pc=1
	astore_3 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_3 
	invokenonvirtual com.whatsapp.client.SafeApplicationMessageFolder.fireElementUpdated // pc=2
Label23:
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


public final setDirty( com.whatsapp.client.RuntimeMessageStore, java.lang.String, boolean ); // address: 0
	{
	enter 
	aload_0 
	astore_3 
	aload_3 
	ifnull Label30
	aload_3 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.ChatHistory//module:WhatsApp-9.class#17 module:WhatsApp-9.class#17 module:WhatsApp-9.class#17
	astore_4 
	aload_4 
	ifnull Label30
	aload_4 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_2 
	if_icmpeq Label30
	aload_4 
	iload_2 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_3 
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnull Label30
	aload_4 
	invokenonvirtual_lib .routine_7678 // pc=1
	astore_5 
	aload_3 
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_5 
	invokenonvirtual com.whatsapp.client.SafeApplicationMessageFolder.fireElementUpdated // pc=2
Label30:
	return 
	}


public final setSystemFolder( com.whatsapp.client.RuntimeMessageStore, net.rim.blackberry.api.messagelist.ApplicationMessageFolder ); // address: 0
	{
	enter 
	aload_0 
	new SafeApplicationMessageFolder
	dup 
	aload_1 
	invokespecial com.whatsapp.client.SafeApplicationMessageFolder.<init> // pc=2
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	return 
	}


public final removeFromSystemFolder( com.whatsapp.client.RuntimeMessageStore, net.rim.blackberry.api.messagelist.ApplicationMessage ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_1 
	invokenonvirtual com.whatsapp.client.SafeApplicationMessageFolder.fireElementRemoved // pc=2
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
	checkcast_lib com.whatsapp.client.ChatHistory//module:WhatsApp-9.class#17 module:WhatsApp-9.class#17 module:WhatsApp-9.class#17
	astore_4 
	aload_4 
	ifnull Label16
	aload_4 
	aload_2 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
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
	checkcast_lib com.whatsapp.client.ChatHistory//module:WhatsApp-9.class#17 module:WhatsApp-9.class#17 module:WhatsApp-9.class#17
	astore_3 
	aload_3 
	ifnull Label23
	aload_3 
	invokenonvirtual_lib .routine_7678 // pc=1
	astore_4 
	aload_2 
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_4 
	invokenonvirtual com.whatsapp.client.SafeApplicationMessageFolder.fireElementUpdated // pc=2
Label23:
	return 
	}


public final net.rim.device.api.collection.ReadableList getApplicationMessageList( com.whatsapp.client.RuntimeMessageStore ); // address: 0
	{
	enter_narrow 
	new_lib com.whatsapp.client.//module:WhatsApp-27.class#30 module:WhatsApp-27.class#30 module:WhatsApp-27.class#30
	dup 
	aload_0 
	invokespecial_lib .routine_6263 // pc=2
	areturn 
	}


public final java.util.Enumeration getOfflineMessages( com.whatsapp.client.RuntimeMessageStore ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual java.util.Enumeration elements( java.util.Hashtable ) // pc=1
	areturn 
	}


public final messageReceived( com.whatsapp.client.RuntimeMessageStore, module:WhatsApp-17.class#15 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	pop 
	return 
	}


public final messageSaved( com.whatsapp.client.RuntimeMessageStore, module:WhatsApp-17.class#15 ); // address: 0
	{
	noenter_return 
	}


public final messageMediaDurationUpdated( com.whatsapp.client.RuntimeMessageStore, module:WhatsApp-17.class#15 ); // address: 0
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
	new_lib net.rim.device.api.ui.container.DialogFieldManager//net.rim.device.api.ui.container.DialogFieldManager net.rim.device.api.ui.container.DialogFieldManager net.rim.device.api.ui.container.DialogFieldManager
	dup 
	sipush 632
	ldc literal_139:"RuntimeMessageStore"
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	invokespecial_lib java.lang.RuntimeException.<init> // pc=2
	athrow 
	}


public final java.lang.String getSetupError( com.whatsapp.client.RuntimeMessageStore ); // address: 0
	{
	enter_narrow 
	aconst_null 
	areturn 
	}


public final java.lang.String getDefaultRoot( com.whatsapp.client.RuntimeMessageStore ); // address: 0
	{
	enter_narrow 
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	areturn 
	}


public final module:WhatsApp-10.class#0 addGroupChat( com.whatsapp.client.RuntimeMessageStore, java.lang.String, java.lang.String, int, java.lang.String, int ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	invokenonvirtual com.whatsapp.client.RuntimeMessageStore.getOrAddHistoryForPut // pc=2
	astore_6 
	iconst_0 
	istore_7 
	aload_6 
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnonnull Label17
	aload_6 
	new_lib com.whatsapp.client.ChatMessageStore//module:WhatsApp-10.class#0 module:WhatsApp-10.class#0 module:WhatsApp-10.class#0
	dup 
	invokespecial_lib .routine_688 // pc=1
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iconst_1 
	istore_7 
Label17:
	aload_4 
	ifnull Label32
	iload_5 
	aload_6 
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	if_icmplt Label32
	aload_6 
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_4 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_6 
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iload_5 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
Label32:
	aload_2 
	ifnull Label38
	aload_6 
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_2 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
Label38:
	iload_3 
	ifle Label51
	aload_6 
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	iload_3 
	i2l 
	sipush 1000
	i2l 
	lmul 
	invokespecial_lib java.lang.Long.<init> // pc=3
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
Label51:
	aload_6 
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	areturn 
	}


public final module:WhatsApp-9.class#17 addTempGroupChat( com.whatsapp.client.RuntimeMessageStore, java.lang.String ); // address: 0
	{
	enter 
	invokestatic_lib long currentTimeMillis(  ) // System
	lstore 2
	new_lib Object//java.lang.Object java.lang.Object java.lang.Object
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	lload 2
	invokestatic_lib java.lang.String toString( long ) // Long
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_140:"@invalid"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_4 
	aload_0 
	aload_4 
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
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
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0 
	aload_4 
	invokenonvirtual com.whatsapp.client.RuntimeMessageStore.getOrAddHistoryForPut // pc=2
	areturn 
	}


public final module:WhatsApp-10.class#0 getGroupChat( com.whatsapp.client.RuntimeMessageStore, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.ChatHistory//module:WhatsApp-9.class#17 module:WhatsApp-9.class#17 module:WhatsApp-9.class#17
	astore_2 
	aload_2 
	ifnonnull Label10
	aconst_null 
	areturn 
Label10:
	aload_2 
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
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
	checkcast_lib com.whatsapp.client.ChatHistory//module:WhatsApp-9.class#17 module:WhatsApp-9.class#17 module:WhatsApp-9.class#17
	astore_4 
	aload_4 
	ifnull Label16
	aload_4 
	iload_2 
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
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
