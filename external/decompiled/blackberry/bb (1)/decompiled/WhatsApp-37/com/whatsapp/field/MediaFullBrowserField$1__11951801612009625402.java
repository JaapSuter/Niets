// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-37.cod
// Module version  : 2.7.3204
// Class ID        : 0
// ########################################################


package com.whatsapp.field;


abstract final class MediaFullBrowserField$1 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.field.MediaFullBrowserField /*com.whatsapp.field.MediaFullBrowserField*/  this$0 ; // ofs = 51756 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.field.MediaFullBrowserField$1, com.whatsapp.field.MediaFullBrowserField ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.field.MediaFullBrowserField$1 ); // address: 0
	{
	enter 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	astore_1 
	iconst_1 
	newarray_object_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	astore_2 
Label8:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual net.rim.device.api.ui.Screen getScreen( net.rim.device.api.ui.Field ) // pc=1
	invokevirtual net.rim.device.api.system.Application getApplication( net.rim.device.api.ui.Screen ) // pc=1
	new MediaFullBrowserField$1$1
	dup 
	aload_0 
	aload_1 
	aload_2 
	invokespecial com.whatsapp.field.MediaFullBrowserField$1$1.<init> // pc=4
	invokevirtual invokeAndWait( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	aload_2 
	iconst_0 
	aaload 
	invokevirtual java.util.Enumeration keys( java.util.Hashtable ) // pc=1
	astore_3 
	aload_3 
	invokeinterface interfacemethodref_2 // pc=1 guess=0
	istore_4 
Label26:
	aload_3 
	invokeinterface interfacemethodref_2 // pc=1 guess=0
	ifeq Label59
	aload_3 
	invokeinterface interfacemethodref_3 // pc=1 guess=1
	checkcast MediaFullBrowserField$ScaleKey
	astore_5 
	aload_2 
	iconst_0 
	aaload 
	aload_5 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	astore_6 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _callback   // get_name_1:  _callback   // get_name_2:  _callback   // get_Name:    _callback   // getName->1:  _callback   // getName->2:  _callback   // getName->N:  _callback   // ofs = -1 ord = 0 addr = -1
	aload_6 
	aload_5 
	invokeinterface interfacemethodref_4 // pc=3 guess=2
	astore_7 
	aload_7 
	ifnull Label53
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _scaledImages   // get_name_1:  _scaledImages   // get_name_2:  _scaledImages   // get_Name:    _scaledImages   // getName->1:  _scaledImages   // getName->2:  _scaledImages   // getName->N:  _scaledImages   // ofs = -1 ord = 1 addr = -1
	aload_5 
	aload_7 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
Label53:
	aload_1 
	aload_5 
	aload_6 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	goto Label26
Label59:
	iload_4 
	ifeq Label63
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokestatic_lib com.whatsapp.field.MediaFullBrowserField.routine_12463(  ) // MediaFullBrowserField
Label63:
	aload_1 
	invokevirtual boolean isEmpty( java.util.Hashtable ) // pc=1
	ifeq Label67
	return 
Label67:
	aload_1 
	invokevirtual java.util.Enumeration keys( java.util.Hashtable ) // pc=1
	invokeinterface interfacemethodref_3 // pc=1 guess=1
	checkcast MediaFullBrowserField$ScaleKey
	astore_5 
	aload_1 
	aload_5 
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	astore_6 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _callback   // get_name_1:  _callback   // get_name_2:  _callback   // get_Name:    _callback   // getName->1:  _callback   // getName->2:  _callback   // getName->N:  _callback   // ofs = -1 ord = 0 addr = -1
	aload_6 
	aload_5 
	invokeinterface interfacemethodref_5 // pc=3 guess=3
	astore_7 
	aload_7 
	ifnonnull Label85
	goto_w Label8
Label85:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _scaledImages   // get_name_1:  _scaledImages   // get_name_2:  _scaledImages   // get_Name:    _scaledImages   // getName->1:  _scaledImages   // getName->2:  _scaledImages   // getName->N:  _scaledImages   // ofs = -1 ord = 1 addr = -1
	aload_5 
	aload_7 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokestatic_lib com.whatsapp.field.MediaFullBrowserField.routine_12479(  ) // MediaFullBrowserField
	goto_w Label8
	astore_7 
	goto_w Label8
	}

}
