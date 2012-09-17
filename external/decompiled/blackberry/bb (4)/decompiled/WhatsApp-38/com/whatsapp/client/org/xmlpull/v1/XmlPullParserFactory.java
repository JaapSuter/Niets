// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-37.cod
// Module version  : 2.7.3204
// Class ID        : 22
// ########################################################


package com.whatsapp.client.org.xmlpull.v1;


abstract public final class XmlPullParserFactory extends Object

{
	// @@@@@@@@@@@@@ Static fields 
	final static Class /*java.lang.Class*/  referenceContextClass ; // ofs = 54066 addr = 60)
	public static String /*java.lang.String*/  PROPERTY_NAME ; // ofs = 54072 addr = 61)
	private static String /*java.lang.String*/  field_54078 ; // ofs = 54078 addr = 62)

	// @@@@@@@@@@@@@ Fields 
	protected java.util.Vector /*java.util.Vector*/  parserClasses ; // ofs = 54050 addr = 0)
	protected String /*java.lang.String*/  classNamesLocation ; // ofs = 54054 addr = 0)
	protected java.util.Vector /*java.util.Vector*/  serializerClasses ; // ofs = 54058 addr = 0)
	protected java.util.Hashtable /*java.util.Hashtable*/  features ; // ofs = 54062 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

protected <init>( com.whatsapp.client.org.xmlpull.v1.XmlPullParserFactory ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	return 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	synch_static XmlPullParserFactory
	clinit_wait 
	new XmlPullParserFactory
	dup 
	invokespecial com.whatsapp.client.org.xmlpull.v1.XmlPullParserFactory.<init> // pc=1
	astore_0 
	aload_0 
	invokenonvirtual_lib java.lang.Object.getClass // pc=1
	putstatic referenceContextClass // XmlPullParserFactory
	ldc literal_145:"org.xmlpull.v1.XmlPullParserFactory"
	putstatic PROPERTY_NAME // XmlPullParserFactory
	new_lib net.rim.device.api.ui.component.LabelField//net.rim.device.api.ui.component.LabelField net.rim.device.api.ui.component.LabelField net.rim.device.api.ui.component.LabelField
	dup 
	ldc literal_146:"/META-INF/services/"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	getstatic PROPERTY_NAME // XmlPullParserFactory
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	putstatic com.whatsapp.client.org.xmlpull.v1.XmlPullParserFactory.field_54078 // XmlPullParserFactory
	clinit_return 
	}

}
