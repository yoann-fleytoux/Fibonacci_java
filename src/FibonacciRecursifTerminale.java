
	
	public class FibonacciRecursifTerminale extends Fibonacci
	{
		
		public long compute(int n)
		{
			// (n, F_{n-1}, F_n)
		if (n <= 1)  // cas de base
				return (n);
	    else       // récurrence
	        return (compute(n - 1, 1, 0));
	        		
		}
	
		public long compute(int n, long fibN, long fib_1)
		{
			// (n, F_{n-1}, F_n)
		if (n == 0)  // cas de base
				return (fibN);
	    else       // récurrence
	        return (compute(n - 1, fibN + fib_1, fibN));
	        		
		}
	
		public static void main(String[] args) 
		{
			Fibonacci f = new Fibonacci();
			long time = System.nanoTime();
			f.compute(1);
			System.out.println(System.nanoTime() - time + " ns");
		
		}
	}

