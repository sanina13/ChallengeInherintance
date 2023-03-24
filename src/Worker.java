import java.time.Year;

public class Worker {
    private String name;
    private String birthDay;
    protected String endDate;

    public Worker(){

    }

    public Worker(String name, String birthDay) {
        this.name = name;
        this.birthDay = birthDay;
    }

    public int getAge(){
        String[] nova = this.birthDay.split("/");
        int year = Year.now().getValue();
        return year - Integer.parseInt(nova[2]);
    }

    public double collectPay(){
        return 0.0;
    }

    public void terminate(String endDate){
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
