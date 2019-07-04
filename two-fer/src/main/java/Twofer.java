class Twofer {
	String phrase1="One for ";
	String phrase2=", one for me.";

    String twofer(String name) {
    	String finalPhrase = new String();
    	finalPhrase+=phrase1;
    	if(name==null){
    		finalPhrase+="you";
    	}  
    	else{
    		finalPhrase+=name;
    	}
    	finalPhrase+=phrase2;
    	return finalPhrase;
    }
}
