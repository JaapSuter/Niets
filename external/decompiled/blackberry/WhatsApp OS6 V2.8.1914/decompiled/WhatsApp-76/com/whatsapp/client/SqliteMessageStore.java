// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-76.cod
// Module version  : 2.8.1914
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


abstract public final class SqliteMessageStore extends Object
implements com.whatsapp.client., javax.microedition.io.file.FileSystemListener

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.device.api.database.Database /*net.rim.device.api.database.Database*/  _database ; // ofs = 49902 addr = 0)
	private long /*long*/  _databaseConnectTime ; // ofs = 49906 addr = 0)
	private long /*long*/  _databaseConnectAttemptTime ; // ofs = 49910 addr = 0)
	private int /*int*/  field_49914 ; // ofs = 49914 addr = 0)
	private String /*java.lang.String*/  field_49918 ; // ofs = 49918 addr = 0)
	private java.util.Hashtable /*java.util.Hashtable*/  field_49922 ; // ofs = 49922 addr = 0)
	private com.whatsapp.client. /*module:WhatsApp-47.class#13*/  field_49926 ; // ofs = 49926 addr = 0)
	private String /*java.lang.String*/  field_49930 ; // ofs = 49930 addr = 0)
	private net.rim.device.api.io.file.FileIOException /*net.rim.device.api.io.file.FileIOException*/  field_49934 ; // ofs = 49934 addr = 0)
	private int /*int*/  field_49938 ; // ofs = 49938 addr = 0)
	private net.rim.device.api.database.Statement /*net.rim.device.api.database.Statement*/  field_49942 ; // ofs = 49942 addr = 0)
	private net.rim.device.api.database.Statement /*net.rim.device.api.database.Statement*/  field_49946 ; // ofs = 49946 addr = 0)
	private net.rim.device.api.database.Statement /*net.rim.device.api.database.Statement*/  field_49950 ; // ofs = 49950 addr = 0)
	private net.rim.device.api.database.Statement /*net.rim.device.api.database.Statement*/  field_49954 ; // ofs = 49954 addr = 0)
	private net.rim.device.api.database.Statement /*net.rim.device.api.database.Statement*/  field_49958 ; // ofs = 49958 addr = 0)
	private net.rim.device.api.database.Statement /*net.rim.device.api.database.Statement*/  field_49962 ; // ofs = 49962 addr = 0)
	private net.rim.device.api.database.Statement /*net.rim.device.api.database.Statement*/  field_49966 ; // ofs = 49966 addr = 0)
	private net.rim.device.api.database.Statement /*net.rim.device.api.database.Statement*/  field_49970 ; // ofs = 49970 addr = 0)
	private net.rim.device.api.database.Statement /*net.rim.device.api.database.Statement*/  field_49974 ; // ofs = 49974 addr = 0)
	private net.rim.device.api.database.Statement /*net.rim.device.api.database.Statement*/  field_49978 ; // ofs = 49978 addr = 0)
	private net.rim.device.api.database.Statement /*net.rim.device.api.database.Statement*/  field_49982 ; // ofs = 49982 addr = 0)
	private net.rim.device.api.database.Statement /*net.rim.device.api.database.Statement*/  field_49986 ; // ofs = 49986 addr = 0)
	private net.rim.device.api.database.Statement /*net.rim.device.api.database.Statement*/  field_49990 ; // ofs = 49990 addr = 0)
	private net.rim.device.api.database.Statement /*net.rim.device.api.database.Statement*/  field_49994 ; // ofs = 49994 addr = 0)
	private Long /*java.lang.Long*/  _asyncCommitThreadStartTime ; // ofs = 49998 addr = 0)
	private Long /*java.lang.Long*/  _asyncCommitThreadWaitUntil ; // ofs = 50002 addr = 0)
	private Object /*java.lang.Object*/  _asyncCommitThreadLock ; // ofs = 50006 addr = 0)
	private java.util.Vector /*java.util.Vector*/  _asyncMessageCommit ; // ofs = 50010 addr = 0)
	private java.util.Hashtable /*java.util.Hashtable*/  _asyncMessageStatusCommit ; // ofs = 50014 addr = 0)
	private java.util.Hashtable /*java.util.Hashtable*/  _asyncLastSeenCommit ; // ofs = 50018 addr = 0)
	private java.util.Hashtable /*java.util.Hashtable*/  _asyncParticipantsCommit ; // ofs = 50022 addr = 0)
	private java.util.Hashtable /*java.util.Hashtable*/  _asyncGroupPhotoCommit ; // ofs = 50026 addr = 0)
	private java.util.Vector /*java.util.Vector*/  _asyncMessageDelete ; // ofs = 50030 addr = 0)
	private java.util.Vector /*java.util.Vector*/  _asyncChatHistoryDelete ; // ofs = 50034 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.SqliteMessageStore, int ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_0 
	iconst_0 
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_0 
	aconst_null 
	putfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	aconst_null 
	putfield .field_27_27   // get_name_1:  .field_27_27   // get_name_2:  .field_27_27   // get_Name:    .field_27_27   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 27
	aload_0 
	new_lib Object//java.lang.Object java.lang.Object java.lang.Object
	dup 
	invokespecial_lib java.lang.Object.<init> // pc=1
	putfield .field_28_28   // get_name_1:  .field_28_28   // get_name_2:  .field_28_28   // get_Name:    .field_28_28   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 28
	aload_0 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield .field_29_29   // get_name_1:  .field_29_29   // get_name_2:  .field_29_29   // get_Name:    .field_29_29   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 29
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putfield .field_30_30   // get_name_1:  .field_30_30   // get_name_2:  .field_30_30   // get_Name:    .field_30_30   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 30
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putfield .field_31_31   // get_name_1:  .field_31_31   // get_name_2:  .field_31_31   // get_Name:    .field_31_31   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 31
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putfield .field_32_32   // get_name_1:  .field_32_32   // get_name_2:  .field_32_32   // get_Name:    .field_32_32   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 32
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putfield .field_33_33   // get_name_1:  .field_33_33   // get_name_2:  .field_33_33   // get_Name:    .field_33_33   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 33
	aload_0 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield .field_34_34   // get_name_1:  .field_34_34   // get_name_2:  .field_34_34   // get_Name:    .field_34_34   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 34
	aload_0 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield .field_35_35   // get_name_1:  .field_35_35   // get_name_2:  .field_35_35   // get_Name:    .field_35_35   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 35
	aload_0 
	iload_1 
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokestatic_lib net.rim.device.api.system.Application getApplication(  ) // Application
	invokevirtual int getProcessId( net.rim.device.api.system.Application ) // pc=1
	istore_2 
	lipush -4528648054740815434
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_270:"Sqlite constructor pid "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	invokestatic_lib boolean logEvent( long, byte[] ) // EventLogger
	pop 
	aload_0 
	invokestatic_lib boolean addFileSystemListener( javax.microedition.io.file.FileSystemListener ) // FileSystemRegistry
	pop 
	aload_0 
	new_lib com.whatsapp.client.RuntimeMessageStore//module:WhatsApp-47.class#13 module:WhatsApp-47.class#13 module:WhatsApp-47.class#13
	dup 
	invokespecial_lib .routine_7715 // pc=1
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	return 
	astore_3 
	aload_0 
	aload_3 
	ldc literal_271:"constructor"
	invokespecial com.whatsapp.client.SqliteMessageStore.throwableHandler // pc=3
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final java.lang.String com.whatsapp.client.SqliteMessageStore.routine_4192( com.whatsapp.client.SqliteMessageStore, int ); // address: 0
	{
	enter_narrow 
	iload_1 
	ifne Label5
	ldc literal_126:"0"
	areturn 
Label5:
	iload_1 
	iconst_1 
	if_icmpne Label10
	ldc literal_125:"1"
	areturn 
Label10:
	iload_1 
	iconst_1 
	if_icmple Label15
	ldc literal_146:">1"
	areturn 
Label15:
	ldc literal_147:"<0"
	areturn 
	}


private final throwableHandler( com.whatsapp.client.SqliteMessageStore, java.lang.Throwable, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	iconst_1 
	iadd 
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_148:"Sqlite error ("
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_149:"): "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0 
	aload_1 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.formatThrowable // pc=2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_3 
	lipush -4528648054740815434
	aload_3 
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	invokestatic_lib boolean logEvent( long, byte[] ) // EventLogger
	pop 
	aload_3 
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	iconst_1 
	if_icmpne Label42
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.disconnectDatabase // pc=1
	aload_0 
	aload_3 
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_1 
	instanceof_lib net.rim.device.api.io.file.FileIOException//net.rim.device.api.io.file.FileIOException net.rim.device.api.io.file.FileIOException net.rim.device.api.io.file.FileIOException
	ifeq Label42
	aload_0 
	aload_1 
	checkcast_lib net.rim.device.api.io.file.FileIOException//net.rim.device.api.io.file.FileIOException net.rim.device.api.io.file.FileIOException net.rim.device.api.io.file.FileIOException
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
Label42:
	aload_0 
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	iconst_1 
	isub 
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	return 
	astore_4 
	aload_0 
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	iconst_1 
	isub 
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_4 
	athrow 
	}


private final com.whatsapp.client.SqliteMessageStore.routine_4383( com.whatsapp.client.SqliteMessageStore, module:WhatsApp-12.class#0, java.lang.String, java.lang.String, byte[] ); // address: 0
	{
	enter 
	aload_4 
	ifnull Label26
	aload_4 
	arraylength 
	ifle Label26
	aload_4 
	iconst_0 
	aload_4 
	arraylength 
	invokestatic_lib net.rim.device.api.system.EncodedImage createEncodedImage( byte[], int, int ) // EncodedImage
	astore_5 
	goto Label28
	astore_6 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_150:"Unable to decode group photo thumbnail: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_6 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aconst_null 
	astore_5 
	goto Label28
Label26:
	aconst_null 
	astore_5 
Label28:
	aload_1 
	aload_3 
	aload_5 
	invokenonvirtual_lib .routine_394 // pc=3
	iconst_0 
	istore_6 
	aload_2 
	stringlength 
	istore 8
	iload 8
	ifne Label40
	return 
Label40:
	iload_6 
	iload 8
	if_icmpge Label66
	aload_2 
	bipush 32
	iload_6 
	invokenonvirtual_lib java.lang.String.indexOf // pc=3
	istore_7 
	iload_7 
	bipush -1
	if_icmpne Label53
	iload 8
	istore_7 
Label53:
	aload_2 
	iload_6 
	iload_7 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	astore 9
	aload_1 
	aload 9
	invokenonvirtual_lib .routine_37 // pc=2
	iload_7 
	iconst_1 
	iadd 
	istore_6 
	goto Label40
Label66:
	aload_1 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	invokenonvirtual_lib .routine_115 // pc=3
	return 
	}


private final module:WhatsApp-26.class#23 com.whatsapp.client.SqliteMessageStore.routine_4551( com.whatsapp.client.SqliteMessageStore, net.rim.device.api.database.Row ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.messageRowToKey // pc=2
	astore_2 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_2 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib WeakReference//java.lang.ref.WeakReference java.lang.ref.WeakReference java.lang.ref.WeakReference
	astore_3 
	aload_3 
	ifnull Label20
	aload_3 
	invokevirtual java.lang.Object get( java.lang.ref.Reference ) // pc=1
	checkcast_lib com.whatsapp.client.//module:WhatsApp-26.class#23 module:WhatsApp-26.class#23 module:WhatsApp-26.class#23
	astore_4 
	aload_4 
	ifnull Label20
	aload_4 
	areturn 
Label20:
	aload_1 
	bipush 3
	invokevirtual java.lang.String getString( net.rim.device.api.database.Row, int ) // pc=2
	astore_4 
	aload_1 
	bipush 4
	invokevirtual int getInteger( net.rim.device.api.database.Row, int ) // pc=2
	istore_5 
	aload_1 
	bipush 6
	invokevirtual java.lang.String getString( net.rim.device.api.database.Row, int ) // pc=2
	astore_6 
	aload_0 
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_5102 // pc=1
	ifeq Label52
	aload_6 
	ifnull Label52
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	aload_6 
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	ldc literal_151:"UTF-8"
	invokespecial_lib java.lang.String.<init> // pc=3
	astore_6 
	goto Label52
	astore_7 
	new_lib RuntimeException//java.lang.RuntimeException java.lang.RuntimeException java.lang.RuntimeException
	dup 
	aload_7 
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	invokespecial_lib java.lang.RuntimeException.<init> // pc=2
	athrow 
Label52:
	aload_1 
	bipush 7
	invokevirtual byte[] getBlobBytes( net.rim.device.api.database.Row, int ) // pc=2
	astore_7 
	aload_1 
	bipush 8
	invokevirtual long getLong( net.rim.device.api.database.Row, int ) // pc=2
	lstore 8
	aload_1 
	bipush 9
	invokevirtual java.lang.String getString( net.rim.device.api.database.Row, int ) // pc=2
	astore 10
	aload_1 
	bipush 10
	invokevirtual java.lang.String getString( net.rim.device.api.database.Row, int ) // pc=2
	astore 11
	aload_1 
	bipush 11
	invokevirtual java.lang.String getString( net.rim.device.api.database.Row, int ) // pc=2
	astore 12
	aload_1 
	bipush 12
	invokevirtual int getInteger( net.rim.device.api.database.Row, int ) // pc=2
	istore 13
	aload_1 
	bipush 13
	invokevirtual java.lang.String getString( net.rim.device.api.database.Row, int ) // pc=2
	astore 14
	aload_1 
	bipush 14
	invokevirtual double getDouble( net.rim.device.api.database.Row, int ) // pc=2
	isreal 
	lstore 15
	aload_1 
	bipush 15
	invokevirtual double getDouble( net.rim.device.api.database.Row, int ) // pc=2
	isreal 
	lstore 17
	aload_1 
	bipush 17
	invokevirtual int getInteger( net.rim.device.api.database.Row, int ) // pc=2
	ifeq Label96
	iconst_1 
	goto Label97
Label96:
	iconst_0 
Label97:
	istore 19
	aload_1 
	bipush 18
	invokevirtual java.lang.String getString( net.rim.device.api.database.Row, int ) // pc=2
	astore 20
	aload_1 
	bipush 19
	invokevirtual java.lang.Object getObject( net.rim.device.api.database.Row, int ) // pc=2
	astore 21
	aload 21
	ifnull Label113
	aload 21
	checkcastbranch_lib 
	invokevirtual long longValue( java.lang.Long ) // pc=1
	l2i 
	goto Label114
Label113:
	iconst_0 
Label114:
	istore 22
	aload_1 
	bipush 20
	invokevirtual java.lang.String getString( net.rim.device.api.database.Row, int ) // pc=2
	astore 23
	new_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-26.class#23 module:WhatsApp-26.class#23 module:WhatsApp-26.class#23
	dup 
	aload_2 
	invokespecial_lib .routine_6221 // pc=2
	astore 24
	aload 24
	aload_4 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload 24
	iload_5 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_6 
	ifnull Label139
	aload 24
	aload_6 
	invokenonvirtual_lib .routine_6057 // pc=2
	aload 24
	iconst_0 
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	goto Label147
Label139:
	aload_7 
	ifnull Label147
	aload 24
	aload_7 
	invokenonvirtual_lib .routine_6076 // pc=2
	aload 24
	iconst_1 
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
Label147:
	aload 24
	lload 8
	lputfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload 24
	aload 10
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload 24
	aload 11
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload 24
	aload 12
	invokestatic_lib module:WhatsApp-26.class#23.routine_6336(  ) // class#23
	putfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	aload 24
	iload 13
	i2l 
	lputfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload 24
	aload 14
	putfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	aload 24
	iload 22
	putfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload 24
	aload 23
	putfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	aload 24
	isreal 
	lload 15
	lputfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	aload 24
	isreal 
	lload 17
	lputfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	aload 24
	iload 19
	putfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	new_lib com.whatsapp.client.//module:WhatsApp-38.class#0 module:WhatsApp-38.class#0 module:WhatsApp-38.class#0
	dup 
	aload 24
	invokespecial_lib .routine_726 // pc=2
	astore 25
	aload 20
	ifnull Label196
	aload 25
	aload 20
	iconst_0 
	invokenonvirtual_lib .routine_593 // pc=3
	pop 
Label196:
	aload 24
	aload 25
	putfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload 24
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	new_lib WeakReference//java.lang.ref.WeakReference java.lang.ref.WeakReference java.lang.ref.WeakReference
	dup 
	aload 24
	invokespecial_lib java.lang.ref.WeakReference.<init> // pc=2
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload 24
	areturn 
	}


