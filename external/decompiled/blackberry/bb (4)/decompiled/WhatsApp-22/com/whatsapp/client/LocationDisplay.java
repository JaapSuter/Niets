// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-21.cod
// Module version  : 2.7.3204
// Class ID        : 5
// ########################################################


package com.whatsapp.client;


abstract public final class LocationDisplay extends com.whatsapp.client.AbstractMediaDisplay

{


	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.LocationDisplay, module:WhatsApp-16.class#28, com.whatsapp.client.ChatLine ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	aload_2 
	invokespecial_lib .routine_1813 // pc=3
	aload_0 
	invokespecial com.whatsapp.client.LocationDisplay.routine_4555 // pc=1
	astore_3 
	aload_0 
	invokespecial com.whatsapp.client.LocationDisplay.routine_4625 // pc=1
	astore_4 
	new_lib com.whatsapp.field.MediaDisplayField//com.whatsapp.field.MediaDisplayField com.whatsapp.field.MediaDisplayField com.whatsapp.field.MediaDisplayField
	dup 
	aload_0 
	invokenonvirtual com.whatsapp.client.LocationDisplay.getPreviewImage // pc=1
	aload_0 
	invokenonvirtual_lib .routine_1766 // pc=1
	ifne Label20
	iconst_1 
	goto Label21
Label20:
	iconst_0 
Label21:
	invokespecial_lib .routine_4472 // pc=3
	astore_5 
	aload_5 
	iconst_1 
	invokenonvirtual_lib .routine_1803 // pc=2
	aload_5 
	new LocationDisplay$1
	dup 
	aload_0 
	invokespecial com.whatsapp.client.LocationDisplay$1.<init> // pc=2
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0 
	aload_5 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	new_lib net.rim.device.api.ui.component.RichTextField//net.rim.device.api.ui.component.RichTextField net.rim.device.api.ui.component.RichTextField net.rim.device.api.ui.component.RichTextField
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
	invokespecial_lib .routine_5554 // pc=9
	astore 8
	aload 8
	new LocationDisplay$2
	dup 
	aload_0 
	invokespecial com.whatsapp.client.LocationDisplay$2.<init> // pc=2
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	iconst_1 
	istore_7 
	aload_6 
	aload 8
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	goto Label93
Label77:
	new_lib net.rim.device.api.ui.decor.Background//net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background
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
	new_lib com.whatsapp.client.LocationDisplay$TwoLineTextField//com.whatsapp.client.LocationDisplay$TwoLineTextField com.whatsapp.client.LocationDisplay$TwoLineTextField com.whatsapp.client.LocationDisplay$TwoLineTextField
	dup 
	aload_0 
	aload_4 
	iload_7 
	invokespecial_lib .routine_243 // pc=4
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

private final java.lang.String com.whatsapp.client.LocationDisplay.routine_4555( com.whatsapp.client.LocationDisplay ); // address: 0
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


private final java.lang.String com.whatsapp.client.LocationDisplay.routine_4625( com.whatsapp.client.LocationDisplay ); // address: 0
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
	invokestatic_lib module:WhatsApp-35.class#0.routine_2682(  ) // class#0
Label11:
	return 
	}


