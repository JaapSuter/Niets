import com.whatsapp.App;
import com.whatsapp.g5;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.net.QuotedPrintableCodec;

public class q
  implements f
{
  public static String a = z(z("XY[St"));
  private static final String[] z;
  public List<r> b = new ArrayList();
  private int c = 0;
  private r d;
  private e e;
  private String f;
  private String g;
  private String h;
  private boolean i;

  static
  {
    String[] arrayOfString = new String[10];
    arrayOfString[0] = z(z("\\XR*\tI M,\005CY\\<��H"));
    arrayOfString[1] = z(z("ih~\021(hO|\r);9'.\004BYR"));
    arrayOfString[2] = z(z("Klt\022)i-i\021lhc~\021(h7=\035$ln\03380"));
    arrayOfString[3] = z(z("��\007"));
    arrayOfString[4] = z(z("Klt\022)i-i\021lih~\021(h-l\013#yhyS<ds\n-oaxDl"));
    arrayOfString[5] = z(z("0\004"));
    arrayOfString[6] = z(z("0-"));
    arrayOfString[7] = z(z("OLN;z9"));
    arrayOfString[8] = z(z("YTM;"));
    arrayOfString[9] = z(z("}r\016)yd.-lp(-axxQ\"byB\r8bxD"));
    z = arrayOfString;
  }

  public q()
  {
    this(a, a, false);
  }

  public q(String paramString1, String paramString2, boolean paramBoolean)
  {
    if (paramString1 != null)
    {
      this.g = paramString1;
      if (!bool);
    }
    else
    {
      this.g = a;
    }
    if (paramString2 != null)
    {
      this.h = paramString2;
      if (!bool);
    }
    else
    {
      this.h = a;
    }
    this.i = paramBoolean;
  }

  private String a(String paramString1, String paramString2)
  {
    if (this.g.equalsIgnoreCase(paramString2));
    while (true)
    {
      return paramString1;
      ByteBuffer localByteBuffer = Charset.forName(this.g).encode(paramString1);
      byte[] arrayOfByte = new byte[localByteBuffer.remaining()];
      localByteBuffer.get(arrayOfByte);
      try
      {
        paramString1 = new String(arrayOfByte, paramString2);
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        g5.d(z[2] + paramString2);
        paramString1 = new String(arrayOfByte);
      }
    }
  }

  private String a(String paramString1, String paramString2, String paramString3)
  {
    boolean bool = e.g;
    String[] arrayOfString;
    Object localObject1;
    ArrayList localArrayList;
    int k;
    label143: Object localObject2;
    int i3;
    label269: int i4;
    if (paramString3 != null)
    {
      if ((paramString3.equals(z[7])) || (paramString3.equals("B")))
      {
        g5.d(z[1]);
        this.e.d = Base64.decodeBase64(paramString1.getBytes());
        return paramString1;
      }
      if (paramString3.equals(z[0]))
      {
        String str1 = paramString1.replaceAll(z[6], " ").replaceAll(z[5], "\t");
        if (this.i)
        {
          arrayOfString = str1.split(z[3]);
          if (!bool);
        }
        else
        {
          localObject1 = new StringBuilder();
          int j = str1.length();
          localArrayList = new ArrayList();
          k = 0;
          if (k >= j)
            break label607;
          char c1 = str1.charAt(k);
          if (c1 == '\n')
          {
            localArrayList.add(((StringBuilder)localObject1).toString());
            localObject1 = new StringBuilder();
            if (!bool)
              break label592;
          }
          if (c1 == '\r')
          {
            localArrayList.add(((StringBuilder)localObject1).toString());
            localObject1 = new StringBuilder();
            if (k >= j - 1)
              break label577;
            if (str1.charAt(k + 1) == '\n')
              k++;
            if (!bool)
              break label577;
          }
          ((StringBuilder)localObject1).append(c1);
          int i2 = k;
          localObject2 = localObject1;
          i3 = i2;
          i4 = i3 + 1;
          if (!bool)
            break label566;
        }
      }
    }
    while (true)
    {
      String str2 = localObject2.toString();
      if (str2.length() > 0)
        localArrayList.add(str2);
      arrayOfString = (String[])localArrayList.toArray(new String[0]);
      StringBuilder localStringBuilder = new StringBuilder();
      int m = arrayOfString.length;
      int i1;
      label559: for (int n = 0; ; n = i1)
      {
        while (true)
        {
          if (n < m)
          {
            String str3 = arrayOfString[n];
            if (str3.endsWith("="))
              str3 = str3.substring(0, -1 + str3.length());
            localStringBuilder.append(str3);
            i1 = n + 1;
            if (!bool)
              break label559;
          }
          try
          {
            byte[] arrayOfByte3 = localStringBuilder.toString().getBytes(this.g);
            arrayOfByte1 = arrayOfByte3;
          }
          catch (UnsupportedEncodingException localUnsupportedEncodingException1)
          {
            try
            {
              while (true)
              {
                while (true)
                {
                  byte[] arrayOfByte2 = QuotedPrintableCodec.decodeQuotedPrintable(arrayOfByte1);
                  try
                  {
                    paramString1 = new String(arrayOfByte2, paramString2);
                  }
                  catch (UnsupportedEncodingException localUnsupportedEncodingException2)
                  {
                    g5.d(z[2] + paramString2);
                    paramString1 = new String(arrayOfByte2);
                  }
                }
                break;
                localUnsupportedEncodingException1 = localUnsupportedEncodingException1;
                g5.d(z[2] + this.g);
                byte[] arrayOfByte1 = localStringBuilder.toString().getBytes();
              }
            }
            catch (DecoderException localDecoderException)
            {
              g5.d(z[4] + localDecoderException);
              paramString1 = "";
            }
          }
        }
        break;
        paramString1 = a(paramString1, paramString2);
        break;
      }
      label566: localObject1 = localObject2;
      k = i4;
      break label143;
      label577: int i5 = k;
      localObject2 = localObject1;
      i3 = i5;
      break label269;
      label592: int i6 = k;
      localObject2 = localObject1;
      i3 = i6;
      break label269;
      label607: localObject2 = localObject1;
    }
  }

  private String a(List<String> paramList)
  {
    boolean bool = e.g;
    int j = paramList.size();
    StringBuilder localStringBuilder;
    String str;
    if (j > 1)
    {
      localStringBuilder = new StringBuilder();
      Iterator localIterator = paramList.iterator();
      do
      {
        if (!localIterator.hasNext())
          break;
        localStringBuilder.append((String)localIterator.next()).append(";");
      }
      while (!bool);
      int k = localStringBuilder.length();
      if ((k > 0) && (localStringBuilder.charAt(k - 1) == ';'))
        str = localStringBuilder.substring(0, k - 1);
    }
    while (true)
    {
      return str;
      str = localStringBuilder.toString();
      continue;
      if (j == 1)
        str = (String)paramList.get(0);
      else
        str = "";
    }
  }

  private static String z(char[] paramArrayOfChar)
  {
    int j = paramArrayOfChar.length;
    int k = 0;
    if (j <= k)
      return new String(paramArrayOfChar).intern();
    int m = paramArrayOfChar[k];
    int n;
    switch (k % 5)
    {
    default:
      n = 76;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      paramArrayOfChar[k] = (char)(n ^ m);
      k++;
      break;
      n = 13;
      continue;
      n = 13;
      continue;
      n = 29;
      continue;
      n = 126;
    }
  }

  private static char[] z(String paramString)
  {
    char[] arrayOfChar = paramString.toCharArray();
    if (arrayOfChar.length < 2)
      arrayOfChar[0] = (char)(0x4C ^ arrayOfChar[0]);
    return arrayOfChar;
  }

  public void a()
  {
  }

  public void a(String paramString)
  {
    boolean bool1 = e.g;
    r localr = new r();
    localr.c = 1;
    localr.a = paramString;
    this.b.add(localr);
    this.c = (-1 + this.b.size());
    this.d = ((r)this.b.get(this.c));
    if (App.wc != 0)
      if (!bool1)
        break label88;
    label88: for (boolean bool2 = false; ; bool2 = true)
    {
      e.g = bool2;
      return;
    }
  }

  public void a(List<String> paramList)
  {
    boolean bool = e.g;
    if ((paramList == null) || (paramList.size() == 0))
    {
      this.e.d = null;
      this.e.c.clear();
      this.e.c.add("");
      this.e.b = "";
      return;
    }
    String str1 = a;
    if ((str1 == null) || (str1.length() == 0));
    for (String str2 = this.h; ; str2 = str1)
    {
      Iterator localIterator = paramList.iterator();
      do
      {
        if (!localIterator.hasNext())
          break;
        String str3 = (String)localIterator.next();
        this.e.c.add(a(str3, str2, null));
      }
      while (!bool);
      this.e.b = a(this.e.c);
      break;
    }
  }

  public void b()
  {
  }

  public void b(String paramString)
  {
    this.e.f.add(paramString);
  }

  public void c()
  {
    ((r)this.b.get(this.c)).c = 0;
    do
    {
      if (this.c <= 0)
        break;
      this.c = (-1 + this.c);
    }
    while (((r)this.b.get(this.c)).c != 1);
    this.d = ((r)this.b.get(this.c));
  }

  public void c(String paramString)
  {
    this.e.a = paramString;
  }

  public void d()
  {
    this.e = new e();
  }

  public void d(String paramString)
  {
    this.f = paramString;
  }

  public void e()
  {
    this.d.b.add(this.e);
  }

  public void e(String paramString)
  {
    if ((this.f == null) || (this.f.equalsIgnoreCase(z[8])))
    {
      this.e.e.add(paramString);
      if (!e.g);
    }
    else
    {
      g5.b(z[9] + paramString);
    }
    this.f = null;
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     q
 * JD-Core Version:    0.6.1
 */