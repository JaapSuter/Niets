
package javax.security.auth.callback;

public class TextInputCallback
      extends java.lang.Object
      implements Callback
{
  /**
  Underlying security services instantiate and pass a TextInputCallback
  to the invokeCallback method of a CallbackHandler to retrieve generic
  text information.
  See Also: 
  CallbackHandler
  */

  // Private variables

  private String prompt;
  private String defaultText;
  private String text;

  // Constructor Detail

  /**
  Construct a TextInputCallback with a prompt.
  @param prompt - the prompt used to request the information.
  @exception java.lang.IllegalArgumentException - if prompt is null or if
  prompt has a length of 0.
  */
  public TextInputCallback(String prompt)
  throws IllegalArgumentException
  {
    setPrompt(prompt);
  }

  /**
  Construct a TextInputCallback with a prompt and default input value.
  @param prompt - the prompt used to request the information.
  @param defaultText - the text to be used as the default text displayed with
  the prompt.
  @exception java.lang.IllegalArgumentException - if prompt is null, if prompt
  has a length of 0, if defaultText is null or if defaultText has a length of
  0.
  */
  public TextInputCallback(
    String prompt,
    String defaultText
  )
  throws IllegalArgumentException
  {
    setPrompt(prompt);
    if ((defaultText == null) || (defaultText.length() == 0))
    {
      throw new IllegalArgumentException("invalid default text");
    }
    this.defaultText = defaultText;
    this.text = defaultText;
  }


  // Method Detail

  /**
  Get the prompt.
  @return the prompt.
  */
  public String getPrompt()
  {
    return this.prompt;
  }

  /**
  Get the default text.
  @return the default text, or null if this TextInputCallback was not
  instantiated with defaultText.
  */
  public String getDefaultText()
  {
    return this.defaultText;
  }

  /**
  Set the retrieved text.
  @param text - the retrieved text, which may be null.
  */
  public void setText(String text)
  {
    this.text = text;
  }

  /**
  Get the retrieved text.
  @return the retrieved text, which may be null.
  */
  public String getText()
  {
    return this.text;
  }

  //----------------------------------------------------------------------

  private void setPrompt(String prompt)
  throws IllegalArgumentException
  {
    if ((prompt == null) || (prompt.length() == 0))
    {
      throw new IllegalArgumentException("invalid prompt");
    }
    this.prompt = prompt;
  }
}

