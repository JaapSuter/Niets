// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp.cod
// Module version  : 2.8.1914
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


abstract final class AccountScreen extends com.whatsapp.field.

{
	// @@@@@@@@@@@@@ Static fields 
	public static net.rim.device.api.i18n.DateFormat /*net.rim.device.api.i18n.DateFormat*/  expireFmt ; // ofs = 49216 addr = 2)

	// @@@@@@@@@@@@@ Fields 
	private com.whatsapp.client. /*module:WhatsApp-30.class#17[]*/  field_49192 ; // ofs = 49192 addr = 0)
	private net.rim.device.api.ui.component.ListField /*net.rim.device.api.ui.component.ListField*/  field_49196 ; // ofs = 49196 addr = 0)
	private boolean /*boolean*/  field_49200 ; // ofs = 49200 addr = 0)
	private net.rim.device.api.ui.Manager /*net.rim.device.api.ui.Manager[]*/  field_49204 ; // ofs = 49204 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem[]*/  field_49208 ; // ofs = 49208 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_49212 ; // ofs = 49212 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.AccountScreen ); // address: 0
	{
	enter 
	aload_0 
	iipush 393216
	i2l 
	invokespecial_lib .routine_5321 // pc=3
	aload_0 
	bipush 2
	newarray_object_lib com.whatsapp.client.IconTextListField$Item//module:WhatsApp-30.class#17 module:WhatsApp-30.class#17 module:WhatsApp-30.class#17
	dup 
	iconst_0 
	new_lib com.whatsapp.client.//module:WhatsApp-78.class#14 module:WhatsApp-78.class#14 module:WhatsApp-78.class#14
	dup 
	aload_0 
	getstatic_lib module:WhatsApp-31.class#0.static_149 // class#0
	sipush 308
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	sipush 892
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokespecial_lib .routine_2460 // pc=5
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.AccountScreen$2//module:WhatsApp-78.class#15 module:WhatsApp-78.class#15 module:WhatsApp-78.class#15
	dup 
	aload_0 
	getstatic_lib module:WhatsApp-31.class#0.static_150 // class#0
	sipush 315
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	sipush 603
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokespecial_lib .routine_2505 // pc=5
	aastore 
	putfield com.whatsapp.client.AccountScreen.field_49192   // get_name_1:  com.whatsapp.client.AccountScreen.field_49192   // get_name_2:  com.whatsapp.client.AccountScreen.field_49192   // get_Name:    com.whatsapp.client.AccountScreen.field_49192   // getName->1:     // getName->2:     // getName->N:     // ofs = 49192 ord = 0 addr = 0
	aload_0 
	invokestatic_lib module:WhatsApp-60.class#2.routine_1393(  ) // class#2
	aload_0 
	invokestatic_lib module:WhatsApp-7.class#4.routine_1988(  ) // class#4
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	iipush 310000
	istore_1 
	sipush 1200
	istore_2 
	aload_0 
	aload_0_getfield com.whatsapp.client.AccountScreen.field_49192   // get_name_1:  com.whatsapp.client.AccountScreen.field_49192   // get_name_2:  com.whatsapp.client.AccountScreen.field_49192   // get_Name:    com.whatsapp.client.AccountScreen.field_49192   // getName->1:     // getName->2:     // getName->N:     // ofs = 49192 ord = 0 addr = 0
	arraylength 
	newarray_object_lib net.rim.device.api.ui.component.ListField//net.rim.device.api.ui.component.ListField net.rim.device.api.ui.component.ListField net.rim.device.api.ui.component.ListField
	putfield com.whatsapp.client.AccountScreen.field_49208   // get_name_1:  com.whatsapp.client.AccountScreen.field_49208   // get_name_2:  com.whatsapp.client.AccountScreen.field_49208   // get_Name:    com.whatsapp.client.AccountScreen.field_49208   // getName->1:     // getName->2:     // getName->N:     // ofs = 49208 ord = 4 addr = 0
	iconst_0 
	istore_3 
Label49:
	iload_3 
	aload_0_getfield com.whatsapp.client.AccountScreen.field_49192   // get_name_1:  com.whatsapp.client.AccountScreen.field_49192   // get_name_2:  com.whatsapp.client.AccountScreen.field_49192   // get_Name:    com.whatsapp.client.AccountScreen.field_49192   // getName->1:     // getName->2:     // getName->N:     // ofs = 49192 ord = 0 addr = 0
	arraylength 
	if_icmpge Label66
	aload_0_getfield com.whatsapp.client.AccountScreen.field_49208   // get_name_1:  com.whatsapp.client.AccountScreen.field_49208   // get_name_2:  com.whatsapp.client.AccountScreen.field_49208   // get_Name:    com.whatsapp.client.AccountScreen.field_49208   // getName->1:     // getName->2:     // getName->N:     // ofs = 49208 ord = 4 addr = 0
	iload_3 
	aload_0_getfield com.whatsapp.client.AccountScreen.field_49192   // get_name_1:  com.whatsapp.client.AccountScreen.field_49192   // get_name_2:  com.whatsapp.client.AccountScreen.field_49192   // get_Name:    com.whatsapp.client.AccountScreen.field_49192   // getName->1:     // getName->2:     // getName->N:     // ofs = 49192 ord = 0 addr = 0
	iload_3 
	aaload 
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokenonvirtual_lib .routine_6234 // pc=3
	aastore 
	iinc 3 1
	goto Label49
Label66:
	iload_1 
	iipush 65536
	iadd 
	istore_1 
	aload_0 
	new_lib com.whatsapp.client.AccountScreen$3//module:WhatsApp-78.class#16 module:WhatsApp-78.class#16 module:WhatsApp-78.class#16
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-47.class#11.routine_4359(  ) // class#11
	sipush 983
	iinc 1 10
	iload_1 
	iipush 2147483647
	invokespecial_lib .routine_2552 // pc=6
	putfield com.whatsapp.client.AccountScreen.field_49212   // get_name_1:  com.whatsapp.client.AccountScreen.field_49212   // get_name_2:  com.whatsapp.client.AccountScreen.field_49212   // get_Name:    com.whatsapp.client.AccountScreen.field_49212   // getName->1:     // getName->2:     // getName->N:     // ofs = 49212 ord = 5 addr = 0
	invokestatic_lib module:WhatsApp-13.class#0.routine_833(  ) // class#0
	astore_3 
	iipush 3355443
	istore_5 
	iconst_0 
	istore_6 
	aload_3 
	lgetfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	iconst_0 
	i2l 
	lcmp 
	ifle Label104
	aload_3 
	lgetfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	invokestatic_lib long currentTimeMillis(  ) // System
	lcmp 
	ifge Label104
	sipush 310
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	astore_4 
	iipush 16711680
	istore_5 
	goto Label126
Label104:
	aload_3 
	getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	ifne Label111
	sipush 304
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	astore_4 
	goto Label126
Label111:
	aload_3 
	getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	iconst_1 
	if_icmpne Label121
	sipush 303
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	astore_4 
	iipush 2205186
	istore_5 
	goto Label126
Label121:
	sipush 306
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	astore_4 
	iconst_1 
	istore_6 
Label126:
	new_lib net.rim.device.api.ui.Font//net.rim.device.api.ui.Font net.rim.device.api.ui.Font net.rim.device.api.ui.Font
	dup 
	lipush 18014398509481984
	invokespecial_lib net.rim.device.api.ui.component.NullField.<init> // pc=3
	astore_7 
	aload_0 
	aload_7 
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	new_lib com.whatsapp.field.WAHorizontalFieldManager//com.whatsapp.field.WAHorizontalFieldManager com.whatsapp.field.WAHorizontalFieldManager com.whatsapp.field.WAHorizontalFieldManager
	dup 
	invokespecial_lib .routine_4873 // pc=1
	astore 8
	aload 8
	iconst_1 
	invokenonvirtual_lib .routine_3951 // pc=2
	new_lib com.whatsapp.field.ColorLabelField//com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField
	dup 
	sipush 312
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	iipush 16777215
	lipush 1152921504606846976
	invokespecial_lib .routine_7214 // pc=5
	astore 9
	aload 9
	bipush 12
	bipush 18
	bipush 12
	bipush 18
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload 8
	aload 9
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	new_lib com.whatsapp.field.ColorLabelField//com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField
	dup 
	iload_6 
	ifeq Label165
	sipush 300
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	goto Label166
Label165:
	aload_4 
Label166:
	iipush 8421504
	invokespecial_lib .routine_7161 // pc=3
	astore 10
	aload 10
	bipush 12
	bipush 18
	bipush 12
	bipush 18
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload 8
	aload 10
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload 8
	iconst_1 
	invokestatic_lib module:WhatsApp-79.class#39.routine_28154(  ) // class#39
	aload 9
	aload 8
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	invokevirtual setFont( net.rim.device.api.ui.Field, net.rim.device.api.ui.Font ) // pc=2
	aload 8
	aconst_null 
	invokevirtual setFont( net.rim.device.api.ui.Field, net.rim.device.api.ui.Font ) // pc=2
	aload_0 
	aload 8
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	invokestatic_lib module:WhatsApp-44.class#7.routine_3329(  ) // class#7
	astore 11
	aload 11
	invokenonvirtual_lib .routine_2043 // pc=1
	astore 12
	sipush 305
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	invokestatic_lib module:WhatsApp-47.class#11.routine_4463(  ) // class#11
	aload_4 
	iload_5 
	invokestatic net.rim.device.api.ui.Manager com.whatsapp.client.AccountScreen.routine_1317( java.lang.String, java.lang.String, int ) // AccountScreen
	astore 13
	aload_0 
	aload 13
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	astore 15
	aload_3 
	lgetfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	iconst_0 
	i2l 
	lcmp 
	ifle Label219
	getstatic expireFmt // AccountScreen
	aload_3 
	lgetfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	invokevirtual java.lang.String formatLocal( net.rim.device.api.i18n.DateFormat, long ) // pc=3
	astore 15
Label219:
	sipush 307
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	invokestatic_lib module:WhatsApp-47.class#11.routine_4463(  ) // class#11
	astore 14
	aload 14
	aload 15
	iipush 3355443
	invokestatic net.rim.device.api.ui.Manager com.whatsapp.client.AccountScreen.routine_1317( java.lang.String, java.lang.String, int ) // AccountScreen
	astore 16
	aload_0 
	aload 16
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	sipush 316
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	invokestatic_lib module:WhatsApp-79.class#39.routine_30066(  ) // class#39
	astore 17
	aload 17
	new_lib net.rim.device.api.ui.decor.Background//net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	bipush 43
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	aload 12
	invokenonvirtual com.whatsapp.client.ApplicationHashData.getChatUserID // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	iipush 3355443
	invokestatic net.rim.device.api.ui.Manager com.whatsapp.client.AccountScreen.routine_1317( java.lang.String, java.lang.String, int ) // AccountScreen
	astore 18
	aload_0 
	aload 18
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	bipush 3
	newarray_object_lib net.rim.device.api.ui.Manager//net.rim.device.api.ui.Manager net.rim.device.api.ui.Manager net.rim.device.api.ui.Manager
	dup 
	iconst_0 
	aload 13
	aastore 
	dup 
	iconst_1 
	aload 16
	aastore 
	dup 
	bipush 2
	aload 18
	aastore 
	putfield com.whatsapp.client.AccountScreen.field_49204   // get_name_1:  com.whatsapp.client.AccountScreen.field_49204   // get_name_2:  com.whatsapp.client.AccountScreen.field_49204   // get_Name:    com.whatsapp.client.AccountScreen.field_49204   // getName->1:     // getName->2:     // getName->N:     // ofs = 49204 ord = 3 addr = 0
	new_lib net.rim.device.api.ui.decor.Background//net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background
	dup 
	ldc literal_86:"expire date is "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_3 
	lgetfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, long ) // pc=3
	ldc literal_87:" current is "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokestatic_lib long currentTimeMillis(  ) // System
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, long ) // pc=3
	ldc literal_88:" one week is "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	iipush 604800000
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_0 
	aload_3 
	getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	ifeq Label303
	aload_3 
	lgetfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	iconst_0 
	i2l 
	lcmp 
	ifeq Label303
	aload_3 
	lgetfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	invokestatic_lib long currentTimeMillis(  ) // System
	lsub 
	iipush 1209600000
	i2l 
	lcmp 
	ifge Label305
