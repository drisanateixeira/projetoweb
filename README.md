

 

## 🔖&nbsp; About


Web test automation project, using Allure Report

---

## 🚀 Technologies

The project was developed using the following technologies

- [Junit](https://junit.org/)
- [Selenium](https://www.selenium.dev/documentation/webdriver/)
- [Cucumber](https://cucumber.io/)
- [Java](https://www.java.com/pt-BR/)
- [Allure Report](https://docs.qameta.io/allure-report/gettingstarted/quickstart)

---

## 🗂 Clone project

```bash

    # clone
    $ git clone https://github.com/drisanateixeira/projetoweb.git

    # install Allure in machine
    $ scoop install allure

    # install dependencies
    $ mvn clean -U install
 
```

---

## 🗂  Run project

path: src/test/java/runners/Runner.java

```bash

    # execute
    $  mvn clean test -Dtest=runners.Runner
    
    # After running the tests generate the report.
	 $ allure serve
```

---

Developer 💜  Adara Drisana Teixeira dos Santos
