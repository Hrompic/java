class tmp
{
	private int i;
	public static final int f = 1234;
	tmp(int _i)
	{
		this.i = _i;
	}
	tmp()
	{
		this(123);
	}
	int get()
	{
		return i+f;
	}

}
public class a
{
	public static int add(int a, int b)
	{
		return a+b;	
	}
	public static void main(String[] str)
	{
		int a = 2;
		int b = 1123;
		tmp c = new tmp();
		System.out.println(add(12, 21)+a+b+"\t"+c.get());
	}
}
