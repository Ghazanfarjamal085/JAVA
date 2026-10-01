import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        // System.out.print("Enter a number :    ");
        // Scanner sc = new Scanner(System.in);
        // double  num = sc.nextDouble();



        // if (num > 0){
        //     System.out.println("Positive");
        // }
        // else if (num < 0){
        //     System.out.println("Negative");
        // }
        // else{
        //     System.out.println("Neither negative nor positive ");
        // }



        // if ( num % 2==0){
        //     System.out.println("Even ");
        // }
        // else{
        //     System.out.println("odd");
        // }



        // if (num % 5 == 0){
        //     System.out.println("yes dividsible by 5 ");
        // }
        // else{
        //     System.out.println("no not divisible by 5 ");
        // }




        // if (num > 0 ){
        //     System.out.println(num);
        // }
        // else{
        //     System.out.println(-(num));
        // }



        // double result = num - (int) num;
        // if (result == 0){
        //     System.out.println("Integer number");
        // }
        // else{
        //     System.out.println("not an integer number ");
        // }



        // if (num = Math.floor(num)){
        //     System.out.println("integer ");
        // }
        // else{
        //     System.out.println("Not an integer");
        // }



        // System.out.print("Enter selling price :   ");
        // Scanner sp = new Scanner(System.in);
        // double selling_price = sp.nextDouble();
        // System.out.print("Enter cost price :   ");
        // sc.close();
        // double cost_price = sp . nextDouble();
        // double price = selling_price - cost_price;
        // if (price > 0){
        //     System.out.println("Profit " + price);
        // }
        // else if (price < 0){
        //     System.out.println("Loss " + -price);
        // }
        // else{
        //     System.out.println("Neither profit nor loss " + price);
        // }


        // System.out.print("Enter a number :    ");
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // if ( num % 5 == 0 && num % 3 == 0){
        //     System.out.println("Number is divisble by both 5 as well as 3 ");
        // }
        // else if ( num % 3 == 0){
        //     System.out.println("Divisble by 3");
        // }
        // else if ( num % 5 == 0){
        //     System.out.println("Divisble by 5");
        // }
        // else{
        //     System.out.println("neither with 5 nor with 3 ");
        // }


        // System.out.print("Enter a number :   ");
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // if (( num > 999 && num < 10000)|| (num > -10000 && num < -999) ){
        //     System.out.println("4 digits numbers ");
        // }
        // else{
        //     System.out.println(" not a 4 digits numbers ");
        // }



        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter side1:    ");
        // int side1 = sc.nextInt();
        // System.out.print("Enter side2:    ");
        // int side2 = sc.nextInt();
        // System.out.print("Enter side3:    ");
        // int side3 = sc.nextInt();
        // if((side1 + side2  > side3) && (side2 + side3  > side1) && (side3 + side1 > side2)){
        //     System.out.println("Yes they are the sides of the triangles ");
        // }
        // else{
        //     System.out.println("No they are not the sides of the traingles ");
        // }




        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter num1: ");
        // double num1 = sc.nextDouble();
        // System.out.print("Enter num1: ");
        // double num2 = sc.nextDouble();
        // if ( num1 > 0 && num2 > 0 ){
        //     System.out.println("1");
        // }
        // else if ( num1 < 0 && num2 > 0 ){
        //     System.out.println("2");
        // }
        //  else if (num1 < 0 && num2 < 0 ){
        //     System.out.println("3");
        // }
        // else{
        //     System.out.println("4");
        // }





        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1; ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2; ");
        int num2 = sc.nextInt();
        System.out.print("Enter num3; ");
        int num3 = sc.nextInt();
        if ((num1 > num2) && (num1 > num3)){
            System.out.println("Num1 is the largest here "+ " " + num1);
        }
        else if (num2 > num3){
            System.out.println("Num2 is the largest here "+ " " + num2);
        }
        else {
            System.out.println("Num3 is the largest here "+ " " + num3);
        }
    }
}
