// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-61.cod
// Module version  : 2.8.1914
// Class ID        : 1
// ########################################################


package me.regexp;


abstract public final class RECharacter extends Object

{
	// @@@@@@@@@@@@@ Static fields 
	final static byte[] /*byte[]*/  CHAR_CLASSES ; // ofs = 52736 addr = 4)


	// @@@@@@@@@@@@@ Static routines 

public <init>( me.regexp.RECharacter ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}


static public final char toLowerCase( char ); // address: 0
	{
	enter_narrow 
	iload_0 
	invokestatic_lib char toLowerCase( char ) // Character
	ireturn 
	}


static public final boolean isWhitespace( char ); // address: 0
	{
	enter_narrow 
	iload_0 
	invokestatic byte getType( char ) // RECharacter
	istore_1 
	iload_1 
	bipush 12
	if_icmpeq Label13
	iload_1 
	bipush 13
	if_icmpeq Label13
	iload_1 
	bipush 14
	if_icmpne Label22
Label13:
	iload_0 
	sipush 160
	if_icmpeq Label22
	iload_0 
	sipush 8199
	if_icmpeq Label22
	iload_0 
	sipush 8239
	if_icmpne Label52
Label22:
	iload_0 
	bipush 9
	if_icmpeq Label52
	iload_0 
	bipush 10
	if_icmpeq Label52
	iload_0 
	bipush 11
	if_icmpeq Label52
	iload_0 
	bipush 12
	if_icmpeq Label52
	iload_0 
	bipush 13
	if_icmpeq Label52
	iload_0 
	bipush 9
	if_icmpeq Label52
	iload_0 
	bipush 28
	if_icmpeq Label52
	iload_0 
	bipush 29
	if_icmpeq Label52
	iload_0 
	bipush 30
	if_icmpeq Label52
	iload_0 
	bipush 31
	if_icmpne Label54
Label52:
	iconst_1 
	ireturn 
Label54:
	iconst_0 
	ireturn 
	}


static public final boolean isDigit( char ); // address: 0
	{
	enter_narrow 
	iload_0 
	invokestatic byte getType( char ) // RECharacter
	istore_1 
	iload_1 
	bipush 9
	if_icmpne Label9
	iconst_1 
	ireturn 
Label9:
	iconst_0 
	ireturn 
	}


static public final boolean isLetter( char ); // address: 0
	{
	enter_narrow 
	iload_0 
	invokestatic byte getType( char ) // RECharacter
	istore_1 
	iload_1 
	bipush 2
	if_icmpeq Label16
	iload_1 
	iconst_1 
	if_icmpeq Label16
	iload_1 
	bipush 3
	if_icmpeq Label16
	iload_1 
	bipush 5
	if_icmpne Label18
Label16:
	iconst_1 
	ireturn 
Label18:
	iconst_0 
	ireturn 
	}


static public final boolean isLetterOrDigit( char ); // address: 0
	{
	enter_narrow 
	iload_0 
	invokestatic boolean isDigit( char ) // RECharacter
	ifne Label7
	iload_0 
	invokestatic boolean isLetter( char ) // RECharacter
	ifeq Label9
Label7:
	iconst_1 
	ireturn 
Label9:
	iconst_0 
	ireturn 
	}


static public final boolean isSpaceChar( char ); // address: 0
	{
	enter_narrow 
	iload_0 
	invokestatic byte getType( char ) // RECharacter
	istore_1 
	iload_1 
	bipush 12
	if_icmpeq Label13
	iload_1 
	bipush 13
	if_icmpeq Label13
	iload_1 
	bipush 14
	if_icmpne Label15
Label13:
	iconst_1 
	ireturn 
Label15:
	iconst_0 
	ireturn 
	}


static public final boolean isJavaIdentifierStart( char ); // address: 0
	{
	enter_narrow 
	iload_0 
	invokestatic byte getType( char ) // RECharacter
	istore_1 
	iload_0 
	invokestatic boolean isLetter( char ) // RECharacter
	ifne Label16
	iload_1 
	bipush 10
	if_icmpeq Label16
	iload_0 
	bipush 36
	if_icmpeq Label16
	iload_0 
	bipush 95
	if_icmpne Label18
Label16:
	iconst_1 
	ireturn 
Label18:
	iconst_0 
	ireturn 
	}


static public final boolean isJavaIdentifierPart( char ); // address: 0
	{
	enter_narrow 
	iload_0 
	invokestatic boolean isJavaIdentifierStart( char ) // RECharacter
	ifne Label7
	iload_0 
	invokestatic_lib boolean isDigit( char ) // Character
	ifeq Label9
Label7:
	iconst_1 
	ireturn 
Label9:
	iconst_0 
	ireturn 
	}


static public final byte getType( char ); // address: 0
	{
	enter_narrow 
	iload_0 
	getstatic CHAR_CLASSES // RECharacter
	arraylength 
	if_icmpge Label9
	getstatic CHAR_CLASSES // RECharacter
	iload_0 
	baload 
	ireturn 
Label9:
	iconst_0 
	ireturn 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	synch_static RECharacter
	clinit_wait 
	arrayinit [15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 12, 23, 23, 23, 25, 23, 23, 23, 20, 21, 23, 24, 23, 19, 23, 23, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 23, 23, 24, 24, 24, 23, 23, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 20, 23, 21, 26, 22, 26, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 20, 24, 21, 24, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 12, 23, 25, 25, 25, 25, 27, 27, 26, 27, 2, 28, 24, 16, 27, 26, 27, 24, 11, 11, 26, 2, 27, 23, 26, 11, 2, 29, 11, 11, 11, 23, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 24, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 24, 2, 2, 2, 2, 2, 2, 2, 2]
	putstatic CHAR_CLASSES // RECharacter
	clinit_return 
	}

}
