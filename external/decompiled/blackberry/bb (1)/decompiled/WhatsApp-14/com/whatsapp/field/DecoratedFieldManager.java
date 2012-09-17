// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-36.cod
// Module version  : 2.7.3204
// Class ID        : 5
// ########################################################


package com.whatsapp.field;


abstract public final class DecoratedFieldManager extends net.rim.device.api.ui.Manager

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.device.api.ui.Field /*net.rim.device.api.ui.Field*/  field_52636 ; // ofs = 52636 addr = 0)
	private net.rim.device.api.ui.Field /*net.rim.device.api.ui.Field*/  field_52640 ; // ofs = 52640 addr = 0)
	private net.rim.device.api.ui.Field /*net.rim.device.api.ui.Field*/  field_52644 ; // ofs = 52644 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.field.DecoratedFieldManager, net.rim.device.api.ui.Field, long ); // address: 0
	{
	enter 
	aload_0 
	lload 2
	invokespecial_lib net.rim.device.api.ui.Manager.<init> // pc=3
	aload_0 
	aload_1 
	putfield com.whatsapp.field.DecoratedFieldManager.field_52636   // get_name_1:  com.whatsapp.field.DecoratedFieldManager.field_52636   // get_name_2:  com.whatsapp.field.DecoratedFieldManager.field_52636   // get_Name:    com.whatsapp.field.DecoratedFieldManager.field_52636   // getName->1:     // getName->2:     // getName->N:     // ofs = 52636 ord = 0 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.field.DecoratedFieldManager.field_52636   // get_name_1:  com.whatsapp.field.DecoratedFieldManager.field_52636   // get_name_2:  com.whatsapp.field.DecoratedFieldManager.field_52636   // get_Name:    com.whatsapp.field.DecoratedFieldManager.field_52636   // getName->1:     // getName->2:     // getName->N:     // ofs = 52636 ord = 0 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final int com.whatsapp.field.DecoratedFieldManager.routine_4193( com.whatsapp.field.DecoratedFieldManager, net.rim.device.api.ui.decor.Border ); // address: 0
	{
	enter_narrow 
	aload_1 
	ifnonnull Label5
	iconst_0 
	ireturn 
Label5:
	aload_1 
	invokevirtual int getLeft( net.rim.device.api.ui.decor.Border ) // pc=1
	aload_1 
	invokevirtual int getRight( net.rim.device.api.ui.decor.Border ) // pc=1
	iadd 
	ireturn 
	}


private final int com.whatsapp.field.DecoratedFieldManager.routine_4220( com.whatsapp.field.DecoratedFieldManager, net.rim.device.api.ui.decor.Border ); // address: 0
	{
	enter_narrow 
	aload_1 
	ifnonnull Label5
	iconst_0 
	ireturn 
Label5:
	aload_1 
	invokevirtual int getTop( net.rim.device.api.ui.decor.Border ) // pc=1
	aload_1 
	invokevirtual int getBottom( net.rim.device.api.ui.decor.Border ) // pc=1
	iadd 
	ireturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final setLeft( com.whatsapp.field.DecoratedFieldManager, net.rim.device.api.ui.Field ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.field.DecoratedFieldManager.field_52640   // get_name_1:  com.whatsapp.field.DecoratedFieldManager.field_52640   // get_name_2:  com.whatsapp.field.DecoratedFieldManager.field_52640   // get_Name:    com.whatsapp.field.DecoratedFieldManager.field_52640   // getName->1:     // getName->2:     // getName->N:     // ofs = 52640 ord = 1 addr = 0
	ifnull Label6
	aload_0 
	aload_0_getfield com.whatsapp.field.DecoratedFieldManager.field_52640   // get_name_1:  com.whatsapp.field.DecoratedFieldManager.field_52640   // get_name_2:  com.whatsapp.field.DecoratedFieldManager.field_52640   // get_Name:    com.whatsapp.field.DecoratedFieldManager.field_52640   // getName->1:     // getName->2:     // getName->N:     // ofs = 52640 ord = 1 addr = 0
	invokevirtual delete( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
Label6:
	aload_1 
	ifnull Label11
	aload_0 
	aload_1 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
Label11:
	aload_0 
	aload_1 
	putfield com.whatsapp.field.DecoratedFieldManager.field_52640   // get_name_1:  com.whatsapp.field.DecoratedFieldManager.field_52640   // get_name_2:  com.whatsapp.field.DecoratedFieldManager.field_52640   // get_Name:    com.whatsapp.field.DecoratedFieldManager.field_52640   // getName->1:     // getName->2:     // getName->N:     // ofs = 52640 ord = 1 addr = 0
	return 
	}


protected final sublayout( com.whatsapp.field.DecoratedFieldManager, int, int ); // address: 0
	{
	enter 
	aload_0 
	aload_0_getfield com.whatsapp.field.DecoratedFieldManager.field_52636   // get_name_1:  com.whatsapp.field.DecoratedFieldManager.field_52636   // get_name_2:  com.whatsapp.field.DecoratedFieldManager.field_52636   // get_Name:    com.whatsapp.field.DecoratedFieldManager.field_52636   // getName->1:     // getName->2:     // getName->N:     // ofs = 52636 ord = 0 addr = 0
	iload_1 
	iload_2 
	invokevirtual layoutChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
	aload_0_getfield com.whatsapp.field.DecoratedFieldManager.field_52636   // get_name_1:  com.whatsapp.field.DecoratedFieldManager.field_52636   // get_name_2:  com.whatsapp.field.DecoratedFieldManager.field_52636   // get_Name:    com.whatsapp.field.DecoratedFieldManager.field_52636   // getName->1:     // getName->2:     // getName->N:     // ofs = 52636 ord = 0 addr = 0
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	aload_0 
	aload_0_getfield com.whatsapp.field.DecoratedFieldManager.field_52636   // get_name_1:  com.whatsapp.field.DecoratedFieldManager.field_52636   // get_name_2:  com.whatsapp.field.DecoratedFieldManager.field_52636   // get_Name:    com.whatsapp.field.DecoratedFieldManager.field_52636   // getName->1:     // getName->2:     // getName->N:     // ofs = 52636 ord = 0 addr = 0
	invokevirtual net.rim.device.api.ui.decor.Border getBorder( net.rim.device.api.ui.Field ) // pc=1
	invokespecial com.whatsapp.field.DecoratedFieldManager.routine_4220 // pc=2
	iadd 
	istore_3 
	iload_1 
	aload_0 
	aload_0_getfield com.whatsapp.field.DecoratedFieldManager.field_52636   // get_name_1:  com.whatsapp.field.DecoratedFieldManager.field_52636   // get_name_2:  com.whatsapp.field.DecoratedFieldManager.field_52636   // get_Name:    com.whatsapp.field.DecoratedFieldManager.field_52636   // getName->1:     // getName->2:     // getName->N:     // ofs = 52636 ord = 0 addr = 0
	invokevirtual net.rim.device.api.ui.decor.Border getBorder( net.rim.device.api.ui.Field ) // pc=1
	invokespecial com.whatsapp.field.DecoratedFieldManager.routine_4193 // pc=2
	isub 
	aload_0_getfield com.whatsapp.field.DecoratedFieldManager.field_52636   // get_name_1:  com.whatsapp.field.DecoratedFieldManager.field_52636   // get_name_2:  com.whatsapp.field.DecoratedFieldManager.field_52636   // get_Name:    com.whatsapp.field.DecoratedFieldManager.field_52636   // getName->1:     // getName->2:     // getName->N:     // ofs = 52636 ord = 0 addr = 0
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	isub 
	istore_4 
	iload_4 
	istore_5 
	aload_0_getfield com.whatsapp.field.DecoratedFieldManager.field_52636   // get_name_1:  com.whatsapp.field.DecoratedFieldManager.field_52636   // get_name_2:  com.whatsapp.field.DecoratedFieldManager.field_52636   // get_Name:    com.whatsapp.field.DecoratedFieldManager.field_52636   // getName->1:     // getName->2:     // getName->N:     // ofs = 52636 ord = 0 addr = 0
	invokevirtual int getMarginLeft( net.rim.device.api.ui.Field ) // pc=1
	istore_6 
	aload_0_getfield com.whatsapp.field.DecoratedFieldManager.field_52640   // get_name_1:  com.whatsapp.field.DecoratedFieldManager.field_52640   // get_name_2:  com.whatsapp.field.DecoratedFieldManager.field_52640   // get_Name:    com.whatsapp.field.DecoratedFieldManager.field_52640   // getName->1:     // getName->2:     // getName->N:     // ofs = 52640 ord = 1 addr = 0
	ifnull Label68
	iload_6 
	aload_0_getfield com.whatsapp.field.DecoratedFieldManager.field_52640   // get_name_1:  com.whatsapp.field.DecoratedFieldManager.field_52640   // get_name_2:  com.whatsapp.field.DecoratedFieldManager.field_52640   // get_Name:    com.whatsapp.field.DecoratedFieldManager.field_52640   // getName->1:     // getName->2:     // getName->N:     // ofs = 52640 ord = 1 addr = 0
	invokevirtual int getMarginRight( net.rim.device.api.ui.Field ) // pc=1
	invokestatic_lib int max( int, int ) // Math
	istore_6 
	iload_4 
	iload_6 
	isub 
	aload_0_getfield com.whatsapp.field.DecoratedFieldManager.field_52640   // get_name_1:  com.whatsapp.field.DecoratedFieldManager.field_52640   // get_name_2:  com.whatsapp.field.DecoratedFieldManager.field_52640   // get_Name:    com.whatsapp.field.DecoratedFieldManager.field_52640   // getName->1:     // getName->2:     // getName->N:     // ofs = 52640 ord = 1 addr = 0
	invokevirtual int getMarginLeft( net.rim.device.api.ui.Field ) // pc=1
	isub 
	istore_5 
	aload_0 
	aload_0_getfield com.whatsapp.field.DecoratedFieldManager.field_52640   // get_name_1:  com.whatsapp.field.DecoratedFieldManager.field_52640   // get_name_2:  com.whatsapp.field.DecoratedFieldManager.field_52640   // get_Name:    com.whatsapp.field.DecoratedFieldManager.field_52640   // getName->1:     // getName->2:     // getName->N:     // ofs = 52640 ord = 1 addr = 0
	iload_4 
	iload_2 
	invokevirtual layoutChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
	iload_4 
	aload_0 
	aload_0_getfield com.whatsapp.field.DecoratedFieldManager.field_52640   // get_name_1:  com.whatsapp.field.DecoratedFieldManager.field_52640   // get_name_2:  com.whatsapp.field.DecoratedFieldManager.field_52640   // get_Name:    com.whatsapp.field.DecoratedFieldManager.field_52640   // getName->1:     // getName->2:     // getName->N:     // ofs = 52640 ord = 1 addr = 0
	invokevirtual net.rim.device.api.ui.decor.Border getBorder( net.rim.device.api.ui.Field ) // pc=1
	invokespecial com.whatsapp.field.DecoratedFieldManager.routine_4193 // pc=2
	isub 
	aload_0_getfield com.whatsapp.field.DecoratedFieldManager.field_52640   // get_name_1:  com.whatsapp.field.DecoratedFieldManager.field_52640   // get_name_2:  com.whatsapp.field.DecoratedFieldManager.field_52640   // get_Name:    com.whatsapp.field.DecoratedFieldManager.field_52640   // getName->1:     // getName->2:     // getName->N:     // ofs = 52640 ord = 1 addr = 0
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	isub 
	istore_5 
	iload_3 
	aload_0_getfield com.whatsapp.field.DecoratedFieldManager.field_52640   // get_name_1:  com.whatsapp.field.DecoratedFieldManager.field_52640   // get_name_2:  com.whatsapp.field.DecoratedFieldManager.field_52640   // get_Name:    com.whatsapp.field.DecoratedFieldManager.field_52640   // getName->1:     // getName->2:     // getName->N:     // ofs = 52640 ord = 1 addr = 0
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	aload_0 
	aload_0_getfield com.whatsapp.field.DecoratedFieldManager.field_52640   // get_name_1:  com.whatsapp.field.DecoratedFieldManager.field_52640   // get_name_2:  com.whatsapp.field.DecoratedFieldManager.field_52640   // get_Name:    com.whatsapp.field.DecoratedFieldManager.field_52640   // getName->1:     // getName->2:     // getName->N:     // ofs = 52640 ord = 1 addr = 0
	invokevirtual net.rim.device.api.ui.decor.Border getBorder( net.rim.device.api.ui.Field ) // pc=1
	invokespecial com.whatsapp.field.DecoratedFieldManager.routine_4220 // pc=2
	iadd 
	invokestatic_lib int max( int, int ) // Math
	istore_3 
Label68:
	aload_0_getfield com.whatsapp.field.DecoratedFieldManager.field_52636   // get_name_1:  com.whatsapp.field.DecoratedFieldManager.field_52636   // get_name_2:  com.whatsapp.field.DecoratedFieldManager.field_52636   // get_Name:    com.whatsapp.field.DecoratedFieldManager.field_52636   // getName->1:     // getName->2:     // getName->N:     // ofs = 52636 ord = 0 addr = 0
	invokevirtual int getMarginRight( net.rim.device.api.ui.Field ) // pc=1
	istore_7 
	aload_0_getfield com.whatsapp.field.DecoratedFieldManager.field_52644   // get_name_1:  com.whatsapp.field.DecoratedFieldManager.field_52644   // get_name_2:  com.whatsapp.field.DecoratedFieldManager.field_52644   // get_Name:    com.whatsapp.field.DecoratedFieldManager.field_52644   // getName->1:     // getName->2:     // getName->N:     // ofs = 52644 ord = 2 addr = 0
	ifnull Label100
	iload_7 
	aload_0_getfield com.whatsapp.field.DecoratedFieldManager.field_52644   // get_name_1:  com.whatsapp.field.DecoratedFieldManager.field_52644   // get_name_2:  com.whatsapp.field.DecoratedFieldManager.field_52644   // get_Name:    com.whatsapp.field.DecoratedFieldManager.field_52644   // getName->1:     // getName->2:     // getName->N:     // ofs = 52644 ord = 2 addr = 0
	invokevirtual int getMarginLeft( net.rim.device.api.ui.Field ) // pc=1
	invokestatic_lib int max( int, int ) // Math
	istore_7 
	iload_5 
	iload_7 
	isub 
	aload_0_getfield com.whatsapp.field.DecoratedFieldManager.field_52644   // get_name_1:  com.whatsapp.field.DecoratedFieldManager.field_52644   // get_name_2:  com.whatsapp.field.DecoratedFieldManager.field_52644   // get_Name:    com.whatsapp.field.DecoratedFieldManager.field_52644   // getName->1:     // getName->2:     // getName->N:     // ofs = 52644 ord = 2 addr = 0
	invokevirtual int getMarginRight( net.rim.device.api.ui.Field ) // pc=1
	isub 
	istore_5 
	aload_0 
	aload_0_getfield com.whatsapp.field.DecoratedFieldManager.field_52644   // get_name_1:  com.whatsapp.field.DecoratedFieldManager.field_52644   // get_name_2:  com.whatsapp.field.DecoratedFieldManager.field_52644   // get_Name:    com.whatsapp.field.DecoratedFieldManager.field_52644   // getName->1:     // getName->2:     // getName->N:     // ofs = 52644 ord = 2 addr = 0
	iload_5 
	iload_2 
	invokevirtual layoutChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
	iload_3 
	aload_0_getfield com.whatsapp.field.DecoratedFieldManager.field_52644   // get_name_1:  com.whatsapp.field.DecoratedFieldManager.field_52644   // get_name_2:  com.whatsapp.field.DecoratedFieldManager.field_52644   // get_Name:    com.whatsapp.field.DecoratedFieldManager.field_52644   // getName->1:     // getName->2:     // getName->N:     // ofs = 52644 ord = 2 addr = 0
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	aload_0 
	aload_0_getfield com.whatsapp.field.DecoratedFieldManager.field_52644   // get_name_1:  com.whatsapp.field.DecoratedFieldManager.field_52644   // get_name_2:  com.whatsapp.field.DecoratedFieldManager.field_52644   // get_Name:    com.whatsapp.field.DecoratedFieldManager.field_52644   // getName->1:     // getName->2:     // getName->N:     // ofs = 52644 ord = 2 addr = 0
	invokevirtual net.rim.device.api.ui.decor.Border getBorder( net.rim.device.api.ui.Field ) // pc=1
	invokespecial com.whatsapp.field.DecoratedFieldManager.routine_4220 // pc=2
	iadd 
	invokestatic_lib int max( int, int ) // Math
	istore_3 
Label100:
	iload_4 
	bipush 2
	idiv 
	istore 8
	iload 8
	aload_0_getfield com.whatsapp.field.DecoratedFieldManager.field_52640   // get_name_1:  com.whatsapp.field.DecoratedFieldManager.field_52640   // get_name_2:  com.whatsapp.field.DecoratedFieldManager.field_52640   // get_Name:    com.whatsapp.field.DecoratedFieldManager.field_52640   // getName->1:     // getName->2:     // getName->N:     // ofs = 52640 ord = 1 addr = 0
	ifnonnull Label109
	iconst_0 
	goto Label114
Label109:
	aload_0_getfield com.whatsapp.field.DecoratedFieldManager.field_52640   // get_name_1:  com.whatsapp.field.DecoratedFieldManager.field_52640   // get_name_2:  com.whatsapp.field.DecoratedFieldManager.field_52640   // get_Name:    com.whatsapp.field.DecoratedFieldManager.field_52640   // getName->1:     // getName->2:     // getName->N:     // ofs = 52640 ord = 1 addr = 0
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	aload_0_getfield com.whatsapp.field.DecoratedFieldManager.field_52640   // get_name_1:  com.whatsapp.field.DecoratedFieldManager.field_52640   // get_name_2:  com.whatsapp.field.DecoratedFieldManager.field_52640   // get_Name:    com.whatsapp.field.DecoratedFieldManager.field_52640   // getName->1:     // getName->2:     // getName->N:     // ofs = 52640 ord = 1 addr = 0
	invokevirtual int getMarginLeft( net.rim.device.api.ui.Field ) // pc=1
	iadd 
Label114:
	iload_6 
	iadd 
	invokestatic_lib int max( int, int ) // Math
	istore 9
	aload_0_getfield com.whatsapp.field.DecoratedFieldManager.field_52640   // get_name_1:  com.whatsapp.field.DecoratedFieldManager.field_52640   // get_name_2:  com.whatsapp.field.DecoratedFieldManager.field_52640   // get_Name:    com.whatsapp.field.DecoratedFieldManager.field_52640   // getName->1:     // getName->2:     // getName->N:     // ofs = 52640 ord = 1 addr = 0
	ifnull Label135
	aload_0 
	aload_0_getfield com.whatsapp.field.DecoratedFieldManager.field_52640   // get_name_1:  com.whatsapp.field.DecoratedFieldManager.field_52640   // get_name_2:  com.whatsapp.field.DecoratedFieldManager.field_52640   // get_Name:    com.whatsapp.field.DecoratedFieldManager.field_52640   // getName->1:     // getName->2:     // getName->N:     // ofs = 52640 ord = 1 addr = 0
	iload 9
	aload_0_getfield com.whatsapp.field.DecoratedFieldManager.field_52640   // get_name_1:  com.whatsapp.field.DecoratedFieldManager.field_52640   // get_name_2:  com.whatsapp.field.DecoratedFieldManager.field_52640   // get_Name:    com.whatsapp.field.DecoratedFieldManager.field_52640   // getName->1:     // getName->2:     // getName->N:     // ofs = 52640 ord = 1 addr = 0
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	isub 
	iload_6 
	isub 
	iload_3 
	aload_0_getfield com.whatsapp.field.DecoratedFieldManager.field_52640   // get_name_1:  com.whatsapp.field.DecoratedFieldManager.field_52640   // get_name_2:  com.whatsapp.field.DecoratedFieldManager.field_52640   // get_Name:    com.whatsapp.field.DecoratedFieldManager.field_52640   // getName->1:     // getName->2:     // getName->N:     // ofs = 52640 ord = 1 addr = 0
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	isub 
	bipush 2
	idiv 
	invokevirtual setPositionChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
Label135:
	aload_0 
	aload_0_getfield com.whatsapp.field.DecoratedFieldManager.field_52636   // get_name_1:  com.whatsapp.field.DecoratedFieldManager.field_52636   // get_name_2:  com.whatsapp.field.DecoratedFieldManager.field_52636   // get_Name:    com.whatsapp.field.DecoratedFieldManager.field_52636   // getName->1:     // getName->2:     // getName->N:     // ofs = 52636 ord = 0 addr = 0
	iload 9
	iload_3 
	aload_0_getfield com.whatsapp.field.DecoratedFieldManager.field_52636   // get_name_1:  com.whatsapp.field.DecoratedFieldManager.field_52636   // get_name_2:  com.whatsapp.field.DecoratedFieldManager.field_52636   // get_Name:    com.whatsapp.field.DecoratedFieldManager.field_52636   // getName->1:     // getName->2:     // getName->N:     // ofs = 52636 ord = 0 addr = 0
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	isub 
	bipush 2
	idiv 
	invokevirtual setPositionChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
	aload_0_getfield com.whatsapp.field.DecoratedFieldManager.field_52644   // get_name_1:  com.whatsapp.field.DecoratedFieldManager.field_52644   // get_name_2:  com.whatsapp.field.DecoratedFieldManager.field_52644   // get_Name:    com.whatsapp.field.DecoratedFieldManager.field_52644   // getName->1:     // getName->2:     // getName->N:     // ofs = 52644 ord = 2 addr = 0
	ifnull Label162
	aload_0 
	aload_0_getfield com.whatsapp.field.DecoratedFieldManager.field_52644   // get_name_1:  com.whatsapp.field.DecoratedFieldManager.field_52644   // get_name_2:  com.whatsapp.field.DecoratedFieldManager.field_52644   // get_Name:    com.whatsapp.field.DecoratedFieldManager.field_52644   // getName->1:     // getName->2:     // getName->N:     // ofs = 52644 ord = 2 addr = 0
	iload 9
	aload_0_getfield com.whatsapp.field.DecoratedFieldManager.field_52636   // get_name_1:  com.whatsapp.field.DecoratedFieldManager.field_52636   // get_name_2:  com.whatsapp.field.DecoratedFieldManager.field_52636   // get_Name:    com.whatsapp.field.DecoratedFieldManager.field_52636   // getName->1:     // getName->2:     // getName->N:     // ofs = 52636 ord = 0 addr = 0
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	iload_7 
	iadd 
	iload_3 
	aload_0_getfield com.whatsapp.field.DecoratedFieldManager.field_52644   // get_name_1:  com.whatsapp.field.DecoratedFieldManager.field_52644   // get_name_2:  com.whatsapp.field.DecoratedFieldManager.field_52644   // get_Name:    com.whatsapp.field.DecoratedFieldManager.field_52644   // getName->1:     // getName->2:     // getName->N:     // ofs = 52644 ord = 2 addr = 0
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	isub 
	bipush 2
	idiv 
	invokevirtual setPositionChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
Label162:
	aload_0 
	iload_1 
	iload_3 
	invokevirtual setExtent( net.rim.device.api.ui.Field, int, int ) // pc=3
	return 
	}

}
