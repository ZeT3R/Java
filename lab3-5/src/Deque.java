import java.io.FileNotFoundException;

public class Deque extends Spis
{
    void push_end(Elem el)
    {
        count++;
        if(head==null)
        {
            head=el;
            return;
        }
        Elem temp=head;
        while(temp.next!=null)
            temp=temp.next;
        temp.next=el;
    }
    void pop_end()
    {
        if(head==null)
        {
            return;
        }
        count--;
        if (head.next==null)
        {
            head=null;
        }
        Elem temp = head.next;
        while(temp.next.next!=null)
        {
            temp = temp.next;
        }
        temp.next=null;
    }
    public static void main(String[] args) throws FileNotFoundException
    {
        Deque dq = new Deque();
        dq.init("input.txt");
        dq.print();
        System.out.println("\n");
        dq.pop();
        dq.print();
        System.out.println("\n");
        dq.pop_end();
        dq.print();
        System.out.println("\n");
        //sp.push_end(new Elem(new Node("Иванов", "Иван", "5")));
        dq.print();
        System.out.println("\n");
        System.out.println(dq.count);
        System.out.println(dq.empty());
        dq.erase();
        System.out.println(dq.empty());
        //super.push(el);
    }
}
