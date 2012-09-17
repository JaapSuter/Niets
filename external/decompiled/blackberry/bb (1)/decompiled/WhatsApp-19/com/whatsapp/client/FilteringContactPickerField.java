// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-15.cod
// Module version  : 2.7.3204
// Class ID        : 13
// ########################################################


package com.whatsapp.client;


abstract public final class FilteringContactPickerField extends net.rim.device.api.ui.Manager
implements net.rim.device.api.ui.FieldChangeListener

{

	// @@@@@@@@@@@@@ Fields 
	private com.whatsapp.client.CustomKeywordField /*com.whatsapp.client.CustomKeywordField*/  field_56714 ; // ofs = 56714 addr = 0)
	private  /*module:WhatsApp-13.class#2*/  field_56718 ; // ofs = 56718 addr = 0)
	private net.rim.device.api.ui.container.VerticalFieldManager /*net.rim.device.api.ui.container.VerticalFieldManager*/  field_56722 ; // ofs = 56722 addr = 0)
	private boolean /*boolean*/  field_56726 ; // ofs = 56726 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.FilteringContactPickerField ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_0 
	i2l 
	invokespecial com.whatsapp.client.FilteringContactPickerField.<init> // pc=3
	return 
	}


public <init>( com.whatsapp.client.FilteringContactPickerField, long ); // address: 0
	{
	enter 
	aload_0 
	iconst_0 
	i2l 
	invokespecial_lib net.rim.device.api.ui.Manager.<init> // pc=3
	aload_0 
	new_lib com.whatsapp.client.CustomKeywordField//com.whatsapp.client.CustomKeywordField com.whatsapp.client.CustomKeywordField com.whatsapp.client.CustomKeywordField
	dup 
	invokespecial_lib .routine_1593 // pc=1
	putfield com.whatsapp.client.FilteringContactPickerField.field_56714   // get_name_1:  com.whatsapp.client.FilteringContactPickerField.field_56714   // get_name_2:  com.whatsapp.client.FilteringContactPickerField.field_56714   // get_Name:    com.whatsapp.client.FilteringContactPickerField.field_56714   // getName->1:     // getName->2:     // getName->N:     // ofs = 56714 ord = 0 addr = 0
	aload_0 
	new_lib //module:WhatsApp-13.class#2 module:WhatsApp-13.class#2 module:WhatsApp-13.class#2
	dup 
	lload 1
	invokespecial_lib .routine_8118 // pc=3
	putfield com.whatsapp.client.FilteringContactPickerField.field_56718   // get_name_1:  com.whatsapp.client.FilteringContactPickerField.field_56718   // get_name_2:  com.whatsapp.client.FilteringContactPickerField.field_56718   // get_Name:    com.whatsapp.client.FilteringContactPickerField.field_56718   // getName->1:     // getName->2:     // getName->N:     // ofs = 56718 ord = 1 addr = 0
	aload_0 
	new_lib net.rim.device.api.ui.DrawTextParam//net.rim.device.api.ui.DrawTextParam net.rim.device.api.ui.DrawTextParam net.rim.device.api.ui.DrawTextParam
	dup 
	lipush 299067162755072
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.<init> // pc=3
	putfield com.whatsapp.client.FilteringContactPickerField.field_56722   // get_name_1:  com.whatsapp.client.FilteringContactPickerField.field_56722   // get_name_2:  com.whatsapp.client.FilteringContactPickerField.field_56722   // get_Name:    com.whatsapp.client.FilteringContactPickerField.field_56722   // getName->1:     // getName->2:     // getName->N:     // ofs = 56722 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.client.FilteringContactPickerField.field_56722   // get_name_1:  com.whatsapp.client.FilteringContactPickerField.field_56722   // get_name_2:  com.whatsapp.client.FilteringContactPickerField.field_56722   // get_Name:    com.whatsapp.client.FilteringContactPickerField.field_56722   // getName->1:     // getName->2:     // getName->N:     // ofs = 56722 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.client.FilteringContactPickerField.field_56718   // get_name_1:  com.whatsapp.client.FilteringContactPickerField.field_56718   // get_name_2:  com.whatsapp.client.FilteringContactPickerField.field_56718   // get_Name:    com.whatsapp.client.FilteringContactPickerField.field_56718   // getName->1:     // getName->2:     // getName->N:     // ofs = 56718 ord = 1 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield com.whatsapp.client.FilteringContactPickerField.field_56714   // get_name_1:  com.whatsapp.client.FilteringContactPickerField.field_56714   // get_name_2:  com.whatsapp.client.FilteringContactPickerField.field_56714   // get_Name:    com.whatsapp.client.FilteringContactPickerField.field_56714   // getName->1:     // getName->2:     // getName->N:     // ofs = 56714 ord = 0 addr = 0
	bipush 22
	bipush 89
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	invokevirtual setLabel( net.rim.device.api.ui.component.BasicEditField, java.lang.String ) // pc=2
	aload_0_getfield com.whatsapp.client.FilteringContactPickerField.field_56714   // get_name_1:  com.whatsapp.client.FilteringContactPickerField.field_56714   // get_name_2:  com.whatsapp.client.FilteringContactPickerField.field_56714   // get_Name:    com.whatsapp.client.FilteringContactPickerField.field_56714   // getName->1:     // getName->2:     // getName->N:     // ofs = 56714 ord = 0 addr = 0
	aload_0 
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.FilteringContactPickerField.field_56714   // get_name_1:  com.whatsapp.client.FilteringContactPickerField.field_56714   // get_name_2:  com.whatsapp.client.FilteringContactPickerField.field_56714   // get_Name:    com.whatsapp.client.FilteringContactPickerField.field_56714   // getName->1:     // getName->2:     // getName->N:     // ofs = 56714 ord = 0 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.FilteringContactPickerField.field_56722   // get_name_1:  com.whatsapp.client.FilteringContactPickerField.field_56722   // get_name_2:  com.whatsapp.client.FilteringContactPickerField.field_56722   // get_Name:    com.whatsapp.client.FilteringContactPickerField.field_56722   // getName->1:     // getName->2:     // getName->N:     // ofs = 56722 ord = 2 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final setShowGroupRow( com.whatsapp.client.FilteringContactPickerField, boolean ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	putfield com.whatsapp.client.FilteringContactPickerField.field_56726   // get_name_1:  com.whatsapp.client.FilteringContactPickerField.field_56726   // get_name_2:  com.whatsapp.client.FilteringContactPickerField.field_56726   // get_Name:    com.whatsapp.client.FilteringContactPickerField.field_56726   // getName->1:     // getName->2:     // getName->N:     // ofs = 56726 ord = 3 addr = 0
	aload_0_getfield com.whatsapp.client.FilteringContactPickerField.field_56718   // get_name_1:  com.whatsapp.client.FilteringContactPickerField.field_56718   // get_name_2:  com.whatsapp.client.FilteringContactPickerField.field_56718   // get_Name:    com.whatsapp.client.FilteringContactPickerField.field_56718   // getName->1:     // getName->2:     // getName->N:     // ofs = 56718 ord = 1 addr = 0
	iload_1 
	ifeq Label13
	aload_0_getfield com.whatsapp.client.FilteringContactPickerField.field_56714   // get_name_1:  com.whatsapp.client.FilteringContactPickerField.field_56714   // get_name_2:  com.whatsapp.client.FilteringContactPickerField.field_56714   // get_Name:    com.whatsapp.client.FilteringContactPickerField.field_56714   // getName->1:     // getName->2:     // getName->N:     // ofs = 56714 ord = 0 addr = 0
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	stringlength 
	ifne Label13
	iconst_1 
	goto Label14
Label13:
	iconst_0 
Label14:
	invokenonvirtual_lib .routine_6626 // pc=2
	return 
	}


