package bdd.web.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features", glue={"bdd/web/glue"},
stepNotifications = true,
        monochrome = true,
        tags="@duckDuckGoSearch",
 plugin={"pretty","junit:target/jUnitReports/reportXMLType.xml",
 "json:target/jsonReports/reportJSONType.json",
 "html:target/htmlReports/reportHTMLType.html"
 }
)
public class TestRunner {


}
