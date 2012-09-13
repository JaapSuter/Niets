/*     */ package com.whatsapp.api.util;
/*     */ 
/*     */ import java.util.Calendar;
/*     */ import java.util.Date;
/*     */ 
/*     */ public class DateTimeUtilities
/*     */ {
/*     */   public static final int ONESECOND = 1000;
/*     */   public static final long ONEMINUTE = 60000L;
/*     */   public static final long ONEHOUR = 3600000L;
/*     */   public static final long ONEDAY = 86400000L;
/*     */   public static final long ONEWEEK = 604800000L;
/*     */   public static final long ONEYEAR = 31536000000L;
/*  34 */   static final String[] ENGLISH_MONTH_LABELS = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
/*     */ 
/*  38 */   static final String[] ENGLISH_WEEKDAYS = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
/*     */ 
/*     */   public static boolean isSameDate(long d1, long d2)
/*     */   {
/*  23 */     Calendar c1 = Calendar.getInstance();
/*  24 */     Calendar c2 = Calendar.getInstance();
/*     */ 
/*  26 */     c1.setTime(new Date(d1));
/*  27 */     c2.setTime(new Date(d2));
/*     */ 
/*  29 */     return (c1.get(1) == c2.get(1)) && (c1.get(2) == c2.get(2)) && (c1.get(5) == c2.get(5));
/*     */   }
/*     */ 
/*     */   public static String dayOfYear(long time)
/*     */   {
/*  44 */     Calendar cal = Calendar.getInstance();
/*  45 */     cal.setTime(new Date(time));
/*     */ 
/*  47 */     String day = ENGLISH_MONTH_LABELS[cal.get(2)] + " " + cal.get(5) + " ";
/*     */ 
/*  49 */     int year = cal.get(1) % 100;
/*  50 */     if (year == 0)
/*  51 */       return day + "00";
/*  52 */     if (year < 10) {
/*  53 */       return day + "0" + year;
/*     */     }
/*  55 */     return day + year;
/*     */   }
/*     */ 
/*     */   public static String simpleDayFormat(long time)
/*     */   {
/*  61 */     Calendar cal = Calendar.getInstance();
/*  62 */     cal.setTime(new Date(time));
/*     */ 
/*  64 */     return ENGLISH_MONTH_LABELS[cal.get(2)] + " " + cal.get(5);
/*     */   }
/*     */ 
/*     */   public static String shortTimeFormat(long time)
/*     */   {
/*  70 */     Calendar cal = Calendar.getInstance();
/*  71 */     cal.setTime(new Date(time));
/*     */ 
/*  73 */     int rawMinute = cal.get(12);
/*  74 */     String fillerZero = rawMinute < 10 ? "0" : "";
/*  75 */     int rawHour = cal.get(11);
/*  76 */     String fillerHourZero = rawHour == 0 ? "0" : "";
/*  77 */     return fillerHourZero + rawHour + ":" + fillerZero + rawMinute;
/*     */   }
/*     */ 
/*     */   public static String logTimeFormat(long time) {
/*  81 */     Calendar cal = Calendar.getInstance();
/*  82 */     cal.setTime(new Date(time));
/*     */ 
/*  84 */     int rawMonth = cal.get(2) + 1;
/*  85 */     int rawDay = cal.get(5);
/*  86 */     int rawHour = cal.get(11);
/*  87 */     String fillerHourZero = rawHour == 0 ? "0" : "";
/*  88 */     int rawMinute = cal.get(12);
/*  89 */     String fillerMinZero = rawMinute < 10 ? "0" : "";
/*  90 */     int rawSecond = cal.get(13);
/*  91 */     String fillerSecZero = rawSecond < 10 ? "0" : "";
/*  92 */     int rawMillis = cal.get(14);
/*     */     String fillerMillisZeros;
/*     */     String fillerMillisZeros;
/*  94 */     if (rawMillis < 10) {
/*  95 */       fillerMillisZeros = "00";
/*     */     }
/*     */     else
/*     */     {
/*     */       String fillerMillisZeros;
/*  96 */       if (rawMillis < 100)
/*  97 */         fillerMillisZeros = "0";
/*     */       else
/*  99 */         fillerMillisZeros = "";
/*     */     }
/* 101 */     return rawMonth + "/" + rawDay + " " + fillerHourZero + rawHour + ":" + fillerMinZero + rawMinute + ":" + fillerSecZero + rawSecond + "." + fillerMillisZeros + rawMillis;
/*     */   }
/*     */ 
/*     */   public static String weekdayTimeFormat(long time)
/*     */   {
/* 107 */     Calendar cal = Calendar.getInstance();
/* 108 */     cal.setTime(new Date(time));
/*     */ 
/* 110 */     int rawDay = cal.get(7);
/* 111 */     return ENGLISH_WEEKDAYS[(rawDay - 1)];
/*     */   }
/*     */ 
/*     */   public static String readableElapsedTime(long millis)
/*     */   {
/* 116 */     StringBuffer working = new StringBuffer();
/* 117 */     if (millis > 3600000L) {
/* 118 */       long hours = millis / 3600000L;
/* 119 */       working.append(hours);
/* 120 */       working.append(":");
/* 121 */       millis %= 3600000L;
/*     */     }
/* 123 */     if (millis > 60000L) {
/* 124 */       long minutes = millis / 60000L;
/* 125 */       working.append(minutes);
/* 126 */       millis %= 60000L;
/*     */     }
/* 128 */     working.append(":");
/* 129 */     if (millis > 1000L) {
/* 130 */       long seconds = millis / 1000L;
/* 131 */       if (seconds < 10L) {
/* 132 */         working.append("0");
/*     */       }
/* 134 */       working.append(seconds);
/*     */     } else {
/* 136 */       working.append("00");
/*     */     }
/* 138 */     return working.toString();
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.api.util.DateTimeUtilities
 * JD-Core Version:    0.6.0
 */