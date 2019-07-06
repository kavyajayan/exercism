import java.io.*; 
import java.util.*;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        phrase = phrase.toLowerCase(); 
        int len = phrase.length(); 
        char arr[] = phrase.toCharArray(); 
        Arrays.sort(arr); 
        int index = 0;
        for(int i = 0; i < len; i++){
        	if(arr[i] == 'a'){
        		index = i;
        		break;
        	}
        }
        
        int flag = 0;
        for (int i = index; i < len - index -1; i++) {
        	if(arr[i] == arr[i+1]){
        		flag = 1;
        		break;
        	}	
        }
        
        if(flag == 0){
        	return true;
        }
        else{
        	return false;
        }
    }

}
