/*     */ package com.whatsapp.api.sapi;
/*     */ 
/*     */ import com.nokia.mid.s40.codec.DataDecoder;
/*     */ import com.nokia.mid.s40.codec.DataEncoder;
/*     */ import com.nokia.mid.s40.io.LocalMessageProtocolConnection;
/*     */ import com.whatsapp.api.util.Utilities;
/*     */ import java.io.IOException;
/*     */ import javax.microedition.io.Connector;
/*     */ 
/*     */ public class NMS
/*     */   implements LocalSAPIMessageListener
/*     */ {
/*     */   private LocalMessageProtocolConnection nmsConnection;
/*  30 */   private String VERSION = "1.[0-10]";
/*     */ 
/*  35 */   private String serverURL = "localmsg://nokia_email";
/*     */ 
/*  41 */   private int byteSize = 500;
/*     */   private SAPIClient client;
/*     */   NMSListener listener;
/*     */ 
/*     */   public NMS(NMSListener listr)
/*     */   {
/*  62 */     this.listener = listr;
/*     */   }
/*     */ 
/*     */   public void connect()
/*     */     throws IOException
/*     */   {
/*  71 */     this.nmsConnection = ((LocalMessageProtocolConnection)Connector.open(this.serverURL));
/*  72 */     this.client = new SAPIClient(this.nmsConnection, this, this.VERSION, this.byteSize);
/*     */   }
/*     */ 
/*     */   public void closeConnection()
/*     */   {
/*  79 */     if (this.client != null)
/*  80 */       this.client.close();
/*     */   }
/*     */ 
/*     */   private short composeEmail()
/*     */   {
/*  85 */     short transid = (short)(int)System.currentTimeMillis();
/*  86 */     if (this.client != null) {
/*     */       try
/*     */       {
/*  89 */         byte[] data_out = null;
/*     */ 
/*  91 */         DataEncoder encoder = new DataEncoder("Conv-BEB");
/*  92 */         encoder.putStart(14, "event");
/*     */ 
/*  94 */         encoder.put(13, "name", "LaunchEmail");
/*  95 */         encoder.put(2, "trans_id", 5L);
/*  96 */         encoder.put(10, "launch_cookie", "");
/*     */ 
/*  98 */         encoder.putEnd(14, "event");
/*     */ 
/* 100 */         data_out = encoder.getData();
/* 101 */         if (data_out != null) {
/* 102 */           this.client.sendData(data_out);
/*     */         }
/* 104 */         data_out = null;
/* 105 */         encoder = null;
/*     */       } catch (IOException ex) {
/* 107 */         ex.printStackTrace();
/*     */       }
/*     */     }
/*     */ 
/* 111 */     return transid;
/*     */   }
/*     */ 
/*     */   public short composeEmail(String to, String subject, String body, String[] attachmentPaths, String[] attachmentTypes, int numAttachments)
/*     */   {
/* 116 */     short transid = (short)(int)System.currentTimeMillis();
/* 117 */     if (this.client != null) {
/*     */       try
/*     */       {
/* 120 */         byte[] data_out = null;
/*     */ 
/* 122 */         DataEncoder encoder = new DataEncoder("Conv-BEB");
/* 123 */         encoder.putStart(14, "event");
/*     */ 
/* 125 */         encoder.put(13, "name", "SendEmail");
/* 126 */         encoder.put(2, "trans_id", 5L);
/* 127 */         encoder.putStart(15, "email_info");
/*     */ 
/* 129 */         encoder.put(10, "send_type", "New");
/* 130 */         encoder.put(11, "to_addresses", to);
/* 131 */         encoder.put(11, "subject", subject);
/* 132 */         encoder.put(11, "body", body);
/*     */ 
/* 134 */         encoder.put(10, "interaction_type", "ShowComposer");
/*     */ 
/* 137 */         if ((attachmentPaths != null) && (numAttachments > 0)) {
/* 138 */           encoder.putStart(16, "attachment_paths");
/* 139 */           for (int i = 0; i < numAttachments; i++)
/*     */           {
/* 141 */             encoder.putStart(14, "path_info");
/* 142 */             encoder.put(11, "attachment_path", attachmentPaths[i]);
/* 143 */             encoder.put(10, "attachment_type", attachmentTypes[i]);
/*     */ 
/* 145 */             encoder.putEnd(14, "path_info");
/*     */ 
/* 147 */             Utilities.logData("NMS attached file " + attachmentPaths[i]);
/*     */           }
/* 149 */           encoder.putEnd(16, "attachment_paths");
/*     */         }
/*     */ 
/* 153 */         encoder.putEnd(15, "email_info");
/* 154 */         encoder.putEnd(14, "event");
/*     */ 
/* 156 */         data_out = encoder.getData();
/* 157 */         if (data_out != null) {
/* 158 */           this.client.sendData(data_out);
/*     */         }
/* 160 */         data_out = null;
/* 161 */         encoder = null;
/*     */       } catch (IOException ex) {
/* 163 */         ex.printStackTrace();
/*     */       }
/*     */     }
/*     */ 
/* 167 */     return transid;
/*     */   }
/*     */ 
/*     */   public void decodeComposeEmailResponse(DataDecoder decoder) throws IOException
/*     */   {
/* 172 */     short transid = (short)(int)decoder.getInteger(5);
/* 173 */     String status = decoder.getString(10);
/*     */ 
/* 175 */     if (!status.equals("Ok"))
/* 176 */       this.listener.composeEmailFailed(transid, status);
/*     */   }
/*     */ 
/*     */   public void decodeEmailNotifyMessage(DataDecoder decoder)
/*     */     throws IOException
/*     */   {
/* 182 */     String status = decoder.getString(10);
/* 183 */     String exitCode = decoder.getString(10);
/* 184 */     this.listener.composerClosed(exitCode);
/*     */   }
/*     */ 
/*     */   public void localSAPIMessageReceived(String method, DataDecoder decoder)
/*     */   {
/* 192 */     Utilities.logData("NMS method: " + method);
/* 193 */     String lowerMethod = method.toLowerCase();
/* 194 */     if ((lowerMethod.equals("launchemail")) || (lowerMethod.equals("sendemail")))
/*     */       try {
/* 196 */         decodeComposeEmailResponse(decoder);
/*     */       } catch (IOException ex) {
/* 198 */         ex.printStackTrace();
/*     */       }
/* 200 */     else if (lowerMethod.equals("sendemailnotify"))
/*     */       try {
/* 202 */         decodeEmailNotifyMessage(decoder);
/*     */       } catch (Throwable t) {
/* 204 */         Utilities.logData("blew up decoding sendemailnotify: " + t.toString());
/*     */       }
/*     */     else
/* 207 */       Utilities.logData("unhandled method in NMS: " + lowerMethod);
/*     */   }
/*     */ 
/*     */   public void SAPIconnectionClosed(int reason)
/*     */   {
/* 212 */     this.listener.NMSServerClosed(reason);
/*     */   }
/*     */ 
/*     */   public void commonSAPIMessageReceived(String msg) {
/* 216 */     this.listener.NMSsystemMessageReceived(msg);
/*     */   }
/*     */ 
/*     */   public void SAPIready()
/*     */   {
/* 221 */     this.listener.NMSServerReady();
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.api.sapi.NMS
 * JD-Core Version:    0.6.0
 */