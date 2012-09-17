// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-19.cod
// Module version  : 2.7.3204
// Class ID        : 1
// ########################################################


package com.whatsapp.client;


abstract final class GroupPickerScreen$FilterScreenManager extends net.rim.device.api.ui.Manager

{

	// @@@@@@@@@@@@@ Fields 
	private final net.rim.device.api.ui.Field /*net.rim.device.api.ui.Field*/  field_52596 ; // ofs = 52596 addr = 0)
	private final net.rim.device.api.ui.Field /*net.rim.device.api.ui.Field*/  field_52600 ; // ofs = 52600 addr = 0)
	private final net.rim.device.api.ui.container.VerticalFieldManager /*net.rim.device.api.ui.container.VerticalFieldManager*/  field_52604 ; // ofs = 52604 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.GroupPickerScreen$FilterScreenManager, net.rim.device.api.ui.Field, net.rim.device.api.ui.Field ); // address: 0
	{
	enter 
	aload_0 
	iconst_0 
	i2l 
	invokespecial_lib net.rim.device.api.ui.Manager.<init> // pc=3
	aload_0 
	aload_1 
	putfield com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52596   // get_name_1:  com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52596   // get_name_2:  com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52596   // get_Name:    com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52596   // getName->1:     // getName->2:     // getName->N:     // ofs = 52596 ord = 0 addr = 0
	aload_0 
	aload_2 
	putfield com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52600   // get_name_1:  com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52600   // get_name_2:  com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52600   // get_Name:    com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52600   // getName->1:     // getName->2:     // getName->N:     // ofs = 52600 ord = 1 addr = 0
	aload_0 
	new_lib net.rim.device.api.ui.FieldChangeListener//net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener
	dup 
	lipush 299067162755072
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.<init> // pc=3
	putfield com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52604   // get_name_1:  com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52604   // get_name_2:  com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52604   // get_Name:    com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52604   // getName->1:     // getName->2:     // getName->N:     // ofs = 52604 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52604   // get_name_1:  com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52604   // get_name_2:  com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52604   // get_Name:    com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52604   // getName->1:     // getName->2:     // getName->N:     // ofs = 52604 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52600   // get_name_1:  com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52600   // get_name_2:  com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52600   // get_Name:    com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52600   // getName->1:     // getName->2:     // getName->N:     // ofs = 52600 ord = 1 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52596   // get_name_1:  com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52596   // get_name_2:  com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52596   // get_Name:    com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52596   // getName->1:     // getName->2:     // getName->N:     // ofs = 52596 ord = 0 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52604   // get_name_1:  com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52604   // get_name_2:  com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52604   // get_Name:    com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52604   // getName->1:     // getName->2:     // getName->N:     // ofs = 52604 ord = 2 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final sublayout( com.whatsapp.client.GroupPickerScreen$FilterScreenManager, int, int ); // address: 0
	{
	enter 
	new_lib net.rim.device.api.ui.component.ListField//net.rim.device.api.ui.component.ListField net.rim.device.api.ui.component.ListField net.rim.device.api.ui.component.ListField
	dup 
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=1
	astore_3 
	aload_0_getfield com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52596   // get_name_1:  com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52596   // get_name_2:  com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52596   // get_Name:    com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52596   // getName->1:     // getName->2:     // getName->N:     // ofs = 52596 ord = 0 addr = 0
	aload_3 
	invokevirtual getMargin( net.rim.device.api.ui.Field, net.rim.device.api.ui.XYEdges ) // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52596   // get_name_1:  com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52596   // get_name_2:  com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52596   // get_Name:    com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52596   // getName->1:     // getName->2:     // getName->N:     // ofs = 52596 ord = 0 addr = 0
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
	aload_0_getfield com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52596   // get_name_1:  com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52596   // get_name_2:  com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52596   // get_Name:    com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52596   // getName->1:     // getName->2:     // getName->N:     // ofs = 52596 ord = 0 addr = 0
	aload_3 
	getfield left   // get_name_1:  left   // get_name_2:  left   // get_Name:    left   // getName->1:  left   // getName->2:  left   // getName->N:  left   // ofs = -1 ord = 0 addr = -1
	aload_3 
	getfield top   // get_name_1:  top   // get_name_2:  top   // get_Name:    top   // getName->1:  top   // getName->2:  top   // getName->N:  top   // ofs = -1 ord = 2 addr = -1
	invokevirtual setPositionChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
	aload_0_getfield com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52596   // get_name_1:  com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52596   // get_name_2:  com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52596   // get_Name:    com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52596   // getName->1:     // getName->2:     // getName->N:     // ofs = 52596 ord = 0 addr = 0
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	aload_3 
	getfield top   // get_name_1:  top   // get_name_2:  top   // get_Name:    top   // getName->1:  top   // getName->2:  top   // getName->N:  top   // ofs = -1 ord = 2 addr = -1
	iadd 
	aload_3 
	getfield bottom   // get_name_1:  bottom   // get_name_2:  bottom   // get_Name:    bottom   // getName->1:  bottom   // getName->2:  bottom   // getName->N:  bottom   // ofs = -1 ord = 3 addr = -1
	iadd 
	istore_4 
	aload_0 
	aload_0_getfield com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52604   // get_name_1:  com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52604   // get_name_2:  com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52604   // get_Name:    com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52604   // getName->1:     // getName->2:     // getName->N:     // ofs = 52604 ord = 2 addr = 0
	iload_1 
	iload_2 
	iload_4 
	isub 
	invokevirtual layoutChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
	aload_0 
	aload_0_getfield com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52604   // get_name_1:  com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52604   // get_name_2:  com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52604   // get_Name:    com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52604   // getName->1:     // getName->2:     // getName->N:     // ofs = 52604 ord = 2 addr = 0
	iconst_0 
	iload_4 
	invokevirtual setPositionChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
	aload_0 
	aload_0_getfield com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52596   // get_name_1:  com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52596   // get_name_2:  com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52596   // get_Name:    com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52596   // getName->1:     // getName->2:     // getName->N:     // ofs = 52596 ord = 0 addr = 0
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	aload_0_getfield com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52604   // get_name_1:  com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52604   // get_name_2:  com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52604   // get_Name:    com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52604   // getName->1:     // getName->2:     // getName->N:     // ofs = 52604 ord = 2 addr = 0
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	invokestatic_lib int max( int, int ) // Math
	iload_4 
	aload_0_getfield com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52604   // get_name_1:  com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52604   // get_name_2:  com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52604   // get_Name:    com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52604   // getName->1:     // getName->2:     // getName->N:     // ofs = 52604 ord = 2 addr = 0
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	invokevirtual setExtent( net.rim.device.api.ui.Field, int, int ) // pc=3
	return 
	}


protected final subpaint( com.whatsapp.client.GroupPickerScreen$FilterScreenManager, net.rim.device.api.ui.Graphics ); // address: 0
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
	aload_0_getfield com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52596   // get_name_1:  com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52596   // get_name_2:  com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52596   // get_Name:    com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52596   // getName->1:     // getName->2:     // getName->N:     // ofs = 52596 ord = 0 addr = 0
	invokevirtual int getTop( net.rim.device.api.ui.Field ) // pc=1
	aload_0_getfield com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52596   // get_name_1:  com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52596   // get_name_2:  com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52596   // get_Name:    com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52596   // getName->1:     // getName->2:     // getName->N:     // ofs = 52596 ord = 0 addr = 0
	invokevirtual int getMarginTop( net.rim.device.api.ui.Field ) // pc=1
	isub 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	aload_0_getfield com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52596   // get_name_1:  com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52596   // get_name_2:  com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52596   // get_Name:    com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52596   // getName->1:     // getName->2:     // getName->N:     // ofs = 52596 ord = 0 addr = 0
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	aload_0_getfield com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52596   // get_name_1:  com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52596   // get_name_2:  com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52596   // get_Name:    com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52596   // getName->1:     // getName->2:     // getName->N:     // ofs = 52596 ord = 0 addr = 0
	invokevirtual int getMarginTop( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	aload_0_getfield com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52596   // get_name_1:  com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52596   // get_name_2:  com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52596   // get_Name:    com.whatsapp.client.GroupPickerScreen$FilterScreenManager.field_52596   // getName->1:     // getName->2:     // getName->N:     // ofs = 52596 ord = 0 addr = 0
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

}
