package chapter9;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.buy();
        customer.sell();
        customer.order();
        customer.hello();

        Buy buy = customer; // 업캐스팅
        buy.buy();
        buy.order();
    }
}
