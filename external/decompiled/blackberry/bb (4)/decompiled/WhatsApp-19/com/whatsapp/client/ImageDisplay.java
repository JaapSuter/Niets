// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-19.cod
// Module version  : 2.7.3204
// Class ID        : 15
// ########################################################


package com.whatsapp.client;


abstract public final class ImageDisplay extends com.whatsapp.client.

{


	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.ImageDisplay, module:WhatsApp-16.class#28, module:WhatsApp-10.class#4, boolean ); // address: 0
	{
	jumpspecial_lib .routine_8016(  )
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final java.lang.String getSaveSubdir( com.whatsapp.client.ImageDisplay ); // address: 0
	{
	enter_narrow 
	getstatic_lib module:WhatsApp-12.class#0.static_48 // class#0
	areturn 
	}


public final boolean useAppSpecificSubdir( com.whatsapp.client.ImageDisplay ); // address: 0
	{
	ireturn_bipush 1
	}


protected final net.rim.device.api.system.Bitmap getPreviewImage( com.whatsapp.client.ImageDisplay ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib .routine_1622 // pc=1
	astore_1 
	aload_0_getfield _mData   // get_name_1:  _mData   // get_name_2:  _mData   // get_Name:    _mData   // getName->1:  _mData   // getName->2:  _mData   // getName->N:  _mData   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_2497 // pc=1
	ifne Label38
	aload_1 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	bipush 48
	if_icmpge Label38
	aload_1 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	bipush 48
	invokestatic_lib module:WhatsApp-9.class#2.routine_2916(  ) // class#2
	astore_2 
	aload_2 
	invokestatic_lib module:WhatsApp-35.class#0.routine_4406(  ) // class#0
	astore_3 
	aload_3 
	bipush -97
	iconst_0 
	bipush 24
	aload_1 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	iconst_1 
	iushr 
	isub 
	aload_1 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_1 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	aload_1 
	iconst_0 
	iconst_0 
	invokevirtual rop( net.rim.device.api.ui.Graphics, int, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=9
	aload_2 
	areturn 
Label38:
	aload_1 
	areturn 
	}

}
