// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-20.cod
// Module version  : 2.7.3204
// Class ID        : 20
// ########################################################


package com.whatsapp.client;


abstract final class InvitePopup$3 extends Object
implements net.rim.device.api.ui.FieldChangeListener

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.InvitePopup /*com.whatsapp.client.InvitePopup*/  field_54358 ; // ofs = 54358 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.InvitePopup$3, com.whatsapp.client.InvitePopup ); // address: 0
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

public final fieldChanged( com.whatsapp.client.InvitePopup$3, net.rim.device.api.ui.Field, int ); // address: 0
	{
	enter 
	iconst_0 
	istore_3 
	iconst_0 
	istore_4 
Label5:
	iload_4 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _emailChecks   // get_name_1:  _emailChecks   // get_name_2:  _emailChecks   // get_Name:    _emailChecks   // getName->1:  _emailChecks   // getName->2:  _emailChecks   // getName->N:  _emailChecks   // ofs = -1 ord = 0 addr = -1
	arraylength 
	if_icmpge Label21
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _emailChecks   // get_name_1:  _emailChecks   // get_name_2:  _emailChecks   // get_Name:    _emailChecks   // getName->1:  _emailChecks   // getName->2:  _emailChecks   // getName->N:  _emailChecks   // ofs = -1 ord = 0 addr = -1
	iload_4 
	aaload 
	invokevirtual boolean getChecked( net.rim.device.api.ui.component.CheckboxField ) // pc=1
	ifeq Label19
	iconst_1 
	istore_3 
	goto Label21
Label19:
	iinc 4 1
	goto Label5
Label21:
	iload_3 
	ifne Label41
	iconst_0 
	istore_4 
Label25:
	iload_4 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _smsChecks   // get_name_1:  _smsChecks   // get_name_2:  _smsChecks   // get_Name:    _smsChecks   // getName->1:  _smsChecks   // getName->2:  _smsChecks   // getName->N:  _smsChecks   // ofs = -1 ord = 1 addr = -1
	arraylength 
	if_icmpge Label41
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _smsChecks   // get_name_1:  _smsChecks   // get_name_2:  _smsChecks   // get_Name:    _smsChecks   // getName->1:  _smsChecks   // getName->2:  _smsChecks   // getName->N:  _smsChecks   // ofs = -1 ord = 1 addr = -1
	iload_4 
	aaload 
	invokevirtual boolean getChecked( net.rim.device.api.ui.component.CheckboxField ) // pc=1
	ifeq Label39
	iconst_1 
	istore_3 
	goto Label41
Label39:
	iinc 4 1
	goto Label25
Label41:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _sendBtn   // get_name_1:  _sendBtn   // get_name_2:  _sendBtn   // get_Name:    _sendBtn   // getName->1:  _sendBtn   // getName->2:  _sendBtn   // getName->N:  _sendBtn   // ofs = -1 ord = 2 addr = -1
	iload_3 
	invokevirtual setEditable( net.rim.device.api.ui.Field, boolean ) // pc=2
	return 
	}

}
