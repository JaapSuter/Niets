/*     */ package com.whatsapp.client;
/*     */ 
/*     */ import com.whatsapp.api.util.Utilities;
/*     */ import javax.microedition.lcdui.Alert;
/*     */ import javax.microedition.lcdui.AlertType;
/*     */ import javax.microedition.lcdui.Command;
/*     */ import javax.microedition.lcdui.CommandListener;
/*     */ import javax.microedition.lcdui.Display;
/*     */ import javax.microedition.lcdui.Displayable;
/*     */ import javax.microedition.lcdui.Form;
/*     */ import javax.microedition.lcdui.List;
/*     */ import javax.microedition.lcdui.TextBox;
/*     */ import javax.microedition.rms.RecordStoreException;
/*     */ 
/*     */ public class SettingsList extends List
/*     */   implements CommandListener, Settings.Listener
/*     */ {
/*     */   private static final int CHAT_NAME_IDX = 0;
/*     */   private static final int ROAM_IDX = 1;
/*  22 */   private static final String[] ROAM_CHOICES = { "Disabled (use WiFi)", "Enabled" };
/*     */ 
/*  26 */   private static final int[] ROAM_VALUES = { 0, 1 };
/*     */   private final Command selectCommand;
/*     */   private final Command backCommand;
/*     */   private final Command okCommand;
/*     */   private final Command cancelCommand;
/*     */   private String chat_name;
/*     */   private int roam;
/*     */   private Form _parentScr;
/*     */   private Display _display;
/*     */ 
/*     */   public SettingsList(Form parentScr, Display display)
/*     */     throws RecordStoreException
/*     */   {
/*  44 */     super("Settings", 3);
/*  45 */     this._parentScr = parentScr;
/*  46 */     this._display = display;
/*     */ 
/*  48 */     setFitPolicy(1);
/*     */ 
/*  51 */     setSelectCommand(this.selectCommand = new Command("Select", 8, 1));
/*     */ 
/*  53 */     addCommand(this.backCommand = new Command("Back", 2, 1));
/*  54 */     this.okCommand = new Command("OK", 4, 1);
/*  55 */     this.cancelCommand = new Command("Cancel", 3, 1);
/*     */ 
/*  57 */     populate();
/*     */ 
/*  59 */     Settings.addListener(this);
/*     */ 
/*  62 */     setCommandListener(this);
/*     */   }
/*     */ 
/*     */   public void onSettingChanged(int setting, boolean localOrigin) {
/*  66 */     switch (setting) {
/*     */     case 0:
/*     */     case 1:
/*  69 */       repopulate();
/*     */     }
/*     */   }
/*     */ 
/*     */   private void populate()
/*     */     throws RecordStoreException
/*     */   {
/*  76 */     this.chat_name = Settings.getString(0);
/*  77 */     if (this.chat_name != null)
/*  78 */       append("Chat Name:\n" + this.chat_name, null);
/*     */     else {
/*  80 */       append("Chat Name:\nNone", null);
/*     */     }
/*  82 */     this.roam = Settings.getInt(1);
/*  83 */     append("Cellular when roaming:\n" + ROAM_CHOICES[this.roam], null);
/*     */   }
/*     */   private void repopulate() {
/*  86 */     deleteAll();
/*     */     try {
/*  88 */       populate();
/*     */     } catch (RecordStoreException ex) {
/*  90 */       Utilities.logData("settings-list/populate/error: " + ex);
/*     */ 
/*  93 */       this._display.setCurrent(new Alert("Error", "An error occurred while retrieving settings", null, AlertType.ERROR), this);
/*     */     }
/*     */   }
/*     */ 
/*     */   private void showTextEditor(String title, String text, int maxSize, int constraints, int settingId)
/*     */   {
/* 103 */     TextBox editor = new TextBox(title, text, maxSize, constraints);
/* 104 */     editor.addCommand(this.okCommand);
/* 105 */     editor.addCommand(this.cancelCommand);
/* 106 */     CommandListener listener = new CommandListener(settingId, editor) { private final int val$settingId;
/*     */       private final TextBox val$editor;
/*     */ 
/* 109 */       public void commandAction(Command cmd, Displayable d) { if (cmd == SettingsList.this.okCommand) {
/*     */           try {
/* 111 */             Settings.set(this.val$settingId, this.val$editor.getString());
/* 112 */             SettingsList.this._display.setCurrent(SettingsList.this);
/*     */           } catch (RecordStoreException ex) {
/* 114 */             Utilities.logData("settings-list/set/error: " + ex);
/* 115 */             SettingsList.this._display.setCurrent(new Alert("Error", "An error occurred while changing the setting", null, AlertType.ERROR), SettingsList.this);
/*     */           }
/*     */ 
/*     */         }
/* 122 */         else if (cmd == SettingsList.this.cancelCommand)
/* 123 */           SettingsList.this._display.setCurrent(SettingsList.this);
/*     */       }
/*     */     };
/* 127 */     editor.setCommandListener(listener);
/* 128 */     this._display.setCurrent(editor);
/*     */   }
/*     */ 
/*     */   private void showChooser(String title, String[] choices, int[] values, int selected, int settingId)
/*     */   {
/* 133 */     List chooser = new List(title, 1, choices, null);
/* 134 */     chooser.setSelectedIndex(selected, true);
/* 135 */     chooser.addCommand(this.okCommand);
/* 136 */     chooser.addCommand(this.cancelCommand);
/*     */ 
/* 138 */     CommandListener listener = new CommandListener(settingId, values, chooser) { private final int val$settingId;
/*     */       private final int[] val$values;
/*     */       private final List val$chooser;
/*     */ 
/* 141 */       public void commandAction(Command cmd, Displayable d) { if (cmd == SettingsList.this.okCommand) {
/*     */           try {
/* 143 */             Settings.set(this.val$settingId, this.val$values[this.val$chooser.getSelectedIndex()]);
/*     */ 
/* 145 */             SettingsList.this._display.setCurrent(SettingsList.this);
/*     */           } catch (RecordStoreException ex) {
/* 147 */             Utilities.logData("settings-list/set/error: " + ex);
/* 148 */             SettingsList.this._display.setCurrent(new Alert("Error", "An error occurred while changing the setting", null, AlertType.ERROR), SettingsList.this);
/*     */           }
/*     */ 
/*     */         }
/* 155 */         else if (cmd == SettingsList.this.cancelCommand)
/* 156 */           SettingsList.this._display.setCurrent(SettingsList.this);
/*     */       }
/*     */     };
/* 160 */     chooser.setCommandListener(listener);
/* 161 */     this._display.setCurrent(chooser);
/*     */   }
/*     */ 
/*     */   public void commandAction(Command command, Displayable displayable) {
/* 165 */     if (command == this.selectCommand) {
/* 166 */       switch (getSelectedIndex()) {
/*     */       case 0:
/* 168 */         showTextEditor("Chat Name", this.chat_name, 20, 0, 0);
/*     */ 
/* 170 */         break;
/*     */       case 1:
/* 173 */         showChooser("Cellular When Roaming", ROAM_CHOICES, ROAM_VALUES, this.roam, 1);
/*     */       }
/*     */ 
/*     */     }
/* 178 */     else if (command == this.backCommand) {
/* 179 */       this._display.setCurrent(this._parentScr);
/* 180 */       FGApp.getInstance().setTopPane(this._parentScr);
/*     */     }
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.SettingsList
 * JD-Core Version:    0.6.0
 */