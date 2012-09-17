// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-28.cod
// Module version  : 2.7.3204
// Class ID        : 1
// ########################################################


package com.whatsapp.client;


public class PopupContactPicker extends net.rim.device.api.ui.component.AutoTextEditField

{
	// @@@@@@@@@@@@@ Static fields 
	public final static String /*java.lang.String*/  _deviceName ; // ofs = 53344 addr = 4)
	public final static boolean /*boolean*/  _showTouchPrompt ; // ofs = 53350 addr = 5)

	// @@@@@@@@@@@@@ Fields 
	private com.whatsapp.client. /*module:WhatsApp-10.class#34*/  _selection ; // ofs = 53320 addr = 0)
	private com.whatsapp.client.ContactPickerField /*com.whatsapp.client.ContactPickerField*/  _picker ; // ofs = 53324 addr = 0)
	private net.rim.device.api.ui.container.VerticalFieldManager /*net.rim.device.api.ui.container.VerticalFieldManager*/  _wrappedPicker ; // ofs = 53328 addr = 0)
	private java.util.Hashtable /*java.util.Hashtable*/  _alreadySelected ; // ofs = 53332 addr = 0)
	private Integer /*java.lang.Integer*/  field_53336 ; // ofs = 53336 addr = 0)
	private Integer /*java.lang.Integer*/  _invokeLaterId ; // ofs = 53340 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.PopupContactPicker ); // address: 0
	{
	enter_narrow 
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	invokespecial com.whatsapp.client.PopupContactPicker.<init> // pc=2
	return 
	}


public <init>( com.whatsapp.client.PopupContactPicker, java.util.Hashtable ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib net.rim.device.api.ui.component.AutoTextEditField.<init> // pc=1
	aload_0 
	aconst_null 
	putfield _selection   // get_name_1:  _selection   // get_name_2:  _selection   // get_Name:    _selection   // getName->1:  _selection   // getName->2:  _selection   // getName->N:  _selection   // ofs = 53320 ord = 0 addr = 0
	aload_0 
	aload_1 
	putfield _alreadySelected   // get_name_1:  _alreadySelected   // get_name_2:  _alreadySelected   // get_Name:    _alreadySelected   // getName->1:  _alreadySelected   // getName->2:  _alreadySelected   // getName->N:  _alreadySelected   // ofs = 53332 ord = 3 addr = 0
	return 
	}


static access$1200( com.whatsapp.client.PopupContactPicker ); // address: 0
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
	synch_static PopupContactPicker
	clinit_wait 
	invokestatic_lib java.lang.String getDeviceName(  ) // DeviceInfo
	putstatic _deviceName // PopupContactPicker
	getstatic _deviceName // PopupContactPicker
	ldc literal_50:"9500"
	invokenonvirtual_lib java.lang.String.startsWith // pc=2
	ifne Label18
	getstatic _deviceName // PopupContactPicker
	ldc literal_51:"9530"
	invokenonvirtual_lib java.lang.String.startsWith // pc=2
	ifne Label18
	getstatic _deviceName // PopupContactPicker
	ldc literal_52:"9550"
	invokenonvirtual_lib java.lang.String.startsWith // pc=2
	ifeq Label20
Label18:
	iconst_1 
	goto Label21
Label20:
	iconst_0 
Label21:
	putstatic _showTouchPrompt // PopupContactPicker
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private net.rim.device.api.ui.container.VerticalFieldManager getWrappedPicker( com.whatsapp.client.PopupContactPicker, net.rim.device.api.ui.Field, int ); // address: 0
	{
	enter 
	aload_0_getfield _wrappedPicker   // get_name_1:  _wrappedPicker   // get_name_2:  _wrappedPicker   // get_Name:    _wrappedPicker   // getName->1:  _wrappedPicker   // getName->2:  _wrappedPicker   // getName->N:  _wrappedPicker   // ofs = 53328 ord = 2 addr = 0
	ifnull Label5
	aload_0_getfield _wrappedPicker   // get_name_1:  _wrappedPicker   // get_name_2:  _wrappedPicker   // get_Name:    _wrappedPicker   // getName->1:  _wrappedPicker   // getName->2:  _wrappedPicker   // getName->N:  _wrappedPicker   // ofs = 53328 ord = 2 addr = 0
	areturn 
Label5:
	new PopupContactPicker$4
	dup 
	aload_0 
	lipush 299067162755072
	invokespecial com.whatsapp.client.PopupContactPicker$4.<init> // pc=4
	astore_3 
	aload_3 
	new_lib Boolean//java.lang.Boolean java.lang.Boolean java.lang.Boolean
	dup 
	iconst_1 
	iconst_1 
	iconst_1 
	iconst_1 
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=5
	invokestatic_lib net.rim.device.api.ui.decor.Border createSimpleBorder( net.rim.device.api.ui.XYEdges ) // BorderFactory
	invokevirtual setBorder( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Border ) // pc=2
	aload_3 
	iipush 16777215
	invokestatic_lib net.rim.device.api.ui.decor.Background createSolidBackground( int ) // BackgroundFactory
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	bipush 5
	iload_2 
	iconst_1 
	iushr 
	invokestatic_lib int max( int, int ) // Math
	istore_4 
	aload_3 
	iconst_0 
	iload_4 
	iconst_0 
	iload_4 
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_3 
	aload_1 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_3 
	areturn 
	}


private com.whatsapp.client.ContactPickerField createContactDetailPopup( com.whatsapp.client.PopupContactPicker, module:WhatsApp-10.class#34 ); // address: 0
	{
	enter 
	aload_1 
	ifnonnull Label5
	aconst_null 
	areturn 
Label5:
	new_lib com.whatsapp.client.ContactPickerField//com.whatsapp.client.ContactPickerField com.whatsapp.client.ContactPickerField com.whatsapp.client.ContactPickerField
	dup 
	invokespecial_lib .routine_8598 // pc=1
	astore_2 
	aload_2 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	bipush 3
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int ) // pc=2
	invokenonvirtual_lib .routine_7140 // pc=2
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_3 
	aload_3 
	aload_1 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_2 
	aload_3 
	invokenonvirtual_lib .routine_7160 // pc=2
	aload_2 
	areturn 
	}


private setSelection( com.whatsapp.client.PopupContactPicker, module:WhatsApp-10.class#34, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	putfield _selection   // get_name_1:  _selection   // get_name_2:  _selection   // get_Name:    _selection   // getName->1:  _selection   // getName->2:  _selection   // getName->N:  _selection   // ofs = 53320 ord = 0 addr = 0
	aload_0 
	invokenonvirtual com.whatsapp.client.PopupContactPicker.setDeleteOnly // pc=1
	aload_0 
	aload_2 
	invokevirtual setText( net.rim.device.api.ui.component.BasicEditField, java.lang.String ) // pc=2
	return 
	}


private com.whatsapp.client.ContactPickerField com.whatsapp.client.PopupContactPicker.routine_1269( com.whatsapp.client.PopupContactPicker ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.ContactPickerField//com.whatsapp.client.ContactPickerField com.whatsapp.client.ContactPickerField com.whatsapp.client.ContactPickerField
	dup 
	invokespecial_lib .routine_8598 // pc=1
	astore_1 
	aload_1 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	bipush 3
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int ) // pc=2
	invokenonvirtual_lib .routine_7140 // pc=2
	invokestatic_lib net.rim.device.api.system.RuntimeStore getRuntimeStore(  ) // RuntimeStore
	lipush 8535665252065932813
	invokevirtual java.lang.Object get( net.rim.device.api.system.RuntimeStore, long ) // pc=3
	checkcast_lib com.whatsapp.client.//module:WhatsApp-13.class#1 module:WhatsApp-13.class#1 module:WhatsApp-13.class#1
	astore_2 
	aload_2 
	ifnull Label25
	aload_1 
	aload_2 
	aconst_null 
	iconst_1 
	invokenonvirtual_lib .routine_4574 // pc=3
	invokenonvirtual_lib .routine_7160 // pc=2
	goto Label30
Label25:
	aload_1 
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	invokenonvirtual_lib .routine_7160 // pc=2
Label30:
	aload_1 
	aload_0 
	invokespecial com.whatsapp.client.PopupContactPicker.routine_1424 // pc=1
	invokenonvirtual_lib .routine_7251 // pc=2
	aload_1 
	aload_0 
	invokespecial com.whatsapp.client.PopupContactPicker.getClickHandler // pc=1
	invokenonvirtual_lib .routine_7276 // pc=2
	aload_1 
	new PopupContactPicker$5
	dup 
	aload_0 
	invokespecial com.whatsapp.client.PopupContactPicker$5.<init> // pc=2
	invokenonvirtual_lib .routine_7298 // pc=2
	aload_1 
	areturn 
	}


