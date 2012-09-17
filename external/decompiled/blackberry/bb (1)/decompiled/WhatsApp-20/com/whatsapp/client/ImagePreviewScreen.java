// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-20.cod
// Module version  : 2.7.3204
// Class ID        : 6
// ########################################################


package com.whatsapp.client;


abstract public final class ImagePreviewScreen extends net.rim.device.api.ui.container.PopupScreen
implements net.rim.device.api.ui.FieldChangeListener

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.device.api.system.EncodedImage /*net.rim.device.api.system.EncodedImage*/  field_53262 ; // ofs = 53262 addr = 0)
	public net.rim.device.api.ui.Field /*net.rim.device.api.ui.Field*/  _previewPane ; // ofs = 53266 addr = 0)
	public net.rim.device.api.ui.component.ButtonField /*net.rim.device.api.ui.component.ButtonField*/  _useButton ; // ofs = 53270 addr = 0)
	public net.rim.device.api.ui.component.ButtonField /*net.rim.device.api.ui.component.ButtonField*/  _cancelButton ; // ofs = 53274 addr = 0)
	public com.whatsapp.client.LeftRightLabelField /*com.whatsapp.client.LeftRightLabelField*/  _titleLine ; // ofs = 53278 addr = 0)
	public net.rim.device.api.ui.container.HorizontalFieldManager /*net.rim.device.api.ui.container.HorizontalFieldManager*/  _containerHFM ; // ofs = 53282 addr = 0)
	private Runnable /*java.lang.Runnable*/  field_53286 ; // ofs = 53286 addr = 0)
	private Runnable /*java.lang.Runnable*/  field_53290 ; // ofs = 53290 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.ImagePreviewScreen, net.rim.device.api.system.EncodedImage, java.lang.Runnable, java.lang.Runnable ); // address: 0
	{
	enter 
	aload_0 
	new_lib net.rim.device.api.ui.FieldChangeListener//net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener
	dup 
	lipush 3461579263587647488
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.<init> // pc=3
	invokespecial_lib net.rim.device.api.ui.container.PopupScreen.<init> // pc=2
	aload_0 
	aload_1 
	putfield com.whatsapp.client.ImagePreviewScreen.field_53262   // get_name_1:  com.whatsapp.client.ImagePreviewScreen.field_53262   // get_name_2:  com.whatsapp.client.ImagePreviewScreen.field_53262   // get_Name:    com.whatsapp.client.ImagePreviewScreen.field_53262   // getName->1:     // getName->2:     // getName->N:     // ofs = 53262 ord = 0 addr = 0
	aload_0 
	aload_2 
	putfield com.whatsapp.client.ImagePreviewScreen.field_53286   // get_name_1:  com.whatsapp.client.ImagePreviewScreen.field_53286   // get_name_2:  com.whatsapp.client.ImagePreviewScreen.field_53286   // get_Name:    com.whatsapp.client.ImagePreviewScreen.field_53286   // getName->1:     // getName->2:     // getName->N:     // ofs = 53286 ord = 6 addr = 0
	aload_0 
	aload_3 
	putfield com.whatsapp.client.ImagePreviewScreen.field_53290   // get_name_1:  com.whatsapp.client.ImagePreviewScreen.field_53290   // get_name_2:  com.whatsapp.client.ImagePreviewScreen.field_53290   // get_Name:    com.whatsapp.client.ImagePreviewScreen.field_53290   // getName->1:     // getName->2:     // getName->N:     // ofs = 53290 ord = 7 addr = 0
	sipush 322
	sipush 690
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	astore_4 
	aload_1 
	invokevirtual int getLength( net.rim.device.api.system.EncodedImage ) // pc=1
	i2l 
	invokestatic_lib com.whatsapp.client.MediaDisplay.routine_4911(  ) // MediaDisplay
	astore_5 
	aload_0 
	new_lib com.whatsapp.client.LeftRightLabelField//com.whatsapp.client.LeftRightLabelField com.whatsapp.client.LeftRightLabelField com.whatsapp.client.LeftRightLabelField
	dup 
	aload_4 
	invokestatic_lib net.rim.device.api.ui.Font getDefault(  ) // Font
	invokespecial_lib .routine_509 // pc=3
	putfield _titleLine   // get_name_1:  _titleLine   // get_name_2:  _titleLine   // get_Name:    _titleLine   // getName->1:  _titleLine   // getName->2:  _titleLine   // getName->N:  _titleLine   // ofs = 53278 ord = 4 addr = 0
	aload_0_getfield _titleLine   // get_name_1:  _titleLine   // get_name_2:  _titleLine   // get_Name:    _titleLine   // getName->1:  _titleLine   // getName->2:  _titleLine   // getName->N:  _titleLine   // ofs = 53278 ord = 4 addr = 0
	aload_5 
	invokenonvirtual_lib .routine_29 // pc=2
	aload_0_getfield _titleLine   // get_name_1:  _titleLine   // get_name_2:  _titleLine   // get_Name:    _titleLine   // getName->1:  _titleLine   // getName->2:  _titleLine   // getName->N:  _titleLine   // ofs = 53278 ord = 4 addr = 0
	iconst_1 
	iconst_1 
	iconst_1 
	iconst_1 
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	aload_0_getfield _titleLine   // get_name_1:  _titleLine   // get_name_2:  _titleLine   // get_Name:    _titleLine   // getName->1:  _titleLine   // getName->2:  _titleLine   // getName->N:  _titleLine   // ofs = 53278 ord = 4 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
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
	new_lib net.rim.device.api.ui.component.RichTextField//net.rim.device.api.ui.component.RichTextField net.rim.device.api.ui.component.RichTextField net.rim.device.api.ui.component.RichTextField
	dup 
	lipush 18014398509481984
	invokespecial_lib net.rim.device.api.ui.component.NullField.<init> // pc=3
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib javax.microedition.io.Connection//javax.microedition.io.Connection javax.microedition.io.Connection javax.microedition.io.Connection
	dup 
	lipush 12884901888
	invokespecial_lib net.rim.device.api.ui.container.HorizontalFieldManager.<init> // pc=3
	putfield _containerHFM   // get_name_1:  _containerHFM   // get_name_2:  _containerHFM   // get_Name:    _containerHFM   // getName->1:  _containerHFM   // getName->2:  _containerHFM   // getName->N:  _containerHFM   // ofs = 53282 ord = 5 addr = 0
	aload_0 
	aload_0_getfield _containerHFM   // get_name_1:  _containerHFM   // get_name_2:  _containerHFM   // get_Name:    _containerHFM   // getName->1:  _containerHFM   // getName->2:  _containerHFM   // getName->N:  _containerHFM   // ofs = 53282 ord = 5 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	new_lib javax.microedition.io.Connection//javax.microedition.io.Connection javax.microedition.io.Connection javax.microedition.io.Connection
	dup 
	lipush 12884901888
	invokespecial_lib net.rim.device.api.ui.container.HorizontalFieldManager.<init> // pc=3
	astore_7 
	aload_0 
	new_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	dup 
	sipush 330
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	lipush 64424607744
	invokespecial_lib net.rim.device.api.ui.component.ButtonField.<init> // pc=4
	putfield _useButton   // get_name_1:  _useButton   // get_name_2:  _useButton   // get_Name:    _useButton   // getName->1:  _useButton   // getName->2:  _useButton   // getName->N:  _useButton   // ofs = 53270 ord = 2 addr = 0
	aload_0_getfield _useButton   // get_name_1:  _useButton   // get_name_2:  _useButton   // get_Name:    _useButton   // getName->1:  _useButton   // getName->2:  _useButton   // getName->N:  _useButton   // ofs = 53270 ord = 2 addr = 0
	aload_0 
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0_getfield _useButton   // get_name_1:  _useButton   // get_name_2:  _useButton   // get_Name:    _useButton   // getName->1:  _useButton   // getName->2:  _useButton   // getName->N:  _useButton   // ofs = 53270 ord = 2 addr = 0
	iconst_0 
	bipush 5
	iconst_0 
	iconst_0 
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_7 
	aload_0_getfield _useButton   // get_name_1:  _useButton   // get_name_2:  _useButton   // get_Name:    _useButton   // getName->1:  _useButton   // getName->2:  _useButton   // getName->N:  _useButton   // ofs = 53270 ord = 2 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_7 
	new_lib net.rim.device.api.system.EncodedImage//net.rim.device.api.system.EncodedImage net.rim.device.api.system.EncodedImage net.rim.device.api.system.EncodedImage
	dup 
	sipush 645
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	lipush 51539607552
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=4
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	dup 
	sipush 151
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	lipush 64424607744
	invokespecial_lib net.rim.device.api.ui.component.ButtonField.<init> // pc=4
	putfield _cancelButton   // get_name_1:  _cancelButton   // get_name_2:  _cancelButton   // get_Name:    _cancelButton   // getName->1:  _cancelButton   // getName->2:  _cancelButton   // getName->N:  _cancelButton   // ofs = 53274 ord = 3 addr = 0
	aload_0_getfield _cancelButton   // get_name_1:  _cancelButton   // get_name_2:  _cancelButton   // get_Name:    _cancelButton   // getName->1:  _cancelButton   // getName->2:  _cancelButton   // getName->N:  _cancelButton   // ofs = 53274 ord = 3 addr = 0
	aload_0 
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0_getfield _cancelButton   // get_name_1:  _cancelButton   // get_name_2:  _cancelButton   // get_Name:    _cancelButton   // getName->1:  _cancelButton   // getName->2:  _cancelButton   // getName->N:  _cancelButton   // ofs = 53274 ord = 3 addr = 0
	iconst_0 
	iconst_0 
	iconst_0 
	bipush 5
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_7 
	aload_0_getfield _cancelButton   // get_name_1:  _cancelButton   // get_name_2:  _cancelButton   // get_Name:    _cancelButton   // getName->1:  _cancelButton   // getName->2:  _cancelButton   // getName->N:  _cancelButton   // ofs = 53274 ord = 3 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	aload_7 
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final net.rim.device.api.ui.component.BitmapField com.whatsapp.client.ImagePreviewScreen.routine_2709( com.whatsapp.client.ImagePreviewScreen, int, int ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.ImagePreviewScreen.field_53262   // get_name_1:  com.whatsapp.client.ImagePreviewScreen.field_53262   // get_name_2:  com.whatsapp.client.ImagePreviewScreen.field_53262   // get_Name:    com.whatsapp.client.ImagePreviewScreen.field_53262   // getName->1:     // getName->2:     // getName->N:     // ofs = 53262 ord = 0 addr = 0
	astore_3 
	aload_3 
	invokevirtual int getHeight( net.rim.device.api.system.EncodedImage ) // pc=1
	istore_4 
	aload_3 
	invokevirtual int getWidth( net.rim.device.api.system.EncodedImage ) // pc=1
	istore_5 
	iload_5 
	invokestatic_lib int toFP( int ) // Fixed32
	istore_6 
	iload_4 
	invokestatic_lib int toFP( int ) // Fixed32
	istore_7 
	iload_1 
	invokestatic_lib int toFP( int ) // Fixed32
	istore 8
	iload_2 
	invokestatic_lib int toFP( int ) // Fixed32
	istore 9
	iload_4 
	iload_2 
	if_icmpge Label28
	iload_5 
	iload_1 
	if_icmpge Label28
	goto Label50
Label28:
	iload_7 
	iload 9
	invokestatic_lib int div( int, int ) // Fixed32
	istore 11
	iload_6 
	iload 8
	invokestatic_lib int div( int, int ) // Fixed32
	istore 10
	iload 11
	iload 10
	if_icmple Label45
	aload_3 
	iload 11
	iload 11
	invokevirtual net.rim.device.api.system.EncodedImage scaleImage32( net.rim.device.api.system.EncodedImage, int, int ) // pc=3
	astore_3 
	goto Label50
Label45:
	aload_3 
	iload 10
	iload 10
	invokevirtual net.rim.device.api.system.EncodedImage scaleImage32( net.rim.device.api.system.EncodedImage, int, int ) // pc=3
	astore_3 
Label50:
	new_lib Exception//java.lang.Exception java.lang.Exception java.lang.Exception
	dup 
	aload_3 
	invokevirtual net.rim.device.api.system.Bitmap getBitmap( net.rim.device.api.system.EncodedImage ) // pc=1
	invokespecial_lib net.rim.device.api.ui.component.BitmapField.<init> // pc=2
	areturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final closeScreen( com.whatsapp.client.ImagePreviewScreen ); // address: 0
	{
	enter_narrow 
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
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
	aload_0_getfield _cancelButton   // get_name_1:  _cancelButton   // get_name_2:  _cancelButton   // get_Name:    _cancelButton   // getName->1:  _cancelButton   // getName->2:  _cancelButton   // getName->N:  _cancelButton   // ofs = 53274 ord = 3 addr = 0
	if_acmpne Label9
	aload_0 
	invokenonvirtual com.whatsapp.client.ImagePreviewScreen.closeScreen // pc=1
	aload_0_getfield com.whatsapp.client.ImagePreviewScreen.field_53290   // get_name_1:  com.whatsapp.client.ImagePreviewScreen.field_53290   // get_name_2:  com.whatsapp.client.ImagePreviewScreen.field_53290   // get_Name:    com.whatsapp.client.ImagePreviewScreen.field_53290   // getName->1:     // getName->2:     // getName->N:     // ofs = 53290 ord = 7 addr = 0
	invokeinterface interfacemethodref_7 // pc=1 guess=7
	return 
Label9:
	aload_1 
	aload_0_getfield _useButton   // get_name_1:  _useButton   // get_name_2:  _useButton   // get_Name:    _useButton   // getName->1:  _useButton   // getName->2:  _useButton   // getName->N:  _useButton   // ofs = 53270 ord = 2 addr = 0
	if_acmpne Label16
	aload_0 
	invokenonvirtual com.whatsapp.client.ImagePreviewScreen.closeScreen // pc=1
	aload_0_getfield com.whatsapp.client.ImagePreviewScreen.field_53286   // get_name_1:  com.whatsapp.client.ImagePreviewScreen.field_53286   // get_name_2:  com.whatsapp.client.ImagePreviewScreen.field_53286   // get_Name:    com.whatsapp.client.ImagePreviewScreen.field_53286   // getName->1:     // getName->2:     // getName->N:     // ofs = 53286 ord = 6 addr = 0
	invokeinterface interfacemethodref_7 // pc=1 guess=7
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
	aload_0_getfield com.whatsapp.client.ImagePreviewScreen.field_53290   // get_name_1:  com.whatsapp.client.ImagePreviewScreen.field_53290   // get_name_2:  com.whatsapp.client.ImagePreviewScreen.field_53290   // get_Name:    com.whatsapp.client.ImagePreviewScreen.field_53290   // getName->1:     // getName->2:     // getName->N:     // ofs = 53290 ord = 7 addr = 0
	invokeinterface interfacemethodref_7 // pc=1 guess=8
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
	aload_0_getfield com.whatsapp.client.ImagePreviewScreen.field_53286   // get_name_1:  com.whatsapp.client.ImagePreviewScreen.field_53286   // get_name_2:  com.whatsapp.client.ImagePreviewScreen.field_53286   // get_Name:    com.whatsapp.client.ImagePreviewScreen.field_53286   // getName->1:     // getName->2:     // getName->N:     // ofs = 53286 ord = 6 addr = 0
	invokeinterface interfacemethodref_7 // pc=1 guess=8
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


protected final onUiEngineAttached( com.whatsapp.client.ImagePreviewScreen, boolean ); // address: 0
	{
	enter 
	iload_1 
	ifeq Label28
	aload_0 
	aload_0 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	bipush 10
	isub 
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	bipush 2
	aload_0_getfield _useButton   // get_name_1:  _useButton   // get_name_2:  _useButton   // get_Name:    _useButton   // getName->1:  _useButton   // getName->2:  _useButton   // getName->N:  _useButton   // ofs = 53270 ord = 2 addr = 0
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	imul 
	bipush 8
	iadd 
	aload_0_getfield _titleLine   // get_name_1:  _titleLine   // get_name_2:  _titleLine   // get_Name:    _titleLine   // getName->1:  _titleLine   // getName->2:  _titleLine   // getName->N:  _titleLine   // ofs = 53278 ord = 4 addr = 0
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	isub 
	invokespecial com.whatsapp.client.ImagePreviewScreen.routine_2709 // pc=3
	putfield _previewPane   // get_name_1:  _previewPane   // get_name_2:  _previewPane   // get_Name:    _previewPane   // getName->1:  _previewPane   // getName->2:  _previewPane   // getName->N:  _previewPane   // ofs = 53266 ord = 1 addr = 0
	aload_0_getfield _containerHFM   // get_name_1:  _containerHFM   // get_name_2:  _containerHFM   // get_Name:    _containerHFM   // getName->1:  _containerHFM   // getName->2:  _containerHFM   // getName->N:  _containerHFM   // ofs = 53282 ord = 5 addr = 0
	aload_0_getfield _previewPane   // get_name_1:  _previewPane   // get_name_2:  _previewPane   // get_Name:    _previewPane   // getName->1:  _previewPane   // getName->2:  _previewPane   // getName->N:  _previewPane   // ofs = 53266 ord = 1 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield _useButton   // get_name_1:  _useButton   // get_name_2:  _useButton   // get_Name:    _useButton   // getName->1:  _useButton   // getName->2:  _useButton   // getName->N:  _useButton   // ofs = 53270 ord = 2 addr = 0
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
Label28:
	return 
	}

}
