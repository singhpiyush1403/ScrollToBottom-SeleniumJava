import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ScrollHeight{

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.calculator.net/");
	
	JavascriptExecutor js =  (JavascriptExecutor) driver;
	Thread.sleep(3000);
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");


	}

}
