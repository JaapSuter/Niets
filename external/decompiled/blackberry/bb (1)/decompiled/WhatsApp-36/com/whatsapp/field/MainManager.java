// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-36.cod
// Module version  : 2.7.3204
// Class ID        : 9
// ########################################################


package com.whatsapp.field;


abstract public final class MainManager extends net.rim.device.api.ui.Manager
implements com.whatsapp.field.

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.device.api.ui.Field /*net.rim.device.api.ui.Field*/  field_52928 ; // ofs = 52928 addr = 0)
	private boolean /*boolean*/  field_52932 ; // ofs = 52932 addr = 0)
	private net.rim.device.api.ui.Field /*net.rim.device.api.ui.Field*/  field_52936 ; // ofs = 52936 addr = 0)
	private boolean /*boolean*/  field_52940 ; // ofs = 52940 addr = 0)
	private final com.whatsapp.field.WAVerticalFieldManager /*com.whatsapp.field.WAVerticalFieldManager*/  field_52944 ; // ofs = 52944 addr = 0)
	private net.rim.device.api.ui.Field /*net.rim.device.api.ui.Field*/  field_52948 ; // ofs = 52948 addr = 0)
	private net.rim.device.api.ui.Field /*net.rim.device.api.ui.Field*/  field_52952 ; // ofs = 52952 addr = 0)
	private net.rim.device.api.ui.Field /*net.rim.device.api.ui.Field*/  field_52956 ; // ofs = 52956 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.field.MainManager, long ); // address: 0
	{
	enter 
	aload_0 
	lipush 2814749767106560
	invokespecial_lib net.rim.device.api.ui.Manager.<init> // pc=3
	aload_0 
	new_lib com.whatsapp.field.WAVerticalFieldManager//com.whatsapp.field.WAVerticalFieldManager com.whatsapp.field.WAVerticalFieldManager com.whatsapp.field.WAVerticalFieldManager
	dup 
	lload 1
	invokespecial_lib .routine_5802 // pc=3
	putfield com.whatsapp.field.MainManager.field_52944   // get_name_1:  com.whatsapp.field.MainManager.field_52944   // get_name_2:  com.whatsapp.field.MainManager.field_52944   // get_Name:    com.whatsapp.field.MainManager.field_52944   // getName->1:     // getName->2:     // getName->N:     // ofs = 52944 ord = 4 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.field.MainManager.field_52944   // get_name_1:  com.whatsapp.field.MainManager.field_52944   // get_name_2:  com.whatsapp.field.MainManager.field_52944   // get_Name:    com.whatsapp.field.MainManager.field_52944   // getName->1:     // getName->2:     // getName->N:     // ofs = 52944 ord = 4 addr = 0
	invokespecial_lib net.rim.device.api.ui.Manager.add // pc=2
	return 
	}


