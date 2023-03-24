public class HourlyEmployee extends Employee{
    double hourlyPayRate;

    public HourlyEmployee(String name, String birthDay, String hireDate, double hourlyPayRate) {
        super(name, birthDay, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override

    public double collectPay(){
        return 40 * hourlyPayRate;
    }

    public double getDoublePay(){
        return collectPay() * 2;
    }
}
