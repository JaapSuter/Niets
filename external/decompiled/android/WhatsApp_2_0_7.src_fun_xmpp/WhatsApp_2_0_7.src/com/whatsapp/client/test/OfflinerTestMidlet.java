/*    */ package com.whatsapp.client.test;
/*    */ 
/*    */ import com.whatsapp.api.util.Utilities;
/*    */ import com.whatsapp.client.FunXMPP.FMessage;
/*    */ import com.whatsapp.client.FunXMPP.FMessage.Key;
/*    */ import com.whatsapp.client.OfflineMessages;
/*    */ import java.util.Vector;
/*    */ import javax.microedition.lcdui.Command;
/*    */ import javax.microedition.lcdui.CommandListener;
/*    */ import javax.microedition.lcdui.Display;
/*    */ import javax.microedition.lcdui.Displayable;
/*    */ import javax.microedition.lcdui.Form;
/*    */ import javax.microedition.lcdui.StringItem;
/*    */ import javax.microedition.midlet.MIDlet;
/*    */ 
/*    */ public class OfflinerTestMidlet extends MIDlet
/*    */   implements CommandListener
/*    */ {
/* 39 */   OfflineMessages _offliners = new OfflineMessages();
/*    */   Vector _storedMessages;
/* 43 */   Vector _inStore = new Vector();
/*    */ 
/* 45 */   Command dumpStateCmd = new Command("get state", 4, 1);
/* 46 */   Command putCmd = new Command("put one", 4, 1);
/* 47 */   Command put20Cmd = new Command("put 20", 4, 2);
/* 48 */   Command removeCmd = new Command("remove one", 2, 1);
/* 49 */   Command popCmd = new Command("populate", 4, 2);
/*    */ 
/* 51 */   StringItem _stateString = new StringItem("current state:", "");
/* 52 */   StringItem _lastActString = new StringItem("last action:", "");
/*    */   Form form;
/*    */ 
/*    */   public void startApp()
/*    */   {
/* 58 */     Display d = Display.getDisplay(this);
/*    */ 
/* 60 */     this.form = new Form("offliner test");
/* 61 */     this.form.addCommand(this.dumpStateCmd);
/* 62 */     this.form.addCommand(this.putCmd);
/* 63 */     this.form.addCommand(this.put20Cmd);
/* 64 */     this.form.addCommand(this.removeCmd);
/* 65 */     this.form.addCommand(this.popCmd);
/* 66 */     this.form.setCommandListener(this);
/*    */ 
/* 68 */     this.form.append(this._lastActString);
/* 69 */     this.form.append(this._stateString);
/*    */ 
/* 71 */     d.setCurrent(this.form);
/*    */ 
/* 73 */     this._storedMessages = MessageFactory.getMessages(50);
/* 74 */     Utilities.logData(this._offliners.dumpState());
/*    */   }
/*    */ 
/*    */   public void pauseApp() {
/*    */   }
/*    */ 
/*    */   public void destroyApp(boolean unconditional) {
/*    */   }
/*    */ 
/*    */   public void commandAction(Command c, Displayable dsplbl) {
/* 84 */     FunXMPP.FMessage curMsg = null;
/* 85 */     if (c == this.putCmd) {
/* 86 */       curMsg = (FunXMPP.FMessage)this._storedMessages.elementAt(0);
/* 87 */       this._offliners.add(curMsg);
/* 88 */       this._inStore.addElement(curMsg);
/* 89 */       Utilities.logData(this._offliners.dumpState());
/*    */ 
/* 91 */       this._lastActString.setText("added " + curMsg.key.id);
/* 92 */     } else if (c == this.put20Cmd) {
/* 93 */       for (int i = 0; i < 20; i++) {
/* 94 */         curMsg = (FunXMPP.FMessage)this._storedMessages.elementAt(i);
/* 95 */         this._offliners.add(curMsg);
/* 96 */         this._inStore.addElement(curMsg);
/*    */       }
/*    */ 
/* 99 */       this._lastActString.setText("added 20 ending in " + curMsg.key.id);
/* 100 */     } else if (c == this.dumpStateCmd) {
/* 101 */       this._stateString.setText(this._offliners.dumpState());
/* 102 */     } else if (c == this.removeCmd)
/*    */     {
/* 104 */       curMsg = (FunXMPP.FMessage)this._inStore.elementAt(0);
/* 105 */       Utilities.logData("trying to remove element with id " + curMsg.key.id);
/* 106 */       this._lastActString.setText("remove " + curMsg.key.id);
/* 107 */       this._offliners.remove(curMsg);
/* 108 */       this._inStore.removeElement(curMsg);
/* 109 */     } else if (c == this.popCmd) {
/* 110 */       this._offliners.populate();
/* 111 */       this._lastActString.setText("populated from store");
/*    */     }
/*    */   }
/*    */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.test.OfflinerTestMidlet
 * JD-Core Version:    0.6.0
 */