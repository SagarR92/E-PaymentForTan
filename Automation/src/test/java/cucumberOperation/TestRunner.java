package cucumberOperation;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
   //path of feature file
   features = "src/test/java/features",
   //path of step definition file
   glue = "StepDefinations")

public class TestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
