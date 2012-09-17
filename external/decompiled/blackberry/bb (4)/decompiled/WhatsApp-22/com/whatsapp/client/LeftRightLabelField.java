// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-21.cod
// Module version  : 2.7.3204
// Class ID        : 4
// ########################################################


package com.whatsapp.client;


public class LeftRightLabelField extends net.rim.device.api.ui.Field

{

	// @@@@@@@@@@@@@ Fields 
	private String /*java.lang.String*/  field_56724 ; // ofs = 56724 addr = 0)
	private String /*java.lang.String*/  field_56728 ; // ofs = 56728 addr = 0)
	private net.rim.device.api.ui.Font /*net.rim.device.api.ui.Font*/  field_56732 ; // ofs = 56732 addr = 0)
	private net.rim.device.api.ui.Font /*net.rim.device.api.ui.Font*/  field_56736 ; // ofs = 56736 addr = 0)
	private Integer /*java.lang.Integer*/  field_56740 ; // ofs = 56740 addr = 0)
	private Integer /*java.lang.Integer*/  field_56744 ; // ofs = 56744 addr = 0)
	private boolean /*boolean*/  field_56748 ; // ofs = 56748 addr = 0)
	private int /*int*/  field_56752 ; // ofs = 56752 addr = 0)
	private int /*int*/  field_56756 ; // ofs = 56756 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.LeftRightLabelField, java.lang.String, net.rim.device.api.ui.Font ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	aload_2 
	iconst_0 
	i2l 
	invokespecial com.whatsapp.client.LeftRightLabelField.<init> // pc=5
	return 
	}


public <init>( com.whatsapp.client.LeftRightLabelField, java.lang.String, net.rim.device.api.ui.Font, long ); // address: 0
	{
	enter 
	aload_0 
	lload 3
	invokespecial_lib net.rim.device.api.ui.Field.<init> // pc=3
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.LeftRightLabelField.field_56748   // get_name_1:  com.whatsapp.client.LeftRightLabelField.field_56748   // get_name_2:  com.whatsapp.client.LeftRightLabelField.field_56748   // get_Name:    com.whatsapp.client.LeftRightLabelField.field_56748   // getName->1:     // getName->2:     // getName->N:     // ofs = 56748 ord = 6 addr = 0
	aload_0 
	aload_1 
	putfield com.whatsapp.client.LeftRightLabelField.field_56724   // get_name_1:  com.whatsapp.client.LeftRightLabelField.field_56724   // get_name_2:  com.whatsapp.client.LeftRightLabelField.field_56724   // get_Name:    com.whatsapp.client.LeftRightLabelField.field_56724   // getName->1:     // getName->2:     // getName->N:     // ofs = 56724 ord = 0 addr = 0
	aload_0 
	aload_2 
	putfield com.whatsapp.client.LeftRightLabelField.field_56732   // get_name_1:  com.whatsapp.client.LeftRightLabelField.field_56732   // get_name_2:  com.whatsapp.client.LeftRightLabelField.field_56732   // get_Name:    com.whatsapp.client.LeftRightLabelField.field_56732   // getName->1:     // getName->2:     // getName->N:     // ofs = 56732 ord = 2 addr = 0
	aload_0 
	aload_2 
	putfield com.whatsapp.client.LeftRightLabelField.field_56736   // get_name_1:  com.whatsapp.client.LeftRightLabelField.field_56736   // get_name_2:  com.whatsapp.client.LeftRightLabelField.field_56736   // get_Name:    com.whatsapp.client.LeftRightLabelField.field_56736   // getName->1:     // getName->2:     // getName->N:     // ofs = 56736 ord = 3 addr = 0
	return 
	}


