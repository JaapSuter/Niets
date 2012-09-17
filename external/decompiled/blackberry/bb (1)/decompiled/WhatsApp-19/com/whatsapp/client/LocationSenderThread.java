// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-21.cod
// Module version  : 2.7.3204
// Class ID        : 6
// ########################################################


package com.whatsapp.client;


abstract public final class LocationSenderThread extends Thread

{
	// @@@@@@@@@@@@@ Static fields 
	private static String /*java.lang.String*/  field_57084 ; // ofs = 57084 addr = 14)

	// @@@@@@@@@@@@@ Fields 
	private com.whatsapp.client.LocationSenderThread$Listener /*com.whatsapp.client.LocationSenderThread$Listener*/  _listener ; // ofs = 57036 addr = 0)
	private final com.whatsapp.client.MediaData /*module:WhatsApp-23.class#0*/  field_57040 ; // ofs = 57040 addr = 0)
	private boolean /*boolean*/  _cancelled ; // ofs = 57044 addr = 0)
	private boolean /*boolean*/  _sentDone ; // ofs = 57048 addr = 0)
	private boolean /*boolean*/  field_57052 ; // ofs = 57052 addr = 0)
	private final Object /*java.lang.Object*/  _listenerLock ; // ofs = 57056 addr = 0)
	private com.whatsapp.client.LocationSenderThread$ProgressUpdater /*com.whatsapp.client.LocationSenderThread$ProgressUpdater*/  field_57060 ; // ofs = 57060 addr = 0)
	private javax.microedition.location.LocationProvider /*javax.microedition.location.LocationProvider*/  field_57064 ; // ofs = 57064 addr = 0)
	private int /*int*/  field_57068 ; // ofs = 57068 addr = 0)
	private String /*java.lang.String*/  field_57072 ; // ofs = 57072 addr = 0)
	private double /*double*/  field_57076 ; // ofs = 57076 addr = 0)
	private double /*double*/  field_57080 ; // ofs = 57080 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.LocationSenderThread, com.whatsapp.client.LocationSenderThread$Listener, module:WhatsApp-23.class#0 ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Thread.<init> // pc=1
	aload_0 
	new_lib net.rim.device.api.ui.container.VerticalFieldManager//net.rim.device.api.ui.container.VerticalFieldManager net.rim.device.api.ui.container.VerticalFieldManager net.rim.device.api.ui.container.VerticalFieldManager
	dup 
	invokespecial_lib java.lang.Object.<init> // pc=1
	putfield _listenerLock   // get_name_1:  _listenerLock   // get_name_2:  _listenerLock   // get_Name:    _listenerLock   // getName->1:  _listenerLock   // getName->2:  _listenerLock   // getName->N:  _listenerLock   // ofs = 57056 ord = 5 addr = 0
	aload_0 
	bipush -1
	putfield com.whatsapp.client.LocationSenderThread.field_57068   // get_name_1:  com.whatsapp.client.LocationSenderThread.field_57068   // get_name_2:  com.whatsapp.client.LocationSenderThread.field_57068   // get_Name:    com.whatsapp.client.LocationSenderThread.field_57068   // getName->1:     // getName->2:     // getName->N:     // ofs = 57068 ord = 8 addr = 0
	aload_0 
	aload_2 
	putfield com.whatsapp.client.LocationSenderThread.field_57040   // get_name_1:  com.whatsapp.client.LocationSenderThread.field_57040   // get_name_2:  com.whatsapp.client.LocationSenderThread.field_57040   // get_Name:    com.whatsapp.client.LocationSenderThread.field_57040   // getName->1:     // getName->2:     // getName->N:     // ofs = 57040 ord = 1 addr = 0
	aload_0 
	aload_1 
	putfield _listener   // get_name_1:  _listener   // get_name_2:  _listener   // get_Name:    _listener   // getName->1:  _listener   // getName->2:  _listener   // getName->N:  _listener   // ofs = 57036 ord = 0 addr = 0
	return 
	}


