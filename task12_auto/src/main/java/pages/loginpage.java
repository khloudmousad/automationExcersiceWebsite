package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpage extends base {

    public loginpage(WebDriver driver){
        super(driver);
    }
   final private By loginbutton  =By.xpath("//button[@data-qa='login-button']");

    final private By emaillocator  =By.xpath("//input[@data-qa='login-email']");
    final private By passLocator  =By.xpath("//input[@data-qa='login-password']");
    final private By newlogIn  =By.xpath("//div[@class=\"login-form\"]//h2");
    final private By loged_in_as_username  =By.xpath("//ul[@class=\"nav navbar-nav\"]//li[10]");
    final private By loged_in_withinvalid_data_t  =By.xpath("//form[@action=\"/login\"]//p[@style=\"color: red;\"]");
    final private By log_out  =By.xpath("//a[@href='/logout']");




    public void log_in(String email,String pass)
    {
        setText(emaillocator,email);
        setText(passLocator,pass);
        click(loginbutton);

    }
    public String log_in_text(){
        String text =getText(newlogIn);
        return text;
    }
public String loged_in_as_username(){
        String text =getText(loged_in_as_username);
        return text;
    }
public String loged_in_withinvalid_data_text(){
        String text =getText(loged_in_withinvalid_data_t);
        return text;
    }
    public void log_out(){
        click(log_out);
    }

}
