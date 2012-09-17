package com.whatsapp;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ViewFlipper;
import java.lang.reflect.Field;

public class v4
{
  private static SparseIntArray a;
  public static int b;
  private static final String[] c;
  public static final int[] d = arrayOfInt;
  private static final String[] z;

  static
  {
    String[] arrayOfString1 = new String[8];
    arrayOfString1[0] = z(z("$.Fy'24\016"));
    arrayOfString1[1] = z(z("w&\024"));
    arrayOfString1[2] = z(z("27k"));
    arrayOfString1[3] = z(z("3(U.*56Q"));
    arrayOfString1[4] = z(z("45Yw<?;@**'*"));
    arrayOfString1[5] = z(z("27[3\"\".]5d8/@t$1wY<&8(Mv"));
    arrayOfString1[6] = z(z(",\tI"));
    arrayOfString1[7] = z(z(",\024I"));
    z = arrayOfString1;
    a = new SparseIntArray(900);
    b = 0;
    String[] arrayOfString2 = new String[4];
    arrayOfString2[0] = z(z(""));
    arrayOfString2[1] = z(z(""));
    arrayOfString2[2] = z(z(""));
    arrayOfString2[3] = z(z(""));
    c = arrayOfString2;
    int[] arrayOfInt = new int[4];
    arrayOfInt[0] = 2131558474;
    arrayOfInt[1] = 2131558475;
    arrayOfInt[2] = 2131558476;
    arrayOfInt[3] = 2131558477;
  }

  public static int a(int paramInt)
  {
    return c[paramInt].length();
  }

  public static Drawable a(int paramInt1, int paramInt2)
  {
    Object localObject = null;
    if (a.size() == 0)
      a();
    try
    {
      if (paramInt2 <= -1 + c[paramInt1].length())
      {
        int i = c[paramInt1].charAt(paramInt2);
        Drawable localDrawable = App.Mb.getResources().getDrawable(a.get(i));
        localObject = localDrawable;
      }
    }
    catch (StringIndexOutOfBoundsException localStringIndexOutOfBoundsException)
    {
      g5.d(z[0] + c[paramInt1].length() + z[1] + paramInt2);
      localObject = App.Mb.getResources().getDrawable(a.get(c[paramInt1].charAt(0)));
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      g5.d(localOutOfMemoryError);
    }
    return localObject;
  }

  public static SpannableStringBuilder a(String paramString, Context paramContext)
  {
    int i = g5.n;
    if (paramString == null);
    int k;
    int m;
    label28: int i2;
    for (Object localObject1 = null; ; localObject1 = null)
    {
      return localObject1;
      int j = paramString.length();
      k = 0;
      m = 0;
      localObject1 = null;
      if (k >= j)
        break label210;
      int i1 = paramString.codePointAt(k);
      i2 = Character.charCount(i1);
      int i3 = f(i1);
      if (!e(i3))
        break label163;
      if (localObject1 == null)
        localObject1 = new SpannableStringBuilder(paramString);
      Drawable localDrawable = b(i3);
      if (localDrawable != null)
      {
        localDrawable.setBounds(0, 0, (int)j4.a(paramContext).a(localDrawable.getIntrinsicWidth()), (int)j4.a(paramContext).a(localDrawable.getIntrinsicWidth()));
        ((SpannableStringBuilder)localObject1).setSpan(new ImageSpan(localDrawable), k, k + i2, 33);
        if (i == 0)
          break;
      }
    }
    label163: Object localObject2;
    if (i != 0)
      localObject2 = localObject1;
    label210: label215: int i6;
    for (int i4 = 1; ; i4 = i6)
    {
      k += i2;
      if (i != 0)
      {
        int n = i4;
        localObject1 = localObject2;
        while (true)
        {
          if ((localObject1 == null) || (n != 0))
            break label215;
          ((SpannableStringBuilder)localObject1).append(" ");
          break;
          n = m;
        }
        break;
      }
      int i5 = i4;
      localObject1 = localObject2;
      m = i5;
      break label28;
      i6 = m;
      localObject2 = localObject1;
    }
  }

  public static SpannableStringBuilder a(String paramString, Context paramContext, Paint paramPaint)
  {
    int i = g5.n;
    if (paramString == null)
    {
      localObject1 = null;
      return localObject1;
    }
    int j = 0;
    int k = paramString.length();
    int m = 0;
    Object localObject1 = null;
    label29: int i2;
    Object localObject2;
    label81: Drawable localDrawable;
    if (m < k)
    {
      int i1 = paramString.codePointAt(m);
      i2 = Character.charCount(i1);
      int i3 = f(i1);
      if (e(i3))
        if (localObject1 == null)
        {
          localObject2 = new SpannableStringBuilder(paramString);
          localDrawable = b(i3);
          if (localDrawable != null)
            if (paramPaint == null)
              break label350;
        }
    }
    label315: label350: for (Paint.FontMetrics localFontMetrics = paramPaint.getFontMetrics(); ; localFontMetrics = null)
    {
      Object localObject4;
      if (localFontMetrics != null)
      {
        localObject4 = new InsetDrawable(localDrawable, 0, -(int)(0.5F + localFontMetrics.descent / 2.0F), 0, (int)(0.5F + localFontMetrics.descent / 2.0F));
        int i7 = (int)(0.5F + 1.1F * paramPaint.getTextSize());
        ((Drawable)localObject4).setBounds(0, 0, i7, i7);
        if (i == 0);
      }
      while (true)
      {
        ((Drawable)localObject4).setBounds(0, 0, (int)j4.a(paramContext).b(((Drawable)localObject4).getIntrinsicWidth()), (int)j4.a(paramContext).b(((Drawable)localObject4).getIntrinsicWidth()));
        ((SpannableStringBuilder)localObject2).setSpan(new ImageSpan((Drawable)localObject4, 0), m, m + i2, 33);
        if (i != 0)
        {
          localObject1 = null;
          break;
        }
        label245: int i4;
        if (i != 0)
          i4 = 1;
        for (Object localObject3 = localObject2; ; localObject3 = localObject2)
        {
          int i5 = m + i2;
          if (i != 0)
          {
            int i6 = i4;
            localObject1 = localObject3;
            for (int n = i6; ; n = j)
            {
              if ((localObject1 == null) || (n != 0))
                break label315;
              ((SpannableStringBuilder)localObject1).append(" ");
              break;
              localObject2 = localObject1;
              break label81;
              localObject2 = localObject1;
              break label245;
            }
            break;
          }
          m = i5;
          j = i4;
          localObject1 = localObject3;
          break label29;
          i4 = j;
        }
        localObject4 = localDrawable;
      }
    }
  }

  public static String a(CharSequence paramCharSequence)
  {
    int i = g5.n;
    StringBuilder localStringBuilder = new StringBuilder();
    int j = 0;
    do
    {
      if (j >= paramCharSequence.length())
        break;
      if (paramCharSequence.charAt(j) == '\n')
      {
        localStringBuilder.append(z[7]);
        if (i == 0);
      }
      else if (e(paramCharSequence.charAt(j)))
      {
        localStringBuilder.append("{" + Integer.toHexString(paramCharSequence.charAt(j)).toUpperCase() + "}");
        if (i == 0);
      }
      else if (paramCharSequence.charAt(j) == ' ')
      {
        localStringBuilder.append(z[6]);
        if (i == 0);
      }
      else
      {
        localStringBuilder.append(paramCharSequence.charAt(j));
      }
      j++;
    }
    while (i == 0);
    return localStringBuilder.toString();
  }

