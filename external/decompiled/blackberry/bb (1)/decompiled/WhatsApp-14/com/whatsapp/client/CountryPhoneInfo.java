// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-14.cod
// Module version  : 2.7.3204
// Class ID        : 3
// ########################################################


package com.whatsapp.client;


abstract final class CountryPhoneInfo extends Object

{
	// @@@@@@@@@@@@@ Static fields 
	private static com.whatsapp.client.CountryPhoneInfo /*com.whatsapp.client.CountryPhoneInfo*/  field_53178 ; // ofs = 53178 addr = 8)

	// @@@@@@@@@@@@@ Fields 
	private java.util.Vector /*java.util.Vector*/  field_53174 ; // ofs = 53174 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

static private final java.util.Vector com.whatsapp.client.CountryPhoneInfo.routine_388( java.io.Reader ); // address: 0
	{
	enter 
	sipush 1024
	newarray 3
	astore_1 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_3 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	astore_4 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_5 
Label16:
	aload_0 
	aload_1 
	iconst_0 
	sipush 1024
	invokevirtual int read( java.io.Reader, char[], int, int ) // pc=4
	dup 
	istore_2 
	iflt Label64
	iconst_0 
	istore_6 
Label26:
	iload_6 
	iload_2 
	if_icmpge Label16
	aload_1 
	iload_6 
	caload 
	istore_7 
	iload_7 
	tableswitch  :
		
		
		

Label35:
	aload_5 
	aload_4 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_4 
	iconst_0 
	invokevirtual setLength( java.lang.StringBuffer, int ) // pc=2
	aload_3 
	aload_5 
	invokestatic com.whatsapp.client.CountryPhoneInfo$Country com.whatsapp.client.CountryPhoneInfo.routine_566( java.util.Vector ) // CountryPhoneInfo
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_5 
	iconst_0 
	invokevirtual setSize( java.util.Vector, int ) // pc=2
	goto Label62
Label50:
	aload_5 
	aload_4 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_4 
	iconst_0 
	invokevirtual setLength( java.lang.StringBuffer, int ) // pc=2
	goto Label62
Label58:
	aload_4 
	iload_7 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
Label62:
	iinc 6 1
	goto Label26
Label64:
	aload_4 
	invokevirtual int length( java.lang.StringBuffer ) // pc=1
	ifle Label71
	aload_5 
	aload_4 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label71:
	aload_5 
	invokevirtual int size( java.util.Vector ) // pc=1
	ifle Label78
	aload_3 
	aload_5 
	invokestatic com.whatsapp.client.CountryPhoneInfo$Country com.whatsapp.client.CountryPhoneInfo.routine_566( java.util.Vector ) // CountryPhoneInfo
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label78:
	aload_3 
	areturn 
	}


static private final com.whatsapp.client.CountryPhoneInfo$Country com.whatsapp.client.CountryPhoneInfo.routine_566( java.util.Vector ); // address: 0
	{
	enter_narrow 
	new CountryPhoneInfo$Country
	dup 
	invokespecial com.whatsapp.client.CountryPhoneInfo$Country.<init> // pc=1
	astore_1 
	aload_1 
	aload_0 
	iconst_0 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	aload_0 
	iconst_1 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_1 
	aload_0 
	bipush 2
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	invokestatic_lib int parseInt( java.lang.String ) // Integer
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_1 
	aload_0 
	bipush 3
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	invokenonvirtual com.whatsapp.client.CountryPhoneInfo$Country.setMccs // pc=2
	aload_1 
	aload_0 
	bipush 4
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	invokenonvirtual com.whatsapp.client.CountryPhoneInfo$Country.setLengths // pc=2
	aload_1 
	aload_0 
	bipush 5
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	invokenonvirtual com.whatsapp.client.CountryPhoneInfo$Country.setTrims // pc=2
	aload_1 
	areturn 
	}


private <init>( com.whatsapp.client.CountryPhoneInfo ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	new_lib net.rim.device.api.compress.GZIPInputStream//net.rim.device.api.compress.GZIPInputStream net.rim.device.api.compress.GZIPInputStream net.rim.device.api.compress.GZIPInputStream
	dup 
	getstatic class$com$whatsapp$client$CountryPhoneInfo // CountryPhoneInfo
	ifnonnull Label12
	ldc literal_49:"com.whatsapp.client.CountryPhoneInfo"
	invokestatic java.lang.Class class$( java.lang.String ) // CountryPhoneInfo
	dup 
	putstatic class$com$whatsapp$client$CountryPhoneInfo // CountryPhoneInfo
	goto Label13
Label12:
	getstatic class$com$whatsapp$client$CountryPhoneInfo // CountryPhoneInfo
Label13:
	ldc literal_50:"/countries.tsv"
	invokevirtual java.io.InputStream getResourceAsStream( java.lang.Class, java.lang.String ) // pc=2
	getstatic_lib module:WhatsApp-12.class#0.static_2 // class#0
	invokespecial_lib java.io.InputStreamReader.<init> // pc=3
	astore_1 
	aload_0 
	aload_1 
	invokestatic java.util.Vector com.whatsapp.client.CountryPhoneInfo.routine_388( java.io.Reader ) // CountryPhoneInfo
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	astore_1 
	aload_1 
	invokevirtual printStackTrace( java.lang.Throwable ) // pc=1
	return 
	astore_1 
	aload_1 
	invokevirtual printStackTrace( java.lang.Throwable ) // pc=1
	return 
	}


static public final com.whatsapp.client.CountryPhoneInfo getInstance(  ); // address: 0
	{
	enter_narrow 
	getstatic com.whatsapp.client.CountryPhoneInfo.field_53178 // CountryPhoneInfo
	ifnonnull Label7
	new CountryPhoneInfo
	dup 
	invokespecial com.whatsapp.client.CountryPhoneInfo.<init> // pc=1
	putstatic com.whatsapp.client.CountryPhoneInfo.field_53178 // CountryPhoneInfo
Label7:
	getstatic com.whatsapp.client.CountryPhoneInfo.field_53178 // CountryPhoneInfo
	areturn 
	}


static public final releaseInstance(  ); // address: 0
	{
	enter_narrow 
	aconst_null 
	putstatic com.whatsapp.client.CountryPhoneInfo.field_53178 // CountryPhoneInfo
	return 
	}


static final java.lang.Class class$( java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokestatic_lib java.lang.Class forName( java.lang.String ) // Class
	areturn 
	astore_1 
	new_lib net.rim.device.api.ui.component.ActiveRichTextField//net.rim.device.api.ui.component.ActiveRichTextField net.rim.device.api.ui.component.ActiveRichTextField net.rim.device.api.ui.component.ActiveRichTextField
	dup 
	aload_1 
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	invokespecial_lib java.lang.NoClassDefFoundError.<init> // pc=2
	athrow 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

public final com.whatsapp.client.CountryPhoneInfo$Country[] getCountryByMCC( com.whatsapp.client.CountryPhoneInfo, int ); // address: 0
	{
	enter 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_2 
	iconst_0 
	istore_3 
Label7:
	iload_3 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label25
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_3 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast CountryPhoneInfo$Country
	astore_4 
	aload_4 
	iload_1 
	invokenonvirtual com.whatsapp.client.CountryPhoneInfo$Country.hasMcc // pc=2
	ifeq Label23
	aload_2 
	aload_4 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label23:
	iinc 3 1
	goto Label7
Label25:
	aload_2 
	invokevirtual int size( java.util.Vector ) // pc=1
	newarray_object CountryPhoneInfo$Country
	astore_3 
	aload_2 
	aload_3 
	invokevirtual copyInto( java.util.Vector, java.lang.Object[] ) // pc=2
	aload_3 
	areturn 
	}


public final com.whatsapp.client.CountryPhoneInfo$Country[] getCountriesWithKeyword( com.whatsapp.client.CountryPhoneInfo, java.lang.String ); // address: 0
	{
	enter 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_2 
	iconst_0 
	istore_3 
Label7:
	iload_3 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label40
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_3 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast CountryPhoneInfo$Country
	astore_4 
	aload_1 
	ifnull Label25
	aload_4 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokenonvirtual_lib java.lang.String.toLowerCase // pc=1
	aload_1 
	invokenonvirtual_lib java.lang.String.toLowerCase // pc=1
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	iflt Label29
Label25:
	aload_2 
	aload_4 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	goto Label38
Label29:
	aload_4 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokestatic_lib java.lang.String toString( int ) // Integer
	aload_1 
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	iflt Label38
	aload_2 
	aload_4 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label38:
	iinc 3 1
	goto Label7
Label40:
	aload_2 
	invokevirtual int size( java.util.Vector ) // pc=1
	newarray_object CountryPhoneInfo$Country
	astore_3 
	aload_2 
	aload_3 
	invokevirtual copyInto( java.util.Vector, java.lang.Object[] ) // pc=2
	aload_3 
	areturn 
	}

}
