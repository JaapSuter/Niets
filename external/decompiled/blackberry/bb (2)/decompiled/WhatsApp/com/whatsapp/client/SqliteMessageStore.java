// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-29.cod
// Module version  : 2.6.7421
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


abstract public final class SqliteMessageStore extends Object
implements com.whatsapp.client.MessageStore, javax.microedition.io.file.FileSystemListener

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.device.api.database.Database /*net.rim.device.api.database.Database*/  _database ; // ofs = 56260 addr = 0)
	private String /*java.lang.String*/  _fsRoot ; // ofs = 56264 addr = 0)
	private java.util.Hashtable /*java.util.Hashtable*/  _canonicalMessageMap ; // ofs = 56268 addr = 0)
	private final boolean /*boolean*/  _correctEncoding ; // ofs = 56272 addr = 0)
	private com.whatsapp.client.RuntimeMessageStore /*module:WhatsApp-26.class#14*/  _runtimeMessageStore ; // ofs = 56276 addr = 0)
	private String /*java.lang.String*/  _lastConnectionErrorMessage ; // ofs = 56280 addr = 0)
	private int /*int*/  _throwableHandlersInFlight ; // ofs = 56284 addr = 0)
	private net.rim.device.api.database.Statement /*net.rim.device.api.database.Statement*/  _insertMessageStatement ; // ofs = 56288 addr = 0)
	private net.rim.device.api.database.Statement /*net.rim.device.api.database.Statement*/  _chatHistoryStatement ; // ofs = 56292 addr = 0)
	private net.rim.device.api.database.Statement /*net.rim.device.api.database.Statement*/  _chatHistoryDirtyStatement ; // ofs = 56296 addr = 0)
	private net.rim.device.api.database.Statement /*net.rim.device.api.database.Statement*/  _chatHistorySubjectStatement ; // ofs = 56300 addr = 0)
	private net.rim.device.api.database.Statement /*net.rim.device.api.database.Statement*/  _chatHistoryParticipantsStatement ; // ofs = 56304 addr = 0)
	private net.rim.device.api.database.Statement /*net.rim.device.api.database.Statement*/  _deleteChatHistoryForJidStatement ; // ofs = 56308 addr = 0)
	private net.rim.device.api.database.Statement /*net.rim.device.api.database.Statement*/  _deleteMessagesForJidStatement ; // ofs = 56312 addr = 0)
	private net.rim.device.api.database.Statement /*net.rim.device.api.database.Statement*/  _messagesBeforeXForJid ; // ofs = 56316 addr = 0)
	private net.rim.device.api.database.Statement /*net.rim.device.api.database.Statement*/  _mmsMessagesBeforeXForJid ; // ofs = 56320 addr = 0)
	private net.rim.device.api.database.Statement /*net.rim.device.api.database.Statement*/  _mmsMessagesCountForJid ; // ofs = 56324 addr = 0)
	private net.rim.device.api.database.Statement /*net.rim.device.api.database.Statement*/  _deleteMessageStatement ; // ofs = 56328 addr = 0)
	private Long /*java.lang.Long*/  _asyncCommitThreadStartTime ; // ofs = 56332 addr = 0)
	private Long /*java.lang.Long*/  _asyncCommitThreadWaitUntil ; // ofs = 56336 addr = 0)
	private Object /*java.lang.Object*/  _asyncCommitThreadLock ; // ofs = 56340 addr = 0)
	private java.util.Vector /*java.util.Vector*/  _asyncMessageCommit ; // ofs = 56344 addr = 0)
	private java.util.Vector /*java.util.Vector*/  _asyncMessageStatusCommit ; // ofs = 56348 addr = 0)
	private java.util.Hashtable /*java.util.Hashtable*/  _asyncDirtyCommit ; // ofs = 56352 addr = 0)
	private java.util.Hashtable /*java.util.Hashtable*/  _asyncParticipantsCommit ; // ofs = 56356 addr = 0)
	private java.util.Vector /*java.util.Vector*/  _asyncMessageDelete ; // ofs = 56360 addr = 0)
	private java.util.Vector /*java.util.Vector*/  _asyncChatHistoryDelete ; // ofs = 56364 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.SqliteMessageStore, boolean ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	iconst_0 
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0 
	aconst_null 
	putfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	aload_0 
	aconst_null 
	putfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	aload_0 
	new_lib Object//java.lang.Object java.lang.Object java.lang.Object
	dup 
	invokespecial_lib java.lang.Object.<init> // pc=1
	putfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_0 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	aload_0 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putfield .field_24_24   // get_name_1:  .field_24_24   // get_name_2:  .field_24_24   // get_Name:    .field_24_24   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 24
	aload_0 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	aload_0 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	iload_1 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokestatic_lib net.rim.device.api.system.Application getApplication(  ) // Application
	invokevirtual int getProcessId( net.rim.device.api.system.Application ) // pc=1
	istore_2 
	lipush -4528648054740815434
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_2402:"Sqlite constructor pid "
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
	new_lib com.whatsapp.client.RuntimeMessageStore//module:WhatsApp-26.class#14 module:WhatsApp-26.class#14 module:WhatsApp-26.class#14
	dup 
	invokespecial_lib .routine_4863 // pc=1
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	return 
	astore_3 
	aload_0 
	aload_3 
	ldc literal_2403:"constructor"
	invokespecial com.whatsapp.client.SqliteMessageStore.throwableHandler // pc=3
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final throwableHandler( com.whatsapp.client.SqliteMessageStore, java.lang.Throwable, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iconst_1 
	iadd 
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_2343:"Sqlite error ("
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_2344:"): "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_1 
	invokenonvirtual_lib java.lang.Object.getClass // pc=1
	invokevirtual java.lang.String getName( java.lang.Class ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_2334:": "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_1 
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_3 
	lipush -4528648054740815434
	aload_3 
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	invokestatic_lib boolean logEvent( long, byte[] ) // EventLogger
	pop 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iconst_1 
	if_icmpne Label35
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.disconnectDatabase // pc=1
Label35:
	aload_0 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iconst_1 
	isub 
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	return 
	astore_4 
	aload_0 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iconst_1 
	isub 
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_4 
	athrow 
	}


private final archiveDatabase( com.whatsapp.client.SqliteMessageStore, net.rim.device.api.io.URI, net.rim.device.api.database.DatabaseIOException, java.lang.String ); // address: 0
	{
	enter 
	invokestatic_lib long currentTimeMillis(  ) // System
	lstore 4
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
	ldc literal_2345:"-exception"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String ) // Connector
	checkcast_lib javax.microedition.io.file.FileConnection//javax.microedition.io.file.FileConnection javax.microedition.io.file.FileConnection javax.microedition.io.file.FileConnection
	astore_6 
	new_lib java.io.OutputStreamWriter//java.io.OutputStreamWriter java.io.OutputStreamWriter java.io.OutputStreamWriter
	dup 
	aload_6 
	invokeinterface interfacemethodref_372 // pc=1 guess=0
	getstatic_lib module:WhatsApp-9.class#0.static_2 // class#0
	invokespecial_lib java.io.OutputStreamWriter.<init> // pc=3
	astore_7 
	aload_7 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_3 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_2346:"?"
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
	ldc literal_2346:"?"
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
	ldc literal_2346:"?"
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
	getstatic_lib module:WhatsApp-9.class#0.static_5 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_2345:"-exception"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokeinterface interfacemethodref_373 // pc=2 guess=1
	aload_7 
	ifnull Label77
	aload_7 
	invokevirtual close( java.io.Writer ) // pc=1
Label77:
	aload_6 
	ifnull Label93
	aload_6 
	invokeinterface interfacemethodref_374 // pc=1 guess=2
	goto Label93
	astore 8
	aload_7 
	ifnull Label87
	aload_7 
	invokevirtual close( java.io.Writer ) // pc=1
Label87:
	aload_6 
	ifnull Label91
	aload_6 
	invokeinterface interfacemethodref_374 // pc=1 guess=2
Label91:
	aload 8
	athrow 
Label93:
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
	getstatic_lib module:WhatsApp-9.class#0.static_5 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokeinterface interfacemethodref_373 // pc=2 guess=1
	aload_6 
	ifnull Label120
	aload_6 
	invokeinterface interfacemethodref_374 // pc=1 guess=2
	goto Label120
	astore 10
	aload_6 
	ifnull Label118
	aload_6 
	invokeinterface interfacemethodref_374 // pc=1 guess=2
Label118:
	aload 10
	athrow 
Label120:
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_1 
	invokevirtual java.lang.String toIRIString( net.rim.device.api.io.URI ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_2347:"-journal"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String ) // Connector
	checkcast_lib javax.microedition.io.file.FileConnection//javax.microedition.io.file.FileConnection javax.microedition.io.file.FileConnection javax.microedition.io.file.FileConnection
	astore_6 
	aload_6 
	invokeinterface interfacemethodref_375 // pc=1 guess=3
	ifeq Label147
	aload_6 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	lload 4
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, long ) // pc=3
	getstatic_lib module:WhatsApp-9.class#0.static_5 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_2347:"-journal"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokeinterface interfacemethodref_373 // pc=2 guess=1
Label147:
	aload_6 
	ifnull Label159
	aload_6 
	invokeinterface interfacemethodref_374 // pc=1 guess=2
	return 
	astore 12
	aload_6 
	ifnull Label157
	aload_6 
	invokeinterface interfacemethodref_374 // pc=1 guess=2
