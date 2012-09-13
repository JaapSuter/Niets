
package javax.security.auth.callback;

public class ConfirmationCallback
      implements Callback
{
  /**
  Underlying security services instantiate and pass a 
  ConfirmationCallback to the invokeCallback method of a CallbackHandler 
  to ask for YES/NO, OK/CANCEL, YES/NO/CANCEL or other similar 
  confirmations.
  See Also: CallbackHandler
  */

  // Field detail

  /**
  Unspecified option type.
  The getOptionType method returns this value if this 
  ConfirmationCallback was instantiated with options instead of
  an optionType.
  */
  public static final int UNSPECIFIED_OPTION = 0;

  /**
  YES/NO confirmation option.
  An underlying security service specifies this as the optionType
  to a ConfirmationCallback constructor if it requires a
  confirmation which can be answered with either YES or NO. 
  */
  public static final int YES_NO_OPTION = 1;

  /**
  YES/NO/CANCEL confirmation confimration option.
  An underlying security service specifies this as the optionType
  to a ConfirmationCallback constructor if it requires a 
  confirmation which can be answered with either YES, NO or
  CANCEL.
  */
  public static final int YES_NO_CANCEL_OPTION = 2;

  /**
  OK/CANCEL confirmation confirmation option.
  An underlying security service specifies this as the optionType
  to a ConfirmationCallback constructor if it requires a
  confirmation which can be answered with either OK or CANCEL. 
  */
  public static final int OK_CANCEL_OPTION = 3;

  /**
  YES option.
  If an optionType was specified to this ConfirmationCallback,
  this option may be specified as a defaultOption or returned as 
  the selected index. 
  */
  public static final int YES = 4;

  /**
  NO option.
  If an optionType was specified to this ConfirmationCallback,
  this option may be specified as a defaultOption or returned as
  the selected index.
  */
  public static final int NO = 5;

  /**
  CANCEL option.
  If an optionType was specified to this ConfirmationCallback,
  this option may be specified as a defaultOption or returned as
  the selected index.
  */
  public static final int CANCEL = 6;

  /**
  OK option.
  If an optionType was specified to this ConfirmationCallback,
  this option may be specified as a defaultOption or returned as
  the selected index.
  */
  public static final int OK = 7;

  /**
  INFORMATION message type.
  */
  public static final int INFORMATION = 8;

  /**
  WARNING message type.
  */
  public static final int WARNING = 9;

  /**
  ERROR message type.
  */
  public static final int ERROR = 10;

  // Private variables

  private int messageType;
  private int optionType;
  private int defaultOption;
  private int selectedOption;
  private String[] options = null;
  private String prompt;

  /**
  Construct a ConfirmationCallback with a message type, an option type and a
  default option.
  Underlying security services use this constructor if they require either a
  YES/NO, YES/NO/CANCEL or OK/CANCEL confirmation.
  @param messageType - the message type (INFORMATION, WARNING or ERROR).
  @param optionType - the option type (YES_NO_OPTION, YES_NO_CANCEL_OPTION or
  OK_CANCEL_OPTION).
  @param defaultOption - the default option from the provided optionType (YES,
  NO, CANCEL or OK).
  @exception java.lang.IllegalArgumentException - if messageType is not either
  INFORMATION, WARNING, or ERROR, if optionType is not either YES_NO_OPTION,
  YES_NO_CANCEL_OPTION, or OK_CANCEL_OPTION, or if defaultOption does not
  correspond to one of the options in optionType.
  */
  public ConfirmationCallback(
    int messageType,
    int optionType,
    int defaultOption
  )
  throws IllegalArgumentException
  {
    setMessageType(messageType);
    setOptionType(optionType,defaultOption);
    this.defaultOption = defaultOption;
  }

  /**
  Construct a ConfirmationCallback with a message type, a list of options and
  a default option.
  Underlying security services use this constructor if they require a
  confirmation different from the available preset confirmations provided (for
  example, CONTINUE/ABORT or STOP/GO). The confirmation options are listed in
  the options array.
  @param messageType - the message type (INFORMATION, WARNING or ERROR).
  @param options - the list of confirmation options.
  @param defaultOption - the default option, represented as an index into the
  options array.
  @exception java.lang.IllegalArgumentException - if messageType is not either
  INFORMATION, WARNING, or ERROR, if options is null, if options has a length
  of 0, if any element from options is null, if any element from options has a
  length of 0, or if defaultOption does not lie within the array boundaries of
  options.
  */
  public ConfirmationCallback(
    int messageType,
    String[] options,
    int defaultOption
  )
  {
    setMessageType(messageType);
    setOptions(options,defaultOption);
    this.defaultOption = defaultOption;
  }

  /**
  Construct a ConfirmationCallback with a prompt, message type, an option type
  and a default option.
  Underlying security services use this constructor if they require either a
  YES/NO, YES/NO/CANCEL or OK/CANCEL confirmation.
  @param prompt - the prompt used to describe the list of options.
  messageType - the message type (INFORMATION, WARNING or ERROR).
  @param optionType - the option type (YES_NO_OPTION, YES_NO_CANCEL_OPTION or
  OK_CANCEL_OPTION).
  @param defaultOption - the default option from the provided optionType (YES,
  NO, CANCEL or OK).
  @exception java.lang.IllegalArgumentException - if prompt is null, if prompt
  has a length of 0, if messageType is not either INFORMATION, WARNING, or
  ERROR, if optionType is not either YES_NO_OPTION, YES_NO_CANCEL_OPTION, or
  OK_CANCEL_OPTION, or if defaultOption does not correspond to one of the
  options in optionType.
  */
  public ConfirmationCallback(
    String prompt,
    int messageType,
    int optionType,
    int defaultOption
  )
  {
    setPrompt(prompt);
    setMessageType(messageType);
    setOptionType(optionType,defaultOption);
    this.defaultOption = defaultOption;
  }

  /**
  Construct a ConfirmationCallback with a prompt, message type, a list of
  options and a default option.
  Underlying security services use this constructor if they require a
  confirmation different from the available preset confirmations provided (for
  example, CONTINUE/ABORT or STOP/GO). The confirmation options are listed in
  the options array.
  @param prompt - the prompt used to describe the list of options.
  messageType - the message type (INFORMATION, WARNING or ERROR).
  @param options - the list of confirmation options.  defaultOption - the
  default option, represented as an index into the options array.
  @exception java.lang.IllegalArgumentException - if prompt is null, if prompt
  has a length of 0, if messageType is not either INFORMATION, WARNING, or
  ERROR, if options is null, if options has a length of 0, if any element from
  options is null, if any element from options has a length of 0, or if
  defaultOption does not lie within the array boundaries of options.
  */
  public ConfirmationCallback(
    String prompt,
    int messageType,
    String[] options,
    int defaultOption
  )
  {
    setPrompt(prompt);
    setMessageType(messageType);
    setOptions(options,defaultOption);
    this.defaultOption = defaultOption;
  }

  /**
  Get the prompt.
  @return the prompt, or null if this ConfirmationCallback was instantiated
  without a prompt.
  */
  public String getPrompt()
  {
    return this.prompt;
  }

  /**
  Get the option type.  If this method returns UNSPECIFIED_OPTION, then this
  ConfirmationCallback was instantiated with options instead of an optionType.
  In this case, invoke the getOptions method to determine which confirmation
  options to display.
  @return the option type (YES_NO_OPTION, YES_NO_CANCEL_OPTION or
  OK_CANCEL_OPTION), or UNSPECIFIED_OPTION if this ConfirmationCallback was
  instantiated with options instead of an optionType.
  */
  public int getOptionType()
  {
    if (this.options != null)
    {
      return UNSPECIFIED_OPTION;
    }
    else
    {
      return this.optionType;
    }
  }

  /**
  Get the confirmation options.
  @return the list of confirmation options, or null if this
  ConfirmationCallback was instantiated with an optionType instead of options.
  */
  public String[] getOptions()
  {
    return this.options;
  }

  /**
  Get the default option.
  @return the default option, represented as YES, NO, OK or CANCEL if an
  optionType was specified to the constructor of this ConfirmationCallback.
  Otherwise, this method returns the default option as an index into the
  options array specified to the constructor of this ConfirmationCallback.
  */
  public int getDefaultOption()
  {
    return this.defaultOption;
  }

  /**
  Set the selected confirmation option.
  @param selection - the selection represented as YES, NO, OK or CANCEL if an
  optionType was specified to the constructor of this ConfirmationCallback.
  Otherwise, the selection represents the index into the options array
  specified to the constructor of this ConfirmationCallback.
  */
  public void setSelectedIndex(int selection)
  {
    if (this.options != null)
    {
      setOptions(options,selection);
    }
    else
    {
      setOptionType(optionType,selection);
    }
  }

  /**
  Get the selected confirmation option.
  @return the selected confirmation option represented as YES, NO, OK or
  CANCEL if an optionType was specified to the constructor of this
  ConfirmationCallback. Otherwise, this method returns the selected
  confirmation option as an index into the options array specified to the
  constructor of this ConfirmationCallback.
  */
  public int getSelectedIndex()
  {
    return this.selectedOption;
  }

  //------------------------------------------------------------------

  private void setMessageType(int messageType)
  throws IllegalArgumentException
  {
    switch (messageType)
    {
      case INFORMATION:
      case WARNING:
      case ERROR:
        this.messageType = messageType;
        break;
      default:
        throw new IllegalArgumentException("illegal message type");
    }
  }

  private void setOptionType(int optionType, int selectedOption)
  throws IllegalArgumentException
  {
    switch (optionType)
    {
      case YES_NO_OPTION:
        this.optionType = optionType;
        switch (selectedOption)
        {
          case YES:
          case NO:
            this.selectedOption = selectedOption;
            break;
          default:
            throw new IllegalArgumentException("invalid option");
        }
        break;
      case YES_NO_CANCEL_OPTION:
        this.optionType = optionType;
        switch (selectedOption)
        {
          case YES:
          case NO:
          case CANCEL:
            this.selectedOption = selectedOption;
            break;
          default:
            throw new IllegalArgumentException("invalid option");
        }
        break;
      case OK_CANCEL_OPTION:
        this.optionType = optionType;
        switch (selectedOption)
        {
          case OK:
          case CANCEL:
            this.selectedOption = selectedOption;
            break;
          default:
            throw new IllegalArgumentException("invalid option");
        }
        break;
      default:
        throw new IllegalArgumentException("illegal option type");
    }
  }

  private void setOptions(String[] options, int selectedOption)
  throws IllegalArgumentException
  {
    if ((selectedOption < 0) || (selectedOption > options.length-1))
    {
      throw new IllegalArgumentException("invalid default option");
    }
    if ((options == null) || (options.length == 0))
    {
      throw new IllegalArgumentException("options is null or zero length");
    }
    for (int i=0;i<options.length;i++)
    {
      if ((options[i] == null) || (options[i].length() == 0))
      {
        throw new IllegalArgumentException(
          "options element "+i+"is null or zero length"
        );
      }
    }
    this.options = options;
    this.selectedOption = selectedOption;
  }

  private void setPrompt(String prompt)
  throws IllegalArgumentException
  {
    if ((prompt == null) || (prompt.length() == 0))
    {
      throw new IllegalArgumentException("prompt is null or zero length");
    }
    this.prompt = prompt;
  }

}

