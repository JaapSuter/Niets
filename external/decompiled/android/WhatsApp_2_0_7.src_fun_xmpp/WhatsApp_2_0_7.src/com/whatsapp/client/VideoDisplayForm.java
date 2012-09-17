/*     */ package com.whatsapp.client;
/*     */ 
/*     */ import com.whatsapp.api.util.DateTimeUtilities;
/*     */ import com.whatsapp.api.util.Utilities;
/*     */ import com.whatsapp.client.test.ContactListMidlet;
/*     */ import java.io.InputStream;
/*     */ import javax.microedition.io.Connector;
/*     */ import javax.microedition.io.file.FileConnection;
/*     */ import javax.microedition.lcdui.Alert;
/*     */ import javax.microedition.lcdui.AlertType;
/*     */ import javax.microedition.lcdui.Command;
/*     */ import javax.microedition.lcdui.CommandListener;
/*     */ import javax.microedition.lcdui.Display;
/*     */ import javax.microedition.lcdui.Displayable;
/*     */ import javax.microedition.lcdui.Form;
/*     */ import javax.microedition.lcdui.Item;
/*     */ import javax.microedition.media.Manager;
/*     */ import javax.microedition.media.MediaException;
/*     */ import javax.microedition.media.Player;
/*     */ import javax.microedition.media.control.VideoControl;
/*     */ 
/*     */ public class VideoDisplayForm extends Form
/*     */   implements CommandListener
/*     */ {
/*     */   private String _vidLoc;
/*     */   private String _mimeType;
/*     */   private ChatScreenForm _parentScr;
/*     */   private Player _player;
/*     */   private VideoControl _vControl;
/*  37 */   private Command _backCmd = new Command("back", 2, 1);
/*  38 */   private Command _playCmd = new Command("play", 4, 1);
/*  39 */   private Command _stopCmd = new Command("stop", 4, 1);
/*     */ 
/*     */   public VideoDisplayForm(ChatScreenForm parentScr, long timestamp, String vidLoc, String mimeType) {
/*  42 */     super(DateTimeUtilities.simpleDayFormat(timestamp) + " " + DateTimeUtilities.shortTimeFormat(timestamp));
/*     */ 
/*  44 */     this._vidLoc = vidLoc;
/*  45 */     this._mimeType = mimeType;
/*  46 */     Utilities.logData("video screen launched with file " + vidLoc + " and mimetype " + mimeType);
/*     */ 
/*  48 */     this._parentScr = parentScr;
/*  49 */     addCommand(this._backCmd);
/*  50 */     setCommandListener(this);
/*  51 */     append("loading");
/*  52 */     BGLoader loader = new BGLoader(null);
/*  53 */     loader.start();
/*     */   }
/*     */ 
/*     */   public void commandAction(Command cmd, Displayable dsplbl) {
/*  57 */     if (cmd == this._backCmd) {
/*  58 */       if (this._player != null) {
/*     */         try {
/*  60 */           this._player.stop();
/*     */         } catch (MediaException mmx) {
/*     */         }
/*  63 */         this._player.close();
/*     */       }
/*  65 */       FGApp.getInstance().setTopPane(this._parentScr._chatPane);
/*  66 */       ContactListMidlet.getInstance()._display.setCurrent(this._parentScr);
/*  67 */     } else if (cmd == this._playCmd) {
/*  68 */       if (this._player != null)
/*     */         try {
/*  70 */           this._player.start();
/*  71 */           removeCommand(this._playCmd);
/*  72 */           addCommand(this._stopCmd);
/*     */         } catch (Throwable t) {
/*  74 */           Utilities.logData("couldnt play vid: " + t.toString());
/*     */         }
/*     */     }
/*  77 */     else if ((cmd == this._stopCmd) && 
/*  78 */       (this._player != null)) {
/*     */       try {
/*  80 */         this._player.stop();
/*  81 */         removeCommand(this._stopCmd);
/*  82 */         addCommand(this._playCmd);
/*     */       } catch (Throwable t) {
/*  84 */         Utilities.logData("couldnt stop vid: " + t.toString());
/*     */       }
/*     */     }
/*     */   }
/*     */   private class BGLoader extends Thread {
/*     */     private final VideoDisplayForm this$0;
/*     */ 
/*     */     private BGLoader() {
/*  91 */       this.this$0 = ???;
/*     */     }
/*     */     public void run() {
/*  94 */       FileConnection fileC = null;
/*  95 */       InputStream is = null;
/*  96 */       boolean result = false;
/*  97 */       String errorTxt = "";
/*     */       try
/*     */       {
/* 100 */         fileC = (FileConnection)Connector.open(this.this$0._vidLoc, 1);
/* 101 */         is = fileC.openInputStream();
/*     */ 
/* 103 */         VideoDisplayForm.access$202(this.this$0, Manager.createPlayer(is, this.this$0._mimeType));
/* 104 */         this.this$0._player.realize();
/* 105 */         VideoDisplayForm.access$402(this.this$0, (VideoControl)this.this$0._player.getControl("VideoControl"));
/* 106 */         this.this$0._player.prefetch();
/* 107 */         if (this.this$0._vControl != null) {
/* 108 */           Item vItem = (Item)this.this$0._vControl.initDisplayMode(0, null);
/* 109 */           this.this$0.deleteAll();
/* 110 */           this.this$0.append(vItem);
/* 111 */           this.this$0.addCommand(this.this$0._playCmd);
/* 112 */           result = true;
/*     */         }
/*     */       } catch (Throwable t) {
/* 115 */         Utilities.logData("video loader died: " + t.toString());
/* 116 */         errorTxt = t.toString();
/*     */       }
/*     */       finally
/*     */       {
/*     */       }
/*     */ 
/* 136 */       if (!result) {
/* 137 */         Alert byeAlert = new Alert("video error", errorTxt, null, AlertType.ERROR);
/* 138 */         FGApp.getInstance().setTopPane(this.this$0._parentScr._chatPane);
/* 139 */         ContactListMidlet.getInstance()._display.setCurrent(byeAlert, this.this$0._parentScr);
/*     */       }
/*     */     }
/*     */ 
/*     */     BGLoader(VideoDisplayForm.1 x1)
/*     */     {
/*  91 */       this();
/*     */     }
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.VideoDisplayForm
 * JD-Core Version:    0.6.0
 */