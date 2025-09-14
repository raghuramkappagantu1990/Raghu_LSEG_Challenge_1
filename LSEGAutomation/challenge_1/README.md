📌 Overview

This repository contains my submission for Challenge #1 from LSEG.

Problem Statement:
Write a program that checks if the last 3 characters of a given string contain a number.

Example Input: Test8RE

Example Output: ✅ True (last 3 chars 8RE contain a number)

Project Overview:

challenge_1/
├── src/
│ ├── main/java/com/lseg/LastThreeDigitChecker.java
│ └── main/java/com/lseg/AIDigitDetectorML.java
│ ├── test/java/com/lseg/LastThreeDigitCheckerTest.java
│ └── test/java/com/lseg/AIDigitDetectorMLTest.java
├── pom.xml
├── testng.xml
├── .gitignore
├── README.md
└── .github/workflows/maven.yml

Running the project
compile - mvn clean compile
Run Tests - mvn clean test

## AI-ML Test Coverage

In addition to standard TestNG tests, we included **AI-ML validation tests**:

- Ensures ML classifier gives **high probability** for digit-heavy strings.
- Ensures **low probability** for digit-absent strings.
- Validates **edge cases** (null, empty strings).
- Automated code review setup, inspired by AI-assisted linting practices.
- All tests run automatically in GitHub Actions pipeline.

## Test Reports

This project automatically generates **TestNG HTML reports** on every run.  
You can download them from the [GitHub Actions Artifacts](../../actions) after each build.

Reports include:

- `index.html` (detailed results per test method)
- `emailable-report.html` (summary view)

## 🔍 Code Quality

This project uses industry-standard static analysis tools:

- **Checkstyle** (Google Java Style Guide)
- **SpotBugs** (bug pattern detection)
- **PMD** (code quality and maintainability)
