package pages;

import BaseUtil.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class CreateEmployeePage extends BaseUtil {

    public CreateEmployeePage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.CSS, using = "#employee_first_name")
    public WebElement employeeFirstName;

    @FindBy(how = How.CSS, using = "#employee_last_name")
    public WebElement employeeLastName;

    @FindBy(how = How.CSS, using = "#employee_email")
    public WebElement employeeEmail;

    @FindBy(how = How.CSS, using = "#employee_identification")
    public WebElement employeeIdentification;

    @FindBy(how = How.CSS, using = "#employee_leader_name")
    public WebElement employeeLeadersName;

    @FindBy(how = How.CSS, using = "#employee_start_working_on_1i")
    public WebElement employeeStartYear;

    @FindBy(how = How.CSS, using = "#employee_start_working_on_2i")
    public WebElement employeeStartMonth;

    @FindBy(how = How.CSS, using = "#employee_start_working_on_3i")
    public WebElement employeeStartDay;

    @FindBy(how = How.NAME, using = "commit")
    public WebElement createBtn;

    @FindBy(how = How.CSS, using = "#notice")
    public WebElement successfullyCreatedTxt;

    @FindBy(how = How.CSS, using = "a[href*='/employees']")
    public WebElement backLink;

    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/table/tbody")
    public WebElement tableBody;



    public void createEmployee(String firstName, String lastName, String email, String employeeId, String employeeLeaderName){
        waitForElementToBePresent(createBtn);
        employeeFirstName.sendKeys(firstName);
        employeeLastName.sendKeys(lastName);
        employeeEmail.sendKeys(email);
        employeeIdentification.sendKeys(employeeId);
        employeeLeadersName.sendKeys(employeeLeaderName);
        employeeStartYear.sendKeys("2014");
        employeeStartMonth.sendKeys("January");
        employeeStartDay.sendKeys("21");
        createBtn.click();
        System.out.println("created user");

    }

    public void goToEmployeeList(){
        waitForElementToBePresent(successfullyCreatedTxt);
        if(successfullyCreatedTxt.isDisplayed()&&  backLink.isDisplayed()){
            backLink.click();
        }
        HomePage homePage = new HomePage();
        waitForElementToBePresent(homePage.EmployeeLogo);
        System.out.println("im in list");
    }

    public void verifyEmployeeInfoInTable(){
        WebElement baseTable = driver.findElement(By.xpath("//*[@id='content']/table/tbody"));
        List<WebElement> tableRows = baseTable.findElements(By.tagName("tr"));
        System.out.println(tableRows);
    }
}
