/*     */ package com.whatsapp.api.contacts;
/*     */ 
/*     */ import com.whatsapp.api.util.AppManager;
/*     */ import com.whatsapp.api.util.Sort;
/*     */ import com.whatsapp.api.util.Sort.Comparator;
/*     */ import com.whatsapp.api.util.Utilities;
/*     */ import com.whatsapp.client.FGApp;
/*     */ import java.io.DataInputStream;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.EOFException;
/*     */ import java.io.InputStream;
/*     */ import java.io.OutputStream;
/*     */ import java.util.Hashtable;
/*     */ import java.util.Vector;
/*     */ import javax.microedition.io.Connector;
/*     */ import javax.microedition.io.file.FileConnection;
/*     */ 
/*     */ public class Favorites
/*     */ {
/*     */   public static final int YES = 1;
/*     */   public static final int NO = 2;
/*     */   private static final String FILENAME = "WA_Favorites";
/*  28 */   Hashtable _favoritesTable = new Hashtable();
/*     */ 
/*  30 */   Vector _favoritesList = new Vector();
/*  31 */   Vector _blackballList = new Vector();
/*  32 */   public boolean _dirty = false;
/*     */ 
/*     */   private static String getPath()
/*     */   {
/*  38 */     return System.getProperty("fileconn.dir.private");
/*     */   }
/*     */ 
/*     */   public synchronized boolean initialize() {
/*  42 */     FileConnection fileC = null;
/*  43 */     InputStream is = null;
/*  44 */     DataInputStream dIS = null;
/*     */ 
/*  46 */     this._favoritesList.removeAllElements();
/*  47 */     this._blackballList.removeAllElements();
/*  48 */     this._favoritesTable.clear();
/*  49 */     this._dirty = false;
/*     */     try {
/*  51 */       String filename = getPath() + "WA_Favorites";
/*  52 */       fileC = (FileConnection)Connector.open(filename, 1);
/*  53 */       if (!fileC.exists()) {
/*  54 */         int i = 1;
/*     */         return i;
/*     */       }
/*  56 */       is = fileC.openInputStream();
/*  57 */       dIS = new DataInputStream(is);
/*     */       try
/*     */       {
/*     */         while (true) {
/*  61 */           String newJid = dIS.readUTF();
/*  62 */           int newVal = dIS.readInt();
/*  63 */           if ((newVal == 1) || (newVal == 2)) {
/*  64 */             this._favoritesTable.put(newJid, new Integer(newVal));
/*  65 */             if (newVal == 1)
/*  66 */               this._favoritesList.addElement(newJid);
/*  67 */             else if (newVal == 2)
/*  68 */               this._blackballList.addElement(newJid);
/*     */           }
/*     */           else {
/*  71 */             Utilities.logData("stored Favorites jid " + newJid + " found with unknown val " + newVal);
/*     */           }
/*     */ 
/*     */         }
/*     */ 
/*     */       }
/*     */       catch (EOFException j)
/*     */       {
/*  79 */         j = 1;
/*     */ 
/*  84 */         if (dIS != null)
/*     */           try {
/*  86 */             dIS.close();
/*     */           }
/*     */           catch (Exception x) {
/*     */           }
/*  90 */         if (is != null)
/*     */           try {
/*  92 */             is.close();
/*     */           }
/*     */           catch (Exception x) {
/*     */           }
/*  96 */         if (fileC != null)
/*     */           try {
/*  98 */             fileC.close(); } catch (Exception x) {
/*     */           }
/* 100 */         return j;
/*     */       }
/*     */     }
/*     */     catch (Throwable t)
/*     */     {
/*  81 */       Utilities.logData("favs init blew up with " + t.toString());
/*  82 */       int j = 0;
/*     */       return j;
/*     */     }
/*     */     finally
/*     */     {
/*  84 */       if (dIS != null)
/*     */         try {
/*  86 */           dIS.close();
/*     */         }
/*     */         catch (Exception x) {
/*     */         }
/*  90 */       if (is != null)
/*     */         try {
/*  92 */           is.close();
/*     */         }
/*     */         catch (Exception x) {
/*     */         }
/*  96 */       if (fileC != null)
/*     */         try {
/*  98 */           fileC.close(); } catch (Exception x) {
/*     */         }
/*     */     }
/* 100 */     throw localObject;
/*     */   }
/*     */ 
/*     */   public synchronized void saveToDisk()
/*     */   {
/* 106 */     if (this._dirty)
/*     */     {
/* 109 */       FileConnection fileC = null;
/* 110 */       OutputStream os = null;
/* 111 */       DataOutputStream dOS = null;
/*     */       try
/*     */       {
/* 114 */         String filename = getPath() + "WA_Favorites";
/* 115 */         Utilities.logData("trying to open favs for write " + filename);
/* 116 */         fileC = (FileConnection)Connector.open(filename, 3);
/* 117 */         if (!fileC.exists()) {
/* 118 */           fileC.create();
/*     */         }
/* 120 */         os = fileC.openOutputStream(0L);
/* 121 */         dOS = new DataOutputStream(os);
/*     */ 
/* 124 */         for (int i = 0; i < this._favoritesList.size(); i++) {
/* 125 */           String curJid = (String)this._favoritesList.elementAt(i);
/* 126 */           dOS.writeUTF(curJid);
/* 127 */           dOS.writeInt(1);
/*     */         }
/* 129 */         for (int i = 0; i < this._blackballList.size(); i++) {
/* 130 */           String curJid = (String)this._blackballList.elementAt(i);
/* 131 */           dOS.writeUTF(curJid);
/* 132 */           dOS.writeInt(2);
/*     */         }
/* 134 */         dOS.flush();
/* 135 */         this._dirty = false;
/*     */       } catch (Throwable x) {
/* 137 */         Utilities.logData("favorites save blew up with " + t.toString());
/*     */       } finally {
/* 139 */         if (dOS != null)
/*     */           try {
/* 141 */             dOS.close();
/*     */           }
/*     */           catch (Exception x) {
/*     */           }
/* 145 */         if (os != null)
/*     */           try {
/* 147 */             os.close();
/*     */           }
/*     */           catch (Exception x) {
/*     */           }
/* 151 */         if (fileC != null)
/*     */           try {
/* 153 */             fileC.close();
/*     */           }
/*     */           catch (Exception x)
/*     */           {
/*     */           }
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public synchronized void addFavorite(String jid) {
/* 163 */     if (jid != null) {
/* 164 */       Integer curVal = (Integer)this._favoritesTable.get(jid);
/* 165 */       if (curVal.intValue() == 1)
/*     */       {
/* 167 */         return;
/*     */       }
/* 169 */       this._dirty = true;
/* 170 */       this._favoritesList.addElement(jid);
/* 171 */       this._blackballList.removeElement(jid);
/* 172 */       this._favoritesTable.put(jid, new Integer(1));
/*     */     }
/*     */   }
/*     */ 
/*     */   public synchronized void autoAdd(String jid) {
/* 177 */     Integer curVal = (Integer)this._favoritesTable.get(jid);
/*     */ 
/* 181 */     if (curVal == null)
/*     */     {
/* 183 */       this._dirty = true;
/* 184 */       this._favoritesList.addElement(jid);
/* 185 */       this._favoritesTable.put(jid, new Integer(1));
/*     */     }
/*     */   }
/*     */ 
/*     */   public boolean isFavorite(String jid) {
/* 190 */     Integer curVal = (Integer)this._favoritesTable.get(jid);
/* 191 */     return (curVal != null) && (curVal.intValue() == 1);
/*     */   }
/*     */ 
/*     */   public synchronized void deleteFavorite(String jid, boolean blackball)
/*     */   {
/* 198 */     Utilities.logData("deleting favorite " + jid + " with blackball " + blackball);
/* 199 */     Object resObj = null;
/* 200 */     boolean res = this._favoritesList.removeElement(jid);
/* 201 */     if (blackball) {
/* 202 */       this._favoritesTable.put(jid, new Integer(2));
/* 203 */       this._blackballList.addElement(jid);
/*     */     } else {
/* 205 */       resObj = this._favoritesTable.remove(jid);
/*     */     }
/* 207 */     if ((res) || (blackball) || (resObj != null))
/* 208 */       this._dirty = true;
/*     */   }
/*     */ 
/*     */   public synchronized int moveFavorite(String jid, int delta)
/*     */   {
/* 213 */     int curIndex = this._favoritesList.indexOf(jid);
/* 214 */     int newIndex = curIndex + delta;
/*     */ 
/* 216 */     if (curIndex < 0) {
/* 217 */       Utilities.logData(jid + " not found in stored favorites list!");
/*     */     }
/*     */ 
/* 220 */     if ((curIndex < 0) || (newIndex < 0))
/* 221 */       return 0;
/* 222 */     if (newIndex > this._favoritesList.size()) {
/* 223 */       return curIndex;
/*     */     }
/*     */ 
/* 226 */     this._favoritesList.removeElementAt(curIndex);
/* 227 */     this._favoritesList.insertElementAt(jid, newIndex);
/* 228 */     this._dirty = true;
/*     */ 
/* 230 */     return newIndex;
/*     */   }
/*     */ 
/*     */   public int size() {
/* 234 */     return this._favoritesList.size();
/*     */   }
/*     */ 
/*     */   public Vector getList()
/*     */   {
/* 239 */     int s = this._favoritesList.size();
/* 240 */     Vector v = new Vector(this._favoritesList.size());
/* 241 */     for (int i = 0; i < s; i++) {
/* 242 */       v.addElement(this._favoritesList.elementAt(i));
/*     */     }
/* 244 */     return v;
/*     */   }
/*     */ 
/*     */   public synchronized void sort() {
/* 248 */     if (AppManager.isBackground()) {
/* 249 */       Utilities.logData("can't sort favs in bg");
/* 250 */       return;
/*     */     }
/* 252 */     if (this._favoritesList.size() > 1) {
/* 253 */       Vector newFavsList = Sort.quickSort(this._favoritesList, new Comparator());
/* 254 */       this._favoritesList = newFavsList;
/* 255 */       this._dirty = true;
/*     */     }
/*     */   }
/*     */ 
/*     */   public static class Comparator implements Sort.Comparator
/*     */   {
/*     */     FGApp _fgApp;
/*     */ 
/*     */     public Comparator() {
/* 265 */       this._fgApp = FGApp.getInstance();
/*     */     }
/*     */ 
/*     */     public int compare(Object o1, Object o2) {
/* 269 */       String jid1 = (String)o1;
/* 270 */       String jid2 = (String)o2;
/*     */ 
/* 272 */       if ((jid1 == null) && (jid2 != null))
/* 273 */         return 1;
/* 274 */       if ((jid2 == null) && (jid1 != null))
/* 275 */         return -1;
/* 276 */       if ((jid1 == null) && (jid2 == null)) {
/* 277 */         return 0;
/*     */       }
/*     */ 
/* 280 */       String name1 = this._fgApp.getDisplayableNameFromJid(jid1);
/* 281 */       String name2 = this._fgApp.getDisplayableNameFromJid(jid2);
/*     */ 
/* 283 */       return name1.toUpperCase().compareTo(name2.toUpperCase());
/*     */     }
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.api.contacts.Favorites
 * JD-Core Version:    0.6.0
 */