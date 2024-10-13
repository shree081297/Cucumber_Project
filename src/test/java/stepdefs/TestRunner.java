package stepdefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,
				 plugin = { "pretty", "html:target/html-cucumber","json:target/cucumber.json" },
				 features = "src/test/java/Features", 
				 glue = "stepdefs",
		// tags= {"not @Ignore"}--to ignore the tag
		// tags={"@smoke"}//--to run only one tag name testcase
		// tags={"@calculator"}--to run on class level
		// tags= {"@Simplilearn and not @Ignore"}--run every testcase in feature file
		// except ignored one
		         tags = { "@regression" }// --run only regression test case
// tags= {"@Simplilearn"}

)

public class TestRunner {

}
