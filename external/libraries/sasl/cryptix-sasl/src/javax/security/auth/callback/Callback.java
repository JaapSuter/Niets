
package javax.security.auth.callback;

/**
All Known Implementing Classes:
ConfirmationCallback, LanguageCallback, NameCallback, PasswordCallback,
TextInputCallback, TextOutputCallback, ChoiceCallback
*/

public interface Callback
{
  /**
  Implementations of this class are passed to a CallbackHandler,
  allowing underlying security services the ability to interact with a
  calling application to retrieve specific authentication data such as
  usernames and passwords, or to display certain information, such as
  error and warning messages.
  Callback implementations do not retrieve or display the information
  requested by underlying security services. Callback implementations
  simply provide the means to pass such requests to applications, and
  for applications, if appropriate, to return requested information back
  to the underlying security services.

  See Also:
  CallbackHandler, ChoiceCallback, ConfirmationCallback, LanguageCallback,
  NameCallback, PasswordCallback, TextInputCallback, TextOutputCallback
  */
}