// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-13.cod
// Module version  : 2.7.3204
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


public class ContactDetailScreen extends com.whatsapp.field.WAMainScreen

{

	// @@@@@@@@@@@@@ Fields 
	private com.whatsapp.client.ContactInfoDetails /*module:WhatsApp.class#12*/  _contactInfoDetails ; // ofs = 53086 addr = 0)
	private boolean /*boolean*/  field_53090 ; // ofs = 53090 addr = 0)
	private com.whatsapp.client. /*module:WhatsApp-36.class#17*/  field_53094 ; // ofs = 53094 addr = 0)
	private com.whatsapp.client.WAMenuItem /*module:WhatsApp-36.class#17*/  field_53098 ; // ofs = 53098 addr = 0)
	private com.whatsapp.client.WAMenuItem /*module:WhatsApp-36.class#17*/  field_53102 ; // ofs = 53102 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_53106 ; // ofs = 53106 addr = 0)
	private net.rim.device.api.ui.component.NullField /*net.rim.device.api.ui.component.NullField*/  field_53110 ; // ofs = 53110 addr = 0)
	private net.rim.device.api.ui.component.NullField /*net.rim.device.api.ui.component.NullField*/  field_53114 ; // ofs = 53114 addr = 0)
	private net.rim.device.api.ui.component.LabelField /*net.rim.device.api.ui.component.LabelField*/  field_53118 ; // ofs = 53118 addr = 0)
	private com.whatsapp.client. /*module:WhatsApp-12.class#7*/  field_53122 ; // ofs = 53122 addr = 0)
	private com.whatsapp.client.ContactDetailScreen$SectionFieldManager /*module:WhatsApp-12.class#7*/  field_53126 ; // ofs = 53126 addr = 0)
	private com.whatsapp.client.ContactDetailScreen$SectionFieldManager /*module:WhatsApp-12.class#7*/  field_53130 ; // ofs = 53130 addr = 0)
	private com.whatsapp.client.ContactDetailScreen$SectionFieldManager /*module:WhatsApp-12.class#7*/  field_53134 ; // ofs = 53134 addr = 0)
	private com.whatsapp.client.ContactDetailScreen$SectionFieldManager /*module:WhatsApp-12.class#7*/  field_53138 ; // ofs = 53138 addr = 0)
	private final com.whatsapp.client.Worklist /*module:WhatsApp-36.class#24*/  field_53142 ; // ofs = 53142 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.ContactDetailScreen, module:WhatsApp.class#12 ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	iconst_0 
	invokespecial com.whatsapp.client.ContactDetailScreen.<init> // pc=3
	return 
	}


protected <init>( com.whatsapp.client.ContactDetailScreen, module:WhatsApp.class#12, boolean ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib .routine_249 // pc=1
	aload_0 
	new_lib com.whatsapp.client.Worklist//module:WhatsApp-36.class#24 module:WhatsApp-36.class#24 module:WhatsApp-36.class#24
	dup 
	invokespecial_lib .routine_9364 // pc=1
	putfield com.whatsapp.client.ContactDetailScreen.field_53142   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_53142   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_53142   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_53142   // getName->1:     // getName->2:     // getName->N:     // ofs = 53142 ord = 14 addr = 0
	aload_0 
	aload_1 
	putfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 53086 ord = 0 addr = 0
	aload_0 
	iload_2 
	putfield com.whatsapp.client.ContactDetailScreen.field_53090   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_53090   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_53090   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_53090   // getName->1:     // getName->2:     // getName->N:     // ofs = 53090 ord = 1 addr = 0
	aload_0 
	invokestatic_lib module:WhatsApp-35.class#0.routine_5461(  ) // class#0
	invokevirtual setTitleBar( net.rim.device.api.ui.Screen, net.rim.device.api.ui.component.TitleBar ) // pc=2
	aload_0 
	invokestatic_lib module:WhatsApp-7.class#22.routine_4386(  ) // class#22
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	aload_0 
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_469 // pc=1
	aload_0 
	invokenonvirtual com.whatsapp.client.ContactDetailScreen.populateContactData // pc=1
	aload_0 
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_2593 // pc=1
	return 
	}


