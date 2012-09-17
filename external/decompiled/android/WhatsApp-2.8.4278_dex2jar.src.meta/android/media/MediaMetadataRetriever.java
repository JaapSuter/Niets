package android.media;

import android.graphics.Bitmap;
import com.whatsapp.App;

public class MediaMetadataRetriever
{
  public static int a;
  private static final String z = z(z("\0029K?W'8J>B3wW:S>8Vp\007"));

  static
  {
    System.loadLibrary(z(z(":2\\#F\b=V#")));
    native_init();
  }

  public MediaMetadataRetriever()
  {
    native_setup();
  }

  private native Bitmap _getFrameAtTime(long paramLong, int paramInt);

  private final native void native_finalize();

  private static native void native_init();

  private native void native_setup();

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
      m = 39;
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
      m = 87;
      continue;
      m = 87;
      continue;
      m = 56;
      continue;
      m = 74;
    }
  }

  private static char[] z(String paramString)
  {
    char[] arrayOfChar = paramString.toCharArray();
    if (arrayOfChar.length < 2)
      arrayOfChar[0] = (char)(0x27 ^ arrayOfChar[0]);
    return arrayOfChar;
  }

  public native Bitmap captureFrame();

  protected void finalize()
    throws Throwable
  {
    int i = a;
    try
    {
      native_finalize();
      super.finalize();
      if (App.wc != 0)
        a = i + 1;
      return;
    }
    finally
    {
      super.finalize();
    }
  }

  public Bitmap getFrameAtTime(long paramLong)
  {
    return getFrameAtTime(paramLong, 2);
  }

  public Bitmap getFrameAtTime(long paramLong, int paramInt)
  {
    int i = a;
    if ((paramInt < 0) || (paramInt > 3))
      throw new IllegalArgumentException(z + paramInt);
    Bitmap localBitmap = _getFrameAtTime(paramLong, paramInt);
    if (i != 0)
      App.wc = 1 + App.wc;
    return localBitmap;
  }

  public native void setDataSource(String paramString)
    throws IllegalArgumentException;
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     android.media.MediaMetadataRetriever
 * JD-Core Version:    0.6.1
 */