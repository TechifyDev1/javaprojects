public class Car {
    String name;
    String model;
    int year;

    public Car(String name, String model, int year) {
        this.name = name;
        this.model = model;
        this.year = year;
    }

    public void displayCarInfo() {
        System.out.println("Name: " + name);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public void startEngine() {
        System.out.println("Car " + name + " Model " + model + " year " + year + " Engine has started");
    }

    public static void main(String[] args) {
        Car myCar = new Car("Ford", "4040", 2024);
        System.out.println("");
        Car secondCar = new Car("Toyota", "Camry", 2020);
        myCar.displayCarInfo();
        secondCar.displayCarInfo();
        secondCar.startEngine();
    }
}
