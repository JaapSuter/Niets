// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-19.cod
// Module version  : 2.7.3204
// Class ID        : 12
// ########################################################


package com.whatsapp.client;


public class IconTextField extends net.rim.device.api.ui.Field

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.device.api.system.Bitmap /*net.rim.device.api.system.Bitmap*/  field_53652 ; // ofs = 53652 addr = 0)
	private String /*java.lang.String*/  field_53656 ; // ofs = 53656 addr = 0)
	private net.rim.device.api.ui.Font /*net.rim.device.api.ui.Font*/  field_53660 ; // ofs = 53660 addr = 0)
	private String /*java.lang.String*/  field_53664 ; // ofs = 53664 addr = 0)
	private String /*java.lang.String*/  field_53668 ; // ofs = 53668 addr = 0)
	private net.rim.device.api.ui.Font /*net.rim.device.api.ui.Font*/  field_53672 ; // ofs = 53672 addr = 0)
	private int /*int*/  field_53676 ; // ofs = 53676 addr = 0)
	private Integer /*java.lang.Integer*/  field_53680 ; // ofs = 53680 addr = 0)
	private Runnable /*java.lang.Runnable*/  field_53684 ; // ofs = 53684 addr = 0)
	private int /*int*/  field_53688 ; // ofs = 53688 addr = 0)
	private int /*int*/  field_53692 ; // ofs = 53692 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.IconTextField, net.rim.device.api.system.Bitmap, java.lang.String, java.lang.String, java.lang.String, java.lang.Runnable ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	aload_2 
	aload_3 
	aload_4 
	aload_5 
	iconst_0 
	i2l 
	invokespecial com.whatsapp.client.IconTextField.<init> // pc=8
	return 
	}


public <init>( com.whatsapp.client.IconTextField, net.rim.device.api.system.Bitmap, java.lang.String, java.lang.String, java.lang.String, java.lang.Runnable, long ); // address: 0
	{
	enter 
	aload_0 
	lload 6
	invokespecial_lib net.rim.device.api.ui.Field.<init> // pc=3
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.IconTextField.field_53676   // get_name_1:  com.whatsapp.client.IconTextField.field_53676   // get_name_2:  com.whatsapp.client.IconTextField.field_53676   // get_Name:    com.whatsapp.client.IconTextField.field_53676   // getName->1:     // getName->2:     // getName->N:     // ofs = 53676 ord = 6 addr = 0
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.IconTextField.field_53692   // get_name_1:  com.whatsapp.client.IconTextField.field_53692   // get_name_2:  com.whatsapp.client.IconTextField.field_53692   // get_Name:    com.whatsapp.client.IconTextField.field_53692   // getName->1:     // getName->2:     // getName->N:     // ofs = 53692 ord = 10 addr = 0
	aload_0 
	aload_1 
	putfield com.whatsapp.client.IconTextField.field_53652   // get_name_1:  com.whatsapp.client.IconTextField.field_53652   // get_name_2:  com.whatsapp.client.IconTextField.field_53652   // get_Name:    com.whatsapp.client.IconTextField.field_53652   // getName->1:     // getName->2:     // getName->N:     // ofs = 53652 ord = 0 addr = 0
	aload_0 
	aload_2 
	putfield com.whatsapp.client.IconTextField.field_53656   // get_name_1:  com.whatsapp.client.IconTextField.field_53656   // get_name_2:  com.whatsapp.client.IconTextField.field_53656   // get_Name:    com.whatsapp.client.IconTextField.field_53656   // getName->1:     // getName->2:     // getName->N:     // ofs = 53656 ord = 1 addr = 0
	aload_0 
	aload_3 
	putfield com.whatsapp.client.IconTextField.field_53664   // get_name_1:  com.whatsapp.client.IconTextField.field_53664   // get_name_2:  com.whatsapp.client.IconTextField.field_53664   // get_Name:    com.whatsapp.client.IconTextField.field_53664   // getName->1:     // getName->2:     // getName->N:     // ofs = 53664 ord = 3 addr = 0
	aload_0 
	aload_4 
	putfield com.whatsapp.client.IconTextField.field_53668   // get_name_1:  com.whatsapp.client.IconTextField.field_53668   // get_name_2:  com.whatsapp.client.IconTextField.field_53668   // get_Name:    com.whatsapp.client.IconTextField.field_53668   // getName->1:     // getName->2:     // getName->N:     // ofs = 53668 ord = 4 addr = 0
	aload_0 
	aload_5 
	putfield com.whatsapp.client.IconTextField.field_53684   // get_name_1:  com.whatsapp.client.IconTextField.field_53684   // get_name_2:  com.whatsapp.client.IconTextField.field_53684   // get_Name:    com.whatsapp.client.IconTextField.field_53684   // getName->1:     // getName->2:     // getName->N:     // ofs = 53684 ord = 8 addr = 0
	return 
	}


