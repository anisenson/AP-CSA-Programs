public class LoopsDay1 {
    public static void main(String[] args) {
        //print200to300();
        //printEvensTo1000();
        //sum1to10();
        sumMultiplesOf7();
    }

    public static void print200to300(){
        int x = 200;
        while (x >= 200 && x <= 300){
            System.out.println(x);
            x = x + 1;
        }

    }

    public static void printEvensTo1000(){
        int x = 0;
        while (x >= 0 && x <= 1000){
            System.out.println(x);
            x = x + 2;
        }

    }

    public static void sum1to10(){
        int x = 1;
        int sum = 0;
        while (x <= 10){
            sum += x; 
            x++;
        }
        System.out.println(sum);

    }

    public static void sumMultiplesOf7(){
        int x = 1;
        int sum = 0;
        while (x <= 100){
            sum += x * 7;
            x++;
        }
        System.out.println(sum);

    }
}

