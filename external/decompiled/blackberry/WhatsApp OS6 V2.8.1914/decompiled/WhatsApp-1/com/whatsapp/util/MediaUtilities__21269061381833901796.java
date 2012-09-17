// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-58.cod
// Module version  : 2.8.1914
// Class ID        : 2
// ########################################################


package com.whatsapp.util;


abstract public final class MediaUtilities extends Object

{


	// @@@@@@@@@@@@@ Static routines 

private <init>( com.whatsapp.util.MediaUtilities ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}


static public final java.lang.String saveMediaToFile( java.lang.String, java.lang.String, boolean, java.lang.String, byte[], int, int ); // address: 0
	{
	enter 
	invokestatic_lib com.whatsapp.client.UiApp.routine_1(  ) // UiApp
	ifeq Label8
	new_lib IllegalStateException//java.lang.IllegalStateException java.lang.IllegalStateException java.lang.IllegalStateException
	dup 
	ldc literal_2016:"Cannot save files on the event dispatch thread"
	invokespecial_lib java.lang.IllegalStateException.<init> // pc=2
	athrow 
Label8:
	aload_0 
	aload_1 
	iload_2 
	iload_6 
	iload_5 
	isub 
	iconst_1 
	invokestatic java.lang.String getValidMediaPath( java.lang.String, java.lang.String, boolean, int, boolean ) // MediaUtilities
	astore_7 
	aload_7 
	ifnonnull Label21
	aconst_null 
	areturn 
Label21:
	aconst_null 
	astore 8
	aconst_null 
	astore 9
	aconst_null 
	astore 10
	aload_7 
	aload_3 
	invokestatic java.lang.String com.whatsapp.util.MediaUtilities.routine_4142( java.lang.String, java.lang.String ) // MediaUtilities
	astore 11
Label31:
	aload 8
	ifnull Label34
	goto_w Label82
Label34:
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_7 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload 11
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore 12
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_2017:"trying file "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 12
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_2018:" for local save of downloaded media"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload 12
	bipush 3
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String, int ) // Connector
	checkcast_lib javax.microedition.io.file.FileConnection//javax.microedition.io.file.FileConnection javax.microedition.io.file.FileConnection javax.microedition.io.file.FileConnection
	astore 9
	aload 9
	invokeinterface interfacemethodref_180 // pc=1 guess=0
	ifeq Label69
	aload 9
	invokeinterface interfacemethodref_181 // pc=1 guess=1
	goto Label65
	astore 13
Label65:
	aload 11
	invokestatic java.lang.String com.whatsapp.util.MediaUtilities.routine_4723( java.lang.String ) // MediaUtilities
	astore 11
	goto Label31
Label69:
	aload 9
	invokeinterface interfacemethodref_182 // pc=1 guess=2
	aload 9
	invokeinterface interfacemethodref_183 // pc=1 guess=3
	astore 10
	aload 10
	aload_4 
	iload_5 
	iload_6 
	invokevirtual write( java.io.OutputStream, byte[], int, int ) // pc=4
	aload 12
	astore 8
	goto_w Label31
Label82:
	aload 10
	ifnull Label88
	aload 10
	invokevirtual close( java.io.OutputStream ) // pc=1
	goto Label88
	astore 16
Label88:
	aload 9
	ifnull Label129
	aload 9
	invokeinterface interfacemethodref_181 // pc=1 guess=1
	goto Label129
	astore 16
	goto Label129
	astore 11
	sipush 611
	aload 11
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-47.class#11.routine_4463(  ) // class#11
	invokestatic_lib module:WhatsApp-60.class#2.routine_3255(  ) // class#2
	aload 10
	ifnull Label107
	aload 10
	invokevirtual close( java.io.OutputStream ) // pc=1
	goto Label107
	astore 16
Label107:
	aload 9
	ifnull Label129
	aload 9
	invokeinterface interfacemethodref_181 // pc=1 guess=1
	goto Label129
	astore 16
	goto Label129
	astore 14
	aload 10
	ifnull Label121
	aload 10
	invokevirtual close( java.io.OutputStream ) // pc=1
	goto Label121
	astore 16
Label121:
	aload 9
	ifnull Label127
	aload 9
	invokeinterface interfacemethodref_181 // pc=1 guess=1
	goto Label127
	astore 16
Label127:
	aload 14
	athrow 
Label129:
	aload 8
	areturn 
	}


