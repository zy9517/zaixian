public class Test7 {
    public static void main(String[] args) {
        String a = "aasssdffffjjh";
        String b = "";
        char[] charArray = a.toCharArray();
        int count = 1;
        char c = charArray[0];
        for (int i = 1; i < charArray.length; i++) {
            if (charArray[i] == c) {
                count++;
            } else {
                b = b + charArray[i-1] + count;
                count = 1;
                c = charArray[i];
            }
        }
        b = b + charArray[a.length()-1] + count;
        if(b.length() > a.length()){

        }
        System.out.print(b);
    }
}
