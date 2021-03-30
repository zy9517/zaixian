
public class Test5 {
    public static void main(String[] args) {
        String a = "     ";
        String c = a.trim();
        String substring;
        if (c.length() != 0) {
            char c1 = c.charAt(0);
            int start = a.indexOf(c1);
            int d = a.length() - c.length();
            int end = d - start;
            substring = a.substring(0, a.length() - end);
        }else{
            substring = a;
        }
        String b = "";
        char[] charArray = substring.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (' ' == charArray[i]) {
                b = b + "%20";
            } else {
                b = b + charArray[i];
            }
        }
        System.out.print(b);
    }
}
