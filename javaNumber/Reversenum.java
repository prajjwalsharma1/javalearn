package javaNumber;

public class Reversenum {
 
static int a=13342;
   
public static void main(String[] args) {
int rev=0;

    while(a!=0)
    {

rev=rev*10+ a%10;
a=a/10;


    }


    System.err.println(rev);

}




}
