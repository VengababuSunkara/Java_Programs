import java.util.*;
class Main
{
    static int reverse(int n)
    {
        int temp=n;
        int rev=0;
        while(n>0)
        {
            int r=n%10;
            rev=rev*10+r;
            n/=10;
        }
        return rev;
    }
    static boolean adam(int n)
    {
        if(n<0)
        {
            System.out.print("Invalid Input");
        }
        int squ=n*n;
        int revers=reverse(n);
        int squRev=revers*revers;
        int re=reverse(squRev);
        return squ==re;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(adam(n))
        {
            System.out.print("Adam Number");
        }
        else if(n>=0)
        {
            System.out.print("Not an Adam Number");
        }
    }
}   
