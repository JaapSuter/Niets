SET PATH=%PATH%;%JAVA_HOME%\bin;
FOR %%A IN ('DIR *.cod /B') DO java.exe -classpath C:\Users\Jaap\Projects\Code\Niets\external\tools\Bin_Coddec_2008-7-16_11.37_coddec\bin\Release net.rim.tools.compiler.Compiler %%A