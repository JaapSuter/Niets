// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-47.cod
// Module version  : 2.8.1914
// Class ID        : 12
// ########################################################


package com.whatsapp.client;


abstract final class RoundedCornerVerticalFieldManager extends net.rim.device.api.ui.container.VerticalFieldManager

{

	// @@@@@@@@@@@@@ Fields 
	private int /*int*/  field_55210 ; // ofs = 55210 addr = 0)
	private int /*int*/  field_55214 ; // ofs = 55214 addr = 0)
	private int /*int*/  field_55218 ; // ofs = 55218 addr = 0)
	private int /*int*/  field_55222 ; // ofs = 55222 addr = 0)
	private int /*int*/  field_55226 ; // ofs = 55226 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.RoundedCornerVerticalFieldManager ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.<init> // pc=1
	aload_0 
	iipush 13882323
	putfield com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55210   // get_name_1:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55210   // get_name_2:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55210   // get_Name:    com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55210   // getName->1:     // getName->2:     // getName->N:     // ofs = 55210 ord = 0 addr = 0
	aload_0 
	iipush 16777215
	putfield com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55214   // get_name_1:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55214   // get_name_2:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55214   // get_Name:    com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55214   // getName->1:     // getName->2:     // getName->N:     // ofs = 55214 ord = 1 addr = 0
	aload_0 
	bipush 2
	putfield com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55218   // get_name_1:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55218   // get_name_2:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55218   // get_Name:    com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55218   // getName->1:     // getName->2:     // getName->N:     // ofs = 55218 ord = 2 addr = 0
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55222   // get_name_1:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55222   // get_name_2:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55222   // get_Name:    com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55222   // getName->1:     // getName->2:     // getName->N:     // ofs = 55222 ord = 3 addr = 0
	aload_0 
	bipush 16
	putfield com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55226   // get_name_1:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55226   // get_name_2:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55226   // get_Name:    com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55226   // getName->1:     // getName->2:     // getName->N:     // ofs = 55226 ord = 4 addr = 0
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
	aload_0_getfield com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55210   // get_name_1:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55210   // get_name_2:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55210   // get_Name:    com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55210   // getName->1:     // getName->2:     // getName->N:     // ofs = 55210 ord = 0 addr = 0
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55222   // get_name_1:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55222   // get_name_2:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55222   // get_Name:    com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55222   // getName->1:     // getName->2:     // getName->N:     // ofs = 55222 ord = 3 addr = 0
	iconst_0 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	bipush 2
	aload_0_getfield com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55222   // get_name_1:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55222   // get_name_2:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55222   // get_Name:    com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55222   // getName->1:     // getName->2:     // getName->N:     // ofs = 55222 ord = 3 addr = 0
	imul 
	isub 
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	aload_0_getfield com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55226   // get_name_1:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55226   // get_name_2:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55226   // get_Name:    com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55226   // getName->1:     // getName->2:     // getName->N:     // ofs = 55226 ord = 4 addr = 0
	aload_0_getfield com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55226   // get_name_1:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55226   // get_name_2:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55226   // get_Name:    com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55226   // getName->1:     // getName->2:     // getName->N:     // ofs = 55226 ord = 4 addr = 0
	invokevirtual fillRoundRect( net.rim.device.api.ui.Graphics, int, int, int, int, int, int ) // pc=7
	aload_1 
	aload_0_getfield com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55214   // get_name_1:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55214   // get_name_2:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55214   // get_Name:    com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55214   // getName->1:     // getName->2:     // getName->N:     // ofs = 55214 ord = 1 addr = 0
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55222   // get_name_1:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55222   // get_name_2:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55222   // get_Name:    com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55222   // getName->1:     // getName->2:     // getName->N:     // ofs = 55222 ord = 3 addr = 0
	aload_0_getfield com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55218   // get_name_1:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55218   // get_name_2:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55218   // get_Name:    com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55218   // getName->1:     // getName->2:     // getName->N:     // ofs = 55218 ord = 2 addr = 0
	iadd 
	iconst_0 
	aload_0_getfield com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55218   // get_name_1:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55218   // get_name_2:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55218   // get_Name:    com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55218   // getName->1:     // getName->2:     // getName->N:     // ofs = 55218 ord = 2 addr = 0
	iadd 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	bipush 2
	aload_0_getfield com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55222   // get_name_1:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55222   // get_name_2:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55222   // get_Name:    com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55222   // getName->1:     // getName->2:     // getName->N:     // ofs = 55222 ord = 3 addr = 0
	imul 
	isub 
	bipush 2
	aload_0_getfield com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55218   // get_name_1:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55218   // get_name_2:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55218   // get_Name:    com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55218   // getName->1:     // getName->2:     // getName->N:     // ofs = 55218 ord = 2 addr = 0
	imul 
	isub 
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	bipush 2
	aload_0_getfield com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55218   // get_name_1:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55218   // get_name_2:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55218   // get_Name:    com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55218   // getName->1:     // getName->2:     // getName->N:     // ofs = 55218 ord = 2 addr = 0
	imul 
	isub 
	aload_0_getfield com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55226   // get_name_1:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55226   // get_name_2:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55226   // get_Name:    com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55226   // getName->1:     // getName->2:     // getName->N:     // ofs = 55226 ord = 4 addr = 0
	aload_0_getfield com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55226   // get_name_1:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55226   // get_name_2:  com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55226   // get_Name:    com.whatsapp.client.RoundedCornerVerticalFieldManager.field_55226   // getName->1:     // getName->2:     // getName->N:     // ofs = 55226 ord = 4 addr = 0
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
