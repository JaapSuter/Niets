package com.google.i18n.phonenumbers;

 enum PhoneNumberUtil$Leniency$3
{
  PhoneNumberUtil$Leniency$3()
  {
    super(str, i, null);
  }

  boolean verify(Phonenumber.PhoneNumber paramPhoneNumber, String paramString, PhoneNumberUtil paramPhoneNumberUtil)
  {
    boolean bool = false;
    if ((!paramPhoneNumberUtil.isValidNumber(paramPhoneNumber)) || (!PhoneNumberUtil.Leniency.access$100(paramPhoneNumber, paramString, paramPhoneNumberUtil)) || (PhoneNumberUtil.Leniency.access$300(paramString)) || (!PhoneNumberUtil.Leniency.access$200(paramPhoneNumber, paramPhoneNumberUtil)));
    while (true)
    {
      return bool;
      String[] arrayOfString = PhoneNumberUtil.Leniency.access$400(paramPhoneNumberUtil, paramPhoneNumber);
      StringBuilder localStringBuilder = PhoneNumberUtil.access$500(paramString, true);
      int i = 0;
      int j = 0;
      while (true)
      {
        if (i >= arrayOfString.length)
          break label165;
        int k = localStringBuilder.indexOf(arrayOfString[i], j);
        if (k < 0)
          break;
        j = k + arrayOfString[i].length();
        if ((i == 0) && (j < localStringBuilder.length()) && (Character.isDigit(localStringBuilder.charAt(j))))
        {
          String str = paramPhoneNumberUtil.getNationalSignificantNumber(paramPhoneNumber);
          bool = localStringBuilder.substring(j - arrayOfString[i].length()).startsWith(str);
          break;
        }
        i++;
      }
      label165: bool = localStringBuilder.substring(j).contains(paramPhoneNumber.getExtension());
    }
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.google.i18n.phonenumbers.PhoneNumberUtil.Leniency.3
 * JD-Core Version:    0.6.1
 */