private final messagesReceivedBatch( com.whatsapp.client.SqliteMessageStore, java.util.Hashtable ); // address: 0
	{
	enter 
	synch 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnull Label33
	aload_1 
	invokevirtual java.util.Enumeration keys( java.util.Hashtable ) // pc=1
	astore_2 
Label7:
	aload_2 
	invokeinterface interfacemethodref_4 // pc=1 guess=41
	ifeq Label33
	aload_2 
	invokeinterface interfacemethodref_5 // pc=1 guess=42
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage$Key//module:WhatsApp-26.class#24 module:WhatsApp-26.class#24 module:WhatsApp-26.class#24
	astore_3 
	aload_0 
	ldc literal_152:"UPDATE messages SET status=? WHERE key_remote_jid = ? AND key_from_me = ? AND key_id = ?"
	aload_1 
	aload_3 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib Integer//java.lang.Integer java.lang.Integer java.lang.Integer
	invokevirtual_short .toString // idx=2 pc=1
	aload_3 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_3 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifeq Label28
	ldc literal_125:"1"
	goto Label29
Label28:
	ldc literal_126:"0"
Label29:
	aload_3 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_5151 // pc=6
	goto Label7
Label33:
	return 
	}


private final boolean com.whatsapp.client.SqliteMessageStore.routine_5102( com.whatsapp.client.SqliteMessageStore ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iconst_1 
	iand 
	iconst_1 
	if_icmpne Label8
	iconst_1 
	ireturn 
Label8:
	iconst_0 
	ireturn 
	}


private final boolean com.whatsapp.client.SqliteMessageStore.routine_5123( com.whatsapp.client.SqliteMessageStore ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	bipush 2
	iand 
	bipush 2
	if_icmpne Label8
	iconst_1 
	ireturn 
Label8:
	iconst_0 
	ireturn 
	}


private final com.whatsapp.client.SqliteMessageStore.routine_5151( com.whatsapp.client.SqliteMessageStore, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.safeBeginTransaction // pc=1
	aload_1 
	ifnull Label37
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokeinterface interfacemethodref_8 // pc=2 guess=43
	astore_6 
	aload_6 
	invokeinterface interfacemethodref_9 // pc=1 guess=44
	aload_2 
	ifnull Label17
	aload_6 
	iconst_1 
	aload_2 
	invokeinterface interfacemethodref_18 // pc=3 guess=45
Label17:
	aload_3 
	ifnull Label23
	aload_6 
	bipush 2
	aload_3 
	invokeinterface interfacemethodref_18 // pc=3 guess=45
Label23:
	aload_4 
	ifnull Label29
	aload_6 
	bipush 3
	aload_4 
	invokeinterface interfacemethodref_18 // pc=3 guess=45
Label29:
	aload_5 
	ifnull Label35
	aload_6 
	bipush 4
	aload_5 
	invokeinterface interfacemethodref_18 // pc=3 guess=45
Label35:
	aload_6 
	invokeinterface interfacemethodref_10 // pc=1 guess=46
Label37:
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.safeCommitTransaction // pc=1
	return 
	astore_6 
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.safeRollbackTransaction // pc=1
	goto Label45
	astore_7 
Label45:
	aload_0 
	aload_6 
	ldc literal_153:"executeStatement"
	invokespecial com.whatsapp.client.SqliteMessageStore.throwableHandler // pc=3
	return 
	}


private final com.whatsapp.client.SqliteMessageStore.routine_5292( com.whatsapp.client.SqliteMessageStore, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.safeBeginTransaction // pc=1
	aload_1 
	ifnull Label35
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokeinterface interfacemethodref_8 // pc=2 guess=47
	astore_6 
	aload_6 
	invokeinterface interfacemethodref_9 // pc=1 guess=48
	aload_6 
	iconst_1 
	iload_2 
	invokeinterface interfacemethodref_19 // pc=3 guess=49
	aload_3 
	ifnull Label21
	aload_6 
	bipush 2
	aload_3 
	invokeinterface interfacemethodref_18 // pc=3 guess=50
Label21:
	aload_4 
	ifnull Label27
	aload_6 
	bipush 3
	aload_4 
	invokeinterface interfacemethodref_18 // pc=3 guess=50
Label27:
	aload_5 
	ifnull Label33
	aload_6 
	bipush 4
	aload_5 
	invokeinterface interfacemethodref_18 // pc=3 guess=50
Label33:
	aload_6 
	invokeinterface interfacemethodref_10 // pc=1 guess=51
Label35:
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.safeCommitTransaction // pc=1
	return 
	astore_6 
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.safeRollbackTransaction // pc=1
	goto Label43
	astore_7 
Label43:
	aload_0 
	aload_6 
	ldc literal_153:"executeStatement"
	invokespecial com.whatsapp.client.SqliteMessageStore.throwableHandler // pc=3
	return 
	}


private final com.whatsapp.client.SqliteMessageStore.routine_5430( com.whatsapp.client.SqliteMessageStore, java.lang.String, boolean, java.lang.String, java.lang.String, int, boolean, java.lang.String, byte[], long, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, double, double, java.lang.String, boolean, int, int, java.lang.String ); // address: 0
	{
	enter 
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	invokeinterface interfacemethodref_17 // pc=1 guess=52
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	iconst_1 
	aload_1 
	invokeinterface interfacemethodref_18 // pc=3 guess=53
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	bipush 2
	iload_2 
	invokeinterface interfacemethodref_21 // pc=3 guess=54
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	bipush 3
	aload_3 
	invokeinterface interfacemethodref_18 // pc=3 guess=53
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	bipush 4
	aload_4 
	invokeinterface interfacemethodref_18 // pc=3 guess=53
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	bipush 5
	iload_5 
	invokeinterface interfacemethodref_19 // pc=3 guess=55
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	bipush 6
	iload_6 
	invokeinterface interfacemethodref_21 // pc=3 guess=54
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	bipush 7
	aload_7 
	invokeinterface interfacemethodref_18 // pc=3 guess=53
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	bipush 8
	aload 8
	invokeinterface interfacemethodref_22 // pc=3 guess=56
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	bipush 9
	lload 9
	invokeinterface interfacemethodref_23 // pc=4 guess=57
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	bipush 10
	aload 11
	invokeinterface interfacemethodref_18 // pc=3 guess=53
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	bipush 11
	aload 12
	invokeinterface interfacemethodref_18 // pc=3 guess=53
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	bipush 12
	aload 13
	invokeinterface interfacemethodref_18 // pc=3 guess=53
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	bipush 13
	lload 14
	invokeinterface interfacemethodref_23 // pc=4 guess=57
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	bipush 14
	aload 16
	invokeinterface interfacemethodref_18 // pc=3 guess=53
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	bipush 15
	isreal 
	lload 17
	invokeinterface interfacemethodref_24 // pc=4 guess=58
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	bipush 16
	isreal 
	lload 19
	invokeinterface interfacemethodref_24 // pc=4 guess=58
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	bipush 17
	aload 21
	invokeinterface interfacemethodref_18 // pc=3 guess=53
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	bipush 18
	iload 22
	invokeinterface interfacemethodref_21 // pc=3 guess=54
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	bipush 19
	iload 23
	invokeinterface interfacemethodref_19 // pc=3 guess=55
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	bipush 20
	iload 24
	invokeinterface interfacemethodref_19 // pc=3 guess=55
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	bipush 21
	aload 25
	invokeinterface interfacemethodref_18 // pc=3 guess=53
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	invokeinterface interfacemethodref_10 // pc=1 guess=59
	return 
	}


private final com.whatsapp.client.SqliteMessageStore.routine_5708( com.whatsapp.client.SqliteMessageStore, java.lang.String, boolean, java.lang.String ); // address: 0
	{
	enter 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	invokeinterface interfacemethodref_17 // pc=1 guess=60
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	iconst_1 
	aload_1 
	invokeinterface interfacemethodref_18 // pc=3 guess=61
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	bipush 2
	iload_2 
	invokeinterface interfacemethodref_21 // pc=3 guess=62
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	bipush 3
	aload_3 
	invokeinterface interfacemethodref_18 // pc=3 guess=61
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	invokeinterface interfacemethodref_10 // pc=1 guess=63
	return 
	}


private final com.whatsapp.client.SqliteMessageStore.routine_5784( com.whatsapp.client.SqliteMessageStore, net.rim.device.api.io.URI ); // address: 0
	{
	enter 
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.safeBeginTransaction // pc=1
	aload_0 
	ldc literal_154:"chat_history_jid_index"
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_7214 // pc=2
	ifne Label20
	lipush -4528648054740815434
	ldc literal_155:"Schema update: removing chat_history"
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	invokestatic_lib boolean logEvent( long, byte[] ) // EventLogger
	pop 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ldc literal_156:"DROP TABLE IF EXISTS chat_history"
	invokeinterface interfacemethodref_8 // pc=2 guess=64
	astore_2 
	aload_2 
	invokeinterface interfacemethodref_9 // pc=1 guess=65
	aload_2 
	invokeinterface interfacemethodref_10 // pc=1 guess=66
Label20:
	aload_0 
	ldc literal_157:"chat_history"
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_7194 // pc=2
	ifne Label38
	lipush -4528648054740815434
	ldc literal_158:"Schema update: creating chat_history"
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	invokestatic_lib boolean logEvent( long, byte[] ) // EventLogger
	pop 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ldc literal_159:"CREATE TABLE chat_history (jid TEXT, dirty INTEGER, unsent_line TEXT, subject TEXT, participants TEXT, photo_id TEXT, photo_bytes TEXT, last_seen_id TEXT, last_seen_from_me INTEGER)"
	invokeinterface interfacemethodref_8 // pc=2 guess=64
	astore_2 
	aload_2 
	invokeinterface interfacemethodref_9 // pc=1 guess=65
	aload_2 
	invokeinterface interfacemethodref_10 // pc=1 guess=66
	goto Label66
Label38:
	aload_0 
	ldc literal_157:"chat_history"
	ldc literal_160:"subject TEXT"
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_6926 // pc=3
	aload_0 
	ldc literal_157:"chat_history"
	ldc literal_161:"participants TEXT"
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_6926 // pc=3
	aload_0 
	ldc literal_157:"chat_history"
	ldc literal_162:"photo_id TEXT"
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_6926 // pc=3
	aload_0 
	ldc literal_157:"chat_history"
	ldc literal_163:"photo_bytes TEXT"
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_6926 // pc=3
	aload_0 
	ldc literal_157:"chat_history"
	ldc literal_164:"last_seen_id TEXT"
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_6926 // pc=3
	aload_0 
	ldc literal_157:"chat_history"
	ldc literal_165:"last_seen_from_me INTEGER"
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_6926 // pc=3
	aload_0 
	ldc literal_157:"chat_history"
	ldc literal_166:"photo_bytes_full"
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_7059 // pc=3
Label66:
	aload_0 
	ldc literal_154:"chat_history_jid_index"
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_7214 // pc=2
	ifne Label83
	lipush -4528648054740815434
	ldc literal_167:"Schema update: creating chat_history_jid_index"
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	invokestatic_lib boolean logEvent( long, byte[] ) // EventLogger
	pop 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ldc literal_168:"CREATE UNIQUE INDEX chat_history_jid_index on chat_history (jid)"
	invokeinterface interfacemethodref_8 // pc=2 guess=64
	astore_2 
	aload_2 
	invokeinterface interfacemethodref_9 // pc=1 guess=65
	aload_2 
	invokeinterface interfacemethodref_10 // pc=1 guess=66
Label83:
	aload_0 
	ldc literal_169:"messages_key_index"
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_7214 // pc=2
	ifne Label100
	lipush -4528648054740815434
	ldc literal_170:"Schema update: removing messages"
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	invokestatic_lib boolean logEvent( long, byte[] ) // EventLogger
	pop 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ldc literal_171:"DROP TABLE IF EXISTS messages"
	invokeinterface interfacemethodref_8 // pc=2 guess=64
	astore_2 
	aload_2 
	invokeinterface interfacemethodref_9 // pc=1 guess=65
	aload_2 
	invokeinterface interfacemethodref_10 // pc=1 guess=66
Label100:
	aload_0 
	ldc literal_172:"messages"
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_7194 // pc=2
	ifne Label118
	lipush -4528648054740815434
	ldc literal_173:"Schema update: creating messages"
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	invokestatic_lib boolean logEvent( long, byte[] ) // EventLogger
	pop 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ldc literal_174:"CREATE TABLE messages (key_remote_jid TEXT, key_from_me INTEGER, key_id TEXT, status INTEGER, needs_push INTEGER, data TEXT, data_raw TEXT, timestamp INTEGER, media_url TEXT, media_mime_type TEXT, media_wa_type TEXT, media_size INTEGER, media_name TEXT, latitude REAL, longitude REAL, thumb_image TEXT, gap_behind INTEGER, media_filename TEXT, remote_resource TEXT, media_duration_seconds INTEGER, is_mms INTEGER, from_name TEXT)"
	invokeinterface interfacemethodref_8 // pc=2 guess=64
	astore_2 
	aload_2 
	invokeinterface interfacemethodref_9 // pc=1 guess=65
	aload_2 
	invokeinterface interfacemethodref_10 // pc=1 guess=66
	goto Label142
Label118:
	aload_0 
	ldc literal_172:"messages"
	ldc literal_175:"media_filename TEXT"
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_6926 // pc=3
	aload_0 
	ldc literal_172:"messages"
	ldc literal_176:"remote_resource TEXT"
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_6926 // pc=3
	aload_0 
	ldc literal_172:"messages"
	ldc literal_177:"media_duration_seconds INTEGER"
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_6926 // pc=3
	aload_0 
	ldc literal_172:"messages"
	ldc literal_178:"is_mms INTEGER"
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_6926 // pc=3
	aload_0 
	ldc literal_172:"messages"
	ldc literal_179:"data_raw TEXT"
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_6926 // pc=3
	aload_0 
	ldc literal_172:"messages"
	ldc literal_180:"from_name TEXT"
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_6926 // pc=3
Label142:
	aload_0 
	ldc literal_181:"messages_media_type_index"
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_7214 // pc=2
	ifeq Label159
	lipush -4528648054740815434
	ldc literal_182:"Schema update: dropping messages_media_type_index"
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	invokestatic_lib boolean logEvent( long, byte[] ) // EventLogger
	pop 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ldc literal_183:"DROP INDEX messages_media_type_index"
	invokeinterface interfacemethodref_8 // pc=2 guess=64
	astore_2 
	aload_2 
	invokeinterface interfacemethodref_9 // pc=1 guess=65
	aload_2 
	invokeinterface interfacemethodref_10 // pc=1 guess=66
Label159:
	aload_0 
	ldc literal_169:"messages_key_index"
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_7214 // pc=2
	ifne Label176
	lipush -4528648054740815434
	ldc literal_184:"Schema update: creating messages_key_index"
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	invokestatic_lib boolean logEvent( long, byte[] ) // EventLogger
	pop 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ldc literal_185:"CREATE UNIQUE INDEX messages_key_index on messages (key_remote_jid, key_from_me, key_id)"
	invokeinterface interfacemethodref_8 // pc=2 guess=64
	astore_2 
	aload_2 
	invokeinterface interfacemethodref_9 // pc=1 guess=65
	aload_2 
	invokeinterface interfacemethodref_10 // pc=1 guess=66
Label176:
	aload_0 
	ldc literal_186:"messages_is_mms_index"
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_7214 // pc=2
	ifne Label193
	lipush -4528648054740815434
	ldc literal_187:"Schema update: creating messages_is_mms_index"
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	invokestatic_lib boolean logEvent( long, byte[] ) // EventLogger
	pop 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ldc literal_188:"CREATE INDEX messages_is_mms_index on messages (is_mms, key_remote_jid)"
	invokeinterface interfacemethodref_8 // pc=2 guess=64
	astore_2 
	aload_2 
	invokeinterface interfacemethodref_9 // pc=1 guess=65
	aload_2 
	invokeinterface interfacemethodref_10 // pc=1 guess=66
Label193:
	aload_0 
	ldc literal_189:"messages_jid_index"
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_7214 // pc=2
	ifne Label210
	lipush -4528648054740815434
	ldc literal_190:"Schema update: creating messages_jid_index"
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	invokestatic_lib boolean logEvent( long, byte[] ) // EventLogger
	pop 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ldc literal_191:"CREATE INDEX messages_jid_index on messages (key_remote_jid)"
	invokeinterface interfacemethodref_8 // pc=2 guess=64
	astore_2 
	aload_2 
	invokeinterface interfacemethodref_9 // pc=1 guess=65
	aload_2 
	invokeinterface interfacemethodref_10 // pc=1 guess=66
Label210:
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.safeCommitTransaction // pc=1
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.updateSchemaMmsColumn // pc=1
	return 
	astore_2 
	aload_0 
	aload_2 
	ldc literal_192:"schemaUpdate"
	invokespecial com.whatsapp.client.SqliteMessageStore.throwableHandler // pc=3
	aload_0 
	aload_1 
	aload_2 
	ldc literal_192:"schemaUpdate"
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_8456 // pc=4
	goto Label227
	astore_3 
Label227:
	aload_2 
	checkcastbranch_lib 
	athrow 
Label230:
	aload_2 
	checkcastbranch_lib 
	athrow 
Label233:
	return 
	}


