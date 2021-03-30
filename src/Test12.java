import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test12 {
    public static void main(String[] args) {
        String a = "aadd";
        char[] charArray = a.toCharArray();
        Arrays.sort(charArray);
        List<List<Character>> res = new ArrayList<>();
        dsf(charArray, new boolean[a.length()], 0, new ArrayList<>(),res);
        System.out.print(res);
    }

    public static void dsf(char[] array, boolean[] used, int deap, List<Character> list,List<List<Character>> res) {
        if (deap == array.length) {
            res.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < array.length; i++) {
            if (!used[i]) {
                if (i > 0 && array[i] == array[i - 1] && !used[i - 1]) {
                    continue;
                }
                list.add(array[i]);
                used[i] = true;
                dsf(array, used, deap + 1, list,res);
                list.remove(list.size() - 1);
                used[i] = false;
            }
        }
    }
}
