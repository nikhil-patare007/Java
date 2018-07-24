public class ArrayE6 {
	
	public int[] alterMerge(int[] a,int[] b ){
		int[] temp=new int[6];
		for(int i=0;i<temp.length;i++){
			temp[i]=0;
		}
		
		for( int i=0,j=0;i<temp.length;i=i+2,j++){
			temp[i]=a[j];
			temp[i+1]=b[j];
		   }
		
		
		return temp;
	}
	public static void main(String[] args) {
		int[] a={1,3,5};
		int[] b={2,4,6};
		ArrayE6 a1=new ArrayE6();
		int[] d=a1.alterMerge(a, b);
		for(int i=0;i<d.length;i++){
			System.out.println(d[i]);
		
		}
		
	}

}