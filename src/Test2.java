public class Test2 {
    public static void main(String[] args) {
        int a = 1239568;
        int r = 0;
        while(a != 0){
            int n = a%10;
            r = r*10 + n;
            a /= 10;
        }
        System.out.print(r);
    }
}
