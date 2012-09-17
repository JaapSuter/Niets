// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-37.cod
// Module version  : 2.7.3204
// Class ID        : 9
// ########################################################


package com.whatsapp.field;


abstract public final class ProgressAnimationField extends net.rim.device.api.ui.Field
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.device.api.system.Bitmap /*net.rim.device.api.system.Bitmap*/  field_52342 ; // ofs = 52342 addr = 0)
	private int /*int*/  field_52346 ; // ofs = 52346 addr = 0)
	private int /*int*/  field_52350 ; // ofs = 52350 addr = 0)
	private int /*int*/  field_52354 ; // ofs = 52354 addr = 0)
	private int /*int*/  field_52358 ; // ofs = 52358 addr = 0)
	private int /*int*/  field_52362 ; // ofs = 52362 addr = 0)
	private net.rim.device.api.system.Application /*net.rim.device.api.system.Application*/  field_52366 ; // ofs = 52366 addr = 0)
	private boolean /*boolean*/  field_52370 ; // ofs = 52370 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.field.ProgressAnimationField, long ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_548:"spinner.png"
	invokestatic_lib net.rim.device.api.system.Bitmap getBitmapResource( java.lang.String ) // Bitmap
	bipush 6
	lload 1
	invokespecial com.whatsapp.field.ProgressAnimationField.<init> // pc=5
	return 
	}


public <init>( com.whatsapp.field.ProgressAnimationField, net.rim.device.api.system.Bitmap, int, long ); // address: 0
	{
	enter 
	aload_0 
	lload 3
	lipush 36028797018963968
	lor 
	invokespecial_lib net.rim.device.api.ui.Field.<init> // pc=3
	aload_0 
	bipush -1
	putfield com.whatsapp.field.ProgressAnimationField.field_52362   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_52362   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_52362   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_52362   // getName->1:     // getName->2:     // getName->N:     // ofs = 52362 ord = 5 addr = 0
	aload_0 
	aload_1 
	putfield com.whatsapp.field.ProgressAnimationField.field_52342   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_52342   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_52342   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_52342   // getName->1:     // getName->2:     // getName->N:     // ofs = 52342 ord = 0 addr = 0
	aload_0 
	iload_2 
	putfield com.whatsapp.field.ProgressAnimationField.field_52346   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_52346   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_52346   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_52346   // getName->1:     // getName->2:     // getName->N:     // ofs = 52346 ord = 1 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.field.ProgressAnimationField.field_52342   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_52342   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_52342   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_52342   // getName->1:     // getName->2:     // getName->N:     // ofs = 52342 ord = 0 addr = 0
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_0_getfield com.whatsapp.field.ProgressAnimationField.field_52346   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_52346   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_52346   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_52346   // getName->1:     // getName->2:     // getName->N:     // ofs = 52346 ord = 1 addr = 0
	idiv 
	putfield com.whatsapp.field.ProgressAnimationField.field_52350   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_52350   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_52350   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_52350   // getName->1:     // getName->2:     // getName->N:     // ofs = 52350 ord = 2 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.field.ProgressAnimationField.field_52342   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_52342   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_52342   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_52342   // getName->1:     // getName->2:     // getName->N:     // ofs = 52342 ord = 0 addr = 0
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	putfield com.whatsapp.field.ProgressAnimationField.field_52354   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_52354   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_52354   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_52354   // getName->1:     // getName->2:     // getName->N:     // ofs = 52354 ord = 3 addr = 0
	aload_0 
	invokestatic_lib net.rim.device.api.system.Application getApplication(  ) // Application
	putfield com.whatsapp.field.ProgressAnimationField.field_52366   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_52366   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_52366   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_52366   // getName->1:     // getName->2:     // getName->N:     // ofs = 52366 ord = 6 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.field.ProgressAnimationField ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.field.ProgressAnimationField.field_52370   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_52370   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_52370   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_52370   // getName->1:     // getName->2:     // getName->N:     // ofs = 52370 ord = 7 addr = 0
	ifeq Label5
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Field ) // pc=1
Label5:
	return 
	}


protected final layout( com.whatsapp.field.ProgressAnimationField, int, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_0_getfield com.whatsapp.field.ProgressAnimationField.field_52350   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_52350   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_52350   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_52350   // getName->1:     // getName->2:     // getName->N:     // ofs = 52350 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.field.ProgressAnimationField.field_52354   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_52354   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_52354   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_52354   // getName->1:     // getName->2:     // getName->N:     // ofs = 52354 ord = 3 addr = 0
	invokevirtual setExtent( net.rim.device.api.ui.Field, int, int ) // pc=3
	return 
	}


public final int getPreferredHeight( com.whatsapp.field.ProgressAnimationField ); // address: 0
	{
	ireturn_field com.whatsapp.field.ProgressAnimationField.field_52354   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_52354   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_52354   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_52354   // getName->1:     // getName->2:     // getName->N:     // ofs = 52354 ord = 3 addr = 0
	}


