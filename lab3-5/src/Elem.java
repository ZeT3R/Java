public class Elem
{
    Node inf;
    Elem next;
    Elem(Node inf)
    {
        next = null;
        this.inf = inf;
    }

    public Elem() {
        inf = null;
        next = null;

    }

    void print()
    {
        inf.print();
    }

}
