-------------
What is SASL?
-------------

The Simple Authentication and Security Layer (SASL), described in RFC-2222,
is a method for adding authentication support to connection-based protocols.
It is used with popular Internet protocols such as POP3, IMAP, SMTP and LDAP.

---------------------
What is this library?
---------------------

This library includes an implementation of the Java SASL API which is
currently specified in draft-weltman-java-sasl-05.txt, an Internet Draft. It
also includes an implementation of some SASL mechanisms:

  ANONYMOUS (RFC2245)
  CRAM-MD5 (RFC2195)
  OTP (RFC 2444, obsoletes S/KEY in RFC 2222)
  PLAIN (RFC2595)
  SRP (draft-burdis-cat-srp-sasl-05.txt)
  SM2 (draft-naffah-cat-sasl-sm2-01.txt)

-----------
Limitations
-----------

Currently the following SASL mechanisms are not implemented, but there are
plans to implement these in the future:

  DIGEST-MD5 (RFC 2831)
  GSSAPI (draft-ietf-cat-sasl-gssapi-01.txt, updates RFC 2222)

There are currently no plans to implement:

  KERBEROS_V4 (RFC2222)

-------
License
-------

This software is distributed under the Cryptix General License. Please read
CGL.TXT.

This product uses the 'Secure Remote Password' cryptographic authentication
system developed by Tom Wu (tjw@CS.Stanford.EDU), and includes software
developed by Tom Wu and Eugene Jhong for the SRP Distribution
(http://srp.stanford.edu/srp/). See LICENSE.SRP.TXT for details.

The sample client and sample server make use of the GNU Java Getopt library
which is licensed under the LGPL.

------------
Requirements
------------

Before you can use this library you'll need to make sure that you have a
JCE 1.2 compatible library, such as Cryptix JCE:

  http://www.cryptix.org/products/jce12/index.html

To use the samples you will also need the GNU Java getopt library, which you
can get from:

  http://www.urbanophile.com/arenn/hacking/download.html

JDK 1.1 has some missing classes that we need for this library, so it will
currently only work with JDK 1.2 or later.

---------
Compiling
---------

Starting from 0.8.10
--------------------

You need the Apache ANT tool.  Download from <http://jakarta.apache.org/ant/>.

run:

   ant -projecthelp

to view the available options; or just

   ant

to compile and jar the binaries.

Post 0.8.1
----------

Unix:
  For distributions later than 0.8.1, you need GNU make.

Windows:
  For distributions later than 0.8.1, you need the Cygwin Tools (from
  http://sourceware.cygnus.com) which include bash and GNU make.

cd to the directory where the project is installed and run

   make jar

to make the jars, or

   make test

to also run the test harness and prepare for the client/server binaries.

Pre 0.8.1
---------
Download and install cmake:

  http://www.cryptix.org/products/cmake

and make sure cmake.sh is in the PATH.

Edit makefile.jmk and modify the "extra" section to include your JCE jar files
and the GNU Java getopt jar file.

Run cmake:

  % cmake.sh

-------
Contact
-------

Please send any comments, ideas or suggestions to the current maintainer
(keith@cryptix.org).

