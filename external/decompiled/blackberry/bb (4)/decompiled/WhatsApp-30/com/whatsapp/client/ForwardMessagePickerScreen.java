// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-16.cod
// Module version  : 2.7.3204
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


abstract public final class ForwardMessagePickerScreen extends com.whatsapp.client.

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.FunXMPP$FMessage /*com.whatsapp.client.FunXMPP$FMessage*/  _fmsg ; // ofs = 55910 addr = 0)
	private final com.whatsapp.client. /*module:WhatsApp-25.class#12*/  field_55914 ; // ofs = 55914 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.ForwardMessagePickerScreen, module:WhatsApp-25.class#12, com.whatsapp.client.FunXMPP$FMessage ); // address: 0
	{
	enter 
	aload_0 
	iconst_1 
	invokespecial_lib .routine_6513 // pc=2
	aload_0 
	aload_2 
	putfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 55910 ord = 0 addr = 0
	aload_0 
	aload_1 
	putfield com.whatsapp.client.ForwardMessagePickerScreen.field_55914   // get_name_1:  com.whatsapp.client.ForwardMessagePickerScreen.field_55914   // get_name_2:  com.whatsapp.client.ForwardMessagePickerScreen.field_55914   // get_Name:    com.whatsapp.client.ForwardMessagePickerScreen.field_55914   // getName->1:     // getName->2:     // getName->N:     // ofs = 55914 ord = 1 addr = 0
	new_lib com.whatsapp.client.//module:WhatsApp-15.class#19 module:WhatsApp-15.class#19 module:WhatsApp-15.class#19
	dup 
	aload_0 
	invokespecial_lib .routine_10076 // pc=2
	astore_3 
	aload_0 
	aload_3 
	invokenonvirtual_lib .routine_6000 // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final boolean com.whatsapp.client.ForwardMessagePickerScreen.routine_299( com.whatsapp.client.ForwardMessagePickerScreen, java.lang.String ); // address: 0
	{
	enter_narrow 
	bipush 3
	sipush 922
	aload_1 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	bipush 4
	invokestatic_lib int ask( int, java.lang.String, int ) // Dialog
	istore_2 
	iload_2 
	bipush 4
	if_icmpne Label13
	iconst_1 
	ireturn 
Label13:
	iconst_0 
	ireturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final boolean onGroupSelection( com.whatsapp.client.ForwardMessagePickerScreen, module:WhatsApp-9.class#15 ); // address: 0
	{
	enter 
	aload_0 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	getstatic_lib module:WhatsApp-12.class#0.static_6 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_1 
	invokenonvirtual_lib .routine_8025 // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	getstatic_lib module:WhatsApp-12.class#0.static_6 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial com.whatsapp.client.ForwardMessagePickerScreen.routine_299 // pc=2
	ifne Label17
	iconst_0 
	ireturn 
Label17:
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 55910 ord = 0 addr = 0
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	ifne Label27
	lipush 7375980026338060110
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 55910 ord = 0 addr = 0
	getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokestatic_lib module:WhatsApp-35.class#0.routine_4549(  ) // class#0
	goto Label42
Label27:
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 55910 ord = 0 addr = 0
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	bipush 5
	if_icmpne Label37
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 55910 ord = 0 addr = 0
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifnonnull Label37
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 55910 ord = 0 addr = 0
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
Label37:
	lipush 7375980026338060110
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 55910 ord = 0 addr = 0
	invokestatic_lib module:WhatsApp-35.class#0.routine_4549(  ) // class#0
Label42:
	aload_1 
	invokestatic_lib module:WhatsApp-31.class#4.routine_9339(  ) // class#4
	ifnull Label49
	aload_0_getfield com.whatsapp.client.ForwardMessagePickerScreen.field_55914   // get_name_1:  com.whatsapp.client.ForwardMessagePickerScreen.field_55914   // get_name_2:  com.whatsapp.client.ForwardMessagePickerScreen.field_55914   // get_Name:    com.whatsapp.client.ForwardMessagePickerScreen.field_55914   // getName->1:     // getName->2:     // getName->N:     // ofs = 55914 ord = 1 addr = 0
	invokenonvirtual_lib .routine_3624 // pc=1
	iconst_1 
	ireturn 
Label49:
	iconst_0 
	ireturn 
	}


protected final boolean onContactSelection( com.whatsapp.client.ForwardMessagePickerScreen, module:WhatsApp-10.class#34, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	aload_2 
	invokespecial com.whatsapp.client.ForwardMessagePickerScreen.routine_299 // pc=2
	ifne Label7
	iconst_0 
	ireturn 
Label7:
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	astore_3 
	aload_3 
	getfield _fromSystemFolder   // get_name_1:  _fromSystemFolder   // get_name_2:  _fromSystemFolder   // get_Name:    _fromSystemFolder   // getName->1:  _fromSystemFolder   // getName->2:  _fromSystemFolder   // getName->N:  _fromSystemFolder   // ofs = -1 ord = 0 addr = -1
	istore_4 
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 55910 ord = 0 addr = 0
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	ifne Label23
	lipush 7375980026338060110
	aload_1 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 55910 ord = 0 addr = 0
	getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokestatic_lib module:WhatsApp-35.class#0.routine_4549(  ) // class#0
	goto Label39
Label23:
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 55910 ord = 0 addr = 0
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	bipush 5
	if_icmpne Label33
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 55910 ord = 0 addr = 0
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifnonnull Label33
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 55910 ord = 0 addr = 0
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
Label33:
	lipush 7375980026338060110
	aload_1 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 55910 ord = 0 addr = 0
	invokestatic_lib module:WhatsApp-35.class#0.routine_4549(  ) // class#0
Label39:
	aload_1 
	aconst_null 
	invokestatic_lib module:WhatsApp-31.class#4.routine_9248(  ) // class#4
	ifnull Label52
	aload_0_getfield com.whatsapp.client.ForwardMessagePickerScreen.field_55914   // get_name_1:  com.whatsapp.client.ForwardMessagePickerScreen.field_55914   // get_name_2:  com.whatsapp.client.ForwardMessagePickerScreen.field_55914   // get_Name:    com.whatsapp.client.ForwardMessagePickerScreen.field_55914   // getName->1:     // getName->2:     // getName->N:     // ofs = 55914 ord = 1 addr = 0
	invokenonvirtual_lib .routine_3624 // pc=1
	iload_4 
	ifeq Label50
	aload_3 
	iconst_1 
	putfield _fromSystemFolder   // get_name_1:  _fromSystemFolder   // get_name_2:  _fromSystemFolder   // get_Name:    _fromSystemFolder   // getName->1:  _fromSystemFolder   // getName->2:  _fromSystemFolder   // getName->N:  _fromSystemFolder   // ofs = -1 ord = 0 addr = -1
Label50:
	iconst_1 
	ireturn 
Label52:
	iconst_0 
	ireturn 
	}

}
