// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-21.cod
// Module version  : 2.8.1914
// Class ID        : 1
// ########################################################


package com.whatsapp.client;


abstract public final class ContactSupportScreen extends com.whatsapp.field.

{

	// @@@@@@@@@@@@@ Fields 
	private final net.rim.device.api.ui.component.EditField /*net.rim.device.api.ui.component.EditField*/  field_53902 ; // ofs = 53902 addr = 0)
	private final net.rim.device.api.ui.component.ButtonField /*net.rim.device.api.ui.component.ButtonField*/  field_53906 ; // ofs = 53906 addr = 0)
	private long /*long*/  _curTime ; // ofs = 53910 addr = 0)
	private String /*java.lang.String*/  _debugInfo ; // ofs = 53914 addr = 0)
	private String /*java.lang.String*/  _debugLog ; // ofs = 53918 addr = 0)
	private boolean /*boolean*/  field_53922 ; // ofs = 53922 addr = 0)
	private net.rim.blackberry.api.mail.ServiceConfiguration /*net.rim.blackberry.api.mail.ServiceConfiguration*/  field_53926 ; // ofs = 53926 addr = 0)
	private net.rim.device.api.ui.component.ObjectChoiceField /*net.rim.device.api.ui.component.ObjectChoiceField*/  field_53930 ; // ofs = 53930 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_53934 ; // ofs = 53934 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

static public final contactSupport( java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_0 
	aconst_null 
	invokestatic com.whatsapp.client.ContactSupportScreen.routine_2794( java.lang.String, boolean, java.lang.String ) // ContactSupportScreen
	return 
	}


static public final contactSupportFromRegistration( java.lang.String, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_1 
	aload_1 
	invokestatic com.whatsapp.client.ContactSupportScreen.routine_2794( java.lang.String, boolean, java.lang.String ) // ContactSupportScreen
	return 
	}


static private final com.whatsapp.client.ContactSupportScreen.routine_2794( java.lang.String, boolean, java.lang.String ); // address: 0
	{
	enter 
	sipush 838
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokestatic_lib module:WhatsApp-60.class#2.routine_3617(  ) // class#2
	astore_3 
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	aload_3 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	new_lib com.whatsapp.client.ContactSupportScreen$1//com.whatsapp.client.ContactSupportScreen$1 com.whatsapp.client.ContactSupportScreen$1 com.whatsapp.client.ContactSupportScreen$1
	dup 
	iload_1 
	aload_3 
	aload_2 
	aload_0 
	invokespecial_lib .routine_4433 // pc=5
	invokevirtual start( java.lang.Thread ) // pc=1
	return 
	}


static private final java.lang.String buildStatusMessage( boolean, module:WhatsApp-79.class#43 ); // address: 0
	{
	enter 
	aload_1 
	ifnull Label8
	aload_1 
	invokenonvirtual_lib .routine_31880 // pc=1
	ifeq Label8
	aconst_null 
	areturn 
Label8:
	new_lib net.rim.device.api.ui.MenuItem//net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	astore_2 
	aload_2 
	iload_0 
	ifeq Label17
	ldc literal_90:"reg-"
	goto Label18
Label17:
	ldc literal_91:"chat-"
Label18:
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_1 
	ifnonnull Label44
	invokestatic_lib module:WhatsApp-58.class#3.routine_7164(  ) // class#3
	ifne Label26
	iconst_1 
	goto Label27
Label26:
	iconst_0 
Label27:
	istore_3 
	goto Label32
	astore_4 
	iconst_0 
	istore_3 
Label32:
	iload_3 
	ifeq Label39
	aload_2 
	ldc literal_92:"no-connectivity"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	goto Label61
Label39:
	aload_2 
	ldc literal_93:"unknown"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	goto Label61
Label44:
	aload_1 
	invokenonvirtual_lib .routine_31869 // pc=1
	tableswitch  :
		
		
		
		

Label47:
	aload_2 
	ldc literal_94:"unavailable"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	goto Label61
Label52:
	aload_2 
	ldc literal_95:"partial"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	goto Label61
Label57:
	aload_2 
	ldc literal_93:"unknown"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label61:
	aload_2 
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}


private <init>( com.whatsapp.client.ContactSupportScreen ); // address: 0
	{
	enter 
	aload_0 
	lipush 299067162755072
	invokespecial_lib .routine_5321 // pc=3
	aload_0 
	invokestatic_lib module:WhatsApp-60.class#2.routine_1393(  ) // class#2
	aload_0 
	invokestatic_lib module:WhatsApp-7.class#4.routine_1988(  ) // class#4
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	bipush 95
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	iipush 16777215
	invokestatic_lib module:WhatsApp-79.class#39.routine_28111(  ) // class#39
	astore_1 
	aload_1 
	iconst_0 
	iconst_0 
	iconst_0 
	iconst_0 
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	invokestatic_lib module:WhatsApp-60.class#2.routine_833(  ) // class#2
	sipush 160
	if_icmpne Label25
	bipush 6
	goto Label26
Label25:
	bipush 10
Label26:
	istore_2 
	new_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	dup 
	sipush 1027
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	lipush 4294967296
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=4
	astore_3 
	aload_3 
	iload_2 
	bipush 16
	iload_2 
	bipush 16
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	new_lib com.whatsapp.client.//module:WhatsApp-19.class#3 module:WhatsApp-19.class#3 module:WhatsApp-19.class#3
	dup 
	aload_0 
	lipush 1153484454560268288
	invokespecial_lib .routine_3769 // pc=4
	astore_4 
	aload_4 
	iipush 16777215
	invokestatic_lib net.rim.device.api.ui.decor.Background createSolidBackground( int ) // BackgroundFactory
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	aload_4 
	getstatic_lib module:WhatsApp-7.class#4.static_21 // class#4
	invokevirtual setBorder( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Border ) // pc=2
	aload_4 
	iload_2 
	bipush 16
	iload_2 
	bipush 16
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	new_lib net.rim.device.api.system.PersistentObject//net.rim.device.api.system.PersistentObject net.rim.device.api.system.PersistentObject net.rim.device.api.system.PersistentObject
	dup 
	lipush 1152921504606846976
	invokespecial_lib net.rim.device.api.ui.component.EditField.<init> // pc=3
	putfield com.whatsapp.client.ContactSupportScreen.field_53902   // get_name_1:  com.whatsapp.client.ContactSupportScreen.field_53902   // get_name_2:  com.whatsapp.client.ContactSupportScreen.field_53902   // get_Name:    com.whatsapp.client.ContactSupportScreen.field_53902   // getName->1:     // getName->2:     // getName->N:     // ofs = 53902 ord = 0 addr = 0
	aload_4 
	aload_0_getfield com.whatsapp.client.ContactSupportScreen.field_53902   // get_name_1:  com.whatsapp.client.ContactSupportScreen.field_53902   // get_name_2:  com.whatsapp.client.ContactSupportScreen.field_53902   // get_Name:    com.whatsapp.client.ContactSupportScreen.field_53902   // getName->1:     // getName->2:     // getName->N:     // ofs = 53902 ord = 0 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	new_lib com.whatsapp.client.ContactSupportScreen$3//module:WhatsApp-18.class#7 module:WhatsApp-18.class#7 module:WhatsApp-18.class#7
	dup 
	aload_0 
	sipush 1040
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	lipush 4294967296
	invokespecial_lib .routine_4523 // pc=5
	astore_5 
	invokestatic_lib net.rim.device.api.ui.Font getDefault(  ) // Font
	astore_6 
	aload_5 
	aload_6 
	iconst_0 
	aload_6 
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	bipush 4
	isub 
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int, int ) // pc=3
	invokevirtual setFont( net.rim.device.api.ui.Field, net.rim.device.api.ui.Font ) // pc=2
	aload_5 
	new_lib com.whatsapp.client.//module:WhatsApp-20.class#2 module:WhatsApp-20.class#2 module:WhatsApp-20.class#2
	dup 
	aload_0 
	invokespecial_lib .routine_1433 // pc=2
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_5 
	iload_2 
	bipush 16
	iload_2 
	bipush 16
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	new_lib java.util.Enumeration//java.util.Enumeration java.util.Enumeration java.util.Enumeration
	dup 
	sipush 1028
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	lipush 1152921517491814464
	invokespecial_lib net.rim.device.api.ui.component.ButtonField.<init> // pc=4
	astore_7 
	aload_7 
	iload_2 
	bipush 16
	iload_2 
	bipush 16
	invokevirtual setMargin( net.rim.device.api.ui.component.ButtonField, int, int, int, int ) // pc=5
	aload_7 
	new_lib com.whatsapp.client.ContactSupportScreen$5//module:WhatsApp-20.class#3 module:WhatsApp-20.class#3 module:WhatsApp-20.class#3
	dup 
	aload_0 
	invokespecial_lib .routine_1475 // pc=2
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0 
	new_lib java.util.Enumeration//java.util.Enumeration java.util.Enumeration java.util.Enumeration
	dup 
	bipush 95
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	lipush 1152921517491814464
	invokespecial_lib net.rim.device.api.ui.component.ButtonField.<init> // pc=4
	putfield com.whatsapp.client.ContactSupportScreen.field_53906   // get_name_1:  com.whatsapp.client.ContactSupportScreen.field_53906   // get_name_2:  com.whatsapp.client.ContactSupportScreen.field_53906   // get_Name:    com.whatsapp.client.ContactSupportScreen.field_53906   // getName->1:     // getName->2:     // getName->N:     // ofs = 53906 ord = 1 addr = 0
	aload_0_getfield com.whatsapp.client.ContactSupportScreen.field_53906   // get_name_1:  com.whatsapp.client.ContactSupportScreen.field_53906   // get_name_2:  com.whatsapp.client.ContactSupportScreen.field_53906   // get_Name:    com.whatsapp.client.ContactSupportScreen.field_53906   // getName->1:     // getName->2:     // getName->N:     // ofs = 53906 ord = 1 addr = 0
	iload_2 
	bipush 16
	iload_2 
	bipush 16
	invokevirtual setMargin( net.rim.device.api.ui.component.ButtonField, int, int, int, int ) // pc=5
	aload_0_getfield com.whatsapp.client.ContactSupportScreen.field_53906   // get_name_1:  com.whatsapp.client.ContactSupportScreen.field_53906   // get_name_2:  com.whatsapp.client.ContactSupportScreen.field_53906   // get_Name:    com.whatsapp.client.ContactSupportScreen.field_53906   // getName->1:     // getName->2:     // getName->N:     // ofs = 53906 ord = 1 addr = 0
	new_lib com.whatsapp.client.ContactSupportScreen$6//module:WhatsApp-20.class#4 module:WhatsApp-20.class#4 module:WhatsApp-20.class#4
	dup 
	aload_0 
	invokespecial_lib .routine_1514 // pc=2
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0 
	aload_1 
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	aload_3 
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	aload_4 
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	aload_5 
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	invokestatic_lib module:WhatsApp-79.class#39.routine_22475(  ) // class#39
	astore 8
	invokestatic_lib boolean isSimulator(  ) // DeviceInfo
	istore 9
	aload 8
	invokevirtual int size( java.util.Vector ) // pc=1
	iconst_1 
	if_icmpgt Label165
	iload 9
	ifne Label161
	goto_w Label232
Label161:
	aload 8
	invokevirtual int size( java.util.Vector ) // pc=1
	ifgt Label165
	goto_w Label232
Label165:
	invokestatic_lib net.rim.blackberry.api.mail.Session getDefaultInstance(  ) // Session
	invokevirtual net.rim.blackberry.api.mail.ServiceConfiguration getServiceConfiguration( net.rim.blackberry.api.mail.Session ) // pc=1
	astore 10
	aload 8
	invokevirtual int size( java.util.Vector ) // pc=1
	newarray_object_lib Object//java.lang.Object java.lang.Object java.lang.Object
	astore 11
	bipush -1
	istore 12
	iconst_0 
	istore 13
Label176:
	iload 13
	aload 11
	arraylength 
	if_icmpge Label200
	aload 8
	iload 13
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib net.rim.blackberry.api.mail.ServiceConfiguration//net.rim.blackberry.api.mail.ServiceConfiguration net.rim.blackberry.api.mail.ServiceConfiguration net.rim.blackberry.api.mail.ServiceConfiguration
	astore 14
	aload 11
	iload 13
	new ContactSupportScreen$ServiceChoice
	dup 
	aload 14
	invokespecial com.whatsapp.client.ContactSupportScreen$ServiceChoice.<init> // pc=2
	aastore 
	aload 14
	aload 10
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label198
	iload 13
	istore 12
Label198:
	iinc 13 1
	goto Label176
Label200:
	aload_0 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	sipush 1039
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokestatic_lib module:WhatsApp-79.class#39.routine_30049(  ) // class#39
	invokenonvirtual_lib java.lang.String.trim // pc=1
	aload 11
	iconst_0 
	lipush 4294967296
	invokespecial_lib net.rim.device.api.ui.component.ObjectChoiceField.<init> // pc=6
	putfield com.whatsapp.client.ContactSupportScreen.field_53930   // get_name_1:  com.whatsapp.client.ContactSupportScreen.field_53930   // get_name_2:  com.whatsapp.client.ContactSupportScreen.field_53930   // get_Name:    com.whatsapp.client.ContactSupportScreen.field_53930   // getName->1:     // getName->2:     // getName->N:     // ofs = 53930 ord = 7 addr = 0
	iload 12
	bipush -1
	if_icmpeq Label218
	aload_0_getfield com.whatsapp.client.ContactSupportScreen.field_53930   // get_name_1:  com.whatsapp.client.ContactSupportScreen.field_53930   // get_name_2:  com.whatsapp.client.ContactSupportScreen.field_53930   // get_Name:    com.whatsapp.client.ContactSupportScreen.field_53930   // getName->1:     // getName->2:     // getName->N:     // ofs = 53930 ord = 7 addr = 0
	iload 12
	invokevirtual setSelectedIndex( net.rim.device.api.ui.component.ChoiceField, int ) // pc=2
Label218:
	aload_0_getfield com.whatsapp.client.ContactSupportScreen.field_53930   // get_name_1:  com.whatsapp.client.ContactSupportScreen.field_53930   // get_name_2:  com.whatsapp.client.ContactSupportScreen.field_53930   // get_Name:    com.whatsapp.client.ContactSupportScreen.field_53930   // getName->1:     // getName->2:     // getName->N:     // ofs = 53930 ord = 7 addr = 0
	aload_5 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	invokevirtual setFont( net.rim.device.api.ui.Field, net.rim.device.api.ui.Font ) // pc=2
	aload_0_getfield com.whatsapp.client.ContactSupportScreen.field_53930   // get_name_1:  com.whatsapp.client.ContactSupportScreen.field_53930   // get_name_2:  com.whatsapp.client.ContactSupportScreen.field_53930   // get_Name:    com.whatsapp.client.ContactSupportScreen.field_53930   // getName->1:     // getName->2:     // getName->N:     // ofs = 53930 ord = 7 addr = 0
	iload_2 
	bipush 16
	iload_2 
	bipush 16
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	aload_0_getfield com.whatsapp.client.ContactSupportScreen.field_53930   // get_name_1:  com.whatsapp.client.ContactSupportScreen.field_53930   // get_name_2:  com.whatsapp.client.ContactSupportScreen.field_53930   // get_Name:    com.whatsapp.client.ContactSupportScreen.field_53930   // getName->1:     // getName->2:     // getName->N:     // ofs = 53930 ord = 7 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	goto Label261
Label232:
	aload 8
	invokevirtual int size( java.util.Vector ) // pc=1
	iconst_1 
	if_icmpne Label243
	aload_0 
	aload 8
	iconst_0 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib net.rim.blackberry.api.mail.ServiceConfiguration//net.rim.blackberry.api.mail.ServiceConfiguration net.rim.blackberry.api.mail.ServiceConfiguration net.rim.blackberry.api.mail.ServiceConfiguration
	putfield com.whatsapp.client.ContactSupportScreen.field_53926   // get_name_1:  com.whatsapp.client.ContactSupportScreen.field_53926   // get_name_2:  com.whatsapp.client.ContactSupportScreen.field_53926   // get_Name:    com.whatsapp.client.ContactSupportScreen.field_53926   // getName->1:     // getName->2:     // getName->N:     // ofs = 53926 ord = 6 addr = 0
	goto Label261
Label243:
	aload_0 
	invokestatic_lib net.rim.blackberry.api.mail.Session getDefaultInstance(  ) // Session
	invokevirtual net.rim.blackberry.api.mail.ServiceConfiguration getServiceConfiguration( net.rim.blackberry.api.mail.Session ) // pc=1
	putfield com.whatsapp.client.ContactSupportScreen.field_53926   // get_name_1:  com.whatsapp.client.ContactSupportScreen.field_53926   // get_name_2:  com.whatsapp.client.ContactSupportScreen.field_53926   // get_Name:    com.whatsapp.client.ContactSupportScreen.field_53926   // getName->1:     // getName->2:     // getName->N:     // ofs = 53926 ord = 6 addr = 0
	goto Label261
	astore 8
	new_lib net.rim.device.api.ui.MenuItem//net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem
	dup 
	ldc literal_96:"Error accessing service configurations: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 8
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_0 
	aconst_null 
	putfield com.whatsapp.client.ContactSupportScreen.field_53926   // get_name_1:  com.whatsapp.client.ContactSupportScreen.field_53926   // get_name_2:  com.whatsapp.client.ContactSupportScreen.field_53926   // get_Name:    com.whatsapp.client.ContactSupportScreen.field_53926   // getName->1:     // getName->2:     // getName->N:     // ofs = 53926 ord = 6 addr = 0
Label261:
	new_lib com.whatsapp.field.VerticalButtonFieldSet//com.whatsapp.field.VerticalButtonFieldSet com.whatsapp.field.VerticalButtonFieldSet com.whatsapp.field.VerticalButtonFieldSet
	dup 
	lipush 12884901888
	invokespecial_lib .routine_4823 // pc=3
	astore 8
	aload 8
	aload_7 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload 8
	aload_0_getfield com.whatsapp.client.ContactSupportScreen.field_53906   // get_name_1:  com.whatsapp.client.ContactSupportScreen.field_53906   // get_name_2:  com.whatsapp.client.ContactSupportScreen.field_53906   // get_Name:    com.whatsapp.client.ContactSupportScreen.field_53906   // getName->1:     // getName->2:     // getName->N:     // ofs = 53906 ord = 1 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	aload 8
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib com.whatsapp.client.ContactSupportScreen$7//module:WhatsApp-20.class#5 module:WhatsApp-20.class#5 module:WhatsApp-20.class#5
	dup 
	aload_0 
	sipush 1041
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	iipush 310000
	sipush 1200
	invokespecial_lib .routine_1558 // pc=5
	putfield com.whatsapp.client.ContactSupportScreen.field_53934   // get_name_1:  com.whatsapp.client.ContactSupportScreen.field_53934   // get_name_2:  com.whatsapp.client.ContactSupportScreen.field_53934   // get_Name:    com.whatsapp.client.ContactSupportScreen.field_53934   // getName->1:     // getName->2:     // getName->N:     // ofs = 53934 ord = 8 addr = 0
	return 
	}


static private final java.lang.String buildDebugData( java.lang.String, java.util.Hashtable ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-47.class#11.routine_4359(  ) // class#11
	astore_2 
	aload_2 
	invokevirtual net.rim.device.api.i18n.ResourceBundleFamily getFamily( net.rim.device.api.i18n.ResourceBundle ) // pc=1
	iipush 1701729619
	invokestatic_lib net.rim.device.api.i18n.Locale get( int ) // Locale
	invokevirtual net.rim.device.api.i18n.ResourceBundle getBundle( net.rim.device.api.i18n.ResourceBundleFamily, net.rim.device.api.i18n.Locale ) // pc=2
	astore_3 
	new_lib net.rim.device.api.ui.MenuItem//net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	astore_4 
	aload_4 
	ldc literal_97:"WhatsApp Messenger (ver "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_4 
	invokestatic_lib module:WhatsApp-79.class#39.routine_23917(  ) // class#39
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_4 
	ldc literal_98:")"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_4 
	bipush 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	aload_4 
	ldc literal_99:"Installation"
	invokestatic_lib module:WhatsApp-58.class#0.routine_523(  ) // class#0
	invokenonvirtual_lib .routine_187 // pc=1
	ifeq Label36
	ldc literal_100:"AppWorld"
	goto Label37
Label36:
	ldc literal_101:"Direct"
Label37:
	invokestatic_lib module:WhatsApp-79.class#39.routine_30066(  ) // class#39
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_4 
	bipush 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	invokestatic_lib module:WhatsApp-44.class#7.routine_3329(  ) // class#7
	astore_5 
	aload_5 
	invokenonvirtual_lib .routine_2043 // pc=1
	astore_6 
	aload_4 
	ldc literal_102:"Phone Number"
	new_lib net.rim.device.api.ui.MenuItem//net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	bipush 43
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	aload_6 
	invokenonvirtual_lib .routine_4431 // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_30066(  ) // class#39
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_4 
	bipush 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	invokestatic_lib module:WhatsApp-13.class#0.routine_833(  ) // class#0
	astore_7 
	aload_7 
	getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	ifne Label77
	aload_3 
	sipush 304
	invokevirtual java.lang.String getString( net.rim.device.api.i18n.ResourceBundle, int ) // pc=2
	astore 8
	goto Label90
Label77:
	aload_7 
	getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	iconst_1 
	if_icmpne Label86
	aload_3 
	sipush 303
	invokevirtual java.lang.String getString( net.rim.device.api.i18n.ResourceBundle, int ) // pc=2
	astore 8
	goto Label90
Label86:
	aload_3 
	sipush 834
	invokevirtual java.lang.String getString( net.rim.device.api.i18n.ResourceBundle, int ) // pc=2
	astore 8
Label90:
	aload_4 
	ldc literal_103:"Account Status"
	aload 8
	invokestatic_lib module:WhatsApp-79.class#39.routine_30066(  ) // class#39
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_4 
	bipush 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	aload_4 
	ldc literal_104:"from"
	aload_0 
	invokestatic_lib module:WhatsApp-79.class#39.routine_30066(  ) // class#39
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_4 
	bipush 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	invokestatic_lib net.rim.device.api.i18n.Locale getDefaultForSystem(  ) // Locale
	astore 9
	aload_4 
	ldc literal_105:"lg"
	aload 9
	invokevirtual java.lang.String getLanguage( net.rim.device.api.i18n.Locale ) // pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_30066(  ) // class#39
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_4 
	bipush 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	aload 9
	invokevirtual java.lang.String getCountry( net.rim.device.api.i18n.Locale ) // pc=1
	astore 10
	aload_4 
	ldc literal_106:"lc"
	aload 10
	ifnonnull Label132
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	goto Label133
Label132:
	aload 10
Label133:
	invokestatic_lib module:WhatsApp-79.class#39.routine_30066(  ) // class#39
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_4 
	bipush 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	aload_7 
	lgetfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	iconst_0 
	i2l 
	lcmp 
	ifle Label152
	getstatic_lib module:WhatsApp.class#0.static_2 // class#0
	aload_7 
	lgetfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	invokevirtual java.lang.String formatLocal( net.rim.device.api.i18n.DateFormat, long ) // pc=3
	astore 11
	goto Label156
Label152:
	aload_3 
	sipush 834
	invokevirtual java.lang.String getString( net.rim.device.api.i18n.ResourceBundle, int ) // pc=2
	astore 11
Label156:
	aload_4 
	ldc literal_107:"Expiration"
	aload 11
	invokestatic_lib module:WhatsApp-79.class#39.routine_30066(  ) // class#39
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_4 
	bipush 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	aload_4 
	ldc literal_108:"BlackBerry Version"
	invokestatic_lib java.lang.String getSoftwareVersion(  ) // DeviceInfo
	invokestatic_lib module:WhatsApp-79.class#39.routine_30066(  ) // class#39
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_4 
	bipush 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	aload_4 
	ldc literal_109:"Build Target"
	invokestatic_lib module:WhatsApp-79.class#39.routine_22096(  ) // class#39
	invokestatic_lib module:WhatsApp-79.class#39.routine_30066(  ) // class#39
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_4 
	bipush 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	aload_6 
	invokenonvirtual_lib .routine_4839 // pc=1
	ifne Label194
	aload_3 
	sipush 228
	invokevirtual java.lang.String getString( net.rim.device.api.i18n.ResourceBundle, int ) // pc=2
	astore 12
	goto Label210
Label194:
	aload_7 
	getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	ifnull Label206
	aload_7 
	getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	getfield running   // get_name_1:  running   // get_name_2:  running   // get_Name:    running   // getName->1:  running   // getName->2:  running   // getName->N:  running   // ofs = -1 ord = 0 addr = -1
	ifeq Label206
	aload_3 
	bipush 32
	invokevirtual java.lang.String getString( net.rim.device.api.i18n.ResourceBundle, int ) // pc=2
	astore 12
	goto Label210
Label206:
	aload_3 
	sipush 300
	invokevirtual java.lang.String getString( net.rim.device.api.i18n.ResourceBundle, int ) // pc=2
	astore 12
Label210:
	aload_4 
	ldc literal_110:"BIS Push"
	aload 12
	invokestatic_lib module:WhatsApp-79.class#39.routine_30066(  ) // class#39
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_4 
	bipush 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	aload_4 
	ldc literal_111:"Pin"
	invokestatic_lib int getDeviceId(  ) // DeviceInfo
	invokestatic_lib java.lang.String toHexString( int ) // Integer
	invokestatic_lib module:WhatsApp-79.class#39.routine_30066(  ) // class#39
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_4 
	bipush 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	invokestatic_lib module:WhatsApp-41.class#2.routine_3978(  ) // class#2
	invokeinterface interfacemethodref_4 // pc=1 guess=4
	astore 13
	aload 13
	ifnull Label246
	aload_4 
	ldc literal_112:"Database error"
	aload 13
	invokestatic_lib module:WhatsApp-79.class#39.routine_30066(  ) // class#39
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_4 
	bipush 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
Label246:
	aload_4 
	ldc literal_113:"Model"
	invokestatic_lib java.lang.String getDeviceName(  ) // DeviceInfo
	invokestatic_lib module:WhatsApp-79.class#39.routine_30066(  ) // class#39
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_4 
	bipush 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	aload_4 
	ldc literal_114:"Carrier"
	invokestatic_lib java.lang.String getCurrentNetworkName(  ) // RadioInfo
	invokestatic_lib module:WhatsApp-79.class#39.routine_30066(  ) // class#39
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_4 
	bipush 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	aload_4 
	invokestatic_lib module:WhatsApp-58.class#3.routine_7395(  ) // class#3
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_4 
	bipush 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	aload_1 
	ifnull Label314
	aload_1 
	invokevirtual java.util.Enumeration keys( java.util.Hashtable ) // pc=1
	astore 14
Label279:
	aload 14
	invokeinterface interfacemethodref_2 // pc=1 guess=5
	ifeq Label314
	aload 14
	invokeinterface interfacemethodref_3 // pc=1 guess=6
	astore 15
	aload_1 
	aload 15
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	astore 16
	aload 15
	invokevirtual_short .toString // idx=2 pc=1
	astore 17
	aload 16
	ifnonnull Label296
	aconst_null 
	goto Label298
Label296:
	aload 16
	invokevirtual_short .toString // idx=2 pc=1
Label298:
	astore 18
	aload 17
	ifnull Label279
	aload 18
	ifnull Label279
	aload_4 
	aload 17
	aload 18
	invokestatic_lib module:WhatsApp-79.class#39.routine_30066(  ) // class#39
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_4 
	bipush 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	goto Label279
Label314:
	aload_4 
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}


<init>( com.whatsapp.client.ContactSupportScreen, com.whatsapp.client.ContactSupportScreen$1 ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial com.whatsapp.client.ContactSupportScreen.<init> // pc=1
	return 
	}


static final access$1100( com.whatsapp.client.ContactSupportScreen ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual updateLayout( net.rim.device.api.ui.Field ) // pc=1
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final copySupportInfo( com.whatsapp.client.ContactSupportScreen ); // address: 0
	{
	enter 
	aload_0_getfield _debugInfo   // get_name_1:  _debugInfo   // get_name_2:  _debugInfo   // get_Name:    _debugInfo   // getName->1:  _debugInfo   // getName->2:  _debugInfo   // getName->N:  _debugInfo   // ofs = 53914 ord = 3 addr = 0
	ifnull Label7
	invokestatic_lib net.rim.device.api.system.Clipboard getClipboard(  ) // Clipboard
	aload_0_getfield _debugInfo   // get_name_1:  _debugInfo   // get_name_2:  _debugInfo   // get_Name:    _debugInfo   // getName->1:  _debugInfo   // getName->2:  _debugInfo   // getName->N:  _debugInfo   // ofs = 53914 ord = 3 addr = 0
	invokevirtual java.lang.Object put( net.rim.device.api.system.Clipboard, java.lang.Object ) // pc=2
	pop 
Label7:
	aload_0_getfield _debugLog   // get_name_1:  _debugLog   // get_name_2:  _debugLog   // get_Name:    _debugLog   // getName->1:  _debugLog   // getName->2:  _debugLog   // getName->N:  _debugLog   // ofs = 53918 ord = 4 addr = 0
	ifnull Label11
	aload_0 
	invokespecial com.whatsapp.client.ContactSupportScreen.routine_2160 // pc=1
Label11:
	return 
	}


private final showDebugInfoPopup( com.whatsapp.client.ContactSupportScreen ); // address: 0
	{
	enter 
	new_lib net.rim.device.api.ui.FieldChangeListener//net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener
	dup 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	lipush 562949953421312
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.<init> // pc=3
	iipush 131072
	i2l 
	invokespecial_lib net.rim.device.api.ui.container.PopupScreen.<init> // pc=4
	astore_1 
	aload_1 
	iipush 16777215
	invokestatic_lib net.rim.device.api.ui.decor.Background createSolidBackground( int ) // BackgroundFactory
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	invokestatic_lib net.rim.device.api.ui.Font getDefault(  ) // Font
	astore_2 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	lipush 299067162755072
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.<init> // pc=3
	astore_3 
	new ContactSupportScreen$ColoredRichTextField
	dup 
	aload_0_getfield _debugInfo   // get_name_1:  _debugInfo   // get_name_2:  _debugInfo   // get_Name:    _debugInfo   // getName->1:  _debugInfo   // getName->2:  _debugInfo   // getName->N:  _debugInfo   // ofs = 53914 ord = 3 addr = 0
	iconst_0 
	lipush 18014398509481984
	invokespecial com.whatsapp.client.ContactSupportScreen$ColoredRichTextField.<init> // pc=5
	astore_4 
	aload_4 
	aload_2 
	iconst_0 
	aload_2 
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	bipush 4
	isub 
	bipush 8
	invokestatic_lib int max( int, int ) // Math
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int, int ) // pc=3
	invokevirtual setFont( net.rim.device.api.ui.component.RichTextField, net.rim.device.api.ui.Font ) // pc=2
	new ContactSupportScreen$ColoredRichTextField
	dup 
	aload_0_getfield _debugLog   // get_name_1:  _debugLog   // get_name_2:  _debugLog   // get_Name:    _debugLog   // getName->1:  _debugLog   // getName->2:  _debugLog   // getName->N:  _debugLog   // ofs = 53918 ord = 4 addr = 0
	sipush 25600
	lipush 18014398509481984
	invokespecial com.whatsapp.client.ContactSupportScreen$ColoredRichTextField.<init> // pc=5
	astore_5 
	aload_5 
	aload_2 
	iconst_0 
	aload_2 
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	bipush 6
	isub 
	bipush 8
	invokestatic_lib int max( int, int ) // Math
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int, int ) // pc=3
	invokevirtual setFont( net.rim.device.api.ui.component.RichTextField, net.rim.device.api.ui.Font ) // pc=2
	aload_3 
	aload_4 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_3 
	new_lib Long//java.lang.Long java.lang.Long java.lang.Long
	dup 
	invokespecial_lib net.rim.device.api.ui.component.SeparatorField.<init> // pc=1
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_3 
	aload_5 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_1 
	aload_3 
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	aload_1 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}