  public static void a()
  {
    int i = g5.n;
    Field[] arrayOfField = R.drawable.class.getFields();
    Resources localResources = App.Mb.getResources();
    int j = arrayOfField.length;
    int k = 0;
    do
    {
      if (k >= j)
        break;
      String str = arrayOfField[k].getName();
      if ((str.charAt(0) == 'e') && (str.length() == 4))
      {
        int i1 = Integer.parseInt(str, 16);
        int i2 = localResources.getIdentifier(str, z[3], z[4]);
        a.put(i1, i2);
        if (i == 0);
      }
      else if (str.startsWith(z[2]))
      {
        int m = Integer.parseInt(str.substring(3), 16);
        int n = localResources.getIdentifier(str, z[3], z[4]);
        a.put(m, n);
      }
      k++;
    }
    while (i == 0);
  }

  public static void a(Editable paramEditable, Context paramContext)
  {
    int i = g5.n;
    String str = paramEditable.toString();
    ImageSpan[] arrayOfImageSpan = (ImageSpan[])paramEditable.getSpans(0, str.length(), ImageSpan.class);
    int j = 0;
    do
    {
      if (j >= arrayOfImageSpan.length)
        break;
      paramEditable.removeSpan(arrayOfImageSpan[j]);
      j++;
    }
    while (i == 0);
    int k = str.length();
    int m = 0;
    do
    {
      if (m >= k)
        break;
      int n = str.codePointAt(m);
      int i1 = Character.charCount(n);
      int i2 = f(n);
      if (e(i2))
      {
        Drawable localDrawable = b(i2);
        if (localDrawable != null)
        {
          localDrawable.setBounds(0, 0, (int)j4.a(paramContext).a(localDrawable.getIntrinsicWidth()), (int)j4.a(paramContext).a(localDrawable.getIntrinsicWidth()));
          paramEditable.setSpan(new ImageSpan(localDrawable), m, m + i1, 33);
        }
      }
      m += i1;
    }
    while (i == 0);
  }

  public static void a(View paramView1, View paramView2, View paramView3, View paramView4, ViewFlipper paramViewFlipper, ViewGroup paramViewGroup)
  {
    paramView1.setOnClickListener(new w4(paramViewFlipper, paramViewGroup));
    paramView2.setOnClickListener(new x4(paramViewFlipper, paramViewGroup));
    paramView3.setOnClickListener(new y4(paramViewFlipper, paramViewGroup));
    paramView4.setOnClickListener(new z4(paramViewFlipper, paramViewGroup));
  }

  public static void a(ViewGroup paramViewGroup, int paramInt)
  {
    int i = g5.n;
    int j = paramInt * 2;
    int m;
    label261: for (int k = 0; ; k = m)
    {
      ImageView localImageView;
      if (k < paramViewGroup.getChildCount())
      {
        localImageView = (ImageView)paramViewGroup.getChildAt(k);
        if ((localImageView.getId() != 2131558480) || (i != 0))
        {
          if (k == j)
            localImageView.setImageResource(d(k / 2));
          switch (k / 2)
          {
          default:
            if (i != 0)
            {
              localImageView.setImageResource(c(k / 2));
              switch (k / 2)
              {
              default:
              case 0:
              case 1:
              case 2:
              case 3:
              }
            }
            break;
          case 0:
          case 1:
          case 2:
          case 3:
          }
        }
      }
      while (true)
      {
        m = k + 1;
        if (i == 0)
          break label261;
        paramViewGroup.invalidate();
        return;
        localImageView.setBackgroundResource(2130838441);
        if (i == 0)
          break;
        localImageView.setBackgroundResource(2131230735);
        if (i == 0)
          break;
        localImageView.setBackgroundResource(2131230735);
        if (i == 0)
          break;
        localImageView.setBackgroundResource(2130838439);
        break;
        localImageView.setBackgroundResource(2130838440);
        if (i != 0)
        {
          localImageView.setBackgroundResource(2131230736);
          if (i != 0)
          {
            localImageView.setBackgroundResource(2131230736);
            if (i != 0)
              localImageView.setBackgroundResource(2130838438);
          }
        }
      }
    }
  }

  public static char b(int paramInt1, int paramInt2)
  {
    return c[paramInt1].charAt(paramInt2);
  }

  public static Drawable b(int paramInt)
  {
    if (a.size() == 0)
      a();
    Object localObject = null;
    try
    {
      Drawable localDrawable = App.Mb.getResources().getDrawable(a.get(paramInt));
      localObject = localDrawable;
      return localObject;
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      while (true)
        g5.d(z[5] + localOutOfMemoryError.toString());
    }
  }

  public static SpannableStringBuilder b(String paramString, Context paramContext)
  {
    int i = g5.n;
    if (paramString == null);
    int k;
    int m;
    label28: int i2;
    for (Object localObject1 = null; ; localObject1 = null)
    {
      return localObject1;
      int j = paramString.length();
      k = 0;
      m = 0;
      localObject1 = null;
      if (k >= j)
        break label210;
      int i1 = paramString.codePointAt(k);
      i2 = Character.charCount(i1);
      int i3 = f(i1);
      if (!e(i3))
        break label163;
      if (localObject1 == null)
        localObject1 = new SpannableStringBuilder(paramString);
      Drawable localDrawable = b(i3);
      if (localDrawable != null)
      {
        localDrawable.setBounds(0, 0, (int)j4.a(paramContext).c(localDrawable.getIntrinsicWidth()), (int)j4.a(paramContext).c(localDrawable.getIntrinsicWidth()));
        ((SpannableStringBuilder)localObject1).setSpan(new ImageSpan(localDrawable), k, k + i2, 33);
        if (i == 0)
          break;
      }
    }
    label163: Object localObject2;
    if (i != 0)
      localObject2 = localObject1;
    label210: label215: int i6;
    for (int i4 = 1; ; i4 = i6)
    {
      k += i2;
      if (i != 0)
      {
        int n = i4;
        localObject1 = localObject2;
        while (true)
        {
          if ((localObject1 == null) || (n != 0))
            break label215;
          ((SpannableStringBuilder)localObject1).append(" ");
          break;
          n = m;
        }
        break;
      }
      int i5 = i4;
      localObject1 = localObject2;
      m = i5;
      break label28;
      i6 = m;
      localObject2 = localObject1;
    }
  }

  public static String b(CharSequence paramCharSequence)
  {
    int i = g5.n;
    StringBuilder localStringBuilder = new StringBuilder();
    int j = 0;
    do
    {
      if (j >= paramCharSequence.length())
        break;
      if (e(paramCharSequence.charAt(j)))
      {
        localStringBuilder.append('□');
        if (i == 0);
      }
      else
      {
        localStringBuilder.append(paramCharSequence.charAt(j));
      }
      j++;
    }
    while (i == 0);
    return localStringBuilder.toString();
  }

