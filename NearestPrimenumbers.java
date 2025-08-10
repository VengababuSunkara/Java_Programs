import java.util.*;
public class Main
{
    static void prime(int n)
    {
        int i,c=0;
        for( i=1;;i++)
        {
            boolean a=isPrime(n+i);
            boolean b=isPrime(n-i);
            if(a==true && b==true)
            {
                System.out.print(n-i);
                System.out.print(n+i);
                break;
            }
            else if(a==true)
            {
                System.out.print(n+i);
                break;
            }
            else if(b==true)
            {
                System.out.print(n-i);
                break;
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
		int n=sc.nextInt();
		prime(n);
	}
}