static public final java.lang.String saveMediaFromTempFile( java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	invokestatic_lib com.whatsapp.client.UiApp.routine_1(  ) // UiApp
	ifeq Label8
	new_lib IllegalStateException//java.lang.IllegalStateException java.lang.IllegalStateException java.lang.IllegalStateException
	dup 
	ldc literal_2016:"Cannot save files on the event dispatch thread"
	invokespecial_lib java.lang.IllegalStateException.<init> // pc=2
	athrow 
Label8:
	aload_1 
	bipush 47
	invokenonvirtual_lib java.lang.String.lastIndexOf // pc=2
	istore_2 
	iload_2 
	bipush -1
	if_icmpeq Label21
	iload_2 
	aload_1 
	stringlength 
	iconst_1 
	isub 
	if_icmpne Label23
Label21:
	aconst_null 
	areturn 
Label23:
	aload_1 
	iconst_0 
	iload_2 
	iconst_1 
	iadd 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	astore_3 
	aconst_null 
	astore_4 
	aconst_null 
	astore_5 
	aload_3 
	aload_0 
	invokestatic java.lang.String com.whatsapp.util.MediaUtilities.routine_4142( java.lang.String, java.lang.String ) // MediaUtilities
	astore_6 
Label38:
	aload_4 
	ifnull Label41
	goto_w Label94
Label41:
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_3 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_6 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_7 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_2017:"trying file "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_7 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_2018:" for local save of downloaded media"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_7 
	bipush 3
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String, int ) // Connector
	checkcast_lib javax.microedition.io.file.FileConnection//javax.microedition.io.file.FileConnection javax.microedition.io.file.FileConnection javax.microedition.io.file.FileConnection
	astore_5 
	aload_5 
	invokeinterface interfacemethodref_180 // pc=1 guess=4
	ifeq Label76
	aload_5 
	invokeinterface interfacemethodref_181 // pc=1 guess=5
	goto Label72
	astore 8
Label72:
	aload_6 
	invokestatic java.lang.String com.whatsapp.util.MediaUtilities.routine_4723( java.lang.String ) // MediaUtilities
	astore_6 
	goto Label38
Label76:
	aload_5 
	invokeinterface interfacemethodref_181 // pc=1 guess=5
	goto Label80
	astore 8
Label80:
	aload_1 
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String ) // Connector
	checkcast_lib javax.microedition.io.file.FileConnection//javax.microedition.io.file.FileConnection javax.microedition.io.file.FileConnection javax.microedition.io.file.FileConnection
	astore_5 
	aload_5 
	aload_6 
	invokeinterface interfacemethodref_184 // pc=2 guess=6
	aload_5 
	iconst_0 
	invokeinterface interfacemethodref_185 // pc=2 guess=7
	aload_5 
	invokeinterface interfacemethodref_186 // pc=1 guess=8
	astore_4 
	goto_w Label38
Label94:
	aload_5 
	ifnull Label123
	aload_5 
	invokeinterface interfacemethodref_181 // pc=1 guess=5
	goto Label123
	astore 11
	goto Label123
	astore_6 
	sipush 611
	aload_6 
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-47.class#11.routine_4463(  ) // class#11
	invokestatic_lib module:WhatsApp-60.class#2.routine_3255(  ) // class#2
	aload_5 
	ifnull Label123
	aload_5 
	invokeinterface interfacemethodref_181 // pc=1 guess=5
	goto Label123
	astore 11
	goto Label123
	astore 9
	aload_5 
	ifnull Label121
	aload_5 
	invokeinterface interfacemethodref_181 // pc=1 guess=5
	goto Label121
	astore 11
