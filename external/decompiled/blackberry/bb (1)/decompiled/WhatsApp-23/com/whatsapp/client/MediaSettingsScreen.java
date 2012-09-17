// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-23.cod
// Module version  : 2.7.3204
// Class ID        : 5
// ########################################################


package com.whatsapp.client;


abstract final class MediaSettingsScreen extends net.rim.device.api.ui.container.MainScreen

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_54164 ; // ofs = 54164 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_54168 ; // ofs = 54168 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_54172 ; // ofs = 54172 addr = 0)
	private net.rim.device.api.ui.component.ObjectChoiceField /*net.rim.device.api.ui.component.ObjectChoiceField*/  field_54176 ; // ofs = 54176 addr = 0)
	private net.rim.device.api.ui.component.ObjectChoiceField /*net.rim.device.api.ui.component.ObjectChoiceField*/  field_54180 ; // ofs = 54180 addr = 0)
	private net.rim.device.api.ui.component.ObjectChoiceField /*net.rim.device.api.ui.component.ObjectChoiceField*/  field_54184 ; // ofs = 54184 addr = 0)
	private net.rim.device.api.ui.component.LabelField /*net.rim.device.api.ui.component.LabelField*/  field_54188 ; // ofs = 54188 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.MediaSettingsScreen ); // address: 0
	{
	enter 
	aload_0 
	lipush 299067163017216
	invokespecial_lib net.rim.device.api.ui.container.MainScreen.<init> // pc=3
	aload_0 
	iconst_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokevirtual setTitle( net.rim.device.api.ui.container.MainScreen, java.lang.String ) // pc=2
	aload_0 
	invokevirtual net.rim.device.api.ui.Manager getMainManager( net.rim.device.api.ui.container.MainScreen ) // pc=1
	invokestatic_lib module:WhatsApp-7.class#21.routine_4127(  ) // class#21
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	aload_0 
	sipush 887
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	iipush 16777215
	invokestatic_lib module:WhatsApp-32.class#2.routine_6735(  ) // class#2
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	iipush 310000
	istore_1 
	sipush 1200
	istore_2 
	aload_0 
	new_lib com.whatsapp.client.MediaSettingsScreen$1//module:WhatsApp-22.class#20 module:WhatsApp-22.class#20 module:WhatsApp-22.class#20
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5730(  ) // class#28
	sipush 347
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial_lib .routine_5836 // pc=6
	putfield com.whatsapp.client.MediaSettingsScreen.field_54172   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54172   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54172   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54172   // getName->1:     // getName->2:     // getName->N:     // ofs = 54172 ord = 2 addr = 0
	aload_0 
	new_lib com.whatsapp.client.MediaSettingsScreen$2//module:WhatsApp-22.class#21 module:WhatsApp-22.class#21 module:WhatsApp-22.class#21
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5730(  ) // class#28
	bipush 51
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial_lib .routine_5886 // pc=6
	putfield com.whatsapp.client.MediaSettingsScreen.field_54164   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54164   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54164   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54164   // getName->1:     // getName->2:     // getName->N:     // ofs = 54164 ord = 0 addr = 0
	aload_0 
	new MediaSettingsScreen$3
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5730(  ) // class#28
	bipush 2
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial com.whatsapp.client.MediaSettingsScreen$3.<init> // pc=6
	putfield com.whatsapp.client.MediaSettingsScreen.field_54168   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54168   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54168   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54168   // getName->1:     // getName->2:     // getName->N:     // ofs = 54168 ord = 1 addr = 0
	invokestatic_lib module:WhatsApp-26.class#11.routine_3571(  ) // class#11
	invokenonvirtual_lib .routine_2951 // pc=1
	astore_3 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	astore_4 
	aload_4 
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	istore_5 
	aload_4 
	iconst_0 
	iload_5 
	bipush 4
	isub 
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int, int ) // pc=3
	astore_6 
	invokestatic_lib module:WhatsApp-32.class#2.routine_6640(  ) // class#2
	istore 8
	iload 8
	ifne Label85
	getstatic_lib module:WhatsApp-12.class#0.static_47 // class#0
	aload_3 
	invokenonvirtual_lib .routine_2676 // pc=1
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label85
	iconst_1 
	istore 8
Label85:
	iload 8
	ifne Label88
	goto_w Label154
