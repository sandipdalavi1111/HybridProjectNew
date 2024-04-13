package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	public static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
    driver=new ChromeDriver(co);
    driver.get("https://www.google.com/");
    driver.manage().window().maximize();
	}

}
