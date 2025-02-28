package tests;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class testcase7 extends testbase{
    homepage home;
    Faker fake=new Faker();
    loginpage login;
  testcasesPage testP ;
    @Test
    public void home_page_visisble()
    {
        home=new homepage(driver);
        Assert.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/","not equal");
        Assert.assertTrue(driver.findElement(home.logoOFhOmePage).isDisplayed(),"NO LOGO FOUND");

    }

    @Test
    public void verify_testcases_page(){
        home=new homepage(driver);
        testP=new testcasesPage(driver);
home.testcasesPage();

        Assert.assertEquals(testP.testcases_text().toLowerCase(), "test cases", "not equal ");

    }
}
