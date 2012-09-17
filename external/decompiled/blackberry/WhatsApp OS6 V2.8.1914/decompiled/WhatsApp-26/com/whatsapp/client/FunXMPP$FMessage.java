// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-26.cod
// Module version  : 2.8.1914
// Class ID        : 23
// ########################################################


package com.whatsapp.client;


abstract public final class FunXMPP$FMessage extends Object

{
	// @@@@@@@@@@@@@ Static fields 

	// @@@@@@@@@@@@@ Fields 
	public int /*int*/  status ; // ofs = 58580 addr = 0)
	public com.whatsapp.client.FunXMPP$FMessage$Key /*com.whatsapp.client.FunXMPP$FMessage$Key*/  key ; // ofs = 58584 addr = 0)
	public String /*java.lang.String*/  remote_resource ; // ofs = 58588 addr = 0)
	public final boolean /*boolean*/  needs_push ; // ofs = 58592 addr = 0)
	public boolean /*boolean*/  wants_receipt ; // ofs = 58596 addr = 0)
	private String /*java.lang.String*/  field_58600 ; // ofs = 58600 addr = 0)
	private byte[] /*byte[]*/  field_58604 ; // ofs = 58604 addr = 0)
	public int /*int*/  encoding ; // ofs = 58608 addr = 0)
	public long /*long*/  timestamp ; // ofs = 58612 addr = 0)
	public String /*java.lang.String*/  media_url ; // ofs = 58616 addr = 0)
	public String /*java.lang.String*/  media_mime_type ; // ofs = 58620 addr = 0)
	public byte /*byte*/  media_wa_type ; // ofs = 58624 addr = 0)
	public long /*long*/  media_size ; // ofs = 58628 addr = 0)
	public int /*int*/  media_duration_seconds ; // ofs = 58632 addr = 0)
	public String /*java.lang.String*/  media_name ; // ofs = 58636 addr = 0)
	public double /*double*/  latitude ; // ofs = 58640 addr = 0)
	public double /*double*/  longitude ; // ofs = 58644 addr = 0)
	public String /*java.lang.String*/  from_name ; // ofs = 58648 addr = 0)
	public Object /*java.lang.Object*/  thumb_image ; // ofs = 58652 addr = 0)
	public boolean /*boolean*/  gap_behind ; // ofs = 58656 addr = 0)
	public boolean /*boolean*/  offline ; // ofs = 58660 addr = 0)

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
	putfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	aload_0 
	iconst_0 
	putfield .field_24_24   // get_name_1:  .field_24_24   // get_name_2:  .field_24_24   // get_Name:    .field_24_24   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 24
	getstatic generating_lock // FunXMPP$FMessage
	dup 
	astore_4 
	monitorenter 
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
	enter_narrow 
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
	putfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	aload_0 
	iconst_0 
	putfield .field_24_24   // get_name_1:  .field_24_24   // get_name_2:  .field_24_24   // get_Name:    .field_24_24   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 24
	aload_0 
	aload_1 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	return 
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
	putfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	aload_0 
	invokestatic_lib long currentTimeMillis(  ) // System
	lputfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	return 
	}


