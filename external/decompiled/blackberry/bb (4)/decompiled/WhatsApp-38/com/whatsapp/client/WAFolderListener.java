// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-36.cod
// Module version  : 2.7.3204
// Class ID        : 15
// ########################################################


package com.whatsapp.client;


abstract public final class WAFolderListener extends Object
implements net.rim.blackberry.api.mail.event.FolderListener

{


	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.WAFolderListener ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final java.lang.String com.whatsapp.client.WAFolderListener.routine_7648( com.whatsapp.client.WAFolderListener, net.rim.blackberry.api.mail.Message ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual java.lang.String getBodyText( net.rim.blackberry.api.mail.Message ) // pc=1
	astore_3 
	aload_3 
	getstatic_lib module:WhatsApp-12.class#0.static_145 // class#0
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	istore_4 
	iload_4 
	iflt Label30
	aconst_null 
	astore_5 
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	aload_3 
	iload_4 
	bipush 5
	iadd 
	invokenonvirtual_lib java.lang.String.substring // pc=2
	getstatic_lib module:WhatsApp-12.class#0.static_2 // class#0
	invokenonvirtual_lib java.lang.String.getBytes // pc=2
	invokestatic byte[] decode( byte[] ) // Base64
	getstatic_lib module:WhatsApp-12.class#0.static_2 // class#0
	invokespecial_lib java.lang.String.<init> // pc=3
	astore_5 
	goto Label27
	astore_6 
Label27:
	aload_5 
	astore_2 
	goto Label37
Label30:
	aconst_null 
	astore_2 
	aload_2 
	areturn 
	astore_3 
	aconst_null 
	areturn 
Label37:
	aload_2 
	areturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final messagesAdded( com.whatsapp.client.WAFolderListener, net.rim.blackberry.api.mail.event.FolderEvent ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual net.rim.blackberry.api.mail.Message getMessage( net.rim.blackberry.api.mail.event.FolderEvent ) // pc=1
	astore_2 
	aload_2 
	ifnonnull Label7
	goto_w Label76
Label7:
	aload_2 
	invokevirtual net.rim.blackberry.api.mail.Address getFrom( net.rim.blackberry.api.mail.Message ) // pc=1
	astore_3 
	goto Label13
	astore_4 
	return 
Label13:
	aload_2 
	invokevirtual java.lang.String getSubject( net.rim.blackberry.api.mail.Message ) // pc=1
	astore_4 
	aload_4 
	ifnonnull Label19
	goto_w Label76
Label19:
	aload_3 
	ifnonnull Label22
	goto_w Label76
Label22:
	aload_3 
	invokevirtual java.lang.String getAddr( net.rim.blackberry.api.mail.Address ) // pc=1
	bipush 64
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	bipush -1
	if_icmpne Label76
	aload_3 
	invokevirtual java.lang.String getAddr( net.rim.blackberry.api.mail.Address ) // pc=1
	stringlength 
	bipush 8
	if_icmpne Label76
	aload_4 
	getstatic_lib module:WhatsApp-12.class#0.static_143 // class#0
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	bipush -1
	if_icmpne Label39
	return 
Label39:
	aload_3 
	invokevirtual java.lang.String getAddr( net.rim.blackberry.api.mail.Address ) // pc=1
	invokestatic_lib int getDeviceId(  ) // DeviceInfo
	invokestatic_lib java.lang.String toHexString( int ) // Integer
	invokenonvirtual_lib java.lang.String.equalsIgnoreCase // pc=2
	ifeq Label46
	return 
Label46:
	lipush 6554973023840314349
	lipush 7175187529162815719
	invokestatic_lib moveSource( long, long ) // NotificationsManager
	aload_0 
	aload_2 
	invokespecial com.whatsapp.client.WAFolderListener.routine_7648 // pc=2
	astore_5 
	aload_2 
	iconst_1 
	iconst_1 
	invokevirtual setFlag( net.rim.blackberry.api.mail.Message, int, boolean ) // pc=3
	goto Label59
	astore_6 
Label59:
	aload_2 
	invokevirtual net.rim.blackberry.api.mail.Folder getFolder( net.rim.blackberry.api.mail.Message ) // pc=1
	aload_2 
	iconst_1 
	invokevirtual boolean deleteMessage( net.rim.blackberry.api.mail.Folder, net.rim.blackberry.api.mail.Message, boolean ) // pc=3
	pop 
	goto Label67
	astore_6 
Label67:
	new_lib java.io.Writer//java.io.Writer java.io.Writer java.io.Writer
	dup 
	new WAFolderListener$1
	dup 
	aload_0 
	aload_5 
	invokespecial com.whatsapp.client.WAFolderListener$1.<init> // pc=3
	invokespecial_lib java.lang.Thread.<init> // pc=2
	invokevirtual start( java.lang.Thread ) // pc=1
Label76:
	return 
	}


public final messagesRemoved( com.whatsapp.client.WAFolderListener, net.rim.blackberry.api.mail.event.FolderEvent ); // address: 0
	{
	noenter_return 
	}

}