  public static int c(int paramInt)
  {
    int i;
    switch (paramInt)
    {
    default:
      i = 0;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      return i;
      i = 2130838543;
      continue;
      i = 2130838541;
      continue;
      i = 2130838539;
      continue;
      i = 2130838540;
    }
  }

  public static String c(CharSequence paramCharSequence)
  {
    int i = g5.n;
    StringBuilder localStringBuilder = new StringBuilder();
    int j = 0;
    do
    {
      if (j >= paramCharSequence.length())
        break;
      if (e(paramCharSequence.charAt(j)))
      {
        localStringBuilder.append(" ");
        if (i == 0);
      }
      else
      {
        localStringBuilder.append(paramCharSequence.charAt(j));
      }
      j++;
    }
    while (i == 0);
    return localStringBuilder.toString();
  }

  public static int d(int paramInt)
  {
    int i;
    switch (paramInt)
    {
    default:
      i = 0;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      return i;
      i = 2130838443;
      continue;
      i = 2130838437;
      continue;
      i = 2130838432;
      continue;
      i = 2130838435;
    }
  }

  public static boolean e(int paramInt)
  {
    switch (paramInt)
    {
    default:
    case 8252:
    case 8265:
    case 8505:
    case 8596:
    case 8597:
    case 8617:
    case 8618:
    case 8986:
    case 8987:
    case 9195:
    case 9196:
    case 9200:
    case 9203:
    case 9410:
    case 9642:
    case 9643:
    case 9723:
    case 9724:
    case 9725:
    case 9726:
    case 9745:
    case 9851:
    case 9875:
    case 9898:
    case 9899:
    case 9925:
    case 9940:
    case 9989:
    case 9993:
    case 9999:
    case 10002:
    case 10004:
    case 10006:
    case 10052:
    case 10055:
    case 10062:
    case 10133:
    case 10134:
    case 10135:
    case 10160:
    case 10548:
    case 10549:
    case 11035:
    case 11036:
    case 12336:
    case 57345:
    case 57346:
    case 57347:
    case 57348:
    case 57349:
    case 57350:
    case 57351:
    case 57352:
    case 57353:
    case 57354:
    case 57355:
    case 57356:
    case 57357:
    case 57358:
    case 57359:
    case 57360:
    case 57361:
    case 57362:
    case 57363:
    case 57364:
    case 57365:
    case 57366:
    case 57367:
    case 57368:
    case 57369:
    case 57370:
    case 57371:
    case 57372:
    case 57373:
    case 57374:
    case 57375:
    case 57376:
    case 57377:
    case 57378:
    case 57379:
    case 57380:
    case 57381:
    case 57382:
    case 57383:
    case 57384:
    case 57385:
    case 57386:
    case 57387:
    case 57388:
    case 57389:
    case 57390:
    case 57391:
    case 57392:
    case 57393:
    case 57394:
    case 57395:
    case 57396:
    case 57397:
    case 57398:
    case 57399:
    case 57400:
    case 57401:
    case 57402:
    case 57403:
    case 57404:
    case 57405:
    case 57406:
    case 57407:
    case 57408:
    case 57409:
    case 57410:
    case 57411:
    case 57412:
    case 57413:
    case 57414:
    case 57415:
    case 57416:
    case 57417:
    case 57418:
    case 57419:
    case 57420:
    case 57421:
    case 57422:
    case 57423:
    case 57424:
    case 57425:
    case 57426:
    case 57427:
    case 57428:
    case 57429:
    case 57430:
    case 57431:
    case 57432:
    case 57433:
    case 57434:
    case 57601:
    case 57602:
    case 57603:
    case 57604:
    case 57605:
    case 57606:
    case 57607:
    case 57608:
    case 57609:
    case 57610:
    case 57611:
    case 57612:
    case 57613:
    case 57614:
    case 57615:
    case 57616:
    case 57617:
    case 57618:
    case 57619:
    case 57620:
    case 57621:
    case 57622:
    case 57623:
    case 57624:
    case 57625:
    case 57626:
    case 57627:
    case 57628:
    case 57629:
    case 57630:
    case 57631:
    case 57632:
    case 57633:
    case 57634:
    case 57635:
    case 57636:
    case 57637:
    case 57638:
    case 57639:
    case 57640:
    case 57641:
    case 57642:
    case 57643:
    case 57644:
    case 57645:
    case 57646:
    case 57647:
    case 57648:
    case 57649:
    case 57650:
    case 57651:
    case 57652:
    case 57653:
    case 57654:
    case 57655:
    case 57656:
    case 57657:
    case 57658:
    case 57659:
    case 57660:
    case 57661:
    case 57662:
    case 57663:
    case 57664:
    case 57665:
    case 57666:
    case 57667:
    case 57668:
    case 57669:
    case 57670:
    case 57671:
    case 57672:
    case 57673:
    case 57674:
    case 57675:
    case 57676:
    case 57677:
    case 57678:
    case 57679:
    case 57680:
    case 57681:
    case 57682:
    case 57683:
    case 57684:
    case 57685:
    case 57686:
    case 57687:
    case 57688:
    case 57689:
    case 57690:
    case 57857:
    case 57858:
    case 57859:
    case 57860:
    case 57861:
    case 57862:
    case 57863:
    case 57864:
    case 57865:
    case 57866:
    case 57867:
    case 57868:
    case 57869:
    case 57870:
    case 57871:
    case 57872:
    case 57873:
    case 57874:
    case 57875:
    case 57876:
    case 57877:
    case 57878:
    case 57879:
    case 57880:
    case 57881:
    case 57882:
    case 57883:
    case 57884:
    case 57885:
    case 57886:
    case 57887:
    case 57888:
    case 57889:
    case 57890:
    case 57891:
    case 57892:
    case 57893:
    case 57894:
    case 57895:
    case 57896:
    case 57897:
    case 57898:
    case 57899:
    case 57900:
    case 57901:
    case 57902:
    case 57903:
    case 57904:
    case 57905:
    case 57906:
    case 57907:
    case 57908:
    case 57909:
    case 57910:
    case 57911:
    case 57912:
    case 57913:
    case 57914:
    case 57915:
    case 57916:
    case 57917:
    case 57918:
    case 57919:
    case 57920:
    case 57921:
    case 57922:
    case 57923:
    case 57924:
    case 57925:
    case 57926:
    case 57927:
    case 57928:
    case 57929:
    case 57930:
    case 57931:
    case 57932:
    case 57933:
    case 57934:
    case 57935:
    case 57936:
    case 57937:
    case 57938:
    case 57939:
    case 58113:
    case 58114:
    case 58115:
    case 58116:
    case 58117:
    case 58118:
    case 58119:
    case 58120:
    case 58121:
    case 58122:
    case 58123:
    case 58124:
    case 58125:
    case 58126:
    case 58127:
    case 58128:
    case 58129:
    case 58130:
    case 58131:
    case 58132:
    case 58133:
    case 58134:
    case 58135:
    case 58136:
    case 58137:
    case 58138:
    case 58139:
    case 58140:
    case 58141:
    case 58142:
    case 58143:
    case 58144:
    case 58145:
    case 58146:
    case 58147:
    case 58148:
    case 58149:
    case 58150:
    case 58151:
    case 58152:
    case 58153:
    case 58154:
    case 58155:
    case 58156:
    case 58157:
    case 58158:
    case 58159:
    case 58160:
    case 58161:
    case 58162:
    case 58163:
    case 58164:
    case 58165:
    case 58166:
    case 58167:
    case 58168:
    case 58169:
    case 58170:
    case 58171:
    case 58172:
    case 58173:
    case 58174:
    case 58175:
    case 58176:
    case 58177:
    case 58178:
    case 58179:
    case 58180:
    case 58181:
    case 58182:
    case 58183:
    case 58184:
    case 58185:
    case 58186:
    case 58187:
    case 58188:
    case 58189:
    case 58369:
    case 58370:
    case 58371:
    case 58372:
    case 58373:
    case 58374:
    case 58375:
    case 58376:
    case 58377:
    case 58378:
    case 58379:
    case 58380:
    case 58381:
    case 58382:
    case 58383:
    case 58384:
    case 58385:
    case 58386:
    case 58387:
    case 58388:
    case 58389:
    case 58390:
    case 58391:
    case 58392:
    case 58393:
    case 58394:
    case 58395:
    case 58396:
    case 58397:
    case 58398:
    case 58399:
    case 58400:
    case 58401:
    case 58402:
    case 58403:
    case 58404:
    case 58405:
    case 58406:
    case 58407:
    case 58408:
    case 58409:
    case 58410:
    case 58411:
    case 58412:
    case 58413:
    case 58414:
    case 58415:
    case 58416:
    case 58417:
    case 58418:
    case 58419:
    case 58420:
    case 58421:
    case 58422:
    case 58423:
    case 58424:
    case 58425:
    case 58426:
    case 58427:
    case 58428:
    case 58429:
    case 58430:
    case 58431:
    case 58432:
    case 58433:
    case 58434:
    case 58435:
    case 58436:
    case 58437:
    case 58438:
    case 58439:
    case 58440:
    case 58441:
    case 58442:
    case 58443:
    case 58444:
    case 58625:
    case 58626:
    case 58627:
    case 58628:
    case 58629:
    case 58630:
    case 58631:
    case 58632:
    case 58633:
    case 58634:
    case 58635:
    case 58636:
    case 58637:
    case 58638:
    case 58639:
    case 58640:
    case 58641:
    case 58642:
    case 58643:
    case 58644:
    case 58645:
    case 58646:
    case 58647:
    case 58648:
    case 58649:
    case 58650:
    case 58651:
    case 58652:
    case 58653:
    case 58654:
    case 58655:
    case 58656:
    case 58657:
    case 58658:
    case 58659:
    case 58660:
    case 58661:
    case 58662:
    case 58663:
    case 58664:
    case 58665:
    case 58666:
    case 58667:
    case 58668:
    case 58669:
    case 58670:
    case 58671:
    case 58672:
    case 58673:
    case 58674:
    case 58675:
    case 58676:
    case 58677:
    case 58678:
    case 58679:
    case 127183:
    case 127377:
    case 127379:
    case 127382:
    case 127384:
    case 127538:
    case 127540:
    case 127569:
    case 127745:
    case 127753:
    case 127755:
    case 127756:
    case 127757:
    case 127758:
    case 127759:
    case 127760:
    case 127761:
    case 127762:
    case 127763:
    case 127764:
    case 127765:
    case 127766:
    case 127767:
    case 127768:
    case 127770:
    case 127771:
    case 127772:
    case 127773:
    case 127774:
    case 127776:
    case 127792:
    case 127793:
    case 127794:
    case 127795:
    case 127804:
    case 127805:
    case 127807:
    case 127812:
    case 127815:
    case 127816:
    case 127819:
    case 127820:
    case 127821:
    case 127823:
    case 127824:
    case 127825:
    case 127826:
    case 127829:
    case 127830:
    case 127831:
    case 127840:
    case 127844:
    case 127845:
    case 127848:
    case 127849:
    case 127850:
    case 127851:
    case 127852:
    case 127853:
    case 127854:
    case 127855:
    case 127863:
    case 127865:
    case 127868:
    case 127882:
    case 127883:
    case 127904:
    case 127907:
    case 127914:
    case 127917:
    case 127918:
    case 127922:
    case 127923:
    case 127924:
    case 127929:
    case 127931:
    case 127932:
    case 127933:
    case 127938:
    case 127943:
    case 127945:
    case 127969:
    case 127972:
    case 127982:
    case 128000:
    case 128001:
    case 128002:
    case 128003:
    case 128004:
    case 128005:
    case 128006:
    case 128007:
    case 128008:
    case 128009:
    case 128010:
    case 128011:
    case 128012:
    case 128015:
    case 128016:
    case 128019:
    case 128021:
    case 128022:
    case 128028:
    case 128029:
    case 128030:
    case 128033:
    case 128034:
    case 128035:
    case 128037:
    case 128041:
    case 128042:
    case 128050:
    case 128060:
    case 128061:
    case 128062:
    case 128069:
    case 128083:
    case 128086:
    case 128090:
    case 128091:
    case 128093:
    case 128094:
    case 128100:
    case 128101:
    case 128106:
    case 128108:
    case 128109:
    case 128112:
    case 128121:
    case 128122:
    case 128140:
    case 128149:
    case 128150:
    case 128158:
    case 128160:
    case 128165:
    case 128167:
    case 128171:
    case 128172:
    case 128173:
    case 128174:
    case 128175:
    case 128178:
    case 128179:
    case 128180:
    case 128181:
    case 128182:
    case 128183:
    case 128184:
    case 128190:
    case 128193:
    case 128194:
    case 128195:
    case 128196:
    case 128197:
    case 128198:
    case 128199:
    case 128200:
    case 128201:
    case 128202:
    case 128203:
    case 128204:
    case 128205:
    case 128206:
    case 128207:
    case 128208:
    case 128209:
    case 128210:
    case 128211:
    case 128212:
    case 128213:
    case 128215:
    case 128216:
    case 128217:
    case 128218:
    case 128219:
    case 128220:
    case 128222:
    case 128223:
    case 128228:
    case 128229:
    case 128230:
    case 128231:
    case 128232:
    case 128234:
    case 128236:
    case 128237:
    case 128239:
    case 128240:
    case 128245:
    case 128249:
    case 128256:
    case 128257:
    case 128258:
    case 128259:
    case 128260:
    case 128261:
    case 128262:
    case 128263:
    case 128264:
    case 128265:
    case 128267:
    case 128268:
    case 128270:
    case 128271:
    case 128272:
    case 128277:
    case 128278:
    case 128279:
    case 128280:
    case 128281:
    case 128282:
    case 128283:
    case 128284:
    case 128287:
    case 128288:
    case 128289:
    case 128290:
    case 128291:
    case 128292:
    case 128294:
    case 128295:
    case 128297:
    case 128298:
    case 128300:
    case 128301:
    case 128302:
    case 128309:
    case 128310:
    case 128311:
    case 128312:
    case 128313:
    case 128314:
    case 128315:
    case 128316:
    case 128317:
    case 128348:
    case 128349:
    case 128350:
    case 128351:
    case 128352:
    case 128353:
    case 128354:
    case 128355:
    case 128356:
    case 128357:
    case 128358:
    case 128359:
    case 128510:
    case 128511:
    case 128512:
    case 128517:
    case 128518:
    case 128519:
    case 128520:
    case 128523:
    case 128526:
    case 128528:
    case 128529:
    case 128533:
    case 128535:
    case 128537:
    case 128539:
    case 128543:
    case 128548:
    case 128550:
    case 128551:
    case 128553:
    case 128555:
    case 128556:
    case 128558:
    case 128559:
    case 128564:
    case 128565:
    case 128566:
    case 128568:
    case 128569:
    case 128570:
    case 128571:
    case 128572:
    case 128573:
    case 128574:
    case 128575:
    case 128576:
    case 128584:
    case 128585:
    case 128586:
    case 128587:
    case 128589:
    case 128590:
    case 128641:
    case 128642:
    case 128646:
    case 128648:
    case 128650:
    case 128651:
    case 128653:
    case 128654:
    case 128656:
    case 128660:
    case 128662:
    case 128664:
    case 128667:
    case 128668:
    case 128669:
    case 128670:
    case 128671:
    case 128672:
    case 128673:
    case 128675:
    case 128678:
    case 128680:
    case 128681:
    case 128682:
    case 128683:
    case 128686:
    case 128687:
    case 128688:
    case 128689:
    case 128691:
    case 128692:
    case 128693:
    case 128695:
    case 128696:
    case 128703:
    case 128705:
    case 128706:
    case 128707:
    case 128708:
    case 128709:
    }
    for (boolean bool = false; ; bool = true)
      return bool;
  }

