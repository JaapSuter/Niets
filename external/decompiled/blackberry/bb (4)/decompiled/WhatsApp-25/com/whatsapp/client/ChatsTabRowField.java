// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-11.cod
// Module version  : 2.7.3204
// Class ID        : 19
// ########################################################


package com.whatsapp.client;


abstract public final class ChatsTabRowField extends net.rim.device.api.ui.Field
implements com.whatsapp.client.AnimatedSliderManager$IncrementalUpdate

{

	// @@@@@@@@@@@@@ Fields 
	private int /*int*/  field_54272 ; // ofs = 54272 addr = 0)
	private com.whatsapp.client.ChatHistory /*module:WhatsApp-9.class#15*/  field_54276 ; // ofs = 54276 addr = 0)
	private String /*java.lang.String*/  field_54280 ; // ofs = 54280 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.ChatsTabRowField, module:WhatsApp-9.class#15, module:WhatsApp-16.class#28, long ); // address: 0
	{
	enter 
	aload_0 
	lload 3
	invokespecial_lib net.rim.device.api.ui.Field.<init> // pc=3
	aload_0 
	aload_1 
	putfield com.whatsapp.client.ChatsTabRowField.field_54276   // get_name_1:  com.whatsapp.client.ChatsTabRowField.field_54276   // get_name_2:  com.whatsapp.client.ChatsTabRowField.field_54276   // get_Name:    com.whatsapp.client.ChatsTabRowField.field_54276   // getName->1:     // getName->2:     // getName->N:     // ofs = 54276 ord = 1 addr = 0
	aload_0 
	aload_2 
	invokestatic java.lang.String getPreviewText( module:WhatsApp-16.class#28 ) // ChatsTabButton
	putfield com.whatsapp.client.ChatsTabRowField.field_54280   // get_name_1:  com.whatsapp.client.ChatsTabRowField.field_54280   // get_name_2:  com.whatsapp.client.ChatsTabRowField.field_54280   // get_Name:    com.whatsapp.client.ChatsTabRowField.field_54280   // getName->1:     // getName->2:     // getName->N:     // ofs = 54280 ord = 2 addr = 0
	aload_0 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	invokestatic_lib com.whatsapp.client.TabButton.routine_8667(  ) // TabButton
	putfield com.whatsapp.client.ChatsTabRowField.field_54272   // get_name_1:  com.whatsapp.client.ChatsTabRowField.field_54272   // get_name_2:  com.whatsapp.client.ChatsTabRowField.field_54272   // get_Name:    com.whatsapp.client.ChatsTabRowField.field_54272   // getName->1:     // getName->2:     // getName->N:     // ofs = 54272 ord = 0 addr = 0
	aload_2 
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	bipush 7
	if_icmpeq Label36
	aload_0_getfield com.whatsapp.client.ChatsTabRowField.field_54276   // get_name_1:  com.whatsapp.client.ChatsTabRowField.field_54276   // get_name_2:  com.whatsapp.client.ChatsTabRowField.field_54276   // get_Name:    com.whatsapp.client.ChatsTabRowField.field_54276   // getName->1:     // getName->2:     // getName->N:     // ofs = 54276 ord = 1 addr = 0
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnull Label36
	aload_2 
	ifnull Label36
	aload_2 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	ifnull Label36
	aload_0 
	bipush 74
	aload_2 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokestatic_lib module:WhatsApp-9.class#15.routine_8287(  ) // class#15
	aload_0_getfield com.whatsapp.client.ChatsTabRowField.field_54280   // get_name_1:  com.whatsapp.client.ChatsTabRowField.field_54280   // get_name_2:  com.whatsapp.client.ChatsTabRowField.field_54280   // get_Name:    com.whatsapp.client.ChatsTabRowField.field_54280   // getName->1:     // getName->2:     // getName->N:     // ofs = 54280 ord = 2 addr = 0
	invokestatic_lib module:WhatsApp-28.class#18.routine_4780(  ) // class#18
	putfield com.whatsapp.client.ChatsTabRowField.field_54280   // get_name_1:  com.whatsapp.client.ChatsTabRowField.field_54280   // get_name_2:  com.whatsapp.client.ChatsTabRowField.field_54280   // get_Name:    com.whatsapp.client.ChatsTabRowField.field_54280   // getName->1:     // getName->2:     // getName->N:     // ofs = 54280 ord = 2 addr = 0
Label36:
	return 
	}


public <init>( com.whatsapp.client.ChatsTabRowField, module:WhatsApp-9.class#15, module:WhatsApp-16.class#28 ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	aload_2 
	iconst_0 
	i2l 
	invokespecial com.whatsapp.client.ChatsTabRowField.<init> // pc=5
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final boolean keyChar( com.whatsapp.client.ChatsTabRowField, char, int, int ); // address: 0
	{
	enter 
	iload_1 
	bipush 10
	if_icmpne Label9
	aload_0 
	iconst_0 
	invokevirtual fieldChangeNotify( net.rim.device.api.ui.Field, int ) // pc=2
	iconst_1 
	ireturn 
Label9:
	iconst_0 
	ireturn 
	}


protected final boolean navigationClick( com.whatsapp.client.ChatsTabRowField, int, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_0 
	invokevirtual fieldChangeNotify( net.rim.device.api.ui.Field, int ) // pc=2
	iconst_1 
	ireturn 
	}


protected final layout( com.whatsapp.client.ChatsTabRowField, int, int ); // address: 0
	{
	enter 
	aload_0 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	invokestatic_lib com.whatsapp.client.TabButton.routine_8667(  ) // TabButton
	putfield com.whatsapp.client.ChatsTabRowField.field_54272   // get_name_1:  com.whatsapp.client.ChatsTabRowField.field_54272   // get_name_2:  com.whatsapp.client.ChatsTabRowField.field_54272   // get_Name:    com.whatsapp.client.ChatsTabRowField.field_54272   // getName->1:     // getName->2:     // getName->N:     // ofs = 54272 ord = 0 addr = 0
	aload_0 
	iload_1 
	aload_0_getfield com.whatsapp.client.ChatsTabRowField.field_54272   // get_name_1:  com.whatsapp.client.ChatsTabRowField.field_54272   // get_name_2:  com.whatsapp.client.ChatsTabRowField.field_54272   // get_Name:    com.whatsapp.client.ChatsTabRowField.field_54272   // getName->1:     // getName->2:     // getName->N:     // ofs = 54272 ord = 0 addr = 0
	iload_2 
	invokestatic_lib int min( int, int ) // Math
	invokevirtual setExtent( net.rim.device.api.ui.Field, int, int ) // pc=3
	return 
	}


protected final paint( com.whatsapp.client.ChatsTabRowField, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter 
	aload_1 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	iconst_0 
	aload_0_getfield com.whatsapp.client.ChatsTabRowField.field_54276   // get_name_1:  com.whatsapp.client.ChatsTabRowField.field_54276   // get_name_2:  com.whatsapp.client.ChatsTabRowField.field_54276   // get_Name:    com.whatsapp.client.ChatsTabRowField.field_54276   // getName->1:     // getName->2:     // getName->N:     // ofs = 54276 ord = 1 addr = 0
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	aload_0_getfield com.whatsapp.client.ChatsTabRowField.field_54280   // get_name_1:  com.whatsapp.client.ChatsTabRowField.field_54280   // get_name_2:  com.whatsapp.client.ChatsTabRowField.field_54280   // get_Name:    com.whatsapp.client.ChatsTabRowField.field_54280   // getName->1:     // getName->2:     // getName->N:     // ofs = 54280 ord = 2 addr = 0
	aconst_null 
	aload_0 
	invokevirtual boolean isFocus( net.rim.device.api.ui.Field ) // pc=1
	iconst_1 
	invokestatic drawListRow( net.rim.device.api.ui.Graphics, int, int, int, module:WhatsApp-9.class#15, java.lang.String, java.lang.String, module:WhatsApp-16.class#28, boolean, boolean ) // ChatsTabButton
	return 
	}


protected final paintBackground( com.whatsapp.client.ChatsTabRowField, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter_narrow 
	aload_1 
	aload_0 
	invokevirtual boolean isFocus( net.rim.device.api.ui.Field ) // pc=1
	ifeq Label7
	sipush 255
	goto Label8
Label7:
	iipush 16777215
Label8:
	invokevirtual setBackgroundColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	invokevirtual clear( net.rim.device.api.ui.Graphics ) // pc=1
	aload_0 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.Field.paintBackground // pc=2
	return 
	}


public final boolean update( com.whatsapp.client.ChatsTabRowField, module:WhatsApp-2.class#2 ); // address: 0
	{
	enter_narrow 
	aload_1 
	instanceof ChatsTabRowField
	ifne Label6
	iconst_0 
	ireturn 
Label6:
	aload_1 
	checkcast ChatsTabRowField
	astore_2 
	aload_2 
	getfield com.whatsapp.client.ChatsTabRowField.field_54276   // get_name_1:  com.whatsapp.client.ChatsTabRowField.field_54276   // get_name_2:  com.whatsapp.client.ChatsTabRowField.field_54276   // get_Name:    com.whatsapp.client.ChatsTabRowField.field_54276   // getName->1:     // getName->2:     // getName->N:     // ofs = 54276 ord = 1 addr = 0
	aload_0_getfield com.whatsapp.client.ChatsTabRowField.field_54276   // get_name_1:  com.whatsapp.client.ChatsTabRowField.field_54276   // get_name_2:  com.whatsapp.client.ChatsTabRowField.field_54276   // get_Name:    com.whatsapp.client.ChatsTabRowField.field_54276   // getName->1:     // getName->2:     // getName->N:     // ofs = 54276 ord = 1 addr = 0
	if_acmpeq Label15
	iconst_0 
	ireturn 
Label15:
	aload_0 
	aload_2 
	getfield com.whatsapp.client.ChatsTabRowField.field_54280   // get_name_1:  com.whatsapp.client.ChatsTabRowField.field_54280   // get_name_2:  com.whatsapp.client.ChatsTabRowField.field_54280   // get_Name:    com.whatsapp.client.ChatsTabRowField.field_54280   // getName->1:     // getName->2:     // getName->N:     // ofs = 54280 ord = 2 addr = 0
	putfield com.whatsapp.client.ChatsTabRowField.field_54280   // get_name_1:  com.whatsapp.client.ChatsTabRowField.field_54280   // get_name_2:  com.whatsapp.client.ChatsTabRowField.field_54280   // get_Name:    com.whatsapp.client.ChatsTabRowField.field_54280   // getName->1:     // getName->2:     // getName->N:     // ofs = 54280 ord = 2 addr = 0
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Field ) // pc=1
	iconst_1 
	ireturn 
	}

}
