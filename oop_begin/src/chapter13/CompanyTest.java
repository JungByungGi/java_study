package chapter13;

import java.util.Calendar;

public class CompanyTest {
    public static void main(String[] args) {
        Company company1 = Company.getInstance();
        Company company2 = Company.getInstance();

        System.out.println(company1);
        System.out.println(company2); // 같은 메모리 주소를 가짐

        Calendar calendar = Calendar.getInstance();
    }
}
