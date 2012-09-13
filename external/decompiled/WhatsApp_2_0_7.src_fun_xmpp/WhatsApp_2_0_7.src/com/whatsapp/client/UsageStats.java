/*     */ package com.whatsapp.client;
/*     */ 
/*     */ public class UsageStats
/*     */ {
/*     */   public static final int MEDIA = 0;
/*     */   public static final int MESSAGE_SERVICE = 1;
/*     */   public static final int COLD_SYNC = 2;
/*     */   public static final long LAST_RESET_NEVER = -9223372036854775808L;
/*     */   public static final long SAVE_INTERVAL = 1800000L;
/*  24 */   long rx_text_msgs = 0L;
/*  25 */   long tx_text_msgs = 0L;
/*  26 */   long rx_media_msgs = 0L;
/*  27 */   long tx_media_msgs = 0L;
/*     */ 
/*  29 */   long rx_offline_msgs = 0L;
/*  30 */   long rx_offline_delay = 0L;
/*     */ 
/*  32 */   long rx_media_bytes = 0L;
/*  33 */   long tx_media_bytes = 0L;
/*  34 */   long rx_message_service_bytes = 0L;
/*  35 */   long tx_message_service_bytes = 0L;
/*  36 */   long rx_cold_sync_bytes = 0L;
/*  37 */   long tx_cold_sync_bytes = 0L;
/*     */   final long last_reset;
/*     */   long last_save;
/*     */ 
/*     */   public UsageStats()
/*     */   {
/*  43 */     this(false);
/*     */   }
/*     */ 
/*     */   public UsageStats(boolean isReset) {
/*  47 */     if (isReset)
/*  48 */       this.last_reset = System.currentTimeMillis();
/*     */     else
/*  50 */       this.last_reset = -9223372036854775808L;
/*     */   }
/*     */ 
/*     */   public static void reset()
/*     */   {
/*  55 */     UsageStats newStats = new UsageStats(true);
/*  56 */     ChatState.getState()._usageStats = newStats;
/*     */   }
/*     */ 
/*     */   private void saveCheck()
/*     */   {
/*  62 */     if (System.currentTimeMillis() - this.last_save > 1800000L)
/*     */     {
/*  66 */       new Thread(new Runnable()
/*     */       {
/*     */         public void run()
/*     */         {
/*     */         }
/*     */       }).start();
/*     */     }
/*     */   }
/*     */ 
/*     */   public synchronized void recordMessageReceived(FunXMPP.FMessage message)
/*     */   {
/*  75 */     long delay = System.currentTimeMillis() - message.timestamp;
/*     */ 
/*  77 */     if (message.offline) {
/*  78 */       this.rx_offline_delay = ((this.rx_offline_delay * this.rx_offline_msgs + delay) / ++this.rx_offline_msgs);
/*     */     }
/*     */ 
/*  82 */     if (message.media_wa_type == 0)
/*  83 */       this.rx_text_msgs += 1L;
/*     */     else {
/*  85 */       this.rx_media_msgs += 1L;
/*     */     }
/*     */ 
/*  88 */     saveCheck();
/*     */   }
/*     */ 
/*     */   public synchronized void recordMessageSent(FunXMPP.FMessage message) {
/*  92 */     if (message.media_wa_type == 0)
/*  93 */       this.tx_text_msgs += 1L;
/*     */     else {
/*  95 */       this.tx_media_msgs += 1L;
/*     */     }
/*     */ 
/*  98 */     saveCheck();
/*     */   }
/*     */ 
/*     */   public synchronized void recordBytesReceived(long bytes, int category) {
/* 102 */     switch (category) {
/*     */     case 0:
/* 104 */       this.rx_media_bytes += bytes;
/* 105 */       break;
/*     */     case 2:
/* 107 */       this.rx_cold_sync_bytes += bytes;
/* 108 */       break;
/*     */     case 1:
/* 110 */       this.rx_message_service_bytes += bytes;
/*     */     }
/*     */   }
/*     */ 
/*     */   public synchronized void recordBytesSent(long bytes, int category)
/*     */   {
/* 116 */     switch (category) {
/*     */     case 0:
/* 118 */       this.tx_media_bytes += bytes;
/* 119 */       break;
/*     */     case 2:
/* 121 */       this.tx_cold_sync_bytes += bytes;
/* 122 */       break;
/*     */     case 1:
/* 124 */       this.tx_message_service_bytes += bytes;
/*     */     }
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.UsageStats
 * JD-Core Version:    0.6.0
 */