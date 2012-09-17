// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-55.cod
// Module version  : 2.8.1914
// Class ID        : 9
// ########################################################


package com.whatsapp.field;


abstract final class WAEyelidFieldManager$BlinkTimerTask$1 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask /*com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask*/  field_54742 ; // ofs = 54742 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask$1, com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask ); // address: 0
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

public final run( com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask$1 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54688 ord = 4 addr = 0
	iconst_0 
	invokevirtual onBlinkChange( com.whatsapp.field.WAEyelidFieldManager, boolean ) // pc=2
	return 
	}

}