private module:WhatsApp-11.class#30 getClickHandler( com.whatsapp.client.PopupContactPicker ); // address: 0
	{
	enter 
	new PopupContactPicker$6
	dup 
	aload_0 
	invokespecial com.whatsapp.client.PopupContactPicker$6.<init> // pc=2
	areturn 
	}


private module:WhatsApp-1.class#5 com.whatsapp.client.PopupContactPicker.routine_1424( com.whatsapp.client.PopupContactPicker ); // address: 0
	{
	enter_narrow 
	new PopupContactPicker$7
	dup 
	aload_0 
	invokespecial com.whatsapp.client.PopupContactPicker$7.<init> // pc=2
	areturn 
	}


private hideContactPopup( com.whatsapp.client.PopupContactPicker ); // address: 0
	{
	enter 
	aload_0_getfield _wrappedPicker   // get_name_1:  _wrappedPicker   // get_name_2:  _wrappedPicker   // get_Name:    _wrappedPicker   // getName->1:  _wrappedPicker   // getName->2:  _wrappedPicker   // getName->N:  _wrappedPicker   // ofs = 53328 ord = 2 addr = 0
	ifnull Label6
	aload_0_getfield _wrappedPicker   // get_name_1:  _wrappedPicker   // get_name_2:  _wrappedPicker   // get_Name:    _wrappedPicker   // getName->1:  _wrappedPicker   // getName->2:  _wrappedPicker   // getName->N:  _wrappedPicker   // ofs = 53328 ord = 2 addr = 0
	invokevirtual net.rim.device.api.ui.Manager getManager( net.rim.device.api.ui.Field ) // pc=1
	ifnonnull Label7
Label6:
	return 
Label7:
	aload_0_getfield _wrappedPicker   // get_name_1:  _wrappedPicker   // get_name_2:  _wrappedPicker   // get_Name:    _wrappedPicker   // getName->1:  _wrappedPicker   // getName->2:  _wrappedPicker   // getName->N:  _wrappedPicker   // ofs = 53328 ord = 2 addr = 0
	invokevirtual net.rim.device.api.ui.Manager getManager( net.rim.device.api.ui.Field ) // pc=1
	checkcast_lib com.whatsapp.field.//module:WhatsApp-38.class#7 module:WhatsApp-38.class#7 module:WhatsApp-38.class#7
	aconst_null 
	aconst_null 
	invokeinterface interfacemethodref_2 // pc=3 guess=0
	aload_0 
	aconst_null 
	putfield _picker   // get_name_1:  _picker   // get_name_2:  _picker   // get_Name:    _picker   // getName->1:  _picker   // getName->2:  _picker   // getName->N:  _picker   // ofs = 53324 ord = 1 addr = 0
	aload_0 
	aconst_null 
	putfield _wrappedPicker   // get_name_1:  _wrappedPicker   // get_name_2:  _wrappedPicker   // get_Name:    _wrappedPicker   // getName->1:  _wrappedPicker   // getName->2:  _wrappedPicker   // getName->N:  _wrappedPicker   // ofs = 53328 ord = 2 addr = 0
	return 
	}


