

public class FoobarEx {
public static void main(String[] args) {
	int[] a={1,3,5,15,17,22,60};
	for(int i=0;i<a.length;i++){
		
		if(a[i]%3==0&&a[i]%5==0){
			
		 
			System.out.println(a[i]+": FooBar");
		}else if(a[i]%3==0){
			System.out.println(a[i]+": Foo");
		}else if(a[i]%5==0){
			System.out.println(a[i]+": Bar");
		}else{
			System.out.println(a[i]+"Not");
		}
		
		
	}
	
}
}
