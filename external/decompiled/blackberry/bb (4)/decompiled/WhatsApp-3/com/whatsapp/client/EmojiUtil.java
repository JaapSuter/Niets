// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-15.cod
// Module version  : 2.7.3204
// Class ID        : 5
// ########################################################


package com.whatsapp.client;


abstract public final class EmojiUtil extends Object

{
	// @@@@@@@@@@@@@ Static fields 
	private final static net.rim.device.api.util.IntHashtable /*net.rim.device.api.util.IntHashtable*/  field_53942 ; // ofs = 53942 addr = 16)


	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.EmojiUtil ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}


static public final java.lang.String emojiReplace( java.lang.String, char ); // address: 0
	{
	enter 
	aload_0 
	ifnonnull Label5
	aconst_null 
	areturn 
Label5:
	iconst_0 
	istore_2 
	aload_0 
	invokenonvirtual_lib java.lang.String.toCharArray // pc=1
	astore_3 
	iconst_0 
	istore_4 
Label12:
	iload_4 
	aload_3 
	arraylength 
	if_icmpge Label29
	aload_3 
	iload_4 
	caload 
	invokestatic boolean isEmoji( char ) // EmojiUtil
	ifeq Label27
	iconst_1 
	istore_2 
	aload_3 
	iload_4 
	iload_1 
	castore 
Label27:
	iinc 4 1
	goto Label12
Label29:
	iload_2 
	ifeq Label34
	aload_3 
	invokestatic_lib java.lang.String valueOf( char[] ) // String
	areturn 
Label34:
	aload_0 
	areturn 
	}


static public final int indexOf( java.lang.String, int ); // address: 0
	{
	enter 
	aload_0 
	stringlength 
	istore_2 
	iload_1 
	istore_3 
Label6:
	iload_3 
	iload_2 
	if_icmpge Label18
	aload_0 
	iload_3 
	stringaload 
	invokestatic boolean isEmoji( char ) // EmojiUtil
	ifeq Label16
	iload_3 
	ireturn 
Label16:
	iinc 3 1
	goto Label6
Label18:
	bipush -1
	ireturn 
	}


static public final appendEmojiInputFormat( net.rim.device.api.ui.Font, java.lang.StringBuffer, char ); // address: 0
	{
	enter 
	aload_0 
	sipush 8206
	invokevirtual int getAdvance( net.rim.device.api.ui.Font, char ) // pc=2
	ifne Label7
	iconst_1 
	goto Label8
Label7:
	iconst_0 
Label8:
	istore_3 
	aload_1 
	invokevirtual int length( java.lang.StringBuffer ) // pc=1
	istore_4 
	iload_2 
	invokestatic boolean isEmoji( char ) // EmojiUtil
	ifne Label20
	aload_1 
	iload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	return 
Label20:
	aload_1 
	iload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	iload_3 
	ifeq Label30
	aload_1 
	sipush 8206
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
Label30:
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	istore_5 
Label33:
	aload_0 
	aload_1 
	iload_4 
	iipush 2147483647
	invokevirtual int getAdvance( net.rim.device.api.ui.Font, java.lang.StringBuffer, int, int ) // pc=4
	iload_5 
	if_icmpge Label63
	iload_3 
	ifeq Label58
	aload_1 
	aload_1 
	invokevirtual int length( java.lang.StringBuffer ) // pc=1
	iconst_1 
	isub 
	invokevirtual java.lang.StringBuffer deleteCharAt( java.lang.StringBuffer, int ) // pc=2
	pop 
	aload_1 
	sipush 8198
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	aload_1 
	sipush 8206
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	goto Label33
Label58:
	aload_1 
	sipush 8198
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	goto Label33
Label63:
	return 
	}


static public final java.lang.String removeEmojiLayout( java.lang.String ); // address: 0
	{
	enter 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	astore_1 
	aload_0 
	stringlength 
	istore_2 
	iconst_0 
	istore_3 
Label10:
	iload_3 
	iload_2 
	if_icmpge Label27
	aload_0 
	iload_3 
	stringaload 
	istore_4 
	iload_4 
	invokestatic boolean isEmojiLayout( char ) // EmojiUtil
	ifeq Label21
	goto Label25
Label21:
	aload_1 
	iload_4 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
Label25:
	iinc 3 1
	goto Label10
Label27:
	aload_1 
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}


