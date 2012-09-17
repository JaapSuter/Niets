package com.google.i18n.phonenumbers;

 enum PhoneNumberUtil$Leniency$1
{
  PhoneNumberUtil$Leniency$1()
  {
    super(str, i, null);
  }

  boolean verify(Phonenumber.PhoneNumber paramPhoneNumber, String paramString, PhoneNumberUtil paramPhoneNumberUtil)
  {
    return paramPhoneNumberUtil.isPossibleNumber(paramPhoneNumber);
  }
}

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.google.i18n.phonenumbers.PhoneNumberUtil.Leniency.1
 * JD-Core Version:    0.6.1
 */