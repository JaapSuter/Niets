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
/*     */ import javax.microedition.lcdui.CustomItem;
/*     */ import javax.microedition.lcdui.Display;
/*     */ import javax.microedition.lcdui.Displayable;
/*     */ import javax.microedition.lcdui.Form;
/*     */ import javax.microedition.lcdui.Graphics;
/*     */ import javax.microedition.media.Manager;
/*     */ import javax.microedition.media.MediaException;
/*     */ import javax.microedition.media.Player;
/*     */ import javax.microedition.media.control.VolumeControl;
/*     */ 
/*     */ public class AudioDisplayForm extends Form
/*     */   implements CommandListener
/*     */ {
/*     */   private String _fileLoc;
/*     */   private String _mimeType;
/*     */   private ChatScreenForm _parentScr;
/*     */   private Player _player;
/*     */   private VolumeControl _volControl;
/*  39 */   private Command _backCmd = new Command("back", 2, 1);
/*  40 */   private Command _playCmd = new Command("play", 4, 1);
/*  41 */   private Command _stopCmd = new Command("stop", 4, 1);
/*     */ 
/*  43 */   FileConnection fileC = null;
/*  44 */   InputStream is = null;
/*     */ 
/*     */   public AudioDisplayForm(ChatScreenForm parentScr, long timestamp, String fileLoc, String mimeType) {
/*  47 */     super(DateTimeUtilities.simpleDayFormat(timestamp) + " " + DateTimeUtilities.shortTimeFormat(timestamp));
/*     */ 
/*  49 */     this._fileLoc = fileLoc;
/*  50 */     this._mimeType = mimeType;
/*  51 */     Utilities.logData("audio screen launched with file " + fileLoc + " and mimetype " + mimeType);
/*     */ 
/*  53 */     this._parentScr = parentScr;
/*  54 */     addCommand(this._backCmd);
/*  55 */     setCommandListener(this);
/*  56 */     append("loading");
/*  57 */     BGLoader loader = new BGLoader(null);
/*  58 */     loader.start();
/*     */   }
/*     */ 
/*     */   private void closeFileResources() {
/*  62 */     if (this.is != null)
/*     */       try {
/*  64 */         this.is.close();
/*     */       }
/*     */       catch (Exception x) {
/*     */       }
/*  68 */     if (this.fileC != null)
/*     */       try {
/*  70 */         this.fileC.close();
/*     */       }
/*     */       catch (Exception x)
/*     */       {
/*     */       }
/*     */   }
/*     */ 
/*     */   public void commandAction(Command cmd, Displayable dsplbl)
/*     */   {
/* 178 */     if (cmd == this._backCmd) {
/* 179 */       if (this._player != null) {
/*     */         try {
/* 181 */           this._player.stop();
/*     */         } catch (MediaException mmx) {
/*     */         }
/* 184 */         this._player.close();
/*     */       }
/* 186 */       closeFileResources();
/* 187 */       FGApp.getInstance().setTopPane(this._parentScr._chatPane);
/* 188 */       ContactListMidlet.getInstance()._display.setCurrent(this._parentScr);
/* 189 */     } else if (cmd == this._playCmd) {
/* 190 */       if (this._player != null)
/*     */         try {
/* 192 */           this._player.start();
/* 193 */           removeCommand(this._playCmd);
/* 194 */           addCommand(this._stopCmd);
/*     */         } catch (Throwable t) {
/* 196 */           Utilities.logData("couldnt play audio: " + t.toString());
/*     */         }
/*     */     }
/* 199 */     else if ((cmd == this._stopCmd) && 
/* 200 */       (this._player != null)) {
/*     */       try {
/* 202 */         this._player.stop();
/* 203 */         removeCommand(this._stopCmd);
/* 204 */         addCommand(this._playCmd);
/*     */       } catch (Throwable t) {
/* 206 */         Utilities.logData("couldnt stop audio: " + t.toString());
/*     */       }
/*     */     }
/*     */   }
/*     */   private class BGLoader extends Thread {
/*     */     private final AudioDisplayForm this$0;
/*     */ 
/*     */     private BGLoader() {
/* 213 */       this.this$0 = ???;
/*     */     }
/*     */     public void run() {
/* 216 */       boolean result = false;
/* 217 */       String errorTxt = "";
/*     */       try
/*     */       {
/* 220 */         this.this$0.fileC = ((FileConnection)Connector.open(this.this$0._fileLoc, 1));
/* 221 */         this.this$0.is = this.this$0.fileC.openInputStream();
/*     */ 
/* 223 */         AudioDisplayForm.access$302(this.this$0, Manager.createPlayer(this.this$0.is, this.this$0._mimeType));
/* 224 */         this.this$0._player.realize();
/* 225 */         this.this$0._player.prefetch();
/* 226 */         AudioDisplayForm.access$102(this.this$0, (VolumeControl)this.this$0._player.getControl("VolumeControl"));
/* 227 */         if (this.this$0._volControl != null) {
/* 228 */           this.this$0._volControl.setMute(false);
/* 229 */           this.this$0.deleteAll();
/* 230 */           this.this$0.addCommand(this.this$0._playCmd);
/* 231 */           AudioDisplayForm.VolumeWidget widget = new AudioDisplayForm.VolumeWidget(this.this$0);
/* 232 */           this.this$0.append(widget);
/* 233 */           ContactListMidlet.getInstance()._display.setCurrentItem(widget);
/* 234 */           result = true;
/*     */         } else {
/* 236 */           errorTxt = "could not get volume control";
/*     */         }
/*     */       } catch (MediaException jMX) {
/* 239 */         if (jMX.getMessage().indexOf("Sounds not allowed") != -1)
/* 240 */           errorTxt = "Cannot play sounds in silent mode. Please change your profile.";
/*     */         else
/* 242 */           errorTxt = jMX.toString();
/*     */       }
/*     */       catch (Throwable t) {
/* 245 */         if (this.this$0._player != null)
/*     */           try {
/* 247 */             this.this$0._player.close();
/*     */           }
/*     */           catch (Throwable tt) {
/*     */           }
/* 251 */         Utilities.logData("audio loader died: " + t.toString());
/* 252 */         errorTxt = t.toString();
/*     */       }
/*     */       finally
/*     */       {
/*     */       }
/* 257 */       if (!result) {
/* 258 */         Alert byeAlert = new Alert("audio error", errorTxt, null, AlertType.ERROR);
/* 259 */         this.this$0.closeFileResources();
/* 260 */         FGApp.getInstance().setTopPane(this.this$0._parentScr._chatPane);
/* 261 */         ContactListMidlet.getInstance()._display.setCurrent(byeAlert, this.this$0._parentScr);
/*     */       }
/*     */     }
/*     */ 
/*     */     BGLoader(AudioDisplayForm.1 x1)
/*     */     {
/* 213 */       this();
/*     */     }
/*     */   }
/*     */ 
/*     */   private class VolumeWidget extends CustomItem
/*     */   {
/*     */     static final int INCREMENT = 20;
/*     */     static final int totalBlocks = 6;
/*     */     static final int blockMargin = 5;
/*     */ 
/*     */     public VolumeWidget()
/*     */     {
/*  79 */       super();
/*     */     }
/*     */ 
/*     */     protected int getMinContentWidth() {
/*  83 */       return getPrefContentWidth(0);
/*     */     }
/*     */ 
/*     */     protected int getMinContentHeight() {
/*  87 */       return 50;
/*     */     }
/*     */ 
/*     */     protected int getPrefContentWidth(int i) {
/*  91 */       return AudioDisplayForm.this.getWidth() - 20;
/*     */     }
/*     */ 
/*     */     protected int getPrefContentHeight(int i) {
/*  95 */       return 100;
/*     */     }
/*     */ 
/*     */     protected boolean traverse(int dir, int viewportWidth, int viewportHeight, int[] visRect_inout)
/*     */     {
/* 104 */       int curVol = AudioDisplayForm.this._volControl.getLevel();
/* 105 */       boolean needsRepaint = false;
/*     */ 
/* 107 */       if (dir == 1) {
/* 108 */         if (curVol < 100) {
/* 109 */           curVol += 20;
/* 110 */           if (curVol > 100) {
/* 111 */             curVol = 100;
/*     */           }
/* 113 */           AudioDisplayForm.this._volControl.setLevel(curVol);
/* 114 */           needsRepaint = true;
/*     */         }
/* 116 */       } else if ((dir == 6) && 
/* 117 */         (curVol > 0)) {
/* 118 */         curVol -= 20;
/* 119 */         if (curVol < 0) {
/* 120 */           curVol = 0;
/*     */         }
/* 122 */         AudioDisplayForm.this._volControl.setLevel(curVol);
/* 123 */         needsRepaint = true;
/*     */       }
/*     */ 
/* 126 */       if (needsRepaint) {
/* 127 */         repaint();
/*     */       }
/* 129 */       return true;
/*     */     }
/*     */ 
/*     */     protected void paint(Graphics g, int width, int height)
/*     */     {
/* 136 */       int curVol = AudioDisplayForm.this._volControl.getLevel();
/*     */ 
/* 138 */       g.setColor(16777215);
/* 139 */       g.fillRect(0, 0, width, height);
/*     */ 
/* 141 */       int blockWidth = Math.min((width - 30) / 6, 25);
/* 142 */       int blockHeight = Math.min(50, height - 10);
/*     */ 
/* 145 */       for (int i = 1; i < 6; i++) {
/* 146 */         g.setColor(8421504);
/* 147 */         int xpos = (5 + blockWidth) * i + 5;
/* 148 */         int ypos = 5;
/* 149 */         g.fillRect(xpos, ypos, blockWidth, blockHeight);
/*     */ 
/* 151 */         g.setColor(13882323);
/* 152 */         g.drawLine(xpos, ypos, xpos + blockWidth, ypos);
/* 153 */         g.drawLine(xpos, ypos, xpos, ypos + blockHeight);
/*     */       }
/*     */ 
/* 156 */       if (curVol == 0)
/*     */       {
/* 158 */         g.setColor(16711680);
/* 159 */         g.drawLine(5, 5, 5 + blockWidth, 5 + blockHeight);
/* 160 */         g.drawLine(5, 5 + blockHeight, 5 + blockWidth, 5);
/*     */       }
/*     */       else {
/* 163 */         int blocksToFill = Math.max(curVol / 20, 1);
/* 164 */         g.setColor(32768);
/* 165 */         for (int i = 0; i < blocksToFill; i++) {
/* 166 */           int xpos = (5 + blockWidth) * (i + 1) + 5;
/* 167 */           int ypos = 5;
/* 168 */           g.fillRect(xpos, ypos, blockWidth, blockHeight);
/*     */         }
/*     */       }
/*     */ 
/* 172 */       g.setColor(0);
/* 173 */       g.drawString("volume", 5, height - 5, 36);
/*     */     }
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.AudioDisplayForm
 * JD-Core Version:    0.6.0
 */