public final setGroupClickHandler( com.whatsapp.client.FilteringContactPickerField, java.lang.Runnable ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.FilteringContactPickerField.field_56718   // get_name_1:  com.whatsapp.client.FilteringContactPickerField.field_56718   // get_name_2:  com.whatsapp.client.FilteringContactPickerField.field_56718   // get_Name:    com.whatsapp.client.FilteringContactPickerField.field_56718   // getName->1:     // getName->2:     // getName->N:     // ofs = 56718 ord = 1 addr = 0
	aload_1 
	invokenonvirtual_lib .routine_6784 // pc=2
	return 
	}


public final setContacts( com.whatsapp.client.FilteringContactPickerField, java.util.Vector ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.FilteringContactPickerField.field_56718   // get_name_1:  com.whatsapp.client.FilteringContactPickerField.field_56718   // get_name_2:  com.whatsapp.client.FilteringContactPickerField.field_56718   // get_Name:    com.whatsapp.client.FilteringContactPickerField.field_56718   // getName->1:     // getName->2:     // getName->N:     // ofs = 56718 ord = 1 addr = 0
	aload_1 
	invokenonvirtual_lib .routine_6657 // pc=2
	return 
	}


public final setHandler( com.whatsapp.client.FilteringContactPickerField, module:WhatsApp-10.class#40 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.FilteringContactPickerField.field_56718   // get_name_1:  com.whatsapp.client.FilteringContactPickerField.field_56718   // get_name_2:  com.whatsapp.client.FilteringContactPickerField.field_56718   // get_Name:    com.whatsapp.client.FilteringContactPickerField.field_56718   // getName->1:     // getName->2:     // getName->N:     // ofs = 56718 ord = 1 addr = 0
	aload_1 
	invokenonvirtual_lib .routine_6773 // pc=2
	return 
	}


