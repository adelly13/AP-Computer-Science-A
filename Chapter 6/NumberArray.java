public class NumberArray {
    public static void main (String[] args) {
        int[] nums = {8, 2, 9, 7, 3};
        System.out.println("Length" + nums.length);
        System.out.println("First element: " + nums[0]);
        System.out.println("Last element: " + nums[nums.length - 1]);
        System.out.println(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}