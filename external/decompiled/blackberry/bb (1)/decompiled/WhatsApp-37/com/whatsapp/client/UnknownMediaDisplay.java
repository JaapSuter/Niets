// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-31.cod
// Module version  : 2.7.3204
// Class ID        : 29
// ########################################################


package com.whatsapp.client;


abstract public final class UnknownMediaDisplay extends com.whatsapp.client.MediaDisplay

{


	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.UnknownMediaDisplay, module:WhatsApp-17.class#15, module:WhatsApp-10.class#2, boolean ); // address: 0
	{
	jumpspecial_lib .routine_4770(  )
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final doView( com.whatsapp.client.UnknownMediaDisplay ); // address: 0
	{
	enter_narrow 
	sipush 695
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokestatic_lib alert( java.lang.String ) // Dialog
	return 
	}


public final java.lang.String getSaveSubdir( com.whatsapp.client.UnknownMediaDisplay ); // address: 0
	{
	enter_narrow 
	aconst_null 
	areturn 
	}

}
