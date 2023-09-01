package solveAssignment;

public class Solutions {
	
   public static void solution1(int row) {
	   for(int i =0;i<row;i++) {
		   for(int j=0;j<=i;j++) {
			   System.out.print("*");
		   }
		   System.out.println();
	   }
	   
   }
   
   public static void solution2(int row) {
	   
	   char ascii = 'A';
	   for(int i =0;i<row;i++) {
		   for(int j=0;j<=i;j++) {
			   System.out.print(ascii++ +" ");
		   }
		   System.out.println();
	   }
	   
   }
   public static void solution3(int row) {
	   
	   int temp = 1;
	   for(int i =1;i<=row;i++) {
		   temp =1;
		   for(int j=1;j<=i;j++) {
			   System.out.print(temp++ +" ");
		   }
		   System.out.println();
	   }
	   
   }
   
   public static void solution4(int row) {
	   
	   int temp = 1;
	   for(int i =1;i<=row;i++) {
		   temp =i;
		   for(int j=1;j<=i;j++) {
			   System.out.print(temp-- +" ");
		   }
		   System.out.println();
	   }
	   
   }
   
   public static void solution5(int row) {
	   
	   int temp = 1;
	   for(int i =0;i<=row;i++) {
		   temp =i;
		   for(int j=0;j<=i;j++) {
			   System.out.print( (int) Math.pow(2, temp--) +" ");
		   }
		   System.out.println();
	   }
	   
   }
   
   public static void solution6(int row) {
	   
//	   int temp = 1;
	  
	   for(int i =row;i>=1;i--) {
		  
		   for(int j=0;j<=i;j++) {
			   System.out.print( i +" ");
		   }
		   System.out.println();
	   }
	   
   }
   public static void solution7(int row) {
	   
	   char temp = 'A';
	   
	   for(int i =row;i>=1;i--) {
		   
		   for(int j=0;j<=i;j++) {
			   System.out.print( temp++ +" ");
		   }
		   System.out.println();
	   }
	   
   }
   
   
}
