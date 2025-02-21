public class Marketer extends Employee {
    public Marketer(int years) {
        super(years);
    }
    public double getSalary(){
        return 50000.0;
    }

    public void advertise(){
        System.out.println("I am a marketer this is something I would say!");
    }
}
