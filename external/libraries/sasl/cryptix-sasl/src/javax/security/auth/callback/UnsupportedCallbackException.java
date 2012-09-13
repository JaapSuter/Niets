
package javax.security.auth.callback;

public class UnsupportedCallbackException
      extends java.lang.Exception
{
  /**
  Signals that a CallbackHandler does not recognize a particular Callback.
  */

  // Private variables
  private Callback callback;

  // Constructor Detail

  /**
  Constructs a UnsupportedCallbackException with no detail message.
  @param callback - the unrecognized Callback.
  */
  public UnsupportedCallbackException(Callback callback)
  {
    super();
    this.callback = callback;
  }

  /**
  Constructs a UnsupportedCallbackException with the specified detail
  message. A detail message is a String that describes this particular
  exception.
  @param callback - the unrecognized Callback.
  @param msg - the detail message.
  */
  public UnsupportedCallbackException(
    Callback callback,
    String msg
  )
  {
    super(msg);
    this.callback = callback;
  }

  // Method Detail

  /**
  Get the unrecognized Callback.
  */
  public Callback getCallback()
  {
    return this.callback;
  }

}

