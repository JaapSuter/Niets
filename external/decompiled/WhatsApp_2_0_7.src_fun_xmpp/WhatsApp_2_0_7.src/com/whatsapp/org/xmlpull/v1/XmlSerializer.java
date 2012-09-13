package com.whatsapp.org.xmlpull.v1;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

public abstract interface XmlSerializer
{
  public abstract void setFeature(String paramString, boolean paramBoolean)
    throws IllegalArgumentException, IllegalStateException;

  public abstract boolean getFeature(String paramString);

  public abstract void setProperty(String paramString, Object paramObject)
    throws IllegalArgumentException, IllegalStateException;

  public abstract Object getProperty(String paramString);

  public abstract void setOutput(OutputStream paramOutputStream, String paramString)
    throws IOException, IllegalArgumentException, IllegalStateException;

  public abstract void setOutput(Writer paramWriter)
    throws IOException, IllegalArgumentException, IllegalStateException;

  public abstract void startDocument(String paramString, Boolean paramBoolean)
    throws IOException, IllegalArgumentException, IllegalStateException;

  public abstract void endDocument()
    throws IOException, IllegalArgumentException, IllegalStateException;

  public abstract void setPrefix(String paramString1, String paramString2)
    throws IOException, IllegalArgumentException, IllegalStateException;

  public abstract String getPrefix(String paramString, boolean paramBoolean)
    throws IllegalArgumentException;

  public abstract int getDepth();

  public abstract String getNamespace();

  public abstract String getName();

  public abstract XmlSerializer startTag(String paramString1, String paramString2)
    throws IOException, IllegalArgumentException, IllegalStateException;

  public abstract XmlSerializer attribute(String paramString1, String paramString2, String paramString3)
    throws IOException, IllegalArgumentException, IllegalStateException;

  public abstract XmlSerializer endTag(String paramString1, String paramString2)
    throws IOException, IllegalArgumentException, IllegalStateException;

  public abstract XmlSerializer text(String paramString)
    throws IOException, IllegalArgumentException, IllegalStateException;

  public abstract XmlSerializer text(char[] paramArrayOfChar, int paramInt1, int paramInt2)
    throws IOException, IllegalArgumentException, IllegalStateException;

  public abstract void cdsect(String paramString)
    throws IOException, IllegalArgumentException, IllegalStateException;

  public abstract void entityRef(String paramString)
    throws IOException, IllegalArgumentException, IllegalStateException;

  public abstract void processingInstruction(String paramString)
    throws IOException, IllegalArgumentException, IllegalStateException;

  public abstract void comment(String paramString)
    throws IOException, IllegalArgumentException, IllegalStateException;

  public abstract void docdecl(String paramString)
    throws IOException, IllegalArgumentException, IllegalStateException;

  public abstract void ignorableWhitespace(String paramString)
    throws IOException, IllegalArgumentException, IllegalStateException;

  public abstract void flush()
    throws IOException;
}

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.org.xmlpull.v1.XmlSerializer
 * JD-Core Version:    0.6.0
 */