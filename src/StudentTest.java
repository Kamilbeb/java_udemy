public class StudentTest {
    public static void main(String[] args) {

        String uczelnia = Student.nazwaUczelni;
        Student.infoUczelnia();         //implementacja metody statycznej

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.name = "Jan";
        student1.surname = "Kowalski";
        student1.email = "kowalski@wp.pl";
        student1.indexNo = 1001;
        student1.nick = "kowal";

        student2.name = "Tomasz";
        student2.surname = "Pogodny";
        student2.email = "pogodny@gmail.com";
        student2.indexNo = 1002;
        student2.nick = "pogo";

        student3.name = "Anna";
        student3.surname = "Testowa";
        student3.email = "testowa@poczta.fm";
        student3.indexNo = 1003;
        student3.nick = "test";

        Student[] tabStudent = new Student[3];
        tabStudent[0] = student1;
        tabStudent[1] = student2;
        tabStudent[2] = student3;

        for(int i=0; i<tabStudent.length;i++){
            tabStudent[i].introduceYour();
            tabStudent[i].logIn();
            tabStudent[i].enterEmail();
            tabStudent[i].enterTheIndexNumber();
        }



    }
}
