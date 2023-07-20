public class AutoTest {
    public static void main(String[] args) {

        Auto suzuki = new Auto();
        suzuki.model = "sx4";
        suzuki.mark = "suzuki";
        suzuki.carMileage = 25000;
        suzuki.yearCar = 2021;

        suzuki.goCar();
        suzuki.brakeCar();
        suzuki.info();
    }
}
