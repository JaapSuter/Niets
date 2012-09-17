// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-15.cod
// Module version  : 2.7.3204
// Class ID        : 3
// ########################################################


package com.whatsapp.client;


abstract public final class EmojiPickerPopup extends net.rim.device.api.ui.container.PopupScreen
implements net.rim.device.api.ui.FieldChangeListener

{
	// @@@@@@@@@@@@@ Static fields 

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.EmojiPickerPopup ); // address: 0
	{
	enter 
	aload_0 
	new EmojiPickerPopup$EmojiVerticalFieldManager
	dup 
	invokespecial com.whatsapp.client.EmojiPickerPopup$EmojiVerticalFieldManager.<init> // pc=1
	iconst_0 
	i2l 
	invokespecial_lib net.rim.device.api.ui.container.PopupScreen.<init> // pc=4
	aload_0 
	invokevirtual net.rim.device.api.ui.Manager getDelegate( net.rim.device.api.ui.Screen ) // pc=1
	checkcast EmojiPickerPopup$EmojiVerticalFieldManager
	aload_0 
	invokenonvirtual com.whatsapp.client.EmojiPickerPopup$EmojiVerticalFieldManager.setEmojiPickerPopup // pc=2
	aload_0 
	new_lib com.whatsapp.client.OS6TitleField//com.whatsapp.client.OS6TitleField com.whatsapp.client.OS6TitleField com.whatsapp.client.OS6TitleField
	dup 
	lipush 18014411394383872
	invokespecial_lib .routine_711 // pc=3
	putfield _title   // get_name_1:  _title   // get_name_2:  _title   // get_Name:    _title   // getName->1:  _title   // getName->2:  _title   // getName->N:  _title   // ofs = 53758 ord = 0 addr = 0
	aload_0_getfield _title   // get_name_1:  _title   // get_name_2:  _title   // get_Name:    _title   // getName->1:  _title   // getName->2:  _title   // getName->N:  _title   // ofs = 53758 ord = 0 addr = 0
	iconst_0 
	iconst_0 
	iconst_0 
	iconst_0 
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	new_lib com.whatsapp.client.MaxWidthFlowFieldManager//com.whatsapp.client.MaxWidthFlowFieldManager com.whatsapp.client.MaxWidthFlowFieldManager com.whatsapp.client.MaxWidthFlowFieldManager
	dup 
	lipush 299067162755072
	invokespecial_lib .routine_1818 // pc=3
	putfield _flowFieldManager   // get_name_1:  _flowFieldManager   // get_name_2:  _flowFieldManager   // get_Name:    _flowFieldManager   // getName->1:  _flowFieldManager   // getName->2:  _flowFieldManager   // getName->N:  _flowFieldManager   // ofs = 53762 ord = 1 addr = 0
	aload_0 
	aload_0_getfield _title   // get_name_1:  _title   // get_name_2:  _title   // get_Name:    _title   // getName->1:  _title   // getName->2:  _title   // getName->N:  _title   // ofs = 53758 ord = 0 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	aload_0_getfield _flowFieldManager   // get_name_1:  _flowFieldManager   // get_name_2:  _flowFieldManager   // get_Name:    _flowFieldManager   // getName->1:  _flowFieldManager   // getName->2:  _flowFieldManager   // getName->N:  _flowFieldManager   // ofs = 53762 ord = 1 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	getstatic _lastPageSelection // EmojiPickerPopup
	putfield _currentPage   // get_name_1:  _currentPage   // get_name_2:  _currentPage   // get_Name:    _currentPage   // getName->1:  _currentPage   // getName->2:  _currentPage   // getName->N:  _currentPage   // ofs = 53766 ord = 2 addr = 0
	aload_0 
	getstatic _lastSelection // EmojiPickerPopup
	invokespecial com.whatsapp.client.EmojiPickerPopup.updateButtons // pc=2
	aload_0 
	invokevirtual net.rim.device.api.ui.VirtualKeyboard getVirtualKeyboard( net.rim.device.api.ui.Screen ) // pc=1
	astore_1 
	aload_1 
	ifnull Label51
	aload_1 
	iconst_0 
	invokevirtual setVisibility( net.rim.device.api.ui.VirtualKeyboard, int ) // pc=2
Label51:
	return 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	clinit_lib net.rim.device.api.ui.component.ActiveRichTextField//net.rim.device.api.ui.component.ActiveRichTextField net.rim.device.api.ui.component.ActiveRichTextField net.rim.device.api.ui.component.ActiveRichTextField
	synch_static EmojiPickerPopup
	clinit_wait 
	iipush 58389
	putstatic _lastSelection // EmojiPickerPopup
	iconst_0 
	putstatic _lastPageSelection // EmojiPickerPopup
	bipush 4
	newarray_object_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	iconst_0 
	sipush 774
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	aastore 
	dup 
	iconst_1 
	sipush 775
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	aastore 
	dup 
	bipush 2
	sipush 776
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	aastore 
	dup 
	bipush 3
	sipush 777
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	aastore 
	putstatic com.whatsapp.client.EmojiPickerPopup.field_53786 // EmojiPickerPopup
	op01xx 
	stringarrayinit [?????????????????????????????????????????????????????????????????????????????????????????????????????????????, ?????????????????????????????????????????????????????, ???????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????, ??????????????????????????????????????????????????????????????????????]
	putstatic com.whatsapp.client.EmojiPickerPopup.field_53792 // EmojiPickerPopup
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.BitmapButtonField com.whatsapp.client.EmojiPickerPopup.routine_1497( com.whatsapp.client.EmojiPickerPopup, char, int ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.BitmapButtonField//com.whatsapp.client.BitmapButtonField com.whatsapp.client.BitmapButtonField com.whatsapp.client.BitmapButtonField
	dup 
	iload_1 
	iload_2 
	invokestatic net.rim.device.api.system.Bitmap getBitmap( char, int ) // EmojiUtil
	new_lib net.rim.device.api.ui.UiApplication//net.rim.device.api.ui.UiApplication net.rim.device.api.ui.UiApplication net.rim.device.api.ui.UiApplication
	dup 
	iipush 2129150
	invokespecial_lib java.lang.Integer.<init> // pc=2
	new_lib net.rim.device.api.ui.UiApplication//net.rim.device.api.ui.UiApplication net.rim.device.api.ui.UiApplication net.rim.device.api.ui.UiApplication
	dup 
	iipush 478380
	invokespecial_lib java.lang.Integer.<init> // pc=2
	aconst_null 
	new_lib net.rim.device.api.ui.UiApplication//net.rim.device.api.ui.UiApplication net.rim.device.api.ui.UiApplication net.rim.device.api.ui.UiApplication
	dup 
	iipush 13882323
	invokespecial_lib java.lang.Integer.<init> // pc=2
	aconst_null 
	iconst_0 
	i2l 
	invokespecial_lib .routine_3085 // pc=9
	astore_3 
	aload_3 
	new_lib net.rim.device.api.ui.component.RichTextField//net.rim.device.api.ui.component.RichTextField net.rim.device.api.ui.component.RichTextField net.rim.device.api.ui.component.RichTextField
	dup 
	iload_1 
	invokespecial_lib java.lang.Character.<init> // pc=2
	invokevirtual setCookie( net.rim.device.api.ui.Field, java.lang.Object ) // pc=2
	aload_3 
	bipush 2
	bipush 2
	bipush 2
	bipush 2
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_3 
	bipush 4
	invokenonvirtual_lib .routine_1953 // pc=2
	aload_3 
	aload_0 
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_3 
	areturn 
	}


private final updateButtons( com.whatsapp.client.EmojiPickerPopup, char ); // address: 0
	{
	enter 
	getstatic com.whatsapp.client.EmojiPickerPopup.field_53786 // EmojiPickerPopup
	aload_0_getfield _currentPage   // get_name_1:  _currentPage   // get_name_2:  _currentPage   // get_Name:    _currentPage   // getName->1:  _currentPage   // getName->2:  _currentPage   // getName->N:  _currentPage   // ofs = 53766 ord = 2 addr = 0
	aaload 
	astore_2 
	getstatic com.whatsapp.client.EmojiPickerPopup.field_53792 // EmojiPickerPopup
	aload_0_getfield _currentPage   // get_name_1:  _currentPage   // get_name_2:  _currentPage   // get_Name:    _currentPage   // getName->1:  _currentPage   // getName->2:  _currentPage   // getName->N:  _currentPage   // ofs = 53766 ord = 2 addr = 0
	aaload 
	astore_3 
	aload_0_getfield _title   // get_name_1:  _title   // get_name_2:  _title   // get_Name:    _title   // getName->1:  _title   // getName->2:  _title   // getName->N:  _title   // ofs = 53758 ord = 0 addr = 0
	aload_2 
	invokenonvirtual_lib .routine_9 // pc=2
	aload_0_getfield _title   // get_name_1:  _title   // get_name_2:  _title   // get_Name:    _title   // getName->1:  _title   // getName->2:  _title   // getName->N:  _title   // ofs = 53758 ord = 0 addr = 0
	getstatic com.whatsapp.client.EmojiPickerPopup.field_53786 // EmojiPickerPopup
	aload_0 
	bipush -1
	invokespecial com.whatsapp.client.EmojiPickerPopup.getRelativePage // pc=2
	aaload 
	invokenonvirtual_lib .routine_29 // pc=2
	aload_0_getfield _title   // get_name_1:  _title   // get_name_2:  _title   // get_Name:    _title   // getName->1:  _title   // getName->2:  _title   // getName->N:  _title   // ofs = 53758 ord = 0 addr = 0
	getstatic com.whatsapp.client.EmojiPickerPopup.field_53786 // EmojiPickerPopup
	aload_0 
	iconst_1 
	invokespecial com.whatsapp.client.EmojiPickerPopup.getRelativePage // pc=2
	aaload 
	invokenonvirtual_lib .routine_49 // pc=2
	aload_0_getfield _flowFieldManager   // get_name_1:  _flowFieldManager   // get_name_2:  _flowFieldManager   // get_Name:    _flowFieldManager   // getName->1:  _flowFieldManager   // getName->2:  _flowFieldManager   // getName->N:  _flowFieldManager   // ofs = 53762 ord = 1 addr = 0
	invokevirtual deleteAll( net.rim.device.api.ui.Manager ) // pc=1
	aload_3 
	stringlength 
	istore_4 
	iconst_0 
	istore_5 
Label33:
	iload_5 
	iload_4 
	if_icmpge Label55
	aload_3 
	iload_5 
	stringaload 
	istore_6 
	aload_0 
	iload_6 
	bipush 48
	invokespecial com.whatsapp.client.EmojiPickerPopup.routine_1497 // pc=3
	astore_7 
	aload_0_getfield _flowFieldManager   // get_name_1:  _flowFieldManager   // get_name_2:  _flowFieldManager   // get_Name:    _flowFieldManager   // getName->1:  _flowFieldManager   // getName->2:  _flowFieldManager   // getName->N:  _flowFieldManager   // ofs = 53762 ord = 1 addr = 0
	aload_7 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	iload_1 
	iload_6 
	if_icmpne Label53
	aload_7 
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
Label53:
	iinc 5 1
	goto Label33
Label55:
	return 
	}


private final int getRelativePage( com.whatsapp.client.EmojiPickerPopup, int ); // address: 0
	{
	enter 
	getstatic com.whatsapp.client.EmojiPickerPopup.field_53786 // EmojiPickerPopup
	arraylength 
	istore_2 
	aload_0_getfield _currentPage   // get_name_1:  _currentPage   // get_name_2:  _currentPage   // get_Name:    _currentPage   // getName->1:  _currentPage   // getName->2:  _currentPage   // getName->N:  _currentPage   // ofs = 53766 ord = 2 addr = 0
	iload_2 
	iadd 
	iload_1 
	iadd 
	iload_2 
	irem 
	ireturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final setClickHandler( com.whatsapp.client.EmojiPickerPopup, module:WhatsApp-12.class#9 ); // address: 0
	{
	putfield_return _handler   // get_name_1:  _handler   // get_name_2:  _handler   // get_Name:    _handler   // getName->1:  _handler   // getName->2:  _handler   // getName->N:  _handler   // ofs = 53770 ord = 3 addr = 0
	}


public final setFocusTopRight( com.whatsapp.client.EmojiPickerPopup ); // address: 0
	{
	enter 
	aload_0_getfield _flowFieldManager   // get_name_1:  _flowFieldManager   // get_name_2:  _flowFieldManager   // get_Name:    _flowFieldManager   // getName->1:  _flowFieldManager   // getName->2:  _flowFieldManager   // getName->N:  _flowFieldManager   // ofs = 53762 ord = 1 addr = 0
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	istore_1 
	iload_1 
	ifne Label7
	return 
Label7:
	aload_0_getfield _flowFieldManager   // get_name_1:  _flowFieldManager   // get_name_2:  _flowFieldManager   // get_Name:    _flowFieldManager   // getName->1:  _flowFieldManager   // getName->2:  _flowFieldManager   // getName->N:  _flowFieldManager   // ofs = 53762 ord = 1 addr = 0
	iconst_0 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	astore_2 
	aload_2 
	invokevirtual int getTop( net.rim.device.api.ui.Field ) // pc=1
	istore_3 
	aload_2 
	astore_4 
	iconst_1 
	istore_5 
Label18:
	iload_5 
	iload_1 
	if_icmpge Label33
	aload_0_getfield _flowFieldManager   // get_name_1:  _flowFieldManager   // get_name_2:  _flowFieldManager   // get_Name:    _flowFieldManager   // getName->1:  _flowFieldManager   // getName->2:  _flowFieldManager   // getName->N:  _flowFieldManager   // ofs = 53762 ord = 1 addr = 0
	iload_5 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	astore_6 
	aload_6 
	invokevirtual int getTop( net.rim.device.api.ui.Field ) // pc=1
	iload_3 
	if_icmpne Label33
	aload_6 
	astore_4 
	iinc 5 1
	goto Label18
Label33:
	aload_4 
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	return 
	}


public final setFocusTopLeft( com.whatsapp.client.EmojiPickerPopup ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _flowFieldManager   // get_name_1:  _flowFieldManager   // get_name_2:  _flowFieldManager   // get_Name:    _flowFieldManager   // getName->1:  _flowFieldManager   // getName->2:  _flowFieldManager   // getName->N:  _flowFieldManager   // ofs = 53762 ord = 1 addr = 0
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	ifne Label5
	return 
Label5:
	aload_0_getfield _flowFieldManager   // get_name_1:  _flowFieldManager   // get_name_2:  _flowFieldManager   // get_Name:    _flowFieldManager   // getName->1:  _flowFieldManager   // getName->2:  _flowFieldManager   // getName->N:  _flowFieldManager   // ofs = 53762 ord = 1 addr = 0
	iconst_0 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	return 
	}


public final fieldChanged( com.whatsapp.client.EmojiPickerPopup, net.rim.device.api.ui.Field, int ); // address: 0
	{
	enter 
	aload_0_getfield _handler   // get_name_1:  _handler   // get_name_2:  _handler   // get_Name:    _handler   // getName->1:  _handler   // getName->2:  _handler   // getName->N:  _handler   // ofs = 53770 ord = 3 addr = 0
	ifnull Label22
	aload_1 
	invokevirtual java.lang.Object getCookie( net.rim.device.api.ui.Field ) // pc=1
	ifnull Label22
	aload_1 
	invokevirtual java.lang.Object getCookie( net.rim.device.api.ui.Field ) // pc=1
	instanceof_lib net.rim.device.api.ui.component.RichTextField//net.rim.device.api.ui.component.RichTextField net.rim.device.api.ui.component.RichTextField net.rim.device.api.ui.component.RichTextField
	ifeq Label22
	aload_1 
	invokevirtual java.lang.Object getCookie( net.rim.device.api.ui.Field ) // pc=1
	checkcast_lib net.rim.device.api.ui.component.RichTextField//net.rim.device.api.ui.component.RichTextField net.rim.device.api.ui.component.RichTextField net.rim.device.api.ui.component.RichTextField
	invokevirtual char charValue( java.lang.Character ) // pc=1
	istore_3 
	iload_3 
	putstatic _lastSelection // EmojiPickerPopup
	aload_0_getfield _currentPage   // get_name_1:  _currentPage   // get_name_2:  _currentPage   // get_Name:    _currentPage   // getName->1:  _currentPage   // getName->2:  _currentPage   // getName->N:  _currentPage   // ofs = 53766 ord = 2 addr = 0
	putstatic _lastPageSelection // EmojiPickerPopup
	aload_0_getfield _handler   // get_name_1:  _handler   // get_name_2:  _handler   // get_Name:    _handler   // getName->1:  _handler   // getName->2:  _handler   // getName->N:  _handler   // ofs = 53770 ord = 3 addr = 0
	iload_3 
	invokeinterface interfacemethodref_86 // pc=2 guess=0
Label22:
	aload_0 
	invokevirtual close( net.rim.device.api.ui.Screen ) // pc=1
	return 
	}


protected final paintBackground( com.whatsapp.client.EmojiPickerPopup, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter_narrow 
	aload_1 
	iconst_0 
	invokevirtual setBackgroundColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_0 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.Screen.paintBackground // pc=2
	return 
	}


protected final boolean keyChar( com.whatsapp.client.EmojiPickerPopup, char, int, int ); // address: 0
	{
	enter 
	iload_1 
	bipush 27
	if_icmpne Label8
	aload_0 
	invokevirtual close( net.rim.device.api.ui.Screen ) // pc=1
	iconst_1 
	ireturn 
Label8:
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	invokespecial_lib net.rim.device.api.ui.Screen.keyChar // pc=4
	ireturn 
	}


protected final sublayout( com.whatsapp.client.EmojiPickerPopup, int, int ); // address: 0
	{
	enter 
	iload_2 
	sipush 140
	if_icmple Label8
	iload_2 
	bipush 35
	isub 
	goto Label9
Label8:
	iload_2 
Label9:
	istore_3 
	aload_0_getfield _flowFieldManager   // get_name_1:  _flowFieldManager   // get_name_2:  _flowFieldManager   // get_Name:    _flowFieldManager   // getName->1:  _flowFieldManager   // getName->2:  _flowFieldManager   // getName->N:  _flowFieldManager   // ofs = 53762 ord = 1 addr = 0
	astore_4 
	bipush 7
	istore_5 
	aload_4 
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	bipush 7
	if_icmple Label61
	iconst_0 
	istore_6 
	iconst_0 
	istore_7 
	iconst_0 
	istore 8
Label24:
	iload 8
	bipush 7
	if_icmpge Label54
	aload_4 
	iload 8
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	astore 9
	iload_6 
	iload_7 
	aload 9
	invokevirtual int getMarginLeft( net.rim.device.api.ui.Field ) // pc=1
	invokestatic_lib int max( int, int ) // Math
	iadd 
	istore_6 
	iload_6 
	aload 9
	invokevirtual int getPaddingLeft( net.rim.device.api.ui.Field ) // pc=1
	aload 9
	invokevirtual int getPreferredWidth( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	aload 9
	invokevirtual int getPaddingRight( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	iadd 
	istore_6 
	aload 9
	invokevirtual int getMarginRight( net.rim.device.api.ui.Field ) // pc=1
	istore_7 
	iinc 8 1
	goto Label24
Label54:
	iload_6 
	iload_7 
	iadd 
	istore_6 
	aload_4 
	iload_6 
	invokenonvirtual_lib .routine_1678 // pc=2
Label61:
	aload_0 
	iload_1 
	iload_3 
	invokespecial_lib net.rim.device.api.ui.container.PopupScreen.sublayout // pc=3
	return 
	}

}
