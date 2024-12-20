package com.incubyte.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginUtility {
	static WebDriver driver;

	public static void initializeDriver(String browser) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Sita_Important\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		System.out.println("Initiated " + driver.getClass() + "...");
	}

	public static void clickOnRegisterLink() throws Exception {
		try {
			String baseUrl = "https://magento.softwaretestingboard.com/";
			driver.manage().window().maximize();
			driver.get(baseUrl);	
			driver.findElement(By.linkText("Create an Account")).click();
		}
		catch(Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}

	public static void clickOnSignInLink() throws Exception {
		try {
			String baseUrl = "https://magento.softwaretestingboard.com/";
			driver.manage().window().maximize();
			driver.get(baseUrl);	
			driver.findElement(By.linkText("Sign In")).click();
		}
		catch(Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}

	public static void waitMethod() {
		for(int i=0; i<1000; i++) {
			i++;
		}
	}

	public static void provideRegistrationDetails() throws Exception {
		driver.findElement(By.id("firstname")).sendKeys("Sita");
		driver.findElement(By.id("lastname")).sendKeys("Mahalaxmi");
		driver.findElement(By.id("email_address")).sendKeys("sita.devata@gmail.com");
		driver.findElement(By.id("password")).sendKeys("SitaS!taS1ta");
		driver.findElement(By.id("password-confirmation")).sendKeys("SitaS!taS1ta");
		driver.findElement(By.xpath("//button[@type='submit' and span='Create an Account']")).click();
		boolean errorScenario = driver.findElement(By.xpath("//div[contains(@class, 'message-error error message')]")).isDisplayed();
		if(errorScenario) {
			driver.navigate().to("https://magento.softwaretestingboard.com/customer/account/login/referer/");
		} else {
			driver.quit();
		}
	}

	public static void provideDetailsAndSignIn() throws Exception {
		driver.findElement(By.id("email")).sendKeys("sita.devata@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("SitaS!taS1ta");
		driver.findElement(By.id("send2")).click();
	}

	public static void signOut() {
		driver.findElement(By.xpath("//button[@type='button' and span='Change']")).click();
		driver.findElement(By.xpath("//li[contains(@class, 'authorization-link')]")).click();
	}
}