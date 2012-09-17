// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-24.cod
// Module version  : 2.8.1914
// Class ID        : 10
// ########################################################


package com.whatsapp.client;


abstract public final class EmojiActiveRichTextField extends net.rim.device.api.ui.component.ActiveRichTextField
implements com.whatsapp.client.EmojiUtil$EmojiDrawable

{

	// @@@@@@@@@@@@@ Fields 
	private int /*int*/  field_54208 ; // ofs = 54208 addr = 0)
	private String /*java.lang.String*/  field_54212 ; // ofs = 54212 addr = 0)
	private net.rim.device.api.ui.Font /*net.rim.device.api.ui.Font*/  field_54216 ; // ofs = 54216 addr = 0)
	private int /*int*/  field_54220 ; // ofs = 54220 addr = 0)
	private net.rim.device.api.ui.XYRect /*net.rim.device.api.ui.XYRect*/  field_54224 ; // ofs = 54224 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.EmojiActiveRichTextField, java.lang.String, long ); // address: 0
	{
	enter 
	aload_0 
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	lload 2
	invokespecial_lib net.rim.device.api.ui.component.ActiveRichTextField.<init> // pc=4
	aload_0 
	aconst_null 
	putfield com.whatsapp.client.EmojiActiveRichTextField.field_54212   // get_name_1:  com.whatsapp.client.EmojiActiveRichTextField.field_54212   // get_name_2:  com.whatsapp.client.EmojiActiveRichTextField.field_54212   // get_Name:    com.whatsapp.client.EmojiActiveRichTextField.field_54212   // getName->1:     // getName->2:     // getName->N:     // ofs = 54212 ord = 1 addr = 0
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.EmojiActiveRichTextField.field_54220   // get_name_1:  com.whatsapp.client.EmojiActiveRichTextField.field_54220   // get_name_2:  com.whatsapp.client.EmojiActiveRichTextField.field_54220   // get_Name:    com.whatsapp.client.EmojiActiveRichTextField.field_54220   // getName->1:     // getName->2:     // getName->N:     // ofs = 54220 ord = 3 addr = 0
	aload_0 
	aconst_null 
	putfield com.whatsapp.client.EmojiActiveRichTextField.field_54224   // get_name_1:  com.whatsapp.client.EmojiActiveRichTextField.field_54224   // get_name_2:  com.whatsapp.client.EmojiActiveRichTextField.field_54224   // get_Name:    com.whatsapp.client.EmojiActiveRichTextField.field_54224   // getName->1:     // getName->2:     // getName->N:     // ofs = 54224 ord = 4 addr = 0
	aload_0 
	aload_1 
	invokenonvirtual com.whatsapp.client.EmojiActiveRichTextField.setText // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final int[] com.whatsapp.client.EmojiActiveRichTextField.routine_2239( com.whatsapp.client.EmojiActiveRichTextField, java.lang.String ); // address: 0
	{
	enter 
	new_lib net.rim.device.api.ui.XYRect//net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect
	dup 
	invokespecial_lib net.rim.device.api.util.IntVector.<init> // pc=1
	astore_2 
	aload_2 
	iconst_0 
	invokevirtual addElement( net.rim.device.api.util.IntVector, int ) // pc=2
	aload_1 
	ifnull Label52
	aload_1 
	stringlength 
	ifle Label52
	aload_1 
	stringlength 
	istore_3 
	aload_1 
	iconst_0 
	stringaload 
	invokestatic boolean isEmoji( char ) // EmojiUtil
	istore_4 
	iconst_1 
	istore_5 
Label23:
	iload_5 
	iload_3 
	if_icmpge Label52
	aload_1 
	iload_5 
	stringaload 
	istore_6 
	iload_6 
	invokestatic boolean isEmojiLayout( char ) // EmojiUtil
	ifeq Label34
	goto Label50
Label34:
	iload_6 
	invokestatic boolean isEmoji( char ) // EmojiUtil
	ifeq Label43
	iconst_1 
	istore_4 
	aload_2 
	iload_5 
	invokevirtual addElement( net.rim.device.api.util.IntVector, int ) // pc=2
	goto Label50
Label43:
	iload_4 
	ifeq Label50
	aload_2 
	iload_5 
	invokevirtual addElement( net.rim.device.api.util.IntVector, int ) // pc=2
	iconst_0 
	istore_4 
Label50:
	iinc 5 1
	goto Label23
Label52:
	aload_2 
	aload_1 
	stringlength 
	invokevirtual addElement( net.rim.device.api.util.IntVector, int ) // pc=2
	aload_2 
	invokevirtual int[] toArray( net.rim.device.api.util.IntVector ) // pc=1
	areturn 
	}


private final java.lang.String com.whatsapp.client.EmojiActiveRichTextField.routine_2357( com.whatsapp.client.EmojiActiveRichTextField, java.lang.String ); // address: 0
	{
	enter 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	astore_2 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	astore_3 
	aload_1 
	stringlength 
	istore_4 
	iconst_0 
	istore_5 
Label13:
	iload_5 
	iload_4 
	if_icmpge Label24
	aload_3 
	aload_2 
	aload_1 
	iload_5 
	stringaload 
	invokestatic appendEmojiInputFormat( net.rim.device.api.ui.Font, java.lang.StringBuffer, char ) // EmojiUtil
	iinc 5 1
	goto Label13
Label24:
	aload_2 
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}


private final int com.whatsapp.client.EmojiActiveRichTextField.routine_2419( com.whatsapp.client.EmojiActiveRichTextField, int, int ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.RichTextField ) // pc=1
	astore_3 
	iload_2 
	iconst_1 
	if_icmpeq Label15
	iload_2 
	bipush -1
	if_icmpeq Label15
	new_lib net.rim.device.api.ui.component.Dialog//net.rim.device.api.ui.component.Dialog net.rim.device.api.ui.component.Dialog net.rim.device.api.ui.component.Dialog
	dup 
	ldc literal_88:"Direction must be 1 or -1"
	invokespecial_lib java.lang.IllegalArgumentException.<init> // pc=2
	athrow 
Label15:
	iconst_0 
	istore_4 
Label17:
	iload_1 
	iload_4 
	iadd 
	aload_3 
	stringlength 
	if_icmpge Label39
	iload_1 
	iload_4 
	iadd 
	iflt Label39
	aload_3 
	iload_1 
	iload_4 
	iadd 
	stringaload 
	invokestatic boolean isEmojiLayout( char ) // EmojiUtil
	ifeq Label39
	iload_4 
	iload_2 
	iadd 
	istore_4 
	goto Label17
Label39:
	iload_4 
	ireturn 
	}


private final com.whatsapp.client.EmojiActiveRichTextField.routine_2495( com.whatsapp.client.EmojiActiveRichTextField ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual int getCursorPosition( net.rim.device.api.ui.component.RichTextField ) // pc=1
	istore_1 
	aload_0 
	invokevirtual boolean isSelecting( net.rim.device.api.ui.component.TextField ) // pc=1
	ifeq Label11
	iload_1 
	aload_0_getfield com.whatsapp.client.EmojiActiveRichTextField.field_54208   // get_name_1:  com.whatsapp.client.EmojiActiveRichTextField.field_54208   // get_name_2:  com.whatsapp.client.EmojiActiveRichTextField.field_54208   // get_Name:    com.whatsapp.client.EmojiActiveRichTextField.field_54208   // getName->1:     // getName->2:     // getName->N:     // ofs = 54208 ord = 0 addr = 0
	if_icmpne Label11
	return 
Label11:
	aload_0 
	invokevirtual boolean isSelecting( net.rim.device.api.ui.component.TextField ) // pc=1
	ifeq Label17
	iload_1 
	aload_0_getfield com.whatsapp.client.EmojiActiveRichTextField.field_54208   // get_name_1:  com.whatsapp.client.EmojiActiveRichTextField.field_54208   // get_name_2:  com.whatsapp.client.EmojiActiveRichTextField.field_54208   // get_Name:    com.whatsapp.client.EmojiActiveRichTextField.field_54208   // getName->1:     // getName->2:     // getName->N:     // ofs = 54208 ord = 0 addr = 0
	if_icmple Label19
Label17:
	iconst_1 
	goto Label20
Label19:
	bipush -1
Label20:
	istore_2 
	iload_1 
	aload_0 
	iload_1 
	iload_2 
	invokespecial com.whatsapp.client.EmojiActiveRichTextField.routine_2419 // pc=3
	iadd 
	istore_3 
	aload_0 
	iload_3 
	iconst_0 
	invokenonvirtual com.whatsapp.client.EmojiActiveRichTextField.setCursorPosition // pc=3
	return 
	}


private final com.whatsapp.client.EmojiActiveRichTextField.routine_2560( com.whatsapp.client.EmojiActiveRichTextField, net.rim.device.api.system.Clipboard ); // address: 0
	{
	enter_narrow 
	aload_1 
	invokevirtual java.lang.Object get( net.rim.device.api.system.Clipboard ) // pc=1
	astore_2 
	aload_2 
	instanceof_lib String//java.lang.String java.lang.String java.lang.String
	ifeq Label13
	aload_1 
	aload_2 
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	invokestatic java.lang.String removeEmojiLayout( java.lang.String ) // EmojiUtil
	invokevirtual java.lang.Object put( net.rim.device.api.system.Clipboard, java.lang.Object ) // pc=2
	pop 
Label13:
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final setSubtleText( com.whatsapp.client.EmojiActiveRichTextField, java.lang.String, net.rim.device.api.ui.Font ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	putfield com.whatsapp.client.EmojiActiveRichTextField.field_54212   // get_name_1:  com.whatsapp.client.EmojiActiveRichTextField.field_54212   // get_name_2:  com.whatsapp.client.EmojiActiveRichTextField.field_54212   // get_Name:    com.whatsapp.client.EmojiActiveRichTextField.field_54212   // getName->1:     // getName->2:     // getName->N:     // ofs = 54212 ord = 1 addr = 0
	aload_0 
	aload_2 
	putfield com.whatsapp.client.EmojiActiveRichTextField.field_54216   // get_name_1:  com.whatsapp.client.EmojiActiveRichTextField.field_54216   // get_name_2:  com.whatsapp.client.EmojiActiveRichTextField.field_54216   // get_Name:    com.whatsapp.client.EmojiActiveRichTextField.field_54216   // getName->1:     // getName->2:     // getName->N:     // ofs = 54216 ord = 2 addr = 0
	return 
	}


public final int getSubtleExtraVerticalPixels( com.whatsapp.client.EmojiActiveRichTextField ); // address: 0
	{
	ireturn_field com.whatsapp.client.EmojiActiveRichTextField.field_54220   // get_name_1:  com.whatsapp.client.EmojiActiveRichTextField.field_54220   // get_name_2:  com.whatsapp.client.EmojiActiveRichTextField.field_54220   // get_Name:    com.whatsapp.client.EmojiActiveRichTextField.field_54220   // getName->1:     // getName->2:     // getName->N:     // ofs = 54220 ord = 3 addr = 0
	}


public final int getLabelColor( com.whatsapp.client.EmojiActiveRichTextField ); // address: 0
	{
	ireturn_bipush 0
	}


public final int drawTextOriginal( com.whatsapp.client.EmojiActiveRichTextField, net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.ui.DrawTextParam ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.EmojiActiveRichTextField.field_54224   // get_name_1:  com.whatsapp.client.EmojiActiveRichTextField.field_54224   // get_name_2:  com.whatsapp.client.EmojiActiveRichTextField.field_54224   // get_Name:    com.whatsapp.client.EmojiActiveRichTextField.field_54224   // getName->1:     // getName->2:     // getName->N:     // ofs = 54224 ord = 4 addr = 0
	ifnull Label64
	iload_2 
	aload_6 
	invokestatic int getStartOffset( net.rim.device.api.ui.DrawTextParam ) // EmojiUtil
	iadd 
	istore_7 
	iload_2 
	aload_6 
	invokestatic int getEndOffset( net.rim.device.api.ui.DrawTextParam ) // EmojiUtil
	iadd 
	istore 8
	aload_0 
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.RichTextField ) // pc=1
	iload_7 
	iload 8
	invokenonvirtual_lib java.lang.String.substring // pc=3
	astore 9
	aload_1 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Graphics ) // pc=1
	aload 9
	invokevirtual int getAdvance( net.rim.device.api.ui.Font, java.lang.String ) // pc=2
	istore 10
	iload_5 
	aload_0_getfield com.whatsapp.client.EmojiActiveRichTextField.field_54224   // get_name_1:  com.whatsapp.client.EmojiActiveRichTextField.field_54224   // get_name_2:  com.whatsapp.client.EmojiActiveRichTextField.field_54224   // get_Name:    com.whatsapp.client.EmojiActiveRichTextField.field_54224   // getName->1:     // getName->2:     // getName->N:     // ofs = 54224 ord = 4 addr = 0
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 0 addr = -1
	if_icmplt Label64
	aload_0_getfield com.whatsapp.client.EmojiActiveRichTextField.field_54224   // get_name_1:  com.whatsapp.client.EmojiActiveRichTextField.field_54224   // get_name_2:  com.whatsapp.client.EmojiActiveRichTextField.field_54224   // get_Name:    com.whatsapp.client.EmojiActiveRichTextField.field_54224   // getName->1:     // getName->2:     // getName->N:     // ofs = 54224 ord = 4 addr = 0
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 0 addr = -1
	iload_5 
	if_icmpeq Label42
	aload_0_getfield com.whatsapp.client.EmojiActiveRichTextField.field_54224   // get_name_1:  com.whatsapp.client.EmojiActiveRichTextField.field_54224   // get_name_2:  com.whatsapp.client.EmojiActiveRichTextField.field_54224   // get_Name:    com.whatsapp.client.EmojiActiveRichTextField.field_54224   // getName->1:     // getName->2:     // getName->N:     // ofs = 54224 ord = 4 addr = 0
	iload_5 
	putfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 0 addr = -1
	aload_0_getfield com.whatsapp.client.EmojiActiveRichTextField.field_54224   // get_name_1:  com.whatsapp.client.EmojiActiveRichTextField.field_54224   // get_name_2:  com.whatsapp.client.EmojiActiveRichTextField.field_54224   // get_Name:    com.whatsapp.client.EmojiActiveRichTextField.field_54224   // getName->1:     // getName->2:     // getName->N:     // ofs = 54224 ord = 4 addr = 0
	iload_4 
	putfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 2 addr = -1
	aload_0_getfield com.whatsapp.client.EmojiActiveRichTextField.field_54224   // get_name_1:  com.whatsapp.client.EmojiActiveRichTextField.field_54224   // get_name_2:  com.whatsapp.client.EmojiActiveRichTextField.field_54224   // get_Name:    com.whatsapp.client.EmojiActiveRichTextField.field_54224   // getName->1:     // getName->2:     // getName->N:     // ofs = 54224 ord = 4 addr = 0
	iload 10
	putfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	goto Label64
Label42:
	aload_0_getfield com.whatsapp.client.EmojiActiveRichTextField.field_54224   // get_name_1:  com.whatsapp.client.EmojiActiveRichTextField.field_54224   // get_name_2:  com.whatsapp.client.EmojiActiveRichTextField.field_54224   // get_Name:    com.whatsapp.client.EmojiActiveRichTextField.field_54224   // getName->1:     // getName->2:     // getName->N:     // ofs = 54224 ord = 4 addr = 0
	aload_0_getfield com.whatsapp.client.EmojiActiveRichTextField.field_54224   // get_name_1:  com.whatsapp.client.EmojiActiveRichTextField.field_54224   // get_name_2:  com.whatsapp.client.EmojiActiveRichTextField.field_54224   // get_Name:    com.whatsapp.client.EmojiActiveRichTextField.field_54224   // getName->1:     // getName->2:     // getName->N:     // ofs = 54224 ord = 4 addr = 0
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 2 addr = -1
	iload_4 
	invokestatic_lib int min( int, int ) // Math
	putfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 2 addr = -1
	aload_0_getfield com.whatsapp.client.EmojiActiveRichTextField.field_54224   // get_name_1:  com.whatsapp.client.EmojiActiveRichTextField.field_54224   // get_name_2:  com.whatsapp.client.EmojiActiveRichTextField.field_54224   // get_Name:    com.whatsapp.client.EmojiActiveRichTextField.field_54224   // getName->1:     // getName->2:     // getName->N:     // ofs = 54224 ord = 4 addr = 0
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 2 addr = -1
	aload_0_getfield com.whatsapp.client.EmojiActiveRichTextField.field_54224   // get_name_1:  com.whatsapp.client.EmojiActiveRichTextField.field_54224   // get_name_2:  com.whatsapp.client.EmojiActiveRichTextField.field_54224   // get_Name:    com.whatsapp.client.EmojiActiveRichTextField.field_54224   // getName->1:     // getName->2:     // getName->N:     // ofs = 54224 ord = 4 addr = 0
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	iadd 
	iload_4 
	iload 10
	iadd 
	invokestatic_lib int max( int, int ) // Math
	istore 11
	aload_0_getfield com.whatsapp.client.EmojiActiveRichTextField.field_54224   // get_name_1:  com.whatsapp.client.EmojiActiveRichTextField.field_54224   // get_name_2:  com.whatsapp.client.EmojiActiveRichTextField.field_54224   // get_Name:    com.whatsapp.client.EmojiActiveRichTextField.field_54224   // getName->1:     // getName->2:     // getName->N:     // ofs = 54224 ord = 4 addr = 0
	iload 11
	aload_0_getfield com.whatsapp.client.EmojiActiveRichTextField.field_54224   // get_name_1:  com.whatsapp.client.EmojiActiveRichTextField.field_54224   // get_name_2:  com.whatsapp.client.EmojiActiveRichTextField.field_54224   // get_Name:    com.whatsapp.client.EmojiActiveRichTextField.field_54224   // getName->1:     // getName->2:     // getName->N:     // ofs = 54224 ord = 4 addr = 0
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 2 addr = -1
	isub 
	putfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
Label64:
	aload_0 
	aload_1 
	iload_2 
	iload_3 
	iload_4 
	iload_5 
	aload_6 
	invokespecial_lib net.rim.device.api.ui.component.TextField.drawText // pc=7
	ireturn 
	}


