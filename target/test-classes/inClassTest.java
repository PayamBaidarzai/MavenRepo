import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class inClassTest {
	
	@Test
	public void openHRM() throws IOException {
		
		Properties prop= new Properties();
		FileInputStream fis= new FileInputStream("ConfigurationFolder\\credentials.properties");
		prop.load(fis);
		String chrome = prop.getProperty("chrome");
		String chormePath = prop.getProperty("chromePath");
		String url = prop.getProperty("url");
		System.setProperty(chrome, chormePath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
	}
}