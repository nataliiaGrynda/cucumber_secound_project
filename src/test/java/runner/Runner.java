package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)//without having anything in the project i can emidietly create a runner class
@CucumberOptions(
  features = "src\\test\\resources\\features",
  glue = "steps",//our package name is steps that's why we are using steps here
  tags = "@Smoke",
  dryRun = false,
  monochrome = false,
  plugin = {"html:target/cucumber-reports",
    "json:target/cucumber-reports/Cucumber.json",
    "pretty"
  })

public class Runner {
}
