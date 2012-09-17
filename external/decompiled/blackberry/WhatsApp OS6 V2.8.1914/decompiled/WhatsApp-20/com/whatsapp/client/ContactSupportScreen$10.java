// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-20.cod
// Module version  : 2.8.1914
// Class ID        : 1
// ########################################################


package com.whatsapp.client;


abstract final class ContactSupportScreen$10 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client. /*module:WhatsApp-21.class#1*/  field_59596 ; // ofs = 59596 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.ContactSupportScreen$10, module:WhatsApp-21.class#1 ); // address: 0
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

public final run( com.whatsapp.client.ContactSupportScreen$10 ); // address: 0
	{
	enter 
	invokestatic_lib net.rim.device.api.ui.UiApplication getUiApplication(  ) // UiApplication
	invokevirtual net.rim.device.api.ui.Screen getActiveScreen( net.rim.device.api.ui.UiApplication ) // pc=1
	astore_1 
	aload_1 
	ifnull Label47
	aload_1 
	invokenonvirtual_lib java.lang.Object.getClass // pc=1
	invokevirtual java.lang.String getName( java.lang.Class ) // pc=1
	ldc literal_88:"EmailEditorScreen"
	invokenonvirtual_lib java.lang.String.endsWith // pc=2
	ifeq Label47
	aload_1 
	invokevirtual net.rim.device.api.ui.Manager getDelegate( net.rim.device.api.ui.Screen ) // pc=1
	iconst_0 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	checkcast_lib net.rim.device.api.ui.Manager//net.rim.device.api.ui.Manager net.rim.device.api.ui.Manager net.rim.device.api.ui.Manager
	iconst_0 
	invokevirtual setVerticalScroll( net.rim.device.api.ui.Manager, int ) // pc=2
	aload_1 
	invokevirtual net.rim.device.api.ui.Field getFieldWithFocus( net.rim.device.api.ui.Screen ) // pc=1
	astore_2 
	aload_2 
	checkcastbranch_lib 
	astore_3 
	aload_3 
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	istore_4 
	iconst_0 
	istore_5 
Label30:
	iload_5 
	iload_4 
	if_icmpge Label47
	aload_3 
	iload_5 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	instanceof_lib net.rim.device.api.ui.component.EditField//net.rim.device.api.ui.component.EditField net.rim.device.api.ui.component.EditField net.rim.device.api.ui.component.EditField
	ifeq Label44
	aload_3 
	iload_5 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	checkcast_lib net.rim.device.api.ui.component.EditField//net.rim.device.api.ui.component.EditField net.rim.device.api.ui.component.EditField net.rim.device.api.ui.component.EditField
	iconst_0 
	invokevirtual setCursorPosition( net.rim.device.api.ui.component.BasicEditField, int ) // pc=2
Label44:
	iinc 5 1
	goto Label30
	astore_1 
Label47:
	return 
	}

}
