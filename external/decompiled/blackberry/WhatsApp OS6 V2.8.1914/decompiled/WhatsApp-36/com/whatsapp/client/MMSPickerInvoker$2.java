// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-36.cod
// Module version  : 2.8.1914
// Class ID        : 13
// ########################################################


package com.whatsapp.client;


abstract final class MMSPickerInvoker$2 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.MMSPickerInvoker /*com.whatsapp.client.MMSPickerInvoker*/  field_54722 ; // ofs = 54722 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.MMSPickerInvoker$2, com.whatsapp.client.MMSPickerInvoker ); // address: 0
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

public final run( com.whatsapp.client.MMSPickerInvoker$2 ); // address: 0
	{
	enter_narrow 
	sipush 500
	i2l 
	invokestatic_lib sleep( long ) // Thread
	goto Label6
	astore_1 
Label6:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual doInvoke( com.whatsapp.client.MMSPickerInvoker ) // pc=1
	return 
	}

}
