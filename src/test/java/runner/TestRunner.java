package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

//Junit
@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/Features"}, glue="Steps")
public class TestRunner {


}
