import java.util.Arrays;

 class ArrayUtils {
    	public static int max(int[] numbers){
		int maxValue = numbers[0];
		for(int i=1;i<numbers.length;i++){
			if(numbers[i] > maxValue){
				maxValue = numbers[i];
			}
		}
		return maxValue;
	}

	public static int min(int[] numbers){
		int minValue = numbers[0];
		for(int i=1;i<numbers.length;i++){
			if(numbers[i] < minValue){
				minValue = numbers[i];
			}
		}
		return minValue;
	}
	public static int duplicate(int[] numbers){
		int dupValue = numbers[0];
		for(int i=1;i<numbers.length;i++){
			if(numbers[i] = dupValue{
				dupValue = numbers[i];
			}
		}
		return dupValue;
	}

    
}

  public class ArrayApplicationFindDuplicate{
	public static void main (String args[]){
	   int myArray[]= new int[6];
	   myArray[0]= 78;
	   myArray[1]= 32;
	   myArray[2]= 85;
	   myArray[3]= 100;
	   myArray[4]= 19;
	   myArray[5]= 100;
        int maxNumber = ArrayUtils.max(myArray);
        int minNumber = ArrayUtils.min(myArray);
	int sameNumber = ArrayUtils.duplicate(myArray);
	   System.out.println("Wartosc minimalna = " + minNumber);
	   System.out.println("Wartosc maksymalna = " + maxNumber);
System.out.println("Wartosc powtarzająca się = " + sameNumber);

	}}

