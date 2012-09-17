/*     */ package com.whatsapp.client;
/*     */ 
/*     */ import com.whatsapp.api.ui.ListField.Item;
/*     */ import com.whatsapp.api.ui.TextUtils;
/*     */ import com.whatsapp.api.util.DateTimeUtilities;
/*     */ import javax.microedition.lcdui.Font;
/*     */ import javax.microedition.lcdui.Graphics;
/*     */ 
/*     */ public class ChatsListItem
/*     */   implements ListField.Item
/*     */ {
/*     */   protected static final int ROW_HEIGHT = 44;
/*     */   public ChatHistory _hist;
/*  27 */   public static Font normalFont = Font.getFont(64, 0, 0);
/*     */ 
/*  30 */   public static Font boldFont = Font.getFont(64, 1, 0);
/*     */ 
/*  33 */   public static Font smallFont = Font.getFont(64, 0, 8);
/*     */ 
/*  36 */   private static int _storedIconWidth = -1;
/*  37 */   private static int _storedIconHeight = -1;
/*  38 */   private static int _storedIconYAdjust = 0;
/*     */ 
/*     */   public ChatsListItem(ChatHistory hist)
/*     */   {
/*  24 */     this._hist = hist;
/*     */   }
/*     */ 
/*     */   public static int getIconWidth()
/*     */   {
/*  41 */     if (_storedIconWidth < 0) {
/*  42 */       int ourWidth = smallFont.stringWidth("XX");
/*  43 */       if (ourWidth < 25) {
/*  44 */         ourWidth = 25;
/*     */       }
/*  46 */       _storedIconWidth = ourWidth;
/*     */     }
/*  48 */     return _storedIconWidth;
/*     */   }
/*     */ 
/*     */   public static int getIconHeight() {
/*  52 */     if (_storedIconHeight < 0) {
/*  53 */       int ourHeight = smallFont.getHeight();
/*  54 */       int iconFloorDim = 20;
/*  55 */       if (ourHeight < iconFloorDim) {
/*  56 */         _storedIconYAdjust = (iconFloorDim - ourHeight) / 2;
/*  57 */         ourHeight = iconFloorDim;
/*     */       }
/*  59 */       _storedIconHeight = ourHeight;
/*     */     }
/*  61 */     return _storedIconHeight;
/*     */   }
/*     */ 
/*     */   public static int getIconYAdjust() {
/*  65 */     return _storedIconYAdjust;
/*     */   }
/*     */ 
/*     */   public void paintListRow(Graphics g, int x, int y, int width, int height, boolean focused)
/*     */   {
/*  70 */     g.setClip(x, y, width, 44);
/*  71 */     if (focused) {
/*  72 */       TabState.paintFocusedBackground(g, x, y, width, 44);
/*     */     }
/*     */ 
/*  75 */     g.setClip(x, y, 44, 44);
/*  76 */     if (this._hist._group == null)
/*  77 */       g.drawImage(ContactListItem.defaultContactImg, x, y, 20);
/*     */     else {
/*  79 */       g.drawImage(ContactListItem.defaultGroupImg, x, y, 20);
/*     */     }
/*     */ 
/*  82 */     g.setClip(x, y, width, height);
/*     */ 
/*  84 */     if (!focused)
/*  85 */       g.setColor(6591981);
/*     */     else {
/*  87 */       g.setColor(16777215);
/*     */     }
/*  89 */     int labelWidth = 0;
/*  90 */     if (this._hist._lastTimestamp > 0L) {
/*  91 */       String date = formattedStamp(this._hist._lastTimestamp);
/*  92 */       labelWidth = normalFont.stringWidth(date) + 2;
/*  93 */       g.setFont(normalFont);
/*  94 */       g.drawString(date, x + width - labelWidth, y, 20);
/*     */     }
/*     */ 
/*  97 */     boolean unread = this._hist.isDirty();
/*  98 */     if (unread)
/*  99 */       g.setFont(boldFont);
/*     */     else
/* 101 */       g.setFont(normalFont);
/*     */     String name;
/*     */     String name;
/* 105 */     if (this._hist._readableName == null)
/* 106 */       name = FGApp.getInstance().getDisplayableNameFromJid(this._hist._jid);
/*     */     else {
/* 108 */       name = this._hist._readableName;
/*     */     }
/* 110 */     int availWidth = width - (labelWidth + 3 + 44);
/* 111 */     if (!focused) {
/* 112 */       g.setColor(0);
/*     */     }
/* 114 */     TextUtils.drawStringElided(g, name, x + 44 + 1, y, availWidth);
/*     */ 
/* 116 */     g.setFont(smallFont);
/* 117 */     if (this._hist._typing) {
/* 118 */       if (!focused) {
/* 119 */         g.setColor(32512);
/*     */       }
/* 121 */       g.drawString("is typing a message", x + 44, y + 22, 20);
/*     */     } else {
/* 123 */       if (!focused) {
/* 124 */         g.setColor(5066061);
/*     */       }
/* 126 */       FunXMPP.FMessage.Key dummyKey = new FunXMPP.FMessage.Key(this._hist._jid, this._hist._lastFromMe, this._hist._lastID);
/* 127 */       FunXMPP.FMessage fmsg = new FunXMPP.FMessage(dummyKey);
/* 128 */       fmsg.status = this._hist._lastStatus;
/*     */ 
/* 130 */       MessageStatusIcon.paintStatusIcon(g, fmsg, x + 44, y + 22 + getIconYAdjust(), getIconWidth(), getIconHeight(), false, unread, focused);
/*     */ 
/* 132 */       String formattedExcerpt = this._hist._lastExcerpt;
/* 133 */       if ((this._hist._group != null) && (this._hist._group._lastParty != null)) {
/* 134 */         formattedExcerpt = FGApp.getInstance().getDisplayableNameFromJid(this._hist._group._lastParty) + ": " + this._hist._lastExcerpt;
/*     */       }
/*     */ 
/* 137 */       if (formattedExcerpt != null)
/*     */       {
/* 139 */         if (formattedExcerpt.length() > 40) {
/* 140 */           formattedExcerpt = formattedExcerpt.substring(0, 40);
/*     */         }
/* 142 */         availWidth = width - (getIconWidth() + 2 + 44);
/* 143 */         TextUtils.drawStringElided(g, formattedExcerpt, getIconWidth() + x + 44, y + 22 + getIconYAdjust(), availWidth);
/*     */       }
/*     */     }
/*     */ 
/* 147 */     g.setColor(8421504);
/* 148 */     g.drawLine(x, y + 44 - 1, x + width, y + 44 - 1);
/*     */   }
/*     */ 
/*     */   public static String formattedStamp(long stamp)
/*     */   {
/* 159 */     long current = System.currentTimeMillis();
/* 160 */     long sixDaysAgo = current - 518400000L;
/* 161 */     if (stamp < current - 31536000000L)
/* 162 */       return DateTimeUtilities.dayOfYear(stamp);
/* 163 */     if ((stamp < sixDaysAgo) && (!DateTimeUtilities.isSameDate(stamp, sixDaysAgo))) {
/* 164 */       return DateTimeUtilities.simpleDayFormat(stamp);
/*     */     }
/* 166 */     if (current - stamp > 43200000L) {
/* 167 */       return DateTimeUtilities.weekdayTimeFormat(stamp);
/*     */     }
/* 169 */     return DateTimeUtilities.shortTimeFormat(stamp);
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.ChatsListItem
 * JD-Core Version:    0.6.0
 */