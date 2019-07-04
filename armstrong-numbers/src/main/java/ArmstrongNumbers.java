import java.lang.Math;

class ArmstrongNumbers {

	int noOfDigits(int number){
		int count=0;
		while(number>0){
			number=number/10;
			count++;
		}
		return count;
	}

	int sumOfPowerOfDigits(int number){
		int numberOfDigits=noOfDigits(number);
		int sum=0;
		while(number>0){
			sum+=Math.pow((number%10),numberOfDigits);
			number=number/10;
		}
		return sum;
	}

	boolean isArmstrongNumber(int numberToCheck) {
		if(sumOfPowerOfDigits(numberToCheck)==numberToCheck){
			return true;
		}
		else{
			return false;
		}
	}

}