static private final javax.microedition.location.Criteria com.whatsapp.client.LocationSenderThread.routine_3378( int ); // address: 0
	{
	enter_narrow 
	new_lib javax.microedition.location.Criteria//javax.microedition.location.Criteria javax.microedition.location.Criteria javax.microedition.location.Criteria
	dup 
	invokespecial_lib javax.microedition.location.Criteria.<init> // pc=1
	astore_1 
	iload_0 
Label7:
	aload_1 
	iconst_0 
	invokevirtual setPreferredPowerConsumption( javax.microedition.location.Criteria, int ) // pc=2
	aload_1 
	sipush 1000
	invokevirtual setHorizontalAccuracy( javax.microedition.location.Criteria, int ) // pc=2
	aload_1 
	iconst_1 
	invokevirtual setCostAllowed( javax.microedition.location.Criteria, boolean ) // pc=2
	aload_1 
	bipush 120
	invokevirtual setPreferredResponseTime( javax.microedition.location.Criteria, int ) // pc=2
	aload_1 
	areturn 
Label21:
	aload_1 
	iconst_1 
	invokevirtual setCostAllowed( javax.microedition.location.Criteria, boolean ) // pc=2
	aload_1 
	iconst_0 
	invokevirtual setHorizontalAccuracy( javax.microedition.location.Criteria, int ) // pc=2
	aload_1 
	iconst_0 
	invokevirtual setVerticalAccuracy( javax.microedition.location.Criteria, int ) // pc=2
	aload_1 
	iconst_0 
	invokevirtual setPreferredPowerConsumption( javax.microedition.location.Criteria, int ) // pc=2
	aload_1 
	areturn 
Label35:
	aload_1 
	iconst_1 
	invokevirtual setPreferredPowerConsumption( javax.microedition.location.Criteria, int ) // pc=2
	aload_1 
	iconst_0 
	invokevirtual setHorizontalAccuracy( javax.microedition.location.Criteria, int ) // pc=2
	aload_1 
	iconst_0 
	invokevirtual setVerticalAccuracy( javax.microedition.location.Criteria, int ) // pc=2
	aload_1 
	iconst_1 
	invokevirtual setCostAllowed( javax.microedition.location.Criteria, boolean ) // pc=2
	aload_1 
	areturn 
Label49:
	aload_1 
	bipush 2
	invokevirtual setPreferredPowerConsumption( javax.microedition.location.Criteria, int ) // pc=2
	aload_1 
	sipush 1000
	invokevirtual setHorizontalAccuracy( javax.microedition.location.Criteria, int ) // pc=2
	aload_1 
	sipush 1000
	invokevirtual setVerticalAccuracy( javax.microedition.location.Criteria, int ) // pc=2
	aload_1 
	iconst_1 
	invokevirtual setCostAllowed( javax.microedition.location.Criteria, boolean ) // pc=2
	aload_1 
	areturn 
Label63:
	aload_1 
	sipush 1000
	invokevirtual setHorizontalAccuracy( javax.microedition.location.Criteria, int ) // pc=2
	aload_1 
	sipush 1000
	invokevirtual setVerticalAccuracy( javax.microedition.location.Criteria, int ) // pc=2
	aload_1 
	iconst_0 
	invokevirtual setCostAllowed( javax.microedition.location.Criteria, boolean ) // pc=2
	aload_1 
	iconst_1 
	invokevirtual setPreferredPowerConsumption( javax.microedition.location.Criteria, int ) // pc=2
	aload_1 
	areturn 
Label77:
	aconst_null 
	areturn 
Label79:
	aload_1 
	areturn 
	}


static public final net.rim.device.api.system.Bitmap grabMapLocationThumbnail( double, double ); // address: 0
	{
	enter 
	aconst_null 
	astore_4 
	aload_4 
	ifnonnull Label11
	isreal 
	lload 0
	isreal 
	lload 2
	invokestatic net.rim.device.api.system.Bitmap com.whatsapp.client.LocationSenderThread.routine_3628( double, double ) // LocationSenderThread
	astore_4 
Label11:
	aload_4 
	areturn 
	}


