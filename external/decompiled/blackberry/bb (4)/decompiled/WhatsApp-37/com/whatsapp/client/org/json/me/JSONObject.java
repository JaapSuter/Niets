// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-37.cod
// Module version  : 2.7.3204
// Class ID        : 7
// ########################################################


package com.whatsapp.client.org.json.me;


abstract public final class JSONObject extends Object

{
	// @@@@@@@@@@@@@ Static fields 
	public final static Object /*java.lang.Object*/  NULL ; // ofs = 53156 addr = 17)

	// @@@@@@@@@@@@@ Fields 
	private java.util.Hashtable /*java.util.Hashtable*/  field_53152 ; // ofs = 53152 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.org.json.me.JSONObject ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}


static public final java.lang.String trimNumber( java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	bipush 46
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	ifle Label38
	aload_0 
	bipush 101
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	ifge Label38
	aload_0 
	bipush 69
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	ifge Label38
Label13:
	aload_0 
	ldc literal_49:"0"
	invokenonvirtual_lib java.lang.String.endsWith // pc=2
	ifeq Label26
	aload_0 
	iconst_0 
	aload_0 
	stringlength 
	iconst_1 
	isub 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	astore_0 
	goto Label13
Label26:
	aload_0 
	ldc literal_50:"."
	invokenonvirtual_lib java.lang.String.endsWith // pc=2
	ifeq Label38
	aload_0 
	iconst_0 
	aload_0 
	stringlength 
	iconst_1 
	isub 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	astore_0 
Label38:
	aload_0 
	areturn 
	}


static public final java.lang.String numberToString( java.lang.Object ); // address: 0
	{
	enter_narrow 
	aload_0 
	ifnonnull Label8
	new_lib com.whatsapp.client.org.json.me.//module:WhatsApp-36.class#4 module:WhatsApp-36.class#4 module:WhatsApp-36.class#4
	dup 
	ldc literal_51:"Null pointer"
	invokespecial_lib .routine_1403 // pc=2
	athrow 
Label8:
	aload_0 
	invokestatic testValidity( java.lang.Object ) // JSONObject
	aload_0 
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic java.lang.String trimNumber( java.lang.String ) // JSONObject
	areturn 
	}


static public final java.lang.String quote( java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	ifnull Label6
	aload_0 
	stringlength 
	ifne Label8
Label6:
	ldc literal_52:""""
	areturn 
Label8:
	iconst_0 
	istore_2 
	aload_0 
	stringlength 
	istore_4 
	new_lib net.rim.device.api.ui.component.LabelField//net.rim.device.api.ui.component.LabelField net.rim.device.api.ui.component.LabelField net.rim.device.api.ui.component.LabelField
	dup 
	iload_4 
	bipush 4
	iadd 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	astore_5 
	aload_5 
	bipush 34
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	iconst_0 
	istore_3 
Label26:
	iload_3 
	iload_4 
	if_icmplt Label30
	goto_w Label118
Label30:
	iload_2 
	istore_1 
	aload_0 
	iload_3 
	stringaload 
	istore_2 
	iload_2 
Label38:
	aload_5 
	bipush 92
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	aload_5 
	iload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	goto_w Label116
Label47:
	iload_1 
	bipush 60
	if_icmpne Label54
	aload_5 
	bipush 92
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
Label54:
	aload_5 
	iload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	goto_w Label116
Label59:
	aload_5 
	ldc literal_53:"\b"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	goto Label116
Label64:
	aload_5 
	ldc literal_54:"\t"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	goto Label116
Label69:
	aload_5 
	ldc literal_55:"\n"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	goto Label116
Label74:
	aload_5 
	ldc literal_56:"\f"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	goto Label116
Label79:
	aload_5 
	ldc literal_57:"\r"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	goto Label116
Label84:
	iload_2 
	bipush 32
	if_icmpge Label112
	new_lib net.rim.device.api.ui.component.LabelField//net.rim.device.api.ui.component.LabelField net.rim.device.api.ui.component.LabelField net.rim.device.api.ui.component.LabelField
	dup 
	ldc literal_58:"000"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload_2 
	invokestatic_lib java.lang.String toHexString( int ) // Integer
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_6 
	aload_5 
	new_lib net.rim.device.api.ui.component.LabelField//net.rim.device.api.ui.component.LabelField net.rim.device.api.ui.component.LabelField net.rim.device.api.ui.component.LabelField
	dup 
	ldc literal_59:"\u"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_6 
	aload_6 
	stringlength 
	bipush 4
	isub 
	invokenonvirtual_lib java.lang.String.substring // pc=2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	goto Label116
Label112:
	aload_5 
	iload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
Label116:
	iinc 3 1
	goto_w Label26
Label118:
	aload_5 
	bipush 34
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	aload_5 
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}


static final testValidity( java.lang.Object ); // address: 0
	{
	enter_narrow 
	aload_0 
	ifnull Label29
	aload_0 
	checkcastbranch_lib 
	invokevirtual boolean isInfinite( java.lang.Double ) // pc=1
	ifne Label11
	aload_0 
	checkcast_lib net.rim.device.api.ui.Manager//net.rim.device.api.ui.Manager net.rim.device.api.ui.Manager net.rim.device.api.ui.Manager
	invokevirtual boolean isNaN( java.lang.Double ) // pc=1
	ifeq Label29
Label11:
	new_lib com.whatsapp.client.org.json.me.JSONException//module:WhatsApp-36.class#4 module:WhatsApp-36.class#4 module:WhatsApp-36.class#4
	dup 
	ldc literal_60:"JSON does not allow non-finite numbers"
	invokespecial_lib .routine_1403 // pc=2
	athrow 
Label16:
	aload_0 
	checkcastbranch_lib 
	invokevirtual boolean isInfinite( java.lang.Float ) // pc=1
	ifne Label24
	aload_0 
	checkcast_lib net.rim.device.api.ui.ScrollView//net.rim.device.api.ui.ScrollView net.rim.device.api.ui.ScrollView net.rim.device.api.ui.ScrollView
	invokevirtual boolean isNaN( java.lang.Float ) // pc=1
	ifeq Label29
Label24:
	new_lib com.whatsapp.client.org.json.me.JSONException//module:WhatsApp-36.class#4 module:WhatsApp-36.class#4 module:WhatsApp-36.class#4
	dup 
	ldc literal_61:"JSON does not allow non-finite numbers."
	invokespecial_lib .routine_1403 // pc=2
	athrow 
Label29:
	return 
	}


static final java.lang.String valueToString( java.lang.Object ); // address: 0
	{
	enter 
	aload_0 
	ifnull Label7
	aload_0 
	aconst_null 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label9
Label7:
	ldc literal_62:"null"
	areturn 
Label9:
	aload_0 
	instanceof_lib com.whatsapp.client.org.json.me.JSONString//module:WhatsApp-36.class#7 module:WhatsApp-36.class#7 module:WhatsApp-36.class#7
	ifeq Label37
	aload_0 
	checkcast_lib com.whatsapp.client.org.json.me.JSONString//module:WhatsApp-36.class#7 module:WhatsApp-36.class#7 module:WhatsApp-36.class#7
	invokeinterface interfacemethodref_4 // pc=1 guess=2
	astore_1 
	goto Label23
	astore_2 
	new_lib com.whatsapp.client.org.json.me.JSONException//module:WhatsApp-36.class#4 module:WhatsApp-36.class#4 module:WhatsApp-36.class#4
	dup 
	aload_2 
	invokespecial_lib .routine_1416 // pc=2
	athrow 
Label23:
	aload_1 
	checkcastbranch_lib 
	areturn 
Label26:
	new_lib com.whatsapp.client.org.json.me.JSONException//module:WhatsApp-36.class#4 module:WhatsApp-36.class#4 module:WhatsApp-36.class#4
	dup 
	new_lib net.rim.device.api.ui.component.LabelField//net.rim.device.api.ui.component.LabelField net.rim.device.api.ui.component.LabelField net.rim.device.api.ui.component.LabelField
	dup 
	ldc literal_63:"Bad value from toJSONString: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.Object ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib .routine_1403 // pc=2
	athrow 
Label37:
	aload_0 
	instanceof_lib net.rim.device.api.ui.ScrollView//net.rim.device.api.ui.ScrollView net.rim.device.api.ui.ScrollView net.rim.device.api.ui.ScrollView
	ifne Label55
	aload_0 
	instanceof_lib net.rim.device.api.ui.Manager//net.rim.device.api.ui.Manager net.rim.device.api.ui.Manager net.rim.device.api.ui.Manager
	ifne Label55
	aload_0 
	instanceof_lib net.rim.device.api.system.Display//net.rim.device.api.system.Display net.rim.device.api.system.Display net.rim.device.api.system.Display
	ifne Label55
	aload_0 
	instanceof_lib Math//java.lang.Math java.lang.Math java.lang.Math
	ifne Label55
	aload_0 
	instanceof_lib IllegalArgumentException//java.lang.IllegalArgumentException java.lang.IllegalArgumentException java.lang.IllegalArgumentException
	ifne Label55
	aload_0 
	instanceof_lib net.rim.device.api.util.MathUtilities//net.rim.device.api.util.MathUtilities net.rim.device.api.util.MathUtilities net.rim.device.api.util.MathUtilities
	ifeq Label58
Label55:
	aload_0 
	invokestatic java.lang.String numberToString( java.lang.Object ) // JSONObject
	areturn 
Label58:
	aload_0 
	instanceof_lib Integer//java.lang.Integer java.lang.Integer java.lang.Integer
	ifne Label67
	aload_0 
	instanceof JSONObject
	ifne Label67
	aload_0 
	instanceof_lib com.whatsapp.client.org.json.me.JSONArray//module:WhatsApp-36.class#3 module:WhatsApp-36.class#3 module:WhatsApp-36.class#3
	ifeq Label70
Label67:
	aload_0 
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
Label70:
	aload_0 
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic java.lang.String quote( java.lang.String ) // JSONObject
	areturn 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	synch_static JSONObject
	clinit_wait 
	new_lib com.whatsapp.client.org.json.me.JSONObject$Null//module:WhatsApp-36.class#6 module:WhatsApp-36.class#6 module:WhatsApp-36.class#6
	dup 
	aconst_null 
	invokespecial_lib .routine_1490 // pc=2
	putstatic NULL // JSONObject
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

public final java.util.Enumeration keys( com.whatsapp.client.org.json.me.JSONObject ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual java.util.Enumeration keys( java.util.Hashtable ) // pc=1
	areturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final java.lang.String toString( com.whatsapp.client.org.json.me.JSONObject ); // address: 0
	{
	enter 
	aload_0 
	invokenonvirtual com.whatsapp.client.org.json.me.JSONObject.keys // pc=1
	astore_1 
	new_lib net.rim.device.api.ui.component.LabelField//net.rim.device.api.ui.component.LabelField net.rim.device.api.ui.component.LabelField net.rim.device.api.ui.component.LabelField
	dup 
	ldc literal_48:"{"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	astore_2 
Label9:
	aload_1 
	invokeinterface interfacemethodref_2 // pc=1 guess=0
	ifeq Label41
	aload_2 
	invokevirtual int length( java.lang.StringBuffer ) // pc=1
	iconst_1 
	if_icmple Label20
	aload_2 
	bipush 44
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
Label20:
	aload_1 
	invokeinterface interfacemethodref_3 // pc=1 guess=1
	astore_3 
	aload_2 
	aload_3 
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic java.lang.String quote( java.lang.String ) // JSONObject
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_2 
	bipush 58
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	aload_2 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_3 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	invokestatic java.lang.String valueToString( java.lang.Object ) // JSONObject
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	goto Label9
Label41:
	aload_2 
	bipush 125
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	aload_2 
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	astore_1 
	aconst_null 
	areturn 
	}

}