static int getXHeight( net.rim.device.api.ui.Font ); // address: 0
	{
	enter 
	new_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	dup 
	aload_0 
	bipush 120
	invokevirtual int getAdvance( net.rim.device.api.ui.Font, char ) // pc=2
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	invokespecial_lib net.rim.device.api.system.Bitmap.<init> // pc=3
	astore_1 
	aload_1 
	invokestatic_lib module:WhatsApp-35.class#0.routine_4406(  ) // class#0
	astore_2 
	aload_2 
	iconst_0 
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_2 
	ldc literal_51:"x"
	iconst_0 
	iconst_0 
	invokevirtual int drawText( net.rim.device.api.ui.Graphics, java.lang.String, int, int ) // pc=4
	pop 
	aload_1 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	istore_3 
	aload_1 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	istore_4 
	iload_3 
	iload_4 
	imul 
	newarray 5
	astore_5 
	aload_1 
	aload_5 
	iconst_0 
	iload_4 
	iconst_0 
	iconst_0 
	iload_4 
	iload_3 
	invokevirtual getARGB( net.rim.device.api.system.Bitmap, int[], int, int, int, int, int, int ) // pc=8
	iconst_0 
	istore_6 
Label44:
	iload_6 
	iload_3 
	if_icmpge Label74
	iconst_0 
	istore_7 
Label49:
	iload_7 
	iload_4 
	if_icmpge Label72
	aload_5 
	iload_6 
	iload_4 
	imul 
	iload_7 
	iadd 
	iaload 
	iipush 16777215
	iand 
	iipush 16777215
	if_icmpeq Label70
	aload_0 
	invokevirtual int getBaseline( net.rim.device.api.ui.Font ) // pc=1
	iload_6 
	isub 
	istore 8
	iload 8
	ireturn 
Label70:
	iinc 7 1
	goto Label49
Label72:
	iinc 6 1
	goto Label44
Label74:
	iconst_0 
	ireturn 
	}


static public drawPhotoAndText( net.rim.device.api.ui.Graphics, net.rim.device.api.system.Bitmap, java.lang.String, java.lang.String, java.lang.String, net.rim.device.api.ui.Font, net.rim.device.api.ui.Font, net.rim.device.api.ui.Font, java.lang.Integer, int, int, int, int, boolean ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	aload_2 
	aload_3 
	aconst_null 
	aconst_null 
	aload_4 
	iconst_1 
	aload_5 
	aload_6 
	aload_7 
	aload 8
	iload 9
	iload 10
	iload 11
	iload 12
	iload 13
	invokestatic drawPhotoAndText( net.rim.device.api.ui.Graphics, net.rim.device.api.system.Bitmap, java.lang.String, java.lang.String, net.rim.device.api.system.Bitmap, net.rim.device.api.system.Bitmap, java.lang.String, boolean, net.rim.device.api.ui.Font, net.rim.device.api.ui.Font, net.rim.device.api.ui.Font, java.lang.Integer, int, int, int, int, boolean ) // IconTextField
	return 
	}


