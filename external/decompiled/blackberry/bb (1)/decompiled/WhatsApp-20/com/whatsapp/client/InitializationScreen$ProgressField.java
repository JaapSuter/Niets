// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-20.cod
// Module version  : 2.7.3204
// Class ID        : 11
// ########################################################


package com.whatsapp.client;


abstract final class InitializationScreen$ProgressField extends net.rim.device.api.ui.Manager

{

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

protected <init>( com.whatsapp.client.InitializationScreen$ProgressField, com.whatsapp.client.InitializationScreen, long ); // address: 0
	{
	enter 
	aload_0 
	lload 2
	invokespecial_lib net.rim.device.api.ui.Manager.<init> // pc=3
	aload_0 
	aload_1 
	putfield com.whatsapp.client.InitializationScreen$ProgressField.field_53666   // get_name_1:  com.whatsapp.client.InitializationScreen$ProgressField.field_53666   // get_name_2:  com.whatsapp.client.InitializationScreen$ProgressField.field_53666   // get_Name:    com.whatsapp.client.InitializationScreen$ProgressField.field_53666   // getName->1:     // getName->2:     // getName->N:     // ofs = 53666 ord = 4 addr = 0
	aload_0 
	iconst_0 
	putfield inProgress   // get_name_1:  inProgress   // get_name_2:  inProgress   // get_Name:    inProgress   // getName->1:  inProgress   // getName->2:  inProgress   // getName->N:  inProgress   // ofs = 53650 ord = 0 addr = 0
	aload_0 
	iconst_0 
	putfield complete   // get_name_1:  complete   // get_name_2:  complete   // get_Name:    complete   // getName->1:  complete   // getName->2:  complete   // getName->N:  complete   // ofs = 53654 ord = 1 addr = 0
	aload_0 
	ldc literal_53:"bb-init-circle.png"
	invokestatic_lib net.rim.device.api.system.Bitmap getBitmapResource( java.lang.String ) // Bitmap
	putfield background   // get_name_1:  background   // get_name_2:  background   // get_Name:    background   // getName->1:  background   // getName->2:  background   // getName->N:  background   // ofs = 53658 ord = 2 addr = 0
	aload_0 
	invokespecial com.whatsapp.client.InitializationScreen$ProgressField.routine_5886 // pc=1
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.InitializationScreen$ProgressField.routine_5886( com.whatsapp.client.InitializationScreen$ProgressField ); // address: 0
	{
	enter 
	aload_0_getfield inProgress   // get_name_1:  inProgress   // get_name_2:  inProgress   // get_Name:    inProgress   // getName->1:  inProgress   // getName->2:  inProgress   // getName->N:  inProgress   // ofs = 53650 ord = 0 addr = 0
	ifeq Label17
	aload_0_getfield complete   // get_name_1:  complete   // get_name_2:  complete   // get_Name:    complete   // getName->1:  complete   // getName->2:  complete   // getName->N:  complete   // ofs = 53654 ord = 1 addr = 0
	ifne Label17
	aload_0_getfield progressField   // get_name_1:  progressField   // get_name_2:  progressField   // get_Name:    progressField   // getName->1:  progressField   // getName->2:  progressField   // getName->N:  progressField   // ofs = 53662 ord = 3 addr = 0
	ifnonnull Label24
	aload_0 
	new_lib com.whatsapp.field.ProgressAnimationField//module:WhatsApp-37.class#9 module:WhatsApp-37.class#9 module:WhatsApp-37.class#9
	dup 
	lipush 51539607552
	invokespecial_lib .routine_2771 // pc=3
	putfield progressField   // get_name_1:  progressField   // get_name_2:  progressField   // get_Name:    progressField   // getName->1:  progressField   // getName->2:  progressField   // getName->N:  progressField   // ofs = 53662 ord = 3 addr = 0
	aload_0 
	aload_0_getfield progressField   // get_name_1:  progressField   // get_name_2:  progressField   // get_Name:    progressField   // getName->1:  progressField   // getName->2:  progressField   // getName->N:  progressField   // ofs = 53662 ord = 3 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	return 
Label17:
	aload_0 
	invokevirtual deleteAll( net.rim.device.api.ui.Manager ) // pc=1
	aload_0 
	aconst_null 
	putfield progressField   // get_name_1:  progressField   // get_name_2:  progressField   // get_Name:    progressField   // getName->1:  progressField   // getName->2:  progressField   // getName->N:  progressField   // ofs = 53662 ord = 3 addr = 0
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Manager ) // pc=1
Label24:
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final setInProgress( com.whatsapp.client.InitializationScreen$ProgressField, boolean ); // address: 0
	{
	enter_narrow 
	iload_1 
	aload_0_getfield inProgress   // get_name_1:  inProgress   // get_name_2:  inProgress   // get_Name:    inProgress   // getName->1:  inProgress   // getName->2:  inProgress   // getName->N:  inProgress   // ofs = 53650 ord = 0 addr = 0
	if_icmpeq Label9
	aload_0 
	iload_1 
	putfield inProgress   // get_name_1:  inProgress   // get_name_2:  inProgress   // get_Name:    inProgress   // getName->1:  inProgress   // getName->2:  inProgress   // getName->N:  inProgress   // ofs = 53650 ord = 0 addr = 0
	aload_0 
	invokespecial com.whatsapp.client.InitializationScreen$ProgressField.routine_5886 // pc=1
Label9:
	return 
	}


public final setComplete( com.whatsapp.client.InitializationScreen$ProgressField, boolean ); // address: 0
	{
	enter_narrow 
	iload_1 
	aload_0_getfield complete   // get_name_1:  complete   // get_name_2:  complete   // get_Name:    complete   // getName->1:  complete   // getName->2:  complete   // getName->N:  complete   // ofs = 53654 ord = 1 addr = 0
	if_icmpeq Label9
	aload_0 
	iload_1 
	putfield complete   // get_name_1:  complete   // get_name_2:  complete   // get_Name:    complete   // getName->1:  complete   // getName->2:  complete   // getName->N:  complete   // ofs = 53654 ord = 1 addr = 0
	aload_0 
	invokespecial com.whatsapp.client.InitializationScreen$ProgressField.routine_5886 // pc=1
Label9:
	return 
	}


public final int getPreferredWidth( com.whatsapp.client.InitializationScreen$ProgressField ); // address: 0
	{
	enter_narrow 
	aload_0_getfield background   // get_name_1:  background   // get_name_2:  background   // get_Name:    background   // getName->1:  background   // getName->2:  background   // getName->N:  background   // ofs = 53658 ord = 2 addr = 0
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	ireturn 
	}


public final int getPreferredHeight( com.whatsapp.client.InitializationScreen$ProgressField ); // address: 0
	{
	enter_narrow 
	aload_0_getfield background   // get_name_1:  background   // get_name_2:  background   // get_Name:    background   // getName->1:  background   // getName->2:  background   // getName->N:  background   // ofs = 53658 ord = 2 addr = 0
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	ireturn 
	}


protected final sublayout( com.whatsapp.client.InitializationScreen$ProgressField, int, int ); // address: 0
	{
	enter 
	aload_0 
	iload_1 
	aload_0_getfield background   // get_name_1:  background   // get_name_2:  background   // get_Name:    background   // getName->1:  background   // getName->2:  background   // getName->N:  background   // ofs = 53658 ord = 2 addr = 0
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	invokestatic_lib int min( int, int ) // Math
	iload_2 
	aload_0_getfield background   // get_name_1:  background   // get_name_2:  background   // get_Name:    background   // getName->1:  background   // getName->2:  background   // getName->N:  background   // ofs = 53658 ord = 2 addr = 0
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	invokestatic_lib int min( int, int ) // Math
	invokevirtual setExtent( net.rim.device.api.ui.Field, int, int ) // pc=3
	iconst_0 
	istore_3 
Label13:
	iload_3 
	aload_0 
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	if_icmpge Label47
	aload_0 
	iload_3 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	astore_4 
	aload_0 
	aload_4 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	invokevirtual layoutChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
	aload_0 
	aload_4 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	aload_4 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	isub 
	bipush 2
	idiv 
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	aload_4 
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	isub 
	bipush 2
	idiv 
	invokevirtual setPositionChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
	iinc 3 1
	goto Label13
Label47:
	return 
	}


protected final paint( com.whatsapp.client.InitializationScreen$ProgressField, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter 
	aload_1 
	iconst_0 
	iconst_0 
	aload_0_getfield background   // get_name_1:  background   // get_name_2:  background   // get_Name:    background   // getName->1:  background   // getName->2:  background   // getName->N:  background   // ofs = 53658 ord = 2 addr = 0
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_0_getfield background   // get_name_1:  background   // get_name_2:  background   // get_Name:    background   // getName->1:  background   // getName->2:  background   // getName->N:  background   // ofs = 53658 ord = 2 addr = 0
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	aload_0_getfield background   // get_name_1:  background   // get_name_2:  background   // get_Name:    background   // getName->1:  background   // getName->2:  background   // getName->N:  background   // ofs = 53658 ord = 2 addr = 0
	iconst_0 
	iconst_0 
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=8
	aload_0_getfield complete   // get_name_1:  complete   // get_name_2:  complete   // get_Name:    complete   // getName->1:  complete   // getName->2:  complete   // getName->N:  complete   // ofs = 53654 ord = 1 addr = 0
	ifeq Label44
	ldc literal_52:"bb-init-checkmark.png"
	invokestatic_lib net.rim.device.api.system.Bitmap getBitmapResource( java.lang.String ) // Bitmap
	astore_2 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	aload_2 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	isub 
	bipush 2
	idiv 
	istore_3 
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	aload_2 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	isub 
	bipush 2
	idiv 
	istore_4 
	aload_1 
	iload_3 
	iload_4 
	aload_2 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_2 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	aload_2 
	iconst_0 
	iconst_0 
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=8
Label44:
	aload_0 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.Manager.paint // pc=2
	return 
	}

}
