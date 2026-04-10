# Automation Test Login

This project contains automated tests for the login functionality of a web application using Selenium WebDriver and TestNG.

## Description

The project demonstrates a comprehensive Selenium test suite for validating user login scenarios including positive and negative test cases. It includes page object model implementation, uses WebDriverManager for automatic driver management, and provides detailed test reporting.

## Prerequisites

- Java 8 or higher
- Maven 3.x
- Google Chrome browser

## Setup

1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd AutomationTestLogin/loginapp
   ```

2. Install dependencies:
   ```bash
   mvn clean install
   ```

## Running Tests

Execute the test suite using Maven:
```bash
mvn test
```

This will run all configured tests in `testng.xml`:
- **testSuccessfulLogin** (Smoke test): Validates successful login with valid credentials
- **testInvalidCredentials** (Regression test): Validates error handling for invalid credentials
- **testEmptyCredentials** (Regression test): Validates error handling for empty fields

## Test Groups

Tests are categorized into groups:
- **Smoke**: Critical functionality tests (`testSuccessfulLogin`)
- **Regression**: Comprehensive validation tests (`testInvalidCredentials`, `testEmptyCredentials`)

## Project Structure

```
loginapp/
├── src/
│   ├── main/
│   │   └── java/          # Main source (page objects)
│   │       └── com/qa/ta/pages/
│   │           ├── BasePage.java
│   │           └── LoginPage.java
│   └── test/
│       └── java/          # Test classes
│           └── com/qa/ta/
│               ├── BaseTest.java
│               └── LoginTest.java
├── pom.xml                # Maven configuration
├── testng.xml             # TestNG suite configuration
└── README.md              # This file
```

## Technologies Used

- **Selenium WebDriver**: Browser automation
- **TestNG**: Testing framework with XML configuration
- **WebDriverManager**: Automatic driver management
- **Allure/TestNG Reports**: Test reporting
- **Maven**: Build and dependency management
- **Page Object Model**: Test design pattern

## Test Data

The tests use the following scenarios:
- **Valid credentials**: Username: `qoyod_user`, Password: `Test@1234`
- **Invalid credentials**: Wrong username/password combinations
- **Empty credentials**: Blank username and password fields

## Test Results

Tests validate:
- Successful login displays welcome message with username
- Invalid credentials show appropriate error messages
- Empty fields display field-specific validation errors

## Configuration

- **Browser**: Chrome (headless mode can be enabled in BaseTest.java)
- **Test URL**: Local file `file:///C:/Users/tmoha/Downloads/AutomationTask_Qoyood/login.html` (update path as needed)
- **Test Suite**: Configured via `testng.xml` with method-level includes

## Reports

After test execution, view reports at:
- `target/surefire-reports/index.html` (TestNG HTML report)

## Contributing

1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Run tests: `mvn test`
5. Submit a pull request

## License

This project is for educational purposes.</content>
<parameter name="filePath">C:\Testing\CV\AutomationTestLogin\loginapp\README.md