static public drawPhotoAndText( net.rim.device.api.ui.Graphics, net.rim.device.api.system.Bitmap, java.lang.String, java.lang.String, net.rim.device.api.system.Bitmap, net.rim.device.api.system.Bitmap, java.lang.String, boolean, net.rim.device.api.ui.Font, net.rim.device.api.ui.Font, net.rim.device.api.ui.Font, java.lang.Integer, int, int, int, int, boolean ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual int getColor( net.rim.device.api.ui.Graphics ) // pc=1
	istore 17
	bipush 6
	istore 18
	iload 18
	aload_0 
	aload_1 
	iload 12
	iload 13
	iload 15
	invokestatic int drawPhoto( net.rim.device.api.ui.Graphics, net.rim.device.api.system.Bitmap, int, int, int ) // IconTextField
	iadd 
	istore 18
	aload 10
	ifnull Label19
	aload_6 
	ifnonnull Label35
Label19:
	aconst_null 
	astore 21
	iconst_0 
	istore 20
	iload 12
	iload 15
	bipush 2
	idiv 
	iadd 
	aload 8
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	bipush 2
	idiv 
	isub 
	istore 19
	goto_w Label130
Label35:
	aload_4 
	ifnonnull Label39
	iconst_0 
	goto Label43
Label39:
	aload_4 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	bipush 6
	iadd 
Label43:
	istore 22
	aload_5 
	ifnonnull Label48
	iconst_0 
	goto Label52
Label48:
	aload_5 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	bipush 6
	iadd 
Label52:
	istore 23
	iload 14
	iload 18
	isub 
	bipush 6
	isub 
	bipush 6
	isub 
	iload 23
	isub 
	iload 22
	isub 
	istore 24
	aload_6 
	bipush 10
	bipush 32
	invokenonvirtual_lib java.lang.String.replace // pc=3
	astore_6 
	iload_7 
	ifeq Label81
	aload 10
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	bipush 2
	imul 
	aload 8
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	iadd 
	iload 15
	if_icmple Label93
Label81:
	bipush 2
	newarray_object_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	iconst_0 
	aload_6 
	aastore 
	dup 
	iconst_1 
	aconst_null 
	aastore 
	astore 21
	goto Label98
Label93:
	aload_6 
	aload 10
	iload 24
	invokestatic_lib module:WhatsApp-35.class#0.routine_6134(  ) // class#0
	astore 21
Label98:
	aload 8
	invokestatic int getXHeight( net.rim.device.api.ui.Font ) // IconTextField
	istore 25
	aload 21
	iconst_1 
	aaload 
	ifnonnull Label107
	iconst_0 
	goto Label109
Label107:
	aload 10
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
Label109:
	istore 26
	iload 15
	iload 25
	isub 
	aload 10
	invokestatic int getXHeight( net.rim.device.api.ui.Font ) // IconTextField
	isub 
	iload 26
	isub 
	bipush 3
	idiv 
	istore 20
	iload 12
	iload 20
	iadd 
	aload 8
	invokevirtual int getBaseline( net.rim.device.api.ui.Font ) // pc=1
	iload 25
	isub 
	isub 
	istore 19
Label130:
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Graphics ) // pc=1
	astore 22
	aload_3 
	ifnull Label176
	aload_0 
	aload 9
	invokevirtual setFont( net.rim.device.api.ui.Graphics, net.rim.device.api.ui.Font ) // pc=2
	iload 16
	ifne Label143
	aload_0 
	iipush 6591981
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
Label143:
	aload 9
	aload_3 
	invokevirtual int getBounds( net.rim.device.api.ui.Font, java.lang.String ) // pc=2
	istore 23
	iload 19
	aload 8
	invokevirtual int getLeading( net.rim.device.api.ui.Font ) // pc=1
	aload 8
	invokevirtual int getAscent( net.rim.device.api.ui.Font ) // pc=1
	iadd 
	iadd 
	aload 9
	invokevirtual int getLeading( net.rim.device.api.ui.Font ) // pc=1
	aload 9
	invokevirtual int getAscent( net.rim.device.api.ui.Font ) // pc=1
	iadd 
	isub 
	istore 24
	aload_0 
	aload_3 
	iload 14
	iload 23
	bipush 6
	iadd 
	isub 
	iload 24
	iconst_0 
	iload 23
	bipush 6
	iadd 
	invokevirtual int drawText( net.rim.device.api.ui.Graphics, java.lang.String, int, int, int, int ) // pc=6
	pop 
	goto Label178
Label176:
	iconst_0 
	istore 23
Label178:
	aload_0 
	iload 17
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_0 
	aload 8
	invokevirtual setFont( net.rim.device.api.ui.Graphics, net.rim.device.api.ui.Font ) // pc=2
	aload_0 
	aload 8
	aload_2 
	iload 14
	iload 18
	iload 23
	iadd 
	bipush 6
	iadd 
	isub 
	invokestatic_lib module:WhatsApp-15.class#5.routine_3581(  ) // class#5
	iload 18
	iload 19
	invokestatic_lib module:WhatsApp-15.class#5.routine_2649(  ) // class#5
	aload 10
	ifnonnull Label201
	goto_w Label319
