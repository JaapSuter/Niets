package com.whatsapp;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextWatcher;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MultipleContactPicker extends DialogToastListActivity
  implements uk, k2
{
  private static final String[] D;
  int A = 0;
  private pj B = new pj();
  final TextWatcher C = new px(this);
  private int g;
  Handler h = new Handler();
  ProgressDialog i;
  je j;
  int k;
  int l;
  int m;
  private View n;
  private TextView o;
  ArrayList<zq> p = new ArrayList();
  ArrayList<zq> q = new ArrayList();
  int r = -1;
  InputMethodManager s;
  EditText t;
  ImageButton u;
  boolean v;
  int w;
  int x;
  int y;
  Button z;

  static
  {
    String[] arrayOfString = new String[4];
    char[] arrayOfChar1 = "'sOP\"?M_Q1'sBZ%".toCharArray();
    int i1 = arrayOfChar1.length;
    int i2 = 0;
    char[] arrayOfChar2;
    int i6;
    char[] arrayOfChar3;
    int i10;
    char[] arrayOfChar4;
    int i14;
    if (i1 <= i2)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "/wEK".toCharArray();
      int i5 = arrayOfChar2.length;
      i6 = 0;
      if (i5 <= i6)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "\"|FJ#\024SK?$v".toCharArray();
        int i9 = arrayOfChar3.length;
        i10 = 0;
        if (i9 > i10)
          break label325;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "%}\033R6?q^Z$".toCharArray();
        int i13 = arrayOfChar4.length;
        i14 = 0;
        if (i13 > i14)
          break label417;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        D = arrayOfString;
      }
    }
    else
    {
      int i3 = arrayOfChar1[i2];
      int i4;
      switch (i2 % 5)
      {
      default:
        i4 = 87;
      case 0:
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        arrayOfChar1[i2] = (char)(i4 ^ i3);
        i2++;
        break;
        i4 = 75;
        continue;
        i4 = 18;
        continue;
        i4 = 54;
        continue;
        i4 = 63;
      }
    }
    int i7 = arrayOfChar2[i6];
    int i8;
    switch (i6 % 5)
    {
    default:
      i8 = 87;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar2[i6] = (char)(i8 ^ i7);
      i6++;
      break;
      i8 = 75;
      continue;
      i8 = 18;
      continue;
      i8 = 54;
      continue;
      i8 = 63;
    }
    label325: int i11 = arrayOfChar3[i10];
    int i12;
    switch (i10 % 5)
    {
    default:
      i12 = 87;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar3[i10] = (char)(i12 ^ i11);
      i10++;
      break;
      i12 = 75;
      continue;
      i12 = 18;
      continue;
      i12 = 54;
      continue;
      i12 = 63;
    }
    label417: int i15 = arrayOfChar4[i14];
    int i16;
    switch (i14 % 5)
    {
    default:
      i16 = 87;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar4[i14] = (char)(i16 ^ i15);
      i14++;
      break;
      i16 = 75;
      continue;
      i16 = 18;
      continue;
      i16 = 54;
      continue;
      i16 = 63;
    }
  }

  private String a()
  {
    boolean bool = DialogToastListActivity.f;
    StringBuffer localStringBuffer = new StringBuffer();
    TreeSet localTreeSet = new TreeSet();
    Iterator localIterator1 = this.p.iterator();
    do
    {
      if (!localIterator1.hasNext())
        break;
      zq localzq = (zq)localIterator1.next();
      if (localzq.l)
        localTreeSet.add(localzq.b);
    }
    while (!bool);
    Iterator localIterator2 = localTreeSet.iterator();
    do
    {
      if (!localIterator2.hasNext())
        break;
      localStringBuffer.append((String)localIterator2.next()).append(",");
    }
    while (!bool);
    if (localStringBuffer.length() > 0);
    for (String str = localStringBuffer.substring(0, -1 + localStringBuffer.length()); ; str = null)
    {
      return str;
      localTreeSet.clear();
    }
  }

  static String a(MultipleContactPicker paramMultipleContactPicker)
  {
    return paramMultipleContactPicker.a();
  }

  private void a(TextView paramTextView, int paramInt)
  {
    paramTextView.setText(getString(2131296841) + " " + paramInt + "/" + 25);
  }

  static void a(MultipleContactPicker paramMultipleContactPicker, TextView paramTextView, int paramInt)
  {
    paramMultipleContactPicker.a(paramTextView, paramInt);
  }

  static void a(MultipleContactPicker paramMultipleContactPicker, String paramString)
  {
    paramMultipleContactPicker.d(paramString);
  }

  private static boolean a(zq paramzq)
  {
    return D[3].equals(paramzq.b);
  }

  private void b()
  {
    boolean bool = DialogToastListActivity.f;
    while (true)
    {
      synchronized (this.p)
      {
        ArrayList localArrayList2 = new ArrayList();
        Iterator localIterator1 = this.p.iterator();
        if (localIterator1.hasNext())
        {
          zq localzq3 = (zq)localIterator1.next();
          if ((localzq3 != null) && (localzq3.l))
            localArrayList2.add(localzq3);
        }
        else
        {
          this.p.clear();
          App.w.d(this.p);
          ViewGroup.LayoutParams localLayoutParams = this.n.getLayoutParams();
          if (this.p.size() < 20)
          {
            if (localLayoutParams.height != 1)
            {
              localLayoutParams.height = 1;
              this.n.setLayoutParams(localLayoutParams);
              if (!bool);
            }
          }
          else if (localLayoutParams.height == 1)
          {
            localLayoutParams.height = (int)getResources().getDimension(2131361813);
            this.n.setLayoutParams(localLayoutParams);
          }
          ej localej = new ej();
          Iterator localIterator2 = localArrayList2.iterator();
          if (localIterator2.hasNext())
          {
            zq localzq1 = (zq)localIterator2.next();
            Iterator localIterator3 = this.p.iterator();
            if (!localIterator3.hasNext())
              break label314;
            zq localzq2 = (zq)localIterator3.next();
            if ((localzq1 == null) || (localzq2 == null) || (localej.a(localzq1, localzq2) != 0))
              break label310;
            localzq2.l = true;
            if (!bool)
              continue;
            break label310;
          }
          Collections.sort(this.p, new ej());
          c();
          return;
        }
      }
      if (bool)
      {
        continue;
        label310: if (bool)
          label314: if (!bool);
      }
    }
  }

  static void b(MultipleContactPicker paramMultipleContactPicker)
  {
    paramMultipleContactPicker.c();
  }

  static boolean b(zq paramzq)
  {
    return a(paramzq);
  }

  static pj c(MultipleContactPicker paramMultipleContactPicker)
  {
    return paramMultipleContactPicker.B;
  }

  private void c()
  {
    boolean bool = DialogToastListActivity.f;
    if (this.q != null)
      this.q.clear();
    Iterator localIterator = this.p.iterator();
    do
    {
      if (!localIterator.hasNext())
        break;
      zq localzq = (zq)localIterator.next();
      this.q.add(localzq);
    }
    while (!bool);
    if (this.j != null)
      this.j.notifyDataSetChanged();
  }

  static int d(MultipleContactPicker paramMultipleContactPicker)
  {
    return paramMultipleContactPicker.g;
  }

  private void d(String paramString)
  {
    boolean bool = DialogToastListActivity.f;
    while (true)
    {
      synchronized (this.q)
      {
        this.q.clear();
        Iterator localIterator = this.p.iterator();
        if (localIterator.hasNext())
        {
          zq localzq2 = (zq)localIterator.next();
          if ((localzq2.g != null) && (localzq2.h.toLowerCase().contains(paramString.toLowerCase())))
            this.q.add(localzq2);
        }
        else
        {
          if (this.q.size() == 0)
          {
            zq localzq1 = new zq(D[3]);
            this.q.add(localzq1);
          }
          Collections.sort(this.q, new ej());
          this.j.notifyDataSetChanged();
          return;
        }
      }
      if (!bool);
    }
  }

  static TextView e(MultipleContactPicker paramMultipleContactPicker)
  {
    return paramMultipleContactPicker.o;
  }

  public void a()
  {
    b();
    this.j.notifyDataSetChanged();
  }

  public void a(j2 paramj2)
  {
    if (paramj2.j)
    {
      this.j.notifyDataSetChanged();
      if (!DialogToastListActivity.f);
    }
    else
    {
      showDialog(108);
    }
  }

  public void a(String paramString)
  {
    if (!eu.f(paramString))
    {
      zq localzq = App.w.a(paramString, null);
      if (localzq != null)
      {
        vq localvq = new vq(localzq);
        if (zq.a(this.p, localvq))
          this.j.notifyDataSetChanged();
      }
    }
  }

  public void b(String paramString)
  {
  }

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    try
    {
      boolean bool2 = super.dispatchTouchEvent(paramMotionEvent);
      bool1 = bool2;
      return bool1;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      while (true)
        boolean bool1 = false;
    }
  }

  public void onBackPressed()
  {
    if (this.v)
    {
      c();
      this.v = false;
      if (!DialogToastListActivity.f);
    }
    else
    {
      super.onBackPressed();
    }
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    this.w = getWindowManager().getDefaultDisplay().getWidth();
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
        a(2131296525);
        if (!DialogToastListActivity.f);
      }
      else
      {
        showDialog(107);
        new r9(this, localzq).start();
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903109);
    this.x = (int)getResources().getDimension(2131361837);
    this.y = (int)(800.0F * this.x / 480.0F);
    int i1 = getIntent().getIntExtra(D[1], 0);
    this.m = i1;
    if (i1 == 1)
    {
      this.g = 25;
      this.k = 2131296841;
      this.l = 2131296846;
      if (!DialogToastListActivity.f);
    }
    else
    {
      this.g = eu.b;
      this.k = 2131296842;
      this.l = 2131296851;
    }
    ListView localListView = getListView();
    localListView.setDividerHeight(0);
    this.n = ((LayoutInflater)getBaseContext().getSystemService(D[0])).inflate(2130903113, localListView, false);
    localListView.addHeaderView(this.n);
    this.t = ((EditText)this.n.findViewById(2131558528));
    this.t.addTextChangedListener(this.C);
    this.t.setGravity(TextEmojiLabel.a(this.t.getText().toString()));
    this.u = ((ImageButton)this.n.findViewById(2131558529));
    this.u.setOnClickListener(new mx(this));
    this.s = ((InputMethodManager)getSystemService(D[2]));
    b();
    localListView.setEmptyView(findViewById(2131558534));
    localListView.setFastScrollEnabled(true);
    localListView.setScrollbarFadingEnabled(true);
    this.o = ((TextView)findViewById(2131558721));
    a(this.o, this.A);
    this.j = new je(this, this, 2130903111, this.q);
    setListAdapter(this.j);
    this.z = ((Button)findViewById(2131558722));
    this.z.setOnClickListener(new nx(this));
    ox localox = new ox(this);
    findViewById(2131558661).setOnClickListener(localox);
    registerForContextMenu(localListView);
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AdapterView.AdapterContextMenuInfo localAdapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
    zq localzq = (zq)getListView().getItemAtPosition(localAdapterContextMenuInfo.position);
    if (localzq == null);
    while (true)
    {
      return;
      if ((!a(localzq)) && (App.g(localzq.b)))
      {
        super.onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
        String str = getString(2131296809);
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = localzq.h;
        paramContextMenu.add(0, 0, 0, String.format(str, arrayOfObject));
      }
    }
  }

  protected Dialog onCreateDialog(int paramInt)
  {
    Object localObject;
    switch (paramInt)
    {
    default:
      localObject = super.onCreateDialog(paramInt);
    case 107:
    case 108:
    }
    while (true)
    {
      return localObject;
      localObject = new ProgressDialog(this);
      ((ProgressDialog)localObject).setMessage(getString(2131296394));
      ((ProgressDialog)localObject).setIndeterminate(true);
      ((ProgressDialog)localObject).setCancelable(false);
      continue;
      localObject = new AlertDialog.Builder(this).setMessage(2131296943).setNeutralButton(2131296270, new qx(this)).create();
    }
  }

  public void onDestroy()
  {
    super.onDestroy();
    this.p.clear();
    this.q.clear();
    this.B.a();
  }

  public void onPause()
  {
    App.b(this);
    j2.b(this);
    if (this.i != null)
    {
      this.i.dismiss();
      this.i = null;
    }
    super.onPause();
  }

  public void onResume()
  {
    super.onResume();
    j2.a(this);
    App.a(this);
    this.j.notifyDataSetChanged();
  }

  public boolean onSearchRequested()
  {
    if (!this.v)
    {
      findViewById(2131558526).setVisibility(0);
      this.s.toggleSoftInput(0, 0);
      this.t.requestFocus();
      this.t.setText("");
      this.v = true;
    }
    return false;
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.MultipleContactPicker
 * JD-Core Version:    0.6.1
 */