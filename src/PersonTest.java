public class PersonTest {

    public static void main(String[] args) {
        MathTeacher teacher = new MathTeacher("Tom", 30, "university");
        teacher.sayHello();
        teacher.teachMath();
        teacher.walk();
        teacher.eat();
        System.out.println("--------------------------------------");

        Footballer footballer = new Footballer("Tom",21,"Juniors");
        footballer.sayHello();
        footballer.playFootball();
        footballer.walk();
        footballer.eat();

    }
}