static public final boolean isEmojiLayout( char ); // address: 0
	{
	enter_narrow 
	iload_0 
	sipush 8198
	if_icmpeq Label7
	iload_0 
	sipush 8206
	if_icmpne Label9
Label7:
	iconst_1 
	ireturn 
Label9:
	iconst_0 
	ireturn 
	}


static public final drawText( net.rim.device.api.ui.Graphics, java.lang.String, int, int ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Graphics ) // pc=1
	astore_4 
	iconst_0 
	istore_5 
	iconst_0 
	istore_6 
Label8:
	aload_1 
	iload_6 
	invokestatic int indexOf( java.lang.String, int ) // EmojiUtil
	dup 
	istore_7 
	iflt Label60
	iload_5 
	aload_0 
	aload_1 
	iload_6 
	iload_7 
	iload_6 
	isub 
	iload_2 
	iload_5 
	iadd 
	iload_3 
	iconst_0 
	iipush 2147483647
	invokevirtual int drawText( net.rim.device.api.ui.Graphics, java.lang.String, int, int, int, int, int, int ) // pc=8
	iadd 
	istore_5 
	aload_1 
	iload_7 
	stringaload 
	aload_4 
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	invokestatic net.rim.device.api.system.Bitmap getBitmap( char, int ) // EmojiUtil
	astore 8
	aload_0 
	iload_2 
	iload_5 
	iadd 
	iload_3 
	aload 8
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload 8
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	aload 8
	iconst_0 
	iconst_0 
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=8
	iload_5 
	aload 8
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	iadd 
	istore_5 
	iload_7 
	iconst_1 
	iadd 
	istore_6 
	goto Label8
Label60:
	iload_6 
	aload_1 
	stringlength 
	if_icmpge Label81
	iload_5 
	aload_0 
	aload_1 
	iload_6 
	aload_1 
	stringlength 
	iload_6 
	isub 
	iload_2 
	iload_5 
	iadd 
	iload_3 
	iconst_0 
	iipush 2147483647
	invokevirtual int drawText( net.rim.device.api.ui.Graphics, java.lang.String, int, int, int, int, int, int ) // pc=8
	iadd 
	istore_5 
Label81:
	return 
	}


