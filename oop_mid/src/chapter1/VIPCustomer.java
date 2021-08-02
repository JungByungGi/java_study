package chapter1;

public class VIPCustomer extends Customer{
    double salesRatio;
    private String agentID;

    public VIPCustomer(){
        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;

        System.out.println("VIPCustomer() call"); // 하위 클래스의 생성자에서 컴파일러가 상위 클래스의 생성자 호출
    }

    public String getAgentID(){
        return agentID;
    }
}