Label121:
	aload 9
	athrow 
Label123:
	aload_4 
	areturn 
	}


static public final java.lang.String getValidMediaPath( java.lang.String, java.lang.String, boolean, int, boolean ); // address: 0
	{
	enter 
	aload_0 
	iload_3 
	iload_4 
	invokestatic java.lang.String validateMediaRoot( java.lang.String, int, boolean ) // MediaUtilities
	astore_0 
	aload_0 
	ifnonnull Label10
	aconst_null 
	areturn 
Label10:
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_0 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_5 
	aload_5 
	invokestatic_lib module:WhatsApp-79.class#39.routine_28858(  ) // class#39
	istore_6 
	iload_6 
	ifne Label69
	iload_4 
	ifeq Label59
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	getstatic_lib module:WhatsApp-19.class#0.static_47 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_7 
	getstatic_lib module:WhatsApp-19.class#0.static_48 // class#0
	aload_0 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label52
	aload_7 
	invokestatic_lib module:WhatsApp-79.class#39.routine_28858(  ) // class#39
	ifeq Label52
	bipush 3
	sipush 715
	invokestatic_lib module:WhatsApp-60.class#2.routine_3189(  ) // class#2
	bipush 4
	if_icmpne Label50
	aload_7 
	astore_5 
	goto Label69
Label50:
	aconst_null 
	areturn 
Label52:
	sipush 611
	sipush 710
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokestatic_lib module:WhatsApp-47.class#11.routine_4463(  ) // class#11
	invokestatic_lib module:WhatsApp-60.class#2.routine_3255(  ) // class#2
	aconst_null 
	areturn 
Label59:
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_2019:"Could not silently validate media path: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_5 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aconst_null 
	areturn 
Label69:
	iload_2 
	ifeq Label74
	aload_5 
	invokestatic java.lang.String com.whatsapp.util.MediaUtilities.routine_3952( java.lang.String ) // MediaUtilities
	astore_5 
Label74:
	aload_5 
	areturn 
	}


static public final java.lang.String validateMediaRoot( java.lang.String, int, boolean ); // address: 0
	{
	enter_narrow 
	getstatic_lib module:WhatsApp-19.class#0.static_47 // class#0
	aload_0 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label40
	invokestatic_lib module:WhatsApp-79.class#39.routine_27868(  ) // class#39
	ifne Label40
	iload_1 
	getstatic_lib module:WhatsApp-19.class#0.static_82 // class#0
	if_icmple Label40
	iload_2 
	ifeq Label30
	invokestatic_lib module:WhatsApp-79.class#39.routine_27848(  ) // class#39
	ifeq Label25
	iconst_0 
	bipush 4
	sipush 853
	invokestatic_lib module:WhatsApp-60.class#2.routine_3189(  ) // class#2
	if_icmpne Label23
	getstatic_lib module:WhatsApp-19.class#0.static_48 // class#0
	astore_0 
	aload_0 
	areturn 
Label23:
	aconst_null 
	areturn 
Label25:
	sipush 854
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokestatic_lib module:WhatsApp-60.class#2.routine_3255(  ) // class#2
	aconst_null 
	areturn 
Label30:
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_2020:"Could not silently validate media root: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aconst_null 
	areturn 
Label40:
	aload_0 
	areturn 
	}


static private final java.lang.String com.whatsapp.util.MediaUtilities.routine_3952( java.lang.String ); // address: 0
	{
	enter 
	aconst_null 
	astore_1 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_0 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	getstatic_lib module:WhatsApp-19.class#0.static_52 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_2 
	aload_2 
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String ) // Connector
	checkcast_lib javax.microedition.io.file.FileConnection//javax.microedition.io.file.FileConnection javax.microedition.io.file.FileConnection javax.microedition.io.file.FileConnection
	astore_1 
	aload_1 
	invokeinterface interfacemethodref_180 // pc=1 guess=9
	ifne Label21
	aload_1 
	invokeinterface interfacemethodref_187 // pc=1 guess=10