private final boolean com.whatsapp.client.LocationDisplay.routine_4754( com.whatsapp.client.LocationDisplay, double, double, java.lang.String ); // address: 0
	{
	enter 
	ldc literal_120:"GoogleMaps"
	invokestatic_lib int getModuleHandle( java.lang.String ) // CodeModuleManager
	istore_6 
	iload_6 
	ifne Label8
	iconst_0 
	ireturn 
Label8:
	new_lib net.rim.blackberry.api.browser.URLEncodedPostData//net.rim.blackberry.api.browser.URLEncodedPostData net.rim.blackberry.api.browser.URLEncodedPostData net.rim.blackberry.api.browser.URLEncodedPostData
	dup 
	aconst_null 
	iconst_0 
	invokespecial_lib net.rim.blackberry.api.browser.URLEncodedPostData.<init> // pc=3
	astore_7 
	aload_7 
	ldc literal_121:"action"
	ldc literal_122:"LOCN"
	invokevirtual append( net.rim.blackberry.api.browser.URLEncodedPostData, java.lang.String, java.lang.String ) // pc=3
	aload_7 
	ldc literal_123:"a"
	new_lib net.rim.device.api.ui.XYEdges//net.rim.device.api.ui.XYEdges net.rim.device.api.ui.XYEdges net.rim.device.api.ui.XYEdges
	dup 
	ldc literal_124:"@latlon:"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	isreal 
	lload 1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, double ) // pc=3
	ldc literal_125:","
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	isreal 
	lload 3
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, double ) // pc=3
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual append( net.rim.blackberry.api.browser.URLEncodedPostData, java.lang.String, java.lang.String ) // pc=3
	aload_7 
	ldc literal_126:"title"
	aload_5 
	invokevirtual append( net.rim.blackberry.api.browser.URLEncodedPostData, java.lang.String, java.lang.String ) // pc=3
	aload_7 
	ldc literal_127:"description"
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokevirtual append( net.rim.blackberry.api.browser.URLEncodedPostData, java.lang.String, java.lang.String ) // pc=3
	iconst_1 
	newarray_object_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	iconst_0 
	new_lib net.rim.device.api.ui.XYEdges//net.rim.device.api.ui.XYEdges net.rim.device.api.ui.XYEdges net.rim.device.api.ui.XYEdges
	dup 
	ldc literal_128:"http://gmm/x?"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_7 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	aastore 
	astore 8
	iload_6 
	invokestatic_lib net.rim.device.api.system.ApplicationDescriptor[] getApplicationDescriptors( int ) // CodeModuleManager
	iconst_0 
	aaload 
	astore 9
	new_lib net.rim.device.api.ui.Field//net.rim.device.api.ui.Field net.rim.device.api.ui.Field net.rim.device.api.ui.Field
	dup 
	aload 9
	aload 8
	invokespecial_lib net.rim.device.api.system.ApplicationDescriptor.<init> // pc=3
	astore 10
	invokestatic_lib net.rim.device.api.system.ApplicationManager getApplicationManager(  ) // ApplicationManager
	aload 10
	iconst_1 
	invokevirtual int runApplication( net.rim.device.api.system.ApplicationManager, net.rim.device.api.system.ApplicationDescriptor, boolean ) // pc=3
	pop 
	iconst_1 
	ireturn 
	astore_6 
	iconst_0 
	ireturn 
	}


private final com.whatsapp.client.LocationDisplay.routine_4962( com.whatsapp.client.LocationDisplay, double, double ); // address: 0
	{
	enter 
	new_lib net.rim.device.api.ui.XYEdges//net.rim.device.api.ui.XYEdges net.rim.device.api.ui.XYEdges net.rim.device.api.ui.XYEdges
	dup 
	ldc literal_129:"http://maps.google.com/maps?f=q&source=s_q&geocode=&q="
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	isreal 
	lload 1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, double ) // pc=3
	ldc literal_125:","
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	isreal 
	lload 3
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, double ) // pc=3
	ldc literal_130:"&z=17"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_5 
	aload_5 
	invokestatic_lib module:WhatsApp-35.class#0.routine_2682(  ) // class#0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final net.rim.device.api.system.Bitmap getPreviewImage( com.whatsapp.client.LocationDisplay ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib .routine_1622 // pc=1
	astore_1 
	aload_0_getfield _mData   // get_name_1:  _mData   // get_name_2:  _mData   // get_Name:    _mData   // getName->1:  _mData   // getName->2:  _mData   // getName->N:  _mData   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_2497 // pc=1
	ifeq Label11
	aload_1 
	bipush 10
	invokestatic_lib module:WhatsApp-9.class#2.routine_3013(  ) // class#2
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
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	astore_7 
	goto Label48
