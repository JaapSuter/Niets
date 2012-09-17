// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-32.cod
// Module version  : 2.8.1914
// Class ID        : 3
// ########################################################


package com.whatsapp.client;


abstract public final class ImageManipulator extends Object

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.device.api.system.Bitmap /*net.rim.device.api.system.Bitmap*/  field_53966 ; // ofs = 53966 addr = 0)
	private int[] /*int[]*/  field_53970 ; // ofs = 53970 addr = 0)
	private int /*int*/  field_53974 ; // ofs = 53974 addr = 0)
	private int /*int*/  field_53978 ; // ofs = 53978 addr = 0)
	private int /*int*/  field_53982 ; // ofs = 53982 addr = 0)
	private int /*int*/  field_53986 ; // ofs = 53986 addr = 0)
	private int[] /*int[]*/  field_53990 ; // ofs = 53990 addr = 0)
	private int[] /*int[]*/  field_53994 ; // ofs = 53994 addr = 0)
	private net.rim.device.api.ui.XYDimension /*net.rim.device.api.ui.XYDimension*/  field_53998 ; // ofs = 53998 addr = 0)
	private int /*int*/  field_54002 ; // ofs = 54002 addr = 0)
	private int /*int*/  field_54006 ; // ofs = 54006 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.ImageManipulator, net.rim.device.api.system.Bitmap ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	getstatic_lib IDENTITY_3X3 // VecMath
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	iipush 65536
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	iipush 65536
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	iipush 65536
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	iipush 65536
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0 
	arrayinit [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0 
	arrayinit [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_0 
	new_lib net.rim.device.api.ui.container.MainScreen//net.rim.device.api.ui.container.MainScreen net.rim.device.api.ui.container.MainScreen net.rim.device.api.ui.container.MainScreen
	dup 
	invokespecial_lib net.rim.device.api.ui.XYDimension.<init> // pc=1
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_0 
	iipush 16777215
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_0 
	iconst_0 
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_0 
	aload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}

}
