package tests;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.homepage;
import pages.loginpage;
import pages.signUpPage;

public class testcase2 extends testbase{

    homepage home;
    signUpPage signup;
    Faker fake=new Faker();
    loginpage login;


    @Test
    public void loged_in_as_username_successfully()
    {
        home=new homepage(driver);
        Assert.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/","not equal");
        Assert.assertTrue(driver.findElement(home.logoOFhOmePage).isDisplayed(),"NO LOGO FOUND");



   // login_to_youraccount_is_visible
         login=new loginpage(driver);
        home.goToSignUpPage();
        Assert.assertEquals(login.log_in_text().toLowerCase(),"login to your account","Login to your account not visible");

    // loged_in_as_username_successfully


       login.log_in("khloud1@mousad.com","123456");
        // Assert login success
        Assert.assertEquals(login.loged_in_as_username().toLowerCase(),"logged in as khloud","didn't logged in successfully");

    }
    @Test
    public void account_deleted() {
        home=new homepage(driver);
        login=new loginpage(driver);
        signup=new signUpPage(driver);
        home.goToSignUpPage();
        login.log_in("khloud124@mousad.com","123456");
        // Assert login success
        Assert.assertEquals(login.loged_in_as_username().toLowerCase(),"logged in as khloud","didn't logged in successfully");
        home.account_deleted();
        Assert.assertEquals(signup.account_deleted_text().toLowerCase(),"account deleted!","account didn't deleted successfully");


    }




}