Label88:
	aload_0 
	invokespecial com.whatsapp.client.MediaSettingsScreen.routine_8598 // pc=1
	bipush 2
	newarray_object MediaSettingsScreen$FsRootChoice
	dup 
	iconst_0 
	new MediaSettingsScreen$FsRootChoice
	dup 
	aload_0 
	getstatic_lib module:WhatsApp-12.class#0.static_46 // class#0
	sipush 353
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokespecial com.whatsapp.client.MediaSettingsScreen$FsRootChoice.<init> // pc=4
	aastore 
	dup 
	iconst_1 
	new MediaSettingsScreen$FsRootChoice
	dup 
	aload_0 
	getstatic_lib module:WhatsApp-12.class#0.static_47 // class#0
	sipush 352
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokespecial com.whatsapp.client.MediaSettingsScreen$FsRootChoice.<init> // pc=4
	aastore 
	astore 9
	aload_0 
	new_lib net.rim.device.api.ui.decor.Background//net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background
	dup 
	bipush 22
	sipush 713
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	aload 9
	iconst_0 
	invokespecial_lib net.rim.device.api.ui.component.ObjectChoiceField.<init> // pc=4
	putfield com.whatsapp.client.MediaSettingsScreen.field_54180   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54180   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54180   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54180   // getName->1:     // getName->2:     // getName->N:     // ofs = 54180 ord = 4 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_54180   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54180   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54180   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54180   // getName->1:     // getName->2:     // getName->N:     // ofs = 54180 ord = 4 addr = 0
	invokespecial com.whatsapp.client.MediaSettingsScreen.routine_8560 // pc=2
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_54180   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54180   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54180   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54180   // getName->1:     // getName->2:     // getName->N:     // ofs = 54180 ord = 4 addr = 0
	new MediaSettingsScreen$FsRootChoice
	dup 
	aload_0 
	aload_3 
	invokenonvirtual_lib .routine_2676 // pc=1
	ldc literal_67:"*Do Not Display*"
	invokespecial com.whatsapp.client.MediaSettingsScreen$FsRootChoice.<init> // pc=4
	invokevirtual setSelectedIndex( net.rim.device.api.ui.component.ChoiceField, java.lang.Object ) // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_54180   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54180   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54180   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54180   // getName->1:     // getName->2:     // getName->N:     // ofs = 54180 ord = 4 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	dup 
	sipush 714
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=2
	astore 10
	aload 10
	aload_6 
	invokevirtual setFont( net.rim.device.api.ui.Field, net.rim.device.api.ui.Font ) // pc=2
	aload_0 
	aload 10
	invokespecial com.whatsapp.client.MediaSettingsScreen.routine_8560 // pc=2
	aload_0 
	aload 10
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
Label154:
	invokestatic_lib module:WhatsApp-24.class#2.routine_4009(  ) // class#2
	invokeinterface interfacemethodref_18 // pc=1 guess=23
	ifne Label158
	goto_w Label371
