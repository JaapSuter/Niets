// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-48.cod
// Module version  : 2.8.1914
// Class ID        : 3
// ########################################################


package com.whatsapp.client;


abstract public final class SearchPublisher extends Object
implements net.rim.device.api.unifiedsearch.content.AppContentListener

{

	// @@@@@@@@@@@@@ Fields 
	private com.whatsapp.client.SearchPublisher$ChatSearchable /*com.whatsapp.client.SearchPublisher$ChatSearchable*/  field_54550 ; // ofs = 54550 addr = 0)
	private net.rim.device.api.unifiedsearch.registry.RegistrationToken /*net.rim.device.api.unifiedsearch.registry.RegistrationToken*/  field_54554 ; // ofs = 54554 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.SearchPublisher ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	new SearchPublisher$ChatSearchable
	dup 
	invokespecial com.whatsapp.client.SearchPublisher$ChatSearchable.<init> // pc=1
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	invokestatic_lib net.rim.device.api.unifiedsearch.registry.SearchRegistry getInstance(  ) // SearchRegistry
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual net.rim.device.api.unifiedsearch.registry.RegistrationToken register( net.rim.device.api.unifiedsearch.registry.SearchRegistry, net.rim.device.api.unifiedsearch.searchables.Searchable ) // pc=2
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual boolean isValid( net.rim.device.api.unifiedsearch.registry.RegistrationToken ) // pc=1
	ifne Label21
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	ldc literal_869:"Application has failed to register with the Unified Search Framework"
	invokespecial_lib java.lang.Exception.<init> // pc=2
	athrow 
Label21:
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final boolean unregister( com.whatsapp.client.SearchPublisher ); // address: 0
	{
	enter_narrow 
	invokestatic_lib net.rim.device.api.unifiedsearch.registry.SearchRegistry getInstance(  ) // SearchRegistry
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual boolean deregister( net.rim.device.api.unifiedsearch.registry.SearchRegistry, net.rim.device.api.unifiedsearch.registry.RegistrationToken ) // pc=2
	ifeq Label15
	aload_0 
	aconst_null 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	aconst_null 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ldc literal_862:"search publisher unregistered"
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	iconst_1 
	ireturn 
Label15:
	iconst_0 
	ireturn 
	}


public final deleteChatHistory( com.whatsapp.client.SearchPublisher, java.lang.String ); // address: 0
	{
	enter 
	synch 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokenonvirtual com.whatsapp.client.SearchPublisher$ChatSearchable.deleteChatHistory // pc=2
	astore_2 
	aload_2 
	arraylength 
	ifle Label14
	invokestatic_lib net.rim.device.api.unifiedsearch.content.AppContentManager getInstance(  ) // AppContentManager
	aload_2 
	aload_0 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual deleteContent( net.rim.device.api.unifiedsearch.content.AppContentManager, net.rim.device.api.unifiedsearch.entity.SearchableEntity[], net.rim.device.api.unifiedsearch.content.AppContentListener, net.rim.device.api.unifiedsearch.registry.RegistrationToken ) // pc=4
Label14:
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	ldc literal_863:"deleted "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_2 
	arraylength 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_864:" contacts from chat history in search"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	return 
	}


public final deleteContact( com.whatsapp.client.SearchPublisher, module:WhatsApp.class#20 ); // address: 0
	{
	enter 
	synch 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokenonvirtual com.whatsapp.client.SearchPublisher$ChatSearchable.deleteContact // pc=2
	astore_2 
	aload_2 
	arraylength 
	ifle Label14
	invokestatic_lib net.rim.device.api.unifiedsearch.content.AppContentManager getInstance(  ) // AppContentManager
	aload_2 
	aload_0 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual deleteContent( net.rim.device.api.unifiedsearch.content.AppContentManager, net.rim.device.api.unifiedsearch.entity.SearchableEntity[], net.rim.device.api.unifiedsearch.content.AppContentListener, net.rim.device.api.unifiedsearch.registry.RegistrationToken ) // pc=4
Label14:
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	ldc literal_863:"deleted "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_2 
	arraylength 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_865:" contacts from CID in search"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	return 
	}


public final updateChatHistory( com.whatsapp.client.SearchPublisher, module:WhatsApp-11.class#1 ); // address: 0
	{
	enter 
	synch 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokenonvirtual com.whatsapp.client.SearchPublisher$ChatSearchable.updateChatHistory // pc=2
	astore_2 
	aload_2 
	arraylength 
	ifle Label14
	invokestatic_lib net.rim.device.api.unifiedsearch.content.AppContentManager getInstance(  ) // AppContentManager
	aload_2 
	aload_0 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual updateContent( net.rim.device.api.unifiedsearch.content.AppContentManager, net.rim.device.api.unifiedsearch.entity.SearchableEntity[], net.rim.device.api.unifiedsearch.content.AppContentListener, net.rim.device.api.unifiedsearch.registry.RegistrationToken ) // pc=4
Label14:
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	ldc literal_866:"updated group chat from history "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokestatic_lib module:WhatsApp-79.class#39.routine_24413(  ) // class#39
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	return 
	}


public final updateContact( com.whatsapp.client.SearchPublisher, module:WhatsApp.class#20 ); // address: 0
	{
	enter 
	synch 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokenonvirtual com.whatsapp.client.SearchPublisher$ChatSearchable.updateContact // pc=2
	astore_2 
	aload_2 
	arraylength 
	ifle Label14
	invokestatic_lib net.rim.device.api.unifiedsearch.content.AppContentManager getInstance(  ) // AppContentManager
	aload_2 
	aload_0 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual updateContent( net.rim.device.api.unifiedsearch.content.AppContentManager, net.rim.device.api.unifiedsearch.entity.SearchableEntity[], net.rim.device.api.unifiedsearch.content.AppContentListener, net.rim.device.api.unifiedsearch.registry.RegistrationToken ) // pc=4
Label14:
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	ldc literal_867:"updated "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_2 
	arraylength 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_868:" contacts from CID "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	return 
	}


public final onUpdateComplete( com.whatsapp.client.SearchPublisher, int ); // address: 0
	{
	noenter_return 
	}


public final onInsertComplete( com.whatsapp.client.SearchPublisher, int ); // address: 0
	{
	noenter_return 
	}


public final onDeleteComplete( com.whatsapp.client.SearchPublisher, int ); // address: 0
	{
	noenter_return 
	}

}
