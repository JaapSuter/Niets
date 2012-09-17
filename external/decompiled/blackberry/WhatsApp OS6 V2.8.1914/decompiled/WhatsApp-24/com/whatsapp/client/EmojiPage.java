// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-24.cod
// Module version  : 2.8.1914
// Class ID        : 12
// ########################################################


package com.whatsapp.client;


abstract public final class EmojiPage extends Object

{
	// @@@@@@@@@@@@@ Static fields 
	private final static com.whatsapp.client.EmojiPage /*com.whatsapp.client.EmojiPage[]*/  field_54358 ; // ofs = 54358 addr = 26)

	// @@@@@@@@@@@@@ Fields 
	private final String /*java.lang.String*/  field_54350 ; // ofs = 54350 addr = 0)
	private final String /*java.lang.String*/  field_54354 ; // ofs = 54354 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

private <init>( com.whatsapp.client.EmojiPage, java.lang.String, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	aload_2 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	return 
	}


static public final int getEmojiPageCount(  ); // address: 0
	{
	enter_narrow 
	getstatic com.whatsapp.client.EmojiPage.field_54358 // EmojiPage
	arraylength 
	ireturn 
	}


static public final com.whatsapp.client.EmojiPage getEmojiPage( int ); // address: 0
	{
	enter 
	getstatic com.whatsapp.client.EmojiPage.field_54358 // EmojiPage
	dup 
	astore_2 
	monitorenter 
	getstatic com.whatsapp.client.EmojiPage.field_54358 // EmojiPage
	iload_0 
	aaload 
	ifnonnull Label11
	iload_0 
	invokestatic com.whatsapp.client.EmojiPage.routine_2933( int ) // EmojiPage
Label11:
	getstatic com.whatsapp.client.EmojiPage.field_54358 // EmojiPage
	iload_0 
	aaload 
	astore_1 
	aload_2 
	monitorexit 
	aload_1 
	areturn 
	astore_3 
	aload_2 
	monitorexit 
	aload_3 
	athrow 
	}


static private final com.whatsapp.client.EmojiPage.routine_2933( int ); // address: 0
	{
	enter 
	iload_0 
	ifne Label9
	sipush 774
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	astore_1 
	ldc_unicode literal_89:"?????????????????????????????????????????????????????????????????????????????????????????????????????????????"
	astore_2 
	goto Label47
Label9:
	iload_0 
	iconst_1 
	if_icmpne Label18
	sipush 775
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	astore_1 
	ldc_unicode literal_90:"?????????????????????????????????????????????????????"
	astore_2 
	goto Label47
Label18:
	iload_0 
	bipush 2
	if_icmpne Label27
	sipush 776
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	astore_1 
	ldc_unicode literal_91:"???????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????"
	astore_2 
	goto Label47
Label27:
	iload_0 
	bipush 3
	if_icmpne Label36
	sipush 777
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	astore_1 
	ldc_unicode literal_92:"??????????????????????????????????????????????????????????????????????"
	astore_2 
	goto Label47
Label36:
	new_lib net.rim.device.api.ui.component.Dialog//net.rim.device.api.ui.component.Dialog net.rim.device.api.ui.component.Dialog net.rim.device.api.ui.component.Dialog
	dup 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_93:"Emoji page index out of range: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload_0 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib java.lang.IllegalArgumentException.<init> // pc=2
	athrow 
Label47:
	getstatic com.whatsapp.client.EmojiPage.field_54358 // EmojiPage
	iload_0 
	new EmojiPage
	dup 
	aload_1 
	aload_2 
	invokespecial com.whatsapp.client.EmojiPage.<init> // pc=3
	aastore 
	return 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	synch_static EmojiPage
	clinit_wait 
	bipush 4
	newarray_object EmojiPage
	putstatic com.whatsapp.client.EmojiPage.field_54358 // EmojiPage
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

public final java.lang.String getTitle( com.whatsapp.client.EmojiPage ); // address: 0
	{
	areturn_field .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	}


public final java.lang.String getEmoji( com.whatsapp.client.EmojiPage ); // address: 0
	{
	areturn_field .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	}

}
