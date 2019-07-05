import java.util.Arrays;

public class PangramChecker {

    public boolean isPangram(String input) {
    	boolean[] flag = new boolean[26];
  		int index = 0;  
    	for (int i = 0; i <input.length(); i++){  
        	if ('A' <= input.charAt(i) && input.charAt(i) <= 'Z'){
            	index = input.charAt(i) - 'A'; 
            	flag[index] = true; 
        	}
  			else if('a' <= input.charAt(i) && input.charAt(i) <= 'z') {
            	index = input.charAt(i) - 'a'; 
        		flag[index] = true; 
        	}
    	} 
    	for (int i=0; i<=25; i++) 
        	if (flag[i] == false) 
            	return false; 
    	return true; 
    }

}
