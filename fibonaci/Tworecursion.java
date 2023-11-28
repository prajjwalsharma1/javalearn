package fibonaci;

public class Tworecursion {
static int a=0;
static int b=0;
static int  fibo(int g)
{
if(g==1)
return 0;
if (g==2)
return 1;
return fibo(g-1)+fibo(g-2);



 
}

    public static void main(String[] args) {
        int n=5;

        

        for(int i=1;i<=n;i++)

        System.out.print(" "+fibo(i));
    }
}