Label35:
	aload_0_getfield _parentLine   // get_name_1:  _parentLine   // get_name_2:  _parentLine   // get_Name:    _parentLine   // getName->1:  _parentLine   // getName->2:  _parentLine   // getName->N:  _parentLine   // ofs = -1 ord = 2 addr = -1
	getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 1 addr = -1
	getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = -1 ord = 0 addr = -1
	ifnonnull Label44
	aload_0_getfield _parentLine   // get_name_1:  _parentLine   // get_name_2:  _parentLine   // get_Name:    _parentLine   // getName->1:  _parentLine   // getName->2:  _parentLine   // getName->N:  _parentLine   // ofs = -1 ord = 2 addr = -1
	getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 1 addr = -1
	getfield _title   // get_name_1:  _title   // get_name_2:  _title   // get_Name:    _title   // getName->1:  _title   // getName->2:  _title   // getName->N:  _title   // ofs = -1 ord = 1 addr = -1
	astore_7 
	goto Label48
Label44:
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 1 addr = -1
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokestatic_lib module:WhatsApp-9.class#15.routine_8159(  ) // class#15
	astore_7 
Label48:
	new_lib net.rim.device.api.ui.XYEdges//net.rim.device.api.ui.XYEdges net.rim.device.api.ui.XYEdges net.rim.device.api.ui.XYEdges
	dup 
	ldc literal_114:"<lbs><location y='"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload_5 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_115:"' x='"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	iload_6 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_116:"' "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore 8
	new_lib net.rim.device.api.ui.XYEdges//net.rim.device.api.ui.XYEdges net.rim.device.api.ui.XYEdges net.rim.device.api.ui.XYEdges
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload 8
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_117:"label='"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_7 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_118:"' zoom='4' description='location' /></lbs>"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore 8
	invokestatic_lib module:WhatsApp-27.class#8.routine_2921(  ) // class#8
	invokenonvirtual_lib .routine_2301 // pc=1
	astore 9
	aload 9
	invokenonvirtual_lib .routine_2684 // pc=1
	ifne Label108
	bipush 7
	new_lib net.rim.blackberry.api.invoke.MapsArguments//net.rim.blackberry.api.invoke.MapsArguments net.rim.blackberry.api.invoke.MapsArguments net.rim.blackberry.api.invoke.MapsArguments
	dup 
	ldc literal_119:"location_document"
	aload 8
	invokespecial_lib net.rim.blackberry.api.invoke.MapsArguments.<init> // pc=3
	invokestatic_lib invokeApplication( int, net.rim.blackberry.api.invoke.ApplicationArguments ) // Invoke
	return 
	astore 10
	new_lib com.whatsapp.client.LocationDisplayScreen//com.whatsapp.client.LocationDisplayScreen com.whatsapp.client.LocationDisplayScreen com.whatsapp.client.LocationDisplayScreen
	dup 
	isreal 
	lload 1
	isreal 
	lload 3
	aload_0_getfield _parentLine   // get_name_1:  _parentLine   // get_name_2:  _parentLine   // get_Name:    _parentLine   // getName->1:  _parentLine   // getName->2:  _parentLine   // getName->N:  _parentLine   // ofs = -1 ord = 2 addr = -1
	getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 1 addr = -1
	getfield _title   // get_name_1:  _title   // get_name_2:  _title   // get_Name:    _title   // getName->1:  _title   // getName->2:  _title   // getName->N:  _title   // ofs = -1 ord = 1 addr = -1
	invokespecial_lib .routine_440 // pc=6
	astore 10
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
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
	aload_7 
	invokespecial com.whatsapp.client.LocationDisplay.routine_4754 // pc=6
	ifne Label122
	aload_0 
	isreal 
	lload 1
	isreal 
	lload 3
	invokespecial com.whatsapp.client.LocationDisplay.routine_4962 // pc=5
Label122:
	return 
	}

}
