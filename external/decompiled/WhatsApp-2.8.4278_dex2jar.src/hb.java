public class hb
{
  public static boolean a;

  public static void a(CharSequence paramCharSequence, int paramInt1, int paramInt2, char[] paramArrayOfChar, int paramInt3)
  {
    boolean bool = a;
    Class localClass = paramCharSequence.getClass();
    if (localClass == String.class)
    {
      ((String)paramCharSequence).getChars(paramInt1, paramInt2, paramArrayOfChar, paramInt3);
      if (!bool);
    }
    else if (localClass == StringBuffer.class)
    {
      ((StringBuffer)paramCharSequence).getChars(paramInt1, paramInt2, paramArrayOfChar, paramInt3);
      if (!bool);
    }
    else if (localClass == StringBuilder.class)
    {
      ((StringBuilder)paramCharSequence).getChars(paramInt1, paramInt2, paramArrayOfChar, paramInt3);
      if (!bool);
    }
    else if ((paramCharSequence instanceof w))
    {
      ((w)paramCharSequence).a(paramInt1, paramInt2, paramArrayOfChar, paramInt3);
      if (!bool)
        break label139;
    }
    while (true)
    {
      int i;
      if (paramInt1 < paramInt2)
      {
        i = paramInt3 + 1;
        paramArrayOfChar[paramInt3] = paramCharSequence.charAt(paramInt1);
        paramInt1++;
        if (!bool);
      }
      else
      {
        label139: return;
      }
      paramInt3 = i;
    }
  }

  public static boolean a(CharSequence paramCharSequence)
  {
    if ((paramCharSequence == null) || (paramCharSequence.length() == 0));
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}