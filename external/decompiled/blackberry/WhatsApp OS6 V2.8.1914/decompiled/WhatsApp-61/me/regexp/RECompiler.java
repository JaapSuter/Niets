// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-61.cod
// Module version  : 2.8.1914
// Class ID        : 2
// ########################################################


package me.regexp;


abstract public final class RECompiler extends Object

{
	// @@@@@@@@@@@@@ Static fields 
	final static java.util.Hashtable /*java.util.Hashtable*/  hashPOSIX ; // ofs = 52852 addr = 7)

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

public <init>( me.regexp.RECompiler ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	sipush 128
	newarray 3
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	iconst_0 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	return 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	synch_static RECompiler
	clinit_wait 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putstatic hashPOSIX // RECompiler
	getstatic hashPOSIX // RECompiler
	ldc literal_119:"alnum"
	new_lib Character//java.lang.Character java.lang.Character java.lang.Character
	dup 
	bipush 119
	invokespecial_lib java.lang.Character.<init> // pc=2
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	getstatic hashPOSIX // RECompiler
	ldc literal_120:"alpha"
	new_lib Character//java.lang.Character java.lang.Character java.lang.Character
	dup 
	bipush 97
	invokespecial_lib java.lang.Character.<init> // pc=2
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	getstatic hashPOSIX // RECompiler
	ldc literal_121:"blank"
	new_lib Character//java.lang.Character java.lang.Character java.lang.Character
	dup 
	bipush 98
	invokespecial_lib java.lang.Character.<init> // pc=2
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	getstatic hashPOSIX // RECompiler
	ldc literal_122:"cntrl"
	new_lib Character//java.lang.Character java.lang.Character java.lang.Character
	dup 
	bipush 99
	invokespecial_lib java.lang.Character.<init> // pc=2
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	getstatic hashPOSIX // RECompiler
	ldc literal_123:"digit"
	new_lib Character//java.lang.Character java.lang.Character java.lang.Character
	dup 
	bipush 100
	invokespecial_lib java.lang.Character.<init> // pc=2
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	getstatic hashPOSIX // RECompiler
	ldc literal_124:"graph"
	new_lib Character//java.lang.Character java.lang.Character java.lang.Character
	dup 
	bipush 103
	invokespecial_lib java.lang.Character.<init> // pc=2
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	getstatic hashPOSIX // RECompiler
	ldc literal_125:"lower"
	new_lib Character//java.lang.Character java.lang.Character java.lang.Character
	dup 
	bipush 108
	invokespecial_lib java.lang.Character.<init> // pc=2
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	getstatic hashPOSIX // RECompiler
	ldc literal_126:"print"
	new_lib Character//java.lang.Character java.lang.Character java.lang.Character
	dup 
	bipush 112
	invokespecial_lib java.lang.Character.<init> // pc=2
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	getstatic hashPOSIX // RECompiler
	ldc literal_127:"punct"
	new_lib Character//java.lang.Character java.lang.Character java.lang.Character
	dup 
	bipush 33
	invokespecial_lib java.lang.Character.<init> // pc=2
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	getstatic hashPOSIX // RECompiler
	ldc literal_128:"space"
	new_lib Character//java.lang.Character java.lang.Character java.lang.Character
	dup 
	bipush 115
	invokespecial_lib java.lang.Character.<init> // pc=2
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	getstatic hashPOSIX // RECompiler
	ldc literal_129:"upper"
	new_lib Character//java.lang.Character java.lang.Character java.lang.Character
	dup 
	bipush 117
	invokespecial_lib java.lang.Character.<init> // pc=2
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	getstatic hashPOSIX // RECompiler
	ldc literal_130:"xdigit"
	new_lib Character//java.lang.Character java.lang.Character java.lang.Character
	dup 
	bipush 120
	invokespecial_lib java.lang.Character.<init> // pc=2
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	getstatic hashPOSIX // RECompiler
	ldc literal_131:"javastart"
	new_lib Character//java.lang.Character java.lang.Character java.lang.Character
	dup 
	bipush 106
	invokespecial_lib java.lang.Character.<init> // pc=2
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	getstatic hashPOSIX // RECompiler
	ldc literal_132:"javapart"
	new_lib Character//java.lang.Character java.lang.Character java.lang.Character
	dup 
	bipush 107
	invokespecial_lib java.lang.Character.<init> // pc=2
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

final ensure( me.regexp.RECompiler, int ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	arraylength 
	istore_2 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_1 
	iadd 
	iload_2 
	if_icmplt Label31
Label9:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_1 
	iadd 
	iload_2 
	if_icmplt Label19
	iload_2 
	bipush 2
	imul 
	istore_2 
	goto Label9
Label19:
	iload_2 
	newarray 3
	astore_3 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iconst_0 
	aload_3 
	iconst_0 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokestatic_lib arraycopy( java.lang.Object, int, java.lang.Object, int, int ) // System
	aload_0 
	aload_3 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
Label31:
	return 
	}


final emit( me.regexp.RECompiler, char ); // address: 0
	{
	enter 
	aload_0 
	iconst_1 
	invokenonvirtual me.regexp.RECompiler.ensure // pc=2
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_1 
	castore 
	return 
	}


final nodeInsert( me.regexp.RECompiler, char, int, int ); // address: 0
	{
	enter 
	aload_0 
	bipush 3
	invokenonvirtual me.regexp.RECompiler.ensure // pc=2
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_3 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_3 
	bipush 3
	iadd 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_3 
	isub 
	invokestatic_lib arraycopy( java.lang.Object, int, java.lang.Object, int, int ) // System
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_3 
	iload_1 
	castore 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_3 
	iconst_1 
	iadd 
	iload_2 
	i2c 
	castore 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_3 
	bipush 2
	iadd 
	iconst_0 
	castore 
	aload_0 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	bipush 3
	iadd 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	return 
	}


final setNextOfEnd( me.regexp.RECompiler, int, int ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_1 
	bipush 2
	iadd 
	caload 
	istore_3 
Label7:
	iload_3 
	ifeq Label28
	iload_1 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	if_icmpge Label28
	iload_1 
	iload_2 
	if_icmpne Label17
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	istore_2 
Label17:
	iload_1 
	iload_3 
	iadd 
	istore_1 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_1 
	bipush 2
	iadd 
	caload 
	istore_3 
	goto Label7
Label28:
	iload_1 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	if_icmpge Label52
	iload_2 
	iload_1 
	isub 
	istore_4 
	iload_4 
	iload_4 
	i2s 
	if_icmpeq Label44
	new RESyntaxException
	dup 
	ldc literal_92:"Exceeded short jump range."
	invokespecial me.regexp.RESyntaxException.<init> // pc=2
	athrow 
Label44:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_1 
	bipush 2
	iadd 
	iload_4 
	i2s 
	i2c 
	castore 
Label52:
	return 
	}


final int node( me.regexp.RECompiler, char, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	bipush 3
	invokenonvirtual me.regexp.RECompiler.ensure // pc=2
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_1 
	castore 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iconst_1 
	iadd 
	iload_2 
	i2c 
	castore 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	bipush 2
	iadd 
	iconst_0 
	castore 
	aload_0 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	bipush 3
	iadd 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	bipush 3
	isub 
	ireturn 
	}


final internalError( me.regexp.RECompiler ); // address: 0
	{
	enter_narrow 
	new_lib Error//java.lang.Error java.lang.Error java.lang.Error
	dup 
	ldc literal_93:"Internal error!"
	invokespecial_lib java.lang.Error.<init> // pc=2
	athrow 
	}


final syntaxError( me.regexp.RECompiler, java.lang.String ); // address: 0
	{
	enter_narrow 
	new RESyntaxException
	dup 
	aload_1 
	invokespecial me.regexp.RESyntaxException.<init> // pc=2
	athrow 
	}


final bracket( me.regexp.RECompiler ); // address: 0
	{
	enter 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	if_icmpge Label14
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	stringaload 
	bipush 123
	if_icmpeq Label16
Label14:
	aload_0 
	invokenonvirtual me.regexp.RECompiler.internalError // pc=1
Label16:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	if_icmpge Label24
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	stringaload 
	invokestatic_lib boolean isDigit( char ) // Character
	ifne Label27
Label24:
	aload_0 
	ldc literal_94:"Expected digit"
	invokenonvirtual me.regexp.RECompiler.syntaxError // pc=2
Label27:
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	astore_1 
Label31:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	if_icmpge Label51
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	stringaload 
	invokestatic_lib boolean isDigit( char ) // Character
	ifeq Label51
	aload_1 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	stringaload 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	goto Label31
Label51:
	aload_0 
	aload_1 
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib int parseInt( java.lang.String ) // Integer
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	goto Label61
	astore_2 
	aload_0 
	ldc literal_95:"Expected valid number"
	invokenonvirtual me.regexp.RECompiler.syntaxError // pc=2
Label61:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	if_icmplt Label67
	aload_0 
	ldc literal_96:"Expected comma or right bracket"
	invokenonvirtual me.regexp.RECompiler.syntaxError // pc=2
Label67:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	stringaload 
	bipush 125
	if_icmpne Label81
	aload_0 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iconst_1 
	iadd 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	iconst_0 
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	return 
Label81:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	if_icmpge Label94
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	stringaload 
	bipush 44
	if_icmpeq Label97
Label94:
	aload_0 
	ldc literal_97:"Expected comma"
	invokenonvirtual me.regexp.RECompiler.syntaxError // pc=2
Label97:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	if_icmplt Label103
	aload_0 
	ldc literal_96:"Expected comma or right bracket"
	invokenonvirtual me.regexp.RECompiler.syntaxError // pc=2
Label103:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	stringaload 
	bipush 125
	if_icmpne Label117
	aload_0 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iconst_1 
	iadd 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	bipush -1
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	return 
Label117:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	if_icmpge Label125
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	stringaload 
	invokestatic_lib boolean isDigit( char ) // Character
	ifne Label128
Label125:
	aload_0 
	ldc literal_94:"Expected digit"
	invokenonvirtual me.regexp.RECompiler.syntaxError // pc=2
Label128:
	aload_1 
	iconst_0 
	invokevirtual setLength( java.lang.StringBuffer, int ) // pc=2
Label131:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	if_icmpge Label151
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	stringaload 
	invokestatic_lib boolean isDigit( char ) // Character
	ifeq Label151
	aload_1 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	stringaload 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	goto Label131
Label151:
	aload_0 
	aload_1 
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib int parseInt( java.lang.String ) // Integer
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	isub 
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	goto Label163
	astore_2 
	aload_0 
	ldc literal_95:"Expected valid number"
	invokenonvirtual me.regexp.RECompiler.syntaxError // pc=2
Label163:
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	ifge Label168
	aload_0 
	ldc literal_98:"Bad range"
	invokenonvirtual me.regexp.RECompiler.syntaxError // pc=2
Label168:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	if_icmpge Label181
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	stringaload 
	bipush 125
	if_icmpeq Label184
Label181:
	aload_0 
	ldc literal_99:"Missing close brace"
	invokenonvirtual me.regexp.RECompiler.syntaxError // pc=2
Label184:
	return 
	}


final int escape( me.regexp.RECompiler ); // address: 0
	{
	enter 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	stringaload 
	bipush 92
	if_icmpeq Label8
	aload_0 
	invokenonvirtual me.regexp.RECompiler.internalError // pc=1
Label8:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iconst_1 
	iadd 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	if_icmpne Label16
	aload_0 
	ldc literal_100:"Escape terminates string"
	invokenonvirtual me.regexp.RECompiler.syntaxError // pc=2
Label16:
	aload_0 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	bipush 2
	iadd 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iconst_1 
	isub 
	stringaload 
	istore_1 
	iload_1 
Label29:
	iipush 1048574
	ireturn 
Label31:
	iipush 1048573
	ireturn 
Label33:
	iload_1 
	bipush 117
	if_icmpne Label38
	bipush 4
	goto Label39
Label38:
	bipush 2
Label39:
	istore_2 
	iconst_0 
	istore_3 
Label42:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	if_icmpge Label106
	iload_2 
	iinc 2 -1
	ifle Label106
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	stringaload 
	istore_4 
	iload_4 
	bipush 48
	if_icmplt Label67
	iload_4 
	bipush 57
	if_icmpgt Label67
	iload_3 
	bipush 4
	ishl 
	iload_4 
	iadd 
	bipush 48
	isub 
	istore_3 
	goto Label100
Label67:
	iload_4 
	invokestatic_lib char toLowerCase( char ) // Character
	istore_4 
	iload_4 
	bipush 97
	if_icmplt Label87
	iload_4 
	bipush 102
	if_icmpgt Label87
	iload_3 
	bipush 4
	ishl 
	iload_4 
	bipush 97
	isub 
	iadd 
	bipush 10
	iadd 
	istore_3 
	goto Label100
Label87:
	aload_0 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_101:"Expected "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_102:" hexadecimal digits after \"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	iload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokenonvirtual me.regexp.RECompiler.syntaxError // pc=2
Label100:
	aload_0 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iconst_1 
	iadd 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	goto Label42
Label106:
	iload_3 
	ireturn 
Label108:
	bipush 9
	ireturn 
Label110:
	bipush 10
	ireturn 
Label112:
	bipush 13
	ireturn 
Label114:
	bipush 12
	ireturn 
Label116:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	if_icmpge Label124
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	stringaload 
	invokestatic_lib boolean isDigit( char ) // Character
	ifne Label127
Label124:
	iload_1 
	bipush 48
	if_icmpne Label179
Label127:
	iload_1 
	bipush 48
	isub 
	istore_2 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	if_icmpge Label177
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	stringaload 
	invokestatic_lib boolean isDigit( char ) // Character
	ifeq Label177
	iload_2 
	bipush 3
	ishl 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	stringaload 
	bipush 48
	isub 
	iadd 
	istore_2 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	if_icmpge Label177
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	stringaload 
	invokestatic_lib boolean isDigit( char ) // Character
	ifeq Label177
	iload_2 
	bipush 3
	ishl 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	stringaload 
	bipush 48
	isub 
	iadd 
	istore_2 
Label177:
	iload_2 
	ireturn 
Label179:
	iipush 1048575
	ireturn 
Label181:
	iload_1 
	ireturn 
	}


final int characterClass( me.regexp.RECompiler ); // address: 0
	{
	enter 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	stringaload 
	bipush 91
	if_icmpeq Label8
	aload_0 
	invokenonvirtual me.regexp.RECompiler.internalError // pc=1
Label8:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iconst_1 
	iadd 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	if_icmpge Label23
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iconst_1 
	iadd 
	dup_x1 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	stringaload 
	bipush 93
	if_icmpne Label26
Label23:
	aload_0 
	ldc literal_103:"Empty or unterminated class"
	invokenonvirtual me.regexp.RECompiler.syntaxError // pc=2
Label26:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	if_icmplt Label30
	goto_w Label116
Label30:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	stringaload 
	bipush 58
	if_icmpeq Label36
	goto_w Label116
Label36:
	aload_0 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iconst_1 
	iadd 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	istore_1 
Label43:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	if_icmpge Label62
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	stringaload 
	bipush 97
	if_icmplt Label62
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	stringaload 
	bipush 122
	if_icmpgt Label62
	aload_0 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iconst_1 
	iadd 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	goto Label43
Label62:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iconst_1 
	iadd 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	if_icmpge Label113
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	stringaload 
	bipush 58
	if_icmpne Label113
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iconst_1 
	iadd 
	stringaload 
	bipush 93
	if_icmpne Label113
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload_1 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokenonvirtual_lib java.lang.String.substring // pc=3
	astore_2 
	getstatic hashPOSIX // RECompiler
	aload_2 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib Character//java.lang.Character java.lang.Character java.lang.Character
	astore_3 
	aload_3 
	ifnull Label102
	aload_0 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	bipush 2
	iadd 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	bipush 80
	aload_3 
	invokevirtual char charValue( java.lang.Character ) // pc=1
	invokenonvirtual me.regexp.RECompiler.node // pc=3
	ireturn 
Label102:
	aload_0 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_104:"Invalid POSIX character class '"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_86:"'"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokenonvirtual me.regexp.RECompiler.syntaxError // pc=2
Label113:
	aload_0 
	ldc literal_105:"Invalid POSIX character class syntax"
	invokenonvirtual me.regexp.RECompiler.syntaxError // pc=2
Label116:
	aload_0 
	bipush 91
	iconst_0 
	invokenonvirtual me.regexp.RECompiler.node // pc=3
	istore_1 
	iipush 65535
	istore_2 
	iload_2 
	istore_3 
	iconst_1 
	istore_5 
	iconst_0 
	istore_6 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	istore_7 
	iconst_0 
	istore 8
	new_lib me.regexp.RECompiler$RERange//module:WhatsApp-60.class#0 module:WhatsApp-60.class#0 module:WhatsApp-60.class#0
	dup 
	aload_0 
	invokespecial_lib .routine_513 // pc=2
	astore 10
Label138:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	if_icmplt Label142
	goto_w Label376
Label142:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	stringaload 
	bipush 93
	if_icmpne Label148
	goto_w Label376
Label148:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	stringaload 
Label152:
	iload_5 
	ifne Label156
	iconst_1 
	goto Label157
Label156:
	iconst_0 
Label157:
	istore_5 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_7 
	if_icmpne Label166
	aload 10
	iconst_0 
	iipush 65535
	iconst_1 
	invokenonvirtual_lib .routine_460 // pc=4
Label166:
	aload_0 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iconst_1 
	iadd 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	goto Label138
Label172:
	aload_0 
	invokenonvirtual me.regexp.RECompiler.escape // pc=1
	dup 
	istore 11
	tableswitch  :
		
		
		
		

Label177:
	aload_0 
	ldc literal_106:"Bad character class"
	invokenonvirtual me.regexp.RECompiler.syntaxError // pc=2
Label180:
	iload_6 
	ifeq Label185
	aload_0 
	ldc literal_106:"Bad character class"
	invokenonvirtual me.regexp.RECompiler.syntaxError // pc=2
Label185:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iconst_1 
	isub 
	stringaload 
Label191:
	aload 10
	iconst_0 
	bipush 7
	iload_5 
	invokenonvirtual_lib .routine_460 // pc=4
	aload 10
	bipush 11
	iload_5 
	invokenonvirtual_lib .routine_494 // pc=3
	aload 10
	bipush 14
	bipush 31
	iload_5 
	invokenonvirtual_lib .routine_460 // pc=4
	aload 10
	bipush 33
	iipush 65535
	iload_5 
	invokenonvirtual_lib .routine_460 // pc=4
	goto_w Label291
Label211:
	aload 10
	iconst_0 
	bipush 47
	iload_5 
	invokenonvirtual_lib .routine_460 // pc=4
	aload 10
	bipush 58
	bipush 64
	iload_5 
	invokenonvirtual_lib .routine_460 // pc=4
	aload 10
	bipush 91
	bipush 94
	iload_5 
	invokenonvirtual_lib .routine_460 // pc=4
	aload 10
	bipush 96
	iload_5 
	invokenonvirtual_lib .routine_494 // pc=3
	aload 10
	bipush 123
	iipush 65535
	iload_5 
	invokenonvirtual_lib .routine_460 // pc=4
	goto_w Label291
Label236:
	aload 10
	iconst_0 
	bipush 47
	iload_5 
	invokenonvirtual_lib .routine_460 // pc=4
	aload 10
	bipush 58
	iipush 65535
	iload_5 
	invokenonvirtual_lib .routine_460 // pc=4
	goto Label291
Label247:
	aload 10
	bipush 9
	iload_5 
	invokenonvirtual_lib .routine_494 // pc=3
	aload 10
	bipush 13
	iload_5 
	invokenonvirtual_lib .routine_494 // pc=3
	aload 10
	bipush 12
	iload_5 
	invokenonvirtual_lib .routine_494 // pc=3
	aload 10
	bipush 10
	iload_5 
	invokenonvirtual_lib .routine_494 // pc=3
	aload 10
	bipush 8
	iload_5 
	invokenonvirtual_lib .routine_494 // pc=3
	aload 10
	bipush 32
	iload_5 
	invokenonvirtual_lib .routine_494 // pc=3
	goto Label291
Label272:
	aload 10
	bipush 97
	bipush 122
	iload_5 
	invokenonvirtual_lib .routine_460 // pc=4
	aload 10
	bipush 65
	bipush 90
	iload_5 
	invokenonvirtual_lib .routine_460 // pc=4
	aload 10
	bipush 95
	iload_5 
	invokenonvirtual_lib .routine_494 // pc=3
Label286:
	aload 10
	bipush 48
	bipush 57
	iload_5 
	invokenonvirtual_lib .routine_460 // pc=4
Label291:
	iload_2 
	istore_3 
	goto_w Label138
Label294:
	iload 11
	i2c 
	istore_4 
	goto Label341
Label298:
	iload_6 
	ifeq Label303
	aload_0 
	ldc literal_107:"Bad class range"
	invokenonvirtual me.regexp.RECompiler.syntaxError // pc=2
Label303:
	iconst_1 
	istore_6 
	iload_3 
	iload_2 
	if_icmpne Label310
	iconst_0 
	goto Label311
Label310:
	iload_3 
Label311:
	istore 8
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iconst_1 
	iadd 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	if_icmplt Label318
	goto_w Label138
Label318:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iconst_1 
	iadd 
	dup_x1 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	stringaload 
	bipush 93
	if_icmpeq Label329
	goto_w Label138
Label329:
	iipush 65535
	istore_4 
	goto Label341
Label332:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	stringaload 
	istore_4 
Label341:
	iload_6 
	ifeq Label361
	iload_4 
	istore 9
	iload 8
	iload 9
	if_icmplt Label351
	aload_0 
	ldc literal_106:"Bad character class"
	invokenonvirtual me.regexp.RECompiler.syntaxError // pc=2
Label351:
	aload 10
	iload 8
	iload 9
	iload_5 
	invokenonvirtual_lib .routine_460 // pc=4
	iload_2 
	istore_3 
	iconst_0 
	istore_6 
	goto_w Label138
Label361:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	if_icmpge Label369
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	stringaload 
	bipush 45
	if_icmpeq Label373
Label369:
	aload 10
	iload_4 
	iload_5 
	invokenonvirtual_lib .routine_494 // pc=3
Label373:
	iload_4 
	istore_3 
	goto_w Label138
Label376:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	if_icmpne Label382
	aload_0 
	ldc literal_108:"Unterminated character class"
	invokenonvirtual me.regexp.RECompiler.syntaxError // pc=2
Label382:
	aload_0 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iconst_1 
	iadd 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_1 
	iconst_1 
	iadd 
	aload 10
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	i2c 
	castore 
	iconst_0 
	istore 11
Label397:
	iload 11
	aload 10
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	if_icmpge Label417
	aload_0 
	aload 10
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload 11
	iaload 
	i2c 
	invokenonvirtual me.regexp.RECompiler.emit // pc=2
	aload_0 
	aload 10
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload 11
	iaload 
	i2c 
	invokenonvirtual me.regexp.RECompiler.emit // pc=2
	iinc 11 1
	goto Label397
Label417:
	iload_1 
	ireturn 
	}


final int atom( me.regexp.RECompiler ); // address: 0
	{
	enter 
	aload_0 
	bipush 65
	iconst_0 
	invokenonvirtual me.regexp.RECompiler.node // pc=3
	istore_1 
	iconst_0 
	istore_2 
Label8:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	if_icmplt Label12
	goto_w Label90
Label12:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iconst_1 
	iadd 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	if_icmpge Label48
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iconst_1 
	iadd 
	stringaload 
	istore_3 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	stringaload 
	bipush 92
	if_icmpne Label43
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	istore_4 
	aload_0 
	invokenonvirtual me.regexp.RECompiler.escape // pc=1
	pop 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	if_icmpge Label40
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	stringaload 
	istore_3 
Label40:
	aload_0 
	iload_4 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
Label43:
	iload_3 
Label45:
	iload_2 
	ifeq Label48
	goto_w Label90
Label48:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	stringaload 
Label52:
	iload_2 
	ifne Label90
	aload_0 
	ldc literal_109:"Missing operand to closure"
	invokenonvirtual me.regexp.RECompiler.syntaxError // pc=2
	goto Label90
Label58:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	istore_3 
	aload_0 
	invokenonvirtual me.regexp.RECompiler.escape // pc=1
	istore_4 
	iload_4 
	iipush 1048560
	iand 
	iipush 1048560
	if_icmpne Label72
	aload_0 
	iload_3 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	goto Label90
Label72:
	aload_0 
	iload_4 
	i2c 
	invokenonvirtual me.regexp.RECompiler.emit // pc=2
	iinc 2 1
	goto_w Label8
Label78:
	aload_0 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	stringaload 
	invokenonvirtual me.regexp.RECompiler.emit // pc=2
	iinc 2 1
	goto_w Label8
Label90:
	iload_2 
	ifne Label94
	aload_0 
	invokenonvirtual me.regexp.RECompiler.internalError // pc=1
Label94:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_1 
	iconst_1 
	iadd 
	iload_2 
	i2c 
	castore 
	iload_1 
	ireturn 
	}


final int terminal( me.regexp.RECompiler, int[] ); // address: 0
	{
	enter 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	stringaload 
Label5:
	aload_0 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	stringaload 
	iconst_0 
	invokenonvirtual me.regexp.RECompiler.node // pc=3
	ireturn 
Label17:
	aload_0 
	invokenonvirtual me.regexp.RECompiler.characterClass // pc=1
	ireturn 
Label20:
	aload_0 
	aload_1 
	invokenonvirtual me.regexp.RECompiler.expr // pc=2
	ireturn 
Label24:
	aload_0 
	ldc literal_110:"Unexpected close paren"
	invokenonvirtual me.regexp.RECompiler.syntaxError // pc=2
Label27:
	aload_0 
	invokenonvirtual me.regexp.RECompiler.internalError // pc=1
Label29:
	aload_0 
	ldc literal_111:"Mismatched class"
	invokenonvirtual me.regexp.RECompiler.syntaxError // pc=2
Label32:
	aload_0 
	ldc literal_112:"Unexpected end of input"
	invokenonvirtual me.regexp.RECompiler.syntaxError // pc=2
Label35:
	aload_0 
	ldc literal_109:"Missing operand to closure"
	invokenonvirtual me.regexp.RECompiler.syntaxError // pc=2
Label38:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	istore_2 
	aload_0 
	invokenonvirtual me.regexp.RECompiler.escape // pc=1
	tableswitch  :
		
		
		
		

Label43:
	aload_1 
	iconst_0 
	dup2 
	iaload 
	bipush -2
	iand 
	iastore 
	aload_0 
	bipush 92
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iconst_1 
	isub 
	stringaload 
	invokenonvirtual me.regexp.RECompiler.node // pc=3
	ireturn 
Label59:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iconst_1 
	isub 
	stringaload 
	bipush 48
	isub 
	i2c 
	istore_3 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iload_3 
	if_icmpgt Label74
	aload_0 
	ldc literal_113:"Bad backreference"
	invokenonvirtual me.regexp.RECompiler.syntaxError // pc=2
Label74:
	aload_1 
	iconst_0 
	dup2 
	iaload 
	iconst_1 
	ior 
	iastore 
	aload_0 
	bipush 35
	iload_3 
	invokenonvirtual me.regexp.RECompiler.node // pc=3
	ireturn 
Label86:
	aload_0 
	iload_2 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_1 
	iconst_0 
	dup2 
	iaload 
	bipush -2
	iand 
	iastore 
Label96:
	aload_1 
	iconst_0 
	dup2 
	iaload 
	bipush -2
	iand 
	iastore 
	aload_0 
	invokenonvirtual me.regexp.RECompiler.atom // pc=1
	ireturn 
	}


final int closure( me.regexp.RECompiler, int[] ); // address: 0
	{
	enter 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	istore_2 
	arrayinit [0, 0, 0, 0]
	astore_3 
	aload_0 
	aload_3 
	invokenonvirtual me.regexp.RECompiler.terminal // pc=2
	istore_4 
	aload_1 
	iconst_0 
	dup2 
	iaload 
	aload_3 
	iconst_0 
	iaload 
	ior 
	iastore 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	if_icmplt Label23
	iload_4 
	ireturn 
Label23:
	iconst_1 
	istore_5 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	stringaload 
	istore_6 
	iload_6 
Label31:
	aload_1 
	iconst_0 
	dup2 
	iaload 
	iconst_1 
	ior 
	iastore 
Label38:
	aload_0 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iconst_1 
	iadd 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
Label43:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_4 
	caload 
	istore_7 
	iload_7 
	bipush 94
	if_icmpeq Label53
	iload_7 
	bipush 36
	if_icmpne Label56
Label53:
	aload_0 
	ldc literal_114:"Bad closure operand"
	invokenonvirtual me.regexp.RECompiler.syntaxError // pc=2
Label56:
	aload_3 
	iconst_0 
	iaload 
	iconst_1 
	iand 
	ifeq Label65
	aload_0 
	ldc literal_115:"Closure operand can't be nullable"
	invokenonvirtual me.regexp.RECompiler.syntaxError // pc=2
Label65:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	if_icmpge Label80
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	stringaload 
	bipush 63
	if_icmpne Label80
	aload_0 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iconst_1 
	iadd 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iconst_0 
	istore_5 
Label80:
	iload_5 
	ifne Label83
	goto_w Label268
Label83:
	iload_6 
Label85:
	aload_0 
	invokenonvirtual me.regexp.RECompiler.bracket // pc=1
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	istore_7 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	istore 8
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	istore 9
	iload_4 
	istore 10
	iconst_0 
	istore 11
Label97:
	iload 11
	iload 8
	if_icmpge Label113
	aload_0 
	iload_2 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	iload 10
	aload_0 
	aload_3 
	invokenonvirtual me.regexp.RECompiler.terminal // pc=2
	dup 
	istore 10
	invokenonvirtual me.regexp.RECompiler.setNextOfEnd // pc=3
	iinc 11 1
	goto Label97
Label113:
	iload 9
	bipush -1
	if_icmpne Label131
	aload_0 
	iload_7 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	bipush 42
	iconst_0 
	iload 10
	invokenonvirtual me.regexp.RECompiler.nodeInsert // pc=4
	aload_0 
	iload 10
	bipush 3
	iadd 
	iload 10
	invokenonvirtual me.regexp.RECompiler.setNextOfEnd // pc=3
	goto_w Label323
Label131:
	iload 9
	ifle Label202
	iload 9
	iconst_1 
	iadd 
	newarray 5
	astore 11
	aload_0 
	bipush 63
	iconst_0 
	iload 10
	invokenonvirtual me.regexp.RECompiler.nodeInsert // pc=4
	aload 11
	iconst_0 
	iload 10
	iastore 
	iconst_1 
	istore 12
Label149:
	iload 12
	iload 9
	if_icmpge Label168
	aload 11
	iload 12
	aload_0 
	bipush 63
	iconst_0 
	invokenonvirtual me.regexp.RECompiler.node // pc=3
	iastore 
	aload_0 
	iload_2 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	aload_3 
	invokenonvirtual me.regexp.RECompiler.terminal // pc=2
	pop 
	iinc 12 1
	goto Label149
Label168:
	aload 11
	iload 9
	aload_0 
	bipush 78
	iconst_0 
	invokenonvirtual me.regexp.RECompiler.node // pc=3
	dup_x2 
	iastore 
	istore 12
	iconst_0 
	istore 13
Label179:
	iload 13
	iload 9
	if_icmpge Label210
	aload_0 
	aload 11
	iload 13
	iaload 
	iload 12
	invokenonvirtual me.regexp.RECompiler.setNextOfEnd // pc=3
	aload_0 
	aload 11
	iload 13
	iaload 
	bipush 3
	iadd 
	aload 11
	iload 13
	iconst_1 
	iadd 
	iaload 
	invokenonvirtual me.regexp.RECompiler.setNextOfEnd // pc=3
	iinc 13 1
	goto Label179
Label202:
	aload_0 
	iload 10
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	bipush 78
	iconst_0 
	invokenonvirtual me.regexp.RECompiler.node // pc=3
	pop 
Label210:
	aload_0 
	iload_7 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	goto_w Label323
Label214:
	aload_0 
	bipush 63
	iconst_0 
	iload_4 
	invokenonvirtual me.regexp.RECompiler.nodeInsert // pc=4
	aload_0 
	bipush 78
	iconst_0 
	invokenonvirtual me.regexp.RECompiler.node // pc=3
	istore_7 
	aload_0 
	iload_4 
	iload_7 
	invokenonvirtual me.regexp.RECompiler.setNextOfEnd // pc=3
	aload_0 
	iload_4 
	bipush 3
	iadd 
	iload_7 
	invokenonvirtual me.regexp.RECompiler.setNextOfEnd // pc=3
	goto_w Label323
Label235:
	aload_0 
	bipush 42
	iconst_0 
	iload_4 
	invokenonvirtual me.regexp.RECompiler.nodeInsert // pc=4
	aload_0 
	iload_4 
	bipush 3
	iadd 
	iload_4 
	invokenonvirtual me.regexp.RECompiler.setNextOfEnd // pc=3
	goto_w Label323
Label247:
	aload_0 
	bipush 67
	iconst_0 
	iload_4 
	invokenonvirtual me.regexp.RECompiler.nodeInsert // pc=4
	aload_0 
	bipush 43
	iconst_0 
	invokenonvirtual me.regexp.RECompiler.node // pc=3
	istore_7 
	aload_0 
	iload_4 
	bipush 3
	iadd 
	iload_7 
	invokenonvirtual me.regexp.RECompiler.setNextOfEnd // pc=3
	aload_0 
	iload_7 
	iload_4 
	invokenonvirtual me.regexp.RECompiler.setNextOfEnd // pc=3
	goto Label323
Label268:
	iload_6 
Label270:
	aload_0 
	bipush 47
	iconst_0 
	iload_4 
	invokenonvirtual me.regexp.RECompiler.nodeInsert // pc=4
	aload_0 
	bipush 78
	iconst_0 
	invokenonvirtual me.regexp.RECompiler.node // pc=3
	istore_7 
	aload_0 
	iload_4 
	iload_7 
	invokenonvirtual me.regexp.RECompiler.setNextOfEnd // pc=3
	aload_0 
	iload_4 
	bipush 3
	iadd 
	iload_7 
	invokenonvirtual me.regexp.RECompiler.setNextOfEnd // pc=3
	goto Label323
Label291:
	aload_0 
	bipush 56
	iconst_0 
	iload_4 
	invokenonvirtual me.regexp.RECompiler.nodeInsert // pc=4
	aload_0 
	iload_4 
	bipush 3
	iadd 
	iload_4 
	invokenonvirtual me.regexp.RECompiler.setNextOfEnd // pc=3
	goto Label323
Label303:
	aload_0 
	bipush 67
	iconst_0 
	iload_4 
	invokenonvirtual me.regexp.RECompiler.nodeInsert // pc=4
	aload_0 
	bipush 61
	iconst_0 
	invokenonvirtual me.regexp.RECompiler.node // pc=3
	istore_7 
	aload_0 
	iload_7 
	iload_4 
	invokenonvirtual me.regexp.RECompiler.setNextOfEnd // pc=3
	aload_0 
	iload_4 
	bipush 3
	iadd 
	iload_7 
	invokenonvirtual me.regexp.RECompiler.setNextOfEnd // pc=3
Label323:
	iload_4 
	ireturn 
	}


final int branch( me.regexp.RECompiler, int[] ); // address: 0
	{
	enter 
	bipush -1
	istore_3 
	bipush -1
	istore_4 
	iconst_1 
	newarray 5
	astore_5 
	iconst_1 
	istore_6 
Label10:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	if_icmpge Label52
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	stringaload 
	bipush 124
	if_icmpeq Label52
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	stringaload 
	bipush 41
	if_icmpeq Label52
	aload_5 
	iconst_0 
	iconst_0 
	iastore 
	aload_0 
	aload_5 
	invokenonvirtual me.regexp.RECompiler.closure // pc=2
	istore_2 
	aload_5 
	iconst_0 
	iaload 
	ifne Label37
	iconst_0 
	istore_6 
Label37:
	iload_4 
	bipush -1
	if_icmpeq Label44
	aload_0 
	iload_4 
	iload_2 
	invokenonvirtual me.regexp.RECompiler.setNextOfEnd // pc=3
Label44:
	iload_2 
	istore_4 
	iload_3 
	bipush -1
	if_icmpne Label10
	iload_2 
	istore_3 
	goto Label10
Label52:
	iload_3 
	bipush -1
	if_icmpne Label60
	aload_0 
	bipush 78
	iconst_0 
	invokenonvirtual me.regexp.RECompiler.node // pc=3
	istore_3 
Label60:
	iload_6 
	ifeq Label69
	aload_1 
	iconst_0 
	dup2 
	iaload 
	iconst_1 
	ior 
	iastore 
Label69:
	iload_3 
	ireturn 
	}


final int expr( me.regexp.RECompiler, int[] ); // address: 0
	{
	enter 
	bipush -1
	istore_2 
	bipush -1
	istore_3 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	istore_4 
	aload_1 
	iconst_0 
	iaload 
	bipush 2
	iand 
	ifne Label67
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	stringaload 
	bipush 40
	if_icmpne Label67
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	bipush 2
	iadd 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	if_icmpge Label50
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iconst_1 
	iadd 
	stringaload 
	bipush 63
	if_icmpne Label50
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	bipush 2
	iadd 
	stringaload 
	bipush 58
	if_icmpne Label50
	bipush 2
	istore_2 
	aload_0 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	bipush 3
	iadd 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	bipush 60
	iconst_0 
	invokenonvirtual me.regexp.RECompiler.node // pc=3
	istore_3 
	goto Label67
Label50:
	iconst_1 
	istore_2 
	aload_0 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iconst_1 
	iadd 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	bipush 40
	aload_0 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	dup_x1 
	iconst_1 
	iadd 
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokenonvirtual me.regexp.RECompiler.node // pc=3
	istore_3 
Label67:
	aload_1 
	iconst_0 
	dup2 
	iaload 
	bipush -3
	iand 
	iastore 
	iconst_0 
	istore_5 
	aload_0 
	aload_1 
	invokenonvirtual me.regexp.RECompiler.branch // pc=2
	istore_6 
	iload_3 
	bipush -1
	if_icmpne Label86
	iload_6 
	istore_3 
	goto Label90
Label86:
	aload_0 
	iload_3 
	iload_6 
	invokenonvirtual me.regexp.RECompiler.setNextOfEnd // pc=3
Label90:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	if_icmpge Label126
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	stringaload 
	bipush 124
	if_icmpne Label126
	iload_5 
	ifne Label107
	aload_0 
	bipush 124
	iconst_0 
	iload_6 
	invokenonvirtual me.regexp.RECompiler.nodeInsert // pc=4
	iconst_1 
	istore_5 
Label107:
	aload_0 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iconst_1 
	iadd 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	iload_6 
	aload_0 
	bipush 124
	iconst_0 
	invokenonvirtual me.regexp.RECompiler.node // pc=3
	dup 
	istore_6 
	invokenonvirtual me.regexp.RECompiler.setNextOfEnd // pc=3
	aload_0 
	aload_1 
	invokenonvirtual me.regexp.RECompiler.branch // pc=2
	pop 
	goto Label90
Label126:
	iload_2 
	ifle Label160
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	if_icmpge Label142
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	stringaload 
	bipush 41
	if_icmpne Label142
	aload_0 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iconst_1 
	iadd 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	goto Label145
Label142:
	aload_0 
	ldc literal_116:"Missing close paren"
	invokenonvirtual me.regexp.RECompiler.syntaxError // pc=2
Label145:
	iload_2 
	iconst_1 
	if_icmpne Label154
	aload_0 
	bipush 41
	iload_4 
	invokenonvirtual me.regexp.RECompiler.node // pc=3
	istore_7 
	goto Label165
Label154:
	aload_0 
	bipush 62
	iconst_0 
	invokenonvirtual me.regexp.RECompiler.node // pc=3
	istore_7 
	goto Label165
Label160:
	aload_0 
	bipush 69
	iconst_0 
	invokenonvirtual me.regexp.RECompiler.node // pc=3
	istore_7 
Label165:
	aload_0 
	iload_3 
	iload_7 
	invokenonvirtual me.regexp.RECompiler.setNextOfEnd // pc=3
	iload_3 
	istore 8
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload 8
	bipush 2
	iadd 
	caload 
	istore 9
Label177:
	iload 9
	ifeq Label204
	iload 8
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	if_icmpge Label204
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload 8
	caload 
	bipush 124
	if_icmpne Label193
	aload_0 
	iload 8
	bipush 3
	iadd 
	iload_7 
	invokenonvirtual me.regexp.RECompiler.setNextOfEnd // pc=3
Label193:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload 8
	bipush 2
	iadd 
	caload 
	istore 9
	iload 8
	iload 9
	iadd 
	istore 8
	goto Label177
Label204:
	iload_3 
	ireturn 
	}


public final module:WhatsApp-60.class#1 compile( me.regexp.RECompiler, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aload_1 
	stringlength 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	iconst_0 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	iconst_0 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	iconst_1 
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	arrayinit [2, 0, 0, 0]
	astore_2 
	aload_0 
	aload_2 
	invokenonvirtual me.regexp.RECompiler.expr // pc=2
	pop 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	if_icmpeq Label37
	aload_1 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	stringaload 
	bipush 41
	if_icmpne Label34
	aload_0 
	ldc literal_117:"Unmatched close paren"
	invokenonvirtual me.regexp.RECompiler.syntaxError // pc=2
Label34:
	aload_0 
	ldc literal_118:"Unexpected input remains"
	invokenonvirtual me.regexp.RECompiler.syntaxError // pc=2
Label37:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	newarray 3
	astore_3 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iconst_0 
	aload_3 
	iconst_0 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokestatic_lib arraycopy( java.lang.Object, int, java.lang.Object, int, int ) // System
	new_lib me.regexp.REProgram//module:WhatsApp-60.class#1 module:WhatsApp-60.class#1 module:WhatsApp-60.class#1
	dup 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_3 
	invokespecial_lib .routine_768 // pc=3
	areturn 
	}

}
