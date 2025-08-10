import java.util.*;
public class Main
{
    static boolean ispalin(int n)
    {
        int temp=n,rev=0;
        while(n>0)
        {
            int r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        return rev==temp;
        
    }
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(ispalin(n));
	}
}
