// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-35.cod
// Module version  : 2.7.3204
// Class ID        : 21
// ########################################################


package com.whatsapp.client.org.xmlpull.v1;


interface public class XmlPullParser extends Object

{
	// @@@@@@@@@@@@@ Static fields 
	public final static String /*java.lang.String[]*/  TYPES ; // ofs = 54886 addr = 59)


	// @@@@@@@@@@@@@ Static routines 

static <clinit>(  ); // address: 0
	{
	enter 
	synch_static XmlPullParser
	clinit_wait 
	op01xx 
	stringarrayinit [START_DOCUMENT, END_DOCUMENT, START_TAG, END_TAG, TEXT, CDSECT, ENTITY_REF, IGNORABLE_WHITESPACE, PROCESSING_INSTRUCTION, COMMENT, DOCDECL]
	putstatic TYPES // XmlPullParser
	clinit_return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

abstract public setInput( com.whatsapp.client.org.xmlpull.v1.XmlPullParser, java.io.Reader ); // address: 0
	{
	halt 
	}


abstract public java.lang.String getPositionDescription( com.whatsapp.client.org.xmlpull.v1.XmlPullParser ); // address: 0
	{
	halt 
	}


abstract public int getLineNumber( com.whatsapp.client.org.xmlpull.v1.XmlPullParser ); // address: 0
	{
	halt 
	}


abstract public int getColumnNumber( com.whatsapp.client.org.xmlpull.v1.XmlPullParser ); // address: 0
	{
	halt 
	}


abstract public java.lang.String getAttributeValue( com.whatsapp.client.org.xmlpull.v1.XmlPullParser, java.lang.String, java.lang.String ); // address: 0
	{
	halt 
	}


abstract public require( com.whatsapp.client.org.xmlpull.v1.XmlPullParser, int, java.lang.String, java.lang.String ); // address: 0
	{
	halt 
	}


abstract public int nextTag( com.whatsapp.client.org.xmlpull.v1.XmlPullParser ); // address: 0
	{
	halt 
	}

}
