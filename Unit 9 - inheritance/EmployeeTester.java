public class EmployeeTester {

    public static void main(String[] args) {
        System.out.print("Employee: ");
        Employee sally = new Employee(3);
        System.out.print(sally.getHours() + ", ");
        System.out.printf("$%.2f, ", sally.getSalary());
        System.out.print(sally.getVacationDays() + ", ");
        System.out.println(sally.getVacationForm());

        System.out.println("");

        System.out.print("Secretary: ");
        Secretary pat = new Secretary(5);
        System.out.print(pat.getHours() + ", ");
        System.out.printf("$%.2f, ", pat.getSalary());
        System.out.print(pat.getVacationDays() + ", ");
        System.out.println(pat.getVacationForm());
        pat.takeDictation("hello");

        System.out.println("");

        System.out.print("Lawyer: ");
        Lawyer kelly = new Lawyer(4);
        System.out.print(kelly.getHours() + ", ");
        System.out.printf("$%.2f, ", kelly.getSalary());
        System.out.print(kelly.getVacationDays() + ", ");
        System.out.println(kelly.getVacationForm());
        kelly.sue();

        System.out.println("");

        System.out.print("Marketer: ");
        Marketer dan = new Marketer(2);
        System.out.print(dan.getHours() + ", ");
        System.out.printf("$%.2f, ", dan.getSalary());
        System.out.print(dan.getVacationDays() + ", ");
        System.out.println(dan.getVacationForm());
        dan.advertise();

        System.out.println("");

        System.out.print("Legal Secretary: ");
        LegalSecretary sam = new LegalSecretary();
        System.out.print(sam.getHours() + ", ");
        System.out.printf("$%.2f, ", sam.getSalary());
        System.out.print(sam.getVacationDays() + ", ");
        System.out.println(sam.getVacationForm());
        sam.takeDictation("This letter is to inform you");
        sam.fileLegalBriefs();
    }

}