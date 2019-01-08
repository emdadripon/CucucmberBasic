package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

    @FindBy(how = How.XPATH, using = "userName")
    public WebElement txtUserName;

    @FindBy(how = How.XPATH, using = "Password")
    public WebElement txtPassword;

    @FindBy(how = How.XPATH, using = "Login")
    public WebElement btnLogin;

    public void login(String userName, String password){
        
        txtUserName.sendKeys(userName);
        txtPassword.sendKeys(password);
    }

    public void clickOnButton(){
        btnLogin.click();
    }
}
