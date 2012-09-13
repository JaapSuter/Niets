package cryptix.sasl.crammd5;

// $Id: CramMD5Params.java,v 1.5 2001/08/31 09:11:39 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation Limited. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

/**
 * The following is a list of key names and default values.
 *
 * @version $Revision: 1.5 $
 */
public interface CramMD5Params
{
	/** Name of the password file (used by the server) property. */
	String PASSWORD_FILE = "cryptix.sasl.crammd5.password.file";

	/** Default password file (used by the server) pathname. */
	String DEFAULT_PASSWORD_FILE = "/etc/passwd";

   /** Name of the UID field in the plain password file. */
   String UID_FIELD = "crammd5.uid";

   /** Name of the GID field in the plain password file. */
   String GID_FIELD = "crammd5.gid";

   /** Name of the GECOS field in the plain password file. */
   String GECOS_FIELD = "crammd5.gecos";

   /** Name of the DIR field in the plain password file. */
   String DIR_FIELD = "crammd5.dir";

   /** Name of the SHELL field in the plain password file. */
   String SHELL_FIELD = "crammd5.shell";
}
