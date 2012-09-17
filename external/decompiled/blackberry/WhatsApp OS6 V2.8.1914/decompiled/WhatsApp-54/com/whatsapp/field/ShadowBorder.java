// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-54.cod
// Module version  : 2.8.1914
// Class ID        : 4
// ########################################################


package com.whatsapp.field;


abstract public final class ShadowBorder extends net.rim.device.api.ui.decor.Border

{


	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.field.ShadowBorder, net.rim.device.api.ui.XYEdges ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	bipush 2
	invokespecial_lib net.rim.device.api.ui.decor.Border.<init> // pc=3
	aload_1 
	getfield left   // get_name_1:  left   // get_name_2:  left   // get_Name:    left   // getName->1:  left   // getName->2:  left   // getName->N:  left   // ofs = -1 ord = 0 addr = -1
	ifne Label14
	aload_1 
	getfield right   // get_name_1:  right   // get_name_2:  right   // get_Name:    right   // getName->1:  right   // getName->2:  right   // getName->N:  right   // ofs = -1 ord = 1 addr = -1
	ifne Label14
	aload_1 
	getfield top   // get_name_1:  top   // get_name_2:  top   // get_Name:    top   // getName->1:  top   // getName->2:  top   // getName->N:  top   // ofs = -1 ord = 2 addr = -1
	ifeq Label18
Label14:
	new_lib net.rim.device.api.system.Application//net.rim.device.api.system.Application net.rim.device.api.system.Application net.rim.device.api.system.Application
	dup 
	invokespecial_lib java.lang.IllegalArgumentException.<init> // pc=1
	athrow 
Label18:
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final paint( com.whatsapp.field.ShadowBorder, net.rim.device.api.ui.Graphics, net.rim.device.api.ui.XYRect ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual int getGlobalAlpha( net.rim.device.api.ui.Graphics ) // pc=1
	istore_3 
	aload_2 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	aload_2 
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 3 addr = -1
	iadd 
	istore_4 
	iload_4 
	aload_0 
	invokevirtual int getBottom( net.rim.device.api.ui.decor.Border ) // pc=1
	isub 
	istore_5 
	bipush 90
	istore_6 
	aload_2 
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 0 addr = -1
	istore_7 
	aload_2 
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 0 addr = -1
	aload_2 
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 1 addr = -1
	iadd 
	iconst_1 
	isub 
	istore 8
	iload_5 
	istore 9
Label30:
	iload 9
	iload_4 
	if_icmpge Label48
	aload_1 
	iload_6 
	invokevirtual setGlobalAlpha( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	iload_7 
	iload 9
	iload 8
	iload 9
	invokevirtual drawLine( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	iload_6 
	bipush 2
	idiv 
	istore_6 
	iinc 9 1
	goto Label30
Label48:
	aload_1 
	iload_3 
	invokevirtual setGlobalAlpha( net.rim.device.api.ui.Graphics, int ) // pc=2
	return 
	}

}