protected final layout( com.whatsapp.client.EmojiActiveRichTextField, int, int ); // address: 0
	{
	enter 
	aload_0 
	iload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.component.RichTextField.layout // pc=3
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.EmojiActiveRichTextField.field_54220   // get_name_1:  com.whatsapp.client.EmojiActiveRichTextField.field_54220   // get_name_2:  com.whatsapp.client.EmojiActiveRichTextField.field_54220   // get_Name:    com.whatsapp.client.EmojiActiveRichTextField.field_54220   // getName->1:     // getName->2:     // getName->N:     // ofs = 54220 ord = 3 addr = 0
	aload_0_getfield com.whatsapp.client.EmojiActiveRichTextField.field_54212   // get_name_1:  com.whatsapp.client.EmojiActiveRichTextField.field_54212   // get_name_2:  com.whatsapp.client.EmojiActiveRichTextField.field_54212   // get_Name:    com.whatsapp.client.EmojiActiveRichTextField.field_54212   // getName->1:     // getName->2:     // getName->N:     // ofs = 54212 ord = 1 addr = 0
	ifnonnull Label11
	goto_w Label90
Label11:
	new_lib net.rim.device.api.system.Clipboard//net.rim.device.api.system.Clipboard net.rim.device.api.system.Clipboard net.rim.device.api.system.Clipboard
	dup 
	iconst_1 
	iconst_1 
	invokespecial_lib net.rim.device.api.system.Bitmap.<init> // pc=3
	astore_3 
	aload_3 
	invokestatic_lib module:WhatsApp-60.class#2.routine_3149(  ) // class#2
	astore_4 
	aload_4 
	iconst_1 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	isub 
	iconst_1 
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	isub 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	iconst_1 
	isub 
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	iconst_1 
	isub 
	iconst_0 
	iconst_0 
	invokevirtual boolean pushRegion( net.rim.device.api.ui.Graphics, int, int, int, int, int, int ) // pc=7
	pop 
	aload_0 
	new_lib net.rim.device.api.ui.component.ButtonField//net.rim.device.api.ui.component.ButtonField net.rim.device.api.ui.component.ButtonField net.rim.device.api.ui.component.ButtonField
	dup 
	bipush -1
	bipush -1
	iconst_0 
	iconst_0 
	invokespecial_lib net.rim.device.api.ui.XYRect.<init> // pc=5
	putfield com.whatsapp.client.EmojiActiveRichTextField.field_54224   // get_name_1:  com.whatsapp.client.EmojiActiveRichTextField.field_54224   // get_name_2:  com.whatsapp.client.EmojiActiveRichTextField.field_54224   // get_Name:    com.whatsapp.client.EmojiActiveRichTextField.field_54224   // getName->1:     // getName->2:     // getName->N:     // ofs = 54224 ord = 4 addr = 0
	aload_0 
	aload_4 
	invokespecial_lib net.rim.device.api.ui.component.RichTextField.paint // pc=2
	aload_0_getfield com.whatsapp.client.EmojiActiveRichTextField.field_54224   // get_name_1:  com.whatsapp.client.EmojiActiveRichTextField.field_54224   // get_name_2:  com.whatsapp.client.EmojiActiveRichTextField.field_54224   // get_Name:    com.whatsapp.client.EmojiActiveRichTextField.field_54224   // getName->1:     // getName->2:     // getName->N:     // ofs = 54224 ord = 4 addr = 0
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 0 addr = -1
	bipush -1
	if_icmpeq Label87
	aload_0_getfield com.whatsapp.client.EmojiActiveRichTextField.field_54224   // get_name_1:  com.whatsapp.client.EmojiActiveRichTextField.field_54224   // get_name_2:  com.whatsapp.client.EmojiActiveRichTextField.field_54224   // get_Name:    com.whatsapp.client.EmojiActiveRichTextField.field_54224   // getName->1:     // getName->2:     // getName->N:     // ofs = 54224 ord = 4 addr = 0
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 2 addr = -1
	aload_0_getfield com.whatsapp.client.EmojiActiveRichTextField.field_54224   // get_name_1:  com.whatsapp.client.EmojiActiveRichTextField.field_54224   // get_name_2:  com.whatsapp.client.EmojiActiveRichTextField.field_54224   // get_Name:    com.whatsapp.client.EmojiActiveRichTextField.field_54224   // getName->1:     // getName->2:     // getName->N:     // ofs = 54224 ord = 4 addr = 0
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	iadd 
	istore_5 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	aload_0_getfield com.whatsapp.client.EmojiActiveRichTextField.field_54216   // get_name_1:  com.whatsapp.client.EmojiActiveRichTextField.field_54216   // get_name_2:  com.whatsapp.client.EmojiActiveRichTextField.field_54216   // get_Name:    com.whatsapp.client.EmojiActiveRichTextField.field_54216   // getName->1:     // getName->2:     // getName->N:     // ofs = 54216 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.client.EmojiActiveRichTextField.field_54212   // get_name_1:  com.whatsapp.client.EmojiActiveRichTextField.field_54212   // get_name_2:  com.whatsapp.client.EmojiActiveRichTextField.field_54212   // get_Name:    com.whatsapp.client.EmojiActiveRichTextField.field_54212   // getName->1:     // getName->2:     // getName->N:     // ofs = 54212 ord = 1 addr = 0
	invokevirtual int getAdvance( net.rim.device.api.ui.Font, java.lang.String ) // pc=2
	isub 
	istore_6 
	iload_5 
	iload_6 
	if_icmple Label87
	aload_0_getfield com.whatsapp.client.EmojiActiveRichTextField.field_54216   // get_name_1:  com.whatsapp.client.EmojiActiveRichTextField.field_54216   // get_name_2:  com.whatsapp.client.EmojiActiveRichTextField.field_54216   // get_Name:    com.whatsapp.client.EmojiActiveRichTextField.field_54216   // getName->1:     // getName->2:     // getName->N:     // ofs = 54216 ord = 2 addr = 0
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	istore_7 
	aload_0 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	iload_7 
	iadd 
	invokevirtual setExtent( net.rim.device.api.ui.Field, int, int ) // pc=3
	aload_0 
	iload_7 
	putfield com.whatsapp.client.EmojiActiveRichTextField.field_54220   // get_name_1:  com.whatsapp.client.EmojiActiveRichTextField.field_54220   // get_name_2:  com.whatsapp.client.EmojiActiveRichTextField.field_54220   // get_Name:    com.whatsapp.client.EmojiActiveRichTextField.field_54220   // getName->1:     // getName->2:     // getName->N:     // ofs = 54220 ord = 3 addr = 0
Label87:
	aload_0 
	aconst_null 
	putfield com.whatsapp.client.EmojiActiveRichTextField.field_54224   // get_name_1:  com.whatsapp.client.EmojiActiveRichTextField.field_54224   // get_name_2:  com.whatsapp.client.EmojiActiveRichTextField.field_54224   // get_Name:    com.whatsapp.client.EmojiActiveRichTextField.field_54224   // getName->1:     // getName->2:     // getName->N:     // ofs = 54224 ord = 4 addr = 0
Label90:
	return 
	}