static private final net.rim.device.api.system.Bitmap com.whatsapp.client.LocationSenderThread.routine_3628( double, double ); // address: 0
	{
	enter 
	aconst_null 
	astore_4 
	aconst_null 
	astore_5 
	sipush 24000
	newarray 2
	astore_7 
	getstatic com.whatsapp.client.LocationSenderThread.field_57084 // LocationSenderThread
	bipush 2
	newarray_object_lib net.rim.device.api.ui.container.VerticalFieldManager//net.rim.device.api.ui.container.VerticalFieldManager net.rim.device.api.ui.container.VerticalFieldManager net.rim.device.api.ui.container.VerticalFieldManager
	dup 
	iconst_0 
	isreal 
	lload 0
	invokestatic_lib java.lang.String toString( double ) // Double
	aastore 
	dup 
	iconst_1 
	isreal 
	lload 2
	invokestatic_lib java.lang.String toString( double ) // Double
	aastore 
	invokestatic_lib java.lang.String format( java.lang.String, java.lang.Object[] ) // MessageFormat
	astore 8
	iconst_1 
	sipush 30000
	i2l 
	invokestatic_lib module:WhatsApp-32.class#2.routine_2443(  ) // class#2
	astore 9
	aload 9
	ifnonnull Label48
	aconst_null 
	astore 10
	aload_5 
	ifnull Label40
	aload_5 
	invokevirtual close( java.io.InputStream ) // pc=1
	goto Label40
	astore 11
Label40:
	aload_4 
	ifnull Label46
	aload_4 
	invokeinterface interfacemethodref_203 // pc=1 guess=3
	goto Label46
	astore 11
Label46:
	aload 10
	areturn 
Label48:
	new_lib net.rim.device.api.ui.XYRect//net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload 8
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload 9
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	bipush 3
	iconst_1 
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String, int, boolean ) // Connector
	checkcast_lib net.rim.device.api.i18n.ResourceBundle//net.rim.device.api.i18n.ResourceBundle net.rim.device.api.i18n.ResourceBundle net.rim.device.api.i18n.ResourceBundle
	astore_4 
	aload_4 
	invokeinterface interfacemethodref_204 // pc=1 guess=4
	istore_6 
	iload_6 
	sipush 200
	if_icmpeq Label78
	new_lib IllegalArgumentException//java.lang.IllegalArgumentException java.lang.IllegalArgumentException java.lang.IllegalArgumentException
	dup 
	new_lib net.rim.device.api.ui.XYRect//net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect
	dup 
	ldc literal_1468:"HTTP response code: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload_6 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label78:
	aload_4 
	invokeinterface interfacemethodref_205 // pc=1 guess=5
	astore_5 
	iconst_0 
	istore 10
	iconst_0 
	istore 11
Label85:
	iload 11
	sipush 24000
	if_icmpge Label107
	sipush 24000
	iload 11
	isub 
	istore 12
	aload_5 
	aload_7 
	iload 11
	iload 12
	invokevirtual int read( java.io.InputStream, byte[], int, int ) // pc=4
	istore 10
	iload 10
	bipush -1
	if_icmpne Label102
	goto Label107
Label102:
	iload 11
	iload 10
	iadd 
	istore 11
	goto Label85
Label107:
	aload_7 
	iconst_0 
	iload 11
	invokestatic_lib net.rim.device.api.system.EncodedImage createEncodedImage( byte[], int, int ) // EncodedImage
	astore 13
	aload 13
	invokevirtual net.rim.device.api.system.Bitmap getBitmap( net.rim.device.api.system.EncodedImage ) // pc=1
	astore 14
	new_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	dup 
	bipush 100
	bipush 100
	invokespecial_lib net.rim.device.api.system.Bitmap.<init> // pc=3
	astore 15
	aload 15
	invokestatic_lib module:WhatsApp-32.class#2.routine_5644(  ) // class#2
	astore 16
	aload 16
	iconst_0 
	iconst_0 
	bipush 100
	bipush 100
	aload 14
	bipush 50
	bipush 50
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=8
	aload 15
	astore 17
	aload_5 
	ifnull Label141
	aload_5 
	invokevirtual close( java.io.InputStream ) // pc=1
	goto Label141
	astore 18
Label141:
	aload_4 
	ifnull Label147
	aload_4 
	invokeinterface interfacemethodref_203 // pc=1 guess=3
	goto Label147
	astore 18
Label147:
	aload 17
	areturn 
	astore 9
	aconst_null 
	astore 10
	aload_5 
	ifnull Label158
	aload_5 
	invokevirtual close( java.io.InputStream ) // pc=1
	goto Label158
	astore 11
Label158:
	aload_4 
	ifnull Label164
	aload_4 
	invokeinterface interfacemethodref_203 // pc=1 guess=3
	goto Label164
	astore 11
Label164:
	aload 10
	areturn 
	astore 19
	aload_5 
	ifnull Label173
	aload_5 
	invokevirtual close( java.io.InputStream ) // pc=1
	goto Label173
	astore 20
Label173:
	aload_4 
	ifnull Label179
	aload_4 
	invokeinterface interfacemethodref_203 // pc=1 guess=3
	goto Label179
	astore 20
Label179:
	aload 19
	athrow 
	}


