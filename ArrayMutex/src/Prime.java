
public class Prime {
	
public static boolean isPrime(int number){
	
	for(int i=2;i<(number/2)+1;i++){
		{
			
			 if(number%i==0 ){
				
				return false;		
			}
			
		}
		
	}return true;
	


}



public static void main(String[] args){
	int[] numbers={2,4,6,2,7,11};
	for(int number : numbers){
		if(number!=2){
		System.out.println(" "+number+"Is Prime:"+isPrime(number));
	}
}
}
}