Label157:
	aload 12
	athrow 
Label159:
	return 
	}


private final createPreparedStatements( com.whatsapp.client.SqliteMessageStore ); // address: 0
	{
	enter 
	ldc literal_2348:"INSERT INTO messages (key_remote_jid, key_from_me, key_id, remote_resource, status, needs_push, data, timestamp, media_url, media_mime_type, media_wa_type, media_size, media_name, latitude, longitude, media_filename, gap_behind, media_duration_seconds) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"
	astore_1 
	aload_0 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokeinterface interfacemethodref_376 // pc=2 guess=4
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	invokeinterface interfacemethodref_377 // pc=1 guess=5
	ldc literal_2349:"INSERT OR IGNORE INTO chat_history (jid, dirty, unsent_line) VALUES (?, '0', '')"
	astore_2 
	aload_0 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_2 
	invokeinterface interfacemethodref_376 // pc=2 guess=4
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokeinterface interfacemethodref_377 // pc=1 guess=5
	ldc literal_2350:"UPDATE chat_history SET dirty = ? WHERE jid = ?"
	astore_3 
	aload_0 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_3 
	invokeinterface interfacemethodref_376 // pc=2 guess=4
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	invokeinterface interfacemethodref_377 // pc=1 guess=5
	ldc literal_2351:"UPDATE chat_history SET subject = ? WHERE jid = ?"
	astore_4 
	aload_0 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_4 
	invokeinterface interfacemethodref_376 // pc=2 guess=4
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	invokeinterface interfacemethodref_377 // pc=1 guess=5
	ldc literal_2352:"UPDATE chat_history SET participants = ? WHERE jid = ?"
	astore_5 
	aload_0 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_5 
	invokeinterface interfacemethodref_376 // pc=2 guess=4
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	invokeinterface interfacemethodref_377 // pc=1 guess=5
	ldc literal_2353:"DELETE FROM chat_history WHERE jid = ?"
	astore_6 
	aload_0 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_6 
	invokeinterface interfacemethodref_376 // pc=2 guess=4
	putfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	invokeinterface interfacemethodref_377 // pc=1 guess=5
	ldc literal_2354:"DELETE FROM messages WHERE key_remote_jid = ?"
	astore_7 
	aload_0 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_7 
	invokeinterface interfacemethodref_376 // pc=2 guess=4
	putfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	invokeinterface interfacemethodref_377 // pc=1 guess=5
	ldc literal_2355:"SELECT key_remote_jid, key_from_me, key_id, remote_resource, status, needs_push, data, timestamp, media_url, media_mime_type, media_wa_type, media_size, media_name, latitude, longitude, thumb_image, gap_behind, media_filename, media_duration_seconds FROM messages WHERE key_remote_jid = ? AND timestamp < ? ORDER BY timestamp DESC LIMIT ?"
	astore 8
	aload_0 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload 8
	invokeinterface interfacemethodref_376 // pc=2 guess=4
	putfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	invokeinterface interfacemethodref_377 // pc=1 guess=5
	ldc literal_2356:"SELECT key_remote_jid, key_from_me, key_id, remote_resource, status, needs_push, data, timestamp, media_url, media_mime_type, media_wa_type, media_size, media_name, latitude, longitude, thumb_image, gap_behind, media_filename, media_duration_seconds FROM messages WHERE key_remote_jid = ? AND timestamp < ? AND media_filename NOT NULL AND media_wa_type IN (?,?,?) ORDER BY timestamp DESC LIMIT ?"
	astore 9
	aload_0 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload 9
	invokeinterface interfacemethodref_376 // pc=2 guess=4
	putfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	invokeinterface interfacemethodref_377 // pc=1 guess=5
	ldc literal_2357:"SELECT count(*) FROM messages WHERE key_remote_jid = ? AND media_filename NOT NULL AND media_wa_type IN (?,?,?)"
	astore 10
	aload_0 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload 10
	invokeinterface interfacemethodref_376 // pc=2 guess=4
	putfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	invokeinterface interfacemethodref_377 // pc=1 guess=5
	ldc literal_2358:"DELETE FROM messages WHERE key_remote_jid = ? AND key_from_me = ? AND key_id = ?"
	astore 11
	aload_0 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload 11
	invokeinterface interfacemethodref_376 // pc=2 guess=4
	putfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	invokeinterface interfacemethodref_377 // pc=1 guess=5
	return 
	}


private final net.rim.device.api.io.URI getDatabaseUri( com.whatsapp.client.SqliteMessageStore, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	astore_3 
	aload_3 
	getstatic_lib module:WhatsApp-9.class#0.static_38 // class#0
	bipush 2
	newarray_object_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	iconst_0 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	getstatic_lib module:WhatsApp-9.class#0.static_38 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	getstatic_lib module:WhatsApp-9.class#0.static_7 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	aastore 
	dup 
	iconst_1 
	getstatic_lib module:WhatsApp-9.class#0.static_6 // class#0
	aastore 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload_3 
	getstatic_lib module:WhatsApp-9.class#0.static_40 // class#0
	bipush 2
	newarray_object_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	iconst_0 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	getstatic_lib module:WhatsApp-9.class#0.static_39 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	getstatic_lib module:WhatsApp-9.class#0.static_8 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	aastore 
	dup 
	iconst_1 
	getstatic_lib module:WhatsApp-9.class#0.static_6 // class#0
	aastore 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	ldc literal_2359:"file:///"
	astore_4 
	aload_3 
	aload_1 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_arrayobject_lib String
	astore_5 
	iconst_0 
	istore_6 
Label56:
	iload_6 
	aload_5 
	arraylength 
	if_icmpge Label86
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_4 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_5 
	iload_6 
	aaload 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_2360:"/"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_4 
	aload_4 
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String ) // Connector
	checkcast_lib javax.microedition.io.file.FileConnection//javax.microedition.io.file.FileConnection javax.microedition.io.file.FileConnection javax.microedition.io.file.FileConnection
	astore_7 
	aload_7 
	invokeinterface interfacemethodref_375 // pc=1 guess=6
	ifne Label82
	aload_7 
	invokeinterface interfacemethodref_378 // pc=1 guess=7
Label82:
	aload_7 
	invokeinterface interfacemethodref_374 // pc=1 guess=8
	iinc 6 1
	goto Label56
Label86:
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_4 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib net.rim.device.api.io.URI create( java.lang.String ) // URI
	astore_6 
	aload_6 
	areturn 
	}


private final fillRuntimeDataStore( com.whatsapp.client.SqliteMessageStore ); // address: 0
	{
	enter 
	synch 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_1 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_380 // pc=1 guess=10
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ldc literal_2361:"SELECT jid,dirty,unsent_line,subject,participants FROM chat_history"
	invokeinterface interfacemethodref_376 // pc=2 guess=11
	astore_2 
	aload_2 
	invokeinterface interfacemethodref_377 // pc=1 guess=12
	aload_2 
	invokeinterface interfacemethodref_381 // pc=1 guess=13
	astore_3 
Label17:
	aload_3 
	invokeinterface interfacemethodref_382 // pc=1 guess=14
	ifeq Label75
	aload_3 
	invokeinterface interfacemethodref_383 // pc=1 guess=15
	astore_4 
	aload_4 
	iconst_0 
	invokevirtual java.lang.String getString( net.rim.device.api.database.Row, int ) // pc=2
	astore_5 
	aload_4 
	iconst_1 
	invokevirtual int getInteger( net.rim.device.api.database.Row, int ) // pc=2
	istore_6 
	aload_4 
	bipush 2
	invokevirtual java.lang.String getString( net.rim.device.api.database.Row, int ) // pc=2
	astore_7 
	aload_4 
	bipush 3
	invokevirtual java.lang.String getString( net.rim.device.api.database.Row, int ) // pc=2
	astore 8
	aload_4 
	bipush 4
	invokevirtual java.lang.String getString( net.rim.device.api.database.Row, int ) // pc=2
	astore 9
	aload 8
	ifnull Label59
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_5 
	aconst_null 
	iconst_0 
	aload 8
	iconst_0 
	invokenonvirtual_lib .routine_4366 // pc=6
	astore 10
	aload 9
	ifnull Label59
	aload_0 
	aload 10
	aload 9
	invokespecial com.whatsapp.client.SqliteMessageStore.fillParticipants // pc=3
Label59:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_5 
	invokenonvirtual_lib .routine_4788 // pc=2
	astore 10
	aload 10
	iload_6 
	iconst_1 
	if_icmpne Label69
	iconst_1 
	goto Label70
Label69:
	iconst_0 
Label70:
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload 10
	aload_7 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	goto Label17
Label75:
	aload_3 
	invokeinterface interfacemethodref_384 // pc=1 guess=16
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual_short .virtual_6 // idx=6 pc=1
	astore_4 
	aload_4 
	invokevirtual java.util.Enumeration elements( java.util.Hashtable ) // pc=1
	astore_5 
Label83:
	aload_5 
	invokeinterface interfacemethodref_385 // pc=1 guess=17
	ifne Label87
	goto_w Label161
Label87:
	aload_5 
	invokeinterface interfacemethodref_386 // pc=1 guess=18
	checkcast_lib com.whatsapp.client.ChatHistory//module:WhatsApp-6.class#13 module:WhatsApp-6.class#13 module:WhatsApp-6.class#13
	astore_6 
	aload_6 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual boolean isEmpty( java.util.Vector ) // pc=1
	ifne Label96
	goto Label83
Label96:
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	invokeinterface interfacemethodref_387 // pc=1 guess=19
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	iconst_1 
	aload_6 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_388 // pc=3 guess=20
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	bipush 2
	lipush 9223372036854775807
	invokeinterface interfacemethodref_389 // pc=4 guess=21
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	bipush 3
	bipush 26
	invokeinterface interfacemethodref_390 // pc=3 guess=22
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	invokeinterface interfacemethodref_381 // pc=1 guess=13
	astore_3 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_7 
Label118:
	aload_3 
	invokeinterface interfacemethodref_382 // pc=1 guess=14
	ifeq Label144
	aload_3 
	invokeinterface interfacemethodref_383 // pc=1 guess=15
	astore 8
	aload_0 
	aload 8
	invokespecial com.whatsapp.client.SqliteMessageStore.messageRowToObject // pc=2
	astore 9
	aload 9
	getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	ifnull Label140
	aload 9
	getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	stringlength 
	iipush 48000
	if_icmple Label140
	aload_1 
	aload 9
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	goto Label118
Label140:
	aload_7 
	aload 9
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	goto Label118
Label144:
	aload_7 
	invokevirtual int size( java.util.Vector ) // pc=1
	iconst_1 
	isub 
	istore 8
Label149:
	iload 8
	ifge Label152
	goto_w Label83
Label152:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_7 
	iload 8
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-15.class#17 module:WhatsApp-15.class#17 module:WhatsApp-15.class#17
	invokevirtual_short .virtual_11 // idx=11 pc=2
	pop 
	iinc 8 -1
	goto Label149
Label161:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual_short .virtual_13 // idx=13 pc=1
	pop 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_391 // pc=1 guess=23
	aload_1 
	invokevirtual int size( java.util.Vector ) // pc=1
	ifle Label195
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.SqliteMessageStore.deleteMessagesBatch // pc=2
	return 
	astore_2 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_392 // pc=1 guess=24
	goto Label178
	astore_3 
Label178:
	aload_0 
	aload_2 
	ldc literal_2362:"fillRuntimeDataStore"
	invokespecial com.whatsapp.client.SqliteMessageStore.throwableHandler // pc=3
	aload_2 
	athrow 
	astore_2 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_392 // pc=1 guess=24
	goto Label189
	astore_3 
Label189:
	aload_0 
	aload_2 
	ldc literal_2362:"fillRuntimeDataStore"
	invokespecial com.whatsapp.client.SqliteMessageStore.throwableHandler // pc=3
	aload_2 
	athrow 
Label195:
	return 
	}


