import java.util.*;

public class HashMaps {

    public static void main(String args[])
    {
        // System.out.println("Rohan");
        String str1="accept Van";
        int count=0;
        boolean flag=true;
        for(int i=0;i<str1.length();i++)
        {
            // String ans ="";
             flag=true;
            while(i<str1.length()-1 && str1.charAt(i)!=' ')
            {
                int f= str1.charAt(i);
                int l= str1.charAt(i+1);
                if(f>=l)
                {
                    flag=false;
                }
                i++;

            }
            if(flag==true)
            {
                count++;
            }
        }

           if(flag==true)
            {
                count++;
            }

        // System.out.println(count);

        // return count;
   int variable1=0;
   int variable2=3;
        if((variable1=10)>variable2)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("fals");
        }


    }
    
}
