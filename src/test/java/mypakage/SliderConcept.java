package mypakage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class SliderConcept {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get( "https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
        driver.manage().window().maximize();

        WebElement min_slider=driver.findElement(By.xpath( "//span[1]"));
        System.out.println("Location of the Slider"+min_slider.getLocation()); // 59 ,250

        System.out.println("Height & width of the element"+min_slider.getSize());// 22 ,21

        Actions act = new Actions(driver);
        act.dragAndDropBy(min_slider, 150, 0).perform();

        WebElement Max_slider =driver.findElement(By.xpath("//span[2]"));
        System.out.println("maximan lacation slider"+Max_slider.getLocation());
        System.out.println("maximan height and wight"+Max_slider.getSize());
        act.dragAndDropBy(Max_slider, -100, 0).perform();


    }

}
