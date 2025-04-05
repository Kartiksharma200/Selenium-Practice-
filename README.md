# Selenium Practice Project

This is a comprehensive **Selenium Automation Practice Project** developed to enhance and demonstrate automation testing skills using various tools and frameworks like **Selenium WebDriver**, **TestNG**, **ExtentReports**, and **Apache POI**.

## 📌 Project Overview

This project consists of multiple automation test scripts covering a wide range of test scenarios:
- Web automation using Java + Selenium WebDriver
- TestNG framework for test management
- Extent Reports for detailed reporting
- JavaScriptExecutor usage
- Handling Web Elements, iFrames, Alerts, Popups, Excel Files, and more
- POM and modular test structure
- Integration with Excel files for data-driven testing
- Custom listeners and assertions (soft & hard)

---

## 🛠️ Technologies Used

- **Java**
- **Selenium WebDriver**
- **TestNG**
- **ExtentReports**
- **Apache POI**
- **JavaScriptExecutor**
- **Maven**

---

## 📂 Directory Structure

~~~
Directory structure:
└── kartiksharma200-selenium-practice-project/
    ├── README.md
    ├── pom.xml
    ├── testng.xml
    ├── reports/
    │   └── myReport.html
    ├── src/
    │   └── main/
    │       └── java/
    │           ├── Action_Test.java
    │           ├── Actions_with_js.java
    │           ├── apache.java
    │           ├── AssignmentEditbox.java
    │           ├── Bigbasket.java
    │           ├── Booktoscrape.java
    │           ├── demo.java
    │           ├── ElementValidation.java
    │           ├── Flipkart.java
    │           ├── HandlingExcel.java
    │           ├── iframe.java
    │           ├── interview.java
    │           ├── KeyboardAction.java
    │           ├── Redbus_Test.java
    │           ├── Scroll_js.java
    │           ├── Selenium_first.java
    │           ├── WindowHandle.java
    │           ├── Zoom_js.java
    │           ├── Assessment/
    │           │   ├── alert_And_iframe.java
    │           │   ├── CartForm.java
    │           │   ├── evaluation_1.java
    │           │   └── facebook_signup_Page.java
    │           ├── Assignments/
    │           │   ├── drag_and_drop.java
    │           │   ├── file_Upload.java
    │           │   ├── HandlingExcel_Inst.java
    │           │   ├── HandlingPop_Up.java
    │           │   ├── iframe_Assignments_28Nov.java
    │           │   ├── testng.xml
    │           │   ├── TestNg_radio_checkbox.java
    │           │   ├── TestNG_with_xmlFile.java
    │           │   └── WindowHandle_28Nov.java
    │           ├── demo/
    │           │   └── gmail.java
    │           ├── Evaluation2/
    │           │   └── main.java
    │           ├── Extent_Reports/
    │           │   ├── ExtentReports_Manager.java
    │           │   └── OrangeHRM_Test.java
    │           ├── SPT105_Evaluation_1/
    │           │   ├── Alert_Problem.java
    │           │   ├── Iframe_Problem.java
    │           │   ├── Scroll_Problem.java
    │           │   ├── Selenium_Problem.java
    │           │   └── Windowhandle_Problem.java
    │           ├── TestNG/
    │           │   ├── Annotations.java
    │           │   ├── assertionsTests.java
    │           │   ├── HardAssertion.java
    │           │   ├── ParallelTest.java
    │           │   ├── SoftAssert_test.java
    │           │   ├── Suitstest.java
    │           │   ├── TestMethods.java
    │           │   └── testng.xml
    │           └── TestNG_Listeners/
    │               ├── Listeners_Manager.java
    │               └── testng.xml
    ├── Test Data/
    │   └── Instagram Assignment.xlsx
    └── test-output/
        ├── emailable-report.html
        ├── index.html
        ├── testng-failed.xml
        ├── testng-reports.css
        ├── testng-reports.js
        ├── testng-reports1.css
        ├── testng-reports2.js
        ├── testng-results.xml
        ├── testng.css
        ├── Default suite/
        │   ├── Default test.html
        │   ├── Default test.xml
        │   └── testng-failed.xml
        ├── junitreports/
        │   ├── TEST-Assignments.TestNg_radio_checkbox.xml
        │   ├── TEST-Assignments.TestNG_with_xmlFile.xml
        │   ├── TEST-Extent_Reports.OrangeHRM_Test.xml
        │   ├── TEST-Test_NG.Annotations.xml
        │   ├── TEST-Test_NG.assertionsTests.xml
        │   ├── TEST-Test_NG.HardAssertion.xml
        │   ├── TEST-Test_NG.SoftAssert_test.xml
        │   ├── TEST-Test_NG.Suitstest.xml
        │   ├── TEST-TestNG.assertionsTests.xml
        │   ├── TEST-TestNG.ParallelTest.xml
        │   ├── TEST-TestNG.TestMethods.xml
        │   └── TEST-TestNG_Listeners.OrangeHRM_Test.xml
        ├── old/
        │   ├── index.html
        │   ├── Default suite/
        │   │   ├── classes.html
        │   │   ├── Default test.properties
        │   │   ├── groups.html
        │   │   ├── index.html
        │   │   ├── main.html
        │   │   ├── methods-alphabetical.html
        │   │   ├── methods-not-run.html
        │   │   ├── methods.html
        │   │   ├── reporter-output.html
        │   │   ├── testng.xml.html
        │   │   └── toc.html
        │   ├── Suite/
        │   │   ├── classes.html
        │   │   ├── groups.html
        │   │   ├── index.html
        │   │   ├── main.html
        │   │   ├── methods-alphabetical.html
        │   │   ├── methods-not-run.html
        │   │   ├── methods.html
        │   │   ├── reporter-output.html
        │   │   ├── Test.properties
        │   │   ├── testng.xml.html
        │   │   └── toc.html
        │   └── Suite1/
        │       ├── classes.html
        │       ├── groups.html
        │       ├── index.html
        │       ├── main.html
        │       ├── methods-alphabetical.html
        │       ├── methods-not-run.html
        │       ├── methods.html
        │       ├── reporter-output.html
        │       ├── Test1.properties
        │       ├── testng.xml.html
        │       └── toc.html
        ├── Suite/
        │   ├── Test.html
        │   ├── Test.xml
        │   └── testng-failed.xml
        └── Suite1/
            ├── Test1.html
            └── Test1.xml
~~~

---

## ✅ Features Covered

- ✅ Browser actions using Selenium WebDriver
- ✅ Keyboard and mouse interactions
- ✅ JavaScript execution for scrolling/zooming
- ✅ Window and tab handling
- ✅ Handling Alerts, iFrames, and Popups
- ✅ Excel integration using Apache POI
- ✅ TestNG XML suite execution
- ✅ Soft & Hard assertions
- ✅ Parallel test execution
- ✅ TestNG Listeners implementation
- ✅ Custom HTML report generation

---

## 🚀 How to Run

1. **Clone the Repository**
   ~~~
   git clone https://github.com/kartiksharma200/selenium-practice-project.git
   ~~~
   
