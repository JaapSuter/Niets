package com.google.i18n.phonenumbers;

 enum PhoneNumberUtil$Leniency$2
{
  PhoneNumberUtil$Leniency$2()
  {
    super(str, i, null);
  }

  boolean verify(Phonenumber.PhoneNumber paramPhoneNumber, String paramString, PhoneNumberUtil paramPhoneNumberUtil)
  {
    if ((!paramPhoneNumberUtil.isValidNumber(paramPhoneNumber)) || (!PhoneNumberUtil.Leniency.access$100(paramPhoneNumber, paramString, paramPhoneNumberUtil)));
    for (boolean bool = false; ; bool = PhoneNumberUtil.Leniency.access$200(paramPhoneNumber, paramPhoneNumberUtil))
      return bool;
  }
}