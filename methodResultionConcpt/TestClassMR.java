package methodResultionConcpt;

public class TestClassMR {
	void showData(String str){
		System.out.println("Hello From String param");
		
	}
	
	void showData(Object obj){
		System.out.println("Hello From Object param");
		
	}
 
	public static void main(String[] args) {
		TestClassMR test = new TestClassMR();
	     test.showData(null); //Hello From String param
	     test.showData(test); // Hello From String param
	     test.showData((Object)null);
	     Object o = null;
	     test.showData(o);
 	     
		
	}
}
