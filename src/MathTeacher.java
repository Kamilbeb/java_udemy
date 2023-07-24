public class MathTeacher extends Person {   //klasa MathTeacher rozszerza klasę Person

    public String school;

    public MathTeacher(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    public void  teachMath(){
        System.out.println("I am teaching Math");
    }
    public void sayHello(){
        System.out.println("Hello my name is "+name);
        System.out.println("I am "+ age);
    }
    public void walk(){
        super.walk();       //wywołana metoda walk() z klasy Person
        System.out.println("I walk very fast");
    }
}
