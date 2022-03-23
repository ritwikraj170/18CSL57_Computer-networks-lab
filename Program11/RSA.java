import java.util.*;
import java.io.*;

public class RSA 
{

    public static int mul(int x, int y, int n)
    {
        int k=1,j;
        for(j=1;j<=y;j++)
            k=(k*x)%n;
        return k;
    }
    
    public static void main(String[] args)
    {
        String msg;
        int pt[]=new int[100];
        int ct[]=new int[100];
        int n, d, e, p, q,i;
        Scanner read=new Scanner(System.in);
        System.out.println("enter the message to encrypt:");
        msg=read.next();
        for(i=0;i<msg.length();i++)
           pt[i]=msg.charAt(i);
              n=253;d=17;e=13;
        System.out.println("\n cipher text is=");
        for(i=0;i<msg.length();i++)
            ct[i]=mul(pt[i],e,n);
        for(i=0;i<msg.length();i++)
             System.out.print(" "+ ct[i]);
        for(i=0;i<msg.length();i++)
            pt[i]=mul(ct[i],d,n);
        System.out.println("\ndecrypted message is= ");
        for(i=0;i<msg.length();i++)
            System.out.print("    "+(char)pt[i]);
        
    }
    
}
