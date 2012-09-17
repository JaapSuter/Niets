// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-21.cod
// Module version  : 2.7.3204
// Class ID        : 1
// ########################################################


package com.whatsapp.client;


abstract public final class LocationDisplay extends com.whatsapp.client.AbstractMediaDisplay

{


	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.LocationDisplay, module:WhatsApp-17.class#15, com.whatsapp.client.ChatLine ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	aload_2 
	invokespecial_lib .routine_1803 // pc=3
	aload_0 
	invokespecial com.whatsapp.client.LocationDisplay.routine_1235 // pc=1
	astore_3 
	aload_0 
	invokespecial com.whatsapp.client.LocationDisplay.routine_1305 // pc=1
	astore_4 
	new_lib com.whatsapp.field.MediaDisplayField//com.whatsapp.field.MediaDisplayField com.whatsapp.field.MediaDisplayField com.whatsapp.field.MediaDisplayField
	dup 
	aload_0 
	invokenonvirtual com.whatsapp.client.LocationDisplay.getPreviewImage // pc=1
	aload_0 
	invokenonvirtual_lib .routine_1756 // pc=1
	ifne Label20
	iconst_1 
	goto Label21
Label20:
	iconst_0 
Label21:
	invokespecial_lib .routine_10030 // pc=3
	astore_5 
	aload_5 
	iconst_1 
	invokenonvirtual_lib .routine_7361 // pc=2
	aload_5 
	new_lib com.whatsapp.client.//module:WhatsApp-20.class#18 module:WhatsApp-20.class#18 module:WhatsApp-20.class#18
	dup 
	aload_0 
	invokespecial_lib .routine_7483 // pc=2
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0 
	aload_5 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	new_lib net.rim.device.api.ui.decor.Border//net.rim.device.api.ui.decor.Border net.rim.device.api.ui.decor.Border net.rim.device.api.ui.decor.Border
	dup 
	lipush 51539607552
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.<init> // pc=3
	astore_6 
	aload_6 
	iconst_0 
	iconst_0 
	iconst_0 
	bipush 10
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	iconst_0 
	istore_7 
	aload_3 
	ifnull Label93
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 1 addr = -1
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifnull Label77
	new_lib com.whatsapp.client.HyperlinkButtonField//com.whatsapp.client.HyperlinkButtonField com.whatsapp.client.HyperlinkButtonField com.whatsapp.client.HyperlinkButtonField
	dup 
	aload_3 
	sipush 255
	iipush 16777215
	iipush 2129150
	iconst_0 
	iconst_0 
	bipush 64
	i2l 
	invokespecial_lib .routine_2305 // pc=9
	astore 8
	aload 8
	new_lib com.whatsapp.client.LocationDisplay$2//module:WhatsApp-20.class#19 module:WhatsApp-20.class#19 module:WhatsApp-20.class#19
	dup 
	aload_0 
	invokespecial_lib .routine_7522 // pc=2
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	iconst_1 
	istore_7 
	aload_6 
	aload 8
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	goto Label93
Label77:
	new_lib net.rim.device.api.ui.Graphics//net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics
	dup 
	aload_3 
	bipush 64
	i2l 
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=4
	astore 8
	aload 8
	aload 8
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	bipush 4
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int ) // pc=2
	invokevirtual setFont( net.rim.device.api.ui.Field, net.rim.device.api.ui.Font ) // pc=2
	aload_6 
	aload 8
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
Label93:
	aload_4 
	ifnull Label128
	new LocationDisplay$TwoLineTextField
	dup 
	aload_0 
	aload_4 
	iload_7 
	invokespecial com.whatsapp.client.LocationDisplay$TwoLineTextField.<init> // pc=4
	astore 8
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	astore 9
	aload 9
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	bipush 4
	idiv 
	istore 10
	aload 8
	aload 9
	iconst_0 
	aload 9
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	bipush 2
	isub 
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int, int ) // pc=3
	invokevirtual setFont( net.rim.device.api.ui.Field, net.rim.device.api.ui.Font ) // pc=2
	aload 8
	iload 10
	iconst_0 
	iconst_0 
	iconst_0 
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_6 
	aload 8
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
Label128:
	aload_0 
	aload_6 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final java.lang.String com.whatsapp.client.LocationDisplay.routine_1235( com.whatsapp.client.LocationDisplay ); // address: 0
	{
	enter_narrow 
	aconst_null 
	astore_1 
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 1 addr = -1
	getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	ifnull Label27
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 1 addr = -1
	getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	bipush 10
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	istore_2 
	iload_2 
	bipush -1
	if_icmpeq Label23
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 1 addr = -1
	getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	iconst_0 
	iload_2 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	invokenonvirtual_lib java.lang.String.trim // pc=1
	astore_1 
	aload_1 
	areturn 
Label23:
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 1 addr = -1
	getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	invokenonvirtual_lib java.lang.String.trim // pc=1
	astore_1 
Label27:
	aload_1 
	areturn 
	}


