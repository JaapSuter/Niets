// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-37.cod
// Module version  : 2.7.3204
// Class ID        : 10
// ########################################################


package com.whatsapp.field;


abstract public final class RoundedFilledBorder extends net.rim.device.api.ui.decor.Border

{

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.field.RoundedFilledBorder, net.rim.device.api.ui.XYEdges, int, int ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	iload_2 
	iload_3 
	sipush 255
	invokespecial com.whatsapp.field.RoundedFilledBorder.<init> // pc=5
	return 
	}


public <init>( com.whatsapp.field.RoundedFilledBorder, net.rim.device.api.ui.XYEdges, int, int, int ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	bipush 4
	invokespecial_lib net.rim.device.api.ui.decor.Border.<init> // pc=3
	aload_1 
	getfield left   // get_name_1:  left   // get_name_2:  left   // get_Name:    left   // getName->1:  left   // getName->2:  left   // getName->N:  left   // ofs = -1 ord = 0 addr = -1
	aload_1 
	getfield right   // get_name_1:  right   // get_name_2:  right   // get_Name:    right   // getName->1:  right   // getName->2:  right   // getName->N:  right   // ofs = -1 ord = 1 addr = -1
	if_icmpne Label20
	aload_1 
	getfield top   // get_name_1:  top   // get_name_2:  top   // get_Name:    top   // getName->1:  top   // getName->2:  top   // getName->N:  top   // ofs = -1 ord = 2 addr = -1
	aload_1 
	getfield bottom   // get_name_1:  bottom   // get_name_2:  bottom   // get_Name:    bottom   // getName->1:  bottom   // getName->2:  bottom   // getName->N:  bottom   // ofs = -1 ord = 3 addr = -1
	if_icmpne Label20
	aload_1 
	getfield left   // get_name_1:  left   // get_name_2:  left   // get_Name:    left   // getName->1:  left   // getName->2:  left   // getName->N:  left   // ofs = -1 ord = 0 addr = -1
	aload_1 
	getfield top   // get_name_1:  top   // get_name_2:  top   // get_Name:    top   // getName->1:  top   // getName->2:  top   // getName->N:  top   // ofs = -1 ord = 2 addr = -1
	if_icmpeq Label24
Label20:
	new_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	dup 
	invokespecial_lib java.lang.IllegalArgumentException.<init> // pc=1
	athrow 
Label24:
	aload_0 
	iload_2 
	putfield fillColor   // get_name_1:  fillColor   // get_name_2:  fillColor   // get_Name:    fillColor   // getName->1:  fillColor   // getName->2:  fillColor   // getName->N:  fillColor   // ofs = 52430 ord = 0 addr = 0
	aload_0 
	iload_3 
	putfield edgeColor   // get_name_1:  edgeColor   // get_name_2:  edgeColor   // get_Name:    edgeColor   // getName->1:  edgeColor   // getName->2:  edgeColor   // getName->N:  edgeColor   // ofs = 52434 ord = 1 addr = 0
	aload_0 
	iload_4 
	putfield transparency   // get_name_1:  transparency   // get_name_2:  transparency   // get_Name:    transparency   // getName->1:  transparency   // getName->2:  transparency   // getName->N:  transparency   // ofs = 52438 ord = 2 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final paint( com.whatsapp.field.RoundedFilledBorder, net.rim.device.api.ui.Graphics, net.rim.device.api.ui.XYRect ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual int getGlobalAlpha( net.rim.device.api.ui.Graphics ) // pc=1
	istore_3 
	aload_1 
	invokevirtual int getColor( net.rim.device.api.ui.Graphics ) // pc=1
	istore_4 
	aload_1 
	aload_0_getfield transparency   // get_name_1:  transparency   // get_name_2:  transparency   // get_Name:    transparency   // getName->1:  transparency   // getName->2:  transparency   // getName->N:  transparency   // ofs = 52438 ord = 2 addr = 0
	invokevirtual setGlobalAlpha( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	aload_0_getfield fillColor   // get_name_1:  fillColor   // get_name_2:  fillColor   // get_Name:    fillColor   // getName->1:  fillColor   // getName->2:  fillColor   // getName->N:  fillColor   // ofs = 52430 ord = 0 addr = 0
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_0 
	invokevirtual int getLeft( net.rim.device.api.ui.decor.Border ) // pc=1
	bipush 2
	imul 
	istore_5 
	aload_1 
	aload_2 
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 0 addr = -1
	aload_2 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 1 addr = -1
	aload_2 
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	aload_2 
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 2 addr = -1
	iload_5 
	iload_5 
	invokevirtual fillRoundRect( net.rim.device.api.ui.Graphics, int, int, int, int, int, int ) // pc=7
	aload_1 
	aload_0_getfield edgeColor   // get_name_1:  edgeColor   // get_name_2:  edgeColor   // get_Name:    edgeColor   // getName->1:  edgeColor   // getName->2:  edgeColor   // getName->N:  edgeColor   // ofs = 52434 ord = 1 addr = 0
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	aload_2 
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 0 addr = -1
	aload_2 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 1 addr = -1
	aload_2 
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	aload_2 
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 2 addr = -1
	iload_5 
	iload_5 
	invokevirtual drawRoundRect( net.rim.device.api.ui.Graphics, int, int, int, int, int, int ) // pc=7
	aload_1 
	iload_4 
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	iload_3 
	invokevirtual setGlobalAlpha( net.rim.device.api.ui.Graphics, int ) // pc=2
	return 
	}

}
