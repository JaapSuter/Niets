package com.whatsapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ContactInfo extends DialogToastActivity
  implements uk
{
  private static final String[] z;
  private zq f;
  private ee g;
  private ImageButton h;
  private View i;
  private ArrayList<View> j = new ArrayList();
  private View k;
  private y l;

  static
  {
    String[] arrayOfString = new String[8];
    char[] arrayOfChar1 = "J^F".toCharArray();
    int m = arrayOfChar1.length;
    int n = 0;
    char[] arrayOfChar2;
    int i4;
    char[] arrayOfChar3;
    int i8;
    char[] arrayOfChar4;
    int i12;
    char[] arrayOfChar5;
    int i16;
    char[] arrayOfChar6;
    int i20;
    char[] arrayOfChar7;
    int i24;
    char[] arrayOfChar8;
    int i28;
    if (m <= n)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "��\027".toCharArray();
      int i3 = arrayOfChar2.length;
      i4 = 0;
      if (i3 <= i4)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "CXLkYCCKq^O\030Wo\\ACG".toCharArray();
        int i7 = arrayOfChar3.length;
        i8 = 0;
        if (i7 > i8)
          break label477;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "CXLkYCCKq^O\030FzKTEMf".toCharArray();
        int i11 = arrayOfChar4.length;
        i12 = 0;
        if (i11 > i12)
          break label569;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "CXLkYCCKq^O\030Am]ACG".toCharArray();
        int i15 = arrayOfChar5.length;
        i16 = 0;
        if (i15 > i16)
          break label661;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "LV[pMThKq^LVVzJ".toCharArray();
        int i19 = arrayOfChar6.length;
        i20 = 0;
        if (i19 > i20)
          break label753;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "AYFmWIS\fvVTRLk\026ATVvWN\031tV}w".toCharArray();
        int i23 = arrayOfChar7.length;
        i24 = 0;
        if (i23 > i24)
          break label845;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "CXLi]RDCkQOY\rpHT\027QfKTRO?[OYV~[T\027NvKT\027ApMLS\002qWT\027DpMNS".toCharArray();
        int i27 = arrayOfChar8.length;
        i28 = 0;
        if (i27 > i28)
          break label937;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        z = arrayOfString;
      }
    }
    else
    {
      int i1 = arrayOfChar1[n];
      int i2;
      switch (n % 5)
      {
      default:
        i2 = 56;
      case 0:
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        arrayOfChar1[n] = (char)(i2 ^ i1);
        n++;
        break;
        i2 = 32;
        continue;
        i2 = 55;
        continue;
        i2 = 34;
        continue;
        i2 = 31;
      }
    }
    int i5 = arrayOfChar2[i4];
    int i6;
    switch (i4 % 5)
    {
    default:
      i6 = 56;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar2[i4] = (char)(i6 ^ i5);
      i4++;
      break;
      i6 = 32;
      continue;
      i6 = 55;
      continue;
      i6 = 34;
      continue;
      i6 = 31;
    }
    label477: int i9 = arrayOfChar3[i8];
    int i10;
    switch (i8 % 5)
    {
    default:
      i10 = 56;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar3[i8] = (char)(i10 ^ i9);
      i8++;
      break;
      i10 = 32;
      continue;
      i10 = 55;
      continue;
      i10 = 34;
      continue;
      i10 = 31;
    }
    label569: int i13 = arrayOfChar4[i12];
    int i14;
    switch (i12 % 5)
    {
    default:
      i14 = 56;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar4[i12] = (char)(i14 ^ i13);
      i12++;
      break;
      i14 = 32;
      continue;
      i14 = 55;
      continue;
      i14 = 34;
      continue;
      i14 = 31;
    }
    label661: int i17 = arrayOfChar5[i16];
    int i18;
    switch (i16 % 5)
    {
    default:
      i18 = 56;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar5[i16] = (char)(i18 ^ i17);
      i16++;
      break;
      i18 = 32;
      continue;
      i18 = 55;
      continue;
      i18 = 34;
      continue;
      i18 = 31;
    }
    label753: int i21 = arrayOfChar6[i20];
    int i22;
    switch (i20 % 5)
    {
    default:
      i22 = 56;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar6[i20] = (char)(i22 ^ i21);
      i20++;
      break;
      i22 = 32;
      continue;
      i22 = 55;
      continue;
      i22 = 34;
      continue;
      i22 = 31;
    }
    label845: int i25 = arrayOfChar7[i24];
    int i26;
    switch (i24 % 5)
    {
    default:
      i26 = 56;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar7[i24] = (char)(i26 ^ i25);
      i24++;
      break;
      i26 = 32;
      continue;
      i26 = 55;
      continue;
      i26 = 34;
      continue;
      i26 = 31;
    }
    label937: int i29 = arrayOfChar8[i28];
    int i30;
    switch (i28 % 5)
    {
    default:
      i30 = 56;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar8[i28] = (char)(i30 ^ i29);
      i28++;
      break;
      i30 = 32;
      continue;
      i30 = 55;
      continue;
      i30 = 34;
      continue;
      i30 = 31;
    }
  }

  static zq a(ContactInfo paramContactInfo)
  {
    return paramContactInfo.f;
  }

  private void a(Bitmap paramBitmap)
  {
    this.i.setVisibility(8);
    if (!App.o())
      this.h.setVisibility(8);
    while (true)
    {
      return;
      this.h.setBackgroundDrawable(null);
      int m = (int)j4.a(this).K;
      this.h.setPadding(m, m, m, m);
      if (paramBitmap != null)
      {
        int n = (int)j4.a(this).L;
        this.h.setImageDrawable(new p(getResources(), paramBitmap, n, null));
        this.h.getDrawable().setDither(true);
        this.h.getDrawable().setFilterBitmap(true);
      }
    }
  }

  static void a(ContactInfo paramContactInfo, Bitmap paramBitmap)
  {
    paramContactInfo.a(paramBitmap);
  }

  static void a(ContactInfo paramContactInfo, ArrayList paramArrayList)
  {
    paramContactInfo.a(paramArrayList);
  }

  static void a(ContactInfo paramContactInfo, List paramList)
  {
    paramContactInfo.a(paramList);
  }

  public static void a(zq paramzq, Activity paramActivity)
  {
    Intent localIntent = new Intent(paramActivity, ContactInfo.class);
    localIntent.putExtra(z[0], paramzq.b);
    paramActivity.startActivity(localIntent);
  }

  private void a(ArrayList<kj> paramArrayList)
  {
    boolean bool = DialogToastListActivity.f;
    ListView localListView = (ListView)findViewById(16908298);
    LayoutInflater localLayoutInflater = (LayoutInflater)getBaseContext().getSystemService(z[5]);
    Iterator localIterator = paramArrayList.iterator();
    int n;
    for (int m = 0; ; m = n)
    {
      kj localkj;
      View localView4;
      if (localIterator.hasNext())
      {
        localkj = (kj)localIterator.next();
        if (m < this.j.size())
          break label276;
        localView4 = localLayoutInflater.inflate(2130903052, localListView, false);
        localListView.addFooterView(localView4, null, false);
        this.j.add(localView4);
      }
      label276: for (View localView1 = localView4; ; localView1 = (View)this.j.get(m))
      {
        View localView2 = localView1.findViewById(2131558503);
        View localView3 = localView1.findViewById(2131558508);
        if (m != 0)
        {
          localView2.setVisibility(8);
          if (!bool);
        }
        else
        {
          localView2.setVisibility(0);
        }
        if (localkj.c == null)
        {
          localView3.setVisibility(8);
          if (!bool);
        }
        else
        {
          localView3.setVisibility(0);
          localView3.setOnClickListener(new ij(this, localkj));
        }
        ((TextView)localView1.findViewById(2131558506)).setText(localkj.a);
        TextView localTextView = (TextView)localView1.findViewById(2131558505);
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = localkj.b;
        localTextView.setText(getString(2131296926, arrayOfObject));
        localView1.findViewById(2131558504).setOnClickListener(new jj(this, localkj));
        n = m + 1;
        if (!bool)
          break;
        return;
      }
    }
  }

  private void a(List<zq> paramList)
  {
    this.g.a(paramList);
    if (this.g.getCount() == 0)
    {
      findViewById(2131558521).setVisibility(8);
      if (!DialogToastListActivity.f);
    }
    else
    {
      findViewById(2131558521).setVisibility(0);
    }
  }

  static ee b(ContactInfo paramContactInfo)
  {
    return paramContactInfo.g;
  }

  private void b()
  {
    g5.b(z[2]);
    this.f = gp.a(getIntent().getStringExtra(z[0]));
    int m = (int)App.Mb.getResources().getDimension(2131361808);
    a(Bitmap.createScaledBitmap(this.f.l(), m, m, true));
    TextView localTextView1 = (TextView)findViewById(2131558468);
    Object localObject1 = v4.a(this.f.b(), getBaseContext(), localTextView1.getPaint());
    if (localObject1 == null)
      localObject1 = this.f.b();
    localTextView1.setText((CharSequence)localObject1);
    ((TextView)findViewById(2131558467)).setText(this.f.m());
    TextView localTextView2 = (TextView)findViewById(2131558514);
    Object localObject2;
    SpannableStringBuilder localSpannableStringBuilder;
    if (this.f.c != null)
    {
      localObject2 = this.f.c + z[1];
      localSpannableStringBuilder = v4.b((String)localObject2, getBaseContext());
      if (localSpannableStringBuilder != null)
        break label251;
    }
    while (true)
    {
      localTextView2.setText((CharSequence)localObject2);
      if (this.l != null)
        this.l.cancel(true);
      this.l = new y(this);
      this.l.execute(new Void[0]);
      return;
      localObject2 = z[1];
      break;
      label251: localObject2 = localSpannableStringBuilder;
    }
  }

  static void b(ContactInfo paramContactInfo, ArrayList paramArrayList)
  {
    paramContactInfo.b(paramArrayList);
  }

  private void b(ArrayList<sz> paramArrayList)
  {
    boolean bool = DialogToastListActivity.f;
    View localView = findViewById(2131558516);
    TextView localTextView = (TextView)findViewById(2131558515);
    ImageView[] arrayOfImageView;
    ArrayList localArrayList;
    Object localObject;
    Iterator localIterator;
    if ((paramArrayList == null) || (paramArrayList.isEmpty()))
    {
      localTextView.setVisibility(8);
      localView.setVisibility(8);
      if (!bool);
    }
    else
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(paramArrayList.size());
      localTextView.setText(getString(2131296907, arrayOfObject));
      localTextView.setVisibility(0);
      localView.setVisibility(0);
      arrayOfImageView = new ImageView[3];
      arrayOfImageView[0] = ((ImageView)findViewById(2131558519));
      arrayOfImageView[1] = ((ImageView)findViewById(2131558518));
      arrayOfImageView[2] = ((ImageView)findViewById(2131558517));
      localArrayList = new ArrayList(3);
      localObject = null;
      localIterator = paramArrayList.iterator();
    }
    while (true)
    {
      sz localsz;
      if (localIterator.hasNext())
      {
        localsz = (sz)localIterator.next();
        if (localsz.l == 2)
        {
          if (!bool)
            break label344;
          localObject = localsz;
        }
        localArrayList.add(localsz);
        if ((localArrayList.size() == 3) && (!bool));
      }
      while (bool)
      {
        if ((localArrayList.isEmpty()) && (localObject != null))
          localArrayList.add(localObject);
        int i1;
        for (int m = 0; ; m = i1)
          if (m < Math.min(localArrayList.size(), arrayOfImageView.length))
          {
            j5.a((sz)localArrayList.get(m), arrayOfImageView[m], this);
            arrayOfImageView[m].setVisibility(0);
            i1 = m + 1;
            if (!bool);
          }
          else
          {
            int n = localArrayList.size();
            do
            {
              if (n >= arrayOfImageView.length)
                break;
              arrayOfImageView[n].setVisibility(8);
              n++;
            }
            while (!bool);
            return;
          }
        label344: localObject = localsz;
      }
    }
  }

  static View c(ContactInfo paramContactInfo)
  {
    return paramContactInfo.k;
  }

  public void a()
  {
    b();
  }

  public void a(String paramString)
  {
    if (paramString.equals(getIntent().getStringExtra(z[0])))
    {
      b();
      if (!DialogToastListActivity.f);
    }
    else
    {
      zq localzq = App.w.a(paramString, null);
      if (localzq != null)
      {
        vq localvq = new vq(localzq);
        if ((this.g != null) && (zq.a(this.g.b, localvq)))
          this.g.notifyDataSetChanged();
      }
    }
  }

  public void b(String paramString)
  {
    if (paramString.equals(getIntent().getStringExtra(z[0])))
      ((TextView)findViewById(2131558467)).setText(this.f.m());
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903051);
    g5.b(z[4]);
    ListView localListView = (ListView)findViewById(16908298);
    localListView.addHeaderView(((LayoutInflater)getBaseContext().getSystemService(z[5])).inflate(2130903053, localListView, false));
    this.h = ((ImageButton)findViewById(2131558511));
    this.h.setOnClickListener(new fj(this));
    this.i = findViewById(2131558510);
    findViewById(2131558516).setOnClickListener(new gj(this));
    localListView.setDividerHeight(0);
    localListView.setOnItemClickListener(new hj(this));
    this.g = new ee(this, this, 2130903116);
    localListView.setAdapter(this.g);
    a(null);
    b(null);
    this.k = findViewById(2131558492);
    this.k.setVisibility(0);
    b();
    m5.b(this.f.b);
    App.a(this);
  }

  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    paramMenu.add(0, 1, 0, 2131296906).setIcon(2130838465);
    return true;
  }

  public void onDestroy()
  {
    super.onDestroy();
    g5.b(z[3]);
    if (this.l != null)
      this.l.cancel(true);
    App.b(this);
    m5.c(this.f.b);
  }

  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    switch (paramMenuItem.getItemId())
    {
    default:
    case 1:
    }
    for (boolean bool = false; ; bool = true)
    {
      return bool;
      if (this.f.g != null)
      {
        Uri localUri = this.f.a(getContentResolver());
        Intent localIntent = new Intent(z[6], localUri);
        localIntent.setComponent(localIntent.resolveActivity(getPackageManager()));
        if (localIntent.getComponent() != null)
        {
          startActivity(localIntent);
          if (!DialogToastListActivity.f);
        }
        else
        {
          g5.c(z[7]);
          App.h();
        }
      }
    }
  }

  public void onResume()
  {
    super.onResume();
    App.a(this.f);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.ContactInfo
 * JD-Core Version:    0.6.1
 */