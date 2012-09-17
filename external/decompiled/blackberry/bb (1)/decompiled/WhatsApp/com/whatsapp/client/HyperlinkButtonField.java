// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-19.cod
// Module version  : 2.7.3204
// Class ID        : 2
// ########################################################


package com.whatsapp.client;


abstract public final class HyperlinkButtonField extends net.rim.device.api.ui.component.LabelField

{

	// @@@@@@@@@@@@@ Fields 
	private int /*int*/  field_52680 ; // ofs = 52680 addr = 0)
	private int /*int*/  field_52684 ; // ofs = 52684 addr = 0)
	private int /*int*/  field_52688 ; // ofs = 52688 addr = 0)
	private int /*int*/  field_52692 ; // ofs = 52692 addr = 0)
	private int /*int*/  field_52696 ; // ofs = 52696 addr = 0)
	private net.rim.device.api.ui.XYRect /*net.rim.device.api.ui.XYRect*/  field_52700 ; // ofs = 52700 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.HyperlinkButtonField, java.lang.String, int, int, int, int ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	iload_2 
	iload_2 
	iload_3 
	iload_4 
	iload_5 
	invokespecial com.whatsapp.client.HyperlinkButtonField.<init> // pc=7
	return 
	}


public <init>( com.whatsapp.client.HyperlinkButtonField, java.lang.String, int, int, int, int, int ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	iload_2 
	iload_3 
	iload_4 
	iload_5 
	iload_6 
	iconst_0 
	i2l 
	invokespecial com.whatsapp.client.HyperlinkButtonField.<init> // pc=9
	return 
	}


public <init>( com.whatsapp.client.HyperlinkButtonField, java.lang.String, int, int, int, int, int, long ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	lipush 22517998136852480
	lload 7
	lor 
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=4
	aload_0 
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	dup 
	invokespecial_lib net.rim.device.api.ui.XYRect.<init> // pc=1
	putfield com.whatsapp.client.HyperlinkButtonField.field_52700   // get_name_1:  com.whatsapp.client.HyperlinkButtonField.field_52700   // get_name_2:  com.whatsapp.client.HyperlinkButtonField.field_52700   // get_Name:    com.whatsapp.client.HyperlinkButtonField.field_52700   // getName->1:     // getName->2:     // getName->N:     // ofs = 52700 ord = 5 addr = 0
	aload_0 
	iload_2 
	putfield com.whatsapp.client.HyperlinkButtonField.field_52680   // get_name_1:  com.whatsapp.client.HyperlinkButtonField.field_52680   // get_name_2:  com.whatsapp.client.HyperlinkButtonField.field_52680   // get_Name:    com.whatsapp.client.HyperlinkButtonField.field_52680   // getName->1:     // getName->2:     // getName->N:     // ofs = 52680 ord = 0 addr = 0
	aload_0 
	iload_3 
	putfield com.whatsapp.client.HyperlinkButtonField.field_52684   // get_name_1:  com.whatsapp.client.HyperlinkButtonField.field_52684   // get_name_2:  com.whatsapp.client.HyperlinkButtonField.field_52684   // get_Name:    com.whatsapp.client.HyperlinkButtonField.field_52684   // getName->1:     // getName->2:     // getName->N:     // ofs = 52684 ord = 1 addr = 0
	aload_0 
	iload_4 
	putfield com.whatsapp.client.HyperlinkButtonField.field_52688   // get_name_1:  com.whatsapp.client.HyperlinkButtonField.field_52688   // get_name_2:  com.whatsapp.client.HyperlinkButtonField.field_52688   // get_Name:    com.whatsapp.client.HyperlinkButtonField.field_52688   // getName->1:     // getName->2:     // getName->N:     // ofs = 52688 ord = 2 addr = 0
	aload_0 
	iload_5 
	putfield com.whatsapp.client.HyperlinkButtonField.field_52692   // get_name_1:  com.whatsapp.client.HyperlinkButtonField.field_52692   // get_name_2:  com.whatsapp.client.HyperlinkButtonField.field_52692   // get_Name:    com.whatsapp.client.HyperlinkButtonField.field_52692   // getName->1:     // getName->2:     // getName->N:     // ofs = 52692 ord = 3 addr = 0
	aload_0 
	iload_6 
	putfield com.whatsapp.client.HyperlinkButtonField.field_52696   // get_name_1:  com.whatsapp.client.HyperlinkButtonField.field_52696   // get_name_2:  com.whatsapp.client.HyperlinkButtonField.field_52696   // get_Name:    com.whatsapp.client.HyperlinkButtonField.field_52696   // getName->1:     // getName->2:     // getName->N:     // ofs = 52696 ord = 4 addr = 0
	return 
	}


