package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.swing.plaf.PanelUI;

public class signUpPage extends base {
    public signUpPage(WebDriver driver) {
        super(driver);
    }

    final private By name = By.xpath("//input[@data-qa=\"signup-name\"]");
    final private By email = By.xpath("//input[@data-qa=\"signup-email\"]");
    final private By sinupbutton = By.xpath("//button[@data-qa=\"signup-button\"]");
    final private By gender = By.xpath("//input[@id=\"id_gender2\"]");
    final private By password = By.xpath("//input[@type=\"password\"]");
    final private By Firstname = By.xpath("//input[@id=\"first_name\"]");
    final private By Lastname = By.xpath("//input[@id=\"last_name\"]");
    final private By days= By.xpath("//select[@id='days']");
    final private By monnths = By.xpath("//select[@id='months']");
    final private By years = By.xpath("//select[@id='years']");
    final private By company = By.xpath("//input[@id=\"company\"]");
    final private By address = By.xpath("//input[@name=\"address1\"]");
    final private By state = By.xpath("//input[@data-qa=\"state\"]");
    final private By city = By.xpath("//input[@name=\"city\"]");
    final private By zip = By.xpath("//input[@name=\"zipcode\"]");
    final private By mobile = By.xpath("//input[@name=\"mobile_number\"]");
    final private By creatAccountButton = By.xpath("//button[@data-qa=\"create-account\"]");
    final private By newusersignup = By.xpath("//div[@class=\"signup-form\"]//h2");
    final private By ENTER_ACCOUNT_INFORMATION_ = By.xpath("//h2[@class=\"title text-center\"][1]//b");
    final private By account_is_created_sucessfull_ = By.xpath("//h2[@class=\"title text-center\"]//b");
    final private By continuee = By.xpath("//a[@data-qa='continue-button']");
    final private By loged_in_as_username = By.xpath("//ul[@class=\"nav navbar-nav\"]//li[10]");
    final private By account_deleted_t = By.xpath("//h2[@class=\"title text-center\"]//b");
    final private By signUpExist = By.xpath("//p[@style=\"color: red;\"]");


    public void signupNameAndEmail(String NAME, String EMAIL) {
        setText(name, NAME);
        setText(email, EMAIL);
    }

    public void clickSignUpButton() {
        click(sinupbutton);
    }

    public void EnterSignUpInfo(String PASS, String firstname, String lastname, String companyy, String add, String STATE, String CITY, String ZIP, String MOBILE) {
        click(gender);
        setText(password, PASS);
        setText(Firstname, firstname);
        setText(Lastname, lastname);
        setText(company, companyy);
        setText(address, add);
        setText(state, STATE);
        setText(city, CITY);
        setText(zip, ZIP);
        setText(mobile, MOBILE);

    }

    public void clickCreatAccountButton() {
        click(creatAccountButton);
    }


    public String new_user_signup_text() {
        String TEXT=getText(newusersignup);
        return TEXT;

    }
  public String ENTER_ACCOUNT_INFORMATION_text() {
        String TEXT=getText(ENTER_ACCOUNT_INFORMATION_);
        return TEXT;

    }
public String account_is_created_sucessfull_text() {
        String TEXT=getText(account_is_created_sucessfull_);
        return TEXT;

    }
    public String loged_in_as_username_text() {
        String TEXT=getText(loged_in_as_username);
        return TEXT;

    }
    public String account_deleted_text() {
        String TEXT=getText(account_deleted_t);
        return TEXT;

    }
    public String signUpExist() {
        String TEXT=getText(signUpExist);
        return TEXT;

    }

    public void   CLICKONcontinueButton(){
        click(continuee);
    }
    public void selectDOB(){
        Faker fake =new Faker();
        isSelect(days,fake.number().numberBetween(1,getSize(days)));
        isSelect(monnths,fake.number().numberBetween(1,getSize(monnths)));
        isSelect(years,fake.number().numberBetween(1,getSize(years)));
    }

}
