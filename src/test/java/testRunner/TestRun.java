package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
	features=".//Features/Login.feature",
    glue = "stepDefinitions",         //to specify the location of step definition file
    dryRun = false,                  //to check the mapping is proper between feature file and step definition file
    monochrome = true,               //display the console output in a proper readable format remove the unreadable characters from console
    tags= "@sanity",
    plugin = {"pretty", "html:test-output"} //to generate report in html format
)
public class TestRun {
}
