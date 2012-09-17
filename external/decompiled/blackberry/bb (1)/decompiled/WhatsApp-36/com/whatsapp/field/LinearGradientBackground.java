// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-36.cod
// Module version  : 2.7.3204
// Class ID        : 8
// ########################################################


package com.whatsapp.field;


abstract public final class LinearGradientBackground extends net.rim.device.api.ui.decor.Background

{
	// @@@@@@@@@@@@@ Static fields 
	private static int /*int*/  field_52830 ; // ofs = 52830 addr = 19)

	// @@@@@@@@@@@@@ Fields 
	private int /*int*/  field_52818 ; // ofs = 52818 addr = 0)
	private int /*int*/  field_52822 ; // ofs = 52822 addr = 0)
	private net.rim.device.api.system.Bitmap /*net.rim.device.api.system.Bitmap*/  field_52826 ; // ofs = 52826 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

static public final net.rim.device.api.ui.decor.Background generate( int, int ); // address: 0
	{
	enter 
	new LinearGradientBackground
	dup 
	iload_0 
	iload_1 
	invokespecial com.whatsapp.field.LinearGradientBackground.<init> // pc=3
	areturn 
	}


private <init>( com.whatsapp.field.LinearGradientBackground, int, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib net.rim.device.api.ui.decor.Background.<init> // pc=1
	aload_0 
	iload_1 
	putfield com.whatsapp.field.LinearGradientBackground.field_52818   // get_name_1:  com.whatsapp.field.LinearGradientBackground.field_52818   // get_name_2:  com.whatsapp.field.LinearGradientBackground.field_52818   // get_Name:    com.whatsapp.field.LinearGradientBackground.field_52818   // getName->1:     // getName->2:     // getName->N:     // ofs = 52818 ord = 0 addr = 0
	aload_0 
	iload_2 
	putfield com.whatsapp.field.LinearGradientBackground.field_52822   // get_name_1:  com.whatsapp.field.LinearGradientBackground.field_52822   // get_name_2:  com.whatsapp.field.LinearGradientBackground.field_52822   // get_Name:    com.whatsapp.field.LinearGradientBackground.field_52822   // getName->1:     // getName->2:     // getName->N:     // ofs = 52822 ord = 1 addr = 0
	return 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	clinit_lib net.rim.device.api.ui.decor.Background//net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background
	synch_static LinearGradientBackground
	clinit_wait 
	bipush 16
	putstatic com.whatsapp.field.LinearGradientBackground.field_52830 // LinearGradientBackground
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.field.LinearGradientBackground.routine_5331( com.whatsapp.field.LinearGradientBackground, int[], int, int, int, int ); // address: 0
	{
	enter 
	iconst_0 
	istore_6 
	iload_4 
	iipush 16711680
	iand 
	bipush 16
	ishr 
	istore_7 
	iload_4 
	iipush 65280
	iand 
	bipush 8
	ishr 
	istore 8
	iload_4 
	sipush 255
	iand 
	istore 9
	iload_5 
	iipush 16711680
	iand 
	bipush 16
	ishr 
	istore 10
	iload_5 
	iipush 65280
	iand 
	bipush 8
	ishr 
	istore 11
	iload_5 
	sipush 255
	iand 
	istore 12
	iconst_0 
	istore 13
Label37:
	iload 13
	iload_2 
	if_icmpge Label102
	iload_2 
	iload 13
	isub 
	istore 14
	iload 13
	istore 15
	iload 14
	iload_7 
	imul 
	iload 15
	iload 10
	imul 
	iadd 
	iload_2 
	idiv 
	istore 16
	iload 14
	iload 8
	imul 
	iload 15
	iload 11
	imul 
	iadd 
	iload_2 
	idiv 
	istore 17
	iload 14
	iload 9
	imul 
	iload 15
	iload 12
	imul 
	iadd 
	iload_2 
	idiv 
	istore 18
	iipush -16777216
	iload 16
	bipush 16
	ishl 
	iadd 
	iload 17
	bipush 8
	ishl 
	iadd 
	iload 18
	iadd 
	istore 19
	iconst_0 
	istore 20
Label90:
	iload 20
	iload_3 
	if_icmpge Label100
	aload_1 
	iload_6 
	iload 19
	iastore 
	iinc 6 1
	iinc 20 1
	goto Label90
Label100:
	iinc 13 1
	goto Label37
Label102:
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final draw( com.whatsapp.field.LinearGradientBackground, net.rim.device.api.ui.Graphics, net.rim.device.api.ui.XYRect ); // address: 0
	{
	enter 
	aload_2 
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	istore_3 
	aload_0_getfield com.whatsapp.field.LinearGradientBackground.field_52826   // get_name_1:  com.whatsapp.field.LinearGradientBackground.field_52826   // get_name_2:  com.whatsapp.field.LinearGradientBackground.field_52826   // get_Name:    com.whatsapp.field.LinearGradientBackground.field_52826   // getName->1:     // getName->2:     // getName->N:     // ofs = 52826 ord = 2 addr = 0
	ifnull Label10
	iload_3 
	aload_0_getfield com.whatsapp.field.LinearGradientBackground.field_52826   // get_name_1:  com.whatsapp.field.LinearGradientBackground.field_52826   // get_name_2:  com.whatsapp.field.LinearGradientBackground.field_52826   // get_Name:    com.whatsapp.field.LinearGradientBackground.field_52826   // getName->1:     // getName->2:     // getName->N:     // ofs = 52826 ord = 2 addr = 0
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	if_icmpeq Label46
Label10:
	getstatic com.whatsapp.field.LinearGradientBackground.field_52830 // LinearGradientBackground
	bipush 2
	iadd 
	istore_4 
	iload_3 
	iload_4 
	imul 
	newarray 5
	astore_5 
	aload_0 
	aload_5 
	iload_3 
	iload_4 
	aload_0_getfield com.whatsapp.field.LinearGradientBackground.field_52818   // get_name_1:  com.whatsapp.field.LinearGradientBackground.field_52818   // get_name_2:  com.whatsapp.field.LinearGradientBackground.field_52818   // get_Name:    com.whatsapp.field.LinearGradientBackground.field_52818   // getName->1:     // getName->2:     // getName->N:     // ofs = 52818 ord = 0 addr = 0
	aload_0_getfield com.whatsapp.field.LinearGradientBackground.field_52822   // get_name_1:  com.whatsapp.field.LinearGradientBackground.field_52822   // get_name_2:  com.whatsapp.field.LinearGradientBackground.field_52822   // get_Name:    com.whatsapp.field.LinearGradientBackground.field_52822   // getName->1:     // getName->2:     // getName->N:     // ofs = 52822 ord = 1 addr = 0
	invokespecial com.whatsapp.field.LinearGradientBackground.routine_5331 // pc=6
	aload_5 
	iload_4 
	iload_3 
	invokestatic ditherFloydSteinberg( int[], int, int ) // FloydSteinberg
	aload_0 
	new_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	dup 
	getstatic com.whatsapp.field.LinearGradientBackground.field_52830 // LinearGradientBackground
	iload_3 
	invokespecial_lib net.rim.device.api.system.Bitmap.<init> // pc=3
	putfield com.whatsapp.field.LinearGradientBackground.field_52826   // get_name_1:  com.whatsapp.field.LinearGradientBackground.field_52826   // get_name_2:  com.whatsapp.field.LinearGradientBackground.field_52826   // get_Name:    com.whatsapp.field.LinearGradientBackground.field_52826   // getName->1:     // getName->2:     // getName->N:     // ofs = 52826 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.field.LinearGradientBackground.field_52826   // get_name_1:  com.whatsapp.field.LinearGradientBackground.field_52826   // get_name_2:  com.whatsapp.field.LinearGradientBackground.field_52826   // get_Name:    com.whatsapp.field.LinearGradientBackground.field_52826   // getName->1:     // getName->2:     // getName->N:     // ofs = 52826 ord = 2 addr = 0
	aload_5 
	iconst_0 
	iload_4 
	iconst_0 
	iconst_0 
	getstatic com.whatsapp.field.LinearGradientBackground.field_52830 // LinearGradientBackground
	iload_3 
	invokevirtual setARGB( net.rim.device.api.system.Bitmap, int[], int, int, int, int, int, int ) // pc=8
Label46:
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
	aload_0_getfield com.whatsapp.field.LinearGradientBackground.field_52826   // get_name_1:  com.whatsapp.field.LinearGradientBackground.field_52826   // get_name_2:  com.whatsapp.field.LinearGradientBackground.field_52826   // get_Name:    com.whatsapp.field.LinearGradientBackground.field_52826   // getName->1:     // getName->2:     // getName->N:     // ofs = 52826 ord = 2 addr = 0
	bipush 2
	iconst_0 
	invokevirtual tileRop( net.rim.device.api.ui.Graphics, int, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=9
	return 
	}


public final boolean isTransparent( com.whatsapp.field.LinearGradientBackground ); // address: 0
	{
	ireturn_bipush 0
	}

}