public final setText( com.whatsapp.client.EmojiActiveRichTextField, java.lang.String ); // address: 0
	{
	enter 
	aload_1 
	ifnull Label27
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.EmojiActiveRichTextField.routine_2357 // pc=2
	astore_2 
	iconst_1 
	newarray_object_lib net.rim.device.api.ui.Font//net.rim.device.api.ui.Font net.rim.device.api.ui.Font net.rim.device.api.ui.Font
	astore_3 
	aload_0 
	aload_2 
	invokespecial com.whatsapp.client.EmojiActiveRichTextField.routine_2239 // pc=2
	astore_4 
	aload_4 
	arraylength 
	iconst_1 
	isub 
	newarray 2
	astore_5 
	aload_0 
	aload_2 
	aload_4 
	aload_5 
	aload_3 
	invokespecial_lib net.rim.device.api.ui.component.ActiveRichTextField.setText // pc=5
	return 
Label27:
	aload_0 
	aconst_null 
	invokespecial_lib net.rim.device.api.ui.component.ActiveRichTextField.setText // pc=2
	return 
	}


public final int drawText( com.whatsapp.client.EmojiActiveRichTextField, net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.ui.DrawTextParam ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	iload_2 
	iload_3 
	iload_4 
	iload_5 
	aload_6 
	invokestatic int drawText( com.whatsapp.client.EmojiUtil$EmojiDrawable, net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.ui.DrawTextParam ) // EmojiUtil
	istore_7 
	iload_7 
	ireturn 
	}


