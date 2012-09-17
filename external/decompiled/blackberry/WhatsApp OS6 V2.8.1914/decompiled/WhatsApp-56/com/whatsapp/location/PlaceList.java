// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-56.cod
// Module version  : 2.8.1914
// Class ID        : 0
// ########################################################


package com.whatsapp.location;


abstract public final class PlaceList extends net.rim.device.api.util.SimpleSortingVector

{
	// @@@@@@@@@@@@@ Static fields 
	private final static java.util.Vector /*java.util.Vector*/  field_59628 ; // ofs = 59628 addr = 2)
	private static String /*java.lang.String*/  field_59634 ; // ofs = 59634 addr = 3)
	private static String /*java.lang.String*/  field_59640 ; // ofs = 59640 addr = 4)
	private static String /*java.lang.String*/  field_59646 ; // ofs = 59646 addr = 5)
	private static String /*java.lang.String*/  field_59652 ; // ofs = 59652 addr = 6)
	private static String /*java.lang.String*/  field_59658 ; // ofs = 59658 addr = 7)
	private static String /*java.lang.String*/  field_59664 ; // ofs = 59664 addr = 8)
	private static String /*java.lang.String*/  field_59670 ; // ofs = 59670 addr = 9)
	private static String /*java.lang.String*/  field_59676 ; // ofs = 59676 addr = 10)
	private static String /*java.lang.String*/  field_59682 ; // ofs = 59682 addr = 11)
	private static String /*java.lang.String*/  field_59688 ; // ofs = 59688 addr = 12)
	private static String /*java.lang.String*/  field_59694 ; // ofs = 59694 addr = 13)
	private static String /*java.lang.String*/  field_59700 ; // ofs = 59700 addr = 14)
	private static String /*java.lang.String*/  field_59706 ; // ofs = 59706 addr = 15)
	private static String /*java.lang.String*/  field_59712 ; // ofs = 59712 addr = 16)
	private static String /*java.lang.String*/  field_59718 ; // ofs = 59718 addr = 17)
	private static String /*java.lang.String*/  field_59724 ; // ofs = 59724 addr = 18)
	private static String /*java.lang.String*/  field_59730 ; // ofs = 59730 addr = 19)
	private static String /*java.lang.String*/  field_59736 ; // ofs = 59736 addr = 20)
	private static String /*java.lang.String*/  field_59742 ; // ofs = 59742 addr = 21)
	private static String /*java.lang.String*/  field_59748 ; // ofs = 59748 addr = 22)
	private static String /*java.lang.String*/  field_59754 ; // ofs = 59754 addr = 23)
	private static String /*java.lang.String*/  field_59760 ; // ofs = 59760 addr = 24)
	private static String /*java.lang.String*/  field_59766 ; // ofs = 59766 addr = 25)
	private static String /*java.lang.String*/  field_59772 ; // ofs = 59772 addr = 26)
	private static String /*java.lang.String*/  field_59778 ; // ofs = 59778 addr = 27)
	private static String /*java.lang.String*/  field_59784 ; // ofs = 59784 addr = 28)
	private static String /*java.lang.String*/  field_59790 ; // ofs = 59790 addr = 29)
	private static String /*java.lang.String*/  field_59796 ; // ofs = 59796 addr = 30)

