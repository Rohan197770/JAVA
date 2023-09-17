
import java.util.*;
import java.util.Collections;
// import javax.swing.plaf.synth.SynthEditorPaneUI;
public class ArrList {

    public static void main(String args[])
    {
        ArrayList<Integer> list= new ArrayList<Integer>();
        //inserting the element
        list.add(1);
        list.add(3);
        list.add(9);
        list.add(6);
        System.out.println(list);
        // get the element by index
        System.out.println(list.get(2));

        //insert element between
        list.add(2,5);
        System.out.println(list);
        //we have the change the value of element at particular index
        list.set(0,8);

        System.out.println(list);
        // we have remove the element at the particular index or delete
        list.remove(2);
        System.out.println(list);

        //sort
        Collections.sort(list);
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i)+ " ");
        }
        System.out.println("Rohan Rock");
    }
    
}
