// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-37.cod
// Module version  : 2.7.3204
// Class ID        : 18
// ########################################################


package com.whatsapp.client.org.json.me.util;


abstract public final class XML extends Object

{
	// @@@@@@@@@@@@@ Static fields 
	public final static Character /*java.lang.Character*/  AMP ; // ofs = 53764 addr = 41)
	public final static Character /*java.lang.Character*/  APOS ; // ofs = 53770 addr = 42)
	public final static Character /*java.lang.Character*/  BANG ; // ofs = 53776 addr = 43)
	public final static Character /*java.lang.Character*/  EQ ; // ofs = 53782 addr = 44)
	public final static Character /*java.lang.Character*/  GT ; // ofs = 53788 addr = 45)
	public final static Character /*java.lang.Character*/  LT ; // ofs = 53794 addr = 46)
	public final static Character /*java.lang.Character*/  QUEST ; // ofs = 53800 addr = 47)
	public final static Character /*java.lang.Character*/  QUOT ; // ofs = 53806 addr = 48)
	public final static Character /*java.lang.Character*/  SLASH ; // ofs = 53812 addr = 49)


	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.org.json.me.util.XML ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	synch_static XML
	clinit_wait 
	new_lib Runnable//java.lang.Runnable java.lang.Runnable java.lang.Runnable
	dup 
	bipush 38
	invokespecial_lib java.lang.Character.<init> // pc=2
	putstatic AMP // XML
	new_lib Runnable//java.lang.Runnable java.lang.Runnable java.lang.Runnable
	dup 
	bipush 39
	invokespecial_lib java.lang.Character.<init> // pc=2
	putstatic APOS // XML
	new_lib Runnable//java.lang.Runnable java.lang.Runnable java.lang.Runnable
	dup 
	bipush 33
	invokespecial_lib java.lang.Character.<init> // pc=2
	putstatic BANG // XML
	new_lib Runnable//java.lang.Runnable java.lang.Runnable java.lang.Runnable
	dup 
	bipush 61
	invokespecial_lib java.lang.Character.<init> // pc=2
	putstatic EQ // XML
	new_lib Runnable//java.lang.Runnable java.lang.Runnable java.lang.Runnable
	dup 
	bipush 62
	invokespecial_lib java.lang.Character.<init> // pc=2
	putstatic GT // XML
	new_lib Runnable//java.lang.Runnable java.lang.Runnable java.lang.Runnable
	dup 
	bipush 60
	invokespecial_lib java.lang.Character.<init> // pc=2
	putstatic LT // XML
	new_lib Runnable//java.lang.Runnable java.lang.Runnable java.lang.Runnable
	dup 
	bipush 63
	invokespecial_lib java.lang.Character.<init> // pc=2
	putstatic QUEST // XML
	new_lib Runnable//java.lang.Runnable java.lang.Runnable java.lang.Runnable
	dup 
	bipush 34
	invokespecial_lib java.lang.Character.<init> // pc=2
	putstatic QUOT // XML
	new_lib Runnable//java.lang.Runnable java.lang.Runnable java.lang.Runnable
	dup 
	bipush 47
	invokespecial_lib java.lang.Character.<init> // pc=2
	putstatic SLASH // XML
	clinit_return 
	}

}
