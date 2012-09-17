package com.whatsapp;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;

public class a extends Dialog
{
  static int d;
  private static final String[] z;
  Activity a;
  Context b;
  private int c;
  StringBuffer e = new StringBuffer();
  int f = 0;
  List<Pair<ResolveInfo, Intent>> g;
  int h = -1;

  static
  {
    String[] arrayOfString = new String[3];
    char[] arrayOfChar1 = ">?Yi@0 ZoZ;&HfG8`Ge\\r)FF;`GkE:o".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = ">?Yi@0 ZoZ;&HfG8`Ge\\r)FF;`[o[0:[iM".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "3.Pe]+\020@dN3.]oZ".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label293;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        z = arrayOfString;
        d = 0;
      }
    }
    else
    {
      int k = arrayOfChar1[j];
      int m;
      switch (j % 5)
      {
      default:
        m = 40;
      case 0:
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        arrayOfChar1[j] = (char)(m ^ k);
        j++;
        break;
        m = 95;
        continue;
        m = 79;
        continue;
        m = 41;
        continue;
        m = 10;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 40;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar2[i1] = (char)(i3 ^ i2);
      i1++;
      break;
      i3 = 95;
      continue;
      i3 = 79;
      continue;
      i3 = 41;
      continue;
      i3 = 10;
    }
    label293: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 40;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar3[i5] = (char)(i7 ^ i6);
      i5++;
      break;
      i7 = 95;
      continue;
      i7 = 79;
      continue;
      i7 = 41;
      continue;
      i7 = 10;
    }
  }

  public a(Activity paramActivity, int paramInt, List<Pair<ResolveInfo, Intent>> paramList)
  {
    super(paramActivity);
    this.a = paramActivity;
    this.b = paramActivity.getBaseContext();
    this.c = paramInt;
    this.g = paramList;
  }

  public a(Activity paramActivity, int paramInt1, List<Pair<ResolveInfo, Intent>> paramList, int paramInt2)
  {
    super(paramActivity);
    this.a = paramActivity;
    this.b = paramActivity.getBaseContext();
    this.c = paramInt1;
    this.g = paramList;
    this.h = paramInt2;
  }

  public static void a(Intent paramIntent, List<Intent> paramList)
  {
    boolean bool = DialogToastListActivity.f;
    List localList = App.hb.queryIntentActivities(paramIntent, 0);
    if ((localList == null) || (localList.size() <= 1))
    {
      paramList.add(paramIntent);
      if (!bool);
    }
    else
    {
      Iterator localIterator = localList.iterator();
      do
      {
        if (!localIterator.hasNext())
          break;
        ResolveInfo localResolveInfo = (ResolveInfo)localIterator.next();
        Intent localIntent = (Intent)paramIntent.clone();
        localIntent.setClassName(localResolveInfo.activityInfo.packageName, localResolveInfo.activityInfo.name);
        paramList.add(localIntent);
      }
      while (!bool);
    }
  }

  private void a(LinearLayout paramLinearLayout, LayoutInflater paramLayoutInflater, List<Pair<ResolveInfo, Intent>> paramList)
  {
    boolean bool = DialogToastListActivity.f;
    Iterator localIterator;
    if (paramList != null)
      localIterator = paramList.iterator();
    while (true)
    {
      ResolveInfo localResolveInfo;
      Intent localIntent;
      RelativeLayout localRelativeLayout;
      if (localIterator.hasNext())
      {
        Pair localPair = (Pair)localIterator.next();
        localResolveInfo = (ResolveInfo)localPair.first;
        localIntent = (Intent)localPair.second;
        localRelativeLayout = (RelativeLayout)paramLayoutInflater.inflate(2130903045, paramLinearLayout, false);
      }
      try
      {
        Resources localResources = App.hb.getResourcesForApplication(localResolveInfo.activityInfo.packageName);
        ((ImageView)localRelativeLayout.findViewById(2131558455)).setImageDrawable(localResources.getDrawable(localResolveInfo.activityInfo.applicationInfo.icon));
        ((TextView)localRelativeLayout.findViewById(2131558456)).setText(localResources.getString(localResolveInfo.activityInfo.applicationInfo.labelRes));
        localRelativeLayout.setOnClickListener(new gi(this, localIntent, localResolveInfo));
        paramLinearLayout.addView(localRelativeLayout);
        View localView = new View(this.a);
        localView.setLayoutParams(new LinearLayout.LayoutParams(-1, 1));
        localView.setBackgroundColor(-3355444);
        paramLinearLayout.addView(localView);
        if (bool)
          return;
      }
      catch (Resources.NotFoundException localNotFoundException)
      {
        g5.d(z[1] + localResolveInfo.activityInfo.packageName);
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        g5.d(z[0] + localResolveInfo.activityInfo.packageName);
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    setContentView(2130903044);
    ((TextView)findViewById(2131558453)).setText(this.c);
    setTitle(this.c);
    LinearLayout localLinearLayout = (LinearLayout)findViewById(2131558454);
    a(localLinearLayout, (LayoutInflater)App.Mb.getSystemService(z[2]), this.g);
    if (localLinearLayout.getChildCount() > 1)
      localLinearLayout.removeViewAt(-1 + localLinearLayout.getChildCount());
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.a
 * JD-Core Version:    0.6.1
 */