package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homepage extends base {
    public homepage(WebDriver driver) {
        super(driver);
    }

    final private By account_deleted = By.xpath("//a[@href=\"/delete_account\"]");
    final public By logoOFhOmePage = By.xpath("//*[@src=\"/static/images/home/logo.png\"]");
    final private By signupAndLoginbutton = By.xpath("//a[@href=\"/login\"]");
    final private By contactus = By.xpath("//a[@href=\"/contact_us\"]");
    final private By testcases = By.xpath("//a[@href=\"/test_cases\"]");
    final private By products_tesxt= By.xpath("//a[@href='/products']");
    final private By subscribtion = By.xpath("//div[@class=\"single-widget\"]/h2");
    final private By subscribtionEmail=By.xpath("//input[@id=\"susbscribe_email\"]");
    final private By subscribtionbutton=By.xpath("//button[@id=\"subscribe\"]");
    final private By subscribtionsuccess=By.xpath("//div[@class=\"alert-success alert\"]");
    final private By products=By.xpath("//div[@class=\"col-sm-4\"]//div[@class=\"productinfo text-center\"]");

    public void account_deleted() {
        click(account_deleted);

    }

    public void contactUsPage() {
        click(contactus);

    }

    public void goToSignUpPage() {
        click(signupAndLoginbutton);
    }


    public void testcasesPage() {
click(testcases);
    }
    public void productsPage() {
click(products_tesxt);
    }

    public String subscribtion_text() {
        String TEXT=getText(subscribtion);
        return TEXT;

    }
    public void subscribtion_info_submit(String email){
        setText(subscribtionEmail,email);
        click(subscribtionbutton);

    }
    public String subscribtionSuccess(){
       String text= getText(subscribtionsuccess);
       return text;
    }
    public int getproductsSize(){
        return getSize(products);

    }

}

