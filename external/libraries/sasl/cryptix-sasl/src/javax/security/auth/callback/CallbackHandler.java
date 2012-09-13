
package javax.security.auth.callback;

public interface CallbackHandler
{
  /**
  An application implements a CallbackHandler and passes it to underlying
  security services so that they may interact with the application to
  retrieve specific authentication data, such as usernames and passwords, or
  to display certain information, such as error and warning messages.

  CallbackHandlers are implemented in an application-dependent fashion.  For
  example, implementations for an application with a graphical user
  interface (GUI) may pop up windows to prompt for requested information or
  to display error messages. An implementation may also choose to obtain
  requested information from an alternate source without asking the end
  user.

  Underlying security services make requests for different types of
  information by passing individual Callbacks to the CallbackHandler.  The
  CallbackHandler implementation decides how to retrieve and display
  information depending on the Callbacks passed to it. For example, if the
  underlying service needs a username and password to authenticate a user,
  it uses a NameCallback and PasswordCallback. The CallbackHandler can then
  choose to prompt for a username and password serially, or to prompt for
  both in a single window.
  */

  // Method Detail

  /**

  Retrieve or display the information requested in the provided Callbacks.
  The invokeCallback method implementation checks the instance(s) of the
  Callback object(s) passed in to retrieve or display the requested
  information.
  @param callbacks - an array of Callback objects provided by an underlying
  security service which contains the information requested to be retrieved or
  displayed.
  @exception java.io.IOException - if an input or output error occurs.
  @exception UnsupportedCallbackException - if the implementation of this
  method does not support one or more of the Callbacks specified in the
  callbacks parameter.
  */
  void invokeCallback(Callback[] callbacks)
  throws java.io.IOException, UnsupportedCallbackException;
}