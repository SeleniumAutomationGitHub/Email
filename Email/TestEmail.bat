set projectLocation=C:\Users\SUMANTA\git\Email\Email
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\TestEmail.xml