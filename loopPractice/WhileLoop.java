package loopPractice;

public class WhileLoop {
	
	
	public static void main(String[] args) {
		
		//1) Write a Program To print 1 to 25 nos.
		int i=1;
		while(i<=25){
		  System.out.print(i+" ");
		  i++;
		}
		
		//2) Write a Program To print 25 to 1 nos.
		
		 int j=25;
		 while(j>=1){
		  System.out.print(j+" ");	
		  j++;
		 }
		
		//3) Write a Program To print 1 to 100 Odd nos.
		
		int j1=1;
		while(j1<=100){
			if(j1%2!=0)
		      System.out.print(j1+" ");
			j1++;
		}
		
		
		//4) Write a Program To print 1 to 100 even nos.
				
	     	int j2=1;
			while(j2<=100){
			 if(j2%2==0)
				 System.out.print(j2+" ");
			 j2++;
			}
		
		//5) Write a Program To print sum of 1 to 50 Odd nos.
	
			int j3=1;
			while(j3<=50){
			 if(j3%2!=0)
				 System.out.print(j3+" ");		
			 j3++;
			}
			
		//6) Write a Program To print sum of 1 to 50 EVEN nos.	
			
			int j4=1,sumEven=0;
			while(j4<=50){
			 if(j4%2==0)
				 sumEven+=j4;	
			 j4++;
			}
			System.out.println(sumEven);
			
	    //7) Write a Program To print -45 to +45 nos.
			int newVar=-45;
			while(newVar<=45){
				 System.out.print(newVar+" ");	
				 newVar++;
			}
		
		//8) Write a Program To print 50 to 100 nos
			int newVar1=50;
			while(newVar1<=100){
				 System.out.print(newVar1+" ");	
				 newVar1++;
			}
			
	     //9) Write a Program To print sum of odd and even no.	
			int sumEven1 =0;
			int sumOdd1 =0;
			int newVar2 =1;
			while(newVar2<=100){
				if(i%2 == 0) 
					sumEven1+=i;
				else
					sumOdd1+=i;
                newVar2++;
			}
			
			
			//14) Write a Program To print count of even No 1 to 25 no.
			//15) Write a Program To print count of odd No 1 to 25 no.
			
			int countEven =0;
			int countOdd =0;
			int newVa =1;
			while(newVa<=100){
				if(i%2 == 0) 
					countEven++;
				else
					countOdd++;
				newVar++;
			}
			System.out.println("Even Count:"+countEven+"\n"+ "Odd Count: " + countOdd );
			
			
			/******************************* Series Question ****************************************/
			
			// 1) Generate the Series... 2 4 6 8 10 12 14 16 18 20.
			// 2) Generate the Series... 9 18 27 36 45 54 63 72 81 90. 
			// 4) Generate the Series... 5 10 15 20 25 30 35 40 45 50.
			// 7) Generate the Series... 8 16 24 32 40 48 56 64 72 80.
	        //10) Generate the series... 3 6 9 12 15 18 21 24 27 30.
	        //11) Generate the Series... 7 14 21 28 35 42 49 56 63 70. 
	        //12) Generate the Series... 4 8 12 16 20 24 28 32 36 40. 
	        //13) Generate the Series... 10 20 30 40 50 60 70 80 90 100. 
			
			int table2 = 2;
	        int table9 = 9;
	        int table8 = 8;
	        int table3 = 3;
	        int table7 = 7;
	        int table4 = 4;
	        int table10 = 10;
	        int table6 = 6;
	        int ij =1;
	        while(ij<=10) {
	        	System.out.print(table2*ij+",");
				System.out.println();
				
				System.out.print(table9*ij+",");
				System.out.println();

				System.out.print(table8*ij+",");
				System.out.println();
				
				System.out.print(table3*ij+",");
				System.out.println();
				
				System.out.print(table7*ij+",");
				System.out.println();
				ij++;
	        }
	        
	        
	      //3) Generate the Series... 1 -2 3 -4 5 -6 7 -8 9 -10.
	        
	        int temp =1;
	        while(temp<=10) {
	        	if(i%2==0)
					System.out.print(i+" ");
				else
					System.out.println(-i+" ");
	        	temp++;
	        	
	        }
	        
	      //5) Generate the Series... 1 10 100 1000.
			
			 temp =1;
			 while(temp<=4) {
				 System.out.println(temp);
		         temp *=10;
		         temp++;
			 }
		
		// 6) Generate the Series... 1  3  6  10  15  21  28  36  45
			
			 temp =2;
			 int temp1=1;
			 while(temp1<=45) {
				 System.out.print( temp1 + " ");
				 temp1+=temp++;
			 }
			
		 // 8) Generate the Series... 0 1 1 2 3 5 8 13 21
			 
			    int first = 0;
				int second =1;
				int tempVar=0;
				
				System.out.println(first+" "+ second+ " ");
				temp =2;
				
				while(temp <= 21) {
					
					tempVar =first+second;
					System.out.println(tempVar+" ");	
					
					first = second;
					second = tempVar;
					temp++;
					
				}
			
			//9) Generate the series... 1 4 9 16 25 36 49 64 81 100
				int mySum = 0;
				temp=0;
				while(temp<=20) {
					 if(temp%2!=0) {
						mySum+=temp;
						System.out.print(temp+ " ");
				}
				}
				
			//14) Generate the Series... 1 2 3 4 5 4 3 2 1
			
			temp =0;
			while(temp<=5) {
				System.out.print(temp+" ");
			}
			temp=4;
			while(temp>=1) {
				System.out.print(temp+" ");
			}
	
		}
	
}

