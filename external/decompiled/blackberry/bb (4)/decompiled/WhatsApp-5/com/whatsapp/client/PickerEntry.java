// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-27.cod
// Module version  : 2.7.3204
// Class ID        : 22
// ########################################################


package com.whatsapp.client;


abstract public final class PickerEntry extends Object

{

	// @@@@@@@@@@@@@ Fields 
	public int /*int*/  _type ; // ofs = 54886 addr = 0)
	public String /*java.lang.String*/  _fullPath ; // ofs = 54890 addr = 0)
	public String /*java.lang.String*/  _displayText ; // ofs = 54894 addr = 0)
	public long /*long*/  _lastMod ; // ofs = 54898 addr = 0)
	public net.rim.device.api.system.Bitmap /*net.rim.device.api.system.Bitmap*/  _thumb ; // ofs = 54902 addr = 0)
	public net.rim.device.api.ui.Field /*net.rim.device.api.ui.Field*/  _UIField ; // ofs = 54906 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.PickerEntry, int, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	iconst_0 
	i2l 
	lputfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	iload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	aload_2 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	aload_3 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	return 
	}


static public final com.whatsapp.client.PickerEntry makeSeparator(  ); // address: 0
	{
	enter 
	new PickerEntry
	dup 
	bipush 3
	aconst_null 
	aconst_null 
	invokespecial com.whatsapp.client.PickerEntry.<init> // pc=4
	astore_0 
	aload_0 
	new_lib net.rim.device.api.ui.component.NullField//net.rim.device.api.ui.component.NullField net.rim.device.api.ui.component.NullField net.rim.device.api.ui.component.NullField
	dup 
	invokespecial_lib net.rim.device.api.ui.component.SeparatorField.<init> // pc=1
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0 
	areturn 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

public final long getLastMod( com.whatsapp.client.PickerEntry ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifeq Label6
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iconst_1 
	if_icmpne Label24
Label6:
	aload_0 
	lgetfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iconst_0 
	i2l 
	lcmp 
	ifne Label24
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String ) // Connector
	checkcast_lib javax.microedition.io.Connection//javax.microedition.io.Connection javax.microedition.io.Connection javax.microedition.io.Connection
	astore_1 
	aload_0 
	aload_1 
	invokeinterface interfacemethodref_93 // pc=1 guess=24
	lputfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_1 
	invokeinterface interfacemethodref_89 // pc=1 guess=25
	goto Label24
	astore_1 
Label24:
	aload_0 
	lgetfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	lreturn 
	}

}