Label158:
	aload_0 
	invokespecial com.whatsapp.client.MediaSettingsScreen.routine_8598 // pc=1
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	astore 9
	new MediaSettingsScreen$FsRootChoice
	dup 
	aload_0 
	getstatic_lib module:WhatsApp-12.class#0.static_41 // class#0
	sipush 352
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokespecial com.whatsapp.client.MediaSettingsScreen$FsRootChoice.<init> // pc=4
	astore 10
	new MediaSettingsScreen$FsRootChoice
	dup 
	aload_0 
	getstatic_lib module:WhatsApp-12.class#0.static_42 // class#0
	sipush 353
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokespecial com.whatsapp.client.MediaSettingsScreen$FsRootChoice.<init> // pc=4
	astore 11
	new MediaSettingsScreen$FsRootChoice
	dup 
	aload_0 
	getstatic_lib module:WhatsApp-12.class#0.static_43 // class#0
	sipush 353
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokespecial com.whatsapp.client.MediaSettingsScreen$FsRootChoice.<init> // pc=4
	astore 12
	aload 9
	aload 10
	invokenonvirtual com.whatsapp.client.MediaSettingsScreen$FsRootChoice.getFsRoot // pc=1
	aload 10
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload 9
	aload 11
	invokenonvirtual com.whatsapp.client.MediaSettingsScreen$FsRootChoice.getFsRoot // pc=1
	aload 11
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload 9
	aload 12
	invokenonvirtual com.whatsapp.client.MediaSettingsScreen$FsRootChoice.getFsRoot // pc=1
	aload 12
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	new_lib net.rim.device.api.system.EncodedImage//net.rim.device.api.system.EncodedImage net.rim.device.api.system.EncodedImage net.rim.device.api.system.EncodedImage
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore 13
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	astore 14
	aload 13
	new MediaSettingsScreen$FsRootChoice
	dup 
	aload_0 
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	sipush 228
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokespecial com.whatsapp.client.MediaSettingsScreen$FsRootChoice.<init> // pc=4
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload 14
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	invokestatic_lib module:WhatsApp-26.class#11.routine_3571(  ) // class#11
	invokenonvirtual_lib .routine_2951 // pc=1
	invokenonvirtual_lib .routine_2593 // pc=1
	astore 15
	aload 15
	stringlength 
	ifle Label257
	aload 9
	aload 15
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast MediaSettingsScreen$FsRootChoice
	astore 16
	aload 16
	ifnonnull Label249
	new MediaSettingsScreen$FsRootChoice
	dup 
	aload_0 
	aload 15
	aload 15
	invokespecial com.whatsapp.client.MediaSettingsScreen$FsRootChoice.<init> // pc=4
	astore 16
Label249:
	aload 13
	aload 16
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload 14
	aload 15
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
Label257:
	aload 14
	aload 11
	invokenonvirtual com.whatsapp.client.MediaSettingsScreen$FsRootChoice.getFsRoot // pc=1
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	invokestatic_lib java.util.Enumeration listRoots(  ) // FileSystemRegistry
	astore 16
Label265:
	aload 16
	invokeinterface interfacemethodref_11 // pc=1 guess=24
	ifeq Label300
	aload 16
	invokeinterface interfacemethodref_12 // pc=1 guess=25
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore 17
	aload 14
	aload 17
	invokevirtual boolean containsKey( java.util.Hashtable, java.lang.Object ) // pc=2
	ifeq Label277
	goto Label265
Label277:
	aload 9
	aload 17
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast MediaSettingsScreen$FsRootChoice
	astore 18
	aload 18
	ifnonnull Label291
	new MediaSettingsScreen$FsRootChoice
	dup 
	aload_0 
	aload 17
	aload 17
	invokespecial com.whatsapp.client.MediaSettingsScreen$FsRootChoice.<init> // pc=4
	astore 18
Label291:
	aload 13
	aload 18
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload 14
	aload 17
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	goto Label265
Label300:
	aload 13
	invokevirtual int size( java.util.Vector ) // pc=1
	newarray_object MediaSettingsScreen$FsRootChoice
	astore_7 
	aload 13
	aload_7 
	invokevirtual copyInto( java.util.Vector, java.lang.Object[] ) // pc=2
	aload_0 
	new_lib net.rim.device.api.ui.decor.Background//net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background
	dup 
	bipush 22
	sipush 335
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	aload_7 
	iconst_0 
	invokespecial_lib net.rim.device.api.ui.component.ObjectChoiceField.<init> // pc=4
	putfield com.whatsapp.client.MediaSettingsScreen.field_54184   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54184   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54184   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54184   // getName->1:     // getName->2:     // getName->N:     // ofs = 54184 ord = 5 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_54184   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54184   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54184   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54184   // getName->1:     // getName->2:     // getName->N:     // ofs = 54184 ord = 5 addr = 0
	invokespecial com.whatsapp.client.MediaSettingsScreen.routine_8560 // pc=2
	aload_3 
	invokenonvirtual_lib .routine_2593 // pc=1
	ifnonnull Label328
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_54184   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54184   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54184   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54184   // getName->1:     // getName->2:     // getName->N:     // ofs = 54184 ord = 5 addr = 0
	iconst_0 
	invokevirtual setSelectedIndex( net.rim.device.api.ui.component.ChoiceField, int ) // pc=2
	goto Label337