private final fillParticipants( com.whatsapp.client.SqliteMessageStore, module:WhatsApp-6.class#15, java.lang.String ); // address: 0
	{
	enter 
	iconst_0 
	istore_3 
	aload_2 
	stringlength 
	istore_5 
	iload_5 
	ifne Label9
	return 
Label9:
	iload_3 
	iload_5 
	if_icmpge Label35
	aload_2 
	bipush 32
	iload_3 
	invokenonvirtual_lib java.lang.String.indexOf // pc=3
	istore_4 
	iload_4 
	bipush -1
	if_icmpne Label22
	iload_5 
	istore_4 
Label22:
	aload_2 
	iload_3 
	iload_4 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	astore_6 
	aload_1 
	aload_6 
	invokenonvirtual_lib .routine_6041 // pc=2
	iload_4 
	iconst_1 
	iadd 
	istore_3 
	goto Label9
Label35:
	aload_1 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	invokenonvirtual_lib .routine_6119 // pc=3
	return 
	}


private final module:WhatsApp-15.class#17 messageRowToObject( com.whatsapp.client.SqliteMessageStore, net.rim.device.api.database.Row ); // address: 0
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
	new_lib com.whatsapp.client.FunXMPP$FMessage$Key//module:WhatsApp-15.class#19 module:WhatsApp-15.class#19 module:WhatsApp-15.class#19
	dup 
	aload_2 
	iload_3 
	aload_4 
	invokespecial_lib .routine_3558 // pc=4
	astore_5 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_5 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib WeakReference//java.lang.ref.WeakReference java.lang.ref.WeakReference java.lang.ref.WeakReference
	astore_6 
	aload_6 
	ifnull Label39
	aload_6 
	invokevirtual java.lang.Object get( java.lang.ref.Reference ) // pc=1
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-15.class#17 module:WhatsApp-15.class#17 module:WhatsApp-15.class#17
	astore_7 
	aload_7 
	ifnull Label39
	aload_7 
	areturn 
Label39:
	aload_1 
	bipush 3
	invokevirtual java.lang.String getString( net.rim.device.api.database.Row, int ) // pc=2
	astore_7 
	aload_1 
	bipush 4
	invokevirtual int getInteger( net.rim.device.api.database.Row, int ) // pc=2
	istore 8
	aload_1 
	bipush 6
	invokevirtual java.lang.String getString( net.rim.device.api.database.Row, int ) // pc=2
	astore 9
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	ifeq Label68
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	aload 9
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	ldc literal_2363:"UTF-8"
	invokespecial_lib java.lang.String.<init> // pc=3
	astore 9
	goto Label68
	astore 10
	new_lib RuntimeException//java.lang.RuntimeException java.lang.RuntimeException java.lang.RuntimeException
	dup 
	aload 10
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	invokespecial_lib java.lang.RuntimeException.<init> // pc=2
	athrow 
Label68:
	aload_1 
	bipush 7
	invokevirtual long getLong( net.rim.device.api.database.Row, int ) // pc=2
	lstore 10
	aload_1 
	bipush 8
	invokevirtual java.lang.String getString( net.rim.device.api.database.Row, int ) // pc=2
	astore 12
	aload_1 
	bipush 9
	invokevirtual java.lang.String getString( net.rim.device.api.database.Row, int ) // pc=2
	astore 13
	aload_1 
	bipush 10
	invokevirtual java.lang.String getString( net.rim.device.api.database.Row, int ) // pc=2
	astore 14
	aload_1 
	bipush 11
	invokevirtual int getInteger( net.rim.device.api.database.Row, int ) // pc=2
	istore 15
	aload_1 
	bipush 12
	invokevirtual java.lang.String getString( net.rim.device.api.database.Row, int ) // pc=2
	astore 16
	aload_1 
	bipush 13
	invokevirtual double getDouble( net.rim.device.api.database.Row, int ) // pc=2
	isreal 
	lstore 17
	aload_1 
	bipush 14
	invokevirtual double getDouble( net.rim.device.api.database.Row, int ) // pc=2
	isreal 
	lstore 19
	aload_1 
	bipush 16
	invokevirtual int getInteger( net.rim.device.api.database.Row, int ) // pc=2
	ifeq Label108
	iconst_1 
	goto Label109
Label108:
	iconst_0 
Label109:
	istore 21
	aload_1 
	bipush 17
	invokevirtual java.lang.String getString( net.rim.device.api.database.Row, int ) // pc=2
	astore 22
	aload_1 
	bipush 18
	invokevirtual java.lang.Object getObject( net.rim.device.api.database.Row, int ) // pc=2
	astore 23
	aload 23
	ifnull Label125
	aload 23
	checkcastbranch_lib 
	invokevirtual long longValue( java.lang.Long ) // pc=1
	l2i 
	goto Label126
Label125:
	iconst_0 
Label126:
	istore 24
	new_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-15.class#17 module:WhatsApp-15.class#17 module:WhatsApp-15.class#17
	dup 
	aload_5 
	invokespecial_lib .routine_2314 // pc=2
	astore 25
	aload 25
	aload_7 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload 25
	iload 8
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload 25
	aload 9
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload 25
	lload 10
	lputfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload 25
	aload 12
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload 25
	aload 13
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload 25
	aload 14
	invokestatic_lib module:WhatsApp-15.class#17.routine_2430(  ) // class#17
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload 25
	iload 15
	i2l 
	lputfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload 25
	aload 16
	putfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	aload 25
	iload 24
	putfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload 25
	isreal 
	lload 17
	lputfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload 25
	isreal 
	lload 19
	lputfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	aload 25
	iload 21
	putfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	new_lib com.whatsapp.client.MediaData//module:WhatsApp-21.class#3 module:WhatsApp-21.class#3 module:WhatsApp-21.class#3
	dup 
	aload 25
	invokespecial_lib .routine_5962 // pc=2
	astore 26
	aload 22
	ifnull Label187
	aload 26
	aload 22
	iconst_0 
	invokenonvirtual_lib .routine_5313 // pc=3
	pop 
Label187:
	aload 25
	aload 26
	putfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload 25
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	new_lib WeakReference//java.lang.ref.WeakReference java.lang.ref.WeakReference java.lang.ref.WeakReference
	dup 
	aload 25
	invokespecial_lib java.lang.ref.WeakReference.<init> // pc=2
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload 25
	areturn 
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
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_380 // pc=1 guess=25
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	invokeinterface interfacemethodref_387 // pc=1 guess=26
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	iconst_1 
	aload_3 
	invokeinterface interfacemethodref_388 // pc=3 guess=27
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	invokeinterface interfacemethodref_393 // pc=1 guess=28
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	invokeinterface interfacemethodref_387 // pc=1 guess=26
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	iconst_1 
	aload_3 
	invokeinterface interfacemethodref_388 // pc=3 guess=27
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	invokeinterface interfacemethodref_393 // pc=1 guess=28
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_391 // pc=1 guess=29
	iinc 2 1
	goto Label6
	astore_2 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_392 // pc=1 guess=30
	goto Label42
	astore_3 
Label42:
	aload_0 
	aload_2 
	ldc literal_2364:"deleteChatHistory"
	invokespecial com.whatsapp.client.SqliteMessageStore.throwableHandler // pc=3
Label46:
	return 
	}


