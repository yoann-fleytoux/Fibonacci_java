import org.junit.Before;


public class TestFibonacciRecursifTerminale extends TestFibonacci{

	@Before
	public void setUp() throws Exception {
		this.f = new FibonacciRecursifTerminale();
	}
}
