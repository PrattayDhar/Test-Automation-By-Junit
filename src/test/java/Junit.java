import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class BanglaPuzzle {
    WebDriver driver;

    @BeforeAll
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @DisplayName("Visit Website Get Title")
    @Test
    public void getTitle() {
        driver.get("https://pw1.bpclient.click");
        String actual_title = driver.getTitle();
        String expected_title = "Motivational Speaker";
        Assertions.assertTrue(actual_title.contains(expected_title));
        System.out.println(actual_title);

    }

    @DisplayName("Input Field Fill-Up And Submit")
    @Test
    public void inputFiled() {
        driver.get("https://pw1.bpclient.click");
        List<WebElement> textBoxes = driver.findElements(By.cssSelector("input.rounded-md"));
        textBoxes.get(0).sendKeys("Test");
        textBoxes.get(1).sendKeys("test@gmail.com");

        driver.findElement(By.cssSelector("button.rounded-md")).click();

    }

    @DisplayName("THE IDEOLOGY LEARN MORE BUTTON ")
    @Test
    public void clickFirstLinkButton() {
        driver.get("https://pw1.bpclient.click");

        WebElement linkButton = driver.findElement(By.xpath("/html[1]/body[1]/section[3]/div[1]/div[1]/div[1]/div[1]/a[1]"));
        linkButton.click();

    }


    @DisplayName("MY JOURNEY WITH AWAMI LEAGUE LEARN MORE BUTTON ")
    @Test
    public void clickThirdLinkButton() {
        driver.get("https://pw1.bpclient.click");
        WebElement linkButton = driver.findElement(By.xpath("/html[1]/body[1]/section[6]/div[1]/div[1]/div[1]/a[1]"));
        linkButton.click();

    }

    @DisplayName("PHOTO GALLERY VIEW MORE BUTTON ")
    @Test
    public void clickFourthLinkButton() {
        driver.get("https://pw1.bpclient.click");
        WebElement linkButton = driver.findElement(By.xpath("/html[1]/body[1]/section[10]/div[1]/div[2]/div[2]/a[1]"));
        linkButton.click();
        driver.navigate().back();

    }

    @DisplayName("MEDIA COVERAGES BUTTON")
    @Test
    public void carosoleButton() {
        driver.get("https://pw1.bpclient.click");
        driver.findElement(By.xpath("/html[1]/body[1]/section[11]/div[1]/div[2]/div[2]/button[2]")).click();
        driver.navigate().back();
    }

    @DisplayName("CONTACT US BUTTON ")
    @Test
    public void clickContactLinkButton() {
        driver.get("https://pw1.bpclient.click");
        WebElement linkButton = driver.findElement(By.xpath("/html[1]/body[1]/header[1]/nav[1]/div[1]/div[1]/ul[1]/li[7]/a[1]"));
        linkButton.click();

    }

    @DisplayName("EVENT BUTTON ")
    @Test
    public void clickEventLinkButton() {
        driver.get("https://pw1.bpclient.click");
        WebElement linkButton = driver.findElement(By.xpath("/html[1]/body[1]/header[1]/nav[1]/div[1]/div[1]/ul[1]/li[2]/a[1]"));
        linkButton.click();

    }

    //
    @DisplayName("NEWS BUTTON ")
    @Test
    public void clickNewsLinkButton() {
        driver.get("https://pw1.bpclient.click");
        WebElement linkButton = driver.findElement(By.xpath("/html[1]/body[1]/header[1]/nav[1]/div[1]/div[1]/ul[1]/li[3]/a[1]"));
        linkButton.click();

    }


    @DisplayName("Get Invoved BUTTON ")
    @Test
    public void clickGetInvovedLinkButton() {
        driver.get("https://pw1.bpclient.click");
        WebElement linkButton = driver.findElement(By.xpath("/html[1]/body[1]/header[1]/nav[1]/div[1]/div[1]/ul[1]/li[6]/a[1]"));
        linkButton.click();

    }

    @DisplayName("ABOUT MOUSE HOVER")
    @Test
    public void mouseHoverAbout() throws InterruptedException {
        driver.get("https://pw1.bpclient.click");
        WebElement menuWrite = driver.findElement(By.xpath("/html[1]/body[1]/header[1]/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(menuWrite).perform();
        Thread.sleep(3000);

    }

    @DisplayName("MEDIA MOUSE HOVER")
    @Test
    public void mouseHoverMedia() throws InterruptedException {
        driver.get("https://pw1.bpclient.click");
        WebElement menuWrite = driver.findElement(By.xpath("/html[1]/body[1]/header[1]/nav[1]/div[1]/div[1]/ul[1]/li[4]/a[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(menuWrite).perform();
        Thread.sleep(3000);

    }

    @DisplayName("GALLERY MOUSE HOVER")
    @Test
    public void mouseHoverGalley() throws InterruptedException {
        driver.get("https://pw1.bpclient.click");
        WebElement menuWrite = driver.findElement(By.xpath("/html[1]/body[1]/header[1]/nav[1]/div[1]/div[1]/ul[1]/li[5]/a[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(menuWrite).perform();
        Thread.sleep(3000);

    }

    @AfterAll
    public void closeDriver() {

        driver.quit();
    }
}
