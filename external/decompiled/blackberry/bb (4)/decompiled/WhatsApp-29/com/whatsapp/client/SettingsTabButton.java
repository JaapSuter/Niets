// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-29.cod
// Module version  : 2.7.3204
// Class ID        : 6
// ########################################################


package com.whatsapp.client;


abstract public final class SettingsTabButton extends com.whatsapp.client.TabButton

{

	// @@@@@@@@@@@@@ Fields 
	private com.whatsapp.client. /*module:WhatsApp-19.class#14[]*/  field_54434 ; // ofs = 54434 addr = 0)
	private boolean /*boolean*/  field_54438 ; // ofs = 54438 addr = 0)
	private int /*int*/  field_54442 ; // ofs = 54442 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.SettingsTabButton, module:WhatsApp-25.class#0 ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	invokespecial_lib .routine_8625 // pc=2
	aload_0 
	bipush 6
	newarray_object_lib com.whatsapp.client.IconTextListField$Item//module:WhatsApp-19.class#14 module:WhatsApp-19.class#14 module:WhatsApp-19.class#14
	dup 
	iconst_0 
	new_lib com.whatsapp.client.SettingsTabButton$1//module:WhatsApp-28.class#25 module:WhatsApp-28.class#25 module:WhatsApp-28.class#25
	dup 
	aload_0 
	ldc literal_57:"accountinfo.png"
	sipush 312
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	sipush 896
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokespecial_lib .routine_7778 // pc=5
	aastore 
	dup 
	iconst_1 
	new SettingsTabButton$2
	dup 
	aload_0 
	ldc literal_58:"profiles.png"
	sipush 281
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	sipush 897
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokespecial com.whatsapp.client.SettingsTabButton$2.<init> // pc=5
	aastore 
	dup 
	bipush 2
	new SettingsTabButton$3
	dup 
	aload_0 
	ldc literal_59:"blockedusers.png"
	sipush 663
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	sipush 898
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokespecial com.whatsapp.client.SettingsTabButton$3.<init> // pc=5
	aastore 
	dup 
	bipush 3
	new SettingsTabButton$4
	dup 
	aload_0 
	ldc literal_60:"icon-media.png"
	sipush 887
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	sipush 899
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokespecial com.whatsapp.client.SettingsTabButton$4.<init> // pc=5
	aastore 
	dup 
	bipush 4
	new SettingsTabButton$5
	dup 
	aload_0 
	ldc literal_61:"advanced.png"
	sipush 722
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	sipush 900
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokespecial com.whatsapp.client.SettingsTabButton$5.<init> // pc=5
	aastore 
	dup 
	bipush 5
	new SettingsTabButton$6
	dup 
	aload_0 
	ldc literal_62:"tellafriendcolor.png"
	bipush 106
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	sipush 926
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokespecial com.whatsapp.client.SettingsTabButton$6.<init> // pc=5
	aastore 
	putfield com.whatsapp.client.SettingsTabButton.field_54434   // get_name_1:  com.whatsapp.client.SettingsTabButton.field_54434   // get_name_2:  com.whatsapp.client.SettingsTabButton.field_54434   // get_Name:    com.whatsapp.client.SettingsTabButton.field_54434   // getName->1:     // getName->2:     // getName->N:     // ofs = 54434 ord = 0 addr = 0
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.SettingsTabButton.field_54438   // get_name_1:  com.whatsapp.client.SettingsTabButton.field_54438   // get_name_2:  com.whatsapp.client.SettingsTabButton.field_54438   // get_Name:    com.whatsapp.client.SettingsTabButton.field_54438   // getName->1:     // getName->2:     // getName->N:     // ofs = 54438 ord = 1 addr = 0
	aload_0_getfield com.whatsapp.client.SettingsTabButton.field_54434   // get_name_1:  com.whatsapp.client.SettingsTabButton.field_54434   // get_name_2:  com.whatsapp.client.SettingsTabButton.field_54434   // get_Name:    com.whatsapp.client.SettingsTabButton.field_54434   // getName->1:     // getName->2:     // getName->N:     // ofs = 54434 ord = 0 addr = 0
	iconst_0 
	aaload 
	iconst_0 
	invokenonvirtual_lib .routine_7818 // pc=2
	astore_2 
	aload_0 
	invokestatic_lib net.rim.device.api.ui.Font getDefault(  ) // Font
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	bipush 5
	imul 
	bipush 2
	idiv 
	aload_2 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	if_icmpge Label101
	iconst_1 
	goto Label102
Label101:
	iconst_0 
Label102:
	putfield com.whatsapp.client.SettingsTabButton.field_54438   // get_name_1:  com.whatsapp.client.SettingsTabButton.field_54438   // get_name_2:  com.whatsapp.client.SettingsTabButton.field_54438   // get_Name:    com.whatsapp.client.SettingsTabButton.field_54438   // getName->1:     // getName->2:     // getName->N:     // ofs = 54438 ord = 1 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.SettingsTabButton.field_54434   // get_name_1:  com.whatsapp.client.SettingsTabButton.field_54434   // get_name_2:  com.whatsapp.client.SettingsTabButton.field_54434   // get_Name:    com.whatsapp.client.SettingsTabButton.field_54434   // getName->1:     // getName->2:     // getName->N:     // ofs = 54434 ord = 0 addr = 0
	iconst_0 
	aaload 
	aload_0_getfield com.whatsapp.client.SettingsTabButton.field_54438   // get_name_1:  com.whatsapp.client.SettingsTabButton.field_54438   // get_name_2:  com.whatsapp.client.SettingsTabButton.field_54438   // get_Name:    com.whatsapp.client.SettingsTabButton.field_54438   // getName->1:     // getName->2:     // getName->N:     // ofs = 54438 ord = 1 addr = 0
	invokenonvirtual_lib .routine_7818 // pc=2
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	putfield com.whatsapp.client.SettingsTabButton.field_54442   // get_name_1:  com.whatsapp.client.SettingsTabButton.field_54442   // get_name_2:  com.whatsapp.client.SettingsTabButton.field_54442   // get_Name:    com.whatsapp.client.SettingsTabButton.field_54442   // getName->1:     // getName->2:     // getName->N:     // ofs = 54442 ord = 2 addr = 0
	aload_0 
	aload_0 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	invokespecial com.whatsapp.client.SettingsTabButton.routine_4024 // pc=2
	putfield _rowHeight   // get_name_1:  _rowHeight   // get_name_2:  _rowHeight   // get_Name:    _rowHeight   // getName->1:  _rowHeight   // getName->2:  _rowHeight   // getName->N:  _rowHeight   // ofs = -1 ord = 1 addr = -1
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final pushScreenWithWipe( com.whatsapp.client.SettingsTabButton, net.rim.device.api.ui.Screen ); // address: 0
	{
	enter 
	aload_0 
	iconst_1 
	invokespecial com.whatsapp.client.SettingsTabButton.routine_3889 // pc=2
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	astore_2 
	aload_2 
	aload_1 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}


private final com.whatsapp.client.SettingsTabButton.routine_3889( com.whatsapp.client.SettingsTabButton, boolean ); // address: 0
	{
	enter 
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	astore_2 
	aload_2 
	invokevirtual net.rim.device.api.ui.Screen getActiveScreen( net.rim.device.api.ui.UiApplication ) // pc=1
	astore_3 
	iload_1 
	ifeq Label49
	new_lib net.rim.device.api.system.RuntimeStore//net.rim.device.api.system.RuntimeStore net.rim.device.api.system.RuntimeStore net.rim.device.api.system.RuntimeStore
	dup 
	bipush 2
	invokespecial_lib net.rim.device.api.ui.TransitionContext.<init> // pc=2
	astore_4 
	aload_4 
	bipush 4
	bipush 2
	invokevirtual setIntAttribute( net.rim.device.api.ui.TransitionContext, int, int ) // pc=3
	new_lib net.rim.device.api.system.RuntimeStore//net.rim.device.api.system.RuntimeStore net.rim.device.api.system.RuntimeStore net.rim.device.api.system.RuntimeStore
	dup 
	bipush 2
	invokespecial_lib net.rim.device.api.ui.TransitionContext.<init> // pc=2
	astore_5 
	aload_5 
	bipush 2
	bipush 2
	invokevirtual setIntAttribute( net.rim.device.api.ui.TransitionContext, int, int ) // pc=3
	aload_5 
	bipush 3
	bipush 2
	invokevirtual setIntAttribute( net.rim.device.api.ui.TransitionContext, int, int ) // pc=3
	aload_5 
	bipush 4
	bipush 2
	invokevirtual setIntAttribute( net.rim.device.api.ui.TransitionContext, int, int ) // pc=3
	aload_2 
	invokevirtual net.rim.device.api.ui.UiEngineInstance getUiEngineInstance( net.rim.device.api.ui.UiApplication ) // pc=1
	aload_3 
	aconst_null 
	bipush 7
	aload_4 
	invokevirtual setTransition( net.rim.device.api.ui.UiEngineInstance, net.rim.device.api.ui.Screen, net.rim.device.api.ui.Screen, int, net.rim.device.api.ui.TransitionContext ) // pc=5
	aload_2 
	invokevirtual net.rim.device.api.ui.UiEngineInstance getUiEngineInstance( net.rim.device.api.ui.UiApplication ) // pc=1
	aconst_null 
	aload_3 
	bipush 56
	aload_5 
	invokevirtual setTransition( net.rim.device.api.ui.UiEngineInstance, net.rim.device.api.ui.Screen, net.rim.device.api.ui.Screen, int, net.rim.device.api.ui.TransitionContext ) // pc=5
	return 
Label49:
	aload_2 
	new SettingsTabButton$7
	dup 
	aload_0 
	aload_2 
	aload_3 
	invokespecial com.whatsapp.client.SettingsTabButton$7.<init> // pc=4
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	return 
	}


private final int com.whatsapp.client.SettingsTabButton.routine_4024( com.whatsapp.client.SettingsTabButton, net.rim.device.api.ui.Font ); // address: 0
	{
	enter 
	aload_1 
	iconst_0 
	aload_1 
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	bipush 70
	imul 
	bipush 100
	idiv 
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int, int ) // pc=3
	astore_2 
	aload_2 
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	istore_3 
	aload_1 
	invokestatic_lib com.whatsapp.client.TabButton.routine_8667(  ) // TabButton
	bipush 6
	aload_0_getfield com.whatsapp.client.SettingsTabButton.field_54442   // get_name_1:  com.whatsapp.client.SettingsTabButton.field_54442   // get_name_2:  com.whatsapp.client.SettingsTabButton.field_54442   // get_Name:    com.whatsapp.client.SettingsTabButton.field_54442   // getName->1:     // getName->2:     // getName->N:     // ofs = 54442 ord = 2 addr = 0
	iadd 
	bipush 6
	iadd 
	invokestatic_lib int max( int, int ) // Math
	bipush 6
	aload_1 
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	iadd 
	iload_3 
	iadd 
	iload_3 
	iadd 
	bipush 6
	iadd 
	invokestatic_lib int max( int, int ) // Math
	ireturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final onExposed( com.whatsapp.client.SettingsTabButton ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_0 
	invokespecial com.whatsapp.client.SettingsTabButton.routine_3889 // pc=2
	aload_0 
	invokespecial_lib net.rim.device.api.ui.Field.onExposed // pc=1
	return 
	}


public final drawListRow( com.whatsapp.client.SettingsTabButton, net.rim.device.api.ui.Graphics, int, int, int, boolean ); // address: 0
	{
	enter 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	iload_2 
	invokenonvirtual_lib .routine_61 // pc=2
	checkcast_lib com.whatsapp.client.IconTextListField$Item//module:WhatsApp-19.class#14 module:WhatsApp-19.class#14 module:WhatsApp-19.class#14
	astore_6 
	aload_6 
	aload_0_getfield com.whatsapp.client.SettingsTabButton.field_54438   // get_name_1:  com.whatsapp.client.SettingsTabButton.field_54438   // get_name_2:  com.whatsapp.client.SettingsTabButton.field_54438   // get_Name:    com.whatsapp.client.SettingsTabButton.field_54438   // getName->1:     // getName->2:     // getName->N:     // ofs = 54438 ord = 1 addr = 0
	invokenonvirtual_lib .routine_7818 // pc=2
	astore_7 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	astore 8
	aload 8
	iconst_0 
	aload 8
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	bipush 4
	isub 
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int, int ) // pc=3
	astore 9
	aload_1 
	aload_7 
	aload_6 
	invokenonvirtual_lib .routine_7859 // pc=1
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	aload_6 
	invokenonvirtual_lib .routine_7870 // pc=1
	aload 8
	aload 8
	aload 9
	iload_5 
	ifeq Label35
	aconst_null 
	goto Label39
Label35:
	new_lib net.rim.device.api.ui.TransitionContext//net.rim.device.api.ui.TransitionContext net.rim.device.api.ui.TransitionContext net.rim.device.api.ui.TransitionContext
	dup 
	iipush 5066061
	invokespecial_lib java.lang.Integer.<init> // pc=2
Label39:
	iload_3 
	aload_0_getfield com.whatsapp.client.SettingsTabButton.field_54442   // get_name_1:  com.whatsapp.client.SettingsTabButton.field_54442   // get_name_2:  com.whatsapp.client.SettingsTabButton.field_54442   // get_Name:    com.whatsapp.client.SettingsTabButton.field_54442   // getName->1:     // getName->2:     // getName->N:     // ofs = 54442 ord = 2 addr = 0
	iload_4 
	aload_0_getfield _rowHeight   // get_name_1:  _rowHeight   // get_name_2:  _rowHeight   // get_Name:    _rowHeight   // getName->1:  _rowHeight   // getName->2:  _rowHeight   // getName->N:  _rowHeight   // ofs = -1 ord = 1 addr = -1
	iload_5 
	invokestatic_lib module:WhatsApp-19.class#12.routine_6346(  ) // class#12
	return 
	}


