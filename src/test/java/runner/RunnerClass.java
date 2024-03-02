package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\ravir\\eclipse-workspace\\NewCucumber\\src\\test\\java\\feature", 
glue="stepdefinition", dryRun=false,tags="@tag1", publish=true)


public class RunnerClass {

}