private final net.rim.device.api.io.URI com.whatsapp.client.SqliteMessageStore.routine_6553( com.whatsapp.client.SqliteMessageStore, int ); // address: 0
	{
	enter 
	aload_0 
	invokestatic_lib long currentTimeMillis(  ) // System
	lputfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aconst_null 
	astore_2 
	invokestatic_lib java.lang.Thread currentThread(  ) // Thread
	invokevirtual java.lang.String getName( java.lang.Thread ) // pc=1
	astore_3 
	lipush -4528648054740815434
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_103:"Sqlite connect pid "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_193:" thread "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_3 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	invokestatic_lib boolean logEvent( long, byte[] ) // EventLogger
	pop 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnull Label39
	lipush -4528648054740815434
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_194:"Sqlite database already open pid "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	invokestatic_lib boolean logEvent( long, byte[] ) // EventLogger
	pop 
	aconst_null 
	areturn 
Label39:
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	astore_4 
	aload_4 
	invokestatic_lib module:WhatsApp-79.class#39.routine_28000(  ) // class#39
	ifne Label57
	lipush -4528648054740815434
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_195:"Sqlite connect: fs root does not exist - "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_4 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	invokestatic_lib boolean logEvent( long, byte[] ) // EventLogger
	pop 
	aconst_null 
	areturn 
Label57:
	aload_0 
	invokestatic_lib net.rim.device.api.system.CodeSigningKey get( java.lang.Object ) // CodeSigningKey
	astore_5 
	ldc literal_196:"insideConnectDatabase"
	astore_6 
	ldc literal_197:"insideConnectDatabase getDatabaseUriAndDoBackup"
	astore_6 
	aload_0 
	aload_4 
	getstatic_lib module:WhatsApp-19.class#0.static_8 // class#0
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_10318 // pc=3
	astore_2 
	new_lib net.rim.device.api.database.DatabaseSecurityOptions//net.rim.device.api.database.DatabaseSecurityOptions net.rim.device.api.database.DatabaseSecurityOptions net.rim.device.api.database.DatabaseSecurityOptions
	dup 
	aload_5 
	invokespecial_lib net.rim.device.api.database.DatabaseSecurityOptions.<init> // pc=2
	astore_7 
	ldc literal_198:"insideConnectDatabase DatabaseFactoryExists"
	astore_6 
	aload_2 
	invokestatic_lib boolean exists( net.rim.device.api.io.URI ) // DatabaseFactory
	ifeq Label93
	ldc literal_199:"WhatsApp: before encrypt"
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	ldc literal_200:"insideConnectDatabase DatabaseFactoryEncrypt"
	astore_6 
	aload_2 
	aload_7 
	invokestatic_lib encrypt( net.rim.device.api.io.URI, net.rim.device.api.database.DatabaseSecurityOptions ) // DatabaseFactory
	goto Label93
	astore 8
	aload_0 
	aload_2 
	aload 8
	ldc literal_201:"encrypt"
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_8456 // pc=4
Label93:
	ldc literal_202:"WhatsApp: before openOrCreate"
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	ldc literal_203:"insideConnectDatabase DatabaseFactoryOpenOrCreate"
	astore_6 
	aload_0 
	aload_2 
	aload_7 
	invokestatic_lib net.rim.device.api.database.Database openOrCreate( net.rim.device.api.io.URI, net.rim.device.api.database.DatabaseSecurityOptions ) // DatabaseFactory
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	goto Label118
	astore 8
	aload_0 
	aload_2 
	aload 8
	ldc literal_204:"openOrCreate"
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_8456 // pc=4
	ldc literal_205:"WhatsApp: before openOrCreate second attempt"
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	ldc literal_206:"insideConnectDatabase DatabaseFactoryOpenOrCreateExn"
	astore_6 
	aload_0 
	aload_2 
	aload_7 
	invokestatic_lib net.rim.device.api.database.Database openOrCreate( net.rim.device.api.io.URI, net.rim.device.api.database.DatabaseSecurityOptions ) // DatabaseFactory
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
Label118:
	aload_0 
	invokestatic_lib long currentTimeMillis(  ) // System
	lputfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_2 
	areturn 
	astore_7 
	aload_0 
	iload_1 
	aload_6 
	aload_7 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.connectDatabaseError // pc=4
	aconst_null 
	areturn 
	}


private final com.whatsapp.client.SqliteMessageStore.routine_6926( com.whatsapp.client.SqliteMessageStore, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_207:"ALTER TABLE "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_208:" ADD COLUMN "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokeinterface interfacemethodref_8 // pc=2 guess=67
	astore_3 
	aload_3 
	invokeinterface interfacemethodref_9 // pc=1 guess=68
	aload_3 
	invokeinterface interfacemethodref_10 // pc=1 guess=69
	lipush -4528648054740815434
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_209:"Schema update: created "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_210:" in table "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	invokestatic_lib boolean logEvent( long, byte[] ) // EventLogger
	pop 
	return 
	astore_3 
	return 
	}


private final com.whatsapp.client.SqliteMessageStore.routine_7059( com.whatsapp.client.SqliteMessageStore, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_211:"UPDATE "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_212:" SET "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_213:" = NULL"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokeinterface interfacemethodref_8 // pc=2 guess=70
	astore_3 
	aload_3 
	invokeinterface interfacemethodref_9 // pc=1 guess=71
	aload_3 
	invokeinterface interfacemethodref_10 // pc=1 guess=72
	lipush -4528648054740815434
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_214:"Schema update: cleared "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_210:" in table "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	invokestatic_lib boolean logEvent( long, byte[] ) // EventLogger
	pop 
	return 
	astore_3 
	return 
	}


private final boolean com.whatsapp.client.SqliteMessageStore.routine_7194( com.whatsapp.client.SqliteMessageStore, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_215:"table"
	aload_1 
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_7239 // pc=3
	ireturn 
	}


private final boolean com.whatsapp.client.SqliteMessageStore.routine_7214( com.whatsapp.client.SqliteMessageStore, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_216:"index"
	aload_1 
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_7239 // pc=3
	ireturn 
	}


private final boolean com.whatsapp.client.SqliteMessageStore.routine_7239( com.whatsapp.client.SqliteMessageStore, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_217:"SELECT name FROM sqlite_master WHERE type='"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_218:"' AND name='"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_112:"'"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokeinterface interfacemethodref_8 // pc=2 guess=73
	astore_3 
	aload_3 
	invokeinterface interfacemethodref_9 // pc=1 guess=74
	aload_3 
	invokeinterface interfacemethodref_11 // pc=1 guess=75
	astore_4 
	aload_4 
	invokeinterface interfacemethodref_20 // pc=1 guess=76
	istore_5 
	aload_3 
	invokeinterface interfacemethodref_25 // pc=1 guess=77
	iload_5 
	ireturn 
	astore_4 
	iconst_0 
	ireturn 
	}


private final deleteChatHistoryBatch( com.whatsapp.client.SqliteMessageStore, java.util.Vector ); // address: 0
	{
	enter 
	synch 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnull Label46
	iconst_0 
	istore_2 
Label6:
	iload_2 
	aload_1 
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label46
	aload_1 
	iload_2 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore_3 
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.safeBeginTransaction // pc=1
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	invokeinterface interfacemethodref_17 // pc=1 guess=78
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	iconst_1 
	aload_3 
	invokeinterface interfacemethodref_18 // pc=3 guess=79
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	invokeinterface interfacemethodref_10 // pc=1 guess=80
	aload_0_getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	invokeinterface interfacemethodref_17 // pc=1 guess=78
	aload_0_getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	iconst_1 
	aload_3 
	invokeinterface interfacemethodref_18 // pc=3 guess=79
	aload_0_getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	invokeinterface interfacemethodref_10 // pc=1 guess=80
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.safeCommitTransaction // pc=1
	iinc 2 1
	goto Label6
	astore_2 
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.safeRollbackTransaction // pc=1
	goto Label42
	astore_3 
Label42:
	aload_0 
	aload_2 
	ldc literal_219:"deleteChatHistory"
	invokespecial com.whatsapp.client.SqliteMessageStore.throwableHandler // pc=3
Label46:
	return 
	}


private final net.rim.device.api.io.URI com.whatsapp.client.SqliteMessageStore.routine_7514( com.whatsapp.client.SqliteMessageStore, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	astore_3 
	aload_3 
	getstatic_lib module:WhatsApp-19.class#0.static_42 // class#0
	bipush 2
	newarray_object_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	iconst_0 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	getstatic_lib module:WhatsApp-19.class#0.static_42 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	getstatic_lib module:WhatsApp-19.class#0.static_10 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	aastore 
	dup 
	iconst_1 
	getstatic_lib module:WhatsApp-19.class#0.static_9 // class#0
	aastore 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload_3 
	getstatic_lib module:WhatsApp-19.class#0.static_43 // class#0
	bipush 2
	newarray_object_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	iconst_0 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	getstatic_lib module:WhatsApp-19.class#0.static_43 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	getstatic_lib module:WhatsApp-19.class#0.static_11 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	aastore 
	dup 
	iconst_1 
	getstatic_lib module:WhatsApp-19.class#0.static_9 // class#0
	aastore 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_220:"WhatsApp: getDatabaseUri before db folder create "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_221:"file:///"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	astore_4 
	aload_3 
	aload_1 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_arrayobject_lib String
	astore_5 
	iconst_0 
	istore_6 
Label67:
	iload_6 
	aload_5 
	arraylength 
	if_icmplt Label72
	goto_w Label182
Label72:
	aload_4 
	aload_5 
	iload_6 
	aaload 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	bipush 47
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	aconst_null 
	astore_7 
	aload_4 
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String ) // Connector
	checkcast_lib javax.microedition.io.file.FileConnection//javax.microedition.io.file.FileConnection javax.microedition.io.file.FileConnection javax.microedition.io.file.FileConnection
	astore_7 
	aload_7 
	invokeinterface interfacemethodref_26 // pc=1 guess=81
	ifne Label93
	aload_7 
	invokeinterface interfacemethodref_27 // pc=1 guess=82
	goto Label120
Label93:
	aload_7 
	invokeinterface interfacemethodref_2 // pc=1 guess=83
	ifne Label120
	aload_7 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_7 
	invokeinterface interfacemethodref_28 // pc=1 guess=84
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_222:"."
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokestatic_lib long currentTimeMillis(  ) // System
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, long ) // pc=3
	ldc literal_105:".bak"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokeinterface interfacemethodref_29 // pc=2 guess=85
	aload_7 
	invokeinterface interfacemethodref_6 // pc=1 guess=86
	aload_4 
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String ) // Connector
	checkcast_lib javax.microedition.io.file.FileConnection//javax.microedition.io.file.FileConnection javax.microedition.io.file.FileConnection javax.microedition.io.file.FileConnection
	astore_7 
	aload_7 
	invokeinterface interfacemethodref_27 // pc=1 guess=82
Label120:
	iconst_0 
	istore 8
Label122:
	iload 8
	bipush 5
	if_icmpge Label134
	aload_7 
	invokeinterface interfacemethodref_26 // pc=1 guess=81
	ifne Label134
	sipush 1000
	i2l 
	invokestatic_lib sleep( long ) // Thread
	iinc 8 1
	goto Label122
	astore 8
Label134:
	aload_7 
	invokeinterface interfacemethodref_26 // pc=1 guess=81
	ifne Label142
	new_lib net.rim.device.api.io.file.FileIOException//net.rim.device.api.io.file.FileIOException net.rim.device.api.io.file.FileIOException net.rim.device.api.io.file.FileIOException
	dup 
	getstatic_lib module:WhatsApp-19.class#0.static_53 // class#0
	invokespecial_lib net.rim.device.api.io.file.FileIOException.<init> // pc=2
	athrow 
Label142:
	aload_7 
	ifnull Label180
	aload_7 
	invokeinterface interfacemethodref_6 // pc=1 guess=86
	goto Label180
	astore 11
	goto Label180
	astore 8
	aload_0 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_223:"getDatabaseUri "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_4 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_104:" "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0 
	aload 8
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.formatThrowable // pc=2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_0 
	aload 8
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload 8
	athrow 
	astore 9
	aload_7 
	ifnull Label178
	aload_7 
	invokeinterface interfacemethodref_6 // pc=1 guess=86
	goto Label178
	astore 11
Label178:
	aload 9
	athrow 
Label180:
	iinc 6 1
	goto_w Label67
Label182:
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_224:"WhatsApp: getDatabaseUri constructing URI for "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_4 
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_4 
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib net.rim.device.api.io.URI create( java.lang.String ) // URI
	astore_6 
	aload_6 
	areturn 
	}


private final com.whatsapp.client.SqliteMessageStore.routine_8086( com.whatsapp.client.SqliteMessageStore ); // address: 0
	{
	enter 
	ldc literal_225:"INSERT INTO messages (key_remote_jid, key_from_me, key_id, remote_resource, status, needs_push, data, data_raw, timestamp, media_url, media_mime_type, media_wa_type, media_size, media_name, latitude, longitude, media_filename, gap_behind, media_duration_seconds, is_mms, from_name) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?, ?)"
	astore_1 
	aload_0 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokeinterface interfacemethodref_8 // pc=2 guess=87
	putfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	invokeinterface interfacemethodref_9 // pc=1 guess=88
	ldc literal_226:"INSERT OR IGNORE INTO chat_history (jid, dirty, unsent_line) VALUES (?, '0', '')"
	astore_2 
	aload_0 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_2 
	invokeinterface interfacemethodref_8 // pc=2 guess=87
	putfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	invokeinterface interfacemethodref_9 // pc=1 guess=88
	ldc literal_227:"UPDATE chat_history SET last_seen_id = ?, last_seen_from_me = ? WHERE jid = ?"
	astore_3 
	aload_0 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_3 
	invokeinterface interfacemethodref_8 // pc=2 guess=87
	putfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	invokeinterface interfacemethodref_9 // pc=1 guess=88
	ldc literal_228:"UPDATE chat_history SET subject = ? WHERE jid = ?"
	astore_4 
	aload_0 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_4 
	invokeinterface interfacemethodref_8 // pc=2 guess=87
	putfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	invokeinterface interfacemethodref_9 // pc=1 guess=88
	ldc literal_229:"UPDATE chat_history SET participants = ? WHERE jid = ?"
	astore_5 
	aload_0 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_5 
	invokeinterface interfacemethodref_8 // pc=2 guess=87
	putfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	invokeinterface interfacemethodref_9 // pc=1 guess=88
	ldc literal_230:"UPDATE chat_history SET photo_id = ?, photo_bytes = ? WHERE jid = ?"
	astore_6 
	aload_0 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_6 
	invokeinterface interfacemethodref_8 // pc=2 guess=87
	putfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	invokeinterface interfacemethodref_9 // pc=1 guess=88
	ldc literal_231:"DELETE FROM chat_history WHERE jid = ?"
	astore_7 
	aload_0 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_7 
	invokeinterface interfacemethodref_8 // pc=2 guess=87
	putfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	invokeinterface interfacemethodref_9 // pc=1 guess=88
	ldc literal_232:"DELETE FROM messages WHERE key_remote_jid = ?"
	astore 8
	aload_0 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload 8
	invokeinterface interfacemethodref_8 // pc=2 guess=87
	putfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	aload_0_getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	invokeinterface interfacemethodref_9 // pc=1 guess=88
	ldc literal_233:"SELECT rowid FROM messages WHERE key_remote_jid = ? AND key_from_me = ? AND key_id = ?"
	astore 9
	aload_0 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload 9
	invokeinterface interfacemethodref_8 // pc=2 guess=87
	putfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	invokeinterface interfacemethodref_9 // pc=1 guess=88
	ldc literal_234:"SELECT key_remote_jid, key_from_me, key_id, remote_resource, status, needs_push, data, data_raw,timestamp, media_url, media_mime_type, media_wa_type, media_size, media_name, latitude, longitude, thumb_image, gap_behind, media_filename, media_duration_seconds, from_name FROM messages WHERE key_remote_jid = ? AND rowid < ? ORDER BY rowid DESC LIMIT ?"
	astore 10
	aload_0 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload 10
	invokeinterface interfacemethodref_8 // pc=2 guess=87
	putfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	invokeinterface interfacemethodref_9 // pc=1 guess=88
	ldc literal_235:"SELECT key_remote_jid, key_from_me, key_id, remote_resource, status, needs_push, data, data_raw,timestamp, media_url, media_mime_type, media_wa_type, media_size, media_name, latitude, longitude, thumb_image, gap_behind, media_filename, media_duration_seconds, from_name FROM messages WHERE key_remote_jid = ? AND rowid > ? ORDER BY rowid"
	astore 11
	aload_0 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload 11
	invokeinterface interfacemethodref_8 // pc=2 guess=87
	putfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	invokeinterface interfacemethodref_9 // pc=1 guess=88
	ldc literal_236:"SELECT key_remote_jid, key_from_me, key_id, remote_resource, status, needs_push, data, data_raw,timestamp, media_url, media_mime_type, media_wa_type, media_size, media_name, latitude, longitude, thumb_image, gap_behind, media_filename, media_duration_seconds, from_name FROM messages WHERE key_remote_jid = ? AND is_mms = 1 AND rowid < ? AND media_filename NOT NULL ORDER BY rowid DESC LIMIT ?"
	astore 12
	aload_0 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload 12
	invokeinterface interfacemethodref_8 // pc=2 guess=87
	putfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	aload_0_getfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	invokeinterface interfacemethodref_9 // pc=1 guess=88
	ldc literal_237:"SELECT count(*) FROM messages WHERE key_remote_jid = ? AND is_mms = 1 AND media_filename NOT NULL"
	astore 13
	aload_0 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload 13
	invokeinterface interfacemethodref_8 // pc=2 guess=87
	putfield .field_24_24   // get_name_1:  .field_24_24   // get_name_2:  .field_24_24   // get_Name:    .field_24_24   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 24
	aload_0_getfield .field_24_24   // get_name_1:  .field_24_24   // get_name_2:  .field_24_24   // get_Name:    .field_24_24   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 24
	invokeinterface interfacemethodref_9 // pc=1 guess=88
	ldc literal_238:"DELETE FROM messages WHERE key_remote_jid = ? AND key_from_me = ? AND key_id = ?"
	astore 14
	aload_0 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload 14
	invokeinterface interfacemethodref_8 // pc=2 guess=87
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	invokeinterface interfacemethodref_9 // pc=1 guess=88
	return 
	}