public final java.util.Vector filterList( com.whatsapp.client.SettingsTabButton, java.lang.String, int ); // address: 0
	{
	enter 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_3 
	iconst_0 
	istore_4 
Label7:
	iload_4 
	aload_0_getfield com.whatsapp.client.SettingsTabButton.field_54434   // get_name_1:  com.whatsapp.client.SettingsTabButton.field_54434   // get_name_2:  com.whatsapp.client.SettingsTabButton.field_54434   // get_Name:    com.whatsapp.client.SettingsTabButton.field_54434   // getName->1:     // getName->2:     // getName->N:     // ofs = 54434 ord = 0 addr = 0
	arraylength 
	if_icmpge Label18
	aload_3 
	aload_0_getfield com.whatsapp.client.SettingsTabButton.field_54434   // get_name_1:  com.whatsapp.client.SettingsTabButton.field_54434   // get_name_2:  com.whatsapp.client.SettingsTabButton.field_54434   // get_Name:    com.whatsapp.client.SettingsTabButton.field_54434   // getName->1:     // getName->2:     // getName->N:     // ofs = 54434 ord = 0 addr = 0
	iload_4 
	aaload 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	iinc 4 1
	goto Label7
Label18:
	aload_3 
	areturn 
	}


public final net.rim.device.api.system.Bitmap getIcon( com.whatsapp.client.SettingsTabButton ); // address: 0
	{
	enter_narrow 
	ldc literal_54:"settings"
	invokestatic_lib module:WhatsApp-9.class#2.routine_1887(  ) // class#2
	areturn 
	}