private final java.lang.String com.whatsapp.client.LocationDisplay.routine_1305( com.whatsapp.client.LocationDisplay ); // address: 0
	{
	enter_narrow 
	aconst_null 
	astore_1 
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 1 addr = -1
	getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	ifnull Label29
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 1 addr = -1
	getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	bipush 10
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	istore_2 
	iload_2 
	bipush -1
	if_icmpeq Label29
	iload_2 
	iconst_1 
	iadd 
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 1 addr = -1
	getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	stringlength 
	if_icmpge Label29
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 1 addr = -1
	getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	iload_2 
	iconst_1 
	iadd 
	invokenonvirtual_lib java.lang.String.substring // pc=2
	invokenonvirtual_lib java.lang.String.trim // pc=1
	astore_1 
Label29:
	aload_1 
	areturn 
	}


private final locationMapClicked( com.whatsapp.client.LocationDisplay ); // address: 0
	{
	enter 
	aload_0 
	invokenonvirtual com.whatsapp.client.LocationDisplay.doView // pc=1
	return 
	}


private final locationNameClicked( com.whatsapp.client.LocationDisplay ); // address: 0
	{
	enter 
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 1 addr = -1
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifnull Label11
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 1 addr = -1
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	stringlength 
	ifle Label11
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 1 addr = -1
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokestatic_lib module:WhatsApp-32.class#2.routine_3979(  ) // class#2
Label11:
	return 
	}


private final com.whatsapp.client.LocationDisplay.routine_1434( com.whatsapp.client.LocationDisplay, double, double ); // address: 0
	{
	enter 
	new_lib net.rim.device.api.ui.XYRect//net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect
	dup 
	ldc literal_57:"http://maps.google.com/maps?f=q&source=s_q&geocode=&q="
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	isreal 
	lload 1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, double ) // pc=3
	ldc literal_58:","
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	isreal 
	lload 3
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, double ) // pc=3
	ldc literal_59:"&z=17"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_5 
	aload_5 
	invokestatic_lib module:WhatsApp-32.class#2.routine_3979(  ) // class#2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final net.rim.device.api.system.Bitmap getPreviewImage( com.whatsapp.client.LocationDisplay ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib .routine_1612 // pc=1
	astore_1 
	aload_0_getfield _mData   // get_name_1:  _mData   // get_name_2:  _mData   // get_Name:    _mData   // getName->1:  _mData   // getName->2:  _mData   // getName->N:  _mData   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_72 // pc=1
	ifeq Label11
	aload_1 
	bipush 10
	invokestatic_lib module:WhatsApp-9.class#2.routine_2549(  ) // class#2
	areturn 
Label11:
	aload_1 
	areturn 
	}


