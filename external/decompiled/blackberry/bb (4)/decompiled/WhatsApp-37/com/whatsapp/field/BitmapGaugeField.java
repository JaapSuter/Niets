// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-37.cod
// Module version  : 2.7.3204
// Class ID        : 0
// ########################################################


package com.whatsapp.field;


abstract public final class BitmapGaugeField extends net.rim.device.api.ui.Field

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.device.api.system.Bitmap /*net.rim.device.api.system.Bitmap*/  field_52614 ; // ofs = 52614 addr = 0)
	private net.rim.device.api.system.Bitmap /*net.rim.device.api.system.Bitmap*/  field_52618 ; // ofs = 52618 addr = 0)
	private net.rim.device.api.system.Bitmap /*net.rim.device.api.system.Bitmap*/  field_52622 ; // ofs = 52622 addr = 0)
	private net.rim.device.api.system.Bitmap /*net.rim.device.api.system.Bitmap*/  field_52626 ; // ofs = 52626 addr = 0)
	private int /*int*/  field_52630 ; // ofs = 52630 addr = 0)
	private int /*int*/  field_52634 ; // ofs = 52634 addr = 0)
	private int /*int*/  field_52638 ; // ofs = 52638 addr = 0)
	private int /*int*/  field_52642 ; // ofs = 52642 addr = 0)
	private int /*int*/  field_52646 ; // ofs = 52646 addr = 0)
	private int /*int*/  field_52650 ; // ofs = 52650 addr = 0)
	private int /*int*/  field_52654 ; // ofs = 52654 addr = 0)
	private boolean /*boolean*/  field_52658 ; // ofs = 52658 addr = 0)
	private boolean /*boolean*/  field_52662 ; // ofs = 52662 addr = 0)
	private int /*int*/  field_52666 ; // ofs = 52666 addr = 0)
	private int /*int*/  field_52670 ; // ofs = 52670 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.field.BitmapGaugeField, net.rim.device.api.system.Bitmap, net.rim.device.api.system.Bitmap, int, int, int, int, int, int, boolean ); // address: 0
	{
	enter 
	aload_0 
	lipush 36028797018963968
	invokespecial_lib net.rim.device.api.ui.Field.<init> // pc=3
	iload_3 
	iconst_1 
	if_icmpge Label11
	new_lib Exception//java.lang.Exception java.lang.Exception java.lang.Exception
	dup 
	invokespecial_lib java.lang.IllegalArgumentException.<init> // pc=1
	athrow 
Label11:
	iload_5 
	iflt Label19
	iload_6 
	iflt Label19
	iload_7 
	iflt Label19
	iload 8
	ifge Label23
Label19:
	new_lib Exception//java.lang.Exception java.lang.Exception java.lang.Exception
	dup 
	invokespecial_lib java.lang.IllegalArgumentException.<init> // pc=1
	athrow 
Label23:
	aload_0 
	aload_1 
	putfield com.whatsapp.field.BitmapGaugeField.field_52614   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52614   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52614   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52614   // getName->1:     // getName->2:     // getName->N:     // ofs = 52614 ord = 0 addr = 0
	aload_0 
	aload_2 
	putfield com.whatsapp.field.BitmapGaugeField.field_52618   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52618   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52618   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52618   // getName->1:     // getName->2:     // getName->N:     // ofs = 52618 ord = 1 addr = 0
	aload_0 
	iload 9
	putfield com.whatsapp.field.BitmapGaugeField.field_52662   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52662   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52662   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52662   // getName->1:     // getName->2:     // getName->N:     // ofs = 52662 ord = 12 addr = 0
	aload_0 
	iload_3 
	putfield com.whatsapp.field.BitmapGaugeField.field_52650   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52650   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52650   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52650   // getName->1:     // getName->2:     // getName->N:     // ofs = 52650 ord = 9 addr = 0
	aload_0 
	iload_4 
	putfield com.whatsapp.field.BitmapGaugeField.field_52654   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52654   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52654   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52654   // getName->1:     // getName->2:     // getName->N:     // ofs = 52654 ord = 10 addr = 0
	aload_0 
	iload_5 
	putfield com.whatsapp.field.BitmapGaugeField.field_52630   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52630   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52630   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52630   // getName->1:     // getName->2:     // getName->N:     // ofs = 52630 ord = 4 addr = 0
	aload_0 
	iload_6 
	putfield com.whatsapp.field.BitmapGaugeField.field_52634   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52634   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52634   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52634   // getName->1:     // getName->2:     // getName->N:     // ofs = 52634 ord = 5 addr = 0
	aload_0 
	iload_7 
	putfield com.whatsapp.field.BitmapGaugeField.field_52638   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52638   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52638   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52638   // getName->1:     // getName->2:     // getName->N:     // ofs = 52638 ord = 6 addr = 0
	aload_0 
	iload 8
	putfield com.whatsapp.field.BitmapGaugeField.field_52642   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52642   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52642   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52642   // getName->1:     // getName->2:     // getName->N:     // ofs = 52642 ord = 7 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52614   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52614   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52614   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52614   // getName->1:     // getName->2:     // getName->N:     // ofs = 52614 ord = 0 addr = 0
	invokevirtual boolean hasAlpha( net.rim.device.api.system.Bitmap ) // pc=1
	ifeq Label56
	bipush -97
	goto Label57
Label56:
	bipush -99
Label57:
	putfield com.whatsapp.field.BitmapGaugeField.field_52646   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52646   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52646   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52646   // getName->1:     // getName->2:     // getName->N:     // ofs = 52646 ord = 8 addr = 0
	aload_0 
	iconst_0 
	iload_4 
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52650   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52650   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52650   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52650   // getName->1:     // getName->2:     // getName->N:     // ofs = 52650 ord = 9 addr = 0
	invokestatic_lib int clamp( int, int, int ) // MathUtilities
	invokenonvirtual com.whatsapp.field.BitmapGaugeField.setValue // pc=2
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52662   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52662   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52662   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52662   // getName->1:     // getName->2:     // getName->N:     // ofs = 52662 ord = 12 addr = 0
	ifeq Label80
	aload_0 
	new_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	dup 
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52614   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52614   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52614   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52614   // getName->1:     // getName->2:     // getName->N:     // ofs = 52614 ord = 0 addr = 0
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52630   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52630   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52630   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52630   // getName->1:     // getName->2:     // getName->N:     // ofs = 52630 ord = 4 addr = 0
	isub 
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52634   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52634   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52634   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52634   // getName->1:     // getName->2:     // getName->N:     // ofs = 52634 ord = 5 addr = 0
	isub 
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52614   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52614   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52614   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52614   // getName->1:     // getName->2:     // getName->N:     // ofs = 52614 ord = 0 addr = 0
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	invokespecial_lib net.rim.device.api.system.Bitmap.<init> // pc=3
	putfield com.whatsapp.field.BitmapGaugeField.field_52622   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52622   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52622   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52622   // getName->1:     // getName->2:     // getName->N:     // ofs = 52622 ord = 2 addr = 0
	goto Label93
Label80:
	aload_0 
	new_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	dup 
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52614   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52614   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52614   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52614   // getName->1:     // getName->2:     // getName->N:     // ofs = 52614 ord = 0 addr = 0
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52614   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52614   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52614   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52614   // getName->1:     // getName->2:     // getName->N:     // ofs = 52614 ord = 0 addr = 0
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52630   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52630   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52630   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52630   // getName->1:     // getName->2:     // getName->N:     // ofs = 52630 ord = 4 addr = 0
	isub 
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52634   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52634   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52634   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52634   // getName->1:     // getName->2:     // getName->N:     // ofs = 52634 ord = 5 addr = 0
	isub 
	invokespecial_lib net.rim.device.api.system.Bitmap.<init> // pc=3
	putfield com.whatsapp.field.BitmapGaugeField.field_52622   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52622   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52622   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52622   // getName->1:     // getName->2:     // getName->N:     // ofs = 52622 ord = 2 addr = 0
Label93:
	aload_0 
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52622   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52622   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52622   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52622   // getName->1:     // getName->2:     // getName->N:     // ofs = 52622 ord = 2 addr = 0
	invokespecial com.whatsapp.field.BitmapGaugeField.routine_570 // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52614   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52614   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52614   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52614   // getName->1:     // getName->2:     // getName->N:     // ofs = 52614 ord = 0 addr = 0
	iload_5 
	iload_6 
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52622   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52622   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52622   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52622   // getName->1:     // getName->2:     // getName->N:     // ofs = 52622 ord = 2 addr = 0
	invokespecial com.whatsapp.field.BitmapGaugeField.routine_816 // pc=5
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52662   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52662   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52662   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52662   // getName->1:     // getName->2:     // getName->N:     // ofs = 52662 ord = 12 addr = 0
	ifeq Label118
	aload_0 
	new_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	dup 
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52618   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52618   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52618   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52618   // getName->1:     // getName->2:     // getName->N:     // ofs = 52618 ord = 1 addr = 0
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52638   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52638   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52638   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52638   // getName->1:     // getName->2:     // getName->N:     // ofs = 52638 ord = 6 addr = 0
	isub 
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52642   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52642   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52642   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52642   // getName->1:     // getName->2:     // getName->N:     // ofs = 52642 ord = 7 addr = 0
	isub 
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52618   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52618   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52618   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52618   // getName->1:     // getName->2:     // getName->N:     // ofs = 52618 ord = 1 addr = 0
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	invokespecial_lib net.rim.device.api.system.Bitmap.<init> // pc=3
	putfield com.whatsapp.field.BitmapGaugeField.field_52626   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52626   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52626   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52626   // getName->1:     // getName->2:     // getName->N:     // ofs = 52626 ord = 3 addr = 0
	goto Label131
Label118:
	aload_0 
	new_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	dup 
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52618   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52618   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52618   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52618   // getName->1:     // getName->2:     // getName->N:     // ofs = 52618 ord = 1 addr = 0
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52618   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52618   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52618   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52618   // getName->1:     // getName->2:     // getName->N:     // ofs = 52618 ord = 1 addr = 0
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52638   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52638   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52638   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52638   // getName->1:     // getName->2:     // getName->N:     // ofs = 52638 ord = 6 addr = 0
	isub 
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52642   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52642   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52642   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52642   // getName->1:     // getName->2:     // getName->N:     // ofs = 52642 ord = 7 addr = 0
	isub 
	invokespecial_lib net.rim.device.api.system.Bitmap.<init> // pc=3
	putfield com.whatsapp.field.BitmapGaugeField.field_52626   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52626   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52626   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52626   // getName->1:     // getName->2:     // getName->N:     // ofs = 52626 ord = 3 addr = 0
Label131:
	aload_0 
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52626   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52626   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52626   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52626   // getName->1:     // getName->2:     // getName->N:     // ofs = 52626 ord = 3 addr = 0
	invokespecial com.whatsapp.field.BitmapGaugeField.routine_570 // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52618   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52618   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52618   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52618   // getName->1:     // getName->2:     // getName->N:     // ofs = 52618 ord = 1 addr = 0
	iload_7 
	iload 8
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52626   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52626   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52626   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52626   // getName->1:     // getName->2:     // getName->N:     // ofs = 52626 ord = 3 addr = 0
	invokespecial com.whatsapp.field.BitmapGaugeField.routine_816 // pc=5
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.field.BitmapGaugeField.routine_570( com.whatsapp.field.BitmapGaugeField, net.rim.device.api.system.Bitmap ); // address: 0
	{
	enter_narrow 
	new_lib net.rim.device.api.ui.decor.Background//net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background
	dup 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.Graphics.<init> // pc=2
	astore_2 
	aload_2 
	iconst_0 
	invokevirtual setGlobalAlpha( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_2 
	invokevirtual clear( net.rim.device.api.ui.Graphics ) // pc=1
	return 
	}


private final com.whatsapp.field.BitmapGaugeField.routine_608( com.whatsapp.field.BitmapGaugeField, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52666   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52666   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52666   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52666   // getName->1:     // getName->2:     // getName->N:     // ofs = 52666 ord = 13 addr = 0
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52654   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52654   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52654   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52654   // getName->1:     // getName->2:     // getName->N:     // ofs = 52654 ord = 10 addr = 0
	imul 
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52650   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52650   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52650   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52650   // getName->1:     // getName->2:     // getName->N:     // ofs = 52650 ord = 9 addr = 0
	idiv 
	istore_2 
	aload_0 
	aload_1 
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52614   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52614   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52614   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52614   // getName->1:     // getName->2:     // getName->N:     // ofs = 52614 ord = 0 addr = 0
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52622   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52622   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52622   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52622   // getName->1:     // getName->2:     // getName->N:     // ofs = 52622 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52630   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52630   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52630   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52630   // getName->1:     // getName->2:     // getName->N:     // ofs = 52630 ord = 4 addr = 0
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52634   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52634   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52634   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52634   // getName->1:     // getName->2:     // getName->N:     // ofs = 52634 ord = 5 addr = 0
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52666   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52666   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52666   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52666   // getName->1:     // getName->2:     // getName->N:     // ofs = 52666 ord = 13 addr = 0
	invokespecial com.whatsapp.field.BitmapGaugeField.routine_664 // pc=7
	aload_0 
	aload_1 
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52618   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52618   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52618   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52618   // getName->1:     // getName->2:     // getName->N:     // ofs = 52618 ord = 1 addr = 0
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52626   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52626   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52626   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52626   // getName->1:     // getName->2:     // getName->N:     // ofs = 52626 ord = 3 addr = 0
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52638   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52638   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52638   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52638   // getName->1:     // getName->2:     // getName->N:     // ofs = 52638 ord = 6 addr = 0
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52642   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52642   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52642   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52642   // getName->1:     // getName->2:     // getName->N:     // ofs = 52642 ord = 7 addr = 0
	iload_2 
	invokespecial com.whatsapp.field.BitmapGaugeField.routine_664 // pc=7
	return 
	}


private final com.whatsapp.field.BitmapGaugeField.routine_664( com.whatsapp.field.BitmapGaugeField, net.rim.device.api.ui.Graphics, net.rim.device.api.system.Bitmap, net.rim.device.api.system.Bitmap, int, int, int ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52670   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52670   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52670   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52670   // getName->1:     // getName->2:     // getName->N:     // ofs = 52670 ord = 14 addr = 0
	aload_2 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	isub 
	iconst_1 
	ishr 
	istore_7 
	iload_6 
	iload_4 
	iload_5 
	iadd 
	invokestatic_lib int max( int, int ) // Math
	istore_6 
	aload_1 
	iconst_0 
	iload_7 
	iload_4 
	aload_2 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	aload_2 
	iconst_0 
	iconst_0 
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=8
	aload_1 
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52646   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52646   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52646   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52646   // getName->1:     // getName->2:     // getName->N:     // ofs = 52646 ord = 8 addr = 0
	iload_4 
	iload_7 
	iconst_0 
	iload_6 
	iload_4 
	isub 
	iload_5 
	isub 
	invokestatic_lib int max( int, int ) // Math
	aload_3 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	aload_3 
	iconst_0 
	iconst_0 
	invokevirtual tileRop( net.rim.device.api.ui.Graphics, int, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=9
	aload_1 
	iload_6 
	iload_5 
	isub 
	iload_7 
	iload_5 
	aload_2 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	aload_2 
	aload_2 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	iload_5 
	isub 
	iconst_0 
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=8
	return 
	}


private final com.whatsapp.field.BitmapGaugeField.routine_764( com.whatsapp.field.BitmapGaugeField, net.rim.device.api.ui.Graphics ); // address: 0
	{
	noenter_return 
	}


private final boolean com.whatsapp.field.BitmapGaugeField.routine_774( com.whatsapp.field.BitmapGaugeField ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual boolean isEditable( net.rim.device.api.ui.Field ) // pc=1
	ifeq Label15
	aload_0 
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52658   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52658   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52658   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52658   // getName->1:     // getName->2:     // getName->N:     // ofs = 52658 ord = 11 addr = 0
	ifne Label9
	iconst_1 
	goto Label10
Label9:
	iconst_0 
Label10:
	putfield com.whatsapp.field.BitmapGaugeField.field_52658   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52658   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52658   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52658   // getName->1:     // getName->2:     // getName->N:     // ofs = 52658 ord = 11 addr = 0
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Field ) // pc=1
	iconst_1 
	ireturn 
Label15:
	iconst_0 
	ireturn 
	}


private final com.whatsapp.field.BitmapGaugeField.routine_816( com.whatsapp.field.BitmapGaugeField, net.rim.device.api.system.Bitmap, int, int, net.rim.device.api.system.Bitmap ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	istore_5 
	aload_1 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	istore_6 
	iload_2 
	iload_3 
	iadd 
	istore_7 
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52662   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52662   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52662   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52662   // getName->1:     // getName->2:     // getName->N:     // ofs = 52662 ord = 12 addr = 0
	ifeq Label24
	aload_0 
	aload_1 
	iload_2 
	iconst_0 
	iload_6 
	iload_7 
	isub 
	iload_5 
	aload_4 
	invokespecial com.whatsapp.field.BitmapGaugeField.routine_887 // pc=7
	return 
Label24:
	aload_0 
	aload_1 
	iconst_0 
	iload_2 
	iload_6 
	iload_5 
	iload_7 
	isub 
	aload_4 
	invokespecial com.whatsapp.field.BitmapGaugeField.routine_887 // pc=7
	return 
	}


private final com.whatsapp.field.BitmapGaugeField.routine_887( com.whatsapp.field.BitmapGaugeField, net.rim.device.api.system.Bitmap, int, int, int, int, net.rim.device.api.system.Bitmap ); // address: 0
	{
	enter 
	iload_4 
	iload_5 
	imul 
	newarray 5
	astore_7 
	aload_1 
	aload_7 
	iconst_0 
	iload_4 
	iload_2 
	iload_3 
	iload_4 
	iload_5 
	invokevirtual getARGB( net.rim.device.api.system.Bitmap, int[], int, int, int, int, int, int ) // pc=8
	iconst_0 
	istore 8
Label17:
	iload 8
	aload_6 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	if_icmpge Label46
	iconst_0 
	istore 9
Label23:
	iload 9
	aload_6 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	if_icmpge Label41
	aload_6 
	aload_7 
	iconst_0 
	iload_4 
	iload 8
	iload 9
	iload_4 
	iload_5 
	invokevirtual setARGB( net.rim.device.api.system.Bitmap, int[], int, int, int, int, int, int ) // pc=8
	iload 9
	iload_5 
	iadd 
	istore 9
	goto Label23
Label41:
	iload 8
	iload_4 
	iadd 
	istore 8
	goto Label17
Label46:
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final setValue( com.whatsapp.field.BitmapGaugeField, int ); // address: 0
	{
	enter_narrow 
	iload_1 
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52650   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52650   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52650   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52650   // getName->1:     // getName->2:     // getName->N:     // ofs = 52650 ord = 9 addr = 0
	if_icmple Label8
	new_lib Exception//java.lang.Exception java.lang.Exception java.lang.Exception
	dup 
	invokespecial_lib java.lang.IllegalArgumentException.<init> // pc=1
	athrow 
Label8:
	aload_0 
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52662   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52662   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52662   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52662   // getName->1:     // getName->2:     // getName->N:     // ofs = 52662 ord = 12 addr = 0
	ifeq Label13
	iload_1 
	goto Label16
Label13:
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52650   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52650   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52650   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52650   // getName->1:     // getName->2:     // getName->N:     // ofs = 52650 ord = 9 addr = 0
	iload_1 
	isub 
Label16:
	putfield com.whatsapp.field.BitmapGaugeField.field_52654   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52654   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52654   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52654   // getName->1:     // getName->2:     // getName->N:     // ofs = 52654 ord = 10 addr = 0
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Field ) // pc=1
	return 
	}


public final int getValue( com.whatsapp.field.BitmapGaugeField ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52662   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52662   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52662   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52662   // getName->1:     // getName->2:     // getName->N:     // ofs = 52662 ord = 12 addr = 0
	ifeq Label5
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52654   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52654   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52654   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52654   // getName->1:     // getName->2:     // getName->N:     // ofs = 52654 ord = 10 addr = 0
	ireturn 
Label5:
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52650   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52650   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52650   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52650   // getName->1:     // getName->2:     // getName->N:     // ofs = 52650 ord = 9 addr = 0
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52654   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52654   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52654   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52654   // getName->1:     // getName->2:     // getName->N:     // ofs = 52654 ord = 10 addr = 0
	isub 
	ireturn 
	}


public final int getPreferredWidth( com.whatsapp.field.BitmapGaugeField ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52662   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52662   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52662   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52662   // getName->1:     // getName->2:     // getName->N:     // ofs = 52662 ord = 12 addr = 0
	ifeq Label5
	invokestatic_lib int getWidth(  ) // Display
	ireturn 
Label5:
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52614   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52614   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52614   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52614   // getName->1:     // getName->2:     // getName->N:     // ofs = 52614 ord = 0 addr = 0
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52618   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52618   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52618   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52618   // getName->1:     // getName->2:     // getName->N:     // ofs = 52618 ord = 1 addr = 0
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	invokestatic_lib int max( int, int ) // Math
	ireturn 
	}


public final int getPreferredHeight( com.whatsapp.field.BitmapGaugeField ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52662   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52662   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52662   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52662   // getName->1:     // getName->2:     // getName->N:     // ofs = 52662 ord = 12 addr = 0
	ifeq Label9
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52614   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52614   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52614   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52614   // getName->1:     // getName->2:     // getName->N:     // ofs = 52614 ord = 0 addr = 0
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52618   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52618   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52618   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52618   // getName->1:     // getName->2:     // getName->N:     // ofs = 52618 ord = 1 addr = 0
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	invokestatic_lib int max( int, int ) // Math
	ireturn 
Label9:
	invokestatic_lib int getHeight(  ) // Display
	ireturn 
	}


protected final layout( com.whatsapp.field.BitmapGaugeField, int, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_0 
	invokenonvirtual com.whatsapp.field.BitmapGaugeField.getPreferredWidth // pc=1
	iload_1 
	invokestatic_lib int min( int, int ) // Math
	putfield com.whatsapp.field.BitmapGaugeField.field_52666   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52666   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52666   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52666   // getName->1:     // getName->2:     // getName->N:     // ofs = 52666 ord = 13 addr = 0
	aload_0 
	aload_0 
	invokenonvirtual com.whatsapp.field.BitmapGaugeField.getPreferredHeight // pc=1
	iload_2 
	invokestatic_lib int min( int, int ) // Math
	putfield com.whatsapp.field.BitmapGaugeField.field_52670   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52670   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52670   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52670   // getName->1:     // getName->2:     // getName->N:     // ofs = 52670 ord = 14 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52666   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52666   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52666   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52666   // getName->1:     // getName->2:     // getName->N:     // ofs = 52666 ord = 13 addr = 0
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52670   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52670   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52670   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52670   // getName->1:     // getName->2:     // getName->N:     // ofs = 52670 ord = 14 addr = 0
	invokevirtual setExtent( net.rim.device.api.ui.Field, int, int ) // pc=3
	return 
	}


protected final boolean navigationMovement( com.whatsapp.field.BitmapGaugeField, int, int, int, int ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52658   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52658   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52658   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52658   // getName->1:     // getName->2:     // getName->N:     // ofs = 52658 ord = 11 addr = 0
	ifeq Label33
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52662   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52662   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52662   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52662   // getName->1:     // getName->2:     // getName->N:     // ofs = 52662 ord = 12 addr = 0
	ifeq Label7
	iload_1 
	ifgt Label11
Label7:
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52662   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52662   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52662   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52662   // getName->1:     // getName->2:     // getName->N:     // ofs = 52662 ord = 12 addr = 0
	ifne Label18
	iload_2 
	ifge Label18
Label11:
	aload_0 
	invokenonvirtual com.whatsapp.field.BitmapGaugeField.incrementState // pc=1
	aload_0 
	iconst_0 
	invokevirtual fieldChangeNotify( net.rim.device.api.ui.Field, int ) // pc=2
	iconst_1 
	ireturn 
Label18:
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52662   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52662   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52662   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52662   // getName->1:     // getName->2:     // getName->N:     // ofs = 52662 ord = 12 addr = 0
	ifeq Label22
	iload_1 
	iflt Label26
Label22:
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52662   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52662   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52662   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52662   // getName->1:     // getName->2:     // getName->N:     // ofs = 52662 ord = 12 addr = 0
	ifne Label33
	iload_2 
	ifle Label33
Label26:
	aload_0 
	invokenonvirtual com.whatsapp.field.BitmapGaugeField.decrementState // pc=1
	aload_0 
	iconst_0 
	invokevirtual fieldChangeNotify( net.rim.device.api.ui.Field, int ) // pc=2
	iconst_1 
	ireturn 
Label33:
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	iload_4 
	invokespecial_lib net.rim.device.api.ui.Field.navigationMovement // pc=5
	ireturn 
	}


public final paint( com.whatsapp.field.BitmapGaugeField, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52662   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52662   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52662   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52662   // getName->1:     // getName->2:     // getName->N:     // ofs = 52662 ord = 12 addr = 0
	ifeq Label7
	aload_0 
	aload_1 
	invokespecial com.whatsapp.field.BitmapGaugeField.routine_608 // pc=2
	return 
Label7:
	aload_0 
	aload_1 
	invokespecial com.whatsapp.field.BitmapGaugeField.routine_764 // pc=2
	return 
	}


protected final paintBackground( com.whatsapp.field.BitmapGaugeField, net.rim.device.api.ui.Graphics ); // address: 0
	{
	noenter_return 
	}


protected final drawFocus( com.whatsapp.field.BitmapGaugeField, net.rim.device.api.ui.Graphics, boolean ); // address: 0
	{
	enter 
	aload_1 
	bipush 8
	invokevirtual boolean isDrawingStyleSet( net.rim.device.api.ui.Graphics, int ) // pc=2
	istore_3 
	iload_2 
	ifeq Label11
	aload_1 
	bipush 8
	iconst_1 
	invokevirtual setDrawingStyle( net.rim.device.api.ui.Graphics, int, boolean ) // pc=3
Label11:
	aload_0 
	aload_1 
	invokenonvirtual com.whatsapp.field.BitmapGaugeField.paintBackground // pc=2
	aload_0 
	aload_1 
	invokenonvirtual com.whatsapp.field.BitmapGaugeField.paint // pc=2
	aload_1 
	bipush 8
	iload_3 
	invokevirtual setDrawingStyle( net.rim.device.api.ui.Graphics, int, boolean ) // pc=3
	return 
	astore_4 
	aload_1 
	bipush 8
	iload_3 
	invokevirtual setDrawingStyle( net.rim.device.api.ui.Graphics, int, boolean ) // pc=3
	aload_4 
	athrow 
	}


public final decrementState( com.whatsapp.field.BitmapGaugeField ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokenonvirtual com.whatsapp.field.BitmapGaugeField.getValue // pc=1
	istore_1 
	iload_1 
	ifle Label13
	aload_0 
	iload_1 
	iconst_1 
	isub 
	invokenonvirtual com.whatsapp.field.BitmapGaugeField.setValue // pc=2
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Field ) // pc=1
Label13:
	return 
	}


public final incrementState( com.whatsapp.field.BitmapGaugeField ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokenonvirtual com.whatsapp.field.BitmapGaugeField.getValue // pc=1
	istore_1 
	iload_1 
	aload_0_getfield com.whatsapp.field.BitmapGaugeField.field_52650   // get_name_1:  com.whatsapp.field.BitmapGaugeField.field_52650   // get_name_2:  com.whatsapp.field.BitmapGaugeField.field_52650   // get_Name:    com.whatsapp.field.BitmapGaugeField.field_52650   // getName->1:     // getName->2:     // getName->N:     // ofs = 52650 ord = 9 addr = 0
	if_icmpge Label14
	aload_0 
	iload_1 
	iconst_1 
	iadd 
	invokenonvirtual com.whatsapp.field.BitmapGaugeField.setValue // pc=2
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Field ) // pc=1
Label14:
	return 
	}


protected final boolean invokeAction( com.whatsapp.field.BitmapGaugeField, int ); // address: 0
	{
	enter_narrow 
	iload_1 
Label3:
	aload_0 
	invokespecial com.whatsapp.field.BitmapGaugeField.routine_774 // pc=1
	ifeq Label8
	iconst_1 
	ireturn 
Label8:
	iconst_0 
	ireturn 
	}


protected final boolean keyChar( com.whatsapp.field.BitmapGaugeField, char, int, int ); // address: 0
	{
	enter 
	iload_1 
	bipush 32
	if_icmpeq Label7
	iload_1 
	bipush 10
	if_icmpne Label12
Label7:
	aload_0 
	invokespecial com.whatsapp.field.BitmapGaugeField.routine_774 // pc=1
	ifeq Label12
	iconst_1 
	ireturn 
Label12:
	iconst_0 
	ireturn 
	}


protected final boolean trackwheelClick( com.whatsapp.field.BitmapGaugeField, int, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial com.whatsapp.field.BitmapGaugeField.routine_774 // pc=1
	ifeq Label6
	iconst_1 
	ireturn 
Label6:
	aload_0 
	iload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.Field.trackwheelClick // pc=3
	ireturn 
	}

}
