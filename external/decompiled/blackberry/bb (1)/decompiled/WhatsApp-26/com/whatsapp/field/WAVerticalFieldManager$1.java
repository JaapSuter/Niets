// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-37.cod
// Module version  : 2.7.3204
// Class ID        : 17
// ########################################################


package com.whatsapp.field;


abstract final class WAVerticalFieldManager$1 extends Object
implements net.rim.device.api.ui.ScrollChangeListener

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.field.WAVerticalFieldManager /*com.whatsapp.field.WAVerticalFieldManager*/  field_52828 ; // ofs = 52828 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.field.WAVerticalFieldManager$1, com.whatsapp.field.WAVerticalFieldManager ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final scrollChanged( com.whatsapp.field.WAVerticalFieldManager$1, net.rim.device.api.ui.Manager, int, int ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield consistentBottomEdge   // get_name_1:  consistentBottomEdge   // get_name_2:  consistentBottomEdge   // get_Name:    consistentBottomEdge   // getName->1:  consistentBottomEdge   // getName->2:  consistentBottomEdge   // getName->N:  consistentBottomEdge   // ofs = 52764 ord = 0 addr = 0
	ifeq Label12
	iload_3 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	istore_4 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_4 
	invokenonvirtual com.whatsapp.field.WAVerticalFieldManager.computeLastField // pc=2
Label12:
	return 
	}

}
