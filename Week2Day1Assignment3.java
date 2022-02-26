package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week2Day1Assignment3 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		 WebElement elementUserName= driver.findElement(By.id("username"));
		 elementUserName.sendKeys("Demosalesmanager");
		 WebElement elementPassword= driver.findElement(By.id("password"));
		 elementPassword.sendKeys("crmsfa");
		 WebElement elementLogingButton= driver.findElement(By.className("decorativeSubmit"));
		 elementLogingButton.click();
		 WebElement elementCRMSFA= driver.findElement(By.linkText("CRM/SFA"));
		 elementCRMSFA.click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Create Lead")).click();
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("HCL");
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mirunalini");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Chakravarthy");
		 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Mirun");
		 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CS");
		 driver.findElement(By.id("createLeadForm_description")).sendKeys("xxxxx");
		 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("mirunalini2012@gmail.com");
		 WebElement elementDropDown=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		 Select dd=new Select(elementDropDown);
		 dd.selectByVisibleText("New York");
		 driver.findElement(By.className("smallSubmit")).click();
		 System.out.println("The Title is "+driver.getTitle());
		 driver.findElement(By.linkText("Duplicate Lead")).click();
		 WebElement elementCompanyClear = driver.findElement(By.id("createLeadForm_companyName"));
		 elementCompanyClear.clear(); 
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CTS");
		 WebElement elementFirstNameClear = driver.findElement(By.id("createLeadForm_firstName"));
		 elementFirstNameClear.clear();
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Miruna");
		 driver.findElement(By.className("smallSubmit")).click();
		 System.out.println("The Title is "+driver.getTitle());
		 
		 
		 
		 
		 

	}


}
