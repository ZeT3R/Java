import java.io.FileNotFoundException;
public class ClassQD extends Spis
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
}
