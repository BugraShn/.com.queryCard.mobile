package Runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"
                ,"html:target/cucumber-reports/cucumber.html"},
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@TC_1802" ,
        dryRun = false


)
public class GCARunner {
}