static public com.whatsapp.client.LeftRightLabelField createSeparatorLabel( net.rim.device.api.ui.Font, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	iconst_0 
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	bipush 80
	imul 
	bipush 100
	idiv 
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int, int ) // pc=3
	astore_3 
	new LeftRightLabelField
	dup 
	aload_1 
	aload_3 
	lipush 1152921504606846976
	invokespecial com.whatsapp.client.LeftRightLabelField.<init> // pc=5
	astore_4 
	aload_4 
	new_lib Integer//java.lang.Integer java.lang.Integer java.lang.Integer
	dup 
	iipush 5265246
	invokespecial_lib java.lang.Integer.<init> // pc=2
	invokenonvirtual com.whatsapp.client.LeftRightLabelField.setLeftColor // pc=2
	aload_4 
	aload_2 
	invokenonvirtual com.whatsapp.client.LeftRightLabelField.setRightText // pc=2
	aload_4 
	new_lib Integer//java.lang.Integer java.lang.Integer java.lang.Integer
	dup 
	iipush 9014931
	invokespecial_lib java.lang.Integer.<init> // pc=2
	invokenonvirtual com.whatsapp.client.LeftRightLabelField.setRightColor // pc=2
	aload_4 
	aload_3 
	invokenonvirtual com.whatsapp.client.LeftRightLabelField.setRightFont // pc=2
	aload_4 
	bipush 6
	bipush 18
	bipush 6
	bipush 18
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_4 
	getstatic_lib module:WhatsApp-7.class#22.static_49 // class#22
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	aload_4 
	new_lib net.rim.device.api.ui.component.LabelField//net.rim.device.api.ui.component.LabelField net.rim.device.api.ui.component.LabelField net.rim.device.api.ui.component.LabelField
	dup 
	iconst_1 
	iconst_0 
	iconst_0 
	iconst_0 
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=5
	new_lib net.rim.device.api.ui.component.LabelField//net.rim.device.api.ui.component.LabelField net.rim.device.api.ui.component.LabelField net.rim.device.api.ui.component.LabelField
	dup 
	iipush 16316664
	iconst_0 
	iconst_0 
	iconst_0 
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=5
	bipush 4
	invokestatic_lib net.rim.device.api.ui.decor.Border createSimpleBorder( net.rim.device.api.ui.XYEdges, net.rim.device.api.ui.XYEdges, int ) // BorderFactory
	invokevirtual setBorder( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Border ) // pc=2
	aload_4 
	areturn 
	}


static public com.whatsapp.client.LeftRightLabelField createHeadingLabel( net.rim.device.api.ui.Font, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	iconst_0 
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	bipush 80
	imul 
	bipush 100
	idiv 
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int, int ) // pc=3
	astore_3 
	new LeftRightLabelField
	dup 
	aload_1 
	aload_3 
	lipush 1152921504606846976
	invokespecial com.whatsapp.client.LeftRightLabelField.<init> // pc=5
	astore_4 
	aload_4 
	aload_3 
	iconst_1 
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int ) // pc=2
	invokenonvirtual com.whatsapp.client.LeftRightLabelField.setLeftFont // pc=2
	aload_4 
	new_lib Integer//java.lang.Integer java.lang.Integer java.lang.Integer
	dup 
	iipush 5265246
	invokespecial_lib java.lang.Integer.<init> // pc=2
	invokenonvirtual com.whatsapp.client.LeftRightLabelField.setLeftColor // pc=2
	aload_4 
	aload_2 
	invokenonvirtual com.whatsapp.client.LeftRightLabelField.setRightText // pc=2
	aload_4 
	new_lib Integer//java.lang.Integer java.lang.Integer java.lang.Integer
	dup 
	iipush 9014931
	invokespecial_lib java.lang.Integer.<init> // pc=2
	invokenonvirtual com.whatsapp.client.LeftRightLabelField.setRightColor // pc=2
	aload_4 
	aload_3 
	invokenonvirtual com.whatsapp.client.LeftRightLabelField.setRightFont // pc=2
	aload_4 
	bipush 10
	bipush 8
	bipush 6
	bipush 2
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_4 
	iconst_0 
	bipush 10
	iconst_0 
	bipush 16
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_4 
	getstatic_lib module:WhatsApp-7.class#22.static_58 // class#22
	invokevirtual setBorder( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Border ) // pc=2
	aload_4 
	areturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public setLeftText( com.whatsapp.client.LeftRightLabelField, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	putfield com.whatsapp.client.LeftRightLabelField.field_56724   // get_name_1:  com.whatsapp.client.LeftRightLabelField.field_56724   // get_name_2:  com.whatsapp.client.LeftRightLabelField.field_56724   // get_Name:    com.whatsapp.client.LeftRightLabelField.field_56724   // getName->1:     // getName->2:     // getName->N:     // ofs = 56724 ord = 0 addr = 0
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Field ) // pc=1
	return 
	}


