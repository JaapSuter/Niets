// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-24.cod
// Module version  : 2.7.3204
// Class ID        : 15
// ########################################################


package com.whatsapp.client;


abstract public final class MinivanScreen$DelayedPopupHFM extends com.whatsapp.field.WAHorizontalFieldManager
implements com.whatsapp.field.PopupManager

{

	// @@@@@@@@@@@@@ Fields 
	public int /*int*/  LONG_DELAY ; // ofs = 54738 addr = 0)
	public int /*int*/  FAST_DELAY ; // ofs = 54742 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.MinivanScreen$DelayedPopupHFM, com.whatsapp.client.MinivanScreen ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib .routine_4534 // pc=1
	aload_0 
	aload_1 
	putfield com.whatsapp.client.MinivanScreen$DelayedPopupHFM.field_54766   // get_name_1:  com.whatsapp.client.MinivanScreen$DelayedPopupHFM.field_54766   // get_name_2:  com.whatsapp.client.MinivanScreen$DelayedPopupHFM.field_54766   // get_Name:    com.whatsapp.client.MinivanScreen$DelayedPopupHFM.field_54766   // getName->1:     // getName->2:     // getName->N:     // ofs = 54766 ord = 7 addr = 0
	aload_0 
	sipush 2000
	putfield LONG_DELAY   // get_name_1:  LONG_DELAY   // get_name_2:  LONG_DELAY   // get_Name:    LONG_DELAY   // getName->1:  LONG_DELAY   // getName->2:  LONG_DELAY   // getName->N:  LONG_DELAY   // ofs = 54738 ord = 0 addr = 0
	aload_0 
	sipush 300
	putfield FAST_DELAY   // get_name_1:  FAST_DELAY   // get_name_2:  FAST_DELAY   // get_Name:    FAST_DELAY   // getName->1:  FAST_DELAY   // getName->2:  FAST_DELAY   // getName->N:  FAST_DELAY   // ofs = 54742 ord = 1 addr = 0
	aload_0 
	aload_0_getfield LONG_DELAY   // get_name_1:  LONG_DELAY   // get_name_2:  LONG_DELAY   // get_Name:    LONG_DELAY   // getName->1:  LONG_DELAY   // getName->2:  LONG_DELAY   // getName->N:  LONG_DELAY   // ofs = 54738 ord = 0 addr = 0
	putfield delay   // get_name_1:  delay   // get_name_2:  delay   // get_Name:    delay   // getName->1:  delay   // getName->2:  delay   // getName->N:  delay   // ofs = 54758 ord = 5 addr = 0
	aload_0 
	bipush -1
	putfield timerID   // get_name_1:  timerID   // get_name_2:  timerID   // get_Name:    timerID   // getName->1:  timerID   // getName->2:  timerID   // getName->N:  timerID   // ofs = 54762 ord = 6 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.MinivanScreen$DelayedPopupHFM.routine_7722( com.whatsapp.client.MinivanScreen$DelayedPopupHFM ); // address: 0
	{
	enter 
	aload_0 
	invokespecial com.whatsapp.client.MinivanScreen$DelayedPopupHFM.getPopupManager // pc=1
	astore_1 
	aload_1 
	ifnull Label13
	aload_0_getfield popup   // get_name_1:  popup   // get_name_2:  popup   // get_Name:    popup   // getName->1:  popup   // getName->2:  popup   // getName->N:  popup   // ofs = 54746 ord = 2 addr = 0
	ifnonnull Label13
	aload_1 
	aload_0_getfield popup   // get_name_1:  popup   // get_name_2:  popup   // get_Name:    popup   // getName->1:  popup   // getName->2:  popup   // getName->N:  popup   // ofs = 54746 ord = 2 addr = 0
	aload_0_getfield popupOwner   // get_name_1:  popupOwner   // get_name_2:  popupOwner   // get_Name:    popupOwner   // getName->1:  popupOwner   // getName->2:  popupOwner   // getName->N:  popupOwner   // ofs = 54750 ord = 3 addr = 0
	invokeinterface interfacemethodref_48 // pc=3 guess=7
	return 
Label13:
	invokestatic_lib long currentTimeMillis(  ) // System
	lstore 2
	aload_0 
	lload 2
	aload_0_getfield delay   // get_name_1:  delay   // get_name_2:  delay   // get_Name:    delay   // getName->1:  delay   // getName->2:  delay   // getName->N:  delay   // ofs = 54758 ord = 5 addr = 0
	i2l 
	ladd 
	lputfield deadline   // get_name_1:  deadline   // get_name_2:  deadline   // get_Name:    deadline   // getName->1:  deadline   // getName->2:  deadline   // getName->N:  deadline   // ofs = 54754 ord = 4 addr = 0
	aload_0 
	lload 2
	invokespecial com.whatsapp.client.MinivanScreen$DelayedPopupHFM.scheduleTimer // pc=3
	return 
	}


private final scheduleTimer( com.whatsapp.client.MinivanScreen$DelayedPopupHFM, long ); // address: 0
	{
	enter 
	aload_0_getfield timerID   // get_name_1:  timerID   // get_name_2:  timerID   // get_Name:    timerID   // getName->1:  timerID   // getName->2:  timerID   // getName->N:  timerID   // ofs = 54762 ord = 6 addr = 0
	bipush -1
	if_icmpne Label20
	aload_0 
	invokestatic_lib net.rim.device.api.ui.UiApplication getUiApplication(  ) // UiApplication
	new MinivanScreen$DelayedPopupHFM$1
	dup 
	aload_0 
	invokespecial com.whatsapp.client.MinivanScreen$DelayedPopupHFM$1.<init> // pc=2
	iconst_1 
	i2l 
	aload_0 
	lgetfield deadline   // get_name_1:  deadline   // get_name_2:  deadline   // get_Name:    deadline   // getName->1:  deadline   // getName->2:  deadline   // getName->N:  deadline   // ofs = 54754 ord = 4 addr = 0
	lload 1
	lsub 
	invokestatic_lib long max( long, long ) // Math
	iconst_0 
	invokevirtual int invokeLater( net.rim.device.api.system.Application, java.lang.Runnable, long, boolean ) // pc=5
	putfield timerID   // get_name_1:  timerID   // get_name_2:  timerID   // get_Name:    timerID   // getName->1:  timerID   // getName->2:  timerID   // getName->N:  timerID   // ofs = 54762 ord = 6 addr = 0
Label20:
	return 
	}


private final module:WhatsApp-37.class#8 getPopupManager( com.whatsapp.client.MinivanScreen$DelayedPopupHFM ); // address: 0
	{
	enter 
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

public final setPopup( com.whatsapp.client.MinivanScreen$DelayedPopupHFM, net.rim.device.api.ui.Field, net.rim.device.api.ui.Field ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	putfield popup   // get_name_1:  popup   // get_name_2:  popup   // get_Name:    popup   // getName->1:  popup   // getName->2:  popup   // getName->N:  popup   // ofs = 54746 ord = 2 addr = 0
	aload_0 
	aload_2 
	putfield popupOwner   // get_name_1:  popupOwner   // get_name_2:  popupOwner   // get_Name:    popupOwner   // getName->1:  popupOwner   // getName->2:  popupOwner   // getName->N:  popupOwner   // ofs = 54750 ord = 3 addr = 0
	aload_0 
	invokespecial com.whatsapp.client.MinivanScreen$DelayedPopupHFM.routine_7722 // pc=1
	return 
	}


protected final onUnfocus( com.whatsapp.client.MinivanScreen$DelayedPopupHFM ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_0_getfield LONG_DELAY   // get_name_1:  LONG_DELAY   // get_name_2:  LONG_DELAY   // get_Name:    LONG_DELAY   // getName->1:  LONG_DELAY   // getName->2:  LONG_DELAY   // getName->N:  LONG_DELAY   // ofs = 54738 ord = 0 addr = 0
	putfield delay   // get_name_1:  delay   // get_name_2:  delay   // get_Name:    delay   // getName->1:  delay   // getName->2:  delay   // getName->N:  delay   // ofs = 54758 ord = 5 addr = 0
	aload_0_getfield timerID   // get_name_1:  timerID   // get_name_2:  timerID   // get_Name:    timerID   // getName->1:  timerID   // getName->2:  timerID   // getName->N:  timerID   // ofs = 54762 ord = 6 addr = 0
	bipush -1
	if_icmpeq Label13
	invokestatic_lib net.rim.device.api.ui.UiApplication getUiApplication(  ) // UiApplication
	aload_0_getfield timerID   // get_name_1:  timerID   // get_name_2:  timerID   // get_Name:    timerID   // getName->1:  timerID   // getName->2:  timerID   // getName->N:  timerID   // ofs = 54762 ord = 6 addr = 0
	invokevirtual cancelInvokeLater( net.rim.device.api.system.Application, int ) // pc=2
	aload_0 
	bipush -1
	putfield timerID   // get_name_1:  timerID   // get_name_2:  timerID   // get_Name:    timerID   // getName->1:  timerID   // getName->2:  timerID   // getName->N:  timerID   // ofs = 54762 ord = 6 addr = 0
Label13:
	aload_0 
	invokespecial_lib net.rim.device.api.ui.Manager.onUnfocus // pc=1
	return 
	}


public final getFocusRect( com.whatsapp.client.MinivanScreen$DelayedPopupHFM, net.rim.device.api.ui.XYRect ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.Manager.getFocusRect // pc=2
	aload_1 
	iconst_0 
	putfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 0 addr = -1
	aload_1 
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	putfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 1 addr = -1
	return 
	}

}
