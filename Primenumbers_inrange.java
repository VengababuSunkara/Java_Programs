import java.util.*;
public class Main
{
    static void range(int a ,int b)
    {
        for(int i=a;i<=b;i++)
        {
            if(isPrime(i))
            {
                System.out.print(i+" ");
            }
        }
    }
    
    static boolean isPrime(int n)
    {
        if(n<=1 || (n%2==0 &&n!=2))
            return false;
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
	    range(a,b);
	}
}