Label328:
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_54184   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54184   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54184   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54184   // getName->1:     // getName->2:     // getName->N:     // ofs = 54184 ord = 5 addr = 0
	new MediaSettingsScreen$FsRootChoice
	dup 
	aload_0 
	aload_3 
	invokenonvirtual_lib .routine_2593 // pc=1
	ldc literal_67:"*Do Not Display*"
	invokespecial com.whatsapp.client.MediaSettingsScreen$FsRootChoice.<init> // pc=4
	invokevirtual setSelectedIndex( net.rim.device.api.ui.component.ChoiceField, java.lang.Object ) // pc=2
Label337:
	aload_0 
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_54184   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54184   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54184   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54184   // getName->1:     // getName->2:     // getName->N:     // ofs = 54184 ord = 5 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	invokestatic_lib module:WhatsApp-24.class#2.routine_4009(  ) // class#2
	invokeinterface interfacemethodref_19 // pc=1 guess=26
	astore 17
	aload 17
	ifnonnull Label352
	aload 13
	invokevirtual int size( java.util.Vector ) // pc=1
	iconst_1 
	if_icmpgt Label352
	sipush 604
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	astore 17
Label352:
	aload 17
	ifnull Label371
	aload_0 
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	dup 
	sipush 349
	aload 17
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=2
	putfield com.whatsapp.client.MediaSettingsScreen.field_54188   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54188   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54188   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54188   // getName->1:     // getName->2:     // getName->N:     // ofs = 54188 ord = 6 addr = 0
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_54188   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54188   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54188   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54188   // getName->1:     // getName->2:     // getName->N:     // ofs = 54188 ord = 6 addr = 0
	aload_6 
	invokevirtual setFont( net.rim.device.api.ui.Field, net.rim.device.api.ui.Font ) // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_54188   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54188   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54188   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54188   // getName->1:     // getName->2:     // getName->N:     // ofs = 54188 ord = 6 addr = 0
	invokespecial com.whatsapp.client.MediaSettingsScreen.routine_8560 // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_54188   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54188   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54188   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54188   // getName->1:     // getName->2:     // getName->N:     // ofs = 54188 ord = 6 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
Label371:
	aload_0 
	invokespecial com.whatsapp.client.MediaSettingsScreen.routine_8598 // pc=1
	bipush 2
	newarray_object_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	iconst_0 
	sipush 227
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	aastore 
	dup 
	iconst_1 
	sipush 228
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	aastore 
	astore 9
	aload_0 
	new_lib net.rim.device.api.ui.decor.Background//net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background
	dup 
	bipush 22
	sipush 850
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	aload 9
	iconst_0 
	invokespecial_lib net.rim.device.api.ui.component.ObjectChoiceField.<init> // pc=4
	putfield com.whatsapp.client.MediaSettingsScreen.field_54176   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54176   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54176   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54176   // getName->1:     // getName->2:     // getName->N:     // ofs = 54176 ord = 3 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_54176   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54176   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54176   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54176   // getName->1:     // getName->2:     // getName->N:     // ofs = 54176 ord = 3 addr = 0
	invokespecial com.whatsapp.client.MediaSettingsScreen.routine_8560 // pc=2
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_54176   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54176   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54176   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54176   // getName->1:     // getName->2:     // getName->N:     // ofs = 54176 ord = 3 addr = 0
	aload_3 
	invokenonvirtual_lib .routine_1836 // pc=1
	ifeq Label406
	iconst_0 
	goto Label407
Label406:
	iconst_1 
Label407:
	invokevirtual setSelectedIndex( net.rim.device.api.ui.component.ChoiceField, int ) // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_54176   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54176   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54176   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54176   // getName->1:     // getName->2:     // getName->N:     // ofs = 54176 ord = 3 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.MediaSettingsScreen.routine_8560( com.whatsapp.client.MediaSettingsScreen, net.rim.device.api.ui.Field ); // address: 0
	{
	enter 
	aload_1 
	iconst_0 
	bipush 12
	iconst_0 
	bipush 12
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_1 
	bipush 6
	iconst_0 
	bipush 6
	iconst_0 
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	return 
	}


private final com.whatsapp.client.MediaSettingsScreen.routine_8598( com.whatsapp.client.MediaSettingsScreen ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual int getFieldCount( net.rim.device.api.ui.container.MainScreen ) // pc=1
	iconst_1 
	if_icmple Label18
	new_lib com.whatsapp.field.ShadedSeparator//com.whatsapp.field.ShadedSeparator com.whatsapp.field.ShadedSeparator com.whatsapp.field.ShadedSeparator
	dup 
	invokespecial_lib .routine_3198 // pc=1
	astore_1 
	aload_1 
	bipush 6
	bipush 12
	bipush 6
	bipush 12
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	aload_1 
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
Label18:
	return 
	}