static private com.whatsapp.client.ContactDetailScreen.routine_3507( java.lang.StringBuffer, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_1 
	ifnull Label18
	aload_1 
	invokenonvirtual_lib java.lang.String.trim // pc=1
	stringlength 
	ifle Label18
	aload_0 
	invokevirtual int length( java.lang.StringBuffer ) // pc=1
	ifle Label14
	aload_0 
	bipush 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
Label14:
	aload_0 
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label18:
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private com.whatsapp.client.ContactDetailScreen.routine_469( com.whatsapp.client.ContactDetailScreen ); // address: 0
	{
	enter 
	aload_0 
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_618 // pc=1
	aload_0 
	iconst_1 
	invokenonvirtual_lib .routine_89 // pc=2
	aload_0 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	lipush 18014398509481984
	invokespecial_lib net.rim.device.api.ui.component.NullField.<init> // pc=3
	putfield com.whatsapp.client.ContactDetailScreen.field_53110   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_53110   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_53110   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_53110   // getName->1:     // getName->2:     // getName->N:     // ofs = 53110 ord = 6 addr = 0
	aload_0 
	new_lib com.whatsapp.client.ContactDetailScreen$SectionFieldManager//module:WhatsApp-12.class#7 module:WhatsApp-12.class#7 module:WhatsApp-12.class#7
	dup 
	bipush -1
	iconst_1 
	invokespecial_lib .routine_2081 // pc=3
	putfield com.whatsapp.client.ContactDetailScreen.field_53122   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_53122   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_53122   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_53122   // getName->1:     // getName->2:     // getName->N:     // ofs = 53122 ord = 9 addr = 0
	aload_0 
	new_lib com.whatsapp.client.ContactDetailScreen$SectionFieldManager//module:WhatsApp-12.class#7 module:WhatsApp-12.class#7 module:WhatsApp-12.class#7
	dup 
	sipush 917
	iconst_1 
	invokespecial_lib .routine_2081 // pc=3
	putfield com.whatsapp.client.ContactDetailScreen.field_53126   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_53126   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_53126   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_53126   // getName->1:     // getName->2:     // getName->N:     // ofs = 53126 ord = 10 addr = 0
	aload_0 
	new_lib com.whatsapp.client.ContactDetailScreen$SectionFieldManager//module:WhatsApp-12.class#7 module:WhatsApp-12.class#7 module:WhatsApp-12.class#7
	dup 
	sipush 920
	iconst_1 
	invokespecial_lib .routine_2081 // pc=3
	putfield com.whatsapp.client.ContactDetailScreen.field_53130   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_53130   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_53130   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_53130   // getName->1:     // getName->2:     // getName->N:     // ofs = 53130 ord = 11 addr = 0
	aload_0 
	new_lib com.whatsapp.client.ContactDetailScreen$SectionFieldManager//module:WhatsApp-12.class#7 module:WhatsApp-12.class#7 module:WhatsApp-12.class#7
	dup 
	sipush 918
	iconst_0 
	invokespecial_lib .routine_2081 // pc=3
	putfield com.whatsapp.client.ContactDetailScreen.field_53134   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_53134   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_53134   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_53134   // getName->1:     // getName->2:     // getName->N:     // ofs = 53134 ord = 12 addr = 0
	aload_0 
	new_lib com.whatsapp.client.ContactDetailScreen$SectionFieldManager//module:WhatsApp-12.class#7 module:WhatsApp-12.class#7 module:WhatsApp-12.class#7
	dup 
	sipush 919
	iconst_1 
	invokespecial_lib .routine_2081 // pc=3
	putfield com.whatsapp.client.ContactDetailScreen.field_53138   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_53138   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_53138   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_53138   // getName->1:     // getName->2:     // getName->N:     // ofs = 53138 ord = 13 addr = 0
	aload_0 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	lipush 18014398509481984
	invokespecial_lib net.rim.device.api.ui.component.NullField.<init> // pc=3
	putfield com.whatsapp.client.ContactDetailScreen.field_53114   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_53114   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_53114   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_53114   // getName->1:     // getName->2:     // getName->N:     // ofs = 53114 ord = 7 addr = 0
	return 
	}


private com.whatsapp.client.ContactDetailScreen.routine_618( com.whatsapp.client.ContactDetailScreen ); // address: 0
	{
	enter 
	new_lib com.whatsapp.field.WAHorizontalFieldManager//com.whatsapp.field.WAHorizontalFieldManager com.whatsapp.field.WAHorizontalFieldManager com.whatsapp.field.WAHorizontalFieldManager
	dup 
	invokespecial_lib .routine_10870 // pc=1
	astore_1 
	aload_1 
	iconst_1 
	invokenonvirtual_lib .routine_9976 // pc=2
	aload_0 
	new_lib com.whatsapp.field.ColorLabelField//com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField
	dup 
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	iipush 16777215
	lipush 1152921504606847040
	invokespecial_lib .routine_3777 // pc=5
	putfield com.whatsapp.client.ContactDetailScreen.field_53118   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_53118   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_53118   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_53118   // getName->1:     // getName->2:     // getName->N:     // ofs = 53118 ord = 8 addr = 0
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_53118   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_53118   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_53118   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_53118   // getName->1:     // getName->2:     // getName->N:     // ofs = 53118 ord = 8 addr = 0
	bipush 12
	bipush 18
	bipush 12
	bipush 18
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_1 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_53118   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_53118   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_53118   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_53118   // getName->1:     // getName->2:     // getName->N:     // ofs = 53118 ord = 8 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_53090   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_53090   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_53090   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_53090   // getName->1:     // getName->2:     // getName->N:     // ofs = 53090 ord = 1 addr = 0
	ifeq Label76
	new_lib com.whatsapp.field.//module:WhatsApp-38.class#12 module:WhatsApp-38.class#12 module:WhatsApp-38.class#12
	dup 
	lipush 2305843009213693952
	invokespecial_lib .routine_9957 // pc=3
	astore_2 
	new_lib com.whatsapp.client.BitmapButtonField//com.whatsapp.client.BitmapButtonField com.whatsapp.client.BitmapButtonField com.whatsapp.client.BitmapButtonField
	dup 
	ldc literal_110:"plus.png"
	invokestatic_lib net.rim.device.api.system.Bitmap getBitmapResource( java.lang.String ) // Bitmap
	aconst_null 
	aconst_null 
	aconst_null 
	aconst_null 
	aconst_null 
	lipush 51539607552
	invokespecial_lib .routine_3085 // pc=9
	astore_3 
	aload_3 
	iconst_0 
	invokenonvirtual_lib .routine_1953 // pc=2
	aload_3 
	iconst_0 
	bipush 3
	iconst_0 
	bipush 3
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_3 
	ldc literal_111:"narrow-hover.png"
	invokestatic_lib net.rim.device.api.system.Bitmap getBitmapResource( java.lang.String ) // Bitmap
	new_lib net.rim.blackberry.api.homescreen.Shortcut//net.rim.blackberry.api.homescreen.Shortcut net.rim.blackberry.api.homescreen.Shortcut net.rim.blackberry.api.homescreen.Shortcut
	dup 
	iconst_0 
	bipush 10
	iconst_0 
	bipush 10
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=5
	invokenonvirtual_lib .routine_1964 // pc=3
	aload_3 
	new_lib com.whatsapp.client.//module:WhatsApp-11.class#21 module:WhatsApp-11.class#21 module:WhatsApp-11.class#21
	dup 
	aload_0 
	invokespecial_lib .routine_6940 // pc=2
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_1 
	aload_2 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_1 
	aload_3 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
Label76:
	aload_1 
	invokestatic_lib module:WhatsApp-35.class#0.routine_5692(  ) // class#0
	aload_1 
	aconst_null 
	invokevirtual setBorder( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Border ) // pc=2
	aload_1 
	iconst_0 
	iconst_0 
	iconst_0 
	iconst_0 
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_1 
	iconst_0 
	iconst_0 
	iconst_0 
	iconst_0 
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	aload_1 
	invokenonvirtual_lib .routine_64 // pc=2
	return 
	}


private com.whatsapp.client.ContactDetailScreen.routine_864( com.whatsapp.client.ContactDetailScreen ); // address: 0
	{
	enter_narrow 
	iconst_0 
	istore_1 
	invokestatic_lib net.rim.device.api.system.RuntimeStore getRuntimeStore(  ) // RuntimeStore
	lipush 8535665252065932813
	invokevirtual java.lang.Object get( net.rim.device.api.system.RuntimeStore, long ) // pc=3
	checkcast ContactInfo
	astore_2 
	aload_2 
	ifnull Label13
	aload_2 
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	istore_1 
Label13:
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_53118   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_53118   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_53118   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_53118   // getName->1:     // getName->2:     // getName->N:     // ofs = 53118 ord = 8 addr = 0
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 53086 ord = 0 addr = 0
	iload_1 
	invokenonvirtual_lib .routine_6025 // pc=2
	invokevirtual setText( net.rim.device.api.ui.component.LabelField, java.lang.Object ) // pc=2
	return 
	}


private com.whatsapp.client.ContactDetailScreen.routine_924( com.whatsapp.client.ContactDetailScreen ); // address: 0
	{
	enter 
	new_lib net.rim.device.api.system.RuntimeStore//net.rim.device.api.system.RuntimeStore net.rim.device.api.system.RuntimeStore net.rim.device.api.system.RuntimeStore
	dup 
	lipush 1152921508901814272
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.<init> // pc=3
	astore_1 
	aload_0 
	aload_1 
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 53086 ord = 0 addr = 0
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_1040 // pc=3
	aload_0 
	aload_1 
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 53086 ord = 0 addr = 0
	getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_1040 // pc=3
	new_lib net.rim.device.api.i18n.ResourceBundle//net.rim.device.api.i18n.ResourceBundle net.rim.device.api.i18n.ResourceBundle net.rim.device.api.i18n.ResourceBundle
	dup 
	aload_0 
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_1129 // pc=1
	lipush 36028797018963968
	invokespecial_lib net.rim.device.api.ui.component.BitmapField.<init> // pc=4
	astore_2 
	new_lib com.whatsapp.field.WAHorizontalFieldManager//com.whatsapp.field.WAHorizontalFieldManager com.whatsapp.field.WAHorizontalFieldManager com.whatsapp.field.WAHorizontalFieldManager
	dup 
	invokespecial_lib .routine_10870 // pc=1
	astore_3 
	aload_3 
	iconst_1 
	invokenonvirtual_lib .routine_9976 // pc=2
	aload_3 
	aload_1 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_3 
	aload_2 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_53122   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_53122   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_53122   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_53122   // getName->1:     // getName->2:     // getName->N:     // ofs = 53122 ord = 9 addr = 0
	aload_3 
	invokenonvirtual_lib .routine_1632 // pc=2
	return 
	}


private com.whatsapp.client.ContactDetailScreen.routine_1040( com.whatsapp.client.ContactDetailScreen, net.rim.device.api.ui.container.VerticalFieldManager, java.lang.String ); // address: 0
	{
	enter 
	aload_2 
	ifnull Label30
	aload_2 
	invokenonvirtual_lib java.lang.String.trim // pc=1
	stringlength 
	ifle Label30
	new_lib com.whatsapp.field.ColorLabelField//com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField
	dup 
	aload_2 
	iipush 5265246
	lipush 36028797018963968
	invokespecial_lib .routine_3777 // pc=5
	astore_3 
	aload_1 
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	ifle Label27
	aload_3 
	aload_3 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	invokevirtual int getAscent( net.rim.device.api.ui.Font ) // pc=1
	iconst_1 
	iushr 
	iconst_0 
	iconst_0 
	iconst_0 
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
Label27:
	aload_1 
	aload_3 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
Label30:
	return 
	}


private net.rim.device.api.system.Bitmap com.whatsapp.client.ContactDetailScreen.routine_1129( com.whatsapp.client.ContactDetailScreen ); // address: 0
	{
	enter 
	getstatic PHOTO_HEIGHT // ContactShortcuts
	istore_1 
	aconst_null 
	astore_2 
	invokestatic_lib net.rim.device.api.system.RuntimeStore getRuntimeStore(  ) // RuntimeStore
	lipush 8535665252065932813
	invokevirtual java.lang.Object get( net.rim.device.api.system.RuntimeStore, long ) // pc=3
	checkcast ContactInfo
	astore_3 
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 53086 ord = 0 addr = 0
	ifnull Label23
	aload_3 
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 53086 ord = 0 addr = 0
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_1 
	iload_1 
	invokenonvirtual com.whatsapp.client.ContactInfo.getPhotoForUID // pc=4
	astore_4 
	aload_4 
	ifnull Label23
	aload_4 
	astore_2 
Label23:
	aload_2 
	ifnull Label27
	aload_2 
	areturn 
Label27:
	getstatic SOURCE_CONTACT_PHOTO // ContactShortcuts
	iload_1 
	iload_1 
	getstatic DEFAULT_CONTACT_PHOTO // ContactShortcuts
	invokestatic net.rim.device.api.system.Bitmap scalePhoto( net.rim.device.api.system.Bitmap, int, int, net.rim.device.api.system.Bitmap ) // ContactShortcuts
	areturn 
	}


private com.whatsapp.client.ContactDetailScreen.routine_1217( com.whatsapp.client.ContactDetailScreen ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_53126   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_53126   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_53126   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_53126   // getName->1:     // getName->2:     // getName->N:     // ofs = 53126 ord = 10 addr = 0
	invokenonvirtual_lib .routine_1615 // pc=1
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 53086 ord = 0 addr = 0
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	astore_1 
	aload_1 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_2 
	iload_2 
	ifne Label12
	return 
Label12:
	iconst_0 
	istore_3 
Label14:
	iload_3 
	iload_2 
	if_icmpge Label45
	bipush 22
	sipush 130
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	astore_4 
	aload_1 
	iload_3 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore_5 
	new_lib net.rim.device.api.ui.MenuItem//net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem
	dup 
	aload_5 
	lipush 18014407099416576
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=4
	astore_6 
	aload_6 
	new_lib com.whatsapp.client.ContactDetailScreen$EmailCookie//module:WhatsApp-12.class#5 module:WhatsApp-12.class#5 module:WhatsApp-12.class#5
	dup 
	aload_5 
	invokespecial_lib .routine_1506 // pc=2
	invokevirtual setCookie( net.rim.device.api.ui.Field, java.lang.Object ) // pc=2
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_53126   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_53126   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_53126   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_53126   // getName->1:     // getName->2:     // getName->N:     // ofs = 53126 ord = 10 addr = 0
	aload_4 
	aload_6 
	invokenonvirtual_lib .routine_1666 // pc=3
	iinc 3 1
	goto Label14
Label45:
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_53126   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_53126   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_53126   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_53126   // getName->1:     // getName->2:     // getName->N:     // ofs = 53126 ord = 10 addr = 0
	iload_2 
	invokestatic_lib java.lang.String toString( int ) // Integer
	invokenonvirtual_lib .routine_1559 // pc=2
	return 
	}


private com.whatsapp.client.ContactDetailScreen.routine_1349( com.whatsapp.client.ContactDetailScreen ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_53130   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_53130   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_53130   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_53130   // getName->1:     // getName->2:     // getName->N:     // ofs = 53130 ord = 11 addr = 0
	invokenonvirtual_lib .routine_1615 // pc=1
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 53086 ord = 0 addr = 0
	invokestatic java.util.Hashtable getStatuses(  ) // ContactStatuses
	invokenonvirtual_lib .routine_6447 // pc=2
	ifeq Label8
	return 
Label8:
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 53086 ord = 0 addr = 0
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokevirtual int size( java.util.Vector ) // pc=1
	ifne Label17
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 53086 ord = 0 addr = 0
	invokenonvirtual_lib .routine_6872 // pc=1
	invokevirtual int size( net.rim.device.api.util.IntVector ) // pc=1
	ifne Label17
	return 
Label17:
	new_lib net.rim.device.api.ui.Font//net.rim.device.api.ui.Font net.rim.device.api.ui.Font net.rim.device.api.ui.Font
	dup 
	sipush 921
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	lipush 12884967424
	invokespecial_lib net.rim.device.api.ui.component.ButtonField.<init> // pc=4
	astore_1 
	aload_1 
	new_lib com.whatsapp.client.ContactDetailScreen$2//module:WhatsApp-11.class#24 module:WhatsApp-11.class#24 module:WhatsApp-11.class#24
	dup 
	aload_0 
	invokespecial_lib .routine_7161 // pc=2
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_53130   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_53130   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_53130   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_53130   // getName->1:     // getName->2:     // getName->N:     // ofs = 53130 ord = 11 addr = 0
	aload_1 
	invokenonvirtual_lib .routine_1632 // pc=2
	return 
	}


private com.whatsapp.client.ContactDetailScreen.routine_1460( com.whatsapp.client.ContactDetailScreen ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_53134   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_53134   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_53134   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_53134   // getName->1:     // getName->2:     // getName->N:     // ofs = 53134 ord = 12 addr = 0
	invokenonvirtual_lib .routine_1615 // pc=1
	invokestatic java.util.Hashtable getStatuses(  ) // ContactStatuses
	astore_1 
	aload_0 
	aload_1 
	bipush 57
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 53086 ord = 0 addr = 0
	getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	bipush 3
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_1647 // pc=5
	aload_0 
	aload_1 
	bipush 58
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 53086 ord = 0 addr = 0
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	bipush 4
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_1647 // pc=5
	aload_0 
	aload_1 
	bipush 59
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 53086 ord = 0 addr = 0
	getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	iconst_1 
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_1647 // pc=5
	aload_0 
	aload_1 
	bipush 60
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 53086 ord = 0 addr = 0
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	bipush 2
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_1647 // pc=5
	aload_0 
	aload_1 
	bipush 61
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 53086 ord = 0 addr = 0
	getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	iconst_0 
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_1647 // pc=5
	aload_0 
	aload_1 
	sipush 354
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 53086 ord = 0 addr = 0
	getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	bipush 8
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_1647 // pc=5
	aload_0 
	aload_1 
	bipush 62
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 53086 ord = 0 addr = 0
	getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	bipush 5
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_1647 // pc=5
	aload_0 
	aload_1 
	bipush 63
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 53086 ord = 0 addr = 0
	getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	bipush 6
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_1647 // pc=5
	aload_0 
	aload_1 
	sipush 355
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 53086 ord = 0 addr = 0
	getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	bipush 9
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_1647 // pc=5
	aload_0 
	aload_1 
	bipush 64
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 53086 ord = 0 addr = 0
	getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	bipush 7
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_1647 // pc=5
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_53134   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_53134   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_53134   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_53134   // getName->1:     // getName->2:     // getName->N:     // ofs = 53134 ord = 12 addr = 0
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_53134   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_53134   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_53134   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_53134   // getName->1:     // getName->2:     // getName->N:     // ofs = 53134 ord = 12 addr = 0
	invokenonvirtual_lib .routine_1957 // pc=1
	invokestatic_lib java.lang.String toString( int ) // Integer
	invokenonvirtual_lib .routine_1559 // pc=2
	return 
	}


private com.whatsapp.client.ContactDetailScreen.routine_1647( com.whatsapp.client.ContactDetailScreen, java.util.Hashtable, int, java.lang.String, int ); // address: 0
	{
	enter 
	aload_3 
	ifnonnull Label4
	goto_w Label99
Label4:
	aload_3 
	invokenonvirtual_lib java.lang.String.trim // pc=1
	stringlength 
	ifgt Label9
	goto_w Label99
Label9:
	bipush 22
	iload_2 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	astore_5 
	new_lib net.rim.device.api.ui.MenuItem//net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem
	dup 
	aload_3 
	lipush 18014407099416576
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=4
	astore_6 
	aload_6 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	iconst_1 
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int ) // pc=2
	invokevirtual setFont( net.rim.device.api.ui.Field, net.rim.device.api.ui.Font ) // pc=2
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_53134   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_53134   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_53134   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_53134   // getName->1:     // getName->2:     // getName->N:     // ofs = 53134 ord = 12 addr = 0
	aload_5 
	aload_6 
	invokenonvirtual_lib .routine_1666 // pc=3
	aload_1 
	aload_3 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast ContactStatusDetails
	astore_7 
	aload_7 
	ifnonnull Label38
	goto_w Label93
Label38:
	aload_6 
	aload_7 
	invokevirtual setCookie( net.rim.device.api.ui.Field, java.lang.Object ) // pc=2
	bipush 22
	bipush 68
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	astore_5 
	aload_7 
	invokenonvirtual com.whatsapp.client.ContactStatusDetails.getTimeSet // pc=1
	invokestatic_lib module:WhatsApp-4.class#1.routine_219(  ) // class#1
	astore 8
	new_lib com.whatsapp.client.//module:WhatsApp-15.class#1 module:WhatsApp-15.class#1 module:WhatsApp-15.class#1
	dup 
	aload_7 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	lipush 36028805676007424
	invokespecial_lib .routine_911 // pc=4
	astore 9
	new_lib com.whatsapp.field.ColorLabelField//com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField
	dup 
	new_lib net.rim.device.api.util.IntVector//net.rim.device.api.util.IntVector net.rim.device.api.util.IntVector net.rim.device.api.util.IntVector
	dup 
	ldc literal_112:"@ "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 8
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	iipush 9014931
	lipush 8589934592
	invokespecial_lib .routine_3777 // pc=5
	astore 10
	new_lib net.rim.device.api.system.RuntimeStore//net.rim.device.api.system.RuntimeStore net.rim.device.api.system.RuntimeStore net.rim.device.api.system.RuntimeStore
	dup 
	lipush 1152921504606846976
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.<init> // pc=3
	astore 11
	aload 11
	aload 9
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload 11
	aload 10
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_53134   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_53134   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_53134   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_53134   // getName->1:     // getName->2:     // getName->N:     // ofs = 53134 ord = 12 addr = 0
	aload_5 
	aload 11
	iconst_0 
	iconst_1 
	iconst_1 
	invokenonvirtual_lib .routine_1710 // pc=6
	aload_0 
	aload_7 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_1928 // pc=2
	return 
Label93:
	aload_6 
	new_lib com.whatsapp.client.ContactDetailScreen$PhoneCookie//module:WhatsApp-12.class#6 module:WhatsApp-12.class#6 module:WhatsApp-12.class#6
	dup 
	aload_3 
	invokespecial_lib .routine_1538 // pc=2
	invokevirtual setCookie( net.rim.device.api.ui.Field, java.lang.Object ) // pc=2
Label99:
	return 
	}


