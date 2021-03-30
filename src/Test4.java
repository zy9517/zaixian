import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {
        System.out.print(compare());
    }
    private static boolean compare() {
        String s1 = "asvnpzurz";
        String s2 = "urzsapzvn";
        if(s1==null || s2==null) return false;
        char[] s1array = s1.toCharArray();
        char[] s2array = s2.toCharArray();
        Arrays.sort(s1array);
        Arrays.sort(s2array);
        return Arrays.equals(s1array, s2array);
    }
}
