package pages;

import BaseUtil.BaseUtil;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseUtil {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.CSS, using = "i.icon.icon-plus")
    public WebElement LnkAddUser;

    @FindBy(how = How.CSS, using = ".smart-table-edit-data-cell:nth-child(1) .ng-pristine")
    public WebElement userFirstName;

    @FindBy(how = How.CSS, using = ".smart-table-edit-data-cell:nth-child(2) .ng-pristine")
    public WebElement userLastName;

    @FindBy(how = How.CSS, using = ".smart-table-edit-data-cell:nth-child(3) .ng-pristine")
    public WebElement userName;

    @FindBy(how = How.CSS, using = ".smart-table-edit-data-cell:nth-child(6) .ng-pristine")
    public WebElement role;

    @FindBy(how = How.CSS, using = ".smart-table-edit-data-cell:nth-child(8) .ng-pristine")
    public WebElement cellPhone;

    @FindBy(how = How.CSS, using = ".btn-success")
    public WebElement saveBtn;

    @FindBy(how = How.CSS, using = ".btn-primary")
    public WebElement okBtn;

    public void addNewUser() {
        waitForElementToBePresent(LnkAddUser);
        LnkAddUser.click();
    }

    /*
     * Waits for the create button to be present,  fills the user personal info and then it registers it.
     */
    public void createEmployee(String firstName, String lastName, String userName, String userRole, String cellPhone) {
        waitForElementToBePresent(userFirstName);
        userFirstName.sendKeys(firstName);
        userLastName.sendKeys(lastName);
        this.userName.sendKeys(userName);
        role.sendKeys(userRole);
        this.cellPhone.sendKeys(cellPhone);
        saveBtn.click();
    }

    /*
     *  Searches for an element that matches with  the first name and user name.
     */
    public boolean verifyUserCreated(String firstName, String userName) {
        try {
            driver.findElement(By.xpath("//TD[@ng-repeat='column in columns'][text()=" + "'" + firstName + "'" + "]/following-sibling::TD[@ng-repeat='column in columns'][text()=" + "'" + userName + "']"));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void removeUser(String userName) {
        driver.findElement(By.xpath("//TD[@class='smart-table-data-cell'][text()='" + userName + "']/..//I[@class='icon icon-remove']")).click();
        waitForElementToBePresent(okBtn);
        okBtn.click();
    }
}