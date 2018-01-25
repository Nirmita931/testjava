/*
 Write a program in Java to make such a pattern like right angle triangle with number increased by 1
 */
public class Problem_14 {
    
    public static void main (String [] args){
        int n=1;
        for(int i = 1 ; i <= 5 ; i++)
        {
            for(int j = 1 ; j <= i ; j++)
                System.out.print(n++);
            
            System.out.println("");
        }
    }
}
