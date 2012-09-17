// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-7.cod
// Module version  : 2.7.3204
// Class ID        : 22
// ########################################################


package com.whatsapp.client;


abstract final class Backgrounds$1 extends net.rim.device.api.ui.decor.Border

{


	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.Backgrounds$1, net.rim.device.api.ui.XYEdges, int ); // address: 0
	{
	jumpspecial_lib <init>( net.rim.device.api.ui.decor.Border, net.rim.device.api.ui.XYEdges, int )
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final paint( com.whatsapp.client.Backgrounds$1, net.rim.device.api.ui.Graphics, net.rim.device.api.ui.XYRect ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual int getBottom( net.rim.device.api.ui.decor.Border ) // pc=1
	istore_3 
	aload_2 
	invokevirtual int Y2( net.rim.device.api.ui.XYRect ) // pc=1
	istore_4 
	aload_1 
	invokevirtual int getColor( net.rim.device.api.ui.Graphics ) // pc=1
	istore_5 
	aload_1 
	iipush 16777215
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	aload_2 
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 0 addr = -1
	iconst_1 
	iadd 
	iload_4 
	iload_3 
	isub 
	iconst_1 
	iadd 
	aload_2 
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 1 addr = -1
	iconst_1 
	isub 
	iload_3 
	iconst_1 
	isub 
	invokevirtual fillRect( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	aload_1 
	iipush 13883355
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	aload_2 
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 0 addr = -1
	iload_4 
	iload_3 
	isub 
	aload_2 
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 1 addr = -1
	iconst_1 
	isub 
	iload_3 
	iconst_1 
	isub 
	invokevirtual fillRect( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	aload_1 
	iload_5 
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	return 
	}

}
