// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-36.cod
// Module version  : 2.8.1914
// Class ID        : 8
// ########################################################


package com.whatsapp.client;


abstract final class LocationSendScreen$MapBackground extends net.rim.device.api.ui.decor.Background

{

	// @@@@@@@@@@@@@ Fields 
	private final int /*int*/  field_54350 ; // ofs = 54350 addr = 0)
	private final int /*int*/  field_54354 ; // ofs = 54354 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.LocationSendScreen$MapBackground ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib net.rim.device.api.ui.decor.Background.<init> // pc=1
	aload_0 
	invokestatic_lib module:WhatsApp-58.class#1.routine_1655(  ) // class#1
	ifeq Label8
	bipush 20
	goto Label9
Label8:
	bipush 50
Label9:
	putfield com.whatsapp.client.LocationSendScreen$MapBackground.field_54354   // get_name_1:  com.whatsapp.client.LocationSendScreen$MapBackground.field_54354   // get_name_2:  com.whatsapp.client.LocationSendScreen$MapBackground.field_54354   // get_Name:    com.whatsapp.client.LocationSendScreen$MapBackground.field_54354   // getName->1:     // getName->2:     // getName->N:     // ofs = 54354 ord = 1 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.LocationSendScreen$MapBackground.field_54354   // get_name_1:  com.whatsapp.client.LocationSendScreen$MapBackground.field_54354   // get_name_2:  com.whatsapp.client.LocationSendScreen$MapBackground.field_54354   // get_Name:    com.whatsapp.client.LocationSendScreen$MapBackground.field_54354   // getName->1:     // getName->2:     // getName->N:     // ofs = 54354 ord = 1 addr = 0
	bipush 2
	idiv 
	putfield com.whatsapp.client.LocationSendScreen$MapBackground.field_54350   // get_name_1:  com.whatsapp.client.LocationSendScreen$MapBackground.field_54350   // get_name_2:  com.whatsapp.client.LocationSendScreen$MapBackground.field_54350   // get_Name:    com.whatsapp.client.LocationSendScreen$MapBackground.field_54350   // getName->1:     // getName->2:     // getName->N:     // ofs = 54350 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final draw( com.whatsapp.client.LocationSendScreen$MapBackground, net.rim.device.api.ui.Graphics, net.rim.device.api.ui.XYRect ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual int getBackgroundColor( net.rim.device.api.ui.Graphics ) // pc=1
	istore_3 
	aload_1 
	iipush 13882323
	invokevirtual setBackgroundColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	invokevirtual clear( net.rim.device.api.ui.Graphics ) // pc=1
	aload_1 
	iload_3 
	invokevirtual setBackgroundColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	invokevirtual int getColor( net.rim.device.api.ui.Graphics ) // pc=1
	istore_3 
	aload_1 
	iipush 15329769
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_2 
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 2 addr = -1
	aload_0_getfield com.whatsapp.client.LocationSendScreen$MapBackground.field_54350   // get_name_1:  com.whatsapp.client.LocationSendScreen$MapBackground.field_54350   // get_name_2:  com.whatsapp.client.LocationSendScreen$MapBackground.field_54350   // get_Name:    com.whatsapp.client.LocationSendScreen$MapBackground.field_54350   // getName->1:     // getName->2:     // getName->N:     // ofs = 54350 ord = 0 addr = 0
	iadd 
	istore_4 
Label23:
	iload_4 
	aload_2 
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	if_icmpge Label40
	aload_1 
	iload_4 
	aload_2 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 1 addr = -1
	iload_4 
	aload_2 
	invokevirtual int Y2( net.rim.device.api.ui.XYRect ) // pc=1
	invokevirtual drawLine( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	iload_4 
	aload_0_getfield com.whatsapp.client.LocationSendScreen$MapBackground.field_54354   // get_name_1:  com.whatsapp.client.LocationSendScreen$MapBackground.field_54354   // get_name_2:  com.whatsapp.client.LocationSendScreen$MapBackground.field_54354   // get_Name:    com.whatsapp.client.LocationSendScreen$MapBackground.field_54354   // getName->1:     // getName->2:     // getName->N:     // ofs = 54354 ord = 1 addr = 0
	iadd 
	istore_4 
	goto Label23
Label40:
	aload_2 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 1 addr = -1
	aload_0_getfield com.whatsapp.client.LocationSendScreen$MapBackground.field_54350   // get_name_1:  com.whatsapp.client.LocationSendScreen$MapBackground.field_54350   // get_name_2:  com.whatsapp.client.LocationSendScreen$MapBackground.field_54350   // get_Name:    com.whatsapp.client.LocationSendScreen$MapBackground.field_54350   // getName->1:     // getName->2:     // getName->N:     // ofs = 54350 ord = 0 addr = 0
	iadd 
	istore_4 
Label45:
	iload_4 
	aload_2 
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	if_icmpge Label62
	aload_1 
	aload_2 
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 2 addr = -1
	iload_4 
	aload_2 
	invokevirtual int X2( net.rim.device.api.ui.XYRect ) // pc=1
	iload_4 
	invokevirtual drawLine( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	iload_4 
	aload_0_getfield com.whatsapp.client.LocationSendScreen$MapBackground.field_54354   // get_name_1:  com.whatsapp.client.LocationSendScreen$MapBackground.field_54354   // get_name_2:  com.whatsapp.client.LocationSendScreen$MapBackground.field_54354   // get_Name:    com.whatsapp.client.LocationSendScreen$MapBackground.field_54354   // getName->1:     // getName->2:     // getName->N:     // ofs = 54354 ord = 1 addr = 0
	iadd 
	istore_4 
	goto Label45
Label62:
	aload_1 
	iload_3 
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	return 
	}


public final boolean isTransparent( com.whatsapp.client.LocationSendScreen$MapBackground ); // address: 0
	{
	ireturn_bipush 0
	}

}