private module:WhatsApp-38.class#7 getPopupManager( com.whatsapp.client.PopupContactPicker ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual net.rim.device.api.ui.Manager getManager( net.rim.device.api.ui.Field ) // pc=1
	astore_1 
Label4:
	aload_1 
	checkcastbranch_lib 
	areturn 
Label7:
	aload_1 
	invokevirtual net.rim.device.api.ui.Manager getManager( net.rim.device.api.ui.Field ) // pc=1
	dup 
	astore_1 
	ifnonnull Label4
	aconst_null 
	areturn 
	}


private showContactPopup( com.whatsapp.client.PopupContactPicker ); // address: 0
	{
	enter 
	aload_0_getfield _wrappedPicker   // get_name_1:  _wrappedPicker   // get_name_2:  _wrappedPicker   // get_Name:    _wrappedPicker   // getName->1:  _wrappedPicker   // getName->2:  _wrappedPicker   // getName->N:  _wrappedPicker   // ofs = 53328 ord = 2 addr = 0
	ifnull Label7
	aload_0_getfield _wrappedPicker   // get_name_1:  _wrappedPicker   // get_name_2:  _wrappedPicker   // get_Name:    _wrappedPicker   // getName->1:  _wrappedPicker   // getName->2:  _wrappedPicker   // getName->N:  _wrappedPicker   // ofs = 53328 ord = 2 addr = 0
	invokevirtual net.rim.device.api.ui.Manager getManager( net.rim.device.api.ui.Field ) // pc=1
	ifnull Label7
	return 
Label7:
	aload_0 
	invokespecial com.whatsapp.client.PopupContactPicker.getPopupManager // pc=1
	astore_1 
	aload_1 
	ifnonnull Label13
	return 
Label13:
	aload_0 
	aload_0 
	invokespecial com.whatsapp.client.PopupContactPicker.routine_1269 // pc=1
	putfield _picker   // get_name_1:  _picker   // get_name_2:  _picker   // get_Name:    _picker   // getName->1:  _picker   // getName->2:  _picker   // getName->N:  _picker   // ofs = 53324 ord = 1 addr = 0
	aload_0 
	aload_0_getfield _picker   // get_name_1:  _picker   // get_name_2:  _picker   // get_Name:    _picker   // getName->1:  _picker   // getName->2:  _picker   // getName->N:  _picker   // ofs = 53324 ord = 1 addr = 0
	bipush 10
	invokespecial com.whatsapp.client.PopupContactPicker.getWrappedPicker // pc=3
	astore_2 
	aload_1 
	aload_2 
	aload_0 
	invokeinterface interfacemethodref_2 // pc=3 guess=1
	aload_2 
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	aload_0 
	aload_2 
	putfield _wrappedPicker   // get_name_1:  _wrappedPicker   // get_name_2:  _wrappedPicker   // get_Name:    _wrappedPicker   // getName->1:  _wrappedPicker   // getName->2:  _wrappedPicker   // getName->N:  _wrappedPicker   // ofs = 53328 ord = 2 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public module:WhatsApp-10.class#34 getSelection( com.whatsapp.client.PopupContactPicker ); // address: 0
	{
	areturn_field _selection   // get_name_1:  _selection   // get_name_2:  _selection   // get_Name:    _selection   // getName->1:  _selection   // getName->2:  _selection   // getName->N:  _selection   // ofs = 53320 ord = 0 addr = 0
	}


protected onDelete( com.whatsapp.client.PopupContactPicker ); // address: 0
	{
	noenter_return 
	}


protected onClick( com.whatsapp.client.PopupContactPicker, module:WhatsApp-10.class#34, java.lang.String ); // address: 0
	{
	noenter_return 
	}


protected boolean keyChar( com.whatsapp.client.PopupContactPicker, char, int, int ); // address: 0
	{
	enter 
	iload_1 
	bipush 27
	if_icmpne Label16
	aload_0 
	invokevirtual boolean isEditable( net.rim.device.api.ui.Field ) // pc=1
	ifeq Label16
	aload_0 
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	stringlength 
	ifle Label16
	aload_0 
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokevirtual setText( net.rim.device.api.ui.component.BasicEditField, java.lang.String ) // pc=2
	iconst_1 
	ireturn 
Label16:
	iload_1 
	bipush 127
	if_icmpeq Label22
	iload_1 
	bipush 8
	if_icmpne Label29
Label22:
	aload_0 
	invokevirtual boolean isEditable( net.rim.device.api.ui.Field ) // pc=1
	ifne Label29
	aload_0 
	invokevirtual onDelete( com.whatsapp.client.PopupContactPicker ) // pc=1
	iconst_1 
	ireturn 
Label29:
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	invokespecial_lib net.rim.device.api.ui.component.AutoTextEditField.keyChar // pc=4
	ireturn 
	}


protected onUnfocus( com.whatsapp.client.PopupContactPicker ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib net.rim.device.api.ui.component.BasicEditField.onUnfocus // pc=1
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Field ) // pc=1
	aload_0_getfield _invokeLaterId   // get_name_1:  _invokeLaterId   // get_name_2:  _invokeLaterId   // get_Name:    _invokeLaterId   // getName->1:  _invokeLaterId   // getName->2:  _invokeLaterId   // getName->N:  _invokeLaterId   // ofs = 53340 ord = 5 addr = 0
	ifnull Label11
	invokestatic_lib net.rim.device.api.system.Application getApplication(  ) // UiApplication
	aload_0_getfield _invokeLaterId   // get_name_1:  _invokeLaterId   // get_name_2:  _invokeLaterId   // get_Name:    _invokeLaterId   // getName->1:  _invokeLaterId   // getName->2:  _invokeLaterId   // getName->N:  _invokeLaterId   // ofs = 53340 ord = 5 addr = 0
	invokevirtual int intValue( java.lang.Integer ) // pc=1
	invokevirtual cancelInvokeLater( net.rim.device.api.system.Application, int ) // pc=2
Label11:
	aload_0_getfield _wrappedPicker   // get_name_1:  _wrappedPicker   // get_name_2:  _wrappedPicker   // get_Name:    _wrappedPicker   // getName->1:  _wrappedPicker   // getName->2:  _wrappedPicker   // getName->N:  _wrappedPicker   // ofs = 53328 ord = 2 addr = 0
	ifnull Label15
	aload_0 
	invokespecial com.whatsapp.client.PopupContactPicker.hideContactPopup // pc=1
Label15:
	return 
	}


protected onFocus( com.whatsapp.client.PopupContactPicker, int ); // address: 0
	{
	enter 
	aload_0 
	iload_1 
	invokespecial_lib net.rim.device.api.ui.component.TextField.onFocus // pc=2
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Field ) // pc=1
	aload_0_getfield _selection   // get_name_1:  _selection   // get_name_2:  _selection   // get_Name:    _selection   // getName->1:  _selection   // getName->2:  _selection   // getName->N:  _selection   // ofs = 53320 ord = 0 addr = 0
	ifnull Label26
	new PopupContactPicker$1
	dup 
	aload_0 
	invokespecial com.whatsapp.client.PopupContactPicker$1.<init> // pc=2
	astore_2 
	invokestatic_lib net.rim.device.api.system.Application getApplication(  ) // UiApplication
	aload_2 
	sipush 1250
	i2l 
	iconst_0 
	invokevirtual int invokeLater( net.rim.device.api.system.Application, java.lang.Runnable, long, boolean ) // pc=5
	istore_3 
	aload_0 
	new_lib net.rim.device.api.ui.Graphics//net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics
	dup 
	iload_3 
	invokespecial_lib java.lang.Integer.<init> // pc=2
	putfield _invokeLaterId   // get_name_1:  _invokeLaterId   // get_name_2:  _invokeLaterId   // get_Name:    _invokeLaterId   // getName->1:  _invokeLaterId   // getName->2:  _invokeLaterId   // getName->N:  _invokeLaterId   // ofs = 53340 ord = 5 addr = 0
Label26:
	return 
	}


