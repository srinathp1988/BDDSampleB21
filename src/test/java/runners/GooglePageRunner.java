package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src//test//resources//Features//GoogleSearch.feature",
		glue = {"stepDef"},
		dryRun=true,
		monochrome = true,
		plugin = {"pretty", "usage : target/reports/usageReport"}
		)

public class GooglePageRunner {

}
