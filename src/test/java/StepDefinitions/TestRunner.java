package StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features", glue={"StepDefinitions"},
monochrome = true,
 plugin={"pretty","junit:target/jUnitReports/reportXMLType.xml",
 "json:target/jsonReports/reportJSONType.json",
 "html:target/htmlReports/reportHTMLType.html"
 }
)
public class TestRunner {


}
