// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-12.cod
// Module version  : 2.7.6550
// Class ID        : 14
// ########################################################


package com.whatsapp.client;


public class ContactDetailScreen extends 

{

	// @@@@@@@@@@@@@ Fields 
	private  /*module:WhatsApp.class#31*/  _contactInfoDetails ; // ofs = 40696 addr = 0)
	private boolean /*boolean*/  field_40700 ; // ofs = 40700 addr = 0)
	private boolean /*boolean*/  field_40704 ; // ofs = 40704 addr = 0)
	private com.rim.resources. /*module:WhatsApp-36.class#14*/  field_40708 ; // ofs = 40708 addr = 0)
	private com.rim.resources.WhatsAppRIMResourcesPopulator42 /*module:WhatsApp-36.class#14*/  field_40712 ; // ofs = 40712 addr = 0)
	private com.rim.resources.WhatsAppRIMResourcesPopulator42 /*module:WhatsApp-36.class#14*/  field_40716 ; // ofs = 40716 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_40720 ; // ofs = 40720 addr = 0)
	private net.rim.device.api.ui.component.NullField /*net.rim.device.api.ui.component.NullField*/  field_40724 ; // ofs = 40724 addr = 0)
	private net.rim.device.api.ui.component.NullField /*net.rim.device.api.ui.component.NullField*/  field_40728 ; // ofs = 40728 addr = 0)
	private net.rim.device.api.ui.component.LabelField /*net.rim.device.api.ui.component.LabelField*/  field_40732 ; // ofs = 40732 addr = 0)
	private com.whatsapp.client.ContactDetailScreen$SectionFieldManager /*com.whatsapp.client.ContactDetailScreen$SectionFieldManager*/  field_40736 ; // ofs = 40736 addr = 0)
	private com.whatsapp.client.ContactDetailScreen$SectionFieldManager /*com.whatsapp.client.ContactDetailScreen$SectionFieldManager*/  field_40740 ; // ofs = 40740 addr = 0)
	private com.whatsapp.client.ContactDetailScreen$SectionFieldManager /*com.whatsapp.client.ContactDetailScreen$SectionFieldManager*/  field_40744 ; // ofs = 40744 addr = 0)
	private com.whatsapp.client.ContactDetailScreen$SectionFieldManager /*com.whatsapp.client.ContactDetailScreen$SectionFieldManager*/  field_40748 ; // ofs = 40748 addr = 0)
	private com.whatsapp.client.ContactDetailScreen$SectionFieldManager /*com.whatsapp.client.ContactDetailScreen$SectionFieldManager*/  field_40752 ; // ofs = 40752 addr = 0)
	private com.whatsapp.client.ContactDetailScreen$SectionFieldManager /*com.whatsapp.client.ContactDetailScreen$SectionFieldManager*/  field_40756 ; // ofs = 40756 addr = 0)
	private final  /*module:WhatsApp-42.class#8*/  field_40760 ; // ofs = 40760 addr = 0)
	private int /*int*/  _mmsCount ; // ofs = 40764 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.ContactDetailScreen, module:WhatsApp.class#31 ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	iconst_0 
	iconst_1 
	invokespecial com.whatsapp.client.ContactDetailScreen.<init> // pc=4
	return 
	}


protected <init>( com.whatsapp.client.ContactDetailScreen, module:WhatsApp.class#31, boolean, boolean ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib .routine_7042 // pc=1
	aload_0 
	new_lib //module:WhatsApp-42.class#8 module:WhatsApp-42.class#8 module:WhatsApp-42.class#8
	dup 
	invokespecial_lib .routine_5479 // pc=1
	putfield com.whatsapp.client.ContactDetailScreen.field_40760   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40760   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40760   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40760   // getName->1:     // getName->2:     // getName->N:     // ofs = 40760 ord = 16 addr = 0
	aload_0 
	aload_1 
	putfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 40696 ord = 0 addr = 0
	aload_0 
	iload_2 
	putfield com.whatsapp.client.ContactDetailScreen.field_40700   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40700   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40700   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40700   // getName->1:     // getName->2:     // getName->N:     // ofs = 40700 ord = 1 addr = 0
	aload_0 
	iload_3 
	putfield com.whatsapp.client.ContactDetailScreen.field_40704   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40704   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40704   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40704   // getName->1:     // getName->2:     // getName->N:     // ofs = 40704 ord = 2 addr = 0
	aload_0 
	invokestatic_lib module:WhatsApp-43.class#0.routine_606(  ) // class#0
	aload_0 
	invokestatic_lib module:WhatsApp-7.class#11.routine_4268(  ) // class#11
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	aload_0 
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_3252 // pc=1
	aload_0 
	invokenonvirtual com.whatsapp.client.ContactDetailScreen.populateContactData // pc=1
	aload_0 
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_5217 // pc=1
	return 
	}


static private com.whatsapp.client.ContactDetailScreen.routine_6129( java.lang.StringBuffer, java.lang.String ); // address: 0
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

