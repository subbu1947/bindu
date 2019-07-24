package Bindu_runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber .class)
@CucumberOptions(features="MydemoDDC2",glue="DDC2mystepdefinations",tags= {"@Regression,@Smoke"},
plugin={"html:target/cucumber-htmlreport.html"})

public class Myrunner {

}
