package fr.dauphine.ja.BENBRAHIMAya.td00;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class PrimeCollectionTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public PrimeCollectionTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( PrimeCollectionTest.class );
    }
   

    /**
     * Rigourous Test :-)
     */
    
    private void testTwoIsPrime() {
		// TODO Auto-generated method stub
		assertTrue(PrimeCollection.isPrime(2));
	}

	private void test0IsPrime() {
		// TODO Auto-generated method stub
		assertTrue(PrimeCollection.isPrime(0));
	}
	private void test9IsNotPrime() {
		// TODO Auto-generated method stub
		assertTrue(!PrimeCollection.isPrime(9));
	}
	
    public void testPrimeCollection()
    {
        assertTrue( true );
       
        test0IsPrime();
        testTwoIsPrime();
        test9IsNotPrime();
        
    }

	
    
}
