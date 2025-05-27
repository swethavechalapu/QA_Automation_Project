package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class ProfileCompleteness extends BaseTest {


    @Test
    public void TextChecking() throws InterruptedException{
        driver.get("https://citiustech.pfuat.xyz");
        Thread.sleep(1000);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("qa_admin_dec_16_2024@citiustech.com");
        loginPage.enterPassword("Citiustech@123");
        loginPage.clickLogin();
        HomePage homePage = new HomePage(driver);
        String profileCompleteText = homePage.getProfileCompletenessText();
        Assert.assertEquals(profileCompleteText,"Profile Completeness");
        Thread.sleep(3000);

    }

}