static final access$000( com.whatsapp.client.HyperlinkButtonField, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	invokevirtual fieldChangeNotify( net.rim.device.api.ui.Field, int ) // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final applyFont( com.whatsapp.client.HyperlinkButtonField ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	bipush 4
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int ) // pc=2
	astore_1 
	aload_0 
	aload_1 
	invokevirtual setFont( net.rim.device.api.ui.Field, net.rim.device.api.ui.Font ) // pc=2
	return 
	}


protected final paint( com.whatsapp.client.HyperlinkButtonField, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual int getColor( net.rim.device.api.ui.Graphics ) // pc=1
	istore_2 
	aload_1 
	bipush 8
	invokevirtual boolean isDrawingStyleSet( net.rim.device.api.ui.Graphics, int ) // pc=2
	ifeq Label17
	aload_1 
	aload_0 
	invokevirtual boolean isEditable( net.rim.device.api.ui.Field ) // pc=1
	ifeq Label14
	aload_0_getfield com.whatsapp.client.HyperlinkButtonField.field_52684   // get_name_1:  com.whatsapp.client.HyperlinkButtonField.field_52684   // get_name_2:  com.whatsapp.client.HyperlinkButtonField.field_52684   // get_Name:    com.whatsapp.client.HyperlinkButtonField.field_52684   // getName->1:     // getName->2:     // getName->N:     // ofs = 52684 ord = 1 addr = 0
	goto Label15
Label14:
	iipush 7060469
Label15:
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	goto Label25
Label17:
	aload_1 
	aload_0 
	invokevirtual boolean isEditable( net.rim.device.api.ui.Field ) // pc=1
	ifeq Label23
	aload_0_getfield com.whatsapp.client.HyperlinkButtonField.field_52680   // get_name_1:  com.whatsapp.client.HyperlinkButtonField.field_52680   // get_name_2:  com.whatsapp.client.HyperlinkButtonField.field_52680   // get_Name:    com.whatsapp.client.HyperlinkButtonField.field_52680   // getName->1:     // getName->2:     // getName->N:     // ofs = 52680 ord = 0 addr = 0
	goto Label24
Label23:
	iipush 6184542
Label24:
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
Label25:
	aload_0 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.component.LabelField.paint // pc=2
	aload_1 
	iload_2 
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	return 
	astore_3 
	aload_1 
	iload_2 
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_3 
	athrow 
	}


