// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-40.cod
// Module version  : 2.8.1914
// Class ID        : 11
// ########################################################


package com.whatsapp.client;


abstract final class MediaSettingsScreen$6 extends Thread

{

	// @@@@@@@@@@@@@ Fields 
	private final String /*java.lang.String*/  field_54764 ; // ofs = 54764 addr = 0)
	private final String /*java.lang.String*/  field_54768 ; // ofs = 54768 addr = 0)
	private final boolean /*boolean*/  field_54772 ; // ofs = 54772 addr = 0)
	private final net.rim.device.api.ui.container.PopupScreen /*net.rim.device.api.ui.container.PopupScreen*/  val$popup ; // ofs = 54776 addr = 0)
	private final com.whatsapp.client.MediaSettingsScreen /*com.whatsapp.client.MediaSettingsScreen*/  field_54780 ; // ofs = 54780 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.MediaSettingsScreen$6, com.whatsapp.client.MediaSettingsScreen, java.lang.String, java.lang.String, boolean, net.rim.device.api.ui.container.PopupScreen ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Thread.<init> // pc=1
	aload_0 
	aload_1 
	putfield com.whatsapp.client.MediaSettingsScreen$6.field_54780   // get_name_1:  com.whatsapp.client.MediaSettingsScreen$6.field_54780   // get_name_2:  com.whatsapp.client.MediaSettingsScreen$6.field_54780   // get_Name:    com.whatsapp.client.MediaSettingsScreen$6.field_54780   // getName->1:     // getName->2:     // getName->N:     // ofs = 54780 ord = 4 addr = 0
	aload_0 
	aload_2 
	putfield com.whatsapp.client.MediaSettingsScreen$6.field_54764   // get_name_1:  com.whatsapp.client.MediaSettingsScreen$6.field_54764   // get_name_2:  com.whatsapp.client.MediaSettingsScreen$6.field_54764   // get_Name:    com.whatsapp.client.MediaSettingsScreen$6.field_54764   // getName->1:     // getName->2:     // getName->N:     // ofs = 54764 ord = 0 addr = 0
	aload_0 
	aload_3 
	putfield com.whatsapp.client.MediaSettingsScreen$6.field_54768   // get_name_1:  com.whatsapp.client.MediaSettingsScreen$6.field_54768   // get_name_2:  com.whatsapp.client.MediaSettingsScreen$6.field_54768   // get_Name:    com.whatsapp.client.MediaSettingsScreen$6.field_54768   // getName->1:     // getName->2:     // getName->N:     // ofs = 54768 ord = 1 addr = 0
	aload_0 
	iload_4 
	putfield com.whatsapp.client.MediaSettingsScreen$6.field_54772   // get_name_1:  com.whatsapp.client.MediaSettingsScreen$6.field_54772   // get_name_2:  com.whatsapp.client.MediaSettingsScreen$6.field_54772   // get_Name:    com.whatsapp.client.MediaSettingsScreen$6.field_54772   // getName->1:     // getName->2:     // getName->N:     // ofs = 54772 ord = 2 addr = 0
	aload_0 
	aload_5 
	putfield val$popup   // get_name_1:  val$popup   // get_name_2:  val$popup   // get_Name:    val$popup   // getName->1:  val$popup   // getName->2:  val$popup   // getName->N:  val$popup   // ofs = 54776 ord = 3 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.MediaSettingsScreen$6 ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen$6.field_54780   // get_name_1:  com.whatsapp.client.MediaSettingsScreen$6.field_54780   // get_name_2:  com.whatsapp.client.MediaSettingsScreen$6.field_54780   // get_Name:    com.whatsapp.client.MediaSettingsScreen$6.field_54780   // getName->1:     // getName->2:     // getName->N:     // ofs = 54780 ord = 4 addr = 0
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen$6.field_54764   // get_name_1:  com.whatsapp.client.MediaSettingsScreen$6.field_54764   // get_name_2:  com.whatsapp.client.MediaSettingsScreen$6.field_54764   // get_Name:    com.whatsapp.client.MediaSettingsScreen$6.field_54764   // getName->1:     // getName->2:     // getName->N:     // ofs = 54764 ord = 0 addr = 0
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen$6.field_54768   // get_name_1:  com.whatsapp.client.MediaSettingsScreen$6.field_54768   // get_name_2:  com.whatsapp.client.MediaSettingsScreen$6.field_54768   // get_Name:    com.whatsapp.client.MediaSettingsScreen$6.field_54768   // getName->1:     // getName->2:     // getName->N:     // ofs = 54768 ord = 1 addr = 0
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen$6.field_54772   // get_name_1:  com.whatsapp.client.MediaSettingsScreen$6.field_54772   // get_name_2:  com.whatsapp.client.MediaSettingsScreen$6.field_54772   // get_Name:    com.whatsapp.client.MediaSettingsScreen$6.field_54772   // getName->1:     // getName->2:     // getName->N:     // ofs = 54772 ord = 2 addr = 0
	invokespecial com.whatsapp.client.MediaSettingsScreen.persistSavedDataImpl // pc=4
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	new MediaSettingsScreen$6$1
	dup 
	aload_0 
	invokespecial com.whatsapp.client.MediaSettingsScreen$6$1.<init> // pc=2
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	return 
	}

}
