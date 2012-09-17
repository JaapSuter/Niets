// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-13.cod
// Module version  : 2.7.3204
// Class ID        : 1
// ########################################################


package com.whatsapp.client;


abstract final class ContactInfo extends Object

{
	// @@@@@@@@@@@@@ Static fields 
	private static com.whatsapp.client.ContactInfoDetailsNameComparator /*com.whatsapp.client.ContactInfoDetailsNameComparator*/  field_53288 ; // ofs = 53288 addr = 4)
	private static com.whatsapp.client.ContactInfoDetailsNameComparator /*com.whatsapp.client.ContactInfoDetailsNameComparator*/  field_53294 ; // ofs = 53294 addr = 5)

	// @@@@@@@@@@@@@ Fields 
	private net.rim.device.api.collection.util.BigVector /*net.rim.device.api.collection.util.BigVector*/  field_53244 ; // ofs = 53244 addr = 0)
	private net.rim.device.api.collection.util.BigVector /*net.rim.device.api.collection.util.BigVector*/  field_53248 ; // ofs = 53248 addr = 0)
	public java.util.Hashtable /*java.util.Hashtable*/  _contactsByUID ; // ofs = 53252 addr = 0)
	public java.util.Hashtable /*java.util.Hashtable*/  _contactsByPhone ; // ofs = 53256 addr = 0)
	private java.util.Hashtable /*java.util.Hashtable*/  field_53260 ; // ofs = 53260 addr = 0)
	private java.util.Hashtable /*java.util.Hashtable*/  field_53264 ; // ofs = 53264 addr = 0)
	public int /*int*/  _contactsSortOrder ; // ofs = 53268 addr = 0)
	public String /*java.lang.String*/  _userDefinedLabel1 ; // ofs = 53272 addr = 0)
	public String /*java.lang.String*/  _userDefinedLabel2 ; // ofs = 53276 addr = 0)
	public String /*java.lang.String*/  _userDefinedLabel3 ; // ofs = 53280 addr = 0)
	public String /*java.lang.String*/  _userDefinedLabel4 ; // ofs = 53284 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.ContactInfo ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	new_lib net.rim.device.api.ui.ScreenUiEngineAttachedListener//net.rim.device.api.ui.ScreenUiEngineAttachedListener net.rim.device.api.ui.ScreenUiEngineAttachedListener net.rim.device.api.ui.ScreenUiEngineAttachedListener
	dup 
	sipush 1000
	invokespecial_lib net.rim.device.api.collection.util.BigVector.<init> // pc=2
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	new_lib net.rim.device.api.ui.ScreenUiEngineAttachedListener//net.rim.device.api.ui.ScreenUiEngineAttachedListener net.rim.device.api.ui.ScreenUiEngineAttachedListener net.rim.device.api.ui.ScreenUiEngineAttachedListener
	dup 
	sipush 1000
	invokespecial_lib net.rim.device.api.collection.util.BigVector.<init> // pc=2
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	iconst_0 
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0 
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	sipush 1000
	invokespecial_lib java.util.Hashtable.<init> // pc=2
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	sipush 1000
	invokespecial_lib java.util.Hashtable.<init> // pc=2
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	sipush 1000
	invokespecial_lib java.util.Hashtable.<init> // pc=2
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	sipush 1000
	invokespecial_lib java.util.Hashtable.<init> // pc=2
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0 
	invokespecial com.whatsapp.client.ContactInfo.routine_4639 // pc=1
	return 
	}


