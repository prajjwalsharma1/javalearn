package Javapalin;

public class Javapalin {
    public static void main(String[] args) {
    int n=2222;
    int rev =0;
    int temp=n;
    while(temp>0){
int rem=n%10;
rev=rev*10+rem;
temp=temp/10;

    }

if(n==rev)
System.err.println("it is polin");
else
System.out.print("it is not ");
    }
}