private com.whatsapp.client.ContactDetailScreen.routine_1928( com.whatsapp.client.ContactDetailScreen, java.lang.String ); // address: 0
	{
	enter 
	bipush 74
	sipush 846
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	sipush 834
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokestatic_lib module:WhatsApp-28.class#18.routine_4780(  ) // class#18
	astore_2 
	new_lib com.whatsapp.client.MediaPreviewButton//com.whatsapp.client.MediaPreviewButton com.whatsapp.client.MediaPreviewButton com.whatsapp.client.MediaPreviewButton
	dup 
	bipush 16
	aload_2 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_53134   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_53134   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_53134   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_53134   // getName->1:     // getName->2:     // getName->N:     // ofs = 53134 ord = 12 addr = 0
	invokenonvirtual_lib .routine_1582 // pc=1
	invokespecial_lib .routine_2578 // pc=4
	astore_3 
	aload_3 
	invokenonvirtual_lib .routine_1747 // pc=1
	istore_4 
	new_lib com.whatsapp.field.ProgressAnimationField//module:WhatsApp-38.class#8 module:WhatsApp-38.class#8 module:WhatsApp-38.class#8
	dup 
	lipush 12884901888
	invokespecial_lib .routine_9107 // pc=3
	astore_5 
	aload_5 
	invokestatic_lib com.whatsapp.client.MediaPreviewButton.routine_2628(  ) // MediaPreviewButton
	invokestatic_lib module:WhatsApp-35.class#0.routine_7038(  ) // class#0
	new_lib com.whatsapp.client.ContactDetailScreen$3//module:WhatsApp-11.class#25 module:WhatsApp-11.class#25 module:WhatsApp-11.class#25
	dup 
	aload_0 
	aload_1 
	aload_3 
	invokespecial_lib .routine_7251 // pc=4
	astore_6 
	new_lib com.whatsapp.client.ContactDetailScreen$4//module:WhatsApp-11.class#27 module:WhatsApp-11.class#27 module:WhatsApp-11.class#27
	dup 
	aload_0 
	aload_1 
	iload_4 
	aload_3 
	aload_5 
	invokespecial_lib .routine_7377 // pc=6
	astore_7 
	aload_3 
	new_lib com.whatsapp.client.ContactDetailScreen$5//module:WhatsApp-11.class#29 module:WhatsApp-11.class#29 module:WhatsApp-11.class#29
	dup 
	aload_0 
	aload_1 
	invokespecial_lib .routine_7503 // pc=3
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_53134   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_53134   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_53134   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_53134   // getName->1:     // getName->2:     // getName->N:     // ofs = 53134 ord = 12 addr = 0
	aconst_null 
	aload_5 
	iconst_0 
	iconst_1 
	iconst_0 
	invokenonvirtual_lib .routine_1710 // pc=6
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_53142   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_53142   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_53142   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_53142   // getName->1:     // getName->2:     // getName->N:     // ofs = 53142 ord = 14 addr = 0
	aload_7 
	invokenonvirtual_lib .routine_9287 // pc=2
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_53142   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_53142   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_53142   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_53142   // getName->1:     // getName->2:     // getName->N:     // ofs = 53142 ord = 14 addr = 0
	aload_6 
	invokenonvirtual_lib .routine_9287 // pc=2
	return 
	}


