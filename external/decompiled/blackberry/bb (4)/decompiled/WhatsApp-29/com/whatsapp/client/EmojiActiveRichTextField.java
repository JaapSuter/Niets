// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-15.cod
// Module version  : 2.7.3204
// Class ID        : 1
// ########################################################


package com.whatsapp.client;


abstract public final class EmojiActiveRichTextField extends net.rim.device.api.ui.component.ActiveRichTextField
implements com.whatsapp.client.EmojiUtil$EmojiDrawable

{

	// @@@@@@@@@@@@@ Fields 
	private int /*int*/  field_53626 ; // ofs = 53626 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.EmojiActiveRichTextField, java.lang.String, long ); // address: 0
	{
	enter 
	aload_0 
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	lload 2
	invokespecial_lib net.rim.device.api.ui.component.ActiveRichTextField.<init> // pc=4
	aload_0 
	aload_1 
	invokenonvirtual com.whatsapp.client.EmojiActiveRichTextField.setText // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final int[] com.whatsapp.client.EmojiActiveRichTextField.routine_548( com.whatsapp.client.EmojiActiveRichTextField, java.lang.String ); // address: 0
	{
	enter 
	new_lib net.rim.device.api.ui.Graphics//net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics
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


private final java.lang.String com.whatsapp.client.EmojiActiveRichTextField.routine_666( com.whatsapp.client.EmojiActiveRichTextField, java.lang.String ); // address: 0
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


private final int com.whatsapp.client.EmojiActiveRichTextField.routine_728( com.whatsapp.client.EmojiActiveRichTextField, int, int ); // address: 0
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
	new_lib net.rim.device.api.ui.component.Menu//net.rim.device.api.ui.component.Menu net.rim.device.api.ui.component.Menu net.rim.device.api.ui.component.Menu
	dup 
	ldc literal_529:"Direction must be 1 or -1"
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


private final com.whatsapp.client.EmojiActiveRichTextField.routine_804( com.whatsapp.client.EmojiActiveRichTextField ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual int getCursorPosition( net.rim.device.api.ui.component.RichTextField ) // pc=1
	istore_1 
	aload_0 
	invokevirtual boolean isSelecting( net.rim.device.api.ui.component.TextField ) // pc=1
	ifeq Label11
	iload_1 
	aload_0_getfield com.whatsapp.client.EmojiActiveRichTextField.field_53626   // get_name_1:  com.whatsapp.client.EmojiActiveRichTextField.field_53626   // get_name_2:  com.whatsapp.client.EmojiActiveRichTextField.field_53626   // get_Name:    com.whatsapp.client.EmojiActiveRichTextField.field_53626   // getName->1:     // getName->2:     // getName->N:     // ofs = 53626 ord = 0 addr = 0
	if_icmpne Label11
	return 
Label11:
	aload_0 
	invokevirtual boolean isSelecting( net.rim.device.api.ui.component.TextField ) // pc=1
	ifeq Label17
	iload_1 
	aload_0_getfield com.whatsapp.client.EmojiActiveRichTextField.field_53626   // get_name_1:  com.whatsapp.client.EmojiActiveRichTextField.field_53626   // get_name_2:  com.whatsapp.client.EmojiActiveRichTextField.field_53626   // get_Name:    com.whatsapp.client.EmojiActiveRichTextField.field_53626   // getName->1:     // getName->2:     // getName->N:     // ofs = 53626 ord = 0 addr = 0
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
	invokespecial com.whatsapp.client.EmojiActiveRichTextField.routine_728 // pc=3
	iadd 
	istore_3 
	aload_0 
	iload_3 
	iconst_0 
	invokenonvirtual com.whatsapp.client.EmojiActiveRichTextField.setCursorPosition // pc=3
	return 
	}


private final com.whatsapp.client.EmojiActiveRichTextField.routine_869( com.whatsapp.client.EmojiActiveRichTextField, net.rim.device.api.system.Clipboard ); // address: 0
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

public final setText( com.whatsapp.client.EmojiActiveRichTextField, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.EmojiActiveRichTextField.routine_666 // pc=2
	astore_2 
	iconst_1 
	newarray_object_lib net.rim.device.api.ui.Font//net.rim.device.api.ui.Font net.rim.device.api.ui.Font net.rim.device.api.ui.Font
	astore_3 
	aload_3 
	iconst_0 
	aconst_null 
	aastore 
	aload_0 
	aload_2 
	invokespecial com.whatsapp.client.EmojiActiveRichTextField.routine_548 // pc=2
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
	}


public final int getLabelColor( com.whatsapp.client.EmojiActiveRichTextField ); // address: 0
	{
	ireturn_bipush 0
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
	invokestatic int drawText( module:WhatsApp-14.class#20, net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.ui.DrawTextParam ) // EmojiUtil
	ireturn 
	}


public final int drawTextOriginal( com.whatsapp.client.EmojiActiveRichTextField, net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.ui.DrawTextParam ); // address: 0
	{
	jumpspecial_lib int drawText( net.rim.device.api.ui.component.TextField, net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.ui.DrawTextParam )
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
	invokespecial com.whatsapp.client.EmojiActiveRichTextField.routine_804 // pc=1
	aload_0 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.component.ActiveRichTextField.selectionCopy // pc=2
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.EmojiActiveRichTextField.routine_869 // pc=2
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
	invokespecial com.whatsapp.client.EmojiActiveRichTextField.routine_728 // pc=3
	iadd 
	putfield com.whatsapp.client.EmojiActiveRichTextField.field_53626   // get_name_1:  com.whatsapp.client.EmojiActiveRichTextField.field_53626   // get_name_2:  com.whatsapp.client.EmojiActiveRichTextField.field_53626   // get_Name:    com.whatsapp.client.EmojiActiveRichTextField.field_53626   // getName->1:     // getName->2:     // getName->N:     // ofs = 53626 ord = 0 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.EmojiActiveRichTextField.field_53626   // get_name_1:  com.whatsapp.client.EmojiActiveRichTextField.field_53626   // get_name_2:  com.whatsapp.client.EmojiActiveRichTextField.field_53626   // get_Name:    com.whatsapp.client.EmojiActiveRichTextField.field_53626   // getName->1:     // getName->2:     // getName->N:     // ofs = 53626 ord = 0 addr = 0
	iconst_0 
	invokenonvirtual com.whatsapp.client.EmojiActiveRichTextField.setCursorPosition // pc=3
Label20:
	aload_0 
	iload_1 
	invokespecial_lib net.rim.device.api.ui.component.TextField.select // pc=2
	return 
	}

}
