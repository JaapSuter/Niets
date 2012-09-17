// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-26.cod
// Module version  : 2.7.3204
// Class ID        : 13
// ########################################################


package com.whatsapp.client;


abstract final class NewChatScreen$26$1 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.NewChatScreen$26 /*com.whatsapp.client.NewChatScreen$26*/  field_54826 ; // ofs = 54826 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.NewChatScreen$26$1, com.whatsapp.client.NewChatScreen$26 ); // address: 0
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

public final run( com.whatsapp.client.NewChatScreen$26$1 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54774 ord = 2 addr = 0
	getfield _screenVFM   // get_name_1:  _screenVFM   // get_name_2:  _screenVFM   // get_Name:    _screenVFM   // getName->1:  _screenVFM   // getName->2:  _screenVFM   // getName->N:  _screenVFM   // ofs = -1 ord = 9 addr = -1
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54774 ord = 2 addr = 0
	getfield _screenVFM   // get_name_1:  _screenVFM   // get_name_2:  _screenVFM   // get_Name:    _screenVFM   // getName->1:  _screenVFM   // getName->2:  _screenVFM   // getName->N:  _screenVFM   // ofs = -1 ord = 9 addr = -1
	invokevirtual int getVirtualHeight( net.rim.device.api.ui.Manager ) // pc=1
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield val$scrollFromBottom   // get_name_1:  val$scrollFromBottom   // get_name_2:  val$scrollFromBottom   // get_Name:    val$scrollFromBottom   // getName->1:  val$scrollFromBottom   // getName->2:  val$scrollFromBottom   // getName->N:  val$scrollFromBottom   // ofs = 54770 ord = 1 addr = 0
	isub 
	invokenonvirtual_lib .routine_457 // pc=2
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54774 ord = 2 addr = 0
	getfield _screenVFM   // get_name_1:  _screenVFM   // get_name_2:  _screenVFM   // get_Name:    _screenVFM   // getName->1:  _screenVFM   // getName->2:  _screenVFM   // getName->N:  _screenVFM   // ofs = -1 ord = 9 addr = -1
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54774 ord = 2 addr = 0
	getfield _screenVFM   // get_name_1:  _screenVFM   // get_name_2:  _screenVFM   // get_Name:    _screenVFM   // getName->1:  _screenVFM   // getName->2:  _screenVFM   // getName->N:  _screenVFM   // ofs = -1 ord = 9 addr = -1
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	bipush 2
	idiv 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54774 ord = 2 addr = 0
	getfield _screenVFM   // get_name_1:  _screenVFM   // get_name_2:  _screenVFM   // get_Name:    _screenVFM   // getName->1:  _screenVFM   // getName->2:  _screenVFM   // getName->N:  _screenVFM   // ofs = -1 ord = 9 addr = -1
	invokevirtual int getVerticalScroll( net.rim.device.api.ui.Manager ) // pc=1
	invokevirtual int getFieldAtLocation( net.rim.device.api.ui.Manager, int, int ) // pc=3
	istore_1 
	iload_1 
	bipush -1
	if_icmpeq Label36
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54774 ord = 2 addr = 0
	getfield _screenVFM   // get_name_1:  _screenVFM   // get_name_2:  _screenVFM   // get_Name:    _screenVFM   // getName->1:  _screenVFM   // getName->2:  _screenVFM   // getName->N:  _screenVFM   // ofs = -1 ord = 9 addr = -1
	iload_1 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
Label36:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54774 ord = 2 addr = 0
	getfield _moreHistoryButton   // get_name_1:  _moreHistoryButton   // get_name_2:  _moreHistoryButton   // get_Name:    _moreHistoryButton   // getName->1:  _moreHistoryButton   // getName->2:  _moreHistoryButton   // getName->N:  _moreHistoryButton   // ofs = -1 ord = 10 addr = -1
	iconst_1 
	invokevirtual setEditable( net.rim.device.api.ui.Field, boolean ) // pc=2
	return 
	}

}
