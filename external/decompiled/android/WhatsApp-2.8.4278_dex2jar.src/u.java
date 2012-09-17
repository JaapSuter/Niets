import java.lang.reflect.Array;

public class u
{
  private static Object[] a = new Object[0];
  private static Object[] b = new Object[73];

  public static int a(int paramInt)
  {
    boolean bool = hb.a;
    int i = 4;
    if (i < 32)
    {
      if (paramInt > -12 + (1 << i))
        break label31;
      paramInt = -12 + (1 << i);
    }
    while (true)
    {
      return paramInt;
      label31: i++;
      if (!bool)
        break;
    }
  }

  public static <T> T[] a(Class<T> paramClass)
  {
    if (paramClass == Object.class);
    Object localObject;
    for (Object[] arrayOfObject = (Object[])a; ; arrayOfObject = (Object[])localObject)
    {
      return arrayOfObject;
      int i = (0x7FFFFFFF & System.identityHashCode(paramClass) / 8) % 73;
      localObject = b[i];
      if ((localObject == null) || (localObject.getClass().getComponentType() != paramClass))
      {
        localObject = Array.newInstance(paramClass, 0);
        b[i] = localObject;
      }
    }
  }

  public static int b(int paramInt)
  {
    return a(paramInt * 2) / 2;
  }

  public static int c(int paramInt)
  {
    return a(paramInt * 4) / 4;
  }
}