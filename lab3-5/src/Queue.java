import java.io.FileNotFoundException;

public class Queue extends Spis
{
    void push(Elem el)
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
    public static void main(String[] args) throws FileNotFoundException
    {
        Queue qu = new Queue();
        qu.init("input.txt");
        qu.print();
        System.out.println("\n");
        qu.pop();
        qu.print();
        System.out.println("\n");
        System.out.println(qu.count);
        System.out.println(qu.empty());
        qu.erase();
        System.out.println(qu.empty());
    }
}
