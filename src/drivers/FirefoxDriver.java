package drivers;

public class FirefoxDriver implements WebDriver {
    @Override
    public void get() {
        System.out.println("I open the browser with Firefox");
    }

    @Override
    public void findElementBy() {
        System.out.println("Finds an element using the Firefox browser");
    }
}