Label303:
	iconst_1 
	goto Label306
Label305:
	iconst_0 
Label306:
	putfield com.whatsapp.client.AccountScreen.field_49200   // get_name_1:  com.whatsapp.client.AccountScreen.field_49200   // get_name_2:  com.whatsapp.client.AccountScreen.field_49200   // get_Name:    com.whatsapp.client.AccountScreen.field_49200   // getName->1:     // getName->2:     // getName->N:     // ofs = 49200 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.client.AccountScreen.field_49200   // get_name_1:  com.whatsapp.client.AccountScreen.field_49200   // get_name_2:  com.whatsapp.client.AccountScreen.field_49200   // get_Name:    com.whatsapp.client.AccountScreen.field_49200   // getName->1:     // getName->2:     // getName->N:     // ofs = 49200 ord = 2 addr = 0
	ifne Label315
	aload_0 
	new_lib net.rim.device.api.ui.container.FullScreen//net.rim.device.api.ui.container.FullScreen net.rim.device.api.ui.container.FullScreen net.rim.device.api.ui.container.FullScreen
	dup 
	invokespecial_lib net.rim.device.api.ui.component.SeparatorField.<init> // pc=1
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	goto Label334
Label315:
	aload_0 
	new_lib com.whatsapp.client.IconTextListField//module:WhatsApp-30.class#16 module:WhatsApp-30.class#16 module:WhatsApp-30.class#16
	dup 
	aload_0_getfield com.whatsapp.client.AccountScreen.field_49192   // get_name_1:  com.whatsapp.client.AccountScreen.field_49192   // get_name_2:  com.whatsapp.client.AccountScreen.field_49192   // get_Name:    com.whatsapp.client.AccountScreen.field_49192   // getName->1:     // getName->2:     // getName->N:     // ofs = 49192 ord = 0 addr = 0
	invokespecial_lib .routine_5833 // pc=2
	putfield com.whatsapp.client.AccountScreen.field_49196   // get_name_1:  com.whatsapp.client.AccountScreen.field_49196   // get_name_2:  com.whatsapp.client.AccountScreen.field_49196   // get_Name:    com.whatsapp.client.AccountScreen.field_49196   // getName->1:     // getName->2:     // getName->N:     // ofs = 49196 ord = 1 addr = 0
	aload_0_getfield com.whatsapp.client.AccountScreen.field_49196   // get_name_1:  com.whatsapp.client.AccountScreen.field_49196   // get_name_2:  com.whatsapp.client.AccountScreen.field_49196   // get_Name:    com.whatsapp.client.AccountScreen.field_49196   // getName->1:     // getName->2:     // getName->N:     // ofs = 49196 ord = 1 addr = 0
	iipush 16777215
	invokestatic_lib net.rim.device.api.ui.decor.Background createSolidBackground( int ) // BackgroundFactory
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	aload_0_getfield com.whatsapp.client.AccountScreen.field_49196   // get_name_1:  com.whatsapp.client.AccountScreen.field_49196   // get_name_2:  com.whatsapp.client.AccountScreen.field_49196   // get_Name:    com.whatsapp.client.AccountScreen.field_49196   // getName->1:     // getName->2:     // getName->N:     // ofs = 49196 ord = 1 addr = 0
	bipush 12
	iconst_0 
	bipush 12
	iconst_0 
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	aload_0_getfield com.whatsapp.client.AccountScreen.field_49196   // get_name_1:  com.whatsapp.client.AccountScreen.field_49196   // get_name_2:  com.whatsapp.client.AccountScreen.field_49196   // get_Name:    com.whatsapp.client.AccountScreen.field_49196   // getName->1:     // getName->2:     // getName->N:     // ofs = 49196 ord = 1 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
Label334:
	new AccountScreen$4
	dup 
	aload_0 
	sipush 331
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	lipush 27021597764222976
	invokespecial com.whatsapp.client.AccountScreen$4.<init> // pc=5
	astore 19
	aload 19
	bipush 12
	bipush 12
	bipush 12
	bipush 12
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	aload 19
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib net.rim.device.api.ui.Font//net.rim.device.api.ui.Font net.rim.device.api.ui.Font net.rim.device.api.ui.Font
	dup 
	invokespecial_lib net.rim.device.api.ui.component.NullField.<init> // pc=1
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_7 
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	return 
	}


