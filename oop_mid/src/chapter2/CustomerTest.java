package chapter2;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerJung = new Customer();
        customerJung.setCustomerName("정병기");
        customerJung.setCustomerID(10040);
        customerJung.bonusPoint  = 1500;
        int price = customerJung.calcPrice(1000);
        System.out.println(customerJung.showCustomerInfo() + price);

        VIPCustomer customerKim = new VIPCustomer();
        customerKim.setCustomerName("김유신");
        customerKim.setCustomerID(10020);
        customerKim.bonusPoint = 10000;
        price = customerKim.calcPrice(1000);
        System.out.println(customerKim.showCustomerInfo() + price);

        Customer vc = new VIPCustomer(); // vc는 customer의 메소드,  멤버변수만 사용 가능
        vc.setCustomerName("noname");
        vc.setCustomerID(12345);
        System.out.println(vc.calcPrice(1000)); // 가상 함수, 실제 인스턴스의 메소드가 호출
    }
}