private com.whatsapp.client.ContactDetailScreen.routine_3252( com.whatsapp.client.ContactDetailScreen ); // address: 0
	{
	enter 
	aload_0 
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_3404 // pc=1
	aload_0 
	iconst_1 
	invokenonvirtual_lib .routine_6721 // pc=2
	aload_0 
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	dup 
	lipush 18014398509481984
	invokespecial_lib net.rim.device.api.ui.component.NullField.<init> // pc=3
	putfield com.whatsapp.client.ContactDetailScreen.field_40724   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40724   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40724   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40724   // getName->1:     // getName->2:     // getName->N:     // ofs = 40724 ord = 7 addr = 0
	aload_0 
	new ContactDetailScreen$SectionFieldManager
	dup 
	bipush -1
	iconst_1 
	invokespecial com.whatsapp.client.ContactDetailScreen$SectionFieldManager.<init> // pc=3
	putfield com.whatsapp.client.ContactDetailScreen.field_40736   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40736   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40736   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40736   // getName->1:     // getName->2:     // getName->N:     // ofs = 40736 ord = 10 addr = 0
	aload_0 
	new ContactDetailScreen$SectionFieldManager
	dup 
	bipush -1
	iconst_1 
	invokespecial com.whatsapp.client.ContactDetailScreen$SectionFieldManager.<init> // pc=3
	putfield com.whatsapp.client.ContactDetailScreen.field_40744   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40744   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40744   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40744   // getName->1:     // getName->2:     // getName->N:     // ofs = 40744 ord = 12 addr = 0
	aload_0 
	new ContactDetailScreen$SectionFieldManager
	dup 
	sipush 917
	iconst_1 
	invokespecial com.whatsapp.client.ContactDetailScreen$SectionFieldManager.<init> // pc=3
	putfield com.whatsapp.client.ContactDetailScreen.field_40740   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40740   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40740   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40740   // getName->1:     // getName->2:     // getName->N:     // ofs = 40740 ord = 11 addr = 0
	aload_0 
	new ContactDetailScreen$SectionFieldManager
	dup 
	sipush 920
	iconst_1 
	invokespecial com.whatsapp.client.ContactDetailScreen$SectionFieldManager.<init> // pc=3
	putfield com.whatsapp.client.ContactDetailScreen.field_40748   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40748   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40748   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40748   // getName->1:     // getName->2:     // getName->N:     // ofs = 40748 ord = 13 addr = 0
	aload_0 
	new ContactDetailScreen$SectionFieldManager
	dup 
	sipush 918
	iconst_0 
	invokespecial com.whatsapp.client.ContactDetailScreen$SectionFieldManager.<init> // pc=3
	putfield com.whatsapp.client.ContactDetailScreen.field_40752   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40752   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40752   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40752   // getName->1:     // getName->2:     // getName->N:     // ofs = 40752 ord = 14 addr = 0
	aload_0 
	new ContactDetailScreen$SectionFieldManager
	dup 
	sipush 919
	iconst_1 
	invokespecial com.whatsapp.client.ContactDetailScreen$SectionFieldManager.<init> // pc=3
	putfield com.whatsapp.client.ContactDetailScreen.field_40756   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40756   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40756   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40756   // getName->1:     // getName->2:     // getName->N:     // ofs = 40756 ord = 15 addr = 0
	aload_0 
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	dup 
	lipush 18014398509481984
	invokespecial_lib net.rim.device.api.ui.component.NullField.<init> // pc=3
	putfield com.whatsapp.client.ContactDetailScreen.field_40728   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40728   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40728   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40728   // getName->1:     // getName->2:     // getName->N:     // ofs = 40728 ord = 8 addr = 0
	return 
	}


private com.whatsapp.client.ContactDetailScreen.routine_3404( com.whatsapp.client.ContactDetailScreen ); // address: 0
	{
	enter 
	new_lib com.whatsapp.field.WAHorizontalFieldManager//com.whatsapp.field.WAHorizontalFieldManager com.whatsapp.field.WAHorizontalFieldManager com.whatsapp.field.WAHorizontalFieldManager
	dup 
	invokespecial_lib .routine_6599 // pc=1
	astore_1 
	aload_1 
	iconst_1 
	invokenonvirtual_lib .routine_5705 // pc=2
	aload_0 
	new_lib com.whatsapp.field.ColorLabelField//com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField
	dup 
	getstatic STRING_EMPTY_STRING // Constants
	iipush 16777215
	lipush 1152921504606847040
	invokespecial_lib .routine_5006 // pc=5
	putfield com.whatsapp.client.ContactDetailScreen.field_40732   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40732   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40732   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40732   // getName->1:     // getName->2:     // getName->N:     // ofs = 40732 ord = 9 addr = 0
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_40732   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40732   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40732   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40732   // getName->1:     // getName->2:     // getName->N:     // ofs = 40732 ord = 9 addr = 0
	bipush 12
	bipush 18
	bipush 12
	bipush 18
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_1 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_40732   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40732   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40732   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40732   // getName->1:     // getName->2:     // getName->N:     // ofs = 40732 ord = 9 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_1 
	iconst_0 
	iconst_0 
	invokestatic_lib module:WhatsApp-35.class#1.routine_5494(  ) // class#1
	aload_1 
	aconst_null 
	invokevirtual setBorder( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Border ) // pc=2
	aload_0 
	aload_1 
	invokenonvirtual_lib .routine_6672 // pc=2
	return 
	}


private com.whatsapp.client.ContactDetailScreen.routine_3504( com.whatsapp.client.ContactDetailScreen ); // address: 0
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
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_40732   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40732   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40732   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40732   // getName->1:     // getName->2:     // getName->N:     // ofs = 40732 ord = 9 addr = 0
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 40696 ord = 0 addr = 0
	iload_1 
	invokenonvirtual_lib .routine_9670 // pc=2
	invokevirtual setText( net.rim.device.api.ui.component.LabelField, java.lang.Object ) // pc=2
	return 
	}


private com.whatsapp.client.ContactDetailScreen.routine_3564( com.whatsapp.client.ContactDetailScreen ); // address: 0
	{
	enter 
	new_lib net.rim.device.api.ui.Font//net.rim.device.api.ui.Font net.rim.device.api.ui.Font net.rim.device.api.ui.Font
	dup 
	lipush 1152921508901814272
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.<init> // pc=3
	astore_1 
	aload_0 
	aload_1 
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 40696 ord = 0 addr = 0
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_3679 // pc=3
	aload_0 
	aload_1 
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 40696 ord = 0 addr = 0
	getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_3679 // pc=3
	new_lib Reference//java.lang.ref.Reference java.lang.ref.Reference java.lang.ref.Reference
	dup 
	aload_0 
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_3759 // pc=1
	lipush 36028797018963968
	invokespecial_lib net.rim.device.api.ui.component.BitmapField.<init> // pc=4
	astore_2 
	new_lib com.whatsapp.field.WAHorizontalFieldManager//com.whatsapp.field.WAHorizontalFieldManager com.whatsapp.field.WAHorizontalFieldManager com.whatsapp.field.WAHorizontalFieldManager
	dup 
	invokespecial_lib .routine_6599 // pc=1
	astore_3 
	aload_3 
	iconst_1 
	invokenonvirtual_lib .routine_5705 // pc=2
	aload_3 
	aload_1 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_3 
	aload_2 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_40736   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40736   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40736   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40736   // getName->1:     // getName->2:     // getName->N:     // ofs = 40736 ord = 10 addr = 0
	aload_3 
	invokenonvirtual com.whatsapp.client.ContactDetailScreen$SectionFieldManager.addContentRow // pc=2
	return 
	}


