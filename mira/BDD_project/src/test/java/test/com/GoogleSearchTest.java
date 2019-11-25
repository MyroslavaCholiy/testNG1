
package test.com;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GoogleSearchTest {
     private static WebDriver driver;
    private String baseUrl="https://www.google.com";  
    
    @Given("^user is in Giigle page$")
public void user_is_in_Giigle_page() throws Throwable {
     WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
         driver.get(baseUrl);
     
    // Write code here that turns the phrase above into concrete actions
//    throw new PendingException();


}

@When("^I type bascketball$")
public void i_type_bascketball() throws Throwable {
   driver.findElement(By.xpath(".//*[@name='q']")).click();
    driver.findElement(By.xpath(".//*[@name='q']")).clear();
    driver.findElement(By.xpath(".//*[@name='q']")).sendKeys("Basketball");
    // Write code here that turns the phrase above into concrete actions
//    throw new PendingException();
}

@When("^submit the page$")
public void submit_the_page() throws Throwable {
    
    driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]"));
    // Write code here that turns the phrase above into concrete actions
//    throw new PendingException();
}

@Then("^I see the search result$")
public void i_see_the_search_result() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
//    throw new PendingException();
}
}