public setRightText( com.whatsapp.client.LeftRightLabelField, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	putfield com.whatsapp.client.LeftRightLabelField.field_56728   // get_name_1:  com.whatsapp.client.LeftRightLabelField.field_56728   // get_name_2:  com.whatsapp.client.LeftRightLabelField.field_56728   // get_Name:    com.whatsapp.client.LeftRightLabelField.field_56728   // getName->1:     // getName->2:     // getName->N:     // ofs = 56728 ord = 1 addr = 0
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Field ) // pc=1
	return 
	}


public setLeftFont( com.whatsapp.client.LeftRightLabelField, net.rim.device.api.ui.Font ); // address: 0
	{
	putfield_return com.whatsapp.client.LeftRightLabelField.field_56732   // get_name_1:  com.whatsapp.client.LeftRightLabelField.field_56732   // get_name_2:  com.whatsapp.client.LeftRightLabelField.field_56732   // get_Name:    com.whatsapp.client.LeftRightLabelField.field_56732   // getName->1:     // getName->2:     // getName->N:     // ofs = 56732 ord = 2 addr = 0
	}


public setRightFont( com.whatsapp.client.LeftRightLabelField, net.rim.device.api.ui.Font ); // address: 0
	{
	putfield_return com.whatsapp.client.LeftRightLabelField.field_56736   // get_name_1:  com.whatsapp.client.LeftRightLabelField.field_56736   // get_name_2:  com.whatsapp.client.LeftRightLabelField.field_56736   // get_Name:    com.whatsapp.client.LeftRightLabelField.field_56736   // getName->1:     // getName->2:     // getName->N:     // ofs = 56736 ord = 3 addr = 0
	}


public setUseColorAlpha( com.whatsapp.client.LeftRightLabelField, boolean ); // address: 0
	{
	putfield_return com.whatsapp.client.LeftRightLabelField.field_56748   // get_name_1:  com.whatsapp.client.LeftRightLabelField.field_56748   // get_name_2:  com.whatsapp.client.LeftRightLabelField.field_56748   // get_Name:    com.whatsapp.client.LeftRightLabelField.field_56748   // getName->1:     // getName->2:     // getName->N:     // ofs = 56748 ord = 6 addr = 0
	}


public setRightColor( com.whatsapp.client.LeftRightLabelField, java.lang.Integer ); // address: 0
	{
	putfield_return com.whatsapp.client.LeftRightLabelField.field_56744   // get_name_1:  com.whatsapp.client.LeftRightLabelField.field_56744   // get_name_2:  com.whatsapp.client.LeftRightLabelField.field_56744   // get_Name:    com.whatsapp.client.LeftRightLabelField.field_56744   // getName->1:     // getName->2:     // getName->N:     // ofs = 56744 ord = 5 addr = 0
	}


public setLeftColor( com.whatsapp.client.LeftRightLabelField, java.lang.Integer ); // address: 0
	{
	putfield_return com.whatsapp.client.LeftRightLabelField.field_56740   // get_name_1:  com.whatsapp.client.LeftRightLabelField.field_56740   // get_name_2:  com.whatsapp.client.LeftRightLabelField.field_56740   // get_Name:    com.whatsapp.client.LeftRightLabelField.field_56740   // getName->1:     // getName->2:     // getName->N:     // ofs = 56740 ord = 4 addr = 0
	}


