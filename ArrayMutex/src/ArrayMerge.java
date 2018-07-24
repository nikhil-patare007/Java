
public class ArrayMerge {
 public int[] plusTwo(int[]a,int[] b ){
int[] c=new int[4];
	 for(int i=0;i<2;i++){
		 c[i]=a[i];
		 c[i+2]=b[i];
	 }
	 return c;
 }
public static void main(String[] args) {
     int[]a={1,2};
     int[]b={3,4};
     ArrayMerge a1=new ArrayMerge();
 	
     int[]d=a1.plusTwo(a,b);
	
	
	for(int i=0;i<d.length;i++){
		System.out.println(d[i]);
	}
}


}
