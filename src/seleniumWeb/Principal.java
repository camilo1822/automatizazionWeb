package seleniumWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Principal {
	    public static void main(String[] args) throws InterruptedException {

	    	/*String exePath = "C:\\Users\\juan.arboleda\\Downloads\\geckodriver-v0.15.0-win64\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", exePath);
			WebDriver driver = new FirefoxDriver();
			driver.get("http://www.store.demoqa.com");
	        System.out.println("Successfully opened the website www.Store.Demoqa.com");
			Thread.sleep(5);	
	        driver.quit();*/
	    	
	    	/*COnfiguro el driver*/
	    	String exePath = "C:\\Users\\juan.arboleda\\Downloads\\chromedriver_win32\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", exePath);
			/*Inicializo el driver*/
			WebDriver driver = new ChromeDriver();
			/*Redirecciono a una pagina*/
			driver.get("http://demoqa.com/frames-and-windows/");
			/*Titulo de la página*/
			String Title = driver.getTitle();
			System.out.println("titulo "+Title);
			/*Url actual*/
			String CurrentUrl = driver.getCurrentUrl();
			System.out.println("url "+CurrentUrl);
			/*Codigo fuetne*/
			String PageSource = driver.getPageSource();
			System.out.println("codigo "+PageSource);
			/*Cierra ventana actual*/
			//driver.close();
			/*Cierra todas las ventanas*/
			//driver.quit();
			/*Doy clic en el elemento con ese id, directamente en la etiqueta a*/
			driver.findElement(By.xpath(".//*[@id='tabs-1']/div/p/a")).click();
	    }
}