public int getLeftColor( com.whatsapp.client.LeftRightLabelField ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.LeftRightLabelField.field_56740   // get_name_1:  com.whatsapp.client.LeftRightLabelField.field_56740   // get_name_2:  com.whatsapp.client.LeftRightLabelField.field_56740   // get_Name:    com.whatsapp.client.LeftRightLabelField.field_56740   // getName->1:     // getName->2:     // getName->N:     // ofs = 56740 ord = 4 addr = 0
	ifnull Label6
	aload_0_getfield com.whatsapp.client.LeftRightLabelField.field_56740   // get_name_1:  com.whatsapp.client.LeftRightLabelField.field_56740   // get_name_2:  com.whatsapp.client.LeftRightLabelField.field_56740   // get_Name:    com.whatsapp.client.LeftRightLabelField.field_56740   // getName->1:     // getName->2:     // getName->N:     // ofs = 56740 ord = 4 addr = 0
	invokevirtual int intValue( java.lang.Integer ) // pc=1
	ireturn 
Label6:
	bipush -1
	ireturn 
	}


protected layout( com.whatsapp.client.LeftRightLabelField, int, int ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.LeftRightLabelField.field_56732   // get_name_1:  com.whatsapp.client.LeftRightLabelField.field_56732   // get_name_2:  com.whatsapp.client.LeftRightLabelField.field_56732   // get_Name:    com.whatsapp.client.LeftRightLabelField.field_56732   // getName->1:     // getName->2:     // getName->N:     // ofs = 56732 ord = 2 addr = 0
	ifnonnull Label5
	iconst_0 
	goto Label7
Label5:
	aload_0_getfield com.whatsapp.client.LeftRightLabelField.field_56732   // get_name_1:  com.whatsapp.client.LeftRightLabelField.field_56732   // get_name_2:  com.whatsapp.client.LeftRightLabelField.field_56732   // get_Name:    com.whatsapp.client.LeftRightLabelField.field_56732   // getName->1:     // getName->2:     // getName->N:     // ofs = 56732 ord = 2 addr = 0
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
Label7:
	istore_3 
	aload_0_getfield com.whatsapp.client.LeftRightLabelField.field_56736   // get_name_1:  com.whatsapp.client.LeftRightLabelField.field_56736   // get_name_2:  com.whatsapp.client.LeftRightLabelField.field_56736   // get_Name:    com.whatsapp.client.LeftRightLabelField.field_56736   // getName->1:     // getName->2:     // getName->N:     // ofs = 56736 ord = 3 addr = 0
	ifnonnull Label12
	iconst_0 
	goto Label14
Label12:
	aload_0_getfield com.whatsapp.client.LeftRightLabelField.field_56736   // get_name_1:  com.whatsapp.client.LeftRightLabelField.field_56736   // get_name_2:  com.whatsapp.client.LeftRightLabelField.field_56736   // get_Name:    com.whatsapp.client.LeftRightLabelField.field_56736   // getName->1:     // getName->2:     // getName->N:     // ofs = 56736 ord = 3 addr = 0
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
Label14:
	istore_4 
	iload_3 
	iload_4 
	invokestatic_lib int max( int, int ) // Math
	istore_5 
	iconst_0 
	istore_6 
	iload_4 
	iload_3 
	if_icmple Label28
	aload_0_getfield com.whatsapp.client.LeftRightLabelField.field_56736   // get_name_1:  com.whatsapp.client.LeftRightLabelField.field_56736   // get_name_2:  com.whatsapp.client.LeftRightLabelField.field_56736   // get_Name:    com.whatsapp.client.LeftRightLabelField.field_56736   // getName->1:     // getName->2:     // getName->N:     // ofs = 56736 ord = 3 addr = 0
	invokevirtual int getBaseline( net.rim.device.api.ui.Font ) // pc=1
	istore_6 
	goto Label31
Label28:
	aload_0_getfield com.whatsapp.client.LeftRightLabelField.field_56732   // get_name_1:  com.whatsapp.client.LeftRightLabelField.field_56732   // get_name_2:  com.whatsapp.client.LeftRightLabelField.field_56732   // get_Name:    com.whatsapp.client.LeftRightLabelField.field_56732   // getName->1:     // getName->2:     // getName->N:     // ofs = 56732 ord = 2 addr = 0
	invokevirtual int getBaseline( net.rim.device.api.ui.Font ) // pc=1
	istore_6 
Label31:
	aload_0 
	aload_0_getfield com.whatsapp.client.LeftRightLabelField.field_56732   // get_name_1:  com.whatsapp.client.LeftRightLabelField.field_56732   // get_name_2:  com.whatsapp.client.LeftRightLabelField.field_56732   // get_Name:    com.whatsapp.client.LeftRightLabelField.field_56732   // getName->1:     // getName->2:     // getName->N:     // ofs = 56732 ord = 2 addr = 0
	ifnonnull Label36
	iconst_0 
	goto Label40
Label36:
	iload_6 
	aload_0_getfield com.whatsapp.client.LeftRightLabelField.field_56732   // get_name_1:  com.whatsapp.client.LeftRightLabelField.field_56732   // get_name_2:  com.whatsapp.client.LeftRightLabelField.field_56732   // get_Name:    com.whatsapp.client.LeftRightLabelField.field_56732   // getName->1:     // getName->2:     // getName->N:     // ofs = 56732 ord = 2 addr = 0
	invokevirtual int getBaseline( net.rim.device.api.ui.Font ) // pc=1
	isub 
Label40:
	putfield com.whatsapp.client.LeftRightLabelField.field_56752   // get_name_1:  com.whatsapp.client.LeftRightLabelField.field_56752   // get_name_2:  com.whatsapp.client.LeftRightLabelField.field_56752   // get_Name:    com.whatsapp.client.LeftRightLabelField.field_56752   // getName->1:     // getName->2:     // getName->N:     // ofs = 56752 ord = 7 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.LeftRightLabelField.field_56736   // get_name_1:  com.whatsapp.client.LeftRightLabelField.field_56736   // get_name_2:  com.whatsapp.client.LeftRightLabelField.field_56736   // get_Name:    com.whatsapp.client.LeftRightLabelField.field_56736   // getName->1:     // getName->2:     // getName->N:     // ofs = 56736 ord = 3 addr = 0
	ifnonnull Label46
	iconst_0 
	goto Label50
Label46:
	iload_6 
	aload_0_getfield com.whatsapp.client.LeftRightLabelField.field_56736   // get_name_1:  com.whatsapp.client.LeftRightLabelField.field_56736   // get_name_2:  com.whatsapp.client.LeftRightLabelField.field_56736   // get_Name:    com.whatsapp.client.LeftRightLabelField.field_56736   // getName->1:     // getName->2:     // getName->N:     // ofs = 56736 ord = 3 addr = 0
	invokevirtual int getBaseline( net.rim.device.api.ui.Font ) // pc=1
	isub 
Label50:
	putfield com.whatsapp.client.LeftRightLabelField.field_56756   // get_name_1:  com.whatsapp.client.LeftRightLabelField.field_56756   // get_name_2:  com.whatsapp.client.LeftRightLabelField.field_56756   // get_Name:    com.whatsapp.client.LeftRightLabelField.field_56756   // getName->1:     // getName->2:     // getName->N:     // ofs = 56756 ord = 8 addr = 0
	aload_0 
	iload_1 
	iload_2 
	iload_5 
	invokestatic_lib int min( int, int ) // Math
	invokevirtual setExtent( net.rim.device.api.ui.Field, int, int ) // pc=3
	return 
	}


