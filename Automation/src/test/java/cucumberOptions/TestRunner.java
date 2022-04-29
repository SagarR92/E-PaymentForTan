package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/Login.feature"
		,glue={"com.pb.stepDefination.stepdefinations"}
		)

//@RunWith(Cucumber.class)@CucumberOptions(plugin = {
//	    "pretty", "json:target/Open-Google-WebSite.json"},
//	   features = {"src/test/java/features/Login.feature"},
//	   glue = {"com.java.StepDefination"})

public class TestRunner {

}
