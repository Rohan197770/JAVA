import java.util.ArrayList;

public class Wipro7 {
    public static void main(String args[])
    {
        int[] input1={1,51,436,7860,41236};
        int input2 =5;

        ArrayList<Integer> arr= new ArrayList<>();
        int x=0;
        int y=1;
        
        for(int i=0;i<input2;i++)
        {
           if(input1[i]>=y)
           {
               int m=input1[i];
                 while(m>x)
                 {
                     m=m/10;
                 }
               int last=m%10;
               System.out.println("Digits"+last);
               int g=last*last;
               arr.add(g);
           }
           else
           {
               arr.add(0);
           }
           if(x==0)
           {
               x=10;
           }
           else
           {
               x=x*10;
           }
           y=y*10;
        }
        int sum=0;
        for(int i=0;i<input2;i++)
        {
            System.out.println(arr.get(i));
            sum=sum+arr.get(i);
        }

        System.out.println(sum);
    }
}
