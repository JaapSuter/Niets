// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-19.cod
// Module version  : 2.7.3204
// Class ID        : 4
// ########################################################


package com.whatsapp.client;


abstract public final class IconTextListField extends com.whatsapp.client.NonCachingListField
implements net.rim.device.api.ui.component.ListFieldCallback, com.whatsapp.client.

{

	// @@@@@@@@@@@@@ Fields 
	private com.whatsapp.client.IconTextListField$Item /*module:WhatsApp-18.class#31[]*/  field_52916 ; // ofs = 52916 addr = 0)
	private net.rim.device.api.ui.Font /*net.rim.device.api.ui.Font*/  field_52920 ; // ofs = 52920 addr = 0)
	private net.rim.device.api.ui.Font /*net.rim.device.api.ui.Font*/  field_52924 ; // ofs = 52924 addr = 0)
	private boolean /*boolean*/  field_52928 ; // ofs = 52928 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.IconTextListField, module:WhatsApp-18.class#31[] ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib .routine_851 // pc=1
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.IconTextListField.field_52928   // get_name_1:  com.whatsapp.client.IconTextListField.field_52928   // get_name_2:  com.whatsapp.client.IconTextListField.field_52928   // get_Name:    com.whatsapp.client.IconTextListField.field_52928   // getName->1:     // getName->2:     // getName->N:     // ofs = 52928 ord = 3 addr = 0
	aload_0 
	aload_1 
	putfield com.whatsapp.client.IconTextListField.field_52916   // get_name_1:  com.whatsapp.client.IconTextListField.field_52916   // get_name_2:  com.whatsapp.client.IconTextListField.field_52916   // get_Name:    com.whatsapp.client.IconTextListField.field_52916   // getName->1:     // getName->2:     // getName->N:     // ofs = 52916 ord = 0 addr = 0
	aload_0 
	aload_1 
	arraylength 
	invokevirtual setSize( net.rim.device.api.ui.component.ListField, int ) // pc=2
	aload_0 
	aload_0 
	invokespecial com.whatsapp.client.IconTextListField.routine_4233 // pc=1
	invokevirtual setRowHeight( net.rim.device.api.ui.component.ListField, int ) // pc=2
	aload_0 
	aload_0 
	invokenonvirtual_lib .routine_439 // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.IconTextListField.routine_4196( com.whatsapp.client.IconTextListField ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual int getSelectedIndex( net.rim.device.api.ui.component.ListField ) // pc=1
	istore_1 
	iload_1 
	iflt Label14
	iload_1 
	aload_0_getfield com.whatsapp.client.IconTextListField.field_52916   // get_name_1:  com.whatsapp.client.IconTextListField.field_52916   // get_name_2:  com.whatsapp.client.IconTextListField.field_52916   // get_Name:    com.whatsapp.client.IconTextListField.field_52916   // getName->1:     // getName->2:     // getName->N:     // ofs = 52916 ord = 0 addr = 0
	arraylength 
	if_icmpge Label14
	aload_0_getfield com.whatsapp.client.IconTextListField.field_52916   // get_name_1:  com.whatsapp.client.IconTextListField.field_52916   // get_name_2:  com.whatsapp.client.IconTextListField.field_52916   // get_Name:    com.whatsapp.client.IconTextListField.field_52916   // getName->1:     // getName->2:     // getName->N:     // ofs = 52916 ord = 0 addr = 0
	iload_1 
	aaload 
	invokevirtual_short .virtual_3 // idx=3 pc=1
Label14:
	return 
	}


private final int com.whatsapp.client.IconTextListField.routine_4233( com.whatsapp.client.IconTextListField ); // address: 0
	{
	enter 
	aload_0 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	putfield com.whatsapp.client.IconTextListField.field_52920   // get_name_1:  com.whatsapp.client.IconTextListField.field_52920   // get_name_2:  com.whatsapp.client.IconTextListField.field_52920   // get_Name:    com.whatsapp.client.IconTextListField.field_52920   // getName->1:     // getName->2:     // getName->N:     // ofs = 52920 ord = 1 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.IconTextListField.field_52920   // get_name_1:  com.whatsapp.client.IconTextListField.field_52920   // get_name_2:  com.whatsapp.client.IconTextListField.field_52920   // get_Name:    com.whatsapp.client.IconTextListField.field_52920   // getName->1:     // getName->2:     // getName->N:     // ofs = 52920 ord = 1 addr = 0
	iconst_0 
	aload_0_getfield com.whatsapp.client.IconTextListField.field_52920   // get_name_1:  com.whatsapp.client.IconTextListField.field_52920   // get_name_2:  com.whatsapp.client.IconTextListField.field_52920   // get_Name:    com.whatsapp.client.IconTextListField.field_52920   // getName->1:     // getName->2:     // getName->N:     // ofs = 52920 ord = 1 addr = 0
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	bipush 70
	imul 
	bipush 100
	idiv 
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int, int ) // pc=3
	putfield com.whatsapp.client.IconTextListField.field_52924   // get_name_1:  com.whatsapp.client.IconTextListField.field_52924   // get_name_2:  com.whatsapp.client.IconTextListField.field_52924   // get_Name:    com.whatsapp.client.IconTextListField.field_52924   // getName->1:     // getName->2:     // getName->N:     // ofs = 52924 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.client.IconTextListField.field_52924   // get_name_1:  com.whatsapp.client.IconTextListField.field_52924   // get_name_2:  com.whatsapp.client.IconTextListField.field_52924   // get_Name:    com.whatsapp.client.IconTextListField.field_52924   // getName->1:     // getName->2:     // getName->N:     // ofs = 52924 ord = 2 addr = 0
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	istore_1 
	bipush 6
	aload_0_getfield com.whatsapp.client.IconTextListField.field_52920   // get_name_1:  com.whatsapp.client.IconTextListField.field_52920   // get_name_2:  com.whatsapp.client.IconTextListField.field_52920   // get_Name:    com.whatsapp.client.IconTextListField.field_52920   // getName->1:     // getName->2:     // getName->N:     // ofs = 52920 ord = 1 addr = 0
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	iadd 
	iload_1 
	iadd 
	iload_1 
	iadd 
	bipush 6
	iadd 
	ireturn 
	}


