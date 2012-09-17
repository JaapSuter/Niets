package com.whatsapp;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import java.io.File;
import java.io.IOException;

public class RecordAudio extends DialogToastActivity
{
  private static final String[] z;
  int f = 0;
  long g;
  long h;
  MediaRecorder i;
  MediaPlayer j;
  TextView k;
  Button l;
  Button m;
  Button n;
  File o;
  Handler p;
  ProgressBar q;
  SeekBar r;
  String s;
  private boolean t;
  private boolean u;
  private boolean v;
  private String w;
  private Handler x;
  int y = 0;

  static
  {
    String[] arrayOfString = new String[10];
    char[] arrayOfChar1 = "*kY_!fscK&kzc].sw".toCharArray();
    int i1 = arrayOfChar1.length;
    int i2 = 0;
    char[] arrayOfChar2;
    int i6;
    char[] arrayOfChar3;
    int i10;
    char[] arrayOfChar4;
    int i14;
    char[] arrayOfChar5;
    int i18;
    char[] arrayOfChar6;
    int i22;
    char[] arrayOfChar7;
    int i26;
    char[] arrayOfChar8;
    int i30;
    char[] arrayOfChar9;
    int i34;
    char[] arrayOfChar10;
    int i38;
    if (i1 <= i2)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = ".r{UBocjNL;npR\027".toCharArray();
      int i5 = arrayOfChar2.length;
      i6 = 0;
      if (i5 <= i6)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "a4xL".toCharArray();
        int i9 = arrayOfChar3.length;
        i10 = 0;
        if (i9 > i10)
          break label553;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "=b|S_+X~II&h0LA.~}]N$XyUA*=".toCharArray();
        int i13 = arrayOfChar4.length;
        i14 = 0;
        if (i13 > i14)
          break label645;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "=b|S_+fjXD (|NH.sz".toCharArray();
        int i17 = arrayOfChar5.length;
        i18 = 0;
        if (i17 > i18)
          break label737;
        arrayOfString[4] = new String(arrayOfChar5).intern();
        arrayOfChar6 = ")nsY].sw".toCharArray();
        int i21 = arrayOfChar6.length;
        i22 = 0;
        if (i21 > i22)
          break label829;
        arrayOfString[5] = new String(arrayOfChar6).intern();
        arrayOfChar7 = "?k~EO.dtcB!kf".toCharArray();
        int i25 = arrayOfChar7.length;
        i26 = 0;
        if (i25 > i26)
          break label921;
        arrayOfString[6] = new String(arrayOfChar7).intern();
        arrayOfChar8 = "\"hjRY*c".toCharArray();
        int i29 = arrayOfChar8.length;
        i30 = 0;
        if (i29 > i30)
          break label1013;
        arrayOfString[7] = new String(arrayOfChar8).intern();
        arrayOfChar9 = "%n{".toCharArray();
        int i33 = arrayOfChar9.length;
        i34 = 0;
        if (i33 > i34)
          break label1105;
        arrayOfString[8] = new String(arrayOfChar9).intern();
        arrayOfChar10 = "&t@L_*qvYZ".toCharArray();
        int i37 = arrayOfChar10.length;
        i38 = 0;
        if (i37 > i38)
          break label1197;
        arrayOfString[9] = new String(arrayOfChar10).intern();
        z = arrayOfString;
      }
    }
    else
    {
      int i3 = arrayOfChar1[i2];
      int i4;
      switch (i2 % 5)
      {
      default:
        i4 = 45;
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
        i4 = 79;
        continue;
        i4 = 7;
        continue;
        i4 = 31;
        continue;
        i4 = 60;
      }
    }
    int i7 = arrayOfChar2[i6];
    int i8;
    switch (i6 % 5)
    {
    default:
      i8 = 45;
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
      i8 = 79;
      continue;
      i8 = 7;
      continue;
      i8 = 31;
      continue;
      i8 = 60;
    }
    label553: int i11 = arrayOfChar3[i10];
    int i12;
    switch (i10 % 5)
    {
    default:
      i12 = 45;
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
      i12 = 79;
      continue;
      i12 = 7;
      continue;
      i12 = 31;
      continue;
      i12 = 60;
    }
    label645: int i15 = arrayOfChar4[i14];
    int i16;
    switch (i14 % 5)
    {
    default:
      i16 = 45;
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
      i16 = 79;
      continue;
      i16 = 7;
      continue;
      i16 = 31;
      continue;
      i16 = 60;
    }
    label737: int i19 = arrayOfChar5[i18];
    int i20;
    switch (i18 % 5)
    {
    default:
      i20 = 45;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar5[i18] = (char)(i20 ^ i19);
      i18++;
      break;
      i20 = 79;
      continue;
      i20 = 7;
      continue;
      i20 = 31;
      continue;
      i20 = 60;
    }
    label829: int i23 = arrayOfChar6[i22];
    int i24;
    switch (i22 % 5)
    {
    default:
      i24 = 45;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar6[i22] = (char)(i24 ^ i23);
      i22++;
      break;
      i24 = 79;
      continue;
      i24 = 7;
      continue;
      i24 = 31;
      continue;
      i24 = 60;
    }
    label921: int i27 = arrayOfChar7[i26];
    int i28;
    switch (i26 % 5)
    {
    default:
      i28 = 45;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar7[i26] = (char)(i28 ^ i27);
      i26++;
      break;
      i28 = 79;
      continue;
      i28 = 7;
      continue;
      i28 = 31;
      continue;
      i28 = 60;
    }
    label1013: int i31 = arrayOfChar8[i30];
    int i32;
    switch (i30 % 5)
    {
    default:
      i32 = 45;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar8[i30] = (char)(i32 ^ i31);
      i30++;
      break;
      i32 = 79;
      continue;
      i32 = 7;
      continue;
      i32 = 31;
      continue;
      i32 = 60;
    }
    label1105: int i35 = arrayOfChar9[i34];
    int i36;
    switch (i34 % 5)
    {
    default:
      i36 = 45;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar9[i34] = (char)(i36 ^ i35);
      i34++;
      break;
      i36 = 79;
      continue;
      i36 = 7;
      continue;
      i36 = 31;
      continue;
      i36 = 60;
    }
    label1197: int i39 = arrayOfChar10[i38];
    int i40;
    switch (i38 % 5)
    {
    default:
      i40 = 45;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      arrayOfChar10[i38] = (char)(i40 ^ i39);
      i38++;
      break;
      i40 = 79;
      continue;
      i40 = 7;
      continue;
      i40 = 31;
      continue;
      i40 = 60;
    }
  }

  static Handler a(RecordAudio paramRecordAudio)
  {
    return paramRecordAudio.x;
  }

  static void a(RecordAudio paramRecordAudio, int paramInt)
  {
    paramRecordAudio.c(paramInt);
  }

  static boolean a(RecordAudio paramRecordAudio, boolean paramBoolean)
  {
    paramRecordAudio.t = paramBoolean;
    return paramBoolean;
  }

  private void b()
  {
    this.j = new MediaPlayer();
    try
    {
      this.j.setDataSource(this.w);
      this.j.setOnPreparedListener(new r1(this));
      this.j.setOnErrorListener(new s1(this));
      this.j.prepare();
      g5.b(z[1] + this.j.getDuration());
      this.f = 5;
      TextView localTextView = this.k;
      StringBuilder localStringBuilder = new StringBuilder();
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(0);
      localTextView.setText(getString(2131296802, arrayOfObject) + "%");
      this.r.setMax(this.j.getDuration());
      this.r.setProgress(0);
      this.l.setText(getString(2131296756));
      return;
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        g5.d(localIOException);
        a(2131296991);
      }
    }
  }

  static boolean b(RecordAudio paramRecordAudio)
  {
    return paramRecordAudio.u;
  }

  private void c(int paramInt)
  {
    b();
    this.f = 4;
    this.x.sendEmptyMessage(0);
    this.l.setText(2131296798);
    this.j.start();
    if (paramInt > 0)
    {
      this.j.seekTo(paramInt);
      this.r.setProgress(this.j.getCurrentPosition());
    }
  }

  static boolean c(RecordAudio paramRecordAudio)
  {
    return paramRecordAudio.v;
  }

  static String d(RecordAudio paramRecordAudio)
  {
    return paramRecordAudio.w;
  }

  void a()
  {
    this.i.stop();
    this.i.release();
    this.h = System.currentTimeMillis();
    this.q.setProgress(this.q.getMax());
    TextView localTextView = this.k;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(120);
    localTextView.setText(getString(2131296801, arrayOfObject));
    try
    {
      this.j.setDataSource(this.o.getAbsolutePath());
      this.j.prepare();
      return;
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        g5.d(localIOException);
        finish();
      }
    }
  }

  void b(int paramInt)
  {
    boolean bool = DialogToastListActivity.f;
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    }
    while (true)
    {
      return;
      this.k.setText(2131296799);
      this.m.setText(2131296793);
      this.l.setVisibility(8);
      this.n.setVisibility(0);
      this.q.setProgress(0);
      if (bool)
      {
        this.k.setText(2131296800);
        this.m.setText(2131296795);
        this.l.setVisibility(8);
        this.n.setVisibility(8);
        if (bool)
        {
          TextView localTextView = this.k;
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = Long.valueOf((this.h - this.g) / 1000L);
          localTextView.setText(getString(2131296801, arrayOfObject));
          this.m.setText(2131296796);
          this.l.setVisibility(0);
          this.n.setVisibility(0);
          this.q.setProgress(this.q.getMax());
          if (bool)
          {
            this.k.setText(2131296802);
            this.m.setText(2131296795);
            this.l.setVisibility(8);
            this.n.setVisibility(8);
            if (bool)
            {
              this.l.setVisibility(0);
              this.l.setText(2131296794);
              this.n.setVisibility(0);
              if (this.v)
              {
                this.m.setVisibility(0);
                this.m.setText(2131296840);
              }
              this.r.setVisibility(0);
              this.r.setMax(this.j.getDuration());
              this.q.setVisibility(8);
              if (bool)
                this.l.setText(2131296797);
            }
          }
        }
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    boolean bool = DialogToastListActivity.f;
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    setContentView(2130903121);
    g5.b(z[4]);
    if ((App.bb == null) || (App.c(this) != 3))
      finish();
    while (true)
    {
      return;
      if (!Environment.getExternalStorageState().equals(z[7]))
      {
        showDialog(0);
      }
      else
      {
        this.u = getIntent().getBooleanExtra(z[6], false);
        this.v = getIntent().getBooleanExtra(z[9], false);
        if (this.v)
          this.s = getIntent().getStringExtra(z[8]);
        this.k = ((TextView)findViewById(2131558751));
        this.n = ((Button)findViewById(2131558755));
        this.l = ((Button)findViewById(2131558753));
        this.m = ((Button)findViewById(2131558754));
        this.q = ((ProgressBar)findViewById(2131558752));
        this.r = ((SeekBar)findViewById(2131558717));
        this.j = new MediaPlayer();
        if (this.u)
        {
          this.w = getIntent().getStringExtra(z[5]);
          if (!this.v)
          {
            findViewById(2131558749).setVisibility(8);
            findViewById(2131558480).setVisibility(8);
            if (!bool);
          }
          else
          {
            if (Conversation.a())
              Conversation.b().Fb = true;
            TextView localTextView2 = this.k;
            StringBuilder localStringBuilder = new StringBuilder();
            Object[] arrayOfObject2 = new Object[1];
            arrayOfObject2[0] = Integer.valueOf(0);
            localTextView2.setText(getString(2131296802, arrayOfObject2) + "%");
            this.m.setText(2131296840);
            findViewById(2131558750).setVisibility(0);
            ((TextView)findViewById(2131558749)).setText(2131296552);
            ((TextView)findViewById(2131558750)).setText(this.w.substring(1 + this.w.lastIndexOf("/")));
          }
          g5.b(z[3] + this.w);
          this.r.setOnSeekBarChangeListener(new l1(this));
          if (!bool);
        }
        else
        {
          CharSequence localCharSequence = null;
          if (paramBundle != null)
            localCharSequence = paramBundle.getCharSequence(z[0]);
          if (localCharSequence != null)
          {
            this.o = new File(localCharSequence.toString());
            this.q.setProgress(this.q.getMax());
            TextView localTextView1 = this.k;
            Object[] arrayOfObject1 = new Object[1];
            arrayOfObject1[0] = Integer.valueOf(120);
            localTextView1.setText(getString(2131296801, arrayOfObject1));
          }
        }
        try
        {
          this.j.setDataSource(this.o.getAbsolutePath());
          this.j.prepare();
          this.g = 0L;
          this.h = this.j.getDuration();
          this.f = 2;
          b(2);
          if (bool)
          {
            String str = j5.a(2);
            this.o = App.a(str + z[2], (byte)2);
            this.i = new MediaRecorder();
            this.i.setAudioSource(1);
            this.i.setOutputFormat(1);
            this.i.setAudioEncoder(1);
            this.i.setOutputFile(this.o.getAbsolutePath());
            this.i.setMaxDuration(120000);
            b(0);
          }
          this.n.setOnClickListener(new m1(this));
          this.m.setOnClickListener(new n1(this));
          this.l.setOnClickListener(new q1(this));
          this.p = new od(this);
          this.x = new pd(this);
          if ((this.u) && (!this.v))
            this.l.performClick();
        }
        catch (IOException localIOException)
        {
          g5.d(localIOException);
          finish();
        }
      }
    }
  }

  public Dialog onCreateDialog(int paramInt)
  {
    Object localObject;
    switch (paramInt)
    {
    default:
      localObject = super.onCreateDialog(paramInt);
      return localObject;
    case 0:
    }
    AlertDialog.Builder localBuilder1 = new AlertDialog.Builder(this);
    int i1;
    label49: AlertDialog.Builder localBuilder2;
    if (App.tb())
    {
      i1 = 2131296803;
      localBuilder2 = localBuilder1.setTitle(i1);
      if (!App.tb())
        break label103;
    }
    label103: for (int i2 = 2131296805; ; i2 = 2131296806)
    {
      localObject = localBuilder2.setMessage(i2).setNeutralButton(2131296270, new t1(this)).create();
      break;
      i1 = 2131296804;
      break label49;
    }
  }

  public void onDestroy()
  {
    super.onDestroy();
    if (this.f == 1);
    try
    {
      this.i.stop();
      this.i.release();
      if ((this.j != null) && (this.j.isPlaying()))
        this.j.stop();
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      while (true)
        g5.d(localRuntimeException);
    }
  }

  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    if ((this.f != 0) && (this.o != null))
      paramBundle.putCharSequence(z[0], this.o.getAbsolutePath());
  }
}