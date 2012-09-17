// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-55.cod
// Module version  : 2.8.1914
// Class ID        : 10
// ########################################################


package com.whatsapp.field;


abstract final class WAEyelidFieldManager$EyelidManager extends net.rim.device.api.ui.container.VerticalFieldManager

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.device.api.system.Bitmap /*net.rim.device.api.system.Bitmap*/  field_54800 ; // ofs = 54800 addr = 0)
	private final com.whatsapp.field.WAEyelidFieldManager /*com.whatsapp.field.WAEyelidFieldManager*/  field_54804 ; // ofs = 54804 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.field.WAEyelidFieldManager$EyelidManager, com.whatsapp.field.WAEyelidFieldManager ); // address: 0
	{
	enter_narrow 
	aload_0 
	lipush 1152921504606846976
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.<init> // pc=3
	aload_0 
	aload_1 
	putfield com.whatsapp.field.WAEyelidFieldManager$EyelidManager.field_54804   // get_name_1:  com.whatsapp.field.WAEyelidFieldManager$EyelidManager.field_54804   // get_name_2:  com.whatsapp.field.WAEyelidFieldManager$EyelidManager.field_54804   // get_Name:    com.whatsapp.field.WAEyelidFieldManager$EyelidManager.field_54804   // getName->1:     // getName->2:     // getName->N:     // ofs = 54804 ord = 1 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final boolean touchEvent( com.whatsapp.field.WAEyelidFieldManager$EyelidManager, net.rim.device.api.ui.TouchEvent ); // address: 0
	{
	enter 
	aload_1 
	iconst_1 
	invokevirtual int getX( net.rim.device.api.ui.TouchEvent, int ) // pc=2
	istore_2 
	aload_1 
	iconst_1 
	invokevirtual int getY( net.rim.device.api.ui.TouchEvent, int ) // pc=2
	istore_3 
	iload_2 
	iflt Label24
	iload_3 
	iflt Label24
	iload_2 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	if_icmpge Label24
	iload_3 
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	if_icmpge Label24
	aload_0_getfield com.whatsapp.field.WAEyelidFieldManager$EyelidManager.field_54804   // get_name_1:  com.whatsapp.field.WAEyelidFieldManager$EyelidManager.field_54804   // get_name_2:  com.whatsapp.field.WAEyelidFieldManager$EyelidManager.field_54804   // get_Name:    com.whatsapp.field.WAEyelidFieldManager$EyelidManager.field_54804   // getName->1:     // getName->2:     // getName->N:     // ofs = 54804 ord = 1 addr = 0
	iconst_1 
	invokenonvirtual_lib .routine_6035 // pc=2
Label24:
	aload_0 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.Manager.touchEvent // pc=2
	ireturn 
	}


public final startBlink( com.whatsapp.field.WAEyelidFieldManager$EyelidManager ); // address: 0
	{
	enter 
	aload_0 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	invokestatic_lib module:WhatsApp-58.class#1.routine_2386(  ) // class#1
	putfield com.whatsapp.field.WAEyelidFieldManager$EyelidManager.field_54800   // get_name_1:  com.whatsapp.field.WAEyelidFieldManager$EyelidManager.field_54800   // get_name_2:  com.whatsapp.field.WAEyelidFieldManager$EyelidManager.field_54800   // get_Name:    com.whatsapp.field.WAEyelidFieldManager$EyelidManager.field_54800   // getName->1:     // getName->2:     // getName->N:     // ofs = 54800 ord = 0 addr = 0
	aload_0_getfield com.whatsapp.field.WAEyelidFieldManager$EyelidManager.field_54800   // get_name_1:  com.whatsapp.field.WAEyelidFieldManager$EyelidManager.field_54800   // get_name_2:  com.whatsapp.field.WAEyelidFieldManager$EyelidManager.field_54800   // get_Name:    com.whatsapp.field.WAEyelidFieldManager$EyelidManager.field_54800   // getName->1:     // getName->2:     // getName->N:     // ofs = 54800 ord = 0 addr = 0
	invokestatic_lib module:WhatsApp-60.class#2.routine_3149(  ) // class#2
	astore_1 
	aload_0 
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	istore_2 
	iconst_0 
	istore_3 
Label16:
	iload_3 
	iload_2 
	if_icmpge Label27
	aload_0 
	aload_1 
	aload_0 
	iload_3 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	invokevirtual paintChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Graphics, net.rim.device.api.ui.Field ) // pc=3
	iinc 3 1
	goto Label16
Label27:
	return 
	}


public final endBlink( com.whatsapp.field.WAEyelidFieldManager$EyelidManager ); // address: 0
	{
	enter_narrow 
	aload_0 
	aconst_null 
	putfield com.whatsapp.field.WAEyelidFieldManager$EyelidManager.field_54800   // get_name_1:  com.whatsapp.field.WAEyelidFieldManager$EyelidManager.field_54800   // get_name_2:  com.whatsapp.field.WAEyelidFieldManager$EyelidManager.field_54800   // get_Name:    com.whatsapp.field.WAEyelidFieldManager$EyelidManager.field_54800   // getName->1:     // getName->2:     // getName->N:     // ofs = 54800 ord = 0 addr = 0
	return 
	}


protected final subpaint( com.whatsapp.field.WAEyelidFieldManager$EyelidManager, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.field.WAEyelidFieldManager$EyelidManager.field_54800   // get_name_1:  com.whatsapp.field.WAEyelidFieldManager$EyelidManager.field_54800   // get_name_2:  com.whatsapp.field.WAEyelidFieldManager$EyelidManager.field_54800   // get_Name:    com.whatsapp.field.WAEyelidFieldManager$EyelidManager.field_54800   // getName->1:     // getName->2:     // getName->N:     // ofs = 54800 ord = 0 addr = 0
	ifnull Label16
	aload_1 
	bipush -97
	iconst_0 
	iconst_0 
	aload_0_getfield com.whatsapp.field.WAEyelidFieldManager$EyelidManager.field_54800   // get_name_1:  com.whatsapp.field.WAEyelidFieldManager$EyelidManager.field_54800   // get_name_2:  com.whatsapp.field.WAEyelidFieldManager$EyelidManager.field_54800   // get_Name:    com.whatsapp.field.WAEyelidFieldManager$EyelidManager.field_54800   // getName->1:     // getName->2:     // getName->N:     // ofs = 54800 ord = 0 addr = 0
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_0_getfield com.whatsapp.field.WAEyelidFieldManager$EyelidManager.field_54800   // get_name_1:  com.whatsapp.field.WAEyelidFieldManager$EyelidManager.field_54800   // get_name_2:  com.whatsapp.field.WAEyelidFieldManager$EyelidManager.field_54800   // get_Name:    com.whatsapp.field.WAEyelidFieldManager$EyelidManager.field_54800   // getName->1:     // getName->2:     // getName->N:     // ofs = 54800 ord = 0 addr = 0
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	aload_0_getfield com.whatsapp.field.WAEyelidFieldManager$EyelidManager.field_54800   // get_name_1:  com.whatsapp.field.WAEyelidFieldManager$EyelidManager.field_54800   // get_name_2:  com.whatsapp.field.WAEyelidFieldManager$EyelidManager.field_54800   // get_Name:    com.whatsapp.field.WAEyelidFieldManager$EyelidManager.field_54800   // getName->1:     // getName->2:     // getName->N:     // ofs = 54800 ord = 0 addr = 0
	iconst_0 
	iconst_0 
	invokevirtual rop( net.rim.device.api.ui.Graphics, int, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=9
	return 
Label16:
	aload_0 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.subpaint // pc=2
	return 
	}

}
