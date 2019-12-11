package pages;

import BaseUtil.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseUtil {

    public LoginPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.CSS, using = "#user_email")
    public WebElement txtUserEmail;

    @FindBy(how = How.CSS, using = "#user_password")
    public WebElement txtUserPassword;

    @FindBy(how = How.CSS, using = ".submit")
    public WebElement loginBtn;

    /*
     * Logs in to the home page
     *
     * @Param userEmail
     * @Param userPassword
     */
    public void login(String userEmail, String userPassword){
        txtUserEmail.sendKeys(userEmail);
        txtUserPassword.sendKeys(userPassword);
        loginBtn.submit();
    }
}