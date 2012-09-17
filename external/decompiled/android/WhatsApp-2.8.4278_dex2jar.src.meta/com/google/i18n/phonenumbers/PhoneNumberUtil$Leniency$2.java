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

/* Location:           C:\Users\Jaap\Downloads\Code\WhatsApp-2.8.4278_dex2jar.jar
 * Qualified Name:     com.google.i18n.phonenumbers.PhoneNumberUtil.Leniency.2
 * JD-Core Version:    0.6.1
 */