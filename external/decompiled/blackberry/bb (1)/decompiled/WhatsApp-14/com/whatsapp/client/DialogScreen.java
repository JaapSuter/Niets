// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-14.cod
// Module version  : 2.7.3204
// Class ID        : 10
// ########################################################


package com.whatsapp.client;


abstract final class DialogScreen extends net.rim.device.api.ui.container.PopupScreen
implements net.rim.device.api.ui.FieldChangeListener

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.device.api.ui.component.LabelField /*net.rim.device.api.ui.component.LabelField*/  field_53626 ; // ofs = 53626 addr = 0)
	private net.rim.device.api.ui.container.VerticalFieldManager /*net.rim.device.api.ui.container.VerticalFieldManager*/  field_53630 ; // ofs = 53630 addr = 0)
	private net.rim.device.api.ui.component.RichTextField /*net.rim.device.api.ui.component.RichTextField*/  field_53634 ; // ofs = 53634 addr = 0)
	private String /*java.lang.String*/  field_53638 ; // ofs = 53638 addr = 0)
	private String /*java.lang.String*/  field_53642 ; // ofs = 53642 addr = 0)
	private com.whatsapp.client.CustomItem /*com.whatsapp.client.CustomItem[]*/  field_53646 ; // ofs = 53646 addr = 0)
	private Object /*java.lang.Object[]*/  field_53650 ; // ofs = 53650 addr = 0)
	private Object /*java.lang.Object*/  field_53654 ; // ofs = 53654 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.DialogScreen ); // address: 0
	{
	enter 
	aload_0 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	lipush 299067162755072
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.<init> // pc=3
	lipush 299067162755072
	invokespecial_lib net.rim.device.api.ui.container.PopupScreen.<init> // pc=4
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.DialogScreen.routine_2682( com.whatsapp.client.DialogScreen, java.lang.Object ); // address: 0
	{
	enter_narrow 
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	astore_2 
	aload_2 
	aload_0 
	invokevirtual popScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final setTitle( com.whatsapp.client.DialogScreen, java.lang.String ); // address: 0
	{
	putfield_return com.whatsapp.client.DialogScreen.field_53638   // get_name_1:  com.whatsapp.client.DialogScreen.field_53638   // get_name_2:  com.whatsapp.client.DialogScreen.field_53638   // get_Name:    com.whatsapp.client.DialogScreen.field_53638   // getName->1:     // getName->2:     // getName->N:     // ofs = 53638 ord = 3 addr = 0
	}


public final setMessage( com.whatsapp.client.DialogScreen, java.lang.String ); // address: 0
	{
	putfield_return com.whatsapp.client.DialogScreen.field_53642   // get_name_1:  com.whatsapp.client.DialogScreen.field_53642   // get_name_2:  com.whatsapp.client.DialogScreen.field_53642   // get_Name:    com.whatsapp.client.DialogScreen.field_53642   // getName->1:     // getName->2:     // getName->N:     // ofs = 53642 ord = 4 addr = 0
	}


public final setButtonInfo( com.whatsapp.client.DialogScreen, com.whatsapp.client.CustomItem[] ); // address: 0
	{
	putfield_return com.whatsapp.client.DialogScreen.field_53646   // get_name_1:  com.whatsapp.client.DialogScreen.field_53646   // get_name_2:  com.whatsapp.client.DialogScreen.field_53646   // get_Name:    com.whatsapp.client.DialogScreen.field_53646   // getName->1:     // getName->2:     // getName->N:     // ofs = 53646 ord = 5 addr = 0
	}


public final setButtonReturnValues( com.whatsapp.client.DialogScreen, java.lang.Object[] ); // address: 0
	{
	putfield_return com.whatsapp.client.DialogScreen.field_53650   // get_name_1:  com.whatsapp.client.DialogScreen.field_53650   // get_name_2:  com.whatsapp.client.DialogScreen.field_53650   // get_Name:    com.whatsapp.client.DialogScreen.field_53650   // getName->1:     // getName->2:     // getName->N:     // ofs = 53650 ord = 6 addr = 0
	}


public final setCancelReturnValue( com.whatsapp.client.DialogScreen, java.lang.Object ); // address: 0
	{
	putfield_return com.whatsapp.client.DialogScreen.field_53654   // get_name_1:  com.whatsapp.client.DialogScreen.field_53654   // get_name_2:  com.whatsapp.client.DialogScreen.field_53654   // get_Name:    com.whatsapp.client.DialogScreen.field_53654   // getName->1:     // getName->2:     // getName->N:     // ofs = 53654 ord = 7 addr = 0
	}


public final reset( com.whatsapp.client.DialogScreen ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual deleteAll( net.rim.device.api.ui.Manager ) // pc=1
	aload_0 
	aconst_null 
	putfield com.whatsapp.client.DialogScreen.field_53638   // get_name_1:  com.whatsapp.client.DialogScreen.field_53638   // get_name_2:  com.whatsapp.client.DialogScreen.field_53638   // get_Name:    com.whatsapp.client.DialogScreen.field_53638   // getName->1:     // getName->2:     // getName->N:     // ofs = 53638 ord = 3 addr = 0
	aload_0 
	aconst_null 
	putfield com.whatsapp.client.DialogScreen.field_53642   // get_name_1:  com.whatsapp.client.DialogScreen.field_53642   // get_name_2:  com.whatsapp.client.DialogScreen.field_53642   // get_Name:    com.whatsapp.client.DialogScreen.field_53642   // getName->1:     // getName->2:     // getName->N:     // ofs = 53642 ord = 4 addr = 0
	aload_0 
	aconst_null 
	putfield com.whatsapp.client.DialogScreen.field_53646   // get_name_1:  com.whatsapp.client.DialogScreen.field_53646   // get_name_2:  com.whatsapp.client.DialogScreen.field_53646   // get_Name:    com.whatsapp.client.DialogScreen.field_53646   // getName->1:     // getName->2:     // getName->N:     // ofs = 53646 ord = 5 addr = 0
	aload_0 
	aconst_null 
	putfield com.whatsapp.client.DialogScreen.field_53650   // get_name_1:  com.whatsapp.client.DialogScreen.field_53650   // get_name_2:  com.whatsapp.client.DialogScreen.field_53650   // get_Name:    com.whatsapp.client.DialogScreen.field_53650   // getName->1:     // getName->2:     // getName->N:     // ofs = 53650 ord = 6 addr = 0
	aload_0 
	aconst_null 
	putfield com.whatsapp.client.DialogScreen.field_53654   // get_name_1:  com.whatsapp.client.DialogScreen.field_53654   // get_name_2:  com.whatsapp.client.DialogScreen.field_53654   // get_Name:    com.whatsapp.client.DialogScreen.field_53654   // getName->1:     // getName->2:     // getName->N:     // ofs = 53654 ord = 7 addr = 0
	return 
	}


protected final boolean keyChar( com.whatsapp.client.DialogScreen, char, int, int ); // address: 0
	{
	enter 
	iload_1 
	bipush 27
	if_icmpne Label11
	aload_0_getfield com.whatsapp.client.DialogScreen.field_53654   // get_name_1:  com.whatsapp.client.DialogScreen.field_53654   // get_name_2:  com.whatsapp.client.DialogScreen.field_53654   // get_Name:    com.whatsapp.client.DialogScreen.field_53654   // getName->1:     // getName->2:     // getName->N:     // ofs = 53654 ord = 7 addr = 0
	ifnull Label9
	aload_0 
	aload_0_getfield com.whatsapp.client.DialogScreen.field_53654   // get_name_1:  com.whatsapp.client.DialogScreen.field_53654   // get_name_2:  com.whatsapp.client.DialogScreen.field_53654   // get_Name:    com.whatsapp.client.DialogScreen.field_53654   // getName->1:     // getName->2:     // getName->N:     // ofs = 53654 ord = 7 addr = 0
	invokespecial com.whatsapp.client.DialogScreen.routine_2682 // pc=2
Label9:
	iconst_1 
	ireturn 
Label11:
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	invokespecial_lib net.rim.device.api.ui.Screen.keyChar // pc=4
	ireturn 
	}


protected final boolean navigationClick( com.whatsapp.client.DialogScreen, int, int ); // address: 0
	{
	enter_narrow 
	invokestatic_lib boolean isSupported(  ) // Trackball
	ifeq Label3
Label3:
	aload_0 
	iload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.Screen.navigationClick // pc=3
	ireturn 
	}


public final refresh( com.whatsapp.client.DialogScreen ); // address: 0
	{
	enter 
	aload_0 
	iconst_0 
	bipush 4
	invokestatic_lib module:WhatsApp-32.class#2.routine_1758(  ) // class#2
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield com.whatsapp.client.DialogScreen.field_53638   // get_name_1:  com.whatsapp.client.DialogScreen.field_53638   // get_name_2:  com.whatsapp.client.DialogScreen.field_53638   // get_Name:    com.whatsapp.client.DialogScreen.field_53638   // getName->1:     // getName->2:     // getName->N:     // ofs = 53638 ord = 3 addr = 0
	ifnull Label40
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	iconst_1 
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int ) // pc=2
	astore_1 
	aload_0 
	new_lib java.io.UnsupportedEncodingException//java.io.UnsupportedEncodingException java.io.UnsupportedEncodingException java.io.UnsupportedEncodingException
	dup 
	aload_0_getfield com.whatsapp.client.DialogScreen.field_53638   // get_name_1:  com.whatsapp.client.DialogScreen.field_53638   // get_name_2:  com.whatsapp.client.DialogScreen.field_53638   // get_Name:    com.whatsapp.client.DialogScreen.field_53638   // getName->1:     // getName->2:     // getName->N:     // ofs = 53638 ord = 3 addr = 0
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=2
	putfield com.whatsapp.client.DialogScreen.field_53626   // get_name_1:  com.whatsapp.client.DialogScreen.field_53626   // get_name_2:  com.whatsapp.client.DialogScreen.field_53626   // get_Name:    com.whatsapp.client.DialogScreen.field_53626   // getName->1:     // getName->2:     // getName->N:     // ofs = 53626 ord = 0 addr = 0
	aload_0_getfield com.whatsapp.client.DialogScreen.field_53626   // get_name_1:  com.whatsapp.client.DialogScreen.field_53626   // get_name_2:  com.whatsapp.client.DialogScreen.field_53626   // get_Name:    com.whatsapp.client.DialogScreen.field_53626   // getName->1:     // getName->2:     // getName->N:     // ofs = 53626 ord = 0 addr = 0
	aload_1 
	invokevirtual setFont( net.rim.device.api.ui.Field, net.rim.device.api.ui.Font ) // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.DialogScreen.field_53626   // get_name_1:  com.whatsapp.client.DialogScreen.field_53626   // get_name_2:  com.whatsapp.client.DialogScreen.field_53626   // get_Name:    com.whatsapp.client.DialogScreen.field_53626   // getName->1:     // getName->2:     // getName->N:     // ofs = 53626 ord = 0 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	iconst_0 
	bipush 4
	invokestatic_lib module:WhatsApp-32.class#2.routine_1758(  ) // class#2
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib Character//java.lang.Character java.lang.Character java.lang.Character
	dup 
	invokespecial_lib net.rim.device.api.ui.component.SeparatorField.<init> // pc=1
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	iconst_0 
	bipush 4
	invokestatic_lib module:WhatsApp-32.class#2.routine_1758(  ) // class#2
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
Label40:
	aload_0 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	lipush 299067162755072
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.<init> // pc=3
	putfield com.whatsapp.client.DialogScreen.field_53630   // get_name_1:  com.whatsapp.client.DialogScreen.field_53630   // get_name_2:  com.whatsapp.client.DialogScreen.field_53630   // get_Name:    com.whatsapp.client.DialogScreen.field_53630   // getName->1:     // getName->2:     // getName->N:     // ofs = 53630 ord = 1 addr = 0
	aload_0_getfield com.whatsapp.client.DialogScreen.field_53642   // get_name_1:  com.whatsapp.client.DialogScreen.field_53642   // get_name_2:  com.whatsapp.client.DialogScreen.field_53642   // get_Name:    com.whatsapp.client.DialogScreen.field_53642   // getName->1:     // getName->2:     // getName->N:     // ofs = 53642 ord = 4 addr = 0
	ifnull Label63
	aload_0 
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	dup 
	aload_0_getfield com.whatsapp.client.DialogScreen.field_53642   // get_name_1:  com.whatsapp.client.DialogScreen.field_53642   // get_name_2:  com.whatsapp.client.DialogScreen.field_53642   // get_Name:    com.whatsapp.client.DialogScreen.field_53642   // getName->1:     // getName->2:     // getName->N:     // ofs = 53642 ord = 4 addr = 0
	lipush 27021597764222976
	invokespecial_lib net.rim.device.api.ui.component.RichTextField.<init> // pc=4
	putfield com.whatsapp.client.DialogScreen.field_53634   // get_name_1:  com.whatsapp.client.DialogScreen.field_53634   // get_name_2:  com.whatsapp.client.DialogScreen.field_53634   // get_Name:    com.whatsapp.client.DialogScreen.field_53634   // getName->1:     // getName->2:     // getName->N:     // ofs = 53634 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.client.DialogScreen.field_53630   // get_name_1:  com.whatsapp.client.DialogScreen.field_53630   // get_name_2:  com.whatsapp.client.DialogScreen.field_53630   // get_Name:    com.whatsapp.client.DialogScreen.field_53630   // getName->1:     // getName->2:     // getName->N:     // ofs = 53630 ord = 1 addr = 0
	aload_0_getfield com.whatsapp.client.DialogScreen.field_53634   // get_name_1:  com.whatsapp.client.DialogScreen.field_53634   // get_name_2:  com.whatsapp.client.DialogScreen.field_53634   // get_Name:    com.whatsapp.client.DialogScreen.field_53634   // getName->1:     // getName->2:     // getName->N:     // ofs = 53634 ord = 2 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield com.whatsapp.client.DialogScreen.field_53630   // get_name_1:  com.whatsapp.client.DialogScreen.field_53630   // get_name_2:  com.whatsapp.client.DialogScreen.field_53630   // get_Name:    com.whatsapp.client.DialogScreen.field_53630   // getName->1:     // getName->2:     // getName->N:     // ofs = 53630 ord = 1 addr = 0
	iconst_0 
	bipush 4
	invokestatic_lib module:WhatsApp-32.class#2.routine_1758(  ) // class#2
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
Label63:
	aload_0_getfield com.whatsapp.client.DialogScreen.field_53646   // get_name_1:  com.whatsapp.client.DialogScreen.field_53646   // get_name_2:  com.whatsapp.client.DialogScreen.field_53646   // get_Name:    com.whatsapp.client.DialogScreen.field_53646   // getName->1:     // getName->2:     // getName->N:     // ofs = 53646 ord = 5 addr = 0
	ifnull Label109
	aload_0_getfield com.whatsapp.client.DialogScreen.field_53650   // get_name_1:  com.whatsapp.client.DialogScreen.field_53650   // get_name_2:  com.whatsapp.client.DialogScreen.field_53650   // get_Name:    com.whatsapp.client.DialogScreen.field_53650   // getName->1:     // getName->2:     // getName->N:     // ofs = 53650 ord = 6 addr = 0
	ifnull Label109
	aload_0_getfield com.whatsapp.client.DialogScreen.field_53646   // get_name_1:  com.whatsapp.client.DialogScreen.field_53646   // get_name_2:  com.whatsapp.client.DialogScreen.field_53646   // get_Name:    com.whatsapp.client.DialogScreen.field_53646   // getName->1:     // getName->2:     // getName->N:     // ofs = 53646 ord = 5 addr = 0
	arraylength 
	aload_0_getfield com.whatsapp.client.DialogScreen.field_53650   // get_name_1:  com.whatsapp.client.DialogScreen.field_53650   // get_name_2:  com.whatsapp.client.DialogScreen.field_53650   // get_Name:    com.whatsapp.client.DialogScreen.field_53650   // getName->1:     // getName->2:     // getName->N:     // ofs = 53650 ord = 6 addr = 0
	arraylength 
	if_icmpne Label109
	aconst_null 
	astore_1 
	aload_0_getfield com.whatsapp.client.DialogScreen.field_53646   // get_name_1:  com.whatsapp.client.DialogScreen.field_53646   // get_name_2:  com.whatsapp.client.DialogScreen.field_53646   // get_Name:    com.whatsapp.client.DialogScreen.field_53646   // getName->1:     // getName->2:     // getName->N:     // ofs = 53646 ord = 5 addr = 0
	arraylength 
	istore_2 
	iconst_0 
	istore_3 
Label79:
	iload_3 
	iload_2 
	if_icmpge Label109
	new_lib net.rim.device.api.ui.container.VerticalFieldManager//net.rim.device.api.ui.container.VerticalFieldManager net.rim.device.api.ui.container.VerticalFieldManager net.rim.device.api.ui.container.VerticalFieldManager
	dup 
	aload_0_getfield com.whatsapp.client.DialogScreen.field_53646   // get_name_1:  com.whatsapp.client.DialogScreen.field_53646   // get_name_2:  com.whatsapp.client.DialogScreen.field_53646   // get_Name:    com.whatsapp.client.DialogScreen.field_53646   // getName->1:     // getName->2:     // getName->N:     // ofs = 53646 ord = 5 addr = 0
	iload_3 
	aaload 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	lipush 12885000192
	invokespecial_lib net.rim.device.api.ui.component.ButtonField.<init> // pc=4
	astore_1 
	aload_1 
	aload_0 
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.DialogScreen.field_53650   // get_name_1:  com.whatsapp.client.DialogScreen.field_53650   // get_name_2:  com.whatsapp.client.DialogScreen.field_53650   // get_Name:    com.whatsapp.client.DialogScreen.field_53650   // getName->1:     // getName->2:     // getName->N:     // ofs = 53650 ord = 6 addr = 0
	iload_3 
	aaload 
	invokevirtual setCookie( net.rim.device.api.ui.Field, java.lang.Object ) // pc=2
	aload_0_getfield com.whatsapp.client.DialogScreen.field_53630   // get_name_1:  com.whatsapp.client.DialogScreen.field_53630   // get_name_2:  com.whatsapp.client.DialogScreen.field_53630   // get_Name:    com.whatsapp.client.DialogScreen.field_53630   // getName->1:     // getName->2:     // getName->N:     // ofs = 53630 ord = 1 addr = 0
	aload_1 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield com.whatsapp.client.DialogScreen.field_53630   // get_name_1:  com.whatsapp.client.DialogScreen.field_53630   // get_name_2:  com.whatsapp.client.DialogScreen.field_53630   // get_Name:    com.whatsapp.client.DialogScreen.field_53630   // getName->1:     // getName->2:     // getName->N:     // ofs = 53630 ord = 1 addr = 0
	iconst_0 
	bipush 4
	invokestatic_lib module:WhatsApp-32.class#2.routine_1758(  ) // class#2
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	iinc 3 1
	goto Label79
Label109:
	aload_0 
	aload_0_getfield com.whatsapp.client.DialogScreen.field_53630   // get_name_1:  com.whatsapp.client.DialogScreen.field_53630   // get_name_2:  com.whatsapp.client.DialogScreen.field_53630   // get_Name:    com.whatsapp.client.DialogScreen.field_53630   // getName->1:     // getName->2:     // getName->N:     // ofs = 53630 ord = 1 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	return 
	}


public final fieldChanged( com.whatsapp.client.DialogScreen, net.rim.device.api.ui.Field, int ); // address: 0
	{
	enter_narrow 
	aload_1 
	instanceof_lib net.rim.device.api.ui.container.VerticalFieldManager//net.rim.device.api.ui.container.VerticalFieldManager net.rim.device.api.ui.container.VerticalFieldManager net.rim.device.api.ui.container.VerticalFieldManager
	ifeq Label8
	aload_0 
	aload_1 
	invokevirtual java.lang.Object getCookie( net.rim.device.api.ui.Field ) // pc=1
	invokespecial com.whatsapp.client.DialogScreen.routine_2682 // pc=2
Label8:
	return 
	}

}
