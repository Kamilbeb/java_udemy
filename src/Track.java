public class Track implements Vehicle{
    @Override
    public void drive(int speed) {
        System.out.println("I'm driving a truck at speed "+ speed);
    }

    @Override
    public void stop() {
        System.out.println("brakes the truck");
    }

    @Override
    public String info() {
        return "Track";
    }


}
