# Test Automation

This document describes the test automation framework, running the medium tests in an automated way.These tests can be executed locally or remotely.The tests themselves are written as Cucumber BDD tests and are executed with JUnit. This tests cover the acceptance, regression, and manual test scenarios.

## Technology

The testing framework has the following dependencies:

* Selenium
* Cucumber
* JUnit

## Setting up test environment

_Info : The following tools are required:_

* Java JDK 1.8 or later
* Eclipse(Luna) or later with m2e plugin
* Git

To set up the test environment:

1. In Git Bash, clone the repository into a local folder.

    ```
    $git clone ssh://git@stash:7999/solutions/solution_unison.git
    ```


1. Import the **akqa-auto-tests** project

    * In Eclipse, navigate to `File -> Import -> Maven -> Existing Maven Projects`.
    * Browse and set the **Root Directory** as the **akqa-auto-tests** (which is in the solution repository)
    * Click **Finish**

1. Set the Java build path.This is used while compiling a Java project to discover dependent classes.

    * Right-click on the project `-> Build Path -> Configure Build Path`
    * Select **Maven Dependencies** and click **OK** button

1. Remove files generated at build-time in a project's directory.
    * Right-click on the Project and select  **Run As Maven Clean**.
      _Note: If there no errors, then you should get 'BUILD SUCCESS' message._

1. To add artifact(s) to the local repository
    * Right-click on the Project and click **Run As Maven Install** then refresh the project in Eclipse
    _Note: If there no errors, then you should get 'BUILD SUCCESS' message._

