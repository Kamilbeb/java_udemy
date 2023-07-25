package Fils;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("test.txt");
        if(file.delete()){
            System.out.println("The file has been deleted");
        }else{
            System.out.println("Filed to deleted");
        }
    }
}
