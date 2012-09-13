/*     */ package com.whatsapp.org.bouncycastle.util.encoders;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.io.OutputStream;
/*     */ 
/*     */ public class Base64Encoder
/*     */   implements Encoder
/*     */ {
/*   8 */   protected final byte[] encodingTable = { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47 };
/*     */ 
/*  23 */   protected byte padding = 61;
/*     */ 
/*  28 */   protected final byte[] decodingTable = new byte[1024];
/*     */ 
/*     */   protected void initialiseDecodingTable()
/*     */   {
/*  32 */     for (int i = 0; i < this.encodingTable.length; i++)
/*     */     {
/*  34 */       this.decodingTable[this.encodingTable[i]] = (byte)i;
/*     */     }
/*     */   }
/*     */ 
/*     */   public Base64Encoder()
/*     */   {
/*  40 */     initialiseDecodingTable();
/*     */   }
/*     */ 
/*     */   public int encode(byte[] data, int off, int length, OutputStream out)
/*     */     throws IOException
/*     */   {
/*  51 */     int modulus = length % 3;
/*  52 */     int dataLength = length - modulus;
/*     */ 
/*  55 */     for (int i = off; i < off + dataLength; i += 3)
/*     */     {
/*  57 */       int a1 = data[i] & 0xFF;
/*  58 */       int a2 = data[(i + 1)] & 0xFF;
/*  59 */       int a3 = data[(i + 2)] & 0xFF;
/*     */ 
/*  61 */       out.write(this.encodingTable[(a1 >>> 2 & 0x3F)]);
/*  62 */       out.write(this.encodingTable[((a1 << 4 | a2 >>> 4) & 0x3F)]);
/*  63 */       out.write(this.encodingTable[((a2 << 2 | a3 >>> 6) & 0x3F)]);
/*  64 */       out.write(this.encodingTable[(a3 & 0x3F)]);
/*     */     }
/*     */     int d1;
/*     */     int b1;
/*     */     int b2;
/*  73 */     switch (modulus)
/*     */     {
/*     */     case 0:
/*  76 */       break;
/*     */     case 1:
/*  78 */       d1 = data[(off + dataLength)] & 0xFF;
/*  79 */       b1 = d1 >>> 2 & 0x3F;
/*  80 */       b2 = d1 << 4 & 0x3F;
/*     */ 
/*  82 */       out.write(this.encodingTable[b1]);
/*  83 */       out.write(this.encodingTable[b2]);
/*  84 */       out.write(this.padding);
/*  85 */       out.write(this.padding);
/*  86 */       break;
/*     */     case 2:
/*  88 */       d1 = data[(off + dataLength)] & 0xFF;
/*  89 */       int d2 = data[(off + dataLength + 1)] & 0xFF;
/*     */ 
/*  91 */       b1 = d1 >>> 2 & 0x3F;
/*  92 */       b2 = (d1 << 4 | d2 >>> 4) & 0x3F;
/*  93 */       int b3 = d2 << 2 & 0x3F;
/*     */ 
/*  95 */       out.write(this.encodingTable[b1]);
/*  96 */       out.write(this.encodingTable[b2]);
/*  97 */       out.write(this.encodingTable[b3]);
/*  98 */       out.write(this.padding);
/*     */     }
/*     */ 
/* 102 */     return dataLength / 3 * 4 + (modulus == 0 ? 0 : 4);
/*     */   }
/*     */ 
/*     */   private boolean ignore(char c)
/*     */   {
/* 107 */     return (c == '\n') || (c == '\r') || (c == '\t') || (c == ' ');
/*     */   }
/*     */ 
/*     */   public int decode(byte[] data, int off, int length, OutputStream out)
/*     */     throws IOException
/*     */   {
/* 120 */     int outLen = 0;
/*     */ 
/* 122 */     int end = off + length;
/*     */ 
/* 124 */     while (end > off)
/*     */     {
/* 126 */       if (!ignore((char)data[(end - 1)]))
/*     */       {
/*     */         break;
/*     */       }
/*     */ 
/* 131 */       end--;
/*     */     }
/*     */ 
/* 134 */     int i = off;
/* 135 */     int finish = end - 4;
/*     */ 
/* 137 */     i = nextI(data, i, finish);
/*     */ 
/* 139 */     while (i < finish)
/*     */     {
/* 141 */       byte b1 = this.decodingTable[data[(i++)]];
/*     */ 
/* 143 */       i = nextI(data, i, finish);
/*     */ 
/* 145 */       byte b2 = this.decodingTable[data[(i++)]];
/*     */ 
/* 147 */       i = nextI(data, i, finish);
/*     */ 
/* 149 */       byte b3 = this.decodingTable[data[(i++)]];
/*     */ 
/* 151 */       i = nextI(data, i, finish);
/*     */ 
/* 153 */       byte b4 = this.decodingTable[data[(i++)]];
/*     */ 
/* 155 */       out.write(b1 << 2 | b2 >> 4);
/* 156 */       out.write(b2 << 4 | b3 >> 2);
/* 157 */       out.write(b3 << 6 | b4);
/*     */ 
/* 159 */       outLen += 3;
/*     */ 
/* 161 */       i = nextI(data, i, finish);
/*     */     }
/*     */ 
/* 164 */     outLen += decodeLastBlock(out, (char)data[(end - 4)], (char)data[(end - 3)], (char)data[(end - 2)], (char)data[(end - 1)]);
/*     */ 
/* 168 */     return outLen;
/*     */   }
/*     */ 
/*     */   private int nextI(byte[] data, int i, int finish)
/*     */   {
/* 173 */     while ((i < finish) && (ignore((char)data[i])))
/*     */     {
/* 175 */       i++;
/*     */     }
/* 177 */     return i;
/*     */   }
/*     */ 
/*     */   public int decode(String data, OutputStream out)
/*     */     throws IOException
/*     */   {
/* 189 */     int length = 0;
/*     */ 
/* 191 */     int end = data.length();
/*     */ 
/* 193 */     while (end > 0)
/*     */     {
/* 195 */       if (!ignore(data.charAt(end - 1)))
/*     */       {
/*     */         break;
/*     */       }
/*     */ 
/* 200 */       end--;
/*     */     }
/*     */ 
/* 203 */     int i = 0;
/* 204 */     int finish = end - 4;
/*     */ 
/* 206 */     i = nextI(data, i, finish);
/*     */ 
/* 208 */     while (i < finish)
/*     */     {
/* 210 */       byte b1 = this.decodingTable[data.charAt(i++)];
/*     */ 
/* 212 */       i = nextI(data, i, finish);
/*     */ 
/* 214 */       byte b2 = this.decodingTable[data.charAt(i++)];
/*     */ 
/* 216 */       i = nextI(data, i, finish);
/*     */ 
/* 218 */       byte b3 = this.decodingTable[data.charAt(i++)];
/*     */ 
/* 220 */       i = nextI(data, i, finish);
/*     */ 
/* 222 */       byte b4 = this.decodingTable[data.charAt(i++)];
/*     */ 
/* 224 */       out.write(b1 << 2 | b2 >> 4);
/* 225 */       out.write(b2 << 4 | b3 >> 2);
/* 226 */       out.write(b3 << 6 | b4);
/*     */ 
/* 228 */       length += 3;
/*     */ 
/* 230 */       i = nextI(data, i, finish);
/*     */     }
/*     */ 
/* 233 */     length += decodeLastBlock(out, data.charAt(end - 4), data.charAt(end - 3), data.charAt(end - 2), data.charAt(end - 1));
/*     */ 
/* 236 */     return length;
/*     */   }
/*     */ 
/*     */   private int decodeLastBlock(OutputStream out, char c1, char c2, char c3, char c4)
/*     */     throws IOException
/*     */   {
/* 244 */     if (c3 == this.padding)
/*     */     {
/* 246 */       byte b1 = this.decodingTable[c1];
/* 247 */       byte b2 = this.decodingTable[c2];
/*     */ 
/* 249 */       out.write(b1 << 2 | b2 >> 4);
/*     */ 
/* 251 */       return 1;
/*     */     }
/* 253 */     if (c4 == this.padding)
/*     */     {
/* 255 */       byte b1 = this.decodingTable[c1];
/* 256 */       byte b2 = this.decodingTable[c2];
/* 257 */       byte b3 = this.decodingTable[c3];
/*     */ 
/* 259 */       out.write(b1 << 2 | b2 >> 4);
/* 260 */       out.write(b2 << 4 | b3 >> 2);
/*     */ 
/* 262 */       return 2;
/*     */     }
/*     */ 
/* 266 */     byte b1 = this.decodingTable[c1];
/* 267 */     byte b2 = this.decodingTable[c2];
/* 268 */     byte b3 = this.decodingTable[c3];
/* 269 */     byte b4 = this.decodingTable[c4];
/*     */ 
/* 271 */     out.write(b1 << 2 | b2 >> 4);
/* 272 */     out.write(b2 << 4 | b3 >> 2);
/* 273 */     out.write(b3 << 6 | b4);
/*     */ 
/* 275 */     return 3;
/*     */   }
/*     */ 
/*     */   private int nextI(String data, int i, int finish)
/*     */   {
/* 281 */     while ((i < finish) && (ignore(data.charAt(i))))
/*     */     {
/* 283 */       i++;
/*     */     }
/* 285 */     return i;
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.org.bouncycastle.util.encoders.Base64Encoder
 * JD-Core Version:    0.6.0
 */
