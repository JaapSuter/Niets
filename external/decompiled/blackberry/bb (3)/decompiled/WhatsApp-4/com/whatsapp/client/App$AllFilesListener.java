// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-4.cod
// Module version  : 2.7.3204
// Class ID        : 12
// ########################################################


package com.whatsapp.client;


abstract public final class App$AllFilesListener extends Object
implements net.rim.device.api.io.file.FileSystemJournalListener

{

	// @@@@@@@@@@@@@ Fields 
	private long /*long*/  _lastChangeNumber ; // ofs = 59466 addr = 0)
	private com.whatsapp.client.ChatState /*module:WhatsApp-12.class#30*/  _cs ; // ofs = 59470 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.App$AllFilesListener, module:WhatsApp-12.class#30 ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	iconst_0 
	i2l 
	lputfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	aload_1 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final fileJournalChanged( com.whatsapp.client.App$AllFilesListener ); // address: 0
	{
	enter 
	aconst_null 
	astore_1 
	invokestatic_lib long getNextUSN(  ) // FileSystemJournal
	lstore 2
	lload 2
	iconst_1 
	i2l 
	lsub 
	lstore 4
Label10:
	lload 4
	aload_0 
	lgetfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	lcmp 
	iflt Label61
	lload 4
	lload 2
	lcmp 
	ifge Label61
	lload 4
	invokestatic_lib net.rim.device.api.io.file.FileSystemJournalEntry getEntry( long ) // FileSystemJournal
	astore_6 
	aload_6 
	ifnonnull Label25
	return 
Label25:
	aload_6 
	invokevirtual int getEvent( net.rim.device.api.io.file.FileSystemJournalEntry ) // pc=1
	ifeq Label32
	aload_6 
	invokevirtual int getEvent( net.rim.device.api.io.file.FileSystemJournalEntry ) // pc=1
	bipush 3
	if_icmpne Label52
Label32:
	aload_6 
	invokevirtual java.lang.String getPath( net.rim.device.api.io.file.FileSystemJournalEntry ) // pc=1
	astore_1 
	aload_1 
	ifnull Label52
	aload_1 
	ldc literal_54:"/"
	invokenonvirtual_lib java.lang.String.endsWith // pc=2
	ifne Label52
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	new_lib Runnable//java.lang.Runnable java.lang.Runnable java.lang.Runnable
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	getstatic_lib module:WhatsApp-45.class#0.static_153 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	putfield .field_31_31   // get_name_1:  .field_31_31   // get_name_2:  .field_31_31   // get_Name:    .field_31_31   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 31
	return 
Label52:
	aload_0 
	lload 2
	lputfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	lload 4
	iconst_1 
	i2l 
	lsub 
	lstore 4
	goto Label10
Label61:
	return 
	}

}
