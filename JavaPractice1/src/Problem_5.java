
import java.util.Scanner;

/*
 Write a Java program that takes two numbers as input and display the product of two numbers
 */
public class Problem_5 {
    
    public static void main (String [] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter first number: ");
        int a = sc.nextInt();
        
        System.out.println("Please enter second number: ");
        int b = sc.nextInt();
        
        System.out.println("The sum of " + a + " and " + b + " is: " + (a * b) );
    }
}
