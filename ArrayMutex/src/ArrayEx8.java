import javax.swing.plaf.basic.BasicBorders.MarginBorder;

public class ArrayEx8 {

	public boolean isEverywhere(int[] a, int element){
		for(int i=0;i<a.length;i=i+2){
			int ele1=a[i];
			int ele2=a[i+1];
			
			if(ele1==element || ele2==element){
		
			}
			else{
				return false;
			}
		}
		return true;
		}
public static void main(String[] args) {
	int[] a={1,2,1,9};
	ArrayEx8 e=new ArrayEx8();
	boolean result=e.isEverywhere(a,1);
	System.out.println(result);
	
} 
}
