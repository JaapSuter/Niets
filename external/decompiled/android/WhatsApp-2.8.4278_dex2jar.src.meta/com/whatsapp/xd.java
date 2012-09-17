package com.whatsapp;

import android.telephony.CellLocation;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;

class xd extends PhoneStateListener
{
  private static final String[] z;
  final VerifyNumber a;

  static
  {
    String[] arrayOfString = new String[5];
    char[] arrayOfChar1 = "\003\025\bbD\f\036\017f@\020\002UxG\007\006\023hGX\003\016jV\020_\025{G\007\021\016dPX\021\026{J\024]\tcM\007\004Z".toCharArray();
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
    if (i <= j)
    {
      arrayOfString[0] = new String(arrayOfChar1).intern();
      arrayOfChar2 = "\003\025\bbD\f\036\017f@\020\002UxG\007\006\023hGX\003\016jV\020_\bdC\030\031\024l\002".toCharArray();
      int n = arrayOfChar2.length;
      i1 = 0;
      if (n <= i1)
      {
        arrayOfString[1] = new String(arrayOfChar2).intern();
        arrayOfChar3 = "\003\025\bbD\f\036\017f@\020\002UxG\007\006\023hGX\003\016jV\020_\tC\001\025Z".toCharArray();
        int i4 = arrayOfChar3.length;
        i5 = 0;
        if (i4 > i5)
          break label365;
        arrayOfString[2] = new String(arrayOfChar3).intern();
        arrayOfChar4 = "\003\025\bbD\f\036\017f@\020\002UxG\007\006\023hGX\003\016jV\020_\025{G\007\021\016dPX\036\017fG\007\031\031+".toCharArray();
        int i8 = arrayOfChar4.length;
        i9 = 0;
        if (i8 > i9)
          break label457;
        arrayOfString[3] = new String(arrayOfChar4).intern();
        arrayOfChar5 = "\003\025\bbD\f\036\017f@\020\002UxG\007\006\023hGX\003\016jV\020_\025{G\007\021\016dPX\021\026{J\024]\026dL\022P".toCharArray();
        int i12 = arrayOfChar5.length;
        i13 = 0;
        if (i12 > i13)
          break label549;
        arrayOfString[4] = new String(arrayOfChar5).intern();
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
        m = 34;
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
        m = 117;
        continue;
        m = 112;
        continue;
        m = 122;
        continue;
        m = 11;
      }
    }
    int i2 = arrayOfChar2[i1];
    int i3;
    switch (i1 % 5)
    {
    default:
      i3 = 34;
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
      i3 = 117;
      continue;
      i3 = 112;
      continue;
      i3 = 122;
      continue;
      i3 = 11;
    }
    label365: int i6 = arrayOfChar3[i5];
    int i7;
    switch (i5 % 5)
    {
    default:
      i7 = 34;
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
      i7 = 117;
      continue;
      i7 = 112;
      continue;
      i7 = 122;
      continue;
      i7 = 11;
    }
    label457: int i10 = arrayOfChar4[i9];
    int i11;
    switch (i9 % 5)
    {
    default:
      i11 = 34;
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
      i11 = 117;
      continue;
      i11 = 112;
      continue;
      i11 = 122;
      continue;
      i11 = 11;
    }
    label549: int i14 = arrayOfChar5[i13];
    int i15;
    switch (i13 % 5)
    {
    default:
      i15 = 34;
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
      i15 = 117;
      continue;
      i15 = 112;
      continue;
      i15 = 122;
      continue;
      i15 = 11;
    }
  }

  xd(VerifyNumber paramVerifyNumber)
  {
  }

  public void onCallForwardingIndicatorChanged(boolean paramBoolean)
  {
  }

  public void onCallStateChanged(int paramInt, String paramString)
  {
  }

  public void onCellLocationChanged(CellLocation paramCellLocation)
  {
    if (paramCellLocation == null);
  }

  public void onDataActivity(int paramInt)
  {
  }

  public void onDataConnectionStateChanged(int paramInt)
  {
  }

  public void onDataConnectionStateChanged(int paramInt1, int paramInt2)
  {
  }

  public void onMessageWaitingIndicatorChanged(boolean paramBoolean)
  {
  }

  public void onServiceStateChanged(ServiceState paramServiceState)
  {
    if (paramServiceState == null);
    while (true)
    {
      return;
      this.a.k = paramServiceState.getRoaming();
      g5.b(z[4] + paramServiceState.getOperatorAlphaLong());
      g5.b(z[0] + paramServiceState.getOperatorAlphaShort());
      g5.b(z[3] + paramServiceState.getOperatorNumeric());
      g5.b(z[1] + this.a.k);
      g5.b(z[2] + paramServiceState.getState());
      this.a.a(paramServiceState);
    }
  }

  public void onSignalStrengthChanged(int paramInt)
  {
  }

  public void onSignalStrengthsChanged(SignalStrength paramSignalStrength)
  {
    if (paramSignalStrength == null);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.xd
 * JD-Core Version:    0.6.1
 */