public final setFilterChatable( com.whatsapp.client.FilteringContactPickerField, module:WhatsApp-7.class#24 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.FilteringContactPickerField.field_56718   // get_name_1:  com.whatsapp.client.FilteringContactPickerField.field_56718   // get_name_2:  com.whatsapp.client.FilteringContactPickerField.field_56718   // get_Name:    com.whatsapp.client.FilteringContactPickerField.field_56718   // getName->1:     // getName->2:     // getName->N:     // ofs = 56718 ord = 1 addr = 0
	aload_1 
	invokenonvirtual_lib .routine_6748 // pc=2
	return 
	}


public final fieldChanged( com.whatsapp.client.FilteringContactPickerField, net.rim.device.api.ui.Field, int ); // address: 0
	{
	enter 
	aload_1 
	aload_0_getfield com.whatsapp.client.FilteringContactPickerField.field_56714   // get_name_1:  com.whatsapp.client.FilteringContactPickerField.field_56714   // get_name_2:  com.whatsapp.client.FilteringContactPickerField.field_56714   // get_Name:    com.whatsapp.client.FilteringContactPickerField.field_56714   // getName->1:     // getName->2:     // getName->N:     // ofs = 56714 ord = 0 addr = 0
	if_acmpne Label23
	aload_0_getfield com.whatsapp.client.FilteringContactPickerField.field_56714   // get_name_1:  com.whatsapp.client.FilteringContactPickerField.field_56714   // get_name_2:  com.whatsapp.client.FilteringContactPickerField.field_56714   // get_Name:    com.whatsapp.client.FilteringContactPickerField.field_56714   // getName->1:     // getName->2:     // getName->N:     // ofs = 56714 ord = 0 addr = 0
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	astore_3 
	aload_3 
	ifnonnull Label10
	return 
Label10:
	aload_0_getfield com.whatsapp.client.FilteringContactPickerField.field_56726   // get_name_1:  com.whatsapp.client.FilteringContactPickerField.field_56726   // get_name_2:  com.whatsapp.client.FilteringContactPickerField.field_56726   // get_Name:    com.whatsapp.client.FilteringContactPickerField.field_56726   // getName->1:     // getName->2:     // getName->N:     // ofs = 56726 ord = 3 addr = 0
	ifeq Label20
	aload_0_getfield com.whatsapp.client.FilteringContactPickerField.field_56718   // get_name_1:  com.whatsapp.client.FilteringContactPickerField.field_56718   // get_name_2:  com.whatsapp.client.FilteringContactPickerField.field_56718   // get_Name:    com.whatsapp.client.FilteringContactPickerField.field_56718   // getName->1:     // getName->2:     // getName->N:     // ofs = 56718 ord = 1 addr = 0
	aload_3 
	stringlength 
	ifne Label18
	iconst_1 
	goto Label19
Label18:
	iconst_0 
Label19:
	invokenonvirtual_lib .routine_6626 // pc=2
Label20:
	aload_0_getfield com.whatsapp.client.FilteringContactPickerField.field_56718   // get_name_1:  com.whatsapp.client.FilteringContactPickerField.field_56718   // get_name_2:  com.whatsapp.client.FilteringContactPickerField.field_56718   // get_Name:    com.whatsapp.client.FilteringContactPickerField.field_56718   // getName->1:     // getName->2:     // getName->N:     // ofs = 56718 ord = 1 addr = 0
	aload_3 
	invokenonvirtual_lib .routine_6682 // pc=2
Label23:
	return 
	}


