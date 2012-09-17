// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-19.cod
// Module version  : 2.8.1914
// Class ID        : 1
// ########################################################


package com.whatsapp.client;


abstract public final class ContactPickerField extends com.whatsapp.client.NonCachingListField
implements net.rim.device.api.ui.component.ListFieldCallback, com.whatsapp.client.

{
	// @@@@@@@@@@@@@ Static fields 
	private final static net.rim.device.api.system.Bitmap /*net.rim.device.api.system.Bitmap*/  field_60276 ; // ofs = 60276 addr = 155)
	private final static net.rim.device.api.system.Bitmap /*net.rim.device.api.system.Bitmap*/  field_60282 ; // ofs = 60282 addr = 156)
	private static com.whatsapp.client. /*module:WhatsApp.class#21*/  field_60288 ; // ofs = 60288 addr = 157)

	// @@@@@@@@@@@@@ Fields 
	private long /*long*/  field_60224 ; // ofs = 60224 addr = 0)
	private net.rim.device.api.ui.Font /*net.rim.device.api.ui.Font*/  field_60228 ; // ofs = 60228 addr = 0)
	private net.rim.device.api.ui.Font /*net.rim.device.api.ui.Font*/  field_60232 ; // ofs = 60232 addr = 0)
	private net.rim.device.api.ui.Font /*net.rim.device.api.ui.Font*/  field_60236 ; // ofs = 60236 addr = 0)
	private boolean /*boolean*/  field_60240 ; // ofs = 60240 addr = 0)
	protected java.util.Vector /*java.util.Vector*/  _contacts ; // ofs = 60244 addr = 0)
	private java.util.Vector /*java.util.Vector*/  field_60248 ; // ofs = 60248 addr = 0)
	private String /*java.lang.String*/  field_60252 ; // ofs = 60252 addr = 0)
	private com.whatsapp.client. /*module:WhatsApp-8.class#5*/  field_60256 ; // ofs = 60256 addr = 0)
	private com.whatsapp.client. /*module:WhatsApp-10.class#9*/  field_60260 ; // ofs = 60260 addr = 0)
	private Runnable /*java.lang.Runnable*/  field_60264 ; // ofs = 60264 addr = 0)
	private com.whatsapp.client. /*module:WhatsApp-13.class#12*/  field_60268 ; // ofs = 60268 addr = 0)
	private java.util.Hashtable /*java.util.Hashtable*/  field_60272 ; // ofs = 60272 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.ContactPickerField ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_0 
	i2l 
	invokespecial com.whatsapp.client.ContactPickerField.<init> // pc=3
	return 
	}


public <init>( com.whatsapp.client.ContactPickerField, long ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib .routine_4036 // pc=1
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.ContactPickerField.field_60240   // get_name_1:  com.whatsapp.client.ContactPickerField.field_60240   // get_name_2:  com.whatsapp.client.ContactPickerField.field_60240   // get_Name:    com.whatsapp.client.ContactPickerField.field_60240   // getName->1:     // getName->2:     // getName->N:     // ofs = 60240 ord = 4 addr = 0
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putfield com.whatsapp.client.ContactPickerField.field_60272   // get_name_1:  com.whatsapp.client.ContactPickerField.field_60272   // get_name_2:  com.whatsapp.client.ContactPickerField.field_60272   // get_Name:    com.whatsapp.client.ContactPickerField.field_60272   // getName->1:     // getName->2:     // getName->N:     // ofs = 60272 ord = 12 addr = 0
	aload_0 
	lload 1
	lputfield com.whatsapp.client.ContactPickerField.field_60224   // get_name_1:  com.whatsapp.client.ContactPickerField.field_60224   // get_name_2:  com.whatsapp.client.ContactPickerField.field_60224   // get_Name:    com.whatsapp.client.ContactPickerField.field_60224   // getName->1:     // getName->2:     // getName->N:     // ofs = 60224 ord = 0 addr = 0
	aload_0 
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield _contacts   // get_name_1:  _contacts   // get_name_2:  _contacts   // get_Name:    _contacts   // getName->1:  _contacts   // getName->2:  _contacts   // getName->N:  _contacts   // ofs = 60244 ord = 5 addr = 0
	aload_0 
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield com.whatsapp.client.ContactPickerField.field_60248   // get_name_1:  com.whatsapp.client.ContactPickerField.field_60248   // get_name_2:  com.whatsapp.client.ContactPickerField.field_60248   // get_Name:    com.whatsapp.client.ContactPickerField.field_60248   // getName->1:     // getName->2:     // getName->N:     // ofs = 60248 ord = 6 addr = 0
	aload_0 
	getstatic STRING_EMPTY_STRING // Constants
	putfield com.whatsapp.client.ContactPickerField.field_60252   // get_name_1:  com.whatsapp.client.ContactPickerField.field_60252   // get_name_2:  com.whatsapp.client.ContactPickerField.field_60252   // get_Name:    com.whatsapp.client.ContactPickerField.field_60252   // getName->1:     // getName->2:     // getName->N:     // ofs = 60252 ord = 7 addr = 0
	aload_0 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	putfield com.whatsapp.client.ContactPickerField.field_60228   // get_name_1:  com.whatsapp.client.ContactPickerField.field_60228   // get_name_2:  com.whatsapp.client.ContactPickerField.field_60228   // get_Name:    com.whatsapp.client.ContactPickerField.field_60228   // getName->1:     // getName->2:     // getName->N:     // ofs = 60228 ord = 1 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.ContactPickerField.field_60228   // get_name_1:  com.whatsapp.client.ContactPickerField.field_60228   // get_name_2:  com.whatsapp.client.ContactPickerField.field_60228   // get_Name:    com.whatsapp.client.ContactPickerField.field_60228   // getName->1:     // getName->2:     // getName->N:     // ofs = 60228 ord = 1 addr = 0
	iconst_0 
	aload_0_getfield com.whatsapp.client.ContactPickerField.field_60228   // get_name_1:  com.whatsapp.client.ContactPickerField.field_60228   // get_name_2:  com.whatsapp.client.ContactPickerField.field_60228   // get_Name:    com.whatsapp.client.ContactPickerField.field_60228   // getName->1:     // getName->2:     // getName->N:     // ofs = 60228 ord = 1 addr = 0
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	bipush 80
	imul 
	bipush 100
	idiv 
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int, int ) // pc=3
	putfield com.whatsapp.client.ContactPickerField.field_60232   // get_name_1:  com.whatsapp.client.ContactPickerField.field_60232   // get_name_2:  com.whatsapp.client.ContactPickerField.field_60232   // get_Name:    com.whatsapp.client.ContactPickerField.field_60232   // getName->1:     // getName->2:     // getName->N:     // ofs = 60232 ord = 2 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.ContactPickerField.field_60232   // get_name_1:  com.whatsapp.client.ContactPickerField.field_60232   // get_name_2:  com.whatsapp.client.ContactPickerField.field_60232   // get_Name:    com.whatsapp.client.ContactPickerField.field_60232   // getName->1:     // getName->2:     // getName->N:     // ofs = 60232 ord = 2 addr = 0
	putfield com.whatsapp.client.ContactPickerField.field_60236   // get_name_1:  com.whatsapp.client.ContactPickerField.field_60236   // get_name_2:  com.whatsapp.client.ContactPickerField.field_60236   // get_Name:    com.whatsapp.client.ContactPickerField.field_60236   // getName->1:     // getName->2:     // getName->N:     // ofs = 60236 ord = 3 addr = 0
	aload_0 
	invokespecial com.whatsapp.client.ContactPickerField.routine_1961 // pc=1
	aload_0 
	getstatic STRING_EMPTY_STRING // Constants
	invokenonvirtual com.whatsapp.client.ContactPickerField.setFilterText // pc=2
	aload_0 
	aload_0 
	invokenonvirtual_lib .routine_3507 // pc=2
	return 
	}


