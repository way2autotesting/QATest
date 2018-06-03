# Why Cucumber JVM, Selenium ui automation
## Behaviour Driven Development (BDD)
This is based on Test Driven Development (TDD) and it aims to bridge the grap between Business Analyst and Developer.
BDD not only bridges the gap between the Business Analyst and Developers but also between

+ Manual QA with Automation testers (who write BDD)
+ Manual QA with Developers

### Why BDD
BDD seems to be like a plain text, but they have their own syntax based on certain tools and it's going to convert the plain text to executable code. This also support different tools with the most famous like

+ Cucumber: A tool which helps BDD, also support different language implementation like JAVA

##### How to RUN test? This project contain all module.
###### You can launch your test with maven test with parameters : Open CMD -> Navigate to project PATH then enter MAVEN command 
+ mvn clean
+ mvn compile
+ mvn verify

 
###### You can launch your test with feature file: Select a feature file and run via Right-Click



###### You can launch your test with single click tag "regression": right click TestRunner.java class
locate PATH: AutomationPractice\src\test\java\com\runner\TestRunner.java

### 1. setup environements

#### 1.1 Prerequesite


+ Java 1.8.x sdk and jre must be installed and configured
+ Maven 3.5.x must be  installed and configured
+ IDE must be  installed and configured Intellij or eclipse 

+ Download drivers for chrome, Internet explorer your O.S windows or linux.
 from selenium website :  https://www.seleniumhq.org/download/
 
+ http://automationpractice.com/index.php  credentials must installed and configured, allow to connect to site.



### 2. Automation project structure

> Package: main.java.base

Contains all main  class
+ **BaseUtil.java**  main class to started web driver     



> Package: main.java.componentHelper

Contains helper objects



> Package: main.java.pages

Contains pages object



> Package: main.java.repo:  Properties files

config.properties: contains commons configuration for project
global.properties: example which contain configuration for a context of test like browsers or can be extended to environment

Must contain all utils class



> Package: test.java.com.stepdefs

Contains all main  class
+ **Hooks.java**  main class to started web driver
+ **AddDressToCartStepdefs.java** configure context for test
 * features:  path to the feature file
+ **CreateNewAccountStepdefs.java** configure context for test
 * features:  path to the feature file
+ **LoginStepdefs.java**  configure context for test
 * features:  path to the feature file

