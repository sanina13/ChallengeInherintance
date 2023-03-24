public class Main {
    public static void main(String[] args) {
        Employee julio = new Employee("julio", "12/11/2001", "01/01/2020");
        System.out.println(julio);
        System.out.println("Age = " + julio.getAge());
        System.out.println("Pay = " + julio.collectPay());

        SalariedEmployee maria = new SalariedEmployee("maria", "12/03/1999", "04/03/2024", 350000);
        System.out.println(maria);
        System.out.println("Age = " + maria.getAge());
        System.out.println("Pay = " + maria.collectPay());
        maria.retire();
        System.out.println(maria.collectPay());

        HourlyEmployee liz = new HourlyEmployee("Liz", "12/02/1996", "12/12/2016", 20);
        System.out.println(liz.collectPay());
        System.out.println(liz.getDoublePay());
        System.out.println(liz.getAge());
    }
}