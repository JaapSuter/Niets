// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-18.cod
// Module version  : 2.7.3204
// Class ID        : 1
// ########################################################


package com.whatsapp.client;


abstract public final class FunXMPP$XmlTreeNodeWriter extends Object
implements com.whatsapp.client.FunXMPP$TreeNodeWriter

{

	// @@@@@@@@@@@@@ Fields 
	final java.io.Writer /*java.io.Writer*/  out ; // ofs = 53192 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.FunXMPP$XmlTreeNodeWriter, java.io.Writer ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}


static final java.lang.String getEntity( char ); // address: 0
	{
	enter_narrow 
	iload_0 
Label3:
	ldc literal_62:"&amp;"
	areturn 
Label5:
	ldc literal_63:"&apos;"
	areturn 
Label7:
	ldc literal_64:"&gt;"
	areturn 
Label9:
	ldc literal_65:"&lt;"
	areturn 
Label11:
	ldc literal_66:"&quot;"
	areturn 
Label13:
	aconst_null 
	areturn 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.FunXMPP$XmlTreeNodeWriter.routine_683( com.whatsapp.client.FunXMPP$XmlTreeNodeWriter, module:WhatsApp-17.class#30 ); // address: 0
	{
	jumpspecial com.whatsapp.client.FunXMPP$XmlTreeNodeWriter.routine_703( com.whatsapp.client.FunXMPP$XmlTreeNodeWriter, module:WhatsApp-17.class#30 )
	}


private final com.whatsapp.client.FunXMPP$XmlTreeNodeWriter.routine_703( com.whatsapp.client.FunXMPP$XmlTreeNodeWriter, module:WhatsApp-17.class#30 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	bipush 60
	invokevirtual write( java.io.Writer, int ) // pc=2
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual write( java.io.Writer, java.lang.String ) // pc=2
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifnull Label43
	iconst_0 
	istore_2 
Label13:
	iload_2 
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	arraylength 
	if_icmpge Label43
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	bipush 32
	invokevirtual write( java.io.Writer, int ) // pc=2
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_2 
	aaload 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual write( java.io.Writer, java.lang.String ) // pc=2
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ldc literal_59:"='"
	invokevirtual write( java.io.Writer, java.lang.String ) // pc=2
	aload_0 
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_2 
	aaload 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokenonvirtual com.whatsapp.client.FunXMPP$XmlTreeNodeWriter.sendTextConvertEntities // pc=2
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	bipush 39
	invokevirtual write( java.io.Writer, int ) // pc=2
	iinc 2 1
	goto Label13
Label43:
	aload_1 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	ifnonnull Label53
	aload_1 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	ifnonnull Label53
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ldc literal_60:"/>"
	invokevirtual write( java.io.Writer, java.lang.String ) // pc=2
	return 
Label53:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	bipush 62
	invokevirtual write( java.io.Writer, int ) // pc=2
	aload_1 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	ifnull Label63
	aload_0 
	aload_1 
	invokenonvirtual_lib .routine_7189 // pc=1
	invokenonvirtual com.whatsapp.client.FunXMPP$XmlTreeNodeWriter.sendTextConvertEntities // pc=2
Label63:
	aload_1 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	ifnull Label81
	iconst_0 
	istore_2 
Label68:
	iload_2 
	aload_1 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	arraylength 
	if_icmpge Label81
	aload_0 
	aload_1 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload_2 
	aaload 
	invokespecial com.whatsapp.client.FunXMPP$XmlTreeNodeWriter.routine_683 // pc=2
	iinc 2 1
	goto Label68
Label81:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ldc literal_61:"</"
	invokevirtual write( java.io.Writer, java.lang.String ) // pc=2
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual write( java.io.Writer, java.lang.String ) // pc=2
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	bipush 62
	invokevirtual write( java.io.Writer, int ) // pc=2
	return 
	}


final sendTextConvertEntities( com.whatsapp.client.FunXMPP$XmlTreeNodeWriter, java.lang.String ); // address: 0
	{
	enter 
	iconst_0 
	istore_2 
	iconst_0 
	istore_3 
Label5:
	iload_3 
	aload_1 
	stringlength 
	if_icmpge Label32
	aload_1 
	iload_3 
	stringaload 
	invokestatic java.lang.String getEntity( char ) // FunXMPP$XmlTreeNodeWriter
	astore_4 
	aload_4 
	ifnull Label30
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	iload_2 
	iload_3 
	iload_2 
	isub 
	invokevirtual write( java.io.Writer, java.lang.String, int, int ) // pc=4
	iload_3 
	iconst_1 
	iadd 
	istore_2 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_4 
	invokevirtual write( java.io.Writer, java.lang.String ) // pc=2
Label30:
	iinc 3 1
	goto Label5
Label32:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	iload_2 
	iload_3 
	iload_2 
	isub 
	invokevirtual write( java.io.Writer, java.lang.String, int, int ) // pc=4
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final streamStart( com.whatsapp.client.FunXMPP$XmlTreeNodeWriter, java.lang.String, java.lang.String ); // address: 0
	{
	enter_narrow 
	synch 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ldc literal_55:"<stream:stream to=""
	invokevirtual write( java.io.Writer, java.lang.String ) // pc=2
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokevirtual write( java.io.Writer, java.lang.String ) // pc=2
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ldc literal_56:"" version="1.0" xmlns="jabber:client" xmlns:stream="http://etherx.jabber.org/streams">"
	invokevirtual write( java.io.Writer, java.lang.String ) // pc=2
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual flush( java.io.Writer ) // pc=1
	return 
	}


public final streamEnd( com.whatsapp.client.FunXMPP$XmlTreeNodeWriter ); // address: 0
	{
	enter_narrow 
	synch 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ldc literal_57:"</stream:stream>"
	invokevirtual write( java.io.Writer, java.lang.String ) // pc=2
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual flush( java.io.Writer ) // pc=1
	return 
	}


public final write( com.whatsapp.client.FunXMPP$XmlTreeNodeWriter, module:WhatsApp-17.class#30 ); // address: 0
	{
	enter_narrow 
	synch 
	aload_0 
	aload_1 
	iconst_1 
	invokevirtual_short .virtual_6 // idx=6 pc=3
	return 
	}


public final write( com.whatsapp.client.FunXMPP$XmlTreeNodeWriter, module:WhatsApp-17.class#30, boolean ); // address: 0
	{
	enter_narrow 
	synch 
	aload_1 
	ifnonnull Label8
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ldc literal_58:" "
	invokevirtual write( java.io.Writer, java.lang.String ) // pc=2
	goto Label11
Label8:
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.FunXMPP$XmlTreeNodeWriter.routine_683 // pc=2
Label11:
	iload_2 
	ifeq Label15
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual flush( java.io.Writer ) // pc=1
Label15:
	return 
	}

}
