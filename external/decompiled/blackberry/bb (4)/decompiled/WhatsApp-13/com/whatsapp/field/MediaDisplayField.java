// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-38.cod
// Module version  : 2.7.3204
// Class ID        : 1
// ########################################################


package com.whatsapp.field;


abstract public final class MediaDisplayField extends net.rim.device.api.ui.Field

{
	// @@@@@@@@@@@@@ Static fields 
	private final static int[] /*int[]*/  field_52490 ; // ofs = 52490 addr = 4)
	private final static net.rim.device.api.util.IntHashtable /*net.rim.device.api.util.IntHashtable*/  field_52496 ; // ofs = 52496 addr = 5)

	// @@@@@@@@@@@@@ Fields 
	private net.rim.device.api.system.Bitmap /*net.rim.device.api.system.Bitmap*/  field_52390 ; // ofs = 52390 addr = 0)
	private net.rim.device.api.system.Bitmap /*net.rim.device.api.system.Bitmap*/  field_52394 ; // ofs = 52394 addr = 0)
	private boolean /*boolean*/  field_52398 ; // ofs = 52398 addr = 0)
	private net.rim.device.api.system.Bitmap /*net.rim.device.api.system.Bitmap*/  field_52402 ; // ofs = 52402 addr = 0)
	private boolean /*boolean*/  field_52406 ; // ofs = 52406 addr = 0)
	private final boolean /*boolean*/  field_52410 ; // ofs = 52410 addr = 0)
	private String /*java.lang.String*/  field_52414 ; // ofs = 52414 addr = 0)
	private boolean /*boolean*/  field_52418 ; // ofs = 52418 addr = 0)
	private String /*java.lang.String*/  field_52422 ; // ofs = 52422 addr = 0)
	private net.rim.device.api.ui.Font /*net.rim.device.api.ui.Font*/  field_52426 ; // ofs = 52426 addr = 0)
	private net.rim.device.api.ui.Font /*net.rim.device.api.ui.Font*/  field_52430 ; // ofs = 52430 addr = 0)
	private boolean /*boolean*/  field_52434 ; // ofs = 52434 addr = 0)
	private int /*int*/  field_52438 ; // ofs = 52438 addr = 0)
	private final net.rim.device.api.ui.XYRect /*net.rim.device.api.ui.XYRect*/  field_52442 ; // ofs = 52442 addr = 0)
	private final net.rim.device.api.ui.XYRect /*net.rim.device.api.ui.XYRect*/  field_52446 ; // ofs = 52446 addr = 0)
	private final net.rim.device.api.ui.XYRect /*net.rim.device.api.ui.XYRect*/  field_52450 ; // ofs = 52450 addr = 0)
	private final net.rim.device.api.ui.XYRect /*net.rim.device.api.ui.XYRect*/  field_52454 ; // ofs = 52454 addr = 0)
	private final net.rim.device.api.ui.XYRect /*net.rim.device.api.ui.XYRect*/  field_52458 ; // ofs = 52458 addr = 0)
	private final net.rim.device.api.ui.XYRect /*net.rim.device.api.ui.XYRect*/  field_52462 ; // ofs = 52462 addr = 0)
	private final net.rim.device.api.ui.XYRect /*net.rim.device.api.ui.XYRect*/  field_52466 ; // ofs = 52466 addr = 0)
	private final net.rim.device.api.ui.XYRect /*net.rim.device.api.ui.XYRect*/  field_52470 ; // ofs = 52470 addr = 0)
	private final net.rim.device.api.ui.XYRect /*net.rim.device.api.ui.XYRect*/  field_52474 ; // ofs = 52474 addr = 0)
	private boolean /*boolean*/  field_52478 ; // ofs = 52478 addr = 0)
	private net.rim.device.api.ui.Font /*net.rim.device.api.ui.Font*/  field_52482 ; // ofs = 52482 addr = 0)
	private boolean /*boolean*/  field_52486 ; // ofs = 52486 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.field.MediaDisplayField, net.rim.device.api.system.Bitmap, boolean ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	iload_2 
	aconst_null 
	iconst_0 
	aconst_null 
	iconst_1 
	invokespecial com.whatsapp.field.MediaDisplayField.<init> // pc=7
	return 
	}


public <init>( com.whatsapp.field.MediaDisplayField, net.rim.device.api.system.Bitmap, boolean, java.lang.String, boolean, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	iload_2 
	aload_3 
	iload_4 
	aload_5 
	iconst_0 
	invokespecial com.whatsapp.field.MediaDisplayField.<init> // pc=7
	return 
	}


private <init>( com.whatsapp.field.MediaDisplayField, net.rim.device.api.system.Bitmap, boolean, java.lang.String, boolean, java.lang.String, boolean ); // address: 0
	{
	enter 
	aload_0 
	lipush 18014398509481984
	iload_6 
	ifeq Label8
	iconst_0 
	i2l 
	goto Label9
Label8:
	lipush 1152921504606846976
Label9:
	lor 
	invokespecial_lib net.rim.device.api.ui.Field.<init> // pc=3
	aload_0 
	new_lib net.rim.device.api.ui.XYRect//net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect
	dup 
	invokespecial_lib net.rim.device.api.ui.XYRect.<init> // pc=1
	putfield com.whatsapp.field.MediaDisplayField.field_52442   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52442   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52442   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52442   // getName->1:     // getName->2:     // getName->N:     // ofs = 52442 ord = 13 addr = 0
	aload_0 
	new_lib net.rim.device.api.ui.XYRect//net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect
	dup 
	invokespecial_lib net.rim.device.api.ui.XYRect.<init> // pc=1
	putfield com.whatsapp.field.MediaDisplayField.field_52446   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52446   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52446   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52446   // getName->1:     // getName->2:     // getName->N:     // ofs = 52446 ord = 14 addr = 0
	aload_0 
	new_lib net.rim.device.api.ui.XYRect//net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect
	dup 
	invokespecial_lib net.rim.device.api.ui.XYRect.<init> // pc=1
	putfield com.whatsapp.field.MediaDisplayField.field_52450   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52450   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52450   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52450   // getName->1:     // getName->2:     // getName->N:     // ofs = 52450 ord = 15 addr = 0
	aload_0 
	new_lib net.rim.device.api.ui.XYRect//net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect
	dup 
	invokespecial_lib net.rim.device.api.ui.XYRect.<init> // pc=1
	putfield com.whatsapp.field.MediaDisplayField.field_52454   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52454   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52454   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52454   // getName->1:     // getName->2:     // getName->N:     // ofs = 52454 ord = 16 addr = 0
	aload_0 
	new_lib net.rim.device.api.ui.XYRect//net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect
	dup 
	invokespecial_lib net.rim.device.api.ui.XYRect.<init> // pc=1
	putfield com.whatsapp.field.MediaDisplayField.field_52458   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52458   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52458   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52458   // getName->1:     // getName->2:     // getName->N:     // ofs = 52458 ord = 17 addr = 0
	aload_0 
	new_lib net.rim.device.api.ui.XYRect//net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect
	dup 
	invokespecial_lib net.rim.device.api.ui.XYRect.<init> // pc=1
	putfield com.whatsapp.field.MediaDisplayField.field_52462   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52462   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52462   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52462   // getName->1:     // getName->2:     // getName->N:     // ofs = 52462 ord = 18 addr = 0
	aload_0 
	new_lib net.rim.device.api.ui.XYRect//net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect
	dup 
	invokespecial_lib net.rim.device.api.ui.XYRect.<init> // pc=1
	putfield com.whatsapp.field.MediaDisplayField.field_52466   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52466   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52466   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52466   // getName->1:     // getName->2:     // getName->N:     // ofs = 52466 ord = 19 addr = 0
	aload_0 
	new_lib net.rim.device.api.ui.XYRect//net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect
	dup 
	invokespecial_lib net.rim.device.api.ui.XYRect.<init> // pc=1
	putfield com.whatsapp.field.MediaDisplayField.field_52470   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52470   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52470   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52470   // getName->1:     // getName->2:     // getName->N:     // ofs = 52470 ord = 20 addr = 0
	aload_0 
	new_lib net.rim.device.api.ui.XYRect//net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect
	dup 
	invokespecial_lib net.rim.device.api.ui.XYRect.<init> // pc=1
	putfield com.whatsapp.field.MediaDisplayField.field_52474   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52474   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52474   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52474   // getName->1:     // getName->2:     // getName->N:     // ofs = 52474 ord = 21 addr = 0
	aload_1 
	ifnonnull Label67
	aload_0 
	new_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	dup 
	bipush 100
	bipush 100
	invokespecial_lib net.rim.device.api.system.Bitmap.<init> // pc=3
	invokestatic net.rim.device.api.system.Bitmap createThumbBitmap( net.rim.device.api.system.Bitmap ) // MediaDisplayField
	putfield com.whatsapp.field.MediaDisplayField.field_52402   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52402   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52402   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52402   // getName->1:     // getName->2:     // getName->N:     // ofs = 52402 ord = 3 addr = 0
	goto Label84
Label67:
	iload_2 
	ifeq Label78
	aload_0 
	aload_1 
	invokestatic net.rim.device.api.system.Bitmap createThumbBitmap( net.rim.device.api.system.Bitmap ) // MediaDisplayField
	putfield com.whatsapp.field.MediaDisplayField.field_52402   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52402   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52402   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52402   // getName->1:     // getName->2:     // getName->N:     // ofs = 52402 ord = 3 addr = 0
	aload_0 
	aload_1 
	invokevirtual boolean hasAlpha( net.rim.device.api.system.Bitmap ) // pc=1
	putfield com.whatsapp.field.MediaDisplayField.field_52406   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52406   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52406   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52406   // getName->1:     // getName->2:     // getName->N:     // ofs = 52406 ord = 4 addr = 0
	goto Label84
Label78:
	aload_0 
	aload_1 
	putfield com.whatsapp.field.MediaDisplayField.field_52402   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52402   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52402   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52402   // getName->1:     // getName->2:     // getName->N:     // ofs = 52402 ord = 3 addr = 0
	aload_0 
	iconst_1 
	putfield com.whatsapp.field.MediaDisplayField.field_52406   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52406   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52406   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52406   // getName->1:     // getName->2:     // getName->N:     // ofs = 52406 ord = 4 addr = 0
Label84:
	aload_0 
	aload_3 
	putfield com.whatsapp.field.MediaDisplayField.field_52414   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52414   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52414   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52414   // getName->1:     // getName->2:     // getName->N:     // ofs = 52414 ord = 6 addr = 0
	aload_0 
	iload_4 
	putfield com.whatsapp.field.MediaDisplayField.field_52418   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52418   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52418   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52418   // getName->1:     // getName->2:     // getName->N:     // ofs = 52418 ord = 7 addr = 0
	aload_0 
	aload_5 
	putfield com.whatsapp.field.MediaDisplayField.field_52422   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52422   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52422   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52422   // getName->1:     // getName->2:     // getName->N:     // ofs = 52422 ord = 8 addr = 0
	aload_0 
	iload_6 
	putfield com.whatsapp.field.MediaDisplayField.field_52410   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52410   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52410   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52410   // getName->1:     // getName->2:     // getName->N:     // ofs = 52410 ord = 5 addr = 0
	aload_0 
	iconst_1 
	putfield com.whatsapp.field.MediaDisplayField.field_52486   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52486   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52486   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52486   // getName->1:     // getName->2:     // getName->N:     // ofs = 52486 ord = 24 addr = 0
	return 
	}


