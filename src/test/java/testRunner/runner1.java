package testRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
features="src\\test\\resources\\features\\demo.feature",
glue= {"stepDefinations"},
monochrome=true,
plugin= {"pretty","html:reports/test-output","junit:report/junitreports.xml"},
tags= "@Smoke"
//tags="@All"
)
public class runner1 {
}