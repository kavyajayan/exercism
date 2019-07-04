import java.util.*;

class RnaTranscription {

    HashMap<Character,Character> dnaToRna =  new HashMap<Character,Character>(); 
       

    RnaTranscription(){
        dnaToRna.put('G','C'); 
        dnaToRna.put('C','G'); 
        dnaToRna.put('T','A'); 
        dnaToRna.put('A','U');
    }

    String transcribe(String dnaStrand) {
        StringBuilder tempStr = new StringBuilder();
        tempStr.append(dnaStrand);
	    for(int i=0; i<tempStr.length(); i++){
	   	    tempStr.setCharAt(i,dnaToRna.get(tempStr.charAt(i)));
	    }
	    return tempStr.toString();
    }

}
