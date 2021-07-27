package chapter12;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employeeHong = new Employee();
        employeeHong.setEmployeeName("홍길동");

        System.out.println(employeeHong.getSerialNum());

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("김길동");

        System.out.println(employeeHong.getEmployeeName()+ "님의 사번은 " + employeeHong.getEmployeeId());
        System.out.println(employeeKim.getEmployeeName() + "님의 사번은 " + employeeKim.getEmployeeId()); // 두 개의 인스턴스가 하나의 메모리 공유
    }
}
