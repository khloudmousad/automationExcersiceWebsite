package tests;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.homepage;
import pages.signUpPage;

public class testcase1AND5 extends testbase{
    homepage home;
    signUpPage signup;
     Faker fake=new Faker();
    public   final String email=fake.internet().emailAddress();
    public  final  String name=fake.name().firstName();


    @Test
    public void home_page_visisble()
    {    //home_page_visisble
        home=new homepage(driver);
        Assert.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/","not equal");
        Assert.assertTrue(driver.findElement(home.logoOFhOmePage).isDisplayed(),"NO LOGO FOUND");


        //new_user_signup  is visible

        signup =new signUpPage(driver);
        home.goToSignUpPage();
        Assert.assertEquals(signup.new_user_signup_text(),"New User Signup!","new user sign up not visible");
        //ENTER_ACCOUNT_INFORMATION
        signup.signupNameAndEmail(name,email);
        signup.clickSignUpButton();

        Assert.assertEquals(signup.ENTER_ACCOUNT_INFORMATION_text().toLowerCase(),"enter account information","Enter Account Information not visible");


    }
    @Test

    public void  account_is_created_sucessfully(){

        home=new homepage(driver);
        signup =new signUpPage(driver);


        home.goToSignUpPage();
        signup.signupNameAndEmail(name,"khloud158@mousad.com");
        signup.clickSignUpButton();
        signup.selectDOB();
        signup.EnterSignUpInfo("123456",name,"mousad","company","alexxx","CALIFOR","alex","22511","01016611624");
        signup.clickCreatAccountButton();
        Assert.assertEquals(signup.account_is_created_sucessfull_text().toLowerCase(),"account created!","account not created sucessfully");

    }

    @Test
    public void loged_in_as_username(){
        home=new homepage(driver);
        signup =new signUpPage(driver);
        fake=new Faker();
        home.goToSignUpPage();
        signup.signupNameAndEmail("khloud","khloud1@mousad.com");
        signup.clickSignUpButton();
        signup.EnterSignUpInfo("1234567",name,"mousad","company","alexxx","CALIFOR","alex","22511","01016611624");
        signup.clickCreatAccountButton();
signup.CLICKONcontinueButton();
Assert.assertEquals(signup.loged_in_as_username_text().toLowerCase(),"logged in as "+name.toLowerCase(),"didn't logged in successfully");


    }

    @Test
    public void account_deleted(){
        home=new homepage(driver);
        signup =new signUpPage(driver);
        fake=new Faker();
        home.goToSignUpPage();
        signup.signupNameAndEmail(name,"khloud124@mousad.com");
        signup.clickSignUpButton();
        signup.EnterSignUpInfo("1234567",name,"mousad","company","alexxx","CALIFOR","alex","22511","01016611624");
        signup.clickCreatAccountButton();
        signup.CLICKONcontinueButton();
        home.account_deleted();
        Assert.assertEquals(signup.account_deleted_text().toLowerCase(),"account deleted!","account didn't deleted successfully");
         signup.CLICKONcontinueButton();

    }
    @Test
    public void signup_with_exixting_email(){
        home=new homepage(driver);
        signup =new signUpPage(driver);
        fake=new Faker();
        home.goToSignUpPage();
        signup.signupNameAndEmail("khloud","khloud1@mousad.com");
        signup.clickSignUpButton();

        Assert.assertEquals(signup.signUpExist().toLowerCase(),"email address already exist!","not wqual Email Address already exist!");

    }

}