public final net.rim.device.api.system.Bitmap getContextIcon( com.whatsapp.client.SettingsTabButton ); // address: 0
	{
	enter_narrow 
	ldc literal_55:"tell-a-friend"
	invokestatic_lib module:WhatsApp-9.class#2.routine_1887(  ) // class#2
	areturn 
	}


public final java.lang.String getTooltip( com.whatsapp.client.SettingsTabButton ); // address: 0
	{
	enter_narrow 
	bipush 86
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	areturn 
	}


public final java.lang.String getContextTooltip( com.whatsapp.client.SettingsTabButton ); // address: 0
	{
	enter_narrow 
	bipush 106
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	areturn 
	}


public final contextButtonClicked( com.whatsapp.client.SettingsTabButton ); // address: 0
	{
	enter_narrow 
	new_lib com.whatsapp.client.//module:WhatsApp-32.class#0 module:WhatsApp-32.class#0 module:WhatsApp-32.class#0
	dup 
	invokespecial_lib .routine_2014 // pc=1
	astore_1 
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.SettingsTabButton.pushScreenWithWipe // pc=2
	return 
	}


public final itemClicked( com.whatsapp.client.SettingsTabButton ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_79 // pc=1
	checkcast_lib com.whatsapp.client.IconTextListField$Item//module:WhatsApp-19.class#14 module:WhatsApp-19.class#14 module:WhatsApp-19.class#14
	astore_1 
	aload_1 
	invokevirtual_short .virtual_3 // idx=3 pc=1
	return 
	}


protected final showBBProfile( com.whatsapp.client.SettingsTabButton ); // address: 0
	{
	enter 
	ldc literal_56:"net_rim_bb_profiles_app"
	astore_1 
	aload_1 
	invokestatic_lib int getModuleHandle( java.lang.String ) // CodeModuleManager
	istore_2 
	iload_2 
	invokestatic_lib net.rim.device.api.system.ApplicationDescriptor[] getApplicationDescriptors( int ) // CodeModuleManager
	astore_3 
	invokestatic_lib net.rim.device.api.system.ApplicationManager getApplicationManager(  ) // ApplicationManager
	astore_4 
	aload_4 
	aload_3 
	iconst_0 
	aaload 
	invokevirtual int runApplication( net.rim.device.api.system.ApplicationManager, net.rim.device.api.system.ApplicationDescriptor ) // pc=2
	pop 
	return 
	astore_5 
	aload_5 
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib inform( java.lang.String ) // Dialog
	return 
	}

}