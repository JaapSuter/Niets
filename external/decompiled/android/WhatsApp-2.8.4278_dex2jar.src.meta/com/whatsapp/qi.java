package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;

class qi
  implements DialogInterface.OnClickListener
{
  private static final String[] z;
  final BroadcastMessageComposer a;

  static
  {
    String[] arrayOfString = new String[4];
    char[] arrayOfChar1 = "\017w\013Ji\007}AQh\032|\001L(\017z\033Qi��79qC9".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    char[] arrayOfChar4;
    int i9;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "Qi\007Wh\013$".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "\017{\f".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label325;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "Hz\004Ks\003$".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label417;
        arrayOfString[3] = new String(arrayOfChar4).intern();
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
        m = 6;
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
        m = 110;
        continue;
        m = 25;
        continue;
        m = 111;
        continue;
        m = 56;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 6;
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
      i3 = 110;
      continue;
      i3 = 25;
      continue;
      i3 = 111;
      continue;
      i3 = 56;
    }
    label325: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 6;
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
      i7 = 110;
      continue;
      i7 = 25;
      continue;
      i7 = 111;
      continue;
      i7 = 56;
    }
    label417: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 6;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar4[i9] = (char)(i11 ^ i10);
      i9++;
      break;
      i11 = 110;
      continue;
      i11 = 25;
      continue;
      i11 = 111;
      continue;
      i11 = 56;
    }
  }

  qi(BroadcastMessageComposer paramBroadcastMessageComposer)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    String str1 = App.bb.jabber_id + z[2];
    String str2 = z[1] + App.bb.jabber_id + z[3] + mh.b(str1);
    Intent localIntent = new Intent(z[0]);
    localIntent.setData(Uri.parse(f8.e + str2));
    this.a.startActivity(localIntent);
    this.a.removeDialog(3);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.qi
 * JD-Core Version:    0.6.1
 */