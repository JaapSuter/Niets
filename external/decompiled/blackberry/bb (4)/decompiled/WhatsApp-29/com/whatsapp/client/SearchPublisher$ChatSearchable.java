// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-29.cod
// Module version  : 2.7.3204
// Class ID        : 4
// ########################################################


package com.whatsapp.client;


abstract public final class SearchPublisher$ChatSearchable extends Object
implements net.rim.device.api.unifiedsearch.searchables.EntityBasedSearchable

{
	// @@@@@@@@@@@@@ Static fields 
	public static String /*java.lang.String*/  SEARCH_FIELD_NAME ; // ofs = 54264 addr = 10)
	public static String /*java.lang.String*/  SEARCH_FIELD_LABEL ; // ofs = 54270 addr = 11)
	public static String /*java.lang.String*/  SEARCH_FIELD_GROUPNAME ; // ofs = 54276 addr = 12)

	// @@@@@@@@@@@@@ Fields 
	private net.rim.device.api.unifiedsearch.SearchField /*net.rim.device.api.unifiedsearch.SearchField[]*/  field_54236 ; // ofs = 54236 addr = 0)
	private long /*long*/  field_54240 ; // ofs = 54240 addr = 0)
	public net.rim.device.api.unifiedsearch.SearchField /*net.rim.device.api.unifiedsearch.SearchField*/  _nameField ; // ofs = 54244 addr = 0)
	public net.rim.device.api.unifiedsearch.SearchField /*net.rim.device.api.unifiedsearch.SearchField*/  _labelField ; // ofs = 54248 addr = 0)
	public net.rim.device.api.unifiedsearch.SearchField /*net.rim.device.api.unifiedsearch.SearchField*/  _groupNameField ; // ofs = 54252 addr = 0)
	private com.whatsapp.client.SearchPublisher$ChatEntity /*com.whatsapp.client.SearchPublisher$ChatEntity[]*/  field_54256 ; // ofs = 54256 addr = 0)
	private java.util.Hashtable /*java.util.Hashtable*/  field_54260 ; // ofs = 54260 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.SearchPublisher$ChatSearchable ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	new_lib net.rim.device.api.unifiedsearch.SearchField//net.rim.device.api.unifiedsearch.SearchField net.rim.device.api.unifiedsearch.SearchField net.rim.device.api.unifiedsearch.SearchField
	dup 
	getstatic SEARCH_FIELD_NAME // SearchPublisher$ChatSearchable
	invokespecial_lib net.rim.device.api.unifiedsearch.SearchField.<init> // pc=2
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	new_lib net.rim.device.api.unifiedsearch.SearchField//net.rim.device.api.unifiedsearch.SearchField net.rim.device.api.unifiedsearch.SearchField net.rim.device.api.unifiedsearch.SearchField
	dup 
	getstatic SEARCH_FIELD_LABEL // SearchPublisher$ChatSearchable
	invokespecial_lib net.rim.device.api.unifiedsearch.SearchField.<init> // pc=2
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	new_lib net.rim.device.api.unifiedsearch.SearchField//net.rim.device.api.unifiedsearch.SearchField net.rim.device.api.unifiedsearch.SearchField net.rim.device.api.unifiedsearch.SearchField
	dup 
	getstatic SEARCH_FIELD_GROUPNAME // SearchPublisher$ChatSearchable
	invokespecial_lib net.rim.device.api.unifiedsearch.SearchField.<init> // pc=2
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0 
	bipush 3
	newarray_object_lib net.rim.device.api.unifiedsearch.SearchField//net.rim.device.api.unifiedsearch.SearchField net.rim.device.api.unifiedsearch.SearchField net.rim.device.api.unifiedsearch.SearchField
	dup 
	iconst_0 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aastore 
	dup 
	iconst_1 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aastore 
	dup 
	bipush 2
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aastore 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	return 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	synch_static SearchPublisher$ChatSearchable
	clinit_wait 
	ldc literal_51:"Name"
	putstatic SEARCH_FIELD_NAME // SearchPublisher$ChatSearchable
	ldc literal_52:"Label"
	putstatic SEARCH_FIELD_LABEL // SearchPublisher$ChatSearchable
	ldc literal_53:"Group Name"
	putstatic SEARCH_FIELD_GROUPNAME // SearchPublisher$ChatSearchable
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.SearchPublisher$ChatSearchable.routine_2692( com.whatsapp.client.SearchPublisher$ChatSearchable ); // address: 0
	{
	enter 
	invokestatic_lib net.rim.device.api.system.RuntimeStore getRuntimeStore(  ) // RuntimeStore
	lipush 8535665252065932813
	invokevirtual java.lang.Object get( net.rim.device.api.system.RuntimeStore, long ) // pc=3
	checkcast_lib com.whatsapp.client.//module:WhatsApp-13.class#1 module:WhatsApp-13.class#1 module:WhatsApp-13.class#1
	astore_1 
	aload_0 
	iconst_0 
	newarray_object SearchPublisher$ChatEntity
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	getstatic_lib module:WhatsApp-13.class#7.static_25 // class#7
	invokestatic_lib net.rim.device.api.ui.image.Image createImage( net.rim.device.api.system.Bitmap ) // ImageFactory
	astore_2 
	aload_1 
	aconst_null 
	iconst_1 
	invokenonvirtual_lib .routine_4574 // pc=3
	astore_3 
	aload_3 
	invokevirtual java.util.Enumeration elements( java.util.Vector ) // pc=1
	astore_4 
Label21:
	aload_4 
	invokeinterface interfacemethodref_4 // pc=1 guess=4
	ifeq Label75
	aload_4 
	invokeinterface interfacemethodref_5 // pc=1 guess=5
	checkcast_lib com.whatsapp.client.//module:WhatsApp.class#12 module:WhatsApp.class#12 module:WhatsApp.class#12
	astore_5 
	aload_5 
	invokenonvirtual_lib .routine_6298 // pc=1
	astore_6 
	iconst_0 
	istore_7 
Label33:
	iload_7 
	aload_6 
	arraylength 
	if_icmpge Label21
	aload_1 
	aload_5 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getstatic_lib module:WhatsApp-13.class#7.static_21 // class#7
	getstatic_lib module:WhatsApp-13.class#7.static_21 // class#7
	invokenonvirtual_lib .routine_3766 // pc=4
	astore 9
	aload 9
	ifnull Label50
	aload 9
	invokestatic_lib net.rim.device.api.ui.image.Image createImage( net.rim.device.api.system.Bitmap ) // ImageFactory
	astore 8
	goto Label52
Label50:
	aload_2 
	astore 8
Label52:
	new SearchPublisher$ChatEntity
	dup 
	aload_6 
	iload_7 
	aaload 
	aload_0 
	aload 8
	invokespecial com.whatsapp.client.SearchPublisher$ChatEntity.<init> // pc=4
	astore 10
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload 10
	invokestatic_lib add( java.lang.Object[], java.lang.Object ) // Arrays
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_6 
	iload_7 
	aaload 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload 10
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	iinc 7 1
	goto Label33
Label75:
	getstatic_lib module:WhatsApp-13.class#7.static_26 // class#7
	invokestatic_lib net.rim.device.api.ui.image.Image createImage( net.rim.device.api.system.Bitmap ) // ImageFactory
	astore_5 
	invokestatic_lib module:WhatsApp-10.class#6.routine_2272(  ) // class#6
	astore_6 
	aload_6 
	invokevirtual java.util.Enumeration elements( java.util.Hashtable ) // pc=1
	astore_7 
Label83:
	aload_7 
	invokeinterface interfacemethodref_4 // pc=1 guess=4
	ifeq Label110
	aload_7 
	invokeinterface interfacemethodref_5 // pc=1 guess=5
	checkcast_lib com.whatsapp.client.//module:WhatsApp-9.class#15 module:WhatsApp-9.class#15 module:WhatsApp-9.class#15
	astore 8
	aload 8
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnull Label83
	new SearchPublisher$ChatEntity
	dup 
	aload 8
	aload_0 
	aload_5 
	invokespecial com.whatsapp.client.SearchPublisher$ChatEntity.<init> // pc=4
	astore 9
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload 9
	invokestatic_lib add( java.lang.Object[], java.lang.Object ) // Arrays
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload 8
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload 9
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	goto Label83
Label110:
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final com.whatsapp.client.SearchPublisher$ChatEntity[] deleteContact( com.whatsapp.client.SearchPublisher$ChatSearchable, module:WhatsApp.class#12 ); // address: 0
	{
	enter 
	iconst_0 
	newarray_object SearchPublisher$ChatEntity
	astore_2 
	aload_1 
	invokenonvirtual_lib .routine_6298 // pc=1
	astore_3 
	iconst_0 
	istore_4 
Label9:
	iload_4 
	aload_3 
	arraylength 
	if_icmpge Label31
	aload_3 
	iload_4 
	aaload 
	astore_5 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_5 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast SearchPublisher$ChatEntity
	astore_6 
	aload_6 
	ifnull Label29
	aload_2 
	aload_6 
	invokestatic_lib add( java.lang.Object[], java.lang.Object ) // Arrays
Label29:
	iinc 4 1
	goto Label9
Label31:
	aload_2 
	areturn 
	}


public final com.whatsapp.client.SearchPublisher$ChatEntity[] deleteChatHistory( com.whatsapp.client.SearchPublisher$ChatSearchable, java.lang.String ); // address: 0
	{
	enter 
	iconst_0 
	newarray_object SearchPublisher$ChatEntity
	astore_2 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_1 
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast SearchPublisher$ChatEntity
	astore_3 
	aload_3 
	ifnull Label14
	aload_2 
	aload_3 
	invokestatic_lib add( java.lang.Object[], java.lang.Object ) // Arrays
Label14:
	aload_2 
	areturn 
	}


public final com.whatsapp.client.SearchPublisher$ChatEntity[] updateContact( com.whatsapp.client.SearchPublisher$ChatSearchable, module:WhatsApp.class#12 ); // address: 0
	{
	enter 
	iconst_0 
	newarray_object SearchPublisher$ChatEntity
	astore_2 
	invokestatic_lib net.rim.device.api.system.RuntimeStore getRuntimeStore(  ) // RuntimeStore
	lipush 8535665252065932813
	invokevirtual java.lang.Object get( net.rim.device.api.system.RuntimeStore, long ) // pc=3
	checkcast_lib com.whatsapp.client.ContactInfo//module:WhatsApp-13.class#1 module:WhatsApp-13.class#1 module:WhatsApp-13.class#1
	astore_3 
	getstatic_lib module:WhatsApp-13.class#7.static_25 // class#7
	invokestatic_lib net.rim.device.api.ui.image.Image createImage( net.rim.device.api.system.Bitmap ) // ImageFactory
	astore_4 
	aload_3 
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getstatic_lib module:WhatsApp-13.class#7.static_21 // class#7
	getstatic_lib module:WhatsApp-13.class#7.static_21 // class#7
	invokenonvirtual_lib .routine_3766 // pc=4
	astore_6 
	aload_6 
	ifnull Label25
	aload_6 
	invokestatic_lib net.rim.device.api.ui.image.Image createImage( net.rim.device.api.system.Bitmap ) // ImageFactory
	astore_5 
	goto Label27
Label25:
	aload_4 
	astore_5 
Label27:
	aload_1 
	invokenonvirtual_lib .routine_6298 // pc=1
	astore_7 
	iconst_0 
	istore 8
Label32:
	iload 8
	aload_7 
	arraylength 
	if_icmpge Label76
	aload_7 
	iload 8
	aaload 
	astore 9
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload 9
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast SearchPublisher$ChatEntity
	astore 10
	aload 10
	ifnonnull Label67
	new SearchPublisher$ChatEntity
	dup 
	aload 9
	aload_0 
	aload_5 
	invokespecial com.whatsapp.client.SearchPublisher$ChatEntity.<init> // pc=4
	astore 10
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload 10
	invokestatic_lib add( java.lang.Object[], java.lang.Object ) // Arrays
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload 9
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload 10
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	goto Label71
Label67:
	aload 10
	aload 9
	aload_5 
	invokenonvirtual com.whatsapp.client.SearchPublisher$ChatEntity.updateName // pc=3
Label71:
	aload_2 
	aload 10
	invokestatic_lib add( java.lang.Object[], java.lang.Object ) // Arrays
	iinc 8 1
	goto Label32
Label76:
	aload_2 
	areturn 
	}


public final com.whatsapp.client.SearchPublisher$ChatEntity[] updateChatHistory( com.whatsapp.client.SearchPublisher$ChatSearchable, module:WhatsApp-9.class#15 ); // address: 0
	{
	enter 
	getstatic_lib module:WhatsApp-13.class#7.static_26 // class#7
	invokestatic_lib net.rim.device.api.ui.image.Image createImage( net.rim.device.api.system.Bitmap ) // ImageFactory
	astore_2 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast SearchPublisher$ChatEntity
	astore_3 
	aload_3 
	ifnonnull Label29
	new SearchPublisher$ChatEntity
	dup 
	aload_1 
	aload_0 
	aload_2 
	invokespecial com.whatsapp.client.SearchPublisher$ChatEntity.<init> // pc=4
	astore_3 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_3 
	invokestatic_lib add( java.lang.Object[], java.lang.Object ) // Arrays
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_3 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	goto Label33
Label29:
	aload_3 
	aload_1 
	aload_2 
	invokenonvirtual com.whatsapp.client.SearchPublisher$ChatEntity.updateName // pc=3
Label33:
	iconst_1 
	newarray_object SearchPublisher$ChatEntity
	dup 
	iconst_0 
	aload_3 
	aastore 
	areturn 
	}


public final java.lang.String getName( com.whatsapp.client.SearchPublisher$ChatSearchable ); // address: 0
	{
	enter_narrow 
	sipush 811
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	areturn 
	}


public final int getPriority( com.whatsapp.client.SearchPublisher$ChatSearchable ); // address: 0
	{
	ireturn_bipush 50
	}


public final int getPrivacyLevel( com.whatsapp.client.SearchPublisher$ChatSearchable ); // address: 0
	{
	ireturn_bipush 1
	}


public final long getRegistrationID( com.whatsapp.client.SearchPublisher$ChatSearchable ); // address: 0
	{
	enter_narrow 
	aload_0 
	lgetfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	lreturn 
	}


public final long getType( com.whatsapp.client.SearchPublisher$ChatSearchable ); // address: 0
	{
	enter_narrow 
	iipush 16777217
	i2l 
	lreturn 
	}


public final net.rim.device.api.unifiedsearch.action.UiAction getUiActions( com.whatsapp.client.SearchPublisher$ChatSearchable, net.rim.device.api.unifiedsearch.entity.SearchableEntity[], java.lang.Object, net.rim.device.api.unifiedsearch.action.UiAction[] ); // address: 0
	{
	enter 
	aconst_null 
	areturn 
	}


public final load( com.whatsapp.client.SearchPublisher$ChatSearchable, net.rim.device.api.unifiedsearch.query.NotificationListener, int ); // address: 0
	{
	noenter_return 
	}


public final pause( com.whatsapp.client.SearchPublisher$ChatSearchable ); // address: 0
	{
	noenter_return 
	}


public final resume( com.whatsapp.client.SearchPublisher$ChatSearchable ); // address: 0
	{
	noenter_return 
	}


public final setRegistrationID( com.whatsapp.client.SearchPublisher$ChatSearchable, long ); // address: 0
	{
	enter_narrow 
	aload_0 
	lload 1
	lputfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	return 
	}


public final net.rim.device.api.ui.image.Image getIcon( com.whatsapp.client.SearchPublisher$ChatSearchable ); // address: 0
	{
	enter_narrow 
	getstatic_lib module:WhatsApp-12.class#0.static_61 // class#0
	invokestatic_lib net.rim.device.api.ui.image.Image createImage( java.lang.String ) // ImageFactory
	areturn 
	}


public final net.rim.device.api.util.Comparator getComparator( com.whatsapp.client.SearchPublisher$ChatSearchable ); // address: 0
	{
	enter_narrow 
	aconst_null 
	areturn 
	}


public final net.rim.device.api.unifiedsearch.SearchField[] defineSupportedSearchFields( com.whatsapp.client.SearchPublisher$ChatSearchable ); // address: 0
	{
	areturn_field .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	}


public final net.rim.device.api.unifiedsearch.entity.SearchableEntity[] getSearchableEntities( com.whatsapp.client.SearchPublisher$ChatSearchable ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnonnull Label5
	aload_0 
	invokespecial com.whatsapp.client.SearchPublisher$ChatSearchable.routine_2692 // pc=1
Label5:
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	areturn 
	}

}