static private final com.whatsapp.field.MainManager.routine_7240( net.rim.device.api.ui.Graphics, net.rim.device.api.ui.Field ); // address: 0
	{
	enter 
	getstatic_lib module:WhatsApp-7.class#21.static_50 // class#21
	astore_2 
	aload_1 
	invokevirtual net.rim.device.api.ui.XYRect getContentRect( net.rim.device.api.ui.Field ) // pc=1
	astore_3 
	aload_3 
	dup 
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	aload_2 
	invokevirtual int getBottom( net.rim.device.api.ui.decor.Border ) // pc=1
	iadd 
	putfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	aload_2 
	aload_0 
	aload_3 
	invokevirtual paint( net.rim.device.api.ui.decor.Border, net.rim.device.api.ui.Graphics, net.rim.device.api.ui.XYRect ) // pc=3
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final net.rim.device.api.ui.XYRect com.whatsapp.field.MainManager.routine_6725( com.whatsapp.field.MainManager, int, int, net.rim.device.api.ui.Field, net.rim.device.api.ui.XYRect ); // address: 0
	{
	enter 
	new_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	dup 
	invokespecial_lib net.rim.device.api.ui.XYRect.<init> // pc=1
	astore_5 
	aload_5 
	iload_1 
	aload_3 
	invokevirtual int getMarginLeft( net.rim.device.api.ui.Field ) // pc=1
	aload_3 
	invokevirtual int getMarginRight( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	isub 
	putfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	aload_5 
	aload_4 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	aload_4 
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	iadd 
	aload_3 
	invokevirtual int getMarginTop( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	putfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	aload_5 
	iconst_1 
	iload_2 
	aload_5 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	isub 
	aload_3 
	invokevirtual int getMarginBottom( net.rim.device.api.ui.Field ) // pc=1
	isub 
	invokestatic_lib int max( int, int ) // Math
	putfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	aload_0 
	aload_3 
	aload_5 
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	aload_5 
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	invokevirtual layoutChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
	aload_5 
	aload_3 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	putfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	aload_5 
	aload_5 
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	aload_3 
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	invokestatic_lib int min( int, int ) // Math
	putfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	aload_3 
	invokevirtual int getMarginLeft( net.rim.device.api.ui.Field ) // pc=1
	aload_4 
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	aload_4 
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	iconst_1 
	iushr 
	iadd 
	aload_5 
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	iconst_1 
	iushr 
	isub 
	invokestatic_lib int max( int, int ) // Math
	istore_6 
	aload_5 
	iload_6 
	iload_1 
	aload_3 
	invokevirtual int getMarginRight( net.rim.device.api.ui.Field ) // pc=1
	isub 
	aload_3 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	isub 
	invokestatic_lib int min( int, int ) // Math
	putfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	aload_5 
	areturn 
	}


private final net.rim.device.api.ui.XYRect com.whatsapp.field.MainManager.routine_6888( com.whatsapp.field.MainManager, int, net.rim.device.api.ui.Field, net.rim.device.api.ui.XYRect ); // address: 0
	{
	enter 
	new_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	dup 
	invokespecial_lib net.rim.device.api.ui.XYRect.<init> // pc=1
	astore_4 
	aload_4 
	iload_1 
	aload_2 
	invokevirtual int getMarginLeft( net.rim.device.api.ui.Field ) // pc=1
	aload_2 
	invokevirtual int getMarginRight( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	isub 
	putfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	aload_3 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	aload_2 
	invokevirtual int getMarginTop( net.rim.device.api.ui.Field ) // pc=1
	isub 
	aload_2 
	invokevirtual int getMarginBottom( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	istore_5 
	aload_4 
	iconst_1 
	iload_5 
	invokestatic_lib int max( int, int ) // Math
	putfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	aload_0 
	aload_2 
	aload_4 
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	aload_4 
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	invokevirtual layoutChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
	aload_4 
	aload_2 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	putfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	aload_4 
	aload_4 
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	aload_2 
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	invokestatic_lib int min( int, int ) // Math
	putfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	aload_2 
	invokevirtual int getMarginLeft( net.rim.device.api.ui.Field ) // pc=1
	aload_3 
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	aload_3 
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	iconst_1 
	iushr 
	iadd 
	aload_4 
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	iconst_1 
	iushr 
	isub 
	invokestatic_lib int max( int, int ) // Math
	istore_6 
	aload_4 
	iload_6 
	iload_1 
	aload_2 
	invokevirtual int getMarginRight( net.rim.device.api.ui.Field ) // pc=1
	isub 
	aload_2 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	isub 
	invokestatic_lib int min( int, int ) // Math
	putfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	aload_3 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	aload_2 
	invokevirtual int getMarginBottom( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	istore_7 
	aload_4 
	iload_7 
	aload_2 
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	isub 
	putfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	aload_4 
	areturn 
	}


private final net.rim.device.api.ui.XYRect com.whatsapp.field.MainManager.routine_7065( com.whatsapp.field.MainManager, net.rim.device.api.ui.Field ); // address: 0
	{
	enter 
	new_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	dup 
	invokespecial_lib net.rim.device.api.ui.XYRect.<init> // pc=1
	astore_2 
	aload_1 
	aload_2 
	invokevirtual getExtent( net.rim.device.api.ui.Field, net.rim.device.api.ui.XYRect ) // pc=2
	aload_1 
	invokevirtual net.rim.device.api.ui.Manager getManager( net.rim.device.api.ui.Field ) // pc=1
	astore_3 
Label11:
	aload_3 
	ifnull Label44
	aload_3 
	aload_0 
	if_acmpne Label18
	aload_2 
	areturn 
Label18:
	aload_2 
	dup 
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	aload_3 
	invokevirtual net.rim.device.api.ui.XYRect getExtent( net.rim.device.api.ui.Field ) // pc=1
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	aload_3 
	invokevirtual int getHorizontalScroll( net.rim.device.api.ui.Manager ) // pc=1
	isub 
	iadd 
	putfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	aload_2 
	dup 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	aload_3 
	invokevirtual net.rim.device.api.ui.XYRect getExtent( net.rim.device.api.ui.Field ) // pc=1
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	aload_3 
	invokevirtual int getVerticalScroll( net.rim.device.api.ui.Manager ) // pc=1
	isub 
	iadd 
	putfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	aload_3 
	invokevirtual net.rim.device.api.ui.Manager getManager( net.rim.device.api.ui.Field ) // pc=1
	astore_3 
	goto Label11
Label44:
	aload_2 
	areturn 
	}


private final com.whatsapp.field.MainManager.routine_7156( com.whatsapp.field.MainManager, net.rim.device.api.ui.Field ); // address: 0
	{
	jumpspecial_lib add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field )
	}


private final com.whatsapp.field.MainManager.routine_7169( com.whatsapp.field.MainManager, net.rim.device.api.ui.Field ); // address: 0
	{
	jumpspecial_lib delete( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field )
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final net.rim.device.api.ui.Field getTitle( com.whatsapp.field.MainManager ); // address: 0
	{
	areturn_field com.whatsapp.field.MainManager.field_52928   // get_name_1:  com.whatsapp.field.MainManager.field_52928   // get_name_2:  com.whatsapp.field.MainManager.field_52928   // get_Name:    com.whatsapp.field.MainManager.field_52928   // getName->1:     // getName->2:     // getName->N:     // ofs = 52928 ord = 0 addr = 0
	}


public final setTitle( com.whatsapp.field.MainManager, net.rim.device.api.ui.Field ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.field.MainManager.field_52928   // get_name_1:  com.whatsapp.field.MainManager.field_52928   // get_name_2:  com.whatsapp.field.MainManager.field_52928   // get_Name:    com.whatsapp.field.MainManager.field_52928   // getName->1:     // getName->2:     // getName->N:     // ofs = 52928 ord = 0 addr = 0
	ifnull Label9
	aload_1 
	ifnull Label9
	new_lib net.rim.device.api.util.IntHashtable//net.rim.device.api.util.IntHashtable net.rim.device.api.util.IntHashtable net.rim.device.api.util.IntHashtable
	dup 
	invokespecial_lib java.lang.IllegalArgumentException.<init> // pc=1
	athrow 
Label9:
	aload_0_getfield com.whatsapp.field.MainManager.field_52928   // get_name_1:  com.whatsapp.field.MainManager.field_52928   // get_name_2:  com.whatsapp.field.MainManager.field_52928   // get_Name:    com.whatsapp.field.MainManager.field_52928   // getName->1:     // getName->2:     // getName->N:     // ofs = 52928 ord = 0 addr = 0
	ifnull Label19
	aload_0_getfield com.whatsapp.field.MainManager.field_52928   // get_name_1:  com.whatsapp.field.MainManager.field_52928   // get_name_2:  com.whatsapp.field.MainManager.field_52928   // get_Name:    com.whatsapp.field.MainManager.field_52928   // getName->1:     // getName->2:     // getName->N:     // ofs = 52928 ord = 0 addr = 0
	astore_2 
	aload_0 
	aconst_null 
	putfield com.whatsapp.field.MainManager.field_52928   // get_name_1:  com.whatsapp.field.MainManager.field_52928   // get_name_2:  com.whatsapp.field.MainManager.field_52928   // get_Name:    com.whatsapp.field.MainManager.field_52928   // getName->1:     // getName->2:     // getName->N:     // ofs = 52928 ord = 0 addr = 0
	aload_0 
	aload_2 
	invokespecial_lib net.rim.device.api.ui.Manager.delete // pc=2
Label19:
	aload_0 
	aload_1 
	putfield com.whatsapp.field.MainManager.field_52928   // get_name_1:  com.whatsapp.field.MainManager.field_52928   // get_name_2:  com.whatsapp.field.MainManager.field_52928   // get_Name:    com.whatsapp.field.MainManager.field_52928   // getName->1:     // getName->2:     // getName->N:     // ofs = 52928 ord = 0 addr = 0
	aload_0_getfield com.whatsapp.field.MainManager.field_52928   // get_name_1:  com.whatsapp.field.MainManager.field_52928   // get_name_2:  com.whatsapp.field.MainManager.field_52928   // get_Name:    com.whatsapp.field.MainManager.field_52928   // getName->1:     // getName->2:     // getName->N:     // ofs = 52928 ord = 0 addr = 0
	ifnull Label29
	aload_0 
	aload_0_getfield com.whatsapp.field.MainManager.field_52928   // get_name_1:  com.whatsapp.field.MainManager.field_52928   // get_name_2:  com.whatsapp.field.MainManager.field_52928   // get_Name:    com.whatsapp.field.MainManager.field_52928   // getName->1:     // getName->2:     // getName->N:     // ofs = 52928 ord = 0 addr = 0
	aload_0_getfield com.whatsapp.field.MainManager.field_52944   // get_name_1:  com.whatsapp.field.MainManager.field_52944   // get_name_2:  com.whatsapp.field.MainManager.field_52944   // get_Name:    com.whatsapp.field.MainManager.field_52944   // getName->1:     // getName->2:     // getName->N:     // ofs = 52944 ord = 4 addr = 0
	invokevirtual int getIndex( net.rim.device.api.ui.Field ) // pc=1
	invokespecial_lib net.rim.device.api.ui.Manager.insert // pc=3
Label29:
	return 
	}


public final net.rim.device.api.ui.Field getBanner( com.whatsapp.field.MainManager ); // address: 0
	{
	areturn_field com.whatsapp.field.MainManager.field_52936   // get_name_1:  com.whatsapp.field.MainManager.field_52936   // get_name_2:  com.whatsapp.field.MainManager.field_52936   // get_Name:    com.whatsapp.field.MainManager.field_52936   // getName->1:     // getName->2:     // getName->N:     // ofs = 52936 ord = 2 addr = 0
	}


public final setBanner( com.whatsapp.field.MainManager, net.rim.device.api.ui.Field ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.field.MainManager.field_52936   // get_name_1:  com.whatsapp.field.MainManager.field_52936   // get_name_2:  com.whatsapp.field.MainManager.field_52936   // get_Name:    com.whatsapp.field.MainManager.field_52936   // getName->1:     // getName->2:     // getName->N:     // ofs = 52936 ord = 2 addr = 0
	ifnull Label9
	aload_1 
	ifnull Label9
	new_lib net.rim.device.api.util.IntHashtable//net.rim.device.api.util.IntHashtable net.rim.device.api.util.IntHashtable net.rim.device.api.util.IntHashtable
	dup 
	invokespecial_lib java.lang.IllegalArgumentException.<init> // pc=1
	athrow 
Label9:
	aload_0_getfield com.whatsapp.field.MainManager.field_52936   // get_name_1:  com.whatsapp.field.MainManager.field_52936   // get_name_2:  com.whatsapp.field.MainManager.field_52936   // get_Name:    com.whatsapp.field.MainManager.field_52936   // getName->1:     // getName->2:     // getName->N:     // ofs = 52936 ord = 2 addr = 0
	ifnull Label19
	aload_0_getfield com.whatsapp.field.MainManager.field_52936   // get_name_1:  com.whatsapp.field.MainManager.field_52936   // get_name_2:  com.whatsapp.field.MainManager.field_52936   // get_Name:    com.whatsapp.field.MainManager.field_52936   // getName->1:     // getName->2:     // getName->N:     // ofs = 52936 ord = 2 addr = 0
	astore_2 
	aload_0 
	aconst_null 
	putfield com.whatsapp.field.MainManager.field_52936   // get_name_1:  com.whatsapp.field.MainManager.field_52936   // get_name_2:  com.whatsapp.field.MainManager.field_52936   // get_Name:    com.whatsapp.field.MainManager.field_52936   // getName->1:     // getName->2:     // getName->N:     // ofs = 52936 ord = 2 addr = 0
	aload_0 
	aload_2 
	invokespecial_lib net.rim.device.api.ui.Manager.delete // pc=2
Label19:
	aload_0 
	aload_1 
	putfield com.whatsapp.field.MainManager.field_52936   // get_name_1:  com.whatsapp.field.MainManager.field_52936   // get_name_2:  com.whatsapp.field.MainManager.field_52936   // get_Name:    com.whatsapp.field.MainManager.field_52936   // getName->1:     // getName->2:     // getName->N:     // ofs = 52936 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.field.MainManager.field_52936   // get_name_1:  com.whatsapp.field.MainManager.field_52936   // get_name_2:  com.whatsapp.field.MainManager.field_52936   // get_Name:    com.whatsapp.field.MainManager.field_52936   // getName->1:     // getName->2:     // getName->N:     // ofs = 52936 ord = 2 addr = 0
	ifnull Label28
	aload_0 
	aload_0_getfield com.whatsapp.field.MainManager.field_52936   // get_name_1:  com.whatsapp.field.MainManager.field_52936   // get_name_2:  com.whatsapp.field.MainManager.field_52936   // get_Name:    com.whatsapp.field.MainManager.field_52936   // getName->1:     // getName->2:     // getName->N:     // ofs = 52936 ord = 2 addr = 0
	iconst_0 
	invokespecial_lib net.rim.device.api.ui.Manager.insert // pc=3
Label28:
	return 
	}


public final setBannerShadow( com.whatsapp.field.MainManager, boolean ); // address: 0
	{
	putfield_return com.whatsapp.field.MainManager.field_52940   // get_name_1:  com.whatsapp.field.MainManager.field_52940   // get_name_2:  com.whatsapp.field.MainManager.field_52940   // get_Name:    com.whatsapp.field.MainManager.field_52940   // getName->1:     // getName->2:     // getName->N:     // ofs = 52940 ord = 3 addr = 0
	}


protected final int nextFocus( com.whatsapp.field.MainManager, int, int ); // address: 0
	{
	enter_narrow 
	iload_2 
	iconst_1 
	if_icmpne Label6
	bipush -1
	ireturn 
Label6:
	aload_0 
	iload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.Manager.nextFocus // pc=3
	ireturn 
	}


public final com.whatsapp.field.WAVerticalFieldManager getMainContent( com.whatsapp.field.MainManager ); // address: 0
	{
	areturn_field com.whatsapp.field.MainManager.field_52944   // get_name_1:  com.whatsapp.field.MainManager.field_52944   // get_name_2:  com.whatsapp.field.MainManager.field_52944   // get_Name:    com.whatsapp.field.MainManager.field_52944   // getName->1:     // getName->2:     // getName->N:     // ofs = 52944 ord = 4 addr = 0
	}


public final setStatus( com.whatsapp.field.MainManager, net.rim.device.api.ui.Field ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.field.MainManager.field_52948   // get_name_1:  com.whatsapp.field.MainManager.field_52948   // get_name_2:  com.whatsapp.field.MainManager.field_52948   // get_Name:    com.whatsapp.field.MainManager.field_52948   // getName->1:     // getName->2:     // getName->N:     // ofs = 52948 ord = 5 addr = 0
	ifnull Label9
	aload_1 
	ifnull Label9
	new_lib net.rim.device.api.util.IntHashtable//net.rim.device.api.util.IntHashtable net.rim.device.api.util.IntHashtable net.rim.device.api.util.IntHashtable
	dup 
	invokespecial_lib java.lang.IllegalArgumentException.<init> // pc=1
	athrow 
Label9:
	aload_0_getfield com.whatsapp.field.MainManager.field_52948   // get_name_1:  com.whatsapp.field.MainManager.field_52948   // get_name_2:  com.whatsapp.field.MainManager.field_52948   // get_Name:    com.whatsapp.field.MainManager.field_52948   // getName->1:     // getName->2:     // getName->N:     // ofs = 52948 ord = 5 addr = 0
	ifnull Label19
	aload_0_getfield com.whatsapp.field.MainManager.field_52948   // get_name_1:  com.whatsapp.field.MainManager.field_52948   // get_name_2:  com.whatsapp.field.MainManager.field_52948   // get_Name:    com.whatsapp.field.MainManager.field_52948   // getName->1:     // getName->2:     // getName->N:     // ofs = 52948 ord = 5 addr = 0
	astore_2 
	aload_0 
	aconst_null 
	putfield com.whatsapp.field.MainManager.field_52948   // get_name_1:  com.whatsapp.field.MainManager.field_52948   // get_name_2:  com.whatsapp.field.MainManager.field_52948   // get_Name:    com.whatsapp.field.MainManager.field_52948   // getName->1:     // getName->2:     // getName->N:     // ofs = 52948 ord = 5 addr = 0
	aload_0 
	aload_2 
	invokespecial_lib net.rim.device.api.ui.Manager.delete // pc=2
Label19:
	aload_0 
	aload_1 
	putfield com.whatsapp.field.MainManager.field_52948   // get_name_1:  com.whatsapp.field.MainManager.field_52948   // get_name_2:  com.whatsapp.field.MainManager.field_52948   // get_Name:    com.whatsapp.field.MainManager.field_52948   // getName->1:     // getName->2:     // getName->N:     // ofs = 52948 ord = 5 addr = 0
	aload_0_getfield com.whatsapp.field.MainManager.field_52948   // get_name_1:  com.whatsapp.field.MainManager.field_52948   // get_name_2:  com.whatsapp.field.MainManager.field_52948   // get_Name:    com.whatsapp.field.MainManager.field_52948   // getName->1:     // getName->2:     // getName->N:     // ofs = 52948 ord = 5 addr = 0
	ifnull Label31
	aload_0 
	aload_0_getfield com.whatsapp.field.MainManager.field_52948   // get_name_1:  com.whatsapp.field.MainManager.field_52948   // get_name_2:  com.whatsapp.field.MainManager.field_52948   // get_Name:    com.whatsapp.field.MainManager.field_52948   // getName->1:     // getName->2:     // getName->N:     // ofs = 52948 ord = 5 addr = 0
	aload_0_getfield com.whatsapp.field.MainManager.field_52944   // get_name_1:  com.whatsapp.field.MainManager.field_52944   // get_name_2:  com.whatsapp.field.MainManager.field_52944   // get_Name:    com.whatsapp.field.MainManager.field_52944   // getName->1:     // getName->2:     // getName->N:     // ofs = 52944 ord = 4 addr = 0
	invokevirtual int getIndex( net.rim.device.api.ui.Field ) // pc=1
	iconst_1 
	iadd 
	invokespecial_lib net.rim.device.api.ui.Manager.insert // pc=3
Label31:
	return 
	}


protected final sublayout( com.whatsapp.field.MainManager, int, int ); // address: 0
	{
	enter 
	iconst_0 
	istore_3 
	iload_2 
	istore_4 
	new_lib net.rim.device.api.ui.Field//net.rim.device.api.ui.Field net.rim.device.api.ui.Field net.rim.device.api.ui.Field
	dup 
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=1
	astore_5 
	aload_0_getfield com.whatsapp.field.MainManager.field_52928   // get_name_1:  com.whatsapp.field.MainManager.field_52928   // get_name_2:  com.whatsapp.field.MainManager.field_52928   // get_Name:    com.whatsapp.field.MainManager.field_52928   // getName->1:     // getName->2:     // getName->N:     // ofs = 52928 ord = 0 addr = 0
	ifnull Label53
	aload_0_getfield com.whatsapp.field.MainManager.field_52928   // get_name_1:  com.whatsapp.field.MainManager.field_52928   // get_name_2:  com.whatsapp.field.MainManager.field_52928   // get_Name:    com.whatsapp.field.MainManager.field_52928   // getName->1:     // getName->2:     // getName->N:     // ofs = 52928 ord = 0 addr = 0
	aload_5 
	invokevirtual getMargin( net.rim.device.api.ui.Field, net.rim.device.api.ui.XYEdges ) // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.field.MainManager.field_52928   // get_name_1:  com.whatsapp.field.MainManager.field_52928   // get_name_2:  com.whatsapp.field.MainManager.field_52928   // get_Name:    com.whatsapp.field.MainManager.field_52928   // getName->1:     // getName->2:     // getName->N:     // ofs = 52928 ord = 0 addr = 0
	iload_1 
	aload_5 
	getfield left   // get_name_1:  left   // get_name_2:  left   // get_Name:    left   // getName->1:  left   // getName->2:  left   // getName->N:  left   // ofs = -1 ord = 0 addr = -1
	isub 
	aload_5 
	getfield right   // get_name_1:  right   // get_name_2:  right   // get_Name:    right   // getName->1:  right   // getName->2:  right   // getName->N:  right   // ofs = -1 ord = 1 addr = -1
	isub 
	iload_4 
	iload_3 
	isub 
	aload_5 
	getfield top   // get_name_1:  top   // get_name_2:  top   // get_Name:    top   // getName->1:  top   // getName->2:  top   // getName->N:  top   // ofs = -1 ord = 2 addr = -1
	isub 
	aload_5 
	getfield bottom   // get_name_1:  bottom   // get_name_2:  bottom   // get_Name:    bottom   // getName->1:  bottom   // getName->2:  bottom   // getName->N:  bottom   // ofs = -1 ord = 3 addr = -1
	isub 
	invokevirtual layoutChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
	aload_0 
	aload_0_getfield com.whatsapp.field.MainManager.field_52928   // get_name_1:  com.whatsapp.field.MainManager.field_52928   // get_name_2:  com.whatsapp.field.MainManager.field_52928   // get_Name:    com.whatsapp.field.MainManager.field_52928   // getName->1:     // getName->2:     // getName->N:     // ofs = 52928 ord = 0 addr = 0
	aload_5 
	getfield left   // get_name_1:  left   // get_name_2:  left   // get_Name:    left   // getName->1:  left   // getName->2:  left   // getName->N:  left   // ofs = -1 ord = 0 addr = -1
	iload_3 
	aload_5 
	getfield top   // get_name_1:  top   // get_name_2:  top   // get_Name:    top   // getName->1:  top   // getName->2:  top   // getName->N:  top   // ofs = -1 ord = 2 addr = -1
	iadd 
	invokevirtual setPositionChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
	iload_3 
	aload_0_getfield com.whatsapp.field.MainManager.field_52928   // get_name_1:  com.whatsapp.field.MainManager.field_52928   // get_name_2:  com.whatsapp.field.MainManager.field_52928   // get_Name:    com.whatsapp.field.MainManager.field_52928   // getName->1:     // getName->2:     // getName->N:     // ofs = 52928 ord = 0 addr = 0
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	aload_5 
	getfield top   // get_name_1:  top   // get_name_2:  top   // get_Name:    top   // getName->1:  top   // getName->2:  top   // getName->N:  top   // ofs = -1 ord = 2 addr = -1
	iadd 
	aload_5 
	getfield bottom   // get_name_1:  bottom   // get_name_2:  bottom   // get_Name:    bottom   // getName->1:  bottom   // getName->2:  bottom   // getName->N:  bottom   // ofs = -1 ord = 3 addr = -1
	iadd 
	iadd 
	istore_3 
Label53:
	aload_0_getfield com.whatsapp.field.MainManager.field_52936   // get_name_1:  com.whatsapp.field.MainManager.field_52936   // get_name_2:  com.whatsapp.field.MainManager.field_52936   // get_Name:    com.whatsapp.field.MainManager.field_52936   // getName->1:     // getName->2:     // getName->N:     // ofs = 52936 ord = 2 addr = 0
	ifnull Label97
	aload_0_getfield com.whatsapp.field.MainManager.field_52936   // get_name_1:  com.whatsapp.field.MainManager.field_52936   // get_name_2:  com.whatsapp.field.MainManager.field_52936   // get_Name:    com.whatsapp.field.MainManager.field_52936   // getName->1:     // getName->2:     // getName->N:     // ofs = 52936 ord = 2 addr = 0
	aload_5 
	invokevirtual getMargin( net.rim.device.api.ui.Field, net.rim.device.api.ui.XYEdges ) // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.field.MainManager.field_52936   // get_name_1:  com.whatsapp.field.MainManager.field_52936   // get_name_2:  com.whatsapp.field.MainManager.field_52936   // get_Name:    com.whatsapp.field.MainManager.field_52936   // getName->1:     // getName->2:     // getName->N:     // ofs = 52936 ord = 2 addr = 0
	iload_1 
	aload_5 
	getfield left   // get_name_1:  left   // get_name_2:  left   // get_Name:    left   // getName->1:  left   // getName->2:  left   // getName->N:  left   // ofs = -1 ord = 0 addr = -1
	isub 
	aload_5 
	getfield right   // get_name_1:  right   // get_name_2:  right   // get_Name:    right   // getName->1:  right   // getName->2:  right   // getName->N:  right   // ofs = -1 ord = 1 addr = -1
	isub 
	iload_4 
	iload_3 
	isub 
	aload_5 
	getfield top   // get_name_1:  top   // get_name_2:  top   // get_Name:    top   // getName->1:  top   // getName->2:  top   // getName->N:  top   // ofs = -1 ord = 2 addr = -1
	isub 
	aload_5 
	getfield bottom   // get_name_1:  bottom   // get_name_2:  bottom   // get_Name:    bottom   // getName->1:  bottom   // getName->2:  bottom   // getName->N:  bottom   // ofs = -1 ord = 3 addr = -1
	isub 
	invokevirtual layoutChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
	aload_0 
	aload_0_getfield com.whatsapp.field.MainManager.field_52936   // get_name_1:  com.whatsapp.field.MainManager.field_52936   // get_name_2:  com.whatsapp.field.MainManager.field_52936   // get_Name:    com.whatsapp.field.MainManager.field_52936   // getName->1:     // getName->2:     // getName->N:     // ofs = 52936 ord = 2 addr = 0
	aload_5 
	getfield left   // get_name_1:  left   // get_name_2:  left   // get_Name:    left   // getName->1:  left   // getName->2:  left   // getName->N:  left   // ofs = -1 ord = 0 addr = -1
	iload_3 
	aload_5 
	getfield top   // get_name_1:  top   // get_name_2:  top   // get_Name:    top   // getName->1:  top   // getName->2:  top   // getName->N:  top   // ofs = -1 ord = 2 addr = -1
	iadd 
	invokevirtual setPositionChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
	iload_3 
	aload_0_getfield com.whatsapp.field.MainManager.field_52936   // get_name_1:  com.whatsapp.field.MainManager.field_52936   // get_name_2:  com.whatsapp.field.MainManager.field_52936   // get_Name:    com.whatsapp.field.MainManager.field_52936   // getName->1:     // getName->2:     // getName->N:     // ofs = 52936 ord = 2 addr = 0
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	aload_5 
	getfield top   // get_name_1:  top   // get_name_2:  top   // get_Name:    top   // getName->1:  top   // getName->2:  top   // getName->N:  top   // ofs = -1 ord = 2 addr = -1
	iadd 
	aload_5 
	getfield bottom   // get_name_1:  bottom   // get_name_2:  bottom   // get_Name:    bottom   // getName->1:  bottom   // getName->2:  bottom   // getName->N:  bottom   // ofs = -1 ord = 3 addr = -1
	iadd 
	iadd 
	istore_3 
Label97:
	aload_0_getfield com.whatsapp.field.MainManager.field_52948   // get_name_1:  com.whatsapp.field.MainManager.field_52948   // get_name_2:  com.whatsapp.field.MainManager.field_52948   // get_Name:    com.whatsapp.field.MainManager.field_52948   // getName->1:     // getName->2:     // getName->N:     // ofs = 52948 ord = 5 addr = 0
	ifnull Label140
	aload_0_getfield com.whatsapp.field.MainManager.field_52948   // get_name_1:  com.whatsapp.field.MainManager.field_52948   // get_name_2:  com.whatsapp.field.MainManager.field_52948   // get_Name:    com.whatsapp.field.MainManager.field_52948   // getName->1:     // getName->2:     // getName->N:     // ofs = 52948 ord = 5 addr = 0
	aload_5 
	invokevirtual getMargin( net.rim.device.api.ui.Field, net.rim.device.api.ui.XYEdges ) // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.field.MainManager.field_52948   // get_name_1:  com.whatsapp.field.MainManager.field_52948   // get_name_2:  com.whatsapp.field.MainManager.field_52948   // get_Name:    com.whatsapp.field.MainManager.field_52948   // getName->1:     // getName->2:     // getName->N:     // ofs = 52948 ord = 5 addr = 0
	iload_1 
	aload_5 
	getfield left   // get_name_1:  left   // get_name_2:  left   // get_Name:    left   // getName->1:  left   // getName->2:  left   // getName->N:  left   // ofs = -1 ord = 0 addr = -1
	isub 
	aload_5 
	getfield right   // get_name_1:  right   // get_name_2:  right   // get_Name:    right   // getName->1:  right   // getName->2:  right   // getName->N:  right   // ofs = -1 ord = 1 addr = -1
	isub 
	iload_4 
	iload_3 
	isub 
	aload_5 
	getfield top   // get_name_1:  top   // get_name_2:  top   // get_Name:    top   // getName->1:  top   // getName->2:  top   // getName->N:  top   // ofs = -1 ord = 2 addr = -1
	isub 
	aload_5 
	getfield bottom   // get_name_1:  bottom   // get_name_2:  bottom   // get_Name:    bottom   // getName->1:  bottom   // getName->2:  bottom   // getName->N:  bottom   // ofs = -1 ord = 3 addr = -1
	isub 
	invokevirtual layoutChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
	iload_4 
	aload_0_getfield com.whatsapp.field.MainManager.field_52948   // get_name_1:  com.whatsapp.field.MainManager.field_52948   // get_name_2:  com.whatsapp.field.MainManager.field_52948   // get_Name:    com.whatsapp.field.MainManager.field_52948   // getName->1:     // getName->2:     // getName->N:     // ofs = 52948 ord = 5 addr = 0
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	aload_5 
	getfield bottom   // get_name_1:  bottom   // get_name_2:  bottom   // get_Name:    bottom   // getName->1:  bottom   // getName->2:  bottom   // getName->N:  bottom   // ofs = -1 ord = 3 addr = -1
	isub 
	isub 
	istore_4 
	aload_0 
	aload_0_getfield com.whatsapp.field.MainManager.field_52948   // get_name_1:  com.whatsapp.field.MainManager.field_52948   // get_name_2:  com.whatsapp.field.MainManager.field_52948   // get_Name:    com.whatsapp.field.MainManager.field_52948   // getName->1:     // getName->2:     // getName->N:     // ofs = 52948 ord = 5 addr = 0
	aload_5 
	getfield left   // get_name_1:  left   // get_name_2:  left   // get_Name:    left   // getName->1:  left   // getName->2:  left   // getName->N:  left   // ofs = -1 ord = 0 addr = -1
	iload_4 
	invokevirtual setPositionChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
	iload_4 
	aload_5 
	getfield top   // get_name_1:  top   // get_name_2:  top   // get_Name:    top   // getName->1:  top   // getName->2:  top   // getName->N:  top   // ofs = -1 ord = 2 addr = -1
	isub 
	istore_4 
Label140:
	aload_0_getfield com.whatsapp.field.MainManager.field_52944   // get_name_1:  com.whatsapp.field.MainManager.field_52944   // get_name_2:  com.whatsapp.field.MainManager.field_52944   // get_Name:    com.whatsapp.field.MainManager.field_52944   // getName->1:     // getName->2:     // getName->N:     // ofs = 52944 ord = 4 addr = 0
	aload_5 
	invokevirtual getMargin( net.rim.device.api.ui.Field, net.rim.device.api.ui.XYEdges ) // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.field.MainManager.field_52944   // get_name_1:  com.whatsapp.field.MainManager.field_52944   // get_name_2:  com.whatsapp.field.MainManager.field_52944   // get_Name:    com.whatsapp.field.MainManager.field_52944   // getName->1:     // getName->2:     // getName->N:     // ofs = 52944 ord = 4 addr = 0
	iload_1 
	aload_5 
	getfield left   // get_name_1:  left   // get_name_2:  left   // get_Name:    left   // getName->1:  left   // getName->2:  left   // getName->N:  left   // ofs = -1 ord = 0 addr = -1
	isub 
	aload_5 
	getfield right   // get_name_1:  right   // get_name_2:  right   // get_Name:    right   // getName->1:  right   // getName->2:  right   // getName->N:  right   // ofs = -1 ord = 1 addr = -1
	isub 
	iload_4 
	iload_3 
	isub 
	aload_5 
	getfield top   // get_name_1:  top   // get_name_2:  top   // get_Name:    top   // getName->1:  top   // getName->2:  top   // getName->N:  top   // ofs = -1 ord = 2 addr = -1
	isub 
	aload_5 
	getfield bottom   // get_name_1:  bottom   // get_name_2:  bottom   // get_Name:    bottom   // getName->1:  bottom   // getName->2:  bottom   // getName->N:  bottom   // ofs = -1 ord = 3 addr = -1
	isub 
	invokevirtual layoutChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
	aload_0 
	aload_0_getfield com.whatsapp.field.MainManager.field_52944   // get_name_1:  com.whatsapp.field.MainManager.field_52944   // get_name_2:  com.whatsapp.field.MainManager.field_52944   // get_Name:    com.whatsapp.field.MainManager.field_52944   // getName->1:     // getName->2:     // getName->N:     // ofs = 52944 ord = 4 addr = 0
	aload_5 
	getfield left   // get_name_1:  left   // get_name_2:  left   // get_Name:    left   // getName->1:  left   // getName->2:  left   // getName->N:  left   // ofs = -1 ord = 0 addr = -1
	iload_3 
	aload_5 
	getfield top   // get_name_1:  top   // get_name_2:  top   // get_Name:    top   // getName->1:  top   // getName->2:  top   // getName->N:  top   // ofs = -1 ord = 2 addr = -1
	iadd 
	invokevirtual setPositionChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
	aload_0_getfield com.whatsapp.field.MainManager.field_52952   // get_name_1:  com.whatsapp.field.MainManager.field_52952   // get_name_2:  com.whatsapp.field.MainManager.field_52952   // get_Name:    com.whatsapp.field.MainManager.field_52952   // getName->1:     // getName->2:     // getName->N:     // ofs = 52952 ord = 6 addr = 0
	ifnull Label217
	aload_0 
	aload_0_getfield com.whatsapp.field.MainManager.field_52956   // get_name_1:  com.whatsapp.field.MainManager.field_52956   // get_name_2:  com.whatsapp.field.MainManager.field_52956   // get_Name:    com.whatsapp.field.MainManager.field_52956   // getName->1:     // getName->2:     // getName->N:     // ofs = 52956 ord = 7 addr = 0
	invokespecial com.whatsapp.field.MainManager.routine_7065 // pc=2
	astore_6 
	aload_0 
	iload_1 
	iload_2 
	aload_0_getfield com.whatsapp.field.MainManager.field_52952   // get_name_1:  com.whatsapp.field.MainManager.field_52952   // get_name_2:  com.whatsapp.field.MainManager.field_52952   // get_Name:    com.whatsapp.field.MainManager.field_52952   // getName->1:     // getName->2:     // getName->N:     // ofs = 52952 ord = 6 addr = 0
	aload_6 
	invokespecial com.whatsapp.field.MainManager.routine_6725 // pc=5
	astore_7 
	aload_0 
	iload_1 
	aload_0_getfield com.whatsapp.field.MainManager.field_52952   // get_name_1:  com.whatsapp.field.MainManager.field_52952   // get_name_2:  com.whatsapp.field.MainManager.field_52952   // get_Name:    com.whatsapp.field.MainManager.field_52952   // getName->1:     // getName->2:     // getName->N:     // ofs = 52952 ord = 6 addr = 0
	aload_6 
	invokespecial com.whatsapp.field.MainManager.routine_6888 // pc=4
	astore 8
	aload_7 
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	aload 8
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	if_icmpge Label203
	aload_0 
	aload_0_getfield com.whatsapp.field.MainManager.field_52952   // get_name_1:  com.whatsapp.field.MainManager.field_52952   // get_name_2:  com.whatsapp.field.MainManager.field_52952   // get_Name:    com.whatsapp.field.MainManager.field_52952   // getName->1:     // getName->2:     // getName->N:     // ofs = 52952 ord = 6 addr = 0
	aload 8
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	aload 8
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	invokevirtual setPositionChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
	goto Label217
Label203:
	aload_0 
	iload_1 
	iload_2 
	aload_0_getfield com.whatsapp.field.MainManager.field_52952   // get_name_1:  com.whatsapp.field.MainManager.field_52952   // get_name_2:  com.whatsapp.field.MainManager.field_52952   // get_Name:    com.whatsapp.field.MainManager.field_52952   // getName->1:     // getName->2:     // getName->N:     // ofs = 52952 ord = 6 addr = 0
	aload_6 
	invokespecial com.whatsapp.field.MainManager.routine_6725 // pc=5
	astore_7 
	aload_0 
	aload_0_getfield com.whatsapp.field.MainManager.field_52952   // get_name_1:  com.whatsapp.field.MainManager.field_52952   // get_name_2:  com.whatsapp.field.MainManager.field_52952   // get_Name:    com.whatsapp.field.MainManager.field_52952   // getName->1:     // getName->2:     // getName->N:     // ofs = 52952 ord = 6 addr = 0
	aload_7 
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	aload_7 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	invokevirtual setPositionChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
Label217:
	aload_0 
	iload_1 
	iload_2 
	invokevirtual setExtent( net.rim.device.api.ui.Field, int, int ) // pc=3
	aload_0 
	iload_1 
	iload_2 
	invokevirtual setVirtualExtent( net.rim.device.api.ui.Manager, int, int ) // pc=3
	return 
	}


protected final subpaint( com.whatsapp.field.MainManager, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual int getBackgroundColor( net.rim.device.api.ui.Graphics ) // pc=1
	istore_2 
	aload_1 
	invokevirtual int getColor( net.rim.device.api.ui.Graphics ) // pc=1
	istore_3 
	aload_1 
	iconst_0 
	invokevirtual setBackgroundColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	iipush 16777215
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	new_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	dup 
	invokespecial_lib net.rim.device.api.ui.XYRect.<init> // pc=1
	astore_4 
	new_lib net.rim.device.api.ui.Field//net.rim.device.api.ui.Field net.rim.device.api.ui.Field net.rim.device.api.ui.Field
	dup 
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=1
	astore_5 
	aload_0_getfield com.whatsapp.field.MainManager.field_52928   // get_name_1:  com.whatsapp.field.MainManager.field_52928   // get_name_2:  com.whatsapp.field.MainManager.field_52928   // get_Name:    com.whatsapp.field.MainManager.field_52928   // getName->1:     // getName->2:     // getName->N:     // ofs = 52928 ord = 0 addr = 0
	ifnull Label51
	aload_0_getfield com.whatsapp.field.MainManager.field_52928   // get_name_1:  com.whatsapp.field.MainManager.field_52928   // get_name_2:  com.whatsapp.field.MainManager.field_52928   // get_Name:    com.whatsapp.field.MainManager.field_52928   // getName->1:     // getName->2:     // getName->N:     // ofs = 52928 ord = 0 addr = 0
	aload_4 
	invokevirtual getExtent( net.rim.device.api.ui.Field, net.rim.device.api.ui.XYRect ) // pc=2
	aload_0_getfield com.whatsapp.field.MainManager.field_52928   // get_name_1:  com.whatsapp.field.MainManager.field_52928   // get_name_2:  com.whatsapp.field.MainManager.field_52928   // get_Name:    com.whatsapp.field.MainManager.field_52928   // getName->1:     // getName->2:     // getName->N:     // ofs = 52928 ord = 0 addr = 0
	aload_5 
	invokevirtual getMargin( net.rim.device.api.ui.Field, net.rim.device.api.ui.XYEdges ) // pc=2
	aload_1 
	iconst_0 
	aload_4 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	aload_5 
	getfield top   // get_name_1:  top   // get_name_2:  top   // get_Name:    top   // getName->1:  top   // getName->2:  top   // getName->N:  top   // ofs = -1 ord = 2 addr = -1
	isub 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	aload_4 
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	aload_5 
	getfield top   // get_name_1:  top   // get_name_2:  top   // get_Name:    top   // getName->1:  top   // getName->2:  top   // getName->N:  top   // ofs = -1 ord = 2 addr = -1
	iadd 
	aload_5 
	getfield bottom   // get_name_1:  bottom   // get_name_2:  bottom   // get_Name:    bottom   // getName->1:  bottom   // getName->2:  bottom   // getName->N:  bottom   // ofs = -1 ord = 3 addr = -1
	iadd 
	invokevirtual clear( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	aload_0 
	aload_1 
	aload_0_getfield com.whatsapp.field.MainManager.field_52928   // get_name_1:  com.whatsapp.field.MainManager.field_52928   // get_name_2:  com.whatsapp.field.MainManager.field_52928   // get_Name:    com.whatsapp.field.MainManager.field_52928   // getName->1:     // getName->2:     // getName->N:     // ofs = 52928 ord = 0 addr = 0
	invokevirtual paintChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Graphics, net.rim.device.api.ui.Field ) // pc=3
Label51:
	aload_0_getfield com.whatsapp.field.MainManager.field_52936   // get_name_1:  com.whatsapp.field.MainManager.field_52936   // get_name_2:  com.whatsapp.field.MainManager.field_52936   // get_Name:    com.whatsapp.field.MainManager.field_52936   // getName->1:     // getName->2:     // getName->N:     // ofs = 52936 ord = 2 addr = 0
	ifnull Label81
	aload_0_getfield com.whatsapp.field.MainManager.field_52936   // get_name_1:  com.whatsapp.field.MainManager.field_52936   // get_name_2:  com.whatsapp.field.MainManager.field_52936   // get_Name:    com.whatsapp.field.MainManager.field_52936   // getName->1:     // getName->2:     // getName->N:     // ofs = 52936 ord = 2 addr = 0
	aload_4 
	invokevirtual getExtent( net.rim.device.api.ui.Field, net.rim.device.api.ui.XYRect ) // pc=2
	aload_0_getfield com.whatsapp.field.MainManager.field_52936   // get_name_1:  com.whatsapp.field.MainManager.field_52936   // get_name_2:  com.whatsapp.field.MainManager.field_52936   // get_Name:    com.whatsapp.field.MainManager.field_52936   // getName->1:     // getName->2:     // getName->N:     // ofs = 52936 ord = 2 addr = 0
	aload_5 
	invokevirtual getMargin( net.rim.device.api.ui.Field, net.rim.device.api.ui.XYEdges ) // pc=2
	aload_1 
	iconst_0 
	aload_4 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	aload_5 
	getfield top   // get_name_1:  top   // get_name_2:  top   // get_Name:    top   // getName->1:  top   // getName->2:  top   // getName->N:  top   // ofs = -1 ord = 2 addr = -1
	isub 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	aload_4 
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	aload_5 
	getfield top   // get_name_1:  top   // get_name_2:  top   // get_Name:    top   // getName->1:  top   // getName->2:  top   // getName->N:  top   // ofs = -1 ord = 2 addr = -1
	iadd 
	aload_5 
	getfield bottom   // get_name_1:  bottom   // get_name_2:  bottom   // get_Name:    bottom   // getName->1:  bottom   // getName->2:  bottom   // getName->N:  bottom   // ofs = -1 ord = 3 addr = -1
	iadd 
	invokevirtual clear( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	aload_0 
	aload_1 
	aload_0_getfield com.whatsapp.field.MainManager.field_52936   // get_name_1:  com.whatsapp.field.MainManager.field_52936   // get_name_2:  com.whatsapp.field.MainManager.field_52936   // get_Name:    com.whatsapp.field.MainManager.field_52936   // getName->1:     // getName->2:     // getName->N:     // ofs = 52936 ord = 2 addr = 0
	invokevirtual paintChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Graphics, net.rim.device.api.ui.Field ) // pc=3
Label81:
	aload_1 
	iload_2 
	invokevirtual setBackgroundColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	iload_3 
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_0_getfield com.whatsapp.field.MainManager.field_52948   // get_name_1:  com.whatsapp.field.MainManager.field_52948   // get_name_2:  com.whatsapp.field.MainManager.field_52948   // get_Name:    com.whatsapp.field.MainManager.field_52948   // getName->1:     // getName->2:     // getName->N:     // ofs = 52948 ord = 5 addr = 0
	ifnull Label117
	aload_0_getfield com.whatsapp.field.MainManager.field_52948   // get_name_1:  com.whatsapp.field.MainManager.field_52948   // get_name_2:  com.whatsapp.field.MainManager.field_52948   // get_Name:    com.whatsapp.field.MainManager.field_52948   // getName->1:     // getName->2:     // getName->N:     // ofs = 52948 ord = 5 addr = 0
	aload_4 
	invokevirtual getExtent( net.rim.device.api.ui.Field, net.rim.device.api.ui.XYRect ) // pc=2
	aload_0_getfield com.whatsapp.field.MainManager.field_52948   // get_name_1:  com.whatsapp.field.MainManager.field_52948   // get_name_2:  com.whatsapp.field.MainManager.field_52948   // get_Name:    com.whatsapp.field.MainManager.field_52948   // getName->1:     // getName->2:     // getName->N:     // ofs = 52948 ord = 5 addr = 0
	aload_5 
	invokevirtual getMargin( net.rim.device.api.ui.Field, net.rim.device.api.ui.XYEdges ) // pc=2
	aload_1 
	iconst_0 
	aload_4 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	aload_5 
	getfield top   // get_name_1:  top   // get_name_2:  top   // get_Name:    top   // getName->1:  top   // getName->2:  top   // getName->N:  top   // ofs = -1 ord = 2 addr = -1
	isub 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	aload_4 
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	aload_5 
	getfield top   // get_name_1:  top   // get_name_2:  top   // get_Name:    top   // getName->1:  top   // getName->2:  top   // getName->N:  top   // ofs = -1 ord = 2 addr = -1
	iadd 
	aload_5 
	getfield bottom   // get_name_1:  bottom   // get_name_2:  bottom   // get_Name:    bottom   // getName->1:  bottom   // getName->2:  bottom   // getName->N:  bottom   // ofs = -1 ord = 3 addr = -1
	iadd 
	invokevirtual clear( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	aload_0 
	aload_1 
	aload_0_getfield com.whatsapp.field.MainManager.field_52948   // get_name_1:  com.whatsapp.field.MainManager.field_52948   // get_name_2:  com.whatsapp.field.MainManager.field_52948   // get_Name:    com.whatsapp.field.MainManager.field_52948   // getName->1:     // getName->2:     // getName->N:     // ofs = 52948 ord = 5 addr = 0
	invokevirtual paintChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Graphics, net.rim.device.api.ui.Field ) // pc=3
Label117:
	aload_0 
	aload_1 
	aload_0_getfield com.whatsapp.field.MainManager.field_52944   // get_name_1:  com.whatsapp.field.MainManager.field_52944   // get_name_2:  com.whatsapp.field.MainManager.field_52944   // get_Name:    com.whatsapp.field.MainManager.field_52944   // getName->1:     // getName->2:     // getName->N:     // ofs = 52944 ord = 4 addr = 0
	invokevirtual paintChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Graphics, net.rim.device.api.ui.Field ) // pc=3
	aload_0_getfield com.whatsapp.field.MainManager.field_52928   // get_name_1:  com.whatsapp.field.MainManager.field_52928   // get_name_2:  com.whatsapp.field.MainManager.field_52928   // get_Name:    com.whatsapp.field.MainManager.field_52928   // getName->1:     // getName->2:     // getName->N:     // ofs = 52928 ord = 0 addr = 0
	ifnull Label128
	aload_0_getfield com.whatsapp.field.MainManager.field_52932   // get_name_1:  com.whatsapp.field.MainManager.field_52932   // get_name_2:  com.whatsapp.field.MainManager.field_52932   // get_Name:    com.whatsapp.field.MainManager.field_52932   // getName->1:     // getName->2:     // getName->N:     // ofs = 52932 ord = 1 addr = 0
	ifeq Label128
	aload_1 
	aload_0_getfield com.whatsapp.field.MainManager.field_52928   // get_name_1:  com.whatsapp.field.MainManager.field_52928   // get_name_2:  com.whatsapp.field.MainManager.field_52928   // get_Name:    com.whatsapp.field.MainManager.field_52928   // getName->1:     // getName->2:     // getName->N:     // ofs = 52928 ord = 0 addr = 0
	invokestatic com.whatsapp.field.MainManager.routine_7240( net.rim.device.api.ui.Graphics, net.rim.device.api.ui.Field ) // MainManager
Label128:
	aload_0_getfield com.whatsapp.field.MainManager.field_52936   // get_name_1:  com.whatsapp.field.MainManager.field_52936   // get_name_2:  com.whatsapp.field.MainManager.field_52936   // get_Name:    com.whatsapp.field.MainManager.field_52936   // getName->1:     // getName->2:     // getName->N:     // ofs = 52936 ord = 2 addr = 0
	ifnull Label135
	aload_0_getfield com.whatsapp.field.MainManager.field_52940   // get_name_1:  com.whatsapp.field.MainManager.field_52940   // get_name_2:  com.whatsapp.field.MainManager.field_52940   // get_Name:    com.whatsapp.field.MainManager.field_52940   // getName->1:     // getName->2:     // getName->N:     // ofs = 52940 ord = 3 addr = 0
	ifeq Label135
	aload_1 
	aload_0_getfield com.whatsapp.field.MainManager.field_52936   // get_name_1:  com.whatsapp.field.MainManager.field_52936   // get_name_2:  com.whatsapp.field.MainManager.field_52936   // get_Name:    com.whatsapp.field.MainManager.field_52936   // getName->1:     // getName->2:     // getName->N:     // ofs = 52936 ord = 2 addr = 0
	invokestatic com.whatsapp.field.MainManager.routine_7240( net.rim.device.api.ui.Graphics, net.rim.device.api.ui.Field ) // MainManager
Label135:
	aload_0_getfield com.whatsapp.field.MainManager.field_52952   // get_name_1:  com.whatsapp.field.MainManager.field_52952   // get_name_2:  com.whatsapp.field.MainManager.field_52952   // get_Name:    com.whatsapp.field.MainManager.field_52952   // getName->1:     // getName->2:     // getName->N:     // ofs = 52952 ord = 6 addr = 0
	ifnull Label141
	aload_0 
	aload_1 
	aload_0_getfield com.whatsapp.field.MainManager.field_52952   // get_name_1:  com.whatsapp.field.MainManager.field_52952   // get_name_2:  com.whatsapp.field.MainManager.field_52952   // get_Name:    com.whatsapp.field.MainManager.field_52952   // getName->1:     // getName->2:     // getName->N:     // ofs = 52952 ord = 6 addr = 0
	invokevirtual paintChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Graphics, net.rim.device.api.ui.Field ) // pc=3
Label141:
	return 
	}


public final add( com.whatsapp.field.MainManager, net.rim.device.api.ui.Field ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.field.MainManager.field_52944   // get_name_1:  com.whatsapp.field.MainManager.field_52944   // get_name_2:  com.whatsapp.field.MainManager.field_52944   // get_Name:    com.whatsapp.field.MainManager.field_52944   // getName->1:     // getName->2:     // getName->N:     // ofs = 52944 ord = 4 addr = 0
	aload_1 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	return 
	}


public final delete( com.whatsapp.field.MainManager, net.rim.device.api.ui.Field ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.field.MainManager.field_52944   // get_name_1:  com.whatsapp.field.MainManager.field_52944   // get_name_2:  com.whatsapp.field.MainManager.field_52944   // get_Name:    com.whatsapp.field.MainManager.field_52944   // getName->1:     // getName->2:     // getName->N:     // ofs = 52944 ord = 4 addr = 0
	aload_1 
	invokevirtual delete( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	return 
	}


public final deleteAll( com.whatsapp.field.MainManager ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.field.MainManager.field_52944   // get_name_1:  com.whatsapp.field.MainManager.field_52944   // get_name_2:  com.whatsapp.field.MainManager.field_52944   // get_Name:    com.whatsapp.field.MainManager.field_52944   // getName->1:     // getName->2:     // getName->N:     // ofs = 52944 ord = 4 addr = 0
	invokevirtual deleteAll( net.rim.device.api.ui.Manager ) // pc=1
	return 
	}


public final deleteRange( com.whatsapp.field.MainManager, int, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.field.MainManager.field_52944   // get_name_1:  com.whatsapp.field.MainManager.field_52944   // get_name_2:  com.whatsapp.field.MainManager.field_52944   // get_Name:    com.whatsapp.field.MainManager.field_52944   // getName->1:     // getName->2:     // getName->N:     // ofs = 52944 ord = 4 addr = 0
	iload_1 
	iload_2 
	invokevirtual deleteRange( net.rim.device.api.ui.Manager, int, int ) // pc=3
	return 
	}


public final insert( com.whatsapp.field.MainManager, net.rim.device.api.ui.Field, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.field.MainManager.field_52944   // get_name_1:  com.whatsapp.field.MainManager.field_52944   // get_name_2:  com.whatsapp.field.MainManager.field_52944   // get_Name:    com.whatsapp.field.MainManager.field_52944   // getName->1:     // getName->2:     // getName->N:     // ofs = 52944 ord = 4 addr = 0
	aload_1 
	iload_2 
	invokevirtual insert( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int ) // pc=3
	return 
	}


public final replace( com.whatsapp.field.MainManager, net.rim.device.api.ui.Field, net.rim.device.api.ui.Field ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.field.MainManager.field_52944   // get_name_1:  com.whatsapp.field.MainManager.field_52944   // get_name_2:  com.whatsapp.field.MainManager.field_52944   // get_Name:    com.whatsapp.field.MainManager.field_52944   // getName->1:     // getName->2:     // getName->N:     // ofs = 52944 ord = 4 addr = 0
	aload_1 
	aload_2 
	invokevirtual replace( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, net.rim.device.api.ui.Field ) // pc=3
	return 
	}


public final setPopup( com.whatsapp.field.MainManager, net.rim.device.api.ui.Field, net.rim.device.api.ui.Field ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.field.MainManager.field_52952   // get_name_1:  com.whatsapp.field.MainManager.field_52952   // get_name_2:  com.whatsapp.field.MainManager.field_52952   // get_Name:    com.whatsapp.field.MainManager.field_52952   // getName->1:     // getName->2:     // getName->N:     // ofs = 52952 ord = 6 addr = 0
	ifnull Label11
	aload_0_getfield com.whatsapp.field.MainManager.field_52952   // get_name_1:  com.whatsapp.field.MainManager.field_52952   // get_name_2:  com.whatsapp.field.MainManager.field_52952   // get_Name:    com.whatsapp.field.MainManager.field_52952   // getName->1:     // getName->2:     // getName->N:     // ofs = 52952 ord = 6 addr = 0
	astore_3 
	aload_0 
	aconst_null 
	putfield com.whatsapp.field.MainManager.field_52952   // get_name_1:  com.whatsapp.field.MainManager.field_52952   // get_name_2:  com.whatsapp.field.MainManager.field_52952   // get_Name:    com.whatsapp.field.MainManager.field_52952   // getName->1:     // getName->2:     // getName->N:     // ofs = 52952 ord = 6 addr = 0
	aload_0 
	aload_3 
	invokespecial com.whatsapp.field.MainManager.routine_7169 // pc=2
Label11:
	aload_0 
	aload_1 
	putfield com.whatsapp.field.MainManager.field_52952   // get_name_1:  com.whatsapp.field.MainManager.field_52952   // get_name_2:  com.whatsapp.field.MainManager.field_52952   // get_Name:    com.whatsapp.field.MainManager.field_52952   // getName->1:     // getName->2:     // getName->N:     // ofs = 52952 ord = 6 addr = 0
	aload_0 
	aload_1 
	ifnonnull Label19
	aconst_null 
	goto Label20
Label19:
	aload_2 
Label20:
	putfield com.whatsapp.field.MainManager.field_52956   // get_name_1:  com.whatsapp.field.MainManager.field_52956   // get_name_2:  com.whatsapp.field.MainManager.field_52956   // get_Name:    com.whatsapp.field.MainManager.field_52956   // getName->1:     // getName->2:     // getName->N:     // ofs = 52956 ord = 7 addr = 0
	aload_1 
	ifnull Label26
	aload_0 
	aload_1 
	invokespecial com.whatsapp.field.MainManager.routine_7156 // pc=2
Label26:
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Manager ) // pc=1
	return 
	}

}
