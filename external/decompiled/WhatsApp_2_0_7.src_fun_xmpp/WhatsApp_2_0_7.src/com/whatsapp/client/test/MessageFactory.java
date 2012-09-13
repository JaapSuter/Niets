/*    */ package com.whatsapp.client.test;
/*    */ 
/*    */ import com.whatsapp.client.FunXMPP.FMessage;
/*    */ import com.whatsapp.client.FunXMPP.FMessage.Key;
/*    */ import java.util.Random;
/*    */ import java.util.Vector;
/*    */ 
/*    */ public class MessageFactory
/*    */ {
/*    */   private static final String TEXT_SRC = "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum";
/*    */ 
/*    */   public static Vector getMessages(int n)
/*    */   {
/* 23 */     Vector v = new Vector(n);
/* 24 */     Random rnd = new Random();
/*    */ 
/* 27 */     String randomJid = getRandomJid();
/*    */ 
/* 29 */     for (int i = 0; i < n; i++) {
/* 30 */       int startIndex = rnd.nextInt("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum".length() - 45);
/* 31 */       int endIndex = startIndex + (rnd.nextInt(40) + 3);
/*    */ 
/* 36 */       String useText = "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum".substring(startIndex, endIndex);
/*    */ 
/* 38 */       FunXMPP.FMessage.Key useKey = new FunXMPP.FMessage.Key(randomJid, endIndex % 2 == 0, "id-" + i);
/*    */ 
/* 40 */       FunXMPP.FMessage useMsg = new FunXMPP.FMessage(useKey);
/* 41 */       useMsg.data = useText;
/*    */ 
/* 43 */       if (useMsg.key.from_me) {
/* 44 */         if (endIndex % 3 == 1)
/* 45 */           useMsg.status = 4;
/* 46 */         else if (endIndex % 3 == 2) {
/* 47 */           useMsg.status = 5;
/*    */         }
/*    */       }
/* 50 */       useMsg.timestamp = System.currentTimeMillis();
/* 51 */       v.addElement(useMsg);
/*    */     }
/* 53 */     return v;
/*    */   }
/*    */ 
/*    */   public static String getRandomJid()
/*    */   {
/* 58 */     Random rnd = new Random();
/* 59 */     StringBuffer res = new StringBuffer("1");
/*    */ 
/* 62 */     for (int i = 0; i < 3; i++) {
/* 63 */       res.append(rnd.nextInt(10));
/*    */     }
/* 65 */     res.append("555");
/* 66 */     for (i = 0; i < 4; i++) {
/* 67 */       res.append(rnd.nextInt(10));
/*    */     }
/* 69 */     res.append("@s.whatsapp.net");
/*    */ 
/* 71 */     return res.toString();
/*    */   }
/*    */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.test.MessageFactory
 * JD-Core Version:    0.6.0
 */