private com.whatsapp.client.ContactDetailScreen.routine_2097( com.whatsapp.client.ContactDetailScreen ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_53138   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_53138   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_53138   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_53138   // getName->1:     // getName->2:     // getName->N:     // ofs = 53138 ord = 13 addr = 0
	invokenonvirtual_lib .routine_1615 // pc=1
	aload_0 
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 53086 ord = 0 addr = 0
	getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 53086 ord = 0 addr = 0
	getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 53086 ord = 0 addr = 0
	getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 53086 ord = 0 addr = 0
	getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 53086 ord = 0 addr = 0
	getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 53086 ord = 0 addr = 0
	getfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_2295 // pc=7
	astore_1 
	aload_1 
	stringlength 
	ifle Label36
	bipush 22
	bipush 57
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	astore_2 
	new_lib net.rim.device.api.ui.MenuItem//net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem
	dup 
	aload_1 
	lipush 18014407099416581
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=4
	astore_3 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_53138   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_53138   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_53138   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_53138   // getName->1:     // getName->2:     // getName->N:     // ofs = 53138 ord = 13 addr = 0
	aload_2 
	aload_3 
	invokenonvirtual_lib .routine_1666 // pc=3
Label36:
	aload_0 
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 53086 ord = 0 addr = 0
	getfield .field_24_24   // get_name_1:  .field_24_24   // get_name_2:  .field_24_24   // get_Name:    .field_24_24   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 24
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 53086 ord = 0 addr = 0
	getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 53086 ord = 0 addr = 0
	getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 53086 ord = 0 addr = 0
	getfield .field_27_27   // get_name_1:  .field_27_27   // get_name_2:  .field_27_27   // get_Name:    .field_27_27   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 27
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 53086 ord = 0 addr = 0
	getfield .field_28_28   // get_name_1:  .field_28_28   // get_name_2:  .field_28_28   // get_Name:    .field_28_28   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 28
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 53086 ord = 0 addr = 0
	getfield .field_29_29   // get_name_1:  .field_29_29   // get_name_2:  .field_29_29   // get_Name:    .field_29_29   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 29
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_2295 // pc=7
	astore_2 
	aload_2 
	stringlength 
	ifle Label69
	bipush 22
	bipush 59
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	astore_3 
	new_lib net.rim.device.api.ui.MenuItem//net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem
	dup 
	aload_2 
	lipush 18014407099416581
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=4
	astore_4 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_53138   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_53138   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_53138   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_53138   // getName->1:     // getName->2:     // getName->N:     // ofs = 53138 ord = 13 addr = 0
	aload_3 
	aload_4 
	invokenonvirtual_lib .routine_1666 // pc=3
Label69:
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_53138   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_53138   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_53138   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_53138   // getName->1:     // getName->2:     // getName->N:     // ofs = 53138 ord = 13 addr = 0
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_53138   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_53138   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_53138   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_53138   // getName->1:     // getName->2:     // getName->N:     // ofs = 53138 ord = 13 addr = 0
	invokenonvirtual_lib .routine_1957 // pc=1
	invokestatic_lib java.lang.String toString( int ) // Integer
	invokenonvirtual_lib .routine_1559 // pc=2
	return 
	}


