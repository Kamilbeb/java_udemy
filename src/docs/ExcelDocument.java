package docs;

public class ExcelDocument implements Document{
    @Override
    public void getDescription() {
        System.out.println("It is Excel document");
    }
}