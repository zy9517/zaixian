import java.util.ArrayList;
import java.util.List;

public class Demo1 {
    public static List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        String a = "123";
        StringBuilder b = new StringBuilder();
        char[] c = a.toCharArray();
        Demo1 demo = new Demo1();
        demo.per(b, 0, c);
        System.out.print(list.toString());
    }

    /**
     *
     * @param b
     * @param deap 当前树的深度
     * @param c
     */
    public void per(StringBuilder b, int deap, char[] c) {
        if (deap == c.length) {
            list.add(b.toString());
            return;
        }
        for (int i = 0; i < c.length; i++) {
            if (b.toString().contains(c[i] + "")) {
                continue;
            }
            b.append(c[i]);
            per(b, deap + 1, c);
            b.deleteCharAt(deap);
        }
    }
}
