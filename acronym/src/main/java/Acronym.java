import java.lang.*; 

class Acronym {
	String phraseString = new String();

    Acronym(String phrase) {
        phraseString = phrase;
    }

    String get() {
    	String acronym = new String();
    	acronym+=phraseString.charAt(0);
        for(int i=1; i<phraseString.length(); i++){
        	char c = phraseString.charAt(i);
        	//int ascii = (int) c;
        	if(c==' ' || c=='-'){
        		Character nextCharacter = phraseString.charAt(i+1);
        		if((nextCharacter>='A'&&nextCharacter<='Z')||(nextCharacter>='a'&&nextCharacter<='z')){
        			acronym+=phraseString.charAt(i+1);
        		}
        		else if(nextCharacter=='_'){
        			i++;
        			acronym+=phraseString.charAt(i+1);
        		}
        	}
        }
		return acronym.toUpperCase(); 
    }

}
