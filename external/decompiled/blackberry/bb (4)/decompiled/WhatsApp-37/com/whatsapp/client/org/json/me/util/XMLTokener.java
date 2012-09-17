// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-37.cod
// Module version  : 2.7.3204
// Class ID        : 19
// ########################################################


package com.whatsapp.client.org.json.me.util;


abstract public final class XMLTokener extends com.whatsapp.client.org.json.me.JSONTokener

{
	// @@@@@@@@@@@@@ Static fields 
	public final static java.util.Hashtable /*java.util.Hashtable*/  entity ; // ofs = 53872 addr = 52)


	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.org.json.me.util.XMLTokener, java.lang.String ); // address: 0
	{
	jumpspecial_lib .routine_1608(  )
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	clinit_lib com.whatsapp.client.org.json.me.JSONTokener//module:WhatsApp-36.class#9 module:WhatsApp-36.class#9 module:WhatsApp-36.class#9
	synch_static XMLTokener
	clinit_wait 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	bipush 8
	invokespecial_lib java.util.Hashtable.<init> // pc=2
	putstatic entity // XMLTokener
	getstatic entity // XMLTokener
	ldc literal_70:"amp"
	getstatic AMP // XML
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	getstatic entity // XMLTokener
	ldc literal_71:"apos"
	getstatic APOS // XML
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	getstatic entity // XMLTokener
	ldc literal_72:"gt"
	getstatic GT // XML
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	getstatic entity // XMLTokener
	ldc literal_73:"lt"
	getstatic LT // XML
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	getstatic entity // XMLTokener
	ldc literal_74:"quot"
	getstatic QUOT // XML
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	clinit_return 
	}

}