protected final paint( com.whatsapp.client.EmojiActiveRichTextField, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.component.RichTextField.paint // pc=2
	aload_0_getfield com.whatsapp.client.EmojiActiveRichTextField.field_54212   // get_name_1:  com.whatsapp.client.EmojiActiveRichTextField.field_54212   // get_name_2:  com.whatsapp.client.EmojiActiveRichTextField.field_54212   // get_Name:    com.whatsapp.client.EmojiActiveRichTextField.field_54212   // getName->1:     // getName->2:     // getName->N:     // ofs = 54212 ord = 1 addr = 0
	ifnull Label50
	aload_0_getfield com.whatsapp.client.EmojiActiveRichTextField.field_54212   // get_name_1:  com.whatsapp.client.EmojiActiveRichTextField.field_54212   // get_name_2:  com.whatsapp.client.EmojiActiveRichTextField.field_54212   // get_Name:    com.whatsapp.client.EmojiActiveRichTextField.field_54212   // getName->1:     // getName->2:     // getName->N:     // ofs = 54212 ord = 1 addr = 0
	stringlength 
	ifle Label50
	aload_1 
	invokevirtual int getGlobalAlpha( net.rim.device.api.ui.Graphics ) // pc=1
	istore_2 
	aload_1 
	invokevirtual int getColor( net.rim.device.api.ui.Graphics ) // pc=1
	istore_3 
	aload_1 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Graphics ) // pc=1
	astore_4 
	aload_1 
	aload_0_getfield com.whatsapp.client.EmojiActiveRichTextField.field_54216   // get_name_1:  com.whatsapp.client.EmojiActiveRichTextField.field_54216   // get_name_2:  com.whatsapp.client.EmojiActiveRichTextField.field_54216   // get_Name:    com.whatsapp.client.EmojiActiveRichTextField.field_54216   // getName->1:     // getName->2:     // getName->N:     // ofs = 54216 ord = 2 addr = 0
	invokevirtual setFont( net.rim.device.api.ui.Graphics, net.rim.device.api.ui.Font ) // pc=2
	aload_1 
	sipush 128
	invokevirtual setGlobalAlpha( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	iconst_0 
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.EmojiActiveRichTextField.field_54212   // get_name_1:  com.whatsapp.client.EmojiActiveRichTextField.field_54212   // get_name_2:  com.whatsapp.client.EmojiActiveRichTextField.field_54212   // get_Name:    com.whatsapp.client.EmojiActiveRichTextField.field_54212   // getName->1:     // getName->2:     // getName->N:     // ofs = 54212 ord = 1 addr = 0
	iconst_0 
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	aload_1 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Graphics ) // pc=1
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	isub 
	bipush 5
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	invokevirtual int drawText( net.rim.device.api.ui.Graphics, java.lang.String, int, int, int, int ) // pc=6
	pop 
	aload_1 
	iload_2 
	invokevirtual setGlobalAlpha( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	iload_3 
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	aload_4 
	invokevirtual setFont( net.rim.device.api.ui.Graphics, net.rim.device.api.ui.Font ) // pc=2
Label50:
	return 
	}