public final setMuddy( com.whatsapp.client.FilteringContactPickerField, boolean ); // address: 0
	{
	noenter_return 
	}


protected final boolean keyChar( com.whatsapp.client.FilteringContactPickerField, char, int, int ); // address: 0
	{
	enter 
	bipush 10
	iload_1 
	if_icmpeq Label7
	bipush 32
	iload_1 
	if_icmpne Label13
Label7:
	aload_0_getfield com.whatsapp.client.FilteringContactPickerField.field_56718   // get_name_1:  com.whatsapp.client.FilteringContactPickerField.field_56718   // get_name_2:  com.whatsapp.client.FilteringContactPickerField.field_56718   // get_Name:    com.whatsapp.client.FilteringContactPickerField.field_56718   // getName->1:     // getName->2:     // getName->N:     // ofs = 56718 ord = 1 addr = 0
	iload_1 
	iload_2 
	iload_3 
	invokenonvirtual_lib .routine_6834 // pc=4
	ireturn 
Label13:
	aload_0_getfield com.whatsapp.client.FilteringContactPickerField.field_56714   // get_name_1:  com.whatsapp.client.FilteringContactPickerField.field_56714   // get_name_2:  com.whatsapp.client.FilteringContactPickerField.field_56714   // get_Name:    com.whatsapp.client.FilteringContactPickerField.field_56714   // getName->1:     // getName->2:     // getName->N:     // ofs = 56714 ord = 0 addr = 0
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	invokespecial_lib net.rim.device.api.ui.Manager.keyChar // pc=4
	ireturn 
	}


