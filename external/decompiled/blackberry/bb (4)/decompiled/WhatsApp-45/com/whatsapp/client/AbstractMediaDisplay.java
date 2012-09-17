// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-45.cod
// Module version  : 2.7.6550
// Class ID        : 8
// ########################################################


package com.whatsapp.client;


public class AbstractMediaDisplay extends net.rim.device.api.ui.container.HorizontalFieldManager

{

	// @@@@@@@@@@@@@ Fields 
	protected com.whatsapp.client. /*module:WhatsApp-16.class#3*/  _fmsg ; // ofs = 59160 addr = 0)
	protected com.whatsapp.client. /*module:WhatsApp-24.class#9*/  _mData ; // ofs = 59164 addr = 0)
	protected com.whatsapp.client.ChatLine /*com.whatsapp.client.ChatLine*/  _parentLine ; // ofs = 59168 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

protected <init>( com.whatsapp.client.AbstractMediaDisplay, module:WhatsApp-16.class#3, com.whatsapp.client.ChatLine ); // address: 0
	{
	enter_narrow 
	aload_0 
	lipush 2392537302040576
	invokespecial_lib net.rim.device.api.ui.container.HorizontalFieldManager.<init> // pc=3
	aload_0 
	aload_1 
	putfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 59160 ord = 0 addr = 0
	aload_0 
	aload_2 
	putfield _parentLine   // get_name_1:  _parentLine   // get_name_2:  _parentLine   // get_Name:    _parentLine   // getName->1:  _parentLine   // getName->2:  _parentLine   // getName->N:  _parentLine   // ofs = 59168 ord = 2 addr = 0
	aload_0 
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 59160 ord = 0 addr = 0
	getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	checkcast_lib com.whatsapp.client.MessageDigest//module:WhatsApp-24.class#9 module:WhatsApp-24.class#9 module:WhatsApp-24.class#9
	putfield _mData   // get_name_1:  _mData   // get_name_2:  _mData   // get_Name:    _mData   // getName->1:  _mData   // getName->2:  _mData   // getName->N:  _mData   // ofs = 59164 ord = 1 addr = 0
	return 
	}


static public java.lang.String getLocalizedFMessageType( module:WhatsApp-16.class#3 ); // address: 0
	{
	enter 
	iconst_1 
	newarray 5
	astore_1 
	aload_1 
	iconst_0 
	sipush 626
	iastore 
	aload_0 
	new AbstractMediaDisplay$1
	dup 
	aload_1 
	invokespecial com.whatsapp.client.AbstractMediaDisplay$1.<init> // pc=2
	invokenonvirtual_lib .routine_10398 // pc=2
	aload_1 
	iconst_0 
	iaload 
	invokestatic_lib module:WhatsApp-30.class#25.routine_5470(  ) // class#25
	areturn 
	}


static private boolean checkDataAvailable( module:WhatsApp-24.class#9 ); // address: 0
	{
	enter 
	aload_0 
	invokenonvirtual_lib .routine_2600 // pc=1
	ifne Label7
	aload_0 
	invokenonvirtual_lib .routine_2622 // pc=1
	ifeq Label9
Label7:
	iconst_1 
	ireturn 
Label9:
	sipush 628
	invokestatic_lib module:WhatsApp-30.class#25.routine_5470(  ) // class#25
	invokestatic_lib alert( java.lang.String ) // Dialog
	iconst_0 
	ireturn 
	}


static public boolean checkImageBuffered( module:WhatsApp-24.class#9 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	ifgt Label16
	aload_0 
	invokenonvirtual_lib .routine_2706 // pc=1
	istore_1 
	iload_1 
	ifne Label13
	sipush 628
	invokestatic_lib module:WhatsApp-30.class#25.routine_5470(  ) // class#25
	invokestatic_lib alert( java.lang.String ) // Dialog
	iconst_0 
	ireturn 
Label13:
	aload_0 
	iconst_0 
	invokestatic_lib module:WhatsApp-24.class#9.routine_3509(  ) // class#9
Label16:
	iconst_1 
	ireturn 
	}


static public showMediaBrowserScreen( module:WhatsApp-16.class#3, java.lang.String, module:WhatsApp-9.class#15 ); // address: 0
	{
	enter 
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	bipush 2
	if_icmpeq Label10
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	bipush 3
	if_icmpeq Label10
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	iconst_1 
	if_icmpne Label54
Label10:
	new_lib com.whatsapp.client.//module:WhatsApp-25.class#3 module:WhatsApp-25.class#3 module:WhatsApp-25.class#3
	dup 
	aload_1 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_2 
	invokespecial_lib .routine_2433 // pc=4
	astore_3 
	new_lib net.rim.device.api.ui.Graphics//net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_4 
	aload_4 
	aload_0 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_3 
	aload_4 
	invokenonvirtual_lib .routine_893 // pc=2
	aload_3 
	iconst_0 
	invokenonvirtual_lib .routine_1045 // pc=2
	invokestatic_lib com.whatsapp.client.UiApp.routine_3299(  ) // UiApp
	aload_3 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	new AbstractMediaDisplay$2
	dup 
	aload_0 
	aload_3 
	invokespecial com.whatsapp.client.AbstractMediaDisplay$2.<init> // pc=3
	astore_5 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	aload_5 
	invokespecial_lib java.lang.Thread.<init> // pc=2
	invokevirtual start( java.lang.Thread ) // pc=1
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	bipush 2
	if_icmpeq Label51
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	bipush 3
	if_icmpne Label56
Label51:
	aload_0 
	invokestatic showMediaViewScreen( module:WhatsApp-16.class#3 ) // AbstractMediaDisplay
	return 
Label54:
	aload_0 
	invokestatic showMediaViewScreen( module:WhatsApp-16.class#3 ) // AbstractMediaDisplay
Label56:
	return 
	}


static public showMediaViewScreen( module:WhatsApp-16.class#3 ); // address: 0
	{
	enter 
	aload_0 
	new_lib com.whatsapp.client.//module:WhatsApp.class#0 module:WhatsApp.class#0 module:WhatsApp.class#0
	dup 
	aload_0 
	invokespecial_lib .routine_390 // pc=2
	invokenonvirtual_lib .routine_10398 // pc=2
	return 
	}


static private net.rim.device.api.ui.extension.container.ZoomScreen createZoomImageScreen( module:WhatsApp-16.class#3, net.rim.device.api.system.EncodedImage ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.AccountScreen$3//module:WhatsApp.class#1 module:WhatsApp.class#1 module:WhatsApp.class#1
	dup 
	aload_1 
	invokespecial_lib .routine_438 // pc=2
	astore_2 
	iipush 310000
	istore_3 
	sipush 1200
	istore_4 
	new_lib com.whatsapp.client.AdvancedSettingsScreen$2//module:WhatsApp.class#2 module:WhatsApp.class#2 module:WhatsApp.class#2
	dup 
	invokestatic_lib module:WhatsApp-30.class#25.routine_5442(  ) // class#25
	sipush 981
	iload_3 
	iload_4 
	aload_2 
	invokespecial_lib .routine_473 // pc=6
	astore_5 
	aload_2 
	aload_5 
	invokevirtual addMenuItem( net.rim.device.api.ui.container.MainScreen, net.rim.device.api.ui.MenuItem ) // pc=2
	iload_3 
	iipush 65536
	iadd 
	istore_3 
	iinc 4 10
	aload_0 
	invokestatic_lib module:WhatsApp-14.class#4.routine_5711(  ) // class#4
	astore_6 
	iconst_0 
	istore_7 
Label32:
	iload_7 
	aload_6 
	arraylength 
	if_icmpge Label53
	aload_6 
	iload_7 
	aaload 
	astore 8
	aload 8
	iinc 3 10
	iload_3 
	invokevirtual setOrdinal( net.rim.device.api.ui.MenuItem, int ) // pc=2
	aload 8
	iinc 4 10
	iload_4 
	invokevirtual setPriority( net.rim.device.api.ui.MenuItem, int ) // pc=2
	aload_2 
	aload 8
	invokevirtual addMenuItem( net.rim.device.api.ui.container.MainScreen, net.rim.device.api.ui.MenuItem ) // pc=2
	iinc 7 1
	goto Label32
Label53:
	aload_2 
	areturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public boolean isTransferInProgress( com.whatsapp.client.AbstractMediaDisplay ); // address: 0
	{
	ireturn_bipush 0
	}


protected net.rim.device.api.system.Bitmap getPreviewImage( com.whatsapp.client.AbstractMediaDisplay ); // address: 0
	{
	enter_narrow 
	aconst_null 
	astore_1 
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 59160 ord = 0 addr = 0
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	bipush 2
	if_icmpeq Label23
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 59160 ord = 0 addr = 0
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	bipush 3
	if_icmpeq Label23
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 59160 ord = 0 addr = 0
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	iconst_1 
	if_icmpeq Label23
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 59160 ord = 0 addr = 0
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	bipush 5
	if_icmpeq Label23
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 59160 ord = 0 addr = 0
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	bipush 4
	if_icmpne Label52
Label23:
	aload_0_getfield _mData   // get_name_1:  _mData   // get_name_2:  _mData   // get_Name:    _mData   // getName->1:  _mData   // getName->2:  _mData   // getName->N:  _mData   // ofs = 59164 ord = 1 addr = 0
	invokenonvirtual_lib .routine_2496 // pc=1
	astore_1 
	aload_1 
	ifnull Label31
	aload_0_getfield _mData   // get_name_1:  _mData   // get_name_2:  _mData   // get_Name:    _mData   // getName->1:  _mData   // getName->2:  _mData   // getName->N:  _mData   // ofs = 59164 ord = 1 addr = 0
	invokenonvirtual_lib .routine_2526 // pc=1
	ifeq Label52
Label31:
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 59160 ord = 0 addr = 0
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	tableswitch  :
		
		
		
		
		

Label34:
	getstatic_lib module:WhatsApp-12.class#1.static_94 // class#1
	invokestatic_lib module:WhatsApp-37.class#1.routine_625(  ) // class#1
	astore_1 
	aload_1 
	areturn 
Label39:
	getstatic_lib module:WhatsApp-12.class#1.static_95 // class#1
	invokestatic_lib module:WhatsApp-37.class#1.routine_625(  ) // class#1
	astore_1 
	aload_1 
	areturn 
Label44:
	getstatic_lib module:WhatsApp-12.class#1.static_96 // class#1
	invokestatic_lib module:WhatsApp-37.class#1.routine_625(  ) // class#1
	astore_1 
	aload_1 
	areturn 
Label49:
	getstatic_lib module:WhatsApp-12.class#1.static_97 // class#1
	invokestatic_lib module:WhatsApp-37.class#1.routine_625(  ) // class#1
	astore_1 
Label52:
	aload_1 
	areturn 
	}


protected boolean isPreviewBorderTransparent( com.whatsapp.client.AbstractMediaDisplay ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _mData   // get_name_1:  _mData   // get_name_2:  _mData   // get_Name:    _mData   // getName->1:  _mData   // getName->2:  _mData   // getName->N:  _mData   // ofs = 59164 ord = 1 addr = 0
	invokenonvirtual_lib .routine_2526 // pc=1
	ireturn 
	}


public doView( com.whatsapp.client.AbstractMediaDisplay ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 59160 ord = 0 addr = 0
	aload_0_getfield _parentLine   // get_name_1:  _parentLine   // get_name_2:  _parentLine   // get_Name:    _parentLine   // getName->1:  _parentLine   // getName->2:  _parentLine   // getName->N:  _parentLine   // ofs = 59168 ord = 2 addr = 0
	getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	getfield _title   // get_name_1:  _title   // get_name_2:  _title   // get_Name:    _title   // getName->1:  _title   // getName->2:  _title   // getName->N:  _title   // ofs = -1 ord = 0 addr = -1
	aload_0_getfield _parentLine   // get_name_1:  _parentLine   // get_name_2:  _parentLine   // get_Name:    _parentLine   // getName->1:  _parentLine   // getName->2:  _parentLine   // getName->N:  _parentLine   // ofs = 59168 ord = 2 addr = 0
	getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = -1 ord = 1 addr = -1
	invokestatic showMediaBrowserScreen( module:WhatsApp-16.class#3, java.lang.String, module:WhatsApp-9.class#15 ) // AbstractMediaDisplay
	return 
	}

}
