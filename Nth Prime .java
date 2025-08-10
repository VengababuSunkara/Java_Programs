import java.util.*;
public class Main
{
    static void prime(int n)
    {
        int i,c=0;
        for( i=2;;i++)
        {
            boolean a=isPrime(i);
            if(a==true)
            {
                    c++;
                    if(c==n)
                    {
                        System.out.print(i);
                        break;
                    }
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
