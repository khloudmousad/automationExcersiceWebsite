package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.homepage;
import pages.products;

public class testcase9 extends testbase{
    homepage home;
    products product;
SoftAssert soft;
    @Test
            public void searchrelatedProducts()
  // home_page_visisble()
    { soft=new SoftAssert();
        home=new homepage(driver);
        soft.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/","not equal");
       soft.assertTrue(driver.findElement(home.logoOFhOmePage).isDisplayed(),"NO LOGO FOUND");




   //Verify_user_is_navigated_to_ALL_PRODUCTS_page_successfully(){
        product=new products(driver);
        home.productsPage();
        soft.assertEquals(product.productPageT().toLowerCase(),"all products","notequal");


    // searchProducts(){

        product.searchProduct("shirt");
        product.searchButton();
       soft.assertEquals(product.searchproducts_text().toLowerCase(),"searched products","notequal");


   //product-related

      for(WebElement productt:product.searchProducts()) {
          System.out.println(productt.getText());

          soft.assertTrue(productt.getText().toLowerCase().contains("shirt"), "notequal");

 soft.assertAll();
      }
      


    }


}
