package patternprogram;

public class Pattern {
    public static void main(String[] args) {
         
        int i, j, n = 5;       
        //Outer loop work for rows  
        for (i=1; i<=n; i++)   
        {  
        //inner loop work for space      
        for (j=1; j<=n-i; j++)   
        {  
        //prints space between two stars  
        System.out.print(" ");   
        }   
        //inner loop for columns  
        for (j=1; j<=i; j++ )   
        {   
        //prints star      
        System.out.print("* ");   
        }   
        //throws the cursor in a new line after printing each line  
        System.out.println();   
        }   

    }



}
