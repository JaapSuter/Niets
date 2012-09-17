// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-30.cod
// Module version  : 2.7.3204
// Class ID        : 3
// ########################################################


package com.whatsapp.client;


public class TabButton extends net.rim.device.api.ui.Field

{

	// @@@@@@@@@@@@@ Fields 
	protected com.whatsapp.client. /*module:WhatsApp-24.class#3*/  _parentScr ; // ofs = 53168 addr = 0)
	public boolean /*boolean*/  _selected ; // ofs = 53172 addr = 0)
	public int /*int*/  _rowHeight ; // ofs = 53176 addr = 0)
	protected com.whatsapp.client. /*module:WhatsApp-34.class#11*/  _chatContactMenuItem ; // ofs = 53180 addr = 0)
	protected com.whatsapp.client.WAMenuItem /*module:WhatsApp-34.class#11*/  _emailContactMenuItem ; // ofs = 53184 addr = 0)
	protected com.whatsapp.client.WAMenuItem /*module:WhatsApp-34.class#11*/  _viewContactMenuItem ; // ofs = 53188 addr = 0)
	protected com.whatsapp.client.WAMenuItem /*module:WhatsApp-34.class#11*/  _callContactMenuItem ; // ofs = 53192 addr = 0)
	protected net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  _addFavoriteMenuItem ; // ofs = 53196 addr = 0)
	private com.whatsapp.client.WAMenuItem /*module:WhatsApp-34.class#11*/  field_53200 ; // ofs = 53200 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.TabButton, module:WhatsApp-24.class#3 ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib net.rim.device.api.ui.Field.<init> // pc=1
	aload_0 
	aload_1 
	putfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = 53168 ord = 0 addr = 0
	aload_0 
	iconst_0 
	putfield _selected   // get_name_1:  _selected   // get_name_2:  _selected   // get_Name:    _selected   // getName->1:  _selected   // getName->2:  _selected   // getName->N:  _selected   // ofs = 53172 ord = 1 addr = 0
	aload_0 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	invokestatic int getRowHeight( net.rim.device.api.ui.Font ) // TabButton
	putfield _rowHeight   // get_name_1:  _rowHeight   // get_name_2:  _rowHeight   // get_Name:    _rowHeight   // getName->1:  _rowHeight   // getName->2:  _rowHeight   // getName->N:  _rowHeight   // ofs = 53176 ord = 2 addr = 0
	return 
	}


static public int getRowHeight( net.rim.device.api.ui.Font ); // address: 0
	{
	enter 
	bipush 6
	getstatic_lib module:WhatsApp-13.class#3.static_14 // class#3
	iadd 
	bipush 6
	iadd 
	istore_1 
	aload_0 
	iconst_0 
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	bipush 70
	imul 
	bipush 100
	idiv 
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int, int ) // pc=3
	astore_3 
	aload_3 
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	istore_4 
	bipush 6
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	iadd 
	iload_4 
	iadd 
	iload_4 
	iadd 
	bipush 6
	iadd 
	istore_2 
	iload_1 
	iload_2 
	invokestatic_lib int max( int, int ) // Math
	ireturn 
	}


static public net.rim.device.api.ui.Field getPopup( java.lang.String, int ); // address: 0
	{
	enter 
	new_lib com.whatsapp.field.ColorLabelField//com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField
	dup 
	aload_0 
	iipush 16777215
	invokespecial_lib .routine_3724 // pc=3
	astore_2 
	aload_2 
	bipush 5
	bipush 5
	bipush 5
	bipush 5
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	sipush 224
	istore_3 
	new_lib com.whatsapp.field.//module:WhatsApp-37.class#10 module:WhatsApp-37.class#10 module:WhatsApp-37.class#10
	dup 
	new_lib net.rim.device.api.ui.component.Dialog//net.rim.device.api.ui.component.Dialog net.rim.device.api.ui.component.Dialog net.rim.device.api.ui.component.Dialog
	dup 
	bipush 4
	bipush 4
	bipush 4
	bipush 4
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=5
	iload_1 
	iload_1 
	iload_3 
	invokespecial_lib .routine_3015 // pc=5
	astore_4 
	aload_2 
	aload_4 
	invokevirtual setBorder( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Border ) // pc=2
	aload_2 
	areturn 
	}


static public drawPhotoContactLine( net.rim.device.api.ui.Graphics, module:WhatsApp.class#11, java.lang.String, java.lang.String, int, int, int, boolean ); // address: 0
	{
	enter 
	invokestatic_lib net.rim.device.api.system.RuntimeStore getRuntimeStore(  ) // RuntimeStore
	lipush 8535665252065932813
	invokevirtual java.lang.Object get( net.rim.device.api.system.RuntimeStore, long ) // pc=3
	checkcast_lib //module:WhatsApp-13.class#1 module:WhatsApp-13.class#1 module:WhatsApp-13.class#1
	astore 8
	iconst_0 
	istore 9
	aload 8
	ifnull Label13
	aload 8
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	istore 9
Label13:
	aload_1 
	iload 9
	invokenonvirtual_lib .routine_5897 // pc=2
	astore 10
	aload 8
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getstatic_lib module:WhatsApp-13.class#3.static_13 // class#3
	getstatic_lib module:WhatsApp-13.class#3.static_13 // class#3
	invokenonvirtual_lib .routine_3756 // pc=4
	astore 11
	aload 11
	ifnonnull Label28
	getstatic_lib module:WhatsApp-13.class#3.static_17 // class#3
	astore 11
Label28:
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Graphics ) // pc=1
	astore 12
	aload 12
	iconst_0 
	aload 12
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	bipush 80
	imul 
	bipush 100
	idiv 
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int, int ) // pc=3
	astore 13
	aload 13
	astore 14
	aload_0 
	aload 11
	aload 10
	aload_3 
	aload_2 
	aload 12
	aload 14
	aload 13
	iload_7 
	ifeq Label55
	aconst_null 
	goto Label59
