set projectLocation=D:\Projects\Automation\Workspace\Email
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\TestEmail.xml