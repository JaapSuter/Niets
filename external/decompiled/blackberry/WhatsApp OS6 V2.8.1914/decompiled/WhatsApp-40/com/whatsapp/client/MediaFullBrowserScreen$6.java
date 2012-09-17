// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-40.cod
// Module version  : 2.8.1914
// Class ID        : 1
// ########################################################


package com.whatsapp.client;


abstract final class MediaFullBrowserScreen$6 extends Object
implements net.rim.device.api.ui.FieldChangeListener

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.MediaFullBrowserScreen /*com.whatsapp.client.MediaFullBrowserScreen*/  field_54078 ; // ofs = 54078 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.MediaFullBrowserScreen$6, com.whatsapp.client.MediaFullBrowserScreen ); // address: 0
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

public final fieldChanged( com.whatsapp.client.MediaFullBrowserScreen$6, net.rim.device.api.ui.Field, int ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _browserManager   // get_name_1:  _browserManager   // get_name_2:  _browserManager   // get_Name:    _browserManager   // getName->1:  _browserManager   // getName->2:  _browserManager   // getName->N:  _browserManager   // ofs = 53936 ord = 4 addr = 0
	invokenonvirtual_lib .routine_4819 // pc=1
	istore_3 
	iload_3 
	bipush -1
	if_icmpne Label9
	return 
Label9:
	iload_2 
	bipush 3
	if_icmpne Label15
	aconst_null 
	astore_4 
	goto Label43
Label15:
	aload_1 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _prevButton   // get_name_1:  _prevButton   // get_name_2:  _prevButton   // get_Name:    _prevButton   // getName->1:  _prevButton   // getName->2:  _prevButton   // getName->N:  _prevButton   // ofs = 53968 ord = 12 addr = 0
	if_acmpne Label26
	iload_3 
	iconst_1 
	if_icmpne Label26
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _nextButton   // get_name_1:  _nextButton   // get_name_2:  _nextButton   // get_Name:    _nextButton   // getName->1:  _nextButton   // getName->2:  _nextButton   // getName->N:  _nextButton   // ofs = 53972 ord = 13 addr = 0
	astore_4 
	goto Label43
Label26:
	aload_1 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _nextButton   // get_name_1:  _nextButton   // get_name_2:  _nextButton   // get_Name:    _nextButton   // getName->1:  _nextButton   // getName->2:  _nextButton   // getName->N:  _nextButton   // ofs = 53972 ord = 13 addr = 0
	if_acmpne Label41
	iload_3 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _browserManager   // get_name_1:  _browserManager   // get_name_2:  _browserManager   // get_Name:    _browserManager   // getName->1:  _browserManager   // getName->2:  _browserManager   // getName->N:  _browserManager   // ofs = 53936 ord = 4 addr = 0
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	bipush 2
	isub 
	if_icmpne Label41
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _prevButton   // get_name_1:  _prevButton   // get_name_2:  _prevButton   // get_Name:    _prevButton   // getName->1:  _prevButton   // getName->2:  _prevButton   // getName->N:  _prevButton   // ofs = 53968 ord = 12 addr = 0
	astore_4 
	goto Label43
Label41:
	aload_1 
	astore_4 
Label43:
	aload_1 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _prevButton   // get_name_1:  _prevButton   // get_name_2:  _prevButton   // get_Name:    _prevButton   // getName->1:  _prevButton   // getName->2:  _prevButton   // getName->N:  _prevButton   // ofs = 53968 ord = 12 addr = 0
	if_acmpne Label65
	iload_3 
	ifle Label58
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _browserManager   // get_name_1:  _browserManager   // get_name_2:  _browserManager   // get_Name:    _browserManager   // getName->1:  _browserManager   // getName->2:  _browserManager   // getName->N:  _browserManager   // ofs = 53936 ord = 4 addr = 0
	iload_3 
	iconst_1 
	isub 
	iconst_1 
	aload_4 
	invokenonvirtual_lib .routine_4869 // pc=4
	return 
Label58:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _browserManager   // get_name_1:  _browserManager   // get_name_2:  _browserManager   // get_Name:    _browserManager   // getName->1:  _browserManager   // getName->2:  _browserManager   // getName->N:  _browserManager   // ofs = 53936 ord = 4 addr = 0
	iload_3 
	iconst_0 
	aload_4 
	invokenonvirtual_lib .routine_4869 // pc=4
	return 
Label65:
	aload_1 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _nextButton   // get_name_1:  _nextButton   // get_name_2:  _nextButton   // get_Name:    _nextButton   // getName->1:  _nextButton   // getName->2:  _nextButton   // getName->N:  _nextButton   // ofs = 53972 ord = 13 addr = 0
	if_acmpne Label95
	iload_3 
	bipush -1
	if_icmpeq Label88
	iload_3 
	iconst_1 
	iadd 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _browserManager   // get_name_1:  _browserManager   // get_name_2:  _browserManager   // get_Name:    _browserManager   // getName->1:  _browserManager   // getName->2:  _browserManager   // getName->N:  _browserManager   // ofs = 53936 ord = 4 addr = 0
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	if_icmpge Label88
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _browserManager   // get_name_1:  _browserManager   // get_name_2:  _browserManager   // get_Name:    _browserManager   // getName->1:  _browserManager   // getName->2:  _browserManager   // getName->N:  _browserManager   // ofs = 53936 ord = 4 addr = 0
	iload_3 
	iconst_1 
	iadd 
	iconst_1 
	aload_4 
	invokenonvirtual_lib .routine_4869 // pc=4
	return 
Label88:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _browserManager   // get_name_1:  _browserManager   // get_name_2:  _browserManager   // get_Name:    _browserManager   // getName->1:  _browserManager   // getName->2:  _browserManager   // getName->N:  _browserManager   // ofs = 53936 ord = 4 addr = 0
	iload_3 
	iconst_0 
	aload_4 
	invokenonvirtual_lib .routine_4869 // pc=4
	return 
Label95:
	aload_1 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _actionButton   // get_name_1:  _actionButton   // get_name_2:  _actionButton   // get_Name:    _actionButton   // getName->1:  _actionButton   // getName->2:  _actionButton   // getName->N:  _actionButton   // ofs = 53964 ord = 11 addr = 0
	if_acmpne Label114
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _browserManager   // get_name_1:  _browserManager   // get_name_2:  _browserManager   // get_Name:    _browserManager   // getName->1:  _browserManager   // getName->2:  _browserManager   // getName->N:  _browserManager   // ofs = 53936 ord = 4 addr = 0
	iload_3 
	iconst_0 
	aload_4 
	invokenonvirtual_lib .routine_4869 // pc=4
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _browserManager   // get_name_1:  _browserManager   // get_name_2:  _browserManager   // get_Name:    _browserManager   // getName->1:  _browserManager   // getName->2:  _browserManager   // getName->N:  _browserManager   // ofs = 53936 ord = 4 addr = 0
	iload_3 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	checkcast_lib com.whatsapp.client.MediaFullBrowserField//com.whatsapp.client.MediaFullBrowserField com.whatsapp.client.MediaFullBrowserField com.whatsapp.client.MediaFullBrowserField
	aload_4 
	invokespecial com.whatsapp.client.MediaFullBrowserScreen.doMediaAction // pc=3
	return 
Label114:
	aload_1 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _sendButton   // get_name_1:  _sendButton   // get_name_2:  _sendButton   // get_Name:    _sendButton   // getName->1:  _sendButton   // getName->2:  _sendButton   // getName->N:  _sendButton   // ofs = 53960 ord = 10 addr = 0
	if_acmpne Label132
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _browserManager   // get_name_1:  _browserManager   // get_name_2:  _browserManager   // get_Name:    _browserManager   // getName->1:  _browserManager   // getName->2:  _browserManager   // getName->N:  _browserManager   // ofs = 53936 ord = 4 addr = 0
	iload_3 
	iconst_0 
	aload_4 
	invokenonvirtual_lib .routine_4869 // pc=4
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _browserManager   // get_name_1:  _browserManager   // get_name_2:  _browserManager   // get_Name:    _browserManager   // getName->1:  _browserManager   // getName->2:  _browserManager   // getName->N:  _browserManager   // ofs = 53936 ord = 4 addr = 0
	iload_3 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	checkcast_lib com.whatsapp.client.MediaFullBrowserField//com.whatsapp.client.MediaFullBrowserField com.whatsapp.client.MediaFullBrowserField com.whatsapp.client.MediaFullBrowserField
	aload_4 
	invokespecial com.whatsapp.client.MediaFullBrowserScreen.doMediaSend // pc=3
Label132:
	return 
	}

}
