public class Lawyer extends Employee {
   
    public double getSalary() {
        return super.getSalary() + 5000 * getYears();
    }

    public Lawyer(int years){
        super(years);
    }

    public String getVacationForm(){
        return "pink";
    }

    public int getVacationDays() {
        return 15;
    }

    public void sue() {
        System.out.println("I'll see you in court!");
    }
}
