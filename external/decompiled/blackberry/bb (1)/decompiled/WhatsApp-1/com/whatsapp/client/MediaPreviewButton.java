// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-23.cod
// Module version  : 2.7.3204
// Class ID        : 4
// ########################################################


package com.whatsapp.client;


abstract public final class MediaPreviewButton extends net.rim.device.api.ui.Field

{
	// @@@@@@@@@@@@@ Static fields 
	private final static int /*int*/  field_54082 ; // ofs = 54082 addr = 13)
	private static net.rim.device.api.system.Bitmap /*net.rim.device.api.system.Bitmap*/  field_54088 ; // ofs = 54088 addr = 14)
	private static net.rim.device.api.system.Bitmap /*net.rim.device.api.system.Bitmap*/  field_54094 ; // ofs = 54094 addr = 15)

	// @@@@@@@@@@@@@ Fields 
	private final java.util.Vector /*java.util.Vector*/  field_54066 ; // ofs = 54066 addr = 0)
	private final int /*int*/  field_54070 ; // ofs = 54070 addr = 0)
	private String /*java.lang.String*/  field_54074 ; // ofs = 54074 addr = 0)
	private final int /*int*/  field_54078 ; // ofs = 54078 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.MediaPreviewButton ); // address: 0
	{
	enter 
	aload_0 
	bipush 6
	aconst_null 
	bipush -1
	invokespecial com.whatsapp.client.MediaPreviewButton.<init> // pc=4
	return 
	}


public <init>( com.whatsapp.client.MediaPreviewButton, int, java.lang.String, int ); // address: 0
	{
	enter 
	aload_0 
	lipush 18014398509481984
	invokespecial_lib net.rim.device.api.ui.Field.<init> // pc=3
	aload_0 
	new_lib net.rim.device.api.system.EncodedImage//net.rim.device.api.system.EncodedImage net.rim.device.api.system.EncodedImage net.rim.device.api.system.EncodedImage
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield com.whatsapp.client.MediaPreviewButton.field_54066   // get_name_1:  com.whatsapp.client.MediaPreviewButton.field_54066   // get_name_2:  com.whatsapp.client.MediaPreviewButton.field_54066   // get_Name:    com.whatsapp.client.MediaPreviewButton.field_54066   // getName->1:     // getName->2:     // getName->N:     // ofs = 54066 ord = 0 addr = 0
	aload_0 
	iload_1 
	putfield com.whatsapp.client.MediaPreviewButton.field_54070   // get_name_1:  com.whatsapp.client.MediaPreviewButton.field_54070   // get_name_2:  com.whatsapp.client.MediaPreviewButton.field_54070   // get_Name:    com.whatsapp.client.MediaPreviewButton.field_54070   // getName->1:     // getName->2:     // getName->N:     // ofs = 54070 ord = 1 addr = 0
	aload_0 
	aload_2 
	putfield com.whatsapp.client.MediaPreviewButton.field_54074   // get_name_1:  com.whatsapp.client.MediaPreviewButton.field_54074   // get_name_2:  com.whatsapp.client.MediaPreviewButton.field_54074   // get_Name:    com.whatsapp.client.MediaPreviewButton.field_54074   // getName->1:     // getName->2:     // getName->N:     // ofs = 54074 ord = 2 addr = 0
	aload_0 
	iload_3 
	putfield com.whatsapp.client.MediaPreviewButton.field_54078   // get_name_1:  com.whatsapp.client.MediaPreviewButton.field_54078   // get_name_2:  com.whatsapp.client.MediaPreviewButton.field_54078   // get_Name:    com.whatsapp.client.MediaPreviewButton.field_54078   // getName->1:     // getName->2:     // getName->N:     // ofs = 54078 ord = 3 addr = 0
	return 
	}


static public final int getPreferredHeightWithThumbs(  ); // address: 0
	{
	enter_narrow 
	getstatic com.whatsapp.client.MediaPreviewButton.field_54082 // MediaPreviewButton
	bipush 12
	iadd 
	ireturn 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	clinit_lib net.rim.device.api.ui.FieldChangeListener//net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener
	synch_static MediaPreviewButton
	clinit_wait 
	getstatic_lib module:WhatsApp-13.class#3.static_13 // class#3
	putstatic com.whatsapp.client.MediaPreviewButton.field_54082 // MediaPreviewButton
	getstatic_lib module:WhatsApp-12.class#0.static_65 // class#0
	invokestatic_lib module:WhatsApp-32.class#2.routine_1983(  ) // class#2
	putstatic com.whatsapp.client.MediaPreviewButton.field_54088 // MediaPreviewButton
	getstatic_lib module:WhatsApp-12.class#0.static_66 // class#0
	invokestatic_lib module:WhatsApp-32.class#2.routine_1983(  ) // class#2
	putstatic com.whatsapp.client.MediaPreviewButton.field_54094 // MediaPreviewButton
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final int com.whatsapp.client.MediaPreviewButton.routine_8182( com.whatsapp.client.MediaPreviewButton ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	invokespecial com.whatsapp.client.MediaPreviewButton.routine_8208 // pc=2
	ireturn 
	}


private final int com.whatsapp.client.MediaPreviewButton.routine_8208( com.whatsapp.client.MediaPreviewButton, int ); // address: 0
	{
	enter 
	iload_1 
	aload_0_getfield com.whatsapp.client.MediaPreviewButton.field_54070   // get_name_1:  com.whatsapp.client.MediaPreviewButton.field_54070   // get_name_2:  com.whatsapp.client.MediaPreviewButton.field_54070   // get_Name:    com.whatsapp.client.MediaPreviewButton.field_54070   // getName->1:     // getName->2:     // getName->N:     // ofs = 54070 ord = 1 addr = 0
	isub 
	aload_0 
	invokenonvirtual com.whatsapp.client.MediaPreviewButton.getPreferredHeight // pc=1
	iconst_1 
	iushr 
	isub 
	bipush 6
	isub 
	istore_2 
	aload_0_getfield com.whatsapp.client.MediaPreviewButton.field_54074   // get_name_1:  com.whatsapp.client.MediaPreviewButton.field_54074   // get_name_2:  com.whatsapp.client.MediaPreviewButton.field_54074   // get_Name:    com.whatsapp.client.MediaPreviewButton.field_54074   // getName->1:     // getName->2:     // getName->N:     // ofs = 54074 ord = 2 addr = 0
	ifnull Label25
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	astore_3 
	iload_2 
	aload_3 
	aload_0_getfield com.whatsapp.client.MediaPreviewButton.field_54074   // get_name_1:  com.whatsapp.client.MediaPreviewButton.field_54074   // get_name_2:  com.whatsapp.client.MediaPreviewButton.field_54074   // get_Name:    com.whatsapp.client.MediaPreviewButton.field_54074   // getName->1:     // getName->2:     // getName->N:     // ofs = 54074 ord = 2 addr = 0
	invokevirtual int getAdvance( net.rim.device.api.ui.Font, java.lang.String ) // pc=2
	bipush 6
	iadd 
	isub 
	istore_2 
Label25:
	iload_2 
	ifle Label33
	iload_2 
	getstatic com.whatsapp.client.MediaPreviewButton.field_54082 // MediaPreviewButton
	bipush 6
	iadd 
	idiv 
	ireturn 
Label33:
	iconst_0 
	ireturn 
	}


private final int com.whatsapp.client.MediaPreviewButton.routine_8272( com.whatsapp.client.MediaPreviewButton ); // address: 0
	{
	enter_narrow 
	invokestatic_lib int getOrientation(  ) // Display
	bipush 32
	if_icmpne Label8
	invokestatic_lib int getHeight(  ) // Display
	istore_1 
	iload_1 
	ireturn 
Label8:
	invokestatic_lib int getWidth(  ) // Display
	istore_1 
	iload_1 
	ireturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final setLabelText( com.whatsapp.client.MediaPreviewButton, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	putfield com.whatsapp.client.MediaPreviewButton.field_54074   // get_name_1:  com.whatsapp.client.MediaPreviewButton.field_54074   // get_name_2:  com.whatsapp.client.MediaPreviewButton.field_54074   // get_Name:    com.whatsapp.client.MediaPreviewButton.field_54074   // getName->1:     // getName->2:     // getName->N:     // ofs = 54074 ord = 2 addr = 0
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Field ) // pc=1
	return 
	}


public final int getPreferredMessageCount( com.whatsapp.client.MediaPreviewButton ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_0 
	invokespecial com.whatsapp.client.MediaPreviewButton.routine_8272 // pc=1
	invokespecial com.whatsapp.client.MediaPreviewButton.routine_8208 // pc=2
	ireturn 
	}


public final setMessages( com.whatsapp.client.MediaPreviewButton, java.util.Vector ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.MediaPreviewButton.field_54066   // get_name_1:  com.whatsapp.client.MediaPreviewButton.field_54066   // get_name_2:  com.whatsapp.client.MediaPreviewButton.field_54066   // get_Name:    com.whatsapp.client.MediaPreviewButton.field_54066   // getName->1:     // getName->2:     // getName->N:     // ofs = 54066 ord = 0 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	ifle Label6
	iconst_1 
	goto Label7
Label6:
	iconst_0 
Label7:
	istore_2 
	aload_0_getfield com.whatsapp.client.MediaPreviewButton.field_54066   // get_name_1:  com.whatsapp.client.MediaPreviewButton.field_54066   // get_name_2:  com.whatsapp.client.MediaPreviewButton.field_54066   // get_Name:    com.whatsapp.client.MediaPreviewButton.field_54066   // getName->1:     // getName->2:     // getName->N:     // ofs = 54066 ord = 0 addr = 0
	invokevirtual removeAllElements( java.util.Vector ) // pc=1
	aload_1 
	ifnonnull Label13
	return 
Label13:
	aload_1 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_3 
	iconst_0 
	istore_4 
Label18:
	iload_4 
	iload_3 
	if_icmpge Label60
	aload_1 
	iload_4 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-17.class#15 module:WhatsApp-17.class#15 module:WhatsApp-17.class#15
	astore_5 
	aload_5 
	getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	checkcastbranch 
	astore_6 
	aload_6 
	invokenonvirtual com.whatsapp.client.MediaData.getThumbBitmap // pc=1
	astore_7 
	aload_7 
	ifnull Label58
	aload_6 
	invokenonvirtual com.whatsapp.client.MediaData.isThumbBitmapDefault // pc=1
	ifeq Label46
	aload_7 
	getstatic com.whatsapp.client.MediaPreviewButton.field_54082 // MediaPreviewButton
	getstatic com.whatsapp.client.MediaPreviewButton.field_54082 // MediaPreviewButton
	getstatic_lib module:WhatsApp-9.class#2.static_12 // class#2
	getstatic_lib module:WhatsApp-9.class#2.static_10 // class#2
	invokestatic_lib module:WhatsApp-9.class#2.routine_1810(  ) // class#2
	astore 8
	goto Label55
Label46:
	aload_7 
	getstatic com.whatsapp.client.MediaPreviewButton.field_54082 // MediaPreviewButton
	getstatic com.whatsapp.client.MediaPreviewButton.field_54082 // MediaPreviewButton
	getstatic_lib module:WhatsApp-9.class#2.static_12 // class#2
	getstatic_lib module:WhatsApp-9.class#2.static_10 // class#2
	invokestatic_lib module:WhatsApp-9.class#2.routine_1748(  ) // class#2
	astore 8
	aload 8
	invokestatic_lib module:WhatsApp-32.class#2.routine_6847(  ) // class#2
Label55:
	aload_0_getfield com.whatsapp.client.MediaPreviewButton.field_54066   // get_name_1:  com.whatsapp.client.MediaPreviewButton.field_54066   // get_name_2:  com.whatsapp.client.MediaPreviewButton.field_54066   // get_Name:    com.whatsapp.client.MediaPreviewButton.field_54066   // getName->1:     // getName->2:     // getName->N:     // ofs = 54066 ord = 0 addr = 0
	aload 8
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label58:
	iinc 4 1
	goto Label18
Label60:
	aload_0_getfield com.whatsapp.client.MediaPreviewButton.field_54066   // get_name_1:  com.whatsapp.client.MediaPreviewButton.field_54066   // get_name_2:  com.whatsapp.client.MediaPreviewButton.field_54066   // get_Name:    com.whatsapp.client.MediaPreviewButton.field_54066   // getName->1:     // getName->2:     // getName->N:     // ofs = 54066 ord = 0 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	ifle Label65
	iconst_1 
	goto Label66
Label65:
	iconst_0 
Label66:
	istore_4 
	iload_2 
	iload_4 
	if_icmpeq Label73
	aload_0 
	invokevirtual updateLayout( net.rim.device.api.ui.Field ) // pc=1
	return 
Label73:
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Field ) // pc=1
	return 
	}


public final int getPreferredWidth( com.whatsapp.client.MediaPreviewButton ); // address: 0
	{
	enter_narrow 
	invokestatic_lib int getWidth(  ) // Display
	ireturn 
	}


public final boolean isFocusable( com.whatsapp.client.MediaPreviewButton ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib net.rim.device.api.ui.Field.isFocusable // pc=1
	ifeq Label9
	aload_0_getfield com.whatsapp.client.MediaPreviewButton.field_54066   // get_name_1:  com.whatsapp.client.MediaPreviewButton.field_54066   // get_name_2:  com.whatsapp.client.MediaPreviewButton.field_54066   // get_Name:    com.whatsapp.client.MediaPreviewButton.field_54066   // getName->1:     // getName->2:     // getName->N:     // ofs = 54066 ord = 0 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	ifle Label9
	iconst_1 
	ireturn 
Label9:
	iconst_0 
	ireturn 
	}


public final int getPreferredHeight( com.whatsapp.client.MediaPreviewButton ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.MediaPreviewButton.field_54066   // get_name_1:  com.whatsapp.client.MediaPreviewButton.field_54066   // get_name_2:  com.whatsapp.client.MediaPreviewButton.field_54066   // get_Name:    com.whatsapp.client.MediaPreviewButton.field_54066   // getName->1:     // getName->2:     // getName->N:     // ofs = 54066 ord = 0 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	ifle Label6
	invokestatic int getPreferredHeightWithThumbs(  ) // MediaPreviewButton
	ireturn 
Label6:
	aload_0_getfield com.whatsapp.client.MediaPreviewButton.field_54074   // get_name_1:  com.whatsapp.client.MediaPreviewButton.field_54074   // get_name_2:  com.whatsapp.client.MediaPreviewButton.field_54074   // get_Name:    com.whatsapp.client.MediaPreviewButton.field_54074   // getName->1:     // getName->2:     // getName->N:     // ofs = 54074 ord = 2 addr = 0
	ifnull Label12
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	ireturn 
Label12:
	iconst_0 
	ireturn 
	}


protected final boolean navigationClick( com.whatsapp.client.MediaPreviewButton, int, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_0 
	invokevirtual fieldChangeNotify( net.rim.device.api.ui.Field, int ) // pc=2
	iconst_1 
	ireturn 
	}


protected final layout( com.whatsapp.client.MediaPreviewButton, int, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	aload_0 
	invokenonvirtual com.whatsapp.client.MediaPreviewButton.getPreferredHeight // pc=1
	invokevirtual setExtent( net.rim.device.api.ui.Field, int, int ) // pc=3
	return 
	}


protected final paint( com.whatsapp.client.MediaPreviewButton, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter 
	aload_1 
	bipush 8
	invokevirtual boolean isDrawingStyleSet( net.rim.device.api.ui.Graphics, int ) // pc=2
	istore_2 
	new_lib net.rim.device.api.ui.container.MainScreen//net.rim.device.api.ui.container.MainScreen net.rim.device.api.ui.container.MainScreen net.rim.device.api.ui.container.MainScreen
	dup 
	aload_0_getfield com.whatsapp.client.MediaPreviewButton.field_54070   // get_name_1:  com.whatsapp.client.MediaPreviewButton.field_54070   // get_name_2:  com.whatsapp.client.MediaPreviewButton.field_54070   // get_Name:    com.whatsapp.client.MediaPreviewButton.field_54070   // getName->1:     // getName->2:     // getName->N:     // ofs = 54070 ord = 1 addr = 0
	bipush 6
	iconst_0 
	iconst_0 
	invokespecial_lib net.rim.device.api.ui.XYRect.<init> // pc=5
	astore_3 
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	iconst_1 
	iushr 
	istore_4 
	aload_0 
	invokespecial com.whatsapp.client.MediaPreviewButton.routine_8182 // pc=1
	istore_5 
	aload_0_getfield com.whatsapp.client.MediaPreviewButton.field_54066   // get_name_1:  com.whatsapp.client.MediaPreviewButton.field_54066   // get_name_2:  com.whatsapp.client.MediaPreviewButton.field_54066   // get_Name:    com.whatsapp.client.MediaPreviewButton.field_54066   // getName->1:     // getName->2:     // getName->N:     // ofs = 54066 ord = 0 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	iload_5 
	invokestatic_lib int min( int, int ) // Math
	istore_6 
	aload_0_getfield com.whatsapp.client.MediaPreviewButton.field_54074   // get_name_1:  com.whatsapp.client.MediaPreviewButton.field_54074   // get_name_2:  com.whatsapp.client.MediaPreviewButton.field_54074   // get_Name:    com.whatsapp.client.MediaPreviewButton.field_54074   // getName->1:     // getName->2:     // getName->N:     // ofs = 54074 ord = 2 addr = 0
	ifnonnull Label29
	goto_w Label100
Label29:
	aload_1 
	invokevirtual int getColor( net.rim.device.api.ui.Graphics ) // pc=1
	istore_7 
	iload_2 
	ifne Label40
	aload_0_getfield com.whatsapp.client.MediaPreviewButton.field_54078   // get_name_1:  com.whatsapp.client.MediaPreviewButton.field_54078   // get_name_2:  com.whatsapp.client.MediaPreviewButton.field_54078   // get_Name:    com.whatsapp.client.MediaPreviewButton.field_54078   // getName->1:     // getName->2:     // getName->N:     // ofs = 54078 ord = 3 addr = 0
	bipush -1
	if_icmpeq Label40
	aload_1 
	aload_0_getfield com.whatsapp.client.MediaPreviewButton.field_54078   // get_name_1:  com.whatsapp.client.MediaPreviewButton.field_54078   // get_name_2:  com.whatsapp.client.MediaPreviewButton.field_54078   // get_Name:    com.whatsapp.client.MediaPreviewButton.field_54078   // getName->1:     // getName->2:     // getName->N:     // ofs = 54078 ord = 3 addr = 0
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
Label40:
	aload_1 
	aload_0_getfield com.whatsapp.client.MediaPreviewButton.field_54074   // get_name_1:  com.whatsapp.client.MediaPreviewButton.field_54074   // get_name_2:  com.whatsapp.client.MediaPreviewButton.field_54074   // get_Name:    com.whatsapp.client.MediaPreviewButton.field_54074   // getName->1:     // getName->2:     // getName->N:     // ofs = 54074 ord = 2 addr = 0
	aload_3 
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 0 addr = -1
	iload_4 
	bipush 32
	invokevirtual int drawText( net.rim.device.api.ui.Graphics, java.lang.String, int, int, int ) // pc=5
	pop 
	aload_1 
	iload_7 
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	iload_6 
	ifgt Label54
	goto_w Label135
Label54:
	aload_3 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	iload_4 
	isub 
	bipush 6
	isub 
	getstatic com.whatsapp.client.MediaPreviewButton.field_54082 // MediaPreviewButton
	isub 
	putfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 0 addr = -1
	iload_6 
	iconst_1 
	isub 
	istore 8
Label68:
	iload 8
	iflt Label135
	aload_0_getfield com.whatsapp.client.MediaPreviewButton.field_54066   // get_name_1:  com.whatsapp.client.MediaPreviewButton.field_54066   // get_name_2:  com.whatsapp.client.MediaPreviewButton.field_54066   // get_Name:    com.whatsapp.client.MediaPreviewButton.field_54066   // getName->1:     // getName->2:     // getName->N:     // ofs = 54066 ord = 0 addr = 0
	iload 8
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore 9
	aload_3 
	aload 9
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	putfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 1 addr = -1
	aload_3 
	aload 9
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	putfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 2 addr = -1
	aload_1 
	aload_3 
	aload 9
	iconst_0 
	iconst_0 
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, net.rim.device.api.ui.XYRect, net.rim.device.api.system.Bitmap, int, int ) // pc=5
	aload_3 
	dup 
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 0 addr = -1
	aload_3 
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 1 addr = -1
	bipush 6
	iadd 
	isub 
	putfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 0 addr = -1
	iinc 8 -1
	goto Label68
Label100:
	iconst_0 
	istore_7 
Label102:
	iload_7 
	iload_6 
	if_icmpge Label135
	aload_0_getfield com.whatsapp.client.MediaPreviewButton.field_54066   // get_name_1:  com.whatsapp.client.MediaPreviewButton.field_54066   // get_name_2:  com.whatsapp.client.MediaPreviewButton.field_54066   // get_Name:    com.whatsapp.client.MediaPreviewButton.field_54066   // getName->1:     // getName->2:     // getName->N:     // ofs = 54066 ord = 0 addr = 0
	iload_7 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore 8
	aload_3 
	aload 8
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	putfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 1 addr = -1
	aload_3 
	aload 8
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	putfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 2 addr = -1
	aload_1 
	aload_3 
	aload 8
	iconst_0 
	iconst_0 
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, net.rim.device.api.ui.XYRect, net.rim.device.api.system.Bitmap, int, int ) // pc=5
	aload_3 
	dup 
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 0 addr = -1
	aload_3 
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 1 addr = -1
	bipush 6
	iadd 
	iadd 
	putfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 0 addr = -1
	iinc 7 1
	goto Label102
Label135:
	iload_6 
	ifle Label162
	iload_2 
	ifeq Label141
	getstatic com.whatsapp.client.MediaPreviewButton.field_54094 // MediaPreviewButton
	goto Label142
Label141:
	getstatic com.whatsapp.client.MediaPreviewButton.field_54088 // MediaPreviewButton
Label142:
	astore_7 
	aload_1 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	iload_4 
	isub 
	iload_4 
	aload_7 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	iconst_1 
	iushr 
	isub 
	aload_7 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_7 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	aload_7 
	iconst_0 
	iconst_0 
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=8
Label162:
	return 
	}

}
