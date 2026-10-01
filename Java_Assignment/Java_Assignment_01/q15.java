public class q15 {
    public static void main(String[] args) {

        int i = 1;
        int sum = 0;

        do {
            sum += i;
            i++;
        } while (i <= 100);

        double average = sum / 100.0;

        System.out.println("The sum of natural numbers upto 100 is " + sum);
        System.out.println("The average of natural numbers upto 100 is " + average);
    }
}
