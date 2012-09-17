// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-18.cod
// Module version  : 2.7.3204
// Class ID        : 7
// ########################################################


package com.whatsapp.client;


abstract public final class GroupInfoScreen extends com.whatsapp.field.
implements com.whatsapp.client.MessageStore$Listener

{

	// @@@@@@@@@@@@@ Fields 
	private final long /*long*/  field_53618 ; // ofs = 53618 addr = 0)
	private final com.whatsapp.client.ChatMessageStore /*module:WhatsApp-10.class#0*/  _group ; // ofs = 53622 addr = 0)
	private final String /*java.lang.String*/  _jid ; // ofs = 53626 addr = 0)
	private final int /*int*/  field_53630 ; // ofs = 53630 addr = 0)
	private net.rim.device.api.ui.component.NullField /*net.rim.device.api.ui.component.NullField*/  field_53634 ; // ofs = 53634 addr = 0)
	private com.whatsapp.field.WAHorizontalFieldManager /*com.whatsapp.field.WAHorizontalFieldManager*/  field_53638 ; // ofs = 53638 addr = 0)
	private com.whatsapp.field.VerticalShadedSeparator /*module:WhatsApp-37.class#13*/  field_53642 ; // ofs = 53642 addr = 0)
	private com.whatsapp.client.BitmapButtonField /*com.whatsapp.client.BitmapButtonField*/  field_53646 ; // ofs = 53646 addr = 0)
	private com.whatsapp.client.BBMStyleInputField /*com.whatsapp.client.BBMStyleInputField*/  _subjectLabel ; // ofs = 53650 addr = 0)
	private com.whatsapp.client.LeftRightLabelField /*module:WhatsApp-21.class#0*/  _groupMediaLabel ; // ofs = 53654 addr = 0)
	private com.whatsapp.field.ProgressAnimationField /*module:WhatsApp-37.class#9*/  _groupMediaProgress ; // ofs = 53658 addr = 0)
	private com.whatsapp.client.MediaPreviewButton /*com.whatsapp.client.MediaPreviewButton*/  _groupMediaButton ; // ofs = 53662 addr = 0)
	private com.whatsapp.client.LeftRightLabelField /*module:WhatsApp-21.class#0*/  field_53666 ; // ofs = 53666 addr = 0)
	private  /*module:WhatsApp-13.class#2*/  _contactPickerField ; // ofs = 53670 addr = 0)
	private com.whatsapp.client. /*module:WhatsApp-34.class#11*/  field_53674 ; // ofs = 53674 addr = 0)
	private com.whatsapp.client.WAMenuItem /*module:WhatsApp-34.class#11*/  field_53678 ; // ofs = 53678 addr = 0)
	private com.whatsapp.client.WAMenuItem /*module:WhatsApp-34.class#11*/  field_53682 ; // ofs = 53682 addr = 0)
	private com.whatsapp.client.WAMenuItem /*module:WhatsApp-34.class#11*/  field_53686 ; // ofs = 53686 addr = 0)
	private java.util.Vector /*java.util.Vector*/  field_53690 ; // ofs = 53690 addr = 0)
	private java.util.Vector /*java.util.Vector*/  field_53694 ; // ofs = 53694 addr = 0)
	private boolean /*boolean*/  field_53698 ; // ofs = 53698 addr = 0)
	private final com.whatsapp.client.Worklist /*module:WhatsApp-34.class#17*/  field_53702 ; // ofs = 53702 addr = 0)

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
	invokestatic_lib com.whatsapp.client.MediaPreviewButton.routine_8388(  ) // MediaPreviewButton
	invokestatic_lib module:WhatsApp-32.class#2.routine_8124(  ) // class#2
	return 
	}


