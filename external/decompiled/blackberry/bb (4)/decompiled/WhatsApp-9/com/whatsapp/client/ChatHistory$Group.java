// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-10.cod
// Module version  : 2.7.3204
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


abstract public final class ChatHistory$Group extends Object

{
	// @@@@@@@@@@@@@ Static fields 
	private final static net.rim.device.api.util.Comparator /*net.rim.device.api.util.Comparator*/  field_53458 ; // ofs = 53458 addr = 2)

	// @@@@@@@@@@@@@ Fields 
	public String /*java.lang.String*/  _subject ; // ofs = 53398 addr = 0)
	public int /*int*/  _subjectT ; // ofs = 53402 addr = 0)
	public String /*java.lang.String*/  _owner ; // ofs = 53406 addr = 0)
	public int /*int*/  _userAddT ; // ofs = 53410 addr = 0)
	public Long /*java.lang.Long*/  _creation ; // ofs = 53414 addr = 0)
	public boolean /*boolean*/  _createPending ; // ofs = 53418 addr = 0)
	private String /*java.lang.String*/  field_53422 ; // ofs = 53422 addr = 0)
	private net.rim.device.api.system.EncodedImage /*net.rim.device.api.system.EncodedImage*/  _photo ; // ofs = 53426 addr = 0)
	private net.rim.device.api.system.Bitmap /*net.rim.device.api.system.Bitmap*/  field_53430 ; // ofs = 53430 addr = 0)
	private net.rim.device.api.util.IntHashtable /*net.rim.device.api.util.IntHashtable*/  _scaledPhotos ; // ofs = 53434 addr = 0)
	private java.util.Hashtable /*java.util.Hashtable*/  field_53438 ; // ofs = 53438 addr = 0)
	private java.util.Hashtable /*java.util.Hashtable*/  field_53442 ; // ofs = 53442 addr = 0)
	public java.util.Hashtable /*java.util.Hashtable*/  _colorJidMap ; // ofs = 53446 addr = 0)
	private long /*long*/  field_53450 ; // ofs = 53450 addr = 0)
	private com.whatsapp.client.ChatHistory$Group$GroupListener /*com.whatsapp.client.ChatHistory$Group$GroupListener*/  field_53454 ; // ofs = 53454 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.ChatHistory$Group ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	iconst_0 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	new_lib net.rim.device.api.system.EncodedImage//net.rim.device.api.system.EncodedImage net.rim.device.api.system.EncodedImage net.rim.device.api.system.EncodedImage
	dup 
	iconst_0 
	i2l 
	invokespecial_lib java.lang.Long.<init> // pc=3
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	iconst_0 
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0 
	new_lib Object//java.lang.Object java.lang.Object java.lang.Object
	dup 
	invokespecial_lib net.rim.device.api.util.IntHashtable.<init> // pc=1
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	aload_0 
	aconst_null 
	putfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	return 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	synch_static ChatHistory$Group
	clinit_wait 
	new ChatHistory$Group$1
	dup 
	invokespecial com.whatsapp.client.ChatHistory$Group$1.<init> // pc=1
	putstatic com.whatsapp.client.ChatHistory$Group.field_53458 // ChatHistory$Group
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

public final setListener( com.whatsapp.client.ChatHistory$Group, com.whatsapp.client.ChatHistory$Group$GroupListener ); // address: 0
	{
	putfield_return .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	}


public final resetParticipants( com.whatsapp.client.ChatHistory$Group ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	invokevirtual clear( java.util.Hashtable ) // pc=1
	return 
	}


public final addParticipant( com.whatsapp.client.ChatHistory$Group, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_1 
	aload_1 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	return 
	}


public final removeParticipant( com.whatsapp.client.ChatHistory$Group, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_1 
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	pop 
	return 
	}


public final boolean hasParticipant( com.whatsapp.client.ChatHistory$Group, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_1 
	invokevirtual boolean containsKey( java.util.Hashtable, java.lang.Object ) // pc=2
	ireturn 
	}


public final getAddedAndRemovedJids( com.whatsapp.client.ChatHistory$Group, java.util.Vector, java.util.Vector ); // address: 0
	{
	enter 
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	invokestatic_lib module:WhatsApp-35.class#0.routine_5400(  ) // class#0
	astore_3 
	iconst_0 
	istore_4 
Label7:
	iload_4 
	aload_3 
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label24
	aload_3 
	iload_4 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	astore_5 
	aload_2 
	aload_5 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_5 
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	pop 
	iinc 4 1
	goto Label7
Label24:
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	invokestatic_lib module:WhatsApp-35.class#0.routine_5400(  ) // class#0
	astore_4 
	iconst_0 
	istore_5 
Label30:
	iload_5 
	aload_4 
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label48
	aload_4 
	iload_5 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	astore_6 
	aload_1 
	aload_6 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_6 
	aload_6 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	iinc 5 1
	goto Label30
Label48:
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	ifnull Label68
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_5 
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	invokevirtual java.util.Enumeration keys( java.util.Hashtable ) // pc=1
	astore_6 
Label57:
	aload_6 
	invokeinterface interfacemethodref_88 // pc=1 guess=0
	ifeq Label65
	aload_5 
	aload_6 
	invokeinterface interfacemethodref_89 // pc=1 guess=1
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	goto Label57
Label65:
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_5 
	invokeinterface interfacemethodref_90 // pc=2 guess=2
Label68:
	return 
	}


public final java.util.Vector getParticipantsAsChatables( com.whatsapp.client.ChatHistory$Group ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	invokevirtual java.util.Enumeration keys( java.util.Hashtable ) // pc=1
	astore_1 
	aload_1 
	aconst_null 
	invokestatic_lib module:WhatsApp-35.class#0.routine_6282(  ) // class#0
	areturn 
	}


public final java.lang.String getPhotoId( com.whatsapp.client.ChatHistory$Group ); // address: 0
	{
	areturn_field .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	}


public final setPhoto( com.whatsapp.client.ChatHistory$Group, java.lang.String, net.rim.device.api.system.EncodedImage ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	invokevirtual clear( net.rim.device.api.util.IntHashtable ) // pc=1
	aload_0 
	aload_1 
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0 
	aload_2 
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_0 
	aconst_null 
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	ifnull Label18
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_1 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	invokeinterface interfacemethodref_91 // pc=3 guess=3
Label18:
	return 
	}


public final setPhotoFromDb( com.whatsapp.client.ChatHistory$Group, java.lang.String, net.rim.device.api.system.EncodedImage ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	invokevirtual clear( net.rim.device.api.util.IntHashtable ) // pc=1
	aload_0 
	aload_1 
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0 
	aload_2 
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_0 
	aconst_null 
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	return 
	}


public final boolean checkUpdateAutoMute( com.whatsapp.client.ChatHistory$Group ); // address: 0
	{
	enter 
	invokestatic_lib long currentTimeMillis(  ) // System
	lstore 1
	aload_0 
	lgetfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	lload 1
	lcmp 
	ifle Label10
	iconst_1 
	goto Label11
Label10:
	iconst_0 
Label11:
	istore_3 
	sipush 30000
	i2l 
	sipush 5000
	i2l 
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	invokevirtual int size( java.util.Hashtable ) // pc=1
	i2l 
	lmul 
	ladd 
	lstore 4
	lload 4
	iipush 120000
	i2l 
	invokestatic_lib long min( long, long ) // Math
	lstore 6
	aload_0 
	lload 1
	lload 6
	ladd 
	lputfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	iload_3 
	ireturn 
	}


public final resetAutoMute( com.whatsapp.client.ChatHistory$Group ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_0 
	i2l 
	lputfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	return 
	}


public final java.lang.String getSimpleGroupParticipantsString( com.whatsapp.client.ChatHistory$Group ); // address: 0
	{
	enter 
	iconst_0 
	istore_1 
	invokestatic_lib module:WhatsApp-13.class#9.routine_10937(  ) // class#9
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	astore_2 
	aload_0 
	invokenonvirtual com.whatsapp.client.ChatHistory$Group.getParticipantsAsChatables // pc=1
	astore_3 
	new_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	dup 
	invokespecial_lib net.rim.device.api.util.SimpleSortingVector.<init> // pc=1
	astore_4 
	aload_4 
	getstatic com.whatsapp.client.ChatHistory$Group.field_53458 // ChatHistory$Group
	invokevirtual setSortComparator( net.rim.device.api.util.SimpleSortingVector, net.rim.device.api.util.Comparator ) // pc=2
	aload_3 
	invokevirtual int size( java.util.Vector ) // pc=1
	iconst_1 
	isub 
	istore_5 
Label21:
	iload_5 
	iflt Label44
	aload_3 
	iload_5 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast ChatableNumber
	astore_6 
	aload_2 
	aload_6 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label37
	iconst_1 
	istore_1 
	goto Label42
Label37:
	aload_4 
	aload_6 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokenonvirtual_lib .routine_5925 // pc=1
	invokevirtual addElement( net.rim.device.api.util.SimpleSortingVector, java.lang.Object ) // pc=2
Label42:
	iinc 5 -1
	goto Label21
Label44:
	aload_4 
	invokevirtual reSort( net.rim.device.api.util.SimpleSortingVector ) // pc=1
	new_lib net.rim.device.api.util.Comparator//net.rim.device.api.util.Comparator net.rim.device.api.util.Comparator net.rim.device.api.util.Comparator
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	astore_5 
	aload_4 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_6 
	iconst_0 
	istore_7 
Label55:
	iload_7 
	iload_6 
	if_icmpge Label72
	iload_7 
	ifle Label64
	aload_5 
	getstatic_lib module:WhatsApp-12.class#0.static_7 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label64:
	aload_5 
	aload_4 
	iload_7 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.Object ) // pc=2
	pop 
	iinc 7 1
	goto Label55
Label72:
	iload_1 
	ifeq Label86
	aload_4 
	invokevirtual int size( java.util.Vector ) // pc=1
	ifle Label81
	aload_5 
	getstatic_lib module:WhatsApp-12.class#0.static_7 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label81:
	aload_5 
	sipush 808
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label86:
	aload_5 
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}

}
