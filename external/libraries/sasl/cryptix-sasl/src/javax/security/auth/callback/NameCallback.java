package javax.security.auth.callback;

public class NameCallback
      extends java.lang.Object
      implements Callback
{
  /**
  Underlying security services instantiate and pass a NameCallback to
  the invokeCallback method of a CallbackHandler to retrieve name
  information.
  See Also: 
  CallbackHandler
  */

  // Private variables
  private String prompt;
  private String name;

  // Constructor Detail

  /**
  Construct a NameCallback with a prompt.
  @param prompt - the prompt used to request the name.
  @exception java.lang.IllegalArgumentException - if prompt is null or
  if prompt has a length of 0.
  */
  public NameCallback(java.lang.String prompt)
  {
    setPrompt(prompt);
  }

  /**
  Construct a NameCallback with a prompt and default name.
  @param prompt - the prompt used to request the information.
  @param defaultName - the name to be used as the default name displayed
  with the prompt.
  @exception java.lang.IllegalArgumentException - if prompt is null, if prompt
  has a length of 0, if defaultName is null, or if defaultName has a length of
  0.
  */
  public NameCallback(
    String prompt,
    String defaultName
  )
  throws IllegalArgumentException
  {
    setPrompt(prompt);
    if ((defaultName == null) || (defaultName.length() == 0))
    {
      throw new IllegalArgumentException("invalid default name");
    }
    this.name = defaultName;
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
  Get the default name.
  @return the default name, or null if this NameCallback was not instantiated
  with a defaultName.
  */
  public String getDefaultName()
  {
    return this.name;
  }

  /**
  Set the retrieved name.
  @param name - the retrieved name (which may be null).
  */
  public void setName(String name)
  {
    this.name = name;
  }

  /**
  Get the retrieved name.
  @return the retrieved name (which may be null)
  */
  public String getName()
  {
    return this.name;
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

