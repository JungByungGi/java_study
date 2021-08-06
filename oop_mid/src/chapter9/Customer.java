package chapter9;

public class Customer implements Buy, Sell{

    @Override
    public void sell(){
        System.out.println("customer sell");
    }

    @Override
    public void buy(){
        System.out.println("customer buy");
    }

    @Override
    public void order() {
        // Buy, Sell 모두 order 메소드가 있으므로 모호하기 때문에 여기서 재정의를 하거나 어떤 인터페이스의 메소드를 사용할 지 정해야 한다.
        //Buy.super.order();
        System.out.println("customer order");
    }

    public void hello(){
        System.out.println("hello");
    }
}