protected final sublayout( com.whatsapp.client.FilteringContactPickerField, int, int ); // address: 0
	{
	enter 
	new_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	dup 
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=1
	astore_3 
	aload_0_getfield com.whatsapp.client.FilteringContactPickerField.field_56714   // get_name_1:  com.whatsapp.client.FilteringContactPickerField.field_56714   // get_name_2:  com.whatsapp.client.FilteringContactPickerField.field_56714   // get_Name:    com.whatsapp.client.FilteringContactPickerField.field_56714   // getName->1:     // getName->2:     // getName->N:     // ofs = 56714 ord = 0 addr = 0
	aload_3 
	invokevirtual getMargin( net.rim.device.api.ui.Field, net.rim.device.api.ui.XYEdges ) // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.FilteringContactPickerField.field_56714   // get_name_1:  com.whatsapp.client.FilteringContactPickerField.field_56714   // get_name_2:  com.whatsapp.client.FilteringContactPickerField.field_56714   // get_Name:    com.whatsapp.client.FilteringContactPickerField.field_56714   // getName->1:     // getName->2:     // getName->N:     // ofs = 56714 ord = 0 addr = 0
	iload_1 
	aload_3 
	getfield left   // get_name_1:  left   // get_name_2:  left   // get_Name:    left   // getName->1:  left   // getName->2:  left   // getName->N:  left   // ofs = -1 ord = 0 addr = -1
	isub 
	aload_3 
	getfield right   // get_name_1:  right   // get_name_2:  right   // get_Name:    right   // getName->1:  right   // getName->2:  right   // getName->N:  right   // ofs = -1 ord = 1 addr = -1
	isub 
	iload_2 
	aload_3 
	getfield top   // get_name_1:  top   // get_name_2:  top   // get_Name:    top   // getName->1:  top   // getName->2:  top   // getName->N:  top   // ofs = -1 ord = 2 addr = -1
	isub 
	aload_3 
	getfield bottom   // get_name_1:  bottom   // get_name_2:  bottom   // get_Name:    bottom   // getName->1:  bottom   // getName->2:  bottom   // getName->N:  bottom   // ofs = -1 ord = 3 addr = -1
	isub 
	invokevirtual layoutChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
	aload_0 
	aload_0_getfield com.whatsapp.client.FilteringContactPickerField.field_56714   // get_name_1:  com.whatsapp.client.FilteringContactPickerField.field_56714   // get_name_2:  com.whatsapp.client.FilteringContactPickerField.field_56714   // get_Name:    com.whatsapp.client.FilteringContactPickerField.field_56714   // getName->1:     // getName->2:     // getName->N:     // ofs = 56714 ord = 0 addr = 0
	aload_3 
	getfield left   // get_name_1:  left   // get_name_2:  left   // get_Name:    left   // getName->1:  left   // getName->2:  left   // getName->N:  left   // ofs = -1 ord = 0 addr = -1
	aload_3 
	getfield top   // get_name_1:  top   // get_name_2:  top   // get_Name:    top   // getName->1:  top   // getName->2:  top   // getName->N:  top   // ofs = -1 ord = 2 addr = -1
	invokevirtual setPositionChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
	aload_0_getfield com.whatsapp.client.FilteringContactPickerField.field_56714   // get_name_1:  com.whatsapp.client.FilteringContactPickerField.field_56714   // get_name_2:  com.whatsapp.client.FilteringContactPickerField.field_56714   // get_Name:    com.whatsapp.client.FilteringContactPickerField.field_56714   // getName->1:     // getName->2:     // getName->N:     // ofs = 56714 ord = 0 addr = 0
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	aload_3 
	getfield top   // get_name_1:  top   // get_name_2:  top   // get_Name:    top   // getName->1:  top   // getName->2:  top   // getName->N:  top   // ofs = -1 ord = 2 addr = -1
	iadd 
	aload_3 
	getfield bottom   // get_name_1:  bottom   // get_name_2:  bottom   // get_Name:    bottom   // getName->1:  bottom   // getName->2:  bottom   // getName->N:  bottom   // ofs = -1 ord = 3 addr = -1
	iadd 
	istore_4 
	aload_0 
	aload_0_getfield com.whatsapp.client.FilteringContactPickerField.field_56722   // get_name_1:  com.whatsapp.client.FilteringContactPickerField.field_56722   // get_name_2:  com.whatsapp.client.FilteringContactPickerField.field_56722   // get_Name:    com.whatsapp.client.FilteringContactPickerField.field_56722   // getName->1:     // getName->2:     // getName->N:     // ofs = 56722 ord = 2 addr = 0
	iload_1 
	iload_2 
	iload_4 
	isub 
	invokevirtual layoutChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
	aload_0 
	aload_0_getfield com.whatsapp.client.FilteringContactPickerField.field_56722   // get_name_1:  com.whatsapp.client.FilteringContactPickerField.field_56722   // get_name_2:  com.whatsapp.client.FilteringContactPickerField.field_56722   // get_Name:    com.whatsapp.client.FilteringContactPickerField.field_56722   // getName->1:     // getName->2:     // getName->N:     // ofs = 56722 ord = 2 addr = 0
	iconst_0 
	iload_4 
	invokevirtual setPositionChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
	aload_0 
	aload_0_getfield com.whatsapp.client.FilteringContactPickerField.field_56714   // get_name_1:  com.whatsapp.client.FilteringContactPickerField.field_56714   // get_name_2:  com.whatsapp.client.FilteringContactPickerField.field_56714   // get_Name:    com.whatsapp.client.FilteringContactPickerField.field_56714   // getName->1:     // getName->2:     // getName->N:     // ofs = 56714 ord = 0 addr = 0
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	aload_0_getfield com.whatsapp.client.FilteringContactPickerField.field_56722   // get_name_1:  com.whatsapp.client.FilteringContactPickerField.field_56722   // get_name_2:  com.whatsapp.client.FilteringContactPickerField.field_56722   // get_Name:    com.whatsapp.client.FilteringContactPickerField.field_56722   // getName->1:     // getName->2:     // getName->N:     // ofs = 56722 ord = 2 addr = 0
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	invokestatic_lib int max( int, int ) // Math
	iload_4 
	aload_0_getfield com.whatsapp.client.FilteringContactPickerField.field_56722   // get_name_1:  com.whatsapp.client.FilteringContactPickerField.field_56722   // get_name_2:  com.whatsapp.client.FilteringContactPickerField.field_56722   // get_Name:    com.whatsapp.client.FilteringContactPickerField.field_56722   // getName->1:     // getName->2:     // getName->N:     // ofs = 56722 ord = 2 addr = 0
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	invokevirtual setExtent( net.rim.device.api.ui.Field, int, int ) // pc=3
	return 
	}


