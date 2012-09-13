
package javax.security.auth.callback;

public class PasswordCallback
      extends java.lang.Object
      implements Callback
{
  /**
  Underlying security services instantiate and pass a PasswordCallback
  to the invokeCallback method of a CallbackHandler to retrieve password
  information.
  See Also: 
  CallbackHandler
  */

  // Private variables
  private String prompt;
  private boolean echoOn;
  char[] passwd;

  // Constructor Detail

  /**
  Construct a PasswordCallback with a prompt and a boolean specifying
  whether the password should be displayed as it is being typed.
  @param prompt - the prompt used to request the password.
  @param echoOn - true if the password should be displayed as it
  is being typed.
  @exception java.lang.IllegalArgumentException - if prompt is null or
  if prompt has a length of 0.
  */
  public PasswordCallback(
    String prompt,
    boolean echoOn
  )
  {
    setPrompt(prompt);
    this.echoOn = echoOn;
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
  Return whether the password should be displayed as it is being typed.
  @return the whether the password should be displayed as it is being typed.
  */
  public boolean isEchoOn()
  {
    return echoOn;
  }

  /**
  Set the retrieved password.
  @param password - the retrieved password, which may be null.
  */
  public void setPassword(char[] password)
  {
    this.passwd = password;
  }

  /**
  Get the retrieved password.
  @return the retrieved password, which may be null.
  */
  public char[] getPassword()
  {
    return this.passwd;
  }

  /**
  Clear the retrieved password.
  */
  public void clearPassword()
  {
    if (passwd != null)
    {
      for (int i=0;i<passwd.length;i++)
      {
        passwd[i] = '\0';
      }
      passwd = null;
    }
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

