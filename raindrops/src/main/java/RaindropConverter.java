class RaindropConverter {


    String convert(int number) {
    	String sound=new String();
    	int flag=0;
        if(number%3==0){
        	sound+="Pling";
        	flag=1;
        }
        if(number%5==0){
        	sound+="Plang";
        	flag=1;
        }
        if(number%7==0){
        	sound+="Plong";
        	flag=1;
        }
        if(flag==0)
        	sound=Integer.toString(number);
        return sound;
    }

}
