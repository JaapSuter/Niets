// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-40.cod
// Module version  : 2.8.1914
// Class ID        : 4
// ########################################################


package com.whatsapp.client;


abstract final class MediaFullBrowserScreen$OverlayHeaderField extends net.rim.device.api.ui.Field

{

	// @@@@@@@@@@@@@ Fields 
	private final String /*java.lang.String*/  field_54248 ; // ofs = 54248 addr = 0)
	private String /*java.lang.String*/  field_54252 ; // ofs = 54252 addr = 0)
	private String /*java.lang.String*/  field_54256 ; // ofs = 54256 addr = 0)
	private String /*java.lang.String*/  field_54260 ; // ofs = 54260 addr = 0)
	private String /*java.lang.String*/  field_54264 ; // ofs = 54264 addr = 0)
	private net.rim.device.api.ui.Font /*net.rim.device.api.ui.Font*/  field_54268 ; // ofs = 54268 addr = 0)
	private int /*int*/  field_54272 ; // ofs = 54272 addr = 0)
	private int /*int*/  field_54276 ; // ofs = 54276 addr = 0)
	private final com.whatsapp.client.MediaFullBrowserScreen /*com.whatsapp.client.MediaFullBrowserScreen*/  field_54280 ; // ofs = 54280 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField, com.whatsapp.client.MediaFullBrowserScreen ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib net.rim.device.api.ui.Field.<init> // pc=1
	aload_0 
	aload_1 
	putfield com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54280   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54280   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54280   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54280   // getName->1:     // getName->2:     // getName->N:     // ofs = 54280 ord = 8 addr = 0
	aload_0 
	ldc literal_85:"{0}  {1}"
	putfield com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54248   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54248   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54248   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54248   // getName->1:     // getName->2:     // getName->N:     // ofs = 54248 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final updateOverlayText( com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField, module:WhatsApp-26.class#23, int, int ); // address: 0
	{
	enter 
	iload_3 
	iconst_1 
	if_icmple Label23
	aload_0 
	getstatic X_SLASH_Y // MediaFullBrowserScreen
	bipush 2
	newarray_object_lib net.rim.device.api.ui.Manager//net.rim.device.api.ui.Manager net.rim.device.api.ui.Manager net.rim.device.api.ui.Manager
	dup 
	iconst_0 
	iload_2 
	iconst_1 
	iadd 
	invokestatic_lib java.lang.String toString( int ) // Integer
	aastore 
	dup 
	iconst_1 
	iload_3 
	invokestatic_lib java.lang.String toString( int ) // Integer
	aastore 
	invokestatic_lib java.lang.String format( java.lang.String, java.lang.Object[] ) // MessageFormat
	putfield com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54264   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54264   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54264   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54264   // getName->1:     // getName->2:     // getName->N:     // ofs = 54264 ord = 4 addr = 0
	goto Label26
Label23:
	aload_0 
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	putfield com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54264   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54264   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54264   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54264   // getName->1:     // getName->2:     // getName->N:     // ofs = 54264 ord = 4 addr = 0
Label26:
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54280   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54280   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54280   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54280   // getName->1:     // getName->2:     // getName->N:     // ofs = 54280 ord = 8 addr = 0
	getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 53956 ord = 9 addr = 0
	ifnull Label46
	aload_0 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54280   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54280   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54280   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54280   // getName->1:     // getName->2:     // getName->N:     // ofs = 54280 ord = 8 addr = 0
	getfield _title   // get_name_1:  _title   // get_name_2:  _title   // get_Name:    _title   // getName->1:  _title   // getName->2:  _title   // getName->N:  _title   // ofs = 53948 ord = 7 addr = 0
	putfield com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54252   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54252   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54252   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54252   // getName->1:     // getName->2:     // getName->N:     // ofs = 54252 ord = 1 addr = 0
	aload_0 
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifeq Label41
	sipush 808
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	goto Label44
Label41:
	aload_1 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokestatic_lib module:WhatsApp-11.class#1.routine_1919(  ) // class#1
Label44:
	putfield com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54256   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54256   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54256   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54256   // getName->1:     // getName->2:     // getName->N:     // ofs = 54256 ord = 2 addr = 0
	goto Label53
Label46:
	aload_0 
	aconst_null 
	putfield com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54252   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54252   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54252   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54252   // getName->1:     // getName->2:     // getName->N:     // ofs = 54252 ord = 1 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54280   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54280   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54280   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54280   // getName->1:     // getName->2:     // getName->N:     // ofs = 54280 ord = 8 addr = 0
	getfield _title   // get_name_1:  _title   // get_name_2:  _title   // get_Name:    _title   // getName->1:  _title   // getName->2:  _title   // getName->N:  _title   // ofs = 53948 ord = 7 addr = 0
	putfield com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54256   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54256   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54256   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54256   // getName->1:     // getName->2:     // getName->N:     // ofs = 54256 ord = 2 addr = 0
Label53:
	aload_0 
	ldc literal_85:"{0}  {1}"
	bipush 2
	newarray_object_lib net.rim.device.api.ui.Manager//net.rim.device.api.ui.Manager net.rim.device.api.ui.Manager net.rim.device.api.ui.Manager
	dup 
	iconst_0 
	getstatic_lib module:WhatsApp-2.class#3.static_10 // class#3
	aload_1 
	lgetfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokevirtual java.lang.String formatLocal( net.rim.device.api.i18n.DateFormat, long ) // pc=3
	aastore 
	dup 
	iconst_1 
	getstatic_lib module:WhatsApp-2.class#3.static_11 // class#3
	aload_1 
	lgetfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokevirtual java.lang.String formatLocal( net.rim.device.api.i18n.DateFormat, long ) // pc=3
	aastore 
	invokestatic_lib java.lang.String format( java.lang.String, java.lang.Object[] ) // MessageFormat
	putfield com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54260   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54260   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54260   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54260   // getName->1:     // getName->2:     // getName->N:     // ofs = 54260 ord = 3 addr = 0
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Field ) // pc=1
	return 
	}