private final com.whatsapp.client.SqliteMessageStore.routine_8456( com.whatsapp.client.SqliteMessageStore, net.rim.device.api.io.URI, java.lang.Throwable, java.lang.String ); // address: 0
	{
	enter 
	invokestatic_lib long currentTimeMillis(  ) // System
	lstore 4
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_239:"WhatsApp: archiving existing database due to exception in "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_3 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_240:" - "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_2 
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aconst_null 
	astore_6 
	aconst_null 
	astore_7 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_1 
	invokevirtual java.lang.String toIRIString( net.rim.device.api.io.URI ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_241:"-exception"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String ) // Connector
	checkcast_lib javax.microedition.io.file.FileConnection//javax.microedition.io.file.FileConnection javax.microedition.io.file.FileConnection javax.microedition.io.file.FileConnection
	astore_6 
	aload_6 
	invokeinterface interfacemethodref_26 // pc=1 guess=89
	ifne Label38
	aload_6 
	invokeinterface interfacemethodref_30 // pc=1 guess=90
	goto Label42
Label38:
	aload_6 
	iconst_0 
	i2l 
	invokeinterface interfacemethodref_31 // pc=3 guess=91
Label42:
	new_lib java.io.OutputStreamWriter//java.io.OutputStreamWriter java.io.OutputStreamWriter java.io.OutputStreamWriter
	dup 
	aload_6 
	invokeinterface interfacemethodref_32 // pc=1 guess=92
	getstatic_lib module:WhatsApp-19.class#0.static_2 // class#0
	invokespecial_lib java.io.OutputStreamWriter.<init> // pc=3
	astore_7 
	aload_7 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_3 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_242:"?"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual write( java.io.Writer, java.lang.String ) // pc=2
	aload_7 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_2 
	invokenonvirtual_lib java.lang.Object.getClass // pc=1
	invokevirtual java.lang.String getName( java.lang.Class ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_242:"?"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual write( java.io.Writer, java.lang.String ) // pc=2
	aload_7 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_2 
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_242:"?"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual write( java.io.Writer, java.lang.String ) // pc=2
	aload_7 
	invokevirtual close( java.io.Writer ) // pc=1
	aload_6 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	lload 4
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, long ) // pc=3
	getstatic_lib module:WhatsApp-19.class#0.static_8 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_241:"-exception"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokeinterface interfacemethodref_29 // pc=2 guess=93
	aload_7 
	ifnull Label102
	aload_7 
	invokevirtual close( java.io.Writer ) // pc=1
	goto Label102
	astore 10
Label102:
	aload_6 
	ifnull Label124
	aload_6 
	invokeinterface interfacemethodref_6 // pc=1 guess=94
	goto Label124
	astore 10
	goto Label124
	astore 8
	aload_7 
	ifnull Label116
	aload_7 
	invokevirtual close( java.io.Writer ) // pc=1
	goto Label116
	astore 10
Label116:
	aload_6 
	ifnull Label122
	aload_6 
	invokeinterface interfacemethodref_6 // pc=1 guess=94
	goto Label122
	astore 10
Label122:
	aload 8
	athrow 
Label124:
	aload_1 
	invokevirtual java.lang.String toIRIString( net.rim.device.api.io.URI ) // pc=1
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String ) // Connector
	checkcast_lib javax.microedition.io.file.FileConnection//javax.microedition.io.file.FileConnection javax.microedition.io.file.FileConnection javax.microedition.io.file.FileConnection
	astore_6 
	aload_6 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	lload 4
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, long ) // pc=3
	getstatic_lib module:WhatsApp-19.class#0.static_8 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokeinterface interfacemethodref_29 // pc=2 guess=93
	aload_6 
	ifnull Label155
	aload_6 
	invokeinterface interfacemethodref_6 // pc=1 guess=94
	goto Label155
	astore 13
	goto Label155
	astore 11
	aload_6 
	ifnull Label153
	aload_6 
	invokeinterface interfacemethodref_6 // pc=1 guess=94
	goto Label153
	astore 13
Label153:
	aload 11
	athrow 
Label155:
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_1 
	invokevirtual java.lang.String toIRIString( net.rim.device.api.io.URI ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_243:"-journal"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String ) // Connector
	checkcast_lib javax.microedition.io.file.FileConnection//javax.microedition.io.file.FileConnection javax.microedition.io.file.FileConnection javax.microedition.io.file.FileConnection
	astore_6 
	aload_6 
	invokeinterface interfacemethodref_26 // pc=1 guess=89
	ifeq Label182
	aload_6 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	lload 4
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, long ) // pc=3
	getstatic_lib module:WhatsApp-19.class#0.static_8 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_243:"-journal"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokeinterface interfacemethodref_29 // pc=2 guess=93
Label182:
	aload_6 
	ifnull Label198
	aload_6 
	invokeinterface interfacemethodref_6 // pc=1 guess=94
	return 
	astore 16
	return 
	astore 14
	aload_6 
	ifnull Label196
	aload_6 
	invokeinterface interfacemethodref_6 // pc=1 guess=94
	goto Label196
	astore 16
Label196:
	aload 14
	athrow 
Label198:
	return 
	}


private final com.whatsapp.client.SqliteMessageStore.routine_9123( com.whatsapp.client.SqliteMessageStore ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.//module:WhatsApp-49.class#2 module:WhatsApp-49.class#2 module:WhatsApp-49.class#2
	dup 
	invokespecial_lib .routine_1272 // pc=1
	astore_1 
	new_lib net.rim.device.api.util.SimpleSortingVector//net.rim.device.api.util.SimpleSortingVector net.rim.device.api.util.SimpleSortingVector net.rim.device.api.util.SimpleSortingVector
	dup 
	invokespecial_lib net.rim.device.api.util.SimpleSortingVector.<init> // pc=1
	astore_2 
	aload_2 
	aload_1 
	invokevirtual setSortComparator( net.rim.device.api.util.SimpleSortingVector, net.rim.device.api.util.Comparator ) // pc=2
	new_lib net.rim.device.api.util.SimpleSortingVector//net.rim.device.api.util.SimpleSortingVector net.rim.device.api.util.SimpleSortingVector net.rim.device.api.util.SimpleSortingVector
	dup 
	invokespecial_lib net.rim.device.api.util.SimpleSortingVector.<init> // pc=1
	astore_3 
	aload_3 
	aload_1 
	invokevirtual setSortComparator( net.rim.device.api.util.SimpleSortingVector, net.rim.device.api.util.Comparator ) // pc=2
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	astore_4 
	aload_0 
	aload_4 
	getstatic_lib module:WhatsApp-19.class#0.static_8 // class#0
	aload_2 
	aload_3 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.getBackupNames // pc=5
	pop 
	aload_2 
	invokevirtual reSort( net.rim.device.api.util.SimpleSortingVector ) // pc=1
	aload_3 
	invokevirtual reSort( net.rim.device.api.util.SimpleSortingVector ) // pc=1
	aload_0 
	bipush 3
	aload_4 
	aload_2 
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_9751 // pc=4
	aload_0 
	bipush 3
	aload_4 
	aload_3 
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_9751 // pc=4
	return 
	}


private final com.whatsapp.client.SqliteMessageStore.routine_9234( com.whatsapp.client.SqliteMessageStore, char, long, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	aload_4 
	aload_5 
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_7514 // pc=3
	astore_6 
	aload_0 
	aload_4 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_5 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_222:"."
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	iload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	ldc literal_222:"."
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	lload 2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, long ) // pc=3
	ldc literal_105:".bak"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_7514 // pc=3
	astore_7 
	aconst_null 
	astore 8
	aconst_null 
	astore 9
	aload_6 
	invokevirtual java.lang.String toIRIString( net.rim.device.api.io.URI ) // pc=1
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String ) // Connector
	checkcast_lib javax.microedition.io.file.FileConnection//javax.microedition.io.file.FileConnection javax.microedition.io.file.FileConnection javax.microedition.io.file.FileConnection
	astore 8
	aload 8
	invokeinterface interfacemethodref_26 // pc=1 guess=95
	ifne Label47
	aload 8
	ifnull Label42
	aload 8
	invokeinterface interfacemethodref_6 // pc=1 guess=96
Label42:
	aload 9
	ifnull Label46
	aload 9
	invokeinterface interfacemethodref_6 // pc=1 guess=96
Label46:
	return 
Label47:
	aload_7 
	invokevirtual java.lang.String toIRIString( net.rim.device.api.io.URI ) // pc=1
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String ) // Connector
	checkcast_lib javax.microedition.io.file.FileConnection//javax.microedition.io.file.FileConnection javax.microedition.io.file.FileConnection javax.microedition.io.file.FileConnection
	astore 9
	aload 9
	invokeinterface interfacemethodref_26 // pc=1 guess=95
	ifeq Label64
	aload 8
	ifnull Label59
	aload 8
	invokeinterface interfacemethodref_6 // pc=1 guess=96
Label59:
	aload 9
	ifnull Label63
	aload 9
	invokeinterface interfacemethodref_6 // pc=1 guess=96
Label63:
	return 
Label64:
	aload 9
	invokeinterface interfacemethodref_30 // pc=1 guess=97
	aload 8
	invokeinterface interfacemethodref_33 // pc=1 guess=98
	astore 10
	aload 9
	invokeinterface interfacemethodref_32 // pc=1 guess=99
	astore 11
	sipush 4096
	newarray 2
	astore 12
Label75:
	aload 10
	aload 12
	iconst_0 
	aload 12
	arraylength 
	invokevirtual int read( java.io.InputStream, byte[], int, int ) // pc=4
	dup 
	istore 13
	bipush -1
	if_icmple Label91
	aload 11
	aload 12
	iconst_0 
	iload 13
	invokevirtual write( java.io.OutputStream, byte[], int, int ) // pc=4
	goto Label75
Label91:
	aload 10
	invokevirtual close( java.io.InputStream ) // pc=1
	aload 11
	invokevirtual close( java.io.OutputStream ) // pc=1
	aload 8
	ifnull Label99
	aload 8
	invokeinterface interfacemethodref_6 // pc=1 guess=96
Label99:
	aload 9
	ifnull Label115
	aload 9
	invokeinterface interfacemethodref_6 // pc=1 guess=96
	return 
	astore 14
	aload 8
	ifnull Label109
	aload 8
	invokeinterface interfacemethodref_6 // pc=1 guess=96
Label109:
	aload 9
	ifnull Label113
	aload 9
	invokeinterface interfacemethodref_6 // pc=1 guess=96
Label113:
	aload 14
	athrow 
Label115:
	return 
	}


private final java.lang.String com.whatsapp.client.SqliteMessageStore.routine_9590( com.whatsapp.client.SqliteMessageStore ); // address: 0
	{
	enter 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	astore_1 
	invokestatic_lib java.util.Enumeration listRoots(  ) // FileSystemRegistry
	astore_2 
Label7:
	aload_2 
	invokeinterface interfacemethodref_4 // pc=1 guess=100
	ifeq Label26
	aload_2 
	invokeinterface interfacemethodref_5 // pc=1 guess=101
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore_3 
	aload_1 
	invokevirtual int length( java.lang.StringBuffer ) // pc=1
	ifle Label21
	aload_1 
	ldc literal_244:","
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label21:
	aload_1 
	aload_3 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	goto Label7
Label26:
	aload_1 
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}


private final startAsyncCommitThread( com.whatsapp.client.SqliteMessageStore ); // address: 0
	{
	enter 
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	ifnull Label4
	return 
Label4:
	aload_0 
	new_lib Long//java.lang.Long java.lang.Long java.lang.Long
	dup 
	invokestatic_lib long currentTimeMillis(  ) // System
	invokespecial_lib java.lang.Long.<init> // pc=3
	putfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	new_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	dup 
	new_lib com.whatsapp.client.SqliteMessageStore$1//module:WhatsApp-49.class#0 module:WhatsApp-49.class#0 module:WhatsApp-49.class#0
	dup 
	aload_0 
	invokespecial_lib .routine_1039 // pc=2
	invokespecial_lib java.lang.Thread.<init> // pc=2
	astore_1 
	aload_1 
	iconst_1 
	invokevirtual setPriority( java.lang.Thread, int ) // pc=2
	aload_1 
	invokevirtual start( java.lang.Thread ) // pc=1
	return 
	}


private final com.whatsapp.client.SqliteMessageStore.routine_9751( com.whatsapp.client.SqliteMessageStore, int, java.lang.String, java.util.Vector ); // address: 0
	{
	enter 
	aload_3 
	invokevirtual int size( java.util.Vector ) // pc=1
	iload_1 
	isub 
	istore_4 
	iload_4 
	ifge Label9
	return 
Label9:
	iconst_0 
	istore_5 
Label11:
	iload_5 
	iload_4 
	if_icmpge Label57
	aload_0 
	aload_2 
	aload_3 
	iload_5 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_7514 // pc=3
	astore_6 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_245:"WhatsApp: deleting older backup "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_6 
	invokevirtual java.lang.String toIRIString( net.rim.device.api.io.URI ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aconst_null 
	astore_7 
	aload_6 
	invokevirtual java.lang.String toIRIString( net.rim.device.api.io.URI ) // pc=1
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String ) // Connector
	checkcast_lib javax.microedition.io.file.FileConnection//javax.microedition.io.file.FileConnection javax.microedition.io.file.FileConnection javax.microedition.io.file.FileConnection
	astore_7 
	aload_7 
	invokeinterface interfacemethodref_26 // pc=1 guess=102
	ifeq Label43
	aload_7 
	invokeinterface interfacemethodref_34 // pc=1 guess=103
Label43:
	aload_7 
	ifnull Label55
	aload_7 
	invokeinterface interfacemethodref_6 // pc=1 guess=104
	goto Label55
	astore 8
	aload_7 
	ifnull Label53
	aload_7 
	invokeinterface interfacemethodref_6 // pc=1 guess=104
Label53:
	aload 8
	athrow 
Label55:
	iinc 5 1
	goto Label11
Label57:
	iload_4 
	istore_5 
Label59:
	iload_5 
	aload_3 
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label75
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_246:"WhatsApp: keeping backup "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_3 
	iload_5 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.Object ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	iinc 5 1
	goto Label59
Label75:
	return 
	}


private final com.whatsapp.client.SqliteMessageStore.routine_9959( com.whatsapp.client.SqliteMessageStore, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	aload_2 
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_7514 // pc=3
	astore_3 
	aconst_null 
	astore_4 
	aconst_null 
	astore_5 
	aload_3 
	invokevirtual java.lang.String toIRIString( net.rim.device.api.io.URI ) // pc=1
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String ) // Connector
	checkcast_lib javax.microedition.io.file.FileConnection//javax.microedition.io.file.FileConnection javax.microedition.io.file.FileConnection javax.microedition.io.file.FileConnection
	astore_4 
	aload_4 
	invokeinterface interfacemethodref_26 // pc=1 guess=105
	ifeq Label27
	aload_4 
	ifnull Label22
	aload_4 
	invokeinterface interfacemethodref_6 // pc=1 guess=106
Label22:
	aload_5 
	ifnull Label26
	aload_5 
	invokeinterface interfacemethodref_6 // pc=1 guess=106
Label26:
	return 
Label27:
	new_lib com.whatsapp.client.SqliteMessageStore$FirstLongComparator//module:WhatsApp-49.class#2 module:WhatsApp-49.class#2 module:WhatsApp-49.class#2
	dup 
	invokespecial_lib .routine_1272 // pc=1
	astore_6 
	new_lib net.rim.device.api.util.SimpleSortingVector//net.rim.device.api.util.SimpleSortingVector net.rim.device.api.util.SimpleSortingVector net.rim.device.api.util.SimpleSortingVector
	dup 
	invokespecial_lib net.rim.device.api.util.SimpleSortingVector.<init> // pc=1
	astore_7 
	aload_7 
	aload_6 
	invokevirtual setSortComparator( net.rim.device.api.util.SimpleSortingVector, net.rim.device.api.util.Comparator ) // pc=2
	aload_0 
	aload_1 
	aload_2 
	aload_7 
	aload_7 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.getBackupNames // pc=5
	pop 
	aload_7 
	invokevirtual reSort( net.rim.device.api.util.SimpleSortingVector ) // pc=1
	aload_7 
	invokevirtual int size( java.util.Vector ) // pc=1
	ifne Label59
	aload_4 
	ifnull Label54
	aload_4 
	invokeinterface interfacemethodref_6 // pc=1 guess=106
