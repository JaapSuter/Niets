// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-3.cod
// Module version  : 2.7.3204
// Class ID        : 8
// ########################################################


package com.whatsapp.client;


abstract final class App$18 extends Object
implements net.rim.blackberry.api.mail.event.MessageListener

{

	// @@@@@@@@@@@@@ Fields 
	private final net.rim.blackberry.api.mail.Message /*net.rim.blackberry.api.mail.Message*/  field_58178 ; // ofs = 58178 addr = 0)
	private final com.whatsapp.client.FunXMPP$IntRunnable /*module:WhatsApp-14.class#21*/  field_58182 ; // ofs = 58182 addr = 0)
	private final long /*long*/  field_58186 ; // ofs = 58186 addr = 0)
	private final com.whatsapp.client.FunXMPP$StringRunnable /*module:WhatsApp-15.class#20*/  field_58190 ; // ofs = 58190 addr = 0)
	private final com.whatsapp.client.App /*com.whatsapp.client.App*/  field_58194 ; // ofs = 58194 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.App$18, com.whatsapp.client.App, net.rim.blackberry.api.mail.Message, module:WhatsApp-14.class#21, long, module:WhatsApp-15.class#20 ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0 
	aload_2 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	aload_3 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	lload 4
	lputfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aload_6 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final changed( com.whatsapp.client.App$18, net.rim.blackberry.api.mail.event.MessageEvent ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual int getStatus( net.rim.blackberry.api.mail.Message ) // pc=1
	istore_2 
	iload_2 
	iipush 4194303
	if_icmpeq Label13
	iload_2 
	iipush 2097151
	if_icmpeq Label13
	iload_2 
	iipush 33554431
	if_icmpne Label21
Label13:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokestatic_lib long currentTimeMillis(  ) // System
	aload_0 
	lgetfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	lsub 
	l2i 
	invokeinterface interfacemethodref_2 // pc=2 guess=2
	goto Label48
Label21:
	iload_2 
	sipush 8191
	if_icmpeq Label27
	iload_2 
	sipush 16383
	if_icmpne Label47
Label27:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual int getStatus( net.rim.blackberry.api.mail.Message ) // pc=1
	invokestatic_lib java.lang.String toHexString( int ) // Integer
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_50:"("
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokestatic_lib long currentTimeMillis(  ) // System
	aload_0 
	lgetfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	lsub 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, long ) // pc=3
	ldc literal_51:"ms)"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokeinterface interfacemethodref_3 // pc=2 guess=3
	goto Label48
Label47:
	return 
Label48:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	invokevirtual removeMessageListener( net.rim.blackberry.api.mail.Message, net.rim.blackberry.api.mail.event.MessageListener ) // pc=2
	return 
	}

}