protected final subpaint( com.whatsapp.client.FilteringContactPickerField, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual int getBackgroundColor( net.rim.device.api.ui.Graphics ) // pc=1
	istore_2 
	aload_1 
	iconst_0 
	invokevirtual setBackgroundColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	iconst_0 
	aload_0_getfield com.whatsapp.client.FilteringContactPickerField.field_56714   // get_name_1:  com.whatsapp.client.FilteringContactPickerField.field_56714   // get_name_2:  com.whatsapp.client.FilteringContactPickerField.field_56714   // get_Name:    com.whatsapp.client.FilteringContactPickerField.field_56714   // getName->1:     // getName->2:     // getName->N:     // ofs = 56714 ord = 0 addr = 0
	invokevirtual int getTop( net.rim.device.api.ui.Field ) // pc=1
	aload_0_getfield com.whatsapp.client.FilteringContactPickerField.field_56714   // get_name_1:  com.whatsapp.client.FilteringContactPickerField.field_56714   // get_name_2:  com.whatsapp.client.FilteringContactPickerField.field_56714   // get_Name:    com.whatsapp.client.FilteringContactPickerField.field_56714   // getName->1:     // getName->2:     // getName->N:     // ofs = 56714 ord = 0 addr = 0
	invokevirtual int getMarginTop( net.rim.device.api.ui.Field ) // pc=1
	isub 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	aload_0_getfield com.whatsapp.client.FilteringContactPickerField.field_56714   // get_name_1:  com.whatsapp.client.FilteringContactPickerField.field_56714   // get_name_2:  com.whatsapp.client.FilteringContactPickerField.field_56714   // get_Name:    com.whatsapp.client.FilteringContactPickerField.field_56714   // getName->1:     // getName->2:     // getName->N:     // ofs = 56714 ord = 0 addr = 0
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	aload_0_getfield com.whatsapp.client.FilteringContactPickerField.field_56714   // get_name_1:  com.whatsapp.client.FilteringContactPickerField.field_56714   // get_name_2:  com.whatsapp.client.FilteringContactPickerField.field_56714   // get_Name:    com.whatsapp.client.FilteringContactPickerField.field_56714   // getName->1:     // getName->2:     // getName->N:     // ofs = 56714 ord = 0 addr = 0
	invokevirtual int getMarginTop( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	aload_0_getfield com.whatsapp.client.FilteringContactPickerField.field_56714   // get_name_1:  com.whatsapp.client.FilteringContactPickerField.field_56714   // get_name_2:  com.whatsapp.client.FilteringContactPickerField.field_56714   // get_Name:    com.whatsapp.client.FilteringContactPickerField.field_56714   // getName->1:     // getName->2:     // getName->N:     // ofs = 56714 ord = 0 addr = 0
	invokevirtual int getMarginBottom( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	invokevirtual clear( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	aload_1 
	iload_2 
	invokevirtual setBackgroundColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_0 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.Manager.subpaint // pc=2
	return 
	}


public final setDirty( com.whatsapp.client.FilteringContactPickerField, boolean ); // address: 0
	{
	noenter_return 
	}

}
