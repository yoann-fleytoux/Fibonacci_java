import org.junit.Before;


public class TestFibonacciDyn extends TestFibonacci{

	
	@Before
	public void setUp() throws Exception 
	{
		this.f = new FibonacciDynamique();
	}
}
