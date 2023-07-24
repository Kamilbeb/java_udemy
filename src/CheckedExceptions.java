import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {
    public static void main(String[] args){
        try {
            System.out.println("Before reading file");
            readFile("D:\\java_udemy\\src\\test1.txt");
        } catch (FileNotFoundException e) {
            System.out.println("wyjątek został wyrzucony");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Closing file");
        }
    }
    public static void readFile(String path) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);
    }

}
