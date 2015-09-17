package MainPackage;

public class MyInteger {
	
	private int value = 0;
	
	public MyInteger(int value){
	this.value = value;
	}
	
	public int getValue(){
		return value;
	}

	public boolean isEven(){
		if(this.value % 2== 0)
			return true;
		return false;
	}
	
	public boolean isOdd(){
		if(this.value % 2 !=0)
			return true;
		return false;
	}
	
	public boolean isPrime(){
		int i = 0;
		for(i = 2; i <= value / 2; i++){
			if(value % i !=0)
				return true;
		}
		return false;
	}
	
	public boolean isEven(int value){
		if(value%2==0)
			return true;
		return false;
	}
	
	public boolean isOdd(int value){
		if(value % 2 !=0)
			return true;
		return false;
	}
	
	public static boolean isPrime(int value){
        return isPrime(value);
    }
   
    public static boolean isEven(MyInteger myInteger){
        return myInteger.isEven();
    } 
    public static boolean isOdd(MyInteger myInteger){
        return myInteger.isOdd();
    }
   
    public static boolean isPrime(MyInteger myInteger){
        return myInteger.isPrime();
    }
   
    public boolean equals(int intValue){
        return value == intValue;
    }
    public boolean equals(MyInteger myInteger){
        return equals(myInteger.getValue());
    }
   
    public static int parseInt(char[]characters){
    	String c = characters.toString();
        return Integer.parseInt(c);
    }
    
    public static int parseInt(String characters){
        return Integer.parseInt(characters);
    }

    
    
}

