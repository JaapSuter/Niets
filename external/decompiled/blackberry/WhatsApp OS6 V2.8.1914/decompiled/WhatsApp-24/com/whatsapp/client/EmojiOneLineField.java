// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-24.cod
// Module version  : 2.8.1914
// Class ID        : 11
// ########################################################


package com.whatsapp.client;


abstract public final class EmojiOneLineField extends net.rim.device.api.ui.Field

{

	// @@@@@@@@@@@@@ Fields 
	private String /*java.lang.String*/  field_54286 ; // ofs = 54286 addr = 0)
	private String /*java.lang.String*/  field_54290 ; // ofs = 54290 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.EmojiOneLineField ); // address: 0
	{
	jumpspecial_lib <init>( net.rim.device.api.ui.Field )
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.EmojiOneLineField.routine_2751( com.whatsapp.client.EmojiOneLineField ); // address: 0
	{
	enter 
	aload_0 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	aload_0_getfield com.whatsapp.client.EmojiOneLineField.field_54286   // get_name_1:  com.whatsapp.client.EmojiOneLineField.field_54286   // get_name_2:  com.whatsapp.client.EmojiOneLineField.field_54286   // get_Name:    com.whatsapp.client.EmojiOneLineField.field_54286   // getName->1:     // getName->2:     // getName->N:     // ofs = 54286 ord = 0 addr = 0
	aload_0 
	invokevirtual net.rim.device.api.ui.XYRect getExtent( net.rim.device.api.ui.Field ) // pc=1
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	invokestatic java.lang.String getEllipsisString( net.rim.device.api.ui.Font, java.lang.String, int ) // EmojiUtil
	putfield com.whatsapp.client.EmojiOneLineField.field_54290   // get_name_1:  com.whatsapp.client.EmojiOneLineField.field_54290   // get_name_2:  com.whatsapp.client.EmojiOneLineField.field_54290   // get_Name:    com.whatsapp.client.EmojiOneLineField.field_54290   // getName->1:     // getName->2:     // getName->N:     // ofs = 54290 ord = 1 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final setText( com.whatsapp.client.EmojiOneLineField, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	putfield com.whatsapp.client.EmojiOneLineField.field_54286   // get_name_1:  com.whatsapp.client.EmojiOneLineField.field_54286   // get_name_2:  com.whatsapp.client.EmojiOneLineField.field_54286   // get_Name:    com.whatsapp.client.EmojiOneLineField.field_54286   // getName->1:     // getName->2:     // getName->N:     // ofs = 54286 ord = 0 addr = 0
	aload_0 
	invokespecial com.whatsapp.client.EmojiOneLineField.routine_2751 // pc=1
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Field ) // pc=1
	return 
	}


protected final layout( com.whatsapp.client.EmojiOneLineField, int, int ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	astore_3 
	aload_0 
	invokevirtual int getPaddingTop( net.rim.device.api.ui.Field ) // pc=1
	aload_3 
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	iadd 
	aload_0 
	invokevirtual int getPaddingBottom( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	istore_4 
	aload_0 
	iload_1 
	iload_4 
	invokevirtual setExtent( net.rim.device.api.ui.Field, int, int ) // pc=3
	aload_0 
	invokespecial com.whatsapp.client.EmojiOneLineField.routine_2751 // pc=1
	return 
	}


protected final paint( com.whatsapp.client.EmojiOneLineField, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter 
	aload_1 
	aload_0_getfield com.whatsapp.client.EmojiOneLineField.field_54290   // get_name_1:  com.whatsapp.client.EmojiOneLineField.field_54290   // get_name_2:  com.whatsapp.client.EmojiOneLineField.field_54290   // get_Name:    com.whatsapp.client.EmojiOneLineField.field_54290   // getName->1:     // getName->2:     // getName->N:     // ofs = 54290 ord = 1 addr = 0
	iconst_0 
	iconst_0 
	invokestatic drawText( net.rim.device.api.ui.Graphics, java.lang.String, int, int ) // EmojiUtil
	return 
	}

}
