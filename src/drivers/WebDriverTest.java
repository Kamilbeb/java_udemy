package drivers;

public class WebDriverTest {
    public static void main(String[] args) {

        WebDriver driver = getDriver("firefox");

        driver.get();
        driver.findElementBy();

    }

    private static WebDriver getDriver(String name) {
        if (name.equals("chrome")){
            return new ChromeDriver();
        } else if (name.equals("firefox")) {
            return new FirefoxDriver();
        }
        return null;
    }
}
