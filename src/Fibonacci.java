
public class Fibonacci
{
	
	public long compute (int i)
	{
		if (i <= 1)
		{
			return (i);
		}
		else
		{
			return compute(i-2) + compute(i-1);
		}
	}
	
	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		long time = System.nanoTime();
		f.compute(41);
		System.out.println(System.nanoTime() - time + " ns");
	}
}
