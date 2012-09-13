package com.whatsapp;

import android.os.AsyncTask;
import java.util.ArrayList;

final class t extends AsyncTask<ArrayList<zq>, Void, Void>
{
  protected Void a(ArrayList<zq>[] paramArrayOfArrayList)
  {
    App.w.b(paramArrayOfArrayList[0], null);
    return null;
  }

  protected void a(Void paramVoid)
  {
    App.m();
  }
}