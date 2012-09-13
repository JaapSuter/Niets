package cryptix.sasl.otp;

// $Id: OTPParams.java,v 1.6 2001/08/31 09:11:39 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation Limited. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

/*
 * Copyright (c) 2001 Invisible Worlds, Inc.  All rights reserved.
 *
 * The contents of this file are subject to the Blocks Public License (the
 * "License"); You may not use this file except in compliance with the License.
 *
 * You may obtain a copy of the License at http://www.invisible.net/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied.  See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 */

public interface OTPParams
{
   // Constants
   String URI = "http://iana.org/beep/SASL/OTP";

   // Message Constants
   String EXT       = "ext";
   String HEX       = "hex";
   String INIT_HEX  = "init-hex";
   String WORD      = "word";
   String INIT_WORD = "init-word";
   String MECHANISM = "SASL/OTP";
   String SPACE     = " ";
   String COLON     = ":";
   String COMMA     = ",";

   // Error Constants
   String ERR_PARSING_DB = "Error parsing OTP DB";
   String ERR_INVALID_ID = "Invalid or improperly formatted Identity information";
   String ERR_INVALID_RESPONSE = "Invalid or improperly formatted response";
   String ERR_AUTH_FAILURE = "Authentication Failure: Password hash doesn't match";
   String ERR_INCOMPLETE = "Authentication phase not yet complete";
   String ERR_ALGO_UNSUPPORTED = "Algorithm not supported";
   String ERR_SEED_ALPHANUM = "Seed must be composed of alpha-numeric characters only.";
   String ERR_SEED_SIZE = "Seed must 1 to 16 characters in length.";
   String ERR_PASSPHRASE_SIZE = "Passphrase must be between 10 and 63 characters in length";
   String ERR_SEQUENCE_NUMBER = "Sequence number must be a positive integer";
   String ERR_UNEXPECTED_MESSAGE = "Unexpected SASL/OTP Message";
   String ERR_INIT = "Error while parsing init-hex or init-word";
   String ERR_UNKNOWN_COMMAND = "Unknown SASL OTP Command";
   String ERR_SEQUENCE_ZERO = "Authentication unable to proceed because the user's SASL OTP sequence is 0.";
   String WARN_SEQUENCE_LOW = "Warning: User's SASL OTP sequence number is less than 10";

   int MAX_AUTHORISATION_ID_LENGTH  = 255;
   int MAX_AUTHENTICATION_ID_LENGTH = 255;
   int MIN_PASSWORD_LENGTH          = 10;
   int MAX_PASSWORD_LENGTH          = 63;
   int MAX_SEED_LENGTH              = 16;
   int MAX_SEQUENCE_NUMBER          = 999;

   /**
    * The property name of the message digest algorithm name to use in a given
    * incarnation.
    */
   String DIGEST_NAME_KEY = "cryptix.sasl.otp.digestname";

   /**
    * The name of the default message digest algorithm to use when no name
    * is explicitely given. In this implementation this is SHA-1 with 160-bit
    * output.
    */
   String DEFAULT_DIGEST_NAME = "SHA-1";

   String RESPONSE_FORMAT =         "cryptix.sasl.otp.responseformat";
   String DEFAULT_RESPONSE_FORMAT = HEX;
   String ROLE =                    "cryptix.sasl.otp.role";
   String REINIT =                  "cryptix.sasl.otp.reinitialise";
   String PASSWORD_FILE =           "cryptix.sasl.otp.password.file";
   String DEFAULT_PASSWORD_FILE =   "/etc/otpasswd";

   /** Name of the UID field in the plain password file. */
   String ALGORITHM_FIELD = "otp.algorithm";

   /** Name of the GID field in the plain password file. */
   String SEGNUM_FIELD = "otp.segnum";

   /** Name of the GECOS field in the plain password file. */
   String SEED_FIELD = "otp.seed";

   /** Name of the SHELL field in the plain password file. */
   String LAST_HASH_FIELD = "otp.last.hash";
}
