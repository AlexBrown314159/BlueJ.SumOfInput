import java.util.Scanner;

/**
 * Created by Alex Brown on 23-May-2019.
 * Sum of integers from 1 to n.
 */
public class Main {

    public static void main(String[] args){
 
        Scanner sc = new Scanner(System.in);
        
        int n = 0;
        long total = 0; // n can be as large as 1,000,000,000.
     
        System.out.println("Sum of Numbers from 1 to n");
        System.out.print("Input n: ");
        n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
           total += i;
        }
        
        System.out.println("The sum of the integers from 1 to " + n + " is " + total);
   
    }
}
