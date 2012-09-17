// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-8.cod
// Module version  : 2.8.1914
// Class ID        : 1
// ########################################################


package com.whatsapp.client;


public class BitmapButtonField extends net.rim.device.api.ui.Field

{
	// @@@@@@@@@@@@@ Static fields 
	public final static Integer /*java.lang.Integer*/  SYSTEM_FOCUS ; // ofs = 59126 addr = 5)

	// @@@@@@@@@@@@@ Fields 
	private boolean /*boolean*/  field_59070 ; // ofs = 59070 addr = 0)
	private boolean /*boolean*/  field_59074 ; // ofs = 59074 addr = 0)
	private boolean /*boolean*/  field_59078 ; // ofs = 59078 addr = 0)
	private Integer /*java.lang.Integer*/  field_59082 ; // ofs = 59082 addr = 0)
	private Integer /*java.lang.Integer*/  field_59086 ; // ofs = 59086 addr = 0)
	private Integer /*java.lang.Integer*/  field_59090 ; // ofs = 59090 addr = 0)
	private Integer /*java.lang.Integer*/  field_59094 ; // ofs = 59094 addr = 0)
	private Integer /*java.lang.Integer*/  field_59098 ; // ofs = 59098 addr = 0)
	private net.rim.device.api.system.Bitmap /*net.rim.device.api.system.Bitmap*/  field_59102 ; // ofs = 59102 addr = 0)
	private net.rim.device.api.ui.XYEdges /*net.rim.device.api.ui.XYEdges*/  field_59106 ; // ofs = 59106 addr = 0)
	private int /*int*/  field_59110 ; // ofs = 59110 addr = 0)
	private int /*int*/  field_59114 ; // ofs = 59114 addr = 0)
	private com.whatsapp.client. /*module:WhatsApp-3.class#6*/  field_59118 ; // ofs = 59118 addr = 0)
	private int /*int*/  field_59122 ; // ofs = 59122 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.BitmapButtonField, net.rim.device.api.system.Bitmap, long ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	new_lib net.rim.device.api.system.Application//net.rim.device.api.system.Application net.rim.device.api.system.Application net.rim.device.api.system.Application
	dup 
	iipush 2129150
	invokespecial_lib java.lang.Integer.<init> // pc=2
	new_lib net.rim.device.api.system.Application//net.rim.device.api.system.Application net.rim.device.api.system.Application net.rim.device.api.system.Application
	dup 
	iipush 478380
	invokespecial_lib java.lang.Integer.<init> // pc=2
	new_lib net.rim.device.api.system.Application//net.rim.device.api.system.Application net.rim.device.api.system.Application net.rim.device.api.system.Application
	dup 
	iconst_0 
	invokespecial_lib java.lang.Integer.<init> // pc=2
	new_lib net.rim.device.api.system.Application//net.rim.device.api.system.Application net.rim.device.api.system.Application net.rim.device.api.system.Application
	dup 
	iipush 8421504
	invokespecial_lib java.lang.Integer.<init> // pc=2
	new_lib net.rim.device.api.system.Application//net.rim.device.api.system.Application net.rim.device.api.system.Application net.rim.device.api.system.Application
	dup 
	iipush 8421504
	invokespecial_lib java.lang.Integer.<init> // pc=2
	lload 2
	invokespecial com.whatsapp.client.BitmapButtonField.<init> // pc=9
	return 
	}


public <init>( com.whatsapp.client.BitmapButtonField, net.rim.device.api.system.Bitmap, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	aload_2 
	aload_2 
	aload_3 
	aload_4 
	aload_5 
	iconst_0 
	i2l 
	invokespecial com.whatsapp.client.BitmapButtonField.<init> // pc=9
	return 
	}


public <init>( com.whatsapp.client.BitmapButtonField, net.rim.device.api.system.Bitmap, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, long ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	ifnull Label9
	new BitmapButtonField$DrawableBitmap
	dup 
	aload_1 
	invokespecial com.whatsapp.client.BitmapButtonField$DrawableBitmap.<init> // pc=2
	goto Label11
Label9:
	aconst_null 
	checkcast_lib com.whatsapp.client.BitmapButtonField$DrawableImage//module:WhatsApp-3.class#6 module:WhatsApp-3.class#6 module:WhatsApp-3.class#6
Label11:
	aload_2 
	aload_3 
	aload_4 
	aload_5 
	aload_6 
	lload 7
	invokespecial com.whatsapp.client.BitmapButtonField.<init> // pc=9
	return 
	}