Label54:
	aload_5 
	ifnull Label58
	aload_5 
	invokeinterface interfacemethodref_6 // pc=1 guess=106
Label58:
	return 
Label59:
	aload_7 
	aload_7 
	invokevirtual int size( java.util.Vector ) // pc=1
	iconst_1 
	isub 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore 8
	aload_0 
	aload_1 
	aload 8
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_7514 // pc=3
	astore 9
	aload 9
	invokevirtual java.lang.String toIRIString( net.rim.device.api.io.URI ) // pc=1
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String ) // Connector
	checkcast_lib javax.microedition.io.file.FileConnection//javax.microedition.io.file.FileConnection javax.microedition.io.file.FileConnection javax.microedition.io.file.FileConnection
	astore_5 
	aload_5 
	invokeinterface interfacemethodref_26 // pc=1 guess=105
	ifne Label97
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_247:"latest backup not found "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 8
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_4 
	ifnull Label92
	aload_4 
	invokeinterface interfacemethodref_6 // pc=1 guess=106
Label92:
	aload_5 
	ifnull Label96
	aload_5 
	invokeinterface interfacemethodref_6 // pc=1 guess=106
Label96:
	return 
Label97:
	aload_5 
	aload_2 
	invokeinterface interfacemethodref_29 // pc=2 guess=107
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_248:"restored backup "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 8
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_4 
	ifnull Label112
	aload_4 
	invokeinterface interfacemethodref_6 // pc=1 guess=106
Label112:
	aload_5 
	ifnull Label128
	aload_5 
	invokeinterface interfacemethodref_6 // pc=1 guess=106
	return 
	astore 10
	aload_4 
	ifnull Label122
	aload_4 
	invokeinterface interfacemethodref_6 // pc=1 guess=106
Label122:
	aload_5 
	ifnull Label126
	aload_5 
	invokeinterface interfacemethodref_6 // pc=1 guess=106
Label126:
	aload 10
	athrow 
Label128:
	return 
	}


private final net.rim.device.api.io.URI com.whatsapp.client.SqliteMessageStore.routine_10318( com.whatsapp.client.SqliteMessageStore, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	aload_2 
	aconst_null 
	aconst_null 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.getBackupNames // pc=5
	astore_3 
	aload_3 
	ifnull Label17
	aload_0 
	aload_3 
	invokevirtual char charValue( java.lang.Character ) // pc=1
	invokestatic_lib long currentTimeMillis(  ) // System
	aload_1 
	aload_2 
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_9234 // pc=6
Label17:
	aload_0 
	aload_1 
	aload_2 
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_7514 // pc=3
	astore_4 
	aload_0 
	aload_1 
	aload_2 
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_9959 // pc=3
	aload_4 
	areturn 
	}


