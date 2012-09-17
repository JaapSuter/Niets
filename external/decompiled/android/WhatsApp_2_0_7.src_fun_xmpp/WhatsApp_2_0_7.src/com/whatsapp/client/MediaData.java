/*     */ package com.whatsapp.client;
/*     */ 
/*     */ import com.whatsapp.api.util.Utilities;
/*     */ import javax.microedition.lcdui.Image;
/*     */ 
/*     */ public class MediaData
/*     */ {
/*     */   public boolean downloading;
/*     */   public boolean downloaded;
/*     */   public FunXMPP.FMessage fmsg;
/*     */   public String filename;
/*     */   public String scaledFilename;
/*     */   public String mimeType;
/*     */   public Image thumbnail;
/*     */   public long filenameKey;
/*     */   public long scaledFilenameKey;
/*     */ 
/*     */   public MediaData(FunXMPP.FMessage wa_message, String filename)
/*     */   {
/*  29 */     this.fmsg = wa_message;
/*  30 */     setFilename(new String[] { filename, null });
/*  31 */     inflate();
/*     */   }
/*     */ 
/*     */   public MediaData(FunXMPP.FMessage wa_message, long key)
/*     */   {
/*  37 */     this.fmsg = wa_message;
/*  38 */     this.filenameKey = key;
/*     */   }
/*     */ 
/*     */   public MediaData(FunXMPP.FMessage wa_message)
/*     */   {
/*  44 */     this.fmsg = wa_message;
/*  45 */     this.filenameKey = -1L;
/*     */   }
/*     */ 
/*     */   public void setFilename(String[] newFilenames) {
/*  49 */     this.downloaded = true;
/*  50 */     this.downloading = false;
/*  51 */     this.filename = newFilenames[0];
/*  52 */     this.mimeType = getMimeType(getExt(this.filename));
/*  53 */     this.scaledFilename = newFilenames[1];
/*  54 */     Utilities.logData("set a filename pair in md: " + this.filename + ";" + this.scaledFilename);
/*     */   }
/*     */ 
/*     */   public void inflate()
/*     */   {
/*  61 */     if (this.filenameKey >= 0L) {
/*  62 */       String[] myFiles = MessageStoreProvider.getMessageStore().getMMSFilenames(this.filenameKey);
/*  63 */       setFilename(myFiles);
/*  64 */     } else if ((this.fmsg.status & 0x100) > 0) {
/*  65 */       this.downloading = true;
/*     */     }
/*     */ 
/*  71 */     this.fmsg.acceptVisitor(new FunXMPP.FMessageVisitor() {
/*     */       public void audio(FunXMPP.FMessage fMessage) {
/*  73 */         String iconFilename = MediaData.this.fmsg.key.from_me ? Constants.IMAGE_ICON_AUDIO_OUT_THUMB : Constants.IMAGE_ICON_AUDIO_IN_THUMB;
/*     */         try
/*     */         {
/*  77 */           MediaData.this.thumbnail = Image.createImage(iconFilename);
/*     */         } catch (Exception x) {
/*  79 */           MediaData.this.thumbnail = Image.createImage(80, 80);
/*     */         }
/*     */       }
/*     */ 
/*     */       public void contact(FunXMPP.FMessage fMessage) {
/*  83 */         MediaData.this.downloaded = true;
/*     */         try {
/*  85 */           MediaData.this.thumbnail = Image.createImage(Constants.IMAGE_ICON_VCARD_THUMB);
/*     */         } catch (Exception x) {
/*  87 */           MediaData.this.thumbnail = Image.createImage(80, 80);
/*     */         }
/*     */       }
/*     */ 
/*     */       public void image(FunXMPP.FMessage fMessage) {
/*  91 */         if ((fMessage.data != null) && (fMessage.data.length() > 0)) {
/*  92 */           MediaData.this.thumbnail = ImageDisplay.getImageFromThumb(fMessage);
/*     */         }
/*     */ 
/*  96 */         if (MediaData.this.thumbnail == null)
/*  97 */           MediaData.this.thumbnail = Image.createImage(100, 100);
/*     */       }
/*     */ 
/*     */       public void location(FunXMPP.FMessage fMessage) {
/* 101 */         MediaData.this.downloaded = true;
/* 102 */         if ((fMessage.data != null) && (fMessage.data.length() > 0)) {
/* 103 */           MediaData.this.thumbnail = ImageDisplay.getImageFromThumb(fMessage);
/*     */         }
/* 105 */         if (MediaData.this.thumbnail == null)
/*     */           try {
/* 107 */             MediaData.this.thumbnail = Image.createImage(Constants.IMAGE_ICON_MAP_THUMB);
/*     */           } catch (Exception x) {
/* 109 */             MediaData.this.thumbnail = Image.createImage(80, 80);
/*     */           }
/*     */       }
/*     */ 
/*     */       public void undefined(FunXMPP.FMessage fMessage)
/*     */       {
/*     */       }
/*     */ 
/*     */       public void system(FunXMPP.FMessage fMessage) {
/*     */       }
/*     */ 
/*     */       public void video(FunXMPP.FMessage fMessage) {
/* 121 */         if ((fMessage.data != null) && (fMessage.data.length() > 0)) {
/* 122 */           MediaData.this.thumbnail = ImageDisplay.getImageFromThumb(fMessage);
/*     */         }
/* 124 */         if (MediaData.this.thumbnail == null)
/*     */           try {
/* 126 */             MediaData.this.thumbnail = Image.createImage(Constants.IMAGE_ICON_VIDEO_THUMB);
/*     */           } catch (Exception x) {
/* 128 */             MediaData.this.thumbnail = Image.createImage(80, 80);
/*     */           }
/*     */       }
/*     */     });
/*     */   }
/*     */ 
/*     */   protected String getMimeType(String extension)
/*     */   {
/* 137 */     String lowerExt = extension.toLowerCase();
/* 138 */     if (lowerExt.equals(Constants.MEDIA_EXTENSION_JPG))
/* 139 */       return Constants.MEDIA_MIME_TYPE_JPEG;
/* 140 */     if (lowerExt.startsWith(Constants.MEDIA_EXTENSION_3GP)) {
/* 141 */       if (this.fmsg.media_wa_type == 2) {
/* 142 */         return Constants.MEDIA_MIME_TYPE_AUDIO_3GPP;
/*     */       }
/* 144 */       return Constants.MEDIA_MIME_TYPE_VIDEO_3GPP;
/*     */     }
/* 146 */     if (lowerExt.equals(Constants.MEDIA_EXTENSION_AMR))
/* 147 */       return Constants.MEDIA_MIME_TYPE_AMR;
/* 148 */     if (lowerExt.equals(Constants.MEDIA_EXTENSION_GIF))
/* 149 */       return Constants.MEDIA_MIME_TYPE_GIF;
/* 150 */     if (lowerExt.equals(Constants.MEDIA_EXTENSION_MP3))
/* 151 */       return Constants.MEDIA_MIME_TYPE_AUDIO_MPEG;
/* 152 */     if (lowerExt.equals(Constants.MEDIA_EXTENSION_MP4))
/* 153 */       return Constants.MEDIA_MIME_TYPE_MP4;
/* 154 */     if (lowerExt.equals(Constants.MEDIA_EXTENSION_PNG)) {
/* 155 */       return Constants.MEDIA_MIME_TYPE_PNG;
/*     */     }
/* 157 */     return Constants.MEDIA_MIME_TYPE_OCTET;
/*     */   }
/*     */ 
/*     */   protected static String getExt(String filename)
/*     */   {
/* 162 */     int lastDot = filename.lastIndexOf('.');
/*     */ 
/* 164 */     if (lastDot == -1) {
/* 165 */       return Constants.STRING_EMPTY_STRING;
/*     */     }
/*     */ 
/* 168 */     return filename.substring(lastDot + 1);
/*     */   }
/*     */ 
/*     */   public static String rewriteDownloadURL(FunXMPP.FMessage fmsg)
/*     */   {
/* 173 */     if ((fmsg == null) || (fmsg.media_url == null)) {
/* 174 */       return null;
/*     */     }
/*     */ 
/* 177 */     String url = fmsg.media_url;
/*     */ 
/* 179 */     if (url.endsWith(Constants.MEDIA_EXTENSION_CAF)) {
/* 180 */       int spos = url.indexOf("whatsapp.net/");
/* 181 */       String result = url.substring(0, spos + 13) + "a.php?i=" + url.substring(spos + 12, url.length() - 3) + Constants.MEDIA_EXTENSION_MP3;
/*     */ 
/* 184 */       return result;
/* 185 */     }if ((fmsg.media_wa_type == 3) && ((url.toLowerCase().endsWith(Constants.MEDIA_EXTENSION_MOV)) || (url.toLowerCase().endsWith(Constants.MEDIA_EXTENSION_3GP))))
/*     */     {
/* 188 */       int spos = url.indexOf("whatsapp.net/");
/* 189 */       String result = url.substring(0, spos + 13) + "v.php?i=" + url.substring(spos + 12, url.length() - 3) + Constants.MEDIA_EXTENSION_MP4;
/*     */ 
/* 192 */       return result;
/*     */     }
/* 194 */     return url;
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.MediaData
 * JD-Core Version:    0.6.0
 */