package MainPackage;

private class MyInteger {
	private int value;
	
	
	//////////////////////////// Question One	
	public MyInteger(){
	}
	
	//////////////////////////// Question Two
	public MyInteger(int num){
		value=num;
	}
	public int GetNumber(){
		return value;
	}
	public int SetNumber(int NewNumber){
		NewNumber= value;
		return NewNumber;
	}
	
	/////////////////////////// Question three
	public boolean isEven(){
		if (value%2==0){
			return true;
			}
		return false;
		}
	public boolean isOdd(){
		if (value%2 != 0){
			return true;
		}
		return false;
	}
	public boolean isPrime(){
		for (int x1 = 0 ;x1<= x1/2;x1++){
			if (value % x1 != 0){
				return true;
			}
		}
		return false;
	}
	
	/////////////////////// Question four
	public static boolean isEven(int y){
		if (y%2==0){
			return true;
		}
		return false;
	}
	public static boolean isOdd(int y){
		if (y%2 != 0){
			return true;
		}
		return false;
	}
	public static boolean isPrime(int y){
		for (int x1=0;x1<= x1/2;x1++){
			if (y%x1 != 0){
				return true;
			}
		}
		return false;
	}
	
	///////////////////////// Question five
	public static boolean isEven(MyInteger x){
		return x.isEven();
	}
	public static boolean isOdd(MyInteger x){
		return x.isOdd();
	}
	public static boolean isPrime(MyInteger x){
		return x.isPrime();
	}

	///////////////////////// Question six
	public boolean equal(int number){
		if (number== value){
			return true;
		}
		return false;
	}

	public boolean equal(MyInteger w){
		return w.equal(w);
	}
	
	//////////////////////// Question seven
	public static void parseInt(char[] c){
		int NewNumber;
		for (int t=0; t<c.length; t++){
			NewNumber = c[t];
			NewNumber++;
		}
	}
	public static void parseInt(String c){
		int number;
		number= c.length();
	}
	
}

	
	
	
	
