package drivers;

public class WebDriverTest {
    public static void main(String[] args) throws NoValidBrowserName {

        WebDriver driver = getDriver("firefoxa");

        driver.get();
        driver.findElementBy();

    }

    private static WebDriver getDriver(String name) throws NoValidBrowserName {
        if (name.equals("chrome")){
            return new ChromeDriver();
        } else if (name.equals("firefox")) {
            return new FirefoxDriver();
        }
        throw new NoValidBrowserName("No valid browser name. "); //dodanie wyjątku własnego
    }
}
