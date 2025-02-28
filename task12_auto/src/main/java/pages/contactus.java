package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class contactus extends base{

    public contactus(WebDriver driver) {
        super(driver);
    }

  private final By getTouch = By.xpath("//div[@class=\"contact-form\"]//h2");
  private final By name = By.xpath("//input[@name=\"name\"]");
  private final By email= By.xpath("//input[@name=\"email\"]");
  private final By message = By.xpath("//textarea[@name=\"message\"]");
  private final By subject = By.xpath("//input[@name=\"subject\"]");
  private final By sumbitbutton = By.xpath("//input[@data-qa=\"submit-button\"]");
  private final By sucessmessage = By.xpath("//div[@class=\"status alert alert-success\"]");
  private final By homepage = By.xpath("//div[@id=\"form-section\"]//span");


    public String gettouch(){
       String text= getText(getTouch);
       return text;
    }
    public void contactUSform (String NAME,String Email,String Message ,String Subject ){
        setText(name,NAME);
        setText(email,Email);
        setText(message,Message);
        setText(subject,Subject);
        click(sumbitbutton);
        driver.switchTo().alert().accept();


    }
    public String sucessmessage(){
        String text= getText(sucessmessage);
        return text;
    }
    public void homepage_again(){
       click(homepage);

    }


}
