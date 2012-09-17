// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-24.cod
// Module version  : 2.7.3204
// Class ID        : 16
// ########################################################


package com.whatsapp.client;


abstract final class MinivanScreen$10 extends com.whatsapp.client.

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.MinivanScreen /*com.whatsapp.client.MinivanScreen*/  field_54708 ; // ofs = 54708 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.MinivanScreen$10, com.whatsapp.client.MinivanScreen, net.rim.device.api.system.Bitmap, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, long ); // address: 0
	{
	enter 
	aload_0 
	aload_2 
	aload_3 
	aload_4 
	aload_5 
	aload_6 
	aload_7 
	lload 8
	invokespecial_lib .routine_3085 // pc=9
	aload_0 
	aload_1 
	putfield com.whatsapp.client.MinivanScreen$10.field_54708   // get_name_1:  com.whatsapp.client.MinivanScreen$10.field_54708   // get_name_2:  com.whatsapp.client.MinivanScreen$10.field_54708   // get_Name:    com.whatsapp.client.MinivanScreen$10.field_54708   // getName->1:     // getName->2:     // getName->N:     // ofs = 54708 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final module:WhatsApp-38.class#7 com.whatsapp.client.MinivanScreen$10.routine_9721( com.whatsapp.client.MinivanScreen$10 ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual net.rim.device.api.ui.Manager getManager( net.rim.device.api.ui.Field ) // pc=1
	astore_1 
Label4:
	aload_1 
	checkcastbranch_lib 
	areturn 
Label7:
	aload_1 
	invokevirtual net.rim.device.api.ui.Manager getManager( net.rim.device.api.ui.Field ) // pc=1
	dup 
	astore_1 
	ifnonnull Label4
	aconst_null 
	areturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final onFocus( com.whatsapp.client.MinivanScreen$10, int ); // address: 0
	{
	enter 
	aload_0 
	iload_1 
	invokespecial_lib .routine_2082 // pc=2
	aload_0_getfield com.whatsapp.client.MinivanScreen$10.field_54708   // get_name_1:  com.whatsapp.client.MinivanScreen$10.field_54708   // get_name_2:  com.whatsapp.client.MinivanScreen$10.field_54708   // get_Name:    com.whatsapp.client.MinivanScreen$10.field_54708   // getName->1:     // getName->2:     // getName->N:     // ofs = 54708 ord = 0 addr = 0
	getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = -1 ord = 0 addr = -1
	invokevirtual java.lang.String getContextTooltip( com.whatsapp.client.TabButton ) // pc=1
	astore_2 
	aload_0 
	invokespecial com.whatsapp.client.MinivanScreen$10.routine_9721 // pc=1
	astore_3 
	aload_2 
	ifnull Label23
	aload_3 
	ifnull Label23
	aload_2 
	iipush 3889775
	invokestatic_lib com.whatsapp.client.TabButton.routine_8742(  ) // TabButton
	astore_4 
	aload_3 
	aload_4 
	aload_0 
	invokeinterface interfacemethodref_24 // pc=3 guess=20
Label23:
	return 
	}


protected final onUnfocus( com.whatsapp.client.MinivanScreen$10 ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib .routine_2102 // pc=1
	aload_0 
	invokespecial com.whatsapp.client.MinivanScreen$10.routine_9721 // pc=1
	astore_1 
	aload_1 
	ifnull Label12
	aload_1 
	aconst_null 
	aconst_null 
	invokeinterface interfacemethodref_24 // pc=3 guess=21
Label12:
	return 
	}

}
