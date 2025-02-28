package tests;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.contactus;
import pages.homepage;
import pages.loginpage;
import pages.signUpPage;

public class testcase6 extends testbase {
    homepage home;
    signUpPage signup;
    Faker fake=new Faker();
    loginpage login;
contactus contact;

    @Test
    public void successMessage()
    {
        //home_page_visisble()
        home=new homepage(driver);
        Assert.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/","not equal");
        Assert.assertTrue(driver.findElement(home.logoOFhOmePage).isDisplayed(),"NO LOGO FOUND");

    // get_in_touch_is_visible()
        home.contactUsPage();
        contact=new contactus(driver);

        Assert.assertEquals(contact.gettouch().toLowerCase(),"get in touch","not equal get in touch");

    //successmessage()

        contact.contactUSform(fake.name().firstName(),fake.internet().emailAddress(),"help","help");
        Assert.assertEquals(contact.sucessmessage(), "Success! Your details have been submitted successfully.", "not equal ");



  // home_page_visisble_again() {

contact.homepage_again();
        Assert.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/","not equal");
        Assert.assertTrue(driver.findElement(home.logoOFhOmePage).isDisplayed(),"NO LOGO FOUND");

    }

}