static public final drawCheckbox( net.rim.device.api.ui.Graphics, int, int, int, boolean ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual int getColor( net.rim.device.api.ui.Graphics ) // pc=1
	istore_5 
	bipush 8
	istore_6 
	iload_3 
	bipush 2
	iload_6 
	imul 
	isub 
	istore_7 
	iload_7 
	bipush 24
	if_icmple Label24
	bipush 24
	istore_7 
	iload_3 
	iload_7 
	isub 
	bipush 2
	idiv 
	istore_6 
	goto Label45
Label24:
	iload_7 
	bipush 20
	if_icmpge Label45
	iload_3 
	bipush 22
	if_icmpge Label37
	iconst_1 
	istore_6 
	iload_3 
	bipush 2
	isub 
	istore_7 
	goto Label45
Label37:
	bipush 20
	istore_7 
	iload_3 
	iload_7 
	isub 
	bipush 2
	idiv 
	istore_6 
Label45:
	aload_0 
	iipush 13882323
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_0 
	iload_1 
	iload_6 
	iadd 
	iload_2 
	iload_6 
	iadd 
	iload_7 
	iload_7 
	bipush 4
	bipush 4
	invokevirtual fillRoundRect( net.rim.device.api.ui.Graphics, int, int, int, int, int, int ) // pc=7
	aload_0 
	iconst_0 
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_0 
	iload_1 
	iload_6 
	iadd 
	iload_2 
	iload_6 
	iadd 
	iload_7 
	iload_7 
	bipush 4
	bipush 4
	invokevirtual drawRoundRect( net.rim.device.api.ui.Graphics, int, int, int, int, int, int ) // pc=7
	iload_4 
	ifeq Label92
	aload_0 
	iload_7 
	iload_7 
	iload_7 
	bipush 4
	idiv 
	iload_1 
	iload_6 
	iadd 
	iload_2 
	iload_6 
	iadd 
	sipush 255
	iipush 11393254
	invokestatic com.whatsapp.client.ContactPickerField.routine_2990( net.rim.device.api.ui.Graphics, int, int, int, int, int, int, int ) // ContactPickerField
Label92:
	aload_0 
	iload_5 
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	return 
	}