static private final int[] com.whatsapp.field.MediaDisplayField.routine_4756(  ); // address: 0
	{
	enter 
	bipush 16
	bipush 16
	invokestatic_lib module:WhatsApp-9.class#2.routine_2916(  ) // class#2
	astore_0 
	aload_0 
	invokestatic_lib module:WhatsApp-35.class#0.routine_4406(  ) // class#0
	astore_1 
	aload_1 
	iipush 16777215
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	iconst_0 
	iconst_0 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	bipush 8
	bipush 8
	invokevirtual fillRoundRect( net.rim.device.api.ui.Graphics, int, int, int, int, int, int ) // pc=7
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	imul 
	newarray 5
	astore_2 
	aload_0 
	aload_2 
	iconst_0 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	iconst_0 
	iconst_0 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	invokevirtual getARGB( net.rim.device.api.system.Bitmap, int[], int, int, int, int, int, int ) // pc=8
	aload_2 
	areturn 
	}


static public final net.rim.device.api.system.Bitmap createThumbBitmap( net.rim.device.api.system.Bitmap ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	istore_1 
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	istore_2 
	bipush 16
	istore_3 
	iload_1 
	iload_2 
	invokestatic_lib module:WhatsApp-9.class#2.routine_2916(  ) // class#2
	astore_4 
	aload_4 
	invokestatic_lib module:WhatsApp-35.class#0.routine_4406(  ) // class#0
	astore_5 
	aload_5 
	bipush -97
	iconst_0 
	iconst_0 
	iload_1 
	iload_2 
	aload_0 
	iconst_0 
	iconst_0 
	invokevirtual rop( net.rim.device.api.ui.Graphics, int, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=9
	iload_1 
	newarray 5
	astore_6 
	iconst_0 
	istore_7 
	iconst_0 
	istore 8
Label33:
	iload_7 
	bipush 8
	if_icmpge Label104
	aload_4 
	aload_6 
	iconst_0 
	iload_1 
	iconst_0 
	iload_7 
	iload_1 
	iconst_1 
	invokevirtual getARGB( net.rim.device.api.system.Bitmap, int[], int, int, int, int, int, int ) // pc=8
	iconst_0 
	istore 9
	iload 8
	istore 10
Label49:
	iload 9
	bipush 8
	if_icmpge Label65
	aload_6 
	iload 9
	aload_6 
	iload 9
	iaload 
	getstatic com.whatsapp.field.MediaDisplayField.field_52490 // MediaDisplayField
	iload 10
	iaload 
	iand 
	iastore 
	iinc 9 1
	iinc 10 1
	goto Label49
Label65:
	iload_1 
	bipush 8
	isub 
	istore 9
	iload 8
	bipush 8
	iadd 
	istore 10
Label73:
	iload 9
	iload_1 
	if_icmpge Label89
	aload_6 
	iload 9
	aload_6 
	iload 9
	iaload 
	getstatic com.whatsapp.field.MediaDisplayField.field_52490 // MediaDisplayField
	iload 10
	iaload 
	iand 
	iastore 
	iinc 9 1
	iinc 10 1
	goto Label73
Label89:
	aload_4 
	aload_6 
	iconst_0 
	iload_1 
	iconst_0 
	iload_7 
	iload_1 
	iconst_1 
	invokevirtual setARGB( net.rim.device.api.system.Bitmap, int[], int, int, int, int, int, int ) // pc=8
	iinc 7 1
	iload 8
	iload_3 
	iadd 
	istore 8
	goto Label33
Label104:
	iload_2 
	bipush 8
	isub 
	istore_7 
	bipush 8
	iload_3 
	imul 
	istore 8
Label112:
	iload_7 
	iload_2 
	if_icmpge Label183
	aload_4 
	aload_6 
	iconst_0 
	iload_1 
	iconst_0 
	iload_7 
	iload_1 
	iconst_1 
	invokevirtual getARGB( net.rim.device.api.system.Bitmap, int[], int, int, int, int, int, int ) // pc=8
	iconst_0 
	istore 9
	iload 8
	istore 10
Label128:
	iload 9
	bipush 8
	if_icmpge Label144
	aload_6 
	iload 9
	aload_6 
	iload 9
	iaload 
	getstatic com.whatsapp.field.MediaDisplayField.field_52490 // MediaDisplayField
	iload 10
	iaload 
	iand 
	iastore 
	iinc 9 1
	iinc 10 1
	goto Label128
Label144:
	iload_1 
	bipush 8
	isub 
	istore 9
	iload 8
	bipush 8
	iadd 
	istore 10
Label152:
	iload 9
	iload_1 
	if_icmpge Label168
	aload_6 
	iload 9
	aload_6 
	iload 9
	iaload 
	getstatic com.whatsapp.field.MediaDisplayField.field_52490 // MediaDisplayField
	iload 10
	iaload 
	iand 
	iastore 
	iinc 9 1
	iinc 10 1
	goto Label152
Label168:
	aload_4 
	aload_6 
	iconst_0 
	iload_1 
	iconst_0 
	iload_7 
	iload_1 
	iconst_1 
	invokevirtual setARGB( net.rim.device.api.system.Bitmap, int[], int, int, int, int, int, int ) // pc=8
	iinc 7 1
	iload 8
	iload_3 
	iadd 
	istore 8
	goto Label112
Label183:
	aload_4 
	areturn 
	}


static private final net.rim.device.api.system.Bitmap[] com.whatsapp.field.MediaDisplayField.routine_5201( int, int ); // address: 0
	{
	enter 
	iload_1 
	bipush 16
	ishl 
	iload_0 
	iadd 
	istore_2 
	getstatic com.whatsapp.field.MediaDisplayField.field_52496 // MediaDisplayField
	iload_2 
	invokevirtual java.lang.Object get( net.rim.device.api.util.IntHashtable, int ) // pc=2
	checkcast_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	astore_3 
	aload_3 
	ifnull Label18
	aload_3 
	invokevirtual java.lang.Object get( java.lang.ref.Reference ) // pc=1
	checkcast_arrayobject_lib Bitmap
	goto Label19
Label18:
	aconst_null 
Label19:
	astore_4 
	aload_4 
	ifnonnull Label55
	iload_1 
	tableswitch  :
		
		
		
		

Label24:
	iload_0 
	iipush 3055602
	iipush 1533659
	invokestatic net.rim.device.api.system.Bitmap[] com.whatsapp.field.MediaDisplayField.routine_5363( int, int, int ) // MediaDisplayField
	astore_4 
	goto Label47
Label30:
	iload_0 
	iipush 7060469
	iipush 7644392
	invokestatic net.rim.device.api.system.Bitmap[] com.whatsapp.field.MediaDisplayField.routine_5363( int, int, int ) // MediaDisplayField
	astore_4 
	goto Label47
Label36:
	iload_0 
	iipush 2868984
	iipush 755949
	invokestatic net.rim.device.api.system.Bitmap[] com.whatsapp.field.MediaDisplayField.routine_5363( int, int, int ) // MediaDisplayField
	astore_4 
	goto Label47
Label42:
	iload_0 
	iipush 16514043
	iipush 14803425
	invokestatic net.rim.device.api.system.Bitmap[] com.whatsapp.field.MediaDisplayField.routine_5363( int, int, int ) // MediaDisplayField
	astore_4 
Label47:
	getstatic com.whatsapp.field.MediaDisplayField.field_52496 // MediaDisplayField
	iload_2 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	aload_4 
	invokespecial_lib java.lang.ref.WeakReference.<init> // pc=2
	invokevirtual java.lang.Object put( net.rim.device.api.util.IntHashtable, int, java.lang.Object ) // pc=3
	pop 
Label55:
	aload_4 
	areturn 
	}


static private final net.rim.device.api.system.Bitmap[] com.whatsapp.field.MediaDisplayField.routine_5363( int, int, int ); // address: 0
	{
	enter 
	iload_0 
	bipush 26
	iload_1 
	iload_2 
	invokestatic net.rim.device.api.system.Bitmap com.whatsapp.field.MediaDisplayField.routine_5459( int, int, int, int ) // MediaDisplayField
	astore_4 
	aload_4 
	iconst_0 
	iconst_0 
	bipush 12
	iload_0 
	invokestatic_lib module:WhatsApp-9.class#2.routine_2970(  ) // class#2
	astore_5 
	aload_4 
	bipush 12
	iconst_0 
	aload_4 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	bipush 24
	isub 
	iload_0 
	invokestatic_lib module:WhatsApp-9.class#2.routine_2970(  ) // class#2
	astore_6 
	aload_4 
	aload_4 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	bipush 12
	isub 
	iconst_0 
	bipush 12
	iload_0 
	invokestatic_lib module:WhatsApp-9.class#2.routine_2970(  ) // class#2
	astore_7 
	bipush 3
	newarray_object_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	dup 
	iconst_0 
	aload_5 
	aastore 
	dup 
	iconst_1 
	aload_6 
	aastore 
	dup 
	bipush 2
	aload_7 
	aastore 
	astore_3 
	aload_3 
	areturn 
	}


static private final net.rim.device.api.system.Bitmap com.whatsapp.field.MediaDisplayField.routine_5459( int, int, int, int ); // address: 0
	{
	enter 
	new_lib net.rim.device.api.ui.XYRect//net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect
	dup 
	iconst_0 
	iconst_0 
	iload_1 
	iload_0 
	invokespecial_lib net.rim.device.api.ui.XYRect.<init> // pc=5
	astore_4 
	aload_4 
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	aload_4 
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	invokestatic_lib module:WhatsApp-9.class#2.routine_2916(  ) // class#2
	astore_5 
	aload_5 
	invokestatic_lib module:WhatsApp-35.class#0.routine_4406(  ) // class#0
	astore_6 
	aload_6 
	aload_4 
	bipush 12
	iload_2 
	iload_3 
	invokestatic_lib module:WhatsApp-37.class#1.routine_2774(  ) // class#1
	aload_5 
	areturn 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	clinit_lib net.rim.device.api.ui.Field//net.rim.device.api.ui.Field net.rim.device.api.ui.Field net.rim.device.api.ui.Field
	synch_static MediaDisplayField
	clinit_wait 
	invokestatic int[] com.whatsapp.field.MediaDisplayField.routine_4756(  ) // MediaDisplayField
	putstatic com.whatsapp.field.MediaDisplayField.field_52490 // MediaDisplayField
	new_lib net.rim.device.api.ui.XYEdges//net.rim.device.api.ui.XYEdges net.rim.device.api.ui.XYEdges net.rim.device.api.ui.XYEdges
	dup 
	invokespecial_lib net.rim.device.api.util.IntHashtable.<init> // pc=1
	putstatic com.whatsapp.field.MediaDisplayField.field_52496 // MediaDisplayField
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.field.MediaDisplayField.routine_3137( com.whatsapp.field.MediaDisplayField ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual boolean isEditable( net.rim.device.api.ui.Field ) // pc=1
	ifeq Label7
	aload_0 
	iconst_0 
	invokevirtual fieldChangeNotify( net.rim.device.api.ui.Field, int ) // pc=2
Label7:
	return 
	}


private final com.whatsapp.field.MediaDisplayField.routine_3166( com.whatsapp.field.MediaDisplayField, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter 
	aload_1 
	iipush 14803425
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	bipush 64
	invokevirtual setGlobalAlpha( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52442   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52442   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52442   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52442   // getName->1:     // getName->2:     // getName->N:     // ofs = 52442 ord = 13 addr = 0
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	iconst_1 
	isub 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52442   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52442   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52442   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52442   // getName->1:     // getName->2:     // getName->N:     // ofs = 52442 ord = 13 addr = 0
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	iconst_1 
	isub 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52442   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52442   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52442   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52442   // getName->1:     // getName->2:     // getName->N:     // ofs = 52442 ord = 13 addr = 0
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	bipush 2
	iadd 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52442   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52442   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52442   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52442   // getName->1:     // getName->2:     // getName->N:     // ofs = 52442 ord = 13 addr = 0
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	bipush 3
	iadd 
	bipush 12
	bipush 12
	invokevirtual drawRoundRect( net.rim.device.api.ui.Graphics, int, int, int, int, int, int ) // pc=7
	aload_1 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52442   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52442   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52442   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52442   // getName->1:     // getName->2:     // getName->N:     // ofs = 52442 ord = 13 addr = 0
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	bipush 2
	isub 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52442   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52442   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52442   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52442   // getName->1:     // getName->2:     // getName->N:     // ofs = 52442 ord = 13 addr = 0
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	iconst_1 
	isub 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52442   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52442   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52442   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52442   // getName->1:     // getName->2:     // getName->N:     // ofs = 52442 ord = 13 addr = 0
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	bipush 4
	iadd 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52442   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52442   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52442   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52442   // getName->1:     // getName->2:     // getName->N:     // ofs = 52442 ord = 13 addr = 0
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	bipush 3
	iadd 
	bipush 12
	bipush 12
	invokevirtual drawRoundRect( net.rim.device.api.ui.Graphics, int, int, int, int, int, int ) // pc=7
	aload_1 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52442   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52442   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52442   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52442   // getName->1:     // getName->2:     // getName->N:     // ofs = 52442 ord = 13 addr = 0
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	bipush 2
	isub 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52442   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52442   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52442   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52442   // getName->1:     // getName->2:     // getName->N:     // ofs = 52442 ord = 13 addr = 0
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	iconst_1 
	isub 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52442   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52442   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52442   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52442   // getName->1:     // getName->2:     // getName->N:     // ofs = 52442 ord = 13 addr = 0
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	bipush 4
	iadd 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52442   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52442   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52442   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52442   // getName->1:     // getName->2:     // getName->N:     // ofs = 52442 ord = 13 addr = 0
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	bipush 4
	iadd 
	bipush 12
	bipush 12
	invokevirtual drawRoundRect( net.rim.device.api.ui.Graphics, int, int, int, int, int, int ) // pc=7
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52410   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52410   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52410   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52410   // getName->1:     // getName->2:     // getName->N:     // ofs = 52410 ord = 5 addr = 0
	ifne Label95
	aload_1 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52450   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52450   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52450   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52450   // getName->1:     // getName->2:     // getName->N:     // ofs = 52450 ord = 15 addr = 0
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52450   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52450   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52450   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52450   // getName->1:     // getName->2:     // getName->N:     // ofs = 52450 ord = 15 addr = 0
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52450   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52450   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52450   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52450   // getName->1:     // getName->2:     // getName->N:     // ofs = 52450 ord = 15 addr = 0
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52450   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52450   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52450   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52450   // getName->1:     // getName->2:     // getName->N:     // ofs = 52450 ord = 15 addr = 0
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	bipush 12
	bipush 12
	invokevirtual drawRoundRect( net.rim.device.api.ui.Graphics, int, int, int, int, int, int ) // pc=7
	aload_1 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52450   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52450   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52450   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52450   // getName->1:     // getName->2:     // getName->N:     // ofs = 52450 ord = 15 addr = 0
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52450   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52450   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52450   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52450   // getName->1:     // getName->2:     // getName->N:     // ofs = 52450 ord = 15 addr = 0
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52450   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52450   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52450   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52450   // getName->1:     // getName->2:     // getName->N:     // ofs = 52450 ord = 15 addr = 0
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52450   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52450   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52450   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52450   // getName->1:     // getName->2:     // getName->N:     // ofs = 52450 ord = 15 addr = 0
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	iconst_1 
	isub 
	bipush 12
	bipush 12
	invokevirtual drawRoundRect( net.rim.device.api.ui.Graphics, int, int, int, int, int, int ) // pc=7
Label95:
	return 
	}


private final com.whatsapp.field.MediaDisplayField.routine_3362( com.whatsapp.field.MediaDisplayField, net.rim.device.api.ui.Graphics, boolean ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52410   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52410   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52410   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52410   // getName->1:     // getName->2:     // getName->N:     // ofs = 52410 ord = 5 addr = 0
	ifeq Label64
	iload_2 
	ifeq Label64
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52446   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52446   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52446   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52446   // getName->1:     // getName->2:     // getName->N:     // ofs = 52446 ord = 14 addr = 0
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52398   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52398   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52398   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52398   // getName->1:     // getName->2:     // getName->N:     // ofs = 52398 ord = 2 addr = 0
	ifeq Label11
	bipush 4
	goto Label12
Label11:
	bipush 2
Label12:
	invokestatic net.rim.device.api.system.Bitmap[] com.whatsapp.field.MediaDisplayField.routine_5201( int, int ) // MediaDisplayField
	astore_3 
	aload_1 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52446   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52446   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52446   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52446   // getName->1:     // getName->2:     // getName->N:     // ofs = 52446 ord = 14 addr = 0
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52446   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52446   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52446   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52446   // getName->1:     // getName->2:     // getName->N:     // ofs = 52446 ord = 14 addr = 0
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	bipush 12
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52446   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52446   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52446   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52446   // getName->1:     // getName->2:     // getName->N:     // ofs = 52446 ord = 14 addr = 0
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	aload_3 
	iconst_0 
	aaload 
	iconst_0 
	iconst_0 
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=8
	aload_1 
	bipush -97
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52446   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52446   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52446   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52446   // getName->1:     // getName->2:     // getName->N:     // ofs = 52446 ord = 14 addr = 0
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	bipush 12
	iadd 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52446   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52446   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52446   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52446   // getName->1:     // getName->2:     // getName->N:     // ofs = 52446 ord = 14 addr = 0
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52446   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52446   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52446   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52446   // getName->1:     // getName->2:     // getName->N:     // ofs = 52446 ord = 14 addr = 0
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	bipush 24
	isub 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52446   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52446   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52446   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52446   // getName->1:     // getName->2:     // getName->N:     // ofs = 52446 ord = 14 addr = 0
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	aload_3 
	iconst_1 
	aaload 
	iconst_0 
	iconst_0 
	invokevirtual tileRop( net.rim.device.api.ui.Graphics, int, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=9
	aload_1 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52446   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52446   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52446   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52446   // getName->1:     // getName->2:     // getName->N:     // ofs = 52446 ord = 14 addr = 0
	invokevirtual int X2( net.rim.device.api.ui.XYRect ) // pc=1
	bipush 12
	isub 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52446   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52446   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52446   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52446   // getName->1:     // getName->2:     // getName->N:     // ofs = 52446 ord = 14 addr = 0
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	bipush 12
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52446   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52446   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52446   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52446   // getName->1:     // getName->2:     // getName->N:     // ofs = 52446 ord = 14 addr = 0
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	aload_3 
	bipush 2
	aaload 
	iconst_0 
	iconst_0 
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=8
Label64:
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52410   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52410   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52410   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52410   // getName->1:     // getName->2:     // getName->N:     // ofs = 52410 ord = 5 addr = 0
	ifne Label92
	aload_0 
	iload_2 
	invokespecial com.whatsapp.field.MediaDisplayField.routine_3755 // pc=2
	astore_3 
	aload_3 
	ifnull Label77
	aload_0 
	aload_1 
	aload_3 
	invokespecial com.whatsapp.field.MediaDisplayField.routine_3652 // pc=3
	goto Label92
Label77:
	aload_1 
	iipush 6184542
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52454   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52454   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52454   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52454   // getName->1:     // getName->2:     // getName->N:     // ofs = 52454 ord = 16 addr = 0
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52454   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52454   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52454   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52454   // getName->1:     // getName->2:     // getName->N:     // ofs = 52454 ord = 16 addr = 0
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52454   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52454   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52454   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52454   // getName->1:     // getName->2:     // getName->N:     // ofs = 52454 ord = 16 addr = 0
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52454   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52454   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52454   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52454   // getName->1:     // getName->2:     // getName->N:     // ofs = 52454 ord = 16 addr = 0
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	bipush 12
	bipush 12
	invokevirtual fillRoundRect( net.rim.device.api.ui.Graphics, int, int, int, int, int, int ) // pc=7
Label92:
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52406   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52406   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52406   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52406   // getName->1:     // getName->2:     // getName->N:     // ofs = 52406 ord = 4 addr = 0
	ifeq Label149
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52442   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52442   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52442   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52442   // getName->1:     // getName->2:     // getName->N:     // ofs = 52442 ord = 13 addr = 0
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	iconst_1 
	invokestatic net.rim.device.api.system.Bitmap[] com.whatsapp.field.MediaDisplayField.routine_5201( int, int ) // MediaDisplayField
	astore_3 
	aload_1 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52442   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52442   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52442   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52442   // getName->1:     // getName->2:     // getName->N:     // ofs = 52442 ord = 13 addr = 0
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52442   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52442   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52442   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52442   // getName->1:     // getName->2:     // getName->N:     // ofs = 52442 ord = 13 addr = 0
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	bipush 12
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52442   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52442   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52442   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52442   // getName->1:     // getName->2:     // getName->N:     // ofs = 52442 ord = 13 addr = 0
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	aload_3 
	iconst_0 
	aaload 
	iconst_0 
	iconst_0 
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=8
	aload_1 
	bipush -97
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52442   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52442   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52442   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52442   // getName->1:     // getName->2:     // getName->N:     // ofs = 52442 ord = 13 addr = 0
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	bipush 12
	iadd 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52442   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52442   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52442   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52442   // getName->1:     // getName->2:     // getName->N:     // ofs = 52442 ord = 13 addr = 0
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52442   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52442   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52442   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52442   // getName->1:     // getName->2:     // getName->N:     // ofs = 52442 ord = 13 addr = 0
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	bipush 24
	isub 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52442   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52442   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52442   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52442   // getName->1:     // getName->2:     // getName->N:     // ofs = 52442 ord = 13 addr = 0
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	aload_3 
	iconst_1 
	aaload 
	iconst_0 
	iconst_0 
	invokevirtual tileRop( net.rim.device.api.ui.Graphics, int, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=9
	aload_1 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52442   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52442   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52442   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52442   // getName->1:     // getName->2:     // getName->N:     // ofs = 52442 ord = 13 addr = 0
	invokevirtual int X2( net.rim.device.api.ui.XYRect ) // pc=1
	bipush 12
	isub 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52442   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52442   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52442   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52442   // getName->1:     // getName->2:     // getName->N:     // ofs = 52442 ord = 13 addr = 0
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	bipush 12
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52442   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52442   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52442   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52442   // getName->1:     // getName->2:     // getName->N:     // ofs = 52442 ord = 13 addr = 0
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	aload_3 
	bipush 2
	aaload 
	iconst_0 
	iconst_0 
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=8
Label149:
	return 
	}


private final com.whatsapp.field.MediaDisplayField.routine_3652( com.whatsapp.field.MediaDisplayField, net.rim.device.api.ui.Graphics, net.rim.device.api.system.Bitmap[] ); // address: 0
	{
	enter 
	aload_1 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52454   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52454   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52454   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52454   // getName->1:     // getName->2:     // getName->N:     // ofs = 52454 ord = 16 addr = 0
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52454   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52454   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52454   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52454   // getName->1:     // getName->2:     // getName->N:     // ofs = 52454 ord = 16 addr = 0
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	bipush 12
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52454   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52454   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52454   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52454   // getName->1:     // getName->2:     // getName->N:     // ofs = 52454 ord = 16 addr = 0
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	aload_2 
	iconst_0 
	aaload 
	iconst_0 
	iconst_0 
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=8
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52454   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52454   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52454   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52454   // getName->1:     // getName->2:     // getName->N:     // ofs = 52454 ord = 16 addr = 0
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	bipush 12
	iadd 
	istore_3 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52454   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52454   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52454   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52454   // getName->1:     // getName->2:     // getName->N:     // ofs = 52454 ord = 16 addr = 0
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	bipush 24
	isub 
	istore_4 
	aload_1 
	bipush -97
	iload_3 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52454   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52454   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52454   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52454   // getName->1:     // getName->2:     // getName->N:     // ofs = 52454 ord = 16 addr = 0
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	iload_4 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52454   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52454   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52454   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52454   // getName->1:     // getName->2:     // getName->N:     // ofs = 52454 ord = 16 addr = 0
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	aload_2 
	iconst_1 
	aaload 
	iconst_0 
	iconst_0 
	invokevirtual tileRop( net.rim.device.api.ui.Graphics, int, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=9
	aload_1 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52454   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52454   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52454   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52454   // getName->1:     // getName->2:     // getName->N:     // ofs = 52454 ord = 16 addr = 0
	invokevirtual int X2( net.rim.device.api.ui.XYRect ) // pc=1
	bipush 12
	isub 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52454   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52454   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52454   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52454   // getName->1:     // getName->2:     // getName->N:     // ofs = 52454 ord = 16 addr = 0
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	bipush 12
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52454   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52454   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52454   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52454   // getName->1:     // getName->2:     // getName->N:     // ofs = 52454 ord = 16 addr = 0
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	aload_2 
	bipush 2
	aaload 
	iconst_0 
	iconst_0 
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=8
	return 
	}


private final net.rim.device.api.system.Bitmap[] com.whatsapp.field.MediaDisplayField.routine_3755( com.whatsapp.field.MediaDisplayField, boolean ); // address: 0
	{
	enter_narrow 
	iload_1 
	ifeq Label29
	aload_0 
	invokevirtual boolean isEditable( net.rim.device.api.ui.Field ) // pc=1
	ifne Label13
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52454   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52454   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52454   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52454   // getName->1:     // getName->2:     // getName->N:     // ofs = 52454 ord = 16 addr = 0
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	bipush 3
	invokestatic net.rim.device.api.system.Bitmap[] com.whatsapp.field.MediaDisplayField.routine_5201( int, int ) // MediaDisplayField
	astore_2 
	aload_2 
	areturn 
Label13:
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52398   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52398   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52398   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52398   // getName->1:     // getName->2:     // getName->N:     // ofs = 52398 ord = 2 addr = 0
	ifeq Label22
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52454   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52454   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52454   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52454   // getName->1:     // getName->2:     // getName->N:     // ofs = 52454 ord = 16 addr = 0
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	bipush 4
	invokestatic net.rim.device.api.system.Bitmap[] com.whatsapp.field.MediaDisplayField.routine_5201( int, int ) // MediaDisplayField
	astore_2 
	aload_2 
	areturn 
Label22:
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52454   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52454   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52454   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52454   // getName->1:     // getName->2:     // getName->N:     // ofs = 52454 ord = 16 addr = 0
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	bipush 2
	invokestatic net.rim.device.api.system.Bitmap[] com.whatsapp.field.MediaDisplayField.routine_5201( int, int ) // MediaDisplayField
	astore_2 
	aload_2 
	areturn 
Label29:
	aload_0 
	invokevirtual boolean isEditable( net.rim.device.api.ui.Field ) // pc=1
	ifeq Label39
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52454   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52454   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52454   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52454   // getName->1:     // getName->2:     // getName->N:     // ofs = 52454 ord = 16 addr = 0
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	iconst_1 
	invokestatic net.rim.device.api.system.Bitmap[] com.whatsapp.field.MediaDisplayField.routine_5201( int, int ) // MediaDisplayField
	astore_2 
	aload_2 
	areturn 
Label39:
	aconst_null 
	astore_2 
	aload_2 
	areturn 
	}


private final com.whatsapp.field.MediaDisplayField.routine_3846( com.whatsapp.field.MediaDisplayField, net.rim.device.api.ui.Graphics, boolean ); // address: 0
	{
	enter 
	aload_1 
	sipush 255
	invokevirtual setGlobalAlpha( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	iipush 12500670
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	iload_2 
	ifeq Label11
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52410   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52410   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52410   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52410   // getName->1:     // getName->2:     // getName->N:     // ofs = 52410 ord = 5 addr = 0
	ifne Label31
Label11:
	aload_1 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52442   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52442   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52442   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52442   // getName->1:     // getName->2:     // getName->N:     // ofs = 52442 ord = 13 addr = 0
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	iconst_1 
	isub 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52442   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52442   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52442   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52442   // getName->1:     // getName->2:     // getName->N:     // ofs = 52442 ord = 13 addr = 0
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	iconst_1 
	isub 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52442   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52442   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52442   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52442   // getName->1:     // getName->2:     // getName->N:     // ofs = 52442 ord = 13 addr = 0
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	bipush 2
	iadd 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52442   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52442   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52442   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52442   // getName->1:     // getName->2:     // getName->N:     // ofs = 52442 ord = 13 addr = 0
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	bipush 2
	iadd 
	bipush 12
	bipush 12
	invokevirtual drawRoundRect( net.rim.device.api.ui.Graphics, int, int, int, int, int, int ) // pc=7
Label31:
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52410   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52410   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52410   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52410   // getName->1:     // getName->2:     // getName->N:     // ofs = 52410 ord = 5 addr = 0
	ifne Label45
	aload_1 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52454   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52454   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52454   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52454   // getName->1:     // getName->2:     // getName->N:     // ofs = 52454 ord = 16 addr = 0
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52454   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52454   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52454   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52454   // getName->1:     // getName->2:     // getName->N:     // ofs = 52454 ord = 16 addr = 0
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52454   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52454   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52454   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52454   // getName->1:     // getName->2:     // getName->N:     // ofs = 52454 ord = 16 addr = 0
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52454   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52454   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52454   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52454   // getName->1:     // getName->2:     // getName->N:     // ofs = 52454 ord = 16 addr = 0
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	bipush 12
	bipush 12
	invokevirtual drawRoundRect( net.rim.device.api.ui.Graphics, int, int, int, int, int, int ) // pc=7
Label45:
	aload_1 
	sipush 153
	invokevirtual setGlobalAlpha( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52442   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52442   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52442   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52442   // getName->1:     // getName->2:     // getName->N:     // ofs = 52442 ord = 13 addr = 0
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52442   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52442   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52442   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52442   // getName->1:     // getName->2:     // getName->N:     // ofs = 52442 ord = 13 addr = 0
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52442   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52442   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52442   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52442   // getName->1:     // getName->2:     // getName->N:     // ofs = 52442 ord = 13 addr = 0
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52442   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52442   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52442   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52442   // getName->1:     // getName->2:     // getName->N:     // ofs = 52442 ord = 13 addr = 0
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	bipush 8
	bipush 8
	invokevirtual drawRoundRect( net.rim.device.api.ui.Graphics, int, int, int, int, int, int ) // pc=7
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52410   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52410   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52410   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52410   // getName->1:     // getName->2:     // getName->N:     // ofs = 52410 ord = 5 addr = 0
	ifne Label82
	aload_1 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52454   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52454   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52454   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52454   // getName->1:     // getName->2:     // getName->N:     // ofs = 52454 ord = 16 addr = 0
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	iconst_1 
	iadd 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52454   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52454   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52454   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52454   // getName->1:     // getName->2:     // getName->N:     // ofs = 52454 ord = 16 addr = 0
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	iconst_1 
	iadd 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52454   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52454   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52454   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52454   // getName->1:     // getName->2:     // getName->N:     // ofs = 52454 ord = 16 addr = 0
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	bipush 2
	isub 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52454   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52454   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52454   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52454   // getName->1:     // getName->2:     // getName->N:     // ofs = 52454 ord = 16 addr = 0
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	bipush 2
	isub 
	bipush 8
	bipush 8
	invokevirtual drawRoundRect( net.rim.device.api.ui.Graphics, int, int, int, int, int, int ) // pc=7
Label82:
	return 
	}


private final com.whatsapp.field.MediaDisplayField.routine_4023( com.whatsapp.field.MediaDisplayField, net.rim.device.api.ui.Graphics, boolean ); // address: 0
	{
	enter 
	iload_2 
	ifeq Label6
	aload_1 
	iipush 16777215
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
Label6:
	aload_1 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52426   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52426   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52426   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52426   // getName->1:     // getName->2:     // getName->N:     // ofs = 52426 ord = 9 addr = 0
	invokevirtual setFont( net.rim.device.api.ui.Graphics, net.rim.device.api.ui.Font ) // pc=2
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52422   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52422   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52422   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52422   // getName->1:     // getName->2:     // getName->N:     // ofs = 52422 ord = 8 addr = 0
	ifnonnull Label22
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52434   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52434   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52434   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52434   // getName->1:     // getName->2:     // getName->N:     // ofs = 52434 ord = 11 addr = 0
	ifeq Label22
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52458   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52458   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52458   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52458   // getName->1:     // getName->2:     // getName->N:     // ofs = 52458 ord = 17 addr = 0
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	iconst_1 
	iushr 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52426   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52426   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52426   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52426   // getName->1:     // getName->2:     // getName->N:     // ofs = 52426 ord = 9 addr = 0
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	isub 
	istore_3 
	goto Label25
Label22:
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52462   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52462   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52462   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52462   // getName->1:     // getName->2:     // getName->N:     // ofs = 52462 ord = 18 addr = 0
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	istore_3 
Label25:
	aload_1 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52414   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52414   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52414   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52414   // getName->1:     // getName->2:     // getName->N:     // ofs = 52414 ord = 6 addr = 0
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52462   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52462   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52462   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52462   // getName->1:     // getName->2:     // getName->N:     // ofs = 52462 ord = 18 addr = 0
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	iload_3 
	bipush 68
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52462   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52462   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52462   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52462   // getName->1:     // getName->2:     // getName->N:     // ofs = 52462 ord = 18 addr = 0
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	invokevirtual int drawText( net.rim.device.api.ui.Graphics, java.lang.String, int, int, int, int ) // pc=6
	pop 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52422   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52422   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52422   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52422   // getName->1:     // getName->2:     // getName->N:     // ofs = 52422 ord = 8 addr = 0
	ifnull Label58
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52434   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52434   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52434   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52434   // getName->1:     // getName->2:     // getName->N:     // ofs = 52434 ord = 11 addr = 0
	ifne Label58
	iload_2 
	ifne Label44
	aload_1 
	iipush 8421504
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
Label44:
	aload_1 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52430   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52430   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52430   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52430   // getName->1:     // getName->2:     // getName->N:     // ofs = 52430 ord = 10 addr = 0
	invokevirtual setFont( net.rim.device.api.ui.Graphics, net.rim.device.api.ui.Font ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52422   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52422   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52422   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52422   // getName->1:     // getName->2:     // getName->N:     // ofs = 52422 ord = 8 addr = 0
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52466   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52466   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52466   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52466   // getName->1:     // getName->2:     // getName->N:     // ofs = 52466 ord = 19 addr = 0
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52466   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52466   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52466   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52466   // getName->1:     // getName->2:     // getName->N:     // ofs = 52466 ord = 19 addr = 0
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	bipush 68
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52466   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52466   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52466   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52466   // getName->1:     // getName->2:     // getName->N:     // ofs = 52466 ord = 19 addr = 0
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	invokevirtual int drawText( net.rim.device.api.ui.Graphics, java.lang.String, int, int, int, int ) // pc=6
	pop 
Label58:
	return 
	}


private final com.whatsapp.field.MediaDisplayField.routine_4157( com.whatsapp.field.MediaDisplayField, net.rim.device.api.ui.Graphics, boolean ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52422   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52422   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52422   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52422   // getName->1:     // getName->2:     // getName->N:     // ofs = 52422 ord = 8 addr = 0
	ifnull Label27
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52478   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52478   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52478   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52478   // getName->1:     // getName->2:     // getName->N:     // ofs = 52478 ord = 22 addr = 0
	ifne Label27
	iload_2 
	ifne Label13
	aload_0 
	invokevirtual boolean isEditable( net.rim.device.api.ui.Field ) // pc=1
	ifeq Label13
	aload_1 
	iipush 8421504
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
Label13:
	aload_1 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52430   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52430   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52430   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52430   // getName->1:     // getName->2:     // getName->N:     // ofs = 52430 ord = 10 addr = 0
	invokevirtual setFont( net.rim.device.api.ui.Graphics, net.rim.device.api.ui.Font ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52422   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52422   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52422   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52422   // getName->1:     // getName->2:     // getName->N:     // ofs = 52422 ord = 8 addr = 0
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52474   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52474   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52474   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52474   // getName->1:     // getName->2:     // getName->N:     // ofs = 52474 ord = 21 addr = 0
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52474   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52474   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52474   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52474   // getName->1:     // getName->2:     // getName->N:     // ofs = 52474 ord = 21 addr = 0
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	bipush 64
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52474   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52474   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52474   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52474   // getName->1:     // getName->2:     // getName->N:     // ofs = 52474 ord = 21 addr = 0
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	invokevirtual int drawText( net.rim.device.api.ui.Graphics, java.lang.String, int, int, int, int ) // pc=6
	pop 
Label27:
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52438   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52438   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52438   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52438   // getName->1:     // getName->2:     // getName->N:     // ofs = 52438 ord = 12 addr = 0
	bipush 100
	if_icmpge Label72
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52390   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52390   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52390   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52390   // getName->1:     // getName->2:     // getName->N:     // ofs = 52390 ord = 0 addr = 0
	ifnonnull Label66
	aload_0 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52470   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52470   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52470   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52470   // getName->1:     // getName->2:     // getName->N:     // ofs = 52470 ord = 20 addr = 0
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52470   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52470   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52470   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52470   // getName->1:     // getName->2:     // getName->N:     // ofs = 52470 ord = 20 addr = 0
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	iipush 10264223
	iipush 12764100
	invokestatic net.rim.device.api.system.Bitmap com.whatsapp.field.MediaDisplayField.routine_5459( int, int, int, int ) // MediaDisplayField
	putfield com.whatsapp.field.MediaDisplayField.field_52390   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52390   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52390   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52390   // getName->1:     // getName->2:     // getName->N:     // ofs = 52390 ord = 0 addr = 0
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52422   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52422   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52422   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52422   // getName->1:     // getName->2:     // getName->N:     // ofs = 52422 ord = 8 addr = 0
	ifnull Label66
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52478   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52478   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52478   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52478   // getName->1:     // getName->2:     // getName->N:     // ofs = 52478 ord = 22 addr = 0
	ifeq Label66
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52390   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52390   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52390   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52390   // getName->1:     // getName->2:     // getName->N:     // ofs = 52390 ord = 0 addr = 0
	invokestatic_lib module:WhatsApp-35.class#0.routine_4406(  ) // class#0
	astore_3 
	aload_3 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52482   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52482   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52482   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52482   // getName->1:     // getName->2:     // getName->N:     // ofs = 52482 ord = 23 addr = 0
	invokevirtual setFont( net.rim.device.api.ui.Graphics, net.rim.device.api.ui.Font ) // pc=2
	aload_3 
	iconst_0 
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_3 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52422   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52422   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52422   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52422   // getName->1:     // getName->2:     // getName->N:     // ofs = 52422 ord = 8 addr = 0
	iconst_0 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52470   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52470   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52470   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52470   // getName->1:     // getName->2:     // getName->N:     // ofs = 52470 ord = 20 addr = 0
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	iconst_1 
	iushr 
	bipush 100
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52470   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52470   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52470   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52470   // getName->1:     // getName->2:     // getName->N:     // ofs = 52470 ord = 20 addr = 0
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	invokevirtual int drawText( net.rim.device.api.ui.Graphics, java.lang.String, int, int, int, int ) // pc=6
	pop 
Label66:
	aload_1 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52470   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52470   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52470   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52470   // getName->1:     // getName->2:     // getName->N:     // ofs = 52470 ord = 20 addr = 0
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52390   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52390   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52390   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52390   // getName->1:     // getName->2:     // getName->N:     // ofs = 52390 ord = 0 addr = 0
	iconst_0 
	iconst_0 
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, net.rim.device.api.ui.XYRect, net.rim.device.api.system.Bitmap, int, int ) // pc=5
Label72:
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52438   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52438   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52438   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52438   // getName->1:     // getName->2:     // getName->N:     // ofs = 52438 ord = 12 addr = 0
	ifgt Label75
	goto_w Label142
Label75:
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52394   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52394   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52394   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52394   // getName->1:     // getName->2:     // getName->N:     // ofs = 52394 ord = 1 addr = 0
	ifnonnull Label111
	aload_0 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52470   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52470   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52470   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52470   // getName->1:     // getName->2:     // getName->N:     // ofs = 52470 ord = 20 addr = 0
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52470   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52470   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52470   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52470   // getName->1:     // getName->2:     // getName->N:     // ofs = 52470 ord = 20 addr = 0
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	iipush 10411007
	iipush 4883664
	invokestatic net.rim.device.api.system.Bitmap com.whatsapp.field.MediaDisplayField.routine_5459( int, int, int, int ) // MediaDisplayField
	putfield com.whatsapp.field.MediaDisplayField.field_52394   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52394   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52394   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52394   // getName->1:     // getName->2:     // getName->N:     // ofs = 52394 ord = 1 addr = 0
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52422   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52422   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52422   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52422   // getName->1:     // getName->2:     // getName->N:     // ofs = 52422 ord = 8 addr = 0
	ifnull Label111
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52478   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52478   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52478   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52478   // getName->1:     // getName->2:     // getName->N:     // ofs = 52478 ord = 22 addr = 0
	ifeq Label111
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52394   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52394   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52394   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52394   // getName->1:     // getName->2:     // getName->N:     // ofs = 52394 ord = 1 addr = 0
	invokestatic_lib module:WhatsApp-35.class#0.routine_4406(  ) // class#0
	astore_3 
	aload_3 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52482   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52482   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52482   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52482   // getName->1:     // getName->2:     // getName->N:     // ofs = 52482 ord = 23 addr = 0
	invokevirtual setFont( net.rim.device.api.ui.Graphics, net.rim.device.api.ui.Font ) // pc=2
	aload_3 
	iipush 16777215
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_3 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52422   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52422   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52422   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52422   // getName->1:     // getName->2:     // getName->N:     // ofs = 52422 ord = 8 addr = 0
	iconst_0 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52470   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52470   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52470   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52470   // getName->1:     // getName->2:     // getName->N:     // ofs = 52470 ord = 20 addr = 0
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	iconst_1 
	iushr 
	bipush 100
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52470   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52470   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52470   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52470   // getName->1:     // getName->2:     // getName->N:     // ofs = 52470 ord = 20 addr = 0
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	invokevirtual int drawText( net.rim.device.api.ui.Graphics, java.lang.String, int, int, int, int ) // pc=6
	pop 
Label111:
	new_lib net.rim.device.api.ui.XYRect//net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect
	dup 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52470   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52470   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52470   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52470   // getName->1:     // getName->2:     // getName->N:     // ofs = 52470 ord = 20 addr = 0
	invokespecial_lib net.rim.device.api.ui.XYRect.<init> // pc=2
	astore_3 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52438   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52438   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52438   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52438   // getName->1:     // getName->2:     // getName->N:     // ofs = 52438 ord = 12 addr = 0
	bipush 100
	if_icmpge Label136
	aload_3 
	dup 
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	op01xx 
	i2d 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52438   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52438   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52438   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52438   // getName->1:     // getName->2:     // getName->N:     // ofs = 52438 ord = 12 addr = 0
	op01xx 
	i2d 
	isreal 
	lipush 4636737291354636288
	op01xx 
	ddiv 
	op01xx 
	dmul 
	op01xx 
	d2i 
	putfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
Label136:
	aload_1 
	aload_3 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52394   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52394   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52394   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52394   // getName->1:     // getName->2:     // getName->N:     // ofs = 52394 ord = 1 addr = 0
	iconst_0 
	iconst_0 
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, net.rim.device.api.ui.XYRect, net.rim.device.api.system.Bitmap, int, int ) // pc=5
Label142:
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final setThumbBitmap( com.whatsapp.field.MediaDisplayField, net.rim.device.api.system.Bitmap, boolean ); // address: 0
	{
	enter 
	aload_1 
	ifnonnull Label12
	aload_0 
	new_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	dup 
	bipush 80
	bipush 80
	invokespecial_lib net.rim.device.api.system.Bitmap.<init> // pc=3
	invokestatic net.rim.device.api.system.Bitmap createThumbBitmap( net.rim.device.api.system.Bitmap ) // MediaDisplayField
	putfield com.whatsapp.field.MediaDisplayField.field_52402   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52402   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52402   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52402   // getName->1:     // getName->2:     // getName->N:     // ofs = 52402 ord = 3 addr = 0
	goto Label29
Label12:
	iload_2 
	ifeq Label23
	aload_0 
	aload_1 
	invokestatic net.rim.device.api.system.Bitmap createThumbBitmap( net.rim.device.api.system.Bitmap ) // MediaDisplayField
	putfield com.whatsapp.field.MediaDisplayField.field_52402   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52402   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52402   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52402   // getName->1:     // getName->2:     // getName->N:     // ofs = 52402 ord = 3 addr = 0
	aload_0 
	aload_1 
	invokevirtual boolean hasAlpha( net.rim.device.api.system.Bitmap ) // pc=1
	putfield com.whatsapp.field.MediaDisplayField.field_52406   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52406   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52406   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52406   // getName->1:     // getName->2:     // getName->N:     // ofs = 52406 ord = 4 addr = 0
	goto Label29
Label23:
	aload_0 
	aload_1 
	putfield com.whatsapp.field.MediaDisplayField.field_52402   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52402   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52402   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52402   // getName->1:     // getName->2:     // getName->N:     // ofs = 52402 ord = 3 addr = 0
	aload_0 
	iconst_1 
	putfield com.whatsapp.field.MediaDisplayField.field_52406   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52406   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52406   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52406   // getName->1:     // getName->2:     // getName->N:     // ofs = 52406 ord = 4 addr = 0
Label29:
	aload_0 
	iconst_1 
	putfield com.whatsapp.field.MediaDisplayField.field_52486   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52486   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52486   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52486   // getName->1:     // getName->2:     // getName->N:     // ofs = 52486 ord = 24 addr = 0
	aload_0 
	invokevirtual updateLayout( net.rim.device.api.ui.Field ) // pc=1
	return 
	}


public final setEditable( com.whatsapp.field.MediaDisplayField, boolean ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual boolean isEditable( net.rim.device.api.ui.Field ) // pc=1
	iload_1 
	if_icmpeq Label10
	aload_0 
	iload_1 
	invokespecial_lib net.rim.device.api.ui.Field.setEditable // pc=2
	aload_0 
	invokenonvirtual com.whatsapp.field.MediaDisplayField.invalidate // pc=1
Label10:
	return 
	}


public final setLabel( com.whatsapp.field.MediaDisplayField, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52414   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52414   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52414   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52414   // getName->1:     // getName->2:     // getName->N:     // ofs = 52414 ord = 6 addr = 0
	aload_1 
	if_acmpeq Label12
	aload_0 
	aload_1 
	putfield com.whatsapp.field.MediaDisplayField.field_52414   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52414   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52414   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52414   // getName->1:     // getName->2:     // getName->N:     // ofs = 52414 ord = 6 addr = 0
	aload_0 
	iconst_1 
	putfield com.whatsapp.field.MediaDisplayField.field_52486   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52486   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52486   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52486   // getName->1:     // getName->2:     // getName->N:     // ofs = 52486 ord = 24 addr = 0
	aload_0 
	invokevirtual updateLayout( net.rim.device.api.ui.Field ) // pc=1
Label12:
	return 
	}


public final setLabelBig( com.whatsapp.field.MediaDisplayField, boolean ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52418   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52418   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52418   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52418   // getName->1:     // getName->2:     // getName->N:     // ofs = 52418 ord = 7 addr = 0
	iload_1 
	if_icmpeq Label12
	aload_0 
	iload_1 
	putfield com.whatsapp.field.MediaDisplayField.field_52418   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52418   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52418   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52418   // getName->1:     // getName->2:     // getName->N:     // ofs = 52418 ord = 7 addr = 0
	aload_0 
	iconst_1 
	putfield com.whatsapp.field.MediaDisplayField.field_52486   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52486   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52486   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52486   // getName->1:     // getName->2:     // getName->N:     // ofs = 52486 ord = 24 addr = 0
	aload_0 
	invokevirtual updateLayout( net.rim.device.api.ui.Field ) // pc=1
Label12:
	return 
	}


public final setSubtitle( com.whatsapp.field.MediaDisplayField, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52422   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52422   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52422   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52422   // getName->1:     // getName->2:     // getName->N:     // ofs = 52422 ord = 8 addr = 0
	aload_1 
	if_acmpeq Label12
	aload_0 
	aload_1 
	putfield com.whatsapp.field.MediaDisplayField.field_52422   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52422   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52422   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52422   // getName->1:     // getName->2:     // getName->N:     // ofs = 52422 ord = 8 addr = 0
	aload_0 
	iconst_1 
	putfield com.whatsapp.field.MediaDisplayField.field_52486   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52486   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52486   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52486   // getName->1:     // getName->2:     // getName->N:     // ofs = 52486 ord = 24 addr = 0
	aload_0 
	invokevirtual updateLayout( net.rim.device.api.ui.Field ) // pc=1
Label12:
	return 
	}


public final showProgress( com.whatsapp.field.MediaDisplayField, int ); // address: 0
	{
	enter 
	aload_0 
	iconst_0 
	iload_1 
	bipush 100
	invokestatic_lib int clamp( int, int, int ) // MathUtilities
	putfield com.whatsapp.field.MediaDisplayField.field_52438   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52438   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52438   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52438   // getName->1:     // getName->2:     // getName->N:     // ofs = 52438 ord = 12 addr = 0
	aload_0 
	iconst_1 
	putfield com.whatsapp.field.MediaDisplayField.field_52434   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52434   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52434   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52434   // getName->1:     // getName->2:     // getName->N:     // ofs = 52434 ord = 11 addr = 0
	return 
	}


public final hideProgress( com.whatsapp.field.MediaDisplayField ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_0 
	putfield com.whatsapp.field.MediaDisplayField.field_52434   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52434   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52434   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52434   // getName->1:     // getName->2:     // getName->N:     // ofs = 52434 ord = 11 addr = 0
	aload_0 
	iconst_0 
	putfield com.whatsapp.field.MediaDisplayField.field_52438   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52438   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52438   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52438   // getName->1:     // getName->2:     // getName->N:     // ofs = 52438 ord = 12 addr = 0
	aload_0 
	aconst_null 
	putfield com.whatsapp.field.MediaDisplayField.field_52390   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52390   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52390   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52390   // getName->1:     // getName->2:     // getName->N:     // ofs = 52390 ord = 0 addr = 0
	aload_0 
	aconst_null 
	putfield com.whatsapp.field.MediaDisplayField.field_52394   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52394   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52394   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52394   // getName->1:     // getName->2:     // getName->N:     // ofs = 52394 ord = 1 addr = 0
	return 
	}


protected final onUnfocus( com.whatsapp.field.MediaDisplayField ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib net.rim.device.api.ui.Field.onUnfocus // pc=1
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52398   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52398   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52398   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52398   // getName->1:     // getName->2:     // getName->N:     // ofs = 52398 ord = 2 addr = 0
	ifeq Label10
	aload_0 
	iconst_0 
	putfield com.whatsapp.field.MediaDisplayField.field_52398   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52398   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52398   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52398   // getName->1:     // getName->2:     // getName->N:     // ofs = 52398 ord = 2 addr = 0
	aload_0 
	invokenonvirtual com.whatsapp.field.MediaDisplayField.invalidate // pc=1
Label10:
	return 
	}


protected final boolean keyChar( com.whatsapp.field.MediaDisplayField, char, int, int ); // address: 0
	{
	enter 
	iload_1 
	bipush 10
	if_icmpne Label8
	aload_0 
	invokespecial com.whatsapp.field.MediaDisplayField.routine_3137 // pc=1
	iconst_1 
	ireturn 
Label8:
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	invokespecial_lib net.rim.device.api.ui.Field.keyChar // pc=4
	ireturn 
	}


protected final boolean navigationClick( com.whatsapp.field.MediaDisplayField, int, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_1 
	putfield com.whatsapp.field.MediaDisplayField.field_52398   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52398   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52398   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52398   // getName->1:     // getName->2:     // getName->N:     // ofs = 52398 ord = 2 addr = 0
	aload_0 
	invokenonvirtual com.whatsapp.field.MediaDisplayField.invalidate // pc=1
	iconst_1 
	ireturn 
	}


protected final boolean navigationUnclick( com.whatsapp.field.MediaDisplayField, int, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_0 
	putfield com.whatsapp.field.MediaDisplayField.field_52398   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52398   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52398   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52398   // getName->1:     // getName->2:     // getName->N:     // ofs = 52398 ord = 2 addr = 0
	aload_0 
	invokenonvirtual com.whatsapp.field.MediaDisplayField.invalidate // pc=1
	aload_0 
	invokespecial com.whatsapp.field.MediaDisplayField.routine_3137 // pc=1
	iconst_1 
	ireturn 
	}


protected final boolean trackwheelClick( com.whatsapp.field.MediaDisplayField, int, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial com.whatsapp.field.MediaDisplayField.routine_3137 // pc=1
	iconst_1 
	ireturn 
	}


protected final boolean invokeAction( com.whatsapp.field.MediaDisplayField, int ); // address: 0
	{
	enter_narrow 
	iload_1 
	iconst_1 
	if_icmpne Label8
	aload_0 
	invokespecial com.whatsapp.field.MediaDisplayField.routine_3137 // pc=1
	iconst_1 
	ireturn 
Label8:
	aload_0 
	iload_1 
	invokespecial_lib net.rim.device.api.ui.Field.invokeAction // pc=2
	ireturn 
	}


public final invalidate( com.whatsapp.field.MediaDisplayField ); // address: 0
	{
	jumpspecial_lib invalidate( net.rim.device.api.ui.Field )
	}


public final setDirty( com.whatsapp.field.MediaDisplayField, boolean ); // address: 0
	{
	noenter_return 
	}


public final setMuddy( com.whatsapp.field.MediaDisplayField, boolean ); // address: 0
	{
	noenter_return 
	}


public final int getPreferredHeight( com.whatsapp.field.MediaDisplayField ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52402   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52402   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52402   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52402   // getName->1:     // getName->2:     // getName->N:     // ofs = 52402 ord = 3 addr = 0
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	bipush 6
	iadd 
	ireturn 
	}


public final applyFont( com.whatsapp.field.MediaDisplayField ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_1 
	putfield com.whatsapp.field.MediaDisplayField.field_52486   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52486   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52486   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52486   // getName->1:     // getName->2:     // getName->N:     // ofs = 52486 ord = 24 addr = 0
	return 
	}


protected final layout( com.whatsapp.field.MediaDisplayField, int, int ); // address: 0
	{
	enter 
	aload_0 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52410   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52410   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52410   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52410   // getName->1:     // getName->2:     // getName->N:     // ofs = 52410 ord = 5 addr = 0
	ifeq Label9
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52402   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52402   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52402   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52402   // getName->1:     // getName->2:     // getName->N:     // ofs = 52402 ord = 3 addr = 0
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	bipush 6
	iadd 
	goto Label10
Label9:
	iload_1 
Label10:
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52402   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52402   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52402   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52402   // getName->1:     // getName->2:     // getName->N:     // ofs = 52402 ord = 3 addr = 0
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	bipush 6
	iadd 
	invokevirtual setExtent( net.rim.device.api.ui.Field, int, int ) // pc=3
	aload_0 
	invokevirtual net.rim.device.api.ui.XYRect getContentRect( net.rim.device.api.ui.Field ) // pc=1
	astore_3 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52410   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52410   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52410   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52410   // getName->1:     // getName->2:     // getName->N:     // ofs = 52410 ord = 5 addr = 0
	ifeq Label53
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52442   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52442   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52442   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52442   // getName->1:     // getName->2:     // getName->N:     // ofs = 52442 ord = 13 addr = 0
	aload_3 
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	bipush 3
	iadd 
	aload_3 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	bipush 3
	iadd 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52402   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52402   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52402   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52402   // getName->1:     // getName->2:     // getName->N:     // ofs = 52402 ord = 3 addr = 0
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52402   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52402   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52402   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52402   // getName->1:     // getName->2:     // getName->N:     // ofs = 52402 ord = 3 addr = 0
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	invokevirtual set( net.rim.device.api.ui.XYRect, int, int, int, int ) // pc=5
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52446   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52446   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52446   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52446   // getName->1:     // getName->2:     // getName->N:     // ofs = 52446 ord = 14 addr = 0
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52442   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52442   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52442   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52442   // getName->1:     // getName->2:     // getName->N:     // ofs = 52442 ord = 13 addr = 0
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	bipush 3
	isub 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52442   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52442   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52442   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52442   // getName->1:     // getName->2:     // getName->N:     // ofs = 52442 ord = 13 addr = 0
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	bipush 3
	isub 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52442   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52442   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52442   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52442   // getName->1:     // getName->2:     // getName->N:     // ofs = 52442 ord = 13 addr = 0
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	bipush 6
	iadd 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52442   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52442   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52442   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52442   // getName->1:     // getName->2:     // getName->N:     // ofs = 52442 ord = 13 addr = 0
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	bipush 6
	iadd 
	invokevirtual set( net.rim.device.api.ui.XYRect, int, int, int, int ) // pc=5
	return 
Label53:
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52402   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52402   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52402   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52402   // getName->1:     // getName->2:     // getName->N:     // ofs = 52402 ord = 3 addr = 0
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	istore_4 
	new_lib net.rim.device.api.ui.XYRect//net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect
	dup 
	aload_3 
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	iload_4 
	iadd 
	bipush 4
	iadd 
	bipush 4
	iadd 
	aload_3 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	bipush 2
	iadd 
	aload_3 
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	iload_4 
	isub 
	bipush 4
	isub 
	bipush 4
	isub 
	aload_3 
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	bipush 2
	isub 
	invokespecial_lib net.rim.device.api.ui.XYRect.<init> // pc=5
	astore_5 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52486   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52486   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52486   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52486   // getName->1:     // getName->2:     // getName->N:     // ofs = 52486 ord = 24 addr = 0
	ifne Label91
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52450   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52450   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52450   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52450   // getName->1:     // getName->2:     // getName->N:     // ofs = 52450 ord = 15 addr = 0
	aload_5 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label91
	return 
Label91:
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52450   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52450   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52450   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52450   // getName->1:     // getName->2:     // getName->N:     // ofs = 52450 ord = 15 addr = 0
	aload_5 
	invokevirtual set( net.rim.device.api.ui.XYRect, net.rim.device.api.ui.XYRect ) // pc=2
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52442   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52442   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52442   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52442   // getName->1:     // getName->2:     // getName->N:     // ofs = 52442 ord = 13 addr = 0
	aload_3 
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	bipush 3
	iadd 
	aload_3 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	bipush 3
	iadd 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52402   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52402   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52402   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52402   // getName->1:     // getName->2:     // getName->N:     // ofs = 52402 ord = 3 addr = 0
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52402   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52402   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52402   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52402   // getName->1:     // getName->2:     // getName->N:     // ofs = 52402 ord = 3 addr = 0
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	invokevirtual set( net.rim.device.api.ui.XYRect, int, int, int, int ) // pc=5
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	astore_6 
	aload_0 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52418   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52418   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52418   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52418   // getName->1:     // getName->2:     // getName->N:     // ofs = 52418 ord = 7 addr = 0
	ifeq Label122
	aload_6 
	iconst_0 
	aload_6 
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	bipush 2
	iadd 
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int, int ) // pc=3
	goto Label123
Label122:
	aload_6 
Label123:
	putfield com.whatsapp.field.MediaDisplayField.field_52426   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52426   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52426   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52426   // getName->1:     // getName->2:     // getName->N:     // ofs = 52426 ord = 9 addr = 0
	aload_0 
	aload_6 
	iconst_0 
	aload_6 
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	bipush 2
	isub 
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int, int ) // pc=3
	putfield com.whatsapp.field.MediaDisplayField.field_52430   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52430   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52430   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52430   // getName->1:     // getName->2:     // getName->N:     // ofs = 52430 ord = 10 addr = 0
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52454   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52454   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52454   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52454   // getName->1:     // getName->2:     // getName->N:     // ofs = 52454 ord = 16 addr = 0
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52450   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52450   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52450   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52450   // getName->1:     // getName->2:     // getName->N:     // ofs = 52450 ord = 15 addr = 0
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52450   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52450   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52450   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52450   // getName->1:     // getName->2:     // getName->N:     // ofs = 52450 ord = 15 addr = 0
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52450   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52450   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52450   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52450   // getName->1:     // getName->2:     // getName->N:     // ofs = 52450 ord = 15 addr = 0
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52450   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52450   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52450   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52450   // getName->1:     // getName->2:     // getName->N:     // ofs = 52450 ord = 15 addr = 0
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	bipush 2
	isub 
	invokevirtual set( net.rim.device.api.ui.XYRect, int, int, int, int ) // pc=5
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52458   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52458   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52458   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52458   // getName->1:     // getName->2:     // getName->N:     // ofs = 52458 ord = 17 addr = 0
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52454   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52454   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52454   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52454   // getName->1:     // getName->2:     // getName->N:     // ofs = 52454 ord = 16 addr = 0
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52454   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52454   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52454   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52454   // getName->1:     // getName->2:     // getName->N:     // ofs = 52454 ord = 16 addr = 0
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	iconst_1 
	iadd 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52454   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52454   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52454   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52454   // getName->1:     // getName->2:     // getName->N:     // ofs = 52454 ord = 16 addr = 0
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52454   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52454   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52454   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52454   // getName->1:     // getName->2:     // getName->N:     // ofs = 52454 ord = 16 addr = 0
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	bipush 2
	isub 
	invokevirtual set( net.rim.device.api.ui.XYRect, int, int, int, int ) // pc=5
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52458   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52458   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52458   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52458   // getName->1:     // getName->2:     // getName->N:     // ofs = 52458 ord = 17 addr = 0
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	iconst_1 
	iushr 
	istore_7 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52422   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52422   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52422   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52422   // getName->1:     // getName->2:     // getName->N:     // ofs = 52422 ord = 8 addr = 0
	ifnull Label189
	aload_0 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52426   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52426   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52426   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52426   // getName->1:     // getName->2:     // getName->N:     // ofs = 52426 ord = 9 addr = 0
	iload_7 
	invokestatic_lib module:WhatsApp-35.class#0.routine_6945(  ) // class#0
	putfield com.whatsapp.field.MediaDisplayField.field_52426   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52426   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52426   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52426   // getName->1:     // getName->2:     // getName->N:     // ofs = 52426 ord = 9 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52426   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52426   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52426   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52426   // getName->1:     // getName->2:     // getName->N:     // ofs = 52426 ord = 9 addr = 0
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52414   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52414   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52414   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52414   // getName->1:     // getName->2:     // getName->N:     // ofs = 52414 ord = 6 addr = 0
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52458   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52458   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52458   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52458   // getName->1:     // getName->2:     // getName->N:     // ofs = 52458 ord = 17 addr = 0
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	bipush 10
	isub 
	invokestatic_lib module:WhatsApp-35.class#0.routine_6837(  ) // class#0
	putfield com.whatsapp.field.MediaDisplayField.field_52426   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52426   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52426   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52426   // getName->1:     // getName->2:     // getName->N:     // ofs = 52426 ord = 9 addr = 0
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52458   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52458   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52458   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52458   // getName->1:     // getName->2:     // getName->N:     // ofs = 52458 ord = 17 addr = 0
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	iload_7 
	iadd 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52426   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52426   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52426   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52426   // getName->1:     // getName->2:     // getName->N:     // ofs = 52426 ord = 9 addr = 0
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	isub 
	istore 8
	goto Label219
Label189:
	aload_0 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52426   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52426   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52426   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52426   // getName->1:     // getName->2:     // getName->N:     // ofs = 52426 ord = 9 addr = 0
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52458   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52458   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52458   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52458   // getName->1:     // getName->2:     // getName->N:     // ofs = 52458 ord = 17 addr = 0
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	bipush 10
	isub 
	invokestatic_lib module:WhatsApp-35.class#0.routine_6945(  ) // class#0
	putfield com.whatsapp.field.MediaDisplayField.field_52426   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52426   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52426   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52426   // getName->1:     // getName->2:     // getName->N:     // ofs = 52426 ord = 9 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52426   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52426   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52426   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52426   // getName->1:     // getName->2:     // getName->N:     // ofs = 52426 ord = 9 addr = 0
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52414   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52414   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52414   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52414   // getName->1:     // getName->2:     // getName->N:     // ofs = 52414 ord = 6 addr = 0
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52458   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52458   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52458   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52458   // getName->1:     // getName->2:     // getName->N:     // ofs = 52458 ord = 17 addr = 0
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	bipush 10
	isub 
	invokestatic_lib module:WhatsApp-35.class#0.routine_6837(  ) // class#0
	putfield com.whatsapp.field.MediaDisplayField.field_52426   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52426   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52426   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52426   // getName->1:     // getName->2:     // getName->N:     // ofs = 52426 ord = 9 addr = 0
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52458   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52458   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52458   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52458   // getName->1:     // getName->2:     // getName->N:     // ofs = 52458 ord = 17 addr = 0
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	iload_7 
	iadd 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52426   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52426   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52426   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52426   // getName->1:     // getName->2:     // getName->N:     // ofs = 52426 ord = 9 addr = 0
	invokevirtual int getAscent( net.rim.device.api.ui.Font ) // pc=1
	iconst_1 
	iushr 
	isub 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52426   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52426   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52426   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52426   // getName->1:     // getName->2:     // getName->N:     // ofs = 52426 ord = 9 addr = 0
	invokevirtual int getLeading( net.rim.device.api.ui.Font ) // pc=1
	isub 
	istore 8
Label219:
	iload_7 
	bipush 2
	imul 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52458   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52458   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52458   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52458   // getName->1:     // getName->2:     // getName->N:     // ofs = 52458 ord = 17 addr = 0
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	if_icmpne Label226
	iinc 8 -1
Label226:
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52462   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52462   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52462   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52462   // getName->1:     // getName->2:     // getName->N:     // ofs = 52462 ord = 18 addr = 0
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52458   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52458   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52458   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52458   // getName->1:     // getName->2:     // getName->N:     // ofs = 52458 ord = 17 addr = 0
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	bipush 5
	iadd 
	iload 8
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52458   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52458   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52458   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52458   // getName->1:     // getName->2:     // getName->N:     // ofs = 52458 ord = 17 addr = 0
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	bipush 10
	isub 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52426   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52426   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52426   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52426   // getName->1:     // getName->2:     // getName->N:     // ofs = 52426 ord = 9 addr = 0
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	invokevirtual set( net.rim.device.api.ui.XYRect, int, int, int, int ) // pc=5
	iload_7 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52426   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52426   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52426   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52426   // getName->1:     // getName->2:     // getName->N:     // ofs = 52426 ord = 9 addr = 0
	invokevirtual int getDescent( net.rim.device.api.ui.Font ) // pc=1
	iadd 
	istore 9
	aload_0 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52430   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52430   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52430   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52430   // getName->1:     // getName->2:     // getName->N:     // ofs = 52430 ord = 10 addr = 0
	iload_7 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52426   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52426   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52426   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52426   // getName->1:     // getName->2:     // getName->N:     // ofs = 52426 ord = 9 addr = 0
	invokevirtual int getDescent( net.rim.device.api.ui.Font ) // pc=1
	isub 
	invokestatic_lib module:WhatsApp-35.class#0.routine_6945(  ) // class#0
	putfield com.whatsapp.field.MediaDisplayField.field_52430   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52430   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52430   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52430   // getName->1:     // getName->2:     // getName->N:     // ofs = 52430 ord = 10 addr = 0
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52466   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52466   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52466   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52466   // getName->1:     // getName->2:     // getName->N:     // ofs = 52466 ord = 19 addr = 0
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52458   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52458   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52458   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52458   // getName->1:     // getName->2:     // getName->N:     // ofs = 52458 ord = 17 addr = 0
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	bipush 5
	iadd 
	iload 9
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52458   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52458   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52458   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52458   // getName->1:     // getName->2:     // getName->N:     // ofs = 52458 ord = 17 addr = 0
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	bipush 10
	isub 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52430   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52430   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52430   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52430   // getName->1:     // getName->2:     // getName->N:     // ofs = 52430 ord = 10 addr = 0
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	invokevirtual set( net.rim.device.api.ui.XYRect, int, int, int, int ) // pc=5
	aload_0 
	aconst_null 
	putfield com.whatsapp.field.MediaDisplayField.field_52390   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52390   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52390   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52390   // getName->1:     // getName->2:     // getName->N:     // ofs = 52390 ord = 0 addr = 0
	aload_0 
	aconst_null 
	putfield com.whatsapp.field.MediaDisplayField.field_52394   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52394   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52394   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52394   // getName->1:     // getName->2:     // getName->N:     // ofs = 52394 ord = 1 addr = 0
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52470   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52470   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52470   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52470   // getName->1:     // getName->2:     // getName->N:     // ofs = 52470 ord = 20 addr = 0
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52458   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52458   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52458   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52458   // getName->1:     // getName->2:     // getName->N:     // ofs = 52458 ord = 17 addr = 0
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	bipush 10
	iadd 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52458   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52458   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52458   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52458   // getName->1:     // getName->2:     // getName->N:     // ofs = 52458 ord = 17 addr = 0
	invokevirtual int Y2( net.rim.device.api.ui.XYRect ) // pc=1
	bipush 12
	isub 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52430   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52430   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52430   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52430   // getName->1:     // getName->2:     // getName->N:     // ofs = 52430 ord = 10 addr = 0
	invokevirtual int getAscent( net.rim.device.api.ui.Font ) // pc=1
	isub 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52458   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52458   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52458   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52458   // getName->1:     // getName->2:     // getName->N:     // ofs = 52458 ord = 17 addr = 0
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	bipush 18
	isub 
	bipush 2
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52430   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52430   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52430   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52430   // getName->1:     // getName->2:     // getName->N:     // ofs = 52430 ord = 10 addr = 0
	invokevirtual int getAscent( net.rim.device.api.ui.Font ) // pc=1
	iadd 
	invokevirtual set( net.rim.device.api.ui.XYRect, int, int, int, int ) // pc=5
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52422   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52422   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52422   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52422   // getName->1:     // getName->2:     // getName->N:     // ofs = 52422 ord = 8 addr = 0
	ifnonnull Label295
	goto_w Label367
Label295:
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52430   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52430   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52430   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52430   // getName->1:     // getName->2:     // getName->N:     // ofs = 52430 ord = 10 addr = 0
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52422   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52422   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52422   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52422   // getName->1:     // getName->2:     // getName->N:     // ofs = 52422 ord = 8 addr = 0
	invokevirtual int getAdvance( net.rim.device.api.ui.Font, java.lang.String ) // pc=2
	istore 10
	iload 10
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52470   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52470   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52470   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52470   // getName->1:     // getName->2:     // getName->N:     // ofs = 52470 ord = 20 addr = 0
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	iconst_1 
	iushr 
	if_icmpge Label341
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52474   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52474   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52474   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52474   // getName->1:     // getName->2:     // getName->N:     // ofs = 52474 ord = 21 addr = 0
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52470   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52470   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52470   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52470   // getName->1:     // getName->2:     // getName->N:     // ofs = 52470 ord = 20 addr = 0
	invokevirtual int X2( net.rim.device.api.ui.XYRect ) // pc=1
	iload 10
	isub 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52470   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52470   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52470   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52470   // getName->1:     // getName->2:     // getName->N:     // ofs = 52470 ord = 20 addr = 0
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52470   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52470   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52470   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52470   // getName->1:     // getName->2:     // getName->N:     // ofs = 52470 ord = 20 addr = 0
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	iconst_1 
	iushr 
	iadd 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52430   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52430   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52430   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52430   // getName->1:     // getName->2:     // getName->N:     // ofs = 52430 ord = 10 addr = 0
	invokevirtual int getAscent( net.rim.device.api.ui.Font ) // pc=1
	iconst_1 
	iushr 
	isub 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52430   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52430   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52430   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52430   // getName->1:     // getName->2:     // getName->N:     // ofs = 52430 ord = 10 addr = 0
	invokevirtual int getLeading( net.rim.device.api.ui.Font ) // pc=1
	isub 
	iload 10
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52430   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52430   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52430   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52430   // getName->1:     // getName->2:     // getName->N:     // ofs = 52430 ord = 10 addr = 0
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	invokevirtual set( net.rim.device.api.ui.XYRect, int, int, int, int ) // pc=5
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52470   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52470   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52470   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52470   // getName->1:     // getName->2:     // getName->N:     // ofs = 52470 ord = 20 addr = 0
	dup 
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	iload 10
	bipush 10
	iadd 
	isub 
	putfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	aload_0 
	iconst_0 
	putfield com.whatsapp.field.MediaDisplayField.field_52478   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52478   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52478   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52478   // getName->1:     // getName->2:     // getName->N:     // ofs = 52478 ord = 22 addr = 0
	return 
Label341:
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52470   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52470   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52470   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52470   // getName->1:     // getName->2:     // getName->N:     // ofs = 52470 ord = 20 addr = 0
	dup 
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	bipush 2
	isub 
	putfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	aload_0 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52430   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52430   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52430   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52430   // getName->1:     // getName->2:     // getName->N:     // ofs = 52430 ord = 10 addr = 0
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52470   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52470   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52470   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52470   // getName->1:     // getName->2:     // getName->N:     // ofs = 52470 ord = 20 addr = 0
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	invokestatic_lib module:WhatsApp-35.class#0.routine_6945(  ) // class#0
	putfield com.whatsapp.field.MediaDisplayField.field_52482   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52482   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52482   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52482   // getName->1:     // getName->2:     // getName->N:     // ofs = 52482 ord = 23 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52482   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52482   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52482   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52482   // getName->1:     // getName->2:     // getName->N:     // ofs = 52482 ord = 23 addr = 0
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52422   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52422   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52422   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52422   // getName->1:     // getName->2:     // getName->N:     // ofs = 52422 ord = 8 addr = 0
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52470   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52470   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52470   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52470   // getName->1:     // getName->2:     // getName->N:     // ofs = 52470 ord = 20 addr = 0
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	bipush 12
	isub 
	bipush 24
	invokestatic_lib int max( int, int ) // Math
	invokestatic_lib module:WhatsApp-35.class#0.routine_6837(  ) // class#0
	putfield com.whatsapp.field.MediaDisplayField.field_52482   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52482   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52482   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52482   // getName->1:     // getName->2:     // getName->N:     // ofs = 52482 ord = 23 addr = 0
	aload_0 
	iconst_1 
	putfield com.whatsapp.field.MediaDisplayField.field_52478   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52478   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52478   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52478   // getName->1:     // getName->2:     // getName->N:     // ofs = 52478 ord = 22 addr = 0
Label367:
	return 
	}


protected final paint( com.whatsapp.field.MediaDisplayField, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual int getColor( net.rim.device.api.ui.Graphics ) // pc=1
	istore_2 
	aload_1 
	invokevirtual int getGlobalAlpha( net.rim.device.api.ui.Graphics ) // pc=1
	istore_3 
	aload_1 
	bipush 8
	invokevirtual boolean isDrawingStyleSet( net.rim.device.api.ui.Graphics, int ) // pc=2
	istore_4 
	aload_0 
	aload_1 
	invokespecial com.whatsapp.field.MediaDisplayField.routine_3166 // pc=2
	aload_1 
	iload_3 
	invokevirtual setGlobalAlpha( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_0 
	aload_1 
	iload_4 
	invokespecial com.whatsapp.field.MediaDisplayField.routine_3362 // pc=3
	aload_1 
	iload_3 
	invokevirtual setGlobalAlpha( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	bipush -97
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52442   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52442   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52442   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52442   // getName->1:     // getName->2:     // getName->N:     // ofs = 52442 ord = 13 addr = 0
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52442   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52442   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52442   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52442   // getName->1:     // getName->2:     // getName->N:     // ofs = 52442 ord = 13 addr = 0
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52442   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52442   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52442   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52442   // getName->1:     // getName->2:     // getName->N:     // ofs = 52442 ord = 13 addr = 0
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52442   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52442   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52442   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52442   // getName->1:     // getName->2:     // getName->N:     // ofs = 52442 ord = 13 addr = 0
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52402   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52402   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52402   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52402   // getName->1:     // getName->2:     // getName->N:     // ofs = 52402 ord = 3 addr = 0
	iconst_0 
	iconst_0 
	invokevirtual rop( net.rim.device.api.ui.Graphics, int, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=9
	aload_0 
	aload_1 
	iload_4 
	invokespecial com.whatsapp.field.MediaDisplayField.routine_3846 // pc=3
	aload_1 
	iload_2 
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	iload_3 
	invokevirtual setGlobalAlpha( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52410   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52410   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52410   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52410   // getName->1:     // getName->2:     // getName->N:     // ofs = 52410 ord = 5 addr = 0
	ifne Label60
	aload_0 
	aload_1 
	iload_4 
	invokespecial com.whatsapp.field.MediaDisplayField.routine_4023 // pc=3
	aload_0_getfield com.whatsapp.field.MediaDisplayField.field_52434   // get_name_1:  com.whatsapp.field.MediaDisplayField.field_52434   // get_name_2:  com.whatsapp.field.MediaDisplayField.field_52434   // get_Name:    com.whatsapp.field.MediaDisplayField.field_52434   // getName->1:     // getName->2:     // getName->N:     // ofs = 52434 ord = 11 addr = 0
	ifeq Label60
	aload_0 
	aload_1 
	iload_4 
	invokespecial com.whatsapp.field.MediaDisplayField.routine_4157 // pc=3
Label60:
	aload_1 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	invokevirtual setFont( net.rim.device.api.ui.Graphics, net.rim.device.api.ui.Font ) // pc=2
	aload_1 
	iload_2 
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	iload_3 
	invokevirtual setGlobalAlpha( net.rim.device.api.ui.Graphics, int ) // pc=2
	return 
	}


protected final paintBackground( com.whatsapp.field.MediaDisplayField, net.rim.device.api.ui.Graphics ); // address: 0
	{
	noenter_return 
	}


protected final drawFocus( com.whatsapp.field.MediaDisplayField, net.rim.device.api.ui.Graphics, boolean ); // address: 0
	{
	enter_narrow 
	aload_1 
	bipush 8
	iconst_1 
	invokevirtual setDrawingStyle( net.rim.device.api.ui.Graphics, int, boolean ) // pc=3
	aload_0 
	aload_1 
	invokenonvirtual com.whatsapp.field.MediaDisplayField.paintBackground // pc=2
	aload_0 
	aload_1 
	invokenonvirtual com.whatsapp.field.MediaDisplayField.paint // pc=2
	return 
	}

}