static public final int drawText( module:WhatsApp-14.class#20, net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.ui.DrawTextParam ); // address: 0
	{
	enter 
	aload_0 
	invokeinterface interfacemethodref_70 // pc=1 guess=1
	astore_7 
	aload_0 
	invokeinterface interfacemethodref_71 // pc=1 guess=2
	istore 8
	aload_6 
	invokestatic int getStartOffset( net.rim.device.api.ui.DrawTextParam ) // EmojiUtil
	istore 9
	aload_6 
	invokestatic int getEndOffset( net.rim.device.api.ui.DrawTextParam ) // EmojiUtil
	istore 10
	aload_7 
	iload_2 
	iload 9
	iadd 
	iload 8
	isub 
	iconst_0 
	invokestatic_lib int max( int, int ) // Math
	iload_2 
	iload 10
	iadd 
	iload 8
	isub 
	iconst_0 
	invokestatic_lib int max( int, int ) // Math
	invokenonvirtual_lib java.lang.String.substring // pc=3
	astore 11
	aload_0 
	invokeinterface interfacemethodref_72 // pc=1 guess=3
	ifne Label36
	aload_0 
	invokeinterface interfacemethodref_73 // pc=1 guess=4
	ifne Label38
Label36:
	bipush -1
	goto Label46
Label38:
	aload_0 
	invokeinterface interfacemethodref_74 // pc=1 guess=5
	iload 8
	iadd 
	iload_2 
	iload 9
	iadd 
	isub 
Label46:
	istore 12
	aload_1 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Graphics ) // pc=1
	astore 13
	aload 11
	stringlength 
	istore 14
	iconst_0 
	istore 15
	iload 8
	ifle Label89
	iload_2 
	iload 8
	if_icmpge Label89
	iload_3 
	iload 8
	iload_2 
	isub 
	if_icmplt Label89
	iload 9
	iload 8
	if_icmpge Label89
	aload_1 
	invokevirtual int getColor( net.rim.device.api.ui.Graphics ) // pc=1
	istore 16
	aload_1 
	aload_0 
	invokeinterface interfacemethodref_75 // pc=1 guess=6
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_0 
	aload_1 
	iload_2 
	iload 8
	iload_2 
	isub 
	iload_4 
	iload_5 
	aload_6 
	invokeinterface interfacemethodref_76 // pc=7 guess=7
	istore 15
	aload_1 
	iload 16
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
Label89:
	iconst_0 
	istore 16
	bipush -1
	istore 17
Label93:
	iload 16
	iload 14
	if_icmplt Label97
	goto_w Label346
Label97:
	aload 11
	iload 16
	invokestatic int indexOf( java.lang.String, int ) // EmojiUtil
	istore 16
	iload 16
	bipush -1
	if_icmpne Label139
	aload 11
	stringlength 
	istore 16
	iload 17
	iconst_1 
	iadd 
	istore 18
	iload 16
	istore 19
	aload_6 
	iload 9
	iload 18
	iload 19
	invokestatic com.whatsapp.client.EmojiUtil.routine_3549( net.rim.device.api.ui.DrawTextParam, int, int, int ) // EmojiUtil
	aload_0 
	aload_1 
	iload_2 
	iload_3 
	iload 15
	iload_4 
	iadd 
	iload_5 
	aload_6 
	invokeinterface interfacemethodref_76 // pc=7 guess=7
	pop 
	iload 15
	aload 13
	aload 11
	iload 18
	iload 19
	invokenonvirtual_lib java.lang.String.substring // pc=3
	invokevirtual int getAdvance( net.rim.device.api.ui.Font, java.lang.String ) // pc=2
	iadd 
	istore 15
	goto_w Label346
Label139:
	iload 17
	iconst_1 
	iadd 
	istore 18
	iload 16
	istore 19
	iload 19
	iload 18
	if_icmple Label173
	aload_6 
	iload 9
	iload 18
	iload 19
	invokestatic com.whatsapp.client.EmojiUtil.routine_3549( net.rim.device.api.ui.DrawTextParam, int, int, int ) // EmojiUtil
	aload_0 
	aload_1 
	iload_2 
	iload_3 
	iload 15
	iload_4 
	iadd 
	iload_5 
	aload_6 
	invokeinterface interfacemethodref_76 // pc=7 guess=7
	pop 
	iload 15
	aload 13
	aload 11
	iload 18
	iload 19
	invokenonvirtual_lib java.lang.String.substring // pc=3
	invokevirtual int getAdvance( net.rim.device.api.ui.Font, java.lang.String ) // pc=2
	iadd 
	istore 15
Label173:
	aload 11
	iload 16
	stringaload 
	aload 13
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	invokestatic net.rim.device.api.system.Bitmap getBitmap( char, int ) // EmojiUtil
	astore 20
	iload 16
	istore 18
	iload 16
	iconst_1 
	iadd 
	istore 19
Label186:
	iload 19
	aload 11
	stringlength 
	if_icmpge Label197
	aload 11
	iload 19
	stringaload 
	sipush 8198
	if_icmpne Label197
	iinc 19 1
	goto Label186
Label197:
	iload 19
	iconst_1 
	isub 
	istore 16
	aload 11
	iload 18
	iload 19
	invokenonvirtual_lib java.lang.String.substring // pc=3
	astore 21
	aload 13
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	aload 13
	aload 21
	invokevirtual int getAdvance( net.rim.device.api.ui.Font, java.lang.String ) // pc=2
	invokestatic_lib int min( int, int ) // Math
	istore 22
	aload 20
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload 20
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	invokestatic_lib int max( int, int ) // Math
	istore 23
	iload 23
	iload 22
	invokestatic_lib int div( int, int ) // Fixed32
	istore 24
	iload_4 
	iload 15
	iadd 
	iconst_1 
	isub 
	iconst_0 
	invokestatic_lib int max( int, int ) // Math
	istore 25
	iload_5 
	iload 22
	aload 13
	invokevirtual int getAscent( net.rim.device.api.ui.Font ) // pc=1
	iadd 
	bipush 2
	idiv 
	isub 
	iconst_0 
	invokestatic_lib int max( int, int ) // Math
	istore 26
	bipush 4
	newarray 5
	dup 
	iconst_0 
	iload 25
	iastore 
	dup 
	iconst_1 
	iload 25
	iload 22
	iadd 
	iastore 
	dup 
	bipush 2
	iload 25
	iload 22
	iadd 
	iastore 
	dup 
	bipush 3
	iload 25
	iastore 
	astore 27
	bipush 4
	newarray 5
	dup 
	iconst_0 
	iload 26
	iastore 
	dup 
	iconst_1 
	iload 26
	iastore 
	dup 
	bipush 2
	iload 26
	iload 22
	iadd 
	iastore 
	dup 
	bipush 3
	iload 26
	iload 22
	iadd 
	iastore 
	astore 28
	arrayinit [0, 0, 0, 0]
	astore 29
	iload 18
	iload 12
	if_icmpne Label321
	iipush 2129150
	istore 30
	iipush 478380
	istore 31
	aload_1 
	aload 27
	aload 28
	aload 29
	bipush 4
	newarray 5
	dup 
	iconst_0 
	iload 30
	iastore 
	dup 
	iconst_1 
	iload 30
	iastore 
	dup 
	bipush 2
	iload 31
	iastore 
	dup 
	bipush 3
	iload 31
	iastore 
	aconst_null 
	invokevirtual drawShadedFilledPath( net.rim.device.api.ui.Graphics, int[], int[], byte[], int[], int[] ) // pc=6
Label321:
	aload_1 
	aload 27
	aload 28
	aload 29
	aconst_null 
	iload 25
	iload 26
	iload 24
	iconst_0 
	invokestatic_lib int toFP( int ) // Fixed32
	iconst_0 
	invokestatic_lib int toFP( int ) // Fixed32
	iload 24
	aload 20
	invokevirtual drawTexturedPath( net.rim.device.api.ui.Graphics, int[], int[], byte[], int[], int, int, int, int, int, int, net.rim.device.api.system.Bitmap ) // pc=12
	iload 15
	aload 13
	aload 21
	invokevirtual int getAdvance( net.rim.device.api.ui.Font, java.lang.String ) // pc=2
	iadd 
	istore 15
	iload 16
	istore 17
	iinc 16 1
	goto_w Label93
Label346:
	aload_6 
	iconst_0 
	iload 9
	iload 10
	invokestatic com.whatsapp.client.EmojiUtil.routine_3549( net.rim.device.api.ui.DrawTextParam, int, int, int ) // EmojiUtil
	iconst_0 
	ireturn 
	}