protected paint( com.whatsapp.client.PopupContactPicker, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual int getColor( net.rim.device.api.ui.Graphics ) // pc=1
	istore_2 
	aload_0 
	invokevirtual boolean isEditable( net.rim.device.api.ui.Field ) // pc=1
	ifne Label13
	aload_0_getfield com.whatsapp.client.PopupContactPicker.field_53336   // get_name_1:  com.whatsapp.client.PopupContactPicker.field_53336   // get_name_2:  com.whatsapp.client.PopupContactPicker.field_53336   // get_Name:    com.whatsapp.client.PopupContactPicker.field_53336   // getName->1:     // getName->2:     // getName->N:     // ofs = 53336 ord = 4 addr = 0
	ifnull Label13
	aload_1 
	aload_0_getfield com.whatsapp.client.PopupContactPicker.field_53336   // get_name_1:  com.whatsapp.client.PopupContactPicker.field_53336   // get_name_2:  com.whatsapp.client.PopupContactPicker.field_53336   // get_Name:    com.whatsapp.client.PopupContactPicker.field_53336   // getName->1:     // getName->2:     // getName->N:     // ofs = 53336 ord = 4 addr = 0
	invokevirtual int intValue( java.lang.Integer ) // pc=1
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
Label13:
	aload_0 
	invokevirtual boolean isFocus( net.rim.device.api.ui.Field ) // pc=1
	ifeq Label25
	aload_0 
	invokevirtual boolean isEditable( net.rim.device.api.ui.Field ) // pc=1
	ifne Label25
	aload_1 
	iipush 16777215
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	iipush 2129150
	invokevirtual setBackgroundColor( net.rim.device.api.ui.Graphics, int ) // pc=2
Label25:
	aload_0 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.component.BasicEditField.paint // pc=2
	aload_0 
	invokevirtual boolean isFocus( net.rim.device.api.ui.Field ) // pc=1
	ifeq Label55
	aload_0 
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	stringlength 
	ifne Label55
	aload_1 
	iipush 13882323
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	getstatic _showTouchPrompt // PopupContactPicker
	ifeq Label42
	sipush 829
	goto Label43
Label42:
	sipush 813
Label43:
	istore_3 
	aload_1 
	iload_3 
	invokestatic java.lang.String getString( int ) // Resources
	aload_1 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Graphics ) // pc=1
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	iconst_1 
	iushr 
	iconst_0 
	invokevirtual int drawText( net.rim.device.api.ui.Graphics, java.lang.String, int, int ) // pc=4
	pop 
