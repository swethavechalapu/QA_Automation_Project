package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import io.qameta.allure.Description;

public class LoginTest extends BaseTest {

    @Test(description="Verify login functionality")
    @Description("Test Description: Login to app with valid credentials.")
    public void loginTest() throws InterruptedException {
        driver.get("https://citiustech.pfuat.xyz/");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("qa_admin_dec_16_2024@citiustech.com");
        loginPage.enterPassword("Citiustech@123");
        loginPage.clickLogin();
        HomePage homePage = new HomePage(driver);
        String profileName = homePage.getProfileName();
        Assert.assertEquals(profileName, "qa_admin_dec_16_2024 T");
    }
}
