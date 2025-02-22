import java.util.*;

// Question 1 - Print all even numbers till n. 

public class Question_1 {
    private static void printEvenNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        printEvenNumbers(n);

        sc.close();
    }
}