private com.whatsapp.client.ContactDetailScreen.routine_3679( com.whatsapp.client.ContactDetailScreen, net.rim.device.api.ui.container.VerticalFieldManager, java.lang.String ); // address: 0
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
	invokespecial_lib .routine_5006 // pc=5
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


private net.rim.device.api.system.Bitmap com.whatsapp.client.ContactDetailScreen.routine_3759( com.whatsapp.client.ContactDetailScreen ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 40696 ord = 0 addr = 0
	getstatic PHOTO_HEIGHT // ContactShortcuts
	invokestatic_lib com.whatsapp.client.TabButton.routine_5833(  ) // TabButton
	areturn 
	}


private com.whatsapp.client.ContactDetailScreen.routine_3786( com.whatsapp.client.ContactDetailScreen ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_40744   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40744   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40744   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40744   // getName->1:     // getName->2:     // getName->N:     // ofs = 40744 ord = 12 addr = 0
	invokenonvirtual com.whatsapp.client.ContactDetailScreen$SectionFieldManager.deleteAllContent // pc=1
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_40700   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40700   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40700   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40700   // getName->1:     // getName->2:     // getName->N:     // ofs = 40700 ord = 1 addr = 0
	ifne Label6
	return 
Label6:
	new_lib net.rim.device.api.ui.Graphics//net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics
	dup 
	sipush 344
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	lipush 12884967424
	invokespecial_lib net.rim.device.api.ui.component.ButtonField.<init> // pc=4
	astore_1 
	aload_1 
	new ContactDetailScreen$1
	dup 
	aload_0 
	invokespecial com.whatsapp.client.ContactDetailScreen$1.<init> // pc=2
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_40744   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40744   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40744   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40744   // getName->1:     // getName->2:     // getName->N:     // ofs = 40744 ord = 12 addr = 0
	aload_1 
	invokenonvirtual com.whatsapp.client.ContactDetailScreen$SectionFieldManager.addContentRow // pc=2
	return 
	}


private com.whatsapp.client.ContactDetailScreen.routine_3864( com.whatsapp.client.ContactDetailScreen ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_40740   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40740   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40740   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40740   // getName->1:     // getName->2:     // getName->N:     // ofs = 40740 ord = 11 addr = 0
	invokenonvirtual com.whatsapp.client.ContactDetailScreen$SectionFieldManager.deleteAllContent // pc=1
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 40696 ord = 0 addr = 0
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
	if_icmpge Label44
	sipush 130
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	invokestatic_lib module:WhatsApp-35.class#1.routine_6655(  ) // class#1
	astore_4 
	aload_1 
	iload_3 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore_5 
	new_lib Class//java.lang.Class java.lang.Class java.lang.Class
	dup 
	aload_5 
	lipush 18014407099416576
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=4
	astore_6 
	aload_6 
	new ContactDetailScreen$EmailCookie
	dup 
	aload_5 
	invokespecial com.whatsapp.client.ContactDetailScreen$EmailCookie.<init> // pc=2
	invokevirtual setCookie( net.rim.device.api.ui.Field, java.lang.Object ) // pc=2
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_40740   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40740   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40740   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40740   // getName->1:     // getName->2:     // getName->N:     // ofs = 40740 ord = 11 addr = 0
	aload_4 
	aload_6 
	invokenonvirtual com.whatsapp.client.ContactDetailScreen$SectionFieldManager.addContentRow // pc=3
	iinc 3 1
	goto Label14
Label44:
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_40740   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40740   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40740   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40740   // getName->1:     // getName->2:     // getName->N:     // ofs = 40740 ord = 11 addr = 0
	iload_2 
	invokestatic_lib java.lang.String toString( int ) // Integer
	invokenonvirtual com.whatsapp.client.ContactDetailScreen$SectionFieldManager.setTitleRightText // pc=2
	return 
	}


private com.whatsapp.client.ContactDetailScreen.routine_3989( com.whatsapp.client.ContactDetailScreen ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_40748   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40748   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40748   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40748   // getName->1:     // getName->2:     // getName->N:     // ofs = 40748 ord = 13 addr = 0
	invokenonvirtual com.whatsapp.client.ContactDetailScreen$SectionFieldManager.deleteAllContent // pc=1
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_40704   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40704   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40704   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40704   // getName->1:     // getName->2:     // getName->N:     // ofs = 40704 ord = 2 addr = 0
	ifne Label6
	return 
Label6:
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 40696 ord = 0 addr = 0
	invokestatic java.util.Hashtable getStatuses(  ) // ContactStatuses
	invokenonvirtual_lib .routine_10092 // pc=2
	ifeq Label11
	return 
Label11:
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 40696 ord = 0 addr = 0
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokevirtual int size( java.util.Vector ) // pc=1
	ifne Label20
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 40696 ord = 0 addr = 0
	invokenonvirtual_lib .routine_10517 // pc=1
	invokevirtual int size( net.rim.device.api.util.IntVector ) // pc=1
	ifne Label20
	return 
Label20:
	new_lib net.rim.device.api.ui.Graphics//net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics
	dup 
	sipush 921
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	lipush 12884967424
	invokespecial_lib net.rim.device.api.ui.component.ButtonField.<init> // pc=4
	astore_1 
	aload_1 
	new ContactDetailScreen$2
	dup 
	aload_0 
	invokespecial com.whatsapp.client.ContactDetailScreen$2.<init> // pc=2
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_40748   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40748   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40748   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40748   // getName->1:     // getName->2:     // getName->N:     // ofs = 40748 ord = 13 addr = 0
	aload_1 
	invokenonvirtual com.whatsapp.client.ContactDetailScreen$SectionFieldManager.addContentRow // pc=2
	return 
	}


