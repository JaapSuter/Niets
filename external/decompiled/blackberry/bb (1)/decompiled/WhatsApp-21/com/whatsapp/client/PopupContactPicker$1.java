// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-27.cod
// Module version  : 2.7.3204
// Class ID        : 12
// ########################################################


package com.whatsapp.client;


abstract final class PopupContactPicker$1 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.PopupContactPicker /*com.whatsapp.client.PopupContactPicker*/  this$0 ; // ofs = 53772 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.PopupContactPicker$1, com.whatsapp.client.PopupContactPicker ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.PopupContactPicker$1 ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual boolean isFocus( net.rim.device.api.ui.Field ) // pc=1
	ifne Label5
	return 
Label5:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aconst_null 
	putfield _invokeLaterId   // get_name_1:  _invokeLaterId   // get_name_2:  _invokeLaterId   // get_Name:    _invokeLaterId   // getName->1:  _invokeLaterId   // getName->2:  _invokeLaterId   // getName->N:  _invokeLaterId   // ofs = 53704 ord = 5 addr = 0
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _wrappedPicker   // get_name_1:  _wrappedPicker   // get_name_2:  _wrappedPicker   // get_Name:    _wrappedPicker   // getName->1:  _wrappedPicker   // getName->2:  _wrappedPicker   // getName->N:  _wrappedPicker   // ofs = 53692 ord = 2 addr = 0
	ifnull Label16
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _wrappedPicker   // get_name_1:  _wrappedPicker   // get_name_2:  _wrappedPicker   // get_Name:    _wrappedPicker   // getName->1:  _wrappedPicker   // getName->2:  _wrappedPicker   // getName->N:  _wrappedPicker   // ofs = 53692 ord = 2 addr = 0
	invokevirtual net.rim.device.api.ui.Manager getManager( net.rim.device.api.ui.Field ) // pc=1
	ifnull Label16
	return 
Label16:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokespecial com.whatsapp.client.PopupContactPicker.getPopupManager // pc=1
	astore_1 
	aload_1 
	ifnonnull Label22
	return 
Label22:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _selection   // get_name_1:  _selection   // get_name_2:  _selection   // get_Name:    _selection   // getName->1:  _selection   // getName->2:  _selection   // getName->N:  _selection   // ofs = 53684 ord = 0 addr = 0
	invokespecial com.whatsapp.client.PopupContactPicker.createContactDetailPopup // pc=2
	bipush 20
	invokespecial com.whatsapp.client.PopupContactPicker.getWrappedPicker // pc=3
	putfield _wrappedPicker   // get_name_1:  _wrappedPicker   // get_name_2:  _wrappedPicker   // get_Name:    _wrappedPicker   // getName->1:  _wrappedPicker   // getName->2:  _wrappedPicker   // getName->N:  _wrappedPicker   // ofs = 53692 ord = 2 addr = 0
	aload_1 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _wrappedPicker   // get_name_1:  _wrappedPicker   // get_name_2:  _wrappedPicker   // get_Name:    _wrappedPicker   // getName->1:  _wrappedPicker   // getName->2:  _wrappedPicker   // getName->N:  _wrappedPicker   // ofs = 53692 ord = 2 addr = 0
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_50 // pc=3 guess=4
	invokestatic_lib net.rim.device.api.system.Application getApplication(  ) // UiApplication
	new PopupContactPicker$1$1
	dup 
	aload_0 
	invokespecial com.whatsapp.client.PopupContactPicker$1$1.<init> // pc=2
	sipush 7000
	i2l 
	iconst_0 
	invokevirtual int invokeLater( net.rim.device.api.system.Application, java.lang.Runnable, long, boolean ) // pc=5
	istore_2 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	new_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	dup 
	iload_2 
	invokespecial_lib java.lang.Integer.<init> // pc=2
	putfield _invokeLaterId   // get_name_1:  _invokeLaterId   // get_name_2:  _invokeLaterId   // get_Name:    _invokeLaterId   // getName->1:  _invokeLaterId   // getName->2:  _invokeLaterId   // getName->N:  _invokeLaterId   // ofs = 53704 ord = 5 addr = 0
	return 
	}

}
