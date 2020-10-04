package fr.dauphine.ja.BENBRAHIMAya.td00;

/**
 * Hello world!
 *
 */
import java.util.Random;

public class PrimeCollection 
{
	
	java.util.ArrayList<Integer> numbers ;
	
	public PrimeCollection ( )
	
	{
		numbers.add(0);
		
	}
	public void initRandom(int n, Integer m) {
		Random random = new Random();
		for (int i=0;i<n;i++) {
			
			numbers.set(i,random.nextInt(m+1));
		}
	}
	
		private boolean isPrime(int p) {
			for(int i=2 ; i<=p/2;i++) {
				if (p%2==0) return false;
			}
			return true;
		}
		
		public void printPrimes(){
			for(int i=0;i<numbers.size();i++) {
				if (isPrime(numbers.get(i))==true)
					System.out.println(numbers.get(i));
			}
		}
	
		
    public static void main( String[] args )
    {
    	PrimeCollection pc= new PrimeCollection();
    	
    	pc.initRandom(100,1000);
    	 pc.printPrimes();
    }
    
}