private com.whatsapp.client.ContactDetailScreen.routine_4101( com.whatsapp.client.ContactDetailScreen ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_40752   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40752   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40752   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40752   // getName->1:     // getName->2:     // getName->N:     // ofs = 40752 ord = 14 addr = 0
	invokenonvirtual com.whatsapp.client.ContactDetailScreen$SectionFieldManager.deleteAllContent // pc=1
	invokestatic java.util.Hashtable getStatuses(  ) // ContactStatuses
	astore_1 
	aload_0 
	aload_1 
	bipush 57
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 40696 ord = 0 addr = 0
	getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	bipush 3
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_4285 // pc=5
	aload_0 
	aload_1 
	bipush 58
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 40696 ord = 0 addr = 0
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	bipush 4
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_4285 // pc=5
	aload_0 
	aload_1 
	bipush 59
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 40696 ord = 0 addr = 0
	getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	iconst_1 
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_4285 // pc=5
	aload_0 
	aload_1 
	bipush 60
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 40696 ord = 0 addr = 0
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	bipush 2
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_4285 // pc=5
	aload_0 
	aload_1 
	bipush 61
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 40696 ord = 0 addr = 0
	getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	iconst_0 
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_4285 // pc=5
	aload_0 
	aload_1 
	sipush 354
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 40696 ord = 0 addr = 0
	getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	bipush 8
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_4285 // pc=5
	aload_0 
	aload_1 
	bipush 62
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 40696 ord = 0 addr = 0
	getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	bipush 5
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_4285 // pc=5
	aload_0 
	aload_1 
	bipush 63
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 40696 ord = 0 addr = 0
	getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	bipush 6
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_4285 // pc=5
	aload_0 
	aload_1 
	sipush 355
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 40696 ord = 0 addr = 0
	getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	bipush 9
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_4285 // pc=5
	aload_0 
	aload_1 
	bipush 64
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 40696 ord = 0 addr = 0
	getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	bipush 7
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_4285 // pc=5
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_40752   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40752   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40752   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40752   // getName->1:     // getName->2:     // getName->N:     // ofs = 40752 ord = 14 addr = 0
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_40752   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40752   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40752   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40752   // getName->1:     // getName->2:     // getName->N:     // ofs = 40752 ord = 14 addr = 0
	invokenonvirtual com.whatsapp.client.ContactDetailScreen$SectionFieldManager.getSeparatedContentRowCount // pc=1
	invokestatic_lib java.lang.String toString( int ) // Integer
	invokenonvirtual com.whatsapp.client.ContactDetailScreen$SectionFieldManager.setTitleRightText // pc=2
	return 
	}


private com.whatsapp.client.ContactDetailScreen.routine_4285( com.whatsapp.client.ContactDetailScreen, java.util.Hashtable, int, java.lang.String, int ); // address: 0
	{
	enter 
	aload_3 
	ifnonnull Label4
	goto_w Label97
Label4:
	aload_3 
	invokenonvirtual_lib java.lang.String.trim // pc=1
	stringlength 
	ifgt Label9
	goto_w Label97
Label9:
	iload_2 
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	invokestatic_lib module:WhatsApp-35.class#1.routine_6655(  ) // class#1
	astore_5 
	new_lib Class//java.lang.Class java.lang.Class java.lang.Class
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
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_40752   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40752   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40752   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40752   // getName->1:     // getName->2:     // getName->N:     // ofs = 40752 ord = 14 addr = 0
	aload_5 
	aload_6 
	invokenonvirtual com.whatsapp.client.ContactDetailScreen$SectionFieldManager.addContentRow // pc=3
	aload_1 
	aload_3 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast ContactStatusDetails
	astore_7 
	aload_7 
	ifnonnull Label37
	goto_w Label91
Label37:
	aload_6 
	aload_7 
	invokevirtual setCookie( net.rim.device.api.ui.Field, java.lang.Object ) // pc=2
	bipush 68
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	invokestatic_lib module:WhatsApp-35.class#1.routine_6655(  ) // class#1
	astore_5 
	aload_7 
	invokenonvirtual com.whatsapp.client.ContactStatusDetails.getTimeSet // pc=1
	invokestatic_lib module:WhatsApp-2.class#18.routine_13309(  ) // class#18
	astore 8
	new_lib //module:WhatsApp-13.class#11 module:WhatsApp-13.class#11 module:WhatsApp-13.class#11
	dup 
	aload_7 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	lipush 36028805676007424
	invokespecial_lib .routine_3170 // pc=4
	astore 9
	new_lib com.whatsapp.field.ColorLabelField//com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField
	dup 
	new_lib net.rim.device.api.system.ApplicationManager//net.rim.device.api.system.ApplicationManager net.rim.device.api.system.ApplicationManager net.rim.device.api.system.ApplicationManager
	dup 
	ldc literal_203:"@ "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 8
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	iipush 9014931
	lipush 8589934592
	invokespecial_lib .routine_5006 // pc=5
	astore 10
	new_lib net.rim.device.api.ui.Font//net.rim.device.api.ui.Font net.rim.device.api.ui.Font net.rim.device.api.ui.Font
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
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_40752   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40752   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40752   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40752   // getName->1:     // getName->2:     // getName->N:     // ofs = 40752 ord = 14 addr = 0
	aload_5 
	aload 11
	iconst_0 
	iconst_1 
	iconst_1 
	invokenonvirtual com.whatsapp.client.ContactDetailScreen$SectionFieldManager.addContentRow // pc=6
	aload_0 
	aload_7 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_4558 // pc=2
	return 
Label91:
	aload_6 
	new ContactDetailScreen$PhoneCookie
	dup 
	aload_3 
	invokespecial com.whatsapp.client.ContactDetailScreen$PhoneCookie.<init> // pc=2
	invokevirtual setCookie( net.rim.device.api.ui.Field, java.lang.Object ) // pc=2
Label97:
	return 
	}