Label201:
	aload_6 
	ifnonnull Label204
	goto_w Label319
Label204:
	aload 10
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	istore 24
	iload 18
	istore 25
	iload 12
	iload 15
	iload 20
	isub 
	aload 10
	invokevirtual int getBaseline( net.rim.device.api.ui.Font ) // pc=1
	isub 
	aload 21
	iconst_1 
	aaload 
	ifnonnull Label222
	iconst_0 
	goto Label223
Label222:
	iload 24
Label223:
	isub 
	iadd 
	istore 19
	aload_5 
	ifnull Label257
	iload 19
	iload 24
	aload 21
	iconst_1 
	aaload 
	ifnonnull Label236
	bipush 2
	goto Label237
Label236:
	iconst_1 
Label237:
	idiv 
	iadd 
	aload_5 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	bipush 2
	idiv 
	isub 
	istore 26
	aload_0 
	aload_5 
	iload 25
	iload 26
	invokestatic com.whatsapp.client.IconTextField.routine_7028( net.rim.device.api.ui.Graphics, net.rim.device.api.system.Bitmap, int, int ) // IconTextField
	iload 25
	aload_5 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	bipush 6
	iadd 
	iadd 
	istore 25
Label257:
	aload_4 
	ifnull Label293
	iload 19
	iload 24
	aload 21
	iconst_1 
	aaload 
	ifnonnull Label267
	bipush 2
	goto Label268
Label267:
	iconst_1 
Label268:
	idiv 
	iadd 
	aload_4 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	bipush 2
	idiv 
	isub 
	istore 26
	aload_0 
	aload_4 
	iload 14
	bipush 6
	isub 
	aload_4 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	isub 
	iload 26
	invokestatic com.whatsapp.client.IconTextField.routine_7028( net.rim.device.api.ui.Graphics, net.rim.device.api.system.Bitmap, int, int ) // IconTextField
	iload 14
	bipush 6
	aload_4 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	iadd 
	isub 
	istore 14
Label293:
	aload_0 
	aload 21
	iconst_0 
	aaload 
	aload 10
	aload 11
	iload 14
	iload 25
	iload 19
	invokestatic com.whatsapp.client.IconTextField.routine_7190( net.rim.device.api.ui.Graphics, java.lang.String, net.rim.device.api.ui.Font, java.lang.Integer, int, int, int ) // IconTextField
	aload 21
	iconst_1 
	aaload 
	ifnull Label319
	aload_0 
	aload 21
	iconst_1 
	aaload 
	aload 10
	aload 11
	iload 14
	iload 25
	iload 19
	iload 24
	iadd 
	invokestatic com.whatsapp.client.IconTextField.routine_7190( net.rim.device.api.ui.Graphics, java.lang.String, net.rim.device.api.ui.Font, java.lang.Integer, int, int, int ) // IconTextField
Label319:
	aload_0 
	aload 22
	invokevirtual setFont( net.rim.device.api.ui.Graphics, net.rim.device.api.ui.Font ) // pc=2
	aload_0 
	iload 17
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	return 
	}


static private com.whatsapp.client.IconTextField.routine_7028( net.rim.device.api.ui.Graphics, net.rim.device.api.system.Bitmap, int, int ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_1 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	imul 
	newarray 5
	astore_4 
	aload_1 
	aload_4 
	iconst_0 
	aload_1 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	iconst_0 
	iconst_0 
	aload_1 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_1 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	invokevirtual getARGB( net.rim.device.api.system.Bitmap, int[], int, int, int, int, int, int ) // pc=8
	aload_0 
	aload_4 
	iconst_0 
	aload_1 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	iload_2 
	iload_3 
	aload_1 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_1 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	invokevirtual drawARGB( net.rim.device.api.ui.Graphics, int[], int, int, int, int, int, int ) // pc=8
	return 
	}


