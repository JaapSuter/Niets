// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-28.cod
// Module version  : 2.7.3204
// Class ID        : 19
// ########################################################


package com.whatsapp.client;


abstract final class RoundedCornerVerticalFieldManager extends net.rim.device.api.ui.container.VerticalFieldManager

{

	// @@@@@@@@@@@@@ Fields 
	private int /*int*/  field_54416 ; // ofs = 54416 addr = 0)
	private int /*int*/  field_54420 ; // ofs = 54420 addr = 0)
	private int /*int*/  field_54424 ; // ofs = 54424 addr = 0)
	private int /*int*/  field_54428 ; // ofs = 54428 addr = 0)
	private int /*int*/  field_54432 ; // ofs = 54432 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.RoundedCornerVerticalFieldManager ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.<init> // pc=1
	aload_0 
	iipush 13882323
	putfield com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54416   // get_name_1:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54416   // get_name_2:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54416   // get_Name:    com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54416   // getName->1:     // getName->2:     // getName->N:     // ofs = 54416 ord = 0 addr = 0
	aload_0 
	iipush 16777215
	putfield com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54420   // get_name_1:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54420   // get_name_2:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54420   // get_Name:    com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54420   // getName->1:     // getName->2:     // getName->N:     // ofs = 54420 ord = 1 addr = 0
	aload_0 
	bipush 2
	putfield com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54424   // get_name_1:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54424   // get_name_2:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54424   // get_Name:    com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54424   // getName->1:     // getName->2:     // getName->N:     // ofs = 54424 ord = 2 addr = 0
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54428   // get_name_1:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54428   // get_name_2:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54428   // get_Name:    com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54428   // getName->1:     // getName->2:     // getName->N:     // ofs = 54428 ord = 3 addr = 0
	aload_0 
	bipush 16
	putfield com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54432   // get_name_1:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54432   // get_name_2:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54432   // get_Name:    com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54432   // getName->1:     // getName->2:     // getName->N:     // ofs = 54432 ord = 4 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final paint( com.whatsapp.client.RoundedCornerVerticalFieldManager, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual int getBackgroundColor( net.rim.device.api.ui.Graphics ) // pc=1
	istore_2 
	aload_1 
	invokevirtual int getColor( net.rim.device.api.ui.Graphics ) // pc=1
	istore_3 
	aload_1 
	iipush 14146774
	invokevirtual setBackgroundColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	invokevirtual clear( net.rim.device.api.ui.Graphics ) // pc=1
	aload_1 
	iload_2 
	invokevirtual setBackgroundColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54416   // get_name_1:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54416   // get_name_2:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54416   // get_Name:    com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54416   // getName->1:     // getName->2:     // getName->N:     // ofs = 54416 ord = 0 addr = 0
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54428   // get_name_1:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54428   // get_name_2:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54428   // get_Name:    com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54428   // getName->1:     // getName->2:     // getName->N:     // ofs = 54428 ord = 3 addr = 0
	iconst_0 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	bipush 2
	aload_0_getfield com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54428   // get_name_1:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54428   // get_name_2:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54428   // get_Name:    com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54428   // getName->1:     // getName->2:     // getName->N:     // ofs = 54428 ord = 3 addr = 0
	imul 
	isub 
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	aload_0_getfield com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54432   // get_name_1:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54432   // get_name_2:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54432   // get_Name:    com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54432   // getName->1:     // getName->2:     // getName->N:     // ofs = 54432 ord = 4 addr = 0
	aload_0_getfield com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54432   // get_name_1:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54432   // get_name_2:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54432   // get_Name:    com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54432   // getName->1:     // getName->2:     // getName->N:     // ofs = 54432 ord = 4 addr = 0
	invokevirtual fillRoundRect( net.rim.device.api.ui.Graphics, int, int, int, int, int, int ) // pc=7
	aload_1 
	aload_0_getfield com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54420   // get_name_1:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54420   // get_name_2:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54420   // get_Name:    com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54420   // getName->1:     // getName->2:     // getName->N:     // ofs = 54420 ord = 1 addr = 0
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54428   // get_name_1:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54428   // get_name_2:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54428   // get_Name:    com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54428   // getName->1:     // getName->2:     // getName->N:     // ofs = 54428 ord = 3 addr = 0
	aload_0_getfield com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54424   // get_name_1:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54424   // get_name_2:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54424   // get_Name:    com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54424   // getName->1:     // getName->2:     // getName->N:     // ofs = 54424 ord = 2 addr = 0
	iadd 
	iconst_0 
	aload_0_getfield com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54424   // get_name_1:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54424   // get_name_2:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54424   // get_Name:    com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54424   // getName->1:     // getName->2:     // getName->N:     // ofs = 54424 ord = 2 addr = 0
	iadd 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	bipush 2
	aload_0_getfield com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54428   // get_name_1:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54428   // get_name_2:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54428   // get_Name:    com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54428   // getName->1:     // getName->2:     // getName->N:     // ofs = 54428 ord = 3 addr = 0
	imul 
	isub 
	bipush 2
	aload_0_getfield com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54424   // get_name_1:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54424   // get_name_2:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54424   // get_Name:    com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54424   // getName->1:     // getName->2:     // getName->N:     // ofs = 54424 ord = 2 addr = 0
	imul 
	isub 
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	bipush 2
	aload_0_getfield com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54424   // get_name_1:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54424   // get_name_2:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54424   // get_Name:    com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54424   // getName->1:     // getName->2:     // getName->N:     // ofs = 54424 ord = 2 addr = 0
	imul 
	isub 
	aload_0_getfield com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54432   // get_name_1:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54432   // get_name_2:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54432   // get_Name:    com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54432   // getName->1:     // getName->2:     // getName->N:     // ofs = 54432 ord = 4 addr = 0
	aload_0_getfield com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54432   // get_name_1:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54432   // get_name_2:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54432   // get_Name:    com.whatsapp.client.RoundedCornerVerticalFieldManager.field_54432   // getName->1:     // getName->2:     // getName->N:     // ofs = 54432 ord = 4 addr = 0
	invokevirtual fillRoundRect( net.rim.device.api.ui.Graphics, int, int, int, int, int, int ) // pc=7
	aload_1 
	iload_3 
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_0 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.Manager.paint // pc=2
	return 
	}

}
