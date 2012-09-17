// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-12.cod
// Module version  : 2.8.1914
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


abstract public final class ChatHistory$Group extends Object

{
	// @@@@@@@@@@@@@ Static fields 
	private final static net.rim.device.api.util.Comparator /*net.rim.device.api.util.Comparator*/  field_55040 ; // ofs = 55040 addr = 2)

	// @@@@@@@@@@@@@ Fields 
	public String /*java.lang.String*/  _subject ; // ofs = 54980 addr = 0)
	public int /*int*/  _subjectT ; // ofs = 54984 addr = 0)
	public String /*java.lang.String*/  _owner ; // ofs = 54988 addr = 0)
	public Long /*java.lang.Long*/  _creation ; // ofs = 54992 addr = 0)
	public boolean /*boolean*/  _createPending ; // ofs = 54996 addr = 0)
	private String /*java.lang.String*/  field_55000 ; // ofs = 55000 addr = 0)
	private net.rim.device.api.system.EncodedImage /*net.rim.device.api.system.EncodedImage*/  _photo ; // ofs = 55004 addr = 0)
	private net.rim.device.api.util.IntHashtable /*net.rim.device.api.util.IntHashtable*/  _scaledPhotos ; // ofs = 55008 addr = 0)
	private net.rim.device.api.system.EncodedImage /*net.rim.device.api.system.EncodedImage*/  field_55012 ; // ofs = 55012 addr = 0)
	private net.rim.device.api.system.EncodedImage /*net.rim.device.api.system.EncodedImage*/  field_55016 ; // ofs = 55016 addr = 0)
	private java.util.Hashtable /*java.util.Hashtable*/  field_55020 ; // ofs = 55020 addr = 0)
	private java.util.Hashtable /*java.util.Hashtable*/  field_55024 ; // ofs = 55024 addr = 0)
	public java.util.Hashtable /*java.util.Hashtable*/  _colorJidMap ; // ofs = 55028 addr = 0)
	private long /*long*/  field_55032 ; // ofs = 55032 addr = 0)
	private com.whatsapp.client. /*module:WhatsApp-11.class#3*/  field_55036 ; // ofs = 55036 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.ChatHistory$Group ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	iconst_0 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	new_lib Object//java.lang.Object java.lang.Object java.lang.Object
	dup 
	iconst_0 
	i2l 
	invokespecial_lib java.lang.Long.<init> // pc=3
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	iconst_0 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	new_lib net.rim.device.api.system.EncodedImage//net.rim.device.api.system.EncodedImage net.rim.device.api.system.EncodedImage net.rim.device.api.system.EncodedImage
	dup 
	invokespecial_lib net.rim.device.api.util.IntHashtable.<init> // pc=1
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_0 
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_0 
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_0 
	new_lib String//java.lang.String java.lang.String java.lang.String
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
	new_lib com.whatsapp.client.ChatHistory$Group$1//module:WhatsApp-11.class#2 module:WhatsApp-11.class#2 module:WhatsApp-11.class#2
	dup 
	invokespecial_lib .routine_3003 // pc=1
	putstatic com.whatsapp.client.ChatHistory$Group.field_55040 // ChatHistory$Group
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

public final setListener( com.whatsapp.client.ChatHistory$Group, module:WhatsApp-11.class#3 ); // address: 0
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
	invokestatic_lib module:WhatsApp-79.class#39.routine_27712(  ) // class#39
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
	invokestatic_lib module:WhatsApp-79.class#39.routine_27712(  ) // class#39
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
	new_lib net.rim.device.api.util.Comparator//net.rim.device.api.util.Comparator net.rim.device.api.util.Comparator net.rim.device.api.util.Comparator
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_5 
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	invokevirtual java.util.Enumeration keys( java.util.Hashtable ) // pc=1
	astore_6 
Label57:
	aload_6 
	invokeinterface interfacemethodref_14 // pc=1 guess=0
	ifeq Label65
	aload_5 
	aload_6 
	invokeinterface interfacemethodref_15 // pc=1 guess=1
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	goto Label57
Label65:
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_5 
	invokeinterface interfacemethodref_16 // pc=2 guess=2
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
	invokestatic_lib module:WhatsApp-79.class#39.routine_28395(  ) // class#39
	areturn 
	}


public final java.lang.String getPhotoId( com.whatsapp.client.ChatHistory$Group ); // address: 0
	{
	areturn_field .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	}


public final setPreviewPhoto( com.whatsapp.client.ChatHistory$Group, java.lang.String, net.rim.device.api.system.EncodedImage ); // address: 0
	{
	jumpspecial com.whatsapp.client.ChatHistory$Group.routine_325( com.whatsapp.client.ChatHistory$Group, java.lang.String, net.rim.device.api.system.EncodedImage )
	}


private final com.whatsapp.client.ChatHistory$Group.routine_325( com.whatsapp.client.ChatHistory$Group, java.lang.String, net.rim.device.api.system.EncodedImage ); // address: 0
	{
	enter 
	aload_0 
	aconst_null 
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_0 
	aconst_null 
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_1 
	ifnull Label13
	aload_1 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label15
Label13:
	iconst_1 
	goto Label16
Label15:
	iconst_0 
Label16:
	istore_3 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	invokevirtual clear( net.rim.device.api.util.IntHashtable ) // pc=1
	aload_0 
	aload_1 
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iload_3 
	ifne Label26
	aload_2 
	ifnull Label29
Label26:
	aload_0 
	aload_2 
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
Label29:
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	ifnull Label35
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_1 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokeinterface interfacemethodref_17 // pc=3 guess=3
Label35:
	return 
	}


public final setPhotoFromDb( com.whatsapp.client.ChatHistory$Group, java.lang.String, net.rim.device.api.system.EncodedImage ); // address: 0
	{
	enter_narrow 
	aload_0 
	aconst_null 
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_0 
	aconst_null 
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	invokevirtual clear( net.rim.device.api.util.IntHashtable ) // pc=1
	aload_0 
	aload_1 
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0 
	aload_2 
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	return 
	}


public final net.rim.device.api.system.EncodedImage getPhoto( com.whatsapp.client.ChatHistory$Group ); // address: 0
	{
	areturn_field .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	}


public final setPhotoDirty( com.whatsapp.client.ChatHistory$Group, net.rim.device.api.system.EncodedImage, net.rim.device.api.system.EncodedImage ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_0 
	aload_2 
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	return 
	}


public final boolean isPhotoDirty( com.whatsapp.client.ChatHistory$Group ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifnonnull Label5
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	ifnull Label7
Label5:
	iconst_1 
	ireturn 
Label7:
	iconst_0 
	ireturn 
	}


public final clearDirtyPhoto( com.whatsapp.client.ChatHistory$Group ); // address: 0
	{
	enter_narrow 
	aload_0 
	aconst_null 
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_0 
	aconst_null 
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	return 
	}


public final net.rim.device.api.system.EncodedImage getDirtyPhotoThumb( com.whatsapp.client.ChatHistory$Group ); // address: 0
	{
	areturn_field .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	}


public final net.rim.device.api.system.EncodedImage getDirtyPhotoFull( com.whatsapp.client.ChatHistory$Group ); // address: 0
	{
	areturn_field .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
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
	invokestatic_lib module:WhatsApp-21.class#0.routine_1491(  ) // class#0
	astore_2 
	aload_2 
	ifnonnull Label9
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	areturn 
Label9:
	aload_2 
	invokenonvirtual_lib .routine_330 // pc=1
	astore_3 
	aload_0 
	invokenonvirtual com.whatsapp.client.ChatHistory$Group.getParticipantsAsChatables // pc=1
	astore_4 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib net.rim.device.api.util.SimpleSortingVector.<init> // pc=1
	astore_5 
	aload_5 
	getstatic com.whatsapp.client.ChatHistory$Group.field_55040 // ChatHistory$Group
	invokevirtual setSortComparator( net.rim.device.api.util.SimpleSortingVector, net.rim.device.api.util.Comparator ) // pc=2
	aload_4 
	invokevirtual int size( java.util.Vector ) // pc=1
	iconst_1 
	isub 
	istore_6 
Label27:
	iload_6 
	iflt Label50
	aload_4 
	iload_6 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast ChatableNumber
	astore_7 
	aload_3 
	aload_7 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokenonvirtual_lib .routine_12254 // pc=1
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label43
	iconst_1 
	istore_1 
	goto Label48
Label43:
	aload_5 
	aload_7 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokenonvirtual_lib .routine_8739 // pc=1
	invokevirtual addElement( net.rim.device.api.util.SimpleSortingVector, java.lang.Object ) // pc=2
Label48:
	iinc 6 -1
	goto Label27
Label50:
	aload_5 
	invokevirtual reSort( net.rim.device.api.util.SimpleSortingVector ) // pc=1
	new_lib net.rim.device.api.util.SimpleSortingVector//net.rim.device.api.util.SimpleSortingVector net.rim.device.api.util.SimpleSortingVector net.rim.device.api.util.SimpleSortingVector
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	astore_6 
	aload_5 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_7 
	iconst_0 
	istore 8
Label61:
	iload 8
	iload_7 
	if_icmpge Label78
	iload 8
	ifle Label70
	aload_6 
	getstatic_lib module:WhatsApp-19.class#0.static_7 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label70:
	aload_6 
	aload_5 
	iload 8
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.Object ) // pc=2
	pop 
	iinc 8 1
	goto Label61
Label78:
	iload_1 
	ifeq Label92
	aload_5 
	invokevirtual int size( java.util.Vector ) // pc=1
	ifle Label87
	aload_6 
	getstatic_lib module:WhatsApp-19.class#0.static_7 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label87:
	aload_6 
	sipush 808
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label92:
	aload_6 
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}

}