static public int drawPhoto( net.rim.device.api.ui.Graphics, net.rim.device.api.system.Bitmap, int, int, int ); // address: 0
	{
	enter 
	iconst_0 
	istore_5 
	aload_1 
	ifnull Label41
	iload_3 
	aload_1 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	isub 
	bipush 2
	idiv 
	istore_6 
	iload_4 
	aload_1 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	isub 
	bipush 2
	idiv 
	istore_7 
	aload_0 
	bipush 6
	iload_6 
	iadd 
	iload_2 
	iload_7 
	iadd 
	aload_1 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_1 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	aload_1 
	iconst_0 
	iconst_0 
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=8
	bipush 6
	iload_3 
	aload_1 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	invokestatic_lib int max( int, int ) // Math
	iadd 
	istore_5 
Label41:
	iload_5 
	ireturn 
	}


static private com.whatsapp.client.IconTextField.routine_7190( net.rim.device.api.ui.Graphics, java.lang.String, net.rim.device.api.ui.Font, java.lang.Integer, int, int, int ); // address: 0
	{
	enter 
	aload_0 
	aload_2 
	invokevirtual setFont( net.rim.device.api.ui.Graphics, net.rim.device.api.ui.Font ) // pc=2
	aload_3 
	ifnull Label10
	aload_0 
	aload_3 
	invokevirtual int intValue( java.lang.Integer ) // pc=1
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
Label10:
	aload_0 
	aload_2 
	aload_1 
	iload_4 
	iload_5 
	bipush 6
	iadd 
	isub 
	invokestatic_lib module:WhatsApp-15.class#5.routine_3581(  ) // class#5
	iload_5 
	iload_6 
	invokestatic_lib module:WhatsApp-15.class#5.routine_2649(  ) // class#5
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private com.whatsapp.client.IconTextField.routine_6011( com.whatsapp.client.IconTextField ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.IconTextField.field_53684   // get_name_1:  com.whatsapp.client.IconTextField.field_53684   // get_name_2:  com.whatsapp.client.IconTextField.field_53684   // get_Name:    com.whatsapp.client.IconTextField.field_53684   // getName->1:     // getName->2:     // getName->N:     // ofs = 53684 ord = 8 addr = 0
	ifnull Label5
	aload_0_getfield com.whatsapp.client.IconTextField.field_53684   // get_name_1:  com.whatsapp.client.IconTextField.field_53684   // get_name_2:  com.whatsapp.client.IconTextField.field_53684   // get_Name:    com.whatsapp.client.IconTextField.field_53684   // getName->1:     // getName->2:     // getName->N:     // ofs = 53684 ord = 8 addr = 0
	invokeinterface interfacemethodref_4 // pc=1 guess=2
Label5:
	return 
	}


private int com.whatsapp.client.IconTextField.routine_6039( com.whatsapp.client.IconTextField ); // address: 0
	{
	enter 
	aload_0 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	putfield com.whatsapp.client.IconTextField.field_53660   // get_name_1:  com.whatsapp.client.IconTextField.field_53660   // get_name_2:  com.whatsapp.client.IconTextField.field_53660   // get_Name:    com.whatsapp.client.IconTextField.field_53660   // getName->1:     // getName->2:     // getName->N:     // ofs = 53660 ord = 2 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.IconTextField.field_53660   // get_name_1:  com.whatsapp.client.IconTextField.field_53660   // get_name_2:  com.whatsapp.client.IconTextField.field_53660   // get_Name:    com.whatsapp.client.IconTextField.field_53660   // getName->1:     // getName->2:     // getName->N:     // ofs = 53660 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.client.IconTextField.field_53676   // get_name_1:  com.whatsapp.client.IconTextField.field_53676   // get_name_2:  com.whatsapp.client.IconTextField.field_53676   // get_Name:    com.whatsapp.client.IconTextField.field_53676   // getName->1:     // getName->2:     // getName->N:     // ofs = 53676 ord = 6 addr = 0
	aload_0_getfield com.whatsapp.client.IconTextField.field_53660   // get_name_1:  com.whatsapp.client.IconTextField.field_53660   // get_name_2:  com.whatsapp.client.IconTextField.field_53660   // get_Name:    com.whatsapp.client.IconTextField.field_53660   // getName->1:     // getName->2:     // getName->N:     // ofs = 53660 ord = 2 addr = 0
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	bipush 4
	isub 
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int, int ) // pc=3
	putfield com.whatsapp.client.IconTextField.field_53672   // get_name_1:  com.whatsapp.client.IconTextField.field_53672   // get_name_2:  com.whatsapp.client.IconTextField.field_53672   // get_Name:    com.whatsapp.client.IconTextField.field_53672   // getName->1:     // getName->2:     // getName->N:     // ofs = 53672 ord = 5 addr = 0
	bipush 6
	aload_0_getfield com.whatsapp.client.IconTextField.field_53660   // get_name_1:  com.whatsapp.client.IconTextField.field_53660   // get_name_2:  com.whatsapp.client.IconTextField.field_53660   // get_Name:    com.whatsapp.client.IconTextField.field_53660   // getName->1:     // getName->2:     // getName->N:     // ofs = 53660 ord = 2 addr = 0
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	iadd 
	aload_0_getfield com.whatsapp.client.IconTextField.field_53672   // get_name_1:  com.whatsapp.client.IconTextField.field_53672   // get_name_2:  com.whatsapp.client.IconTextField.field_53672   // get_Name:    com.whatsapp.client.IconTextField.field_53672   // getName->1:     // getName->2:     // getName->N:     // ofs = 53672 ord = 5 addr = 0
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	iadd 
	bipush 6
	iadd 
	istore_1 
	aload_0_getfield com.whatsapp.client.IconTextField.field_53692   // get_name_1:  com.whatsapp.client.IconTextField.field_53692   // get_name_2:  com.whatsapp.client.IconTextField.field_53692   // get_Name:    com.whatsapp.client.IconTextField.field_53692   // getName->1:     // getName->2:     // getName->N:     // ofs = 53692 ord = 10 addr = 0
	iload_1 
	invokestatic_lib int max( int, int ) // Math
	ireturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public setBitmap( com.whatsapp.client.IconTextField, net.rim.device.api.system.Bitmap ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	putfield com.whatsapp.client.IconTextField.field_53652   // get_name_1:  com.whatsapp.client.IconTextField.field_53652   // get_name_2:  com.whatsapp.client.IconTextField.field_53652   // get_Name:    com.whatsapp.client.IconTextField.field_53652   // getName->1:     // getName->2:     // getName->N:     // ofs = 53652 ord = 0 addr = 0
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Field ) // pc=1
	return 
	}


