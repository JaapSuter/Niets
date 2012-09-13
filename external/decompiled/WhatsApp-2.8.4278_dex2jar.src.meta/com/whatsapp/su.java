package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract.Contacts;

class su
  implements DialogInterface.OnClickListener
{
  private static final String[] z;
  final GroupChatMap a;

  static
  {
    String[] arrayOfString = new String[8];
    char[] arrayOfChar1 = "{\020\030*".toCharArray();
    int i = arrayOfChar1.length;
    int j = 0;
    char[] arrayOfChar2;
    int i1;
    char[] arrayOfChar3;
    int i5;
    char[] arrayOfChar4;
    int i9;
    char[] arrayOfChar5;
    int i13;
    char[] arrayOfChar6;
    int i17;
    char[] arrayOfChar7;
    int i21;
    char[] arrayOfChar8;
    int i25;
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "n\033\020bpf\021Zyq{\020\032d1n\026��ypa[=^LJ' OP]*1TV[".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "\035\033~z".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label477;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "n\033\020bpf\021Zyq{\020\032d1n\026��ypa[=^LJ' ".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label569;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "n\033\020bpf\021Zyq{\020\032d1n\026��ypa[7QSC".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label661;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = "y\033\020>~a\021\006vk[\027em|\032\006>v{\020\031?|`\033��q|{".toCharArray();
        int i16 = arrayOfChar6.length;
        i17 = 0;
        if (i16 > i17)
          break label753;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "h\007\033eoP\030\025`0l\032\032dzw\001Tcf|\001\021}?l\032\032d~l\001T|v|\001Tspz\031\0200q`\001Tvpz\033\020".toCharArray();
        int i20 = arrayOfChar7.length;
        i21 = 0;
        if (i20 > i21)
          break label845;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "\035\033~zP\001\r`z".toCharArray();
        int i24 = arrayOfChar8.length;
        i25 = 0;
        if (i24 > i25)
          break label937;
        arrayOfString[7] = new String(arrayOfChar8).intern();
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
        m = 31;
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
        m = 15;
        continue;
        m = 117;
        continue;
        m = 116;
        continue;
        m = 16;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 31;
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
      i3 = 15;
      continue;
      i3 = 117;
      continue;
      i3 = 116;
      continue;
      i3 = 16;
    }
    label477: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 31;
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
      i7 = 15;
      continue;
      i7 = 117;
      continue;
      i7 = 116;
      continue;
      i7 = 16;
    }
    label569: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 31;
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
      i11 = 15;
      continue;
      i11 = 117;
      continue;
      i11 = 116;
      continue;
      i11 = 16;
    }
    label661: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 31;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar5[i13] = (char)(i15 ^ i14);
      i13++;
      break;
      i15 = 15;
      continue;
      i15 = 117;
      continue;
      i15 = 116;
      continue;
      i15 = 16;
    }
    label753: int i18 = arrayOfChar6[i17];
    int i19;
    switch (i17 % 5)
    {
    default:
      i19 = 31;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar6[i17] = (char)(i19 ^ i18);
      i17++;
      break;
      i19 = 15;
      continue;
      i19 = 117;
      continue;
      i19 = 116;
      continue;
      i19 = 16;
    }
    label845: int i22 = arrayOfChar7[i21];
    int i23;
    switch (i21 % 5)
    {
    default:
      i23 = 31;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar7[i21] = (char)(i23 ^ i22);
      i21++;
      break;
      i23 = 15;
      continue;
      i23 = 117;
      continue;
      i23 = 116;
      continue;
      i23 = 16;
    }
    label937: int i26 = arrayOfChar8[i25];
    int i27;
    switch (i25 % 5)
    {
    default:
      i27 = 31;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar8[i25] = (char)(i27 ^ i26);
      i25++;
      break;
      i27 = 15;
      continue;
      i27 = 117;
      continue;
      i27 = 116;
      continue;
      i27 = 16;
    }
  }

  su(GroupChatMap paramGroupChatMap)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    boolean bool = DialogToastListActivity.f;
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      paramDialogInterface.dismiss();
      return;
      this.a.startActivity(Conversation.a(GroupChatMap.i(this.a)));
      if (bool)
      {
        String str2 = GroupChatMap.i(this.a).a();
        String str3 = z[0] + str2;
        Intent localIntent3 = new Intent(z[4], Uri.parse(str3));
        this.a.startActivity(localIntent3);
        if (bool)
          if (GroupChatMap.i(this.a).g != null)
          {
            ContactInfo.a(GroupChatMap.i(this.a), this.a);
            if (!bool);
          }
          else
          {
            String str1 = GroupChatMap.i(this.a).a();
            Intent localIntent2 = new Intent(z[3], ContactsContract.Contacts.CONTENT_URI);
            localIntent2.putExtra(z[2], str1);
            localIntent2.setComponent(localIntent2.resolveActivity(this.a.getPackageManager()));
            if (localIntent2.getComponent() != null)
            {
              g.a(true);
              this.a.startActivityForResult(localIntent2, 10);
              if (!bool);
            }
            else
            {
              g5.b(z[6]);
              App.h();
            }
            if (bool)
            {
              g.a(true);
              Intent localIntent1 = new Intent(z[1]);
              localIntent1.setType(z[5]);
              localIntent1.putExtra(z[2], GroupChatMap.i(this.a).b());
              localIntent1.putExtra(z[7], 2);
              localIntent1.setFlags(524288);
              this.a.startActivityForResult(localIntent1, 11);
            }
          }
      }
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.su
 * JD-Core Version:    0.6.1
 */