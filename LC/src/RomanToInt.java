/*
 * Author: Paul Rich
 * Program: Roman To Integer - LC #13 (Easy)
 */
public class RomanToInt {
	public int romanToInt(String s) {
		
		// holds the sum representing the value of the roman numerals
        int sum = 0;
        
        // loop index
        int i = 0;
        
        // main loop
        while (i < s.length()) {
        	
        	// get the current character from the roman numeral string
            char currChar = s.charAt(i);
            
            // check the current roman numerals value
            if (currChar == 'I') {
            	
            	// check if the string has a following character, and if it effects the current's value
                if (i < s.length() - 1 && s.charAt(i + 1) == 'V') {
                    sum += 4;
                    i += 2;
                } else if (i < s.length() - 1 && s.charAt(i + 1)== 'X') {
                    sum += 9;
                    i += 2;
                } else {
                    sum += 1;
                    i += 1;
                }
            } else if (currChar == 'V') {
                sum += 5;
                i += 1;
            } else if (currChar == 'X') {
                if (i < s.length() - 1 && s.charAt(i + 1) == 'L') {
                    sum += 40;
                    i += 2;
                } else if ( i < s.length() - 1 && s.charAt(i + 1) == 'C') {
                    sum += 90;
                    i += 2;
                } else {
                    sum += 10;
                    i += 1;
                }
            } else if (currChar == 'L') {
                sum += 50;
                i += 1;
            } else if (currChar == 'C') {
                if (i < s.length() - 1 && s.charAt(i + 1) == 'D') {
                    sum += 400;
                    i += 2;
                } else if (i < s.length() - 1 && s.charAt(i + 1) == 'M') {
                    sum += 900;
                    i += 2;
                } else {
                    sum += 100;
                    i += 1;
                }
            } else if (currChar == 'D') {
                sum += 500;
                i += 1;
            } else if (currChar == 'M') {
                sum += 1000;
                i += 1;
            }
        }
        return sum;
    }
}
