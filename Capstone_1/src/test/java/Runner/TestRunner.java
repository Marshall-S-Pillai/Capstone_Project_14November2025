package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(                     
    features = "src/test/resources/Feature",
    glue = {"stepdefinitions"},
    tags = "@set63", 
    
    plugin = {"pretty", "html:target/cucumber-reports.html"
    }    
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
