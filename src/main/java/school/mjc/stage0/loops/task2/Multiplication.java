package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
    	int number = 0;
    	int module = 1;
    	if(multiplyByAndToInclusive<0) {
    		multiplyByAndToInclusive*=-1;
    		module = -1;
    	}
    	
    	while(number<=multiplyByAndToInclusive) {
    		System.out.println(number*multiplyByAndToInclusive*module);
    		number++;
    	}
    }
}