Label21:
	aload_2 
	astore_0 
	aload_1 
	ifnull Label48
	aload_1 
	invokeinterface interfacemethodref_181 // pc=1 guess=11
	goto Label48
	astore_5 
	goto Label48
	astore_2 
	aload_1 
	ifnull Label48
	aload_1 
	invokeinterface interfacemethodref_181 // pc=1 guess=11
	goto Label48
	astore_5 
	goto Label48
	astore_3 
	aload_1 
	ifnull Label46
	aload_1 
	invokeinterface interfacemethodref_181 // pc=1 guess=11
	aload_3 
	athrow 
	astore_5 
Label46:
	aload_3 
	athrow 
Label48:
	aload_0 
	areturn 
	}


static private final java.lang.String com.whatsapp.util.MediaUtilities.routine_4142( java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_1 
	invokestatic java.lang.String com.whatsapp.util.MediaUtilities.routine_4623( java.lang.String ) // MediaUtilities
	astore_2 
	aload_2 
	ifnonnull Label8
	aload_1 
	areturn 
Label8:
	aconst_null 
	astore_3 
	aconst_null 
	astore_4 
	aload_0 
	iconst_1 
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String, int ) // Connector
	checkcast_lib javax.microedition.io.file.FileConnection//javax.microedition.io.file.FileConnection javax.microedition.io.file.FileConnection javax.microedition.io.file.FileConnection
	astore_4 
	aload_4 
	aload_2 
	iconst_1 
	invokeinterface interfacemethodref_188 // pc=3 guess=12
	astore_5 
Label22:
	aload_5 
	invokeinterface interfacemethodref_189 // pc=1 guess=13
	ifeq Label30
	aload_5 
	invokeinterface interfacemethodref_190 // pc=1 guess=14
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore_3 
	goto Label22
Label30:
	aload_4 
	ifnull Label63
	aload_4 
	invokeinterface interfacemethodref_181 // pc=1 guess=15
	goto Label63
	astore 8
	goto Label63
	astore_5 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_2021:"unable to list directory contents: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_5 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_4 
	ifnull Label63
	aload_4 
	invokeinterface interfacemethodref_181 // pc=1 guess=15
	goto Label63
	astore 8
	goto Label63
	astore_6 
	aload_4 
	ifnull Label61
	aload_4 
	invokeinterface interfacemethodref_181 // pc=1 guess=15
	goto Label61
	astore 8
Label61:
	aload_6 
	athrow 
Label63:
	aload_3 
	ifnull Label72
	aload_0 
	aload_3 
	invokestatic java.lang.String com.whatsapp.util.MediaUtilities.routine_4383( java.lang.String, java.lang.String ) // MediaUtilities
	astore_3 
	aload_3 
	invokestatic java.lang.String com.whatsapp.util.MediaUtilities.routine_4723( java.lang.String ) // MediaUtilities
	areturn 
Label72:
	aload_1 
	areturn 
	}


static private final java.lang.String com.whatsapp.util.MediaUtilities.routine_4383( java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aconst_null 
	astore_2 
	aconst_null 
	astore_3 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_0 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	iconst_1 
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String, int ) // Connector
	checkcast_lib net.rim.device.api.io.file.ExtendedFileConnection//net.rim.device.api.io.file.ExtendedFileConnection net.rim.device.api.io.file.ExtendedFileConnection net.rim.device.api.io.file.ExtendedFileConnection
	astore_3 
	aload_3 
	invokeinterface interfacemethodref_191 // pc=1 guess=16
	astore_4 
	aload_3 
	invokeinterface interfacemethodref_192 // pc=1 guess=17
	ifeq Label40
	aload_4 
	invokenonvirtual_lib java.lang.String.toLowerCase // pc=1
	ldc literal_2022:".rem"
	invokenonvirtual_lib java.lang.String.endsWith // pc=2
	ifeq Label40
	aload_4 
	stringlength 
	bipush 4
	if_icmple Label40
	aload_4 
	iconst_0 
	aload_1 
	stringlength 
	bipush 4
	isub 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	astore_2 
