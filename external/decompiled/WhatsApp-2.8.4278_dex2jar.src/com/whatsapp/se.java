package com.whatsapp;

import android.graphics.Typeface;
import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class se extends BaseAdapter
{
  private static final String z;
  private int a = 0;
  private SparseArray<aab> b = new SparseArray();
  final MediaGallery c;

  static
  {
    char[] arrayOfChar = "\032z0q\034\020~8t\030\005f{j\022��?7w\b\031kn".toCharArray();
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
      m = 125;
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
      m = 119;
      continue;
      m = 31;
      continue;
      m = 84;
      continue;
      m = 24;
    }
  }

  public se(MediaGallery paramMediaGallery)
  {
  }

  private Pair<Integer, ArrayList<sz>> a(int paramInt)
  {
    boolean bool = DialogToastListActivity.f;
    ArrayList localArrayList = null;
    Iterator localIterator = MediaGallery.c(this.c).entrySet().iterator();
    do
    {
      if (!localIterator.hasNext())
        break;
      localArrayList = (ArrayList)((Map.Entry)localIterator.next()).getValue();
      int i = 1 + (-1 + (localArrayList.size() + MediaGallery.d(this.c))) / MediaGallery.d(this.c);
      if ((paramInt <= i) && (!bool))
        break;
      paramInt -= i;
    }
    while (!bool);
    return new Pair(Integer.valueOf(paramInt - 1), localArrayList);
  }

  public void a()
  {
    boolean bool = DialogToastListActivity.f;
    this.a = 0;
    this.b.clear();
    Iterator localIterator = MediaGallery.c(this.c).entrySet().iterator();
    do
    {
      if (!localIterator.hasNext())
        break;
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      aab localaab = (aab)localEntry.getKey();
      ArrayList localArrayList = (ArrayList)localEntry.getValue();
      this.b.put(this.a, localaab);
      this.a += 1 + (-1 + (localArrayList.size() + MediaGallery.d(this.c))) / MediaGallery.d(this.c);
    }
    while (!bool);
    g5.b(z + this.a);
  }

  public int getCount()
  {
    if (this.a == 0)
      a();
    return this.a;
  }

  public Object getItem(int paramInt)
  {
    return null;
  }

  public long getItemId(int paramInt)
  {
    return 0L;
  }

  public int getItemViewType(int paramInt)
  {
    if (this.b.get(paramInt, null) != null);
    for (int i = 1; ; i = 0)
      return i;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    boolean bool = DialogToastListActivity.f;
    LinearLayout localLinearLayout;
    if (getItemViewType(paramInt) == 1)
    {
      if (paramView != null)
        localLinearLayout = (LinearLayout)paramView;
      TextView localTextView;
      for (Object localObject = (TextView)localLinearLayout.getChildAt(0); ; localObject = localTextView)
      {
        ((TextView)localObject).setText(((aab)this.b.get(paramInt)).toString());
        return localLinearLayout;
        localLinearLayout = new LinearLayout(this.c);
        localLinearLayout.setPadding(MediaGallery.d().db, MediaGallery.d().cb, 0, MediaGallery.d().cb);
        localLinearLayout.setClickable(false);
        localTextView = new TextView(this.c);
        LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        localLayoutParams2.topMargin = MediaGallery.d().gb;
        localLayoutParams2.bottomMargin = MediaGallery.d().gb;
        localTextView.setLayoutParams(localLayoutParams2);
        localTextView.setTypeface(Typeface.DEFAULT_BOLD);
        localTextView.setPadding(MediaGallery.d().eb, MediaGallery.d().fb, MediaGallery.d().fb, MediaGallery.d().fb);
        localTextView.setTextColor(-16777216);
        localTextView.setBackgroundColor(-2039584);
        localLinearLayout.addView(localTextView);
        localLinearLayout.setPadding(0, 0, 0, 0);
      }
    }
    label239: int i;
    int k;
    label297: int m;
    sz localsz;
    MediaGalleryImageView localMediaGalleryImageView;
    if (paramView != null)
    {
      localLinearLayout = (LinearLayout)paramView;
      localLinearLayout.setTag(Integer.valueOf(paramInt));
      i = localLinearLayout.getChildCount();
      Pair localPair = a(paramInt);
      ArrayList localArrayList = (ArrayList)localPair.second;
      int j = ((Integer)localPair.first).intValue();
      k = j * MediaGallery.d(this.c);
      if (k < (j + 1) * MediaGallery.d(this.c))
      {
        m = k - j * MediaGallery.d(this.c);
        if (k < localArrayList.size())
        {
          localsz = (sz)localArrayList.get(-1 + (localArrayList.size() - k));
          if (i > m)
            break label578;
          localMediaGalleryImageView = new MediaGalleryImageView(this.c);
          localMediaGalleryImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
          LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(MediaGallery.e(this.c), MediaGallery.e(this.c));
          localMediaGalleryImageView.setLayoutParams(localLayoutParams1);
          localLayoutParams1.rightMargin = (int)MediaGallery.d().ab;
          localMediaGalleryImageView.setOnClickListener(MediaGallery.f(this.c));
          localMediaGalleryImageView.setBackgroundResource(2130838549);
          localLinearLayout.addView(localMediaGalleryImageView);
        }
      }
    }
    while (true)
    {
      MediaGallery.a(this.c, localsz, paramInt, localMediaGalleryImageView);
      localMediaGalleryImageView.setTag(Integer.valueOf(localsz.b.hashCode()));
      localMediaGalleryImageView.position = paramInt;
      if (bool)
        if (i > m)
          localLinearLayout.getChildAt(m).setVisibility(4);
      int n = k + 1;
      if (bool)
        break;
      k = n;
      break label297;
      break;
      localLinearLayout = new LinearLayout(this.c);
      localLinearLayout.setPadding(MediaGallery.d().db, MediaGallery.d().cb, 0, MediaGallery.d().cb);
      localLinearLayout.setClickable(false);
      break label239;
      label578: localMediaGalleryImageView = (MediaGalleryImageView)localLinearLayout.getChildAt(m);
      localMediaGalleryImageView.setVisibility(0);
    }
  }

  public int getViewTypeCount()
  {
    return 2;
  }
}