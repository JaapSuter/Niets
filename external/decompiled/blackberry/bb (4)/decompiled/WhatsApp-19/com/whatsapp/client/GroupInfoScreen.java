// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-19.cod
// Module version  : 2.7.3204
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


abstract public final class GroupInfoScreen extends com.whatsapp.field.
implements com.whatsapp.client.

{

	// @@@@@@@@@@@@@ Fields 
	private final long /*long*/  field_52728 ; // ofs = 52728 addr = 0)
	private final com.whatsapp.client. /*module:WhatsApp-10.class#0*/  _group ; // ofs = 52732 addr = 0)
	private final String /*java.lang.String*/  _jid ; // ofs = 52736 addr = 0)
	private final int /*int*/  field_52740 ; // ofs = 52740 addr = 0)
	private net.rim.device.api.ui.component.NullField /*net.rim.device.api.ui.component.NullField*/  field_52744 ; // ofs = 52744 addr = 0)
	private com.whatsapp.field.WAHorizontalFieldManager /*com.whatsapp.field.WAHorizontalFieldManager*/  field_52748 ; // ofs = 52748 addr = 0)
	private com.whatsapp.field. /*module:WhatsApp-38.class#12*/  field_52752 ; // ofs = 52752 addr = 0)
	private com.whatsapp.client.BitmapButtonField /*com.whatsapp.client.BitmapButtonField*/  field_52756 ; // ofs = 52756 addr = 0)
	private com.whatsapp.client.BBMStyleInputField /*com.whatsapp.client.BBMStyleInputField*/  _subjectLabel ; // ofs = 52760 addr = 0)
	private com.whatsapp.client. /*module:WhatsApp-21.class#4*/  _groupMediaLabel ; // ofs = 52764 addr = 0)
	private com.whatsapp.field.ProgressAnimationField /*module:WhatsApp-38.class#8*/  _groupMediaProgress ; // ofs = 52768 addr = 0)
	private com.whatsapp.client.MediaPreviewButton /*com.whatsapp.client.MediaPreviewButton*/  _groupMediaButton ; // ofs = 52772 addr = 0)
	private com.whatsapp.client.LeftRightLabelField /*module:WhatsApp-21.class#4*/  field_52776 ; // ofs = 52776 addr = 0)
	private com.whatsapp.client. /*module:WhatsApp-13.class#6*/  _contactPickerField ; // ofs = 52780 addr = 0)
	private com.whatsapp.client. /*module:WhatsApp-36.class#17*/  field_52784 ; // ofs = 52784 addr = 0)
	private com.whatsapp.client.WAMenuItem /*module:WhatsApp-36.class#17*/  field_52788 ; // ofs = 52788 addr = 0)
	private com.whatsapp.client.WAMenuItem /*module:WhatsApp-36.class#17*/  field_52792 ; // ofs = 52792 addr = 0)
	private com.whatsapp.client.WAMenuItem /*module:WhatsApp-36.class#17*/  field_52796 ; // ofs = 52796 addr = 0)
	private java.util.Vector /*java.util.Vector*/  field_52800 ; // ofs = 52800 addr = 0)
	private java.util.Vector /*java.util.Vector*/  field_52804 ; // ofs = 52804 addr = 0)
	private boolean /*boolean*/  field_52808 ; // ofs = 52808 addr = 0)
	private final com.whatsapp.client.Worklist /*module:WhatsApp-36.class#24*/  field_52812 ; // ofs = 52812 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.GroupInfoScreen, module:WhatsApp-10.class#0, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	iconst_0 
	i2l 
	aload_1 
	aload_2 
	invokespecial com.whatsapp.client.GroupInfoScreen.<init> // pc=5
	return 
	}


static private final setMediaPadding( net.rim.device.api.ui.Field ); // address: 0
	{
	enter 
	aload_0 
	invokestatic_lib com.whatsapp.client.MediaPreviewButton.routine_2628(  ) // MediaPreviewButton
	invokestatic_lib module:WhatsApp-35.class#0.routine_7038(  ) // class#0
	return 
	}


