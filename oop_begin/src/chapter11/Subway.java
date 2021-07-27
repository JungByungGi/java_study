package chapter11;

public class Subway {
    int SubNum;
    int passengerCnt;
    int money;

    public Subway(int SubNum){
        this.SubNum = SubNum;
    }

    public void take(int money){
        this.money += money;
        passengerCnt++;
    }

    public void showSubwayInfo(){
        System.out.println(SubNum + "번의 승객 수는 " + passengerCnt + "명이고, 수입은 " + money + "원 입니다.");
    }
}
