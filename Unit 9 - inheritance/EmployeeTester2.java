public class EmployeeTester2 {

	public static void main(String[] args) {
		System.out.print("Employee: ");
		Employee sally = new Employee(4);
		System.out.print(sally.getHours() + ", ");
		System.out.printf("$%.2f, ", sally.getSalary());
		System.out.print(sally.getVacationDays() + ", ");
		System.out.println(sally.getVacationForm());
		
		System.out.print("Secretary: ");
		Secretary pat = new Secretary();
		System.out.print(pat.getHours() + ", ");
		System.out.printf("$%.2f, ", pat.getSalary());
		System.out.print(pat.getVacationDays() + ", ");
		System.out.println(pat.getVacationForm());
		pat.takeDictation("hello");


             // **** Create Marketer instance and call methods on it

		System.out.print("Lawyer: ");
		Lawyer kelly = new Lawyer(3);
		System.out.print(kelly.getHours() + ", ");
		System.out.printf("$%.2f, ", kelly.getSalary());
		System.out.print(kelly.getVacationDays() + ", ");
		System.out.println(kelly.getVacationForm());
		kelly.sue();
		
		System.out.print("Legal Secretary: ");
		LegalSecretary sam = new LegalSecretary();
		System.out.print(sam.getHours() + ", ");
		System.out.printf("$%.2f, ", sam.getSalary());
		System.out.print(sam.getVacationDays() + ", ");
		System.out.println(sam.getVacationForm());
		sam.takeDictation("Happy 2017!");
		sam.fileLegalBriefs();

	}

}