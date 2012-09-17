// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-54.cod
// Module version  : 2.8.1914
// Class ID        : 1
// ########################################################


package com.whatsapp.field;


abstract public final class ScaledEncodedImageField extends net.rim.device.api.ui.Field

{

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.field.ScaledEncodedImageField, net.rim.device.api.system.EncodedImage ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	iconst_0 
	i2l 
	invokespecial com.whatsapp.field.ScaledEncodedImageField.<init> // pc=4
	return 
	}


public <init>( com.whatsapp.field.ScaledEncodedImageField, net.rim.device.api.system.EncodedImage, long ); // address: 0
	{
	enter 
	aload_0 
	lload 2
	invokespecial_lib net.rim.device.api.ui.Field.<init> // pc=3
	aload_0 
	aload_1 
	putfield ei   // get_name_1:  ei   // get_name_2:  ei   // get_Name:    ei   // getName->1:  ei   // getName->2:  ei   // getName->N:  ei   // ofs = 52736 ord = 0 addr = 0
	aload_0 
	aload_1 
	invokevirtual int getHeight( net.rim.device.api.system.EncodedImage ) // pc=1
	putfield _preferredHeight   // get_name_1:  _preferredHeight   // get_name_2:  _preferredHeight   // get_Name:    _preferredHeight   // getName->1:  _preferredHeight   // getName->2:  _preferredHeight   // getName->N:  _preferredHeight   // ofs = 52752 ord = 4 addr = 0
	aload_0 
	aload_1 
	invokevirtual int getWidth( net.rim.device.api.system.EncodedImage ) // pc=1
	putfield _preferredWidth   // get_name_1:  _preferredWidth   // get_name_2:  _preferredWidth   // get_Name:    _preferredWidth   // getName->1:  _preferredWidth   // getName->2:  _preferredWidth   // getName->N:  _preferredWidth   // ofs = 52748 ord = 3 addr = 0
	return 
	}


static public final net.rim.device.api.system.Bitmap rotateBitmap( net.rim.device.api.system.Bitmap ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	istore_1 
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	istore_2 
	iload_1 
	newarray 5
	astore_3 
	new_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	dup 
	iload_2 
	iload_1 
	invokespecial_lib net.rim.device.api.system.Bitmap.<init> // pc=3
	astore_4 
	iconst_0 
	istore_5 
Label18:
	iload_5 
	iload_2 
	if_icmpge Label45
	aload_0 
	aload_3 
	iconst_0 
	iload_1 
	iconst_0 
	iload_5 
	iload_1 
	iconst_1 
	invokevirtual getARGB( net.rim.device.api.system.Bitmap, int[], int, int, int, int, int, int ) // pc=8
	aload_4 
	aload_3 
	iconst_0 
	iconst_1 
	iload_2 
	iload_5 
	isub 
	iconst_1 
	isub 
	iconst_0 
	iconst_1 
	iload_1 
	invokevirtual setARGB( net.rim.device.api.system.Bitmap, int[], int, int, int, int, int, int ) // pc=8
	iinc 5 1
	goto Label18
Label45:
	aload_4 
	areturn 
	}


