// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-5.cod
// Module version  : 2.7.3204
// Class ID        : 1
// ########################################################


package com.whatsapp.client;


abstract final class ApplicationMenuItems$OpenContextMenu extends net.rim.blackberry.api.menuitem.ApplicationMenuItem

{


	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.ApplicationMenuItems$OpenContextMenu, int ); // address: 0
	{
	jumpspecial_lib <init>( net.rim.blackberry.api.menuitem.ApplicationMenuItem, int )
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final java.lang.Object run( com.whatsapp.client.ApplicationMenuItems$OpenContextMenu, java.lang.Object ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-12.class#30.routine_5613(  ) // class#30
	ifne Label5
	aload_1 
	areturn 
Label5:
	aload_1 
	instanceof_lib com.whatsapp.client.//module:WhatsApp-11.class#13 module:WhatsApp-11.class#13 module:WhatsApp-11.class#13
	ifeq Label35
	invokestatic_lib com.whatsapp.client.UiApp.routine_6649(  ) // UiApp
	astore_2 
	aload_2 
	iconst_1 
	putfield _fromSystemFolder   // get_name_1:  _fromSystemFolder   // get_name_2:  _fromSystemFolder   // get_Name:    _fromSystemFolder   // getName->1:  _fromSystemFolder   // getName->2:  _fromSystemFolder   // getName->N:  _fromSystemFolder   // ofs = -1 ord = 0 addr = -1
	aload_1 
	checkcast_lib com.whatsapp.client.ChatHistory$ApplicationMessageAdapter//module:WhatsApp-11.class#13 module:WhatsApp-11.class#13 module:WhatsApp-11.class#13
	invokenonvirtual_lib .routine_7604 // pc=1
	astore_3 
	aload_2 
	invokevirtual net.rim.device.api.ui.Screen getActiveScreen( net.rim.device.api.ui.UiApplication ) // pc=1
	astore_4 
	aload_4 
	checkcastbranch_lib 
	getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = -1 ord = 0 addr = -1
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_3 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label33
Label28:
	aload_4 
	checkcastbranch_lib 
	invokenonvirtual_lib .routine_129 // pc=1
Label31:
	aload_3 
	invokestatic_lib module:WhatsApp-32.class#1.routine_6042(  ) // class#1
Label33:
	invokestatic_lib com.whatsapp.client.UiApp.routine_6649(  ) // UiApp
	invokevirtual requestForeground( net.rim.device.api.system.Application ) // pc=1
Label35:
	aload_1 
	areturn 
	}


public final java.lang.String toString( com.whatsapp.client.ApplicationMenuItems$OpenContextMenu ); // address: 0
	{
	enter_narrow 
	sipush 288
	invokestatic_lib module:WhatsApp-28.class#15.routine_4437(  ) // class#15
	areturn 
	}

}
