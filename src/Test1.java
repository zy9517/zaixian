public class Test1 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 4, 6};
        int target = 6;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (target == nums[i] + nums[j] && i != j) {
                    System.out.println("i =" + i + ",j = " + j);
                    break;
                }
            }
        }
    }
}
