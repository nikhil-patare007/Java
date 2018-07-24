
public class ArrayE1 {
public boolean commonEnd(int[] a,int[] b){
	if (a[0]==b[0] || a[a.length-1]==b[b.length-1]){
		return true;
	}
	else{
		return false;
	}
}
	
public static void main(String[] args){
	ArrayE1 e =new ArrayE1();
	int[] a1={1,2,3};
	int[] b1={7,3};
 System.out.println(e.commonEnd(a1,b1));

}

}
