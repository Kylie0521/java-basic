import java.util.Arrays;
public class Array{
	public static void main(String[] args) {
		int[] numbers = {4,2,7};
		Arrays.sort(numbers);
		String result = Arrays.toString(numbers);
		System.out.println(result);
	}
}