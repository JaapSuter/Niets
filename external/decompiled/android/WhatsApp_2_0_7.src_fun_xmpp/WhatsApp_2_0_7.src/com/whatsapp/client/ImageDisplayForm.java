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
/*     */ import javax.microedition.lcdui.Image;
/*     */ import javax.microedition.lcdui.ImageItem;
/*     */ 
/*     */ public class ImageDisplayForm extends Form
/*     */   implements CommandListener
/*     */ {
/*     */   private String _imageLoc;
/*     */   private ChatScreenForm _parentScr;
/*     */   private ImageItem _imageItem;
/*  33 */   private Command _backCmd = new Command("back", 2, 1);
/*     */ 
/*     */   public ImageDisplayForm(ChatScreenForm parentScr, long timestamp, String imageLoc) {
/*  36 */     super(DateTimeUtilities.simpleDayFormat(timestamp) + " " + DateTimeUtilities.shortTimeFormat(timestamp));
/*     */ 
/*  38 */     this._imageLoc = imageLoc;
/*  39 */     this._parentScr = parentScr;
/*  40 */     addCommand(this._backCmd);
/*  41 */     setCommandListener(this);
/*  42 */     append("loading");
/*  43 */     BGLoader loader = new BGLoader(null);
/*  44 */     loader.start();
/*     */   }
/*     */ 
/*     */   public void commandAction(Command cmd, Displayable dsplbl) {
/*  48 */     if (cmd == this._backCmd) {
/*  49 */       FGApp.getInstance().setTopPane(this._parentScr._chatPane);
/*  50 */       ContactListMidlet.getInstance()._display.setCurrent(this._parentScr); } 
/*     */   }
/*     */   private class BGLoader extends Thread { private final ImageDisplayForm this$0;
/*     */ 
/*  54 */     private BGLoader() { this.this$0 = ???; }
/*     */ 
/*     */     public void run() {
/*  57 */       FileConnection fileC = null;
/*  58 */       InputStream is = null;
/*  59 */       boolean result = false;
/*  60 */       String errorTxt = "";
/*     */       try
/*     */       {
/*  63 */         fileC = (FileConnection)Connector.open(this.this$0._imageLoc, 1);
/*  64 */         is = fileC.openInputStream();
/*  65 */         Image image = Image.createImage(is);
/*     */ 
/*  84 */         ImageDisplayForm.access$202(this.this$0, new ImageItem("", image, 15360, this.this$0._imageLoc));
/*     */ 
/*  86 */         this.this$0.deleteAll();
/*  87 */         this.this$0.append(this.this$0._imageItem);
/*  88 */         result = true;
/*     */       } catch (Throwable t) {
/*  90 */         Utilities.logData("image background loader died: " + t.toString());
/*  91 */         errorTxt = t.toString();
/*     */       }
/*     */       finally {
/*  94 */         if (is != null)
/*     */           try {
/*  96 */             is.close();
/*     */           }
/*     */           catch (Exception x)
/*     */           {
/*     */           }
/* 101 */         if (fileC != null) {
/*     */           try {
/* 103 */             fileC.close();
/*     */           }
/*     */           catch (Exception localException3)
/*     */           {
/*     */           }
/*     */         }
/*     */       }
/* 110 */       if (!result) {
/* 111 */         Alert byeAlert = new Alert("load image error", errorTxt, null, AlertType.ERROR);
/* 112 */         FGApp.getInstance().setTopPane(this.this$0._parentScr._chatPane);
/* 113 */         ContactListMidlet.getInstance()._display.setCurrent(byeAlert, this.this$0._parentScr);
/*     */       }
/*     */     }
/*     */ 
/*     */     BGLoader(ImageDisplayForm.1 x1)
/*     */     {
/*  54 */       this();
/*     */     }
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.ImageDisplayForm
 * JD-Core Version:    0.6.0
 */