// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-21.cod
// Module version  : 2.8.1914
// Class ID        : 4
// ########################################################


package com.whatsapp.client;


abstract final class ContactSupportScreen$ServiceChoice extends Object

{

	// @@@@@@@@@@@@@ Fields 
	public final net.rim.blackberry.api.mail.ServiceConfiguration /*net.rim.blackberry.api.mail.ServiceConfiguration*/  _serviceConfiguration ; // ofs = 54094 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.ContactSupportScreen$ServiceChoice, net.rim.blackberry.api.mail.ServiceConfiguration ); // address: 0
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

public final java.lang.String toString( com.whatsapp.client.ContactSupportScreen$ServiceChoice ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual java.lang.String getEmailAddress( net.rim.blackberry.api.mail.ServiceConfiguration ) // pc=1
	areturn 
	}

}
