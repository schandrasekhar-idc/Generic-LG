package testCases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import initialization.ExcelData;
import initialization.LaunchURL;
import initialization.PickBrowser;

@Test
public class ReportGeneration_DataDriven {

		// @SuppressWarnings("unlikely-arg-type")
	public static void genericLGFucntion() throws IOException, InterruptedException, FileNotFoundException

	{

		// ==========================================================================================================================================//
	
		// EXCEL FILE DECLARATION
		ExcelData exlData = new ExcelData();
		//rowCount is number of assessments user wants to run through excel sheet
		int rowCount =  exlData.excelRowCount();
		rowCount = rowCount-1;
		System.out.println("*****  row count  ** "+ exlData.excelRowCount());
		
		// LAUNCH BROWSER
		PickBrowser browser = new PickBrowser();
		browser.ChromeBrowserLaunch();
		WebDriver Project = new ChromeDriver();
		
		// LAUNCH URL
		LaunchURL urlObj = new LaunchURL();
		String url = urlObj.lauchURL(Project);
		
		// ASSESSMENT OBJECT
		Assessment asmt = new Assessment();
		
		//call assessment function for how many assessments user wants or assessment data present in excel sheet
		
		//for (int i = 1; i <= rowCount; i++) {
		//OR
			for (int i = 1; i <= 10; i++) {
		
			//	System.out.print("ITERATION  " + i);
			// RUN ASSESSMENTS WITH DATA FROM EXCEL SHEET AT GIVEN LOCATION
			asmt.RunAssessment(Project, url, exlData, i);
			System.out.println("TEST CASE " + i + "  is Done.");
		}
		System.out.println("*****  ASSESSMENTS ARE DONE  ******");
     Project.close();
	}
}
