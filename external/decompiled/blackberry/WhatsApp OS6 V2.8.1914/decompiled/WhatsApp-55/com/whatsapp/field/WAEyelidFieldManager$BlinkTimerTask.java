// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-55.cod
// Module version  : 2.8.1914
// Class ID        : 8
// ########################################################


package com.whatsapp.field;


abstract final class WAEyelidFieldManager$BlinkTimerTask extends java.util.TimerTask

{

	// @@@@@@@@@@@@@ Fields 
	private boolean /*boolean*/  field_54672 ; // ofs = 54672 addr = 0)
	private boolean /*boolean*/  field_54676 ; // ofs = 54676 addr = 0)
	private Thread /*java.lang.Thread*/  field_54680 ; // ofs = 54680 addr = 0)
	private boolean /*boolean*/  field_54684 ; // ofs = 54684 addr = 0)
	private final com.whatsapp.field.WAEyelidFieldManager /*com.whatsapp.field.WAEyelidFieldManager*/  this$0 ; // ofs = 54688 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

private <init>( com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask, com.whatsapp.field.WAEyelidFieldManager ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.util.TimerTask.<init> // pc=1
	aload_0 
	aload_1 
	putfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54688 ord = 4 addr = 0
	aload_0 
	iconst_0 
	putfield com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask.field_54672   // get_name_1:  com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask.field_54672   // get_name_2:  com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask.field_54672   // get_Name:    com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask.field_54672   // getName->1:     // getName->2:     // getName->N:     // ofs = 54672 ord = 0 addr = 0
	aload_0 
	iconst_0 
	putfield com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask.field_54676   // get_name_1:  com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask.field_54676   // get_name_2:  com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask.field_54676   // get_Name:    com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask.field_54676   // getName->1:     // getName->2:     // getName->N:     // ofs = 54676 ord = 1 addr = 0
	aload_0 
	iconst_0 
	putfield com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask.field_54684   // get_name_1:  com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask.field_54684   // get_name_2:  com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask.field_54684   // get_Name:    com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask.field_54684   // getName->1:     // getName->2:     // getName->N:     // ofs = 54684 ord = 3 addr = 0
	return 
	}


<init>( com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask, com.whatsapp.field.WAEyelidFieldManager, module:WhatsApp-54.class#15 ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokespecial com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask.<init> // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask ); // address: 0
	{
	enter 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54688 ord = 4 addr = 0
	getfield _flagLock   // get_name_1:  _flagLock   // get_name_2:  _flagLock   // get_Name:    _flagLock   // getName->1:  _flagLock   // getName->2:  _flagLock   // getName->N:  _flagLock   // ofs = -1 ord = 0 addr = -1
	dup 
	astore_2 
	monitorenter 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54688 ord = 4 addr = 0
	iconst_0 
	putfield _eyelidsVisible   // get_name_1:  _eyelidsVisible   // get_name_2:  _eyelidsVisible   // get_Name:    _eyelidsVisible   // getName->1:  _eyelidsVisible   // getName->2:  _eyelidsVisible   // getName->N:  _eyelidsVisible   // ofs = -1 ord = 1 addr = -1
	aload_0 
	invokestatic_lib java.lang.Thread currentThread(  ) // Thread
	putfield com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask.field_54680   // get_name_1:  com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask.field_54680   // get_name_2:  com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask.field_54680   // get_Name:    com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask.field_54680   // getName->1:     // getName->2:     // getName->N:     // ofs = 54680 ord = 2 addr = 0
	aload_0 
	iconst_1 
	putfield com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask.field_54672   // get_name_1:  com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask.field_54672   // get_name_2:  com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask.field_54672   // get_Name:    com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask.field_54672   // getName->1:     // getName->2:     // getName->N:     // ofs = 54672 ord = 0 addr = 0
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54688 ord = 4 addr = 0
	getfield _animationEnabled   // get_name_1:  _animationEnabled   // get_name_2:  _animationEnabled   // get_Name:    _animationEnabled   // getName->1:  _animationEnabled   // getName->2:  _animationEnabled   // getName->N:  _animationEnabled   // ofs = -1 ord = 2 addr = -1
	istore_1 
	aload_2 
	monitorexit 
	goto Label26
	astore_3 
	aload_2 
	monitorexit 
	aload_3 
	athrow 
Label26:
	invokestatic_lib net.rim.device.api.ui.UiApplication getUiApplication(  ) // UiApplication
	new WAEyelidFieldManager$BlinkTimerTask$1
	dup 
	aload_0 
	invokespecial com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask$1.<init> // pc=2
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	iload_1 
	ifne Label35
	goto_w Label161
Label35:
	iconst_0 
	istore_2 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54688 ord = 4 addr = 0
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54688 ord = 4 addr = 0
	getfield _bottomManager   // get_name_1:  _bottomManager   // get_name_2:  _bottomManager   // get_Name:    _bottomManager   // getName->1:  _bottomManager   // getName->2:  _bottomManager   // getName->N:  _bottomManager   // ofs = -1 ord = 3 addr = -1
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	isub 
	istore_3 
	iipush 98304
	istore_4 
	iipush 131072
	istore_5 
	invokestatic_lib java.lang.Object getEventLock(  ) // UiApplication
	dup 
	astore_6 
	monitorenter 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54688 ord = 4 addr = 0
	getfield _topManager   // get_name_1:  _topManager   // get_name_2:  _topManager   // get_Name:    _topManager   // getName->1:  _topManager   // getName->2:  _topManager   // getName->N:  _topManager   // ofs = -1 ord = 4 addr = -1
	invokenonvirtual com.whatsapp.field.WAEyelidFieldManager$EyelidManager.startBlink // pc=1
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54688 ord = 4 addr = 0
	getfield _bottomManager   // get_name_1:  _bottomManager   // get_name_2:  _bottomManager   // get_Name:    _bottomManager   // getName->1:  _bottomManager   // getName->2:  _bottomManager   // getName->N:  _bottomManager   // ofs = -1 ord = 3 addr = -1
	invokenonvirtual com.whatsapp.field.WAEyelidFieldManager$EyelidManager.startBlink // pc=1
	aload_6 
	monitorexit 
	goto Label66
	astore_7 
	aload_6 
	monitorexit 
	aload_7 
	athrow 
Label66:
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54688 ord = 4 addr = 0
	getfield _topManager   // get_name_1:  _topManager   // get_name_2:  _topManager   // get_Name:    _topManager   // getName->1:  _topManager   // getName->2:  _topManager   // getName->N:  _topManager   // ofs = -1 ord = 4 addr = -1
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	ineg 
	istore_6 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54688 ord = 4 addr = 0
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	istore_7 
Label74:
	iload_2 
	iload_6 
	if_icmpne Label78
	goto_w Label161
Label78:
	iload_3 
	iload_7 
	if_icmpne Label82
	goto_w Label161
Label82:
	invokestatic_lib long currentTimeMillis(  ) // System
	lstore 8
	iload_5 
	invokestatic_lib int toRoundedInt( int ) // Fixed32
	istore 10
	iload_2 
	iload 10
	isub 
	iload_6 
	invokestatic_lib int max( int, int ) // Math
	istore_2 
	iload_3 
	iload 10
	iadd 
	iload_7 
	invokestatic_lib int min( int, int ) // Math
	istore_3 
	invokestatic_lib java.lang.Object getEventLock(  ) // UiApplication
	dup 
	astore 11
	monitorenter 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54688 ord = 4 addr = 0
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54688 ord = 4 addr = 0
	getfield _topManager   // get_name_1:  _topManager   // get_name_2:  _topManager   // get_Name:    _topManager   // getName->1:  _topManager   // getName->2:  _topManager   // getName->N:  _topManager   // ofs = -1 ord = 4 addr = -1
	iconst_0 
	iload_2 
	invokestatic_lib com.whatsapp.field.WAEyelidFieldManager.routine_7117(  ) // WAEyelidFieldManager
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54688 ord = 4 addr = 0
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54688 ord = 4 addr = 0
	getfield _bottomManager   // get_name_1:  _bottomManager   // get_name_2:  _bottomManager   // get_Name:    _bottomManager   // getName->1:  _bottomManager   // getName->2:  _bottomManager   // getName->N:  _bottomManager   // ofs = -1 ord = 3 addr = -1
	iconst_0 
	iload_3 
	invokestatic_lib com.whatsapp.field.WAEyelidFieldManager.routine_7141(  ) // WAEyelidFieldManager
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54688 ord = 4 addr = 0
	invokevirtual invalidate( net.rim.device.api.ui.Manager ) // pc=1
	aload 11
	monitorexit 
	goto Label125
	astore 12
	aload 11
	monitorexit 
	aload 12
	athrow 
Label125:
	iload_5 
	iload_4 
	invokestatic_lib int mul( int, int ) // Fixed32
	istore_5 
	invokestatic_lib long currentTimeMillis(  ) // System
	lstore 11
	bipush 40
	i2l 
	lload 11
	lload 8
	lsub 
	lsub 
	iconst_0 
	i2l 
	invokestatic_lib long max( long, long ) // Math
	invokestatic_lib sleep( long ) // Thread
	goto Label143
	astore 13
Label143:
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54688 ord = 4 addr = 0
	getfield _flagLock   // get_name_1:  _flagLock   // get_name_2:  _flagLock   // get_Name:    _flagLock   // getName->1:  _flagLock   // getName->2:  _flagLock   // getName->N:  _flagLock   // ofs = -1 ord = 0 addr = -1
	dup 
	astore 13
	monitorenter 
	aload_0_getfield com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask.field_54684   // get_name_1:  com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask.field_54684   // get_name_2:  com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask.field_54684   // get_Name:    com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask.field_54684   // getName->1:     // getName->2:     // getName->N:     // ofs = 54684 ord = 3 addr = 0
	ifeq Label153
	aload 13
	monitorexit 
	goto Label161
Label153:
	aload 13
	monitorexit 
	goto_w Label74
	astore 14
	aload 13
	monitorexit 
	aload 14
	athrow 
Label161:
	invokestatic_lib java.lang.Object getEventLock(  ) // UiApplication
	dup 
	astore_2 
	monitorenter 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54688 ord = 4 addr = 0
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54688 ord = 4 addr = 0
	getfield _topManager   // get_name_1:  _topManager   // get_name_2:  _topManager   // get_Name:    _topManager   // getName->1:  _topManager   // getName->2:  _topManager   // getName->N:  _topManager   // ofs = -1 ord = 4 addr = -1
	iconst_0 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54688 ord = 4 addr = 0
	getfield _topManager   // get_name_1:  _topManager   // get_name_2:  _topManager   // get_Name:    _topManager   // getName->1:  _topManager   // getName->2:  _topManager   // getName->N:  _topManager   // ofs = -1 ord = 4 addr = -1
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	ineg 
	invokestatic_lib com.whatsapp.field.WAEyelidFieldManager.routine_7165(  ) // WAEyelidFieldManager
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54688 ord = 4 addr = 0
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54688 ord = 4 addr = 0
	getfield _bottomManager   // get_name_1:  _bottomManager   // get_name_2:  _bottomManager   // get_Name:    _bottomManager   // getName->1:  _bottomManager   // getName->2:  _bottomManager   // getName->N:  _bottomManager   // ofs = -1 ord = 3 addr = -1
	iconst_0 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54688 ord = 4 addr = 0
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	invokestatic_lib com.whatsapp.field.WAEyelidFieldManager.routine_7189(  ) // WAEyelidFieldManager
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54688 ord = 4 addr = 0
	getfield _topManager   // get_name_1:  _topManager   // get_name_2:  _topManager   // get_Name:    _topManager   // getName->1:  _topManager   // getName->2:  _topManager   // getName->N:  _topManager   // ofs = -1 ord = 4 addr = -1
	invokenonvirtual com.whatsapp.field.WAEyelidFieldManager$EyelidManager.endBlink // pc=1
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54688 ord = 4 addr = 0
	getfield _bottomManager   // get_name_1:  _bottomManager   // get_name_2:  _bottomManager   // get_Name:    _bottomManager   // getName->1:  _bottomManager   // getName->2:  _bottomManager   // getName->N:  _bottomManager   // ofs = -1 ord = 3 addr = -1
	invokenonvirtual com.whatsapp.field.WAEyelidFieldManager$EyelidManager.endBlink // pc=1
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54688 ord = 4 addr = 0
	invokevirtual invalidate( net.rim.device.api.ui.Manager ) // pc=1
	aload_2 
	monitorexit 
	goto Label197
	astore 15
	aload_2 
	monitorexit 
	aload 15
	athrow 
Label197:
	iconst_0 
	istore_2 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54688 ord = 4 addr = 0
	getfield _flagLock   // get_name_1:  _flagLock   // get_name_2:  _flagLock   // get_Name:    _flagLock   // getName->1:  _flagLock   // getName->2:  _flagLock   // getName->N:  _flagLock   // ofs = -1 ord = 0 addr = -1
	dup 
	astore_3 
	monitorenter 
	aload_0_getfield com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask.field_54676   // get_name_1:  com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask.field_54676   // get_name_2:  com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask.field_54676   // get_Name:    com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask.field_54676   // getName->1:     // getName->2:     // getName->N:     // ofs = 54676 ord = 1 addr = 0
	ifeq Label211
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54688 ord = 4 addr = 0
	iconst_1 
	putfield _eyelidsVisible   // get_name_1:  _eyelidsVisible   // get_name_2:  _eyelidsVisible   // get_Name:    _eyelidsVisible   // getName->1:  _eyelidsVisible   // getName->2:  _eyelidsVisible   // getName->N:  _eyelidsVisible   // ofs = -1 ord = 1 addr = -1
	iconst_1 
	istore_2 
Label211:
	aload_0 
	aconst_null 
	putfield com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask.field_54680   // get_name_1:  com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask.field_54680   // get_name_2:  com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask.field_54680   // get_Name:    com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask.field_54680   // getName->1:     // getName->2:     // getName->N:     // ofs = 54680 ord = 2 addr = 0
	aload_0 
	iconst_0 
	putfield com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask.field_54672   // get_name_1:  com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask.field_54672   // get_name_2:  com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask.field_54672   // get_Name:    com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask.field_54672   // getName->1:     // getName->2:     // getName->N:     // ofs = 54672 ord = 0 addr = 0
	aload_3 
	monitorexit 
	goto Label225
	astore 16
	aload_3 
	monitorexit 
	aload 16
	athrow 
Label225:
	iload_2 
	ifeq Label241
	invokestatic_lib java.lang.Object getEventLock(  ) // UiApplication
	dup 
	astore_3 
	monitorenter 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54688 ord = 4 addr = 0
	invokespecial_lib .routine_6814 // pc=1
	aload_3 
	monitorexit 
	goto Label241
	astore 17
	aload_3 
	monitorexit 
	aload 17
	athrow 
Label241:
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54688 ord = 4 addr = 0
	invokespecial_lib .routine_6886 // pc=1
	return 
	}


public final cancelBlink( com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask ); // address: 0
	{
	enter 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54688 ord = 4 addr = 0
	getfield _timerLock   // get_name_1:  _timerLock   // get_name_2:  _timerLock   // get_Name:    _timerLock   // getName->1:  _timerLock   // getName->2:  _timerLock   // getName->N:  _timerLock   // ofs = -1 ord = 5 addr = -1
	dup 
	astore_1 
	monitorenter 
	aload_0 
	invokespecial_lib java.util.TimerTask.cancel // pc=1
	pop 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54688 ord = 4 addr = 0
	getfield _blinkTask   // get_name_1:  _blinkTask   // get_name_2:  _blinkTask   // get_Name:    _blinkTask   // getName->1:  _blinkTask   // getName->2:  _blinkTask   // getName->N:  _blinkTask   // ofs = -1 ord = 6 addr = -1
	aload_0 
	if_acmpne Label16
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54688 ord = 4 addr = 0
	aconst_null 
	putfield _blinkTask   // get_name_1:  _blinkTask   // get_name_2:  _blinkTask   // get_Name:    _blinkTask   // getName->1:  _blinkTask   // getName->2:  _blinkTask   // getName->N:  _blinkTask   // ofs = -1 ord = 6 addr = -1
Label16:
	aload_1 
	monitorexit 
	goto Label24
	astore_2 
	aload_1 
	monitorexit 
	aload_2 
	athrow 
Label24:
	iconst_0 
	istore_1 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54688 ord = 4 addr = 0
	getfield _flagLock   // get_name_1:  _flagLock   // get_name_2:  _flagLock   // get_Name:    _flagLock   // getName->1:  _flagLock   // getName->2:  _flagLock   // getName->N:  _flagLock   // ofs = -1 ord = 0 addr = -1
	dup 
	astore_2 
	monitorenter 
	aload_0_getfield com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask.field_54672   // get_name_1:  com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask.field_54672   // get_name_2:  com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask.field_54672   // get_Name:    com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask.field_54672   // getName->1:     // getName->2:     // getName->N:     // ofs = 54672 ord = 0 addr = 0
	ifeq Label37
	aload_0 
	iconst_1 
	putfield com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask.field_54676   // get_name_1:  com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask.field_54676   // get_name_2:  com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask.field_54676   // get_Name:    com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask.field_54676   // getName->1:     // getName->2:     // getName->N:     // ofs = 54676 ord = 1 addr = 0
	goto Label42
Label37:
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54688 ord = 4 addr = 0
	iconst_1 
	putfield _eyelidsVisible   // get_name_1:  _eyelidsVisible   // get_name_2:  _eyelidsVisible   // get_Name:    _eyelidsVisible   // getName->1:  _eyelidsVisible   // getName->2:  _eyelidsVisible   // getName->N:  _eyelidsVisible   // ofs = -1 ord = 1 addr = -1
	iconst_1 
	istore_1 
Label42:
	aload_2 
	monitorexit 
	goto Label50
	astore_3 
	aload_2 
	monitorexit 
	aload_3 
	athrow 
Label50:
	iload_1 
	ifeq Label54
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54688 ord = 4 addr = 0
	invokespecial_lib .routine_6814 // pc=1
Label54:
	return 
	}


public final quickFinish( com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask ); // address: 0
	{
	enter_narrow 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54688 ord = 4 addr = 0
	getfield _flagLock   // get_name_1:  _flagLock   // get_name_2:  _flagLock   // get_Name:    _flagLock   // getName->1:  _flagLock   // getName->2:  _flagLock   // getName->N:  _flagLock   // ofs = -1 ord = 0 addr = -1
	dup 
	astore_1 
	monitorenter 
	aload_0_getfield com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask.field_54680   // get_name_1:  com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask.field_54680   // get_name_2:  com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask.field_54680   // get_Name:    com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask.field_54680   // getName->1:     // getName->2:     // getName->N:     // ofs = 54680 ord = 2 addr = 0
	ifnull Label13
	aload_0 
	iconst_1 
	putfield com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask.field_54684   // get_name_1:  com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask.field_54684   // get_name_2:  com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask.field_54684   // get_Name:    com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask.field_54684   // getName->1:     // getName->2:     // getName->N:     // ofs = 54684 ord = 3 addr = 0
	aload_0_getfield com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask.field_54680   // get_name_1:  com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask.field_54680   // get_name_2:  com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask.field_54680   // get_Name:    com.whatsapp.field.WAEyelidFieldManager$BlinkTimerTask.field_54680   // getName->1:     // getName->2:     // getName->N:     // ofs = 54680 ord = 2 addr = 0
	invokevirtual interrupt( java.lang.Thread ) // pc=1
Label13:
	aload_1 
	monitorexit 
	return 
	astore_2 
	aload_1 
	monitorexit 
	aload_2 
	athrow 
	}

}
