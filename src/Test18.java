import java.util.Arrays;

public class Test18 {
    public static void main(String[] args) {
        int[] a = {5, 2, 3, 9, 8, 1, 0};
//        sort(a, 0, a.length - 1);
//        sort1(a);
//        sort2(a);
        sort3(a);
        System.out.print(Arrays.toString(a));
    }

    public static void sort(int[] array, int begin, int end) {
        if (begin > end) {
            return;
        }
        int base = array[begin];
        int i = begin;
        int j = end;
        while (i != j) {
            while (j > i && array[j] >= base) {
                j--;
            }
            while (i < j && array[i] <= base) {
                i++;
            }
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        array[begin] = array[i];
        array[i] = base;
        sort(array, begin, i - 1);
        sort(array, i + 1, end);

    }

    public static void sort1(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int x = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > x) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = x;
        }
    }

    public static void sort2(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }

    }

    public static void sort3(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

    }
}