private final int com.whatsapp.client.IconTextListField.routine_4302( com.whatsapp.client.IconTextListField, net.rim.device.api.ui.Graphics, int, int, int, boolean, int ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual int getColor( net.rim.device.api.ui.Graphics ) // pc=1
	istore_7 
	iipush 13817047
	istore 8
	aload_0 
	invokevirtual int getSize( net.rim.device.api.ui.component.ListField ) // pc=1
	bipush 3
	if_icmpgt Label36
	aload_1 
	iload 8
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	iload_2 
	ifne Label21
	aload_1 
	iconst_0 
	iload_3 
	iload_4 
	iload_3 
	invokevirtual drawLine( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
Label21:
	aload_1 
	iconst_0 
	iload_3 
	iload_6 
	iadd 
	iconst_1 
	isub 
	iload_4 
	iload_3 
	iload_6 
	iadd 
	iconst_1 
	isub 
	invokevirtual drawLine( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	goto Label85
Label36:
	iload_5 
	ifne Label85
	iload_2 
	bipush 2
	irem 
	ifne Label44
	iipush 16777215
	goto Label45
Label44:
	iipush 15987699
Label45:
	istore 9
	aload_1 
	iload 9
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	iconst_0 
	iload_3 
	iload_4 
	iload_6 
	invokevirtual fillRect( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	aload_1 
	iipush 16777215
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	iconst_0 
	iload_3 
	iload_4 
	iconst_1 
	isub 
	iload_3 
	invokevirtual drawLine( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	aload_1 
	iipush 13290186
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	iconst_0 
	iload_3 
	iload_6 
	iadd 
	iconst_1 
	isub 
	iload_4 
	iconst_1 
	isub 
	iload_3 
	iload_6 
	iadd 
	iconst_1 
	isub 
	invokevirtual drawLine( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
Label85:
	aload_1 
	iload_7 
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	iload_7 
	ireturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final setShrinkIcon( com.whatsapp.client.IconTextListField, boolean ); // address: 0
	{
	putfield_return com.whatsapp.client.IconTextListField.field_52928   // get_name_1:  com.whatsapp.client.IconTextListField.field_52928   // get_name_2:  com.whatsapp.client.IconTextListField.field_52928   // get_Name:    com.whatsapp.client.IconTextListField.field_52928   // getName->1:     // getName->2:     // getName->N:     // ofs = 52928 ord = 3 addr = 0
	}


protected final boolean keyDown( com.whatsapp.client.IconTextListField, int, int ); // address: 0
	{
	enter_narrow 
	iload_1 
	bipush 10
	if_icmpne Label8
	aload_0 
	invokespecial com.whatsapp.client.IconTextListField.routine_4196 // pc=1
	iconst_1 
	ireturn 
Label8:
	aload_0 
	iload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.Field.keyDown // pc=3
	ireturn 
	}


protected final boolean navigationClick( com.whatsapp.client.IconTextListField, int, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial com.whatsapp.client.IconTextListField.routine_4196 // pc=1
	iconst_1 
	ireturn 
	}


public final drawListRow( com.whatsapp.client.IconTextListField, net.rim.device.api.ui.component.ListField, net.rim.device.api.ui.Graphics, int, int, int ); // address: 0
	{
	noenter_return 
	}


public final drawListRow( com.whatsapp.client.IconTextListField, com.whatsapp.client.NonCachingListField, net.rim.device.api.ui.Graphics, int, int, int, boolean ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual int getRowHeight( net.rim.device.api.ui.component.ListField ) // pc=1
	istore_7 
	aload_0 
	aload_2 
	iload_3 
	iload_4 
	iload_5 
	iload_6 
	iload_7 
	invokespecial com.whatsapp.client.IconTextListField.routine_4302 // pc=7
	pop 
	aload_0_getfield com.whatsapp.client.IconTextListField.field_52916   // get_name_1:  com.whatsapp.client.IconTextListField.field_52916   // get_name_2:  com.whatsapp.client.IconTextListField.field_52916   // get_Name:    com.whatsapp.client.IconTextListField.field_52916   // getName->1:     // getName->2:     // getName->N:     // ofs = 52916 ord = 0 addr = 0
	iload_3 
	aaload 
	astore 8
	aload_2 
	aload 8
	aload_0_getfield com.whatsapp.client.IconTextListField.field_52928   // get_name_1:  com.whatsapp.client.IconTextListField.field_52928   // get_name_2:  com.whatsapp.client.IconTextListField.field_52928   // get_Name:    com.whatsapp.client.IconTextListField.field_52928   // getName->1:     // getName->2:     // getName->N:     // ofs = 52928 ord = 3 addr = 0
	invokenonvirtual_lib .routine_9649 // pc=2
	aload 8
	invokenonvirtual_lib .routine_9690 // pc=1
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	aload 8
	invokenonvirtual_lib .routine_9701 // pc=1
	aload_0_getfield com.whatsapp.client.IconTextListField.field_52920   // get_name_1:  com.whatsapp.client.IconTextListField.field_52920   // get_name_2:  com.whatsapp.client.IconTextListField.field_52920   // get_Name:    com.whatsapp.client.IconTextListField.field_52920   // getName->1:     // getName->2:     // getName->N:     // ofs = 52920 ord = 1 addr = 0
	aload_0_getfield com.whatsapp.client.IconTextListField.field_52920   // get_name_1:  com.whatsapp.client.IconTextListField.field_52920   // get_name_2:  com.whatsapp.client.IconTextListField.field_52920   // get_Name:    com.whatsapp.client.IconTextListField.field_52920   // getName->1:     // getName->2:     // getName->N:     // ofs = 52920 ord = 1 addr = 0
	aload_0_getfield com.whatsapp.client.IconTextListField.field_52924   // get_name_1:  com.whatsapp.client.IconTextListField.field_52924   // get_name_2:  com.whatsapp.client.IconTextListField.field_52924   // get_Name:    com.whatsapp.client.IconTextListField.field_52924   // getName->1:     // getName->2:     // getName->N:     // ofs = 52924 ord = 2 addr = 0
	iload_6 
	ifeq Label33
	aconst_null 
	goto Label37
Label33:
	new_lib Integer//java.lang.Integer java.lang.Integer java.lang.Integer
	dup 
	iipush 5066061
	invokespecial_lib java.lang.Integer.<init> // pc=2
Label37:
	iload_4 
	bipush 60
	iload_5 
	iload_7 
	iload_6 
	invokestatic drawPhotoAndText( net.rim.device.api.ui.Graphics, net.rim.device.api.system.Bitmap, java.lang.String, java.lang.String, java.lang.String, net.rim.device.api.ui.Font, net.rim.device.api.ui.Font, net.rim.device.api.ui.Font, java.lang.Integer, int, int, int, int, boolean ) // IconTextField
	return 
	}


public final java.lang.Object get( com.whatsapp.client.IconTextListField, net.rim.device.api.ui.component.ListField, int ); // address: 0
	{
	enter_narrow 
	iload_2 
	iflt Label7
	iload_2 
	aload_0_getfield com.whatsapp.client.IconTextListField.field_52916   // get_name_1:  com.whatsapp.client.IconTextListField.field_52916   // get_name_2:  com.whatsapp.client.IconTextListField.field_52916   // get_Name:    com.whatsapp.client.IconTextListField.field_52916   // getName->1:     // getName->2:     // getName->N:     // ofs = 52916 ord = 0 addr = 0
	arraylength 
	if_icmplt Label9
Label7:
	aconst_null 
	areturn 
Label9:
	aload_0_getfield com.whatsapp.client.IconTextListField.field_52916   // get_name_1:  com.whatsapp.client.IconTextListField.field_52916   // get_name_2:  com.whatsapp.client.IconTextListField.field_52916   // get_Name:    com.whatsapp.client.IconTextListField.field_52916   // getName->1:     // getName->2:     // getName->N:     // ofs = 52916 ord = 0 addr = 0
	iload_2 
	aaload 
	areturn 
	}


public final int getPreferredWidth( com.whatsapp.client.IconTextListField, net.rim.device.api.ui.component.ListField ); // address: 0
	{
	enter_narrow 
	invokestatic_lib int getWidth(  ) // Display
	ireturn 
	}


public final int indexOfList( com.whatsapp.client.IconTextListField, net.rim.device.api.ui.component.ListField, java.lang.String, int ); // address: 0
	{
	enter 
	bipush -1
	ireturn 
	}

}
