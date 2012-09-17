package com.whatsapp.accountsync;

import android.accounts.Account;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.SyncResult;
import android.os.Bundle;

class b extends AbstractThreadedSyncAdapter
{
  private Context a;

  public b(Context paramContext)
  {
    super(paramContext, true);
    this.a = paramContext;
  }

  static Context a(b paramb)
  {
    return paramb.a;
  }

  public void onPerformSync(Account paramAccount, Bundle paramBundle, String paramString, ContentProviderClient paramContentProviderClient, SyncResult paramSyncResult)
  {
    f localf = new f(this);
    localf.setPriority(1);
    localf.start();
  }
}