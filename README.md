# CURA-Healthcare-Project
![logo](https://github.com/user-attachments/assets/ed5fd586-bc0f-4757-9644-7b0812ec6a77)

The Project is to build a system that can automatically test the major functionalities of the CURA Healthcare service. I have used Data-Driven testing for testing Login functionality with the Data provider and also it covers the main features of Medicare and Medicaid program as well.

## Coding Style:
- I have used Java Programming language with POM(Page Object Model) design pattern with Selenium framework in this project.

## IDE/Language:
- IDE: Eclipse
- Language: Java
## Technology/Frameworks used:
- TestNG framework - Used for various purposes like Data provider and the prioritization of tests and suites.
- Extent reports library - Used for the detailed reporting of the test cases status with various information like screenshots.
- Maven project - For the ease of handling the dependencies in one place.
- Selenium Java library - Selenium provides support for the automation of web browsers. It provides extensions to emulate user interaction with browsers, a distribution server for scaling browser allocation, and the infrastructure for implementations of the W3C WebDriver specification.
- Apache POI library- For the reading and writing the data in an Excel sheet.
- Maven Surefire plugin- For the building of a Maven build and for Jenkins CI/CD implementation for invoking the build by local host or remotely.
- Jenkins tool - For triggering the build eventually executing the tasks locally or remotely.
- WebDriverManager library - Automated driver management and other helper features for Selenium WebDriver in Java.

  ## Steps to create the project and adding dependencies:
- Step 1: Create a new project of type Maven in Eclipse IDE.
- Step 2: Then add a testNG library by navigating to the Java build path and adding the testNG library. Then Apply and close.
- Step 3: The next step is to add the important dependencies in the Pom.xml file(refer to the below dependencies screenshot).
- Step 4: Since we are following the POM design pattern we need to create four packages(refer to the below POM screenshot).
- Step 5: Finally, add the Maven sure surefire plugin in the Pom.xml file under tag <build></build>(refer to the below Maven surefire screenshot).
- Step 6: Create a new testng.xml file adding the test java classes to be executed under suite.
- Step 7: Run the project a testNG suite.

## Dependencies screenshot:
![POM1](https://github.com/user-attachments/assets/61fc9a60-f0d2-485e-9da4-5f5004475ce4)
![POM2](https://github.com/user-attachments/assets/7a80a4cb-0987-4974-9d8c-d36f5680cf04)
![POM3](https://github.com/user-attachments/assets/ab7da366-62c8-413e-b211-3fbd77189b17)
![POM4](https://github.com/user-attachments/assets/cdf40980-4482-4e29-b941-0e42cd606956)

## POM file screenshot:
![POM](https://github.com/user-attachments/assets/7398ef1f-cb98-4b39-9394-fa52f284c29a)


## Test case Code Example:
- I have used constructor chaining here in order to access the methods of pages with single object creation.
- We are using try/catch to handle the exception that occurs in between the process of executing a test case.
- Finally, based on the validation if the test case is passed we report that test case as Pass/Fail in extent report.


## Test Scenarios covered:
- Checked Given URL is broken or not
- Login scenarios(Positive and Negative)
- Medicare scenario
- Medicaid scenario 

## Maven output Build success screenshot:
 
![Maven Build success output](https://github.com/user-attachments/assets/6d8f081a-d1c7-405b-b638-f1592868cb4e)

## Jenkins output Build success screenshot:
![Jenkins Build success output](https://github.com/user-attachments/assets/0012fe5b-5b50-4275-a999-ead603bb0a01) 

## Extent report screenshots:
![Extentreport1](https://github.com/user-attachments/assets/50a26e76-22cf-48a8-9ada-ab4cb62e646c)
![Extentreport2](https://github.com/user-attachments/assets/2d79ad7a-81ee-4087-9b88-bcc0a6125103)
![Extentreport3](https://github.com/user-attachments/assets/320e717b-a0c2-490b-97d8-b91a341d5c94)

## People who worked on this project
```Venkatesh JM```