public <init>( com.whatsapp.client.BitmapButtonField, module:WhatsApp-3.class#6, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, long ); // address: 0
	{
	enter 
	aload_0 
	lipush 22517998136852480
	lload 7
	lor 
	invokespecial_lib net.rim.device.api.ui.Field.<init> // pc=3
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.BitmapButtonField.field_59070   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59070   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59070   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59070   // getName->1:     // getName->2:     // getName->N:     // ofs = 59070 ord = 0 addr = 0
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.BitmapButtonField.field_59074   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59074   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59074   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59074   // getName->1:     // getName->2:     // getName->N:     // ofs = 59074 ord = 1 addr = 0
	aload_0 
	iconst_1 
	putfield com.whatsapp.client.BitmapButtonField.field_59122   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59122   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59122   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59122   // getName->1:     // getName->2:     // getName->N:     // ofs = 59122 ord = 13 addr = 0
	aload_0 
	aload_1 
	putfield com.whatsapp.client.BitmapButtonField.field_59118   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59118   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59118   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59118   // getName->1:     // getName->2:     // getName->N:     // ofs = 59118 ord = 12 addr = 0
	aload_0 
	aload_2 
	getstatic SYSTEM_FOCUS // BitmapButtonField
	if_acmpne Label24
	iconst_1 
	goto Label25
Label24:
	iconst_0 
Label25:
	putfield com.whatsapp.client.BitmapButtonField.field_59078   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59078   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59078   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59078   // getName->1:     // getName->2:     // getName->N:     // ofs = 59078 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59078   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59078   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59078   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59078   // getName->1:     // getName->2:     // getName->N:     // ofs = 59078 ord = 2 addr = 0
	ifne Label43
	aload_0 
	aload_2 
	putfield com.whatsapp.client.BitmapButtonField.field_59082   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59082   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59082   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59082   // getName->1:     // getName->2:     // getName->N:     // ofs = 59082 ord = 3 addr = 0
	aload_0 
	aload_3 
	putfield com.whatsapp.client.BitmapButtonField.field_59086   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59086   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59086   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59086   // getName->1:     // getName->2:     // getName->N:     // ofs = 59086 ord = 4 addr = 0
	aload_0 
	aload_4 
	putfield com.whatsapp.client.BitmapButtonField.field_59090   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59090   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59090   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59090   // getName->1:     // getName->2:     // getName->N:     // ofs = 59090 ord = 5 addr = 0
	aload_0 
	aload_6 
	putfield com.whatsapp.client.BitmapButtonField.field_59094   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59094   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59094   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59094   // getName->1:     // getName->2:     // getName->N:     // ofs = 59094 ord = 6 addr = 0
	aload_0 
	aload_5 
	putfield com.whatsapp.client.BitmapButtonField.field_59098   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59098   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59098   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59098   // getName->1:     // getName->2:     // getName->N:     // ofs = 59098 ord = 7 addr = 0
Label43:
	return 
	}


static access$100( com.whatsapp.client.BitmapButtonField ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Field ) // pc=1
	return 
	}


