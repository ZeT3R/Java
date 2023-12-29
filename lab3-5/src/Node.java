//package spisoks;
public class Node
{
    String name, surname;
    Double mark;
    int Date;
    Node(String name, String surname, String mark, String Date)
    {
        this.name = name;
        this.surname = surname;
        this.mark = Double.parseDouble(mark);
        this.Date = Integer.parseInt(Date);
    }
    void print()
    {
        System.out.print("Name: "+name + "; Surname: " + surname +"; Mark: " + mark +"; Date: " + Date+  "\n");
    }
    //int i;
    //Node(int i)
    //{
    //    this.i = i;
    //}
    //void print(){
    //    System.out.print(" " + i);
    //}


}