protected paint( com.whatsapp.client.LeftRightLabelField, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Graphics ) // pc=1
	astore_2 
	aload_1 
	invokevirtual int getColor( net.rim.device.api.ui.Graphics ) // pc=1
	istore_3 
	aload_1 
	invokevirtual int getGlobalAlpha( net.rim.device.api.ui.Graphics ) // pc=1
	istore_4 
	aload_0 
	invokevirtual net.rim.device.api.ui.XYRect getExtent( net.rim.device.api.ui.Field ) // pc=1
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 0 addr = -1
	aload_0 
	invokevirtual int getPaddingLeft( net.rim.device.api.ui.Field ) // pc=1
	isub 
	aload_0 
	invokevirtual int getPaddingRight( net.rim.device.api.ui.Field ) // pc=1
	isub 
	istore_5 
	aload_0_getfield com.whatsapp.client.LeftRightLabelField.field_56728   // get_name_1:  com.whatsapp.client.LeftRightLabelField.field_56728   // get_name_2:  com.whatsapp.client.LeftRightLabelField.field_56728   // get_Name:    com.whatsapp.client.LeftRightLabelField.field_56728   // getName->1:     // getName->2:     // getName->N:     // ofs = 56728 ord = 1 addr = 0
	ifnull Label80
	iload_5 
	aload_0_getfield com.whatsapp.client.LeftRightLabelField.field_56736   // get_name_1:  com.whatsapp.client.LeftRightLabelField.field_56736   // get_name_2:  com.whatsapp.client.LeftRightLabelField.field_56736   // get_Name:    com.whatsapp.client.LeftRightLabelField.field_56736   // getName->1:     // getName->2:     // getName->N:     // ofs = 56736 ord = 3 addr = 0
	aload_0_getfield com.whatsapp.client.LeftRightLabelField.field_56728   // get_name_1:  com.whatsapp.client.LeftRightLabelField.field_56728   // get_name_2:  com.whatsapp.client.LeftRightLabelField.field_56728   // get_Name:    com.whatsapp.client.LeftRightLabelField.field_56728   // getName->1:     // getName->2:     // getName->N:     // ofs = 56728 ord = 1 addr = 0
	invokevirtual int getAdvance( net.rim.device.api.ui.Font, java.lang.String ) // pc=2
	invokestatic_lib int min( int, int ) // Math
	istore_6 
	aload_1 
	aload_0_getfield com.whatsapp.client.LeftRightLabelField.field_56736   // get_name_1:  com.whatsapp.client.LeftRightLabelField.field_56736   // get_name_2:  com.whatsapp.client.LeftRightLabelField.field_56736   // get_Name:    com.whatsapp.client.LeftRightLabelField.field_56736   // getName->1:     // getName->2:     // getName->N:     // ofs = 56736 ord = 3 addr = 0
	invokevirtual setFont( net.rim.device.api.ui.Graphics, net.rim.device.api.ui.Font ) // pc=2
	aload_0_getfield com.whatsapp.client.LeftRightLabelField.field_56744   // get_name_1:  com.whatsapp.client.LeftRightLabelField.field_56744   // get_name_2:  com.whatsapp.client.LeftRightLabelField.field_56744   // get_Name:    com.whatsapp.client.LeftRightLabelField.field_56744   // getName->1:     // getName->2:     // getName->N:     // ofs = 56744 ord = 5 addr = 0
	ifnull Label48
	aload_0_getfield com.whatsapp.client.LeftRightLabelField.field_56744   // get_name_1:  com.whatsapp.client.LeftRightLabelField.field_56744   // get_name_2:  com.whatsapp.client.LeftRightLabelField.field_56744   // get_Name:    com.whatsapp.client.LeftRightLabelField.field_56744   // getName->1:     // getName->2:     // getName->N:     // ofs = 56744 ord = 5 addr = 0
	invokevirtual int intValue( java.lang.Integer ) // pc=1
	istore_7 
	aload_1 
	iload_7 
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_0_getfield com.whatsapp.client.LeftRightLabelField.field_56748   // get_name_1:  com.whatsapp.client.LeftRightLabelField.field_56748   // get_name_2:  com.whatsapp.client.LeftRightLabelField.field_56748   // get_Name:    com.whatsapp.client.LeftRightLabelField.field_56748   // getName->1:     // getName->2:     // getName->N:     // ofs = 56748 ord = 6 addr = 0
	ifeq Label48
	aload_1 
	iload_7 
	bipush 24
	ishr 
	sipush 255
	iand 
	invokevirtual setGlobalAlpha( net.rim.device.api.ui.Graphics, int ) // pc=2
