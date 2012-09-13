package cryptix.sasl.srp;

// $Id: SRPParams.java,v 1.6 2001/08/31 09:11:39 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation Limited. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

/**
 * The following is a list of key names designating the values exchanged
 * between the server and client in an SRP communication authentication phase.
 *
 * @version $Revision: 1.6 $
 */
public interface SRPParams
{
   /**
    * The name of the default message digest algorithm to use when no name
    * is explicitely given. In this implementation this is SHA-1 with 160-bit
    * output.
    */
   String SRP_DEFAULT_DIGEST_NAME = "SHA-1";

   // canonical names of other supported message digest algorithms
   String SRP_SHA_NAME =        "SHA";
   String SRP_SHA1_NAME =       "SHA1";
   String SRP_SHA_160_NAME =    "SHA-160";
   String SRP_MD5_NAME =        "MD5";
   String SRP_RIPEMD_128_NAME = "RIPEMD-128";
   String SRP_RIPEMD_160_NAME = "RIPEMD-160";
   String SRP_SHA_256_NAME =    "SHA-256";
   String SRP_SHA_384_NAME =    "SHA-384";
   String SRP_SHA_512_NAME =    "SHA-512";

   /**
    * The property name of the message digest algorithm name to use in a given
    * SRP incarnation.
    */
   String SRP_DIGEST_NAME = "srp.digest.name";

	/** The public shared modulus: n. */
	String SHARED_MODULUS = "srp.N";

	/** The GF generator used: g. */
	String FIELD_GENERATOR = "srp.g";

	/** The list of server's available security options. */
	String AVAILABLE_OPTIONS = "srp.L";

	/** The client's chosen security options. */
	String CHOSEN_OPTIONS = "srp.o";

	/** The client's username. */
	String USER_NAME = "srp.U";

	/** The client's authorization ID. */
	String USER_ROLE = "srp.I";

	/** The user's salt. */
	String USER_SALT = "srp.s";

	/** The user's password verifier. */
	String PASSWORD_VERIFIER = "srp.v";

	/** The client's public ephemeral exponent: A. */
	String CLIENT_PUBLIC_KEY = "srp.A";

	/** The server's public ephemeral exponent: B. */
	String SERVER_PUBLIC_KEY = "srp.B";

	/** The client's evidence: M1. */
	String CLIENT_EVIDENCE = "srp.M1";

	/** The server's evidence: M2. */
	String SERVER_EVIDENCE = "srp.M2";

	/** Name of SRP mandatory service property. */
	String SRP_MANDATORY = "cryptix.sasl.srp.mandatory";

	/** Name of SRP replay detection property. */
	String SRP_REPLAY_DETECTION = "cryptix.sasl.srp.replay.detection";

	/** Name of SRP integrity protection property. */
	String SRP_INTEGRITY_PROTECTION = "cryptix.sasl.srp.integrity";

	/** Name of SRP confidentiality protection property. */
	String SRP_CONFIDENTIALITY = "cryptix.sasl.srp.confidentiality";

	/** Name of SRP password file property. */
   String PASSWORD_FILE = "cryptix.sasl.srp.password.file";

	/** Default fully qualified pathname of the SRP password file. */
   String DEFAULT_PASSWORD_FILE = "/etc/tpasswd";

   /** Default value for replay detection security service. */
   boolean DEFAULT_REPLAY_DETECTION = true;

   /** Default value for integrity protection security service. */
   boolean DEFAULT_INTEGRITY = true; // implied by the previous option

   /** Default value for confidentiality protection security service. */
   boolean DEFAULT_CONFIDENTIALITY = false;

   // constants defining HMAC names
   String HMAC_SHA1 =       "hmac-sha1";
   String HMAC_MD5 =        "hmac-md5";
//   String HMAC_RIPEMD_160 = "hmac-ripemd-160"; // broken cause not cloneable

   /** Available HMAC algorithms for integrity protection. */
   String[] INTEGRITY_ALGORITHMS = { HMAC_SHA1, HMAC_MD5 };

   // constants defining Cipher names
   String AES =      "aes";
   String CAST5 =    "cast5";
   String BLOWFISH = "blowfish";

   /** Available Cipher algorithms for confidentiality protection. */
   String[] CONFIDENTIALITY_ALGORITHMS = { AES, CAST5, BLOWFISH };

   /** String for no mandatory security service. */
   String MANDATORY_NONE = "none";

   /** String for mandatory replay detection. */
   String MANDATORY_REPLAY_DETECTION = "replay detection";

   /** String for mandatory integrity protection. */
   String MANDATORY_INTEGRITY = "integrity";

   /** String for mandatory confidentiality protection. */
   String MANDATORY_CONFIDENTIALITY = "confidentiality";

   /** Default mandatory security service required. */
//   String DEFAULT_MANDATORY = MANDATORY_NONE;
   String DEFAULT_MANDATORY = MANDATORY_REPLAY_DETECTION;
//   String DEFAULT_MANDATORY = MANDATORY_INTEGRITY;
//   String DEFAULT_MANDATORY = MANDATORY_CONFIDENTIALITY;

   /** Name of the UID field in the plain password file. */
   String MD_NAME_FIELD = "srp.md.name";

   /** Name of the GID field in the plain password file. */
   String USER_VERIFIER_FIELD = "srp.user.verifier";

   /** Name of the GECOS field in the plain password file. */
   String SALT_FIELD = "srp.salt";

   /** Name of the SHELL field in the plain password file. */
   String CONFIG_NDX_FIELD = "srp.config.ndx";
}
