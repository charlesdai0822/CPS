cd allure\allure-results
for /r %%f in (*.*) do del %%f
cd ..
cd ..
mvn clean test -Dsurefire.suiteXmlFiles=src/main/resources/testng.xml