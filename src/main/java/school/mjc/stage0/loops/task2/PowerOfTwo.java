package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
    	
    	if(power<0) {
    		System.out.println("too much power");
    	}else {
    		int toPower =0;
    		while(toPower<=power) {
    			System.out.println((int)Math.pow(2,toPower++));

    		}
    	}

    }
}
