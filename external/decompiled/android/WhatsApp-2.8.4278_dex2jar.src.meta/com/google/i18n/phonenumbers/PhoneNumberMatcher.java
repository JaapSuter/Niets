package com.google.i18n.phonenumbers;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class PhoneNumberMatcher
  implements Iterator<PhoneNumberMatch>
{
  private static final Pattern GROUP_SEPARATOR = Pattern.compile("\\p{Z}[^" + str8 + "\\p{Nd}]*");
  private static final Pattern LEAD_CLASS;
  private static final Pattern MATCHING_BRACKETS;
  private static final Pattern PATTERN = Pattern.compile("(?:" + str9 + str6 + ")" + str3 + str7 + "(?:" + str6 + str7 + ")" + str5 + "(?:" + PhoneNumberUtil.EXTN_PATTERNS_FOR_MATCHING + ")?", 66);
  private static final Pattern PUB_PAGES = Pattern.compile("\\d{1,5}-+\\d{1,5}\\s{0,4}\\(\\d{1,4}");
  private static final Pattern SLASH_SEPARATED_DATES = Pattern.compile("(?:(?:[0-3]?\\d/[01]?\\d)|(?:[01]?\\d/[0-3]?\\d))/(?:[12]\\d)?\\d{2}");
  private static final Pattern TIME_STAMPS = Pattern.compile("[12]\\d{3}[-/]?[01]\\d[-/]?[0-3]\\d [0-2]\\d$");
  private static final Pattern TIME_STAMPS_SUFFIX = Pattern.compile(":[0-5]\\d");
  private PhoneNumberMatch lastMatch = null;
  private final PhoneNumberUtil.Leniency leniency;
  private long maxTries;
  private final PhoneNumberUtil phoneUtil;
  private final String preferredRegion;
  private int searchIndex = 0;
  private State state = State.NOT_READY;
  private final CharSequence text;

  static
  {
    String str1 = "[^" + "(\\[（［" + ")\\]）］" + "]";
    String str2 = limit(0, 3);
    MATCHING_BRACKETS = Pattern.compile("(?:[" + "(\\[（［" + "])?" + "(?:" + str1 + "+" + "[" + ")\\]）］" + "])?" + str1 + "+" + "(?:[" + "(\\[（［" + "]" + str1 + "+[" + ")\\]）］" + "])" + str2 + str1 + "*");
    String str3 = limit(0, 2);
    String str4 = limit(0, 4);
    String str5 = limit(0, 19);
    String str6 = "[-x‐-―−ー－-／  ​⁠　()（）［］.\\[\\]/~⁓∼～]" + str4;
    String str7 = "\\p{Nd}" + limit(1, 19);
    String str8 = "(\\[（［" + "+＋";
    String str9 = "[" + str8 + "]";
    LEAD_CLASS = Pattern.compile(str9);
  }

  PhoneNumberMatcher(PhoneNumberUtil paramPhoneNumberUtil, CharSequence paramCharSequence, String paramString, PhoneNumberUtil.Leniency paramLeniency, long paramLong)
  {
    if ((paramPhoneNumberUtil == null) || (paramLeniency == null))
      throw new NullPointerException();
    if (paramLong < 0L)
      throw new IllegalArgumentException();
    this.phoneUtil = paramPhoneNumberUtil;
    if (paramCharSequence != null);
    while (true)
    {
      this.text = paramCharSequence;
      this.preferredRegion = paramString;
      this.leniency = paramLeniency;
      this.maxTries = paramLong;
      return;
      paramCharSequence = "";
    }
  }

  private PhoneNumberMatch extractInnerMatch(String paramString, int paramInt)
  {
    Matcher localMatcher = GROUP_SEPARATOR.matcher(paramString);
    CharSequence localCharSequence1;
    Object localObject;
    if (localMatcher.find())
    {
      String str1 = paramString.substring(0, localMatcher.start());
      localCharSequence1 = trimAfterFirstMatch(PhoneNumberUtil.UNWANTED_END_CHAR_PATTERN, str1);
      localObject = parseAndVerify(localCharSequence1.toString(), paramInt);
      if (localObject == null);
    }
    while (true)
    {
      return localObject;
      this.maxTries -= 1L;
      int i = localMatcher.end();
      String str2 = paramString.substring(i);
      PhoneNumberMatch localPhoneNumberMatch = parseAndVerify(trimAfterFirstMatch(PhoneNumberUtil.UNWANTED_END_CHAR_PATTERN, str2).toString(), paramInt + i);
      if (localPhoneNumberMatch != null)
      {
        localObject = localPhoneNumberMatch;
      }
      else
      {
        this.maxTries -= 1L;
        if (this.maxTries > 0L)
        {
          while (localMatcher.find())
            i = localMatcher.start();
          String str3 = paramString.substring(0, i);
          CharSequence localCharSequence2 = trimAfterFirstMatch(PhoneNumberUtil.UNWANTED_END_CHAR_PATTERN, str3);
          if (localCharSequence2.equals(localCharSequence1))
          {
            localObject = null;
          }
          else
          {
            localObject = parseAndVerify(localCharSequence2.toString(), paramInt);
            if (localObject == null)
              this.maxTries -= 1L;
          }
        }
        else
        {
          localObject = null;
        }
      }
    }
  }

  private PhoneNumberMatch extractMatch(CharSequence paramCharSequence, int paramInt)
  {
    PhoneNumberMatch localPhoneNumberMatch = null;
    if ((PUB_PAGES.matcher(paramCharSequence).find()) || (SLASH_SEPARATED_DATES.matcher(paramCharSequence).find()));
    while (true)
    {
      return localPhoneNumberMatch;
      if (TIME_STAMPS.matcher(paramCharSequence).find())
      {
        String str2 = this.text.toString().substring(paramInt + paramCharSequence.length());
        if (TIME_STAMPS_SUFFIX.matcher(str2).lookingAt());
      }
      else
      {
        String str1 = paramCharSequence.toString();
        localPhoneNumberMatch = parseAndVerify(str1, paramInt);
        if (localPhoneNumberMatch == null)
          localPhoneNumberMatch = extractInnerMatch(str1, paramInt);
      }
    }
  }

  private PhoneNumberMatch find(int paramInt)
  {
    Matcher localMatcher = PATTERN.matcher(this.text);
    int i;
    CharSequence localCharSequence2;
    PhoneNumberMatch localPhoneNumberMatch;
    if ((this.maxTries > 0L) && (localMatcher.find(paramInt)))
    {
      i = localMatcher.start();
      CharSequence localCharSequence1 = this.text.subSequence(i, localMatcher.end());
      localCharSequence2 = trimAfterFirstMatch(PhoneNumberUtil.SECOND_NUMBER_START_PATTERN, localCharSequence1);
      localPhoneNumberMatch = extractMatch(localCharSequence2, i);
      if (localPhoneNumberMatch == null);
    }
    while (true)
    {
      return localPhoneNumberMatch;
      paramInt = i + localCharSequence2.length();
      this.maxTries -= 1L;
      break;
      localPhoneNumberMatch = null;
    }
  }

  private static boolean isInvalidPunctuationSymbol(char paramChar)
  {
    if ((paramChar == '%') || (Character.getType(paramChar) == 26));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  static boolean isLatinLetter(char paramChar)
  {
    boolean bool = false;
    if ((!Character.isLetter(paramChar)) && (Character.getType(paramChar) != 6));
    while (true)
    {
      return bool;
      Character.UnicodeBlock localUnicodeBlock = Character.UnicodeBlock.of(paramChar);
      if ((localUnicodeBlock.equals(Character.UnicodeBlock.BASIC_LATIN)) || (localUnicodeBlock.equals(Character.UnicodeBlock.LATIN_1_SUPPLEMENT)) || (localUnicodeBlock.equals(Character.UnicodeBlock.LATIN_EXTENDED_A)) || (localUnicodeBlock.equals(Character.UnicodeBlock.LATIN_EXTENDED_ADDITIONAL)) || (localUnicodeBlock.equals(Character.UnicodeBlock.LATIN_EXTENDED_B)) || (localUnicodeBlock.equals(Character.UnicodeBlock.COMBINING_DIACRITICAL_MARKS)))
        bool = true;
    }
  }

  private static String limit(int paramInt1, int paramInt2)
  {
    if ((paramInt1 < 0) || (paramInt2 <= 0) || (paramInt2 < paramInt1))
      throw new IllegalArgumentException();
    return "{" + paramInt1 + "," + paramInt2 + "}";
  }

  private PhoneNumberMatch parseAndVerify(String paramString, int paramInt)
  {
    Object localObject = null;
    try
    {
      if (MATCHING_BRACKETS.matcher(paramString).matches())
      {
        if (this.leniency.compareTo(PhoneNumberUtil.Leniency.VALID) >= 0)
        {
          if ((paramInt > 0) && (!LEAD_CLASS.matcher(paramString).lookingAt()))
          {
            char c2 = this.text.charAt(paramInt - 1);
            if ((isInvalidPunctuationSymbol(c2)) || (isLatinLetter(c2)))
              break label199;
          }
          int i = paramInt + paramString.length();
          if (i < this.text.length())
          {
            char c1 = this.text.charAt(i);
            if ((isInvalidPunctuationSymbol(c1)) || (isLatinLetter(c1)))
              break label199;
          }
        }
        Phonenumber.PhoneNumber localPhoneNumber = this.phoneUtil.parseAndKeepRawInput(paramString, this.preferredRegion);
        if (this.leniency.verify(localPhoneNumber, paramString, this.phoneUtil))
        {
          localPhoneNumber.clearCountryCodeSource();
          localPhoneNumber.clearRawInput();
          localPhoneNumber.clearPreferredDomesticCarrierCode();
          PhoneNumberMatch localPhoneNumberMatch = new PhoneNumberMatch(paramInt, paramString, localPhoneNumber);
          localObject = localPhoneNumberMatch;
        }
      }
    }
    catch (NumberParseException localNumberParseException)
    {
    }
    label199: return localObject;
  }

  private static CharSequence trimAfterFirstMatch(Pattern paramPattern, CharSequence paramCharSequence)
  {
    Matcher localMatcher = paramPattern.matcher(paramCharSequence);
    if (localMatcher.find())
      paramCharSequence = paramCharSequence.subSequence(0, localMatcher.start());
    return paramCharSequence;
  }

  public boolean hasNext()
  {
    if (this.state == State.NOT_READY)
    {
      this.lastMatch = find(this.searchIndex);
      if (this.lastMatch == null)
        this.state = State.DONE;
    }
    else
    {
      if (this.state != State.READY)
        break label71;
    }
    label71: for (boolean bool = true; ; bool = false)
    {
      return bool;
      this.searchIndex = this.lastMatch.end();
      this.state = State.READY;
      break;
    }
  }

  public PhoneNumberMatch next()
  {
    if (!hasNext())
      throw new NoSuchElementException();
    PhoneNumberMatch localPhoneNumberMatch = this.lastMatch;
    this.lastMatch = null;
    this.state = State.NOT_READY;
    return localPhoneNumberMatch;
  }

  public void remove()
  {
    throw new UnsupportedOperationException();
  }

  private static enum State
  {
    static
    {
      DONE = new State("DONE", 2);
      State[] arrayOfState = new State[3];
      arrayOfState[0] = NOT_READY;
      arrayOfState[1] = READY;
      arrayOfState[2] = DONE;
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.google.i18n.phonenumbers.PhoneNumberMatcher
 * JD-Core Version:    0.6.1
 */