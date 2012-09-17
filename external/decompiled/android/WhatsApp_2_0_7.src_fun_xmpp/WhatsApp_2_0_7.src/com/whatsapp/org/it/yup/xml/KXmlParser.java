/*      */ package com.whatsapp.org.it.yup.xml;
/*      */ 
/*      */ import com.whatsapp.org.xmlpull.v1.XmlPullParser;
/*      */ import com.whatsapp.org.xmlpull.v1.XmlPullParserException;
/*      */ import java.io.IOException;
/*      */ import java.io.InputStream;
/*      */ import java.io.Reader;
/*      */ import java.util.Hashtable;
/*      */ 
/*      */ public class KXmlParser
/*      */   implements XmlPullParser
/*      */ {
/*      */   private Object location;
/*   45 */   private static String UNEXPECTED_EOF = "Unexpected EOF";
/*   46 */   private static String ILLEGAL_TYPE = "Wrong event type";
/*      */   private static final int LEGACY = 999;
/*      */   private static final int XML_DECL = 998;
/*      */   private String version;
/*      */   private Boolean standalone;
/*      */   private boolean processNsp;
/*      */   private boolean relaxed;
/*      */   private Hashtable entityMap;
/*      */   private int depth;
/*   59 */   private String[] elementStack = new String[16];
/*   60 */   private String[] nspStack = new String[8];
/*   61 */   private int[] nspCounts = new int[4];
/*      */ 
/*   65 */   private Reader reader = null;
/*      */   private String encoding;
/*      */   private int line;
/*      */   private int column;
/*   73 */   private char[] txtBuf = new char['Y'];
/*      */   private int txtPos;
/*      */   private int type;
/*      */   private boolean isWhitespace;
/*      */   private String namespace;
/*      */   private String prefix;
/*      */   private String name;
/*      */   private boolean degenerated;
/*      */   private int attributeCount;
/*   87 */   private String[] attributes = new String[16];
/*   88 */   private int stackMismatch = 0;
/*      */   private String error;
/*   96 */   private int[] peek = new int[2];
/*      */   private int peekCount;
/*      */   private boolean wasCR;
/*      */   private boolean unresolved;
/*      */   private boolean token;
/*      */ 
/*      */   private final boolean isProp(String n1, boolean prop, String n2)
/*      */   {
/*  110 */     if (!n1.startsWith("http://xmlpull.org/v1/doc/"))
/*  111 */       return false;
/*  112 */     if (prop) {
/*  113 */       return n1.substring(42).equals(n2);
/*      */     }
/*  115 */     return n1.substring(40).equals(n2);
/*      */   }
/*      */ 
/*      */   private final boolean adjustNsp()
/*      */     throws XmlPullParserException
/*      */   {
/*  121 */     boolean any = false;
/*      */ 
/*  123 */     for (int i = 0; i < this.attributeCount << 2; i += 4)
/*      */     {
/*  127 */       String attrName = this.attributes[(i + 2)];
/*  128 */       int cut = attrName.indexOf(':');
/*      */       String prefix;
/*  131 */       if (cut != -1)
/*      */       {
/*  133 */         prefix = attrName.substring(0, cut);
/*  134 */         attrName = attrName.substring(cut + 1);
/*      */       } else {
/*  136 */         if (!attrName.equals("xmlns"))
/*      */           continue;
/*  138 */         prefix = attrName;
/*  139 */         attrName = null;
/*      */       }
/*      */ 
/*  144 */       if (!prefix.equals("xmlns"))
/*      */       {
/*  146 */         any = true;
/*      */       }
/*      */       else
/*      */       {
/*      */         int tmp95_92 = this.depth;
/*      */         int[] tmp95_88 = this.nspCounts;
/*      */         int tmp97_96 = tmp95_88[tmp95_92]; tmp95_88[tmp95_92] = (tmp97_96 + 1); int j = tmp97_96 << 1;
/*      */ 
/*  152 */         this.nspStack = ensureCapacity(this.nspStack, j + 2);
/*  153 */         this.nspStack[j] = attrName;
/*  154 */         this.nspStack[(j + 1)] = this.attributes[(i + 3)];
/*      */ 
/*  156 */         if ((attrName != null) && (this.attributes[(i + 3)].equals(""))) {
/*  157 */           error("illegal empty namespace");
/*      */         }
/*      */ 
/*  162 */         System.arraycopy(this.attributes, i + 4, this.attributes, i, (--this.attributeCount << 2) - i);
/*      */ 
/*  165 */         i -= 4;
/*      */       }
/*      */     }
/*      */ 
/*  169 */     if (any)
/*      */     {
/*  171 */       for (int i = (this.attributeCount << 2) - 4; i >= 0; i -= 4)
/*      */       {
/*  174 */         String attrName = this.attributes[(i + 2)];
/*  175 */         int cut = attrName.indexOf(':');
/*      */ 
/*  177 */         if ((cut == 0) && (!this.relaxed)) {
/*  178 */           throw new RuntimeException("illegal attribute name: " + attrName + " at " + this);
/*      */         }
/*      */ 
/*  181 */         if (cut == -1)
/*      */           continue;
/*  183 */         String attrPrefix = attrName.substring(0, cut);
/*      */ 
/*  185 */         attrName = attrName.substring(cut + 1);
/*      */ 
/*  187 */         String attrNs = getNamespace(attrPrefix);
/*      */ 
/*  189 */         if ((attrNs == null) && (!this.relaxed)) {
/*  190 */           throw new RuntimeException("Undefined Prefix: " + attrPrefix + " in " + this);
/*      */         }
/*      */ 
/*  193 */         this.attributes[i] = attrNs;
/*  194 */         this.attributes[(i + 1)] = attrPrefix;
/*  195 */         this.attributes[(i + 2)] = attrName;
/*      */       }
/*      */ 
/*      */     }
/*      */ 
/*  207 */     int cut = this.name.indexOf(':');
/*      */ 
/*  209 */     if (cut == 0) {
/*  210 */       error("illegal tag name: " + this.name);
/*      */     }
/*  212 */     if (cut != -1)
/*      */     {
/*  214 */       this.prefix = this.name.substring(0, cut);
/*  215 */       this.name = this.name.substring(cut + 1);
/*      */     }
/*      */ 
/*  218 */     this.namespace = getNamespace(this.prefix);
/*      */ 
/*  220 */     if (this.namespace == null)
/*      */     {
/*  222 */       if (this.prefix != null)
/*  223 */         error("undefined prefix: " + this.prefix);
/*  224 */       this.namespace = "";
/*      */     }
/*      */ 
/*  227 */     return any;
/*      */   }
/*      */ 
/*      */   private final String[] ensureCapacity(String[] arr, int required)
/*      */   {
/*  232 */     if (arr.length >= required)
/*  233 */       return arr;
/*  234 */     String[] bigger = new String[required + 16];
/*  235 */     System.arraycopy(arr, 0, bigger, 0, arr.length);
/*  236 */     return bigger;
/*      */   }
/*      */ 
/*      */   private final void error(String desc) throws XmlPullParserException
/*      */   {
/*  241 */     if (this.relaxed)
/*      */     {
/*  243 */       if (this.error == null)
/*  244 */         this.error = ("ERR: " + desc);
/*      */     }
/*      */     else
/*  247 */       exception(desc);
/*      */   }
/*      */ 
/*      */   private final void exception(String desc) throws XmlPullParserException
/*      */   {
/*  252 */     throw new XmlPullParserException(desc.substring(0, 100) + "\n", this, null);
/*      */   }
/*      */ 
/*      */   private final void nextImpl()
/*      */     throws IOException, XmlPullParserException
/*      */   {
/*  265 */     if (this.reader == null) {
/*  266 */       exception("No Input specified");
/*      */     }
/*  268 */     if (this.type == 3) {
/*  269 */       this.depth -= 1;
/*      */     }
/*      */     do
/*      */     {
/*  273 */       this.attributeCount = -1;
/*      */ 
/*  278 */       if (this.degenerated)
/*      */       {
/*  280 */         this.degenerated = false;
/*  281 */         this.type = 3;
/*  282 */         return;
/*      */       }
/*      */ 
/*  285 */       if (this.error != null)
/*      */       {
/*  287 */         for (int i = 0; i < this.error.length(); i++) {
/*  288 */           push(this.error.charAt(i));
/*      */         }
/*  290 */         this.error = null;
/*  291 */         this.type = 9;
/*  292 */         return;
/*      */       }
/*      */ 
/*  295 */       if ((this.relaxed) && ((this.stackMismatch > 0) || ((peek(0) == -1) && (this.depth > 0))))
/*      */       {
/*  297 */         int sp = this.depth - 1 << 2;
/*  298 */         this.type = 3;
/*  299 */         this.namespace = this.elementStack[sp];
/*  300 */         this.prefix = this.elementStack[(sp + 1)];
/*  301 */         this.name = this.elementStack[(sp + 2)];
/*  302 */         if (this.stackMismatch != 1)
/*  303 */           this.error = ("missing end tag /" + this.name + " inserted");
/*  304 */         if (this.stackMismatch > 0)
/*  305 */           this.stackMismatch -= 1;
/*  306 */         return;
/*      */       }
/*      */ 
/*  309 */       this.prefix = null;
/*  310 */       this.name = null;
/*  311 */       this.namespace = null;
/*      */ 
/*  314 */       this.type = peekType();
/*      */ 
/*  316 */       switch (this.type)
/*      */       {
/*      */       case 6:
/*  320 */         pushEntity();
/*  321 */         return;
/*      */       case 2:
/*  324 */         parseStartTag(false);
/*  325 */         return;
/*      */       case 3:
/*  328 */         parseEndTag();
/*  329 */         return;
/*      */       case 1:
/*  332 */         return;
/*      */       case 4:
/*  335 */         pushText(60, !this.token);
/*  336 */         if (this.depth == 0)
/*      */         {
/*  338 */           if (this.isWhitespace) {
/*  339 */             this.type = 7;
/*      */           }
/*      */ 
/*      */         }
/*      */ 
/*  345 */         return;
/*      */       case 5:
/*      */       }
/*  348 */       this.type = parseLegacy(this.token);
/*  349 */     }while (this.type == 998);
/*      */   }
/*      */ 
/*      */   private final int parseLegacy(boolean push)
/*      */     throws IOException, XmlPullParserException
/*      */   {
/*  359 */     String req = "";
/*      */ 
/*  362 */     int prev = 0;
/*      */ 
/*  364 */     read();
/*  365 */     int c = read();
/*      */     int result;
/*  367 */     if (c == 63)
/*      */     {
/*  369 */       if (((peek(0) == 120) || (peek(0) == 88)) && ((peek(1) == 109) || (peek(1) == 77)))
/*      */       {
/*  373 */         if (push)
/*      */         {
/*  375 */           push(peek(0));
/*  376 */           push(peek(1));
/*      */         }
/*  378 */         read();
/*  379 */         read();
/*      */ 
/*  381 */         if (((peek(0) == 108) || (peek(0) == 76)) && (peek(1) <= 32))
/*      */         {
/*  384 */           if ((this.line != 1) || (this.column > 4)) {
/*  385 */             error("PI must not start with xml");
/*      */           }
/*  387 */           parseStartTag(true);
/*      */ 
/*  389 */           if ((this.attributeCount < 1) || (!"version".equals(this.attributes[2]))) {
/*  390 */             error("version expected");
/*      */           }
/*  392 */           this.version = this.attributes[3];
/*      */ 
/*  394 */           int pos = 1;
/*      */ 
/*  396 */           if ((pos < this.attributeCount) && ("encoding".equals(this.attributes[6])))
/*      */           {
/*  399 */             this.encoding = this.attributes[7];
/*  400 */             pos++;
/*      */           }
/*      */ 
/*  403 */           if ((pos < this.attributeCount) && ("standalone".equals(this.attributes[(4 * pos + 2)])))
/*      */           {
/*  406 */             String st = this.attributes[(3 + 4 * pos)];
/*  407 */             if ("yes".equals(st))
/*  408 */               this.standalone = new Boolean(true);
/*  409 */             else if ("no".equals(st))
/*  410 */               this.standalone = new Boolean(false);
/*      */             else
/*  412 */               error("illegal standalone value: " + st);
/*  413 */             pos++;
/*      */           }
/*      */ 
/*  416 */           if (pos != this.attributeCount) {
/*  417 */             error("illegal xmldecl");
/*      */           }
/*  419 */           this.isWhitespace = true;
/*  420 */           this.txtPos = 0;
/*      */ 
/*  422 */           return 998;
/*      */         }
/*      */ 
/*      */       }
/*      */ 
/*  430 */       int term = 63;
/*  431 */       result = 8;
/*      */     }
/*      */     else
/*      */     {
/*      */       int term;
/*  433 */       if (c == 33)
/*      */       {
/*      */         
/*  435 */         if (peek(0) == 45)
/*      */         {
/*  437 */           result = 9;
/*  438 */           req = "--";
/*  439 */           term = 45;
/*      */         }
/*  441 */         else if (peek(0) == 91)
/*      */         {
/*  443 */           result = 5;
/*  444 */           req = "[CDATA[";
/*  445 */           term = 93;
/*  446 */           push = true;
/*      */         }
/*      */         else
/*      */         {
/*  450 */           result = 10;
/*  451 */           req = "DOCTYPE";
/*  452 */           term = -1;
/*      */         }
/*      */       }
/*      */       else
/*      */       {
/*  457 */         error("illegal: <" + c);
/*  458 */         return 9;
/*      */       }
/*      */     }
/*      */     result = 0;
/*      */     int term = 0;
/*  461 */     for (int i = 0; i < req.length(); i++) {
/*  462 */       read(req.charAt(i));
/*      */     }
/*  464 */     if (result == 10) {
/*  465 */       parseDoctype(push);
/*      */     }
/*      */     else
/*      */     {
/*      */       while (true) {
/*  470 */         c = read();
/*  471 */         if (c == -1)
/*      */         {
/*  473 */           error(UNEXPECTED_EOF);
/*  474 */           return 9;
/*      */         }
/*      */ 
/*  477 */         if (push) {
/*  478 */           push(c);
/*      */         }
/*  480 */         if (((term == 63) || (c == term)) && (peek(0) == term) && (peek(1) == 62))
/*      */         {
/*      */           break;
/*      */         }
/*  484 */         prev = c;
/*      */       }
/*      */ 
/*  487 */       if ((term == 45) && (prev == 45)) {
/*  488 */         error("illegal comment delimiter: --->");
/*      */       }
/*  490 */       read();
/*  491 */       read();
/*      */ 
/*  493 */       if ((push) && (term != 63)) {
/*  494 */         this.txtPos -= 1;
/*      */       }
/*      */     }
/*  497 */     return result;
/*      */   }
/*      */ 
/*      */   private final void parseDoctype(boolean push)
/*      */     throws IOException, XmlPullParserException
/*      */   {
/*  506 */     int nesting = 1;
/*  507 */     boolean quoted = false;
/*      */     while (true)
/*      */     {
/*  513 */       int i = read();
/*  514 */       switch (i)
/*      */       {
/*      */       case -1:
/*  518 */         error(UNEXPECTED_EOF);
/*  519 */         return;
/*      */       case 39:
/*  522 */         quoted = !quoted;
/*  523 */         break;
/*      */       case 60:
/*  526 */         if (quoted) break;
/*  527 */         nesting++; break;
/*      */       case 62:
/*  531 */         if (quoted)
/*      */           break;
/*  533 */         nesting--; if (nesting != 0) break;
/*  534 */         return;
/*      */       }
/*      */ 
/*  538 */       if (push)
/*  539 */         push(i);
/*      */     }
/*      */   }
/*      */ 
/*      */   private final void parseEndTag()
/*      */     throws IOException, XmlPullParserException
/*      */   {
/*  548 */     read();
/*  549 */     read();
/*  550 */     this.name = readName();
/*  551 */     skip();
/*  552 */     read('>');
/*      */ 
/*  554 */     int sp = this.depth - 1 << 2;
/*      */ 
/*  556 */     if (this.depth == 0)
/*      */     {
/*  558 */       error("element stack empty");
/*  559 */       this.type = 9;
/*  560 */       return;
/*      */     }
/*      */ 
/*  563 */     if (!this.name.equals(this.elementStack[(sp + 3)]))
/*      */     {
/*  565 */       error("expected: /" + this.elementStack[(sp + 3)] + " read: " + this.name);
/*      */ 
/*  569 */       int probe = sp;
/*      */ 
/*  571 */       while ((probe >= 0) && (!this.name.toLowerCase().equals(this.elementStack[(probe + 3)].toLowerCase())))
/*      */       {
/*  574 */         this.stackMismatch += 1;
/*  575 */         probe -= 4;
/*      */       }
/*      */ 
/*  578 */       if (probe < 0)
/*      */       {
/*  580 */         this.stackMismatch = 0;
/*      */ 
/*  582 */         this.type = 9;
/*  583 */         return;
/*      */       }
/*      */     }
/*      */ 
/*  587 */     this.namespace = this.elementStack[sp];
/*  588 */     this.prefix = this.elementStack[(sp + 1)];
/*  589 */     this.name = this.elementStack[(sp + 2)];
/*      */   }
/*      */ 
/*      */   private final int peekType() throws IOException
/*      */   {
/*  594 */     switch (peek(0))
/*      */     {
/*      */     case -1:
/*  597 */       return 1;
/*      */     case 38:
/*  599 */       return 6;
/*      */     case 60:
/*  601 */       switch (peek(1))
/*      */       {
/*      */       case 47:
/*  604 */         return 3;
/*      */       case 33:
/*      */       case 63:
/*  607 */         return 999;
/*      */       }
/*  609 */       return 2;
/*      */     }
/*      */ 
/*  612 */     return 4;
/*      */   }
/*      */ 
/*      */   private final String get(int pos)
/*      */   {
/*  618 */     return new String(this.txtBuf, pos, this.txtPos - pos);
/*      */   }
/*      */ 
/*      */   private final void push(int c)
/*      */   {
/*  629 */     this.isWhitespace &= c <= 32;
/*      */ 
/*  631 */     if (this.txtPos == this.txtBuf.length)
/*      */     {
/*  633 */       char[] bigger = new char[this.txtPos * 4 / 3 + 4];
/*  634 */       System.arraycopy(this.txtBuf, 0, bigger, 0, this.txtPos);
/*  635 */       this.txtBuf = bigger;
/*      */     }
/*      */ 
/*  638 */     this.txtBuf[(this.txtPos++)] = (char)c;
/*      */   }
/*      */ 
/*      */   private final void parseStartTag(boolean xmldecl)
/*      */     throws IOException, XmlPullParserException
/*      */   {
/*  647 */     if (!xmldecl)
/*  648 */       read();
/*  649 */     this.name = readName();
/*  650 */     this.attributeCount = 0;
/*      */     while (true)
/*      */     {
/*  654 */       skip();
/*      */ 
/*  656 */       int c = peek(0);
/*      */ 
/*  658 */       if (xmldecl)
/*      */       {
/*  660 */         if (c == 63)
/*      */         {
/*  662 */           read();
/*  663 */           read('>');
/*  664 */           return;
/*      */         }
/*      */       }
/*      */       else
/*      */       {
/*  669 */         if (c == 47)
/*      */         {
/*  671 */           this.degenerated = true;
/*  672 */           read();
/*  673 */           skip();
/*  674 */           read('>');
/*  675 */           break;
/*      */         }
/*      */ 
/*  678 */         if ((c == 62) && (!xmldecl))
/*      */         {
/*  680 */           read();
/*  681 */           break;
/*      */         }
/*      */       }
/*      */ 
/*  685 */       if (c == -1)
/*      */       {
/*  687 */         error(UNEXPECTED_EOF);
/*      */ 
/*  689 */         return;
/*      */       }
/*      */ 
/*  692 */       String attrName = readName();
/*      */ 
/*  694 */       if (attrName.length() == 0)
/*      */       {
/*  696 */         error("attr name expected");
/*      */ 
/*  698 */         break;
/*      */       }
/*      */ 
/*  701 */       int i = this.attributeCount++ << 2;
/*      */ 
/*  703 */       this.attributes = ensureCapacity(this.attributes, i + 4);
/*      */ 
/*  705 */       this.attributes[(i++)] = "";
/*  706 */       this.attributes[(i++)] = null;
/*  707 */       this.attributes[(i++)] = attrName;
/*      */ 
/*  709 */       skip();
/*      */ 
/*  711 */       if (peek(0) != 61)
/*      */       {
/*  713 */         error("Attr.value missing f. " + attrName);
/*  714 */         this.attributes[i] = "1";
/*      */       }
/*      */       else
/*      */       {
/*  718 */         read('=');
/*  719 */         skip();
/*  720 */         int delimiter = peek(0);
/*      */ 
/*  722 */         if ((delimiter != 39) && (delimiter != 34))
/*      */         {
/*  724 */           error("attr value delimiter missing!");
/*  725 */           delimiter = 32;
/*      */         }
/*      */         else {
/*  728 */           read();
/*      */         }
/*  730 */         int p = this.txtPos;
/*  731 */         pushText(delimiter, true);
/*      */ 
/*  733 */         this.attributes[i] = get(p);
/*  734 */         this.txtPos = p;
/*      */ 
/*  736 */         if (delimiter != 32) {
/*  737 */           read();
/*      */         }
/*      */       }
/*      */     }
/*  741 */     int sp = this.depth++ << 2;
/*      */ 
/*  743 */     this.elementStack = ensureCapacity(this.elementStack, sp + 4);
/*  744 */     this.elementStack[(sp + 3)] = this.name;
/*      */ 
/*  746 */     if (this.depth >= this.nspCounts.length)
/*      */     {
/*  748 */       int[] bigger = new int[this.depth + 4];
/*  749 */       System.arraycopy(this.nspCounts, 0, bigger, 0, this.nspCounts.length);
/*  750 */       this.nspCounts = bigger;
/*      */     }
/*      */ 
/*  753 */     this.nspCounts[this.depth] = this.nspCounts[(this.depth - 1)];
/*      */ 
/*  761 */     if (this.processNsp)
/*  762 */       adjustNsp();
/*      */     else {
/*  764 */       this.namespace = "";
/*      */     }
/*  766 */     this.elementStack[sp] = this.namespace;
/*  767 */     this.elementStack[(sp + 1)] = this.prefix;
/*  768 */     this.elementStack[(sp + 2)] = this.name;
/*      */   }
/*      */ 
/*      */   private final void pushEntity()
/*      */     throws IOException, XmlPullParserException
/*      */   {
/*  779 */     push(read());
/*      */ 
/*  781 */     int pos = this.txtPos;
/*      */     while (true)
/*      */     {
/*  785 */       int c = read();
/*  786 */       if (c == 59)
/*      */         break;
/*  788 */       if ((c < 128) && ((c < 48) || (c > 57)) && ((c < 97) || (c > 122)) && ((c < 65) || (c > 90)) && (c != 95) && (c != 45) && (c != 35))
/*      */       {
/*  791 */         if (!this.relaxed)
/*      */         {
/*  793 */           error("unterminated entity ref");
/*      */         }
/*      */ 
/*  796 */         if (c != -1)
/*  797 */           push(c);
/*  798 */         return;
/*      */       }
/*      */ 
/*  801 */       push(c);
/*      */     }
/*      */ 
/*  804 */     String code = get(pos);
/*  805 */     this.txtPos = (pos - 1);
/*  806 */     if ((this.token) && (this.type == 6))
/*      */     {
/*  808 */       this.name = code;
/*      */     }
/*      */ 
/*  811 */     if (code.charAt(0) == '#')
/*      */     {
/*  813 */       int c = code.charAt(1) == 'x' ? Integer.parseInt(code.substring(2), 16) : Integer.parseInt(code.substring(1));
/*      */ 
/*  816 */       push(c);
/*  817 */       return;
/*      */     }
/*      */ 
/*  820 */     String result = (String)this.entityMap.get(code);
/*      */ 
/*  822 */     this.unresolved = (result == null);
/*      */ 
/*  824 */     if (this.unresolved)
/*      */     {
/*  826 */       if (!this.token) {
/*  827 */         error("unresolved: &" + code + ";");
/*      */       }
/*      */     }
/*      */     else
/*  831 */       for (int i = 0; i < result.length(); i++)
/*  832 */         push(result.charAt(i));
/*      */   }
/*      */ 
/*      */   private final void pushText(int delimiter, boolean resolveEntities)
/*      */     throws IOException, XmlPullParserException
/*      */   {
/*  846 */     int next = peek(0);
/*  847 */     int cbrCount = 0;
/*      */ 
/*  849 */     while ((next != -1) && (next != delimiter))
/*      */     {
/*  852 */       if ((delimiter == 32) && (
/*  853 */         (next <= 32) || (next == 62))) {
/*      */         break;
/*      */       }
/*  856 */       if (next == 38)
/*      */       {
/*  858 */         if (!resolveEntities) {
/*      */           break;
/*      */         }
/*  861 */         pushEntity();
/*      */       }
/*  863 */       else if ((next == 10) && (this.type == 2))
/*      */       {
/*  865 */         read();
/*  866 */         push(32);
/*      */       }
/*      */       else {
/*  869 */         push(read());
/*      */       }
/*  871 */       if ((next == 62) && (cbrCount >= 2) && (delimiter != 93)) {
/*  872 */         error("Illegal: ]]>");
/*      */       }
/*  874 */       if (next == 93)
/*  875 */         cbrCount++;
/*      */       else {
/*  877 */         cbrCount = 0;
/*      */       }
/*  879 */       next = peek(0);
/*      */     }
/*      */   }
/*      */ 
/*      */   private final void read(char c) throws IOException, XmlPullParserException
/*      */   {
/*  885 */     int a = read();
/*  886 */     if (a != c)
/*  887 */       error("expected: '" + c + "' actual: '" + (char)a + "'");
/*      */   }
/*      */ 
/*      */   private final int read()
/*      */     throws IOException
/*      */   {
/*      */     int result;
/*      */     
/*  894 */     if (this.peekCount == 0) {
/*  895 */       result = peek(0);
/*      */     }
/*      */     else {
/*  898 */       result = this.peek[0];
/*  899 */       this.peek[0] = this.peek[1];
/*      */     }
/*      */ 
/*  905 */     this.peekCount -= 1;
/*      */ 
/*  907 */     this.column += 1;
/*      */ 
/*  909 */     if (result == 10)
/*      */     {
/*  912 */       this.line += 1;
/*  913 */       this.column = 1;
/*      */     }
/*      */ 
/*  916 */     return result;
/*      */   }
/*      */ 
/*      */   private final int peek(int pos)
/*      */     throws IOException
/*      */   {
/*  924 */     while (pos >= this.peekCount)
/*      */     {
/*  927 */       int nw = this.reader.read();
/*      */ 
/*  929 */       if (nw == 13)
/*      */       {
/*  931 */         this.wasCR = true;
/*  932 */         this.peek[(this.peekCount++)] = 10;
/*      */       }
/*      */       else
/*      */       {
/*  936 */         if (nw == 10)
/*      */         {
/*  938 */           if (!this.wasCR)
/*  939 */             this.peek[(this.peekCount++)] = 10;
/*      */         }
/*      */         else {
/*  942 */           this.peek[(this.peekCount++)] = nw;
/*      */         }
/*  944 */         this.wasCR = false;
/*      */       }
/*      */     }
/*      */ 
/*  948 */     return this.peek[pos];
/*      */   }
/*      */ 
/*      */   private final String readName()
/*      */     throws IOException, XmlPullParserException
/*      */   {
/*  954 */     int pos = this.txtPos;
/*  955 */     int c = peek(0);
/*  956 */     if (((c < 97) || (c > 122)) && ((c < 65) || (c > 90)) && (c != 95) && (c != 58) && (c < 192) && (!this.relaxed))
/*      */     {
/*  958 */       error("name expected");
/*      */     }
/*      */     do
/*      */     {
/*  962 */       push(read());
/*  963 */       c = peek(0);
/*      */     }
/*      */ 
/*  966 */     while (((c >= 97) && (c <= 122)) || ((c >= 65) && (c <= 90)) || ((c >= 48) && (c <= 57)) || (c == 95) || (c == 45) || (c == 58) || (c == 46) || (c >= 183));
/*      */ 
/*  968 */     String result = get(pos);
/*  969 */     this.txtPos = pos;
/*  970 */     return result;
/*      */   }
/*      */ 
/*      */   private final void skip()
/*      */     throws IOException
/*      */   {
/*      */     while (true)
/*      */     {
/*  978 */       int c = peek(0);
/*  979 */       if ((c > 32) || (c == -1))
/*      */         break;
/*  981 */       read();
/*      */     }
/*      */   }
/*      */ 
/*      */   public void setInput(InputStream is, String _enc)
/*      */     throws XmlPullParserException
/*      */   {
/*  988 */     throw new XmlPullParserException("unsupported");
/*      */   }
/*      */ 
/*      */   public boolean getFeature(String feature)
/*      */   {
/* 1021 */     if ("http://xmlpull.org/v1/doc/features.html#process-namespaces".equals(feature))
/* 1022 */       return this.processNsp;
/* 1023 */     if (isProp(feature, false, "relaxed")) {
/* 1024 */       return this.relaxed;
/*      */     }
/* 1026 */     return false;
/*      */   }
/*      */ 
/*      */   public String getInputEncoding()
/*      */   {
/* 1031 */     return this.encoding;
/*      */   }
/*      */ 
/*      */   public void defineEntityReplacementText(String entity, String value)
/*      */     throws XmlPullParserException
/*      */   {
/* 1037 */     if (this.entityMap == null) {
/* 1038 */       throw new RuntimeException("entity replacement text must be defined after setInput!");
/*      */     }
/* 1040 */     this.entityMap.put(entity, value);
/*      */   }
/*      */ 
/*      */   public Object getProperty(String property)
/*      */   {
/* 1045 */     if (isProp(property, true, "xmldecl-version"))
/* 1046 */       return this.version;
/* 1047 */     if (isProp(property, true, "xmldecl-standalone"))
/* 1048 */       return this.standalone;
/* 1049 */     if (isProp(property, true, "location"))
/* 1050 */       return this.location != null ? this.location : this.reader.toString();
/* 1051 */     return null;
/*      */   }
/*      */ 
/*      */   public int getNamespaceCount(int depth)
/*      */   {
/* 1056 */     if (depth > this.depth)
/* 1057 */       throw new IndexOutOfBoundsException();
/* 1058 */     return this.nspCounts[depth];
/*      */   }
/*      */ 
/*      */   public String getNamespacePrefix(int pos)
/*      */   {
/* 1063 */     return this.nspStack[(pos << 1)];
/*      */   }
/*      */ 
/*      */   public String getNamespaceUri(int pos)
/*      */   {
/* 1068 */     return this.nspStack[((pos << 1) + 1)];
/*      */   }
/*      */ 
/*      */   public String getNamespace(String prefix)
/*      */   {
/* 1074 */     if ("xml".equals(prefix))
/* 1075 */       return "http://www.w3.org/XML/1998/namespace";
/* 1076 */     if ("xmlns".equals(prefix)) {
/* 1077 */       return "http://www.w3.org/2000/xmlns/";
/*      */     }
/* 1079 */     for (int i = (getNamespaceCount(this.depth) << 1) - 2; i >= 0; i -= 2)
/*      */     {
/* 1081 */       if (prefix == null)
/*      */       {
/* 1083 */         if (this.nspStack[i] == null)
/* 1084 */           return this.nspStack[(i + 1)];
/*      */       }
/* 1086 */       else if (prefix.equals(this.nspStack[i]))
/* 1087 */         return this.nspStack[(i + 1)];
/*      */     }
/* 1089 */     return null;
/*      */   }
/*      */ 
/*      */   public int getDepth()
/*      */   {
/* 1094 */     return this.depth;
/*      */   }
/*      */ 
/*      */   public String getPositionDescription()
/*      */   {
/* 1100 */     StringBuffer buf = new StringBuffer(this.type < TYPES.length ? TYPES[this.type] : "unknown");
/*      */ 
/* 1102 */     buf.append(' ');
/*      */ 
/* 1104 */     if ((this.type == 2) || (this.type == 3))
/*      */     {
/* 1106 */       if (this.degenerated)
/* 1107 */         buf.append("(empty) ");
/* 1108 */       buf.append('<');
/* 1109 */       if (this.type == 3) {
/* 1110 */         buf.append('/');
/*      */       }
/* 1112 */       if (this.prefix != null)
/* 1113 */         buf.append("{" + this.namespace + "}" + this.prefix + ":");
/* 1114 */       buf.append(this.name);
/*      */ 
/* 1116 */       int cnt = this.attributeCount << 2;
/* 1117 */       for (int i = 0; i < cnt; i += 4)
/*      */       {
/* 1119 */         buf.append(' ');
/* 1120 */         if (this.attributes[(i + 1)] != null) {
/* 1121 */           buf.append("{" + this.attributes[i] + "}" + this.attributes[(i + 1)] + ":");
/*      */         }
/* 1123 */         buf.append(this.attributes[(i + 2)] + "='" + this.attributes[(i + 3)] + "'");
/*      */       }
/*      */ 
/* 1126 */       buf.append('>');
/*      */     }
/* 1128 */     else if (this.type != 7)
/*      */     {
/* 1130 */       if (this.type != 4) {
/* 1131 */         buf.append(getText());
/* 1132 */       } else if (this.isWhitespace) {
/* 1133 */         buf.append("(whitespace)");
/*      */       }
/*      */       else {
/* 1136 */         String text = getText();
/* 1137 */         if (text.length() > 16)
/* 1138 */           text = text.substring(0, 16) + "...";
/* 1139 */         buf.append(text);
/*      */       }
/*      */     }
/* 1142 */     buf.append("@" + this.line + ":" + this.column);
/* 1143 */     if (this.location != null)
/*      */     {
/* 1145 */       buf.append(" in ");
/* 1146 */       buf.append(this.location);
/*      */     }
/* 1148 */     else if (this.reader != null)
/*      */     {
/* 1150 */       buf.append(" in ");
/* 1151 */       buf.append(this.reader.toString());
/*      */     }
/* 1153 */     return buf.toString();
/*      */   }
/*      */ 
/*      */   public int getLineNumber()
/*      */   {
/* 1158 */     return this.line;
/*      */   }
/*      */ 
/*      */   public int getColumnNumber()
/*      */   {
/* 1163 */     return this.column;
/*      */   }
/*      */ 
/*      */   public boolean isWhitespace() throws XmlPullParserException
/*      */   {
/* 1168 */     if ((this.type != 4) && (this.type != 7) && (this.type != 5))
/* 1169 */       exception(ILLEGAL_TYPE);
/* 1170 */     return this.isWhitespace;
/*      */   }
/*      */ 
/*      */   public String getText()
/*      */   {
/* 1175 */     return (this.type < 4) || ((this.type == 6) && (this.unresolved)) ? null : get(0);
/*      */   }
/*      */ 
/*      */   public char[] getTextCharacters(int[] poslen)
/*      */   {
/* 1181 */     if (this.type >= 4)
/*      */     {
/* 1183 */       if (this.type == 6)
/*      */       {
/* 1185 */         poslen[0] = 0;
/* 1186 */         poslen[1] = this.name.length();
/* 1187 */         return this.name.toCharArray();
/*      */       }
/* 1189 */       poslen[0] = 0;
/* 1190 */       poslen[1] = this.txtPos;
/* 1191 */       return this.txtBuf;
/*      */     }
/*      */ 
/* 1194 */     poslen[0] = -1;
/* 1195 */     poslen[1] = -1;
/* 1196 */     return null;
/*      */   }
/*      */ 
/*      */   public String getNamespace()
/*      */   {
/* 1201 */     return this.namespace;
/*      */   }
/*      */ 
/*      */   public String getName()
/*      */   {
/* 1206 */     return this.name;
/*      */   }
/*      */ 
/*      */   public String getPrefix()
/*      */   {
/* 1211 */     return this.prefix;
/*      */   }
/*      */ 
/*      */   public boolean isEmptyElementTag() throws XmlPullParserException
/*      */   {
/* 1216 */     if (this.type != 2)
/* 1217 */       exception(ILLEGAL_TYPE);
/* 1218 */     return this.degenerated;
/*      */   }
/*      */ 
/*      */   public int getAttributeCount()
/*      */   {
/* 1223 */     return this.attributeCount;
/*      */   }
/*      */ 
/*      */   public String getAttributeType(int index)
/*      */   {
/* 1228 */     return "CDATA";
/*      */   }
/*      */ 
/*      */   public boolean isAttributeDefault(int index)
/*      */   {
/* 1233 */     return false;
/*      */   }
/*      */ 
/*      */   public String getAttributeNamespace(int index)
/*      */   {
/* 1238 */     if (index >= this.attributeCount)
/* 1239 */       throw new IndexOutOfBoundsException();
/* 1240 */     return this.attributes[(index << 2)];
/*      */   }
/*      */ 
/*      */   public String getAttributeName(int index)
/*      */   {
/* 1245 */     if (index >= this.attributeCount)
/* 1246 */       throw new IndexOutOfBoundsException();
/* 1247 */     return this.attributes[((index << 2) + 2)];
/*      */   }
/*      */ 
/*      */   public String getAttributePrefix(int index)
/*      */   {
/* 1252 */     if (index >= this.attributeCount)
/* 1253 */       throw new IndexOutOfBoundsException();
/* 1254 */     return this.attributes[((index << 2) + 1)];
/*      */   }
/*      */ 
/*      */   public String getAttributeValue(int index)
/*      */   {
/* 1259 */     if (index >= this.attributeCount)
/* 1260 */       throw new IndexOutOfBoundsException();
/* 1261 */     return this.attributes[((index << 2) + 3)];
/*      */   }
/*      */ 
/*      */   public String getAttributeValue(String namespace, String name)
/*      */   {
/* 1267 */     for (int i = (this.attributeCount << 2) - 4; i >= 0; i -= 4)
/*      */     {
/* 1269 */       if ((this.attributes[(i + 2)].equals(name)) && ((namespace == null) || (this.attributes[i].equals(namespace))))
/*      */       {
/* 1271 */         return this.attributes[(i + 3)];
/*      */       }
/*      */     }
/* 1274 */     return null;
/*      */   }
/*      */ 
/*      */   public int getEventType() throws XmlPullParserException
/*      */   {
/* 1279 */     return this.type;
/*      */   }
/*      */ 
/*      */   public int next()
/*      */     throws XmlPullParserException, IOException
/*      */   {
/* 1285 */     this.txtPos = 0;
/* 1286 */     this.isWhitespace = true;
/* 1287 */     int minType = 9999;
/* 1288 */     this.token = false;
/*      */     do
/*      */     {
/* 1292 */       nextImpl();
/* 1293 */       if (this.type < minType) {
/* 1294 */         minType = this.type;
/*      */       }
/*      */     }
/* 1297 */     while ((minType > 6) || ((minType >= 4) && (peekType() >= 4)));
/*      */ 
/* 1299 */     this.type = minType;
/* 1300 */     if (this.type > 4) {
/* 1301 */       this.type = 4;
/*      */     }
/* 1303 */     return this.type;
/*      */   }
/*      */ 
/*      */   public int nextToken()
/*      */     throws XmlPullParserException, IOException
/*      */   {
/* 1309 */     this.isWhitespace = true;
/* 1310 */     this.txtPos = 0;
/*      */ 
/* 1312 */     this.token = true;
/* 1313 */     nextImpl();
/* 1314 */     return this.type;
/*      */   }
/*      */ 
/*      */   public int nextTag()
/*      */     throws XmlPullParserException, IOException
/*      */   {
/* 1323 */     next();
/* 1324 */     if ((this.type == 4) && (this.isWhitespace)) {
/* 1325 */       next();
/*      */     }
/* 1327 */     if ((this.type != 3) && (this.type != 2)) {
/* 1328 */       exception("unexpected type");
/*      */     }
/* 1330 */     return this.type;
/*      */   }
/*      */ 
/*      */   public void require(int type, String namespace, String name)
/*      */     throws XmlPullParserException, IOException
/*      */   {
/* 1337 */     if ((type != this.type) || ((namespace != null) && (!namespace.equals(getNamespace()))) || ((name != null) && (!name.equals(getName()))))
/*      */     {
/* 1340 */       exception("expected: " + TYPES[type] + " {" + namespace + "}" + name);
/*      */     }
/*      */   }
/*      */ 
/*      */   public String nextText() throws XmlPullParserException, IOException
/*      */   {
/* 1346 */     if (this.type != 2) {
/* 1347 */       exception("precondition: START_TAG");
/*      */     }
/* 1349 */     next();
/*      */     String result;
/* 1353 */     if (this.type == 4)
/*      */     {
/* 1355 */      result = getText();
/* 1356 */       next();
/*      */     }
/*      */     else {
/* 1359 */       result = "";
/*      */     }
/* 1361 */     if (this.type != 3) {
/* 1362 */       exception("END_TAG expected");
/*      */     }
/* 1364 */     return result;
/*      */   }
/*      */ 
/*      */   public void setFeature(String feature, boolean value)
/*      */     throws XmlPullParserException
/*      */   {
/* 1370 */     if ("http://xmlpull.org/v1/doc/features.html#process-namespaces".equals(feature))
/* 1371 */       this.processNsp = value;
/* 1372 */     else if (isProp(feature, false, "relaxed"))
/* 1373 */       this.relaxed = value;
/*      */     else
/* 1375 */       exception("unsupported feature: " + feature);
/*      */   }
/*      */ 
/*      */   public void setProperty(String property, Object value)
/*      */     throws XmlPullParserException
/*      */   {
/* 1381 */     if (isProp(property, true, "location"))
/* 1382 */       this.location = value;
/*      */     else
/* 1384 */       throw new XmlPullParserException("unsupported property: " + property);
/*      */   }
/*      */ 
/*      */   public void skipSubTree()
/*      */     throws XmlPullParserException, IOException
/*      */   {
/* 1397 */     require(2, null, null);
/* 1398 */     int level = 1;
/* 1399 */     while (level > 0)
/*      */     {
/* 1401 */       int eventType = next();
/* 1402 */       if (eventType == 3)
/*      */       {
/* 1404 */         level--;
/*      */       }
/* 1406 */       else if (eventType == 2)
/*      */       {
/* 1408 */         level++;
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   public void setInput(Reader reader)
/*      */     throws XmlPullParserException
/*      */   {
/* 1416 */     this.reader = reader;
/*      */ 
/* 1418 */     this.encoding = "utf-8";
/*      */ 
/* 1421 */     this.line = 1;
/* 1422 */     this.column = 0;
/* 1423 */     this.type = 0;
/* 1424 */     this.name = null;
/* 1425 */     this.namespace = null;
/* 1426 */     this.degenerated = false;
/* 1427 */     this.attributeCount = -1;
/* 1428 */     this.version = null;
/* 1429 */     this.standalone = null;
/*      */ 
/* 1431 */     this.peekCount = 0;
/* 1432 */     this.depth = 0;
/*      */ 
/* 1434 */     this.entityMap = new Hashtable();
/* 1435 */     this.entityMap.put("amp", "&");
/* 1436 */     this.entityMap.put("apos", "'");
/* 1437 */     this.entityMap.put("gt", ">");
/* 1438 */     this.entityMap.put("lt", "<");
/* 1439 */     this.entityMap.put("quot", "\"");
/*      */   }
/*      */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.org.it.yup.xml.KXmlParser
 * JD-Core Version:    0.6.0
 */
