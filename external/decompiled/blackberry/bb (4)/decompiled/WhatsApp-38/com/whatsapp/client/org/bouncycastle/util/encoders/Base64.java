// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-36.cod
// Module version  : 2.7.3204
// Class ID        : 0
// ########################################################


package com.whatsapp.client.org.bouncycastle.util.encoders;


abstract public final class Base64 extends Object

{
	// @@@@@@@@@@@@@ Static fields 
	private final static com.whatsapp.client.org.bouncycastle.util.encoders.Encoder /*com.whatsapp.client.org.bouncycastle.util.encoders.Encoder*/  field_53482 ; // ofs = 53482 addr = 2)


	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.org.bouncycastle.util.encoders.Base64 ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}


static public final byte[] encode( byte[] ); // address: 0
	{
	enter 
	aload_0 
	arraylength 
	bipush 2
	iadd 
	bipush 3
	idiv 
	bipush 4
	imul 
	istore_1 
	new_lib java.io.OutputStream//java.io.OutputStream java.io.OutputStream java.io.OutputStream
	dup 
	iload_1 
	invokespecial_lib java.io.ByteArrayOutputStream.<init> // pc=2
	astore_2 
	getstatic com.whatsapp.client.org.bouncycastle.util.encoders.Base64.field_53482 // Base64
	aload_0 
	iconst_0 
	aload_0 
	arraylength 
	aload_2 
	invokeinterface interfacemethodref_67 // pc=5 guess=0
	pop 
	goto Label36
	astore_3 
	new_lib net.rim.device.api.ui.UiApplication//net.rim.device.api.ui.UiApplication net.rim.device.api.ui.UiApplication net.rim.device.api.ui.UiApplication
	dup 
	new_lib Object//java.lang.Object java.lang.Object java.lang.Object
	dup 
	ldc literal_579:"exception encoding base64 string: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_3 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.Object ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib java.lang.RuntimeException.<init> // pc=2
	athrow 
Label36:
	aload_2 
	invokevirtual byte[] toByteArray( java.io.ByteArrayOutputStream ) // pc=1
	areturn 
	}


static public final byte[] decode( byte[] ); // address: 0
	{
	enter 
	aload_0 
	arraylength 
	bipush 4
	idiv 
	bipush 3
	imul 
	istore_1 
	new_lib java.io.OutputStream//java.io.OutputStream java.io.OutputStream java.io.OutputStream
	dup 
	iload_1 
	invokespecial_lib java.io.ByteArrayOutputStream.<init> // pc=2
	astore_2 
	getstatic com.whatsapp.client.org.bouncycastle.util.encoders.Base64.field_53482 // Base64
	aload_0 
	iconst_0 
	aload_0 
	arraylength 
	aload_2 
	invokeinterface interfacemethodref_68 // pc=5 guess=1
	pop 
	goto Label34
	astore_3 
	new_lib net.rim.device.api.ui.UiApplication//net.rim.device.api.ui.UiApplication net.rim.device.api.ui.UiApplication net.rim.device.api.ui.UiApplication
	dup 
	new_lib Object//java.lang.Object java.lang.Object java.lang.Object
	dup 
	ldc literal_580:"exception decoding base64 string: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_3 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.Object ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib java.lang.RuntimeException.<init> // pc=2
	athrow 
Label34:
	aload_2 
	invokevirtual byte[] toByteArray( java.io.ByteArrayOutputStream ) // pc=1
	areturn 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	synch_static Base64
	clinit_wait 
	new Base64Encoder
	dup 
	invokespecial com.whatsapp.client.org.bouncycastle.util.encoders.Base64Encoder.<init> // pc=1
	putstatic com.whatsapp.client.org.bouncycastle.util.encoders.Base64.field_53482 // Base64
	clinit_return 
	}

}