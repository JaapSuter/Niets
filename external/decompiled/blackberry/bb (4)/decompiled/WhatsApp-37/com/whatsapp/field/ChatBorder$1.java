// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-37.cod
// Module version  : 2.7.3204
// Class ID        : 2
// ########################################################


package com.whatsapp.field;


abstract final class ChatBorder$1 extends net.rim.device.api.ui.decor.Background

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.field.ChatBorder /*com.whatsapp.field.ChatBorder*/  field_52840 ; // ofs = 52840 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.field.ChatBorder$1, com.whatsapp.field.ChatBorder ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib net.rim.device.api.ui.decor.Background.<init> // pc=1
	aload_0 
	aload_1 
	putfield com.whatsapp.field.ChatBorder$1.field_52840   // get_name_1:  com.whatsapp.field.ChatBorder$1.field_52840   // get_name_2:  com.whatsapp.field.ChatBorder$1.field_52840   // get_Name:    com.whatsapp.field.ChatBorder$1.field_52840   // getName->1:     // getName->2:     // getName->N:     // ofs = 52840 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final draw( com.whatsapp.field.ChatBorder$1, net.rim.device.api.ui.Graphics, net.rim.device.api.ui.XYRect ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.field.ChatBorder$1.field_52840   // get_name_1:  com.whatsapp.field.ChatBorder$1.field_52840   // get_name_2:  com.whatsapp.field.ChatBorder$1.field_52840   // get_Name:    com.whatsapp.field.ChatBorder$1.field_52840   // getName->1:     // getName->2:     // getName->N:     // ofs = 52840 ord = 0 addr = 0
	invokespecial com.whatsapp.field.ChatBorder.getBackgroundBitmaps // pc=1
	astore_3 
	aload_3 
	ifnonnull Label7
	return 
Label7:
	aload_1 
	bipush -97
	aload_2 
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	aload_2 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	aload_2 
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	aload_2 
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	aload_3 
	iconst_1 
	aaload 
	iconst_0 
	aload_0_getfield com.whatsapp.field.ChatBorder$1.field_52840   // get_name_1:  com.whatsapp.field.ChatBorder$1.field_52840   // get_name_2:  com.whatsapp.field.ChatBorder$1.field_52840   // get_Name:    com.whatsapp.field.ChatBorder$1.field_52840   // getName->1:     // getName->2:     // getName->N:     // ofs = 52840 ord = 0 addr = 0
	invokevirtual int getTop( net.rim.device.api.ui.decor.Border ) // pc=1
	invokevirtual tileRop( net.rim.device.api.ui.Graphics, int, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=9
	return 
	}


public final boolean isTransparent( com.whatsapp.field.ChatBorder$1 ); // address: 0
	{
	ireturn_bipush 0
	}

}
