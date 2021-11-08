package runnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		
		
		features="./src/test/resources/featureFiles/amazon.feature",   //To set the path of feature files
		
		glue="stepdef",        //To set the path of step definition Package name
		
		plugin= {"pretty", "html:target/html_reports.html", "json:target/jsonrepo.json", "junit:target/xmlrepo.xml"},  //To generate different kind of reports
		
		
		dryRun=false,   //To compare feature step with stepdefenition class. 
		
		monochrome = true //To avoid unwanted symbols
		
//		tags="@AMAZON"  //To execute particular feature file
		)

		
		
		
		
		
		
		
		










public class testrunnerclass {

}
