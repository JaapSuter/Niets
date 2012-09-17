/*    */ package com.whatsapp.api.ui;
/*    */ 
/*    */ import com.whatsapp.api.util.DateTimeUtilities;
/*    */ import com.whatsapp.client.FunXMPP.FMessage;
/*    */ import javax.microedition.lcdui.Font;
/*    */ import javax.microedition.lcdui.Graphics;
/*    */ 
/*    */ public class TimeBubbleField extends UIField
/*    */ {
/*    */   private FunXMPP.FMessage _fmsg;
/* 14 */   private String _curFormattedTime = null;
/*    */   private long _timestamp;
/* 22 */   private int hPadding = 1;
/*    */ 
/* 24 */   private static Font clockFont = Font.getFont(0, 1, 8);
/*    */ 
/* 26 */   private static int fontHeight = clockFont.getHeight();
/*    */ 
/*    */   public TimeBubbleField(FunXMPP.FMessage fmsg)
/*    */   {
/* 18 */     super(0L);
/* 19 */     this._fmsg = fmsg;
/*    */   }
/*    */ 
/*    */   public void setTime(long newTime)
/*    */   {
/* 29 */     this._timestamp = newTime;
/* 30 */     this._curFormattedTime = null;
/*    */   }
/*    */ 
/*    */   public void layout(int width, int height) {
/* 34 */     long now = System.currentTimeMillis();
/* 35 */     if (this._curFormattedTime != null)
/* 36 */       return;
/*    */     long stamp;
/*    */     long stamp;
/* 39 */     if (this._fmsg != null)
/* 40 */       stamp = this._fmsg.timestamp;
/*    */     else {
/* 42 */       stamp = this._timestamp;
/*    */     }
/* 44 */     if (DateTimeUtilities.isSameDate(now, stamp))
/* 45 */       this._curFormattedTime = DateTimeUtilities.shortTimeFormat(stamp);
/* 46 */     else if (now - stamp > 31536000000L) {
/* 47 */       this._curFormattedTime = (DateTimeUtilities.dayOfYear(stamp) + " " + DateTimeUtilities.shortTimeFormat(stamp));
/*    */     }
/*    */     else {
/* 50 */       this._curFormattedTime = (DateTimeUtilities.simpleDayFormat(stamp) + " " + DateTimeUtilities.shortTimeFormat(stamp));
/*    */     }
/*    */ 
/* 53 */     int neededWidth = clockFont.stringWidth(this._curFormattedTime) + this.hPadding * 2;
/* 54 */     int neededHeight = fontHeight;
/* 55 */     setExtent(neededWidth, neededHeight);
/*    */   }
/*    */ 
/*    */   public void paint(Graphics g, int x, int y, int width, int height) {
/* 59 */     g.setColor(0);
/* 60 */     g.fillRoundRect(x, y, width, height, 5, 5);
/* 61 */     g.setColor(32768);
/* 62 */     Font origFont = g.getFont();
/* 63 */     g.setFont(clockFont);
/* 64 */     g.drawString(this._curFormattedTime, x + this.hPadding, y, 20);
/* 65 */     g.setFont(origFont);
/*    */   }
/*    */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.api.ui.TimeBubbleField
 * JD-Core Version:    0.6.0
 */