static private final net.rim.device.api.ui.Manager com.whatsapp.client.AccountScreen.routine_1317( java.lang.String, java.lang.String, int ); // address: 0
	{
	enter 
	new_lib com.whatsapp.field.ColorLabelField//com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField
	dup 
	aload_0 
	iipush 8947848
	invokespecial_lib .routine_7161 // pc=3
	astore_3 
	new_lib com.whatsapp.field.ColorLabelField//com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField
	dup 
	aload_1 
	iload_2 
	invokespecial_lib .routine_7161 // pc=3
	astore_4 
	aload_4 
	iconst_0 
	bipush 10
	iconst_0 
	bipush 2
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	new_lib System//java.lang.System java.lang.System java.lang.System
	dup 
	invokespecial_lib net.rim.device.api.ui.container.FlowFieldManager.<init> // pc=1
	astore_5 
	aload_5 
	aload_3 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_5 
	aload_4 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_5 
	bipush 6
	bipush 12
	bipush 6
	bipush 12
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_5 
	areturn 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	clinit_lib com.whatsapp.field.WAMainScreen//module:WhatsApp-55.class#12 module:WhatsApp-55.class#12 module:WhatsApp-55.class#12
	synch_static AccountScreen
	clinit_wait 
	bipush 48
	invokestatic_lib net.rim.device.api.i18n.DateFormat getInstance( int ) // DateFormat
	putstatic expireFmt // AccountScreen
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final deleteAccount( com.whatsapp.client.AccountScreen ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.//module:WhatsApp-23.class#1 module:WhatsApp-23.class#1 module:WhatsApp-23.class#1
	dup 
	invokespecial_lib .routine_18479 // pc=1
	astore_1 
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	aload_1 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final sublayout( com.whatsapp.client.AccountScreen, int, int ); // address: 0
	{
	enter 
	iconst_0 
	istore_3 
Label3:
	iload_3 
	aload_0_getfield com.whatsapp.client.AccountScreen.field_49204   // get_name_1:  com.whatsapp.client.AccountScreen.field_49204   // get_name_2:  com.whatsapp.client.AccountScreen.field_49204   // get_Name:    com.whatsapp.client.AccountScreen.field_49204   // getName->1:     // getName->2:     // getName->N:     // ofs = 49204 ord = 3 addr = 0
	arraylength 
	if_icmpge Label26
	new_lib net.rim.device.api.ui.component.ActiveRichTextField//net.rim.device.api.ui.component.ActiveRichTextField net.rim.device.api.ui.component.ActiveRichTextField net.rim.device.api.ui.component.ActiveRichTextField
	dup 
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=1
	astore_4 
	aload_0_getfield com.whatsapp.client.AccountScreen.field_49204   // get_name_1:  com.whatsapp.client.AccountScreen.field_49204   // get_name_2:  com.whatsapp.client.AccountScreen.field_49204   // get_Name:    com.whatsapp.client.AccountScreen.field_49204   // getName->1:     // getName->2:     // getName->N:     // ofs = 49204 ord = 3 addr = 0
	iload_3 
	aaload 
	aload_4 
	invokevirtual getPadding( net.rim.device.api.ui.Field, net.rim.device.api.ui.XYEdges ) // pc=2
	aload_4 
	iconst_0 
	putfield left   // get_name_1:  left   // get_name_2:  left   // get_Name:    left   // getName->1:  left   // getName->2:  left   // getName->N:  left   // ofs = -1 ord = 0 addr = -1
	aload_0_getfield com.whatsapp.client.AccountScreen.field_49204   // get_name_1:  com.whatsapp.client.AccountScreen.field_49204   // get_name_2:  com.whatsapp.client.AccountScreen.field_49204   // get_Name:    com.whatsapp.client.AccountScreen.field_49204   // getName->1:     // getName->2:     // getName->N:     // ofs = 49204 ord = 3 addr = 0
	iload_3 
	aaload 
	aload_4 
	invokevirtual setPadding( net.rim.device.api.ui.Field, net.rim.device.api.ui.XYEdges ) // pc=2
	iinc 3 1
	goto Label3
Label26:
	aload_0 
	iload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.container.FullScreen.sublayout // pc=3
	iconst_0 
	istore_3 
	iconst_0 
	istore_4 
	iconst_0 
	istore_5 
Label36:
	iload_5 
	aload_0_getfield com.whatsapp.client.AccountScreen.field_49204   // get_name_1:  com.whatsapp.client.AccountScreen.field_49204   // get_name_2:  com.whatsapp.client.AccountScreen.field_49204   // get_Name:    com.whatsapp.client.AccountScreen.field_49204   // getName->1:     // getName->2:     // getName->N:     // ofs = 49204 ord = 3 addr = 0
	arraylength 
	if_icmpge Label76
	aload_0_getfield com.whatsapp.client.AccountScreen.field_49204   // get_name_1:  com.whatsapp.client.AccountScreen.field_49204   // get_name_2:  com.whatsapp.client.AccountScreen.field_49204   // get_Name:    com.whatsapp.client.AccountScreen.field_49204   // getName->1:     // getName->2:     // getName->N:     // ofs = 49204 ord = 3 addr = 0
	iload_5 
	aaload 
	astore_6 
	aload_6 
	iconst_0 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	astore_7 
	aload_6 
	iconst_1 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	astore 8
	iload_3 
	aload_7 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	invokestatic_lib int max( int, int ) // Math
	istore_3 
	iload_4 
	aload 8
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	aload 8
	invokevirtual int getMarginLeft( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	aload 8
	invokevirtual int getMarginRight( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	aload_6 
	invokevirtual int getMarginLeft( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	aload_6 
	invokevirtual int getMarginRight( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	invokestatic_lib int max( int, int ) // Math
	istore_4 
	iinc 5 1
	goto Label36
Label76:
	iload_3 
	iload_4 
	iadd 
	iload_1 
	if_icmplt Label83
	iconst_1 
	goto Label84
Label83:
	iconst_0 
Label84:
	istore_5 
	iconst_0 
	istore_6 
Label87:
	iload_6 
	aload_0_getfield com.whatsapp.client.AccountScreen.field_49204   // get_name_1:  com.whatsapp.client.AccountScreen.field_49204   // get_name_2:  com.whatsapp.client.AccountScreen.field_49204   // get_Name:    com.whatsapp.client.AccountScreen.field_49204   // getName->1:     // getName->2:     // getName->N:     // ofs = 49204 ord = 3 addr = 0
	arraylength 
	if_icmpge Label124
	aload_0_getfield com.whatsapp.client.AccountScreen.field_49204   // get_name_1:  com.whatsapp.client.AccountScreen.field_49204   // get_name_2:  com.whatsapp.client.AccountScreen.field_49204   // get_Name:    com.whatsapp.client.AccountScreen.field_49204   // getName->1:     // getName->2:     // getName->N:     // ofs = 49204 ord = 3 addr = 0
	iload_6 
	aaload 
	iconst_0 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	astore_7 
	new_lib net.rim.device.api.ui.component.ActiveRichTextField//net.rim.device.api.ui.component.ActiveRichTextField net.rim.device.api.ui.component.ActiveRichTextField net.rim.device.api.ui.component.ActiveRichTextField
	dup 
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=1
	astore 8
	aload_7 
	aload 8
	invokevirtual getMargin( net.rim.device.api.ui.Field, net.rim.device.api.ui.XYEdges ) // pc=2
	iload_5 
	ifeq Label113
	aload 8
	iload_1 
	aload_7 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	isub 
	putfield right   // get_name_1:  right   // get_name_2:  right   // get_Name:    right   // getName->1:  right   // getName->2:  right   // getName->N:  right   // ofs = -1 ord = 1 addr = -1
	goto Label119
Label113:
	aload 8
	iload_3 
	aload_7 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	isub 
	putfield left   // get_name_1:  left   // get_name_2:  left   // get_Name:    left   // getName->1:  left   // getName->2:  left   // getName->N:  left   // ofs = -1 ord = 0 addr = -1
Label119:
	aload_7 
	aload 8
	invokevirtual setMargin( net.rim.device.api.ui.Field, net.rim.device.api.ui.XYEdges ) // pc=2
	iinc 6 1
	goto Label87
Label124:
	aload_0 
	iload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.container.FullScreen.sublayout // pc=3
	return 
	}


protected final makeMenu( com.whatsapp.client.AccountScreen, net.rim.device.api.ui.component.Menu, int ); // address: 0
	{
	enter 
	iload_2 
	ifne Label28
	aload_0 
	aload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.Screen.makeMenu // pc=3
	aload_0_getfield com.whatsapp.client.AccountScreen.field_49196   // get_name_1:  com.whatsapp.client.AccountScreen.field_49196   // get_name_2:  com.whatsapp.client.AccountScreen.field_49196   // get_Name:    com.whatsapp.client.AccountScreen.field_49196   // getName->1:     // getName->2:     // getName->N:     // ofs = 49196 ord = 1 addr = 0
	ifnull Label25
	aload_0_getfield com.whatsapp.client.AccountScreen.field_49196   // get_name_1:  com.whatsapp.client.AccountScreen.field_49196   // get_name_2:  com.whatsapp.client.AccountScreen.field_49196   // get_Name:    com.whatsapp.client.AccountScreen.field_49196   // getName->1:     // getName->2:     // getName->N:     // ofs = 49196 ord = 1 addr = 0
	invokevirtual net.rim.device.api.ui.Manager getManager( net.rim.device.api.ui.Field ) // pc=1
	ifnull Label25
	iconst_0 
	istore_3 
Label14:
	iload_3 
	aload_0_getfield com.whatsapp.client.AccountScreen.field_49208   // get_name_1:  com.whatsapp.client.AccountScreen.field_49208   // get_name_2:  com.whatsapp.client.AccountScreen.field_49208   // get_Name:    com.whatsapp.client.AccountScreen.field_49208   // getName->1:     // getName->2:     // getName->N:     // ofs = 49208 ord = 4 addr = 0
	arraylength 
	if_icmpge Label25
	aload_1 
	aload_0_getfield com.whatsapp.client.AccountScreen.field_49208   // get_name_1:  com.whatsapp.client.AccountScreen.field_49208   // get_name_2:  com.whatsapp.client.AccountScreen.field_49208   // get_Name:    com.whatsapp.client.AccountScreen.field_49208   // getName->1:     // getName->2:     // getName->N:     // ofs = 49208 ord = 4 addr = 0
	iload_3 
	aaload 
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	iinc 3 1
	goto Label14
Label25:
	aload_1 
	aload_0_getfield com.whatsapp.client.AccountScreen.field_49212   // get_name_1:  com.whatsapp.client.AccountScreen.field_49212   // get_name_2:  com.whatsapp.client.AccountScreen.field_49212   // get_Name:    com.whatsapp.client.AccountScreen.field_49212   // getName->1:     // getName->2:     // getName->N:     // ofs = 49212 ord = 5 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label28:
	return 
	}

}
