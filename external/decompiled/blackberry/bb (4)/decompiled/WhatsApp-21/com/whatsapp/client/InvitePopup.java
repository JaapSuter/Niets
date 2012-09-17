// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-21.cod
// Module version  : 2.7.3204
// Class ID        : 1
// ########################################################


package com.whatsapp.client;


abstract public final class InvitePopup extends net.rim.device.api.ui.container.PopupScreen

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.device.api.ui.component.CheckboxField /*net.rim.device.api.ui.component.CheckboxField[]*/  _emailChecks ; // ofs = 56512 addr = 0)
	private net.rim.device.api.ui.component.CheckboxField /*net.rim.device.api.ui.component.CheckboxField[]*/  _smsChecks ; // ofs = 56516 addr = 0)
	private String /*java.lang.String[]*/  field_56520 ; // ofs = 56520 addr = 0)
	private net.rim.device.api.ui.component.ButtonField /*net.rim.device.api.ui.component.ButtonField*/  _sendBtn ; // ofs = 56524 addr = 0)
	private net.rim.device.api.ui.component.ButtonField /*net.rim.device.api.ui.component.ButtonField*/  field_56528 ; // ofs = 56528 addr = 0)
	private net.rim.device.api.ui.FieldChangeListener /*net.rim.device.api.ui.FieldChangeListener*/  field_56532 ; // ofs = 56532 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.InvitePopup, module:WhatsApp.class#12 ); // address: 0
	{
	enter 
	aload_0 
	new_lib net.rim.device.api.ui.component.RichTextField//net.rim.device.api.ui.component.RichTextField net.rim.device.api.ui.component.RichTextField net.rim.device.api.ui.component.RichTextField
	dup 
	lipush 1153220571769602048
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.<init> // pc=3
	lipush 1153220571769602048
	invokespecial_lib net.rim.device.api.ui.container.PopupScreen.<init> // pc=4
	aload_0 
	new_lib com.whatsapp.client.InvitePopup$3//module:WhatsApp-20.class#20 module:WhatsApp-20.class#20 module:WhatsApp-20.class#20
	dup 
	aload_0 
	invokespecial_lib .routine_6940 // pc=2
	putfield com.whatsapp.client.InvitePopup.field_56532   // get_name_1:  com.whatsapp.client.InvitePopup.field_56532   // get_name_2:  com.whatsapp.client.InvitePopup.field_56532   // get_Name:    com.whatsapp.client.InvitePopup.field_56532   // getName->1:     // getName->2:     // getName->N:     // ofs = 56532 ord = 5 addr = 0
	aload_1 
	iconst_0 
	invokenonvirtual_lib .routine_6025 // pc=2
	astore_3 
	new_lib net.rim.device.api.ui.decor.Background//net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background
	dup 
	aload_3 
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=2
	astore_4 
	aload_4 
	iconst_0 
	iconst_0 
	iconst_0 
	bipush 5
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	aload_4 
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib net.rim.device.api.ui.decor.BorderFactory//net.rim.device.api.ui.decor.BorderFactory net.rim.device.api.ui.decor.BorderFactory net.rim.device.api.ui.decor.BorderFactory
	dup 
	invokespecial_lib net.rim.device.api.ui.component.SeparatorField.<init> // pc=1
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	iconst_0 
	newarray_object_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	putfield _emailChecks   // get_name_1:  _emailChecks   // get_name_2:  _emailChecks   // get_Name:    _emailChecks   // getName->1:  _emailChecks   // getName->2:  _emailChecks   // getName->N:  _emailChecks   // ofs = 56512 ord = 0 addr = 0
	aload_0 
	iconst_0 
	newarray_object_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	putfield _smsChecks   // get_name_1:  _smsChecks   // get_name_2:  _smsChecks   // get_Name:    _smsChecks   // getName->1:  _smsChecks   // getName->2:  _smsChecks   // getName->N:  _smsChecks   // ofs = 56516 ord = 1 addr = 0
	aload_0 
	iconst_0 
	newarray_object_lib String//java.lang.String java.lang.String java.lang.String
	putfield com.whatsapp.client.InvitePopup.field_56520   // get_name_1:  com.whatsapp.client.InvitePopup.field_56520   // get_name_2:  com.whatsapp.client.InvitePopup.field_56520   // get_Name:    com.whatsapp.client.InvitePopup.field_56520   // getName->1:     // getName->2:     // getName->N:     // ofs = 56520 ord = 2 addr = 0
	new_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_5 
	aload_1 
	aload_5 
	iconst_0 
	iconst_0 
	invokenonvirtual_lib .routine_7096 // pc=4
	aload_5 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_6 
	iconst_0 
	istore_2 
Label63:
	iload_2 
	iload_6 
	if_icmplt Label67
	goto_w Label124
Label67:
	aload_5 
	iload_2 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.//module:WhatsApp-13.class#4 module:WhatsApp-13.class#4 module:WhatsApp-13.class#4
	astore_7 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	new_lib net.rim.device.api.ui.XYEdges//net.rim.device.api.ui.XYEdges net.rim.device.api.ui.XYEdges net.rim.device.api.ui.XYEdges
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	bipush 32
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	aload_7 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	iconst_0 
	invokespecial_lib net.rim.device.api.ui.component.CheckboxField.<init> // pc=3
	astore 8
	aload 8
	iconst_0 
	iconst_0 
	iconst_0 
	bipush 10
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_7 
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	bipush 9
	if_icmpne Label106
	aload_0_getfield _emailChecks   // get_name_1:  _emailChecks   // get_name_2:  _emailChecks   // get_Name:    _emailChecks   // getName->1:  _emailChecks   // getName->2:  _emailChecks   // getName->N:  _emailChecks   // ofs = 56512 ord = 0 addr = 0
	aload 8
	invokestatic_lib add( java.lang.Object[], java.lang.Object ) // Arrays
	aload 8
	aload_0_getfield com.whatsapp.client.InvitePopup.field_56532   // get_name_1:  com.whatsapp.client.InvitePopup.field_56532   // get_name_2:  com.whatsapp.client.InvitePopup.field_56532   // get_Name:    com.whatsapp.client.InvitePopup.field_56532   // getName->1:     // getName->2:     // getName->N:     // ofs = 56532 ord = 5 addr = 0
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0 
	aload 8
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	goto Label122
Label106:
	aload_7 
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifeq Label122
	aload_0_getfield _smsChecks   // get_name_1:  _smsChecks   // get_name_2:  _smsChecks   // get_Name:    _smsChecks   // getName->1:  _smsChecks   // getName->2:  _smsChecks   // getName->N:  _smsChecks   // ofs = 56516 ord = 1 addr = 0
	aload 8
	invokestatic_lib add( java.lang.Object[], java.lang.Object ) // Arrays
	aload_0_getfield com.whatsapp.client.InvitePopup.field_56520   // get_name_1:  com.whatsapp.client.InvitePopup.field_56520   // get_name_2:  com.whatsapp.client.InvitePopup.field_56520   // get_Name:    com.whatsapp.client.InvitePopup.field_56520   // getName->1:     // getName->2:     // getName->N:     // ofs = 56520 ord = 2 addr = 0
	aload_7 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokestatic_lib add( java.lang.Object[], java.lang.Object ) // Arrays
	aload 8
	aload_0_getfield com.whatsapp.client.InvitePopup.field_56532   // get_name_1:  com.whatsapp.client.InvitePopup.field_56532   // get_name_2:  com.whatsapp.client.InvitePopup.field_56532   // get_Name:    com.whatsapp.client.InvitePopup.field_56532   // getName->1:     // getName->2:     // getName->N:     // ofs = 56532 ord = 5 addr = 0
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0 
	aload 8
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
Label122:
	iinc 2 1
	goto_w Label63
Label124:
	new_lib net.rim.device.api.ui.UiApplication//net.rim.device.api.ui.UiApplication net.rim.device.api.ui.UiApplication net.rim.device.api.ui.UiApplication
	dup 
	lipush 12884901888
	invokespecial_lib net.rim.device.api.ui.container.HorizontalFieldManager.<init> // pc=3
	astore_7 
	lipush 64424607744
	lstore 8
	aload_0 
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	sipush 330
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	lload 8
	invokespecial_lib net.rim.device.api.ui.component.ButtonField.<init> // pc=4
	putfield _sendBtn   // get_name_1:  _sendBtn   // get_name_2:  _sendBtn   // get_Name:    _sendBtn   // getName->1:  _sendBtn   // getName->2:  _sendBtn   // getName->N:  _sendBtn   // ofs = 56524 ord = 3 addr = 0
	aload_0_getfield _sendBtn   // get_name_1:  _sendBtn   // get_name_2:  _sendBtn   // get_Name:    _sendBtn   // getName->1:  _sendBtn   // getName->2:  _sendBtn   // getName->N:  _sendBtn   // ofs = 56524 ord = 3 addr = 0
	bipush 2
	bipush 2
	bipush 2
	bipush 2
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0_getfield _sendBtn   // get_name_1:  _sendBtn   // get_name_2:  _sendBtn   // get_Name:    _sendBtn   // getName->1:  _sendBtn   // getName->2:  _sendBtn   // getName->N:  _sendBtn   // ofs = 56524 ord = 3 addr = 0
	new_lib com.whatsapp.client.InvitePopup$1//module:WhatsApp-20.class#18 module:WhatsApp-20.class#18 module:WhatsApp-20.class#18
	dup 
	aload_0 
	invokespecial_lib .routine_6780 // pc=2
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0_getfield _sendBtn   // get_name_1:  _sendBtn   // get_name_2:  _sendBtn   // get_Name:    _sendBtn   // getName->1:  _sendBtn   // getName->2:  _sendBtn   // getName->N:  _sendBtn   // ofs = 56524 ord = 3 addr = 0
	iconst_0 
	invokevirtual setEditable( net.rim.device.api.ui.Field, boolean ) // pc=2
	aload_7 
	aload_0_getfield _sendBtn   // get_name_1:  _sendBtn   // get_name_2:  _sendBtn   // get_Name:    _sendBtn   // getName->1:  _sendBtn   // getName->2:  _sendBtn   // getName->N:  _sendBtn   // ofs = 56524 ord = 3 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	sipush 151
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	lload 8
	invokespecial_lib net.rim.device.api.ui.component.ButtonField.<init> // pc=4
	putfield com.whatsapp.client.InvitePopup.field_56528   // get_name_1:  com.whatsapp.client.InvitePopup.field_56528   // get_name_2:  com.whatsapp.client.InvitePopup.field_56528   // get_Name:    com.whatsapp.client.InvitePopup.field_56528   // getName->1:     // getName->2:     // getName->N:     // ofs = 56528 ord = 4 addr = 0
	aload_0_getfield com.whatsapp.client.InvitePopup.field_56528   // get_name_1:  com.whatsapp.client.InvitePopup.field_56528   // get_name_2:  com.whatsapp.client.InvitePopup.field_56528   // get_Name:    com.whatsapp.client.InvitePopup.field_56528   // getName->1:     // getName->2:     // getName->N:     // ofs = 56528 ord = 4 addr = 0
	bipush 2
	bipush 2
	bipush 2
	bipush 2
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0_getfield com.whatsapp.client.InvitePopup.field_56528   // get_name_1:  com.whatsapp.client.InvitePopup.field_56528   // get_name_2:  com.whatsapp.client.InvitePopup.field_56528   // get_Name:    com.whatsapp.client.InvitePopup.field_56528   // getName->1:     // getName->2:     // getName->N:     // ofs = 56528 ord = 4 addr = 0
	new_lib com.whatsapp.client.InvitePopup$2//module:WhatsApp-20.class#19 module:WhatsApp-20.class#19 module:WhatsApp-20.class#19
	dup 
	aload_0 
	invokespecial_lib .routine_6819 // pc=2
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_7 
	aload_0_getfield com.whatsapp.client.InvitePopup.field_56528   // get_name_1:  com.whatsapp.client.InvitePopup.field_56528   // get_name_2:  com.whatsapp.client.InvitePopup.field_56528   // get_Name:    com.whatsapp.client.InvitePopup.field_56528   // getName->1:     // getName->2:     // getName->N:     // ofs = 56528 ord = 4 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	aload_7 
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final boolean hasValidContacts( com.whatsapp.client.InvitePopup ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _emailChecks   // get_name_1:  _emailChecks   // get_name_2:  _emailChecks   // get_Name:    _emailChecks   // getName->1:  _emailChecks   // getName->2:  _emailChecks   // getName->N:  _emailChecks   // ofs = 56512 ord = 0 addr = 0
	arraylength 
	ifgt Label7
	aload_0_getfield _smsChecks   // get_name_1:  _smsChecks   // get_name_2:  _smsChecks   // get_Name:    _smsChecks   // getName->1:  _smsChecks   // getName->2:  _smsChecks   // getName->N:  _smsChecks   // ofs = 56516 ord = 1 addr = 0
	arraylength 
	ifle Label9
Label7:
	iconst_1 
	ireturn 
Label9:
	iconst_0 
	ireturn 
	}


protected final collectAndSend( com.whatsapp.client.InvitePopup ); // address: 0
	{
	enter 
	iconst_0 
	newarray_object_lib String//java.lang.String java.lang.String java.lang.String
	astore_2 
	iconst_0 
	newarray_object_lib net.rim.blackberry.api.mail.Address//net.rim.blackberry.api.mail.Address net.rim.blackberry.api.mail.Address net.rim.blackberry.api.mail.Address
	astore_3 
	iconst_0 
	istore_1 
Label9:
	iload_1 
	aload_0_getfield _emailChecks   // get_name_1:  _emailChecks   // get_name_2:  _emailChecks   // get_Name:    _emailChecks   // getName->1:  _emailChecks   // getName->2:  _emailChecks   // getName->N:  _emailChecks   // ofs = 56512 ord = 0 addr = 0
	arraylength 
	if_icmpge Label32
	aload_0_getfield _emailChecks   // get_name_1:  _emailChecks   // get_name_2:  _emailChecks   // get_Name:    _emailChecks   // getName->1:  _emailChecks   // getName->2:  _emailChecks   // getName->N:  _emailChecks   // ofs = 56512 ord = 0 addr = 0
	iload_1 
	aaload 
	invokevirtual boolean getChecked( net.rim.device.api.ui.component.CheckboxField ) // pc=1
	ifeq Label30
	aload_3 
	new_lib net.rim.blackberry.api.mail.Address//net.rim.blackberry.api.mail.Address net.rim.blackberry.api.mail.Address net.rim.blackberry.api.mail.Address
	dup 
	aload_0_getfield _emailChecks   // get_name_1:  _emailChecks   // get_name_2:  _emailChecks   // get_Name:    _emailChecks   // getName->1:  _emailChecks   // getName->2:  _emailChecks   // getName->N:  _emailChecks   // ofs = 56512 ord = 0 addr = 0
	iload_1 
	aaload 
	invokevirtual java.lang.String getLabel( net.rim.device.api.ui.component.CheckboxField ) // pc=1
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokespecial_lib net.rim.blackberry.api.mail.Address.<init> // pc=3
	invokestatic_lib add( java.lang.Object[], java.lang.Object ) // Arrays
	goto Label30
	astore_4 
Label30:
	iinc 1 1
	goto Label9
Label32:
	iconst_0 
	istore_1 
Label34:
	iload_1 
	aload_0_getfield _smsChecks   // get_name_1:  _smsChecks   // get_name_2:  _smsChecks   // get_Name:    _smsChecks   // getName->1:  _smsChecks   // getName->2:  _smsChecks   // getName->N:  _smsChecks   // ofs = 56516 ord = 1 addr = 0
	arraylength 
	if_icmpge Label50
	aload_0_getfield _smsChecks   // get_name_1:  _smsChecks   // get_name_2:  _smsChecks   // get_Name:    _smsChecks   // getName->1:  _smsChecks   // getName->2:  _smsChecks   // getName->N:  _smsChecks   // ofs = 56516 ord = 1 addr = 0
	iload_1 
	aaload 
	invokevirtual boolean getChecked( net.rim.device.api.ui.component.CheckboxField ) // pc=1
	ifeq Label48
	aload_2 
	aload_0_getfield com.whatsapp.client.InvitePopup.field_56520   // get_name_1:  com.whatsapp.client.InvitePopup.field_56520   // get_name_2:  com.whatsapp.client.InvitePopup.field_56520   // get_Name:    com.whatsapp.client.InvitePopup.field_56520   // getName->1:     // getName->2:     // getName->N:     // ofs = 56520 ord = 2 addr = 0
	iload_1 
	aaload 
	invokestatic_lib add( java.lang.Object[], java.lang.Object ) // Arrays
Label48:
	iinc 1 1
	goto Label34
Label50:
	aload_3 
	arraylength 
	ifle Label56
	aload_3 
	invokestatic_lib module:WhatsApp-32.class#0.routine_2838(  ) // class#0
	pop 
Label56:
	aload_2 
	arraylength 
	ifle Label61
	aload_2 
	invokestatic_lib module:WhatsApp-32.class#0.routine_2726(  ) // class#0
Label61:
	return 
	}


public final closeScreen( com.whatsapp.client.InvitePopup ); // address: 0
	{
	enter_narrow 
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	astore_1 
	aload_1 
	aload_0 
	invokevirtual popScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}


protected final boolean keyChar( com.whatsapp.client.InvitePopup, char, int, int ); // address: 0
	{
	enter 
	iload_1 
	bipush 27
	if_icmpeq Label10
	iload_1 
	bipush 99
	if_icmpeq Label10
	iload_1 
	bipush 67
	if_icmpne Label14
Label10:
	aload_0 
	invokenonvirtual com.whatsapp.client.InvitePopup.closeScreen // pc=1
	iconst_1 
	ireturn 
Label14:
	iload_1 
	bipush 115
	if_icmpeq Label20
	iload_1 
	bipush 83
	if_icmpne Label26
Label20:
	aload_0 
	invokenonvirtual com.whatsapp.client.InvitePopup.collectAndSend // pc=1
	aload_0 
	invokenonvirtual com.whatsapp.client.InvitePopup.closeScreen // pc=1
	iconst_1 
	ireturn 
Label26:
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	invokespecial_lib net.rim.device.api.ui.Screen.keyChar // pc=4
	ireturn 
	}

}
