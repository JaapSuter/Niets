package com.whatsapp;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.view.View;
import android.view.View.OnClickListener;

class gi
  implements View.OnClickListener
{
  final Intent a;
  final ResolveInfo b;
  final a c;

  gi(a parama, Intent paramIntent, ResolveInfo paramResolveInfo)
  {
  }

  public void onClick(View paramView)
  {
    Intent localIntent = this.a.setClassName(this.b.activityInfo.packageName, this.b.activityInfo.name);
    if (this.c.h > 0)
    {
      this.c.a.startActivityForResult(localIntent, this.c.h);
      if (!DialogToastListActivity.f);
    }
    else
    {
      this.c.a.startActivity(localIntent);
    }
    this.c.dismiss();
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.gi
 * JD-Core Version:    0.6.1
 */