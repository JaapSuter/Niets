import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract.CommonDataKinds.Email;
import android.provider.ContactsContract.CommonDataKinds.Im;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.provider.ContactsContract.CommonDataKinds.StructuredPostal;
import android.provider.ContactsContract.Data;
import com.whatsapp.App;
import com.whatsapp.g5;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class g
{
  public static HashMap<String, Integer> a;
  public static HashMap<String, String> b;
  private static final String[] z;
  public j c = new j();
  public String d;
  public List<String> e = new ArrayList();
  public byte[] f;
  public String g;
  public List<l> h;
  public List<i> i;
  public List<k> j;
  public Map<String, List<e>> k;
  private Context l;

  static
  {
    String[] arrayOfString = new String[76];
    arrayOfString[0] = z(z(";xk!\002"));
    arrayOfString[1] = z(z("6j@0A6t~2J"));
    arrayOfString[2] = z(z(";xk!\001"));
    arrayOfString[3] = z(z(";xk!��"));
    arrayOfString[4] = z(z("<vq4R<m@)W$?"));
    arrayOfString[5] = z(z(";xk!\002j"));
    arrayOfString[6] = z(z(")w{nR1}m/Z;7|5A,vmnZ+|roC7vk/"));
    arrayOfString[7] = z(z("<vq4R<m@)W$?\023\036W[`^6tz4J/|?}\023`9"));
    arrayOfString[8] = z(z("\nMYm\013"));
    arrayOfString[9] = z(z("\034vj,Wwp4\023/xm3Vo\\!A;9y)_:#?"));
    arrayOfString[10] = z(z(")w{nR1}m/Z;7|5A,vmnZ+|ro]6zt.R2|"));
    arrayOfString[11] = z(z("<vq4R<m@)W$?\023\036W[`^6tz4J/|?}\023`"));
    arrayOfString[12] = z(z("\021P\\\013}\036TZ"));
    arrayOfString[13] = z(z(";xk!\004"));
    arrayOfString[14] = z(z(")w{nR1}m/Z;7|5A,vmnZ+|ro]>tz"));
    arrayOfString[15] = z(z("<vq4R<m@)W$?\023\036W[`^6tz4J/|\""));
    arrayOfString[16] = z(z(";xk!\n"));
    arrayOfString[17] = z(z(";xk!\007"));
    arrayOfString[18] = z(z(";xk!\006"));
    arrayOfString[19] = z(z(";xk!\005"));
    arrayOfString[20] = z(z(";xk!\013"));
    arrayOfString[21] = z(z(";xk!\002o"));
    arrayOfString[22] = z(z("w\024\025<>#\023cJ>v"));
    arrayOfString[23] = z(z(")w{nR1}m/Z;7|5A,vmnZ+|ro\\-~~.Z%xk)\\1"));
    arrayOfString[24] = z(z("\024\\F"));
    arrayOfString[25] = z(z("1xr%\034\023VX\017\034(|@$\\1>k\037@*io/A+"));
    arrayOfString[26] = z(z("\021VK\005"));
    arrayOfString[27] = z(z("\t\\M\023z\020W"));
    arrayOfString[28] = z(z("\030\\P"));
    arrayOfString[29] = z(z("\rVS\005"));
    arrayOfString[30] = z(z("\022XV\fv\r"));
    arrayOfString[31] = z(z("\fVJ\022p\032"));
    arrayOfString[32] = z(z("\027VR\005"));
    arrayOfString[33] = z(z("\013C"));
    arrayOfString[34] = z(z("\031W"));
    arrayOfString[35] = z(z("\021vq`e\034XM\004\023;xk!\0236j?)],|m4V;7"));
    arrayOfString[36] = z(z("\026WK\f"));
    arrayOfString[37] = z(z("\034U^\023`"));
    arrayOfString[38] = z(z("\0074O\b|\021\\K\tpr_V\022`\0134Q\001~\032"));
    arrayOfString[39] = z(z(">uv.\034\nw|!F8qk`v'zz0G6vqop0wk!P+Jk2F<m%"));
    arrayOfString[40] = z(z("\034XK\005t\020KV\005`"));
    arrayOfString[41] = z(z("\034VR\020r\021@"));
    arrayOfString[42] = z(z("\0074"));
    arrayOfString[43] = z(z("\017KP\006z\023\\"));
    arrayOfString[44] = z(z("\fVM\024\036\fMM\t}\030"));
    arrayOfString[45] = z(z("\031XG"));
    arrayOfString[46] = z(z("\017VL\024r\023"));
    arrayOfString[47] = z(z("\0074V\022~\0344Q"));
    arrayOfString[48] = z(z("\023VX\017"));
    arrayOfString[49] = z(z("\nKS"));
    arrayOfString[50] = z(z("\0074O\b|\021\\K\tprTV\004w\023\\2\016r\022\\"));
    arrayOfString[51] = z(z("\034\\S\f"));
    arrayOfString[52] = z(z("\017XM\003v\023"));
    arrayOfString[53] = z(z("\0074O\b|\021\\K\tprU^\023grW^\rv"));
    arrayOfString[54] = z(z("\017KP\004z\033"));
    arrayOfString[55] = z(z("\035]^\031"));
    arrayOfString[56] = z(z("\020KX"));
    arrayOfString[57] = z(z("\r\\I"));
    arrayOfString[58] = z(z("\017XX\005a"));
    arrayOfString[59] = z(z("\021XR\005"));
    arrayOfString[60] = z(z("\032T^\t"));
    arrayOfString[61] = z(z("\017KZ\006"));
    arrayOfString[62] = z(z("\fVJ\016w"));
    arrayOfString[63] = z(z("\013\\S"));
    arrayOfString[64] = z(z("\013PK\fv"));
    arrayOfString[65] = z(z("\036]M"));
    arrayOfString[66] = z(z("\bVM\013"));
    arrayOfString[67] = z(z("\033VR"));
    arrayOfString[68] = z(z("\022JX"));
    arrayOfString[69] = z(z("\tVV\003v"));
    arrayOfString[70] = z(z("\nP["));
    arrayOfString[71] = z(z("\017QP\024|"));
    arrayOfString[72] = z(z("\tZ^\022w"));
    arrayOfString[73] = z(z(")w{nR1}m/Z;7|5A,vmnZ+|roP0wk!P+Fz6V1m"));
    arrayOfString[74] = z(z("<vq4R<m@)W$?\023\036W[`^6tz4J/|?}\023`9^\016w}~4Rm9\"\023"));
    arrayOfString[75] = z(z(")w{nR1}m/Z;7|5A,vmnZ+|roZ2"));
    z = arrayOfString;
    a = new HashMap();
    b = new HashMap();
    a.put(z(z("\0074^\t~")), Integer.valueOf(0));
    a.put(z(z("\0074R\023}")), Integer.valueOf(1));
    a.put(z(z("\0074F\001{\020V")), Integer.valueOf(2));
    a.put(z(z("\0074X\017|\030UZmg\036UT")), Integer.valueOf(5));
    a.put(z(z("\0074X\017|\030UZ`g\036U")), Integer.valueOf(5));
    a.put(z(z("\0074V\003b")), Integer.valueOf(6));
    a.put(z(z("\0074U\001q\035\\M")), Integer.valueOf(7));
    a.put(z(z("\0074L\013j\017\\2\025`\032KQ\001~\032")), Integer.valueOf(3));
    b.put(z(z("\0074^\t~")), z(z("\036PR")));
    b.put(z(z("\0074R\023}")), z(z("\bpq$\\(j?\fZ)|")));
    b.put(z(z("\0074F\001{\020V")), z(z("\006XW\017|")));
    b.put(z(z("\0074X\017|\030UZmg\036UT")), z(z("\030vp'_:9K!_4")));
    b.put(z(z("\0074X\017|\030UZ`g\036U")), z(z("\030vp'_:9K!_4")));
    b.put(z(z("\0074V\003b")), z(z("\026ZN")));
    b.put(z(z("\0074U\001q\035\\M")), z(z("\025x}\"V-")));
    b.put(z(z("\0074L\013j\017\\2\025`\032KQ\001~\032")), z(z("\frf0V")));
    b.put(z[12], z(z("\021p|+]>tz")));
    b.put(z[55], z(z("\035pm4[;xf")));
  }

  public g()
  {
  }

  public g(Context paramContext)
  {
    this.l = paramContext;
  }

  public static g a(r paramr, int paramInt, String paramString)
  {
    boolean bool1 = b.a;
    if (!paramr.a.equals(z[72]))
    {
      g5.d(z[35]);
      localg = null;
      return localg;
    }
    g localg = new g();
    Iterator localIterator1 = paramr.b.iterator();
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    e locale;
    String str1;
    int i7;
    int i3;
    int i4;
    int i5;
    while (true)
      if (localIterator1.hasNext())
      {
        locale = (e)localIterator1.next();
        str1 = locale.a;
        if ((!hb.a(locale.b)) || (bool1))
          if (str1.equals(z[27]))
          {
            i7 = m;
            i3 = i1;
            i4 = i2;
            i5 = n;
            label139: if (!bool1)
              break label2751;
            m = i7;
          }
      }
    while (true)
    {
      if ((i3 == 0) && (localg.h != null) && (localg.h.size() > 0))
        ((l)localg.h.get(0)).d = true;
      if ((i4 == 0) && (localg.i != null))
      {
        Iterator localIterator3 = localg.i.iterator();
        do
        {
          if (!localIterator3.hasNext())
            break;
          i locali2 = (i)localIterator3.next();
          if (locali2.a == ContactsContract.CommonDataKinds.StructuredPostal.class)
          {
            locali2.f = true;
            if (!bool1)
              break;
          }
        }
        while (!bool1);
      }
      if ((i5 == 0) && (localg.i != null))
      {
        Iterator localIterator2 = localg.i.iterator();
        do
        {
          if (!localIterator2.hasNext())
            break;
          i locali1 = (i)localIterator2.next();
          if (locali1.a == ContactsContract.CommonDataKinds.Email.class)
          {
            locali1.f = true;
            if (!bool1)
              break;
          }
        }
        while (!bool1);
      }
      if ((m != 0) || (localg.j == null) || (localg.j.size() <= 0))
        break;
      ((k)localg.j.get(0)).d = true;
      break;
      if (str1.equals(z[34]))
      {
        localg.c.a = locale.b;
        if (!bool1);
      }
      else if ((str1.equals(z[59])) && (localg.c.a == null))
      {
        localg.c.a = locale.b;
        if (!bool1);
      }
      else if (str1.equals("N"))
      {
        a(localg.c, locale.c, paramInt);
        if (!bool1);
      }
      else if (str1.equals(z[44]))
      {
        localg.d = locale.b;
        if (!bool1);
      }
      else if (str1.equals(z[62]))
      {
        if ((locale.e.contains(z[47])) && (localg.d == null))
        {
          StringBuilder localStringBuilder2 = new StringBuilder();
          String str6 = locale.b;
          int i24 = str6.length();
          int i25 = 0;
          do
          {
            if (i25 >= i24)
              break;
            char c1 = str6.charAt(i25);
            if (c1 != ';')
              localStringBuilder2.append(c1);
            i25++;
          }
          while (!bool1);
          localg.d = localStringBuilder2.toString();
          if (!bool1);
        }
        else
        {
          localg.a(locale);
          if (!bool1);
        }
      }
      else
      {
        int i16;
        label671: int i17;
        label704: label708: int i18;
        Object localObject6;
        int i19;
        boolean bool10;
        label745: String str5;
        boolean bool12;
        Object localObject8;
        int i22;
        int i23;
        label892: boolean bool11;
        int i6;
        int i20;
        Object localObject7;
        label912: String str4;
        if (str1.equals(z[65]))
        {
          Iterator localIterator8 = locale.c.iterator();
          i16 = 1;
          if (localIterator8.hasNext())
            if (((String)localIterator8.next()).length() > 0)
            {
              i17 = 0;
              if (bool1)
              {
                if (!bool1);
              }
              else
              {
                if ((i17 != 0) && (!bool1))
                  break label2950;
                i18 = -1;
                localObject6 = "";
                Iterator localIterator9 = locale.e.iterator();
                i19 = i2;
                bool10 = false;
                if (localIterator9.hasNext())
                {
                  str5 = (String)localIterator9.next();
                  if ((str5.equals(z[61])) && (i19 == 0))
                  {
                    i19 = 1;
                    bool10 = true;
                    if (!bool1);
                  }
                  else if (str5.equalsIgnoreCase(z[32]))
                  {
                    i18 = 1;
                    localObject6 = "";
                    if (!bool1);
                  }
                  else if ((str5.equalsIgnoreCase(z[66])) || (str5.equalsIgnoreCase(z[41])))
                  {
                    i18 = 2;
                    localObject6 = "";
                    if (!bool1);
                  }
                  else if (str5.equalsIgnoreCase(z[46]))
                  {
                    bool12 = bool10;
                    localObject8 = localObject6;
                    i22 = i18;
                    i23 = i19;
                    if (!bool1)
                      break label2912;
                    bool11 = bool12;
                    i6 = i23;
                    i20 = i22;
                    localObject7 = localObject8;
                    if (i20 < 0)
                      i20 = 1;
                    List localList2 = locale.c;
                    int i21 = localList2.size();
                    h localh = null;
                    if (i21 <= 1)
                      break label2620;
                    localh = new h();
                    if (localList2.size() > 2)
                      localh.a = ((String)localList2.get(2));
                    if (localList2.size() > 3)
                      localh.b = ((String)localList2.get(3));
                    if (localList2.size() > 4)
                      localh.c = ((String)localList2.get(4));
                    if (localList2.size() > 5)
                      localh.d = ((String)localList2.get(5));
                    if (localList2.size() > 6)
                      localh.e = ((String)localList2.get(6));
                    if (localList2.size() > 7)
                    {
                      localh.f = ((String)localList2.get(7));
                      if (!bool1);
                    }
                    else
                    {
                      g5.b(z[39] + paramString);
                    }
                    str4 = localh.toString().trim();
                    label1160: localg.a(i20, str4, localh, localObject7, bool11);
                    if (!bool1)
                      break label2732;
                  }
                }
              }
            }
        }
        while (true)
        {
          boolean bool8;
          if (str1.equals(z[56]))
          {
            Iterator localIterator6 = locale.e.iterator();
            bool8 = false;
            label1208: if (localIterator6.hasNext())
            {
              if ((!((String)localIterator6.next()).equals(z[61])) || (m != 0))
                break label2867;
              m = 1;
            }
          }
          label1669: label2732: label2867: for (boolean bool9 = true; ; bool9 = bool8)
          {
            if (bool1)
            {
              bool8 = bool9;
              List localList1 = locale.c;
              StringBuilder localStringBuilder1 = new StringBuilder();
              Iterator localIterator7 = localList1.iterator();
              do
              {
                do
                {
                  if (!localIterator7.hasNext())
                    break;
                  localStringBuilder1.append((String)localIterator7.next());
                }
                while (!localIterator7.hasNext());
                localStringBuilder1.append(' ');
              }
              while (!bool1);
              localg.b(1, localStringBuilder1.toString(), "", bool8);
              Iterator localIterator5;
              int i13;
              Object localObject3;
              if (bool1)
                if (str1.equals(z[64]))
                {
                  localg.a(locale.b);
                  if (!bool1);
                }
                else if (str1.equals(z[29]))
                {
                  localg.a(locale.b);
                  if (!bool1);
                }
                else if (str1.equals(z[71]))
                {
                  localg.f = locale.b.getBytes();
                  if (!bool1);
                }
                else if (str1.equals(z[48]))
                {
                  g5.d(z[25]);
                  if (!bool1);
                }
                else if (str1.equals(z[60]))
                {
                  localIterator5 = locale.e.iterator();
                  i13 = -1;
                  localObject3 = null;
                }
              boolean bool7;
              for (boolean bool5 = false; ; bool5 = bool7)
              {
                int i15;
                Object localObject5;
                boolean bool6;
                Object localObject4;
                int i14;
                if (localIterator5.hasNext())
                {
                  String str3 = (String)localIterator5.next();
                  if ((str3.equals(z[61])) && (n == 0))
                  {
                    n = 1;
                    bool5 = true;
                    if (!bool1);
                  }
                  else if (str3.equalsIgnoreCase(z[32]))
                  {
                    i13 = 1;
                    if (!bool1);
                  }
                  else if (str3.equalsIgnoreCase(z[66]))
                  {
                    i13 = 2;
                    if (!bool1);
                  }
                  else if (str3.equalsIgnoreCase(z[51]))
                  {
                    i13 = 4;
                    if (!bool1);
                  }
                  else if ((str3.toUpperCase().startsWith(z[42])) && (i13 < 0))
                  {
                    i13 = 0;
                    localObject3 = str3.substring(2);
                    if (!bool1);
                  }
                  else if (i13 < 0)
                  {
                    i15 = 0;
                    bool7 = bool5;
                    localObject5 = str3;
                    if (!bool1)
                      break label2845;
                    bool6 = bool7;
                    localObject4 = localObject5;
                    i14 = i15;
                  }
                }
                while (true)
                {
                  if (i14 < 0)
                    i14 = 3;
                  localg.a(ContactsContract.CommonDataKinds.Email.class, i14, locale.b, localObject4, bool6);
                  Iterator localIterator4;
                  int i8;
                  Object localObject1;
                  boolean bool2;
                  if (bool1)
                    if (str1.equals(z[63]))
                    {
                      localIterator4 = locale.e.iterator();
                      i8 = -1;
                      localObject1 = null;
                      bool2 = false;
                    }
                  int i11;
                  for (int i9 = 0; ; i9 = i11)
                  {
                    String str2;
                    boolean bool3;
                    Object localObject2;
                    int i12;
                    label2003: int i10;
                    if (localIterator4.hasNext())
                    {
                      str2 = (String)localIterator4.next();
                      if (i9 != 0)
                      {
                        if (str2.equals(z[32]))
                        {
                          i8 = 5;
                          if (!bool1);
                        }
                        else if (str2.equals(z[66]))
                        {
                          i8 = 4;
                          if (!bool1);
                        }
                      }
                      else if ((str2.equals(z[61])) && (i1 == 0))
                      {
                        i1 = 1;
                        bool2 = true;
                        if (!bool1);
                      }
                      else if (str2.equalsIgnoreCase(z[32]))
                      {
                        i8 = 1;
                        if (!bool1);
                      }
                      else if (str2.equalsIgnoreCase(z[66]))
                      {
                        i8 = 3;
                        if (!bool1);
                      }
                      else if (str2.equalsIgnoreCase(z[51]))
                      {
                        i8 = 2;
                        if (!bool1);
                      }
                      else if (str2.equalsIgnoreCase(z[58]))
                      {
                        i8 = 6;
                        if (!bool1);
                      }
                      else if (str2.equalsIgnoreCase(z[45]))
                      {
                        i9 = 1;
                        if (!bool1);
                      }
                      else if (!str2.equalsIgnoreCase(z[69]))
                      {
                        if (str2.equalsIgnoreCase(z[68]))
                        {
                          i11 = i9;
                          bool3 = bool2;
                          localObject2 = localObject1;
                          i12 = i8;
                          if (!bool1)
                            break label2796;
                          i10 = i12;
                          localObject1 = localObject2;
                          bool2 = bool3;
                        }
                      }
                    }
                    while (true)
                    {
                      if (i10 < 0)
                        i10 = 1;
                      localg.a(i10, locale.b, (String)localObject1, bool2);
                      if (bool1)
                        if (str1.equals(z[26]))
                        {
                          localg.e.add(locale.b);
                          if (!bool1);
                        }
                        else if (str1.equals(z[55]))
                        {
                          localg.a(locale);
                          if (!bool1);
                        }
                        else if (str1.equals(z[49]))
                        {
                          localg.a(locale);
                          if (!bool1);
                        }
                        else if (str1.equals(z[57]))
                        {
                          localg.a(locale);
                          if (!bool1);
                        }
                        else if (str1.equals(z[70]))
                        {
                          localg.a(locale);
                          if (!bool1);
                        }
                        else if (str1.equals(z[24]))
                        {
                          localg.a(locale);
                          if (!bool1);
                        }
                        else if (str1.equals(z[30]))
                        {
                          localg.a(locale);
                          if (!bool1);
                        }
                        else if (str1.equals(z[33]))
                        {
                          localg.a(locale);
                          if (!bool1);
                        }
                        else if (str1.equals(z[28]))
                        {
                          localg.a(locale);
                          if (!bool1);
                        }
                        else if (str1.equals(z[12]))
                        {
                          localg.a(locale);
                          if (!bool1);
                        }
                        else if (str1.equals(z[37]))
                        {
                          localg.a(locale);
                          if (!bool1);
                        }
                        else if (str1.equals(z[43]))
                        {
                          localg.a(locale);
                          if (!bool1);
                        }
                        else if (str1.equals(z[40]))
                        {
                          localg.a(locale);
                          if (!bool1);
                        }
                        else if (str1.equals(z[31]))
                        {
                          localg.a(locale);
                          if (!bool1);
                        }
                        else if (str1.equals(z[54]))
                        {
                          localg.a(locale);
                          if (!bool1);
                        }
                        else if (str1.equals(z[38]))
                        {
                          localg.c.g = locale.b;
                          if (!bool1);
                        }
                        else
                        {
                          if (str1.equals(z[50]))
                          {
                            i7 = m;
                            i5 = n;
                            i3 = i1;
                            i4 = i6;
                            break label139;
                            if ((str5.equalsIgnoreCase(z[52])) || (str5.equalsIgnoreCase(z[67])))
                              break label2874;
                            if (str5.equalsIgnoreCase(z[36]))
                            {
                              bool12 = bool10;
                              localObject8 = localObject6;
                              i22 = i18;
                              i23 = i19;
                              break label892;
                            }
                            if ((str5.toUpperCase().startsWith(z[42])) && (i18 < 0))
                            {
                              i18 = 0;
                              localObject6 = str5.substring(2);
                              if (!bool1)
                                break label2874;
                            }
                            if (i18 >= 0)
                              break label2874;
                            i22 = 0;
                            i23 = i19;
                            boolean bool13 = bool10;
                            localObject8 = str5;
                            bool12 = bool13;
                            break label892;
                            label2620: str4 = locale.b;
                            break label1160;
                            if ((str2.toUpperCase().startsWith(z[42])) && (i8 < 0))
                            {
                              i8 = 0;
                              localObject1 = str2.substring(2);
                              if (!bool1)
                                break label2770;
                            }
                            if (i8 >= 0)
                              break label2770;
                            i12 = 0;
                            boolean bool4 = bool2;
                            localObject2 = str2;
                            i11 = i9;
                            bool3 = bool4;
                            break label2003;
                          }
                          if (str1.equals(z[53]))
                          {
                            localg.c.h = locale.b;
                            if (!bool1);
                          }
                          else
                          {
                            localg.a(locale);
                          }
                        }
                      i7 = m;
                      i5 = n;
                      i3 = i1;
                      i4 = i6;
                      break label139;
                      label2751: m = i7;
                      n = i5;
                      i1 = i3;
                      i2 = i4;
                      break;
                      label2770: i11 = i9;
                      bool3 = bool2;
                      localObject2 = localObject1;
                      i12 = i8;
                      break label2003;
                      i10 = i8;
                    }
                    label2796: i8 = i12;
                    localObject1 = localObject2;
                    bool2 = bool3;
                  }
                  bool7 = bool5;
                  localObject5 = localObject3;
                  i15 = i13;
                  break label1669;
                  bool6 = bool5;
                  i14 = i13;
                  localObject4 = localObject3;
                }
                i13 = i15;
                localObject3 = localObject5;
              }
            }
            bool8 = bool9;
            break label1208;
          }
          label2845: label2874: bool12 = bool10;
          localObject8 = localObject6;
          i22 = i18;
          i23 = i19;
          break label892;
          i20 = i18;
          i6 = i19;
          bool11 = bool10;
          localObject7 = localObject6;
          break label912;
          label2912: i19 = i23;
          i18 = i22;
          localObject6 = localObject8;
          bool10 = bool12;
          break label745;
          i16 = i17;
          break label671;
          i17 = i16;
          break label704;
          i17 = i16;
          break label708;
          label2950: break;
          i6 = i2;
        }
      }
      i7 = m;
      i3 = i1;
      i4 = i2;
      i5 = n;
      break label139;
      i3 = i1;
      i4 = i2;
      i5 = n;
    }
  }

  private static void a(j paramj, List<String> paramList, int paramInt)
  {
    int m = paramList.size();
    if (m > 1)
    {
      paramj.c = ((String)paramList.get(0));
      paramj.b = ((String)paramList.get(1));
      if ((m > 2) && (((String)paramList.get(2)).length() > 0))
        paramj.d = ((String)paramList.get(2));
      if ((m > 3) && (((String)paramList.get(3)).length() > 0))
        paramj.e = ((String)paramList.get(3));
      if ((m > 4) && (((String)paramList.get(4)).length() > 0))
        paramj.f = ((String)paramList.get(4));
    }
  }

  public static byte[] a(Context paramContext, String paramString)
  {
    byte[] arrayOfByte = null;
    String str = z[7];
    String[] arrayOfString1 = new String[2];
    arrayOfString1[0] = paramString;
    arrayOfString1[1] = z[6];
    ContentResolver localContentResolver = paramContext.getContentResolver();
    Uri localUri = ContactsContract.Data.CONTENT_URI;
    String[] arrayOfString2 = new String[1];
    arrayOfString2[0] = z[5];
    Cursor localCursor = localContentResolver.query(localUri, arrayOfString2, str, arrayOfString1, null);
    if (localCursor.moveToFirst())
      arrayOfByte = localCursor.getBlob(0);
    return arrayOfByte;
  }

  public static g b(String paramString)
    throws b, IOException
  {
    g localg = null;
    if (paramString == null);
    while (true)
    {
      return localg;
      n localn = new n();
      q localq = new q();
      if (!localn.a(paramString, z[8], localq))
        g5.c(z[9] + paramString);
      Iterator localIterator = localq.b.iterator();
      if (localIterator.hasNext())
        localg = a((r)localIterator.next(), 0, paramString);
    }
  }

  private static String z(char[] paramArrayOfChar)
  {
    int m = paramArrayOfChar.length;
    int n = 0;
    if (m <= n)
      return new String(paramArrayOfChar).intern();
    int i1 = paramArrayOfChar[n];
    int i2;
    switch (n % 5)
    {
    default:
      i2 = 51;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      paramArrayOfChar[n] = (char)(i2 ^ i1);
      n++;
      break;
      i2 = 95;
      continue;
      i2 = 25;
      continue;
      i2 = 31;
      continue;
      i2 = 64;
    }
  }

  private static char[] z(String paramString)
  {
    char[] arrayOfChar = paramString.toCharArray();
    if (arrayOfChar.length < 2)
      arrayOfChar[0] = (char)(0x33 ^ arrayOfChar[0]);
    return arrayOfChar;
  }

  public String a()
  {
    boolean bool = b.a;
    String str;
    if (this.c.a != null)
      str = this.c.a;
    while (true)
    {
      return str;
      if ((this.i != null) && (this.i.size() > 0))
      {
        Iterator localIterator2 = this.i.iterator();
        do
        {
          if (!localIterator2.hasNext())
            break label108;
          i locali = (i)localIterator2.next();
          if ((locali.a == ContactsContract.CommonDataKinds.Email.class) && (locali.f))
          {
            str = locali.c;
            break;
          }
        }
        while (!bool);
      }
      label108: if ((this.h != null) && (this.h.size() > 0))
      {
        Iterator localIterator1 = this.h.iterator();
        do
        {
          if (!localIterator1.hasNext())
            break label178;
          l locall = (l)localIterator1.next();
          if (locall.d)
          {
            str = locall.b;
            break;
          }
        }
        while (!bool);
      }
      label178: str = "";
    }
  }

  public void a(int paramInt, String paramString1, h paramh, String paramString2, boolean paramBoolean)
  {
    if (this.i == null)
      this.i = new ArrayList();
    i locali = new i();
    locali.a = ContactsContract.CommonDataKinds.StructuredPostal.class;
    locali.b = paramInt;
    locali.c = paramString1;
    locali.d = paramh;
    locali.e = paramString2;
    locali.f = paramBoolean;
    this.i.add(locali);
  }

  public void a(int paramInt, String paramString1, String paramString2, boolean paramBoolean)
  {
    boolean bool = b.a;
    if (this.h == null)
      this.h = new ArrayList();
    l locall = new l();
    locall.a = paramInt;
    StringBuilder localStringBuilder = new StringBuilder();
    String str = paramString1.trim();
    int m = str.length();
    int n = 0;
    do
    {
      if (n >= m)
        break;
      char c1 = str.charAt(n);
      if ((('0' <= c1) && (c1 <= '9')) || ((n == 0) && (c1 == '+')) || (c1 == ','))
        localStringBuilder.append(c1);
      n++;
    }
    while (!bool);
    locall.b = t.a(localStringBuilder.toString());
    locall.c = paramString2;
    locall.d = paramBoolean;
    this.h.add(locall);
  }

  public void a(Cursor paramCursor)
  {
    int m = 1;
    boolean bool = b.a;
    if (this.i == null)
      this.i = new ArrayList();
    i locali = new i();
    locali.a = ContactsContract.CommonDataKinds.StructuredPostal.class;
    locali.b = paramCursor.getInt(paramCursor.getColumnIndex(z[2]));
    locali.c = paramCursor.getString(paramCursor.getColumnIndex(z[0]));
    locali.d = new h();
    String str = paramCursor.getString(paramCursor.getColumnIndex(z[17]));
    if (str != null)
      locali.d.a = str.replaceAll(z[22], " ");
    locali.d.b = paramCursor.getString(paramCursor.getColumnIndex(z[13]));
    locali.d.c = paramCursor.getString(paramCursor.getColumnIndex(z[20]));
    locali.d.d = paramCursor.getString(paramCursor.getColumnIndex(z[16]));
    locali.d.e = paramCursor.getString(paramCursor.getColumnIndex(z[21]));
    locali.e = paramCursor.getString(paramCursor.getColumnIndex(z[3]));
    if (paramCursor.getInt(paramCursor.getColumnIndex(z[m])) == m);
    while (true)
    {
      locali.f = m;
      this.i.add(locali);
      if (bool)
        App.wc = 1 + App.wc;
      return;
      m = 0;
    }
  }

  public void a(e parame)
  {
    if ((parame.b == null) || (parame.b.length() == 0));
    while (true)
    {
      return;
      String str = parame.a;
      if (this.k == null)
        this.k = new HashMap();
      Object localObject;
      if (!this.k.containsKey(str))
      {
        localObject = new ArrayList();
        this.k.put(str, localObject);
        if (!b.a);
      }
      else
      {
        localObject = (List)this.k.get(str);
      }
      ((List)localObject).add(parame);
    }
  }

  public void a(Class paramClass, int paramInt, String paramString1, String paramString2, boolean paramBoolean)
  {
    if (this.i == null)
      this.i = new ArrayList();
    i locali = new i();
    locali.a = paramClass;
    locali.b = paramInt;
    locali.c = paramString1;
    locali.e = paramString2;
    locali.f = paramBoolean;
    this.i.add(locali);
  }

  public void a(String paramString)
  {
    if (this.j == null)
      this.j = new ArrayList();
    int m = this.j.size();
    if (m == 0)
    {
      b(2, "", null, false);
      m = 1;
    }
    ((k)this.j.get(m - 1)).c = paramString;
  }

  public void b(int paramInt, String paramString1, String paramString2, boolean paramBoolean)
  {
    if (this.j == null)
      this.j = new ArrayList();
    k localk = new k();
    localk.a = paramInt;
    localk.b = paramString1;
    localk.c = paramString2;
    localk.d = paramBoolean;
    this.j.add(localk);
  }

  public void c(String paramString)
  {
    boolean bool = b.a;
    String[] arrayOfString1 = new String[7];
    arrayOfString1[0] = z[2];
    arrayOfString1[1] = z[3];
    arrayOfString1[2] = z[18];
    arrayOfString1[3] = z[17];
    arrayOfString1[4] = z[19];
    arrayOfString1[5] = z[13];
    arrayOfString1[6] = z[16];
    ContentResolver localContentResolver = this.l.getContentResolver();
    Uri localUri = ContactsContract.Data.CONTENT_URI;
    String str = z[15];
    String[] arrayOfString2 = new String[2];
    arrayOfString2[0] = paramString;
    arrayOfString2[1] = z[14];
    Cursor localCursor = localContentResolver.query(localUri, arrayOfString1, str, arrayOfString2, null);
    do
    {
      if (!localCursor.moveToNext())
        break;
      this.c.b = localCursor.getString(localCursor.getColumnIndex(z[2]));
      this.c.c = localCursor.getString(localCursor.getColumnIndex(z[3]));
      this.c.d = localCursor.getString(localCursor.getColumnIndex(z[18]));
      this.c.e = localCursor.getString(localCursor.getColumnIndex(z[17]));
      this.c.f = localCursor.getString(localCursor.getColumnIndex(z[19]));
      this.c.g = localCursor.getString(localCursor.getColumnIndex(z[13]));
      this.c.h = localCursor.getString(localCursor.getColumnIndex(z[16]));
    }
    while (!bool);
    localCursor.close();
  }

  public void d(String paramString)
  {
    boolean bool1 = b.a;
    ContentResolver localContentResolver = this.l.getContentResolver();
    Uri localUri = ContactsContract.CommonDataKinds.Phone.CONTENT_URI;
    String str1 = z[4];
    String[] arrayOfString = new String[1];
    arrayOfString[0] = paramString;
    Cursor localCursor = localContentResolver.query(localUri, null, str1, arrayOfString, null);
    int m;
    String str2;
    String str3;
    if (localCursor.moveToNext())
    {
      m = localCursor.getInt(localCursor.getColumnIndex(z[2]));
      str2 = localCursor.getString(localCursor.getColumnIndex(z[0]));
      str3 = localCursor.getString(localCursor.getColumnIndex(z[3]));
      if (localCursor.getInt(localCursor.getColumnIndex(z[1])) != 1)
        break label172;
    }
    label172: for (boolean bool2 = true; ; bool2 = false)
    {
      a(m, str2, str3, bool2);
      if (!bool1)
        break;
      localCursor.close();
      return;
    }
  }

  public void e(String paramString)
  {
    boolean bool1 = b.a;
    ContentResolver localContentResolver = this.l.getContentResolver();
    Uri localUri = ContactsContract.CommonDataKinds.Email.CONTENT_URI;
    String str1 = z[4];
    String[] arrayOfString = new String[1];
    arrayOfString[0] = paramString;
    Cursor localCursor = localContentResolver.query(localUri, null, str1, arrayOfString, null);
    int m;
    String str2;
    String str3;
    if (localCursor.moveToNext())
    {
      m = localCursor.getInt(localCursor.getColumnIndex(z[2]));
      str2 = localCursor.getString(localCursor.getColumnIndex(z[0]));
      str3 = localCursor.getString(localCursor.getColumnIndex(z[3]));
      if (localCursor.getInt(localCursor.getColumnIndex(z[1])) != 1)
        break label175;
    }
    label175: for (boolean bool2 = true; ; bool2 = false)
    {
      a(ContactsContract.CommonDataKinds.Email.class, m, str2, str3, bool2);
      if (!bool1)
        break;
      localCursor.close();
      return;
    }
  }

  public void f(String paramString)
  {
    boolean bool = b.a;
    ContentResolver localContentResolver = this.l.getContentResolver();
    Uri localUri = ContactsContract.CommonDataKinds.StructuredPostal.CONTENT_URI;
    String str = z[4];
    String[] arrayOfString = new String[1];
    arrayOfString[0] = paramString;
    Cursor localCursor = localContentResolver.query(localUri, null, str, arrayOfString, null);
    do
    {
      if (!localCursor.moveToNext())
        break;
      a(localCursor);
    }
    while (!bool);
    localCursor.close();
  }

  public void g(String paramString)
  {
    String str1 = z[11];
    String[] arrayOfString = new String[2];
    arrayOfString[0] = paramString;
    arrayOfString[1] = z[23];
    Cursor localCursor = this.l.getContentResolver().query(ContactsContract.Data.CONTENT_URI, null, str1, arrayOfString, null);
    String str3;
    String str4;
    String str5;
    String str6;
    if (localCursor.moveToFirst())
    {
      String str2 = localCursor.getString(localCursor.getColumnIndex(z[0]));
      str3 = localCursor.getString(localCursor.getColumnIndex(z[18]));
      StringBuilder localStringBuilder = new StringBuilder().append(str2);
      if ((str3 != null) && (str3.length() != 0))
        break label208;
      str4 = "";
      str5 = str4;
      str6 = localCursor.getString(localCursor.getColumnIndex(z[17]));
      if (localCursor.getInt(localCursor.getColumnIndex(z[1])) != 1)
        break label234;
    }
    label208: label234: for (boolean bool = true; ; bool = false)
    {
      b(1, str5, str6, bool);
      localCursor.close();
      return;
      str4 = ";" + str3;
      break;
    }
  }

  public void h(String paramString)
  {
    String str = z[11];
    String[] arrayOfString = new String[2];
    arrayOfString[0] = paramString;
    arrayOfString[1] = z[10];
    Cursor localCursor = this.l.getContentResolver().query(ContactsContract.Data.CONTENT_URI, null, str, arrayOfString, null);
    if (localCursor.moveToFirst())
    {
      e locale = new e();
      locale.a = z[12];
      locale.b = localCursor.getString(localCursor.getColumnIndex(z[0]));
      a(locale);
    }
    localCursor.close();
  }

  public void i(String paramString)
  {
    String str = z[74];
    String[] arrayOfString = new String[3];
    arrayOfString[0] = paramString;
    arrayOfString[1] = z[73];
    arrayOfString[2] = String.valueOf(3);
    Cursor localCursor = this.l.getContentResolver().query(ContactsContract.Data.CONTENT_URI, null, str, arrayOfString, null);
    if (localCursor.moveToFirst())
    {
      e locale = new e();
      locale.a = z[55];
      locale.b = localCursor.getString(localCursor.getColumnIndex(z[0]));
      a(locale);
    }
    localCursor.close();
  }

  public void j(String paramString)
  {
    boolean bool = b.a;
    String str1 = z[7];
    String[] arrayOfString = new String[2];
    arrayOfString[0] = paramString;
    arrayOfString[1] = z[75];
    Cursor localCursor = this.l.getContentResolver().query(ContactsContract.Data.CONTENT_URI, null, str1, arrayOfString, null);
    do
    {
      if (!localCursor.moveToNext())
        break;
      int m = localCursor.getInt(localCursor.getColumnIndex(z[18]));
      e locale = new e();
      locale.b = localCursor.getString(localCursor.getColumnIndex(z[0]));
      String str2 = this.l.getString(ContactsContract.CommonDataKinds.Im.getProtocolLabelResource(m));
      Iterator localIterator = b.entrySet().iterator();
      do
      {
        if (!localIterator.hasNext())
          break;
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        if (((String)localEntry.getValue()).equalsIgnoreCase(str2))
          locale.a = ((String)localEntry.getKey());
      }
      while (!bool);
      locale.a(this.l.getString(ContactsContract.CommonDataKinds.Im.getTypeLabelResource(m)));
      a(locale);
    }
    while (!bool);
    localCursor.close();
  }

  public void k(String paramString)
  {
    String str = z[7];
    String[] arrayOfString1 = new String[2];
    arrayOfString1[0] = paramString;
    arrayOfString1[1] = z[6];
    ContentResolver localContentResolver = this.l.getContentResolver();
    Uri localUri = ContactsContract.Data.CONTENT_URI;
    String[] arrayOfString2 = new String[1];
    arrayOfString2[0] = z[5];
    Cursor localCursor = localContentResolver.query(localUri, arrayOfString2, str, arrayOfString1, null);
    if (localCursor.moveToFirst())
      this.f = localCursor.getBlob(0);
    localCursor.close();
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     g
 * JD-Core Version:    0.6.1
 */