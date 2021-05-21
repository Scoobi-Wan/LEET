
public class Shuffle {
	public int[] shuffle(int[] nums, int n) {
        int[] shuffled = new int[nums.length];
        int i = 0;
        int firstIndex = 0;
        int secondIndex = n;
        while(i < n) {
            shuffled[firstIndex] = nums[i];
            shuffled[firstIndex + 1] = nums[secondIndex];
            firstIndex += 2;
            secondIndex++;
            i++;
        }
        return shuffled;
    }
}
