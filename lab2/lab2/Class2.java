public class Class2
{
	public static int i = 0;
	public static void main (String[] args)
	{
		i++;
		if (i < 3)
		{
			System.out.println ("Class2");
			Class1.main(args);
		}
	}
}