protected final setCursorPosition( com.whatsapp.client.EmojiActiveRichTextField, int, int ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.RichTextField ) // pc=1
	astore_3 
Label4:
	iload_1 
	aload_3 
	stringlength 
	if_icmpge Label15
	aload_3 
	iload_1 
	stringaload 
	invokestatic boolean isEmojiLayout( char ) // EmojiUtil
	ifeq Label15
	iinc 1 -1
	goto Label4
Label15:
	aload_0 
	iload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.component.TextField.setCursorPosition // pc=3
	return 
	}


public final int moveFocus( com.whatsapp.client.EmojiActiveRichTextField, int, int, int ); // address: 0
	{
	enter 
	iload_2 
	iipush 65536
	iand 
	ifne Label11
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	invokespecial_lib net.rim.device.api.ui.component.RichTextField.moveFocus // pc=4
	ireturn 
Label11:
	aload_0 
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.RichTextField ) // pc=1
	astore_4 
	iload_1 
	ifle Label18
	iconst_1 
	goto Label19
Label18:
	bipush -1
Label19:
	istore_5 
	iconst_0 
	istore_6 
	iload_1 
	iload_5 
	imul 
	istore_7 
Label26:
	iload_7 
	ifle Label60
Label28:
	aload_0 
	iload_5 
	iload_2 
	iload_3 
	invokespecial_lib net.rim.device.api.ui.component.RichTextField.moveFocus // pc=4
	dup 
	istore 8
	ifne Label51
	aload_0 
	invokevirtual int getCursorPosition( net.rim.device.api.ui.component.RichTextField ) // pc=1
	iflt Label51
	aload_0 
	invokevirtual int getCursorPosition( net.rim.device.api.ui.component.RichTextField ) // pc=1
	aload_4 
	stringlength 
	if_icmpge Label51
	aload_4 
	aload_0 
	invokevirtual int getCursorPosition( net.rim.device.api.ui.component.RichTextField ) // pc=1
	stringaload 
	invokestatic boolean isEmojiLayout( char ) // EmojiUtil
	ifeq Label51
	goto Label28
