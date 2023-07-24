public class App {

    public String name;
    public String description;

    public App(String name, String description){
        this.name = name;
        this.description = description;
    }
    public void appInfo(){
        System.out.println("App name: " + name);
        System.out.println("App description: " + description);
    }
}
