// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-9.cod
// Module version  : 2.7.3204
// Class ID        : 1
// ########################################################


package com.whatsapp.client;


abstract public final class BitmapButtonField2 extends net.rim.device.api.ui.component.ButtonField

{

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.BitmapButtonField2, net.rim.device.api.system.Bitmap, long ); // address: 0
	{
	enter 
	aload_0 
	lload 2
	invokespecial_lib net.rim.device.api.ui.component.ButtonField.<init> // pc=3
	aload_0 
	aload_1 
	putfield bitmap   // get_name_1:  bitmap   // get_name_2:  bitmap   // get_Name:    bitmap   // getName->1:  bitmap   // getName->2:  bitmap   // getName->N:  bitmap   // ofs = 53334 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final int getPreferredHeight( com.whatsapp.client.BitmapButtonField2 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield bitmap   // get_name_1:  bitmap   // get_name_2:  bitmap   // get_Name:    bitmap   // getName->1:  bitmap   // getName->2:  bitmap   // getName->N:  bitmap   // ofs = 53334 ord = 0 addr = 0
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	ireturn 
	}


public final int getPreferredWidth( com.whatsapp.client.BitmapButtonField2 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield bitmap   // get_name_1:  bitmap   // get_name_2:  bitmap   // get_Name:    bitmap   // getName->1:  bitmap   // getName->2:  bitmap   // getName->N:  bitmap   // ofs = 53334 ord = 0 addr = 0
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	ireturn 
	}


protected final paint( com.whatsapp.client.BitmapButtonField2, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.component.ButtonField.paint // pc=2
	new_lib net.rim.device.api.ui.XYEdges//net.rim.device.api.ui.XYEdges net.rim.device.api.ui.XYEdges net.rim.device.api.ui.XYEdges
	dup 
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=1
	astore_2 
	aload_0 
	aload_2 
	invokevirtual getBorder( net.rim.device.api.ui.Field, net.rim.device.api.ui.XYEdges ) // pc=2
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	aload_2 
	getfield left   // get_name_1:  left   // get_name_2:  left   // get_Name:    left   // getName->1:  left   // getName->2:  left   // getName->N:  left   // ofs = -1 ord = 0 addr = -1
	isub 
	aload_2 
	getfield right   // get_name_1:  right   // get_name_2:  right   // get_Name:    right   // getName->1:  right   // getName->2:  right   // getName->N:  right   // ofs = -1 ord = 1 addr = -1
	isub 
	istore_3 
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	aload_2 
	getfield top   // get_name_1:  top   // get_name_2:  top   // get_Name:    top   // getName->1:  top   // getName->2:  top   // getName->N:  top   // ofs = -1 ord = 2 addr = -1
	isub 
	aload_2 
	getfield bottom   // get_name_1:  bottom   // get_name_2:  bottom   // get_Name:    bottom   // getName->1:  bottom   // getName->2:  bottom   // getName->N:  bottom   // ofs = -1 ord = 3 addr = -1
	isub 
	istore_4 
	iload_3 
	aload_0_getfield bitmap   // get_name_1:  bitmap   // get_name_2:  bitmap   // get_Name:    bitmap   // getName->1:  bitmap   // getName->2:  bitmap   // getName->N:  bitmap   // ofs = 53334 ord = 0 addr = 0
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	isub 
	bipush 2
	idiv 
	istore_5 
	iload_4 
	aload_0_getfield bitmap   // get_name_1:  bitmap   // get_name_2:  bitmap   // get_Name:    bitmap   // getName->1:  bitmap   // getName->2:  bitmap   // getName->N:  bitmap   // ofs = 53334 ord = 0 addr = 0
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	isub 
	bipush 2
	idiv 
	istore_6 
	aload_1 
	iload_5 
	iload_6 
	aload_0_getfield bitmap   // get_name_1:  bitmap   // get_name_2:  bitmap   // get_Name:    bitmap   // getName->1:  bitmap   // getName->2:  bitmap   // getName->N:  bitmap   // ofs = 53334 ord = 0 addr = 0
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_0_getfield bitmap   // get_name_1:  bitmap   // get_name_2:  bitmap   // get_Name:    bitmap   // getName->1:  bitmap   // getName->2:  bitmap   // getName->N:  bitmap   // ofs = 53334 ord = 0 addr = 0
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	aload_0_getfield bitmap   // get_name_1:  bitmap   // get_name_2:  bitmap   // get_Name:    bitmap   // getName->1:  bitmap   // getName->2:  bitmap   // getName->N:  bitmap   // ofs = 53334 ord = 0 addr = 0
	iconst_0 
	iconst_0 
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=8
	return 
	}


protected final paintBackground( com.whatsapp.client.BitmapButtonField2, net.rim.device.api.ui.Graphics ); // address: 0
	{
	jumpspecial_lib paintBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.Graphics )
	}

}
