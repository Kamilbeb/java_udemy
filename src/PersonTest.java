public class PersonTest {

    public static void main(String[] args) {
        MathTeacher teacher = new MathTeacher();
        teacher.name = "Jan";
        teacher.age = 30;
        teacher.school = "University";
        teacher.sayHello();
        teacher.teachMath();
        teacher.walk();
        teacher.eat();
        System.out.println("--------------------------------------");

        Footballer footballer = new Footballer();
        footballer.name = "Tom";
        footballer.age = 21;
        footballer.footballClub = "Juniors";
        footballer.sayHello();
        footballer.playFootball();
        footballer.walk();
        footballer.eat();

    }
}
