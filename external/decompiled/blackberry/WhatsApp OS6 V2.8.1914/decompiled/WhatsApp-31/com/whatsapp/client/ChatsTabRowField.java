// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-17.cod
// Module version  : 2.8.1914
// Class ID        : 4
// ########################################################


package com.whatsapp.client;


abstract public final class ChatsTabRowField extends net.rim.device.api.ui.Field
implements com.whatsapp.client.AnimatedSliderManager$IncrementalUpdate

{

	// @@@@@@@@@@@@@ Fields 
	private int /*int*/  field_55168 ; // ofs = 55168 addr = 0)
	private com.whatsapp.client. /*module:WhatsApp-11.class#1*/  field_55172 ; // ofs = 55172 addr = 0)
	private String /*java.lang.String*/  field_55176 ; // ofs = 55176 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.ChatsTabRowField, module:WhatsApp-11.class#1, module:WhatsApp-26.class#23, long ); // address: 0
	{
	enter 
	aload_0 
	lload 3
	invokespecial_lib net.rim.device.api.ui.Field.<init> // pc=3
	aload_0 
	aload_1 
	putfield com.whatsapp.client.ChatsTabRowField.field_55172   // get_name_1:  com.whatsapp.client.ChatsTabRowField.field_55172   // get_name_2:  com.whatsapp.client.ChatsTabRowField.field_55172   // get_Name:    com.whatsapp.client.ChatsTabRowField.field_55172   // getName->1:     // getName->2:     // getName->N:     // ofs = 55172 ord = 1 addr = 0
	aload_0 
	aload_2 
	invokestatic_lib module:WhatsApp-15.class#2.routine_7793(  ) // class#2
	putfield com.whatsapp.client.ChatsTabRowField.field_55176   // get_name_1:  com.whatsapp.client.ChatsTabRowField.field_55176   // get_name_2:  com.whatsapp.client.ChatsTabRowField.field_55176   // get_Name:    com.whatsapp.client.ChatsTabRowField.field_55176   // getName->1:     // getName->2:     // getName->N:     // ofs = 55176 ord = 2 addr = 0
	aload_0 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	invokestatic_lib module:WhatsApp-50.class#3.routine_6475(  ) // class#3
	putfield com.whatsapp.client.ChatsTabRowField.field_55168   // get_name_1:  com.whatsapp.client.ChatsTabRowField.field_55168   // get_name_2:  com.whatsapp.client.ChatsTabRowField.field_55168   // get_Name:    com.whatsapp.client.ChatsTabRowField.field_55168   // getName->1:     // getName->2:     // getName->N:     // ofs = 55168 ord = 0 addr = 0
	aload_2 
	getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	bipush 7
	if_icmpeq Label35
	aload_0_getfield com.whatsapp.client.ChatsTabRowField.field_55172   // get_name_1:  com.whatsapp.client.ChatsTabRowField.field_55172   // get_name_2:  com.whatsapp.client.ChatsTabRowField.field_55172   // get_Name:    com.whatsapp.client.ChatsTabRowField.field_55172   // getName->1:     // getName->2:     // getName->N:     // ofs = 55172 ord = 1 addr = 0
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifnull Label35
	aload_2 
	ifnull Label35
	aload_2 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	ifnull Label35
	aload_0 
	aload_2 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokestatic_lib module:WhatsApp-11.class#1.routine_2039(  ) // class#1
	aload_0_getfield com.whatsapp.client.ChatsTabRowField.field_55176   // get_name_1:  com.whatsapp.client.ChatsTabRowField.field_55176   // get_name_2:  com.whatsapp.client.ChatsTabRowField.field_55176   // get_Name:    com.whatsapp.client.ChatsTabRowField.field_55176   // getName->1:     // getName->2:     // getName->N:     // ofs = 55176 ord = 2 addr = 0
	invokestatic_lib module:WhatsApp-79.class#39.routine_30066(  ) // class#39
	putfield com.whatsapp.client.ChatsTabRowField.field_55176   // get_name_1:  com.whatsapp.client.ChatsTabRowField.field_55176   // get_name_2:  com.whatsapp.client.ChatsTabRowField.field_55176   // get_Name:    com.whatsapp.client.ChatsTabRowField.field_55176   // getName->1:     // getName->2:     // getName->N:     // ofs = 55176 ord = 2 addr = 0
Label35:
	return 
	}


public <init>( com.whatsapp.client.ChatsTabRowField, module:WhatsApp-11.class#1, module:WhatsApp-26.class#23 ); // address: 0
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
	invokestatic_lib module:WhatsApp-50.class#3.routine_6475(  ) // class#3
	putfield com.whatsapp.client.ChatsTabRowField.field_55168   // get_name_1:  com.whatsapp.client.ChatsTabRowField.field_55168   // get_name_2:  com.whatsapp.client.ChatsTabRowField.field_55168   // get_Name:    com.whatsapp.client.ChatsTabRowField.field_55168   // getName->1:     // getName->2:     // getName->N:     // ofs = 55168 ord = 0 addr = 0
	aload_0 
	iload_1 
	aload_0_getfield com.whatsapp.client.ChatsTabRowField.field_55168   // get_name_1:  com.whatsapp.client.ChatsTabRowField.field_55168   // get_name_2:  com.whatsapp.client.ChatsTabRowField.field_55168   // get_Name:    com.whatsapp.client.ChatsTabRowField.field_55168   // getName->1:     // getName->2:     // getName->N:     // ofs = 55168 ord = 0 addr = 0
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
	aload_0_getfield com.whatsapp.client.ChatsTabRowField.field_55172   // get_name_1:  com.whatsapp.client.ChatsTabRowField.field_55172   // get_name_2:  com.whatsapp.client.ChatsTabRowField.field_55172   // get_Name:    com.whatsapp.client.ChatsTabRowField.field_55172   // getName->1:     // getName->2:     // getName->N:     // ofs = 55172 ord = 1 addr = 0
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	aload_0_getfield com.whatsapp.client.ChatsTabRowField.field_55176   // get_name_1:  com.whatsapp.client.ChatsTabRowField.field_55176   // get_name_2:  com.whatsapp.client.ChatsTabRowField.field_55176   // get_Name:    com.whatsapp.client.ChatsTabRowField.field_55176   // getName->1:     // getName->2:     // getName->N:     // ofs = 55176 ord = 2 addr = 0
	aconst_null 
	aload_0 
	invokevirtual boolean isFocus( net.rim.device.api.ui.Field ) // pc=1
	iconst_1 
	invokestatic_lib module:WhatsApp-15.class#2.routine_4325(  ) // class#2
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


public final boolean update( com.whatsapp.client.ChatsTabRowField, module:WhatsApp.class#16 ); // address: 0
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
	getfield com.whatsapp.client.ChatsTabRowField.field_55172   // get_name_1:  com.whatsapp.client.ChatsTabRowField.field_55172   // get_name_2:  com.whatsapp.client.ChatsTabRowField.field_55172   // get_Name:    com.whatsapp.client.ChatsTabRowField.field_55172   // getName->1:     // getName->2:     // getName->N:     // ofs = 55172 ord = 1 addr = 0
	aload_0_getfield com.whatsapp.client.ChatsTabRowField.field_55172   // get_name_1:  com.whatsapp.client.ChatsTabRowField.field_55172   // get_name_2:  com.whatsapp.client.ChatsTabRowField.field_55172   // get_Name:    com.whatsapp.client.ChatsTabRowField.field_55172   // getName->1:     // getName->2:     // getName->N:     // ofs = 55172 ord = 1 addr = 0
	if_acmpeq Label15
	iconst_0 
	ireturn 
Label15:
	aload_0 
	aload_2 
	getfield com.whatsapp.client.ChatsTabRowField.field_55176   // get_name_1:  com.whatsapp.client.ChatsTabRowField.field_55176   // get_name_2:  com.whatsapp.client.ChatsTabRowField.field_55176   // get_Name:    com.whatsapp.client.ChatsTabRowField.field_55176   // getName->1:     // getName->2:     // getName->N:     // ofs = 55176 ord = 2 addr = 0
	putfield com.whatsapp.client.ChatsTabRowField.field_55176   // get_name_1:  com.whatsapp.client.ChatsTabRowField.field_55176   // get_name_2:  com.whatsapp.client.ChatsTabRowField.field_55176   // get_Name:    com.whatsapp.client.ChatsTabRowField.field_55176   // getName->1:     // getName->2:     // getName->N:     // ofs = 55176 ord = 2 addr = 0
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Field ) // pc=1
	iconst_1 
	ireturn 
	}

}