Label51:
	iload 8
	ifeq Label58
	iload_7 
	iload_5 
	imul 
	istore_6 
	goto Label60
Label58:
	iinc 7 -1
	goto Label26
Label60:
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Field ) // pc=1
	iload_6 
	ireturn 
	}


protected final onFocus( com.whatsapp.client.EmojiActiveRichTextField, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	invokespecial_lib net.rim.device.api.ui.component.TextField.onFocus // pc=2
	aload_0 
	iipush 16908322
	iconst_0 
	invokevirtual boolean keyStatus( net.rim.device.api.ui.component.TextField, int, int ) // pc=3
	pop 
	return 
	}


protected final boolean keyChar( com.whatsapp.client.EmojiActiveRichTextField, char, int, int ); // address: 0
	{
	enter 
	iload_1 
	bipush 27
	if_icmpne Label11
	iload_2 
	ifne Label11
	aload_0 
	invokevirtual boolean isSelecting( net.rim.device.api.ui.component.TextField ) // pc=1
	ifne Label11
	iconst_0 
	ireturn 
Label11:
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	invokespecial_lib net.rim.device.api.ui.component.RichTextField.keyChar // pc=4
	ireturn 
	}


public final selectionCopy( com.whatsapp.client.EmojiActiveRichTextField, net.rim.device.api.system.Clipboard ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial com.whatsapp.client.EmojiActiveRichTextField.routine_2495 // pc=1
	aload_0 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.component.ActiveRichTextField.selectionCopy // pc=2
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.EmojiActiveRichTextField.routine_2560 // pc=2
	return 
	}


