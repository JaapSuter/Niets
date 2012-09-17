package com.whatsapp;

import android.os.AsyncTask;

public class ib extends AsyncTask<String, Void, Integer>
{
  String a;
  String b;
  final DescribeProblemActivity c;

  protected ib(DescribeProblemActivity paramDescribeProblemActivity, String paramString1, String paramString2)
  {
    this.a = paramString1;
    this.b = paramString2;
  }

  protected Integer a(String[] paramArrayOfString)
  {
    g5.b();
    g5.c();
    return Integer.valueOf(1);
  }

  protected void a(Integer paramInteger)
  {
    this.c.removeDialog(1);
    ds.a(this.c, this.a, this.b, DescribeProblemActivity.d(this.c));
  }

  protected void onPreExecute()
  {
    this.c.showDialog(1);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.ib
 * JD-Core Version:    0.6.1
 */