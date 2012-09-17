// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-32.cod
// Module version  : 2.8.1914
// Class ID        : 8
// ########################################################


package com.whatsapp.client;


abstract final class ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader extends Thread

{
	// @@@@@@@@@@@@@ Static fields 
	private static com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader /*com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader*/  field_54392 ; // ofs = 54392 addr = 21)

	// @@@@@@@@@@@@@ Fields 
	private java.util.Vector /*java.util.Vector*/  field_54364 ; // ofs = 54364 addr = 0)
	private java.util.Hashtable /*java.util.Hashtable*/  field_54368 ; // ofs = 54368 addr = 0)
	private java.util.Vector /*java.util.Vector*/  finishedRows ; // ofs = 54372 addr = 0)
	private Object /*java.lang.Object*/  finishedRowsLock ; // ofs = 54376 addr = 0)
	private boolean /*boolean*/  _invokeLaterQueued ; // ofs = 54380 addr = 0)
	private Object /*java.lang.Object*/  _invokeLock ; // ofs = 54384 addr = 0)
	private boolean /*boolean*/  field_54388 ; // ofs = 54388 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

private <init>( com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Thread.<init> // pc=1
	aload_0 
	new_lib net.rim.device.api.ui.FocusChangeListener//net.rim.device.api.ui.FocusChangeListener net.rim.device.api.ui.FocusChangeListener net.rim.device.api.ui.FocusChangeListener
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54364   // get_name_1:  com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54364   // get_name_2:  com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54364   // get_Name:    com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54364   // getName->1:     // getName->2:     // getName->N:     // ofs = 54364 ord = 0 addr = 0
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putfield com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54368   // get_name_1:  com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54368   // get_name_2:  com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54368   // get_Name:    com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54368   // getName->1:     // getName->2:     // getName->N:     // ofs = 54368 ord = 1 addr = 0
	aload_0 
	new_lib net.rim.device.api.ui.FocusChangeListener//net.rim.device.api.ui.FocusChangeListener net.rim.device.api.ui.FocusChangeListener net.rim.device.api.ui.FocusChangeListener
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield finishedRows   // get_name_1:  finishedRows   // get_name_2:  finishedRows   // get_Name:    finishedRows   // getName->1:  finishedRows   // getName->2:  finishedRows   // getName->N:  finishedRows   // ofs = 54372 ord = 2 addr = 0
	aload_0 
	new_lib Object//java.lang.Object java.lang.Object java.lang.Object
	dup 
	invokespecial_lib java.lang.Object.<init> // pc=1
	putfield finishedRowsLock   // get_name_1:  finishedRowsLock   // get_name_2:  finishedRowsLock   // get_Name:    finishedRowsLock   // getName->1:  finishedRowsLock   // getName->2:  finishedRowsLock   // getName->N:  finishedRowsLock   // ofs = 54376 ord = 3 addr = 0
	aload_0 
	iconst_0 
	putfield _invokeLaterQueued   // get_name_1:  _invokeLaterQueued   // get_name_2:  _invokeLaterQueued   // get_Name:    _invokeLaterQueued   // getName->1:  _invokeLaterQueued   // getName->2:  _invokeLaterQueued   // getName->N:  _invokeLaterQueued   // ofs = 54380 ord = 4 addr = 0
	aload_0 
	new_lib Object//java.lang.Object java.lang.Object java.lang.Object
	dup 
	invokespecial_lib java.lang.Object.<init> // pc=1
	putfield _invokeLock   // get_name_1:  _invokeLock   // get_name_2:  _invokeLock   // get_Name:    _invokeLock   // getName->1:  _invokeLock   // getName->2:  _invokeLock   // getName->N:  _invokeLock   // ofs = 54384 ord = 5 addr = 0
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54388   // get_name_1:  com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54388   // get_name_2:  com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54388   // get_Name:    com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54388   // getName->1:     // getName->2:     // getName->N:     // ofs = 54388 ord = 6 addr = 0
	return 
	}


static public final com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader createInstance(  ); // address: 0
	{
	enter_narrow 
	new ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader
	dup 
	invokespecial com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.<init> // pc=1
	astore_0 
	aload_0 
	invokevirtual start( java.lang.Thread ) // pc=1
	aload_0 
	areturn 
	}


static public final enqueue( com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager, boolean ); // address: 0
	{
	enter 
	getstatic com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54392 // ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader
	dup 
	astore_2 
	monitorenter 
	iload_1 
	ifeq Label13
	getstatic com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54392 // ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader
	getfield com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54364   // get_name_1:  com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54364   // get_name_2:  com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54364   // get_Name:    com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54364   // getName->1:     // getName->2:     // getName->N:     // ofs = 54364 ord = 0 addr = 0
	aload_0 
	iconst_0 
	invokevirtual insertElementAt( java.util.Vector, java.lang.Object, int ) // pc=3
	goto Label22
Label13:
	getstatic com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54392 // ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader
	getfield com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54364   // get_name_1:  com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54364   // get_name_2:  com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54364   // get_Name:    com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54364   // getName->1:     // getName->2:     // getName->N:     // ofs = 54364 ord = 0 addr = 0
	aload_0 
	invokevirtual boolean contains( java.util.Vector, java.lang.Object ) // pc=2
	ifne Label22
	getstatic com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54392 // ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader
	getfield com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54364   // get_name_1:  com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54364   // get_name_2:  com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54364   // get_Name:    com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54364   // getName->1:     // getName->2:     // getName->N:     // ofs = 54364 ord = 0 addr = 0
	aload_0 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label22:
	getstatic com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54392 // ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader
	getfield com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54388   // get_name_1:  com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54388   // get_name_2:  com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54388   // get_Name:    com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54388   // getName->1:     // getName->2:     // getName->N:     // ofs = 54388 ord = 6 addr = 0
	ifeq Label27
	getstatic com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54392 // ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader
	invokenonvirtual_lib java.lang.Object.notify // pc=1
Label27:
	aload_2 
	monitorexit 
	return 
	astore_3 
	aload_2 
	monitorexit 
	aload_3 
	athrow 
	}


static public final net.rim.device.api.system.Bitmap getBitmap( java.lang.String ); // address: 0
	{
	enter_narrow 
	aconst_null 
	astore_1 
	getstatic com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54392 // ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader
	ifnull Label11
	getstatic com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54392 // ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader
	getfield com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54368   // get_name_1:  com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54368   // get_name_2:  com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54368   // get_Name:    com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54368   // getName->1:     // getName->2:     // getName->N:     // ofs = 54368 ord = 1 addr = 0
	aload_0 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib Runnable//java.lang.Runnable java.lang.Runnable java.lang.Runnable
	astore_1 
Label11:
	aload_1 
	areturn 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	clinit_lib net.rim.device.api.ui.container.HorizontalFieldManager//net.rim.device.api.ui.container.HorizontalFieldManager net.rim.device.api.ui.container.HorizontalFieldManager net.rim.device.api.ui.container.HorizontalFieldManager
	synch_static ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader
	clinit_wait 
	invokestatic com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader createInstance(  ) // ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader
	putstatic com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54392 // ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final net.rim.device.api.system.Bitmap com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.routine_2742( com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader, java.lang.String ); // address: 0
	{
	enter 
	aconst_null 
	astore_2 
	aconst_null 
	astore_3 
	aconst_null 
	astore_4 
	aload_1 
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String ) // Connector
	checkcast_lib net.rim.device.api.ui.UiApplication//net.rim.device.api.ui.UiApplication net.rim.device.api.ui.UiApplication net.rim.device.api.ui.UiApplication
	astore_2 
	aload_2 
	invokeinterface interfacemethodref_5 // pc=1 guess=4
	astore_3 
	aload_3 
	invokestatic_lib byte[] streamToBytes( java.io.InputStream ) // IOUtilities
	astore_4 
	aload_3 
	ifnull Label23
	aload_3 
	invokevirtual close( java.io.InputStream ) // pc=1
	goto Label23
	astore_5 
Label23:
	aload_2 
	ifnull Label68
	aload_2 
	invokeinterface interfacemethodref_3 // pc=1 guess=5
	goto Label68
	astore_5 
	goto Label68
	astore_5 
	new_lib net.rim.device.api.ui.component.RichTextField//net.rim.device.api.ui.component.RichTextField net.rim.device.api.ui.component.RichTextField net.rim.device.api.ui.component.RichTextField
	dup 
	ldc literal_94:"error reading image file to make thumb: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_5 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_3 
	ifnull Label46
	aload_3 
	invokevirtual close( java.io.InputStream ) // pc=1
	goto Label46
	astore_5 
Label46:
	aload_2 
	ifnull Label68
	aload_2 
	invokeinterface interfacemethodref_3 // pc=1 guess=5
	goto Label68
	astore_5 
	goto Label68
	astore_6 
	aload_3 
	ifnull Label60
	aload_3 
	invokevirtual close( java.io.InputStream ) // pc=1
	goto Label60
	astore_7 
Label60:
	aload_2 
	ifnull Label66
	aload_2 
	invokeinterface interfacemethodref_3 // pc=1 guess=5
	goto Label66
	astore_7 
Label66:
	aload_6 
	athrow 
Label68:
	aload_4 
	ifnull Label73
	aload_4 
	arraylength 
	ifne Label83
Label73:
	new_lib net.rim.device.api.ui.component.RichTextField//net.rim.device.api.ui.component.RichTextField net.rim.device.api.ui.component.RichTextField net.rim.device.api.ui.component.RichTextField
	dup 
	ldc literal_95:"couldn't read image file to make thumb for: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aconst_null 
	areturn 
Label83:
	aload_4 
	iconst_0 
	aload_4 
	arraylength 
	invokestatic_lib net.rim.device.api.system.EncodedImage createEncodedImage( byte[], int, int ) // EncodedImage
	astore_5 
	aload_5 
	invokestatic_lib module:WhatsApp-54.class#1.routine_464(  ) // class#1
	istore_6 
	iload_6 
	ifeq Label98
	aload_5 
	invokevirtual int getWidth( net.rim.device.api.system.EncodedImage ) // pc=1
	istore_7 
	goto Label101
Label98:
	aload_5 
	invokevirtual int getHeight( net.rim.device.api.system.EncodedImage ) // pc=1
	istore_7 
Label101:
	iload_7 
	invokestatic_lib int toFP( int ) // Fixed32
	istore 8
	bipush 50
	invokestatic_lib int toFP( int ) // Fixed32
	istore 9
	iload_7 
	bipush 50
	if_icmple Label119
	iload 8
	iload 9
	invokestatic_lib int div( int, int ) // Fixed32
	istore 10
	aload_5 
	iload 10
	iload 10
	invokevirtual net.rim.device.api.system.EncodedImage scaleImage32( net.rim.device.api.system.EncodedImage, int, int ) // pc=3
	astore_5 
Label119:
	iload_6 
	ifeq Label125
	aload_5 
	invokevirtual net.rim.device.api.system.Bitmap getBitmap( net.rim.device.api.system.EncodedImage ) // pc=1
	invokestatic_lib module:WhatsApp-54.class#1.routine_380(  ) // class#1
	areturn 
Label125:
	aload_5 
	invokevirtual net.rim.device.api.system.Bitmap getBitmap( net.rim.device.api.system.EncodedImage ) // pc=1
	areturn 
	astore_5 
	new_lib net.rim.device.api.ui.component.RichTextField//net.rim.device.api.ui.component.RichTextField net.rim.device.api.ui.component.RichTextField net.rim.device.api.ui.component.RichTextField
	dup 
	ldc literal_96:"couldn't make image thumb for "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aconst_null 
	areturn 
	}


private final boolean com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.routine_3153( com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader, com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager ); // address: 0
	{
	enter 
	aload_0_getfield finishedRows   // get_name_1:  finishedRows   // get_name_2:  finishedRows   // get_Name:    finishedRows   // getName->1:  finishedRows   // getName->2:  finishedRows   // getName->N:  finishedRows   // ofs = 54372 ord = 2 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_3 
	iconst_0 
	istore_2 
Label6:
	iload_2 
	iload_3 
	if_icmpge Label22
	aload_0_getfield finishedRows   // get_name_1:  finishedRows   // get_name_2:  finishedRows   // get_Name:    finishedRows   // getName->1:  finishedRows   // getName->2:  finishedRows   // getName->N:  finishedRows   // ofs = 54372 ord = 2 addr = 0
	iload_2 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast ImagePickerInvoker$CachingThumbPicRowManager$MgrBmpPair
	astore_4 
	aload_4 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	if_acmpne Label20
	iconst_1 
	ireturn 
Label20:
	iinc 2 1
	goto Label6
Label22:
	iconst_0 
	ireturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final drainFinishedRows( com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader ); // address: 0
	{
	enter 
	aload_0_getfield _invokeLock   // get_name_1:  _invokeLock   // get_name_2:  _invokeLock   // get_Name:    _invokeLock   // getName->1:  _invokeLock   // getName->2:  _invokeLock   // getName->N:  _invokeLock   // ofs = 54384 ord = 5 addr = 0
	dup 
	astore_1 
	monitorenter 
	aload_0_getfield _invokeLaterQueued   // get_name_1:  _invokeLaterQueued   // get_name_2:  _invokeLaterQueued   // get_Name:    _invokeLaterQueued   // getName->1:  _invokeLaterQueued   // getName->2:  _invokeLaterQueued   // getName->N:  _invokeLaterQueued   // ofs = 54380 ord = 4 addr = 0
	ifeq Label10
	aload_1 
	monitorexit 
	return 
Label10:
	aload_0 
	iconst_1 
	putfield _invokeLaterQueued   // get_name_1:  _invokeLaterQueued   // get_name_2:  _invokeLaterQueued   // get_Name:    _invokeLaterQueued   // getName->1:  _invokeLaterQueued   // getName->2:  _invokeLaterQueued   // getName->N:  _invokeLaterQueued   // ofs = 54380 ord = 4 addr = 0
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	new ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader$1
	dup 
	aload_0 
	invokespecial com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader$1.<init> // pc=2
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	aload_1 
	monitorexit 
	return 
	astore_2 
	aload_1 
	monitorexit 
	aload_2 
	athrow 
	}


public final run( com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader ); // address: 0
	{
	enter 
Label1:
	aload_0 
	aload_0 
	astore_2 
	monitorenter 
	aload_0_getfield com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54364   // get_name_1:  com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54364   // get_name_2:  com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54364   // get_Name:    com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54364   // getName->1:     // getName->2:     // getName->N:     // ofs = 54364 ord = 0 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	ifne Label17
	ldc literal_90:"async pic loader sleeping"
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_0 
	iconst_1 
	putfield com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54388   // get_name_1:  com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54388   // get_name_2:  com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54388   // get_Name:    com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54388   // getName->1:     // getName->2:     // getName->N:     // ofs = 54388 ord = 6 addr = 0
	aload_0 
	invokenonvirtual_lib java.lang.Object.wait // pc=1
	goto Label17
	astore_3 
Label17:
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54388   // get_name_1:  com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54388   // get_name_2:  com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54388   // get_Name:    com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54388   // getName->1:     // getName->2:     // getName->N:     // ofs = 54388 ord = 6 addr = 0
	aload_0_getfield com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54364   // get_name_1:  com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54364   // get_name_2:  com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54364   // get_Name:    com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54364   // getName->1:     // getName->2:     // getName->N:     // ofs = 54364 ord = 0 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	ifle Label32
	aload_0_getfield com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54364   // get_name_1:  com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54364   // get_name_2:  com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54364   // get_Name:    com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54364   // getName->1:     // getName->2:     // getName->N:     // ofs = 54364 ord = 0 addr = 0
	iconst_0 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast ImagePickerInvoker$CachingThumbPicRowManager
	astore_1 
	aload_0_getfield com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54364   // get_name_1:  com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54364   // get_name_2:  com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54364   // get_Name:    com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54364   // getName->1:     // getName->2:     // getName->N:     // ofs = 54364 ord = 0 addr = 0
	iconst_0 
	invokevirtual removeElementAt( java.util.Vector, int ) // pc=2
	goto Label37
Label32:
	ldc literal_91:"async pic loader woke up but there was nothing there!"
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_2 
	monitorexit 
	goto Label1
Label37:
	aload_2 
	monitorexit 
	goto Label45
	astore_4 
	aload_2 
	monitorexit 
	aload_4 
	athrow 
Label45:
	aload_1 
	invokevirtual net.rim.device.api.ui.Screen getScreen( net.rim.device.api.ui.Field ) // pc=1
	invokevirtual boolean isVisible( net.rim.device.api.ui.Field ) // pc=1
	ifne Label50
	goto_w Label122
Label50:
	aload_1 
	getfield _bmpSet   // get_name_1:  _bmpSet   // get_name_2:  _bmpSet   // get_Name:    _bmpSet   // getName->1:  _bmpSet   // getName->2:  _bmpSet   // getName->N:  _bmpSet   // ofs = 54282 ord = 2 addr = 0
	ifne Label122
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.routine_3153 // pc=2
	ifne Label122
	aload_0_getfield com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54368   // get_name_1:  com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54368   // get_name_2:  com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54368   // get_Name:    com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54368   // getName->1:     // getName->2:     // getName->N:     // ofs = 54368 ord = 1 addr = 0
	aload_1 
	getfield _fullPath   // get_name_1:  _fullPath   // get_name_2:  _fullPath   // get_Name:    _fullPath   // getName->1:  _fullPath   // getName->2:  _fullPath   // getName->N:  _fullPath   // ofs = 54290 ord = 4 addr = 0
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib Runnable//java.lang.Runnable java.lang.Runnable java.lang.Runnable
	astore_2 
	aload_2 
	ifnonnull Label78
	aload_0 
	aload_1 
	getfield _fullPath   // get_name_1:  _fullPath   // get_name_2:  _fullPath   // get_Name:    _fullPath   // getName->1:  _fullPath   // getName->2:  _fullPath   // getName->N:  _fullPath   // ofs = 54290 ord = 4 addr = 0
	invokespecial com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.routine_2742 // pc=2
	astore_2 
	aload_2 
	ifnull Label78
	aload_0_getfield com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54368   // get_name_1:  com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54368   // get_name_2:  com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54368   // get_Name:    com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.field_54368   // getName->1:     // getName->2:     // getName->N:     // ofs = 54368 ord = 1 addr = 0
	aload_1 
	getfield _fullPath   // get_name_1:  _fullPath   // get_name_2:  _fullPath   // get_Name:    _fullPath   // getName->1:  _fullPath   // getName->2:  _fullPath   // getName->N:  _fullPath   // ofs = 54290 ord = 4 addr = 0
	aload_2 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
Label78:
	aload_2 
	ifnonnull Label81
	goto_w Label1
Label81:
	aload_1 
	invokevirtual int getIndex( net.rim.device.api.ui.Field ) // pc=1
	bipush 10
	if_icmpge Label100
	invokestatic_lib java.lang.Object getEventLock(  ) // Application
	dup 
	astore_3 
	monitorenter 
	aload_1 
	aload_2 
	invokenonvirtual com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager.setBitmap // pc=2
	aload_3 
	monitorexit 
	goto_w Label1
	astore_5 
	aload_3 
	monitorexit 
	aload_5 
	athrow 
Label100:
	aload_0_getfield finishedRowsLock   // get_name_1:  finishedRowsLock   // get_name_2:  finishedRowsLock   // get_Name:    finishedRowsLock   // getName->1:  finishedRowsLock   // getName->2:  finishedRowsLock   // getName->N:  finishedRowsLock   // ofs = 54376 ord = 3 addr = 0
	dup 
	astore_3 
	monitorenter 
	aload_0_getfield finishedRows   // get_name_1:  finishedRows   // get_name_2:  finishedRows   // get_Name:    finishedRows   // getName->1:  finishedRows   // getName->2:  finishedRows   // getName->N:  finishedRows   // ofs = 54372 ord = 2 addr = 0
	new ImagePickerInvoker$CachingThumbPicRowManager$MgrBmpPair
	dup 
	aload_1 
	aload_2 
	invokespecial com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$MgrBmpPair.<init> // pc=3
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_3 
	monitorexit 
	goto Label119
	astore_6 
	aload_3 
	monitorexit 
	aload_6 
	athrow 
Label119:
	aload_0 
	invokenonvirtual com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader.drainFinishedRows // pc=1
	goto_w Label1
Label122:
	ldc literal_92:"burning mgr from dead screen or already set."
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	goto_w Label1
	astore_2 
	new_lib net.rim.device.api.ui.component.RichTextField//net.rim.device.api.ui.component.RichTextField net.rim.device.api.ui.component.RichTextField net.rim.device.api.ui.component.RichTextField
	dup 
	ldc literal_93:"blew up dealing with mgr, error: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_2 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	goto_w Label1
	}

}
