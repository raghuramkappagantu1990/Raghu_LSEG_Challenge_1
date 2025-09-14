# LSEG Challenge 1 – String Checker 🔍🤖

![Build](https://github.com/<your-username>/<repo-name>/actions/workflows/maven.yml/badge.svg)  
![Java](https://img.shields.io/badge/Java-17-blue)  
![TestNG](https://img.shields.io/badge/TestNG-7.10-orange)  
![AI/ML](https://img.shields.io/badge/AI-LogisticRegression-green)  
![Code Quality](https://img.shields.io/badge/Static%20Analysis-Checkstyle%20%7C%20PMD%20%7C%20SpotBugs-yellowgreen)

---

## 📌 Overview

This repository contains my submission for **Challenge #1 from LSEG**.

**Problem Statement:**  
Write a program that checks if the last 3 characters of a given string contain a number.

- Example Input: `Test8RE`
- Example Output: ✅ True (last 3 chars `8RE` contain a number)

---

## 📂 Project Structure

```
challenge_1/
 ├── src/
 │   ├── main/java/com/lseg/LastThreeDigitChecker.java
 │   ├── main/java/com/lseg/AIDigitDetectorML.java
 │   ├── test/java/com/lseg/LastThreeDigitCheckerTest.java
 │   └── test/java/com/lseg/AIDigitDetectorMLTest.java
 ├── pom.xml
 ├── testng.xml
 ├── .gitignore
 ├── README.md
 └── .github/workflows/maven.yml
```

---

## ▶️ Running the Project

### Compile

```bash
mvn clean compile
```

### Run All Tests

```bash
mvn clean test
```

### Run with TestNG Suite

```bash
mvn clean test -DsuiteXmlFile=testng.xml
```

### Run AI/ML Tests Only

```bash
mvn test -Dgroups=ai-ml
```

---

## ✅ Classic Example Outputs

```text
Test8RE     -> true
HelloWorld  -> false
12345       -> true
```

---

## 🤖 AI/ML Test Coverage

In addition to standard TestNG tests, an **AI/ML validation layer** is included:

- ✅ Ensures ML classifier gives **high probability** for digit-heavy strings.
- ✅ Ensures **low probability** for digit-absent strings.
- ✅ Validates **edge cases** (null, empty strings).
- ✅ Automated code review setup, inspired by AI-assisted linting practices.
- ✅ Runs automatically in **GitHub Actions CI pipeline**.

Example confidence scores:

- `12345` → 0.99 (very high confidence of digit presence)
- `Test8RE` → 0.33 (moderate confidence)
- `HelloWorld` → 0.10 (low confidence)

---

## 📊 Test Reports

This project automatically generates **TestNG HTML reports** on every run.  
Reports are available for download under the [GitHub Actions Artifacts](../../actions).

Reports include:

- `index.html` → Detailed per-method results
- `emailable-report.html` → Summary view

---

## 🔍 Code Quality

This project integrates **industry-standard static analysis tools**:

- **Checkstyle** → Enforces Google Java Style Guide
- **SpotBugs** → Identifies common bug patterns
- **PMD** → Detects maintainability/code smells

Reports are generated in:

```
target/site/
```

and uploaded to GitHub Actions as artifacts.

---

## 🚀 CI/CD Pipeline

Each push/PR triggers **GitHub Actions**:

1. Build with Maven
2. Run static analysis (Checkstyle, SpotBugs, PMD)
3. Execute TestNG suite (classic + AI/ML)
4. Upload Test & Analysis Reports

---

## 👤 Author

**Raghu Ram**

- 💼 SDET | Automation Engineer
- 🌐 [LinkedIn](https://www.linkedin.com/) _(add your real link)_
- 📧 raghuram@example.com
