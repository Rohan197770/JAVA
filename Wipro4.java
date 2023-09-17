import java.util.*;
public class Wipro4 {

    public static void main(String args[])
    {
        int input1=3521;
        int input2=2452;
        int input3=1352;

        while(input1>10)
        {
            input1=input1/10;
        
        }
        int thou= input1%10;

        while(input2>100)
        {
            input2=input2/10;
        }
        int hun=input2%10;

        int maxi=0;
        while(input3>0)
        {
            int m=input3%10;
            if(m>maxi)
            {
                maxi=m;
            }
            input3=input3/10;
        }

        int x= thou*hun;
        x=x-maxi;
        // return x;
        System.out.println(x);
    }
    
}
