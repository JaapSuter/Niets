// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-35.cod
// Module version  : 2.7.3204
// Class ID        : 19
// ########################################################


package com.whatsapp.client.org.json.me.util;


abstract public final class XML extends Object

{
	// @@@@@@@@@@@@@ Static fields 
	public final static Character /*java.lang.Character*/  AMP ; // ofs = 54714 addr = 45)
	public final static Character /*java.lang.Character*/  APOS ; // ofs = 54720 addr = 46)
	public final static Character /*java.lang.Character*/  BANG ; // ofs = 54726 addr = 47)
	public final static Character /*java.lang.Character*/  EQ ; // ofs = 54732 addr = 48)
	public final static Character /*java.lang.Character*/  GT ; // ofs = 54738 addr = 49)
	public final static Character /*java.lang.Character*/  LT ; // ofs = 54744 addr = 50)
	public final static Character /*java.lang.Character*/  QUEST ; // ofs = 54750 addr = 51)
	public final static Character /*java.lang.Character*/  QUOT ; // ofs = 54756 addr = 52)
	public final static Character /*java.lang.Character*/  SLASH ; // ofs = 54762 addr = 53)


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