public final doView( com.whatsapp.client.LocationDisplay ); // address: 0
	{
	enter 
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 1 addr = -1
	lgetfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	isreal 
	lstore 1
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 1 addr = -1
	lgetfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	isreal 
	lstore 3
	isreal 
	lload 1
	isreal 
	lipush 4681608360884174848
	op01xx 
	dmul 
	op01xx 
	d2i 
	istore_5 
	isreal 
	lload 3
	isreal 
	lipush 4681608360884174848
	op01xx 
	dmul 
	op01xx 
	d2i 
	istore_6 
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 1 addr = -1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifeq Label35
	sipush 689
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	astore_7 
	goto Label48
Label35:
	aload_0_getfield _parentLine   // get_name_1:  _parentLine   // get_name_2:  _parentLine   // get_Name:    _parentLine   // getName->1:  _parentLine   // getName->2:  _parentLine   // getName->N:  _parentLine   // ofs = -1 ord = 2 addr = -1
	getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = -1 ord = 0 addr = -1
	ifnonnull Label44
	aload_0_getfield _parentLine   // get_name_1:  _parentLine   // get_name_2:  _parentLine   // get_Name:    _parentLine   // getName->1:  _parentLine   // getName->2:  _parentLine   // getName->N:  _parentLine   // ofs = -1 ord = 2 addr = -1
	getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	getfield _title   // get_name_1:  _title   // get_name_2:  _title   // get_Name:    _title   // getName->1:  _title   // getName->2:  _title   // getName->N:  _title   // ofs = -1 ord = 1 addr = -1
	astore_7 
	goto Label48
Label44:
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 1 addr = -1
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokestatic_lib module:WhatsApp-9.class#17.routine_7781(  ) // class#17
	astore_7 
Label48:
	new_lib net.rim.device.api.ui.XYRect//net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect
	dup 
	ldc literal_51:"<lbs><location y='"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload_5 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_52:"' x='"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	iload_6 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_53:"' "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore 8
	new_lib net.rim.device.api.ui.XYRect//net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload 8
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_54:"label='"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_7 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_55:"' zoom='4' description='location' /></lbs>"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore 8
	invokestatic_lib module:WhatsApp-26.class#11.routine_3571(  ) // class#11
	invokenonvirtual_lib .routine_2951 // pc=1
	astore 9
	aload 9
	invokenonvirtual_lib .routine_2636 // pc=1
	ifne Label108
	bipush 7
	new_lib net.rim.blackberry.api.invoke.MapsArguments//net.rim.blackberry.api.invoke.MapsArguments net.rim.blackberry.api.invoke.MapsArguments net.rim.blackberry.api.invoke.MapsArguments
	dup 
	ldc literal_56:"location_document"
	aload 8
	invokespecial_lib net.rim.blackberry.api.invoke.MapsArguments.<init> // pc=3
	invokestatic_lib invokeApplication( int, net.rim.blackberry.api.invoke.ApplicationArguments ) // Invoke
	return 
	astore 10
	new LocationDisplayScreen
	dup 
	isreal 
	lload 1
	isreal 
	lload 3
	aload_0_getfield _parentLine   // get_name_1:  _parentLine   // get_name_2:  _parentLine   // get_Name:    _parentLine   // getName->1:  _parentLine   // getName->2:  _parentLine   // getName->N:  _parentLine   // ofs = -1 ord = 2 addr = -1
	getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	getfield _title   // get_name_1:  _title   // get_name_2:  _title   // get_Name:    _title   // getName->1:  _title   // getName->2:  _title   // getName->N:  _title   // ofs = -1 ord = 1 addr = -1
	invokespecial com.whatsapp.client.LocationDisplayScreen.<init> // pc=6
	astore 10
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	astore 11
	aload 11
	aload 10
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	astore 10
Label108:
	aload_0 
	isreal 
	lload 1
	isreal 
	lload 3
	invokespecial com.whatsapp.client.LocationDisplay.routine_1434 // pc=5
	return 
	}

}
