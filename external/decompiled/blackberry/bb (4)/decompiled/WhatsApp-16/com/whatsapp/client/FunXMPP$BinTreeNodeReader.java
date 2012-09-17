// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-16.cod
// Module version  : 2.7.3204
// Class ID        : 3
// ########################################################


package com.whatsapp.client;


abstract public final class FunXMPP$BinTreeNodeReader extends Object
implements com.whatsapp.client.FunXMPP$TreeNodeReader

{

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.FunXMPP$BinTreeNodeReader, java.io.InputStream, java.lang.String[] ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	sipush 255
	newarray 2
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	iconst_0 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	new FunXMPP$EofIsExceptionInputStream
	dup 
	aload_1 
	invokespecial com.whatsapp.client.FunXMPP$EofIsExceptionInputStream.<init> // pc=2
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	aload_2 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	return 
	}


static private final com.whatsapp.client.FunXMPP$BinTreeNodeReader.routine_3476( byte[], java.io.InputStream ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_0 
	arraylength 
	aload_1 
	invokestatic com.whatsapp.client.FunXMPP$BinTreeNodeReader.routine_3504( byte[], int, java.io.InputStream ) // FunXMPP$BinTreeNodeReader
	return 
	}


static private final com.whatsapp.client.FunXMPP$BinTreeNodeReader.routine_3504( byte[], int, java.io.InputStream ); // address: 0
	{
	enter 
	iconst_0 
	istore_3 
Label3:
	iload_3 
	iload_1 
	if_icmpge Label17
	iload_3 
	aload_2 
	aload_0 
	iload_3 
	iload_1 
	iload_3 
	isub 
	invokevirtual int read( java.io.InputStream, byte[], int, int ) // pc=4
	iadd 
	istore_3 
	goto Label3
Label17:
	return 
	}


static private final int com.whatsapp.client.FunXMPP$BinTreeNodeReader.routine_3536( java.io.InputStream ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual int read( java.io.InputStream ) // pc=1
	ireturn 
	}


static private final int com.whatsapp.client.FunXMPP$BinTreeNodeReader.routine_3557( java.io.InputStream ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual int read( java.io.InputStream ) // pc=1
	istore_1 
	aload_0 
	invokevirtual int read( java.io.InputStream ) // pc=1
	istore_2 
	iload_1 
	bipush 8
	ishl 
	iload_2 
	iadd 
	istore_3 
	iload_3 
	ireturn 
	}