static <clinit>(  ); // address: 0
	{
	enter 
	clinit_lib net.rim.device.api.ui.Font//net.rim.device.api.ui.Font net.rim.device.api.ui.Font net.rim.device.api.ui.Font
	synch_static BitmapButtonField
	clinit_wait 
	new_lib net.rim.device.api.system.Application//net.rim.device.api.system.Application net.rim.device.api.system.Application net.rim.device.api.system.Application
	dup 
	iipush 2147483647
	invokespecial_lib java.lang.Integer.<init> // pc=2
	putstatic SYSTEM_FOCUS // BitmapButtonField
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private com.whatsapp.client.BitmapButtonField.routine_2808( com.whatsapp.client.BitmapButtonField, int[], int[], int, int, int, int ); // address: 0
	{
	enter 
	iload_5 
	iload_3 
	iadd 
	istore_7 
	aload_1 
	iconst_0 
	iload_3 
	iastore 
	aload_1 
	iconst_1 
	iload_7 
	iastore 
	aload_1 
	bipush 2
	iload_7 
	iastore 
	aload_1 
	bipush 3
	iload_3 
	iastore 
	iload_6 
	iload_4 
	iadd 
	istore 8
	aload_2 
	iconst_0 
	iload_4 
	iastore 
	aload_2 
	iconst_1 
	iload_4 
	iastore 
	aload_2 
	bipush 2
	iload 8
	iastore 
	aload_2 
	bipush 3
	iload 8
	iastore 
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public setRoundedBackground( com.whatsapp.client.BitmapButtonField, boolean ); // address: 0
	{
	putfield_return com.whatsapp.client.BitmapButtonField.field_59074   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59074   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59074   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59074   // getName->1:     // getName->2:     // getName->N:     // ofs = 59074 ord = 1 addr = 0
	}


public setInternalPadding( com.whatsapp.client.BitmapButtonField, int ); // address: 0
	{
	putfield_return com.whatsapp.client.BitmapButtonField.field_59122   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59122   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59122   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59122   // getName->1:     // getName->2:     // getName->N:     // ofs = 59122 ord = 13 addr = 0
	}


protected boolean keyChar( com.whatsapp.client.BitmapButtonField, char, int, int ); // address: 0
	{
	enter 
	iload_1 
	bipush 10
	if_icmpne Label9
	aload_0 
	iconst_0 
	invokenonvirtual com.whatsapp.client.BitmapButtonField.fieldChangeNotify // pc=2
	iconst_1 
	ireturn 
Label9:
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	invokespecial_lib net.rim.device.api.ui.Field.keyChar // pc=4
	ireturn 
	}


protected boolean trackwheelClick( com.whatsapp.client.BitmapButtonField, int, int ); // address: 0
	{
	enter 
	aload_0 
	bipush 10
	iload_1 
	iload_2 
	invokenonvirtual com.whatsapp.client.BitmapButtonField.keyChar // pc=4
	pop 
	iconst_1 
	ireturn 
	}


protected boolean navigationClick( com.whatsapp.client.BitmapButtonField, int, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_1 
	invokenonvirtual com.whatsapp.client.BitmapButtonField.fieldChangeNotify // pc=2
	iconst_1 
	ireturn 
	}


public boolean isFocusable( com.whatsapp.client.BitmapButtonField ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual boolean isEditable( net.rim.device.api.ui.Field ) // pc=1
	ireturn 
	}


protected onFocus( com.whatsapp.client.BitmapButtonField, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_1 
	putfield com.whatsapp.client.BitmapButtonField.field_59070   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59070   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59070   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59070   // getName->1:     // getName->2:     // getName->N:     // ofs = 59070 ord = 0 addr = 0
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Field ) // pc=1
	return 
	}


protected onUnfocus( com.whatsapp.client.BitmapButtonField ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.BitmapButtonField.field_59070   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59070   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59070   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59070   // getName->1:     // getName->2:     // getName->N:     // ofs = 59070 ord = 0 addr = 0
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Field ) // pc=1
	return 
	}


public boolean isFocus( com.whatsapp.client.BitmapButtonField ); // address: 0
	{
	ireturn_field com.whatsapp.client.BitmapButtonField.field_59070   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59070   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59070   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59070   // getName->1:     // getName->2:     // getName->N:     // ofs = 59070 ord = 0 addr = 0
	}


protected onDisplay( com.whatsapp.client.BitmapButtonField ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59118   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59118   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59118   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59118   // getName->1:     // getName->2:     // getName->N:     // ofs = 59118 ord = 12 addr = 0
	checkcastbranch 
	invokeinterface interfacemethodref_124 // pc=1 guess=0
Label4:
	return 
	}


protected onUndisplay( com.whatsapp.client.BitmapButtonField ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59118   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59118   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59118   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59118   // getName->1:     // getName->2:     // getName->N:     // ofs = 59118 ord = 12 addr = 0
	checkcastbranch 
	invokeinterface interfacemethodref_125 // pc=1 guess=1
Label4:
	return 
	}


