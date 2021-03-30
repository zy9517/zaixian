public class Test {
    public static void main(String[] args) {
        int[] abc = {1,2,3,4,5,4,3,2,1};
        int sum = 0;
        for(int n = 0; n < abc.length; n++){
            sum = sum + abc[n];
        }

        for (int i = 0; i < abc.length; i++) {
            int left = 0;
            for (int j = 0; j < i; j++) {
                left = left + abc[j];
            }
            if (sum == left * 2 + abc[i]) {
                System.out.println(i);
                break;
            }
        }
    }
}
