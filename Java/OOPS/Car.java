package Habiba;

public class Car {
    int speed;
    String model;
    void startEngine(){
        System.out.print("Engine started");
    }
    public static void main(String[] args){
        Car myCar = new Car();
        myCar.speed=100;
        myCar.model="Swift";
        myCar.startEngine();
    }
}
