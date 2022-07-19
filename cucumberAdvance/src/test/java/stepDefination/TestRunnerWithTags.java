package stepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature/tagsInBDD.feature",
glue= {"stepDefination"},
monochrome=true,
plugin= {"pretty","html:reports/htmlReport/html",
"json:reports/JsonReport/Cucumber.json",
"junit:reports/junitReport/report.xml"},
tags="~@Smoke or @Regression"
)

public class TestRunnerWithTags {

}
