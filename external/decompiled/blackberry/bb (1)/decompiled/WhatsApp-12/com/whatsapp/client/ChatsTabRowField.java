// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-12.cod
// Module version  : 2.7.6550
// Class ID        : 10
// ########################################################


package com.whatsapp.client;


abstract public final class ChatsTabRowField extends net.rim.device.api.ui.Field
implements com.rim.resources.

{

	// @@@@@@@@@@@@@ Fields 
	private int /*int*/  field_39236 ; // ofs = 39236 addr = 0)
	private com.whatsapp.client.BluetoothControl$4 /*module:WhatsApp-9.class#10*/  field_39240 ; // ofs = 39240 addr = 0)
	private String /*java.lang.String*/  field_39244 ; // ofs = 39244 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.ChatsTabRowField, module:WhatsApp-9.class#10, module:WhatsApp-15.class#21, long ); // address: 0
	{
	enter 
	aload_0 
	lload 3
	invokespecial_lib net.rim.device.api.ui.Field.<init> // pc=3
	aload_0 
	aload_1 
	putfield com.whatsapp.client.ChatsTabRowField.field_39240   // get_name_1:  com.whatsapp.client.ChatsTabRowField.field_39240   // get_name_2:  com.whatsapp.client.ChatsTabRowField.field_39240   // get_Name:    com.whatsapp.client.ChatsTabRowField.field_39240   // getName->1:     // getName->2:     // getName->N:     // ofs = 39240 ord = 1 addr = 0
	aload_0 
	aload_2 
	invokestatic_lib module:WhatsApp-11.class#17.routine_7699(  ) // class#17
	putfield com.whatsapp.client.ChatsTabRowField.field_39244   // get_name_1:  com.whatsapp.client.ChatsTabRowField.field_39244   // get_name_2:  com.whatsapp.client.ChatsTabRowField.field_39244   // get_Name:    com.whatsapp.client.ChatsTabRowField.field_39244   // getName->1:     // getName->2:     // getName->N:     // ofs = 39244 ord = 2 addr = 0
	aload_0 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	invokestatic_lib com.whatsapp.client.TabButton.routine_4873(  ) // TabButton
	putfield com.whatsapp.client.ChatsTabRowField.field_39236   // get_name_1:  com.whatsapp.client.ChatsTabRowField.field_39236   // get_name_2:  com.whatsapp.client.ChatsTabRowField.field_39236   // get_Name:    com.whatsapp.client.ChatsTabRowField.field_39236   // getName->1:     // getName->2:     // getName->N:     // ofs = 39236 ord = 0 addr = 0
	aload_2 
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	bipush 7
	if_icmpeq Label35
	aload_0_getfield com.whatsapp.client.ChatsTabRowField.field_39240   // get_name_1:  com.whatsapp.client.ChatsTabRowField.field_39240   // get_name_2:  com.whatsapp.client.ChatsTabRowField.field_39240   // get_Name:    com.whatsapp.client.ChatsTabRowField.field_39240   // getName->1:     // getName->2:     // getName->N:     // ofs = 39240 ord = 1 addr = 0
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
	invokestatic_lib module:WhatsApp-9.class#10.routine_5136(  ) // class#10
	aload_0_getfield com.whatsapp.client.ChatsTabRowField.field_39244   // get_name_1:  com.whatsapp.client.ChatsTabRowField.field_39244   // get_name_2:  com.whatsapp.client.ChatsTabRowField.field_39244   // get_Name:    com.whatsapp.client.ChatsTabRowField.field_39244   // getName->1:     // getName->2:     // getName->N:     // ofs = 39244 ord = 2 addr = 0
	invokestatic_lib module:WhatsApp-35.class#1.routine_6672(  ) // class#1
	putfield com.whatsapp.client.ChatsTabRowField.field_39244   // get_name_1:  com.whatsapp.client.ChatsTabRowField.field_39244   // get_name_2:  com.whatsapp.client.ChatsTabRowField.field_39244   // get_Name:    com.whatsapp.client.ChatsTabRowField.field_39244   // getName->1:     // getName->2:     // getName->N:     // ofs = 39244 ord = 2 addr = 0
Label35:
	return 
	}


public <init>( com.whatsapp.client.ChatsTabRowField, module:WhatsApp-9.class#10, module:WhatsApp-15.class#21 ); // address: 0
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
	invokestatic_lib com.whatsapp.client.TabButton.routine_4873(  ) // TabButton
	putfield com.whatsapp.client.ChatsTabRowField.field_39236   // get_name_1:  com.whatsapp.client.ChatsTabRowField.field_39236   // get_name_2:  com.whatsapp.client.ChatsTabRowField.field_39236   // get_Name:    com.whatsapp.client.ChatsTabRowField.field_39236   // getName->1:     // getName->2:     // getName->N:     // ofs = 39236 ord = 0 addr = 0
	aload_0 
	iload_1 
	aload_0_getfield com.whatsapp.client.ChatsTabRowField.field_39236   // get_name_1:  com.whatsapp.client.ChatsTabRowField.field_39236   // get_name_2:  com.whatsapp.client.ChatsTabRowField.field_39236   // get_Name:    com.whatsapp.client.ChatsTabRowField.field_39236   // getName->1:     // getName->2:     // getName->N:     // ofs = 39236 ord = 0 addr = 0
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
	aload_0_getfield com.whatsapp.client.ChatsTabRowField.field_39240   // get_name_1:  com.whatsapp.client.ChatsTabRowField.field_39240   // get_name_2:  com.whatsapp.client.ChatsTabRowField.field_39240   // get_Name:    com.whatsapp.client.ChatsTabRowField.field_39240   // getName->1:     // getName->2:     // getName->N:     // ofs = 39240 ord = 1 addr = 0
	getstatic STRING_EMPTY_STRING // Constants
	aload_0_getfield com.whatsapp.client.ChatsTabRowField.field_39244   // get_name_1:  com.whatsapp.client.ChatsTabRowField.field_39244   // get_name_2:  com.whatsapp.client.ChatsTabRowField.field_39244   // get_Name:    com.whatsapp.client.ChatsTabRowField.field_39244   // getName->1:     // getName->2:     // getName->N:     // ofs = 39244 ord = 2 addr = 0
	aconst_null 
	aload_0 
	invokevirtual boolean isFocus( net.rim.device.api.ui.Field ) // pc=1
	iconst_1 
	invokestatic_lib module:WhatsApp-11.class#17.routine_5151(  ) // class#17
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


public final boolean update( com.whatsapp.client.ChatsTabRowField, module:WhatsApp.class#19 ); // address: 0
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
	getfield com.whatsapp.client.ChatsTabRowField.field_39240   // get_name_1:  com.whatsapp.client.ChatsTabRowField.field_39240   // get_name_2:  com.whatsapp.client.ChatsTabRowField.field_39240   // get_Name:    com.whatsapp.client.ChatsTabRowField.field_39240   // getName->1:     // getName->2:     // getName->N:     // ofs = 39240 ord = 1 addr = 0
	aload_0_getfield com.whatsapp.client.ChatsTabRowField.field_39240   // get_name_1:  com.whatsapp.client.ChatsTabRowField.field_39240   // get_name_2:  com.whatsapp.client.ChatsTabRowField.field_39240   // get_Name:    com.whatsapp.client.ChatsTabRowField.field_39240   // getName->1:     // getName->2:     // getName->N:     // ofs = 39240 ord = 1 addr = 0
	if_acmpeq Label15
	iconst_0 
	ireturn 
Label15:
	aload_0 
	aload_2 
	getfield com.whatsapp.client.ChatsTabRowField.field_39244   // get_name_1:  com.whatsapp.client.ChatsTabRowField.field_39244   // get_name_2:  com.whatsapp.client.ChatsTabRowField.field_39244   // get_Name:    com.whatsapp.client.ChatsTabRowField.field_39244   // getName->1:     // getName->2:     // getName->N:     // ofs = 39244 ord = 2 addr = 0
	putfield com.whatsapp.client.ChatsTabRowField.field_39244   // get_name_1:  com.whatsapp.client.ChatsTabRowField.field_39244   // get_name_2:  com.whatsapp.client.ChatsTabRowField.field_39244   // get_Name:    com.whatsapp.client.ChatsTabRowField.field_39244   // getName->1:     // getName->2:     // getName->N:     // ofs = 39244 ord = 2 addr = 0
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Field ) // pc=1
	iconst_1 
	ireturn 
	}

}
