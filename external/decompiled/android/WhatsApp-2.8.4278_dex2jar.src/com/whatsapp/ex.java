package com.whatsapp;

import android.media.MediaPlayer;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.SeekBar;
import java.io.IOException;

class ex
  implements View.OnClickListener
{
  private static final String[] z;
  final MediaView a;

  static
  {
    String[] arrayOfString = new String[3];
    char[] arrayOfChar1 = "~D\t".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "3\fM4\034(��L*R?\034M4\022~��Z}\0231\035\t/\030?\rP".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "~\025\t".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label289;
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
        m = 125;
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
        m = 94;
        continue;
        m = 105;
        continue;
        m = 41;
        continue;
        m = 93;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 125;
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
      i3 = 94;
      continue;
      i3 = 105;
      continue;
      i3 = 41;
      continue;
      i3 = 93;
    }
    label289: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 125;
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
      i7 = 94;
      continue;
      i7 = 105;
      continue;
      i7 = 41;
      continue;
      i7 = 93;
    }
  }

  ex(MediaView paramMediaView)
  {
  }

  public void onClick(View paramView)
  {
    boolean bool = DialogToastListActivity.f;
    if (!MediaView.e(this.a))
      g5.d(z[1]);
    g5.b(MediaView.f(this.a).getProgress() + z[2] + MediaView.f(this.a).getMax() + z[0] + MediaView.c(this.a) + z[2] + 5);
    if ((MediaView.c(this.a) == 5) && (MediaView.f(this.a).getProgress() > 0) && (MediaView.f(this.a).getProgress() < MediaView.f(this.a).getMax()))
    {
      MediaView.b(this.a, 4);
      MediaView.a(this.a).start();
      MediaView.b(this.a).sendEmptyMessage(0);
      MediaView.d(this.a).setText(2131296798);
      if (!bool);
    }
    else if (MediaView.c(this.a) == 5)
    {
      if ((MediaView.a(this.a).getCurrentPosition() >= MediaView.a(this.a).getDuration()) && (MediaView.f(this.a).getProgress() == MediaView.f(this.a).getMax()))
        MediaView.f(this.a).setProgress(0);
    }
    try
    {
      MediaView.a(this.a).prepare();
      MediaView.a(this.a).start();
      MediaView.b(this.a).removeMessages(0);
      MediaView.b(this.a).sendEmptyMessage(0);
      MediaView.d(this.a).setText(2131296798);
      MediaView.b(this.a, 4);
      if (bool)
        if (MediaView.a(this.a) != null)
        {
          MediaView.a(this.a).pause();
          MediaView.d(this.a).setText(2131296756);
          MediaView.b(this.a, 5);
          if (!bool);
        }
        else
        {
          MediaView.g(this.a);
        }
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      while (true)
        g5.d(localIllegalStateException);
    }
    catch (IOException localIOException)
    {
      while (true)
        g5.d(localIOException);
    }
  }
}