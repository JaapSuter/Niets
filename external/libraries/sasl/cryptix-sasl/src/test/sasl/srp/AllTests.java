package test.sasl.srp;

// $Id: AllTests.java,v 1.3 2001/09/25 09:39:08 raif Exp $
//
// Copyright (c) 2000-2001 The Cryptix Foundation Limited. All rights reserved.
//
// Use, modification, copying and distribution of this software is subject to
// the terms and conditions of the Cryptix General Licence. You should have
// received a copy of the Cryptix General License along with this library; if
// not, you can download a copy from <http://www.cryptix.org/>.

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * TestSuite that runs all the SRP-related tests.<p>
 *
 * @version $Revision: 1.3 $
 * @since version 0.8.9
 */
public class AllTests extends TestCase {

   // Constants and variables
   // -------------------------------------------------------------------------

   public AllTests(String name) {
      super(name);
   }

   // Constructor(s)
   // -------------------------------------------------------------------------

   // Class methods
   // -------------------------------------------------------------------------

   public static void main(String[] args) {
      TestRunner.run(suite());
   }

   public static Test suite() {
      TestSuite result = new TestSuite("SASL SRP regression tests");

      result.addTest(TestOfSRPPasswordFile.suite());
      result.addTest(TestOfSRPPrimitives.suite());
      result.addTest(TestOfSRPAuthInfoProvider.suite());

      return result;
   }

   // Instance methods
   // -------------------------------------------------------------------------
}
