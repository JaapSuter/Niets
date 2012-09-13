public class h
{
  public String a;
  public String b;
  public String c;
  public String d;
  public String e;
  public String f;

  public static String a(String paramString)
  {
    boolean bool = b.a;
    StringBuffer localStringBuffer = new StringBuffer();
    int i = 0;
    do
    {
      if (i >= paramString.length())
        break;
      char c1 = paramString.charAt(i);
      if ((c1 == '\\') && (i < -3 + paramString.length()))
      {
        if ((paramString.charAt(i + 1) == 'r') && (paramString.charAt(i + 2) == '\\') && (paramString.charAt(i + 3) == 'n'))
        {
          localStringBuffer.append('\n');
          i += 3;
          if (!bool);
        }
      }
      else
        localStringBuffer.append(c1);
      i++;
    }
    while (!bool);
    return localStringBuffer.toString();
  }

  public String a()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if (this.a != null)
      localStringBuilder.append(this.a);
    localStringBuilder.append(";");
    if (this.b != null)
      localStringBuilder.append(this.b);
    localStringBuilder.append(";");
    if (this.c != null)
      localStringBuilder.append(this.c);
    localStringBuilder.append(";");
    if (this.d != null)
      localStringBuilder.append(this.d);
    localStringBuilder.append(";");
    if (this.e != null)
      localStringBuilder.append(this.e);
    return localStringBuilder.toString();
  }

  public String b()
  {
    return a(this.a);
  }

  public String c()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if ((this.a != null) && (this.a.length() > 0))
      localStringBuilder.append(a(this.a)).append('\n');
    int i = 0;
    if ((this.b != null) && (this.b.length() > 0))
    {
      localStringBuilder.append(this.b);
      i = 1;
    }
    if ((this.c != null) && (this.c.length() > 0))
    {
      if (i != 0)
        localStringBuilder.append(" ");
      localStringBuilder.append(this.c);
      i = 1;
    }
    if ((this.d != null) && (this.d.length() > 0))
    {
      if (i != 0)
        localStringBuilder.append(" ");
      localStringBuilder.append(this.d);
      i = 1;
    }
    if ((this.e != null) && (this.e.length() > 0))
    {
      if (i != 0)
        localStringBuilder.append(" ");
      localStringBuilder.append(this.e);
    }
    return localStringBuilder.toString();
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(a(this.a)).append(" ").append(this.b).append(" ").append(this.c).append(" ").append(this.d).append(" ").append(this.e);
    return localStringBuilder.toString();
  }
}