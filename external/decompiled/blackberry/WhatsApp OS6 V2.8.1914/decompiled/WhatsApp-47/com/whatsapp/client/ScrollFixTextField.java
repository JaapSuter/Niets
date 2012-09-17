// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-48.cod
// Module version  : 2.8.1914
// Class ID        : 1
// ########################################################


package com.whatsapp.client;


abstract public final class ScrollFixTextField extends net.rim.device.api.ui.Manager

{

	// @@@@@@@@@@@@@ Fields 
	public com.whatsapp.client.BBMStyleInputField /*com.whatsapp.client.BBMStyleInputField*/  _inputField ; // ofs = 54426 addr = 0)
	public com.whatsapp.client.BitmapButtonField /*com.whatsapp.client.BitmapButtonField*/  _emojiButton ; // ofs = 54430 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.ScrollFixTextField, long ); // address: 0
	{
	enter 
	aload_0 
	lipush 562949953421312
	invokespecial_lib net.rim.device.api.ui.Manager.<init> // pc=3
	aload_0 
	new_lib com.whatsapp.client.BBMStyleInputField//com.whatsapp.client.BBMStyleInputField com.whatsapp.client.BBMStyleInputField com.whatsapp.client.BBMStyleInputField
	dup 
	lload 1
	invokespecial_lib .routine_1579 // pc=3
	putfield _inputField   // get_name_1:  _inputField   // get_name_2:  _inputField   // get_Name:    _inputField   // getName->1:  _inputField   // getName->2:  _inputField   // getName->N:  _inputField   // ofs = 54426 ord = 0 addr = 0
	aload_0 
	new ScrollFixTextField$InnerVFM
	dup 
	aload_0_getfield _inputField   // get_name_1:  _inputField   // get_name_2:  _inputField   // get_Name:    _inputField   // getName->1:  _inputField   // getName->2:  _inputField   // getName->N:  _inputField   // ofs = 54426 ord = 0 addr = 0
	invokespecial com.whatsapp.client.ScrollFixTextField$InnerVFM.<init> // pc=2
	putfield _innerVFM   // get_name_1:  _innerVFM   // get_name_2:  _innerVFM   // get_Name:    _innerVFM   // getName->1:  _innerVFM   // getName->2:  _innerVFM   // getName->N:  _innerVFM   // ofs = 54434 ord = 2 addr = 0
	aload_0_getfield _innerVFM   // get_name_1:  _innerVFM   // get_name_2:  _innerVFM   // get_Name:    _innerVFM   // getName->1:  _innerVFM   // getName->2:  _innerVFM   // getName->N:  _innerVFM   // ofs = 54434 ord = 2 addr = 0
	getstatic_lib module:WhatsApp-7.class#4.static_18 // class#4
	invokevirtual setBorder( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Border ) // pc=2
	aload_0_getfield _innerVFM   // get_name_1:  _innerVFM   // get_name_2:  _innerVFM   // get_Name:    _innerVFM   // getName->1:  _innerVFM   // getName->2:  _innerVFM   // getName->N:  _innerVFM   // ofs = 54434 ord = 2 addr = 0
	getstatic_lib module:WhatsApp-7.class#4.static_19 // class#4
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	aload_0_getfield _innerVFM   // get_name_1:  _innerVFM   // get_name_2:  _innerVFM   // get_Name:    _innerVFM   // getName->1:  _innerVFM   // getName->2:  _innerVFM   // getName->N:  _innerVFM   // ofs = 54434 ord = 2 addr = 0
	bipush 3
	bipush 9
	bipush 3
	bipush 4
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0_getfield _innerVFM   // get_name_1:  _innerVFM   // get_name_2:  _innerVFM   // get_Name:    _innerVFM   // getName->1:  _innerVFM   // getName->2:  _innerVFM   // getName->N:  _innerVFM   // ofs = 54434 ord = 2 addr = 0
	aload_0_getfield _inputField   // get_name_1:  _inputField   // get_name_2:  _inputField   // get_Name:    _inputField   // getName->1:  _inputField   // getName->2:  _inputField   // getName->N:  _inputField   // ofs = 54426 ord = 0 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	aload_0_getfield _innerVFM   // get_name_1:  _innerVFM   // get_name_2:  _innerVFM   // get_Name:    _innerVFM   // getName->1:  _innerVFM   // getName->2:  _innerVFM   // getName->N:  _innerVFM   // ofs = 54434 ord = 2 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib com.whatsapp.client.BitmapButtonField//com.whatsapp.client.BitmapButtonField com.whatsapp.client.BitmapButtonField com.whatsapp.client.BitmapButtonField
	dup 
	iipush 58389
	invokestatic_lib module:WhatsApp-58.class#1.routine_1655(  ) // class#1
	ifeq Label42
	bipush 24
	goto Label43
Label42:
	bipush 48
Label43:
	invokestatic_lib module:WhatsApp-24.class#16.routine_6053(  ) // class#16
	new_lib net.rim.device.api.ui.container.DialogFieldManager//net.rim.device.api.ui.container.DialogFieldManager net.rim.device.api.ui.container.DialogFieldManager net.rim.device.api.ui.container.DialogFieldManager
	dup 
	iipush 2194943
	invokespecial_lib java.lang.Integer.<init> // pc=2
	new_lib net.rim.device.api.ui.container.DialogFieldManager//net.rim.device.api.ui.container.DialogFieldManager net.rim.device.api.ui.container.DialogFieldManager net.rim.device.api.ui.container.DialogFieldManager
	dup 
	iipush 544173
	invokespecial_lib java.lang.Integer.<init> // pc=2
	aconst_null 
	aconst_null 
	aconst_null 
	iconst_0 
	i2l 
	invokespecial_lib .routine_2994 // pc=9
	putfield _emojiButton   // get_name_1:  _emojiButton   // get_name_2:  _emojiButton   // get_Name:    _emojiButton   // getName->1:  _emojiButton   // getName->2:  _emojiButton   // getName->N:  _emojiButton   // ofs = 54430 ord = 1 addr = 0
	aload_0_getfield _emojiButton   // get_name_1:  _emojiButton   // get_name_2:  _emojiButton   // get_Name:    _emojiButton   // getName->1:  _emojiButton   // getName->2:  _emojiButton   // getName->N:  _emojiButton   // ofs = 54430 ord = 1 addr = 0
	bipush 4
	invokenonvirtual_lib .routine_1707 // pc=2
	aload_0_getfield _emojiButton   // get_name_1:  _emojiButton   // get_name_2:  _emojiButton   // get_Name:    _emojiButton   // getName->1:  _emojiButton   // getName->2:  _emojiButton   // getName->N:  _emojiButton   // ofs = 54430 ord = 1 addr = 0
	iconst_1 
	invokenonvirtual_lib .routine_1696 // pc=2
	aload_0_getfield _emojiButton   // get_name_1:  _emojiButton   // get_name_2:  _emojiButton   // get_Name:    _emojiButton   // getName->1:  _emojiButton   // getName->2:  _emojiButton   // getName->N:  _emojiButton   // ofs = 54430 ord = 1 addr = 0
	bipush 5
	bipush 7
	bipush 5
	iconst_0 
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0_getfield _emojiButton   // get_name_1:  _emojiButton   // get_name_2:  _emojiButton   // get_Name:    _emojiButton   // getName->1:  _emojiButton   // getName->2:  _emojiButton   // getName->N:  _emojiButton   // ofs = 54430 ord = 1 addr = 0
	new_lib com.whatsapp.client.ScrollFixTextField$1//module:WhatsApp-47.class#17 module:WhatsApp-47.class#17 module:WhatsApp-47.class#17
	dup 
	aload_0 
	invokespecial_lib .routine_8439 // pc=2
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0 
	aload_0_getfield _emojiButton   // get_name_1:  _emojiButton   // get_name_2:  _emojiButton   // get_Name:    _emojiButton   // getName->1:  _emojiButton   // getName->2:  _emojiButton   // getName->N:  _emojiButton   // ofs = 54430 ord = 1 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final boolean keyChar( com.whatsapp.client.ScrollFixTextField, char, int, int ); // address: 0
	{
	enter 
	iload_1 
	bipush 10
	if_icmpeq Label10
	iload_1 
	bipush 27
	if_icmpeq Label10
	aload_0_getfield _inputField   // get_name_1:  _inputField   // get_name_2:  _inputField   // get_Name:    _inputField   // getName->1:  _inputField   // getName->2:  _inputField   // getName->N:  _inputField   // ofs = 54426 ord = 0 addr = 0
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	goto Label22
Label10:
	iload_1 
	bipush 10
	if_icmpne Label22
	aload_0_getfield _innerVFM   // get_name_1:  _innerVFM   // get_name_2:  _innerVFM   // get_Name:    _innerVFM   // getName->1:  _innerVFM   // getName->2:  _innerVFM   // getName->N:  _innerVFM   // ofs = 54434 ord = 2 addr = 0
	invokevirtual int getIndex( net.rim.device.api.ui.Field ) // pc=1
	aload_0 
	invokevirtual int getFieldWithFocusIndex( net.rim.device.api.ui.Manager ) // pc=1
	if_icmpeq Label22
	aload_0_getfield _inputField   // get_name_1:  _inputField   // get_name_2:  _inputField   // get_Name:    _inputField   // getName->1:  _inputField   // getName->2:  _inputField   // getName->N:  _inputField   // ofs = 54426 ord = 0 addr = 0
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	iconst_1 
	ireturn 
Label22:
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	invokespecial_lib net.rim.device.api.ui.Manager.keyChar // pc=4
	ireturn 
	}


protected final int nextFocus( com.whatsapp.client.ScrollFixTextField, int, int ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual net.rim.device.api.ui.Field getFieldWithFocus( net.rim.device.api.ui.Manager ) // pc=1
	astore_3 
	iload_2 
	bipush 2
	if_icmpeq Label9
	iload_2 
	ifne Label17
Label9:
	aload_3 
	aload_0_getfield _innerVFM   // get_name_1:  _innerVFM   // get_name_2:  _innerVFM   // get_Name:    _innerVFM   // getName->1:  _innerVFM   // getName->2:  _innerVFM   // getName->N:  _innerVFM   // ofs = 54434 ord = 2 addr = 0
	if_acmpeq Label15
	aload_3 
	aload_0_getfield _emojiButton   // get_name_1:  _emojiButton   // get_name_2:  _emojiButton   // get_Name:    _emojiButton   // getName->1:  _emojiButton   // getName->2:  _emojiButton   // getName->N:  _emojiButton   // ofs = 54430 ord = 1 addr = 0
	if_acmpne Label17
Label15:
	bipush -1
	ireturn 
Label17:
	aload_0 
	iload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.Manager.nextFocus // pc=3
	ireturn 
	}


public final sublayout( com.whatsapp.client.ScrollFixTextField, int, int ); // address: 0
	{
	enter 
	iconst_0 
	istore_3 
	iconst_0 
	istore_4 
	aload_0_getfield _emojiButton   // get_name_1:  _emojiButton   // get_name_2:  _emojiButton   // get_Name:    _emojiButton   // getName->1:  _emojiButton   // getName->2:  _emojiButton   // getName->N:  _emojiButton   // ofs = 54430 ord = 1 addr = 0
	ifnull Label30
	aload_0 
	aload_0_getfield _emojiButton   // get_name_1:  _emojiButton   // get_name_2:  _emojiButton   // get_Name:    _emojiButton   // getName->1:  _emojiButton   // getName->2:  _emojiButton   // getName->N:  _emojiButton   // ofs = 54430 ord = 1 addr = 0
	iload_1 
	iload_2 
	invokevirtual layoutChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
	aload_0_getfield _emojiButton   // get_name_1:  _emojiButton   // get_name_2:  _emojiButton   // get_Name:    _emojiButton   // getName->1:  _emojiButton   // getName->2:  _emojiButton   // getName->N:  _emojiButton   // ofs = 54430 ord = 1 addr = 0
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	aload_0_getfield _emojiButton   // get_name_1:  _emojiButton   // get_name_2:  _emojiButton   // get_Name:    _emojiButton   // getName->1:  _emojiButton   // getName->2:  _emojiButton   // getName->N:  _emojiButton   // ofs = 54430 ord = 1 addr = 0
	invokevirtual int getMarginLeft( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	aload_0_getfield _emojiButton   // get_name_1:  _emojiButton   // get_name_2:  _emojiButton   // get_Name:    _emojiButton   // getName->1:  _emojiButton   // getName->2:  _emojiButton   // getName->N:  _emojiButton   // ofs = 54430 ord = 1 addr = 0
	invokevirtual int getMarginRight( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	istore_3 
	aload_0_getfield _emojiButton   // get_name_1:  _emojiButton   // get_name_2:  _emojiButton   // get_Name:    _emojiButton   // getName->1:  _emojiButton   // getName->2:  _emojiButton   // getName->N:  _emojiButton   // ofs = 54430 ord = 1 addr = 0
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	aload_0_getfield _emojiButton   // get_name_1:  _emojiButton   // get_name_2:  _emojiButton   // get_Name:    _emojiButton   // getName->1:  _emojiButton   // getName->2:  _emojiButton   // getName->N:  _emojiButton   // ofs = 54430 ord = 1 addr = 0
	invokevirtual int getMarginTop( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	aload_0_getfield _emojiButton   // get_name_1:  _emojiButton   // get_name_2:  _emojiButton   // get_Name:    _emojiButton   // getName->1:  _emojiButton   // getName->2:  _emojiButton   // getName->N:  _emojiButton   // ofs = 54430 ord = 1 addr = 0
	invokevirtual int getMarginBottom( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	istore_4 
Label30:
	iload_2 
	iconst_1 
	iushr 
	istore_5 
	aload_0 
	aload_0_getfield _innerVFM   // get_name_1:  _innerVFM   // get_name_2:  _innerVFM   // get_Name:    _innerVFM   // getName->1:  _innerVFM   // getName->2:  _innerVFM   // getName->N:  _innerVFM   // ofs = 54434 ord = 2 addr = 0
	iload_1 
	aload_0_getfield _innerVFM   // get_name_1:  _innerVFM   // get_name_2:  _innerVFM   // get_Name:    _innerVFM   // getName->1:  _innerVFM   // getName->2:  _innerVFM   // getName->N:  _innerVFM   // ofs = 54434 ord = 2 addr = 0
	invokevirtual int getMarginLeft( net.rim.device.api.ui.Field ) // pc=1
	isub 
	aload_0_getfield _innerVFM   // get_name_1:  _innerVFM   // get_name_2:  _innerVFM   // get_Name:    _innerVFM   // getName->1:  _innerVFM   // getName->2:  _innerVFM   // getName->N:  _innerVFM   // ofs = 54434 ord = 2 addr = 0
	invokevirtual int getMarginRight( net.rim.device.api.ui.Field ) // pc=1
	isub 
	iload_3 
	isub 
	iload_5 
	aload_0_getfield _innerVFM   // get_name_1:  _innerVFM   // get_name_2:  _innerVFM   // get_Name:    _innerVFM   // getName->1:  _innerVFM   // getName->2:  _innerVFM   // getName->N:  _innerVFM   // ofs = 54434 ord = 2 addr = 0
	invokevirtual int getMarginTop( net.rim.device.api.ui.Field ) // pc=1
	aload_0_getfield _innerVFM   // get_name_1:  _innerVFM   // get_name_2:  _innerVFM   // get_Name:    _innerVFM   // getName->1:  _innerVFM   // getName->2:  _innerVFM   // getName->N:  _innerVFM   // ofs = 54434 ord = 2 addr = 0
	invokevirtual int getMarginBottom( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	isub 
	invokevirtual layoutChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
	iload_5 
	aload_0_getfield _innerVFM   // get_name_1:  _innerVFM   // get_name_2:  _innerVFM   // get_Name:    _innerVFM   // getName->1:  _innerVFM   // getName->2:  _innerVFM   // getName->N:  _innerVFM   // ofs = 54434 ord = 2 addr = 0
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	aload_0_getfield _innerVFM   // get_name_1:  _innerVFM   // get_name_2:  _innerVFM   // get_Name:    _innerVFM   // getName->1:  _innerVFM   // getName->2:  _innerVFM   // getName->N:  _innerVFM   // ofs = 54434 ord = 2 addr = 0
	invokevirtual int getMarginTop( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	aload_0_getfield _innerVFM   // get_name_1:  _innerVFM   // get_name_2:  _innerVFM   // get_Name:    _innerVFM   // getName->1:  _innerVFM   // getName->2:  _innerVFM   // getName->N:  _innerVFM   // ofs = 54434 ord = 2 addr = 0
	invokevirtual int getMarginBottom( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	invokestatic_lib int min( int, int ) // Math
	istore_6 
	iload_6 
	iload_4 
	invokestatic_lib int max( int, int ) // Math
	istore_7 
	aload_0_getfield _emojiButton   // get_name_1:  _emojiButton   // get_name_2:  _emojiButton   // get_Name:    _emojiButton   // getName->1:  _emojiButton   // getName->2:  _emojiButton   // getName->N:  _emojiButton   // ofs = 54430 ord = 1 addr = 0
	ifnull Label88
	aload_0 
	aload_0_getfield _emojiButton   // get_name_1:  _emojiButton   // get_name_2:  _emojiButton   // get_Name:    _emojiButton   // getName->1:  _emojiButton   // getName->2:  _emojiButton   // getName->N:  _emojiButton   // ofs = 54430 ord = 1 addr = 0
	iload_1 
	aload_0_getfield _emojiButton   // get_name_1:  _emojiButton   // get_name_2:  _emojiButton   // get_Name:    _emojiButton   // getName->1:  _emojiButton   // getName->2:  _emojiButton   // getName->N:  _emojiButton   // ofs = 54430 ord = 1 addr = 0
	invokevirtual int getMarginRight( net.rim.device.api.ui.Field ) // pc=1
	isub 
	aload_0_getfield _emojiButton   // get_name_1:  _emojiButton   // get_name_2:  _emojiButton   // get_Name:    _emojiButton   // getName->1:  _emojiButton   // getName->2:  _emojiButton   // getName->N:  _emojiButton   // ofs = 54430 ord = 1 addr = 0
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	isub 
	iload_7 
	iconst_1 
	iushr 
	aload_0_getfield _emojiButton   // get_name_1:  _emojiButton   // get_name_2:  _emojiButton   // get_Name:    _emojiButton   // getName->1:  _emojiButton   // getName->2:  _emojiButton   // getName->N:  _emojiButton   // ofs = 54430 ord = 1 addr = 0
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	iconst_1 
	iushr 
	isub 
	invokevirtual setPositionChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
Label88:
	aload_0 
	aload_0_getfield _innerVFM   // get_name_1:  _innerVFM   // get_name_2:  _innerVFM   // get_Name:    _innerVFM   // getName->1:  _innerVFM   // getName->2:  _innerVFM   // getName->N:  _innerVFM   // ofs = 54434 ord = 2 addr = 0
	aload_0_getfield _innerVFM   // get_name_1:  _innerVFM   // get_name_2:  _innerVFM   // get_Name:    _innerVFM   // getName->1:  _innerVFM   // getName->2:  _innerVFM   // getName->N:  _innerVFM   // ofs = 54434 ord = 2 addr = 0
	invokevirtual int getMarginLeft( net.rim.device.api.ui.Field ) // pc=1
	iload_7 
	iconst_1 
	iushr 
	aload_0_getfield _innerVFM   // get_name_1:  _innerVFM   // get_name_2:  _innerVFM   // get_Name:    _innerVFM   // getName->1:  _innerVFM   // getName->2:  _innerVFM   // getName->N:  _innerVFM   // ofs = 54434 ord = 2 addr = 0
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	iconst_1 
	iushr 
	isub 
	invokevirtual setPositionChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
	aload_0 
	iload_1 
	iload_7 
	invokevirtual setExtent( net.rim.device.api.ui.ScrollView, int, int ) // pc=3
	return 
	}


protected final subpaint( com.whatsapp.client.ScrollFixTextField, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	istore_2 
	iconst_0 
	istore_3 
Label6:
	iload_3 
	iload_2 
	if_icmpge Label65
	aload_0 
	iload_3 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	astore_4 
	aload_4 
	aload_0_getfield _innerVFM   // get_name_1:  _innerVFM   // get_name_2:  _innerVFM   // get_Name:    _innerVFM   // getName->1:  _innerVFM   // getName->2:  _innerVFM   // getName->N:  _innerVFM   // ofs = 54434 ord = 2 addr = 0
	if_acmpne Label59
	aload_1 
	invokevirtual int getColor( net.rim.device.api.ui.Graphics ) // pc=1
	istore_5 
	aload_4 
	invokevirtual net.rim.device.api.ui.XYRect getContentRect( net.rim.device.api.ui.Field ) // pc=1
	astore_6 
	aload_6 
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	iconst_1 
	iushr 
	istore_7 
	aload_1 
	iipush 16448250
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	aload_6 
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	aload_6 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	aload_6 
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	iload_7 
	invokevirtual fillRect( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	aload_1 
	iipush 16711422
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	aload_6 
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	aload_6 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	iload_7 
	iadd 
	aload_6 
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	aload_6 
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	iload_7 
	isub 
	invokevirtual fillRect( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	aload_1 
	iload_5 
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
Label59:
	aload_0 
	aload_1 
	aload_4 
	invokevirtual paintChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Graphics, net.rim.device.api.ui.Field ) // pc=3
	iinc 3 1
	goto Label6
Label65:
	return 
	}

}
