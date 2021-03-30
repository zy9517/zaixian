public class Test3 {
    public static void main(String[] args) {
        String a = "sdfg";
        char first = a.charAt(0);
        for (int i = 0; i < a.length(); i++) {
            if (first == a.charAt(i)) {
                System.out.print("false");
            }
        }

    }
}
