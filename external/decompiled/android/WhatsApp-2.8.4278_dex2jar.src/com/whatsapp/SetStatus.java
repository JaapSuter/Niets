package com.whatsapp;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ListView;
import android.widget.TextView;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class SetStatus extends DialogToastActivity
{
  static ArrayList<String> g;
  static int i;
  private static SetStatus j;
  static int o;
  static int p;
  static int q;
  private static final String[] z;
  TextView f;
  ke h;
  private String k = null;
  Handler l = new sd(this);
  Handler m = new td(this);
  private View n;

  static
  {
    String[] arrayOfString = new String[4];
    char[] arrayOfChar1 = "\005\031@o\036\005".toCharArray();
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
      arrayOfChar2 = "\005\bUh\037\027\031ThD\005\031@o\036\005\030Q\n\002\bE4\037\023��Qh\037\027\031ThK\037\036\001u\036\032\001".toCharArray();
      int i5 = arrayOfChar2.length;
      i6 = 0;
      if (i5 <= i6)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "\005\031@o\036\005BBi\016\027\031D".toCharArray();
        int i9 = arrayOfChar3.length;
        i10 = 0;
        if (i9 > i10)
          break label349;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "\025\037Dz\037\023BRo\n\002\030R4\030\023\037Hz\007\037\027@o\002\031\003~~\031\004\002S".toCharArray();
        int i13 = arrayOfChar4.length;
        i14 = 0;
        if (i13 > i14)
          break label441;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        z = arrayOfString;
        i = -1;
        j = null;
        o = 0;
        p = 1;
        q = 2;
      }
    }
    else
    {
      int i3 = arrayOfChar1[i2];
      int i4;
      switch (i2 % 5)
      {
      default:
        i4 = 107;
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
        i4 = 118;
        continue;
        i4 = 109;
        continue;
        i4 = 33;
        continue;
        i4 = 27;
      }
    }
    int i7 = arrayOfChar2[i6];
    int i8;
    switch (i6 % 5)
    {
    default:
      i8 = 107;
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
      i8 = 118;
      continue;
      i8 = 109;
      continue;
      i8 = 33;
      continue;
      i8 = 27;
    }
    label349: int i11 = arrayOfChar3[i10];
    int i12;
    switch (i10 % 5)
    {
    default:
      i12 = 107;
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
      i12 = 118;
      continue;
      i12 = 109;
      continue;
      i12 = 33;
      continue;
      i12 = 27;
    }
    label441: int i15 = arrayOfChar4[i14];
    int i16;
    switch (i14 % 5)
    {
    default:
      i16 = 107;
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
      i16 = 118;
      continue;
      i16 = 109;
      continue;
      i16 = 33;
      continue;
      i16 = 27;
    }
  }

  static void a(SetStatus paramSetStatus)
  {
    paramSetStatus.h();
  }

  static View b(SetStatus paramSetStatus)
  {
    return paramSetStatus.n;
  }

  static SetStatus f()
  {
    return j;
  }

  private boolean g()
  {
    boolean bool1 = DialogToastListActivity.f;
    try
    {
      if (new File(getFilesDir(), z[0]).exists())
      {
        ObjectInputStream localObjectInputStream = new ObjectInputStream(openFileInput(z[0]));
        String str1 = (String)localObjectInputStream.readObject();
        g = new ArrayList();
        String[] arrayOfString = str1.split("\n");
        int i1 = arrayOfString.length;
        i2 = 0;
        if (i2 < i1)
        {
          String str2 = arrayOfString[i2];
          if (str2.length() <= 0)
            break label149;
          g.add(str2);
          break label149;
        }
        localObjectInputStream.close();
        bool2 = true;
        return bool2;
      }
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      while (true)
      {
        g5.a(z[3], localClassNotFoundException);
        boolean bool2 = false;
      }
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        int i2;
        g5.d(localIOException);
        continue;
        label149: i2++;
        if (!bool1);
      }
    }
  }

  private void h()
  {
    boolean bool = DialogToastListActivity.f;
    try
    {
      ObjectOutputStream localObjectOutputStream = new ObjectOutputStream(App.Mb.openFileOutput(z[0], 0));
      StringBuilder localStringBuilder = new StringBuilder();
      Iterator localIterator = g.iterator();
      do
      {
        if (!localIterator.hasNext())
          break;
        localStringBuilder.append((String)localIterator.next()).append("\n");
      }
      while (!bool);
      if (localStringBuilder.length() > 1)
        localStringBuilder.deleteCharAt(-1 + localStringBuilder.length());
      localObjectOutputStream.writeObject(localStringBuilder.toString());
      localObjectOutputStream.close();
      return;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      while (true)
        localFileNotFoundException.printStackTrace();
    }
    catch (IOException localIOException)
    {
      while (true)
        localIOException.printStackTrace();
    }
  }

  void a()
  {
    this.l.removeMessages(0);
    if (this.k != null)
    {
      App.a = this.k;
      this.k = null;
      this.l.sendEmptyMessage(1);
      if (!DialogToastListActivity.f);
    }
    else
    {
      g5.d(z[1]);
    }
  }

  public void a(String paramString)
  {
    showDialog(2);
    this.k = paramString;
    App.j(paramString);
    this.l.sendEmptyMessageDelayed(0, 32000L);
  }

  void b()
  {
    this.m.removeMessages(0);
    this.m.sendEmptyMessage(1);
  }

  void c()
  {
    this.l.removeMessages(0);
    this.l.sendEmptyMessage(0);
  }

  public void d()
  {
    findViewById(2131558624).setVisibility(0);
    findViewById(2131558762).setVisibility(8);
    new v9(this.m).start();
  }

  public ArrayList<String> e()
  {
    boolean bool = DialogToastListActivity.f;
    ArrayList localArrayList = new ArrayList();
    TypedArray localTypedArray = getResources().obtainTypedArray(2131165184);
    int i1 = 0;
    do
    {
      if (i1 >= localTypedArray.length())
        break;
      localArrayList.add(localTypedArray.getString(i1));
      i1++;
    }
    while (!bool);
    return localArrayList;
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    String str;
    if (paramInt2 == -1)
    {
      str = paramIntent.getStringExtra(z[0]);
      if (paramInt1 != o)
        break label40;
      g.add(0, str);
      a(str);
    }
    while (true)
    {
      return;
      label40: if (i >= 0)
      {
        g.remove(i);
        g.add(i, str);
      }
      if (paramInt1 == q)
        a(str);
    }
  }

  public boolean onContextItemSelected(MenuItem paramMenuItem)
  {
    AdapterView.AdapterContextMenuInfo localAdapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo)paramMenuItem.getMenuInfo();
    switch (paramMenuItem.getItemId())
    {
    default:
    case 1:
    }
    while (true)
    {
      return true;
      g.remove(localAdapterContextMenuInfo.position);
      i = -1;
      this.h.notifyDataSetChanged();
      h();
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    g5.b(z[2]);
    setContentView(2130903124);
    this.n = findViewById(2131558761);
    if (!App.b)
    {
      d();
      if (!DialogToastListActivity.f);
    }
    else
    {
      this.n.setOnClickListener(new o2(this));
    }
    this.f = ((TextView)findViewById(2131558514));
    Object localObject = v4.a(App.a, getBaseContext());
    TextView localTextView = this.f;
    if (localObject == null)
      localObject = App.a;
    localTextView.setText((CharSequence)localObject);
    if (!g())
      g = e();
    ListView localListView = (ListView)findViewById(2131558763);
    localListView.setEmptyView(findViewById(2131558764));
    this.h = new ke(this, this, 2131558765, g);
    localListView.setAdapter(this.h);
    localListView.setOnItemClickListener(new p2(this));
    registerForContextMenu(localListView);
    j = this;
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    super.onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
    paramContextMenu.add(0, 1, 0, getString(2131296590));
  }

  public Dialog onCreateDialog(int paramInt)
  {
    Object localObject;
    switch (paramInt)
    {
    default:
      localObject = super.onCreateDialog(paramInt);
    case 0:
    case 1:
    case 50:
    case 2:
    }
    while (true)
    {
      return localObject;
      localObject = ProgressDialog.show(this, getString(2131296596), getString(2131296597), true, false);
      continue;
      localObject = ProgressDialog.show(this, getString(2131296598), getString(2131296599), true, false);
      continue;
      n2 localn2 = new n2(this);
      localObject = new b(this, 2131296589, App.a, localn2, 0, 0, 2131296930);
      continue;
      localObject = new ProgressDialog(this);
      ((ProgressDialog)localObject).setMessage(getString(2131296596));
      ((ProgressDialog)localObject).setIndeterminate(true);
      ((ProgressDialog)localObject).setCancelable(false);
    }
  }

  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    paramMenu.add(0, 0, 0, 2131296591).setIcon(2130838468);
    return true;
  }

  protected void onDestroy()
  {
    super.onDestroy();
    if (j == this)
      j = null;
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
      g.clear();
      h();
      this.h.notifyDataSetChanged();
    }
  }
}