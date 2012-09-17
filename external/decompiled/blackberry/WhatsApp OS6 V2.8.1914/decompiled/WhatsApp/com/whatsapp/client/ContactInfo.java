// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-18.cod
// Module version  : 2.8.1914
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


abstract final class ContactInfo extends Object

{
	// @@@@@@@@@@@@@ Static fields 
	private static com.whatsapp.client.ContactInfoDetailsNameComparator /*com.whatsapp.client.ContactInfoDetailsNameComparator*/  field_58116 ; // ofs = 58116 addr = 2)
	private static com.whatsapp.client.ContactInfoDetailsNameComparator /*com.whatsapp.client.ContactInfoDetailsNameComparator*/  field_58122 ; // ofs = 58122 addr = 3)

	// @@@@@@@@@@@@@ Fields 
	private net.rim.device.api.collection.util.BigVector /*net.rim.device.api.collection.util.BigVector*/  field_58072 ; // ofs = 58072 addr = 0)
	private net.rim.device.api.collection.util.BigVector /*net.rim.device.api.collection.util.BigVector*/  field_58076 ; // ofs = 58076 addr = 0)
	public java.util.Hashtable /*java.util.Hashtable*/  _contactsByUID ; // ofs = 58080 addr = 0)
	public java.util.Hashtable /*java.util.Hashtable*/  _contactsByPhone ; // ofs = 58084 addr = 0)
	private java.util.Hashtable /*java.util.Hashtable*/  field_58088 ; // ofs = 58088 addr = 0)
	private java.util.Hashtable /*java.util.Hashtable*/  field_58092 ; // ofs = 58092 addr = 0)
	public int /*int*/  _contactsSortOrder ; // ofs = 58096 addr = 0)
	public String /*java.lang.String*/  _userDefinedLabel1 ; // ofs = 58100 addr = 0)
	public String /*java.lang.String*/  _userDefinedLabel2 ; // ofs = 58104 addr = 0)
	public String /*java.lang.String*/  _userDefinedLabel3 ; // ofs = 58108 addr = 0)
	public String /*java.lang.String*/  _userDefinedLabel4 ; // ofs = 58112 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

private <init>( com.whatsapp.client.ContactInfo ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	new_lib Object//java.lang.Object java.lang.Object java.lang.Object
	dup 
	sipush 1000
	invokespecial_lib net.rim.device.api.collection.util.BigVector.<init> // pc=2
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	new_lib Object//java.lang.Object java.lang.Object java.lang.Object
	dup 
	sipush 1000
	invokespecial_lib net.rim.device.api.collection.util.BigVector.<init> // pc=2
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	iconst_0 
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0 
	new_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	dup 
	sipush 1000
	invokespecial_lib java.util.Hashtable.<init> // pc=2
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	new_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	dup 
	sipush 1000
	invokespecial_lib java.util.Hashtable.<init> // pc=2
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	new_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	dup 
	sipush 1000
	invokespecial_lib java.util.Hashtable.<init> // pc=2
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	new_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	dup 
	sipush 1000
	invokespecial_lib java.util.Hashtable.<init> // pc=2
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0 
	invokespecial com.whatsapp.client.ContactInfo.routine_1197 // pc=1
	return 
	}


static public final com.whatsapp.client.ContactInfo getInstance(  ); // address: 0
	{
	enter 
	synch_static ContactInfo
	invokestatic_lib net.rim.device.api.system.RuntimeStore getRuntimeStore(  ) // RuntimeStore
	lipush 8535665252065932813
	invokevirtual java.lang.Object get( net.rim.device.api.system.RuntimeStore, long ) // pc=3
	checkcast ContactInfo
	astore_0 
	aload_0 
	ifnonnull Label18
	new ContactInfo
	dup 
	invokespecial com.whatsapp.client.ContactInfo.<init> // pc=1
	astore_0 
	invokestatic_lib net.rim.device.api.system.RuntimeStore getRuntimeStore(  ) // RuntimeStore
	lipush 8535665252065932813
	aload_0 
	invokevirtual java.lang.Object replace( net.rim.device.api.system.RuntimeStore, long, java.lang.Object ) // pc=4
	pop 
Label18:
	aload_0 
	areturn 
	}


static public final resetInstance(  ); // address: 0
	{
	enter 
	synch_static ContactInfo
	new ContactInfo
	dup 
	invokespecial com.whatsapp.client.ContactInfo.<init> // pc=1
	astore_0 
	invokestatic_lib net.rim.device.api.system.RuntimeStore getRuntimeStore(  ) // RuntimeStore
	lipush 8535665252065932813
	aload_0 
	invokevirtual java.lang.Object replace( net.rim.device.api.system.RuntimeStore, long, java.lang.Object ) // pc=4
	pop 
	return 
	}


static private final java.util.Vector com.whatsapp.client.ContactInfo.routine_2548( net.rim.device.api.collection.util.BigVector, java.lang.String, int ); // address: 0
	{
	enter 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_3 
	invokestatic_lib module:WhatsApp-21.class#0.routine_1491(  ) // class#0
	astore_4 
	aload_1 
	bipush 32
	iconst_0 
	invokestatic_lib module:WhatsApp-79.class#39.routine_27111(  ) // class#39
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
	checkcast_lib com.whatsapp.client.ContactInfoDetails//module:WhatsApp.class#20 module:WhatsApp.class#20 module:WhatsApp.class#20
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
	invokestatic boolean com.whatsapp.client.ContactInfo.routine_2828( java.lang.String, int, module:WhatsApp-21.class#0, module:WhatsApp.class#20 ) // ContactInfo
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
	invokestatic boolean com.whatsapp.client.ContactInfo.routine_2828( java.lang.String, int, module:WhatsApp-21.class#0, module:WhatsApp.class#20 ) // ContactInfo
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
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_3 
	invokestatic_lib module:WhatsApp-21.class#0.routine_1491(  ) // class#0
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
	new_lib net.rim.device.api.system.RuntimeStore//net.rim.device.api.system.RuntimeStore net.rim.device.api.system.RuntimeStore net.rim.device.api.system.RuntimeStore
	dup 
	ldc literal_962:"Unknown type filtering contacts: "
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
	invokestatic boolean com.whatsapp.client.ContactInfo.routine_2828( java.lang.String, int, module:WhatsApp-21.class#0, module:WhatsApp.class#20 ) // ContactInfo
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


static private final boolean com.whatsapp.client.ContactInfo.routine_2828( java.lang.String, int, module:WhatsApp-21.class#0, module:WhatsApp.class#20 ); // address: 0
	{
	enter 
	iload_1 
	iconst_1 
	if_icmpne Label11
	aload_2 
	aload_3 
	invokenonvirtual_lib .routine_679 // pc=2
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
	invokestatic boolean casefreeKeywordMatch( module:WhatsApp.class#20, java.lang.String ) // ContactInfo
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


static public final boolean casefreeKeywordMatch( module:WhatsApp.class#20, java.lang.String ); // address: 0
	{
	enter 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	astore_2 
	aload_2 
	bipush 32
	iconst_0 
	invokestatic_lib module:WhatsApp-79.class#39.routine_27111(  ) // class#39
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
	invokestatic_lib module:WhatsApp-79.class#39.routine_27111(  ) // class#39
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
	invokestatic_lib module:WhatsApp-79.class#39.routine_27111(  ) // class#39
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
	invokestatic_lib module:WhatsApp-79.class#39.routine_27111(  ) // class#39
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


static private final com.whatsapp.client.ContactInfo.routine_3454( module:WhatsApp.class#20 ); // address: 0
	{
	enter 
	aload_0 
	ifnull Label8
	aload_0 
	iconst_0 
	invokenonvirtual_lib .routine_8839 // pc=2
	astore_1 
	goto Label10
Label8:
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	astore_1 
Label10:
	new_lib net.rim.device.api.system.RuntimeStore//net.rim.device.api.system.RuntimeStore net.rim.device.api.system.RuntimeStore net.rim.device.api.system.RuntimeStore
	dup 
	ldc literal_963:"blew up reading contacts, last valid was "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokestatic_lib module:WhatsApp-79.class#39.routine_24526(  ) // class#39
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	sipush 827
	aload_1 
	invokestatic_lib module:WhatsApp-47.class#11.routine_4463(  ) // class#11
	astore_2 
	new_lib Throwable//java.lang.Throwable java.lang.Throwable java.lang.Throwable
	dup 
	new_lib com.whatsapp.client.//module:WhatsApp-17.class#25 module:WhatsApp-17.class#25 module:WhatsApp-17.class#25
	dup 
	aload_2 
	invokespecial_lib .routine_6406 // pc=2
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
	putstatic com.whatsapp.client.ContactInfo.field_58116 // ContactInfo
	new ContactInfoDetailsNameComparator
	dup 
	iconst_1 
	invokespecial com.whatsapp.client.ContactInfoDetailsNameComparator.<init> // pc=2
	putstatic com.whatsapp.client.ContactInfo.field_58122 // ContactInfo
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

final addContact( com.whatsapp.client.ContactInfo, module:WhatsApp.class#20 ); // address: 0
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
	ifnull Label17
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	goto Label35
Label17:
	new_lib net.rim.device.api.system.RuntimeStore//net.rim.device.api.system.RuntimeStore net.rim.device.api.system.RuntimeStore net.rim.device.api.system.RuntimeStore
	dup 
	ldc literal_950:"contact "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokestatic_lib module:WhatsApp-79.class#39.routine_24526(  ) // class#39
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_951:" "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_1 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokestatic_lib module:WhatsApp-79.class#39.routine_24526(  ) // class#39
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_952:" had null uid, couldnt put in hash"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
Label35:
	aload_1 
	invokenonvirtual_lib .routine_9470 // pc=1
	astore_2 
	iconst_0 
	istore_3 
Label40:
	iload_3 
	aload_2 
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label53
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_2 
	iload_3 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	aload_1 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	iinc 3 1
	goto Label40
Label53:
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
	getstatic com.whatsapp.client.ContactInfo.field_58116 // ContactInfo
	invokevirtual sort( net.rim.device.api.collection.util.BigVector, net.rim.device.api.util.Comparator ) // pc=2
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getstatic com.whatsapp.client.ContactInfo.field_58122 // ContactInfo
	invokevirtual sort( net.rim.device.api.collection.util.BigVector, net.rim.device.api.util.Comparator ) // pc=2
	return 
	}


public final net.rim.device.api.system.EncodedImage getPhotoForUID( com.whatsapp.client.ContactInfo, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_1 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	areturn 
	}


public final net.rim.device.api.system.Bitmap getPhotoForUID( com.whatsapp.client.ContactInfo, java.lang.String, int, int ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.ContactInfo$ScaledPhotoKey//module:WhatsApp-17.class#26 module:WhatsApp-17.class#26 module:WhatsApp-17.class#26
	dup 
	aload_1 
	iload_2 
	iload_3 
	invokespecial_lib .routine_6565 // pc=4
	astore_4 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_4 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib net.rim.device.api.util.Comparator//net.rim.device.api.util.Comparator net.rim.device.api.util.Comparator net.rim.device.api.util.Comparator
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
	invokestatic_lib module:WhatsApp-20.class#0.routine_115(  ) // class#0
	astore_6 
	aload_6 
	invokestatic_lib module:WhatsApp-60.class#2.routine_1414(  ) // class#2
	new_lib net.rim.device.api.util.Comparator//net.rim.device.api.util.Comparator net.rim.device.api.util.Comparator net.rim.device.api.util.Comparator
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


final module:WhatsApp.class#20 getContactInfoDetails( com.whatsapp.client.ContactInfo, int ); // address: 0
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
	checkcast_lib com.whatsapp.client.ContactInfoDetails//module:WhatsApp.class#20 module:WhatsApp.class#20 module:WhatsApp.class#20
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
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_5 
	aload_4 
	invokevirtual int size( net.rim.device.api.collection.util.BigVector ) // pc=1
	istore_6 
	aconst_null 
	astore_7 
	iconst_0 
	istore 8
	iconst_0 
	istore 9
Label31:
	iload 9
	iload_6 
	if_icmplt Label35
	goto_w Label285
Label35:
	iconst_0 
	istore 8
	aload_4 
	iload 9
	invokevirtual java.lang.Object elementAt( net.rim.device.api.collection.util.BigVector, int ) // pc=2
	checkcast_lib com.whatsapp.client.ContactInfoDetails//module:WhatsApp.class#20 module:WhatsApp.class#20 module:WhatsApp.class#20
	astore_7 
	invokestatic_lib module:WhatsApp-21.class#0.routine_1491(  ) // class#0
	aload_7 
	invokenonvirtual_lib .routine_679 // pc=2
	ifeq Label47
	goto_w Label283
Label47:
	iload_2 
	ifeq Label55
	aload_7 
	aload_5 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iload 9
	invokenonvirtual_lib .routine_9828 // pc=4
	goto_w Label283
Label55:
	aload_7 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	astore 11
	aload_7 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	astore 12
	aload_7 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	astore 13
	aload_7 
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	astore 14
	aload_7 
	getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	astore 15
	aload 15
	ifnull Label75
	aload 15
	invokenonvirtual_lib java.lang.String.toLowerCase // pc=1
	astore 15
Label75:
	aload_7 
	getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	astore 16
	aload 16
	ifnull Label83
	aload 16
	invokenonvirtual_lib java.lang.String.toLowerCase // pc=1
	astore 16
Label83:
	aload_7 
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	astore 17
	aload 17
	ifnull Label91
	aload 17
	invokenonvirtual_lib java.lang.String.toLowerCase // pc=1
	astore 17
Label91:
	aload_7 
	getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	astore 18
	aload 18
	ifnull Label99
	aload 18
	invokenonvirtual_lib java.lang.String.toLowerCase // pc=1
	astore 18
Label99:
	aload_7 
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	astore 19
	aload 19
	ifnull Label107
	aload 19
	invokenonvirtual_lib java.lang.String.toLowerCase // pc=1
	astore 19
Label107:
	aload_7 
	getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	astore 20
	aload 20
	ifnull Label115
	aload 20
	invokenonvirtual_lib java.lang.String.toLowerCase // pc=1
	astore 20
Label115:
	aload_7 
	getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	astore 21
	aload 21
	ifnull Label123
	aload 21
	invokenonvirtual_lib java.lang.String.toLowerCase // pc=1
	astore 21
Label123:
	aload_7 
	getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	astore 22
	aload 22
	ifnull Label131
	aload 22
	invokenonvirtual_lib java.lang.String.toLowerCase // pc=1
	astore 22
Label131:
	aload_7 
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	astore 23
	aload 11
	ifnull Label143
	aload 11
	aload_1 
	invokestatic_lib boolean startsWithIgnoreCaseAndAccents( java.lang.String, java.lang.String ) // StringUtilities
	ifeq Label143
	iconst_1 
	istore 8
	goto_w Label276
Label143:
	aload 12
	ifnull Label152
	aload 12
	aload_1 
	invokestatic_lib boolean startsWithIgnoreCaseAndAccents( java.lang.String, java.lang.String ) // StringUtilities
	ifeq Label152
	iconst_1 
	istore 8
	goto_w Label276
Label152:
	aload 13
	ifnull Label161
	aload 13
	aload_1 
	invokestatic_lib boolean startsWithIgnoreCaseAndAccents( java.lang.String, java.lang.String ) // StringUtilities
	ifeq Label161
	iconst_1 
	istore 8
	goto_w Label276
Label161:
	aload 14
	ifnull Label170
	aload 14
	aload_1 
	invokestatic_lib boolean startsWithIgnoreCaseAndAccents( java.lang.String, java.lang.String ) // StringUtilities
	ifeq Label170
	iconst_1 
	istore 8
	goto_w Label276
Label170:
	aload 15
	ifnull Label180
	aload 15
	aload_3 
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	bipush -1
	if_icmple Label180
	iconst_1 
	istore 8
	goto_w Label276
Label180:
	aload 16
	ifnull Label190
	aload 16
	aload_3 
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	bipush -1
	if_icmple Label190
	iconst_1 
	istore 8
	goto_w Label276
Label190:
	aload 17
	ifnull Label200
	aload 17
	aload_3 
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	bipush -1
	if_icmple Label200
	iconst_1 
	istore 8
	goto_w Label276
Label200:
	aload 18
	ifnull Label210
	aload 18
	aload_3 
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	bipush -1
	if_icmple Label210
	iconst_1 
	istore 8
	goto_w Label276
Label210:
	aload 19
	ifnull Label220
	aload 19
	aload_3 
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	bipush -1
	if_icmple Label220
	iconst_1 
	istore 8
	goto Label276
Label220:
	aload 20
	ifnull Label230
	aload 20
	aload_3 
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	bipush -1
	if_icmple Label230
	iconst_1 
	istore 8
	goto Label276
Label230:
	aload 21
	ifnull Label240
	aload 21
	aload_3 
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	bipush -1
	if_icmple Label240
	iconst_1 
	istore 8
	goto Label276
Label240:
	aload 22
	ifnull Label250
	aload 22
	aload_3 
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	bipush -1
	if_icmple Label250
	iconst_1 
	istore 8
	goto Label276
Label250:
	aload 23
	invokevirtual int size( java.util.Vector ) // pc=1
	iconst_1 
	isub 
	istore 24
Label255:
	iload 24
	iflt Label276
	iload 8
	ifne Label276
	aload 23
	iload 24
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore 25
	aload 25
	ifnull Label274
	aload 25
	invokenonvirtual_lib java.lang.String.toLowerCase // pc=1
	aload_3 
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	bipush -1
	if_icmple Label274
	iconst_1 
	istore 8
Label274:
	iinc 24 -1
	goto Label255
Label276:
	iload 8
	ifeq Label283
	aload_7 
	aload_5 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iload 9
	invokenonvirtual_lib .routine_9828 // pc=4
Label283:
	iinc 9 1
	goto_w Label31
Label285:
	aload_5 
	areturn 
	}


public final module:WhatsApp.class#20 getFirstMatchingPhoneNumber( com.whatsapp.client.ContactInfo, java.lang.String[] ); // address: 0
	{
	enter 
	iconst_0 
	istore_2 
Label3:
	iload_2 
	aload_1 
	arraylength 
	if_icmpge Label25
	aload_1 
	iload_2 
	aaload 
	astore_3 
	aload_3 
	ifnonnull Label14
	goto Label23
Label14:
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_3 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.ContactInfoDetails//module:WhatsApp.class#20 module:WhatsApp.class#20 module:WhatsApp.class#20
	astore_4 
	aload_4 
	ifnull Label23
	aload_4 
	areturn 
Label23:
	iinc 2 1
	goto Label3
Label25:
	aconst_null 
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
	invokestatic java.util.Vector com.whatsapp.client.ContactInfo.routine_2548( net.rim.device.api.collection.util.BigVector, java.lang.String, int ) // ContactInfo
	areturn 
	}


final int getSize( com.whatsapp.client.ContactInfo ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual int size( net.rim.device.api.collection.util.BigVector ) // pc=1
	ireturn 
	}


private final com.whatsapp.client.ContactInfo.routine_1197( com.whatsapp.client.ContactInfo ); // address: 0
	{
	enter 
	aload_0 
	invokenonvirtual com.whatsapp.client.ContactInfo.clear // pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_21336(  ) // class#39
	ifne Label6
	goto_w Label156
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
	invokeinterface interfacemethodref_88 // pc=1 guess=0
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_1 
	iconst_1 
	invokeinterface interfacemethodref_89 // pc=2 guess=1
	astore_5 
Label29:
	aload_5 
	invokeinterface interfacemethodref_90 // pc=1 guess=2
	ifeq Label63
	aload_5 
	invokeinterface interfacemethodref_91 // pc=1 guess=3
	checkcast_lib net.rim.blackberry.api.pdap.BlackBerryContact//net.rim.blackberry.api.pdap.BlackBerryContact net.rim.blackberry.api.pdap.BlackBerryContact net.rim.blackberry.api.pdap.BlackBerryContact
	astore_3 
	goto Label41
	astore_6 
	aload_2 
	invokestatic com.whatsapp.client.ContactInfo.routine_3454( module:WhatsApp.class#20 ) // ContactInfo
	goto Label63
Label41:
	new_lib com.whatsapp.client.ContactInfoDetails//module:WhatsApp.class#20 module:WhatsApp.class#20 module:WhatsApp.class#20
	dup 
	invokespecial_lib .routine_11995 // pc=1
	astore_2 
	aload_2 
	aload_3 
	aload_0 
	invokenonvirtual_lib .routine_7261 // pc=3
	aload_2 
	invokestatic_lib createGroup( java.lang.Object ) // ObjectGroup
	goto Label59
	astore_6 
	aload_6 
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_6 
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
Label59:
	aload_0 
	aload_2 
	invokenonvirtual com.whatsapp.client.ContactInfo.addContact // pc=2
	goto Label29
Label63:
	new_lib net.rim.device.api.system.RuntimeStore//net.rim.device.api.system.RuntimeStore net.rim.device.api.system.RuntimeStore net.rim.device.api.system.RuntimeStore
	dup 
	ldc literal_953:"finished contacts, total: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual int size( net.rim.device.api.collection.util.BigVector ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_954:", photos: "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual int size( java.util.Hashtable ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_1 
	iipush 20000928
	invokeinterface interfacemethodref_92 // pc=2 guess=4
	ifeq Label86
	aload_0 
	aload_1 
	iipush 20000928
	invokeinterface interfacemethodref_93 // pc=2 guess=5
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
Label86:
	aload_1 
	iipush 20000929
	invokeinterface interfacemethodref_92 // pc=2 guess=4
	ifeq Label95
	aload_0 
	aload_1 
	iipush 20000929
	invokeinterface interfacemethodref_93 // pc=2 guess=5
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
Label95:
	aload_1 
	iipush 20000930
	invokeinterface interfacemethodref_92 // pc=2 guess=4
	ifeq Label104
	aload_0 
	aload_1 
	iipush 20000930
	invokeinterface interfacemethodref_93 // pc=2 guess=5
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
Label104:
	aload_1 
	iipush 20000931
	invokeinterface interfacemethodref_92 // pc=2 guess=4
	ifeq Label121
	aload_0 
	aload_1 
	iipush 20000931
	invokeinterface interfacemethodref_93 // pc=2 guess=5
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	goto Label121
	astore_6 
	aload_6 
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_6 
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
Label121:
	aload_1 
	ifnull Label156
	aload_1 
	invokeinterface interfacemethodref_94 // pc=1 guess=6
	goto Label156
	astore_2 
	goto Label156
	astore_2 
	new_lib net.rim.device.api.system.RuntimeStore//net.rim.device.api.system.RuntimeStore net.rim.device.api.system.RuntimeStore net.rim.device.api.system.RuntimeStore
	dup 
	ldc literal_955:"=============== "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_2 
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_2 
	invokestatic_lib module:WhatsApp-79.class#39.routine_24745(  ) // class#39
	aload_1 
	ifnull Label156
	aload_1 
	invokeinterface interfacemethodref_94 // pc=1 guess=6
	goto Label156
	astore_2 
	goto Label156
	astore_7 
	aload_1 
	ifnull Label154
	aload_1 
	invokeinterface interfacemethodref_94 // pc=1 guess=6
	goto Label154
	astore 8
Label154:
	aload_7 
	athrow 
Label156:
	aload_0 
	invokenonvirtual com.whatsapp.client.ContactInfo.resort // pc=1
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual optimize( net.rim.device.api.collection.util.BigVector ) // pc=1
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual optimize( net.rim.device.api.collection.util.BigVector ) // pc=1
	return 
	}


final removeContact( com.whatsapp.client.ContactInfo, module:WhatsApp.class#20 ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getstatic com.whatsapp.client.ContactInfo.field_58116 // ContactInfo
	aload_1 
	invokevirtual boolean removeElement( net.rim.device.api.collection.util.BigVector, net.rim.device.api.util.Comparator, java.lang.Object ) // pc=3
	istore_2 
	iload_2 
	ifne Label19
	new_lib net.rim.device.api.system.RuntimeStore//net.rim.device.api.system.RuntimeStore net.rim.device.api.system.RuntimeStore net.rim.device.api.system.RuntimeStore
	dup 
	ldc literal_956:"cID "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_957:" not in byFirstName"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
Label19:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getstatic com.whatsapp.client.ContactInfo.field_58122 // ContactInfo
	aload_1 
	invokevirtual boolean removeElement( net.rim.device.api.collection.util.BigVector, net.rim.device.api.util.Comparator, java.lang.Object ) // pc=3
	istore_2 
	iload_2 
	ifne Label37
	new_lib net.rim.device.api.system.RuntimeStore//net.rim.device.api.system.RuntimeStore net.rim.device.api.system.RuntimeStore net.rim.device.api.system.RuntimeStore
	dup 
	ldc literal_956:"cID "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_958:" not in byLastName"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
Label37:
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnull Label58
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	astore_3 
	aload_3 
	ifnonnull Label58
	new_lib net.rim.device.api.system.RuntimeStore//net.rim.device.api.system.RuntimeStore net.rim.device.api.system.RuntimeStore net.rim.device.api.system.RuntimeStore
	dup 
	ldc literal_956:"cID "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_959:" had a uid but was not in byUID"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
Label58:
	invokestatic_lib module:WhatsApp-44.class#7.routine_3329(  ) // class#7
	astore_4 
	aload_4 
	invokenonvirtual_lib .routine_2782 // pc=1
	astore_5 
	aload_1 
	invokenonvirtual_lib .routine_9470 // pc=1
	astore_6 
	iconst_0 
	istore_7 
Label68:
	iload_7 
	aload_6 
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label101
	aload_6 
	iload_7 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore 8
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload 8
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.ContactInfoDetails//module:WhatsApp.class#20 module:WhatsApp.class#20 module:WhatsApp.class#20
	astore 9
	aload_1 
	aload 9
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label90
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload 8
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	pop 
Label90:
	aload_5 
	new_lib com.whatsapp.client.UIDPhone//module:WhatsApp.class#28 module:WhatsApp.class#28 module:WhatsApp.class#28
	dup 
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload 8
	invokespecial_lib .routine_14707 // pc=3
	iconst_0 
	invokenonvirtual_lib .routine_13453 // pc=3
	iinc 7 1
	goto Label68
Label101:
	aload_4 
	aload_5 
	invokenonvirtual_lib .routine_2828 // pc=2
	return 
	}


final boolean updateContact( com.whatsapp.client.ContactInfo, module:WhatsApp.class#20, module:WhatsApp.class#20 ); // address: 0
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
	ifne Label28
Label12:
	new_lib net.rim.device.api.system.RuntimeStore//net.rim.device.api.system.RuntimeStore net.rim.device.api.system.RuntimeStore net.rim.device.api.system.RuntimeStore
	dup 
	ldc literal_960:"updateContact saw uid mismatch for old "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_961:" to "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_2 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	iload_3 
	ireturn 
Label28:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getstatic com.whatsapp.client.ContactInfo.field_58116 // ContactInfo
	aload_1 
	invokevirtual boolean removeElement( net.rim.device.api.collection.util.BigVector, net.rim.device.api.util.Comparator, java.lang.Object ) // pc=3
	pop 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getstatic com.whatsapp.client.ContactInfo.field_58122 // ContactInfo
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
	invokestatic_lib module:WhatsApp-44.class#7.routine_3329(  ) // class#7
	astore_4 
	aload_4 
	invokenonvirtual_lib .routine_2782 // pc=1
	astore_5 
	aload_1 
	invokenonvirtual_lib .routine_9470 // pc=1
	astore_6 
	aload_2 
	invokenonvirtual_lib .routine_9470 // pc=1
	astore_7 
	iconst_0 
	istore 8
Label65:
	iload 8
	aload_6 
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label104
	aload_6 
	iload 8
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore 9
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload 9
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.ContactInfoDetails//module:WhatsApp.class#20 module:WhatsApp.class#20 module:WhatsApp.class#20
	astore 10
	aload_1 
	aload 10
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label87
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload 9
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	pop 
Label87:
	aload_7 
	aload 9
	invokevirtual boolean contains( java.util.Vector, java.lang.Object ) // pc=2
	ifne Label102
	aload_5 
	new_lib com.whatsapp.client.UIDPhone//module:WhatsApp.class#28 module:WhatsApp.class#28 module:WhatsApp.class#28
	dup 
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload 9
	invokespecial_lib .routine_14707 // pc=3
	iconst_0 
	invokenonvirtual_lib .routine_13453 // pc=3
	iconst_0 
	istore_3 
Label102:
	iinc 8 1
	goto Label65
Label104:
	iconst_0 
	istore 8
Label106:
	iload 8
	aload_7 
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label119
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_7 
	iload 8
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	aload_2 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	iinc 8 1
	goto Label106
Label119:
	iload_3 
	ifne Label124
	aload_4 
	aload_5 
	invokenonvirtual_lib .routine_2828 // pc=2
Label124:
	iload_3 
	ireturn 
	}


final setSortOrder( com.whatsapp.client.ContactInfo, int ); // address: 0
	{
	putfield_return .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	}

}
