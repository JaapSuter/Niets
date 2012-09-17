// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-9.cod
// Module version  : 2.8.1914
// Class ID        : 2
// ########################################################


package com.whatsapp.client;


abstract final class BitmapButtonField$SpinnerDrawableImage$1 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.BitmapButtonField$SpinnerDrawableImage /*com.whatsapp.client.BitmapButtonField$SpinnerDrawableImage*/  field_59464 ; // ofs = 59464 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.BitmapButtonField$SpinnerDrawableImage$1, com.whatsapp.client.BitmapButtonField$SpinnerDrawableImage ); // address: 0
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

public final run( com.whatsapp.client.BitmapButtonField$SpinnerDrawableImage$1 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokespecial com.whatsapp.client.BitmapButtonField$SpinnerDrawableImage.advanceFrame // pc=1
	return 
	}

}