Label40:
	aload_3 
	ifnull Label73
	aload_3 
	invokeinterface interfacemethodref_181 // pc=1 guess=18
	goto Label73
	astore_7 
	goto Label73
	astore_4 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_2023:"unable to strip encryption suffix: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_4 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_3 
	ifnull Label73
	aload_3 
	invokeinterface interfacemethodref_181 // pc=1 guess=18
	goto Label73
	astore_7 
	goto Label73
	astore_5 
	aload_3 
	ifnull Label71
	aload_3 
	invokeinterface interfacemethodref_181 // pc=1 guess=18
	goto Label71
	astore_7 
Label71:
	aload_5 
	athrow 
Label73:
	aload_2 
	ifnonnull Label77
	aload_1 
	areturn 
Label77:
	aload_2 
	areturn 
	}


static private final java.lang.String com.whatsapp.util.MediaUtilities.routine_4623( java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	bipush 46
	invokenonvirtual_lib java.lang.String.lastIndexOf // pc=2
	istore_2 
	iload_2 
	ifge Label10
	aload_0 
	astore_3 
	goto Label15
Label10:
	aload_0 
	iconst_0 
	iload_2 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	astore_3 
Label15:
	aload_3 
	ldc literal_2024:"-WA"
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	aload_3 
	stringlength 
	bipush 6
	isub 
	if_icmpne Label40
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_3 
	iconst_0 
	aload_3 
	stringlength 
	bipush 3
	isub 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	bipush 42
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_1 
	aload_1 
	areturn 
Label40:
	aconst_null 
	astore_1 
	aload_1 
	areturn 
	}


static private final java.lang.String com.whatsapp.util.MediaUtilities.routine_4723( java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	bipush 46
	invokenonvirtual_lib java.lang.String.lastIndexOf // pc=2
	istore_1 
	iload_1 
	ifge Label12
	aload_0 
	astore_2 
	ldc_nullstr 
	astore_3 
	goto Label21
Label12:
	aload_0 
	iconst_0 
	iload_1 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	astore_2 
	aload_0 
	iload_1 
	invokenonvirtual_lib java.lang.String.substring // pc=2
	astore_3 
Label21:
	aload_2 
	ldc literal_2024:"-WA"
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	aload_2 
	stringlength 
	bipush 6
	isub 
	if_icmpne Label63
	aload_2 
	aload_2 
	stringlength 
	bipush 3
	isub 
	invokenonvirtual_lib java.lang.String.substring // pc=2
	invokestatic_lib int parseInt( java.lang.String ) // Integer
	iconst_1 
	iadd 
	istore_4 
	iload_4 
	sipush 999
	if_icmpge Label63
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_2 
	iconst_0 
	aload_2 
	stringlength 
	bipush 3
	isub 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	iload_4 
	bipush 10
	bipush 3
	invokestatic_lib java.lang.String toString( int, int, int ) // NumberUtilities
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_3 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	astore_4 
Label63:
	bipush -1
	istore_4 
	iconst_0 
	istore_5 
Label67:
	aload_2 
	bipush 40
	iload_4 
	iconst_1 
	iadd 
	invokenonvirtual_lib java.lang.String.indexOf // pc=3
	dup 
	istore_4 
	iflt Label117
	aload_2 
	bipush 41
	iload_4 
	iconst_1 
	iadd 
	invokenonvirtual_lib java.lang.String.indexOf // pc=3
	dup 
	istore_5 
	iflt Label117
	aload_2 
	iload_4 
	iconst_1 
	iadd 
	iload_5 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	invokestatic_lib int parseInt( java.lang.String ) // Integer
	istore_6 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_2 
	iconst_0 
	iload_4 
	iconst_1 
	iadd 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	iload_6 
	iconst_1 
	iadd 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	aload_2 
	iload_5 
	invokenonvirtual_lib java.lang.String.substring // pc=2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_3 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	astore_6 
	goto Label67
Label117:
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_2025:"(1)"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_3 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}


