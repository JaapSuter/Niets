// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-12.cod
// Module version  : 2.7.6550
// Class ID        : 30
// ########################################################


package com.whatsapp.client;


abstract final class ContactDetailScreen$SectionFieldManager extends net.rim.device.api.ui.container.VerticalFieldManager

{
	// @@@@@@@@@@@@@ Static fields 
	private final static net.rim.device.api.ui.decor.Border /*net.rim.device.api.ui.decor.Border*/  field_41692 ; // ofs = 41692 addr = 234)

	// @@@@@@@@@@@@@ Fields 
	private final boolean /*boolean*/  field_41676 ; // ofs = 41676 addr = 0)
	private final com.whatsapp.client.LocationDisplayScreen$1 /*module:WhatsApp-20.class#20*/  field_41680 ; // ofs = 41680 addr = 0)
	private final net.rim.device.api.ui.Manager /*net.rim.device.api.ui.Manager*/  field_41684 ; // ofs = 41684 addr = 0)
	private final int /*int*/  field_41688 ; // ofs = 41688 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.ContactDetailScreen$SectionFieldManager, int, boolean ); // address: 0
	{
	enter 
	aload_0 
	lipush 1153484454560268288
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.<init> // pc=3
	aload_0 
	iload_2 
	putfield com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41676   // get_name_1:  com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41676   // get_name_2:  com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41676   // get_Name:    com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41676   // getName->1:     // getName->2:     // getName->N:     // ofs = 41676 ord = 0 addr = 0
	iload_1 
	bipush -1
	if_icmpeq Label23
	aload_0 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	iload_1 
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	getstatic STRING_EMPTY_STRING // Constants
	invokestatic_lib module:WhatsApp-20.class#20.routine_6917(  ) // class#20
	putfield com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41680   // get_name_1:  com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41680   // get_name_2:  com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41680   // get_Name:    com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41680   // getName->1:     // getName->2:     // getName->N:     // ofs = 41680 ord = 1 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41680   // get_name_1:  com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41680   // get_name_2:  com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41680   // get_Name:    com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41680   // getName->1:     // getName->2:     // getName->N:     // ofs = 41680 ord = 1 addr = 0
	invokenonvirtual_lib .routine_6278 // pc=1
	putfield com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41688   // get_name_1:  com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41688   // get_name_2:  com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41688   // get_Name:    com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41688   // getName->1:     // getName->2:     // getName->N:     // ofs = 41688 ord = 3 addr = 0
	goto Label29
Label23:
	aload_0 
	aconst_null 
	putfield com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41680   // get_name_1:  com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41680   // get_name_2:  com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41680   // get_Name:    com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41680   // getName->1:     // getName->2:     // getName->N:     // ofs = 41680 ord = 1 addr = 0
	aload_0 
	iipush 5265246
	putfield com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41688   // get_name_1:  com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41688   // get_name_2:  com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41688   // get_Name:    com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41688   // getName->1:     // getName->2:     // getName->N:     // ofs = 41688 ord = 3 addr = 0
Label29:
	aload_0 
	new_lib net.rim.device.api.ui.Font//net.rim.device.api.ui.Font net.rim.device.api.ui.Font net.rim.device.api.ui.Font
	dup 
	lipush 1152921504606846976
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.<init> // pc=3
	putfield com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41684   // get_name_1:  com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41684   // get_name_2:  com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41684   // get_Name:    com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41684   // getName->1:     // getName->2:     // getName->N:     // ofs = 41684 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41684   // get_name_1:  com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41684   // get_name_2:  com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41684   // get_Name:    com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41684   // getName->1:     // getName->2:     // getName->N:     // ofs = 41684 ord = 2 addr = 0
	bipush 8
	iload_2 
	ifeq Label41
	bipush 16
	goto Label42
Label41:
	iconst_0 
Label42:
	bipush 16
	iload_2 
	ifeq Label47
	bipush 16
	goto Label48
Label47:
	iconst_0 
Label48:
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0_getfield com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41680   // get_name_1:  com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41680   // get_name_2:  com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41680   // get_Name:    com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41680   // getName->1:     // getName->2:     // getName->N:     // ofs = 41680 ord = 1 addr = 0
	ifnull Label55
	aload_0 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41680   // get_name_1:  com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41680   // get_name_2:  com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41680   // get_Name:    com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41680   // getName->1:     // getName->2:     // getName->N:     // ofs = 41680 ord = 1 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	goto Label61
Label55:
	aload_0_getfield com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41684   // get_name_1:  com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41684   // get_name_2:  com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41684   // get_Name:    com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41684   // getName->1:     // getName->2:     // getName->N:     // ofs = 41684 ord = 2 addr = 0
	bipush 10
	iconst_0 
	iconst_0 
	iconst_0 
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
Label61:
	aload_0 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41684   // get_name_1:  com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41684   // get_name_2:  com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41684   // get_Name:    com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41684   // getName->1:     // getName->2:     // getName->N:     // ofs = 41684 ord = 2 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	return 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	clinit_lib net.rim.device.api.ui.Font//net.rim.device.api.ui.Font net.rim.device.api.ui.Font net.rim.device.api.ui.Font
	synch_static ContactDetailScreen$SectionFieldManager
	clinit_wait 
	new_lib net.rim.device.api.ui.component.BasicEditField//net.rim.device.api.ui.component.BasicEditField net.rim.device.api.ui.component.BasicEditField net.rim.device.api.ui.component.BasicEditField
	dup 
	iconst_1 
	iconst_0 
	iconst_0 
	iconst_0 
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=5
	new_lib net.rim.device.api.ui.component.BasicEditField//net.rim.device.api.ui.component.BasicEditField net.rim.device.api.ui.component.BasicEditField net.rim.device.api.ui.component.BasicEditField
	dup 
	iipush 14803425
	iconst_0 
	iconst_0 
	iconst_0 
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=5
	bipush 4
	invokestatic_lib net.rim.device.api.ui.decor.Border createSimpleBorder( net.rim.device.api.ui.XYEdges, net.rim.device.api.ui.XYEdges, int ) // BorderFactory
	putstatic com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41692 // ContactDetailScreen$SectionFieldManager
	clinit_return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final setTitleRightText( com.whatsapp.client.ContactDetailScreen$SectionFieldManager, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41680   // get_name_1:  com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41680   // get_name_2:  com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41680   // get_Name:    com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41680   // getName->1:     // getName->2:     // getName->N:     // ofs = 41680 ord = 1 addr = 0
	ifnull Label6
	aload_0_getfield com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41680   // get_name_1:  com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41680   // get_name_2:  com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41680   // get_Name:    com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41680   // getName->1:     // getName->2:     // getName->N:     // ofs = 41680 ord = 1 addr = 0
	aload_1 
	invokenonvirtual_lib .routine_6203 // pc=2
Label6:
	return 
	}


public final int getLabelColor( com.whatsapp.client.ContactDetailScreen$SectionFieldManager ); // address: 0
	{
	ireturn_field com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41688   // get_name_1:  com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41688   // get_name_2:  com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41688   // get_Name:    com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41688   // getName->1:     // getName->2:     // getName->N:     // ofs = 41688 ord = 3 addr = 0
	}


public final boolean isContentEmpty( com.whatsapp.client.ContactDetailScreen$SectionFieldManager ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41684   // get_name_1:  com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41684   // get_name_2:  com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41684   // get_Name:    com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41684   // getName->1:     // getName->2:     // getName->N:     // ofs = 41684 ord = 2 addr = 0
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	ifne Label6
	iconst_1 
	ireturn 
Label6:
	iconst_0 
	ireturn 
	}


public final deleteAllContent( com.whatsapp.client.ContactDetailScreen$SectionFieldManager ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41684   // get_name_1:  com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41684   // get_name_2:  com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41684   // get_Name:    com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41684   // getName->1:     // getName->2:     // getName->N:     // ofs = 41684 ord = 2 addr = 0
	invokevirtual deleteAll( net.rim.device.api.ui.Manager ) // pc=1
	return 
	}


public final addContentRow( com.whatsapp.client.ContactDetailScreen$SectionFieldManager, net.rim.device.api.ui.Field ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41684   // get_name_1:  com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41684   // get_name_2:  com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41684   // get_Name:    com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41684   // getName->1:     // getName->2:     // getName->N:     // ofs = 41684 ord = 2 addr = 0
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	ifle Label8
	iconst_1 
	goto Label9
Label8:
	iconst_0 
Label9:
	invokenonvirtual com.whatsapp.client.ContactDetailScreen$SectionFieldManager.addContentRow // pc=3
	return 
	}


public final addContentRow( com.whatsapp.client.ContactDetailScreen$SectionFieldManager, java.lang.String, net.rim.device.api.ui.Field ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	aload_2 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41684   // get_name_1:  com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41684   // get_name_2:  com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41684   // get_Name:    com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41684   // getName->1:     // getName->2:     // getName->N:     // ofs = 41684 ord = 2 addr = 0
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	ifle Label9
	iconst_1 
	goto Label10
Label9:
	iconst_0 
Label10:
	iconst_0 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41676   // get_name_1:  com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41676   // get_name_2:  com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41676   // get_Name:    com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41676   // getName->1:     // getName->2:     // getName->N:     // ofs = 41676 ord = 0 addr = 0
	ifne Label15
	iconst_1 
	goto Label16
Label15:
	iconst_0 
Label16:
	invokenonvirtual com.whatsapp.client.ContactDetailScreen$SectionFieldManager.addContentRow // pc=6
	return 
	}


public final addContentRow( com.whatsapp.client.ContactDetailScreen$SectionFieldManager, java.lang.String, net.rim.device.api.ui.Field, boolean, boolean, boolean ); // address: 0
	{
	enter 
	new_lib com.whatsapp.field.ColorLabelField//com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField
	dup 
	aload_1 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41688   // get_name_1:  com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41688   // get_name_2:  com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41688   // get_Name:    com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41688   // getName->1:     // getName->2:     // getName->N:     // ofs = 41688 ord = 3 addr = 0
	lipush 36028797018963968
	invokespecial_lib .routine_5006 // pc=5
	astore_6 
	aload_2 
	invokevirtual long getStyle( net.rim.device.api.ui.Field ) // pc=1
	lipush 4410931412992
	land 
	iconst_0 
	i2l 
	lcmp 
	ifeq Label26
	new_lib net.rim.device.api.ui.Font//net.rim.device.api.ui.Font net.rim.device.api.ui.Font net.rim.device.api.ui.Font
	dup 
	lipush 1152921504606846976
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.<init> // pc=3
	astore_7 
	aload_7 
	aload_2 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_7 
	astore_2 
Label26:
	new_lib Integer//java.lang.Integer java.lang.Integer java.lang.Integer
	dup 
	lipush 1152921504606846976
	invokespecial_lib net.rim.device.api.ui.container.HorizontalFieldManager.<init> // pc=3
	astore_7 
	aload_7 
	aload_6 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_7 
	aload_2 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	iload_3 
	ifne Label47
	iload_4 
	ifeq Label47
	aload_6 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	invokevirtual int getAscent( net.rim.device.api.ui.Font ) // pc=1
	iconst_1 
	iushr 
	goto Label48
Label47:
	iconst_0 
Label48:
	istore 8
	iload_5 
	ifeq Label53
	bipush 16
	goto Label54
Label53:
	iconst_0 
Label54:
	istore 9
	aload_7 
	iload 8
	iload 9
	iconst_0 
	iload 9
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	aload_7 
	iload_3 
	invokenonvirtual com.whatsapp.client.ContactDetailScreen$SectionFieldManager.addContentRow // pc=3
	return 
	}


public final addContentRow( com.whatsapp.client.ContactDetailScreen$SectionFieldManager, net.rim.device.api.ui.Field, boolean ); // address: 0
	{
	enter 
	iload_2 
	ifeq Label26
	new_lib com.whatsapp.field.ShadedSeparator//com.whatsapp.field.ShadedSeparator com.whatsapp.field.ShadedSeparator com.whatsapp.field.ShadedSeparator
	dup 
	invokespecial_lib .routine_8398 // pc=1
	astore_3 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	invokevirtual int getAscent( net.rim.device.api.ui.Font ) // pc=1
	istore_4 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41676   // get_name_1:  com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41676   // get_name_2:  com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41676   // get_Name:    com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41676   // getName->1:     // getName->2:     // getName->N:     // ofs = 41676 ord = 0 addr = 0
	ifeq Label15
	iconst_0 
	goto Label16
Label15:
	bipush 16
Label16:
	istore_5 
	aload_3 
	iload_4 
	iload_5 
	iload_4 
	iload_5 
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0_getfield com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41684   // get_name_1:  com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41684   // get_name_2:  com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41684   // get_Name:    com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41684   // getName->1:     // getName->2:     // getName->N:     // ofs = 41684 ord = 2 addr = 0
	aload_3 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
Label26:
	aload_0_getfield com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41684   // get_name_1:  com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41684   // get_name_2:  com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41684   // get_Name:    com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41684   // getName->1:     // getName->2:     // getName->N:     // ofs = 41684 ord = 2 addr = 0
	aload_1 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	return 
	}


public final int getSeparatedContentRowCount( com.whatsapp.client.ContactDetailScreen$SectionFieldManager ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41684   // get_name_1:  com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41684   // get_name_2:  com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41684   // get_Name:    com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41684   // getName->1:     // getName->2:     // getName->N:     // ofs = 41684 ord = 2 addr = 0
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	istore_2 
	iload_2 
	ifne Label10
	iconst_0 
	istore_1 
	iload_1 
	ireturn 
Label10:
	iload_2 
	iconst_1 
	if_icmpne Label17
	iconst_1 
	istore_1 
	iload_1 
	ireturn 
Label17:
	iconst_1 
	istore_1 
	iconst_1 
	istore_3 
Label21:
	iload_3 
	iload_2 
	if_icmpge Label32
	aload_0_getfield com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41684   // get_name_1:  com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41684   // get_name_2:  com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41684   // get_Name:    com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41684   // getName->1:     // getName->2:     // getName->N:     // ofs = 41684 ord = 2 addr = 0
	iload_3 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	instanceof_lib com.whatsapp.field.ShadedSeparator//com.whatsapp.field.ShadedSeparator com.whatsapp.field.ShadedSeparator com.whatsapp.field.ShadedSeparator
	ifeq Label30
	iinc 1 1
Label30:
	iinc 3 1
	goto Label21
Label32:
	iload_1 
	ireturn 
	}


public final updateStyle( com.whatsapp.client.ContactDetailScreen$SectionFieldManager ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual int getIndex( net.rim.device.api.ui.Field ) // pc=1
	istore_1 
	aload_0 
	iload_1 
	iconst_1 
	if_icmple Label10
	getstatic com.whatsapp.client.ContactDetailScreen$SectionFieldManager.field_41692 // ContactDetailScreen$SectionFieldManager
	goto Label11
Label10:
	aconst_null 
Label11:
	invokevirtual setBorder( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Border ) // pc=2
	aload_0 
	iload_1 
	bipush 2
	irem 
	ifne Label20
	iipush 16777215
	invokestatic_lib net.rim.device.api.ui.decor.Background createSolidBackground( int ) // BackgroundFactory
	goto Label21
Label20:
	aconst_null 
Label21:
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	return 
	}

}
