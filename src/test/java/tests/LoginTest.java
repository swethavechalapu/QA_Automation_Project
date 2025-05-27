package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import io.qameta.allure.Description;

public class LoginTest extends BaseTest {


    @Test
    public void loginTest() throws InterruptedException {
        driver.get("https://citiustech.pfuat.xyz");
        Thread.sleep(1000);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("qa_admin_dec_16_2024@citiustech.com");
        loginPage.enterPassword("Citiustech@123");
        loginPage.clickLogin();
        HomePage homepage = new HomePage(driver);
        String profileName = homepage.getProfileName();
        Assert.assertEquals(profileName, "qa_admin_dec_16_2024 T");
        Thread.sleep(1000);
    }
    @Test
    public void validateQuickActionHeadingHomePage() throws InterruptedException {
        driver.get("https://citiustech.pfuat.xyz");
        Thread.sleep(3000);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("qa_admin_dec_16_2024@citiustech.com");
        loginPage.enterPassword("Citiustech@123");
        loginPage.clickLogin();
        HomePage homePage = new HomePage(driver);
        String profileName = homePage.getProfileName();
        Assert.assertEquals(profileName, "qa_admin_dec_16_2024 T");
        boolean isQuickActionPresent = homePage.isQuickActionPresent();
        Assert.assertEquals(isQuickActionPresent, true);

    }


}
