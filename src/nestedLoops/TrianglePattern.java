package nestedLoops;

public class TrianglePattern {

	public static void main(String[] args) {
		 int numberOfRows = 5;
	        for(int i=1;i<=numberOfRows;i++){
	            for(int j=1;j<=i;j++){
	              System.out.print("[]");  
	            }
	            System.out.println();
	        }
	        System.out.println();
	        
	        for(int i=1;i<=numberOfRows;i++){
	            for(int j=0;j<i;j++){
	              System.out.print("{}");  
	            }
	            System.out.println();
	        }
	        System.out.println();
	        
	  for(int k=0;k<3;k++){
		  for(int b=0;b<4;b++){
			  System.out.print("[]"); 
		  }
		  System.out.println();
	  }
	        
	        
	}

}
