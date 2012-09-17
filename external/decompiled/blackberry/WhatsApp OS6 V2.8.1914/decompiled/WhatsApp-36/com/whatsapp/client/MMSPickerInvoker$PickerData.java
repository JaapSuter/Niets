// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-36.cod
// Module version  : 2.8.1914
// Class ID        : 17
// ########################################################


package com.whatsapp.client;


abstract public final class MMSPickerInvoker$PickerData extends Object

{

	// @@@@@@@@@@@@@ Fields 
	public byte /*byte*/  media_wa_type ; // ofs = 55014 addr = 0)
	private String /*java.lang.String*/  field_55018 ; // ofs = 55018 addr = 0)
	public byte[] /*byte[]*/  raw_media_bytes ; // ofs = 55022 addr = 0)
	protected String /*java.lang.String*/  mimeType ; // ofs = 55026 addr = 0)
	private net.rim.device.api.system.Bitmap /*net.rim.device.api.system.Bitmap*/  field_55030 ; // ofs = 55030 addr = 0)
	public int /*int*/  media_duration_seconds ; // ofs = 55034 addr = 0)

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
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
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


public final setFilename( com.whatsapp.client.MMSPickerInvoker$PickerData, java.lang.String ); // address: 0
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
	invokestatic_lib module:WhatsApp-38.class#0.routine_778(  ) // class#0
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
Label11:
	return 
	}


public final setThumbBitmap( com.whatsapp.client.MMSPickerInvoker$PickerData, net.rim.device.api.system.Bitmap ); // address: 0
	{
	putfield_return .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	}


public final net.rim.device.api.system.Bitmap getThumbBitmap( com.whatsapp.client.MMSPickerInvoker$PickerData ); // address: 0
	{
	areturn_field .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
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
