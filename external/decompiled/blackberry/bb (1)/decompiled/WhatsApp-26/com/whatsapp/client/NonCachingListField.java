// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-26.cod
// Module version  : 2.7.3204
// Class ID        : 2
// ########################################################


package com.whatsapp.client;


public class NonCachingListField extends net.rim.device.api.ui.component.ListField

{

	// @@@@@@@@@@@@@ Fields 
	private final int[] /*int[]*/  field_55258 ; // ofs = 55258 addr = 0)
	private boolean /*boolean*/  field_55262 ; // ofs = 55262 addr = 0)
	private com.whatsapp.client. /*module:WhatsApp-24.class#32*/  field_55266 ; // ofs = 55266 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.NonCachingListField ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib net.rim.device.api.ui.component.ListField.<init> // pc=1
	aload_0 
	arrayinit [-67, 90, 24, 0, -67, 90, 24, 0, -117, 0, 0, 0, -117, 0, 0, 0]
	putfield com.whatsapp.client.NonCachingListField.field_55258   // get_name_1:  com.whatsapp.client.NonCachingListField.field_55258   // get_name_2:  com.whatsapp.client.NonCachingListField.field_55258   // get_Name:    com.whatsapp.client.NonCachingListField.field_55258   // getName->1:     // getName->2:     // getName->N:     // ofs = 55258 ord = 0 addr = 0
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.NonCachingListField.field_55262   // get_name_1:  com.whatsapp.client.NonCachingListField.field_55262   // get_name_2:  com.whatsapp.client.NonCachingListField.field_55262   // get_Name:    com.whatsapp.client.NonCachingListField.field_55262   // getName->1:     // getName->2:     // getName->N:     // ofs = 55262 ord = 1 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public setNonCachingCallback( com.whatsapp.client.NonCachingListField, module:WhatsApp-24.class#32 ); // address: 0
	{
	putfield_return com.whatsapp.client.NonCachingListField.field_55266   // get_name_1:  com.whatsapp.client.NonCachingListField.field_55266   // get_name_2:  com.whatsapp.client.NonCachingListField.field_55266   // get_Name:    com.whatsapp.client.NonCachingListField.field_55266   // getName->1:     // getName->2:     // getName->N:     // ofs = 55266 ord = 2 addr = 0
	}


public int moveFocus( com.whatsapp.client.NonCachingListField, int, int, int ); // address: 0
	{
	enter 
	aload_0 
	aload_0 
	invokevirtual int getSelectedIndex( net.rim.device.api.ui.component.ListField ) // pc=1
	invokevirtual invalidate( net.rim.device.api.ui.component.ListField, int ) // pc=2
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	invokespecial_lib net.rim.device.api.ui.component.ListField.moveFocus // pc=4
	ireturn 
	}


public onFocus( com.whatsapp.client.NonCachingListField, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_1 
	putfield com.whatsapp.client.NonCachingListField.field_55262   // get_name_1:  com.whatsapp.client.NonCachingListField.field_55262   // get_name_2:  com.whatsapp.client.NonCachingListField.field_55262   // get_Name:    com.whatsapp.client.NonCachingListField.field_55262   // getName->1:     // getName->2:     // getName->N:     // ofs = 55262 ord = 1 addr = 0
	aload_0 
	iload_1 
	invokespecial_lib net.rim.device.api.ui.component.ListField.onFocus // pc=2
	return 
	}


public onUnfocus( com.whatsapp.client.NonCachingListField ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.NonCachingListField.field_55262   // get_name_1:  com.whatsapp.client.NonCachingListField.field_55262   // get_name_2:  com.whatsapp.client.NonCachingListField.field_55262   // get_Name:    com.whatsapp.client.NonCachingListField.field_55262   // getName->1:     // getName->2:     // getName->N:     // ofs = 55262 ord = 1 addr = 0
	aload_0 
	invokespecial_lib net.rim.device.api.ui.Field.onUnfocus // pc=1
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.component.ListField ) // pc=1
	return 
	}


