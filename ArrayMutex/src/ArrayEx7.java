
public class ArrayEx7 {
public int sum67(int[] a ){
	int temp=0;
	int sum=0;
	for(int i=0;i<a.length;i++){
		if(a[i]==6){
		  for(int j=i;a[j]!=7;j++){
			  a[j]=0;
			  temp=j;
		  }
			a[temp+1]=0;
			
		}
		else{
			sum=sum+a[i];
		}
	}
	return sum;
}
public static void main(String[] args) {
	int[]a={1,2,6,7,2,4};
	ArrayEx7 e=new ArrayEx7();
	System.out.println(e.sum67(a));
}
}
