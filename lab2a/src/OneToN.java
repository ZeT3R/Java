public class OneToN
{
    int num, count;
    OneToN(int num)
    {
        this.num = num;
        count = 0;
    }

    boolean check(int num)
    {
        int temp = num;
        while(temp != 0)
        {
            if(temp % 10 == 0 || num % (temp%10) != 0) return false;
            else temp /= 10;
        }
        return true;
    }

    void print()
    {
        for(int i = 1; i <= num; i++)
            if(check(i))
            {
                System.out.print(String.format("%6d", i));
                count++;
                if(count % 10 == 0)
                    System.out.println();
            }
        System.out.println("\ncount: "+ String.valueOf(count));
    }

    void setNum(int num)
    {
        this.num = num;
        count = 0;
    }

    public static void main(String[] args)
    {
        //int arg=Integer.parseInt(args[0]);
        OneToN test = new OneToN(1000);
        test.print();
    }
}
