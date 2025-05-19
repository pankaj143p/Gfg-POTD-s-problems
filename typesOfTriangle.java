class Solution {
    public String triangleType(int[] nums) {
        // if(nums[0]==nums[1] && nums[1]==nums[2] && nums)
           if (nums == null || nums.length != 3) {
            return "none";
        }

        // Sort the array in ascending order
        Arrays.sort(nums);

        // Check the type of triangle
        if (nums[0] + nums[1] > nums[2]) {
            if (nums[0] == nums[1] && nums[1] == nums[2]) {
                return "equilateral";
            } else if (nums[0] == nums[1] || nums[1] == nums[2]) {
                return "isosceles";
            } else {
                return "scalene";
            }
        } else {
            return "none";
        }
    }
}
