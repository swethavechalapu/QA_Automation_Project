package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;
    By profileNameElement = By.xpath("//div[contains(@class,'profile-name')]");
    By quickActionHeading = By.xpath("//div[text()='Quick Actions']");
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }


    public String getProfileName() {
        String profileName = driver.findElement(profileNameElement).getText();
        System.out.println("Profile Name : " +profileName);
        return profileName;

    }
    public boolean isQuickActionPresent(){
      boolean quickActionIsDisplayed =  driver.findElement(quickActionHeading).isDisplayed();
        System.out.println("Quick Action Heading Is :" +quickActionIsDisplayed);
      return quickActionIsDisplayed;
    }
}
