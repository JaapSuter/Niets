package com.whatsapp;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.NoSuchElementException;

public class BlockList extends DialogToastListActivity
  implements k2
{
  private static final String[] z;
  ArrayList<zq> g = new ArrayList();
  public boolean h = false;
  private pj i = new pj();
  ce j;

  static
  {
    String[] arrayOfString = new String[2];
    char[] arrayOfChar1 = "G\",\023\004O(f\b\005R)&\025EG/<\b\004Hb\030((m".toCharArray();
    int k = arrayOfChar1.length;
    int m = 0;
    char[] arrayOfChar2;
    int i3;
    if (k <= m)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "E#%O\034N-<\022\nV<".toCharArray();
      int i2 = arrayOfChar2.length;
      i3 = 0;
      if (i2 <= i3)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        z = arrayOfString;
      }
    }
    else
    {
      int n = arrayOfChar1[m];
      int i1;
      switch (m % 5)
      {
      default:
        i1 = 107;
      case 0:
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        arrayOfChar1[m] = (char)(i1 ^ n);
        m++;
        break;
        i1 = 38;
        continue;
        i1 = 76;
        continue;
        i1 = 72;
        continue;
        i1 = 97;
      }
    }
    int i4 = arrayOfChar2[i3];
    int i5;
    switch (i3 % 5)
    {
    default:
      i5 = 107;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar2[i3] = (char)(i5 ^ i4);
      i3++;
      break;
      i5 = 38;
      continue;
      i5 = 76;
      continue;
      i5 = 72;
      continue;
      i5 = 97;
    }
  }

  static pj a(BlockList paramBlockList)
  {
    return paramBlockList.i;
  }

  private void a()
  {
    boolean bool = DialogToastListActivity.f;
    this.g.clear();
    Enumeration localEnumeration = App.yb.keys();
    do
      while (true)
      {
        if (!localEnumeration.hasMoreElements())
          break label93;
        try
        {
          String str = (String)localEnumeration.nextElement();
          zq localzq = App.w.a(str, null);
          if (localzq != null)
          {
            this.g.add(localzq);
            if (!bool);
          }
          else
          {
            this.g.add(new zq(str));
          }
        }
        catch (NoSuchElementException localNoSuchElementException)
        {
        }
      }
    while (!bool);
    label93: Collections.sort(this.g, new ej());
  }

  private void b()
  {
    a();
    this.j.notifyDataSetChanged();
  }

  public void a(j2 paramj2)
  {
    if (paramj2.j)
    {
      b();
      if (!DialogToastListActivity.f);
    }
    else
    {
      showDialog(108);
    }
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((paramInt2 == -1) && (paramInt1 == 3))
      if (!App.sb())
      {
        App.a(getBaseContext(), 2131296525, 0);
        if (!DialogToastListActivity.f);
      }
      else
      {
        showDialog(107);
        this.h = true;
        new o8(this, paramIntent).start();
      }
  }

  public boolean onContextItemSelected(MenuItem paramMenuItem)
  {
    AdapterView.AdapterContextMenuInfo localAdapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo)paramMenuItem.getMenuInfo();
    zq localzq = (zq)getListView().getItemAtPosition(localAdapterContextMenuInfo.position);
    switch (paramMenuItem.getItemId())
    {
    default:
    case 0:
    }
    for (boolean bool = super.onContextItemSelected(paramMenuItem); ; bool = true)
    {
      return bool;
      if (!App.sb())
      {
        App.a(getBaseContext(), 2131296525, 0);
        if (!DialogToastListActivity.f);
      }
      else
      {
        showDialog(107);
        this.h = false;
        new n8(this, localzq).start();
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903047);
    a();
    this.j = new ce(this, this, 2130903060, this.g);
    setListAdapter(this.j);
    getListView().setEmptyView(findViewById(2131558463));
    findViewById(2131558462).setOnClickListener(new hi(this));
    registerForContextMenu(getListView());
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AdapterView.AdapterContextMenuInfo localAdapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
    zq localzq = (zq)getListView().getItemAtPosition(localAdapterContextMenuInfo.position);
    super.onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
    String str = getString(2131296809);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = localzq.b();
    paramContextMenu.add(0, 0, 0, String.format(str, arrayOfObject));
  }

  public Dialog onCreateDialog(int paramInt)
  {
    Object localObject;
    switch (paramInt)
    {
    default:
      localObject = null;
    case 107:
      while (true)
      {
        return localObject;
        localObject = new ProgressDialog(this);
        ((ProgressDialog)localObject).setMessage(getString(2131296394));
        ((ProgressDialog)localObject).setIndeterminate(true);
        ((ProgressDialog)localObject).setCancelable(false);
      }
    case 108:
    }
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
    if (this.h);
    for (int k = 2131296942; ; k = 2131296943)
    {
      localObject = localBuilder.setMessage(k).setNeutralButton(2131296270, new ii(this)).create();
      break;
    }
  }

  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    Resources localResources = getResources();
    paramMenu.add(0, 0, 0, getString(2131296315)).setIcon(localResources.getDrawable(2130838460));
    return true;
  }

  public void onDestroy()
  {
    super.onDestroy();
    this.i.a();
  }

  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    switch (paramMenuItem.getItemId())
    {
    default:
    case 0:
    }
    while (true)
    {
      return true;
      Intent localIntent = new Intent(z[0]);
      localIntent.addCategory(z[1]);
      startActivityForResult(localIntent, 3);
    }
  }

  public void onPause()
  {
    j2.b(this);
    super.onPause();
  }

  public void onResume()
  {
    j2.a(this);
    super.onResume();
  }
}