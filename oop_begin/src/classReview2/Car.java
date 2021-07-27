package classReview2;

public class Car {
    private static int carNum = 10000;
    private int carId;

    public Car(){
        carNum++;
        carId = carNum;
    }

    public static int getCarNum() {
        return carNum;
    }
}
