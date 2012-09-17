// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-31.cod
// Module version  : 2.7.3204
// Class ID        : 26
// ########################################################


package com.whatsapp.client;


abstract final class UiApp$UiAccountAlerts$1 extends Object
implements Runnable

{


	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.UiApp$UiAccountAlerts$1 ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.UiApp$UiAccountAlerts$1 ); // address: 0
	{
	enter_narrow 
	sipush 5000
	i2l 
	invokestatic_lib sleep( long ) // Thread
	goto Label6
	astore_1 
Label6:
	invokestatic showAlert(  ) // UiApp$UiAccountAlerts
	return 
	}

}