public <init>( com.whatsapp.client.GroupInfoScreen, long, module:WhatsApp-10.class#0, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	iconst_0 
	i2l 
	invokespecial_lib .routine_4866 // pc=3
	aload_0 
	new_lib com.whatsapp.client.Worklist//module:WhatsApp-34.class#17 module:WhatsApp-34.class#17 module:WhatsApp-34.class#17
	dup 
	invokespecial_lib .routine_5543 // pc=1
	putfield com.whatsapp.client.GroupInfoScreen.field_53702   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53702   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53702   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53702   // getName->1:     // getName->2:     // getName->N:     // ofs = 53702 ord = 21 addr = 0
	aload_0 
	lload 1
	lputfield com.whatsapp.client.GroupInfoScreen.field_53618   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53618   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53618   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53618   // getName->1:     // getName->2:     // getName->N:     // ofs = 53618 ord = 0 addr = 0
	aload_0 
	aload_3 
	putfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 53622 ord = 1 addr = 0
	aload_0 
	aload_4 
	putfield _jid   // get_name_1:  _jid   // get_name_2:  _jid   // get_Name:    _jid   // getName->1:  _jid   // getName->2:  _jid   // getName->N:  _jid   // ofs = 53626 ord = 2 addr = 0
	aload_0 
	iconst_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokenonvirtual_lib .routine_4687 // pc=2
	aload_0 
	lipush 1845547789481896446
	bipush 3
	invokestatic_lib module:WhatsApp-32.class#2.routine_6306(  ) // class#2
	putfield com.whatsapp.client.GroupInfoScreen.field_53630   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53630   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53630   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53630   // getName->1:     // getName->2:     // getName->N:     // ofs = 53630 ord = 3 addr = 0
	aload_0 
	aload_0 
	invokespecial com.whatsapp.client.GroupInfoScreen.routine_6574 // pc=1
	putfield com.whatsapp.client.GroupInfoScreen.field_53690   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53690   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53690   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53690   // getName->1:     // getName->2:     // getName->N:     // ofs = 53690 ord = 18 addr = 0
	aload_0 
	invokestatic_lib module:WhatsApp-7.class#21.routine_4127(  ) // class#21
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	aload_0 
	invokespecial com.whatsapp.client.GroupInfoScreen.routine_7181 // pc=1
	aload_0 
	invokespecial com.whatsapp.client.GroupInfoScreen.routine_6323 // pc=1
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.GroupInfoScreen.routine_6062( com.whatsapp.client.GroupInfoScreen ); // address: 0
	{
	enter 
	aload_0 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	sipush 915
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	aload_0 
	invokespecial com.whatsapp.client.GroupInfoScreen.routine_7124 // pc=1
	invokestatic_lib module:WhatsApp-21.class#0.routine_574(  ) // class#0
	putfield com.whatsapp.client.GroupInfoScreen.field_53666   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53666   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53666   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53666   // getName->1:     // getName->2:     // getName->N:     // ofs = 53666 ord = 12 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53666   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53666   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53666   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53666   // getName->1:     // getName->2:     // getName->N:     // ofs = 53666 ord = 12 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib //module:WhatsApp-13.class#2 module:WhatsApp-13.class#2 module:WhatsApp-13.class#2
	dup 
	aload_0 
	lgetfield com.whatsapp.client.GroupInfoScreen.field_53618   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53618   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53618   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53618   // getName->1:     // getName->2:     // getName->N:     // ofs = 53618 ord = 0 addr = 0
	invokespecial_lib .routine_8118 // pc=3
	putfield _contactPickerField   // get_name_1:  _contactPickerField   // get_name_2:  _contactPickerField   // get_Name:    _contactPickerField   // getName->1:  _contactPickerField   // getName->2:  _contactPickerField   // getName->N:  _contactPickerField   // ofs = 53670 ord = 13 addr = 0
	aload_0_getfield _contactPickerField   // get_name_1:  _contactPickerField   // get_name_2:  _contactPickerField   // get_Name:    _contactPickerField   // getName->1:  _contactPickerField   // getName->2:  _contactPickerField   // getName->N:  _contactPickerField   // ofs = 53670 ord = 13 addr = 0
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53690   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53690   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53690   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53690   // getName->1:     // getName->2:     // getName->N:     // ofs = 53690 ord = 18 addr = 0
	invokenonvirtual_lib .routine_6657 // pc=2
	aload_0_getfield _contactPickerField   // get_name_1:  _contactPickerField   // get_name_2:  _contactPickerField   // get_Name:    _contactPickerField   // getName->1:  _contactPickerField   // getName->2:  _contactPickerField   // getName->N:  _contactPickerField   // ofs = 53670 ord = 13 addr = 0
	new GroupInfoScreen$5
	dup 
	aload_0 
	invokespecial com.whatsapp.client.GroupInfoScreen$5.<init> // pc=2
	invokenonvirtual_lib .routine_6773 // pc=2
	aload_0 
	aload_0_getfield _contactPickerField   // get_name_1:  _contactPickerField   // get_name_2:  _contactPickerField   // get_Name:    _contactPickerField   // getName->1:  _contactPickerField   // getName->2:  _contactPickerField   // getName->N:  _contactPickerField   // ofs = 53670 ord = 13 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	return 
	}


private final com.whatsapp.client.GroupInfoScreen.routine_6157( com.whatsapp.client.GroupInfoScreen ); // address: 0
	{
	enter 
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 53622 ord = 1 addr = 0
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual long longValue( java.lang.Long ) // pc=1
	lstore 1
	sipush 923
	bipush 48
	invokestatic_lib net.rim.device.api.i18n.DateFormat getInstance( int ) // DateFormat
	lload 1
	invokevirtual java.lang.String formatLocal( net.rim.device.api.i18n.DateFormat, long ) // pc=3
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	astore_3 
	sipush 924
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 53622 ord = 1 addr = 0
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokestatic_lib module:WhatsApp-9.class#17.routine_7781(  ) // class#17
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
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
	new_lib Long//java.lang.Long java.lang.Long java.lang.Long
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


private final com.whatsapp.client.GroupInfoScreen.routine_6323( com.whatsapp.client.GroupInfoScreen ); // address: 0
	{
	enter 
	iipush 310000
	istore_1 
	sipush 1200
	istore_2 
	aload_0 
	sipush 265
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	new GroupInfoScreen$6
	dup 
	aload_0 
	invokespecial com.whatsapp.client.GroupInfoScreen$6.<init> // pc=2
	invokestatic_lib module:WhatsApp-34.class#11.routine_5026(  ) // class#11
	putfield com.whatsapp.client.GroupInfoScreen.field_53674   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53674   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53674   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53674   // getName->1:     // getName->2:     // getName->N:     // ofs = 53674 ord = 14 addr = 0
	aload_0 
	sipush 265
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	new GroupInfoScreen$7
	dup 
	aload_0 
	invokespecial com.whatsapp.client.GroupInfoScreen$7.<init> // pc=2
	invokestatic_lib module:WhatsApp-34.class#11.routine_5026(  ) // class#11
	putfield com.whatsapp.client.GroupInfoScreen.field_53678   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53678   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53678   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53678   // getName->1:     // getName->2:     // getName->N:     // ofs = 53678 ord = 15 addr = 0
	aload_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5730(  ) // class#28
	sipush 344
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	new GroupInfoScreen$8
	dup 
	aload_0 
	invokespecial com.whatsapp.client.GroupInfoScreen$8.<init> // pc=2
	invokestatic_lib module:WhatsApp-34.class#11.routine_4997(  ) // class#11
	putfield com.whatsapp.client.GroupInfoScreen.field_53682   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53682   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53682   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53682   // getName->1:     // getName->2:     // getName->N:     // ofs = 53682 ord = 16 addr = 0
	aload_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5730(  ) // class#28
	sipush 866
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	new GroupInfoScreen$9
	dup 
	aload_0 
	invokespecial com.whatsapp.client.GroupInfoScreen$9.<init> // pc=2
	invokestatic_lib module:WhatsApp-34.class#11.routine_4997(  ) // class#11
	putfield com.whatsapp.client.GroupInfoScreen.field_53686   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53686   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53686   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53686   // getName->1:     // getName->2:     // getName->N:     // ofs = 53686 ord = 17 addr = 0
	return 
	}


private final updateActionButtons( com.whatsapp.client.GroupInfoScreen ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-13.class#5.routine_9622(  ) // class#5
	astore_1 
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 53622 ord = 1 addr = 0
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_1 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label36
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53690   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53690   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53690   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53690   // getName->1:     // getName->2:     // getName->N:     // ofs = 53690 ord = 18 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53630   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53630   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53630   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53630   // getName->1:     // getName->2:     // getName->N:     // ofs = 53630 ord = 3 addr = 0
	if_icmplt Label25
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53698   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53698   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53698   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53698   // getName->1:     // getName->2:     // getName->N:     // ofs = 53698 ord = 20 addr = 0
	ifeq Label36
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53638   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53638   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53638   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53638   // getName->1:     // getName->2:     // getName->N:     // ofs = 53638 ord = 5 addr = 0
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53642   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53642   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53642   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53642   // getName->1:     // getName->2:     // getName->N:     // ofs = 53642 ord = 6 addr = 0
	invokevirtual delete( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53638   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53638   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53638   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53638   // getName->1:     // getName->2:     // getName->N:     // ofs = 53638 ord = 5 addr = 0
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53646   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53646   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53646   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53646   // getName->1:     // getName->2:     // getName->N:     // ofs = 53646 ord = 7 addr = 0
	invokevirtual delete( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.GroupInfoScreen.field_53698   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53698   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53698   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53698   // getName->1:     // getName->2:     // getName->N:     // ofs = 53698 ord = 20 addr = 0
	return 
Label25:
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53698   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53698   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53698   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53698   // getName->1:     // getName->2:     // getName->N:     // ofs = 53698 ord = 20 addr = 0
	ifne Label36
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53638   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53638   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53638   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53638   // getName->1:     // getName->2:     // getName->N:     // ofs = 53638 ord = 5 addr = 0
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53642   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53642   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53642   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53642   // getName->1:     // getName->2:     // getName->N:     // ofs = 53642 ord = 6 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53638   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53638   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53638   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53638   // getName->1:     // getName->2:     // getName->N:     // ofs = 53638 ord = 5 addr = 0
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53646   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53646   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53646   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53646   // getName->1:     // getName->2:     // getName->N:     // ofs = 53646 ord = 7 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	iconst_1 
	putfield com.whatsapp.client.GroupInfoScreen.field_53698   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53698   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53698   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53698   // getName->1:     // getName->2:     // getName->N:     // ofs = 53698 ord = 20 addr = 0
Label36:
	return 
	}


private final java.util.Vector com.whatsapp.client.GroupInfoScreen.routine_6574( com.whatsapp.client.GroupInfoScreen ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 53622 ord = 1 addr = 0
	invokenonvirtual_lib .routine_272 // pc=1
	astore_1 
	aload_1 
	ifnonnull Label24
	invokestatic_lib net.rim.device.api.system.RuntimeStore getRuntimeStore(  ) // RuntimeStore
	lipush 8535665252065932813
	invokevirtual java.lang.Object get( net.rim.device.api.system.RuntimeStore, long ) // pc=3
	checkcast_lib //module:WhatsApp-13.class#1 module:WhatsApp-13.class#1 module:WhatsApp-13.class#1
	astore_2 
	aload_2 
	ifnull Label20
	aload_2 
	aconst_null 
	iconst_1 
	invokenonvirtual_lib .routine_4566 // pc=3
	astore_1 
	aload_1 
	areturn 
Label20:
	new_lib String//java.lang.String java.lang.String java.lang.String
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
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	astore_1 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53690   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53690   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53690   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53690   // getName->1:     // getName->2:     // getName->N:     // ofs = 53690 ord = 18 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	invokespecial_lib java.util.Hashtable.<init> // pc=2
	astore_2 
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53690   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53690   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53690   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53690   // getName->1:     // getName->2:     // getName->N:     // ofs = 53690 ord = 18 addr = 0
	invokevirtual java.util.Enumeration elements( java.util.Vector ) // pc=1
	astore_3 
Label12:
	aload_3 
	invokeinterface interfacemethodref_30 // pc=1 guess=5
	ifeq Label22
	aload_2 
	aload_3 
	invokeinterface interfacemethodref_31 // pc=1 guess=6
	getstatic_lib TRUE // Boolean
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	goto Label12
Label22:
	new GroupInfoScreen$10
	dup 
	aload_0 
	invokespecial com.whatsapp.client.GroupInfoScreen$10.<init> // pc=2
	astore_4 
	aload_4 
	new GroupInfoScreen$11
	dup 
	aload_0 
	aload_2 
	invokespecial com.whatsapp.client.GroupInfoScreen$11.<init> // pc=3
	invokenonvirtual_lib .routine_5768 // pc=2
	new_lib net.rim.device.api.system.RuntimeStore//net.rim.device.api.system.RuntimeStore net.rim.device.api.system.RuntimeStore net.rim.device.api.system.RuntimeStore
	dup 
	iconst_1 
	invokespecial_lib net.rim.device.api.ui.TransitionContext.<init> // pc=2
	astore_5 
	aload_5 
	bipush 2
	iconst_1 
	invokevirtual setIntAttribute( net.rim.device.api.ui.TransitionContext, int, int ) // pc=3
	new_lib net.rim.device.api.system.RuntimeStore//net.rim.device.api.system.RuntimeStore net.rim.device.api.system.RuntimeStore net.rim.device.api.system.RuntimeStore
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
	new GroupInfoScreen$12
	dup 
	aload_0 
	aload_1 
	aload_4 
	invokespecial com.whatsapp.client.GroupInfoScreen$12.<init> // pc=4
	invokevirtual addScreenUiEngineAttachedListener( net.rim.device.api.ui.Screen, net.rim.device.api.ui.ScreenUiEngineAttachedListener ) // pc=2
	aload_1 
	aload_4 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}


private final addGroupMember( com.whatsapp.client.GroupInfoScreen, module:WhatsApp-10.class#30 ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53694   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53694   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53694   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53694   // getName->1:     // getName->2:     // getName->N:     // ofs = 53694 ord = 19 addr = 0
	ifnonnull Label8
	aload_0 
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield com.whatsapp.client.GroupInfoScreen.field_53694   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53694   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53694   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53694   // getName->1:     // getName->2:     // getName->N:     // ofs = 53694 ord = 19 addr = 0
Label8:
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53690   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53690   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53690   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53690   // getName->1:     // getName->2:     // getName->N:     // ofs = 53690 ord = 18 addr = 0
	aload_1 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53694   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53694   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53694   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53694   // getName->1:     // getName->2:     // getName->N:     // ofs = 53694 ord = 19 addr = 0
	aload_1 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_0_getfield _contactPickerField   // get_name_1:  _contactPickerField   // get_name_2:  _contactPickerField   // get_Name:    _contactPickerField   // getName->1:  _contactPickerField   // getName->2:  _contactPickerField   // getName->N:  _contactPickerField   // ofs = 53670 ord = 13 addr = 0
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53690   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53690   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53690   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53690   // getName->1:     // getName->2:     // getName->N:     // ofs = 53690 ord = 18 addr = 0
	invokenonvirtual_lib .routine_6657 // pc=2
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53666   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53666   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53666   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53666   // getName->1:     // getName->2:     // getName->N:     // ofs = 53666 ord = 12 addr = 0
	aload_0 
	invokespecial com.whatsapp.client.GroupInfoScreen.routine_7124 // pc=1
	invokenonvirtual_lib .routine_29 // pc=2
	aload_0 
	invokespecial com.whatsapp.client.GroupInfoScreen.updateActionButtons // pc=1
	return 
	}


private final openGroupMedia( com.whatsapp.client.GroupInfoScreen ); // address: 0
	{
	enter 
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	astore_1 
	new_lib com.whatsapp.client.MediaBrowserScreen//com.whatsapp.client.MediaBrowserScreen com.whatsapp.client.MediaBrowserScreen com.whatsapp.client.MediaBrowserScreen
	dup 
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 53622 ord = 1 addr = 0
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield _jid   // get_name_1:  _jid   // get_name_2:  _jid   // get_Name:    _jid   // getName->1:  _jid   // getName->2:  _jid   // getName->N:  _jid   // ofs = 53626 ord = 2 addr = 0
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 53622 ord = 1 addr = 0
	invokespecial_lib .routine_4398 // pc=4
	astore_2 
	new_lib net.rim.device.api.system.RuntimeStore//net.rim.device.api.system.RuntimeStore net.rim.device.api.system.RuntimeStore net.rim.device.api.system.RuntimeStore
	dup 
	bipush 2
	invokespecial_lib net.rim.device.api.ui.TransitionContext.<init> // pc=2
	astore_3 
	aload_3 
	bipush 4
	iconst_1 
	invokevirtual setIntAttribute( net.rim.device.api.ui.TransitionContext, int, int ) // pc=3
	new_lib net.rim.device.api.system.RuntimeStore//net.rim.device.api.system.RuntimeStore net.rim.device.api.system.RuntimeStore net.rim.device.api.system.RuntimeStore
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
	new GroupInfoScreen$13
	dup 
	aload_0 
	aload_1 
	aload_2 
	invokespecial com.whatsapp.client.GroupInfoScreen$13.<init> // pc=4
	invokevirtual addScreenUiEngineAttachedListener( net.rim.device.api.ui.Screen, net.rim.device.api.ui.ScreenUiEngineAttachedListener ) // pc=2
	aload_1 
	aload_2 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}


private final boolean com.whatsapp.client.GroupInfoScreen.routine_7057( com.whatsapp.client.GroupInfoScreen ); // address: 0
	{
	enter 
	aload_0_getfield _subjectLabel   // get_name_1:  _subjectLabel   // get_name_2:  _subjectLabel   // get_Name:    _subjectLabel   // getName->1:  _subjectLabel   // getName->2:  _subjectLabel   // getName->N:  _subjectLabel   // ofs = 53650 ord = 8 addr = 0
	invokenonvirtual_lib .routine_213 // pc=1
	invokenonvirtual_lib java.lang.String.trim // pc=1
	astore_1 
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 53622 ord = 1 addr = 0
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
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokestatic_lib inform( java.lang.String ) // Dialog
	iconst_0 
	ireturn 
Label26:
	aload_0 
	invokevirtual boolean onSave( net.rim.device.api.ui.Screen ) // pc=1
	ireturn 
	}


private final java.lang.String com.whatsapp.client.GroupInfoScreen.routine_7124( com.whatsapp.client.GroupInfoScreen ); // address: 0
	{
	enter_narrow 
	new_lib java.io.Reader//java.io.Reader java.io.Reader java.io.Reader
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	astore_1 
	aload_1 
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53690   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53690   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53690   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53690   // getName->1:     // getName->2:     // getName->N:     // ofs = 53690 ord = 18 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	pop 
	aload_1 
	bipush 47
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	aload_1 
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53630   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53630   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53630   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53630   // getName->1:     // getName->2:     // getName->N:     // ofs = 53630 ord = 3 addr = 0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	pop 
	aload_1 
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}


private final com.whatsapp.client.GroupInfoScreen.routine_7181( com.whatsapp.client.GroupInfoScreen ); // address: 0
	{
	enter 
	aload_0 
	new_lib com.whatsapp.field.WAHorizontalFieldManager//com.whatsapp.field.WAHorizontalFieldManager com.whatsapp.field.WAHorizontalFieldManager com.whatsapp.field.WAHorizontalFieldManager
	dup 
	invokespecial_lib .routine_4534 // pc=1
	putfield com.whatsapp.client.GroupInfoScreen.field_53638   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53638   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53638   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53638   // getName->1:     // getName->2:     // getName->N:     // ofs = 53638 ord = 5 addr = 0
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53638   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53638   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53638   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53638   // getName->1:     // getName->2:     // getName->N:     // ofs = 53638 ord = 5 addr = 0
	iconst_1 
	invokenonvirtual_lib .routine_3640 // pc=2
	new_lib com.whatsapp.field.ColorLabelField//com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField
	dup 
	sipush 912
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
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
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53638   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53638   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53638   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53638   // getName->1:     // getName->2:     // getName->N:     // ofs = 53638 ord = 5 addr = 0
	aload_1 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	invokestatic_lib module:WhatsApp-13.class#5.routine_9622(  ) // class#5
	astore_2 
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 53622 ord = 1 addr = 0
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_2 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label35
	goto_w Label93
Label35:
	aload_0 
	new_lib com.whatsapp.field.VerticalShadedSeparator//module:WhatsApp-37.class#13 module:WhatsApp-37.class#13 module:WhatsApp-37.class#13
	dup 
	lipush 2305843009213693952
	invokespecial_lib .routine_3621 // pc=3
	putfield com.whatsapp.client.GroupInfoScreen.field_53642   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53642   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53642   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53642   // getName->1:     // getName->2:     // getName->N:     // ofs = 53642 ord = 6 addr = 0
	aload_0 
	new_lib com.whatsapp.client.BitmapButtonField//com.whatsapp.client.BitmapButtonField com.whatsapp.client.BitmapButtonField com.whatsapp.client.BitmapButtonField
	dup 
	ldc literal_192:"add-person.png"
	invokestatic_lib net.rim.device.api.system.Bitmap getBitmapResource( java.lang.String ) // Bitmap
	aconst_null 
	aconst_null 
	aconst_null 
	aconst_null 
	aconst_null 
	lipush 51539607552
	invokespecial_lib .routine_1151 // pc=9
	putfield com.whatsapp.client.GroupInfoScreen.field_53646   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53646   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53646   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53646   // getName->1:     // getName->2:     // getName->N:     // ofs = 53646 ord = 7 addr = 0
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53646   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53646   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53646   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53646   // getName->1:     // getName->2:     // getName->N:     // ofs = 53646 ord = 7 addr = 0
	iconst_0 
	invokenonvirtual_lib .routine_20 // pc=2
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53646   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53646   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53646   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53646   // getName->1:     // getName->2:     // getName->N:     // ofs = 53646 ord = 7 addr = 0
	iconst_0 
	bipush 3
	iconst_0 
	bipush 3
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53646   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53646   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53646   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53646   // getName->1:     // getName->2:     // getName->N:     // ofs = 53646 ord = 7 addr = 0
	ldc literal_193:"narrow-hover.png"
	invokestatic_lib net.rim.device.api.system.Bitmap getBitmapResource( java.lang.String ) // Bitmap
	new_lib InterruptedException//java.lang.InterruptedException java.lang.InterruptedException java.lang.InterruptedException
	dup 
	iconst_0 
	bipush 10
	iconst_0 
	bipush 10
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=5
	invokenonvirtual_lib .routine_31 // pc=3
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53646   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53646   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53646   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53646   // getName->1:     // getName->2:     // getName->N:     // ofs = 53646 ord = 7 addr = 0
	new GroupInfoScreen$1
	dup 
	aload_0 
	invokespecial com.whatsapp.client.GroupInfoScreen$1.<init> // pc=2
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53690   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53690   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53690   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53690   // getName->1:     // getName->2:     // getName->N:     // ofs = 53690 ord = 18 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53630   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53630   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53630   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53630   // getName->1:     // getName->2:     // getName->N:     // ofs = 53630 ord = 3 addr = 0
	if_icmpge Label93
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53638   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53638   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53638   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53638   // getName->1:     // getName->2:     // getName->N:     // ofs = 53638 ord = 5 addr = 0
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53642   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53642   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53642   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53642   // getName->1:     // getName->2:     // getName->N:     // ofs = 53642 ord = 6 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53638   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53638   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53638   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53638   // getName->1:     // getName->2:     // getName->N:     // ofs = 53638 ord = 5 addr = 0
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53646   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53646   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53646   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53646   // getName->1:     // getName->2:     // getName->N:     // ofs = 53646 ord = 7 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	iconst_1 
	putfield com.whatsapp.client.GroupInfoScreen.field_53698   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53698   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53698   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53698   // getName->1:     // getName->2:     // getName->N:     // ofs = 53698 ord = 20 addr = 0
Label93:
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53638   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53638   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53638   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53638   // getName->1:     // getName->2:     // getName->N:     // ofs = 53638 ord = 5 addr = 0
	invokestatic_lib module:WhatsApp-32.class#2.routine_6778(  ) // class#2
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53638   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53638   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53638   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53638   // getName->1:     // getName->2:     // getName->N:     // ofs = 53638 ord = 5 addr = 0
	iconst_0 
	iconst_0 
	iconst_0 
	iconst_0 
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53638   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53638   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53638   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53638   // getName->1:     // getName->2:     // getName->N:     // ofs = 53638 ord = 5 addr = 0
	iconst_0 
	iconst_0 
	iconst_0 
	iconst_0 
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53638   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53638   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53638   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53638   // getName->1:     // getName->2:     // getName->N:     // ofs = 53638 ord = 5 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib net.rim.device.api.crypto.AbstractDigest//net.rim.device.api.crypto.AbstractDigest net.rim.device.api.crypto.AbstractDigest net.rim.device.api.crypto.AbstractDigest
	dup 
	lipush 18014398509481984
	invokespecial_lib net.rim.device.api.ui.component.NullField.<init> // pc=3
	putfield com.whatsapp.client.GroupInfoScreen.field_53634   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53634   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53634   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53634   // getName->1:     // getName->2:     // getName->N:     // ofs = 53634 ord = 4 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53634   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53634   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53634   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53634   // getName->1:     // getName->2:     // getName->N:     // ofs = 53634 ord = 4 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	lipush -2076668881308291501
	bipush 10
	invokestatic_lib module:WhatsApp-32.class#2.routine_6306(  ) // class#2
	istore_3 
	new_lib java.io.Reader//java.io.Reader java.io.Reader java.io.Reader
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	sipush 771
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_194:": "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_4 
	aload_0 
	new_lib com.whatsapp.client.BBMStyleInputField//com.whatsapp.client.BBMStyleInputField com.whatsapp.client.BBMStyleInputField com.whatsapp.client.BBMStyleInputField
	dup 
	lipush 2147483648
	invokespecial_lib .routine_1619 // pc=3
	putfield _subjectLabel   // get_name_1:  _subjectLabel   // get_name_2:  _subjectLabel   // get_Name:    _subjectLabel   // getName->1:  _subjectLabel   // getName->2:  _subjectLabel   // getName->N:  _subjectLabel   // ofs = 53650 ord = 8 addr = 0
	aload_0_getfield _subjectLabel   // get_name_1:  _subjectLabel   // get_name_2:  _subjectLabel   // get_Name:    _subjectLabel   // getName->1:  _subjectLabel   // getName->2:  _subjectLabel   // getName->N:  _subjectLabel   // ofs = 53650 ord = 8 addr = 0
	aload_4 
	invokevirtual setLabel( net.rim.device.api.ui.component.BasicEditField, java.lang.String ) // pc=2
	aload_0_getfield _subjectLabel   // get_name_1:  _subjectLabel   // get_name_2:  _subjectLabel   // get_Name:    _subjectLabel   // getName->1:  _subjectLabel   // getName->2:  _subjectLabel   // getName->N:  _subjectLabel   // ofs = 53650 ord = 8 addr = 0
	iipush 5265246
	invokenonvirtual_lib .routine_20 // pc=2
	aload_0_getfield _subjectLabel   // get_name_1:  _subjectLabel   // get_name_2:  _subjectLabel   // get_Name:    _subjectLabel   // getName->1:  _subjectLabel   // getName->2:  _subjectLabel   // getName->N:  _subjectLabel   // ofs = 53650 ord = 8 addr = 0
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 53622 ord = 1 addr = 0
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokenonvirtual_lib .routine_243 // pc=2
	aload_0_getfield _subjectLabel   // get_name_1:  _subjectLabel   // get_name_2:  _subjectLabel   // get_Name:    _subjectLabel   // getName->1:  _subjectLabel   // getName->2:  _subjectLabel   // getName->N:  _subjectLabel   // ofs = 53650 ord = 8 addr = 0
	iload_3 
	invokenonvirtual_lib .routine_1188 // pc=2
	aload_0_getfield _subjectLabel   // get_name_1:  _subjectLabel   // get_name_2:  _subjectLabel   // get_Name:    _subjectLabel   // getName->1:  _subjectLabel   // getName->2:  _subjectLabel   // getName->N:  _subjectLabel   // ofs = 53650 ord = 8 addr = 0
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokenonvirtual_lib .routine_9 // pc=2
	aload_0_getfield _subjectLabel   // get_name_1:  _subjectLabel   // get_name_2:  _subjectLabel   // get_Name:    _subjectLabel   // getName->1:  _subjectLabel   // getName->2:  _subjectLabel   // getName->N:  _subjectLabel   // ofs = 53650 ord = 8 addr = 0
	getstatic_lib module:WhatsApp-7.class#21.static_55 // class#21
	invokevirtual setBorder( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Border ) // pc=2
	aload_0_getfield _subjectLabel   // get_name_1:  _subjectLabel   // get_name_2:  _subjectLabel   // get_Name:    _subjectLabel   // getName->1:  _subjectLabel   // getName->2:  _subjectLabel   // getName->N:  _subjectLabel   // ofs = 53650 ord = 8 addr = 0
	iipush 16777215
	invokestatic_lib net.rim.device.api.ui.decor.Background createSolidBackground( int ) // BackgroundFactory
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	aload_0_getfield _subjectLabel   // get_name_1:  _subjectLabel   // get_name_2:  _subjectLabel   // get_Name:    _subjectLabel   // getName->1:  _subjectLabel   // getName->2:  _subjectLabel   // getName->N:  _subjectLabel   // ofs = 53650 ord = 8 addr = 0
	bipush 2
	bipush 4
	bipush 2
	bipush 4
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0_getfield _subjectLabel   // get_name_1:  _subjectLabel   // get_name_2:  _subjectLabel   // get_Name:    _subjectLabel   // getName->1:  _subjectLabel   // getName->2:  _subjectLabel   // getName->N:  _subjectLabel   // ofs = 53650 ord = 8 addr = 0
	bipush 6
	bipush 16
	bipush 10
	bipush 16
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	aload_0_getfield _subjectLabel   // get_name_1:  _subjectLabel   // get_name_2:  _subjectLabel   // get_Name:    _subjectLabel   // getName->1:  _subjectLabel   // getName->2:  _subjectLabel   // getName->N:  _subjectLabel   // ofs = 53650 ord = 8 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	invokespecial com.whatsapp.client.GroupInfoScreen.routine_7764 // pc=1
	aload_0 
	invokespecial com.whatsapp.client.GroupInfoScreen.routine_6062 // pc=1
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 53622 ord = 1 addr = 0
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	ifnull Label207
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 53622 ord = 1 addr = 0
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifnull Label207
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 53622 ord = 1 addr = 0
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual long longValue( java.lang.Long ) // pc=1
	iconst_0 
	i2l 
	lcmp 
	ifle Label207
	aload_0 
	new_lib com.whatsapp.field.ShadedSeparator//module:WhatsApp-37.class#11 module:WhatsApp-37.class#11 module:WhatsApp-37.class#11
	dup 
	invokespecial_lib .routine_3198 // pc=1
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	invokespecial com.whatsapp.client.GroupInfoScreen.routine_6157 // pc=1
	aload_0 
	new_lib net.rim.device.api.crypto.AbstractDigest//net.rim.device.api.crypto.AbstractDigest net.rim.device.api.crypto.AbstractDigest net.rim.device.api.crypto.AbstractDigest
	dup 
	lipush 18014398509481984
	invokespecial_lib net.rim.device.api.ui.component.NullField.<init> // pc=3
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
Label207:
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53634   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53634   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53634   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53634   // getName->1:     // getName->2:     // getName->N:     // ofs = 53634 ord = 4 addr = 0
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	return 
	}


private final com.whatsapp.client.GroupInfoScreen.routine_7764( com.whatsapp.client.GroupInfoScreen ); // address: 0
	{
	enter 
	aload_0 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	sipush 913
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	sipush 834
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokestatic_lib module:WhatsApp-21.class#0.routine_574(  ) // class#0
	putfield _groupMediaLabel   // get_name_1:  _groupMediaLabel   // get_name_2:  _groupMediaLabel   // get_Name:    _groupMediaLabel   // getName->1:  _groupMediaLabel   // getName->2:  _groupMediaLabel   // getName->N:  _groupMediaLabel   // ofs = 53654 ord = 9 addr = 0
	new GroupInfoScreen$2
	dup 
	aload_0 
	invokespecial com.whatsapp.client.GroupInfoScreen$2.<init> // pc=2
	astore_1 
	aload_0 
	new_lib com.whatsapp.client.MediaPreviewButton//com.whatsapp.client.MediaPreviewButton com.whatsapp.client.MediaPreviewButton com.whatsapp.client.MediaPreviewButton
	dup 
	invokespecial_lib .routine_8312 // pc=1
	putfield _groupMediaButton   // get_name_1:  _groupMediaButton   // get_name_2:  _groupMediaButton   // get_Name:    _groupMediaButton   // getName->1:  _groupMediaButton   // getName->2:  _groupMediaButton   // getName->N:  _groupMediaButton   // ofs = 53662 ord = 11 addr = 0
	aload_0_getfield _groupMediaButton   // get_name_1:  _groupMediaButton   // get_name_2:  _groupMediaButton   // get_Name:    _groupMediaButton   // getName->1:  _groupMediaButton   // getName->2:  _groupMediaButton   // getName->N:  _groupMediaButton   // ofs = 53662 ord = 11 addr = 0
	invokenonvirtual_lib .routine_7510 // pc=1
	istore_2 
	new GroupInfoScreen$3
	dup 
	aload_0 
	iload_2 
	invokespecial com.whatsapp.client.GroupInfoScreen$3.<init> // pc=3
	astore_3 
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53702   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53702   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53702   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53702   // getName->1:     // getName->2:     // getName->N:     // ofs = 53702 ord = 21 addr = 0
	aload_3 
	invokenonvirtual_lib .routine_5464 // pc=2
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53702   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53702   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53702   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53702   // getName->1:     // getName->2:     // getName->N:     // ofs = 53702 ord = 21 addr = 0
	aload_1 
	invokenonvirtual_lib .routine_5464 // pc=2
	aload_0_getfield _groupMediaButton   // get_name_1:  _groupMediaButton   // get_name_2:  _groupMediaButton   // get_Name:    _groupMediaButton   // getName->1:  _groupMediaButton   // getName->2:  _groupMediaButton   // getName->N:  _groupMediaButton   // ofs = 53662 ord = 11 addr = 0
	new GroupInfoScreen$4
	dup 
	aload_0 
	invokespecial com.whatsapp.client.GroupInfoScreen$4.<init> // pc=2
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0 
	new_lib com.whatsapp.field.ProgressAnimationField//module:WhatsApp-37.class#9 module:WhatsApp-37.class#9 module:WhatsApp-37.class#9
	dup 
	lipush 12884901888
	invokespecial_lib .routine_2771 // pc=3
	putfield _groupMediaProgress   // get_name_1:  _groupMediaProgress   // get_name_2:  _groupMediaProgress   // get_Name:    _groupMediaProgress   // getName->1:  _groupMediaProgress   // getName->2:  _groupMediaProgress   // getName->N:  _groupMediaProgress   // ofs = 53658 ord = 10 addr = 0
	aload_0_getfield _groupMediaProgress   // get_name_1:  _groupMediaProgress   // get_name_2:  _groupMediaProgress   // get_Name:    _groupMediaProgress   // getName->1:  _groupMediaProgress   // getName->2:  _groupMediaProgress   // getName->N:  _groupMediaProgress   // ofs = 53658 ord = 10 addr = 0
	invokestatic setMediaPadding( net.rim.device.api.ui.Field ) // GroupInfoScreen
	aload_0 
	aload_0_getfield _groupMediaLabel   // get_name_1:  _groupMediaLabel   // get_name_2:  _groupMediaLabel   // get_Name:    _groupMediaLabel   // getName->1:  _groupMediaLabel   // getName->2:  _groupMediaLabel   // getName->N:  _groupMediaLabel   // ofs = 53654 ord = 9 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	aload_0_getfield _groupMediaProgress   // get_name_1:  _groupMediaProgress   // get_name_2:  _groupMediaProgress   // get_Name:    _groupMediaProgress   // getName->1:  _groupMediaProgress   // getName->2:  _groupMediaProgress   // getName->N:  _groupMediaProgress   // ofs = 53658 ord = 10 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	return 
	}


private final updateDisplayedContacts( com.whatsapp.client.GroupInfoScreen ); // address: 0
	{
	enter 
	aload_0 
	aload_0 
	invokespecial com.whatsapp.client.GroupInfoScreen.routine_6574 // pc=1
	putfield com.whatsapp.client.GroupInfoScreen.field_53690   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53690   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53690   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53690   // getName->1:     // getName->2:     // getName->N:     // ofs = 53690 ord = 18 addr = 0
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53694   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53694   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53694   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53694   // getName->1:     // getName->2:     // getName->N:     // ofs = 53694 ord = 19 addr = 0
	ifnull Label43
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53694   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53694   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53694   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53694   // getName->1:     // getName->2:     // getName->N:     // ofs = 53694 ord = 19 addr = 0
	invokevirtual boolean isEmpty( java.util.Vector ) // pc=1
	ifne Label43
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53630   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53630   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53630   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53630   // getName->1:     // getName->2:     // getName->N:     // ofs = 53630 ord = 3 addr = 0
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53690   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53690   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53690   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53690   // getName->1:     // getName->2:     // getName->N:     // ofs = 53690 ord = 18 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	isub 
	iconst_0 
	invokestatic_lib int max( int, int ) // Math
	istore_1 
Label17:
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53694   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53694   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53694   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53694   // getName->1:     // getName->2:     // getName->N:     // ofs = 53694 ord = 19 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	iload_1 
	if_icmple Label28
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53694   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53694   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53694   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53694   // getName->1:     // getName->2:     // getName->N:     // ofs = 53694 ord = 19 addr = 0
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53694   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53694   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53694   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53694   // getName->1:     // getName->2:     // getName->N:     // ofs = 53694 ord = 19 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	iconst_1 
	isub 
	invokevirtual removeElementAt( java.util.Vector, int ) // pc=2
	goto Label17
Label28:
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53694   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53694   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53694   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53694   // getName->1:     // getName->2:     // getName->N:     // ofs = 53694 ord = 19 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_2 
	iconst_0 
	istore_3 
Label33:
	iload_3 
	iload_2 
	if_icmpge Label43
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53690   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53690   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53690   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53690   // getName->1:     // getName->2:     // getName->N:     // ofs = 53690 ord = 18 addr = 0
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53694   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53694   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53694   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53694   // getName->1:     // getName->2:     // getName->N:     // ofs = 53694 ord = 19 addr = 0
	iload_3 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	iinc 3 1
	goto Label33
Label43:
	aload_0_getfield _contactPickerField   // get_name_1:  _contactPickerField   // get_name_2:  _contactPickerField   // get_Name:    _contactPickerField   // getName->1:  _contactPickerField   // getName->2:  _contactPickerField   // getName->N:  _contactPickerField   // ofs = 53670 ord = 13 addr = 0
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53690   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53690   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53690   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53690   // getName->1:     // getName->2:     // getName->N:     // ofs = 53690 ord = 18 addr = 0
	invokenonvirtual_lib .routine_6657 // pc=2
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53666   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53666   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53666   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53666   // getName->1:     // getName->2:     // getName->N:     // ofs = 53666 ord = 12 addr = 0
	aload_0 
	invokespecial com.whatsapp.client.GroupInfoScreen.routine_7124 // pc=1
	invokenonvirtual_lib .routine_29 // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final closeScreen( com.whatsapp.client.GroupInfoScreen ); // address: 0
	{
	enter_narrow 
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	astore_1 
	aload_1 
	aload_0 
	invokevirtual popScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}


public final onContactUpdated( com.whatsapp.client.GroupInfoScreen, module:WhatsApp.class#11 ); // address: 0
	{
	enter 
	aload_1 
	ifnull Label7
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53690   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53690   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53690   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53690   // getName->1:     // getName->2:     // getName->N:     // ofs = 53690 ord = 18 addr = 0
	aload_1 
	invokevirtual boolean contains( java.util.Vector, java.lang.Object ) // pc=2
	ifeq Label13
Label7:
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	new GroupInfoScreen$15
	dup 
	aload_0 
	invokespecial com.whatsapp.client.GroupInfoScreen$15.<init> // pc=2
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
	aload_0_getfield _jid   // get_name_1:  _jid   // get_name_2:  _jid   // get_Name:    _jid   // getName->1:  _jid   // getName->2:  _jid   // getName->N:  _jid   // ofs = 53626 ord = 2 addr = 0
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
	aload_0_getfield _jid   // get_name_1:  _jid   // get_name_2:  _jid   // get_Name:    _jid   // getName->1:  _jid   // getName->2:  _jid   // getName->N:  _jid   // ofs = 53626 ord = 2 addr = 0
	aload_1 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label11
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	new GroupInfoScreen$14
	dup 
	aload_0 
	invokespecial com.whatsapp.client.GroupInfoScreen$14.<init> // pc=2
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
	aload_0_getfield _contactPickerField   // get_name_1:  _contactPickerField   // get_name_2:  _contactPickerField   // get_Name:    _contactPickerField   // getName->1:  _contactPickerField   // getName->2:  _contactPickerField   // getName->N:  _contactPickerField   // ofs = 53670 ord = 13 addr = 0
	if_acmpeq Label12
	goto_w Label82
Label12:
	aload_0_getfield _contactPickerField   // get_name_1:  _contactPickerField   // get_name_2:  _contactPickerField   // get_Name:    _contactPickerField   // getName->1:  _contactPickerField   // getName->2:  _contactPickerField   // getName->N:  _contactPickerField   // ofs = 53670 ord = 13 addr = 0
	invokenonvirtual_lib .routine_6806 // pc=1
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
	invokestatic_lib module:WhatsApp-13.class#5.routine_9622(  ) // class#5
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
	invokenonvirtual_lib .routine_5797 // pc=1
	astore_7 
	iload_6 
	ifne Label48
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53674   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53674   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53674   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53674   // getName->1:     // getName->2:     // getName->N:     // ofs = 53674 ord = 14 addr = 0
	sipush 265
	aload_7 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	invokenonvirtual_lib .routine_4957 // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53674   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53674   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53674   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53674   // getName->1:     // getName->2:     // getName->N:     // ofs = 53674 ord = 14 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label48:
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53678   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53678   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53678   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53678   // getName->1:     // getName->2:     // getName->N:     // ofs = 53678 ord = 15 addr = 0
	bipush 55
	aload_7 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	invokenonvirtual_lib .routine_4957 // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53678   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53678   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53678   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53678   // getName->1:     // getName->2:     // getName->N:     // ofs = 53678 ord = 15 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	return 
Label57:
	aload_5 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokestatic_lib module:WhatsApp-9.class#17.routine_8031(  ) // class#17
	astore_7 
	iload_6 
	ifne Label71
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53674   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53674   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53674   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53674   // getName->1:     // getName->2:     // getName->N:     // ofs = 53674 ord = 14 addr = 0
	sipush 265
	aload_7 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	invokenonvirtual_lib .routine_4957 // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53674   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53674   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53674   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53674   // getName->1:     // getName->2:     // getName->N:     // ofs = 53674 ord = 14 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label71:
	aload_1 
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53682   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53682   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53682   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53682   // getName->1:     // getName->2:     // getName->N:     // ofs = 53682 ord = 16 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53686   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53686   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53686   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53686   // getName->1:     // getName->2:     // getName->N:     // ofs = 53686 ord = 17 addr = 0
	sipush 866
	aload_7 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	invokenonvirtual_lib .routine_4957 // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53686   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53686   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53686   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53686   // getName->1:     // getName->2:     // getName->N:     // ofs = 53686 ord = 17 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label82:
	return 
	}


public final save( com.whatsapp.client.GroupInfoScreen ); // address: 0
	{
	enter 
	aload_0_getfield _subjectLabel   // get_name_1:  _subjectLabel   // get_name_2:  _subjectLabel   // get_Name:    _subjectLabel   // getName->1:  _subjectLabel   // getName->2:  _subjectLabel   // getName->N:  _subjectLabel   // ofs = 53650 ord = 8 addr = 0
	invokenonvirtual_lib .routine_213 // pc=1
	invokenonvirtual_lib java.lang.String.trim // pc=1
	astore_1 
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 53622 ord = 1 addr = 0
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	astore_2 
	aload_2 
	aload_1 
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label19
	lipush 5652081555793928688
	new_lib //module:WhatsApp-10.class#26 module:WhatsApp-10.class#26 module:WhatsApp-10.class#26
	dup 
	aload_0_getfield _jid   // get_name_1:  _jid   // get_name_2:  _jid   // get_Name:    _jid   // getName->1:  _jid   // getName->2:  _jid   // getName->N:  _jid   // ofs = 53626 ord = 2 addr = 0
	aload_1 
	invokespecial_lib .routine_4521 // pc=3
	invokestatic_lib module:WhatsApp-32.class#2.routine_5718(  ) // class#2
Label19:
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53694   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53694   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53694   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53694   // getName->1:     // getName->2:     // getName->N:     // ofs = 53694 ord = 19 addr = 0
	ifnull Label53
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53694   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53694   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53694   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53694   // getName->1:     // getName->2:     // getName->N:     // ofs = 53694 ord = 19 addr = 0
	invokevirtual boolean isEmpty( java.util.Vector ) // pc=1
	ifne Label53
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_3 
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53694   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53694   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53694   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53694   // getName->1:     // getName->2:     // getName->N:     // ofs = 53694 ord = 19 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_4 
	iconst_0 
	istore_5 
Label33:
	iload_5 
	iload_4 
	if_icmpge Label46
	aload_3 
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53694   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53694   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53694   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53694   // getName->1:     // getName->2:     // getName->N:     // ofs = 53694 ord = 19 addr = 0
	iload_5 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib //module:WhatsApp-10.class#30 module:WhatsApp-10.class#30 module:WhatsApp-10.class#30
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	iinc 5 1
	goto Label33
Label46:
	lipush 5652081555793928688
	new_lib com.whatsapp.client.ChatServerOperation$CreateGroup$2//module:WhatsApp-10.class#6 module:WhatsApp-10.class#6 module:WhatsApp-10.class#6
	dup 
	aload_0_getfield _jid   // get_name_1:  _jid   // get_name_2:  _jid   // get_Name:    _jid   // getName->1:  _jid   // getName->2:  _jid   // getName->N:  _jid   // ofs = 53626 ord = 2 addr = 0
	aload_3 
	invokespecial_lib .routine_3138 // pc=3
	invokestatic_lib module:WhatsApp-32.class#2.routine_5718(  ) // class#2
Label53:
	return 
	}


public final boolean isDirty( com.whatsapp.client.GroupInfoScreen ); // address: 0
	{
	enter 
	aload_0_getfield _subjectLabel   // get_name_1:  _subjectLabel   // get_name_2:  _subjectLabel   // get_Name:    _subjectLabel   // getName->1:  _subjectLabel   // getName->2:  _subjectLabel   // getName->N:  _subjectLabel   // ofs = 53650 ord = 8 addr = 0
	invokenonvirtual_lib .routine_213 // pc=1
	invokenonvirtual_lib java.lang.String.trim // pc=1
	astore_1 
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 53622 ord = 1 addr = 0
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
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53694   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53694   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53694   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53694   // getName->1:     // getName->2:     // getName->N:     // ofs = 53694 ord = 19 addr = 0
	ifnull Label23
	aload_0_getfield com.whatsapp.client.GroupInfoScreen.field_53694   // get_name_1:  com.whatsapp.client.GroupInfoScreen.field_53694   // get_name_2:  com.whatsapp.client.GroupInfoScreen.field_53694   // get_Name:    com.whatsapp.client.GroupInfoScreen.field_53694   // getName->1:     // getName->2:     // getName->N:     // ofs = 53694 ord = 19 addr = 0
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
	invokespecial com.whatsapp.client.GroupInfoScreen.routine_7057 // pc=1
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
