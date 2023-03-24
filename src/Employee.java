public class Employee extends Worker{
    private long employeedId;
    private String hireDate;

    private  static  int employeeNo = 1;

    public Employee(String name, String birthDay, String hireDate) {
        super(name, birthDay);
        this.employeedId = Employee.employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeed=" + employeedId +
                ", hireDate='" + hireDate + '\'' +
                '}';
    }
}