private final putMessagesBatch( com.whatsapp.client.SqliteMessageStore, java.util.Vector ); // address: 0
	{
	enter 
	synch 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnonnull Label5
	goto_w Label123
Label5:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_380 // pc=1 guess=59
	aload_1 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_2 
	iconst_0 
	istore_3 
Label12:
	iload_3 
	iload_2 
	if_icmplt Label16
	goto_w Label111
Label16:
	aload_1 
	iload_3 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-15.class#17 module:WhatsApp-15.class#17 module:WhatsApp-15.class#17
	astore_4 
	aload_4 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	astore_5 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokeinterface interfacemethodref_387 // pc=1 guess=60
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iconst_1 
	aload_5 
	invokeinterface interfacemethodref_388 // pc=3 guess=61
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokeinterface interfacemethodref_393 // pc=1 guess=62
	aload_4 
	getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	checkcast_lib com.whatsapp.client.MediaData//module:WhatsApp-21.class#3 module:WhatsApp-21.class#3 module:WhatsApp-21.class#3
	astore_6 
	aload_6 
	ifnull Label49
	aload_4 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifne Label46
	aload_6 
	invokenonvirtual_lib .routine_4820 // pc=1
	ifeq Label49
Label46:
	aload_6 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	goto Label50
Label49:
	aconst_null 
Label50:
	astore_7 
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
	aload_4 
	getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_4 
	lgetfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_4 
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_4 
	getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_4 
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	invokestatic_lib module:WhatsApp-15.class#17.routine_2534(  ) // class#17
	aload_4 
	lgetfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_4 
	getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	aload_4 
	lgetfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_4 
	lgetfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	aload_7 
	aload_4 
	getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_4 
	getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	invokespecial com.whatsapp.client.SqliteMessageStore.executeMessageInsertStatement // pc=23
	iload_3 
	iconst_1 
	iadd 
	bipush 40
	irem 
	ifne Label109
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_391 // pc=1 guess=63
	sipush 10000
	i2l 
	invokestatic_lib sleep( long ) // Thread
	goto Label107
	astore 8
Label107:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_380 // pc=1 guess=59
Label109:
	iinc 3 1
	goto_w Label12
Label111:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_391 // pc=1 guess=63
	return 
	astore_2 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_392 // pc=1 guess=64
	goto Label119
	astore_3 
Label119:
	aload_0 
	aload_2 
	ldc literal_2365:"putMessagesBatch"
	invokespecial com.whatsapp.client.SqliteMessageStore.throwableHandler // pc=3
Label123:
	return 
	}


private final setDirtyBatch( com.whatsapp.client.SqliteMessageStore, java.util.Hashtable ); // address: 0
	{
	enter 
	synch 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnonnull Label5
	goto_w Label54
Label5:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_380 // pc=1 guess=65
	aload_1 
	invokevirtual java.util.Enumeration keys( java.util.Hashtable ) // pc=1
	astore_2 
Label10:
	aload_2 
	invokeinterface interfacemethodref_385 // pc=1 guess=66
	ifeq Label42
	aload_2 
	invokeinterface interfacemethodref_386 // pc=1 guess=67
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore_3 
	aload_1 
	aload_3 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib Boolean//java.lang.Boolean java.lang.Boolean java.lang.Boolean
	invokevirtual boolean booleanValue( java.lang.Boolean ) // pc=1
	istore_4 
	iload_4 
	ifeq Label27
	ldc literal_2339:"1"
	goto Label28
Label27:
	ldc literal_2340:"0"
Label28:
	astore_5 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	invokeinterface interfacemethodref_387 // pc=1 guess=68
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	iconst_1 
	aload_5 
	invokeinterface interfacemethodref_388 // pc=3 guess=69
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	bipush 2
	aload_3 
	invokeinterface interfacemethodref_388 // pc=3 guess=69
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	invokeinterface interfacemethodref_393 // pc=1 guess=70
	goto Label10
Label42:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_391 // pc=1 guess=71
	return 
	astore_2 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_392 // pc=1 guess=72
	goto Label50
	astore_3 
Label50:
	aload_0 
	aload_2 
	ldc literal_2366:"setDirtyBatch"
	invokespecial com.whatsapp.client.SqliteMessageStore.throwableHandler // pc=3
Label54:
	return 
	}


private final updateParticipantsBatch( com.whatsapp.client.SqliteMessageStore, java.util.Hashtable ); // address: 0
	{
	enter 
	synch 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnull Label50
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_380 // pc=1 guess=73
	aload_1 
	invokevirtual java.util.Enumeration keys( java.util.Hashtable ) // pc=1
	astore_2 
Label9:
	aload_2 
	invokeinterface interfacemethodref_385 // pc=1 guess=74
	ifeq Label38
	aload_2 
	invokeinterface interfacemethodref_386 // pc=1 guess=75
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore_3 
	aload_1 
	aload_3 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	astore_4 
	aload_0 
	aload_4 
	invokespecial com.whatsapp.client.SqliteMessageStore.concatStringVector // pc=2
	astore_5 
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	invokeinterface interfacemethodref_387 // pc=1 guess=76
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	iconst_1 
	aload_5 
	invokeinterface interfacemethodref_388 // pc=3 guess=77
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	bipush 2
	aload_3 
	invokeinterface interfacemethodref_388 // pc=3 guess=77
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	invokeinterface interfacemethodref_393 // pc=1 guess=78
	goto Label9
Label38:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_391 // pc=1 guess=79
	return 
	astore_2 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_392 // pc=1 guess=80
	goto Label46
	astore_3 
Label46:
	aload_0 
	aload_2 
	ldc literal_2367:"updateParticipantsBatch"
	invokespecial com.whatsapp.client.SqliteMessageStore.throwableHandler // pc=3
Label50:
	return 
	}


private final java.lang.String concatStringVector( com.whatsapp.client.SqliteMessageStore, java.util.Vector ); // address: 0
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
	invokeinterface interfacemethodref_385 // pc=1 guess=81
	ifeq Label24
	aload_2 
	invokeinterface interfacemethodref_386 // pc=1 guess=82
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


private final deleteMessagesBatch( com.whatsapp.client.SqliteMessageStore, java.util.Vector ); // address: 0
	{
	enter 
	synch 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnull Label44
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_380 // pc=1 guess=83
	aload_1 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_2 
	iconst_0 
	istore_3 
Label11:
	iload_3 
	iload_2 
	if_icmpge Label32
	aload_1 
	iload_3 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-15.class#17 module:WhatsApp-15.class#17 module:WhatsApp-15.class#17
	astore_4 
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
	invokespecial com.whatsapp.client.SqliteMessageStore.executeMessageDeleteStatement // pc=4
	iinc 3 1
	goto Label11
Label32:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_391 // pc=1 guess=84
	return 
	astore_2 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_392 // pc=1 guess=85
	goto Label40
	astore_3 
Label40:
	aload_0 
	aload_2 
	ldc literal_2368:"deleteMessagesBatch"
	invokespecial com.whatsapp.client.SqliteMessageStore.throwableHandler // pc=3
Label44:
	return 
	}


private final messagesReceivedBatch( com.whatsapp.client.SqliteMessageStore, java.util.Vector ); // address: 0
	{
	enter 
	synch 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnull Label38
	aload_1 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_2 
	iconst_0 
	istore_3 
Label9:
	iload_3 
	iload_2 
	if_icmpge Label38
	aload_1 
	iload_3 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-15.class#17 module:WhatsApp-15.class#17 module:WhatsApp-15.class#17
	astore_4 
	aload_0 
	ldc literal_2369:"UPDATE messages SET status=? WHERE key_remote_jid = ? AND key_from_me = ? AND key_id = ?"
	aload_4 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokestatic_lib java.lang.String toString( int ) // Integer
	aload_4 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_4 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifeq Label31
	ldc literal_2339:"1"
	goto Label32
Label31:
	ldc literal_2340:"0"
Label32:
	aload_4 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokespecial com.whatsapp.client.SqliteMessageStore.executeStatement // pc=6
	iinc 3 1
	goto Label9
Label38:
	return 
	}


private final executeStatement( com.whatsapp.client.SqliteMessageStore, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_380 // pc=1 guess=86
	aload_1 
	ifnull Label37
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokeinterface interfacemethodref_376 // pc=2 guess=87
	astore_6 
	aload_6 
	invokeinterface interfacemethodref_377 // pc=1 guess=88
	aload_2 
	ifnull Label17
	aload_6 
	iconst_1 
	aload_2 
	invokeinterface interfacemethodref_388 // pc=3 guess=89
Label17:
	aload_3 
	ifnull Label23
	aload_6 
	bipush 2
	aload_3 
	invokeinterface interfacemethodref_388 // pc=3 guess=89
Label23:
	aload_4 
	ifnull Label29
	aload_6 
	bipush 3
	aload_4 
	invokeinterface interfacemethodref_388 // pc=3 guess=89
Label29:
	aload_5 
	ifnull Label35
	aload_6 
	bipush 4
	aload_5 
	invokeinterface interfacemethodref_388 // pc=3 guess=89
Label35:
	aload_6 
	invokeinterface interfacemethodref_393 // pc=1 guess=90
Label37:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_391 // pc=1 guess=91
	return 
	astore_6 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_392 // pc=1 guess=92
	goto Label45
	astore_7 
Label45:
	aload_0 
	aload_6 
	ldc literal_2370:"executeStatement"
	invokespecial com.whatsapp.client.SqliteMessageStore.throwableHandler // pc=3
	return 
	}


