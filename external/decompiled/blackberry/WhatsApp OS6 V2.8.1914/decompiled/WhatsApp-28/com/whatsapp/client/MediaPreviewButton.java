// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-40.cod
// Module version  : 2.8.1914
// Class ID        : 5
// ########################################################


package com.whatsapp.client;


abstract public final class MediaPreviewButton extends net.rim.device.api.ui.Field

{
	// @@@@@@@@@@@@@ Static fields 
	private final static int /*int*/  field_54392 ; // ofs = 54392 addr = 14)
	private static net.rim.device.api.system.Bitmap /*net.rim.device.api.system.Bitmap*/  field_54398 ; // ofs = 54398 addr = 15)
	private static net.rim.device.api.system.Bitmap /*net.rim.device.api.system.Bitmap*/  field_54404 ; // ofs = 54404 addr = 16)

	// @@@@@@@@@@@@@ Fields 
	private final java.util.Vector /*java.util.Vector*/  field_54368 ; // ofs = 54368 addr = 0)
	private final int /*int*/  field_54372 ; // ofs = 54372 addr = 0)
	private String /*java.lang.String*/  field_54376 ; // ofs = 54376 addr = 0)
	private final int /*int*/  field_54380 ; // ofs = 54380 addr = 0)
	private net.rim.device.api.ui.decor.Background /*net.rim.device.api.ui.decor.Background*/  field_54384 ; // ofs = 54384 addr = 0)
	private net.rim.device.api.util.IntHashtable /*net.rim.device.api.util.IntHashtable*/  field_54388 ; // ofs = 54388 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.MediaPreviewButton ); // address: 0
	{
	enter 
	aload_0 
	bipush 6
	aconst_null 
	bipush -1
	invokespecial com.whatsapp.client.MediaPreviewButton.<init> // pc=4
	return 
	}


public <init>( com.whatsapp.client.MediaPreviewButton, int, java.lang.String, int ); // address: 0
	{
	enter 
	aload_0 
	lipush 18014398509481984
	invokespecial_lib net.rim.device.api.ui.Field.<init> // pc=3
	aload_0 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield com.whatsapp.client.MediaPreviewButton.field_54368   // get_name_1:  com.whatsapp.client.MediaPreviewButton.field_54368   // get_name_2:  com.whatsapp.client.MediaPreviewButton.field_54368   // get_Name:    com.whatsapp.client.MediaPreviewButton.field_54368   // getName->1:     // getName->2:     // getName->N:     // ofs = 54368 ord = 0 addr = 0
	aload_0 
	iload_1 
	putfield com.whatsapp.client.MediaPreviewButton.field_54372   // get_name_1:  com.whatsapp.client.MediaPreviewButton.field_54372   // get_name_2:  com.whatsapp.client.MediaPreviewButton.field_54372   // get_Name:    com.whatsapp.client.MediaPreviewButton.field_54372   // getName->1:     // getName->2:     // getName->N:     // ofs = 54372 ord = 1 addr = 0
	aload_0 
	aload_2 
	putfield com.whatsapp.client.MediaPreviewButton.field_54376   // get_name_1:  com.whatsapp.client.MediaPreviewButton.field_54376   // get_name_2:  com.whatsapp.client.MediaPreviewButton.field_54376   // get_Name:    com.whatsapp.client.MediaPreviewButton.field_54376   // getName->1:     // getName->2:     // getName->N:     // ofs = 54376 ord = 2 addr = 0
	aload_0 
	iload_3 
	putfield com.whatsapp.client.MediaPreviewButton.field_54380   // get_name_1:  com.whatsapp.client.MediaPreviewButton.field_54380   // get_name_2:  com.whatsapp.client.MediaPreviewButton.field_54380   // get_Name:    com.whatsapp.client.MediaPreviewButton.field_54380   // getName->1:     // getName->2:     // getName->N:     // ofs = 54380 ord = 3 addr = 0
	return 
	}


static public final int getPreferredHeightWithThumbs(  ); // address: 0
	{
	enter_narrow 
	getstatic com.whatsapp.client.MediaPreviewButton.field_54392 // MediaPreviewButton
	bipush 12
	iadd 
	ireturn 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	clinit_lib net.rim.device.api.ui.Graphics//net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics
	synch_static MediaPreviewButton
	clinit_wait 
	getstatic_lib module:WhatsApp-20.class#0.static_2 // class#0
	putstatic com.whatsapp.client.MediaPreviewButton.field_54392 // MediaPreviewButton
	getstatic_lib module:WhatsApp-31.class#0.static_10 // class#0
	invokestatic_lib module:WhatsApp-79.class#39.routine_21621(  ) // class#39
	putstatic com.whatsapp.client.MediaPreviewButton.field_54398 // MediaPreviewButton
	getstatic_lib module:WhatsApp-31.class#0.static_11 // class#0
	invokestatic_lib module:WhatsApp-79.class#39.routine_21621(  ) // class#39
	putstatic com.whatsapp.client.MediaPreviewButton.field_54404 // MediaPreviewButton
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final int com.whatsapp.client.MediaPreviewButton.routine_4220( com.whatsapp.client.MediaPreviewButton ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	invokespecial com.whatsapp.client.MediaPreviewButton.routine_4246 // pc=2
	ireturn 
	}


private final int com.whatsapp.client.MediaPreviewButton.routine_4246( com.whatsapp.client.MediaPreviewButton, int ); // address: 0
	{
	enter 
	iload_1 
	aload_0_getfield com.whatsapp.client.MediaPreviewButton.field_54372   // get_name_1:  com.whatsapp.client.MediaPreviewButton.field_54372   // get_name_2:  com.whatsapp.client.MediaPreviewButton.field_54372   // get_Name:    com.whatsapp.client.MediaPreviewButton.field_54372   // getName->1:     // getName->2:     // getName->N:     // ofs = 54372 ord = 1 addr = 0
	isub 
	aload_0 
	invokenonvirtual com.whatsapp.client.MediaPreviewButton.getPreferredHeight // pc=1
	iconst_1 
	iushr 
	isub 
	bipush 6
	isub 
	istore_2 
	aload_0_getfield com.whatsapp.client.MediaPreviewButton.field_54376   // get_name_1:  com.whatsapp.client.MediaPreviewButton.field_54376   // get_name_2:  com.whatsapp.client.MediaPreviewButton.field_54376   // get_Name:    com.whatsapp.client.MediaPreviewButton.field_54376   // getName->1:     // getName->2:     // getName->N:     // ofs = 54376 ord = 2 addr = 0
	ifnull Label25
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	astore_3 
	iload_2 
	aload_3 
	aload_0_getfield com.whatsapp.client.MediaPreviewButton.field_54376   // get_name_1:  com.whatsapp.client.MediaPreviewButton.field_54376   // get_name_2:  com.whatsapp.client.MediaPreviewButton.field_54376   // get_Name:    com.whatsapp.client.MediaPreviewButton.field_54376   // getName->1:     // getName->2:     // getName->N:     // ofs = 54376 ord = 2 addr = 0
	invokevirtual int getAdvance( net.rim.device.api.ui.Font, java.lang.String ) // pc=2
	bipush 6
	iadd 
	isub 
	istore_2 
Label25:
	iload_2 
	ifle Label33
	iload_2 
	getstatic com.whatsapp.client.MediaPreviewButton.field_54392 // MediaPreviewButton
	bipush 6
	iadd 
	idiv 
	ireturn 
Label33:
	iconst_0 
	ireturn 
	}


private final net.rim.device.api.system.Bitmap com.whatsapp.client.MediaPreviewButton.routine_4314( com.whatsapp.client.MediaPreviewButton, byte ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.MediaPreviewButton.field_54388   // get_name_1:  com.whatsapp.client.MediaPreviewButton.field_54388   // get_name_2:  com.whatsapp.client.MediaPreviewButton.field_54388   // get_Name:    com.whatsapp.client.MediaPreviewButton.field_54388   // getName->1:     // getName->2:     // getName->N:     // ofs = 54388 ord = 5 addr = 0
	ifnonnull Label11
	aload_0 
	new_lib net.rim.device.api.system.Application//net.rim.device.api.system.Application net.rim.device.api.system.Application net.rim.device.api.system.Application
	dup 
	invokespecial_lib net.rim.device.api.util.IntHashtable.<init> // pc=1
	putfield com.whatsapp.client.MediaPreviewButton.field_54388   // get_name_1:  com.whatsapp.client.MediaPreviewButton.field_54388   // get_name_2:  com.whatsapp.client.MediaPreviewButton.field_54388   // get_Name:    com.whatsapp.client.MediaPreviewButton.field_54388   // getName->1:     // getName->2:     // getName->N:     // ofs = 54388 ord = 5 addr = 0
	aconst_null 
	astore_2 
	goto Label16
Label11:
	aload_0_getfield com.whatsapp.client.MediaPreviewButton.field_54388   // get_name_1:  com.whatsapp.client.MediaPreviewButton.field_54388   // get_name_2:  com.whatsapp.client.MediaPreviewButton.field_54388   // get_Name:    com.whatsapp.client.MediaPreviewButton.field_54388   // getName->1:     // getName->2:     // getName->N:     // ofs = 54388 ord = 5 addr = 0
	iload_1 
	invokevirtual java.lang.Object get( net.rim.device.api.util.IntHashtable, int ) // pc=2
	checkcast_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	astore_2 
Label16:
	aload_2 
	ifnonnull Label27
	aload_0 
	iload_1 
	invokespecial com.whatsapp.client.MediaPreviewButton.routine_4381 // pc=2
	astore_2 
	aload_0_getfield com.whatsapp.client.MediaPreviewButton.field_54388   // get_name_1:  com.whatsapp.client.MediaPreviewButton.field_54388   // get_name_2:  com.whatsapp.client.MediaPreviewButton.field_54388   // get_Name:    com.whatsapp.client.MediaPreviewButton.field_54388   // getName->1:     // getName->2:     // getName->N:     // ofs = 54388 ord = 5 addr = 0
	iload_1 
	aload_2 
	invokevirtual java.lang.Object put( net.rim.device.api.util.IntHashtable, int, java.lang.Object ) // pc=3
	pop 
Label27:
	aload_2 
	areturn 
	}


private final net.rim.device.api.system.Bitmap com.whatsapp.client.MediaPreviewButton.routine_4381( com.whatsapp.client.MediaPreviewButton, byte ); // address: 0
	{
	enter 
	iload_1 
	tableswitch  :
		
		
		

Label3:
	getstatic_lib module:WhatsApp-31.class#0.static_59 // class#0
	invokestatic_lib module:WhatsApp-58.class#1.routine_1287(  ) // class#1
	astore_2 
	goto Label17
Label7:
	getstatic_lib module:WhatsApp-31.class#0.static_60 // class#0
	invokestatic_lib module:WhatsApp-58.class#1.routine_1287(  ) // class#1
	astore_2 
	goto Label17
Label11:
	new_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	dup 
	getstatic com.whatsapp.client.MediaPreviewButton.field_54392 // MediaPreviewButton
	getstatic com.whatsapp.client.MediaPreviewButton.field_54392 // MediaPreviewButton
	invokespecial_lib net.rim.device.api.system.Bitmap.<init> // pc=3
	areturn 
Label17:
	invokestatic_lib module:WhatsApp-60.class#2.routine_1442(  ) // class#2
	istore_3 
	aload_2 
	getstatic com.whatsapp.client.MediaPreviewButton.field_54392 // MediaPreviewButton
	iload_3 
	isub 
	getstatic com.whatsapp.client.MediaPreviewButton.field_54392 // MediaPreviewButton
	iload_3 
	isub 
	getstatic_lib module:WhatsApp-58.class#1.static_15 // class#1
	getstatic_lib module:WhatsApp-58.class#1.static_14 // class#1
	invokestatic_lib module:WhatsApp-58.class#1.routine_1744(  ) // class#1
	astore_2 
	new_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	dup 
	getstatic com.whatsapp.client.MediaPreviewButton.field_54392 // MediaPreviewButton
	getstatic com.whatsapp.client.MediaPreviewButton.field_54392 // MediaPreviewButton
	invokespecial_lib net.rim.device.api.system.Bitmap.<init> // pc=3
	astore_4 
	aload_4 
	invokestatic_lib module:WhatsApp-60.class#2.routine_3149(  ) // class#2
	astore_5 
	aload_0_getfield com.whatsapp.client.MediaPreviewButton.field_54384   // get_name_1:  com.whatsapp.client.MediaPreviewButton.field_54384   // get_name_2:  com.whatsapp.client.MediaPreviewButton.field_54384   // get_Name:    com.whatsapp.client.MediaPreviewButton.field_54384   // getName->1:     // getName->2:     // getName->N:     // ofs = 54384 ord = 4 addr = 0
	ifnonnull Label46
	aload_0 
	iipush 16579836
	iipush 14474460
	invokestatic_lib module:WhatsApp-52.class#1.routine_876(  ) // class#1
	putfield com.whatsapp.client.MediaPreviewButton.field_54384   // get_name_1:  com.whatsapp.client.MediaPreviewButton.field_54384   // get_name_2:  com.whatsapp.client.MediaPreviewButton.field_54384   // get_Name:    com.whatsapp.client.MediaPreviewButton.field_54384   // getName->1:     // getName->2:     // getName->N:     // ofs = 54384 ord = 4 addr = 0
Label46:
	aload_0_getfield com.whatsapp.client.MediaPreviewButton.field_54384   // get_name_1:  com.whatsapp.client.MediaPreviewButton.field_54384   // get_name_2:  com.whatsapp.client.MediaPreviewButton.field_54384   // get_Name:    com.whatsapp.client.MediaPreviewButton.field_54384   // getName->1:     // getName->2:     // getName->N:     // ofs = 54384 ord = 4 addr = 0
	aload_5 
	aload_5 
	invokevirtual net.rim.device.api.ui.XYRect getClippingRect( net.rim.device.api.ui.Graphics ) // pc=1
	invokevirtual draw( net.rim.device.api.ui.decor.Background, net.rim.device.api.ui.Graphics, net.rim.device.api.ui.XYRect ) // pc=3
	aload_5 
	bipush -97
	iload_3 
	iconst_1 
	iushr 
	iload_3 
	iconst_1 
	iushr 
	aload_2 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_2 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	aload_2 
	iconst_0 
	iconst_0 
	invokevirtual rop( net.rim.device.api.ui.Graphics, int, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=9
	aload_4 
	areturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final setLabelText( com.whatsapp.client.MediaPreviewButton, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	putfield com.whatsapp.client.MediaPreviewButton.field_54376   // get_name_1:  com.whatsapp.client.MediaPreviewButton.field_54376   // get_name_2:  com.whatsapp.client.MediaPreviewButton.field_54376   // get_Name:    com.whatsapp.client.MediaPreviewButton.field_54376   // getName->1:     // getName->2:     // getName->N:     // ofs = 54376 ord = 2 addr = 0
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Field ) // pc=1
	return 
	}


public final int getPreferredMessageCount( com.whatsapp.client.MediaPreviewButton ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokestatic_lib module:WhatsApp-60.class#2.routine_2749(  ) // class#2
	invokespecial com.whatsapp.client.MediaPreviewButton.routine_4246 // pc=2
	ireturn 
	}


public final setMessages( com.whatsapp.client.MediaPreviewButton, java.util.Vector ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.MediaPreviewButton.field_54368   // get_name_1:  com.whatsapp.client.MediaPreviewButton.field_54368   // get_name_2:  com.whatsapp.client.MediaPreviewButton.field_54368   // get_Name:    com.whatsapp.client.MediaPreviewButton.field_54368   // getName->1:     // getName->2:     // getName->N:     // ofs = 54368 ord = 0 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	ifle Label6
	iconst_1 
	goto Label7
Label6:
	iconst_0 
Label7:
	istore_2 
	aload_0_getfield com.whatsapp.client.MediaPreviewButton.field_54368   // get_name_1:  com.whatsapp.client.MediaPreviewButton.field_54368   // get_name_2:  com.whatsapp.client.MediaPreviewButton.field_54368   // get_Name:    com.whatsapp.client.MediaPreviewButton.field_54368   // getName->1:     // getName->2:     // getName->N:     // ofs = 54368 ord = 0 addr = 0
	invokevirtual removeAllElements( java.util.Vector ) // pc=1
	aload_1 
	ifnonnull Label13
	return 
Label13:
	aload_1 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_3 
	iconst_0 
	istore_4 
Label18:
	iload_4 
	iload_3 
	if_icmpge Label58
	aload_1 
	iload_4 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-26.class#23 module:WhatsApp-26.class#23 module:WhatsApp-26.class#23
	astore_5 
	aload_5 
	getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	checkcastbranch_lib 
	astore_6 
	aload_6 
	invokenonvirtual_lib .routine_9 // pc=1
	astore_7 
	aload_7 
	ifnull Label38
	aload_6 
	invokenonvirtual_lib .routine_39 // pc=1
	ifeq Label44
Label38:
	aload_0 
	aload_5 
	getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	invokespecial com.whatsapp.client.MediaPreviewButton.routine_4314 // pc=2
	astore 8
	goto Label51
Label44:
	aload_7 
	getstatic com.whatsapp.client.MediaPreviewButton.field_54392 // MediaPreviewButton
	getstatic com.whatsapp.client.MediaPreviewButton.field_54392 // MediaPreviewButton
	getstatic_lib module:WhatsApp-58.class#1.static_15 // class#1
	getstatic_lib module:WhatsApp-58.class#1.static_13 // class#1
	invokestatic_lib module:WhatsApp-58.class#1.routine_1682(  ) // class#1
	astore 8
Label51:
	aload 8
	invokestatic_lib module:WhatsApp-60.class#2.routine_1414(  ) // class#2
	aload_0_getfield com.whatsapp.client.MediaPreviewButton.field_54368   // get_name_1:  com.whatsapp.client.MediaPreviewButton.field_54368   // get_name_2:  com.whatsapp.client.MediaPreviewButton.field_54368   // get_Name:    com.whatsapp.client.MediaPreviewButton.field_54368   // getName->1:     // getName->2:     // getName->N:     // ofs = 54368 ord = 0 addr = 0
	aload 8
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label56:
	iinc 4 1
	goto Label18
Label58:
	aload_0_getfield com.whatsapp.client.MediaPreviewButton.field_54368   // get_name_1:  com.whatsapp.client.MediaPreviewButton.field_54368   // get_name_2:  com.whatsapp.client.MediaPreviewButton.field_54368   // get_Name:    com.whatsapp.client.MediaPreviewButton.field_54368   // getName->1:     // getName->2:     // getName->N:     // ofs = 54368 ord = 0 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	ifle Label63
	iconst_1 
	goto Label64
Label63:
	iconst_0 
Label64:
	istore_4 
	iload_2 
	iload_4 
	if_icmpeq Label71
	aload_0 
	invokevirtual updateLayout( net.rim.device.api.ui.Field ) // pc=1
	return 
Label71:
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Field ) // pc=1
	return 
	}


public final int getPreferredWidth( com.whatsapp.client.MediaPreviewButton ); // address: 0
	{
	enter_narrow 
	invokestatic_lib int getWidth(  ) // Display
	ireturn 
	}


public final boolean isFocusable( com.whatsapp.client.MediaPreviewButton ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib net.rim.device.api.ui.Field.isFocusable // pc=1
	ifeq Label9
	aload_0_getfield com.whatsapp.client.MediaPreviewButton.field_54368   // get_name_1:  com.whatsapp.client.MediaPreviewButton.field_54368   // get_name_2:  com.whatsapp.client.MediaPreviewButton.field_54368   // get_Name:    com.whatsapp.client.MediaPreviewButton.field_54368   // getName->1:     // getName->2:     // getName->N:     // ofs = 54368 ord = 0 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	ifle Label9
	iconst_1 
	ireturn 
Label9:
	iconst_0 
	ireturn 
	}


public final int getPreferredHeight( com.whatsapp.client.MediaPreviewButton ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.MediaPreviewButton.field_54368   // get_name_1:  com.whatsapp.client.MediaPreviewButton.field_54368   // get_name_2:  com.whatsapp.client.MediaPreviewButton.field_54368   // get_Name:    com.whatsapp.client.MediaPreviewButton.field_54368   // getName->1:     // getName->2:     // getName->N:     // ofs = 54368 ord = 0 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	ifle Label6
	invokestatic int getPreferredHeightWithThumbs(  ) // MediaPreviewButton
	ireturn 
Label6:
	aload_0_getfield com.whatsapp.client.MediaPreviewButton.field_54376   // get_name_1:  com.whatsapp.client.MediaPreviewButton.field_54376   // get_name_2:  com.whatsapp.client.MediaPreviewButton.field_54376   // get_Name:    com.whatsapp.client.MediaPreviewButton.field_54376   // getName->1:     // getName->2:     // getName->N:     // ofs = 54376 ord = 2 addr = 0
	ifnull Label12
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	ireturn 
Label12:
	iconst_0 
	ireturn 
	}


protected final boolean navigationClick( com.whatsapp.client.MediaPreviewButton, int, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_0 
	invokevirtual fieldChangeNotify( net.rim.device.api.ui.Field, int ) // pc=2
	iconst_1 
	ireturn 
	}


protected final layout( com.whatsapp.client.MediaPreviewButton, int, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	aload_0 
	invokenonvirtual com.whatsapp.client.MediaPreviewButton.getPreferredHeight // pc=1
	invokevirtual setExtent( net.rim.device.api.ui.Field, int, int ) // pc=3
	return 
	}


protected final paint( com.whatsapp.client.MediaPreviewButton, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter 
	aload_1 
	bipush 8
	invokevirtual boolean isDrawingStyleSet( net.rim.device.api.ui.Graphics, int ) // pc=2
	istore_2 
	new_lib Runnable//java.lang.Runnable java.lang.Runnable java.lang.Runnable
	dup 
	aload_0_getfield com.whatsapp.client.MediaPreviewButton.field_54372   // get_name_1:  com.whatsapp.client.MediaPreviewButton.field_54372   // get_name_2:  com.whatsapp.client.MediaPreviewButton.field_54372   // get_Name:    com.whatsapp.client.MediaPreviewButton.field_54372   // getName->1:     // getName->2:     // getName->N:     // ofs = 54372 ord = 1 addr = 0
	bipush 6
	iconst_0 
	iconst_0 
	invokespecial_lib net.rim.device.api.ui.XYRect.<init> // pc=5
	astore_3 
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	iconst_1 
	iushr 
	istore_4 
	aload_0 
	invokespecial com.whatsapp.client.MediaPreviewButton.routine_4220 // pc=1
	istore_5 
	aload_0_getfield com.whatsapp.client.MediaPreviewButton.field_54368   // get_name_1:  com.whatsapp.client.MediaPreviewButton.field_54368   // get_name_2:  com.whatsapp.client.MediaPreviewButton.field_54368   // get_Name:    com.whatsapp.client.MediaPreviewButton.field_54368   // getName->1:     // getName->2:     // getName->N:     // ofs = 54368 ord = 0 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	iload_5 
	invokestatic_lib int min( int, int ) // Math
	istore_6 
	aload_0_getfield com.whatsapp.client.MediaPreviewButton.field_54376   // get_name_1:  com.whatsapp.client.MediaPreviewButton.field_54376   // get_name_2:  com.whatsapp.client.MediaPreviewButton.field_54376   // get_Name:    com.whatsapp.client.MediaPreviewButton.field_54376   // getName->1:     // getName->2:     // getName->N:     // ofs = 54376 ord = 2 addr = 0
	ifnonnull Label29
	goto_w Label100
Label29:
	aload_1 
	invokevirtual int getColor( net.rim.device.api.ui.Graphics ) // pc=1
	istore_7 
	iload_2 
	ifne Label40
	aload_0_getfield com.whatsapp.client.MediaPreviewButton.field_54380   // get_name_1:  com.whatsapp.client.MediaPreviewButton.field_54380   // get_name_2:  com.whatsapp.client.MediaPreviewButton.field_54380   // get_Name:    com.whatsapp.client.MediaPreviewButton.field_54380   // getName->1:     // getName->2:     // getName->N:     // ofs = 54380 ord = 3 addr = 0
	bipush -1
	if_icmpeq Label40
	aload_1 
	aload_0_getfield com.whatsapp.client.MediaPreviewButton.field_54380   // get_name_1:  com.whatsapp.client.MediaPreviewButton.field_54380   // get_name_2:  com.whatsapp.client.MediaPreviewButton.field_54380   // get_Name:    com.whatsapp.client.MediaPreviewButton.field_54380   // getName->1:     // getName->2:     // getName->N:     // ofs = 54380 ord = 3 addr = 0
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
Label40:
	aload_1 
	aload_0_getfield com.whatsapp.client.MediaPreviewButton.field_54376   // get_name_1:  com.whatsapp.client.MediaPreviewButton.field_54376   // get_name_2:  com.whatsapp.client.MediaPreviewButton.field_54376   // get_Name:    com.whatsapp.client.MediaPreviewButton.field_54376   // getName->1:     // getName->2:     // getName->N:     // ofs = 54376 ord = 2 addr = 0
	aload_3 
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 0 addr = -1
	iload_4 
	bipush 32
	invokevirtual int drawText( net.rim.device.api.ui.Graphics, java.lang.String, int, int, int ) // pc=5
	pop 
	aload_1 
	iload_7 
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	iload_6 
	ifgt Label54
	goto_w Label135
Label54:
	aload_3 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	iload_4 
	isub 
	bipush 6
	isub 
	getstatic com.whatsapp.client.MediaPreviewButton.field_54392 // MediaPreviewButton
	isub 
	putfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 0 addr = -1
	iload_6 
	iconst_1 
	isub 
	istore 8
Label68:
	iload 8
	iflt Label135
	aload_0_getfield com.whatsapp.client.MediaPreviewButton.field_54368   // get_name_1:  com.whatsapp.client.MediaPreviewButton.field_54368   // get_name_2:  com.whatsapp.client.MediaPreviewButton.field_54368   // get_Name:    com.whatsapp.client.MediaPreviewButton.field_54368   // getName->1:     // getName->2:     // getName->N:     // ofs = 54368 ord = 0 addr = 0
	iload 8
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	astore 9
	aload_3 
	aload 9
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	putfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 1 addr = -1
	aload_3 
	aload 9
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	putfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 2 addr = -1
	aload_1 
	aload_3 
	aload 9
	iconst_0 
	iconst_0 
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, net.rim.device.api.ui.XYRect, net.rim.device.api.system.Bitmap, int, int ) // pc=5
	aload_3 
	dup 
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 0 addr = -1
	aload_3 
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 1 addr = -1
	bipush 6
	iadd 
	isub 
	putfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 0 addr = -1
	iinc 8 -1
	goto Label68
Label100:
	iconst_0 
	istore_7 
Label102:
	iload_7 
	iload_6 
	if_icmpge Label135
	aload_0_getfield com.whatsapp.client.MediaPreviewButton.field_54368   // get_name_1:  com.whatsapp.client.MediaPreviewButton.field_54368   // get_name_2:  com.whatsapp.client.MediaPreviewButton.field_54368   // get_Name:    com.whatsapp.client.MediaPreviewButton.field_54368   // getName->1:     // getName->2:     // getName->N:     // ofs = 54368 ord = 0 addr = 0
	iload_7 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	astore 8
	aload_3 
	aload 8
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	putfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 1 addr = -1
	aload_3 
	aload 8
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	putfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 2 addr = -1
	aload_1 
	aload_3 
	aload 8
	iconst_0 
	iconst_0 
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, net.rim.device.api.ui.XYRect, net.rim.device.api.system.Bitmap, int, int ) // pc=5
	aload_3 
	dup 
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 0 addr = -1
	aload_3 
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 1 addr = -1
	bipush 6
	iadd 
	iadd 
	putfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 0 addr = -1
	iinc 7 1
	goto Label102
Label135:
	iload_6 
	ifle Label162
	iload_2 
	ifeq Label141
	getstatic com.whatsapp.client.MediaPreviewButton.field_54404 // MediaPreviewButton
	goto Label142
Label141:
	getstatic com.whatsapp.client.MediaPreviewButton.field_54398 // MediaPreviewButton
Label142:
	astore_7 
	aload_1 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	iload_4 
	isub 
	iload_4 
	aload_7 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	iconst_1 
	iushr 
	isub 
	aload_7 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_7 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	aload_7 
	iconst_0 
	iconst_0 
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=8
Label162:
	return 
	}

}
