// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-27.cod
// Module version  : 2.7.3204
// Class ID        : 1
// ########################################################


package com.whatsapp.client;


abstract public final class OutgoingLocationDisplay extends com.whatsapp.client.
implements com.whatsapp.client.

{

	// @@@@@@@@@@@@@ Fields 
	private com.whatsapp.client.LocationSenderThread /*com.whatsapp.client.LocationSenderThread*/  _locationSender ; // ofs = 53616 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.OutgoingLocationDisplay, module:WhatsApp-16.class#28, com.whatsapp.client.ChatLine, boolean ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	aload_2 
	iload_3 
	invokespecial_lib .routine_8016 // pc=4
	iload_3 
	ifne Label22
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	astore_4 
	aload_0 
	aload_4 
	getfield _locThread   // get_name_1:  _locThread   // get_name_2:  _locThread   // get_Name:    _locThread   // getName->1:  _locThread   // getName->2:  _locThread   // getName->N:  _locThread   // ofs = -1 ord = 0 addr = -1
	putfield _locationSender   // get_name_1:  _locationSender   // get_name_2:  _locationSender   // get_Name:    _locationSender   // getName->1:  _locationSender   // getName->2:  _locationSender   // getName->N:  _locationSender   // ofs = 53616 ord = 0 addr = 0
	aload_0_getfield _locationSender   // get_name_1:  _locationSender   // get_name_2:  _locationSender   // get_Name:    _locationSender   // getName->1:  _locationSender   // getName->2:  _locationSender   // getName->N:  _locationSender   // ofs = 53616 ord = 0 addr = 0
	ifnull Label22
	aload_0 
	bipush 3
	invokenonvirtual_lib .routine_6273 // pc=2
	aload_0_getfield _locationSender   // get_name_1:  _locationSender   // get_name_2:  _locationSender   // get_Name:    _locationSender   // getName->1:  _locationSender   // getName->2:  _locationSender   // getName->N:  _locationSender   // ofs = 53616 ord = 0 addr = 0
	aload_0 
	invokenonvirtual_lib .routine_773 // pc=2
Label22:
	aload_0 
	invokenonvirtual_lib .routine_6298 // pc=1
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final removePendingItem( com.whatsapp.client.OutgoingLocationDisplay ); // address: 0
	{
	enter 
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	astore_1 
	aload_0_getfield _parentLine   // get_name_1:  _parentLine   // get_name_2:  _parentLine   // get_Name:    _parentLine   // getName->1:  _parentLine   // getName->2:  _parentLine   // getName->N:  _parentLine   // ofs = -1 ord = 2 addr = -1
	getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = -1 ord = 2 addr = -1
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	astore_2 
	aload_1 
	getfield _sentMMSLines   // get_name_1:  _sentMMSLines   // get_name_2:  _sentMMSLines   // get_Name:    _sentMMSLines   // getName->1:  _sentMMSLines   // getName->2:  _sentMMSLines   // getName->N:  _sentMMSLines   // ofs = -1 ord = 1 addr = -1
	aload_2 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	astore_3 
	aload_3 
	ifnull Label28
	aload_3 
	aload_0_getfield _parentLine   // get_name_1:  _parentLine   // get_name_2:  _parentLine   // get_Name:    _parentLine   // getName->1:  _parentLine   // getName->2:  _parentLine   // getName->N:  _parentLine   // ofs = -1 ord = 2 addr = -1
	invokevirtual boolean removeElement( java.util.Vector, java.lang.Object ) // pc=2
	pop 
	aload_3 
	invokevirtual int size( java.util.Vector ) // pc=1
	ifne Label28
	aload_1 
	getfield _sentMMSLines   // get_name_1:  _sentMMSLines   // get_name_2:  _sentMMSLines   // get_Name:    _sentMMSLines   // getName->1:  _sentMMSLines   // getName->2:  _sentMMSLines   // getName->N:  _sentMMSLines   // ofs = -1 ord = 1 addr = -1
	aload_2 
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	pop 
Label28:
	return 
	}


private final boolean com.whatsapp.client.OutgoingLocationDisplay.routine_1544( com.whatsapp.client.OutgoingLocationDisplay, double, double, java.lang.String ); // address: 0
	{
	enter 
	ldc literal_56:"GoogleMaps"
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
	ldc literal_57:"action"
	ldc literal_58:"LOCN"
	invokevirtual append( net.rim.blackberry.api.browser.URLEncodedPostData, java.lang.String, java.lang.String ) // pc=3
	aload_7 
	ldc literal_59:"a"
	new_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	dup 
	ldc literal_60:"@latlon:"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	isreal 
	lload 1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, double ) // pc=3
	ldc literal_61:","
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	isreal 
	lload 3
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, double ) // pc=3
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual append( net.rim.blackberry.api.browser.URLEncodedPostData, java.lang.String, java.lang.String ) // pc=3
	aload_7 
	ldc literal_62:"title"
	aload_5 
	invokevirtual append( net.rim.blackberry.api.browser.URLEncodedPostData, java.lang.String, java.lang.String ) // pc=3
	aload_7 
	ldc literal_63:"description"
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokevirtual append( net.rim.blackberry.api.browser.URLEncodedPostData, java.lang.String, java.lang.String ) // pc=3
	iconst_1 
	newarray_object_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	iconst_0 
	new_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	dup 
	ldc literal_64:"http://gmm/x?"
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
	new_lib Runnable//java.lang.Runnable java.lang.Runnable java.lang.Runnable
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


