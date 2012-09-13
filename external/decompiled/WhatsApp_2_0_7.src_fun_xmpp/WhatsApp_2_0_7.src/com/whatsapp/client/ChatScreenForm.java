/*     */ package com.whatsapp.client;
/*     */ 
/*     */ import com.whatsapp.client.test.ContactListMidlet;
/*     */ import javax.microedition.lcdui.Command;
/*     */ import javax.microedition.lcdui.Display;
/*     */ import javax.microedition.lcdui.Form;
/*     */ import javax.microedition.lcdui.TextField;
/*     */ 
/*     */ public class ChatScreenForm extends Form
/*     */ {
/*     */   public ChatPane _chatPane;
/*     */   public TextField _inputField;
/*     */   public Command _snapDown;
/*     */   public Command _closeScreenCmd;
/*     */   public Command _sendMessageCmd;
/*     */   public Command _showInputCmd;
/*     */   public Command _sendImageCmd;
/*     */   public Command _kbdHelpCmd;
/*     */   String _jid;
/*     */   public final boolean _forceGroup;
/*     */   public String _forcedTitle;
/*     */   private boolean _inputShowing;
/*     */   private int _inputIndex;
/*     */ 
/*     */   public ChatScreenForm(String jid)
/*     */   {
/*  41 */     this(jid, false, false, null);
/*     */   }
/*     */ 
/*     */   public ChatScreenForm(String jid, boolean startedDirectly, boolean forceGroup, String forceTitle) {
/*  45 */     super("");
/*  46 */     this._jid = jid;
/*  47 */     this._forceGroup = forceGroup;
/*  48 */     if (forceTitle != null)
/*  49 */       setTitle(forceTitle);
/*     */     else {
/*  51 */       setTitle(FGApp.getInstance().getDisplayableNameFromJid(jid));
/*     */     }
/*  53 */     this._chatPane = new ChatPane(this, startedDirectly);
/*  54 */     append(this._chatPane);
/*  55 */     FGApp.getInstance().setTopPane(this._chatPane);
/*  56 */     this._inputField = new TextField("", null, 150, 0);
/*     */ 
/*  59 */     setCommandListener(this._chatPane);
/*  60 */     setItemStateListener(this._chatPane);
/*     */ 
/*  62 */     this._closeScreenCmd = new Command("Close", 2, 1);
/*  63 */     addCommand(this._closeScreenCmd);
/*     */ 
/*  65 */     this._sendImageCmd = new Command("Send media", 8, 3);
/*  66 */     addCommand(this._sendImageCmd);
/*  67 */     this._kbdHelpCmd = new Command("Help", 8, 3);
/*  68 */     addCommand(this._kbdHelpCmd);
/*     */ 
/*  70 */     this._sendMessageCmd = new Command("send", 4, 1);
/*  71 */     this._inputField.addCommand(this._sendMessageCmd);
/*  72 */     this._inputField.setItemCommandListener(this._chatPane);
/*     */ 
/*  74 */     this._inputShowing = false;
/*  75 */     this._showInputCmd = new Command("Reply", 4, 1);
/*  76 */     addCommand(this._showInputCmd);
/*     */   }
/*     */ 
/*     */   public void focusInputField()
/*     */   {
/*  85 */     ContactListMidlet.getInstance()._display.setCurrentItem(this._inputField);
/*     */   }
/*     */ 
/*     */   public synchronized void showInput()
/*     */   {
/*  90 */     if (!this._inputShowing)
/*     */     {
/*  92 */       this._inputShowing = true;
/*  93 */       this._inputIndex = append(this._inputField);
/*  94 */       removeCommand(this._showInputCmd);
/*     */     }
/*  96 */     focusInputField();
/*     */   }
/*     */ 
/*     */   public synchronized void hideInput()
/*     */   {
/* 101 */     if (this._inputShowing) {
/* 102 */       this._inputShowing = false;
/* 103 */       delete(this._inputIndex);
/* 104 */       addCommand(this._showInputCmd);
/*     */     }
/*     */   }
/*     */ 
/*     */   public boolean inputShowing() {
/* 109 */     return this._inputShowing;
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.ChatScreenForm
 * JD-Core Version:    0.6.0
 */