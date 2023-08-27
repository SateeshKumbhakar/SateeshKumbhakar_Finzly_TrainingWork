package forexSystem;

import java.util.Scanner;

public class StringAndASCII {
   
    public static String ASCIIConversion(String str) {
        StringBuilder result = new StringBuilder();

        for (int i=0;i<str.length();i++) {
        	char ch = str.charAt(i);
            if (ch != ' ') {
                result.append((int) ch);
            } else {
                result.append(' ');
            }
        }
        return result.toString();
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(ASCIIConversion(s.nextLine()));

    }

}