public <init>( com.whatsapp.client.FunXMPP$FMessage, java.lang.String, byte[], java.lang.Object ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	iconst_1 
	invokespecial com.whatsapp.client.FunXMPP$FMessage.<init> // pc=3
	aload_0 
	aload_2 
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0 
	aload_3 
	putfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	aload_0 
	invokestatic_lib long currentTimeMillis(  ) // System
	lputfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
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
	ldc literal_320:"system"
	invokenonvirtual_lib java.lang.String.equalsIgnoreCase // pc=2
	ifeq Label14
	bipush 7
	ireturn 
Label14:
	aload_0 
	ldc literal_157:"image"
	invokenonvirtual_lib java.lang.String.equalsIgnoreCase // pc=2
	ifeq Label20
	iconst_1 
	ireturn 
Label20:
	aload_0 
	ldc literal_94:"audio"
	invokenonvirtual_lib java.lang.String.equalsIgnoreCase // pc=2
	ifeq Label26
	bipush 2
	ireturn 
Label26:
	aload_0 
	ldc literal_302:"video"
	invokenonvirtual_lib java.lang.String.equalsIgnoreCase // pc=2
	ifeq Label32
	bipush 3
	ireturn 
Label32:
	aload_0 
	ldc literal_300:"vcard"
	invokenonvirtual_lib java.lang.String.equalsIgnoreCase // pc=2
	ifeq Label38
	bipush 4
	ireturn 
Label38:
	aload_0 
	ldc literal_182:"location"
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
	ldc literal_320:"system"
	areturn 
Label10:
	iload_0 
	iconst_1 
	if_icmpne Label15
	ldc literal_157:"image"
	areturn 
Label15:
	iload_0 
	bipush 2
	if_icmpne Label20
	ldc literal_94:"audio"
	areturn 
Label20:
	iload_0 
	bipush 3
	if_icmpne Label25
	ldc literal_302:"video"
	areturn 
Label25:
	iload_0 
	bipush 4
	if_icmpne Label30
	ldc literal_300:"vcard"
	areturn 
Label30:
	iload_0 
	bipush 5
	if_icmpne Label35
	ldc literal_182:"location"
	areturn 
Label35:
	aconst_null 
	areturn 
	}


<init>( com.whatsapp.client.FunXMPP$FMessage, java.lang.String, boolean, module:WhatsApp-5.class#9 ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	iload_2 
	invokespecial com.whatsapp.client.FunXMPP$FMessage.<init> // pc=3
	return 
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
	ldc literal_321:"-"
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
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	tableswitch  :
		
		
		
		
		
		
		
		

Label3:
	aload_1 
	aload_0 
	invokeinterface interfacemethodref_24 // pc=2 guess=41
	return 
Label7:
	aload_1 
	aload_0 
	invokeinterface interfacemethodref_25 // pc=2 guess=42
	return 
Label11:
	aload_1 
	aload_0 
	invokeinterface interfacemethodref_26 // pc=2 guess=43
	return 
Label15:
	aload_1 
	aload_0 
	invokeinterface interfacemethodref_27 // pc=2 guess=44
	return 
Label19:
	aload_1 
	aload_0 
	invokeinterface interfacemethodref_28 // pc=2 guess=45
	return 
Label23:
	aload_1 
	aload_0 
	invokeinterface interfacemethodref_29 // pc=2 guess=46
	return 
Label27:
	aload_1 
	aload_0 
	invokeinterface interfacemethodref_30 // pc=2 guess=47
	return 
	}


public final java.lang.String getData( com.whatsapp.client.FunXMPP$FMessage ); // address: 0
	{
	enter 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	iconst_1 
	if_icmpne Label9
	new_lib RuntimeException//java.lang.RuntimeException java.lang.RuntimeException java.lang.RuntimeException
	dup 
	ldc literal_319:"trying to get data as text on raw message"
	invokespecial_lib java.lang.RuntimeException.<init> // pc=2
	athrow 
Label9:
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	ifnonnull Label22
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnull Label22
	aload_0 
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ldc literal_317:"UTF-8"
	invokespecial_lib java.lang.String.<init> // pc=3
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	goto Label22
	astore_1 
Label22:
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	areturn 
	}


public final byte[] getDataBytes( com.whatsapp.client.FunXMPP$FMessage ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnonnull Label12
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	ifnull Label12
	aload_0 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	ldc literal_317:"UTF-8"
	invokenonvirtual_lib java.lang.String.getBytes // pc=2
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	goto Label12
	astore_1 
Label12:
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	areturn 
	}


public final setData( com.whatsapp.client.FunXMPP$FMessage, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0 
	aconst_null 
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	return 
	}


public final setData( com.whatsapp.client.FunXMPP$FMessage, byte[] ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0 
	aconst_null 
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	return 
	}

}