private com.whatsapp.client.ContactDetailScreen.routine_4558( com.whatsapp.client.ContactDetailScreen, java.lang.String ); // address: 0
	{
	enter 
	sipush 846
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	sipush 834
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	invokestatic_lib module:WhatsApp-35.class#1.routine_6672(  ) // class#1
	astore_2 
	new_lib com.whatsapp.client.MediaPreviewButton//com.whatsapp.client.MediaPreviewButton com.whatsapp.client.MediaPreviewButton com.whatsapp.client.MediaPreviewButton
	dup 
	bipush 16
	aload_2 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_40752   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40752   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40752   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40752   // getName->1:     // getName->2:     // getName->N:     // ofs = 40752 ord = 14 addr = 0
	invokenonvirtual com.whatsapp.client.ContactDetailScreen$SectionFieldManager.getLabelColor // pc=1
	invokespecial_lib .routine_8253 // pc=4
	astore_3 
	aload_3 
	invokenonvirtual_lib .routine_7212 // pc=1
	istore_4 
	new_lib com.whatsapp.field.ProgressAnimationField//com.whatsapp.field.ProgressAnimationField com.whatsapp.field.ProgressAnimationField com.whatsapp.field.ProgressAnimationField
	dup 
	lipush 12884901888
	invokespecial_lib .routine_6743 // pc=3
	astore_5 
	aload_5 
	invokestatic_lib com.whatsapp.client.MediaPreviewButton.routine_8303(  ) // MediaPreviewButton
	invokestatic_lib module:WhatsApp-43.class#0.routine_1317(  ) // class#0
	new ContactDetailScreen$3
	dup 
	aload_0 
	aload_1 
	aload_3 
	invokespecial com.whatsapp.client.ContactDetailScreen$3.<init> // pc=4
	astore_6 
	new ContactDetailScreen$4
	dup 
	aload_0 
	aload_1 
	iload_4 
	aload_3 
	aload_5 
	invokespecial com.whatsapp.client.ContactDetailScreen$4.<init> // pc=6
	astore_7 
	aload_3 
	new ContactDetailScreen$5
	dup 
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.ContactDetailScreen$5.<init> // pc=3
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_40752   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40752   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40752   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40752   // getName->1:     // getName->2:     // getName->N:     // ofs = 40752 ord = 14 addr = 0
	aconst_null 
	aload_5 
	iconst_0 
	iconst_1 
	iconst_0 
	invokenonvirtual com.whatsapp.client.ContactDetailScreen$SectionFieldManager.addContentRow // pc=6
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_40760   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40760   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40760   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40760   // getName->1:     // getName->2:     // getName->N:     // ofs = 40760 ord = 16 addr = 0
	aload_7 
	invokenonvirtual_lib .routine_5402 // pc=2
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_40760   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40760   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40760   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40760   // getName->1:     // getName->2:     // getName->N:     // ofs = 40760 ord = 16 addr = 0
	aload_6 
	invokenonvirtual_lib .routine_5402 // pc=2
	return 
	}


private com.whatsapp.client.ContactDetailScreen.routine_4717( com.whatsapp.client.ContactDetailScreen ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_40756   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40756   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40756   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40756   // getName->1:     // getName->2:     // getName->N:     // ofs = 40756 ord = 15 addr = 0
	invokenonvirtual com.whatsapp.client.ContactDetailScreen$SectionFieldManager.deleteAllContent // pc=1
	aload_0 
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 40696 ord = 0 addr = 0
	getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 40696 ord = 0 addr = 0
	getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 40696 ord = 0 addr = 0
	getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 40696 ord = 0 addr = 0
	getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 40696 ord = 0 addr = 0
	getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 40696 ord = 0 addr = 0
	getfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_4906 // pc=7
	astore_1 
	aload_1 
	stringlength 
	ifle Label35
	bipush 57
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	invokestatic_lib module:WhatsApp-35.class#1.routine_6655(  ) // class#1
	astore_2 
	new_lib Class//java.lang.Class java.lang.Class java.lang.Class
	dup 
	aload_1 
	lipush 18014407099416581
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=4
	astore_3 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_40756   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40756   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40756   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40756   // getName->1:     // getName->2:     // getName->N:     // ofs = 40756 ord = 15 addr = 0
	aload_2 
	aload_3 
	invokenonvirtual com.whatsapp.client.ContactDetailScreen$SectionFieldManager.addContentRow // pc=3
Label35:
	aload_0 
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 40696 ord = 0 addr = 0
	getfield .field_24_24   // get_name_1:  .field_24_24   // get_name_2:  .field_24_24   // get_Name:    .field_24_24   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 24
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 40696 ord = 0 addr = 0
	getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 40696 ord = 0 addr = 0
	getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 40696 ord = 0 addr = 0
	getfield .field_27_27   // get_name_1:  .field_27_27   // get_name_2:  .field_27_27   // get_Name:    .field_27_27   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 27
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 40696 ord = 0 addr = 0
	getfield .field_28_28   // get_name_1:  .field_28_28   // get_name_2:  .field_28_28   // get_Name:    .field_28_28   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 28
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 40696 ord = 0 addr = 0
	getfield .field_29_29   // get_name_1:  .field_29_29   // get_name_2:  .field_29_29   // get_Name:    .field_29_29   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 29
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_4906 // pc=7
	astore_2 
	aload_2 
	stringlength 
	ifle Label67
	bipush 59
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	invokestatic_lib module:WhatsApp-35.class#1.routine_6655(  ) // class#1
	astore_3 
	new_lib Class//java.lang.Class java.lang.Class java.lang.Class
	dup 
	aload_2 
	lipush 18014407099416581
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=4
	astore_4 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_40756   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40756   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40756   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40756   // getName->1:     // getName->2:     // getName->N:     // ofs = 40756 ord = 15 addr = 0
	aload_3 
	aload_4 
	invokenonvirtual com.whatsapp.client.ContactDetailScreen$SectionFieldManager.addContentRow // pc=3
Label67:
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_40756   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40756   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40756   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40756   // getName->1:     // getName->2:     // getName->N:     // ofs = 40756 ord = 15 addr = 0
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_40756   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40756   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40756   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40756   // getName->1:     // getName->2:     // getName->N:     // ofs = 40756 ord = 15 addr = 0
	invokenonvirtual com.whatsapp.client.ContactDetailScreen$SectionFieldManager.getSeparatedContentRowCount // pc=1
	invokestatic_lib java.lang.String toString( int ) // Integer
	invokenonvirtual com.whatsapp.client.ContactDetailScreen$SectionFieldManager.setTitleRightText // pc=2
	return 
	}