private java.lang.String com.whatsapp.client.ContactDetailScreen.routine_2295( com.whatsapp.client.ContactDetailScreen, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	new_lib net.rim.device.api.util.IntVector//net.rim.device.api.util.IntVector net.rim.device.api.util.IntVector net.rim.device.api.util.IntVector
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	astore_7 
	aload_1 
	ifnonnull Label18
	aload_2 
	ifnonnull Label18
	aload_3 
	ifnonnull Label18
	aload_4 
	ifnonnull Label18
	aload_5 
	ifnonnull Label18
	aload_6 
	ifnonnull Label18
	goto_w Label83
Label18:
	aload_7 
	aload_1 
	invokestatic com.whatsapp.client.ContactDetailScreen.routine_3507( java.lang.StringBuffer, java.lang.String ) // ContactDetailScreen
	aload_7 
	aload_2 
	invokestatic com.whatsapp.client.ContactDetailScreen.routine_3507( java.lang.StringBuffer, java.lang.String ) // ContactDetailScreen
	new_lib net.rim.device.api.util.IntVector//net.rim.device.api.util.IntVector net.rim.device.api.util.IntVector net.rim.device.api.util.IntVector
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	astore 8
	aload_3 
	ifnull Label38
	aload_3 
	invokenonvirtual_lib java.lang.String.trim // pc=1
	stringlength 
	ifle Label38
	aload 8
	aload_3 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label38:
	aload_4 
	ifnull Label59
	aload_4 
	invokenonvirtual_lib java.lang.String.trim // pc=1
	stringlength 
	ifle Label59
	aload 8
	invokevirtual int length( java.lang.StringBuffer ) // pc=1
	ifle Label55
	aload 8
	bipush 44
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	aload 8
	bipush 32
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
Label55:
	aload 8
	aload_4 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label59:
	aload_5 
	ifnull Label76
	aload_5 
	invokenonvirtual_lib java.lang.String.trim // pc=1
	stringlength 
	ifle Label76
	aload 8
	invokevirtual int length( java.lang.StringBuffer ) // pc=1
	ifle Label72
	aload 8
	bipush 32
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
Label72:
	aload 8
	aload_5 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label76:
	aload_7 
	aload 8
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic com.whatsapp.client.ContactDetailScreen.routine_3507( java.lang.StringBuffer, java.lang.String ) // ContactDetailScreen
	aload_7 
	aload_6 
	invokestatic com.whatsapp.client.ContactDetailScreen.routine_3507( java.lang.StringBuffer, java.lang.String ) // ContactDetailScreen
Label83:
	aload_7 
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}


