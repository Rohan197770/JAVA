import java.util.*;
public class Wipro6 {
    
    public static void main(String args[])
    {
         int [] input1={1,2,4,1,2,8};
         int input2=6;
         int mini=-1;
         HashSet<Integer> set= new HashSet<>();

         for(int i=0;i<input2;i++)
         {
             if(input1[i]>0)
             {
             if(set.contains(input1[i]))
             {
                 return input1[i];

             }
             else
             {
                 set.add(input1[i]);
             }
            }
         }

         if(set.isEmpty())
         {
             return 0;
         }

         if(mini==-1)
         {
             return input1[0];
         }


    }
}
