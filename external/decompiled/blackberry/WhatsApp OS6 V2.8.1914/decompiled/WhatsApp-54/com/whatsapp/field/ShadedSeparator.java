// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-54.cod
// Module version  : 2.8.1914
// Class ID        : 3
// ########################################################


package com.whatsapp.field;


abstract public final class ShadedSeparator extends net.rim.device.api.ui.Field

{


	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.field.ShadedSeparator ); // address: 0
	{
	jumpspecial_lib <init>( net.rim.device.api.ui.Field )
	}


static public final paintSeparator( net.rim.device.api.ui.Graphics, int, int, int ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual int getColor( net.rim.device.api.ui.Graphics ) // pc=1
	istore_4 
	aload_0 
	invokevirtual int getGlobalAlpha( net.rim.device.api.ui.Graphics ) // pc=1
	istore_5 
	aload_0 
	iconst_0 
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_0 
	bipush 63
	invokevirtual setGlobalAlpha( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	iload_2 
	invokevirtual drawLine( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	aload_0 
	iipush 16777215
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_0 
	iload_1 
	iload_2 
	iconst_1 
	iadd 
	iload_3 
	iload_2 
	iconst_1 
	iadd 
	invokevirtual drawLine( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	aload_0 
	iload_4 
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_0 
	iload_5 
	invokevirtual setGlobalAlpha( net.rim.device.api.ui.Graphics, int ) // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final layout( com.whatsapp.field.ShadedSeparator, int, int ); // address: 0
	{
	enter 
	iload_1 
	istore_3 
	bipush 2
	aload_0 
	invokevirtual int getPaddingTop( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	aload_0 
	invokevirtual int getPaddingBottom( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	iload_2 
	invokestatic_lib int min( int, int ) // Math
	istore_4 
	aload_0 
	iload_3 
	iload_4 
	invokevirtual setExtent( net.rim.device.api.ui.Field, int, int ) // pc=3
	return 
	}


protected final paint( com.whatsapp.field.ShadedSeparator, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	bipush 2
	aload_0 
	invokevirtual int getPaddingTop( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	aload_0 
	invokevirtual int getPaddingBottom( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	if_icmplt Label30
	aload_0 
	invokevirtual int getPaddingTop( net.rim.device.api.ui.Field ) // pc=1
	istore_2 
	aload_0 
	invokevirtual int getPaddingLeft( net.rim.device.api.ui.Field ) // pc=1
	istore_3 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	aload_0 
	invokevirtual int getPaddingRight( net.rim.device.api.ui.Field ) // pc=1
	isub 
	iconst_1 
	isub 
	istore_4 
	aload_1 
	iload_3 
	iload_2 
	iload_4 
	invokestatic paintSeparator( net.rim.device.api.ui.Graphics, int, int, int ) // ShadedSeparator
Label30:
	return 
	}

}