private final executeStatement( com.whatsapp.client.SqliteMessageStore, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_380 // pc=1 guess=93
	aload_1 
	ifnull Label35
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokeinterface interfacemethodref_376 // pc=2 guess=94
	astore_6 
	aload_6 
	invokeinterface interfacemethodref_377 // pc=1 guess=95
	aload_6 
	iconst_1 
	iload_2 
	invokeinterface interfacemethodref_390 // pc=3 guess=96
	aload_3 
	ifnull Label21
	aload_6 
	bipush 2
	aload_3 
	invokeinterface interfacemethodref_388 // pc=3 guess=97
Label21:
	aload_4 
	ifnull Label27
	aload_6 
	bipush 3
	aload_4 
	invokeinterface interfacemethodref_388 // pc=3 guess=97
Label27:
	aload_5 
	ifnull Label33
	aload_6 
	bipush 4
	aload_5 
	invokeinterface interfacemethodref_388 // pc=3 guess=97
Label33:
	aload_6 
	invokeinterface interfacemethodref_393 // pc=1 guess=98
Label35:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_391 // pc=1 guess=99
	return 
	astore_6 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_392 // pc=1 guess=100
	goto Label43
	astore_7 
Label43:
	aload_0 
	aload_6 
	ldc literal_2370:"executeStatement"
	invokespecial com.whatsapp.client.SqliteMessageStore.throwableHandler // pc=3
	return 
	}


private final executeMessageInsertStatement( com.whatsapp.client.SqliteMessageStore, java.lang.String, boolean, java.lang.String, java.lang.String, int, boolean, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, double, double, java.lang.String, boolean, int ); // address: 0
	{
	enter 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	invokeinterface interfacemethodref_387 // pc=1 guess=101
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	iconst_1 
	aload_1 
	invokeinterface interfacemethodref_388 // pc=3 guess=102
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	bipush 2
	iload_2 
	invokeinterface interfacemethodref_395 // pc=3 guess=103
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	bipush 3
	aload_3 
	invokeinterface interfacemethodref_388 // pc=3 guess=102
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	bipush 4
	aload_4 
	invokeinterface interfacemethodref_388 // pc=3 guess=102
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	bipush 5
	iload_5 
	invokeinterface interfacemethodref_390 // pc=3 guess=104
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	bipush 6
	iload_6 
	invokeinterface interfacemethodref_395 // pc=3 guess=103
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	bipush 7
	aload_7 
	invokeinterface interfacemethodref_388 // pc=3 guess=102
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	bipush 8
	lload 8
	invokeinterface interfacemethodref_389 // pc=4 guess=105
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	bipush 9
	aload 10
	invokeinterface interfacemethodref_388 // pc=3 guess=102
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	bipush 10
	aload 11
	invokeinterface interfacemethodref_388 // pc=3 guess=102
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	bipush 11
	aload 12
	invokeinterface interfacemethodref_388 // pc=3 guess=102
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	bipush 12
	lload 13
	invokeinterface interfacemethodref_389 // pc=4 guess=105
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	bipush 13
	aload 15
	invokeinterface interfacemethodref_388 // pc=3 guess=102
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	bipush 14
	isreal 
	lload 16
	invokeinterface interfacemethodref_396 // pc=4 guess=106
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	bipush 15
	isreal 
	lload 18
	invokeinterface interfacemethodref_396 // pc=4 guess=106
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	bipush 16
	aload 20
	invokeinterface interfacemethodref_388 // pc=3 guess=102
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	bipush 17
	iload 21
	invokeinterface interfacemethodref_395 // pc=3 guess=103
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	bipush 18
	iload 22
	invokeinterface interfacemethodref_390 // pc=3 guess=104
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	invokeinterface interfacemethodref_393 // pc=1 guess=107
	return 
	}


private final executeMessageDeleteStatement( com.whatsapp.client.SqliteMessageStore, java.lang.String, boolean, java.lang.String ); // address: 0
	{
	enter 
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	invokeinterface interfacemethodref_387 // pc=1 guess=108
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	iconst_1 
	aload_1 
	invokeinterface interfacemethodref_388 // pc=3 guess=109
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	bipush 2
	iload_2 
	invokeinterface interfacemethodref_395 // pc=3 guess=110
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	bipush 3
	aload_3 
	invokeinterface interfacemethodref_388 // pc=3 guess=109
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	invokeinterface interfacemethodref_393 // pc=1 guess=111
	return 
	}


private final updateSchema( com.whatsapp.client.SqliteMessageStore ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_380 // pc=1 guess=112
	aload_0 
	ldc literal_2371:"chat_history_jid_index"
	invokespecial com.whatsapp.client.SqliteMessageStore.indexExists // pc=2
	ifne Label20
	lipush -4528648054740815434
	ldc literal_2372:"Schema update: removing chat_history"
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	invokestatic_lib boolean logEvent( long, byte[] ) // EventLogger
	pop 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ldc literal_2373:"DROP TABLE IF EXISTS chat_history"
	invokeinterface interfacemethodref_376 // pc=2 guess=113
	astore_1 
	aload_1 
	invokeinterface interfacemethodref_377 // pc=1 guess=114
	aload_1 
	invokeinterface interfacemethodref_393 // pc=1 guess=115
Label20:
	aload_0 
	ldc literal_2374:"chat_history"
	invokespecial com.whatsapp.client.SqliteMessageStore.tableExists // pc=2
	ifne Label38
	lipush -4528648054740815434
	ldc literal_2375:"Schema update: creating chat_history"
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	invokestatic_lib boolean logEvent( long, byte[] ) // EventLogger
	pop 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ldc literal_2376:"CREATE TABLE chat_history (jid TEXT, dirty INTEGER, unsent_line TEXT, subject TEXT, participants TEXT)"
	invokeinterface interfacemethodref_376 // pc=2 guess=113
	astore_1 
	aload_1 
	invokeinterface interfacemethodref_377 // pc=1 guess=114
	aload_1 
	invokeinterface interfacemethodref_393 // pc=1 guess=115
	goto Label46
Label38:
	aload_0 
	ldc literal_2374:"chat_history"
	ldc literal_2377:"subject TEXT"
	invokespecial com.whatsapp.client.SqliteMessageStore.addColumn // pc=3
	aload_0 
	ldc literal_2374:"chat_history"
	ldc literal_2378:"participants TEXT"
	invokespecial com.whatsapp.client.SqliteMessageStore.addColumn // pc=3
Label46:
	aload_0 
	ldc literal_2371:"chat_history_jid_index"
	invokespecial com.whatsapp.client.SqliteMessageStore.indexExists // pc=2
	ifne Label63
	lipush -4528648054740815434
	ldc literal_2379:"Schema update: creating chat_history_jid_index"
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	invokestatic_lib boolean logEvent( long, byte[] ) // EventLogger
	pop 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ldc literal_2380:"CREATE UNIQUE INDEX chat_history_jid_index on chat_history (jid)"
	invokeinterface interfacemethodref_376 // pc=2 guess=113
	astore_1 
	aload_1 
	invokeinterface interfacemethodref_377 // pc=1 guess=114
	aload_1 
	invokeinterface interfacemethodref_393 // pc=1 guess=115
Label63:
	aload_0 
	ldc literal_2381:"messages_key_index"
	invokespecial com.whatsapp.client.SqliteMessageStore.indexExists // pc=2
	ifne Label80
	lipush -4528648054740815434
	ldc literal_2382:"Schema update: removing messages"
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	invokestatic_lib boolean logEvent( long, byte[] ) // EventLogger
	pop 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ldc literal_2383:"DROP TABLE IF EXISTS messages"
	invokeinterface interfacemethodref_376 // pc=2 guess=113
	astore_1 
	aload_1 
	invokeinterface interfacemethodref_377 // pc=1 guess=114
	aload_1 
	invokeinterface interfacemethodref_393 // pc=1 guess=115
Label80:
	aload_0 
	ldc literal_2384:"messages"
	invokespecial com.whatsapp.client.SqliteMessageStore.tableExists // pc=2
	ifne Label98
	lipush -4528648054740815434
	ldc literal_2385:"Schema update: creating messages"
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	invokestatic_lib boolean logEvent( long, byte[] ) // EventLogger
	pop 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ldc literal_2386:"CREATE TABLE messages (key_remote_jid TEXT, key_from_me INTEGER, key_id TEXT, status INTEGER, needs_push INTEGER, data TEXT, timestamp INTEGER, media_url TEXT, media_mime_type TEXT, media_wa_type TEXT, media_size INTEGER, media_name TEXT, latitude REAL, longitude REAL, thumb_image TEXT, gap_behind INTEGER, media_filename TEXT, remote_resource TEXT, media_duration_seconds INTEGER)"
	invokeinterface interfacemethodref_376 // pc=2 guess=113
	astore_1 
	aload_1 
	invokeinterface interfacemethodref_377 // pc=1 guess=114
	aload_1 
	invokeinterface interfacemethodref_393 // pc=1 guess=115
	goto Label110
Label98:
	aload_0 
	ldc literal_2384:"messages"
	ldc literal_2387:"media_filename TEXT"
	invokespecial com.whatsapp.client.SqliteMessageStore.addColumn // pc=3
	aload_0 
	ldc literal_2384:"messages"
	ldc literal_2388:"remote_resource TEXT"
	invokespecial com.whatsapp.client.SqliteMessageStore.addColumn // pc=3
	aload_0 
	ldc literal_2384:"messages"
	ldc literal_2389:"media_duration_seconds INTEGER"
	invokespecial com.whatsapp.client.SqliteMessageStore.addColumn // pc=3
Label110:
	aload_0 
	ldc literal_2381:"messages_key_index"
	invokespecial com.whatsapp.client.SqliteMessageStore.indexExists // pc=2
	ifne Label127
	lipush -4528648054740815434
	ldc literal_2390:"Schema update: creating messages_key_index"
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	invokestatic_lib boolean logEvent( long, byte[] ) // EventLogger
	pop 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ldc literal_2391:"CREATE UNIQUE INDEX messages_key_index on messages (key_remote_jid, key_from_me, key_id)"
	invokeinterface interfacemethodref_376 // pc=2 guess=113
	astore_1 
	aload_1 
	invokeinterface interfacemethodref_377 // pc=1 guess=114
	aload_1 
	invokeinterface interfacemethodref_393 // pc=1 guess=115
Label127:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_391 // pc=1 guess=116
	return 
	astore_1 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_392 // pc=1 guess=117
	goto Label135
	astore_2 
Label135:
	aload_0 
	aload_1 
	ldc literal_2392:"schemaUpdate"
	invokespecial com.whatsapp.client.SqliteMessageStore.throwableHandler // pc=3
	aload_1 
	athrow 
	}