protected final drawFocus( com.whatsapp.client.HyperlinkButtonField, net.rim.device.api.ui.Graphics, boolean ); // address: 0
	{
	enter 
	aload_0 
	aload_0_getfield com.whatsapp.client.HyperlinkButtonField.field_52700   // get_name_1:  com.whatsapp.client.HyperlinkButtonField.field_52700   // get_name_2:  com.whatsapp.client.HyperlinkButtonField.field_52700   // get_Name:    com.whatsapp.client.HyperlinkButtonField.field_52700   // getName->1:     // getName->2:     // getName->N:     // ofs = 52700 ord = 5 addr = 0
	invokevirtual getFocusRect( net.rim.device.api.ui.Field, net.rim.device.api.ui.XYRect ) // pc=2
	aload_1 
	bipush 8
	invokevirtual boolean isDrawingStyleSet( net.rim.device.api.ui.Graphics, int ) // pc=2
	istore_3 
	aload_1 
	invokevirtual int getBackgroundColor( net.rim.device.api.ui.Graphics ) // pc=1
	istore_4 
	aload_1 
	aload_0_getfield com.whatsapp.client.HyperlinkButtonField.field_52700   // get_name_1:  com.whatsapp.client.HyperlinkButtonField.field_52700   // get_name_2:  com.whatsapp.client.HyperlinkButtonField.field_52700   // get_Name:    com.whatsapp.client.HyperlinkButtonField.field_52700   // getName->1:     // getName->2:     // getName->N:     // ofs = 52700 ord = 5 addr = 0
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 0 addr = -1
	aload_0_getfield com.whatsapp.client.HyperlinkButtonField.field_52700   // get_name_1:  com.whatsapp.client.HyperlinkButtonField.field_52700   // get_name_2:  com.whatsapp.client.HyperlinkButtonField.field_52700   // get_Name:    com.whatsapp.client.HyperlinkButtonField.field_52700   // getName->1:     // getName->2:     // getName->N:     // ofs = 52700 ord = 5 addr = 0
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 1 addr = -1
	aload_0_getfield com.whatsapp.client.HyperlinkButtonField.field_52700   // get_name_1:  com.whatsapp.client.HyperlinkButtonField.field_52700   // get_name_2:  com.whatsapp.client.HyperlinkButtonField.field_52700   // get_Name:    com.whatsapp.client.HyperlinkButtonField.field_52700   // getName->1:     // getName->2:     // getName->N:     // ofs = 52700 ord = 5 addr = 0
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 2 addr = -1
	aload_0_getfield com.whatsapp.client.HyperlinkButtonField.field_52700   // get_name_1:  com.whatsapp.client.HyperlinkButtonField.field_52700   // get_name_2:  com.whatsapp.client.HyperlinkButtonField.field_52700   // get_Name:    com.whatsapp.client.HyperlinkButtonField.field_52700   // getName->1:     // getName->2:     // getName->N:     // ofs = 52700 ord = 5 addr = 0
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 3 addr = -1
	iconst_0 
	iconst_0 
	invokevirtual boolean pushContext( net.rim.device.api.ui.Graphics, int, int, int, int, int, int ) // pc=7
	istore_5 
	iload_5 
	ifeq Label40
	iload_2 
	ifeq Label35
	aload_1 
	bipush 8
	iconst_1 
	invokevirtual setDrawingStyle( net.rim.device.api.ui.Graphics, int, boolean ) // pc=3
	aload_1 
	aload_0_getfield com.whatsapp.client.HyperlinkButtonField.field_52688   // get_name_1:  com.whatsapp.client.HyperlinkButtonField.field_52688   // get_name_2:  com.whatsapp.client.HyperlinkButtonField.field_52688   // get_Name:    com.whatsapp.client.HyperlinkButtonField.field_52688   // getName->1:     // getName->2:     // getName->N:     // ofs = 52688 ord = 2 addr = 0
	invokevirtual setBackgroundColor( net.rim.device.api.ui.Graphics, int ) // pc=2
Label35:
	aload_1 
	invokevirtual clear( net.rim.device.api.ui.Graphics ) // pc=1
	aload_0 
	aload_1 
	invokenonvirtual com.whatsapp.client.HyperlinkButtonField.paint // pc=2
Label40:
	aload_1 
	invokevirtual popContext( net.rim.device.api.ui.Graphics ) // pc=1
	aload_1 
	iload_4 
	invokevirtual setBackgroundColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	bipush 8
	iload_3 
	invokevirtual setDrawingStyle( net.rim.device.api.ui.Graphics, int, boolean ) // pc=3
	return 
	astore_6 
	aload_1 
	invokevirtual popContext( net.rim.device.api.ui.Graphics ) // pc=1
	aload_1 
	iload_4 
	invokevirtual setBackgroundColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	bipush 8
	iload_3 
	invokevirtual setDrawingStyle( net.rim.device.api.ui.Graphics, int, boolean ) // pc=3
	aload_6 
	athrow 
	}


protected final boolean keyChar( com.whatsapp.client.HyperlinkButtonField, char, int, int ); // address: 0
	{
	enter 
	iload_1 
	bipush 10
	if_icmpne Label12
	aload_0 
	invokevirtual boolean isEditable( net.rim.device.api.ui.Field ) // pc=1
	ifeq Label12
	aload_0 
	iconst_0 
	invokevirtual fieldChangeNotify( net.rim.device.api.ui.Field, int ) // pc=2
	iconst_1 
	ireturn 
Label12:
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	invokespecial_lib net.rim.device.api.ui.Field.keyChar // pc=4
	ireturn 
	}


