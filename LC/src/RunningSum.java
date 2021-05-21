
public class RunningSum {
	public int[] runningSum(int[] nums) {
        int[] sumArr = new int[nums.length];
        int runningSum = 0;
        for(int i = 0; i < nums.length; i++) {
            runningSum += nums[i];
            sumArr[i] = runningSum;
        }
        return sumArr;
    }
}