private final addColumn( com.whatsapp.client.SqliteMessageStore, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_2393:"ALTER TABLE "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_2394:" ADD COLUMN "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokeinterface interfacemethodref_376 // pc=2 guess=118
	astore_3 
	aload_3 
	invokeinterface interfacemethodref_377 // pc=1 guess=119
	aload_3 
	invokeinterface interfacemethodref_393 // pc=1 guess=120
	lipush -4528648054740815434
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_2395:"Schema update: created "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_2396:" in table "
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


private final boolean tableExists( com.whatsapp.client.SqliteMessageStore, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_2397:"table"
	aload_1 
	invokespecial com.whatsapp.client.SqliteMessageStore.xExists // pc=3
	ireturn 
	}


private final boolean indexExists( com.whatsapp.client.SqliteMessageStore, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_2398:"index"
	aload_1 
	invokespecial com.whatsapp.client.SqliteMessageStore.xExists // pc=3
	ireturn 
	}


private final boolean xExists( com.whatsapp.client.SqliteMessageStore, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_2399:"SELECT name FROM sqlite_master WHERE type='"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_2400:"' AND name='"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_2401:"'"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokeinterface interfacemethodref_376 // pc=2 guess=121
	astore_3 
	aload_3 
	invokeinterface interfacemethodref_377 // pc=1 guess=122
	aload_3 
	invokeinterface interfacemethodref_381 // pc=1 guess=123
	astore_4 
	aload_4 
	invokeinterface interfacemethodref_382 // pc=1 guess=124
	istore_5 
	aload_3 
	invokeinterface interfacemethodref_397 // pc=1 guess=125
	iload_5 
	ireturn 
	astore_4 
	iconst_0 
	ireturn 
	}


private final startAsyncCommitThread( com.whatsapp.client.SqliteMessageStore ); // address: 0
	{
	enter 
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	ifnull Label4
	return 
Label4:
	aload_0 
	new_lib Long//java.lang.Long java.lang.Long java.lang.Long
	dup 
	invokestatic_lib long currentTimeMillis(  ) // System
	invokespecial_lib java.lang.Long.<init> // pc=3
	putfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	new_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	dup 
	new_lib com.whatsapp.client.SqliteMessageStore$1//module:WhatsApp-27.class#17 module:WhatsApp-27.class#17 module:WhatsApp-27.class#17
	dup 
	aload_0 
	invokespecial_lib .routine_7256 // pc=2
	invokespecial_lib java.lang.Thread.<init> // pc=2
	astore_1 
	aload_1 
	iconst_1 
	invokevirtual setPriority( java.lang.Thread, int ) // pc=2
	aload_1 
	invokevirtual start( java.lang.Thread ) // pc=1
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final java.lang.String toString( com.whatsapp.client.SqliteMessageStore ); // address: 0
	{
	enter_narrow 
	synch 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	sipush 337
	invokestatic_lib module:WhatsApp-26.class#12.routine_2452(  ) // class#12
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_2322:" (db "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnonnull Label14
	ldc literal_2323:"disabled"
	goto Label15
Label14:
	ldc literal_2324:"enabled"
Label15:
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_2325:")"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}


public final connectDatabase( com.whatsapp.client.SqliteMessageStore ); // address: 0
	{
	enter 
	synch 
	invokestatic_lib net.rim.device.api.system.Application getApplication(  ) // Application
	invokevirtual int getProcessId( net.rim.device.api.system.Application ) // pc=1
	istore_1 
	invokestatic_lib java.lang.Thread currentThread(  ) // Thread
	invokevirtual java.lang.String getName( java.lang.Thread ) // pc=1
	astore_2 
	lipush -4528648054740815434
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_2326:"Sqlite connect pid "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_2327:" thread "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	invokestatic_lib boolean logEvent( long, byte[] ) // EventLogger
	pop 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnull Label37
	lipush -4528648054740815434
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_2328:"Sqlite database already open pid "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	invokestatic_lib boolean logEvent( long, byte[] ) // EventLogger
	pop 
	return 
Label37:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	astore_3 
	aload_3 
	invokestatic_lib module:WhatsApp-31.class#3.routine_10426(  ) // class#3
	ifne Label54
	lipush -4528648054740815434
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_2329:"Sqlite connect: fs root does not exist - "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_3 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	invokestatic_lib boolean logEvent( long, byte[] ) // EventLogger
	pop 
	return 
Label54:
	aload_0 
	invokestatic_lib net.rim.device.api.system.CodeSigningKey get( java.lang.Object ) // CodeSigningKey
	astore_4 
	aload_0 
	aload_3 
	getstatic_lib module:WhatsApp-9.class#0.static_5 // class#0
	invokespecial com.whatsapp.client.SqliteMessageStore.getDatabaseUri // pc=3
	astore_5 
	new_lib net.rim.device.api.database.DatabaseSecurityOptions//net.rim.device.api.database.DatabaseSecurityOptions net.rim.device.api.database.DatabaseSecurityOptions net.rim.device.api.database.DatabaseSecurityOptions
	dup 
	aload_4 
	invokespecial_lib net.rim.device.api.database.DatabaseSecurityOptions.<init> // pc=2
	astore_6 
	invokestatic_lib long currentTimeMillis(  ) // System
	lstore 7
	aload_5 
	invokestatic_lib boolean exists( net.rim.device.api.io.URI ) // DatabaseFactory
	ifeq Label82
	aload_5 
	aload_6 
	invokestatic_lib encrypt( net.rim.device.api.io.URI, net.rim.device.api.database.DatabaseSecurityOptions ) // DatabaseFactory
	goto Label82
	astore 9
	aload_0 
	aload_5 
	aload 9
	ldc literal_2330:"encrypt"
	invokespecial com.whatsapp.client.SqliteMessageStore.archiveDatabase // pc=4
Label82:
	aload_0 
	aload_5 
	aload_6 
	invokestatic_lib net.rim.device.api.database.Database openOrCreate( net.rim.device.api.io.URI, net.rim.device.api.database.DatabaseSecurityOptions ) // DatabaseFactory
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	goto Label99
	astore 9
	aload_0 
	aload_5 
	aload 9
	ldc literal_2331:"openOrCreate"
	invokespecial com.whatsapp.client.SqliteMessageStore.archiveDatabase // pc=4
	aload_0 
	aload_5 
	aload_6 
	invokestatic_lib net.rim.device.api.database.Database openOrCreate( net.rim.device.api.io.URI, net.rim.device.api.database.DatabaseSecurityOptions ) // DatabaseFactory
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
Label99:
	aload_0 
	invokespecial com.whatsapp.client.SqliteMessageStore.updateSchema // pc=1
	aload_0 
	invokespecial com.whatsapp.client.SqliteMessageStore.createPreparedStatements // pc=1
	aload_0 
	invokespecial com.whatsapp.client.SqliteMessageStore.fillRuntimeDataStore // pc=1
	aload_0 
	aconst_null 
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	return 
	astore_5 
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.disconnectDatabase // pc=1
	aload_5 
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	astore_6 
	aload_0 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_5 
	invokenonvirtual_lib java.lang.Object.getClass // pc=1
	invokevirtual java.lang.String getName( java.lang.Class ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_2332:":"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_6 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	lipush -4528648054740815434
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_2326:"Sqlite connect pid "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_2333:" "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_5 
	invokenonvirtual_lib java.lang.Object.getClass // pc=1
	invokevirtual java.lang.String getName( java.lang.Class ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_2334:": "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_6 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	invokestatic_lib boolean logEvent( long, byte[] ) // EventLogger
	pop 
	return 
	}


public final disconnectDatabase( com.whatsapp.client.SqliteMessageStore ); // address: 0
	{
	enter_narrow 
	synch 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnull Label15
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_379 // pc=1 guess=9
	goto Label12
	astore_1 
	aload_0 
	aload_1 
	ldc literal_2335:"disconnectDatabase"
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
	enter_narrow 
	synch 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	astore_1 
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.disconnectDatabase // pc=1
	aload_0 
	aload_1 
	getstatic_lib module:WhatsApp-9.class#0.static_5 // class#0
	invokespecial com.whatsapp.client.SqliteMessageStore.getDatabaseUri // pc=3
	invokestatic_lib delete( net.rim.device.api.io.URI ) // DatabaseFactory
	return 
	}


public final int countDirty( com.whatsapp.client.SqliteMessageStore ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual_short .virtual_3 // idx=3 pc=1
	ireturn 
	}


public final deleteChatHistory( com.whatsapp.client.SqliteMessageStore, java.lang.String, boolean ); // address: 0
	{
	enter 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	dup 
	astore_3 
	monitorenter 
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_1 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	astore_4 
	aload_0 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	iconst_0 
	istore_5 
Label17:
	iload_5 
	aload_4 
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label37
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	iload_5 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-15.class#17 module:WhatsApp-15.class#17 module:WhatsApp-15.class#17
	astore_6 
	aload_6 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label35
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
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
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_1 
	iload_2 
	invokevirtual_short .virtual_4 // idx=4 pc=3
	return 
	}


public final java.lang.String getAndClearUnsentLine( com.whatsapp.client.SqliteMessageStore, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_1 
	invokevirtual_short .virtual_5 // idx=5 pc=2
	astore_2 
	aload_2 
	areturn 
	}


public final java.util.Hashtable getChats( com.whatsapp.client.SqliteMessageStore ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual_short .virtual_6 // idx=6 pc=1
	areturn 
	}


public final java.util.Vector getMessages( com.whatsapp.client.SqliteMessageStore, java.lang.String, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_1 
	aload_2 
	invokevirtual_short .virtual_7 // idx=7 pc=3
	areturn 
	}


public final java.util.Vector getMessagesBefore( com.whatsapp.client.SqliteMessageStore, java.lang.String, module:WhatsApp-15.class#17, int ); // address: 0
	{
	enter 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_1 
	aload_2 
	iload_3 
	invokevirtual_short .virtual_8 // idx=8 pc=4
	astore_4 
	aload_4 
	invokevirtual int size( java.util.Vector ) // pc=1
	iload_3 
	if_icmplt Label13
	aload_4 
	areturn 
Label13:
	aload_4 
	invokevirtual int size( java.util.Vector ) // pc=1
	ifle Label29
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
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-15.class#17 module:WhatsApp-15.class#17 module:WhatsApp-15.class#17
	astore_2 
Label29:
	aload_0 
	aload_0 
	astore_5 
	monitorenter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnonnull Label36
	goto_w Label86
Label36:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_380 // pc=1 guess=31
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	invokeinterface interfacemethodref_387 // pc=1 guess=32
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	iconst_1 
	aload_1 
	invokeinterface interfacemethodref_388 // pc=3 guess=33
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	bipush 2
	aload_2 
	ifnonnull Label50
	lipush 9223372036854775807
	goto Label52
Label50:
	aload_2 
	lgetfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
Label52:
	invokeinterface interfacemethodref_389 // pc=4 guess=34
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	bipush 3
	iload_3 
	invokeinterface interfacemethodref_390 // pc=3 guess=35
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	invokeinterface interfacemethodref_381 // pc=1 guess=36
	astore_6 
Label60:
	aload_6 
	invokeinterface interfacemethodref_382 // pc=1 guess=37
	ifeq Label74
	aload_6 
	invokeinterface interfacemethodref_383 // pc=1 guess=38
	astore_7 
	aload_0 
	aload_7 
	invokespecial com.whatsapp.client.SqliteMessageStore.messageRowToObject // pc=2
	astore 8
	aload_4 
	aload 8
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	goto Label60
Label74:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_391 // pc=1 guess=39
	goto Label86
	astore_6 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_392 // pc=1 guess=40
	goto Label82
	astore_7 
Label82:
	aload_0 
	aload_6 
	ldc literal_2336:"getMessagesBefore"
	invokespecial com.whatsapp.client.SqliteMessageStore.throwableHandler // pc=3
Label86:
	aload_5 
	monitorexit 
	goto Label94
	astore 9
	aload_5 
	monitorexit 
	aload 9
	athrow 
Label94:
	aload_4 
	areturn 
	}


public final java.util.Vector getMMSMessagesBefore( com.whatsapp.client.SqliteMessageStore, java.lang.String, module:WhatsApp-15.class#17, int ); // address: 0
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
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_1 
	aload_2 
	iload_3 
	invokevirtual_short .virtual_9 // idx=9 pc=4
	aload_5 
	monitorexit 
	areturn 
Label19:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_380 // pc=1 guess=41
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	invokeinterface interfacemethodref_387 // pc=1 guess=42
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	iconst_1 
	aload_1 
	invokeinterface interfacemethodref_388 // pc=3 guess=43
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	bipush 2
	aload_2 
	ifnonnull Label33
	lipush 9223372036854775807
	goto Label35
Label33:
	aload_2 
	lgetfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
Label35:
	invokeinterface interfacemethodref_389 // pc=4 guess=44
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	bipush 3
	iconst_1 
	invokestatic_lib module:WhatsApp-15.class#17.routine_2534(  ) // class#17
	invokeinterface interfacemethodref_388 // pc=3 guess=43
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	bipush 4
	bipush 3
	invokestatic_lib module:WhatsApp-15.class#17.routine_2534(  ) // class#17
	invokeinterface interfacemethodref_388 // pc=3 guess=43
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	bipush 5
	bipush 2
	invokestatic_lib module:WhatsApp-15.class#17.routine_2534(  ) // class#17
	invokeinterface interfacemethodref_388 // pc=3 guess=43
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	bipush 6
	iload_3 
	invokeinterface interfacemethodref_390 // pc=3 guess=45
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	invokeinterface interfacemethodref_381 // pc=1 guess=46
	astore_6 
Label58:
	aload_6 
	invokeinterface interfacemethodref_382 // pc=1 guess=47
	ifeq Label72
	aload_6 
	invokeinterface interfacemethodref_383 // pc=1 guess=48
	astore_7 
	aload_0 
	aload_7 
	invokespecial com.whatsapp.client.SqliteMessageStore.messageRowToObject // pc=2
	astore 8
	aload_4 
	aload 8
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	goto Label58
Label72:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_391 // pc=1 guess=49
	goto Label84
	astore_6 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_392 // pc=1 guess=50
	goto Label80
	astore_7 
Label80:
	aload_0 
	aload_6 
	ldc literal_2337:"getMMSMessagesBefore"
	invokespecial com.whatsapp.client.SqliteMessageStore.throwableHandler // pc=3
Label84:
	aload_5 
	monitorexit 
	goto Label92
	astore 9
	aload_5 
	monitorexit 
	aload 9
	athrow 
Label92:
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
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_1 
	invokevirtual_short .virtual_10 // idx=10 pc=2
	aload_3 
	monitorexit 
	ireturn 
Label15:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_380 // pc=1 guess=51
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	invokeinterface interfacemethodref_387 // pc=1 guess=52
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	iconst_1 
	aload_1 
	invokeinterface interfacemethodref_388 // pc=3 guess=53
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	bipush 2
	iconst_1 
	invokestatic_lib module:WhatsApp-15.class#17.routine_2534(  ) // class#17
	invokeinterface interfacemethodref_388 // pc=3 guess=53
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	bipush 3
	bipush 3
	invokestatic_lib module:WhatsApp-15.class#17.routine_2534(  ) // class#17
	invokeinterface interfacemethodref_388 // pc=3 guess=53
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	bipush 4
	bipush 2
	invokestatic_lib module:WhatsApp-15.class#17.routine_2534(  ) // class#17
	invokeinterface interfacemethodref_388 // pc=3 guess=53
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	invokeinterface interfacemethodref_381 // pc=1 guess=54
	astore_4 
	aload_4 
	invokeinterface interfacemethodref_394 // pc=1 guess=55
	ifeq Label47
	iconst_0 
	istore_2 
	goto Label52
Label47:
	aload_4 
	invokeinterface interfacemethodref_383 // pc=1 guess=56
	iconst_0 
	invokevirtual int getInteger( net.rim.device.api.database.Row, int ) // pc=2
	istore_2 
Label52:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_391 // pc=1 guess=57
	goto Label64
	astore_4 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_392 // pc=1 guess=58
	goto Label60
	astore_5 
Label60:
	aload_0 
	aload_4 
	ldc literal_2337:"getMMSMessagesBefore"
	invokespecial com.whatsapp.client.SqliteMessageStore.throwableHandler // pc=3
Label64:
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
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_1 
	invokevirtual_short .virtual_15 // idx=15 pc=2
	return 
	}


public final setUnsentLine( com.whatsapp.client.SqliteMessageStore, java.lang.String, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_1 
	aload_2 
	invokevirtual_short .virtual_16 // idx=16 pc=3
	return 
	}


public final tickle( com.whatsapp.client.SqliteMessageStore, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_1 
	invokevirtual_short .virtual_17 // idx=17 pc=2
	return 
	}


public final java.util.Enumeration getOfflineMessages( com.whatsapp.client.SqliteMessageStore ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual_short .virtual_19 // idx=19 pc=1
	areturn 
	}


public final messageSaved( com.whatsapp.client.SqliteMessageStore, module:WhatsApp-15.class#17 ); // address: 0
	{
	enter 
	synch 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnull Label24
	aload_0 
	ldc literal_2338:"UPDATE messages SET media_filename=? WHERE key_remote_jid = ? AND key_from_me = ? AND key_id = ?"
	aload_1 
	getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	checkcast_lib com.whatsapp.client.MediaData//module:WhatsApp-21.class#3 module:WhatsApp-21.class#3 module:WhatsApp-21.class#3
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifeq Label19
	ldc literal_2339:"1"
	goto Label20
Label19:
	ldc literal_2340:"0"
Label20:
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokespecial com.whatsapp.client.SqliteMessageStore.executeStatement // pc=6
Label24:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_1 
	invokevirtual_short .virtual_21 // idx=21 pc=2
	return 
	}


public final messageMediaDurationUpdated( com.whatsapp.client.SqliteMessageStore, module:WhatsApp-15.class#17 ); // address: 0
	{
	enter 
	synch 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnull Label22
	aload_0 
	ldc literal_2341:"UPDATE messages SET media_duration_seconds=? WHERE key_remote_jid = ? AND key_from_me = ? AND key_id = ?"
	aload_1 
	getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifeq Label17
	ldc literal_2339:"1"
	goto Label18
Label17:
	ldc literal_2340:"0"
Label18:
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokespecial com.whatsapp.client.SqliteMessageStore.executeStatement // pc=6
Label22:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_1 
	invokevirtual_short .virtual_22 // idx=22 pc=2
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
	aload_0 
	aload_1 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	aconst_null 
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.disconnectDatabase // pc=1
	aload_1 
	stringlength 
	ifle Label15
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.connectDatabase // pc=1
Label15:
	return 
	}


public final rootChanged( com.whatsapp.client.SqliteMessageStore, int, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_2 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label6
	return 
Label6:
	iload_1 
	ifne Label11
	aload_0 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.setPersistentFilesystem // pc=2
Label11:
	iload_1 
	iconst_1 
	if_icmpne Label16
	aload_0 
	invokenonvirtual com.whatsapp.client.SqliteMessageStore.disconnectDatabase // pc=1
Label16:
	return 
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
	new_lib com.whatsapp.client.RuntimeMessageStore//module:WhatsApp-26.class#14 module:WhatsApp-26.class#14 module:WhatsApp-26.class#14
	dup 
	invokespecial_lib .routine_4863 // pc=1
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
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
	areturn_field .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	}


public final messageReceived( com.whatsapp.client.SqliteMessageStore, module:WhatsApp-15.class#17 ); // address: 0
	{
	enter 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_1 
	invokevirtual_short .virtual_20 // idx=20 pc=2
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	dup 
	astore_2 
	monitorenter 
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	aload_1 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_0 
	invokespecial com.whatsapp.client.SqliteMessageStore.startAsyncCommitThread // pc=1
	aload_2 
	monitorexit 
	return 
	astore_3 
	aload_2 
	monitorexit 
	aload_3 
	athrow 
	}


public final boolean putMessage( com.whatsapp.client.SqliteMessageStore, module:WhatsApp-15.class#17 ); // address: 0
	{
	enter 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	dup 
	astore_2 
	monitorenter 
	aload_1 
	getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	ifeq Label17
	aload_0 
	new_lib Long//java.lang.Long java.lang.Long java.lang.Long
	dup 
	invokestatic_lib long currentTimeMillis(  ) // System
	iipush 60000
	i2l 
	ladd 
	invokespecial_lib java.lang.Long.<init> // pc=3
	putfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
Label17:
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	aload_1 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_0 
	invokespecial com.whatsapp.client.SqliteMessageStore.startAsyncCommitThread // pc=1
	aload_2 
	monitorexit 
	goto Label30
	astore_3 
	aload_2 
	monitorexit 
	aload_3 
	athrow 
Label30:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_1 
	invokevirtual_short .virtual_11 // idx=11 pc=2
	istore_2 
	iload_2 
	ireturn 
	}


public final deleteMessage( com.whatsapp.client.SqliteMessageStore, module:WhatsApp-15.class#17 ); // address: 0
	{
	enter 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	dup 
	astore_2 
	monitorenter 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
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
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_1 
	invokevirtual_short .virtual_12 // idx=12 pc=2
	return 
	}


public final setDirty( com.whatsapp.client.SqliteMessageStore, java.lang.String, boolean ); // address: 0
	{
	enter 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_1 
	iload_2 
	invokevirtual_short .virtual_14 // idx=14 pc=3
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	dup 
	astore_3 
	monitorenter 
	aload_0_getfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	aload_1 
	iload_2 
	ifeq Label15
	getstatic_lib TRUE // Boolean
	goto Label16
Label15:
	getstatic_lib FALSE // Boolean
Label16:
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


public final java.util.Hashtable getJidsPendingUpdate( com.whatsapp.client.SqliteMessageStore ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual_short .virtual_13 // idx=13 pc=1
	areturn 
	}


public final java.lang.String getDefaultRoot( com.whatsapp.client.SqliteMessageStore ); // address: 0
	{
	enter_narrow 
	getstatic_lib module:WhatsApp-9.class#0.static_40 // class#0
	invokestatic_lib module:WhatsApp-31.class#3.routine_10426(  ) // class#3
	ifeq Label8
	getstatic_lib module:WhatsApp-9.class#0.static_40 // class#0
	astore_1 
	aload_1 
	areturn 
Label8:
	getstatic_lib module:WhatsApp-9.class#0.static_38 // class#0
	invokestatic_lib module:WhatsApp-31.class#3.routine_10426(  ) // class#3
	ifeq Label15
	getstatic_lib module:WhatsApp-9.class#0.static_38 // class#0
	astore_1 
	aload_1 
	areturn 
Label15:
	getstatic_lib module:WhatsApp-9.class#0.static_136 // class#0
	astore_1 
	aload_1 
	areturn 
	}


public final module:WhatsApp-6.class#15 addGroupChat( com.whatsapp.client.SqliteMessageStore, java.lang.String, java.lang.String, int, java.lang.String, int ); // address: 0
	{
	enter 
	synch 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnull Label40
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_380 // pc=1 guess=126
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokeinterface interfacemethodref_387 // pc=1 guess=127
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iconst_1 
	aload_1 
	invokeinterface interfacemethodref_388 // pc=3 guess=128
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokeinterface interfacemethodref_393 // pc=1 guess=129
	aload_4 
	ifnull Label28
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	invokeinterface interfacemethodref_387 // pc=1 guess=127
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	iconst_1 
	aload_4 
	invokeinterface interfacemethodref_388 // pc=3 guess=128
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	bipush 2
	aload_1 
	invokeinterface interfacemethodref_388 // pc=3 guess=128
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	invokeinterface interfacemethodref_393 // pc=1 guess=129
Label28:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_391 // pc=1 guess=130
	goto Label40
	astore_6 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_392 // pc=1 guess=131
	goto Label36
	astore_7 
Label36:
	aload_0 
	aload_6 
	ldc literal_2342:"addGroupChat"
	invokespecial com.whatsapp.client.SqliteMessageStore.throwableHandler // pc=3
Label40:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_1 
	aload_2 
	iload_3 
	aload_4 
	iload_5 
	invokenonvirtual_lib .routine_4366 // pc=6
	astore_6 
	aload_6 
	new_lib com.whatsapp.client.SqliteMessageStore$2//module:WhatsApp-28.class#1 module:WhatsApp-28.class#1 module:WhatsApp-28.class#1
	dup 
	aload_0 
	aload_1 
	invokespecial_lib .routine_1184 // pc=3
	invokenonvirtual_lib .routine_6013 // pc=2
	aload_6 
	areturn 
	}


public final module:WhatsApp-6.class#13 addTempGroupChat( com.whatsapp.client.SqliteMessageStore, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_1 
	invokevirtual_short .virtual_30 // idx=30 pc=2
	areturn 
	}


public final module:WhatsApp-6.class#15 getGroupChat( com.whatsapp.client.SqliteMessageStore, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_1 
	invokevirtual_short .virtual_31 // idx=31 pc=2
	areturn 
	}


public final setChatState( com.whatsapp.client.SqliteMessageStore, java.lang.String, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_1 
	iload_2 
	invokevirtual_short .virtual_32 // idx=32 pc=3
	return 
	}


public final long getLastGroupsUpdate( com.whatsapp.client.SqliteMessageStore ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual_short .virtual_33 // idx=33 pc=1
	lreturn 
	}


public final setLastGroupsUpdate( com.whatsapp.client.SqliteMessageStore, long ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	lload 1
	invokevirtual_short .virtual_34 // idx=34 pc=3
	return 
	}


public final net.rim.device.api.collection.ReadableList getApplicationMessageList( com.whatsapp.client.SqliteMessageStore ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual_short .virtual_18 // idx=18 pc=1
	areturn 
	}

}
