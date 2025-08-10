import java.util.*;
public class Main
{
    static void arm(int n)
    {
        int temp=n;
        int c=digit(n);
        int sum=0;
        int p;
        while(n>0)
        {
            int r=n%10;
            p=(int)Math.pow(r,c);
            sum+=p;
            n=n/10;
        }
        if(temp==sum)
            System.out.print(temp+"is armstrong number");
        else
            System.out.print(temp+"is not armstrong number");
    }
    static int digit(int n)
    {
        int c=0;
        while(n>0)
        {
            int r=n%10;
            c++;
            n=n/10;
        }
        return c;
    }
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		arm(n);
		
	}
}