public final int getPreferredWidth( com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField ); // address: 0
	{
	enter_narrow 
	invokestatic_lib int getWidth(  ) // Display
	ireturn 
	}


public final int getPreferredHeight( com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-60.class#2.routine_833(  ) // class#2
Label3:
	bipush 46
	ireturn 
Label5:
	bipush 58
	ireturn 
Label7:
	bipush 74
	ireturn 
Label9:
	bipush 96
	ireturn 
Label11:
	aload_0 
	invokespecial_lib net.rim.device.api.ui.Field.getPreferredHeight // pc=1
	ireturn 
	}


protected final layout( com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField, int, int ); // address: 0
	{
	enter 
	aload_0 
	invokenonvirtual com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.getPreferredWidth // pc=1
	iload_1 
	invokestatic_lib int min( int, int ) // Math
	istore_1 
	aload_0 
	invokenonvirtual com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.getPreferredHeight // pc=1
	iload_2 
	invokestatic_lib int min( int, int ) // Math
	istore_2 
	aload_0 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	iconst_0 
	iload_2 
	bipush 3
	idiv 
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int, int ) // pc=3
	putfield com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54268   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54268   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54268   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54268   // getName->1:     // getName->2:     // getName->N:     // ofs = 54268 ord = 5 addr = 0
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54268   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54268   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54268   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54268   // getName->1:     // getName->2:     // getName->N:     // ofs = 54268 ord = 5 addr = 0
	invokevirtual int getAscent( net.rim.device.api.ui.Font ) // pc=1
	op01xx 
	i2f 
	isreal 
	iipush 1061158912
	op01xx 
	fmul 
	invokestatic_lib int round( float ) // MathUtilities
	istore_3 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54268   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54268   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54268   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54268   // getName->1:     // getName->2:     // getName->N:     // ofs = 54268 ord = 5 addr = 0
	invokevirtual int getDescent( net.rim.device.api.ui.Font ) // pc=1
	iload_3 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54268   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54268   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54268   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54268   // getName->1:     // getName->2:     // getName->N:     // ofs = 54268 ord = 5 addr = 0
	invokevirtual int getLeading( net.rim.device.api.ui.Font ) // pc=1
	invokestatic int max( int, int, int ) // MediaFullBrowserScreen
	istore_4 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54268   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54268   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54268   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54268   // getName->1:     // getName->2:     // getName->N:     // ofs = 54268 ord = 5 addr = 0
	invokevirtual int getAscent( net.rim.device.api.ui.Font ) // pc=1
	iload_4 
	iadd 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54268   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54268   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54268   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54268   // getName->1:     // getName->2:     // getName->N:     // ofs = 54268 ord = 5 addr = 0
	invokevirtual int getAscent( net.rim.device.api.ui.Font ) // pc=1
	iadd 
	istore_5 
	aload_0 
	iload_2 
	iload_5 
	isub 
	bipush 2
	idiv 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54268   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54268   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54268   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54268   // getName->1:     // getName->2:     // getName->N:     // ofs = 54268 ord = 5 addr = 0
	invokevirtual int getLeading( net.rim.device.api.ui.Font ) // pc=1
	isub 
	putfield com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54272   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54272   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54272   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54272   // getName->1:     // getName->2:     // getName->N:     // ofs = 54272 ord = 6 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54272   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54272   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54272   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54272   // getName->1:     // getName->2:     // getName->N:     // ofs = 54272 ord = 6 addr = 0
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54268   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54268   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54268   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54268   // getName->1:     // getName->2:     // getName->N:     // ofs = 54268 ord = 5 addr = 0
	invokevirtual int getLeading( net.rim.device.api.ui.Font ) // pc=1
	iadd 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54268   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54268   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54268   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54268   // getName->1:     // getName->2:     // getName->N:     // ofs = 54268 ord = 5 addr = 0
	invokevirtual int getAscent( net.rim.device.api.ui.Font ) // pc=1
	iadd 
	iload_4 
	iadd 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54268   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54268   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54268   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54268   // getName->1:     // getName->2:     // getName->N:     // ofs = 54268 ord = 5 addr = 0
	invokevirtual int getLeading( net.rim.device.api.ui.Font ) // pc=1
	isub 
	putfield com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54276   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54276   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54276   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54276   // getName->1:     // getName->2:     // getName->N:     // ofs = 54276 ord = 7 addr = 0
	aload_0 
	iload_1 
	iload_2 
	invokevirtual setExtent( net.rim.device.api.ui.Field, int, int ) // pc=3
	return 
	}


