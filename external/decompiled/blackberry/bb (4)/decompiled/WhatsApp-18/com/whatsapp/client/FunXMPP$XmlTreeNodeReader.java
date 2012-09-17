// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-18.cod
// Module version  : 2.7.3204
// Class ID        : 5
// ########################################################


package com.whatsapp.client;


abstract public final class FunXMPP$XmlTreeNodeReader extends Object
implements com.whatsapp.client.FunXMPP$TreeNodeReader

{

	// @@@@@@@@@@@@@ Fields 
	final java.io.Reader /*java.io.Reader*/  in ; // ofs = 53936 addr = 0)
	final com.whatsapp.client.it.yup.xml. /*module:WhatsApp-36.class#11*/  parser ; // ofs = 53940 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.FunXMPP$XmlTreeNodeReader, java.io.Reader ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	new_lib com.whatsapp.client.it.yup.xml.KXmlParser//module:WhatsApp-36.class#11 module:WhatsApp-36.class#11 module:WhatsApp-36.class#11
	dup 
	invokespecial_lib .routine_6457 // pc=1
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	aload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.FunXMPP$ProtocolTreeNode com.whatsapp.client.FunXMPP$XmlTreeNodeReader.routine_3746( com.whatsapp.client.FunXMPP$XmlTreeNodeReader ); // address: 0
	{
	enter 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual_short .virtual_11 // idx=11 pc=1
	astore_2 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual_short .virtual_12 // idx=12 pc=1
	istore_3 
	iload_3 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#5 module:WhatsApp-17.class#5 module:WhatsApp-17.class#5
	astore_4 
	iconst_0 
	istore_5 
Label12:
	iload_5 
	iload_3 
	if_icmpge Label29
	aload_4 
	iload_5 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#5 module:WhatsApp-17.class#5 module:WhatsApp-17.class#5
	dup 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_5 
	invokevirtual_short .virtual_13 // idx=13 pc=2
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_5 
	invokevirtual_short .virtual_14 // idx=14 pc=2
	invokespecial_lib .routine_10581 // pc=3
	aastore 
	iinc 5 1
	goto Label12
Label29:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual_short .virtual_17 // idx=17 pc=1
	istore_1 
	iload_1 
	bipush 4
	if_icmpne Label41
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual_short .virtual_8 // idx=8 pc=1
	ifeq Label41
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual_short .virtual_17 // idx=17 pc=1
	istore_1 
Label41:
	iload_1 
	bipush 4
	if_icmpne Label70
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual_short .virtual_9 // idx=9 pc=1
	astore_5 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual_short .virtual_19 // idx=19 pc=1
	bipush 3
	if_icmpne Label56
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual_short .virtual_11 // idx=11 pc=1
	aload_2 
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label63
Label56:
	new_lib com.whatsapp.client.FunXMPP$CorruptStreamException//module:WhatsApp-16.class#26 module:WhatsApp-16.class#26 module:WhatsApp-16.class#26
	dup 
	ldc literal_108:"expecting END_TAG in nextInternalTree TEXT"
	aload_0 
	invokevirtual_short .virtual_3 // idx=3 pc=1
	invokespecial_lib .routine_7121 // pc=3
	athrow 
Label63:
	new FunXMPP$ProtocolTreeNode
	dup 
	aload_2 
	aload_4 
	aload_5 
	invokespecial com.whatsapp.client.FunXMPP$ProtocolTreeNode.<init> // pc=4
	areturn 
Label70:
	iload_1 
	bipush 2
	if_icmpne Label128
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_5 
Label77:
	aload_5 
	aload_0 
	invokespecial com.whatsapp.client.FunXMPP$XmlTreeNodeReader.routine_3746 // pc=1
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual_short .virtual_19 // idx=19 pc=1
	istore_1 
	iload_1 
	bipush 2
	if_icmpeq Label77
	iload_1 
	bipush 3
	if_icmpne Label94
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual_short .virtual_11 // idx=11 pc=1
	aload_2 
	if_acmpeq Label101
Label94:
	new_lib com.whatsapp.client.FunXMPP$CorruptStreamException//module:WhatsApp-16.class#26 module:WhatsApp-16.class#26 module:WhatsApp-16.class#26
	dup 
	ldc literal_109:"expecting END_TAG in nextInternalTree START_TAG"
	aload_0 
	invokevirtual_short .virtual_3 // idx=3 pc=1
	invokespecial_lib .routine_7121 // pc=3
	athrow 
Label101:
	aload_5 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_6 
	iload_6 
	newarray_object FunXMPP$ProtocolTreeNode
	astore_7 
	iconst_0 
	istore 8
Label109:
	iload 8
	iload_6 
	if_icmpge Label121
	aload_7 
	iload 8
	aload_5 
	iload 8
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast FunXMPP$ProtocolTreeNode
	aastore 
	iinc 8 1
	goto Label109
Label121:
	new FunXMPP$ProtocolTreeNode
	dup 
	aload_2 
	aload_4 
	aload_7 
	invokespecial com.whatsapp.client.FunXMPP$ProtocolTreeNode.<init> // pc=4
	areturn 
Label128:
	iload_1 
	bipush 3
	if_icmpne Label137
	new FunXMPP$ProtocolTreeNode
	dup 
	aload_2 
	aload_4 
	invokespecial com.whatsapp.client.FunXMPP$ProtocolTreeNode.<init> // pc=3
	areturn 
Label137:
	new_lib com.whatsapp.client.FunXMPP$CorruptStreamException//module:WhatsApp-16.class#26 module:WhatsApp-16.class#26 module:WhatsApp-16.class#26
	dup 
	ldc literal_110:"unexpected tag in nextInternalTree"
	aload_0 
	invokevirtual_short .virtual_3 // idx=3 pc=1
	invokespecial_lib .routine_7121 // pc=3
	athrow 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final java.lang.String lastStanza( com.whatsapp.client.FunXMPP$XmlTreeNodeReader ); // address: 0
	{
	enter_narrow 
	ldc_nullstr 
	areturn 
	}


public final com.whatsapp.client.FunXMPP$ProtocolTreeNode nextTree( com.whatsapp.client.FunXMPP$XmlTreeNodeReader ); // address: 0
	{
	enter 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual_short .virtual_19 // idx=19 pc=1
	istore_1 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual_short .virtual_11 // idx=11 pc=1
	astore_2 
	iload_1 
	bipush 3
	if_icmpne Label16
	aload_2 
	ldc literal_104:"stream:stream"
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label16
	aconst_null 
	areturn 
Label16:
	iload_1 
	bipush 2
	if_icmpeq Label26
	new_lib com.whatsapp.client.FunXMPP$CorruptStreamException//module:WhatsApp-16.class#26 module:WhatsApp-16.class#26 module:WhatsApp-16.class#26
	dup 
	ldc literal_105:"expecting START_TAG in nextTree"
	aload_0 
	invokevirtual_short .virtual_3 // idx=3 pc=1
	invokespecial_lib .routine_7121 // pc=3
	athrow 
Label26:
	aload_0 
	invokespecial com.whatsapp.client.FunXMPP$XmlTreeNodeReader.routine_3746 // pc=1
	areturn 
	astore_2 
	new_lib com.whatsapp.client.FunXMPP$CorruptStreamException//module:WhatsApp-16.class#26 module:WhatsApp-16.class#26 module:WhatsApp-16.class#26
	dup 
	new_lib java.util.Random//java.util.Random java.util.Random java.util.Random
	dup 
	ldc literal_106:"got XmlPullParseX : "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_2 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	aload_0 
	invokevirtual_short .virtual_3 // idx=3 pc=1
	invokespecial_lib .routine_7121 // pc=3
	athrow 
	}


public final streamStart( com.whatsapp.client.FunXMPP$XmlTreeNodeReader ); // address: 0
	{
	enter 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual_short .virtual_21 // idx=21 pc=2
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual_short .virtual_19 // idx=19 pc=1
	pop 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	bipush 2
	aconst_null 
	ldc literal_104:"stream:stream"
	invokevirtual_short .virtual_20 // idx=20 pc=4
	return 
	astore_1 
	new_lib com.whatsapp.client.FunXMPP$CorruptStreamException//module:WhatsApp-16.class#26 module:WhatsApp-16.class#26 module:WhatsApp-16.class#26
	dup 
	new_lib java.util.Random//java.util.Random java.util.Random java.util.Random
	dup 
	ldc literal_107:"streamStart got xml error: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	aload_0 
	invokevirtual_short .virtual_3 // idx=3 pc=1
	invokespecial_lib .routine_7121 // pc=3
	athrow 
	}

}
