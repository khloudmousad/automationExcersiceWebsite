package tests;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.homepage;
import pages.loginpage;
import pages.products;
import pages.testcasesPage;

public class testcase10 extends testbase{
    homepage home;
    products product;
    Faker fake=new Faker();
    loginpage login;
    testcasesPage testP ;
    @Test  public void successSubscribtionButton()
   // home_page_visisble()
    {
        home=new homepage(driver);
        Assert.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/","not equal");
        Assert.assertTrue(driver.findElement(home.logoOFhOmePage).isDisplayed(),"NO LOGO FOUND");


    //SUBSCRIPTION_Text(){
        home=new homepage(driver);

        Assert.assertEquals(home.subscribtion_text().toLowerCase(),"subscription","not equal");


   // successSubscribtionButton(){
        home=new homepage(driver);
        home.subscribtion_info_submit("khloud1@mousad.com");
        Assert.assertEquals(home.subscribtionSuccess().toLowerCase(),"you have been successfully subscribed!","not equal");


    }

}
