package Runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "html:target/cucumber-reports/cucumber.html"},
        features = "src/test/resources/Features",
        glue = "stepdefinitions",
        tags = "@TC1602" ,
        dryRun = false


)
public class IGRunner {
}
