package pages;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    By usernameField = By.xpath("//input[@type='email']");
    By passwordField = By.xpath("//input[@type='password']");
    By loginButton   = By.xpath("//button[normalize-space()='Sign In']");

    public LoginPage(WebDriver driver) {

        this.driver = driver;
    }



    @Step("Entering username: {username}")
    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
        System.out.println("Username Entered successfully : " + username);
    }

    @Step("Entering password")
    public void enterPassword(String password) {

        driver.findElement(passwordField).sendKeys(password);
        System.out.println("Password Entered successfully : " + password);
    }

    @Step("Clicking on login button")
    public void clickLogin() {
        driver.findElement(loginButton).click();
        System.out.println("Login button clicked successfully : ");
    }
}
