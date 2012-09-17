package com.google.i18n.phonenumbers;

import java.util.regex.Pattern;

 enum PhoneNumberUtil$Leniency$4
{
  PhoneNumberUtil$Leniency$4()
  {
    super(str, i, null);
  }

  boolean verify(Phonenumber.PhoneNumber paramPhoneNumber, String paramString, PhoneNumberUtil paramPhoneNumberUtil)
  {
    boolean bool1 = false;
    if ((!paramPhoneNumberUtil.isValidNumber(paramPhoneNumber)) || (!PhoneNumberUtil.Leniency.access$100(paramPhoneNumber, paramString, paramPhoneNumberUtil)) || (PhoneNumberUtil.Leniency.access$300(paramString)) || (!PhoneNumberUtil.Leniency.access$200(paramPhoneNumber, paramPhoneNumberUtil)))
      return bool1;
    StringBuilder localStringBuilder = PhoneNumberUtil.access$500(paramString, true);
    String[] arrayOfString1 = PhoneNumberUtil.access$600().split(localStringBuilder.toString());
    if (paramPhoneNumber.hasExtension());
    for (int i = -2 + arrayOfString1.length; ; i = -1 + arrayOfString1.length)
    {
      if ((arrayOfString1.length != 1) && (!arrayOfString1[i].contains(paramPhoneNumberUtil.getNationalSignificantNumber(paramPhoneNumber))))
        break label113;
      bool1 = true;
      break;
    }
    label113: String[] arrayOfString2 = PhoneNumberUtil.Leniency.access$400(paramPhoneNumberUtil, paramPhoneNumber);
    int j = -1 + arrayOfString2.length;
    int k = i;
    int m = j;
    while (true)
    {
      if ((m <= 0) || (k < 0))
        break label171;
      if (!arrayOfString1[k].equals(arrayOfString2[m]))
        break;
      m--;
      k--;
    }
    label171: if ((k >= 0) && (arrayOfString1[k].endsWith(arrayOfString2[0])));
    for (boolean bool2 = true; ; bool2 = false)
    {
      bool1 = bool2;
      break;
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.google.i18n.phonenumbers.PhoneNumberUtil.Leniency.4
 * JD-Core Version:    0.6.1
 */