package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleSearch {

    WebDriver driver =null;

    @Given("browser is open")
    public void browser_is_open() {
        System.out.println("Inside browser is open");
        String projectPath= System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath+"\\src\\test\\resources\\drivers\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @And("user is on search page")
    public void user_is_on_search_page() {
        System.out.println("Inside user is on search page");
        driver.navigate().to("https://google.com");
        driver.findElement(By.id("W0wltc")).click();
    }

    @When("user enters a text in search box")
    public void user_enters_a_text_in_search_box() {
        System.out.println("Inside user enters a text in search box");
        driver.findElement(By.name("q")).sendKeys("Novelty Lover");
    }

    @And("user clicks on search button")
    public void user_clicks_on_search_button() {
        System.out.println("Inside user clicks on search button");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }

    @Then("user is navigated to search results")
    public void user_is_navigated_to_search_results() {
        System.out.println("Inside user is navigated to search results");
        driver.getPageSource().contains("Novelty");
        driver.quit();
    }
}
