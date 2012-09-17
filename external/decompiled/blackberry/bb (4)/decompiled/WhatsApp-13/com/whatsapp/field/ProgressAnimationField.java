// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-38.cod
// Module version  : 2.7.3204
// Class ID        : 8
// ########################################################


package com.whatsapp.field;


abstract public final class ProgressAnimationField extends net.rim.device.api.ui.Field
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.device.api.system.Bitmap /*net.rim.device.api.system.Bitmap*/  field_53096 ; // ofs = 53096 addr = 0)
	private int /*int*/  field_53100 ; // ofs = 53100 addr = 0)
	private int /*int*/  field_53104 ; // ofs = 53104 addr = 0)
	private int /*int*/  field_53108 ; // ofs = 53108 addr = 0)
	private int /*int*/  field_53112 ; // ofs = 53112 addr = 0)
	private int /*int*/  field_53116 ; // ofs = 53116 addr = 0)
	private net.rim.device.api.system.Application /*net.rim.device.api.system.Application*/  field_53120 ; // ofs = 53120 addr = 0)
	private boolean /*boolean*/  field_53124 ; // ofs = 53124 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.field.ProgressAnimationField, long ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_607:"spinner.png"
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
	putfield com.whatsapp.field.ProgressAnimationField.field_53116   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_53116   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_53116   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_53116   // getName->1:     // getName->2:     // getName->N:     // ofs = 53116 ord = 5 addr = 0
	aload_0 
	aload_1 
	putfield com.whatsapp.field.ProgressAnimationField.field_53096   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_53096   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_53096   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_53096   // getName->1:     // getName->2:     // getName->N:     // ofs = 53096 ord = 0 addr = 0
	aload_0 
	iload_2 
	putfield com.whatsapp.field.ProgressAnimationField.field_53100   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_53100   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_53100   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_53100   // getName->1:     // getName->2:     // getName->N:     // ofs = 53100 ord = 1 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.field.ProgressAnimationField.field_53096   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_53096   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_53096   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_53096   // getName->1:     // getName->2:     // getName->N:     // ofs = 53096 ord = 0 addr = 0
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_0_getfield com.whatsapp.field.ProgressAnimationField.field_53100   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_53100   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_53100   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_53100   // getName->1:     // getName->2:     // getName->N:     // ofs = 53100 ord = 1 addr = 0
	idiv 
	putfield com.whatsapp.field.ProgressAnimationField.field_53104   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_53104   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_53104   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_53104   // getName->1:     // getName->2:     // getName->N:     // ofs = 53104 ord = 2 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.field.ProgressAnimationField.field_53096   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_53096   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_53096   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_53096   // getName->1:     // getName->2:     // getName->N:     // ofs = 53096 ord = 0 addr = 0
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	putfield com.whatsapp.field.ProgressAnimationField.field_53108   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_53108   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_53108   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_53108   // getName->1:     // getName->2:     // getName->N:     // ofs = 53108 ord = 3 addr = 0
	aload_0 
	invokestatic_lib net.rim.device.api.system.Application getApplication(  ) // Application
	putfield com.whatsapp.field.ProgressAnimationField.field_53120   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_53120   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_53120   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_53120   // getName->1:     // getName->2:     // getName->N:     // ofs = 53120 ord = 6 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.field.ProgressAnimationField ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.field.ProgressAnimationField.field_53124   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_53124   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_53124   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_53124   // getName->1:     // getName->2:     // getName->N:     // ofs = 53124 ord = 7 addr = 0
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
	aload_0_getfield com.whatsapp.field.ProgressAnimationField.field_53104   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_53104   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_53104   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_53104   // getName->1:     // getName->2:     // getName->N:     // ofs = 53104 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.field.ProgressAnimationField.field_53108   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_53108   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_53108   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_53108   // getName->1:     // getName->2:     // getName->N:     // ofs = 53108 ord = 3 addr = 0
	invokevirtual setExtent( net.rim.device.api.ui.Field, int, int ) // pc=3
	return 
	}


public final int getPreferredHeight( com.whatsapp.field.ProgressAnimationField ); // address: 0
	{
	ireturn_field com.whatsapp.field.ProgressAnimationField.field_53108   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_53108   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_53108   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_53108   // getName->1:     // getName->2:     // getName->N:     // ofs = 53108 ord = 3 addr = 0
	}


