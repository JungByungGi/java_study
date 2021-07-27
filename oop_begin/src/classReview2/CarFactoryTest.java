package classReview2;

public class CarFactoryTest {
    public static void main(String[] args) {
        Factory factory = Factory.getInstance();
        Car mySonata = factory.createCar();

        System.out.println(mySonata.getCarNum());
    }
}
