package javax.security.sasl;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * Exception thrown on errors and failures in the authentication process.
 *
 * @version $Revision: 1.1 $
 * @since draft-weltman-java-sasl-04
 */
public class SaslException
   extends IOException
{
   private Throwable cause = null;

   /**
    * Constructs a new instance of SaslException. The root exception and
    * the detailed message are null.
    */
   public SaslException()
   {
      super();
   }

   /**
    * Constructs a default exception with a detailed message and no root
    * exception.
    *
    * @param message Possibly null additional detail about the exception.
    */
   public SaslException
      (
         String message
      )
   {
      super(message);
   }

   /**
    * Constructs a new instance of <tt>SaslException</tt> with a detailed
    * message and a root exception. For example, a <tt>SaslException</tt>
    * might result from a problem with the callback handler, which might
    * throw a <tt>NoSuchCallbackException</tt> if it does not support the
    * requested callback, or throw an <tt>IOException</tt> if it had
    * problems obtaining data for the callback. The <tt>SaslException</tt>'s
    * root exception would then be the exception thrown by the callback handler.
    *
    * @param message Possibly null additional detail about the exception.
    * @param ex A possibly null root exception that caused this exception.
    */
   public SaslException
      (
         String message,
         Throwable ex
      )
   {
      super(message);
      cause = ex;
   }

   /**
    * Returns the possibly null root exception that caused this exception.
    *
    * @returnn the possibly null root exception that caused this exception.
    */
   public Throwable
   getCause()
   {
      return cause;
   }

  /**
  Prints this exception's stack trace to System.err. If this exception has a
  root exception, the stack trace of the root exception is printed to
  System.err instead.
  */

   public void printStackTrace()
   {
      super.printStackTrace();
      if (cause != null)
      {
         cause.printStackTrace();
      }
   }

  /**
  Prints this exception's stack trace to a print stream. If this exception
  has a root exception, the stack trace of the root exception is printed to
  the print stream instead.
  @param ps The non-null print stream to which to print.
  */

   public void printStackTrace(PrintStream ps)
   {
      super.printStackTrace(ps);
      if (cause != null)
      {
         cause.printStackTrace(ps);
      }
   }

  /**
  Prints this exception's stack trace to a print writer. If this exception
  has a root exception, the stack trace of the root exception is printed to
  the print writer instead.
  @param pw The non-null print writer to which to print.
  */

   public void printStackTrace(PrintWriter pw)
   {
      super.printStackTrace(pw);
      if (cause != null)
      {
         cause.printStackTrace(pw);
      }
   }

   public String toString()
   {
      if (cause != null)
      {
         return "SaslException: "+super.toString()+"; caused by: "+cause.toString();
      }
      else
      {
         return "SaslException: "+super.toString();
      }
   }

}

