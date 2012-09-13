#! /usr/bin/bash

# $Id: makejetty.sh,v 1.1 2001/03/17 04:04:52 raif Exp $
#
# Copyright (c) 2000-2001 The Cryptix Foundation Limited. All rights reserved.
#
# Use, modification, copying and distribution of this software is subject to
# the terms and conditions of the Cryptix General Licence. You should have
# received a copy of the Cryptix General License along with this library; if
# not, you can download a copy from <http://www.cryptix.org/>.

# -----------------------------------------------------------------------------
# A batch script to process all cryptix.sasl java source files converting them
# to use Jetty's logging framework instead of the standard Log4J one.
#
# IMPORTANT: should be invoked from within the project directory.
#
# $Revision: 1.1 $
# -----------------------------------------------------------------------------

echo "*** Making cryptix-sasl-jetty.jar..."

echo "*** 1. Preparing..."
mkdir jetty
mkdir jetty/cryptix
cp -R src/cryptix/* jetty/cryptix

echo "*** 2. Replacing Log4J with Jetty logging..."
find . -ipath './jetty/cryptix*java' -exec ./bin/tojetty.sh {} \;

echo "*** 3. Compiling new sources..."
CP="lib/javax-sasl.jar:lib/cryptix-jce-api.jar:${JETTY_HOME}/lib/com.mortbay.jetty.jar:${JAVA_HOME}/jre/lib/rt.jar:classes:jetty"
jikes -deprecation +E +P +OLDCSO -d classes -classpath $CP jetty/cryptix/sasl/*.java
jikes -deprecation +E +P +OLDCSO -d classes -classpath $CP jetty/cryptix/sasl/anonymous/*.java
jikes -deprecation +E +P +OLDCSO -d classes -classpath $CP jetty/cryptix/sasl//crammd5/*.java
jikes -deprecation +E +P +OLDCSO -d classes -classpath $CP jetty/cryptix/sasl/plain/*.java
jikes -deprecation +E +P +OLDCSO -d classes -classpath $CP jetty/cryptix/sasl/sm2/*.java
jikes -deprecation +E +P +OLDCSO -d classes -classpath $CP jetty/cryptix/sasl/srp/*.java

echo "*** 4. Jarring new classes..."
${JAVA_HOME}/bin/jar cf lib/cryptix-sasl-jetty.jar -C classes cryptix

echo "*** 5. Cleaning up..."
rm -rf jetty/*
rmdir jetty
