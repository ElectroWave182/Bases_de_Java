class A10
{
public static void main(String[] args)
{
	int n = 1642;
	while(n != 1)
	{
		if (n % 2 == 0)
		{
			n /= 2;
		}
		else
		{
			n = 3 * n + 1;
		}
		System.out.println(n);
	}
}
}
