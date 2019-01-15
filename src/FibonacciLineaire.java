

public class FibonacciLineaire extends Fibonacci
{
	
	public Long compute(Integer n)
	{
		long a;
		long f_n_1 = 1;  // F_{-1} = 1	   
		long f_n = 0;   // F_0 = 0
		for(int i = 1; i<=n; i++)  //n fois
	        {
	    		a = f_n_1 + f_n;
	    		f_n_1 = f_n;
	    		f_n = a;
	    		
	    		//(f_n_1, f_n) = (f_n, f_n + f_n_1);
	    		
	        }
	    return f_n;
	}

	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		long time = System.nanoTime();
		f.compute(44);
		System.out.println(System.nanoTime() - time + " ns");
	
	}
}
