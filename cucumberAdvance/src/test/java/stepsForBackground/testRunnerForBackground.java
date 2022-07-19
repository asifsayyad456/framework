package stepsForBackground;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature/backGroundDemo.feature",glue= {"stepsForBackground"},
monochrome=true,
plugin= {"pretty","html:reports/htmlReport/html",
"json:reports/JsonReport/Cucumber.json",
"junit:reports/junitReport/report.xml"})

public class testRunnerForBackground {

}