protected final paint( com.whatsapp.field.ProgressAnimationField, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter 
	aload_1 
	iconst_0 
	iconst_0 
	aload_0_getfield com.whatsapp.field.ProgressAnimationField.field_53104   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_53104   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_53104   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_53104   // getName->1:     // getName->2:     // getName->N:     // ofs = 53104 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.field.ProgressAnimationField.field_53108   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_53108   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_53108   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_53108   // getName->1:     // getName->2:     // getName->N:     // ofs = 53108 ord = 3 addr = 0
	aload_0_getfield com.whatsapp.field.ProgressAnimationField.field_53096   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_53096   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_53096   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_53096   // getName->1:     // getName->2:     // getName->N:     // ofs = 53096 ord = 0 addr = 0
	aload_0_getfield com.whatsapp.field.ProgressAnimationField.field_53104   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_53104   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_53104   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_53104   // getName->1:     // getName->2:     // getName->N:     // ofs = 53104 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.field.ProgressAnimationField.field_53112   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_53112   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_53112   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_53112   // getName->1:     // getName->2:     // getName->N:     // ofs = 53112 ord = 4 addr = 0
	imul 
	iconst_0 
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=8
	aload_0 
	aload_0_getfield com.whatsapp.field.ProgressAnimationField.field_53112   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_53112   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_53112   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_53112   // getName->1:     // getName->2:     // getName->N:     // ofs = 53112 ord = 4 addr = 0
	iconst_1 
	iadd 
	putfield com.whatsapp.field.ProgressAnimationField.field_53112   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_53112   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_53112   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_53112   // getName->1:     // getName->2:     // getName->N:     // ofs = 53112 ord = 4 addr = 0
	aload_0_getfield com.whatsapp.field.ProgressAnimationField.field_53112   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_53112   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_53112   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_53112   // getName->1:     // getName->2:     // getName->N:     // ofs = 53112 ord = 4 addr = 0
	aload_0_getfield com.whatsapp.field.ProgressAnimationField.field_53100   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_53100   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_53100   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_53100   // getName->1:     // getName->2:     // getName->N:     // ofs = 53100 ord = 1 addr = 0
	if_icmplt Label23
	aload_0 
	iconst_0 
	putfield com.whatsapp.field.ProgressAnimationField.field_53112   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_53112   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_53112   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_53112   // getName->1:     // getName->2:     // getName->N:     // ofs = 53112 ord = 4 addr = 0
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
	putfield com.whatsapp.field.ProgressAnimationField.field_53124   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_53124   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_53124   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_53124   // getName->1:     // getName->2:     // getName->N:     // ofs = 53124 ord = 7 addr = 0
	aload_0_getfield com.whatsapp.field.ProgressAnimationField.field_53116   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_53116   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_53116   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_53116   // getName->1:     // getName->2:     // getName->N:     // ofs = 53116 ord = 5 addr = 0
	bipush -1
	if_icmpne Label17
	aload_0 
	aload_0_getfield com.whatsapp.field.ProgressAnimationField.field_53120   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_53120   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_53120   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_53120   // getName->1:     // getName->2:     // getName->N:     // ofs = 53120 ord = 6 addr = 0
	aload_0 
	sipush 200
	i2l 
	iconst_1 
	invokevirtual int invokeLater( net.rim.device.api.system.Application, java.lang.Runnable, long, boolean ) // pc=5
	putfield com.whatsapp.field.ProgressAnimationField.field_53116   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_53116   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_53116   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_53116   // getName->1:     // getName->2:     // getName->N:     // ofs = 53116 ord = 5 addr = 0
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
	putfield com.whatsapp.field.ProgressAnimationField.field_53124   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_53124   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_53124   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_53124   // getName->1:     // getName->2:     // getName->N:     // ofs = 53124 ord = 7 addr = 0
	aload_0_getfield com.whatsapp.field.ProgressAnimationField.field_53116   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_53116   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_53116   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_53116   // getName->1:     // getName->2:     // getName->N:     // ofs = 53116 ord = 5 addr = 0
	bipush -1
	if_icmpeq Label15
	aload_0_getfield com.whatsapp.field.ProgressAnimationField.field_53120   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_53120   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_53120   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_53120   // getName->1:     // getName->2:     // getName->N:     // ofs = 53120 ord = 6 addr = 0
	aload_0_getfield com.whatsapp.field.ProgressAnimationField.field_53116   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_53116   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_53116   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_53116   // getName->1:     // getName->2:     // getName->N:     // ofs = 53116 ord = 5 addr = 0
	invokevirtual cancelInvokeLater( net.rim.device.api.system.Application, int ) // pc=2
	aload_0 
	bipush -1
	putfield com.whatsapp.field.ProgressAnimationField.field_53116   // get_name_1:  com.whatsapp.field.ProgressAnimationField.field_53116   // get_name_2:  com.whatsapp.field.ProgressAnimationField.field_53116   // get_Name:    com.whatsapp.field.ProgressAnimationField.field_53116   // getName->1:     // getName->2:     // getName->N:     // ofs = 53116 ord = 5 addr = 0
Label15:
	return 
	}

}