Label55:
	new_lib net.rim.device.api.util.ByteVector//net.rim.device.api.util.ByteVector net.rim.device.api.util.ByteVector net.rim.device.api.util.ByteVector
	dup 
	iipush 5066061
	invokespecial_lib java.lang.Integer.<init> // pc=2
Label59:
	iload_4 
	getstatic_lib module:WhatsApp-13.class#3.static_13 // class#3
	iload_5 
	iload_6 
	iload_7 
	invokestatic_lib module:WhatsApp-19.class#3.routine_3058(  ) // class#3
	return 
	}


static public module:WhatsApp-25.class#0 makeChatScreen( java.lang.String ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-13.class#5.routine_9622(  ) // class#5
	astore_1 
	aconst_null 
	astore_2 
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib //module:WhatsApp-13.class#4 module:WhatsApp-13.class#4 module:WhatsApp-13.class#4
	astore_3 
	aload_3 
	ifnonnull Label23
	new_lib //module:WhatsApp-13.class#4 module:WhatsApp-13.class#4 module:WhatsApp-13.class#4
	dup 
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	iconst_0 
	i2l 
	aload_0 
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokespecial_lib .routine_9367 // pc=6
	astore_3 
	goto Label35
Label23:
	invokestatic_lib net.rim.device.api.system.RuntimeStore getRuntimeStore(  ) // RuntimeStore
	lipush 8535665252065932813
	invokevirtual java.lang.Object get( net.rim.device.api.system.RuntimeStore, long ) // pc=3
	checkcast_lib //module:WhatsApp-13.class#1 module:WhatsApp-13.class#1 module:WhatsApp-13.class#1
	astore_4 
	aload_4 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_3 
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.ContactInfoDetails//module:WhatsApp.class#11 module:WhatsApp.class#11 module:WhatsApp.class#11
	astore_2 
Label35:
	aload_3 
	aload_2 
	aconst_null 
	invokestatic module:WhatsApp-25.class#0 makeChatScreen( module:WhatsApp-13.class#4, module:WhatsApp.class#11, net.rim.device.api.ui.Screen ) // TabButton
	areturn 
	}