protected final paint( com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual int getColor( net.rim.device.api.ui.Graphics ) // pc=1
	istore_2 
	aload_1 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Graphics ) // pc=1
	astore_3 
	aload_1 
	iipush 16777215
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54268   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54268   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54268   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54268   // getName->1:     // getName->2:     // getName->N:     // ofs = 54268 ord = 5 addr = 0
	invokevirtual setFont( net.rim.device.api.ui.Graphics, net.rim.device.api.ui.Font ) // pc=2
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	istore_4 
	aload_1 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54260   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54260   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54260   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54260   // getName->1:     // getName->2:     // getName->N:     // ofs = 54260 ord = 3 addr = 0
	bipush 16
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54272   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54272   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54272   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54272   // getName->1:     // getName->2:     // getName->N:     // ofs = 54272 ord = 6 addr = 0
	bipush 5
	iload_4 
	bipush 32
	isub 
	invokevirtual int drawText( net.rim.device.api.ui.Graphics, java.lang.String, int, int, int, int ) // pc=6
	istore_5 
	aload_1 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54264   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54264   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54264   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54264   // getName->1:     // getName->2:     // getName->N:     // ofs = 54264 ord = 4 addr = 0
	bipush 16
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54276   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54276   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54276   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54276   // getName->1:     // getName->2:     // getName->N:     // ofs = 54276 ord = 7 addr = 0
	bipush 5
	iload_4 
	bipush 32
	isub 
	invokevirtual int drawText( net.rim.device.api.ui.Graphics, java.lang.String, int, int, int, int ) // pc=6
	istore_6 
	iload_5 
	iload_6 
	invokestatic_lib int max( int, int ) // Math
	bipush 32
	iadd 
	istore_7 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54252   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54252   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54252   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54252   // getName->1:     // getName->2:     // getName->N:     // ofs = 54252 ord = 1 addr = 0
	ifnull Label71
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54268   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54268   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54268   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54268   // getName->1:     // getName->2:     // getName->N:     // ofs = 54268 ord = 5 addr = 0
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54252   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54252   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54252   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54252   // getName->1:     // getName->2:     // getName->N:     // ofs = 54252 ord = 1 addr = 0
	iload_4 
	iload_7 
	isub 
	bipush 16
	isub 
	invokestatic_lib module:WhatsApp-24.class#16.routine_5769(  ) // class#16
	astore 8
	aload_1 
	aload 8
	bipush 16
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54272   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54272   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54272   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54272   // getName->1:     // getName->2:     // getName->N:     // ofs = 54272 ord = 6 addr = 0
	invokestatic_lib module:WhatsApp-24.class#16.routine_4892(  ) // class#16
	aload_1 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54256   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54256   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54256   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54256   // getName->1:     // getName->2:     // getName->N:     // ofs = 54256 ord = 2 addr = 0
	bipush 16
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54276   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54276   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54276   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54276   // getName->1:     // getName->2:     // getName->N:     // ofs = 54276 ord = 7 addr = 0
	bipush 64
	iload_4 
	iload_7 
	isub 
	bipush 16
	isub 
	invokevirtual int drawText( net.rim.device.api.ui.Graphics, java.lang.String, int, int, int, int ) // pc=6
	pop 
	goto Label83
Label71:
	aload_1 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54256   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54256   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54256   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54256   // getName->1:     // getName->2:     // getName->N:     // ofs = 54256 ord = 2 addr = 0
	bipush 16
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54272   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54272   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54272   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.field_54272   // getName->1:     // getName->2:     // getName->N:     // ofs = 54272 ord = 6 addr = 0
	bipush 64
	iload_4 
	iload_7 
	isub 
	bipush 16
	isub 
	invokevirtual int drawText( net.rim.device.api.ui.Graphics, java.lang.String, int, int, int, int ) // pc=6
	pop 
Label83:
	aload_1 
	aload_3 
	invokevirtual setFont( net.rim.device.api.ui.Graphics, net.rim.device.api.ui.Font ) // pc=2
	aload_1 
	iload_2 
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	return 
	}

}
