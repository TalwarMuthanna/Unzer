# Unzer-WebUIAutomatiom

That Automation Testing is Hybrid framework which Uses
----------------------------------------------------------------
1.Selenium <br />
2.Maven <br />
3.Cucumber BDD (Gherkin language) via Junit , <br />
4.using Cucumber 6 Extent report for generating PDF & Spark reports  <br />
5.Using junit for assertions <br />
6.Reading from Properties files for storing environment variables <br />

Structure of Project:
-----------------------------------------------------------------------
1- src/main/java <br />
com.qa.factory :  Package includes a class of methods to initialize the browser <br />
com.util :  Package includes a class of methods to read the config properties <br />

2- src/test/java <br />
Apphooks: Package includes the class of the common components that need to run before and every feature file <br />
com.pages : Package includes the designated pages of Unzer<br />
stepDefinitions : Package includes steps class that has the implementations of the feature files <br />
Runner Package include the test runner that run the step definitionns along with the designated feature file <br />

3- src/test/resources <br />
AppFeature : Package includes the feature file <br />
config.properties that contains the environment variables (name of the browser, URL to run against) <br />
cucumber.properties file includes the properties of the display of the cucumber report over the browser <br />
extent-config xml file includes the properties of the display of the extent report over the browser <br />
extent.properties includes the location of the generated reports and some system info to be displayed in the report <br />

Running the project
----------------------------------------------------------------------------------------
Download the project on your local machine <br />
Import the project to your editor(Eg: Eclipse) <br />
Right Click on the project , choose Maven and Click on Update Project <br />
After the Update Project is completed, update user name and password in the \src\test\resources\config.properties file.<br />
Go to the MyTestRunner under testRunner Package <br />
Right click on the MyTestRunner and Run As Juint Test <br />

Generating The Test Reports :
-----------------------------------------------------------------------------------------------
(open test output folder) and you will get a generated pdf report contains all the details of the execution (pass/fail) <br />
(open test-output/SparkReport), then open (index.html) file on any browser and you will get detailed info of the status of every step in every scenario per every feature file <br />



