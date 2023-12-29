import java.io.FileNotFoundException;

public class Stack extends Spis
{
   // Stack()
   // {
   //     System.out.print("Stack\n");
   // }
    public static void main(String[] args) throws FileNotFoundException
    {
        Stack st = new Stack();
        st.init("input.txt");
        st.print();
        System.out.println("\n");
        st.pop();
        st.print();
        System.out.println("\n");
        System.out.println(st.count);
        System.out.println(st.empty());
        st.erase();
        System.out.println(st.empty());
        //Stack st2=new (Stack)sp;

    }
}

