// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-25.cod
// Module version  : 2.7.3204
// Class ID        : 10
// ########################################################


package com.whatsapp.client;


abstract final class MinivanScreen$DelayedPopupHFM$1 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.MinivanScreen$DelayedPopupHFM /*com.whatsapp.client.MinivanScreen$DelayedPopupHFM*/  field_53914 ; // ofs = 53914 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.MinivanScreen$DelayedPopupHFM$1, com.whatsapp.client.MinivanScreen$DelayedPopupHFM ); // address: 0
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

public final run( com.whatsapp.client.MinivanScreen$DelayedPopupHFM$1 ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	bipush -1
	putfield timerID   // get_name_1:  timerID   // get_name_2:  timerID   // get_Name:    timerID   // getName->1:  timerID   // getName->2:  timerID   // getName->N:  timerID   // ofs = 53852 ord = 6 addr = 0
	invokestatic_lib long currentTimeMillis(  ) // System
	lstore 1
	lload 1
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	lgetfield deadline   // get_name_1:  deadline   // get_name_2:  deadline   // get_Name:    deadline   // getName->1:  deadline   // getName->2:  deadline   // getName->N:  deadline   // ofs = 53844 ord = 4 addr = 0
	lcmp 
	ifge Label15
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	lload 1
	invokespecial com.whatsapp.client.MinivanScreen$DelayedPopupHFM.scheduleTimer // pc=3
	return 
Label15:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual boolean isFocus( net.rim.device.api.ui.Field ) // pc=1
	ifeq Label31
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield FAST_DELAY   // get_name_1:  FAST_DELAY   // get_name_2:  FAST_DELAY   // get_Name:    FAST_DELAY   // getName->1:  FAST_DELAY   // getName->2:  FAST_DELAY   // getName->N:  FAST_DELAY   // ofs = 53832 ord = 1 addr = 0
	putfield delay   // get_name_1:  delay   // get_name_2:  delay   // get_Name:    delay   // getName->1:  delay   // getName->2:  delay   // getName->N:  delay   // ofs = 53848 ord = 5 addr = 0
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokespecial com.whatsapp.client.MinivanScreen$DelayedPopupHFM.getPopupManager // pc=1
	astore_3 
	aload_3 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield popup   // get_name_1:  popup   // get_name_2:  popup   // get_Name:    popup   // getName->1:  popup   // getName->2:  popup   // getName->N:  popup   // ofs = 53836 ord = 2 addr = 0
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield popupOwner   // get_name_1:  popupOwner   // get_name_2:  popupOwner   // get_Name:    popupOwner   // getName->1:  popupOwner   // getName->2:  popupOwner   // getName->N:  popupOwner   // ofs = 53840 ord = 3 addr = 0
	invokeinterface interfacemethodref_2 // pc=3 guess=1
Label31:
	return 
	}

}
