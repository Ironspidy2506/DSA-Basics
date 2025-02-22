import java.util.*;

// Question 2 - Print if a number is prime or not (Input n from the user). 

public class Question_2 {
    private static boolean checkPrime(int n) {
        if(n < 2) return false;
    
        int cnt = 0;
        for (int i = 1; i * i <= n; i++) {
            if(n % i == 0) {
                cnt++; 
                if(n / i != i) {
                    cnt++;
                }
            }
        }

        return cnt == 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        boolean flag = checkPrime(n);
        System.out.println(flag);

        sc.close();
    }
}
