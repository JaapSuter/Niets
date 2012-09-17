/*    */ package com.whatsapp.client.test;
/*    */ 
/*    */ import com.whatsapp.api.util.Utilities;
/*    */ import com.whatsapp.client.AsyncFileMessageStore;
/*    */ import com.whatsapp.client.ChatHistory;
/*    */ import com.whatsapp.client.FunXMPP.FMessage;
/*    */ import com.whatsapp.client.FunXMPP.FMessage.Key;
/*    */ import com.whatsapp.client.MessageStore;
/*    */ import java.util.Vector;
/*    */ import javax.microedition.lcdui.Alert;
/*    */ import javax.microedition.lcdui.Command;
/*    */ import javax.microedition.lcdui.CommandListener;
/*    */ import javax.microedition.lcdui.Display;
/*    */ import javax.microedition.lcdui.Displayable;
/*    */ import javax.microedition.lcdui.Form;
/*    */ import javax.microedition.lcdui.StringItem;
/*    */ import javax.microedition.midlet.MIDlet;
/*    */ import javax.microedition.midlet.MIDletStateChangeException;
/*    */ 
/*    */ public class MessageStoreTestMidlet extends MIDlet
/*    */   implements CommandListener
/*    */ {
/*    */   Form form;
/* 28 */   Command writeCmd = new Command("write", 4, 1);
/* 29 */   Command readCmd = new Command("read", 4, 1);
/* 30 */   Command deleteCmd = new Command("delete", 3, 1);
/* 31 */   Command readBeforeCmd = new Command("read before", 4, 2);
/* 32 */   Command deleteHistoryCmd = new Command("delete hist", 3, 2);
/* 33 */   Command getChatsCmd = new Command("get chats", 4, 2);
/* 34 */   Command findOfflineCmd = new Command("get offliners", 4, 2);
/*    */ 
/* 37 */   MessageStore mStore = new AsyncFileMessageStore();
/*    */ 
/* 39 */   Vector _storedMessages = null;
/*    */ 
/* 41 */   StringItem dispText = new StringItem("latest: ", "");
/*    */ 
/*    */   protected void startApp() throws MIDletStateChangeException {
/* 44 */     Display d = Display.getDisplay(this);
/*    */ 
/* 46 */     this.form = new Form("message store test");
/* 47 */     this.form.addCommand(this.writeCmd);
/* 48 */     this.form.addCommand(this.readCmd);
/* 49 */     this.form.addCommand(this.deleteCmd);
/* 50 */     this.form.addCommand(this.readBeforeCmd);
/* 51 */     this.form.addCommand(this.deleteHistoryCmd);
/* 52 */     this.form.addCommand(this.getChatsCmd);
/* 53 */     this.form.addCommand(this.findOfflineCmd);
/* 54 */     this.form.setCommandListener(this);
/* 55 */     this.form.append(this.dispText);
/* 56 */     d.setCurrent(this.form);
/*    */   }
/*    */ 
/*    */   protected void pauseApp()
/*    */   {
/*    */   }
/*    */ 
/*    */   protected void destroyApp(boolean bln)
/*    */     throws MIDletStateChangeException
/*    */   {
/*    */   }
/*    */ 
/*    */   public void commandAction(Command c, Displayable dsplbl)
/*    */   {
/* 70 */     if ((this._storedMessages == null) && ((c == this.readCmd) || (c == this.readBeforeCmd) || (c == this.deleteCmd) || (c == this.deleteHistoryCmd)))
/*    */     {
/* 72 */       Utilities.logData("no stored messages yet");
/* 73 */       Alert alert = new Alert("error");
/* 74 */       alert.setString("do write first");
/* 75 */       Display.getDisplay(this).setCurrent(alert, this.form);
/* 76 */       return;
/*    */     }
/*    */ 
/* 79 */     if (c == this.writeCmd) {
/* 80 */       this._storedMessages = MessageFactory.getMessages(5);
/* 81 */       FunXMPP.FMessage fmsg = null;
/* 82 */       for (int i = 0; i < 5; i++) {
/* 83 */         fmsg = (FunXMPP.FMessage)this._storedMessages.elementAt(i);
/* 84 */         Utilities.logData("storing fmsg with jid " + fmsg.key.remote_jid + " and data " + fmsg.data);
/* 85 */         this.mStore.putMessage(fmsg, null);
/*    */       }
/* 87 */       Utilities.logData("finished putting all messages");
/* 88 */       this.dispText.setText("write finished");
/*    */     }
/* 92 */     else if (c == this.readCmd) {
/* 93 */       String useJid = ((FunXMPP.FMessage)(FunXMPP.FMessage)this._storedMessages.elementAt(0)).key.remote_jid;
/* 94 */       Vector v = this.mStore.getMessages(useJid, "id-1");
/* 95 */       Utilities.logData("found " + v.size() + " messages for " + useJid);
/* 96 */       this.dispText.setText("found " + v.size() + " messages for " + useJid);
/*    */     }
/* 100 */     else if (c == this.deleteCmd) {
/* 101 */       int middle = this._storedMessages.size() / 2;
/* 102 */       FunXMPP.FMessage deleteThis = (FunXMPP.FMessage)this._storedMessages.elementAt(middle);
/* 103 */       Utilities.logData("attempting to delete middle message with id " + deleteThis.key.id + " and data " + deleteThis.data);
/*    */ 
/* 105 */       this.mStore.deleteMessage(deleteThis);
/* 106 */       this.dispText.setText("deleted " + deleteThis.key.id);
/* 107 */     } else if (c == this.readBeforeCmd) {
/* 108 */       FunXMPP.FMessage lastMsg = (FunXMPP.FMessage)this._storedMessages.lastElement();
/* 109 */       Vector v = this.mStore.getMessagesBefore(lastMsg.key.remote_jid, lastMsg, 3, null);
/* 110 */       Utilities.logData("found " + v.size() + " messages before last msg");
/* 111 */       for (int i = 0; i < v.size(); i++) {
/* 112 */         FunXMPP.FMessage curMsg = (FunXMPP.FMessage)v.elementAt(i);
/* 113 */         Utilities.logData("ID returned from getBefore: " + curMsg.key.id);
/*    */       }
/* 115 */     } else if (c == this.deleteHistoryCmd) {
/* 116 */       String useJid = ((FunXMPP.FMessage)(FunXMPP.FMessage)this._storedMessages.elementAt(0)).key.remote_jid;
/* 117 */       this.mStore.deleteChatHistory(useJid);
/* 118 */     } else if (c == this.getChatsCmd) {
/* 119 */       Vector v = this.mStore.getChats();
/* 120 */       Utilities.logData("getChats sees number of chats " + v.size());
/* 121 */       for (int i = 0; i < v.size(); i++) {
/* 122 */         ChatHistory curHist = (ChatHistory)v.elementAt(i);
/* 123 */         Utilities.logData("seeing chat jid " + curHist._jid);
/*    */       }
/* 125 */     } else if (c == this.findOfflineCmd) {
/* 126 */       Vector v = this.mStore.getAllOfflineMessages();
/* 127 */       Utilities.logData("found " + v.size() + " offline messages.");
/*    */     }
/*    */   }
/*    */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.test.MessageStoreTestMidlet
 * JD-Core Version:    0.6.0
 */