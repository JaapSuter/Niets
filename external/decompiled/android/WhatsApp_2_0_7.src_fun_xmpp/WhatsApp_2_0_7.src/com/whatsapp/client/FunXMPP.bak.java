/*      */ package com.whatsapp.client;
/*      */ 
/*      */ import com.whatsapp.api.util.MessageDigest;
/*      */ import com.whatsapp.api.util.Utilities;
/*      */ import com.whatsapp.org.bouncycastle.util.encoders.Base64;
/*      */ import com.whatsapp.org.it.yup.xml.KXmlParser;
/*      */ import com.whatsapp.org.xmlpull.v1.XmlPullParser;
/*      */ import com.whatsapp.org.xmlpull.v1.XmlPullParserException;
/*      */ import java.io.ByteArrayInputStream;
/*      */ import java.io.ByteArrayOutputStream;
/*      */ import java.io.EOFException;
/*      */ import java.io.IOException;
/*      */ import java.io.InputStream;
/*      */ import java.io.OutputStream;
/*      */ import java.io.PrintStream;
/*      */ import java.io.Reader;
/*      */ import java.io.UnsupportedEncodingException;
/*      */ import java.io.Writer;
/*      */ import java.util.Date;
/*      */ import java.util.Enumeration;
/*      */ import java.util.Hashtable;
/*      */ import java.util.Random;
/*      */ import java.util.Vector;
/*      */ 
/*      */ public class FunXMPP
/*      */ {
/*   28 */   public static FunStore message_store = new FunStore();
/*      */ 
/* 3239 */   public static String[] dictionary = { null, null, null, null, null, "1", "1.0", "ack", "action", "active", "add", "all", "allow", "apple", "audio", "auth", "author", "available", "bad-request", "base64", "Bell.caf", "bind", "body", "Boing.caf", "cancel", "category", "challenge", "chat", "clean", "code", "composing", "config", "conflict", "contacts", "create", "creation", "default", "delay", "delete", "delivered", "deny", "DIGEST-MD5", "DIGEST-MD5-1", "dirty", "en", "enable", "encoding", "error", "expiration", "expired", "failure", "false", "favorites", "feature", "field", "free", "from", "g.us", "get", "Glass.caf", "google", "group", "groups", "g_sound", "Harp.caf", "http://etherx.jabber.org/streams", "http://jabber.org/protocol/chatstates", "id", "image", "img", "inactive", "internal-server-error", "iq", "item", "item-not-found", "jabber:client", "jabber:iq:last", "jabber:iq:privacy", "jabber:x:delay", "jabber:x:event", "jid", "jid-malformed", "kind", "leave", "leave-all", "list", "location", "max_groups", "max_participants", "max_subject", "mechanism", "mechanisms", "media", "message", "message_acks", "missing", "modify", "name", "not-acceptable", "not-allowed", "not-authorized", "notify", "Offline Storage", "order", "owner", "owning", "paid", "participant", "participants", "participating", "particpants", "paused", "picture", "ping", "PLAIN", "platform", "presence", "preview", "probe", "prop", "props", "p_o", "p_t", "query", "raw", "receipt", "receipt_acks", "received", "relay", "remove", "Replaced by new connection", "request", "resource", "resource-constraint", "response", "result", "retry", "rim", "s.whatsapp.net", "seconds", "server", "session", "set", "show", "sid", "sound", "stamp", "starttls", "status", "stream:error", "stream:features", "subject", "subscribe", "success", "system-shutdown", "s_o", "s_t", "t", "TimePassing.caf", "timestamp", "to", "Tri-tone.caf", "type", "unavailable", "uri", "url", "urn:ietf:params:xml:ns:xmpp-bind", "urn:ietf:params:xml:ns:xmpp-sasl", "urn:ietf:params:xml:ns:xmpp-session", "urn:ietf:params:xml:ns:xmpp-stanzas", "urn:ietf:params:xml:ns:xmpp-streams", "urn:xmpp:delay", "urn:xmpp:ping", "urn:xmpp:receipts", "urn:xmpp:whatsapp", "urn:xmpp:whatsapp:dirty", "urn:xmpp:whatsapp:mms", "urn:xmpp:whatsapp:push", "value", "vcard", "version", "video", "w", "w:g", "w:p:r", "wait", "x", "xml-not-well-formed", "xml:lang", "xmlns", "xmlns:stream", "Xylophone.caf" };
/*      */ 
/*      */   public static void destroyMessage(FMessage fmessage)
/*      */   {
/*   31 */     message_store.remove(fmessage.key);
/*      */   }
/*      */ 
/*      */   public static String removeResourceFromJID(String jid) {
/*   35 */     int slashidx = jid.indexOf('/');
/*   36 */     if (slashidx == -1) {
/*   37 */       return jid;
/*      */     }
/*   39 */     return jid.substring(0, slashidx);
/*      */   }
/*      */ 
/*      */   public static String getResourceFromJID(String jid) {
/*   43 */     int slashidx = jid.indexOf('/');
/*   44 */     if (slashidx == -1) {
/*   45 */       return "";
/*      */     }
/*   47 */     return jid.substring(slashidx + 1);
/*      */   }
/*      */ 
/*      */   public static String getTextAndEntities(XmlPullParser parser) throws IOException, XmlPullParserException {
/*   51 */     StringBuffer ret = new StringBuffer();
/*   52 */     parser.nextToken();
/*   53 */     while (parser.getEventType() != 3) {
/*   54 */       if ((parser.getEventType() == 6) || (parser.getEventType() == 4)) {
/*   55 */         ret.append(parser.getText());
/*      */       }
/*      */       else {
/*   58 */         throw new XmlPullParserException("getTextAndEntities bad type: " + parser.getEventType());
/*      */       }
/*   60 */       parser.nextToken();
/*      */     }
/*   62 */     return ret.toString();
/*      */   }
/*      */ 
/*      */   public static void ignoreElement(XmlPullParser parser, String startag) throws IOException, XmlPullParserException {
/*   66 */     int depth = 0;
/*      */     while (true)
/*      */     {
/*   69 */       parser.nextToken();
/*   70 */       if ((parser.getEventType() == 4) || (parser.getEventType() == 6)) {
/*      */         continue;
/*      */       }
/*   73 */       if (parser.getEventType() == 2) {
/*   74 */         depth++; continue;
/*      */       }
/*      */ 
/*   77 */       if (depth == 0) {
/*   78 */         parser.require(3, null, startag);
/*   79 */         return;
/*      */       }
/*   81 */       parser.require(3, null, null);
/*   82 */       depth--;
/*      */     }
/*      */   }
/*      */ 
/*      */   public static final class KeyValue
/*      */   {
/*      */     public final String key;
/*      */     public final String value;
/*      */ 
/*      */     public KeyValue(String k, String v)
/*      */     {
/* 3232 */       if ((v == null) || (k == null)) {
/* 3233 */         throw new NullPointerException();
/*      */       }
/* 3235 */       this.key = k;
/* 3236 */       this.value = v;
/*      */     }
/*      */   }
/*      */ 
/*      */   public static final class ProtocolTreeNode
/*      */   {
/*      */     public final String tag;
/*      */     public final FunXMPP.KeyValue[] attributes;
/*      */     public final ProtocolTreeNode[] children;
/*      */     public final String data;
/*      */ 
/*      */     public ProtocolTreeNode(String tag, FunXMPP.KeyValue[] attributes, ProtocolTreeNode[] children)
/*      */     {
/* 3143 */       this.tag = tag;
/* 3144 */       this.attributes = attributes;
/* 3145 */       this.children = children;
/* 3146 */       this.data = null;
/*      */     }
/*      */     public ProtocolTreeNode(String tag, FunXMPP.KeyValue[] attributes, ProtocolTreeNode child) {
/* 3149 */       this.tag = tag;
/* 3150 */       this.attributes = attributes;
/* 3151 */       this.children = new ProtocolTreeNode[] { child };
/* 3152 */       this.data = null;
/*      */     }
/*      */     public ProtocolTreeNode(String tag, FunXMPP.KeyValue[] attributes, String data) {
/* 3155 */       this.tag = tag;
/* 3156 */       this.attributes = attributes;
/* 3157 */       this.children = null;
/* 3158 */       this.data = data;
/*      */     }
/*      */     public ProtocolTreeNode(String tag, FunXMPP.KeyValue[] attributes) {
/* 3161 */       this.tag = tag;
/* 3162 */       this.attributes = attributes;
/* 3163 */       this.children = null;
/* 3164 */       this.data = null;
/*      */     }
/*      */ 
/*      */     public String getAttributeValue(String string) {
/* 3168 */       if (this.attributes == null) {
/* 3169 */         return null;
/*      */       }
/* 3171 */       for (int i = 0; i < this.attributes.length; i++) {
/* 3172 */         FunXMPP.KeyValue keyValue = this.attributes[i];
/* 3173 */         if (string.equals(keyValue.key)) {
/* 3174 */           return keyValue.value;
/*      */         }
/*      */       }
/* 3177 */       return null;
/*      */     }
/*      */ 
/*      */     public ProtocolTreeNode getChild(String string) {
/* 3181 */       if (this.children == null) {
/* 3182 */         return null;
/*      */       }
/* 3184 */       for (int i = 0; i < this.children.length; i++) {
/* 3185 */         if (string.equals(this.children[i].tag)) {
/* 3186 */           return this.children[i];
/*      */         }
/*      */       }
/* 3189 */       return null;
/*      */     }
/*      */     public static ProtocolTreeNode safeGetChild(ProtocolTreeNode node, int i) throws FunXMPP.CorruptStreamException {
/* 3192 */       if ((node == null) || (node.children == null) || (node.children.length <= i)) {
/* 3193 */         throw new FunXMPP.CorruptStreamException("safeGetChild sees null node/child");
/*      */       }
/* 3195 */       return node.children[i];
/*      */     }
/*      */ 
/*      */     public Vector getAllChildren(String string) {
/* 3199 */       Vector ret = new Vector();
/* 3200 */       if (this.children == null) {
/* 3201 */         return ret;
/*      */       }
/* 3203 */       for (int i = 0; i < this.children.length; i++) {
/* 3204 */         if (string.equals(this.children[i].tag)) {
/* 3205 */           ret.addElement(this.children[i]);
/*      */         }
/*      */       }
/* 3208 */       return ret;
/*      */     }
/*      */     public ProtocolTreeNode getChild(int i) {
/* 3211 */       if ((this.children == null) || (this.children.length <= i)) {
/* 3212 */         return null;
/*      */       }
/* 3214 */       return this.children[i];
/*      */     }
/*      */ 
/*      */     public static void require(ProtocolTreeNode node, String string) throws FunXMPP.CorruptStreamException {
/* 3218 */       if (!tagEquals(node, string))
/* 3219 */         throw new FunXMPP.CorruptStreamException("failed require. node: " + node + " string: " + string);
/*      */     }
/*      */ 
/*      */     public static boolean tagEquals(ProtocolTreeNode node, String string)
/*      */     {
/* 3224 */       return (node != null) && (node.tag != null) && (node.tag.equals(string));
/*      */     }
/*      */   }
/*      */ 
/*      */   public static class XmlTreeNodeReader
/*      */     implements FunXMPP.TreeNodeReader
/*      */   {
/*      */     final Reader in;
/* 3050 */     final KXmlParser parser = new KXmlParser();
/*      */ 
/*      */     public XmlTreeNodeReader(Reader r) throws XmlPullParserException {
/* 3053 */       this.in = r;
/*      */     }
/*      */ 
/*      */     public String lastStanza() {
/* 3057 */       return "";
/*      */     }
/*      */ 
/*      */     public FunXMPP.ProtocolTreeNode nextTree() throws FunXMPP.CorruptStreamException, IOException
/*      */     {
/*      */       try {
/* 3063 */         int eventType = this.parser.nextTag();
/* 3064 */         String tagname = this.parser.getName();
/* 3065 */         if ((eventType == 3) && (tagname.equals("stream:stream"))) {
/* 3066 */           return null;
/*      */         }
/* 3068 */         if (eventType != 2) {
/* 3069 */           throw new FunXMPP.CorruptStreamException("expecting START_TAG in nextTree");
/*      */         }
/* 3071 */         return nextInternalTree(); } catch (XmlPullParserException e) {
/*      */       }
/* 3073 */       throw new FunXMPP.CorruptStreamException("got XmlPullParseX : " + e.toString());
/*      */     }
/*      */ 
/*      */     private FunXMPP.ProtocolTreeNode nextInternalTree()
/*      */       throws XmlPullParserException, IOException, FunXMPP.CorruptStreamException
/*      */     {
/* 3082 */       String tagName = this.parser.getName();
/* 3083 */       int attributeCount = this.parser.getAttributeCount();
/* 3084 */       FunXMPP.KeyValue[] attributes = new FunXMPP.KeyValue[attributeCount];
/* 3085 */       for (int i = 0; i < attributeCount; i++) {
/* 3086 */         attributes[i] = new FunXMPP.KeyValue(this.parser.getAttributeName(i), this.parser.getAttributeValue(i));
/*      */       }
/*      */ 
/* 3090 */       int eventType = this.parser.next();
/* 3091 */       if ((eventType == 4) && (this.parser.isWhitespace())) {
/* 3092 */         eventType = this.parser.next();
/*      */       }
/* 3094 */       if (eventType == 4) {
/* 3095 */         String body = this.parser.getText();
/* 3096 */         if ((this.parser.nextTag() != 3) || (!this.parser.getName().equals(tagName))) {
/* 3097 */           throw new FunXMPP.CorruptStreamException("expecting END_TAG in nextInternalTree TEXT");
/*      */         }
/* 3099 */         return new FunXMPP.ProtocolTreeNode(tagName, attributes, body);
/* 3100 */       }if (eventType == 2) {
/* 3101 */         Vector childrenVector = new Vector();
/*      */         do {
/* 3103 */           childrenVector.addElement(nextInternalTree());
/* 3104 */           eventType = this.parser.nextTag();
/* 3105 */         }while (eventType == 2);
/* 3106 */         if ((eventType != 3) || (this.parser.getName() != tagName))
/*      */         {
/* 3108 */           throw new FunXMPP.CorruptStreamException("expecting END_TAG in nextInternalTree START_TAG");
/*      */         }
/* 3110 */         int size = childrenVector.size();
/* 3111 */         FunXMPP.ProtocolTreeNode[] children = new FunXMPP.ProtocolTreeNode[size];
/* 3112 */         for (int i = 0; i < size; i++) {
/* 3113 */           children[i] = ((FunXMPP.ProtocolTreeNode)childrenVector.elementAt(i));
/*      */         }
/* 3115 */         return new FunXMPP.ProtocolTreeNode(tagName, attributes, children);
/* 3116 */       }if (eventType == 3) {
/* 3117 */         return new FunXMPP.ProtocolTreeNode(tagName, attributes);
/*      */       }
/* 3119 */       throw new FunXMPP.CorruptStreamException("unexpected tag in nextInternalTree");
/*      */     }
/*      */ 
/*      */     public void streamStart() throws IOException, FunXMPP.CorruptStreamException
/*      */     {
/*      */       try {
/* 3125 */         this.parser.setInput(this.in);
/* 3126 */         this.parser.nextTag();
/* 3127 */         this.parser.require(2, null, "stream:stream");
/*      */       } catch (XmlPullParserException x) {
/* 3129 */         throw new FunXMPP.CorruptStreamException("streamStart got xml error: " + x.toString());
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   public static class XmlTreeNodeWriter
/*      */     implements FunXMPP.TreeNodeWriter
/*      */   {
/*      */     final Writer out;
/*      */ 
/*      */     public XmlTreeNodeWriter(Writer w)
/*      */       throws IOException
/*      */     {
/* 2953 */       this.out = w;
/*      */     }
/*      */ 
/*      */     public synchronized void streamStart(String domain, String resource)
/*      */       throws IOException
/*      */     {
/* 2959 */       this.out.write("<stream:stream to=\"");
/* 2960 */       this.out.write(domain);
/* 2961 */       this.out.write("\" version=\"1.0\" xmlns=\"jabber:client\" xmlns:stream=\"http://etherx.jabber.org/streams\">");
/* 2962 */       this.out.flush();
/*      */     }
/*      */     public synchronized void streamEnd() throws IOException {
/* 2965 */       this.out.write("</stream:stream>");
/* 2966 */       this.out.flush();
/*      */     }
/*      */ 
/*      */     public synchronized void write(FunXMPP.ProtocolTreeNode node) throws IOException {
/* 2970 */       write(node, true);
/*      */     }
/*      */ 
/*      */     public synchronized void write(FunXMPP.ProtocolTreeNode node, boolean needsFlush) throws IOException {
/* 2974 */       if (node == null)
/* 2975 */         this.out.write(" ");
/*      */       else {
/* 2977 */         writeInternal(node);
/*      */       }
/* 2979 */       if (needsFlush)
/* 2980 */         this.out.flush();
/*      */     }
/*      */ 
/*      */     private void writeInternal(FunXMPP.ProtocolTreeNode node) throws IOException
/*      */     {
/* 2985 */       writeNode(node);
/*      */     }
/*      */ 
/*      */     private void writeNode(FunXMPP.ProtocolTreeNode node) throws IOException {
/* 2989 */       this.out.write(60);
/* 2990 */       this.out.write(node.tag);
/* 2991 */       if (node.attributes != null) {
/* 2992 */         for (int i = 0; i < node.attributes.length; i++) {
/* 2993 */           this.out.write(32);
/* 2994 */           this.out.write(node.attributes[i].key);
/* 2995 */           this.out.write("='");
/* 2996 */           sendTextConvertEntities(node.attributes[i].value);
/* 2997 */           this.out.write(39);
/*      */         }
/*      */       }
/* 3000 */       if ((node.data == null) && (node.children == null)) {
/* 3001 */         this.out.write("/>");
/*      */       } else {
/* 3003 */         this.out.write(62);
/* 3004 */         if (node.data != null) {
/* 3005 */           sendTextConvertEntities(node.data);
/*      */         }
/* 3007 */         if (node.children != null) {
/* 3008 */           for (int i = 0; i < node.children.length; i++) {
/* 3009 */             writeInternal(node.children[i]);
/*      */           }
/*      */         }
/* 3012 */         this.out.write("</");
/* 3013 */         this.out.write(node.tag);
/* 3014 */         this.out.write(62);
/*      */       }
/*      */     }
/*      */ 
/*      */     void sendTextConvertEntities(String s) throws IOException {
/* 3018 */       int p1 = 0;
/*      */ 
/* 3020 */       for (int p2 = 0; p2 < s.length(); p2++) {
/* 3021 */         String entity = getEntity(s.charAt(p2));
/* 3022 */         if (entity != null) {
/* 3023 */           this.out.write(s, p1, p2 - p1);
/* 3024 */           p1 = p2 + 1;
/* 3025 */           this.out.write(entity);
/*      */         }
/*      */       }
/* 3028 */       this.out.write(s, p1, p2 - p1);
/*      */     }
/*      */     static String getEntity(char c) {
/* 3031 */       switch (c) {
/*      */       case '&':
/* 3033 */         return "&amp;";
/*      */       case '\'':
/* 3035 */         return "&apos;";
/*      */       case '>':
/* 3037 */         return "&gt;";
/*      */       case '<':
/* 3039 */         return "&lt;";
/*      */       case '"':
/* 3041 */         return "&quot;";
/*      */       }
/* 3043 */       return null;
/*      */     }
/*      */   }
/*      */ 
/*      */   public static class BinTreeNodeReader
/*      */     implements FunXMPP.TreeNodeReader
/*      */   {
/*      */     InputStream rawIn;
/*      */     InputStream in;
/* 2748 */     byte[] buf = new byte['ÿ'];
/* 2749 */     int bufSize = 0;
/*      */     String[] tokenMap;
/*      */ 
/*      */     public BinTreeNodeReader(InputStream i, String[] dict)
/*      */     {
/* 2752 */       this.rawIn = new FunXMPP.EofIsExceptionInputStream(i);
/* 2753 */       this.tokenMap = dict;
/*      */     }
/*      */ 
/*      */     public FunXMPP.ProtocolTreeNode nextTree() throws FunXMPP.CorruptStreamException, IOException {
/* 2757 */       int stanzaSize = readInt16(this.rawIn);
/* 2758 */       fillBuffer(stanzaSize);
/* 2759 */       return nextTreeInternal();
/*      */     }
/*      */ 
/*      */     public String lastStanza() {
/* 2763 */       if (this.buf == null) return "null";
/* 2764 */       StringBuffer sb = new StringBuffer();
/* 2765 */       sb.append("size = ").append(Integer.toString(this.bufSize)).append('<');
/*      */ 
/* 2768 */       for (int i = 0; i < this.bufSize; i++) {
/* 2769 */         if (i > 0) {
/* 2770 */           sb.append(", ");
/*      */         }
/* 2772 */         sb.append(Integer.toString(this.buf[i] & 0xFF));
/*      */       }
/* 2774 */       sb.append('>');
/* 2775 */       return sb.toString();
/*      */     }
/*      */ 
/*      */     private FunXMPP.ProtocolTreeNode nextTreeInternal() throws FunXMPP.CorruptStreamException, IOException
/*      */     {
/* 2780 */       int b = this.in.read();
/* 2781 */       int size = readListSize(b);
/* 2782 */       b = this.in.read();
/* 2783 */       if (b == 2) {
/* 2784 */         return null;
/*      */       }
/* 2786 */       String tag = readString(b);
/* 2787 */       if ((size == 0) || (tag == null)) {
/* 2788 */         throw new FunXMPP.CorruptStreamException("nextTree sees 0 list or null tag");
/*      */       }
/* 2790 */       int attribCount = (size - 2 + size % 2) / 2;
/* 2791 */       FunXMPP.KeyValue[] attribs = readAttributes(attribCount);
/* 2792 */       if (size % 2 == 1) {
/* 2793 */         return new FunXMPP.ProtocolTreeNode(tag, attribs);
/*      */       }
/* 2795 */       b = this.in.read();
/* 2796 */       if (isListTag(b)) {
/* 2797 */         return new FunXMPP.ProtocolTreeNode(tag, attribs, readList(b));
/*      */       }
/* 2799 */       return new FunXMPP.ProtocolTreeNode(tag, attribs, readString(b));
/*      */     }
/*      */ 
/*      */     private boolean isListTag(int b)
/*      */     {
/* 2804 */       return (b == 248) || (b == 0) || (b == 249);
/*      */     }
/*      */ 
/*      */     private FunXMPP.KeyValue[] readAttributes(int attribCount) throws IOException, FunXMPP.CorruptStreamException {
/* 2808 */       FunXMPP.KeyValue[] attribs = new FunXMPP.KeyValue[attribCount];
/* 2809 */       for (int i = 0; i < attribCount; i++) {
/* 2810 */         String key = readString();
/* 2811 */         String value = readString();
/* 2812 */         attribs[i] = new FunXMPP.KeyValue(key, value);
/*      */       }
/* 2814 */       return attribs;
/*      */     }
/*      */ 
/*      */     private FunXMPP.ProtocolTreeNode[] readList(int token) throws FunXMPP.CorruptStreamException, IOException {
/* 2818 */       int size = readListSize(token);
/* 2819 */       FunXMPP.ProtocolTreeNode[] list = new FunXMPP.ProtocolTreeNode[size];
/* 2820 */       for (int i = 0; i < size; i++) {
/* 2821 */         list[i] = nextTreeInternal();
/*      */       }
/* 2823 */       return list;
/*      */     }
/*      */ 
/*      */     private int readListSize(int token)
/*      */       throws IOException, FunXMPP.CorruptStreamException
/*      */     {
/*      */       int size;
/* 2828 */       if (token == 0) {
/* 2829 */         size = 0;
/*      */       }
/*      */       else
/*      */       {
/*      */         int size;
/* 2830 */         if (token == 248) {
/* 2831 */           size = readInt8(this.in);
/*      */         }
/*      */         else
/*      */         {
/*      */           int size;
/* 2832 */           if (token == 249)
/* 2833 */             size = readInt16(this.in);
/*      */           else
/* 2835 */             throw new FunXMPP.CorruptStreamException("invalid list size in readListSize: token " + token);
/*      */         }
/*      */       }
/*      */       int size;
/* 2837 */       return size;
/*      */     }
/*      */ 
/*      */     private FunXMPP.ProtocolTreeNode[] readList() throws IOException, FunXMPP.CorruptStreamException {
/* 2841 */       return readList(this.in.read());
/*      */     }
/*      */     private String readString() throws IOException, FunXMPP.CorruptStreamException {
/* 2844 */       return readString(this.in.read());
/*      */     }
/*      */     private String readString(int token) throws IOException, FunXMPP.CorruptStreamException {
/* 2847 */       if (token == -1) {
/* 2848 */         throw new FunXMPP.CorruptStreamException("-1 token in readString");
/*      */       }
/* 2850 */       if ((token > 4) && (token < 245)) {
/* 2851 */         return getToken(token);
/*      */       }
/* 2853 */       switch (token) {
/*      */       case 0:
/* 2855 */         return null;
/*      */       case 252:
/* 2857 */         int size8 = readInt8(this.in);
/* 2858 */         byte[] buf8 = new byte[size8];
/* 2859 */         fillArray(buf8, this.in);
/* 2860 */         return new String(buf8, "UTF-8");
/*      */       case 253:
/* 2862 */         int size24 = readInt24(this.in);
/* 2863 */         byte[] buf24 = new byte[size24];
/* 2864 */         fillArray(buf24, this.in);
/* 2865 */         return new String(buf24, "UTF-8");
/*      */       case 254:
/* 2867 */         token = (byte)this.in.read();
/* 2868 */         return getToken(245 + token);
/*      */       case 250:
/* 2870 */         String user = readString();
/* 2871 */         String server = readString();
/* 2872 */         if ((user != null) && (server != null)) {
/* 2873 */           return user + "@" + server;
/*      */         }
/* 2875 */         if (server != null) {
/* 2876 */           return server;
/*      */         }
/* 2878 */         throw new FunXMPP.CorruptStreamException("readString couldn't reconstruct jid");
/*      */       }
/* 2880 */       throw new FunXMPP.CorruptStreamException("readString couldn't match token");
/*      */     }
/*      */ 
/*      */     private static void fillArray(byte[] buf, InputStream i) throws IOException
/*      */     {
/* 2885 */       fillArray(buf, buf.length, i);
/*      */     }
/*      */ 
/*      */     private static void fillArray(byte[] buf, int len, InputStream i) throws IOException {
/* 2889 */       int count = 0;
/* 2890 */       while (count < len)
/* 2891 */         count += i.read(buf, count, len - count);
/*      */     }
/*      */ 
/*      */     private String getToken(int token)
/*      */       throws FunXMPP.CorruptStreamException
/*      */     {
/*      */       String ret;
/*      */       String ret;
/* 2897 */       if ((token >= 0) && (token < this.tokenMap.length))
/* 2898 */         ret = this.tokenMap[token];
/*      */       else {
/* 2900 */         ret = null;
/*      */       }
/* 2902 */       if (ret == null) {
/* 2903 */         throw new FunXMPP.CorruptStreamException("invalid token/length in getToken");
/*      */       }
/* 2905 */       return ret;
/*      */     }
/*      */ 
/*      */     private static int readInt8(InputStream i) throws IOException {
/* 2909 */       return i.read();
/*      */     }
/*      */ 
/*      */     private static int readInt16(InputStream i) throws IOException {
/* 2913 */       int intTop = i.read();
/* 2914 */       int intBot = i.read();
/* 2915 */       int value = (intTop << 8) + intBot;
/* 2916 */       return value;
/*      */     }
/*      */ 
/*      */     private static int readInt24(InputStream i) throws IOException {
/* 2920 */       int int1 = i.read();
/* 2921 */       int int2 = i.read();
/* 2922 */       int int3 = i.read();
/* 2923 */       int value = (int1 << 16) + (int2 << 8) + (int3 << 0);
/* 2924 */       return value;
/*      */     }
/*      */ 
/*      */     public void streamStart() throws IOException, FunXMPP.CorruptStreamException {
/* 2928 */       int stanzaSize = readInt16(this.rawIn);
/* 2929 */       fillBuffer(stanzaSize);
/* 2930 */       int tag = this.in.read();
/* 2931 */       int size = readListSize(tag);
/* 2932 */       tag = this.in.read();
/* 2933 */       if (tag != 1) {
/* 2934 */         throw new FunXMPP.CorruptStreamException("expecting STREAM_START in streamStart");
/*      */       }
/* 2936 */       int attribCount = (size - 2 + size % 2) / 2;
/* 2937 */       FunXMPP.KeyValue[] attribs = readAttributes(attribCount);
/*      */     }
/*      */ 
/*      */     private void fillBuffer(int stanzaSize) throws IOException {
/* 2941 */       if (this.buf.length < stanzaSize) {
/* 2942 */         int newsize = Math.max(this.buf.length * 3 / 2, stanzaSize);
/* 2943 */         this.buf = new byte[newsize];
/*      */       }
/* 2945 */       this.bufSize = stanzaSize;
/* 2946 */       fillArray(this.buf, stanzaSize, this.rawIn);
/* 2947 */       this.in = new ByteArrayInputStream(this.buf, 0, stanzaSize);
/*      */     }
/*      */   }
/*      */ 
/*      */   public static class EofIsExceptionInputStream extends InputStream
/*      */   {
/*      */     InputStream inner;
/*      */ 
/*      */     public EofIsExceptionInputStream(InputStream inner)
/*      */     {
/* 2692 */       this.inner = inner;
/*      */     }
/*      */ 
/*      */     public int read() throws IOException {
/* 2696 */       int read = this.inner.read();
/* 2697 */       if (read == -1) {
/* 2698 */         throw new EOFException();
/*      */       }
/* 2700 */       return read;
/*      */     }
/*      */ 
/*      */     public int read(byte[] buf, int start, int len) throws IOException
/*      */     {
/* 2705 */       int read = this.inner.read(buf, start, len);
/* 2706 */       if (read == -1) {
/* 2707 */         throw new EOFException();
/*      */       }
/* 2709 */       return read;
/*      */     }
/*      */ 
/*      */     public int read(byte[] buf) throws IOException {
/* 2713 */       int read = this.inner.read(buf);
/* 2714 */       if (read == -1) {
/* 2715 */         throw new EOFException();
/*      */       }
/* 2717 */       return read;
/*      */     }
/*      */ 
/*      */     public int available() throws IOException {
/* 2721 */       return this.inner.available();
/*      */     }
/*      */ 
/*      */     public void close() throws IOException {
/* 2725 */       this.inner.close();
/*      */     }
/*      */ 
/*      */     public synchronized void mark(int paramInt) {
/* 2729 */       this.inner.mark(paramInt);
/*      */     }
/*      */ 
/*      */     public boolean markSupported() {
/* 2733 */       return this.inner.markSupported();
/*      */     }
/*      */ 
/*      */     public synchronized void reset() throws IOException {
/* 2737 */       this.inner.reset();
/*      */     }
/*      */ 
/*      */     public long skip(long paramLong) throws IOException {
/* 2741 */       return this.inner.skip(paramLong);
/*      */     }
/*      */   }
/*      */ 
/*      */   public static class BinTreeNodeWriter
/*      */     implements FunXMPP.TreeNodeWriter
/*      */   {
/*      */     private static final int STREAM_START = 1;
/*      */     private static final int STREAM_END = 2;
/*      */     private static final int LIST_EMPTY = 0;
/*      */     private static final int LIST_8 = 248;
/*      */     private static final int LIST_16 = 249;
/*      */     private static final int JID_PAIR = 250;
/*      */     private static final int BINARY_8 = 252;
/*      */     private static final int BINARY_24 = 253;
/*      */     private static final int TOKEN_8 = 254;
/*      */     Hashtable tokenMap;
/*      */     OutputStream realOut;
/*      */     FunXMPP.WAByteArrayOutputStream out;
/*      */ 
/*      */     public BinTreeNodeWriter(OutputStream o, String[] dictionary)
/*      */     {
/* 2522 */       this.realOut = o;
/* 2523 */       this.out = new FunXMPP.WAByteArrayOutputStream();
/* 2524 */       this.tokenMap = new Hashtable(dictionary.length);
/* 2525 */       for (int i = 0; i < dictionary.length; i++)
/* 2526 */         if (dictionary[i] != null)
/* 2527 */           this.tokenMap.put(dictionary[i], new Integer(i));
/*      */     }
/*      */ 
/*      */     public synchronized void flushBuffer(boolean flushNetwork) throws IOException
/*      */     {
/* 2532 */       int size = this.out.getCount();
/* 2533 */       if ((size & 0xFFFF0000) != 0) {
/* 2534 */         throw new IOException("Buffer too large: " + size);
/*      */       }
/* 2536 */       writeInt16(this.realOut, size);
/* 2537 */       this.realOut.write(this.out.getBuffer(), 0, size);
/* 2538 */       this.out.reset();
/* 2539 */       if (flushNetwork)
/* 2540 */         this.realOut.flush();
/*      */     }
/*      */ 
/*      */     public synchronized void streamEnd() throws IOException
/*      */     {
/* 2545 */       writeListStart(1);
/* 2546 */       this.out.write(2);
/* 2547 */       flushBuffer(true);
/*      */     }
/*      */ 
/*      */     public synchronized void streamStart(String domain, String resource) throws IOException
/*      */     {
/* 2552 */       this.realOut.write(87);
/* 2553 */       this.realOut.write(65);
/* 2554 */       this.realOut.write(0);
/* 2555 */       this.realOut.write(4);
/*      */ 
/* 2557 */       FunXMPP.KeyValue[] streamOpenAttributes = { new FunXMPP.KeyValue("to", domain), new FunXMPP.KeyValue("resource", resource) };
/*      */ 
/* 2561 */       writeListStart(streamOpenAttributes.length * 2 + 1);
/* 2562 */       this.out.write(1);
/* 2563 */       writeAttributes(streamOpenAttributes);
/* 2564 */       flushBuffer(false);
/*      */     }
/*      */     public synchronized void write(FunXMPP.ProtocolTreeNode node) throws IOException {
/* 2567 */       write(node, true);
/*      */     }
/*      */ 
/*      */     public synchronized void write(FunXMPP.ProtocolTreeNode node, boolean needsFlush) throws IOException {
/* 2571 */       if (node == null)
/* 2572 */         this.out.write(0);
/*      */       else {
/* 2574 */         writeInternal(node);
/*      */       }
/* 2576 */       flushBuffer(needsFlush);
/*      */     }
/*      */ 
/*      */     private void writeInternal(FunXMPP.ProtocolTreeNode node) throws IOException {
/* 2580 */       writeListStart(1 + (node.attributes == null ? 0 : node.attributes.length * 2) + (node.children == null ? 0 : 1) + (node.data == null ? 0 : 1));
/*      */ 
/* 2584 */       writeString(node.tag);
/* 2585 */       writeAttributes(node.attributes);
/* 2586 */       if (node.data != null) {
/* 2587 */         writeBytes(node.data.getBytes("UTF-8"));
/*      */       }
/* 2589 */       if (node.children != null) {
/* 2590 */         writeListStart(node.children.length);
/* 2591 */         for (int i = 0; i < node.children.length; i++)
/* 2592 */           writeInternal(node.children[i]);
/*      */       }
/*      */     }
/*      */ 
/*      */     private void writeAttributes(FunXMPP.KeyValue[] attributes) throws IOException {
/* 2597 */       if (attributes != null)
/* 2598 */         for (int i = 0; i < attributes.length; i++) {
/* 2599 */           writeString(attributes[i].key);
/* 2600 */           writeString(attributes[i].value);
/*      */         }
/*      */     }
/*      */ 
/*      */     private void writeString(String tag) throws IOException
/*      */     {
/*      */       try {
/* 2607 */         Integer key = (Integer)this.tokenMap.get(tag);
/* 2608 */         if (key != null) {
/* 2609 */           writeToken(key.intValue());
/*      */         } else {
/* 2611 */           int atIndex = tag.indexOf('@');
/* 2612 */           if (atIndex < 1) {
/* 2613 */             writeBytes(tag.getBytes("UTF-8"));
/*      */           } else {
/* 2615 */             String server = tag.substring(atIndex + 1);
/* 2616 */             String user = tag.substring(0, atIndex);
/* 2617 */             writeJid(user, server);
/*      */           }
/*      */         }
/*      */       } catch (UnsupportedEncodingException e) {
/* 2621 */         throw new RuntimeException(e.getMessage());
/*      */       }
/*      */     }
/*      */ 
/*      */     private void writeJid(String user, String server) throws IOException {
/* 2626 */       this.out.write(250);
/* 2627 */       if (user != null)
/* 2628 */         writeString(user);
/*      */       else {
/* 2630 */         writeToken(0);
/*      */       }
/* 2632 */       writeString(server);
/*      */     }
/*      */ 
/*      */     private void writeToken(int intValue) throws IOException {
/* 2636 */       if (intValue < 245) {
/* 2637 */         this.out.write((byte)intValue);
/* 2638 */       } else if (intValue <= 500) {
/* 2639 */         this.out.write(254);
/* 2640 */         this.out.write((byte)(intValue - 245));
/*      */       }
/*      */     }
/*      */ 
/*      */     private void writeBytes(byte[] bytes) throws IOException {
/* 2644 */       int length = bytes.length;
/* 2645 */       if (length >= 256) {
/* 2646 */         this.out.write(253);
/* 2647 */         writeInt24(length);
/*      */       } else {
/* 2649 */         this.out.write(252);
/* 2650 */         writeInt8(length);
/*      */       }
/* 2652 */       this.out.write(bytes);
/*      */     }
/*      */ 
/*      */     private void writeInt8(int v) throws IOException {
/* 2656 */       this.out.write(v & 0xFF);
/*      */     }
/*      */ 
/*      */     private void writeInt16(int v) throws IOException {
/* 2660 */       writeInt16(this.out, v);
/*      */     }
/*      */ 
/*      */     private static void writeInt16(OutputStream o, int v) throws IOException {
/* 2664 */       o.write((v & 0xFF00) >> 8);
/* 2665 */       o.write((v & 0xFF) >> 0);
/*      */     }
/*      */ 
/*      */     private void writeInt24(int v) throws IOException {
/* 2669 */       this.out.write((v & 0xFF0000) >> 16);
/* 2670 */       this.out.write((v & 0xFF00) >> 8);
/* 2671 */       this.out.write((v & 0xFF) >> 0);
/*      */     }
/*      */ 
/*      */     private void writeListStart(int i) throws IOException {
/* 2675 */       if (i == 0) {
/* 2676 */         this.out.write(0);
/* 2677 */       } else if (i < 256) {
/* 2678 */         this.out.write(248);
/* 2679 */         writeInt8(i);
/*      */       } else {
/* 2681 */         this.out.write(249);
/* 2682 */         writeInt16(i);
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   public static class WAByteArrayOutputStream extends ByteArrayOutputStream
/*      */   {
/*      */     public int getCount()
/*      */     {
/* 2501 */       return this.count;
/*      */     }
/*      */ 
/*      */     public byte[] getBuffer() {
/* 2505 */       return this.buf;
/*      */     }
/*      */   }
/*      */ 
/*      */   public static abstract interface TreeNodeReader
/*      */   {
/*      */     public abstract FunXMPP.ProtocolTreeNode nextTree()
/*      */       throws FunXMPP.CorruptStreamException, IOException;
/*      */ 
/*      */     public abstract void streamStart()
/*      */       throws IOException, FunXMPP.CorruptStreamException;
/*      */ 
/*      */     public abstract String lastStanza();
/*      */   }
/*      */ 
/*      */   public static abstract interface TreeNodeWriter
/*      */   {
/*      */     public abstract void streamStart(String paramString1, String paramString2)
/*      */       throws IOException;
/*      */ 
/*      */     public abstract void streamEnd()
/*      */       throws IOException;
/*      */ 
/*      */     public abstract void write(FunXMPP.ProtocolTreeNode paramProtocolTreeNode)
/*      */       throws IOException;
/*      */ 
/*      */     public abstract void write(FunXMPP.ProtocolTreeNode paramProtocolTreeNode, boolean paramBoolean)
/*      */       throws IOException;
/*      */   }
/*      */ 
/*      */   public static abstract class Login
/*      */   {
/*      */     MessageDigest digest;
/*      */     FunXMPP.TreeNodeReader in;
/*      */     FunXMPP.TreeNodeWriter out;
/*      */     FunXMPP.Connection connection;
/* 2116 */     static String nonce_key = "nonce=\"";
/*      */ 
/*      */     public Login(MessageDigest d, FunXMPP.TreeNodeReader r, FunXMPP.TreeNodeWriter w)
/*      */     {
/* 2102 */       this.in = r;
/* 2103 */       this.out = w;
/* 2104 */       this.digest = d;
/*      */     }
/*      */     public void setConnection(FunXMPP.Connection c) {
/* 2107 */       this.connection = c;
/*      */     }
/*      */     public FunXMPP.TreeNodeWriter getTreeWriter() {
/* 2110 */       return this.out;
/*      */     }
/*      */     public FunXMPP.TreeNodeReader getTreeReader() {
/* 2113 */       return this.in;
/*      */     }
/*      */     abstract void login() throws IOException, FunXMPP.LoginFailureException, FunXMPP.CorruptStreamException;
/*      */ 
/* 2118 */     protected String getResponse(String challenge) throws IOException { int i = challenge.indexOf(nonce_key);
/* 2119 */       if (i == -1) {
/* 2120 */         throw new IOException("no nonce in challenge");
/*      */       }
/* 2122 */       i += nonce_key.length();
/* 2123 */       int j = challenge.indexOf('"', i);
/* 2124 */       if (j == -1) {
/* 2125 */         throw new IOException("bad nonce in challenge");
/*      */       }
/* 2127 */       String nonce = challenge.substring(i, j);
/*      */ 
/* 2129 */       String cnonce = Long.toString(Math.abs(new Random().nextLong()), 36);
/*      */ 
/* 2131 */       String nc = "00000001";
/*      */ 
/* 2133 */       ByteArrayOutputStream bos = new ByteArrayOutputStream();
/*      */ 
/* 2135 */       bos.write(md5Digest((this.connection.user + ":" + this.connection.domain + ":" + this.connection.password).getBytes()));
/* 2136 */       bos.write(58);
/* 2137 */       bos.write(nonce.getBytes());
/* 2138 */       bos.write(58);
/* 2139 */       bos.write(cnonce.getBytes());
/*      */ 
/* 2141 */       String digest_uri = "xmpp/" + this.connection.domain;
/*      */ 
/* 2143 */       byte[] A1 = bos.toByteArray();
/* 2144 */       String A2 = "AUTHENTICATE:" + digest_uri;
/*      */ 
/* 2159 */       String KD = new String(bytesToHex(md5Digest(A1))) + ":" + nonce + ":" + nc + ":" + cnonce + ":auth:" + new String(bytesToHex(md5Digest(A2.getBytes())));
/* 2160 */       String response = new String(bytesToHex(md5Digest(KD.getBytes())));
/*      */ 
/* 2162 */       StringBuffer bigger_response = new StringBuffer();
/* 2163 */       bigger_response.append("realm=\"");
/* 2164 */       bigger_response.append(this.connection.domain);
/* 2165 */       bigger_response.append("\",response=");
/* 2166 */       bigger_response.append(response);
/* 2167 */       bigger_response.append(",nonce=\"");
/* 2168 */       bigger_response.append(nonce);
/* 2169 */       bigger_response.append("\",digest-uri=\"");
/* 2170 */       bigger_response.append(digest_uri);
/* 2171 */       bigger_response.append("\",cnonce=\"");
/* 2172 */       bigger_response.append(cnonce);
/* 2173 */       bigger_response.append("\",qop=auth");
/* 2174 */       bigger_response.append(",username=\"");
/* 2175 */       bigger_response.append(this.connection.user);
/* 2176 */       bigger_response.append("\",nc=");
/* 2177 */       bigger_response.append(nc);
/* 2178 */       return bigger_response.toString(); }
/*      */ 
/*      */     byte[] md5Digest(byte[] input)
/*      */     {
/* 2182 */       this.digest.reset();
/* 2183 */       this.digest.update(input);
/* 2184 */       return this.digest.digest();
/*      */     }
/*      */ 
/*      */     byte forDigit(int b) {
/* 2188 */       if (b < 10) {
/* 2189 */         return (byte)(48 + b);
/*      */       }
/*      */ 
/* 2192 */       return (byte)(97 + b - 10);
/*      */     }
/*      */ 
/*      */     byte[] bytesToHex(byte[] bytes)
/*      */     {
/* 2197 */       byte[] ret = new byte[bytes.length * 2];
/* 2198 */       int i = 0;
/* 2199 */       for (int c = 0; c < bytes.length; c++) {
/* 2200 */         int ub = bytes[c];
/* 2201 */         if (ub < 0) {
/* 2202 */           ub += 256;
/*      */         }
/* 2204 */         ret[i] = forDigit(ub >> 4);
/* 2205 */         i++;
/* 2206 */         ret[i] = forDigit(ub % 16);
/* 2207 */         i++;
/*      */       }
/* 2209 */       return ret;
/*      */     }
/*      */ 
/*      */     public static final class WhatsApp extends FunXMPP.Login
/*      */     {
/*      */       public WhatsApp(FunXMPP.TreeNodeReader r, FunXMPP.TreeNodeWriter w, MessageDigest d)
/*      */       {
/* 2385 */         super(r, w);
/*      */       }
/*      */ 
/*      */       public void login() throws IOException, FunXMPP.LoginFailureException, FunXMPP.CorruptStreamException {
/* 2389 */         this.out.streamStart(this.connection.domain, this.connection.resource);
/* 2390 */         System.err.println("sent stream start");
/* 2391 */         sendFeatures();
/* 2392 */         System.err.println("sent features");
/* 2393 */         sendAuth();
/* 2394 */         System.err.println("sent auth");
/*      */ 
/* 2396 */         this.in.streamStart();
/* 2397 */         System.err.println("read stream start");
/* 2398 */         String challengeData = readFeaturesAndChallenge();
/* 2399 */         System.err.println("read features and challenge");
/*      */ 
/* 2401 */         sendResponse(challengeData);
/* 2402 */         System.err.println("sent response");
/* 2403 */         readSuccess();
/*      */       }
/*      */ 
/*      */       private void sendFeatures() throws IOException {
/* 2407 */         this.out.write(new FunXMPP.ProtocolTreeNode("stream:features", null, new FunXMPP.ProtocolTreeNode[] { !this.connection.supports_receipt_acks ? null : new FunXMPP.ProtocolTreeNode("receipt_acks", null) }), false);
/*      */       }
/*      */ 
/*      */       private void sendAuth()
/*      */         throws IOException
/*      */       {
/* 2414 */         FunXMPP.ProtocolTreeNode node = new FunXMPP.ProtocolTreeNode("auth", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("xmlns", "urn:ietf:params:xml:ns:xmpp-sasl"), new FunXMPP.KeyValue("mechanism", "DIGEST-MD5-1") });
/*      */ 
/* 2419 */         this.out.write(node);
/*      */       }
/*      */ 
/*      */       private String readFeaturesAndChallenge() throws IOException, FunXMPP.CorruptStreamException {
/* 2423 */         boolean server_supports_receipt_acks = false;
/*      */         FunXMPP.ProtocolTreeNode root;
/* 2424 */         while ((root = this.in.nextTree()) != null) {
/* 2425 */           if (FunXMPP.ProtocolTreeNode.tagEquals(root, "stream:features")) {
/* 2426 */             server_supports_receipt_acks = root.getChild("receipt_acks") != null; continue;
/* 2427 */           }if (FunXMPP.ProtocolTreeNode.tagEquals(root, "challenge")) {
/* 2428 */             this.connection.supports_receipt_acks = ((this.connection.supports_receipt_acks) && (server_supports_receipt_acks));
/* 2429 */             String data = new String(Base64.decode(root.data.getBytes()));
/* 2430 */             return data;
/*      */           }
/*      */         }
/* 2433 */         throw new FunXMPP.CorruptStreamException("fell out of loop in readFeaturesAndChallenge");
/*      */       }
/*      */       private void sendResponse(String challengeData) throws IOException {
/* 2436 */         String response = getResponse(challengeData);
/* 2437 */         FunXMPP.ProtocolTreeNode node = new FunXMPP.ProtocolTreeNode("response", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("xmlns", "urn:ietf:params:xml:ns:xmpp-sasl") }, new String(Base64.encode(response.getBytes())));
/*      */ 
/* 2441 */         this.out.write(node);
/*      */       }
/*      */       private void readSuccess() throws FunXMPP.CorruptStreamException, IOException, FunXMPP.LoginFailureException {
/* 2444 */         FunXMPP.ProtocolTreeNode node = this.in.nextTree();
/* 2445 */         if (FunXMPP.ProtocolTreeNode.tagEquals(node, "failure")) {
/* 2446 */           throw new FunXMPP.LoginFailureException(0);
/*      */         }
/* 2448 */         FunXMPP.ProtocolTreeNode.require(node, "success");
/* 2449 */         String expiration = node.getAttributeValue("expiration");
/* 2450 */         if (expiration != null) {
/*      */           try {
/* 2452 */             this.connection.expire_date = Long.parseLong(expiration);
/*      */           }
/*      */           catch (NumberFormatException xxx) {
/* 2455 */             throw new IOException("invalid expire date: " + expiration);
/*      */           }
/*      */         }
/* 2458 */         String kind = node.getAttributeValue("kind");
/* 2459 */         if ("paid".equals(kind)) {
/* 2460 */           this.connection.account_kind = 1;
/*      */         }
/* 2462 */         else if ("free".equals(kind)) {
/* 2463 */           this.connection.account_kind = 0;
/*      */         }
/*      */         else {
/* 2466 */           this.connection.account_kind = -1;
/*      */         }
/* 2468 */         String status = node.getAttributeValue("status");
/* 2469 */         if ("expired".equals(status)) {
/* 2470 */           FunXMPP.LoginFailureException failex = new FunXMPP.LoginFailureException(1);
/* 2471 */           failex.expire_date = this.connection.expire_date;
/* 2472 */           throw failex;
/*      */         }
/* 2474 */         if ("active".equals(status)) {
/* 2475 */           if (expiration == null) {
/* 2476 */             throw new IOException("active account with no expiration");
/*      */           }
/*      */         }
/*      */         else
/* 2480 */           this.connection.account_kind = -1;
/*      */       }
/*      */     }
/*      */ 
/*      */     public static final class XMPP extends FunXMPP.Login
/*      */     {
/*      */       public XMPP(FunXMPP.TreeNodeReader in, FunXMPP.TreeNodeWriter out, MessageDigest d)
/*      */       {
/* 2215 */         super(in, out);
/*      */       }
/*      */ 
/*      */       public synchronized void login() throws IOException, FunXMPP.LoginFailureException, FunXMPP.CorruptStreamException {
/* 2219 */         send1();
/* 2220 */         send2DigestMD5Mechanism();
/*      */ 
/* 2222 */         read1();
/* 2223 */         String challenge = read2Challenge();
/* 2224 */         send2SASLResponse(challenge);
/* 2225 */         send2UselessResponse();
/*      */ 
/* 2227 */         read2Challenge();
/* 2228 */         read2();
/* 2229 */         send3();
/*      */ 
/* 2231 */         read3();
/* 2232 */         send4();
/* 2233 */         send5();
/*      */       }
/*      */ 
/*      */       public void read1() throws IOException, FunXMPP.CorruptStreamException {
/* 2237 */         this.in.streamStart();
/* 2238 */         FunXMPP.ProtocolTreeNode node = this.in.nextTree();
/* 2239 */         FunXMPP.ProtocolTreeNode.require(node, "stream:features");
/* 2240 */         node = FunXMPP.ProtocolTreeNode.safeGetChild(node, 0);
/* 2241 */         FunXMPP.ProtocolTreeNode.require(node, "mechanisms");
/* 2242 */         if (node.children != null)
/* 2243 */           for (int i = 0; i < node.children.length; i++)
/* 2244 */             FunXMPP.ProtocolTreeNode.require(node.children[i], "mechanism");
/*      */       }
/*      */ 
/*      */       public void read2()
/*      */         throws IOException, FunXMPP.LoginFailureException, FunXMPP.CorruptStreamException
/*      */       {
/* 2250 */         FunXMPP.ProtocolTreeNode node = this.in.nextTree();
/* 2251 */         if (FunXMPP.ProtocolTreeNode.tagEquals(node, "failure")) {
/* 2252 */           throw new FunXMPP.LoginFailureException(0);
/*      */         }
/* 2254 */         FunXMPP.ProtocolTreeNode.require(node, "success");
/* 2255 */         String expiration = node.getAttributeValue("expiration");
/* 2256 */         if (expiration != null) {
/*      */           try {
/* 2258 */             this.connection.expire_date = Long.parseLong(expiration);
/*      */           }
/*      */           catch (NumberFormatException xxx) {
/* 2261 */             throw new IOException("invalid expire date: " + expiration);
/*      */           }
/*      */         }
/* 2264 */         String kind = node.getAttributeValue("kind");
/* 2265 */         if ("paid".equals(kind)) {
/* 2266 */           this.connection.account_kind = 1;
/*      */         }
/* 2268 */         else if ("free".equals(kind)) {
/* 2269 */           this.connection.account_kind = 0;
/*      */         }
/*      */         else {
/* 2272 */           this.connection.account_kind = -1;
/*      */         }
/* 2274 */         String status = node.getAttributeValue("status");
/* 2275 */         if ("expired".equals(status)) {
/* 2276 */           FunXMPP.LoginFailureException failex = new FunXMPP.LoginFailureException(1);
/* 2277 */           failex.expire_date = this.connection.expire_date;
/* 2278 */           throw failex;
/*      */         }
/* 2280 */         if ("active".equals(status)) {
/* 2281 */           if (expiration == null) {
/* 2282 */             throw new IOException("active account with no expiration");
/*      */           }
/*      */         }
/*      */         else
/* 2286 */           this.connection.account_kind = -1;
/*      */       }
/*      */ 
/*      */       String read2Challenge() throws IOException, FunXMPP.LoginFailureException, FunXMPP.CorruptStreamException
/*      */       {
/* 2291 */         FunXMPP.ProtocolTreeNode node = this.in.nextTree();
/* 2292 */         if (FunXMPP.ProtocolTreeNode.tagEquals(node, "failure")) {
/* 2293 */           throw new FunXMPP.LoginFailureException(0);
/*      */         }
/* 2295 */         FunXMPP.ProtocolTreeNode.require(node, "challenge");
/* 2296 */         String data = new String(Base64.decode(node.data.getBytes()));
/* 2297 */         return data;
/*      */       }
/*      */ 
/*      */       void read3() throws IOException, FunXMPP.CorruptStreamException {
/* 2301 */         this.in.streamStart();
/* 2302 */         FunXMPP.ProtocolTreeNode node = this.in.nextTree();
/* 2303 */         FunXMPP.ProtocolTreeNode.require(node, "stream:features");
/* 2304 */         boolean server_supports_receipt_acks = node.getChild("receipt_acks") != null;
/* 2305 */         this.connection.supports_receipt_acks = ((this.connection.supports_receipt_acks) && (server_supports_receipt_acks));
/*      */       }
/*      */ 
/*      */       void send1() throws IOException {
/* 2309 */         this.out.streamStart(this.connection.domain, this.connection.resource);
/*      */       }
/*      */ 
/*      */       void send2DigestMD5Mechanism() throws IOException {
/* 2313 */         FunXMPP.ProtocolTreeNode node = new FunXMPP.ProtocolTreeNode("auth", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("xmlns", "urn:ietf:params:xml:ns:xmpp-sasl"), new FunXMPP.KeyValue("mechanism", "DIGEST-MD5") });
/*      */ 
/* 2318 */         this.out.write(node);
/*      */       }
/*      */ 
/*      */       public synchronized void sendOpenStreamMD5Mechanism() throws IOException {
/* 2322 */         send1();
/* 2323 */         send2DigestMD5Mechanism();
/*      */       }
/*      */ 
/*      */       void send2SASLResponse(String challenge) throws IOException
/*      */       {
/* 2328 */         String bigger_response = getResponse(challenge);
/*      */ 
/* 2330 */         FunXMPP.ProtocolTreeNode node = new FunXMPP.ProtocolTreeNode("response", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("xmlns", "urn:ietf:params:xml:ns:xmpp-sasl") }, new String(Base64.encode(bigger_response.getBytes())));
/*      */ 
/* 2334 */         this.out.write(node);
/*      */       }
/*      */ 
/*      */       void send2UselessResponse() throws IOException
/*      */       {
/* 2339 */         FunXMPP.ProtocolTreeNode node = new FunXMPP.ProtocolTreeNode("response", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("xmlns", "urn:ietf:params:xml:ns:xmpp-sasl") });
/*      */ 
/* 2343 */         this.out.write(node);
/*      */       }
/*      */ 
/*      */       void send3() throws IOException {
/* 2347 */         this.out.streamStart(this.connection.domain, this.connection.resource);
/*      */       }
/*      */ 
/*      */       void send4() throws IOException {
/* 2351 */         FunXMPP.ProtocolTreeNode resourceNode = new FunXMPP.ProtocolTreeNode("resource", null, this.connection.resource);
/* 2352 */         FunXMPP.ProtocolTreeNode[] featuresChildren = null;
/* 2353 */         if (this.connection.supports_receipt_acks) {
/* 2354 */           featuresChildren = new FunXMPP.ProtocolTreeNode[] { new FunXMPP.ProtocolTreeNode("receipt_acks", null) };
/*      */         }
/* 2356 */         FunXMPP.ProtocolTreeNode featuresNode = new FunXMPP.ProtocolTreeNode("features", null, featuresChildren);
/* 2357 */         FunXMPP.ProtocolTreeNode bindNode = new FunXMPP.ProtocolTreeNode("bind", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("xmlns", "urn:ietf:params:xml:ns:xmpp-bind") }, new FunXMPP.ProtocolTreeNode[] { resourceNode, featuresNode });
/*      */ 
/* 2362 */         FunXMPP.ProtocolTreeNode iqNode = new FunXMPP.ProtocolTreeNode("iq", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("type", "set"), new FunXMPP.KeyValue("id", "0") }, bindNode);
/*      */ 
/* 2365 */         this.out.write(iqNode);
/*      */       }
/*      */ 
/*      */       void send5() throws IOException {
/* 2369 */         FunXMPP.ProtocolTreeNode sessionNode = new FunXMPP.ProtocolTreeNode("session", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("xmlns", "urn:ietf:params:xml:ns:xmpp-session") });
/*      */ 
/* 2373 */         FunXMPP.ProtocolTreeNode iqNode = new FunXMPP.ProtocolTreeNode("iq", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("type", "set"), new FunXMPP.KeyValue("id", "1") }, new FunXMPP.ProtocolTreeNode[] { sessionNode });
/*      */ 
/* 2378 */         this.out.write(iqNode);
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   public static class Connection
/*      */   {
/*      */     String domain;
/*      */     String resource;
/*      */     String user;
/*      */     String push_name;
/*      */     String password;
/*      */     String from;
/*      */     FunXMPP.Listener event_handler;
/*      */     FunXMPP.GroupListener group_event_handler;
/*      */     FunXMPP.DateParser date_parser;
/*  635 */     boolean supports_receipt_acks = false;
/*  636 */     boolean verbose_id = false;
/*  637 */     Hashtable pending_server_requests = new Hashtable();
/*      */     FunXMPP.Login login;
/*      */     FunXMPP.TreeNodeWriter out;
/*      */     FunXMPP.TreeNodeReader in;
/*      */     static final int ACCOUNT_KIND_UNKNOWN = -1;
/*      */     static final int ACCOUNT_KIND_FREE = 0;
/*      */     static final int ACCOUNT_KIND_PAID = 1;
/*  647 */     public int account_kind = -1;
/*  648 */     public long expire_date = 0L;
/*  649 */     public long lastTreeRead = 0L;
/*      */     static final int ID_HEADER_SIZE = 4;
/*      */     int iqid;
/*      */ 
/*      */     public Connection(FunXMPP.Login login, String domain, String resource, String user, String push_name, String password, FunXMPP.Listener event_handler, FunXMPP.GroupListener group_event_handler, FunXMPP.DateParser date_parser)
/*      */       throws IOException, XmlPullParserException
/*      */     {
/*  653 */       this.in = login.getTreeReader();
/*  654 */       this.out = login.getTreeWriter();
/*  655 */       this.login = login;
/*      */ 
/*  657 */       this.domain = domain;
/*  658 */       this.user = user;
/*  659 */       this.push_name = push_name;
/*  660 */       this.password = password;
/*  661 */       this.resource = resource;
/*  662 */       this.event_handler = event_handler;
/*  663 */       this.group_event_handler = group_event_handler;
/*  664 */       this.date_parser = date_parser;
/*  665 */       this.from = (user + "@" + domain + "/" + resource);
/*      */     }
/*      */ 
/*      */     public void setPushName(String push_name) {
/*  669 */       this.push_name = push_name;
/*      */       try {
/*  671 */         sendAvailableForChat();
/*      */       } catch (IOException e) {
/*      */       }
/*      */     }
/*      */ 
/*      */     public void setVerboseId(boolean value) {
/*  677 */       this.verbose_id = value;
/*      */     }
/*      */ 
/*      */     public void setReceiptAckCapable(boolean value) {
/*  681 */       this.supports_receipt_acks = value;
/*      */     }
/*      */ 
/*      */     public void login() throws IOException, XmlPullParserException, FunXMPP.LoginFailureException, FunXMPP.CorruptStreamException
/*      */     {
/*  686 */       this.login.login();
/*  687 */       sendAvailableForChat();
/*      */     }
/*      */ 
/*      */     public void sendNop() throws IOException {
/*  691 */       this.out.write(null);
/*      */     }
/*      */ 
/*      */     public void sendPong(String id) throws IOException {
/*  695 */       FunXMPP.ProtocolTreeNode iqNode = new FunXMPP.ProtocolTreeNode("iq", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("type", "result"), new FunXMPP.KeyValue("to", this.domain), new FunXMPP.KeyValue("id", id) });
/*      */ 
/*  703 */       this.out.write(iqNode);
/*      */     }
/*      */ 
/*      */     private FunXMPP.ProtocolTreeNode getReceiptAck(String to, String id, String receiptType) throws IOException
/*      */     {
/*  708 */       FunXMPP.ProtocolTreeNode ackNode = new FunXMPP.ProtocolTreeNode("ack", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("xmlns", "urn:xmpp:receipts"), new FunXMPP.KeyValue("type", receiptType) });
/*      */ 
/*  714 */       FunXMPP.ProtocolTreeNode messageNode = new FunXMPP.ProtocolTreeNode("message", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("to", to), new FunXMPP.KeyValue("type", "chat"), new FunXMPP.KeyValue("id", id) }, ackNode);
/*      */ 
/*  722 */       return messageNode;
/*      */     }
/*      */ 
/*      */     public void sendVisibleReceiptAck(String to, String id) throws IOException {
/*  726 */       this.out.write(getReceiptAck(to, id, "visible"));
/*      */     }
/*      */ 
/*      */     public void sendDeliveredReceiptAck(String to, String id) throws IOException {
/*  730 */       this.out.write(getReceiptAck(to, id, "delivered"));
/*      */     }
/*      */ 
/*      */     public static FunXMPP.ProtocolTreeNode getSubjectMessage(String to, String id, FunXMPP.ProtocolTreeNode child) throws IOException {
/*  734 */       FunXMPP.ProtocolTreeNode messageNode = new FunXMPP.ProtocolTreeNode("message", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("to", to), new FunXMPP.KeyValue("type", "subject"), new FunXMPP.KeyValue("id", id) }, child);
/*      */ 
/*  740 */       return messageNode;
/*      */     }
/*      */ 
/*      */     private void sendMessageWithBody(FunXMPP.FMessage message) throws IOException {
/*  744 */       FunXMPP.ProtocolTreeNode bodyNode = new FunXMPP.ProtocolTreeNode("body", null, message.data);
/*  745 */       this.out.write(getMessageNode(message, bodyNode));
/*      */     }
/*      */ 
/*      */     public void sendComposing(String to) throws IOException {
/*  749 */       FunXMPP.ProtocolTreeNode composingNode = new FunXMPP.ProtocolTreeNode("composing", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("xmlns", "http://jabber.org/protocol/chatstates") });
/*      */ 
/*  754 */       FunXMPP.ProtocolTreeNode messageNode = new FunXMPP.ProtocolTreeNode("message", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("to", to), new FunXMPP.KeyValue("type", "chat") }, composingNode);
/*      */ 
/*  761 */       this.out.write(messageNode);
/*      */     }
/*      */ 
/*      */     public void sendPaused(String to) throws IOException {
/*  765 */       FunXMPP.ProtocolTreeNode pausedNode = new FunXMPP.ProtocolTreeNode("paused", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("xmlns", "http://jabber.org/protocol/chatstates") });
/*      */ 
/*  770 */       FunXMPP.ProtocolTreeNode messageNode = new FunXMPP.ProtocolTreeNode("message", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("to", to), new FunXMPP.KeyValue("type", "chat") }, pausedNode);
/*      */ 
/*  777 */       this.out.write(messageNode);
/*      */     }
/*      */ 
/*      */     private void sendMessageWithMedia(FunXMPP.FMessage message) throws IOException {
/*  781 */       if (7 == message.media_wa_type) {
/*  782 */         throw new RuntimeException("Cannot send system message over the network");
/*      */       }
/*  784 */       FunXMPP.KeyValue xmlns = new FunXMPP.KeyValue("xmlns", "urn:xmpp:whatsapp:mms");
/*  785 */       FunXMPP.KeyValue type = new FunXMPP.KeyValue("type", FunXMPP.FMessage.getMessage_WA_Type_StrValue(message.media_wa_type));
/*      */       FunXMPP.KeyValue[] mediaAttributes;
/*      */       FunXMPP.KeyValue[] mediaAttributes;
/*  787 */       if (5 == message.media_wa_type) {
/*  788 */         mediaAttributes = new FunXMPP.KeyValue[] { xmlns, type, new FunXMPP.KeyValue("latitude", Double.toString(message.latitude)), new FunXMPP.KeyValue("longitude", Double.toString(message.longitude)) };
/*      */       }
/*      */       else
/*      */       {
/*      */         FunXMPP.KeyValue[] mediaAttributes;
/*  791 */         if ((4 != message.media_wa_type) && (message.media_name != null) && (message.media_url != null) && (message.media_size > 0L))
/*      */         {
/*      */           FunXMPP.KeyValue[] mediaAttributes;
/*  795 */           if (message.media_duration_seconds <= 0) {
/*  796 */             mediaAttributes = new FunXMPP.KeyValue[] { xmlns, type, new FunXMPP.KeyValue("file", message.media_name), new FunXMPP.KeyValue("size", Long.toString(message.media_size)), new FunXMPP.KeyValue("url", message.media_url) };
/*      */           }
/*      */           else
/*      */           {
/*  801 */             mediaAttributes = new FunXMPP.KeyValue[] { xmlns, type, new FunXMPP.KeyValue("file", message.media_name), new FunXMPP.KeyValue("size", Long.toString(message.media_size)), new FunXMPP.KeyValue("url", message.media_url), new FunXMPP.KeyValue("seconds", Integer.toString(message.media_duration_seconds)) };
/*      */           }
/*      */ 
/*      */         }
/*      */         else
/*      */         {
/*  808 */           mediaAttributes = new FunXMPP.KeyValue[] { xmlns, type };
/*      */         }
/*      */       }
/*      */       FunXMPP.ProtocolTreeNode mediaNode;
/*      */       FunXMPP.ProtocolTreeNode mediaNode;
/*  811 */       if ((4 == message.media_wa_type) && (message.media_name != null))
/*      */       {
/*  813 */         mediaNode = new FunXMPP.ProtocolTreeNode("media", mediaAttributes, new FunXMPP.ProtocolTreeNode("vcard", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("name", message.media_name) }, message.data));
/*      */       }
/*      */       else
/*      */       {
/*  820 */         mediaNode = new FunXMPP.ProtocolTreeNode("media", mediaAttributes, message.data);
/*      */       }
/*      */ 
/*  823 */       this.out.write(getMessageNode(message, mediaNode));
/*      */     }
/*      */ 
/*      */     private static FunXMPP.ProtocolTreeNode getMessageNode(FunXMPP.FMessage message, FunXMPP.ProtocolTreeNode child) throws IOException {
/*  827 */       FunXMPP.ProtocolTreeNode requestNode = null;
/*  828 */       FunXMPP.ProtocolTreeNode serverNode = new FunXMPP.ProtocolTreeNode("server", null);
/*  829 */       FunXMPP.ProtocolTreeNode xNode = new FunXMPP.ProtocolTreeNode("x", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("xmlns", "jabber:x:event") }, new FunXMPP.ProtocolTreeNode[] { serverNode });
/*  830 */       int childCount = (requestNode == null ? 0 : 1) + 2;
/*  831 */       FunXMPP.ProtocolTreeNode[] messageChildren = new FunXMPP.ProtocolTreeNode[childCount];
/*  832 */       int i = 0;
/*  833 */       if (requestNode != null) {
/*  834 */         messageChildren[i] = requestNode;
/*  835 */         i++;
/*      */       }
/*      */ 
/*  838 */       messageChildren[i] = xNode;
/*  839 */       i++;
/*      */ 
/*  842 */       messageChildren[i] = child;
/*  843 */       i++;
/*      */ 
/*  845 */       FunXMPP.ProtocolTreeNode messageNode = new FunXMPP.ProtocolTreeNode("message", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("to", message.key.remote_jid), new FunXMPP.KeyValue("type", "chat"), new FunXMPP.KeyValue("id", message.key.id) }, messageChildren);
/*      */ 
/*  852 */       return messageNode;
/*      */     }
/*      */ 
/*      */     public void sendMessage(FunXMPP.FMessage message) throws IOException {
/*  856 */       if (message.media_wa_type != 0)
/*  857 */         sendMessageWithMedia(message);
/*      */       else
/*  859 */         sendMessageWithBody(message);
/*      */     }
/*      */ 
/*      */     public void sendSubjectReceived(String to, String id) throws IOException
/*      */     {
/*  864 */       FunXMPP.ProtocolTreeNode receivedNode = new FunXMPP.ProtocolTreeNode("received", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("xmlns", "urn:xmpp:receipts") });
/*      */ 
/*  866 */       FunXMPP.ProtocolTreeNode messageNode = getSubjectMessage(to, id, receivedNode);
/*  867 */       this.out.write(messageNode);
/*      */     }
/*      */ 
/*      */     public void sendMessageReceived(FunXMPP.FMessage message) throws IOException {
/*  871 */       FunXMPP.ProtocolTreeNode receivedNode = new FunXMPP.ProtocolTreeNode("received", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("xmlns", "urn:xmpp:receipts") });
/*      */ 
/*  876 */       FunXMPP.ProtocolTreeNode messageNode = new FunXMPP.ProtocolTreeNode("message", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("to", message.key.remote_jid), new FunXMPP.KeyValue("type", "chat"), new FunXMPP.KeyValue("id", message.key.id) }, receivedNode);
/*      */ 
/*  884 */       this.out.write(messageNode);
/*      */     }
/*      */ 
/*      */     public void sendPresenceSubscriptionRequest(String to) throws IOException {
/*  888 */       FunXMPP.ProtocolTreeNode presenceNode = new FunXMPP.ProtocolTreeNode("presence", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("type", "subscribe"), new FunXMPP.KeyValue("to", to) });
/*      */ 
/*  893 */       this.out.write(presenceNode);
/*      */     }
/*      */ 
/*      */     public void sendRelayComplete(String id, int millis) throws IOException {
/*  897 */       FunXMPP.ProtocolTreeNode relayNode = new FunXMPP.ProtocolTreeNode("relay", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("elapsed", Integer.toString(millis)) });
/*      */ 
/*  901 */       FunXMPP.ProtocolTreeNode iqNode = new FunXMPP.ProtocolTreeNode("iq", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("xmlns", "w:p:r"), new FunXMPP.KeyValue("type", "result"), new FunXMPP.KeyValue("to", "s.whatsapp.net"), new FunXMPP.KeyValue("id", id) }, relayNode);
/*      */ 
/*  908 */       this.out.write(iqNode);
/*      */     }
/*      */ 
/*      */     public void sendActive() throws IOException {
/*  912 */       FunXMPP.ProtocolTreeNode presenceNode = new FunXMPP.ProtocolTreeNode("presence", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("type", "active") });
/*      */ 
/*  916 */       this.out.write(presenceNode);
/*      */     }
/*      */ 
/*      */     public void sendInactive() throws IOException {
/*  920 */       FunXMPP.ProtocolTreeNode presenceNode = new FunXMPP.ProtocolTreeNode("presence", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("type", "inactive") });
/*      */ 
/*  924 */       this.out.write(presenceNode);
/*      */     }
/*      */ 
/*      */     public void sendRelayTimeout(String id) throws IOException {
/*  928 */       FunXMPP.ProtocolTreeNode timeoutNode = new FunXMPP.ProtocolTreeNode("remote-server-timeout", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("xmlns", "urn:ietf:params:xml:ns:xmpp-stanzas") });
/*      */ 
/*  932 */       FunXMPP.ProtocolTreeNode errorNode = new FunXMPP.ProtocolTreeNode("error", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("code", "504"), new FunXMPP.KeyValue("type", "wait") }, timeoutNode);
/*      */ 
/*  937 */       FunXMPP.ProtocolTreeNode iqNode = new FunXMPP.ProtocolTreeNode("iq", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("xmlns", "w:p:r"), new FunXMPP.KeyValue("type", "error"), new FunXMPP.KeyValue("to", "s.whatsapp.net"), new FunXMPP.KeyValue("id", id) }, errorNode);
/*      */ 
/*  944 */       this.out.write(iqNode);
/*      */     }
/*      */ 
/*      */     public void sendUnsubscribeMe(String jid) throws IOException {
/*  948 */       FunXMPP.ProtocolTreeNode presenceNode = new FunXMPP.ProtocolTreeNode("presence", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("type", "unsubscribe"), new FunXMPP.KeyValue("to", jid) });
/*      */ 
/*  953 */       this.out.write(presenceNode);
/*      */     }
/*      */ 
/*      */     public void sendUnsubscribeHim(String jid) throws IOException {
/*  957 */       FunXMPP.ProtocolTreeNode presenceNode = new FunXMPP.ProtocolTreeNode("presence", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("type", "unsubscribed"), new FunXMPP.KeyValue("to", jid) });
/*      */ 
/*  962 */       this.out.write(presenceNode);
/*      */     }
/*      */ 
/*      */     private String makeId(String prefix)
/*      */     {
/*  967 */       this.iqid += 1;
/*      */       String id;
/*      */       String id;
/*  969 */       if (this.verbose_id)
/*  970 */         id = prefix + this.iqid;
/*      */       else {
/*  972 */         id = Integer.toHexString(this.iqid);
/*      */       }
/*  974 */       return id;
/*      */     }
/*      */ 
/*      */     public void sendDeleteFromRoster(String jid) throws IOException {
/*  978 */       String id = makeId("roster_");
/*  979 */       FunXMPP.ProtocolTreeNode itemNode = new FunXMPP.ProtocolTreeNode("item", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("jid", jid), new FunXMPP.KeyValue("subscription", "remove") });
/*      */ 
/*  984 */       FunXMPP.ProtocolTreeNode queryNode = new FunXMPP.ProtocolTreeNode("query", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("xmlns", "jabber:iq:roster") }, itemNode);
/*      */ 
/*  988 */       FunXMPP.ProtocolTreeNode iqNode = new FunXMPP.ProtocolTreeNode("iq", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("type", "set"), new FunXMPP.KeyValue("id", id) }, queryNode);
/*      */ 
/*  993 */       this.out.write(iqNode);
/*      */     }
/*      */ 
/*      */     public void sendClose() throws IOException {
/*  997 */       FunXMPP.ProtocolTreeNode presenceNode = new FunXMPP.ProtocolTreeNode("presence", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("type", "unavailable") });
/*      */ 
/* 1001 */       this.out.write(presenceNode);
/* 1002 */       this.out.streamEnd();
/*      */     }
/*      */ 
/*      */     public void sendQueryLastOnline(String jid) throws IOException {
/* 1006 */       String id = makeId("last_");
/*      */ 
/* 1008 */       this.pending_server_requests.put(id, new FunXMPP.IqResultHandler() {
/*      */         public void parse(FunXMPP.ProtocolTreeNode node, String from) throws FunXMPP.CorruptStreamException, IOException {
/* 1010 */           FunXMPP.ProtocolTreeNode firstChild = node.getChild(0);
/* 1011 */           FunXMPP.ProtocolTreeNode.require(firstChild, "query");
/* 1012 */           String seconds = firstChild.getAttributeValue("seconds");
/* 1013 */           String status = null;
/* 1014 */           status = firstChild.data;
/*      */           try {
/* 1016 */             if ((seconds != null) && (from != null))
/* 1017 */               FunXMPP.Connection.this.event_handler.onLastSeen(from, Integer.parseInt(seconds), status);
/*      */           }
/*      */           catch (NumberFormatException x)
/*      */           {
/*      */           }
/*      */         }
/*      */       });
/* 1025 */       FunXMPP.ProtocolTreeNode queryNode = new FunXMPP.ProtocolTreeNode("query", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("xmlns", "jabber:iq:last") });
/*      */ 
/* 1027 */       FunXMPP.ProtocolTreeNode iqNode = new FunXMPP.ProtocolTreeNode("iq", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("id", id), new FunXMPP.KeyValue("type", "get"), new FunXMPP.KeyValue("to", jid) }, queryNode);
/*      */ 
/* 1033 */       this.out.write(iqNode);
/*      */     }
/*      */ 
/*      */     public void sendGetClientConfig() throws IOException {
/* 1037 */       String id = makeId("get_config_");
/*      */ 
/* 1039 */       this.pending_server_requests.put(id, new FunXMPP.IqResultHandler() {
/*      */         public void parse(FunXMPP.ProtocolTreeNode node, String from) throws FunXMPP.CorruptStreamException, IOException {
/* 1041 */           FunXMPP.ProtocolTreeNode configNode = node.getChild(0);
/* 1042 */           FunXMPP.ProtocolTreeNode.require(configNode, "config");
/* 1043 */           String push_id = configNode.getAttributeValue("id");
/* 1044 */           FunXMPP.Connection.this.event_handler.onClientConfigReceived(push_id);
/*      */         }
/*      */ 
/*      */         public void error(FunXMPP.ProtocolTreeNode node) throws FunXMPP.CorruptStreamException, IOException {
/* 1048 */           Vector nodes = node.getAllChildren("config");
/* 1049 */           for (int i = 0; i < nodes.size(); i++) {
/* 1050 */             FunXMPP.ProtocolTreeNode configNode = (FunXMPP.ProtocolTreeNode)nodes.elementAt(i);
/* 1051 */             if (configNode != null) {
/* 1052 */               String push_id = configNode.getAttributeValue("id");
/* 1053 */               FunXMPP.Connection.this.event_handler.onClientConfigReceived(push_id);
/*      */             }
/*      */           }
/*      */         }
/*      */       });
/* 1058 */       FunXMPP.ProtocolTreeNode configNode = new FunXMPP.ProtocolTreeNode("config", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("xmlns", "urn:xmpp:whatsapp:push") });
/*      */ 
/* 1060 */       FunXMPP.ProtocolTreeNode iqNode = new FunXMPP.ProtocolTreeNode("iq", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("id", id), new FunXMPP.KeyValue("type", "get"), new FunXMPP.KeyValue("to", this.domain) }, configNode);
/*      */ 
/* 1066 */       this.out.write(iqNode);
/*      */     }
/*      */ 
/*      */     public void sendClientConfig(String pushID, String platform) throws IOException {
/* 1070 */       String id = makeId("config_");
/* 1071 */       FunXMPP.ProtocolTreeNode configNode = new FunXMPP.ProtocolTreeNode("config", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("xmlns", "urn:xmpp:whatsapp:push"), new FunXMPP.KeyValue("id", pushID), new FunXMPP.KeyValue("platform", platform) });
/*      */ 
/* 1077 */       FunXMPP.ProtocolTreeNode iqNode = new FunXMPP.ProtocolTreeNode("iq", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("id", id), new FunXMPP.KeyValue("type", "set"), new FunXMPP.KeyValue("to", this.domain) }, configNode);
/*      */ 
/* 1083 */       this.out.write(iqNode);
/*      */     }
/*      */ 
/*      */     public void sendClientConfig(String sound, String pushID, boolean preview, String platform) throws IOException {
/* 1087 */       String id = makeId("config_");
/* 1088 */       FunXMPP.ProtocolTreeNode configNode = new FunXMPP.ProtocolTreeNode("config", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("xmlns", "urn:xmpp:whatsapp:push"), new FunXMPP.KeyValue("sound", sound), new FunXMPP.KeyValue("id", pushID), new FunXMPP.KeyValue("preview", preview ? "1" : "0"), new FunXMPP.KeyValue("platform", platform) });
/*      */ 
/* 1096 */       FunXMPP.ProtocolTreeNode iqNode = new FunXMPP.ProtocolTreeNode("iq", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("id", id), new FunXMPP.KeyValue("type", "set"), new FunXMPP.KeyValue("to", this.domain) }, configNode);
/*      */ 
/* 1102 */       this.out.write(iqNode);
/*      */     }
/*      */ 
/*      */     public void sendRelayCapable(String platform, boolean value) throws IOException {
/* 1106 */       String id = makeId("relay_");
/* 1107 */       FunXMPP.ProtocolTreeNode configNode = new FunXMPP.ProtocolTreeNode("config", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("xmlns", "urn:xmpp:whatsapp:push"), new FunXMPP.KeyValue("platform", platform), new FunXMPP.KeyValue("relay", value ? "1" : "0") });
/*      */ 
/* 1113 */       FunXMPP.ProtocolTreeNode iqNode = new FunXMPP.ProtocolTreeNode("iq", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("id", id), new FunXMPP.KeyValue("type", "set"), new FunXMPP.KeyValue("to", this.domain) }, configNode);
/*      */ 
/* 1119 */       this.out.write(iqNode);
/*      */     }
/*      */ 
/*      */     public void sendPing() throws IOException {
/* 1123 */       String id = makeId("ping_");
/*      */ 
/* 1125 */       this.pending_server_requests.put(id, new FunXMPP.IqResultHandler() {
/*      */         public void parse(FunXMPP.ProtocolTreeNode node, String from) throws FunXMPP.CorruptStreamException, IOException {
/* 1127 */           FunXMPP.Connection.this.event_handler.onPingResponseReceived();
/*      */         }
/*      */ 
/*      */         public void error(FunXMPP.ProtocolTreeNode node) throws FunXMPP.CorruptStreamException, IOException {
/* 1131 */           FunXMPP.Connection.this.event_handler.onPingResponseReceived();
/*      */         }
/*      */       });
/* 1134 */       FunXMPP.ProtocolTreeNode pingNode = new FunXMPP.ProtocolTreeNode("ping", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("xmlns", "w:p") });
/*      */ 
/* 1136 */       FunXMPP.ProtocolTreeNode iqNode = new FunXMPP.ProtocolTreeNode("iq", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("id", id), new FunXMPP.KeyValue("type", "get") }, pingNode);
/*      */ 
/* 1141 */       this.out.write(iqNode);
/*      */     }
/*      */ 
/*      */     public void sendGetPrivacyList() throws IOException {
/* 1145 */       String id = makeId("privacylist_");
/*      */ 
/* 1147 */       this.pending_server_requests.put(id, new FunXMPP.IqResultHandler() {
/*      */         public void parse(FunXMPP.ProtocolTreeNode node, String from) throws FunXMPP.CorruptStreamException, IOException {
/* 1149 */           FunXMPP.ProtocolTreeNode queryNode = node.getChild(0);
/* 1150 */           FunXMPP.ProtocolTreeNode.require(queryNode, "query");
/* 1151 */           FunXMPP.ProtocolTreeNode listNode = queryNode.getChild(0);
/* 1152 */           FunXMPP.ProtocolTreeNode.require(listNode, "list");
/* 1153 */           FunXMPP.Connection.this.event_handler.onPrivacyBlockListClear();
/* 1154 */           if (listNode.children != null)
/* 1155 */             for (int i = 0; i < listNode.children.length; i++) {
/* 1156 */               FunXMPP.ProtocolTreeNode itemNode = listNode.children[i];
/* 1157 */               FunXMPP.ProtocolTreeNode.require(itemNode, "item");
/* 1158 */               if ("jid".equals(itemNode.getAttributeValue("type"))) {
/* 1159 */                 String jid = itemNode.getAttributeValue("value");
/* 1160 */                 if (jid != null)
/* 1161 */                   FunXMPP.Connection.this.event_handler.onPrivacyBlockListAdd(jid);
/*      */               }
/*      */             }
/*      */         }
/*      */       });
/* 1168 */       FunXMPP.ProtocolTreeNode listNode = new FunXMPP.ProtocolTreeNode("list", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("name", "default") });
/*      */ 
/* 1170 */       FunXMPP.ProtocolTreeNode queryNode = new FunXMPP.ProtocolTreeNode("query", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("xmlns", "jabber:iq:privacy") }, listNode);
/*      */ 
/* 1172 */       FunXMPP.ProtocolTreeNode iqNode = new FunXMPP.ProtocolTreeNode("iq", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("id", id), new FunXMPP.KeyValue("type", "get") }, queryNode);
/*      */ 
/* 1177 */       this.out.write(iqNode);
/*      */     }
/*      */ 
/*      */     public void sendSetPrivacyBlockedList(Hashtable list) throws IOException {
/* 1181 */       sendSetPrivacyBlockedList(list, null, null);
/*      */     }
/*      */ 
/*      */     public void sendSetPrivacyBlockedList(Hashtable list, Runnable onSuccess, FunXMPP.IntRunnable onError) throws IOException {
/* 1185 */       String id = makeId("privacy_");
/*      */ 
/* 1187 */       this.pending_server_requests.put(id, new FunXMPP.IqResultHandler(onSuccess, onError) { private final Runnable val$onSuccess;
/*      */         private final FunXMPP.IntRunnable val$onError;
/*      */ 
/* 1190 */         public void parse(FunXMPP.ProtocolTreeNode node, String from) throws IOException, FunXMPP.CorruptStreamException { if (this.val$onSuccess != null)
/* 1191 */             this.val$onSuccess.run();
/*      */         }
/*      */ 
/*      */         public void error(int code)
/*      */         {
/* 1196 */           if (this.val$onError != null)
/* 1197 */             this.val$onError.run(code);
/*      */         }
/*      */       });
/* 1201 */       FunXMPP.ProtocolTreeNode[] listNodeChildren = new FunXMPP.ProtocolTreeNode[list.size()];
/* 1202 */       Enumeration e = list.elements();
/* 1203 */       for (int order = 0; e.hasMoreElements(); order++) {
/* 1204 */         String jid = (String)e.nextElement();
/* 1205 */         listNodeChildren[order] = new FunXMPP.ProtocolTreeNode("item", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("type", "jid"), new FunXMPP.KeyValue("value", jid), new FunXMPP.KeyValue("action", "deny"), new FunXMPP.KeyValue("order", Integer.toString(order)) });
/*      */       }
/*      */ 
/* 1213 */       FunXMPP.ProtocolTreeNode listNode = new FunXMPP.ProtocolTreeNode("list", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("name", "default") }, listNodeChildren.length == 0 ? null : listNodeChildren);
/*      */ 
/* 1216 */       FunXMPP.ProtocolTreeNode queryNode = new FunXMPP.ProtocolTreeNode("query", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("xmlns", "jabber:iq:privacy") }, listNode);
/*      */ 
/* 1218 */       FunXMPP.ProtocolTreeNode iqNode = new FunXMPP.ProtocolTreeNode("iq", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("id", id), new FunXMPP.KeyValue("type", "set") }, queryNode);
/*      */ 
/* 1223 */       this.out.write(iqNode);
/*      */     }
/*      */ 
/*      */     public void sendClearDirty(String category) throws IOException {
/* 1227 */       Vector v = new Vector();
/* 1228 */       v.addElement(category);
/* 1229 */       sendClearDirty(v);
/*      */     }
/*      */ 
/*      */     public void sendClearDirty(Vector categoryNames) throws IOException {
/* 1233 */       String id = makeId("clean_dirty_");
/*      */ 
/* 1235 */       this.pending_server_requests.put(id, new FunXMPP.IqResultHandler()
/*      */       {
/*      */         public void parse(FunXMPP.ProtocolTreeNode node, String from)
/*      */           throws FunXMPP.CorruptStreamException, IOException
/*      */         {
/*      */         }
/*      */       });
/* 1239 */       int size = categoryNames.size();
/* 1240 */       FunXMPP.ProtocolTreeNode[] cleanNodeChildren = new FunXMPP.ProtocolTreeNode[size];
/* 1241 */       for (int i = 0; i < size; i++) {
/* 1242 */         cleanNodeChildren[i] = new FunXMPP.ProtocolTreeNode("category", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("name", (String)categoryNames.elementAt(i)) });
/*      */       }
/*      */ 
/* 1245 */       FunXMPP.ProtocolTreeNode cleanNode = new FunXMPP.ProtocolTreeNode("clean", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("xmlns", "urn:xmpp:whatsapp:dirty") }, cleanNodeChildren);
/*      */ 
/* 1248 */       FunXMPP.ProtocolTreeNode iqNode = new FunXMPP.ProtocolTreeNode("iq", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("id", id), new FunXMPP.KeyValue("type", "set"), new FunXMPP.KeyValue("to", "s.whatsapp.net") }, cleanNode);
/*      */ 
/* 1254 */       this.out.write(iqNode);
/*      */     }
/*      */ 
/*      */     public void sendGetDirty() throws IOException {
/* 1258 */       String id = makeId("get_dirty_");
/*      */ 
/* 1260 */       this.pending_server_requests.put(id, new FunXMPP.IqResultHandler() {
/*      */         public void parse(FunXMPP.ProtocolTreeNode node, String from) throws FunXMPP.CorruptStreamException, IOException {
/* 1262 */           FunXMPP.ProtocolTreeNode dirtyNode = node.getChild(0);
/* 1263 */           FunXMPP.ProtocolTreeNode.require(dirtyNode, "dirty");
/* 1264 */           Hashtable categories = FunXMPP.Connection.this.parseCategories(dirtyNode);
/* 1265 */           FunXMPP.Connection.this.event_handler.onDirtyResponse(categories);
/*      */         }
/*      */       });
/* 1268 */       FunXMPP.ProtocolTreeNode statusNode = new FunXMPP.ProtocolTreeNode("status", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("xmlns", "urn:xmpp:whatsapp:dirty") });
/*      */ 
/* 1270 */       FunXMPP.ProtocolTreeNode iqNode = new FunXMPP.ProtocolTreeNode("iq", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("id", id), new FunXMPP.KeyValue("type", "get"), new FunXMPP.KeyValue("to", "s.whatsapp.net") }, statusNode);
/*      */ 
/* 1276 */       this.out.write(iqNode);
/*      */     }
/*      */ 
/*      */     public void sendGetServerProperties() throws IOException {
/* 1280 */       String id = makeId("get_server_properties_");
/*      */ 
/* 1282 */       this.pending_server_requests.put(id, new FunXMPP.IqResultHandler() {
/*      */         public void parse(FunXMPP.ProtocolTreeNode node, String from) throws FunXMPP.CorruptStreamException, IOException {
/* 1284 */           Vector nodes = node.getAllChildren("prop");
/* 1285 */           Hashtable nameValueMap = new Hashtable();
/* 1286 */           for (int i = 0; i < nodes.size(); i++) {
/* 1287 */             FunXMPP.ProtocolTreeNode propNode = (FunXMPP.ProtocolTreeNode)nodes.elementAt(i);
/* 1288 */             String nameAttr = propNode.getAttributeValue("name");
/* 1289 */             String valueAttr = propNode.getAttributeValue("value");
/* 1290 */             nameValueMap.put(nameAttr, valueAttr);
/*      */           }
/* 1292 */           FunXMPP.Connection.this.group_event_handler.onServerProperties(nameValueMap);
/*      */         }
/*      */       });
/* 1295 */       FunXMPP.ProtocolTreeNode listNode = new FunXMPP.ProtocolTreeNode("list", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("xmlns", "w:g"), new FunXMPP.KeyValue("type", "props") });
/*      */ 
/* 1300 */       FunXMPP.ProtocolTreeNode iqNode = new FunXMPP.ProtocolTreeNode("iq", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("id", id), new FunXMPP.KeyValue("type", "get"), new FunXMPP.KeyValue("to", "g.us") }, listNode);
/*      */ 
/* 1306 */       this.out.write(iqNode);
/*      */     }
/*      */ 
/*      */     public void sendCreateGroupChat(String subject) throws IOException {
/* 1310 */       sendCreateGroupChat(subject, null, null);
/*      */     }
/*      */ 
/*      */     public void sendCreateGroupChat(String subject, FunXMPP.StringRunnable onSuccess, FunXMPP.IntRunnable onError) throws IOException {
/* 1314 */       String id = makeId("create_group_");
/*      */ 
/* 1316 */       this.pending_server_requests.put(id, new FunXMPP.IqResultHandler(subject, onSuccess, onError) { private final String val$subject;
/*      */         private final FunXMPP.StringRunnable val$onSuccess;
/*      */         private final FunXMPP.IntRunnable val$onError;
/*      */ 
/* 1318 */         public void parse(FunXMPP.ProtocolTreeNode node, String from) throws FunXMPP.CorruptStreamException, IOException { FunXMPP.ProtocolTreeNode groupNode = node.getChild(0);
/* 1319 */           FunXMPP.ProtocolTreeNode.require(groupNode, "group");
/* 1320 */           String gid = groupNode.getAttributeValue("id");
/* 1321 */           FunXMPP.Connection.this.group_event_handler.onGroupCreated(FunXMPP.Connection.this.gidToGjid(gid), this.val$subject);
/* 1322 */           if (this.val$onSuccess != null)
/* 1323 */             this.val$onSuccess.run(FunXMPP.Connection.this.gidToGjid(gid)); }
/*      */ 
/*      */         public void error(int code)
/*      */         {
/* 1327 */           if (this.val$onError != null)
/* 1328 */             this.val$onError.run(code);
/*      */         }
/*      */       });
/* 1332 */       FunXMPP.ProtocolTreeNode groupNode = new FunXMPP.ProtocolTreeNode("group", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("xmlns", "w:g"), new FunXMPP.KeyValue("action", "create"), new FunXMPP.KeyValue("subject", subject) });
/*      */ 
/* 1338 */       FunXMPP.ProtocolTreeNode iqNode = new FunXMPP.ProtocolTreeNode("iq", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("id", id), new FunXMPP.KeyValue("type", "set"), new FunXMPP.KeyValue("to", "g.us") }, groupNode);
/*      */ 
/* 1344 */       this.out.write(iqNode);
/*      */     }
/*      */ 
/*      */     public void sendEndGroupChat(String gjid) throws IOException {
/* 1348 */       sendEndGroupChat(gjid, null, null);
/*      */     }
/*      */ 
/*      */     public void sendEndGroupChat(String gjid, Runnable onSuccess, FunXMPP.IntRunnable onError) throws IOException {
/* 1352 */       String id = makeId("remove_group_");
/*      */ 
/* 1354 */       this.pending_server_requests.put(id, new FunXMPP.IqResultHandler(onSuccess, onError) { private final Runnable val$onSuccess;
/*      */         private final FunXMPP.IntRunnable val$onError;
/*      */ 
/* 1356 */         public void parse(FunXMPP.ProtocolTreeNode node, String from) throws FunXMPP.CorruptStreamException, IOException { if (this.val$onSuccess != null)
/* 1357 */             this.val$onSuccess.run(); }
/*      */ 
/*      */         public void error(int code)
/*      */         {
/* 1361 */           if (this.val$onError != null)
/* 1362 */             this.val$onError.run(code);
/*      */         }
/*      */       });
/* 1366 */       FunXMPP.ProtocolTreeNode groupNode = new FunXMPP.ProtocolTreeNode("group", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("xmlns", "w:g"), new FunXMPP.KeyValue("action", "delete") });
/*      */ 
/* 1371 */       FunXMPP.ProtocolTreeNode iqNode = new FunXMPP.ProtocolTreeNode("iq", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("id", id), new FunXMPP.KeyValue("type", "set"), new FunXMPP.KeyValue("to", gjid) }, groupNode);
/*      */ 
/* 1377 */       this.out.write(iqNode);
/*      */     }
/*      */ 
/*      */     public void sendGetGroupInfo(String gjid) throws IOException {
/* 1381 */       String id = makeId("get_g_info_");
/*      */ 
/* 1383 */       this.pending_server_requests.put(id, new FunXMPP.IqResultHandler() {
/*      */         public void parse(FunXMPP.ProtocolTreeNode node, String from) throws FunXMPP.CorruptStreamException, IOException {
/* 1385 */           FunXMPP.ProtocolTreeNode groupNode = node.getChild(0);
/* 1386 */           FunXMPP.ProtocolTreeNode.require(groupNode, "group");
/* 1387 */           String gid = groupNode.getAttributeValue("id");
/* 1388 */           String owner = groupNode.getAttributeValue("owner");
/* 1389 */           String subject = groupNode.getAttributeValue("subject");
/* 1390 */           String subject_t = groupNode.getAttributeValue("s_t");
/* 1391 */           String subject_owner = groupNode.getAttributeValue("s_o");
/* 1392 */           String creation = groupNode.getAttributeValue("creation");
/* 1393 */           FunXMPP.Connection.this.group_event_handler.onGroupInfo(from, owner, subject, subject_owner, Integer.parseInt(subject_t), Integer.parseInt(creation));
/*      */         }
/*      */       });
/* 1397 */       FunXMPP.ProtocolTreeNode queryNode = new FunXMPP.ProtocolTreeNode("query", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("xmlns", "w:g") });
/*      */ 
/* 1399 */       FunXMPP.ProtocolTreeNode iqNode = new FunXMPP.ProtocolTreeNode("iq", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("id", id), new FunXMPP.KeyValue("type", "get"), new FunXMPP.KeyValue("to", gjid) }, queryNode);
/*      */ 
/* 1405 */       this.out.write(iqNode);
/*      */     }
/*      */ 
/*      */     public void sendGetOwningGroups() throws IOException {
/* 1409 */       String id = makeId("get_owning_groups_");
/*      */ 
/* 1411 */       this.pending_server_requests.put(id, new FunXMPP.IqResultHandler() {
/*      */         public void parse(FunXMPP.ProtocolTreeNode node, String from) throws FunXMPP.CorruptStreamException, IOException {
/* 1413 */           Vector groups = new Vector();
/* 1414 */           FunXMPP.Connection.this.readGroupList(node, groups);
/* 1415 */           FunXMPP.Connection.this.group_event_handler.onOwningGroups(groups);
/*      */         }
/*      */       });
/* 1419 */       sendGetGroups(id, "owning");
/*      */     }
/*      */ 
/*      */     public synchronized void sendGetGroups() throws IOException {
/* 1423 */       sendGetGroups((Runnable)null, (FunXMPP.IntRunnable)null);
/*      */     }
/*      */ 
/*      */     public synchronized void sendGetGroups(Runnable onSuccess, FunXMPP.IntRunnable onError) throws IOException {
/* 1427 */       String id = makeId("get_groups_");
/*      */ 
/* 1429 */       this.pending_server_requests.put(id, new FunXMPP.IqResultHandler(onSuccess, onError) { private final Runnable val$onSuccess;
/*      */         private final FunXMPP.IntRunnable val$onError;
/*      */ 
/* 1431 */         public void parse(FunXMPP.ProtocolTreeNode node, String from) throws FunXMPP.CorruptStreamException, IOException { Vector groups = new Vector();
/* 1432 */           FunXMPP.Connection.this.readGroupList(node, groups);
/* 1433 */           FunXMPP.Connection.this.group_event_handler.onParticipatingGroups(groups);
/* 1434 */           if (this.val$onSuccess != null)
/* 1435 */             this.val$onSuccess.run();
/*      */         }
/*      */ 
/*      */         public void error(int code)
/*      */         {
/* 1440 */           if (this.val$onError != null)
/* 1441 */             this.val$onError.run(code);
/*      */         }
/*      */       });
/* 1446 */       sendGetGroups(id, "participating");
/*      */     }
/*      */ 
/*      */     private void sendGetGroups(String id, String type) throws IOException {
/* 1450 */       FunXMPP.ProtocolTreeNode listNode = new FunXMPP.ProtocolTreeNode("list", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("xmlns", "w:g"), new FunXMPP.KeyValue("type", type) });
/*      */ 
/* 1455 */       FunXMPP.ProtocolTreeNode iqNode = new FunXMPP.ProtocolTreeNode("iq", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("id", id), new FunXMPP.KeyValue("type", "get"), new FunXMPP.KeyValue("to", "g.us") }, listNode);
/*      */ 
/* 1461 */       this.out.write(iqNode);
/*      */     }
/*      */ 
/*      */     public void sendSetGroupSubject(String gjid, String subject) throws IOException {
/* 1465 */       sendSetGroupSubject(gjid, subject, null, null);
/*      */     }
/*      */ 
/*      */     public void sendSetGroupSubject(String gjid, String subject, Runnable onSuccess, FunXMPP.IntRunnable onError) throws IOException {
/* 1469 */       String id = makeId("set_group_subject_");
/*      */ 
/* 1471 */       this.pending_server_requests.put(id, new FunXMPP.IqResultHandler(onSuccess, onError) { private final Runnable val$onSuccess;
/*      */         private final FunXMPP.IntRunnable val$onError;
/*      */ 
/* 1473 */         public void parse(FunXMPP.ProtocolTreeNode node, String from) throws FunXMPP.CorruptStreamException, IOException { FunXMPP.Connection.this.group_event_handler.onSetSubject(from);
/* 1474 */           if (this.val$onSuccess != null)
/* 1475 */             this.val$onSuccess.run(); }
/*      */ 
/*      */         public void error(int code)
/*      */         {
/* 1479 */           if (this.val$onError != null)
/* 1480 */             this.val$onError.run(code);
/*      */         }
/*      */       });
/* 1484 */       FunXMPP.ProtocolTreeNode subjectNode = new FunXMPP.ProtocolTreeNode("subject", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("xmlns", "w:g"), new FunXMPP.KeyValue("value", subject) });
/*      */ 
/* 1489 */       FunXMPP.ProtocolTreeNode iqNode = new FunXMPP.ProtocolTreeNode("iq", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("id", id), new FunXMPP.KeyValue("type", "set"), new FunXMPP.KeyValue("to", gjid) }, subjectNode);
/*      */ 
/* 1495 */       this.out.write(iqNode);
/*      */     }
/*      */ 
/*      */     public void sendAddParticipants(String gjid, Vector participants) throws IOException {
/* 1499 */       sendAddParticipants(gjid, participants, null, null);
/*      */     }
/*      */     public void sendAddParticipants(String gjid, Vector participants, Runnable onSuccess, FunXMPP.IntRunnable onError) throws IOException {
/* 1502 */       String id = makeId("add_group_participants_");
/*      */ 
/* 1504 */       this.pending_server_requests.put(id, new FunXMPP.IqResultHandler(onSuccess, onError) { private final Runnable val$onSuccess;
/*      */         private final FunXMPP.IntRunnable val$onError;
/*      */ 
/* 1506 */         public void parse(FunXMPP.ProtocolTreeNode node, String from) throws FunXMPP.CorruptStreamException, IOException { Vector successVector = new Vector();
/* 1507 */           Hashtable failTable = new Hashtable();
/* 1508 */           FunXMPP.Connection.this.readSuccessAndFailure(node, successVector, failTable, "add");
/* 1509 */           FunXMPP.Connection.this.group_event_handler.onAddGroupParticipants(from, successVector, failTable);
/* 1510 */           if (this.val$onSuccess != null)
/* 1511 */             this.val$onSuccess.run(); }
/*      */ 
/*      */         public void error(int code)
/*      */         {
/* 1515 */           if (this.val$onError != null)
/* 1516 */             this.val$onError.run(code);
/*      */         }
/*      */       });
/* 1521 */       sendVerbParticipants(gjid, participants, id, "add");
/*      */     }
/*      */ 
/*      */     public void sendRemoveParticipants(String gjid, Vector participants) throws IOException {
/* 1525 */       sendRemoveParticipants(gjid, participants, null, null);
/*      */     }
/*      */     public void sendRemoveParticipants(String gjid, Vector participants, Runnable onSuccess, FunXMPP.IntRunnable onError) throws IOException {
/* 1528 */       String id = makeId("remove_group_participants_");
/*      */ 
/* 1530 */       this.pending_server_requests.put(id, new FunXMPP.IqResultHandler(onSuccess, onError) { private final Runnable val$onSuccess;
/*      */         private final FunXMPP.IntRunnable val$onError;
/*      */ 
/* 1532 */         public void parse(FunXMPP.ProtocolTreeNode node, String from) throws FunXMPP.CorruptStreamException, IOException { Vector successVector = new Vector();
/* 1533 */           Hashtable failTable = new Hashtable();
/* 1534 */           FunXMPP.Connection.this.readSuccessAndFailure(node, successVector, failTable, "remove");
/* 1535 */           FunXMPP.Connection.this.group_event_handler.onRemoveGroupParticipants(from, successVector, failTable);
/* 1536 */           if (this.val$onSuccess != null)
/* 1537 */             this.val$onSuccess.run(); }
/*      */ 
/*      */         public void error(int code)
/*      */         {
/* 1541 */           if (this.val$onError != null)
/* 1542 */             this.val$onError.run(code);
/*      */         }
/*      */       });
/* 1547 */       sendVerbParticipants(gjid, participants, id, "remove");
/*      */     }
/*      */ 
/*      */     public void sendLeaveGroup(String gjid) throws IOException {
/* 1551 */       sendLeaveGroup(gjid, null, null);
/*      */     }
/*      */ 
/*      */     public void sendLeaveGroup(String gjid, Runnable onSuccess, FunXMPP.IntRunnable onError) throws IOException {
/* 1555 */       Vector gjids = new Vector();
/* 1556 */       gjids.addElement(gjid);
/* 1557 */       sendLeaveGroups(gjids, onSuccess, onError);
/*      */     }
/*      */ 
/*      */     public void sendLeaveGroups(Vector gjids, Runnable onSuccess, FunXMPP.IntRunnable onError) throws IOException {
/* 1561 */       String id = makeId("leave_group_");
/*      */ 
/* 1563 */       this.pending_server_requests.put(id, new FunXMPP.IqResultHandler(onSuccess, onError) { private final Runnable val$onSuccess;
/*      */         private final FunXMPP.IntRunnable val$onError;
/*      */ 
/* 1565 */         public void parse(FunXMPP.ProtocolTreeNode node, String from) { FunXMPP.ProtocolTreeNode leaveChild = node.getChild("leave");
/* 1566 */           if (leaveChild != null) {
/* 1567 */             Vector groups = leaveChild.getAllChildren("group");
/* 1568 */             for (int i = 0; i < groups.size(); i++) {
/* 1569 */               FunXMPP.Connection.this.group_event_handler.onLeaveGroup(((FunXMPP.ProtocolTreeNode)groups.elementAt(i)).getAttributeValue("id"));
/*      */             }
/*      */           }
/*      */ 
/* 1573 */           if (this.val$onSuccess != null)
/* 1574 */             this.val$onSuccess.run(); }
/*      */ 
/*      */         public void error(int code)
/*      */         {
/* 1578 */           if (this.val$onError != null)
/* 1579 */             this.val$onError.run(code);
/*      */         }
/*      */       });
/* 1583 */       int size = gjids.size();
/* 1584 */       FunXMPP.ProtocolTreeNode[] groupJidList = new FunXMPP.ProtocolTreeNode[size];
/* 1585 */       for (int i = 0; i < size; i++) {
/* 1586 */         groupJidList[i] = new FunXMPP.ProtocolTreeNode("group", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("id", (String)gjids.elementAt(i)) });
/*      */       }
/*      */ 
/* 1589 */       FunXMPP.ProtocolTreeNode leaveNode = new FunXMPP.ProtocolTreeNode("leave", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("xmlns", "w:g") }, groupJidList);
/*      */ 
/* 1593 */       FunXMPP.ProtocolTreeNode iqNode = new FunXMPP.ProtocolTreeNode("iq", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("id", id), new FunXMPP.KeyValue("type", "set"), new FunXMPP.KeyValue("to", "g.us") }, leaveNode);
/*      */ 
/* 1599 */       this.out.write(iqNode);
/*      */     }
/*      */ 
/*      */     private void sendVerbParticipants(String gjid, Vector participants, String id, String inner_tag) throws IOException
/*      */     {
/* 1604 */       int size = participants.size();
/* 1605 */       FunXMPP.ProtocolTreeNode[] innerNodeChildren = new FunXMPP.ProtocolTreeNode[size];
/* 1606 */       for (int i = 0; i < size; i++) {
/* 1607 */         innerNodeChildren[i] = new FunXMPP.ProtocolTreeNode("participant", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("jid", (String)participants.elementAt(i)) });
/*      */       }
/*      */ 
/* 1612 */       FunXMPP.ProtocolTreeNode innerNode = new FunXMPP.ProtocolTreeNode(inner_tag, new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("xmlns", "w:g") }, innerNodeChildren);
/*      */ 
/* 1616 */       FunXMPP.ProtocolTreeNode iqNode = new FunXMPP.ProtocolTreeNode("iq", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("id", id), new FunXMPP.KeyValue("type", "set"), new FunXMPP.KeyValue("to", gjid) }, innerNode);
/*      */ 
/* 1622 */       this.out.write(iqNode);
/*      */     }
/*      */ 
/*      */     public void sendGetParticipants(String gjid) throws IOException {
/* 1626 */       String id = makeId("get_participants_");
/*      */ 
/* 1628 */       this.pending_server_requests.put(id, new FunXMPP.IqResultHandler() {
/*      */         public void parse(FunXMPP.ProtocolTreeNode node, String from) throws IOException {
/* 1630 */           Vector participants = new Vector();
/* 1631 */           FunXMPP.Connection.this.readAttributeList(node, participants, "participant", "jid");
/* 1632 */           FunXMPP.Connection.this.group_event_handler.onGetParticipants(from, participants);
/*      */         }
/*      */       });
/* 1635 */       FunXMPP.ProtocolTreeNode listNode = new FunXMPP.ProtocolTreeNode("list", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("xmlns", "w:g") });
/*      */ 
/* 1639 */       FunXMPP.ProtocolTreeNode iqNode = new FunXMPP.ProtocolTreeNode("iq", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("id", id), new FunXMPP.KeyValue("type", "get"), new FunXMPP.KeyValue("to", gjid) }, listNode);
/*      */ 
/* 1645 */       this.out.write(iqNode);
/*      */     }
/*      */ 
/*      */     public void sendAvailableForChat() throws IOException {
/* 1649 */       FunXMPP.ProtocolTreeNode presenceNode = new FunXMPP.ProtocolTreeNode("presence", new FunXMPP.KeyValue[] { new FunXMPP.KeyValue("name", this.push_name) });
/*      */ 
/* 1653 */       this.out.write(presenceNode);
/*      */     }
/*      */ 
/*      */     private String gidToGjid(String gid) {
/* 1657 */       return gid + "@g.us";
/*      */     }
/*      */     public boolean read() throws IOException, FunXMPP.CorruptStreamException {
/*      */       FunXMPP.ProtocolTreeNode node;
/*      */       try {
/* 1663 */         node = this.in.nextTree();
/* 1664 */         this.lastTreeRead = System.currentTimeMillis();
/*      */       } catch (IOException ioe) {
/* 1666 */         throw ioe;
/*      */       } catch (FunXMPP.CorruptStreamException cse) {
/* 1668 */         throw cse;
/*      */       } catch (Throwable t) {
/* 1670 */         throw new FunXMPP.FunRuntimeException(t, this.in.lastStanza());
/*      */       }
/* 1672 */       if (node == null) {
/* 1673 */         return false;
/*      */       }
/* 1675 */       if (FunXMPP.ProtocolTreeNode.tagEquals(node, "iq")) {
/* 1676 */         String type = node.getAttributeValue("type");
/* 1677 */         String id = node.getAttributeValue("id");
/* 1678 */         String from = Utilities.safeIntern(node.getAttributeValue("from"));
/*      */ 
/* 1680 */         if (type == null) {
/* 1681 */           throw new FunXMPP.CorruptStreamException("missing 'type' attribute in iq stanza");
/*      */         }
/* 1683 */         if (type.equals("result")) {
/* 1684 */           if (this.pending_server_requests.containsKey(id)) {
/* 1685 */             FunXMPP.IqResultHandler handler = (FunXMPP.IqResultHandler)this.pending_server_requests.remove(id);
/*      */ 
/* 1687 */             handler.parse(node, from);
/*      */           }
/* 1689 */           else if (id.startsWith(this.user))
/*      */           {
/* 1693 */             FunXMPP.ProtocolTreeNode accountNode = node.getChild(0);
/* 1694 */             FunXMPP.ProtocolTreeNode.require(accountNode, "account");
/* 1695 */             String kind = accountNode.getAttributeValue("kind");
/* 1696 */             if ("paid".equals(kind)) {
/* 1697 */               this.account_kind = 1;
/*      */             }
/* 1699 */             else if ("free".equals(kind)) {
/* 1700 */               this.account_kind = 0;
/*      */             }
/*      */             else {
/* 1703 */               this.account_kind = -1;
/*      */             }
/* 1705 */             String expiration = accountNode.getAttributeValue("expiration");
/* 1706 */             if (expiration == null)
/* 1707 */               throw new IOException("no expiration");
/*      */             try
/*      */             {
/* 1710 */               this.expire_date = Long.parseLong(expiration);
/*      */             }
/*      */             catch (NumberFormatException xxx) {
/* 1713 */               throw new IOException("invalid expire date: " + expiration);
/*      */             }
/* 1715 */             this.event_handler.onAccountChange(this.account_kind, this.expire_date);
/*      */           }
/*      */         }
/* 1718 */         else if (type.equals("error")) {
/* 1719 */           if (this.pending_server_requests.containsKey(id)) {
/* 1720 */             FunXMPP.IqResultHandler handler = (FunXMPP.IqResultHandler)this.pending_server_requests.remove(id);
/*      */ 
/* 1722 */             handler.error(node);
/*      */           }
/*      */         }
/* 1725 */         else if (type.equals("get")) {
/* 1726 */           FunXMPP.ProtocolTreeNode childNode = node.getChild(0);
/* 1727 */           if (FunXMPP.ProtocolTreeNode.tagEquals(childNode, "ping")) {
/* 1728 */             this.event_handler.onPing(id);
/*      */           }
/* 1730 */           else if ((FunXMPP.ProtocolTreeNode.tagEquals(childNode, "query")) && (from != null) ? 
/* 1731 */             "http://jabber.org/protocol/disco#info".equals(childNode.getAttributeValue("xmlns")) : 
/* 1735 */             (FunXMPP.ProtocolTreeNode.tagEquals(childNode, "relay")) && (from != null)) { String pin = childNode.getAttributeValue("pin");
/* 1737 */             String timeoutString = childNode.getAttributeValue("timeout");
/*      */             int timeoutSeconds;
/*      */             try { timeoutSeconds = timeoutString == null ? 0 : Integer.parseInt(timeoutString);
/*      */             } catch (NumberFormatException e) {
/* 1742 */               throw new FunXMPP.CorruptStreamException("relay-iq exception parsing timeout attribute: " + timeoutString);
/*      */             }
/* 1744 */             if (pin != null) {
/* 1745 */               this.event_handler.onRelayRequest(pin, timeoutSeconds, id);
/*      */             }
/*      */           }
/*      */         }
/* 1749 */         else if (type.equals("set")) {
/* 1750 */           FunXMPP.ProtocolTreeNode childNode = node.getChild(0);
/* 1751 */           if (FunXMPP.ProtocolTreeNode.tagEquals(childNode, "query")) {
/* 1752 */             String xmlns = childNode.getAttributeValue("xmlns");
/* 1753 */             if ("jabber:iq:roster".equals(xmlns)) {
/* 1754 */               Vector itemNodes = childNode.getAllChildren("item");
/*      */               String ask;
/* 1755 */               for (int i = 0; i < itemNodes.size(); i++) {
/* 1756 */                 FunXMPP.ProtocolTreeNode itemNode = (FunXMPP.ProtocolTreeNode)itemNodes.elementAt(i);
/* 1757 */                 String jid = itemNode.getAttributeValue("jid");
/* 1758 */                 String subscription = itemNode.getAttributeValue("subscription");
/* 1759 */                 ask = itemNode.getAttributeValue("ask");
/*      */               }
/*      */             }
/*      */           }
/*      */         }
/*      */         else
/*      */         {
/* 1766 */           throw new FunXMPP.CorruptStreamException("unknown iq type attribute: " + type);
/*      */         }
/*      */       }
/* 1769 */       else if (FunXMPP.ProtocolTreeNode.tagEquals(node, "presence")) {
/* 1770 */         String xmlns = node.getAttributeValue("xmlns");
/* 1771 */         String from = Utilities.safeIntern(node.getAttributeValue("from"));
/* 1772 */         if (((xmlns == null) || ("urn:xmpp".equals(xmlns))) && (from != null)) {
/* 1773 */           String type = node.getAttributeValue("type");
/* 1774 */           if ("unavailable".equals(type))
/* 1775 */             this.event_handler.onAvailable(from, false);
/* 1776 */           else if ((null == type) || ("available".equals(type)))
/*      */           {
/* 1779 */             this.event_handler.onAvailable(from, true);
/*      */           }
/*      */         }
/* 1782 */         else if (("w".equals(xmlns)) && (from != null)) {
/* 1783 */           String add = node.getAttributeValue("add");
/* 1784 */           String remove = node.getAttributeValue("remove");
/* 1785 */           String status = node.getAttributeValue("status");
/* 1786 */           if (add != null) {
/* 1787 */             if (this.group_event_handler != null)
/* 1788 */               this.group_event_handler.onGroupAddUser(from, add);
/*      */           }
/* 1790 */           else if (remove != null) {
/* 1791 */             if (this.group_event_handler != null)
/* 1792 */               this.group_event_handler.onGroupRemoveUser(from, remove);
/*      */           }
/* 1794 */           else if ("dirty".equals(status)) {
/* 1795 */             Hashtable categories = parseCategories(node);
/* 1796 */             this.event_handler.onDirty(categories);
/*      */           }
/*      */         }
/*      */       }
/* 1800 */       else if (FunXMPP.ProtocolTreeNode.tagEquals(node, "message")) {
/* 1801 */         parseMessageInitialTagAlreadyChecked(node);
/*      */       }
/* 1803 */       return true;
/*      */     }
/*      */ 
/*      */     private void parseMessageInitialTagAlreadyChecked(FunXMPP.ProtocolTreeNode messageNode) throws IOException, FunXMPP.CorruptStreamException {
/* 1807 */       FunXMPP.FMessage.Builder builder = new FunXMPP.FMessage.Builder();
/* 1808 */       String id = messageNode.getAttributeValue("id");
/* 1809 */       String attribute_t = messageNode.getAttributeValue("t");
/* 1810 */       String from = Utilities.safeIntern(messageNode.getAttributeValue("from"));
/* 1811 */       String author = messageNode.getAttributeValue("author");
/* 1812 */       if (author == null) {
/* 1813 */         author = "";
/*      */       }
/* 1815 */       String typeAttribute = messageNode.getAttributeValue("type");
/* 1816 */       if ("error".equals(typeAttribute)) {
/* 1817 */         int errorCode = 0;
/* 1818 */         Vector errorNodes = messageNode.getAllChildren("error");
/* 1819 */         for (int i = 0; i < errorNodes.size(); i++) {
/* 1820 */           FunXMPP.ProtocolTreeNode errorNode = (FunXMPP.ProtocolTreeNode)errorNodes.elementAt(i);
/* 1821 */           String codeString = errorNode.getAttributeValue("code");
/*      */           try {
/* 1823 */             errorCode = Integer.parseInt(codeString);
/*      */           }
/*      */           catch (Exception e) {
/*      */           }
/*      */         }
/* 1828 */         FunXMPP.FMessage fmsg = null;
/* 1829 */         if ((from != null) && (id != null)) {
/* 1830 */           FunXMPP.FMessage.Key key = new FunXMPP.FMessage.Key(from, true, id);
/* 1831 */           fmsg = (FunXMPP.FMessage)FunXMPP.message_store.get(key);
/*      */         }
/* 1833 */         if (fmsg != null) {
/* 1834 */           fmsg.status = 7;
/* 1835 */           this.event_handler.onMessageError(fmsg, errorCode);
/*      */         }
/* 1837 */       } else if ("subject".equals(typeAttribute)) {
/* 1838 */         boolean receiptRequested = false;
/* 1839 */         Vector requestNodes = messageNode.getAllChildren("request");
/* 1840 */         for (int i = 0; i < requestNodes.size(); i++) {
/* 1841 */           FunXMPP.ProtocolTreeNode requestNode = (FunXMPP.ProtocolTreeNode)requestNodes.elementAt(i);
/* 1842 */           if ("urn:xmpp:receipts".equals(requestNode.getAttributeValue("xmlns"))) {
/* 1843 */             receiptRequested = true;
/*      */           }
/*      */         }
/* 1846 */         FunXMPP.ProtocolTreeNode bodyNode = messageNode.getChild("body");
/* 1847 */         String newSubject = bodyNode == null ? null : bodyNode.data;
/* 1848 */         if ((newSubject != null) && (this.group_event_handler != null)) {
/* 1849 */           this.group_event_handler.onGroupNewSubject(from, author, newSubject, Integer.parseInt(attribute_t));
/*      */         }
/* 1851 */         if (receiptRequested)
/* 1852 */           sendSubjectReceived(from, id);
/*      */       }
/* 1854 */       else if ("chat".equals(typeAttribute)) {
/* 1855 */         boolean duplicate = false;
/* 1856 */         boolean wantsReceipt = false;
/* 1857 */         FunXMPP.ProtocolTreeNode[] messageChildren = messageNode.children == null ? new FunXMPP.ProtocolTreeNode[0] : messageNode.children;
/*      */ 
/* 1860 */         for (int i = 0; i < messageChildren.length; i++) {
/* 1861 */           FunXMPP.ProtocolTreeNode childNode = messageChildren[i];
/* 1862 */           if (FunXMPP.ProtocolTreeNode.tagEquals(childNode, "composing"))
/*      */           {
/* 1866 */             if (this.event_handler != null)
/* 1867 */               this.event_handler.onIsTyping(from, true);
/*      */           }
/* 1869 */           else if (FunXMPP.ProtocolTreeNode.tagEquals(childNode, "paused"))
/*      */           {
/* 1873 */             if (this.event_handler != null)
/* 1874 */               this.event_handler.onIsTyping(from, false);
/*      */           }
/* 1876 */           else if ((FunXMPP.ProtocolTreeNode.tagEquals(childNode, "body")) && (id != null))
/*      */           {
/* 1880 */             String message = childNode.data;
/*      */ 
/* 1883 */             FunXMPP.FMessage.Key key = new FunXMPP.FMessage.Key(from, false, id);
/* 1884 */             FunXMPP.FMessage ret = (FunXMPP.FMessage)FunXMPP.message_store.get(key);
/* 1885 */             if (ret == null)
/*      */             {
/* 1887 */               builder.key(key).remote_resource(author).newIncomingInstance().data(message);
/*      */             }
/*      */             else
/*      */             {
/* 1894 */               builder = new FunXMPP.FMessage.Builder().setInstance(ret);
/* 1895 */               duplicate = true;
/*      */             }
/* 1897 */           } else if ((FunXMPP.ProtocolTreeNode.tagEquals(childNode, "media")) && (id != null))
/*      */           {
/* 1901 */             builder.media_wa_type(FunXMPP.FMessage.getMessage_WA_Type(childNode.getAttributeValue("type"))).media_url(childNode.getAttributeValue("url")).media_name(childNode.getAttributeValue("file"));
/*      */             try
/*      */             {
/* 1906 */               builder.media_size(Long.parseLong(childNode.getAttributeValue("size")));
/*      */             } catch (NumberFormatException x) {
/* 1908 */               String str = x.getMessage();
/* 1909 */               System.err.println(str == null ? "NumberFormatException" : str);
/*      */             }
/*      */             try {
/* 1912 */               String secondsText = childNode.getAttributeValue("seconds");
/* 1913 */               if (secondsText != null)
/* 1914 */                 builder.media_duration_seconds(Integer.parseInt(secondsText));
/*      */             }
/*      */             catch (NumberFormatException x) {
/* 1917 */               String str = x.getMessage();
/* 1918 */               System.err.println(str == null ? "NumberFormatException" : str);
/*      */             }
/*      */ 
/* 1921 */             if (builder.media_wa_type().byteValue() == 5)
/*      */             {
/* 1923 */               String latitudeString = childNode.getAttributeValue("latitude");
/* 1924 */               String longitudeString = childNode.getAttributeValue("longitude");
/* 1925 */               if ((latitudeString == null) || (longitudeString == null))
/* 1926 */                 throw new FunXMPP.CorruptStreamException("location message missing lat or long attribute");
/*      */               try
/*      */               {
/* 1929 */                 Double latitude = Double.valueOf(latitudeString);
/* 1930 */                 Double longitude = Double.valueOf(longitudeString);
/* 1931 */                 builder.latitude(latitude).longitude(longitude);
/*      */               } catch (NumberFormatException x) {
/* 1933 */                 throw new FunXMPP.CorruptStreamException("location message exception parsing lat or long attribute: " + latitudeString + " " + longitudeString);
/*      */               }
/*      */ 
/*      */             }
/*      */ 
/* 1939 */             if (builder.media_wa_type().byteValue() == 4)
/*      */             {
/* 1941 */               FunXMPP.ProtocolTreeNode contactChildNode = childNode.getChild(0);
/* 1942 */               if (contactChildNode != null)
/*      */               {
/* 1944 */                 builder.media_name(contactChildNode.getAttributeValue("name")).data(contactChildNode.data);
/*      */               }
/*      */ 
/*      */             }
/*      */             else
/*      */             {
/* 1950 */               builder.data(childNode.data);
/*      */             }
/*      */ 
/* 1954 */             FunXMPP.FMessage.Key key = new FunXMPP.FMessage.Key(from, false, id);
/* 1955 */             FunXMPP.FMessage ret = (FunXMPP.FMessage)FunXMPP.message_store.get(key);
/* 1956 */             if (ret == null)
/*      */             {
/* 1958 */               builder.key(key).remote_resource(author).newIncomingInstance();
/*      */             }
/*      */             else
/*      */             {
/* 1964 */               builder = new FunXMPP.FMessage.Builder().setInstance(ret);
/* 1965 */               duplicate = true;
/*      */             }
/* 1967 */           } else if (!FunXMPP.ProtocolTreeNode.tagEquals(childNode, "active")) {
/* 1968 */             if (FunXMPP.ProtocolTreeNode.tagEquals(childNode, "request"))
/*      */             {
/* 1971 */               builder.wants_receipt(true);
/* 1972 */             } else if (FunXMPP.ProtocolTreeNode.tagEquals(childNode, "notify")) {
/* 1973 */               builder.notify_name(childNode.getAttributeValue("name"));
/* 1974 */             } else if (FunXMPP.ProtocolTreeNode.tagEquals(childNode, "x")) {
/* 1975 */               String xmlns = childNode.getAttributeValue("xmlns");
/* 1976 */               if (("jabber:x:event".equals(xmlns)) && (id != null)) {
/* 1977 */                 FunXMPP.FMessage.Key key = new FunXMPP.FMessage.Key(from, true, id);
/* 1978 */                 FunXMPP.FMessage message = (FunXMPP.FMessage)FunXMPP.message_store.get(key);
/* 1979 */                 if (message != null) {
/* 1980 */                   message.status = 4;
/* 1981 */                   if (this.event_handler != null)
/* 1982 */                     this.event_handler.onMessageStatusUpdate(message);
/*      */                 }
/*      */               }
/* 1985 */               else if ("jabber:x:delay".equals(xmlns)) {
/* 1986 */                 String stamp_str = childNode.getAttributeValue("stamp");
/* 1987 */                 if (stamp_str != null) {
/* 1988 */                   Date stamp = this.date_parser.parse(stamp_str);
/* 1989 */                   if (stamp != null)
/* 1990 */                     builder.timestamp(stamp.getTime()).offline(Boolean.TRUE);
/*      */                 }
/*      */               }
/*      */             } else {
/* 1994 */               if ((FunXMPP.ProtocolTreeNode.tagEquals(childNode, "delay")) || 
/* 1995 */                 (!FunXMPP.ProtocolTreeNode.tagEquals(childNode, "received")) || 
/* 1996 */                 (id == null)) continue;
/* 1997 */               FunXMPP.FMessage.Key key = new FunXMPP.FMessage.Key(from, true, id);
/* 1998 */               FunXMPP.FMessage message = (FunXMPP.FMessage)FunXMPP.message_store.get(key);
/* 1999 */               if (message != null) {
/* 2000 */                 message.status = 5;
/* 2001 */                 if (this.event_handler != null) {
/* 2002 */                   this.event_handler.onMessageStatusUpdate(message);
/*      */                 }
/*      */               }
/* 2005 */               if (this.supports_receipt_acks) {
/* 2006 */                 String receipt_type = childNode.getAttributeValue("type");
/* 2007 */                 if ((receipt_type == null) || (receipt_type.equals("delivered")))
/* 2008 */                   sendDeliveredReceiptAck(from, id);
/* 2009 */                 else if (receipt_type.equals("visible")) {
/* 2010 */                   sendVisibleReceiptAck(from, id);
/*      */                 }
/*      */               }
/*      */             }
/*      */           }
/*      */ 
/*      */         }
/*      */ 
/* 2018 */         if (builder.timestamp() == null) {
/* 2019 */           builder.timestamp(System.currentTimeMillis()).offline(Boolean.FALSE);
/*      */         }
/*      */ 
/* 2022 */         FunXMPP.FMessage message = builder.build();
/*      */ 
/* 2025 */         if ((message != null) && (this.event_handler != null))
/* 2026 */           this.event_handler.onMessageForMe(message, duplicate);
/*      */       }
/*      */     }
/*      */ 
/*      */     private Hashtable parseCategories(FunXMPP.ProtocolTreeNode dirtyNode) throws FunXMPP.CorruptStreamException, IOException
/*      */     {
/* 2032 */       Hashtable categories = new Hashtable();
/* 2033 */       if (dirtyNode.children != null) {
/* 2034 */         for (int i = 0; i < dirtyNode.children.length; i++) {
/* 2035 */           FunXMPP.ProtocolTreeNode childNode = dirtyNode.children[i];
/* 2036 */           if (FunXMPP.ProtocolTreeNode.tagEquals(childNode, "category")) {
/* 2037 */             String categoryName = childNode.getAttributeValue("name");
/* 2038 */             String timestamp = childNode.getAttributeValue("timestamp");
/* 2039 */             categories.put(categoryName, timestamp);
/*      */           }
/*      */         }
/*      */       }
/* 2043 */       return categories;
/*      */     }
/*      */ 
/*      */     private void readGroupList(FunXMPP.ProtocolTreeNode node, Vector vector) throws IOException
/*      */     {
/* 2048 */       Vector nodes = node.getAllChildren("group");
/* 2049 */       for (int i = 0; i < nodes.size(); i++) {
/* 2050 */         FunXMPP.ProtocolTreeNode groupNode = (FunXMPP.ProtocolTreeNode)nodes.elementAt(i);
/* 2051 */         String gid = groupNode.getAttributeValue("id");
/* 2052 */         String gjid = gidToGjid(gid);
/* 2053 */         String owner = Utilities.safeIntern(groupNode.getAttributeValue("owner"));
/* 2054 */         String subject = groupNode.getAttributeValue("subject");
/* 2055 */         String subject_t = groupNode.getAttributeValue("s_t");
/* 2056 */         String subject_owner = Utilities.safeIntern(groupNode.getAttributeValue("s_o"));
/* 2057 */         String creation = groupNode.getAttributeValue("creation");
/* 2058 */         this.group_event_handler.onGroupInfoFromList(gjid, owner, subject, subject_owner, Integer.parseInt(subject_t), Integer.parseInt(creation));
/* 2059 */         vector.addElement(gjid);
/*      */       }
/*      */     }
/*      */ 
/*      */     private void readAttributeList(FunXMPP.ProtocolTreeNode node, Vector vector, String tag, String attribute) throws IOException
/*      */     {
/* 2065 */       Vector nodes = node.getAllChildren(tag);
/* 2066 */       for (int i = 0; i < nodes.size(); i++) {
/* 2067 */         FunXMPP.ProtocolTreeNode tagNode = (FunXMPP.ProtocolTreeNode)nodes.elementAt(i);
/* 2068 */         String value = Utilities.safeIntern(tagNode.getAttributeValue(attribute));
/* 2069 */         vector.addElement(value);
/*      */       }
/*      */     }
/*      */ 
/*      */     private void readSuccessAndFailure(FunXMPP.ProtocolTreeNode node, Vector successVector, Hashtable failTable, String itemTag) throws IOException
/*      */     {
/* 2075 */       Vector nodes = node.getAllChildren(itemTag);
/* 2076 */       for (int i = 0; i < nodes.size(); i++) {
/* 2077 */         FunXMPP.ProtocolTreeNode tagNode = (FunXMPP.ProtocolTreeNode)nodes.elementAt(i);
/* 2078 */         String addtype = tagNode.getAttributeValue("type");
/* 2079 */         String participant = tagNode.getAttributeValue("participant");
/* 2080 */         String codeString = tagNode.getAttributeValue("code");
/* 2081 */         if ("success".equals(addtype)) {
/* 2082 */           successVector.addElement(participant); } else {
/*      */           Integer code;
/*      */           try {
/* 2086 */             code = Integer.valueOf(codeString);
/*      */           } catch (Exception e) {
/* 2088 */             code = new Integer(499);
/*      */           }
/* 2090 */           failTable.put(participant, code);
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   public static class FMessage
/*      */   {
/*      */     public static final byte WA_TYPE_UNDEFINED = 0;
/*      */     public static final byte WA_TYPE_IMAGE = 1;
/*      */     public static final byte WA_TYPE_AUDIO = 2;
/*      */     public static final byte WA_TYPE_VIDEO = 3;
/*      */     public static final byte WA_TYPE_CONTACT = 4;
/*      */     public static final byte WA_TYPE_LOCATION = 5;
/*      */     public static final byte WA_TYPE_SYSTEM = 7;
/*      */     public static final int STATUS_UNSENT = 0;
/*      */     public static final int STATUS_UPLOADING = 1;
/*      */     public static final int STATUS_UPLOADED = 2;
/*      */     public static final int STATUS_SENT_BY_CLIENT = 3;
/*      */     public static final int STATUS_RECEIVED_BY_SERVER = 4;
/*      */     public static final int STATUS_RECEIVED_BY_TARGET = 5;
/*      */     public static final int STATUS_NEVER_SEND = 6;
/*      */     public static final int STATUS_SERVER_BOUNCE = 7;
/*      */     public int status;
/*      */     public Key key;
/*      */     public String remote_resource;
/*  499 */     public final boolean needs_push = false;
/*  500 */     public boolean wants_receipt = false;
/*      */     public String data;
/*      */     public long timestamp;
/*      */     public String media_url;
/*      */     public String media_mime_type;
/*      */     public byte media_wa_type;
/*      */     public long media_size;
/*      */     public int media_duration_seconds;
/*      */     public String media_name;
/*      */     public double latitude;
/*      */     public double longitude;
/*      */     public String notify_name;
/*      */     public Object thumb_image;
/*  524 */     public boolean gap_behind = true;
/*      */     public boolean offline;
/*  527 */     static String generating_header = System.currentTimeMillis() / 1000L + "-";
/*  528 */     static int generating_id = 0;
/*  529 */     static Object generating_lock = new Object();
/*      */ 
/*      */     private FMessage(String remote_jid, boolean from_me)
/*      */     {
/*  533 */       synchronized (generating_lock) { Key localKey;
/*      */         do { generating_id += 1;
/*  536 */           localKey = new Key(remote_jid, from_me, generating_header + Integer.toString(generating_id)); }
/*  537 */         while (FunXMPP.message_store.get(localKey) != null);
/*  538 */         FunXMPP.message_store.put(localKey, this);
/*  539 */         this.key = localKey;
/*      */       }
/*      */     }
/*      */ 
/*      */     public FMessage(Key key)
/*      */     {
/*  545 */       this.key = key;
/*  546 */       synchronized (generating_lock) {
/*  547 */         FunXMPP.message_store.put(key, this);
/*      */       }
/*      */     }
/*      */ 
/*      */     public FMessage(String remote_jid, String data, Object image)
/*      */     {
/*  553 */       this(remote_jid, true);
/*  554 */       this.data = data;
/*  555 */       this.thumb_image = image;
/*  556 */       this.timestamp = System.currentTimeMillis();
/*      */     }
/*      */ 
/*      */     public void acceptVisitor(FunXMPP.FMessageVisitor visitor) {
/*  560 */       switch (this.media_wa_type) { case 0:
/*      */       case 6:
/*      */       default:
/*  563 */         visitor.undefined(this);
/*  564 */         break;
/*      */       case 1:
/*  566 */         visitor.image(this);
/*  567 */         break;
/*      */       case 2:
/*  569 */         visitor.audio(this);
/*  570 */         break;
/*      */       case 3:
/*  572 */         visitor.video(this);
/*  573 */         break;
/*      */       case 4:
/*  575 */         visitor.contact(this);
/*  576 */         break;
/*      */       case 5:
/*  578 */         visitor.location(this);
/*  579 */         break;
/*      */       case 7:
/*  581 */         visitor.system(this);
/*      */       }
/*      */     }
/*      */ 
/*      */     public static byte getMessage_WA_Type(String type)
/*      */     {
/*  587 */       if ((type == null) || (type.length() == 0))
/*  588 */         return 0;
/*  589 */       if (type.equalsIgnoreCase("system"))
/*  590 */         return 7;
/*  591 */       if (type.equalsIgnoreCase("image"))
/*  592 */         return 1;
/*  593 */       if (type.equalsIgnoreCase("audio"))
/*  594 */         return 2;
/*  595 */       if (type.equalsIgnoreCase("video"))
/*  596 */         return 3;
/*  597 */       if (type.equalsIgnoreCase("vcard"))
/*  598 */         return 4;
/*  599 */       if (type.equalsIgnoreCase("location")) {
/*  600 */         return 5;
/*      */       }
/*  602 */       return 0;
/*      */     }
/*      */ 
/*      */     public static String getMessage_WA_Type_StrValue(byte type) {
/*  606 */       if (type == 0)
/*  607 */         return null;
/*  608 */       if (type == 7)
/*  609 */         return "system";
/*  610 */       if (type == 1)
/*  611 */         return "image";
/*  612 */       if (type == 2)
/*  613 */         return "audio";
/*  614 */       if (type == 3)
/*  615 */         return "video";
/*  616 */       if (type == 4)
/*  617 */         return "vcard";
/*  618 */       if (type == 5) {
/*  619 */         return "location";
/*      */       }
/*  621 */       return null;
/*      */     }
/*      */ 
/*      */     public static class Key
/*      */     {
/*      */       public final String remote_jid;
/*      */       public final boolean from_me;
/*      */       public final String id;
/*      */ 
/*      */       public Key(String remote_jid, boolean from_me, String id)
/*      */       {
/*  451 */         this.remote_jid = remote_jid;
/*  452 */         this.from_me = from_me;
/*  453 */         this.id = id;
/*      */       }
/*      */ 
/*      */       public int hashCode() {
/*  457 */         int prime = 31;
/*  458 */         int result = 1;
/*  459 */         result = 31 * result + (this.from_me ? 1231 : 1237);
/*  460 */         result = 31 * result + (this.id == null ? 0 : this.id.hashCode());
/*  461 */         result = 31 * result + (this.remote_jid == null ? 0 : this.remote_jid.hashCode());
/*      */ 
/*  463 */         return result;
/*      */       }
/*      */ 
/*      */       public boolean equals(Object obj) {
/*  467 */         if (this == obj)
/*  468 */           return true;
/*  469 */         if (obj == null)
/*  470 */           return false;
/*  471 */         if (getClass() != obj.getClass())
/*  472 */           return false;
/*  473 */         Key other = (Key)obj;
/*  474 */         if (this.from_me != other.from_me)
/*  475 */           return false;
/*  476 */         if (this.id == null) {
/*  477 */           if (other.id != null)
/*  478 */             return false;
/*  479 */         } else if (!this.id.equals(other.id))
/*  480 */           return false;
/*  481 */         if (this.remote_jid == null) {
/*  482 */           if (other.remote_jid != null)
/*  483 */             return false;
/*  484 */         } else if (!this.remote_jid.equals(other.remote_jid))
/*  485 */           return false;
/*  486 */         return true;
/*      */       }
/*      */ 
/*      */       static boolean exists(Key key) {
/*  490 */         return FunXMPP.message_store.get(key) != null;
/*      */       }
/*      */ 
/*      */       public String toString() {
/*  494 */         return "Key[id=" + this.id + ", from_me=" + this.from_me + ", remote_jid=" + this.remote_jid + "]";
/*      */       }
/*      */     }
/*      */ 
/*      */     public static class Builder
/*      */     {
/*      */       private FunXMPP.FMessage message;
/*      */       private String remote_jid;
/*      */       private String remote_resource;
/*      */       private Boolean from_me;
/*      */       private String id;
/*      */       private Boolean wants_receipt;
/*      */       private String data;
/*      */       private String thumb_image;
/*      */       private Long timestamp;
/*      */       private Boolean offline;
/*      */       private Byte media_wa_type;
/*      */       private Long media_size;
/*      */       private Integer media_duration_seconds;
/*      */       private String media_url;
/*      */       private String media_name;
/*      */       private Double latitude;
/*      */       private Double longitude;
/*      */       private String notify_name;
/*      */ 
/*      */       public Builder key(FunXMPP.FMessage.Key key)
/*      */       {
/*  283 */         this.remote_jid = key.remote_jid;
/*  284 */         this.from_me = (key.from_me ? Boolean.TRUE : Boolean.FALSE);
/*  285 */         this.id = key.id;
/*  286 */         return this;
/*      */       }
/*  288 */       public FunXMPP.FMessage.Key key() { return new FunXMPP.FMessage.Key(this.remote_jid, this.from_me.booleanValue(), this.id); } 
/*      */       public Builder remote_jid(String remote_jid) {
/*  290 */         this.remote_jid = remote_jid;
/*  291 */         return this;
/*      */       }
/*  293 */       public String remote_jid() { return this.remote_jid; } 
/*      */       public Builder remote_resource(String remote_resource) {
/*  295 */         this.remote_resource = remote_resource;
/*  296 */         return this;
/*      */       }
/*  298 */       public String remote_resource() { return this.remote_resource; } 
/*      */       public Builder from_me(boolean from_me) {
/*  300 */         this.from_me = (from_me ? Boolean.TRUE : Boolean.FALSE);
/*  301 */         return this;
/*      */       }
/*  303 */       public Boolean from_me() { return this.from_me; } 
/*      */       public Builder id(String id) {
/*  305 */         this.id = id;
/*  306 */         return this;
/*      */       }
/*  308 */       public String id() { return this.id; }
/*      */ 
/*      */       public Builder wants_receipt(boolean wants_receipt) {
/*  311 */         this.wants_receipt = (wants_receipt ? Boolean.TRUE : Boolean.FALSE);
/*  312 */         return this;
/*      */       }
/*  314 */       public Boolean wants_receipt() { return this.wants_receipt; } 
/*      */       public Builder data(String data) {
/*  316 */         this.data = data;
/*  317 */         return this;
/*      */       }
/*  319 */       public String data() { return this.data; } 
/*      */       public Builder thumb_image(String thumb_image) {
/*  321 */         this.thumb_image = thumb_image;
/*  322 */         return this;
/*      */       }
/*  324 */       public String thumb_image() { return this.thumb_image; } 
/*      */       public Builder offline(Boolean offline) {
/*  326 */         this.offline = offline;
/*  327 */         return this;
/*      */       }
/*  329 */       public Boolean offline() { return this.offline; } 
/*      */       public Builder timestamp(long timestamp) {
/*  331 */         this.timestamp = new Long(timestamp);
/*  332 */         return this;
/*      */       }
/*  334 */       public Long timestamp() { return this.timestamp; } 
/*      */       public Builder media_wa_type(byte media_wa_type) {
/*  336 */         this.media_wa_type = new Byte(media_wa_type);
/*  337 */         return this;
/*      */       }
/*  339 */       public Byte media_wa_type() { return this.media_wa_type; } 
/*      */       public Builder media_size(long media_size) {
/*  341 */         this.media_size = new Long(media_size);
/*  342 */         return this;
/*      */       }
/*  344 */       public Long media_size() { return this.media_size; } 
/*      */       public Builder media_duration_seconds(int media_duration_seconds) {
/*  346 */         this.media_duration_seconds = new Integer(media_duration_seconds);
/*  347 */         return this;
/*      */       }
/*  349 */       public Integer media_duration_seconds() { return this.media_duration_seconds; } 
/*      */       public Builder media_url(String media_url) {
/*  351 */         this.media_url = media_url;
/*  352 */         return this;
/*      */       }
/*  354 */       public String media_url() { return this.media_url; } 
/*      */       public Builder media_name(String media_name) {
/*  356 */         this.media_name = media_name;
/*  357 */         return this;
/*      */       }
/*  359 */       public String media_name() { return this.media_name; } 
/*      */       public Builder latitude(Double latitude) {
/*  361 */         this.latitude = latitude;
/*  362 */         return this;
/*      */       }
/*  364 */       public Double latitude() { return this.latitude; } 
/*      */       public Builder longitude(Double longitude) {
/*  366 */         this.longitude = longitude;
/*  367 */         return this;
/*      */       }
/*  369 */       public Double longitude() { return this.longitude; } 
/*      */       public Builder notify_name(String notify_name) {
/*  371 */         this.notify_name = notify_name;
/*  372 */         return this;
/*      */       }
/*  374 */       public String notify_name() { return this.notify_name; }
/*      */ 
/*      */       public Builder setInstance(FunXMPP.FMessage message)
/*      */       {
/*  378 */         this.message = message;
/*  379 */         return this;
/*      */       }
/*      */ 
/*      */       public Builder newIncomingInstance() throws UnsupportedOperationException {
/*  383 */         if ((this.remote_jid == null) || (this.from_me == null) || (this.id == null)) {
/*  384 */           throw new UnsupportedOperationException("missing required property before instantiating new incoming message");
/*      */         }
/*  386 */         this.message = new FunXMPP.FMessage(new FunXMPP.FMessage.Key(this.remote_jid, this.from_me.booleanValue(), this.id));
/*  387 */         return this;
/*      */       }
/*      */       public Builder newOutgoingInstance() {
/*  390 */         if ((this.remote_jid == null) || (this.data == null) || (this.thumb_image == null)) {
/*  391 */           throw new UnsupportedOperationException("missing required property before instantiating new outgoing message");
/*      */         }
/*  393 */         if ((this.id != null) || ((this.from_me != null) && (!this.from_me.booleanValue()))) {
/*  394 */           throw new UnsupportedOperationException("invalid property set before instantiating new outgoing message");
/*      */         }
/*  396 */         this.message = new FunXMPP.FMessage(this.remote_jid, this.data, this.thumb_image);
/*      */ 
/*  398 */         return this;
/*      */       }
/*      */       public boolean instantiated() {
/*  401 */         return this.message != null;
/*      */       }
/*      */ 
/*      */       public FunXMPP.FMessage build() {
/*  405 */         if (this.message == null) {
/*  406 */           return null;
/*      */         }
/*      */ 
/*  409 */         if ((this.remote_jid != null) && (this.from_me != null) && (this.id != null)) {
/*  410 */           this.message.key = new FunXMPP.FMessage.Key(this.remote_jid, this.from_me.booleanValue(), this.id);
/*      */         }
/*  412 */         if (this.remote_resource != null)
/*  413 */           this.message.remote_resource = this.remote_resource;
/*  414 */         if (this.wants_receipt != null)
/*  415 */           this.message.wants_receipt = this.wants_receipt.booleanValue();
/*  416 */         if (this.data != null)
/*  417 */           this.message.data = this.data;
/*  418 */         if (this.thumb_image != null)
/*  419 */           this.message.thumb_image = this.thumb_image;
/*  420 */         if (this.timestamp != null)
/*  421 */           this.message.timestamp = this.timestamp.longValue();
/*  422 */         if (this.offline != null)
/*  423 */           this.message.offline = this.offline.booleanValue();
/*  424 */         if (this.media_wa_type != null)
/*  425 */           this.message.media_wa_type = this.media_wa_type.byteValue();
/*  426 */         if (this.media_size != null)
/*  427 */           this.message.media_size = this.media_size.longValue();
/*  428 */         if (this.media_duration_seconds != null)
/*  429 */           this.message.media_duration_seconds = this.media_duration_seconds.intValue();
/*  430 */         if (this.media_url != null)
/*  431 */           this.message.media_url = this.media_url;
/*  432 */         if (this.media_name != null)
/*  433 */           this.message.media_name = this.media_name;
/*  434 */         if (this.latitude != null)
/*  435 */           this.message.latitude = this.latitude.doubleValue();
/*  436 */         if (this.longitude != null)
/*  437 */           this.message.longitude = this.longitude.doubleValue();
/*  438 */         if (this.notify_name != null) {
/*  439 */           this.message.notify_name = this.notify_name;
/*      */         }
/*  441 */         return this.message;
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   public static class FunRuntimeException extends RuntimeException
/*      */   {
/*      */     String bufString;
/*      */     Throwable t;
/*      */ 
/*      */     public FunRuntimeException(Throwable t, String buf)
/*      */     {
/*  218 */       this.bufString = buf;
/*  219 */       this.t = t;
/*      */     }
/*      */ 
/*      */     public String getMessage() {
/*  223 */       return "Wrapping: " + this.t.getClass().getName() + "\nFunRuntimeException last stanza: " + this.bufString;
/*      */     }
/*      */ 
/*      */     public Throwable getInner() {
/*  227 */       return this.t;
/*      */     }
/*      */   }
/*      */ 
/*      */   public static class CorruptStreamException extends Exception
/*      */   {
/*      */     public CorruptStreamException()
/*      */     {
/*      */     }
/*      */ 
/*      */     public CorruptStreamException(String s)
/*      */     {
/*  210 */       super();
/*      */     }
/*      */   }
/*      */ 
/*      */   public static class LoginFailureException extends Exception
/*      */   {
/*      */     public static final int TYPE_PASSWORD = 0;
/*      */     public static final int TYPE_EXPIRED = 1;
/*      */     public int type;
/*      */     public long expire_date;
/*      */ 
/*      */     public LoginFailureException(int type)
/*      */     {
/*  200 */       this.type = type;
/*      */     }
/*      */   }
/*      */ 
/*      */   public static abstract interface FMessageVisitor
/*      */   {
/*      */     public abstract void undefined(FunXMPP.FMessage paramFMessage);
/*      */ 
/*      */     public abstract void image(FunXMPP.FMessage paramFMessage);
/*      */ 
/*      */     public abstract void audio(FunXMPP.FMessage paramFMessage);
/*      */ 
/*      */     public abstract void video(FunXMPP.FMessage paramFMessage);
/*      */ 
/*      */     public abstract void contact(FunXMPP.FMessage paramFMessage);
/*      */ 
/*      */     public abstract void location(FunXMPP.FMessage paramFMessage);
/*      */ 
/*      */     public abstract void system(FunXMPP.FMessage paramFMessage);
/*      */   }
/*      */ 
/*      */   public static abstract class IqResultHandler
/*      */   {
/*      */     public abstract void parse(FunXMPP.ProtocolTreeNode paramProtocolTreeNode, String paramString)
/*      */       throws IOException, FunXMPP.CorruptStreamException;
/*      */ 
/*      */     public void error(int code)
/*      */     {
/*      */     }
/*      */ 
/*      */     public void error(FunXMPP.ProtocolTreeNode node)
/*      */       throws IOException, FunXMPP.CorruptStreamException
/*      */     {
/*  164 */       Vector nodes = node.getAllChildren("error");
/*  165 */       for (int i = 0; i < nodes.size(); i++) {
/*  166 */         FunXMPP.ProtocolTreeNode errorNode = (FunXMPP.ProtocolTreeNode)nodes.elementAt(i);
/*  167 */         if (errorNode != null) {
/*  168 */           String errorCodeString = errorNode.getAttributeValue("code");
/*  169 */           if (errorCodeString != null) {
/*  170 */             int errorCode = Integer.parseInt(errorCodeString);
/*  171 */             error(errorCode);
/*      */           }
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   public static abstract interface StringRunnable
/*      */   {
/*      */     public abstract void run(String paramString);
/*      */   }
/*      */ 
/*      */   public static abstract interface IntRunnable
/*      */   {
/*      */     public abstract void run(int paramInt);
/*      */   }
/*      */ 
/*      */   public static abstract interface GroupListener
/*      */   {
/*      */     public abstract void onGroupAddUser(String paramString1, String paramString2);
/*      */ 
/*      */     public abstract void onGroupRemoveUser(String paramString1, String paramString2);
/*      */ 
/*      */     public abstract void onGroupNewSubject(String paramString1, String paramString2, String paramString3, int paramInt);
/*      */ 
/*      */     public abstract void onServerProperties(Hashtable paramHashtable);
/*      */ 
/*      */     public abstract void onGroupCreated(String paramString1, String paramString2);
/*      */ 
/*      */     public abstract void onGroupInfo(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt1, int paramInt2);
/*      */ 
/*      */     public abstract void onGroupInfoFromList(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt1, int paramInt2);
/*      */ 
/*      */     public abstract void onOwningGroups(Vector paramVector);
/*      */ 
/*      */     public abstract void onSetSubject(String paramString);
/*      */ 
/*      */     public abstract void onAddGroupParticipants(String paramString, Vector paramVector, Hashtable paramHashtable);
/*      */ 
/*      */     public abstract void onRemoveGroupParticipants(String paramString, Vector paramVector, Hashtable paramHashtable);
/*      */ 
/*      */     public abstract void onGetParticipants(String paramString, Vector paramVector);
/*      */ 
/*      */     public abstract void onParticipatingGroups(Vector paramVector);
/*      */ 
/*      */     public abstract void onLeaveGroup(String paramString);
/*      */   }
/*      */ 
/*      */   public static abstract interface Listener
/*      */   {
/*      */     public abstract void onMessageForMe(FunXMPP.FMessage paramFMessage, boolean paramBoolean)
/*      */       throws IOException;
/*      */ 
/*      */     public abstract void onMessageStatusUpdate(FunXMPP.FMessage paramFMessage);
/*      */ 
/*      */     public abstract void onMessageError(FunXMPP.FMessage paramFMessage, int paramInt);
/*      */ 
/*      */     public abstract void onPing(String paramString)
/*      */       throws IOException;
/*      */ 
/*      */     public abstract void onPingResponseReceived();
/*      */ 
/*      */     public abstract void onAvailable(String paramString, boolean paramBoolean);
/*      */ 
/*      */     public abstract void onClientConfigReceived(String paramString);
/*      */ 
/*      */     public abstract void onLastSeen(String paramString1, int paramInt, String paramString2);
/*      */ 
/*      */     public abstract void onIsTyping(String paramString, boolean paramBoolean);
/*      */ 
/*      */     public abstract void onAccountChange(int paramInt, long paramLong);
/*      */ 
/*      */     public abstract void onPrivacyBlockListAdd(String paramString);
/*      */ 
/*      */     public abstract void onPrivacyBlockListClear();
/*      */ 
/*      */     public abstract void onDirty(Hashtable paramHashtable);
/*      */ 
/*      */     public abstract void onDirtyResponse(Hashtable paramHashtable);
/*      */ 
/*      */     public abstract void onRelayRequest(String paramString1, int paramInt, String paramString2);
/*      */   }
/*      */ 
/*      */   public static abstract interface DateParser
/*      */   {
/*      */     public abstract Date parse(String paramString);
/*      */   }
/*      */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.FunXMPP
 * JD-Core Version:    0.6.0
 */
