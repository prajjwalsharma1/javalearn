package javaNumber;

public class Automorphicnumber {
    public static void main(String[] args) {
        int n=5;


        int temp=n;
int sq= n*n;
int count=0;

        while(temp!=0)
        {
count=count+1;
temp=temp/10;
        }
if(n==sq%Math.pow(10,count))
System.out.println("true");
else 
System.out.println(false);




    }




}
