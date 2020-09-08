//how many integers from 1 to 100 can be divided by 3?

public class CountInteger{
	public static void main(String[] args){
		int count = 0;
		for (int i=1; i<= 100; i++){
			if (i%3==0){
				count++;
			}
		}

	    System.out.println(count);
		
	}

}
