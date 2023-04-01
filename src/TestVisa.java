import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestVisa extends SetUp{

@Test()
public void CheckVisaLogo () {
	
	WebElement divFourLogos =driver.findElement(By.xpath("//*[@id=\"__next\"]/footer/div[3]/div[3]/div[1]/div[2]/div/div[1]"));
	List <WebElement> div = divFourLogos.findElements(By.tagName("svg"));
	
	String ExpecteddataTestID= "Footer__VisaCardLogo";
	
	for(int j= 0; j<div.size(); j++) {
		String ActualID= div.get(j).getAttribute("data-testid");
		
		if(ActualID == ExpecteddataTestID) {
			myAssertion.assertEquals(ActualID, ExpecteddataTestID);
			myAssertion.assertAll();
   	 }
		
	}
  }
}
