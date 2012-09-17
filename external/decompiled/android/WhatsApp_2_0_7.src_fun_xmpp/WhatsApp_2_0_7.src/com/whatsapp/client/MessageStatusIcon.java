/*     */ package com.whatsapp.client;
/*     */ 
/*     */ import com.whatsapp.api.ui.UIField;
/*     */ import javax.microedition.lcdui.Font;
/*     */ import javax.microedition.lcdui.Graphics;
/*     */ 
/*     */ public class MessageStatusIcon extends UIField
/*     */ {
/*     */   public static final int MIN_CHUNK_FOR_DOUBLE_STROKE = 5;
/*     */   public static final long HIDE_CLIENT_ACK = 1L;
/*     */   FunXMPP.FMessage _chatMessage;
/*  27 */   public boolean _isFailAlert = false;
/*     */   private long _style;
/*  30 */   private int _prefWidth = -1;
/*  31 */   private int _prefHeight = -1;
/*     */ 
/*     */   public MessageStatusIcon(FunXMPP.FMessage fmsg, long style) {
/*  34 */     super(0L);
/*     */ 
/*  36 */     this._style = style;
/*  37 */     this._chatMessage = fmsg;
/*     */   }
/*     */ 
/*     */   public void layout(int width, int height)
/*     */   {
/*  42 */     if (this._prefWidth == -1) {
/*  43 */       Font defFont = Font.getDefaultFont();
/*  44 */       int calcWidth = defFont.stringWidth("XX");
/*  45 */       this._prefWidth = Math.max(calcWidth, 23);
/*  46 */       this._prefHeight = Math.max(defFont.getHeight(), 20);
/*     */     }
/*  48 */     setExtent(this._prefWidth, this._prefHeight);
/*     */   }
/*     */ 
/*     */   private static void drawCheck(Graphics g, int width, int height, int chunk, int xShift, int yShift, int foreColor, int shadowColor)
/*     */   {
/*  54 */     g.setColor(foreColor);
/*  55 */     g.drawLine(2 + xShift, 2 * chunk + 2 + yShift, chunk + 1 + xShift, 3 * chunk + 1 + yShift);
/*  56 */     g.drawLine(chunk + 1 + xShift, 3 * chunk + 1 + yShift, 3 * chunk + 1 + xShift, chunk + 1 + yShift);
/*  57 */     if (chunk >= 5)
/*     */     {
/*  59 */       g.drawLine(2 + xShift, 2 * chunk + 1 + yShift, chunk + 2 + xShift, 3 * chunk + 1 + yShift);
/*  60 */       g.drawLine(3 + xShift, 2 * chunk + 1 + yShift, chunk + 2 + xShift, 3 * chunk + yShift);
/*     */ 
/*  62 */       g.drawLine(chunk + 2 + xShift, 3 * chunk + 1 + yShift, 3 * chunk + 2 + xShift, chunk + 1 + yShift);
/*     */ 
/*  64 */       g.drawLine(chunk + 2 + xShift, 3 * chunk - 1 + yShift, 3 * chunk + xShift, chunk + 1 + yShift);
/*     */ 
/*  66 */       g.setColor(shadowColor);
/*  67 */       g.drawLine(chunk + 3 + xShift, 3 * chunk + 1 + yShift, 3 * chunk + 2 + xShift, chunk + 2 + yShift);
/*     */     }
/*     */   }
/*     */ 
/*     */   private static void serverAck(Graphics g, int x, int y, int width, int height, boolean reverseVideo)
/*     */   {
/*  73 */     int smallestDim = Math.min(width, height);
/*  74 */     int chunk = smallestDim / 4;
/*     */     int shadowColor;
/*     */     int foreColor;
/*     */     int shadowColor;
/*  79 */     if (reverseVideo) {
/*  80 */       int foreColor = 16777215;
/*  81 */       shadowColor = 8421504;
/*     */     } else {
/*  83 */       foreColor = 32768;
/*  84 */       shadowColor = 9498256;
/*     */     }
/*     */ 
/*  87 */     drawCheck(g, width, height, chunk, x, y, foreColor, shadowColor);
/*     */   }
/*     */ 
/*     */   private static void clientAck(Graphics g, int x, int y, int width, int height, boolean reverseVideo) {
/*  91 */     int smallestDim = Math.min(width, height);
/*  92 */     int chunk = smallestDim / 4;
/*     */     int shadowColor;
/*     */     int foreColor;
/*     */     int shadowColor;
/*  97 */     if (reverseVideo) {
/*  98 */       int foreColor = 16777215;
/*  99 */       shadowColor = 8421504;
/*     */     } else {
/* 101 */       foreColor = 32768;
/* 102 */       shadowColor = 9498256;
/*     */     }
/* 104 */     drawCheck(g, width, height, chunk, chunk + x, y, foreColor, shadowColor);
/* 105 */     drawCheck(g, width, height, chunk, x, y, foreColor, shadowColor);
/*     */   }
/*     */ 
/*     */   private static void drawTriangle(Graphics g, int x, int y, int width, int height) {
/* 109 */     int[] xPts = { width / 3, 2 * width / 3, width / 3 };
/* 110 */     int[] yPts = { height / 8, height / 2, 7 * height / 8 };
/* 111 */     g.fillTriangle(x + xPts[0], y + yPts[0], x + xPts[1], y + yPts[1], x + xPts[2], y + yPts[2]);
/*     */   }
/*     */ 
/*     */   private static void drawAlert(Graphics g, int x, int y, int width, int height) {
/* 115 */     g.setColor(16711680);
/* 116 */     int[] xPts = { width / 3, 2 * width / 3, width / 3 };
/* 117 */     int[] yPts = { height / 8, height / 2, 7 * height / 8 };
/* 118 */     g.fillTriangle(x + xPts[0], y + yPts[0], x + xPts[1], y + yPts[1], x + xPts[2], y + yPts[2]);
/*     */   }
/*     */ 
/*     */   private static void drawFail(Graphics g, int x, int y, int width, int height, boolean reverseVideo) {
/* 122 */     int smallestDim = Math.min(width, height);
/* 123 */     int chunk = smallestDim / 4;
/*     */     int foreColor;
/*     */     int foreColor;
/* 127 */     if (reverseVideo)
/* 128 */       foreColor = 16777215;
/*     */     else {
/* 130 */       foreColor = 16711680;
/*     */     }
/* 132 */     g.setColor(foreColor);
/* 133 */     g.drawLine(x + chunk + 0, y + chunk + 0, x + chunk * 3 + 0, y + chunk * 3 + 0);
/* 134 */     g.drawLine(x + chunk + 1, y + chunk + 0, x + chunk * 3 + 0, y + chunk * 3 - 1);
/* 135 */     g.drawLine(x + chunk + 0, y + chunk + 1, x + chunk * 3 - 1, y + chunk * 3 + 0);
/*     */ 
/* 137 */     g.drawLine(x + chunk * 3 + 0, y + chunk + 0, x + chunk + 0, y + chunk * 3 + 0);
/* 138 */     g.drawLine(x + chunk * 3 - 1, y + chunk + 0, x + chunk + 0, y + chunk * 3 - 1);
/* 139 */     g.drawLine(x + chunk * 3 + 0, y + chunk + 1, x + chunk + 1, y + chunk * 3 + 0);
/*     */   }
/*     */ 
/*     */   private static void drawSending(Graphics g, int x, int y, int width, int height)
/*     */   {
/* 144 */     int smallestDim = Math.min(width, height);
/*     */ 
/* 146 */     int watchWidth = smallestDim * 5 / 6;
/*     */ 
/* 148 */     int xOrig = x + (width / 2 - watchWidth / 2);
/* 149 */     int yOrig = y + (height / 2 - watchWidth / 2);
/* 150 */     g.setColor(9109504);
/* 151 */     g.fillRoundRect(xOrig, yOrig, watchWidth, watchWidth, 4, 4);
/* 152 */     g.setColor(16777215);
/* 153 */     g.fillRoundRect(xOrig + 2, yOrig + 2, watchWidth - 4, watchWidth - 4, 4, 4);
/*     */ 
/* 155 */     g.setColor(9109504);
/* 156 */     g.drawLine(x + width / 2, y + height / 2, x + width / 2, y + (height / 2 - watchWidth / 4));
/* 157 */     g.drawLine(x + width / 2, y + height / 2, x + width / 2 + watchWidth / 4, y + height / 2);
/*     */   }
/*     */ 
/*     */   public static void paintStatusIcon(Graphics g, FunXMPP.FMessage fmsg, int x, int y, int width, int height, boolean hideClientAck, boolean unread, boolean reverseVideo)
/*     */   {
/* 163 */     int origColor = g.getColor();
/* 164 */     if (!fmsg.key.from_me) {
/* 165 */       if (unread)
/* 166 */         g.setColor(14329120);
/*     */       else {
/* 168 */         g.setColor(13882323);
/*     */       }
/* 170 */       drawTriangle(g, x, y, width, height);
/* 171 */     } else if ((fmsg.status == 4) || ((hideClientAck) && (fmsg.status == 5)))
/*     */     {
/* 173 */       serverAck(g, x, y, width, height, reverseVideo);
/* 174 */     } else if (fmsg.status == 5) {
/* 175 */       clientAck(g, x, y, width, height, reverseVideo);
/* 176 */     } else if (fmsg.status == 6) {
/* 177 */       drawAlert(g, x, y, width, height);
/* 178 */     } else if (fmsg.status == 7) {
/* 179 */       drawFail(g, x, y, width, height, reverseVideo);
/*     */     } else {
/* 181 */       drawSending(g, x, y, width, height);
/*     */     }
/* 183 */     g.setColor(origColor);
/*     */   }
/*     */ 
/*     */   public void paint(Graphics g, int x, int y, int width, int height)
/*     */   {
/* 189 */     boolean hideClientAck = (this._style & 1L) != 0L;
/* 190 */     paintStatusIcon(g, this._chatMessage, x, y, width, height, hideClientAck, true, false);
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.MessageStatusIcon
 * JD-Core Version:    0.6.0
 */