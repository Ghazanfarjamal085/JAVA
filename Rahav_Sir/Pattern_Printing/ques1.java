// import java.util.Scanner;

// public class ques1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of rows:   ");
//         int rows = sc.nextInt();
//         System.out.print("Enter number of columns:   ");
//         int columns = sc.nextInt();
//         for (int i = 1; i <= rows; i++) {
//             for (int j = 1; j <= columns; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println(" ");
//         }
//     }
// }

// import java.util.Scanner;

// public class ques1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of rows:   ");
//         int rows = sc.nextInt();
//         System.out.print("Enter number of columns:   ");
//         int columns = sc.nextInt();
//         for (int i = 1; i <= rows; i++) {
//             for (int j = 1; j <= columns; j++) {
//                 System.out.print(j + " ");
//             }
//             System.out.println(" ");
//         }
//     }
// }

// import java.util.Scanner;

// public class ques1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of rows:   ");
//         int rows = sc.nextInt();
//         // System.out.print("Enter number of columns: ");
//         // int columns = sc.nextInt();
//         for (int i = 1; i <= rows; i++) {
//             for (int j = 1; j <= rows; j++) {
//                 System.out.print((char) (j + 64) + " ");
//             }
//             System.out.println(" ");
//         }
//     }
// }

// import java.util.Scanner;
// public class ques1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of rows:   ");
//         int rows = sc.nextInt();
//         for (int i = 1; i <= rows; i++) {
//             for (int j = 1; j <= rows; j++) {
//                 System.out.print(i + " ");
//             }
//             System.out.println(" ");
//         }
//     }
// }

// import java.util.Scanner;

// public class ques1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of rows:   ");
//         int rows = sc.nextInt();
//         for (int i = 1; i <= rows; i++) {
//             for (int j = 1; j <= rows; j++) {
//                 System.out.print((char) (i + 64) + " ");
//             }
//             System.out.println(" ");
//         }
//     }
// }

import java.util.Scanner;
public class ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows:   ");
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (j <= i) {
                    System.out.print("* ");
                }
            }
            System.out.println(" ");
        }
    }
}



// import java.util.Scanner;
// public class ques1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of rows:   ");
//         int rows = sc.nextInt();
//         for (int i = 1; i <= rows; i++) {
//             for (int j = 1; j <= rows; j++) {
//                 if (j <= i) {
//                     System.out.print(j + " ");
//                 }
//             }
//             System.out.println(" ");
//         }
//     }
// }

// import java.util.Scanner;
// public class ques1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of rows:   ");
//         int rows = sc.nextInt();
//         for (int i = 1; i <= rows; i++) {
//             for (int j = 1; j <= rows; j++) {
//                 if (j <= i) {
//                     System.out.print( (char) (j + 64) + " ");
//                 }
//             }
//             System.out.println(" ");
//         }
//     }
// }

// import java.util.Scanner;
// public class ques1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of rows:   ");
//         int rows = sc.nextInt();
//         for (int i = 1; i <= rows; i++) {
//             for (int j = 1; j <= rows; j++) {
//                 if (j <= i) {
//                     System.out.print( (char) (i + 64) + " ");
//                 }
//             }
//             System.out.println(" ");
//         }
//     }
// }

// import java.util.Scanner;
// public class ques1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of rows:   ");
//         int rows = sc.nextInt();
//         for (int i = 1; i <= rows; i++) {
//             for (int j = 1; j <= i; j++) {
//                 if (i % 2 == 0) {
//                     if (j <= i) {
//                         System.out.print((char) (j + 64) + " ");
//                     }
//                 }
//                    else{
//                     if (i % 2 != 0){
//                         System.out.print(j + " ");
//                     }
//                 }
//             }
//             System.out.println(" ");
//         }
//     }
// }

import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows:   ");
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (i <= j) {
                    System.out.print("* ");
                }
            }
            System.out.println(" ");
        }
    }
}