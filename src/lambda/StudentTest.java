package lambda;

public class StudentTest {
    public static void main(String[] args) {
    Student it = new ItStudent();
    sayHello("Tom",28, it);

    Student med = new Student() {
        @Override
        public void sayHello(String name, int age) {
            System.out.println("I will be a doctor");
            System.out.println("My name is "+name);
        }
    };
    sayHello("Jan",28, med);

    // wyrażenie lambda poniżej i zastępuje on zapis powyższy klasy anonimowej
    Student noStudent = (name, age) ->{
        System.out.println("I am not a student, My name is" + name+" I am "+age);
        if(age>18){
            System.out.println("You can buy a beer");
        }

    };
    sayHello("Tom",15, noStudent);

    }
    public static void sayHello(String name, int age, Student student){
        student.sayHello(name, age);
    }
}
