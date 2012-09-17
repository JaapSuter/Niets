// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-12.cod
// Module version  : 2.7.6550
// Class ID        : 57
// ########################################################


package com.whatsapp.client;


abstract public final class DeleteAccountScreen extends 

{
	// @@@@@@@@@@@@@ Static fields 
	private static String /*java.lang.String*/  field_43620 ; // ofs = 43620 addr = 303)

	// @@@@@@@@@@@@@ Fields 
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_43588 ; // ofs = 43588 addr = 0)
	private net.rim.device.api.ui.component.NullField /*net.rim.device.api.ui.component.NullField*/  field_43592 ; // ofs = 43592 addr = 0)
	private net.rim.device.api.ui.component.LabelField /*net.rim.device.api.ui.component.LabelField*/  field_43596 ; // ofs = 43596 addr = 0)
	private com.whatsapp.client.PhoneNumberConfirmationField /*com.whatsapp.client.PhoneNumberConfirmationField*/  _phoneField ; // ofs = 43600 addr = 0)
	private com.whatsapp.field.WAButtonField /*com.whatsapp.field.WAButtonField*/  _deleteButton ; // ofs = 43604 addr = 0)
	private net.rim.device.api.ui.container.VerticalFieldManager /*net.rim.device.api.ui.container.VerticalFieldManager*/  _waitingArea ; // ofs = 43608 addr = 0)
	private String /*java.lang.String*/  _confirmedPhoneNumber ; // ofs = 43612 addr = 0)
	private boolean /*boolean*/  field_43616 ; // ofs = 43616 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.DeleteAccountScreen ); // address: 0
	{
	enter 
	aload_0 
	iipush 262144
	i2l 
	invokespecial_lib .routine_7065 // pc=3
	aload_0 
	invokestatic_lib module:WhatsApp-43.class#0.routine_606(  ) // class#0
	aload_0 
	invokestatic_lib module:WhatsApp-7.class#11.routine_4268(  ) // class#11
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	aload_0 
	sipush 983
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	iipush 16777215
	invokestatic_lib module:WhatsApp-35.class#1.routine_5449(  ) // class#1
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	iipush 310000
	istore_1 
	sipush 1200
	istore_2 
	iload_1 
	iipush 65536
	iadd 
	istore_1 
	aload_0 
	new DeleteAccountScreen$1
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-29.class#7.routine_3556(  ) // class#7
	sipush 983
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial com.whatsapp.client.DeleteAccountScreen$1.<init> // pc=6
	putfield com.whatsapp.client.DeleteAccountScreen.field_43588   // get_name_1:  com.whatsapp.client.DeleteAccountScreen.field_43588   // get_name_2:  com.whatsapp.client.DeleteAccountScreen.field_43588   // get_Name:    com.whatsapp.client.DeleteAccountScreen.field_43588   // getName->1:     // getName->2:     // getName->N:     // ofs = 43588 ord = 0 addr = 0
	aload_0 
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	dup 
	lipush 18014398509481984
	invokespecial_lib net.rim.device.api.ui.component.NullField.<init> // pc=3
	putfield com.whatsapp.client.DeleteAccountScreen.field_43592   // get_name_1:  com.whatsapp.client.DeleteAccountScreen.field_43592   // get_name_2:  com.whatsapp.client.DeleteAccountScreen.field_43592   // get_Name:    com.whatsapp.client.DeleteAccountScreen.field_43592   // getName->1:     // getName->2:     // getName->N:     // ofs = 43592 ord = 1 addr = 0
	new_lib net.rim.device.api.ui.Font//net.rim.device.api.ui.Font net.rim.device.api.ui.Font net.rim.device.api.ui.Font
	dup 
	lipush 1152921504606846976
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.<init> // pc=3
	astore_3 
	aload_3 
	iconst_0 
	bipush 18
	bipush 18
	bipush 18
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_3 
	new_lib Class//java.lang.Class java.lang.Class java.lang.Class
	dup 
	sipush 984
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=2
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_3 
	aload_0 
	sipush 985
	invokespecial com.whatsapp.client.DeleteAccountScreen.routine_18538 // pc=2
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_3 
	aload_0 
	sipush 986
	invokespecial com.whatsapp.client.DeleteAccountScreen.routine_18538 // pc=2
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_3 
	aload_0 
	sipush 987
	invokespecial com.whatsapp.client.DeleteAccountScreen.routine_18538 // pc=2
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	invokestatic_lib module:WhatsApp-11.class#6.routine_1139(  ) // class#6
	getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	ifeq Label83
	aload_3 
	aload_0 
	sipush 988
	invokespecial com.whatsapp.client.DeleteAccountScreen.routine_18538 // pc=2
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
Label83:
	aload_0 
	new_lib Class//java.lang.Class java.lang.Class java.lang.Class
	dup 
	sipush 989
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=2
	putfield com.whatsapp.client.DeleteAccountScreen.field_43596   // get_name_1:  com.whatsapp.client.DeleteAccountScreen.field_43596   // get_name_2:  com.whatsapp.client.DeleteAccountScreen.field_43596   // get_Name:    com.whatsapp.client.DeleteAccountScreen.field_43596   // getName->1:     // getName->2:     // getName->N:     // ofs = 43596 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.client.DeleteAccountScreen.field_43596   // get_name_1:  com.whatsapp.client.DeleteAccountScreen.field_43596   // get_name_2:  com.whatsapp.client.DeleteAccountScreen.field_43596   // get_Name:    com.whatsapp.client.DeleteAccountScreen.field_43596   // getName->1:     // getName->2:     // getName->N:     // ofs = 43596 ord = 2 addr = 0
	iconst_0 
	bipush 18
	iconst_0 
	bipush 18
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	new_lib com.whatsapp.client.PhoneNumberConfirmationField//com.whatsapp.client.PhoneNumberConfirmationField com.whatsapp.client.PhoneNumberConfirmationField com.whatsapp.client.PhoneNumberConfirmationField
	dup 
	invokespecial_lib .routine_6731 // pc=1
	putfield _phoneField   // get_name_1:  _phoneField   // get_name_2:  _phoneField   // get_Name:    _phoneField   // getName->1:  _phoneField   // getName->2:  _phoneField   // getName->N:  _phoneField   // ofs = 43600 ord = 3 addr = 0
	aload_0_getfield _phoneField   // get_name_1:  _phoneField   // get_name_2:  _phoneField   // get_Name:    _phoneField   // getName->1:  _phoneField   // getName->2:  _phoneField   // getName->N:  _phoneField   // ofs = 43600 ord = 3 addr = 0
	new DeleteAccountScreen$2
	dup 
	aload_0 
	invokespecial com.whatsapp.client.DeleteAccountScreen$2.<init> // pc=2
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0 
	new DeleteAccountScreen$3
	dup 
	aload_0 
	sipush 983
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	lipush 12885000192
	invokespecial com.whatsapp.client.DeleteAccountScreen$3.<init> // pc=5
	putfield _deleteButton   // get_name_1:  _deleteButton   // get_name_2:  _deleteButton   // get_Name:    _deleteButton   // getName->1:  _deleteButton   // getName->2:  _deleteButton   // getName->N:  _deleteButton   // ofs = 43604 ord = 4 addr = 0
	aload_0_getfield _deleteButton   // get_name_1:  _deleteButton   // get_name_2:  _deleteButton   // get_Name:    _deleteButton   // getName->1:  _deleteButton   // getName->2:  _deleteButton   // getName->N:  _deleteButton   // ofs = 43604 ord = 4 addr = 0
	new DeleteAccountScreen$4
	dup 
	aload_0 
	invokespecial com.whatsapp.client.DeleteAccountScreen$4.<init> // pc=2
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0_getfield _deleteButton   // get_name_1:  _deleteButton   // get_name_2:  _deleteButton   // get_Name:    _deleteButton   // getName->1:  _deleteButton   // getName->2:  _deleteButton   // getName->N:  _deleteButton   // ofs = 43604 ord = 4 addr = 0
	bipush 7
	iconst_0 
	bipush 7
	iconst_0 
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	invokestatic_lib module:WhatsApp-27.class#28.routine_5795(  ) // class#28
	invokenonvirtual_lib .routine_5142 // pc=1
	astore_4 
	aload_0_getfield _phoneField   // get_name_1:  _phoneField   // get_name_2:  _phoneField   // get_Name:    _phoneField   // getName->1:  _phoneField   // getName->2:  _phoneField   // getName->N:  _phoneField   // ofs = 43600 ord = 3 addr = 0
	aload_4 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokenonvirtual_lib .routine_6488 // pc=2
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	dup 
	lipush 36028797018963968
	invokespecial_lib net.rim.device.api.ui.component.NullField.<init> // pc=3
	astore_5 
	aload_5 
	bipush 18
	iconst_0 
	iconst_0 
	iconst_0 
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	aload_0_getfield com.whatsapp.client.DeleteAccountScreen.field_43592   // get_name_1:  com.whatsapp.client.DeleteAccountScreen.field_43592   // get_name_2:  com.whatsapp.client.DeleteAccountScreen.field_43592   // get_Name:    com.whatsapp.client.DeleteAccountScreen.field_43592   // getName->1:     // getName->2:     // getName->N:     // ofs = 43592 ord = 1 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	aload_3 
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.DeleteAccountScreen.field_43596   // get_name_1:  com.whatsapp.client.DeleteAccountScreen.field_43596   // get_name_2:  com.whatsapp.client.DeleteAccountScreen.field_43596   // get_Name:    com.whatsapp.client.DeleteAccountScreen.field_43596   // getName->1:     // getName->2:     // getName->N:     // ofs = 43596 ord = 2 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	dup 
	lipush 18014398509481984
	invokespecial_lib net.rim.device.api.ui.component.NullField.<init> // pc=3
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	aload_0_getfield _phoneField   // get_name_1:  _phoneField   // get_name_2:  _phoneField   // get_Name:    _phoneField   // getName->1:  _phoneField   // getName->2:  _phoneField   // getName->N:  _phoneField   // ofs = 43600 ord = 3 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	aload_0_getfield _deleteButton   // get_name_1:  _deleteButton   // get_name_2:  _deleteButton   // get_Name:    _deleteButton   // getName->1:  _deleteButton   // getName->2:  _deleteButton   // getName->N:  _deleteButton   // ofs = 43604 ord = 4 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	aload_5 
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	return 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	clinit_lib //module:WhatsApp-40.class#17 module:WhatsApp-40.class#17 module:WhatsApp-40.class#17
	synch_static DeleteAccountScreen
	clinit_wait 
	ldc_unicode literal_225:"? "
	putstatic com.whatsapp.client.DeleteAccountScreen.field_43620 // DeleteAccountScreen
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final net.rim.device.api.ui.Field com.whatsapp.client.DeleteAccountScreen.routine_18538( com.whatsapp.client.DeleteAccountScreen, int ); // address: 0
	{
	enter 
	new_lib Integer//java.lang.Integer java.lang.Integer java.lang.Integer
	dup 
	invokespecial_lib net.rim.device.api.ui.container.HorizontalFieldManager.<init> // pc=1
	astore_2 
	aload_2 
	new_lib Class//java.lang.Class java.lang.Class java.lang.Class
	dup 
	getstatic com.whatsapp.client.DeleteAccountScreen.field_43620 // DeleteAccountScreen
	lipush 17179869184
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=4
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_2 
	new_lib Class//java.lang.Class java.lang.Class java.lang.Class
	dup 
	iload_1 
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	lipush 17179869184
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=4
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_2 
	areturn 
	}


private final deleteMyAccount( com.whatsapp.client.DeleteAccountScreen ); // address: 0
	{
	enter 
	aload_0_getfield _confirmedPhoneNumber   // get_name_1:  _confirmedPhoneNumber   // get_name_2:  _confirmedPhoneNumber   // get_Name:    _confirmedPhoneNumber   // getName->1:  _confirmedPhoneNumber   // getName->2:  _confirmedPhoneNumber   // getName->N:  _confirmedPhoneNumber   // ofs = 43612 ord = 6 addr = 0
	ifnonnull Label6
	aload_0 
	invokespecial com.whatsapp.client.DeleteAccountScreen.routine_18652 // pc=1
	return 
Label6:
	aload_0 
	invokespecial com.whatsapp.client.DeleteAccountScreen.routine_19648 // pc=1
	return 
	}


private final com.whatsapp.client.DeleteAccountScreen.routine_18652( com.whatsapp.client.DeleteAccountScreen ); // address: 0
	{
	enter 
	aload_0_getfield _phoneField   // get_name_1:  _phoneField   // get_name_2:  _phoneField   // get_Name:    _phoneField   // getName->1:  _phoneField   // getName->2:  _phoneField   // getName->N:  _phoneField   // ofs = 43600 ord = 3 addr = 0
	invokenonvirtual_lib .routine_6303 // pc=1
	ifne Label5
	return 
Label5:
	aload_0_getfield _phoneField   // get_name_1:  _phoneField   // get_name_2:  _phoneField   // get_Name:    _phoneField   // getName->1:  _phoneField   // getName->2:  _phoneField   // getName->N:  _phoneField   // ofs = 43600 ord = 3 addr = 0
	invokenonvirtual_lib .routine_6516 // pc=1
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokestatic_lib java.lang.String toString( int ) // Integer
	astore_1 
	aload_0_getfield _phoneField   // get_name_1:  _phoneField   // get_name_2:  _phoneField   // get_Name:    _phoneField   // getName->1:  _phoneField   // getName->2:  _phoneField   // getName->N:  _phoneField   // ofs = 43600 ord = 3 addr = 0
	invokenonvirtual_lib .routine_6527 // pc=1
	astore_2 
	aload_0 
	sipush 858
	invokespecial com.whatsapp.client.DeleteAccountScreen.routine_18723 // pc=2
	new DeleteAccountScreen$5
	dup 
	aload_0 
	aload_1 
	aload_2 
	invokespecial com.whatsapp.client.DeleteAccountScreen$5.<init> // pc=4
	invokevirtual start( java.lang.Thread ) // pc=1
	return 
	}


private final com.whatsapp.client.DeleteAccountScreen.routine_18723( com.whatsapp.client.DeleteAccountScreen, int ); // address: 0
	{
	enter 
	new_lib com.whatsapp.field.WAHorizontalFieldManager//com.whatsapp.field.WAHorizontalFieldManager com.whatsapp.field.WAHorizontalFieldManager com.whatsapp.field.WAHorizontalFieldManager
	dup 
	lipush 12884901888
	invokespecial_lib .routine_6514 // pc=3
	astore_2 
	aload_2 
	new_lib com.whatsapp.field.ProgressAnimationField//com.whatsapp.field.ProgressAnimationField com.whatsapp.field.ProgressAnimationField com.whatsapp.field.ProgressAnimationField
	dup 
	lipush 51539607552
	invokespecial_lib .routine_6743 // pc=3
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	new_lib Class//java.lang.Class java.lang.Class java.lang.Class
	dup 
	iload_1 
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	lipush 51539607552
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=4
	astore_3 
	aload_3 
	iconst_0 
	iconst_0 
	iconst_0 
	bipush 18
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_3 
	bipush 3
	bipush 3
	bipush 3
	bipush 3
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_2 
	aload_3 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib net.rim.device.api.ui.Font//net.rim.device.api.ui.Font net.rim.device.api.ui.Font net.rim.device.api.ui.Font
	dup 
	lipush 1152921504606846976
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.<init> // pc=3
	putfield _waitingArea   // get_name_1:  _waitingArea   // get_name_2:  _waitingArea   // get_Name:    _waitingArea   // getName->1:  _waitingArea   // getName->2:  _waitingArea   // getName->N:  _waitingArea   // ofs = 43608 ord = 5 addr = 0
	aload_0_getfield _waitingArea   // get_name_1:  _waitingArea   // get_name_2:  _waitingArea   // get_Name:    _waitingArea   // getName->1:  _waitingArea   // getName->2:  _waitingArea   // getName->N:  _waitingArea   // ofs = 43608 ord = 5 addr = 0
	getstatic_lib module:WhatsApp-7.class#11.static_35 // class#11
	invokevirtual setBorder( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Border ) // pc=2
	aload_0_getfield _waitingArea   // get_name_1:  _waitingArea   // get_name_2:  _waitingArea   // get_Name:    _waitingArea   // getName->1:  _waitingArea   // getName->2:  _waitingArea   // getName->N:  _waitingArea   // ofs = 43608 ord = 5 addr = 0
	bipush 12
	bipush 18
	bipush 12
	bipush 18
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0_getfield _waitingArea   // get_name_1:  _waitingArea   // get_name_2:  _waitingArea   // get_Name:    _waitingArea   // getName->1:  _waitingArea   // getName->2:  _waitingArea   // getName->N:  _waitingArea   // ofs = 43608 ord = 5 addr = 0
	aload_2 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield _deleteButton   // get_name_1:  _deleteButton   // get_name_2:  _deleteButton   // get_Name:    _deleteButton   // getName->1:  _deleteButton   // getName->2:  _deleteButton   // getName->N:  _deleteButton   // ofs = 43604 ord = 4 addr = 0
	invokevirtual net.rim.device.api.ui.Manager getManager( net.rim.device.api.ui.Field ) // pc=1
	aload_0_getfield _deleteButton   // get_name_1:  _deleteButton   // get_name_2:  _deleteButton   // get_Name:    _deleteButton   // getName->1:  _deleteButton   // getName->2:  _deleteButton   // getName->N:  _deleteButton   // ofs = 43604 ord = 4 addr = 0
	aload_0_getfield _waitingArea   // get_name_1:  _waitingArea   // get_name_2:  _waitingArea   // get_Name:    _waitingArea   // getName->1:  _waitingArea   // getName->2:  _waitingArea   // getName->N:  _waitingArea   // ofs = 43608 ord = 5 addr = 0
	invokevirtual replace( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, net.rim.device.api.ui.Field ) // pc=3
	aload_0_getfield _phoneField   // get_name_1:  _phoneField   // get_name_2:  _phoneField   // get_Name:    _phoneField   // getName->1:  _phoneField   // getName->2:  _phoneField   // getName->N:  _phoneField   // ofs = 43600 ord = 3 addr = 0
	iconst_0 
	invokenonvirtual_lib .routine_6439 // pc=2
	aload_0 
	invokevirtual net.rim.device.api.ui.Manager getDelegate( net.rim.device.api.ui.Screen ) // pc=1
	checkcast_lib com.rim.resources.//module:WhatsApp-39.class#0 module:WhatsApp-39.class#0 module:WhatsApp-39.class#0
	invokenonvirtual_lib .routine_199 // pc=1
	astore_4 
	aload_4 
	aload_4 
	invokevirtual int getVirtualHeight( net.rim.device.api.ui.Manager ) // pc=1
	aload_4 
	invokevirtual int getVisibleHeight( net.rim.device.api.ui.Manager ) // pc=1
	isub 
	iconst_0 
	invokestatic_lib int max( int, int ) // Math
	invokevirtual setVerticalScroll( net.rim.device.api.ui.Manager, int ) // pc=2
	return 
	}


private final resetScreen( com.whatsapp.client.DeleteAccountScreen ); // address: 0
	{
	enter 
	invokestatic_lib com.whatsapp.client.UiApp.routine_3456(  ) // UiApp
	new_lib //module:WhatsApp-13.class#0 module:WhatsApp-13.class#0 module:WhatsApp-13.class#0
	dup 
	aload_0 
	invokespecial_lib .routine_66 // pc=2
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	return 
	}


private final java.lang.String checkNumberExists( com.whatsapp.client.DeleteAccountScreen, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aconst_null 
	astore_3 
	new_lib net.rim.blackberry.api.browser.URLEncodedPostData//net.rim.blackberry.api.browser.URLEncodedPostData net.rim.blackberry.api.browser.URLEncodedPostData net.rim.blackberry.api.browser.URLEncodedPostData
	dup 
	getstatic CHARSET_UTF8 // Constants
	iconst_0 
	invokespecial_lib net.rim.blackberry.api.browser.URLEncodedPostData.<init> // pc=3
	astore_4 
	aload_4 
	ldc literal_215:"in"
	aload_2 
	invokevirtual append( net.rim.blackberry.api.browser.URLEncodedPostData, java.lang.String, java.lang.String ) // pc=3
	aload_4 
	ldc literal_216:"cc"
	aload_1 
	invokevirtual append( net.rim.blackberry.api.browser.URLEncodedPostData, java.lang.String, java.lang.String ) // pc=3
	aload_4 
	ldc literal_217:"d"
	ldc literal_218:"1"
	invokevirtual append( net.rim.blackberry.api.browser.URLEncodedPostData, java.lang.String, java.lang.String ) // pc=3
	new_lib net.rim.device.api.system.ApplicationManager//net.rim.device.api.system.ApplicationManager net.rim.device.api.system.ApplicationManager net.rim.device.api.system.ApplicationManager
	dup 
	ldc literal_219:"https://r.whatsapp.net/v1/exist.php?"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_4 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_5 
	aconst_null 
	astore_6 
	iconst_1 
	sipush 30000
	i2l 
	invokestatic_lib module:WhatsApp-35.class#1.routine_1085(  ) // class#1
	astore_7 
	aload_7 
	ifnonnull Label55
	invokestatic_lib com.whatsapp.client.UiApp.routine_3456(  ) // UiApp
	new DeleteAccountScreen$7
	dup 
	aload_0 
	invokespecial com.whatsapp.client.DeleteAccountScreen$7.<init> // pc=2
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	aconst_null 
	astore 8
	aload_6 
	ifnull Label53
	aload_6 
	invokeinterface interfacemethodref_16 // pc=1 guess=18
	goto Label53
	astore 13
Label53:
	aload 8
	areturn 
Label55:
	new_lib net.rim.device.api.system.ApplicationManager//net.rim.device.api.system.ApplicationManager net.rim.device.api.system.ApplicationManager net.rim.device.api.system.ApplicationManager
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_5 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_7 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	bipush 3
	iconst_1 
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String, int, boolean ) // Connector
	checkcast_lib net.rim.device.api.util.StringUtilities//net.rim.device.api.util.StringUtilities net.rim.device.api.util.StringUtilities net.rim.device.api.util.StringUtilities
	astore_6 
	aload_6 
	getstatic HTTP_REQUEST_PROPERTY_USER_AGENT // Constants
	invokestatic_lib module:WhatsApp-35.class#1.routine_2588(  ) // class#1
	invokeinterface interfacemethodref_17 // pc=3 guess=19
	aload_6 
	invokeinterface interfacemethodref_18 // pc=1 guess=20
	istore 8
	iload 8
	sipush 200
	if_icmpeq Label86
	invokestatic_lib com.whatsapp.client.UiApp.routine_3456(  ) // UiApp
	new_lib //module:WhatsApp-13.class#1 module:WhatsApp-13.class#1 module:WhatsApp-13.class#1
	dup 
	aload_0 
	iload 8
	invokespecial_lib .routine_118 // pc=3
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	goto Label97
Label86:
	aload_6 
	invokeinterface interfacemethodref_19 // pc=1 guess=21
	astore 9
	aload_0 
	aload 9
	invokespecial com.whatsapp.client.DeleteAccountScreen.routine_19402 // pc=2
	astore 10
	aload 10
	ifnull Label97
	aload 10
	astore_3 
Label97:
	aload_6 
	ifnull Label128
	aload_6 
	invokeinterface interfacemethodref_16 // pc=1 guess=18
	goto Label128
	astore 13
	goto Label128
	astore_7 
	invokestatic_lib com.whatsapp.client.UiApp.routine_3456(  ) // UiApp
	new_lib //module:WhatsApp-13.class#2 module:WhatsApp-13.class#2 module:WhatsApp-13.class#2
	dup 
	aload_0 
	aload_7 
	invokespecial_lib .routine_171 // pc=3
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	aload_6 
	ifnull Label128
	aload_6 
	invokeinterface interfacemethodref_16 // pc=1 guess=18
	goto Label128
	astore 13
	goto Label128
	astore 11
	aload_6 
	ifnull Label126
	aload_6 
	invokeinterface interfacemethodref_16 // pc=1 guess=18
	goto Label126
	astore 13
Label126:
	aload 11
	athrow 
Label128:
	aload_3 
	areturn 
	}


private final java.lang.String com.whatsapp.client.DeleteAccountScreen.routine_19402( com.whatsapp.client.DeleteAccountScreen, java.io.InputStream ); // address: 0
	{
	enter 
	new_lib com.whatsapp.field.//module:WhatsApp-37.class#9 module:WhatsApp-37.class#9 module:WhatsApp-37.class#9
	dup 
	invokespecial_lib .routine_9464 // pc=1
	astore_2 
	aload_2 
	new_lib net.rim.device.api.ui.component.Status//net.rim.device.api.ui.component.Status net.rim.device.api.ui.component.Status net.rim.device.api.ui.component.Status
	dup 
	aload_1 
	getstatic CHARSET_UTF8 // Constants
	invokespecial_lib java.io.InputStreamReader.<init> // pc=3
	invokeinterface interfacemethodref_20 // pc=2 guess=22
	aload_2 
	invokeinterface interfacemethodref_21 // pc=1 guess=23
	pop 
	aload_2 
	bipush 2
	aconst_null 
	ldc literal_220:"exist"
	invokeinterface interfacemethodref_22 // pc=4 guess=24
	aload_2 
	invokeinterface interfacemethodref_21 // pc=1 guess=23
	pop 
	aload_2 
	bipush 2
	aconst_null 
	ldc literal_221:"response"
	invokeinterface interfacemethodref_22 // pc=4 guess=24
	aload_2 
	aconst_null 
	ldc literal_222:"status"
	invokeinterface interfacemethodref_23 // pc=3 guess=25
	astore_3 
	aload_2 
	aconst_null 
	ldc literal_223:"result"
	invokeinterface interfacemethodref_23 // pc=3 guess=25
	astore_4 
	ldc literal_224:"ok"
	aload_3 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label47
	aload_4 
	areturn 
	astore_2 
	aconst_null 
	areturn 
Label47:
	aconst_null 
	areturn 
	}


private final prepareForDelete( com.whatsapp.client.DeleteAccountScreen ); // address: 0
	{
	enter 
	aload_0_getfield _phoneField   // get_name_1:  _phoneField   // get_name_2:  _phoneField   // get_Name:    _phoneField   // getName->1:  _phoneField   // getName->2:  _phoneField   // getName->N:  _phoneField   // ofs = 43600 ord = 3 addr = 0
	invokevirtual net.rim.device.api.ui.Manager getManager( net.rim.device.api.ui.Field ) // pc=1
	aload_0_getfield _phoneField   // get_name_1:  _phoneField   // get_name_2:  _phoneField   // get_Name:    _phoneField   // getName->1:  _phoneField   // getName->2:  _phoneField   // getName->N:  _phoneField   // ofs = 43600 ord = 3 addr = 0
	invokevirtual delete( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield com.whatsapp.client.DeleteAccountScreen.field_43596   // get_name_1:  com.whatsapp.client.DeleteAccountScreen.field_43596   // get_name_2:  com.whatsapp.client.DeleteAccountScreen.field_43596   // get_Name:    com.whatsapp.client.DeleteAccountScreen.field_43596   // getName->1:     // getName->2:     // getName->N:     // ofs = 43596 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.client.DeleteAccountScreen.field_43596   // get_name_1:  com.whatsapp.client.DeleteAccountScreen.field_43596   // get_name_2:  com.whatsapp.client.DeleteAccountScreen.field_43596   // get_Name:    com.whatsapp.client.DeleteAccountScreen.field_43596   // getName->1:     // getName->2:     // getName->N:     // ofs = 43596 ord = 2 addr = 0
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	iconst_1 
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int ) // pc=2
	invokevirtual setFont( net.rim.device.api.ui.Field, net.rim.device.api.ui.Font ) // pc=2
	new_lib net.rim.device.api.ui.component.BasicEditField//net.rim.device.api.ui.component.BasicEditField net.rim.device.api.ui.component.BasicEditField net.rim.device.api.ui.component.BasicEditField
	dup 
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=1
	astore_1 
	aload_0_getfield com.whatsapp.client.DeleteAccountScreen.field_43596   // get_name_1:  com.whatsapp.client.DeleteAccountScreen.field_43596   // get_name_2:  com.whatsapp.client.DeleteAccountScreen.field_43596   // get_Name:    com.whatsapp.client.DeleteAccountScreen.field_43596   // getName->1:     // getName->2:     // getName->N:     // ofs = 43596 ord = 2 addr = 0
	aload_1 
	invokevirtual getMargin( net.rim.device.api.ui.Field, net.rim.device.api.ui.XYEdges ) // pc=2
	aload_1 
	bipush 18
	putfield bottom   // get_name_1:  bottom   // get_name_2:  bottom   // get_Name:    bottom   // getName->1:  bottom   // getName->2:  bottom   // getName->N:  bottom   // ofs = -1 ord = 0 addr = -1
	aload_0_getfield com.whatsapp.client.DeleteAccountScreen.field_43596   // get_name_1:  com.whatsapp.client.DeleteAccountScreen.field_43596   // get_name_2:  com.whatsapp.client.DeleteAccountScreen.field_43596   // get_Name:    com.whatsapp.client.DeleteAccountScreen.field_43596   // getName->1:     // getName->2:     // getName->N:     // ofs = 43596 ord = 2 addr = 0
	aload_1 
	invokevirtual setMargin( net.rim.device.api.ui.Field, net.rim.device.api.ui.XYEdges ) // pc=2
	aload_0_getfield com.whatsapp.client.DeleteAccountScreen.field_43596   // get_name_1:  com.whatsapp.client.DeleteAccountScreen.field_43596   // get_name_2:  com.whatsapp.client.DeleteAccountScreen.field_43596   // get_Name:    com.whatsapp.client.DeleteAccountScreen.field_43596   // getName->1:     // getName->2:     // getName->N:     // ofs = 43596 ord = 2 addr = 0
	sipush 991
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	invokevirtual setText( net.rim.device.api.ui.component.LabelField, java.lang.Object ) // pc=2
	aload_0_getfield com.whatsapp.client.DeleteAccountScreen.field_43592   // get_name_1:  com.whatsapp.client.DeleteAccountScreen.field_43592   // get_name_2:  com.whatsapp.client.DeleteAccountScreen.field_43592   // get_Name:    com.whatsapp.client.DeleteAccountScreen.field_43592   // getName->1:     // getName->2:     // getName->N:     // ofs = 43592 ord = 1 addr = 0
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	aload_0 
	invokevirtual net.rim.device.api.ui.Manager getDelegate( net.rim.device.api.ui.Screen ) // pc=1
	checkcast_lib com.rim.resources.WhatsAppRIMResourcesPopulator45//module:WhatsApp-39.class#0 module:WhatsApp-39.class#0 module:WhatsApp-39.class#0
	invokenonvirtual_lib .routine_199 // pc=1
	astore_2 
	aload_2 
	iconst_0 
	invokevirtual setVerticalScroll( net.rim.device.api.ui.Manager, int ) // pc=2
	return 
	}


private final com.whatsapp.client.DeleteAccountScreen.routine_19648( com.whatsapp.client.DeleteAccountScreen ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_1 
	putfield com.whatsapp.client.DeleteAccountScreen.field_43616   // get_name_1:  com.whatsapp.client.DeleteAccountScreen.field_43616   // get_name_2:  com.whatsapp.client.DeleteAccountScreen.field_43616   // get_Name:    com.whatsapp.client.DeleteAccountScreen.field_43616   // getName->1:     // getName->2:     // getName->N:     // ofs = 43616 ord = 7 addr = 0
	aload_0 
	sipush 992
	invokespecial com.whatsapp.client.DeleteAccountScreen.routine_18723 // pc=2
	lipush 9178286100701983034
	aload_0_getfield _confirmedPhoneNumber   // get_name_1:  _confirmedPhoneNumber   // get_name_2:  _confirmedPhoneNumber   // get_Name:    _confirmedPhoneNumber   // getName->1:  _confirmedPhoneNumber   // getName->2:  _confirmedPhoneNumber   // getName->N:  _confirmedPhoneNumber   // ofs = 43612 ord = 6 addr = 0
	invokestatic_lib module:WhatsApp-35.class#1.routine_4450(  ) // class#1
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final makeMenu( com.whatsapp.client.DeleteAccountScreen, net.rim.device.api.ui.component.Menu, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.DeleteAccountScreen.field_43616   // get_name_1:  com.whatsapp.client.DeleteAccountScreen.field_43616   // get_name_2:  com.whatsapp.client.DeleteAccountScreen.field_43616   // get_Name:    com.whatsapp.client.DeleteAccountScreen.field_43616   // getName->1:     // getName->2:     // getName->N:     // ofs = 43616 ord = 7 addr = 0
	ifeq Label4
	return 
Label4:
	aload_0 
	aload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.Screen.makeMenu // pc=3
	aload_1 
	aload_0_getfield com.whatsapp.client.DeleteAccountScreen.field_43588   // get_name_1:  com.whatsapp.client.DeleteAccountScreen.field_43588   // get_name_2:  com.whatsapp.client.DeleteAccountScreen.field_43588   // get_Name:    com.whatsapp.client.DeleteAccountScreen.field_43588   // getName->1:     // getName->2:     // getName->N:     // ofs = 43588 ord = 0 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	return 
	}


public final boolean onMenu( com.whatsapp.client.DeleteAccountScreen, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.DeleteAccountScreen.field_43616   // get_name_1:  com.whatsapp.client.DeleteAccountScreen.field_43616   // get_name_2:  com.whatsapp.client.DeleteAccountScreen.field_43616   // get_Name:    com.whatsapp.client.DeleteAccountScreen.field_43616   // getName->1:     // getName->2:     // getName->N:     // ofs = 43616 ord = 7 addr = 0
	ifeq Label5
	iconst_0 
	ireturn 
Label5:
	aload_0 
	iload_1 
	invokespecial_lib net.rim.device.api.ui.Screen.onMenu // pc=2
	ireturn 
	}


public final boolean onClose( com.whatsapp.client.DeleteAccountScreen ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.DeleteAccountScreen.field_43616   // get_name_1:  com.whatsapp.client.DeleteAccountScreen.field_43616   // get_name_2:  com.whatsapp.client.DeleteAccountScreen.field_43616   // get_Name:    com.whatsapp.client.DeleteAccountScreen.field_43616   // getName->1:     // getName->2:     // getName->N:     // ofs = 43616 ord = 7 addr = 0
	ifeq Label5
	iconst_0 
	ireturn 
Label5:
	aload_0 
	invokespecial_lib net.rim.device.api.ui.Screen.onClose // pc=1
	ireturn 
	}

}
