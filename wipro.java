 import java.util.*;

import javax.sound.midi.SysexMessage;
public class wipro {
    
   
    public static void main(String args[])
    {
         String input1;
         Scanner sk= new Scanner(System.in);
         input1=sk.next();
         System.out.println(input1);
         String op="";
         ArrayList<Integer> arr= new ArrayList<>();

         for(int i=0;i<input1.length();i++)
         {
             char ch= input1.charAt(i);
             if(ch>='0' && ch<='9')
             {
                 arr.add(ch-'0');
             }
             if(ch=='-' || ch=='+' || ch=='*' || ch=='/')
             {
                 op=op+ch;
             }
         }
         int i=1;
         int j=2;
         int x=arr.get(0);
         int y=arr.get(1);
         int sum=0;
            if(op.charAt(0)=='+')
             {
                 sum=x+y;
             }
             if(op.charAt(0)=='*')
             {
                 sum= x*y;
             }
             if(op.charAt(0)=='-')
             {
                 sum= x-y;
             }
             if(op.charAt(0)=='/')
             {
                 sum= x/y;
             }
        //  int j=0;
         while(i<op.length())
         {
    
            int n=arr.get(j);
            j++;
             if(op.charAt(i)=='+')
             {
                 sum= sum+n;
             }
             if(op.charAt(i)=='*')
             {
                 sum= sum*n;
             }
             if(op.charAt(i)=='-')
             {
                 sum= sum-n;
             }
             if(op.charAt(i)=='/')
             {
                 sum= sum/n;
             }
             i++;

         }
         System.out.println(sum);




    }
}
    