// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-8.cod
// Module version  : 2.8.1914
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


abstract public final class BBMStyleInputField extends net.rim.device.api.ui.component.AutoTextEditField
implements com.whatsapp.client.

{
	// @@@@@@@@@@@@@ Static fields 
	private static net.rim.device.api.util.IntIntHashtable /*net.rim.device.api.util.IntIntHashtable*/  field_58964 ; // ofs = 58964 addr = 2)

	// @@@@@@@@@@@@@ Fields 
	public boolean /*boolean*/  _embargoed ; // ofs = 58936 addr = 0)
	private int /*int*/  field_58940 ; // ofs = 58940 addr = 0)
	private int /*int*/  field_58944 ; // ofs = 58944 addr = 0)
	public boolean /*boolean*/  _helpTextMode ; // ofs = 58948 addr = 0)
	private net.rim.device.api.ui.Font /*net.rim.device.api.ui.Font*/  field_58952 ; // ofs = 58952 addr = 0)
	private String /*java.lang.String*/  field_58956 ; // ofs = 58956 addr = 0)
	private int /*int*/  field_58960 ; // ofs = 58960 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.BBMStyleInputField, long ); // address: 0
	{
	enter 
	aload_0 
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	iipush 1000000
	lipush 1157425138593955840
	lload 1
	lor 
	invokespecial_lib net.rim.device.api.ui.component.AutoTextEditField.<init> // pc=6
	aload_0 
	iconst_0 
	putfield _embargoed   // get_name_1:  _embargoed   // get_name_2:  _embargoed   // get_Name:    _embargoed   // getName->1:  _embargoed   // getName->2:  _embargoed   // getName->N:  _embargoed   // ofs = 58936 ord = 0 addr = 0
	aload_0 
	iipush 1000000
	putfield com.whatsapp.client.BBMStyleInputField.field_58944   // get_name_1:  com.whatsapp.client.BBMStyleInputField.field_58944   // get_name_2:  com.whatsapp.client.BBMStyleInputField.field_58944   // get_Name:    com.whatsapp.client.BBMStyleInputField.field_58944   // getName->1:     // getName->2:     // getName->N:     // ofs = 58944 ord = 2 addr = 0
	aload_0 
	iconst_1 
	putfield _helpTextMode   // get_name_1:  _helpTextMode   // get_name_2:  _helpTextMode   // get_Name:    _helpTextMode   // getName->1:  _helpTextMode   // getName->2:  _helpTextMode   // getName->N:  _helpTextMode   // ofs = 58948 ord = 3 addr = 0
	aload_0 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	putfield com.whatsapp.client.BBMStyleInputField.field_58952   // get_name_1:  com.whatsapp.client.BBMStyleInputField.field_58952   // get_name_2:  com.whatsapp.client.BBMStyleInputField.field_58952   // get_Name:    com.whatsapp.client.BBMStyleInputField.field_58952   // getName->1:     // getName->2:     // getName->N:     // ofs = 58952 ord = 4 addr = 0
	aload_0 
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	putfield com.whatsapp.client.BBMStyleInputField.field_58956   // get_name_1:  com.whatsapp.client.BBMStyleInputField.field_58956   // get_name_2:  com.whatsapp.client.BBMStyleInputField.field_58956   // get_Name:    com.whatsapp.client.BBMStyleInputField.field_58956   // getName->1:     // getName->2:     // getName->N:     // ofs = 58956 ord = 5 addr = 0
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.BBMStyleInputField.field_58960   // get_name_1:  com.whatsapp.client.BBMStyleInputField.field_58960   // get_name_2:  com.whatsapp.client.BBMStyleInputField.field_58960   // get_Name:    com.whatsapp.client.BBMStyleInputField.field_58960   // getName->1:     // getName->2:     // getName->N:     // ofs = 58960 ord = 6 addr = 0
	return 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	clinit_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	synch_static BBMStyleInputField
	clinit_wait 
	new_lib net.rim.device.api.ui.component.AutoTextEditField//net.rim.device.api.ui.component.AutoTextEditField net.rim.device.api.ui.component.AutoTextEditField net.rim.device.api.ui.component.AutoTextEditField
	dup 
	bipush 2
	invokespecial_lib net.rim.device.api.util.IntIntHashtable.<init> // pc=2
	putstatic com.whatsapp.client.BBMStyleInputField.field_58964 // BBMStyleInputField
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final int com.whatsapp.client.BBMStyleInputField.routine_1248( com.whatsapp.client.BBMStyleInputField ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual int getLabelLength( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	istore_1 
	iload_1 
	ifle Label12
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	aload_0 
	invokevirtual java.lang.String getLabel( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	invokevirtual int getAdvance( net.rim.device.api.ui.Font, java.lang.String ) // pc=2
	ireturn 
Label12:
	iconst_0 
	ireturn 
	}


private final int com.whatsapp.client.BBMStyleInputField.routine_1293( com.whatsapp.client.BBMStyleInputField, int, int ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	astore_3 
	iload_2 
	iconst_1 
	if_icmpeq Label15
	iload_2 
	bipush -1
	if_icmpeq Label15
	new_lib net.rim.device.api.ui.FieldChangeListener//net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener
	dup 
	ldc literal_1374:"Direction must be 1 or -1"
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
	if_icmpge Label49
	iload_1 
	iload_4 
	iadd 
	iflt Label49
	aload_3 
	iload_1 
	iload_4 
	iadd 
	stringaload 
	sipush 8198
	if_icmpeq Label44
	aload_3 
	iload_1 
	iload_4 
	iadd 
	stringaload 
	sipush 8206
	if_icmpne Label49
	iload_2 
	bipush -1
	if_icmpne Label49
Label44:
	iload_4 
	iload_2 
	iadd 
	istore_4 
	goto Label17
Label49:
	iload_4 
	ireturn 
	}


private final com.whatsapp.client.BBMStyleInputField.routine_1383( com.whatsapp.client.BBMStyleInputField ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual int getCursorPosition( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	istore_1 
	aload_0 
	invokevirtual boolean isSelecting( net.rim.device.api.ui.component.TextField ) // pc=1
	ifeq Label11
	iload_1 
	aload_0_getfield com.whatsapp.client.BBMStyleInputField.field_58940   // get_name_1:  com.whatsapp.client.BBMStyleInputField.field_58940   // get_name_2:  com.whatsapp.client.BBMStyleInputField.field_58940   // get_Name:    com.whatsapp.client.BBMStyleInputField.field_58940   // getName->1:     // getName->2:     // getName->N:     // ofs = 58940 ord = 1 addr = 0
	if_icmpne Label11
	return 
Label11:
	aload_0 
	invokevirtual boolean isSelecting( net.rim.device.api.ui.component.TextField ) // pc=1
	ifeq Label17
	iload_1 
	aload_0_getfield com.whatsapp.client.BBMStyleInputField.field_58940   // get_name_1:  com.whatsapp.client.BBMStyleInputField.field_58940   // get_name_2:  com.whatsapp.client.BBMStyleInputField.field_58940   // get_Name:    com.whatsapp.client.BBMStyleInputField.field_58940   // getName->1:     // getName->2:     // getName->N:     // ofs = 58940 ord = 1 addr = 0
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
	invokespecial com.whatsapp.client.BBMStyleInputField.routine_1293 // pc=3
	iadd 
	istore_3 
	aload_0 
	iload_3 
	iconst_0 
	invokenonvirtual com.whatsapp.client.BBMStyleInputField.setCursorPosition // pc=3
	return 
	}


private final com.whatsapp.client.BBMStyleInputField.routine_1448( com.whatsapp.client.BBMStyleInputField, net.rim.device.api.system.Clipboard ); // address: 0
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
	invokestatic_lib module:WhatsApp-24.class#16.routine_4792(  ) // class#16
	invokevirtual java.lang.Object put( net.rim.device.api.system.Clipboard, java.lang.Object ) // pc=2
	pop 
Label13:
	return 
	}


private final com.whatsapp.client.BBMStyleInputField.routine_1491( com.whatsapp.client.BBMStyleInputField ); // address: 0
	{
	enter 
	aload_0 
	invokespecial com.whatsapp.client.BBMStyleInputField.routine_1531 // pc=1
	astore_1 
	aload_1 
	ifnull Label13
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	new_lib com.whatsapp.client.//module:WhatsApp-6.class#11 module:WhatsApp-6.class#11 module:WhatsApp-6.class#11
	dup 
	aload_0 
	aload_1 
	invokespecial_lib .routine_1954 // pc=3
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
Label13:
	return 
	}


private final java.lang.String com.whatsapp.client.BBMStyleInputField.routine_1531( com.whatsapp.client.BBMStyleInputField ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual int getTextLength( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	aload_0_getfield com.whatsapp.client.BBMStyleInputField.field_58944   // get_name_1:  com.whatsapp.client.BBMStyleInputField.field_58944   // get_name_2:  com.whatsapp.client.BBMStyleInputField.field_58944   // get_Name:    com.whatsapp.client.BBMStyleInputField.field_58944   // getName->1:     // getName->2:     // getName->N:     // ofs = 58944 ord = 2 addr = 0
	if_icmple Label17
	aload_0 
	invokenonvirtual com.whatsapp.client.BBMStyleInputField.getSmileyText // pc=1
	astore_1 
	aload_1 
	stringlength 
	aload_0_getfield com.whatsapp.client.BBMStyleInputField.field_58944   // get_name_1:  com.whatsapp.client.BBMStyleInputField.field_58944   // get_name_2:  com.whatsapp.client.BBMStyleInputField.field_58944   // get_Name:    com.whatsapp.client.BBMStyleInputField.field_58944   // getName->1:     // getName->2:     // getName->N:     // ofs = 58944 ord = 2 addr = 0
	if_icmple Label17
	aload_1 
	iconst_0 
	aload_0_getfield com.whatsapp.client.BBMStyleInputField.field_58944   // get_name_1:  com.whatsapp.client.BBMStyleInputField.field_58944   // get_name_2:  com.whatsapp.client.BBMStyleInputField.field_58944   // get_Name:    com.whatsapp.client.BBMStyleInputField.field_58944   // getName->1:     // getName->2:     // getName->N:     // ofs = 58944 ord = 2 addr = 0
	invokenonvirtual_lib java.lang.String.substring // pc=3
	areturn 
Label17:
	aconst_null 
	areturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final setHelpMessage( com.whatsapp.client.BBMStyleInputField, java.lang.String ); // address: 0
	{
	putfield_return com.whatsapp.client.BBMStyleInputField.field_58956   // get_name_1:  com.whatsapp.client.BBMStyleInputField.field_58956   // get_name_2:  com.whatsapp.client.BBMStyleInputField.field_58956   // get_Name:    com.whatsapp.client.BBMStyleInputField.field_58956   // getName->1:     // getName->2:     // getName->N:     // ofs = 58956 ord = 5 addr = 0
	}


public final showEmojiPopup( com.whatsapp.client.BBMStyleInputField ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-24.class#13.routine_3510(  ) // class#13
	istore_1 
	iload_1 
	ifeq Label13
	aload_0 
	iload_1 
	invokenonvirtual com.whatsapp.client.BBMStyleInputField.insertEmoji // pc=2
	aload_0 
	iconst_0 
	putfield _helpTextMode   // get_name_1:  _helpTextMode   // get_name_2:  _helpTextMode   // get_Name:    _helpTextMode   // getName->1:  _helpTextMode   // getName->2:  _helpTextMode   // getName->N:  _helpTextMode   // ofs = 58948 ord = 3 addr = 0
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Field ) // pc=1
Label13:
	return 
	}


public final calcHelpFont( com.whatsapp.client.BBMStyleInputField, int ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.BBMStyleInputField.field_58956   // get_name_1:  com.whatsapp.client.BBMStyleInputField.field_58956   // get_name_2:  com.whatsapp.client.BBMStyleInputField.field_58956   // get_Name:    com.whatsapp.client.BBMStyleInputField.field_58956   // getName->1:     // getName->2:     // getName->N:     // ofs = 58956 ord = 5 addr = 0
	astore_2 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	aload_2 
	invokevirtual int getAdvance( net.rim.device.api.ui.Font, java.lang.String ) // pc=2
	bipush 15
	iadd 
	iload_1 
	if_icmpge Label16
	aload_0 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	putfield com.whatsapp.client.BBMStyleInputField.field_58952   // get_name_1:  com.whatsapp.client.BBMStyleInputField.field_58952   // get_name_2:  com.whatsapp.client.BBMStyleInputField.field_58952   // get_Name:    com.whatsapp.client.BBMStyleInputField.field_58952   // getName->1:     // getName->2:     // getName->N:     // ofs = 58952 ord = 4 addr = 0
	return 
Label16:
	getstatic com.whatsapp.client.BBMStyleInputField.field_58964 // BBMStyleInputField
	iload_1 
	invokevirtual boolean containsKey( net.rim.device.api.util.IntIntHashtable, int ) // pc=2
	ifeq Label30
	aload_0 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	iconst_0 
	getstatic com.whatsapp.client.BBMStyleInputField.field_58964 // BBMStyleInputField
	iload_1 
	invokevirtual int get( net.rim.device.api.util.IntIntHashtable, int ) // pc=2
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int, int ) // pc=3
	putfield com.whatsapp.client.BBMStyleInputField.field_58952   // get_name_1:  com.whatsapp.client.BBMStyleInputField.field_58952   // get_name_2:  com.whatsapp.client.BBMStyleInputField.field_58952   // get_Name:    com.whatsapp.client.BBMStyleInputField.field_58952   // getName->1:     // getName->2:     // getName->N:     // ofs = 58952 ord = 4 addr = 0
	return 
Label30:
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	astore_3 
	bipush 50
	istore_4 
Label35:
	iload_4 
	bipush 10
	if_icmple Label56
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	iconst_0 
	iload_4 
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int, int ) // pc=3
	astore_3 
	aload_3 
	aload_2 
	invokevirtual int getAdvance( net.rim.device.api.ui.Font, java.lang.String ) // pc=2
	bipush 15
	iadd 
	istore_5 
	iload_5 
	iload_1 
	if_icmpge Label54
	goto Label56
Label54:
	iinc 4 -1
	goto Label35
Label56:
	getstatic com.whatsapp.client.BBMStyleInputField.field_58964 // BBMStyleInputField
	iload_1 
	iload_4 
	invokevirtual int put( net.rim.device.api.util.IntIntHashtable, int, int ) // pc=3
	pop 
	aload_0 
	aload_3 
	putfield com.whatsapp.client.BBMStyleInputField.field_58952   // get_name_1:  com.whatsapp.client.BBMStyleInputField.field_58952   // get_name_2:  com.whatsapp.client.BBMStyleInputField.field_58952   // get_Name:    com.whatsapp.client.BBMStyleInputField.field_58952   // getName->1:     // getName->2:     // getName->N:     // ofs = 58952 ord = 4 addr = 0
	return 
	}


public final java.lang.String getSmileyText( com.whatsapp.client.BBMStyleInputField ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	invokestatic_lib module:WhatsApp-24.class#16.routine_4792(  ) // class#16
	areturn 
	}


public final setEmojiText( com.whatsapp.client.BBMStyleInputField, java.lang.String ); // address: 0
	{
	enter 
	aload_1 
	ifnonnull Label7
	aload_0 
	aconst_null 
	invokevirtual setText( net.rim.device.api.ui.component.BasicEditField, java.lang.String ) // pc=2
	return 
Label7:
	new_lib net.rim.device.api.ui.XYEdges//net.rim.device.api.ui.XYEdges net.rim.device.api.ui.XYEdges net.rim.device.api.ui.XYEdges
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	astore_2 
	aload_1 
	stringlength 
	istore_3 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	astore_4 
	iconst_0 
	istore_5 
Label19:
	iload_5 
	iload_3 
	if_icmpge Label30
	aload_4 
	aload_2 
	aload_1 
	iload_5 
	stringaload 
	invokestatic_lib module:WhatsApp-24.class#16.routine_3888(  ) // class#16
	iinc 5 1
	goto Label19
Label30:
	aload_0 
	aload_2 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual setText( net.rim.device.api.ui.component.BasicEditField, java.lang.String ) // pc=2
	return 
	}


public final insertEmoji( com.whatsapp.client.BBMStyleInputField, char ); // address: 0
	{
	enter_narrow 
	new_lib net.rim.device.api.ui.XYEdges//net.rim.device.api.ui.XYEdges net.rim.device.api.ui.XYEdges net.rim.device.api.ui.XYEdges
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	astore_2 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	aload_2 
	iload_1 
	invokestatic_lib module:WhatsApp-24.class#16.routine_3888(  ) // class#16
	aload_0 
	aload_2 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual int insert( net.rim.device.api.ui.component.BasicEditField, java.lang.String ) // pc=2
	pop 
	return 
	}


public final int drawTextOriginal( com.whatsapp.client.BBMStyleInputField, net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.ui.DrawTextParam ); // address: 0
	{
	jumpspecial_lib int drawText( net.rim.device.api.ui.component.TextField, net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.ui.DrawTextParam )
	}


public final int getLabelColor( com.whatsapp.client.BBMStyleInputField ); // address: 0
	{
	ireturn_field com.whatsapp.client.BBMStyleInputField.field_58960   // get_name_1:  com.whatsapp.client.BBMStyleInputField.field_58960   // get_name_2:  com.whatsapp.client.BBMStyleInputField.field_58960   // get_Name:    com.whatsapp.client.BBMStyleInputField.field_58960   // getName->1:     // getName->2:     // getName->N:     // ofs = 58960 ord = 6 addr = 0
	}


protected final onFocus( com.whatsapp.client.BBMStyleInputField, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _helpTextMode   // get_name_1:  _helpTextMode   // get_name_2:  _helpTextMode   // get_Name:    _helpTextMode   // getName->1:  _helpTextMode   // getName->2:  _helpTextMode   // getName->N:  _helpTextMode   // ofs = 58948 ord = 3 addr = 0
	ifeq Label7
	aload_0 
	iconst_0 
	putfield _helpTextMode   // get_name_1:  _helpTextMode   // get_name_2:  _helpTextMode   // get_Name:    _helpTextMode   // getName->1:  _helpTextMode   // getName->2:  _helpTextMode   // getName->N:  _helpTextMode   // ofs = 58948 ord = 3 addr = 0
	goto Label11
Label7:
	aload_0 
	aload_0 
	invokevirtual int getTextLength( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	invokevirtual setCursorPosition( net.rim.device.api.ui.component.BasicEditField, int ) // pc=2
Label11:
	aload_0 
	iload_1 
	invokespecial_lib net.rim.device.api.ui.component.TextField.onFocus // pc=2
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Field ) // pc=1
	return 
	}


protected final displayFieldFullMessage( com.whatsapp.client.BBMStyleInputField ); // address: 0
	{
	noenter_return 
	}


protected final layout( com.whatsapp.client.BBMStyleInputField, int, int ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual int getContentHeight( net.rim.device.api.ui.Field ) // pc=1
	istore_3 
	aload_0 
	iload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.component.BasicEditField.layout // pc=3
	aload_0 
	iload_1 
	invokenonvirtual com.whatsapp.client.BBMStyleInputField.calcHelpFont // pc=2
	aload_0_getfield _helpTextMode   // get_name_1:  _helpTextMode   // get_name_2:  _helpTextMode   // get_Name:    _helpTextMode   // getName->1:  _helpTextMode   // getName->2:  _helpTextMode   // getName->N:  _helpTextMode   // ofs = 58948 ord = 3 addr = 0
	ifeq Label22
	iload_3 
	aload_0 
	invokevirtual int getContentHeight( net.rim.device.api.ui.Field ) // pc=1
	if_icmple Label22
	aload_0 
	aload_0 
	invokevirtual int getContentWidth( net.rim.device.api.ui.Field ) // pc=1
	iload_3 
	invokevirtual setExtent( net.rim.device.api.ui.Field, int, int ) // pc=3
Label22:
	return 
	}


protected final onUnfocus( com.whatsapp.client.BBMStyleInputField ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _embargoed   // get_name_1:  _embargoed   // get_name_2:  _embargoed   // get_Name:    _embargoed   // getName->1:  _embargoed   // getName->2:  _embargoed   // getName->N:  _embargoed   // ofs = 58936 ord = 0 addr = 0
	ifne Label10
	aload_0 
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	stringlength 
	ifne Label10
	aload_0 
	iconst_1 
	putfield _helpTextMode   // get_name_1:  _helpTextMode   // get_name_2:  _helpTextMode   // get_Name:    _helpTextMode   // getName->1:  _helpTextMode   // getName->2:  _helpTextMode   // getName->N:  _helpTextMode   // ofs = 58948 ord = 3 addr = 0
Label10:
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Field ) // pc=1
	return 
	}


public final int drawText( com.whatsapp.client.BBMStyleInputField, net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.ui.DrawTextParam ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	iload_2 
	iload_3 
	iload_4 
	iload_5 
	aload_6 
	invokestatic_lib module:WhatsApp-24.class#16.routine_5084(  ) // class#16
	ireturn 
	}


protected final setCursorPosition( com.whatsapp.client.BBMStyleInputField, int, int ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	astore_3 
Label4:
	iload_1 
	aload_3 
	stringlength 
	if_icmpge Label15
	aload_3 
	iload_1 
	stringaload 
	invokestatic_lib module:WhatsApp-24.class#16.routine_4853(  ) // class#16
	ifeq Label15
	iinc 1 -1
	goto Label4
Label15:
	aload_0 
	iload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.component.BasicEditField.setCursorPosition // pc=3
	return 
	}


public final int moveFocus( com.whatsapp.client.BBMStyleInputField, int, int, int ); // address: 0
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
	invokespecial_lib net.rim.device.api.ui.component.AutoTextEditField.moveFocus // pc=4
	ireturn 
Label11:
	aload_0 
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.BasicEditField ) // pc=1
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
	invokespecial_lib net.rim.device.api.ui.component.AutoTextEditField.moveFocus // pc=4
	dup 
	istore 8
	ifne Label51
	aload_0 
	invokevirtual int getCursorPosition( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	iflt Label51
	aload_0 
	invokevirtual int getCursorPosition( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	aload_4 
	stringlength 
	if_icmpge Label51
	aload_4 
	aload_0 
	invokevirtual int getCursorPosition( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	stringaload 
	invokestatic_lib module:WhatsApp-24.class#16.routine_4853(  ) // class#16
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


public final selectionCopy( com.whatsapp.client.BBMStyleInputField, net.rim.device.api.system.Clipboard ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial com.whatsapp.client.BBMStyleInputField.routine_1383 // pc=1
	aload_0 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.component.TextField.selectionCopy // pc=2
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.BBMStyleInputField.routine_1448 // pc=2
	return 
	}


public final selectionCut( com.whatsapp.client.BBMStyleInputField, net.rim.device.api.system.Clipboard ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial com.whatsapp.client.BBMStyleInputField.routine_1383 // pc=1
	aload_0 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.Field.selectionCut // pc=2
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.BBMStyleInputField.routine_1448 // pc=2
	return 
	}


public final selectionDelete( com.whatsapp.client.BBMStyleInputField ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial com.whatsapp.client.BBMStyleInputField.routine_1383 // pc=1
	aload_0 
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	astore_1 
	aload_0 
	invokevirtual int getCursorPosition( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	istore_2 
	aload_0 
	invokevirtual boolean isSelecting( net.rim.device.api.ui.component.TextField ) // pc=1
	ifne Label40
	aload_1 
	stringlength 
	ifle Label40
	iload_2 
	aload_1 
	stringlength 
	if_icmpgt Label40
	aload_1 
	iload_2 
	stringaload 
	invokestatic_lib module:WhatsApp-24.class#16.routine_20663(  ) // class#16
	ifeq Label40
	aload_0 
	invokespecial_lib net.rim.device.api.ui.component.AutoTextEditField.selectionDelete // pc=1
	iinc 2 1
Label27:
	iload_2 
	aload_1 
	stringlength 
	if_icmpge Label42
	aload_1 
	iload_2 
	stringaload 
	invokestatic_lib module:WhatsApp-24.class#16.routine_4853(  ) // class#16
	ifeq Label42
	iinc 2 1
	aload_0 
	invokespecial_lib net.rim.device.api.ui.component.AutoTextEditField.selectionDelete // pc=1
	goto Label27
Label40:
	aload_0 
	invokespecial_lib net.rim.device.api.ui.component.AutoTextEditField.selectionDelete // pc=1
Label42:
	return 
	}


protected final boolean backspace( com.whatsapp.client.BBMStyleInputField ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial com.whatsapp.client.BBMStyleInputField.routine_1383 // pc=1
	aload_0 
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	astore_1 
	aload_0 
	invokevirtual int getCursorPosition( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	iconst_1 
	isub 
	istore_2 
Label11:
	iload_2 
	iflt Label23
	aload_1 
	iload_2 
	stringaload 
	invokestatic_lib module:WhatsApp-24.class#16.routine_4853(  ) // class#16
	ifeq Label23
	iinc 2 -1
	aload_0 
	invokespecial_lib net.rim.device.api.ui.component.AutoTextEditField.backspace // pc=1
	pop 
	goto Label11
Label23:
	aload_0 
	invokespecial_lib net.rim.device.api.ui.component.AutoTextEditField.backspace // pc=1
	ireturn 
	}


protected final paint( com.whatsapp.client.BBMStyleInputField, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter 
	aload_0_getfield _helpTextMode   // get_name_1:  _helpTextMode   // get_name_2:  _helpTextMode   // get_Name:    _helpTextMode   // getName->1:  _helpTextMode   // getName->2:  _helpTextMode   // getName->N:  _helpTextMode   // ofs = 58948 ord = 3 addr = 0
	ifeq Label28
	aload_0 
	invokespecial com.whatsapp.client.BBMStyleInputField.routine_1248 // pc=1
	istore_2 
	iload_2 
	ifle Label11
	aload_0 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.component.BasicEditField.paint // pc=2
Label11:
	aload_1 
	iipush 8421504
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.BBMStyleInputField.field_58952   // get_name_1:  com.whatsapp.client.BBMStyleInputField.field_58952   // get_name_2:  com.whatsapp.client.BBMStyleInputField.field_58952   // get_Name:    com.whatsapp.client.BBMStyleInputField.field_58952   // getName->1:     // getName->2:     // getName->N:     // ofs = 58952 ord = 4 addr = 0
	invokevirtual setFont( net.rim.device.api.ui.Graphics, net.rim.device.api.ui.Font ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.BBMStyleInputField.field_58956   // get_name_1:  com.whatsapp.client.BBMStyleInputField.field_58956   // get_name_2:  com.whatsapp.client.BBMStyleInputField.field_58956   // get_Name:    com.whatsapp.client.BBMStyleInputField.field_58956   // getName->1:     // getName->2:     // getName->N:     // ofs = 58956 ord = 5 addr = 0
	iload_2 
	aload_0 
	invokevirtual int getContentHeight( net.rim.device.api.ui.Field ) // pc=1
	iconst_1 
	iushr 
	bipush 38
	invokevirtual int drawText( net.rim.device.api.ui.Graphics, java.lang.String, int, int, int ) // pc=5
	pop 
	return 
Label28:
	aload_1 
	iconst_0 
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_0 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.component.BasicEditField.paint // pc=2
	return 
	}


public final select( com.whatsapp.client.BBMStyleInputField, boolean ); // address: 0
	{
	enter 
	iload_1 
	ifeq Label20
	aload_0 
	invokevirtual int getCursorPosition( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	istore_2 
	bipush -1
	istore_3 
	aload_0 
	iload_2 
	aload_0 
	iload_2 
	iload_3 
	invokespecial com.whatsapp.client.BBMStyleInputField.routine_1293 // pc=3
	iadd 
	putfield com.whatsapp.client.BBMStyleInputField.field_58940   // get_name_1:  com.whatsapp.client.BBMStyleInputField.field_58940   // get_name_2:  com.whatsapp.client.BBMStyleInputField.field_58940   // get_Name:    com.whatsapp.client.BBMStyleInputField.field_58940   // getName->1:     // getName->2:     // getName->N:     // ofs = 58940 ord = 1 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.BBMStyleInputField.field_58940   // get_name_1:  com.whatsapp.client.BBMStyleInputField.field_58940   // get_name_2:  com.whatsapp.client.BBMStyleInputField.field_58940   // get_Name:    com.whatsapp.client.BBMStyleInputField.field_58940   // getName->1:     // getName->2:     // getName->N:     // ofs = 58940 ord = 1 addr = 0
	iconst_0 
	invokenonvirtual com.whatsapp.client.BBMStyleInputField.setCursorPosition // pc=3
Label20:
	aload_0 
	iload_1 
	invokespecial_lib net.rim.device.api.ui.component.TextField.select // pc=2
	return 
	}


public final boolean paste( com.whatsapp.client.BBMStyleInputField, net.rim.device.api.system.Clipboard ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual java.lang.Object get( net.rim.device.api.system.Clipboard ) // pc=1
	astore_2 
	aload_2 
	instanceof_lib String//java.lang.String java.lang.String java.lang.String
	ifne Label9
	iconst_0 
	ireturn 
Label9:
	aload_2 
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore_3 
	new_lib net.rim.device.api.ui.XYEdges//net.rim.device.api.ui.XYEdges net.rim.device.api.ui.XYEdges net.rim.device.api.ui.XYEdges
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	astore_4 
	iconst_0 
	istore_5 
Label18:
	iload_5 
	aload_3 
	stringlength 
	if_icmpge Label31
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	aload_4 
	aload_3 
	iload_5 
	stringaload 
	invokestatic_lib module:WhatsApp-24.class#16.routine_3888(  ) // class#16
	iinc 5 1
	goto Label18
Label31:
	aload_1 
	aload_4 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.Object put( net.rim.device.api.system.Clipboard, java.lang.Object ) // pc=2
	pop 
	aload_0 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.component.BasicEditField.paste // pc=2
	istore_5 
	aload_1 
	aload_2 
	invokevirtual java.lang.Object put( net.rim.device.api.system.Clipboard, java.lang.Object ) // pc=2
	pop 
	iload_5 
	ireturn 
	}


public final setMaxSize( com.whatsapp.client.BBMStyleInputField, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	putfield com.whatsapp.client.BBMStyleInputField.field_58944   // get_name_1:  com.whatsapp.client.BBMStyleInputField.field_58944   // get_name_2:  com.whatsapp.client.BBMStyleInputField.field_58944   // get_Name:    com.whatsapp.client.BBMStyleInputField.field_58944   // getName->1:     // getName->2:     // getName->N:     // ofs = 58944 ord = 2 addr = 0
	aload_0 
	invokespecial com.whatsapp.client.BBMStyleInputField.routine_1491 // pc=1
	return 
	}


public final int getMaxSize( com.whatsapp.client.BBMStyleInputField ); // address: 0
	{
	ireturn_field com.whatsapp.client.BBMStyleInputField.field_58944   // get_name_1:  com.whatsapp.client.BBMStyleInputField.field_58944   // get_name_2:  com.whatsapp.client.BBMStyleInputField.field_58944   // get_Name:    com.whatsapp.client.BBMStyleInputField.field_58944   // getName->1:     // getName->2:     // getName->N:     // ofs = 58944 ord = 2 addr = 0
	}


protected final update( com.whatsapp.client.BBMStyleInputField, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	invokespecial_lib net.rim.device.api.ui.component.AutoTextEditField.update // pc=2
	iload_1 
	ifle Label8
	aload_0 
	invokespecial com.whatsapp.client.BBMStyleInputField.routine_1491 // pc=1
Label8:
	return 
	}

}