static public final int getEndOffset( net.rim.device.api.ui.DrawTextParam ); // address: 0
	{
	enter_narrow 
	aload_0_getfield iEndOffset   // get_name_1:  iEndOffset   // get_name_2:  iEndOffset   // get_Name:    iEndOffset   // getName->1:  iEndOffset   // getName->2:  iEndOffset   // getName->N:  iEndOffset   // ofs = -1 ord = 0 addr = -1
	ireturn 
	}


static public final int getStartOffset( net.rim.device.api.ui.DrawTextParam ); // address: 0
	{
	enter_narrow 
	aload_0_getfield iStartOffset   // get_name_1:  iStartOffset   // get_name_2:  iStartOffset   // get_Name:    iStartOffset   // getName->1:  iStartOffset   // getName->2:  iStartOffset   // getName->N:  iStartOffset   // ofs = -1 ord = 1 addr = -1
	ireturn 
	}


static private final com.whatsapp.client.EmojiUtil.routine_3549( net.rim.device.api.ui.DrawTextParam, int, int, int ); // address: 0
	{
	enter 
	aload_0 
	iload_1 
	iload_2 
	iadd 
	putfield iStartOffset   // get_name_1:  iStartOffset   // get_name_2:  iStartOffset   // get_Name:    iStartOffset   // getName->1:  iStartOffset   // getName->2:  iStartOffset   // getName->N:  iStartOffset   // ofs = -1 ord = 1 addr = -1
	aload_0 
	iload_1 
	iload_3 
	iadd 
	putfield iEndOffset   // get_name_1:  iEndOffset   // get_name_2:  iEndOffset   // get_Name:    iEndOffset   // getName->1:  iEndOffset   // getName->2:  iEndOffset   // getName->N:  iEndOffset   // ofs = -1 ord = 0 addr = -1
	return 
	}


