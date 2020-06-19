package br.com.maximilianodacruz.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        dryRun = false,
        features = "src/test/java/br/com/maximilianodacruz/features",
        glue = "br/com/maximilianodacruz/steps",
        tags = "@search",
        plugin = { "pretty", "html:target/cucumber-reports.html" },
        monochrome = true
)
public class RunnerTest {
}