public setLine1( com.whatsapp.client.IconTextField, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	putfield com.whatsapp.client.IconTextField.field_53656   // get_name_1:  com.whatsapp.client.IconTextField.field_53656   // get_name_2:  com.whatsapp.client.IconTextField.field_53656   // get_Name:    com.whatsapp.client.IconTextField.field_53656   // getName->1:     // getName->2:     // getName->N:     // ofs = 53656 ord = 1 addr = 0
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Field ) // pc=1
	return 
	}


public setLine2( com.whatsapp.client.IconTextField, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	putfield com.whatsapp.client.IconTextField.field_53668   // get_name_1:  com.whatsapp.client.IconTextField.field_53668   // get_name_2:  com.whatsapp.client.IconTextField.field_53668   // get_Name:    com.whatsapp.client.IconTextField.field_53668   // getName->1:     // getName->2:     // getName->N:     // ofs = 53668 ord = 4 addr = 0
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Field ) // pc=1
	return 
	}


public setLine2Color( com.whatsapp.client.IconTextField, java.lang.Integer ); // address: 0
	{
	putfield_return com.whatsapp.client.IconTextField.field_53680   // get_name_1:  com.whatsapp.client.IconTextField.field_53680   // get_name_2:  com.whatsapp.client.IconTextField.field_53680   // get_Name:    com.whatsapp.client.IconTextField.field_53680   // getName->1:     // getName->2:     // getName->N:     // ofs = 53680 ord = 7 addr = 0
	}


protected boolean keyDown( com.whatsapp.client.IconTextField, int, int ); // address: 0
	{
	enter_narrow 
	iload_1 
	bipush 10
	if_icmpne Label8
	aload_0 
	invokespecial com.whatsapp.client.IconTextField.routine_6011 // pc=1
	iconst_1 
	ireturn 
Label8:
	aload_0 
	iload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.Field.keyDown // pc=3
	ireturn 
	}


protected boolean navigationClick( com.whatsapp.client.IconTextField, int, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial com.whatsapp.client.IconTextField.routine_6011 // pc=1
	iconst_1 
	ireturn 
	}


