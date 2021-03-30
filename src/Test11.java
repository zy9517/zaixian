import java.util.ArrayList;
import java.util.List;

public class Test11 {
    public static List<List<Character>> res = new ArrayList<>();
    public static void main(String[] args) {
        String s = "qwe";
//        int[] a = {1,2,3};
        char[] a = s.toCharArray();
        List<Character> ls = new ArrayList<>();
        List<List<Character>> lists = get(a, ls);
        System.out.print(lists);
    }
    public static List<List<Character>> get(char[] nums, List<Character> ls){
        if(ls.size() == nums.length){
            res.add(new ArrayList<>(ls));
            return res;
        }
        for(int i = 0; i < nums.length; i++){
            if(ls.contains(nums[i])){
                continue;
            }
            ls.add(nums[i]);
            get(nums,ls);
            ls.remove(ls.size() - 1);
        }
        return res;
    }
}