private java.lang.String com.whatsapp.client.ContactDetailScreen.routine_4906( com.whatsapp.client.ContactDetailScreen, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	new_lib net.rim.device.api.system.ApplicationManager//net.rim.device.api.system.ApplicationManager net.rim.device.api.system.ApplicationManager net.rim.device.api.system.ApplicationManager
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
	invokestatic com.whatsapp.client.ContactDetailScreen.routine_6129( java.lang.StringBuffer, java.lang.String ) // ContactDetailScreen
	aload_7 
	aload_2 
	invokestatic com.whatsapp.client.ContactDetailScreen.routine_6129( java.lang.StringBuffer, java.lang.String ) // ContactDetailScreen
	new_lib net.rim.device.api.system.ApplicationManager//net.rim.device.api.system.ApplicationManager net.rim.device.api.system.ApplicationManager net.rim.device.api.system.ApplicationManager
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
	invokestatic com.whatsapp.client.ContactDetailScreen.routine_6129( java.lang.StringBuffer, java.lang.String ) // ContactDetailScreen
	aload_7 
	aload_6 
	invokestatic com.whatsapp.client.ContactDetailScreen.routine_6129( java.lang.StringBuffer, java.lang.String ) // ContactDetailScreen
Label83:
	aload_7 
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}


private com.whatsapp.client.ContactDetailScreen.routine_5092( com.whatsapp.client.ContactDetailScreen ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokenonvirtual_lib .routine_6648 // pc=1
	invokevirtual deleteAll( net.rim.device.api.ui.Manager ) // pc=1
	aload_0 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_40724   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40724   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40724   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40724   // getName->1:     // getName->2:     // getName->N:     // ofs = 40724 ord = 7 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_40736   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40736   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40736   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40736   // getName->1:     // getName->2:     // getName->N:     // ofs = 40736 ord = 10 addr = 0
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_5183 // pc=2
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_40700   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40700   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40700   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40700   // getName->1:     // getName->2:     // getName->N:     // ofs = 40700 ord = 1 addr = 0
	ifeq Label15
	aload_0 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_40744   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40744   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40744   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40744   // getName->1:     // getName->2:     // getName->N:     // ofs = 40744 ord = 12 addr = 0
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_5183 // pc=2
Label15:
	aload_0 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_40740   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40740   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40740   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40740   // getName->1:     // getName->2:     // getName->N:     // ofs = 40740 ord = 11 addr = 0
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_5183 // pc=2
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_40704   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40704   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40704   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40704   // getName->1:     // getName->2:     // getName->N:     // ofs = 40704 ord = 2 addr = 0
	ifeq Label23
	aload_0 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_40748   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40748   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40748   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40748   // getName->1:     // getName->2:     // getName->N:     // ofs = 40748 ord = 13 addr = 0
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_5183 // pc=2
Label23:
	aload_0 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_40752   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40752   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40752   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40752   // getName->1:     // getName->2:     // getName->N:     // ofs = 40752 ord = 14 addr = 0
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_5183 // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_40756   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40756   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40756   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40756   // getName->1:     // getName->2:     // getName->N:     // ofs = 40756 ord = 15 addr = 0
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_5183 // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_40728   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40728   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40728   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40728   // getName->1:     // getName->2:     // getName->N:     // ofs = 40728 ord = 8 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_40724   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40724   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40724   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40724   // getName->1:     // getName->2:     // getName->N:     // ofs = 40724 ord = 7 addr = 0
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	return 
	}


private com.whatsapp.client.ContactDetailScreen.routine_5183( com.whatsapp.client.ContactDetailScreen, com.whatsapp.client.ContactDetailScreen$SectionFieldManager ); // address: 0
	{
	enter_narrow 
	aload_1 
	invokenonvirtual com.whatsapp.client.ContactDetailScreen$SectionFieldManager.isContentEmpty // pc=1
	ifne Label9
	aload_0 
	aload_1 
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_1 
	invokenonvirtual com.whatsapp.client.ContactDetailScreen$SectionFieldManager.updateStyle // pc=1
Label9:
	return 
	}


private com.whatsapp.client.ContactDetailScreen.routine_5217( com.whatsapp.client.ContactDetailScreen ); // address: 0
	{
	enter 
	iipush 310000
	istore_1 
	bipush 10
	istore_2 
	aload_0 
	sipush 265
	getstatic STRING_EMPTY_STRING // Constants
	invokestatic_lib module:WhatsApp-29.class#7.routine_3635(  ) // class#7
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	new ContactDetailScreen$6
	dup 
	aload_0 
	invokespecial com.whatsapp.client.ContactDetailScreen$6.<init> // pc=2
	invokestatic_lib module:WhatsApp-36.class#14.routine_4901(  ) // class#14
	putfield com.whatsapp.client.ContactDetailScreen.field_40708   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40708   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40708   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40708   // getName->1:     // getName->2:     // getName->N:     // ofs = 40708 ord = 3 addr = 0
	aload_0 
	new ContactDetailScreen$7
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-29.class#7.routine_3556(  ) // class#7
	sipush 921
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial com.whatsapp.client.ContactDetailScreen$7.<init> // pc=6
	putfield com.whatsapp.client.ContactDetailScreen.field_40720   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40720   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40720   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40720   // getName->1:     // getName->2:     // getName->N:     // ofs = 40720 ord = 6 addr = 0
	aload_0 
	bipush 69
	getstatic STRING_EMPTY_STRING // Constants
	invokestatic_lib module:WhatsApp-29.class#7.routine_3635(  ) // class#7
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	new ContactDetailScreen$8
	dup 
	aload_0 
	invokespecial com.whatsapp.client.ContactDetailScreen$8.<init> // pc=2
	invokestatic_lib module:WhatsApp-36.class#14.routine_4901(  ) // class#14
	putfield com.whatsapp.client.ContactDetailScreen.field_40712   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40712   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40712   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40712   // getName->1:     // getName->2:     // getName->N:     // ofs = 40712 ord = 4 addr = 0
	aload_0 
	bipush 71
	getstatic STRING_EMPTY_STRING // Constants
	invokestatic_lib module:WhatsApp-29.class#7.routine_3635(  ) // class#7
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	new ContactDetailScreen$9
	dup 
	aload_0 
	invokespecial com.whatsapp.client.ContactDetailScreen$9.<init> // pc=2
	invokestatic_lib module:WhatsApp-36.class#14.routine_4901(  ) // class#14
	putfield com.whatsapp.client.ContactDetailScreen.field_40716   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40716   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40716   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40716   // getName->1:     // getName->2:     // getName->N:     // ofs = 40716 ord = 5 addr = 0
	return 
	}