protected final boolean trackwheelClick( com.whatsapp.client.HyperlinkButtonField, int, int ); // address: 0
	{
	enter 
	aload_0 
	bipush 10
	iload_1 
	iload_2 
	invokenonvirtual com.whatsapp.client.HyperlinkButtonField.keyChar // pc=4
	pop 
	iconst_1 
	ireturn 
	}


protected final boolean invokeAction( com.whatsapp.client.HyperlinkButtonField, int ); // address: 0
	{
	enter_narrow 
	iload_1 
Label3:
	aload_0 
	invokevirtual boolean isEditable( net.rim.device.api.ui.Field ) // pc=1
	ifeq Label11
	aload_0 
	iconst_0 
	invokevirtual fieldChangeNotify( net.rim.device.api.ui.Field, int ) // pc=2
	iconst_1 
	ireturn 
Label11:
	aload_0 
	iload_1 
	invokespecial_lib net.rim.device.api.ui.Field.invokeAction // pc=2
	ireturn 
	}


public final setDirty( com.whatsapp.client.HyperlinkButtonField, boolean ); // address: 0
	{
	noenter_return 
	}


public final setMuddy( com.whatsapp.client.HyperlinkButtonField, boolean ); // address: 0
	{
	noenter_return 
	}


public final java.lang.String getMenuText( com.whatsapp.client.HyperlinkButtonField ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.LabelField ) // pc=1
	areturn 
	}


public final net.rim.device.api.ui.MenuItem getMenuItem( com.whatsapp.client.HyperlinkButtonField ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.HyperlinkButtonField.field_52692   // get_name_1:  com.whatsapp.client.HyperlinkButtonField.field_52692   // get_name_2:  com.whatsapp.client.HyperlinkButtonField.field_52692   // get_Name:    com.whatsapp.client.HyperlinkButtonField.field_52692   // getName->1:     // getName->2:     // getName->N:     // ofs = 52692 ord = 3 addr = 0
	iflt Label5
	aload_0_getfield com.whatsapp.client.HyperlinkButtonField.field_52696   // get_name_1:  com.whatsapp.client.HyperlinkButtonField.field_52696   // get_name_2:  com.whatsapp.client.HyperlinkButtonField.field_52696   // get_Name:    com.whatsapp.client.HyperlinkButtonField.field_52696   // getName->1:     // getName->2:     // getName->N:     // ofs = 52696 ord = 4 addr = 0
	ifge Label7
Label5:
	aconst_null 
	areturn 
Label7:
	aload_0 
	invokevirtual boolean isEditable( net.rim.device.api.ui.Field ) // pc=1
	ifne Label12
	aconst_null 
	areturn 
Label12:
	aload_0 
	invokenonvirtual com.whatsapp.client.HyperlinkButtonField.getMenuText // pc=1
	aload_0_getfield com.whatsapp.client.HyperlinkButtonField.field_52692   // get_name_1:  com.whatsapp.client.HyperlinkButtonField.field_52692   // get_name_2:  com.whatsapp.client.HyperlinkButtonField.field_52692   // get_Name:    com.whatsapp.client.HyperlinkButtonField.field_52692   // getName->1:     // getName->2:     // getName->N:     // ofs = 52692 ord = 3 addr = 0
	aload_0_getfield com.whatsapp.client.HyperlinkButtonField.field_52696   // get_name_1:  com.whatsapp.client.HyperlinkButtonField.field_52696   // get_name_2:  com.whatsapp.client.HyperlinkButtonField.field_52696   // get_Name:    com.whatsapp.client.HyperlinkButtonField.field_52696   // getName->1:     // getName->2:     // getName->N:     // ofs = 52696 ord = 4 addr = 0
	new_lib com.whatsapp.client.HyperlinkButtonField$1//module:WhatsApp-18.class#30 module:WhatsApp-18.class#30 module:WhatsApp-18.class#30
	dup 
	aload_0 
	invokespecial_lib .routine_9613 // pc=2
	invokestatic_lib module:WhatsApp-34.class#11.routine_5026(  ) // class#11
	areturn 
	}

}
