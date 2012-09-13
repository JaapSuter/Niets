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