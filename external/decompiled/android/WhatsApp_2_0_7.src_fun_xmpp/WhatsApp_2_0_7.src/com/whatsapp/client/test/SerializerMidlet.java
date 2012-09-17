/*    */ package com.whatsapp.client.test;
/*    */ 
/*    */ import com.whatsapp.api.util.Utilities;
/*    */ import com.whatsapp.client.BGApp.FmsgKeyStatus;
/*    */ import com.whatsapp.client.FunXMPP.FMessage;
/*    */ import com.whatsapp.client.FunXMPP.FMessage.Key;
/*    */ import com.whatsapp.client.Serializer;
/*    */ import java.util.Vector;
/*    */ import javax.microedition.lcdui.Command;
/*    */ import javax.microedition.lcdui.CommandListener;
/*    */ import javax.microedition.lcdui.Display;
/*    */ import javax.microedition.lcdui.Displayable;
/*    */ import javax.microedition.lcdui.Form;
/*    */ import javax.microedition.midlet.MIDlet;
/*    */ 
/*    */ public class SerializerMidlet extends MIDlet
/*    */   implements CommandListener
/*    */ {
/*    */   Form form;
/* 25 */   Command serCmd = new Command("serialize", 4, 1);
/* 26 */   Command serDOCmd = new Command("ser with data streams", 4, 1);
/*    */ 
/* 28 */   Vector msgs = MessageFactory.getMessages(3);
/*    */ 
/*    */   public void startApp() {
/* 31 */     this.form = new Form("serializer test");
/* 32 */     this.form.addCommand(this.serCmd);
/* 33 */     this.form.addCommand(this.serDOCmd);
/* 34 */     this.form.setCommandListener(this);
/*    */ 
/* 36 */     Display d = Display.getDisplay(this);
/* 37 */     d.setCurrent(this.form);
/*    */   }
/*    */ 
/*    */   public void pauseApp()
/*    */   {
/*    */   }
/*    */ 
/*    */   public void destroyApp(boolean unconditional) {
/*    */   }
/*    */ 
/*    */   public void commandAction(Command cmd, Displayable dsplbl) {
/* 48 */     if (cmd == this.serCmd) {
/* 49 */       FunXMPP.FMessage firstMsg = (FunXMPP.FMessage)this.msgs.elementAt(0);
/* 50 */       Utilities.logData("trying to serialize key: " + firstMsg.key.toString());
/* 51 */       byte[] out = Serializer.serialize(firstMsg.key);
/* 52 */       Utilities.logData("seeing serialize result with length " + out.length);
/*    */ 
/* 54 */       FunXMPP.FMessage.Key newKey = Serializer.unserializeKey(out);
/*    */ 
/* 56 */       Utilities.logData("unser result shows key: " + newKey.toString());
/* 57 */     } else if (cmd == this.serDOCmd) {
/* 58 */       FunXMPP.FMessage firstMsg = (FunXMPP.FMessage)this.msgs.elementAt(0);
/* 59 */       BGApp.FmsgKeyStatus keyStatus = new BGApp.FmsgKeyStatus(firstMsg);
/* 60 */       Utilities.logData("trying to serialize key: " + firstMsg.key.toString() + " with status " + firstMsg.status);
/*    */       try
/*    */       {
/* 64 */         byte[] out = Serializer.serialize(keyStatus);
/* 65 */         Utilities.logData("seeing serialize result with length " + out.length);
/*    */ 
/* 67 */         BGApp.FmsgKeyStatus newKeyStatus = Serializer.unserializeKeyStatus(out);
/*    */ 
/* 69 */         Utilities.logData("unser result shows key: " + newKeyStatus.key.toString() + " with status " + newKeyStatus.status);
/*    */       }
/*    */       catch (Exception x) {
/* 72 */         Utilities.logData("encountered serialize exception " + x.toString());
/*    */       }
/*    */     }
/*    */   }
/*    */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.test.SerializerMidlet
 * JD-Core Version:    0.6.0
 */