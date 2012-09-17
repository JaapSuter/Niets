// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-11.cod
// Module version  : 2.7.3204
// Class ID        : 27
// ########################################################


package com.whatsapp.client;


abstract final class ContactDetailScreen$4 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final String /*java.lang.String*/  field_54716 ; // ofs = 54716 addr = 0)
	private final int /*int*/  field_54720 ; // ofs = 54720 addr = 0)
	private final com.whatsapp.client.MediaPreviewButton /*module:WhatsApp-24.class#2*/  val$mediaButton ; // ofs = 54724 addr = 0)
	private final com.whatsapp.field.ProgressAnimationField /*com.whatsapp.field.ProgressAnimationField*/  val$groupMediaProgress ; // ofs = 54728 addr = 0)
	private final com.whatsapp.client.ContactDetailScreen /*com.whatsapp.client.ContactDetailScreen*/  field_54732 ; // ofs = 54732 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.ContactDetailScreen$4, com.whatsapp.client.ContactDetailScreen, java.lang.String, int, module:WhatsApp-24.class#2, com.whatsapp.field.ProgressAnimationField ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	aload_2 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	iload_3 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	aload_4 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aload_5 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.ContactDetailScreen$4 ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aconst_null 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokestatic_lib module:WhatsApp-10.class#6.routine_2584(  ) // class#6
	astore_1 
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	new ContactDetailScreen$4$1
	dup 
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.ContactDetailScreen$4$1.<init> // pc=3
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	return 
	}

}