static private final com.whatsapp.client.ContactPickerField.routine_2990( net.rim.device.api.ui.Graphics, int, int, int, int, int, int, int ); // address: 0
	{
	enter 
	aload_0 
	iload_6 
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_0 
	bipush 3
	iload_4 
	iadd 
	bipush 2
	iload_3 
	imul 
	bipush 3
	iadd 
	iload_5 
	iadd 
	iload_3 
	iconst_1 
	iadd 
	iload_4 
	iadd 
	bipush 3
	iload_3 
	imul 
	iconst_1 
	iadd 
	iload_5 
	iadd 
	invokevirtual drawLine( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	aload_0 
	iload_3 
	iconst_1 
	iadd 
	iload_4 
	iadd 
	bipush 3
	iload_3 
	imul 
	iconst_1 
	iadd 
	iload_5 
	iadd 
	bipush 3
	iload_3 
	imul 
	bipush 2
	iadd 
	iload_4 
	iadd 
	iload_3 
	iload_5 
	iadd 
	invokevirtual drawLine( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	aload_0 
	bipush 3
	iload_4 
	iadd 
	bipush 2
	iload_3 
	imul 
	bipush 2
	iadd 
	iload_5 
	iadd 
	iload_3 
	bipush 2
	iadd 
	iload_4 
	iadd 
	bipush 3
	iload_3 
	imul 
	iconst_1 
	iadd 
	iload_5 
	iadd 
	invokevirtual drawLine( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	aload_0 
	bipush 4
	iload_4 
	iadd 
	bipush 2
	iload_3 
	imul 
	bipush 2
	iadd 
	iload_5 
	iadd 
	iload_3 
	bipush 2
	iadd 
	iload_4 
	iadd 
	bipush 3
	iload_3 
	imul 
	iload_5 
	iadd 
	invokevirtual drawLine( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	aload_0 
	iload_3 
	bipush 2
	iadd 
	iload_4 
	iadd 
	bipush 3
	iload_3 
	imul 
	iconst_1 
	iadd 
	iload_5 
	iadd 
	bipush 3
	iload_3 
	imul 
	bipush 2
	iadd 
	iload_4 
	iadd 
	iload_3 
	iconst_1 
	iadd 
	iload_5 
	iadd 
	invokevirtual drawLine( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	aload_0 
	iload_3 
	bipush 2
	iadd 
	iload_4 
	iadd 
	bipush 3
	iload_3 
	imul 
	iconst_1 
	isub 
	iload_5 
	iadd 
	bipush 3
	iload_3 
	imul 
	iload_4 
	iadd 
	iconst_1 
	iadd 
	iload_3 
	iload_5 
	iadd 
	invokevirtual drawLine( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	aload_0 
	iload_7 
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_0 
	iload_3 
	bipush 3
	iadd 
	iload_4 
	iadd 
	bipush 3
	iload_3 
	imul 
	iconst_1 
	iadd 
	iload_5 
	iadd 
	bipush 3
	iload_3 
	imul 
	bipush 2
	iadd 
	iload_4 
	iadd 
	iload_3 
	bipush 2
	iadd 
	iload_5 
	iadd 
	invokevirtual drawLine( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	return 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	clinit_lib com.whatsapp.client.NonCachingListField//com.whatsapp.client.NonCachingListField com.whatsapp.client.NonCachingListField com.whatsapp.client.NonCachingListField
	synch_static ContactPickerField
	clinit_wait 
	getstatic_lib module:WhatsApp-31.class#0.static_10 // class#0
	invokestatic_lib module:WhatsApp-79.class#39.routine_21621(  ) // class#39
	putstatic com.whatsapp.client.ContactPickerField.field_60276 // ContactPickerField
	getstatic_lib module:WhatsApp-31.class#0.static_11 // class#0
	invokestatic_lib module:WhatsApp-79.class#39.routine_21621(  ) // class#39
	putstatic com.whatsapp.client.ContactPickerField.field_60282 // ContactPickerField
	new_lib com.whatsapp.client.ContactStatusDetails//module:WhatsApp.class#21 module:WhatsApp.class#21 module:WhatsApp.class#21
	dup 
	sipush 658
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	iconst_0 
	i2l 
	getstatic STRING_EMPTY_STRING // Constants
	invokespecial_lib .routine_12926 // pc=5
	putstatic com.whatsapp.client.ContactPickerField.field_60288 // ContactPickerField
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.ContactPickerField.routine_1961( com.whatsapp.client.ContactPickerField ); // address: 0
	{
	enter 
	aload_0 
	invokespecial com.whatsapp.client.ContactPickerField.routine_2055 // pc=1
	istore_1 
	bipush 12
	getstatic_lib module:WhatsApp-30.class#16.static_37 // class#16
	iadd 
	istore_2 
	bipush 6
	aload_0_getfield com.whatsapp.client.ContactPickerField.field_60228   // get_name_1:  com.whatsapp.client.ContactPickerField.field_60228   // get_name_2:  com.whatsapp.client.ContactPickerField.field_60228   // get_Name:    com.whatsapp.client.ContactPickerField.field_60228   // getName->1:     // getName->2:     // getName->N:     // ofs = 60228 ord = 1 addr = 0
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	iadd 
	iload_1 
	ifeq Label16
	iconst_0 
	goto Label17
Label16:
	bipush 6
Label17:
	iadd 
	aload_0_getfield com.whatsapp.client.ContactPickerField.field_60232   // get_name_1:  com.whatsapp.client.ContactPickerField.field_60232   // get_name_2:  com.whatsapp.client.ContactPickerField.field_60232   // get_Name:    com.whatsapp.client.ContactPickerField.field_60232   // getName->1:     // getName->2:     // getName->N:     // ofs = 60232 ord = 2 addr = 0
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	iadd 
	bipush 6
	iadd 
	istore_3 
	iload_1 
	ifeq Label30
	aload_0 
	iload_3 
	invokevirtual setRowHeight( net.rim.device.api.ui.component.ListField, int ) // pc=2
	return 
Label30:
	iload_2 
	iload_3 
	invokestatic_lib int max( int, int ) // Math
	istore_4 
	aload_0 
	iload_4 
	getstatic_lib module:WhatsApp-30.class#16.static_36 // class#16
	invokestatic_lib int max( int, int ) // Math
	invokevirtual setRowHeight( net.rim.device.api.ui.component.ListField, int ) // pc=2
	return 
	}


private final boolean com.whatsapp.client.ContactPickerField.routine_2055( com.whatsapp.client.ContactPickerField ); // address: 0
	{
	enter 
	aload_0 
	lgetfield com.whatsapp.client.ContactPickerField.field_60224   // get_name_1:  com.whatsapp.client.ContactPickerField.field_60224   // get_name_2:  com.whatsapp.client.ContactPickerField.field_60224   // get_Name:    com.whatsapp.client.ContactPickerField.field_60224   // getName->1:     // getName->2:     // getName->N:     // ofs = 60224 ord = 0 addr = 0
	bipush 2
	i2l 
	land 
	iconst_0 
	i2l 
	lcmp 
	ifeq Label12
	iconst_1 
	ireturn 
Label12:
	iconst_0 
	ireturn 
	}


private final com.whatsapp.client.ContactPickerField.routine_2094( com.whatsapp.client.ContactPickerField ); // address: 0
	{
	enter 
	aload_0 
	lgetfield com.whatsapp.client.ContactPickerField.field_60224   // get_name_1:  com.whatsapp.client.ContactPickerField.field_60224   // get_name_2:  com.whatsapp.client.ContactPickerField.field_60224   // get_Name:    com.whatsapp.client.ContactPickerField.field_60224   // getName->1:     // getName->2:     // getName->N:     // ofs = 60224 ord = 0 addr = 0
	bipush 4
	i2l 
	land 
	iconst_0 
	i2l 
	lcmp 
	ifne Label12
	iconst_1 
	goto Label13
Label12:
	iconst_0 
Label13:
	istore_1 
	aload_0_getfield _contacts   // get_name_1:  _contacts   // get_name_2:  _contacts   // get_Name:    _contacts   // getName->1:  _contacts   // getName->2:  _contacts   // getName->N:  _contacts   // ofs = 60244 ord = 5 addr = 0
	aload_0_getfield com.whatsapp.client.ContactPickerField.field_60252   // get_name_1:  com.whatsapp.client.ContactPickerField.field_60252   // get_name_2:  com.whatsapp.client.ContactPickerField.field_60252   // get_Name:    com.whatsapp.client.ContactPickerField.field_60252   // getName->1:     // getName->2:     // getName->N:     // ofs = 60252 ord = 7 addr = 0
	iload_1 
	invokestatic_lib module:WhatsApp-18.class#0.routine_2694(  ) // class#0
	astore_2 
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_3 
	aload_2 
	invokevirtual java.util.Enumeration elements( java.util.Vector ) // pc=1
	astore_4 
Label26:
	aload_4 
	invokeinterface interfacemethodref_2 // pc=1 guess=0
	ifne Label30
	goto_w Label114
Label30:
	aload_4 
	invokeinterface interfacemethodref_3 // pc=1 guess=1
	astore_5 
	aload_5 
	checkcastbranch_lib 
	astore_6 
	aload_0_getfield com.whatsapp.client.ContactPickerField.field_60256   // get_name_1:  com.whatsapp.client.ContactPickerField.field_60256   // get_name_2:  com.whatsapp.client.ContactPickerField.field_60256   // get_Name:    com.whatsapp.client.ContactPickerField.field_60256   // getName->1:     // getName->2:     // getName->N:     // ofs = 60256 ord = 8 addr = 0
	ifnull Label42
	aload_0_getfield com.whatsapp.client.ContactPickerField.field_60256   // get_name_1:  com.whatsapp.client.ContactPickerField.field_60256   // get_name_2:  com.whatsapp.client.ContactPickerField.field_60256   // get_Name:    com.whatsapp.client.ContactPickerField.field_60256   // getName->1:     // getName->2:     // getName->N:     // ofs = 60256 ord = 8 addr = 0
	aload_6 
	invokeinterface interfacemethodref_4 // pc=2 guess=2
	ifeq Label26
Label42:
	aload_3 
	aload_6 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	goto Label26
Label46:
	aload_5 
	checkcastbranch_lib 
	astore_6 
	aload_6 
	invokenonvirtual_lib .routine_9112 // pc=1
	astore_7 
	aload_0 
	lgetfield com.whatsapp.client.ContactPickerField.field_60224   // get_name_1:  com.whatsapp.client.ContactPickerField.field_60224   // get_name_2:  com.whatsapp.client.ContactPickerField.field_60224   // get_Name:    com.whatsapp.client.ContactPickerField.field_60224   // getName->1:     // getName->2:     // getName->N:     // ofs = 60224 ord = 0 addr = 0
	bipush 4
	i2l 
	land 
	iconst_0 
	i2l 
	lcmp 
	ifle Label92
	aload_7 
	arraylength 
	iconst_1 
	if_icmpne Label71
	aload_3 
	aload_7 
	iconst_0 
	aaload 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	goto Label26
Label71:
	aload_7 
	arraylength 
	ifle Label83
	aload_3 
	new_lib com.whatsapp.client.//module:WhatsApp-12.class#30 module:WhatsApp-12.class#30 module:WhatsApp-12.class#30
	dup 
	aload_6 
	getstatic com.whatsapp.client.ContactPickerField.field_60288 // ContactPickerField
	getstatic STRING_EMPTY_STRING // Constants
	invokespecial_lib .routine_5658 // pc=4
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	goto Label26
Label83:
	aload_3 
	new_lib com.whatsapp.client.ChatableNumber//module:WhatsApp-12.class#30 module:WhatsApp-12.class#30 module:WhatsApp-12.class#30
	dup 
	aload_6 
	aconst_null 
	getstatic STRING_EMPTY_STRING // Constants
	invokespecial_lib .routine_5658 // pc=4
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	goto_w Label26
Label92:
	iconst_0 
	istore 8
Label94:
	iload 8
	aload_7 
	arraylength 
	if_icmplt Label99
	goto_w Label26
Label99:
	aload_7 
	iload 8
	aaload 
	astore 9
	aload_0_getfield com.whatsapp.client.ContactPickerField.field_60256   // get_name_1:  com.whatsapp.client.ContactPickerField.field_60256   // get_name_2:  com.whatsapp.client.ContactPickerField.field_60256   // get_Name:    com.whatsapp.client.ContactPickerField.field_60256   // getName->1:     // getName->2:     // getName->N:     // ofs = 60256 ord = 8 addr = 0
	ifnull Label109
	aload_0_getfield com.whatsapp.client.ContactPickerField.field_60256   // get_name_1:  com.whatsapp.client.ContactPickerField.field_60256   // get_name_2:  com.whatsapp.client.ContactPickerField.field_60256   // get_Name:    com.whatsapp.client.ContactPickerField.field_60256   // getName->1:     // getName->2:     // getName->N:     // ofs = 60256 ord = 8 addr = 0
	aload 9
	invokeinterface interfacemethodref_4 // pc=2 guess=2
	ifeq Label112
Label109:
	aload_3 
	aload 9
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label112:
	iinc 8 1
	goto Label94
Label114:
	aload_0 
	aload_3 
	putfield com.whatsapp.client.ContactPickerField.field_60248   // get_name_1:  com.whatsapp.client.ContactPickerField.field_60248   // get_name_2:  com.whatsapp.client.ContactPickerField.field_60248   // get_Name:    com.whatsapp.client.ContactPickerField.field_60248   // getName->1:     // getName->2:     // getName->N:     // ofs = 60248 ord = 6 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.ContactPickerField.field_60248   // get_name_1:  com.whatsapp.client.ContactPickerField.field_60248   // get_name_2:  com.whatsapp.client.ContactPickerField.field_60248   // get_Name:    com.whatsapp.client.ContactPickerField.field_60248   // getName->1:     // getName->2:     // getName->N:     // ofs = 60248 ord = 6 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	aload_0 
	invokenonvirtual com.whatsapp.client.ContactPickerField.isShowGroupRow // pc=1
	ifeq Label125
	iconst_1 
	goto Label126
Label125:
	iconst_0 
Label126:
	iadd 
	invokevirtual setSize( net.rim.device.api.ui.component.ListField, int ) // pc=2
	return 
	}


private final module:WhatsApp-12.class#30 com.whatsapp.client.ContactPickerField.routine_2365( com.whatsapp.client.ContactPickerField, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.ContactPickerField.field_60248   // get_name_1:  com.whatsapp.client.ContactPickerField.field_60248   // get_name_2:  com.whatsapp.client.ContactPickerField.field_60248   // get_Name:    com.whatsapp.client.ContactPickerField.field_60248   // getName->1:     // getName->2:     // getName->N:     // ofs = 60248 ord = 6 addr = 0
	ifnull Label9
	iload_1 
	iflt Label9
	iload_1 
	aload_0_getfield com.whatsapp.client.ContactPickerField.field_60248   // get_name_1:  com.whatsapp.client.ContactPickerField.field_60248   // get_name_2:  com.whatsapp.client.ContactPickerField.field_60248   // get_Name:    com.whatsapp.client.ContactPickerField.field_60248   // getName->1:     // getName->2:     // getName->N:     // ofs = 60248 ord = 6 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmplt Label11
Label9:
	aconst_null 
	areturn 
Label11:
	aload_0_getfield com.whatsapp.client.ContactPickerField.field_60248   // get_name_1:  com.whatsapp.client.ContactPickerField.field_60248   // get_name_2:  com.whatsapp.client.ContactPickerField.field_60248   // get_Name:    com.whatsapp.client.ContactPickerField.field_60248   // getName->1:     // getName->2:     // getName->N:     // ofs = 60248 ord = 6 addr = 0
	iload_1 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.ChatableNumber//module:WhatsApp-12.class#30 module:WhatsApp-12.class#30 module:WhatsApp-12.class#30
	areturn 
	}


private final com.whatsapp.client.ContactPickerField.routine_2409( com.whatsapp.client.ContactPickerField ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual int getSelectedIndex( net.rim.device.api.ui.component.ListField ) // pc=1
	istore_1 
	aload_0 
	invokenonvirtual com.whatsapp.client.ContactPickerField.isShowGroupRow // pc=1
	ifeq Label8
	iinc 1 -1
Label8:
	iload_1 
	ifge Label15
	aload_0_getfield com.whatsapp.client.ContactPickerField.field_60264   // get_name_1:  com.whatsapp.client.ContactPickerField.field_60264   // get_name_2:  com.whatsapp.client.ContactPickerField.field_60264   // get_Name:    com.whatsapp.client.ContactPickerField.field_60264   // getName->1:     // getName->2:     // getName->N:     // ofs = 60264 ord = 10 addr = 0
	ifnull Label51
	aload_0_getfield com.whatsapp.client.ContactPickerField.field_60264   // get_name_1:  com.whatsapp.client.ContactPickerField.field_60264   // get_name_2:  com.whatsapp.client.ContactPickerField.field_60264   // get_Name:    com.whatsapp.client.ContactPickerField.field_60264   // getName->1:     // getName->2:     // getName->N:     // ofs = 60264 ord = 10 addr = 0
	invokeinterface interfacemethodref_5 // pc=1 guess=3
	return 
Label15:
	aload_0 
	iload_1 
	invokespecial com.whatsapp.client.ContactPickerField.routine_2365 // pc=2
	astore_2 
	aload_2 
	ifnonnull Label22
	return 
Label22:
	aload_0_getfield com.whatsapp.client.ContactPickerField.field_60272   // get_name_1:  com.whatsapp.client.ContactPickerField.field_60272   // get_name_2:  com.whatsapp.client.ContactPickerField.field_60272   // get_Name:    com.whatsapp.client.ContactPickerField.field_60272   // getName->1:     // getName->2:     // getName->N:     // ofs = 60272 ord = 12 addr = 0
	aload_2 
	invokevirtual boolean containsKey( java.util.Hashtable, java.lang.Object ) // pc=2
	ifeq Label31
	aload_0_getfield com.whatsapp.client.ContactPickerField.field_60272   // get_name_1:  com.whatsapp.client.ContactPickerField.field_60272   // get_name_2:  com.whatsapp.client.ContactPickerField.field_60272   // get_Name:    com.whatsapp.client.ContactPickerField.field_60272   // getName->1:     // getName->2:     // getName->N:     // ofs = 60272 ord = 12 addr = 0
	aload_2 
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	pop 
	goto Label36
Label31:
	aload_0_getfield com.whatsapp.client.ContactPickerField.field_60272   // get_name_1:  com.whatsapp.client.ContactPickerField.field_60272   // get_name_2:  com.whatsapp.client.ContactPickerField.field_60272   // get_Name:    com.whatsapp.client.ContactPickerField.field_60272   // getName->1:     // getName->2:     // getName->N:     // ofs = 60272 ord = 12 addr = 0
	aload_2 
	aload_2 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
Label36:
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.component.ListField ) // pc=1
	aload_0_getfield com.whatsapp.client.ContactPickerField.field_60260   // get_name_1:  com.whatsapp.client.ContactPickerField.field_60260   // get_name_2:  com.whatsapp.client.ContactPickerField.field_60260   // get_Name:    com.whatsapp.client.ContactPickerField.field_60260   // getName->1:     // getName->2:     // getName->N:     // ofs = 60260 ord = 9 addr = 0
	ifnull Label51
	aload_2 
	ifnull Label51
	aload_2 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iconst_0 
	invokenonvirtual_lib .routine_8839 // pc=2
	astore_3 
	aload_0_getfield com.whatsapp.client.ContactPickerField.field_60260   // get_name_1:  com.whatsapp.client.ContactPickerField.field_60260   // get_name_2:  com.whatsapp.client.ContactPickerField.field_60260   // get_Name:    com.whatsapp.client.ContactPickerField.field_60260   // getName->1:     // getName->2:     // getName->N:     // ofs = 60260 ord = 9 addr = 0
	aload_2 
	aload_3 
	invokeinterface interfacemethodref_6 // pc=3 guess=4
Label51:
	return 
	}


private final com.whatsapp.client.ContactPickerField.routine_2528( com.whatsapp.client.ContactPickerField, com.whatsapp.client.NonCachingListField, net.rim.device.api.ui.Graphics, int, int, boolean ); // address: 0
	{
	enter 
	iload_4 
	bipush 60
	isub 
	istore_6 
	aconst_null 
	astore_7 
	aload_1 
	invokevirtual int getRowHeight( net.rim.device.api.ui.component.ListField ) // pc=1
	istore 8
	aload_2 
	bipush 30
	iconst_0 
	iload_6 
	iipush 2147483647
	iconst_0 
	iconst_0 
	invokevirtual boolean pushRegion( net.rim.device.api.ui.Graphics, int, int, int, int, int, int ) // pc=7
	pop 
	aload_2 
	aload_7 
	sipush 848
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	getstatic STRING_EMPTY_STRING // Constants
	aconst_null 
	aload_0_getfield com.whatsapp.client.ContactPickerField.field_60228   // get_name_1:  com.whatsapp.client.ContactPickerField.field_60228   // get_name_2:  com.whatsapp.client.ContactPickerField.field_60228   // get_Name:    com.whatsapp.client.ContactPickerField.field_60228   // getName->1:     // getName->2:     // getName->N:     // ofs = 60228 ord = 1 addr = 0
	iconst_1 
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int ) // pc=2
	aload_0_getfield com.whatsapp.client.ContactPickerField.field_60236   // get_name_1:  com.whatsapp.client.ContactPickerField.field_60236   // get_name_2:  com.whatsapp.client.ContactPickerField.field_60236   // get_Name:    com.whatsapp.client.ContactPickerField.field_60236   // getName->1:     // getName->2:     // getName->N:     // ofs = 60236 ord = 3 addr = 0
	aconst_null 
	aconst_null 
	iload_3 
	getstatic_lib module:WhatsApp-30.class#16.static_37 // class#16
	iload_6 
	iload 8
	iload_5 
	invokestatic_lib module:WhatsApp-30.class#15.routine_5073(  ) // class#15
	aload_2 
	invokevirtual popContext( net.rim.device.api.ui.Graphics ) // pc=1
	iload 8
	iconst_1 
	iushr 
	istore 9
	iload_5 
	ifeq Label47
	getstatic com.whatsapp.client.ContactPickerField.field_60282 // ContactPickerField
	goto Label48
Label47:
	getstatic com.whatsapp.client.ContactPickerField.field_60276 // ContactPickerField
Label48:
	astore 10
	aload_2 
	iload_4 
	iload 9
	isub 
	iload_3 
	iload 9
	aload 10
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	iconst_1 
	iushr 
	isub 
	iadd 
	aload 10
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload 10
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	aload 10
	iconst_0 
	iconst_0 
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=8
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final boolean isShowGroupRow( com.whatsapp.client.ContactPickerField ); // address: 0
	{
	ireturn_field com.whatsapp.client.ContactPickerField.field_60240   // get_name_1:  com.whatsapp.client.ContactPickerField.field_60240   // get_name_2:  com.whatsapp.client.ContactPickerField.field_60240   // get_Name:    com.whatsapp.client.ContactPickerField.field_60240   // getName->1:     // getName->2:     // getName->N:     // ofs = 60240 ord = 4 addr = 0
	}


public final setShowGroupRow( com.whatsapp.client.ContactPickerField, boolean ); // address: 0
	{
	putfield_return com.whatsapp.client.ContactPickerField.field_60240   // get_name_1:  com.whatsapp.client.ContactPickerField.field_60240   // get_name_2:  com.whatsapp.client.ContactPickerField.field_60240   // get_Name:    com.whatsapp.client.ContactPickerField.field_60240   // getName->1:     // getName->2:     // getName->N:     // ofs = 60240 ord = 4 addr = 0
	}


public final setLabelFont( com.whatsapp.client.ContactPickerField, net.rim.device.api.ui.Font ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	putfield com.whatsapp.client.ContactPickerField.field_60236   // get_name_1:  com.whatsapp.client.ContactPickerField.field_60236   // get_name_2:  com.whatsapp.client.ContactPickerField.field_60236   // get_Name:    com.whatsapp.client.ContactPickerField.field_60236   // getName->1:     // getName->2:     // getName->N:     // ofs = 60236 ord = 3 addr = 0
	aload_0 
	invokespecial com.whatsapp.client.ContactPickerField.routine_1961 // pc=1
	return 
	}


public final setContacts( com.whatsapp.client.ContactPickerField, java.util.Vector ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	putfield _contacts   // get_name_1:  _contacts   // get_name_2:  _contacts   // get_Name:    _contacts   // getName->1:  _contacts   // getName->2:  _contacts   // getName->N:  _contacts   // ofs = 60244 ord = 5 addr = 0
	aload_0 
	invokespecial com.whatsapp.client.ContactPickerField.routine_2094 // pc=1
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.component.ListField ) // pc=1
	return 
	}


public final setFilterText( com.whatsapp.client.ContactPickerField, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.ContactPickerField.field_60252   // get_name_1:  com.whatsapp.client.ContactPickerField.field_60252   // get_name_2:  com.whatsapp.client.ContactPickerField.field_60252   // get_Name:    com.whatsapp.client.ContactPickerField.field_60252   // getName->1:     // getName->2:     // getName->N:     // ofs = 60252 ord = 7 addr = 0
	ifnull Label8
	aload_0_getfield com.whatsapp.client.ContactPickerField.field_60252   // get_name_1:  com.whatsapp.client.ContactPickerField.field_60252   // get_name_2:  com.whatsapp.client.ContactPickerField.field_60252   // get_Name:    com.whatsapp.client.ContactPickerField.field_60252   // getName->1:     // getName->2:     // getName->N:     // ofs = 60252 ord = 7 addr = 0
	aload_1 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label8
	return 
Label8:
	aload_0 
	aload_1 
	putfield com.whatsapp.client.ContactPickerField.field_60252   // get_name_1:  com.whatsapp.client.ContactPickerField.field_60252   // get_name_2:  com.whatsapp.client.ContactPickerField.field_60252   // get_Name:    com.whatsapp.client.ContactPickerField.field_60252   // getName->1:     // getName->2:     // getName->N:     // ofs = 60252 ord = 7 addr = 0
	aload_1 
	ifnull Label16
	aload_1 
	stringlength 
	ifne Label18
Label16:
	sipush 815
	goto Label19
Label18:
	sipush 814
Label19:
	istore_2 
	aload_0 
	iload_2 
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	bipush 4
	invokevirtual setEmptyString( net.rim.device.api.ui.component.ListField, java.lang.String, int ) // pc=3
	aload_0 
	invokespecial com.whatsapp.client.ContactPickerField.routine_2094 // pc=1
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.component.ListField ) // pc=1
	return 
	}


public final setFilterChatable( com.whatsapp.client.ContactPickerField, module:WhatsApp-8.class#5 ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	putfield com.whatsapp.client.ContactPickerField.field_60256   // get_name_1:  com.whatsapp.client.ContactPickerField.field_60256   // get_name_2:  com.whatsapp.client.ContactPickerField.field_60256   // get_Name:    com.whatsapp.client.ContactPickerField.field_60256   // getName->1:     // getName->2:     // getName->N:     // ofs = 60256 ord = 8 addr = 0
	aload_0 
	invokespecial com.whatsapp.client.ContactPickerField.routine_2094 // pc=1
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.component.ListField ) // pc=1
	return 
	}


public final setClickHandler( com.whatsapp.client.ContactPickerField, module:WhatsApp-10.class#9 ); // address: 0
	{
	putfield_return com.whatsapp.client.ContactPickerField.field_60260   // get_name_1:  com.whatsapp.client.ContactPickerField.field_60260   // get_name_2:  com.whatsapp.client.ContactPickerField.field_60260   // get_Name:    com.whatsapp.client.ContactPickerField.field_60260   // getName->1:     // getName->2:     // getName->N:     // ofs = 60260 ord = 9 addr = 0
	}


public final setKeyCharHandler( com.whatsapp.client.ContactPickerField, module:WhatsApp-13.class#12 ); // address: 0
	{
	putfield_return com.whatsapp.client.ContactPickerField.field_60268   // get_name_1:  com.whatsapp.client.ContactPickerField.field_60268   // get_name_2:  com.whatsapp.client.ContactPickerField.field_60268   // get_Name:    com.whatsapp.client.ContactPickerField.field_60268   // getName->1:     // getName->2:     // getName->N:     // ofs = 60268 ord = 11 addr = 0
	}


public final module:WhatsApp-12.class#30 getSelectedChatableNumber( com.whatsapp.client.ContactPickerField ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual int getSelectedIndex( net.rim.device.api.ui.component.ListField ) // pc=1
	istore_1 
	aload_0 
	iload_1 
	invokespecial com.whatsapp.client.ContactPickerField.routine_2365 // pc=2
	areturn 
	}


protected final boolean keyChar( com.whatsapp.client.ContactPickerField, char, int, int ); // address: 0
	{
	enter 
	iload_1 
	bipush 10
	if_icmpne Label8
	aload_0 
	invokespecial com.whatsapp.client.ContactPickerField.routine_2409 // pc=1
	iconst_1 
	ireturn 
Label8:
	iload_1 
	bipush 32
	if_icmpne Label24
	aload_0 
	lgetfield com.whatsapp.client.ContactPickerField.field_60224   // get_name_1:  com.whatsapp.client.ContactPickerField.field_60224   // get_name_2:  com.whatsapp.client.ContactPickerField.field_60224   // get_Name:    com.whatsapp.client.ContactPickerField.field_60224   // getName->1:     // getName->2:     // getName->N:     // ofs = 60224 ord = 0 addr = 0
	iconst_1 
	i2l 
	land 
	iconst_0 
	i2l 
	lcmp 
	ifeq Label24
	aload_0 
	invokespecial com.whatsapp.client.ContactPickerField.routine_2409 // pc=1
	iconst_1 
	ireturn 
Label24:
	aload_0_getfield com.whatsapp.client.ContactPickerField.field_60268   // get_name_1:  com.whatsapp.client.ContactPickerField.field_60268   // get_name_2:  com.whatsapp.client.ContactPickerField.field_60268   // get_Name:    com.whatsapp.client.ContactPickerField.field_60268   // getName->1:     // getName->2:     // getName->N:     // ofs = 60268 ord = 11 addr = 0
	ifnull Label34
	aload_0_getfield com.whatsapp.client.ContactPickerField.field_60268   // get_name_1:  com.whatsapp.client.ContactPickerField.field_60268   // get_name_2:  com.whatsapp.client.ContactPickerField.field_60268   // get_Name:    com.whatsapp.client.ContactPickerField.field_60268   // getName->1:     // getName->2:     // getName->N:     // ofs = 60268 ord = 11 addr = 0
	iload_1 
	iload_2 
	iload_3 
	invokeinterface interfacemethodref_7 // pc=4 guess=5
	ifeq Label34
	iconst_1 
	ireturn 
Label34:
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	invokespecial_lib net.rim.device.api.ui.component.ListField.keyChar // pc=4
	ireturn 
	}


protected final boolean navigationClick( com.whatsapp.client.ContactPickerField, int, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial com.whatsapp.client.ContactPickerField.routine_2409 // pc=1
	iconst_1 
	ireturn 
	}


public final drawListRow( com.whatsapp.client.ContactPickerField, net.rim.device.api.ui.component.ListField, net.rim.device.api.ui.Graphics, int, int, int ); // address: 0
	{
	noenter_return 
	}


public final drawListRow( com.whatsapp.client.ContactPickerField, com.whatsapp.client.NonCachingListField, net.rim.device.api.ui.Graphics, int, int, int, boolean ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual int getRowHeight( net.rim.device.api.ui.component.ListField ) // pc=1
	istore_7 
	iload_6 
	ifne Label29
	aload_2 
	invokevirtual int getColor( net.rim.device.api.ui.Graphics ) // pc=1
	istore 8
	iload_3 
	bipush 2
	irem 
	ifne Label15
	iipush 16777215
	goto Label16
Label15:
	iipush 15987699
Label16:
	istore 9
	aload_2 
	iload 9
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_2 
	iconst_0 
	iload_4 
	iload_5 
	iload_7 
	invokevirtual fillRect( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	aload_2 
	iload 8
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
Label29:
	aload_0 
	invokenonvirtual com.whatsapp.client.ContactPickerField.isShowGroupRow // pc=1
	ifeq Label36
	iload_3 
	iconst_1 
	isub 
	istore_3 
Label36:
	iload_3 
	ifge Label45
	aload_0 
	aload_1 
	aload_2 
	iload_4 
	iload_5 
	iload_6 
	invokespecial com.whatsapp.client.ContactPickerField.routine_2528 // pc=6
Label45:
	aload_0 
	iload_3 
	invokespecial com.whatsapp.client.ContactPickerField.routine_2365 // pc=2
	astore 8
	aload 8
	ifnonnull Label52
	return 
Label52:
	aload 8
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	astore 9
	aconst_null 
	astore 10
	aload 8
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	ifnull Label79
	aload_0 
	lgetfield com.whatsapp.client.ContactPickerField.field_60224   // get_name_1:  com.whatsapp.client.ContactPickerField.field_60224   // get_name_2:  com.whatsapp.client.ContactPickerField.field_60224   // get_Name:    com.whatsapp.client.ContactPickerField.field_60224   // getName->1:     // getName->2:     // getName->N:     // ofs = 60224 ord = 0 addr = 0
	bipush 8
	i2l 
	land 
	iconst_0 
	i2l 
	lcmp 
	ifeq Label75
	aload 8
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokenonvirtual_lib .routine_12254 // pc=1
	invokestatic_lib module:WhatsApp-11.class#1.routine_2162(  ) // class#1
	astore 10
	goto Label79
Label75:
	aload 8
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokenonvirtual_lib .routine_12299 // pc=1
	astore 10
Label79:
	invokestatic_lib module:WhatsApp-18.class#0.routine_2419(  ) // class#0
	astore 11
	iconst_0 
	istore 12
	aload 11
	ifnull Label88
	aload 11
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	istore 12
Label88:
	aload 9
	iload 12
	invokenonvirtual_lib .routine_8839 // pc=2
	astore 13
	aconst_null 
	astore 14
	aload_0 
	invokespecial com.whatsapp.client.ContactPickerField.routine_2055 // pc=1
	ifne Label124
	aload 8
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	ifnull Label109
	invokestatic_lib module:WhatsApp-21.class#0.routine_1491(  ) // class#0
	aload 8
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokenonvirtual_lib .routine_1151 // pc=2
	astore 15
	aload 15
	getstatic_lib module:WhatsApp-30.class#16.static_37 // class#16
	invokestatic_lib module:WhatsApp-47.class#16.routine_8247(  ) // class#16
	astore 14
Label109:
	aload 14
	ifnonnull Label118
	aload 11
	aload 9
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getstatic_lib module:WhatsApp-30.class#16.static_37 // class#16
	getstatic_lib module:WhatsApp-30.class#16.static_37 // class#16
	invokenonvirtual_lib .routine_282 // pc=4
	astore 14
Label118:
	aload 14
	ifnonnull Label124
	getstatic_lib module:WhatsApp-31.class#0.static_142 // class#0
	getstatic_lib module:WhatsApp-30.class#16.static_35 // class#16
	invokestatic_lib module:WhatsApp-58.class#1.routine_1308(  ) // class#1
	astore 14
Label124:
	aload_2 
	aload 14
	aload 13
	aload 8
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload 10
	aload_0_getfield com.whatsapp.client.ContactPickerField.field_60228   // get_name_1:  com.whatsapp.client.ContactPickerField.field_60228   // get_name_2:  com.whatsapp.client.ContactPickerField.field_60228   // get_Name:    com.whatsapp.client.ContactPickerField.field_60228   // getName->1:     // getName->2:     // getName->N:     // ofs = 60228 ord = 1 addr = 0
	aload_0_getfield com.whatsapp.client.ContactPickerField.field_60236   // get_name_1:  com.whatsapp.client.ContactPickerField.field_60236   // get_name_2:  com.whatsapp.client.ContactPickerField.field_60236   // get_Name:    com.whatsapp.client.ContactPickerField.field_60236   // getName->1:     // getName->2:     // getName->N:     // ofs = 60236 ord = 3 addr = 0
	aload_0_getfield com.whatsapp.client.ContactPickerField.field_60232   // get_name_1:  com.whatsapp.client.ContactPickerField.field_60232   // get_name_2:  com.whatsapp.client.ContactPickerField.field_60232   // get_Name:    com.whatsapp.client.ContactPickerField.field_60232   // getName->1:     // getName->2:     // getName->N:     // ofs = 60232 ord = 2 addr = 0
	iload_6 
	ifeq Label137
	aconst_null 
	goto Label141
Label137:
	new_lib java.util.Enumeration//java.util.Enumeration java.util.Enumeration java.util.Enumeration
	dup 
	iipush 5066061
	invokespecial_lib java.lang.Integer.<init> // pc=2
Label141:
	iload_4 
	getstatic_lib module:WhatsApp-30.class#16.static_37 // class#16
	iload_5 
	iload_7 
	iload_6 
	invokestatic_lib module:WhatsApp-30.class#15.routine_5073(  ) // class#15
	aload_2 
	iipush 13882323
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_2 
	iconst_0 
	iload_4 
	iload_5 
	iload_4 
	invokevirtual drawLine( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	iload_3 
	aload_0 
	invokevirtual int getSize( net.rim.device.api.ui.component.ListField ) // pc=1
	iconst_1 
	isub 
	if_icmpne Label176
	aload_2 
	iconst_0 
	iload_4 
	iload_7 
	iadd 
	iconst_1 
	isub 
	iload_5 
	iload_4 
	iload_7 
	iadd 
	iconst_1 
	isub 
	invokevirtual drawLine( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
Label176:
	return 
	}


public final int indexOfList( com.whatsapp.client.ContactPickerField, net.rim.device.api.ui.component.ListField, java.lang.String, int ); // address: 0
	{
	enter 
	bipush -1
	ireturn 
	}


public final java.lang.Object get( com.whatsapp.client.ContactPickerField, net.rim.device.api.ui.component.ListField, int ); // address: 0
	{
	enter_narrow 
	aload_1 
	aload_0 
	if_acmpne Label15
	aload_0 
	aload_0 
	invokenonvirtual com.whatsapp.client.ContactPickerField.isShowGroupRow // pc=1
	ifeq Label12
	iload_2 
	iconst_1 
	isub 
	goto Label13
Label12:
	iload_2 
Label13:
	invokespecial com.whatsapp.client.ContactPickerField.routine_2365 // pc=2
	areturn 
Label15:
	aconst_null 
	areturn 
	}


public final int getPreferredWidth( com.whatsapp.client.ContactPickerField, net.rim.device.api.ui.component.ListField ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	ireturn 
	}

}
