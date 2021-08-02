package chapter2;

public class VIPCustomer extends Customer {
    double salesRatio;
    private String agentID;

    public VIPCustomer(){
        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;

        System.out.println("VIPCustomer() call"); // 하위 클래스의 생성자에서 컴파일러가 상위 클래스의 생성자 호출
    }

    @Override // 메소드 재정의
    public int calcPrice(int price){
        bonusPoint += price * bonusRatio;
        price -= (int)(price*salesRatio);
        return price;
    }

    public String getAgentID(){
        return agentID;
    }
}
