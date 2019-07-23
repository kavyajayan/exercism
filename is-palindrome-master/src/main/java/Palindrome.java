import java.util.*;
import java.lang.String;

public class Palindrome {
    public boolean check(String sentence) {

    	//converting to lower case for comparision
    	String sentenceLower = sentence.toLowerCase();

    	//removing spaces and special characters
    	sentenceLower = sentenceLower.replaceAll("[^a-zA-Z0-9]", "");
    	
    	//creating a temporary string to copy contents of given sentence
    	StringBuilder sentenceTemp = new StringBuilder();
    	sentenceTemp.append(sentenceLower);

    	int flag=0;
    	

    	//loop to check if the sentence is palindrome
    	for(int i=0, j = sentenceTemp.length()-1; i<sentenceTemp.length()/2; i++, j--){
    		if(sentenceTemp.charAt(i)!=sentenceTemp.charAt(j)){
    			flag=1;
    		}
    	}
    	if(flag==0){
    		return true;
    	}
    	else{
        	return false;
        }
    }
}
