
package javax.security.sasl;

/**
  * This callback is used by SaslServer to determine whether one entity
  * (identified by an authenticated authentication id) can act on behalf of
  * another entity (identified by an authorization id).
  */

public class AuthorizeCallback
   implements javax.security.auth.callback.Callback
{
   private String authenticationId = null;
   private String authorisationId  = null;
   private String authorisedId  = null;
   private boolean authorised = false;

   /**
    * @param authnId The authentication id
    * @param authzId The authorization id
    */
   public AuthorizeCallback
      (
         String authnId,
         String authzId
      )
   {
      this.authenticationId = authnId;
      this.authorisationId  = authzId;
   }

   /**
    * Returns the authentication id to check.
    *
    */
   public String
   getAuthenticationId()
   {
      return this.authenticationId;
   }

   /**
    * Returns the authorization id to check.
    *
    */
   public String
   getAuthorizationId()
   {
      return this.authorisationId;
   }

   /**
    * Returns true if authorization is allowed, false otherwise.
    *
    */
   public boolean
   isAuthorized()
   {
      return this.authorised;
   } 

   /**
    * Sets whether authorization is allowed or not.
    *
    * @param ok true if authorization is to be allowed, false otherwise
    */
   public void
   setAuthorized
      (
         boolean ok
      )
   {
      this.authorised = ok;
   }

   /**
    * Returns the id of the authorized user. If null, this means the
    * authorization failed.
    */
   public String
   getAuthorizedId()
   {
      if (this.authorised == false)
      {
         return null;
      }
      if (this.authorisedId != null)
      {
         return this.authorisedId;
      }
      return this.authorisationId;
   }

   /**
    * Sets the id of the authorized entity. The method is called by the
    * handler only if the id is different from that returned by
    * getAuthorizationId(). For example, the id might need to be
    * canonicalized for the environment in which it will be used.
    *
    * @param id The id of the authorized user
    */
   public void
   setAuthorizedId
      (
         String id
      )
   {
      this.authorisedId = id;
   }

}