protected final paint( com.whatsapp.field.ProgressAnimationField, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter 
	aload_1 
	iconst_0 
	iconst_0 
	aload_0_getfield com.whatsapp.field.ProgressAnimationField.field_52350   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_52350   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_52350   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_52350   // getName->1:     // getName->2:     // getName->N:     // ofs = 52350 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.field.ProgressAnimationField.field_52354   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_52354   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_52354   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_52354   // getName->1:     // getName->2:     // getName->N:     // ofs = 52354 ord = 3 addr = 0
	aload_0_getfield com.whatsapp.field.ProgressAnimationField.field_52342   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_52342   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_52342   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_52342   // getName->1:     // getName->2:     // getName->N:     // ofs = 52342 ord = 0 addr = 0
	aload_0_getfield com.whatsapp.field.ProgressAnimationField.field_52350   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_52350   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_52350   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_52350   // getName->1:     // getName->2:     // getName->N:     // ofs = 52350 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.field.ProgressAnimationField.field_52358   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_52358   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_52358   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_52358   // getName->1:     // getName->2:     // getName->N:     // ofs = 52358 ord = 4 addr = 0
	imul 
	iconst_0 
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=8
	aload_0 
	aload_0_getfield com.whatsapp.field.ProgressAnimationField.field_52358   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_52358   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_52358   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_52358   // getName->1:     // getName->2:     // getName->N:     // ofs = 52358 ord = 4 addr = 0
	iconst_1 
	iadd 
	putfield com.whatsapp.field.ProgressAnimationField.field_52358   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_52358   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_52358   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_52358   // getName->1:     // getName->2:     // getName->N:     // ofs = 52358 ord = 4 addr = 0
	aload_0_getfield com.whatsapp.field.ProgressAnimationField.field_52358   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_52358   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_52358   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_52358   // getName->1:     // getName->2:     // getName->N:     // ofs = 52358 ord = 4 addr = 0
	aload_0_getfield com.whatsapp.field.ProgressAnimationField.field_52346   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_52346   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_52346   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_52346   // getName->1:     // getName->2:     // getName->N:     // ofs = 52346 ord = 1 addr = 0
	if_icmplt Label23
	aload_0 
	iconst_0 
	putfield com.whatsapp.field.ProgressAnimationField.field_52358   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_52358   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_52358   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_52358   // getName->1:     // getName->2:     // getName->N:     // ofs = 52358 ord = 4 addr = 0
Label23:
	return 
	}


protected final onDisplay( com.whatsapp.field.ProgressAnimationField ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib net.rim.device.api.ui.Field.onDisplay // pc=1
	aload_0 
	iconst_1 
	putfield com.whatsapp.field.ProgressAnimationField.field_52370   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_52370   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_52370   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_52370   // getName->1:     // getName->2:     // getName->N:     // ofs = 52370 ord = 7 addr = 0
	aload_0_getfield com.whatsapp.field.ProgressAnimationField.field_52362   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_52362   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_52362   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_52362   // getName->1:     // getName->2:     // getName->N:     // ofs = 52362 ord = 5 addr = 0
	bipush -1
	if_icmpne Label17
	aload_0 
	aload_0_getfield com.whatsapp.field.ProgressAnimationField.field_52366   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_52366   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_52366   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_52366   // getName->1:     // getName->2:     // getName->N:     // ofs = 52366 ord = 6 addr = 0
	aload_0 
	sipush 200
	i2l 
	iconst_1 
	invokevirtual int invokeLater( net.rim.device.api.system.Application, java.lang.Runnable, long, boolean ) // pc=5
	putfield com.whatsapp.field.ProgressAnimationField.field_52362   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_52362   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_52362   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_52362   // getName->1:     // getName->2:     // getName->N:     // ofs = 52362 ord = 5 addr = 0
Label17:
	return 
	}


protected final onUndisplay( com.whatsapp.field.ProgressAnimationField ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib net.rim.device.api.ui.Field.onUndisplay // pc=1
	aload_0 
	iconst_0 
	putfield com.whatsapp.field.ProgressAnimationField.field_52370   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_52370   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_52370   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_52370   // getName->1:     // getName->2:     // getName->N:     // ofs = 52370 ord = 7 addr = 0
	aload_0_getfield com.whatsapp.field.ProgressAnimationField.field_52362   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_52362   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_52362   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_52362   // getName->1:     // getName->2:     // getName->N:     // ofs = 52362 ord = 5 addr = 0
	bipush -1
	if_icmpeq Label15
	aload_0_getfield com.whatsapp.field.ProgressAnimationField.field_52366   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_52366   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_52366   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_52366   // getName->1:     // getName->2:     // getName->N:     // ofs = 52366 ord = 6 addr = 0
	aload_0_getfield com.whatsapp.field.ProgressAnimationField.field_52362   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_52362   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_52362   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_52362   // getName->1:     // getName->2:     // getName->N:     // ofs = 52362 ord = 5 addr = 0
	invokevirtual cancelInvokeLater( net.rim.device.api.system.Application, int ) // pc=2
	aload_0 
	bipush -1
	putfield com.whatsapp.field.ProgressAnimationField.field_52362   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_52362   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_52362   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_52362   // getName->1:     // getName->2:     // getName->N:     // ofs = 52362 ord = 5 addr = 0
Label15:
	return 
	}

}
