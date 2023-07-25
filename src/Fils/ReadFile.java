package Fils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test.txt");
        Scanner myReader = new Scanner(file);
        while (myReader.hasNext()){     //sprawdzenie czy coś jeszcze jest w kolejnej linii pliku
            String line = myReader.nextLine();
            System.out.println(line);
        }
        myReader.close();
    }
}
