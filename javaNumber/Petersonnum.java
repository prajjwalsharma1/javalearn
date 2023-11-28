package javaNumber;

public class Petersonnum {
    static int fact(int g)
    {
if(g==0)
return 1;
else
return g*fact(g-1);
    }

    public static void main(String[] args) {
        int n=15;
        int temp=n;
        int sum=0;

        while(n!=0)
        {
        sum=sum + fact(n%10);
        n=n/10;

        }

if(temp==sum)
System.out.println(true);
else
System.out.println(false);

        }
    }