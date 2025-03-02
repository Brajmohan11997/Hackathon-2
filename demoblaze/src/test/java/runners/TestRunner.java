package runners;
import io.cucumber.junit.CucumberOptions;
@CucumberOptions(
    features = "src/test/features",
    glue = "stepDefinitions",
    plugin = {"pretty", "html:target/cucumber-reports"},
    monochrome = true
)
public class TestRunner {
}
