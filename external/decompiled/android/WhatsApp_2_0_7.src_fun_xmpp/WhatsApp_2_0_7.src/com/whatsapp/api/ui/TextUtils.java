/*    */ package com.whatsapp.api.ui;
/*    */ 
/*    */ import java.util.Vector;
/*    */ import javax.microedition.lcdui.Font;
/*    */ import javax.microedition.lcdui.Graphics;
/*    */ 
/*    */ public class TextUtils
/*    */ {
/*    */   static final String ELLIPSIS = "...";
/*    */ 
/*    */   public static Vector simpleWrap(Font f, String s, int width)
/*    */   {
/* 22 */     Vector res = new Vector();
/*    */ 
/* 25 */     int lastLine = 0;
/* 26 */     int lastSpace = 0;
/* 27 */     int runningWidth = 0;
/* 28 */     int widthSinceSpace = 0;
/* 29 */     for (int i = 0; i < s.length(); i++) {
/* 30 */       char c = s.charAt(i);
/*    */ 
/* 32 */       if (c == '\n')
/*    */       {
/* 34 */         res.addElement(s.substring(lastLine, i));
/* 35 */         lastLine = lastSpace = i + 1;
/* 36 */         runningWidth = widthSinceSpace = 0;
/*    */       }
/*    */       else {
/* 39 */         int curWidth = f.charWidth(c);
/* 40 */         widthSinceSpace += curWidth;
/* 41 */         if (c == ' ') {
/* 42 */           lastSpace = i;
/* 43 */           widthSinceSpace = 0;
/*    */         }
/* 45 */         if (runningWidth + curWidth > width)
/*    */         {
/* 47 */           if (lastSpace > lastLine)
/*    */           {
/* 49 */             res.addElement(s.substring(lastLine, lastSpace));
/* 50 */             lastLine = lastSpace + 1;
/* 51 */             runningWidth = widthSinceSpace;
/*    */           }
/*    */           else {
/* 54 */             res.addElement(s.substring(lastLine, i));
/* 55 */             lastLine = lastSpace = i;
/* 56 */             runningWidth = widthSinceSpace = 0;
/*    */           }
/*    */         }
/* 59 */         else runningWidth += curWidth;
/*    */       }
/*    */     }
/* 62 */     if (i > lastLine) {
/* 63 */       res.addElement(s.substring(lastLine, i));
/*    */     }
/*    */ 
/* 66 */     return res;
/*    */   }
/*    */ 
/*    */   public static void drawStringElided(Graphics g, String text, int x, int y, int width)
/*    */   {
/* 72 */     Font f = g.getFont();
/* 73 */     if (f.stringWidth(text) > width)
/*    */     {
/* 75 */       int ellipsisWidth = f.stringWidth("...");
/* 76 */       int textWidth = width - ellipsisWidth;
/* 77 */       int origLen = text.length();
/*    */ 
/* 79 */       String useStr = null;
/* 80 */       for (int snip = 1; snip < origLen; snip++) {
/* 81 */         useStr = text.substring(0, origLen - snip);
/* 82 */         if (f.stringWidth(useStr) < textWidth) {
/*    */           break;
/*    */         }
/*    */       }
/* 86 */       if ((useStr != null) && (snip < origLen)) {
/* 87 */         g.drawString(useStr + "...", x, y, 20);
/*    */       }
/*    */       else
/* 90 */         return;
/*    */     }
/*    */     else {
/* 93 */       g.drawString(text, x, y, 20);
/*    */     }
/*    */   }
/*    */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.api.ui.TextUtils
 * JD-Core Version:    0.6.0
 */