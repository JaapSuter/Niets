package com.whatsapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import com.whatsapp.messaging.MessageService;
import java.io.File;

public class OverlayAlert extends Activity
{
  private static final String[] z;

  static
  {
    String[] arrayOfString = new String[4];
    char[] arrayOfChar1 = "}\013\031/li\026\017".toCharArray();
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
      arrayOfChar2 = "m\020\006huf\036\0375c~\017E\024gi\026\0302g|/\003)lkQ\031#qk\013\0302cz\032".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "m\020\006huf\036\0375c~\017E\024gi\026\0302g|/\003)lkQ\b*go\r46ja\021\016\031l{\022\t#p".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label324;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "c\032".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label412;
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
        m = 2;
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
        m = 14;
        continue;
        m = 127;
        continue;
        m = 107;
        continue;
        m = 70;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 2;
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
      i3 = 14;
      continue;
      i3 = 127;
      continue;
      i3 = 107;
      continue;
      i3 = 70;
    }
    label324: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 2;
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
      i7 = 14;
      continue;
      i7 = 127;
      continue;
      i7 = 107;
      continue;
      i7 = 70;
    }
    label412: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 2;
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
      i11 = 14;
      continue;
      i11 = 127;
      continue;
      i11 = 107;
      continue;
      i11 = 70;
    }
  }

  public static void a(Activity paramActivity)
  {
    DeleteAccountConfirmation.c();
    App.b = false;
    App.V();
    MessageService.b(App.Mb);
    if (new File(App.Mb.getFilesDir(), z[3]).exists());
    App.bb = null;
    App.c(App.Mb, null);
    App.z.x();
    eg.b();
    eg.c();
    Intent localIntent = new Intent(paramActivity, RegisterPhone.class);
    localIntent.putExtra(z[1], true);
    localIntent.putExtra(z[2], true);
    App.a(paramActivity, 1);
    paramActivity.startActivity(localIntent);
    paramActivity.finish();
    App.a(false);
    xp.i();
    if (Conversations.a())
    {
      Conversations localConversations = Conversations.b();
      if (localConversations != null)
        localConversations.finish();
    }
    Conversation.j();
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    getWindow().addFlags(128);
    setContentView(2130903115);
    ((Button)findViewById(2131558731)).setOnClickListener(new xx(this));
    ((Button)findViewById(2131558730)).setOnClickListener(new yx(this));
  }

  public void onResume()
  {
    super.onResume();
    int i = getIntent().getIntExtra(z[0], -1);
    if (i == -1)
    {
      finish();
      if (!DialogToastListActivity.f);
    }
    else
    {
      ((TextView)findViewById(2131558729)).setText(getString(i));
    }
  }
}