# Java Homework Maven
## Project Structure:
```
│
├── pom.xml
│
├── src/
│   │
│   ├── main/
│   │   └── java/
│   │       └── team/
│   │           └── bravo/
│   │               │
│   │               ├── ivanov/
│   │               │   ├── lesson11/
│   │               │   │   ├── Calculator.java
│   │               │   │   └── User.java
│   │               │   │
│   │               │   └── lesson12/
│   │               │       └── ...
│   │               │
│   │               ├── petrov/
│   │               │   ├── lesson11/
│   │               │   │   ├── Calculator.java
│   │               │   │   └── User.java
│   │               │   │
│   │               │   └── lesson12/
│   │               │       └── ...
│   │               │
│   │               └── sidorov/
│   │                   ├── lesson11/
│   │                   │   ├── Calculator.java
│   │                   │   └── User.java
│   │                   │
│   │                   └── lesson12/
│   │                       └── ...
│   │
│   └── test/
│       └── java/
│           └── team/
│               └── bravo/
│                   │
│                   ├── ivanov/
│                   │   ├── lesson11/
│                   │   │   ├── CalculatorTest.java
│                   │   │   ├── LoginTest.java
│                   │   │   └── HomePageTest.java
│                   │   │
│                   │   └── lesson12/
│                   │       └── ...
│                   │
│                   ├── petrov/
│                   │   ├── lesson11/
│                   │   │   ├── CalculatorTest.java
│                   │   │   ├── LoginTest.java
│                   │   │   └── HomePageTest.java
│                   │   │
│                   │   └── lesson12/
│                   │       └── ...
│                   │
│                   └── sidorov/
│                       ├── lesson11/
│                       │   ├── CalculatorTest.java
│                       │   ├── LoginTest.java
│                       │   └── HomePageTest.java
│                       │
│                       └── lesson12/
│                           └── ...
│
└── target/
```

## Requirements

- JDK 25 (see `maven.compiler.release` in `pom.xml`)
- Maven
- Google Chrome for Selenium scenarios

## How to run

- Open the project in IntelliJ IDEA via `pom.xml`.
- Run all tests: `mvn test`. This runs every test class under `src/test`, including other participants' tests.
- Run a `main` method from IntelliJ IDEA, for example `team.bravo.proz.HW11.Main`. `mvn test` does not run `main` methods.
