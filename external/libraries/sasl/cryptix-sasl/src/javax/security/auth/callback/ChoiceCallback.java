
package javax.security.auth.callback;

public class ChoiceCallback
      implements Callback
{
  /**
  Underlying security services instantiate and pass a ChoiceCallback to
  the invokeCallback method of a CallbackHandler to display a list of
  choices and to retrieve the selected choice(s).
  See Also: 
  CallbackHandler
  */

  private String prompt;
  private String[] choices;
  private int defaultChoice;
  private boolean multipleSelectionsAllowed;
  private int[] selections;

  //----------------------------------------------------------------------
  // Constructor Detail
  //----------------------------------------------------------------------

  /**
  Construct a ChoiceCallback with a prompt, a list of choices, a default
  choice, and a boolean specifying whether or not multiple selections from
  the list of choices are allowed.

  @param prompt the prompt used to describe the list of choices.  choices -
  the list of choices.

  @param defaultChoice the choice to be used as the default choice when the
  list of choices are displayed. This value is represented as an index into
  the choices array.

  @param multipleSelectionsAllowed boolean specifying whether or not
  multiple selections can be made from the list of choices.

  @exception java.lang.IllegalArgumentException if prompt is null, if prompt
  has a length of 0, if choices is null, if choices has a length of 0, if
  any element from choices is null, if any element from choices has a length
  of 0 or if defaultChoice does not fall within the array boundaries of
  choices.
  */

  public ChoiceCallback(String prompt,
                        String[] choices,
                        int defaultChoice,
                        boolean multipleSelectionsAllowed)
  {
    this.prompt = prompt;
    this.choices = choices;
    this.defaultChoice = defaultChoice;
    this.multipleSelectionsAllowed = multipleSelectionsAllowed;
  }

  //----------------------------------------------------------------------
  // Method Detail
  //----------------------------------------------------------------------

  /**
  Get the prompt.
  @return the prompt
  */

  public java.lang.String getPrompt()
  {
    return this.prompt;
  }

  //----------------------------------------------------------------------

  /**
  Get the list of choices.
  @return the list of choices.
  */

  public java.lang.String[] getChoices()
  {
    return this.choices;
  }

  //----------------------------------------------------------------------

  /**
  Get the defaultChoice.
  @return the defaultChoice, represented as an index into the the choices
  list.
  */

  public int getDefaultChoice()
  {
    return this.defaultChoice;
  }

  //----------------------------------------------------------------------

  /**
  Get the boolean determining whether multiple selections from the choices
  list are allowed.
  @return whether multiple selections are allowed.
  */

  public boolean allowMultipleSelections()
  {
    return this.multipleSelectionsAllowed;
  }

  //----------------------------------------------------------------------

  /**
  Set the selected choice.
  @param selection - the selection represented as an index into the choices
  list.
  */

  public void setSelectedIndex(int selection)
  {
    this.selections = new int[1];
    this.selections[0] = selection;
  }

  //----------------------------------------------------------------------

  /**
  @param selections the selections represented as indexes into the choices
  list.
  @exception UnsupportedOperationException if multiple selections are not
  allowed, as determined by allowMultipleSelections.
  */

  public void setSelectedIndexes(int[] selections)
  {
    /*
    if (!this.multipleSelectionsAllowed)
      throw new UnsupportedOperationException(
    "multiple selections are not allowed"
      );
    */
    if (this.multipleSelectionsAllowed)
      this.selections = selections;
  }

  //----------------------------------------------------------------------

  /**
  Get the selected choices.
  @return the selected choices, represented as indexes into the choices
  list.
  */

  public int[] getSelectedIndexes()
  {
    return this.selections;
  }

  //----------------------------------------------------------------------
}

