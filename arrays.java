import java.util.HashMap;
import java.util.Map;

public class arrays {
    public static int findMajorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> countMap = new HashMap<>();

        // Count the occurrences of each element
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Find the element that appears more than n/2 times
        for (int num : countMap.keySet()) {
            if (countMap.get(num) > n / 2) {
                return num;
            }
        }

        return -1; // No majority element found
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 5, 5, 5, 5, 5};
        int majorityElement = findMajorityElement(nums);
        System.out.println(majorityElement);
    }
}