static private final int com.whatsapp.client.FunXMPP$BinTreeNodeReader.routine_3593( java.io.InputStream ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual int read( java.io.InputStream ) // pc=1
	istore_1 
	aload_0 
	invokevirtual int read( java.io.InputStream ) // pc=1
	istore_2 
	aload_0 
	invokevirtual int read( java.io.InputStream ) // pc=1
	istore_3 
	iload_1 
	bipush 16
	ishl 
	iload_2 
	bipush 8
	ishl 
	iadd 
	iload_3 
	iconst_0 
	ishl 
	iadd 
	istore_4 
	iload_4 
	ireturn 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final module:WhatsApp-18.class#3 com.whatsapp.client.FunXMPP$BinTreeNodeReader.routine_2582( com.whatsapp.client.FunXMPP$BinTreeNodeReader ); // address: 0
	{
	enter 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual int read( java.io.InputStream ) // pc=1
	istore_1 
	aload_0 
	iload_1 
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeReader.routine_2960 // pc=2
	istore_2 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual int read( java.io.InputStream ) // pc=1
	istore_1 
	iload_1 
	bipush 2
	if_icmpne Label16
	aconst_null 
	areturn 
Label16:
	aload_0 
	iload_1 
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeReader.routine_3064 // pc=2
	astore_3 
	iload_2 
	ifeq Label24
	aload_3 
	ifnonnull Label31
Label24:
	new FunXMPP$CorruptStreamException
	dup 
	ldc literal_290:"nextTree sees 0 list or null tag"
	aload_0 
	invokevirtual_short .virtual_4 // idx=4 pc=1
	invokespecial com.whatsapp.client.FunXMPP$CorruptStreamException.<init> // pc=3
	athrow 
Label31:
	iload_2 
	bipush 2
	isub 
	iload_2 
	bipush 2
	irem 
	iadd 
	bipush 2
	idiv 
	istore_4 
	aload_0 
	iload_4 
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeReader.routine_2849 // pc=2
	astore_5 
	iload_2 
	bipush 2
	irem 
	iconst_1 
	if_icmpne Label56
	new_lib com.whatsapp.client.//module:WhatsApp-18.class#3 module:WhatsApp-18.class#3 module:WhatsApp-18.class#3
	dup 
	aload_3 
	aload_5 
	invokespecial_lib .routine_3313 // pc=3
	areturn 
Label56:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual int read( java.io.InputStream ) // pc=1
	istore_1 
	aload_0 
	iload_1 
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeReader.routine_2811 // pc=2
	ifeq Label72
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-18.class#3 module:WhatsApp-18.class#3 module:WhatsApp-18.class#3
	dup 
	aload_3 
	aload_5 
	aload_0 
	iload_1 
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeReader.routine_2912 // pc=2
	invokespecial_lib .routine_3144 // pc=4
	areturn 
Label72:
	iload_1 
	sipush 252
	if_icmpne Label91
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokestatic int com.whatsapp.client.FunXMPP$BinTreeNodeReader.routine_3536( java.io.InputStream ) // FunXMPP$BinTreeNodeReader
	istore_6 
	iload_6 
	newarray 2
	astore_7 
	aload_7 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokestatic com.whatsapp.client.FunXMPP$BinTreeNodeReader.routine_3476( byte[], java.io.InputStream ) // FunXMPP$BinTreeNodeReader
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-18.class#3 module:WhatsApp-18.class#3 module:WhatsApp-18.class#3
	dup 
	aload_3 
	aload_5 
	aload_7 
	invokespecial_lib .routine_3280 // pc=4
	areturn 
Label91:
	iload_1 
	sipush 253
	if_icmpne Label110
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokestatic int com.whatsapp.client.FunXMPP$BinTreeNodeReader.routine_3593( java.io.InputStream ) // FunXMPP$BinTreeNodeReader
	istore_6 
	iload_6 
	newarray 2
	astore_7 
	aload_7 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokestatic com.whatsapp.client.FunXMPP$BinTreeNodeReader.routine_3476( byte[], java.io.InputStream ) // FunXMPP$BinTreeNodeReader
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-18.class#3 module:WhatsApp-18.class#3 module:WhatsApp-18.class#3
	dup 
	aload_3 
	aload_5 
	aload_7 
	invokespecial_lib .routine_3280 // pc=4
	areturn 
Label110:
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-18.class#3 module:WhatsApp-18.class#3 module:WhatsApp-18.class#3
	dup 
	aload_3 
	aload_5 
	aload_0 
	iload_1 
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeReader.routine_3064 // pc=2
	invokespecial_lib .routine_3226 // pc=4
	areturn 
	}


private final boolean com.whatsapp.client.FunXMPP$BinTreeNodeReader.routine_2811( com.whatsapp.client.FunXMPP$BinTreeNodeReader, int ); // address: 0
	{
	enter_narrow 
	iload_1 
	sipush 248
	if_icmpeq Label9
	iload_1 
	ifeq Label9
	iload_1 
	sipush 249
	if_icmpne Label11
Label9:
	iconst_1 
	ireturn 
Label11:
	iconst_0 
	ireturn 
	}


private final module:WhatsApp-17.class#5[] com.whatsapp.client.FunXMPP$BinTreeNodeReader.routine_2849( com.whatsapp.client.FunXMPP$BinTreeNodeReader, int ); // address: 0
	{
	enter 
	iload_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#5 module:WhatsApp-17.class#5 module:WhatsApp-17.class#5
	astore_2 
	iconst_0 
	istore_3 
Label6:
	iload_3 
	iload_1 
	if_icmpge Label25
	aload_0 
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeReader.routine_3037 // pc=1
	astore_4 
	aload_0 
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeReader.routine_3037 // pc=1
	astore_5 
	aload_2 
	iload_3 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#5 module:WhatsApp-17.class#5 module:WhatsApp-17.class#5
	dup 
	aload_4 
	aload_5 
	invokespecial_lib .routine_10581 // pc=3
	aastore 
	iinc 3 1
	goto Label6
Label25:
	aload_2 
	areturn 
	}


private final module:WhatsApp-18.class#3[] com.whatsapp.client.FunXMPP$BinTreeNodeReader.routine_2912( com.whatsapp.client.FunXMPP$BinTreeNodeReader, int ); // address: 0
	{
	enter 
	aload_0 
	iload_1 
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeReader.routine_2960 // pc=2
	istore_2 
	iload_2 
	newarray_object_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-18.class#3 module:WhatsApp-18.class#3 module:WhatsApp-18.class#3
	astore_3 
	iconst_0 
	istore_4 
Label10:
	iload_4 
	iload_2 
	if_icmpge Label20
	aload_3 
	iload_4 
	aload_0 
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeReader.routine_2582 // pc=1
	aastore 
	iinc 4 1
	goto Label10
Label20:
	aload_3 
	areturn 
	}


private final int com.whatsapp.client.FunXMPP$BinTreeNodeReader.routine_2960( com.whatsapp.client.FunXMPP$BinTreeNodeReader, int ); // address: 0
	{
	enter 
	iload_1 
	ifne Label7
	iconst_0 
	istore_2 
	iload_2 
	ireturn 
Label7:
	iload_1 
	sipush 248
	if_icmpne Label15
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokestatic int com.whatsapp.client.FunXMPP$BinTreeNodeReader.routine_3536( java.io.InputStream ) // FunXMPP$BinTreeNodeReader
	istore_2 
	iload_2 
	ireturn 
Label15:
	iload_1 
	sipush 249
	if_icmpne Label23
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokestatic int com.whatsapp.client.FunXMPP$BinTreeNodeReader.routine_3557( java.io.InputStream ) // FunXMPP$BinTreeNodeReader
	istore_2 
	iload_2 
	ireturn 
Label23:
	new FunXMPP$CorruptStreamException
	dup 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_291:"invalid list size in readListSize: token "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	aload_0 
	invokevirtual_short .virtual_4 // idx=4 pc=1
	invokespecial com.whatsapp.client.FunXMPP$CorruptStreamException.<init> // pc=3
	athrow 
	}


private final java.lang.String com.whatsapp.client.FunXMPP$BinTreeNodeReader.routine_3037( com.whatsapp.client.FunXMPP$BinTreeNodeReader ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual int read( java.io.InputStream ) // pc=1
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeReader.routine_3064 // pc=2
	areturn 
	}


private final java.lang.String com.whatsapp.client.FunXMPP$BinTreeNodeReader.routine_3064( com.whatsapp.client.FunXMPP$BinTreeNodeReader, int ); // address: 0
	{
	enter 
	iload_1 
	bipush -1
	if_icmpne Label11
	new FunXMPP$CorruptStreamException
	dup 
	ldc literal_292:"-1 token in readString"
	aload_0 
	invokevirtual_short .virtual_4 // idx=4 pc=1
	invokespecial com.whatsapp.client.FunXMPP$CorruptStreamException.<init> // pc=3
	athrow 
Label11:
	iload_1 
	bipush 4
	if_icmple Label21
	iload_1 
	sipush 245
	if_icmpge Label21
	aload_0 
	iload_1 
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeReader.routine_3307 // pc=2
	areturn 
Label21:
	iload_1 
Label23:
	aconst_null 
	areturn 
Label25:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokestatic int com.whatsapp.client.FunXMPP$BinTreeNodeReader.routine_3536( java.io.InputStream ) // FunXMPP$BinTreeNodeReader
	istore_2 
	iload_2 
	newarray 2
	astore_3 
	aload_3 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokestatic com.whatsapp.client.FunXMPP$BinTreeNodeReader.routine_3476( byte[], java.io.InputStream ) // FunXMPP$BinTreeNodeReader
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	aload_3 
	ldc literal_293:"UTF-8"
	invokespecial_lib java.lang.String.<init> // pc=3
	areturn 
Label40:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokestatic int com.whatsapp.client.FunXMPP$BinTreeNodeReader.routine_3593( java.io.InputStream ) // FunXMPP$BinTreeNodeReader
	istore_4 
	iload_4 
	newarray 2
	astore_5 
	aload_5 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokestatic com.whatsapp.client.FunXMPP$BinTreeNodeReader.routine_3476( byte[], java.io.InputStream ) // FunXMPP$BinTreeNodeReader
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	aload_5 
	ldc literal_293:"UTF-8"
	invokespecial_lib java.lang.String.<init> // pc=3
	areturn 
Label55:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual int read( java.io.InputStream ) // pc=1
	i2b 
	istore_1 
	aload_0 
	sipush 245
	iload_1 
	iadd 
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeReader.routine_3307 // pc=2
	areturn 
Label65:
	aload_0 
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeReader.routine_3037 // pc=1
	astore_6 
	aload_0 
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeReader.routine_3037 // pc=1
	astore_7 
	aload_6 
	ifnull Label86
	aload_7 
	ifnull Label86
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_6 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_294:"@"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_7 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
Label86:
	aload_7 
	ifnull Label90
	aload_7 
	areturn 
Label90:
	new FunXMPP$CorruptStreamException
	dup 
	ldc literal_295:"readString couldn't reconstruct jid"
	aload_0 
	invokevirtual_short .virtual_4 // idx=4 pc=1
	invokespecial com.whatsapp.client.FunXMPP$CorruptStreamException.<init> // pc=3
	athrow 
Label97:
	new FunXMPP$CorruptStreamException
	dup 
	ldc literal_296:"readString couldn't match token"
	aload_0 
	invokevirtual_short .virtual_4 // idx=4 pc=1
	invokespecial com.whatsapp.client.FunXMPP$CorruptStreamException.<init> // pc=3
	athrow 
	}


private final java.lang.String com.whatsapp.client.FunXMPP$BinTreeNodeReader.routine_3307( com.whatsapp.client.FunXMPP$BinTreeNodeReader, int ); // address: 0
	{
	enter 
	iload_1 
	iflt Label12
	iload_1 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	arraylength 
	if_icmpge Label12
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_1 
	aaload 
	astore_2 
	goto Label14
Label12:
	aconst_null 
	astore_2 
Label14:
	aload_2 
	ifnonnull Label23
	new FunXMPP$CorruptStreamException
	dup 
	ldc literal_297:"invalid token/length in getToken"
	aload_0 
	invokevirtual_short .virtual_4 // idx=4 pc=1
	invokespecial com.whatsapp.client.FunXMPP$CorruptStreamException.<init> // pc=3
	athrow 
Label23:
	aload_2 
	areturn 
	}


private final com.whatsapp.client.FunXMPP$BinTreeNodeReader.routine_3359( com.whatsapp.client.FunXMPP$BinTreeNodeReader, int ); // address: 0
	{
	enter 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	arraylength 
	iload_1 
	if_icmpge Label18
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	arraylength 
	bipush 3
	imul 
	bipush 2
	idiv 
	iload_1 
	invokestatic_lib int max( int, int ) // Math
	istore_2 
	aload_0 
	iload_2 
	newarray 2
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
Label18:
	aload_0 
	iload_1 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload_1 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokestatic com.whatsapp.client.FunXMPP$BinTreeNodeReader.routine_3504( byte[], int, java.io.InputStream ) // FunXMPP$BinTreeNodeReader
	aload_0 
	new_lib java.io.ByteArrayInputStream//java.io.ByteArrayInputStream java.io.ByteArrayInputStream java.io.ByteArrayInputStream
	dup 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iconst_0 
	iload_1 
	invokespecial_lib java.io.ByteArrayInputStream.<init> // pc=4
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final module:WhatsApp-18.class#3 nextTree( com.whatsapp.client.FunXMPP$BinTreeNodeReader ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokestatic int com.whatsapp.client.FunXMPP$BinTreeNodeReader.routine_3557( java.io.InputStream ) // FunXMPP$BinTreeNodeReader
	istore_1 
	aload_0 
	iload_1 
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeReader.routine_3359 // pc=2
	aload_0 
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeReader.routine_2582 // pc=1
	areturn 
	}


public final java.lang.String lastStanza( com.whatsapp.client.FunXMPP$BinTreeNodeReader ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	ifnonnull Label5
	ldc literal_286:"null"
	areturn 
Label5:
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	astore_1 
	aload_1 
	ldc literal_287:"size = "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokestatic_lib java.lang.String toString( int ) // Integer
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	bipush 60
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	iconst_0 
	istore_2 
Label20:
	iload_2 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	if_icmpge Label40
	iload_2 
	ifle Label29
	aload_1 
	ldc literal_288:", "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label29:
	aload_1 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload_2 
	baload 
	sipush 255
	iand 
	invokestatic_lib java.lang.String toString( int ) // Integer
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	iinc 2 1
	goto Label20
Label40:
	aload_1 
	bipush 62
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	aload_1 
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}


public final streamStart( com.whatsapp.client.FunXMPP$BinTreeNodeReader ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokestatic int com.whatsapp.client.FunXMPP$BinTreeNodeReader.routine_3557( java.io.InputStream ) // FunXMPP$BinTreeNodeReader
	istore_1 
	aload_0 
	iload_1 
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeReader.routine_3359 // pc=2
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual int read( java.io.InputStream ) // pc=1
	istore_2 
	aload_0 
	iload_2 
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeReader.routine_2960 // pc=2
	istore_3 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual int read( java.io.InputStream ) // pc=1
	istore_2 
	iload_2 
	iconst_1 
	if_icmpeq Label27
	new FunXMPP$CorruptStreamException
	dup 
	ldc literal_289:"expecting STREAM_START in streamStart"
	aload_0 
	invokevirtual_short .virtual_4 // idx=4 pc=1
	invokespecial com.whatsapp.client.FunXMPP$CorruptStreamException.<init> // pc=3
	athrow 
Label27:
	iload_3 
	bipush 2
	isub 
	iload_3 
	bipush 2
	irem 
	iadd 
	bipush 2
	idiv 
	istore_4 
	aload_0 
	iload_4 
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeReader.routine_2849 // pc=2
	astore_5 
	return 
	}

}
