
package javaNumber;
public class Gcd {

    

    public static void main(String[] args) {
        
int a=35;
int b=7;
int galg=0;
for(int i=Math.min(a,b);i>0;i--)
{
if(Math.max(a,b)%i==0)
{ 
    galg=i;
break;

}



}

if(galg==0)
System.err.println(1);
else
System.out.println("the gcd is :"+galg);


    }
}

