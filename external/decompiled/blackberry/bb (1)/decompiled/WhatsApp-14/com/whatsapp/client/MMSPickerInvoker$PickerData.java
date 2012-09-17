// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-22.cod
// Module version  : 2.7.3204
// Class ID        : 3
// ########################################################


package com.whatsapp.client;


abstract public final class MMSPickerInvoker$PickerData extends Object

{

	// @@@@@@@@@@@@@ Fields 
	public byte /*byte*/  media_wa_type ; // ofs = 54890 addr = 0)
	private String /*java.lang.String*/  field_54894 ; // ofs = 54894 addr = 0)
	public byte[] /*byte[]*/  raw_media_bytes ; // ofs = 54898 addr = 0)
	protected String /*java.lang.String*/  mimeType ; // ofs = 54902 addr = 0)
	protected net.rim.device.api.system.Bitmap /*net.rim.device.api.system.Bitmap*/  thumbBitmap ; // ofs = 54906 addr = 0)
	public int /*int*/  media_duration_seconds ; // ofs = 54910 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.MMSPickerInvoker$PickerData ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

public final resetFileData( com.whatsapp.client.MMSPickerInvoker$PickerData ); // address: 0
	{
	enter_narrow 
	aload_0 
	aconst_null 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	aconst_null 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aconst_null 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	return 
	}


public final java.lang.String getFriendlyName( com.whatsapp.client.MMSPickerInvoker$PickerData ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifnonnull Label5
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	areturn 
Label5:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	bipush 47
	invokenonvirtual_lib java.lang.String.lastIndexOf // pc=2
	istore_1 
	iload_1 
	bipush -1
	if_icmpne Label14
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	areturn 
Label14:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_1 
	iconst_1 
	iadd 
	invokenonvirtual_lib java.lang.String.substring // pc=2
	areturn 
	}


public final boolean setFilename( com.whatsapp.client.MMSPickerInvoker$PickerData, java.lang.String, boolean ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	ifnonnull Label11
	aload_0 
	aload_1 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokestatic_lib module:WhatsApp-23.class#0.routine_1521(  ) // class#0
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
Label11:
	iload_2 
	ifeq Label16
	aload_0 
	invokenonvirtual com.whatsapp.client.MMSPickerInvoker$PickerData.bufferFile // pc=1
	ireturn 
Label16:
	iconst_1 
	ireturn 
	}


public final boolean bufferFile( com.whatsapp.client.MMSPickerInvoker$PickerData ); // address: 0
	{
	enter 
	aconst_null 
	astore_1 
	aconst_null 
	astore_2 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String ) // Connector
	checkcast_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	astore_1 
	aload_1 
	invokeinterface interfacemethodref_104 // pc=1 guess=9
	astore_2 
	aload_1 
	invokeinterface interfacemethodref_100 // pc=1 guess=10
	l2i 
	istore_3 
	aload_0 
	iload_3 
	newarray 2
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_2 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual int read( java.io.InputStream, byte[] ) // pc=2
	istore_4 
	iconst_1 
	istore_5 
	aload_2 
	ifnull Label32
	aload_2 
	invokevirtual close( java.io.InputStream ) // pc=1
	goto Label32
	astore_6 
Label32:
	aload_1 
	ifnull Label38
	aload_1 
	invokeinterface interfacemethodref_99 // pc=1 guess=11
	goto Label38
	astore_6 
Label38:
	iload_5 
	ireturn 
	astore_3 
	aload_2 
	ifnull Label47
	aload_2 
	invokevirtual close( java.io.InputStream ) // pc=1
	goto Label47
	astore_3 
Label47:
	aload_1 
	ifnull Label71
	aload_1 
	invokeinterface interfacemethodref_99 // pc=1 guess=11
	iconst_0 
	ireturn 
	astore_3 
	iconst_0 
	ireturn 
	astore_7 
	aload_2 
	ifnull Label63
	aload_2 
	invokevirtual close( java.io.InputStream ) // pc=1
	goto Label63
	astore 8
Label63:
	aload_1 
	ifnull Label69
	aload_1 
	invokeinterface interfacemethodref_99 // pc=1 guess=11
	goto Label69
	astore 8
Label69:
	aload_7 
	athrow 
Label71:
	iconst_0 
	ireturn 
	}


public final boolean hasRawData( com.whatsapp.client.MMSPickerInvoker$PickerData ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	ifnull Label8
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	arraylength 
	ifle Label8
	iconst_1 
	ireturn 
Label8:
	iconst_0 
	ireturn 
	}


public final boolean hasFile( com.whatsapp.client.MMSPickerInvoker$PickerData ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifnull Label8
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	stringlength 
	ifle Label8
	iconst_1 
	ireturn 
Label8:
	iconst_0 
	ireturn 
	}


public final java.lang.String getFilename( com.whatsapp.client.MMSPickerInvoker$PickerData ); // address: 0
	{
	areturn_field .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	}

}
