public class StudentProgram {

    public static void main(String[] args) {
        Student[] arr = new Student[8];
        arr[0] = new Student("Brad Pitt", 3.52, 10);
        arr[1] = new Student("Taylor Swift", 3.51, 11);
        arr[2] = new Student("Mick Jagger", 1.7, 12);
        arr[3] = new Student("Rhianna", 4.3, 9);
        arr[4] = new Student("Dwayne Johnson", 4.0, 10);
        arr[6] = new Student("Matt Damon", 4.35, 12);
        arr[7] = new Student("Lady Gaga", 2.3, 11);

        // **** uncomment 2 lines below and fill in the code.
        double avg = averageGPA(arr);// call averageGPA method
        System.out.println("The average GPA of all the students is: " + avg);

        System.out.println("The number of students in grade 10 is: " + numStudentsInGrade(arr, 10) + "\n");

        // call printHonorRollStudents
        // *** add code here
        printHonorRollStudents(arr);

        Student topStu = highestGPAStudent(arr);
        System.out.println("\nThe student with the highest gpa is: " + topStu.getName());
    }

    // This method returns the averageGPA of all the students in list1
    public static double averageGPA(Student[] list1) {
        double sum = 0;
        double count = 0;
        for (int x = 0; x < list1.length; x++) {
            if (list1[x] != null) {
                sum += list1[x].getGPA();
                count++;
            }
        }
        double avg = 0;
        if (count != 0) {
            avg = sum / count;
        }
        return avg;
    }

    // This method returns how many students are in the specified grade
    public static int numStudentsInGrade(Student[] list1, int grade) {
        int count = 0;
        for (int x = 0; x < list1.length; x++) {
            if (list1[x] != null && list1[x].getGradeLevel() == grade) {
                count++;
            }
        }
        return count;
    }

    // This method PRINTS the names of Students on the Honor roll - GPA >= 3.5
    public static void printHonorRollStudents(Student[] list1) {

        for (int x = 0; x < list1.length; x++) {
            if (list1[x] != null && list1[x].getGPA() >= 3.5) {
                System.out.println(list1[x].getName());
            }
        }

    }

    // This method returns the Student with the highest GPA
    public static Student highestGPAStudent(Student[] list1) {
        Student highest = null; 
        double compare = 0; 

        for (int x = 0; x < list1.length; x++) {
            if (list1[x] != null && list1[x].getGPA() >= compare) {
                highest = list1[x]; 
                compare = list1[x].getGPA(); 
            }
        }
        return highest; 
    }
}
