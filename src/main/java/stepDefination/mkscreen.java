package stepDefination;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class mkscreen {
	 public static void mkscreen(StackTraceElement[] stacktrace, WebDriver driver) throws IOException {

			StackTraceElement e 			= stacktrace[1];
			String methodName 				= e.getMethodName();
			String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			
	// Localization and name of screen files
	
    File dest = new File("./Screens/ScreenShoot Method: "+methodName+" - Time: "+ timeStamp + " .png");

	        
	        
	        
	        
	        long start = System.nanoTime();
	        System.out.println("Time taken by Java7 Files Copy = "+(System.nanoTime()-start));     
		    Files.copy(scrFile.toPath(), dest.toPath());
		 
		    }
}
