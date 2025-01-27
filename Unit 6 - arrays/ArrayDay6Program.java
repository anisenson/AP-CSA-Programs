public class ArrayDay6Program {
    public static void main(String[] args) {
  
      // Create an array to hold 5 Strings, called nameArr. 
      // Initialize the 5 Strings to someone's name
      String[] nameArr = {"Adam", "Dan", "Jacob", "Jack", "Sandeep"};
  
      // Write a loop to print out each String, its length
      for(int x = 0; x < nameArr.length; x++){
        System.out.println(nameArr[x] + nameArr[x].length());
      }
      // and the last two characters in the String
      
  
      // call the method avgStringLength to find the average String length
      // of animalArr
      String[] animalArr = { "ferret", "cat", "horse", "raccoon" };
      
      double avg = avgStringLength(animalArr);
       System.out.println("average string length is: " + avg);
    }
  
    public static double avgStringLength(String[] arr) {
      // fill in this method
        double sum = 0;
        int count = 0;
        for(String animal : arr) {
            sum += animal.length();
            count++;
        }
        return sum / count;
  
    }
  }