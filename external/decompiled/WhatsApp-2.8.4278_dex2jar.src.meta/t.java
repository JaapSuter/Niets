import com.whatsapp.App;
import java.util.Locale;

public class t
{
  private static final String[] a = arrayOfString;
  public static int b;
  private static final String z = z(z("!\032|cyd\006?cy'E?cy"));

  static
  {
    String[] arrayOfString = new String[24];
    arrayOfString[0] = z(z("_x"));
    arrayOfString[1] = z(z("Ij"));
    arrayOfString[2] = z(z("Kx"));
    arrayOfString[3] = z(z("Kb"));
    arrayOfString[4] = z(z("Kl"));
    arrayOfString[5] = z(z("Hx"));
    arrayOfString[6] = z(z("Hi"));
    arrayOfString[7] = z(z("Hf"));
    arrayOfString[8] = z(z("\\l"));
    arrayOfString[9] = z(z("Ar"));
    arrayOfString[10] = z(z("Nf"));
    arrayOfString[11] = z(z("Nd"));
    arrayOfString[12] = z(z("Mo"));
    arrayOfString[13] = z(z("M~"));
    arrayOfString[14] = z(z("@f"));
    arrayOfString[15] = z(z("Zy"));
    arrayOfString[16] = z(z("Gx"));
    arrayOfString[17] = z(z("D{"));
    arrayOfString[18] = z(z("Ae"));
    arrayOfString[19] = z(z("Fh"));
    arrayOfString[20] = z(z("\\h"));
    arrayOfString[21] = z(z("^"));
    arrayOfString[22] = z(z("^h"));
    arrayOfString[23] = z(z("\\b"));
  }

  public static int a(Locale paramLocale)
  {
    int i = 0;
    int j = b;
    String str = paramLocale.getCountry();
    int k = a.length;
    int m = 0;
    if (m < k)
      if (a[m].equals(str))
        i = 1;
    while (true)
    {
      return i;
      m++;
      if (j == 0)
        break;
      App.wc = 1 + App.wc;
      if (paramLocale.equals(Locale.JAPAN))
        i = 2;
    }
  }

  public static String a(String paramString)
  {
    eb localeb = new eb(paramString);
    a(localeb, a(Locale.getDefault()));
    return localeb.toString();
  }

  public static void a(v paramv)
  {
    int i = 0;
    int j = b;
    int k = paramv.length();
    if (k > z.length());
    CharSequence localCharSequence;
    label85: int n;
    int[] arrayOfInt;
    int i1;
    int i2;
    int i3;
    int i4;
    while (true)
    {
      return;
      localCharSequence = paramv.subSequence(0, k);
      int m = 0;
      do
      {
        do
        {
          if (m >= paramv.length())
            break label85;
          if (paramv.charAt(m) != '-')
            break;
          paramv.a(m, m + 1);
        }
        while (j == 0);
        m++;
      }
      while (j == 0);
      n = paramv.length();
      arrayOfInt = new int[3];
      i1 = 0;
      i2 = 0;
      i3 = 1;
      i4 = 0;
      label110: if (i1 >= n)
        break;
      switch (paramv.charAt(i1))
      {
      case ',':
      case '.':
      case '/':
      default:
        label200: paramv.a(0, n, localCharSequence);
      case '1':
      case '-':
      case '+':
      case '0':
      case '2':
      case '3':
      case '4':
      case '5':
      case '6':
      case '7':
      case '8':
      case '9':
      }
    }
    if ((i2 == 0) || (i3 == 2))
      if (j == 0);
    for (int i9 = 3; ; i9 = i3)
    {
      if (i9 == 2)
      {
        paramv.a(0, n, localCharSequence);
        break;
      }
      int i11;
      if (i9 == 3)
      {
        i11 = i4 + 1;
        arrayOfInt[i4] = i1;
        if (j != 0)
          i4 = i11;
      }
      else
      {
        if ((i9 == 4) || ((i2 != 3) && (i2 != 6)))
          break label317;
        i11 = i4 + 1;
        arrayOfInt[i4] = i1;
      }
      i4 = i11;
      label317: i2++;
      if (j != 0)
        if (j != 0)
        {
          if ((i1 != 0) || (j != 0))
            break label200;
          i3 = 2;
        }
      while (true)
      {
        int i10 = i1 + 1;
        if (j != 0)
        {
          int i5 = i2;
          int i6 = i4;
          if (i5 == 7)
            i6--;
          do
          {
            if (i >= i6)
              break;
            int i8 = arrayOfInt[i];
            paramv.a(i8 + i, i8 + i, "-");
            i++;
          }
          while (j == 0);
          int i7 = paramv.length();
          do
          {
            if ((i7 <= 0) || (paramv.charAt(i7 - 1) != '-'))
              break;
            paramv.a(i7 - 1, i7);
            i7--;
          }
          while (j == 0);
          break;
        }
        i1 = i10;
        break label110;
        i3 = 4;
        continue;
        i3 = 1;
        continue;
        i3 = 3;
      }
    }
  }

  public static void a(v paramv, int paramInt)
  {
    int i = b;
    if ((paramv.length() > 2) && (paramv.charAt(0) == '+'))
    {
      if ((paramv.charAt(1) == '1') && (i == 0))
        break label125;
      if ((paramv.length() < 3) || (paramv.charAt(1) != '8') || (paramv.charAt(2) != '1') || (i != 0))
        return;
    }
    label125: for (paramInt = 2; ; paramInt = 1)
      switch (paramInt)
      {
      default:
        break;
      case 1:
        a(paramv);
        break;
      case 2:
        b(paramv);
        break;
      }
  }

  public static void b(v paramv)
  {
    s.a(paramv);
  }

  private static String z(char[] paramArrayOfChar)
  {
    int i = paramArrayOfChar.length;
    int j = 0;
    if (i <= j)
      return new String(paramArrayOfChar).intern();
    int k = paramArrayOfChar[j];
    int m;
    switch (j % 5)
    {
    default:
      m = 23;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      paramArrayOfChar[j] = (char)(m ^ k);
      j++;
      break;
      m = 10;
      continue;
      m = 43;
      continue;
      m = 81;
      continue;
      m = 13;
    }
  }

  private static char[] z(String paramString)
  {
    char[] arrayOfChar = paramString.toCharArray();
    if (arrayOfChar.length < 2)
      arrayOfChar[0] = (char)(0x17 ^ arrayOfChar[0]);
    return arrayOfChar;
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     t
 * JD-Core Version:    0.6.1
 */