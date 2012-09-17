/*    */ package com.whatsapp.org.xmlpull.v1;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class XmlPullParserException extends Exception
/*    */ {
/*    */   protected Throwable detail;
/* 13 */   protected int row = -1;
/* 14 */   protected int column = -1;
/*    */ 
/*    */   public XmlPullParserException(String s)
/*    */   {
/* 20 */     super(s);
/*    */   }
/*    */ 
/*    */   public XmlPullParserException(String msg, XmlPullParser parser, Throwable chain)
/*    */   {
/* 37 */     super((msg == null ? "" : new StringBuffer().append(msg).append(" ").toString()) + (parser == null ? "" : new StringBuffer().append("(position:").append(parser.getPositionDescription()).append(") ").toString()) + (chain == null ? "" : new StringBuffer().append("caused by: ").append(chain).toString()));
/*    */ 
/* 41 */     if (parser != null) {
/* 42 */       this.row = parser.getLineNumber();
/* 43 */       this.column = parser.getColumnNumber();
/*    */     }
/* 45 */     this.detail = chain;
/*    */   }
/*    */   public Throwable getDetail() {
/* 48 */     return this.detail;
/*    */   }
/* 50 */   public int getLineNumber() { return this.row; } 
/* 51 */   public int getColumnNumber() { return this.column;
/*    */   }
/*    */ 
/*    */   public void printStackTrace()
/*    */   {
/* 65 */     if (this.detail == null)
/* 66 */       super.printStackTrace();
/*    */     else
/* 68 */       synchronized (System.err) {
/* 69 */         System.err.println(super.getMessage() + "; nested exception is:");
/* 70 */         this.detail.printStackTrace();
/*    */       }
/*    */   }
/*    */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.org.xmlpull.v1.XmlPullParserException
 * JD-Core Version:    0.6.0
 */