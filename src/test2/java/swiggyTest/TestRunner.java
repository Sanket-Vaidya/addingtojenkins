package swiggyTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="Feature",
			glue="swiggyTest",
					plugin= {"progress","html:target2/Cucumber.html"}
			//dryRun=true
			)
	
	public class TestRunner extends AbstractTestNGCucumberTests{
		
	}
	


