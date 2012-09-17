/*    */ package com.whatsapp.client;
/*    */ 
/*    */ import com.whatsapp.api.ui.ListField.Item;
/*    */ import com.whatsapp.api.ui.TextUtils;
/*    */ import com.whatsapp.api.util.Utilities;
/*    */ import javax.microedition.lcdui.Font;
/*    */ import javax.microedition.lcdui.Graphics;
/*    */ import javax.microedition.lcdui.Image;
/*    */ 
/*    */ public class ContactListItem
/*    */   implements ListField.Item
/*    */ {
/*    */   protected static final int ROW_HEIGHT = 44;
/* 23 */   public static final Image defaultContactImg = initImageFromResource(Constants.IMAGE_ICON_DEFAULT_CONTACT);
/* 24 */   public static final Image defaultGroupImg = initImageFromResource(Constants.IMAGE_ICON_GROUP_CONTACT);
/*    */   public String _name;
/*    */   public String _status;
/*    */   public String _catLabel;
/*    */   public ChatHistory _hist;
/*    */ 
/*    */   private static Image initImageFromResource(String name)
/*    */   {
/*    */     Image res;
/*    */     try
/*    */     {
/* 34 */       res = Image.createImage(name);
/*    */     } catch (Exception x) {
/* 36 */       Utilities.logData("failure initializing image: " + name);
/* 37 */       res = Image.createImage(44, 44);
/*    */     }
/* 39 */     return res;
/*    */   }
/*    */ 
/*    */   public ContactListItem(String name, String status, String catLabel) {
/* 43 */     this._name = name;
/* 44 */     this._status = status;
/* 45 */     this._catLabel = catLabel;
/*    */   }
/*    */ 
/*    */   public void paintListRow(Graphics g, int x, int y, int width, int height, boolean focused) {
/* 49 */     g.setClip(x, y, width, 44);
/*    */     int foregroundCol;
/* 51 */     if (focused) {
/* 52 */       int foregroundCol = 16777215;
/* 53 */       TabState.paintFocusedBackground(g, x, y, width, 44);
/*    */     } else {
/* 55 */       foregroundCol = 0;
/*    */     }
/*    */ 
/* 58 */     g.setClip(x, y, 44, 44);
/* 59 */     g.drawImage(defaultContactImg, x, y, 20);
/*    */ 
/* 61 */     g.setFont(ChatsListItem.normalFont);
/* 62 */     g.setClip(x, y, width, height);
/* 63 */     int labelWidth = 2;
/* 64 */     if (this._catLabel != null) {
/* 65 */       if (!focused)
/* 66 */         g.setColor(6591981);
/*    */       else {
/* 68 */         g.setColor(foregroundCol);
/*    */       }
/* 70 */       labelWidth = g.getFont().stringWidth(this._catLabel) + 2;
/* 71 */       g.drawString(this._catLabel, x + width - labelWidth, y, 20);
/*    */     }
/*    */ 
/* 74 */     int availWidth = width - (44 + labelWidth + 5);
/* 75 */     g.setClip(x, y, width - (labelWidth + 5), height);
/* 76 */     g.setColor(foregroundCol);
/* 77 */     TextUtils.drawStringElided(g, this._name, x + 44, y, availWidth);
/*    */ 
/* 79 */     g.setClip(x, y, width - 1, height);
/* 80 */     if (this._status != null) {
/* 81 */       if (!focused) {
/* 82 */         g.setColor(5066061);
/*    */       }
/* 84 */       availWidth = width - 45;
/* 85 */       TextUtils.drawStringElided(g, this._status, x + 44, y + 22, availWidth);
/*    */     }
/*    */ 
/* 88 */     g.setClip(x, y, width, height);
/* 89 */     g.setColor(8421504);
/* 90 */     g.drawLine(x, y + 44 - 1, x + width, y + 44 - 1);
/*    */   }
/*    */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.ContactListItem
 * JD-Core Version:    0.6.0
 */