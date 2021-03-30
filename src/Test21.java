import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test21 {
    public static void main(String[] args) {
        String a = "addf";
        sort(a);
    }

    public static void sort(String a) {
        char[] ch = a.toCharArray();
        Arrays.sort(ch);
        List<List<Character>> ls = new ArrayList<>();
        List<Character> list = new ArrayList<>();
        boolean[] used = new boolean[ch.length];
        dsf(ch, 0, ch.length, ls, list, used);
        System.out.print(ls.toString());
    }

    private static void dsf(char[] ch, int deep, int length, List<List<Character>> ls, List<Character> list, boolean[] used) {
        if (deep == length) {
            ls.add(new ArrayList<Character>(list));
            return;
        }
        for (int i = 0; i < length; i++) {
            if (!used[i]) {
                if (i > 0 && ch[i] == ch[i - 1] && !used[i-1]) {
                    continue;
                }
                used[i] = true;
                list.add(ch[i]);
                dsf(ch, deep + 1, length, ls, list, used);
                list.remove(list.size() - 1);
                used[i] = false;
            }
        }
    }
}
