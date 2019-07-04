import java.util.*;

class TwelveDays {
	List<String> verseArray = new ArrayList<String>();
	List<String> verseInit = new ArrayList<String>();

	TwelveDays(){
		verseArray.add(0,"a Partridge in a Pear Tree");
		verseArray.add(1,"two Turtle Doves");
		verseArray.add(2,"three French Hens");
		verseArray.add(3,"four Calling Birds");
		verseArray.add(4,"five Gold Rings");
		verseArray.add(5,"six Geese-a-Laying");
		verseArray.add(6,"seven Swans-a-Swimming");
		verseArray.add(7,"eight Maids-a-Milking");
		verseArray.add(8,"nine Ladies Dancing");
		verseArray.add(9,"ten Lords-a-Leaping");
		verseArray.add(10,"eleven Pipers Piping");
		verseArray.add(11,"twelve Drummers Drumming");

		verseInit.add(0,"first");
		verseInit.add(1,"second");
		verseInit.add(2,"third");
		verseInit.add(3,"fourth");
		verseInit.add(4,"fifth");
		verseInit.add(5,"sixth");
		verseInit.add(6,"seventh");
		verseInit.add(7,"eighth");
		verseInit.add(8,"ninth");
		verseInit.add(9,"tenth");
		verseInit.add(10,"eleventh");
		verseInit.add(11,"twelfth");

	}

	String createVerseStarting(int verseNumber){
		String verseStart = new String();
    	for(int i=1; i<=12; i++){
    		if(i==verseNumber){
    			verseStart+="On the " + verseInit.get(i-1) + " day of Christmas my true love gave to me: ";
    		}
    	}
    	return verseStart;
	}

    String verse(int verseNumber) {
    	if(verseNumber==1){
    		return createVerseStarting(verseNumber)+verseArray.get(0)+".\n";
    	}
    	else{
    		String verseString = new String();
    		for(int i=verseNumber; i>1; i--){
    			verseString+=verseArray.get(i-1)+", ";
    		}
    		verseString+="and "+verseArray.get(0)+".\n";
    		return createVerseStarting(verseNumber)+verseString;
    	}
    }

    String verses(int startVerse, int endVerse) {
        String versesString = new String();
        for(int i=startVerse; i<endVerse; i++){
        	versesString+=verse(i)+"\n";
        }
        versesString+=verse(endVerse);
        return versesString;
    }
    
    String sing() {
        return verses(1,12);
    }
}