static public final java.lang.String getEllipsisString( net.rim.device.api.ui.Font, java.lang.String, int ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	invokestatic int com.whatsapp.client.EmojiUtil.routine_3707( net.rim.device.api.ui.Font, java.lang.String ) // EmojiUtil
	iload_2 
	if_icmpgt Label8
	aload_1 
	areturn 
Label8:
	iload_2 
	aload_0 
	sipush 8230
	invokevirtual int getAdvance( net.rim.device.api.ui.Font, char ) // pc=2
	isub 
	istore_3 
	iload_3 
	ifge Label18
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	areturn 
Label18:
	iconst_0 
	istore_4 
	iconst_0 
	istore_5 
Label22:
	iload_5 
	iload_3 
	if_icmpge Label46
	aload_1 
	iload_4 
	stringaload 
	istore_6 
	iload_6 
	invokestatic boolean isEmoji( char ) // EmojiUtil
	ifeq Label38
	iload_5 
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	iadd 
	istore_5 
	goto Label44
Label38:
	iload_5 
	aload_0 
	iload_6 
	invokevirtual int getAdvance( net.rim.device.api.ui.Font, char ) // pc=2
	iadd 
	istore_5 
Label44:
	iinc 4 1
	goto Label22
Label46:
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_1 
	iconst_0 
	iload_4 
	iconst_1 
	isub 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	sipush 8230
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}


static private final int com.whatsapp.client.EmojiUtil.routine_3707( net.rim.device.api.ui.Font, java.lang.String ); // address: 0
	{
	enter 
	iconst_0 
	istore_2 
	iconst_0 
	istore_3 
Label5:
	aload_1 
	iload_3 
	invokestatic int indexOf( java.lang.String, int ) // EmojiUtil
	dup 
	istore_4 
	iflt Label31
	iload_2 
	aload_0 
	aload_1 
	iload_3 
	iload_4 
	iload_3 
	isub 
	invokevirtual int getAdvance( net.rim.device.api.ui.Font, java.lang.String, int, int ) // pc=4
	iadd 
	istore_2 
	iload_2 
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	iadd 
	istore_2 
	iload_4 
	iconst_1 
	iadd 
	istore_3 
	goto Label5
Label31:
	iload_3 
	aload_1 
	stringlength 
	if_icmpge Label46
	iload_2 
	aload_0 
	aload_1 
	iload_3 
	aload_1 
	stringlength 
	iload_3 
	isub 
	invokevirtual int getAdvance( net.rim.device.api.ui.Font, java.lang.String, int, int ) // pc=4
	iadd 
	istore_2 
Label46:
	iload_2 
	ireturn 
	}


static public final net.rim.device.api.system.Bitmap getBitmap( char, int ); // address: 0
	{
	enter_narrow 
	iload_1 
	bipush 20
	if_icmple Label7
	bipush 48
	istore_2 
	goto Label9
Label7:
	bipush 20
	istore_2 
Label9:
	iload_0 
	iload_2 
	iload_1 
	invokestatic net.rim.device.api.system.Bitmap getEncodedImageResource( char, int, int ) // EmojiUtil
	areturn 
	}


