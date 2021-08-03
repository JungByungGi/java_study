package chapter5;

public abstract class Car {
    public abstract void drive();
    public abstract void stop();
    public void wiper(){}

    public void startCar(){
        System.out.println("시동을 켭니다.");
    };

    public void turnOff(){
        System.out.println("시동을 끕니다.");
    };

    //변하면 안되는 시나리오
    final public void run(){
        startCar();
        drive();
        wiper();
        stop();
        turnOff();
    }
}