private final int com.whatsapp.client.SqliteMessageStore.routine_10380( com.whatsapp.client.SqliteMessageStore, module:WhatsApp-26.class#24 ); // address: 0
	{
	enter 
	aload_1 
	ifnonnull Label5
	iipush 2147483647
	ireturn 
Label5:
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	invokeinterface interfacemethodref_17 // pc=1 guess=108
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	iconst_1 
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_18 // pc=3 guess=109
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	bipush 2
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifeq Label19
	ldc literal_125:"1"
	goto Label20
Label19:
	ldc literal_126:"0"
Label20:
	invokeinterface interfacemethodref_18 // pc=3 guess=109
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	bipush 3
	aload_1 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokeinterface interfacemethodref_18 // pc=3 guess=109
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	invokeinterface interfacemethodref_11 // pc=1 guess=110
	astore_3 
	aload_3 
	invokeinterface interfacemethodref_20 // pc=1 guess=111
	ifne Label36
	iipush 2147483647
	istore_2 
	iload_2 
	ireturn 
Label36:
	aload_3 
	invokeinterface interfacemethodref_13 // pc=1 guess=112
	astore_4 
	aload_4 
	iconst_0 
	invokevirtual int getInteger( net.rim.device.api.database.Row, int ) // pc=2
	istore_2 
	iload_2 
	ireturn 
	}


private final putMessagesBatch( com.whatsapp.client.SqliteMessageStore, java.util.Vector ); // address: 0
	{
	enter 
	synch 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnonnull Label5
	goto_w Label169
Label5:
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.safeBeginTransaction // pc=1
	aload_1 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_2 
	iconst_0 
	istore_3 
Label12:
	iload_3 
	iload_2 
	if_icmplt Label16
	goto_w Label157
Label16:
	aload_1 
	iload_3 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-26.class#23 module:WhatsApp-26.class#23 module:WhatsApp-26.class#23
	astore_4 
	aload_4 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	astore_5 
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	invokeinterface interfacemethodref_17 // pc=1 guess=113
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	iconst_1 
	aload_5 
	invokeinterface interfacemethodref_18 // pc=3 guess=114
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	invokeinterface interfacemethodref_10 // pc=1 guess=115
	aload_4 
	getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	checkcast_lib com.whatsapp.client.MediaData//module:WhatsApp-38.class#0 module:WhatsApp-38.class#0 module:WhatsApp-38.class#0
	astore_6 
	aload_6 
	ifnull Label49
	aload_4 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifne Label46
	aload_6 
	invokenonvirtual_lib .routine_102 // pc=1
	ifeq Label49
Label46:
	aload_6 
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	goto Label50
Label49:
	aconst_null 
Label50:
	astore_7 
	aload_4 
	getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	bipush 2
	if_icmpeq Label63
	aload_4 
	getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	iconst_1 
	if_icmpeq Label63
	aload_4 
	getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	bipush 3
	if_icmpne Label65
Label63:
	iconst_1 
	goto Label66
Label65:
	iconst_0 
Label66:
	istore 8
	aconst_null 
	astore 9
	aconst_null 
	astore 10
	aload_4 
	getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	iconst_1 
	if_icmpne Label79
	aload_4 
	invokenonvirtual_lib .routine_6010 // pc=1
	astore 10
	goto Label82
Label79:
	aload_4 
	invokenonvirtual_lib .routine_5941 // pc=1
	astore 9
Label82:
	aload_0 
	aload_4 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_4 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_4 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_4 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_4 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_4 
	invokenonvirtual_lib java.lang.Object.getClass // pc=1
	pop 
	iconst_0 
	aload 9
	aload 10
	aload_4 
	lgetfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_4 
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_4 
	getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_4 
	getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	invokestatic_lib module:WhatsApp-26.class#23.routine_6440(  ) // class#23
	aload_4 
	lgetfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload_4 
	getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	aload_4 
	lgetfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	aload_4 
	lgetfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	aload_7 
	aload_4 
	getfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	aload_4 
	getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	iload 8
	aload_4 
	getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_5430 // pc=26
	iload_3 
	iconst_1 
	iadd 
	bipush 40
	irem 
	ifne Label155
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.safeCommitTransaction // pc=1
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_249:"putMessagesBatch taking a 10 second break after "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload_3 
	iconst_1 
	iadd 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_250:" messages"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	sipush 10000
	i2l 
	invokestatic_lib sleep( long ) // Thread
	goto Label153
	astore 11
Label153:
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.safeBeginTransaction // pc=1
Label155:
	iinc 3 1
	goto_w Label12
Label157:
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.safeCommitTransaction // pc=1
	return 
	astore_2 
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.safeRollbackTransaction // pc=1
	goto Label165
	astore_3 
Label165:
	aload_0 
	aload_2 
	ldc literal_251:"putMessagesBatch"
	invokespecial com.whatsapp.client.SqliteMessageStore.throwableHandler // pc=3
Label169:
	return 
	}


private final setLastSeenBatch( com.whatsapp.client.SqliteMessageStore, java.util.Hashtable ); // address: 0
	{
	enter 
	synch 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnonnull Label5
	goto_w Label70
Label5:
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.safeBeginTransaction // pc=1
	aload_1 
	invokevirtual java.util.Enumeration keys( java.util.Hashtable ) // pc=1
	astore_2 
Label10:
	aload_2 
	invokeinterface interfacemethodref_4 // pc=1 guess=116
	ifeq Label58
	aload_2 
	invokeinterface interfacemethodref_5 // pc=1 guess=117
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore_3 
	aload_1 
	aload_3 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	astore_4 
	aconst_null 
	astore_5 
	aload_4 
	checkcastbranch_lib 
	astore_5 
	aload_5 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifeq Label31
	ldc literal_125:"1"
	goto Label32
Label31:
	ldc literal_126:"0"
Label32:
	astore_6 
	aload_5 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	astore_7 
	goto Label41
Label37:
	aconst_null 
	astore_6 
	aconst_null 
	astore_7 
Label41:
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	invokeinterface interfacemethodref_17 // pc=1 guess=118
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	iconst_1 
	aload_7 
	invokeinterface interfacemethodref_18 // pc=3 guess=119
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	bipush 2
	aload_6 
	invokeinterface interfacemethodref_18 // pc=3 guess=119
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	bipush 3
	aload_3 
	invokeinterface interfacemethodref_18 // pc=3 guess=119
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	invokeinterface interfacemethodref_10 // pc=1 guess=120
	goto Label10
Label58:
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.safeCommitTransaction // pc=1
	return 
	astore_2 
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.safeRollbackTransaction // pc=1
	goto Label66
	astore_3 
Label66:
	aload_0 
	aload_2 
	ldc literal_252:"setDirtyBatch"
	invokespecial com.whatsapp.client.SqliteMessageStore.throwableHandler // pc=3
Label70:
	return 
	}


private final updateParticipantsBatch( com.whatsapp.client.SqliteMessageStore, java.util.Hashtable ); // address: 0
	{
	enter 
	synch 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnull Label50
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.safeBeginTransaction // pc=1
	aload_1 
	invokevirtual java.util.Enumeration keys( java.util.Hashtable ) // pc=1
	astore_2 
Label9:
	aload_2 
	invokeinterface interfacemethodref_4 // pc=1 guess=121
	ifeq Label38
	aload_2 
	invokeinterface interfacemethodref_5 // pc=1 guess=122
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore_3 
	aload_1 
	aload_3 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	astore_4 
	aload_0 
	aload_4 
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_11395 // pc=2
	astore_5 
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	invokeinterface interfacemethodref_17 // pc=1 guess=123
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	iconst_1 
	aload_5 
	invokeinterface interfacemethodref_18 // pc=3 guess=124
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	bipush 2
	aload_3 
	invokeinterface interfacemethodref_18 // pc=3 guess=124
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	invokeinterface interfacemethodref_10 // pc=1 guess=125
	goto Label9
Label38:
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.safeCommitTransaction // pc=1
	return 
	astore_2 
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.safeRollbackTransaction // pc=1
	goto Label46
	astore_3 
Label46:
	aload_0 
	aload_2 
	ldc literal_253:"updateParticipantsBatch"
	invokespecial com.whatsapp.client.SqliteMessageStore.throwableHandler // pc=3
Label50:
	return 
	}


private final updateGroupPhotoBatch( com.whatsapp.client.SqliteMessageStore, java.util.Hashtable ); // address: 0
	{
	enter 
	synch 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnull Label52
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.safeBeginTransaction // pc=1
	aload_1 
	invokevirtual java.util.Enumeration keys( java.util.Hashtable ) // pc=1
	astore_2 
Label9:
	aload_2 
	invokeinterface interfacemethodref_4 // pc=1 guess=126
	ifeq Label40
	aload_2 
	invokeinterface interfacemethodref_5 // pc=1 guess=127
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore_3 
	aload_1 
	aload_3 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.SqliteMessageStore$PhotoAndIdPair//module:WhatsApp-49.class#3 module:WhatsApp-49.class#3 module:WhatsApp-49.class#3
	astore_4 
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	invokeinterface interfacemethodref_17 // pc=1 guess=128
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	iconst_1 
	aload_4 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_18 // pc=3 guess=129
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	bipush 2
	aload_4 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokeinterface interfacemethodref_22 // pc=3 guess=130
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	bipush 3
	aload_3 
	invokeinterface interfacemethodref_18 // pc=3 guess=129
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	invokeinterface interfacemethodref_10 // pc=1 guess=131
	goto Label9
Label40:
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.safeCommitTransaction // pc=1
	return 
	astore_2 
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.safeRollbackTransaction // pc=1
	goto Label48
	astore_3 
Label48:
	aload_0 
	aload_2 
	ldc literal_253:"updateParticipantsBatch"
	invokespecial com.whatsapp.client.SqliteMessageStore.throwableHandler // pc=3
Label52:
	return 
	}


private final java.lang.String com.whatsapp.client.SqliteMessageStore.routine_11395( com.whatsapp.client.SqliteMessageStore, java.util.Vector ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual java.util.Enumeration elements( java.util.Vector ) // pc=1
	astore_2 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	astore_3 
Label8:
	aload_2 
	invokeinterface interfacemethodref_4 // pc=1 guess=132
	ifeq Label24
	aload_2 
	invokeinterface interfacemethodref_5 // pc=1 guess=133
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore_4 
	aload_3 
	aload_4 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_3 
	bipush 32
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	goto Label8
Label24:
	aload_3 
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}


private final com.whatsapp.client.SqliteMessageStore.routine_11471( com.whatsapp.client.SqliteMessageStore, java.lang.String ); // address: 0
	{
	enter 
	aload_0_getfield .field_28_28   // get_name_1:  .field_28_28   // get_name_2:  .field_28_28   // get_Name:    .field_28_28   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 28
	dup 
	astore_2 
	monitorenter 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_1 
	invokevirtual_short .virtual_15 // idx=15 pc=2
	astore_3 
	aload_0_getfield .field_31_31   // get_name_1:  .field_31_31   // get_name_2:  .field_31_31   // get_Name:    .field_31_31   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 31
	aload_1 
	aload_3 
	ifnull Label15
	aload_3 
	goto Label19
Label15:
	new_lib Integer//java.lang.Integer java.lang.Integer java.lang.Integer
	dup 
	iconst_0 
	invokespecial_lib java.lang.Integer.<init> // pc=2
Label19:
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload_0 
	invokespecial com.whatsapp.client.SqliteMessageStore.startAsyncCommitThread // pc=1
	aload_2 
	monitorexit 
	return 
	astore_4 
	aload_2 
	monitorexit 
	aload_4 
	athrow 
	}


private final deleteMessagesBatch( com.whatsapp.client.SqliteMessageStore, java.util.Vector ); // address: 0
	{
	enter 
	synch 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnull Label51
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.safeBeginTransaction // pc=1
	aload_1 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_2 
	iconst_0 
	istore_3 
Label11:
	iload_3 
	iload_2 
	if_icmpge Label39
	aload_1 
	iload_3 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	astore_4 
	aload_4 
	checkcastbranch_lib 
	astore_5 
	goto Label26
Label22:
	aload_4 
	checkcastbranch_lib 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	astore_5 
Label26:
	aload_4 
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-26.class#23 module:WhatsApp-26.class#23 module:WhatsApp-26.class#23
	astore_6 
	aload_0 
	aload_5 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_5 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_5 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_5708 // pc=4
Label37:
	iinc 3 1
	goto Label11
Label39:
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.safeCommitTransaction // pc=1
	return 
	astore_2 
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.safeRollbackTransaction // pc=1
	goto Label47
	astore_3 
Label47:
	aload_0 
	aload_2 
	ldc literal_254:"deleteMessagesBatch"
	invokespecial com.whatsapp.client.SqliteMessageStore.throwableHandler // pc=3
Label51:
	return 
	}


private final com.whatsapp.client.SqliteMessageStore.routine_11709( com.whatsapp.client.SqliteMessageStore, net.rim.device.api.io.URI ); // address: 0
	{
	enter 
	synch 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_2 
	iconst_0 
	istore_3 
	ldc literal_255:"begin"
	astore_4 
	ldc literal_256:"begin fillRuntimeDataStore"
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.safeBeginTransaction // pc=1
	ldc literal_257:"chat_history select"
	astore_4 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ldc literal_258:"SELECT jid,dirty,unsent_line,subject,participants,photo_id,photo_bytes,last_seen_id,last_seen_from_me FROM chat_history"
	invokeinterface interfacemethodref_8 // pc=2 guess=134
	astore_5 
	aload_5 
	invokeinterface interfacemethodref_9 // pc=1 guess=135
	aload_5 
	invokeinterface interfacemethodref_11 // pc=1 guess=136
	astore_6 
Label25:
	aload_6 
	invokeinterface interfacemethodref_20 // pc=1 guess=137
	ifne Label29
	goto_w Label135
Label29:
	ldc literal_259:"chat_history getRow"
	astore_4 
	aload_6 
	invokeinterface interfacemethodref_13 // pc=1 guess=138
	astore_7 
	aload_7 
	iconst_0 
	invokevirtual java.lang.String getString( net.rim.device.api.database.Row, int ) // pc=2
	astore 8
	aload_7 
	iconst_1 
	invokevirtual int getInteger( net.rim.device.api.database.Row, int ) // pc=2
	istore 9
	aload_7 
	bipush 2
	invokevirtual java.lang.String getString( net.rim.device.api.database.Row, int ) // pc=2
	astore 10
	aload_7 
	bipush 3
	invokevirtual java.lang.String getString( net.rim.device.api.database.Row, int ) // pc=2
	astore 11
	aload_7 
	bipush 4
	invokevirtual java.lang.String getString( net.rim.device.api.database.Row, int ) // pc=2
	astore 12
	aload_7 
	bipush 5
	invokevirtual java.lang.String getString( net.rim.device.api.database.Row, int ) // pc=2
	astore 13
	aload_7 
	bipush 6
	invokevirtual byte[] getBlobBytes( net.rim.device.api.database.Row, int ) // pc=2
	astore 14
	aload_7 
	bipush 7
	invokevirtual java.lang.String getString( net.rim.device.api.database.Row, int ) // pc=2
	astore 15
	aload_7 
	bipush 8
	invokevirtual java.lang.Object getObject( net.rim.device.api.database.Row, int ) // pc=2
	checkcast_lib Long//java.lang.Long java.lang.Long java.lang.Long
	astore 16
	aload 11
	ifnull Label89
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload 8
	aconst_null 
	iconst_0 
	aload 11
	iconst_0 
	invokenonvirtual_lib .routine_6881 // pc=6
	astore 17
	aload 12
	ifnull Label89
	aload_0 
	aload 17
	aload 12
	aload 13
	aload 14
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_4383 // pc=5
Label89:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload 8
	invokenonvirtual_lib .routine_7639 // pc=2
	astore 17
	aload 17
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifnull Label105
	aload 17
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload 17
	getstatic_lib module:WhatsApp-20.class#0.static_3 // class#0
	invokenonvirtual_lib .routine_1461 // pc=2
	aload 17
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokestatic_lib module:WhatsApp-20.class#0.routine_747(  ) // class#0
Label105:
	aload 17
	aload 10
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload 17
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	ifnull Label112
	goto_w Label25
Label112:
	aload 15
	ifnonnull Label115
	goto_w Label25
Label115:
	aload 16
	ifnonnull Label118
	goto_w Label25
Label118:
	aload 17
	new_lib com.whatsapp.client.FunXMPP$FMessage$Key//module:WhatsApp-26.class#24 module:WhatsApp-26.class#24 module:WhatsApp-26.class#24
	dup 
	aload 8
	aload 16
	invokevirtual long longValue( java.lang.Long ) // pc=1
	iconst_1 
	i2l 
	lcmp 
	ifne Label130
	iconst_1 
	goto Label131
Label130:
	iconst_0 
Label131:
	aload 15
	invokespecial_lib .routine_6840 // pc=4
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	goto_w Label25
Label135:
	ldc literal_260:"chat_history close"
	astore_4 
	aload_6 
	invokeinterface interfacemethodref_35 // pc=1 guess=139
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokevirtual_short .virtual_6 // idx=6 pc=1
	astore_7 
	iconst_0 
	istore 8
	aload_7 
	invokevirtual java.util.Enumeration elements( java.util.Hashtable ) // pc=1
	astore 9
Label147:
	aload 9
	invokeinterface interfacemethodref_4 // pc=1 guess=140
	ifne Label151
	goto_w Label351
Label151:
	aload 9
	invokeinterface interfacemethodref_5 // pc=1 guess=141
	checkcast_lib com.whatsapp.client.//module:WhatsApp-11.class#1 module:WhatsApp-11.class#1 module:WhatsApp-11.class#1
	astore 10
	aload 10
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual boolean isEmpty( java.util.Vector ) // pc=1
	ifne Label160
	goto Label147
Label160:
	aload 10
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	ifnonnull Label165
	iipush 2147483647
	goto Label169
Label165:
	aload_0 
	aload 10
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_10380 // pc=2
Label169:
	istore 11
	iinc 8 1
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_261:"messagesAfter reset_and_bind "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0 
	iload 8
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_4192 // pc=2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_4 
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	invokeinterface interfacemethodref_17 // pc=1 guess=142
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	iconst_1 
	aload 10
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_18 // pc=3 guess=143
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	bipush 2
	iload 11
	invokeinterface interfacemethodref_19 // pc=3 guess=144
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_262:"messagesAfter getcursor "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0 
	iload 8
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_4192 // pc=2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_4 
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	invokeinterface interfacemethodref_11 // pc=1 guess=136
	astore_6 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore 12
Label209:
	aload_6 
	invokeinterface interfacemethodref_20 // pc=1 guess=137
	ifeq Label228
	aload_6 
	invokeinterface interfacemethodref_13 // pc=1 guess=138
	astore 13
	aload_0 
	aload 13
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_4551 // pc=2
	astore 14
	aload_0 
	aload 14
	aload_2 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.isBadFMessage // pc=3
	ifne Label209
	aload 12
	aload 14
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	goto Label209
Label228:
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_263:"messagesBefore reset_and_bind "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0 
	iload 8
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_4192 // pc=2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_4 
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	invokeinterface interfacemethodref_17 // pc=1 guess=142
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	iconst_1 
	aload 10
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_18 // pc=3 guess=143
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	bipush 2
	iload 11
	iipush 2147483647
	if_icmpne Label252
	iipush 2147483647
	goto Label255
Label252:
	iload 11
	iconst_1 
	iadd 
Label255:
	invokeinterface interfacemethodref_19 // pc=3 guess=144
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	bipush 3
	bipush 26
	invokeinterface interfacemethodref_19 // pc=3 guess=144
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_264:"messagesBefore getcursor "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0 
	iload 8
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_4192 // pc=2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_4 
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	invokeinterface interfacemethodref_11 // pc=1 guess=136
	astore_6 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore 13
Label277:
	aload_6 
	invokeinterface interfacemethodref_20 // pc=1 guess=137
	ifeq Label296
	aload_6 
	invokeinterface interfacemethodref_13 // pc=1 guess=138
	astore 14
	aload_0 
	aload 14
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_4551 // pc=2
	astore 15
	aload_0 
	aload 15
	aload_2 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.isBadFMessage // pc=3
	ifne Label277
	aload 13
	aload 15
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	goto Label277
Label296:
	aload 13
	invokevirtual int size( java.util.Vector ) // pc=1
	iconst_1 
	isub 
	istore 14
Label301:
	iload 14
	iflt Label313
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload 13
	iload 14
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-26.class#23 module:WhatsApp-26.class#23 module:WhatsApp-26.class#23
	iconst_1 
	invokenonvirtual_lib .routine_7304 // pc=3
	pop 
	iinc 14 -1
	goto Label301
Label313:
	iconst_0 
	istore 14
Label315:
	iload 14
	aload 12
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label330
	aload 12
	iload 14
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-26.class#23 module:WhatsApp-26.class#23 module:WhatsApp-26.class#23
	astore 15
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload 15
	invokevirtual_short .virtual_12 // idx=12 pc=2
	pop 
	iinc 14 1
	goto Label315
Label330:
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_265:"retrieved and populated "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 13
	invokevirtual int size( java.util.Vector ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_266:" messages for "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload 10
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokestatic_lib module:WhatsApp-79.class#39.routine_24413(  ) // class#39
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	iload_3 
	aload 13
	invokevirtual int size( java.util.Vector ) // pc=1
	iadd 
	istore_3 
	goto_w Label147
Label351:
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_265:"retrieved and populated "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload_3 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_267:" total messages"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokevirtual_short .virtual_14 // idx=14 pc=1
	pop 
	ldc literal_268:"commit"
	astore_4 
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.safeCommitTransaction // pc=1
	aload_2 
	invokevirtual int size( java.util.Vector ) // pc=1
	ifle Label427
	aload_0 
	aload_2 
	invokespecial com.whatsapp.client.SqliteMessageStore.deleteMessagesBatch // pc=2
	return 
	astore_5 
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.safeRollbackTransaction // pc=1
	goto Label380
	astore_6 
Label380:
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_269:"fillRuntimeDataStore "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_4 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_6 
	aload_0 
	aload_5 
	aload_6 
	invokespecial com.whatsapp.client.SqliteMessageStore.throwableHandler // pc=3
	aload_0 
	aload_1 
	aload_5 
	aload_6 
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_8456 // pc=4
	goto Label399
	astore_7 
Label399:
	aload_5 
	athrow 
	astore_5 
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.safeRollbackTransaction // pc=1
	goto Label406
	astore_6 
Label406:
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_269:"fillRuntimeDataStore "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_4 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_6 
	aload_0 
	aload_5 
	aload_6 
	invokespecial com.whatsapp.client.SqliteMessageStore.throwableHandler // pc=3
	aload_0 
	aload_1 
	aload_5 
	aload_6 
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_8456 // pc=4
	goto Label425
	astore_7 
Label425:
	aload_5 
	athrow 
Label427:
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final java.lang.String formatThrowable( com.whatsapp.client.SqliteMessageStore, java.lang.Throwable ); // address: 0
	{
	enter_narrow 
	aload_1 
	instanceof_lib net.rim.device.api.io.file.FileIOException//net.rim.device.api.io.file.FileIOException net.rim.device.api.io.file.FileIOException net.rim.device.api.io.file.FileIOException
	ifeq Label23
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_1 
	invokenonvirtual_lib java.lang.Object.getClass // pc=1
	invokevirtual java.lang.String getName( java.lang.Class ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_86:": ("
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_1 
	checkcast_lib net.rim.device.api.io.file.FileIOException//net.rim.device.api.io.file.FileIOException net.rim.device.api.io.file.FileIOException net.rim.device.api.io.file.FileIOException
	invokevirtual int getErrorCode( net.rim.device.api.io.file.FileIOException ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_87:")"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_2 
	aload_2 
	areturn 
Label23:
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_1 
	invokenonvirtual_lib java.lang.Object.getClass // pc=1
	invokevirtual java.lang.String getName( java.lang.Class ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_88:": "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_1 
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_2 
	aload_2 
	areturn 
	}


public final connectDatabase( com.whatsapp.client.SqliteMessageStore ); // address: 0
	{
	enter 
	synch 
	invokestatic_lib net.rim.device.api.system.Application getApplication(  ) // Application
	invokevirtual int getProcessId( net.rim.device.api.system.Application ) // pc=1
	istore_1 
	ldc literal_89:"start"
	astore_2 
	iconst_0 
	istore_3 
Label9:
	iload_3 
	bipush 3
	if_icmplt Label13
	goto_w Label68
Label13:
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_90:"openDatabase"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload_3 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_2 
	aload_0 
	iload_1 
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_6553 // pc=2
	astore_4 
	aload_4 
	ifnonnull Label28
	return 
Label28:
	ldc literal_91:"WhatsApp: before update schema"
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_92:"updateSchema"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload_3 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_2 
	aload_0 
	aload_4 
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_5784 // pc=2
	ldc literal_93:"WhatsApp: before create prepared statements"
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	ldc literal_94:"createPreparedStatements"
	astore_2 
	aload_0 
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_8086 // pc=1
	ldc literal_95:"WhatsApp: running GC before filling datastore"
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	ldc literal_96:"gcBeforeFillRuntime"
	astore_2 
	invokestatic_lib gc(  ) // System
	ldc literal_97:"WhatsApp: before fill datastore"
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	ldc literal_98:"fillRuntimeDataStore"
	astore_2 
	aload_0 
	aload_4 
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_11709 // pc=2
	goto Label68
	astore_5 
	aload_0 
	iload_1 
	aload_2 
	aload_5 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.connectDatabaseError // pc=4
	iinc 3 1
	goto_w Label9
Label68:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnonnull Label71
	return 
Label71:
	ldc literal_99:"WhatsApp: connectDatabase done, removing excess backups"
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	ldc literal_100:"removeExcessBackups"
	astore_2 
	aload_0 
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_9123 // pc=1
	ldc literal_101:"WhatsApp: connectDatabase backup cleanup complete"
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.clearLastError // pc=1
	return 
	astore_3 
	aload_0 
	iload_1 
	aload_2 
	aload_3 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.connectDatabaseError // pc=4
	return 
	}


public final clearLastError( com.whatsapp.client.SqliteMessageStore ); // address: 0
	{
	enter_narrow 
	aload_0 
	aconst_null 
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_0 
	aconst_null 
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	return 
	}


public final connectDatabaseError( com.whatsapp.client.SqliteMessageStore, int, java.lang.String, java.lang.Throwable ); // address: 0
	{
	enter 
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.disconnectDatabase // pc=1
	aload_3 
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	astore_4 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	ifnonnull Label22
	aload_0 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_102:":"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0 
	aload_3 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.formatThrowable // pc=2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
Label22:
	aload_3 
	instanceof_lib net.rim.device.api.io.file.FileIOException//net.rim.device.api.io.file.FileIOException net.rim.device.api.io.file.FileIOException net.rim.device.api.io.file.FileIOException
	ifeq Label29
	aload_0 
	aload_3 
	checkcast_lib net.rim.device.api.io.file.FileIOException//net.rim.device.api.io.file.FileIOException net.rim.device.api.io.file.FileIOException net.rim.device.api.io.file.FileIOException
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
Label29:
	lipush -4528648054740815434
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_103:"Sqlite connect pid "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_104:" "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_3 
	invokenonvirtual_lib java.lang.Object.getClass // pc=1
	invokevirtual java.lang.String getName( java.lang.Class ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_88:": "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_4 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	invokestatic_lib boolean logEvent( long, byte[] ) // EventLogger
	pop 
	return 
	}


public final java.lang.Character getBackupNames( com.whatsapp.client.SqliteMessageStore, java.lang.String, java.lang.String, java.util.Vector, java.util.Vector ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_7514 // pc=3
	astore_5 
	aconst_null 
	astore_6 
	iconst_0 
	i2l 
	lstore 7
	iconst_0 
	i2l 
	lstore 9
	invokestatic_lib long currentTimeMillis(  ) // System
	lstore 11
	ldc literal_105:".bak"
	astore 13
	aload_5 
	invokevirtual java.lang.String toIRIString( net.rim.device.api.io.URI ) // pc=1
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String ) // Connector
	checkcast_lib javax.microedition.io.file.FileConnection//javax.microedition.io.file.FileConnection javax.microedition.io.file.FileConnection javax.microedition.io.file.FileConnection
	astore_6 
	aload_6 
	invokeinterface interfacemethodref_2 // pc=1 guess=0
	ifne Label27
	goto_w Label168
Label27:
	aload_6 
	ldc literal_106:"*"
	iconst_1 
	invokeinterface interfacemethodref_3 // pc=3 guess=1
	astore 14
Label32:
	aload 14
	invokeinterface interfacemethodref_4 // pc=1 guess=2
	ifne Label36
	goto_w Label136
Label36:
	aload 14
	invokeinterface interfacemethodref_5 // pc=1 guess=3
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore 15
	aload 15
	aload_2 
	invokenonvirtual_lib java.lang.String.startsWith // pc=2
	ifeq Label32
	aload 15
	stringlength 
	aload_2 
	stringlength 
	if_icmple Label32
	aload 15
	ldc literal_105:".bak"
	invokenonvirtual_lib java.lang.String.endsWith // pc=2
	ifeq Label32
	aload 15
	aload_2 
	stringlength 
	aload 15
	stringlength 
	bipush 4
	isub 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	astore 16
	iconst_0 
	istore 17
	aload 16
	invokestatic_lib module:WhatsApp-49.class#2.routine_1298(  ) // class#2
	lstore 18
	iconst_0 
	istore 20
Label69:
	iload 20
	aload 16
	stringlength 
	if_icmpge Label89
	aload 16
	iload 20
	stringaload 
	invokestatic_lib char toLowerCase( char ) // Character
	istore 21
	iload 21
	bipush 100
	if_icmpeq Label84
	iload 21
	bipush 119
	if_icmpne Label87
Label84:
	iload 21
	istore 17
	goto Label89
Label87:
	iinc 20 1
	goto Label69
Label89:
	iload 17
	ifne Label92
	goto_w Label32
Label92:
	lload 18
	iconst_0 
	i2l 
	lcmp 
	ifgt Label98
	goto_w Label32
Label98:
	lload 18
	lload 11
	lcmp 
	iflt Label103
	goto_w Label32
Label103:
	iload 17
	bipush 100
	if_icmpne Label119
	aload_3 
	ifnull Label111
	aload_3 
	aload 15
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label111:
	lload 18
	lload 7
	lcmp 
	ifgt Label116
	goto_w Label32
Label116:
	lload 18
	lstore 7
	goto_w Label32
Label119:
	iload 17
	bipush 119
	if_icmpeq Label123
	goto_w Label32
Label123:
	aload_4 
	ifnull Label128
	aload_4 
	aload 15
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label128:
	lload 18
	lload 9
	lcmp 
	ifgt Label133
	goto_w Label32
Label133:
	lload 18
	lstore 9
	goto_w Label32
Label136:
	lload 9
	iipush 601200000
	i2l 
	ladd 
	lload 11
	lcmp 
	ifge Label152
	new_lib Character//java.lang.Character java.lang.Character java.lang.Character
	dup 
	bipush 119
	invokespecial_lib java.lang.Character.<init> // pc=2
	astore 15
	aload_6 
	invokeinterface interfacemethodref_6 // pc=1 guess=4
	aload 15
	areturn 
Label152:
	lload 7
	iipush 82800000
	i2l 
	ladd 
	lload 11
	lcmp 
	ifge Label168
	new_lib Character//java.lang.Character java.lang.Character java.lang.Character
	dup 
	bipush 100
	invokespecial_lib java.lang.Character.<init> // pc=2
	astore 15
	aload_6 
	invokeinterface interfacemethodref_6 // pc=1 guess=4
	aload 15
	areturn 
Label168:
	aconst_null 
	astore 14
	aload_6 
	invokeinterface interfacemethodref_6 // pc=1 guess=4
	aload 14
	areturn 
	astore 22
	aload_6 
	invokeinterface interfacemethodref_6 // pc=1 guess=4
	aload 22
	athrow 
	}


public final disconnectDatabase( com.whatsapp.client.SqliteMessageStore ); // address: 0
	{
	enter_narrow 
	synch 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnull Label15
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_7 // pc=1 guess=5
	goto Label12
	astore_1 
	aload_0 
	aload_1 
	ldc literal_107:"disconnectDatabase"
	invokespecial com.whatsapp.client.SqliteMessageStore.throwableHandler // pc=3
Label12:
	aload_0 
	aconst_null 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
Label15:
	return 
	}


public final deleteDatabase( com.whatsapp.client.SqliteMessageStore ); // address: 0
	{
	enter 
	synch 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	astore_1 
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.disconnectDatabase // pc=1
	aload_0 
	aload_1 
	getstatic_lib module:WhatsApp-19.class#0.static_8 // class#0
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_7514 // pc=3
	invokestatic_lib delete( net.rim.device.api.io.URI ) // DatabaseFactory
	new_lib com.whatsapp.client.SqliteMessageStore$FirstLongComparator//module:WhatsApp-49.class#2 module:WhatsApp-49.class#2 module:WhatsApp-49.class#2
	dup 
	invokespecial_lib .routine_1272 // pc=1
	astore_2 
	new_lib net.rim.device.api.util.SimpleSortingVector//net.rim.device.api.util.SimpleSortingVector net.rim.device.api.util.SimpleSortingVector net.rim.device.api.util.SimpleSortingVector
	dup 
	invokespecial_lib net.rim.device.api.util.SimpleSortingVector.<init> // pc=1
	astore_3 
	aload_3 
	aload_2 
	invokevirtual setSortComparator( net.rim.device.api.util.SimpleSortingVector, net.rim.device.api.util.Comparator ) // pc=2
	aload_0 
	aload_1 
	getstatic_lib module:WhatsApp-19.class#0.static_8 // class#0
	aload_3 
	aload_3 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.getBackupNames // pc=5
	pop 
	aload_0 
	iconst_0 
	aload_1 
	aload_3 
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_9751 // pc=4
	return 
	}


public final boolean isBadFMessage( com.whatsapp.client.SqliteMessageStore, module:WhatsApp-26.class#23, java.util.Vector ); // address: 0
	{
	enter_narrow 
	aload_1 
	invokenonvirtual_lib .routine_6010 // pc=1
	ifnull Label36
	aload_1 
	invokenonvirtual_lib .routine_6010 // pc=1
	arraylength 
	iipush 48000
	if_icmple Label36
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifeq Label36
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_108:"giant-killing message with length "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokenonvirtual_lib .routine_6010 // pc=1
	arraylength 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_109:" remote_jid "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokestatic_lib module:WhatsApp-79.class#39.routine_24413(  ) // class#39
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_2 
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	iconst_1 
	ireturn 
Label36:
	iconst_0 
	ireturn 
	}


public final module:WhatsApp-26.class#24 messageRowToKey( com.whatsapp.client.SqliteMessageStore, net.rim.device.api.database.Row ); // address: 0
	{
	enter 
	aload_1 
	iconst_0 
	invokevirtual java.lang.String getString( net.rim.device.api.database.Row, int ) // pc=2
	astore_2 
	aload_1 
	iconst_1 
	invokevirtual int getInteger( net.rim.device.api.database.Row, int ) // pc=2
	ifeq Label11
	iconst_1 
	goto Label12
Label11:
	iconst_0 
Label12:
	istore_3 
	aload_1 
	bipush 2
	invokevirtual java.lang.String getString( net.rim.device.api.database.Row, int ) // pc=2
	astore_4 
	new_lib com.whatsapp.client.FunXMPP$FMessage$Key//module:WhatsApp-26.class#24 module:WhatsApp-26.class#24 module:WhatsApp-26.class#24
	dup 
	aload_2 
	iload_3 
	aload_4 
	invokespecial_lib .routine_6840 // pc=4
	astore_5 
	aload_5 
	areturn 
	}


public final net.rim.device.api.io.file.FileIOException getSetupErrorException( com.whatsapp.client.SqliteMessageStore ); // address: 0
	{
	areturn_field .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	}


public final updateSchemaMmsColumn( com.whatsapp.client.SqliteMessageStore ); // address: 0
	{
	enter 
	bipush -1
	istore_1 
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.safeBeginTransaction // pc=1
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ldc literal_110:"SELECT rowid FROM messages WHERE is_mms IS NULL ORDER BY rowid desc LIMIT 1 OFFSET 1000"
	invokeinterface interfacemethodref_8 // pc=2 guess=6
	astore_2 
	aload_2 
	invokeinterface interfacemethodref_9 // pc=1 guess=7
	aload_2 
	invokeinterface interfacemethodref_10 // pc=1 guess=8
	aload_2 
	invokeinterface interfacemethodref_11 // pc=1 guess=9
	astore_3 
	aload_3 
	invokeinterface interfacemethodref_12 // pc=1 guess=10
	ifeq Label26
	aload_3 
	invokeinterface interfacemethodref_13 // pc=1 guess=11
	astore_4 
	aload_4 
	iconst_0 
	invokevirtual int getInteger( net.rim.device.api.database.Row, int ) // pc=2
	istore_1 
Label26:
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.safeCommitTransaction // pc=1
	lipush -4528648054740815434
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_111:"Schema update: rowid limit "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	invokestatic_lib boolean logEvent( long, byte[] ) // EventLogger
	pop 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_112:"'"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	bipush 2
	invokestatic_lib module:WhatsApp-26.class#23.routine_6440(  ) // class#23
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_113:"', '"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	bipush 3
	invokestatic_lib module:WhatsApp-26.class#23.routine_6440(  ) // class#23
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_113:"', '"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	iconst_1 
	invokestatic_lib module:WhatsApp-26.class#23.routine_6440(  ) // class#23
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_112:"'"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_4 
	lipush -4528648054740815434
	ldc literal_114:"Schema update: setting is_mms 1"
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	invokestatic_lib boolean logEvent( long, byte[] ) // EventLogger
	pop 
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.safeBeginTransaction // pc=1
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_115:"UPDATE messages SET is_mms = 1 WHERE is_mms IS NULL and media_wa_type in ("
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_4 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_87:")"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokeinterface interfacemethodref_8 // pc=2 guess=6
	astore_5 
	aload_5 
	invokeinterface interfacemethodref_9 // pc=1 guess=7
	aload_5 
	invokeinterface interfacemethodref_10 // pc=1 guess=8
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.safeCommitTransaction // pc=1
	lipush -4528648054740815434
	ldc literal_116:"Schema update: setting is_mms 0"
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	invokestatic_lib boolean logEvent( long, byte[] ) // EventLogger
	pop 
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.safeBeginTransaction // pc=1
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_117:"UPDATE messages SET is_mms = 0 WHERE rowid >= "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_118:" and is_mms IS NULL"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokeinterface interfacemethodref_8 // pc=2 guess=6
	astore_6 
	aload_6 
	invokeinterface interfacemethodref_9 // pc=1 guess=7
	aload_6 
	invokeinterface interfacemethodref_10 // pc=1 guess=8
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.safeCommitTransaction // pc=1
	lipush -4528648054740815434
	ldc literal_119:"Schema update: is_mms complete"
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	invokestatic_lib boolean logEvent( long, byte[] ) // EventLogger
	pop 
	return 
	}


public final safeBeginTransaction( com.whatsapp.client.SqliteMessageStore ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_5123 // pc=1
	ifeq Label5
	return 
Label5:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_14 // pc=1 guess=12
	return 
	}


public final safeCommitTransaction( com.whatsapp.client.SqliteMessageStore ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_5123 // pc=1
	ifeq Label5
	return 
Label5:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_15 // pc=1 guess=13
	return 
	}


public final safeRollbackTransaction( com.whatsapp.client.SqliteMessageStore ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_5123 // pc=1
	ifeq Label5
	return 
Label5:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_16 // pc=1 guess=14
	return 
	}


public final boolean getMessages( com.whatsapp.client.SqliteMessageStore, java.lang.String, module:WhatsApp-26.class#24, boolean, java.util.Vector ); // address: 0
	{
	enter 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_1 
	aload_2 
	iload_3 
	aload_4 
	invokenonvirtual_lib .routine_5555 // pc=5
	istore_5 
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_11471 // pc=2
	iload_5 
	ifeq Label15
	iconst_1 
	ireturn 
Label15:
	aload_0 
	aload_0 
	astore_6 
	monitorenter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnull Label66
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.safeBeginTransaction // pc=1
	aload_0 
	aload_2 
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_10380 // pc=2
	istore_7 
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	invokeinterface interfacemethodref_17 // pc=1 guess=15
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	iconst_1 
	aload_1 
	invokeinterface interfacemethodref_18 // pc=3 guess=16
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	bipush 2
	iload_7 
	invokeinterface interfacemethodref_19 // pc=3 guess=17
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	invokeinterface interfacemethodref_11 // pc=1 guess=18
	astore 8
Label40:
	aload 8
	invokeinterface interfacemethodref_20 // pc=1 guess=19
	ifeq Label54
	aload 8
	invokeinterface interfacemethodref_13 // pc=1 guess=20
	astore 9
	aload_0 
	aload 9
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_4551 // pc=2
	astore 10
	aload_4 
	aload 10
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	goto Label40
Label54:
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.safeCommitTransaction // pc=1
	goto Label66
	astore_7 
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.safeRollbackTransaction // pc=1
	goto Label62
	astore 8
Label62:
	aload_0 
	aload_7 
	ldc literal_120:"getMessages"
	invokespecial com.whatsapp.client.SqliteMessageStore.throwableHandler // pc=3
Label66:
	aload_6 
	monitorexit 
	iconst_1 
	ireturn 
	astore 11
	aload_6 
	monitorexit 
	aload 11
	athrow 
	}


public final java.util.Vector getMessagesBefore( com.whatsapp.client.SqliteMessageStore, java.lang.String, module:WhatsApp-26.class#23, int ); // address: 0
	{
	enter 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_1 
	aload_2 
	iload_3 
	invokevirtual_short .virtual_9 // idx=9 pc=4
	astore_4 
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_11471 // pc=2
	aload_4 
	invokevirtual int size( java.util.Vector ) // pc=1
	iload_3 
	if_icmplt Label16
	aload_4 
	areturn 
Label16:
	aload_4 
	invokevirtual int size( java.util.Vector ) // pc=1
	ifle Label32
	iload_3 
	aload_4 
	invokevirtual int size( java.util.Vector ) // pc=1
	isub 
	istore_3 
	aload_4 
	aload_4 
	invokevirtual int size( java.util.Vector ) // pc=1
	iconst_1 
	isub 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-26.class#23 module:WhatsApp-26.class#23 module:WhatsApp-26.class#23
	astore_2 
Label32:
	aload_0 
	aload_0 
	astore_5 
	monitorenter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnonnull Label39
	goto_w Label93
Label39:
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.safeBeginTransaction // pc=1
	aload_2 
	ifnonnull Label45
	iipush 2147483647
	goto Label49
Label45:
	aload_0 
	aload_2 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_10380 // pc=2
Label49:
	istore_6 
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	invokeinterface interfacemethodref_17 // pc=1 guess=21
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	iconst_1 
	aload_1 
	invokeinterface interfacemethodref_18 // pc=3 guess=22
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	bipush 2
	iload_6 
	invokeinterface interfacemethodref_19 // pc=3 guess=23
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	bipush 3
	iload_3 
	invokeinterface interfacemethodref_19 // pc=3 guess=23
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	invokeinterface interfacemethodref_11 // pc=1 guess=24
	astore_7 
Label67:
	aload_7 
	invokeinterface interfacemethodref_20 // pc=1 guess=25
	ifeq Label81
	aload_7 
	invokeinterface interfacemethodref_13 // pc=1 guess=26
	astore 8
	aload_0 
	aload 8
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_4551 // pc=2
	astore 9
	aload_4 
	aload 9
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	goto Label67
Label81:
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.safeCommitTransaction // pc=1
	goto Label93
	astore_6 
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.safeRollbackTransaction // pc=1
	goto Label89
	astore_7 
Label89:
	aload_0 
	aload_6 
	ldc literal_121:"getMessagesBefore"
	invokespecial com.whatsapp.client.SqliteMessageStore.throwableHandler // pc=3
Label93:
	aload_5 
	monitorexit 
	goto Label101
	astore 10
	aload_5 
	monitorexit 
	aload 10
	athrow 
Label101:
	aload_4 
	areturn 
	}


public final module:WhatsApp-26.class#23 getMessage( com.whatsapp.client.SqliteMessageStore, module:WhatsApp-26.class#24 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_1 
	invokevirtual_short .virtual_7 // idx=7 pc=2
	areturn 
	}


public final java.util.Hashtable getChats( com.whatsapp.client.SqliteMessageStore ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokevirtual_short .virtual_6 // idx=6 pc=1
	areturn 
	}


public final java.lang.String getAndClearUnsentLine( com.whatsapp.client.SqliteMessageStore, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_1 
	invokevirtual_short .virtual_5 // idx=5 pc=2
	astore_2 
	aload_2 
	areturn 
	}


public final java.util.Vector getMMSMessagesBefore( com.whatsapp.client.SqliteMessageStore, java.lang.String, module:WhatsApp-26.class#23, int ); // address: 0
	{
	enter 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_4 
	aload_0 
	aload_0 
	astore_5 
	monitorenter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnonnull Label19
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_1 
	aload_2 
	iload_3 
	invokevirtual_short .virtual_10 // idx=10 pc=4
	aload_5 
	monitorexit 
	areturn 
Label19:
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.safeBeginTransaction // pc=1
	aload_2 
	ifnonnull Label25
	iipush 2147483647
	goto Label29
Label25:
	aload_0 
	aload_2 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_10380 // pc=2
Label29:
	istore_6 
	aload_0_getfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	invokeinterface interfacemethodref_17 // pc=1 guess=27
	aload_0_getfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	iconst_1 
	aload_1 
	invokeinterface interfacemethodref_18 // pc=3 guess=28
	aload_0_getfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	bipush 2
	iload_6 
	invokeinterface interfacemethodref_19 // pc=3 guess=29
	aload_0_getfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	bipush 3
	iload_3 
	invokeinterface interfacemethodref_19 // pc=3 guess=29
	aload_0_getfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	invokeinterface interfacemethodref_11 // pc=1 guess=30
	astore_7 
Label47:
	aload_7 
	invokeinterface interfacemethodref_20 // pc=1 guess=31
	ifeq Label61
	aload_7 
	invokeinterface interfacemethodref_13 // pc=1 guess=32
	astore 8
	aload_0 
	aload 8
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_4551 // pc=2
	astore 9
	aload_4 
	aload 9
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	goto Label47
Label61:
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.safeCommitTransaction // pc=1
	goto Label73
	astore_6 
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.safeRollbackTransaction // pc=1
	goto Label69
	astore_7 
Label69:
	aload_0 
	aload_6 
	ldc literal_122:"getMMSMessagesBefore"
	invokespecial com.whatsapp.client.SqliteMessageStore.throwableHandler // pc=3
Label73:
	aload_5 
	monitorexit 
	goto Label81
	astore 10
	aload_5 
	monitorexit 
	aload 10
	athrow 
Label81:
	aload_4 
	areturn 
	}


public final int getMMSMessagesCount( com.whatsapp.client.SqliteMessageStore, java.lang.String ); // address: 0
	{
	enter 
	iconst_0 
	istore_2 
	aload_0 
	aload_0 
	astore_3 
	monitorenter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnonnull Label15
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_1 
	invokevirtual_short .virtual_11 // idx=11 pc=2
	aload_3 
	monitorexit 
	ireturn 
Label15:
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.safeBeginTransaction // pc=1
	aload_0_getfield .field_24_24   // get_name_1:  .field_24_24   // get_name_2:  .field_24_24   // get_Name:    .field_24_24   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 24
	invokeinterface interfacemethodref_17 // pc=1 guess=33
	aload_0_getfield .field_24_24   // get_name_1:  .field_24_24   // get_name_2:  .field_24_24   // get_Name:    .field_24_24   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 24
	iconst_1 
	aload_1 
	invokeinterface interfacemethodref_18 // pc=3 guess=34
	aload_0_getfield .field_24_24   // get_name_1:  .field_24_24   // get_name_2:  .field_24_24   // get_Name:    .field_24_24   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 24
	invokeinterface interfacemethodref_11 // pc=1 guess=35
	astore_4 
	aload_4 
	invokeinterface interfacemethodref_20 // pc=1 guess=36
	ifeq Label35
	aload_4 
	invokeinterface interfacemethodref_13 // pc=1 guess=37
	iconst_0 
	invokevirtual int getInteger( net.rim.device.api.database.Row, int ) // pc=2
	istore_2 
	goto Label37
Label35:
	iconst_0 
	istore_2 
Label37:
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.safeCommitTransaction // pc=1
	goto Label49
	astore_4 
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.safeRollbackTransaction // pc=1
	goto Label45
	astore_5 
Label45:
	aload_0 
	aload_4 
	ldc literal_123:"getMMSMessagesCount"
	invokespecial com.whatsapp.client.SqliteMessageStore.throwableHandler // pc=3
Label49:
	aload_3 
	monitorexit 
	iload_2 
	ireturn 
	astore_6 
	aload_3 
	monitorexit 
	aload_6 
	athrow 
	}


public final setSystemFolder( com.whatsapp.client.SqliteMessageStore, net.rim.blackberry.api.messagelist.ApplicationMessageFolder ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_1 
	invokevirtual_short .virtual_16 // idx=16 pc=2
	return 
	}


public final removeFromSystemFolder( com.whatsapp.client.SqliteMessageStore, net.rim.blackberry.api.messagelist.ApplicationMessage ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_1 
	invokevirtual_short .virtual_17 // idx=17 pc=2
	return 
	}


public final setUnsentLine( com.whatsapp.client.SqliteMessageStore, java.lang.String, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_1 
	aload_2 
	invokevirtual_short .virtual_18 // idx=18 pc=3
	return 
	}


public final tickle( com.whatsapp.client.SqliteMessageStore, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_1 
	invokevirtual_short .virtual_19 // idx=19 pc=2
	return 
	}


public final java.util.Enumeration getOfflineMessages( com.whatsapp.client.SqliteMessageStore ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokevirtual_short .virtual_21 // idx=21 pc=1
	areturn 
	}


public final messageSaved( com.whatsapp.client.SqliteMessageStore, module:WhatsApp-26.class#23 ); // address: 0
	{
	enter 
	synch 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnull Label24
	aload_0 
	ldc literal_124:"UPDATE messages SET media_filename=? WHERE key_remote_jid = ? AND key_from_me = ? AND key_id = ?"
	aload_1 
	getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	checkcast_lib com.whatsapp.client.MediaData//module:WhatsApp-38.class#0 module:WhatsApp-38.class#0 module:WhatsApp-38.class#0
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifeq Label19
	ldc literal_125:"1"
	goto Label20
Label19:
	ldc literal_126:"0"
Label20:
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_5151 // pc=6
Label24:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_1 
	invokevirtual_short .virtual_23 // idx=23 pc=2
	return 
	}


public final messageMediaDurationUpdated( com.whatsapp.client.SqliteMessageStore, module:WhatsApp-26.class#23 ); // address: 0
	{
	enter 
	synch 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnull Label22
	aload_0 
	ldc literal_127:"UPDATE messages SET media_duration_seconds=? WHERE key_remote_jid = ? AND key_from_me = ? AND key_id = ?"
	aload_1 
	getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifeq Label17
	ldc literal_125:"1"
	goto Label18
Label17:
	ldc literal_126:"0"
Label18:
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_5292 // pc=6
Label22:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_1 
	invokevirtual_short .virtual_24 // idx=24 pc=2
	return 
	}


public final deleteChatHistory( com.whatsapp.client.SqliteMessageStore, java.lang.String, boolean ); // address: 0
	{
	enter 
	aload_0_getfield .field_28_28   // get_name_1:  .field_28_28   // get_name_2:  .field_28_28   // get_Name:    .field_28_28   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 28
	dup 
	astore_3 
	monitorenter 
	aload_0_getfield .field_35_35   // get_name_1:  .field_35_35   // get_name_2:  .field_35_35   // get_Name:    .field_35_35   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 35
	aload_1 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_0_getfield .field_29_29   // get_name_1:  .field_29_29   // get_name_2:  .field_29_29   // get_Name:    .field_29_29   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 29
	astore_4 
	aload_0 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield .field_29_29   // get_name_1:  .field_29_29   // get_name_2:  .field_29_29   // get_Name:    .field_29_29   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 29
	iconst_0 
	istore_5 
Label17:
	iload_5 
	aload_4 
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label37
	aload_4 
	iload_5 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-26.class#23 module:WhatsApp-26.class#23 module:WhatsApp-26.class#23
	astore_6 
	aload_6 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label35
	aload_0_getfield .field_29_29   // get_name_1:  .field_29_29   // get_name_2:  .field_29_29   // get_Name:    .field_29_29   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 29
	aload_6 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label35:
	iinc 5 1
	goto Label17
Label37:
	aload_0 
	invokespecial com.whatsapp.client.SqliteMessageStore.startAsyncCommitThread // pc=1
	aload_3 
	monitorexit 
	goto Label47
	astore_7 
	aload_3 
	monitorexit 
	aload_7 
	athrow 
Label47:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_1 
	iload_2 
	invokevirtual_short .virtual_4 // idx=4 pc=3
	return 
	}


public final boolean isPersistable( com.whatsapp.client.SqliteMessageStore ); // address: 0
	{
	ireturn_bipush 1
	}


public final boolean isPersistenceEnabled( com.whatsapp.client.SqliteMessageStore ); // address: 0
	{
	enter_narrow 
	synch 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnull Label6
	iconst_1 
	ireturn 
Label6:
	iconst_0 
	ireturn 
	}


public final setPersistentFilesystem( com.whatsapp.client.SqliteMessageStore, java.lang.String ); // address: 0
	{
	enter_narrow 
	synch 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_128:"SqliteMessageStore: setPersistentFilesystem "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_0 
	aload_1 
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.clearLastError // pc=1
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.disconnectDatabase // pc=1
	aload_1 
	stringlength 
	ifle Label22
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.connectDatabase // pc=1
Label22:
	return 
	}


public final rootChanged( com.whatsapp.client.SqliteMessageStore, int, java.lang.String ); // address: 0
	{
	enter 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_129:"SqliteMessageStore: rootChanged "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload_1 
	ifne Label9
	ldc literal_130:"ROOT_ADDED"
	goto Label10
Label9:
	ldc literal_131:"ROOT_REMOVED"
Label10:
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_132:" = "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_0 
	aload_0 
	astore_3 
	monitorenter 
	aload_2 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label35
	iload_1 
	ifne Label30
	aload_0 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.setPersistentFilesystem // pc=2
Label30:
	iload_1 
	iconst_1 
	if_icmpne Label35
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.disconnectDatabase // pc=1
Label35:
	aload_3 
	monitorexit 
	return 
	astore_4 
	aload_3 
	monitorexit 
	aload_4 
	athrow 
	}


public final deleteEntireStorage( com.whatsapp.client.SqliteMessageStore ); // address: 0
	{
	enter_narrow 
	synch 
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.isPersistenceEnabled // pc=1
	istore_1 
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.deleteDatabase // pc=1
	aload_0 
	new_lib com.whatsapp.client.RuntimeMessageStore//module:WhatsApp-47.class#13 module:WhatsApp-47.class#13 module:WhatsApp-47.class#13
	dup 
	invokespecial_lib .routine_7715 // pc=1
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	goto Label20
	astore_2 
	new_lib RuntimeException//java.lang.RuntimeException java.lang.RuntimeException java.lang.RuntimeException
	dup 
	aload_2 
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	invokespecial_lib java.lang.RuntimeException.<init> // pc=2
	athrow 
Label20:
	iload_1 
	ifeq Label24
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.connectDatabase // pc=1
Label24:
	return 
	}


public final java.lang.String getSetupError( com.whatsapp.client.SqliteMessageStore ); // address: 0
	{
	areturn_field .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	}


public final int countDirty( com.whatsapp.client.SqliteMessageStore ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokevirtual_short .virtual_3 // idx=3 pc=1
	ireturn 
	}


public final java.lang.String getLogState( com.whatsapp.client.SqliteMessageStore ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnonnull Label5
	ldc literal_133:"disconnected"
	goto Label6
Label5:
	ldc literal_134:"connected"
Label6:
	astore_1 
	invokestatic_lib net.rim.device.api.system.MemoryStats getRAMStats(  ) // Memory
	astore_2 
	ldc literal_135:"SqliteMessageStore?{0}?{1}?{2}?{3}?{4}?{5}"
	bipush 6
	newarray_object_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	iconst_0 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_136:"fs='"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_112:"'"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	aastore 
	dup 
	iconst_1 
	aload_1 
	aastore 
	dup 
	bipush 2
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.getSetupError // pc=1
	aastore 
	dup 
	bipush 3
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_137:"roots='"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0 
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_9590 // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_112:"'"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	aastore 
	dup 
	bipush 4
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_138:"free="
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_2 
	invokevirtual int getFree( net.rim.device.api.system.MemoryStats ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	aastore 
	dup 
	bipush 5
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_139:"allocated="
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_2 
	invokevirtual int getAllocated( net.rim.device.api.system.MemoryStats ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	aastore 
	invokestatic_lib java.lang.String format( java.lang.String, java.lang.Object[] ) // MessageFormat
	astore_3 
	aload_3 
	areturn 
	}


public final messageStatusUpdate( com.whatsapp.client.SqliteMessageStore, module:WhatsApp-26.class#24, int ); // address: 0
	{
	enter 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_1 
	iload_2 
	invokevirtual_short .virtual_22 // idx=22 pc=3
	aload_0_getfield .field_28_28   // get_name_1:  .field_28_28   // get_name_2:  .field_28_28   // get_Name:    .field_28_28   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 28
	dup 
	astore_3 
	monitorenter 
	aload_0_getfield .field_30_30   // get_name_1:  .field_30_30   // get_name_2:  .field_30_30   // get_Name:    .field_30_30   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 30
	aload_1 
	new_lib Integer//java.lang.Integer java.lang.Integer java.lang.Integer
	dup 
	iload_2 
	invokespecial_lib java.lang.Integer.<init> // pc=2
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload_0 
	invokespecial com.whatsapp.client.SqliteMessageStore.startAsyncCommitThread // pc=1
	aload_3 
	monitorexit 
	return 
	astore_4 
	aload_3 
	monitorexit 
	aload_4 
	athrow 
	}


public final boolean putMessage( com.whatsapp.client.SqliteMessageStore, module:WhatsApp-26.class#23 ); // address: 0
	{
	enter 
	aload_0_getfield .field_28_28   // get_name_1:  .field_28_28   // get_name_2:  .field_28_28   // get_Name:    .field_28_28   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 28
	dup 
	astore_2 
	monitorenter 
	aload_1 
	getfield .field_24_24   // get_name_1:  .field_24_24   // get_name_2:  .field_24_24   // get_Name:    .field_24_24   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 24
	ifeq Label19
	aload_0 
	new_lib Long//java.lang.Long java.lang.Long java.lang.Long
	dup 
	invokestatic_lib long currentTimeMillis(  ) // System
	iipush 60000
	i2l 
	ladd 
	invokespecial_lib java.lang.Long.<init> // pc=3
	putfield .field_27_27   // get_name_1:  .field_27_27   // get_name_2:  .field_27_27   // get_Name:    .field_27_27   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 27
	ldc literal_140:"SqliteMessageStore.putMessage commit delay extended due to offline message"
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
Label19:
	aload_0_getfield .field_29_29   // get_name_1:  .field_29_29   // get_name_2:  .field_29_29   // get_Name:    .field_29_29   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 29
	aload_1 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_0 
	invokespecial com.whatsapp.client.SqliteMessageStore.startAsyncCommitThread // pc=1
	aload_2 
	monitorexit 
	goto Label32
	astore_3 
	aload_2 
	monitorexit 
	aload_3 
	athrow 
Label32:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_1 
	invokevirtual_short .virtual_12 // idx=12 pc=2
	istore_2 
	iload_2 
	ireturn 
	}


public final deleteMessage( com.whatsapp.client.SqliteMessageStore, module:WhatsApp-26.class#23 ); // address: 0
	{
	enter 
	aload_0_getfield .field_28_28   // get_name_1:  .field_28_28   // get_name_2:  .field_28_28   // get_Name:    .field_28_28   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 28
	dup 
	astore_2 
	monitorenter 
	aload_0_getfield .field_34_34   // get_name_1:  .field_34_34   // get_name_2:  .field_34_34   // get_Name:    .field_34_34   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 34
	aload_1 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_0 
	invokespecial com.whatsapp.client.SqliteMessageStore.startAsyncCommitThread // pc=1
	aload_2 
	monitorexit 
	goto Label18
	astore_3 
	aload_2 
	monitorexit 
	aload_3 
	athrow 
Label18:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_1 
	invokevirtual_short .virtual_13 // idx=13 pc=2
	aload_0 
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokespecial com.whatsapp.client.SqliteMessageStore.routine_11471 // pc=2
	return 
	}


public final java.util.Hashtable getJidsPendingUpdate( com.whatsapp.client.SqliteMessageStore ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokevirtual_short .virtual_14 // idx=14 pc=1
	areturn 
	}


public final java.lang.String getDefaultRoot( com.whatsapp.client.SqliteMessageStore ); // address: 0
	{
	enter_narrow 
	getstatic_lib module:WhatsApp-19.class#0.static_44 // class#0
	invokestatic_lib module:WhatsApp-79.class#39.routine_28000(  ) // class#39
	ifeq Label7
	getstatic_lib module:WhatsApp-19.class#0.static_43 // class#0
	astore_1 
	goto Label9
Label7:
	getstatic_lib module:WhatsApp-19.class#0.static_42 // class#0
	astore_1 
Label9:
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_141:"SqLite getDefaultRoot returns: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_1 
	areturn 
	}


public final module:WhatsApp-12.class#0 addGroupChat( com.whatsapp.client.SqliteMessageStore, java.lang.String, java.lang.String, int, java.lang.String, int ); // address: 0
	{
	enter 
	synch 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnull Label40
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.safeBeginTransaction // pc=1
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	invokeinterface interfacemethodref_17 // pc=1 guess=38
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	iconst_1 
	aload_1 
	invokeinterface interfacemethodref_18 // pc=3 guess=39
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	invokeinterface interfacemethodref_10 // pc=1 guess=40
	aload_4 
	ifnull Label28
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	invokeinterface interfacemethodref_17 // pc=1 guess=38
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	iconst_1 
	aload_4 
	invokeinterface interfacemethodref_18 // pc=3 guess=39
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	bipush 2
	aload_1 
	invokeinterface interfacemethodref_18 // pc=3 guess=39
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	invokeinterface interfacemethodref_10 // pc=1 guess=40
Label28:
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.safeCommitTransaction // pc=1
	goto Label40
	astore_6 
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.safeRollbackTransaction // pc=1
	goto Label36
	astore_7 
Label36:
	aload_0 
	aload_6 
	ldc literal_142:"addGroupChat"
	invokespecial com.whatsapp.client.SqliteMessageStore.throwableHandler // pc=3
Label40:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_1 
	aload_2 
	iload_3 
	aload_4 
	iload_5 
	invokenonvirtual_lib .routine_6881 // pc=6
	astore_6 
	aload_6 
	new_lib com.whatsapp.client.SqliteMessageStore$2//module:WhatsApp-49.class#1 module:WhatsApp-49.class#1 module:WhatsApp-49.class#1
	dup 
	aload_0 
	aload_1 
	invokespecial_lib .routine_1155 // pc=3
	invokenonvirtual_lib .routine_9 // pc=2
	aload_6 
	areturn 
	}


public final module:WhatsApp-11.class#1 addTempGroupChat( com.whatsapp.client.SqliteMessageStore, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_1 
	invokevirtual_short .virtual_33 // idx=33 pc=2
	areturn 
	}


public final module:WhatsApp-12.class#0 getGroupChat( com.whatsapp.client.SqliteMessageStore, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_1 
	invokevirtual_short .virtual_34 // idx=34 pc=2
	areturn 
	}


public final setChatState( com.whatsapp.client.SqliteMessageStore, java.lang.String, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_1 
	iload_2 
	invokevirtual_short .virtual_35 // idx=35 pc=3
	return 
	}


public final long getLastGroupsUpdate( com.whatsapp.client.SqliteMessageStore ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokevirtual_short .virtual_36 // idx=36 pc=1
	lreturn 
	}


public final setLastGroupsUpdate( com.whatsapp.client.SqliteMessageStore, long ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	lload 1
	invokevirtual_short .virtual_37 // idx=37 pc=3
	return 
	}


public final module:WhatsApp-26.class#24 getLastSeenMessage( com.whatsapp.client.SqliteMessageStore, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_1 
	invokevirtual_short .virtual_15 // idx=15 pc=2
	areturn 
	}


public final net.rim.device.api.collection.ReadableList getApplicationMessageList( com.whatsapp.client.SqliteMessageStore ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokevirtual_short .virtual_20 // idx=20 pc=1
	areturn 
	}


public final java.lang.String toString( com.whatsapp.client.SqliteMessageStore ); // address: 0
	{
	enter_narrow 
	synch 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	sipush 337
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_143:" (db "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnonnull Label14
	ldc literal_144:"disabled"
	goto Label15
Label14:
	ldc literal_145:"enabled"
Label15:
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_87:")"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}

}
