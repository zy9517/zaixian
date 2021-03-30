import java.util.ArrayList;
import java.util.List;

public class Test8 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> a = new ArrayList<>();
        a.add(new ArrayList<>());
        for (int num:nums) {
            int size = a.size();
            for(int i = 0;i < size;i++){
                List b = new ArrayList(a.get(i));
                b.add(num);
                a.add(b);
            }
        }
        System.out.print(a);
    }
}
