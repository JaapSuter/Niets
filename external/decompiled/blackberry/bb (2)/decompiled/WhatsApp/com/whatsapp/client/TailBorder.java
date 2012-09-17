// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-29.cod
// Module version  : 2.6.7421
// Class ID        : 6
// ########################################################


package com.whatsapp.client;


abstract public final class TailBorder extends net.rim.device.api.ui.decor.Border

{

	// @@@@@@@@@@@@@ Fields 
	final int /*int*/  _top ; // ofs = 56704 addr = 0)
	final int /*int*/  _right ; // ofs = 56708 addr = 0)
	final int /*int*/  _bottom ; // ofs = 56712 addr = 0)
	final int /*int*/  _left ; // ofs = 56716 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

protected <init>( com.whatsapp.client.TailBorder, int, int, int, int ); // address: 0
	{
	enter 
	aload_0 
	new_lib net.rim.device.api.ui.XYEdges//net.rim.device.api.ui.XYEdges net.rim.device.api.ui.XYEdges net.rim.device.api.ui.XYEdges
	dup 
	iload_1 
	ifge Label8
	iconst_1 
	goto Label9
Label8:
	bipush 10
Label9:
	iload_2 
	ifge Label13
	iconst_1 
	goto Label14
Label13:
	bipush 10
Label14:
	iload_3 
	ifge Label18
	iconst_1 
	goto Label19
Label18:
	bipush 10
Label19:
	iload_4 
	ifge Label23
	iconst_1 
	goto Label24
Label23:
	bipush 10
Label24:
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=5
	bipush 4
	invokespecial_lib net.rim.device.api.ui.decor.Border.<init> // pc=3
	aload_0 
	iload_1 
	putfield _top   // get_name_1:  _top   // get_name_2:  _top   // get_Name:    _top   // getName->1:  _top   // getName->2:  _top   // getName->N:  _top   // ofs = 56704 ord = 0 addr = 0
	aload_0 
	iload_2 
	putfield _right   // get_name_1:  _right   // get_name_2:  _right   // get_Name:    _right   // getName->1:  _right   // getName->2:  _right   // getName->N:  _right   // ofs = 56708 ord = 1 addr = 0
	aload_0 
	iload_3 
	putfield _bottom   // get_name_1:  _bottom   // get_name_2:  _bottom   // get_Name:    _bottom   // getName->1:  _bottom   // getName->2:  _bottom   // getName->N:  _bottom   // ofs = 56712 ord = 2 addr = 0
	aload_0 
	iload_4 
	putfield _left   // get_name_1:  _left   // get_name_2:  _left   // get_Name:    _left   // getName->1:  _left   // getName->2:  _left   // getName->N:  _left   // ofs = 56716 ord = 3 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final paint( com.whatsapp.client.TailBorder, net.rim.device.api.ui.Graphics, net.rim.device.api.ui.XYRect ); // address: 0
	{
	enter 
	aload_2 
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 0 addr = -1
	istore_3 
	aload_2 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 1 addr = -1
	istore_4 
	aload_2 
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 2 addr = -1
	istore_5 
	aload_2 
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 3 addr = -1
	istore_6 
	aload_0_getfield _top   // get_name_1:  _top   // get_name_2:  _top   // get_Name:    _top   // getName->1:  _top   // getName->2:  _top   // getName->N:  _top   // ofs = 56704 ord = 0 addr = 0
	bipush -1
	if_icmpne Label19
	iload_4 
	istore_7 
	goto Label33
Label19:
	iload_4 
	bipush 9
	iadd 
	istore_7 
	aload_1 
	iload_3 
	aload_0_getfield _top   // get_name_1:  _top   // get_name_2:  _top   // get_Name:    _top   // getName->1:  _top   // getName->2:  _top   // getName->N:  _top   // ofs = 56704 ord = 0 addr = 0
	iadd 
	iload_7 
	iload_3 
	aload_0_getfield _top   // get_name_1:  _top   // get_name_2:  _top   // get_Name:    _top   // getName->1:  _top   // getName->2:  _top   // getName->N:  _top   // ofs = 56704 ord = 0 addr = 0
	iadd 
	iload_4 
	invokevirtual drawLine( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
Label33:
	aload_0_getfield _right   // get_name_1:  _right   // get_name_2:  _right   // get_Name:    _right   // getName->1:  _right   // getName->2:  _right   // getName->N:  _right   // ofs = 56708 ord = 1 addr = 0
	bipush -1
	if_icmpne Label43
	iload_3 
	iload_5 
	iadd 
	iconst_1 
	isub 
	istore 10
	goto Label63
Label43:
	iload_3 
	iload_5 
	iadd 
	bipush 10
	isub 
	istore 10
	aload_1 
	iload 10
	iload_4 
	aload_0_getfield _right   // get_name_1:  _right   // get_name_2:  _right   // get_Name:    _right   // getName->1:  _right   // getName->2:  _right   // getName->N:  _right   // ofs = 56708 ord = 1 addr = 0
	iadd 
	iload_3 
	iload_5 
	iadd 
	iconst_1 
	isub 
	iload_4 
	aload_0_getfield _right   // get_name_1:  _right   // get_name_2:  _right   // get_Name:    _right   // getName->1:  _right   // getName->2:  _right   // getName->N:  _right   // ofs = 56708 ord = 1 addr = 0
	iadd 
	invokevirtual drawLine( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
Label63:
	aload_0_getfield _bottom   // get_name_1:  _bottom   // get_name_2:  _bottom   // get_Name:    _bottom   // getName->1:  _bottom   // getName->2:  _bottom   // getName->N:  _bottom   // ofs = 56712 ord = 2 addr = 0
	bipush -1
	if_icmpne Label73
	iload_4 
	iload_6 
	iadd 
	iconst_1 
	isub 
	istore 8
	goto Label93
Label73:
	iload_4 
	iload_6 
	iadd 
	bipush 10
	isub 
	istore 8
	aload_1 
	iload_3 
	aload_0_getfield _bottom   // get_name_1:  _bottom   // get_name_2:  _bottom   // get_Name:    _bottom   // getName->1:  _bottom   // getName->2:  _bottom   // getName->N:  _bottom   // ofs = 56712 ord = 2 addr = 0
	iadd 
	iload 8
	iload_3 
	aload_0_getfield _bottom   // get_name_1:  _bottom   // get_name_2:  _bottom   // get_Name:    _bottom   // getName->1:  _bottom   // getName->2:  _bottom   // getName->N:  _bottom   // ofs = 56712 ord = 2 addr = 0
	iadd 
	iload_4 
	iload_6 
	iadd 
	iconst_1 
	isub 
	invokevirtual drawLine( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
Label93:
	aload_0_getfield _left   // get_name_1:  _left   // get_name_2:  _left   // get_Name:    _left   // getName->1:  _left   // getName->2:  _left   // getName->N:  _left   // ofs = 56716 ord = 3 addr = 0
	bipush -1
	if_icmpne Label99
	iload_3 
	istore 9
	goto Label113
Label99:
	iload_3 
	bipush 9
	iadd 
	istore 9
	aload_1 
	iload 9
	iload_4 
	aload_0_getfield _left   // get_name_1:  _left   // get_name_2:  _left   // get_Name:    _left   // getName->1:  _left   // getName->2:  _left   // getName->N:  _left   // ofs = 56716 ord = 3 addr = 0
	iadd 
	iload_3 
	iload_4 
	aload_0_getfield _left   // get_name_1:  _left   // get_name_2:  _left   // get_Name:    _left   // getName->1:  _left   // getName->2:  _left   // getName->N:  _left   // ofs = 56716 ord = 3 addr = 0
	iadd 
	invokevirtual drawLine( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
Label113:
	aload_1 
	iload 9
	iload_7 
	iload 10
	iload_7 
	invokevirtual drawLine( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	aload_1 
	iload 10
	iload_7 
	iload 10
	iload 8
	invokevirtual drawLine( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	aload_1 
	iload 10
	iload 8
	iload 9
	iload 8
	invokevirtual drawLine( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	aload_1 
	iload 9
	iload 8
	iload 9
	iload_7 
	invokevirtual drawLine( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	return 
	}

}
