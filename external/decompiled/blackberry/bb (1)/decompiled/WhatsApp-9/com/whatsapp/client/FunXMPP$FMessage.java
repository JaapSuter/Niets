// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-17.cod
// Module version  : 2.7.3204
// Class ID        : 15
// ########################################################


package com.whatsapp.client;


abstract public final class FunXMPP$FMessage extends Object

{
	// @@@@@@@@@@@@@ Static fields 

	// @@@@@@@@@@@@@ Fields 
	public int /*int*/  status ; // ofs = 54472 addr = 0)
	public com.whatsapp.client.FunXMPP$FMessage$Key /*com.whatsapp.client.FunXMPP$FMessage$Key*/  key ; // ofs = 54476 addr = 0)
	public String /*java.lang.String*/  remote_resource ; // ofs = 54480 addr = 0)
	public final boolean /*boolean*/  needs_push ; // ofs = 54484 addr = 0)
	public boolean /*boolean*/  wants_receipt ; // ofs = 54488 addr = 0)
	public String /*java.lang.String*/  data ; // ofs = 54492 addr = 0)
	public long /*long*/  timestamp ; // ofs = 54496 addr = 0)
	public String /*java.lang.String*/  media_url ; // ofs = 54500 addr = 0)
	public String /*java.lang.String*/  media_mime_type ; // ofs = 54504 addr = 0)
	public byte /*byte*/  media_wa_type ; // ofs = 54508 addr = 0)
	public long /*long*/  media_size ; // ofs = 54512 addr = 0)
	public int /*int*/  media_duration_seconds ; // ofs = 54516 addr = 0)
	public String /*java.lang.String*/  media_name ; // ofs = 54520 addr = 0)
	public double /*double*/  latitude ; // ofs = 54524 addr = 0)
	public double /*double*/  longitude ; // ofs = 54528 addr = 0)
	public Object /*java.lang.Object*/  thumb_image ; // ofs = 54532 addr = 0)
	public boolean /*boolean*/  gap_behind ; // ofs = 54536 addr = 0)
	public boolean /*boolean*/  offline ; // ofs = 54540 addr = 0)

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
	getstatic_lib module:WhatsApp-15.class#16.static_35 // class#16
	aload_3 
	invokeinterface interfacemethodref_126 // pc=2 guess=31
	ifnonnull Label16
	getstatic_lib module:WhatsApp-15.class#16.static_35 // class#16
	aload_3 
	aload_0 
	invokeinterface interfacemethodref_127 // pc=3 guess=32
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
	getstatic_lib module:WhatsApp-15.class#16.static_35 // class#16
	aload_1 
	aload_0 
	invokeinterface interfacemethodref_127 // pc=3 guess=33
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
	ldc literal_492:"system"
	invokenonvirtual_lib java.lang.String.equalsIgnoreCase // pc=2
	ifeq Label14
	bipush 7
	ireturn 
Label14:
	aload_0 
	ldc literal_493:"image"
	invokenonvirtual_lib java.lang.String.equalsIgnoreCase // pc=2
	ifeq Label20
	iconst_1 
	ireturn 
Label20:
	aload_0 
	ldc literal_494:"audio"
	invokenonvirtual_lib java.lang.String.equalsIgnoreCase // pc=2
	ifeq Label26
	bipush 2
	ireturn 
Label26:
	aload_0 
	ldc literal_495:"video"
	invokenonvirtual_lib java.lang.String.equalsIgnoreCase // pc=2
	ifeq Label32
	bipush 3
	ireturn 
Label32:
	aload_0 
	ldc literal_496:"vcard"
	invokenonvirtual_lib java.lang.String.equalsIgnoreCase // pc=2
	ifeq Label38
	bipush 4
	ireturn 
Label38:
	aload_0 
	ldc literal_497:"location"
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
	ldc literal_492:"system"
	areturn 
Label10:
	iload_0 
	iconst_1 
	if_icmpne Label15
	ldc literal_493:"image"
	areturn 
Label15:
	iload_0 
	bipush 2
	if_icmpne Label20
	ldc literal_494:"audio"
	areturn 
Label20:
	iload_0 
	bipush 3
	if_icmpne Label25
	ldc literal_495:"video"
	areturn 
Label25:
	iload_0 
	bipush 4
	if_icmpne Label30
	ldc literal_496:"vcard"
	areturn 
Label30:
	iload_0 
	bipush 5
	if_icmpne Label35
	ldc literal_497:"location"
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
	ldc literal_498:"-"
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
	invokeinterface interfacemethodref_128 // pc=2 guess=34
	return 
Label7:
	aload_1 
	aload_0 
	invokeinterface interfacemethodref_129 // pc=2 guess=35
	return 
Label11:
	aload_1 
	aload_0 
	invokeinterface interfacemethodref_130 // pc=2 guess=36
	return 
Label15:
	aload_1 
	aload_0 
	invokeinterface interfacemethodref_131 // pc=2 guess=37
	return 
Label19:
	aload_1 
	aload_0 
	invokeinterface interfacemethodref_132 // pc=2 guess=38
	return 
Label23:
	aload_1 
	aload_0 
	invokeinterface interfacemethodref_133 // pc=2 guess=39
	return 
Label27:
	aload_1 
	aload_0 
	invokeinterface interfacemethodref_134 // pc=2 guess=40
	return 
	}

}