public final select( com.whatsapp.client.EmojiActiveRichTextField, boolean ); // address: 0
	{
	enter 
	iload_1 
	ifeq Label20
	aload_0 
	invokevirtual int getCursorPosition( net.rim.device.api.ui.component.RichTextField ) // pc=1
	istore_2 
	bipush -1
	istore_3 
	aload_0 
	iload_2 
	aload_0 
	iload_2 
	iload_3 
	invokespecial com.whatsapp.client.EmojiActiveRichTextField.routine_2419 // pc=3
	iadd 
	putfield com.whatsapp.client.EmojiActiveRichTextField.field_54208   // get_name_1:  com.whatsapp.client.EmojiActiveRichTextField.field_54208   // get_name_2:  com.whatsapp.client.EmojiActiveRichTextField.field_54208   // get_Name:    com.whatsapp.client.EmojiActiveRichTextField.field_54208   // getName->1:     // getName->2:     // getName->N:     // ofs = 54208 ord = 0 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.EmojiActiveRichTextField.field_54208   // get_name_1:  com.whatsapp.client.EmojiActiveRichTextField.field_54208   // get_name_2:  com.whatsapp.client.EmojiActiveRichTextField.field_54208   // get_Name:    com.whatsapp.client.EmojiActiveRichTextField.field_54208   // getName->1:     // getName->2:     // getName->N:     // ofs = 54208 ord = 0 addr = 0
	iconst_0 
	invokenonvirtual com.whatsapp.client.EmojiActiveRichTextField.setCursorPosition // pc=3
Label20:
	aload_0 
	iload_1 
	invokespecial_lib net.rim.device.api.ui.component.TextField.select // pc=2
	return 
	}

}
