// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp.cod
// Module version  : 2.8.1914
// Class ID        : 23
// ########################################################


package com.whatsapp.client;


abstract public final class DebugLog extends Object
implements net.rim.device.api.util.Persistable

{

	// @@@@@@@@@@@@@ Fields 
	private java.util.Vector /*java.util.Vector*/  field_51068 ; // ofs = 51068 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.DebugLog ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	new_lib Boolean//java.lang.Boolean java.lang.Boolean java.lang.Boolean
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final add( com.whatsapp.client.DebugLog, java.lang.String, long ); // address: 0
	{
	enter 
	synch 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	new DebugLog$Entry
	dup 
	aload_1 
	lload 2
	invokespecial com.whatsapp.client.DebugLog$Entry.<init> // pc=4
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_4 
	iload_4 
	sipush 750
	if_icmple Label39
	new_lib Boolean//java.lang.Boolean java.lang.Boolean java.lang.Boolean
	dup 
	sipush 500
	invokespecial_lib java.util.Vector.<init> // pc=2
	astore_5 
	iconst_0 
	iload_4 
	sipush 500
	isub 
	invokestatic_lib int max( int, int ) // Math
	istore_6 
Label26:
	iload_6 
	iload_4 
	if_icmpge Label36
	aload_5 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_6 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	iinc 6 1
	goto Label26
Label36:
	aload_0 
	aload_5 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
Label39:
	return 
	}


public final java.lang.String formatToString( com.whatsapp.client.DebugLog ); // address: 0
	{
	enter 
	synch 
	new_lib net.rim.device.api.util.IntVector//net.rim.device.api.util.IntVector net.rim.device.api.util.IntVector net.rim.device.api.util.IntVector
	dup 
	ldc literal_420:"H:mm:ss.SSS"
	invokespecial_lib net.rim.device.api.i18n.SimpleDateFormat.<init> // pc=2
	astore_1 
	bipush 56
	invokestatic_lib net.rim.device.api.i18n.DateFormat getInstance( int ) // DateFormat
	astore_2 
	ldc_nullstr 
	astore_3 
	new_lib net.rim.device.api.ui.decor.Background//net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	astore_4 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_5 
	iconst_0 
	istore_6 
Label21:
	iload_6 
	iload_5 
	if_icmpge Label70
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_6 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast DebugLog$Entry
	astore_7 
	aload_7 
	lgetfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	lstore 8
	aload_2 
	lload 8
	invokevirtual java.lang.String formatLocal( net.rim.device.api.i18n.DateFormat, long ) // pc=3
	astore 10
	aload 10
	aload_3 
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label50
	aload_4 
	aload 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_4 
	bipush 32
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	aload 10
	astore_3 
Label50:
	aload_1 
	aload_4 
	lload 8
	invokevirtual java.lang.StringBuffer formatLocal( net.rim.device.api.i18n.DateFormat, java.lang.StringBuffer, long ) // pc=4
	pop 
	aload_4 
	bipush 32
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	aload_4 
	aload_7 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_4 
	bipush 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	iinc 6 1
	goto Label21
Label70:
	aload_4 
	invokevirtual_short .toString // idx=2 pc=1
	astore_6 
	aload_6 
	areturn 
	}

}
