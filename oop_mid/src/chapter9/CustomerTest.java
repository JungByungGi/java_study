package chapter9;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.buy();
        customer.sell();
        customer.order();
        customer.hello();

        Buy buy = customer; // μμΊμ€ν
        buy.buy();
        buy.order();
    }
}
