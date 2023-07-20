public class Auto {
    public String mark;
    public String model;
    public int yearCar;
    public int carMileage;

    public Auto(){
    }
    public Auto(String mark, String model, int yearCar, int carMileage){
    this.mark = mark;
    this.model = model;
    this.yearCar = yearCar;
    this.carMileage = carMileage;
    }

    public void goCar(){
        System.out.println("GO GO!!");
    }
    public void brakeCar(){
        System.out.println("Brake!");
    }
    public void info(){
        System.out.println("Mark: "+mark);
        System.out.println("Model: "+model);
        System.out.println("Year car: "+yearCar);
        System.out.println("Car mileage: "+carMileage);
    }
}
