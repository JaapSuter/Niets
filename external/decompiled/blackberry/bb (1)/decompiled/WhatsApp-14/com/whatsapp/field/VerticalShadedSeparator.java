// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-37.cod
// Module version  : 2.7.3204
// Class ID        : 13
// ########################################################


package com.whatsapp.field;


abstract public final class VerticalShadedSeparator extends net.rim.device.api.ui.Field

{


	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.field.VerticalShadedSeparator, long ); // address: 0
	{
	enter_narrow 
	aload_0 
	lload 1
	invokespecial_lib net.rim.device.api.ui.Field.<init> // pc=3
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final layout( com.whatsapp.field.VerticalShadedSeparator, int, int ); // address: 0
	{
	enter 
	iload_2 
	istore_3 
	bipush 2
	aload_0 
	invokevirtual int getPaddingLeft( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	aload_0 
	invokevirtual int getPaddingRight( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	iload_1 
	invokestatic_lib int min( int, int ) // Math
	istore_4 
	aload_0 
	iload_4 
	iload_3 
	invokevirtual setExtent( net.rim.device.api.ui.Field, int, int ) // pc=3
	return 
	}


protected final paint( com.whatsapp.field.VerticalShadedSeparator, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	bipush 2
	aload_0 
	invokevirtual int getPaddingLeft( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	aload_0 
	invokevirtual int getPaddingRight( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	if_icmplt Label62
	aload_0 
	invokevirtual int getPaddingLeft( net.rim.device.api.ui.Field ) // pc=1
	istore_2 
	aload_0 
	invokevirtual int getPaddingTop( net.rim.device.api.ui.Field ) // pc=1
	istore_3 
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	aload_0 
	invokevirtual int getPaddingBottom( net.rim.device.api.ui.Field ) // pc=1
	isub 
	iconst_1 
	isub 
	istore_4 
	aload_1 
	invokevirtual int getColor( net.rim.device.api.ui.Graphics ) // pc=1
	istore_5 
	aload_1 
	invokevirtual int getGlobalAlpha( net.rim.device.api.ui.Graphics ) // pc=1
	istore_6 
	aload_1 
	iconst_0 
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	bipush 63
	invokevirtual setGlobalAlpha( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	iload_2 
	iload_3 
	iload_2 
	iload_4 
	invokevirtual drawLine( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	aload_1 
	iipush 16777215
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	iload_2 
	iconst_1 
	iadd 
	iload_3 
	iload_2 
	iconst_1 
	iadd 
	iload_4 
	invokevirtual drawLine( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	aload_1 
	iload_5 
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	iload_6 
	invokevirtual setGlobalAlpha( net.rim.device.api.ui.Graphics, int ) // pc=2
Label62:
	return 
	}

}
