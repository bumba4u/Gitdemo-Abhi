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

public class Mythird {
	
	static WiniumDriver driver=null;
	static WiniumDriverService service = null;
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.out.println(" this is to test GIT");
		System.out.println(" this is in My third");
		//Calculator
		
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
