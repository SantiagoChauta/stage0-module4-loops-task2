package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
    	int number=2;
    	boolean prime=true;
    	while(number<=printToInclusive) {
    		
    		for(int i=2;i<number;i++) {
    			if(number%i==0) {
    				prime=false;
    			}
    		}
    		
    		if(prime)System.out.println(number);
    		prime=true;
    		number++;
    	}
    	
    	
    }
}
