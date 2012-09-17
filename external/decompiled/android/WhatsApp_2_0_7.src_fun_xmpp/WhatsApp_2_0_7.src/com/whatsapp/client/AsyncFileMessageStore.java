/*     */ package com.whatsapp.client;
/*     */ 
/*     */ import com.whatsapp.api.util.AppManager;
/*     */ import com.whatsapp.api.util.Utilities;
/*     */ import java.util.Vector;
/*     */ 
/*     */ public class AsyncFileMessageStore extends CommonFileMessageStore
/*     */   implements MessageStore
/*     */ {
/*     */   private final Object _workerLock;
/*     */   private Vector _tasks;
/*     */   private Long _workerThreadStartTime;
/*     */   private boolean _errorFlag;
/*     */ 
/*     */   public AsyncFileMessageStore()
/*     */   {
/*  27 */     this._workerLock = new Object();
/*  28 */     this._tasks = new Vector();
/*  29 */     this._workerThreadStartTime = null;
/*  30 */     this._errorFlag = false;
/*     */   }
/*     */ 
/*     */   private void startAsyncWorkerThread()
/*     */   {
/* 185 */     if (this._workerThreadStartTime != null) {
/* 186 */       return;
/*     */     }
/* 188 */     this._workerThreadStartTime = new Long(System.currentTimeMillis());
/* 189 */     Thread thread = new Thread(new Runnable()
/*     */     {
/*     */       public void run()
/*     */       {
/*     */         try
/*     */         {
/*     */           while (true)
/*     */           {
/*     */             AsyncFileMessageStore.DBTask[] myTasks;
/* 194 */             synchronized (AsyncFileMessageStore.this._workerLock) {
/* 195 */               if (AsyncFileMessageStore.this._tasks.isEmpty()) {
/* 196 */                 AsyncFileMessageStore.access$1102(AsyncFileMessageStore.this, null);
/* 197 */                 break;
/*     */               }
/* 199 */               myTasks = new AsyncFileMessageStore.DBTask[AsyncFileMessageStore.this._tasks.size()];
/* 200 */               AsyncFileMessageStore.this._tasks.copyInto(myTasks);
/* 201 */               AsyncFileMessageStore.access$1002(AsyncFileMessageStore.this, new Vector());
/*     */             }
/*     */ 
/* 204 */             for (int i = 0; i < myTasks.length; i++) {
/* 205 */               AsyncFileMessageStore.DBTask curTask = myTasks[i];
/* 206 */               myTasks[i] = null;
/* 207 */               boolean taskResult = false;
/* 208 */               int j = 0;
/*     */               do {
/* 210 */                 taskResult = curTask.execute();
/* 211 */                 if (!taskResult) {
/* 212 */                   j++; if (j >= 7) {
/* 213 */                     Utilities.logData("DROP? giving up on db task " + curTask.toString());
/* 214 */                     AsyncFileMessageStore.access$1202(AsyncFileMessageStore.this, false);
/* 215 */                     break;
/*     */                   }
/* 217 */                   AsyncFileMessageStore.access$1202(AsyncFileMessageStore.this, true);
/* 218 */                   Utilities.logData("async with cur taskq progress " + (i + 1) + " of " + myTasks.length + " and latent " + AsyncFileMessageStore.this._tasks.size() + " failed and retrying on " + curTask.toString());
/*     */                   try
/*     */                   {
/* 221 */                     Thread.sleep(300L);
/*     */                   } catch (Exception x) {
/*     */                   }
/*     */                 } else {
/* 225 */                   AsyncFileMessageStore.access$1202(AsyncFileMessageStore.this, false);
/*     */ 
/* 227 */                   if (curTask._callback != null)
/* 228 */                     curTask._callback.operationCompleted();
/*     */                 }
/*     */               }
/* 231 */               while (!taskResult);
/*     */             }
/*     */           }
/*     */         } catch (Throwable t) {
/* 235 */           Utilities.logData("db worker thread blew up with " + t.toString());
/* 236 */           synchronized (AsyncFileMessageStore.this._workerLock) {
/* 237 */             AsyncFileMessageStore.access$1102(AsyncFileMessageStore.this, null);
/*     */           }
/*     */         }
/*     */       }
/*     */     });
/* 244 */     thread.start();
/*     */   }
/*     */ 
/*     */   private void addTaskAndKickOff(DBTask newTask) {
/* 248 */     synchronized (this._workerLock) {
/* 249 */       this._tasks.addElement(newTask);
/* 250 */       startAsyncWorkerThread();
/*     */     }
/*     */   }
/*     */ 
/*     */   public Vector getChats()
/*     */   {
/* 256 */     return super.getChats();
/*     */   }
/*     */ 
/*     */   public Vector getAllOfflineMessages() {
/* 260 */     return super.getAllOfflineMessages();
/*     */   }
/*     */ 
/*     */   public FunXMPP.FMessage getMessage(FunXMPP.FMessage.Key key) {
/* 264 */     return super.getMessage(key);
/*     */   }
/*     */ 
/*     */   public Vector getMessages(String jid, String sinceID) {
/* 268 */     return super.getMessages(jid, sinceID);
/*     */   }
/*     */ 
/*     */   public boolean putMessage(FunXMPP.FMessage fmsg, MessageStore.CompletionCallback callback) {
/* 272 */     if (AppManager.isForeground())
/*     */     {
/* 274 */       return false;
/*     */     }
/*     */ 
/* 277 */     addTaskAndKickOff(new PutMessageTask(fmsg, callback));
/* 278 */     return true;
/*     */   }
/*     */ 
/*     */   public boolean deleteMessage(FunXMPP.FMessage fmsg) {
/* 282 */     if (AppManager.isForeground())
/*     */     {
/* 284 */       return false;
/*     */     }
/* 286 */     addTaskAndKickOff(new DeleteMessageTask(fmsg));
/* 287 */     return true;
/*     */   }
/*     */ 
/*     */   public boolean updateMessageStatus(FunXMPP.FMessage fmsg, MessageStore.CompletionCallback callback) {
/* 291 */     if (AppManager.isForeground())
/*     */     {
/* 293 */       return false;
/*     */     }
/* 295 */     addTaskAndKickOff(new UpdateMessageStatusTask(fmsg, callback));
/* 296 */     return true;
/*     */   }
/*     */ 
/*     */   public boolean deleteChatHistory(String jid) {
/* 300 */     if (AppManager.isForeground())
/*     */     {
/* 302 */       return false;
/*     */     }
/* 304 */     addTaskAndKickOff(new DeleteHistoryTask(jid));
/* 305 */     return true;
/*     */   }
/*     */ 
/*     */   public boolean putMessageToTemp(FunXMPP.FMessage fmsg, MessageStore.CompletionCallback callback) {
/* 309 */     if (!AppManager.isForeground())
/*     */     {
/* 311 */       return false;
/*     */     }
/* 313 */     addTaskAndKickOff(new PutMessageToTempTask(fmsg, callback));
/* 314 */     return true;
/*     */   }
/*     */ 
/*     */   public FunXMPP.FMessage getTempMessage(FunXMPP.FMessage.Key key) {
/* 318 */     return super.getTempMessage(key);
/*     */   }
/*     */ 
/*     */   public boolean putGroupSubject(String gjid, String subject) {
/* 322 */     if (AppManager.isForeground())
/*     */     {
/* 324 */       return false;
/*     */     }
/* 326 */     addTaskAndKickOff(new PutGroupSubjectTask(gjid, subject));
/* 327 */     return true;
/*     */   }
/*     */ 
/*     */   public boolean addGroupUser(String gjid, String ujid) {
/* 331 */     if (AppManager.isForeground())
/*     */     {
/* 333 */       return false;
/*     */     }
/* 335 */     addTaskAndKickOff(new AddGroupUserTask(gjid, ujid));
/* 336 */     return true;
/*     */   }
/*     */ 
/*     */   public boolean removeGroupUser(String gjid, String ujid) {
/* 340 */     if (AppManager.isForeground())
/*     */     {
/* 342 */       return false;
/*     */     }
/* 344 */     addTaskAndKickOff(new RemoveGroupUserTask(gjid, ujid));
/* 345 */     return true;
/*     */   }
/*     */ 
/*     */   public boolean addMMSFilename(String MMSFilename, String scaledMMSFilename, MMSDownloader.MMSFilestoreCallback callback)
/*     */   {
/* 350 */     if (AppManager.isForeground())
/*     */     {
/* 352 */       return false;
/*     */     }
/* 354 */     addTaskAndKickOff(new AddMMSFilenameTask(MMSFilename, scaledMMSFilename, callback));
/* 355 */     return true;
/*     */   }
/*     */ 
/*     */   public boolean recentError() {
/* 359 */     return this._errorFlag;
/*     */   }
/*     */ 
/*     */   public int queueSize() {
/* 363 */     return this._tasks.size();
/*     */   }
/*     */ 
/*     */   private class AddMMSFilenameTask extends AsyncFileMessageStore.DBTask
/*     */   {
/*     */     private String _MMSFilename;
/*     */     private String _scaledMMSFilename;
/*     */     MMSDownloader.MMSFilestoreCallback _trueCallback;
/*     */ 
/*     */     public AddMMSFilenameTask(String MMSFilename, String scaledFilename, MMSDownloader.MMSFilestoreCallback callback)
/*     */     {
/* 171 */       super(null, callback);
/* 172 */       this._MMSFilename = MMSFilename;
/* 173 */       this._scaledMMSFilename = scaledFilename;
/* 174 */       this._trueCallback = callback;
/*     */     }
/*     */ 
/*     */     public boolean execute() {
/* 178 */       long res = AsyncFileMessageStore.this.addMMSFilename(this._MMSFilename, this._scaledMMSFilename);
/* 179 */       this._trueCallback.setOffset(res);
/* 180 */       return res != -1L;
/*     */     }
/*     */   }
/*     */ 
/*     */   private class RemoveGroupUserTask extends AsyncFileMessageStore.DBTask
/*     */   {
/*     */     private String _gjid;
/*     */     private String _ujid;
/*     */ 
/*     */     public RemoveGroupUserTask(String gjid, String ujid)
/*     */     {
/* 153 */       super();
/* 154 */       this._gjid = gjid;
/* 155 */       this._ujid = ujid;
/*     */     }
/*     */ 
/*     */     public boolean execute() {
/* 159 */       return AsyncFileMessageStore.this.removeGroupUser(this._gjid, this._ujid);
/*     */     }
/*     */   }
/*     */ 
/*     */   private class AddGroupUserTask extends AsyncFileMessageStore.DBTask
/*     */   {
/*     */     private String _gjid;
/*     */     private String _ujid;
/*     */ 
/*     */     public AddGroupUserTask(String gjid, String ujid)
/*     */     {
/* 140 */       super();
/* 141 */       this._gjid = gjid;
/* 142 */       this._ujid = ujid;
/*     */     }
/*     */ 
/*     */     public boolean execute() {
/* 146 */       return AsyncFileMessageStore.this.addGroupUser(this._gjid, this._ujid);
/*     */     }
/*     */   }
/*     */ 
/*     */   private class PutGroupSubjectTask extends AsyncFileMessageStore.DBTask
/*     */   {
/*     */     private String _gjid;
/*     */     private String _subject;
/*     */ 
/*     */     public PutGroupSubjectTask(String gjid, String subject)
/*     */     {
/* 127 */       super();
/* 128 */       this._gjid = gjid;
/* 129 */       this._subject = subject;
/*     */     }
/*     */ 
/*     */     public boolean execute() {
/* 133 */       return AsyncFileMessageStore.this.putGroupSubject(this._gjid, this._subject);
/*     */     }
/*     */   }
/*     */ 
/*     */   private class DeleteHistoryTask extends AsyncFileMessageStore.DBTask
/*     */   {
/*     */     private String _jid;
/*     */ 
/*     */     public DeleteHistoryTask(String jid)
/*     */     {
/* 115 */       super();
/* 116 */       this._jid = jid;
/*     */     }
/*     */ 
/*     */     public boolean execute() {
/* 120 */       return AsyncFileMessageStore.this.deleteChatHistory(this._jid);
/*     */     }
/*     */   }
/*     */ 
/*     */   private class DeleteMessageTask extends AsyncFileMessageStore.DBTask
/*     */   {
/*     */     private FunXMPP.FMessage _fmsg;
/*     */ 
/*     */     public DeleteMessageTask(FunXMPP.FMessage fmsg)
/*     */     {
/* 104 */       super();
/* 105 */       this._fmsg = fmsg;
/*     */     }
/*     */ 
/*     */     public boolean execute() {
/* 109 */       return AsyncFileMessageStore.this.deleteMessage(this._fmsg);
/*     */     }
/*     */   }
/*     */ 
/*     */   private class PutMessageToTempTask extends AsyncFileMessageStore.DBTask
/*     */   {
/*     */     private FunXMPP.FMessage _fmsg;
/*     */ 
/*     */     public PutMessageToTempTask(FunXMPP.FMessage fmsg, MessageStore.CompletionCallback callback)
/*     */     {
/*  93 */       super(null, callback);
/*  94 */       this._fmsg = fmsg;
/*     */     }
/*     */ 
/*     */     public boolean execute() {
/*  98 */       return AsyncFileMessageStore.this.putMessageToTemp(this._fmsg);
/*     */     }
/*     */   }
/*     */ 
/*     */   private class UpdateMessageStatusTask extends AsyncFileMessageStore.DBTask
/*     */   {
/*     */     private FunXMPP.FMessage _fmsg;
/*     */ 
/*     */     public UpdateMessageStatusTask(FunXMPP.FMessage fmsg, MessageStore.CompletionCallback callback)
/*     */     {
/*  80 */       super("update of " + fmsg.key + " to status " + fmsg.status, callback);
/*  81 */       this._fmsg = fmsg;
/*     */     }
/*     */ 
/*     */     public boolean execute() {
/*  85 */       return AsyncFileMessageStore.this.updateMessageStatus(this._fmsg);
/*     */     }
/*     */   }
/*     */ 
/*     */   private class PutMessageTask extends AsyncFileMessageStore.DBTask
/*     */   {
/*     */     private FunXMPP.FMessage _fmsg;
/*     */ 
/*     */     public PutMessageTask(FunXMPP.FMessage fmsg, MessageStore.CompletionCallback callback)
/*     */     {
/*  59 */       super("put of " + fmsg.key, callback);
/*  60 */       this._fmsg = fmsg;
/*     */     }
/*     */ 
/*     */     public boolean execute() {
/*  64 */       Runtime r = Runtime.getRuntime();
/*  65 */       long startMem = r.freeMemory();
/*  66 */       boolean res = AsyncFileMessageStore.this.putMessage(this._fmsg);
/*  67 */       long endMem = r.freeMemory();
/*     */ 
/*  73 */       return res;
/*     */     }
/*     */   }
/*     */ 
/*     */   private abstract class DBTask
/*     */   {
/*     */     public String _debugDesc;
/*     */     public MessageStore.CompletionCallback _callback;
/*     */ 
/*     */     public DBTask()
/*     */     {
/*     */     }
/*     */ 
/*     */     public DBTask(String desc, MessageStore.CompletionCallback callback)
/*     */     {
/*  41 */       this._debugDesc = desc;
/*  42 */       this._callback = callback;
/*     */     }
/*     */     public abstract boolean execute();
/*     */ 
/*     */     public String toString() {
/*  48 */       if (this._debugDesc != null) {
/*  49 */         return this._debugDesc;
/*     */       }
/*  51 */       return super.toString();
/*     */     }
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.AsyncFileMessageStore
 * JD-Core Version:    0.6.0
 */