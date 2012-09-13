package com.whatsapp;

import android.content.res.Resources;
import android.os.AsyncTask;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class z extends AsyncTask<String, Void, wp>
{
  private static final String z;
  final ContactPickerHelp a;

  static
  {
    char[] arrayOfChar = "��MEfr��VCw\023\rXz|\024KEdz\020KI~vLAIag\002V^a3".toCharArray();
    int i = arrayOfChar.length;
    int j = 0;
    if (i <= j)
    {
      z = new String(arrayOfChar).intern();
      return;
    }
    int k = arrayOfChar[j];
    int m;
    switch (j % 5)
    {
    default:
      m = 19;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar[j] = (char)(m ^ k);
      j++;
      break;
      m = 99;
      continue;
      m = 34;
      continue;
      m = 43;
      continue;
      m = 18;
    }
  }

  protected z(ContactPickerHelp paramContactPickerHelp)
  {
  }

  protected wp a(String[] paramArrayOfString)
  {
    return tp.b(-1);
  }

  protected void a(wp paramwp)
  {
    boolean bool = DialogToastListActivity.f;
    this.a.removeDialog(1);
    this.a.i = paramwp;
    if (paramwp != null)
    {
      if (paramwp.a > 0)
      {
        this.a.findViewById(2131558545).setVisibility(0);
        g5.b(z + this.a.h.isChecked());
        this.a.findViewById(2131558544).setVisibility(0);
        this.a.findViewById(2131558547).setVisibility(0);
      }
      this.a.g.setVisibility(0);
      TextView localTextView = this.a.g;
      ContactPickerHelp localContactPickerHelp = this.a;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(paramwp.a);
      localTextView.setText(localContactPickerHelp.getString(2131296954, arrayOfObject));
      this.a.getListView().setVisibility(0);
      this.a.k.clear();
      Collections.sort(paramwp.b, new ej());
      Iterator localIterator = paramwp.b.iterator();
      do
      {
        if (!localIterator.hasNext())
          break;
        zq localzq = (zq)localIterator.next();
        this.a.k.add(localzq);
      }
      while (!bool);
      this.a.j.notifyDataSetChanged();
      ListView localListView = this.a.getListView();
      ViewGroup.LayoutParams localLayoutParams = localListView.getLayoutParams();
      localLayoutParams.height = (int)(paramwp.a * this.a.getResources().getDimension(2131361838));
      localListView.setLayoutParams(localLayoutParams);
      if (paramwp.a > 0)
        ((ScrollView)this.a.findViewById(2131558541)).post(new sk(this));
      if (!bool);
    }
    else
    {
      this.a.a(2131296956);
    }
  }

  protected void onPreExecute()
  {
    this.a.showDialog(1);
    this.a.g.setVisibility(4);
    this.a.getListView().setVisibility(4);
    this.a.findViewById(2131558545).setVisibility(8);
    this.a.findViewById(2131558544).setVisibility(8);
    this.a.findViewById(2131558547).setVisibility(8);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.z
 * JD-Core Version:    0.6.1
 */