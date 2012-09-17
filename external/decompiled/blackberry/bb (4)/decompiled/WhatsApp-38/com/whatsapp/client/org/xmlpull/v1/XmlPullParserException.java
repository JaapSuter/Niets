// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-37.cod
// Module version  : 2.7.3204
// Class ID        : 21
// ########################################################


package com.whatsapp.client.org.xmlpull.v1;


abstract public final class XmlPullParserException extends Exception

{

	// @@@@@@@@@@@@@ Fields 
	protected Throwable /*java.lang.Throwable*/  detail ; // ofs = 53990 addr = 0)
	protected int /*int*/  row ; // ofs = 53994 addr = 0)
	protected int /*int*/  column ; // ofs = 53998 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.org.xmlpull.v1.XmlPullParserException, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokespecial_lib java.lang.Exception.<init> // pc=2
	aload_0 
	bipush -1
	putfield row   // get_name_1:  row   // get_name_2:  row   // get_Name:    row   // getName->1:  row   // getName->2:  row   // getName->N:  row   // ofs = 53994 ord = 1 addr = 0
	aload_0 
	bipush -1
	putfield column   // get_name_1:  column   // get_name_2:  column   // get_Name:    column   // getName->1:  column   // getName->2:  column   // getName->N:  column   // ofs = 53998 ord = 2 addr = 0
	return 
	}


public <init>( com.whatsapp.client.org.xmlpull.v1.XmlPullParserException, java.lang.String, com.whatsapp.client.org.xmlpull.v1.XmlPullParser, java.lang.Throwable ); // address: 0
	{
	enter 
	aload_0 
	new_lib net.rim.device.api.ui.component.LabelField//net.rim.device.api.ui.component.LabelField net.rim.device.api.ui.component.LabelField net.rim.device.api.ui.component.LabelField
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_1 
	ifnonnull Label9
	ldc_nullstr 
	goto Label17
Label9:
	new_lib net.rim.device.api.ui.component.LabelField//net.rim.device.api.ui.component.LabelField net.rim.device.api.ui.component.LabelField net.rim.device.api.ui.component.LabelField
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_141:" "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
Label17:
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_2 
	ifnonnull Label22
	ldc_nullstr 
	goto Label32
Label22:
	new_lib net.rim.device.api.ui.component.LabelField//net.rim.device.api.ui.component.LabelField net.rim.device.api.ui.component.LabelField net.rim.device.api.ui.component.LabelField
	dup 
	ldc literal_142:"(position:"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_2 
	invokeinterface interfacemethodref_16 // pc=1 guess=7
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_143:") "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
Label32:
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_3 
	ifnonnull Label37
	ldc_nullstr 
	goto Label44
Label37:
	new_lib net.rim.device.api.ui.component.LabelField//net.rim.device.api.ui.component.LabelField net.rim.device.api.ui.component.LabelField net.rim.device.api.ui.component.LabelField
	dup 
	ldc literal_144:"caused by: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_3 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.Object ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
Label44:
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib java.lang.Exception.<init> // pc=2
	aload_0 
	bipush -1
	putfield row   // get_name_1:  row   // get_name_2:  row   // get_Name:    row   // getName->1:  row   // getName->2:  row   // getName->N:  row   // ofs = 53994 ord = 1 addr = 0
	aload_0 
	bipush -1
	putfield column   // get_name_1:  column   // get_name_2:  column   // get_Name:    column   // getName->1:  column   // getName->2:  column   // getName->N:  column   // ofs = 53998 ord = 2 addr = 0
	aload_2 
	ifnull Label63
	aload_0 
	aload_2 
	invokeinterface interfacemethodref_17 // pc=1 guess=8
	putfield row   // get_name_1:  row   // get_name_2:  row   // get_Name:    row   // getName->1:  row   // getName->2:  row   // getName->N:  row   // ofs = 53994 ord = 1 addr = 0
	aload_0 
	aload_2 
	invokeinterface interfacemethodref_18 // pc=1 guess=9
	putfield column   // get_name_1:  column   // get_name_2:  column   // get_Name:    column   // getName->1:  column   // getName->2:  column   // getName->N:  column   // ofs = 53998 ord = 2 addr = 0
Label63:
	aload_0 
	aload_3 
	putfield detail   // get_name_1:  detail   // get_name_2:  detail   // get_Name:    detail   // getName->1:  detail   // getName->2:  detail   // getName->N:  detail   // ofs = 53990 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final printStackTrace( com.whatsapp.client.org.xmlpull.v1.XmlPullParserException ); // address: 0
	{
	enter_narrow 
	aload_0_getfield detail   // get_name_1:  detail   // get_name_2:  detail   // get_Name:    detail   // getName->1:  detail   // getName->2:  detail   // getName->N:  detail   // ofs = 53990 ord = 0 addr = 0
	ifnonnull Label6
	aload_0 
	invokespecial_lib java.lang.Throwable.printStackTrace // pc=1
	return 
Label6:
	getstatic_lib err // System
	dup 
	astore_1 
	monitorenter 
	getstatic_lib err // System
	new_lib net.rim.device.api.ui.component.LabelField//net.rim.device.api.ui.component.LabelField net.rim.device.api.ui.component.LabelField net.rim.device.api.ui.component.LabelField
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_0 
	invokespecial_lib java.lang.Throwable.getMessage // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_140:"; nested exception is:"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual println( java.io.PrintStream, java.lang.String ) // pc=2
	aload_0_getfield detail   // get_name_1:  detail   // get_name_2:  detail   // get_Name:    detail   // getName->1:  detail   // getName->2:  detail   // getName->N:  detail   // ofs = 53990 ord = 0 addr = 0
	invokevirtual printStackTrace( java.lang.Throwable ) // pc=1
	aload_1 
	monitorexit 
	return 
	astore_2 
	aload_1 
	monitorexit 
	aload_2 
	athrow 
	}

}