  private static int f(int paramInt)
  {
    switch (paramInt)
    {
    default:
    case 9728:
    case 9729:
    case 9748:
    case 9924:
    case 9889:
    case 127744:
    case 127746:
    case 127747:
    case 127748:
    case 127749:
    case 127750:
    case 127751:
    case 127752:
    case 127754:
    case 127769:
    case 127775:
    case 128336:
    case 128337:
    case 128338:
    case 128339:
    case 128340:
    case 128341:
    case 128342:
    case 128343:
    case 128344:
    case 128345:
    case 128346:
    case 128347:
    case 9800:
    case 9801:
    case 9802:
    case 9803:
    case 9804:
    case 9805:
    case 9806:
    case 9807:
    case 9808:
    case 9809:
    case 9810:
    case 9811:
    case 9934:
    case 127808:
    case 127799:
    case 127809:
    case 127800:
    case 127801:
    case 127810:
    case 127811:
    case 127802:
    case 127803:
    case 127796:
    case 127797:
    case 127806:
    case 127822:
    case 127818:
    case 127827:
    case 127817:
    case 127813:
    case 127814:
    case 128064:
    case 128066:
    case 128067:
    case 128068:
    case 128132:
    case 128133:
    case 128134:
    case 128135:
    case 128136:
    case 128102:
    case 128103:
    case 128104:
    case 128105:
    case 128107:
    case 128110:
    case 128111:
    case 128113:
    case 128114:
    case 128115:
    case 128116:
    case 128117:
    case 128118:
    case 128119:
    case 128120:
    case 128123:
    case 128124:
    case 128125:
    case 128126:
    case 128127:
    case 128128:
    case 128129:
    case 128130:
    case 128131:
    case 128013:
    case 128014:
    case 128020:
    case 128023:
    case 128043:
    case 128024:
    case 128040:
    case 128018:
    case 128017:
    case 128025:
    case 128026:
    case 128027:
    case 128032:
    case 128036:
    case 128038:
    case 128039:
    case 128031:
    case 128044:
    case 128045:
    case 128047:
    case 128049:
    case 128051:
    case 128052:
    case 128053:
    case 128054:
    case 128055:
    case 128059:
    case 128057:
    case 128058:
    case 128046:
    case 128048:
    case 128056:
    case 128544:
    case 128562:
    case 128542:
    case 128560:
    case 128530:
    case 128525:
    case 128540:
    case 128541:
    case 128536:
    case 128538:
    case 128567:
    case 128563:
    case 128515:
    case 128513:
    case 128514:
    case 128522:
    case 9786:
    case 128516:
    case 128546:
    case 128557:
    case 128552:
    case 128547:
    case 128545:
    case 128524:
    case 128534:
    case 128532:
    case 128561:
    case 128554:
    case 128527:
    case 128531:
    case 128549:
    case 128521:
    case 128581:
    case 128582:
    case 128583:
    case 128588:
    case 128591:
    case 127968:
    case 127970:
    case 127971:
    case 127973:
    case 127974:
    case 127975:
    case 127976:
    case 127977:
    case 127978:
    case 127979:
    case 9962:
    case 9970:
    case 127980:
    case 127983:
    case 127984:
    case 127981:
    case 128507:
    case 128508:
    case 128509:
    case 128095:
    case 128096:
    case 128097:
    case 128098:
    case 128099:
    case 128085:
    case 128081:
    case 128084:
    case 128082:
    case 128087:
    case 128088:
    case 128089:
    case 128092:
    case 128176:
    case 128177:
    case 128185:
    case 128293:
    case 128296:
    case 128299:
    case 128303:
    case 128304:
    case 128305:
    case 128137:
    case 128138:
    case 127344:
    case 127345:
    case 127374:
    case 127358:
    case 127872:
    case 127873:
    case 127874:
    case 127876:
    case 127877:
    case 127884:
    case 127878:
    case 127880:
    case 127881:
    case 127885:
    case 127886:
    case 127891:
    case 127890:
    case 127887:
    case 127879:
    case 127888:
    case 127875:
    case 127889:
    case 9742:
    case 128241:
    case 128242:
    case 128221:
    case 128224:
    case 128233:
    case 128235:
    case 128238:
    case 128226:
    case 128227:
    case 128225:
    case 128186:
    case 128187:
    case 128188:
    case 128189:
    case 128191:
    case 128192:
    case 9986:
    case 128214:
    case 9918:
    case 9971:
    case 127934:
    case 9917:
    case 127935:
    case 127936:
    case 127937:
    case 127939:
    case 127940:
    case 127942:
    case 127944:
    case 127946:
    case 128643:
    case 128647:
    case 128644:
    case 128645:
    case 128663:
    case 128665:
    case 128652:
    case 128655:
    case 128674:
    case 9992:
    case 9973:
    case 128649:
    case 128640:
    case 128676:
    case 128661:
    case 128666:
    case 128658:
    case 128657:
    case 128659:
    case 9981:
    case 127359:
    case 128677:
    case 128679:
    case 9832:
    case 9978:
    case 127905:
    case 127906:
    case 127908:
    case 127909:
    case 127910:
    case 127911:
    case 127912:
    case 127913:
    case 127915:
    case 127916:
    case 126980:
    case 127919:
    case 127920:
    case 127921:
    case 127925:
    case 127926:
    case 127927:
    case 127928:
    case 127930:
    case 12349:
    case 128247:
    case 128250:
    case 128251:
    case 128252:
    case 128139:
    case 128141:
    case 128142:
    case 128143:
    case 128144:
    case 128145:
    case 128146:
    case 128286:
    case 169:
    case 174:
    case 8482:
    case 128246:
    case 128243:
    case 128244:
    case 127828:
    case 127833:
    case 127856:
    case 127836:
    case 127838:
    case 127859:
    case 127846:
    case 127839:
    case 127841:
    case 127832:
    case 127834:
    case 127837:
    case 127835:
    case 127842:
    case 127843:
    case 127857:
    case 127858:
    case 127847:
    case 127860:
    case 9749:
    case 127864:
    case 127866:
    case 127861:
    case 127862:
    case 127867:
    case 8599:
    case 8600:
    case 8598:
    case 8601:
    case 11014:
    case 11015:
    case 10145:
    case 11013:
    case 9654:
    case 9664:
    case 9193:
    case 9194:
    case 11093:
    case 10060:
    case 10071:
    case 10067:
    case 10068:
    case 10069:
    case 10175:
    case 10084:
    case 128147:
    case 128148:
    case 128151:
    case 128152:
    case 128153:
    case 128154:
    case 128155:
    case 128156:
    case 128157:
    case 128159:
    case 9829:
    case 9824:
    case 9830:
    case 9827:
    case 128684:
    case 128685:
    case 9855:
    case 9888:
    case 128690:
    case 128694:
    case 128697:
    case 128698:
    case 128704:
    case 128699:
    case 128701:
    case 128702:
    case 128700:
    case 127378:
    case 127380:
    case 127381:
    case 127383:
    case 127385:
    case 127386:
    case 127489:
    case 127490:
    case 127539:
    case 127541:
    case 127542:
    case 127514:
    case 127543:
    case 127544:
    case 127545:
    case 127535:
    case 127546:
    case 12953:
    case 12951:
    case 127568:
    case 128161:
    case 128162:
    case 128163:
    case 128164:
    case 128166:
    case 128168:
    case 128169:
    case 128170:
    case 10024:
    case 10036:
    case 10035:
    case 128308:
    case 128306:
    case 128307:
    case 11088:
    case 128266:
    case 128269:
    case 128274:
    case 128275:
    case 128273:
    case 128276:
    case 128285:
    case 9994:
    case 9995:
    case 9996:
    case 128074:
    case 128077:
    case 9757:
    case 128070:
    case 128071:
    case 128072:
    case 128073:
    case 128075:
    case 128079:
    case 128076:
    case 128078:
    case 128080:
    }
    while (true)
    {
      return paramInt;
      paramInt = 57418;
      continue;
      paramInt = 57417;
      continue;
      paramInt = 57419;
      continue;
      paramInt = 57416;
      continue;
      paramInt = 57661;
      continue;
      paramInt = 58435;
      continue;
      paramInt = 58428;
      continue;
      paramInt = 58443;
      continue;
      paramInt = 57421;
      continue;
      paramInt = 58441;
      continue;
      paramInt = 57670;
      continue;
      paramInt = 58442;
      continue;
      paramInt = 58444;
      continue;
      paramInt = 58430;
      continue;
      paramInt = 57420;
      continue;
      paramInt = 58165;
      continue;
      paramInt = 57380;
      continue;
      paramInt = 57381;
      continue;
      paramInt = 57382;
      continue;
      paramInt = 57383;
      continue;
      paramInt = 57384;
      continue;
      paramInt = 57385;
      continue;
      paramInt = 57386;
      continue;
      paramInt = 57387;
      continue;
      paramInt = 57388;
      continue;
      paramInt = 57389;
      continue;
      paramInt = 57390;
      continue;
      paramInt = 57391;
      continue;
      paramInt = 57919;
      continue;
      paramInt = 57920;
      continue;
      paramInt = 57921;
      continue;
      paramInt = 57922;
      continue;
      paramInt = 57923;
      continue;
      paramInt = 57924;
      continue;
      paramInt = 57925;
      continue;
      paramInt = 57926;
      continue;
      paramInt = 57927;
      continue;
      paramInt = 57928;
      continue;
      paramInt = 57929;
      continue;
      paramInt = 57930;
      continue;
      paramInt = 57931;
      continue;
      paramInt = 57616;
      continue;
      paramInt = 58116;
      continue;
      paramInt = 57624;
      continue;
      paramInt = 57392;
      continue;
      paramInt = 57394;
      continue;
      paramInt = 57625;
      continue;
      paramInt = 58439;
      continue;
      paramInt = 58115;
      continue;
      paramInt = 58117;
      continue;
      paramInt = 58119;
      continue;
      paramInt = 58120;
      continue;
      paramInt = 58436;
      continue;
      paramInt = 58181;
      continue;
      paramInt = 58182;
      continue;
      paramInt = 58183;
      continue;
      paramInt = 58184;
      continue;
      paramInt = 58185;
      continue;
      paramInt = 58186;
      continue;
      paramInt = 58393;
      continue;
      paramInt = 58395;
      continue;
      paramInt = 58394;
      continue;
      paramInt = 58396;
      continue;
      paramInt = 58140;
      continue;
      paramInt = 58141;
      continue;
      paramInt = 58142;
      continue;
      paramInt = 58143;
      continue;
      paramInt = 58144;
      continue;
      paramInt = 57345;
      continue;
      paramInt = 57346;
      continue;
      paramInt = 57348;
      continue;
      paramInt = 57349;
      continue;
      paramInt = 58408;
      continue;
      paramInt = 57682;
      continue;
      paramInt = 58409;
      continue;
      paramInt = 58645;
      continue;
      paramInt = 58646;
      continue;
      paramInt = 58647;
      continue;
      paramInt = 58648;
      continue;
      paramInt = 58649;
      continue;
      paramInt = 58650;
      continue;
      paramInt = 58651;
      continue;
      paramInt = 58652;
      continue;
      paramInt = 57627;
      continue;
      paramInt = 57422;
      continue;
      paramInt = 57612;
      continue;
      paramInt = 57643;
      continue;
      paramInt = 57626;
      continue;
      paramInt = 57628;
      continue;
      paramInt = 57939;
      continue;
      paramInt = 58654;
      continue;
      paramInt = 58655;
      continue;
      paramInt = 58669;
      continue;
      paramInt = 57652;
      continue;
      paramInt = 58670;
      continue;
      paramInt = 58671;
      continue;
      paramInt = 58672;
      continue;
      paramInt = 58662;
      continue;
      paramInt = 58663;
      continue;
      paramInt = 58664;
      continue;
      paramInt = 58665;
      continue;
      paramInt = 57610;
      continue;
      paramInt = 58433;
      continue;
      paramInt = 58661;
      continue;
      paramInt = 58658;
      continue;
      paramInt = 58659;
      continue;
      paramInt = 58657;
      continue;
      paramInt = 57429;
      continue;
      paramInt = 57369;
      continue;
      paramInt = 58656;
      continue;
      paramInt = 57427;
      continue;
      paramInt = 57424;
      continue;
      paramInt = 57423;
      continue;
      paramInt = 57428;
      continue;
      paramInt = 57370;
      continue;
      paramInt = 57609;
      continue;
      paramInt = 57426;
      continue;
      paramInt = 57611;
      continue;
      paramInt = 57425;
      continue;
      paramInt = 58660;
      continue;
      paramInt = 58666;
      continue;
      paramInt = 58667;
      continue;
      paramInt = 58668;
      continue;
      paramInt = 58673;
      continue;
      paramInt = 57433;
      continue;
      paramInt = 58384;
      continue;
      paramInt = 57432;
      continue;
      paramInt = 58383;
      continue;
      paramInt = 58382;
      continue;
      paramInt = 57606;
      continue;
      paramInt = 57605;
      continue;
      paramInt = 58377;
      continue;
      paramInt = 58392;
      continue;
      paramInt = 58391;
      continue;
      paramInt = 58380;
      continue;
      paramInt = 58381;
      continue;
      paramInt = 57431;
      continue;
      paramInt = 58372;
      continue;
      paramInt = 58386;
      continue;
      paramInt = 57430;
      continue;
      paramInt = 58388;
      continue;
      paramInt = 58389;
      continue;
      paramInt = 58387;
      continue;
      paramInt = 58385;
      continue;
      paramInt = 58379;
      continue;
      paramInt = 58374;
      continue;
      paramInt = 58390;
      continue;
      paramInt = 58378;
      continue;
      paramInt = 58375;
      continue;
      paramInt = 58371;
      continue;
      paramInt = 57607;
      continue;
      paramInt = 58376;
      continue;
      paramInt = 58370;
      continue;
      paramInt = 57608;
      continue;
      paramInt = 58369;
      continue;
      paramInt = 58373;
      continue;
      paramInt = 58403;
      continue;
      paramInt = 58404;
      continue;
      paramInt = 58406;
      continue;
      paramInt = 58407;
      continue;
      paramInt = 58397;
      continue;
      paramInt = 57398;
      continue;
      paramInt = 57400;
      continue;
      paramInt = 57683;
      continue;
      paramInt = 57685;
      continue;
      paramInt = 57677;
      continue;
      paramInt = 57684;
      continue;
      paramInt = 57688;
      continue;
      paramInt = 58625;
      continue;
      paramInt = 57686;
      continue;
      paramInt = 57687;
      continue;
      paramInt = 57399;
      continue;
      paramInt = 57633;
      continue;
      paramInt = 58628;
      continue;
      paramInt = 58629;
      continue;
      paramInt = 58630;
      continue;
      paramInt = 58632;
      continue;
      paramInt = 57403;
      continue;
      paramInt = 58633;
      continue;
      paramInt = 58653;
      continue;
      paramInt = 57351;
      continue;
      paramInt = 57662;
      continue;
      paramInt = 58138;
      continue;
      paramInt = 58139;
      continue;
      paramInt = 58678;
      continue;
      paramInt = 57350;
      continue;
      paramInt = 57614;
      continue;
      paramInt = 58114;
      continue;
      paramInt = 58136;
      continue;
      paramInt = 58137;
      continue;
      paramInt = 58145;
      continue;
      paramInt = 58146;
      continue;
      paramInt = 58147;
      continue;
      paramInt = 57647;
      continue;
      paramInt = 57673;
      continue;
      paramInt = 57674;
      continue;
      paramInt = 57629;
      continue;
      paramInt = 57622;
      continue;
      paramInt = 57619;
      continue;
      paramInt = 57918;
      continue;
      paramInt = 57865;
      continue;
      paramInt = 57393;
      continue;
      paramInt = 57659;
      continue;
      paramInt = 58127;
      continue;
      paramInt = 58674;
      continue;
      paramInt = 58675;
      continue;
      paramInt = 58676;
      continue;
      paramInt = 58677;
      continue;
      paramInt = 58132;
      continue;
      paramInt = 57618;
      continue;
      paramInt = 58187;
      continue;
      paramInt = 57395;
      continue;
      paramInt = 58440;
      continue;
      paramInt = 57667;
      continue;
      paramInt = 57623;
      continue;
      paramInt = 58128;
      continue;
      paramInt = 58130;
      continue;
      paramInt = 58422;
      continue;
      paramInt = 58424;
      continue;
      paramInt = 58425;
      continue;
      paramInt = 58426;
      continue;
      paramInt = 58427;
      continue;
      paramInt = 58432;
      continue;
      paramInt = 58434;
      continue;
      paramInt = 58437;
      continue;
      paramInt = 58438;
      continue;
      paramInt = 57353;
      continue;
      paramInt = 57354;
      continue;
      paramInt = 57604;
      continue;
      paramInt = 58113;
      continue;
      paramInt = 57355;
      continue;
      paramInt = 57603;
      continue;
      paramInt = 57601;
      continue;
      paramInt = 57602;
      continue;
      paramInt = 57666;
      continue;
      paramInt = 58135;
      continue;
      paramInt = 57675;
      continue;
      paramInt = 57631;
      continue;
      paramInt = 57356;
      continue;
      paramInt = 57630;
      continue;
      paramInt = 58134;
      continue;
      paramInt = 57638;
      continue;
      paramInt = 57639;
      continue;
      paramInt = 58131;
      continue;
      paramInt = 57672;
      continue;
      paramInt = 57366;
      continue;
      paramInt = 57364;
      continue;
      paramInt = 57365;
      continue;
      paramInt = 57368;
      continue;
      paramInt = 57363;
      continue;
      paramInt = 58410;
      continue;
      paramInt = 57650;
      continue;
      paramInt = 57621;
      continue;
      paramInt = 57367;
      continue;
      paramInt = 57649;
      continue;
      paramInt = 58411;
      continue;
      paramInt = 58413;
      continue;
      paramInt = 57374;
      continue;
      paramInt = 58420;
      continue;
      paramInt = 58421;
      continue;
      paramInt = 57375;
      continue;
      paramInt = 57371;
      continue;
      paramInt = 58414;
      continue;
      paramInt = 57689;
      continue;
      paramInt = 57680;
      continue;
      paramInt = 57858;
      continue;
      paramInt = 57373;
      continue;
      paramInt = 57372;
      continue;
      paramInt = 57401;
      continue;
      paramInt = 57613;
      continue;
      paramInt = 57653;
      continue;
      paramInt = 57690;
      continue;
      paramInt = 58415;
      continue;
      paramInt = 58416;
      continue;
      paramInt = 58417;
      continue;
      paramInt = 58418;
      continue;
      paramInt = 57402;
      continue;
      paramInt = 57679;
      continue;
      paramInt = 57678;
      continue;
      paramInt = 57655;
      continue;
      paramInt = 57635;
      continue;
      paramInt = 57634;
      continue;
      paramInt = 57636;
      continue;
      paramInt = 58419;
      continue;
      paramInt = 57404;
      continue;
      paramInt = 57405;
      continue;
      paramInt = 58631;
      continue;
      paramInt = 58122;
      continue;
      paramInt = 58626;
      continue;
      paramInt = 58627;
      continue;
      paramInt = 57637;
      continue;
      paramInt = 58148;
      continue;
      paramInt = 57645;
      continue;
      paramInt = 57648;
      continue;
      paramInt = 57651;
      continue;
      paramInt = 58412;
      continue;
      paramInt = 57406;
      continue;
      paramInt = 58150;
      continue;
      paramInt = 57408;
      continue;
      paramInt = 57409;
      continue;
      paramInt = 57410;
      continue;
      paramInt = 57644;
      continue;
      paramInt = 57352;
      continue;
      paramInt = 57642;
      continue;
      paramInt = 57640;
      continue;
      paramInt = 57641;
      continue;
      paramInt = 57347;
      continue;
      paramInt = 57396;
      continue;
      paramInt = 57397;
      continue;
      paramInt = 57617;
      continue;
      paramInt = 58118;
      continue;
      paramInt = 58405;
      continue;
      paramInt = 58429;
      continue;
      paramInt = 57863;
      continue;
      paramInt = 57934;
      continue;
      paramInt = 57935;
      continue;
      paramInt = 58679;
      continue;
      paramInt = 57867;
      continue;
      paramInt = 57936;
      continue;
      paramInt = 57937;
      continue;
      paramInt = 57632;
      continue;
      paramInt = 58178;
      continue;
      paramInt = 57414;
      continue;
      paramInt = 58176;
      continue;
      paramInt = 58169;
      continue;
      paramInt = 57671;
      continue;
      paramInt = 58170;
      continue;
      paramInt = 58171;
      continue;
      paramInt = 58172;
      continue;
      paramInt = 58173;
      continue;
      paramInt = 58174;
      continue;
      paramInt = 58175;
      continue;
      paramInt = 58177;
      continue;
      paramInt = 58179;
      continue;
      paramInt = 58180;
      continue;
      paramInt = 58188;
      continue;
      paramInt = 58189;
      continue;
      paramInt = 58431;
      continue;
      paramInt = 57411;
      continue;
      paramInt = 57413;
      continue;
      paramInt = 57412;
      continue;
      paramInt = 57415;
      continue;
      paramInt = 58168;
      continue;
      paramInt = 58123;
      continue;
      paramInt = 58124;
      continue;
      paramInt = 57910;
      continue;
      paramInt = 57912;
      continue;
      paramInt = 57911;
      continue;
      paramInt = 57913;
      continue;
      paramInt = 57906;
      continue;
      paramInt = 57907;
      continue;
      paramInt = 57908;
      continue;
      paramInt = 57909;
      continue;
      paramInt = 57914;
      continue;
      paramInt = 57915;
      continue;
      paramInt = 57916;
      continue;
      paramInt = 57917;
      continue;
      paramInt = 58162;
      continue;
      paramInt = 58163;
      continue;
      paramInt = 57377;
      continue;
      paramInt = 57376;
      continue;
      paramInt = 58166;
      continue;
      paramInt = 58167;
      continue;
      paramInt = 57873;
      continue;
      paramInt = 57378;
      continue;
      paramInt = 58151;
      continue;
      paramInt = 57379;
      continue;
      paramInt = 58152;
      continue;
      paramInt = 58153;
      continue;
      paramInt = 58154;
      continue;
      paramInt = 58155;
      continue;
      paramInt = 58156;
      continue;
      paramInt = 58157;
      continue;
      paramInt = 58423;
      continue;
      paramInt = 57860;
      continue;
      paramInt = 57868;
      continue;
      paramInt = 57870;
      continue;
      paramInt = 57869;
      continue;
      paramInt = 57871;
      continue;
      paramInt = 58126;
      continue;
      paramInt = 57864;
      continue;
      paramInt = 57866;
      continue;
      paramInt = 57938;
      continue;
      paramInt = 57654;
      continue;
      paramInt = 57857;
      continue;
      paramInt = 57656;
      continue;
      paramInt = 57657;
      continue;
      paramInt = 57663;
      continue;
      paramInt = 57681;
      continue;
      paramInt = 57664;
      continue;
      paramInt = 58121;
      continue;
      paramInt = 57658;
      continue;
      paramInt = 57876;
      continue;
      paramInt = 57897;
      continue;
      paramInt = 57874;
      continue;
      paramInt = 57933;
      continue;
      paramInt = 57875;
      continue;
      paramInt = 57646;
      continue;
      paramInt = 57859;
      continue;
      paramInt = 57896;
      continue;
      paramInt = 57899;
      continue;
      paramInt = 57898;
      continue;
      paramInt = 57877;
      continue;
      paramInt = 57878;
      continue;
      paramInt = 57879;
      continue;
      paramInt = 57880;
      continue;
      paramInt = 57895;
      continue;
      paramInt = 57900;
      continue;
      paramInt = 57901;
      continue;
      paramInt = 58133;
      continue;
      paramInt = 58125;
      continue;
      paramInt = 57894;
      continue;
      paramInt = 57615;
      continue;
      paramInt = 58164;
      continue;
      paramInt = 58129;
      continue;
      paramInt = 57660;
      continue;
      paramInt = 58161;
      continue;
      paramInt = 58160;
      continue;
      paramInt = 57434;
      continue;
      paramInt = 57676;
      continue;
      paramInt = 58158;
      continue;
      paramInt = 57861;
      continue;
      paramInt = 57862;
      continue;
      paramInt = 57881;
      continue;
      paramInt = 57882;
      continue;
      paramInt = 57883;
      continue;
      paramInt = 58159;
      continue;
      paramInt = 57665;
      continue;
      paramInt = 57620;
      continue;
      paramInt = 57668;
      continue;
      paramInt = 57669;
      continue;
      paramInt = 57407;
      continue;
      paramInt = 58149;
      continue;
      paramInt = 57932;
      continue;
      paramInt = 57360;
      continue;
      paramInt = 57362;
      continue;
      paramInt = 57361;
      continue;
      paramInt = 57357;
      continue;
      paramInt = 57358;
      continue;
      paramInt = 57359;
      continue;
      paramInt = 57902;
      continue;
      paramInt = 57903;
      continue;
      paramInt = 57904;
      continue;
      paramInt = 57905;
      continue;
      paramInt = 58398;
      continue;
      paramInt = 58399;
      continue;
      paramInt = 58400;
      continue;
      paramInt = 58401;
      continue;
      paramInt = 58402;
    }
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
      m = 75;
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
      m = 90;
      continue;
      m = 52;
      continue;
      m = 89;
    }
  }

  private static char[] z(String paramString)
  {
    char[] arrayOfChar = paramString.toCharArray();
    if (arrayOfChar.length < 2)
      arrayOfChar[0] = (char)(0x4B ^ arrayOfChar[0]);
    return arrayOfChar;
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.whatsapp.v4
 * JD-Core Version:    0.6.1
 */