public int getPreferredHeight( com.whatsapp.client.IconTextField ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.IconTextField.field_53688   // get_name_1:  com.whatsapp.client.IconTextField.field_53688   // get_name_2:  com.whatsapp.client.IconTextField.field_53688   // get_Name:    com.whatsapp.client.IconTextField.field_53688   // getName->1:     // getName->2:     // getName->N:     // ofs = 53688 ord = 9 addr = 0
	ifne Label7
	aload_0 
	aload_0 
	invokespecial com.whatsapp.client.IconTextField.routine_6039 // pc=1
	putfield com.whatsapp.client.IconTextField.field_53688   // get_name_1:  com.whatsapp.client.IconTextField.field_53688   // get_name_2:  com.whatsapp.client.IconTextField.field_53688   // get_Name:    com.whatsapp.client.IconTextField.field_53688   // getName->1:     // getName->2:     // getName->N:     // ofs = 53688 ord = 9 addr = 0
Label7:
	aload_0_getfield com.whatsapp.client.IconTextField.field_53688   // get_name_1:  com.whatsapp.client.IconTextField.field_53688   // get_name_2:  com.whatsapp.client.IconTextField.field_53688   // get_Name:    com.whatsapp.client.IconTextField.field_53688   // getName->1:     // getName->2:     // getName->N:     // ofs = 53688 ord = 9 addr = 0
	ireturn 
	}


public int getPreferredIconEdge( com.whatsapp.client.IconTextField ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokenonvirtual com.whatsapp.client.IconTextField.getPreferredHeight // pc=1
	bipush 6
	isub 
	bipush 6
	isub 
	ireturn 
	}


protected layout( com.whatsapp.client.IconTextField, int, int ); // address: 0
	{
	enter 
	aload_0 
	iload_1 
	iload_2 
	aload_0 
	invokenonvirtual com.whatsapp.client.IconTextField.getPreferredHeight // pc=1
	invokestatic_lib int min( int, int ) // Math
	invokevirtual setExtent( net.rim.device.api.ui.Field, int, int ) // pc=3
	return 
	}


public setFont( com.whatsapp.client.IconTextField, net.rim.device.api.ui.Font ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.IconTextField.field_53688   // get_name_1:  com.whatsapp.client.IconTextField.field_53688   // get_name_2:  com.whatsapp.client.IconTextField.field_53688   // get_Name:    com.whatsapp.client.IconTextField.field_53688   // getName->1:     // getName->2:     // getName->N:     // ofs = 53688 ord = 9 addr = 0
	aload_0 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.Field.setFont // pc=2
	return 
	}


public setLine2FontStyle( com.whatsapp.client.IconTextField, int ); // address: 0
	{
	enter_narrow 
	iload_1 
	aload_0_getfield com.whatsapp.client.IconTextField.field_53676   // get_name_1:  com.whatsapp.client.IconTextField.field_53676   // get_name_2:  com.whatsapp.client.IconTextField.field_53676   // get_Name:    com.whatsapp.client.IconTextField.field_53676   // getName->1:     // getName->2:     // getName->N:     // ofs = 53676 ord = 6 addr = 0
	if_icmpeq Label13
	aload_0 
	iload_1 
	putfield com.whatsapp.client.IconTextField.field_53676   // get_name_1:  com.whatsapp.client.IconTextField.field_53676   // get_name_2:  com.whatsapp.client.IconTextField.field_53676   // get_Name:    com.whatsapp.client.IconTextField.field_53676   // getName->1:     // getName->2:     // getName->N:     // ofs = 53676 ord = 6 addr = 0
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.IconTextField.field_53688   // get_name_1:  com.whatsapp.client.IconTextField.field_53688   // get_name_2:  com.whatsapp.client.IconTextField.field_53688   // get_Name:    com.whatsapp.client.IconTextField.field_53688   // getName->1:     // getName->2:     // getName->N:     // ofs = 53688 ord = 9 addr = 0
	aload_0 
	invokenonvirtual com.whatsapp.client.IconTextField.getPreferredHeight // pc=1
	pop 
Label13:
	return 
	}


