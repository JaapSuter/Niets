// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-24.cod
// Module version  : 2.8.1914
// Class ID        : 9
// ########################################################


package com.whatsapp.client;


abstract final class EmailServiceConfigurationComparator extends Object
implements net.rim.device.api.util.Comparator

{


	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.EmailServiceConfigurationComparator ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final int compare( com.whatsapp.client.EmailServiceConfigurationComparator, java.lang.Object, java.lang.Object ); // address: 0
	{
	enter 
	aload_1 
	checkcast_lib net.rim.blackberry.api.mail.ServiceConfiguration//net.rim.blackberry.api.mail.ServiceConfiguration net.rim.blackberry.api.mail.ServiceConfiguration net.rim.blackberry.api.mail.ServiceConfiguration
	astore_3 
	aload_2 
	checkcast_lib net.rim.blackberry.api.mail.ServiceConfiguration//net.rim.blackberry.api.mail.ServiceConfiguration net.rim.blackberry.api.mail.ServiceConfiguration net.rim.blackberry.api.mail.ServiceConfiguration
	astore_4 
	aload_3 
	invokevirtual java.lang.String getEmailAddress( net.rim.blackberry.api.mail.ServiceConfiguration ) // pc=1
	astore_5 
	aload_4 
	invokevirtual java.lang.String getEmailAddress( net.rim.blackberry.api.mail.ServiceConfiguration ) // pc=1
	astore_6 
	aload_5 
	ifnonnull Label17
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	astore_5 
Label17:
	aload_6 
	ifnonnull Label21
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	astore_6 
Label21:
	aload_5 
	aload_6 
	invokestatic_lib int compareToIgnoreCase( java.lang.String, java.lang.String ) // StringUtilities
	ireturn 
	}

}