private openMediaBrowser( com.whatsapp.client.ContactDetailScreen, java.lang.String ); // address: 0
	{
	enter 
	invokestatic_lib com.whatsapp.client.UiApp.routine_3456(  ) // UiApp
	astore_2 
	new_lib com.whatsapp.client.MediaBrowserScreen//com.whatsapp.client.MediaBrowserScreen com.whatsapp.client.MediaBrowserScreen com.whatsapp.client.MediaBrowserScreen
	dup 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_40732   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40732   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40732   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40732   // getName->1:     // getName->2:     // getName->N:     // ofs = 40732 ord = 9 addr = 0
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.LabelField ) // pc=1
	aload_1 
	aconst_null 
	invokespecial_lib .routine_3491 // pc=4
	astore_3 
	new_lib net.rim.device.api.system.ApplicationDescriptor//net.rim.device.api.system.ApplicationDescriptor net.rim.device.api.system.ApplicationDescriptor net.rim.device.api.system.ApplicationDescriptor
	dup 
	bipush 2
	invokespecial_lib net.rim.device.api.ui.TransitionContext.<init> // pc=2
	astore_4 
	aload_4 
	bipush 4
	iconst_1 
	invokevirtual setIntAttribute( net.rim.device.api.ui.TransitionContext, int, int ) // pc=3
	new_lib net.rim.device.api.system.ApplicationDescriptor//net.rim.device.api.system.ApplicationDescriptor net.rim.device.api.system.ApplicationDescriptor net.rim.device.api.system.ApplicationDescriptor
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
	new ContactDetailScreen$10
	dup 
	aload_0 
	aload_2 
	aload_3 
	invokespecial com.whatsapp.client.ContactDetailScreen$10.<init> // pc=4
	invokevirtual addScreenUiEngineAttachedListener( net.rim.device.api.ui.Screen, net.rim.device.api.ui.ScreenUiEngineAttachedListener ) // pc=2
	aload_3 
	aload_0_getfield _mmsCount   // get_name_1:  _mmsCount   // get_name_2:  _mmsCount   // get_Name:    _mmsCount   // getName->1:  _mmsCount   // getName->2:  _mmsCount   // getName->N:  _mmsCount   // ofs = 40764 ord = 17 addr = 0
	invokenonvirtual_lib .routine_3122 // pc=2
	aload_2 
	aload_3 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}