static private final java.util.Vector com.whatsapp.client.ContactInfo.routine_5609( net.rim.device.api.collection.util.BigVector, java.lang.String, int ); // address: 0
	{
	enter 
	new_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_3 
	invokestatic java.util.Hashtable getStatuses(  ) // ContactStatuses
	astore_4 
	aload_1 
	bipush 32
	iconst_0 
	invokestatic_lib module:WhatsApp-35.class#0.routine_4869(  ) // class#0
	astore_5 
	aload_0 
	invokevirtual int size( net.rim.device.api.collection.util.BigVector ) // pc=1
	istore_6 
	iconst_0 
	istore_7 
Label17:
	iload_7 
	iload_6 
	if_icmpge Label66
	aload_0 
	iload_7 
	invokevirtual java.lang.Object elementAt( net.rim.device.api.collection.util.BigVector, int ) // pc=2
	checkcast_lib com.whatsapp.client.ContactInfoDetails//module:WhatsApp.class#12 module:WhatsApp.class#12 module:WhatsApp.class#12
	astore 8
	aload_5 
	arraylength 
	ifle Label55
	iconst_1 
	istore 9
	iconst_0 
	istore 10
Label32:
	iload 10
	aload_5 
	arraylength 
	if_icmpge Label49
	aload_5 
	iload 10
	aaload 
	iload_2 
	aload_4 
	aload 8
	invokestatic boolean com.whatsapp.client.ContactInfo.routine_5887( java.lang.String, int, java.util.Hashtable, module:WhatsApp.class#12 ) // ContactInfo
	ifne Label47
	iconst_0 
	istore 9
	goto Label49
Label47:
	iinc 10 1
	goto Label32
Label49:
	iload 9
	ifeq Label64
	aload_3 
	aload 8
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	goto Label64
Label55:
	aconst_null 
	iload_2 
	aload_4 
	aload 8
	invokestatic boolean com.whatsapp.client.ContactInfo.routine_5887( java.lang.String, int, java.util.Hashtable, module:WhatsApp.class#12 ) // ContactInfo
	ifeq Label64
	aload_3 
	aload 8
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label64:
	iinc 7 1
	goto Label17
Label66:
	aload_3 
	areturn 
	}


static public final java.util.Vector filterContactsWithKeyword( java.util.Vector, java.lang.String, int ); // address: 0
	{
	enter 
	new_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_3 
	invokestatic java.util.Hashtable getStatuses(  ) // ContactStatuses
	astore_4 
	aload_0 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_5 
	iconst_0 
	istore_6 
Label12:
	iload_6 
	iload_5 
	if_icmpge Label52
	aload_0 
	iload_6 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	astore_7 
	aload_7 
	checkcastbranch_lib 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	astore 8
	goto Label41
Label24:
	aload_7 
	checkcastbranch_lib 
	astore 8
	goto Label41
Label28:
	new_lib net.rim.device.api.system.ObjectGroup//net.rim.device.api.system.ObjectGroup net.rim.device.api.system.ObjectGroup net.rim.device.api.system.ObjectGroup
	dup 
	new_lib net.rim.device.api.util.IntVector//net.rim.device.api.util.IntVector net.rim.device.api.util.IntVector net.rim.device.api.util.IntVector
	dup 
	ldc literal_55:"Unknown type filtering contacts: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_7 
	invokenonvirtual_lib java.lang.Object.getClass // pc=1
	invokevirtual java.lang.String getName( java.lang.Class ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib java.lang.RuntimeException.<init> // pc=2
	athrow 
Label41:
	aload_1 
	iload_2 
	aload_4 
	aload 8
	invokestatic boolean com.whatsapp.client.ContactInfo.routine_5887( java.lang.String, int, java.util.Hashtable, module:WhatsApp.class#12 ) // ContactInfo
	ifeq Label50
	aload_3 
	aload_7 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label50:
	iinc 6 1
	goto Label12
Label52:
	aload_3 
	areturn 
	}


static private final boolean com.whatsapp.client.ContactInfo.routine_5887( java.lang.String, int, java.util.Hashtable, module:WhatsApp.class#12 ); // address: 0
	{
	enter 
	iload_1 
	iconst_1 
	if_icmpne Label11
	aload_3 
	aload_2 
	invokenonvirtual_lib .routine_6447 // pc=2
	ifne Label11
	iconst_0 
	istore_4 
	goto Label26
Label11:
	aload_0 
	ifnull Label24
	aload_0 
	stringlength 
	ifle Label24
	aload_3 
	aload_0 
	invokenonvirtual_lib java.lang.String.toLowerCase // pc=1
	invokestatic boolean casefreeKeywordMatch( module:WhatsApp.class#12, java.lang.String ) // ContactInfo
	ifne Label24
	iconst_0 
	istore_4 
	goto Label26
Label24:
	iconst_1 
	istore_4 
Label26:
	iload_4 
	ireturn 
	}


static public final boolean casefreeKeywordMatch( module:WhatsApp.class#12, java.lang.String ); // address: 0
	{
	enter 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	astore_2 
	aload_2 
	bipush 32
	iconst_0 
	invokestatic_lib module:WhatsApp-35.class#0.routine_4869(  ) // class#0
	astore_3 
	aload_3 
	arraylength 
	iconst_1 
	isub 
	istore_4 
Label13:
	iload_4 
	iflt Label29
	aload_3 
	iload_4 
	aaload 
	ifnull Label27
	aload_3 
	iload_4 
	aaload 
	aload_1 
	invokestatic_lib boolean startsWithIgnoreCaseAndAccents( java.lang.String, java.lang.String ) // StringUtilities
	ifeq Label27
	iconst_1 
	ireturn 
Label27:
	iinc 4 -1
	goto Label13
Label29:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	astore_4 
	aload_4 
	bipush 32
	iconst_0 
	invokestatic_lib module:WhatsApp-35.class#0.routine_4869(  ) // class#0
	astore_5 
	aload_5 
	arraylength 
	iconst_1 
	isub 
	istore_6 
Label41:
	iload_6 
	iflt Label57
	aload_5 
	iload_6 
	aaload 
	ifnull Label55
	aload_5 
	iload_6 
	aaload 
	aload_1 
	invokestatic_lib boolean startsWithIgnoreCaseAndAccents( java.lang.String, java.lang.String ) // StringUtilities
	ifeq Label55
	iconst_1 
	ireturn 
Label55:
	iinc 6 -1
	goto Label41
Label57:
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	astore_6 
	aload_6 
	bipush 32
	iconst_0 
	invokestatic_lib module:WhatsApp-35.class#0.routine_4869(  ) // class#0
	astore_7 
	aload_7 
	arraylength 
	iconst_1 
	isub 
	istore 8
Label69:
	iload 8
	iflt Label85
	aload_7 
	iload 8
	aaload 
	ifnull Label83
	aload_7 
	iload 8
	aaload 
	aload_1 
	invokestatic_lib boolean startsWithIgnoreCaseAndAccents( java.lang.String, java.lang.String ) // StringUtilities
	ifeq Label83
	iconst_1 
	ireturn 
Label83:
	iinc 8 -1
	goto Label69
Label85:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	astore 8
	aload 8
	bipush 32
	iconst_0 
	invokestatic_lib module:WhatsApp-35.class#0.routine_4869(  ) // class#0
	astore 9
	aload 9
	arraylength 
	iconst_1 
	isub 
	istore 10
Label97:
	iload 10
	iflt Label113
	aload 9
	iload 10
	aaload 
	ifnull Label111
	aload 9
	iload 10
	aaload 
	aload_1 
	invokestatic_lib boolean startsWithIgnoreCaseAndAccents( java.lang.String, java.lang.String ) // StringUtilities
	ifeq Label111
	iconst_1 
	ireturn 
Label111:
	iinc 10 -1
	goto Label97
Label113:
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	astore 10
	aload 10
	ifnull Label120
	aload 10
	invokenonvirtual_lib java.lang.String.toLowerCase // pc=1
	astore 10
Label120:
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	astore 11
	aload 11
	ifnull Label127
	aload 11
	invokenonvirtual_lib java.lang.String.toLowerCase // pc=1
	astore 11
Label127:
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	astore 12
	aload 12
	ifnull Label134
	aload 12
	invokenonvirtual_lib java.lang.String.toLowerCase // pc=1
	astore 12
Label134:
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	astore 13
	aload 13
	ifnull Label141
	aload 13
	invokenonvirtual_lib java.lang.String.toLowerCase // pc=1
	astore 13
Label141:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	astore 14
	aload 14
	ifnull Label148
	aload 14
	invokenonvirtual_lib java.lang.String.toLowerCase // pc=1
	astore 14
Label148:
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	astore 15
	aload 15
	ifnull Label155
	aload 15
	invokenonvirtual_lib java.lang.String.toLowerCase // pc=1
	astore 15
Label155:
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	astore 16
	aload 16
	ifnull Label162
	aload 16
	invokenonvirtual_lib java.lang.String.toLowerCase // pc=1
	astore 16
Label162:
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	astore 17
	aload 17
	ifnull Label169
	aload 17
	invokenonvirtual_lib java.lang.String.toLowerCase // pc=1
	astore 17
Label169:
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	astore 18
	aload 10
	ifnull Label180
	aload 10
	aload_1 
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	bipush -1
	if_icmple Label180
	iconst_1 
	ireturn 
Label180:
	aload 11
	ifnull Label189
	aload 11
	aload_1 
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	bipush -1
	if_icmple Label189
	iconst_1 
	ireturn 
Label189:
	aload 12
	ifnull Label198
	aload 12
	aload_1 
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	bipush -1
	if_icmple Label198
	iconst_1 
	ireturn 
Label198:
	aload 13
	ifnull Label207
	aload 13
	aload_1 
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	bipush -1
	if_icmple Label207
	iconst_1 
	ireturn 
Label207:
	aload 14
	ifnull Label216
	aload 14
	aload_1 
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	bipush -1
	if_icmple Label216
	iconst_1 
	ireturn 
Label216:
	aload 15
	ifnull Label225
	aload 15
	aload_1 
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	bipush -1
	if_icmple Label225
	iconst_1 
	ireturn 
Label225:
	aload 16
	ifnull Label234
	aload 16
	aload_1 
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	bipush -1
	if_icmple Label234
	iconst_1 
	ireturn 
Label234:
	aload 17
	ifnull Label243
	aload 17
	aload_1 
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	bipush -1
	if_icmple Label243
	iconst_1 
	ireturn 
Label243:
	aload 18
	invokevirtual int size( java.util.Vector ) // pc=1
	iconst_1 
	isub 
	istore 19
Label248:
	iload 19
	iflt Label267
	aload 18
	iload 19
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore 20
	aload 20
	ifnull Label265
	aload 20
	invokenonvirtual_lib java.lang.String.toLowerCase // pc=1
	aload_1 
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	bipush -1
	if_icmple Label265
	iconst_1 
	ireturn 
Label265:
	iinc 19 -1
	goto Label248
Label267:
	iconst_0 
	ireturn 
	}


static private final com.whatsapp.client.ContactInfo.routine_6513( module:WhatsApp.class#12 ); // address: 0
	{
	enter 
	aload_0 
	ifnull Label8
	aload_0 
	iconst_0 
	invokenonvirtual_lib .routine_6025 // pc=2
	astore_1 
	goto Label10
Label8:
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	astore_1 
Label10:
	sipush 827
	aload_1 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	astore_2 
	new_lib java.util.Enumeration//java.util.Enumeration java.util.Enumeration java.util.Enumeration
	dup 
	new ContactInfo$1
	dup 
	aload_2 
	invokespecial com.whatsapp.client.ContactInfo$1.<init> // pc=2
	invokespecial_lib java.lang.Thread.<init> // pc=2
	invokevirtual start( java.lang.Thread ) // pc=1
	return 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	synch_static ContactInfo
	clinit_wait 
	new ContactInfoDetailsNameComparator
	dup 
	iconst_0 
	invokespecial com.whatsapp.client.ContactInfoDetailsNameComparator.<init> // pc=2
	putstatic com.whatsapp.client.ContactInfo.field_53288 // ContactInfo
	new ContactInfoDetailsNameComparator
	dup 
	iconst_1 
	invokespecial com.whatsapp.client.ContactInfoDetailsNameComparator.<init> // pc=2
	putstatic com.whatsapp.client.ContactInfo.field_53294 // ContactInfo
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

final addContact( com.whatsapp.client.ContactInfo, module:WhatsApp.class#12 ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokevirtual addElement( net.rim.device.api.collection.util.BigVector, java.lang.Object ) // pc=2
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_1 
	invokevirtual addElement( net.rim.device.api.collection.util.BigVector, java.lang.Object ) // pc=2
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnull Label16
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
Label16:
	aload_1 
	invokenonvirtual_lib .routine_6738 // pc=1
	astore_2 
	iconst_0 
	istore_3 
Label21:
	iload_3 
	aload_2 
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label34
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_2 
	iload_3 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	aload_1 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	iinc 3 1
	goto Label21
Label34:
	return 
	}


final clear( com.whatsapp.client.ContactInfo ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual removeAll( net.rim.device.api.collection.util.BigVector ) // pc=1
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual removeAll( net.rim.device.api.collection.util.BigVector ) // pc=1
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual clear( java.util.Hashtable ) // pc=1
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokevirtual clear( java.util.Hashtable ) // pc=1
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual clear( java.util.Hashtable ) // pc=1
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokevirtual clear( java.util.Hashtable ) // pc=1
	aload_0 
	iconst_0 
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0 
	aconst_null 
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_0 
	aconst_null 
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_0 
	aconst_null 
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_0 
	aconst_null 
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	return 
	}


public final resort( com.whatsapp.client.ContactInfo ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getstatic com.whatsapp.client.ContactInfo.field_53288 // ContactInfo
	invokevirtual sort( net.rim.device.api.collection.util.BigVector, net.rim.device.api.util.Comparator ) // pc=2
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getstatic com.whatsapp.client.ContactInfo.field_53294 // ContactInfo
	invokevirtual sort( net.rim.device.api.collection.util.BigVector, net.rim.device.api.util.Comparator ) // pc=2
	return 
	}


public final net.rim.device.api.system.EncodedImage getPhotoForUID( com.whatsapp.client.ContactInfo, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_1 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib net.rim.device.api.system.EncodedImage//net.rim.device.api.system.EncodedImage net.rim.device.api.system.EncodedImage net.rim.device.api.system.EncodedImage
	areturn 
	}


public final net.rim.device.api.system.Bitmap getPhotoForUID( com.whatsapp.client.ContactInfo, java.lang.String, int, int ); // address: 0
	{
	enter 
	new ContactInfo$ScaledPhotoKey
	dup 
	aload_1 
	iload_2 
	iload_3 
	invokespecial com.whatsapp.client.ContactInfo$ScaledPhotoKey.<init> // pc=4
	astore_4 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_4 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib net.rim.device.api.collection.util.BigVector//net.rim.device.api.collection.util.BigVector net.rim.device.api.collection.util.BigVector net.rim.device.api.collection.util.BigVector
	astore_5 
	aload_5 
	ifnonnull Label17
	aconst_null 
	goto Label20
Label17:
	aload_5 
	invokevirtual java.lang.Object get( java.lang.ref.Reference ) // pc=1
	checkcast_lib net.rim.device.api.system.EncodedImage//net.rim.device.api.system.EncodedImage net.rim.device.api.system.EncodedImage net.rim.device.api.system.EncodedImage
Label20:
	astore_6 
	aload_6 
	ifnonnull Label49
	aload_0 
	aload_1 
	invokenonvirtual com.whatsapp.client.ContactInfo.getPhotoForUID // pc=2
	astore_7 
	aload_7 
	ifnonnull Label32
	aconst_null 
	astore_6 
	goto Label49
Label32:
	aload_7 
	iload_2 
	iload_3 
	invokestatic net.rim.device.api.system.Bitmap scalePhoto( net.rim.device.api.system.EncodedImage, int, int ) // ContactShortcuts
	astore_6 
	aload_6 
	invokestatic_lib module:WhatsApp-35.class#0.routine_5761(  ) // class#0
	new_lib net.rim.device.api.collection.util.BigVector//net.rim.device.api.collection.util.BigVector net.rim.device.api.collection.util.BigVector net.rim.device.api.collection.util.BigVector
	dup 
	aload_6 
	invokespecial_lib java.lang.ref.WeakReference.<init> // pc=2
	astore_5 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_4 
	aload_5 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
Label49:
	aload_6 
	areturn 
	}


public final putPhotoForUID( com.whatsapp.client.ContactInfo, java.lang.String, net.rim.device.api.system.EncodedImage ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_1 
	aload_2 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	return 
	}


final module:WhatsApp.class#12 getContactInfoDetails( com.whatsapp.client.ContactInfo, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	astore_2 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iconst_1 
	if_icmpne Label8
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	astore_2 
Label8:
	aload_2 
	iload_1 
	invokevirtual java.lang.Object elementAt( net.rim.device.api.collection.util.BigVector, int ) // pc=2
	checkcast_lib com.whatsapp.client.ContactInfoDetails//module:WhatsApp.class#12 module:WhatsApp.class#12 module:WhatsApp.class#12
	areturn 
	}


final java.util.Vector getContactInfoDetailsListItemsForContactsWithKeyword( com.whatsapp.client.ContactInfo, java.lang.String ); // address: 0
	{
	enter 
	aload_1 
	stringlength 
	ifne Label6
	iconst_1 
	goto Label7
Label6:
	iconst_0 
Label7:
	istore_2 
	aload_1 
	invokenonvirtual_lib java.lang.String.toLowerCase // pc=1
	astore_3 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	astore_4 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iconst_1 
	if_icmpne Label18
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	astore_4 
Label18:
	invokestatic java.util.Hashtable getStatuses(  ) // ContactStatuses
	astore_5 
	new_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_6 
	aload_4 
	invokevirtual int size( net.rim.device.api.collection.util.BigVector ) // pc=1
	istore_7 
	aconst_null 
	astore 8
	iconst_0 
	istore 9
	iconst_0 
	istore 10
Label33:
	iload 10
	iload_7 
	if_icmplt Label37
	goto_w Label287
Label37:
	iconst_0 
	istore 9
	aload_4 
	iload 10
	invokevirtual java.lang.Object elementAt( net.rim.device.api.collection.util.BigVector, int ) // pc=2
	checkcast_lib com.whatsapp.client.ContactInfoDetails//module:WhatsApp.class#12 module:WhatsApp.class#12 module:WhatsApp.class#12
	astore 8
	aload 8
	aload_5 
	invokenonvirtual_lib .routine_6447 // pc=2
	ifeq Label49
	goto_w Label285
Label49:
	iload_2 
	ifeq Label57
	aload 8
	aload_6 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iload 10
	invokenonvirtual_lib .routine_7096 // pc=4
	goto_w Label285
Label57:
	aload 8
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	astore 12
	aload 8
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	astore 13
	aload 8
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	astore 14
	aload 8
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	astore 15
	aload 8
	getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	astore 16
	aload 16
	ifnull Label77
	aload 16
	invokenonvirtual_lib java.lang.String.toLowerCase // pc=1
	astore 16
Label77:
	aload 8
	getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	astore 17
	aload 17
	ifnull Label85
	aload 17
	invokenonvirtual_lib java.lang.String.toLowerCase // pc=1
	astore 17
Label85:
	aload 8
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	astore 18
	aload 18
	ifnull Label93
	aload 18
	invokenonvirtual_lib java.lang.String.toLowerCase // pc=1
	astore 18
Label93:
	aload 8
	getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	astore 19
	aload 19
	ifnull Label101
	aload 19
	invokenonvirtual_lib java.lang.String.toLowerCase // pc=1
	astore 19
Label101:
	aload 8
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	astore 20
	aload 20
	ifnull Label109
	aload 20
	invokenonvirtual_lib java.lang.String.toLowerCase // pc=1
	astore 20
Label109:
	aload 8
	getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	astore 21
	aload 21
	ifnull Label117
	aload 21
	invokenonvirtual_lib java.lang.String.toLowerCase // pc=1
	astore 21
Label117:
	aload 8
	getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	astore 22
	aload 22
	ifnull Label125
	aload 22
	invokenonvirtual_lib java.lang.String.toLowerCase // pc=1
	astore 22
Label125:
	aload 8
	getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	astore 23
	aload 23
	ifnull Label133
	aload 23
	invokenonvirtual_lib java.lang.String.toLowerCase // pc=1
	astore 23
Label133:
	aload 8
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	astore 24
	aload 12
	ifnull Label145
	aload 12
	aload_1 
	invokestatic_lib boolean startsWithIgnoreCaseAndAccents( java.lang.String, java.lang.String ) // StringUtilities
	ifeq Label145
	iconst_1 
	istore 9
	goto_w Label278
Label145:
	aload 13
	ifnull Label154
	aload 13
	aload_1 
	invokestatic_lib boolean startsWithIgnoreCaseAndAccents( java.lang.String, java.lang.String ) // StringUtilities
	ifeq Label154
	iconst_1 
	istore 9
	goto_w Label278
Label154:
	aload 14
	ifnull Label163
	aload 14
	aload_1 
	invokestatic_lib boolean startsWithIgnoreCaseAndAccents( java.lang.String, java.lang.String ) // StringUtilities
	ifeq Label163
	iconst_1 
	istore 9
	goto_w Label278
Label163:
	aload 15
	ifnull Label172
	aload 15
	aload_1 
	invokestatic_lib boolean startsWithIgnoreCaseAndAccents( java.lang.String, java.lang.String ) // StringUtilities
	ifeq Label172
	iconst_1 
	istore 9
	goto_w Label278
Label172:
	aload 16
	ifnull Label182
	aload 16
	aload_3 
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	bipush -1
	if_icmple Label182
	iconst_1 
	istore 9
	goto_w Label278
Label182:
	aload 17
	ifnull Label192
	aload 17
	aload_3 
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	bipush -1
	if_icmple Label192
	iconst_1 
	istore 9
	goto_w Label278
Label192:
	aload 18
	ifnull Label202
	aload 18
	aload_3 
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	bipush -1
	if_icmple Label202
	iconst_1 
	istore 9
	goto_w Label278
Label202:
	aload 19
	ifnull Label212
	aload 19
	aload_3 
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	bipush -1
	if_icmple Label212
	iconst_1 
	istore 9
	goto_w Label278
Label212:
	aload 20
	ifnull Label222
	aload 20
	aload_3 
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	bipush -1
	if_icmple Label222
	iconst_1 
	istore 9
	goto Label278
Label222:
	aload 21
	ifnull Label232
	aload 21
	aload_3 
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	bipush -1
	if_icmple Label232
	iconst_1 
	istore 9
	goto Label278
Label232:
	aload 22
	ifnull Label242
	aload 22
	aload_3 
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	bipush -1
	if_icmple Label242
	iconst_1 
	istore 9
	goto Label278
Label242:
	aload 23
	ifnull Label252
	aload 23
	aload_3 
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	bipush -1
	if_icmple Label252
	iconst_1 
	istore 9
	goto Label278
Label252:
	aload 24
	invokevirtual int size( java.util.Vector ) // pc=1
	iconst_1 
	isub 
	istore 25
Label257:
	iload 25
	iflt Label278
	iload 9
	ifne Label278
	aload 24
	iload 25
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore 26
	aload 26
	ifnull Label276
	aload 26
	invokenonvirtual_lib java.lang.String.toLowerCase // pc=1
	aload_3 
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	bipush -1
	if_icmple Label276
	iconst_1 
	istore 9
Label276:
	iinc 25 -1
	goto Label257
Label278:
	iload 9
	ifeq Label285
	aload 8
	aload_6 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iload 10
	invokenonvirtual_lib .routine_7096 // pc=4
Label285:
	iinc 10 1
	goto_w Label33
Label287:
	aload_6 
	areturn 
	}


public final java.util.Vector getContactsWithKeyword( com.whatsapp.client.ContactInfo, java.lang.String, int ); // address: 0
	{
	enter 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iconst_1 
	if_icmpne Label7
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	astore_3 
	goto Label9
Label7:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	astore_3 
Label9:
	aload_3 
	aload_1 
	iload_2 
	invokestatic java.util.Vector com.whatsapp.client.ContactInfo.routine_5609( net.rim.device.api.collection.util.BigVector, java.lang.String, int ) // ContactInfo
	areturn 
	}


final int getSize( com.whatsapp.client.ContactInfo ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual int size( net.rim.device.api.collection.util.BigVector ) // pc=1
	ireturn 
	}


private final com.whatsapp.client.ContactInfo.routine_4639( com.whatsapp.client.ContactInfo ); // address: 0
	{
	enter 
	aload_0 
	invokenonvirtual com.whatsapp.client.ContactInfo.clear // pc=1
	invokestatic_lib module:WhatsApp-35.class#0.routine_291(  ) // class#0
	ifne Label6
	goto_w Label119
Label6:
	aconst_null 
	astore_1 
	aconst_null 
	astore_2 
	aconst_null 
	astore_3 
	invokestatic_lib javax.microedition.pim.PIM getInstance(  ) // BlackBerryPIM
	checkcast_lib net.rim.blackberry.api.pdap.BlackBerryPIM//net.rim.blackberry.api.pdap.BlackBerryPIM net.rim.blackberry.api.pdap.BlackBerryPIM net.rim.blackberry.api.pdap.BlackBerryPIM
	astore_4 
	aload_4 
	iconst_1 
	iconst_1 
	invokevirtual net.rim.blackberry.api.pdap.BlackBerryPIMList openUnifiedPIMList( net.rim.blackberry.api.pdap.BlackBerryPIM, int, int ) // pc=3
	checkcast_lib net.rim.blackberry.api.pdap.BlackBerryContactList//net.rim.blackberry.api.pdap.BlackBerryContactList net.rim.blackberry.api.pdap.BlackBerryContactList net.rim.blackberry.api.pdap.BlackBerryContactList
	astore_1 
	aload_0 
	aload_1 
	invokeinterface interfacemethodref_2 // pc=1 guess=0
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_1 
	iconst_1 
	invokeinterface interfacemethodref_3 // pc=2 guess=1
	astore_5 
Label29:
	aload_5 
	invokeinterface interfacemethodref_4 // pc=1 guess=2
	ifeq Label57
	aload_5 
	invokeinterface interfacemethodref_5 // pc=1 guess=3
	checkcast_lib net.rim.blackberry.api.pdap.BlackBerryContact//net.rim.blackberry.api.pdap.BlackBerryContact net.rim.blackberry.api.pdap.BlackBerryContact net.rim.blackberry.api.pdap.BlackBerryContact
	astore_3 
	goto Label41
	astore_6 
	aload_2 
	invokestatic com.whatsapp.client.ContactInfo.routine_6513( module:WhatsApp.class#12 ) // ContactInfo
	goto Label57
Label41:
	new_lib com.whatsapp.client.ContactInfoDetails//module:WhatsApp.class#12 module:WhatsApp.class#12 module:WhatsApp.class#12
	dup 
	invokespecial_lib .routine_9188 // pc=1
	astore_2 
	aload_2 
	aload_3 
	aload_0 
	invokenonvirtual_lib .routine_4571 // pc=3
	aload_2 
	invokestatic_lib createGroup( java.lang.Object ) // ObjectGroup
	goto Label53
	astore_6 
Label53:
	aload_0 
	aload_2 
	invokenonvirtual com.whatsapp.client.ContactInfo.addContact // pc=2
	goto Label29
Label57:
	aload_1 
	iipush 20000928
	invokeinterface interfacemethodref_6 // pc=2 guess=4
	ifeq Label66
	aload_0 
	aload_1 
	iipush 20000928
	invokeinterface interfacemethodref_7 // pc=2 guess=5
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
Label66:
	aload_1 
	iipush 20000929
	invokeinterface interfacemethodref_6 // pc=2 guess=4
	ifeq Label75
	aload_0 
	aload_1 
	iipush 20000929
	invokeinterface interfacemethodref_7 // pc=2 guess=5
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
Label75:
	aload_1 
	iipush 20000930
	invokeinterface interfacemethodref_6 // pc=2 guess=4
	ifeq Label84
	aload_0 
	aload_1 
	iipush 20000930
	invokeinterface interfacemethodref_7 // pc=2 guess=5
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
Label84:
	aload_1 
	iipush 20000931
	invokeinterface interfacemethodref_6 // pc=2 guess=4
	ifeq Label95
	aload_0 
	aload_1 
	iipush 20000931
	invokeinterface interfacemethodref_7 // pc=2 guess=5
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	goto Label95
	astore_6 
Label95:
	aload_1 
	ifnull Label119
	aload_1 
	invokeinterface interfacemethodref_8 // pc=1 guess=6
	goto Label119
	astore_2 
	goto Label119
	astore_2 
	aload_1 
	ifnull Label119
	aload_1 
	invokeinterface interfacemethodref_8 // pc=1 guess=6
	goto Label119
	astore_2 
	goto Label119
	astore_7 
	aload_1 
	ifnull Label117
	aload_1 
	invokeinterface interfacemethodref_8 // pc=1 guess=6
	goto Label117
	astore 8
Label117:
	aload_7 
	athrow 
Label119:
	aload_0 
	invokenonvirtual com.whatsapp.client.ContactInfo.resort // pc=1
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual optimize( net.rim.device.api.collection.util.BigVector ) // pc=1
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual optimize( net.rim.device.api.collection.util.BigVector ) // pc=1
	return 
	}


final removeContact( com.whatsapp.client.ContactInfo, module:WhatsApp.class#12 ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getstatic com.whatsapp.client.ContactInfo.field_53288 // ContactInfo
	aload_1 
	invokevirtual boolean removeElement( net.rim.device.api.collection.util.BigVector, net.rim.device.api.util.Comparator, java.lang.Object ) // pc=3
	istore_2 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getstatic com.whatsapp.client.ContactInfo.field_53294 // ContactInfo
	aload_1 
	invokevirtual boolean removeElement( net.rim.device.api.collection.util.BigVector, net.rim.device.api.util.Comparator, java.lang.Object ) // pc=3
	istore_2 
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnull Label19
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	astore_3 
Label19:
	invokestatic_lib module:WhatsApp-27.class#8.routine_2921(  ) // class#8
	astore_4 
	aload_4 
	invokenonvirtual_lib .routine_2596 // pc=1
	astore_5 
	aload_1 
	invokenonvirtual_lib .routine_6738 // pc=1
	astore_6 
	iconst_0 
	istore_7 
Label29:
	iload_7 
	aload_6 
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label62
	aload_6 
	iload_7 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore 8
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload 8
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.ContactInfoDetails//module:WhatsApp.class#12 module:WhatsApp.class#12 module:WhatsApp.class#12
	astore 9
	aload_1 
	aload 9
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label51
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload 8
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	pop 
Label51:
	aload_5 
	new_lib com.whatsapp.client.UIDPhone//module:WhatsApp.class#16 module:WhatsApp.class#16 module:WhatsApp.class#16
	dup 
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload 8
	invokespecial_lib .routine_10198 // pc=3
	iconst_0 
	invokenonvirtual_lib .routine_9386 // pc=3
	iinc 7 1
	goto Label29
Label62:
	aload_4 
	aload_5 
	invokenonvirtual_lib .routine_2638 // pc=2
	return 
	}


final boolean updateContact( com.whatsapp.client.ContactInfo, module:WhatsApp.class#12, module:WhatsApp.class#12 ); // address: 0
	{
	enter 
	iconst_1 
	istore_3 
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnull Label12
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_2 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label14
Label12:
	iload_3 
	ireturn 
Label14:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getstatic com.whatsapp.client.ContactInfo.field_53288 // ContactInfo
	aload_1 
	invokevirtual boolean removeElement( net.rim.device.api.collection.util.BigVector, net.rim.device.api.util.Comparator, java.lang.Object ) // pc=3
	pop 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getstatic com.whatsapp.client.ContactInfo.field_53294 // ContactInfo
	aload_1 
	invokevirtual boolean removeElement( net.rim.device.api.collection.util.BigVector, net.rim.device.api.util.Comparator, java.lang.Object ) // pc=3
	pop 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_2 
	invokevirtual addElement( net.rim.device.api.collection.util.BigVector, java.lang.Object ) // pc=2
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_2 
	invokevirtual addElement( net.rim.device.api.collection.util.BigVector, java.lang.Object ) // pc=2
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_2 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_2 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload_0 
	invokenonvirtual com.whatsapp.client.ContactInfo.resort // pc=1
	invokestatic_lib module:WhatsApp-27.class#8.routine_2921(  ) // class#8
	astore_4 
	aload_4 
	invokenonvirtual_lib .routine_2596 // pc=1
	astore_5 
	aload_1 
	invokenonvirtual_lib .routine_6738 // pc=1
	astore_6 
	aload_2 
	invokenonvirtual_lib .routine_6738 // pc=1
	astore_7 
	iconst_0 
	istore 8
Label51:
	iload 8
	aload_6 
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label90
	aload_6 
	iload 8
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore 9
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload 9
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.ContactInfoDetails//module:WhatsApp.class#12 module:WhatsApp.class#12 module:WhatsApp.class#12
	astore 10
	aload_1 
	aload 10
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label73
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload 9
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	pop 
Label73:
	aload_7 
	aload 9
	invokevirtual boolean contains( java.util.Vector, java.lang.Object ) // pc=2
	ifne Label88
	aload_5 
	new_lib com.whatsapp.client.UIDPhone//module:WhatsApp.class#16 module:WhatsApp.class#16 module:WhatsApp.class#16
	dup 
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload 9
	invokespecial_lib .routine_10198 // pc=3
	iconst_0 
	invokenonvirtual_lib .routine_9386 // pc=3
	iconst_0 
	istore_3 
Label88:
	iinc 8 1
	goto Label51
Label90:
	iconst_0 
	istore 8
Label92:
	iload 8
	aload_7 
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label105
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_7 
	iload 8
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	aload_2 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	iinc 8 1
	goto Label92
Label105:
	iload_3 
	ifne Label110
	aload_4 
	aload_5 
	invokenonvirtual_lib .routine_2638 // pc=2
Label110:
	iload_3 
	ireturn 
	}


final setSortOrder( com.whatsapp.client.ContactInfo, int ); // address: 0
	{
	putfield_return .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	}

}