static public final boolean imageNeedsRotate( net.rim.device.api.system.EncodedImage ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual javax.microedition.media.control.MetaDataControl getMetaData( net.rim.device.api.system.EncodedImage ) // pc=1
	astore_1 
	aload_1 
	ifnull Label19
	ldc literal_84:"6"
	aload_1 
	ldc literal_85:"orientation"
	invokeinterface interfacemethodref_2 // pc=2 guess=0
	invokevirtual_short .equals // idx=1 pc=2
	istore_2 
	iload_2 
	ireturn 
	astore_3 
	iconst_0 
	istore_2 
	iload_2 
	ireturn 
Label19:
	iconst_0 
	istore_2 
	iload_2 
	ireturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final int getPreferredHeight( com.whatsapp.field.ScaledEncodedImageField ); // address: 0
	{
	ireturn_field _preferredHeight   // get_name_1:  _preferredHeight   // get_name_2:  _preferredHeight   // get_Name:    _preferredHeight   // getName->1:  _preferredHeight   // getName->2:  _preferredHeight   // getName->N:  _preferredHeight   // ofs = 52752 ord = 4 addr = 0
	}


public final int getPreferredWidth( com.whatsapp.field.ScaledEncodedImageField ); // address: 0
	{
	ireturn_field _preferredWidth   // get_name_1:  _preferredWidth   // get_name_2:  _preferredWidth   // get_Name:    _preferredWidth   // getName->1:  _preferredWidth   // getName->2:  _preferredWidth   // getName->N:  _preferredWidth   // ofs = 52748 ord = 3 addr = 0
	}


public final setPreferredHeight( com.whatsapp.field.ScaledEncodedImageField, int ); // address: 0
	{
	putfield_return _preferredHeight   // get_name_1:  _preferredHeight   // get_name_2:  _preferredHeight   // get_Name:    _preferredHeight   // getName->1:  _preferredHeight   // getName->2:  _preferredHeight   // getName->N:  _preferredHeight   // ofs = 52752 ord = 4 addr = 0
	}


public final setPreferredWidth( com.whatsapp.field.ScaledEncodedImageField, int ); // address: 0
	{
	putfield_return _preferredWidth   // get_name_1:  _preferredWidth   // get_name_2:  _preferredWidth   // get_Name:    _preferredWidth   // getName->1:  _preferredWidth   // getName->2:  _preferredWidth   // getName->N:  _preferredWidth   // ofs = 52748 ord = 3 addr = 0
	}


protected final layout( com.whatsapp.field.ScaledEncodedImageField, int, int ); // address: 0
	{
	enter 
	iload_1 
	aload_0_getfield _preferredWidth   // get_name_1:  _preferredWidth   // get_name_2:  _preferredWidth   // get_Name:    _preferredWidth   // getName->1:  _preferredWidth   // getName->2:  _preferredWidth   // getName->N:  _preferredWidth   // ofs = 52748 ord = 3 addr = 0
	invokestatic_lib int min( int, int ) // Math
	istore_3 
	iload_2 
	aload_0_getfield _preferredHeight   // get_name_1:  _preferredHeight   // get_name_2:  _preferredHeight   // get_Name:    _preferredHeight   // getName->1:  _preferredHeight   // getName->2:  _preferredHeight   // getName->N:  _preferredHeight   // ofs = 52752 ord = 4 addr = 0
	invokestatic_lib int min( int, int ) // Math
	istore_4 
	aload_0_getfield ei   // get_name_1:  ei   // get_name_2:  ei   // get_Name:    ei   // getName->1:  ei   // getName->2:  ei   // getName->N:  ei   // ofs = 52736 ord = 0 addr = 0
	invokestatic boolean imageNeedsRotate( net.rim.device.api.system.EncodedImage ) // ScaledEncodedImageField
	istore_5 
	iload_5 
	ifeq Label17
	aload_0_getfield ei   // get_name_1:  ei   // get_name_2:  ei   // get_Name:    ei   // getName->1:  ei   // getName->2:  ei   // getName->N:  ei   // ofs = 52736 ord = 0 addr = 0
	invokevirtual int getWidth( net.rim.device.api.system.EncodedImage ) // pc=1
	goto Label19
Label17:
	aload_0_getfield ei   // get_name_1:  ei   // get_name_2:  ei   // get_Name:    ei   // getName->1:  ei   // getName->2:  ei   // getName->N:  ei   // ofs = 52736 ord = 0 addr = 0
	invokevirtual int getHeight( net.rim.device.api.system.EncodedImage ) // pc=1
Label19:
	istore_6 
	iload_5 
	ifeq Label25
	aload_0_getfield ei   // get_name_1:  ei   // get_name_2:  ei   // get_Name:    ei   // getName->1:  ei   // getName->2:  ei   // getName->N:  ei   // ofs = 52736 ord = 0 addr = 0
	invokevirtual int getHeight( net.rim.device.api.system.EncodedImage ) // pc=1
	goto Label27
Label25:
	aload_0_getfield ei   // get_name_1:  ei   // get_name_2:  ei   // get_Name:    ei   // getName->1:  ei   // getName->2:  ei   // getName->N:  ei   // ofs = 52736 ord = 0 addr = 0
	invokevirtual int getWidth( net.rim.device.api.system.EncodedImage ) // pc=1
Label27:
	istore_7 
	iload_6 
	invokestatic_lib int toFP( int ) // Fixed32
	iload_4 
	invokestatic_lib int toFP( int ) // Fixed32
	invokestatic_lib int div( int, int ) // Fixed32
	istore 8
	iload_7 
	invokestatic_lib int toFP( int ) // Fixed32
	iload_3 
	invokestatic_lib int toFP( int ) // Fixed32
	invokestatic_lib int div( int, int ) // Fixed32
	istore 9
	iload 8
	iload 9
	invokestatic_lib int max( int, int ) // Math
	istore 10
	aload_0_getfield ei   // get_name_1:  ei   // get_name_2:  ei   // get_Name:    ei   // getName->1:  ei   // getName->2:  ei   // getName->N:  ei   // ofs = 52736 ord = 0 addr = 0
	iload 10
	iload 10
	invokevirtual net.rim.device.api.system.EncodedImage scaleImage32( net.rim.device.api.system.EncodedImage, int, int ) // pc=3
	astore 11
	aload 11
	invokevirtual net.rim.device.api.system.Bitmap getBitmap( net.rim.device.api.system.EncodedImage ) // pc=1
	astore 12
	iload_5 
	ifeq Label57
	aload 12
	invokestatic net.rim.device.api.system.Bitmap rotateBitmap( net.rim.device.api.system.Bitmap ) // ScaledEncodedImageField
	astore 12
Label57:
	aload_0 
	aload 12
	putfield _layoutBitmap   // get_name_1:  _layoutBitmap   // get_name_2:  _layoutBitmap   // get_Name:    _layoutBitmap   // getName->1:  _layoutBitmap   // getName->2:  _layoutBitmap   // getName->N:  _layoutBitmap   // ofs = 52740 ord = 1 addr = 0
	iload_3 
	aload_0_getfield _layoutBitmap   // get_name_1:  _layoutBitmap   // get_name_2:  _layoutBitmap   // get_Name:    _layoutBitmap   // getName->1:  _layoutBitmap   // getName->2:  _layoutBitmap   // getName->N:  _layoutBitmap   // ofs = 52740 ord = 1 addr = 0
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	isub 
	bipush 2
	idiv 
	istore 13
	iload_4 
	aload_0_getfield _layoutBitmap   // get_name_1:  _layoutBitmap   // get_name_2:  _layoutBitmap   // get_Name:    _layoutBitmap   // getName->1:  _layoutBitmap   // getName->2:  _layoutBitmap   // getName->N:  _layoutBitmap   // ofs = 52740 ord = 1 addr = 0
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	isub 
	bipush 2
	idiv 
	istore 14
	aload_0 
	new_lib net.rim.device.api.ui.XYRect//net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect
	dup 
	iload 13
	iload 14
	aload_0_getfield _layoutBitmap   // get_name_1:  _layoutBitmap   // get_name_2:  _layoutBitmap   // get_Name:    _layoutBitmap   // getName->1:  _layoutBitmap   // getName->2:  _layoutBitmap   // getName->N:  _layoutBitmap   // ofs = 52740 ord = 1 addr = 0
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_0_getfield _layoutBitmap   // get_name_1:  _layoutBitmap   // get_name_2:  _layoutBitmap   // get_Name:    _layoutBitmap   // getName->1:  _layoutBitmap   // getName->2:  _layoutBitmap   // getName->N:  _layoutBitmap   // ofs = 52740 ord = 1 addr = 0
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	invokespecial_lib net.rim.device.api.ui.XYRect.<init> // pc=5
	putfield _layoutDest   // get_name_1:  _layoutDest   // get_name_2:  _layoutDest   // get_Name:    _layoutDest   // getName->1:  _layoutDest   // getName->2:  _layoutDest   // getName->N:  _layoutDest   // ofs = 52744 ord = 2 addr = 0
	aload_0 
	iload_3 
	iload_4 
	invokevirtual setExtent( net.rim.device.api.ui.Field, int, int ) // pc=3
	return 
	}


protected final paint( com.whatsapp.field.ScaledEncodedImageField, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter 
	aload_1 
	aload_0_getfield _layoutDest   // get_name_1:  _layoutDest   // get_name_2:  _layoutDest   // get_Name:    _layoutDest   // getName->1:  _layoutDest   // getName->2:  _layoutDest   // getName->N:  _layoutDest   // ofs = 52744 ord = 2 addr = 0
	aload_0_getfield _layoutBitmap   // get_name_1:  _layoutBitmap   // get_name_2:  _layoutBitmap   // get_Name:    _layoutBitmap   // getName->1:  _layoutBitmap   // getName->2:  _layoutBitmap   // getName->N:  _layoutBitmap   // ofs = 52740 ord = 1 addr = 0
	iconst_0 
	iconst_0 
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, net.rim.device.api.ui.XYRect, net.rim.device.api.system.Bitmap, int, int ) // pc=5
	return 
	}

}
