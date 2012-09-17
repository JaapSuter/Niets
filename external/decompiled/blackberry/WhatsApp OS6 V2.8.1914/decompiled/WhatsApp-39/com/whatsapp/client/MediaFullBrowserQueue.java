// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-39.cod
// Module version  : 2.8.1914
// Class ID        : 11
// ########################################################


package com.whatsapp.client;


abstract final class MediaFullBrowserQueue extends Object

{

	// @@@@@@@@@@@@@ Fields 
	private final net.rim.device.api.ui.Screen /*net.rim.device.api.ui.Screen*/  _screen ; // ofs = 55062 addr = 0)
	private final java.util.Hashtable /*java.util.Hashtable*/  field_55066 ; // ofs = 55066 addr = 0)
	private java.util.Hashtable /*java.util.Hashtable*/  _worklist ; // ofs = 55070 addr = 0)
	private final java.util.Hashtable /*java.util.Hashtable*/  _scaledImages ; // ofs = 55074 addr = 0)
	private boolean /*boolean*/  _workerRunning ; // ofs = 55078 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.MediaFullBrowserQueue, net.rim.device.api.ui.Screen ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	iconst_0 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	aload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

final net.rim.device.api.system.Bitmap getFullBitmap( com.whatsapp.client.MediaFullBrowserQueue, module:WhatsApp-26.class#23, int, int ); // address: 0
	{
	enter 
	new MediaFullBrowserQueue$ScaleKey
	dup 
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_2 
	iload_3 
	invokespecial com.whatsapp.client.MediaFullBrowserQueue$ScaleKey.<init> // pc=4
	astore_4 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_4 
	invokevirtual boolean containsKey( java.util.Hashtable, java.lang.Object ) // pc=2
	ifne Label17
	aload_0 
	aload_1 
	aload_4 
	invokespecial com.whatsapp.client.MediaFullBrowserQueue.routine_5808 // pc=3
Label17:
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_4 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	astore_5 
	aload_5 
	areturn 
	}


private final com.whatsapp.client.MediaFullBrowserQueue.routine_5808( com.whatsapp.client.MediaFullBrowserQueue, java.lang.Object, com.whatsapp.client.MediaFullBrowserQueue$ScaleKey ); // address: 0
	{
	enter 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_2 
	aload_1 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_2 
	aload_1 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifne Label31
	new MediaFullBrowserQueue$1
	dup 
	aload_0 
	invokespecial com.whatsapp.client.MediaFullBrowserQueue$1.<init> // pc=2
	astore_3 
	aload_0 
	iconst_1 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	aload_3 
	invokespecial_lib java.lang.Thread.<init> // pc=2
	astore_4 
	aload_4 
	iconst_1 
	invokevirtual setPriority( java.lang.Thread, int ) // pc=2
	aload_4 
	invokevirtual start( java.lang.Thread ) // pc=1
Label31:
	return 
	}


private final net.rim.device.api.system.Bitmap getFastFit( com.whatsapp.client.MediaFullBrowserQueue, module:WhatsApp-26.class#23, com.whatsapp.client.MediaFullBrowserQueue$ScaleKey ); // address: 0
	{
	enter 
	aload_1 
	getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	checkcast_lib com.whatsapp.client.MediaData//module:WhatsApp-38.class#0 module:WhatsApp-38.class#0 module:WhatsApp-38.class#0
	astore_3 
	aload_3 
	invokenonvirtual_lib .routine_9 // pc=1
	astore_4 
	aload_4 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	invokestatic_lib int toFP( int ) // Fixed32
	istore_5 
	iload_5 
	aload_2 
	invokenonvirtual com.whatsapp.client.MediaFullBrowserQueue$ScaleKey.getWidth // pc=1
	invokestatic_lib int toFP( int ) // Fixed32
	invokestatic_lib int div( int, int ) // Fixed32
	istore_6 
	aload_4 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	invokestatic_lib int toFP( int ) // Fixed32
	istore_7 
	iload_7 
	aload_2 
	invokenonvirtual com.whatsapp.client.MediaFullBrowserQueue$ScaleKey.getHeight // pc=1
	invokestatic_lib int toFP( int ) // Fixed32
	invokestatic_lib int div( int, int ) // Fixed32
	istore 8
	iload_6 
	iload 8
	invokestatic_lib int max( int, int ) // Math
	istore 9
	aload_3 
	getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	istore 11
	iload 9
	iipush 65536
	if_icmpge Label48
	iload 11
	bipush 2
	if_icmpeq Label45
	iload 11
	bipush 3
	if_icmpne Label48
Label45:
	aload_4 
	astore 10
	goto Label61
Label48:
	new_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	dup 
	iload_5 
	iload 9
	invokestatic_lib int divtoInt( int, int ) // Fixed32
	iload_7 
	iload 9
	invokestatic_lib int divtoInt( int, int ) // Fixed32
	invokespecial_lib net.rim.device.api.system.Bitmap.<init> // pc=3
	astore 10
	aload_4 
	aload 10
	invokestatic_lib module:WhatsApp-60.class#2.routine_3166(  ) // class#2
Label61:
	aload 10
	areturn 
	}


private final net.rim.device.api.system.Bitmap getHighQualityFit( com.whatsapp.client.MediaFullBrowserQueue, module:WhatsApp-26.class#23, com.whatsapp.client.MediaFullBrowserQueue$ScaleKey ); // address: 0
	{
	enter 
	aload_1 
	getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	iconst_1 
	if_icmpeq Label7
	aconst_null 
	areturn 
Label7:
	aload_1 
	getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	checkcast_lib com.whatsapp.client.MediaData//module:WhatsApp-38.class#0 module:WhatsApp-38.class#0 module:WhatsApp-38.class#0
	astore_3 
	iconst_0 
	istore_4 
	aload_3 
	getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	ifgt Label24
	aload_3 
	invokenonvirtual_lib .routine_206 // pc=1
	ifeq Label22
	iconst_1 
	istore_4 
	goto Label24
Label22:
	aconst_null 
	areturn 
Label24:
	aload_3 
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iconst_0 
	aload_3 
	getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	invokestatic_lib net.rim.device.api.system.EncodedImage createEncodedImage( byte[], int, int ) // EncodedImage
	astore_5 
	iload_4 
	ifeq Label35
	aload_3 
	invokenonvirtual_lib .routine_570 // pc=1
Label35:
	aload_5 
	invokestatic_lib module:WhatsApp-54.class#1.routine_464(  ) // class#1
	istore_6 
	iload_6 
	ifeq Label43
	aload_5 
	invokevirtual int getHeight( net.rim.device.api.system.EncodedImage ) // pc=1
	goto Label45
Label43:
	aload_5 
	invokevirtual int getWidth( net.rim.device.api.system.EncodedImage ) // pc=1
Label45:
	invokestatic_lib int toFP( int ) // Fixed32
	istore_7 
	iload_7 
	aload_2 
	invokenonvirtual com.whatsapp.client.MediaFullBrowserQueue$ScaleKey.getWidth // pc=1
	invokestatic_lib int toFP( int ) // Fixed32
	invokestatic_lib int div( int, int ) // Fixed32
	istore 8
	iload_6 
	ifeq Label58
	aload_5 
	invokevirtual int getWidth( net.rim.device.api.system.EncodedImage ) // pc=1
	goto Label60
Label58:
	aload_5 
	invokevirtual int getHeight( net.rim.device.api.system.EncodedImage ) // pc=1
Label60:
	invokestatic_lib int toFP( int ) // Fixed32
	istore 9
	iload 9
	aload_2 
	invokenonvirtual com.whatsapp.client.MediaFullBrowserQueue$ScaleKey.getHeight // pc=1
	invokestatic_lib int toFP( int ) // Fixed32
	invokestatic_lib int div( int, int ) // Fixed32
	istore 10
	iload 8
	iload 10
	invokestatic_lib int max( int, int ) // Math
	istore 11
	aload_5 
	iload 11
	iload 11
	invokevirtual net.rim.device.api.system.EncodedImage scaleImage32( net.rim.device.api.system.EncodedImage, int, int ) // pc=3
	invokevirtual net.rim.device.api.system.Bitmap getBitmap( net.rim.device.api.system.EncodedImage ) // pc=1
	astore 12
	iload_6 
	ifeq Label83
	aload 12
	invokestatic_lib module:WhatsApp-54.class#1.routine_380(  ) // class#1
	areturn 
Label83:
	aload 12
	areturn 
	}

}