Label48:
	aload_1 
	aload_0_getfield com.whatsapp.client.LeftRightLabelField.field_56728   // get_name_1:  com.whatsapp.client.LeftRightLabelField.field_56728   // get_name_2:  com.whatsapp.client.LeftRightLabelField.field_56728   // get_Name:    com.whatsapp.client.LeftRightLabelField.field_56728   // getName->1:     // getName->2:     // getName->N:     // ofs = 56728 ord = 1 addr = 0
	iconst_0 
	aload_0_getfield com.whatsapp.client.LeftRightLabelField.field_56728   // get_name_1:  com.whatsapp.client.LeftRightLabelField.field_56728   // get_name_2:  com.whatsapp.client.LeftRightLabelField.field_56728   // get_Name:    com.whatsapp.client.LeftRightLabelField.field_56728   // getName->1:     // getName->2:     // getName->N:     // ofs = 56728 ord = 1 addr = 0
	stringlength 
	iload_5 
	iload_6 
	isub 
	aload_0_getfield com.whatsapp.client.LeftRightLabelField.field_56756   // get_name_1:  com.whatsapp.client.LeftRightLabelField.field_56756   // get_name_2:  com.whatsapp.client.LeftRightLabelField.field_56756   // get_Name:    com.whatsapp.client.LeftRightLabelField.field_56756   // getName->1:     // getName->2:     // getName->N:     // ofs = 56756 ord = 8 addr = 0
	sipush 192
	iload_6 
	invokevirtual int drawText( net.rim.device.api.ui.Graphics, java.lang.String, int, int, int, int, int, int ) // pc=8
	pop 
	iload_5 
	iload_6 
	isub 
	aload_0_getfield com.whatsapp.client.LeftRightLabelField.field_56736   // get_name_1:  com.whatsapp.client.LeftRightLabelField.field_56736   // get_name_2:  com.whatsapp.client.LeftRightLabelField.field_56736   // get_Name:    com.whatsapp.client.LeftRightLabelField.field_56736   // getName->1:     // getName->2:     // getName->N:     // ofs = 56736 ord = 3 addr = 0
	bipush 32
	invokevirtual int getAdvance( net.rim.device.api.ui.Font, char ) // pc=2
	isub 
	iconst_0 
	invokestatic_lib int max( int, int ) // Math
	istore_5 
	aload_1 
	aload_2 
	invokevirtual setFont( net.rim.device.api.ui.Graphics, net.rim.device.api.ui.Font ) // pc=2
	aload_1 
	iload_3 
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	iload_4 
	invokevirtual setGlobalAlpha( net.rim.device.api.ui.Graphics, int ) // pc=2
