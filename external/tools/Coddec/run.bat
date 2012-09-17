SET PATH=%PATH%;%JAVA_HOME%\bin;
FOR %%A IN ('DIR *.cod /B') DO java.exe -classpath C:\Users\Jaap\Projects\Code\Niets\external\tools\Coddec\coddec\bin net.rim.tools.compiler.Compiler %%A > output.log