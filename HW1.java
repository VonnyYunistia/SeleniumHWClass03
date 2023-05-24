package HWClass3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/input-form-demo.php");
        driver.manage().window().maximize();

        WebElement firstName= driver.findElement(By.cssSelector("input[name='first_name']"));
        firstName.sendKeys("Ciwit");

        WebElement lastName= driver.findElement(By.cssSelector("input[name='last_name']"));
        lastName.sendKeys("cantik");

        WebElement email= driver.findElement(By.cssSelector("input[name='email']"));
        email.sendKeys("Cantik.ciwit@gmail.com");

        WebElement Phone= driver.findElement(By.cssSelector("input[name='phone']"));
        Phone.sendKeys("123-456-7890");

        WebElement Address= driver.findElement(By.cssSelector("input[name='address']"));
        Address.sendKeys("100 Main St");

        WebElement City= driver.findElement(By.cssSelector("input[name='city']"));
        City.sendKeys("Cumming");

        WebElement state= driver.findElement(By.cssSelector("input[name='state']"));
        state.sendKeys("GA");

WebElement stateOptions= driver.findElement(By.xpath("//option[text() = 'Georgia']"));
stateOptions.click();

        WebElement ZipCode= driver.findElement(By.cssSelector("input[name='zip']"));
        ZipCode.sendKeys("30028");

        WebElement WebSite= driver.findElement(By.cssSelector("input[name='website']"));
        WebSite.sendKeys("//https://www.BVSolution.com");

        WebElement hosting= driver.findElement(By.xpath("//input[@value = 'yes']"));
        hosting.click();

        WebElement projectDesc= driver.findElement(By.cssSelector("textarea[name='comment']"));
        projectDesc.sendKeys("This is new project");


    }
}
