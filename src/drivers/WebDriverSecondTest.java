package drivers;

public class WebDriverSecondTest {
    public static void main(String[] args) {
        WebDriver chrome = new ChromeDriver();
        WebDriver secondChrome = new ChromeDriver();

        WebDriver firefox = new FirefoxDriver();
        WebDriver firefoxSecond = new FirefoxDriver();

        WebDriver safari = new WebDriver() {        //utworzenie klasy anonimowej
            @Override
            public void get() {
                System.out.println("Opening page with Safari");
            }

            @Override
            public void findElementBy() {
                System.out.println("Finding element with Safari");
            }
        };
        safari.get();
        safari.findElementBy();
    }
}