public <init>( com.whatsapp.client.GroupInfoScreen, long, module:WhatsApp-10.class#0, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	iconst_0 
	i2l 
	invokespecial_lib .routine_272 // pc=3
	aload_0 
	new_lib com.whatsapp.client.Worklist//module:WhatsApp-36.class#24 module:WhatsApp-36.class#24 module:WhatsApp-36.class#24
	dup 
	invokespecial_lib .routine_9364 // pc=1
	putfield com.whatsapp.client.GroupInfoScreen.field_52812   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52812   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52812   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52812   // getName->1:     // getName->2:     // getName->N:     // ofs = 52812 ord = 21 addr = 0
	aload_0 
	lload 1
	lputfield com.whatsapp.client.GroupInfoScreen.field_52728   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52728   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52728   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52728   // getName->1:     // getName->2:     // getName->N:     // ofs = 52728 ord = 0 addr = 0
	aload_0 
	aload_3 
	putfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 52732 ord = 1 addr = 0
	aload_0 
	aload_4 
	putfield _jid   // get_name_1:  _jid   // get_name_2:  _jid   // get_Name:    _jid   // getName->1:  _jid   // getName->2:  _jid   // getName->N:  _jid   // ofs = 52736 ord = 2 addr = 0
	aload_0 
	invokestatic_lib module:WhatsApp-35.class#0.routine_5461(  ) // class#0
	invokevirtual setTitleBar( net.rim.device.api.ui.Screen, net.rim.device.api.ui.component.TitleBar ) // pc=2
	aload_0 
	lipush 1845547789481896446
	bipush 3
	invokestatic_lib module:WhatsApp-35.class#0.routine_5145(  ) // class#0
	putfield com.whatsapp.client.GroupInfoScreen.field_52740   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52740   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52740   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52740   // getName->1:     // getName->2:     // getName->N:     // ofs = 52740 ord = 3 addr = 0
	aload_0 
	aload_0 
	invokespecial com.whatsapp.client.GroupInfoScreen.routine_1186 // pc=1
	putfield com.whatsapp.client.GroupInfoScreen.field_52800   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52800   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52800   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52800   // getName->1:     // getName->2:     // getName->N:     // ofs = 52800 ord = 18 addr = 0
	aload_0 
	invokestatic_lib module:WhatsApp-7.class#22.routine_4386(  ) // class#22
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	aload_0 
	invokespecial com.whatsapp.client.GroupInfoScreen.routine_1801 // pc=1
	aload_0 
	invokespecial com.whatsapp.client.GroupInfoScreen.routine_935 // pc=1
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.GroupInfoScreen.routine_672( com.whatsapp.client.GroupInfoScreen ); // address: 0
	{
	enter 
	aload_0 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	sipush 915
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	aload_0 
	invokespecial com.whatsapp.client.GroupInfoScreen.routine_1744 // pc=1
	invokestatic_lib module:WhatsApp-21.class#4.routine_3878(  ) // class#4
	putfield com.whatsapp.client.GroupInfoScreen.field_52776   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52776   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52776   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52776   // getName->1:     // getName->2:     // getName->N:     // ofs = 52776 ord = 12 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52776   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52776   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52776   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52776   // getName->1:     // getName->2:     // getName->N:     // ofs = 52776 ord = 12 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib com.whatsapp.client.ContactPickerField//module:WhatsApp-13.class#6 module:WhatsApp-13.class#6 module:WhatsApp-13.class#6
	dup 
	aload_0 
	lgetfield com.whatsapp.client.GroupInfoScreen.field_52728   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52728   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52728   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52728   // getName->1:     // getName->2:     // getName->N:     // ofs = 52728 ord = 0 addr = 0
	invokespecial_lib .routine_8621 // pc=3
	putfield _contactPickerField   // get_name_1:  _contactPickerField   // get_name_2:  _contactPickerField   // get_Name:    _contactPickerField   // getName->1:  _contactPickerField   // getName->2:  _contactPickerField   // getName->N:  _contactPickerField   // ofs = 52780 ord = 13 addr = 0
	aload_0_getfield _contactPickerField   // get_name_1:  _contactPickerField   // get_name_2:  _contactPickerField   // get_Name:    _contactPickerField   // getName->1:  _contactPickerField   // getName->2:  _contactPickerField   // getName->N:  _contactPickerField   // ofs = 52780 ord = 13 addr = 0
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52800   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52800   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52800   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52800   // getName->1:     // getName->2:     // getName->N:     // ofs = 52800 ord = 18 addr = 0
	invokenonvirtual_lib .routine_7160 // pc=2
	aload_0_getfield _contactPickerField   // get_name_1:  _contactPickerField   // get_name_2:  _contactPickerField   // get_Name:    _contactPickerField   // getName->1:  _contactPickerField   // getName->2:  _contactPickerField   // getName->N:  _contactPickerField   // ofs = 52780 ord = 13 addr = 0
	new_lib com.whatsapp.client.//module:WhatsApp-18.class#27 module:WhatsApp-18.class#27 module:WhatsApp-18.class#27
	dup 
	aload_0 
	invokespecial_lib .routine_10018 // pc=2
	invokenonvirtual_lib .routine_7276 // pc=2
	aload_0 
	aload_0_getfield _contactPickerField   // get_name_1:  _contactPickerField   // get_name_2:  _contactPickerField   // get_Name:    _contactPickerField   // getName->1:  _contactPickerField   // getName->2:  _contactPickerField   // getName->N:  _contactPickerField   // ofs = 52780 ord = 13 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	return 
	}


private final com.whatsapp.client.GroupInfoScreen.routine_769( com.whatsapp.client.GroupInfoScreen ); // address: 0
	{
	enter 
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 52732 ord = 1 addr = 0
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual long longValue( java.lang.Long ) // pc=1
	lstore 1
	sipush 923
	bipush 48
	invokestatic_lib net.rim.device.api.i18n.DateFormat getInstance( int ) // DateFormat
	lload 1
	invokevirtual java.lang.String formatLocal( net.rim.device.api.i18n.DateFormat, long ) // pc=3
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	astore_3 
	sipush 924
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 52732 ord = 1 addr = 0
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokestatic_lib module:WhatsApp-9.class#15.routine_8159(  ) // class#15
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	astore_4 
	new_lib com.whatsapp.field.ColorLabelField//com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField
	dup 
	aload_3 
	iipush 8421504
	lipush 36028809903865856
	invokespecial_lib .routine_3777 // pc=5
	astore_5 
	new_lib com.whatsapp.field.ColorLabelField//com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField
	dup 
	aload_4 
	iipush 8421504
	lipush 36028809903865856
	invokespecial_lib .routine_3777 // pc=5
	astore_6 
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	dup 
	lipush 1152921504606846976
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.<init> // pc=3
	astore_7 
	aload_7 
	bipush 12
	bipush 18
	bipush 18
	bipush 18
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_7 
	aload_5 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_7 
	aload_6 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	aload_7 
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	return 
	}


private final com.whatsapp.client.GroupInfoScreen.routine_935( com.whatsapp.client.GroupInfoScreen ); // address: 0
	{
	enter 
	iipush 310000
	istore_1 
	sipush 1200
	istore_2 
	aload_0 
	sipush 265
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	new GroupInfoScreen$6
	dup 
	aload_0 
	invokespecial com.whatsapp.client.GroupInfoScreen$6.<init> // pc=2
	invokestatic_lib module:WhatsApp-36.class#17.routine_7979(  ) // class#17
	putfield com.whatsapp.client.GroupInfoScreen.field_52784   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52784   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52784   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52784   // getName->1:     // getName->2:     // getName->N:     // ofs = 52784 ord = 14 addr = 0
	aload_0 
	sipush 265
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	new GroupInfoScreen$7
	dup 
	aload_0 
	invokespecial com.whatsapp.client.GroupInfoScreen$7.<init> // pc=2
	invokestatic_lib module:WhatsApp-36.class#17.routine_7979(  ) // class#17
	putfield com.whatsapp.client.GroupInfoScreen.field_52788   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52788   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52788   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52788   // getName->1:     // getName->2:     // getName->N:     // ofs = 52788 ord = 15 addr = 0
	aload_0 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4672(  ) // class#18
	sipush 344
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	new GroupInfoScreen$8
	dup 
	aload_0 
	invokespecial com.whatsapp.client.GroupInfoScreen$8.<init> // pc=2
	invokestatic_lib module:WhatsApp-36.class#17.routine_7950(  ) // class#17
	putfield com.whatsapp.client.GroupInfoScreen.field_52792   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52792   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52792   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52792   // getName->1:     // getName->2:     // getName->N:     // ofs = 52792 ord = 16 addr = 0
	aload_0 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4672(  ) // class#18
	sipush 866
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	new GroupInfoScreen$9
	dup 
	aload_0 
	invokespecial com.whatsapp.client.GroupInfoScreen$9.<init> // pc=2
	invokestatic_lib module:WhatsApp-36.class#17.routine_7950(  ) // class#17
	putfield com.whatsapp.client.GroupInfoScreen.field_52796   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52796   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52796   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52796   // getName->1:     // getName->2:     // getName->N:     // ofs = 52796 ord = 17 addr = 0
	return 
	}


private final updateActionButtons( com.whatsapp.client.GroupInfoScreen ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-13.class#9.routine_10937(  ) // class#9
	astore_1 
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 52732 ord = 1 addr = 0
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_1 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label36
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52800   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52800   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52800   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52800   // getName->1:     // getName->2:     // getName->N:     // ofs = 52800 ord = 18 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52740   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52740   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52740   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52740   // getName->1:     // getName->2:     // getName->N:     // ofs = 52740 ord = 3 addr = 0
	if_icmplt Label25
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52808   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52808   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52808   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52808   // getName->1:     // getName->2:     // getName->N:     // ofs = 52808 ord = 20 addr = 0
	ifeq Label36
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52748   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52748   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52748   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52748   // getName->1:     // getName->2:     // getName->N:     // ofs = 52748 ord = 5 addr = 0
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52752   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52752   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52752   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52752   // getName->1:     // getName->2:     // getName->N:     // ofs = 52752 ord = 6 addr = 0
	invokevirtual delete( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52748   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52748   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52748   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52748   // getName->1:     // getName->2:     // getName->N:     // ofs = 52748 ord = 5 addr = 0
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52756   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52756   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52756   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52756   // getName->1:     // getName->2:     // getName->N:     // ofs = 52756 ord = 7 addr = 0
	invokevirtual delete( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.GroupInfoScreen.field_52808   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52808   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52808   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52808   // getName->1:     // getName->2:     // getName->N:     // ofs = 52808 ord = 20 addr = 0
	return 
Label25:
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52808   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52808   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52808   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52808   // getName->1:     // getName->2:     // getName->N:     // ofs = 52808 ord = 20 addr = 0
	ifne Label36
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52748   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52748   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52748   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52748   // getName->1:     // getName->2:     // getName->N:     // ofs = 52748 ord = 5 addr = 0
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52752   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52752   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52752   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52752   // getName->1:     // getName->2:     // getName->N:     // ofs = 52752 ord = 6 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52748   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52748   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52748   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52748   // getName->1:     // getName->2:     // getName->N:     // ofs = 52748 ord = 5 addr = 0
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52756   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52756   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52756   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52756   // getName->1:     // getName->2:     // getName->N:     // ofs = 52756 ord = 7 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	iconst_1 
	putfield com.whatsapp.client.GroupInfoScreen.field_52808   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52808   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52808   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52808   // getName->1:     // getName->2:     // getName->N:     // ofs = 52808 ord = 20 addr = 0
Label36:
	return 
	}


private final java.util.Vector com.whatsapp.client.GroupInfoScreen.routine_1186( com.whatsapp.client.GroupInfoScreen ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 52732 ord = 1 addr = 0
	invokenonvirtual_lib .routine_272 // pc=1
	astore_1 
	aload_1 
	ifnonnull Label24
	invokestatic_lib net.rim.device.api.system.RuntimeStore getRuntimeStore(  ) // RuntimeStore
	lipush 8535665252065932813
	invokevirtual java.lang.Object get( net.rim.device.api.system.RuntimeStore, long ) // pc=3
	checkcast_lib com.whatsapp.client.ContactInfo//module:WhatsApp-13.class#1 module:WhatsApp-13.class#1 module:WhatsApp-13.class#1
	astore_2 
	aload_2 
	ifnull Label20
	aload_2 
	aconst_null 
	iconst_1 
	invokenonvirtual_lib .routine_4574 // pc=3
	astore_1 
	aload_1 
	areturn 
Label20:
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_1 
Label24:
	aload_1 
	areturn 
	}


private final pickGroupMemberToAdd( com.whatsapp.client.GroupInfoScreen ); // address: 0
	{
	enter 
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	astore_1 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52800   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52800   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52800   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52800   // getName->1:     // getName->2:     // getName->N:     // ofs = 52800 ord = 18 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	invokespecial_lib java.util.Hashtable.<init> // pc=2
	astore_2 
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52800   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52800   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52800   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52800   // getName->1:     // getName->2:     // getName->N:     // ofs = 52800 ord = 18 addr = 0
	invokevirtual java.util.Enumeration elements( java.util.Vector ) // pc=1
	astore_3 
Label12:
	aload_3 
	invokeinterface interfacemethodref_2 // pc=1 guess=0
	ifeq Label22
	aload_2 
	aload_3 
	invokeinterface interfacemethodref_3 // pc=1 guess=1
	getstatic_lib TRUE // Boolean
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	goto Label12
Label22:
	new_lib com.whatsapp.client.GroupInfoScreen$10//module:WhatsApp-18.class#14 module:WhatsApp-18.class#14 module:WhatsApp-18.class#14
	dup 
	aload_0 
	invokespecial_lib .routine_9139 // pc=2
	astore_4 
	aload_4 
	new_lib com.whatsapp.client.GroupInfoScreen$11//module:WhatsApp-18.class#15 module:WhatsApp-18.class#15 module:WhatsApp-18.class#15
	dup 
	aload_0 
	aload_2 
	invokespecial_lib .routine_9183 // pc=3
	invokenonvirtual_lib .routine_6000 // pc=2
	new_lib Long//java.lang.Long java.lang.Long java.lang.Long
	dup 
	iconst_1 
	invokespecial_lib net.rim.device.api.ui.TransitionContext.<init> // pc=2
	astore_5 
	aload_5 
	bipush 2
	iconst_1 
	invokevirtual setIntAttribute( net.rim.device.api.ui.TransitionContext, int, int ) // pc=3
	new_lib Long//java.lang.Long java.lang.Long java.lang.Long
	dup 
	iconst_1 
	invokespecial_lib net.rim.device.api.ui.TransitionContext.<init> // pc=2
	astore_6 
	aload_6 
	bipush 2
	bipush 2
	invokevirtual setIntAttribute( net.rim.device.api.ui.TransitionContext, int, int ) // pc=3
	aload_1 
	invokevirtual net.rim.device.api.ui.UiEngineInstance getUiEngineInstance( net.rim.device.api.ui.UiApplication ) // pc=1
	aload_0 
	aload_4 
	bipush 7
	aload_5 
	invokevirtual setTransition( net.rim.device.api.ui.UiEngineInstance, net.rim.device.api.ui.Screen, net.rim.device.api.ui.Screen, int, net.rim.device.api.ui.TransitionContext ) // pc=5
	aload_1 
	invokevirtual net.rim.device.api.ui.UiEngineInstance getUiEngineInstance( net.rim.device.api.ui.UiApplication ) // pc=1
	aload_4 
	aload_0 
	bipush 56
	aload_6 
	invokevirtual setTransition( net.rim.device.api.ui.UiEngineInstance, net.rim.device.api.ui.Screen, net.rim.device.api.ui.Screen, int, net.rim.device.api.ui.TransitionContext ) // pc=5
	aload_4 
	new_lib com.whatsapp.client.GroupInfoScreen$12//module:WhatsApp-18.class#16 module:WhatsApp-18.class#16 module:WhatsApp-18.class#16
	dup 
	aload_0 
	aload_1 
	aload_4 
	invokespecial_lib .routine_9246 // pc=4
	invokevirtual addScreenUiEngineAttachedListener( net.rim.device.api.ui.Screen, net.rim.device.api.ui.ScreenUiEngineAttachedListener ) // pc=2
	aload_1 
	aload_4 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}


private final addGroupMember( com.whatsapp.client.GroupInfoScreen, module:WhatsApp-10.class#34 ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52804   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52804   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52804   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52804   // getName->1:     // getName->2:     // getName->N:     // ofs = 52804 ord = 19 addr = 0
	ifnonnull Label8
	aload_0 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield com.whatsapp.client.GroupInfoScreen.field_52804   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52804   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52804   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52804   // getName->1:     // getName->2:     // getName->N:     // ofs = 52804 ord = 19 addr = 0
Label8:
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52800   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52800   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52800   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52800   // getName->1:     // getName->2:     // getName->N:     // ofs = 52800 ord = 18 addr = 0
	aload_1 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52804   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52804   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52804   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52804   // getName->1:     // getName->2:     // getName->N:     // ofs = 52804 ord = 19 addr = 0
	aload_1 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_0_getfield _contactPickerField   // get_name_1:  _contactPickerField   // get_name_2:  _contactPickerField   // get_Name:    _contactPickerField   // getName->1:  _contactPickerField   // getName->2:  _contactPickerField   // getName->N:  _contactPickerField   // ofs = 52780 ord = 13 addr = 0
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52800   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52800   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52800   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52800   // getName->1:     // getName->2:     // getName->N:     // ofs = 52800 ord = 18 addr = 0
	invokenonvirtual_lib .routine_7160 // pc=2
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52776   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52776   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52776   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52776   // getName->1:     // getName->2:     // getName->N:     // ofs = 52776 ord = 12 addr = 0
	aload_0 
	invokespecial com.whatsapp.client.GroupInfoScreen.routine_1744 // pc=1
	invokenonvirtual_lib .routine_3333 // pc=2
	aload_0 
	invokespecial com.whatsapp.client.GroupInfoScreen.updateActionButtons // pc=1
	return 
	}


private final openGroupMedia( com.whatsapp.client.GroupInfoScreen ); // address: 0
	{
	enter 
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	astore_1 
	new_lib com.whatsapp.client.MediaBrowserScreen//com.whatsapp.client.MediaBrowserScreen com.whatsapp.client.MediaBrowserScreen com.whatsapp.client.MediaBrowserScreen
	dup 
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 52732 ord = 1 addr = 0
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield _jid   // get_name_1:  _jid   // get_name_2:  _jid   // get_Name:    _jid   // getName->1:  _jid   // getName->2:  _jid   // getName->N:  _jid   // ofs = 52736 ord = 2 addr = 0
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 52732 ord = 1 addr = 0
	invokespecial_lib .routine_2225 // pc=4
	astore_2 
	new_lib Long//java.lang.Long java.lang.Long java.lang.Long
	dup 
	bipush 2
	invokespecial_lib net.rim.device.api.ui.TransitionContext.<init> // pc=2
	astore_3 
	aload_3 
	bipush 4
	iconst_1 
	invokevirtual setIntAttribute( net.rim.device.api.ui.TransitionContext, int, int ) // pc=3
	new_lib Long//java.lang.Long java.lang.Long java.lang.Long
	dup 
	bipush 2
	invokespecial_lib net.rim.device.api.ui.TransitionContext.<init> // pc=2
	astore_4 
	aload_4 
	bipush 2
	bipush 2
	invokevirtual setIntAttribute( net.rim.device.api.ui.TransitionContext, int, int ) // pc=3
	aload_4 
	bipush 3
	bipush 2
	invokevirtual setIntAttribute( net.rim.device.api.ui.TransitionContext, int, int ) // pc=3
	aload_4 
	bipush 4
	iconst_1 
	invokevirtual setIntAttribute( net.rim.device.api.ui.TransitionContext, int, int ) // pc=3
	aload_1 
	invokevirtual net.rim.device.api.ui.UiEngineInstance getUiEngineInstance( net.rim.device.api.ui.UiApplication ) // pc=1
	aload_0 
	aload_2 
	bipush 7
	aload_3 
	invokevirtual setTransition( net.rim.device.api.ui.UiEngineInstance, net.rim.device.api.ui.Screen, net.rim.device.api.ui.Screen, int, net.rim.device.api.ui.TransitionContext ) // pc=5
	aload_1 
	invokevirtual net.rim.device.api.ui.UiEngineInstance getUiEngineInstance( net.rim.device.api.ui.UiApplication ) // pc=1
	aload_2 
	aload_0 
	bipush 56
	aload_4 
	invokevirtual setTransition( net.rim.device.api.ui.UiEngineInstance, net.rim.device.api.ui.Screen, net.rim.device.api.ui.Screen, int, net.rim.device.api.ui.TransitionContext ) // pc=5
	aload_2 
	new_lib com.whatsapp.client.GroupInfoScreen$13//module:WhatsApp-18.class#18 module:WhatsApp-18.class#18 module:WhatsApp-18.class#18
	dup 
	aload_0 
	aload_1 
	aload_2 
	invokespecial_lib .routine_9396 // pc=4
	invokevirtual addScreenUiEngineAttachedListener( net.rim.device.api.ui.Screen, net.rim.device.api.ui.ScreenUiEngineAttachedListener ) // pc=2
	aload_1 
	aload_2 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}


private final boolean com.whatsapp.client.GroupInfoScreen.routine_1677( com.whatsapp.client.GroupInfoScreen ); // address: 0
	{
	enter 
	aload_0_getfield _subjectLabel   // get_name_1:  _subjectLabel   // get_name_2:  _subjectLabel   // get_Name:    _subjectLabel   // getName->1:  _subjectLabel   // getName->2:  _subjectLabel   // getName->N:  _subjectLabel   // ofs = 52760 ord = 8 addr = 0
	invokenonvirtual_lib .routine_213 // pc=1
	invokenonvirtual_lib java.lang.String.trim // pc=1
	astore_1 
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 52732 ord = 1 addr = 0
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	astore_2 
	aload_2 
	aload_1 
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label14
	iconst_1 
	goto Label15
Label14:
	iconst_0 
Label15:
	istore_3 
	iload_3 
	ifeq Label26
	aload_1 
	stringlength 
	ifne Label26
	sipush 769
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokestatic_lib inform( java.lang.String ) // Dialog
	iconst_0 
	ireturn 
Label26:
	aload_0 
	invokevirtual boolean onSave( net.rim.device.api.ui.Screen ) // pc=1
	ireturn 
	}


private final java.lang.String com.whatsapp.client.GroupInfoScreen.routine_1744( com.whatsapp.client.GroupInfoScreen ); // address: 0
	{
	enter_narrow 
	new_lib net.rim.device.api.system.RuntimeStore//net.rim.device.api.system.RuntimeStore net.rim.device.api.system.RuntimeStore net.rim.device.api.system.RuntimeStore
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	astore_1 
	aload_1 
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52800   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52800   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52800   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52800   // getName->1:     // getName->2:     // getName->N:     // ofs = 52800 ord = 18 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	pop 
	aload_1 
	bipush 47
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	aload_1 
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52740   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52740   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52740   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52740   // getName->1:     // getName->2:     // getName->N:     // ofs = 52740 ord = 3 addr = 0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	pop 
	aload_1 
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}


private final com.whatsapp.client.GroupInfoScreen.routine_1801( com.whatsapp.client.GroupInfoScreen ); // address: 0
	{
	enter 
	aload_0 
	new_lib com.whatsapp.field.WAHorizontalFieldManager//com.whatsapp.field.WAHorizontalFieldManager com.whatsapp.field.WAHorizontalFieldManager com.whatsapp.field.WAHorizontalFieldManager
	dup 
	invokespecial_lib .routine_10870 // pc=1
	putfield com.whatsapp.client.GroupInfoScreen.field_52748   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52748   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52748   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52748   // getName->1:     // getName->2:     // getName->N:     // ofs = 52748 ord = 5 addr = 0
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52748   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52748   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52748   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52748   // getName->1:     // getName->2:     // getName->N:     // ofs = 52748 ord = 5 addr = 0
	iconst_1 
	invokenonvirtual_lib .routine_9976 // pc=2
	new_lib com.whatsapp.field.ColorLabelField//com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField
	dup 
	sipush 912
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	iipush 16777215
	lipush 1152921504606846976
	invokespecial_lib .routine_3777 // pc=5
	astore_1 
	aload_1 
	bipush 12
	bipush 18
	bipush 12
	bipush 18
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52748   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52748   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52748   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52748   // getName->1:     // getName->2:     // getName->N:     // ofs = 52748 ord = 5 addr = 0
	aload_1 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	invokestatic_lib module:WhatsApp-13.class#9.routine_10937(  ) // class#9
	astore_2 
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 52732 ord = 1 addr = 0
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_2 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label35
	goto_w Label93
Label35:
	aload_0 
	new_lib com.whatsapp.field.VerticalShadedSeparator//module:WhatsApp-38.class#12 module:WhatsApp-38.class#12 module:WhatsApp-38.class#12
	dup 
	lipush 2305843009213693952
	invokespecial_lib .routine_9957 // pc=3
	putfield com.whatsapp.client.GroupInfoScreen.field_52752   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52752   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52752   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52752   // getName->1:     // getName->2:     // getName->N:     // ofs = 52752 ord = 6 addr = 0
	aload_0 
	new_lib com.whatsapp.client.BitmapButtonField//com.whatsapp.client.BitmapButtonField com.whatsapp.client.BitmapButtonField com.whatsapp.client.BitmapButtonField
	dup 
	ldc literal_48:"add-person.png"
	invokestatic_lib net.rim.device.api.system.Bitmap getBitmapResource( java.lang.String ) // Bitmap
	aconst_null 
	aconst_null 
	aconst_null 
	aconst_null 
	aconst_null 
	lipush 51539607552
	invokespecial_lib .routine_3085 // pc=9
	putfield com.whatsapp.client.GroupInfoScreen.field_52756   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52756   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52756   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52756   // getName->1:     // getName->2:     // getName->N:     // ofs = 52756 ord = 7 addr = 0
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52756   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52756   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52756   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52756   // getName->1:     // getName->2:     // getName->N:     // ofs = 52756 ord = 7 addr = 0
	iconst_0 
	invokenonvirtual_lib .routine_1953 // pc=2
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52756   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52756   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52756   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52756   // getName->1:     // getName->2:     // getName->N:     // ofs = 52756 ord = 7 addr = 0
	iconst_0 
	bipush 3
	iconst_0 
	bipush 3
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52756   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52756   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52756   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52756   // getName->1:     // getName->2:     // getName->N:     // ofs = 52756 ord = 7 addr = 0
	ldc literal_49:"narrow-hover.png"
	invokestatic_lib net.rim.device.api.system.Bitmap getBitmapResource( java.lang.String ) // Bitmap
	new_lib net.rim.device.api.ui.component.TitleBar//net.rim.device.api.ui.component.TitleBar net.rim.device.api.ui.component.TitleBar net.rim.device.api.ui.component.TitleBar
	dup 
	iconst_0 
	bipush 10
	iconst_0 
	bipush 10
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=5
	invokenonvirtual_lib .routine_1964 // pc=3
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52756   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52756   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52756   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52756   // getName->1:     // getName->2:     // getName->N:     // ofs = 52756 ord = 7 addr = 0
	new_lib com.whatsapp.client.GroupInfoScreen$1//module:WhatsApp-18.class#13 module:WhatsApp-18.class#13 module:WhatsApp-18.class#13
	dup 
	aload_0 
	invokespecial_lib .routine_9098 // pc=2
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52800   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52800   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52800   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52800   // getName->1:     // getName->2:     // getName->N:     // ofs = 52800 ord = 18 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52740   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52740   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52740   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52740   // getName->1:     // getName->2:     // getName->N:     // ofs = 52740 ord = 3 addr = 0
	if_icmpge Label93
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52748   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52748   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52748   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52748   // getName->1:     // getName->2:     // getName->N:     // ofs = 52748 ord = 5 addr = 0
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52752   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52752   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52752   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52752   // getName->1:     // getName->2:     // getName->N:     // ofs = 52752 ord = 6 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52748   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52748   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52748   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52748   // getName->1:     // getName->2:     // getName->N:     // ofs = 52748 ord = 5 addr = 0
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52756   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52756   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52756   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52756   // getName->1:     // getName->2:     // getName->N:     // ofs = 52756 ord = 7 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	iconst_1 
	putfield com.whatsapp.client.GroupInfoScreen.field_52808   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52808   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52808   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52808   // getName->1:     // getName->2:     // getName->N:     // ofs = 52808 ord = 20 addr = 0
Label93:
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52748   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52748   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52748   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52748   // getName->1:     // getName->2:     // getName->N:     // ofs = 52748 ord = 5 addr = 0
	invokestatic_lib module:WhatsApp-35.class#0.routine_5692(  ) // class#0
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52748   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52748   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52748   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52748   // getName->1:     // getName->2:     // getName->N:     // ofs = 52748 ord = 5 addr = 0
	iconst_0 
	iconst_0 
	iconst_0 
	iconst_0 
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52748   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52748   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52748   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52748   // getName->1:     // getName->2:     // getName->N:     // ofs = 52748 ord = 5 addr = 0
	iconst_0 
	iconst_0 
	iconst_0 
	iconst_0 
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52748   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52748   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52748   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52748   // getName->1:     // getName->2:     // getName->N:     // ofs = 52748 ord = 5 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	dup 
	lipush 18014398509481984
	invokespecial_lib net.rim.device.api.ui.component.NullField.<init> // pc=3
	putfield com.whatsapp.client.GroupInfoScreen.field_52744   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52744   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52744   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52744   // getName->1:     // getName->2:     // getName->N:     // ofs = 52744 ord = 4 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52744   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52744   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52744   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52744   // getName->1:     // getName->2:     // getName->N:     // ofs = 52744 ord = 4 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	lipush -2076668881308291501
	bipush 10
	invokestatic_lib module:WhatsApp-35.class#0.routine_5145(  ) // class#0
	istore_3 
	new_lib net.rim.device.api.system.RuntimeStore//net.rim.device.api.system.RuntimeStore net.rim.device.api.system.RuntimeStore net.rim.device.api.system.RuntimeStore
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	sipush 771
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_50:": "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_4 
	aload_0 
	new_lib com.whatsapp.client.BBMStyleInputField//com.whatsapp.client.BBMStyleInputField com.whatsapp.client.BBMStyleInputField com.whatsapp.client.BBMStyleInputField
	dup 
	lipush 2147483648
	invokespecial_lib .routine_1619 // pc=3
	putfield _subjectLabel   // get_name_1:  _subjectLabel   // get_name_2:  _subjectLabel   // get_Name:    _subjectLabel   // getName->1:  _subjectLabel   // getName->2:  _subjectLabel   // getName->N:  _subjectLabel   // ofs = 52760 ord = 8 addr = 0
	aload_0_getfield _subjectLabel   // get_name_1:  _subjectLabel   // get_name_2:  _subjectLabel   // get_Name:    _subjectLabel   // getName->1:  _subjectLabel   // getName->2:  _subjectLabel   // getName->N:  _subjectLabel   // ofs = 52760 ord = 8 addr = 0
	aload_4 
	invokevirtual setLabel( net.rim.device.api.ui.component.BasicEditField, java.lang.String ) // pc=2
	aload_0_getfield _subjectLabel   // get_name_1:  _subjectLabel   // get_name_2:  _subjectLabel   // get_Name:    _subjectLabel   // getName->1:  _subjectLabel   // getName->2:  _subjectLabel   // getName->N:  _subjectLabel   // ofs = 52760 ord = 8 addr = 0
	iipush 5265246
	invokenonvirtual_lib .routine_20 // pc=2
	aload_0_getfield _subjectLabel   // get_name_1:  _subjectLabel   // get_name_2:  _subjectLabel   // get_Name:    _subjectLabel   // getName->1:  _subjectLabel   // getName->2:  _subjectLabel   // getName->N:  _subjectLabel   // ofs = 52760 ord = 8 addr = 0
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 52732 ord = 1 addr = 0
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokenonvirtual_lib .routine_243 // pc=2
	aload_0_getfield _subjectLabel   // get_name_1:  _subjectLabel   // get_name_2:  _subjectLabel   // get_Name:    _subjectLabel   // getName->1:  _subjectLabel   // getName->2:  _subjectLabel   // getName->N:  _subjectLabel   // ofs = 52760 ord = 8 addr = 0
	iload_3 
	invokenonvirtual_lib .routine_1188 // pc=2
	aload_0_getfield _subjectLabel   // get_name_1:  _subjectLabel   // get_name_2:  _subjectLabel   // get_Name:    _subjectLabel   // getName->1:  _subjectLabel   // getName->2:  _subjectLabel   // getName->N:  _subjectLabel   // ofs = 52760 ord = 8 addr = 0
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokenonvirtual_lib .routine_9 // pc=2
	aload_0_getfield _subjectLabel   // get_name_1:  _subjectLabel   // get_name_2:  _subjectLabel   // get_Name:    _subjectLabel   // getName->1:  _subjectLabel   // getName->2:  _subjectLabel   // getName->N:  _subjectLabel   // ofs = 52760 ord = 8 addr = 0
	getstatic_lib module:WhatsApp-7.class#22.static_57 // class#22
	invokevirtual setBorder( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Border ) // pc=2
	aload_0_getfield _subjectLabel   // get_name_1:  _subjectLabel   // get_name_2:  _subjectLabel   // get_Name:    _subjectLabel   // getName->1:  _subjectLabel   // getName->2:  _subjectLabel   // getName->N:  _subjectLabel   // ofs = 52760 ord = 8 addr = 0
	iipush 16777215
	invokestatic_lib net.rim.device.api.ui.decor.Background createSolidBackground( int ) // BackgroundFactory
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	aload_0_getfield _subjectLabel   // get_name_1:  _subjectLabel   // get_name_2:  _subjectLabel   // get_Name:    _subjectLabel   // getName->1:  _subjectLabel   // getName->2:  _subjectLabel   // getName->N:  _subjectLabel   // ofs = 52760 ord = 8 addr = 0
	bipush 2
	bipush 4
	bipush 2
	bipush 4
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0_getfield _subjectLabel   // get_name_1:  _subjectLabel   // get_name_2:  _subjectLabel   // get_Name:    _subjectLabel   // getName->1:  _subjectLabel   // getName->2:  _subjectLabel   // getName->N:  _subjectLabel   // ofs = 52760 ord = 8 addr = 0
	bipush 6
	bipush 16
	bipush 10
	bipush 16
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	aload_0_getfield _subjectLabel   // get_name_1:  _subjectLabel   // get_name_2:  _subjectLabel   // get_Name:    _subjectLabel   // getName->1:  _subjectLabel   // getName->2:  _subjectLabel   // getName->N:  _subjectLabel   // ofs = 52760 ord = 8 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	invokespecial com.whatsapp.client.GroupInfoScreen.routine_2386 // pc=1
	aload_0 
	invokespecial com.whatsapp.client.GroupInfoScreen.routine_672 // pc=1
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 52732 ord = 1 addr = 0
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	ifnull Label207
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 52732 ord = 1 addr = 0
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifnull Label207
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 52732 ord = 1 addr = 0
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual long longValue( java.lang.Long ) // pc=1
	iconst_0 
	i2l 
	lcmp 
	ifle Label207
	aload_0 
	new_lib com.whatsapp.field.ShadedSeparator//module:WhatsApp-38.class#10 module:WhatsApp-38.class#10 module:WhatsApp-38.class#10
	dup 
	invokespecial_lib .routine_9534 // pc=1
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	invokespecial com.whatsapp.client.GroupInfoScreen.routine_769 // pc=1
	aload_0 
	new_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	dup 
	lipush 18014398509481984
	invokespecial_lib net.rim.device.api.ui.component.NullField.<init> // pc=3
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
Label207:
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52744   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52744   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52744   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52744   // getName->1:     // getName->2:     // getName->N:     // ofs = 52744 ord = 4 addr = 0
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	return 
	}


private final com.whatsapp.client.GroupInfoScreen.routine_2386( com.whatsapp.client.GroupInfoScreen ); // address: 0
	{
	enter 
	aload_0 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	sipush 913
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	sipush 834
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokestatic_lib module:WhatsApp-21.class#4.routine_3878(  ) // class#4
	putfield _groupMediaLabel   // get_name_1:  _groupMediaLabel   // get_name_2:  _groupMediaLabel   // get_Name:    _groupMediaLabel   // getName->1:  _groupMediaLabel   // getName->2:  _groupMediaLabel   // getName->N:  _groupMediaLabel   // ofs = 52764 ord = 9 addr = 0
	new_lib com.whatsapp.client.GroupInfoScreen$2//module:WhatsApp-18.class#22 module:WhatsApp-18.class#22 module:WhatsApp-18.class#22
	dup 
	aload_0 
	invokespecial_lib .routine_9671 // pc=2
	astore_1 
	aload_0 
	new_lib com.whatsapp.client.MediaPreviewButton//com.whatsapp.client.MediaPreviewButton com.whatsapp.client.MediaPreviewButton com.whatsapp.client.MediaPreviewButton
	dup 
	invokespecial_lib .routine_2552 // pc=1
	putfield _groupMediaButton   // get_name_1:  _groupMediaButton   // get_name_2:  _groupMediaButton   // get_Name:    _groupMediaButton   // getName->1:  _groupMediaButton   // getName->2:  _groupMediaButton   // getName->N:  _groupMediaButton   // ofs = 52772 ord = 11 addr = 0
	aload_0_getfield _groupMediaButton   // get_name_1:  _groupMediaButton   // get_name_2:  _groupMediaButton   // get_Name:    _groupMediaButton   // getName->1:  _groupMediaButton   // getName->2:  _groupMediaButton   // getName->N:  _groupMediaButton   // ofs = 52772 ord = 11 addr = 0
	invokenonvirtual_lib .routine_1747 // pc=1
	istore_2 
	new_lib com.whatsapp.client.GroupInfoScreen$3//module:WhatsApp-18.class#24 module:WhatsApp-18.class#24 module:WhatsApp-18.class#24
	dup 
	aload_0 
	iload_2 
	invokespecial_lib .routine_9793 // pc=3
	astore_3 
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52812   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52812   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52812   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52812   // getName->1:     // getName->2:     // getName->N:     // ofs = 52812 ord = 21 addr = 0
	aload_3 
	invokenonvirtual_lib .routine_9287 // pc=2
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52812   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52812   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52812   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52812   // getName->1:     // getName->2:     // getName->N:     // ofs = 52812 ord = 21 addr = 0
	aload_1 
	invokenonvirtual_lib .routine_9287 // pc=2
	aload_0_getfield _groupMediaButton   // get_name_1:  _groupMediaButton   // get_name_2:  _groupMediaButton   // get_Name:    _groupMediaButton   // getName->1:  _groupMediaButton   // getName->2:  _groupMediaButton   // getName->N:  _groupMediaButton   // ofs = 52772 ord = 11 addr = 0
	new_lib com.whatsapp.client.GroupInfoScreen$4//module:WhatsApp-18.class#26 module:WhatsApp-18.class#26 module:WhatsApp-18.class#26
	dup 
	aload_0 
	invokespecial_lib .routine_9978 // pc=2
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0 
	new_lib com.whatsapp.field.ProgressAnimationField//module:WhatsApp-38.class#8 module:WhatsApp-38.class#8 module:WhatsApp-38.class#8
	dup 
	lipush 12884901888
	invokespecial_lib .routine_9107 // pc=3
	putfield _groupMediaProgress   // get_name_1:  _groupMediaProgress   // get_name_2:  _groupMediaProgress   // get_Name:    _groupMediaProgress   // getName->1:  _groupMediaProgress   // getName->2:  _groupMediaProgress   // getName->N:  _groupMediaProgress   // ofs = 52768 ord = 10 addr = 0
	aload_0_getfield _groupMediaProgress   // get_name_1:  _groupMediaProgress   // get_name_2:  _groupMediaProgress   // get_Name:    _groupMediaProgress   // getName->1:  _groupMediaProgress   // getName->2:  _groupMediaProgress   // getName->N:  _groupMediaProgress   // ofs = 52768 ord = 10 addr = 0
	invokestatic setMediaPadding( net.rim.device.api.ui.Field ) // GroupInfoScreen
	aload_0 
	aload_0_getfield _groupMediaLabel   // get_name_1:  _groupMediaLabel   // get_name_2:  _groupMediaLabel   // get_Name:    _groupMediaLabel   // getName->1:  _groupMediaLabel   // getName->2:  _groupMediaLabel   // getName->N:  _groupMediaLabel   // ofs = 52764 ord = 9 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	aload_0_getfield _groupMediaProgress   // get_name_1:  _groupMediaProgress   // get_name_2:  _groupMediaProgress   // get_Name:    _groupMediaProgress   // getName->1:  _groupMediaProgress   // getName->2:  _groupMediaProgress   // getName->N:  _groupMediaProgress   // ofs = 52768 ord = 10 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	return 
	}


private final updateDisplayedContacts( com.whatsapp.client.GroupInfoScreen ); // address: 0
	{
	enter 
	aload_0 
	aload_0 
	invokespecial com.whatsapp.client.GroupInfoScreen.routine_1186 // pc=1
	putfield com.whatsapp.client.GroupInfoScreen.field_52800   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52800   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52800   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52800   // getName->1:     // getName->2:     // getName->N:     // ofs = 52800 ord = 18 addr = 0
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52804   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52804   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52804   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52804   // getName->1:     // getName->2:     // getName->N:     // ofs = 52804 ord = 19 addr = 0
	ifnull Label43
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52804   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52804   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52804   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52804   // getName->1:     // getName->2:     // getName->N:     // ofs = 52804 ord = 19 addr = 0
	invokevirtual boolean isEmpty( java.util.Vector ) // pc=1
	ifne Label43
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52740   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52740   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52740   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52740   // getName->1:     // getName->2:     // getName->N:     // ofs = 52740 ord = 3 addr = 0
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52800   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52800   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52800   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52800   // getName->1:     // getName->2:     // getName->N:     // ofs = 52800 ord = 18 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	isub 
	iconst_0 
	invokestatic_lib int max( int, int ) // Math
	istore_1 
Label17:
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52804   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52804   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52804   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52804   // getName->1:     // getName->2:     // getName->N:     // ofs = 52804 ord = 19 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	iload_1 
	if_icmple Label28
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52804   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52804   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52804   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52804   // getName->1:     // getName->2:     // getName->N:     // ofs = 52804 ord = 19 addr = 0
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52804   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52804   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52804   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52804   // getName->1:     // getName->2:     // getName->N:     // ofs = 52804 ord = 19 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	iconst_1 
	isub 
	invokevirtual removeElementAt( java.util.Vector, int ) // pc=2
	goto Label17
Label28:
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52804   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52804   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52804   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52804   // getName->1:     // getName->2:     // getName->N:     // ofs = 52804 ord = 19 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_2 
	iconst_0 
	istore_3 
Label33:
	iload_3 
	iload_2 
	if_icmpge Label43
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52800   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52800   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52800   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52800   // getName->1:     // getName->2:     // getName->N:     // ofs = 52800 ord = 18 addr = 0
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52804   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52804   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52804   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52804   // getName->1:     // getName->2:     // getName->N:     // ofs = 52804 ord = 19 addr = 0
	iload_3 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	iinc 3 1
	goto Label33
Label43:
	aload_0_getfield _contactPickerField   // get_name_1:  _contactPickerField   // get_name_2:  _contactPickerField   // get_Name:    _contactPickerField   // getName->1:  _contactPickerField   // getName->2:  _contactPickerField   // getName->N:  _contactPickerField   // ofs = 52780 ord = 13 addr = 0
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52800   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52800   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52800   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52800   // getName->1:     // getName->2:     // getName->N:     // ofs = 52800 ord = 18 addr = 0
	invokenonvirtual_lib .routine_7160 // pc=2
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52776   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52776   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52776   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52776   // getName->1:     // getName->2:     // getName->N:     // ofs = 52776 ord = 12 addr = 0
	aload_0 
	invokespecial com.whatsapp.client.GroupInfoScreen.routine_1744 // pc=1
	invokenonvirtual_lib .routine_3333 // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final closeScreen( com.whatsapp.client.GroupInfoScreen ); // address: 0
	{
	enter_narrow 
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	astore_1 
	aload_1 
	aload_0 
	invokevirtual popScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}


public final onContactUpdated( com.whatsapp.client.GroupInfoScreen, module:WhatsApp.class#12 ); // address: 0
	{
	enter 
	aload_1 
	ifnull Label7
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52800   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52800   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52800   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52800   // getName->1:     // getName->2:     // getName->N:     // ofs = 52800 ord = 18 addr = 0
	aload_1 
	invokevirtual boolean contains( java.util.Vector, java.lang.Object ) // pc=2
	ifeq Label13
Label7:
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	new_lib com.whatsapp.client.GroupInfoScreen$15//module:WhatsApp-18.class#21 module:WhatsApp-18.class#21 module:WhatsApp-18.class#21
	dup 
	aload_0 
	invokespecial_lib .routine_9606 // pc=2
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
Label13:
	return 
	}


public final messageReceipt( com.whatsapp.client.GroupInfoScreen, java.lang.String ); // address: 0
	{
	noenter_return 
	}


public final chatHistoryDeleted( com.whatsapp.client.GroupInfoScreen, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _jid   // get_name_1:  _jid   // get_name_2:  _jid   // get_Name:    _jid   // getName->1:  _jid   // getName->2:  _jid   // getName->N:  _jid   // ofs = 52736 ord = 2 addr = 0
	aload_1 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label7
	aload_0 
	invokenonvirtual com.whatsapp.client.GroupInfoScreen.closeScreen // pc=1
Label7:
	return 
	}


public final groupChatMetadataUpdate( com.whatsapp.client.GroupInfoScreen, java.lang.String ); // address: 0
	{
	enter 
	aload_0_getfield _jid   // get_name_1:  _jid   // get_name_2:  _jid   // get_Name:    _jid   // getName->1:  _jid   // getName->2:  _jid   // getName->N:  _jid   // ofs = 52736 ord = 2 addr = 0
	aload_1 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label11
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	new_lib com.whatsapp.client.GroupInfoScreen$14//module:WhatsApp-18.class#20 module:WhatsApp-18.class#20 module:WhatsApp-18.class#20
	dup 
	aload_0 
	invokespecial_lib .routine_9567 // pc=2
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
Label11:
	return 
	}


public final boolean newMessage( com.whatsapp.client.GroupInfoScreen, java.lang.String, boolean ); // address: 0
	{
	enter_narrow 
	iconst_0 
	ireturn 
	}


protected final makeMenu( com.whatsapp.client.GroupInfoScreen, net.rim.device.api.ui.component.Menu, int ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.Screen.makeMenu // pc=3
	aload_0 
	invokevirtual net.rim.device.api.ui.Field getLeafFieldWithFocus( net.rim.device.api.ui.Screen ) // pc=1
	astore_3 
	aload_3 
	aload_0_getfield _contactPickerField   // get_name_1:  _contactPickerField   // get_name_2:  _contactPickerField   // get_Name:    _contactPickerField   // getName->1:  _contactPickerField   // getName->2:  _contactPickerField   // getName->N:  _contactPickerField   // ofs = 52780 ord = 13 addr = 0
	if_acmpeq Label12
	goto_w Label82
Label12:
	aload_0_getfield _contactPickerField   // get_name_1:  _contactPickerField   // get_name_2:  _contactPickerField   // get_Name:    _contactPickerField   // getName->1:  _contactPickerField   // getName->2:  _contactPickerField   // getName->N:  _contactPickerField   // ofs = 52780 ord = 13 addr = 0
	invokenonvirtual_lib .routine_7309 // pc=1
	astore_4 
	aload_4 
	ifnonnull Label18
	goto_w Label82
Label18:
	aload_4 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	astore_5 
	aload_5 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokestatic_lib module:WhatsApp-13.class#9.routine_10937(  ) // class#9
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokevirtual_short .equals // idx=1 pc=2
	istore_6 
	aload_5 
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifnull Label57
	aload_5 
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	stringlength 
	ifle Label57
	aload_4 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokenonvirtual_lib .routine_5925 // pc=1
	astore_7 
	iload_6 
	ifne Label48
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52784   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52784   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52784   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52784   // getName->1:     // getName->2:     // getName->N:     // ofs = 52784 ord = 14 addr = 0
	sipush 265
	aload_7 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	invokenonvirtual_lib .routine_7894 // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52784   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52784   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52784   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52784   // getName->1:     // getName->2:     // getName->N:     // ofs = 52784 ord = 14 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label48:
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52788   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52788   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52788   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52788   // getName->1:     // getName->2:     // getName->N:     // ofs = 52788 ord = 15 addr = 0
	bipush 55
	aload_7 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	invokenonvirtual_lib .routine_7894 // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52788   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52788   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52788   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52788   // getName->1:     // getName->2:     // getName->N:     // ofs = 52788 ord = 15 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	return 
Label57:
	aload_5 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokestatic_lib module:WhatsApp-9.class#15.routine_8409(  ) // class#15
	astore_7 
	iload_6 
	ifne Label71
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52784   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52784   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52784   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52784   // getName->1:     // getName->2:     // getName->N:     // ofs = 52784 ord = 14 addr = 0
	sipush 265
	aload_7 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	invokenonvirtual_lib .routine_7894 // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52784   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52784   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52784   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52784   // getName->1:     // getName->2:     // getName->N:     // ofs = 52784 ord = 14 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label71:
	aload_1 
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52792   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52792   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52792   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52792   // getName->1:     // getName->2:     // getName->N:     // ofs = 52792 ord = 16 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52796   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52796   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52796   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52796   // getName->1:     // getName->2:     // getName->N:     // ofs = 52796 ord = 17 addr = 0
	sipush 866
	aload_7 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	invokenonvirtual_lib .routine_7894 // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52796   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52796   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52796   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52796   // getName->1:     // getName->2:     // getName->N:     // ofs = 52796 ord = 17 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label82:
	return 
	}


public final save( com.whatsapp.client.GroupInfoScreen ); // address: 0
	{
	enter 
	aload_0_getfield _subjectLabel   // get_name_1:  _subjectLabel   // get_name_2:  _subjectLabel   // get_Name:    _subjectLabel   // getName->1:  _subjectLabel   // getName->2:  _subjectLabel   // getName->N:  _subjectLabel   // ofs = 52760 ord = 8 addr = 0
	invokenonvirtual_lib .routine_213 // pc=1
	invokenonvirtual_lib java.lang.String.trim // pc=1
	astore_1 
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 52732 ord = 1 addr = 0
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	astore_2 
	aload_2 
	aload_1 
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label19
	lipush 5652081555793928688
	new_lib com.whatsapp.client.ChatServerOperation$SetSubjectGroup//module:WhatsApp-10.class#28 module:WhatsApp-10.class#28 module:WhatsApp-10.class#28
	dup 
	aload_0_getfield _jid   // get_name_1:  _jid   // get_name_2:  _jid   // get_Name:    _jid   // getName->1:  _jid   // getName->2:  _jid   // getName->N:  _jid   // ofs = 52736 ord = 2 addr = 0
	aload_1 
	invokespecial_lib .routine_4644 // pc=3
	invokestatic_lib module:WhatsApp-35.class#0.routine_4523(  ) // class#0
Label19:
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52804   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52804   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52804   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52804   // getName->1:     // getName->2:     // getName->N:     // ofs = 52804 ord = 19 addr = 0
	ifnull Label53
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52804   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52804   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52804   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52804   // getName->1:     // getName->2:     // getName->N:     // ofs = 52804 ord = 19 addr = 0
	invokevirtual boolean isEmpty( java.util.Vector ) // pc=1
	ifne Label53
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_3 
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52804   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52804   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52804   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52804   // getName->1:     // getName->2:     // getName->N:     // ofs = 52804 ord = 19 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_4 
	iconst_0 
	istore_5 
Label33:
	iload_5 
	iload_4 
	if_icmpge Label46
	aload_3 
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52804   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52804   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52804   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52804   // getName->1:     // getName->2:     // getName->N:     // ofs = 52804 ord = 19 addr = 0
	iload_5 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.ChatableNumber//module:WhatsApp-10.class#34 module:WhatsApp-10.class#34 module:WhatsApp-10.class#34
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	iinc 5 1
	goto Label33
Label46:
	lipush 5652081555793928688
	new_lib com.whatsapp.client.ChatServerOperation$AddUsersGroup//module:WhatsApp-10.class#8 module:WhatsApp-10.class#8 module:WhatsApp-10.class#8
	dup 
	aload_0_getfield _jid   // get_name_1:  _jid   // get_name_2:  _jid   // get_Name:    _jid   // getName->1:  _jid   // getName->2:  _jid   // getName->N:  _jid   // ofs = 52736 ord = 2 addr = 0
	aload_3 
	invokespecial_lib .routine_3261 // pc=3
	invokestatic_lib module:WhatsApp-35.class#0.routine_4523(  ) // class#0
Label53:
	return 
	}


public final boolean isDirty( com.whatsapp.client.GroupInfoScreen ); // address: 0
	{
	enter 
	aload_0_getfield _subjectLabel   // get_name_1:  _subjectLabel   // get_name_2:  _subjectLabel   // get_Name:    _subjectLabel   // getName->1:  _subjectLabel   // getName->2:  _subjectLabel   // getName->N:  _subjectLabel   // ofs = 52760 ord = 8 addr = 0
	invokenonvirtual_lib .routine_213 // pc=1
	invokenonvirtual_lib java.lang.String.trim // pc=1
	astore_1 
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 52732 ord = 1 addr = 0
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	astore_2 
	aload_2 
	aload_1 
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label14
	iconst_1 
	goto Label15
Label14:
	iconst_0 
Label15:
	istore_3 
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52804   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52804   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52804   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52804   // getName->1:     // getName->2:     // getName->N:     // ofs = 52804 ord = 19 addr = 0
	ifnull Label23
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_52804   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_52804   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_52804   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_52804   // getName->1:     // getName->2:     // getName->N:     // ofs = 52804 ord = 19 addr = 0
	invokevirtual boolean isEmpty( java.util.Vector ) // pc=1
	ifne Label23
	iconst_1 
	goto Label24
Label23:
	iconst_0 
Label24:
	istore_4 
	iload_3 
	ifne Label29
	iload_4 
	ifeq Label31
Label29:
	iconst_1 
	ireturn 
Label31:
	iconst_0 
	ireturn 
	}


protected final boolean onSavePrompt( com.whatsapp.client.GroupInfoScreen ); // address: 0
	{
	enter_narrow 
	iconst_1 
	invokestatic_lib int ask( int ) // Dialog
	istore_1 
	iload_1 
	tableswitch  :
		
		
		

Label6:
	aload_0 
	invokespecial com.whatsapp.client.GroupInfoScreen.routine_1677 // pc=1
	ireturn 
Label9:
	iconst_1 
	ireturn 
Label11:
	iconst_0 
	ireturn 
	}


public final boolean isMuddy( com.whatsapp.client.GroupInfoScreen ); // address: 0
	{
	ireturn_bipush 0
	}


public final setDirty( com.whatsapp.client.GroupInfoScreen, boolean ); // address: 0
	{
	noenter_return 
	}


public final setMuddy( com.whatsapp.client.GroupInfoScreen, boolean ); // address: 0
	{
	noenter_return 
	}

}