private showChatScreen( com.whatsapp.client.ContactDetailScreen ); // address: 0
	{
	enter 
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 40696 ord = 0 addr = 0
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
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 40696 ord = 0 addr = 0
	aload_0 
	invokestatic_lib com.whatsapp.client.TabButton.routine_5435(  ) // TabButton
	pop 
	return 
Label23:
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 40696 ord = 0 addr = 0
	invokestatic_lib com.whatsapp.client.TabButton.routine_5702(  ) // TabButton
	astore_2 
	aload_2 
	ifnull Label32
	aload_2 
	aload_0 
	invokestatic_lib com.whatsapp.client.TabButton.routine_5468(  ) // TabButton
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
	checkcastbranch 
	invokenonvirtual com.whatsapp.client.ContactDetailScreen$EmailCookie.getAddress // pc=1
	astore_1 
	goto Label72
Label18:
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 40696 ord = 0 addr = 0
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
	newarray_object_lib Object//java.lang.Object java.lang.Object java.lang.Object
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
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
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
	ldc literal_204:"new"
	aload_1 
	getstatic STRING_EMPTY_STRING // Constants
	getstatic STRING_EMPTY_STRING // Constants
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
	checkcastbranch 
	invokenonvirtual com.whatsapp.client.ContactDetailScreen$PhoneCookie.getPhoneNumber // pc=1
	astore_1 
	goto_w Label90
Label18:
	aload_3 
	checkcastbranch 
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	astore_1 
	goto_w Label90
Label23:
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 40696 ord = 0 addr = 0
	invokenonvirtual_lib .routine_10383 // pc=1
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
	goto Label90
Label38:
	iload_5 
	iconst_1 
	if_icmple Label90
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
	if_icmpge Label73
	aload_4 
	iload 8
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore 9
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 40696 ord = 0 addr = 0
	aload 9
	invokenonvirtual_lib .routine_10219 // pc=2
	aload 9
	invokestatic_lib module:WhatsApp-35.class#1.routine_6672(  ) // class#1
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
Label73:
	bipush 30
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	aload_6 
	iconst_0 
	invokestatic_lib int ask( java.lang.String, java.lang.Object[], int ) // Dialog
	istore 8
	iload 8
	bipush -1
	if_icmple Label90
	iload 8
	aload_6 
	arraylength 
	if_icmpge Label90
	aload_7 
	iload 8
	aaload 
	astore_1 
Label90:
	aload_1 
	ifnull Label101
	bipush 4
	new_lib net.rim.blackberry.api.invoke.PhoneArguments//net.rim.blackberry.api.invoke.PhoneArguments net.rim.blackberry.api.invoke.PhoneArguments net.rim.blackberry.api.invoke.PhoneArguments
	dup 
	ldc literal_205:"call"
	aload_1 
	invokespecial_lib net.rim.blackberry.api.invoke.PhoneArguments.<init> // pc=3
	invokestatic_lib invokeApplication( int, net.rim.blackberry.api.invoke.ApplicationArguments ) // Invoke
	return 
	astore_4 
Label101:
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public populateContactData( com.whatsapp.client.ContactDetailScreen ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_3504 // pc=1
	aload_0 
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_3564 // pc=1
	aload_0 
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_3786 // pc=1
	aload_0 
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_3864 // pc=1
	aload_0 
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_3989 // pc=1
	aload_0 
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_4101 // pc=1
	aload_0 
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_4717 // pc=1
	aload_0 
	invokespecial com.whatsapp.client.ContactDetailScreen.routine_5092 // pc=1
	return 
	}


protected onAddButtonClick( com.whatsapp.client.ContactDetailScreen ); // address: 0
	{
	noenter_return 
	}


public onContactUpdated( com.whatsapp.client.ContactDetailScreen, module:WhatsApp.class#31 ); // address: 0
	{
	enter_narrow 
	aload_1 
	ifnull Label6
	aload_0 
	aload_1 
	putfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 40696 ord = 0 addr = 0
Label6:
	aload_0 
	invokenonvirtual com.whatsapp.client.ContactDetailScreen.populateContactData // pc=1
	return 
	}


public closeScreen( com.whatsapp.client.ContactDetailScreen ); // address: 0
	{
	enter_narrow 
	invokestatic_lib com.whatsapp.client.UiApp.routine_3456(  ) // UiApp
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
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 40696 ord = 0 addr = 0
	iconst_0 
	invokenonvirtual_lib .routine_9670 // pc=2
	astore_5 
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 40696 ord = 0 addr = 0
	invokenonvirtual_lib .routine_9943 // pc=1
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
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_40708   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40708   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40708   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40708   // getName->1:     // getName->2:     // getName->N:     // ofs = 40708 ord = 3 addr = 0
	sipush 265
	aload_7 
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokestatic_lib module:WhatsApp-29.class#7.routine_3635(  ) // class#7
	invokenonvirtual_lib .routine_4832 // pc=2
	goto Label44
Label39:
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_40708   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40708   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40708   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40708   // getName->1:     // getName->2:     // getName->N:     // ofs = 40708 ord = 3 addr = 0
	sipush 265
	aload_5 
	invokestatic_lib module:WhatsApp-29.class#7.routine_3635(  ) // class#7
	invokenonvirtual_lib .routine_4832 // pc=2
Label44:
	aload_1 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_40708   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40708   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40708   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40708   // getName->1:     // getName->2:     // getName->N:     // ofs = 40708 ord = 3 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	goto Label51
Label48:
	aload_1 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_40720   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40720   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40720   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40720   // getName->1:     // getName->2:     // getName->N:     // ofs = 40720 ord = 6 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label51:
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 40696 ord = 0 addr = 0
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_7 
	iload_7 
	ifle Label79
	iload_7 
	iconst_1 
	if_icmple Label71
	aload_4 
	instanceof ContactDetailScreen$EmailCookie
	ifeq Label71
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_40712   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40712   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40712   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40712   // getName->1:     // getName->2:     // getName->N:     // ofs = 40712 ord = 4 addr = 0
	bipush 69
	aload_4 
	checkcast ContactDetailScreen$EmailCookie
	invokenonvirtual com.whatsapp.client.ContactDetailScreen$EmailCookie.getAddress // pc=1
	invokestatic_lib module:WhatsApp-29.class#7.routine_3635(  ) // class#7
	invokenonvirtual_lib .routine_4832 // pc=2
	goto Label76
Label71:
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_40712   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40712   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40712   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40712   // getName->1:     // getName->2:     // getName->N:     // ofs = 40712 ord = 4 addr = 0
	bipush 69
	aload_5 
	invokestatic_lib module:WhatsApp-29.class#7.routine_3635(  ) // class#7
	invokenonvirtual_lib .routine_4832 // pc=2
Label76:
	aload_1 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_40712   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40712   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40712   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40712   // getName->1:     // getName->2:     // getName->N:     // ofs = 40712 ord = 4 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label79:
	aload_0_getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 40696 ord = 0 addr = 0
	invokenonvirtual_lib .routine_10517 // pc=1
	invokevirtual int size( net.rim.device.api.util.IntVector ) // pc=1
	istore 8
	iload 8
	ifle Label111
	iload 8
	iconst_1 
	if_icmple Label93
	aload_4 
	checkcastbranch 
	invokenonvirtual com.whatsapp.client.ContactDetailScreen$PhoneCookie.getPhoneNumber // pc=1
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
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_40716   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40716   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40716   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40716   // getName->1:     // getName->2:     // getName->N:     // ofs = 40716 ord = 5 addr = 0
	bipush 71
	aload 9
	invokestatic_lib module:WhatsApp-29.class#7.routine_3635(  ) // class#7
	invokenonvirtual_lib .routine_4832 // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_40716   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40716   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40716   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40716   // getName->1:     // getName->2:     // getName->N:     // ofs = 40716 ord = 5 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label111:
	aload_4 
	instanceof ContactDetailScreen$EmailCookie
	ifeq Label118
	aload_1 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_40712   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40712   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40712   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40712   // getName->1:     // getName->2:     // getName->N:     // ofs = 40712 ord = 4 addr = 0
	invokevirtual setDefault( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	return 
Label118:
	aload_4 
	instanceof ContactDetailScreen$PhoneCookie
	ifeq Label124
	aload_1 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen.field_40716   // get_name_1:  com.whatsapp.client.ContactDetailScreen.field_40716   // get_name_2:  com.whatsapp.client.ContactDetailScreen.field_40716   // get_Name:    com.whatsapp.client.ContactDetailScreen.field_40716   // getName->1:     // getName->2:     // getName->N:     // ofs = 40716 ord = 5 addr = 0
	invokevirtual setDefault( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label124:
	return 
	}


public module:WhatsApp.class#31 getContactInfoDetails( com.whatsapp.client.ContactDetailScreen ); // address: 0
	{
	areturn_field _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 40696 ord = 0 addr = 0
	}

}
