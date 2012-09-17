// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-1.cod
// Module version  : 2.8.1914
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


abstract public final class AnimatedSliderManager extends net.rim.device.api.ui.Manager

{
	// @@@@@@@@@@@@@ Static fields 
	private final static int /*int*/  field_54274 ; // ofs = 54274 addr = 2)

	// @@@@@@@@@@@@@ Fields 
	private long /*long*/  style ; // ofs = 54206 addr = 0)
	private net.rim.device.api.ui.Field /*net.rim.device.api.ui.Field*/  field_54210 ; // ofs = 54210 addr = 0)
	private net.rim.device.api.ui.Field /*net.rim.device.api.ui.Field*/  animatedOverlay ; // ofs = 54214 addr = 0)
	private boolean /*boolean*/  animationSequenceRunning ; // ofs = 54218 addr = 0)
	private Runnable /*java.lang.Runnable*/  pendingRunnable ; // ofs = 54222 addr = 0)
	private java.util.Vector /*java.util.Vector*/  field_54226 ; // ofs = 54226 addr = 0)
	private Long /*java.lang.Long*/  field_54230 ; // ofs = 54230 addr = 0)
	private long /*long*/  field_54234 ; // ofs = 54234 addr = 0)
	private int /*int*/  field_54238 ; // ofs = 54238 addr = 0)
	private int /*int*/  field_54242 ; // ofs = 54242 addr = 0)
	private int /*int*/  field_54246 ; // ofs = 54246 addr = 0)
	final java.util.Timer /*java.util.Timer*/  animationTimer ; // ofs = 54250 addr = 0)
	private int /*int*/  state ; // ofs = 54254 addr = 0)
	private net.rim.device.api.ui.Field /*net.rim.device.api.ui.Field*/  persistentOverlay ; // ofs = 54258 addr = 0)
	private int /*int*/  pushTimerId ; // ofs = 54262 addr = 0)
	private long /*long*/  field_54266 ; // ofs = 54266 addr = 0)
	private com.whatsapp.client. /*module:WhatsApp.class#17*/  listener ; // ofs = 54270 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.AnimatedSliderManager, long, long ); // address: 0
	{
	enter 
	aload_0 
	iconst_0 
	i2l 
	invokespecial_lib net.rim.device.api.ui.Manager.<init> // pc=3
	aload_0 
	iconst_0 
	putfield animationSequenceRunning   // get_name_1:  animationSequenceRunning   // get_name_2:  animationSequenceRunning   // get_Name:    animationSequenceRunning   // getName->1:  animationSequenceRunning   // getName->2:  animationSequenceRunning   // getName->N:  animationSequenceRunning   // ofs = 54218 ord = 3 addr = 0
	aload_0 
	aconst_null 
	putfield pendingRunnable   // get_name_1:  pendingRunnable   // get_name_2:  pendingRunnable   // get_Name:    pendingRunnable   // getName->1:  pendingRunnable   // getName->2:  pendingRunnable   // getName->N:  pendingRunnable   // ofs = 54222 ord = 4 addr = 0
	aload_0 
	new_lib net.rim.device.api.ui.Manager//net.rim.device.api.ui.Manager net.rim.device.api.ui.Manager net.rim.device.api.ui.Manager
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield com.whatsapp.client.AnimatedSliderManager.field_54226   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_54226   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_54226   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_54226   // getName->1:     // getName->2:     // getName->N:     // ofs = 54226 ord = 5 addr = 0
	aload_0 
	sipush 400
	putfield com.whatsapp.client.AnimatedSliderManager.field_54238   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_54238   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_54238   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_54238   // getName->1:     // getName->2:     // getName->N:     // ofs = 54238 ord = 8 addr = 0
	aload_0 
	sipush 400
	putfield com.whatsapp.client.AnimatedSliderManager.field_54242   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_54242   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_54242   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_54242   // getName->1:     // getName->2:     // getName->N:     // ofs = 54242 ord = 9 addr = 0
	aload_0 
	new_lib Long//java.lang.Long java.lang.Long java.lang.Long
	dup 
	invokespecial_lib java.util.Timer.<init> // pc=1
	putfield animationTimer   // get_name_1:  animationTimer   // get_name_2:  animationTimer   // get_Name:    animationTimer   // getName->1:  animationTimer   // getName->2:  animationTimer   // getName->N:  animationTimer   // ofs = 54250 ord = 11 addr = 0
	aload_0 
	bipush 4
	putfield state   // get_name_1:  state   // get_name_2:  state   // get_Name:    state   // getName->1:  state   // getName->2:  state   // getName->N:  state   // ofs = 54254 ord = 12 addr = 0
	aload_0 
	bipush -1
	putfield pushTimerId   // get_name_1:  pushTimerId   // get_name_2:  pushTimerId   // get_Name:    pushTimerId   // getName->1:  pushTimerId   // getName->2:  pushTimerId   // getName->N:  pushTimerId   // ofs = 54262 ord = 14 addr = 0
	aload_0 
	lload 1
	lputfield style   // get_name_1:  style   // get_name_2:  style   // get_Name:    style   // getName->1:  style   // getName->2:  style   // getName->N:  style   // ofs = 54206 ord = 0 addr = 0
	aload_0 
	lload 3
	lputfield com.whatsapp.client.AnimatedSliderManager.field_54234   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_54234   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_54234   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_54234   // getName->1:     // getName->2:     // getName->N:     // ofs = 54234 ord = 7 addr = 0
	aload_0 
	invokestatic_lib long currentTimeMillis(  ) // System
	lputfield com.whatsapp.client.AnimatedSliderManager.field_54266   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_54266   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_54266   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_54266   // getName->1:     // getName->2:     // getName->N:     // ofs = 54266 ord = 15 addr = 0
	return 
	}


static final access$1700( com.whatsapp.client.AnimatedSliderManager ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual updateLayout( net.rim.device.api.ui.Field ) // pc=1
	return 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	clinit_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	synch_static AnimatedSliderManager
	clinit_wait 
	invokestatic_lib int getVerticalResolution(  ) // Display
	putstatic com.whatsapp.client.AnimatedSliderManager.field_54274 // AnimatedSliderManager
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.AnimatedSliderManager.routine_581( com.whatsapp.client.AnimatedSliderManager ); // address: 0
	{
	enter_narrow 
	aload_0_getfield pushTimerId   // get_name_1:  pushTimerId   // get_name_2:  pushTimerId   // get_Name:    pushTimerId   // getName->1:  pushTimerId   // getName->2:  pushTimerId   // getName->N:  pushTimerId   // ofs = 54262 ord = 14 addr = 0
	bipush -1
	if_icmpeq Label10
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	aload_0_getfield pushTimerId   // get_name_1:  pushTimerId   // get_name_2:  pushTimerId   // get_Name:    pushTimerId   // getName->1:  pushTimerId   // getName->2:  pushTimerId   // getName->N:  pushTimerId   // ofs = 54262 ord = 14 addr = 0
	invokevirtual cancelInvokeLater( net.rim.device.api.system.Application, int ) // pc=2
	aload_0 
	bipush -1
	putfield pushTimerId   // get_name_1:  pushTimerId   // get_name_2:  pushTimerId   // get_Name:    pushTimerId   // getName->1:  pushTimerId   // getName->2:  pushTimerId   // getName->N:  pushTimerId   // ofs = 54262 ord = 14 addr = 0
Label10:
	return 
	}


private final boolean isStateAnimating( com.whatsapp.client.AnimatedSliderManager ); // address: 0
	{
	enter 
	aload_0_getfield state   // get_name_1:  state   // get_name_2:  state   // get_Name:    state   // getName->1:  state   // getName->2:  state   // getName->N:  state   // ofs = 54254 ord = 12 addr = 0
	iconst_1 
	if_icmpeq Label7
	aload_0_getfield state   // get_name_1:  state   // get_name_2:  state   // get_Name:    state   // getName->1:  state   // getName->2:  state   // getName->N:  state   // ofs = 54254 ord = 12 addr = 0
	bipush 2
	if_icmpne Label9
Label7:
	iconst_1 
	ireturn 
Label9:
	iconst_0 
	ireturn 
	}


private final startAnimationSequence( com.whatsapp.client.AnimatedSliderManager ); // address: 0
	{
	enter 
	aload_0_getfield animationSequenceRunning   // get_name_1:  animationSequenceRunning   // get_name_2:  animationSequenceRunning   // get_Name:    animationSequenceRunning   // getName->1:  animationSequenceRunning   // getName->2:  animationSequenceRunning   // getName->N:  animationSequenceRunning   // ofs = 54218 ord = 3 addr = 0
	ifeq Label4
	return 
Label4:
	aload_0 
	invokespecial com.whatsapp.client.AnimatedSliderManager.animationSequence // pc=1
	return 
	}


private final animationSequence( com.whatsapp.client.AnimatedSliderManager ); // address: 0
	{
	enter 
	aload_0 
	iconst_1 
	putfield animationSequenceRunning   // get_name_1:  animationSequenceRunning   // get_name_2:  animationSequenceRunning   // get_Name:    animationSequenceRunning   // getName->1:  animationSequenceRunning   // getName->2:  animationSequenceRunning   // getName->N:  animationSequenceRunning   // ofs = 54218 ord = 3 addr = 0
	aload_0_getfield com.whatsapp.client.AnimatedSliderManager.field_54226   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_54226   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_54226   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_54226   // getName->1:     // getName->2:     // getName->N:     // ofs = 54226 ord = 5 addr = 0
	invokevirtual boolean isEmpty( java.util.Vector ) // pc=1
	ifeq Label16
	aload_0_getfield persistentOverlay   // get_name_1:  persistentOverlay   // get_name_2:  persistentOverlay   // get_Name:    persistentOverlay   // getName->1:  persistentOverlay   // getName->2:  persistentOverlay   // getName->N:  persistentOverlay   // ofs = 54258 ord = 13 addr = 0
	ifnonnull Label16
	aload_0 
	bipush 4
	putfield state   // get_name_1:  state   // get_name_2:  state   // get_Name:    state   // getName->1:  state   // getName->2:  state   // getName->N:  state   // ofs = 54254 ord = 12 addr = 0
	aload_0 
	iconst_0 
	putfield animationSequenceRunning   // get_name_1:  animationSequenceRunning   // get_name_2:  animationSequenceRunning   // get_Name:    animationSequenceRunning   // getName->1:  animationSequenceRunning   // getName->2:  animationSequenceRunning   // getName->N:  animationSequenceRunning   // ofs = 54218 ord = 3 addr = 0
	return 
Label16:
	aload_0_getfield persistentOverlay   // get_name_1:  persistentOverlay   // get_name_2:  persistentOverlay   // get_Name:    persistentOverlay   // getName->1:  persistentOverlay   // getName->2:  persistentOverlay   // getName->N:  persistentOverlay   // ofs = 54258 ord = 13 addr = 0
	ifnull Label34
	aload_0 
	aload_0_getfield persistentOverlay   // get_name_1:  persistentOverlay   // get_name_2:  persistentOverlay   // get_Name:    persistentOverlay   // getName->1:  persistentOverlay   // getName->2:  persistentOverlay   // getName->N:  persistentOverlay   // ofs = 54258 ord = 13 addr = 0
	putfield animatedOverlay   // get_name_1:  animatedOverlay   // get_name_2:  animatedOverlay   // get_Name:    animatedOverlay   // getName->1:  animatedOverlay   // getName->2:  animatedOverlay   // getName->N:  animatedOverlay   // ofs = 54214 ord = 2 addr = 0
	aload_0 
	aload_0_getfield animatedOverlay   // get_name_1:  animatedOverlay   // get_name_2:  animatedOverlay   // get_Name:    animatedOverlay   // getName->1:  animatedOverlay   // getName->2:  animatedOverlay   // getName->N:  animatedOverlay   // ofs = 54214 ord = 2 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	iconst_1 
	putfield state   // get_name_1:  state   // get_name_2:  state   // get_Name:    state   // getName->1:  state   // getName->2:  state   // getName->N:  state   // ofs = 54254 ord = 12 addr = 0
	aload_0 
	new_lib com.whatsapp.client.AnimatedSliderManager$4//module:WhatsApp.class#10 module:WhatsApp.class#10 module:WhatsApp.class#10
	dup 
	aload_0 
	invokespecial_lib .routine_3854 // pc=2
	invokespecial com.whatsapp.client.AnimatedSliderManager.startAnimation // pc=2
	return 
Label34:
	aload_0 
	aload_0_getfield com.whatsapp.client.AnimatedSliderManager.field_54226   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_54226   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_54226   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_54226   // getName->1:     // getName->2:     // getName->N:     // ofs = 54226 ord = 5 addr = 0
	iconst_0 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib net.rim.device.api.ui.Field//net.rim.device.api.ui.Field net.rim.device.api.ui.Field net.rim.device.api.ui.Field
	putfield animatedOverlay   // get_name_1:  animatedOverlay   // get_name_2:  animatedOverlay   // get_Name:    animatedOverlay   // getName->1:  animatedOverlay   // getName->2:  animatedOverlay   // getName->N:  animatedOverlay   // ofs = 54214 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.client.AnimatedSliderManager.field_54226   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_54226   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_54226   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_54226   // getName->1:     // getName->2:     // getName->N:     // ofs = 54226 ord = 5 addr = 0
	iconst_0 
	invokevirtual removeElementAt( java.util.Vector, int ) // pc=2
	aload_0 
	aload_0_getfield animatedOverlay   // get_name_1:  animatedOverlay   // get_name_2:  animatedOverlay   // get_Name:    animatedOverlay   // getName->1:  animatedOverlay   // getName->2:  animatedOverlay   // getName->N:  animatedOverlay   // ofs = 54214 ord = 2 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	iconst_1 
	putfield state   // get_name_1:  state   // get_name_2:  state   // get_Name:    state   // getName->1:  state   // getName->2:  state   // getName->N:  state   // ofs = 54254 ord = 12 addr = 0
	aload_0 
	new_lib com.whatsapp.client.AnimatedSliderManager$5//module:WhatsApp.class#11 module:WhatsApp.class#11 module:WhatsApp.class#11
	dup 
	aload_0 
	invokespecial_lib .routine_3893 // pc=2
	invokespecial com.whatsapp.client.AnimatedSliderManager.startAnimation // pc=2
	return 
	}


private final com.whatsapp.client.AnimatedSliderManager.routine_799( com.whatsapp.client.AnimatedSliderManager, java.lang.Runnable, long ); // address: 0
	{
	enter 
	aload_0_getfield animationTimer   // get_name_1:  animationTimer   // get_name_2:  animationTimer   // get_Name:    animationTimer   // getName->1:  animationTimer   // getName->2:  animationTimer   // getName->N:  animationTimer   // ofs = 54250 ord = 11 addr = 0
	new_lib com.whatsapp.client.AnimatedSliderManager$6//module:WhatsApp.class#12 module:WhatsApp.class#12 module:WhatsApp.class#12
	dup 
	aload_0 
	aload_1 
	invokespecial_lib .routine_3947 // pc=3
	lload 2
	invokevirtual schedule( java.util.Timer, java.util.TimerTask, long ) // pc=4
	return 
	}


private final holdAndAnimateNext( com.whatsapp.client.AnimatedSliderManager ); // address: 0
	{
	enter 
	invokestatic_lib boolean isEnabled(  ) // Backlight
	ifne Label12
	aload_0 
	lgetfield style   // get_name_1:  style   // get_name_2:  style   // get_Name:    style   // getName->1:  style   // getName->2:  style   // getName->N:  style   // ofs = 54206 ord = 0 addr = 0
	bipush 2
	i2l 
	land 
	iconst_0 
	i2l 
	lcmp 
	ifne Label15
Label12:
	aload_0 
	lgetfield com.whatsapp.client.AnimatedSliderManager.field_54234   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_54234   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_54234   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_54234   // getName->1:     // getName->2:     // getName->N:     // ofs = 54234 ord = 7 addr = 0
	goto Label20
Label15:
	aload_0 
	lgetfield com.whatsapp.client.AnimatedSliderManager.field_54234   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_54234   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_54234   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_54234   // getName->1:     // getName->2:     // getName->N:     // ofs = 54234 ord = 7 addr = 0
	bipush 2
	i2l 
	lmul 
Label20:
	lstore 1
	aload_0 
	new_lib com.whatsapp.client.AnimatedSliderManager$7//module:WhatsApp.class#14 module:WhatsApp.class#14 module:WhatsApp.class#14
	dup 
	aload_0 
	invokespecial_lib .routine_4105 // pc=2
	lload 1
	invokespecial com.whatsapp.client.AnimatedSliderManager.routine_799 // pc=4
	return 
	}


private final boolean incrementalUpdate( com.whatsapp.client.AnimatedSliderManager ); // address: 0
	{
	enter 
	aload_0_getfield animatedOverlay   // get_name_1:  animatedOverlay   // get_name_2:  animatedOverlay   // get_Name:    animatedOverlay   // getName->1:  animatedOverlay   // getName->2:  animatedOverlay   // getName->N:  animatedOverlay   // ofs = 54214 ord = 2 addr = 0
	instanceof_lib com.whatsapp.client.AnimatedSliderManager$IncrementalUpdate//module:WhatsApp.class#16 module:WhatsApp.class#16 module:WhatsApp.class#16
	ifne Label6
	iconst_0 
	ireturn 
Label6:
	aload_0_getfield com.whatsapp.client.AnimatedSliderManager.field_54226   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_54226   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_54226   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_54226   // getName->1:     // getName->2:     // getName->N:     // ofs = 54226 ord = 5 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	ifne Label11
	iconst_0 
	ireturn 
Label11:
	aload_0_getfield com.whatsapp.client.AnimatedSliderManager.field_54226   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_54226   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_54226   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_54226   // getName->1:     // getName->2:     // getName->N:     // ofs = 54226 ord = 5 addr = 0
	iconst_0 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib net.rim.device.api.ui.Field//net.rim.device.api.ui.Field net.rim.device.api.ui.Field net.rim.device.api.ui.Field
	astore_1 
	aload_1 
	instanceof_lib com.whatsapp.client.AnimatedSliderManager$IncrementalUpdate//module:WhatsApp.class#16 module:WhatsApp.class#16 module:WhatsApp.class#16
	ifne Label21
	iconst_0 
	ireturn 
Label21:
	aload_0_getfield animatedOverlay   // get_name_1:  animatedOverlay   // get_name_2:  animatedOverlay   // get_Name:    animatedOverlay   // getName->1:  animatedOverlay   // getName->2:  animatedOverlay   // getName->N:  animatedOverlay   // ofs = 54214 ord = 2 addr = 0
	checkcast_lib com.whatsapp.client.AnimatedSliderManager$IncrementalUpdate//module:WhatsApp.class#16 module:WhatsApp.class#16 module:WhatsApp.class#16
	aload_1 
	checkcast_lib com.whatsapp.client.AnimatedSliderManager$IncrementalUpdate//module:WhatsApp.class#16 module:WhatsApp.class#16 module:WhatsApp.class#16
	invokeinterface interfacemethodref_3 // pc=2 guess=1
	istore_2 
	iload_2 
	ifeq Label32
	aload_0_getfield com.whatsapp.client.AnimatedSliderManager.field_54226   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_54226   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_54226   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_54226   // getName->1:     // getName->2:     // getName->N:     // ofs = 54226 ord = 5 addr = 0
	iconst_0 
	invokevirtual removeElementAt( java.util.Vector, int ) // pc=2
Label32:
	iload_2 
	ireturn 
	}


private final startAnimation( com.whatsapp.client.AnimatedSliderManager, java.lang.Runnable ); // address: 0
	{
	enter 
	aload_0 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokestatic_lib long currentTimeMillis(  ) // System
	invokespecial_lib java.lang.Long.<init> // pc=3
	putfield com.whatsapp.client.AnimatedSliderManager.field_54230   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_54230   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_54230   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_54230   // getName->1:     // getName->2:     // getName->N:     // ofs = 54230 ord = 6 addr = 0
	aload_0_getfield animationTimer   // get_name_1:  animationTimer   // get_name_2:  animationTimer   // get_Name:    animationTimer   // getName->1:  animationTimer   // getName->2:  animationTimer   // getName->N:  animationTimer   // ofs = 54250 ord = 11 addr = 0
	new AnimatedSliderManager$8
	dup 
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.AnimatedSliderManager$8.<init> // pc=3
	iconst_0 
	i2l 
	bipush 83
	i2l 
	invokevirtual schedule( java.util.Timer, java.util.TimerTask, long, long ) // pc=6
	return 
	}


private final int com.whatsapp.client.AnimatedSliderManager.routine_1034( com.whatsapp.client.AnimatedSliderManager, int ); // address: 0
	{
	enter 
	aload_0_getfield state   // get_name_1:  state   // get_name_2:  state   // get_Name:    state   // getName->1:  state   // getName->2:  state   // getName->N:  state   // ofs = 54254 ord = 12 addr = 0
	iconst_1 
	if_icmpne Label6
	iconst_1 
	goto Label7
Label6:
	iconst_0 
Label7:
	istore_2 
	aload_0_getfield state   // get_name_1:  state   // get_name_2:  state   // get_Name:    state   // getName->1:  state   // getName->2:  state   // getName->N:  state   // ofs = 54254 ord = 12 addr = 0
	bipush 2
	if_icmpne Label13
	iconst_1 
	goto Label14
Label13:
	iconst_0 
Label14:
	istore_3 
	iload_2 
	ifne Label19
	iload_3 
	ifeq Label70
Label19:
	iload_2 
	ifeq Label23
	aload_0_getfield com.whatsapp.client.AnimatedSliderManager.field_54238   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_54238   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_54238   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_54238   // getName->1:     // getName->2:     // getName->N:     // ofs = 54238 ord = 8 addr = 0
	goto Label24
Label23:
	aload_0_getfield com.whatsapp.client.AnimatedSliderManager.field_54242   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_54242   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_54242   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_54242   // getName->1:     // getName->2:     // getName->N:     // ofs = 54242 ord = 9 addr = 0
Label24:
	istore_4 
	invokestatic_lib long currentTimeMillis(  ) // System
	aload_0_getfield com.whatsapp.client.AnimatedSliderManager.field_54230   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_54230   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_54230   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_54230   // getName->1:     // getName->2:     // getName->N:     // ofs = 54230 ord = 6 addr = 0
	invokevirtual long longValue( java.lang.Long ) // pc=1
	lsub 
	lstore 5
	iload_4 
	getstatic com.whatsapp.client.AnimatedSliderManager.field_54274 // AnimatedSliderManager
	imul 
	sipush 1000
	idiv 
	i2l 
	lstore 7
	lload 5
	lload 7
	lmul 
	iipush 60000
	i2l 
	ldiv 
	lstore 9
	lload 9
	iload_1 
	i2l 
	lcmp 
	ifle Label59
	aload_0 
	iload_2 
	ifeq Label54
	bipush 3
	goto Label55
Label54:
	bipush 4
Label55:
	putfield state   // get_name_1:  state   // get_name_2:  state   // get_Name:    state   // getName->1:  state   // getName->2:  state   // getName->N:  state   // ofs = 54254 ord = 12 addr = 0
	iload_1 
	istore 11
	goto Label62
Label59:
	lload 9
	l2i 
	istore 11
Label62:
	iload_2 
	ifeq Label66
	iload 11
	ireturn 
Label66:
	iload_1 
	iload 11
	isub 
	ireturn 
Label70:
	aload_0_getfield state   // get_name_1:  state   // get_name_2:  state   // get_Name:    state   // getName->1:  state   // getName->2:  state   // getName->N:  state   // ofs = 54254 ord = 12 addr = 0
	bipush 4
	if_icmpne Label75
	iconst_0 
	ireturn 
Label75:
	aload_0_getfield state   // get_name_1:  state   // get_name_2:  state   // get_Name:    state   // getName->1:  state   // getName->2:  state   // getName->N:  state   // ofs = 54254 ord = 12 addr = 0
	bipush 3
	if_icmpne Label80
	iload_1 
	ireturn 
Label80:
	new_lib net.rim.device.api.system.Backlight//net.rim.device.api.system.Backlight net.rim.device.api.system.Backlight net.rim.device.api.system.Backlight
	dup 
	ldc literal_85:"Invalid animation state"
	invokespecial_lib java.lang.RuntimeException.<init> // pc=2
	athrow 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final setListener( com.whatsapp.client.AnimatedSliderManager, module:WhatsApp.class#17 ); // address: 0
	{
	putfield_return listener   // get_name_1:  listener   // get_name_2:  listener   // get_Name:    listener   // getName->1:  listener   // getName->2:  listener   // getName->N:  listener   // ofs = 54270 ord = 16 addr = 0
	}


protected final onDisplay( com.whatsapp.client.AnimatedSliderManager ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib net.rim.device.api.ui.ScrollView.onDisplay // pc=1
	aload_0 
	invokestatic_lib long currentTimeMillis(  ) // System
	lputfield com.whatsapp.client.AnimatedSliderManager.field_54266   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_54266   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_54266   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_54266   // getName->1:     // getName->2:     // getName->N:     // ofs = 54266 ord = 15 addr = 0
	return 
	}


protected final onUndisplay( com.whatsapp.client.AnimatedSliderManager ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial com.whatsapp.client.AnimatedSliderManager.routine_581 // pc=1
	aload_0 
	invokespecial_lib net.rim.device.api.ui.ScrollView.onUndisplay // pc=1
	return 
	}


public final setMillimetersPerMinuteIn( com.whatsapp.client.AnimatedSliderManager, int ); // address: 0
	{
	putfield_return com.whatsapp.client.AnimatedSliderManager.field_54238   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_54238   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_54238   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_54238   // getName->1:     // getName->2:     // getName->N:     // ofs = 54238 ord = 8 addr = 0
	}


public final setMillimetersPerMinuteOut( com.whatsapp.client.AnimatedSliderManager, int ); // address: 0
	{
	putfield_return com.whatsapp.client.AnimatedSliderManager.field_54242   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_54242   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_54242   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_54242   // getName->1:     // getName->2:     // getName->N:     // ofs = 54242 ord = 9 addr = 0
	}


public final setContent( com.whatsapp.client.AnimatedSliderManager, net.rim.device.api.ui.Field ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.AnimatedSliderManager.field_54210   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_54210   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_54210   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_54210   // getName->1:     // getName->2:     // getName->N:     // ofs = 54210 ord = 1 addr = 0
	ifnull Label6
	aload_0 
	aload_0_getfield com.whatsapp.client.AnimatedSliderManager.field_54210   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_54210   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_54210   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_54210   // getName->1:     // getName->2:     // getName->N:     // ofs = 54210 ord = 1 addr = 0
	invokevirtual delete( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
Label6:
	aload_0 
	aload_1 
	putfield com.whatsapp.client.AnimatedSliderManager.field_54210   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_54210   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_54210   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_54210   // getName->1:     // getName->2:     // getName->N:     // ofs = 54210 ord = 1 addr = 0
	aload_0 
	aload_1 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	return 
	}


public final setBackgroundColor( com.whatsapp.client.AnimatedSliderManager, int ); // address: 0
	{
	putfield_return com.whatsapp.client.AnimatedSliderManager.field_54246   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_54246   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_54246   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_54246   // getName->1:     // getName->2:     // getName->N:     // ofs = 54246 ord = 10 addr = 0
	}


public final backlightOn( com.whatsapp.client.AnimatedSliderManager ); // address: 0
	{
	enter_narrow 
	aload_0_getfield pendingRunnable   // get_name_1:  pendingRunnable   // get_name_2:  pendingRunnable   // get_Name:    pendingRunnable   // getName->1:  pendingRunnable   // getName->2:  pendingRunnable   // getName->N:  pendingRunnable   // ofs = 54222 ord = 4 addr = 0
	ifnull Label8
	aload_0_getfield pendingRunnable   // get_name_1:  pendingRunnable   // get_name_2:  pendingRunnable   // get_Name:    pendingRunnable   // getName->1:  pendingRunnable   // getName->2:  pendingRunnable   // getName->N:  pendingRunnable   // ofs = 54222 ord = 4 addr = 0
	invokeinterface interfacemethodref_2 // pc=1 guess=0
	aload_0 
	aconst_null 
	putfield pendingRunnable   // get_name_1:  pendingRunnable   // get_name_2:  pendingRunnable   // get_Name:    pendingRunnable   // getName->1:  pendingRunnable   // getName->2:  pendingRunnable   // getName->N:  pendingRunnable   // ofs = 54222 ord = 4 addr = 0
Label8:
	return 
	}


public final clear( com.whatsapp.client.AnimatedSliderManager ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial com.whatsapp.client.AnimatedSliderManager.routine_581 // pc=1
	aload_0_getfield com.whatsapp.client.AnimatedSliderManager.field_54226   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_54226   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_54226   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_54226   // getName->1:     // getName->2:     // getName->N:     // ofs = 54226 ord = 5 addr = 0
	invokevirtual removeAllElements( java.util.Vector ) // pc=1
	return 
	}


public final addAnimatedOverlay( com.whatsapp.client.AnimatedSliderManager, net.rim.device.api.ui.Field ); // address: 0
	{
	enter 
	invokestatic_lib long currentTimeMillis(  ) // System
	aload_0 
	lgetfield com.whatsapp.client.AnimatedSliderManager.field_54266   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_54266   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_54266   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_54266   // getName->1:     // getName->2:     // getName->N:     // ofs = 54266 ord = 15 addr = 0
	lsub 
	lstore 2
	aload_0_getfield persistentOverlay   // get_name_1:  persistentOverlay   // get_name_2:  persistentOverlay   // get_Name:    persistentOverlay   // getName->1:  persistentOverlay   // getName->2:  persistentOverlay   // getName->N:  persistentOverlay   // ofs = 54258 ord = 13 addr = 0
	ifnonnull Label34
	aload_0_getfield com.whatsapp.client.AnimatedSliderManager.field_54226   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_54226   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_54226   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_54226   // getName->1:     // getName->2:     // getName->N:     // ofs = 54226 ord = 5 addr = 0
	aload_1 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	lload 2
	sipush 750
	i2l 
	lcmp 
	ifge Label32
	aload_0 
	invokespecial com.whatsapp.client.AnimatedSliderManager.routine_581 // pc=1
	aload_0 
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	new_lib com.whatsapp.client.AnimatedSliderManager$1//module:WhatsApp.class#7 module:WhatsApp.class#7 module:WhatsApp.class#7
	dup 
	aload_0 
	invokespecial_lib .routine_3711 // pc=2
	sipush 750
	i2l 
	lload 2
	lsub 
	iconst_0 
	invokevirtual int invokeLater( net.rim.device.api.system.Application, java.lang.Runnable, long, boolean ) // pc=5
	putfield pushTimerId   // get_name_1:  pushTimerId   // get_name_2:  pushTimerId   // get_Name:    pushTimerId   // getName->1:  pushTimerId   // getName->2:  pushTimerId   // getName->N:  pushTimerId   // ofs = 54262 ord = 14 addr = 0
	return 
Label32:
	aload_0 
	invokespecial com.whatsapp.client.AnimatedSliderManager.startAnimationSequence // pc=1
Label34:
	return 
	}


public final setPersistentOverlay( com.whatsapp.client.AnimatedSliderManager, net.rim.device.api.ui.Field ); // address: 0
	{
	enter 
	invokestatic_lib long currentTimeMillis(  ) // System
	aload_0 
	lgetfield com.whatsapp.client.AnimatedSliderManager.field_54266   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_54266   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_54266   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_54266   // getName->1:     // getName->2:     // getName->N:     // ofs = 54266 ord = 15 addr = 0
	lsub 
	lstore 2
	aload_0 
	aload_1 
	putfield persistentOverlay   // get_name_1:  persistentOverlay   // get_name_2:  persistentOverlay   // get_Name:    persistentOverlay   // getName->1:  persistentOverlay   // getName->2:  persistentOverlay   // getName->N:  persistentOverlay   // ofs = 54258 ord = 13 addr = 0
	lload 2
	sipush 750
	i2l 
	lcmp 
	ifge Label30
	aload_0 
	invokespecial com.whatsapp.client.AnimatedSliderManager.routine_581 // pc=1
	aload_0 
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	new_lib com.whatsapp.client.AnimatedSliderManager$2//module:WhatsApp.class#8 module:WhatsApp.class#8 module:WhatsApp.class#8
	dup 
	aload_0 
	invokespecial_lib .routine_3756 // pc=2
	sipush 750
	i2l 
	lload 2
	lsub 
	iconst_0 
	invokevirtual int invokeLater( net.rim.device.api.system.Application, java.lang.Runnable, long, boolean ) // pc=5
	putfield pushTimerId   // get_name_1:  pushTimerId   // get_name_2:  pushTimerId   // get_Name:    pushTimerId   // getName->1:  pushTimerId   // getName->2:  pushTimerId   // getName->N:  pushTimerId   // ofs = 54262 ord = 14 addr = 0
	return 
Label30:
	aload_0 
	invokespecial com.whatsapp.client.AnimatedSliderManager.startAnimationSequence // pc=1
	return 
	}


public final clearPersistentOverlay( com.whatsapp.client.AnimatedSliderManager ); // address: 0
	{
	enter 
	aload_0_getfield persistentOverlay   // get_name_1:  persistentOverlay   // get_name_2:  persistentOverlay   // get_Name:    persistentOverlay   // getName->1:  persistentOverlay   // getName->2:  persistentOverlay   // getName->N:  persistentOverlay   // ofs = 54258 ord = 13 addr = 0
	ifnull Label12
	aload_0 
	bipush 2
	putfield state   // get_name_1:  state   // get_name_2:  state   // get_Name:    state   // getName->1:  state   // getName->2:  state   // getName->N:  state   // ofs = 54254 ord = 12 addr = 0
	aload_0 
	new_lib com.whatsapp.client.AnimatedSliderManager$3//module:WhatsApp.class#9 module:WhatsApp.class#9 module:WhatsApp.class#9
	dup 
	aload_0 
	invokespecial_lib .routine_3817 // pc=2
	invokespecial com.whatsapp.client.AnimatedSliderManager.startAnimation // pc=2
Label12:
	return 
	}


protected final paint( com.whatsapp.client.AnimatedSliderManager, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter_narrow 
	aload_1 
	aload_0_getfield com.whatsapp.client.AnimatedSliderManager.field_54246   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_54246   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_54246   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_54246   // getName->1:     // getName->2:     // getName->N:     // ofs = 54246 ord = 10 addr = 0
	invokevirtual setBackgroundColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	invokevirtual clear( net.rim.device.api.ui.Graphics ) // pc=1
	aload_0 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.Manager.paint // pc=2
	return 
	}


protected final sublayout( com.whatsapp.client.AnimatedSliderManager, int, int ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.AnimatedSliderManager.field_54210   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_54210   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_54210   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_54210   // getName->1:     // getName->2:     // getName->N:     // ofs = 54210 ord = 1 addr = 0
	ifnull Label13
	aload_0 
	aload_0_getfield com.whatsapp.client.AnimatedSliderManager.field_54210   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_54210   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_54210   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_54210   // getName->1:     // getName->2:     // getName->N:     // ofs = 54210 ord = 1 addr = 0
	iload_1 
	iload_2 
	invokevirtual layoutChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
	aload_0 
	aload_0_getfield com.whatsapp.client.AnimatedSliderManager.field_54210   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_54210   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_54210   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_54210   // getName->1:     // getName->2:     // getName->N:     // ofs = 54210 ord = 1 addr = 0
	iconst_0 
	iconst_0 
	invokevirtual setPositionChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
Label13:
	iconst_0 
	istore_3 
	aload_0_getfield com.whatsapp.client.AnimatedSliderManager.field_54210   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_54210   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_54210   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_54210   // getName->1:     // getName->2:     // getName->N:     // ofs = 54210 ord = 1 addr = 0
	ifnull Label20
	aload_0_getfield com.whatsapp.client.AnimatedSliderManager.field_54210   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_54210   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_54210   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_54210   // getName->1:     // getName->2:     // getName->N:     // ofs = 54210 ord = 1 addr = 0
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	goto Label21
Label20:
	iconst_0 
Label21:
	istore_4 
	aload_0_getfield animatedOverlay   // get_name_1:  animatedOverlay   // get_name_2:  animatedOverlay   // get_Name:    animatedOverlay   // getName->1:  animatedOverlay   // getName->2:  animatedOverlay   // getName->N:  animatedOverlay   // ofs = 54214 ord = 2 addr = 0
	ifnull Label61
	aload_0_getfield animatedOverlay   // get_name_1:  animatedOverlay   // get_name_2:  animatedOverlay   // get_Name:    animatedOverlay   // getName->1:  animatedOverlay   // getName->2:  animatedOverlay   // getName->N:  animatedOverlay   // ofs = 54214 ord = 2 addr = 0
	invokevirtual int getMarginLeft( net.rim.device.api.ui.Field ) // pc=1
	aload_0_getfield animatedOverlay   // get_name_1:  animatedOverlay   // get_name_2:  animatedOverlay   // get_Name:    animatedOverlay   // getName->1:  animatedOverlay   // getName->2:  animatedOverlay   // getName->N:  animatedOverlay   // ofs = 54214 ord = 2 addr = 0
	invokevirtual int getMarginRight( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	istore_5 
	aload_0_getfield animatedOverlay   // get_name_1:  animatedOverlay   // get_name_2:  animatedOverlay   // get_Name:    animatedOverlay   // getName->1:  animatedOverlay   // getName->2:  animatedOverlay   // getName->N:  animatedOverlay   // ofs = 54214 ord = 2 addr = 0
	invokevirtual int getMarginTop( net.rim.device.api.ui.Field ) // pc=1
	aload_0_getfield animatedOverlay   // get_name_1:  animatedOverlay   // get_name_2:  animatedOverlay   // get_Name:    animatedOverlay   // getName->1:  animatedOverlay   // getName->2:  animatedOverlay   // getName->N:  animatedOverlay   // ofs = 54214 ord = 2 addr = 0
	invokevirtual int getMarginBottom( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	istore_6 
	aload_0 
	aload_0_getfield animatedOverlay   // get_name_1:  animatedOverlay   // get_name_2:  animatedOverlay   // get_Name:    animatedOverlay   // getName->1:  animatedOverlay   // getName->2:  animatedOverlay   // getName->N:  animatedOverlay   // ofs = 54214 ord = 2 addr = 0
	iload_1 
	iload_5 
	isub 
	iload_2 
	iload_6 
	isub 
	invokevirtual layoutChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
	aload_0 
	aload_0_getfield animatedOverlay   // get_name_1:  animatedOverlay   // get_name_2:  animatedOverlay   // get_Name:    animatedOverlay   // getName->1:  animatedOverlay   // getName->2:  animatedOverlay   // getName->N:  animatedOverlay   // ofs = 54214 ord = 2 addr = 0
	iconst_0 
	aload_0_getfield animatedOverlay   // get_name_1:  animatedOverlay   // get_name_2:  animatedOverlay   // get_Name:    animatedOverlay   // getName->1:  animatedOverlay   // getName->2:  animatedOverlay   // getName->N:  animatedOverlay   // ofs = 54214 ord = 2 addr = 0
	invokevirtual int getMarginLeft( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	iload_4 
	aload_0_getfield animatedOverlay   // get_name_1:  animatedOverlay   // get_name_2:  animatedOverlay   // get_Name:    animatedOverlay   // getName->1:  animatedOverlay   // getName->2:  animatedOverlay   // getName->N:  animatedOverlay   // ofs = 54214 ord = 2 addr = 0
	invokevirtual int getMarginTop( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	invokevirtual setPositionChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
	aload_0_getfield animatedOverlay   // get_name_1:  animatedOverlay   // get_name_2:  animatedOverlay   // get_Name:    animatedOverlay   // getName->1:  animatedOverlay   // getName->2:  animatedOverlay   // getName->N:  animatedOverlay   // ofs = 54214 ord = 2 addr = 0
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	iload_6 
	iadd 
	istore_3 
Label61:
	aload_0 
	iload_3 
	invokespecial com.whatsapp.client.AnimatedSliderManager.routine_1034 // pc=2
	istore_5 
	aload_0_getfield com.whatsapp.client.AnimatedSliderManager.field_54210   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_54210   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_54210   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_54210   // getName->1:     // getName->2:     // getName->N:     // ofs = 54210 ord = 1 addr = 0
	ifnull Label70
	aload_0_getfield com.whatsapp.client.AnimatedSliderManager.field_54210   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_54210   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_54210   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_54210   // getName->1:     // getName->2:     // getName->N:     // ofs = 54210 ord = 1 addr = 0
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	goto Label71
Label70:
	iload_1 
Label71:
	istore_6 
	aload_0 
	iload_6 
	iload_4 
	iload_5 
	iadd 
	invokevirtual setExtent( net.rim.device.api.ui.ScrollView, int, int ) // pc=3
	return 
	}

}
