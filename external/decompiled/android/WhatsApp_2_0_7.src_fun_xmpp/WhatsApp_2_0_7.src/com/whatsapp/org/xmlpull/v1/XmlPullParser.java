/*     */ package com.whatsapp.org.xmlpull.v1;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.Reader;
/*     */ 
/*     */ public abstract interface XmlPullParser
/*     */ {
/*     */   public static final String NO_NAMESPACE = "";
/*     */   public static final int START_DOCUMENT = 0;
/*     */   public static final int END_DOCUMENT = 1;
/*     */   public static final int START_TAG = 2;
/*     */   public static final int END_TAG = 3;
/*     */   public static final int TEXT = 4;
/*     */   public static final int CDSECT = 5;
/*     */   public static final int ENTITY_REF = 6;
/*     */   public static final int IGNORABLE_WHITESPACE = 7;
/*     */   public static final int PROCESSING_INSTRUCTION = 8;
/*     */   public static final int COMMENT = 9;
/*     */   public static final int DOCDECL = 10;
/* 330 */   public static final String[] TYPES = { "START_DOCUMENT", "END_DOCUMENT", "START_TAG", "END_TAG", "TEXT", "CDSECT", "ENTITY_REF", "IGNORABLE_WHITESPACE", "PROCESSING_INSTRUCTION", "COMMENT", "DOCDECL" };
/*     */   public static final String FEATURE_PROCESS_NAMESPACES = "http://xmlpull.org/v1/doc/features.html#process-namespaces";
/*     */   public static final String FEATURE_REPORT_NAMESPACE_ATTRIBUTES = "http://xmlpull.org/v1/doc/features.html#report-namespace-prefixes";
/*     */   public static final String FEATURE_PROCESS_DOCDECL = "http://xmlpull.org/v1/doc/features.html#process-docdecl";
/*     */   public static final String FEATURE_VALIDATION = "http://xmlpull.org/v1/doc/features.html#validation";
/*     */ 
/*     */   public abstract void setFeature(String paramString, boolean paramBoolean)
/*     */     throws XmlPullParserException;
/*     */ 
/*     */   public abstract boolean getFeature(String paramString);
/*     */ 
/*     */   public abstract void setProperty(String paramString, Object paramObject)
/*     */     throws XmlPullParserException;
/*     */ 
/*     */   public abstract Object getProperty(String paramString);
/*     */ 
/*     */   public abstract void setInput(Reader paramReader)
/*     */     throws XmlPullParserException;
/*     */ 
/*     */   public abstract void setInput(InputStream paramInputStream, String paramString)
/*     */     throws XmlPullParserException;
/*     */ 
/*     */   public abstract String getInputEncoding();
/*     */ 
/*     */   public abstract void defineEntityReplacementText(String paramString1, String paramString2)
/*     */     throws XmlPullParserException;
/*     */ 
/*     */   public abstract int getNamespaceCount(int paramInt)
/*     */     throws XmlPullParserException;
/*     */ 
/*     */   public abstract String getNamespacePrefix(int paramInt)
/*     */     throws XmlPullParserException;
/*     */ 
/*     */   public abstract String getNamespaceUri(int paramInt)
/*     */     throws XmlPullParserException;
/*     */ 
/*     */   public abstract String getNamespace(String paramString);
/*     */ 
/*     */   public abstract int getDepth();
/*     */ 
/*     */   public abstract String getPositionDescription();
/*     */ 
/*     */   public abstract int getLineNumber();
/*     */ 
/*     */   public abstract int getColumnNumber();
/*     */ 
/*     */   public abstract boolean isWhitespace()
/*     */     throws XmlPullParserException;
/*     */ 
/*     */   public abstract String getText();
/*     */ 
/*     */   public abstract char[] getTextCharacters(int[] paramArrayOfInt);
/*     */ 
/*     */   public abstract String getNamespace();
/*     */ 
/*     */   public abstract String getName();
/*     */ 
/*     */   public abstract String getPrefix();
/*     */ 
/*     */   public abstract boolean isEmptyElementTag()
/*     */     throws XmlPullParserException;
/*     */ 
/*     */   public abstract int getAttributeCount();
/*     */ 
/*     */   public abstract String getAttributeNamespace(int paramInt);
/*     */ 
/*     */   public abstract String getAttributeName(int paramInt);
/*     */ 
/*     */   public abstract String getAttributePrefix(int paramInt);
/*     */ 
/*     */   public abstract String getAttributeType(int paramInt);
/*     */ 
/*     */   public abstract boolean isAttributeDefault(int paramInt);
/*     */ 
/*     */   public abstract String getAttributeValue(int paramInt);
/*     */ 
/*     */   public abstract String getAttributeValue(String paramString1, String paramString2);
/*     */ 
/*     */   public abstract int getEventType()
/*     */     throws XmlPullParserException;
/*     */ 
/*     */   public abstract int next()
/*     */     throws XmlPullParserException, IOException;
/*     */ 
/*     */   public abstract int nextToken()
/*     */     throws XmlPullParserException, IOException;
/*     */ 
/*     */   public abstract void require(int paramInt, String paramString1, String paramString2)
/*     */     throws XmlPullParserException, IOException;
/*     */ 
/*     */   public abstract String nextText()
/*     */     throws XmlPullParserException, IOException;
/*     */ 
/*     */   public abstract int nextTag()
/*     */     throws XmlPullParserException, IOException;
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.org.xmlpull.v1.XmlPullParser
 * JD-Core Version:    0.6.0
 */