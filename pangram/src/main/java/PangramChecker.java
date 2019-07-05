import java.util.Arrays;

public class PangramChecker {

    public boolean isPangram(String input) {
    	boolean[] flag = new boolean[26];
  		int index = 0;  
  		char[] tempArray = input.toCharArray();
    	for (int i = 0; i <input.length(); i++){  
        	if ('A' <= tempArray[i] && tempArray[i] <= 'Z'){
            	index = tempArray[i] - 'A'; 
            	flag[index] = true; 
        	}
  			else if('a' <= tempArray[i] && tempArray[i] <= 'z') {
            	index = tempArray[i] - 'a'; 
        		flag[index] = true; 
        	}
    	} 
    	for (int i=0; i<=25; i++) 
        	if (flag[i] == false) 
            	return false; 
    	return true; 
    }

}
