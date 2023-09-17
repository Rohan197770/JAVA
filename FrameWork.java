import java.util.*;

// import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;
public class FrameWork {
    public static void main(String args[])
    {
        //  Stack<Integer> st= new Stack<Integer>();
        //  st.push(3);
        //  st.push(4);
        //  st.push(1);

        //  System.out.println(st);
        //  st.pop();
        //  System.out.println(st);
        //  System.out.println(st.peek());

        //  Queue<Integer> queue = new LinkedList<>();
        //  queue.add(5);
        //  queue.add(6);
        //  queue.add(7);
         
        //  System.out.println(queue);
        //  queue.remove();
        //  System.out.println(queue);
        //  System.out.println(queue.peek());
        //  System.out.println(queue.poll());

        List<Integer> arr= new ArrayList<>();
        arr.add(54);
        arr.add(98);
        arr.add(1);

        System.out.println(arr);
        Collections.reverse(arr);
        System.out.println(arr);

    }
}
