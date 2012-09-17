// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-35.cod
// Module version  : 2.7.3204
// Class ID        : 20
// ########################################################


package com.whatsapp.client.org.json.me.util;


abstract public final class XMLTokener extends com.whatsapp.client.org.json.me.JSONTokener

{
	// @@@@@@@@@@@@@ Static fields 
	public final static java.util.Hashtable /*java.util.Hashtable*/  entity ; // ofs = 54822 addr = 56)


	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.org.json.me.util.XMLTokener, java.lang.String ); // address: 0
	{
	jumpspecial <init>( com.whatsapp.client.org.json.me.JSONTokener, java.lang.String )
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	clinit JSONTokener
	synch_static XMLTokener
	clinit_wait 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	bipush 8
	invokespecial_lib java.util.Hashtable.<init> // pc=2
	putstatic entity // XMLTokener
	getstatic entity // XMLTokener
	ldc literal_88:"amp"
	getstatic AMP // XML
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	getstatic entity // XMLTokener
	ldc literal_90:"apos"
	getstatic APOS // XML
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	getstatic entity // XMLTokener
	ldc literal_91:"gt"
	getstatic GT // XML
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	getstatic entity // XMLTokener
	ldc literal_93:"lt"
	getstatic LT // XML
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	getstatic entity // XMLTokener
	ldc literal_95:"quot"
	getstatic QUOT // XML
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	clinit_return 
	}

}
