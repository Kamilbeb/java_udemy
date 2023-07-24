public class Footballer extends Person {

    public String footballClub;

    public Footballer(String name, int age, String footballClub) {
        super(name, age);
        this.footballClub = footballClub;
    }

    public void playFootball() {
        System.out.println("I am playing football for " + footballClub);
    }

    public void sayHello() {
        System.out.println("Hello my name is " + name);
        System.out.println("I am " + age);
    }
}
