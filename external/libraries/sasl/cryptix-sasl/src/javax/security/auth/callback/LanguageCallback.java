package javax.security.auth.callback;

public class LanguageCallback
      extends java.lang.Object
      implements Callback
{
  /**
  Underlying security services instantiate and pass a LanguageCallback
  to the invokeCallback method of a CallbackHandler to retrieve the
  Locale used for localizing text.
  See Also: 
  CallbackHandler
  */

  // Private variable
  java.util.Locale locale;

  // Constructor Detail

  /**
  Construct a LanguageCallback.
  */
  public LanguageCallback()
{}

  // Method Detail
  /**
  Set the retrieved Locale.
  @param locale - the retrieved Locale.
  */
  public void setLocale(java.util.Locale locale)
  {
    this.locale = locale;
  }

  /**
  Get the retrieved Locale.
  @return the retrieved Locale, or null if no Locale could be retrieved.
  */
  public java.util.Locale getLocale()
  {
    return this.locale;
  }
}

