/*
 Write a Java program to swap two variables
 */
public class Problem_9 {
    
    public static void main(String[] args) {
        
        int m = 20, n = 30, num;
        
        System.out.println("Before swapping the variables : m, n = " + m + ", " + n);
        
        num = m;
        m = n;
        n = num;   
        
        System.out.println("After swapping the variables: m, n = " + m + ", " + n);
    }
}
