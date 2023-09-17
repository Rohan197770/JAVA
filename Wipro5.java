import java.util.*;
public class Wipro5 {

    public static void main(String args[])
    {
        String input1="zx.za.ee";
        String ans="";
        for(int i=0;i<=input1.length()-2;i=i+3)
        {
            char f=input1.charAt(i);
            char l=input1.charAt(i+1);

            if(f==l)
            {
                
                ans=ans+f;
            }
            else
            {
                int x=f-l;
                char ch='A';
                while(x!=1)
                {
                   ch++;
                   x--;
                }
                 ans=ans+ch;

            }
        }
    
        String ans2= ans.toUpperCase();
        // return ans2;
        System.out.println(ans2);
    }
    
}
