package cryptix.sasl.plain;

// $Id: PlainParams.java,v 1.2 2001/08/31 09:11:39 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation Limited. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

public interface PlainParams
{
   // Constants
   // -------------------------------------------------------------------------

	/** Name of PLAIN password file property. */
   String PASSWORD_FILE = "cryptix.sasl.plain.password.file";

	/** Default fully qualified pathname of the PLAIN password file. */
   String DEFAULT_PASSWORD_FILE = "/etc/tpasswd";

   /** Name of the UID field in the plain password file. */
   String UID_FIELD = "plain.uid";

   /** Name of the GID field in the plain password file. */
   String GID_FIELD = "plain.gid";

   /** Name of the GECOS field in the plain password file. */
   String GECOS_FIELD = "plain.gecos";

   /** Name of the DIR field in the plain password file. */
   String DIR_FIELD = "plain.dir";

   /** Name of the SHELL field in the plain password file. */
   String SHELL_FIELD = "plain.shell";
}