static public final net.rim.device.api.system.Bitmap getEncodedImageResource( char, int, int ); // address: 0
	{
	enter 
	iload_0 
	iconst_1 
	isub 
	iipush 65280
	iand 
	bipush 8
	ishr 
	istore_3 
	iload_0 
	iconst_1 
	isub 
	sipush 255
	iand 
	istore_4 
	iload_3 
	i2c 
	iload_2 
	invokestatic int com.whatsapp.client.EmojiUtil.routine_6765( char, int ) // EmojiUtil
	istore_5 
	getstatic com.whatsapp.client.EmojiUtil.field_53942 // EmojiUtil
	iload_5 
	invokevirtual boolean containsKey( net.rim.device.api.util.IntHashtable, int ) // pc=2
	ifne Label61
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	iload_3 
	i2c 
	bipush 2
	invokestatic java.lang.String com.whatsapp.client.EmojiUtil.routine_4020( char, int ) // EmojiUtil
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_687:"-"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	iload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_688:".png"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib net.rim.device.api.system.EncodedImage getEncodedImageResource( java.lang.String ) // EncodedImage
	checkcast_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	astore_6 
	iload_2 
	ifne Label46
	iipush 65536
	goto Label49
Label46:
	iload_1 
	iload_2 
	invokestatic_lib int div( int, int ) // Fixed32
Label49:
	istore_7 
	aload_6 
	iload_7 
	iload_7 
	invokevirtual net.rim.device.api.system.EncodedImage scaleImage32( net.rim.device.api.system.EncodedImage, int, int ) // pc=3
	astore 8
	getstatic com.whatsapp.client.EmojiUtil.field_53942 // EmojiUtil
	iload_5 
	aload 8
	invokevirtual net.rim.device.api.system.Bitmap getBitmap( net.rim.device.api.system.EncodedImage ) // pc=1
	invokevirtual java.lang.Object put( net.rim.device.api.util.IntHashtable, int, java.lang.Object ) // pc=3
	pop 
Label61:
	iload_2 
	iload_2 
	imul 
	newarray 5
	astore_6 
	getstatic com.whatsapp.client.EmojiUtil.field_53942 // EmojiUtil
	iload_5 
	invokevirtual java.lang.Object get( net.rim.device.api.util.IntHashtable, int ) // pc=2
	checkcast_lib net.rim.device.api.ui.XYRect//net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect
	aload_6 
	iconst_0 
	iload_2 
	iload_4 
	iload_2 
	imul 
	iconst_0 
	iload_2 
	iload_2 
	invokevirtual getARGB( net.rim.device.api.system.Bitmap, int[], int, int, int, int, int, int ) // pc=8
	new_lib net.rim.device.api.ui.XYRect//net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect
	dup 
	iload_2 
	iload_2 
	invokespecial_lib net.rim.device.api.system.Bitmap.<init> // pc=3
	astore_7 
	aload_7 
	aload_6 
	iconst_0 
	iload_2 
	iconst_0 
	iconst_0 
	iload_2 
	iload_2 
	invokevirtual setARGB( net.rim.device.api.system.Bitmap, int[], int, int, int, int, int, int ) // pc=8
	aload_7 
	areturn 
	}


static private final java.lang.String com.whatsapp.client.EmojiUtil.routine_4020( char, int ); // address: 0
	{
	enter_narrow 
	iload_0 
	invokestatic_lib java.lang.String toHexString( int ) // Integer
	astore_2 
Label4:
	aload_2 
	stringlength 
	iload_1 
	if_icmpge Label17
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_689:"0"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_2 
	goto Label4
Label17:
	aload_2 
	areturn 
	}


static public final boolean isEmoji( char ); // address: 0
	{
	enter 
	iload_0 
	tableswitch  :
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

Label3:
	iconst_0 
	ireturn 
Label5:
	iconst_1 
	ireturn 
	}


static private final int com.whatsapp.client.EmojiUtil.routine_6765( char, int ); // address: 0
	{
	enter_narrow 
	iload_0 
	istore_2 
	iload_1 
	bipush 8
	ishl 
	iload_2 
	iadd 
	ireturn 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	synch_static EmojiUtil
	clinit_wait 
	new_lib Character//java.lang.Character java.lang.Character java.lang.Character
	dup 
	invokespecial_lib net.rim.device.api.util.IntHashtable.<init> // pc=1
	putstatic com.whatsapp.client.EmojiUtil.field_53942 // EmojiUtil
	clinit_return 
	}

}
