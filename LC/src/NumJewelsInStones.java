
public class NumJewelsInStones {
	public int numJewelsInStones(String jewels, String stones) {
        int numOfStoneJewels = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (jewels.contains(String.valueOf(stones.charAt(i)))) {
                numOfStoneJewels++;
            }
         } return numOfStoneJewels;
    }
}
