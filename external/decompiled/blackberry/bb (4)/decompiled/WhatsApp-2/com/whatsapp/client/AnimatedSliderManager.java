// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-2.cod
// Module version  : 2.7.3204
// Class ID        : 1
// ########################################################


package com.whatsapp.client;


abstract public final class AnimatedSliderManager extends net.rim.device.api.ui.Manager

{
	// @@@@@@@@@@@@@ Static fields 
	private final static int /*int*/  field_59514 ; // ofs = 59514 addr = 4)

	// @@@@@@@@@@@@@ Fields 
	private long /*long*/  style ; // ofs = 59462 addr = 0)
	private net.rim.device.api.ui.Field /*net.rim.device.api.ui.Field*/  field_59466 ; // ofs = 59466 addr = 0)
	private net.rim.device.api.ui.Field /*net.rim.device.api.ui.Field*/  animatedOverlay ; // ofs = 59470 addr = 0)
	private boolean /*boolean*/  field_59474 ; // ofs = 59474 addr = 0)
	private Runnable /*java.lang.Runnable*/  pendingRunnable ; // ofs = 59478 addr = 0)
	private java.util.Vector /*java.util.Vector*/  field_59482 ; // ofs = 59482 addr = 0)
	private Long /*java.lang.Long*/  field_59486 ; // ofs = 59486 addr = 0)
	private long /*long*/  field_59490 ; // ofs = 59490 addr = 0)
	private int /*int*/  field_59494 ; // ofs = 59494 addr = 0)
	private int /*int*/  field_59498 ; // ofs = 59498 addr = 0)
	private int /*int*/  field_59502 ; // ofs = 59502 addr = 0)
	final java.util.Timer /*java.util.Timer*/  t ; // ofs = 59506 addr = 0)
	private int /*int*/  state ; // ofs = 59510 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

protected <init>( com.whatsapp.client.AnimatedSliderManager, long, long ); // address: 0
	{
	enter 
	aload_0 
	iconst_0 
	i2l 
	invokespecial_lib net.rim.device.api.ui.Manager.<init> // pc=3
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.AnimatedSliderManager.field_59474   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_59474   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_59474   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_59474   // getName->1:     // getName->2:     // getName->N:     // ofs = 59474 ord = 3 addr = 0
	aload_0 
	aconst_null 
	putfield pendingRunnable   // get_name_1:  pendingRunnable   // get_name_2:  pendingRunnable   // get_Name:    pendingRunnable   // getName->1:  pendingRunnable   // getName->2:  pendingRunnable   // getName->N:  pendingRunnable   // ofs = 59478 ord = 4 addr = 0
	aload_0 
	new_lib java.util.Enumeration//java.util.Enumeration java.util.Enumeration java.util.Enumeration
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield com.whatsapp.client.AnimatedSliderManager.field_59482   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_59482   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_59482   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_59482   // getName->1:     // getName->2:     // getName->N:     // ofs = 59482 ord = 5 addr = 0
	aload_0 
	sipush 400
	putfield com.whatsapp.client.AnimatedSliderManager.field_59494   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_59494   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_59494   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_59494   // getName->1:     // getName->2:     // getName->N:     // ofs = 59494 ord = 8 addr = 0
	aload_0 
	sipush 400
	putfield com.whatsapp.client.AnimatedSliderManager.field_59498   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_59498   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_59498   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_59498   // getName->1:     // getName->2:     // getName->N:     // ofs = 59498 ord = 9 addr = 0
	aload_0 
	new_lib net.rim.device.api.ui.component.Menu//net.rim.device.api.ui.component.Menu net.rim.device.api.ui.component.Menu net.rim.device.api.ui.component.Menu
	dup 
	invokespecial_lib java.util.Timer.<init> // pc=1
	putfield t   // get_name_1:  t   // get_name_2:  t   // get_Name:    t   // getName->1:  t   // getName->2:  t   // getName->N:  t   // ofs = 59506 ord = 11 addr = 0
	aload_0 
	bipush 4
	putfield state   // get_name_1:  state   // get_name_2:  state   // get_Name:    state   // getName->1:  state   // getName->2:  state   // getName->N:  state   // ofs = 59510 ord = 12 addr = 0
	aload_0 
	lload 1
	lputfield style   // get_name_1:  style   // get_name_2:  style   // get_Name:    style   // getName->1:  style   // getName->2:  style   // getName->N:  style   // ofs = 59462 ord = 0 addr = 0
	aload_0 
	lload 3
	lputfield com.whatsapp.client.AnimatedSliderManager.field_59490   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_59490   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_59490   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_59490   // getName->1:     // getName->2:     // getName->N:     // ofs = 59490 ord = 7 addr = 0
	return 
	}


static final access$1300( com.whatsapp.client.AnimatedSliderManager ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual updateLayout( net.rim.device.api.ui.Field ) // pc=1
	return 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	clinit_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	synch_static AnimatedSliderManager
	clinit_wait 
	invokestatic_lib int getVerticalResolution(  ) // Display
	putstatic com.whatsapp.client.AnimatedSliderManager.field_59514 // AnimatedSliderManager
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final boolean isStateAnimating( com.whatsapp.client.AnimatedSliderManager ); // address: 0
	{
	enter 
	aload_0_getfield state   // get_name_1:  state   // get_name_2:  state   // get_Name:    state   // getName->1:  state   // getName->2:  state   // getName->N:  state   // ofs = 59510 ord = 12 addr = 0
	iconst_1 
	if_icmpeq Label7
	aload_0_getfield state   // get_name_1:  state   // get_name_2:  state   // get_Name:    state   // getName->1:  state   // getName->2:  state   // getName->N:  state   // ofs = 59510 ord = 12 addr = 0
	bipush 2
	if_icmpne Label9
Label7:
	iconst_1 
	ireturn 
Label9:
	iconst_0 
	ireturn 
	}


private final com.whatsapp.client.AnimatedSliderManager.routine_2534( com.whatsapp.client.AnimatedSliderManager ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.AnimatedSliderManager.field_59474   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_59474   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_59474   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_59474   // getName->1:     // getName->2:     // getName->N:     // ofs = 59474 ord = 3 addr = 0
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
	putfield com.whatsapp.client.AnimatedSliderManager.field_59474   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_59474   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_59474   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_59474   // getName->1:     // getName->2:     // getName->N:     // ofs = 59474 ord = 3 addr = 0
	aload_0_getfield com.whatsapp.client.AnimatedSliderManager.field_59482   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_59482   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_59482   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_59482   // getName->1:     // getName->2:     // getName->N:     // ofs = 59482 ord = 5 addr = 0
	invokevirtual boolean isEmpty( java.util.Vector ) // pc=1
	ifeq Label14
	aload_0 
	bipush 4
	putfield state   // get_name_1:  state   // get_name_2:  state   // get_Name:    state   // getName->1:  state   // getName->2:  state   // getName->N:  state   // ofs = 59510 ord = 12 addr = 0
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.AnimatedSliderManager.field_59474   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_59474   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_59474   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_59474   // getName->1:     // getName->2:     // getName->N:     // ofs = 59474 ord = 3 addr = 0
	return 
Label14:
	aload_0 
	aload_0_getfield com.whatsapp.client.AnimatedSliderManager.field_59482   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_59482   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_59482   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_59482   // getName->1:     // getName->2:     // getName->N:     // ofs = 59482 ord = 5 addr = 0
	iconst_0 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	putfield animatedOverlay   // get_name_1:  animatedOverlay   // get_name_2:  animatedOverlay   // get_Name:    animatedOverlay   // getName->1:  animatedOverlay   // getName->2:  animatedOverlay   // getName->N:  animatedOverlay   // ofs = 59470 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.client.AnimatedSliderManager.field_59482   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_59482   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_59482   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_59482   // getName->1:     // getName->2:     // getName->N:     // ofs = 59482 ord = 5 addr = 0
	iconst_0 
	invokevirtual removeElementAt( java.util.Vector, int ) // pc=2
	aload_0 
	aload_0_getfield animatedOverlay   // get_name_1:  animatedOverlay   // get_name_2:  animatedOverlay   // get_Name:    animatedOverlay   // getName->1:  animatedOverlay   // getName->2:  animatedOverlay   // getName->N:  animatedOverlay   // ofs = 59470 ord = 2 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	iconst_1 
	putfield state   // get_name_1:  state   // get_name_2:  state   // get_Name:    state   // getName->1:  state   // getName->2:  state   // getName->N:  state   // ofs = 59510 ord = 12 addr = 0
	aload_0 
	new_lib com.whatsapp.client.AnimatedSliderManager$1//module:WhatsApp.class#7 module:WhatsApp.class#7 module:WhatsApp.class#7
	dup 
	aload_0 
	invokespecial_lib .routine_1638 // pc=2
	invokespecial com.whatsapp.client.AnimatedSliderManager.startAnimation // pc=2
	return 
	}


private final com.whatsapp.client.AnimatedSliderManager.routine_2644( com.whatsapp.client.AnimatedSliderManager, java.lang.Runnable, long ); // address: 0
	{
	enter 
	aload_0_getfield t   // get_name_1:  t   // get_name_2:  t   // get_Name:    t   // getName->1:  t   // getName->2:  t   // getName->N:  t   // ofs = 59506 ord = 11 addr = 0
	new_lib com.whatsapp.client.AnimatedSliderManager$2//module:WhatsApp.class#8 module:WhatsApp.class#8 module:WhatsApp.class#8
	dup 
	aload_0 
	aload_1 
	invokespecial_lib .routine_1694 // pc=3
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
	lgetfield style   // get_name_1:  style   // get_name_2:  style   // get_Name:    style   // getName->1:  style   // getName->2:  style   // getName->N:  style   // ofs = 59462 ord = 0 addr = 0
	bipush 2
	i2l 
	land 
	iconst_0 
	i2l 
	lcmp 
	ifne Label15
Label12:
	aload_0 
	lgetfield com.whatsapp.client.AnimatedSliderManager.field_59490   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_59490   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_59490   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_59490   // getName->1:     // getName->2:     // getName->N:     // ofs = 59490 ord = 7 addr = 0
	goto Label20
Label15:
	aload_0 
	lgetfield com.whatsapp.client.AnimatedSliderManager.field_59490   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_59490   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_59490   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_59490   // getName->1:     // getName->2:     // getName->N:     // ofs = 59490 ord = 7 addr = 0
	bipush 2
	i2l 
	lmul 
Label20:
	lstore 1
	aload_0 
	new_lib com.whatsapp.client.//module:WhatsApp-1.class#1 module:WhatsApp-1.class#1 module:WhatsApp-1.class#1
	dup 
	aload_0 
	invokespecial_lib .routine_142 // pc=2
	lload 1
	invokespecial com.whatsapp.client.AnimatedSliderManager.routine_2644 // pc=4
	return 
	}


private final boolean incrementalUpdate( com.whatsapp.client.AnimatedSliderManager ); // address: 0
	{
	enter 
	aload_0_getfield animatedOverlay   // get_name_1:  animatedOverlay   // get_name_2:  animatedOverlay   // get_Name:    animatedOverlay   // getName->1:  animatedOverlay   // getName->2:  animatedOverlay   // getName->N:  animatedOverlay   // ofs = 59470 ord = 2 addr = 0
	instanceof AnimatedSliderManager$IncrementalUpdate
	ifne Label6
	iconst_0 
	ireturn 
Label6:
	aload_0_getfield com.whatsapp.client.AnimatedSliderManager.field_59482   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_59482   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_59482   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_59482   // getName->1:     // getName->2:     // getName->N:     // ofs = 59482 ord = 5 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	ifne Label11
	iconst_0 
	ireturn 
Label11:
	aload_0_getfield com.whatsapp.client.AnimatedSliderManager.field_59482   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_59482   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_59482   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_59482   // getName->1:     // getName->2:     // getName->N:     // ofs = 59482 ord = 5 addr = 0
	iconst_0 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	astore_1 
	aload_1 
	instanceof AnimatedSliderManager$IncrementalUpdate
	ifne Label21
	iconst_0 
	ireturn 
Label21:
	aload_0_getfield animatedOverlay   // get_name_1:  animatedOverlay   // get_name_2:  animatedOverlay   // get_Name:    animatedOverlay   // getName->1:  animatedOverlay   // getName->2:  animatedOverlay   // getName->N:  animatedOverlay   // ofs = 59470 ord = 2 addr = 0
	checkcast AnimatedSliderManager$IncrementalUpdate
	aload_1 
	checkcast AnimatedSliderManager$IncrementalUpdate
	invokeinterface interfacemethodref_9 // pc=2 guess=7
	istore_2 
	iload_2 
	ifeq Label32
	aload_0_getfield com.whatsapp.client.AnimatedSliderManager.field_59482   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_59482   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_59482   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_59482   // getName->1:     // getName->2:     // getName->N:     // ofs = 59482 ord = 5 addr = 0
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
	new_lib net.rim.device.api.ui.UiApplication//net.rim.device.api.ui.UiApplication net.rim.device.api.ui.UiApplication net.rim.device.api.ui.UiApplication
	dup 
	invokestatic_lib long currentTimeMillis(  ) // System
	invokespecial_lib java.lang.Long.<init> // pc=3
	putfield com.whatsapp.client.AnimatedSliderManager.field_59486   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_59486   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_59486   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_59486   // getName->1:     // getName->2:     // getName->N:     // ofs = 59486 ord = 6 addr = 0
	aload_0_getfield t   // get_name_1:  t   // get_name_2:  t   // get_Name:    t   // getName->1:  t   // getName->2:  t   // getName->N:  t   // ofs = 59506 ord = 11 addr = 0
	new_lib com.whatsapp.client.AnimatedSliderManager$4//module:WhatsApp-1.class#3 module:WhatsApp-1.class#3 module:WhatsApp-1.class#3
	dup 
	aload_0 
	aload_1 
	invokespecial_lib .routine_263 // pc=3
	iconst_0 
	i2l 
	bipush 83
	i2l 
	invokevirtual schedule( java.util.Timer, java.util.TimerTask, long, long ) // pc=6
	return 
	}


private final int com.whatsapp.client.AnimatedSliderManager.routine_2877( com.whatsapp.client.AnimatedSliderManager, int ); // address: 0
	{
	enter 
	aload_0_getfield state   // get_name_1:  state   // get_name_2:  state   // get_Name:    state   // getName->1:  state   // getName->2:  state   // getName->N:  state   // ofs = 59510 ord = 12 addr = 0
	iconst_1 
	if_icmpne Label6
	iconst_1 
	goto Label7
Label6:
	iconst_0 
Label7:
	istore_2 
	aload_0_getfield state   // get_name_1:  state   // get_name_2:  state   // get_Name:    state   // getName->1:  state   // getName->2:  state   // getName->N:  state   // ofs = 59510 ord = 12 addr = 0
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
	aload_0_getfield com.whatsapp.client.AnimatedSliderManager.field_59494   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_59494   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_59494   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_59494   // getName->1:     // getName->2:     // getName->N:     // ofs = 59494 ord = 8 addr = 0
	goto Label24
Label23:
	aload_0_getfield com.whatsapp.client.AnimatedSliderManager.field_59498   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_59498   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_59498   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_59498   // getName->1:     // getName->2:     // getName->N:     // ofs = 59498 ord = 9 addr = 0
Label24:
	istore_4 
	invokestatic_lib long currentTimeMillis(  ) // System
	aload_0_getfield com.whatsapp.client.AnimatedSliderManager.field_59486   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_59486   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_59486   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_59486   // getName->1:     // getName->2:     // getName->N:     // ofs = 59486 ord = 6 addr = 0
	invokevirtual long longValue( java.lang.Long ) // pc=1
	lsub 
	lstore 5
	iload_4 
	getstatic com.whatsapp.client.AnimatedSliderManager.field_59514 // AnimatedSliderManager
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
	putfield state   // get_name_1:  state   // get_name_2:  state   // get_Name:    state   // getName->1:  state   // getName->2:  state   // getName->N:  state   // ofs = 59510 ord = 12 addr = 0
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
	aload_0_getfield state   // get_name_1:  state   // get_name_2:  state   // get_Name:    state   // getName->1:  state   // getName->2:  state   // getName->N:  state   // ofs = 59510 ord = 12 addr = 0
	bipush 4
	if_icmpne Label75
	iconst_0 
	ireturn 
Label75:
	aload_0_getfield state   // get_name_1:  state   // get_name_2:  state   // get_Name:    state   // getName->1:  state   // getName->2:  state   // getName->N:  state   // ofs = 59510 ord = 12 addr = 0
	bipush 3
	if_icmpne Label80
	iload_1 
	ireturn 
Label80:
	new_lib System//java.lang.System java.lang.System java.lang.System
	dup 
	ldc literal_49:"Invalid animation state"
	invokespecial_lib java.lang.RuntimeException.<init> // pc=2
	athrow 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final setMillimetersPerMinuteIn( com.whatsapp.client.AnimatedSliderManager, int ); // address: 0
	{
	putfield_return com.whatsapp.client.AnimatedSliderManager.field_59494   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_59494   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_59494   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_59494   // getName->1:     // getName->2:     // getName->N:     // ofs = 59494 ord = 8 addr = 0
	}


public final setMillimetersPerMinuteOut( com.whatsapp.client.AnimatedSliderManager, int ); // address: 0
	{
	putfield_return com.whatsapp.client.AnimatedSliderManager.field_59498   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_59498   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_59498   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_59498   // getName->1:     // getName->2:     // getName->N:     // ofs = 59498 ord = 9 addr = 0
	}


public final setContent( com.whatsapp.client.AnimatedSliderManager, net.rim.device.api.ui.Field ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.AnimatedSliderManager.field_59466   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_59466   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_59466   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_59466   // getName->1:     // getName->2:     // getName->N:     // ofs = 59466 ord = 1 addr = 0
	ifnull Label6
	aload_0 
	aload_0_getfield com.whatsapp.client.AnimatedSliderManager.field_59466   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_59466   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_59466   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_59466   // getName->1:     // getName->2:     // getName->N:     // ofs = 59466 ord = 1 addr = 0
	invokevirtual delete( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
Label6:
	aload_0 
	aload_1 
	putfield com.whatsapp.client.AnimatedSliderManager.field_59466   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_59466   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_59466   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_59466   // getName->1:     // getName->2:     // getName->N:     // ofs = 59466 ord = 1 addr = 0
	aload_0 
	aload_1 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	return 
	}


public final setBackgroundColor( com.whatsapp.client.AnimatedSliderManager, int ); // address: 0
	{
	putfield_return com.whatsapp.client.AnimatedSliderManager.field_59502   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_59502   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_59502   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_59502   // getName->1:     // getName->2:     // getName->N:     // ofs = 59502 ord = 10 addr = 0
	}


public final backlightOn( com.whatsapp.client.AnimatedSliderManager ); // address: 0
	{
	enter_narrow 
	aload_0_getfield pendingRunnable   // get_name_1:  pendingRunnable   // get_name_2:  pendingRunnable   // get_Name:    pendingRunnable   // getName->1:  pendingRunnable   // getName->2:  pendingRunnable   // getName->N:  pendingRunnable   // ofs = 59478 ord = 4 addr = 0
	ifnull Label8
	aload_0_getfield pendingRunnable   // get_name_1:  pendingRunnable   // get_name_2:  pendingRunnable   // get_Name:    pendingRunnable   // getName->1:  pendingRunnable   // getName->2:  pendingRunnable   // getName->N:  pendingRunnable   // ofs = 59478 ord = 4 addr = 0
	invokeinterface interfacemethodref_8 // pc=1 guess=6
	aload_0 
	aconst_null 
	putfield pendingRunnable   // get_name_1:  pendingRunnable   // get_name_2:  pendingRunnable   // get_Name:    pendingRunnable   // getName->1:  pendingRunnable   // getName->2:  pendingRunnable   // getName->N:  pendingRunnable   // ofs = 59478 ord = 4 addr = 0
Label8:
	return 
	}


public final clear( com.whatsapp.client.AnimatedSliderManager ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.AnimatedSliderManager.field_59482   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_59482   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_59482   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_59482   // getName->1:     // getName->2:     // getName->N:     // ofs = 59482 ord = 5 addr = 0
	invokevirtual removeAllElements( java.util.Vector ) // pc=1
	return 
	}


public final addAnimatedOverlay( com.whatsapp.client.AnimatedSliderManager, net.rim.device.api.ui.Field ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.AnimatedSliderManager.field_59482   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_59482   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_59482   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_59482   // getName->1:     // getName->2:     // getName->N:     // ofs = 59482 ord = 5 addr = 0
	aload_1 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_0 
	invokespecial com.whatsapp.client.AnimatedSliderManager.routine_2534 // pc=1
	return 
	}


protected final paint( com.whatsapp.client.AnimatedSliderManager, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter_narrow 
	aload_1 
	aload_0_getfield com.whatsapp.client.AnimatedSliderManager.field_59502   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_59502   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_59502   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_59502   // getName->1:     // getName->2:     // getName->N:     // ofs = 59502 ord = 10 addr = 0
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
	aload_0_getfield com.whatsapp.client.AnimatedSliderManager.field_59466   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_59466   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_59466   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_59466   // getName->1:     // getName->2:     // getName->N:     // ofs = 59466 ord = 1 addr = 0
	ifnull Label13
	aload_0 
	aload_0_getfield com.whatsapp.client.AnimatedSliderManager.field_59466   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_59466   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_59466   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_59466   // getName->1:     // getName->2:     // getName->N:     // ofs = 59466 ord = 1 addr = 0
	iload_1 
	iload_2 
	invokevirtual layoutChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
	aload_0 
	aload_0_getfield com.whatsapp.client.AnimatedSliderManager.field_59466   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_59466   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_59466   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_59466   // getName->1:     // getName->2:     // getName->N:     // ofs = 59466 ord = 1 addr = 0
	iconst_0 
	iconst_0 
	invokevirtual setPositionChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
Label13:
	iconst_0 
	istore_3 
	aload_0_getfield com.whatsapp.client.AnimatedSliderManager.field_59466   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_59466   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_59466   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_59466   // getName->1:     // getName->2:     // getName->N:     // ofs = 59466 ord = 1 addr = 0
	ifnull Label20
	aload_0_getfield com.whatsapp.client.AnimatedSliderManager.field_59466   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_59466   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_59466   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_59466   // getName->1:     // getName->2:     // getName->N:     // ofs = 59466 ord = 1 addr = 0
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	goto Label21
Label20:
	iconst_0 
Label21:
	istore_4 
	aload_0_getfield animatedOverlay   // get_name_1:  animatedOverlay   // get_name_2:  animatedOverlay   // get_Name:    animatedOverlay   // getName->1:  animatedOverlay   // getName->2:  animatedOverlay   // getName->N:  animatedOverlay   // ofs = 59470 ord = 2 addr = 0
	ifnull Label61
	aload_0_getfield animatedOverlay   // get_name_1:  animatedOverlay   // get_name_2:  animatedOverlay   // get_Name:    animatedOverlay   // getName->1:  animatedOverlay   // getName->2:  animatedOverlay   // getName->N:  animatedOverlay   // ofs = 59470 ord = 2 addr = 0
	invokevirtual int getMarginLeft( net.rim.device.api.ui.Field ) // pc=1
	aload_0_getfield animatedOverlay   // get_name_1:  animatedOverlay   // get_name_2:  animatedOverlay   // get_Name:    animatedOverlay   // getName->1:  animatedOverlay   // getName->2:  animatedOverlay   // getName->N:  animatedOverlay   // ofs = 59470 ord = 2 addr = 0
	invokevirtual int getMarginRight( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	istore_5 
	aload_0_getfield animatedOverlay   // get_name_1:  animatedOverlay   // get_name_2:  animatedOverlay   // get_Name:    animatedOverlay   // getName->1:  animatedOverlay   // getName->2:  animatedOverlay   // getName->N:  animatedOverlay   // ofs = 59470 ord = 2 addr = 0
	invokevirtual int getMarginTop( net.rim.device.api.ui.Field ) // pc=1
	aload_0_getfield animatedOverlay   // get_name_1:  animatedOverlay   // get_name_2:  animatedOverlay   // get_Name:    animatedOverlay   // getName->1:  animatedOverlay   // getName->2:  animatedOverlay   // getName->N:  animatedOverlay   // ofs = 59470 ord = 2 addr = 0
	invokevirtual int getMarginBottom( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	istore_6 
	aload_0 
	aload_0_getfield animatedOverlay   // get_name_1:  animatedOverlay   // get_name_2:  animatedOverlay   // get_Name:    animatedOverlay   // getName->1:  animatedOverlay   // getName->2:  animatedOverlay   // getName->N:  animatedOverlay   // ofs = 59470 ord = 2 addr = 0
	iload_1 
	iload_5 
	isub 
	iload_2 
	iload_6 
	isub 
	invokevirtual layoutChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
	aload_0 
	aload_0_getfield animatedOverlay   // get_name_1:  animatedOverlay   // get_name_2:  animatedOverlay   // get_Name:    animatedOverlay   // getName->1:  animatedOverlay   // getName->2:  animatedOverlay   // getName->N:  animatedOverlay   // ofs = 59470 ord = 2 addr = 0
	iconst_0 
	aload_0_getfield animatedOverlay   // get_name_1:  animatedOverlay   // get_name_2:  animatedOverlay   // get_Name:    animatedOverlay   // getName->1:  animatedOverlay   // getName->2:  animatedOverlay   // getName->N:  animatedOverlay   // ofs = 59470 ord = 2 addr = 0
	invokevirtual int getMarginLeft( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	iload_4 
	aload_0_getfield animatedOverlay   // get_name_1:  animatedOverlay   // get_name_2:  animatedOverlay   // get_Name:    animatedOverlay   // getName->1:  animatedOverlay   // getName->2:  animatedOverlay   // getName->N:  animatedOverlay   // ofs = 59470 ord = 2 addr = 0
	invokevirtual int getMarginTop( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	invokevirtual setPositionChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
	aload_0_getfield animatedOverlay   // get_name_1:  animatedOverlay   // get_name_2:  animatedOverlay   // get_Name:    animatedOverlay   // getName->1:  animatedOverlay   // getName->2:  animatedOverlay   // getName->N:  animatedOverlay   // ofs = 59470 ord = 2 addr = 0
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	iload_6 
	iadd 
	istore_3 
Label61:
	aload_0 
	iload_3 
	invokespecial com.whatsapp.client.AnimatedSliderManager.routine_2877 // pc=2
	istore_5 
	aload_0_getfield com.whatsapp.client.AnimatedSliderManager.field_59466   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_59466   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_59466   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_59466   // getName->1:     // getName->2:     // getName->N:     // ofs = 59466 ord = 1 addr = 0
	ifnull Label70
	aload_0_getfield com.whatsapp.client.AnimatedSliderManager.field_59466   // get_name_1:  com.whatsapp.client.AnimatedSliderManager.field_59466   // get_name_2:  com.whatsapp.client.AnimatedSliderManager.field_59466   // get_Name:    com.whatsapp.client.AnimatedSliderManager.field_59466   // getName->1:     // getName->2:     // getName->N:     // ofs = 59466 ord = 1 addr = 0
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
