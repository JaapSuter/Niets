
package javax.security.auth.callback;

public class TextOutputCallback
      extends java.lang.Object
      implements Callback
{
  /**
  Underlying security services instantiate and pass a TextOutputCallback
  to the invokeCallback method of a CallbackHandler to display
  information messages, warning messages and error messages.
  See Also: 
  CallbackHandler
  */

  // Field Detail

  /** Information message */
  public static final int INFORMATION = 0;

  /** Warning message */
  public static final int WARNING = 1;

  /** Error message */
  public static final int ERROR = 2;

  // Private variables

  private int style;
  private String message;

  // Constructor Detail

  /**
  Construct a TextOutputCallback with a message style and message to be
  displayed.
  @param style - the message style (INFORMATION, WARNING or ERROR).
  @param message - the message to be displayed.
  @exception java.lang.IllegalArgumentException - if style is not either
  INFORMATION, WARNING or ERROR, if message is null, or if message has a
  length of 0.
  */
  public TextOutputCallback(
    int style,
    String message
  )
  throws IllegalArgumentException
  {
    switch (style)
    {
      case INFORMATION:
      case WARNING:
      case ERROR:
        this.style = style;
        break;
      default:
        throw new IllegalArgumentException("invalid style");
    }
    if ((message == null) || (message.length() == 0))
    {
      throw new IllegalArgumentException("invalid message");
    }
    this.message = message;
  }


  // Method Detail

  /**
  Get the message style.
  @return the message style (INFORMATION, WARNING or ERROR).
  */
  public int getStyle()
  {
    return this.style;
  }

  /**
  Get the message to be displayed.
  @return the message to be displayed.
  */
  public String getMessage()
  {
    return this.message;
  }

}

