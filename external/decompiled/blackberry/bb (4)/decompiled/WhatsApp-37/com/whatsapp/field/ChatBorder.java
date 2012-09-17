// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-37.cod
// Module version  : 2.7.3204
// Class ID        : 1
// ########################################################


package com.whatsapp.field;


abstract public final class ChatBorder extends net.rim.device.api.ui.decor.Border

{
	// @@@@@@@@@@@@@ Static fields 
	private final static java.util.Hashtable /*java.util.Hashtable*/  field_52780 ; // ofs = 52780 addr = 4)

	// @@@@@@@@@@@@@ Fields 
	private final net.rim.device.api.ui.decor.Background /*net.rim.device.api.ui.decor.Background*/  field_52756 ; // ofs = 52756 addr = 0)
	private final com.whatsapp.field.ChatBorder$BitmapCacheKey /*com.whatsapp.field.ChatBorder$BitmapCacheKey*/  field_52760 ; // ofs = 52760 addr = 0)
	private int /*int*/  field_52764 ; // ofs = 52764 addr = 0)
	private int /*int*/  field_52768 ; // ofs = 52768 addr = 0)
	private boolean /*boolean*/  field_52772 ; // ofs = 52772 addr = 0)
	private int /*int*/  field_52776 ; // ofs = 52776 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

static public final com.whatsapp.field.ChatBorder createChatBorder( boolean, int, int, int ); // address: 0
	{
	enter 
	new ChatBorder
	dup 
	iload_0 
	iload_1 
	iload_2 
	iload_3 
	invokespecial com.whatsapp.field.ChatBorder.<init> // pc=5
	astore_4 
	aload_4 
	areturn 
	}


private <init>( com.whatsapp.field.ChatBorder, boolean, int, int, int ); // address: 0
	{
	enter 
	aload_0 
	new_lib Throwable//java.lang.Throwable java.lang.Throwable java.lang.Throwable
	dup 
	bipush 2
	bipush 10
	iload_1 
	ifeq Label10
	iconst_0 
	goto Label11
Label10:
	iload_2 
Label11:
	iadd 
	bipush 2
	bipush 10
	iload_1 
	ifeq Label18
	iload_2 
	goto Label19
Label18:
	iconst_0 
Label19:
	iadd 
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=5
	bipush 4
	invokespecial_lib net.rim.device.api.ui.decor.Border.<init> // pc=3
	aload_0 
	new ChatBorder$BitmapCacheKey
	dup 
	iload_1 
	iload_2 
	iload_3 
	iload_4 
	iconst_0 
	invokespecial com.whatsapp.field.ChatBorder$BitmapCacheKey.<init> // pc=6
	putfield com.whatsapp.field.ChatBorder.field_52760   // get_name_1:  com.whatsapp.field.ChatBorder.field_52760   // get_name_2:  com.whatsapp.field.ChatBorder.field_52760   // get_Name:    com.whatsapp.field.ChatBorder.field_52760   // getName->1:     // getName->2:     // getName->N:     // ofs = 52760 ord = 1 addr = 0
	aload_0 
	iload_1 
	putfield com.whatsapp.field.ChatBorder.field_52772   // get_name_1:  com.whatsapp.field.ChatBorder.field_52772   // get_name_2:  com.whatsapp.field.ChatBorder.field_52772   // get_Name:    com.whatsapp.field.ChatBorder.field_52772   // getName->1:     // getName->2:     // getName->N:     // ofs = 52772 ord = 4 addr = 0
	aload_0 
	iload_2 
	putfield com.whatsapp.field.ChatBorder.field_52776   // get_name_1:  com.whatsapp.field.ChatBorder.field_52776   // get_name_2:  com.whatsapp.field.ChatBorder.field_52776   // get_Name:    com.whatsapp.field.ChatBorder.field_52776   // getName->1:     // getName->2:     // getName->N:     // ofs = 52776 ord = 5 addr = 0
	aload_0 
	iload_3 
	putfield com.whatsapp.field.ChatBorder.field_52764   // get_name_1:  com.whatsapp.field.ChatBorder.field_52764   // get_name_2:  com.whatsapp.field.ChatBorder.field_52764   // get_Name:    com.whatsapp.field.ChatBorder.field_52764   // getName->1:     // getName->2:     // getName->N:     // ofs = 52764 ord = 2 addr = 0
	aload_0 
	iload_4 
	putfield com.whatsapp.field.ChatBorder.field_52768   // get_name_1:  com.whatsapp.field.ChatBorder.field_52768   // get_name_2:  com.whatsapp.field.ChatBorder.field_52768   // get_Name:    com.whatsapp.field.ChatBorder.field_52768   // getName->1:     // getName->2:     // getName->N:     // ofs = 52768 ord = 3 addr = 0
	aload_0 
	new ChatBorder$1
	dup 
	aload_0 
	invokespecial com.whatsapp.field.ChatBorder$1.<init> // pc=2
	putfield com.whatsapp.field.ChatBorder.field_52756   // get_name_1:  com.whatsapp.field.ChatBorder.field_52756   // get_name_2:  com.whatsapp.field.ChatBorder.field_52756   // get_Name:    com.whatsapp.field.ChatBorder.field_52756   // getName->1:     // getName->2:     // getName->N:     // ofs = 52756 ord = 0 addr = 0
	return 
	}


static private final int com.whatsapp.field.ChatBorder.routine_2641( int, int, int, int ); // address: 0
	{
	enter 
	iload_2 
	iipush 16711680
	iand 
	bipush 16
	ishr 
	istore_4 
	iload_2 
	iipush 65280
	iand 
	bipush 8
	ishr 
	istore_5 
	iload_2 
	sipush 255
	iand 
	istore_6 
	iload_3 
	iipush 16711680
	iand 
	bipush 16
	ishr 
	istore_7 
	iload_3 
	iipush 65280
	iand 
	bipush 8
	ishr 
	istore 8
	iload_3 
	sipush 255
	iand 
	istore 9
	iload_0 
	iload_4 
	imul 
	iload_1 
	iload_7 
	imul 
	iadd 
	iload_0 
	iload_1 
	iadd 
	idiv 
	istore 10
	iload_0 
	iload_5 
	imul 
	iload_1 
	iload 8
	imul 
	iadd 
	iload_0 
	iload_1 
	iadd 
	idiv 
	istore 11
	iload_0 
	iload_6 
	imul 
	iload_1 
	iload 9
	imul 
	iadd 
	iload_0 
	iload_1 
	iadd 
	idiv 
	istore 12
	iload 10
	bipush 16
	ishl 
	iload 11
	bipush 8
	ishl 
	iadd 
	iload 12
	iadd 
	istore 13
	iload 13
	ireturn 
	}


static public final fillGradientRoundRect( net.rim.device.api.ui.Graphics, net.rim.device.api.ui.XYRect, int, int, int ); // address: 0
	{
	enter 
	new_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	dup 
	bipush 2
	aload_1 
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	invokespecial_lib net.rim.device.api.system.Bitmap.<init> // pc=3
	astore_5 
	bipush 2
	aload_1 
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	imul 
	newarray 5
	astore_6 
	aload_6 
	bipush 2
	iload_3 
	iload_4 
	invokestatic com.whatsapp.field.ChatBorder.routine_2964( int[], int, int, int ) // ChatBorder
	aload_5 
	aload_6 
	iconst_0 
	bipush 2
	iconst_0 
	iconst_0 
	bipush 2
	aload_1 
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	invokevirtual setARGB( net.rim.device.api.system.Bitmap, int[], int, int, int, int, int, int ) // pc=8
	new_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	dup 
	aload_1 
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	aload_1 
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	invokespecial_lib net.rim.device.api.system.Bitmap.<init> // pc=3
	astore_7 
	aload_7 
	invokestatic_lib module:WhatsApp-35.class#0.routine_4406(  ) // class#0
	astore 8
	aload 8
	iconst_0 
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload 8
	iconst_0 
	iconst_0 
	aload_1 
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	aload_1 
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	iload_2 
	iload_2 
	invokevirtual fillRoundRect( net.rim.device.api.ui.Graphics, int, int, int, int, int, int ) // pc=7
	aload 8
	bipush 14
	iconst_0 
	iconst_0 
	aload_1 
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	aload_1 
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	aload_5 
	iconst_0 
	iconst_0 
	invokevirtual tileRop( net.rim.device.api.ui.Graphics, int, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=9
	aload_0 
	iipush 16777215
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_0 
	aload_1 
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	aload_1 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	aload_1 
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	aload_1 
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	iload_2 
	iload_2 
	invokevirtual fillRoundRect( net.rim.device.api.ui.Graphics, int, int, int, int, int, int ) // pc=7
	aload_0 
	bipush 8
	aload_1 
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	aload_1 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	aload_1 
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	aload_1 
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	aload_7 
	iconst_0 
	iconst_0 
	invokevirtual rop( net.rim.device.api.ui.Graphics, int, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=9
	return 
	}


static private final com.whatsapp.field.ChatBorder.routine_2964( int[], int, int, int ); // address: 0
	{
	enter 
	aload_0 
	arraylength 
	iload_1 
	idiv 
	istore_4 
	iconst_0 
	istore_5 
	iload_2 
	iipush 16711680
	iand 
	bipush 8
	ishr 
	istore_6 
	iload_2 
	iipush 65280
	iand 
	istore_7 
	iload_2 
	sipush 255
	iand 
	bipush 8
	ishl 
	istore 8
	iload_3 
	iipush 16711680
	iand 
	bipush 8
	ishr 
	istore 9
	iload_3 
	iipush 65280
	iand 
	istore 10
	iload_3 
	sipush 255
	iand 
	bipush 8
	ishl 
	istore 11
	iconst_0 
	istore 12
Label42:
	iload 12
	iload_4 
	if_icmplt Label46
	goto_w Label184
Label46:
	iload_4 
	iload 12
	isub 
	istore 13
	iload 12
	istore 14
	iload 13
	iload_6 
	imul 
	iload 14
	iload 9
	imul 
	iadd 
	iload_4 
	idiv 
	istore 15
	iload 13
	iload_7 
	imul 
	iload 14
	iload 10
	imul 
	iadd 
	iload_4 
	idiv 
	istore 16
	iload 13
	iload 8
	imul 
	iload 14
	iload 11
	imul 
	iadd 
	iload_4 
	idiv 
	istore 17
	iconst_0 
	istore 18
	iconst_0 
	istore 19
	iconst_0 
	istore 20
	iconst_0 
	istore 21
Label90:
	iload 21
	iload_1 
	if_icmplt Label94
	goto_w Label182
Label94:
	iload 15
	iload 18
	iadd 
	istore 22
	iload 16
	iload 19
	iadd 
	istore 23
	iload 17
	iload 20
	iadd 
	istore 24
	iload 22
	ifge Label110
	iconst_0 
	goto Label116
Label110:
	iload 22
	iipush 65535
	if_icmple Label115
	iipush 65535
	goto Label116
Label115:
	iload 22
Label116:
	istore 22
	iload 23
	ifge Label121
	iconst_0 
	goto Label127
Label121:
	iload 23
	iipush 65535
	if_icmple Label126
	iipush 65535
	goto Label127
Label126:
	iload 23
Label127:
	istore 23
	iload 24
	ifge Label132
	iconst_0 
	goto Label138
Label132:
	iload 24
	iipush 65535
	if_icmple Label137
	iipush 65535
	goto Label138
Label137:
	iload 24
Label138:
	istore 24
	iload 22
	iipush 63488
	iand 
	istore 22
	iload 23
	iipush 64512
	iand 
	istore 23
	iload 24
	iipush 63488
	iand 
	istore 24
	iload 15
	iload 22
	isub 
	istore 18
	iload 16
	iload 23
	isub 
	istore 19
	iload 17
	iload 24
	isub 
	istore 20
	iipush -16777216
	iload 22
	bipush 8
	ishl 
	iadd 
	iload 23
	iadd 
	iload 24
	bipush 8
	ishr 
	iadd 
	istore 25
	aload_0 
	iload_5 
	iload 25
	iastore 
	iinc 5 1
	iinc 21 1
	goto_w Label90
Label182:
	iinc 12 1
	goto_w Label42
Label184:
	return 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	clinit_lib java.io.Reader//java.io.Reader java.io.Reader java.io.Reader
	synch_static ChatBorder
	clinit_wait 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putstatic com.whatsapp.field.ChatBorder.field_52780 // ChatBorder
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final net.rim.device.api.system.Bitmap[] getBackgroundBitmaps( com.whatsapp.field.ChatBorder ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.field.ChatBorder.field_52760   // get_name_1:  com.whatsapp.field.ChatBorder.field_52760   // get_name_2:  com.whatsapp.field.ChatBorder.field_52760   // get_Name:    com.whatsapp.field.ChatBorder.field_52760   // getName->1:     // getName->2:     // getName->N:     // ofs = 52760 ord = 1 addr = 0
	invokenonvirtual com.whatsapp.field.ChatBorder$BitmapCacheKey.getFieldHeight // pc=1
	ifne Label6
	aconst_null 
	areturn 
Label6:
	getstatic com.whatsapp.field.ChatBorder.field_52780 // ChatBorder
	aload_0_getfield com.whatsapp.field.ChatBorder.field_52760   // get_name_1:  com.whatsapp.field.ChatBorder.field_52760   // get_name_2:  com.whatsapp.field.ChatBorder.field_52760   // get_Name:    com.whatsapp.field.ChatBorder.field_52760   // getName->1:     // getName->2:     // getName->N:     // ofs = 52760 ord = 1 addr = 0
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib net.rim.device.api.ui.Graphics//net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics
	astore_1 
	aload_1 
	ifnull Label17
	aload_1 
	invokevirtual java.lang.Object get( java.lang.ref.Reference ) // pc=1
	checkcast_arrayobject_lib Bitmap
	goto Label18
Label17:
	aconst_null 
Label18:
	astore_2 
	aload_2 
	ifnonnull Label89
	aload_0 
	invokevirtual net.rim.device.api.ui.XYEdges getEdges( net.rim.device.api.ui.decor.Border ) // pc=1
	astore_3 
	aload_0_getfield com.whatsapp.field.ChatBorder.field_52760   // get_name_1:  com.whatsapp.field.ChatBorder.field_52760   // get_name_2:  com.whatsapp.field.ChatBorder.field_52760   // get_Name:    com.whatsapp.field.ChatBorder.field_52760   // getName->1:     // getName->2:     // getName->N:     // ofs = 52760 ord = 1 addr = 0
	invokenonvirtual com.whatsapp.field.ChatBorder$BitmapCacheKey.getFieldHeight // pc=1
	istore_4 
	aload_0 
	iload_4 
	invokespecial com.whatsapp.field.ChatBorder.routine_1655 // pc=2
	astore_5 
	aload_5 
	iconst_0 
	iconst_0 
	aload_3 
	getfield left   // get_name_1:  left   // get_name_2:  left   // get_Name:    left   // getName->1:  left   // getName->2:  left   // getName->N:  left   // ofs = -1 ord = 0 addr = -1
	iload_4 
	invokestatic_lib module:WhatsApp-9.class#2.routine_2970(  ) // class#2
	astore_6 
	aload_5 
	aload_3 
	getfield left   // get_name_1:  left   // get_name_2:  left   // get_Name:    left   // getName->1:  left   // getName->2:  left   // getName->N:  left   // ofs = -1 ord = 0 addr = -1
	iconst_0 
	aload_5 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_3 
	getfield left   // get_name_1:  left   // get_name_2:  left   // get_Name:    left   // getName->1:  left   // getName->2:  left   // getName->N:  left   // ofs = -1 ord = 0 addr = -1
	isub 
	aload_3 
	getfield right   // get_name_1:  right   // get_name_2:  right   // get_Name:    right   // getName->1:  right   // getName->2:  right   // getName->N:  right   // ofs = -1 ord = 1 addr = -1
	isub 
	iload_4 
	invokestatic_lib module:WhatsApp-9.class#2.routine_2970(  ) // class#2
	astore_7 
	aload_5 
	aload_5 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_3 
	getfield right   // get_name_1:  right   // get_name_2:  right   // get_Name:    right   // getName->1:  right   // getName->2:  right   // getName->N:  right   // ofs = -1 ord = 1 addr = -1
	isub 
	iconst_0 
	aload_3 
	getfield right   // get_name_1:  right   // get_name_2:  right   // get_Name:    right   // getName->1:  right   // getName->2:  right   // getName->N:  right   // ofs = -1 ord = 1 addr = -1
	iload_4 
	invokestatic_lib module:WhatsApp-9.class#2.routine_2970(  ) // class#2
	astore 8
	bipush 3
	newarray_object_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	dup 
	iconst_0 
	aload_6 
	aastore 
	dup 
	iconst_1 
	aload_7 
	aastore 
	dup 
	bipush 2
	aload 8
	aastore 
	astore_2 
	getstatic com.whatsapp.field.ChatBorder.field_52780 // ChatBorder
	aload_0_getfield com.whatsapp.field.ChatBorder.field_52760   // get_name_1:  com.whatsapp.field.ChatBorder.field_52760   // get_name_2:  com.whatsapp.field.ChatBorder.field_52760   // get_Name:    com.whatsapp.field.ChatBorder.field_52760   // getName->1:     // getName->2:     // getName->N:     // ofs = 52760 ord = 1 addr = 0
	new_lib net.rim.device.api.ui.Graphics//net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics
	dup 
	aload_2 
	invokespecial_lib java.lang.ref.WeakReference.<init> // pc=2
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
Label89:
	aload_2 
	areturn 
	}


private final net.rim.device.api.system.Bitmap com.whatsapp.field.ChatBorder.routine_1655( com.whatsapp.field.ChatBorder, int ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual net.rim.device.api.ui.XYEdges getEdges( net.rim.device.api.ui.decor.Border ) // pc=1
	astore_2 
	aload_2 
	getfield left   // get_name_1:  left   // get_name_2:  left   // get_Name:    left   // getName->1:  left   // getName->2:  left   // getName->N:  left   // ofs = -1 ord = 0 addr = -1
	bipush 8
	iadd 
	aload_2 
	getfield right   // get_name_1:  right   // get_name_2:  right   // get_Name:    right   // getName->1:  right   // getName->2:  right   // getName->N:  right   // ofs = -1 ord = 1 addr = -1
	iadd 
	iload_1 
	invokestatic_lib module:WhatsApp-9.class#2.routine_2916(  ) // class#2
	astore_3 
	aload_3 
	invokestatic_lib module:WhatsApp-35.class#0.routine_4406(  ) // class#0
	astore_4 
	aload_0 
	aload_4 
	aload_4 
	invokevirtual net.rim.device.api.ui.XYRect getClippingRect( net.rim.device.api.ui.Graphics ) // pc=1
	invokespecial com.whatsapp.field.ChatBorder.routine_1713 // pc=3
	aload_3 
	areturn 
	}


private final com.whatsapp.field.ChatBorder.routine_1713( com.whatsapp.field.ChatBorder, net.rim.device.api.ui.Graphics, net.rim.device.api.ui.XYRect ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual int getGlobalAlpha( net.rim.device.api.ui.Graphics ) // pc=1
	istore_3 
	aload_1 
	invokevirtual int getColor( net.rim.device.api.ui.Graphics ) // pc=1
	istore_4 
	aload_2 
	dup 
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	aload_0_getfield com.whatsapp.field.ChatBorder.field_52776   // get_name_1:  com.whatsapp.field.ChatBorder.field_52776   // get_name_2:  com.whatsapp.field.ChatBorder.field_52776   // get_Name:    com.whatsapp.field.ChatBorder.field_52776   // getName->1:     // getName->2:     // getName->N:     // ofs = 52776 ord = 5 addr = 0
	isub 
	putfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	aload_0_getfield com.whatsapp.field.ChatBorder.field_52772   // get_name_1:  com.whatsapp.field.ChatBorder.field_52772   // get_name_2:  com.whatsapp.field.ChatBorder.field_52772   // get_Name:    com.whatsapp.field.ChatBorder.field_52772   // getName->1:     // getName->2:     // getName->N:     // ofs = 52772 ord = 4 addr = 0
	ifeq Label21
	aload_2 
	dup 
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	aload_0_getfield com.whatsapp.field.ChatBorder.field_52776   // get_name_1:  com.whatsapp.field.ChatBorder.field_52776   // get_name_2:  com.whatsapp.field.ChatBorder.field_52776   // get_Name:    com.whatsapp.field.ChatBorder.field_52776   // getName->1:     // getName->2:     // getName->N:     // ofs = 52776 ord = 5 addr = 0
	iadd 
	putfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
Label21:
	aload_2 
	dup 
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	bipush 4
	isub 
	putfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	aload_2 
	dup 
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	bipush 4
	isub 
	putfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	aload_2 
	dup 
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	bipush 2
	iadd 
	putfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	aload_2 
	dup 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	bipush 2
	iadd 
	putfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	aload_1 
	sipush 255
	invokevirtual setGlobalAlpha( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	aload_2 
	bipush 8
	aload_0_getfield com.whatsapp.field.ChatBorder.field_52764   // get_name_1:  com.whatsapp.field.ChatBorder.field_52764   // get_name_2:  com.whatsapp.field.ChatBorder.field_52764   // get_Name:    com.whatsapp.field.ChatBorder.field_52764   // getName->1:     // getName->2:     // getName->N:     // ofs = 52764 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.field.ChatBorder.field_52768   // get_name_1:  com.whatsapp.field.ChatBorder.field_52768   // get_name_2:  com.whatsapp.field.ChatBorder.field_52768   // get_Name:    com.whatsapp.field.ChatBorder.field_52768   // getName->1:     // getName->2:     // getName->N:     // ofs = 52768 ord = 3 addr = 0
	invokestatic fillGradientRoundRect( net.rim.device.api.ui.Graphics, net.rim.device.api.ui.XYRect, int, int, int ) // ChatBorder
	aload_1 
	aload_0_getfield com.whatsapp.field.ChatBorder.field_52768   // get_name_1:  com.whatsapp.field.ChatBorder.field_52768   // get_name_2:  com.whatsapp.field.ChatBorder.field_52768   // get_Name:    com.whatsapp.field.ChatBorder.field_52768   // getName->1:     // getName->2:     // getName->N:     // ofs = 52768 ord = 3 addr = 0
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	iconst_1 
	iconst_1 
	invokevirtual setDrawingStyle( net.rim.device.api.ui.Graphics, int, boolean ) // pc=3
	aload_0 
	aload_1 
	aload_2 
	bipush 12
	invokespecial com.whatsapp.field.ChatBorder.routine_2422 // pc=4
	aload_1 
	iconst_0 
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	bipush 69
	invokevirtual setGlobalAlpha( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	aload_2 
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	iconst_1 
	isub 
	aload_2 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	iconst_1 
	isub 
	aload_2 
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	bipush 2
	iadd 
	aload_2 
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	bipush 2
	iadd 
	bipush 12
	bipush 12
	invokevirtual drawRoundRect( net.rim.device.api.ui.Graphics, int, int, int, int, int, int ) // pc=7
	aload_1 
	bipush 23
	invokevirtual setGlobalAlpha( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	aload_2 
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	bipush 2
	isub 
	aload_2 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	bipush 2
	isub 
	aload_2 
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	bipush 4
	iadd 
	aload_2 
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	bipush 4
	iadd 
	bipush 14
	bipush 14
	invokevirtual drawRoundRect( net.rim.device.api.ui.Graphics, int, int, int, int, int, int ) // pc=7
	aload_1 
	iconst_1 
	iconst_0 
	invokevirtual setDrawingStyle( net.rim.device.api.ui.Graphics, int, boolean ) // pc=3
	aload_0_getfield com.whatsapp.field.ChatBorder.field_52776   // get_name_1:  com.whatsapp.field.ChatBorder.field_52776   // get_name_2:  com.whatsapp.field.ChatBorder.field_52776   // get_Name:    com.whatsapp.field.ChatBorder.field_52776   // getName->1:     // getName->2:     // getName->N:     // ofs = 52776 ord = 5 addr = 0
	iconst_1 
	isub 
	istore_7 
	iload_7 
	istore 8
	aload_2 
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	bipush 10
	isub 
	iload 8
	if_icmpge Label132
	goto_w Label261
Label132:
	aload_2 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	aload_2 
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	bipush 10
	isub 
	aload_2 
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	iconst_1 
	iushr 
	iload 8
	iadd 
	iconst_1 
	iushr 
	invokestatic_lib int max( int, int ) // Math
	iadd 
	istore 9
	aload_0_getfield com.whatsapp.field.ChatBorder.field_52772   // get_name_1:  com.whatsapp.field.ChatBorder.field_52772   // get_name_2:  com.whatsapp.field.ChatBorder.field_52772   // get_Name:    com.whatsapp.field.ChatBorder.field_52772   // getName->1:     // getName->2:     // getName->N:     // ofs = 52772 ord = 4 addr = 0
	ifeq Label191
	aload_2 
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	iconst_1 
	isub 
	istore 10
	bipush 3
	newarray 5
	dup 
	iconst_0 
	iload 10
	iastore 
	dup 
	iconst_1 
	iload 10
	iload_7 
	isub 
	iastore 
	dup 
	bipush 2
	iload 10
	iastore 
	astore_5 
	bipush 3
	newarray 5
	dup 
	iconst_0 
	iload 9
	iastore 
	dup 
	iconst_1 
	iload 9
	iastore 
	dup 
	bipush 2
	iload 9
	iload 8
	isub 
	iastore 
	astore_6 
	goto Label235
Label191:
	aload_2 
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	aload_2 
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	iadd 
	iconst_1 
	isub 
	iconst_1 
	iadd 
	istore 10
	bipush 3
	newarray 5
	dup 
	iconst_0 
	iload 10
	iastore 
	dup 
	iconst_1 
	iload 10
	iload_7 
	iadd 
	iastore 
	dup 
	bipush 2
	iload 10
	iastore 
	astore_5 
	bipush 3
	newarray 5
	dup 
	iconst_0 
	iload 9
	iastore 
	dup 
	iconst_1 
	iload 9
	iastore 
	dup 
	bipush 2
	iload 9
	iload 8
	isub 
	iastore 
	astore_6 
Label235:
	aload_6 
	iconst_1 
	iaload 
	aload_2 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	isub 
	istore 10
	aload_2 
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	iload 10
	isub 
	istore 11
	iload 10
	istore 12
	iload 11
	iload 12
	aload_0_getfield com.whatsapp.field.ChatBorder.field_52764   // get_name_1:  com.whatsapp.field.ChatBorder.field_52764   // get_name_2:  com.whatsapp.field.ChatBorder.field_52764   // get_Name:    com.whatsapp.field.ChatBorder.field_52764   // getName->1:     // getName->2:     // getName->N:     // ofs = 52764 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.field.ChatBorder.field_52768   // get_name_1:  com.whatsapp.field.ChatBorder.field_52768   // get_name_2:  com.whatsapp.field.ChatBorder.field_52768   // get_Name:    com.whatsapp.field.ChatBorder.field_52768   // getName->1:     // getName->2:     // getName->N:     // ofs = 52768 ord = 3 addr = 0
	invokestatic int com.whatsapp.field.ChatBorder.routine_2641( int, int, int, int ) // ChatBorder
	istore 13
	aload_0 
	aload_1 
	iload 13
	aload_5 
	aload_6 
	invokespecial com.whatsapp.field.ChatBorder.routine_2158 // pc=5
Label261:
	aload_1 
	iload_4 
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	iload_3 
	invokevirtual setGlobalAlpha( net.rim.device.api.ui.Graphics, int ) // pc=2
	return 
	}


private final com.whatsapp.field.ChatBorder.routine_2158( com.whatsapp.field.ChatBorder, net.rim.device.api.ui.Graphics, int, int[], int[] ); // address: 0
	{
	enter 
	aload_3 
	iconst_1 
	iaload 
	aload_3 
	iconst_0 
	iaload 
	if_icmple Label10
	iconst_1 
	goto Label11
Label10:
	bipush -1
Label11:
	istore_5 
	aload_1 
	sipush 255
	invokevirtual setGlobalAlpha( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	iload_2 
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	aload_3 
	aload_4 
	aconst_null 
	aconst_null 
	invokevirtual drawFilledPath( net.rim.device.api.ui.Graphics, int[], int[], byte[], int[] ) // pc=5
	aload_1 
	aload_3 
	iconst_0 
	iaload 
	aload_4 
	iconst_0 
	iaload 
	aload_3 
	bipush 2
	iaload 
	aload_4 
	bipush 2
	iaload 
	invokevirtual drawLine( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	aload_1 
	aload_3 
	iconst_0 
	iaload 
	aload_4 
	iconst_0 
	iaload 
	aload_3 
	iconst_1 
	iaload 
	aload_4 
	iconst_1 
	iaload 
	invokevirtual drawLine( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	aload_1 
	aload_3 
	iconst_1 
	iaload 
	aload_4 
	iconst_1 
	iaload 
	aload_3 
	bipush 2
	iaload 
	aload_4 
	bipush 2
	iaload 
	invokevirtual drawLine( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	aload_1 
	bipush 96
	invokevirtual setGlobalAlpha( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	iipush 16777215
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	aload_3 
	iconst_1 
	iaload 
	aload_4 
	iconst_1 
	iaload 
	aload_3 
	bipush 2
	iaload 
	aload_4 
	bipush 2
	iaload 
	invokevirtual drawLine( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	aload_1 
	iconst_0 
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	bipush 69
	invokevirtual setGlobalAlpha( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	aload_3 
	iconst_0 
	iaload 
	iload_5 
	iadd 
	aload_4 
	iconst_0 
	iaload 
	aload_3 
	iconst_1 
	iaload 
	iload_5 
	iadd 
	aload_4 
	iconst_1 
	iaload 
	invokevirtual drawLine( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	aload_1 
	aload_3 
	iconst_1 
	iaload 
	iload_5 
	iadd 
	aload_4 
	iconst_1 
	iaload 
	aload_3 
	bipush 2
	iaload 
	iload_5 
	iadd 
	aload_4 
	bipush 2
	iaload 
	invokevirtual drawLine( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	aload_1 
	bipush 23
	invokevirtual setGlobalAlpha( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	aload_3 
	iconst_0 
	iaload 
	iload_5 
	iadd 
	iload_5 
	iadd 
	aload_4 
	iconst_0 
	iaload 
	iconst_1 
	iadd 
	aload_3 
	iconst_1 
	iaload 
	iload_5 
	iadd 
	iload_5 
	iadd 
	aload_4 
	iconst_1 
	iaload 
	iconst_1 
	iadd 
	invokevirtual drawLine( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	aload_1 
	aload_3 
	iconst_1 
	iaload 
	iload_5 
	iadd 
	iload_5 
	iadd 
	aload_4 
	iconst_1 
	iaload 
	aload_3 
	bipush 2
	iaload 
	iload_5 
	iadd 
	iload_5 
	iadd 
	aload_4 
	bipush 2
	iaload 
	invokevirtual drawLine( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	return 
	}


private final com.whatsapp.field.ChatBorder.routine_2422( com.whatsapp.field.ChatBorder, net.rim.device.api.ui.Graphics, net.rim.device.api.ui.XYRect, int ); // address: 0
	{
	enter 
	aload_1 
	bipush 96
	invokevirtual setGlobalAlpha( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	aload_2 
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	aload_2 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	aload_2 
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	aload_0 
	invokevirtual int getTop( net.rim.device.api.ui.decor.Border ) // pc=1
	bipush 2
	imul 
	invokespecial_lib net.rim.device.api.ui.XYRect.<init> // pc=5
	iconst_0 
	iconst_0 
	invokevirtual boolean pushContext( net.rim.device.api.ui.Graphics, net.rim.device.api.ui.XYRect, int, int ) // pc=4
	pop 
	aload_1 
	iipush 16777215
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	aload_2 
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	aload_2 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	aload_2 
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	aload_2 
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	iload_3 
	iload_3 
	invokevirtual drawRoundRect( net.rim.device.api.ui.Graphics, int, int, int, int, int, int ) // pc=7
	aload_1 
	invokevirtual popContext( net.rim.device.api.ui.Graphics ) // pc=1
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final net.rim.device.api.ui.decor.Background getBackground( com.whatsapp.field.ChatBorder ); // address: 0
	{
	areturn_field com.whatsapp.field.ChatBorder.field_52756   // get_name_1:  com.whatsapp.field.ChatBorder.field_52756   // get_name_2:  com.whatsapp.field.ChatBorder.field_52756   // get_Name:    com.whatsapp.field.ChatBorder.field_52756   // getName->1:     // getName->2:     // getName->N:     // ofs = 52756 ord = 0 addr = 0
	}


public final paint( com.whatsapp.field.ChatBorder, net.rim.device.api.ui.Graphics, net.rim.device.api.ui.XYRect ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual net.rim.device.api.ui.XYEdges getEdges( net.rim.device.api.ui.decor.Border ) // pc=1
	astore_3 
	aload_0_getfield com.whatsapp.field.ChatBorder.field_52760   // get_name_1:  com.whatsapp.field.ChatBorder.field_52760   // get_name_2:  com.whatsapp.field.ChatBorder.field_52760   // get_Name:    com.whatsapp.field.ChatBorder.field_52760   // getName->1:     // getName->2:     // getName->N:     // ofs = 52760 ord = 1 addr = 0
	aload_2 
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual com.whatsapp.field.ChatBorder$BitmapCacheKey.setFieldHeight // pc=2
	aload_0 
	invokespecial com.whatsapp.field.ChatBorder.getBackgroundBitmaps // pc=1
	astore_4 
	aload_4 
	ifnonnull Label14
	return 
Label14:
	aload_1 
	aload_2 
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	aload_2 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	aload_3 
	getfield left   // get_name_1:  left   // get_name_2:  left   // get_Name:    left   // getName->1:  left   // getName->2:  left   // getName->N:  left   // ofs = -1 ord = 0 addr = -1
	aload_2 
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	aload_4 
	iconst_0 
	aaload 
	iconst_0 
	iconst_0 
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=8
	aload_1 
	bipush -97
	aload_2 
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	aload_3 
	getfield left   // get_name_1:  left   // get_name_2:  left   // get_Name:    left   // getName->1:  left   // getName->2:  left   // getName->N:  left   // ofs = -1 ord = 0 addr = -1
	iadd 
	aload_2 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	aload_2 
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	aload_3 
	getfield left   // get_name_1:  left   // get_name_2:  left   // get_Name:    left   // getName->1:  left   // getName->2:  left   // getName->N:  left   // ofs = -1 ord = 0 addr = -1
	isub 
	aload_3 
	getfield right   // get_name_1:  right   // get_name_2:  right   // get_Name:    right   // getName->1:  right   // getName->2:  right   // getName->N:  right   // ofs = -1 ord = 1 addr = -1
	isub 
	aload_3 
	getfield top   // get_name_1:  top   // get_name_2:  top   // get_Name:    top   // getName->1:  top   // getName->2:  top   // getName->N:  top   // ofs = -1 ord = 2 addr = -1
	aload_4 
	iconst_1 
	aaload 
	iconst_0 
	iconst_0 
	invokevirtual tileRop( net.rim.device.api.ui.Graphics, int, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=9
	aload_1 
	bipush -97
	aload_2 
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	aload_3 
	getfield left   // get_name_1:  left   // get_name_2:  left   // get_Name:    left   // getName->1:  left   // getName->2:  left   // getName->N:  left   // ofs = -1 ord = 0 addr = -1
	iadd 
	aload_2 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	aload_2 
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	iadd 
	aload_3 
	getfield bottom   // get_name_1:  bottom   // get_name_2:  bottom   // get_Name:    bottom   // getName->1:  bottom   // getName->2:  bottom   // getName->N:  bottom   // ofs = -1 ord = 3 addr = -1
	isub 
	aload_2 
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	aload_3 
	getfield left   // get_name_1:  left   // get_name_2:  left   // get_Name:    left   // getName->1:  left   // getName->2:  left   // getName->N:  left   // ofs = -1 ord = 0 addr = -1
	isub 
	aload_3 
	getfield right   // get_name_1:  right   // get_name_2:  right   // get_Name:    right   // getName->1:  right   // getName->2:  right   // getName->N:  right   // ofs = -1 ord = 1 addr = -1
	isub 
	aload_3 
	getfield bottom   // get_name_1:  bottom   // get_name_2:  bottom   // get_Name:    bottom   // getName->1:  bottom   // getName->2:  bottom   // getName->N:  bottom   // ofs = -1 ord = 3 addr = -1
	aload_4 
	iconst_1 
	aaload 
	iconst_0 
	aload_4 
	iconst_1 
	aaload 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	aload_3 
	getfield bottom   // get_name_1:  bottom   // get_name_2:  bottom   // get_Name:    bottom   // getName->1:  bottom   // getName->2:  bottom   // getName->N:  bottom   // ofs = -1 ord = 3 addr = -1
	isub 
	invokevirtual tileRop( net.rim.device.api.ui.Graphics, int, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=9
	aload_1 
	aload_2 
	invokevirtual int X2( net.rim.device.api.ui.XYRect ) // pc=1
	aload_3 
	getfield right   // get_name_1:  right   // get_name_2:  right   // get_Name:    right   // getName->1:  right   // getName->2:  right   // getName->N:  right   // ofs = -1 ord = 1 addr = -1
	isub 
	aload_2 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	aload_3 
	getfield right   // get_name_1:  right   // get_name_2:  right   // get_Name:    right   // getName->1:  right   // getName->2:  right   // getName->N:  right   // ofs = -1 ord = 1 addr = -1
	aload_2 
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	aload_4 
	bipush 2
	aaload 
	iconst_0 
	iconst_0 
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=8
	return 
	}

}
