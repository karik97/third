package runner_class;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

        @CucumberOptions(
		features = {"C:\\Users\\Kartik\\Desktop\\Eclipse new\\mvn1\\src\\test\\java\\feature_file\\login.feature"},
		glue = {"step_defination"},
		monochrome = true,
		dryRun = false, 
		plugin = {"pretty","html:report\\cucumber_report.html"}
		)
public class runner_class extends AbstractTestNGCucumberTests{

}
