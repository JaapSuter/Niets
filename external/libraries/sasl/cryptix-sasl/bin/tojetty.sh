#! /usr/bin/bash

# $Id: tojetty.sh,v 1.1 2001/03/17 04:04:52 raif Exp $
#
# Copyright (c) 2000-2001 The Cryptix Foundation Limited. All rights reserved.
#
# Use, modification, copying and distribution of this software is subject to
# the terms and conditions of the Cryptix General Licence. You should have
# received a copy of the Cryptix General License along with this library; if
# not, you can download a copy from <http://www.cryptix.org/>.

# -----------------------------------------------------------------------------
# A batch script to replace using log4j framework with Jetty's own in
# designated source file.  Used for building a jetty-specific distribution of
# the library.
#
# $Revision: 1.1 $
# -----------------------------------------------------------------------------

cat $1 | \
sed -e "s/import org\.apache\.log4j\.Category/import com\.mortbay\.Util\.Code/" \
	 -e "s/static Category/\/\/static Category/" \
	 -e "s/cat\.debug(/Code\.debug(/" \
	 -e "s/cat\.info(/Code\.debug(/" \
	 -e "s/cat\.warn(/Code\.warning(/" \
	 -e "s/cat\.error(/Code\.fail(/" \
	 -e "s/cat\.fatal(/Code\.fail(/" \
>.tmp; \
mv .tmp $1
