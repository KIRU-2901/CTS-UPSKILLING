class Car{
    String make;
    String model;
    int year;
    void displayDetails(){
        System.out.println(make);
        System.out.println(model);
        System.out.println(year);
    }
}
public class Classobjcreation {
    public static void main(String[] args){
        Car car1 = new Car();
        car1.make = "Toyota";
        car1.model = "Crysta";
        car1.year = 2021;
        car1.displayDetails();
    }
}
