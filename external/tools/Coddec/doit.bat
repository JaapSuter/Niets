SET PATH=%PATH%;%JAVA_HOME%\bin;
java -cp coddec\bin net.rim.tools.compiler.Compiler %1 > OUT 2>&1
