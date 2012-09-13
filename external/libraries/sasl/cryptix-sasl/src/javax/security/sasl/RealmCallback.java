
package javax.security.sasl;

/**
 * This callback is used by SaslClient and SaslServer to retrieve realm
 * information.
 */
 
public class RealmCallback
   extends javax.security.auth.callback.TextInputCallback
{

   /**
    * Constructs a RealmCallback with a prompt.
    *
    * @param prompt The non-null prompt to use to request the realm
    * information
    */
   public RealmCallback
      (
         String prompt
      )
   {
      super(prompt);
   }

   /**
    * Constructs a RealmCallback with a prompt and a default realm.
    *
    * @param prompt The non-null prompt to use to request the realm
    * information
    * @param defaultRealm The non-null default realm to use
    */
   public RealmCallback
      (
         String prompt,
         String defaultRealm
      )
   {
      super(prompt,defaultRealm);
   }

}

