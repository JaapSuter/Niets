// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp.cod
// Module version  : 2.7.3204
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


abstract final class AccountScreen extends com.whatsapp.field.WAMainScreen

{
	// @@@@@@@@@@@@@ Static fields 
	public static net.rim.device.api.i18n.DateFormat /*net.rim.device.api.i18n.DateFormat*/  expireFmt ; // ofs = 53932 addr = 2)

	// @@@@@@@@@@@@@ Fields 
	private com.whatsapp.client.IconTextListField$Item /*module:WhatsApp-19.class#14[]*/  field_53916 ; // ofs = 53916 addr = 0)
	private net.rim.device.api.ui.component.ListField /*net.rim.device.api.ui.component.ListField*/  field_53920 ; // ofs = 53920 addr = 0)
	private boolean /*boolean*/  field_53924 ; // ofs = 53924 addr = 0)
	private net.rim.device.api.ui.Manager /*net.rim.device.api.ui.Manager[]*/  field_53928 ; // ofs = 53928 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.AccountScreen ); // address: 0
	{
	enter 
	aload_0 
	iipush 262144
	i2l 
	invokespecial_lib .routine_272 // pc=3
	aload_0 
	bipush 2
	newarray_object_lib com.whatsapp.client.IconTextListField$Item//module:WhatsApp-19.class#14 module:WhatsApp-19.class#14 module:WhatsApp-19.class#14
	dup 
	iconst_0 
	new_lib com.whatsapp.client.AccountScreen$1//module:WhatsApp-43.class#12 module:WhatsApp-43.class#12 module:WhatsApp-43.class#12
	dup 
	aload_0 
	ldc literal_49:"icon-pay.png"
	sipush 308
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	sipush 892
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokespecial_lib .routine_2975 // pc=5
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.AccountScreen$2//module:WhatsApp-43.class#13 module:WhatsApp-43.class#13 module:WhatsApp-43.class#13
	dup 
	aload_0 
	ldc literal_50:"icon-email.png"
	sipush 315
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	sipush 603
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokespecial_lib .routine_3020 // pc=5
	aastore 
	putfield com.whatsapp.client.AccountScreen.field_53916   // get_name_1:  com.whatsapp.client.AccountScreen.field_53916   // get_name_2:  com.whatsapp.client.AccountScreen.field_53916   // get_Name:    com.whatsapp.client.AccountScreen.field_53916   // getName->1:     // getName->2:     // getName->N:     // ofs = 53916 ord = 0 addr = 0
	aload_0 
	invokestatic_lib module:WhatsApp-35.class#0.routine_5461(  ) // class#0
	invokevirtual setTitleBar( net.rim.device.api.ui.Screen, net.rim.device.api.ui.component.TitleBar ) // pc=2
	aload_0 
	invokestatic_lib module:WhatsApp-7.class#22.routine_4386(  ) // class#22
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	invokestatic_lib module:WhatsApp-10.class#31.routine_5592(  ) // class#31
	astore_1 
	iipush 3355443
	istore_3 
	iconst_0 
	istore_4 
	aload_1 
	lgetfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	iconst_0 
	i2l 
	lcmp 
	ifle Label62
	aload_1 
	lgetfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	invokestatic_lib long currentTimeMillis(  ) // System
	lcmp 
	ifge Label62
	sipush 310
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	astore_2 
	iipush 16711680
	istore_3 
	goto Label84
Label62:
	aload_1 
	getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	ifne Label69
	sipush 304
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	astore_2 
	goto Label84
Label69:
	aload_1 
	getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	iconst_1 
	if_icmpne Label79
	sipush 303
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	astore_2 
	iipush 2205186
	istore_3 
	goto Label84
Label79:
	sipush 306
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	astore_2 
	iconst_1 
	istore_4 
Label84:
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	lipush 18014398509481984
	invokespecial_lib net.rim.device.api.ui.component.NullField.<init> // pc=3
	astore_5 
	aload_0 
	aload_5 
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	new_lib com.whatsapp.field.WAHorizontalFieldManager//com.whatsapp.field.WAHorizontalFieldManager com.whatsapp.field.WAHorizontalFieldManager com.whatsapp.field.WAHorizontalFieldManager
	dup 
	invokespecial_lib .routine_10870 // pc=1
	astore_6 
	aload_6 
	iconst_1 
	invokenonvirtual_lib .routine_9976 // pc=2
	new_lib com.whatsapp.field.ColorLabelField//com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField
	dup 
	sipush 312
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	iipush 16777215
	lipush 1152921504606846976
	invokespecial_lib .routine_3777 // pc=5
	astore_7 
	aload_7 
	bipush 12
	bipush 18
	bipush 12
	bipush 18
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_6 
	aload_7 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	new_lib com.whatsapp.field.ColorLabelField//com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField
	dup 
	iload_4 
	ifeq Label123
	sipush 300
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	goto Label124
Label123:
	aload_2 
Label124:
	iipush 8421504
	invokespecial_lib .routine_3724 // pc=3
	astore 8
	aload 8
	bipush 12
	bipush 18
	bipush 12
	bipush 18
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_6 
	aload 8
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_6 
	invokestatic_lib module:WhatsApp-35.class#0.routine_5692(  ) // class#0
	aload_7 
	aload_6 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	invokevirtual setFont( net.rim.device.api.ui.Field, net.rim.device.api.ui.Font ) // pc=2
	aload_6 
	aconst_null 
	invokevirtual setFont( net.rim.device.api.ui.Field, net.rim.device.api.ui.Font ) // pc=2
	aload_6 
	iconst_0 
	iconst_0 
	iconst_0 
	iconst_0 
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	aload_6 
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	invokestatic_lib module:WhatsApp-27.class#8.routine_2921(  ) // class#8
	astore 9
	aload 9
	invokenonvirtual_lib .routine_2301 // pc=1
	astore 10
	sipush 305
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	aload_2 
	iload_3 
	invokestatic net.rim.device.api.ui.Manager com.whatsapp.client.AccountScreen.routine_1054( java.lang.String, java.lang.String, int ) // AccountScreen
	astore 11
	aload_0 
	aload 11
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	astore 13
	aload_1 
	lgetfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	iconst_0 
	i2l 
	lcmp 
	ifle Label182
	getstatic expireFmt // AccountScreen
	aload_1 
	lgetfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	invokevirtual java.lang.String formatLocal( net.rim.device.api.i18n.DateFormat, long ) // pc=3
	astore 13
Label182:
	sipush 307
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	astore 12
	aload 12
	aload 13
	iipush 3355443
	invokestatic net.rim.device.api.ui.Manager com.whatsapp.client.AccountScreen.routine_1054( java.lang.String, java.lang.String, int ) // AccountScreen
	astore 14
	aload_0 
	aload 14
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	bipush 74
	sipush 316
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokestatic_lib module:WhatsApp-28.class#18.routine_4780(  ) // class#18
	astore 15
	aload 15
	new_lib net.rim.device.api.ui.decor.Background//net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	bipush 43
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	aload 10
	invokenonvirtual com.whatsapp.client.ApplicationHashData.getChatUserID // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	iipush 3355443
	invokestatic net.rim.device.api.ui.Manager com.whatsapp.client.AccountScreen.routine_1054( java.lang.String, java.lang.String, int ) // AccountScreen
	astore 16
	aload_0 
	aload 16
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	bipush 3
	newarray_object_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	iconst_0 
	aload 11
	aastore 
	dup 
	iconst_1 
	aload 14
	aastore 
	dup 
	bipush 2
	aload 16
	aastore 
	putfield com.whatsapp.client.AccountScreen.field_53928   // get_name_1:  com.whatsapp.client.AccountScreen.field_53928   // get_name_2:  com.whatsapp.client.AccountScreen.field_53928   // get_Name:    com.whatsapp.client.AccountScreen.field_53928   // getName->1:     // getName->2:     // getName->N:     // ofs = 53928 ord = 3 addr = 0
	aload_0 
	aload_1 
	getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	ifeq Label250
	aload_1 
	lgetfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	iconst_0 
	i2l 
	lcmp 
	ifeq Label250
	aload_1 
	lgetfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	invokestatic_lib long currentTimeMillis(  ) // System
	lsub 
	iipush 1209600000
	i2l 
	lcmp 
	ifge Label252
Label250:
	iconst_1 
	goto Label253
Label252:
	iconst_0 
Label253:
	putfield com.whatsapp.client.AccountScreen.field_53924   // get_name_1:  com.whatsapp.client.AccountScreen.field_53924   // get_name_2:  com.whatsapp.client.AccountScreen.field_53924   // get_Name:    com.whatsapp.client.AccountScreen.field_53924   // getName->1:     // getName->2:     // getName->N:     // ofs = 53924 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.client.AccountScreen.field_53924   // get_name_1:  com.whatsapp.client.AccountScreen.field_53924   // get_name_2:  com.whatsapp.client.AccountScreen.field_53924   // get_Name:    com.whatsapp.client.AccountScreen.field_53924   // getName->1:     // getName->2:     // getName->N:     // ofs = 53924 ord = 2 addr = 0
	ifne Label262
	aload_0 
	new_lib Math//java.lang.Math java.lang.Math java.lang.Math
	dup 
	invokespecial_lib net.rim.device.api.ui.component.SeparatorField.<init> // pc=1
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	goto Label281
Label262:
	aload_0 
	new_lib com.whatsapp.client.IconTextListField//module:WhatsApp-19.class#13 module:WhatsApp-19.class#13 module:WhatsApp-19.class#13
	dup 
	aload_0_getfield com.whatsapp.client.AccountScreen.field_53916   // get_name_1:  com.whatsapp.client.AccountScreen.field_53916   // get_name_2:  com.whatsapp.client.AccountScreen.field_53916   // get_Name:    com.whatsapp.client.AccountScreen.field_53916   // getName->1:     // getName->2:     // getName->N:     // ofs = 53916 ord = 0 addr = 0
	invokespecial_lib .routine_7754 // pc=2
	putfield com.whatsapp.client.AccountScreen.field_53920   // get_name_1:  com.whatsapp.client.AccountScreen.field_53920   // get_name_2:  com.whatsapp.client.AccountScreen.field_53920   // get_Name:    com.whatsapp.client.AccountScreen.field_53920   // getName->1:     // getName->2:     // getName->N:     // ofs = 53920 ord = 1 addr = 0
	aload_0_getfield com.whatsapp.client.AccountScreen.field_53920   // get_name_1:  com.whatsapp.client.AccountScreen.field_53920   // get_name_2:  com.whatsapp.client.AccountScreen.field_53920   // get_Name:    com.whatsapp.client.AccountScreen.field_53920   // getName->1:     // getName->2:     // getName->N:     // ofs = 53920 ord = 1 addr = 0
	iipush 16777215
	invokestatic_lib net.rim.device.api.ui.decor.Background createSolidBackground( int ) // BackgroundFactory
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	aload_0_getfield com.whatsapp.client.AccountScreen.field_53920   // get_name_1:  com.whatsapp.client.AccountScreen.field_53920   // get_name_2:  com.whatsapp.client.AccountScreen.field_53920   // get_Name:    com.whatsapp.client.AccountScreen.field_53920   // getName->1:     // getName->2:     // getName->N:     // ofs = 53920 ord = 1 addr = 0
	bipush 12
	iconst_0 
	bipush 12
	iconst_0 
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	aload_0_getfield com.whatsapp.client.AccountScreen.field_53920   // get_name_1:  com.whatsapp.client.AccountScreen.field_53920   // get_name_2:  com.whatsapp.client.AccountScreen.field_53920   // get_Name:    com.whatsapp.client.AccountScreen.field_53920   // getName->1:     // getName->2:     // getName->N:     // ofs = 53920 ord = 1 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
Label281:
	new AccountScreen$3
	dup 
	aload_0 
	sipush 331
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	lipush 27021597764222976
	invokespecial com.whatsapp.client.AccountScreen$3.<init> // pc=5
	astore 17
	aload 17
	bipush 12
	bipush 12
	bipush 12
	bipush 12
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	aload 17
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib net.rim.device.api.ui.component.NullField.<init> // pc=1
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_5 
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	return 
	}


static private final net.rim.device.api.ui.Manager com.whatsapp.client.AccountScreen.routine_1054( java.lang.String, java.lang.String, int ); // address: 0
	{
	enter 
	new_lib com.whatsapp.field.ColorLabelField//com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField
	dup 
	aload_0 
	iipush 8947848
	invokespecial_lib .routine_3724 // pc=3
	astore_3 
	new_lib com.whatsapp.field.ColorLabelField//com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField
	dup 
	aload_1 
	iload_2 
	invokespecial_lib .routine_3724 // pc=3
	astore_4 
	aload_4 
	iconst_0 
	bipush 10
	iconst_0 
	bipush 2
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	new_lib net.rim.device.api.ui.component.SeparatorField//net.rim.device.api.ui.component.SeparatorField net.rim.device.api.ui.component.SeparatorField net.rim.device.api.ui.component.SeparatorField
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
	clinit_lib com.whatsapp.field.WAMainScreen//module:WhatsApp-39.class#0 module:WhatsApp-39.class#0 module:WhatsApp-39.class#0
	synch_static AccountScreen
	clinit_wait 
	bipush 48
	invokestatic_lib net.rim.device.api.i18n.DateFormat getInstance( int ) // DateFormat
	putstatic expireFmt // AccountScreen
	clinit_return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final sublayout( com.whatsapp.client.AccountScreen, int, int ); // address: 0
	{
	enter 
	iconst_0 
	istore_3 
Label3:
	iload_3 
	aload_0_getfield com.whatsapp.client.AccountScreen.field_53928   // get_name_1:  com.whatsapp.client.AccountScreen.field_53928   // get_name_2:  com.whatsapp.client.AccountScreen.field_53928   // get_Name:    com.whatsapp.client.AccountScreen.field_53928   // getName->1:     // getName->2:     // getName->N:     // ofs = 53928 ord = 3 addr = 0
	arraylength 
	if_icmpge Label26
	new_lib net.rim.device.api.ui.component.NullField//net.rim.device.api.ui.component.NullField net.rim.device.api.ui.component.NullField net.rim.device.api.ui.component.NullField
	dup 
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=1
	astore_4 
	aload_0_getfield com.whatsapp.client.AccountScreen.field_53928   // get_name_1:  com.whatsapp.client.AccountScreen.field_53928   // get_name_2:  com.whatsapp.client.AccountScreen.field_53928   // get_Name:    com.whatsapp.client.AccountScreen.field_53928   // getName->1:     // getName->2:     // getName->N:     // ofs = 53928 ord = 3 addr = 0
	iload_3 
	aaload 
	aload_4 
	invokevirtual getPadding( net.rim.device.api.ui.Field, net.rim.device.api.ui.XYEdges ) // pc=2
	aload_4 
	iconst_0 
	putfield left   // get_name_1:  left   // get_name_2:  left   // get_Name:    left   // getName->1:  left   // getName->2:  left   // getName->N:  left   // ofs = -1 ord = 0 addr = -1
	aload_0_getfield com.whatsapp.client.AccountScreen.field_53928   // get_name_1:  com.whatsapp.client.AccountScreen.field_53928   // get_name_2:  com.whatsapp.client.AccountScreen.field_53928   // get_Name:    com.whatsapp.client.AccountScreen.field_53928   // getName->1:     // getName->2:     // getName->N:     // ofs = 53928 ord = 3 addr = 0
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
	aload_0_getfield com.whatsapp.client.AccountScreen.field_53928   // get_name_1:  com.whatsapp.client.AccountScreen.field_53928   // get_name_2:  com.whatsapp.client.AccountScreen.field_53928   // get_Name:    com.whatsapp.client.AccountScreen.field_53928   // getName->1:     // getName->2:     // getName->N:     // ofs = 53928 ord = 3 addr = 0
	arraylength 
	if_icmpge Label76
	aload_0_getfield com.whatsapp.client.AccountScreen.field_53928   // get_name_1:  com.whatsapp.client.AccountScreen.field_53928   // get_name_2:  com.whatsapp.client.AccountScreen.field_53928   // get_Name:    com.whatsapp.client.AccountScreen.field_53928   // getName->1:     // getName->2:     // getName->N:     // ofs = 53928 ord = 3 addr = 0
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
	aload_0_getfield com.whatsapp.client.AccountScreen.field_53928   // get_name_1:  com.whatsapp.client.AccountScreen.field_53928   // get_name_2:  com.whatsapp.client.AccountScreen.field_53928   // get_Name:    com.whatsapp.client.AccountScreen.field_53928   // getName->1:     // getName->2:     // getName->N:     // ofs = 53928 ord = 3 addr = 0
	arraylength 
	if_icmpge Label124
	aload_0_getfield com.whatsapp.client.AccountScreen.field_53928   // get_name_1:  com.whatsapp.client.AccountScreen.field_53928   // get_name_2:  com.whatsapp.client.AccountScreen.field_53928   // get_Name:    com.whatsapp.client.AccountScreen.field_53928   // getName->1:     // getName->2:     // getName->N:     // ofs = 53928 ord = 3 addr = 0
	iload_6 
	aaload 
	iconst_0 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	astore_7 
	new_lib net.rim.device.api.ui.component.NullField//net.rim.device.api.ui.component.NullField net.rim.device.api.ui.component.NullField net.rim.device.api.ui.component.NullField
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

}
