/*    */ package com.whatsapp.api.util;
/*    */ 
/*    */ import java.util.Vector;
/*    */ 
/*    */ public class Sort
/*    */ {
/*    */   private static void qSortInplaceRec(Object[] arr, int low, int high, Comparator c)
/*    */   {
/* 16 */     int i = low; int j = high;
/*    */ 
/* 18 */     Object pivot = arr[(low + (high - low) / 2)];
/*    */ 
/* 21 */     while (i <= j)
/*    */     {
/* 24 */       while (c.compare(arr[i], pivot) < 0) {
/* 25 */         i++;
/*    */       }
/*    */ 
/* 29 */       while (c.compare(arr[j], pivot) > 0) {
/* 30 */         j--;
/*    */       }
/*    */ 
/* 37 */       if (i <= j) {
/* 38 */         exchange(arr, i, j);
/* 39 */         i++;
/* 40 */         j--;
/*    */       }
/*    */     }
/*    */ 
/* 44 */     if (low < j)
/* 45 */       qSortInplaceRec(arr, low, j, c);
/* 46 */     if (i < high)
/* 47 */       qSortInplaceRec(arr, i, high, c);
/*    */   }
/*    */ 
/*    */   private static void exchange(Object[] arr, int i, int j) {
/* 51 */     Object temp = arr[i];
/* 52 */     arr[i] = arr[j];
/* 53 */     arr[j] = temp;
/*    */   }
/*    */ 
/*    */   public static Vector quickSort(Vector v, Comparator c) {
/* 57 */     Object[] arr = new Object[v.size()];
/* 58 */     v.copyInto(arr);
/* 59 */     qSortInplaceRec(arr, 0, v.size() - 1, c);
/* 60 */     Vector ret = new Vector(v.size());
/* 61 */     for (int i = 0; i < v.size(); i++) {
/* 62 */       ret.addElement(arr[i]);
/*    */     }
/* 64 */     return ret;
/*    */   }
/*    */ 
/*    */   public static void insertionSortAdd(Vector v, Object newObj, Comparator comparator)
/*    */   {
/* 69 */     boolean placed = false;
/* 70 */     for (int i = 0; i < v.size(); i++) {
/* 71 */       Object existing = v.elementAt(i);
/* 72 */       if (comparator.compare(newObj, existing) < 0) {
/* 73 */         v.insertElementAt(newObj, i);
/* 74 */         placed = true;
/* 75 */         break;
/*    */       }
/*    */     }
/* 78 */     if (!placed)
/* 79 */       v.addElement(newObj);
/*    */   }
/*    */ 
/*    */   public static abstract interface Comparator
/*    */   {
/*    */     public abstract int compare(Object paramObject1, Object paramObject2);
/*    */   }
/*    */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.api.util.Sort
 * JD-Core Version:    0.6.0
 */