static public final java.lang.String createBase64EncodedJPEG( net.rim.device.api.system.Bitmap ); // address: 0
	{
	enter 
	aload_0 
	bipush 100
	invokestatic_lib net.rim.device.api.system.JPEGEncodedImage encode( net.rim.device.api.system.Bitmap, int ) // JPEGEncodedImage
	astore_2 
	aload_2 
	invokevirtual byte[] getData( net.rim.device.api.system.EncodedImage ) // pc=1
	aload_2 
	invokevirtual int getOffset( net.rim.device.api.system.EncodedImage ) // pc=1
	aload_2 
	invokevirtual int getLength( net.rim.device.api.system.EncodedImage ) // pc=1
	iconst_0 
	iconst_0 
	invokestatic_lib java.lang.String encodeAsString( byte[], int, int, boolean, boolean ) // Base64OutputStream
	astore_1 
	aload_1 
	areturn 
	astore_2 
	aconst_null 
	astore_1 
	aload_1 
	areturn 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	clinit_lib net.rim.device.api.ui.TouchEvent//net.rim.device.api.ui.TouchEvent net.rim.device.api.ui.TouchEvent net.rim.device.api.ui.TouchEvent
	synch_static LocationSenderThread
	clinit_wait 
	ldc literal_1469:"http://maps.google.com/maps/api/staticmap?center={0},{1}&zoom=15&size=200x200&sensor=true&format=jpg&mobile=true&markers=color:red|size:mid|{0},{1}"
	putstatic com.whatsapp.client.LocationSenderThread.field_57084 // LocationSenderThread
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final boolean com.whatsapp.client.LocationSenderThread.routine_3180( com.whatsapp.client.LocationSenderThread, javax.microedition.location.Criteria ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	invokestatic_lib javax.microedition.location.LocationProvider getInstance( javax.microedition.location.Criteria ) // LocationProvider
	putfield com.whatsapp.client.LocationSenderThread.field_57064   // get_name_1:  com.whatsapp.client.LocationSenderThread.field_57064   // get_name_2:  com.whatsapp.client.LocationSenderThread.field_57064   // get_Name:    com.whatsapp.client.LocationSenderThread.field_57064   // getName->1:     // getName->2:     // getName->N:     // ofs = 57064 ord = 7 addr = 0
	aload_0_getfield com.whatsapp.client.LocationSenderThread.field_57064   // get_name_1:  com.whatsapp.client.LocationSenderThread.field_57064   // get_name_2:  com.whatsapp.client.LocationSenderThread.field_57064   // get_Name:    com.whatsapp.client.LocationSenderThread.field_57064   // getName->1:     // getName->2:     // getName->N:     // ofs = 57064 ord = 7 addr = 0
	ifnonnull Label12
	new_lib net.rim.device.api.ui.decor.BorderFactory//net.rim.device.api.ui.decor.BorderFactory net.rim.device.api.ui.decor.BorderFactory net.rim.device.api.ui.decor.BorderFactory
	dup 
	ldc literal_1467:"no location provider for this gps criteria."
	invokespecial_lib java.lang.IllegalArgumentException.<init> // pc=2
	athrow 
Label12:
	invokestatic_lib long currentTimeMillis(  ) // System
	lstore 6
	aload_0_getfield com.whatsapp.client.LocationSenderThread.field_57064   // get_name_1:  com.whatsapp.client.LocationSenderThread.field_57064   // get_name_2:  com.whatsapp.client.LocationSenderThread.field_57064   // get_Name:    com.whatsapp.client.LocationSenderThread.field_57064   // getName->1:     // getName->2:     // getName->N:     // ofs = 57064 ord = 7 addr = 0
	bipush 120
	invokevirtual javax.microedition.location.Location getLocation( javax.microedition.location.LocationProvider, int ) // pc=2
	astore 8
	aload_0_getfield _cancelled   // get_name_1:  _cancelled   // get_name_2:  _cancelled   // get_Name:    _cancelled   // getName->1:  _cancelled   // getName->2:  _cancelled   // getName->N:  _cancelled   // ofs = 57044 ord = 2 addr = 0
	ifeq Label22
	iconst_0 
	ireturn 
Label22:
	aload_0 
	invokestatic_lib long currentTimeMillis(  ) // System
	lload 6
	lsub 
	sipush 1000
	i2l 
	ldiv 
	l2i 
	putfield com.whatsapp.client.LocationSenderThread.field_57068   // get_name_1:  com.whatsapp.client.LocationSenderThread.field_57068   // get_name_2:  com.whatsapp.client.LocationSenderThread.field_57068   // get_Name:    com.whatsapp.client.LocationSenderThread.field_57068   // getName->1:     // getName->2:     // getName->N:     // ofs = 57068 ord = 8 addr = 0
	aload 8
	invokevirtual javax.microedition.location.QualifiedCoordinates getQualifiedCoordinates( javax.microedition.location.Location ) // pc=1
	astore 9
	aload 9
	invokevirtual double getLatitude( javax.microedition.location.Coordinates ) // pc=1
	isreal 
	lstore 2
	aload 9
	invokevirtual double getLongitude( javax.microedition.location.Coordinates ) // pc=1
	isreal 
	lstore 4
	isreal 
	lload 2
	isreal 
	lload 4
	invokestatic net.rim.device.api.system.Bitmap grabMapLocationThumbnail( double, double ) // LocationSenderThread
	astore 10
	aload 10
	ifnull Label57
	aload_0_getfield com.whatsapp.client.LocationSenderThread.field_57040   // get_name_1:  com.whatsapp.client.LocationSenderThread.field_57040   // get_name_2:  com.whatsapp.client.LocationSenderThread.field_57040   // get_Name:    com.whatsapp.client.LocationSenderThread.field_57040   // getName->1:     // getName->2:     // getName->N:     // ofs = 57040 ord = 1 addr = 0
	aload 10
	invokenonvirtual_lib .routine_20 // pc=2
	aload_0 
	aload 10
	invokestatic java.lang.String createBase64EncodedJPEG( net.rim.device.api.system.Bitmap ) // LocationSenderThread
	putfield com.whatsapp.client.LocationSenderThread.field_57072   // get_name_1:  com.whatsapp.client.LocationSenderThread.field_57072   // get_name_2:  com.whatsapp.client.LocationSenderThread.field_57072   // get_Name:    com.whatsapp.client.LocationSenderThread.field_57072   // getName->1:     // getName->2:     // getName->N:     // ofs = 57072 ord = 9 addr = 0
Label57:
	aload_0_getfield _cancelled   // get_name_1:  _cancelled   // get_name_2:  _cancelled   // get_Name:    _cancelled   // getName->1:  _cancelled   // getName->2:  _cancelled   // getName->N:  _cancelled   // ofs = 57044 ord = 2 addr = 0
	ifeq Label61
	iconst_0 
	ireturn 
Label61:
	aload_0 
	isreal 
	lload 2
	lputfield com.whatsapp.client.LocationSenderThread.field_57076   // get_name_1:  com.whatsapp.client.LocationSenderThread.field_57076   // get_name_2:  com.whatsapp.client.LocationSenderThread.field_57076   // get_Name:    com.whatsapp.client.LocationSenderThread.field_57076   // getName->1:     // getName->2:     // getName->N:     // ofs = 57076 ord = 10 addr = 0
	aload_0 
	isreal 
	lload 4
	lputfield com.whatsapp.client.LocationSenderThread.field_57080   // get_name_1:  com.whatsapp.client.LocationSenderThread.field_57080   // get_name_2:  com.whatsapp.client.LocationSenderThread.field_57080   // get_Name:    com.whatsapp.client.LocationSenderThread.field_57080   // getName->1:     // getName->2:     // getName->N:     // ofs = 57080 ord = 11 addr = 0
	iconst_1 
	ireturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final setListener( com.whatsapp.client.LocationSenderThread, com.whatsapp.client.LocationSenderThread$Listener ); // address: 0
	{
	enter 
	aload_0_getfield _listenerLock   // get_name_1:  _listenerLock   // get_name_2:  _listenerLock   // get_Name:    _listenerLock   // getName->1:  _listenerLock   // getName->2:  _listenerLock   // getName->N:  _listenerLock   // ofs = 57056 ord = 5 addr = 0
	dup 
	astore_2 
	monitorenter 
	aload_0 
	aload_1 
	putfield _listener   // get_name_1:  _listener   // get_name_2:  _listener   // get_Name:    _listener   // getName->1:  _listener   // getName->2:  _listener   // getName->N:  _listener   // ofs = 57036 ord = 0 addr = 0
	aload_0_getfield com.whatsapp.client.LocationSenderThread.field_57060   // get_name_1:  com.whatsapp.client.LocationSenderThread.field_57060   // get_name_2:  com.whatsapp.client.LocationSenderThread.field_57060   // get_Name:    com.whatsapp.client.LocationSenderThread.field_57060   // getName->1:     // getName->2:     // getName->N:     // ofs = 57060 ord = 6 addr = 0
	ifnull Label15
	aload_0_getfield com.whatsapp.client.LocationSenderThread.field_57060   // get_name_1:  com.whatsapp.client.LocationSenderThread.field_57060   // get_name_2:  com.whatsapp.client.LocationSenderThread.field_57060   // get_Name:    com.whatsapp.client.LocationSenderThread.field_57060   // getName->1:     // getName->2:     // getName->N:     // ofs = 57060 ord = 6 addr = 0
	invokevirtual boolean isAlive( java.lang.Thread ) // pc=1
	ifeq Label15
	aload_0_getfield com.whatsapp.client.LocationSenderThread.field_57060   // get_name_1:  com.whatsapp.client.LocationSenderThread.field_57060   // get_name_2:  com.whatsapp.client.LocationSenderThread.field_57060   // get_Name:    com.whatsapp.client.LocationSenderThread.field_57060   // getName->1:     // getName->2:     // getName->N:     // ofs = 57060 ord = 6 addr = 0
	invokevirtual interrupt( java.lang.Thread ) // pc=1
Label15:
	aload_0_getfield _sentDone   // get_name_1:  _sentDone   // get_name_2:  _sentDone   // get_Name:    _sentDone   // getName->1:  _sentDone   // getName->2:  _sentDone   // getName->N:  _sentDone   // ofs = 57048 ord = 3 addr = 0
	ifeq Label20
	aload_1 
	aload_0_getfield com.whatsapp.client.LocationSenderThread.field_57052   // get_name_1:  com.whatsapp.client.LocationSenderThread.field_57052   // get_name_2:  com.whatsapp.client.LocationSenderThread.field_57052   // get_Name:    com.whatsapp.client.LocationSenderThread.field_57052   // getName->1:     // getName->2:     // getName->N:     // ofs = 57052 ord = 4 addr = 0
	invokeinterface interfacemethodref_201 // pc=2 guess=0
Label20:
	aload_2 
	monitorexit 
	return 
	astore_3 
	aload_2 
	monitorexit 
	aload_3 
	athrow 
	}


public final run( com.whatsapp.client.LocationSenderThread ); // address: 0
	{
	enter 
	iconst_0 
	istore_1 
	iconst_0 
	istore_2 
	bipush -1
	istore_3 
	arrayinit [0, 0, 0, 0, 1, 0, 0, 0, 2, 0, 0, 0, 99, 0, 0, 0, 3, 0, 0, 0]
	astore_4 
	invokestatic_lib long currentTimeMillis(  ) // System
	lstore 5
	aload_0 
	new LocationSenderThread$ProgressUpdater
	dup 
	aload_0 
	aconst_null 
	invokespecial com.whatsapp.client.LocationSenderThread$ProgressUpdater.<init> // pc=3
	putfield com.whatsapp.client.LocationSenderThread.field_57060   // get_name_1:  com.whatsapp.client.LocationSenderThread.field_57060   // get_name_2:  com.whatsapp.client.LocationSenderThread.field_57060   // get_Name:    com.whatsapp.client.LocationSenderThread.field_57060   // getName->1:     // getName->2:     // getName->N:     // ofs = 57060 ord = 6 addr = 0
	aload_0_getfield com.whatsapp.client.LocationSenderThread.field_57060   // get_name_1:  com.whatsapp.client.LocationSenderThread.field_57060   // get_name_2:  com.whatsapp.client.LocationSenderThread.field_57060   // get_Name:    com.whatsapp.client.LocationSenderThread.field_57060   // getName->1:     // getName->2:     // getName->N:     // ofs = 57060 ord = 6 addr = 0
	invokevirtual start( java.lang.Thread ) // pc=1
	invokestatic_lib java.lang.String getCurrentNetworkName(  ) // RadioInfo
	astore_7 
	aload_7 
	ifnull Label36
	aload_7 
	ldc literal_1466:"DIGITEL GSM"
	invokenonvirtual_lib java.lang.String.startsWith // pc=2
	ifeq Label36
	aload_4 
	iconst_1 
	bipush 3
	iastore 
	aload_4 
	bipush 4
	iconst_1 
	iastore 
Label36:
	aload_0_getfield _cancelled   // get_name_1:  _cancelled   // get_name_2:  _cancelled   // get_Name:    _cancelled   // getName->1:  _cancelled   // getName->2:  _cancelled   // getName->N:  _cancelled   // ofs = 57044 ord = 2 addr = 0
	ifne Label83
	invokestatic_lib yield(  ) // Thread
	iinc 2 1
	invokestatic_lib int getNetworkType(  ) // RadioInfo
	bipush 4
	if_icmpne Label49
	iload_2 
	iconst_1 
	if_icmpne Label83
	bipush 10
	istore_3 
	goto Label59
Label49:
	iload_2 
	aload_4 
	arraylength 
	if_icmpgt Label83
	aload_4 
	iload_2 
	iconst_1 
	isub 
	iaload 
	istore_3 
Label59:
	iload_3 
	invokestatic javax.microedition.location.Criteria com.whatsapp.client.LocationSenderThread.routine_3378( int ) // LocationSenderThread
	astore 8
	invokestatic_lib boolean isSimulator(  ) // DeviceInfo
	ifeq Label69
	sipush 5000
	i2l 
	invokestatic_lib sleep( long ) // Thread
	goto Label69
	astore 9
Label69:
	aload_0 
	aload_0 
	aload 8
	invokespecial com.whatsapp.client.LocationSenderThread.routine_3180 // pc=2
	putfield com.whatsapp.client.LocationSenderThread.field_57052   // get_name_1:  com.whatsapp.client.LocationSenderThread.field_57052   // get_name_2:  com.whatsapp.client.LocationSenderThread.field_57052   // get_Name:    com.whatsapp.client.LocationSenderThread.field_57052   // getName->1:     // getName->2:     // getName->N:     // ofs = 57052 ord = 4 addr = 0
	aload_0_getfield com.whatsapp.client.LocationSenderThread.field_57052   // get_name_1:  com.whatsapp.client.LocationSenderThread.field_57052   // get_name_2:  com.whatsapp.client.LocationSenderThread.field_57052   // get_Name:    com.whatsapp.client.LocationSenderThread.field_57052   // getName->1:     // getName->2:     // getName->N:     // ofs = 57052 ord = 4 addr = 0
	ifeq Label36
	goto Label83
	astore 9
	iinc 1 1
	goto Label36
	astore 9
	goto Label36
	astore 9
Label83:
	aload_0_getfield _cancelled   // get_name_1:  _cancelled   // get_name_2:  _cancelled   // get_Name:    _cancelled   // getName->1:  _cancelled   // getName->2:  _cancelled   // getName->N:  _cancelled   // ofs = 57044 ord = 2 addr = 0
	ifeq Label86
	goto_w Label154
Label86:
	aload_0_getfield com.whatsapp.client.LocationSenderThread.field_57052   // get_name_1:  com.whatsapp.client.LocationSenderThread.field_57052   // get_name_2:  com.whatsapp.client.LocationSenderThread.field_57052   // get_Name:    com.whatsapp.client.LocationSenderThread.field_57052   // getName->1:     // getName->2:     // getName->N:     // ofs = 57052 ord = 4 addr = 0
	ifne Label115
	iload_1 
	iload_2 
	iconst_1 
	isub 
	if_icmpne Label97
	sipush 325
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	astore 8
	goto Label100
Label97:
	sipush 326
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	astore 8
Label100:
	aload_0_getfield _listenerLock   // get_name_1:  _listenerLock   // get_name_2:  _listenerLock   // get_Name:    _listenerLock   // getName->1:  _listenerLock   // getName->2:  _listenerLock   // getName->N:  _listenerLock   // ofs = 57056 ord = 5 addr = 0
	dup 
	astore 9
	monitorenter 
	aload_0_getfield _listener   // get_name_1:  _listener   // get_name_2:  _listener   // get_Name:    _listener   // getName->1:  _listener   // getName->2:  _listener   // getName->N:  _listener   // ofs = 57036 ord = 0 addr = 0
	aload 8
	invokeinterface interfacemethodref_202 // pc=2 guess=1
	aload 9
	monitorexit 
	goto Label115
	astore 10
	aload 9
	monitorexit 
	aload 10
	athrow 
Label115:
	aload_0_getfield _listenerLock   // get_name_1:  _listenerLock   // get_name_2:  _listenerLock   // get_Name:    _listenerLock   // getName->1:  _listenerLock   // getName->2:  _listenerLock   // getName->N:  _listenerLock   // ofs = 57056 ord = 5 addr = 0
	dup 
	astore 8
	monitorenter 
	aload_0_getfield _listener   // get_name_1:  _listener   // get_name_2:  _listener   // get_Name:    _listener   // getName->1:  _listener   // getName->2:  _listener   // getName->N:  _listener   // ofs = 57036 ord = 0 addr = 0
	aload_0_getfield com.whatsapp.client.LocationSenderThread.field_57052   // get_name_1:  com.whatsapp.client.LocationSenderThread.field_57052   // get_name_2:  com.whatsapp.client.LocationSenderThread.field_57052   // get_Name:    com.whatsapp.client.LocationSenderThread.field_57052   // getName->1:     // getName->2:     // getName->N:     // ofs = 57052 ord = 4 addr = 0
	invokeinterface interfacemethodref_201 // pc=2 guess=2
	aload_0 
	iconst_1 
	putfield _sentDone   // get_name_1:  _sentDone   // get_name_2:  _sentDone   // get_Name:    _sentDone   // getName->1:  _sentDone   // getName->2:  _sentDone   // getName->N:  _sentDone   // ofs = 57048 ord = 3 addr = 0
	aload 8
	monitorexit 
	goto Label133
	astore 11
	aload 8
	monitorexit 
	aload 11
	athrow 
Label133:
	invokestatic_lib module:WhatsApp-10.class#29.routine_5442(  ) // class#29
	astore 8
	invokestatic_lib long currentTimeMillis(  ) // System
	lload 5
	lsub 
	lstore 9
	aload 8
	dup 
	lgetfield .field_24_24   // get_name_1:  .field_24_24   // get_name_2:  .field_24_24   // get_Name:    .field_24_24   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 24
	lload 9
	sipush 1000
	i2l 
	ldiv 
	ladd 
	lputfield .field_24_24   // get_name_1:  .field_24_24   // get_name_2:  .field_24_24   // get_Name:    .field_24_24   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 24
	aload 8
	dup 
	getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	iconst_1 
	iadd 
	putfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
Label154:
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	astore 8
	aload 8
	aconst_null 
	putfield _locThread   // get_name_1:  _locThread   // get_name_2:  _locThread   // get_Name:    _locThread   // getName->1:  _locThread   // getName->2:  _locThread   // getName->N:  _locThread   // ofs = -1 ord = 0 addr = -1
	return 
	}


public final int getTimeEstimate( com.whatsapp.client.LocationSenderThread ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-10.class#29.routine_5442(  ) // class#29
	astore_1 
	aload_1 
	getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	ifeq Label12
	aload_1 
	lgetfield .field_24_24   // get_name_1:  .field_24_24   // get_name_2:  .field_24_24   // get_Name:    .field_24_24   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 24
	iconst_0 
	i2l 
	lcmp 
	ifne Label14
Label12:
	bipush 70
	ireturn 
Label14:
	aload_1 
	lgetfield .field_24_24   // get_name_1:  .field_24_24   // get_name_2:  .field_24_24   // get_Name:    .field_24_24   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 24
	aload_1 
	getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	i2l 
	ldiv 
	l2i 
	istore_2 
	iload_2 
	ireturn 
	}


public final boolean isLocationDone( com.whatsapp.client.LocationSenderThread ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _listenerLock   // get_name_1:  _listenerLock   // get_name_2:  _listenerLock   // get_Name:    _listenerLock   // getName->1:  _listenerLock   // getName->2:  _listenerLock   // getName->N:  _listenerLock   // ofs = 57056 ord = 5 addr = 0
	dup 
	astore_1 
	monitorenter 
	aload_0_getfield _sentDone   // get_name_1:  _sentDone   // get_name_2:  _sentDone   // get_Name:    _sentDone   // getName->1:  _sentDone   // getName->2:  _sentDone   // getName->N:  _sentDone   // ofs = 57048 ord = 3 addr = 0
	aload_1 
	monitorexit 
	ireturn 
	astore_2 
	aload_1 
	monitorexit 
	aload_2 
	athrow 
	}


public final java.lang.String getLocationThumbnail( com.whatsapp.client.LocationSenderThread ); // address: 0
	{
	areturn_field com.whatsapp.client.LocationSenderThread.field_57072   // get_name_1:  com.whatsapp.client.LocationSenderThread.field_57072   // get_name_2:  com.whatsapp.client.LocationSenderThread.field_57072   // get_Name:    com.whatsapp.client.LocationSenderThread.field_57072   // getName->1:     // getName->2:     // getName->N:     // ofs = 57072 ord = 9 addr = 0
	}


public final double getLatitude( com.whatsapp.client.LocationSenderThread ); // address: 0
	{
	enter_narrow 
	aload_0 
	lgetfield com.whatsapp.client.LocationSenderThread.field_57076   // get_name_1:  com.whatsapp.client.LocationSenderThread.field_57076   // get_name_2:  com.whatsapp.client.LocationSenderThread.field_57076   // get_Name:    com.whatsapp.client.LocationSenderThread.field_57076   // getName->1:     // getName->2:     // getName->N:     // ofs = 57076 ord = 10 addr = 0
	isreal 
	lreturn 
	}


public final double getLongitude( com.whatsapp.client.LocationSenderThread ); // address: 0
	{
	enter_narrow 
	aload_0 
	lgetfield com.whatsapp.client.LocationSenderThread.field_57080   // get_name_1:  com.whatsapp.client.LocationSenderThread.field_57080   // get_name_2:  com.whatsapp.client.LocationSenderThread.field_57080   // get_Name:    com.whatsapp.client.LocationSenderThread.field_57080   // getName->1:     // getName->2:     // getName->N:     // ofs = 57080 ord = 11 addr = 0
	isreal 
	lreturn 
	}

}
