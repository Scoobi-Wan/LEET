import java.util.ArrayList;
import java.util.List;

public class Solution_kidsWithCandies {
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
	    
        List<Boolean> canHaveMostCandy = new ArrayList<Boolean>();
        int mostCandy = candies[0];
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > mostCandy) {
                mostCandy = candies[i];
            }
        } for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= mostCandy) {
                canHaveMostCandy.add(true);
            } else {
                canHaveMostCandy.add(false);
            }
        }
        return canHaveMostCandy;
    }
}
