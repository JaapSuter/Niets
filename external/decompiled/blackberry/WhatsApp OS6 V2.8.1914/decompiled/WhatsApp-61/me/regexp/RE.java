// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-61.cod
// Module version  : 2.8.1914
// Class ID        : 0
// ########################################################


package me.regexp;


abstract public final class RE extends Object

{

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

public <init>( me.regexp.RE, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	iconst_0 
	invokespecial me.regexp.RE.<init> // pc=3
	return 
	}


public <init>( me.regexp.RE, java.lang.String, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	new RECompiler
	dup 
	invokespecial me.regexp.RECompiler.<init> // pc=1
	aload_1 
	invokenonvirtual me.regexp.RECompiler.compile // pc=2
	iload_2 
	invokespecial me.regexp.RE.<init> // pc=3
	return 
	}


public <init>( me.regexp.RE, module:WhatsApp-60.class#1, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	bipush 16
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	aload_1 
	invokenonvirtual me.regexp.RE.setProgram // pc=2
	aload_0 
	iload_2 
	invokenonvirtual me.regexp.RE.setMatchFlags // pc=2
	return 
	}


public <init>( me.regexp.RE ); // address: 0
	{
	enter_narrow 
	aload_0 
	aconst_null 
	checkcast_lib me.regexp.//module:WhatsApp-60.class#1 module:WhatsApp-60.class#1 module:WhatsApp-60.class#1
	iconst_0 
	invokespecial me.regexp.RE.<init> // pc=3
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

public final setMatchFlags( me.regexp.RE, int ); // address: 0
	{
	putfield_return .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	}


public final setProgram( me.regexp.RE, module:WhatsApp-60.class#1 ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	ifnull Label15
	aload_1 
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	bipush -1
	if_icmpeq Label15
	aload_0 
	aload_1 
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	return 
Label15:
	aload_0 
	bipush 16
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	return 
	}


public final java.lang.String getParen( me.regexp.RE, int ); // address: 0
	{
	enter 
	iload_1 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	if_icmpge Label17
	aload_0 
	iload_1 
	invokenonvirtual me.regexp.RE.getParenStart // pc=2
	dup 
	istore_2 
	iflt Label17
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_2 
	aload_0 
	iload_1 
	invokenonvirtual me.regexp.RE.getParenEnd // pc=2
	invokenonvirtual_lib java.lang.String.substring // pc=3
	areturn 
Label17:
	aconst_null 
	areturn 
	}


public final int getParenStart( me.regexp.RE, int ); // address: 0
	{
	enter_narrow 
	iload_1 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	if_icmpge Label20
	iload_1 
	tableswitch  :
		
		
		
		

Label6:
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	ireturn 
Label8:
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	ireturn 
Label10:
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	ireturn 
Label12:
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	ifnonnull Label16
	aload_0 
	invokespecial me.regexp.RE.routine_420 // pc=1
Label16:
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	iload_1 
	iaload 
	ireturn 
Label20:
	bipush -1
	ireturn 
	}


public final int getParenEnd( me.regexp.RE, int ); // address: 0
	{
	enter_narrow 
	iload_1 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	if_icmpge Label20
	iload_1 
	tableswitch  :
		
		
		
		

Label6:
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ireturn 
Label8:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ireturn 
Label10:
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	ireturn 
Label12:
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	ifnonnull Label16
	aload_0 
	invokespecial me.regexp.RE.routine_420 // pc=1
Label16:
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	iload_1 
	iaload 
	ireturn 
Label20:
	bipush -1
	ireturn 
	}


public final int getParenLength( me.regexp.RE, int ); // address: 0
	{
	enter_narrow 
	iload_1 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	if_icmpge Label12
	aload_0 
	iload_1 
	invokenonvirtual me.regexp.RE.getParenEnd // pc=2
	aload_0 
	iload_1 
	invokenonvirtual me.regexp.RE.getParenStart // pc=2
	isub 
	ireturn 
Label12:
	bipush -1
	ireturn 
	}


protected final setParenStart( me.regexp.RE, int, int ); // address: 0
	{
	enter_narrow 
	iload_1 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	if_icmpge Label26
	iload_1 
	tableswitch  :
		
		
		
		

Label6:
	aload_0 
	iload_2 
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	return 
Label10:
	aload_0 
	iload_2 
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	return 
Label14:
	aload_0 
	iload_2 
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	return 
Label18:
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	ifnonnull Label22
	aload_0 
	invokespecial me.regexp.RE.routine_420 // pc=1
Label22:
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	iload_1 
	iload_2 
	iastore 
Label26:
	return 
	}


protected final setParenEnd( me.regexp.RE, int, int ); // address: 0
	{
	enter_narrow 
	iload_1 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	if_icmpge Label26
	iload_1 
	tableswitch  :
		
		
		
		

Label6:
	aload_0 
	iload_2 
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	return 
Label10:
	aload_0 
	iload_2 
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	return 
Label14:
	aload_0 
	iload_2 
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	return 
Label18:
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	ifnonnull Label22
	aload_0 
	invokespecial me.regexp.RE.routine_420 // pc=1
Label22:
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	iload_1 
	iload_2 
	iastore 
Label26:
	return 
	}


protected final internalError( me.regexp.RE, java.lang.String ); // address: 0
	{
	enter 
	new_lib Error//java.lang.Error java.lang.Error java.lang.Error
	dup 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_84:"RE internal error: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib java.lang.Error.<init> // pc=2
	athrow 
	}


private final me.regexp.RE.routine_420( me.regexp.RE ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	newarray 5
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_0 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	newarray 5
	putfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	iconst_0 
	istore_1 
Label11:
	iload_1 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	if_icmpge Label24
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	iload_1 
	bipush -1
	iastore 
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	iload_1 
	bipush -1
	iastore 
	iinc 1 1
	goto Label11
Label24:
	return 
	}


protected final int matchNodes( me.regexp.RE, int, int, int ); // address: 0
	{
	enter 
	iload_3 
	istore_4 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	astore 9
	iload_1 
	istore 10
Label8:
	iload 10
	iload_2 
	if_icmplt Label12
	goto_w Label753
Label12:
	aload 9
	iload 10
	caload 
	istore_6 
	iload 10
	aload 9
	iload 10
	bipush 2
	iadd 
	caload 
	i2s 
	iadd 
	istore_5 
	aload 9
	iload 10
	iconst_1 
	iadd 
	caload 
	istore_7 
	iload_6 
Label33:
	aload_0 
	iload 10
	bipush 3
	iadd 
	iipush 65536
	iload_4 
	invokenonvirtual me.regexp.RE.matchNodes // pc=4
	dup 
	istore 8
	bipush -1
	if_icmpne Label45
	goto_w Label750
Label45:
	iload 8
	ireturn 
Label47:
	aload_0 
	iload_5 
	iipush 65536
	iload_4 
	invokenonvirtual me.regexp.RE.matchNodes // pc=4
	dup 
	istore 8
	bipush -1
	if_icmpeq Label58
	iload 8
	ireturn 
Label58:
	iload_5 
	aload 9
	iload_5 
	bipush 2
	iadd 
	caload 
	i2s 
	iadd 
	istore 10
	goto_w Label8
Label68:
	aload_0 
	iload_5 
	iipush 65536
	iload_4 
	invokenonvirtual me.regexp.RE.matchNodes // pc=4
	dup 
	istore 8
	bipush -1
	if_icmpeq Label79
	iload 8
	ireturn 
Label79:
	aload_0 
	iload 10
	bipush 3
	iadd 
	iload_5 
	iload_4 
	invokenonvirtual me.regexp.RE.matchNodes // pc=4
	ireturn 
Label87:
	aload_0 
	iload_5 
	aload 9
	iload_5 
	bipush 2
	iadd 
	caload 
	i2s 
	iadd 
	iipush 65536
	iload_4 
	invokenonvirtual me.regexp.RE.matchNodes // pc=4
	dup 
	istore 8
	bipush -1
	if_icmpne Label104
	goto_w Label750
Label104:
	iload 8
	ireturn 
Label106:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iconst_1 
	iand 
	ifeq Label115
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	iload_7 
	iload_4 
	iastore 
Label115:
	aload_0 
	iload_5 
	iipush 65536
	iload_4 
	invokenonvirtual me.regexp.RE.matchNodes // pc=4
	dup 
	istore 8
	bipush -1
	if_icmpeq Label141
	iload_7 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	if_icmplt Label132
	aload_0 
	iload_7 
	iconst_1 
	iadd 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
Label132:
	aload_0 
	iload_7 
	invokenonvirtual me.regexp.RE.getParenStart // pc=2
	bipush -1
	if_icmpne Label141
	aload_0 
	iload_7 
	iload_4 
	invokenonvirtual me.regexp.RE.setParenStart // pc=3
Label141:
	iload 8
	ireturn 
Label143:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iconst_1 
	iand 
	ifeq Label152
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	iload_7 
	iload_4 
	iastore 
Label152:
	aload_0 
	iload_5 
	iipush 65536
	iload_4 
	invokenonvirtual me.regexp.RE.matchNodes // pc=4
	dup 
	istore 8
	bipush -1
	if_icmpeq Label178
	iload_7 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	if_icmplt Label169
	aload_0 
	iload_7 
	iconst_1 
	iadd 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
Label169:
	aload_0 
	iload_7 
	invokenonvirtual me.regexp.RE.getParenEnd // pc=2
	bipush -1
	if_icmpne Label178
	aload_0 
	iload_7 
	iload_4 
	invokenonvirtual me.regexp.RE.setParenEnd // pc=3
Label178:
	iload 8
	ireturn 
Label180:
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	iload_7 
	iaload 
	istore 11
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	iload_7 
	iaload 
	istore 12
	iload 11
	bipush -1
	if_icmpeq Label194
	iload 12
	bipush -1
	if_icmpne Label196
Label194:
	bipush -1
	ireturn 
Label196:
	iload 11
	iload 12
	if_icmpne Label200
	goto_w Label750
Label200:
	iload 12
	iload 11
	isub 
	istore 13
	iload_4 
	iload 13
	iadd 
	iconst_1 
	isub 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	stringlength 
	if_icmplt Label214
	bipush -1
	ireturn 
Label214:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iconst_1 
	iand 
	ifeq Label220
	iconst_1 
	goto Label221
Label220:
	iconst_0 
Label221:
	istore 14
	iconst_0 
	istore 15
Label224:
	iload 15
	iload 13
	if_icmplt Label228
	goto_w Label750
Label228:
	aload_0 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_4 
	iinc 4 1
	stringaload 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload 11
	iload 15
	iadd 
	stringaload 
	iload 14
	invokespecial me.regexp.RE.routine_2830 // pc=4
	ifeq Label243
	bipush -1
	ireturn 
Label243:
	iinc 15 1
	goto Label224
Label245:
	iload_4 
	ifne Label248
	goto_w Label750
Label248:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 2
	iand 
	bipush 2
	if_icmpne Label260
	aload_0 
	iload_4 
	iconst_1 
	isub 
	invokespecial me.regexp.RE.routine_2778 // pc=2
	ifeq Label260
	goto_w Label750
Label260:
	bipush -1
	ireturn 
Label262:
	iconst_0 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	stringlength 
	if_icmplt Label267
	goto_w Label750
Label267:
	iload_4 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	stringlength 
	if_icmplt Label272
	goto_w Label750
Label272:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 2
	iand 
	bipush 2
	if_icmpne Label282
	aload_0 
	iload_4 
	invokespecial me.regexp.RE.routine_2778 // pc=2
	ifeq Label282
	goto_w Label750
Label282:
	bipush -1
	ireturn 
Label284:
	iload_7 
Label286:
	iload_4 
	ifne Label290
	bipush 10
	goto Label295
Label290:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_4 
	iconst_1 
	isub 
	stringaload 
Label295:
	istore 11
	iload_4 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	stringlength 
	if_icmplt Label302
	bipush 10
	goto Label305
Label302:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_4 
	stringaload 
Label305:
	istore 12
	iload 11
	invokestatic boolean isLetterOrDigit( char ) // RECharacter
	iload 12
	invokestatic boolean isLetterOrDigit( char ) // RECharacter
	if_icmpne Label313
	iconst_1 
	goto Label314
Label313:
	iconst_0 
Label314:
	iload_7 
	bipush 98
	if_icmpne Label319
	iconst_1 
	goto Label320
Label319:
	iconst_0 
Label320:
	if_icmpeq Label322
	goto_w Label750
Label322:
	bipush -1
	ireturn 
Label324:
	iload_4 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	stringlength 
	if_icmplt Label330
	bipush -1
	ireturn 
Label330:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_4 
	stringaload 
	istore 11
	iload_7 
Label336:
	iload 11
	invokestatic boolean isLetterOrDigit( char ) // RECharacter
	ifne Label342
	iload 11
	bipush 95
	if_icmpne Label344
Label342:
	iconst_1 
	goto Label345
Label344:
	iconst_0 
Label345:
	iload_7 
	bipush 119
	if_icmpne Label350
	iconst_1 
	goto Label351
Label350:
	iconst_0 
Label351:
	if_icmpeq Label376
	bipush -1
	ireturn 
Label354:
	iload 11
	invokestatic boolean isDigit( char ) // RECharacter
	iload_7 
	bipush 100
	if_icmpne Label361
	iconst_1 
	goto Label362
Label361:
	iconst_0 
Label362:
	if_icmpeq Label376
	bipush -1
	ireturn 
Label365:
	iload 11
	invokestatic boolean isWhitespace( char ) // RECharacter
	iload_7 
	bipush 115
	if_icmpne Label372
	iconst_1 
	goto Label373
Label372:
	iconst_0 
Label373:
	if_icmpeq Label376
	bipush -1
	ireturn 
Label376:
	iinc 4 1
	goto_w Label750
Label378:
	aload_0 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_85:"Unrecognized escape '"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload_7 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_86:"'"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokenonvirtual me.regexp.RE.internalError // pc=2
	goto_w Label750
Label390:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 4
	iand 
	bipush 4
	if_icmpne Label401
	iload_4 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	stringlength 
	if_icmplt Label411
	bipush -1
	ireturn 
Label401:
	iload_4 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	stringlength 
	if_icmpge Label409
	aload_0 
	iload_4 
	invokespecial me.regexp.RE.routine_2778 // pc=2
	ifeq Label411
Label409:
	bipush -1
	ireturn 
Label411:
	iinc 4 1
	goto_w Label750
Label413:
	iload_4 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	stringlength 
	if_icmplt Label419
	bipush -1
	ireturn 
Label419:
	iload 10
	bipush 3
	iadd 
	istore 11
	iload_7 
	iload_4 
	iadd 
	iconst_1 
	isub 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	stringlength 
	if_icmplt Label433
	bipush -1
	ireturn 
Label433:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iconst_1 
	iand 
	ifeq Label439
	iconst_1 
	goto Label440
Label439:
	iconst_0 
Label440:
	istore 12
	iconst_0 
	istore 13
Label443:
	iload 13
	iload_7 
	if_icmplt Label447
	goto_w Label750
Label447:
	aload_0 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_4 
	iinc 4 1
	stringaload 
	aload 9
	iload 11
	iload 13
	iadd 
	caload 
	iload 12
	invokespecial me.regexp.RE.routine_2830 // pc=4
	ifeq Label462
	bipush -1
	ireturn 
Label462:
	iinc 13 1
	goto Label443
Label464:
	iload_4 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	stringlength 
	if_icmplt Label470
	bipush -1
	ireturn 
Label470:
	iload_7 
Label472:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_4 
	stringaload 
	invokestatic boolean isLetterOrDigit( char ) // RECharacter
	ifeq Label478
	goto_w Label619
Label478:
	bipush -1
	ireturn 
Label480:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_4 
	stringaload 
	invokestatic boolean isLetter( char ) // RECharacter
	ifeq Label486
	goto_w Label619
Label486:
	bipush -1
	ireturn 
Label488:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_4 
	stringaload 
	invokestatic boolean isDigit( char ) // RECharacter
	ifeq Label494
	goto_w Label619
Label494:
	bipush -1
	ireturn 
Label496:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_4 
	stringaload 
	invokestatic boolean isSpaceChar( char ) // RECharacter
	ifeq Label502
	goto_w Label619
Label502:
	bipush -1
	ireturn 
Label504:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_4 
	stringaload 
	invokestatic boolean isWhitespace( char ) // RECharacter
	ifeq Label510
	goto_w Label619
Label510:
	bipush -1
	ireturn 
Label512:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_4 
	stringaload 
	invokestatic byte getType( char ) // RECharacter
	bipush 15
	if_icmpne Label519
	goto_w Label619
Label519:
	bipush -1
	ireturn 
Label521:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_4 
	stringaload 
	invokestatic byte getType( char ) // RECharacter
	tableswitch  :
		
		
		
		
		

Label526:
	bipush -1
	ireturn 
Label528:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_4 
	stringaload 
	invokestatic byte getType( char ) // RECharacter
	bipush 2
	if_icmpne Label535
	goto_w Label619
Label535:
	bipush -1
	ireturn 
Label537:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_4 
	stringaload 
	invokestatic byte getType( char ) // RECharacter
	iconst_1 
	if_icmpne Label544
	goto_w Label619
Label544:
	bipush -1
	ireturn 
Label546:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_4 
	stringaload 
	invokestatic byte getType( char ) // RECharacter
	bipush 15
	if_icmpeq Label553
	goto_w Label619
Label553:
	bipush -1
	ireturn 
Label555:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_4 
	stringaload 
	invokestatic byte getType( char ) // RECharacter
	istore 11
	iload 11
	tableswitch  :
		
		
		
		
		
		

Label562:
	bipush -1
	ireturn 
Label564:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_4 
	stringaload 
	bipush 48
	if_icmplt Label574
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_4 
	stringaload 
	bipush 57
	if_icmple Label594
Label574:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_4 
	stringaload 
	bipush 97
	if_icmplt Label584
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_4 
	stringaload 
	bipush 102
	if_icmple Label594
Label584:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_4 
	stringaload 
	bipush 65
	if_icmplt Label596
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_4 
	stringaload 
	bipush 70
	if_icmpgt Label596
Label594:
	iconst_1 
	goto Label597
Label596:
	iconst_0 
Label597:
	istore 11
	iload 11
	ifne Label619
	bipush -1
	ireturn 
Label602:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_4 
	stringaload 
	invokestatic boolean isJavaIdentifierStart( char ) // RECharacter
	ifne Label619
	bipush -1
	ireturn 
Label609:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_4 
	stringaload 
	invokestatic boolean isJavaIdentifierPart( char ) // RECharacter
	ifne Label619
	bipush -1
	ireturn 
Label616:
	aload_0 
	ldc literal_87:"Bad posix class"
	invokenonvirtual me.regexp.RE.internalError // pc=2
Label619:
	iinc 4 1
	goto_w Label750
Label621:
	iload_4 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	stringlength 
	if_icmplt Label627
	bipush -1
	ireturn 
Label627:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_4 
	stringaload 
	istore 11
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iconst_1 
	iand 
	ifeq Label637
	iconst_1 
	goto Label638
Label637:
	iconst_0 
Label638:
	istore 12
	iload 10
	bipush 3
	iadd 
	istore 13
	iload 13
	iload_7 
	bipush 2
	imul 
	iadd 
	istore 14
	iconst_0 
	istore 15
	iload 13
	istore 16
Label653:
	iload 15
	ifne Label685
	iload 16
	iload 14
	if_icmpge Label685
	aload 9
	iload 16
	iinc 16 1
	caload 
	istore 17
	aload 9
	iload 16
	iinc 16 1
	caload 
	istore 18
	aload_0 
	iload 11
	iload 17
	iload 12
	invokespecial me.regexp.RE.routine_2830 // pc=4
	iflt Label682
	aload_0 
	iload 11
	iload 18
	iload 12
	invokespecial me.regexp.RE.routine_2830 // pc=4
	ifgt Label682
	iconst_1 
	goto Label683
Label682:
	iconst_0 
Label683:
	istore 15
	goto Label653
Label685:
	iload 15
	ifne Label689
	bipush -1
	ireturn 
Label689:
	iinc 4 1
	goto Label750
Label691:
	aload 9
	iload_5 
	caload 
	bipush 124
	if_icmpeq Label698
	iinc 10 3
	goto_w Label8
Label698:
	aload_0 
	iload 10
	bipush 3
	iadd 
	iipush 65536
	iload_4 
	invokenonvirtual me.regexp.RE.matchNodes // pc=4
	dup 
	istore 8
	bipush -1
	if_icmpeq Label711
	iload 8
	ireturn 
Label711:
	aload 9
	iload 10
	bipush 2
	iadd 
	caload 
	i2s 
	istore 11
	iload 10
	iload 11
	iadd 
	istore 10
	iload 11
	ifeq Label729
	aload 9
	iload 10
	caload 
	bipush 124
	if_icmpeq Label698
Label729:
	bipush -1
	ireturn 
Label731:
	iinc 10 3
	goto_w Label8
Label733:
	aload_0 
	iconst_0 
	iload_4 
	invokenonvirtual me.regexp.RE.setParenEnd // pc=3
	iload_4 
	ireturn 
Label739:
	aload_0 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_88:"Invalid opcode '"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload_6 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_86:"'"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokenonvirtual me.regexp.RE.internalError // pc=2
Label750:
	iload_5 
	istore 10
	goto_w Label8
Label753:
	aload_0 
	ldc literal_89:"Corrupt program"
	invokenonvirtual me.regexp.RE.internalError // pc=2
	bipush -1
	ireturn 
	}


protected final boolean matchAt( me.regexp.RE, int ); // address: 0
	{
	enter 
	aload_0 
	bipush -1
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0 
	bipush -1
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0 
	bipush -1
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_0 
	bipush -1
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_0 
	bipush -1
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_0 
	bipush -1
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_0 
	aconst_null 
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_0 
	aconst_null 
	putfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	aload_0 
	iconst_1 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	iconst_0 
	iload_1 
	invokenonvirtual me.regexp.RE.setParenStart // pc=3
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iconst_1 
	iand 
	ifeq Label45
	aload_0 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	newarray 5
	putfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload_0 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	newarray 5
	putfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
Label45:
	aload_0 
	iconst_0 
	iipush 65536
	iload_1 
	invokenonvirtual me.regexp.RE.matchNodes // pc=4
	dup 
	istore_2 
	bipush -1
	if_icmpeq Label60
	aload_0 
	iconst_0 
	iload_2 
	invokenonvirtual me.regexp.RE.setParenEnd // pc=3
	iconst_1 
	ireturn 
Label60:
	aload_0 
	iconst_0 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iconst_0 
	ireturn 
	}


public final boolean match( me.regexp.RE, java.lang.String, int ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnonnull Label6
	aload_0 
	ldc literal_90:"No RE program to run!"
	invokenonvirtual me.regexp.RE.internalError // pc=2
Label6:
	aload_0 
	aload_1 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	bipush 2
	iand 
	bipush 2
	if_icmpne Label59
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 2
	iand 
	ifne Label29
	iload_2 
	ifne Label27
	aload_0 
	iload_2 
	invokenonvirtual me.regexp.RE.matchAt // pc=2
	ifeq Label27
	iconst_1 
	ireturn 
Label27:
	iconst_0 
	ireturn 
Label29:
	iload_2 
	aload_1 
	stringlength 
	if_icmpge Label57
	aload_0 
	iload_2 
	invokespecial me.regexp.RE.routine_2778 // pc=2
	ifeq Label38
	goto Label55
Label38:
	aload_0 
	iload_2 
	invokenonvirtual me.regexp.RE.matchAt // pc=2
	ifeq Label44
	iconst_1 
	ireturn 
Label44:
	iload_2 
	aload_1 
	stringlength 
	if_icmpge Label55
	aload_0 
	iload_2 
	invokespecial me.regexp.RE.routine_2778 // pc=2
	ifeq Label53
	goto Label55
Label53:
	iinc 2 1
	goto Label44
Label55:
	iinc 2 1
	goto Label29
Label57:
	iconst_0 
	ireturn 
Label59:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	ifnonnull Label78
Label62:
	iload_2 
	iconst_1 
	isub 
	aload_1 
	stringlength 
	if_icmpge Label76
	aload_0 
	iload_2 
	invokenonvirtual me.regexp.RE.matchAt // pc=2
	ifeq Label74
	iconst_1 
	ireturn 
Label74:
	iinc 2 1
	goto Label62
Label76:
	iconst_0 
	ireturn 
Label78:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iconst_1 
	iand 
	ifeq Label84
	iconst_1 
	goto Label85
Label84:
	iconst_0 
Label85:
	istore_3 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	astore_4 
Label89:
	iload_2 
	aload_4 
	arraylength 
	iadd 
	iconst_1 
	isub 
	aload_1 
	stringlength 
	if_icmpge Label136
	iload_2 
	istore_5 
	iconst_0 
	istore_6 
Label102:
	aload_0 
	aload_1 
	iload_5 
	iinc 5 1
	stringaload 
	aload_4 
	iload_6 
	iinc 6 1
	caload 
	iload_3 
	invokespecial me.regexp.RE.routine_2830 // pc=4
	ifne Label116
	iconst_1 
	goto Label117
Label116:
	iconst_0 
Label117:
	istore_7 
	iload_7 
	ifeq Label124
	iload_6 
	aload_4 
	arraylength 
	if_icmplt Label102
Label124:
	iload_6 
	aload_4 
	arraylength 
	if_icmpne Label134
	aload_0 
	iload_2 
	invokenonvirtual me.regexp.RE.matchAt // pc=2
	ifeq Label134
	iconst_1 
	ireturn 
Label134:
	iinc 2 1
	goto Label89
Label136:
	iconst_0 
	ireturn 
	}


public final boolean match( me.regexp.RE, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	iconst_0 
	invokenonvirtual me.regexp.RE.match // pc=3
	ireturn 
	}


public final java.lang.String subst( me.regexp.RE, java.lang.String, java.lang.String, int ); // address: 0
	{
	enter 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	astore_4 
	iconst_0 
	istore_5 
	aload_1 
	stringlength 
	istore_6 
Label10:
	iload_5 
	iload_6 
	if_icmplt Label14
	goto_w Label128
Label14:
	aload_0 
	aload_1 
	iload_5 
	invokenonvirtual me.regexp.RE.match // pc=3
	ifne Label20
	goto_w Label128
Label20:
	aload_4 
	aload_1 
	iload_5 
	aload_0 
	iconst_0 
	invokenonvirtual me.regexp.RE.getParenStart // pc=2
	invokenonvirtual_lib java.lang.String.substring // pc=3
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	iload_3 
	bipush 2
	iand 
	ifne Label34
	goto_w Label109
Label34:
	iconst_0 
	istore_7 
	bipush -2
	istore 8
	aload_2 
	stringlength 
	istore 9
Label41:
	aload_2 
	ldc literal_91:"$"
	iload_7 
	invokenonvirtual_lib java.lang.String.indexOf // pc=3
	dup 
	istore_7 
	iflt Label99
	iload_7 
	ifeq Label57
	aload_2 
	iload_7 
	iconst_1 
	isub 
	stringaload 
	bipush 92
	if_icmpeq Label97
Label57:
	iload_7 
	iconst_1 
	iadd 
	iload 9
	if_icmpge Label97
	aload_2 
	iload_7 
	iconst_1 
	iadd 
	stringaload 
	istore 10
	iload 10
	bipush 48
	if_icmplt Label97
	iload 10
	bipush 57
	if_icmpgt Label97
	aload_4 
	aload_2 
	iload 8
	bipush 2
	iadd 
	iload_7 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_0 
	iload 10
	bipush 48
	isub 
	invokenonvirtual me.regexp.RE.getParen // pc=2
	astore 11
	aload 11
	ifnull Label95
	aload_4 
	aload 11
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label95:
	iload_7 
	istore 8
Label97:
	iinc 7 1
	goto Label41
Label99:
	aload_4 
	aload_2 
	iload 8
	bipush 2
	iadd 
	iload 9
	invokenonvirtual_lib java.lang.String.substring // pc=3
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	goto Label113
Label109:
	aload_4 
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label113:
	aload_0 
	iconst_0 
	invokenonvirtual me.regexp.RE.getParenEnd // pc=2
	istore_7 
	iload_7 
	iload_5 
	if_icmpne Label121
	iinc 7 1
Label121:
	iload_7 
	istore_5 
	iload_3 
	iconst_1 
	iand 
	ifne Label128
	goto_w Label10
Label128:
	iload_5 
	iload_6 
	if_icmpge Label137
	aload_4 
	aload_1 
	iload_5 
	invokenonvirtual_lib java.lang.String.substring // pc=2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label137:
	aload_4 
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}


private final boolean me.regexp.RE.routine_2778( me.regexp.RE, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_1 
	stringaload 
	istore_2 
	iload_2 
	bipush 10
	if_icmpeq Label20
	iload_2 
	bipush 13
	if_icmpeq Label20
	iload_2 
	sipush 133
	if_icmpeq Label20
	iload_2 
	sipush 8232
	if_icmpeq Label20
	iload_2 
	sipush 8233
	if_icmpne Label22
Label20:
	iconst_1 
	ireturn 
Label22:
	iconst_0 
	ireturn 
	}


private final int me.regexp.RE.routine_2830( me.regexp.RE, char, char, boolean ); // address: 0
	{
	enter 
	iload_3 
	ifeq Label9
	iload_1 
	invokestatic char toLowerCase( char ) // RECharacter
	istore_1 
	iload_2 
	invokestatic char toLowerCase( char ) // RECharacter
	istore_2 
Label9:
	iload_1 
	iload_2 
	isub 
	ireturn 
	}

}
