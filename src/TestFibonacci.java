import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public abstract class TestFibonacci {

	protected Fibonacci f;

	@Before
	public abstract void setUp() throws Exception ;
	
	@After
	public void tearDown() throws Exception {
		this.f = null;
	}

	@Test
	public void testFibonacciValeur0()
	{
		assertEquals("Erreur",0, this.f.compute(0));
	}

	@Test
	public void testFibonacciValeur1()
	{
		assertEquals("Erreur",1, this.f.compute(1));
	}

	@Test
	public void testFibonacciValeur2()
	{
		assertEquals("Erreur",1, this.f.compute(2));
	}

	@Test
	public void testFibonacciValeur3()
	{
		assertEquals("Erreur",2, this.f.compute(3));
	}

	@Test
	public void testFibonacciValeur4()
	{
		assertEquals("Erreur",3, this.f.compute(4));
	}

	@Test
	public void testFibonacciValeur5()
	{
		assertEquals("Erreur",5, this.f.compute(5));
	}

	@Test
	public void testFibonacciValeur6()
	{
		assertEquals("Erreur",8, this.f.compute(6));
	}

	@Test
	public void testFibonacciValeur7()
	{
		assertEquals("Erreur",13, this.f.compute(7));
	}

	@Test
	public void testFibonacciValeur8()
	{
		assertEquals("Erreur",21, this.f.compute(8));
	}

	@Test
	public void testFibonacciValeur9()
	{
		assertEquals("Erreur",34, this.f.compute(9));
	}

	@Test
	public void testFibonacciValeur25()
	{
		assertEquals("Erreur",75025, this.f.compute(25));
	}
	@Test
	public void testFibonacciTempsExecutionValeur44Inférieur1MiliSeconde()
	{
		long timeDeb = System.nanoTime();
		f.compute(41);
		long durée = System.nanoTime() - timeDeb ; 
		assertTrue("Temps d'execution de Fibonacci de 44 est de " + (durée / 1000000) +"ms", (durée / 1000000) < 1);
	}
}
