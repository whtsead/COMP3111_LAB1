package labs.comp3111.ust.hk;

public class lab1 {

	public static void main(String[]args){
		int [] arr = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0 ;
		int min = 0;
		int max = 0;
		for ( int i = 0 ; i < arr.length; i++){
			sum += arr[i]; 
		}
		
		for ( int i = 0 ; i < arr.length; i++){
			if (arr[i] <= min) min = arr[i];
		}
		for ( int i = 0 ; i < arr.length; i++){
			if (arr[i] >= max) max = arr[i];
		}
		System.out.println(String.format("Sum of the number is %d", sum));
		System.out.println(String.format("min of the number is %d", min));
		System.out.println(String.format("max of the number is %d", max));
	}
	
}
