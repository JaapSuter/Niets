// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-36.cod
// Module version  : 2.7.3204
// Class ID        : 17
// ########################################################


package com.whatsapp.client;


public class WAMenuItem extends net.rim.device.api.ui.MenuItem

{

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

private <init>( com.whatsapp.client.WAMenuItem, net.rim.device.api.util.StringProviderMutator, int, int ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	invokevirtual net.rim.device.api.util.StringProvider getStringProvider( net.rim.device.api.util.StringProviderMutator ) // pc=1
	iload_2 
	iload_3 
	invokespecial_lib net.rim.device.api.ui.MenuItem.<init> // pc=4
	aload_0 
	aload_1 
	putfield _stringProviderMutator   // get_name_1:  _stringProviderMutator   // get_name_2:  _stringProviderMutator   // get_Name:    _stringProviderMutator   // getName->1:  _stringProviderMutator   // getName->2:  _stringProviderMutator   // getName->N:  _stringProviderMutator   // ofs = 54604 ord = 0 addr = 0
	return 
	}


static public com.whatsapp.client.WAMenuItem create( net.rim.device.api.i18n.ResourceBundle, int, int, int, java.lang.Runnable ); // address: 0
	{
	enter 
	aload_0 
	iload_1 
	invokevirtual java.lang.String getString( net.rim.device.api.i18n.ResourceBundle, int ) // pc=2
	iload_2 
	iload_3 
	aload_4 
	invokestatic com.whatsapp.client.WAMenuItem create( java.lang.String, int, int, java.lang.Runnable ) // WAMenuItem
	areturn 
	}


static public com.whatsapp.client.WAMenuItem create( java.lang.String, int, int, java.lang.Runnable ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.//module:WhatsApp-35.class#7 module:WhatsApp-35.class#7 module:WhatsApp-35.class#7
	dup 
	new_lib net.rim.device.api.i18n.ResourceBundle//net.rim.device.api.i18n.ResourceBundle net.rim.device.api.i18n.ResourceBundle net.rim.device.api.i18n.ResourceBundle
	dup 
	aload_0 
	invokespecial_lib net.rim.device.api.util.StringProviderMutator.<init> // pc=2
	iload_1 
	iload_2 
	aload_3 
	invokespecial_lib .routine_8815 // pc=5
	areturn 
	}


<init>( com.whatsapp.client.WAMenuItem, net.rim.device.api.util.StringProviderMutator, int, int, module:WhatsApp-35.class#7 ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	iload_2 
	iload_3 
	invokespecial com.whatsapp.client.WAMenuItem.<init> // pc=4
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public setString( com.whatsapp.client.WAMenuItem, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _stringProviderMutator   // get_name_1:  _stringProviderMutator   // get_name_2:  _stringProviderMutator   // get_Name:    _stringProviderMutator   // getName->1:  _stringProviderMutator   // getName->2:  _stringProviderMutator   // getName->N:  _stringProviderMutator   // ofs = 54604 ord = 0 addr = 0
	aload_1 
	invokevirtual setString( net.rim.device.api.util.StringProviderMutator, java.lang.String ) // pc=2
	return 
	}

}
