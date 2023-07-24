package drivers;

public class ChromeDriver implements WebDriver {

    @Override
    public void get() {
        System.out.println("I open the browser with Chrome");
    }

    @Override
    public void findElementBy() {
        System.out.println("Finds an element using the Chrome browser");
    }
}
