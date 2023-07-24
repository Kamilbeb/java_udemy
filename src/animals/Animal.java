package animals;

public abstract class Animal {      //klasa absrtakcyjna

    public final static int legs = 4;       //stała
    public  abstract void sound();  //metoda abstrakcyjna

    public void sayHello(){         //metoda zwykła
        System.out.println("Hello I am an animal");
    }
}
