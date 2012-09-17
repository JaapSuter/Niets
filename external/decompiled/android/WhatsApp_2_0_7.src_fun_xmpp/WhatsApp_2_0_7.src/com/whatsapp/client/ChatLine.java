/*     */ package com.whatsapp.client;
/*     */ 
/*     */ import com.whatsapp.api.ui.CutoutFlowTextField;
/*     */ import com.whatsapp.api.ui.EmojiTextField;
/*     */ import com.whatsapp.api.ui.HorizontalFieldManager;
/*     */ import com.whatsapp.api.ui.ImageField;
/*     */ import com.whatsapp.api.ui.TimeBubbleField;
/*     */ import javax.microedition.lcdui.Font;
/*     */ import javax.microedition.lcdui.Image;
/*     */ 
/*     */ public class ChatLine extends HorizontalFieldManager
/*     */ {
/*     */   private MessageStatusIcon _icon;
/*     */   public FunXMPP.FMessage _fmsg;
/*     */   private ChatPane _parentScr;
/*     */   private String _origDesc;
/*     */   private EmojiTextField _descLabel;
/*     */   private TimeBubbleField _timeBubble;
/*     */ 
/*     */   private void addMMSElements(FunXMPP.FMessage fmsg, boolean showReadableType)
/*     */   {
/*  34 */     MediaData md = (MediaData)fmsg.thumb_image;
/*  35 */     if ((md != null) && (md.thumbnail != null)) {
/*  36 */       addImageField(md.thumbnail);
/*     */     }
/*  38 */     if (showReadableType) {
/*  39 */       String readableType = "[" + MediaDisplay.getLocalizedFMessageType(fmsg) + "]";
/*  40 */       addTextField(readableType);
/*     */     }
/*  42 */     addTimeBubble(fmsg);
/*     */   }
/*     */ 
/*     */   public ChatLine(FunXMPP.FMessage fmsg, ChatPane parentScr)
/*     */   {
/*  47 */     super(0L);
/*     */ 
/*  49 */     this._parentScr = parentScr;
/*  50 */     this._fmsg = fmsg;
/*     */ 
/*  53 */     if (fmsg.key.from_me) {
/*  54 */       this._icon = new MessageStatusIcon(fmsg, 0L);
/*  55 */       add(this._icon);
/*     */     }
/*     */ 
/*  59 */     fmsg.acceptVisitor(new FunXMPP.FMessageVisitor()
/*     */     {
/*     */       public void undefined(FunXMPP.FMessage fMessage)
/*     */       {
/*  63 */         ChatLine.this.addFlowTextField(fMessage);
/*     */       }
/*     */ 
/*     */       public void image(FunXMPP.FMessage fMessage) {
/*  67 */         ChatLine.this.addMMSElements(fMessage, true);
/*     */       }
/*     */ 
/*     */       public void audio(FunXMPP.FMessage fMessage) {
/*  71 */         ChatLine.this.addMMSElements(fMessage, true);
/*     */       }
/*     */ 
/*     */       public void video(FunXMPP.FMessage fMessage) {
/*  75 */         ChatLine.this.addMMSElements(fMessage, true);
/*     */       }
/*     */ 
/*     */       public void contact(FunXMPP.FMessage fMessage) {
/*  79 */         ChatLine.this.addMMSElements(fMessage, false);
/*     */       }
/*     */ 
/*     */       public void location(FunXMPP.FMessage fMessage) {
/*  83 */         ChatLine.this.addMMSElements(fMessage, false);
/*     */       }
/*     */ 
/*     */       public void system(FunXMPP.FMessage fMessage) {
/*  87 */         ChatLine.this.addTimeBubble(fMessage);
/*  88 */         ChatLine.this.addTextField(fMessage.data);
/*     */       } } );
/*     */   }
/*     */ 
/*     */   public boolean isGroupable(ChatLine other) {
/*  94 */     if ((this._fmsg.status == 6) || (other._fmsg.status == 6))
/*     */     {
/*  96 */       return false;
/*     */     }
/*     */ 
/*  99 */     if (this._fmsg.key.from_me != other._fmsg.key.from_me) {
/* 100 */       return false;
/*     */     }
/*     */ 
/* 103 */     if (!this._fmsg.key.remote_jid.equals(other._fmsg.key.remote_jid)) {
/* 104 */       return false;
/*     */     }
/*     */ 
/* 107 */     if ((this._fmsg.remote_resource != other._fmsg.remote_resource) && ((this._fmsg.remote_resource == null) || (!this._fmsg.remote_resource.equals(other._fmsg.remote_resource))))
/*     */     {
/* 110 */       return false;
/*     */     }
/*     */ 
/* 115 */     return (this._fmsg.media_wa_type == 0) && (other._fmsg.media_wa_type == 0);
/*     */   }
/*     */ 
/*     */   private void addTextField(String text)
/*     */   {
/* 123 */     this._descLabel = new EmojiTextField(text, ChatsListItem.smallFont) {
/*     */       public void layout(int width, int height) {
/* 125 */         super.layout(width - 100, height);
/*     */       }
/*     */     };
/* 128 */     add(this._descLabel);
/* 129 */     this._descLabel.setMargin(1, 1, 1, 1);
/* 130 */     this._origDesc = text;
/*     */   }
/*     */ 
/*     */   public void resetLabel() {
/* 134 */     this._descLabel.setText(this._origDesc);
/*     */   }
/*     */ 
/*     */   public void setLabel(String s) {
/* 138 */     this._descLabel.setText(s);
/*     */   }
/*     */ 
/*     */   private void addFlowTextField(FunXMPP.FMessage fmsg) {
/* 142 */     String useText = Constants.STRING_EMPTY_STRING;
/* 143 */     if (fmsg.data != null) {
/* 144 */       useText = fmsg.data;
/*     */     }
/* 146 */     if ((this._parentScr._isGroup) && (!fmsg.key.from_me))
/*     */     {
/* 148 */       EmojiTextField etF = new EmojiTextField(useText, ChatsListItem.smallFont);
/* 149 */       etF.setMargin(1, 1, 1, 1);
/* 150 */       add(etF);
/*     */     } else {
/* 152 */       CutoutFlowTextField textField = new CutoutFlowTextField(useText, ChatsListItem.smallFont, 40);
/*     */ 
/* 155 */       TimeBubbleField timeB = new TimeBubbleField(fmsg);
/* 156 */       timeB.setMargin(1, 1, 0, 1);
/* 157 */       textField.add(timeB);
/* 158 */       add(textField);
/* 159 */       textField.setMargin(1, 1, 1, 1);
/*     */     }
/*     */   }
/*     */ 
/*     */   private void addImageField(Image image) {
/* 164 */     ImageField imgField = new ImageField(image);
/* 165 */     add(imgField);
/* 166 */     imgField.setMargin(1, 1, 1, 1);
/*     */   }
/*     */ 
/*     */   private void addTimeBubble(FunXMPP.FMessage fmsg) {
/* 170 */     if ((!this._parentScr._isGroup) || (fmsg.key.from_me)) {
/* 171 */       this._timeBubble = new TimeBubbleField(fmsg);
/* 172 */       this._timeBubble.setMargin(1, 1, 1, 1);
/* 173 */       add(this._timeBubble);
/*     */     }
/*     */   }
/*     */ 
/*     */   public void sublayout(int width, int height) {
/* 178 */     super.sublayout(width, height);
/* 179 */     if (this._timeBubble != null) {
/* 180 */       if (getWidth() < width) {
/* 181 */         setExtent(width, getHeight());
/*     */       }
/* 183 */       this._timeBubble.setManagerPosition(getWidth() - (this._timeBubble.getWidth() + this._timeBubble.getMarginRight()), getHeight() - (this._timeBubble.getHeight() + this._timeBubble.getMarginBottom()));
/*     */     }
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.ChatLine
 * JD-Core Version:    0.6.0
 */