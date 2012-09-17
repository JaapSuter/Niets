// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-24.cod
// Module version  : 2.7.3204
// Class ID        : 13
// ########################################################


package com.whatsapp.client;


abstract public final class MessageStoreProvider extends Object

{
	// @@@@@@@@@@@@@ Static fields 
	private static com.whatsapp.client.MessageStore /*com.whatsapp.client.MessageStore*/  field_54546 ; // ofs = 54546 addr = 33)


	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.MessageStoreProvider ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}


static public final com.whatsapp.client.MessageStore getMessageStore(  ); // address: 0
	{
	enter_narrow 
	synch_static MessageStoreProvider
	invokestatic boolean com.whatsapp.client.MessageStoreProvider.routine_9272(  ) // MessageStoreProvider
	pop 
	getstatic com.whatsapp.client.MessageStoreProvider.field_54546 // MessageStoreProvider
	areturn 
	}


static private final boolean com.whatsapp.client.MessageStoreProvider.routine_9272(  ); // address: 0
	{
	enter 
	getstatic com.whatsapp.client.MessageStoreProvider.field_54546 // MessageStoreProvider
	ifnull Label5
	iconst_0 
	ireturn 
Label5:
	iconst_0 
	istore_0 
	invokestatic_lib net.rim.device.api.system.RuntimeStore getRuntimeStore(  ) // RuntimeStore
	lipush -5001995059468977142
	invokevirtual java.lang.Object get( net.rim.device.api.system.RuntimeStore, long ) // pc=3
	checkcast MessageStore
	astore_1 
	aload_1 
	ifnull Label15
	goto_w Label67
Label15:
	invokestatic_lib java.lang.String getSoftwareVersion(  ) // DeviceInfo
	astore_2 
	aload_2 
	ldc literal_205:"5.0.0.442"
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label25
	aload_2 
	ldc literal_206:"5.0.0.423"
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label27
Label25:
	iconst_1 
	goto Label28
Label27:
	iconst_0 
Label28:
	istore_3 
	iconst_1 
	istore_0 
	new_lib com.whatsapp.client.//module:WhatsApp-30.class#0 module:WhatsApp-30.class#0 module:WhatsApp-30.class#0
	dup 
	iload_3 
	invokespecial_lib .routine_8002 // pc=2
	astore_1 
	invokestatic_lib net.rim.device.api.system.RuntimeStore getRuntimeStore(  ) // RuntimeStore
	lipush -5001995059468977142
	aload_1 
	invokevirtual put( net.rim.device.api.system.RuntimeStore, long, java.lang.Object ) // pc=4
	goto Label67
	astore_4 
	lipush -4528648054740815434
	new_lib net.rim.device.api.collection.ReadableList//net.rim.device.api.collection.ReadableList net.rim.device.api.collection.ReadableList net.rim.device.api.collection.ReadableList
	dup 
	ldc literal_207:"MessageStoreProvider error putting "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_4 
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	invokestatic_lib boolean logEvent( long, byte[] ) // EventLogger
	pop 
	invokestatic_lib net.rim.device.api.system.RuntimeStore getRuntimeStore(  ) // RuntimeStore
	lipush -5001995059468977142
	invokevirtual java.lang.Object get( net.rim.device.api.system.RuntimeStore, long ) // pc=3
	checkcast MessageStore
	astore_1 
	aload_1 
	ifnonnull Label67
	new_lib javax.microedition.io.file.FileSystemRegistry//javax.microedition.io.file.FileSystemRegistry javax.microedition.io.file.FileSystemRegistry javax.microedition.io.file.FileSystemRegistry
	dup 
	aload_4 
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	invokespecial_lib java.lang.RuntimeException.<init> // pc=2
	athrow 
Label67:
	aload_1 
	putstatic com.whatsapp.client.MessageStoreProvider.field_54546 // MessageStoreProvider
	iload_0 
	ireturn 
	}

}
