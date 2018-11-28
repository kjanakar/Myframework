package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        tags = {"~@suite", "@wip"},
        plugin = {"pretty:json"}
)
public class Runwip {




}
