// package Java_Assignment;

public class q13 {
    public static void main(String[] args) {
        System.out.print("The summation of natural number upto 100 is ");
        int i = 1 ;
        int count = 0;
        while(i <= 100){
            
            count += i;
            i++;
        }
        System.out.println(count);
        System.out.println("The average of the natiral number upto 100 is "  + (count /100.0));
    }
}
