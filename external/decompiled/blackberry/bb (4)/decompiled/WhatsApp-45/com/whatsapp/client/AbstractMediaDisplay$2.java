// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-45.cod
// Module version  : 2.7.6550
// Class ID        : 10
// ########################################################


package com.whatsapp.client;


abstract final class AbstractMediaDisplay$2 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.FunXMPP$BinTreeNodeReader /*module:WhatsApp-16.class#3*/  field_59284 ; // ofs = 59284 addr = 0)
	private final com.whatsapp.client.MinivanScreen$4 /*module:WhatsApp-25.class#3*/  val$screen ; // ofs = 59288 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.AbstractMediaDisplay$2, module:WhatsApp-16.class#3, module:WhatsApp-25.class#3 ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	aload_2 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.AbstractMediaDisplay$2 ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-26.class#7.routine_6433(  ) // class#7
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aconst_null 
	bipush 100
	invokeinterface interfacemethodref_3 // pc=4 guess=1
	astore_1 
	aload_1 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual int indexOf( java.util.Vector, java.lang.Object ) // pc=2
	istore_2 
	iload_2 
	bipush -1
	if_icmpne Label42
	aload_1 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_3 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	astore_4 
	iconst_0 
	istore_5 
Label24:
	iload_5 
	iload_3 
	if_icmpge Label42
	aload_1 
	iload_5 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.FunXMPP$BinTreeNodeReader//module:WhatsApp-16.class#3 module:WhatsApp-16.class#3 module:WhatsApp-16.class#3
	astore_6 
	aload_4 
	aload_6 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label40
	iload_5 
	istore_2 
	goto Label42
Label40:
	iinc 5 1
	goto Label24
Label42:
	iload_2 
	ifge Label51
	aload_1 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iconst_0 
	invokevirtual insertElementAt( java.util.Vector, java.lang.Object, int ) // pc=3
	iconst_0 
	istore_3 
	goto Label53
Label51:
	iload_2 
	istore_3 
Label53:
	new AbstractMediaDisplay$2$1
	dup 
	aload_0 
	aload_1 
	iload_3 
	invokespecial com.whatsapp.client.AbstractMediaDisplay$2$1.<init> // pc=4
	astore_4 
	invokestatic_lib com.whatsapp.client.UiApp.routine_3299(  ) // UiApp
	aload_4 
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	return 
	}

}