public paint( com.whatsapp.client.NonCachingListField, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual boolean isEmpty( net.rim.device.api.ui.component.ListField ) // pc=1
	ifeq Label8
	aload_0 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.component.ListField.paint // pc=2
	return 
Label8:
	aload_1 
	invokevirtual net.rim.device.api.ui.XYRect getClippingRect( net.rim.device.api.ui.Graphics ) // pc=1
	astore_2 
	aload_2 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 0 addr = -1
	ifge Label19
	new_lib javax.microedition.io.Connection//javax.microedition.io.Connection javax.microedition.io.Connection javax.microedition.io.Connection
	dup 
	ldc literal_50:"Clipping rectangle is wrong."
	invokespecial_lib java.lang.IllegalStateException.<init> // pc=2
	athrow 
Label19:
	aload_0 
	invokevirtual int getRowHeight( net.rim.device.api.ui.component.ListField ) // pc=1
	istore_4 
	aload_0_getfield com.whatsapp.client.NonCachingListField.field_55262   // get_name_1:  com.whatsapp.client.NonCachingListField.field_55262   // get_name_2:  com.whatsapp.client.NonCachingListField.field_55262   // get_Name:    com.whatsapp.client.NonCachingListField.field_55262   // getName->1:     // getName->2:     // getName->N:     // ofs = 55262 ord = 1 addr = 0
	ifeq Label28
	aload_0 
	invokevirtual int getSelectedIndex( net.rim.device.api.ui.component.ListField ) // pc=1
	istore_3 
	goto Label30
Label28:
	bipush -1
	istore_3 
Label30:
	aload_2 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 0 addr = -1
	iload_4 
	idiv 
	istore_5 
	aload_2 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 0 addr = -1
	aload_2 
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 1 addr = -1
	iadd 
	iconst_1 
	isub 
	iload_4 
	idiv 
	istore_6 
	iload_6 
	aload_0 
	invokevirtual int getSize( net.rim.device.api.ui.component.ListField ) // pc=1
	iconst_1 
	isub 
	invokestatic_lib int min( int, int ) // Math
	istore_6 
	iload_5 
	iload_4 
	imul 
	istore_7 
	bipush 4
	newarray 5
	dup 
	iconst_0 
	iload_7 
	iastore 
	dup 
	iconst_1 
	iload_7 
	iastore 
	dup 
	bipush 2
	iload_7 
	iload_4 
	iadd 
	iastore 
	dup 
	bipush 3
	iload_7 
	iload_4 
	iadd 
	iastore 
	astore 8
	bipush 4
	newarray 5
	dup 
	iconst_0 
	iconst_0 
	iastore 
	dup 
	iconst_1 
	aload_0 
	invokevirtual int getPreferredWidth( net.rim.device.api.ui.component.ListField ) // pc=1
	iastore 
	dup 
	bipush 2
	aload_0 
	invokevirtual int getPreferredWidth( net.rim.device.api.ui.component.ListField ) // pc=1
	iastore 
	dup 
	bipush 3
	iconst_0 
	iastore 
	astore 9
Label100:
	iload_5 
	iload_6 
	if_icmple Label104
	goto_w Label177
Label104:
	iload_5 
	iload_3 
	if_icmpne Label127
	aload_1 
	iipush 16777215
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	aload 9
	aload 8
	aconst_null 
	aload_0_getfield com.whatsapp.client.NonCachingListField.field_55258   // get_name_1:  com.whatsapp.client.NonCachingListField.field_55258   // get_name_2:  com.whatsapp.client.NonCachingListField.field_55258   // get_Name:    com.whatsapp.client.NonCachingListField.field_55258   // getName->1:     // getName->2:     // getName->N:     // ofs = 55258 ord = 0 addr = 0
	aconst_null 
	invokevirtual drawShadedFilledPath( net.rim.device.api.ui.Graphics, int[], int[], byte[], int[], int[] ) // pc=6
	aload_0_getfield com.whatsapp.client.NonCachingListField.field_55266   // get_name_1:  com.whatsapp.client.NonCachingListField.field_55266   // get_name_2:  com.whatsapp.client.NonCachingListField.field_55266   // get_Name:    com.whatsapp.client.NonCachingListField.field_55266   // getName->1:     // getName->2:     // getName->N:     // ofs = 55266 ord = 2 addr = 0
	aload_0 
	aload_1 
	iload_5 
	iload_7 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	iconst_1 
	invokeinterface interfacemethodref_2 // pc=7 guess=0
	goto Label149
Label127:
	aload_1 
	iipush 16777215
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	iconst_0 
	iload_7 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	iload_4 
	invokevirtual fillRect( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	aload_1 
	iconst_0 
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_0_getfield com.whatsapp.client.NonCachingListField.field_55266   // get_name_1:  com.whatsapp.client.NonCachingListField.field_55266   // get_name_2:  com.whatsapp.client.NonCachingListField.field_55266   // get_Name:    com.whatsapp.client.NonCachingListField.field_55266   // getName->1:     // getName->2:     // getName->N:     // ofs = 55266 ord = 2 addr = 0
	aload_0 
	aload_1 
	iload_5 
	iload_7 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	iconst_0 
	invokeinterface interfacemethodref_2 // pc=7 guess=0
Label149:
	iload_7 
	iload_4 
	iadd 
	istore_7 
	aload 8
	iconst_0 
	iload_7 
	iastore 
	aload 8
	iconst_1 
	aload 8
	iconst_0 
	iaload 
	iastore 
	aload 8
	bipush 2
	iload_7 
	iload_4 
	iadd 
	iastore 
	aload 8
	bipush 3
	aload 8
	bipush 2
	iaload 
	iastore 
	iinc 5 1
	goto_w Label100
Label177:
	return 
	}

}
