// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-59.cod
// Module version  : 2.8.1914
// Class ID        : 1
// ########################################################


package com.whatsapp.util;


abstract public final class NinePatchBitmap extends Object

{
	// @@@@@@@@@@@@@ Static fields 
	private final static java.util.Hashtable /*java.util.Hashtable*/  field_58308 ; // ofs = 58308 addr = 4)

	// @@@@@@@@@@@@@ Fields 
	private net.rim.device.api.system.Bitmap /*net.rim.device.api.system.Bitmap*/  field_58284 ; // ofs = 58284 addr = 0)
	private net.rim.device.api.system.Bitmap /*net.rim.device.api.system.Bitmap*/  field_58288 ; // ofs = 58288 addr = 0)
	private net.rim.device.api.system.Bitmap /*net.rim.device.api.system.Bitmap[]*/  field_58292 ; // ofs = 58292 addr = 0)
	private net.rim.device.api.ui.XYRect /*net.rim.device.api.ui.XYRect*/  field_58296 ; // ofs = 58296 addr = 0)
	private net.rim.device.api.ui.XYRect /*net.rim.device.api.ui.XYRect*/  field_58300 ; // ofs = 58300 addr = 0)
	private int /*int*/  field_58304 ; // ofs = 58304 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.util.NinePatchBitmap, net.rim.device.api.system.Bitmap ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	iconst_0 
	invokespecial com.whatsapp.util.NinePatchBitmap.<init> // pc=3
	return 
	}


