package pages;

import BaseUtil.BaseUtil;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseUtil {

    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.CSS, using = "#logo")
    public WebElement EmployeeLogo;

    @FindBy(how = How.CSS, using = "a[href*='employees']")
    public WebElement txtEmployeeTab;

    @FindBy(how = How.CSS, using = "a[href*='users']")
    public WebElement txtUsersTab;

    @FindBy(how = How.CSS, using = "a[href*='my account']")
    public WebElement txtMyAccountTab;

    @FindBy(how = How.CSS, using = "a[href*='employees/new']")
    public WebElement createEmployeeLink;

    @FindBy(how = How.CSS, using = "#user_information")
    public WebElement EmployeeInfo;

    @FindBy(how = How.CSS, using = "h1")
    public WebElement txtListingEmployee;

    public boolean verifyUserLoggedIn(){
    return EmployeeLogo.isDisplayed() && EmployeeInfo.isDisplayed();
    }

    public void scrollToCreateEmployeeLink(){
        JavascriptExecutor je= (JavascriptExecutor)driver;
        je.executeScript("arguments[0].scrollIntoView(true);",createEmployeeLink);
        createEmployeeLink.click();
    }
}
