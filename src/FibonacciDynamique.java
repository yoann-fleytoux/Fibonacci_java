
import java.util.HashMap;
import java.util.Map;


public class FibonacciDynamique extends Fibonacci
{
	 private static Map<Integer, Long> map = new HashMap<Integer, Long>();
	 
	 public Long compute(Integer n) 
	 {
	   if (n == 1 || n == 2) {
	     return 1L;
	   }
	 
	   Long valeur = map.get(n);
	   if (valeur != null) {
	     return valeur;
	   }
	 
	   valeur = compute(n - 1) + compute(n - 2);
	   map.put(n, valeur);
	 
	   return valeur;
	 }
	
	 public static void main(String[] args) {
			Fibonacci f = new Fibonacci();
			long time = System.nanoTime();
			f.compute(44);
			System.out.println(System.nanoTime() - time + " ns");
	
}
}
