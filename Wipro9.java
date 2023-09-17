import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
public class Wipro9 {

    
    public static void main(String args[])
    {
        int[] input1={12,2,36,10,217,36,5,36,15,10};
        int input2=10;


        Map<Integer, Integer> hp =new TreeMap<Integer, Integer>();

        for(int i=0;i<input2;i++)
        {
            int key = input1[i];
            if(hp.containsKey(key))
            {
                int freq = hp.get(key);
                freq++;
                hp.put(key, freq);
            }
            else
            {
                hp.put(key, 1);
            }
        }

        Arrays.sort(input1);
        int val=1;
        int ans=input1[0];
        for(int i=0;i<input2;i++)
        {
            if(val<=hp.get(input1[i]))
            {
                val=hp.get(input1[i]);
                ans=input1[i];
            }
        }
        int ans2=input1[0];
        int val2=1;
        for(int i=0;i<input2;i++)
        {
            if(val2<=hp.get(input1[i])  && input1[i]!=ans)
            {
                val2=hp.get(input1[i]);
                ans2=input1[i];
            }
        }
        int val3=1;
        int ans3=input1[0];
        for(int i=input2-1;i>=0;i--)
        {
            if(val3>=hp.get(input1[i]))
            {
                val3=hp.get(input1[i]);
                ans3=input1[i];
            }
        }


        // String s1= Integer.toString(ans);
        // String s2= Integer.toString(ans2);
        // String s3= Integer.toString(ans3);

        // String result=s1+s2;
        // result=result+s3;
        // int res= Integer.parseInt(result);

        String s1 = "Hello";

        String s2 = new String(s1);
    
        System.out.println(s1==s2);

    	
    }
    
}
