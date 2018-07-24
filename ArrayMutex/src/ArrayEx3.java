
public class ArrayEx3 {

	public static void main(String[] args) {
		int[] a={1,2,3};
		for(int i=0;i<a.length;i++){
			if(a[i]==2 && a[i+1]==3){
				a[i+1]=0;
			}
		   }
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
	
}
