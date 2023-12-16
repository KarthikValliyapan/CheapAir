package com.aiite.runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\MavenProjectWorkspace\\CheapAirTicket\\src\\test\\java\\com\\aiite\\feature\\BookingProcess.feature", 
								glue = "com.aiite.stepdefinition", 
								dryRun = false,
								monochrome = true,
								plugin = {"pretty" , "html:target/cucmber_reports"},
								tags = "@bookingOneWayTrip"
								)
public class Runner
	{
		
	}