private final boolean com.whatsapp.client.MediaSettingsScreen.routine_8655( com.whatsapp.client.MediaSettingsScreen ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-26.class#11.routine_3571(  ) // class#11
	astore_1 
	aload_1 
	invokenonvirtual_lib .routine_2951 // pc=1
	astore_2 
	iconst_0 
	istore_3 
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	astore_4 
	invokestatic_lib module:WhatsApp-10.class#4.routine_2324(  ) // class#4
	astore_5 
	aload_5 
	invokeinterface interfacemethodref_18 // pc=1 guess=27
	ifeq Label34
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_54184   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54184   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54184   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54184   // getName->1:     // getName->2:     // getName->N:     // ofs = 54184 ord = 5 addr = 0
	invokevirtual int getSelectedIndex( net.rim.device.api.ui.component.ChoiceField ) // pc=1
	istore_6 
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_54184   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54184   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54184   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54184   // getName->1:     // getName->2:     // getName->N:     // ofs = 54184 ord = 5 addr = 0
	iload_6 
	invokevirtual java.lang.Object getChoice( net.rim.device.api.ui.component.ObjectChoiceField, int ) // pc=2
	checkcast MediaSettingsScreen$FsRootChoice
	invokenonvirtual com.whatsapp.client.MediaSettingsScreen$FsRootChoice.getFsRoot // pc=1
	astore_4 
	aload_4 
	aload_2 
	invokenonvirtual_lib .routine_2593 // pc=1
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label34
	iconst_1 
	istore_3 
	aload_5 
	aload_4 
	invokeinterface interfacemethodref_20 // pc=2 guess=28
Label34:
	aconst_null 
	astore_6 
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_54180   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54180   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54180   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54180   // getName->1:     // getName->2:     // getName->N:     // ofs = 54180 ord = 4 addr = 0
	ifnull Label54
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_54180   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54180   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54180   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54180   // getName->1:     // getName->2:     // getName->N:     // ofs = 54180 ord = 4 addr = 0
	invokevirtual int getSelectedIndex( net.rim.device.api.ui.component.ChoiceField ) // pc=1
	istore_7 
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_54180   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54180   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54180   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54180   // getName->1:     // getName->2:     // getName->N:     // ofs = 54180 ord = 4 addr = 0
	iload_7 
	invokevirtual java.lang.Object getChoice( net.rim.device.api.ui.component.ObjectChoiceField, int ) // pc=2
	checkcast MediaSettingsScreen$FsRootChoice
	invokenonvirtual com.whatsapp.client.MediaSettingsScreen$FsRootChoice.getFsRoot // pc=1
	astore_6 
	aload_6 
	aload_2 
	invokenonvirtual_lib .routine_2676 // pc=1
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label54
	iconst_1 
	istore_3 
Label54:
	iconst_0 
	istore_7 
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_54176   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54176   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54176   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54176   // getName->1:     // getName->2:     // getName->N:     // ofs = 54176 ord = 3 addr = 0
	ifnull Label73
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_54176   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54176   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54176   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54176   // getName->1:     // getName->2:     // getName->N:     // ofs = 54176 ord = 3 addr = 0
	invokevirtual int getSelectedIndex( net.rim.device.api.ui.component.ChoiceField ) // pc=1
	istore 8
	iload 8
	ifne Label65
	iconst_1 
	goto Label66
Label65:
	iconst_0 
Label66:
	istore_7 
	iload_7 
	aload_2 
	invokenonvirtual_lib .routine_1836 // pc=1
	if_icmpeq Label73
	iconst_1 
	istore_3 
Label73:
	iload_3 
	ifeq Label97
	aload_1 
	invokenonvirtual_lib .routine_2951 // pc=1
	invokestatic_lib java.lang.Object expandGroup( java.lang.Object ) // ObjectGroup
	checkcast_lib com.whatsapp.client.//module:WhatsApp.class#9 module:WhatsApp.class#9 module:WhatsApp.class#9
	astore_2 
	aload_2 
	aload_4 
	invokenonvirtual_lib .routine_2616 // pc=2
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_54180   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54180   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54180   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54180   // getName->1:     // getName->2:     // getName->N:     // ofs = 54180 ord = 4 addr = 0
	ifnull Label88
	aload_2 
	aload_6 
	invokenonvirtual_lib .routine_2696 // pc=2
Label88:
	aload_2 
	iload_7 
	invokenonvirtual_lib .routine_1856 // pc=2
	aload_1 
	aload_2 
	invokestatic_lib module:WhatsApp.class#9.routine_3363(  ) // class#9
	lipush -4388438425147467952
	iconst_1 
	invokestatic_lib module:WhatsApp-32.class#2.routine_5692(  ) // class#2
Label97:
	iconst_1 
	ireturn 
	}