private final sendSupportMessage( com.whatsapp.client.ContactSupportScreen ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.ContactSupportScreen.field_53902   // get_name_1:  com.whatsapp.client.ContactSupportScreen.field_53902   // get_name_2:  com.whatsapp.client.ContactSupportScreen.field_53902   // get_Name:    com.whatsapp.client.ContactSupportScreen.field_53902   // getName->1:     // getName->2:     // getName->N:     // ofs = 53902 ord = 0 addr = 0
	invokevirtual int getTextLength( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	bipush 3
	if_icmpge Label21
	new_lib net.rim.device.api.system.Clipboard//net.rim.device.api.system.Clipboard net.rim.device.api.system.Clipboard net.rim.device.api.system.Clipboard
	dup 
	iconst_0 
	sipush 1043
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	iconst_0 
	bipush 2
	invokestatic_lib net.rim.device.api.system.Bitmap getPredefinedBitmap( int ) // Bitmap
	iipush 131072
	i2l 
	invokespecial_lib net.rim.device.api.ui.component.Dialog.<init> // pc=7
	astore_1 
	aload_1 
	invokevirtual int doModal( net.rim.device.api.ui.component.Dialog ) // pc=1
	pop 
	return 
Label21:
	aload_0 
	invokespecial com.whatsapp.client.ContactSupportScreen.routine_2209 // pc=1
	astore_1 
	aload_0 
	aload_0_getfield com.whatsapp.client.ContactSupportScreen.field_53902   // get_name_1:  com.whatsapp.client.ContactSupportScreen.field_53902   // get_name_2:  com.whatsapp.client.ContactSupportScreen.field_53902   // get_Name:    com.whatsapp.client.ContactSupportScreen.field_53902   // getName->1:     // getName->2:     // getName->N:     // ofs = 53902 ord = 0 addr = 0
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	invokespecial com.whatsapp.client.ContactSupportScreen.routine_2681 // pc=2
	astore_2 
	aload_0 
	invokespecial com.whatsapp.client.ContactSupportScreen.routine_2160 // pc=1
	aload_1 
	ifnull Label49
	aload_0 
	aload_1 
	aload_2 
	invokespecial com.whatsapp.client.ContactSupportScreen.routine_2295 // pc=3
	ifeq Label45
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	new_lib com.whatsapp.client.ContactSupportScreen$8//module:WhatsApp-20.class#6 module:WhatsApp-20.class#6 module:WhatsApp-20.class#6
	dup 
	aload_0 
	invokespecial_lib .routine_1606 // pc=2
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	goto Label52
Label45:
	aload_0 
	aload_2 
	invokespecial com.whatsapp.client.ContactSupportScreen.routine_2450 // pc=2
	goto Label52
Label49:
	aload_0 
	aload_2 
	invokespecial com.whatsapp.client.ContactSupportScreen.routine_2450 // pc=2
Label52:
	aload_0 
	invokevirtual close( net.rim.device.api.ui.Screen ) // pc=1
	return 
	}


private final com.whatsapp.client.ContactSupportScreen.routine_2160( com.whatsapp.client.ContactSupportScreen ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.ContactSupportScreen.field_53922   // get_name_1:  com.whatsapp.client.ContactSupportScreen.field_53922   // get_name_2:  com.whatsapp.client.ContactSupportScreen.field_53922   // get_Name:    com.whatsapp.client.ContactSupportScreen.field_53922   // getName->1:     // getName->2:     // getName->N:     // ofs = 53922 ord = 5 addr = 0
	ifne Label14
	aload_0 
	iconst_1 
	putfield com.whatsapp.client.ContactSupportScreen.field_53922   // get_name_1:  com.whatsapp.client.ContactSupportScreen.field_53922   // get_name_2:  com.whatsapp.client.ContactSupportScreen.field_53922   // get_Name:    com.whatsapp.client.ContactSupportScreen.field_53922   // getName->1:     // getName->2:     // getName->N:     // ofs = 53922 ord = 5 addr = 0
	new_lib net.rim.device.api.ui.component.ObjectChoiceField//net.rim.device.api.ui.component.ObjectChoiceField net.rim.device.api.ui.component.ObjectChoiceField net.rim.device.api.ui.component.ObjectChoiceField
	dup 
	new ContactSupportScreen$9
	dup 
	aload_0 
	invokespecial com.whatsapp.client.ContactSupportScreen$9.<init> // pc=2
	invokespecial_lib java.lang.Thread.<init> // pc=2
	invokevirtual start( java.lang.Thread ) // pc=1
Label14:
	return 
	}


private final net.rim.blackberry.api.mail.Session com.whatsapp.client.ContactSupportScreen.routine_2209( com.whatsapp.client.ContactSupportScreen ); // address: 0
	{
	enter 
	aconst_null 
	astore_1 
	aload_0_getfield com.whatsapp.client.ContactSupportScreen.field_53926   // get_name_1:  com.whatsapp.client.ContactSupportScreen.field_53926   // get_name_2:  com.whatsapp.client.ContactSupportScreen.field_53926   // get_Name:    com.whatsapp.client.ContactSupportScreen.field_53926   // getName->1:     // getName->2:     // getName->N:     // ofs = 53926 ord = 6 addr = 0
	ifnull Label14
	aload_0_getfield com.whatsapp.client.ContactSupportScreen.field_53926   // get_name_1:  com.whatsapp.client.ContactSupportScreen.field_53926   // get_name_2:  com.whatsapp.client.ContactSupportScreen.field_53926   // get_Name:    com.whatsapp.client.ContactSupportScreen.field_53926   // getName->1:     // getName->2:     // getName->N:     // ofs = 53926 ord = 6 addr = 0
	invokestatic_lib net.rim.blackberry.api.mail.Session getInstance( net.rim.blackberry.api.mail.ServiceConfiguration ) // Session
	astore_1 
	aload_1 
	ifnonnull Label35
	invokestatic_lib net.rim.blackberry.api.mail.Session getDefaultInstance(  ) // Session
	astore_1 
	aload_1 
	areturn 
Label14:
	aload_0_getfield com.whatsapp.client.ContactSupportScreen.field_53930   // get_name_1:  com.whatsapp.client.ContactSupportScreen.field_53930   // get_name_2:  com.whatsapp.client.ContactSupportScreen.field_53930   // get_Name:    com.whatsapp.client.ContactSupportScreen.field_53930   // getName->1:     // getName->2:     // getName->N:     // ofs = 53930 ord = 7 addr = 0
	ifnull Label35
	aload_0_getfield com.whatsapp.client.ContactSupportScreen.field_53930   // get_name_1:  com.whatsapp.client.ContactSupportScreen.field_53930   // get_name_2:  com.whatsapp.client.ContactSupportScreen.field_53930   // get_Name:    com.whatsapp.client.ContactSupportScreen.field_53930   // getName->1:     // getName->2:     // getName->N:     // ofs = 53930 ord = 7 addr = 0
	invokevirtual int getSelectedIndex( net.rim.device.api.ui.component.ChoiceField ) // pc=1
	istore_2 
	iload_2 
	bipush -1
	if_icmpeq Label31
	aload_0_getfield com.whatsapp.client.ContactSupportScreen.field_53930   // get_name_1:  com.whatsapp.client.ContactSupportScreen.field_53930   // get_name_2:  com.whatsapp.client.ContactSupportScreen.field_53930   // get_Name:    com.whatsapp.client.ContactSupportScreen.field_53930   // getName->1:     // getName->2:     // getName->N:     // ofs = 53930 ord = 7 addr = 0
	iload_2 
	invokevirtual java.lang.Object getChoice( net.rim.device.api.ui.component.ObjectChoiceField, int ) // pc=2
	checkcast ContactSupportScreen$ServiceChoice
	astore_3 
	aload_3 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokestatic_lib net.rim.blackberry.api.mail.Session getInstance( net.rim.blackberry.api.mail.ServiceConfiguration ) // Session
	astore_1 
Label31:
	aload_1 
	ifnonnull Label35
	invokestatic_lib net.rim.blackberry.api.mail.Session getDefaultInstance(  ) // Session
	astore_1 
Label35:
	aload_1 
	areturn 
	}


private final boolean com.whatsapp.client.ContactSupportScreen.routine_2295( com.whatsapp.client.ContactSupportScreen, net.rim.blackberry.api.mail.Session, java.lang.String ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual net.rim.blackberry.api.mail.Store getStore( net.rim.blackberry.api.mail.Session ) // pc=1
	astore_3 
	aload_3 
	bipush 4
	invokevirtual net.rim.blackberry.api.mail.Folder[] list( net.rim.blackberry.api.mail.Store, int ) // pc=2
	astore_4 
	aload_4 
	iconst_0 
	aaload 
	astore_5 
	new_lib net.rim.blackberry.api.mail.Message//net.rim.blackberry.api.mail.Message net.rim.blackberry.api.mail.Message net.rim.blackberry.api.mail.Message
	dup 
	aload_5 
	invokespecial_lib net.rim.blackberry.api.mail.Message.<init> // pc=2
	astore_6 
	aload_1 
	invokevirtual net.rim.blackberry.api.mail.ServiceConfiguration getServiceConfiguration( net.rim.blackberry.api.mail.Session ) // pc=1
	invokevirtual java.lang.String getEmailAddress( net.rim.blackberry.api.mail.ServiceConfiguration ) // pc=1
	astore_7 
	aconst_null 
	astore 8
	new_lib net.rim.blackberry.api.mail.Address//net.rim.blackberry.api.mail.Address net.rim.blackberry.api.mail.Address net.rim.blackberry.api.mail.Address
	dup 
	aload_7 
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	invokespecial_lib net.rim.blackberry.api.mail.Address.<init> // pc=3
	astore 8
	goto Label33
	astore 9
	aconst_null 
	astore 8
Label33:
	aload_6 
	aload 8
	invokevirtual setFrom( net.rim.blackberry.api.mail.Message, net.rim.blackberry.api.mail.Address ) // pc=2
	aload_0 
	aload_6 
	aload_2 
	invokespecial com.whatsapp.client.ContactSupportScreen.routine_2559 // pc=3
	aload_6 
	aload_3 
	invokevirtual net.rim.blackberry.api.mail.ServiceConfiguration getServiceConfiguration( net.rim.blackberry.api.mail.Service ) // pc=1
	invokestatic_lib send( net.rim.blackberry.api.mail.Message, net.rim.blackberry.api.mail.ServiceConfiguration ) // Transport
	iconst_1 
	ireturn 
	astore_3 
	new_lib net.rim.device.api.ui.MenuItem//net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem
	dup 
	ldc literal_86:"Unable to automatically send e-mail: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_3 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	iconst_0 
	ireturn 
	}


private final com.whatsapp.client.ContactSupportScreen.routine_2450( com.whatsapp.client.ContactSupportScreen, java.lang.String ); // address: 0
	{
	enter 
	new_lib net.rim.blackberry.api.mail.Message//net.rim.blackberry.api.mail.Message net.rim.blackberry.api.mail.Message net.rim.blackberry.api.mail.Message
	dup 
	invokespecial_lib net.rim.blackberry.api.mail.Message.<init> // pc=1
	astore_2 
	aload_0 
	aload_2 
	aload_1 
	invokespecial com.whatsapp.client.ContactSupportScreen.routine_2559 // pc=3
	new_lib net.rim.blackberry.api.invoke.MessageArguments//net.rim.blackberry.api.invoke.MessageArguments net.rim.blackberry.api.invoke.MessageArguments net.rim.blackberry.api.invoke.MessageArguments
	dup 
	aload_2 
	invokespecial_lib net.rim.blackberry.api.invoke.MessageArguments.<init> // pc=2
	astore_3 
	invokestatic_lib net.rim.device.api.ui.UiApplication getUiApplication(  ) // UiApplication
	new_lib com.whatsapp.client.ContactSupportScreen$10//module:WhatsApp-20.class#1 module:WhatsApp-20.class#1 module:WhatsApp-20.class#1
	dup 
	aload_0 
	invokespecial_lib .routine_1394 // pc=2
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	bipush 2
	aload_3 
	invokestatic_lib invokeApplication( int, net.rim.blackberry.api.invoke.ApplicationArguments ) // Invoke
	return 
	astore_2 
	new_lib net.rim.device.api.ui.MenuItem//net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem
	dup 
	ldc literal_87:"Unable to trigger manual e-mail: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_2 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	return 
	}


private final com.whatsapp.client.ContactSupportScreen.routine_2559( com.whatsapp.client.ContactSupportScreen, net.rim.blackberry.api.mail.Message, java.lang.String ); // address: 0
	{
	enter 
	aload_1 
	iconst_0 
	iconst_1 
	newarray_object_lib net.rim.blackberry.api.mail.Address//net.rim.blackberry.api.mail.Address net.rim.blackberry.api.mail.Address net.rim.blackberry.api.mail.Address
	dup 
	iconst_0 
	new_lib net.rim.blackberry.api.mail.Address//net.rim.blackberry.api.mail.Address net.rim.blackberry.api.mail.Address net.rim.blackberry.api.mail.Address
	dup 
	getstatic_lib module:WhatsApp-19.class#0.static_133 // class#0
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	invokespecial_lib net.rim.blackberry.api.mail.Address.<init> // pc=3
	aastore 
	invokevirtual addRecipients( net.rim.blackberry.api.mail.Message, int, net.rim.blackberry.api.mail.Address[] ) // pc=3
	aload_1 
	getstatic_lib module:WhatsApp-19.class#0.static_141 // class#0
	invokevirtual setSubject( net.rim.blackberry.api.mail.Message, java.lang.String ) // pc=2
	new_lib net.rim.blackberry.api.mail.Multipart//net.rim.blackberry.api.mail.Multipart net.rim.blackberry.api.mail.Multipart net.rim.blackberry.api.mail.Multipart
	dup 
	invokespecial_lib net.rim.blackberry.api.mail.Multipart.<init> // pc=1
	astore_3 
	aload_3 
	new_lib net.rim.blackberry.api.mail.TextBodyPart//net.rim.blackberry.api.mail.TextBodyPart net.rim.blackberry.api.mail.TextBodyPart net.rim.blackberry.api.mail.TextBodyPart
	dup 
	aload_3 
	aload_2 
	invokespecial_lib net.rim.blackberry.api.mail.TextBodyPart.<init> // pc=3
	invokevirtual addBodyPart( net.rim.blackberry.api.mail.Multipart, net.rim.blackberry.api.mail.BodyPart ) // pc=2
	new_lib net.rim.blackberry.api.mail.SupportedAttachmentPart//net.rim.blackberry.api.mail.SupportedAttachmentPart net.rim.blackberry.api.mail.SupportedAttachmentPart net.rim.blackberry.api.mail.SupportedAttachmentPart
	dup 
	aload_3 
	getstatic_lib module:WhatsApp-19.class#0.static_92 // class#0
	ldc literal_88:"persistent-console-log.txt"
	aload_0_getfield _debugLog   // get_name_1:  _debugLog   // get_name_2:  _debugLog   // get_Name:    _debugLog   // getName->1:  _debugLog   // getName->2:  _debugLog   // getName->N:  _debugLog   // ofs = 53918 ord = 4 addr = 0
	getstatic_lib module:WhatsApp-19.class#0.static_2 // class#0
	invokenonvirtual_lib java.lang.String.getBytes // pc=2
	invokespecial_lib net.rim.blackberry.api.mail.SupportedAttachmentPart.<init> // pc=5
	astore_4 
	aload_3 
	aload_4 
	invokevirtual addBodyPart( net.rim.blackberry.api.mail.Multipart, net.rim.blackberry.api.mail.BodyPart ) // pc=2
	aload_1 
	aload_3 
	invokevirtual setContent( net.rim.blackberry.api.mail.Message, java.lang.Object ) // pc=2
	return 
	}


private final java.lang.String com.whatsapp.client.ContactSupportScreen.routine_2681( com.whatsapp.client.ContactSupportScreen, java.lang.String ); // address: 0
	{
	enter_narrow 
	new_lib net.rim.device.api.ui.MenuItem//net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	astore_2 
	aload_2 
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_2 
	bipush 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	aload_2 
	bipush 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	aload_2 
	ldc literal_89:"{{classifier_delimiter}}"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_2 
	bipush 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	aload_2 
	aload_0_getfield _debugInfo   // get_name_1:  _debugInfo   // get_name_2:  _debugInfo   // get_Name:    _debugInfo   // getName->1:  _debugInfo   // getName->2:  _debugInfo   // getName->N:  _debugInfo   // ofs = 53914 ord = 3 addr = 0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_2 
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final boolean isDirty( com.whatsapp.client.ContactSupportScreen ); // address: 0
	{
	ireturn_bipush 0
	}


protected final makeMenu( com.whatsapp.client.ContactSupportScreen, net.rim.device.api.ui.component.Menu, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.Screen.makeMenu // pc=3
	iload_2 
	ifne Label10
	aload_1 
	aload_0_getfield com.whatsapp.client.ContactSupportScreen.field_53934   // get_name_1:  com.whatsapp.client.ContactSupportScreen.field_53934   // get_name_2:  com.whatsapp.client.ContactSupportScreen.field_53934   // get_Name:    com.whatsapp.client.ContactSupportScreen.field_53934   // getName->1:     // getName->2:     // getName->N:     // ofs = 53934 ord = 8 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label10:
	return 
	}

}
