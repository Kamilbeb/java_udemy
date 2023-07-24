public class AppTest{
    public static void main(String[] args) {

        AndroidApp androidApp = new AndroidApp("Calculator","Test app");
        androidApp.appInfo();
        androidApp.runAndroidApp();

        IphoneApp iphoneApp = new IphoneApp("Calculator", "test app");
        iphoneApp.appInfo();
        iphoneApp.runIphoneApp();
    }
}
