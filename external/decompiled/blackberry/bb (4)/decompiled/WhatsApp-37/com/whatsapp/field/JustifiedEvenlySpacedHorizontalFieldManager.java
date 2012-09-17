// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-37.cod
// Module version  : 2.7.3204
// Class ID        : 8
// ########################################################


package com.whatsapp.field;


public class JustifiedEvenlySpacedHorizontalFieldManager extends net.rim.device.api.ui.Manager

{

	// @@@@@@@@@@@@@ Fields 
	private int /*int*/  field_53214 ; // ofs = 53214 addr = 0)
	private int /*int*/  field_53218 ; // ofs = 53218 addr = 0)
	private int /*int*/  field_53222 ; // ofs = 53222 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_0 
	i2l 
	invokespecial com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.<init> // pc=3
	return 
	}


private <init>( com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager, long ); // address: 0
	{
	enter_narrow 
	aload_0 
	lload 1
	invokespecial_lib net.rim.device.api.ui.Manager.<init> // pc=3
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public int getTotalPreferredWidthAndMargin( com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager ); // address: 0
	{
	enter 
	iconst_0 
	istore_1 
	iconst_0 
	istore_2 
	aload_0 
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	istore_3 
	iconst_0 
	istore_4 
Label10:
	iload_4 
	iload_3 
	if_icmpge Label34
	aload_0 
	iload_4 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	astore_5 
	iload_2 
	iload_1 
	aload_5 
	invokevirtual int getMarginLeft( net.rim.device.api.ui.Field ) // pc=1
	invokestatic_lib int max( int, int ) // Math
	iadd 
	istore_2 
	iload_2 
	aload_5 
	invokevirtual int getPreferredWidth( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	istore_2 
	aload_5 
	invokevirtual int getMarginRight( net.rim.device.api.ui.Field ) // pc=1
	istore_1 
	iinc 4 1
	goto Label10
Label34:
	iload_2 
	iload_1 
	iadd 
	istore_2 
	iload_2 
	ireturn 
	}


public int getPreferredHeight( com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager ); // address: 0
	{
	enter 
	iconst_0 
	istore_1 
	aload_0 
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	istore_2 
	iconst_0 
	istore_3 
Label8:
	iload_3 
	iload_2 
	if_icmpge Label24
	aload_0 
	iload_3 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	astore_4 
	aload_4 
	invokevirtual int getPreferredHeight( net.rim.device.api.ui.Field ) // pc=1
	istore_5 
	iload_1 
	iload_5 
	invokestatic_lib int max( int, int ) // Math
	istore_1 
	iinc 3 1
	goto Label8
Label24:
	iload_1 
	aload_0 
	invokevirtual int getPaddingTop( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	aload_0 
	invokevirtual int getPaddingBottom( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	ireturn 
	}


protected sublayout( com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager, int, int ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	istore_3 
	iconst_0 
	istore_4 
	aload_0 
	iload_1 
	iload_3 
	idiv 
	putfield com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53214   // get_name_1:  com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53214   // get_name_2:  com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53214   // get_Name:    com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53214   // getName->1:     // getName->2:     // getName->N:     // ofs = 53214 ord = 0 addr = 0
	aload_0 
	iconst_0 
	putfield com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53218   // get_name_1:  com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53218   // get_name_2:  com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53218   // get_Name:    com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53218   // getName->1:     // getName->2:     // getName->N:     // ofs = 53218 ord = 1 addr = 0
	aload_0 
	iconst_0 
	putfield com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53222   // get_name_1:  com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53222   // get_name_2:  com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53222   // get_Name:    com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53222   // getName->1:     // getName->2:     // getName->N:     // ofs = 53222 ord = 2 addr = 0
	iload_1 
	aload_0_getfield com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53214   // get_name_1:  com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53214   // get_name_2:  com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53214   // get_Name:    com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53214   // getName->1:     // getName->2:     // getName->N:     // ofs = 53214 ord = 0 addr = 0
	iload_3 
	imul 
	isub 
	istore_5 
	iload_5 
	ifle Label35
	aload_0 
	iload_5 
	bipush 2
	idiv 
	putfield com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53218   // get_name_1:  com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53218   // get_name_2:  com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53218   // get_Name:    com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53218   // getName->1:     // getName->2:     // getName->N:     // ofs = 53218 ord = 1 addr = 0
	aload_0 
	iload_5 
	aload_0_getfield com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53218   // get_name_1:  com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53218   // get_name_2:  com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53218   // get_Name:    com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53218   // getName->1:     // getName->2:     // getName->N:     // ofs = 53218 ord = 1 addr = 0
	isub 
	putfield com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53222   // get_name_1:  com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53222   // get_name_2:  com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53222   // get_Name:    com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53222   // getName->1:     // getName->2:     // getName->N:     // ofs = 53222 ord = 2 addr = 0
Label35:
	iconst_0 
	istore_6 
Label37:
	iload_6 
	iload_3 
	if_icmpge Label96
	aload_0 
	iload_6 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	astore_7 
	aload_7 
	invokevirtual int getMarginLeft( net.rim.device.api.ui.Field ) // pc=1
	istore 8
	aload_7 
	invokevirtual int getMarginRight( net.rim.device.api.ui.Field ) // pc=1
	istore 9
	aload_7 
	invokevirtual int getMarginTop( net.rim.device.api.ui.Field ) // pc=1
	aload_7 
	invokevirtual int getMarginBottom( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	istore 10
	iload 8
	iload 9
	iadd 
	istore 11
	aload_0_getfield com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53214   // get_name_1:  com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53214   // get_name_2:  com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53214   // get_Name:    com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53214   // getName->1:     // getName->2:     // getName->N:     // ofs = 53214 ord = 0 addr = 0
	istore 12
	iload_6 
	ifne Label69
	aload_0_getfield com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53214   // get_name_1:  com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53214   // get_name_2:  com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53214   // get_Name:    com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53214   // getName->1:     // getName->2:     // getName->N:     // ofs = 53214 ord = 0 addr = 0
	aload_0_getfield com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53218   // get_name_1:  com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53218   // get_name_2:  com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53218   // get_Name:    com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53218   // getName->1:     // getName->2:     // getName->N:     // ofs = 53218 ord = 1 addr = 0
	iadd 
	istore 12
	goto Label78
Label69:
	iload_6 
	iload_3 
	iconst_1 
	isub 
	if_icmpne Label78
	aload_0_getfield com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53214   // get_name_1:  com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53214   // get_name_2:  com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53214   // get_Name:    com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53214   // getName->1:     // getName->2:     // getName->N:     // ofs = 53214 ord = 0 addr = 0
	aload_0_getfield com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53222   // get_name_1:  com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53222   // get_name_2:  com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53222   // get_Name:    com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53222   // getName->1:     // getName->2:     // getName->N:     // ofs = 53222 ord = 2 addr = 0
	iadd 
	istore 12
Label78:
	aload_0 
	aload_7 
	iload 12
	iload 11
	isub 
	iload_2 
	iload 10
	isub 
	invokevirtual layoutChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
	iload_4 
	aload_7 
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	iload 10
	iadd 
	invokestatic_lib int max( int, int ) // Math
	istore_4 
	iinc 6 1
	goto Label37
Label96:
	iconst_0 
	istore_7 
Label98:
	iload_7 
	iload_3 
	if_icmplt Label102
	goto_w Label167
Label102:
	aload_0_getfield com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53218   // get_name_1:  com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53218   // get_name_2:  com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53218   // get_Name:    com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53218   // getName->1:     // getName->2:     // getName->N:     // ofs = 53218 ord = 1 addr = 0
	iload_7 
	aload_0_getfield com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53214   // get_name_1:  com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53214   // get_name_2:  com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53214   // get_Name:    com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53214   // getName->1:     // getName->2:     // getName->N:     // ofs = 53214 ord = 0 addr = 0
	imul 
	iadd 
	istore 8
	aload_0 
	iload_7 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	astore 9
	aload 9
	invokevirtual int getMarginTop( net.rim.device.api.ui.Field ) // pc=1
	istore 10
	aload 9
	invokevirtual int getMarginBottom( net.rim.device.api.ui.Field ) // pc=1
	istore 11
	aload 9
	invokevirtual long getStyle( net.rim.device.api.ui.Field ) // pc=1
	lipush 51539607552
	land 
	bipush 32
	lshr 
	l2i 
Label126:
	iload_4 
	aload 9
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	isub 
	aload 9
	invokevirtual int getMarginBottom( net.rim.device.api.ui.Field ) // pc=1
	isub 
	istore_6 
	goto Label151
Label135:
	iload 10
	iload_4 
	iload 10
	isub 
	aload 9
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	isub 
	iload 11
	isub 
	iadd 
	iconst_1 
	ishr 
	istore_6 
	goto Label151
Label149:
	iload 10
	istore_6 
Label151:
	iload 8
	aload_0_getfield com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53214   // get_name_1:  com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53214   // get_name_2:  com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53214   // get_Name:    com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager.field_53214   // getName->1:     // getName->2:     // getName->N:     // ofs = 53214 ord = 0 addr = 0
	aload 9
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	isub 
	bipush 2
	idiv 
	iadd 
	istore 12
	aload_0 
	aload 9
	iload 12
	iload_6 
	invokevirtual setPositionChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
	iinc 7 1
	goto_w Label98
Label167:
	aload_0 
	iload_1 
	iload_4 
	invokevirtual setExtent( net.rim.device.api.ui.ScrollView, int, int ) // pc=3
	return 
	}

}
