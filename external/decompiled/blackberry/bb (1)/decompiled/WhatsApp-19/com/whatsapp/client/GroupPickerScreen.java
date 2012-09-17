// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-19.cod
// Module version  : 2.7.3204
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


abstract public final class GroupPickerScreen extends net.rim.device.api.ui.container.MainScreen

{
	// @@@@@@@@@@@@@ Static fields 
	private final static net.rim.device.api.system.Bitmap /*net.rim.device.api.system.Bitmap*/  field_52524 ; // ofs = 52524 addr = 2)
	private final static net.rim.device.api.system.Bitmap /*net.rim.device.api.system.Bitmap*/  field_52530 ; // ofs = 52530 addr = 3)

	// @@@@@@@@@@@@@ Fields 
	private java.util.Vector /*java.util.Vector*/  field_52480 ; // ofs = 52480 addr = 0)
	private String /*java.lang.String[]*/  field_52484 ; // ofs = 52484 addr = 0)
	private java.util.Vector /*java.util.Vector*/  _filteredGroups ; // ofs = 52488 addr = 0)
	private final java.util.Hashtable /*java.util.Hashtable*/  field_52492 ; // ofs = 52492 addr = 0)
	private final com.whatsapp.client.CustomKeywordField /*com.whatsapp.client.CustomKeywordField*/  field_52496 ; // ofs = 52496 addr = 0)
	private final com.whatsapp.client.NonCachingListField /*com.whatsapp.client.NonCachingListField*/  field_52500 ; // ofs = 52500 addr = 0)
	private net.rim.device.api.ui.Font /*net.rim.device.api.ui.Font*/  field_52504 ; // ofs = 52504 addr = 0)
	private net.rim.device.api.ui.Font /*net.rim.device.api.ui.Font*/  field_52508 ; // ofs = 52508 addr = 0)
	private net.rim.device.api.ui.component.RichTextField /*net.rim.device.api.ui.component.RichTextField*/  field_52512 ; // ofs = 52512 addr = 0)
	private com.whatsapp.client. /*module:WhatsApp-9.class#17*/  field_52516 ; // ofs = 52516 addr = 0)
	private String /*java.lang.String*/  field_52520 ; // ofs = 52520 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.GroupPickerScreen ); // address: 0
	{
	enter 
	aload_0 
	lipush 580542139727872
	invokespecial_lib net.rim.device.api.ui.container.MainScreen.<init> // pc=3
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putfield com.whatsapp.client.GroupPickerScreen.field_52492   // get_name_1:  com.whatsapp.client.GroupPickerScreen.field_52492   // get_name_2:  com.whatsapp.client.GroupPickerScreen.field_52492   // get_Name:    com.whatsapp.client.GroupPickerScreen.field_52492   // getName->1:     // getName->2:     // getName->N:     // ofs = 52492 ord = 3 addr = 0
	aload_0 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	putfield com.whatsapp.client.GroupPickerScreen.field_52504   // get_name_1:  com.whatsapp.client.GroupPickerScreen.field_52504   // get_name_2:  com.whatsapp.client.GroupPickerScreen.field_52504   // get_Name:    com.whatsapp.client.GroupPickerScreen.field_52504   // getName->1:     // getName->2:     // getName->N:     // ofs = 52504 ord = 6 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.GroupPickerScreen.field_52504   // get_name_1:  com.whatsapp.client.GroupPickerScreen.field_52504   // get_name_2:  com.whatsapp.client.GroupPickerScreen.field_52504   // get_Name:    com.whatsapp.client.GroupPickerScreen.field_52504   // getName->1:     // getName->2:     // getName->N:     // ofs = 52504 ord = 6 addr = 0
	iconst_0 
	aload_0_getfield com.whatsapp.client.GroupPickerScreen.field_52504   // get_name_1:  com.whatsapp.client.GroupPickerScreen.field_52504   // get_name_2:  com.whatsapp.client.GroupPickerScreen.field_52504   // get_Name:    com.whatsapp.client.GroupPickerScreen.field_52504   // getName->1:     // getName->2:     // getName->N:     // ofs = 52504 ord = 6 addr = 0
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	bipush 80
	imul 
	bipush 100
	idiv 
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int, int ) // pc=3
	putfield com.whatsapp.client.GroupPickerScreen.field_52508   // get_name_1:  com.whatsapp.client.GroupPickerScreen.field_52508   // get_name_2:  com.whatsapp.client.GroupPickerScreen.field_52508   // get_Name:    com.whatsapp.client.GroupPickerScreen.field_52508   // getName->1:     // getName->2:     // getName->N:     // ofs = 52508 ord = 7 addr = 0
	aload_0 
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	putfield com.whatsapp.client.GroupPickerScreen.field_52520   // get_name_1:  com.whatsapp.client.GroupPickerScreen.field_52520   // get_name_2:  com.whatsapp.client.GroupPickerScreen.field_52520   // get_Name:    com.whatsapp.client.GroupPickerScreen.field_52520   // getName->1:     // getName->2:     // getName->N:     // ofs = 52520 ord = 10 addr = 0
	aload_0 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield com.whatsapp.client.GroupPickerScreen.field_52480   // get_name_1:  com.whatsapp.client.GroupPickerScreen.field_52480   // get_name_2:  com.whatsapp.client.GroupPickerScreen.field_52480   // get_Name:    com.whatsapp.client.GroupPickerScreen.field_52480   // getName->1:     // getName->2:     // getName->N:     // ofs = 52480 ord = 0 addr = 0
	aload_0 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield _filteredGroups   // get_name_1:  _filteredGroups   // get_name_2:  _filteredGroups   // get_Name:    _filteredGroups   // getName->1:  _filteredGroups   // getName->2:  _filteredGroups   // getName->N:  _filteredGroups   // ofs = 52488 ord = 2 addr = 0
	aload_0 
	new_lib net.rim.device.api.ui.Graphics//net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics
	dup 
	sipush 852
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	lipush 1188950301626073088
	invokespecial_lib net.rim.device.api.ui.component.RichTextField.<init> // pc=4
	putfield com.whatsapp.client.GroupPickerScreen.field_52512   // get_name_1:  com.whatsapp.client.GroupPickerScreen.field_52512   // get_name_2:  com.whatsapp.client.GroupPickerScreen.field_52512   // get_Name:    com.whatsapp.client.GroupPickerScreen.field_52512   // getName->1:     // getName->2:     // getName->N:     // ofs = 52512 ord = 8 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.GroupPickerScreen.field_52512   // get_name_1:  com.whatsapp.client.GroupPickerScreen.field_52512   // get_name_2:  com.whatsapp.client.GroupPickerScreen.field_52512   // get_Name:    com.whatsapp.client.GroupPickerScreen.field_52512   // getName->1:     // getName->2:     // getName->N:     // ofs = 52512 ord = 8 addr = 0
	invokevirtual setTitle( net.rim.device.api.ui.container.MainScreen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib com.whatsapp.client.CustomKeywordField//com.whatsapp.client.CustomKeywordField com.whatsapp.client.CustomKeywordField com.whatsapp.client.CustomKeywordField
	dup 
	invokespecial_lib .routine_1593 // pc=1
	putfield com.whatsapp.client.GroupPickerScreen.field_52496   // get_name_1:  com.whatsapp.client.GroupPickerScreen.field_52496   // get_name_2:  com.whatsapp.client.GroupPickerScreen.field_52496   // get_Name:    com.whatsapp.client.GroupPickerScreen.field_52496   // getName->1:     // getName->2:     // getName->N:     // ofs = 52496 ord = 4 addr = 0
	aload_0_getfield com.whatsapp.client.GroupPickerScreen.field_52496   // get_name_1:  com.whatsapp.client.GroupPickerScreen.field_52496   // get_name_2:  com.whatsapp.client.GroupPickerScreen.field_52496   // get_Name:    com.whatsapp.client.GroupPickerScreen.field_52496   // getName->1:     // getName->2:     // getName->N:     // ofs = 52496 ord = 4 addr = 0
	bipush 22
	bipush 89
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	invokevirtual setLabel( net.rim.device.api.ui.component.BasicEditField, java.lang.String ) // pc=2
	aload_0_getfield com.whatsapp.client.GroupPickerScreen.field_52496   // get_name_1:  com.whatsapp.client.GroupPickerScreen.field_52496   // get_name_2:  com.whatsapp.client.GroupPickerScreen.field_52496   // get_Name:    com.whatsapp.client.GroupPickerScreen.field_52496   // getName->1:     // getName->2:     // getName->N:     // ofs = 52496 ord = 4 addr = 0
	new_lib com.whatsapp.client.//module:WhatsApp-18.class#27 module:WhatsApp-18.class#27 module:WhatsApp-18.class#27
	dup 
	aload_0 
	invokespecial_lib .routine_9429 // pc=2
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0 
	new_lib com.whatsapp.client.NonCachingListField//com.whatsapp.client.NonCachingListField com.whatsapp.client.NonCachingListField com.whatsapp.client.NonCachingListField
	dup 
	invokespecial_lib .routine_851 // pc=1
	putfield com.whatsapp.client.GroupPickerScreen.field_52500   // get_name_1:  com.whatsapp.client.GroupPickerScreen.field_52500   // get_name_2:  com.whatsapp.client.GroupPickerScreen.field_52500   // get_Name:    com.whatsapp.client.GroupPickerScreen.field_52500   // getName->1:     // getName->2:     // getName->N:     // ofs = 52500 ord = 5 addr = 0
	aload_0_getfield com.whatsapp.client.GroupPickerScreen.field_52500   // get_name_1:  com.whatsapp.client.GroupPickerScreen.field_52500   // get_name_2:  com.whatsapp.client.GroupPickerScreen.field_52500   // get_Name:    com.whatsapp.client.GroupPickerScreen.field_52500   // getName->1:     // getName->2:     // getName->N:     // ofs = 52500 ord = 5 addr = 0
	sipush 928
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	bipush 4
	invokevirtual setEmptyString( net.rim.device.api.ui.component.ListField, java.lang.String, int ) // pc=3
	aload_0_getfield com.whatsapp.client.GroupPickerScreen.field_52500   // get_name_1:  com.whatsapp.client.GroupPickerScreen.field_52500   // get_name_2:  com.whatsapp.client.GroupPickerScreen.field_52500   // get_Name:    com.whatsapp.client.GroupPickerScreen.field_52500   // getName->1:     // getName->2:     // getName->N:     // ofs = 52500 ord = 5 addr = 0
	new_lib com.whatsapp.client.GroupPickerScreen$2//module:WhatsApp-18.class#28 module:WhatsApp-18.class#28 module:WhatsApp-18.class#28
	dup 
	aload_0 
	invokespecial_lib .routine_9479 // pc=2
	invokenonvirtual_lib .routine_439 // pc=2
	aload_0_getfield com.whatsapp.client.GroupPickerScreen.field_52500   // get_name_1:  com.whatsapp.client.GroupPickerScreen.field_52500   // get_name_2:  com.whatsapp.client.GroupPickerScreen.field_52500   // get_Name:    com.whatsapp.client.GroupPickerScreen.field_52500   // getName->1:     // getName->2:     // getName->N:     // ofs = 52500 ord = 5 addr = 0
	new_lib com.whatsapp.client.GroupPickerScreen$3//module:WhatsApp-18.class#29 module:WhatsApp-18.class#29 module:WhatsApp-18.class#29
	dup 
	aload_0 
	invokespecial_lib .routine_9573 // pc=2
	invokevirtual setCallback( net.rim.device.api.ui.component.ListField, net.rim.device.api.ui.component.ListFieldCallback ) // pc=2
	bipush 12
	getstatic_lib module:WhatsApp-13.class#3.static_14 // class#3
	iadd 
	istore_1 
	bipush 6
	aload_0_getfield com.whatsapp.client.GroupPickerScreen.field_52504   // get_name_1:  com.whatsapp.client.GroupPickerScreen.field_52504   // get_name_2:  com.whatsapp.client.GroupPickerScreen.field_52504   // get_Name:    com.whatsapp.client.GroupPickerScreen.field_52504   // getName->1:     // getName->2:     // getName->N:     // ofs = 52504 ord = 6 addr = 0
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	iadd 
	bipush 6
	iadd 
	aload_0_getfield com.whatsapp.client.GroupPickerScreen.field_52508   // get_name_1:  com.whatsapp.client.GroupPickerScreen.field_52508   // get_name_2:  com.whatsapp.client.GroupPickerScreen.field_52508   // get_Name:    com.whatsapp.client.GroupPickerScreen.field_52508   // getName->1:     // getName->2:     // getName->N:     // ofs = 52508 ord = 7 addr = 0
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	iadd 
	bipush 6
	iadd 
	istore_2 
	aload_0_getfield com.whatsapp.client.GroupPickerScreen.field_52500   // get_name_1:  com.whatsapp.client.GroupPickerScreen.field_52500   // get_name_2:  com.whatsapp.client.GroupPickerScreen.field_52500   // get_Name:    com.whatsapp.client.GroupPickerScreen.field_52500   // getName->1:     // getName->2:     // getName->N:     // ofs = 52500 ord = 5 addr = 0
	iload_1 
	iload_2 
	invokestatic_lib int max( int, int ) // Math
	invokevirtual setRowHeight( net.rim.device.api.ui.component.ListField, int ) // pc=2
	aload_0 
	new GroupPickerScreen$FilterScreenManager
	dup 
	aload_0_getfield com.whatsapp.client.GroupPickerScreen.field_52496   // get_name_1:  com.whatsapp.client.GroupPickerScreen.field_52496   // get_name_2:  com.whatsapp.client.GroupPickerScreen.field_52496   // get_Name:    com.whatsapp.client.GroupPickerScreen.field_52496   // getName->1:     // getName->2:     // getName->N:     // ofs = 52496 ord = 4 addr = 0
	aload_0_getfield com.whatsapp.client.GroupPickerScreen.field_52500   // get_name_1:  com.whatsapp.client.GroupPickerScreen.field_52500   // get_name_2:  com.whatsapp.client.GroupPickerScreen.field_52500   // get_Name:    com.whatsapp.client.GroupPickerScreen.field_52500   // getName->1:     // getName->2:     // getName->N:     // ofs = 52500 ord = 5 addr = 0
	invokespecial com.whatsapp.client.GroupPickerScreen$FilterScreenManager.<init> // pc=3
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	return 
	}


static private final com.whatsapp.client.GroupPickerScreen.routine_1321( net.rim.device.api.ui.Graphics, int, int, int, boolean ); // address: 0
	{
	enter 
	iload_3 
	iconst_1 
	iushr 
	istore_5 
	iload_4 
	ifeq Label9
	getstatic com.whatsapp.client.GroupPickerScreen.field_52530 // GroupPickerScreen
	goto Label10
Label9:
	getstatic com.whatsapp.client.GroupPickerScreen.field_52524 // GroupPickerScreen
Label10:
	astore_6 
	aload_0 
	iload_5 
	aload_6 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	isub 
	iconst_0 
	invokestatic_lib int max( int, int ) // Math
	iload_1 
	iload_5 
	aload_6 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	iconst_1 
	iushr 
	isub 
	iadd 
	aload_6 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_6 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	aload_6 
	iconst_0 
	iconst_0 
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=8
	return 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	clinit_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	synch_static GroupPickerScreen
	clinit_wait 
	getstatic_lib module:WhatsApp-12.class#0.static_67 // class#0
	invokestatic_lib module:WhatsApp-32.class#2.routine_1983(  ) // class#2
	putstatic com.whatsapp.client.GroupPickerScreen.field_52524 // GroupPickerScreen
	getstatic_lib module:WhatsApp-12.class#0.static_68 // class#0
	invokestatic_lib module:WhatsApp-32.class#2.routine_1983(  ) // class#2
	putstatic com.whatsapp.client.GroupPickerScreen.field_52530 // GroupPickerScreen
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final keywordFieldChanged( com.whatsapp.client.GroupPickerScreen ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.GroupPickerScreen.field_52496   // get_name_1:  com.whatsapp.client.GroupPickerScreen.field_52496   // get_name_2:  com.whatsapp.client.GroupPickerScreen.field_52496   // get_Name:    com.whatsapp.client.GroupPickerScreen.field_52496   // getName->1:     // getName->2:     // getName->N:     // ofs = 52496 ord = 4 addr = 0
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	astore_1 
	aload_1 
	ifnonnull Label7
	return 
Label7:
	aload_0_getfield com.whatsapp.client.GroupPickerScreen.field_52520   // get_name_1:  com.whatsapp.client.GroupPickerScreen.field_52520   // get_name_2:  com.whatsapp.client.GroupPickerScreen.field_52520   // get_Name:    com.whatsapp.client.GroupPickerScreen.field_52520   // getName->1:     // getName->2:     // getName->N:     // ofs = 52520 ord = 10 addr = 0
	ifnull Label14
	aload_0_getfield com.whatsapp.client.GroupPickerScreen.field_52520   // get_name_1:  com.whatsapp.client.GroupPickerScreen.field_52520   // get_name_2:  com.whatsapp.client.GroupPickerScreen.field_52520   // get_Name:    com.whatsapp.client.GroupPickerScreen.field_52520   // getName->1:     // getName->2:     // getName->N:     // ofs = 52520 ord = 10 addr = 0
	aload_1 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label14
	return 
Label14:
	aload_0 
	aload_1 
	putfield com.whatsapp.client.GroupPickerScreen.field_52520   // get_name_1:  com.whatsapp.client.GroupPickerScreen.field_52520   // get_name_2:  com.whatsapp.client.GroupPickerScreen.field_52520   // get_Name:    com.whatsapp.client.GroupPickerScreen.field_52520   // getName->1:     // getName->2:     // getName->N:     // ofs = 52520 ord = 10 addr = 0
	aload_0 
	invokespecial com.whatsapp.client.GroupPickerScreen.routine_370 // pc=1
	aload_0_getfield com.whatsapp.client.GroupPickerScreen.field_52500   // get_name_1:  com.whatsapp.client.GroupPickerScreen.field_52500   // get_name_2:  com.whatsapp.client.GroupPickerScreen.field_52500   // get_Name:    com.whatsapp.client.GroupPickerScreen.field_52500   // getName->1:     // getName->2:     // getName->N:     // ofs = 52500 ord = 5 addr = 0
	invokevirtual invalidate( net.rim.device.api.ui.component.ListField ) // pc=1
	return 
	}


private final com.whatsapp.client.GroupPickerScreen.routine_370( com.whatsapp.client.GroupPickerScreen ); // address: 0
	{
	enter 
	aload_0_getfield _filteredGroups   // get_name_1:  _filteredGroups   // get_name_2:  _filteredGroups   // get_Name:    _filteredGroups   // getName->1:  _filteredGroups   // getName->2:  _filteredGroups   // getName->N:  _filteredGroups   // ofs = 52488 ord = 2 addr = 0
	invokevirtual removeAllElements( java.util.Vector ) // pc=1
	aload_0_getfield com.whatsapp.client.GroupPickerScreen.field_52480   // get_name_1:  com.whatsapp.client.GroupPickerScreen.field_52480   // get_name_2:  com.whatsapp.client.GroupPickerScreen.field_52480   // get_Name:    com.whatsapp.client.GroupPickerScreen.field_52480   // getName->1:     // getName->2:     // getName->N:     // ofs = 52480 ord = 0 addr = 0
	ifnull Label8
	aload_0_getfield com.whatsapp.client.GroupPickerScreen.field_52480   // get_name_1:  com.whatsapp.client.GroupPickerScreen.field_52480   // get_name_2:  com.whatsapp.client.GroupPickerScreen.field_52480   // get_Name:    com.whatsapp.client.GroupPickerScreen.field_52480   // getName->1:     // getName->2:     // getName->N:     // ofs = 52480 ord = 0 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	ifne Label12
Label8:
	aload_0_getfield com.whatsapp.client.GroupPickerScreen.field_52500   // get_name_1:  com.whatsapp.client.GroupPickerScreen.field_52500   // get_name_2:  com.whatsapp.client.GroupPickerScreen.field_52500   // get_Name:    com.whatsapp.client.GroupPickerScreen.field_52500   // getName->1:     // getName->2:     // getName->N:     // ofs = 52500 ord = 5 addr = 0
	iconst_1 
	invokevirtual setSize( net.rim.device.api.ui.component.ListField, int ) // pc=2
	return 
Label12:
	aload_0_getfield com.whatsapp.client.GroupPickerScreen.field_52480   // get_name_1:  com.whatsapp.client.GroupPickerScreen.field_52480   // get_name_2:  com.whatsapp.client.GroupPickerScreen.field_52480   // get_Name:    com.whatsapp.client.GroupPickerScreen.field_52480   // getName->1:     // getName->2:     // getName->N:     // ofs = 52480 ord = 0 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_1 
	aload_0_getfield com.whatsapp.client.GroupPickerScreen.field_52520   // get_name_1:  com.whatsapp.client.GroupPickerScreen.field_52520   // get_name_2:  com.whatsapp.client.GroupPickerScreen.field_52520   // get_Name:    com.whatsapp.client.GroupPickerScreen.field_52520   // getName->1:     // getName->2:     // getName->N:     // ofs = 52520 ord = 10 addr = 0
	ifnull Label21
	aload_0_getfield com.whatsapp.client.GroupPickerScreen.field_52520   // get_name_1:  com.whatsapp.client.GroupPickerScreen.field_52520   // get_name_2:  com.whatsapp.client.GroupPickerScreen.field_52520   // get_Name:    com.whatsapp.client.GroupPickerScreen.field_52520   // getName->1:     // getName->2:     // getName->N:     // ofs = 52520 ord = 10 addr = 0
	invokenonvirtual_lib java.lang.String.trim // pc=1
	stringlength 
	ifne Label40
Label21:
	iconst_0 
	istore_2 
Label23:
	iload_2 
	iload_1 
	if_icmpge Label33
	aload_0_getfield _filteredGroups   // get_name_1:  _filteredGroups   // get_name_2:  _filteredGroups   // get_Name:    _filteredGroups   // getName->1:  _filteredGroups   // getName->2:  _filteredGroups   // getName->N:  _filteredGroups   // ofs = 52488 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.client.GroupPickerScreen.field_52480   // get_name_1:  com.whatsapp.client.GroupPickerScreen.field_52480   // get_name_2:  com.whatsapp.client.GroupPickerScreen.field_52480   // get_Name:    com.whatsapp.client.GroupPickerScreen.field_52480   // getName->1:     // getName->2:     // getName->N:     // ofs = 52480 ord = 0 addr = 0
	iload_2 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	iinc 2 1
	goto Label23
Label33:
	aload_0_getfield com.whatsapp.client.GroupPickerScreen.field_52500   // get_name_1:  com.whatsapp.client.GroupPickerScreen.field_52500   // get_name_2:  com.whatsapp.client.GroupPickerScreen.field_52500   // get_Name:    com.whatsapp.client.GroupPickerScreen.field_52500   // getName->1:     // getName->2:     // getName->N:     // ofs = 52500 ord = 5 addr = 0
	aload_0_getfield _filteredGroups   // get_name_1:  _filteredGroups   // get_name_2:  _filteredGroups   // get_Name:    _filteredGroups   // getName->1:  _filteredGroups   // getName->2:  _filteredGroups   // getName->N:  _filteredGroups   // ofs = 52488 ord = 2 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	iconst_1 
	iadd 
	invokevirtual setSize( net.rim.device.api.ui.component.ListField, int ) // pc=2
	return 
Label40:
	new_lib net.rim.device.api.ui.Field//net.rim.device.api.ui.Field net.rim.device.api.ui.Field net.rim.device.api.ui.Field
	dup 
	aload_0_getfield com.whatsapp.client.GroupPickerScreen.field_52520   // get_name_1:  com.whatsapp.client.GroupPickerScreen.field_52520   // get_name_2:  com.whatsapp.client.GroupPickerScreen.field_52520   // get_Name:    com.whatsapp.client.GroupPickerScreen.field_52520   // getName->1:     // getName->2:     // getName->N:     // ofs = 52520 ord = 10 addr = 0
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	astore_2 
	aload_2 
	iconst_0 
	aload_2 
	invokevirtual int length( java.lang.StringBuffer ) // pc=1
	invokestatic_lib convertToOriginal( java.lang.StringBuffer, int, int ) // StringUtilities
	aload_2 
	invokevirtual_short .toString // idx=2 pc=1
	invokenonvirtual_lib java.lang.String.trim // pc=1
	invokenonvirtual_lib java.lang.String.toLowerCase // pc=1
	astore_3 
	iconst_0 
	istore_4 
Label57:
	iload_4 
	iload_1 
	if_icmpge Label74
	aload_0_getfield com.whatsapp.client.GroupPickerScreen.field_52484   // get_name_1:  com.whatsapp.client.GroupPickerScreen.field_52484   // get_name_2:  com.whatsapp.client.GroupPickerScreen.field_52484   // get_Name:    com.whatsapp.client.GroupPickerScreen.field_52484   // getName->1:     // getName->2:     // getName->N:     // ofs = 52484 ord = 1 addr = 0
	iload_4 
	aaload 
	aload_3 
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	bipush -1
	if_icmpeq Label72
	aload_0_getfield _filteredGroups   // get_name_1:  _filteredGroups   // get_name_2:  _filteredGroups   // get_Name:    _filteredGroups   // getName->1:  _filteredGroups   // getName->2:  _filteredGroups   // getName->N:  _filteredGroups   // ofs = 52488 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.client.GroupPickerScreen.field_52480   // get_name_1:  com.whatsapp.client.GroupPickerScreen.field_52480   // get_name_2:  com.whatsapp.client.GroupPickerScreen.field_52480   // get_Name:    com.whatsapp.client.GroupPickerScreen.field_52480   // getName->1:     // getName->2:     // getName->N:     // ofs = 52480 ord = 0 addr = 0
	iload_4 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label72:
	iinc 4 1
	goto Label57
Label74:
	aload_0_getfield _filteredGroups   // get_name_1:  _filteredGroups   // get_name_2:  _filteredGroups   // get_Name:    _filteredGroups   // getName->1:  _filteredGroups   // getName->2:  _filteredGroups   // getName->N:  _filteredGroups   // ofs = 52488 ord = 2 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	ifne Label81
	aload_0_getfield com.whatsapp.client.GroupPickerScreen.field_52500   // get_name_1:  com.whatsapp.client.GroupPickerScreen.field_52500   // get_name_2:  com.whatsapp.client.GroupPickerScreen.field_52500   // get_Name:    com.whatsapp.client.GroupPickerScreen.field_52500   // getName->1:     // getName->2:     // getName->N:     // ofs = 52500 ord = 5 addr = 0
	iconst_0 
	invokevirtual setSize( net.rim.device.api.ui.component.ListField, int ) // pc=2
	return 
Label81:
	aload_0_getfield com.whatsapp.client.GroupPickerScreen.field_52500   // get_name_1:  com.whatsapp.client.GroupPickerScreen.field_52500   // get_name_2:  com.whatsapp.client.GroupPickerScreen.field_52500   // get_Name:    com.whatsapp.client.GroupPickerScreen.field_52500   // getName->1:     // getName->2:     // getName->N:     // ofs = 52500 ord = 5 addr = 0
	aload_0_getfield _filteredGroups   // get_name_1:  _filteredGroups   // get_name_2:  _filteredGroups   // get_Name:    _filteredGroups   // getName->1:  _filteredGroups   // getName->2:  _filteredGroups   // getName->N:  _filteredGroups   // ofs = 52488 ord = 2 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	iconst_1 
	iadd 
	invokevirtual setSize( net.rim.device.api.ui.component.ListField, int ) // pc=2
	return 
	}


private final listFieldDrawListRow( com.whatsapp.client.GroupPickerScreen, com.whatsapp.client.NonCachingListField, net.rim.device.api.ui.Graphics, int, int, int, boolean ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual int getRowHeight( net.rim.device.api.ui.component.ListField ) // pc=1
	istore_7 
	aload_2 
	invokevirtual int getColor( net.rim.device.api.ui.Graphics ) // pc=1
	istore 8
	iload_6 
	ifne Label29
	iload_3 
	bipush 2
	irem 
	ifne Label15
	iipush 16777215
	goto Label16
Label15:
	iipush 15987699
Label16:
	istore 9
	aload_2 
	iload 9
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_2 
	iconst_0 
	iload_4 
	iload_5 
	iload_7 
	invokevirtual fillRect( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	aload_2 
	iload 8
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
Label29:
	aload_2 
	iipush 13882323
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_2 
	iconst_0 
	iload_4 
	iload_5 
	iload_4 
	invokevirtual drawLine( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	iload_3 
	aload_0_getfield com.whatsapp.client.GroupPickerScreen.field_52500   // get_name_1:  com.whatsapp.client.GroupPickerScreen.field_52500   // get_name_2:  com.whatsapp.client.GroupPickerScreen.field_52500   // get_Name:    com.whatsapp.client.GroupPickerScreen.field_52500   // getName->1:     // getName->2:     // getName->N:     // ofs = 52500 ord = 5 addr = 0
	invokevirtual int getSize( net.rim.device.api.ui.component.ListField ) // pc=1
	iconst_1 
	isub 
	if_icmpne Label58
	aload_2 
	iconst_0 
	iload_4 
	iload_7 
	iadd 
	iconst_1 
	isub 
	iload_5 
	iload_4 
	iload_7 
	iadd 
	iconst_1 
	isub 
	invokevirtual drawLine( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
Label58:
	aload_2 
	iload 8
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	iload_3 
	ifne Label71
	aload_0 
	aload_1 
	aload_2 
	iload_4 
	iload_5 
	iload_6 
	invokespecial com.whatsapp.client.GroupPickerScreen.routine_851 // pc=6
	return 
Label71:
	iinc 3 -1
	aload_0_getfield _filteredGroups   // get_name_1:  _filteredGroups   // get_name_2:  _filteredGroups   // get_Name:    _filteredGroups   // getName->1:  _filteredGroups   // getName->2:  _filteredGroups   // getName->N:  _filteredGroups   // ofs = 52488 ord = 2 addr = 0
	iload_3 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.ChatHistory//module:WhatsApp-9.class#17 module:WhatsApp-9.class#17 module:WhatsApp-9.class#17
	astore 9
	aload_0_getfield com.whatsapp.client.GroupPickerScreen.field_52492   // get_name_1:  com.whatsapp.client.GroupPickerScreen.field_52492   // get_name_2:  com.whatsapp.client.GroupPickerScreen.field_52492   // get_Name:    com.whatsapp.client.GroupPickerScreen.field_52492   // getName->1:     // getName->2:     // getName->N:     // ofs = 52492 ord = 3 addr = 0
	aload 9
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore 10
	aload 10
	ifnonnull Label93
	aload 9
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokenonvirtual_lib .routine_489 // pc=1
	astore 10
	aload_0_getfield com.whatsapp.client.GroupPickerScreen.field_52492   // get_name_1:  com.whatsapp.client.GroupPickerScreen.field_52492   // get_name_2:  com.whatsapp.client.GroupPickerScreen.field_52492   // get_Name:    com.whatsapp.client.GroupPickerScreen.field_52492   // getName->1:     // getName->2:     // getName->N:     // ofs = 52492 ord = 3 addr = 0
	aload 9
	aload 10
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
Label93:
	aload_2 
	aload 9
	getstatic_lib module:WhatsApp-13.class#3.static_13 // class#3
	invokenonvirtual_lib .routine_7390 // pc=2
	aload 9
	invokenonvirtual_lib .routine_7647 // pc=1
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	aconst_null 
	aconst_null 
	aload 10
	iconst_0 
	aload_0_getfield com.whatsapp.client.GroupPickerScreen.field_52504   // get_name_1:  com.whatsapp.client.GroupPickerScreen.field_52504   // get_name_2:  com.whatsapp.client.GroupPickerScreen.field_52504   // get_Name:    com.whatsapp.client.GroupPickerScreen.field_52504   // getName->1:     // getName->2:     // getName->N:     // ofs = 52504 ord = 6 addr = 0
	aload_2 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Graphics ) // pc=1
	aload_0_getfield com.whatsapp.client.GroupPickerScreen.field_52508   // get_name_1:  com.whatsapp.client.GroupPickerScreen.field_52508   // get_name_2:  com.whatsapp.client.GroupPickerScreen.field_52508   // get_Name:    com.whatsapp.client.GroupPickerScreen.field_52508   // getName->1:     // getName->2:     // getName->N:     // ofs = 52508 ord = 7 addr = 0
	iload_6 
	ifeq Label112
	aconst_null 
	goto Label116
Label112:
	new_lib Integer//java.lang.Integer java.lang.Integer java.lang.Integer
	dup 
	iipush 5066061
	invokespecial_lib java.lang.Integer.<init> // pc=2
Label116:
	iload_4 
	getstatic_lib module:WhatsApp-13.class#3.static_13 // class#3
	iload_5 
	iload_7 
	iload_6 
	invokestatic drawPhotoAndText( net.rim.device.api.ui.Graphics, net.rim.device.api.system.Bitmap, java.lang.String, java.lang.String, net.rim.device.api.system.Bitmap, net.rim.device.api.system.Bitmap, java.lang.String, boolean, net.rim.device.api.ui.Font, net.rim.device.api.ui.Font, net.rim.device.api.ui.Font, java.lang.Integer, int, int, int, int, boolean ) // IconTextField
	return 
	}


private final com.whatsapp.client.GroupPickerScreen.routine_851( com.whatsapp.client.GroupPickerScreen, com.whatsapp.client.NonCachingListField, net.rim.device.api.ui.Graphics, int, int, boolean ); // address: 0
	{
	enter 
	iload_4 
	bipush 60
	isub 
	istore_6 
	aload_1 
	invokevirtual int getRowHeight( net.rim.device.api.ui.component.ListField ) // pc=1
	istore_7 
	aload_2 
	iload_3 
	iload_4 
	iload_7 
	iload_5 
	invokestatic com.whatsapp.client.GroupPickerScreen.routine_1321( net.rim.device.api.ui.Graphics, int, int, int, boolean ) // GroupPickerScreen
	aload_2 
	bipush 60
	iconst_0 
	iload_6 
	bipush 30
	isub 
	iipush 2147483647
	iconst_0 
	iconst_0 
	invokevirtual boolean pushRegion( net.rim.device.api.ui.Graphics, int, int, int, int, int, int ) // pc=7
	pop 
	aload_2 
	aconst_null 
	sipush 851
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	aconst_null 
	aload_0_getfield com.whatsapp.client.GroupPickerScreen.field_52504   // get_name_1:  com.whatsapp.client.GroupPickerScreen.field_52504   // get_name_2:  com.whatsapp.client.GroupPickerScreen.field_52504   // get_Name:    com.whatsapp.client.GroupPickerScreen.field_52504   // getName->1:     // getName->2:     // getName->N:     // ofs = 52504 ord = 6 addr = 0
	iconst_1 
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int ) // pc=2
	aload_0_getfield com.whatsapp.client.GroupPickerScreen.field_52508   // get_name_1:  com.whatsapp.client.GroupPickerScreen.field_52508   // get_name_2:  com.whatsapp.client.GroupPickerScreen.field_52508   // get_Name:    com.whatsapp.client.GroupPickerScreen.field_52508   // getName->1:     // getName->2:     // getName->N:     // ofs = 52508 ord = 7 addr = 0
	aconst_null 
	aconst_null 
	iload_3 
	getstatic_lib module:WhatsApp-13.class#3.static_13 // class#3
	iload_6 
	iload_7 
	iload_5 
	invokestatic drawPhotoAndText( net.rim.device.api.ui.Graphics, net.rim.device.api.system.Bitmap, java.lang.String, java.lang.String, java.lang.String, net.rim.device.api.ui.Font, net.rim.device.api.ui.Font, net.rim.device.api.ui.Font, java.lang.Integer, int, int, int, int, boolean ) // IconTextField
	aload_2 
	invokevirtual popContext( net.rim.device.api.ui.Graphics ) // pc=1
	return 
	}


private final com.whatsapp.client.GroupPickerScreen.routine_947( com.whatsapp.client.GroupPickerScreen ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.GroupPickerScreen.field_52500   // get_name_1:  com.whatsapp.client.GroupPickerScreen.field_52500   // get_name_2:  com.whatsapp.client.GroupPickerScreen.field_52500   // get_Name:    com.whatsapp.client.GroupPickerScreen.field_52500   // getName->1:     // getName->2:     // getName->N:     // ofs = 52500 ord = 5 addr = 0
	invokevirtual int getSelectedIndex( net.rim.device.api.ui.component.ListField ) // pc=1
	istore_1 
	iload_1 
	ifge Label7
	return 
Label7:
	iload_1 
	ifne Label15
	aload_0 
	aconst_null 
	putfield com.whatsapp.client.GroupPickerScreen.field_52516   // get_name_1:  com.whatsapp.client.GroupPickerScreen.field_52516   // get_name_2:  com.whatsapp.client.GroupPickerScreen.field_52516   // get_Name:    com.whatsapp.client.GroupPickerScreen.field_52516   // getName->1:     // getName->2:     // getName->N:     // ofs = 52516 ord = 9 addr = 0
	aload_0 
	invokevirtual close( net.rim.device.api.ui.Screen ) // pc=1
	return 
Label15:
	iload_1 
	iconst_1 
	isub 
	istore_2 
	aload_0 
	aload_0_getfield _filteredGroups   // get_name_1:  _filteredGroups   // get_name_2:  _filteredGroups   // get_Name:    _filteredGroups   // getName->1:  _filteredGroups   // getName->2:  _filteredGroups   // getName->N:  _filteredGroups   // ofs = 52488 ord = 2 addr = 0
	iload_2 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.ChatHistory//module:WhatsApp-9.class#17 module:WhatsApp-9.class#17 module:WhatsApp-9.class#17
	putfield com.whatsapp.client.GroupPickerScreen.field_52516   // get_name_1:  com.whatsapp.client.GroupPickerScreen.field_52516   // get_name_2:  com.whatsapp.client.GroupPickerScreen.field_52516   // get_Name:    com.whatsapp.client.GroupPickerScreen.field_52516   // getName->1:     // getName->2:     // getName->N:     // ofs = 52516 ord = 9 addr = 0
	aload_0 
	iconst_0 
	invokevirtual fieldChangeNotify( net.rim.device.api.ui.Field, int ) // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final onUiEngineAttached( com.whatsapp.client.GroupPickerScreen, boolean ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	invokespecial_lib net.rim.device.api.ui.Screen.onUiEngineAttached // pc=2
	iload_1 
	ifeq Label9
	aload_0 
	aconst_null 
	putfield com.whatsapp.client.GroupPickerScreen.field_52516   // get_name_1:  com.whatsapp.client.GroupPickerScreen.field_52516   // get_name_2:  com.whatsapp.client.GroupPickerScreen.field_52516   // get_Name:    com.whatsapp.client.GroupPickerScreen.field_52516   // getName->1:     // getName->2:     // getName->N:     // ofs = 52516 ord = 9 addr = 0
Label9:
	return 
	}


protected final boolean keyChar( com.whatsapp.client.GroupPickerScreen, char, int, int ); // address: 0
	{
	enter 
	iload_1 
Label3:
	aload_0 
	invokespecial com.whatsapp.client.GroupPickerScreen.routine_947 // pc=1
	iconst_1 
	ireturn 
Label7:
	aload_0_getfield com.whatsapp.client.GroupPickerScreen.field_52496   // get_name_1:  com.whatsapp.client.GroupPickerScreen.field_52496   // get_name_2:  com.whatsapp.client.GroupPickerScreen.field_52496   // get_Name:    com.whatsapp.client.GroupPickerScreen.field_52496   // getName->1:     // getName->2:     // getName->N:     // ofs = 52496 ord = 4 addr = 0
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	invokespecial_lib net.rim.device.api.ui.Screen.keyChar // pc=4
	ireturn 
	}


protected final boolean navigationClick( com.whatsapp.client.GroupPickerScreen, int, int ); // address: 0
	{
	enter_narrow 
	invokestatic_lib boolean isSupported(  ) // Trackball
	ifne Label5
	invokestatic_lib boolean isSupported(  ) // Touchscreen
	ifeq Label9
Label5:
	aload_0 
	invokespecial com.whatsapp.client.GroupPickerScreen.routine_947 // pc=1
	iconst_1 
	ireturn 
Label9:
	aload_0 
	iload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.Screen.navigationClick // pc=3
	ireturn 
	}


public final setDirty( com.whatsapp.client.GroupPickerScreen, boolean ); // address: 0
	{
	noenter_return 
	}


public final setMuddy( com.whatsapp.client.GroupPickerScreen, boolean ); // address: 0
	{
	noenter_return 
	}


public final boolean isDirty( com.whatsapp.client.GroupPickerScreen ); // address: 0
	{
	ireturn_bipush 0
	}


public final boolean isMuddy( com.whatsapp.client.GroupPickerScreen ); // address: 0
	{
	ireturn_bipush 0
	}


public final setGroups( com.whatsapp.client.GroupPickerScreen, java.util.Vector ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	putfield com.whatsapp.client.GroupPickerScreen.field_52480   // get_name_1:  com.whatsapp.client.GroupPickerScreen.field_52480   // get_name_2:  com.whatsapp.client.GroupPickerScreen.field_52480   // get_Name:    com.whatsapp.client.GroupPickerScreen.field_52480   // getName->1:     // getName->2:     // getName->N:     // ofs = 52480 ord = 0 addr = 0
	aload_0_getfield com.whatsapp.client.GroupPickerScreen.field_52480   // get_name_1:  com.whatsapp.client.GroupPickerScreen.field_52480   // get_name_2:  com.whatsapp.client.GroupPickerScreen.field_52480   // get_Name:    com.whatsapp.client.GroupPickerScreen.field_52480   // getName->1:     // getName->2:     // getName->N:     // ofs = 52480 ord = 0 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_2 
	aload_0 
	iload_2 
	newarray_object_lib String//java.lang.String java.lang.String java.lang.String
	putfield com.whatsapp.client.GroupPickerScreen.field_52484   // get_name_1:  com.whatsapp.client.GroupPickerScreen.field_52484   // get_name_2:  com.whatsapp.client.GroupPickerScreen.field_52484   // get_Name:    com.whatsapp.client.GroupPickerScreen.field_52484   // getName->1:     // getName->2:     // getName->N:     // ofs = 52484 ord = 1 addr = 0
	new_lib net.rim.device.api.ui.Field//net.rim.device.api.ui.Field net.rim.device.api.ui.Field net.rim.device.api.ui.Field
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	astore_3 
	iconst_0 
	istore_4 
Label17:
	iload_4 
	iload_2 
	if_icmpge Label47
	aload_0_getfield com.whatsapp.client.GroupPickerScreen.field_52480   // get_name_1:  com.whatsapp.client.GroupPickerScreen.field_52480   // get_name_2:  com.whatsapp.client.GroupPickerScreen.field_52480   // get_Name:    com.whatsapp.client.GroupPickerScreen.field_52480   // getName->1:     // getName->2:     // getName->N:     // ofs = 52480 ord = 0 addr = 0
	iload_4 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.ChatHistory//module:WhatsApp-9.class#17 module:WhatsApp-9.class#17 module:WhatsApp-9.class#17
	astore_5 
	aload_3 
	iconst_0 
	invokevirtual setLength( java.lang.StringBuffer, int ) // pc=2
	aload_3 
	aload_5 
	invokenonvirtual_lib .routine_7647 // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_3 
	iconst_0 
	aload_3 
	invokevirtual int length( java.lang.StringBuffer ) // pc=1
	invokestatic_lib convertToOriginal( java.lang.StringBuffer, int, int ) // StringUtilities
	aload_0_getfield com.whatsapp.client.GroupPickerScreen.field_52484   // get_name_1:  com.whatsapp.client.GroupPickerScreen.field_52484   // get_name_2:  com.whatsapp.client.GroupPickerScreen.field_52484   // get_Name:    com.whatsapp.client.GroupPickerScreen.field_52484   // getName->1:     // getName->2:     // getName->N:     // ofs = 52484 ord = 1 addr = 0
	iload_4 
	aload_3 
	invokevirtual_short .toString // idx=2 pc=1
	invokenonvirtual_lib java.lang.String.trim // pc=1
	invokenonvirtual_lib java.lang.String.toLowerCase // pc=1
	aastore 
	iinc 4 1
	goto Label17
Label47:
	aload_0 
	invokespecial com.whatsapp.client.GroupPickerScreen.routine_370 // pc=1
	aload_0_getfield com.whatsapp.client.GroupPickerScreen.field_52500   // get_name_1:  com.whatsapp.client.GroupPickerScreen.field_52500   // get_name_2:  com.whatsapp.client.GroupPickerScreen.field_52500   // get_Name:    com.whatsapp.client.GroupPickerScreen.field_52500   // getName->1:     // getName->2:     // getName->N:     // ofs = 52500 ord = 5 addr = 0
	invokevirtual invalidate( net.rim.device.api.ui.component.ListField ) // pc=1
	return 
	}


public final module:WhatsApp-9.class#17 getSelectedChatHistory( com.whatsapp.client.GroupPickerScreen ); // address: 0
	{
	areturn_field com.whatsapp.client.GroupPickerScreen.field_52516   // get_name_1:  com.whatsapp.client.GroupPickerScreen.field_52516   // get_name_2:  com.whatsapp.client.GroupPickerScreen.field_52516   // get_Name:    com.whatsapp.client.GroupPickerScreen.field_52516   // getName->1:     // getName->2:     // getName->N:     // ofs = 52516 ord = 9 addr = 0
	}

}
