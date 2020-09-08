//How many integers from 1 to 100 can be divided by3?
public class Contain7{
	public static void main(String[] args) {
		int count = 0;
		for (int i =1; i <=100; i++){
			if(i%7==0 | containsSeven(x) ==7| getSecondLastNumber(x) ==7|getThirdLastNumber(x)==7{
				return true;
			}else{
				return false;
			}
		}
		System.out.println(count);
	}

	static int getLastNumber(int x){
		return x%10;
	}

	static int getSecondLastNumber(int x){
		return (x/10)%10；
	}

	static int getThirdLastNumber(int x){
		return x/100;
	}
}

