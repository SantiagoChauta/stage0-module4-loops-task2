package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
    	String phrase="";
    	for(int i=0;i<chars.length;i++) {
    		phrase+= chars[i];
    	}
    	
    	System.out.print(phrase);
    }
}
