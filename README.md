# cheq_task
# Selenium Project for Saucedemo Testing

This project is created using Selenium Webdriver with Java to demonstrate automated web testing on the Saucedemo website. The tasks include finding products with the maximum and minimum prices, adding them to the cart, and printing their names and descriptions.

## Project Description

The script performs the following tasks:

- **Login to Saucedemo:** Automates browser session to log in to Saucedemo using standard user credentials.
- **Find Maximum Priced Product:**
  - Sorts products by price from high to low.
  - Adds the highest-priced product to the cart.
  - Prints the name and description of this product.
- **Find Minimum Priced Product:**
  - Sorts products by price from low to high.
  - Adds the lowest-priced product to the cart.
  - Prints the name and description of this product.
- **Manage Cart and Logout:**
  - Review the cart contents.
  - Logs out of the session.
  - Closes the browser.

## Setup Instructions

### Prerequisites

Ensure you have Java installed on your system. You can download it from [Oracle's website](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html). Also, ensure Google Chrome is installed on your machine.

### Selenium Setup

1. **Download Selenium WebDriver:**
   - Download the ChromeDriver executable that matches your Chrome version from [ChromeDriver - WebDriver for Chrome](https://sites.google.com/a/chromium.org/chromedriver/).
   - Place the `chromedriver.exe` file in a known location on your machine, e.g., `C:\AutomationConfig\DRIVER\`.

2. **Setup Environment:**
   - Set the system property for the ChromeDriver in your code:
     ```java
     System.setProperty("webdriver.chrome.driver", "C:\AutomationConfig\DRIVER\chromedriver.exe");
     ```

3. **Add Selenium Dependencies:**
   - If you are using Maven, add the following dependency to your `pom.xml`:
     ```xml
     <dependency>
       <groupId>org.seleniumhq.selenium</groupId>
       <artifactId>selenium-java</artifactId>
       <version>4.19.1</version>
     </dependency>
     ```
   - For manual setups, download the Selenium standalone server jar from [SeleniumHQ](https://www.selenium.dev/downloads/) and add it to your project libraries.

### Running the Project

Compile and run the Java file containing the main method to execute the tests. Ensure that all configurations are properly set up according to your system setup.
 
