package tests;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.homepage;
import pages.loginpage;
import pages.products;
import pages.testcasesPage;

public class testcase8 extends testbase{
    homepage home;
    products product;
    Faker fake=new Faker();
    loginpage login;
    testcasesPage testP ;
    @Test
      public void verifyThatDetailDetailIsVisible()
    // home_page_visisble()
    {
        home=new homepage(driver);
        Assert.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/","not equal");
        Assert.assertTrue(driver.findElement(home.logoOFhOmePage).isDisplayed(),"NO LOGO FOUND");




   // Verify_user_is_navigated_to_ALL_PRODUCTS_page_successfully(){

        product=new products(driver);
home.productsPage();
        Assert.assertEquals(product.productPageT().toLowerCase(),"all products","notequal");


   //verifyThatDetailDetailIsVisible(){

        product.click_product(1);
        Assert.assertEquals(product.category().toLowerCase(),"category","Category not visible");
        Assert.assertEquals(product.productNAME().toLowerCase(),"blue top","product name not visible");
        Assert.assertEquals(product.price().toLowerCase(),"rs. 500","price not visible");
        Assert.assertEquals(product.Avilability().toLowerCase(),"availability: in stock","Availability not visible");
        Assert.assertEquals(product.condition().toLowerCase(),"condition: new","Condition not visible");
        Assert.assertEquals(product.Brand().toLowerCase(),"brand: polo","Brand not visible");

    }


}