	// @@@@@@@@@@@@@ Fields 
	private javax.microedition.location.Coordinates /*javax.microedition.location.Coordinates*/  field_59600 ; // ofs = 59600 addr = 0)
	private int /*int*/  field_59604 ; // ofs = 59604 addr = 0)
	private String /*java.lang.String*/  field_59608 ; // ofs = 59608 addr = 0)
	private String /*java.lang.String*/  field_59612 ; // ofs = 59612 addr = 0)
	private String /*java.lang.String[]*/  field_59616 ; // ofs = 59616 addr = 0)
	private String /*java.lang.String*/  field_59620 ; // ofs = 59620 addr = 0)
	private int /*int*/  field_59624 ; // ofs = 59624 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

static public final com.whatsapp.location.PlaceList getPlacesGoogle( javax.microedition.location.Coordinates, int, java.lang.String, java.lang.String, boolean ); // address: 0
	{
	enter 
	aload_2 
	ifnonnull Label5
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	astore_2 
Label5:
	aload_3 
	ifnonnull Label9
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	astore_3 
Label9:
	iconst_1 
	aload_0 
	iload_1 
	aload_2 
	aload_3 
	invokestatic com.whatsapp.location.PlaceList com.whatsapp.location.PlaceList.routine_1676( int, javax.microedition.location.Coordinates, int, java.lang.String, java.lang.String ) // PlaceList
	astore_5 
	aload_5 
	ifnull Label24
	iload_4 
	ifeq Label70
	aload_5 
	invokenonvirtual com.whatsapp.location.PlaceList.getSource // pc=1
	iconst_1 
	if_icmpeq Label70
Label24:
	aload_0 
	iload_1 
	aload_2 
	aload_3 
	invokestatic java.lang.String com.whatsapp.location.PlaceList.routine_834( javax.microedition.location.Coordinates, int, java.lang.String, java.lang.String ) // PlaceList
	astore_6 
	aload_6 
	iconst_0 
	invokestatic_lib module:WhatsApp-79.class#39.routine_29653(  ) // class#39
	astore_7 
	aload_7 
	ifnull Label70
	aload_7 
	invokestatic com.whatsapp.location.PlaceList.routine_686( module:WhatsApp-79.class#26 ) // PlaceList
	new PlaceList
	dup 
	iconst_1 
	aload_0 
	iload_1 
	aload_2 
	aload_3 
	invokespecial com.whatsapp.location.PlaceList.<init> // pc=6
	astore_5 
	aload_5 
	aload_7 
	getstatic com.whatsapp.location.PlaceList.field_59700 // PlaceList
	invokenonvirtual_lib .routine_13209 // pc=2
	putfield com.whatsapp.location.PlaceList.field_59620   // get_name_1:  com.whatsapp.location.PlaceList.field_59620   // get_name_2:  com.whatsapp.location.PlaceList.field_59620   // get_Name:    com.whatsapp.location.PlaceList.field_59620   // getName->1:     // getName->2:     // getName->N:     // ofs = 59620 ord = 5 addr = 0
	aload_5 
	aload_7 
	invokespecial com.whatsapp.location.PlaceList.routine_140 // pc=2
	aload_5 
	invokestatic com.whatsapp.location.PlaceList.routine_1935( com.whatsapp.location.PlaceList ) // PlaceList
	goto Label70
	astore_6 
	new PlacesException
	dup 
	aload_6 
	invokespecial com.whatsapp.location.PlacesException.<init> // pc=2
	athrow 
	astore_6 
	new PlacesException
	dup 
	aload_6 
	invokespecial com.whatsapp.location.PlacesException.<init> // pc=2
	athrow 
Label70:
	aload_5 
	areturn 
	}


static private final com.whatsapp.location.PlaceList.routine_686( module:WhatsApp-79.class#26 ); // address: 0
	{
	enter 
	aload_0 
	getstatic com.whatsapp.location.PlaceList.field_59700 // PlaceList
	invokenonvirtual_lib .routine_13209 // pc=2
	astore_1 
	getstatic com.whatsapp.location.PlaceList.field_59706 // PlaceList
	aload_1 
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label60
	bipush -1
	istore_2 
	getstatic com.whatsapp.location.PlaceList.field_59784 // PlaceList
	aload_1 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label18
	ldc literal_89:"Google returned no places results"
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	goto Label41
Label18:
	getstatic com.whatsapp.location.PlaceList.field_59778 // PlaceList
	aload_1 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label25
	bipush 3
	istore_2 
	goto Label41
Label25:
	getstatic com.whatsapp.location.PlaceList.field_59790 // PlaceList
	aload_1 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label32
	bipush 2
	istore_2 
	goto Label41
Label32:
	getstatic com.whatsapp.location.PlaceList.field_59796 // PlaceList
	aload_1 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label39
	bipush 2
	istore_2 
	goto Label41
Label39:
	iconst_1 
	istore_2 
Label41:
	iload_2 
	bipush -1
	if_icmpeq Label60
	new_lib Throwable//java.lang.Throwable java.lang.Throwable java.lang.Throwable
	dup 
	ldc literal_90:"Google query error: status=""
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_91:"""
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	new PlacesException
	dup 
	iload_2 
	aload_1 
	invokespecial com.whatsapp.location.PlacesException.<init> // pc=3
	athrow 
Label60:
	return 
	}


static private final java.lang.String com.whatsapp.location.PlaceList.routine_834( javax.microedition.location.Coordinates, int, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	new_lib Throwable//java.lang.Throwable java.lang.Throwable java.lang.Throwable
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	astore_4 
	aload_4 
	getstatic_lib module:WhatsApp-55.class#4.static_10 // class#4
	invokestatic_lib module:WhatsApp-79.class#39.routine_21434(  ) // class#39
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_4 
	getstatic com.whatsapp.location.PlaceList.field_59664 // PlaceList
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0 
	invokevirtual double getLatitude( javax.microedition.location.Coordinates ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, double ) // pc=3
	getstatic com.whatsapp.location.PlaceList.field_59634 // PlaceList
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0 
	invokevirtual double getLongitude( javax.microedition.location.Coordinates ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, double ) // pc=3
	pop 
	aload_4 
	getstatic com.whatsapp.location.PlaceList.field_59640 // PlaceList
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	new_lib net.rim.blackberry.api.browser.URLEncodedPostData//net.rim.blackberry.api.browser.URLEncodedPostData net.rim.blackberry.api.browser.URLEncodedPostData net.rim.blackberry.api.browser.URLEncodedPostData
	dup 
	aconst_null 
	iconst_0 
	invokespecial_lib net.rim.blackberry.api.browser.URLEncodedPostData.<init> // pc=3
	astore_5 
	aload_5 
	getstatic com.whatsapp.location.PlaceList.field_59658 // PlaceList
	iload_1 
	invokestatic_lib java.lang.String toString( int ) // Integer
	invokevirtual append( net.rim.blackberry.api.browser.URLEncodedPostData, java.lang.String, java.lang.String ) // pc=3
	aload_3 
	stringlength 
	ifle Label44
	aload_5 
	getstatic com.whatsapp.location.PlaceList.field_59652 // PlaceList
	aload_3 
	invokevirtual append( net.rim.blackberry.api.browser.URLEncodedPostData, java.lang.String, java.lang.String ) // pc=3
Label44:
	aload_2 
	stringlength 
	ifle Label51
	aload_5 
	getstatic com.whatsapp.location.PlaceList.field_59646 // PlaceList
	aload_2 
	invokevirtual append( net.rim.blackberry.api.browser.URLEncodedPostData, java.lang.String, java.lang.String ) // pc=3
Label51:
	aload_4 
	aload_5 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_4 
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}


static private final java.lang.String[] com.whatsapp.location.PlaceList.routine_989( java.lang.String ); // address: 0
	{
	enter 
	bipush 2
	newarray_object_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	iconst_0 
	aload_0 
	aastore 
	dup 
	iconst_1 
	aconst_null 
	aastore 
	astore_1 
	aload_0 
	ifnull Label17
	aload_0 
	stringlength 
	ifne Label19
Label17:
	aload_1 
	areturn 
Label19:
	aload_0 
	stringlength 
	istore_2 
	aload_0 
	getstatic com.whatsapp.location.PlaceList.field_59748 // PlaceList
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	istore_3 
	iload_3 
	bipush -1
	if_icmpeq Label35
	iload_3 
	getstatic com.whatsapp.location.PlaceList.field_59748 // PlaceList
	stringlength 
	iadd 
	iload_2 
	if_icmple Label37
Label35:
	aload_1 
	areturn 
Label37:
	aload_0 
	getstatic com.whatsapp.location.PlaceList.field_59754 // PlaceList
	iload_3 
	getstatic com.whatsapp.location.PlaceList.field_59748 // PlaceList
	stringlength 
	iadd 
	invokenonvirtual_lib java.lang.String.indexOf // pc=3
	istore_4 
	iload_4 
	bipush -1
	if_icmpeq Label54
	iload_4 
	getstatic com.whatsapp.location.PlaceList.field_59754 // PlaceList
	stringlength 
	iadd 
	iload_2 
	if_icmple Label56
Label54:
	aload_1 
	areturn 
Label56:
	aload_0 
	getstatic com.whatsapp.location.PlaceList.field_59760 // PlaceList
	iload_4 
	getstatic com.whatsapp.location.PlaceList.field_59754 // PlaceList
	stringlength 
	iadd 
	invokenonvirtual_lib java.lang.String.indexOf // pc=3
	istore_5 
	iload_5 
	bipush -1
	if_icmpne Label69
	aload_1 
	areturn 
Label69:
	new_lib Throwable//java.lang.Throwable java.lang.Throwable java.lang.Throwable
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	astore_6 
	aload_6 
	aload_0 
	iconst_0 
	iload_3 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_1 
	iconst_1 
	aload_0 
	iload_3 
	getstatic com.whatsapp.location.PlaceList.field_59748 // PlaceList
	stringlength 
	iadd 
	iload_4 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	aastore 
	aload_6 
	aload_0 
	iload_4 
	getstatic com.whatsapp.location.PlaceList.field_59754 // PlaceList
	stringlength 
	iadd 
	iload_5 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_1 
	iconst_0 
	aload_6 
	invokevirtual_short .toString // idx=2 pc=1
	aastore 
	aload_1 
	areturn 
	}


static public final com.whatsapp.location.PlaceList getPlacesFoursquare( javax.microedition.location.Coordinates, int, java.lang.String, java.lang.String, boolean ); // address: 0
	{
	enter 
	aload_2 
	ifnonnull Label5
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	astore_2 
Label5:
	aload_3 
	ifnonnull Label9
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	astore_3 
Label9:
	bipush 2
	aload_0 
	iload_1 
	aload_2 
	aload_3 
	invokestatic com.whatsapp.location.PlaceList com.whatsapp.location.PlaceList.routine_1676( int, javax.microedition.location.Coordinates, int, java.lang.String, java.lang.String ) // PlaceList
	astore_5 
	aload_5 
	ifnull Label24
	iload_4 
	ifeq Label68
	aload_5 
	invokenonvirtual com.whatsapp.location.PlaceList.getSource // pc=1
	bipush 2
	if_icmpeq Label68
Label24:
	aload_0 
	iload_1 
	aload_2 
	aload_3 
	invokestatic java.lang.String com.whatsapp.location.PlaceList.routine_1521( javax.microedition.location.Coordinates, int, java.lang.String, java.lang.String ) // PlaceList
	astore_6 
	aload_6 
	iconst_0 
	invokestatic_lib module:WhatsApp-79.class#39.routine_29653(  ) // class#39
	astore_7 
	aload_7 
	ifnull Label68
	aload_7 
	invokestatic com.whatsapp.location.PlaceList.routine_1347( module:WhatsApp-79.class#26 ) // PlaceList
	new PlaceList
	dup 
	bipush 2
	aload_0 
	iload_1 
	aload_2 
	aload_3 
	invokespecial com.whatsapp.location.PlaceList.<init> // pc=6
	astore_5 
	aload_5 
	aload_7 
	invokespecial com.whatsapp.location.PlaceList.routine_380 // pc=2
	getstatic com.whatsapp.location.PlaceList.field_59628 // PlaceList
	aload_5 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_5 
	invokestatic com.whatsapp.location.PlaceList.routine_1935( com.whatsapp.location.PlaceList ) // PlaceList
	goto Label68
	astore_6 
	new PlacesException
	dup 
	aload_6 
	invokespecial com.whatsapp.location.PlacesException.<init> // pc=2
	athrow 
	astore_6 
	new PlacesException
	dup 
	aload_6 
	invokespecial com.whatsapp.location.PlacesException.<init> // pc=2
	athrow 
Label68:
	aload_5 
	areturn 
	}


static private final com.whatsapp.location.PlaceList.routine_1347( module:WhatsApp-79.class#26 ); // address: 0
	{
	enter 
	aload_0 
	getstatic com.whatsapp.location.PlaceList.field_59712 // PlaceList
	invokenonvirtual_lib .routine_13148 // pc=2
	astore_1 
	aload_1 
	getstatic com.whatsapp.location.PlaceList.field_59718 // PlaceList
	invokenonvirtual_lib .routine_12936 // pc=2
	istore_2 
	iload_2 
	sipush 200
	if_icmpne Label13
	goto_w Label65
Label13:
	aload_1 
	getstatic com.whatsapp.location.PlaceList.field_59736 // PlaceList
	invokenonvirtual_lib .routine_13209 // pc=2
	astore_3 
	aload_1 
	getstatic com.whatsapp.location.PlaceList.field_59742 // PlaceList
	invokenonvirtual_lib .routine_13209 // pc=2
	astore_4 
	iload_2 
	sipush 403
	if_icmpne Label31
	aload_3 
	getstatic com.whatsapp.location.PlaceList.field_59772 // PlaceList
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label31
	bipush 3
	istore_5 
	goto Label39
Label31:
	iload_2 
	sipush 400
	if_icmpne Label37
	bipush 2
	istore_5 
	goto Label39
Label37:
	iconst_1 
	istore_5 
Label39:
	new_lib Throwable//java.lang.Throwable java.lang.Throwable java.lang.Throwable
	dup 
	ldc literal_92:"Foursquare query error: code="
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_93:", errorType=""
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_3 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_91:"""
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_94:", errorDetail="
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_4 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_91:"""
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	new PlacesException
	dup 
	iload_5 
	aload_4 
	invokespecial com.whatsapp.location.PlacesException.<init> // pc=3
	athrow 
Label65:
	return 
	}


static private final java.lang.String com.whatsapp.location.PlaceList.routine_1521( javax.microedition.location.Coordinates, int, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	new_lib Throwable//java.lang.Throwable java.lang.Throwable java.lang.Throwable
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	astore_4 
	aload_4 
	getstatic_lib module:WhatsApp-55.class#4.static_12 // class#4
	invokestatic_lib module:WhatsApp-79.class#39.routine_21434(  ) // class#39
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_4 
	getstatic com.whatsapp.location.PlaceList.field_59670 // PlaceList
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0 
	invokevirtual double getLatitude( javax.microedition.location.Coordinates ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, double ) // pc=3
	getstatic com.whatsapp.location.PlaceList.field_59634 // PlaceList
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0 
	invokevirtual double getLongitude( javax.microedition.location.Coordinates ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, double ) // pc=3
	pop 
	aload_4 
	getstatic com.whatsapp.location.PlaceList.field_59640 // PlaceList
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	new_lib net.rim.blackberry.api.browser.URLEncodedPostData//net.rim.blackberry.api.browser.URLEncodedPostData net.rim.blackberry.api.browser.URLEncodedPostData net.rim.blackberry.api.browser.URLEncodedPostData
	dup 
	aconst_null 
	iconst_0 
	invokespecial_lib net.rim.blackberry.api.browser.URLEncodedPostData.<init> // pc=3
	astore_5 
	aload_5 
	getstatic com.whatsapp.location.PlaceList.field_59658 // PlaceList
	iload_1 
	iipush 99999
	invokestatic_lib int min( int, int ) // Math
	invokestatic_lib java.lang.String toString( int ) // Integer
	invokevirtual append( net.rim.blackberry.api.browser.URLEncodedPostData, java.lang.String, java.lang.String ) // pc=3
	aload_3 
	stringlength 
	ifle Label46
	aload_5 
	getstatic com.whatsapp.location.PlaceList.field_59676 // PlaceList
	aload_3 
	invokevirtual append( net.rim.blackberry.api.browser.URLEncodedPostData, java.lang.String, java.lang.String ) // pc=3
Label46:
	aload_4 
	aload_5 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_4 
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}


static private final com.whatsapp.location.PlaceList com.whatsapp.location.PlaceList.routine_1676( int, javax.microedition.location.Coordinates, int, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	getstatic com.whatsapp.location.PlaceList.field_59628 // PlaceList
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_5 
	iconst_0 
	istore_6 
Label6:
	iload_6 
	iload_5 
	if_icmplt Label10
	goto_w Label121
Label10:
	getstatic com.whatsapp.location.PlaceList.field_59628 // PlaceList
	iload_6 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast PlaceList
	astore_7 
	aload_7 
	getfield com.whatsapp.location.PlaceList.field_59608   // get_name_1:  com.whatsapp.location.PlaceList.field_59608   // get_name_2:  com.whatsapp.location.PlaceList.field_59608   // get_Name:    com.whatsapp.location.PlaceList.field_59608   // getName->1:     // getName->2:     // getName->N:     // ofs = 59608 ord = 2 addr = 0
	aload_3 
	invokenonvirtual_lib java.lang.String.equalsIgnoreCase // pc=2
	ifne Label21
	goto_w Label119
Label21:
	aload_7 
	getfield com.whatsapp.location.PlaceList.field_59612   // get_name_1:  com.whatsapp.location.PlaceList.field_59612   // get_name_2:  com.whatsapp.location.PlaceList.field_59612   // get_Name:    com.whatsapp.location.PlaceList.field_59612   // getName->1:     // getName->2:     // getName->N:     // ofs = 59612 ord = 3 addr = 0
	aload_4 
	invokenonvirtual_lib java.lang.String.equalsIgnoreCase // pc=2
	ifne Label27
	goto_w Label119
Label27:
	aload_7 
	getfield com.whatsapp.location.PlaceList.field_59600   // get_name_1:  com.whatsapp.location.PlaceList.field_59600   // get_name_2:  com.whatsapp.location.PlaceList.field_59600   // get_Name:    com.whatsapp.location.PlaceList.field_59600   // getName->1:     // getName->2:     // getName->N:     // ofs = 59600 ord = 0 addr = 0
	aload_1 
	invokevirtual float distance( javax.microedition.location.Coordinates, javax.microedition.location.Coordinates ) // pc=2
	op01xx 
	f2d 
	isreal 
	lstore 8
	aload_7 
	getfield com.whatsapp.location.PlaceList.field_59604   // get_name_1:  com.whatsapp.location.PlaceList.field_59604   // get_name_2:  com.whatsapp.location.PlaceList.field_59604   // get_Name:    com.whatsapp.location.PlaceList.field_59604   // getName->1:     // getName->2:     // getName->N:     // ofs = 59604 ord = 1 addr = 0
	iload_2 
	iadd 
	bipush 2
	idiv 
	op01xx 
	i2d 
	isreal 
	lipush 4596373779694328218
	op01xx 
	dmul 
	isreal 
	lstore 10
	isreal 
	lload 8
	isreal 
	lload 10
	op01xx 
	dcmpg 
	ifge Label81
	aload_7 
	getfield com.whatsapp.location.PlaceList.field_59604   // get_name_1:  com.whatsapp.location.PlaceList.field_59604   // get_name_2:  com.whatsapp.location.PlaceList.field_59604   // get_Name:    com.whatsapp.location.PlaceList.field_59604   // getName->1:     // getName->2:     // getName->N:     // ofs = 59604 ord = 1 addr = 0
	iload_2 
	isub 
	invokestatic_lib int abs( int ) // Math
	op01xx 
	i2d 
	isreal 
	lload 10
	op01xx 
	dcmpg 
	ifge Label81
	new_lib Throwable//java.lang.Throwable java.lang.Throwable java.lang.Throwable
	dup 
	ldc literal_95:"return from cache (almost the same list) "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_7 
	invokevirtual int size( java.util.Vector ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_96:" places"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_7 
	areturn 
Label81:
	iload_0 
	iconst_1 
	if_icmpne Label119
	aload_7 
	invokevirtual int size( java.util.Vector ) // pc=1
	bipush 20
	if_icmpge Label119
	isreal 
	lload 8
	iload_2 
	op01xx 
	i2d 
	op01xx 
	dadd 
	aload_7 
	getfield com.whatsapp.location.PlaceList.field_59604   // get_name_1:  com.whatsapp.location.PlaceList.field_59604   // get_name_2:  com.whatsapp.location.PlaceList.field_59604   // get_Name:    com.whatsapp.location.PlaceList.field_59604   // getName->1:     // getName->2:     // getName->N:     // ofs = 59604 ord = 1 addr = 0
	op01xx 
	i2d 
	isreal 
	lipush 4608083138725491507
	op01xx 
	dmul 
	op01xx 
	dcmpg 
	ifgt Label119
	new_lib Throwable//java.lang.Throwable java.lang.Throwable java.lang.Throwable
	dup 
	ldc literal_97:"return from cache (inside) "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_7 
	invokevirtual int size( java.util.Vector ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_96:" places"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_7 
	areturn 
Label119:
	iinc 6 1
	goto_w Label6
Label121:
	aconst_null 
	areturn 
	}


static private final com.whatsapp.location.PlaceList.routine_1935( com.whatsapp.location.PlaceList ); // address: 0
	{
	enter_narrow 
	getstatic com.whatsapp.location.PlaceList.field_59628 // PlaceList
	aload_0 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	getstatic com.whatsapp.location.PlaceList.field_59628 // PlaceList
	invokevirtual int size( java.util.Vector ) // pc=1
	bipush 12
	if_icmple Label11
	getstatic com.whatsapp.location.PlaceList.field_59628 // PlaceList
	iconst_0 
	invokevirtual removeElementAt( java.util.Vector, int ) // pc=2
Label11:
	return 
	}


private <init>( com.whatsapp.location.PlaceList, int, javax.microedition.location.Coordinates, int, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib net.rim.device.api.util.SimpleSortingVector.<init> // pc=1
	aload_0 
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	putfield com.whatsapp.location.PlaceList.field_59608   // get_name_1:  com.whatsapp.location.PlaceList.field_59608   // get_name_2:  com.whatsapp.location.PlaceList.field_59608   // get_Name:    com.whatsapp.location.PlaceList.field_59608   // getName->1:     // getName->2:     // getName->N:     // ofs = 59608 ord = 2 addr = 0
	aload_0 
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	putfield com.whatsapp.location.PlaceList.field_59612   // get_name_1:  com.whatsapp.location.PlaceList.field_59612   // get_name_2:  com.whatsapp.location.PlaceList.field_59612   // get_Name:    com.whatsapp.location.PlaceList.field_59612   // getName->1:     // getName->2:     // getName->N:     // ofs = 59612 ord = 3 addr = 0
	aload_0 
	iconst_0 
	invokevirtual boolean setSort( net.rim.device.api.util.SimpleSortingVector, boolean ) // pc=2
	pop 
	aload_0 
	new_lib com.whatsapp.location.//module:WhatsApp-55.class#6 module:WhatsApp-55.class#6 module:WhatsApp-55.class#6
	dup 
	aload_0 
	invokespecial_lib .routine_2766 // pc=2
	invokevirtual setSortComparator( net.rim.device.api.util.SimpleSortingVector, net.rim.device.api.util.Comparator ) // pc=2
	aload_0 
	iload_1 
	putfield com.whatsapp.location.PlaceList.field_59624   // get_name_1:  com.whatsapp.location.PlaceList.field_59624   // get_name_2:  com.whatsapp.location.PlaceList.field_59624   // get_Name:    com.whatsapp.location.PlaceList.field_59624   // getName->1:     // getName->2:     // getName->N:     // ofs = 59624 ord = 6 addr = 0
	aload_0 
	aload_2 
	putfield com.whatsapp.location.PlaceList.field_59600   // get_name_1:  com.whatsapp.location.PlaceList.field_59600   // get_name_2:  com.whatsapp.location.PlaceList.field_59600   // get_Name:    com.whatsapp.location.PlaceList.field_59600   // getName->1:     // getName->2:     // getName->N:     // ofs = 59600 ord = 0 addr = 0
	aload_0 
	iload_3 
	putfield com.whatsapp.location.PlaceList.field_59604   // get_name_1:  com.whatsapp.location.PlaceList.field_59604   // get_name_2:  com.whatsapp.location.PlaceList.field_59604   // get_Name:    com.whatsapp.location.PlaceList.field_59604   // getName->1:     // getName->2:     // getName->N:     // ofs = 59604 ord = 1 addr = 0
	aload_4 
	ifnull Label33
	aload_0 
	aload_4 
	putfield com.whatsapp.location.PlaceList.field_59608   // get_name_1:  com.whatsapp.location.PlaceList.field_59608   // get_name_2:  com.whatsapp.location.PlaceList.field_59608   // get_Name:    com.whatsapp.location.PlaceList.field_59608   // getName->1:     // getName->2:     // getName->N:     // ofs = 59608 ord = 2 addr = 0
Label33:
	aload_5 
	ifnull Label38
	aload_0 
	aload_5 
	putfield com.whatsapp.location.PlaceList.field_59612   // get_name_1:  com.whatsapp.location.PlaceList.field_59612   // get_name_2:  com.whatsapp.location.PlaceList.field_59612   // get_Name:    com.whatsapp.location.PlaceList.field_59612   // getName->1:     // getName->2:     // getName->N:     // ofs = 59612 ord = 3 addr = 0
Label38:
	return 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	clinit_lib String//java.lang.String java.lang.String java.lang.String
	synch_static PlaceList
	clinit_wait 
	new_lib net.rim.device.api.util.SimpleSortingVector//net.rim.device.api.util.SimpleSortingVector net.rim.device.api.util.SimpleSortingVector net.rim.device.api.util.SimpleSortingVector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putstatic com.whatsapp.location.PlaceList.field_59628 // PlaceList
	ldc literal_98:","
	putstatic com.whatsapp.location.PlaceList.field_59634 // PlaceList
	ldc literal_99:"&"
	putstatic com.whatsapp.location.PlaceList.field_59640 // PlaceList
	ldc literal_100:"types"
	putstatic com.whatsapp.location.PlaceList.field_59646 // PlaceList
	ldc literal_101:"keyword"
	putstatic com.whatsapp.location.PlaceList.field_59652 // PlaceList
	ldc literal_102:"radius"
	putstatic com.whatsapp.location.PlaceList.field_59658 // PlaceList
	ldc literal_103:"location="
	putstatic com.whatsapp.location.PlaceList.field_59664 // PlaceList
	ldc literal_104:"ll="
	putstatic com.whatsapp.location.PlaceList.field_59670 // PlaceList
	ldc literal_105:"query"
	putstatic com.whatsapp.location.PlaceList.field_59676 // PlaceList
	ldc literal_106:"geocode-71.png"
	putstatic com.whatsapp.location.PlaceList.field_59682 // PlaceList
	ldc literal_107:"html_attributions"
	putstatic com.whatsapp.location.PlaceList.field_59688 // PlaceList
	ldc literal_108:"results"
	putstatic com.whatsapp.location.PlaceList.field_59694 // PlaceList
	ldc literal_109:"status"
	putstatic com.whatsapp.location.PlaceList.field_59700 // PlaceList
	ldc literal_110:"OK"
	putstatic com.whatsapp.location.PlaceList.field_59706 // PlaceList
	ldc literal_111:"meta"
	putstatic com.whatsapp.location.PlaceList.field_59712 // PlaceList
	ldc literal_112:"code"
	putstatic com.whatsapp.location.PlaceList.field_59718 // PlaceList
	ldc literal_113:"venues"
	putstatic com.whatsapp.location.PlaceList.field_59724 // PlaceList
	ldc literal_114:"response"
	putstatic com.whatsapp.location.PlaceList.field_59730 // PlaceList
	ldc literal_115:"errorType"
	putstatic com.whatsapp.location.PlaceList.field_59736 // PlaceList
	ldc literal_116:"errorDetail"
	putstatic com.whatsapp.location.PlaceList.field_59742 // PlaceList
	ldc literal_117:"<a href=""
	putstatic com.whatsapp.location.PlaceList.field_59748 // PlaceList
	ldc literal_118:"">"
	putstatic com.whatsapp.location.PlaceList.field_59754 // PlaceList
	ldc literal_119:"</a>"
	putstatic com.whatsapp.location.PlaceList.field_59760 // PlaceList
	ldc literal_120:"https://foursquare.com/"
	putstatic com.whatsapp.location.PlaceList.field_59766 // PlaceList
	ldc literal_121:"rate_limit_exceeded"
	putstatic com.whatsapp.location.PlaceList.field_59772 // PlaceList
	ldc literal_122:"OVER_QUERY_LIMIT"
	putstatic com.whatsapp.location.PlaceList.field_59778 // PlaceList
	ldc literal_123:"ZERO_RESULTS"
	putstatic com.whatsapp.location.PlaceList.field_59784 // PlaceList
	ldc literal_124:"REQUEST_DENIED"
	putstatic com.whatsapp.location.PlaceList.field_59790 // PlaceList
	ldc literal_125:"INVALID_REQUEST"
	putstatic com.whatsapp.location.PlaceList.field_59796 // PlaceList
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.location.PlaceList.routine_140( com.whatsapp.location.PlaceList, module:WhatsApp-79.class#26 ); // address: 0
	{
	enter 
	aload_1 
	getstatic com.whatsapp.location.PlaceList.field_59694 // PlaceList
	invokenonvirtual_lib .routine_13082 // pc=2
	astore_2 
	aload_2 
	invokenonvirtual_lib .routine_12262 // pc=1
	istore_3 
	iconst_0 
	istore_4 
Label10:
	iload_4 
	iload_3 
	if_icmpge Label45
	aload_2 
	iload_4 
	invokenonvirtual_lib .routine_12109 // pc=2
	astore_5 
	aload_5 
	iconst_0 
	invokestatic_lib module:WhatsApp-55.class#5.routine_2133(  ) // class#5
	astore_6 
	aload_6 
	getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	ifnull Label29
	aload_6 
	getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	getstatic com.whatsapp.location.PlaceList.field_59682 // PlaceList
	invokenonvirtual_lib java.lang.String.endsWith // pc=2
	ifne Label43
Label29:
	aload_0 
	aload_6 
	invokevirtual addElement( net.rim.device.api.util.SimpleSortingVector, java.lang.Object ) // pc=2
	goto Label43
	astore_5 
	new_lib Throwable//java.lang.Throwable java.lang.Throwable java.lang.Throwable
	dup 
	ldc literal_86:"Error parsing JSON from Google: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_5 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
Label43:
	iinc 4 1
	goto Label10
Label45:
	aload_1 
	getstatic com.whatsapp.location.PlaceList.field_59688 // PlaceList
	invokenonvirtual_lib .routine_13082 // pc=2
	astore_4 
	aload_4 
	invokenonvirtual_lib .routine_12262 // pc=1
	istore_3 
	aload_0 
	iload_3 
	bipush 2
	imul 
	newarray_object_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	putfield com.whatsapp.location.PlaceList.field_59616   // get_name_1:  com.whatsapp.location.PlaceList.field_59616   // get_name_2:  com.whatsapp.location.PlaceList.field_59616   // get_Name:    com.whatsapp.location.PlaceList.field_59616   // getName->1:     // getName->2:     // getName->N:     // ofs = 59616 ord = 4 addr = 0
	iconst_0 
	istore_5 
	iconst_0 
	istore_6 
Label62:
	iload_5 
	iload_3 
	if_icmpge Label97
	aload_4 
	iload_5 
	invokenonvirtual_lib .routine_12166 // pc=2
	invokestatic java.lang.String[] com.whatsapp.location.PlaceList.routine_989( java.lang.String ) // PlaceList
	astore_7 
	aload_0_getfield com.whatsapp.location.PlaceList.field_59616   // get_name_1:  com.whatsapp.location.PlaceList.field_59616   // get_name_2:  com.whatsapp.location.PlaceList.field_59616   // get_Name:    com.whatsapp.location.PlaceList.field_59616   // getName->1:     // getName->2:     // getName->N:     // ofs = 59616 ord = 4 addr = 0
	iload_6 
	aload_7 
	iconst_0 
	aaload 
	aastore 
	aload_0_getfield com.whatsapp.location.PlaceList.field_59616   // get_name_1:  com.whatsapp.location.PlaceList.field_59616   // get_name_2:  com.whatsapp.location.PlaceList.field_59616   // get_Name:    com.whatsapp.location.PlaceList.field_59616   // getName->1:     // getName->2:     // getName->N:     // ofs = 59616 ord = 4 addr = 0
	iload_6 
	iconst_1 
	iadd 
	aload_7 
	iconst_1 
	aaload 
	aastore 
	iinc 5 1
	iinc 6 2
	goto Label62
	astore_4 
	new_lib Throwable//java.lang.Throwable java.lang.Throwable java.lang.Throwable
	dup 
	ldc literal_87:"Error parsing JSON attributions from Google: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_4 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
Label97:
	return 
	}


private final com.whatsapp.location.PlaceList.routine_380( com.whatsapp.location.PlaceList, module:WhatsApp-79.class#26 ); // address: 0
	{
	enter 
	aload_1 
	getstatic com.whatsapp.location.PlaceList.field_59730 // PlaceList
	invokenonvirtual_lib .routine_13148 // pc=2
	astore_2 
	aload_2 
	getstatic com.whatsapp.location.PlaceList.field_59724 // PlaceList
	invokenonvirtual_lib .routine_13082 // pc=2
	astore_3 
	aload_3 
	invokenonvirtual_lib .routine_12262 // pc=1
	istore_4 
	iconst_0 
	istore_5 
Label14:
	iload_5 
	iload_4 
	if_icmpge Label41
	aload_3 
	iload_5 
	invokenonvirtual_lib .routine_12109 // pc=2
	astore_6 
	aload_6 
	iconst_0 
	invokestatic_lib module:WhatsApp-55.class#5.routine_2165(  ) // class#5
	astore_7 
	aload_0 
	aload_7 
	invokevirtual addElement( net.rim.device.api.util.SimpleSortingVector, java.lang.Object ) // pc=2
	goto Label39
	astore_6 
	new_lib Throwable//java.lang.Throwable java.lang.Throwable java.lang.Throwable
	dup 
	ldc literal_88:"Error parsing JSON from 4sq: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_6 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
Label39:
	iinc 5 1
	goto Label14
Label41:
	aload_0 
	bipush 2
	newarray_object_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	putfield com.whatsapp.location.PlaceList.field_59616   // get_name_1:  com.whatsapp.location.PlaceList.field_59616   // get_name_2:  com.whatsapp.location.PlaceList.field_59616   // get_Name:    com.whatsapp.location.PlaceList.field_59616   // getName->1:     // getName->2:     // getName->N:     // ofs = 59616 ord = 4 addr = 0
	aload_0_getfield com.whatsapp.location.PlaceList.field_59616   // get_name_1:  com.whatsapp.location.PlaceList.field_59616   // get_name_2:  com.whatsapp.location.PlaceList.field_59616   // get_Name:    com.whatsapp.location.PlaceList.field_59616   // getName->1:     // getName->2:     // getName->N:     // ofs = 59616 ord = 4 addr = 0
	iconst_0 
	sipush 955
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	aastore 
	aload_0_getfield com.whatsapp.location.PlaceList.field_59616   // get_name_1:  com.whatsapp.location.PlaceList.field_59616   // get_name_2:  com.whatsapp.location.PlaceList.field_59616   // get_Name:    com.whatsapp.location.PlaceList.field_59616   // getName->1:     // getName->2:     // getName->N:     // ofs = 59616 ord = 4 addr = 0
	iconst_1 
	getstatic com.whatsapp.location.PlaceList.field_59766 // PlaceList
	aastore 
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final java.lang.String[] getAttributions( com.whatsapp.location.PlaceList ); // address: 0
	{
	areturn_field com.whatsapp.location.PlaceList.field_59616   // get_name_1:  com.whatsapp.location.PlaceList.field_59616   // get_name_2:  com.whatsapp.location.PlaceList.field_59616   // get_Name:    com.whatsapp.location.PlaceList.field_59616   // getName->1:     // getName->2:     // getName->N:     // ofs = 59616 ord = 4 addr = 0
	}


public final int getSource( com.whatsapp.location.PlaceList ); // address: 0
	{
	ireturn_field com.whatsapp.location.PlaceList.field_59624   // get_name_1:  com.whatsapp.location.PlaceList.field_59624   // get_name_2:  com.whatsapp.location.PlaceList.field_59624   // get_Name:    com.whatsapp.location.PlaceList.field_59624   // getName->1:     // getName->2:     // getName->N:     // ofs = 59624 ord = 6 addr = 0
	}


public final sortByDistanceTo( com.whatsapp.location.PlaceList, javax.microedition.location.Coordinates ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual int size( java.util.Vector ) // pc=1
	iconst_1 
	isub 
	istore_2 
Label6:
	iload_2 
	iflt Label30
	aload_0 
	iload_2 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.location.PlaceInfo//module:WhatsApp-55.class#5 module:WhatsApp-55.class#5 module:WhatsApp-55.class#5
	astore_3 
	aload_3 
	invokenonvirtual_lib .routine_2059 // pc=1
	astore_4 
	aload_3 
	aload_4 
	ifnull Label25
	aload_4 
	aload_1 
	invokevirtual float distance( javax.microedition.location.Coordinates, javax.microedition.location.Coordinates ) // pc=2
	op01xx 
	f2d 
	goto Label27
Label25:
	isreal 
	lipush 9221120237041090560
Label27:
	lputfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	iinc 2 -1
	goto Label6
Label30:
	aload_0 
	invokevirtual reSort( net.rim.device.api.util.SimpleSortingVector ) // pc=1
	return 
	}

}