private final deleteStorage( com.whatsapp.client.MediaSettingsScreen ); // address: 0
	{
	enter 
	bipush 3
	bipush 2
	sipush 348
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokestatic_lib int ask( int, java.lang.String ) // Dialog
	if_icmpne Label23
	invokestatic_lib module:WhatsApp-24.class#2.routine_4009(  ) // class#2
	invokeinterface interfacemethodref_21 // pc=1 guess=29
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = -1 ord = 1 addr = -1
	invokenonvirtual_lib .routine_4583 // pc=1
	invokestatic_lib module:WhatsApp-24.class#2.routine_4009(  ) // class#2
	iconst_0 
	i2l 
	invokeinterface interfacemethodref_22 // pc=3 guess=30
	iconst_0 
	invokestatic_lib module:WhatsApp-32.class#2.routine_4972(  ) // class#2
	return 
	astore_1 
	aload_1 
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	invokestatic_lib inform( java.lang.String ) // Dialog
Label23:
	return 
	}


private final closeScreen( com.whatsapp.client.MediaSettingsScreen, boolean, boolean ); // address: 0
	{
	enter 
	iload_1 
	ifeq Label7
	aload_0 
	invokespecial com.whatsapp.client.MediaSettingsScreen.routine_8655 // pc=1
	ifne Label30
	return 
Label7:
	aload_0 
	invokevirtual boolean isDirty( net.rim.device.api.ui.Screen ) // pc=1
	ifeq Label30
	iload_2 
	ifne Label30
	iconst_1 
	invokestatic_lib int ask( int ) // Dialog
	istore_3 
	iload_3 
	iconst_1 
	if_icmpne Label22
	aload_0 
	invokespecial com.whatsapp.client.MediaSettingsScreen.routine_8655 // pc=1
	ifne Label30
	return 
Label22:
	iload_3 
	bipush 2
	if_icmpne Label26
	goto Label30
Label26:
	iload_3 
	bipush -1
	if_icmpne Label30
	return 
Label30:
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	astore_3 
	aload_3 
	aload_0 
	invokevirtual popScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final boolean keyChar( com.whatsapp.client.MediaSettingsScreen, char, int, int ); // address: 0
	{
	enter 
	iload_1 
	bipush 27
	if_icmpne Label10
	aload_0 
	iconst_0 
	iconst_0 
	invokespecial com.whatsapp.client.MediaSettingsScreen.closeScreen // pc=3
	iconst_1 
	ireturn 
Label10:
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	invokespecial_lib net.rim.device.api.ui.Screen.keyChar // pc=4
	ireturn 
	}


protected final makeMenu( com.whatsapp.client.MediaSettingsScreen, net.rim.device.api.ui.component.Menu, int ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-24.class#2.routine_4009(  ) // class#2
	invokeinterface interfacemethodref_18 // pc=1 guess=31
	ifeq Label7
	aload_1 
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_54172   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54172   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54172   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54172   // getName->1:     // getName->2:     // getName->N:     // ofs = 54172 ord = 2 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label7:
	aload_1 
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_54164   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54164   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54164   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54164   // getName->1:     // getName->2:     // getName->N:     // ofs = 54164 ord = 0 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	invokevirtual int addSeparator( net.rim.device.api.ui.component.Menu ) // pc=1
	pop 
	aload_1 
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_54168   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54168   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54168   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54168   // getName->1:     // getName->2:     // getName->N:     // ofs = 54168 ord = 1 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	return 
	}

}
