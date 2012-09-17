// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-44.cod
// Module version  : 2.7.6550
// Class ID        : 0
// ########################################################


package com.whatsapp.location;


abstract public final class LegacyLocationProvider extends Object

{

	// @@@@@@@@@@@@@ Fields 
	private com.rim.resources. /*module:WhatsApp-42.class#0*/  _legacyListener ; // ofs = 58886 addr = 0)
	private int /*int*/  field_58890 ; // ofs = 58890 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.location.LegacyLocationProvider ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	bipush 5
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	return 
	}


static private final javax.microedition.location.Criteria getCriteriaForCase( int ); // address: 0
	{
	enter 
	new_lib javax.microedition.location.Criteria//javax.microedition.location.Criteria javax.microedition.location.Criteria javax.microedition.location.Criteria
	dup 
	invokespecial_lib javax.microedition.location.Criteria.<init> // pc=1
	astore_1 
	iload_0 
Label7:
	aload_1 
	iconst_0 
	invokevirtual setPreferredPowerConsumption( javax.microedition.location.Criteria, int ) // pc=2
	aload_1 
	sipush 1000
	invokevirtual setHorizontalAccuracy( javax.microedition.location.Criteria, int ) // pc=2
	aload_1 
	iconst_1 
	invokevirtual setCostAllowed( javax.microedition.location.Criteria, boolean ) // pc=2
	aload_1 
	bipush 120
	invokevirtual setPreferredResponseTime( javax.microedition.location.Criteria, int ) // pc=2
	aload_1 
	areturn 
Label21:
	aload_1 
	iconst_1 
	invokevirtual setCostAllowed( javax.microedition.location.Criteria, boolean ) // pc=2
	aload_1 
	iconst_0 
	invokevirtual setHorizontalAccuracy( javax.microedition.location.Criteria, int ) // pc=2
	aload_1 
	iconst_0 
	invokevirtual setVerticalAccuracy( javax.microedition.location.Criteria, int ) // pc=2
	aload_1 
	iconst_0 
	invokevirtual setPreferredPowerConsumption( javax.microedition.location.Criteria, int ) // pc=2
	aload_1 
	areturn 
Label35:
	aload_1 
	iconst_1 
	invokevirtual setPreferredPowerConsumption( javax.microedition.location.Criteria, int ) // pc=2
	aload_1 
	iconst_0 
	invokevirtual setHorizontalAccuracy( javax.microedition.location.Criteria, int ) // pc=2
	aload_1 
	iconst_0 
	invokevirtual setVerticalAccuracy( javax.microedition.location.Criteria, int ) // pc=2
	aload_1 
	iconst_1 
	invokevirtual setCostAllowed( javax.microedition.location.Criteria, boolean ) // pc=2
	aload_1 
	areturn 
Label49:
	aload_1 
	bipush 2
	invokevirtual setPreferredPowerConsumption( javax.microedition.location.Criteria, int ) // pc=2
	aload_1 
	sipush 1000
	invokevirtual setHorizontalAccuracy( javax.microedition.location.Criteria, int ) // pc=2
	aload_1 
	sipush 1000
	invokevirtual setVerticalAccuracy( javax.microedition.location.Criteria, int ) // pc=2
	aload_1 
	iconst_1 
	invokevirtual setCostAllowed( javax.microedition.location.Criteria, boolean ) // pc=2
	aload_1 
	areturn 
Label63:
	aload_1 
	sipush 1000
	invokevirtual setHorizontalAccuracy( javax.microedition.location.Criteria, int ) // pc=2
	aload_1 
	sipush 1000
	invokevirtual setVerticalAccuracy( javax.microedition.location.Criteria, int ) // pc=2
	aload_1 
	iconst_0 
	invokevirtual setCostAllowed( javax.microedition.location.Criteria, boolean ) // pc=2
	aload_1 
	iconst_1 
	invokevirtual setPreferredPowerConsumption( javax.microedition.location.Criteria, int ) // pc=2
	aload_1 
	areturn 
Label77:
	aconst_null 
	areturn 
Label79:
	aload_1 
	areturn 
	}

}
