public class Bike implements Vehicle{

    @Override
    public void drive(int speed) {
        System.out.println("I'm cycling at speed" + speed);
    }

    @Override
    public void stop() {
        System.out.println("brakes the bike");
    }

    @Override
    public String info() {
        return "Bike";
    }
    public void refuel(){
        System.out.println("Eat to be strong");
    }
}
