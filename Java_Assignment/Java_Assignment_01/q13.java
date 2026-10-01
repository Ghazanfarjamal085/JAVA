// package Java_Assignment;

// public class q13 {
//     public static void main(String[] args) {
        
//     }
// }


public class q13 {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i;
        }

        double average = sum / 100.0;

        System.out.println("The sum of natural numbers upto 100 is " + sum);
        System.out.println("The average of natural numbers upto 100 is " + average);
    }
}