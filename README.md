# Capstone Project - E-Commerce Automation Testing (Selenium + Cucumber + TestNG)

**Application Under Test:** https://demo.nopcommerce.com/

This is a ready-to-import **Maven** project for **Eclipse**. Clone or download the source and run.

---

## Tools & Technologies Involved

| Tool / Technology          | Purpose                                      | Version / Notes                  |
|---------------------------|----------------------------------------------|----------------------------------|
| **Java**                  | Programming language                         | JDK 17 (recommended)            |
| **Eclipse IDE**           | IDE for development & execution              | Eclipse IDE for Enterprise Java  |
| **Maven**                 | Build & dependency management                | Built-in via Eclipse m2e         |
| **Selenium WebDriver**    | Browser automation                           | 4.36.0                           |
| **Cucumber**              | BDD (Feature files + Step definitions)       | 7.14.0                           |
| **TestNG**                | Test runner & assertions                     | 7.10.2                           |
| **ChromeDriver / EdgeDriver** | Browser drivers                         | Download matching version        |
| **ExtentReports**         | HTML reporting                               | 5.1.1                            |
| **Log4j**                 | Logging                                      | 1.2.17 + Log4j2                  |
| **Apache POI**            | Excel support (if used)                      | 5.x                              |
| **Page Object Model**     | Design pattern used in `pages` package       | -                                |

---

## Project Structure

```
Capstone_1/
├── pom.xml                          # Maven dependencies
├── README.md
├── Screenshot/                      # Runtime screenshots (created on run)
├── src/
│   ├── main/java/...
│   └── test/
│       ├── java/
│       │   ├── Runner/TestRunner.java
│       │   ├── hooks/               # Cucumber hooks + ExtentReport
│       │   ├── pages/               # Page Object classes
│       │   ├── stepdefinitions/     # Glue code for features
│       │   └── utilities/           # Base class, config reader
│       └── resources/
│           ├── config.properties    # URL & configs
│           ├── Feature/             # .feature files (BDD scenarios)
│           └── log4j.properties
```

---

## How to Run in Eclipse (Step-by-Step)

### 1. Prerequisites
- Install **JDK 17** or higher and set `JAVA_HOME`.
- Install **Eclipse IDE** (Eclipse IDE for Enterprise Java and Web Developers recommended).
- Make sure **Maven** integration (m2e) is available (usually pre-installed).

### 2. Import the Project
1. Clone this repository or download the ZIP.
2. Open Eclipse → **File → Import → Existing Maven Projects**.
3. Browse to the `Capstone_1` folder → Select it → Finish.
4. Wait for Maven to download all dependencies (first time may take a few minutes).

### 3. Add Browser Drivers (Important)
Drivers are **not** committed to the repo (they are large binaries).
1. Download the matching ChromeDriver / EdgeDriver for your browser version:
   - Chrome: https://googlechromelabs.github.io/chrome-for-testing/
   - Edge: https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/
2. Place the driver executable in the project root (`Capstone_1/`).
3. The code currently looks for `chromedriver_v141.exe` and `edgedriver_v141.exe`.  
   Either rename your drivers to match, or update the paths in `utilities/base.java`.

### 4. Run the Tests
**Option A – Run specific tagged scenarios (recommended)**
1. Open `src/test/java/Runner/TestRunner.java`
2. Change the `tags` value if needed (current: `@set63` for full checkout flow)
3. Right-click `TestRunner.java` → **Run As → TestNG Test**

**Option B – Run from Feature files**
- Right-click any `.feature` file → Run As → Cucumber Feature (if Cucumber Eclipse plugin is installed)

### 5. View Reports
- Cucumber HTML report: `target/cucumber-reports.html`
- Extent / Spark reports (if generated): `target/SparkReport.html` or similar
- Screenshots are saved in the `Screenshot/` folder

---

## Available Feature Tags (from feature files)

- `@set2` / `@set3` – Login (valid / invalid)
- `@Set61` – Add to cart + verify totals
- `@set43` – Product selection
- `@Set75` – Product search
- `@set63` – Full checkout & order placement (currently set in TestRunner)

You can change the tag in `TestRunner.java` to run different scenarios.

---

## Notes / Tips

1. The demo site is **https://demo.nopcommerce.com/**.  
   Test data uses a pre-registered account (`iammarshallhere@gmail.com`).  
   If login fails, register a new account on the site and update the feature files / test data.

2. Some Windows-style paths (`\\`) are used in the code. On macOS/Linux you may need minor adjustments for screenshot paths and log4j config.

3. PostgreSQL dependency is present but not actively used in the current automation flow.

4. For headless or cross-browser execution, update the browser launch methods in `utilities/base.java`.

---

## Quick Start Checklist

- [ ] JDK 17+ installed
- [ ] Eclipse + Maven support ready
- [ ] Project imported as Maven project
- [ ] Drivers match your browser version
- [ ] Run `TestRunner.java` as TestNG Test
- [ ] Check `target/cucumber-reports.html` for results

**Happy Testing!**
