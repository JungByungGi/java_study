package chapter12;

public class Employee {
    private static int serialNum = 1000;

    private int employeeId;
    private String employeeName;

    public Employee(){
        serialNum++;
        employeeId = serialNum;
    }

    // 외부에서 값을 바꾸면 안되므로 set만(read-only)
    public static int getSerialNum() {
        return serialNum;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDeployment() {
        return deployment;
    }

    public void setDeployment(String deployment) {
        this.deployment = deployment;
    }

    private String deployment;


}
