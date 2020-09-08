public class Demo{
	public static void main(String[] args) {
		int count = 0;
		for (int i =1; i <1000; i++){
			if (i%7==0| containsSeven(i)){
				count++;
			}
		}
		System.out.println(count);
	}

	static boolean containsSeven(int x){
		if(getLastNumber(x) ==7| getSecondLastNumber(x) ==7|getThirdLastNumber(x)==7){
				return true;
			} else {
				return false;
			}
	}

	static int getLastNumber(int x){
		return x%10;
	}

	static int getSecondLastNumber(int x){
		return (x/10)%10;
	}

	static int getThirdLastNumber(int x){
		return x/100;
	}
}

