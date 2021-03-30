import java.util.Arrays;

public class Test17 {
    public static void main(String[] args) {
        int[] a = {5, 8, 1, 2, 9, 0, 10, 4};
        //sort(a);
        //sort1(a);
        //sort2(a);
        sort3(a,0,a.length-1);
        System.out.print(Arrays.toString(a));
    }

    /**
     * 冒泡排序
     *
     * @param a 待排序数组
     */
    public static void sort(int[] a) {
        // 冒泡的次数
        for (int i = 1; i < a.length; i++) {
            // 比较相邻两个元素的大小，将每次冒泡中最大的数，放在未排序的最末端
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    /**
     * 选择排序
     *
     * @param a 待排序数组
     */
    public static void sort1(int[] a) {
        // 每次循环选择一个元素设为最小值(从首位开始)，循环遍历其他元素与之比较，找出本次循环的最小值，放在首位。
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            // 选出每次循环的最小值
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            // 将最小值放到未排序部分的首位
            if (min != i) {
                int temp = a[i];
                a[i] = a[min];
                a[min] = temp;
            }
        }
    }

    /**
     * 插入排序
     *
     * @param a 待排序数组
     */
    public static void sort2(int[] a) {
        // 拿出一个将要插入元素，留下一个坑位，从第二个元素开始
        for (int i = 1; i < a.length; i++) {
            int x = a[i];
            int j = i - 1;
            // 将带插入元素与其左侧部分元素逐一比较，直到找到比他小的元素a为止，将元素插入到a的前面
            while (j >= 0 && a[j] > x) {
                // 将a[j]右移，填补空出的坑位
                a[j + 1] = a[j];
                j--;
            }
            // 找到比他小的元素a，将元素插入到a的前面
            a[j + 1] = x;
        }
    }

    public static void sort3(int[] array, int begin, int end) {
        if (begin > end) {
            return;
        }
        // 选取数组第一个元素为基准值
        int base = array[begin];
        // 设置左右两端的起始值
        int i = begin, j = end;
        // 左右两端重合时停止，此时i=j,i的左侧元素全部小于基准值，右侧元素全部大于基准值
        while (i != j) {
            // 从右向左遍历，找出右侧小于基准值的元素
            while (j > i && array[j] >= base) {
                j--;
            }
            // 从左向右遍历，找出左侧大于基准值的元素
            while (j > i && array[i] <= base) {
                i++;
            }
            // 交换上面两个循环找出的，不符合条件的元素位置，使其满足左侧小于基准值，右侧大于基准值
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        // 将首位元素（基准值）与i位置元素交换
        // 将i位置元素放在首位
        array[begin] = array[i];
        // 将基准值放在i位置
        array[i] = base;
        // 对基准值左侧部分排序
        sort3(array, begin, i - 1);
        // 对基准值右侧部分排序
        sort3(array, i + 1, end);
    }
}
