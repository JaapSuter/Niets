// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-35.cod
// Module version  : 2.8.1914
// Class ID        : 1
// ########################################################


package com.whatsapp.client;


abstract final class LocationDisplay$TwoLineTextField extends net.rim.device.api.ui.Field

{

	// @@@@@@@@@@@@@ Fields 
	private String /*java.lang.String*/  field_53094 ; // ofs = 53094 addr = 0)
	private String /*java.lang.String[]*/  field_53098 ; // ofs = 53098 addr = 0)
	private boolean /*boolean*/  field_53102 ; // ofs = 53102 addr = 0)
	private final com.whatsapp.client.LocationDisplay /*module:WhatsApp-34.class#0*/  field_53106 ; // ofs = 53106 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.LocationDisplay$TwoLineTextField, module:WhatsApp-34.class#0, java.lang.String, boolean ); // address: 0
	{
	enter 
	aload_0 
	lipush 1188950301625810944
	invokespecial_lib net.rim.device.api.ui.Field.<init> // pc=3
	aload_0 
	aload_1 
	putfield com.whatsapp.client.LocationDisplay$TwoLineTextField.field_53106   // get_name_1:  com.whatsapp.client.LocationDisplay$TwoLineTextField.field_53106   // get_name_2:  com.whatsapp.client.LocationDisplay$TwoLineTextField.field_53106   // get_Name:    com.whatsapp.client.LocationDisplay$TwoLineTextField.field_53106   // getName->1:     // getName->2:     // getName->N:     // ofs = 53106 ord = 3 addr = 0
	aload_0 
	aload_2 
	putfield com.whatsapp.client.LocationDisplay$TwoLineTextField.field_53094   // get_name_1:  com.whatsapp.client.LocationDisplay$TwoLineTextField.field_53094   // get_name_2:  com.whatsapp.client.LocationDisplay$TwoLineTextField.field_53094   // get_Name:    com.whatsapp.client.LocationDisplay$TwoLineTextField.field_53094   // getName->1:     // getName->2:     // getName->N:     // ofs = 53094 ord = 0 addr = 0
	aload_0 
	iload_3 
	putfield com.whatsapp.client.LocationDisplay$TwoLineTextField.field_53102   // get_name_1:  com.whatsapp.client.LocationDisplay$TwoLineTextField.field_53102   // get_name_2:  com.whatsapp.client.LocationDisplay$TwoLineTextField.field_53102   // get_Name:    com.whatsapp.client.LocationDisplay$TwoLineTextField.field_53102   // getName->1:     // getName->2:     // getName->N:     // ofs = 53102 ord = 2 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final boolean touchEvent( com.whatsapp.client.LocationDisplay$TwoLineTextField, net.rim.device.api.ui.TouchEvent ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.LocationDisplay$TwoLineTextField.field_53102   // get_name_1:  com.whatsapp.client.LocationDisplay$TwoLineTextField.field_53102   // get_name_2:  com.whatsapp.client.LocationDisplay$TwoLineTextField.field_53102   // get_Name:    com.whatsapp.client.LocationDisplay$TwoLineTextField.field_53102   // getName->1:     // getName->2:     // getName->N:     // ofs = 53102 ord = 2 addr = 0
	ifne Label7
	aload_0 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.Field.touchEvent // pc=2
	ireturn 
Label7:
	aload_0 
	invokevirtual net.rim.device.api.ui.Manager getManager( net.rim.device.api.ui.Field ) // pc=1
	iconst_0 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	astore_2 
	aload_1 
	invokevirtual int getEvent( net.rim.device.api.ui.TouchEvent ) // pc=1
Label15:
	aload_2 
	invokevirtual boolean isFocus( net.rim.device.api.ui.Field ) // pc=1
	ifeq Label22
	aload_0_getfield com.whatsapp.client.LocationDisplay$TwoLineTextField.field_53106   // get_name_1:  com.whatsapp.client.LocationDisplay$TwoLineTextField.field_53106   // get_name_2:  com.whatsapp.client.LocationDisplay$TwoLineTextField.field_53106   // get_Name:    com.whatsapp.client.LocationDisplay$TwoLineTextField.field_53106   // getName->1:     // getName->2:     // getName->N:     // ofs = 53106 ord = 3 addr = 0
	invokespecial_lib .routine_2045 // pc=1
	iconst_0 
	ireturn 
Label22:
	aload_2 
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	iconst_0 
	ireturn 
Label26:
	aload_0 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.Field.touchEvent // pc=2
	ireturn 
	}


protected final layout( com.whatsapp.client.LocationDisplay$TwoLineTextField, int, int ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	astore_3 
	aload_0 
	aload_0_getfield com.whatsapp.client.LocationDisplay$TwoLineTextField.field_53094   // get_name_1:  com.whatsapp.client.LocationDisplay$TwoLineTextField.field_53094   // get_name_2:  com.whatsapp.client.LocationDisplay$TwoLineTextField.field_53094   // get_Name:    com.whatsapp.client.LocationDisplay$TwoLineTextField.field_53094   // getName->1:     // getName->2:     // getName->N:     // ofs = 53094 ord = 0 addr = 0
	aload_3 
	iload_1 
	invokestatic_lib module:WhatsApp-79.class#39.routine_28247(  ) // class#39
	putfield com.whatsapp.client.LocationDisplay$TwoLineTextField.field_53098   // get_name_1:  com.whatsapp.client.LocationDisplay$TwoLineTextField.field_53098   // get_name_2:  com.whatsapp.client.LocationDisplay$TwoLineTextField.field_53098   // get_Name:    com.whatsapp.client.LocationDisplay$TwoLineTextField.field_53098   // getName->1:     // getName->2:     // getName->N:     // ofs = 53098 ord = 1 addr = 0
	aload_0_getfield com.whatsapp.client.LocationDisplay$TwoLineTextField.field_53098   // get_name_1:  com.whatsapp.client.LocationDisplay$TwoLineTextField.field_53098   // get_name_2:  com.whatsapp.client.LocationDisplay$TwoLineTextField.field_53098   // get_Name:    com.whatsapp.client.LocationDisplay$TwoLineTextField.field_53098   // getName->1:     // getName->2:     // getName->N:     // ofs = 53098 ord = 1 addr = 0
	iconst_1 
	aaload 
	ifnonnull Label20
	aload_0 
	iload_1 
	aload_3 
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	invokevirtual setExtent( net.rim.device.api.ui.Field, int, int ) // pc=3
	return 
Label20:
	aload_0 
	iload_1 
	aload_3 
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	bipush 2
	imul 
	invokevirtual setExtent( net.rim.device.api.ui.Field, int, int ) // pc=3
	return 
	}


protected final paint( com.whatsapp.client.LocationDisplay$TwoLineTextField, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual int getGlobalAlpha( net.rim.device.api.ui.Graphics ) // pc=1
	istore_2 
	aload_1 
	sipush 168
	invokevirtual setGlobalAlpha( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.LocationDisplay$TwoLineTextField.field_53098   // get_name_1:  com.whatsapp.client.LocationDisplay$TwoLineTextField.field_53098   // get_name_2:  com.whatsapp.client.LocationDisplay$TwoLineTextField.field_53098   // get_Name:    com.whatsapp.client.LocationDisplay$TwoLineTextField.field_53098   // getName->1:     // getName->2:     // getName->N:     // ofs = 53098 ord = 1 addr = 0
	iconst_0 
	aaload 
	iconst_0 
	iconst_0 
	invokevirtual int drawText( net.rim.device.api.ui.Graphics, java.lang.String, int, int ) // pc=4
	pop 
	aload_0_getfield com.whatsapp.client.LocationDisplay$TwoLineTextField.field_53098   // get_name_1:  com.whatsapp.client.LocationDisplay$TwoLineTextField.field_53098   // get_name_2:  com.whatsapp.client.LocationDisplay$TwoLineTextField.field_53098   // get_Name:    com.whatsapp.client.LocationDisplay$TwoLineTextField.field_53098   // getName->1:     // getName->2:     // getName->N:     // ofs = 53098 ord = 1 addr = 0
	iconst_1 
	aaload 
	ifnull Label32
	aload_1 
	aload_0_getfield com.whatsapp.client.LocationDisplay$TwoLineTextField.field_53098   // get_name_1:  com.whatsapp.client.LocationDisplay$TwoLineTextField.field_53098   // get_name_2:  com.whatsapp.client.LocationDisplay$TwoLineTextField.field_53098   // get_Name:    com.whatsapp.client.LocationDisplay$TwoLineTextField.field_53098   // getName->1:     // getName->2:     // getName->N:     // ofs = 53098 ord = 1 addr = 0
	iconst_1 
	aaload 
	iconst_0 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	bipush 64
	aload_0 
	invokevirtual int getContentWidth( net.rim.device.api.ui.Field ) // pc=1
	invokevirtual int drawText( net.rim.device.api.ui.Graphics, java.lang.String, int, int, int, int ) // pc=6
	pop 
Label32:
	aload_1 
	iload_2 
	invokevirtual setGlobalAlpha( net.rim.device.api.ui.Graphics, int ) // pc=2
	return 
	}

}
