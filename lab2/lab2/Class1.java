public class Class1
{
	public static int i = 0;
	public static void main (String[] args)
	{
		i++;
		if (i < 3)
		{
			System.out.println ("Class1");
			Class2.main(args);
		}
	}
}