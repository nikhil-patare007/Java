
public class TableArray {
    public static void main(String[] args) {
		int[][] table=new int[10][0];
		 for(int i=0;i<table.length;i++){
			 table[i]=new int[i+1];
			 
		 }
	
    for(int i=0;i<table.length;i++){
    	for(int j=0;j<table[i].length;j++){
    		table[i][j]=(i+1)*(j+1);
    	}
    }
    for(int i=0;i<table.length;i++){
    	for(int j=0;j<table[i].length;j++){
             System.out.print(" "+table[i][j]);    		
    	}
    System.out.println();
    
    }
 }    
}
    
    
