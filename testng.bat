@echo off
if exist allure\allure-results\ (
cd allure\allure-results
for /r %%f in (*.*) do del %%f
cd ..
cd ..
call mvn clean test -Dsurefire.suiteXmlFiles=src/main/resources/testng.xml
) else (
call mvn clean test -Dsurefire.suiteXmlFiles=src/main/resources/testng.xml
)