private final com.whatsapp.client.OutgoingLocationDisplay.routine_1752( com.whatsapp.client.OutgoingLocationDisplay, double, double ); // address: 0
	{
	enter 
	new_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	dup 
	ldc literal_65:"http://maps.google.com/maps?f=q&source=s_q&geocode=&q="
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	isreal 
	lload 1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, double ) // pc=3
	ldc literal_61:","
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	isreal 
	lload 3
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, double ) // pc=3
	ldc literal_66:"&z=17"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_5 
	aload_5 
	invokestatic_lib module:WhatsApp-35.class#0.routine_2682(  ) // class#0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final java.lang.String getSubtitleText( com.whatsapp.client.OutgoingLocationDisplay ); // address: 0
	{
	enter_narrow 
	aconst_null 
	areturn 
	}


protected final net.rim.device.api.system.Bitmap getPreviewImage( com.whatsapp.client.OutgoingLocationDisplay ); // address: 0
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


public final boolean allowUpload( com.whatsapp.client.OutgoingLocationDisplay ); // address: 0
	{
	enter_narrow 
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	astore_1 
	aload_1 
	getfield _locThread   // get_name_1:  _locThread   // get_name_2:  _locThread   // get_Name:    _locThread   // getName->1:  _locThread   // getName->2:  _locThread   // getName->N:  _locThread   // ofs = -1 ord = 0 addr = -1
	ifnull Label11
	sipush 321
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokestatic_lib alert( java.lang.String ) // Dialog
	iconst_0 
	ireturn 
Label11:
	iconst_1 
	ireturn 
	}


protected final boolean autoRetryUpload( com.whatsapp.client.OutgoingLocationDisplay ); // address: 0
	{
	ireturn_bipush 0
	}


public final startUpload( com.whatsapp.client.OutgoingLocationDisplay ); // address: 0
	{
	enter 
	aload_0 
	bipush 3
	invokenonvirtual_lib .routine_6273 // pc=2
	aload_0 
	new_lib com.whatsapp.client.LocationSenderThread//com.whatsapp.client.LocationSenderThread com.whatsapp.client.LocationSenderThread com.whatsapp.client.LocationSenderThread
	dup 
	aload_0 
	aload_0_getfield _mData   // get_name_1:  _mData   // get_name_2:  _mData   // get_Name:    _mData   // getName->1:  _mData   // getName->2:  _mData   // getName->N:  _mData   // ofs = -1 ord = 0 addr = -1
	invokespecial_lib .routine_1545 // pc=3
	putfield _locationSender   // get_name_1:  _locationSender   // get_name_2:  _locationSender   // get_Name:    _locationSender   // getName->1:  _locationSender   // getName->2:  _locationSender   // getName->N:  _locationSender   // ofs = 53616 ord = 0 addr = 0
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	astore_1 
	aload_1 
	aload_0_getfield _locationSender   // get_name_1:  _locationSender   // get_name_2:  _locationSender   // get_Name:    _locationSender   // getName->1:  _locationSender   // getName->2:  _locationSender   // getName->N:  _locationSender   // ofs = 53616 ord = 0 addr = 0
	putfield _locThread   // get_name_1:  _locThread   // get_name_2:  _locThread   // get_Name:    _locThread   // getName->1:  _locThread   // getName->2:  _locThread   // getName->N:  _locThread   // ofs = -1 ord = 0 addr = -1
	aload_0_getfield _locationSender   // get_name_1:  _locationSender   // get_name_2:  _locationSender   // get_Name:    _locationSender   // getName->1:  _locationSender   // getName->2:  _locationSender   // getName->N:  _locationSender   // ofs = 53616 ord = 0 addr = 0
	invokevirtual start( java.lang.Thread ) // pc=1
	return 
	}