private com.whatsapp.client.ContactDetailScreen.routine_2481( com.whatsapp.client.ContactDetailScreen ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokenonvirtual_lib .routine_40 // pc=1
	invokevirtual deleteAll( net.rim.device.api.ui.Manager ) // pc=1
	aload_0 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_53110   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_53110   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_53110   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_53110   // getName->1:     // getName->2:     // getName->N:     // ofs = 53110 ord = 6 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_53122   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_53122   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_53122   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_53122   // getName->1:     // getName->2:     // getName->N:     // ofs = 53122 ord = 9 addr = 0
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_2557 // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_53126   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_53126   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_53126   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_53126   // getName->1:     // getName->2:     // getName->N:     // ofs = 53126 ord = 10 addr = 0
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_2557 // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_53130   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_53130   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_53130   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_53130   // getName->1:     // getName->2:     // getName->N:     // ofs = 53130 ord = 11 addr = 0
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_2557 // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_53134   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_53134   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_53134   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_53134   // getName->1:     // getName->2:     // getName->N:     // ofs = 53134 ord = 12 addr = 0
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_2557 // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_53138   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_53138   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_53138   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_53138   // getName->1:     // getName->2:     // getName->N:     // ofs = 53138 ord = 13 addr = 0
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_2557 // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_53114   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_53114   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_53114   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_53114   // getName->1:     // getName->2:     // getName->N:     // ofs = 53114 ord = 7 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_53110   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_53110   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_53110   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_53110   // getName->1:     // getName->2:     // getName->N:     // ofs = 53110 ord = 6 addr = 0
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	return 
	}


private com.whatsapp.client.ContactDetailScreen.routine_2557( com.whatsapp.client.ContactDetailScreen, module:WhatsApp-12.class#7 ); // address: 0
	{
	enter_narrow 
	aload_1 
	invokenonvirtual_lib .routine_1593 // pc=1
	ifne Label9
	aload_0 
	aload_1 
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_1 
	invokenonvirtual_lib .routine_2019 // pc=1
Label9:
	return 
	}


private com.whatsapp.client.ContactDetailScreen.routine_2593( com.whatsapp.client.ContactDetailScreen ); // address: 0
	{
	enter 
	iipush 310000
	istore_1 
	bipush 10
	istore_2 
	aload_0 
	sipush 265
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	new_lib com.whatsapp.client.ContactDetailScreen$6//module:WhatsApp-12.class#1 module:WhatsApp-12.class#1 module:WhatsApp-12.class#1
	dup 
	aload_0 
	invokespecial_lib .routine_1321 // pc=2
	invokestatic_lib module:WhatsApp-36.class#17.routine_7979(  ) // class#17
	putfield com.whatsapp.client.ContactDetailScreen.field_53094   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_53094   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_53094   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_53094   // getName->1:     // getName->2:     // getName->N:     // ofs = 53094 ord = 2 addr = 0
	aload_0 
	new_lib com.whatsapp.client.ContactDetailScreen$7//module:WhatsApp-12.class#2 module:WhatsApp-12.class#2 module:WhatsApp-12.class#2
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4672(  ) // class#18
	sipush 921
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial_lib .routine_1392 // pc=6
	putfield com.whatsapp.client.ContactDetailScreen.field_53106   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_53106   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_53106   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_53106   // getName->1:     // getName->2:     // getName->N:     // ofs = 53106 ord = 5 addr = 0
	aload_0 
	bipush 69
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	new_lib com.whatsapp.client.ContactDetailScreen$8//module:WhatsApp-12.class#3 module:WhatsApp-12.class#3 module:WhatsApp-12.class#3
	dup 
	aload_0 
	invokespecial_lib .routine_1435 // pc=2
	invokestatic_lib module:WhatsApp-36.class#17.routine_7979(  ) // class#17
	putfield com.whatsapp.client.ContactDetailScreen.field_53098   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_53098   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_53098   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_53098   // getName->1:     // getName->2:     // getName->N:     // ofs = 53098 ord = 3 addr = 0
	aload_0 
	bipush 71
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	new_lib com.whatsapp.client.ContactDetailScreen$9//module:WhatsApp-12.class#4 module:WhatsApp-12.class#4 module:WhatsApp-12.class#4
	dup 
	aload_0 
	invokespecial_lib .routine_1474 // pc=2
	invokestatic_lib module:WhatsApp-36.class#17.routine_7979(  ) // class#17
	putfield com.whatsapp.client.ContactDetailScreen.field_53102   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_53102   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_53102   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_53102   // getName->1:     // getName->2:     // getName->N:     // ofs = 53102 ord = 4 addr = 0
	return 
	}


private openMediaBrowser( com.whatsapp.client.ContactDetailScreen, java.lang.String ); // address: 0
	{
	enter 
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	astore_2 
	new_lib com.whatsapp.client.MediaBrowserScreen//com.whatsapp.client.MediaBrowserScreen com.whatsapp.client.MediaBrowserScreen com.whatsapp.client.MediaBrowserScreen
	dup 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_53118   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_53118   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_53118   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_53118   // getName->1:     // getName->2:     // getName->N:     // ofs = 53118 ord = 8 addr = 0
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.LabelField ) // pc=1
	aload_1 
	aconst_null 
	invokespecial_lib .routine_2225 // pc=4
	astore_3 
	new_lib net.rim.device.api.ui.component.ButtonField//net.rim.device.api.ui.component.ButtonField net.rim.device.api.ui.component.ButtonField net.rim.device.api.ui.component.ButtonField
	dup 
	bipush 2
	invokespecial_lib net.rim.device.api.ui.TransitionContext.<init> // pc=2
	astore_4 
	aload_4 
	bipush 4
	iconst_1 
	invokevirtual setIntAttribute( net.rim.device.api.ui.TransitionContext, int, int ) // pc=3
	new_lib net.rim.device.api.ui.component.ButtonField//net.rim.device.api.ui.component.ButtonField net.rim.device.api.ui.component.ButtonField net.rim.device.api.ui.component.ButtonField
	dup 
	bipush 2
	invokespecial_lib net.rim.device.api.ui.TransitionContext.<init> // pc=2
	astore_5 
	aload_5 
	bipush 2
	bipush 2
	invokevirtual setIntAttribute( net.rim.device.api.ui.TransitionContext, int, int ) // pc=3
	aload_5 
	bipush 3
	bipush 2
	invokevirtual setIntAttribute( net.rim.device.api.ui.TransitionContext, int, int ) // pc=3
	aload_5 
	bipush 4
	iconst_1 
	invokevirtual setIntAttribute( net.rim.device.api.ui.TransitionContext, int, int ) // pc=3
	aload_2 
	invokevirtual net.rim.device.api.ui.UiEngineInstance getUiEngineInstance( net.rim.device.api.ui.UiApplication ) // pc=1
	aload_0 
	aload_3 
	bipush 7
	aload_4 
	invokevirtual setTransition( net.rim.device.api.ui.UiEngineInstance, net.rim.device.api.ui.Screen, net.rim.device.api.ui.Screen, int, net.rim.device.api.ui.TransitionContext ) // pc=5
	aload_2 
	invokevirtual net.rim.device.api.ui.UiEngineInstance getUiEngineInstance( net.rim.device.api.ui.UiApplication ) // pc=1
	aload_3 
	aload_0 
	bipush 56
	aload_5 
	invokevirtual setTransition( net.rim.device.api.ui.UiEngineInstance, net.rim.device.api.ui.Screen, net.rim.device.api.ui.Screen, int, net.rim.device.api.ui.TransitionContext ) // pc=5
	aload_3 
	new_lib com.whatsapp.client.ContactDetailScreen$10//module:WhatsApp-11.class#22 module:WhatsApp-11.class#22 module:WhatsApp-11.class#22
	dup 
	aload_0 
	aload_2 
	aload_3 
	invokespecial_lib .routine_6999 // pc=4
	invokevirtual addScreenUiEngineAttachedListener( net.rim.device.api.ui.Screen, net.rim.device.api.ui.ScreenUiEngineAttachedListener ) // pc=2
	aload_2 
	aload_3 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}