static public showChatScreen( module:WhatsApp-9.class#17 ); // address: 0
	{
	enter_narrow 
	aload_0 
	ifnull Label23
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnull Label19
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	ifeq Label15
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual int size( java.util.Vector ) // pc=1
	ifne Label24
	sipush 845
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokestatic_lib inform( java.lang.String ) // Dialog
	return 
Label15:
	aload_0 
	invokestatic module:WhatsApp-25.class#0 makeGroupChatScreen( module:WhatsApp-9.class#17 ) // TabButton
	pop 
	return 
Label19:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokestatic module:WhatsApp-25.class#0 makeChatScreen( java.lang.String ) // TabButton
	pop 
	return 
Label23:
	invokestatic showNewChatPop(  ) // TabButton
Label24:
	return 
	}


static public showNewChatPop(  ); // address: 0
	{
	enter_narrow 
	new_lib //module:WhatsApp-10.class#31 module:WhatsApp-10.class#31 module:WhatsApp-10.class#31
	dup 
	invokespecial_lib .routine_6259 // pc=1
	astore_0 
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	astore_1 
	aload_1 
	aload_0 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}


static public module:WhatsApp-25.class#0 makeChatScreen( module:WhatsApp-13.class#4, module:WhatsApp.class#11, net.rim.device.api.ui.Screen ); // address: 0
	{
	enter 
	new_lib //module:WhatsApp-10.class#30 module:WhatsApp-10.class#30 module:WhatsApp-10.class#30
	dup 
	aload_1 
	aload_0 
	aconst_null 
	invokespecial_lib .routine_5739 // pc=4
	aload_2 
	invokestatic module:WhatsApp-25.class#0 makeChatScreen( module:WhatsApp-10.class#30, net.rim.device.api.ui.Screen ) // TabButton
	areturn 
	}


static public module:WhatsApp-25.class#0 makeChatScreen( module:WhatsApp-10.class#30, net.rim.device.api.ui.Screen ); // address: 0
	{
	enter 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	ifnull Label34
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	ifnull Label34
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokestatic_lib module:WhatsApp-13.class#5.routine_9622(  ) // class#5
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label17
	sipush 284
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokestatic_lib alert( java.lang.String ) // Dialog
	aconst_null 
	areturn 
Label17:
	new_lib com.whatsapp.client.//module:WhatsApp-25.class#0 module:WhatsApp-25.class#0 module:WhatsApp-25.class#0
	dup 
	aload_0 
	invokespecial_lib .routine_5739 // pc=2
	astore_2 
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	astore_3 
	aload_1 
	ifnull Label29
	aload_3 
	aload_1 
	invokevirtual popScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
Label29:
	aload_3 
	aload_2 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	aload_2 
	areturn 
Label34:
	aconst_null 
	areturn 
	}


static protected module:WhatsApp-25.class#0 makeGroupChatScreen( module:WhatsApp-9.class#17 ); // address: 0
	{
	enter 
	new_lib //module:WhatsApp-13.class#4 module:WhatsApp-13.class#4 module:WhatsApp-13.class#4
	dup 
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	iconst_0 
	i2l 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokespecial_lib .routine_9367 // pc=6
	astore_1 
	aload_0 
	aload_1 
	invokestatic boolean checkGroupChatInvariants( module:WhatsApp-9.class#17, module:WhatsApp-13.class#4 ) // TabButton
	ifeq Label32
	new_lib com.whatsapp.client.NewChatScreen//module:WhatsApp-25.class#0 module:WhatsApp-25.class#0 module:WhatsApp-25.class#0
	dup 
	new_lib //module:WhatsApp-10.class#30 module:WhatsApp-10.class#30 module:WhatsApp-10.class#30
	dup 
	aconst_null 
	aload_1 
	aconst_null 
	invokespecial_lib .routine_5739 // pc=4
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokespecial_lib .routine_5762 // pc=3
	astore_2 
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	astore_3 
	aload_3 
	aload_2 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	aload_2 
	areturn 
Label32:
	aconst_null 
	areturn 
	}


static protected boolean checkGroupChatInvariants( module:WhatsApp-9.class#17, module:WhatsApp-13.class#4 ); // address: 0
	{
	enter_narrow 
	aload_1 
	ifnull Label16
	aload_1 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	ifnull Label16
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnull Label16
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	ifne Label22
	aload_1 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	ldc literal_81:"@g.us"
	invokenonvirtual_lib java.lang.String.endsWith // pc=2
	ifne Label22
Label16:
	sipush 636
	ldc literal_82:"Group chat invariants violated"
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	invokestatic_lib alert( java.lang.String ) // Dialog
	iconst_0 
	ireturn 
Label22:
	iconst_1 
	ireturn 
	}


static public module:WhatsApp-10.class#30 pickChatable( module:WhatsApp.class#11 ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokenonvirtual_lib .routine_6170 // pc=1
	astore_1 
	aload_1 
	arraylength 
	iconst_1 
	if_icmpne Label12
	aload_1 
	iconst_0 
	aaload 
	areturn 
Label12:
	aload_1 
	arraylength 
	iconst_1 
	if_icmple Label33
	sipush 356
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	aload_1 
	iconst_0 
	invokestatic_lib int ask( java.lang.String, java.lang.Object[], int ) // Dialog
	istore_2 
	iload_2 
	bipush -1
	if_icmple Label33
	iload_2 
	aload_1 
	arraylength 
	if_icmpge Label33
	aload_1 
	iload_2 
	aaload 
	areturn 
Label33:
	aconst_null 
	areturn 
	}


static protected inviteThisFriend( module:WhatsApp.class#11 ); // address: 0
	{
	enter_narrow 
	aload_0 
	ifnull Label20
	new_lib com.whatsapp.client.//module:WhatsApp-20.class#12 module:WhatsApp-20.class#12 module:WhatsApp-20.class#12
	dup 
	aload_0 
	invokespecial_lib .routine_6281 // pc=2
	astore_1 
	aload_1 
	invokenonvirtual_lib .routine_6004 // pc=1
	ifeq Label17
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	astore_2 
	aload_2 
	aload_1 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
Label17:
	sipush 659
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokestatic_lib inform( java.lang.String ) // Dialog
Label20:
	return 
	}


static boolean splitSecondaryText(  ); // address: 0
	{
	enter_narrow 
	invokestatic_lib int getHeight(  ) // Display
	invokestatic_lib int getWidth(  ) // Display
	if_icmple Label6
	iconst_1 
	ireturn 
Label6:
	iconst_0 
	ireturn 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private net.rim.device.api.system.Bitmap com.whatsapp.client.TabButton.routine_7376( com.whatsapp.client.TabButton ); // address: 0
	{
	enter_narrow 
	ldc literal_79:"narrow-active"
	invokestatic_lib module:WhatsApp-9.class#2.routine_1423(  ) // class#2
	areturn 
	}


private net.rim.device.api.system.Bitmap com.whatsapp.client.TabButton.routine_7395( com.whatsapp.client.TabButton ); // address: 0
	{
	enter_narrow 
	ldc literal_80:"narrow-hover"
	invokestatic_lib module:WhatsApp-9.class#2.routine_1423(  ) // class#2
	areturn 
	}


private module:WhatsApp-37.class#8 com.whatsapp.client.TabButton.routine_7418( com.whatsapp.client.TabButton ); // address: 0
	{
	enter_narrow 
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

	// @@@@@@@@@@@@@ Virtual routines 

public boolean isFocusable( com.whatsapp.client.TabButton ); // address: 0
	{
	ireturn_bipush 1
	}


protected boolean navigationClick( com.whatsapp.client.TabButton, int, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = 53168 ord = 0 addr = 0
	aload_0 
	invokenonvirtual_lib .routine_4409 // pc=2
	iconst_1 
	ireturn 
	}


protected boolean touchEvent( com.whatsapp.client.TabButton, net.rim.device.api.ui.TouchEvent ); // address: 0
	{
	enter_narrow 
	aload_1 
	invokevirtual int getEvent( net.rim.device.api.ui.TouchEvent ) // pc=1
	sipush 13573
	if_icmpne Label10
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = 53168 ord = 0 addr = 0
	aload_0 
	invokenonvirtual_lib .routine_4409 // pc=2
	iconst_1 
	ireturn 
Label10:
	aload_0 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.Field.touchEvent // pc=2
	ireturn 
	}


protected boolean keyChar( com.whatsapp.client.TabButton, char, int, int ); // address: 0
	{
	enter 
	iload_1 
	bipush 10
	if_icmpne Label9
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = 53168 ord = 0 addr = 0
	aload_0 
	invokenonvirtual_lib .routine_4409 // pc=2
	iconst_1 
	ireturn 
Label9:
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	invokespecial_lib net.rim.device.api.ui.Field.keyChar // pc=4
	ireturn 
	}


protected paint( com.whatsapp.client.TabButton, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter 
	aconst_null 
	astore_2 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	istore_3 
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	istore_4 
	aload_0 
	invokevirtual boolean isFocus( net.rim.device.api.ui.Field ) // pc=1
	ifeq Label16
	aload_0 
	invokespecial com.whatsapp.client.TabButton.routine_7395 // pc=1
	astore_2 
	goto Label21
Label16:
	aload_0_getfield _selected   // get_name_1:  _selected   // get_name_2:  _selected   // get_Name:    _selected   // getName->1:  _selected   // getName->2:  _selected   // getName->N:  _selected   // ofs = 53172 ord = 1 addr = 0
	ifeq Label21
	aload_0 
	invokespecial com.whatsapp.client.TabButton.routine_7376 // pc=1
	astore_2 
Label21:
	aload_2 
	ifnull Label89
	iload_3 
	aload_2 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	isub 
	bipush 2
	idiv 
	istore_5 
	iload_4 
	aload_2 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	isub 
	bipush 2
	idiv 
	istore_6 
	iload_5 
	ifge Label78
	aload_1 
	iconst_0 
	iload_6 
	bipush 10
	aload_2 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	aload_2 
	iconst_0 
	iconst_0 
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=8
	aload_1 
	bipush -97
	bipush 10
	iload_6 
	iload_3 
	bipush 20
	isub 
	aload_2 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	aload_2 
	bipush 10
	iconst_0 
	invokevirtual tileRop( net.rim.device.api.ui.Graphics, int, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=9
	aload_1 
	iload_3 
	bipush 10
	isub 
	iload_6 
	bipush 10
	aload_2 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	aload_2 
	aload_2 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	bipush 10
	isub 
	iconst_0 
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=8
	goto Label89
Label78:
	aload_1 
	iload_5 
	iload_6 
	aload_2 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_2 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	aload_2 
	iconst_0 
	iconst_0 
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=8
Label89:
	aload_0 
	invokevirtual net.rim.device.api.system.Bitmap getIcon( com.whatsapp.client.TabButton ) // pc=1
	astore_5 
	iload_3 
	aload_5 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	isub 
	bipush 2
	idiv 
	istore_6 
	iload_4 
	aload_5 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	isub 
	bipush 2
	idiv 
	istore_7 
	aload_1 
	iload_6 
	iload_7 
	aload_5 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_5 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	aload_5 
	iconst_0 
	iconst_0 
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=8
	return 
	}


public int getPreferredHeight( com.whatsapp.client.TabButton ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial com.whatsapp.client.TabButton.routine_7395 // pc=1
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	ireturn 
	}


public int getPreferredWidth( com.whatsapp.client.TabButton ); // address: 0
	{
	ireturn_bipush 50
	}


protected layout( com.whatsapp.client.TabButton, int, int ); // address: 0
	{
	enter 
	aload_0 
	iload_1 
	iload_2 
	aload_0 
	invokenonvirtual com.whatsapp.client.TabButton.getPreferredHeight // pc=1
	invokestatic_lib int min( int, int ) // Math
	invokevirtual setExtent( net.rim.device.api.ui.Field, int, int ) // pc=3
	return 
	}


protected drawFocus( com.whatsapp.client.TabButton, net.rim.device.api.ui.Graphics, boolean ); // address: 0
	{
	noenter_return 
	}


protected onFocus( com.whatsapp.client.TabButton, int ); // address: 0
	{
	enter 
	aload_0 
	iload_1 
	invokespecial_lib net.rim.device.api.ui.Field.onFocus // pc=2
	aload_0 
	invokevirtual java.lang.String getTooltip( com.whatsapp.client.TabButton ) // pc=1
	astore_2 
	aload_0 
	invokespecial com.whatsapp.client.TabButton.routine_7418 // pc=1
	astore_3 
	aload_2 
	ifnull Label22
	aload_3 
	ifnull Label22
	aload_2 
	iipush 2632234
	invokestatic net.rim.device.api.ui.Field getPopup( java.lang.String, int ) // TabButton
	astore_4 
	aload_3 
	aload_4 
	aload_0 
	invokeinterface interfacemethodref_11 // pc=3 guess=12
Label22:
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Field ) // pc=1
	return 
	}


protected onUnfocus( com.whatsapp.client.TabButton ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib net.rim.device.api.ui.Field.onUnfocus // pc=1
	aload_0 
	invokespecial com.whatsapp.client.TabButton.routine_7418 // pc=1
	astore_1 
	aload_1 
	ifnull Label12
	aload_1 
	aconst_null 
	aconst_null 
	invokeinterface interfacemethodref_11 // pc=3 guess=13
Label12:
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Field ) // pc=1
	return 
	}


abstract public itemClicked( com.whatsapp.client.TabButton ); // address: 0
	{
	halt 
	}


public net.rim.device.api.ui.Field[] getHeaderFields( com.whatsapp.client.TabButton ); // address: 0
	{
	enter_narrow 
	aconst_null 
	areturn 
	}


abstract public drawListRow( com.whatsapp.client.TabButton, net.rim.device.api.ui.Graphics, int, int, int, boolean ); // address: 0
	{
	halt 
	}


abstract public java.util.Vector filterList( com.whatsapp.client.TabButton, java.lang.String, int ); // address: 0
	{
	halt 
	}


public boolean isUnfilteredListEmpty( com.whatsapp.client.TabButton ); // address: 0
	{
	ireturn_bipush 1
	}


public java.lang.String getEmptyListString( com.whatsapp.client.TabButton ); // address: 0
	{
	enter_narrow 
	sipush 324
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	areturn 
	}


public net.rim.device.api.ui.Field getEmptyListField( com.whatsapp.client.TabButton ); // address: 0
	{
	enter_narrow 
	aconst_null 
	areturn 
	}


abstract public net.rim.device.api.system.Bitmap getIcon( com.whatsapp.client.TabButton ); // address: 0
	{
	halt 
	}


abstract public java.lang.String getTooltip( com.whatsapp.client.TabButton ); // address: 0
	{
	halt 
	}


abstract public net.rim.device.api.system.Bitmap getContextIcon( com.whatsapp.client.TabButton ); // address: 0
	{
	halt 
	}


abstract public java.lang.String getContextTooltip( com.whatsapp.client.TabButton ); // address: 0
	{
	halt 
	}


abstract public contextButtonClicked( com.whatsapp.client.TabButton ); // address: 0
	{
	halt 
	}


public deleteItem( com.whatsapp.client.TabButton ); // address: 0
	{
	noenter_return 
	}


public makeMenu( com.whatsapp.client.TabButton, net.rim.device.api.ui.component.Menu ); // address: 0
	{
	enter 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = 53168 ord = 0 addr = 0
	invokenonvirtual_lib .routine_4316 // pc=1
	astore_2 
	aload_2 
	checkcastbranch_lib 
	astore_3 
	aload_3 
	iconst_0 
	invokenonvirtual_lib .routine_5897 // pc=2
	astore_4 
	aload_3 
	invokenonvirtual_lib .routine_5797 // pc=1
	astore_5 
	aload_3 
	invokenonvirtual_lib .routine_6610 // pc=1
	invokevirtual int size( java.util.Vector ) // pc=1
	ifle Label20
	iconst_1 
	goto Label21
Label20:
	iconst_0 
Label21:
	istore_6 
	aload_3 
	invokestatic_lib module:WhatsApp-13.class#5.routine_9657(  ) // class#5
	invokenonvirtual_lib .routine_6319 // pc=2
	ifeq Label38
	aload_0_getfield _chatContactMenuItem   // get_name_1:  _chatContactMenuItem   // get_name_2:  _chatContactMenuItem   // get_Name:    _chatContactMenuItem   // getName->1:  _chatContactMenuItem   // getName->2:  _chatContactMenuItem   // getName->N:  _chatContactMenuItem   // ofs = 53180 ord = 3 addr = 0
	sipush 265
	aload_5 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	invokenonvirtual_lib .routine_4957 // pc=2
	aload_1 
	aload_0_getfield _chatContactMenuItem   // get_name_1:  _chatContactMenuItem   // get_name_2:  _chatContactMenuItem   // get_Name:    _chatContactMenuItem   // getName->1:  _chatContactMenuItem   // getName->2:  _chatContactMenuItem   // getName->N:  _chatContactMenuItem   // ofs = 53180 ord = 3 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	aload_0_getfield _chatContactMenuItem   // get_name_1:  _chatContactMenuItem   // get_name_2:  _chatContactMenuItem   // get_Name:    _chatContactMenuItem   // getName->1:  _chatContactMenuItem   // getName->2:  _chatContactMenuItem   // getName->N:  _chatContactMenuItem   // ofs = 53180 ord = 3 addr = 0
	invokevirtual setDefault( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	goto Label46
Label38:
	aload_0_getfield com.whatsapp.client.TabButton.field_53200   // get_name_1:  com.whatsapp.client.TabButton.field_53200   // get_name_2:  com.whatsapp.client.TabButton.field_53200   // get_Name:    com.whatsapp.client.TabButton.field_53200   // getName->1:     // getName->2:     // getName->N:     // ofs = 53200 ord = 8 addr = 0
	sipush 264
	aload_5 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	invokenonvirtual_lib .routine_4957 // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.TabButton.field_53200   // get_name_1:  com.whatsapp.client.TabButton.field_53200   // get_name_2:  com.whatsapp.client.TabButton.field_53200   // get_Name:    com.whatsapp.client.TabButton.field_53200   // getName->1:     // getName->2:     // getName->N:     // ofs = 53200 ord = 8 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label46:
	aload_0_getfield _viewContactMenuItem   // get_name_1:  _viewContactMenuItem   // get_name_2:  _viewContactMenuItem   // get_Name:    _viewContactMenuItem   // getName->1:  _viewContactMenuItem   // getName->2:  _viewContactMenuItem   // getName->N:  _viewContactMenuItem   // ofs = 53188 ord = 5 addr = 0
	bipush 55
	aload_4 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	invokenonvirtual_lib .routine_4957 // pc=2
	aload_1 
	aload_0_getfield _viewContactMenuItem   // get_name_1:  _viewContactMenuItem   // get_name_2:  _viewContactMenuItem   // get_Name:    _viewContactMenuItem   // getName->1:  _viewContactMenuItem   // getName->2:  _viewContactMenuItem   // getName->N:  _viewContactMenuItem   // ofs = 53188 ord = 5 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_3 
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokevirtual int size( java.util.Vector ) // pc=1
	ifle Label66
	aload_0_getfield _emailContactMenuItem   // get_name_1:  _emailContactMenuItem   // get_name_2:  _emailContactMenuItem   // get_Name:    _emailContactMenuItem   // getName->1:  _emailContactMenuItem   // getName->2:  _emailContactMenuItem   // getName->N:  _emailContactMenuItem   // ofs = 53184 ord = 4 addr = 0
	bipush 69
	aload_4 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	invokenonvirtual_lib .routine_4957 // pc=2
	aload_1 
	aload_0_getfield _emailContactMenuItem   // get_name_1:  _emailContactMenuItem   // get_name_2:  _emailContactMenuItem   // get_Name:    _emailContactMenuItem   // getName->1:  _emailContactMenuItem   // getName->2:  _emailContactMenuItem   // getName->N:  _emailContactMenuItem   // ofs = 53184 ord = 4 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label66:
	iload_6 
	ifeq Label76
	aload_0_getfield _callContactMenuItem   // get_name_1:  _callContactMenuItem   // get_name_2:  _callContactMenuItem   // get_Name:    _callContactMenuItem   // getName->1:  _callContactMenuItem   // getName->2:  _callContactMenuItem   // getName->N:  _callContactMenuItem   // ofs = 53192 ord = 6 addr = 0
	bipush 71
	aload_4 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	invokenonvirtual_lib .routine_4957 // pc=2
	aload_1 
	aload_0_getfield _callContactMenuItem   // get_name_1:  _callContactMenuItem   // get_name_2:  _callContactMenuItem   // get_Name:    _callContactMenuItem   // getName->1:  _callContactMenuItem   // getName->2:  _callContactMenuItem   // getName->N:  _callContactMenuItem   // ofs = 53192 ord = 6 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label76:
	aload_1 
	invokevirtual int addSeparator( net.rim.device.api.ui.component.Menu ) // pc=1
	pop 
Label79:
	return 
	}


protected chatContact( com.whatsapp.client.TabButton ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = 53168 ord = 0 addr = 0
	invokenonvirtual_lib .routine_4316 // pc=1
	checkcast_lib com.whatsapp.client.ContactInfoDetails//module:WhatsApp.class#11 module:WhatsApp.class#11 module:WhatsApp.class#11
	astore_1 
	aload_1 
	ifnull Label16
	aload_1 
	invokestatic module:WhatsApp-10.class#30 pickChatable( module:WhatsApp.class#11 ) // TabButton
	astore_2 
	aload_2 
	ifnull Label16
	aload_2 
	aconst_null 
	invokestatic module:WhatsApp-25.class#0 makeChatScreen( module:WhatsApp-10.class#30, net.rim.device.api.ui.Screen ) // TabButton
	pop 
Label16:
	return 
	}


protected showContactDetailsScreen( com.whatsapp.client.TabButton ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = 53168 ord = 0 addr = 0
	invokenonvirtual_lib .routine_4316 // pc=1
	checkcast_lib com.whatsapp.client.ContactInfoDetails//module:WhatsApp.class#11 module:WhatsApp.class#11 module:WhatsApp.class#11
	astore_1 
	aload_0 
	aload_1 
	invokenonvirtual com.whatsapp.client.TabButton.showContactDetailsScreen // pc=2
	return 
	}


protected showContactDetailsScreen( com.whatsapp.client.TabButton, module:WhatsApp.class#11 ); // address: 0
	{
	enter 
	aload_1 
	ifnull Label13
	new_lib //module:WhatsApp-13.class#0 module:WhatsApp-13.class#0 module:WhatsApp-13.class#0
	dup 
	aload_1 
	invokespecial_lib .routine_3417 // pc=2
	astore_2 
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	astore_3 
	aload_3 
	aload_2 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
Label13:
	return 
	}


protected emailContact( com.whatsapp.client.TabButton ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = 53168 ord = 0 addr = 0
	invokenonvirtual_lib .routine_4316 // pc=1
	checkcast_lib com.whatsapp.client.ContactInfoDetails//module:WhatsApp.class#11 module:WhatsApp.class#11 module:WhatsApp.class#11
	astore_1 
	aload_0 
	aload_1 
	invokenonvirtual com.whatsapp.client.TabButton.emailContact // pc=2
	return 
	}


protected emailContact( com.whatsapp.client.TabButton, module:WhatsApp.class#11 ); // address: 0
	{
	enter 
	aload_1 
	ifnonnull Label4
	goto_w Label73
Label4:
	aload_1 
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	astore_2 
	aconst_null 
	astore_3 
	aload_2 
	invokevirtual int size( java.util.Vector ) // pc=1
	iconst_1 
	if_icmpne Label19
	aload_2 
	iconst_0 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib net.rim.device.api.ui.MenuItem//net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem
	astore_3 
	goto Label60
Label19:
	aload_2 
	invokevirtual int size( java.util.Vector ) // pc=1
	iconst_1 
	if_icmple Label60
	aload_2 
	invokevirtual int size( java.util.Vector ) // pc=1
	newarray_object_lib net.rim.device.api.ui.container.HorizontalFieldManager//net.rim.device.api.ui.container.HorizontalFieldManager net.rim.device.api.ui.container.HorizontalFieldManager net.rim.device.api.ui.container.HorizontalFieldManager
	astore_4 
	aload_4 
	arraylength 
	iconst_1 
	isub 
	istore_5 
Label32:
	iload_5 
	iflt Label42
	aload_4 
	iload_5 
	aload_2 
	iload_5 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	aastore 
	iinc 5 -1
	goto Label32
Label42:
	bipush 31
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	aload_4 
	iconst_0 
	invokestatic_lib int ask( java.lang.String, java.lang.Object[], int ) // Dialog
	istore_5 
	iload_5 
	bipush -1
	if_icmple Label60
	iload_5 
	aload_4 
	arraylength 
	if_icmpge Label60
	aload_4 
	iload_5 
	aaload 
	checkcast_lib net.rim.device.api.ui.MenuItem//net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem
	astore_3 
Label60:
	aload_3 
	ifnull Label73
	bipush 2
	new_lib net.rim.blackberry.api.invoke.MessageArguments//net.rim.blackberry.api.invoke.MessageArguments net.rim.blackberry.api.invoke.MessageArguments net.rim.blackberry.api.invoke.MessageArguments
	dup 
	ldc literal_76:"new"
	aload_3 
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokespecial_lib net.rim.blackberry.api.invoke.MessageArguments.<init> // pc=5
	invokestatic_lib invokeApplication( int, net.rim.blackberry.api.invoke.ApplicationArguments ) // Invoke
	return 
	astore_4 
Label73:
	return 
	}


protected java.lang.String callSMSContact( com.whatsapp.client.TabButton, int ); // address: 0
	{
	enter 
	aconst_null 
	astore_2 
	iconst_0 
	newarray_object_lib net.rim.device.api.ui.container.HorizontalFieldManager//net.rim.device.api.ui.container.HorizontalFieldManager net.rim.device.api.ui.container.HorizontalFieldManager net.rim.device.api.ui.container.HorizontalFieldManager
	astore_3 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = 53168 ord = 0 addr = 0
	invokenonvirtual_lib .routine_4316 // pc=1
	checkcast_lib com.whatsapp.client.ContactInfoDetails//module:WhatsApp.class#11 module:WhatsApp.class#11 module:WhatsApp.class#11
	astore_4 
	aload_4 
	ifnonnull Label13
	goto_w Label292
Label13:
	aload_4 
	getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	ifnull Label28
	aload_3 
	new_lib com.whatsapp.client.CustomItem//module:WhatsApp-14.class#6 module:WhatsApp-14.class#6 module:WhatsApp-14.class#6
	dup 
	bipush 3
	bipush 74
	bipush 57
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	aload_4 
	getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	invokestatic_lib module:WhatsApp-27.class#28.routine_5838(  ) // class#28
	invokespecial_lib .routine_1490 // pc=3
	invokestatic_lib add( java.lang.Object[], java.lang.Object ) // Arrays
Label28:
	aload_4 
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifnull Label43
	aload_3 
	new_lib com.whatsapp.client.CustomItem//module:WhatsApp-14.class#6 module:WhatsApp-14.class#6 module:WhatsApp-14.class#6
	dup 
	bipush 4
	bipush 74
	bipush 58
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	aload_4 
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokestatic_lib module:WhatsApp-27.class#28.routine_5838(  ) // class#28
	invokespecial_lib .routine_1490 // pc=3
	invokestatic_lib add( java.lang.Object[], java.lang.Object ) // Arrays
Label43:
	aload_4 
	getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	ifnull Label58
	aload_3 
	new_lib com.whatsapp.client.CustomItem//module:WhatsApp-14.class#6 module:WhatsApp-14.class#6 module:WhatsApp-14.class#6
	dup 
	iconst_1 
	bipush 74
	bipush 59
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	aload_4 
	getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	invokestatic_lib module:WhatsApp-27.class#28.routine_5838(  ) // class#28
	invokespecial_lib .routine_1490 // pc=3
	invokestatic_lib add( java.lang.Object[], java.lang.Object ) // Arrays
Label58:
	aload_4 
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	ifnull Label73
	aload_3 
	new_lib com.whatsapp.client.CustomItem//module:WhatsApp-14.class#6 module:WhatsApp-14.class#6 module:WhatsApp-14.class#6
	dup 
	bipush 2
	bipush 74
	bipush 60
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	aload_4 
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	invokestatic_lib module:WhatsApp-27.class#28.routine_5838(  ) // class#28
	invokespecial_lib .routine_1490 // pc=3
	invokestatic_lib add( java.lang.Object[], java.lang.Object ) // Arrays
Label73:
	aload_4 
	getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	ifnull Label88
	aload_3 
	new_lib com.whatsapp.client.CustomItem//module:WhatsApp-14.class#6 module:WhatsApp-14.class#6 module:WhatsApp-14.class#6
	dup 
	iconst_0 
	bipush 74
	bipush 61
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	aload_4 
	getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	invokestatic_lib module:WhatsApp-27.class#28.routine_5838(  ) // class#28
	invokespecial_lib .routine_1490 // pc=3
	invokestatic_lib add( java.lang.Object[], java.lang.Object ) // Arrays
Label88:
	aload_4 
	getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	ifnull Label103
	aload_3 
	new_lib com.whatsapp.client.CustomItem//module:WhatsApp-14.class#6 module:WhatsApp-14.class#6 module:WhatsApp-14.class#6
	dup 
	bipush 8
	bipush 74
	sipush 354
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	aload_4 
	getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	invokestatic_lib module:WhatsApp-27.class#28.routine_5838(  ) // class#28
	invokespecial_lib .routine_1490 // pc=3
	invokestatic_lib add( java.lang.Object[], java.lang.Object ) // Arrays
Label103:
	aload_4 
	getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	ifnull Label118
	aload_3 
	new_lib com.whatsapp.client.CustomItem//module:WhatsApp-14.class#6 module:WhatsApp-14.class#6 module:WhatsApp-14.class#6
	dup 
	bipush 5
	bipush 74
	bipush 62
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	aload_4 
	getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	invokestatic_lib module:WhatsApp-27.class#28.routine_5838(  ) // class#28
	invokespecial_lib .routine_1490 // pc=3
	invokestatic_lib add( java.lang.Object[], java.lang.Object ) // Arrays
Label118:
	aload_4 
	getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	ifnull Label133
	aload_3 
	new_lib com.whatsapp.client.CustomItem//module:WhatsApp-14.class#6 module:WhatsApp-14.class#6 module:WhatsApp-14.class#6
	dup 
	bipush 6
	bipush 74
	bipush 63
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	aload_4 
	getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	invokestatic_lib module:WhatsApp-27.class#28.routine_5838(  ) // class#28
	invokespecial_lib .routine_1490 // pc=3
	invokestatic_lib add( java.lang.Object[], java.lang.Object ) // Arrays
Label133:
	aload_4 
	getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	ifnull Label148
	aload_3 
	new_lib com.whatsapp.client.CustomItem//module:WhatsApp-14.class#6 module:WhatsApp-14.class#6 module:WhatsApp-14.class#6
	dup 
	bipush 9
	bipush 74
	sipush 355
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	aload_4 
	getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	invokestatic_lib module:WhatsApp-27.class#28.routine_5838(  ) // class#28
	invokespecial_lib .routine_1490 // pc=3
	invokestatic_lib add( java.lang.Object[], java.lang.Object ) // Arrays
Label148:
	aload_4 
	getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	ifnull Label163
	aload_3 
	new_lib com.whatsapp.client.CustomItem//module:WhatsApp-14.class#6 module:WhatsApp-14.class#6 module:WhatsApp-14.class#6
	dup 
	bipush 7
	bipush 74
	bipush 64
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	aload_4 
	getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	invokestatic_lib module:WhatsApp-27.class#28.routine_5838(  ) // class#28
	invokespecial_lib .routine_1490 // pc=3
	invokestatic_lib add( java.lang.Object[], java.lang.Object ) // Arrays
Label163:
	aconst_null 
	astore_5 
	aload_3 
	arraylength 
	iconst_1 
	if_icmpne Label175
	aload_3 
	iconst_0 
	aaload 
	checkcast_lib com.whatsapp.client.CustomItem//module:WhatsApp-14.class#6 module:WhatsApp-14.class#6 module:WhatsApp-14.class#6
	astore_5 
	goto Label205
Label175:
	aload_3 
	arraylength 
	iconst_1 
	if_icmple Label205
	bipush 30
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	astore_6 
	iload_1 
	iconst_1 
	if_icmpne Label188
	bipush 75
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	astore_6 
Label188:
	aload_6 
	aload_3 
	iconst_0 
	invokestatic_lib int ask( java.lang.String, java.lang.Object[], int ) // Dialog
	istore_7 
	iload_7 
	bipush -1
	if_icmple Label205
	iload_7 
	aload_3 
	arraylength 
	if_icmpge Label205
	aload_3 
	iload_7 
	aaload 
	checkcast_lib com.whatsapp.client.CustomItem//module:WhatsApp-14.class#6 module:WhatsApp-14.class#6 module:WhatsApp-14.class#6
	astore_5 
Label205:
	aload_5 
	ifnull Label249
	aload_5 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	tableswitch  :
		
		
		
		
		
		
		
		
		
		
		

Label210:
	aload_4 
	getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	astore_2 
	goto Label249
Label214:
	aload_4 
	getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	astore_2 
	goto Label249
Label218:
	aload_4 
	getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	astore_2 
	goto Label249
Label222:
	aload_4 
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	astore_2 
	goto Label249
Label226:
	aload_4 
	getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	astore_2 
	goto Label249
Label230:
	aload_4 
	getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	astore_2 
	goto Label249
Label234:
	aload_4 
	getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	astore_2 
	goto Label249
Label238:
	aload_4 
	getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	astore_2 
	goto Label249
Label242:
	aload_4 
	getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	astore_2 
	goto Label249
Label246:
	aload_4 
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	astore_2 
Label249:
	aload_2 
	ifnull Label292
	iload_1 
	ifne Label261
	bipush 4
	new_lib net.rim.blackberry.api.invoke.PhoneArguments//net.rim.blackberry.api.invoke.PhoneArguments net.rim.blackberry.api.invoke.PhoneArguments net.rim.blackberry.api.invoke.PhoneArguments
	dup 
	ldc literal_77:"call"
	aload_2 
	invokespecial_lib net.rim.blackberry.api.invoke.PhoneArguments.<init> // pc=3
	invokestatic_lib invokeApplication( int, net.rim.blackberry.api.invoke.ApplicationArguments ) // Invoke
	goto Label292
Label261:
	iload_1 
	iconst_1 
	if_icmpne Label292
	getstatic_lib module:WhatsApp-12.class#0.static_150 // class#0
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String ) // Connector
	checkcast_lib net.rim.device.api.ui.TouchEvent//net.rim.device.api.ui.TouchEvent net.rim.device.api.ui.TouchEvent net.rim.device.api.ui.TouchEvent
	astore_6 
	aload_6 
	ldc literal_78:"text"
	invokeinterface interfacemethodref_12 // pc=2 guess=14
	checkcast_lib Math//java.lang.Math java.lang.Math java.lang.Math
	astore_7 
	aload_7 
	new_lib Object//java.lang.Object java.lang.Object java.lang.Object
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	getstatic_lib module:WhatsApp-12.class#0.static_150 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokeinterface interfacemethodref_13 // pc=2 guess=15
	bipush 2
	new_lib net.rim.blackberry.api.invoke.MessageArguments//net.rim.blackberry.api.invoke.MessageArguments net.rim.blackberry.api.invoke.MessageArguments net.rim.blackberry.api.invoke.MessageArguments
	dup 
	aload_7 
	invokespecial_lib net.rim.blackberry.api.invoke.MessageArguments.<init> // pc=2
	invokestatic_lib invokeApplication( int, net.rim.blackberry.api.invoke.ApplicationArguments ) // Invoke
	aload_2 
	areturn 
	astore_6 
Label292:
	aload_2 
	areturn 
	}


protected contactsMenuFactory( com.whatsapp.client.TabButton ); // address: 0
	{
	enter 
	sipush 200
	istore_1 
	bipush 10
	istore_2 
	aload_0 
	sipush 265
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	new_lib com.whatsapp.client.TabButton$1//module:WhatsApp-28.class#27 module:WhatsApp-28.class#27 module:WhatsApp-28.class#27
	dup 
	aload_0 
	invokespecial_lib .routine_8135 // pc=2
	invokestatic_lib module:WhatsApp-34.class#11.routine_5026(  ) // class#11
	putfield _chatContactMenuItem   // get_name_1:  _chatContactMenuItem   // get_name_2:  _chatContactMenuItem   // get_Name:    _chatContactMenuItem   // getName->1:  _chatContactMenuItem   // getName->2:  _chatContactMenuItem   // getName->N:  _chatContactMenuItem   // ofs = 53180 ord = 3 addr = 0
	aload_0 
	sipush 264
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	new TabButton$2
	dup 
	aload_0 
	invokespecial com.whatsapp.client.TabButton$2.<init> // pc=2
	invokestatic_lib module:WhatsApp-34.class#11.routine_5026(  ) // class#11
	putfield com.whatsapp.client.TabButton.field_53200   // get_name_1:  com.whatsapp.client.TabButton.field_53200   // get_name_2:  com.whatsapp.client.TabButton.field_53200   // get_Name:    com.whatsapp.client.TabButton.field_53200   // getName->1:     // getName->2:     // getName->N:     // ofs = 53200 ord = 8 addr = 0
	aload_0 
	bipush 55
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	new TabButton$3
	dup 
	aload_0 
	invokespecial com.whatsapp.client.TabButton$3.<init> // pc=2
	invokestatic_lib module:WhatsApp-34.class#11.routine_5026(  ) // class#11
	putfield _viewContactMenuItem   // get_name_1:  _viewContactMenuItem   // get_name_2:  _viewContactMenuItem   // get_Name:    _viewContactMenuItem   // getName->1:  _viewContactMenuItem   // getName->2:  _viewContactMenuItem   // getName->N:  _viewContactMenuItem   // ofs = 53188 ord = 5 addr = 0
	aload_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5730(  ) // class#28
	sipush 130
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	new TabButton$4
	dup 
	aload_0 
	invokespecial com.whatsapp.client.TabButton$4.<init> // pc=2
	invokestatic_lib module:WhatsApp-34.class#11.routine_4997(  ) // class#11
	putfield _emailContactMenuItem   // get_name_1:  _emailContactMenuItem   // get_name_2:  _emailContactMenuItem   // get_Name:    _emailContactMenuItem   // getName->1:  _emailContactMenuItem   // getName->2:  _emailContactMenuItem   // getName->N:  _emailContactMenuItem   // ofs = 53184 ord = 4 addr = 0
	aload_0 
	bipush 71
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	new TabButton$5
	dup 
	aload_0 
	invokespecial com.whatsapp.client.TabButton$5.<init> // pc=2
	invokestatic_lib module:WhatsApp-34.class#11.routine_5026(  ) // class#11
	putfield _callContactMenuItem   // get_name_1:  _callContactMenuItem   // get_name_2:  _callContactMenuItem   // get_Name:    _callContactMenuItem   // getName->1:  _callContactMenuItem   // getName->2:  _callContactMenuItem   // getName->N:  _callContactMenuItem   // ofs = 53192 ord = 6 addr = 0
	return 
	}

}