static public final java.lang.String generateMediaFilename( int, long, java.lang.String ); // address: 0
	{
	enter 
	iload_0 
	bipush 3
	if_icmpne Label7
	getstatic_lib module:WhatsApp-19.class#0.static_69 // class#0
	astore_4 
	goto Label21
Label7:
	iload_0 
	bipush 2
	if_icmpne Label13
	getstatic_lib module:WhatsApp-19.class#0.static_68 // class#0
	astore_4 
	goto Label21
Label13:
	iload_0 
	iconst_1 
	if_icmpne Label19
	getstatic_lib module:WhatsApp-19.class#0.static_70 // class#0
	astore_4 
	goto Label21
Label19:
	getstatic_lib module:WhatsApp-19.class#0.static_71 // class#0
	astore_4 
Label21:
	new_lib net.rim.device.api.i18n.SimpleDateFormat//net.rim.device.api.i18n.SimpleDateFormat net.rim.device.api.i18n.SimpleDateFormat net.rim.device.api.i18n.SimpleDateFormat
	dup 
	ldc literal_2026:"yyyyMMdd"
	invokespecial_lib net.rim.device.api.i18n.SimpleDateFormat.<init> // pc=2
	astore_5 
	aload_4 
	bipush 2
	newarray_object_lib Object//java.lang.Object java.lang.Object java.lang.Object
	dup 
	iconst_0 
	aload_5 
	lload 1
	invokevirtual java.lang.String formatLocal( net.rim.device.api.i18n.DateFormat, long ) // pc=3
	aastore 
	dup 
	iconst_1 
	aload_3 
	aastore 
	invokestatic_lib java.lang.String format( java.lang.String, java.lang.Object[] ) // MessageFormat
	areturn 
	}


static public final boolean isAudioTypeSupported( java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	ifnull Label32
	aload_0 
	getstatic_lib module:WhatsApp-19.class#0.static_95 // class#0
	invokenonvirtual_lib java.lang.String.startsWith // pc=2
	ifeq Label32
	aload_0 
	getstatic_lib module:WhatsApp-19.class#0.static_88 // class#0
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label13
	iconst_1 
	ireturn 
Label13:
	ldc literal_2027:"file"
	invokestatic_lib java.lang.String[] getSupportedContentTypes( java.lang.String ) // Manager
	astore_1 
	iconst_0 
	istore_2 
Label18:
	iload_2 
	aload_1 
	arraylength 
	if_icmpge Label32
	aload_0 
	aload_1 
	iload_2 
	aaload 
	invokenonvirtual_lib java.lang.String.equalsIgnoreCase // pc=2
	ifeq Label30
	iconst_1 
	ireturn 
Label30:
	iinc 2 1
	goto Label18
Label32:
	iconst_0 
	ireturn 
	}


static public final boolean isVideoTypeSupported( java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	ifnull Label32
	aload_0 
	getstatic_lib module:WhatsApp-19.class#0.static_96 // class#0
	invokenonvirtual_lib java.lang.String.startsWith // pc=2
	ifeq Label32
	aload_0 
	getstatic_lib module:WhatsApp-19.class#0.static_89 // class#0
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label13
	iconst_1 
	ireturn 
Label13:
	ldc literal_2027:"file"
	invokestatic_lib java.lang.String[] getSupportedContentTypes( java.lang.String ) // Manager
	astore_1 
	iconst_0 
	istore_2 
Label18:
	iload_2 
	aload_1 
	arraylength 
	if_icmpge Label32
	aload_0 
	aload_1 
	iload_2 
	aaload 
	invokenonvirtual_lib java.lang.String.equalsIgnoreCase // pc=2
	ifeq Label30
	iconst_1 
	ireturn 
Label30:
	iinc 2 1
	goto Label18
Label32:
	iconst_0 
	ireturn 
	}


