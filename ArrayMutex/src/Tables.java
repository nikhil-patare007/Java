

public class Tables{

	public static void main(String[] args) {
		
		int[][] arr=new int[10][9];
		int temp=2;
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<10;j++)
			{
				if((j)==temp)
					{
					break;
				    }
				
				arr[j][i]=temp*(j+1);
			}
			temp=temp+1;
		}
		
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<9;j++)
			{
				if(i>=2 && i-j>1){
					System.out.print("\t ");
					continue;
				}
					
				System.out.print(arr[i][j]+"\t ");
			}
			System.out.println();
			}
//20 31 42 53 64
//30 31 42 53 64

	}

}


