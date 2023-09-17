public class wipro2 {
    
    public static void main(String args[])
    {
        String[] input1={"AbC"};

        //yha se start kar
       int n=input1.length;
       int count=2;
       String[] ans =new String[n];
        for(int i=0;i<n;i++)
        {
            String s="";
            int g=count;

            String m=input1[i];
            int x=input1[i].length()-1;
            int y=x/2;
            s=s+m.charAt(0);
            s=s+m.charAt(y);
            s=s+m.charAt(x);
          String f=s;
            while(g>0)
            {
               s=s+f;
               g--;
            }
            ans[i]=s;

        }

        // return ans;

        for(int i=0;i<n;i++)
        {
            System.out.println(ans[i]+",");
        }
    }
}
