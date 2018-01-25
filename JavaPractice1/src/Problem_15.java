/*
 Write a program in Java to make such a pattern like a pyramid with a number which will repeat the number in the same row
 */
public class Problem_15 {
    
    public static void main (String [] args){
        
        for(int i = 1; i <= 10 ; i++)
        {
            for(int j = 1 ; j <= i ; j++)
                System.out.print(i);
            
            System.out.println(" ");
        }
    }
}
