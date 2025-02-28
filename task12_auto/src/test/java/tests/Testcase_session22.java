package tests;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.homepage;
import pages.products;

import java.util.ArrayList;

public class Testcase_session22 extends testbase{
    homepage home;
    products product;
    SoftAssert soft;
    Faker  fake;
    @Test
    public void  randomProductImage_name_price(){
        home=new homepage(driver);
        product=new products(driver);
        soft=new SoftAssert();
        fake=new Faker();
        home.productsPage();
        int  size =home.getproductsSize();
        System.out.println(size);
        int random=fake.number().numberBetween(1,size);
        ArrayList<String>productDetails_=product.randomProductImage_price_(random);
        product.click_product(random);
        ArrayList<String>productDetails_AfterClick=product.randomProductImage_price_title_after_click(random);

        soft.assertEquals(productDetails_.get(0).trim(),productDetails_AfterClick.get(0).trim());
        soft.assertEquals(productDetails_.get(1).trim(),productDetails_AfterClick.get(1).trim());
        soft.assertEquals(productDetails_.get(2).trim(),productDetails_AfterClick.get(2).trim());
   soft.assertAll();
    }
}
