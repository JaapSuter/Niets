// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-9.cod
// Module version  : 2.7.3204
// Class ID        : 15
// ########################################################


package com.whatsapp.client;


abstract public final class BuildInfo extends Object

{
	// @@@@@@@@@@@@@ Static fields 


	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.BuildInfo ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	synch_static BuildInfo
	clinit_wait 
	ldc literal_55:"Icon_StatusChangeAlert2_64x64.png"
	putstatic IMAGE_ICON_STATUS_CHANGE_ALERT // BuildInfo
	ldc literal_56:"BlackBerry 5.0"
	putstatic BUILD_NAME // BuildInfo
	ldc literal_57:"Thu, 02 Feb 2012 17:47:38 PST"
	putstatic BUILD_TIMESTAMP // BuildInfo
	clinit_return 
	}

}