Label80:
	aload_0_getfield com.whatsapp.client.LeftRightLabelField.field_56724   // get_name_1:  com.whatsapp.client.LeftRightLabelField.field_56724   // get_name_2:  com.whatsapp.client.LeftRightLabelField.field_56724   // get_Name:    com.whatsapp.client.LeftRightLabelField.field_56724   // getName->1:     // getName->2:     // getName->N:     // ofs = 56724 ord = 0 addr = 0
	ifnull Label122
	aload_1 
	aload_0_getfield com.whatsapp.client.LeftRightLabelField.field_56732   // get_name_1:  com.whatsapp.client.LeftRightLabelField.field_56732   // get_name_2:  com.whatsapp.client.LeftRightLabelField.field_56732   // get_Name:    com.whatsapp.client.LeftRightLabelField.field_56732   // getName->1:     // getName->2:     // getName->N:     // ofs = 56732 ord = 2 addr = 0
	invokevirtual setFont( net.rim.device.api.ui.Graphics, net.rim.device.api.ui.Font ) // pc=2
	aload_0_getfield com.whatsapp.client.LeftRightLabelField.field_56740   // get_name_1:  com.whatsapp.client.LeftRightLabelField.field_56740   // get_name_2:  com.whatsapp.client.LeftRightLabelField.field_56740   // get_Name:    com.whatsapp.client.LeftRightLabelField.field_56740   // getName->1:     // getName->2:     // getName->N:     // ofs = 56740 ord = 4 addr = 0
	ifnull Label102
	aload_0_getfield com.whatsapp.client.LeftRightLabelField.field_56740   // get_name_1:  com.whatsapp.client.LeftRightLabelField.field_56740   // get_name_2:  com.whatsapp.client.LeftRightLabelField.field_56740   // get_Name:    com.whatsapp.client.LeftRightLabelField.field_56740   // getName->1:     // getName->2:     // getName->N:     // ofs = 56740 ord = 4 addr = 0
	invokevirtual int intValue( java.lang.Integer ) // pc=1
	istore_6 
	aload_1 
	iload_6 
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_0_getfield com.whatsapp.client.LeftRightLabelField.field_56748   // get_name_1:  com.whatsapp.client.LeftRightLabelField.field_56748   // get_name_2:  com.whatsapp.client.LeftRightLabelField.field_56748   // get_Name:    com.whatsapp.client.LeftRightLabelField.field_56748   // getName->1:     // getName->2:     // getName->N:     // ofs = 56748 ord = 6 addr = 0
	ifeq Label102
	aload_1 
	iload_6 
	bipush 24
	ishr 
	sipush 255
	iand 
	invokevirtual setGlobalAlpha( net.rim.device.api.ui.Graphics, int ) // pc=2
