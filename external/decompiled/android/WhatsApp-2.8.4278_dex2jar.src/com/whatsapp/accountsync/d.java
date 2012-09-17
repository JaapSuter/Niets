package com.whatsapp.accountsync;

import android.os.AsyncTask;
import com.whatsapp.eu;

public class d extends AsyncTask<Void, Void, Void>
{
  final ProfileActivity a;

  public d(ProfileActivity paramProfileActivity)
  {
  }

  protected Void a(Void[] paramArrayOfVoid)
  {
    boolean bool = PerformSyncManager.b;
    int i = 0;
    do
      while (true)
      {
        if ((!eu.j) || (i >= 45000))
          break label44;
        i += 200;
        try
        {
          Thread.sleep(200L);
        }
        catch (InterruptedException localInterruptedException)
        {
          localInterruptedException.printStackTrace();
        }
      }
    while (!bool);
    label44: if (i >= 45000)
      if (eu.f)
      {
        eu.a(true);
        if (!bool);
      }
      else
      {
        eu.a(false);
      }
    return null;
  }

  protected void a(Void paramVoid)
  {
    this.a.removeDialog(104);
    ProfileActivity.a(this.a);
  }

  protected void onPreExecute()
  {
    if (!this.a.isFinishing())
      this.a.showDialog(104);
  }
}