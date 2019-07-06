import java.io.*; 
import java.util.*;

class Anagram{

	String word;

	Anagram(String givenWord){
		word = givenWord;
	}

	public List<String> match(List<String> listOfWords){
		List<String> returnList = new ArrayList<String>();
		String wordLowerCase = word.toLowerCase();
		char[] wordArray = wordLowerCase.toCharArray();
		Arrays.sort(wordArray);
		for (int i = 0; i < listOfWords.size(); i++){
			String eachWord = listOfWords.get(i);
			String eachWordLowerCase = eachWord.toLowerCase();
			if(wordLowerCase.equals(eachWordLowerCase)){
					continue;
			}
			char[] arrEachWord = eachWordLowerCase.toCharArray();
			Arrays.sort(arrEachWord);
			if(Arrays.equals(wordArray,arrEachWord) == true){
				returnList.add(eachWord);
			}
		}
		return returnList;
	}
}