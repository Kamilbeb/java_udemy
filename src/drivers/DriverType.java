package drivers;

public enum DriverType {
    CHROME("chrome", "src/resources/chromdriver.exe"),  //wartości Enum Chrome - dopasowanie do konstruktora

    FIREFOX("firefox","src/resources/firefox.exe");

    String name;
    String path;

    DriverType(String name, String path){       //tworzenie konstruktora
        this.name = name;
        this.path = path;
    }
}
