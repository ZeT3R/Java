import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class Spis
{
    Elem head;
    int count;

    Spis()
    {
        head = null;
        count = 0;
    }

    void push(Elem el)
    {
        el.next = head;
        head = el;
        count++;
    }
    Elem pop()
    {
        Elem temp = head;
        if(head!=null)
        {
            head = head.next;
            count--;
        }
        return temp;
    }
    void erase()
    {
        while(head!=null)
        {
            pop();
        }
    }
    boolean empty()
    {
        return head==null;
    }

    void init(String name) throws FileNotFoundException
    {
        int num=0;
          Scanner scanner = new Scanner(new File(name));
            while(scanner.hasNextLine())
            {
                String[] el = scanner.nextLine().split(" ");
//                if(this instanceof Stack)
//                {
//                    if(num++==0) System.out.println("This is Stack\n");
//                }
//                if(this instanceof Queue)
//                {
//                    if(num++==0) System.out.println("This is Queue\n");
//                }
                if(this instanceof Deque && num++ %2 == 0)
                {
                    //if(num==1) System.out.println("This is Deque\n");
                    ((Deque) this).push_end(new Elem(new Node(el[0], el[1], el[2], el[3])));
                }
                else push(new Elem(new Node(el[0], el[1], el[2], el[3])));
            }
        //for (int i =0; i<count; i++)
        //{
       //     push(new Elem(new Node(i)));
       // }
    }
    void print()
    {

        Elem temp=head;
        while(temp!=null)
        {
            temp.print();
            temp=temp.next;
        }
        System.out.println();
    }
    void sort(String name)
    {
        Node[]arr=new Node[count];
        for(int i=0; i< arr.length; i++)
            arr[i]=pop().inf;
        for(int i=0; i< arr.length-1; i++)
        {
            for(int j=i+1; j< arr.length; j++)
            {
                if((name.equals("Mark") && arr[i].mark<arr[j].mark)||
                   (name.equals("Date") && arr[i].Date<arr[j].Date)||
                   (name.equals("Name") && (arr[i].name).compareTo(arr[j].name)<0) ||
                   (name.equals("Surname") && (arr[i].surname).compareTo(arr[j].surname)<0))
                {
                    Node temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (Node elem : arr) push(new Elem(elem));
    }
    public static void main(String[] args) throws FileNotFoundException
    {
//        Spis sp = new Spis();
//        sp.init("input.txt");
////        sp.print();
////        sp.pop();
////        sp.print();
////        System.out.println(sp.count);
////        System.out.println(sp.empty());
////        sp.erase();
////        System.out.println(sp.empty());
//        System.out.println("=========================================================================\n");
//        System.out.println("Sort by Date\n");
//        sp.sort("Date");
//        sp.print();
//        System.out.println("=========================================================================\n");
//        System.out.println("Sort by Mark\n");
//        sp.sort("Mark");
//        sp.print();
//        System.out.println("=========================================================================\n");
//        System.out.println("Sort by Name\n");
//        sp.sort("Name");
//        sp.print();
//        System.out.println("=========================================================================\n");
//        System.out.println("Sort by Surname\n");
//        sp.sort("Surname");
//        sp.print();
//        System.out.println("=========================================================================\n");


        Spis[] m = new Spis[10];
        for (int i = 0; i < m.length; i++)
        {
            if (i % 3 == 0)
                m[i] = new Stack();
            else if (i % 3 == 1)
                m[i] = new Queue();
            else if (i % 3 == 2)
                m[i] = new Deque();
        }
        for(int i=0; i<10; i++)
        {
            if(m[i] instanceof Deque)
            {
                System.out.println("This is Deque\n");
                m[i].init("input.txt");
                m[i].print();
                System.out.println("=========================================================================\n");
            }
            if(m[i] instanceof Stack)
            {
                System.out.println("This is Stack\n");
                m[i].init("input.txt");
                m[i].print();
                System.out.println("=========================================================================\n");
            }
            if(m[i] instanceof Queue)
            {
                System.out.println("This is Queue\n");
                m[i].init("input.txt");
                m[i].print();
                System.out.println("=========================================================================\n");
            }
            //if(i==2) break;

        }
            //if(m[i] instanceof Deque)
            //  push(cp)
//        for(int i = 0; i<m.length; i++)
//            m[i].init(20);
//        for (int i = 0; i< m.length; i++)
//           m[i].print();
    }

};