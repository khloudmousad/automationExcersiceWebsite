package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class products extends base{

    public products(WebDriver driver) {
        super(driver);
    }

    final private By products_text = By.xpath("//h2[@class=\"title text-center\"]");
    final private By Category= By.xpath("//div[@class=\"left-sidebar\"]/h2");
    final private By productName = By.xpath("//div[@class=\"product-information\"]//h2");
    final private By price = By.xpath("//div[@class=\"product-information\"]/span//span");
    final private By Avilable = By.xpath(("//div[@class=\"product-information\"]//p[2]"));
    final private By Condition = By.xpath("//div[@class=\"product-information\"]//p[3]");
    final private By brand = By.xpath("//div[@class=\"product-information\"]//p[4]");
    final private By search = By.xpath("//input[@id=\"search_product\"]");
    final private By searchProducts_text = By.xpath("//h2[@class=\"title text-center\"]");
    final private By searchButton = By.xpath("//button[@id=\"submit_search\"]");




    public String productPageT(){
        String text =getText(products_text);
        return text;
    }
    public void click_product(int i){
        click(driver.findElement(By.xpath("//div[@class=\"col-sm-9 padding-right\"]//div[@class=\"col-sm-4\"]["+i+"]//i[@class=\"fa fa-plus-square\"]")));

    }
    public String category(){
        String text =getText(Category);
        return text;
    }
    public String productNAME(){
        String text =getText(productName);
        return text;
    }
    public String price(){
        String text =getText(price);
        return text;
    }
    public String Avilability(){
        String text =getText(Avilable);
        return text;
    }
    public String condition(){
        String text =getText(Condition);
        return text;
    }
    public String Brand(){
        String text =getText(brand);
        return text;
    }
    public  void searchProduct(String text){
        setText(search,text);
    }
    public String searchproducts_text(){
        String text =getText(searchProducts_text);
        return text;
    }
    public void searchButton(){
        click(searchButton);
    }
    public void getsearchedproductSize(int size){

    }

    public  ArrayList<WebElement> searchProducts(){
      ArrayList<WebElement>products=new ArrayList<>( driver.findElements(By.xpath("//div[@class=\"col-sm-4\"]//div[@class=\"productinfo text-center\"]//p")));

        return products;

    }
    public ArrayList<String> randomProductImage_price_(int i){

        WebElement randomProduct = driver.findElement(By.xpath("//div[@class=\"col-sm-4\"]["+i+"]//div[@class=\"productinfo text-center\"]"));

        String productTitle = randomProduct.findElement(By.tagName("p")).getText();
        String productPrice = randomProduct.findElement(By.tagName("h2")).getText();
        String productImage = randomProduct.findElement(By.tagName("img")).getAttribute("src");
        System.out.println("Random Product Selected:");
        System.out.println("Title: " + productTitle);
        System.out.println("Price: " + productPrice);
        System.out.println("Image URL: " + productImage);

        ArrayList<String> product_details=new ArrayList<>();
product_details.add(productTitle);
product_details.add(productPrice);
product_details.add(productImage);

return product_details;


    }

 public ArrayList<String> randomProductImage_price_title_after_click(int i){

        WebElement randomProduct = driver.findElement(By.xpath("//div[@class=\"product-information\"]"));

        String productTitle = randomProduct.findElement(By.xpath("//div[@class=\"product-information\"]/h2")).getText();
        String productPrice = randomProduct.findElement(By.xpath("//div[@class=\"product-information\"]/span/span")).getText();
        String productImage = randomProduct.findElement(By.xpath("//div[@class=\"col-sm-5\"]//img")).getAttribute("src");
     System.out.println("Random Product Selected:");
     System.out.println("Title: " + productTitle);
     System.out.println("Price: " + productPrice);
     System.out.println("Image URL: " + productImage);

     ArrayList<String> product_details=new ArrayList<>();
product_details.add(productTitle);
product_details.add(productPrice);
product_details.add(productImage);

return product_details;


    }




}