static public final net.rim.device.api.system.EncodedImage getEncodedImage( module:WhatsApp-38.class#0 ); // address: 0
	{
	enter 
	aconst_null 
	astore_1 
	aload_0 
	invokenonvirtual_lib .routine_135 // pc=1
	ifeq Label25
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	invokestatic_lib net.rim.device.api.system.EncodedImage createEncodedImage( byte[], int, int ) // EncodedImage
	astore_1 
	aload_1 
	areturn 
	astore_2 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_2028:"Raw image data in unknown format: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_2 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_1 
	areturn 
Label25:
	aload_0 
	invokenonvirtual_lib .routine_255 // pc=1
	astore_2 
	aload_2 
	ifnull Label48
	aload_2 
	iconst_0 
	aload_2 
	arraylength 
	invokestatic_lib net.rim.device.api.system.EncodedImage createEncodedImage( byte[], int, int ) // EncodedImage
	astore_1 
	aload_1 
	areturn 
	astore_3 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_2029:"Image file in unknown format: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_3 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
Label48:
	aload_1 
	areturn 
	}


static public final module:WhatsApp-26.class#23 createFMessage( java.lang.String, module:WhatsApp-24.class#25 ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-13.class#0.routine_833(  ) // class#0
	astore_2 
	new_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-26.class#23 module:WhatsApp-26.class#23 module:WhatsApp-26.class#23
	dup 
	aload_0 
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	aconst_null 
	invokespecial_lib .routine_6263 // pc=4
	astore_3 
	new_lib com.whatsapp.client.MediaData//module:WhatsApp-38.class#0 module:WhatsApp-38.class#0 module:WhatsApp-38.class#0
	dup 
	aload_3 
	invokespecial_lib .routine_726 // pc=2
	astore_4 
	aload_3 
	aload_4 
	putfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	getstatic_lib module:WhatsApp-19.class#0.static_128 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_2030:"null"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokenonvirtual_lib java.lang.String.startsWith // pc=2
	ifeq Label34
	aload_1 
	aload_2 
	getfield .field_30_30   // get_name_1:  .field_30_30   // get_name_2:  .field_30_30   // get_Name:    .field_30_30   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 30
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
Label34:
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_2031:"using filename "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_2032:" with type "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_2033:" for invocation"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_4 
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iconst_1 
	invokenonvirtual_lib .routine_593 // pc=3
	istore_5 
	iload_5 
	ifne Label63
	sipush 615
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokestatic_lib alert( java.lang.String ) // Dialog
	aconst_null 
	areturn 
Label63:
	aload_4 
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_4 
	getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	getstatic_lib module:WhatsApp-19.class#0.static_94 // class#0
	invokenonvirtual_lib java.lang.String.startsWith // pc=2
	ifeq Label87
	aload_3 
	iconst_1 
	putfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	aload_4 
	iconst_1 
	invokestatic_lib module:WhatsApp-38.class#0.routine_1031(  ) // class#0
	aload_3 
	aload_4 
	invokenonvirtual_lib .routine_9 // pc=1
	invokestatic_lib module:WhatsApp-32.class#4.routine_1572(  ) // class#4
	invokenonvirtual_lib .routine_6076 // pc=2
	aload_3 
	iconst_1 
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	goto Label99
Label87:
	aload_4 
	getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	getstatic_lib module:WhatsApp-19.class#0.static_95 // class#0
	invokenonvirtual_lib java.lang.String.startsWith // pc=2
	ifeq Label96
	aload_3 
	bipush 2
	putfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	goto Label99
Label96:
	aload_3 
	bipush 3
	putfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
Label99:
	aload_3 
	aload_4 
	invokenonvirtual_lib .routine_157 // pc=1
	putfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	aload_3 
	areturn 
	}

}