private showChatScreen( com.whatsapp.client.ContactDetailScreen ); // address: 0
	{
	enter 
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 53086 ord = 0 addr = 0
	ifnonnull Label4
	return 
Label4:
	aload_0 
	invokevirtual net.rim.device.api.ui.Field getLeafFieldWithFocus( net.rim.device.api.ui.Screen ) // pc=1
	astore_1 
	aload_1 
	ifnull Label23
	aload_1 
	invokevirtual java.lang.Object getCookie( net.rim.device.api.ui.Field ) // pc=1
	instanceof ContactStatusDetails
	ifeq Label23
	aload_1 
	invokevirtual java.lang.Object getCookie( net.rim.device.api.ui.Field ) // pc=1
	checkcast ContactStatusDetails
	astore_2 
	aload_2 
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 53086 ord = 0 addr = 0
	aload_0 
	invokestatic_lib module:WhatsApp-31.class#4.routine_9215(  ) // class#4
	pop 
	return 
Label23:
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 53086 ord = 0 addr = 0
	invokestatic_lib module:WhatsApp-31.class#4.routine_9482(  ) // class#4
	astore_2 
	aload_2 
	ifnull Label32
	aload_2 
	aload_0 
	invokestatic_lib module:WhatsApp-31.class#4.routine_9248(  ) // class#4
	pop 
Label32:
	return 
	}


private emailContact( com.whatsapp.client.ContactDetailScreen ); // address: 0
	{
	enter 
	aconst_null 
	astore_1 
	aload_0 
	invokevirtual net.rim.device.api.ui.Field getLeafFieldWithFocus( net.rim.device.api.ui.Screen ) // pc=1
	astore_2 
	aload_2 
	ifnull Label11
	aload_2 
	invokevirtual java.lang.Object getCookie( net.rim.device.api.ui.Field ) // pc=1
	goto Label12
Label11:
	aconst_null 
Label12:
	astore_3 
	aload_3 
	checkcastbranch_lib 
	invokenonvirtual_lib .routine_1495 // pc=1
	astore_1 
	goto Label72
Label18:
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 53086 ord = 0 addr = 0
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	astore_4 
	aload_4 
	invokevirtual int size( java.util.Vector ) // pc=1
	iconst_1 
	if_icmpne Label31
	aload_4 
	iconst_0 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore_1 
	goto Label72
Label31:
	aload_4 
	invokevirtual int size( java.util.Vector ) // pc=1
	iconst_1 
	if_icmple Label72
	aload_4 
	invokevirtual int size( java.util.Vector ) // pc=1
	newarray_object_lib net.rim.device.api.ui.decor.Border//net.rim.device.api.ui.decor.Border net.rim.device.api.ui.decor.Border net.rim.device.api.ui.decor.Border
	astore_5 
	aload_5 
	arraylength 
	iconst_1 
	isub 
	istore_6 
Label44:
	iload_6 
	iflt Label54
	aload_5 
	iload_6 
	aload_4 
	iload_6 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	aastore 
	iinc 6 -1
	goto Label44
Label54:
	bipush 31
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	aload_5 
	iconst_0 
	invokestatic_lib int ask( java.lang.String, java.lang.Object[], int ) // Dialog
	istore_6 
	iload_6 
	bipush -1
	if_icmple Label72
	iload_6 
	aload_5 
	arraylength 
	if_icmpge Label72
	aload_5 
	iload_6 
	aaload 
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore_1 
Label72:
	aload_1 
	ifnull Label85
	bipush 2
	new_lib net.rim.blackberry.api.invoke.MessageArguments//net.rim.blackberry.api.invoke.MessageArguments net.rim.blackberry.api.invoke.MessageArguments net.rim.blackberry.api.invoke.MessageArguments
	dup 
	ldc literal_113:"new"
	aload_1 
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokespecial_lib net.rim.blackberry.api.invoke.MessageArguments.<init> // pc=5
	invokestatic_lib invokeApplication( int, net.rim.blackberry.api.invoke.ApplicationArguments ) // Invoke
	return 
	astore_4 
Label85:
	return 
	}


