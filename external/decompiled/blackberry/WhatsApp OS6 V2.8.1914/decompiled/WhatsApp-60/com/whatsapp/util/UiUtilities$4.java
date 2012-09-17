// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-60.cod
// Module version  : 2.8.1914
// Class ID        : 5
// ########################################################


package com.whatsapp.util;


abstract final class UiUtilities$4 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final net.rim.device.api.ui.Field /*net.rim.device.api.ui.Field*/  field_58202 ; // ofs = 58202 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.util.UiUtilities$4, net.rim.device.api.ui.Field ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.util.UiUtilities$4 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual boolean isVisible( net.rim.device.api.ui.Field ) // pc=1
	ifne Label5
	return 
Label5:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	return 
	}

}