Label55:
	aload_1 
	iload_2 
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_0 
	invokevirtual boolean isEditable( net.rim.device.api.ui.Field ) // pc=1
	ifeq Label89
	aload_0 
	invokevirtual boolean isFocus( net.rim.device.api.ui.Field ) // pc=1
	ifne Label89
	aload_0_getfield _wrappedPicker   // get_name_1:  _wrappedPicker   // get_name_2:  _wrappedPicker   // get_Name:    _wrappedPicker   // getName->1:  _wrappedPicker   // getName->2:  _wrappedPicker   // getName->N:  _wrappedPicker   // ofs = 53328 ord = 2 addr = 0
	ifnull Label89
	aload_0_getfield _wrappedPicker   // get_name_1:  _wrappedPicker   // get_name_2:  _wrappedPicker   // get_Name:    _wrappedPicker   // getName->1:  _wrappedPicker   // getName->2:  _wrappedPicker   // getName->N:  _wrappedPicker   // ofs = 53328 ord = 2 addr = 0
	invokevirtual boolean isFocus( net.rim.device.api.ui.Field ) // pc=1
	ifeq Label89
	new_lib Integer//java.lang.Integer java.lang.Integer java.lang.Integer
	dup 
	invokespecial_lib net.rim.device.api.ui.XYRect.<init> // pc=1
	astore_3 
	aload_0 
	aload_3 
	invokevirtual getFocusRect( net.rim.device.api.ui.component.TextField, net.rim.device.api.ui.XYRect ) // pc=2
	aload_0 
	aload_1 
	iconst_1 
	iconst_1 
	aload_3 
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 0 addr = -1
	aload_3 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 1 addr = -1
	aload_3 
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 2 addr = -1
	aload_3 
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 3 addr = -1
	invokevirtual drawHighlightRegion( net.rim.device.api.ui.Field, net.rim.device.api.ui.Graphics, int, boolean, int, int, int, int ) // pc=8
