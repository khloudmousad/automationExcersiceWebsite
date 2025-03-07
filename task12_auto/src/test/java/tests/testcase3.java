package tests;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.homepage;
import pages.loginpage;
import pages.signUpPage;

public class testcase3 extends testbase{
    homepage home;
    signUpPage signup;
    Faker fake=new Faker();
    loginpage login;


    @Test
            public void loged_in_withinvalid_data()
   // home_page_visisble
    {
        home=new homepage(driver);
        Assert.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/","not equal");
        Assert.assertTrue(driver.findElement(home.logoOFhOmePage).isDisplayed(),"NO LOGO FOUND");

   // login_to_youraccount_is_visible
        login=new loginpage(driver);
        home.goToSignUpPage();
        Assert.assertEquals(login.log_in_text().toLowerCase(),"login to your account","Login to your account not visible");
  //loged_in_withinvalid_data


        login.log_in("khloud1@moad.com","123456");
        // Assert login success
        Assert.assertEquals(login.loged_in_withinvalid_data_text().toLowerCase(),"your email or password is incorrect!","logged in sucessfully");

    }
}