protected paint( com.whatsapp.client.IconTextField, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter 
	aload_1 
	bipush 8
	invokevirtual boolean isDrawingStyleSet( net.rim.device.api.ui.Graphics, int ) // pc=2
	istore_2 
	aload_1 
	aload_0_getfield com.whatsapp.client.IconTextField.field_53652   // get_name_1:  com.whatsapp.client.IconTextField.field_53652   // get_name_2:  com.whatsapp.client.IconTextField.field_53652   // get_Name:    com.whatsapp.client.IconTextField.field_53652   // getName->1:     // getName->2:     // getName->N:     // ofs = 53652 ord = 0 addr = 0
	aload_0_getfield com.whatsapp.client.IconTextField.field_53656   // get_name_1:  com.whatsapp.client.IconTextField.field_53656   // get_name_2:  com.whatsapp.client.IconTextField.field_53656   // get_Name:    com.whatsapp.client.IconTextField.field_53656   // getName->1:     // getName->2:     // getName->N:     // ofs = 53656 ord = 1 addr = 0
	aload_0_getfield com.whatsapp.client.IconTextField.field_53664   // get_name_1:  com.whatsapp.client.IconTextField.field_53664   // get_name_2:  com.whatsapp.client.IconTextField.field_53664   // get_Name:    com.whatsapp.client.IconTextField.field_53664   // getName->1:     // getName->2:     // getName->N:     // ofs = 53664 ord = 3 addr = 0
	aconst_null 
	aconst_null 
	aload_0_getfield com.whatsapp.client.IconTextField.field_53668   // get_name_1:  com.whatsapp.client.IconTextField.field_53668   // get_name_2:  com.whatsapp.client.IconTextField.field_53668   // get_Name:    com.whatsapp.client.IconTextField.field_53668   // getName->1:     // getName->2:     // getName->N:     // ofs = 53668 ord = 4 addr = 0
	iconst_0 
	aload_0_getfield com.whatsapp.client.IconTextField.field_53660   // get_name_1:  com.whatsapp.client.IconTextField.field_53660   // get_name_2:  com.whatsapp.client.IconTextField.field_53660   // get_Name:    com.whatsapp.client.IconTextField.field_53660   // getName->1:     // getName->2:     // getName->N:     // ofs = 53660 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.client.IconTextField.field_53660   // get_name_1:  com.whatsapp.client.IconTextField.field_53660   // get_name_2:  com.whatsapp.client.IconTextField.field_53660   // get_Name:    com.whatsapp.client.IconTextField.field_53660   // getName->1:     // getName->2:     // getName->N:     // ofs = 53660 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.client.IconTextField.field_53672   // get_name_1:  com.whatsapp.client.IconTextField.field_53672   // get_name_2:  com.whatsapp.client.IconTextField.field_53672   // get_Name:    com.whatsapp.client.IconTextField.field_53672   // getName->1:     // getName->2:     // getName->N:     // ofs = 53672 ord = 5 addr = 0
	iload_2 
	ifeq Label20
	aconst_null 
	goto Label21
Label20:
	aload_0_getfield com.whatsapp.client.IconTextField.field_53680   // get_name_1:  com.whatsapp.client.IconTextField.field_53680   // get_name_2:  com.whatsapp.client.IconTextField.field_53680   // get_Name:    com.whatsapp.client.IconTextField.field_53680   // getName->1:     // getName->2:     // getName->N:     // ofs = 53680 ord = 7 addr = 0
Label21:
	iconst_0 
	aload_0 
	invokenonvirtual com.whatsapp.client.IconTextField.getPreferredIconEdge // pc=1
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	aload_0 
	invokenonvirtual com.whatsapp.client.IconTextField.getPreferredHeight // pc=1
	iload_2 
	invokestatic drawPhotoAndText( net.rim.device.api.ui.Graphics, net.rim.device.api.system.Bitmap, java.lang.String, java.lang.String, net.rim.device.api.system.Bitmap, net.rim.device.api.system.Bitmap, java.lang.String, boolean, net.rim.device.api.ui.Font, net.rim.device.api.ui.Font, net.rim.device.api.ui.Font, java.lang.Integer, int, int, int, int, boolean ) // IconTextField
	return 
	}


protected onFocus( com.whatsapp.client.IconTextField, int ); // address: 0
	{
	jumpspecial_lib onFocus( net.rim.device.api.ui.Field, int )
	}

}
