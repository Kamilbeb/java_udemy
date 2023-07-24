import drivers.FirefoxDriver;
import drivers.WebDriver;

public class ConvertionCasting {
    public static void main(String[] args) {
        int a=4;
        double b=4.35;

        double c = a/b; //konwersja niejawna a zostaje przekonwertowane na double

        int d=a/(int)b; //konwersja typu b na integer
        System.out.println(c);
        System.out.println(d);

        WebDriver driver = new FirefoxDriver();

        FirefoxDriver firefoxDriver = (FirefoxDriver)driver;
        firefoxDriver.get();

    }
}