Label89:
	return 
	}


public int drawText( com.whatsapp.client.PopupContactPicker, net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.ui.DrawTextParam ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	astore_7 
	aload_0 
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	iload_2 
	aload_6 
	invokestatic_lib module:WhatsApp-15.class#5.routine_3531(  ) // class#5
	iadd 
	iload_2 
	aload_6 
	invokestatic_lib module:WhatsApp-15.class#5.routine_3518(  ) // class#5
	iadd 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	astore 8
	aload_1 
	iload_4 
	iload_5 
	aload_7 
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	isub 
	aload_7 
	aload 8
	invokevirtual int getAdvance( net.rim.device.api.ui.Font, java.lang.String ) // pc=2
	aload_7 
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	aload_7 
	invokevirtual int getDescent( net.rim.device.api.ui.Font ) // pc=1
	iadd 
	invokevirtual clear( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	aload_0 
	aload_1 
	iload_2 
	iload_3 
	iload_4 
	iload_5 
	aload_6 
	invokespecial_lib net.rim.device.api.ui.component.TextField.drawText // pc=7
	istore 9
	iload 9
	ireturn 
	}


protected drawFocus( com.whatsapp.client.PopupContactPicker, net.rim.device.api.ui.Graphics, boolean ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual boolean isEditable( net.rim.device.api.ui.Field ) // pc=1
	ifeq Label8
	aload_0 
	aload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.component.BasicEditField.drawFocus // pc=3
Label8:
	return 
	}


protected update( com.whatsapp.client.PopupContactPicker, int ); // address: 0
	{
	enter 
	aload_0 
	iload_1 
	invokespecial_lib net.rim.device.api.ui.component.AutoTextEditField.update // pc=2
	aload_0 
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	astore_2 
	aload_2 
	stringlength 
	ifeq Label13
	aload_0 
	invokevirtual boolean isEditable( net.rim.device.api.ui.Field ) // pc=1
	ifne Label16
Label13:
	aload_0 
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	return 
Label16:
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	new PopupContactPicker$2
	dup 
	aload_0 
	aload_2 
	invokespecial com.whatsapp.client.PopupContactPicker$2.<init> // pc=3
	iconst_1 
	i2l 
	iconst_0 
	invokevirtual int invokeLater( net.rim.device.api.system.Application, java.lang.Runnable, long, boolean ) // pc=5
	pop 
	return 
	}


protected boolean touchEvent( com.whatsapp.client.PopupContactPicker, net.rim.device.api.ui.TouchEvent ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual int getEvent( net.rim.device.api.ui.TouchEvent ) // pc=1
	iconst_1 
	if_icmpne Label49
	aload_1 
	invokevirtual net.rim.device.api.ui.TouchGesture getGesture( net.rim.device.api.ui.TouchEvent ) // pc=1
	astore_2 
	aload_2 
	invokevirtual int getEvent( net.rim.device.api.ui.TouchGesture ) // pc=1
	istore_3 
	iload_3 
	bipush 2
	if_icmpne Label35
	aload_2 
	invokevirtual int getTapCount( net.rim.device.api.ui.TouchGesture ) // pc=1
	bipush 2
	if_icmpne Label35
	new PopupContactPicker$3
	dup 
	aload_0 
	invokespecial com.whatsapp.client.PopupContactPicker$3.<init> // pc=2
	astore_4 
	aload_4 
	aload_0 
	invokespecial com.whatsapp.client.PopupContactPicker.routine_1424 // pc=1
	invokenonvirtual_lib .routine_6000 // pc=2
	aload_4 
	sipush 828
	invokestatic java.lang.String getString( int ) // Resources
	invokevirtual setTitle( net.rim.device.api.ui.container.MainScreen, java.lang.String ) // pc=2
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	aload_4 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	goto Label49
Label35:
	iload_3 
	sipush 13572
	if_icmpne Label49
	aload_2 
	invokevirtual int getSwipeDirection( net.rim.device.api.ui.TouchGesture ) // pc=1
	istore_4 
	iload_4 
	bipush 8
	iand 
	ifle Label49
	aload_0 
	invokevirtual onDelete( com.whatsapp.client.PopupContactPicker ) // pc=1
	iconst_1 
	ireturn 
Label49:
	aload_0 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.component.TextField.touchEvent // pc=2
	ireturn 
	}


public setSelection( com.whatsapp.client.PopupContactPicker, module:WhatsApp-10.class#34 ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iconst_0 
	invokenonvirtual_lib .routine_6025 // pc=2
	invokespecial com.whatsapp.client.PopupContactPicker.setSelection // pc=3
	return 
	}


protected setDeleteOnly( com.whatsapp.client.PopupContactPicker ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_0 
	invokevirtual setEditable( net.rim.device.api.ui.Field, boolean ) // pc=2
	return 
	}


public setColor( com.whatsapp.client.PopupContactPicker, int ); // address: 0
	{
	enter 
	aload_0 
	new_lib net.rim.device.api.ui.Graphics//net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics
	dup 
	iload_1 
	invokespecial_lib java.lang.Integer.<init> // pc=2
	putfield com.whatsapp.client.PopupContactPicker.field_53336   // get_name_1:  com.whatsapp.client.PopupContactPicker.field_53336   // get_name_2:  com.whatsapp.client.PopupContactPicker.field_53336   // get_Name:    com.whatsapp.client.PopupContactPicker.field_53336   // getName->1:     // getName->2:     // getName->N:     // ofs = 53336 ord = 4 addr = 0
	return 
	}

}
