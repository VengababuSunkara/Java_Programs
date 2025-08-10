import java.util.*;
public class Main
{
    static void rangePal(int a,int b)
    {
        for(int i=a;i<=b;i++)
        {
            if(ispalin(i))
            {
                System.out.print(i+" ");
            }
        }
    }
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
		int a=sc.nextInt();
		int b=sc.nextInt();
		rangePal(a,b);
	}
}
