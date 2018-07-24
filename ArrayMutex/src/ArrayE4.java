
public class ArrayE4 {

	public boolean unlucky(int[] a){
		for(int i=0;i<a.length;i++){
			if(a[i]==1 && a[i=1]==3){
				return true;
			}
			
		}
		return false;
	}
public static void main(String[] args) {
	int[] a ={1,3,2};
	ArrayE4 e= new ArrayE4();
	System.out.println(e.unlucky(a));
}	
}
