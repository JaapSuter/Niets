// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-56.cod
// Module version  : 2.8.1914
// Class ID        : 1
// ########################################################


package com.whatsapp.location;


abstract public final class PlacesException extends Exception

{

	// @@@@@@@@@@@@@ Fields 
	private int /*int*/  field_59884 ; // ofs = 59884 addr = 0)
	private Throwable /*java.lang.Throwable*/  field_59888 ; // ofs = 59888 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.location.PlacesException, int, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_2 
	invokespecial_lib java.lang.Exception.<init> // pc=2
	aload_0 
	iload_1 
	putfield com.whatsapp.location.PlacesException.field_59884   // get_name_1:  com.whatsapp.location.PlacesException.field_59884   // get_name_2:  com.whatsapp.location.PlacesException.field_59884   // get_Name:    com.whatsapp.location.PlacesException.field_59884   // getName->1:     // getName->2:     // getName->N:     // ofs = 59884 ord = 0 addr = 0
	return 
	}


public <init>( com.whatsapp.location.PlacesException, java.lang.Throwable ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	invokespecial_lib java.lang.Exception.<init> // pc=2
	aload_0 
	iconst_0 
	putfield com.whatsapp.location.PlacesException.field_59884   // get_name_1:  com.whatsapp.location.PlacesException.field_59884   // get_name_2:  com.whatsapp.location.PlacesException.field_59884   // get_Name:    com.whatsapp.location.PlacesException.field_59884   // getName->1:     // getName->2:     // getName->N:     // ofs = 59884 ord = 0 addr = 0
	aload_0 
	aload_1 
	putfield com.whatsapp.location.PlacesException.field_59888   // get_name_1:  com.whatsapp.location.PlacesException.field_59888   // get_name_2:  com.whatsapp.location.PlacesException.field_59888   // get_Name:    com.whatsapp.location.PlacesException.field_59888   // getName->1:     // getName->2:     // getName->N:     // ofs = 59888 ord = 1 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final int getType( com.whatsapp.location.PlacesException ); // address: 0
	{
	ireturn_field com.whatsapp.location.PlacesException.field_59884   // get_name_1:  com.whatsapp.location.PlacesException.field_59884   // get_name_2:  com.whatsapp.location.PlacesException.field_59884   // get_Name:    com.whatsapp.location.PlacesException.field_59884   // getName->1:     // getName->2:     // getName->N:     // ofs = 59884 ord = 0 addr = 0
	}

}
