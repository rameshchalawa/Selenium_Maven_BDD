#Selenium_Maven_BDD  

**Overview**  
The Selenium Maven BDD Framework is a test automation framework for web applications using Java, Selenium WebDriver, and Cucumber BDD, following the Page Object Model design pattern.  Key features include BDD with Cucumber JVM, Maven for build management, POM implementation, Cucumber HTML Reports, and cross-browser support.  

**Folder Structure**  
<img width="387" height="782" alt="image" src="https://github.com/user-attachments/assets/11c6abe3-56ca-4c30-974f-b7bfbd426e06" />  

**Project Structure**  
src/test/java/pageObjects: Page Object Classes for Framework  
src/test/java/stepDefinitions: Scenario Steps classes for Framework  
src/test/java/testRunner: TestRun Classes for Framework  
src/test/java/utilities: Utilities file like WaitHelper  
pom.xml: Maven configuration file  
config.properties : Browser path location  
log4j.properties: Test Logging    

**Getting Started**  

Clone the repository: git clone https://github.com/rameshchalawa/Selenium_Maven_BDD.git  
Import the project into your IDE as a Maven project  
Update dependencies in pom.xml  
Run tests using Maven: mvn test  