public <init>( com.whatsapp.util.NinePatchBitmap, net.rim.device.api.system.Bitmap, int ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	iload_2 
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0 
	invokespecial com.whatsapp.util.NinePatchBitmap.routine_3093 // pc=1
	aload_0 
	aload_0 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iconst_1 
	iconst_1 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	bipush 2
	isub 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	bipush 2
	isub 
	invokespecial com.whatsapp.util.NinePatchBitmap.routine_2979 // pc=6
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	bipush 9
	newarray_object_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 3
	newarray 5
	dup 
	iconst_0 
	iconst_0 
	iastore 
	dup 
	iconst_1 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 0 addr = -1
	iastore 
	dup 
	bipush 2
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 0 addr = -1
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 2 addr = -1
	iadd 
	iastore 
	astore_3 
	bipush 3
	newarray 5
	dup 
	iconst_0 
	iconst_0 
	iastore 
	dup 
	iconst_1 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 1 addr = -1
	iastore 
	dup 
	bipush 2
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 1 addr = -1
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 3 addr = -1
	iadd 
	iastore 
	astore_4 
	bipush 3
	newarray 5
	dup 
	iconst_0 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 0 addr = -1
	iastore 
	dup 
	iconst_1 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 2 addr = -1
	iastore 
	dup 
	bipush 2
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 0 addr = -1
	isub 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 2 addr = -1
	isub 
	iastore 
	astore_5 
	bipush 3
	newarray 5
	dup 
	iconst_0 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 1 addr = -1
	iastore 
	dup 
	iconst_1 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 3 addr = -1
	iastore 
	dup 
	bipush 2
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 1 addr = -1
	isub 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 3 addr = -1
	isub 
	iastore 
	astore_6 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iconst_0 
	aload_0 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_3 
	iconst_0 
	iaload 
	aload_4 
	iconst_0 
	iaload 
	aload_5 
	iconst_0 
	iaload 
	aload_6 
	iconst_0 
	iaload 
	invokespecial com.whatsapp.util.NinePatchBitmap.routine_2979 // pc=6
	aastore 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iconst_1 
	aload_0 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_3 
	iconst_1 
	iaload 
	aload_4 
	iconst_0 
	iaload 
	aload_5 
	iconst_1 
	iaload 
	aload_6 
	iconst_0 
	iaload 
	invokespecial com.whatsapp.util.NinePatchBitmap.routine_2979 // pc=6
	aastore 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 2
	aload_0 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_3 
	bipush 2
	iaload 
	aload_4 
	iconst_0 
	iaload 
	aload_5 
	bipush 2
	iaload 
	aload_6 
	iconst_0 
	iaload 
	invokespecial com.whatsapp.util.NinePatchBitmap.routine_2979 // pc=6
	aastore 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 3
	aload_0 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_3 
	iconst_0 
	iaload 
	aload_4 
	iconst_1 
	iaload 
	aload_5 
	iconst_0 
	iaload 
	aload_6 
	iconst_1 
	iaload 
	invokespecial com.whatsapp.util.NinePatchBitmap.routine_2979 // pc=6
	aastore 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 4
	aload_0 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_3 
	iconst_1 
	iaload 
	aload_4 
	iconst_1 
	iaload 
	aload_5 
	iconst_1 
	iaload 
	aload_6 
	iconst_1 
	iaload 
	invokespecial com.whatsapp.util.NinePatchBitmap.routine_2979 // pc=6
	aastore 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 5
	aload_0 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_3 
	bipush 2
	iaload 
	aload_4 
	iconst_1 
	iaload 
	aload_5 
	bipush 2
	iaload 
	aload_6 
	iconst_1 
	iaload 
	invokespecial com.whatsapp.util.NinePatchBitmap.routine_2979 // pc=6
	aastore 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 6
	aload_0 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_3 
	iconst_0 
	iaload 
	aload_4 
	bipush 2
	iaload 
	aload_5 
	iconst_0 
	iaload 
	aload_6 
	bipush 2
	iaload 
	invokespecial com.whatsapp.util.NinePatchBitmap.routine_2979 // pc=6
	aastore 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 7
	aload_0 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_3 
	iconst_1 
	iaload 
	aload_4 
	bipush 2
	iaload 
	aload_5 
	iconst_1 
	iaload 
	aload_6 
	bipush 2
	iaload 
	invokespecial com.whatsapp.util.NinePatchBitmap.routine_2979 // pc=6
	aastore 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 8
	aload_0 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_3 
	bipush 2
	iaload 
	aload_4 
	bipush 2
	iaload 
	aload_5 
	bipush 2
	iaload 
	aload_6 
	bipush 2
	iaload 
	invokespecial com.whatsapp.util.NinePatchBitmap.routine_2979 // pc=6
	aastore 
	getstatic com.whatsapp.util.NinePatchBitmap.field_58308 // NinePatchBitmap
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	ifnonnull Label291
	getstatic com.whatsapp.util.NinePatchBitmap.field_58308 // NinePatchBitmap
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
Label291:
	return 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	synch_static NinePatchBitmap
	clinit_wait 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putstatic com.whatsapp.util.NinePatchBitmap.field_58308 // NinePatchBitmap
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

public final clear( com.whatsapp.util.NinePatchBitmap ); // address: 0
	{
	enter_narrow 
	getstatic com.whatsapp.util.NinePatchBitmap.field_58308 // NinePatchBitmap
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	pop 
	return 
	}


public final net.rim.device.api.ui.XYEdges getPadding( com.whatsapp.util.NinePatchBitmap ); // address: 0
	{
	enter_narrow 
	new_lib net.rim.device.api.ui.XYEdges//net.rim.device.api.ui.XYEdges net.rim.device.api.ui.XYEdges net.rim.device.api.ui.XYEdges
	dup 
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=1
	astore_1 
	aload_1 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 0 addr = -1
	putfield left   // get_name_1:  left   // get_name_2:  left   // get_Name:    left   // getName->1:  left   // getName->2:  left   // getName->N:  left   // ofs = -1 ord = 0 addr = -1
	aload_1 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 1 addr = -1
	putfield top   // get_name_1:  top   // get_name_2:  top   // get_Name:    top   // getName->1:  top   // getName->2:  top   // getName->N:  top   // ofs = -1 ord = 1 addr = -1
	aload_1 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 2 addr = -1
	isub 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 0 addr = -1
	isub 
	putfield right   // get_name_1:  right   // get_name_2:  right   // get_Name:    right   // getName->1:  right   // getName->2:  right   // getName->N:  right   // ofs = -1 ord = 2 addr = -1
	aload_1 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 3 addr = -1
	isub 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 1 addr = -1
	isub 
	putfield bottom   // get_name_1:  bottom   // get_name_2:  bottom   // get_Name:    bottom   // getName->1:  bottom   // getName->2:  bottom   // getName->N:  bottom   // ofs = -1 ord = 3 addr = -1
	aload_1 
	areturn 
	}


public final net.rim.device.api.system.Bitmap getRenderedBitmap( com.whatsapp.util.NinePatchBitmap, int, int ); // address: 0
	{
	enter 
	getstatic com.whatsapp.util.NinePatchBitmap.field_58308 // NinePatchBitmap
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	astore_3 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	iload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_84:"x"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	iload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_4 
	aload_3 
	aload_4 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	astore_5 
	aload_5 
	ifnonnull Label34
	aload_0 
	iload_1 
	iload_2 
	invokespecial com.whatsapp.util.NinePatchBitmap.routine_944 // pc=3
	astore_5 
	aload_3 
	aload_4 
	aload_5 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
Label34:
	aload_5 
	areturn 
	}


public final draw( com.whatsapp.util.NinePatchBitmap, net.rim.device.api.ui.Graphics, net.rim.device.api.ui.XYRect ); // address: 0
	{
	enter 
	aload_0 
	aload_2 
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 2 addr = -1
	aload_2 
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 3 addr = -1
	invokenonvirtual com.whatsapp.util.NinePatchBitmap.getRenderedBitmap // pc=3
	astore_3 
	aload_1 
	aload_2 
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 0 addr = -1
	aload_2 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 1 addr = -1
	aload_2 
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 2 addr = -1
	aload_2 
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 3 addr = -1
	aload_3 
	iconst_0 
	iconst_0 
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=8
	return 
	}


public final draw( com.whatsapp.util.NinePatchBitmap, net.rim.device.api.ui.Graphics, int, int, int, int ); // address: 0
	{
	enter 
	aload_0 
	iload_4 
	iload_5 
	invokenonvirtual com.whatsapp.util.NinePatchBitmap.getRenderedBitmap // pc=3
	astore_6 
	aload_1 
	iload_2 
	iload_3 
	iload_4 
	iload_5 
	aload_6 
	iconst_0 
	iconst_0 
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=8
	return 
	}


private final net.rim.device.api.system.Bitmap com.whatsapp.util.NinePatchBitmap.routine_944( com.whatsapp.util.NinePatchBitmap, int, int ); // address: 0
	{
	enter 
	new_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	dup 
	iload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.system.Bitmap.<init> // pc=3
	astore_3 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iconst_0 
	aaload 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	ifle Label35
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iconst_0 
	aaload 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	ifle Label35
	aload_0 
	aload_3 
	iconst_0 
	iconst_0 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iconst_0 
	aaload 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iconst_0 
	aaload 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iconst_0 
	aaload 
	iconst_0 
	iconst_0 
	invokespecial com.whatsapp.util.NinePatchBitmap.routine_2929 // pc=9
Label35:
	iload_1 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iconst_0 
	aaload 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	isub 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 2
	aaload 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	isub 
	istore_4 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iconst_1 
	aaload 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	newarray 5
	astore_5 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iconst_0 
	aaload 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	istore_6 
	iload_4 
	ifgt Label61
	goto_w Label227
Label61:
	iload_4 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iconst_1 
	aaload 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	idiv 
	istore_7 
	iload_4 
	iload_7 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iconst_1 
	aaload 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	imul 
	isub 
	istore 8
	aload_5 
	arraylength 
	iload 8
	isub 
	bipush 2
	idiv 
	istore 9
	aload_5 
	arraylength 
	iload 8
	isub 
	iload 9
	bipush 2
	imul 
	if_icmpeq Label94
	iconst_1 
	goto Label95
Label94:
	iconst_0 
Label95:
	istore 10
	iconst_0 
	istore 11
Label98:
	iload 11
	aload_5 
	arraylength 
	if_icmpge Label133
	aload_5 
	iload 11
	iload_7 
	iastore 
	iload 11
	iload 9
	if_icmplt Label131
	iload 11
	iload 10
	ifeq Label119
	aload_5 
	arraylength 
	iload 9
	iconst_1 
	iadd 
	isub 
	goto Label123
Label119:
	aload_5 
	arraylength 
	iload 9
	isub 
Label123:
	if_icmpge Label131
	aload_5 
	iload 11
	dup2 
	iaload 
	iconst_1 
	iadd 
	iastore 
Label131:
	iinc 11 1
	goto Label98
Label133:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iconst_1 
	aaload 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	ifgt Label139
	goto_w Label227
Label139:
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iconst_1 
	iand 
	iconst_1 
	if_icmpne Label188
	iload_1 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 2
	aaload 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	isub 
	istore 11
Label151:
	iload_6 
	iload 11
	if_icmpge Label227
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iconst_1 
	aaload 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	istore 12
	iload_6 
	iload 12
	iadd 
	iload 11
	if_icmple Label168
	iload 11
	iload_6 
	isub 
	istore 12
Label168:
	aload_0 
	aload_3 
	iload_6 
	iconst_0 
	iload 12
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iconst_1 
	aaload 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iconst_1 
	aaload 
	iconst_0 
	iconst_0 
	invokespecial com.whatsapp.util.NinePatchBitmap.routine_2929 // pc=9
	iload_6 
	iload 12
	iadd 
	istore_6 
	goto Label151
Label188:
	iconst_0 
	istore 11
Label190:
	iload 11
	aload_5 
	arraylength 
	if_icmpge Label227
	iload_6 
	iload_1 
	if_icmpge Label227
	iconst_0 
	istore 12
Label199:
	iload 12
	aload_5 
	iload 11
	iaload 
	if_icmpge Label225
	iload_6 
	iload_1 
	if_icmpge Label225
	aload_0 
	aload_3 
	iload_6 
	iinc 6 1
	iconst_0 
	iconst_1 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iconst_1 
	aaload 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iconst_1 
	aaload 
	iload 11
	iconst_0 
	invokespecial com.whatsapp.util.NinePatchBitmap.routine_2929 // pc=9
	iinc 12 1
	goto Label199
Label225:
	iinc 11 1
	goto Label190
Label227:
	iload_1 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 2
	aaload 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	isub 
	istore_6 
	iload_6 
	ifge Label238
	iconst_0 
	istore_6 
Label238:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 2
	aaload 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	ifle Label266
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 2
	aaload 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	ifle Label266
	aload_0 
	aload_3 
	iload_6 
	iconst_0 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 2
	aaload 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 2
	aaload 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 2
	aaload 
	iconst_0 
	iconst_0 
	invokespecial com.whatsapp.util.NinePatchBitmap.routine_2929 // pc=9
Label266:
	iload_2 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iconst_0 
	aaload 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	isub 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 6
	aaload 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	isub 
	istore_7 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 3
	aaload 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	newarray 5
	astore 8
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iconst_0 
	aaload 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	istore 9
	iload_7 
	ifgt Label292
	goto_w Label459
Label292:
	iload_7 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 3
	aaload 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	idiv 
	istore 10
	iload_7 
	iload 10
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 3
	aaload 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	imul 
	isub 
	istore 11
	aload 8
	arraylength 
	iload 11
	isub 
	bipush 2
	idiv 
	istore 12
	aload 8
	arraylength 
	iload 11
	isub 
	iload 12
	bipush 2
	imul 
	if_icmpeq Label325
	iconst_1 
	goto Label326
Label325:
	iconst_0 
Label326:
	istore 13
	iconst_0 
	istore 14
Label329:
	iload 14
	aload 8
	arraylength 
	if_icmpge Label364
	aload 8
	iload 14
	iload 10
	iastore 
	iload 14
	iload 12
	if_icmplt Label362
	iload 14
	iload 13
	ifeq Label350
	aload 8
	arraylength 
	iload 12
	iconst_1 
	iadd 
	isub 
	goto Label354
Label350:
	aload 8
	arraylength 
	iload 12
	isub 
Label354:
	if_icmpge Label362
	aload 8
	iload 14
	dup2 
	iaload 
	iconst_1 
	iadd 
	iastore 
Label362:
	iinc 14 1
	goto Label329
Label364:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 3
	aaload 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	ifgt Label370
	goto_w Label459
Label370:
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	bipush 2
	iand 
	bipush 2
	if_icmpne Label420
	iload_2 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 6
	aaload 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	isub 
	istore 14
Label382:
	iload 9
	iload 14
	if_icmplt Label386
	goto_w Label459
Label386:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 3
	aaload 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	istore 15
	iload 9
	iload 15
	iadd 
	iload 14
	if_icmple Label400
	iload 14
	iload 9
	isub 
	istore 15
Label400:
	aload_0 
	aload_3 
	iconst_0 
	iload 9
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 3
	aaload 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	iload 15
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 3
	aaload 
	iconst_0 
	iconst_0 
	invokespecial com.whatsapp.util.NinePatchBitmap.routine_2929 // pc=9
	iload 9
	iload 15
	iadd 
	istore 9
	goto Label382
Label420:
	iconst_0 
	istore 14
Label422:
	iload 14
	aload 8
	arraylength 
	if_icmpge Label459
	iload 9
	iload_2 
	if_icmpge Label459
	iconst_0 
	istore 15
Label431:
	iload 15
	aload 8
	iload 14
	iaload 
	if_icmpge Label457
	iload 9
	iload_2 
	if_icmpge Label457
	aload_0 
	aload_3 
	iconst_0 
	iload 9
	iinc 9 1
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 3
	aaload 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	iconst_1 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 3
	aaload 
	iconst_0 
	iload 14
	invokespecial com.whatsapp.util.NinePatchBitmap.routine_2929 // pc=9
	iinc 15 1
	goto Label431
Label457:
	iinc 14 1
	goto Label422
Label459:
	iload_4 
	ifgt Label462
	goto_w Label778
Label462:
	iload_7 
	ifgt Label465
	goto_w Label778
Label465:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iconst_1 
	aaload 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	istore 9
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	bipush 3
	iand 
	bipush 3
	if_icmpeq Label476
	goto_w Label552
Label476:
	iload_1 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 5
	aaload 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	isub 
	istore 10
	iload_2 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 7
	aaload 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	isub 
	istore 11
Label490:
	iload 9
	iload 11
	if_icmplt Label494
	goto_w Label778
Label494:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 4
	aaload 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	istore 12
	iload 9
	iload 12
	iadd 
	iload 11
	if_icmple Label508
	iload 11
	iload 9
	isub 
	istore 12
Label508:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 3
	aaload 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	istore_6 
Label513:
	iload_6 
	iload 10
	if_icmpge Label547
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 4
	aaload 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	istore 13
	iload_6 
	iload 13
	iadd 
	iload 10
	if_icmple Label530
	iload 10
	iload_6 
	isub 
	istore 13
Label530:
	aload_0 
	aload_3 
	iload_6 
	iload 9
	iload 13
	iload 12
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 4
	aaload 
	iconst_0 
	iconst_0 
	invokespecial com.whatsapp.util.NinePatchBitmap.routine_2929 // pc=9
	iload_6 
	iload 13
	iadd 
	istore_6 
	goto Label513
Label547:
	iload 9
	iload 12
	iadd 
	istore 9
	goto Label490
Label552:
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iconst_1 
	iand 
	iconst_1 
	if_icmpeq Label558
	goto_w Label630
Label558:
	iload_1 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 5
	aaload 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	isub 
	istore 10
	iconst_0 
	istore 11
Label567:
	iload 11
	aload 8
	arraylength 
	if_icmplt Label572
	goto_w Label778
Label572:
	iload 9
	iload_2 
	if_icmplt Label576
	goto_w Label778
Label576:
	iconst_0 
	istore 12
Label578:
	iload 12
	aload 8
	iload 11
	iaload 
	if_icmpge Label628
	iload 9
	iload_2 
	if_icmpge Label628
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 3
	aaload 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	istore_6 
Label591:
	iload_6 
	iload 10
	if_icmpge Label625
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 4
	aaload 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	istore 13
	iload_6 
	iload 13
	iadd 
	iload 10
	if_icmple Label608
	iload 10
	iload_6 
	isub 
	istore 13
Label608:
	aload_0 
	aload_3 
	iload_6 
	iload 9
	iload 13
	iconst_1 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 4
	aaload 
	iconst_0 
	iload 11
	invokespecial com.whatsapp.util.NinePatchBitmap.routine_2929 // pc=9
	iload_6 
	iload 13
	iadd 
	istore_6 
	goto Label591
Label625:
	iinc 9 1
	iinc 12 1
	goto Label578
Label628:
	iinc 11 1
	goto Label567
Label630:
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	bipush 2
	iand 
	bipush 2
	if_icmpeq Label636
	goto_w Label713
Label636:
	iload_2 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 7
	aaload 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	isub 
	istore 10
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 3
	aaload 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	istore_6 
	iconst_0 
	istore 11
Label650:
	iload 11
	aload_5 
	arraylength 
	if_icmplt Label655
	goto_w Label778
Label655:
	iload_6 
	iload_1 
	if_icmplt Label659
	goto_w Label778
Label659:
	iconst_0 
	istore 12
Label661:
	iload 12
	aload_5 
	iload 11
	iaload 
	if_icmpge Label711
	iload_6 
	iload_1 
	if_icmpge Label711
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iconst_1 
	aaload 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	istore 9
Label674:
	iload 9
	iload 10
	if_icmpge Label708
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 4
	aaload 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	istore 13
	iload 9
	iload 13
	iadd 
	iload 10
	if_icmple Label691
	iload 10
	iload 9
	isub 
	istore 13
Label691:
	aload_0 
	aload_3 
	iload_6 
	iload 9
	iconst_1 
	iload 13
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 4
	aaload 
	iload 11
	iconst_0 
	invokespecial com.whatsapp.util.NinePatchBitmap.routine_2929 // pc=9
	iload 9
	iload 13
	iadd 
	istore 9
	goto Label674
Label708:
	iinc 6 1
	iinc 12 1
	goto Label661
Label711:
	iinc 11 1
	goto Label650
Label713:
	iconst_0 
	istore 10
Label715:
	iload 10
	aload 8
	arraylength 
	if_icmpge Label778
	iload 9
	iload_2 
	if_icmpge Label778
	iconst_0 
	istore 11
Label724:
	iload 11
	aload 8
	iload 10
	iaload 
	if_icmpge Label776
	iload 9
	iload_2 
	if_icmpge Label776
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 3
	aaload 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	istore_6 
	iconst_0 
	istore 12
Label739:
	iload 12
	aload_5 
	arraylength 
	if_icmpge Label773
	iload_6 
	iload_1 
	if_icmpge Label773
	iconst_0 
	istore 13
Label748:
	iload 13
	aload_5 
	iload 12
	iaload 
	if_icmpge Label771
	iload_6 
	iload_1 
	if_icmpge Label771
	aload_0 
	aload_3 
	iload_6 
	iinc 6 1
	iload 9
	iconst_1 
	iconst_1 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 4
	aaload 
	iload 12
	iload 10
	invokespecial com.whatsapp.util.NinePatchBitmap.routine_2929 // pc=9
	iinc 13 1
	goto Label748
Label771:
	iinc 12 1
	goto Label739
Label773:
	iinc 9 1
	iinc 11 1
	goto Label724
Label776:
	iinc 10 1
	goto Label715
Label778:
	iload_7 
	ifgt Label781
	goto_w Label892
Label781:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 5
	aaload 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	ifgt Label787
	goto_w Label892
Label787:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 2
	aaload 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	istore 9
	iload_1 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 5
	aaload 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	isub 
	istore_6 
	iload_6 
	ifge Label803
	iconst_0 
	istore_6 
Label803:
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	bipush 2
	iand 
	bipush 2
	if_icmpne Label853
	iload_2 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 8
	aaload 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	isub 
	istore 10
Label815:
	iload 9
	iload 10
	if_icmplt Label819
	goto_w Label892
Label819:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 5
	aaload 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	istore 11
	iload 9
	iload 11
	iadd 
	iload 10
	if_icmple Label833
	iload 10
	iload 9
	isub 
	istore 11
Label833:
	aload_0 
	aload_3 
	iload_6 
	iload 9
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 5
	aaload 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	iload 11
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 5
	aaload 
	iconst_0 
	iconst_0 
	invokespecial com.whatsapp.util.NinePatchBitmap.routine_2929 // pc=9
	iload 9
	iload 11
	iadd 
	istore 9
	goto Label815
Label853:
	iconst_0 
	istore 10
Label855:
	iload 10
	aload 8
	arraylength 
	if_icmpge Label892
	iload 9
	iload_2 
	if_icmpge Label892
	iconst_0 
	istore 11
Label864:
	iload 11
	aload 8
	iload 10
	iaload 
	if_icmpge Label890
	iload 9
	iload_2 
	if_icmpge Label890
	aload_0 
	aload_3 
	iload_6 
	iload 9
	iinc 9 1
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 5
	aaload 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	iconst_1 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 5
	aaload 
	iconst_0 
	iload 10
	invokespecial com.whatsapp.util.NinePatchBitmap.routine_2929 // pc=9
	iinc 11 1
	goto Label864
Label890:
	iinc 10 1
	goto Label855
Label892:
	iload_2 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 6
	aaload 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	isub 
	istore 9
	iload 9
	ifge Label903
	iconst_0 
	istore 9
Label903:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 6
	aaload 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	ifle Label931
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 6
	aaload 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	ifle Label931
	aload_0 
	aload_3 
	iconst_0 
	iload 9
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 6
	aaload 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 6
	aaload 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 6
	aaload 
	iconst_0 
	iconst_0 
	invokespecial com.whatsapp.util.NinePatchBitmap.routine_2929 // pc=9
Label931:
	iload_4 
	ifgt Label934
	goto_w Label1045
Label934:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 7
	aaload 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	ifgt Label940
	goto_w Label1045
Label940:
	iload_2 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 7
	aaload 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	isub 
	istore 9
	iload 9
	ifge Label951
	iconst_0 
	istore 9
Label951:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 6
	aaload 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	istore_6 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iconst_1 
	iand 
	iconst_1 
	if_icmpne Label1006
	iload_1 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 8
	aaload 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	isub 
	istore 10
Label968:
	iload_6 
	iload 10
	if_icmplt Label972
	goto_w Label1045
Label972:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 7
	aaload 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	istore 11
	iload_6 
	iload 11
	iadd 
	iload 10
	if_icmple Label986
	iload 10
	iload_6 
	isub 
	istore 11
Label986:
	aload_0 
	aload_3 
	iload_6 
	iload 9
	iload 11
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 7
	aaload 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 7
	aaload 
	iconst_0 
	iconst_0 
	invokespecial com.whatsapp.util.NinePatchBitmap.routine_2929 // pc=9
	iload_6 
	iload 11
	iadd 
	istore_6 
	goto Label968
Label1006:
	iconst_0 
	istore 10
Label1008:
	iload 10
	aload_5 
	arraylength 
	if_icmpge Label1045
	iload_6 
	iload_1 
	if_icmpge Label1045
	iconst_0 
	istore 11
Label1017:
	iload 11
	aload_5 
	iload 10
	iaload 
	if_icmpge Label1043
	iload_6 
	iload_1 
	if_icmpge Label1043
	aload_0 
	aload_3 
	iload_6 
	iinc 6 1
	iload 9
	iconst_1 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 7
	aaload 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 7
	aaload 
	iload 10
	iconst_0 
	invokespecial com.whatsapp.util.NinePatchBitmap.routine_2929 // pc=9
	iinc 11 1
	goto Label1017
Label1043:
	iinc 10 1
	goto Label1008
Label1045:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 8
	aaload 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	ifle Label1095
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 8
	aaload 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	ifle Label1095
	iload_1 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 8
	aaload 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	isub 
	istore_6 
	iload_6 
	ifge Label1066
	iconst_0 
	istore_6 
Label1066:
	iload_2 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 8
	aaload 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	isub 
	istore 9
	iload 9
	ifge Label1077
	iconst_0 
	istore 9
Label1077:
	aload_0 
	aload_3 
	iload_6 
	iload 9
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 8
	aaload 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 8
	aaload 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 8
	aaload 
	iconst_0 
	iconst_0 
	invokespecial com.whatsapp.util.NinePatchBitmap.routine_2929 // pc=9
Label1095:
	aload_3 
	areturn 
	}


private final com.whatsapp.util.NinePatchBitmap.routine_2929( com.whatsapp.util.NinePatchBitmap, net.rim.device.api.system.Bitmap, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ); // address: 0
	{
	enter 
	iload_4 
	iload_5 
	imul 
	newarray 5
	astore 9
	aload_6 
	aload 9
	iconst_0 
	iload_4 
	iload_7 
	iload 8
	iload_4 
	iload_5 
	invokevirtual getARGB( net.rim.device.api.system.Bitmap, int[], int, int, int, int, int, int ) // pc=8
	aload_1 
	aload 9
	iconst_0 
	iload_4 
	iload_2 
	iload_3 
	iload_4 
	iload_5 
	invokevirtual setARGB( net.rim.device.api.system.Bitmap, int[], int, int, int, int, int, int ) // pc=8
	return 
	}


private final net.rim.device.api.system.Bitmap com.whatsapp.util.NinePatchBitmap.routine_2979( com.whatsapp.util.NinePatchBitmap, net.rim.device.api.system.Bitmap, int, int, int, int ); // address: 0
	{
	enter 
	iload_2 
	iflt Label17
	iload_3 
	iflt Label17
	iload_2 
	iload_4 
	iadd 
	aload_1 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	if_icmpgt Label17
	iload_3 
	iload_5 
	iadd 
	aload_1 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	if_icmple Label22
Label17:
	new_lib IllegalArgumentException//java.lang.IllegalArgumentException java.lang.IllegalArgumentException java.lang.IllegalArgumentException
	dup 
	ldc literal_85:"must not specify a rectangle that falls outside of the source bitmap"
	invokespecial_lib java.lang.IllegalArgumentException.<init> // pc=2
	athrow 
Label22:
	new_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	dup 
	iload_4 
	iload_5 
	invokespecial_lib net.rim.device.api.system.Bitmap.<init> // pc=3
	astore_6 
	iload_4 
	iload_5 
	imul 
	newarray 5
	astore_7 
	aload_1 
	aload_7 
	iconst_0 
	iload_4 
	iload_2 
	iload_3 
	iload_4 
	iload_5 
	invokevirtual getARGB( net.rim.device.api.system.Bitmap, int[], int, int, int, int, int, int ) // pc=8
	aload_6 
	aload_7 
	iconst_0 
	iload_4 
	iconst_0 
	iconst_0 
	iload_4 
	iload_5 
	invokevirtual setARGB( net.rim.device.api.system.Bitmap, int[], int, int, int, int, int, int ) // pc=8
	aload_6 
	areturn 
	}


private final com.whatsapp.util.NinePatchBitmap.routine_3093( com.whatsapp.util.NinePatchBitmap ); // address: 0
	{
	enter 
	aload_0 
	new_lib net.rim.device.api.ui.XYRect//net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect
	dup 
	invokespecial_lib net.rim.device.api.ui.XYRect.<init> // pc=1
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	new_lib net.rim.device.api.ui.XYRect//net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect
	dup 
	invokespecial_lib net.rim.device.api.ui.XYRect.<init> // pc=1
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	istore_1 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	istore_2 
	iload_2 
	newarray 5
	astore_3 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_3 
	iconst_0 
	iload_2 
	iconst_0 
	iconst_0 
	iload_2 
	iconst_1 
	invokevirtual getARGB( net.rim.device.api.system.Bitmap, int[], int, int, int, int, int, int ) // pc=8
	iconst_0 
	istore_4 
	iconst_0 
	istore_5 
Label33:
	iload_5 
	aload_3 
	arraylength 
	if_icmpge Label66
	iload_4 
	ifne Label50
	aload_3 
	iload_5 
	iaload 
	iipush -16777216
	if_icmpne Label50
	iconst_1 
	istore_4 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iload_5 
	putfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 0 addr = -1
	goto Label64
Label50:
	iload_4 
	ifeq Label64
	aload_3 
	iload_5 
	iaload 
	iipush -16777216
	if_icmpeq Label64
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iload_5 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 0 addr = -1
	isub 
	putfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 2 addr = -1
	goto Label66
Label64:
	iinc 5 1
	goto Label33
Label66:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_3 
	iconst_0 
	iload_2 
	iconst_0 
	iload_1 
	iconst_1 
	isub 
	iload_2 
	iconst_1 
	invokevirtual getARGB( net.rim.device.api.system.Bitmap, int[], int, int, int, int, int, int ) // pc=8
	iconst_0 
	istore_4 
	iconst_0 
	istore_5 
Label81:
	iload_5 
	aload_3 
	arraylength 
	if_icmpge Label114
	iload_4 
	ifne Label98
	aload_3 
	iload_5 
	iaload 
	iipush -16777216
	if_icmpne Label98
	iconst_1 
	istore_4 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_5 
	putfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 0 addr = -1
	goto Label112
Label98:
	iload_4 
	ifeq Label112
	aload_3 
	iload_5 
	iaload 
	iipush -16777216
	if_icmpeq Label112
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_5 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 0 addr = -1
	isub 
	putfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 2 addr = -1
	goto Label114
Label112:
	iinc 5 1
	goto Label81
Label114:
	iload_1 
	newarray 5
	astore_3 
	iconst_0 
	istore_4 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_3 
	iconst_0 
	iconst_1 
	iconst_0 
	iconst_0 
	iconst_1 
	iload_1 
	invokevirtual getARGB( net.rim.device.api.system.Bitmap, int[], int, int, int, int, int, int ) // pc=8
	iconst_0 
	istore_5 
Label130:
	iload_5 
	aload_3 
	arraylength 
	if_icmpge Label163
	iload_4 
	ifne Label147
	aload_3 
	iload_5 
	iaload 
	iipush -16777216
	if_icmpne Label147
	iconst_1 
	istore_4 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iload_5 
	putfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 1 addr = -1
	goto Label161
Label147:
	iload_4 
	ifeq Label161
	aload_3 
	iload_5 
	iaload 
	iipush -16777216
	if_icmpeq Label161
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iload_5 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 1 addr = -1
	isub 
	putfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 3 addr = -1
	goto Label163
Label161:
	iinc 5 1
	goto Label130
Label163:
	iconst_0 
	istore_4 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_3 
	iconst_0 
	iconst_1 
	iload_2 
	iconst_1 
	isub 
	iconst_0 
	iconst_1 
	iload_1 
	invokevirtual getARGB( net.rim.device.api.system.Bitmap, int[], int, int, int, int, int, int ) // pc=8
	iconst_0 
	istore_5 
Label178:
	iload_5 
	aload_3 
	arraylength 
	if_icmpge Label211
	iload_4 
	ifne Label195
	aload_3 
	iload_5 
	iaload 
	iipush -16777216
	if_icmpne Label195
	iconst_1 
	istore_4 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_5 
	putfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 1 addr = -1
	goto Label209
Label195:
	iload_4 
	ifeq Label209
	aload_3 
	iload_5 
	iaload 
	iipush -16777216
	if_icmpeq Label209
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_5 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 1 addr = -1
	isub 
	putfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 3 addr = -1
	goto Label211
Label209:
	iinc 5 1
	goto Label178
Label211:
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	dup 
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 0 addr = -1
	iconst_1 
	isub 
	putfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 0 addr = -1
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	dup 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 1 addr = -1
	iconst_1 
	isub 
	putfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 1 addr = -1
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	dup 
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 0 addr = -1
	iconst_1 
	isub 
	putfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 0 addr = -1
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	dup 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 1 addr = -1
	iconst_1 
	isub 
	putfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 1 addr = -1
	return 
	}

}
