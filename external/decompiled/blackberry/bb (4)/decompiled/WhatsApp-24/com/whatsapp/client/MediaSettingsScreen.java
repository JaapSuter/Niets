// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-24.cod
// Module version  : 2.7.3204
// Class ID        : 3
// ########################################################


package com.whatsapp.client;


abstract final class MediaSettingsScreen extends net.rim.device.api.ui.container.MainScreen

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_53816 ; // ofs = 53816 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_53820 ; // ofs = 53820 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_53824 ; // ofs = 53824 addr = 0)
	private net.rim.device.api.ui.component.ObjectChoiceField /*net.rim.device.api.ui.component.ObjectChoiceField*/  field_53828 ; // ofs = 53828 addr = 0)
	private net.rim.device.api.ui.component.ObjectChoiceField /*net.rim.device.api.ui.component.ObjectChoiceField*/  field_53832 ; // ofs = 53832 addr = 0)
	private net.rim.device.api.ui.component.ObjectChoiceField /*net.rim.device.api.ui.component.ObjectChoiceField*/  field_53836 ; // ofs = 53836 addr = 0)
	private net.rim.device.api.ui.component.LabelField /*net.rim.device.api.ui.component.LabelField*/  field_53840 ; // ofs = 53840 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.MediaSettingsScreen ); // address: 0
	{
	enter 
	aload_0 
	lipush 299067163017216
	invokespecial_lib net.rim.device.api.ui.container.MainScreen.<init> // pc=3
	aload_0 
	invokestatic_lib module:WhatsApp-35.class#0.routine_5461(  ) // class#0
	invokevirtual setTitleBar( net.rim.device.api.ui.Screen, net.rim.device.api.ui.component.TitleBar ) // pc=2
	aload_0 
	invokevirtual net.rim.device.api.ui.Manager getMainManager( net.rim.device.api.ui.container.MainScreen ) // pc=1
	invokestatic_lib module:WhatsApp-7.class#22.routine_4386(  ) // class#22
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	aload_0 
	sipush 887
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	iipush 16777215
	invokestatic_lib module:WhatsApp-35.class#0.routine_5649(  ) // class#0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	iipush 310000
	istore_1 
	sipush 1200
	istore_2 
	aload_0 
	new_lib com.whatsapp.client.MediaSettingsScreen$1//module:WhatsApp-23.class#18 module:WhatsApp-23.class#18 module:WhatsApp-23.class#18
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4672(  ) // class#18
	sipush 347
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial_lib .routine_9349 // pc=6
	putfield com.whatsapp.client.MediaSettingsScreen.field_53824   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_53824   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_53824   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_53824   // getName->1:     // getName->2:     // getName->N:     // ofs = 53824 ord = 2 addr = 0
	aload_0 
	new MediaSettingsScreen$2
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4672(  ) // class#18
	bipush 51
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial com.whatsapp.client.MediaSettingsScreen$2.<init> // pc=6
	putfield com.whatsapp.client.MediaSettingsScreen.field_53816   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_53816   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_53816   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_53816   // getName->1:     // getName->2:     // getName->N:     // ofs = 53816 ord = 0 addr = 0
	aload_0 
	new MediaSettingsScreen$3
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4672(  ) // class#18
	bipush 2
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial com.whatsapp.client.MediaSettingsScreen$3.<init> // pc=6
	putfield com.whatsapp.client.MediaSettingsScreen.field_53820   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_53820   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_53820   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_53820   // getName->1:     // getName->2:     // getName->N:     // ofs = 53820 ord = 1 addr = 0
	invokestatic_lib module:WhatsApp-27.class#8.routine_2921(  ) // class#8
	invokenonvirtual_lib .routine_2301 // pc=1
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
	invokestatic_lib module:WhatsApp-35.class#0.routine_5554(  ) // class#0
	istore 8
	iload 8
	ifne Label84
	getstatic_lib module:WhatsApp-12.class#0.static_47 // class#0
	aload_3 
	invokenonvirtual_lib .routine_2724 // pc=1
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label84
	iconst_1 
	istore 8
Label84:
	iload 8
	ifne Label87
	goto_w Label153
Label87:
	aload_0 
	invokespecial com.whatsapp.client.MediaSettingsScreen.routine_2837 // pc=1
	bipush 2
	newarray_object MediaSettingsScreen$FsRootChoice
	dup 
	iconst_0 
	new MediaSettingsScreen$FsRootChoice
	dup 
	aload_0 
	getstatic_lib module:WhatsApp-12.class#0.static_46 // class#0
	sipush 353
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokespecial com.whatsapp.client.MediaSettingsScreen$FsRootChoice.<init> // pc=4
	aastore 
	dup 
	iconst_1 
	new MediaSettingsScreen$FsRootChoice
	dup 
	aload_0 
	getstatic_lib module:WhatsApp-12.class#0.static_47 // class#0
	sipush 352
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokespecial com.whatsapp.client.MediaSettingsScreen$FsRootChoice.<init> // pc=4
	aastore 
	astore 9
	aload_0 
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	dup 
	bipush 22
	sipush 713
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	aload 9
	iconst_0 
	invokespecial_lib net.rim.device.api.ui.component.ObjectChoiceField.<init> // pc=4
	putfield com.whatsapp.client.MediaSettingsScreen.field_53832   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_53832   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_53832   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_53832   // getName->1:     // getName->2:     // getName->N:     // ofs = 53832 ord = 4 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_53832   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_53832   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_53832   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_53832   // getName->1:     // getName->2:     // getName->N:     // ofs = 53832 ord = 4 addr = 0
	invokespecial com.whatsapp.client.MediaSettingsScreen.routine_2799 // pc=2
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_53832   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_53832   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_53832   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_53832   // getName->1:     // getName->2:     // getName->N:     // ofs = 53832 ord = 4 addr = 0
	new MediaSettingsScreen$FsRootChoice
	dup 
	aload_0 
	aload_3 
	invokenonvirtual_lib .routine_2724 // pc=1
	ldc literal_51:"*Do Not Display*"
	invokespecial com.whatsapp.client.MediaSettingsScreen$FsRootChoice.<init> // pc=4
	invokevirtual setSelectedIndex( net.rim.device.api.ui.component.ChoiceField, java.lang.Object ) // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_53832   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_53832   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_53832   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_53832   // getName->1:     // getName->2:     // getName->N:     // ofs = 53832 ord = 4 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	new_lib net.rim.device.api.ui.component.Menu//net.rim.device.api.ui.component.Menu net.rim.device.api.ui.component.Menu net.rim.device.api.ui.component.Menu
	dup 
	sipush 714
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=2
	astore 10
	aload 10
	aload_6 
	invokevirtual setFont( net.rim.device.api.ui.Field, net.rim.device.api.ui.Font ) // pc=2
	aload_0 
	aload 10
	invokespecial com.whatsapp.client.MediaSettingsScreen.routine_2799 // pc=2
	aload_0 
	aload 10
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
Label153:
	invokestatic com.whatsapp.client.MessageStore getMessageStore(  ) // MessageStoreProvider
	invokeinterface interfacemethodref_8 // pc=1 guess=6
	ifne Label157
	goto_w Label370
Label157:
	aload_0 
	invokespecial com.whatsapp.client.MediaSettingsScreen.routine_2837 // pc=1
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	astore 9
	new MediaSettingsScreen$FsRootChoice
	dup 
	aload_0 
	getstatic_lib module:WhatsApp-12.class#0.static_41 // class#0
	sipush 352
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokespecial com.whatsapp.client.MediaSettingsScreen$FsRootChoice.<init> // pc=4
	astore 10
	new MediaSettingsScreen$FsRootChoice
	dup 
	aload_0 
	getstatic_lib module:WhatsApp-12.class#0.static_42 // class#0
	sipush 353
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokespecial com.whatsapp.client.MediaSettingsScreen$FsRootChoice.<init> // pc=4
	astore 11
	new MediaSettingsScreen$FsRootChoice
	dup 
	aload_0 
	getstatic_lib module:WhatsApp-12.class#0.static_43 // class#0
	sipush 353
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
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
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
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
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokespecial com.whatsapp.client.MediaSettingsScreen$FsRootChoice.<init> // pc=4
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload 14
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	invokestatic_lib module:WhatsApp-27.class#8.routine_2921(  ) // class#8
	invokenonvirtual_lib .routine_2301 // pc=1
	invokenonvirtual_lib .routine_2641 // pc=1
	astore 15
	aload 15
	stringlength 
	ifle Label256
	aload 9
	aload 15
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast MediaSettingsScreen$FsRootChoice
	astore 16
	aload 16
	ifnonnull Label248
	new MediaSettingsScreen$FsRootChoice
	dup 
	aload_0 
	aload 15
	aload 15
	invokespecial com.whatsapp.client.MediaSettingsScreen$FsRootChoice.<init> // pc=4
	astore 16
Label248:
	aload 13
	aload 16
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload 14
	aload 15
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
Label256:
	aload 14
	aload 11
	invokenonvirtual com.whatsapp.client.MediaSettingsScreen$FsRootChoice.getFsRoot // pc=1
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	invokestatic_lib java.util.Enumeration listRoots(  ) // FileSystemRegistry
	astore 16
Label264:
	aload 16
	invokeinterface interfacemethodref_9 // pc=1 guess=7
	ifeq Label299
	aload 16
	invokeinterface interfacemethodref_10 // pc=1 guess=8
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore 17
	aload 14
	aload 17
	invokevirtual boolean containsKey( java.util.Hashtable, java.lang.Object ) // pc=2
	ifeq Label276
	goto Label264
Label276:
	aload 9
	aload 17
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast MediaSettingsScreen$FsRootChoice
	astore 18
	aload 18
	ifnonnull Label290
	new MediaSettingsScreen$FsRootChoice
	dup 
	aload_0 
	aload 17
	aload 17
	invokespecial com.whatsapp.client.MediaSettingsScreen$FsRootChoice.<init> // pc=4
	astore 18
Label290:
	aload 13
	aload 18
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload 14
	aload 17
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	goto Label264
Label299:
	aload 13
	invokevirtual int size( java.util.Vector ) // pc=1
	newarray_object MediaSettingsScreen$FsRootChoice
	astore_7 
	aload 13
	aload_7 
	invokevirtual copyInto( java.util.Vector, java.lang.Object[] ) // pc=2
	aload_0 
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	dup 
	bipush 22
	sipush 335
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	aload_7 
	iconst_0 
	invokespecial_lib net.rim.device.api.ui.component.ObjectChoiceField.<init> // pc=4
	putfield com.whatsapp.client.MediaSettingsScreen.field_53836   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_53836   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_53836   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_53836   // getName->1:     // getName->2:     // getName->N:     // ofs = 53836 ord = 5 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_53836   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_53836   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_53836   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_53836   // getName->1:     // getName->2:     // getName->N:     // ofs = 53836 ord = 5 addr = 0
	invokespecial com.whatsapp.client.MediaSettingsScreen.routine_2799 // pc=2
	aload_3 
	invokenonvirtual_lib .routine_2641 // pc=1
	ifnonnull Label327
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_53836   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_53836   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_53836   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_53836   // getName->1:     // getName->2:     // getName->N:     // ofs = 53836 ord = 5 addr = 0
	iconst_0 
	invokevirtual setSelectedIndex( net.rim.device.api.ui.component.ChoiceField, int ) // pc=2
	goto Label336
Label327:
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_53836   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_53836   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_53836   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_53836   // getName->1:     // getName->2:     // getName->N:     // ofs = 53836 ord = 5 addr = 0
	new MediaSettingsScreen$FsRootChoice
	dup 
	aload_0 
	aload_3 
	invokenonvirtual_lib .routine_2641 // pc=1
	ldc literal_51:"*Do Not Display*"
	invokespecial com.whatsapp.client.MediaSettingsScreen$FsRootChoice.<init> // pc=4
	invokevirtual setSelectedIndex( net.rim.device.api.ui.component.ChoiceField, java.lang.Object ) // pc=2
Label336:
	aload_0 
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_53836   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_53836   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_53836   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_53836   // getName->1:     // getName->2:     // getName->N:     // ofs = 53836 ord = 5 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	invokestatic com.whatsapp.client.MessageStore getMessageStore(  ) // MessageStoreProvider
	invokeinterface interfacemethodref_11 // pc=1 guess=9
	astore 17
	aload 17
	ifnonnull Label351
	aload 13
	invokevirtual int size( java.util.Vector ) // pc=1
	iconst_1 
	if_icmpgt Label351
	sipush 604
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	astore 17
Label351:
	aload 17
	ifnull Label370
	aload_0 
	new_lib net.rim.device.api.ui.component.Menu//net.rim.device.api.ui.component.Menu net.rim.device.api.ui.component.Menu net.rim.device.api.ui.component.Menu
	dup 
	sipush 349
	aload 17
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=2
	putfield com.whatsapp.client.MediaSettingsScreen.field_53840   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_53840   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_53840   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_53840   // getName->1:     // getName->2:     // getName->N:     // ofs = 53840 ord = 6 addr = 0
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_53840   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_53840   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_53840   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_53840   // getName->1:     // getName->2:     // getName->N:     // ofs = 53840 ord = 6 addr = 0
	aload_6 
	invokevirtual setFont( net.rim.device.api.ui.Field, net.rim.device.api.ui.Font ) // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_53840   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_53840   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_53840   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_53840   // getName->1:     // getName->2:     // getName->N:     // ofs = 53840 ord = 6 addr = 0
	invokespecial com.whatsapp.client.MediaSettingsScreen.routine_2799 // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_53840   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_53840   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_53840   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_53840   // getName->1:     // getName->2:     // getName->N:     // ofs = 53840 ord = 6 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
Label370:
	aload_0 
	invokespecial com.whatsapp.client.MediaSettingsScreen.routine_2837 // pc=1
	bipush 2
	newarray_object_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	iconst_0 
	sipush 227
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	aastore 
	dup 
	iconst_1 
	sipush 228
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	aastore 
	astore 9
	aload_0 
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	dup 
	bipush 22
	sipush 850
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	aload 9
	iconst_0 
	invokespecial_lib net.rim.device.api.ui.component.ObjectChoiceField.<init> // pc=4
	putfield com.whatsapp.client.MediaSettingsScreen.field_53828   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_53828   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_53828   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_53828   // getName->1:     // getName->2:     // getName->N:     // ofs = 53828 ord = 3 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_53828   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_53828   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_53828   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_53828   // getName->1:     // getName->2:     // getName->N:     // ofs = 53828 ord = 3 addr = 0
	invokespecial com.whatsapp.client.MediaSettingsScreen.routine_2799 // pc=2
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_53828   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_53828   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_53828   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_53828   // getName->1:     // getName->2:     // getName->N:     // ofs = 53828 ord = 3 addr = 0
	aload_3 
	invokenonvirtual_lib .routine_1884 // pc=1
	ifeq Label405
	iconst_0 
	goto Label406
Label405:
	iconst_1 
Label406:
	invokevirtual setSelectedIndex( net.rim.device.api.ui.component.ChoiceField, int ) // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_53828   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_53828   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_53828   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_53828   // getName->1:     // getName->2:     // getName->N:     // ofs = 53828 ord = 3 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.MediaSettingsScreen.routine_2799( com.whatsapp.client.MediaSettingsScreen, net.rim.device.api.ui.Field ); // address: 0
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


private final com.whatsapp.client.MediaSettingsScreen.routine_2837( com.whatsapp.client.MediaSettingsScreen ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual int getFieldCount( net.rim.device.api.ui.container.MainScreen ) // pc=1
	iconst_1 
	if_icmple Label18
	new_lib com.whatsapp.field.ShadedSeparator//com.whatsapp.field.ShadedSeparator com.whatsapp.field.ShadedSeparator com.whatsapp.field.ShadedSeparator
	dup 
	invokespecial_lib .routine_9534 // pc=1
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


private final boolean com.whatsapp.client.MediaSettingsScreen.routine_2894( com.whatsapp.client.MediaSettingsScreen ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-27.class#8.routine_2921(  ) // class#8
	astore_1 
	aload_1 
	invokenonvirtual_lib .routine_2301 // pc=1
	astore_2 
	iconst_0 
	istore_3 
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	astore_4 
	invokestatic_lib module:WhatsApp-10.class#6.routine_2447(  ) // class#6
	astore_5 
	aload_5 
	invokeinterface interfacemethodref_8 // pc=1 guess=10
	ifeq Label34
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_53836   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_53836   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_53836   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_53836   // getName->1:     // getName->2:     // getName->N:     // ofs = 53836 ord = 5 addr = 0
	invokevirtual int getSelectedIndex( net.rim.device.api.ui.component.ChoiceField ) // pc=1
	istore_6 
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_53836   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_53836   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_53836   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_53836   // getName->1:     // getName->2:     // getName->N:     // ofs = 53836 ord = 5 addr = 0
	iload_6 
	invokevirtual java.lang.Object getChoice( net.rim.device.api.ui.component.ObjectChoiceField, int ) // pc=2
	checkcast MediaSettingsScreen$FsRootChoice
	invokenonvirtual com.whatsapp.client.MediaSettingsScreen$FsRootChoice.getFsRoot // pc=1
	astore_4 
	aload_4 
	aload_2 
	invokenonvirtual_lib .routine_2641 // pc=1
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label34
	iconst_1 
	istore_3 
	aload_5 
	aload_4 
	invokeinterface interfacemethodref_12 // pc=2 guess=11
Label34:
	aconst_null 
	astore_6 
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_53832   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_53832   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_53832   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_53832   // getName->1:     // getName->2:     // getName->N:     // ofs = 53832 ord = 4 addr = 0
	ifnull Label54
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_53832   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_53832   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_53832   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_53832   // getName->1:     // getName->2:     // getName->N:     // ofs = 53832 ord = 4 addr = 0
	invokevirtual int getSelectedIndex( net.rim.device.api.ui.component.ChoiceField ) // pc=1
	istore_7 
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_53832   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_53832   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_53832   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_53832   // getName->1:     // getName->2:     // getName->N:     // ofs = 53832 ord = 4 addr = 0
	iload_7 
	invokevirtual java.lang.Object getChoice( net.rim.device.api.ui.component.ObjectChoiceField, int ) // pc=2
	checkcast MediaSettingsScreen$FsRootChoice
	invokenonvirtual com.whatsapp.client.MediaSettingsScreen$FsRootChoice.getFsRoot // pc=1
	astore_6 
	aload_6 
	aload_2 
	invokenonvirtual_lib .routine_2724 // pc=1
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label54
	iconst_1 
	istore_3 
Label54:
	iconst_0 
	istore_7 
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_53828   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_53828   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_53828   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_53828   // getName->1:     // getName->2:     // getName->N:     // ofs = 53828 ord = 3 addr = 0
	ifnull Label73
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_53828   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_53828   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_53828   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_53828   // getName->1:     // getName->2:     // getName->N:     // ofs = 53828 ord = 3 addr = 0
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
	invokenonvirtual_lib .routine_1884 // pc=1
	if_icmpeq Label73
	iconst_1 
	istore_3 
Label73:
	iload_3 
	ifeq Label97
	aload_1 
	invokenonvirtual_lib .routine_2301 // pc=1
	invokestatic_lib java.lang.Object expandGroup( java.lang.Object ) // ObjectGroup
	checkcast_lib com.whatsapp.client.//module:WhatsApp.class#10 module:WhatsApp.class#10 module:WhatsApp.class#10
	astore_2 
	aload_2 
	aload_4 
	invokenonvirtual_lib .routine_2664 // pc=2
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_53832   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_53832   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_53832   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_53832   // getName->1:     // getName->2:     // getName->N:     // ofs = 53832 ord = 4 addr = 0
	ifnull Label88
	aload_2 
	aload_6 
	invokenonvirtual_lib .routine_2744 // pc=2
Label88:
	aload_2 
	iload_7 
	invokenonvirtual_lib .routine_1904 // pc=2
	aload_1 
	aload_2 
	invokestatic_lib module:WhatsApp.class#10.routine_3411(  ) // class#10
	lipush -4388438425147467952
	iconst_1 
	invokestatic_lib module:WhatsApp-35.class#0.routine_4497(  ) // class#0
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
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokestatic_lib int ask( int, java.lang.String ) // Dialog
	if_icmpne Label23
	invokestatic com.whatsapp.client.MessageStore getMessageStore(  ) // MessageStoreProvider
	invokeinterface interfacemethodref_13 // pc=1 guess=12
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_346 // pc=1
	invokestatic com.whatsapp.client.MessageStore getMessageStore(  ) // MessageStoreProvider
	iconst_0 
	i2l 
	invokeinterface interfacemethodref_14 // pc=3 guess=13
	iconst_0 
	invokestatic_lib module:WhatsApp-35.class#0.routine_3734(  ) // class#0
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
	invokespecial com.whatsapp.client.MediaSettingsScreen.routine_2894 // pc=1
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
	invokespecial com.whatsapp.client.MediaSettingsScreen.routine_2894 // pc=1
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
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
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
	invokestatic com.whatsapp.client.MessageStore getMessageStore(  ) // MessageStoreProvider
	invokeinterface interfacemethodref_8 // pc=1 guess=14
	ifeq Label7
	aload_1 
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_53824   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_53824   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_53824   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_53824   // getName->1:     // getName->2:     // getName->N:     // ofs = 53824 ord = 2 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label7:
	aload_1 
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_53816   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_53816   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_53816   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_53816   // getName->1:     // getName->2:     // getName->N:     // ofs = 53816 ord = 0 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	invokevirtual int addSeparator( net.rim.device.api.ui.component.Menu ) // pc=1
	pop 
	aload_1 
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_53820   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_53820   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_53820   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_53820   // getName->1:     // getName->2:     // getName->N:     // ofs = 53820 ord = 1 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	return 
	}

}
