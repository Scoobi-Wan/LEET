import java.util.HashMap;

/*
 * Author: Paul Rich
 * Program: LongestSubstring - LC # 3 (Medium)
 * Purpose: Find the longest substring of s with no repeating chars
 */
public class LongestSubstring {
	public int lengthOfLongestSubstring(String s) {
		
		// Map to track chars in substring
		HashMap<Character, Integer> mapper;
		
		// used to hold the value for longest unique substring
		int longestSub = 0;
		
		// Since outer loop checks length - 1, we need to check for strings of length 1
		if (s.length() == 1) {
			return 1;
		}
		
		// outer loop index
		int i = 0;
		
		// Outer loop
		while (i < s.length() - 1) {
			
			// inner loop index
			int j = i + 1;
			
			// initialize the map to a new map for new substring range
			mapper = new HashMap<Character, Integer>();
			
			// add the char at the first index
			mapper.put(s.charAt(i), 1);

			// Inner loop
			while (j < s.length()) {
				
				// Check if the char is already in the substring
				if (mapper.containsKey(s.charAt(j))) {
					break;
				}
				
				// Add the char to the substring map and increment outer index
				mapper.put(s.charAt(j), 1);
				j++;
				
			} // End Inner loop
			
			// Compare the map size (substring length) with the current value in longestSub variable
			if (mapper.size() > longestSub) {
				longestSub = mapper.size();
			}

			i++; // Outer loop increment
			
		} // End Outer loop
		
		return longestSub;
		
	}
}