private callContact( com.whatsapp.client.ContactDetailScreen ); // address: 0
	{
	enter 
	aconst_null 
	astore_1 
	aload_0 
	invokevirtual net.rim.device.api.ui.Field getLeafFieldWithFocus( net.rim.device.api.ui.Screen ) // pc=1
	astore_2 
	aload_2 
	ifnull Label11
	aload_2 
	invokevirtual java.lang.Object getCookie( net.rim.device.api.ui.Field ) // pc=1
	goto Label12
Label11:
	aconst_null 
Label12:
	astore_3 
	aload_3 
	checkcastbranch_lib 
	invokenonvirtual_lib .routine_1527 // pc=1
	astore_1 
	goto_w Label91
Label18:
	aload_3 
	checkcastbranch 
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	astore_1 
	goto_w Label91
Label23:
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 53086 ord = 0 addr = 0
	invokenonvirtual_lib .routine_6738 // pc=1
	astore_4 
	aload_4 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_5 
	iload_5 
	iconst_1 
	if_icmpne Label38
	aload_4 
	iconst_0 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore_1 
	goto Label91
Label38:
	iload_5 
	iconst_1 
	if_icmple Label91
	iload_5 
	newarray_object_lib String//java.lang.String java.lang.String java.lang.String
	astore_6 
	iload_5 
	newarray_object_lib String//java.lang.String java.lang.String java.lang.String
	astore_7 
	iconst_0 
	istore 8
Label49:
	iload 8
	iload_5 
	if_icmpge Label74
	aload_4 
	iload 8
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore 9
	bipush 74
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 53086 ord = 0 addr = 0
	aload 9
	invokenonvirtual_lib .routine_6574 // pc=2
	aload 9
	invokestatic_lib module:WhatsApp-28.class#18.routine_4780(  ) // class#18
	astore 10
	aload_6 
	iload 8
	aload 10
	aastore 
	aload_7 
	iload 8
	aload 9
	aastore 
	iinc 8 1
	goto Label49
Label74:
	bipush 30
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	aload_6 
	iconst_0 
	invokestatic_lib int ask( java.lang.String, java.lang.Object[], int ) // Dialog
	istore 8
	iload 8
	bipush -1
	if_icmple Label91
	iload 8
	aload_6 
	arraylength 
	if_icmpge Label91
	aload_7 
	iload 8
	aaload 
	astore_1 
Label91:
	aload_1 
	ifnull Label102
	bipush 4
	new_lib net.rim.blackberry.api.invoke.PhoneArguments//net.rim.blackberry.api.invoke.PhoneArguments net.rim.blackberry.api.invoke.PhoneArguments net.rim.blackberry.api.invoke.PhoneArguments
	dup 
	ldc literal_114:"call"
	aload_1 
	invokespecial_lib net.rim.blackberry.api.invoke.PhoneArguments.<init> // pc=3
	invokestatic_lib invokeApplication( int, net.rim.blackberry.api.invoke.ApplicationArguments ) // Invoke
	return 
	astore_4 
Label102:
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public populateContactData( com.whatsapp.client.ContactDetailScreen ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_864 // pc=1
	aload_0 
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_924 // pc=1
	aload_0 
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_1217 // pc=1
	aload_0 
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_1349 // pc=1
	aload_0 
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_1460 // pc=1
	aload_0 
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_2097 // pc=1
	aload_0 
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_2481 // pc=1
	return 
	}


protected onAddButtonClick( com.whatsapp.client.ContactDetailScreen ); // address: 0
	{
	noenter_return 
	}


public onContactUpdated( com.whatsapp.client.ContactDetailScreen, module:WhatsApp.class#12 ); // address: 0
	{
	enter_narrow 
	aload_1 
	ifnull Label6
	aload_0 
	aload_1 
	putfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 53086 ord = 0 addr = 0
Label6:
	aload_0 
	invokenonvirtual com.whatsapp.client.ContactDetailScreen.populateContactData // pc=1
	return 
	}


public closeScreen( com.whatsapp.client.ContactDetailScreen ); // address: 0
	{
	enter_narrow 
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	astore_1 
	aload_1 
	aload_0 
	invokevirtual popScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}


protected boolean keyChar( com.whatsapp.client.ContactDetailScreen, char, int, int ); // address: 0
	{
	enter 
	iload_1 
	bipush 27
	if_icmpne Label8
	aload_0 
	invokenonvirtual com.whatsapp.client.ContactDetailScreen.closeScreen // pc=1
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


protected makeMenu( com.whatsapp.client.ContactDetailScreen, net.rim.device.api.ui.component.Menu, int ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual net.rim.device.api.ui.Field getLeafFieldWithFocus( net.rim.device.api.ui.Screen ) // pc=1
	astore_3 
	aload_3 
	ifnull Label9
	aload_3 
	invokevirtual java.lang.Object getCookie( net.rim.device.api.ui.Field ) // pc=1
	goto Label10
Label9:
	aconst_null 
Label10:
	astore_4 
	aload_0 
	aload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.Screen.makeMenu // pc=3
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 53086 ord = 0 addr = 0
	iconst_0 
	invokenonvirtual_lib .routine_6025 // pc=2
	astore_5 
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 53086 ord = 0 addr = 0
	invokenonvirtual_lib .routine_6298 // pc=1
	astore_6 
	aload_6 
	arraylength 
	ifle Label48
	aload_6 
	arraylength 
	iconst_1 
	if_icmple Label39
	aload_4 
	checkcastbranch 
	astore_7 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_53094   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_53094   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_53094   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_53094   // getName->1:     // getName->2:     // getName->N:     // ofs = 53094 ord = 2 addr = 0
	sipush 265
	aload_7 
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	invokenonvirtual_lib .routine_7894 // pc=2
	goto Label44
Label39:
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_53094   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_53094   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_53094   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_53094   // getName->1:     // getName->2:     // getName->N:     // ofs = 53094 ord = 2 addr = 0
	sipush 265
	aload_5 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	invokenonvirtual_lib .routine_7894 // pc=2
Label44:
	aload_1 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_53094   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_53094   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_53094   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_53094   // getName->1:     // getName->2:     // getName->N:     // ofs = 53094 ord = 2 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	goto Label51
Label48:
	aload_1 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_53106   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_53106   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_53106   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_53106   // getName->1:     // getName->2:     // getName->N:     // ofs = 53106 ord = 5 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label51:
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 53086 ord = 0 addr = 0
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_7 
	iload_7 
	ifle Label79
	iload_7 
	iconst_1 
	if_icmple Label71
	aload_4 
	instanceof_lib com.whatsapp.client.ContactDetailScreen$EmailCookie//module:WhatsApp-12.class#5 module:WhatsApp-12.class#5 module:WhatsApp-12.class#5
	ifeq Label71
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_53098   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_53098   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_53098   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_53098   // getName->1:     // getName->2:     // getName->N:     // ofs = 53098 ord = 3 addr = 0
	bipush 69
	aload_4 
	checkcast_lib com.whatsapp.client.ContactDetailScreen$EmailCookie//module:WhatsApp-12.class#5 module:WhatsApp-12.class#5 module:WhatsApp-12.class#5
	invokenonvirtual_lib .routine_1495 // pc=1
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	invokenonvirtual_lib .routine_7894 // pc=2
	goto Label76
Label71:
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_53098   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_53098   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_53098   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_53098   // getName->1:     // getName->2:     // getName->N:     // ofs = 53098 ord = 3 addr = 0
	bipush 69
	aload_5 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	invokenonvirtual_lib .routine_7894 // pc=2
Label76:
	aload_1 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_53098   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_53098   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_53098   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_53098   // getName->1:     // getName->2:     // getName->N:     // ofs = 53098 ord = 3 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label79:
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 53086 ord = 0 addr = 0
	invokenonvirtual_lib .routine_6872 // pc=1
	invokevirtual int size( net.rim.device.api.util.IntVector ) // pc=1
	istore 8
	iload 8
	ifle Label111
	iload 8
	iconst_1 
	if_icmple Label93
	aload_4 
	checkcastbranch_lib 
	invokenonvirtual_lib .routine_1527 // pc=1
	astore 9
	goto Label103
Label93:
	iload 8
	iconst_1 
	if_icmple Label101
	aload_4 
	checkcastbranch 
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	astore 9
	goto Label103
Label101:
	aload_5 
	astore 9
Label103:
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_53102   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_53102   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_53102   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_53102   // getName->1:     // getName->2:     // getName->N:     // ofs = 53102 ord = 4 addr = 0
	bipush 71
	aload 9
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	invokenonvirtual_lib .routine_7894 // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_53102   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_53102   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_53102   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_53102   // getName->1:     // getName->2:     // getName->N:     // ofs = 53102 ord = 4 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label111:
	aload_4 
	instanceof_lib com.whatsapp.client.ContactDetailScreen$EmailCookie//module:WhatsApp-12.class#5 module:WhatsApp-12.class#5 module:WhatsApp-12.class#5
	ifeq Label118
	aload_1 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_53098   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_53098   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_53098   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_53098   // getName->1:     // getName->2:     // getName->N:     // ofs = 53098 ord = 3 addr = 0
	invokevirtual setDefault( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	return 
Label118:
	aload_4 
	instanceof_lib com.whatsapp.client.ContactDetailScreen$PhoneCookie//module:WhatsApp-12.class#6 module:WhatsApp-12.class#6 module:WhatsApp-12.class#6
	ifeq Label124
	aload_1 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_53102   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_53102   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_53102   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_53102   // getName->1:     // getName->2:     // getName->N:     // ofs = 53102 ord = 4 addr = 0
	invokevirtual setDefault( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label124:
	return 
	}


public module:WhatsApp.class#12 getContactInfoDetails( com.whatsapp.client.ContactDetailScreen ); // address: 0
	{
	areturn_field _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 53086 ord = 0 addr = 0
	}

}
