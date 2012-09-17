// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-12.cod
// Module version  : 2.7.6550
// Class ID        : 12
// ########################################################


package com.whatsapp.client;


abstract public final class ConflictingApps extends Object

{


	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.ConflictingApps ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}


static public final boolean allClear(  ); // address: 0
	{
	enter_narrow 
	invokestatic boolean com.whatsapp.client.ConflictingApps.routine_1457(  ) // ConflictingApps
	istore_0 
	iload_0 
	ireturn 
	}


static private final boolean com.whatsapp.client.ConflictingApps.routine_1457(  ); // address: 0
	{
	enter_narrow 
	invokestatic_lib net.rim.device.api.system.ApplicationManager getApplicationManager(  ) // ApplicationManager
	invokevirtual net.rim.device.api.system.ApplicationDescriptor[] getVisibleApplications( net.rim.device.api.system.ApplicationManager ) // pc=1
	astore_0 
	iconst_0 
	istore_1 
Label6:
	iload_1 
	aload_0 
	arraylength 
	if_icmpge Label23
	aload_0 
	iload_1 
	aaload 
	astore_2 
	aload_2 
	invokevirtual java.lang.String getModuleName( net.rim.device.api.system.ApplicationDescriptor ) // pc=1
	ldc literal_54:"EmailPlusPlus"
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label21
	iconst_0 
	ireturn 
Label21:
	iinc 1 1
	goto Label6
Label23:
	iconst_1 
	ireturn 
	}

}
