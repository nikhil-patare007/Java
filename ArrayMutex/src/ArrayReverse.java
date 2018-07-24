
public class ArrayReverse {
public int[] reverse3(int[]nums){
	int[] temp=new int[3];
	for (int i=0;i<temp.length;i++){
		temp[i]=0;
	}
for(int i=0;i<nums.length;i++){
	temp[temp.length-1-i]=nums[i];
	
    }
       return temp;
 }
    public static void main(String[] args) {
		int[]nums={4,5,6};
		ArrayReverse a1=new ArrayReverse();
		int[]b=a1.reverse3(nums);
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
    	
	}
		
	}
	
}


