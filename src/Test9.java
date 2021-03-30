public class Test9 {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        int i = get(a, b);
        System.out.print(i);
    }
    public static int get(int a, int b){
        if(0 == b){
         return 0;
        }
        return a + get(a,b -1);
    }
}
