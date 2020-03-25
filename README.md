# junit-selenium-parallel-starter
A starter project to run parallel Selenium WebDriver tests in JUnit

## Maven profiles

There are a number of Maven profiles which can be used to control the execution settings:

1. `firefox` or `chrome` will dictate the browser to use. *Default is `chrome`*
2. `parallel` ensures parallel execution
3. `headless` will run in headless mode without a browser window being displayed 

### Examples

`mvn clean test` 

This will use the defaults and run `firefox`, `parallel`, `headless`

`mvn clean test -P chrome -P parallel`

This will execute the tests on Chrome in paralell execution

`mvn clean test -P chrome,headless,parallel`

This is also valid syntax

