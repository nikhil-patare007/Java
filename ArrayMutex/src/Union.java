
public class Union {

public static boolean isPresent(int[] arr,int ele){
	for(int e:arr){
		if(e == ele){
			return true;
		}
	}
	return false;
}

public static void main(String[] args) {
	int[] arr1={1,2,3,4};
	int[] arr2={1,5,6,3};


	for(int i=0;i<arr1.length;i++){
		System.out.println(arr1[i]);
	}
	for(int i = 0;i<arr2.length;i++){
		if(!isPresent(arr1, arr2[i])){
			System.out.println(arr2[i]);
		}
	}
}
}