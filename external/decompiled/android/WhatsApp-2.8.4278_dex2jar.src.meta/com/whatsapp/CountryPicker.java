package com.whatsapp;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.EditText;
import android.widget.ListView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class CountryPicker extends ListActivity
{
  private static final String[] z;
  EditText a;
  he b;
  private String c;
  private TextWatcher d = new np(this);

  static
  {
    String[] arrayOfString = new String[3];
    char[] arrayOfChar1 = "U\027J,\022^\031Sq\004F\b\ta\nC\026Sp\034i\026Fo��".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "Z\031^m\020B'Nl\003Z\031Sg\027".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "U\027Rl\021D\001Wk\006]\035U-\nX\033Ug\004B\035\007p��U\035Nt��RXnM N\033Br\021_\027I\"\003D\027J\"&Y\rIv\027O(Om\013S1Id\n".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label288;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        z = arrayOfString;
      }
    }
    else
    {
      int k = arrayOfChar1[j];
      int m;
      switch (j % 5)
      {
      default:
        m = 101;
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
        m = 54;
        continue;
        m = 120;
        continue;
        m = 39;
        continue;
        m = 2;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 101;
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
      i3 = 54;
      continue;
      i3 = 120;
      continue;
      i3 = 39;
      continue;
      i3 = 2;
    }
    label288: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 101;
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
      i7 = 54;
      continue;
      i7 = 120;
      continue;
      i7 = 39;
      continue;
      i7 = 2;
    }
  }

  static String a(CountryPicker paramCountryPicker)
  {
    return paramCountryPicker.c;
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

  public void onCreate(Bundle paramBundle)
  {
    boolean bool = DialogToastListActivity.f;
    super.onCreate(paramBundle);
    setContentView(2130903081);
    ArrayList localArrayList = new ArrayList();
    try
    {
      Iterator localIterator = jp.b().iterator();
      do
      {
        if (!localIterator.hasNext())
          break;
        lp locallp = (lp)localIterator.next();
        localArrayList.add(new op(locallp.a, locallp.c + ""));
      }
      while (!bool);
      ListView localListView = getListView();
      View localView = ((LayoutInflater)getBaseContext().getSystemService(z[1])).inflate(2130903113, localListView, false);
      ViewGroup.LayoutParams localLayoutParams = localView.getLayoutParams();
      localLayoutParams.height = (int)getResources().getDimension(2131361813);
      localView.setLayoutParams(localLayoutParams);
      localListView.addHeaderView(localView);
      this.a = ((EditText)localView.findViewById(2131558528));
      this.a.addTextChangedListener(this.d);
      this.a.setGravity(TextEmojiLabel.a(this.a.getText().toString()));
      this.b = new he(this, this, 2130903082, localArrayList);
      setListAdapter(this.b);
      localListView.setOnItemClickListener(new mp(this));
      localListView.setFastScrollEnabled(true);
      localListView.setScrollbarFadingEnabled(true);
      if (getIntent().getExtras() != null)
        this.c = getIntent().getStringExtra(z[0]);
      return;
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        g5.d(z[2]);
        localArrayList.clear();
      }
    }
  }

  protected void onDestroy()
  {
    super.onDestroy();
    this.a.removeTextChangedListener(this.d);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.CountryPicker
 * JD-Core Version:    0.6.1
 */