// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-16.cod
// Module version  : 2.7.3204
// Class ID        : 28
// ########################################################


package com.whatsapp.client;


abstract public final class FunXMPP$FMessage extends Object

{
	// @@@@@@@@@@@@@ Static fields 

	// @@@@@@@@@@@@@ Fields 
	public int /*int*/  status ; // ofs = 57590 addr = 0)
	public com.whatsapp.client.FunXMPP$FMessage$Key /*com.whatsapp.client.FunXMPP$FMessage$Key*/  key ; // ofs = 57594 addr = 0)
	public String /*java.lang.String*/  remote_resource ; // ofs = 57598 addr = 0)
	public final boolean /*boolean*/  needs_push ; // ofs = 57602 addr = 0)
	public boolean /*boolean*/  wants_receipt ; // ofs = 57606 addr = 0)
	public String /*java.lang.String*/  data ; // ofs = 57610 addr = 0)
	public long /*long*/  timestamp ; // ofs = 57614 addr = 0)
	public String /*java.lang.String*/  media_url ; // ofs = 57618 addr = 0)
	public String /*java.lang.String*/  media_mime_type ; // ofs = 57622 addr = 0)
	public byte /*byte*/  media_wa_type ; // ofs = 57626 addr = 0)
	public long /*long*/  media_size ; // ofs = 57630 addr = 0)
	public int /*int*/  media_duration_seconds ; // ofs = 57634 addr = 0)
	public String /*java.lang.String*/  media_name ; // ofs = 57638 addr = 0)
	public double /*double*/  latitude ; // ofs = 57642 addr = 0)
	public double /*double*/  longitude ; // ofs = 57646 addr = 0)
	public Object /*java.lang.Object*/  thumb_image ; // ofs = 57650 addr = 0)
	public boolean /*boolean*/  gap_behind ; // ofs = 57654 addr = 0)
	public boolean /*boolean*/  offline ; // ofs = 57658 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

private <init>( com.whatsapp.client.FunXMPP$FMessage, java.lang.String, boolean ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	iconst_0 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	iconst_0 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	iconst_1 
	putfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	getstatic generating_lock // FunXMPP$FMessage
	dup 
	astore_4 
	monitorenter 
Label16:
	getstatic generating_id // FunXMPP$FMessage
	iconst_1 
	iadd 
	putstatic generating_id // FunXMPP$FMessage
	new FunXMPP$FMessage$Key
	dup 
	aload_1 
	iload_2 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	getstatic generating_header // FunXMPP$FMessage
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	getstatic generating_id // FunXMPP$FMessage
	invokestatic_lib java.lang.String toString( int ) // Integer
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial com.whatsapp.client.FunXMPP$FMessage$Key.<init> // pc=4
	astore_3 
	getstatic message_store // FunXMPP
	aload_3 
	invokeinterface interfacemethodref_100 // pc=2 guess=42
	ifnonnull Label16
	getstatic message_store // FunXMPP
	aload_3 
	aload_0 
	invokeinterface interfacemethodref_101 // pc=3 guess=43
	aload_0 
	aload_3 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_4 
	monitorexit 
	return 
	astore_5 
	aload_4 
	monitorexit 
	aload_5 
	athrow 
	}


public <init>( com.whatsapp.client.FunXMPP$FMessage, com.whatsapp.client.FunXMPP$FMessage$Key ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	iconst_0 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	iconst_0 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	iconst_1 
	putfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_0 
	aload_1 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getstatic generating_lock // FunXMPP$FMessage
	dup 
	astore_2 
	monitorenter 
	getstatic message_store // FunXMPP
	aload_1 
	aload_0 
	invokeinterface interfacemethodref_101 // pc=3 guess=44
	aload_2 
	monitorexit 
	return 
	astore_3 
	aload_2 
	monitorexit 
	aload_3 
	athrow 
	}


public <init>( com.whatsapp.client.FunXMPP$FMessage, java.lang.String, java.lang.String, java.lang.Object ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	iconst_1 
	invokespecial com.whatsapp.client.FunXMPP$FMessage.<init> // pc=3
	aload_0 
	aload_2 
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0 
	aload_3 
	putfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	aload_0 
	invokestatic_lib long currentTimeMillis(  ) // System
	lputfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	return 
	}


static public final byte getMessage_WA_Type( java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	ifnull Label6
	aload_0 
	stringlength 
	ifne Label8
Label6:
	iconst_0 
	ireturn 
Label8:
	aload_0 
	ldc literal_672:"system"
	invokenonvirtual_lib java.lang.String.equalsIgnoreCase // pc=2
	ifeq Label14
	bipush 7
	ireturn 
Label14:
	aload_0 
	ldc literal_484:"image"
	invokenonvirtual_lib java.lang.String.equalsIgnoreCase // pc=2
	ifeq Label20
	iconst_1 
	ireturn 
Label20:
	aload_0 
	ldc literal_430:"audio"
	invokenonvirtual_lib java.lang.String.equalsIgnoreCase // pc=2
	ifeq Label26
	bipush 2
	ireturn 
Label26:
	aload_0 
	ldc literal_597:"video"
	invokenonvirtual_lib java.lang.String.equalsIgnoreCase // pc=2
	ifeq Label32
	bipush 3
	ireturn 
Label32:
	aload_0 
	ldc literal_595:"vcard"
	invokenonvirtual_lib java.lang.String.equalsIgnoreCase // pc=2
	ifeq Label38
	bipush 4
	ireturn 
Label38:
	aload_0 
	ldc literal_502:"location"
	invokenonvirtual_lib java.lang.String.equalsIgnoreCase // pc=2
	ifeq Label44
	bipush 5
	ireturn 
Label44:
	iconst_0 
	ireturn 
	}


static public final java.lang.String getMessage_WA_Type_StrValue( byte ); // address: 0
	{
	enter_narrow 
	iload_0 
	ifne Label5
	aconst_null 
	areturn 
Label5:
	iload_0 
	bipush 7
	if_icmpne Label10
	ldc literal_672:"system"
	areturn 
Label10:
	iload_0 
	iconst_1 
	if_icmpne Label15
	ldc literal_484:"image"
	areturn 
Label15:
	iload_0 
	bipush 2
	if_icmpne Label20
	ldc literal_430:"audio"
	areturn 
Label20:
	iload_0 
	bipush 3
	if_icmpne Label25
	ldc literal_597:"video"
	areturn 
Label25:
	iload_0 
	bipush 4
	if_icmpne Label30
	ldc literal_595:"vcard"
	areturn 
Label30:
	iload_0 
	bipush 5
	if_icmpne Label35
	ldc literal_502:"location"
	areturn 
Label35:
	aconst_null 
	areturn 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	synch_static FunXMPP$FMessage
	clinit_wait 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	invokestatic_lib long currentTimeMillis(  ) // System
	sipush 1000
	i2l 
	ldiv 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, long ) // pc=3
	ldc literal_673:"-"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	putstatic generating_header // FunXMPP$FMessage
	iconst_0 
	putstatic generating_id // FunXMPP$FMessage
	new_lib Object//java.lang.Object java.lang.Object java.lang.Object
	dup 
	invokespecial_lib java.lang.Object.<init> // pc=1
	putstatic generating_lock // FunXMPP$FMessage
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

public final acceptVisitor( com.whatsapp.client.FunXMPP$FMessage, com.whatsapp.client.FunXMPP$FMessageVisitor ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	tableswitch  :
		
		
		
		
		
		
		
		

Label3:
	aload_1 
	aload_0 
	invokeinterface interfacemethodref_102 // pc=2 guess=45
	return 
Label7:
	aload_1 
	aload_0 
	invokeinterface interfacemethodref_103 // pc=2 guess=46
	return 
Label11:
	aload_1 
	aload_0 
	invokeinterface interfacemethodref_104 // pc=2 guess=47
	return 
Label15:
	aload_1 
	aload_0 
	invokeinterface interfacemethodref_105 // pc=2 guess=48
	return 
Label19:
	aload_1 
	aload_0 
	invokeinterface interfacemethodref_106 // pc=2 guess=49
	return 
Label23:
	aload_1 
	aload_0 
	invokeinterface interfacemethodref_107 // pc=2 guess=50
	return 
Label27:
	aload_1 
	aload_0 
	invokeinterface interfacemethodref_108 // pc=2 guess=51
	return 
	}

}
