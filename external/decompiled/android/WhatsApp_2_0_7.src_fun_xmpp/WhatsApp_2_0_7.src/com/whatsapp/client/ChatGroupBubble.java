/*     */ package com.whatsapp.client;
/*     */ 
/*     */ import com.whatsapp.api.ui.TimeBubbleField;
/*     */ import com.whatsapp.api.ui.VerticalFieldManager;
/*     */ import javax.microedition.lcdui.Graphics;
/*     */ 
/*     */ public class ChatGroupBubble extends VerticalFieldManager
/*     */ {
/*     */   public static final long TAIL_LEFT = 1L;
/*     */   public static final long TAIL_RIGHT = 2L;
/*     */   public static final long NO_BORDER = 4L;
/*     */   public static final int FROM_US_COLOR = 16777215;
/*     */   public static final int FROM_THEM_COLOR = 13421823;
/*     */   public static final int TAIL_WIDTH = 8;
/*     */   public static final int TAIL_HEIGHT = 8;
/*     */   public static final int TAIL_VPOS = 6;
/*     */   private ShadedLabelField _header;
/*     */   private int _headerCount;
/*     */   private long _style;
/*     */   private int _backgroundColor;
/*     */ 
/*     */   public ChatGroupBubble(long style)
/*     */   {
/*  39 */     super(0L);
/*  40 */     this._style = style;
/*  41 */     boolean tailLeft = (this._style & 1L) != 0L;
/*  42 */     boolean tailRight = (this._style & 0x2) != 0L;
/*  43 */     setPadding(1, (tailRight ? 8 : 1) + 1, 1, (tailLeft ? 8 : 0) + 1);
/*  44 */     this._backgroundColor = (tailRight ? 16777215 : 13421823);
/*  45 */     this._headerCount = 0;
/*     */   }
/*     */ 
/*     */   public ChatGroupBubble(String titleText, long style) {
/*  49 */     this(style);
/*  50 */     this._header = new ShadedLabelField(titleText, ChatsListItem.smallFont);
/*  51 */     TimeBubbleField timeF = new TimeBubbleField(null);
/*  52 */     timeF.setMargin(1, 2, 1, 1);
/*  53 */     this._header.add(timeF);
/*     */ 
/*  55 */     add(this._header);
/*  56 */     this._headerCount = 1;
/*     */   }
/*     */ 
/*     */   public void setText(String s)
/*     */   {
/*  66 */     if (this._header != null)
/*  67 */       this._header.setText(s);
/*     */   }
/*     */ 
/*     */   public void setBackgroundColor(int c)
/*     */   {
/*  72 */     this._backgroundColor = c;
/*     */   }
/*     */ 
/*     */   public void appendChatLine(ChatLine chatLine) {
/*  76 */     add(chatLine);
/*     */   }
/*     */ 
/*     */   public void prependChatLine(ChatLine chatLine) {
/*  80 */     insertAt(chatLine, this._headerCount);
/*     */   }
/*     */ 
/*     */   public ChatLine firstChatline() {
/*  84 */     if (getNumChildren() > this._headerCount) {
/*  85 */       return (ChatLine)getChildAt(this._headerCount);
/*     */     }
/*  87 */     return null;
/*     */   }
/*     */ 
/*     */   public int getHeaderHeight()
/*     */   {
/*  92 */     if (this._header != null) {
/*  93 */       return this._header.getHeight() + 2;
/*     */     }
/*  95 */     return 0;
/*     */   }
/*     */ 
/*     */   public void sublayout(int width, int height)
/*     */   {
/* 101 */     if ((this._header != null) && 
/* 102 */       (this._header.getNumChildren() > 0)) {
/* 103 */       TimeBubbleField timeF = (TimeBubbleField)this._header.getChildAt(0);
/* 104 */       FunXMPP.FMessage lastFmsg = ((ChatLine)getChildAt(getNumChildren() - 1))._fmsg;
/* 105 */       timeF.setTime(lastFmsg.timestamp);
/*     */     }
/*     */ 
/* 108 */     super.sublayout(width, height);
/*     */   }
/*     */ 
/*     */   public void paint(Graphics g, int x, int y, int width, int height)
/*     */   {
/* 114 */     boolean tailLeft = (this._style & 1L) != 0L;
/* 115 */     boolean tailRight = (this._style & 0x2) != 0L;
/* 116 */     boolean noBorder = (this._style & 0x4) != 0L;
/* 117 */     if (!noBorder) {
/* 118 */       g.setColor(0);
/* 119 */       int borderXLeft = x + (tailLeft ? 8 : 0);
/* 120 */       int roundedRectWidth = getWidth() - (tailLeft ? 9 : 1) - (tailRight ? 9 : 1);
/*     */ 
/* 123 */       g.setColor(this._backgroundColor);
/* 124 */       g.fillRect(borderXLeft, y, roundedRectWidth, getHeight());
/* 125 */       g.setColor(0);
/* 126 */       g.drawRect(borderXLeft, y, roundedRectWidth, getHeight() - 1);
/*     */ 
/* 128 */       if (tailRight) {
/* 129 */         g.setColor(this._backgroundColor);
/* 130 */         int[] xPts = { x + getWidth() - 8 - 1, x + getWidth() - 1, x + getWidth() - 8 - 1 };
/* 131 */         int[] yPts = { y + getHeight() - 14, y + getHeight() - 6, y + getHeight() - 6 };
/* 132 */         g.fillTriangle(xPts[0], yPts[0], xPts[1], yPts[1], xPts[2], yPts[2]);
/*     */ 
/* 134 */         g.drawLine(xPts[0] - 1, yPts[0], xPts[2] - 1, yPts[2] - 1);
/* 135 */         g.setColor(0);
/* 136 */         g.drawLine(xPts[0], yPts[0], xPts[1], yPts[1]);
/* 137 */         g.drawLine(xPts[1], yPts[1], xPts[2], yPts[2]);
/*     */       }
/* 139 */       if (tailLeft) {
/* 140 */         g.setColor(this._backgroundColor);
/* 141 */         int[] xPts = { x + 8, x, x + 8 };
/* 142 */         int[] yPts = { y + getHeight() - 14, y + getHeight() - 6, y + getHeight() - 6 };
/* 143 */         g.fillTriangle(xPts[0], yPts[0], xPts[1], yPts[1], xPts[2], yPts[2]);
/*     */ 
/* 145 */         g.drawLine(xPts[0], yPts[0], xPts[2], yPts[2]);
/* 146 */         g.setColor(0);
/* 147 */         g.drawLine(xPts[0], yPts[0], xPts[1], yPts[1]);
/* 148 */         g.drawLine(xPts[1], yPts[1], xPts[2], yPts[2]);
/*     */       }
/*     */     }
/*     */ 
/* 152 */     super.paint(g, x, y, width, height);
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.ChatGroupBubble
 * JD-Core Version:    0.6.0
 */