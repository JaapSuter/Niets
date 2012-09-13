
package javax.security.sasl;

/**
 * This callback is used by SaslClient and SaslServer to obtain one or
 * more realms given a list of realm choices.
 */

public class RealmChoiceCallback
   extends javax.security.auth.callback.ChoiceCallback
{
   
   /**
    * Constructs a RealmChoiceCallback with a prompt, a list of choices and
    * a default choice.
    *
    * IllegalArgumentException is thrown if prompt is null or the empty
    * string, or if defaultRealm is empty or null.
    *
    * @param prompt The non-null prompt to use to request the realm
    * @param choices The non-null list of realms to choose from
    * @param defaultChoice The choice to use as the default choice when the
    * list of choices is displayed. It is as an index into the choices array.
    * @param multipleSelectionsAllowed Specifies whether or not multiple
    * selections can be made from the list of choices.
   */

   public RealmChoiceCallback
      (
         String prompt,
         String[]choices,
         int defaultChoice,
         boolean multipleSelectionsAllowed
      )
   {
      super(prompt,choices,defaultChoice,multipleSelectionsAllowed);
   }

}

