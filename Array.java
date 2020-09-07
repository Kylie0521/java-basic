//The Array Class
//Java arrays have a fixed length/size. You can't add or remove new items once you instantirate an array. If you need to add new items or remove existing items, 
//you need to use one of the collection classes.

import java.util.Arrays;
public class Array{
	public static void main(String[] args) {
		int[] numbers = {4,2,7};
		Arrays.sort(numbers);
		String result = Arrays.toString(numbers);
		System.out.println(result);
	}
}


// prints [2,4,7]