public final onLocationDone( com.whatsapp.client.OutgoingLocationDisplay, boolean ); // address: 0
	{
	enter 
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	astore_2 
	iload_1 
	ifeq Label20
	aload_0_getfield _locationSender   // get_name_1:  _locationSender   // get_name_2:  _locationSender   // get_Name:    _locationSender   // getName->1:  _locationSender   // getName->2:  _locationSender   // getName->N:  _locationSender   // ofs = 53616 ord = 0 addr = 0
	invokenonvirtual_lib .routine_1300 // pc=1
	ifne Label16
	aload_2 
	new OutgoingLocationDisplay$1
	dup 
	aload_0 
	aload_2 
	invokespecial com.whatsapp.client.OutgoingLocationDisplay$1.<init> // pc=3
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	return 
Label16:
	aload_0 
	iconst_1 
	invokenonvirtual_lib .routine_6586 // pc=2
	return 
Label20:
	aload_2 
	new OutgoingLocationDisplay$2
	dup 
	aload_0 
	invokespecial com.whatsapp.client.OutgoingLocationDisplay$2.<init> // pc=2
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	return 
	}


public final onLocationProgressUpdate( com.whatsapp.client.OutgoingLocationDisplay, int ); // address: 0
	{
	enter 
	iload_1 
	istore_2 
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	new OutgoingLocationDisplay$3
	dup 
	aload_0 
	iload_2 
	invokespecial com.whatsapp.client.OutgoingLocationDisplay$3.<init> // pc=3
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	return 
	}


public final onLocationError( com.whatsapp.client.OutgoingLocationDisplay, java.lang.String ); // address: 0
	{
	enter 
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	new OutgoingLocationDisplay$4
	dup 
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.OutgoingLocationDisplay$4.<init> // pc=3
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	return 
	}


public final doView( com.whatsapp.client.OutgoingLocationDisplay ); // address: 0
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
	invokestatic_lib module:WhatsApp-9.class#15.routine_8159(  ) // class#15
	astore_7 
Label48:
	new_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	dup 
	ldc literal_50:"<lbs><location y='"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload_5 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_51:"' x='"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	iload_6 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_52:"' "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore 8
	new_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload 8
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_53:"label='"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_7 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_54:"' zoom='4' description='location' /></lbs>"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore 8
	invokestatic com.whatsapp.client.PersistentDataStore getInstance(  ) // PersistentDataStore
	invokenonvirtual com.whatsapp.client.PersistentDataStore.getApplicationHashData // pc=1
	astore 9
	aload 9
	invokenonvirtual_lib .routine_2684 // pc=1
	ifne Label108
	bipush 7
	new_lib net.rim.blackberry.api.invoke.MapsArguments//net.rim.blackberry.api.invoke.MapsArguments net.rim.blackberry.api.invoke.MapsArguments net.rim.blackberry.api.invoke.MapsArguments
	dup 
	ldc literal_55:"location_document"
	aload 8
	invokespecial_lib net.rim.blackberry.api.invoke.MapsArguments.<init> // pc=3
	invokestatic_lib invokeApplication( int, net.rim.blackberry.api.invoke.ApplicationArguments ) // Invoke
	return 
	astore 10
	new_lib com.whatsapp.client.LocationDisplayScreen//module:WhatsApp-22.class#1 module:WhatsApp-22.class#1 module:WhatsApp-22.class#1
	dup 
	isreal 
	lload 1
	isreal 
	lload 3
	aload_0_getfield _parentLine   // get_name_1:  _parentLine   // get_name_2:  _parentLine   // get_Name:    _parentLine   // getName->1:  _parentLine   // getName->2:  _parentLine   // getName->N:  _parentLine   // ofs = -1 ord = 2 addr = -1
	getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
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
	invokespecial com.whatsapp.client.OutgoingLocationDisplay.routine_1544 // pc=6
	ifne Label122
	aload_0 
	isreal 
	lload 1
	isreal 
	lload 3
	invokespecial com.whatsapp.client.OutgoingLocationDisplay.routine_1752 // pc=5
Label122:
	return 
	}


public final java.lang.String getSaveSubdir( com.whatsapp.client.OutgoingLocationDisplay ); // address: 0
	{
	enter_narrow 
	new_lib net.rim.device.api.ui.XYRect//net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect
	dup 
	sipush 683
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokespecial_lib java.lang.RuntimeException.<init> // pc=2
	athrow 
	}

}