public int getPreferredWidth( com.whatsapp.client.BitmapButtonField ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59102   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59102   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59102   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59102   // getName->1:     // getName->2:     // getName->N:     // ofs = 59102 ord = 8 addr = 0
	ifnonnull Label5
	iconst_0 
	goto Label7
Label5:
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59102   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59102   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59102   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59102   // getName->1:     // getName->2:     // getName->N:     // ofs = 59102 ord = 8 addr = 0
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
Label7:
	istore_1 
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59118   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59118   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59118   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59118   // getName->1:     // getName->2:     // getName->N:     // ofs = 59118 ord = 12 addr = 0
	ifnonnull Label12
	iconst_0 
	goto Label14
Label12:
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59118   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59118   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59118   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59118   // getName->1:     // getName->2:     // getName->N:     // ofs = 59118 ord = 12 addr = 0
	invokeinterface interfacemethodref_126 // pc=1 guess=2
Label14:
	istore_2 
	iload_2 
	iload_1 
	invokestatic_lib int max( int, int ) // Math
	bipush 2
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59122   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59122   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59122   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59122   // getName->1:     // getName->2:     // getName->N:     // ofs = 59122 ord = 13 addr = 0
	imul 
	iadd 
	aload_0 
	invokevirtual int getPaddingLeft( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	aload_0 
	invokevirtual int getPaddingRight( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	ireturn 
	}


public int getPreferredHeight( com.whatsapp.client.BitmapButtonField ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59102   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59102   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59102   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59102   // getName->1:     // getName->2:     // getName->N:     // ofs = 59102 ord = 8 addr = 0
	ifnonnull Label5
	iconst_0 
	goto Label7
Label5:
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59102   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59102   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59102   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59102   // getName->1:     // getName->2:     // getName->N:     // ofs = 59102 ord = 8 addr = 0
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
Label7:
	istore_1 
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59118   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59118   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59118   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59118   // getName->1:     // getName->2:     // getName->N:     // ofs = 59118 ord = 12 addr = 0
	ifnonnull Label12
	iconst_0 
	goto Label14
Label12:
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59118   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59118   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59118   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59118   // getName->1:     // getName->2:     // getName->N:     // ofs = 59118 ord = 12 addr = 0
	invokeinterface interfacemethodref_127 // pc=1 guess=3
Label14:
	istore_2 
	iload_2 
	iload_1 
	invokestatic_lib int max( int, int ) // Math
	bipush 2
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59122   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59122   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59122   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59122   // getName->1:     // getName->2:     // getName->N:     // ofs = 59122 ord = 13 addr = 0
	imul 
	iadd 
	aload_0 
	invokevirtual int getPaddingTop( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	aload_0 
	invokevirtual int getPaddingBottom( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	ireturn 
	}


public setBitmap( com.whatsapp.client.BitmapButtonField, module:WhatsApp-3.class#6 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59118   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59118   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59118   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59118   // getName->1:     // getName->2:     // getName->N:     // ofs = 59118 ord = 12 addr = 0
	aload_1 
	if_acmpeq Label23
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59118   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59118   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59118   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59118   // getName->1:     // getName->2:     // getName->N:     // ofs = 59118 ord = 12 addr = 0
	checkcastbranch 
	invokeinterface interfacemethodref_125 // pc=1 guess=4
Label7:
	aload_0 
	aload_1 
	putfield com.whatsapp.client.BitmapButtonField.field_59118   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59118   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59118   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59118   // getName->1:     // getName->2:     // getName->N:     // ofs = 59118 ord = 12 addr = 0
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59118   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59118   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59118   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59118   // getName->1:     // getName->2:     // getName->N:     // ofs = 59118 ord = 12 addr = 0
	checkcastbranch 
	aload_0 
	invokeinterface interfacemethodref_128 // pc=2 guess=5
Label14:
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59118   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59118   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59118   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59118   // getName->1:     // getName->2:     // getName->N:     // ofs = 59118 ord = 12 addr = 0
	instanceof BitmapButtonField$EnhancedDrawableImage
	ifeq Label23
	aload_0 
	invokevirtual boolean isVisible( net.rim.device.api.ui.Field ) // pc=1
	ifeq Label23
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59118   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59118   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59118   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59118   // getName->1:     // getName->2:     // getName->N:     // ofs = 59118 ord = 12 addr = 0
	checkcast BitmapButtonField$EnhancedDrawableImage
	invokeinterface interfacemethodref_124 // pc=1 guess=6
Label23:
	return 
	}


protected drawFocus( com.whatsapp.client.BitmapButtonField, net.rim.device.api.ui.Graphics, boolean ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59078   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59078   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59078   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59078   // getName->1:     // getName->2:     // getName->N:     // ofs = 59078 ord = 2 addr = 0
	ifeq Label7
	aload_0 
	aload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.Field.drawFocus // pc=3
Label7:
	return 
	}


protected fieldChangeNotify( com.whatsapp.client.BitmapButtonField, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual net.rim.device.api.ui.FieldChangeListener getChangeListener( net.rim.device.api.ui.Field ) // pc=1
	aload_0 
	iload_1 
	invokeinterface interfacemethodref_129 // pc=3 guess=7
	return 
	astore_2 
	return 
	}


protected paint( com.whatsapp.client.BitmapButtonField, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter 
	bipush 4
	newarray 5
	astore_2 
	bipush 4
	newarray 5
	astore_3 
	arrayinit [0, 0, 0, 0]
	astore_4 
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59070   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59070   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59070   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59070   // getName->1:     // getName->2:     // getName->N:     // ofs = 59070 ord = 0 addr = 0
	ifeq Label13
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59082   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59082   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59082   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59082   // getName->1:     // getName->2:     // getName->N:     // ofs = 59082 ord = 3 addr = 0
	goto Label14
Label13:
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59090   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59090   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59090   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59090   // getName->1:     // getName->2:     // getName->N:     // ofs = 59090 ord = 5 addr = 0
Label14:
	astore_5 
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59070   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59070   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59070   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59070   // getName->1:     // getName->2:     // getName->N:     // ofs = 59070 ord = 0 addr = 0
	ifeq Label19
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59086   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59086   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59086   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59086   // getName->1:     // getName->2:     // getName->N:     // ofs = 59086 ord = 4 addr = 0
	goto Label20
Label19:
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59090   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59090   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59090   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59090   // getName->1:     // getName->2:     // getName->N:     // ofs = 59090 ord = 5 addr = 0
Label20:
	astore_6 
	aload_5 
	ifnonnull Label24
	goto_w Label96
Label24:
	aconst_null 
	astore_7 
	aload_1 
	astore 8
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59074   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59074   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59074   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59074   // getName->1:     // getName->2:     // getName->N:     // ofs = 59074 ord = 1 addr = 0
	ifeq Label39
	new_lib Runnable//java.lang.Runnable java.lang.Runnable java.lang.Runnable
	dup 
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59110   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59110   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59110   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59110   // getName->1:     // getName->2:     // getName->N:     // ofs = 59110 ord = 10 addr = 0
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59114   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59114   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59114   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59114   // getName->1:     // getName->2:     // getName->N:     // ofs = 59114 ord = 11 addr = 0
	invokespecial_lib net.rim.device.api.system.Bitmap.<init> // pc=3
	astore_7 
	aload_7 
	invokestatic_lib module:WhatsApp-60.class#2.routine_3149(  ) // class#2
	astore 8
Label39:
	aload_5 
	invokevirtual int intValue( java.lang.Integer ) // pc=1
	istore 9
	aload_6 
	invokevirtual int intValue( java.lang.Integer ) // pc=1
	istore 10
	aload_0 
	aload_2 
	aload_3 
	iconst_0 
	iconst_0 
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59110   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59110   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59110   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59110   // getName->1:     // getName->2:     // getName->N:     // ofs = 59110 ord = 10 addr = 0
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59114   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59114   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59114   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59114   // getName->1:     // getName->2:     // getName->N:     // ofs = 59114 ord = 11 addr = 0
	invokespecial com.whatsapp.client.BitmapButtonField.routine_2808 // pc=7
	bipush 4
	newarray 5
	dup 
	iconst_0 
	iload 9
	iastore 
	dup 
	iconst_1 
	iload 9
	iastore 
	dup 
	bipush 2
	iload 10
	iastore 
	dup 
	bipush 3
	iload 10
	iastore 
	astore 11
	aload 8
	aload_2 
	aload_3 
	aload_4 
	aload 11
	aconst_null 
	invokevirtual drawShadedFilledPath( net.rim.device.api.ui.Graphics, int[], int[], byte[], int[], int[] ) // pc=6
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59074   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59074   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59074   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59074   // getName->1:     // getName->2:     // getName->N:     // ofs = 59074 ord = 1 addr = 0
	ifeq Label96
	getstatic_lib module:WhatsApp-31.class#0.static_68 // class#0
	invokestatic_lib module:WhatsApp-58.class#1.routine_1287(  ) // class#1
	astore 12
	aload_7 
	aload 12
	invokestatic_lib module:WhatsApp-60.class#2.routine_1482(  ) // class#2
	aload_1 
	iconst_0 
	iconst_0 
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59110   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59110   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59110   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59110   // getName->1:     // getName->2:     // getName->N:     // ofs = 59110 ord = 10 addr = 0
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59114   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59114   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59114   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59114   // getName->1:     // getName->2:     // getName->N:     // ofs = 59114 ord = 11 addr = 0
	aload_7 
	iconst_0 
	iconst_0 
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=8
Label96:
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	bipush 2
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59122   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59122   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59122   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59122   // getName->1:     // getName->2:     // getName->N:     // ofs = 59122 ord = 13 addr = 0
	imul 
	isub 
	aload_0 
	invokevirtual int getPaddingLeft( net.rim.device.api.ui.Field ) // pc=1
	isub 
	aload_0 
	invokevirtual int getPaddingRight( net.rim.device.api.ui.Field ) // pc=1
	isub 
	istore_7 
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	bipush 2
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59122   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59122   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59122   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59122   // getName->1:     // getName->2:     // getName->N:     // ofs = 59122 ord = 13 addr = 0
	imul 
	isub 
	aload_0 
	invokevirtual int getPaddingTop( net.rim.device.api.ui.Field ) // pc=1
	isub 
	aload_0 
	invokevirtual int getPaddingBottom( net.rim.device.api.ui.Field ) // pc=1
	isub 
	istore 8
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59070   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59070   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59070   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59070   // getName->1:     // getName->2:     // getName->N:     // ofs = 59070 ord = 0 addr = 0
	ifne Label125
	goto_w Label216
Label125:
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59102   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59102   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59102   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59102   // getName->1:     // getName->2:     // getName->N:     // ofs = 59102 ord = 8 addr = 0
	ifnonnull Label128
	goto_w Label216
Label128:
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59102   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59102   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59102   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59102   // getName->1:     // getName->2:     // getName->N:     // ofs = 59102 ord = 8 addr = 0
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	istore 9
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59102   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59102   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59102   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59102   // getName->1:     // getName->2:     // getName->N:     // ofs = 59102 ord = 8 addr = 0
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	istore 10
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59122   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59122   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59122   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59122   // getName->1:     // getName->2:     // getName->N:     // ofs = 59122 ord = 13 addr = 0
	iload_7 
	iload 9
	isub 
	bipush 2
	idiv 
	isub 
	istore 11
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59122   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59122   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59122   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59122   // getName->1:     // getName->2:     // getName->N:     // ofs = 59122 ord = 13 addr = 0
	iload 8
	iload 10
	isub 
	bipush 2
	idiv 
	isub 
	istore 12
	iload_7 
	iload 9
	if_icmpge Label207
	aload_1 
	iload 11
	iload 12
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59106   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59106   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59106   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59106   // getName->1:     // getName->2:     // getName->N:     // ofs = 59106 ord = 9 addr = 0
	getfield left   // get_name_1:  left   // get_name_2:  left   // get_Name:    left   // getName->1:  left   // getName->2:  left   // getName->N:  left   // ofs = -1 ord = 0 addr = -1
	iload 10
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59102   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59102   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59102   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59102   // getName->1:     // getName->2:     // getName->N:     // ofs = 59102 ord = 8 addr = 0
	iconst_0 
	iconst_0 
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=8
	aload_1 
	bipush -97
	iload 11
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59106   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59106   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59106   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59106   // getName->1:     // getName->2:     // getName->N:     // ofs = 59106 ord = 9 addr = 0
	getfield left   // get_name_1:  left   // get_name_2:  left   // get_Name:    left   // getName->1:  left   // getName->2:  left   // getName->N:  left   // ofs = -1 ord = 0 addr = -1
	iadd 
	iload 12
	iload_7 
	iload 11
	bipush 2
	imul 
	isub 
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59106   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59106   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59106   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59106   // getName->1:     // getName->2:     // getName->N:     // ofs = 59106 ord = 9 addr = 0
	getfield left   // get_name_1:  left   // get_name_2:  left   // get_Name:    left   // getName->1:  left   // getName->2:  left   // getName->N:  left   // ofs = -1 ord = 0 addr = -1
	isub 
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59106   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59106   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59106   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59106   // getName->1:     // getName->2:     // getName->N:     // ofs = 59106 ord = 9 addr = 0
	getfield right   // get_name_1:  right   // get_name_2:  right   // get_Name:    right   // getName->1:  right   // getName->2:  right   // getName->N:  right   // ofs = -1 ord = 1 addr = -1
	isub 
	iload 10
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59102   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59102   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59102   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59102   // getName->1:     // getName->2:     // getName->N:     // ofs = 59102 ord = 8 addr = 0
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59106   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59106   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59106   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59106   // getName->1:     // getName->2:     // getName->N:     // ofs = 59106 ord = 9 addr = 0
	getfield left   // get_name_1:  left   // get_name_2:  left   // get_Name:    left   // getName->1:  left   // getName->2:  left   // getName->N:  left   // ofs = -1 ord = 0 addr = -1
	iconst_0 
	invokevirtual tileRop( net.rim.device.api.ui.Graphics, int, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=9
	aload_1 
	iload_7 
	iload 11
	isub 
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59106   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59106   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59106   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59106   // getName->1:     // getName->2:     // getName->N:     // ofs = 59106 ord = 9 addr = 0
	getfield right   // get_name_1:  right   // get_name_2:  right   // get_Name:    right   // getName->1:  right   // getName->2:  right   // getName->N:  right   // ofs = -1 ord = 1 addr = -1
	isub 
	iload 12
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59106   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59106   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59106   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59106   // getName->1:     // getName->2:     // getName->N:     // ofs = 59106 ord = 9 addr = 0
	getfield right   // get_name_1:  right   // get_name_2:  right   // get_Name:    right   // getName->1:  right   // getName->2:  right   // getName->N:  right   // ofs = -1 ord = 1 addr = -1
	iload 10
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59102   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59102   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59102   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59102   // getName->1:     // getName->2:     // getName->N:     // ofs = 59102 ord = 8 addr = 0
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59102   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59102   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59102   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59102   // getName->1:     // getName->2:     // getName->N:     // ofs = 59102 ord = 8 addr = 0
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59106   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59106   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59106   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59106   // getName->1:     // getName->2:     // getName->N:     // ofs = 59106 ord = 9 addr = 0
	getfield right   // get_name_1:  right   // get_name_2:  right   // get_Name:    right   // getName->1:  right   // getName->2:  right   // getName->N:  right   // ofs = -1 ord = 1 addr = -1
	isub 
	iconst_0 
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=8
	goto Label216
Label207:
	aload_1 
	iload 11
	iload 12
	iload 9
	iload 10
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59102   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59102   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59102   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59102   // getName->1:     // getName->2:     // getName->N:     // ofs = 59102 ord = 8 addr = 0
	iconst_0 
	iconst_0 
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=8
Label216:
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59070   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59070   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59070   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59070   // getName->1:     // getName->2:     // getName->N:     // ofs = 59070 ord = 0 addr = 0
	ifeq Label220
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59098   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59098   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59098   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59098   // getName->1:     // getName->2:     // getName->N:     // ofs = 59098 ord = 7 addr = 0
	goto Label221
Label220:
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59094   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59094   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59094   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59094   // getName->1:     // getName->2:     // getName->N:     // ofs = 59094 ord = 6 addr = 0
Label221:
	astore 9
	aload 9
	ifnull Label247
	aload_1 
	aload 9
	invokevirtual int intValue( java.lang.Integer ) // pc=1
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_0 
	aload_2 
	aload_3 
	iconst_0 
	iconst_0 
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59110   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59110   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59110   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59110   // getName->1:     // getName->2:     // getName->N:     // ofs = 59110 ord = 10 addr = 0
	iconst_1 
	isub 
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59114   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59114   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59114   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59114   // getName->1:     // getName->2:     // getName->N:     // ofs = 59114 ord = 11 addr = 0
	iconst_1 
	isub 
	invokespecial com.whatsapp.client.BitmapButtonField.routine_2808 // pc=7
	aload_1 
	aload_2 
	aload_3 
	aload_4 
	aconst_null 
	iconst_1 
	invokevirtual drawOutlinedPath( net.rim.device.api.ui.Graphics, int[], int[], byte[], int[], boolean ) // pc=6
Label247:
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59118   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59118   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59118   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59118   // getName->1:     // getName->2:     // getName->N:     // ofs = 59118 ord = 12 addr = 0
	ifnull Label291
	aload_1 
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59122   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59122   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59122   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59122   // getName->1:     // getName->2:     // getName->N:     // ofs = 59122 ord = 13 addr = 0
	iload_7 
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59118   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59118   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59118   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59118   // getName->1:     // getName->2:     // getName->N:     // ofs = 59118 ord = 12 addr = 0
	invokeinterface interfacemethodref_126 // pc=1 guess=8
	isub 
	bipush 2
	idiv 
	iadd 
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59122   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59122   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59122   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59122   // getName->1:     // getName->2:     // getName->N:     // ofs = 59122 ord = 13 addr = 0
	iload 8
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59118   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59118   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59118   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59118   // getName->1:     // getName->2:     // getName->N:     // ofs = 59118 ord = 12 addr = 0
	invokeinterface interfacemethodref_127 // pc=1 guess=9
	isub 
	bipush 2
	idiv 
	iadd 
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59118   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59118   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59118   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59118   // getName->1:     // getName->2:     // getName->N:     // ofs = 59118 ord = 12 addr = 0
	invokeinterface interfacemethodref_126 // pc=1 guess=8
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59118   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59118   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59118   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59118   // getName->1:     // getName->2:     // getName->N:     // ofs = 59118 ord = 12 addr = 0
	invokeinterface interfacemethodref_127 // pc=1 guess=9
	iconst_0 
	iconst_0 
	invokevirtual boolean pushRegion( net.rim.device.api.ui.Graphics, int, int, int, int, int, int ) // pc=7
	pop 
	aload_1 
	bipush 8
	invokevirtual boolean isDrawingStyleSet( net.rim.device.api.ui.Graphics, int ) // pc=2
	istore 10
	aload_1 
	bipush 8
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59070   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59070   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59070   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59070   // getName->1:     // getName->2:     // getName->N:     // ofs = 59070 ord = 0 addr = 0
	invokevirtual setDrawingStyle( net.rim.device.api.ui.Graphics, int, boolean ) // pc=3
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59118   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59118   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59118   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59118   // getName->1:     // getName->2:     // getName->N:     // ofs = 59118 ord = 12 addr = 0
	aload_1 
	invokeinterface interfacemethodref_130 // pc=2 guess=10
	aload_1 
	bipush 8
	iload 10
	invokevirtual setDrawingStyle( net.rim.device.api.ui.Graphics, int, boolean ) // pc=3
	aload_1 
	invokevirtual popContext( net.rim.device.api.ui.Graphics ) // pc=1
Label291:
	return 
	}


protected layout( com.whatsapp.client.BitmapButtonField, int, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	aload_0 
	invokevirtual int getPreferredWidth( com.whatsapp.client.BitmapButtonField ) // pc=1
	invokestatic_lib int min( int, int ) // Math
	putfield com.whatsapp.client.BitmapButtonField.field_59110   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59110   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59110   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59110   // getName->1:     // getName->2:     // getName->N:     // ofs = 59110 ord = 10 addr = 0
	aload_0 
	iload_2 
	aload_0 
	invokevirtual int getPreferredHeight( com.whatsapp.client.BitmapButtonField ) // pc=1
	invokestatic_lib int min( int, int ) // Math
	putfield com.whatsapp.client.BitmapButtonField.field_59114   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59114   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59114   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59114   // getName->1:     // getName->2:     // getName->N:     // ofs = 59114 ord = 11 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59110   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59110   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59110   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59110   // getName->1:     // getName->2:     // getName->N:     // ofs = 59110 ord = 10 addr = 0
	aload_0_getfield com.whatsapp.client.BitmapButtonField.field_59114   // get_name_1:  com.whatsapp.client.BitmapButtonField.field_59114   // get_name_2:  com.whatsapp.client.BitmapButtonField.field_59114   // get_Name:    com.whatsapp.client.BitmapButtonField.field_59114   // getName->1:     // getName->2:     // getName->N:     // ofs = 59114 ord = 11 addr = 0
	invokevirtual setExtent( net.rim.device.api.ui.Field, int, int ) // pc=3
	return 
	}

}
