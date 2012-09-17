// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-32.cod
// Module version  : 2.8.1914
// Class ID        : 11
// ########################################################


package com.whatsapp.client;


abstract public final class ImagePreviewScreen extends net.rim.device.api.ui.container.PopupScreen
implements net.rim.device.api.ui.FieldChangeListener

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.device.api.system.EncodedImage /*net.rim.device.api.system.EncodedImage*/  field_54560 ; // ofs = 54560 addr = 0)
	public com.whatsapp.field. /*module:WhatsApp-54.class#1*/  _previewPane ; // ofs = 54564 addr = 0)
	public net.rim.device.api.ui.component.ButtonField /*net.rim.device.api.ui.component.ButtonField*/  _useButton ; // ofs = 54568 addr = 0)
	public net.rim.device.api.ui.component.ButtonField /*net.rim.device.api.ui.component.ButtonField*/  _cancelButton ; // ofs = 54572 addr = 0)
	public com.whatsapp.client.LeftRightLabelField /*com.whatsapp.client.LeftRightLabelField*/  _titleLine ; // ofs = 54576 addr = 0)
	public net.rim.device.api.ui.container.HorizontalFieldManager /*net.rim.device.api.ui.container.HorizontalFieldManager*/  _buttonHFM ; // ofs = 54580 addr = 0)
	private Runnable /*java.lang.Runnable*/  field_54584 ; // ofs = 54584 addr = 0)
	private Runnable /*java.lang.Runnable*/  field_54588 ; // ofs = 54588 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.ImagePreviewScreen, net.rim.device.api.system.EncodedImage, java.lang.Runnable, java.lang.Runnable ); // address: 0
	{
	enter 
	aload_0 
	new_lib net.rim.device.api.ui.component.Status//net.rim.device.api.ui.component.Status net.rim.device.api.ui.component.Status net.rim.device.api.ui.component.Status
	dup 
	lipush 3461579263587647488
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.<init> // pc=3
	invokespecial_lib net.rim.device.api.ui.container.PopupScreen.<init> // pc=2
	aload_0 
	aload_1 
	putfield com.whatsapp.client.ImagePreviewScreen.field_54560   // get_name_1:  com.whatsapp.client.ImagePreviewScreen.field_54560   // get_name_2:  com.whatsapp.client.ImagePreviewScreen.field_54560   // get_Name:    com.whatsapp.client.ImagePreviewScreen.field_54560   // getName->1:     // getName->2:     // getName->N:     // ofs = 54560 ord = 0 addr = 0
	aload_0 
	aload_2 
	putfield com.whatsapp.client.ImagePreviewScreen.field_54584   // get_name_1:  com.whatsapp.client.ImagePreviewScreen.field_54584   // get_name_2:  com.whatsapp.client.ImagePreviewScreen.field_54584   // get_Name:    com.whatsapp.client.ImagePreviewScreen.field_54584   // getName->1:     // getName->2:     // getName->N:     // ofs = 54584 ord = 6 addr = 0
	aload_0 
	aload_3 
	putfield com.whatsapp.client.ImagePreviewScreen.field_54588   // get_name_1:  com.whatsapp.client.ImagePreviewScreen.field_54588   // get_name_2:  com.whatsapp.client.ImagePreviewScreen.field_54588   // get_Name:    com.whatsapp.client.ImagePreviewScreen.field_54588   // getName->1:     // getName->2:     // getName->N:     // ofs = 54588 ord = 7 addr = 0
	sipush 322
	sipush 690
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokestatic_lib module:WhatsApp-47.class#11.routine_4463(  ) // class#11
	astore_4 
	aload_1 
	invokevirtual int getLength( net.rim.device.api.system.EncodedImage ) // pc=1
	i2l 
	invokestatic_lib module:WhatsApp-38.class#1.routine_3253(  ) // class#1
	astore_5 
	aload_0 
	new_lib com.whatsapp.client.LeftRightLabelField//com.whatsapp.client.LeftRightLabelField com.whatsapp.client.LeftRightLabelField com.whatsapp.client.LeftRightLabelField
	dup 
	aload_4 
	invokestatic_lib net.rim.device.api.ui.Font getDefault(  ) // Font
	invokespecial_lib .routine_4781 // pc=3
	putfield _titleLine   // get_name_1:  _titleLine   // get_name_2:  _titleLine   // get_Name:    _titleLine   // getName->1:  _titleLine   // getName->2:  _titleLine   // getName->N:  _titleLine   // ofs = 54576 ord = 4 addr = 0
	aload_0_getfield _titleLine   // get_name_1:  _titleLine   // get_name_2:  _titleLine   // get_Name:    _titleLine   // getName->1:  _titleLine   // getName->2:  _titleLine   // getName->N:  _titleLine   // ofs = 54576 ord = 4 addr = 0
	aload_5 
	invokenonvirtual_lib .routine_4094 // pc=2
	aload_0_getfield _titleLine   // get_name_1:  _titleLine   // get_name_2:  _titleLine   // get_Name:    _titleLine   // getName->1:  _titleLine   // getName->2:  _titleLine   // getName->N:  _titleLine   // ofs = 54576 ord = 4 addr = 0
	iconst_1 
	iconst_1 
	iconst_1 
	iconst_1 
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	aload_0_getfield _titleLine   // get_name_1:  _titleLine   // get_name_2:  _titleLine   // get_Name:    _titleLine   // getName->1:  _titleLine   // getName->2:  _titleLine   // getName->N:  _titleLine   // ofs = 54576 ord = 4 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	new_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	dup 
	invokespecial_lib net.rim.device.api.ui.component.SeparatorField.<init> // pc=1
	astore_6 
	aload_6 
	iconst_1 
	iconst_0 
	iconst_1 
	iconst_0 
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	aload_6 
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib javax.microedition.io.Connector//javax.microedition.io.Connector javax.microedition.io.Connector javax.microedition.io.Connector
	dup 
	lipush 18014398509481984
	invokespecial_lib net.rim.device.api.ui.component.NullField.<init> // pc=3
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib com.whatsapp.field.ScaledEncodedImageField//module:WhatsApp-54.class#1 module:WhatsApp-54.class#1 module:WhatsApp-54.class#1
	dup 
	aload_0_getfield com.whatsapp.client.ImagePreviewScreen.field_54560   // get_name_1:  com.whatsapp.client.ImagePreviewScreen.field_54560   // get_name_2:  com.whatsapp.client.ImagePreviewScreen.field_54560   // get_Name:    com.whatsapp.client.ImagePreviewScreen.field_54560   // getName->1:     // getName->2:     // getName->N:     // ofs = 54560 ord = 0 addr = 0
	invokespecial_lib .routine_308 // pc=2
	putfield _previewPane   // get_name_1:  _previewPane   // get_name_2:  _previewPane   // get_Name:    _previewPane   // getName->1:  _previewPane   // getName->2:  _previewPane   // getName->N:  _previewPane   // ofs = 54564 ord = 1 addr = 0
	aload_0 
	aload_0_getfield _previewPane   // get_name_1:  _previewPane   // get_name_2:  _previewPane   // get_Name:    _previewPane   // getName->1:  _previewPane   // getName->2:  _previewPane   // getName->N:  _previewPane   // ofs = 54564 ord = 1 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	lipush 12884901888
	invokespecial_lib net.rim.device.api.ui.container.HorizontalFieldManager.<init> // pc=3
	putfield _buttonHFM   // get_name_1:  _buttonHFM   // get_name_2:  _buttonHFM   // get_Name:    _buttonHFM   // getName->1:  _buttonHFM   // getName->2:  _buttonHFM   // getName->N:  _buttonHFM   // ofs = 54580 ord = 5 addr = 0
	aload_0 
	new_lib net.rim.device.api.ui.TouchEvent//net.rim.device.api.ui.TouchEvent net.rim.device.api.ui.TouchEvent net.rim.device.api.ui.TouchEvent
	dup 
	sipush 330
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	lipush 64424607744
	invokespecial_lib net.rim.device.api.ui.component.ButtonField.<init> // pc=4
	putfield _useButton   // get_name_1:  _useButton   // get_name_2:  _useButton   // get_Name:    _useButton   // getName->1:  _useButton   // getName->2:  _useButton   // getName->N:  _useButton   // ofs = 54568 ord = 2 addr = 0
	aload_0_getfield _useButton   // get_name_1:  _useButton   // get_name_2:  _useButton   // get_Name:    _useButton   // getName->1:  _useButton   // getName->2:  _useButton   // getName->N:  _useButton   // ofs = 54568 ord = 2 addr = 0
	aload_0 
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0_getfield _useButton   // get_name_1:  _useButton   // get_name_2:  _useButton   // get_Name:    _useButton   // getName->1:  _useButton   // getName->2:  _useButton   // getName->N:  _useButton   // ofs = 54568 ord = 2 addr = 0
	iconst_0 
	bipush 5
	iconst_0 
	iconst_0 
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0_getfield _buttonHFM   // get_name_1:  _buttonHFM   // get_name_2:  _buttonHFM   // get_Name:    _buttonHFM   // getName->1:  _buttonHFM   // getName->2:  _buttonHFM   // getName->N:  _buttonHFM   // ofs = 54580 ord = 5 addr = 0
	aload_0_getfield _useButton   // get_name_1:  _useButton   // get_name_2:  _useButton   // get_Name:    _useButton   // getName->1:  _useButton   // getName->2:  _useButton   // getName->N:  _useButton   // ofs = 54568 ord = 2 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield _buttonHFM   // get_name_1:  _buttonHFM   // get_name_2:  _buttonHFM   // get_Name:    _buttonHFM   // getName->1:  _buttonHFM   // getName->2:  _buttonHFM   // getName->N:  _buttonHFM   // ofs = 54580 ord = 5 addr = 0
	new_lib Exception//java.lang.Exception java.lang.Exception java.lang.Exception
	dup 
	sipush 645
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	lipush 51539607552
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=4
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib net.rim.device.api.ui.TouchEvent//net.rim.device.api.ui.TouchEvent net.rim.device.api.ui.TouchEvent net.rim.device.api.ui.TouchEvent
	dup 
	sipush 151
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	lipush 64424607744
	invokespecial_lib net.rim.device.api.ui.component.ButtonField.<init> // pc=4
	putfield _cancelButton   // get_name_1:  _cancelButton   // get_name_2:  _cancelButton   // get_Name:    _cancelButton   // getName->1:  _cancelButton   // getName->2:  _cancelButton   // getName->N:  _cancelButton   // ofs = 54572 ord = 3 addr = 0
	aload_0_getfield _cancelButton   // get_name_1:  _cancelButton   // get_name_2:  _cancelButton   // get_Name:    _cancelButton   // getName->1:  _cancelButton   // getName->2:  _cancelButton   // getName->N:  _cancelButton   // ofs = 54572 ord = 3 addr = 0
	aload_0 
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0_getfield _cancelButton   // get_name_1:  _cancelButton   // get_name_2:  _cancelButton   // get_Name:    _cancelButton   // getName->1:  _cancelButton   // getName->2:  _cancelButton   // getName->N:  _cancelButton   // ofs = 54572 ord = 3 addr = 0
	iconst_0 
	iconst_0 
	iconst_0 
	bipush 5
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0_getfield _buttonHFM   // get_name_1:  _buttonHFM   // get_name_2:  _buttonHFM   // get_Name:    _buttonHFM   // getName->1:  _buttonHFM   // getName->2:  _buttonHFM   // getName->N:  _buttonHFM   // ofs = 54580 ord = 5 addr = 0
	aload_0_getfield _cancelButton   // get_name_1:  _cancelButton   // get_name_2:  _cancelButton   // get_Name:    _cancelButton   // getName->1:  _cancelButton   // getName->2:  _cancelButton   // getName->N:  _cancelButton   // ofs = 54572 ord = 3 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	aload_0_getfield _buttonHFM   // get_name_1:  _buttonHFM   // get_name_2:  _buttonHFM   // get_Name:    _buttonHFM   // getName->1:  _buttonHFM   // getName->2:  _buttonHFM   // getName->N:  _buttonHFM   // ofs = 54580 ord = 5 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield _useButton   // get_name_1:  _useButton   // get_name_2:  _useButton   // get_Name:    _useButton   // getName->1:  _useButton   // getName->2:  _useButton   // getName->N:  _useButton   // ofs = 54568 ord = 2 addr = 0
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final closeScreen( com.whatsapp.client.ImagePreviewScreen ); // address: 0
	{
	enter_narrow 
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	astore_1 
	aload_1 
	aload_0 
	invokevirtual popScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}


public final fieldChanged( com.whatsapp.client.ImagePreviewScreen, net.rim.device.api.ui.Field, int ); // address: 0
	{
	enter_narrow 
	aload_1 
	aload_0_getfield _cancelButton   // get_name_1:  _cancelButton   // get_name_2:  _cancelButton   // get_Name:    _cancelButton   // getName->1:  _cancelButton   // getName->2:  _cancelButton   // getName->N:  _cancelButton   // ofs = 54572 ord = 3 addr = 0
	if_acmpne Label9
	aload_0 
	invokenonvirtual com.whatsapp.client.ImagePreviewScreen.closeScreen // pc=1
	aload_0_getfield com.whatsapp.client.ImagePreviewScreen.field_54588   // get_name_1:  com.whatsapp.client.ImagePreviewScreen.field_54588   // get_name_2:  com.whatsapp.client.ImagePreviewScreen.field_54588   // get_Name:    com.whatsapp.client.ImagePreviewScreen.field_54588   // getName->1:     // getName->2:     // getName->N:     // ofs = 54588 ord = 7 addr = 0
	invokeinterface interfacemethodref_6 // pc=1 guess=6
	return 
Label9:
	aload_1 
	aload_0_getfield _useButton   // get_name_1:  _useButton   // get_name_2:  _useButton   // get_Name:    _useButton   // getName->1:  _useButton   // getName->2:  _useButton   // getName->N:  _useButton   // ofs = 54568 ord = 2 addr = 0
	if_acmpne Label16
	aload_0 
	invokenonvirtual com.whatsapp.client.ImagePreviewScreen.closeScreen // pc=1
	aload_0_getfield com.whatsapp.client.ImagePreviewScreen.field_54584   // get_name_1:  com.whatsapp.client.ImagePreviewScreen.field_54584   // get_name_2:  com.whatsapp.client.ImagePreviewScreen.field_54584   // get_Name:    com.whatsapp.client.ImagePreviewScreen.field_54584   // getName->1:     // getName->2:     // getName->N:     // ofs = 54584 ord = 6 addr = 0
	invokeinterface interfacemethodref_6 // pc=1 guess=6
Label16:
	return 
	}


protected final boolean keyChar( com.whatsapp.client.ImagePreviewScreen, char, int, int ); // address: 0
	{
	enter 
	iload_1 
	bipush 27
	if_icmpeq Label10
	iload_1 
	bipush 99
	if_icmpeq Label10
	iload_1 
	bipush 67
	if_icmpne Label16
Label10:
	aload_0 
	invokenonvirtual com.whatsapp.client.ImagePreviewScreen.closeScreen // pc=1
	aload_0_getfield com.whatsapp.client.ImagePreviewScreen.field_54588   // get_name_1:  com.whatsapp.client.ImagePreviewScreen.field_54588   // get_name_2:  com.whatsapp.client.ImagePreviewScreen.field_54588   // get_Name:    com.whatsapp.client.ImagePreviewScreen.field_54588   // getName->1:     // getName->2:     // getName->N:     // ofs = 54588 ord = 7 addr = 0
	invokeinterface interfacemethodref_6 // pc=1 guess=7
	iconst_1 
	ireturn 
Label16:
	iload_1 
	bipush 115
	if_icmpeq Label22
	iload_1 
	bipush 83
	if_icmpne Label28
Label22:
	aload_0 
	invokenonvirtual com.whatsapp.client.ImagePreviewScreen.closeScreen // pc=1
	aload_0_getfield com.whatsapp.client.ImagePreviewScreen.field_54584   // get_name_1:  com.whatsapp.client.ImagePreviewScreen.field_54584   // get_name_2:  com.whatsapp.client.ImagePreviewScreen.field_54584   // get_Name:    com.whatsapp.client.ImagePreviewScreen.field_54584   // getName->1:     // getName->2:     // getName->N:     // ofs = 54584 ord = 6 addr = 0
	invokeinterface interfacemethodref_6 // pc=1 guess=7
	iconst_1 
	ireturn 
Label28:
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	invokespecial_lib net.rim.device.api.ui.Screen.keyChar // pc=4
	ireturn 
	}


protected final sublayout( com.whatsapp.client.ImagePreviewScreen, int, int ); // address: 0
	{
	enter 
	aload_0_getfield _previewPane   // get_name_1:  _previewPane   // get_name_2:  _previewPane   // get_Name:    _previewPane   // getName->1:  _previewPane   // getName->2:  _previewPane   // getName->N:  _previewPane   // ofs = 54564 ord = 1 addr = 0
	bipush 2
	invokenonvirtual_lib .routine_31 // pc=2
	aload_0_getfield _previewPane   // get_name_1:  _previewPane   // get_name_2:  _previewPane   // get_Name:    _previewPane   // getName->1:  _previewPane   // getName->2:  _previewPane   // getName->N:  _previewPane   // ofs = 54564 ord = 1 addr = 0
	iload_1 
	invokenonvirtual_lib .routine_42 // pc=2
	aload_0 
	iload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.container.PopupScreen.sublayout // pc=3
	aload_0 
	invokevirtual net.rim.device.api.ui.Manager getDelegate( net.rim.device.api.ui.Screen ) // pc=1
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	istore_3 
	aload_0 
	invokevirtual int getFieldCount( net.rim.device.api.ui.Screen ) // pc=1
	istore_4 
	iconst_0 
	istore_5 
Label20:
	iload_5 
	iload_4 
	if_icmpge Label38
	aload_0 
	iload_5 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Screen, int ) // pc=2
	astore_6 
	aload_6 
	aload_0_getfield _previewPane   // get_name_1:  _previewPane   // get_name_2:  _previewPane   // get_Name:    _previewPane   // getName->1:  _previewPane   // getName->2:  _previewPane   // getName->N:  _previewPane   // ofs = 54564 ord = 1 addr = 0
	if_acmpne Label31
	goto Label36
Label31:
	iload_3 
	aload_6 
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	isub 
	istore_3 
Label36:
	iinc 5 1
	goto Label20
Label38:
	aload_0_getfield _previewPane   // get_name_1:  _previewPane   // get_name_2:  _previewPane   // get_Name:    _previewPane   // getName->1:  _previewPane   // getName->2:  _previewPane   // getName->N:  _previewPane   // ofs = 54564 ord = 1 addr = 0
	iload_3 
	invokenonvirtual_lib .routine_31 // pc=2
	aload_0_getfield _previewPane   // get_name_1:  _previewPane   // get_name_2:  _previewPane   // get_Name:    _previewPane   // getName->1:  _previewPane   // getName->2:  _previewPane   // getName->N:  _previewPane   // ofs = 54564 ord = 1 addr = 0
	iload_1 
	invokenonvirtual_lib .routine_42 // pc=2
	aload_0 
	iload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.container.PopupScreen.sublayout // pc=3
	return 
	}

}
