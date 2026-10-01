import java.util.Scanner;

public class profit_loss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter selling Price :   ");
        double selling_price = sc.nextDouble();
        System.out.println("Enter cost price:   ");
        double cost_price = sc.nextDouble();
        // double cost_price = sc.nextDouble();
        if ((selling_price - cost_price) < 0) {
            System.out.println("The seller made a loss of and the percentage of loss is "
                    + -((selling_price - cost_price) + ((cost_price - selling_price) / cost_price)) * 100);
        } else if ((selling_price - cost_price) == 0) {
            System.out.println("The seller doesnt gain not loss ");
        } else {
            System.out.println("seller made a profit of " + (selling_price - cost_price));
        }
    }
}
