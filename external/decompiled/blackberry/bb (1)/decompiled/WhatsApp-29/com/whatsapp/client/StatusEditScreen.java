// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-29.cod
// Module version  : 2.7.3204
// Class ID        : 1
// ########################################################


package com.whatsapp.client;


abstract final class StatusEditScreen extends net.rim.device.api.ui.container.PopupScreen
implements net.rim.device.api.ui.FieldChangeListener

{

	// @@@@@@@@@@@@@ Fields 
	private com.whatsapp.client.LeftRightLabelField /*com.whatsapp.client.LeftRightLabelField*/  field_57008 ; // ofs = 57008 addr = 0)
	private com.whatsapp.client.BBMStyleInputField /*com.whatsapp.client.BBMStyleInputField*/  field_57012 ; // ofs = 57012 addr = 0)
	private String /*java.lang.String*/  field_57016 ; // ofs = 57016 addr = 0)
	private net.rim.device.api.ui.component.ButtonField /*net.rim.device.api.ui.component.ButtonField*/  field_57020 ; // ofs = 57020 addr = 0)
	private net.rim.device.api.ui.component.ButtonField /*net.rim.device.api.ui.component.ButtonField*/  field_57024 ; // ofs = 57024 addr = 0)
	private net.rim.device.api.ui.component.ButtonField /*net.rim.device.api.ui.component.ButtonField*/  field_57028 ; // ofs = 57028 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.StatusEditScreen, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	new_lib net.rim.device.api.ui.component.Dialog//net.rim.device.api.ui.component.Dialog net.rim.device.api.ui.component.Dialog net.rim.device.api.ui.component.Dialog
	dup 
	lipush 1153220571769602048
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.<init> // pc=3
	lipush 1153220571769602048
	invokespecial_lib net.rim.device.api.ui.container.PopupScreen.<init> // pc=4
	aload_0 
	aload_1 
	putfield com.whatsapp.client.StatusEditScreen.field_57016   // get_name_1:  com.whatsapp.client.StatusEditScreen.field_57016   // get_name_2:  com.whatsapp.client.StatusEditScreen.field_57016   // get_Name:    com.whatsapp.client.StatusEditScreen.field_57016   // getName->1:     // getName->2:     // getName->N:     // ofs = 57016 ord = 2 addr = 0
	aload_0 
	new_lib com.whatsapp.client.LeftRightLabelField//com.whatsapp.client.LeftRightLabelField com.whatsapp.client.LeftRightLabelField com.whatsapp.client.LeftRightLabelField
	dup 
	sipush 909
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokestatic_lib net.rim.device.api.ui.Font getDefault(  ) // Font
	invokespecial_lib .routine_509 // pc=3
	putfield com.whatsapp.client.StatusEditScreen.field_57008   // get_name_1:  com.whatsapp.client.StatusEditScreen.field_57008   // get_name_2:  com.whatsapp.client.StatusEditScreen.field_57008   // get_Name:    com.whatsapp.client.StatusEditScreen.field_57008   // getName->1:     // getName->2:     // getName->N:     // ofs = 57008 ord = 0 addr = 0
	aload_0_getfield com.whatsapp.client.StatusEditScreen.field_57008   // get_name_1:  com.whatsapp.client.StatusEditScreen.field_57008   // get_name_2:  com.whatsapp.client.StatusEditScreen.field_57008   // get_Name:    com.whatsapp.client.StatusEditScreen.field_57008   // getName->1:     // getName->2:     // getName->N:     // ofs = 57008 ord = 0 addr = 0
	new_lib InterruptedException//java.lang.InterruptedException java.lang.InterruptedException java.lang.InterruptedException
	dup 
	iipush 8421504
	invokespecial_lib java.lang.Integer.<init> // pc=2
	invokenonvirtual_lib .routine_82 // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.StatusEditScreen.field_57008   // get_name_1:  com.whatsapp.client.StatusEditScreen.field_57008   // get_name_2:  com.whatsapp.client.StatusEditScreen.field_57008   // get_Name:    com.whatsapp.client.StatusEditScreen.field_57008   // getName->1:     // getName->2:     // getName->N:     // ofs = 57008 ord = 0 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	new_lib com.whatsapp.client.ScrollFixTextField//com.whatsapp.client.ScrollFixTextField com.whatsapp.client.ScrollFixTextField com.whatsapp.client.ScrollFixTextField
	dup 
	lipush 2147483648
	invokespecial_lib .routine_3338 // pc=3
	astore_2 
	aload_2 
	bipush 10
	iconst_0 
	bipush 10
	iconst_0 
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	aload_2 
	getfield _inputField   // get_name_1:  _inputField   // get_name_2:  _inputField   // get_Name:    _inputField   // getName->1:  _inputField   // getName->2:  _inputField   // getName->N:  _inputField   // ofs = -1 ord = 0 addr = -1
	putfield com.whatsapp.client.StatusEditScreen.field_57012   // get_name_1:  com.whatsapp.client.StatusEditScreen.field_57012   // get_name_2:  com.whatsapp.client.StatusEditScreen.field_57012   // get_Name:    com.whatsapp.client.StatusEditScreen.field_57012   // getName->1:     // getName->2:     // getName->N:     // ofs = 57012 ord = 1 addr = 0
	aload_0_getfield com.whatsapp.client.StatusEditScreen.field_57012   // get_name_1:  com.whatsapp.client.StatusEditScreen.field_57012   // get_name_2:  com.whatsapp.client.StatusEditScreen.field_57012   // get_Name:    com.whatsapp.client.StatusEditScreen.field_57012   // getName->1:     // getName->2:     // getName->N:     // ofs = 57012 ord = 1 addr = 0
	sipush 139
	invokenonvirtual_lib .routine_1188 // pc=2
	aload_0_getfield com.whatsapp.client.StatusEditScreen.field_57012   // get_name_1:  com.whatsapp.client.StatusEditScreen.field_57012   // get_name_2:  com.whatsapp.client.StatusEditScreen.field_57012   // get_Name:    com.whatsapp.client.StatusEditScreen.field_57012   // getName->1:     // getName->2:     // getName->N:     // ofs = 57012 ord = 1 addr = 0
	sipush 910
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokenonvirtual_lib .routine_9 // pc=2
	aload_0_getfield com.whatsapp.client.StatusEditScreen.field_57012   // get_name_1:  com.whatsapp.client.StatusEditScreen.field_57012   // get_name_2:  com.whatsapp.client.StatusEditScreen.field_57012   // get_Name:    com.whatsapp.client.StatusEditScreen.field_57012   // getName->1:     // getName->2:     // getName->N:     // ofs = 57012 ord = 1 addr = 0
	aload_0 
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0_getfield com.whatsapp.client.StatusEditScreen.field_57012   // get_name_1:  com.whatsapp.client.StatusEditScreen.field_57012   // get_name_2:  com.whatsapp.client.StatusEditScreen.field_57012   // get_Name:    com.whatsapp.client.StatusEditScreen.field_57012   // getName->1:     // getName->2:     // getName->N:     // ofs = 57012 ord = 1 addr = 0
	aload_0_getfield com.whatsapp.client.StatusEditScreen.field_57016   // get_name_1:  com.whatsapp.client.StatusEditScreen.field_57016   // get_name_2:  com.whatsapp.client.StatusEditScreen.field_57016   // get_Name:    com.whatsapp.client.StatusEditScreen.field_57016   // getName->1:     // getName->2:     // getName->N:     // ofs = 57016 ord = 2 addr = 0
	invokenonvirtual_lib .routine_243 // pc=2
	aload_0 
	aload_2 
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	new_lib net.rim.device.api.ui.Field//net.rim.device.api.ui.Field net.rim.device.api.ui.Field net.rim.device.api.ui.Field
	dup 
	lipush 2251812698587136
	invokespecial_lib net.rim.device.api.ui.container.HorizontalFieldManager.<init> // pc=3
	astore_3 
	lipush 12885000192
	lstore 4
	aload_0 
	new_lib net.rim.device.api.ui.FieldChangeListener//net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener
	dup 
	bipush 51
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	lload 4
	invokespecial_lib net.rim.device.api.ui.component.ButtonField.<init> // pc=4
	putfield com.whatsapp.client.StatusEditScreen.field_57020   // get_name_1:  com.whatsapp.client.StatusEditScreen.field_57020   // get_name_2:  com.whatsapp.client.StatusEditScreen.field_57020   // get_Name:    com.whatsapp.client.StatusEditScreen.field_57020   // getName->1:     // getName->2:     // getName->N:     // ofs = 57020 ord = 3 addr = 0
	aload_0_getfield com.whatsapp.client.StatusEditScreen.field_57020   // get_name_1:  com.whatsapp.client.StatusEditScreen.field_57020   // get_name_2:  com.whatsapp.client.StatusEditScreen.field_57020   // get_Name:    com.whatsapp.client.StatusEditScreen.field_57020   // getName->1:     // getName->2:     // getName->N:     // ofs = 57020 ord = 3 addr = 0
	iconst_0 
	bipush 2
	iconst_0 
	bipush 2
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0_getfield com.whatsapp.client.StatusEditScreen.field_57020   // get_name_1:  com.whatsapp.client.StatusEditScreen.field_57020   // get_name_2:  com.whatsapp.client.StatusEditScreen.field_57020   // get_Name:    com.whatsapp.client.StatusEditScreen.field_57020   // getName->1:     // getName->2:     // getName->N:     // ofs = 57020 ord = 3 addr = 0
	aload_0 
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_3 
	aload_0_getfield com.whatsapp.client.StatusEditScreen.field_57020   // get_name_1:  com.whatsapp.client.StatusEditScreen.field_57020   // get_name_2:  com.whatsapp.client.StatusEditScreen.field_57020   // get_Name:    com.whatsapp.client.StatusEditScreen.field_57020   // getName->1:     // getName->2:     // getName->N:     // ofs = 57020 ord = 3 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib net.rim.device.api.ui.FieldChangeListener//net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener
	dup 
	bipush 50
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	lload 4
	invokespecial_lib net.rim.device.api.ui.component.ButtonField.<init> // pc=4
	putfield com.whatsapp.client.StatusEditScreen.field_57024   // get_name_1:  com.whatsapp.client.StatusEditScreen.field_57024   // get_name_2:  com.whatsapp.client.StatusEditScreen.field_57024   // get_Name:    com.whatsapp.client.StatusEditScreen.field_57024   // getName->1:     // getName->2:     // getName->N:     // ofs = 57024 ord = 4 addr = 0
	aload_0_getfield com.whatsapp.client.StatusEditScreen.field_57024   // get_name_1:  com.whatsapp.client.StatusEditScreen.field_57024   // get_name_2:  com.whatsapp.client.StatusEditScreen.field_57024   // get_Name:    com.whatsapp.client.StatusEditScreen.field_57024   // getName->1:     // getName->2:     // getName->N:     // ofs = 57024 ord = 4 addr = 0
	iconst_0 
	bipush 2
	iconst_0 
	bipush 2
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0_getfield com.whatsapp.client.StatusEditScreen.field_57024   // get_name_1:  com.whatsapp.client.StatusEditScreen.field_57024   // get_name_2:  com.whatsapp.client.StatusEditScreen.field_57024   // get_Name:    com.whatsapp.client.StatusEditScreen.field_57024   // getName->1:     // getName->2:     // getName->N:     // ofs = 57024 ord = 4 addr = 0
	aload_0 
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_3 
	aload_0_getfield com.whatsapp.client.StatusEditScreen.field_57024   // get_name_1:  com.whatsapp.client.StatusEditScreen.field_57024   // get_name_2:  com.whatsapp.client.StatusEditScreen.field_57024   // get_Name:    com.whatsapp.client.StatusEditScreen.field_57024   // getName->1:     // getName->2:     // getName->N:     // ofs = 57024 ord = 4 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib net.rim.device.api.ui.FieldChangeListener//net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener
	dup 
	sipush 760
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	lload 4
	invokespecial_lib net.rim.device.api.ui.component.ButtonField.<init> // pc=4
	putfield com.whatsapp.client.StatusEditScreen.field_57028   // get_name_1:  com.whatsapp.client.StatusEditScreen.field_57028   // get_name_2:  com.whatsapp.client.StatusEditScreen.field_57028   // get_Name:    com.whatsapp.client.StatusEditScreen.field_57028   // getName->1:     // getName->2:     // getName->N:     // ofs = 57028 ord = 5 addr = 0
	aload_0_getfield com.whatsapp.client.StatusEditScreen.field_57028   // get_name_1:  com.whatsapp.client.StatusEditScreen.field_57028   // get_name_2:  com.whatsapp.client.StatusEditScreen.field_57028   // get_Name:    com.whatsapp.client.StatusEditScreen.field_57028   // getName->1:     // getName->2:     // getName->N:     // ofs = 57028 ord = 5 addr = 0
	iconst_0 
	bipush 2
	iconst_0 
	bipush 2
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0_getfield com.whatsapp.client.StatusEditScreen.field_57028   // get_name_1:  com.whatsapp.client.StatusEditScreen.field_57028   // get_name_2:  com.whatsapp.client.StatusEditScreen.field_57028   // get_Name:    com.whatsapp.client.StatusEditScreen.field_57028   // getName->1:     // getName->2:     // getName->N:     // ofs = 57028 ord = 5 addr = 0
	aload_0 
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_3 
	aload_0_getfield com.whatsapp.client.StatusEditScreen.field_57028   // get_name_1:  com.whatsapp.client.StatusEditScreen.field_57028   // get_name_2:  com.whatsapp.client.StatusEditScreen.field_57028   // get_Name:    com.whatsapp.client.StatusEditScreen.field_57028   // getName->1:     // getName->2:     // getName->N:     // ofs = 57028 ord = 5 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	aload_3 
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_2 
	iconst_0 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	astore_6 
	aload_2 
	iconst_1 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	astore_7 
	new_lib net.rim.device.api.ui.Manager//net.rim.device.api.ui.Manager net.rim.device.api.ui.Manager net.rim.device.api.ui.Manager
	dup 
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=1
	astore 8
	aload_7 
	aload 8
	invokevirtual getMargin( net.rim.device.api.ui.Field, net.rim.device.api.ui.XYEdges ) // pc=2
	aload 8
	iconst_0 
	putfield right   // get_name_1:  right   // get_name_2:  right   // get_Name:    right   // getName->1:  right   // getName->2:  right   // getName->N:  right   // ofs = -1 ord = 0 addr = -1
	aload_7 
	aload 8
	invokevirtual setMargin( net.rim.device.api.ui.Field, net.rim.device.api.ui.XYEdges ) // pc=2
	aload_0_getfield com.whatsapp.client.StatusEditScreen.field_57008   // get_name_1:  com.whatsapp.client.StatusEditScreen.field_57008   // get_name_2:  com.whatsapp.client.StatusEditScreen.field_57008   // get_Name:    com.whatsapp.client.StatusEditScreen.field_57008   // getName->1:     // getName->2:     // getName->N:     // ofs = 57008 ord = 0 addr = 0
	iconst_0 
	aload_6 
	invokevirtual int getMarginRight( net.rim.device.api.ui.Field ) // pc=1
	aload_7 
	invokevirtual int getPreferredWidth( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	aload 8
	getfield left   // get_name_1:  left   // get_name_2:  left   // get_Name:    left   // getName->1:  left   // getName->2:  left   // getName->N:  left   // ofs = -1 ord = 1 addr = -1
	iadd 
	iconst_0 
	aload_6 
	invokevirtual int getMarginLeft( net.rim.device.api.ui.Field ) // pc=1
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	invokespecial com.whatsapp.client.StatusEditScreen.routine_8641 // pc=1
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final boolean com.whatsapp.client.StatusEditScreen.routine_8366( com.whatsapp.client.StatusEditScreen ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.StatusEditScreen.field_57012   // get_name_1:  com.whatsapp.client.StatusEditScreen.field_57012   // get_name_2:  com.whatsapp.client.StatusEditScreen.field_57012   // get_Name:    com.whatsapp.client.StatusEditScreen.field_57012   // getName->1:     // getName->2:     // getName->N:     // ofs = 57012 ord = 1 addr = 0
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	astore_1 
	aload_1 
	ifnull Label34
	aload_1 
	stringlength 
	ifle Label34
	aload_1 
	aload_0_getfield com.whatsapp.client.StatusEditScreen.field_57016   // get_name_1:  com.whatsapp.client.StatusEditScreen.field_57016   // get_name_2:  com.whatsapp.client.StatusEditScreen.field_57016   // get_Name:    com.whatsapp.client.StatusEditScreen.field_57016   // getName->1:     // getName->2:     // getName->N:     // ofs = 57016 ord = 2 addr = 0
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label34
	iconst_1 
	invokestatic_lib int ask( int ) // Dialog
	istore_2 
	iload_2 
	iconst_1 
	if_icmpne Label24
	aload_0 
	invokespecial com.whatsapp.client.StatusEditScreen.routine_8461 // pc=1
	ifne Label34
	iconst_0 
	ireturn 
Label24:
	iload_2 
	bipush 2
	if_icmpne Label29
	iconst_1 
	ireturn 
Label29:
	iload_2 
	bipush -1
	if_icmpne Label34
	iconst_0 
	ireturn 
Label34:
	iconst_1 
	ireturn 
	}


private final com.whatsapp.client.StatusEditScreen.routine_8433( com.whatsapp.client.StatusEditScreen ); // address: 0
	{
	enter_narrow 
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	astore_1 
	aload_1 
	aload_0 
	invokevirtual popScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}


private final boolean com.whatsapp.client.StatusEditScreen.routine_8461( com.whatsapp.client.StatusEditScreen ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.StatusEditScreen.field_57012   // get_name_1:  com.whatsapp.client.StatusEditScreen.field_57012   // get_name_2:  com.whatsapp.client.StatusEditScreen.field_57012   // get_Name:    com.whatsapp.client.StatusEditScreen.field_57012   // getName->1:     // getName->2:     // getName->N:     // ofs = 57012 ord = 1 addr = 0
	invokenonvirtual_lib .routine_213 // pc=1
	astore_1 
	aload_1 
	invokenonvirtual_lib java.lang.String.trim // pc=1
	stringlength 
	ifne Label13
	sipush 696
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokestatic_lib alert( java.lang.String ) // Dialog
	iconst_0 
	ireturn 
Label13:
	invokestatic_lib module:WhatsApp-26.class#11.routine_3571(  ) // class#11
	astore_2 
	aload_2 
	invokenonvirtual_lib .routine_3167 // pc=1
	astore_3 
	aload_3 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	astore_4 
	bipush -1
	istore_5 
	aload_0_getfield com.whatsapp.client.StatusEditScreen.field_57016   // get_name_1:  com.whatsapp.client.StatusEditScreen.field_57016   // get_name_2:  com.whatsapp.client.StatusEditScreen.field_57016   // get_Name:    com.whatsapp.client.StatusEditScreen.field_57016   // getName->1:     // getName->2:     // getName->N:     // ofs = 57016 ord = 2 addr = 0
	ifnonnull Label34
	aload_4 
	aload_1 
	invokevirtual boolean contains( java.util.Vector, java.lang.Object ) // pc=2
	ifeq Label53
	sipush 697
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokestatic_lib alert( java.lang.String ) // Dialog
	iconst_0 
	ireturn 
Label34:
	aload_0_getfield com.whatsapp.client.StatusEditScreen.field_57016   // get_name_1:  com.whatsapp.client.StatusEditScreen.field_57016   // get_name_2:  com.whatsapp.client.StatusEditScreen.field_57016   // get_Name:    com.whatsapp.client.StatusEditScreen.field_57016   // getName->1:     // getName->2:     // getName->N:     // ofs = 57016 ord = 2 addr = 0
	aload_1 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label40
	iconst_1 
	ireturn 
Label40:
	aload_4 
	aload_1 
	invokevirtual boolean contains( java.util.Vector, java.lang.Object ) // pc=2
	ifeq Label49
	sipush 697
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokestatic_lib alert( java.lang.String ) // Dialog
	iconst_0 
	ireturn 
Label49:
	aload_4 
	aload_0_getfield com.whatsapp.client.StatusEditScreen.field_57016   // get_name_1:  com.whatsapp.client.StatusEditScreen.field_57016   // get_name_2:  com.whatsapp.client.StatusEditScreen.field_57016   // get_Name:    com.whatsapp.client.StatusEditScreen.field_57016   // getName->1:     // getName->2:     // getName->N:     // ofs = 57016 ord = 2 addr = 0
	invokevirtual int indexOf( java.util.Vector, java.lang.Object ) // pc=2
	istore_5 
Label53:
	iload_5 
	ifge Label60
	aload_4 
	aload_1 
	iconst_0 
	invokevirtual insertElementAt( java.util.Vector, java.lang.Object, int ) // pc=3
	goto Label73
Label60:
	iload_5 
	aload_4 
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label69
	aload_4 
	aload_1 
	iload_5 
	invokevirtual setElementAt( java.util.Vector, java.lang.Object, int ) // pc=3
	goto Label73
Label69:
	aload_4 
	aload_1 
	iconst_0 
	invokevirtual insertElementAt( java.util.Vector, java.lang.Object, int ) // pc=3
Label73:
	aload_2 
	aload_3 
	invokenonvirtual_lib .routine_3209 // pc=2
	aload_1 
	invokestatic_lib module:WhatsApp-32.class#2.routine_1675(  ) // class#2
	iconst_1 
	ireturn 
	}


private final com.whatsapp.client.StatusEditScreen.routine_8641( com.whatsapp.client.StatusEditScreen ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.StatusEditScreen.field_57008   // get_name_1:  com.whatsapp.client.StatusEditScreen.field_57008   // get_name_2:  com.whatsapp.client.StatusEditScreen.field_57008   // get_Name:    com.whatsapp.client.StatusEditScreen.field_57008   // getName->1:     // getName->2:     // getName->N:     // ofs = 57008 ord = 0 addr = 0
	sipush 139
	aload_0_getfield com.whatsapp.client.StatusEditScreen.field_57012   // get_name_1:  com.whatsapp.client.StatusEditScreen.field_57012   // get_name_2:  com.whatsapp.client.StatusEditScreen.field_57012   // get_Name:    com.whatsapp.client.StatusEditScreen.field_57012   // getName->1:     // getName->2:     // getName->N:     // ofs = 57012 ord = 1 addr = 0
	invokevirtual int getTextLength( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	isub 
	invokestatic_lib java.lang.String toString( int ) // Integer
	invokenonvirtual_lib .routine_29 // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final boolean keyChar( com.whatsapp.client.StatusEditScreen, char, int, int ); // address: 0
	{
	enter 
	iload_1 
	bipush 27
	if_icmpne Label11
	aload_0 
	invokespecial com.whatsapp.client.StatusEditScreen.routine_8366 // pc=1
	ifeq Label9
	aload_0 
	invokespecial com.whatsapp.client.StatusEditScreen.routine_8433 // pc=1
Label9:
	iconst_1 
	ireturn 
Label11:
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	invokespecial_lib net.rim.device.api.ui.Screen.keyChar // pc=4
	ireturn 
	}


public final fieldChanged( com.whatsapp.client.StatusEditScreen, net.rim.device.api.ui.Field, int ); // address: 0
	{
	enter 
	aload_1 
	aload_0_getfield com.whatsapp.client.StatusEditScreen.field_57012   // get_name_1:  com.whatsapp.client.StatusEditScreen.field_57012   // get_name_2:  com.whatsapp.client.StatusEditScreen.field_57012   // get_Name:    com.whatsapp.client.StatusEditScreen.field_57012   // getName->1:     // getName->2:     // getName->N:     // ofs = 57012 ord = 1 addr = 0
	if_acmpne Label7
	aload_0 
	invokespecial com.whatsapp.client.StatusEditScreen.routine_8641 // pc=1
	return 
Label7:
	aload_1 
	aload_0_getfield com.whatsapp.client.StatusEditScreen.field_57020   // get_name_1:  com.whatsapp.client.StatusEditScreen.field_57020   // get_name_2:  com.whatsapp.client.StatusEditScreen.field_57020   // get_Name:    com.whatsapp.client.StatusEditScreen.field_57020   // getName->1:     // getName->2:     // getName->N:     // ofs = 57020 ord = 3 addr = 0
	if_acmpne Label16
	aload_0 
	invokespecial com.whatsapp.client.StatusEditScreen.routine_8461 // pc=1
	ifeq Label37
	aload_0 
	invokespecial com.whatsapp.client.StatusEditScreen.routine_8433 // pc=1
	return 
Label16:
	aload_1 
	aload_0_getfield com.whatsapp.client.StatusEditScreen.field_57024   // get_name_1:  com.whatsapp.client.StatusEditScreen.field_57024   // get_name_2:  com.whatsapp.client.StatusEditScreen.field_57024   // get_Name:    com.whatsapp.client.StatusEditScreen.field_57024   // getName->1:     // getName->2:     // getName->N:     // ofs = 57024 ord = 4 addr = 0
	if_acmpne Label22
	aload_0 
	invokespecial com.whatsapp.client.StatusEditScreen.routine_8433 // pc=1
	return 
Label22:
	aload_1 
	aload_0_getfield com.whatsapp.client.StatusEditScreen.field_57028   // get_name_1:  com.whatsapp.client.StatusEditScreen.field_57028   // get_name_2:  com.whatsapp.client.StatusEditScreen.field_57028   // get_Name:    com.whatsapp.client.StatusEditScreen.field_57028   // getName->1:     // getName->2:     // getName->N:     // ofs = 57028 ord = 5 addr = 0
	if_acmpne Label37
	invokestatic_lib net.rim.device.api.system.Clipboard getClipboard(  ) // Clipboard
	invokevirtual java.lang.Object get( net.rim.device.api.system.Clipboard ) // pc=1
	astore_3 
	aload_3 
	ifnull Label37
	aload_3 
	instanceof_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	ifeq Label37
	aload_0_getfield com.whatsapp.client.StatusEditScreen.field_57012   // get_name_1:  com.whatsapp.client.StatusEditScreen.field_57012   // get_name_2:  com.whatsapp.client.StatusEditScreen.field_57012   // get_Name:    com.whatsapp.client.StatusEditScreen.field_57012   // getName->1:     // getName->2:     // getName->N:     // ofs = 57012 ord = 1 addr = 0
	aload_3 
	checkcast_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	invokevirtual setText( net.rim.device.api.ui.component.BasicEditField, java.lang.String ) // pc=2
Label37:
	return 
	}

}
