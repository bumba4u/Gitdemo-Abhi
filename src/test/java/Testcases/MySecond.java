package Testcases;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.eclipse.jetty.websocket.api.InvalidWebSocketException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumDriverService;

public class MySecond {
	
	static WiniumDriver driver=null;
	static WiniumDriverService service = null;
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.out.println("this is in Demo for GIT");
		System.out.println(" this is in My Second");
		System.out.println(" this is in My Second GIT on 11/6");
		//Calculator
		DesktopOptions option=new DesktopOptions();
		option.setApplicationPath("C:\\WINDOWS\\system32\\calc.exe");
		File driverPath = new File("C:\\Users\\Abhijit\\Desktop\\Selenium\\Winium\\Winium.Desktop.Driver.exe");// set Winium Driver path
		service= new WiniumDriverService.Builder().usingDriverExecutable(driverPath).usingPort(9999).withVerbose(true)
        .withSilent(false).buildDesktopService();
		service.start(); // start a service
		driver = new WiniumDriver(service, option); // start a Wenium Driver
		
		//WiniumDriver driver=new WiniumDriver(new URL("http://localhost:9999"),option);
		// we can use the above line when not using line # 26 - 30
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(scrFile, new File("C:\\Users\\Abhijit\\Desktop\\Selenium\\xyz1.jpg"));
		Thread.sleep(3000);
		driver.findElement(By.name("7")).click();
		click("9");
		Thread.sleep(1000);
		driver.findElement(By.id("137")).click();
		Thread.sleep(1000);
		 scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(scrFile, new File("C:\\Users\\Abhijit\\Desktop\\Selenium\\xyz2.jpg"));
		driver.findElement(By.name("7")).click();
		click("6");
		driver.findElement(By.name("Add")).click();
		driver.findElement(By.name("4")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("3")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("2")).click();
		driver.findElement(By.name("Equals")).click();
		//driver.findElement(By.id("121")).click();
		Thread.sleep(3000);
		String a= driver.findElement(By.id("150")).getAttribute("Name");
		System.out.println("result" + a);
		driver.close();
		
		
		//notepad
		option.setApplicationPath("C:\\WINDOWS\\system32\\notepad.exe");
		 driver=new WiniumDriver(new URL("http://localhost:9999"),option);
		 Thread.sleep(5000);
		 driver.findElementByClassName("Edit").sendKeys("This is sample test");
		 driver.findElement(By.name("File")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.name("Save")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.name("File name:")).sendKeys("C:\\Users\\Abhijit\\Desktop\\Selenium\\Winium\\first.txt");
		 Thread.sleep(2000);
		// driver.findElement(By.id("1")).click();
		 driver.findElement(By.name("Save")).click();
		 Thread.sleep(2000);
		 driver.close();
		
		// service.stop();
	}
	
	private static void click(String elementName) throws InterruptedException
	{
		WebElement element=null;
		for(int i=0; i<10;i++)
		{
			try
			{
			element= driver.findElement(By.name(elementName));
			break;
		}
		catch(Exception e)
		{
			Thread.sleep(1000);
		}
	}
		
		for(int i=0; i<10;i++)
		{
			Exception ex=null;
			try
			{
				if(element.isEnabled()==true)
				{
					element.click();
					break;
				}
			
		}
		catch(Exception e)
		{
			Thread.sleep(1000);
			ex=e;
		}	
	}	
  }
}
