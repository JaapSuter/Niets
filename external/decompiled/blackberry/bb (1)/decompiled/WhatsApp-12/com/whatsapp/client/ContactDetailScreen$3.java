// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-12.cod
// Module version  : 2.7.6550
// Class ID        : 19
// ########################################################


package com.whatsapp.client;


abstract final class ContactDetailScreen$3 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final String /*java.lang.String*/  field_41048 ; // ofs = 41048 addr = 0)
	private final com.whatsapp.client.MediaPreviewButton /*com.whatsapp.client.MediaPreviewButton*/  val$mediaButton ; // ofs = 41052 addr = 0)
	private final com.whatsapp.client.ContactDetailScreen /*com.whatsapp.client.ContactDetailScreen*/  field_41056 ; // ofs = 41056 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.ContactDetailScreen$3, com.whatsapp.client.ContactDetailScreen, java.lang.String, com.whatsapp.client.MediaPreviewButton ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aload_2 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	aload_3 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.ContactDetailScreen$3 ); // address: 0
	{
	enter 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokestatic_lib module:WhatsApp-10.class#0.routine_316(  ) // class#0
	putfield _mmsCount   // get_name_1:  _mmsCount   // get_name_2:  _mmsCount   // get_Name:    _mmsCount   // getName->1:  _mmsCount   // getName->2:  _mmsCount   // getName->N:  _mmsCount   // ofs = 40764 ord = 17 addr = 0
	sipush 846
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getfield _mmsCount   // get_name_1:  _mmsCount   // get_name_2:  _mmsCount   // get_Name:    _mmsCount   // getName->1:  _mmsCount   // getName->2:  _mmsCount   // getName->N:  _mmsCount   // ofs = 40764 ord = 17 addr = 0
	invokestatic_lib java.lang.String toString( int ) // Integer
	invokestatic_lib module:WhatsApp-35.class#1.routine_6672(  ) // class#1
	astore_1 
	invokestatic_lib com.whatsapp.client.UiApp.routine_3456(  ) // UiApp
	new ContactDetailScreen$3$1
	dup 
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.ContactDetailScreen$3$1.<init> // pc=3
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	return 
	}

}
