package fibonaci;

class Recursionfibo{
static int a=0;
static int b=1;


public static void fibo(int g)
{
if(g==0)
return ;
int c=a+b;
System.out.print(" "+c);

a=b;
b=c;
fibo(g-1);






}
public static void main(String[] args) {
 
int n=6;

System.out.print(a+ " "+b);
fibo(n-2);

}

 
    
}