Label102:
	aload_1 
	aload_0_getfield com.whatsapp.client.LeftRightLabelField.field_56724   // get_name_1:  com.whatsapp.client.LeftRightLabelField.field_56724   // get_name_2:  com.whatsapp.client.LeftRightLabelField.field_56724   // get_Name:    com.whatsapp.client.LeftRightLabelField.field_56724   // getName->1:     // getName->2:     // getName->N:     // ofs = 56724 ord = 0 addr = 0
	iconst_0 
	aload_0_getfield com.whatsapp.client.LeftRightLabelField.field_56724   // get_name_1:  com.whatsapp.client.LeftRightLabelField.field_56724   // get_name_2:  com.whatsapp.client.LeftRightLabelField.field_56724   // get_Name:    com.whatsapp.client.LeftRightLabelField.field_56724   // getName->1:     // getName->2:     // getName->N:     // ofs = 56724 ord = 0 addr = 0
	stringlength 
	iconst_0 
	aload_0_getfield com.whatsapp.client.LeftRightLabelField.field_56752   // get_name_1:  com.whatsapp.client.LeftRightLabelField.field_56752   // get_name_2:  com.whatsapp.client.LeftRightLabelField.field_56752   // get_Name:    com.whatsapp.client.LeftRightLabelField.field_56752   // getName->1:     // getName->2:     // getName->N:     // ofs = 56752 ord = 7 addr = 0
	bipush 64
	iload_5 
	invokevirtual int drawText( net.rim.device.api.ui.Graphics, java.lang.String, int, int, int, int, int, int ) // pc=8
	pop 
	aload_1 
	aload_2 
	invokevirtual setFont( net.rim.device.api.ui.Graphics, net.rim.device.api.ui.Font ) // pc=2
	aload_1 
	iload_3 
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	iload_4 
	invokevirtual setGlobalAlpha( net.rim.device.api.ui.Graphics, int ) // pc=2
Label122:
	return 
	}

}
