// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-60.cod
// Module version  : 2.8.1914
// Class ID        : 2
// ########################################################


package com.whatsapp.util;


abstract public final class UiUtilities extends Object

{
	// @@@@@@@@@@@@@ Static fields 
	private static int /*int*/  field_58016 ; // ofs = 58016 addr = 6)
	private final static boolean /*boolean*/  field_58022 ; // ofs = 58022 addr = 7)
	private final static net.rim.device.api.ui.ScreenUiEngineAttachedListener /*net.rim.device.api.ui.ScreenUiEngineAttachedListener*/  field_58028 ; // ofs = 58028 addr = 8)


	// @@@@@@@@@@@@@ Static routines 

private <init>( com.whatsapp.util.UiUtilities ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}


static public final int getDeviceResolution(  ); // address: 0
	{
	enter_narrow 
	getstatic com.whatsapp.util.UiUtilities.field_58016 // UiUtilities
	bipush -1
	if_icmpne Label16
	invokestatic int com.whatsapp.util.UiUtilities.routine_887(  ) // UiUtilities
	istore_0 
	invokestatic int com.whatsapp.util.UiUtilities.routine_934(  ) // UiUtilities
	istore_1 
	iload_1 
	bipush -1
	if_icmpne Label14
	iload_0 
	invokestatic int com.whatsapp.util.UiUtilities.routine_990( int ) // UiUtilities
	istore_1 
Label14:
	iload_1 
	putstatic com.whatsapp.util.UiUtilities.field_58016 // UiUtilities
Label16:
	getstatic com.whatsapp.util.UiUtilities.field_58016 // UiUtilities
	ireturn 
	}


static private final int com.whatsapp.util.UiUtilities.routine_887(  ); // address: 0
	{
	enter 
	invokestatic_lib int getHorizontalResolution(  ) // Display
	istore_0 
	invokestatic_lib int getVerticalResolution(  ) // Display
	istore_1 
	iload_0 
	iload_1 
	iadd 
	bipush 2
	idiv 
	op01xx 
	i2d 
	isreal 
	lipush 4582978272962677414
	op01xx 
	dmul 
	op01xx 
	d2i 
	istore_2 
	iload_2 
	ireturn 
	}


static private final int com.whatsapp.util.UiUtilities.routine_934(  ); // address: 0
	{
	enter_narrow 
	bipush -1
	istore_0 
	invokestatic_lib java.lang.String getDeviceName(  ) // DeviceInfo
	astore_1 
	aload_1 
	ldc literal_84:"9900"
	invokenonvirtual_lib java.lang.String.startsWith // pc=2
	ifne Label13
	aload_1 
	ldc literal_85:"9930"
	invokenonvirtual_lib java.lang.String.startsWith // pc=2
	ifeq Label15
Label13:
	sipush 320
	istore_0 
Label15:
	iload_0 
	ireturn 
	}


static private final int com.whatsapp.util.UiUtilities.routine_990( int ); // address: 0
	{
	enter 
	arrayinit [-96, 0, 0, 0, -56, 0, 0, 0, -16, 0, 0, 0, 64, 1, 0, 0]
	astore_1 
	aload_1 
	iconst_0 
	iaload 
	istore_2 
	iconst_0 
	istore_3 
Label9:
	iload_3 
	aload_1 
	arraylength 
	if_icmpge Label30
	aload_1 
	iload_3 
	iaload 
	iload_0 
	isub 
	invokestatic_lib int abs( int ) // Math
	iload_2 
	iload_0 
	isub 
	invokestatic_lib int abs( int ) // Math
	if_icmpge Label28
	aload_1 
	iload_3 
	iaload 
	istore_2 
Label28:
	iinc 3 1
	goto Label9
Label30:
	iload_2 
	ireturn 
	}


static public final attachScreenTransition( net.rim.device.api.ui.Screen, int ); // address: 0
	{
	enter 
	invokestatic_lib net.rim.device.api.ui.UiEngineInstance getUiEngineInstance(  ) // Ui
	astore_2 
	aconst_null 
	astore_3 
	aconst_null 
	astore_4 
	iload_1 
	tableswitch  :
		
		
		
		
		
		

Label9:
	new_lib net.rim.device.api.ui.TransitionContext//net.rim.device.api.ui.TransitionContext net.rim.device.api.ui.TransitionContext net.rim.device.api.ui.TransitionContext
	dup 
	iconst_1 
	invokespecial_lib net.rim.device.api.ui.TransitionContext.<init> // pc=2
	astore_3 
	new_lib net.rim.device.api.ui.TransitionContext//net.rim.device.api.ui.TransitionContext net.rim.device.api.ui.TransitionContext net.rim.device.api.ui.TransitionContext
	dup 
	iconst_1 
	invokespecial_lib net.rim.device.api.ui.TransitionContext.<init> // pc=2
	astore_4 
	aload_3 
	iconst_1 
	sipush 750
	invokevirtual setIntAttribute( net.rim.device.api.ui.TransitionContext, int, int ) // pc=3
	aload_4 
	iconst_1 
	sipush 750
	invokevirtual setIntAttribute( net.rim.device.api.ui.TransitionContext, int, int ) // pc=3
	goto_w Label98
Label28:
	new_lib net.rim.device.api.ui.TransitionContext//net.rim.device.api.ui.TransitionContext net.rim.device.api.ui.TransitionContext net.rim.device.api.ui.TransitionContext
	dup 
	bipush 5
	invokespecial_lib net.rim.device.api.ui.TransitionContext.<init> // pc=2
	astore_3 
	new_lib net.rim.device.api.ui.TransitionContext//net.rim.device.api.ui.TransitionContext net.rim.device.api.ui.TransitionContext net.rim.device.api.ui.TransitionContext
	dup 
	bipush 5
	invokespecial_lib net.rim.device.api.ui.TransitionContext.<init> // pc=2
	astore_4 
	goto_w Label98
Label39:
	new_lib net.rim.device.api.ui.TransitionContext//net.rim.device.api.ui.TransitionContext net.rim.device.api.ui.TransitionContext net.rim.device.api.ui.TransitionContext
	dup 
	bipush 2
	invokespecial_lib net.rim.device.api.ui.TransitionContext.<init> // pc=2
	astore_3 
	new_lib net.rim.device.api.ui.TransitionContext//net.rim.device.api.ui.TransitionContext net.rim.device.api.ui.TransitionContext net.rim.device.api.ui.TransitionContext
	dup 
	bipush 2
	invokespecial_lib net.rim.device.api.ui.TransitionContext.<init> // pc=2
	astore_4 
	aload_3 
	bipush 3
	iconst_1 
	invokevirtual setIntAttribute( net.rim.device.api.ui.TransitionContext, int, int ) // pc=3
	aload_4 
	bipush 3
	bipush 2
	invokevirtual setIntAttribute( net.rim.device.api.ui.TransitionContext, int, int ) // pc=3
	goto Label98
Label58:
	new_lib net.rim.device.api.ui.TransitionContext//net.rim.device.api.ui.TransitionContext net.rim.device.api.ui.TransitionContext net.rim.device.api.ui.TransitionContext
	dup 
	bipush 3
	invokespecial_lib net.rim.device.api.ui.TransitionContext.<init> // pc=2
	astore_3 
	new_lib net.rim.device.api.ui.TransitionContext//net.rim.device.api.ui.TransitionContext net.rim.device.api.ui.TransitionContext net.rim.device.api.ui.TransitionContext
	dup 
	bipush 3
	invokespecial_lib net.rim.device.api.ui.TransitionContext.<init> // pc=2
	astore_4 
	goto Label98
Label69:
	new_lib net.rim.device.api.ui.TransitionContext//net.rim.device.api.ui.TransitionContext net.rim.device.api.ui.TransitionContext net.rim.device.api.ui.TransitionContext
	dup 
	bipush 4
	invokespecial_lib net.rim.device.api.ui.TransitionContext.<init> // pc=2
	astore_3 
	new_lib net.rim.device.api.ui.TransitionContext//net.rim.device.api.ui.TransitionContext net.rim.device.api.ui.TransitionContext net.rim.device.api.ui.TransitionContext
	dup 
	bipush 4
	invokespecial_lib net.rim.device.api.ui.TransitionContext.<init> // pc=2
	astore_4 
	aload_3 
	bipush 2
	iconst_1 
	invokevirtual setIntAttribute( net.rim.device.api.ui.TransitionContext, int, int ) // pc=3
	aload_4 
	bipush 2
	bipush 2
	invokevirtual setIntAttribute( net.rim.device.api.ui.TransitionContext, int, int ) // pc=3
	goto Label98
Label88:
	new_lib net.rim.device.api.ui.TransitionContext//net.rim.device.api.ui.TransitionContext net.rim.device.api.ui.TransitionContext net.rim.device.api.ui.TransitionContext
	dup 
	bipush 5
	invokespecial_lib net.rim.device.api.ui.TransitionContext.<init> // pc=2
	astore_3 
	new_lib net.rim.device.api.ui.TransitionContext//net.rim.device.api.ui.TransitionContext net.rim.device.api.ui.TransitionContext net.rim.device.api.ui.TransitionContext
	dup 
	bipush 5
	invokespecial_lib net.rim.device.api.ui.TransitionContext.<init> // pc=2
	astore_4 
Label98:
	aload_2 
	aconst_null 
	aload_0 
	bipush 7
	aload_3 
	invokevirtual setTransition( net.rim.device.api.ui.UiEngineInstance, net.rim.device.api.ui.Screen, net.rim.device.api.ui.Screen, int, net.rim.device.api.ui.TransitionContext ) // pc=5
	aload_2 
	aload_0 
	aconst_null 
	bipush 56
	aload_4 
	invokevirtual setTransition( net.rim.device.api.ui.UiEngineInstance, net.rim.device.api.ui.Screen, net.rim.device.api.ui.Screen, int, net.rim.device.api.ui.TransitionContext ) // pc=5
	aload_0 
	getstatic com.whatsapp.util.UiUtilities.field_58028 // UiUtilities
	invokevirtual addScreenUiEngineAttachedListener( net.rim.device.api.ui.Screen, net.rim.device.api.ui.ScreenUiEngineAttachedListener ) // pc=2
	return 
	}


static public final clearScreenTransition( net.rim.device.api.ui.Screen ); // address: 0
	{
	enter 
	invokestatic_lib net.rim.device.api.ui.UiEngineInstance getUiEngineInstance(  ) // Ui
	astore_1 
	aload_1 
	aconst_null 
	aload_0 
	bipush 7
	aconst_null 
	invokevirtual setTransition( net.rim.device.api.ui.UiEngineInstance, net.rim.device.api.ui.Screen, net.rim.device.api.ui.Screen, int, net.rim.device.api.ui.TransitionContext ) // pc=5
	aload_1 
	aload_0 
	aconst_null 
	bipush 56
	aconst_null 
	invokevirtual setTransition( net.rim.device.api.ui.UiEngineInstance, net.rim.device.api.ui.Screen, net.rim.device.api.ui.Screen, int, net.rim.device.api.ui.TransitionContext ) // pc=5
	return 
	}


static public final setScreenTitle( net.rim.device.api.ui.Screen ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokestatic_lib module:WhatsApp-79.class#39.routine_27773(  ) // class#39
	invokevirtual setTitleBar( net.rim.device.api.ui.Screen, net.rim.device.api.ui.component.TitleBar ) // pc=2
	return 
	}


static public final setScreenTitleIfNew( net.rim.device.api.ui.Screen ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokestatic_lib module:WhatsApp-79.class#39.routine_27773(  ) // class#39
	invokevirtual setTitleBar( net.rim.device.api.ui.Screen, net.rim.device.api.ui.component.TitleBar ) // pc=2
	return 
	}


static public final roundOffCorners( net.rim.device.api.system.Bitmap ); // address: 0
	{
	enter_narrow 
	getstatic_lib module:WhatsApp-31.class#0.static_67 // class#0
	invokestatic_lib module:WhatsApp-58.class#1.routine_1287(  ) // class#1
	astore_1 
	aload_0 
	aload_1 
	invokestatic roundOffCorners( net.rim.device.api.system.Bitmap, net.rim.device.api.system.Bitmap ) // UiUtilities
	return 
	}


static public final int getCornerMaskWidth(  ); // address: 0
	{
	enter_narrow 
	getstatic_lib module:WhatsApp-31.class#0.static_67 // class#0
	invokestatic_lib module:WhatsApp-58.class#1.routine_1287(  ) // class#1
	astore_0 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	ireturn 
	}


static public final roundOffCorners( net.rim.device.api.system.Bitmap, net.rim.device.api.system.Bitmap ); // address: 0
	{
	enter 
	aload_1 
	ifnonnull Label4
	return 
Label4:
	aload_1 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	istore_2 
	aload_1 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	istore_3 
	iload_2 
	bipush 2
	imul 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	if_icmpgt Label22
	iload_3 
	bipush 2
	imul 
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	if_icmple Label23
Label22:
	return 
Label23:
	iload_2 
	iload_3 
	imul 
	newarray 5
	astore_4 
	iload_2 
	iload_3 
	imul 
	newarray 5
	astore_5 
	aload_1 
	aload_4 
	iconst_0 
	iload_2 
	iconst_0 
	iconst_0 
	iload_2 
	iload_3 
	invokevirtual getARGB( net.rim.device.api.system.Bitmap, int[], int, int, int, int, int, int ) // pc=8
	iconst_0 
	istore_6 
Label44:
	iload_6 
	bipush 2
	if_icmpge Label107
	iconst_0 
	istore_7 
Label49:
	iload_7 
	bipush 2
	if_icmpge Label105
	iload_6 
	ifne Label56
	iconst_0 
	goto Label60
Label56:
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	iload_2 
	isub 
Label60:
	istore 8
	iload_7 
	ifne Label65
	iconst_0 
	goto Label69
Label65:
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	iload_3 
	isub 
Label69:
	istore 9
	aload_0 
	aload_5 
	iconst_0 
	iload_2 
	iload 8
	iload 9
	iload_2 
	iload_3 
	invokevirtual getARGB( net.rim.device.api.system.Bitmap, int[], int, int, int, int, int, int ) // pc=8
	aload_4 
	aload_5 
	iload_2 
	iload_3 
	iload_6 
	ifne Label87
	iconst_1 
	goto Label88
Label87:
	bipush -1
Label88:
	iload_7 
	ifne Label92
	iconst_1 
	goto Label93
Label92:
	bipush -1
Label93:
	invokestatic alphaMerge( int[], int[], int, int, int, int ) // UiUtilities
	aload_0 
	aload_5 
	iconst_0 
	iload_2 
	iload 8
	iload 9
	iload_2 
	iload_3 
	invokevirtual setARGB( net.rim.device.api.system.Bitmap, int[], int, int, int, int, int, int ) // pc=8
	iinc 7 1
	goto Label49
Label105:
	iinc 6 1
	goto Label44
Label107:
	return 
	}


static public final alphaMerge( int[], int[], int, int, int, int ); // address: 0
	{
	enter 
	iload_4 
	ifge Label7
	iload_2 
	iconst_1 
	isub 
	goto Label8
Label7:
	iconst_0 
Label8:
	istore_6 
	iload_5 
	ifge Label15
	iload_3 
	iconst_1 
	isub 
	goto Label16
Label15:
	iconst_0 
Label16:
	istore_7 
	iconst_0 
	istore 8
Label19:
	iload 8
	iload_2 
	if_icmpge Label77
	iconst_0 
	istore 9
Label24:
	iload 9
	iload_3 
	if_icmpge Label75
	iload 8
	iload 9
	iload_2 
	imul 
	iadd 
	istore 10
	iload_6 
	iload 8
	iload_4 
	imul 
	iadd 
	iload_7 
	iload 9
	iload_5 
	imul 
	iadd 
	iload_2 
	imul 
	iadd 
	istore 11
	aload_0 
	iload 10
	iaload 
	istore 12
	aload_1 
	iload 11
	iaload 
	istore 13
	iload 13
	iipush 16777215
	iand 
	istore 13
	iload 13
	sipush 255
	iload 12
	bipush 24
	ishr 
	isub 
	bipush 24
	ishl 
	ior 
	istore 13
	aload_1 
	iload 11
	iload 13
	iastore 
	iinc 9 1
	goto Label24
Label75:
	iinc 8 1
	goto Label19
Label77:
	return 
	}


static public final alphaSubtract( int[], int[], int, int, int, int ); // address: 0
	{
	enter 
	iload_4 
	ifge Label7
	iload_2 
	iconst_1 
	isub 
	goto Label8
Label7:
	iconst_0 
Label8:
	istore_6 
	iload_5 
	ifge Label15
	iload_3 
	iconst_1 
	isub 
	goto Label16
Label15:
	iconst_0 
Label16:
	istore_7 
	iconst_0 
	istore 8
Label19:
	iload 8
	iload_2 
	if_icmpge Label87
	iconst_0 
	istore 9
Label24:
	iload 9
	iload_3 
	if_icmpge Label85
	iload 8
	iload 9
	iload_2 
	imul 
	iadd 
	istore 10
	iload_6 
	iload 8
	iload_4 
	imul 
	iadd 
	iload_7 
	iload 9
	iload_5 
	imul 
	iadd 
	iload_2 
	imul 
	iadd 
	istore 11
	aload_0 
	iload 10
	iaload 
	istore 12
	aload_1 
	iload 11
	iaload 
	istore 13
	iload 13
	iipush -16777216
	iand 
	bipush 24
	ishr 
	istore 14
	iload 14
	iload 12
	bipush 24
	ishr 
	isub 
	iconst_0 
	invokestatic_lib int min( int, int ) // Math
	istore 15
	iload 13
	iipush 16777215
	iand 
	istore 13
	iload 13
	iload 15
	bipush 24
	ishl 
	ior 
	istore 13
	aload_1 
	iload 11
	iload 13
	iastore 
	iinc 9 1
	goto Label24
Label85:
	iinc 8 1
	goto Label19
Label87:
	return 
	}


static public final makeTransparent( net.rim.device.api.system.Bitmap ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	imul 
	istore_1 
	iload_1 
	newarray 5
	astore_2 
	aload_0 
	aload_2 
	iconst_0 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	iconst_0 
	iconst_0 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	invokevirtual getARGB( net.rim.device.api.system.Bitmap, int[], int, int, int, int, int, int ) // pc=8
	iconst_0 
	istore_3 
Label24:
	iload_3 
	iload_1 
	if_icmpge Label36
	aload_2 
	iload_3 
	dup2 
	iaload 
	iipush 16777215
	iand 
	iastore 
	iinc 3 1
	goto Label24
Label36:
	aload_0 
	aload_2 
	iconst_0 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	iconst_0 
	iconst_0 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	invokevirtual setARGB( net.rim.device.api.system.Bitmap, int[], int, int, int, int, int, int ) // pc=8
	return 
	}


static private final net.rim.device.api.system.Bitmap com.whatsapp.util.UiUtilities.routine_2077( net.rim.device.api.system.Bitmap, int, int, int ); // address: 0
	{
	enter 
	new_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	dup 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	iload_1 
	invokespecial_lib net.rim.device.api.system.Bitmap.<init> // pc=3
	astore_4 
	aload_4 
	invokestatic net.rim.device.api.ui.Graphics newGraphics( net.rim.device.api.system.Bitmap ) // UiUtilities
	astore_5 
	iload_2 
	iload_3 
	if_icmpne Label20
	aload_5 
	iload_2 
	invokevirtual setBackgroundColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_5 
	invokevirtual clear( net.rim.device.api.ui.Graphics ) // pc=1
	goto Label88
Label20:
	arrayinit [0, 0, 0, 0]
	astore_6 
	bipush 4
	newarray 5
	dup 
	iconst_0 
	iconst_0 
	iastore 
	dup 
	iconst_1 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	iastore 
	dup 
	bipush 2
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	iastore 
	dup 
	bipush 3
	iconst_0 
	iastore 
	astore_7 
	bipush 4
	newarray 5
	dup 
	iconst_0 
	iconst_0 
	iastore 
	dup 
	iconst_1 
	iconst_0 
	iastore 
	dup 
	bipush 2
	iload_1 
	iastore 
	dup 
	bipush 3
	iload_1 
	iastore 
	astore 8
	bipush 4
	newarray 5
	dup 
	iconst_0 
	iload_2 
	iastore 
	dup 
	iconst_1 
	iload_2 
	iastore 
	dup 
	bipush 2
	iload_3 
	iastore 
	dup 
	bipush 3
	iload_3 
	iastore 
	astore 9
	aload_5 
	aload_7 
	aload 8
	aload_6 
	aload 9
	aconst_null 
	invokevirtual drawShadedFilledPath( net.rim.device.api.ui.Graphics, int[], int[], byte[], int[], int[] ) // pc=6
Label88:
	aload_4 
	areturn 
	}


static public final net.rim.device.api.system.Bitmap makeCaptionedBitmap( net.rim.device.api.system.Bitmap, int, int, int, int, net.rim.device.api.ui.Font, java.lang.String ); // address: 0
	{
	enter 
	sipush 192
	istore_7 
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	invokestatic net.rim.device.api.system.Bitmap com.whatsapp.util.UiUtilities.routine_2077( net.rim.device.api.system.Bitmap, int, int, int ) // UiUtilities
	astore 8
	new_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	dup 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	invokespecial_lib net.rim.device.api.system.Bitmap.<init> // pc=3
	astore 9
	aload 9
	invokestatic net.rim.device.api.ui.Graphics newGraphics( net.rim.device.api.system.Bitmap ) // UiUtilities
	astore 10
	aload 10
	bipush -97
	iconst_0 
	iconst_0 
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_0 
	iconst_0 
	iconst_0 
	invokevirtual rop( net.rim.device.api.ui.Graphics, int, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=9
	aload 10
	iload_4 
	invokevirtual setGlobalAlpha( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload 10
	bipush -93
	iconst_0 
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	aload 8
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	isub 
	aload 9
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload 8
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	aload 8
	iconst_0 
	iconst_0 
	invokevirtual rop( net.rim.device.api.ui.Graphics, int, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=9
	aload 10
	aload_5 
	invokevirtual setFont( net.rim.device.api.ui.Graphics, net.rim.device.api.ui.Font ) // pc=2
	aload 9
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	iconst_1 
	iushr 
	aload_5 
	aload_6 
	invokevirtual int getAdvance( net.rim.device.api.ui.Font, java.lang.String ) // pc=2
	iconst_1 
	iushr 
	isub 
	iconst_0 
	invokestatic_lib int max( int, int ) // Math
	istore 11
	aload 9
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	iload_1 
	isub 
	iload_1 
	iconst_1 
	iushr 
	aload_5 
	invokevirtual int getAscent( net.rim.device.api.ui.Font ) // pc=1
	iconst_1 
	iushr 
	isub 
	aload_5 
	invokevirtual int getLeading( net.rim.device.api.ui.Font ) // pc=1
	isub 
	iconst_0 
	invokestatic_lib int max( int, int ) // Math
	iadd 
	istore 12
	aload 10
	sipush 192
	invokevirtual setGlobalAlpha( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload 10
	iload_2 
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload 10
	aload_6 
	iload 11
	iload 12
	bipush 2
	isub 
	invokevirtual int drawText( net.rim.device.api.ui.Graphics, java.lang.String, int, int ) // pc=4
	pop 
	aload 10
	sipush 255
	invokevirtual setGlobalAlpha( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload 10
	iipush 16777215
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload 10
	aload_6 
	iload 11
	iload 12
	iconst_1 
	isub 
	invokevirtual int drawText( net.rim.device.api.ui.Graphics, java.lang.String, int, int ) // pc=4
	pop 
	aload 9
	invokestatic roundOffCorners( net.rim.device.api.system.Bitmap ) // UiUtilities
	aload 9
	areturn 
	}


static public final net.rim.device.api.ui.Font getFittedFont( net.rim.device.api.ui.Font, java.lang.String, int ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	invokevirtual int getAdvance( net.rim.device.api.ui.Font, java.lang.String ) // pc=2
	istore_3 
	iload_3 
	iload_2 
	if_icmpgt Label10
	aload_0 
	areturn 
Label10:
	aload_0 
	invokevirtual net.rim.device.api.ui.FontFamily getFontFamily( net.rim.device.api.ui.Font ) // pc=1
	astore_4 
	aload_0 
	invokevirtual int getStyle( net.rim.device.api.ui.Font ) // pc=1
	istore_5 
	aload_4 
	invokevirtual int[] getHeights( net.rim.device.api.ui.FontFamily ) // pc=1
	astore_6 
	aconst_null 
	astore_7 
	aload_6 
	arraylength 
	iconst_1 
	isub 
	istore 8
Label26:
	iload 8
	iflt Label51
	aload_6 
	iload 8
	iaload 
	bipush 11
	if_icmpge Label34
	goto Label51
Label34:
	aload_4 
	iload_5 
	aload_6 
	iload 8
	iaload 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.FontFamily, int, int ) // pc=3
	astore_7 
	aload_7 
	aload_1 
	invokevirtual int getAdvance( net.rim.device.api.ui.Font, java.lang.String ) // pc=2
	istore_3 
	iload_3 
	iload_2 
	if_icmpge Label49
	goto Label51
Label49:
	iinc 8 -1
	goto Label26
Label51:
	aload_7 
	ifnull Label55
	aload_7 
	areturn 
Label55:
	aload_0 
	areturn 
	}


static public final net.rim.device.api.ui.Font getFittedFontHeight( net.rim.device.api.ui.Font, int ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	iload_1 
	if_icmpgt Label7
	aload_0 
	areturn 
Label7:
	aload_0 
	invokevirtual net.rim.device.api.ui.FontFamily getFontFamily( net.rim.device.api.ui.Font ) // pc=1
	astore_2 
	aload_0 
	invokevirtual int getStyle( net.rim.device.api.ui.Font ) // pc=1
	istore_3 
	aload_2 
	invokevirtual int[] getHeights( net.rim.device.api.ui.FontFamily ) // pc=1
	astore_4 
	bipush -1
	istore_5 
	aload_4 
	arraylength 
	iconst_1 
	isub 
	istore_6 
Label23:
	iload_6 
	iflt Label42
	aload_4 
	iload_6 
	iaload 
	iload_1 
	if_icmple Label35
	aload_4 
	iload_6 
	iaload 
	bipush 11
	if_icmpge Label40
Label35:
	aload_4 
	iload_6 
	iaload 
	istore_5 
	goto Label42
Label40:
	iinc 6 -1
	goto Label23
Label42:
	iload_5 
	bipush -1
	if_icmpeq Label50
	aload_0 
	iload_3 
	iload_5 
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int, int ) // pc=3
	areturn 
Label50:
	aload_0 
	areturn 
	}


static public final setPaddingForHeight( net.rim.device.api.ui.Field, int ); // address: 0
	{
	enter 
	iload_1 
	aload_0 
	invokevirtual int getPreferredHeight( net.rim.device.api.ui.Field ) // pc=1
	isub 
	iconst_0 
	invokestatic_lib int max( int, int ) // Math
	istore_2 
	iload_2 
	bipush 2
	idiv 
	istore_3 
	iload_2 
	iload_3 
	bipush 2
	imul 
	isub 
	istore_4 
	aload_0 
	iload_3 
	iconst_0 
	iload_3 
	iload_4 
	iadd 
	iconst_0 
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	return 
	}


static public final int getMaximumDisplayWidth(  ); // address: 0
	{
	enter_narrow 
	invokestatic boolean isRotationSupported(  ) // UiUtilities
	ifeq Label9
	invokestatic_lib int getHeight(  ) // Display
	invokestatic_lib int getWidth(  ) // Display
	invokestatic_lib int max( int, int ) // Math
	istore_0 
	iload_0 
	ireturn 
Label9:
	invokestatic_lib int getWidth(  ) // Display
	istore_0 
	iload_0 
	ireturn 
	}


static public final int getMaximumDisplayHeight(  ); // address: 0
	{
	enter_narrow 
	invokestatic boolean isRotationSupported(  ) // UiUtilities
	ifeq Label9
	invokestatic_lib int getHeight(  ) // Display
	invokestatic_lib int getWidth(  ) // Display
	invokestatic_lib int max( int, int ) // Math
	istore_0 
	iload_0 
	ireturn 
Label9:
	invokestatic_lib int getHeight(  ) // Display
	istore_0 
	iload_0 
	ireturn 
	}


static public final boolean isRotationSupported(  ); // address: 0
	{
	enter_narrow 
	iconst_0 
	istore_0 
	iconst_0 
	istore_1 
	invokestatic_lib boolean isVirtualKeyboardSupported(  ) // DeviceCapability
	istore_0 
	iconst_1 
	istore_1 
	iload_1 
	ifne Label15
	invokestatic_lib boolean isSupported(  ) // VirtualKeyboard
	istore_0 
	iconst_1 
	istore_1 
Label15:
	iload_0 
	ireturn 
	}


static public final net.rim.device.api.ui.Screen findScreenInDisplayStack( java.lang.Class ); // address: 0
	{
	enter_narrow 
	getstatic class$net$rim$device$api$ui$Screen // UiUtilities
	ifnonnull Label8
	ldc literal_86:"net.rim.device.api.ui.Screen"
	invokestatic java.lang.Class class$( java.lang.String ) // UiUtilities
	dup 
	putstatic class$net$rim$device$api$ui$Screen // UiUtilities
	goto Label9
Label8:
	getstatic class$net$rim$device$api$ui$Screen // UiUtilities
Label9:
	aload_0 
	invokevirtual boolean isAssignableFrom( java.lang.Class, java.lang.Class ) // pc=2
	ifne Label16
	new_lib IllegalArgumentException//java.lang.IllegalArgumentException java.lang.IllegalArgumentException java.lang.IllegalArgumentException
	dup 
	invokespecial_lib java.lang.IllegalArgumentException.<init> // pc=1
	athrow 
Label16:
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	invokevirtual net.rim.device.api.ui.Screen getActiveScreen( net.rim.device.api.ui.UiApplication ) // pc=1
	astore_1 
Label19:
	aload_1 
	ifnull Label32
	aload_0 
	aload_1 
	invokenonvirtual_lib java.lang.Object.getClass // pc=1
	invokevirtual boolean isAssignableFrom( java.lang.Class, java.lang.Class ) // pc=2
	ifeq Label28
	aload_1 
	areturn 
Label28:
	aload_1 
	invokevirtual net.rim.device.api.ui.Screen getScreenBelow( net.rim.device.api.ui.Screen ) // pc=1
	astore_1 
	goto Label19
Label32:
	aconst_null 
	areturn 
	}


static public final popScreenAndScreensAbove( net.rim.device.api.ui.Screen ); // address: 0
	{
	enter 
	aload_0 
	ifnonnull Label7
	new_lib NullPointerException//java.lang.NullPointerException java.lang.NullPointerException java.lang.NullPointerException
	dup 
	invokespecial_lib java.lang.NullPointerException.<init> // pc=1
	athrow 
Label7:
	aload_0 
	invokevirtual boolean isDisplayed( net.rim.device.api.ui.Screen ) // pc=1
	ifne Label14
	new_lib IllegalArgumentException//java.lang.IllegalArgumentException java.lang.IllegalArgumentException java.lang.IllegalArgumentException
	dup 
	invokespecial_lib java.lang.IllegalArgumentException.<init> // pc=1
	athrow 
Label14:
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	astore_1 
	aload_1 
	invokevirtual net.rim.device.api.ui.Screen getActiveScreen( net.rim.device.api.ui.UiApplication ) // pc=1
	astore_2 
Label19:
	aload_2 
	ifnull Label33
	aload_2 
	astore_3 
	aload_3 
	invokevirtual net.rim.device.api.ui.Screen getScreenBelow( net.rim.device.api.ui.Screen ) // pc=1
	astore_2 
	aload_1 
	aload_3 
	invokevirtual popScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	aload_3 
	aload_0 
	if_acmpne Label19
	return 
Label33:
	return 
	}


static public final net.rim.device.api.ui.XYRect getLeafFieldExtent( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual int getContentTop( net.rim.device.api.ui.Field ) // pc=1
	istore_2 
	aload_1 
	invokevirtual int getContentLeft( net.rim.device.api.ui.Field ) // pc=1
	istore_3 
	aload_1 
	invokevirtual net.rim.device.api.ui.Manager getManager( net.rim.device.api.ui.Field ) // pc=1
	astore_4 
Label10:
	aload_4 
	ifnull Label36
	iload_2 
	aload_4 
	invokevirtual int getContentTop( net.rim.device.api.ui.Field ) // pc=1
	aload_4 
	invokevirtual int getVerticalScroll( net.rim.device.api.ui.Manager ) // pc=1
	isub 
	iadd 
	istore_2 
	iload_3 
	aload_4 
	invokevirtual int getContentLeft( net.rim.device.api.ui.Field ) // pc=1
	aload_4 
	invokevirtual int getHorizontalScroll( net.rim.device.api.ui.Manager ) // pc=1
	isub 
	iadd 
	istore_3 
	aload_4 
	aload_0 
	if_acmpne Label32
	goto Label36
Label32:
	aload_4 
	invokevirtual net.rim.device.api.ui.Manager getManager( net.rim.device.api.ui.Field ) // pc=1
	astore_4 
	goto Label10
Label36:
	new_lib net.rim.device.api.ui.XYRect//net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect
	dup 
	iload_3 
	iload_2 
	aload_1 
	invokevirtual int getContentWidth( net.rim.device.api.ui.Field ) // pc=1
	aload_1 
	invokevirtual int getContentHeight( net.rim.device.api.ui.Field ) // pc=1
	invokespecial_lib net.rim.device.api.ui.XYRect.<init> // pc=5
	areturn 
	}


static public final net.rim.device.api.ui.Graphics newGraphics( net.rim.device.api.system.Bitmap ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokestatic_lib net.rim.device.api.ui.Graphics create( net.rim.device.api.system.Bitmap ) // Graphics
	areturn 
	}


static public final scaleInto( net.rim.device.api.system.Bitmap, net.rim.device.api.system.Bitmap ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	iconst_0 
	invokevirtual scaleInto( net.rim.device.api.system.Bitmap, net.rim.device.api.system.Bitmap, int ) // pc=3
	return 
	}


static public final int showBlockingAskDialog( int, int ); // address: 0
	{
	enter 
	iconst_1 
	newarray 5
	astore_2 
	invokestatic_lib com.whatsapp.client.UiApp.routine_1(  ) // UiApp
	ifeq Label14
	aload_2 
	iconst_0 
	iload_0 
	iload_1 
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokestatic_lib int ask( int, java.lang.String ) // Dialog
	iastore 
	goto Label22
Label14:
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	new UiUtilities$2
	dup 
	aload_2 
	iload_0 
	iload_1 
	invokespecial com.whatsapp.util.UiUtilities$2.<init> // pc=4
	invokevirtual invokeAndWait( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
Label22:
	aload_2 
	iconst_0 
	iaload 
	ireturn 
	}


static public final showBlockingAlertDialog( java.lang.String ); // address: 0
	{
	enter 
	invokestatic_lib com.whatsapp.client.UiApp.routine_1(  ) // UiApp
	ifeq Label6
	aload_0 
	invokestatic_lib alert( java.lang.String ) // Dialog
	return 
Label6:
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	new UiUtilities$3
	dup 
	aload_0 
	invokespecial com.whatsapp.util.UiUtilities$3.<init> // pc=2
	invokevirtual invokeAndWait( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	return 
	}


static public final boolean isTouchClickSupported(  ); // address: 0
	{
	enter_narrow 
	invokestatic_lib boolean isTouchClickSupported(  ) // DeviceCapability
	istore_0 
	iload_0 
	ireturn 
	}


static public final net.rim.device.api.system.Bitmap bitmapHorizontalAppend( net.rim.device.api.system.Bitmap, int, net.rim.device.api.system.Bitmap ); // address: 0
	{
	enter 
	aload_2 
	ifnull Label5
	aload_0 
	ifnonnull Label13
Label5:
	aload_2 
	ifnonnull Label9
	aload_0 
	goto Label10
Label9:
	aload_2 
Label10:
	astore_3 
	aload_3 
	areturn 
Label13:
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	iload_1 
	iadd 
	aload_2 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	iadd 
	istore_4 
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	aload_2 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	invokestatic_lib int max( int, int ) // Math
	istore_5 
	new_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	dup 
	iload_4 
	iload_5 
	invokespecial_lib net.rim.device.api.system.Bitmap.<init> // pc=3
	astore_3 
	aload_3 
	bipush 2
	invokevirtual createAlpha( net.rim.device.api.system.Bitmap, int ) // pc=2
	aload_3 
	invokestatic makeTransparent( net.rim.device.api.system.Bitmap ) // UiUtilities
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	imul 
	istore_6 
	aload_2 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_2 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	imul 
	istore_7 
	iload_7 
	iload_6 
	invokestatic_lib int max( int, int ) // Math
	newarray 5
	astore 8
	aload_0 
	aload 8
	iconst_0 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	iconst_0 
	iconst_0 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	invokevirtual getARGB( net.rim.device.api.system.Bitmap, int[], int, int, int, int, int, int ) // pc=8
	aload_3 
	aload 8
	iconst_0 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	iconst_0 
	aload_3 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	isub 
	bipush 2
	idiv 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	invokevirtual setARGB( net.rim.device.api.system.Bitmap, int[], int, int, int, int, int, int ) // pc=8
	aload_2 
	aload 8
	iconst_0 
	aload_2 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	iconst_0 
	iconst_0 
	aload_2 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_2 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	invokevirtual getARGB( net.rim.device.api.system.Bitmap, int[], int, int, int, int, int, int ) // pc=8
	aload_3 
	aload 8
	iconst_0 
	aload_2 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_3 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_2 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	isub 
	aload_3 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	aload_2 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	isub 
	bipush 2
	idiv 
	aload_2 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_2 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	invokevirtual setARGB( net.rim.device.api.system.Bitmap, int[], int, int, int, int, int, int ) // pc=8
	aload_3 
	areturn 
	}


static public final setFocusLater( net.rim.device.api.ui.Field ); // address: 0
	{
	enter 
	aload_0 
	ifnull Label6
	aload_0 
	invokevirtual boolean isVisible( net.rim.device.api.ui.Field ) // pc=1
	ifne Label7
Label6:
	return 
Label7:
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	new UiUtilities$4
	dup 
	aload_0 
	invokespecial com.whatsapp.util.UiUtilities$4.<init> // pc=2
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	return 
	}


static public final net.rim.device.api.ui.container.PopupScreen createProgressPopup( java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	iipush 131072
	i2l 
	invokestatic net.rim.device.api.ui.container.PopupScreen createProgressPopup( java.lang.String, long ) // UiUtilities
	areturn 
	}


static public final net.rim.device.api.ui.container.PopupScreen createProgressPopup( java.lang.String, long ); // address: 0
	{
	enter 
	new_lib net.rim.device.api.ui.container.HorizontalFieldManager//net.rim.device.api.ui.container.HorizontalFieldManager net.rim.device.api.ui.container.HorizontalFieldManager net.rim.device.api.ui.container.HorizontalFieldManager
	dup 
	invokespecial_lib net.rim.device.api.ui.container.HorizontalFieldManager.<init> // pc=1
	astore_3 
	new_lib com.whatsapp.field.ProgressAnimationField//com.whatsapp.field.ProgressAnimationField com.whatsapp.field.ProgressAnimationField com.whatsapp.field.ProgressAnimationField
	dup 
	getstatic_lib module:WhatsApp-31.class#0.static_43 // class#0
	invokestatic_lib net.rim.device.api.system.Bitmap getBitmapResource( java.lang.String ) // Bitmap
	bipush 6
	lipush 51539607552
	invokespecial_lib .routine_7339 // pc=5
	astore_4 
	aload_3 
	aload_4 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	ifnull Label36
	aload_0 
	stringlength 
	ifle Label36
	aload_4 
	iconst_0 
	bipush 12
	iconst_0 
	iconst_0 
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	new_lib net.rim.device.api.ui.component.LabelField//net.rim.device.api.ui.component.LabelField net.rim.device.api.ui.component.LabelField net.rim.device.api.ui.component.LabelField
	dup 
	aload_0 
	lipush 51539607552
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=4
	astore_5 
	aload_3 
	aload_5 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
Label36:
	new_lib net.rim.device.api.ui.container.PopupScreen//net.rim.device.api.ui.container.PopupScreen net.rim.device.api.ui.container.PopupScreen net.rim.device.api.ui.container.PopupScreen
	dup 
	aload_3 
	lload 1
	invokespecial_lib net.rim.device.api.ui.container.PopupScreen.<init> // pc=4
	astore_5 
	aload_5 
	areturn 
	}


static public final long makePackedChar( char ); // address: 0
	{
	enter_narrow 
	iload_0 
	i2l 
	bipush 32
	lshl 
	lreturn 
	}


static public final long makePackedChar( char, int ); // address: 0
	{
	enter 
	iload_0 
	i2l 
	bipush 32
	lshl 
	iload_1 
	i2l 
	lor 
	lreturn 
	}


static public final java.lang.String getPackedCharName( long ); // address: 0
	{
	enter 
	lload 0
	bipush 32
	lushr 
	l2i 
	i2c 
	istore_2 
	lload 0
	bipush -1
	i2l 
	land 
	l2i 
	istore_3 
	iload_3 
	iconst_1 
	if_icmpne Label24
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_87:"Alt-"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
Label24:
	iload_3 
	bipush 2
	if_icmpne Label35
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_88:"Shift-"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
Label35:
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	iload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}


static public final long getPackedKeyChar( char, int ); // address: 0
	{
	enter 
	getstatic com.whatsapp.util.UiUtilities.field_58022 // UiUtilities
	ifeq Label16
	iload_0 
	invokestatic_lib char getAltedChar( char ) // Keypad
	istore_2 
	iload_2 
	i2l 
	bipush 32
	lshl 
	iload_1 
	i2l 
	lor 
	lstore 3
	lload 3
	lreturn 
Label16:
	iload_0 
	iload_1 
	invokestatic_lib int getKeyCode( char, int ) // Keypad
	istore_2 
	iload_2 
	i2l 
	bipush 32
	lshl 
	iload_1 
	i2l 
	lor 
	lstore 3
	lload 3
	lreturn 
	}


static final java.lang.Class class$( java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokestatic_lib java.lang.Class forName( java.lang.String ) // Class
	areturn 
	astore_1 
	new_lib NoClassDefFoundError//java.lang.NoClassDefFoundError java.lang.NoClassDefFoundError java.lang.NoClassDefFoundError
	dup 
	aload_1 
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	invokespecial_lib java.lang.NoClassDefFoundError.<init> // pc=2
	athrow 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	synch_static UiUtilities
	clinit_wait 
	bipush -1
	putstatic com.whatsapp.util.UiUtilities.field_58016 // UiUtilities
	invokestatic_lib int getHardwareLayout(  ) // Keypad
Label7:
	iconst_1 
	putstatic com.whatsapp.util.UiUtilities.field_58022 // UiUtilities
	goto Label12
Label10:
	iconst_0 
	putstatic com.whatsapp.util.UiUtilities.field_58022 // UiUtilities
Label12:
	new_lib com.whatsapp.util.//module:WhatsApp-59.class#5 module:WhatsApp-59.class#5 module:WhatsApp-59.class#5
	dup 
	invokespecial_lib .routine_4412 // pc=1
	putstatic com.whatsapp.util.UiUtilities.field_58028 // UiUtilities
	clinit_return 
	}

}
