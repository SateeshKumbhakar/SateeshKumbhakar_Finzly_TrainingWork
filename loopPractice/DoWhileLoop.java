package loopPractice;

public class DoWhileLoop {
public static void main(String[] args) {
		
	
		//1 Program To print 1 to 25 nos
		int i = 1;
		do {
			System.out.println(i);
			i++;
		}while(i<=25);
		
		
		// 2 Program To print 1 to 25 nos
		int j = 25;
		do {
			System.out.println(j);
			j--;
		}while(j>0);
		
		
		
		// 3 Program To print 1 to 100 Odd nos
		int k = 1;
		do {
			if(i%2!=0) {
				System.out.println(i);
			}
			k++;
		}while(k<100);
		
	
		// 4 Program To print 1 to 100 even nos.
		int l = 2;
		do {
			if(i%2==0) {
			System.out.println(l);
			}
			l++;
		}while(l<=100);
		
		
		//5 Program To print 1 to 50 odd nos
		int m = 1;
		do {
			if(m%2!=0) {
			System.out.println(m);
			}
			m++;
		}while(m<=50);
		
		//6 Program To print 1 to 50 even nos
		int n = 2;
		do {
			if(i%2==0) {
			System.out.println(n);
			}
			n++;
		}while(n<=50);
		
		//7 To print -45 to +45 nos
		int o = -45;
		do {
			System.out.println(o);
			o++;
		}while(o<= 45);
		
		
		//8 To print 50 to 100 nos
		int p = 50;
		do {
			System.out.println(p);
			p++;
		}while(p<= 100);
		
		
		// 9 To print sum of odd and even no
		int q = 0;
		int oddSum = 0;
		int evenSum = 0;
		do {
			if(q%2==0) {
				evenSum +=1;
			}else {
				oddSum +=1;
			}
			q++;
		}
		while(q< 100);
		System.out.println("Odd Sum : "+oddSum+" Even Sum : "+ evenSum);
		
		
		
		// 10 To print even and odd No
		int r = 0;
		do {
			if(r%2==0) {
				System.out.println(r+ " even");
			}else {
				System.out.println(r + " odd");
			}
			r++;
		}while(r<=100);
		
		
		 //11 To print 1 to 100 no
		int s = 1;
		do {
			System.out.println(s);
			s++;
		}while(s<=100);
		
		//12 To print 100 to 1 no
		
		int t = 100;
		do {
			System.out.println(t);
			t--;
		}while(t>0);

		//13 To print 30 to 50 no
		int u =  30;
		do {
			System.out.println(u);
			u++;
		}while(u<=50);

		//14 To print count of even No 1 to 25 no
		int v = 1;
		int evenSumSec = 0;
		do {
			if(v%2==0) {
				evenSumSec +=1;
			}
			v++;
		}while(v<=25);
		System.out.println("Even Sum : "+ evenSumSec);
		
		//15 To print count of odd No 1 to 25 no
		
		int w = 1;
		int oddSumSec = 0;
		do {
			if(w%2!=0) {
				oddSumSec +=1;
			}
			w++;
		}while(w<=25);
		System.out.println("Odd Sum : "+oddSumSec);
		
		
     // 16) 2 4 6 8 10 12 14 16 18 20
		int x = 2;
		do {
			System.out.print(x+" ");
			x+=2;
		}while(x<=20);
		
		
		System.out.println();

     //17) 9 18 27 36 45 54 63 72 81 90
		int y = 9;
		do {
			System.out.print(y+" ");
			y+=9;
		}while(y<=90);
		System.out.println();
		
      //18) 1 -2 3 -4 5 -6 7 -8 9 -10
		
		int z = 1;
		int temp = 0;
		do {
			if(z%2 == 0) {
				temp = z;
				temp = z *-1;
				System.out.print(temp+" ");
			}else{
				System.out.print(z+" ");
			}
			z++;
		}while(z<=10);
		System.out.println();
		
    // 19)5 10 15 20 25 30 35 40 45 50
		int a = 5;
		do {
			System.out.print(a+" ");
			a+=5;
		}while(a<=50);
		System.out.println();
		
     //20)1 10 100 1000
		int b = 1;
		do {
			System.out.print(b+" ");
			b = b*10;
		}while(b<=1000);
		System.out.println();
		
      // 21) 1  3  6  10  15  21  28  36  45
		
		int c = 1;
		int tem = 1;
		do {
			System.out.print(c+" ");
			tem++;
			c += tem;
		}while(c <=45);
		System.out.println();
		
 
		//22) 8 16 24 32 40 48 56 64 72 80
		int d = 8;
		do {
			System.out.print(d+" ");
			d+=8;
		}while(d<=80);
		System.out.println();
		
     // 23)0 1 1 2 3 5 8 13 21
		int count = 0;
		int firstTerm = 0;
		int secTerm = 1;
		int nextTerm = 0;
		 	
		do {
			System.out.print(firstTerm+" ");
			nextTerm = firstTerm + secTerm;
			firstTerm = secTerm;
			secTerm = nextTerm;
			count++;
		
		}while(count<9);
		System.out.println();
		
    //24)1 4 9 16 25 36 49 64 81 100
		
		int g = 1;
		do {
			System.out.print(g*g+" ");
			g++;
		}while(g<=10);
		System.out.println();
		
    //25) 3 6 9 12 15 18 21 24 27 30
		int  position = 1;
		int table =3;
		do {
			System.out.print( table*position + " ");
			position ++;
		}while(position <=10);
		System.out.println();
  		
     //26) 7 14 21 28 35 42 49 56 63 70
	    table = 7;
	    position = 1;
	    do {
			System.out.print( table*position + " ");
			position ++;
		}while(position <=10);
		System.out.println();
		
      // 27) 4 8 12 16 20 24 28 32 36 40
		    table = 4;
		    position = 1;
		    do {
				System.out.print( table*position + " ");
				position ++;
			}while(position <=10);
			System.out.println();
        //28) 10 20 30 40 50 60 70 80 90 100
		   	    table = 10;
			    position = 1;
			    do {
					System.out.print( table*position + " ");
					position ++;
				}while(position <=10);
				System.out.println();
		
        //29) 1 2 3 4 5 4 3 2 1
		int dd = 1;
		int te = 4;
		do {
			if(dd <= 5) {
				System.out.print(dd+" ");
			}
			if(dd>5) {
				System.out.print(te+" ");
				te--;
			}
			dd++;
		}while(dd<10);
		System.out.println();
	
        //30) 6 12 18 24 30 36 42 48 54 60
		    
		    table = 6;
		    position = 1;
		    do {
				System.out.print( table*position + " ");
				position ++;
			}while(position <=10);
			System.out.println();

		
		
}

}
