import java.util.*;
public class Wipro8 {
    
    public static void main(String args[])
    {
        System.out.println("Rohan");
        int[] input1={10,41,18,50,43,31,29,25,59,96,67};
        int input2=11;

        ArrayList<Integer> arr= new ArrayList<>();
        Arrays.sort(input1);
        int sum=0;
        int ans=0;
        for(int i=0;i<input2;i++)
        {
             int flag=0;
             for(int j=2;j<input1[i];j++)
             {
                 if(input1[i]%j==0)
                 {
                     flag++;
                 }
             }
             if(flag==0)
             {
                 arr.add(input1[i]);
             }
             if(i!=input2-1)
             {
             sum=sum+input1[i];
             }
        }
        if(arr.size()==0)
        {
            return sum;
        }
        for(int i=0;i<arr.size()-1;i++)
        {
            ans=ans+arr.get(i);
        }
        return ans;


    }
}
