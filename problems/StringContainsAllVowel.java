package problems;
import java.util.*;
public class StringContainsAllVowel {

    public static String vowelChecker(String word){
        boolean checker[] =new boolean[5];
        for(int i =0;i<word.length();i++){
            char ch = word.charAt(i);
            switch(ch){
                case 'a':
                    checker[i]=true;
                    break;
                case 'e':
                    checker[i]=true;
                    break;
                case 'i':
                    checker[i]=true;
                    break;
                case 'o':
                    checker[i]=true;
                    break; 
                case 'u':
                    checker[i]=true;
                    break;    
            }
            
        }
        for(boolean  c : checker){
                if(!c)
                 return  word+ " not contains all vowel. ";
            }
        
        return word+" contains....";
        
    }
public static void main(String args[])

{ 
//	System.out.println("Hello");
  
  Scanner sc = new Scanner(System.in);
  String inp = sc.nextLine();
  String word = inp.toLowerCase();
  System.out.println("output is:: "+vowelChecker(word));

}

}
