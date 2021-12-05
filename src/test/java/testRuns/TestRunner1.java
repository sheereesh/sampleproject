package testRuns;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)


@CucumberOptions(
		features = "src/test/resources/features/sprint1/feature1.feature",
		glue = {"stepdefinition","setHooks"},
		monochrome =false,
		dryRun = false
		
		
		
		)

public class TestRunner1 {

}
